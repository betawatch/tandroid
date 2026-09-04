package bi;

import android.view.GestureDetector;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.qc;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes4.dex */
public final class za implements GestureDetector.OnGestureListener {
    public final /* synthetic */ pb a;

    public za(pb pbVar) {
        this.a = pbVar;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        pb pbVar = this.a;
        pbVar.g1 = false;
        return !pb.i(pbVar, pbVar.s, motionEvent.getX(), motionEvent.getY(), false);
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        pb pbVar = this.a;
        if (pbVar.Z != 0.0f && pbVar.u1 == null && f10 < -1000.0f && !pbVar.a0) {
            pbVar.a0 = true;
            try {
                pbVar.s.performHapticFeedback(3);
            } catch (Exception unused) {
            }
            pb.j(pbVar);
        }
        if (pbVar.e0 != 0.0f) {
            if (f10 < -1000.0f) {
                pbVar.n(true);
            } else if (f10 > 1000.0f) {
                pbVar.n(false);
            } else {
                pbVar.n(pbVar.w.f > 0.5f);
            }
        }
        pbVar.g1 = true;
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        float f11;
        qc qcVar;
        pb pbVar = this.a;
        if (!pbVar.j0) {
            return false;
        }
        if (pbVar.l0) {
            pbVar.Z += f10;
            float dp = AndroidUtilities.dp(200.0f);
            if (pbVar.Z > dp && !pbVar.a0) {
                pbVar.a0 = true;
                pb.j(pbVar);
                try {
                    pbVar.s.performHapticFeedback(3);
                } catch (Exception unused) {
                }
            }
            pbVar.d0 = Utilities.clamp(pbVar.Z / dp, 1.0f, 0.0f);
            if (pbVar.n0.getCurrentPeerView() != null) {
                pbVar.n0.getCurrentPeerView().invalidate();
            }
            if (pbVar.Z < 0.0f) {
                pbVar.Z = 0.0f;
                pbVar.l0 = false;
            }
            return true;
        }
        if (pbVar.c0) {
            float f12 = pbVar.e0;
            if (f12 <= pbVar.w.c || f10 <= 0.0f) {
                pbVar.e0 = f12 + f10;
            } else {
                pbVar.e0 = (0.05f * f10) + f12;
            }
            db dbVar = pbVar.s;
            qc qcVar2 = qc.w;
            if (qcVar2 != null && qcVar2.h == dbVar) {
                qcVar2.b();
            }
            if (pbVar.n0.getCurrentPeerView() != null) {
                pbVar.n0.getCurrentPeerView().invalidate();
            }
            pbVar.v.invalidate();
            if (pbVar.e0 < 0.0f) {
                pbVar.e0 = 0.0f;
                pbVar.c0 = false;
            }
            return true;
        }
        if (pbVar.V > 0.8f) {
            float f13 = -f10;
            if ((f13 > 0.0f && pbVar.W > 0.0f) || (f13 < 0.0f && pbVar.W < 0.0f)) {
                f11 = 0.3f;
                pbVar.W -= f10 * f11;
                db dbVar2 = pbVar.s;
                qcVar = qc.w;
                if (qcVar != null && qcVar.h == dbVar2) {
                    qcVar.b();
                }
                pb.k(pbVar);
                return true;
            }
        }
        f11 = 0.6f;
        pbVar.W -= f10 * f11;
        db dbVar22 = pbVar.s;
        qcVar = qc.w;
        if (qcVar != null) {
            qcVar.b();
        }
        pb.k(pbVar);
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        o5 currentPeerView;
        pb pbVar = this.a;
        if (pbVar.e0 == 0.0f && pbVar.f0) {
            if (pbVar.x || pbVar.L0 || pbVar.m1 || pbVar.i1 || pbVar.j1) {
                fb fbVar = pbVar.n0;
                if (fbVar != null && (currentPeerView = fbVar.getCurrentPeerView()) != null) {
                    currentPeerView.s0();
                }
            } else {
                o5 t10 = pbVar.t();
                if (t10 == null || !t10.O1.f) {
                    boolean z10 = motionEvent.getX() > ((float) pbVar.v.getMeasuredWidth()) * 0.33f;
                    o5 currentPeerView2 = pbVar.n0.getCurrentPeerView();
                    if (currentPeerView2 != null && !currentPeerView2.d1(z10)) {
                        if (pbVar.n0.E(z10)) {
                            fb fbVar2 = pbVar.n0;
                            fbVar2.L0 = true;
                            fbVar2.onTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                            androidx.activity.i iVar = fbVar2.M0;
                            AndroidUtilities.cancelRunOnUIThread(iVar);
                            AndroidUtilities.runOnUIThread(iVar, 150L);
                            return false;
                        }
                        if (z10) {
                            pbVar.q(true);
                            return false;
                        }
                        ob obVar = pbVar.z0;
                        if (obVar != null) {
                            obVar.loopBack();
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
