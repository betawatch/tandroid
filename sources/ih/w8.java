package ih;

import android.view.GestureDetector;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.gc;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class w8 implements GestureDetector.OnGestureListener {
    public final /* synthetic */ m9 a;

    public w8(m9 m9Var) {
        this.a = m9Var;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        m9 m9Var = this.a;
        m9Var.c1 = false;
        return !m9.i(m9Var, m9Var.s, motionEvent.getX(), motionEvent.getY(), false);
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        m9 m9Var = this.a;
        if (m9Var.V != 0.0f && m9Var.q1 == null && f11 < -1000.0f && !m9Var.W) {
            m9Var.W = true;
            try {
                m9Var.s.performHapticFeedback(3);
            } catch (Exception unused) {
            }
            m9.j(m9Var);
        }
        if (m9Var.a0 != 0.0f) {
            if (f11 < -1000.0f) {
                m9Var.n(true);
            } else if (f11 > 1000.0f) {
                m9Var.n(false);
            } else {
                m9Var.n(m9Var.w.f > 0.5f);
            }
        }
        m9Var.c1 = true;
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        float f12;
        gc gcVar;
        m9 m9Var = this.a;
        if (!m9Var.f0) {
            return false;
        }
        if (m9Var.h0) {
            m9Var.V += f11;
            float dp = AndroidUtilities.dp(200.0f);
            if (m9Var.V > dp && !m9Var.W) {
                m9Var.W = true;
                m9.j(m9Var);
                try {
                    m9Var.s.performHapticFeedback(3);
                } catch (Exception unused) {
                }
            }
            m9Var.Z = Utilities.clamp(m9Var.V / dp, 1.0f, 0.0f);
            if (m9Var.j0.getCurrentPeerView() != null) {
                m9Var.j0.getCurrentPeerView().invalidate();
            }
            if (m9Var.V < 0.0f) {
                m9Var.V = 0.0f;
                m9Var.h0 = false;
            }
            return true;
        }
        if (m9Var.Y) {
            float f13 = m9Var.a0;
            if (f13 <= m9Var.w.c || f11 <= 0.0f) {
                m9Var.a0 = f13 + f11;
            } else {
                m9Var.a0 = (0.05f * f11) + f13;
            }
            a9 a9Var = m9Var.s;
            gc gcVar2 = gc.w;
            if (gcVar2 != null && gcVar2.h == a9Var) {
                gcVar2.b();
            }
            if (m9Var.j0.getCurrentPeerView() != null) {
                m9Var.j0.getCurrentPeerView().invalidate();
            }
            m9Var.v.invalidate();
            if (m9Var.a0 < 0.0f) {
                m9Var.a0 = 0.0f;
                m9Var.Y = false;
            }
            return true;
        }
        if (m9Var.R > 0.8f) {
            float f14 = -f11;
            if ((f14 > 0.0f && m9Var.S > 0.0f) || (f14 < 0.0f && m9Var.S < 0.0f)) {
                f12 = 0.3f;
                m9Var.S -= f11 * f12;
                a9 a9Var2 = m9Var.s;
                gcVar = gc.w;
                if (gcVar != null && gcVar.h == a9Var2) {
                    gcVar.b();
                }
                m9.k(m9Var);
                return true;
            }
        }
        f12 = 0.6f;
        m9Var.S -= f11 * f12;
        a9 a9Var22 = m9Var.s;
        gcVar = gc.w;
        if (gcVar != null) {
            gcVar.b();
        }
        m9.k(m9Var);
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        i4 currentPeerView;
        m9 m9Var = this.a;
        if (m9Var.a0 == 0.0f && m9Var.b0) {
            if (m9Var.x || m9Var.H0 || m9Var.i1 || m9Var.e1 || m9Var.f1) {
                c9 c9Var = m9Var.j0;
                if (c9Var != null && (currentPeerView = c9Var.getCurrentPeerView()) != null) {
                    currentPeerView.s0();
                }
            } else {
                i4 t10 = m9Var.t();
                if (t10 == null || !t10.K1.f) {
                    boolean z10 = motionEvent.getX() > ((float) m9Var.v.getMeasuredWidth()) * 0.33f;
                    i4 currentPeerView2 = m9Var.j0.getCurrentPeerView();
                    if (currentPeerView2 != null && !currentPeerView2.d1(z10)) {
                        if (m9Var.j0.E(z10)) {
                            c9 c9Var2 = m9Var.j0;
                            c9Var2.H0 = true;
                            c9Var2.onTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                            androidx.activity.i iVar = c9Var2.I0;
                            AndroidUtilities.cancelRunOnUIThread(iVar);
                            AndroidUtilities.runOnUIThread(iVar, 150L);
                            return false;
                        }
                        if (z10) {
                            m9Var.q(true);
                            return false;
                        }
                        l9 l9Var = m9Var.v0;
                        if (l9Var != null) {
                            l9Var.loopBack();
                            return false;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onShowPress(MotionEvent motionEvent) {
    }
}
