package fi;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.qr;
import org.telegram.ui.Components.tr;
import org.telegram.ui.Components.ug0;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes4.dex */
public final class o4 extends GestureDetector.SimpleOnGestureListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ ViewGroup c;

    public /* synthetic */ o4(ViewGroup viewGroup, int i10, int i11) {
        this.a = i11;
        this.c = viewGroup;
        this.b = i10;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onDown(MotionEvent motionEvent) {
        switch (this.a) {
            case 1:
                tr trVar = (tr) this.c;
                qr qrVar = trVar.r;
                if (trVar.n) {
                    trVar.removeCallbacks(qrVar);
                }
                trVar.n = true;
                trVar.postDelayed(qrVar, 200L);
                trVar.h.run();
                return true;
            case 2:
                return true;
            default:
                return super.onDown(motionEvent);
        }
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        org.telegram.ui.web.z0 z0Var;
        switch (this.a) {
            case 0:
                q4 q4Var = (q4) this.c;
                if (q4Var.d || !q4Var.M) {
                    return false;
                }
                if (q4Var.J && !q4Var.L) {
                    return false;
                }
                if (q4Var.N && !q4Var.b(false)) {
                    return false;
                }
                float distance = AndroidUtilities.distance(motionEvent.getX(), motionEvent.getY(), motionEvent2.getX(), motionEvent2.getY());
                float eventTime = motionEvent2.getEventTime() - motionEvent.getEventTime();
                if (f10 >= AndroidUtilities.dp(650.0f) && ((distance > AndroidUtilities.dp(200.0f) || eventTime > 250.0f) && ((z0Var = q4Var.x) == null || z0Var.getScrollY() == 0))) {
                    q4Var.w = true;
                    float f11 = q4Var.r;
                    if (f11 < q4Var.H && !q4Var.J) {
                        q4Var.e(0.0f);
                    } else if (q4Var.J && q4Var.L && (q4Var.Q == (-q4Var.f) + q4Var.e || (f11 <= (-r7) && f10 < AndroidUtilities.dp(1200.0f)))) {
                        q4Var.e((-q4Var.f) + q4Var.e);
                    } else {
                        p4 p4Var = q4Var.F;
                        if (p4Var != null) {
                            p4Var.f(false);
                        }
                    }
                } else {
                    if (f10 > -700.0f) {
                        return false;
                    }
                    float f12 = q4Var.r;
                    float f13 = (-q4Var.f) + q4Var.e;
                    if (f12 <= f13) {
                        return false;
                    }
                    q4Var.w = true;
                    q4Var.e(f13);
                }
                return true;
            case 1:
            default:
                return super.onFling(motionEvent, motionEvent2, f7, f10);
            case 2:
                ug0 ug0Var = (ug0) this.c;
                if (!ug0Var.f && !ug0Var.h && f7 >= 600.0f) {
                    ug0Var.e = false;
                    ug0Var.h = false;
                    ug0Var.a(0.0f, f7 / 6000.0f);
                }
                return false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:91:0x01a5, code lost:
    
        if (r5.canScrollHorizontally(r20 >= 0.0f ? 1 : -1) == false) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01bd, code lost:
    
        r1.d = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01bb, code lost:
    
        if ((java.lang.Math.abs(r20) * 1.5f) >= java.lang.Math.abs(r2)) goto L101;
     */
    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        float f11;
        org.telegram.ui.web.z0 z0Var;
        MotionEvent motionEvent3;
        switch (this.a) {
            case 0:
                q4 q4Var = (q4) this.c;
                if (q4Var.S) {
                    f11 = f10;
                } else {
                    float f12 = q4Var.R + f10;
                    q4Var.R = f12;
                    float abs = Math.abs(f12);
                    float f13 = q4Var.T;
                    if (abs > f13) {
                        q4Var.S = true;
                        float f14 = q4Var.R;
                        f11 = f14 > 0.0f ? f14 - f13 : f14 + f13;
                    } else {
                        f11 = 0.0f;
                    }
                }
                if (!q4Var.c && !q4Var.d && q4Var.M) {
                    if (!q4Var.N || q4Var.r != (-q4Var.f) + q4Var.e || q4Var.b(false)) {
                        if (!((Boolean) q4Var.I.provide(null)).booleanValue() || q4Var.r != (-q4Var.f) + q4Var.e) {
                            float abs2 = Math.abs(f11);
                            float f15 = this.b;
                            if (abs2 >= f15 && Math.abs(f11) * 1.5f >= Math.abs(f7) && (q4Var.r != (-q4Var.f) + q4Var.e || (z0Var = q4Var.x) == null || (f11 < 0.0f && z0Var.getScrollY() == 0))) {
                                q4Var.c = true;
                                MotionEvent obtain = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
                                for (int i10 = 0; i10 < q4Var.getChildCount(); i10++) {
                                    q4Var.getChildAt(i10).dispatchTouchEvent(obtain);
                                }
                                obtain.recycle();
                                return true;
                            }
                            org.telegram.ui.web.z0 z0Var2 = q4Var.x;
                            if (z0Var2 != null) {
                                break;
                            }
                            if (Math.abs(f7) >= f15) {
                                break;
                            }
                        } else {
                            q4Var.d = true;
                        }
                    }
                }
                if (q4Var.c) {
                    if (f11 < 0.0f) {
                        float f16 = q4Var.r;
                        if (f16 > (-q4Var.f) + q4Var.e) {
                            q4Var.r = f16 - f11;
                        } else {
                            if (q4Var.x != null) {
                                float scrollY = r6.getScrollY() + f11;
                                q4Var.x.setScrollY((int) w7.p.a(scrollY, 0.0f, Math.max(r2.getContentHeight(), q4Var.x.getHeight()) - q4Var.e));
                                if (scrollY < 0.0f) {
                                    q4Var.r -= scrollY;
                                }
                            } else {
                                q4Var.r = f16 - f11;
                            }
                        }
                    } else if (f11 > 0.0f) {
                        float f17 = q4Var.r - f11;
                        q4Var.r = f17;
                        if (q4Var.x != null && f17 < (-q4Var.f) + q4Var.e) {
                            float scrollY2 = r2.getScrollY() - ((q4Var.r + q4Var.f) - q4Var.e);
                            q4Var.x.setScrollY((int) w7.p.a(scrollY2, 0.0f, Math.max(r5.getContentHeight(), q4Var.x.getHeight()) - q4Var.e));
                        }
                    }
                    float a2 = w7.p.a(q4Var.r, (-q4Var.f) + q4Var.e, (q4Var.getHeight() - q4Var.f) + q4Var.e);
                    q4Var.r = a2;
                    if (q4Var.J && !q4Var.L) {
                        q4Var.r = Math.min(a2, (-q4Var.f) + q4Var.e);
                    }
                    q4Var.c();
                }
                return true;
            case 1:
                tr trVar = (tr) this.c;
                if (trVar.n || trVar.f) {
                    float abs3 = Math.abs(f7);
                    float f18 = this.b;
                    if (abs3 >= f18 || Math.abs(f10) >= f18) {
                        trVar.n = false;
                        trVar.f = false;
                        trVar.removeCallbacks(trVar.r);
                        trVar.removeCallbacks(trVar.h);
                    }
                }
                return false;
            default:
                ug0 ug0Var = (ug0) this.c;
                if (ug0Var.e || ug0Var.h) {
                    motionEvent3 = motionEvent2;
                } else {
                    if (ug0Var.y || ug0Var.b != 1.0f || f7 > (-this.b) || Math.abs(f7) < Math.abs(1.5f * f10)) {
                        motionEvent3 = motionEvent2;
                    } else {
                        motionEvent3 = motionEvent2;
                        if (!ug0Var.d(motionEvent3, ug0Var.getChildAt(ug0Var.b > 0.5f ? 1 : 0))) {
                            ug0Var.e = true;
                            MotionEvent obtain2 = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
                            for (int i11 = 0; i11 < ug0Var.getChildCount(); i11++) {
                                ug0Var.getChildAt(i11).dispatchTouchEvent(obtain2);
                            }
                            obtain2.recycle();
                        }
                    }
                    ug0Var.h = true;
                }
                if (ug0Var.e) {
                    ug0Var.c = -1.0f;
                    ug0Var.b = 1.0f - Math.max(0.0f, Math.min(1.0f, (motionEvent3.getX() - motionEvent.getX()) / ug0Var.getWidth()));
                    ug0Var.c(true);
                }
                return ug0Var.e;
        }
    }
}
