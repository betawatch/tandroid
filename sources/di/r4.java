package di;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.as;
import org.telegram.ui.Components.eh0;
import org.telegram.ui.Components.xr;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final class r4 extends GestureDetector.SimpleOnGestureListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ ViewGroup c;

    public /* synthetic */ r4(ViewGroup viewGroup, int i10, int i11) {
        this.a = i11;
        this.c = viewGroup;
        this.b = i10;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onDown(MotionEvent motionEvent) {
        switch (this.a) {
            case 1:
                as asVar = (as) this.c;
                xr xrVar = asVar.r;
                if (asVar.n) {
                    asVar.removeCallbacks(xrVar);
                }
                asVar.n = true;
                asVar.postDelayed(xrVar, 200L);
                asVar.h.run();
                return true;
            case 2:
                return true;
            default:
                return super.onDown(motionEvent);
        }
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        org.telegram.ui.web.y0 y0Var;
        switch (this.a) {
            case 0:
                t4 t4Var = (t4) this.c;
                if (t4Var.d || !t4Var.M) {
                    return false;
                }
                if (t4Var.J && !t4Var.L) {
                    return false;
                }
                if (t4Var.N && !t4Var.b(false)) {
                    return false;
                }
                float distance = AndroidUtilities.distance(motionEvent.getX(), motionEvent.getY(), motionEvent2.getX(), motionEvent2.getY());
                float eventTime = motionEvent2.getEventTime() - motionEvent.getEventTime();
                if (f10 >= AndroidUtilities.dp(650.0f) && ((distance > AndroidUtilities.dp(200.0f) || eventTime > 250.0f) && ((y0Var = t4Var.x) == null || y0Var.getScrollY() == 0))) {
                    t4Var.w = true;
                    float f11 = t4Var.r;
                    if (f11 < t4Var.H && !t4Var.J) {
                        t4Var.e(0.0f);
                    } else if (t4Var.J && t4Var.L && (t4Var.Q == (-t4Var.f) + t4Var.e || (f11 <= (-r7) && f10 < AndroidUtilities.dp(1200.0f)))) {
                        t4Var.e((-t4Var.f) + t4Var.e);
                    } else {
                        s4 s4Var = t4Var.F;
                        if (s4Var != null) {
                            s4Var.j(false);
                        }
                    }
                } else {
                    if (f10 > -700.0f) {
                        return false;
                    }
                    float f12 = t4Var.r;
                    float f13 = (-t4Var.f) + t4Var.e;
                    if (f12 <= f13) {
                        return false;
                    }
                    t4Var.w = true;
                    t4Var.e(f13);
                }
                return true;
            case 1:
            default:
                return super.onFling(motionEvent, motionEvent2, f7, f10);
            case 2:
                eh0 eh0Var = (eh0) this.c;
                if (!eh0Var.f && !eh0Var.h && f7 >= 600.0f) {
                    eh0Var.e = false;
                    eh0Var.h = false;
                    eh0Var.a(0.0f, f7 / 6000.0f);
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
        org.telegram.ui.web.y0 y0Var;
        MotionEvent motionEvent3;
        switch (this.a) {
            case 0:
                t4 t4Var = (t4) this.c;
                if (t4Var.S) {
                    f11 = f10;
                } else {
                    float f12 = t4Var.R + f10;
                    t4Var.R = f12;
                    float abs = Math.abs(f12);
                    float f13 = t4Var.T;
                    if (abs > f13) {
                        t4Var.S = true;
                        float f14 = t4Var.R;
                        f11 = f14 > 0.0f ? f14 - f13 : f14 + f13;
                    } else {
                        f11 = 0.0f;
                    }
                }
                if (!t4Var.c && !t4Var.d && t4Var.M) {
                    if (!t4Var.N || t4Var.r != (-t4Var.f) + t4Var.e || t4Var.b(false)) {
                        if (!((Boolean) t4Var.I.provide(null)).booleanValue() || t4Var.r != (-t4Var.f) + t4Var.e) {
                            float abs2 = Math.abs(f11);
                            float f15 = this.b;
                            if (abs2 >= f15 && Math.abs(f11) * 1.5f >= Math.abs(f7) && (t4Var.r != (-t4Var.f) + t4Var.e || (y0Var = t4Var.x) == null || (f11 < 0.0f && y0Var.getScrollY() == 0))) {
                                t4Var.c = true;
                                MotionEvent obtain = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
                                for (int i10 = 0; i10 < t4Var.getChildCount(); i10++) {
                                    t4Var.getChildAt(i10).dispatchTouchEvent(obtain);
                                }
                                obtain.recycle();
                                return true;
                            }
                            org.telegram.ui.web.y0 y0Var2 = t4Var.x;
                            if (y0Var2 != null) {
                                break;
                            }
                            if (Math.abs(f7) >= f15) {
                                break;
                            }
                        } else {
                            t4Var.d = true;
                        }
                    }
                }
                if (t4Var.c) {
                    if (f11 < 0.0f) {
                        float f16 = t4Var.r;
                        if (f16 > (-t4Var.f) + t4Var.e) {
                            t4Var.r = f16 - f11;
                        } else {
                            if (t4Var.x != null) {
                                float scrollY = r6.getScrollY() + f11;
                                t4Var.x.setScrollY((int) w7.q.a(scrollY, 0.0f, Math.max(r2.getContentHeight(), t4Var.x.getHeight()) - t4Var.e));
                                if (scrollY < 0.0f) {
                                    t4Var.r -= scrollY;
                                }
                            } else {
                                t4Var.r = f16 - f11;
                            }
                        }
                    } else if (f11 > 0.0f) {
                        float f17 = t4Var.r - f11;
                        t4Var.r = f17;
                        if (t4Var.x != null && f17 < (-t4Var.f) + t4Var.e) {
                            float scrollY2 = r2.getScrollY() - ((t4Var.r + t4Var.f) - t4Var.e);
                            t4Var.x.setScrollY((int) w7.q.a(scrollY2, 0.0f, Math.max(r5.getContentHeight(), t4Var.x.getHeight()) - t4Var.e));
                        }
                    }
                    float a2 = w7.q.a(t4Var.r, (-t4Var.f) + t4Var.e, (t4Var.getHeight() - t4Var.f) + t4Var.e);
                    t4Var.r = a2;
                    if (t4Var.J && !t4Var.L) {
                        t4Var.r = Math.min(a2, (-t4Var.f) + t4Var.e);
                    }
                    t4Var.c();
                }
                return true;
            case 1:
                as asVar = (as) this.c;
                if (asVar.n || asVar.f) {
                    float abs3 = Math.abs(f7);
                    float f18 = this.b;
                    if (abs3 >= f18 || Math.abs(f10) >= f18) {
                        asVar.n = false;
                        asVar.f = false;
                        asVar.removeCallbacks(asVar.r);
                        asVar.removeCallbacks(asVar.h);
                    }
                }
                return false;
            default:
                eh0 eh0Var = (eh0) this.c;
                if (eh0Var.e || eh0Var.h) {
                    motionEvent3 = motionEvent2;
                } else {
                    if (eh0Var.y || eh0Var.b != 1.0f || f7 > (-this.b) || Math.abs(f7) < Math.abs(1.5f * f10)) {
                        motionEvent3 = motionEvent2;
                    } else {
                        motionEvent3 = motionEvent2;
                        if (!eh0Var.d(motionEvent3, eh0Var.getChildAt(eh0Var.b > 0.5f ? 1 : 0))) {
                            eh0Var.e = true;
                            MotionEvent obtain2 = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
                            for (int i11 = 0; i11 < eh0Var.getChildCount(); i11++) {
                                eh0Var.getChildAt(i11).dispatchTouchEvent(obtain2);
                            }
                            obtain2.recycle();
                        }
                    }
                    eh0Var.h = true;
                }
                if (eh0Var.e) {
                    eh0Var.c = -1.0f;
                    eh0Var.b = 1.0f - Math.max(0.0f, Math.min(1.0f, (motionEvent3.getX() - motionEvent.getX()) / eh0Var.getWidth()));
                    eh0Var.c(true);
                }
                return eh0Var.e;
        }
    }
}
