package hi;

import a8.ee;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.es;
import org.telegram.ui.Components.hs;
import org.telegram.ui.Components.th0;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class l4 extends GestureDetector.SimpleOnGestureListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ ViewGroup c;

    public /* synthetic */ l4(ViewGroup viewGroup, int i10, int i11) {
        this.a = i11;
        this.c = viewGroup;
        this.b = i10;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onDown(MotionEvent motionEvent) {
        switch (this.a) {
            case 1:
                hs hsVar = (hs) this.c;
                es esVar = hsVar.r;
                if (hsVar.n) {
                    hsVar.removeCallbacks(esVar);
                }
                hsVar.n = true;
                hsVar.postDelayed(esVar, 200L);
                hsVar.h.run();
                return true;
            case 2:
                return true;
            default:
                return super.onDown(motionEvent);
        }
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        org.telegram.ui.web.x0 x0Var;
        switch (this.a) {
            case 0:
                n4 n4Var = (n4) this.c;
                if (n4Var.d || !n4Var.M) {
                    return false;
                }
                if (n4Var.J && !n4Var.L) {
                    return false;
                }
                if (n4Var.N && !n4Var.b(false)) {
                    return false;
                }
                float distance = AndroidUtilities.distance(motionEvent.getX(), motionEvent.getY(), motionEvent2.getX(), motionEvent2.getY());
                float eventTime = motionEvent2.getEventTime() - motionEvent.getEventTime();
                if (f10 >= AndroidUtilities.dp(650.0f) && ((distance > AndroidUtilities.dp(200.0f) || eventTime > 250.0f) && ((x0Var = n4Var.x) == null || x0Var.getScrollY() == 0))) {
                    n4Var.w = true;
                    float f11 = n4Var.r;
                    if (f11 < n4Var.H && !n4Var.J) {
                        n4Var.e(0.0f);
                    } else if (n4Var.J && n4Var.L && (n4Var.Q == (-n4Var.f) + n4Var.e || (f11 <= (-r7) && f10 < AndroidUtilities.dp(1200.0f)))) {
                        n4Var.e((-n4Var.f) + n4Var.e);
                    } else {
                        m4 m4Var = n4Var.F;
                        if (m4Var != null) {
                            m4Var.o(false);
                        }
                    }
                } else {
                    if (f10 > -700.0f) {
                        return false;
                    }
                    float f12 = n4Var.r;
                    float f13 = (-n4Var.f) + n4Var.e;
                    if (f12 <= f13) {
                        return false;
                    }
                    n4Var.w = true;
                    n4Var.e(f13);
                }
                return true;
            case 1:
            default:
                return super.onFling(motionEvent, motionEvent2, f7, f10);
            case 2:
                th0 th0Var = (th0) this.c;
                if (!th0Var.f && !th0Var.h && f7 >= 600.0f) {
                    th0Var.e = false;
                    th0Var.h = false;
                    th0Var.a(0.0f, f7 / 6000.0f);
                }
                return false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:91:0x01a4, code lost:
    
        if (r5.canScrollHorizontally(r20 >= 0.0f ? 1 : -1) == false) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01bb, code lost:
    
        r1.d = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01b9, code lost:
    
        if ((java.lang.Math.abs(r20) * 1.5f) >= java.lang.Math.abs(r2)) goto L101;
     */
    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        float f11;
        org.telegram.ui.web.x0 x0Var;
        MotionEvent motionEvent3;
        switch (this.a) {
            case 0:
                n4 n4Var = (n4) this.c;
                if (n4Var.S) {
                    f11 = f10;
                } else {
                    float f12 = n4Var.R + f10;
                    n4Var.R = f12;
                    float abs = Math.abs(f12);
                    float f13 = n4Var.T;
                    if (abs > f13) {
                        n4Var.S = true;
                        float f14 = n4Var.R;
                        f11 = f14 > 0.0f ? f14 - f13 : f14 + f13;
                    } else {
                        f11 = 0.0f;
                    }
                }
                if (!n4Var.c && !n4Var.d && n4Var.M) {
                    if (!n4Var.N || n4Var.r != (-n4Var.f) + n4Var.e || n4Var.b(false)) {
                        if (!((Boolean) n4Var.I.provide(null)).booleanValue() || n4Var.r != (-n4Var.f) + n4Var.e) {
                            float abs2 = Math.abs(f11);
                            float f15 = this.b;
                            if (abs2 >= f15 && Math.abs(f11) * 1.5f >= Math.abs(f7) && (n4Var.r != (-n4Var.f) + n4Var.e || (x0Var = n4Var.x) == null || (f11 < 0.0f && x0Var.getScrollY() == 0))) {
                                n4Var.c = true;
                                MotionEvent obtain = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
                                for (int i10 = 0; i10 < n4Var.getChildCount(); i10++) {
                                    n4Var.getChildAt(i10).dispatchTouchEvent(obtain);
                                }
                                obtain.recycle();
                                return true;
                            }
                            org.telegram.ui.web.x0 x0Var2 = n4Var.x;
                            if (x0Var2 != null) {
                                break;
                            }
                            if (Math.abs(f7) >= f15) {
                                break;
                            }
                        } else {
                            n4Var.d = true;
                        }
                    }
                }
                if (n4Var.c) {
                    if (f11 < 0.0f) {
                        float f16 = n4Var.r;
                        if (f16 > (-n4Var.f) + n4Var.e) {
                            n4Var.r = f16 - f11;
                        } else {
                            if (n4Var.x != null) {
                                float scrollY = r6.getScrollY() + f11;
                                n4Var.x.setScrollY((int) ee.a(scrollY, 0.0f, Math.max(r2.getContentHeight(), n4Var.x.getHeight()) - n4Var.e));
                                if (scrollY < 0.0f) {
                                    n4Var.r -= scrollY;
                                }
                            } else {
                                n4Var.r = f16 - f11;
                            }
                        }
                    } else if (f11 > 0.0f) {
                        float f17 = n4Var.r - f11;
                        n4Var.r = f17;
                        if (n4Var.x != null && f17 < (-n4Var.f) + n4Var.e) {
                            float scrollY2 = r2.getScrollY() - ((n4Var.r + n4Var.f) - n4Var.e);
                            n4Var.x.setScrollY((int) ee.a(scrollY2, 0.0f, Math.max(r5.getContentHeight(), n4Var.x.getHeight()) - n4Var.e));
                        }
                    }
                    float a2 = ee.a(n4Var.r, (-n4Var.f) + n4Var.e, (n4Var.getHeight() - n4Var.f) + n4Var.e);
                    n4Var.r = a2;
                    if (n4Var.J && !n4Var.L) {
                        n4Var.r = Math.min(a2, (-n4Var.f) + n4Var.e);
                    }
                    n4Var.c();
                }
                return true;
            case 1:
                hs hsVar = (hs) this.c;
                if (hsVar.n || hsVar.f) {
                    float abs3 = Math.abs(f7);
                    float f18 = this.b;
                    if (abs3 >= f18 || Math.abs(f10) >= f18) {
                        hsVar.n = false;
                        hsVar.f = false;
                        hsVar.removeCallbacks(hsVar.r);
                        hsVar.removeCallbacks(hsVar.h);
                    }
                }
                return false;
            default:
                th0 th0Var = (th0) this.c;
                if (th0Var.e || th0Var.h) {
                    motionEvent3 = motionEvent2;
                } else {
                    if (th0Var.y || th0Var.b != 1.0f || f7 > (-this.b) || Math.abs(f7) < Math.abs(1.5f * f10)) {
                        motionEvent3 = motionEvent2;
                    } else {
                        motionEvent3 = motionEvent2;
                        if (!th0Var.d(motionEvent3, th0Var.getChildAt(th0Var.b > 0.5f ? 1 : 0))) {
                            th0Var.e = true;
                            MotionEvent obtain2 = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
                            for (int i11 = 0; i11 < th0Var.getChildCount(); i11++) {
                                th0Var.getChildAt(i11).dispatchTouchEvent(obtain2);
                            }
                            obtain2.recycle();
                        }
                    }
                    th0Var.h = true;
                }
                if (th0Var.e) {
                    th0Var.c = -1.0f;
                    th0Var.b = 1.0f - Math.max(0.0f, Math.min(1.0f, (motionEvent3.getX() - motionEvent.getX()) / th0Var.getWidth()));
                    th0Var.c(true);
                }
                return th0Var.e;
        }
    }
}
