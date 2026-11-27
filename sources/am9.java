// default package

import android.content.Context;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes3.dex */
public final class am9 extends FrameLayout {
    public final dg9 a;
    public TL_iv.pageTableCell b;

    public am9(Context context, vnb vnbVar) {
        super(context);
        dg9 dg9Var = new dg9(context, vnbVar);
        this.a = dg9Var;
        dg9Var.setTextSize(1, Math.max(8, xea.S0 - 2));
        dg9Var.setAllowNewlines(true);
        setCompact(false);
        addView(dg9Var, tre.e(-1, -2, 51));
    }

    public final void a() {
        dg9 dg9Var = this.a;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) dg9Var.getLayoutParams();
        TL_iv.pageTableCell pagetablecell = this.b;
        int i = pagetablecell.align_right ? 5 : pagetablecell.align_center ? 1 : 3;
        layoutParams.gravity = pagetablecell.valign_middle ? i | 16 : pagetablecell.valign_bottom ? i | 80 : i | 48;
        dg9Var.setLayoutParams(layoutParams);
        TL_iv.pageTableCell pagetablecell2 = this.b;
        dg9Var.setGravity(pagetablecell2.align_right ? 53 : pagetablecell2.align_center ? 49 : 51);
        dg9Var.setTypeface(null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x001e, code lost:
    
        if ((mm9.q(0, r0.length(), r0) & 1) == 0) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(TL_iv.pageTableCell pagetablecell) {
        boolean z;
        this.b = pagetablecell;
        a();
        CharSequence h = ajb.h(pagetablecell);
        if (pagetablecell.header) {
            z = true;
            if (h.length() != 0) {
            }
            dg9 dg9Var = this.a;
            dg9Var.setAutoBold(z);
            dg9Var.setTextSilently(pv3.m(h, dg9Var.getPaint().getFontMetricsInt(), false, null, 0));
            dg9Var.f();
        }
        z = false;
        dg9 dg9Var2 = this.a;
        dg9Var2.setAutoBold(z);
        dg9Var2.setTextSilently(pv3.m(h, dg9Var2.getPaint().getFontMetricsInt(), false, null, 0));
        dg9Var2.f();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        dg9 dg9Var = this.a;
        if (dg9Var.getVisibility() == 0 && motionEvent.getActionMasked() != 3) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            boolean z = x >= ((float) dg9Var.getLeft()) && x < ((float) dg9Var.getRight());
            boolean z2 = y < ((float) dg9Var.getTop()) || y >= ((float) dg9Var.getBottom());
            if (z && z2 && dg9Var.getHeight() > 0) {
                float max = Math.max(0.0f, Math.min(y - dg9Var.getTop(), dg9Var.getHeight() - 1));
                MotionEvent obtain = MotionEvent.obtain(motionEvent);
                obtain.setLocation(x - dg9Var.getLeft(), max);
                boolean onTouchEvent = dg9Var.onTouchEvent(obtain);
                obtain.recycle();
                return onTouchEvent;
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public void setCompact(boolean z) {
        dg9 dg9Var = this.a;
        if (z) {
            dg9Var.setPadding(hl.L(5.0f), hl.L(5.0f), hl.L(5.0f), hl.L(5.0f));
            dg9Var.setMinHeight(hl.L(18.0f));
        } else {
            dg9Var.setPadding(hl.L(12.0f), hl.L(8.0f), hl.L(12.0f), hl.L(9.0f));
            dg9Var.setMinHeight(hl.L(36.0f));
        }
    }

    public void setLocked(boolean z) {
        this.a.setLocked(z);
    }
}
