// default package

import android.graphics.Rect;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class c11 extends FrameLayout {
    public final /* synthetic */ m21 E;
    public final q11 a;
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
    public c11(m21 m21Var, q11 q11Var, FrameLayout frameLayout) {
        super(q11Var.getContext());
        this.E = m21Var;
        this.y = frameLayout;
        this.b = new Rect();
        this.a = q11Var;
        GestureDetector gestureDetector = new GestureDetector(q11Var.getContext(), new b21(this, q11Var));
        this.c = gestureDetector;
        gestureDetector.setIsLongpressEnabled(false);
        addView(q11Var);
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
        q11 q11Var = this.a;
        if (!z) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            Rect rect = this.b;
            q11Var.getHitRect(rect);
            if (!rect.contains((int) x, (int) y)) {
                return false;
            }
        }
        this.c.onTouchEvent(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        FrameLayout frameLayout = this.y;
        m21 m21Var = this.E;
        byte b = 1;
        if (actionMasked == 0) {
            if (!this.e && !this.s) {
                q11Var.animate().cancel();
                this.n = 0.0f;
                this.h = 0.0f;
                this.r = false;
                this.f = q11Var.getTranslationX();
                System.currentTimeMillis();
                m21 m21Var2 = q11Var.bulletin;
                this.d = m21Var2 == null || m21Var2.m;
                this.e = true;
                m21Var.i(false);
                if (frameLayout.getParent() != null) {
                    frameLayout.getParent().requestDisallowInterceptTouchEvent(true);
                }
                if (q11Var.onClickListener != null) {
                    q11Var.setPressed(true);
                    return true;
                }
            }
        } else if ((actionMasked == 1 || actionMasked == 3) && this.e) {
            if (!this.s) {
                if (Math.abs(this.f) > q11Var.getWidth() / 3.0f) {
                    float signum = Math.signum(this.f) * q11Var.getWidth();
                    float f = this.f;
                    q11Var.animate().translationX(signum).alpha(((f > 0.0f ? 1 : (f == 0.0f ? 0 : -1)) < 0 && this.w) || ((f > 0.0f ? 1 : (f == 0.0f ? 0 : -1)) > 0 && this.x) ? 0.0f : 1.0f).setDuration(200L).setInterpolator(gl.G).withEndAction(new kt(this, signum, b)).start();
                    this.e = false;
                    m21Var.i(true);
                    if (frameLayout.getParent() != null) {
                        frameLayout.getParent().requestDisallowInterceptTouchEvent(false);
                    }
                    if (q11Var.onClickListener != null) {
                        q11Var.setPressed(false);
                    }
                } else {
                    q11Var.animate().translationX(0.0f).alpha(1.0f).setDuration(200L).start();
                }
            }
            if (actionMasked == 1 && q11Var.isPressed() && (onClickListener = q11Var.onClickListener) != null && !this.r) {
                onClickListener.onClick(q11Var);
            }
            this.e = false;
            m21Var.i(true);
            if (frameLayout.getParent() != null) {
            }
            if (q11Var.onClickListener != null) {
            }
        }
        return true;
    }
}
