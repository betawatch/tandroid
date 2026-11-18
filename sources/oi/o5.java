package oi;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import c8.ma;
import org.telegram.messenger.bz;
import org.telegram.messenger.j6;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.i6;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes4.dex */
public final class o5 extends FrameLayout {
    public final e1 a;
    public TL_iv.pageTableCell b;

    public o5(Context context, i6 i6Var) {
        super(context);
        e1 e1Var = new e1(context, i6Var);
        this.a = e1Var;
        e1Var.setTextSize(1, Math.max(8, bz.W0 - 2));
        e1Var.setAllowNewlines(true);
        setCompact(false);
        addView(e1Var, ma.e(-1, -2, 51));
    }

    public final void a() {
        e1 e1Var = this.a;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) e1Var.getLayoutParams();
        TL_iv.pageTableCell pagetablecell = this.b;
        int i7 = pagetablecell.align_right ? 5 : pagetablecell.align_center ? 1 : 3;
        layoutParams.gravity = pagetablecell.valign_middle ? i7 | 16 : pagetablecell.valign_bottom ? i7 | 80 : i7 | 48;
        e1Var.setLayoutParams(layoutParams);
        TL_iv.pageTableCell pagetablecell2 = this.b;
        e1Var.setGravity(pagetablecell2.align_right ? 53 : pagetablecell2.align_center ? 49 : 51);
        e1Var.setTypeface(null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x001e, code lost:
    
        if ((oi.b6.q(0, r0.length(), r0) & 1) == 0) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(TL_iv.pageTableCell pagetablecell) {
        boolean z10;
        this.b = pagetablecell;
        a();
        CharSequence h = d6.h(pagetablecell);
        if (pagetablecell.header) {
            z10 = true;
            if (h.length() != 0) {
            }
            e1 e1Var = this.a;
            e1Var.setAutoBold(z10);
            e1Var.setTextSilently(j6.m(h, e1Var.getPaint().getFontMetricsInt(), false, null, 0));
            e1Var.f();
        }
        z10 = false;
        e1 e1Var2 = this.a;
        e1Var2.setAutoBold(z10);
        e1Var2.setTextSilently(j6.m(h, e1Var2.getPaint().getFontMetricsInt(), false, null, 0));
        e1Var2.f();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        e1 e1Var = this.a;
        if (e1Var.getVisibility() == 0 && motionEvent.getActionMasked() != 3) {
            float x10 = motionEvent.getX();
            float y10 = motionEvent.getY();
            boolean z10 = x10 >= ((float) e1Var.getLeft()) && x10 < ((float) e1Var.getRight());
            boolean z11 = y10 < ((float) e1Var.getTop()) || y10 >= ((float) e1Var.getBottom());
            if (z10 && z11 && e1Var.getHeight() > 0) {
                float max = Math.max(0.0f, Math.min(y10 - e1Var.getTop(), e1Var.getHeight() - 1));
                MotionEvent obtain = MotionEvent.obtain(motionEvent);
                obtain.setLocation(x10 - e1Var.getLeft(), max);
                boolean onTouchEvent = e1Var.onTouchEvent(obtain);
                obtain.recycle();
                return onTouchEvent;
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public void setCompact(boolean z10) {
        e1 e1Var = this.a;
        if (z10) {
            e1Var.setPadding(org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(5.0f));
            e1Var.setMinHeight(org.telegram.messenger.g0.L(18.0f));
        } else {
            e1Var.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(9.0f));
            e1Var.setMinHeight(org.telegram.messenger.g0.L(36.0f));
        }
    }

    public void setLocked(boolean z10) {
        this.a.setLocked(z10);
    }
}
