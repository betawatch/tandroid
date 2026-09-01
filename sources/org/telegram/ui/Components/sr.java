package org.telegram.ui.Components;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class sr extends GestureDetector.SimpleOnGestureListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ ViewGroup c;

    public /* synthetic */ sr(ViewGroup viewGroup, int i10, int i11) {
        this.a = i11;
        this.c = viewGroup;
        this.b = i10;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onDown(MotionEvent motionEvent) {
        switch (this.a) {
            case 0:
                ur urVar = (ur) this.c;
                qr qrVar = urVar.r;
                if (urVar.n) {
                    urVar.removeCallbacks(qrVar);
                }
                urVar.n = true;
                urVar.postDelayed(qrVar, 200L);
                urVar.h.run();
                return true;
            case 1:
                return true;
            default:
                return super.onDown(motionEvent);
        }
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        org.telegram.ui.web.x0 x0Var;
        switch (this.a) {
            case 1:
                ch0 ch0Var = (ch0) this.c;
                if (!ch0Var.f && !ch0Var.h && f10 >= 600.0f) {
                    ch0Var.e = false;
                    ch0Var.h = false;
                    ch0Var.a(0.0f, f10 / 6000.0f);
                }
                return false;
            case 2:
                sh.m3 m3Var = (sh.m3) this.c;
                if (m3Var.d || !m3Var.J) {
                    return false;
                }
                if (m3Var.G && !m3Var.I) {
                    return false;
                }
                if (m3Var.K && !m3Var.b(false)) {
                    return false;
                }
                float distance = AndroidUtilities.distance(motionEvent.getX(), motionEvent.getY(), motionEvent2.getX(), motionEvent2.getY());
                float eventTime = motionEvent2.getEventTime() - motionEvent.getEventTime();
                if (f11 >= AndroidUtilities.dp(650.0f) && ((distance > AndroidUtilities.dp(200.0f) || eventTime > 250.0f) && ((x0Var = m3Var.x) == null || x0Var.getScrollY() == 0))) {
                    m3Var.w = true;
                    float f12 = m3Var.r;
                    if (f12 < m3Var.E && !m3Var.G) {
                        m3Var.e(0.0f);
                    } else if (m3Var.G && m3Var.I && (m3Var.N == (-m3Var.f) + m3Var.e || (f12 <= (-r7) && f11 < AndroidUtilities.dp(1200.0f)))) {
                        m3Var.e((-m3Var.f) + m3Var.e);
                    } else {
                        sh.l3 l3Var = m3Var.C;
                        if (l3Var != null) {
                            l3Var.g(false);
                        }
                    }
                } else {
                    if (f11 > -700.0f) {
                        return false;
                    }
                    float f13 = m3Var.r;
                    float f14 = (-m3Var.f) + m3Var.e;
                    if (f13 <= f14) {
                        return false;
                    }
                    m3Var.w = true;
                    m3Var.e(f14);
                }
                return true;
            default:
                return super.onFling(motionEvent, motionEvent2, f10, f11);
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
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        MotionEvent motionEvent3;
        float f12;
        org.telegram.ui.web.x0 x0Var;
        switch (this.a) {
            case 0:
                ur urVar = (ur) this.c;
                if (urVar.n || urVar.f) {
                    float abs = Math.abs(f10);
                    float f13 = this.b;
                    if (abs >= f13 || Math.abs(f11) >= f13) {
                        urVar.n = false;
                        urVar.f = false;
                        urVar.removeCallbacks(urVar.r);
                        urVar.removeCallbacks(urVar.h);
                    }
                }
                return false;
            case 1:
                ch0 ch0Var = (ch0) this.c;
                if (ch0Var.e || ch0Var.h) {
                    motionEvent3 = motionEvent2;
                } else {
                    if (ch0Var.y || ch0Var.b != 1.0f || f10 > (-this.b) || Math.abs(f10) < Math.abs(1.5f * f11)) {
                        motionEvent3 = motionEvent2;
                    } else {
                        motionEvent3 = motionEvent2;
                        if (!ch0Var.d(motionEvent3, ch0Var.getChildAt(ch0Var.b > 0.5f ? 1 : 0))) {
                            ch0Var.e = true;
                            MotionEvent obtain = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
                            for (int i10 = 0; i10 < ch0Var.getChildCount(); i10++) {
                                ch0Var.getChildAt(i10).dispatchTouchEvent(obtain);
                            }
                            obtain.recycle();
                        }
                    }
                    ch0Var.h = true;
                }
                if (ch0Var.e) {
                    ch0Var.c = -1.0f;
                    ch0Var.b = 1.0f - Math.max(0.0f, Math.min(1.0f, (motionEvent3.getX() - motionEvent.getX()) / ch0Var.getWidth()));
                    ch0Var.c(true);
                }
                return ch0Var.e;
            default:
                sh.m3 m3Var = (sh.m3) this.c;
                if (m3Var.P) {
                    f12 = f11;
                } else {
                    float f14 = m3Var.O + f11;
                    m3Var.O = f14;
                    float abs2 = Math.abs(f14);
                    float f15 = m3Var.Q;
                    if (abs2 > f15) {
                        m3Var.P = true;
                        float f16 = m3Var.O;
                        f12 = f16 > 0.0f ? f16 - f15 : f16 + f15;
                    } else {
                        f12 = 0.0f;
                    }
                }
                if (!m3Var.c && !m3Var.d && m3Var.J) {
                    if (!m3Var.K || m3Var.r != (-m3Var.f) + m3Var.e || m3Var.b(false)) {
                        if (!((Boolean) m3Var.F.provide(null)).booleanValue() || m3Var.r != (-m3Var.f) + m3Var.e) {
                            float abs3 = Math.abs(f12);
                            float f17 = this.b;
                            if (abs3 >= f17 && Math.abs(f12) * 1.5f >= Math.abs(f10) && (m3Var.r != (-m3Var.f) + m3Var.e || (x0Var = m3Var.x) == null || (f12 < 0.0f && x0Var.getScrollY() == 0))) {
                                m3Var.c = true;
                                MotionEvent obtain2 = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
                                for (int i11 = 0; i11 < m3Var.getChildCount(); i11++) {
                                    m3Var.getChildAt(i11).dispatchTouchEvent(obtain2);
                                }
                                obtain2.recycle();
                                return true;
                            }
                            org.telegram.ui.web.x0 x0Var2 = m3Var.x;
                            if (x0Var2 != null) {
                                break;
                            }
                            if (Math.abs(f10) >= f17) {
                                break;
                            }
                        } else {
                            m3Var.d = true;
                        }
                    }
                }
                if (m3Var.c) {
                    if (f12 < 0.0f) {
                        float f18 = m3Var.r;
                        if (f18 > (-m3Var.f) + m3Var.e) {
                            m3Var.r = f18 - f12;
                        } else {
                            if (m3Var.x != null) {
                                float scrollY = r6.getScrollY() + f12;
                                m3Var.x.setScrollY((int) k7.o.a(scrollY, 0.0f, Math.max(r2.getContentHeight(), m3Var.x.getHeight()) - m3Var.e));
                                if (scrollY < 0.0f) {
                                    m3Var.r -= scrollY;
                                }
                            } else {
                                m3Var.r = f18 - f12;
                            }
                        }
                    } else if (f12 > 0.0f) {
                        float f19 = m3Var.r - f12;
                        m3Var.r = f19;
                        if (m3Var.x != null && f19 < (-m3Var.f) + m3Var.e) {
                            float scrollY2 = r2.getScrollY() - ((m3Var.r + m3Var.f) - m3Var.e);
                            m3Var.x.setScrollY((int) k7.o.a(scrollY2, 0.0f, Math.max(r5.getContentHeight(), m3Var.x.getHeight()) - m3Var.e));
                        }
                    }
                    float a2 = k7.o.a(m3Var.r, (-m3Var.f) + m3Var.e, (m3Var.getHeight() - m3Var.f) + m3Var.e);
                    m3Var.r = a2;
                    if (m3Var.G && !m3Var.I) {
                        m3Var.r = Math.min(a2, (-m3Var.f) + m3Var.e);
                    }
                    m3Var.c();
                }
                return true;
        }
    }
}
