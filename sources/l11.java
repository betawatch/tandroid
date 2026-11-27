// default package

import android.graphics.Rect;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class l11 extends FrameLayout {
    public final /* synthetic */ v21 E;
    public final z11 a;
    public final Rect b;
    public final GestureDetector c;
    public boolean d;
    public boolean e;
    public float f;
    public float h;
    public float n;
    public boolean r;
    public boolean s;
    public boolean w;
    public boolean x;
    public final /* synthetic */ FrameLayout y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l11(v21 v21Var, z11 z11Var, FrameLayout frameLayout) {
        super(z11Var.getContext());
        this.E = v21Var;
        this.y = frameLayout;
        this.b = new Rect();
        this.a = z11Var;
        GestureDetector gestureDetector = new GestureDetector(z11Var.getContext(), new k21(this, z11Var));
        this.c = gestureDetector;
        gestureDetector.setIsLongpressEnabled(false);
        addView(z11Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0119  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        View.OnClickListener onClickListener;
        boolean z = this.e;
        z11 z11Var = this.a;
        if (!z) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            Rect rect = this.b;
            z11Var.getHitRect(rect);
            if (!rect.contains((int) x, (int) y)) {
                return false;
            }
        }
        this.c.onTouchEvent(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        FrameLayout frameLayout = this.y;
        v21 v21Var = this.E;
        byte b = 1;
        if (actionMasked == 0) {
            if (!this.e && !this.s) {
                z11Var.animate().cancel();
                this.n = 0.0f;
                this.h = 0.0f;
                this.r = false;
                this.f = z11Var.getTranslationX();
                System.currentTimeMillis();
                v21 v21Var2 = z11Var.bulletin;
                this.d = v21Var2 == null || v21Var2.n;
                this.e = true;
                v21Var.i(false);
                if (frameLayout.getParent() != null) {
                    frameLayout.getParent().requestDisallowInterceptTouchEvent(true);
                }
                if (z11Var.onClickListener != null) {
                    z11Var.setPressed(true);
                    return true;
                }
            }
        } else if ((actionMasked == 1 || actionMasked == 3) && this.e) {
            if (!this.s) {
                if (Math.abs(this.f) > z11Var.getWidth() / 3.0f) {
                    float signum = Math.signum(this.f) * z11Var.getWidth();
                    float f = this.f;
                    z11Var.animate().translationX(signum).alpha(((f > 0.0f ? 1 : (f == 0.0f ? 0 : -1)) < 0 && this.w) || ((f > 0.0f ? 1 : (f == 0.0f ? 0 : -1)) > 0 && this.x) ? 0.0f : 1.0f).setDuration(200L).setInterpolator(hl.G).withEndAction(new jt(this, signum, b)).start();
                    this.e = false;
                    v21Var.i(true);
                    if (frameLayout.getParent() != null) {
                        frameLayout.getParent().requestDisallowInterceptTouchEvent(false);
                    }
                    if (z11Var.onClickListener != null) {
                        z11Var.setPressed(false);
                    }
                } else {
                    z11Var.animate().translationX(0.0f).alpha(1.0f).setDuration(200L).start();
                }
            }
            if (actionMasked == 1 && z11Var.isPressed() && (onClickListener = z11Var.onClickListener) != null && !this.r) {
                onClickListener.onClick(z11Var);
            }
            this.e = false;
            v21Var.i(true);
            if (frameLayout.getParent() != null) {
            }
            if (z11Var.onClickListener != null) {
            }
        }
        return true;
    }
}
