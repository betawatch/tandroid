package fi;

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
import org.telegram.messenger.wl;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.pr;
import w7.x5;
import w7.z5;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes4.dex */
public abstract class p0 extends LinearLayout implements qh.a, le.k {
    public final f6 a;
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
    public final le.l x;

    public p0(Context context, f6 f6Var) {
        super(context);
        this.n = new ArrayList();
        this.v = new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, null);
        this.x = new le.l(this, pr.h, 320L);
        this.a = f6Var;
        setOrientation(1);
        ScrollView scrollView = new ScrollView(context);
        this.r = scrollView;
        scrollView.setClipToPadding(false);
        addView(scrollView);
        FrameLayout frameLayout = new FrameLayout(context);
        this.b = frameLayout;
        scrollView.addView(frameLayout);
        d();
    }

    @Override // qh.a
    public final void a(int i10) {
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

    public final void d() {
        AndroidUtilities.setScrollViewEdgeEffectColor(this.r, j6.v0(j6.He, this.a));
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

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        float navigationBarThirdButtonsFactor = AndroidUtilities.getNavigationBarThirdButtonsFactor(this.s);
        if (navigationBarThirdButtonsFactor > 0.0f) {
            int l1 = j6.l1(navigationBarThirdButtonsFactor, j6.v0(j6.He, this.a));
            int i10 = this.w;
            GradientDrawable gradientDrawable = this.v;
            if (i10 != l1) {
                gradientDrawable.setColors(new int[]{l1, j6.l1(0.66f, l1), i0.a.k(l1, 0)});
                this.w = l1;
            }
            gradientDrawable.setBounds(0, getMeasuredHeight() - this.s, getMeasuredWidth(), getMeasuredHeight());
            gradientDrawable.draw(canvas);
        }
    }

    @Override // le.k
    public final void e(le.l lVar) {
        Iterator it = this.x.iterator();
        while (it.hasNext()) {
            le.g gVar = (le.g) it.next();
            float c10 = gVar.c();
            Object obj = gVar.a;
            float lerp = AndroidUtilities.lerp(0.7f, 1.0f, c10);
            ((o0) obj).setAlpha(c10);
            ((o0) obj).setScaleX(lerp);
            ((o0) obj).setScaleY(lerp);
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
        return org.telegram.messenger.w1.D(4.0f, this.c.rows.size() - 1, AndroidUtilities.dp(16.0f) + (AndroidUtilities.dp(this.h) * tL_replyKeyboardMarkup.rows.size()));
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
        le.l lVar = this.x;
        Iterator it = lVar.iterator();
        while (it.hasNext()) {
            o0 o0Var = (o0) ((le.g) it.next()).a;
            o0Var.setTranslationY(o0Var.getTranslationY() - scrollY);
        }
        int i10 = 0;
        scrollView.scrollTo(0, 0);
        if (tL_replyKeyboardMarkup == null || this.c.rows.isEmpty()) {
            lVar.a.r(null, true);
            return;
        }
        o0 o0Var2 = new o0(getContext());
        o0Var2.setOrientation(1);
        o0Var2.setAlpha(0.0f);
        this.b.addView(o0Var2);
        boolean z10 = tL_replyKeyboardMarkup.resize;
        this.f = !z10;
        this.h = z10 ? 44 : (int) Math.max(44.0f, (wl.A(4.0f, this.c.rows.size() - 1, this.e - AndroidUtilities.dp(16.0f)) / this.c.rows.size()) / AndroidUtilities.density);
        int i11 = 0;
        while (i11 < tL_replyKeyboardMarkup.rows.size()) {
            TL_keyboard.KeyboardButtonRow keyboardButtonRow = tL_replyKeyboardMarkup.rows.get(i11);
            LinearLayout linearLayout = new LinearLayout(getContext());
            linearLayout.setOrientation(i10);
            o0Var2.addView(linearLayout, x5.k(8.0f, i11 == 0 ? 8.0f : 4.0f, 8.0f, i11 == tL_replyKeyboardMarkup.rows.size() - 1 ? 8.0f : 0.0f, -1, this.h));
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
                frameLayout.addView(n0Var, x5.c(-1.0f, -1));
                linearLayout.addView(frameLayout, x5.m(size, 0, -1, 0, i12 != keyboardButtonRow.buttons.size() - 1 ? 4 : 0, 0));
                n0Var.setOnClickListener(new ah.h0(this, 16));
                z5.b(n0Var, 0.02f, 1.5f);
                arrayList.add(n0Var);
                n0Var.a();
                i12++;
            }
            i11++;
            i10 = 0;
        }
        lVar.i(o0Var2, true);
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
        int max = !this.f ? 44 : (int) Math.max(44.0f, (wl.A(4.0f, this.c.rows.size() - 1, this.e - AndroidUtilities.dp(16.0f)) / this.c.rows.size()) / AndroidUtilities.density);
        this.h = max;
        int dp = AndroidUtilities.dp(max);
        Iterator it = this.x.iterator();
        while (it.hasNext()) {
            le.g gVar = (le.g) it.next();
            int childCount = ((o0) gVar.a).getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = ((o0) gVar.a).getChildAt(i11);
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
                if (layoutParams.height != dp) {
                    layoutParams.height = dp;
                    childAt.setLayoutParams(layoutParams);
                }
            }
        }
    }

    @Override // le.k
    public final /* synthetic */ void c() {
    }

    @Override // qh.a
    public final void b(float f7) {
    }
}
