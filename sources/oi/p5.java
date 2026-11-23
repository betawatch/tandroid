package oi;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import c8.ma;
import org.telegram.messenger.cz;
import org.telegram.messenger.j6;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.h6;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes4.dex */
public final class p5 extends FrameLayout {
    public final f1 a;
    public TL_iv.pageTableCell b;

    public p5(Context context, h6 h6Var) {
        super(context);
        f1 f1Var = new f1(context, h6Var);
        this.a = f1Var;
        f1Var.setTextSize(1, Math.max(8, cz.W0 - 2));
        f1Var.setAllowNewlines(true);
        setCompact(false);
        addView(f1Var, ma.e(-1, -2, 51));
    }

    public final void a() {
        f1 f1Var = this.a;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) f1Var.getLayoutParams();
        TL_iv.pageTableCell pagetablecell = this.b;
        int i7 = pagetablecell.align_right ? 5 : pagetablecell.align_center ? 1 : 3;
        layoutParams.gravity = pagetablecell.valign_middle ? i7 | 16 : pagetablecell.valign_bottom ? i7 | 80 : i7 | 48;
        f1Var.setLayoutParams(layoutParams);
        TL_iv.pageTableCell pagetablecell2 = this.b;
        f1Var.setGravity(pagetablecell2.align_right ? 53 : pagetablecell2.align_center ? 49 : 51);
        f1Var.setTypeface(null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x001e, code lost:
    
        if ((oi.c6.q(0, r0.length(), r0) & 1) == 0) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(TL_iv.pageTableCell pagetablecell) {
        boolean z10;
        this.b = pagetablecell;
        a();
        CharSequence h = e6.h(pagetablecell);
        if (pagetablecell.header) {
            z10 = true;
            if (h.length() != 0) {
            }
            f1 f1Var = this.a;
            f1Var.setAutoBold(z10);
            f1Var.setTextSilently(j6.m(h, f1Var.getPaint().getFontMetricsInt(), false, null, 0));
            f1Var.f();
        }
        z10 = false;
        f1 f1Var2 = this.a;
        f1Var2.setAutoBold(z10);
        f1Var2.setTextSilently(j6.m(h, f1Var2.getPaint().getFontMetricsInt(), false, null, 0));
        f1Var2.f();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        f1 f1Var = this.a;
        if (f1Var.getVisibility() == 0 && motionEvent.getActionMasked() != 3) {
            float x10 = motionEvent.getX();
            float y10 = motionEvent.getY();
            boolean z10 = x10 >= ((float) f1Var.getLeft()) && x10 < ((float) f1Var.getRight());
            boolean z11 = y10 < ((float) f1Var.getTop()) || y10 >= ((float) f1Var.getBottom());
            if (z10 && z11 && f1Var.getHeight() > 0) {
                float max = Math.max(0.0f, Math.min(y10 - f1Var.getTop(), f1Var.getHeight() - 1));
                MotionEvent obtain = MotionEvent.obtain(motionEvent);
                obtain.setLocation(x10 - f1Var.getLeft(), max);
                boolean onTouchEvent = f1Var.onTouchEvent(obtain);
                obtain.recycle();
                return onTouchEvent;
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public void setCompact(boolean z10) {
        f1 f1Var = this.a;
        if (z10) {
            f1Var.setPadding(org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(5.0f));
            f1Var.setMinHeight(org.telegram.messenger.g0.L(18.0f));
        } else {
            f1Var.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(9.0f));
            f1Var.setMinHeight(org.telegram.messenger.g0.L(36.0f));
        }
    }

    public void setLocked(boolean z10) {
        this.a.setLocked(z10);
    }
}
