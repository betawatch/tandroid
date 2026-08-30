package org.telegram.ui.Components;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class qr extends GestureDetector.SimpleOnGestureListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ ViewGroup c;

    public /* synthetic */ qr(ViewGroup viewGroup, int i10, int i11) {
        this.a = i11;
        this.c = viewGroup;
        this.b = i10;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onDown(MotionEvent motionEvent) {
        switch (this.a) {
            case 0:
                sr srVar = (sr) this.c;
                or orVar = srVar.r;
                if (srVar.n) {
                    srVar.removeCallbacks(orVar);
                }
                srVar.n = true;
                srVar.postDelayed(orVar, 200L);
                srVar.h.run();
                return true;
            case 1:
                return true;
            default:
                return super.onDown(motionEvent);
        }
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        org.telegram.ui.web.w0 w0Var;
        switch (this.a) {
            case 1:
                ah0 ah0Var = (ah0) this.c;
                if (!ah0Var.f && !ah0Var.h && f10 >= 600.0f) {
                    ah0Var.e = false;
                    ah0Var.h = false;
                    ah0Var.a(0.0f, f10 / 6000.0f);
                }
                return false;
            case 2:
                rh.n3 n3Var = (rh.n3) this.c;
                if (n3Var.d || !n3Var.J) {
                    return false;
                }
                if (n3Var.G && !n3Var.I) {
                    return false;
                }
                if (n3Var.K && !n3Var.b(false)) {
                    return false;
                }
                float distance = AndroidUtilities.distance(motionEvent.getX(), motionEvent.getY(), motionEvent2.getX(), motionEvent2.getY());
                float eventTime = motionEvent2.getEventTime() - motionEvent.getEventTime();
                if (f11 >= AndroidUtilities.dp(650.0f) && ((distance > AndroidUtilities.dp(200.0f) || eventTime > 250.0f) && ((w0Var = n3Var.x) == null || w0Var.getScrollY() == 0))) {
                    n3Var.w = true;
                    float f12 = n3Var.r;
                    if (f12 < n3Var.E && !n3Var.G) {
                        n3Var.e(0.0f);
                    } else if (n3Var.G && n3Var.I && (n3Var.N == (-n3Var.f) + n3Var.e || (f12 <= (-r7) && f11 < AndroidUtilities.dp(1200.0f)))) {
                        n3Var.e((-n3Var.f) + n3Var.e);
                    } else {
                        rh.m3 m3Var = n3Var.C;
                        if (m3Var != null) {
                            m3Var.g(false);
                        }
                    }
                } else {
                    if (f11 > -700.0f) {
                        return false;
                    }
                    float f13 = n3Var.r;
                    float f14 = (-n3Var.f) + n3Var.e;
                    if (f13 <= f14) {
                        return false;
                    }
                    n3Var.w = true;
                    n3Var.e(f14);
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
        org.telegram.ui.web.w0 w0Var;
        switch (this.a) {
            case 0:
                sr srVar = (sr) this.c;
                if (srVar.n || srVar.f) {
                    float abs = Math.abs(f10);
                    float f13 = this.b;
                    if (abs >= f13 || Math.abs(f11) >= f13) {
                        srVar.n = false;
                        srVar.f = false;
                        srVar.removeCallbacks(srVar.r);
                        srVar.removeCallbacks(srVar.h);
                    }
                }
                return false;
            case 1:
                ah0 ah0Var = (ah0) this.c;
                if (ah0Var.e || ah0Var.h) {
                    motionEvent3 = motionEvent2;
                } else {
                    if (ah0Var.y || ah0Var.b != 1.0f || f10 > (-this.b) || Math.abs(f10) < Math.abs(1.5f * f11)) {
                        motionEvent3 = motionEvent2;
                    } else {
                        motionEvent3 = motionEvent2;
                        if (!ah0Var.d(motionEvent3, ah0Var.getChildAt(ah0Var.b > 0.5f ? 1 : 0))) {
                            ah0Var.e = true;
                            MotionEvent obtain = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
                            for (int i10 = 0; i10 < ah0Var.getChildCount(); i10++) {
                                ah0Var.getChildAt(i10).dispatchTouchEvent(obtain);
                            }
                            obtain.recycle();
                        }
                    }
                    ah0Var.h = true;
                }
                if (ah0Var.e) {
                    ah0Var.c = -1.0f;
                    ah0Var.b = 1.0f - Math.max(0.0f, Math.min(1.0f, (motionEvent3.getX() - motionEvent.getX()) / ah0Var.getWidth()));
                    ah0Var.c(true);
                }
                return ah0Var.e;
            default:
                rh.n3 n3Var = (rh.n3) this.c;
                if (n3Var.P) {
                    f12 = f11;
                } else {
                    float f14 = n3Var.O + f11;
                    n3Var.O = f14;
                    float abs2 = Math.abs(f14);
                    float f15 = n3Var.Q;
                    if (abs2 > f15) {
                        n3Var.P = true;
                        float f16 = n3Var.O;
                        f12 = f16 > 0.0f ? f16 - f15 : f16 + f15;
                    } else {
                        f12 = 0.0f;
                    }
                }
                if (!n3Var.c && !n3Var.d && n3Var.J) {
                    if (!n3Var.K || n3Var.r != (-n3Var.f) + n3Var.e || n3Var.b(false)) {
                        if (!((Boolean) n3Var.F.provide(null)).booleanValue() || n3Var.r != (-n3Var.f) + n3Var.e) {
                            float abs3 = Math.abs(f12);
                            float f17 = this.b;
                            if (abs3 >= f17 && Math.abs(f12) * 1.5f >= Math.abs(f10) && (n3Var.r != (-n3Var.f) + n3Var.e || (w0Var = n3Var.x) == null || (f12 < 0.0f && w0Var.getScrollY() == 0))) {
                                n3Var.c = true;
                                MotionEvent obtain2 = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
                                for (int i11 = 0; i11 < n3Var.getChildCount(); i11++) {
                                    n3Var.getChildAt(i11).dispatchTouchEvent(obtain2);
                                }
                                obtain2.recycle();
                                return true;
                            }
                            org.telegram.ui.web.w0 w0Var2 = n3Var.x;
                            if (w0Var2 != null) {
                                break;
                            }
                            if (Math.abs(f10) >= f17) {
                                break;
                            }
                        } else {
                            n3Var.d = true;
                        }
                    }
                }
                if (n3Var.c) {
                    if (f12 < 0.0f) {
                        float f18 = n3Var.r;
                        if (f18 > (-n3Var.f) + n3Var.e) {
                            n3Var.r = f18 - f12;
                        } else {
                            if (n3Var.x != null) {
                                float scrollY = r6.getScrollY() + f12;
                                n3Var.x.setScrollY((int) k7.n.a(scrollY, 0.0f, Math.max(r2.getContentHeight(), n3Var.x.getHeight()) - n3Var.e));
                                if (scrollY < 0.0f) {
                                    n3Var.r -= scrollY;
                                }
                            } else {
                                n3Var.r = f18 - f12;
                            }
                        }
                    } else if (f12 > 0.0f) {
                        float f19 = n3Var.r - f12;
                        n3Var.r = f19;
                        if (n3Var.x != null && f19 < (-n3Var.f) + n3Var.e) {
                            float scrollY2 = r2.getScrollY() - ((n3Var.r + n3Var.f) - n3Var.e);
                            n3Var.x.setScrollY((int) k7.n.a(scrollY2, 0.0f, Math.max(r5.getContentHeight(), n3Var.x.getHeight()) - n3Var.e));
                        }
                    }
                    float a2 = k7.n.a(n3Var.r, (-n3Var.f) + n3Var.e, (n3Var.getHeight() - n3Var.f) + n3Var.e);
                    n3Var.r = a2;
                    if (n3Var.G && !n3Var.I) {
                        n3Var.r = Math.min(a2, (-n3Var.f) + n3Var.e);
                    }
                    n3Var.c();
                }
                return true;
        }
    }
}
