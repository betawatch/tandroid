// default package

import android.content.Context;
import android.graphics.Point;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import org.telegram.ui.Components.ChatActivityEnterView;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public class b04 extends er9 {
    public float A0;
    public boolean B0;
    public boolean C0;
    public VelocityTracker D0;
    public final /* synthetic */ t14 E0;
    public final int v0;
    public boolean w0;
    public float x0;
    public boolean y0;
    public float z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b04(t14 t14Var, Context context, wjb wjbVar) {
        super(wjbVar, context, t14Var.j2);
        this.E0 = t14Var;
        this.y0 = true;
        this.v0 = ViewConfiguration.get(context).getScaledTouchSlop();
    }

    @Override // er9, android.widget.HorizontalScrollView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.s != null) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        if (getParent() != null) {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        if (motionEvent.getAction() == 0) {
            this.C0 = false;
            this.B0 = false;
            this.z0 = motionEvent.getRawX();
            this.A0 = motionEvent.getRawY();
        } else if (!this.B0 && !this.C0) {
            t14 t14Var = this.E0;
            if (t14Var.P0 != null && Math.abs(motionEvent.getRawY() - this.A0) >= this.v0) {
                this.B0 = true;
                this.A0 = motionEvent.getRawY();
                ((c9c) t14Var.P0).c();
                if (this.w0) {
                    t14Var.h.i();
                    this.w0 = false;
                }
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // er9, android.widget.HorizontalScrollView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        t14 t14Var = this.E0;
        ez3 ez3Var = t14Var.g2;
        iz3 iz3Var = t14Var.h;
        if (this.s != null) {
            return super.onTouchEvent(motionEvent);
        }
        if (this.y0) {
            this.y0 = false;
            this.x0 = motionEvent.getX();
        }
        if (motionEvent.getAction() == 0 || motionEvent.getAction() == 2) {
            t14Var.X1 = motionEvent.getRawX();
        }
        if (motionEvent.getAction() == 0) {
            this.C0 = false;
            this.B0 = false;
            this.z0 = motionEvent.getRawX();
            this.A0 = motionEvent.getRawY();
        } else if (!this.B0 && !this.C0 && t14Var.P0 != null) {
            float abs = Math.abs(motionEvent.getRawX() - this.z0);
            float f = this.v0;
            if (abs >= f && canScrollHorizontally((int) (this.z0 - motionEvent.getRawX()))) {
                this.C0 = true;
                gl.r(ez3Var);
                t14Var.Y1 = true;
                t14Var.Z();
            } else if (Math.abs(motionEvent.getRawY() - this.A0) >= f) {
                this.B0 = true;
                this.A0 = motionEvent.getRawY();
                ((c9c) t14Var.P0).c();
                if (this.w0) {
                    iz3Var.i();
                    this.w0 = false;
                }
            }
        }
        if (t14Var.Y1 && (motionEvent.getAction() == 1 || motionEvent.getAction() == 3)) {
            gl.e3(ez3Var, 1500L);
        }
        if (!this.B0) {
            float translationX = getTranslationX();
            if (getScrollX() == 0 && translationX == 0.0f) {
                if (this.w0 || this.x0 - motionEvent.getX() >= 0.0f) {
                    if (this.w0 && this.x0 - motionEvent.getX() > 0.0f && iz3Var.f0) {
                        iz3Var.i();
                        this.w0 = false;
                    }
                } else if (!iz3Var.N) {
                    iz3Var.f0 = true;
                    iz3Var.setScrollState(1);
                    iz3Var.S = 0.0f;
                    iz3Var.U = 0.0f;
                    VelocityTracker velocityTracker = iz3Var.a0;
                    if (velocityTracker == null) {
                        iz3Var.a0 = VelocityTracker.obtain();
                    } else {
                        velocityTracker.clear();
                    }
                    long uptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 0, 0.0f, 0.0f, 0);
                    iz3Var.a0.addMovement(obtain);
                    obtain.recycle();
                    this.w0 = true;
                    getTranslationX();
                }
            }
            if (this.w0) {
                motionEvent.getX();
            }
            this.x0 = motionEvent.getX();
            if (motionEvent.getAction() == 3 || motionEvent.getAction() == 1) {
                this.y0 = true;
                this.C0 = false;
                this.B0 = false;
                if (this.w0) {
                    iz3Var.i();
                    this.w0 = false;
                }
            }
            return this.w0 || super.onTouchEvent(motionEvent);
        }
        VelocityTracker velocityTracker2 = this.D0;
        if (velocityTracker2 == null) {
            velocityTracker2 = VelocityTracker.obtain();
            this.D0 = velocityTracker2;
        }
        velocityTracker2.addMovement(motionEvent);
        if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            this.D0.computeCurrentVelocity(1000);
            float yVelocity = this.D0.getYVelocity();
            this.D0.recycle();
            this.D0 = null;
            int action = motionEvent.getAction();
            a04 a04Var = t14Var.P0;
            if (action == 1) {
                c9c c9cVar = (c9c) a04Var;
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) c9cVar.c;
                if (c9cVar.a()) {
                    chatActivityEnterView.u4 = false;
                    if ((!c9cVar.a || yVelocity < gl.L(200.0f)) && (c9cVar.a || yVelocity > gl.L(-200.0f))) {
                        boolean z = c9cVar.a;
                        float f2 = chatActivityEnterView.s4;
                        if (!z ? f2 < 0.4f : f2 > 0.6f) {
                            chatActivityEnterView.P1(z, true, true, true);
                        }
                    }
                    chatActivityEnterView.P1(!c9cVar.a, true, true, true);
                }
            } else {
                c9c c9cVar2 = (c9c) a04Var;
                ChatActivityEnterView chatActivityEnterView2 = (ChatActivityEnterView) c9cVar2.c;
                if (chatActivityEnterView2.n4) {
                    chatActivityEnterView2.u4 = false;
                    chatActivityEnterView2.P1(c9cVar2.a, true, false, true);
                }
            }
            this.y0 = true;
            this.C0 = false;
            this.B0 = false;
        } else {
            a04 a04Var2 = t14Var.P0;
            int round = Math.round(motionEvent.getRawY() - this.A0);
            c9c c9cVar3 = (c9c) a04Var2;
            ChatActivityEnterView chatActivityEnterView3 = (ChatActivityEnterView) c9cVar3.c;
            if (c9cVar3.a()) {
                Point point = gl.q;
                int max = Math.max(Math.min(round + c9cVar3.b, 0), -(chatActivityEnterView3.t4 - (point.x > point.y ? chatActivityEnterView3.o3 : chatActivityEnterView3.n3)));
                if (chatActivityEnterView3.d7 == null) {
                    float f3 = max;
                    chatActivityEnterView3.V0.setTranslationY(f3);
                    chatActivityEnterView3.setTranslationY(f3);
                }
                chatActivityEnterView3.s4 = max / (-(chatActivityEnterView3.t4 - r4));
                chatActivityEnterView3.c2.invalidate();
            }
        }
        cancelLongPress();
        return true;
    }
}
