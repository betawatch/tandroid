// default package

import android.content.Context;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final class nk9 extends FrameLayout {
    public final ne9 a;
    public TL_iv.pageTableCell b;

    public nk9(Context context, ylb ylbVar) {
        super(context);
        ne9 ne9Var = new ne9(context, ylbVar);
        this.a = ne9Var;
        ne9Var.setTextSize(1, Math.max(8, gda.S0 - 2));
        ne9Var.setAllowNewlines(true);
        setCompact(false);
        addView(ne9Var, qoe.e(-1, -2, 51));
    }

    public final void a() {
        ne9 ne9Var = this.a;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) ne9Var.getLayoutParams();
        TL_iv.pageTableCell pagetablecell = this.b;
        int i = pagetablecell.align_right ? 5 : pagetablecell.align_center ? 1 : 3;
        layoutParams.gravity = pagetablecell.valign_middle ? i | 16 : pagetablecell.valign_bottom ? i | 80 : i | 48;
        ne9Var.setLayoutParams(layoutParams);
        TL_iv.pageTableCell pagetablecell2 = this.b;
        ne9Var.setGravity(pagetablecell2.align_right ? 53 : pagetablecell2.align_center ? 49 : 51);
        ne9Var.setTypeface(null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x001e, code lost:
    
        if ((zk9.q(0, r0.length(), r0) & 1) == 0) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(TL_iv.pageTableCell pagetablecell) {
        boolean z;
        this.b = pagetablecell;
        a();
        CharSequence h = fhb.h(pagetablecell);
        if (pagetablecell.header) {
            z = true;
            if (h.length() != 0) {
            }
            ne9 ne9Var = this.a;
            ne9Var.setAutoBold(z);
            ne9Var.setTextSilently(gw3.m(h, ne9Var.getPaint().getFontMetricsInt(), false, null, 0));
            ne9Var.f();
        }
        z = false;
        ne9 ne9Var2 = this.a;
        ne9Var2.setAutoBold(z);
        ne9Var2.setTextSilently(gw3.m(h, ne9Var2.getPaint().getFontMetricsInt(), false, null, 0));
        ne9Var2.f();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        ne9 ne9Var = this.a;
        if (ne9Var.getVisibility() == 0 && motionEvent.getActionMasked() != 3) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            boolean z = x >= ((float) ne9Var.getLeft()) && x < ((float) ne9Var.getRight());
            boolean z2 = y < ((float) ne9Var.getTop()) || y >= ((float) ne9Var.getBottom());
            if (z && z2 && ne9Var.getHeight() > 0) {
                float max = Math.max(0.0f, Math.min(y - ne9Var.getTop(), ne9Var.getHeight() - 1));
                MotionEvent obtain = MotionEvent.obtain(motionEvent);
                obtain.setLocation(x - ne9Var.getLeft(), max);
                boolean onTouchEvent = ne9Var.onTouchEvent(obtain);
                obtain.recycle();
                return onTouchEvent;
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public void setCompact(boolean z) {
        ne9 ne9Var = this.a;
        if (z) {
            ne9Var.setPadding(gm.L(5.0f), gm.L(5.0f), gm.L(5.0f), gm.L(5.0f));
            ne9Var.setMinHeight(gm.L(18.0f));
        } else {
            ne9Var.setPadding(gm.L(12.0f), gm.L(8.0f), gm.L(12.0f), gm.L(9.0f));
            ne9Var.setMinHeight(gm.L(36.0f));
        }
    }

    public void setLocked(boolean z) {
        this.a.setLocked(z);
    }
}
