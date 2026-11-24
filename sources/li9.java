// default package

import android.content.Context;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes3.dex */
public final class li9 extends FrameLayout {
    public final mc9 a;
    public TL_iv.pageTableCell b;

    public li9(Context context, wjb wjbVar) {
        super(context);
        mc9 mc9Var = new mc9(context, wjbVar);
        this.a = mc9Var;
        mc9Var.setTextSize(1, Math.max(8, gba.T0 - 2));
        mc9Var.setAllowNewlines(true);
        setCompact(false);
        addView(mc9Var, nme.e(-1, -2, 51));
    }

    public final void a() {
        mc9 mc9Var = this.a;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) mc9Var.getLayoutParams();
        TL_iv.pageTableCell pagetablecell = this.b;
        int i = pagetablecell.align_right ? 5 : pagetablecell.align_center ? 1 : 3;
        layoutParams.gravity = pagetablecell.valign_middle ? i | 16 : pagetablecell.valign_bottom ? i | 80 : i | 48;
        mc9Var.setLayoutParams(layoutParams);
        TL_iv.pageTableCell pagetablecell2 = this.b;
        mc9Var.setGravity(pagetablecell2.align_right ? 53 : pagetablecell2.align_center ? 49 : 51);
        mc9Var.setTypeface(null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x001e, code lost:
    
        if ((yi9.q(0, r0.length(), r0) & 1) == 0) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(TL_iv.pageTableCell pagetablecell) {
        boolean z;
        this.b = pagetablecell;
        a();
        CharSequence h = ffb.h(pagetablecell);
        if (pagetablecell.header) {
            z = true;
            if (h.length() != 0) {
            }
            mc9 mc9Var = this.a;
            mc9Var.setAutoBold(z);
            mc9Var.setTextSilently(vu3.m(h, mc9Var.getPaint().getFontMetricsInt(), false, null, 0));
            mc9Var.f();
        }
        z = false;
        mc9 mc9Var2 = this.a;
        mc9Var2.setAutoBold(z);
        mc9Var2.setTextSilently(vu3.m(h, mc9Var2.getPaint().getFontMetricsInt(), false, null, 0));
        mc9Var2.f();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        mc9 mc9Var = this.a;
        if (mc9Var.getVisibility() == 0 && motionEvent.getActionMasked() != 3) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            boolean z = x >= ((float) mc9Var.getLeft()) && x < ((float) mc9Var.getRight());
            boolean z2 = y < ((float) mc9Var.getTop()) || y >= ((float) mc9Var.getBottom());
            if (z && z2 && mc9Var.getHeight() > 0) {
                float max = Math.max(0.0f, Math.min(y - mc9Var.getTop(), mc9Var.getHeight() - 1));
                MotionEvent obtain = MotionEvent.obtain(motionEvent);
                obtain.setLocation(x - mc9Var.getLeft(), max);
                boolean onTouchEvent = mc9Var.onTouchEvent(obtain);
                obtain.recycle();
                return onTouchEvent;
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public void setCompact(boolean z) {
        mc9 mc9Var = this.a;
        if (z) {
            mc9Var.setPadding(gl.L(5.0f), gl.L(5.0f), gl.L(5.0f), gl.L(5.0f));
            mc9Var.setMinHeight(gl.L(18.0f));
        } else {
            mc9Var.setPadding(gl.L(12.0f), gl.L(8.0f), gl.L(12.0f), gl.L(9.0f));
            mc9Var.setMinHeight(gl.L(36.0f));
        }
    }

    public void setLocked(boolean z) {
        this.a.setLocked(z);
    }
}
