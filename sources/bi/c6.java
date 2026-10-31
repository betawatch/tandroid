package bi;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import org.telegram.messenger.tz;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes4.dex */
public final class c6 extends FrameLayout {
    public final n1 a;
    public TL_iv.pageTableCell b;

    public c6(Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context);
        n1 n1Var = new n1(context, p6Var);
        this.a = n1Var;
        n1Var.setTextSize(1, Math.max(8, tz.W0 - 2));
        n1Var.setAllowNewlines(true);
        setCompact(false);
        addView(n1Var, w7.b6.e(-1, -2, 51));
    }

    public final void a() {
        n1 n1Var = this.a;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) n1Var.getLayoutParams();
        TL_iv.pageTableCell pagetablecell = this.b;
        int i10 = pagetablecell.align_right ? 5 : pagetablecell.align_center ? 1 : 3;
        layoutParams.gravity = pagetablecell.valign_middle ? i10 | 16 : pagetablecell.valign_bottom ? i10 | 80 : i10 | 48;
        n1Var.setLayoutParams(layoutParams);
        TL_iv.pageTableCell pagetablecell2 = this.b;
        n1Var.setGravity(pagetablecell2.align_right ? 53 : pagetablecell2.align_center ? 49 : 51);
        n1Var.setTypeface(null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x001e, code lost:
    
        if ((bi.s6.q(0, r0.length(), r0) & 1) == 0) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(TL_iv.pageTableCell pagetablecell) {
        boolean z10;
        this.b = pagetablecell;
        a();
        CharSequence h = w6.h(pagetablecell);
        if (pagetablecell.header) {
            z10 = true;
            if (h.length() != 0) {
            }
            n1 n1Var = this.a;
            n1Var.setAutoBold(z10);
            n1Var.setTextSilently(org.telegram.messenger.k6.m(h, n1Var.getPaint().getFontMetricsInt(), false, null, 0));
            n1Var.f();
        }
        z10 = false;
        n1 n1Var2 = this.a;
        n1Var2.setAutoBold(z10);
        n1Var2.setTextSilently(org.telegram.messenger.k6.m(h, n1Var2.getPaint().getFontMetricsInt(), false, null, 0));
        n1Var2.f();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        n1 n1Var = this.a;
        if (n1Var.getVisibility() == 0 && motionEvent.getActionMasked() != 3) {
            float x10 = motionEvent.getX();
            float y3 = motionEvent.getY();
            boolean z10 = x10 >= ((float) n1Var.getLeft()) && x10 < ((float) n1Var.getRight());
            boolean z11 = y3 < ((float) n1Var.getTop()) || y3 >= ((float) n1Var.getBottom());
            if (z10 && z11 && n1Var.getHeight() > 0) {
                float max = Math.max(0.0f, Math.min(y3 - n1Var.getTop(), n1Var.getHeight() - 1));
                MotionEvent obtain = MotionEvent.obtain(motionEvent);
                obtain.setLocation(x10 - n1Var.getLeft(), max);
                boolean onTouchEvent = n1Var.onTouchEvent(obtain);
                obtain.recycle();
                return onTouchEvent;
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public void setCompact(boolean z10) {
        n1 n1Var = this.a;
        if (z10) {
            n1Var.setPadding(org.telegram.messenger.i0.L(5.0f), org.telegram.messenger.i0.L(5.0f), org.telegram.messenger.i0.L(5.0f), org.telegram.messenger.i0.L(5.0f));
            n1Var.setMinHeight(org.telegram.messenger.i0.L(18.0f));
        } else {
            n1Var.setPadding(org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(9.0f));
            n1Var.setMinHeight(org.telegram.messenger.i0.L(36.0f));
        }
    }

    public void setLocked(boolean z10) {
        this.a.setLocked(z10);
    }
}
