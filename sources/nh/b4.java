package nh;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.fr;
import org.telegram.ui.Components.hg0;
import org.telegram.ui.Components.ir;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final class b4 extends GestureDetector.SimpleOnGestureListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ ViewGroup c;

    public /* synthetic */ b4(ViewGroup viewGroup, int i10, int i11) {
        this.a = i11;
        this.c = viewGroup;
        this.b = i10;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onDown(MotionEvent motionEvent) {
        switch (this.a) {
            case 1:
                ir irVar = (ir) this.c;
                fr frVar = irVar.r;
                if (irVar.n) {
                    irVar.removeCallbacks(frVar);
                }
                irVar.n = true;
                irVar.postDelayed(frVar, 200L);
                irVar.h.run();
                return true;
            case 2:
                return true;
            default:
                return super.onDown(motionEvent);
        }
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        org.telegram.ui.web.w0 w0Var;
        switch (this.a) {
            case 0:
                d4 d4Var = (d4) this.c;
                if (d4Var.d || !d4Var.I) {
                    return false;
                }
                if (d4Var.F && !d4Var.H) {
                    return false;
                }
                if (d4Var.J && !d4Var.b(false)) {
                    return false;
                }
                float distance = AndroidUtilities.distance(motionEvent.getX(), motionEvent.getY(), motionEvent2.getX(), motionEvent2.getY());
                float eventTime = motionEvent2.getEventTime() - motionEvent.getEventTime();
                if (f11 >= AndroidUtilities.dp(650.0f) && ((distance > AndroidUtilities.dp(200.0f) || eventTime > 250.0f) && ((w0Var = d4Var.x) == null || w0Var.getScrollY() == 0))) {
                    d4Var.w = true;
                    float f12 = d4Var.r;
                    if (f12 < d4Var.D && !d4Var.F) {
                        d4Var.e(0.0f);
                    } else if (d4Var.F && d4Var.H && (d4Var.M == (-d4Var.f) + d4Var.e || (f12 <= (-r7) && f11 < AndroidUtilities.dp(1200.0f)))) {
                        d4Var.e((-d4Var.f) + d4Var.e);
                    } else {
                        c4 c4Var = d4Var.B;
                        if (c4Var != null) {
                            c4Var.i(false);
                        }
                    }
                } else {
                    if (f11 > -700.0f) {
                        return false;
                    }
                    float f13 = d4Var.r;
                    float f14 = (-d4Var.f) + d4Var.e;
                    if (f13 <= f14) {
                        return false;
                    }
                    d4Var.w = true;
                    d4Var.e(f14);
                }
                return true;
            case 1:
            default:
                return super.onFling(motionEvent, motionEvent2, f10, f11);
            case 2:
                hg0 hg0Var = (hg0) this.c;
                if (!hg0Var.f && !hg0Var.h && f10 >= 600.0f) {
                    hg0Var.e = false;
                    hg0Var.h = false;
                    hg0Var.a(0.0f, f10 / 6000.0f);
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
        org.telegram.ui.web.w0 w0Var;
        MotionEvent motionEvent3;
        switch (this.a) {
            case 0:
                d4 d4Var = (d4) this.c;
                if (d4Var.O) {
                    f12 = f11;
                } else {
                    float f13 = d4Var.N + f11;
                    d4Var.N = f13;
                    float abs = Math.abs(f13);
                    float f14 = d4Var.P;
                    if (abs > f14) {
                        d4Var.O = true;
                        float f15 = d4Var.N;
                        f12 = f15 > 0.0f ? f15 - f14 : f15 + f14;
                    } else {
                        f12 = 0.0f;
                    }
                }
                if (!d4Var.c && !d4Var.d && d4Var.I) {
                    if (!d4Var.J || d4Var.r != (-d4Var.f) + d4Var.e || d4Var.b(false)) {
                        if (!((Boolean) d4Var.E.provide(null)).booleanValue() || d4Var.r != (-d4Var.f) + d4Var.e) {
                            float abs2 = Math.abs(f12);
                            float f16 = this.b;
                            if (abs2 >= f16 && Math.abs(f12) * 1.5f >= Math.abs(f10) && (d4Var.r != (-d4Var.f) + d4Var.e || (w0Var = d4Var.x) == null || (f12 < 0.0f && w0Var.getScrollY() == 0))) {
                                d4Var.c = true;
                                MotionEvent obtain = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
                                for (int i10 = 0; i10 < d4Var.getChildCount(); i10++) {
                                    d4Var.getChildAt(i10).dispatchTouchEvent(obtain);
                                }
                                obtain.recycle();
                                return true;
                            }
                            org.telegram.ui.web.w0 w0Var2 = d4Var.x;
                            if (w0Var2 != null) {
                                break;
                            }
                            if (Math.abs(f10) >= f16) {
                                break;
                            }
                        } else {
                            d4Var.d = true;
                        }
                    }
                }
                if (d4Var.c) {
                    if (f12 < 0.0f) {
                        float f17 = d4Var.r;
                        if (f17 > (-d4Var.f) + d4Var.e) {
                            d4Var.r = f17 - f12;
                        } else {
                            if (d4Var.x != null) {
                                float scrollY = r6.getScrollY() + f12;
                                d4Var.x.setScrollY((int) h7.n.a(scrollY, 0.0f, Math.max(r2.getContentHeight(), d4Var.x.getHeight()) - d4Var.e));
                                if (scrollY < 0.0f) {
                                    d4Var.r -= scrollY;
                                }
                            } else {
                                d4Var.r = f17 - f12;
                            }
                        }
                    } else if (f12 > 0.0f) {
                        float f18 = d4Var.r - f12;
                        d4Var.r = f18;
                        if (d4Var.x != null && f18 < (-d4Var.f) + d4Var.e) {
                            float scrollY2 = r2.getScrollY() - ((d4Var.r + d4Var.f) - d4Var.e);
                            d4Var.x.setScrollY((int) h7.n.a(scrollY2, 0.0f, Math.max(r5.getContentHeight(), d4Var.x.getHeight()) - d4Var.e));
                        }
                    }
                    float a2 = h7.n.a(d4Var.r, (-d4Var.f) + d4Var.e, (d4Var.getHeight() - d4Var.f) + d4Var.e);
                    d4Var.r = a2;
                    if (d4Var.F && !d4Var.H) {
                        d4Var.r = Math.min(a2, (-d4Var.f) + d4Var.e);
                    }
                    d4Var.c();
                }
                return true;
            case 1:
                ir irVar = (ir) this.c;
                if (irVar.n || irVar.f) {
                    float abs3 = Math.abs(f10);
                    float f19 = this.b;
                    if (abs3 >= f19 || Math.abs(f11) >= f19) {
                        irVar.n = false;
                        irVar.f = false;
                        irVar.removeCallbacks(irVar.r);
                        irVar.removeCallbacks(irVar.h);
                    }
                }
                return false;
            default:
                hg0 hg0Var = (hg0) this.c;
                if (hg0Var.e || hg0Var.h) {
                    motionEvent3 = motionEvent2;
                } else {
                    if (hg0Var.y || hg0Var.b != 1.0f || f10 > (-this.b) || Math.abs(f10) < Math.abs(1.5f * f11)) {
                        motionEvent3 = motionEvent2;
                    } else {
                        motionEvent3 = motionEvent2;
                        if (!hg0Var.d(motionEvent3, hg0Var.getChildAt(hg0Var.b > 0.5f ? 1 : 0))) {
                            hg0Var.e = true;
                            MotionEvent obtain2 = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
                            for (int i11 = 0; i11 < hg0Var.getChildCount(); i11++) {
                                hg0Var.getChildAt(i11).dispatchTouchEvent(obtain2);
                            }
                            obtain2.recycle();
                        }
                    }
                    hg0Var.h = true;
                }
                if (hg0Var.e) {
                    hg0Var.c = -1.0f;
                    hg0Var.b = 1.0f - Math.max(0.0f, Math.min(1.0f, (motionEvent3.getX() - motionEvent.getX()) / hg0Var.getWidth()));
                    hg0Var.c(true);
                }
                return hg0Var.e;
        }
    }
}
