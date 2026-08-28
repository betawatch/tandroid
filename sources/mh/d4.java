package mh;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.fg0;
import org.telegram.ui.Components.hr;
import org.telegram.ui.Components.kr;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class d4 extends GestureDetector.SimpleOnGestureListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ ViewGroup c;

    public /* synthetic */ d4(ViewGroup viewGroup, int i9, int i10) {
        this.a = i10;
        this.c = viewGroup;
        this.b = i9;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onDown(MotionEvent motionEvent) {
        switch (this.a) {
            case 1:
                kr krVar = (kr) this.c;
                hr hrVar = krVar.r;
                if (krVar.n) {
                    krVar.removeCallbacks(hrVar);
                }
                krVar.n = true;
                krVar.postDelayed(hrVar, 200L);
                krVar.h.run();
                return true;
            case 2:
                return true;
            default:
                return super.onDown(motionEvent);
        }
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        org.telegram.ui.web.v0 v0Var;
        switch (this.a) {
            case 0:
                f4 f4Var = (f4) this.c;
                if (f4Var.d || !f4Var.I) {
                    return false;
                }
                if (f4Var.F && !f4Var.H) {
                    return false;
                }
                if (f4Var.J && !f4Var.b(false)) {
                    return false;
                }
                float distance = AndroidUtilities.distance(motionEvent.getX(), motionEvent.getY(), motionEvent2.getX(), motionEvent2.getY());
                float eventTime = motionEvent2.getEventTime() - motionEvent.getEventTime();
                if (f11 >= AndroidUtilities.dp(650.0f) && ((distance > AndroidUtilities.dp(200.0f) || eventTime > 250.0f) && ((v0Var = f4Var.x) == null || v0Var.getScrollY() == 0))) {
                    f4Var.w = true;
                    float f12 = f4Var.r;
                    if (f12 < f4Var.D && !f4Var.F) {
                        f4Var.e(0.0f);
                    } else if (f4Var.F && f4Var.H && (f4Var.M == (-f4Var.f) + f4Var.e || (f12 <= (-r7) && f11 < AndroidUtilities.dp(1200.0f)))) {
                        f4Var.e((-f4Var.f) + f4Var.e);
                    } else {
                        e4 e4Var = f4Var.B;
                        if (e4Var != null) {
                            e4Var.j(false);
                        }
                    }
                } else {
                    if (f11 > -700.0f) {
                        return false;
                    }
                    float f13 = f4Var.r;
                    float f14 = (-f4Var.f) + f4Var.e;
                    if (f13 <= f14) {
                        return false;
                    }
                    f4Var.w = true;
                    f4Var.e(f14);
                }
                return true;
            case 1:
            default:
                return super.onFling(motionEvent, motionEvent2, f10, f11);
            case 2:
                fg0 fg0Var = (fg0) this.c;
                if (!fg0Var.f && !fg0Var.h && f10 >= 600.0f) {
                    fg0Var.e = false;
                    fg0Var.h = false;
                    fg0Var.a(0.0f, f10 / 6000.0f);
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
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        float f12;
        org.telegram.ui.web.v0 v0Var;
        MotionEvent motionEvent3;
        switch (this.a) {
            case 0:
                f4 f4Var = (f4) this.c;
                if (f4Var.O) {
                    f12 = f11;
                } else {
                    float f13 = f4Var.N + f11;
                    f4Var.N = f13;
                    float abs = Math.abs(f13);
                    float f14 = f4Var.P;
                    if (abs > f14) {
                        f4Var.O = true;
                        float f15 = f4Var.N;
                        f12 = f15 > 0.0f ? f15 - f14 : f15 + f14;
                    } else {
                        f12 = 0.0f;
                    }
                }
                if (!f4Var.c && !f4Var.d && f4Var.I) {
                    if (!f4Var.J || f4Var.r != (-f4Var.f) + f4Var.e || f4Var.b(false)) {
                        if (!((Boolean) f4Var.E.provide(null)).booleanValue() || f4Var.r != (-f4Var.f) + f4Var.e) {
                            float abs2 = Math.abs(f12);
                            float f16 = this.b;
                            if (abs2 >= f16 && Math.abs(f12) * 1.5f >= Math.abs(f10) && (f4Var.r != (-f4Var.f) + f4Var.e || (v0Var = f4Var.x) == null || (f12 < 0.0f && v0Var.getScrollY() == 0))) {
                                f4Var.c = true;
                                MotionEvent obtain = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
                                for (int i9 = 0; i9 < f4Var.getChildCount(); i9++) {
                                    f4Var.getChildAt(i9).dispatchTouchEvent(obtain);
                                }
                                obtain.recycle();
                                return true;
                            }
                            org.telegram.ui.web.v0 v0Var2 = f4Var.x;
                            if (v0Var2 != null) {
                                break;
                            }
                            if (Math.abs(f10) >= f16) {
                                break;
                            }
                        } else {
                            f4Var.d = true;
                        }
                    }
                }
                if (f4Var.c) {
                    if (f12 < 0.0f) {
                        float f17 = f4Var.r;
                        if (f17 > (-f4Var.f) + f4Var.e) {
                            f4Var.r = f17 - f12;
                        } else {
                            if (f4Var.x != null) {
                                float scrollY = r6.getScrollY() + f12;
                                f4Var.x.setScrollY((int) g7.n.a(scrollY, 0.0f, Math.max(r2.getContentHeight(), f4Var.x.getHeight()) - f4Var.e));
                                if (scrollY < 0.0f) {
                                    f4Var.r -= scrollY;
                                }
                            } else {
                                f4Var.r = f17 - f12;
                            }
                        }
                    } else if (f12 > 0.0f) {
                        float f18 = f4Var.r - f12;
                        f4Var.r = f18;
                        if (f4Var.x != null && f18 < (-f4Var.f) + f4Var.e) {
                            float scrollY2 = r2.getScrollY() - ((f4Var.r + f4Var.f) - f4Var.e);
                            f4Var.x.setScrollY((int) g7.n.a(scrollY2, 0.0f, Math.max(r5.getContentHeight(), f4Var.x.getHeight()) - f4Var.e));
                        }
                    }
                    float a2 = g7.n.a(f4Var.r, (-f4Var.f) + f4Var.e, (f4Var.getHeight() - f4Var.f) + f4Var.e);
                    f4Var.r = a2;
                    if (f4Var.F && !f4Var.H) {
                        f4Var.r = Math.min(a2, (-f4Var.f) + f4Var.e);
                    }
                    f4Var.c();
                }
                return true;
            case 1:
                kr krVar = (kr) this.c;
                if (krVar.n || krVar.f) {
                    float abs3 = Math.abs(f10);
                    float f19 = this.b;
                    if (abs3 >= f19 || Math.abs(f11) >= f19) {
                        krVar.n = false;
                        krVar.f = false;
                        krVar.removeCallbacks(krVar.r);
                        krVar.removeCallbacks(krVar.h);
                    }
                }
                return false;
            default:
                fg0 fg0Var = (fg0) this.c;
                if (fg0Var.e || fg0Var.h) {
                    motionEvent3 = motionEvent2;
                } else {
                    if (fg0Var.y || fg0Var.b != 1.0f || f10 > (-this.b) || Math.abs(f10) < Math.abs(1.5f * f11)) {
                        motionEvent3 = motionEvent2;
                    } else {
                        motionEvent3 = motionEvent2;
                        if (!fg0Var.d(motionEvent3, fg0Var.getChildAt(fg0Var.b > 0.5f ? 1 : 0))) {
                            fg0Var.e = true;
                            MotionEvent obtain2 = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
                            for (int i10 = 0; i10 < fg0Var.getChildCount(); i10++) {
                                fg0Var.getChildAt(i10).dispatchTouchEvent(obtain2);
                            }
                            obtain2.recycle();
                        }
                    }
                    fg0Var.h = true;
                }
                if (fg0Var.e) {
                    fg0Var.c = -1.0f;
                    fg0Var.b = 1.0f - Math.max(0.0f, Math.min(1.0f, (motionEvent3.getX() - motionEvent.getX()) / fg0Var.getWidth()));
                    fg0Var.c(true);
                }
                return fg0Var.e;
        }
    }
}
