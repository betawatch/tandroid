package mi;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import b8.mf;
import org.telegram.messenger.az;
import org.telegram.messenger.i6;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes4.dex */
public final class q5 extends FrameLayout {
    public final h1 a;
    public TL_iv.pageTableCell b;

    public q5(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        h1 h1Var = new h1(context, e6Var);
        this.a = h1Var;
        h1Var.setTextSize(1, Math.max(8, az.W0 - 2));
        h1Var.setAllowNewlines(true);
        setCompact(false);
        addView(h1Var, mf.e(-1, -2, 51));
    }

    public final void a() {
        h1 h1Var = this.a;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) h1Var.getLayoutParams();
        TL_iv.pageTableCell pagetablecell = this.b;
        int i3 = pagetablecell.align_right ? 5 : pagetablecell.align_center ? 1 : 3;
        layoutParams.gravity = pagetablecell.valign_middle ? i3 | 16 : pagetablecell.valign_bottom ? i3 | 80 : i3 | 48;
        h1Var.setLayoutParams(layoutParams);
        TL_iv.pageTableCell pagetablecell2 = this.b;
        h1Var.setGravity(pagetablecell2.align_right ? 53 : pagetablecell2.align_center ? 49 : 51);
        h1Var.setTypeface(null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x001e, code lost:
    
        if ((mi.d6.q(0, r0.length(), r0) & 1) == 0) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(TL_iv.pageTableCell pagetablecell) {
        boolean z10;
        this.b = pagetablecell;
        a();
        CharSequence h = f6.h(pagetablecell);
        if (pagetablecell.header) {
            z10 = true;
            if (h.length() != 0) {
            }
            h1 h1Var = this.a;
            h1Var.setAutoBold(z10);
            h1Var.setTextSilently(i6.m(h, h1Var.getPaint().getFontMetricsInt(), false, null, 0));
            h1Var.f();
        }
        z10 = false;
        h1 h1Var2 = this.a;
        h1Var2.setAutoBold(z10);
        h1Var2.setTextSilently(i6.m(h, h1Var2.getPaint().getFontMetricsInt(), false, null, 0));
        h1Var2.f();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        h1 h1Var = this.a;
        if (h1Var.getVisibility() == 0 && motionEvent.getActionMasked() != 3) {
            float x10 = motionEvent.getX();
            float y9 = motionEvent.getY();
            boolean z10 = x10 >= ((float) h1Var.getLeft()) && x10 < ((float) h1Var.getRight());
            boolean z11 = y9 < ((float) h1Var.getTop()) || y9 >= ((float) h1Var.getBottom());
            if (z10 && z11 && h1Var.getHeight() > 0) {
                float max = Math.max(0.0f, Math.min(y9 - h1Var.getTop(), h1Var.getHeight() - 1));
                MotionEvent obtain = MotionEvent.obtain(motionEvent);
                obtain.setLocation(x10 - h1Var.getLeft(), max);
                boolean onTouchEvent = h1Var.onTouchEvent(obtain);
                obtain.recycle();
                return onTouchEvent;
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public void setCompact(boolean z10) {
        h1 h1Var = this.a;
        if (z10) {
            h1Var.setPadding(org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(5.0f));
            h1Var.setMinHeight(org.telegram.messenger.g0.L(18.0f));
        } else {
            h1Var.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(9.0f));
            h1Var.setMinHeight(org.telegram.messenger.g0.L(36.0f));
        }
    }

    public void setLocked(boolean z10) {
        this.a.setLocked(z10);
    }
}
