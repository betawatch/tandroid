package bi;

import android.view.GestureDetector;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.sc;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes4.dex */
public final class cb implements GestureDetector.OnGestureListener {
    public final /* synthetic */ sb a;

    public cb(sb sbVar) {
        this.a = sbVar;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        sb sbVar = this.a;
        sbVar.g1 = false;
        return !sb.i(sbVar, sbVar.s, motionEvent.getX(), motionEvent.getY(), false);
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        sb sbVar = this.a;
        if (sbVar.Z != 0.0f && sbVar.u1 == null && f10 < -1000.0f && !sbVar.a0) {
            sbVar.a0 = true;
            try {
                sbVar.s.performHapticFeedback(3);
            } catch (Exception unused) {
            }
            sb.j(sbVar);
        }
        if (sbVar.e0 != 0.0f) {
            if (f10 < -1000.0f) {
                sbVar.n(true);
            } else if (f10 > 1000.0f) {
                sbVar.n(false);
            } else {
                sbVar.n(sbVar.w.f > 0.5f);
            }
        }
        sbVar.g1 = true;
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        float f11;
        sc scVar;
        sb sbVar = this.a;
        if (!sbVar.j0) {
            return false;
        }
        if (sbVar.l0) {
            sbVar.Z += f10;
            float dp = AndroidUtilities.dp(200.0f);
            if (sbVar.Z > dp && !sbVar.a0) {
                sbVar.a0 = true;
                sb.j(sbVar);
                try {
                    sbVar.s.performHapticFeedback(3);
                } catch (Exception unused) {
                }
            }
            sbVar.d0 = Utilities.clamp(sbVar.Z / dp, 1.0f, 0.0f);
            if (sbVar.n0.getCurrentPeerView() != null) {
                sbVar.n0.getCurrentPeerView().invalidate();
            }
            if (sbVar.Z < 0.0f) {
                sbVar.Z = 0.0f;
                sbVar.l0 = false;
            }
            return true;
        }
        if (sbVar.c0) {
            float f12 = sbVar.e0;
            if (f12 <= sbVar.w.c || f10 <= 0.0f) {
                sbVar.e0 = f12 + f10;
            } else {
                sbVar.e0 = (0.05f * f10) + f12;
            }
            gb gbVar = sbVar.s;
            sc scVar2 = sc.w;
            if (scVar2 != null && scVar2.h == gbVar) {
                scVar2.b();
            }
            if (sbVar.n0.getCurrentPeerView() != null) {
                sbVar.n0.getCurrentPeerView().invalidate();
            }
            sbVar.v.invalidate();
            if (sbVar.e0 < 0.0f) {
                sbVar.e0 = 0.0f;
                sbVar.c0 = false;
            }
            return true;
        }
        if (sbVar.V > 0.8f) {
            float f13 = -f10;
            if ((f13 > 0.0f && sbVar.W > 0.0f) || (f13 < 0.0f && sbVar.W < 0.0f)) {
                f11 = 0.3f;
                sbVar.W -= f10 * f11;
                gb gbVar2 = sbVar.s;
                scVar = sc.w;
                if (scVar != null && scVar.h == gbVar2) {
                    scVar.b();
                }
                sb.k(sbVar);
                return true;
            }
        }
        f11 = 0.6f;
        sbVar.W -= f10 * f11;
        gb gbVar22 = sbVar.s;
        scVar = sc.w;
        if (scVar != null) {
            scVar.b();
        }
        sb.k(sbVar);
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        q5 currentPeerView;
        sb sbVar = this.a;
        if (sbVar.e0 == 0.0f && sbVar.f0) {
            if (sbVar.x || sbVar.L0 || sbVar.m1 || sbVar.i1 || sbVar.j1) {
                ib ibVar = sbVar.n0;
                if (ibVar != null && (currentPeerView = ibVar.getCurrentPeerView()) != null) {
                    currentPeerView.s0();
                }
            } else {
                q5 t10 = sbVar.t();
                if (t10 == null || !t10.O1.f) {
                    boolean z10 = motionEvent.getX() > ((float) sbVar.v.getMeasuredWidth()) * 0.33f;
                    q5 currentPeerView2 = sbVar.n0.getCurrentPeerView();
                    if (currentPeerView2 != null && !currentPeerView2.d1(z10)) {
                        if (sbVar.n0.E(z10)) {
                            ib ibVar2 = sbVar.n0;
                            ibVar2.L0 = true;
                            ibVar2.onTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                            androidx.activity.i iVar = ibVar2.M0;
                            AndroidUtilities.cancelRunOnUIThread(iVar);
                            AndroidUtilities.runOnUIThread(iVar, 150L);
                            return false;
                        }
                        if (z10) {
                            sbVar.q(true);
                            return false;
                        }
                        rb rbVar = sbVar.z0;
                        if (rbVar != null) {
                            rbVar.loopBack();
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
