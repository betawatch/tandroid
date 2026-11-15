package ki;

import android.graphics.Typeface;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewGroup;
import c8.i9;
import org.telegram.ui.Components.fr;
import org.telegram.ui.Components.ir;
import org.telegram.ui.Components.ye0;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes4.dex */
public final class v3 extends GestureDetector.SimpleOnGestureListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ ViewGroup c;

    public /* synthetic */ v3(ViewGroup viewGroup, int i7, int i10) {
        this.a = i10;
        this.c = viewGroup;
        this.b = i7;
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
        org.telegram.ui.web.s0 s0Var;
        int i7 = this.a;
        ViewGroup viewGroup = this.c;
        switch (i7) {
            case 0:
                x3 x3Var = (x3) viewGroup;
                if (x3Var.d || !x3Var.N) {
                    return false;
                }
                if (x3Var.K && !x3Var.M) {
                    return false;
                }
                if (x3Var.O && !x3Var.b(false)) {
                    return false;
                }
                float x10 = motionEvent.getX();
                float y10 = motionEvent.getY();
                float x11 = motionEvent2.getX();
                float y11 = motionEvent2.getY();
                Typeface typeface = org.telegram.messenger.g0.a;
                float f12 = x11 - x10;
                float f13 = y11 - y10;
                float sqrt = (float) Math.sqrt((f13 * f13) + (f12 * f12));
                float eventTime = motionEvent2.getEventTime() - motionEvent.getEventTime();
                if (f11 >= org.telegram.messenger.g0.L(650.0f) && ((sqrt > org.telegram.messenger.g0.L(200.0f) || eventTime > 250.0f) && ((s0Var = x3Var.y) == null || s0Var.getScrollY() == 0))) {
                    x3Var.x = true;
                    float f14 = x3Var.r;
                    if (f14 < x3Var.I && !x3Var.K) {
                        x3Var.e(0.0f);
                    } else if (x3Var.K && x3Var.M && (x3Var.R == (-x3Var.f) + x3Var.e || (f14 <= (-r9) && f11 < org.telegram.messenger.g0.L(1200.0f)))) {
                        x3Var.e((-x3Var.f) + x3Var.e);
                    } else {
                        w3 w3Var = x3Var.G;
                        if (w3Var != null) {
                            w3Var.b(false);
                        }
                    }
                } else {
                    if (f11 > -700.0f) {
                        return false;
                    }
                    float f15 = x3Var.r;
                    float f16 = (-x3Var.f) + x3Var.e;
                    if (f15 <= f16) {
                        return false;
                    }
                    x3Var.x = true;
                    x3Var.e(f16);
                }
                return true;
            case 1:
            default:
                return super.onFling(motionEvent, motionEvent2, f10, f11);
            case 2:
                ye0 ye0Var = (ye0) viewGroup;
                if (!ye0Var.f && !ye0Var.h && f10 >= 600.0f) {
                    ye0Var.e = false;
                    ye0Var.h = false;
                    ye0Var.a(0.0f, f10 / 6000.0f);
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
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        float f12;
        org.telegram.ui.web.s0 s0Var;
        MotionEvent motionEvent3;
        switch (this.a) {
            case 0:
                x3 x3Var = (x3) this.c;
                if (x3Var.T) {
                    f12 = f11;
                } else {
                    float f13 = x3Var.S + f11;
                    x3Var.S = f13;
                    float abs = Math.abs(f13);
                    float f14 = x3Var.U;
                    if (abs > f14) {
                        x3Var.T = true;
                        float f15 = x3Var.S;
                        f12 = f15 > 0.0f ? f15 - f14 : f15 + f14;
                    } else {
                        f12 = 0.0f;
                    }
                }
                if (!x3Var.c && !x3Var.d && x3Var.N) {
                    if (!x3Var.O || x3Var.r != (-x3Var.f) + x3Var.e || x3Var.b(false)) {
                        if (!((Boolean) x3Var.J.o(null)).booleanValue() || x3Var.r != (-x3Var.f) + x3Var.e) {
                            float abs2 = Math.abs(f12);
                            float f16 = this.b;
                            if (abs2 >= f16 && Math.abs(f12) * 1.5f >= Math.abs(f10) && (x3Var.r != (-x3Var.f) + x3Var.e || (s0Var = x3Var.y) == null || (f12 < 0.0f && s0Var.getScrollY() == 0))) {
                                x3Var.c = true;
                                MotionEvent obtain = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
                                for (int i7 = 0; i7 < x3Var.getChildCount(); i7++) {
                                    x3Var.getChildAt(i7).dispatchTouchEvent(obtain);
                                }
                                obtain.recycle();
                                return true;
                            }
                            org.telegram.ui.web.s0 s0Var2 = x3Var.y;
                            if (s0Var2 != null) {
                                break;
                            }
                            if (Math.abs(f10) >= f16) {
                                break;
                            }
                        } else {
                            x3Var.d = true;
                        }
                    }
                }
                if (x3Var.c) {
                    if (f12 < 0.0f) {
                        float f17 = x3Var.r;
                        if (f17 > (-x3Var.f) + x3Var.e) {
                            x3Var.r = f17 - f12;
                        } else {
                            if (x3Var.y != null) {
                                float scrollY = r6.getScrollY() + f12;
                                x3Var.y.setScrollY((int) i9.a(scrollY, 0.0f, Math.max(r2.getContentHeight(), x3Var.y.getHeight()) - x3Var.e));
                                if (scrollY < 0.0f) {
                                    x3Var.r -= scrollY;
                                }
                            } else {
                                x3Var.r = f17 - f12;
                            }
                        }
                    } else if (f12 > 0.0f) {
                        float f18 = x3Var.r - f12;
                        x3Var.r = f18;
                        if (x3Var.y != null && f18 < (-x3Var.f) + x3Var.e) {
                            float scrollY2 = r2.getScrollY() - ((x3Var.r + x3Var.f) - x3Var.e);
                            x3Var.y.setScrollY((int) i9.a(scrollY2, 0.0f, Math.max(r5.getContentHeight(), x3Var.y.getHeight()) - x3Var.e));
                        }
                    }
                    float a10 = i9.a(x3Var.r, (-x3Var.f) + x3Var.e, (x3Var.getHeight() - x3Var.f) + x3Var.e);
                    x3Var.r = a10;
                    if (x3Var.K && !x3Var.M) {
                        x3Var.r = Math.min(a10, (-x3Var.f) + x3Var.e);
                    }
                    x3Var.c();
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
                ye0 ye0Var = (ye0) this.c;
                if (ye0Var.e || ye0Var.h) {
                    motionEvent3 = motionEvent2;
                } else {
                    if (ye0Var.E || ye0Var.b != 1.0f || f10 > (-this.b) || Math.abs(f10) < Math.abs(1.5f * f11)) {
                        motionEvent3 = motionEvent2;
                    } else {
                        motionEvent3 = motionEvent2;
                        if (!ye0Var.d(ye0Var.getChildAt(ye0Var.b > 0.5f ? 1 : 0), motionEvent3)) {
                            ye0Var.e = true;
                            MotionEvent obtain2 = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
                            for (int i10 = 0; i10 < ye0Var.getChildCount(); i10++) {
                                ye0Var.getChildAt(i10).dispatchTouchEvent(obtain2);
                            }
                            obtain2.recycle();
                        }
                    }
                    ye0Var.h = true;
                }
                if (ye0Var.e) {
                    ye0Var.c = -1.0f;
                    ye0Var.b = 1.0f - Math.max(0.0f, Math.min(1.0f, (motionEvent3.getX() - motionEvent.getX()) / ye0Var.getWidth()));
                    ye0Var.c(true);
                }
                return ye0Var.e;
        }
    }
}
