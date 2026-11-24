// default package

import android.graphics.Rect;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class k21 extends FrameLayout {
    public final /* synthetic */ u31 E;
    public final y21 a;
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
    public k21(u31 u31Var, y21 y21Var, FrameLayout frameLayout) {
        super(y21Var.getContext());
        this.E = u31Var;
        this.y = frameLayout;
        this.b = new Rect();
        this.a = y21Var;
        GestureDetector gestureDetector = new GestureDetector(y21Var.getContext(), new j31(this, y21Var));
        this.c = gestureDetector;
        gestureDetector.setIsLongpressEnabled(false);
        addView(y21Var);
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
        y21 y21Var = this.a;
        if (!z) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            Rect rect = this.b;
            y21Var.getHitRect(rect);
            if (!rect.contains((int) x, (int) y)) {
                return false;
            }
        }
        this.c.onTouchEvent(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        FrameLayout frameLayout = this.y;
        u31 u31Var = this.E;
        byte b = 1;
        if (actionMasked == 0) {
            if (!this.e && !this.s) {
                y21Var.animate().cancel();
                this.n = 0.0f;
                this.h = 0.0f;
                this.r = false;
                this.f = y21Var.getTranslationX();
                System.currentTimeMillis();
                u31 u31Var2 = y21Var.bulletin;
                this.d = u31Var2 == null || u31Var2.n;
                this.e = true;
                u31Var.i(false);
                if (frameLayout.getParent() != null) {
                    frameLayout.getParent().requestDisallowInterceptTouchEvent(true);
                }
                if (y21Var.onClickListener != null) {
                    y21Var.setPressed(true);
                    return true;
                }
            }
        } else if ((actionMasked == 1 || actionMasked == 3) && this.e) {
            if (!this.s) {
                if (Math.abs(this.f) > y21Var.getWidth() / 3.0f) {
                    float signum = Math.signum(this.f) * y21Var.getWidth();
                    float f = this.f;
                    y21Var.animate().translationX(signum).alpha(((f > 0.0f ? 1 : (f == 0.0f ? 0 : -1)) < 0 && this.w) || ((f > 0.0f ? 1 : (f == 0.0f ? 0 : -1)) > 0 && this.x) ? 0.0f : 1.0f).setDuration(200L).setInterpolator(gm.G).withEndAction(new ku(this, signum, b)).start();
                    this.e = false;
                    u31Var.i(true);
                    if (frameLayout.getParent() != null) {
                        frameLayout.getParent().requestDisallowInterceptTouchEvent(false);
                    }
                    if (y21Var.onClickListener != null) {
                        y21Var.setPressed(false);
                    }
                } else {
                    y21Var.animate().translationX(0.0f).alpha(1.0f).setDuration(200L).start();
                }
            }
            if (actionMasked == 1 && y21Var.isPressed() && (onClickListener = y21Var.onClickListener) != null && !this.r) {
                onClickListener.onClick(y21Var);
            }
            this.e = false;
            u31Var.i(true);
            if (frameLayout.getParent() != null) {
            }
            if (y21Var.onClickListener != null) {
            }
        }
        return true;
    }
}
