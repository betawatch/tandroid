// default package

import android.content.Context;
import android.graphics.Point;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import org.telegram.ui.Components.ChatActivityEnterView;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public class m14 extends gt9 {
    public float A0;
    public boolean B0;
    public boolean C0;
    public VelocityTracker D0;
    public final /* synthetic */ e34 E0;
    public final int v0;
    public boolean w0;
    public float x0;
    public boolean y0;
    public float z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m14(e34 e34Var, Context context, ylb ylbVar) {
        super(ylbVar, context, e34Var.j2);
        this.E0 = e34Var;
        this.y0 = true;
        this.v0 = ViewConfiguration.get(context).getScaledTouchSlop();
    }

    @Override // gt9, android.widget.HorizontalScrollView, android.view.ViewGroup
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
            e34 e34Var = this.E0;
            if (e34Var.P0 != null && Math.abs(motionEvent.getRawY() - this.A0) >= this.v0) {
                this.B0 = true;
                this.A0 = motionEvent.getRawY();
                ((dbc) e34Var.P0).c();
                if (this.w0) {
                    e34Var.h.i();
                    this.w0 = false;
                }
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // gt9, android.widget.HorizontalScrollView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        e34 e34Var = this.E0;
        o04 o04Var = e34Var.g2;
        s04 s04Var = e34Var.h;
        if (this.s != null) {
            return super.onTouchEvent(motionEvent);
        }
        if (this.y0) {
            this.y0 = false;
            this.x0 = motionEvent.getX();
        }
        if (motionEvent.getAction() == 0 || motionEvent.getAction() == 2) {
            e34Var.X1 = motionEvent.getRawX();
        }
        if (motionEvent.getAction() == 0) {
            this.C0 = false;
            this.B0 = false;
            this.z0 = motionEvent.getRawX();
            this.A0 = motionEvent.getRawY();
        } else if (!this.B0 && !this.C0 && e34Var.P0 != null) {
            float abs = Math.abs(motionEvent.getRawX() - this.z0);
            float f = this.v0;
            if (abs >= f && canScrollHorizontally((int) (this.z0 - motionEvent.getRawX()))) {
                this.C0 = true;
                gm.r(o04Var);
                e34Var.Y1 = true;
                e34Var.Z();
            } else if (Math.abs(motionEvent.getRawY() - this.A0) >= f) {
                this.B0 = true;
                this.A0 = motionEvent.getRawY();
                ((dbc) e34Var.P0).c();
                if (this.w0) {
                    s04Var.i();
                    this.w0 = false;
                }
            }
        }
        if (e34Var.Y1 && (motionEvent.getAction() == 1 || motionEvent.getAction() == 3)) {
            gm.d3(o04Var, 1500L);
        }
        if (!this.B0) {
            float translationX = getTranslationX();
            if (getScrollX() == 0 && translationX == 0.0f) {
                if (this.w0 || this.x0 - motionEvent.getX() >= 0.0f) {
                    if (this.w0 && this.x0 - motionEvent.getX() > 0.0f && s04Var.f0) {
                        s04Var.i();
                        this.w0 = false;
                    }
                } else if (!s04Var.N) {
                    s04Var.f0 = true;
                    s04Var.setScrollState(1);
                    s04Var.S = 0.0f;
                    s04Var.U = 0.0f;
                    VelocityTracker velocityTracker = s04Var.a0;
                    if (velocityTracker == null) {
                        s04Var.a0 = VelocityTracker.obtain();
                    } else {
                        velocityTracker.clear();
                    }
                    long uptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 0, 0.0f, 0.0f, 0);
                    s04Var.a0.addMovement(obtain);
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
                    s04Var.i();
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
            l14 l14Var = e34Var.P0;
            if (action == 1) {
                dbc dbcVar = (dbc) l14Var;
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) dbcVar.c;
                if (dbcVar.a()) {
                    chatActivityEnterView.u4 = false;
                    if ((!dbcVar.a || yVelocity < gm.L(200.0f)) && (dbcVar.a || yVelocity > gm.L(-200.0f))) {
                        boolean z = dbcVar.a;
                        float f2 = chatActivityEnterView.s4;
                        if (!z ? f2 < 0.4f : f2 > 0.6f) {
                            chatActivityEnterView.S1(z, true, true, true);
                        }
                    }
                    chatActivityEnterView.S1(!dbcVar.a, true, true, true);
                }
            } else {
                dbc dbcVar2 = (dbc) l14Var;
                ChatActivityEnterView chatActivityEnterView2 = (ChatActivityEnterView) dbcVar2.c;
                if (chatActivityEnterView2.n4) {
                    chatActivityEnterView2.u4 = false;
                    chatActivityEnterView2.S1(dbcVar2.a, true, false, true);
                }
            }
            this.y0 = true;
            this.C0 = false;
            this.B0 = false;
        } else {
            l14 l14Var2 = e34Var.P0;
            int round = Math.round(motionEvent.getRawY() - this.A0);
            dbc dbcVar3 = (dbc) l14Var2;
            ChatActivityEnterView chatActivityEnterView3 = (ChatActivityEnterView) dbcVar3.c;
            if (dbcVar3.a()) {
                Point point = gm.q;
                int max = Math.max(Math.min(round + dbcVar3.b, 0), -(chatActivityEnterView3.t4 - (point.x > point.y ? chatActivityEnterView3.o3 : chatActivityEnterView3.n3)));
                if (chatActivityEnterView3.l7 == null) {
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
