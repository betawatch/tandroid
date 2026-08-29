package org.telegram.ui.Components;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class mr extends GestureDetector.SimpleOnGestureListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ ViewGroup c;

    public /* synthetic */ mr(ViewGroup viewGroup, int i10, int i11) {
        this.a = i11;
        this.c = viewGroup;
        this.b = i10;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onDown(MotionEvent motionEvent) {
        switch (this.a) {
            case 0:
                or orVar = (or) this.c;
                kr krVar = orVar.r;
                if (orVar.n) {
                    orVar.removeCallbacks(krVar);
                }
                orVar.n = true;
                orVar.postDelayed(krVar, 200L);
                orVar.h.run();
                return true;
            case 1:
                return true;
            default:
                return super.onDown(motionEvent);
        }
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f9, float f10) {
        org.telegram.ui.web.w0 w0Var;
        switch (this.a) {
            case 1:
                qg0 qg0Var = (qg0) this.c;
                if (!qg0Var.f && !qg0Var.h && f9 >= 600.0f) {
                    qg0Var.e = false;
                    qg0Var.h = false;
                    qg0Var.a(0.0f, f9 / 6000.0f);
                }
                return false;
            case 2:
                ph.m3 m3Var = (ph.m3) this.c;
                if (m3Var.d || !m3Var.I) {
                    return false;
                }
                if (m3Var.F && !m3Var.H) {
                    return false;
                }
                if (m3Var.J && !m3Var.b(false)) {
                    return false;
                }
                float distance = AndroidUtilities.distance(motionEvent.getX(), motionEvent.getY(), motionEvent2.getX(), motionEvent2.getY());
                float eventTime = motionEvent2.getEventTime() - motionEvent.getEventTime();
                if (f10 >= AndroidUtilities.dp(650.0f) && ((distance > AndroidUtilities.dp(200.0f) || eventTime > 250.0f) && ((w0Var = m3Var.x) == null || w0Var.getScrollY() == 0))) {
                    m3Var.w = true;
                    float f11 = m3Var.r;
                    if (f11 < m3Var.D && !m3Var.F) {
                        m3Var.e(0.0f);
                    } else if (m3Var.F && m3Var.H && (m3Var.M == (-m3Var.f) + m3Var.e || (f11 <= (-r7) && f10 < AndroidUtilities.dp(1200.0f)))) {
                        m3Var.e((-m3Var.f) + m3Var.e);
                    } else {
                        ph.l3 l3Var = m3Var.B;
                        if (l3Var != null) {
                            l3Var.f(false);
                        }
                    }
                } else {
                    if (f10 > -700.0f) {
                        return false;
                    }
                    float f12 = m3Var.r;
                    float f13 = (-m3Var.f) + m3Var.e;
                    if (f12 <= f13) {
                        return false;
                    }
                    m3Var.w = true;
                    m3Var.e(f13);
                }
                return true;
            default:
                return super.onFling(motionEvent, motionEvent2, f9, f10);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x00db, code lost:
    
        if (r5.canScrollHorizontally(r20 >= 0.0f ? 1 : -1) == false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00f3, code lost:
    
        r1.d = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00f1, code lost:
    
        if ((java.lang.Math.abs(r20) * 1.5f) >= java.lang.Math.abs(r2)) goto L60;
     */
    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f9, float f10) {
        MotionEvent motionEvent3;
        float f11;
        org.telegram.ui.web.w0 w0Var;
        switch (this.a) {
            case 0:
                or orVar = (or) this.c;
                if (orVar.n || orVar.f) {
                    float abs = Math.abs(f9);
                    float f12 = this.b;
                    if (abs >= f12 || Math.abs(f10) >= f12) {
                        orVar.n = false;
                        orVar.f = false;
                        orVar.removeCallbacks(orVar.r);
                        orVar.removeCallbacks(orVar.h);
                    }
                }
                return false;
            case 1:
                qg0 qg0Var = (qg0) this.c;
                if (qg0Var.e || qg0Var.h) {
                    motionEvent3 = motionEvent2;
                } else {
                    if (qg0Var.y || qg0Var.b != 1.0f || f9 > (-this.b) || Math.abs(f9) < Math.abs(1.5f * f10)) {
                        motionEvent3 = motionEvent2;
                    } else {
                        motionEvent3 = motionEvent2;
                        if (!qg0Var.d(motionEvent3, qg0Var.getChildAt(qg0Var.b > 0.5f ? 1 : 0))) {
                            qg0Var.e = true;
                            MotionEvent obtain = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
                            for (int i10 = 0; i10 < qg0Var.getChildCount(); i10++) {
                                qg0Var.getChildAt(i10).dispatchTouchEvent(obtain);
                            }
                            obtain.recycle();
                        }
                    }
                    qg0Var.h = true;
                }
                if (qg0Var.e) {
                    qg0Var.c = -1.0f;
                    qg0Var.b = 1.0f - Math.max(0.0f, Math.min(1.0f, (motionEvent3.getX() - motionEvent.getX()) / qg0Var.getWidth()));
                    qg0Var.c(true);
                }
                return qg0Var.e;
            default:
                ph.m3 m3Var = (ph.m3) this.c;
                if (m3Var.O) {
                    f11 = f10;
                } else {
                    float f13 = m3Var.N + f10;
                    m3Var.N = f13;
                    float abs2 = Math.abs(f13);
                    float f14 = m3Var.P;
                    if (abs2 > f14) {
                        m3Var.O = true;
                        float f15 = m3Var.N;
                        f11 = f15 > 0.0f ? f15 - f14 : f15 + f14;
                    } else {
                        f11 = 0.0f;
                    }
                }
                if (!m3Var.c && !m3Var.d && m3Var.I) {
                    if (!m3Var.J || m3Var.r != (-m3Var.f) + m3Var.e || m3Var.b(false)) {
                        if (!((Boolean) m3Var.E.provide(null)).booleanValue() || m3Var.r != (-m3Var.f) + m3Var.e) {
                            float abs3 = Math.abs(f11);
                            float f16 = this.b;
                            if (abs3 >= f16 && Math.abs(f11) * 1.5f >= Math.abs(f9) && (m3Var.r != (-m3Var.f) + m3Var.e || (w0Var = m3Var.x) == null || (f11 < 0.0f && w0Var.getScrollY() == 0))) {
                                m3Var.c = true;
                                MotionEvent obtain2 = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
                                for (int i11 = 0; i11 < m3Var.getChildCount(); i11++) {
                                    m3Var.getChildAt(i11).dispatchTouchEvent(obtain2);
                                }
                                obtain2.recycle();
                                return true;
                            }
                            org.telegram.ui.web.w0 w0Var2 = m3Var.x;
                            if (w0Var2 != null) {
                                break;
                            }
                            if (Math.abs(f9) >= f16) {
                                break;
                            }
                        } else {
                            m3Var.d = true;
                        }
                    }
                }
                if (m3Var.c) {
                    if (f11 < 0.0f) {
                        float f17 = m3Var.r;
                        if (f17 > (-m3Var.f) + m3Var.e) {
                            m3Var.r = f17 - f11;
                        } else {
                            if (m3Var.x != null) {
                                float scrollY = r6.getScrollY() + f11;
                                m3Var.x.setScrollY((int) i7.w.a(scrollY, 0.0f, Math.max(r2.getContentHeight(), m3Var.x.getHeight()) - m3Var.e));
                                if (scrollY < 0.0f) {
                                    m3Var.r -= scrollY;
                                }
                            } else {
                                m3Var.r = f17 - f11;
                            }
                        }
                    } else if (f11 > 0.0f) {
                        float f18 = m3Var.r - f11;
                        m3Var.r = f18;
                        if (m3Var.x != null && f18 < (-m3Var.f) + m3Var.e) {
                            float scrollY2 = r2.getScrollY() - ((m3Var.r + m3Var.f) - m3Var.e);
                            m3Var.x.setScrollY((int) i7.w.a(scrollY2, 0.0f, Math.max(r5.getContentHeight(), m3Var.x.getHeight()) - m3Var.e));
                        }
                    }
                    float a2 = i7.w.a(m3Var.r, (-m3Var.f) + m3Var.e, (m3Var.getHeight() - m3Var.f) + m3Var.e);
                    m3Var.r = a2;
                    if (m3Var.F && !m3Var.H) {
                        m3Var.r = Math.min(a2, (-m3Var.f) + m3Var.e);
                    }
                    m3Var.c();
                }
                return true;
        }
    }
}
