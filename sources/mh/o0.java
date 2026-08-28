package mh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import g7.e6;
import g7.g6;
import java.util.ArrayList;
import java.util.Iterator;
import kh.x8;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ll;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.gr;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public abstract class o0 extends LinearLayout implements xg.a, td.i {
    public final b6 a;
    public final FrameLayout b;
    public TLRPC.TL_replyKeyboardMarkup c;
    public l0 d;
    public int e;
    public boolean f;
    public int h;
    public final ArrayList n;
    public final ScrollView r;
    public int s;
    public final GradientDrawable v;
    public int w;
    public final td.j x;

    public o0(Context context, b6 b6Var) {
        super(context);
        this.n = new ArrayList();
        this.v = new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, null);
        this.x = new td.j(this, gr.h, 320L);
        this.a = b6Var;
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

    @Override // xg.a
    public final void a(int i9) {
        if (this.s == i9) {
            return;
        }
        this.s = i9;
        ScrollView scrollView = this.r;
        if (scrollView.getPaddingBottom() != i9) {
            scrollView.setPadding(0, 0, 0, i9);
        }
        invalidate();
    }

    @Override // td.i
    public final void c(td.j jVar) {
        Iterator it = this.x.iterator();
        while (it.hasNext()) {
            td.e eVar = (td.e) it.next();
            float c10 = eVar.c();
            Object obj = eVar.a;
            float lerp = AndroidUtilities.lerp(0.7f, 1.0f, c10);
            ((n0) obj).setAlpha(c10);
            ((n0) obj).setScaleX(lerp);
            ((n0) obj).setScaleY(lerp);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        float navigationBarThirdButtonsFactor = AndroidUtilities.getNavigationBarThirdButtonsFactor(this.s);
        if (navigationBarThirdButtonsFactor > 0.0f) {
            int l1 = f6.l1(navigationBarThirdButtonsFactor, f6.v0(f6.He, this.a));
            int i9 = this.w;
            GradientDrawable gradientDrawable = this.v;
            if (i9 != l1) {
                gradientDrawable.setColors(new int[]{l1, f6.l1(0.66f, l1), i0.a.k(l1, 0)});
                this.w = l1;
            }
            gradientDrawable.setBounds(0, getMeasuredHeight() - this.s, getMeasuredWidth(), getMeasuredHeight());
            gradientDrawable.draw(canvas);
        }
    }

    public final void e() {
        AndroidUtilities.setScrollViewEdgeEffectColor(this.r, f6.v0(f6.He, this.a));
        int i9 = 0;
        while (true) {
            ArrayList arrayList = this.n;
            if (i9 >= arrayList.size()) {
                invalidate();
                return;
            } else {
                ((m0) arrayList.get(i9)).a();
                i9++;
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
        return org.telegram.messenger.l0.D(4.0f, this.c.rows.size() - 1, AndroidUtilities.dp(16.0f) + (AndroidUtilities.dp(this.h) * tL_replyKeyboardMarkup.rows.size()));
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
            } catch (Throwable th) {
                throw new RuntimeException(th);
            }
        }
        this.c = tL_replyKeyboardMarkup;
        ArrayList arrayList = this.n;
        arrayList.clear();
        ScrollView scrollView = this.r;
        float scrollY = scrollView.getScrollY();
        td.j jVar = this.x;
        Iterator it = jVar.iterator();
        while (it.hasNext()) {
            n0 n0Var = (n0) ((td.e) it.next()).a;
            n0Var.setTranslationY(n0Var.getTranslationY() - scrollY);
        }
        int i9 = 0;
        scrollView.scrollTo(0, 0);
        if (tL_replyKeyboardMarkup == null || this.c.rows.isEmpty()) {
            jVar.a.r(null, true);
            return;
        }
        n0 n0Var2 = new n0(getContext());
        n0Var2.setOrientation(1);
        n0Var2.setAlpha(0.0f);
        this.b.addView(n0Var2);
        boolean z10 = tL_replyKeyboardMarkup.resize;
        this.f = !z10;
        this.h = z10 ? 44 : (int) Math.max(44.0f, (ll.A(4.0f, this.c.rows.size() - 1, this.e - AndroidUtilities.dp(16.0f)) / this.c.rows.size()) / AndroidUtilities.density);
        int i10 = 0;
        while (i10 < tL_replyKeyboardMarkup.rows.size()) {
            TL_keyboard.KeyboardButtonRow keyboardButtonRow = tL_replyKeyboardMarkup.rows.get(i10);
            LinearLayout linearLayout = new LinearLayout(getContext());
            linearLayout.setOrientation(i9);
            n0Var2.addView(linearLayout, e6.k(8.0f, i10 == 0 ? 8.0f : 4.0f, 8.0f, i10 == tL_replyKeyboardMarkup.rows.size() - 1 ? 8.0f : 0.0f, -1, this.h));
            float size = 1.0f / keyboardButtonRow.buttons.size();
            int i11 = 0;
            while (i11 < keyboardButtonRow.buttons.size()) {
                m0 m0Var = new m0(this, getContext(), keyboardButtonRow.buttons.get(i11));
                boolean z11 = i11 == 0;
                boolean z12 = i10 == 0;
                boolean z13 = i11 == keyboardButtonRow.buttons.size() - 1;
                boolean z14 = i10 == tL_replyKeyboardMarkup.rows.size() - 1;
                m0Var.d = z11;
                m0Var.e = z12;
                m0Var.f = z13;
                m0Var.h = z14;
                m0Var.a();
                FrameLayout frameLayout = new FrameLayout(getContext());
                frameLayout.addView(m0Var, e6.c(-1.0f, -1));
                linearLayout.addView(frameLayout, e6.m(size, 0, -1, 0, i11 != keyboardButtonRow.buttons.size() - 1 ? 4 : 0, 0));
                m0Var.setOnClickListener(new x8(this, 3));
                g6.b(m0Var, 0.02f, 1.5f);
                arrayList.add(m0Var);
                m0Var.a();
                i11++;
            }
            i10++;
            i9 = 0;
        }
        jVar.i(n0Var2, true);
    }

    public void setDelegate(l0 l0Var) {
        this.d = l0Var;
    }

    public void setPanelHeight(int i9) {
        TLRPC.TL_replyKeyboardMarkup tL_replyKeyboardMarkup;
        this.e = i9;
        if (!this.f || (tL_replyKeyboardMarkup = this.c) == null || tL_replyKeyboardMarkup.rows.isEmpty()) {
            return;
        }
        int max = !this.f ? 44 : (int) Math.max(44.0f, (ll.A(4.0f, this.c.rows.size() - 1, this.e - AndroidUtilities.dp(16.0f)) / this.c.rows.size()) / AndroidUtilities.density);
        this.h = max;
        int dp = AndroidUtilities.dp(max);
        Iterator it = this.x.iterator();
        while (it.hasNext()) {
            td.e eVar = (td.e) it.next();
            int childCount = ((n0) eVar.a).getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = ((n0) eVar.a).getChildAt(i10);
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
                if (layoutParams.height != dp) {
                    layoutParams.height = dp;
                    childAt.setLayoutParams(layoutParams);
                }
            }
        }
    }

    @Override // td.i
    public final /* synthetic */ void b() {
    }

    @Override // xg.a
    public final void d(float f10) {
    }
}
