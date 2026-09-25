package ei;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import java.util.ArrayList;
import java.util.Iterator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ok;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.rr;
import w7.a6;
import w7.y5;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes4.dex */
public abstract class p0 extends LinearLayout implements ph.a, le.l {
    public final d6 a;
    public final FrameLayout b;
    public TLRPC.TL_replyKeyboardMarkup c;
    public m0 d;
    public int e;
    public boolean f;
    public int h;
    public final ArrayList n;
    public final ScrollView r;
    public int s;
    public final GradientDrawable v;
    public int w;
    public final le.m x;

    public p0(Context context, d6 d6Var) {
        super(context);
        this.n = new ArrayList();
        this.v = new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, null);
        this.x = new le.m(this, rr.h, 320L);
        this.a = d6Var;
        setOrientation(1);
        ScrollView scrollView = new ScrollView(context);
        this.r = scrollView;
        scrollView.setClipToPadding(false);
        addView(scrollView);
        FrameLayout frameLayout = new FrameLayout(context);
        this.b = frameLayout;
        scrollView.addView(frameLayout);
        e();
    }

    @Override // ph.a
    public final void b(int i10) {
        if (this.s == i10) {
            return;
        }
        this.s = i10;
        ScrollView scrollView = this.r;
        if (scrollView.getPaddingBottom() != i10) {
            scrollView.setPadding(0, 0, 0, i10);
        }
        invalidate();
    }

    @Override // le.l
    public final void c(le.m mVar) {
        Iterator it = this.x.iterator();
        while (it.hasNext()) {
            le.h hVar = (le.h) it.next();
            float c10 = hVar.c();
            Object obj = hVar.a;
            float lerp = AndroidUtilities.lerp(0.7f, 1.0f, c10);
            ((o0) obj).setAlpha(c10);
            ((o0) obj).setScaleX(lerp);
            ((o0) obj).setScaleY(lerp);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        float navigationBarThirdButtonsFactor = AndroidUtilities.getNavigationBarThirdButtonsFactor(this.s);
        if (navigationBarThirdButtonsFactor > 0.0f) {
            int l1 = h6.l1(navigationBarThirdButtonsFactor, h6.v0(h6.He, this.a));
            int i10 = this.w;
            GradientDrawable gradientDrawable = this.v;
            if (i10 != l1) {
                gradientDrawable.setColors(new int[]{l1, h6.l1(0.66f, l1), i0.a.k(l1, 0)});
                this.w = l1;
            }
            gradientDrawable.setBounds(0, getMeasuredHeight() - this.s, getMeasuredWidth(), getMeasuredHeight());
            gradientDrawable.draw(canvas);
        }
    }

    public final void e() {
        AndroidUtilities.setScrollViewEdgeEffectColor(this.r, h6.v0(h6.He, this.a));
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.n;
            if (i10 >= arrayList.size()) {
                invalidate();
                return;
            } else {
                ((n0) arrayList.get(i10)).a();
                i10++;
            }
        }
    }

    public int getKeyboardHeight() {
        TLRPC.TL_replyKeyboardMarkup tL_replyKeyboardMarkup = this.c;
        if (tL_replyKeyboardMarkup == null) {
            return 0;
        }
        if (this.f) {
            return this.e;
        }
        return org.telegram.messenger.f0.D(4.0f, this.c.rows.size() - 1, AndroidUtilities.dp(16.0f) + (AndroidUtilities.dp(this.h) * tL_replyKeyboardMarkup.rows.size()));
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0046, code lost:
    
        if (r4 <= 0) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0050, code lost:
    
        if (r6.readByte(true) == r7.readByte(true)) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0053, code lost:
    
        r4 = r4 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:?, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void setButtons(TLRPC.TL_replyKeyboardMarkup tL_replyKeyboardMarkup) {
        int objectSize;
        int objectSize2;
        TLRPC.TL_replyKeyboardMarkup tL_replyKeyboardMarkup2 = this.c;
        if (tL_replyKeyboardMarkup == tL_replyKeyboardMarkup2) {
            return;
        }
        if (tL_replyKeyboardMarkup != null && tL_replyKeyboardMarkup2 != null && (objectSize = tL_replyKeyboardMarkup.getObjectSize()) == (objectSize2 = tL_replyKeyboardMarkup2.getObjectSize())) {
            try {
                NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(objectSize);
                tL_replyKeyboardMarkup.serializeToStream(nativeByteBuffer);
                nativeByteBuffer.rewind();
                NativeByteBuffer nativeByteBuffer2 = new NativeByteBuffer(objectSize2);
                tL_replyKeyboardMarkup2.serializeToStream(nativeByteBuffer2);
                nativeByteBuffer2.rewind();
                while (true) {
                    if (objectSize < 8) {
                        break;
                    } else if (nativeByteBuffer.readInt64(true) != nativeByteBuffer2.readInt64(true)) {
                        break;
                    } else {
                        objectSize -= 8;
                    }
                }
            } catch (Throwable th2) {
                throw new RuntimeException(th2);
            }
        }
        this.c = tL_replyKeyboardMarkup;
        ArrayList arrayList = this.n;
        arrayList.clear();
        ScrollView scrollView = this.r;
        float scrollY = scrollView.getScrollY();
        le.m mVar = this.x;
        Iterator it = mVar.iterator();
        while (it.hasNext()) {
            o0 o0Var = (o0) ((le.h) it.next()).a;
            o0Var.setTranslationY(o0Var.getTranslationY() - scrollY);
        }
        int i10 = 0;
        scrollView.scrollTo(0, 0);
        if (tL_replyKeyboardMarkup == null || this.c.rows.isEmpty()) {
            mVar.a.r(null, true);
            return;
        }
        o0 o0Var2 = new o0(getContext());
        o0Var2.setOrientation(1);
        o0Var2.setAlpha(0.0f);
        this.b.addView(o0Var2);
        boolean z10 = tL_replyKeyboardMarkup.resize;
        this.f = !z10;
        this.h = z10 ? 44 : (int) Math.max(44.0f, (ok.B(4.0f, this.c.rows.size() - 1, this.e - AndroidUtilities.dp(16.0f)) / this.c.rows.size()) / AndroidUtilities.density);
        int i11 = 0;
        while (i11 < tL_replyKeyboardMarkup.rows.size()) {
            TL_keyboard.KeyboardButtonRow keyboardButtonRow = tL_replyKeyboardMarkup.rows.get(i11);
            LinearLayout linearLayout = new LinearLayout(getContext());
            linearLayout.setOrientation(i10);
            o0Var2.addView(linearLayout, y5.k(8.0f, i11 == 0 ? 8.0f : 4.0f, 8.0f, i11 == tL_replyKeyboardMarkup.rows.size() - 1 ? 8.0f : 0.0f, -1, this.h));
            float size = 1.0f / keyboardButtonRow.buttons.size();
            int i12 = 0;
            while (i12 < keyboardButtonRow.buttons.size()) {
                n0 n0Var = new n0(this, getContext(), keyboardButtonRow.buttons.get(i12));
                boolean z11 = i12 == 0;
                boolean z12 = i11 == 0;
                boolean z13 = i12 == keyboardButtonRow.buttons.size() - 1;
                boolean z14 = i11 == tL_replyKeyboardMarkup.rows.size() - 1;
                n0Var.d = z11;
                n0Var.e = z12;
                n0Var.f = z13;
                n0Var.h = z14;
                n0Var.a();
                FrameLayout frameLayout = new FrameLayout(getContext());
                frameLayout.addView(n0Var, y5.c(-1.0f, -1));
                linearLayout.addView(frameLayout, y5.m(size, 0, -1, 0, i12 != keyboardButtonRow.buttons.size() - 1 ? 4 : 0, 0));
                n0Var.setOnClickListener(new ai.v0(this, 15));
                a6.b(n0Var, 0.02f, 1.5f);
                arrayList.add(n0Var);
                n0Var.a();
                i12++;
            }
            i11++;
            i10 = 0;
        }
        mVar.i(o0Var2, true);
    }

    public void setDelegate(m0 m0Var) {
        this.d = m0Var;
    }

    public void setPanelHeight(int i10) {
        TLRPC.TL_replyKeyboardMarkup tL_replyKeyboardMarkup;
        this.e = i10;
        if (!this.f || (tL_replyKeyboardMarkup = this.c) == null || tL_replyKeyboardMarkup.rows.isEmpty()) {
            return;
        }
        int max = !this.f ? 44 : (int) Math.max(44.0f, (ok.B(4.0f, this.c.rows.size() - 1, this.e - AndroidUtilities.dp(16.0f)) / this.c.rows.size()) / AndroidUtilities.density);
        this.h = max;
        int dp = AndroidUtilities.dp(max);
        Iterator it = this.x.iterator();
        while (it.hasNext()) {
            le.h hVar = (le.h) it.next();
            int childCount = ((o0) hVar.a).getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = ((o0) hVar.a).getChildAt(i11);
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
                if (layoutParams.height != dp) {
                    layoutParams.height = dp;
                    childAt.setLayoutParams(layoutParams);
                }
            }
        }
    }

    @Override // ph.a
    public final void d(float f7) {
    }

    @Override // le.l
    public final /* synthetic */ void a() {
    }
}
