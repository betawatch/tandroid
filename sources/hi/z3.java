package hi;

import android.graphics.Typeface;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewGroup;
import c8.j9;
import org.telegram.ui.Components.br;
import org.telegram.ui.Components.ve0;
import org.telegram.ui.Components.yq;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes4.dex */
public final class z3 extends GestureDetector.SimpleOnGestureListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ ViewGroup c;

    public /* synthetic */ z3(ViewGroup viewGroup, int i7, int i10) {
        this.a = i10;
        this.c = viewGroup;
        this.b = i7;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onDown(MotionEvent motionEvent) {
        switch (this.a) {
            case 1:
                br brVar = (br) this.c;
                yq yqVar = brVar.r;
                if (brVar.n) {
                    brVar.removeCallbacks(yqVar);
                }
                brVar.n = true;
                brVar.postDelayed(yqVar, 200L);
                brVar.h.run();
                return true;
            case 2:
                return true;
            default:
                return super.onDown(motionEvent);
        }
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        org.telegram.ui.web.u0 u0Var;
        int i7 = this.a;
        ViewGroup viewGroup = this.c;
        switch (i7) {
            case 0:
                b4 b4Var = (b4) viewGroup;
                if (b4Var.d || !b4Var.M) {
                    return false;
                }
                if (b4Var.J && !b4Var.L) {
                    return false;
                }
                if (b4Var.N && !b4Var.b(false)) {
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
                if (f11 >= org.telegram.messenger.g0.L(650.0f) && ((sqrt > org.telegram.messenger.g0.L(200.0f) || eventTime > 250.0f) && ((u0Var = b4Var.y) == null || u0Var.getScrollY() == 0))) {
                    b4Var.x = true;
                    float f14 = b4Var.r;
                    if (f14 < b4Var.H && !b4Var.J) {
                        b4Var.e(0.0f);
                    } else if (b4Var.J && b4Var.L && (b4Var.Q == (-b4Var.f) + b4Var.e || (f14 <= (-r9) && f11 < org.telegram.messenger.g0.L(1200.0f)))) {
                        b4Var.e((-b4Var.f) + b4Var.e);
                    } else {
                        a4 a4Var = b4Var.F;
                        if (a4Var != null) {
                            a4Var.q(false);
                        }
                    }
                } else {
                    if (f11 > -700.0f) {
                        return false;
                    }
                    float f15 = b4Var.r;
                    float f16 = (-b4Var.f) + b4Var.e;
                    if (f15 <= f16) {
                        return false;
                    }
                    b4Var.x = true;
                    b4Var.e(f16);
                }
                return true;
            case 1:
            default:
                return super.onFling(motionEvent, motionEvent2, f10, f11);
            case 2:
                ve0 ve0Var = (ve0) viewGroup;
                if (!ve0Var.f && !ve0Var.h && f10 >= 600.0f) {
                    ve0Var.e = false;
                    ve0Var.h = false;
                    ve0Var.a(0.0f, f10 / 6000.0f);
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
        org.telegram.ui.web.u0 u0Var;
        MotionEvent motionEvent3;
        switch (this.a) {
            case 0:
                b4 b4Var = (b4) this.c;
                if (b4Var.S) {
                    f12 = f11;
                } else {
                    float f13 = b4Var.R + f11;
                    b4Var.R = f13;
                    float abs = Math.abs(f13);
                    float f14 = b4Var.T;
                    if (abs > f14) {
                        b4Var.S = true;
                        float f15 = b4Var.R;
                        f12 = f15 > 0.0f ? f15 - f14 : f15 + f14;
                    } else {
                        f12 = 0.0f;
                    }
                }
                if (!b4Var.c && !b4Var.d && b4Var.M) {
                    if (!b4Var.N || b4Var.r != (-b4Var.f) + b4Var.e || b4Var.b(false)) {
                        if (!((Boolean) b4Var.I.j(null)).booleanValue() || b4Var.r != (-b4Var.f) + b4Var.e) {
                            float abs2 = Math.abs(f12);
                            float f16 = this.b;
                            if (abs2 >= f16 && Math.abs(f12) * 1.5f >= Math.abs(f10) && (b4Var.r != (-b4Var.f) + b4Var.e || (u0Var = b4Var.y) == null || (f12 < 0.0f && u0Var.getScrollY() == 0))) {
                                b4Var.c = true;
                                MotionEvent obtain = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
                                for (int i7 = 0; i7 < b4Var.getChildCount(); i7++) {
                                    b4Var.getChildAt(i7).dispatchTouchEvent(obtain);
                                }
                                obtain.recycle();
                                return true;
                            }
                            org.telegram.ui.web.u0 u0Var2 = b4Var.y;
                            if (u0Var2 != null) {
                                break;
                            }
                            if (Math.abs(f10) >= f16) {
                                break;
                            }
                        } else {
                            b4Var.d = true;
                        }
                    }
                }
                if (b4Var.c) {
                    if (f12 < 0.0f) {
                        float f17 = b4Var.r;
                        if (f17 > (-b4Var.f) + b4Var.e) {
                            b4Var.r = f17 - f12;
                        } else {
                            if (b4Var.y != null) {
                                float scrollY = r6.getScrollY() + f12;
                                b4Var.y.setScrollY((int) j9.a(scrollY, 0.0f, Math.max(r2.getContentHeight(), b4Var.y.getHeight()) - b4Var.e));
                                if (scrollY < 0.0f) {
                                    b4Var.r -= scrollY;
                                }
                            } else {
                                b4Var.r = f17 - f12;
                            }
                        }
                    } else if (f12 > 0.0f) {
                        float f18 = b4Var.r - f12;
                        b4Var.r = f18;
                        if (b4Var.y != null && f18 < (-b4Var.f) + b4Var.e) {
                            float scrollY2 = r2.getScrollY() - ((b4Var.r + b4Var.f) - b4Var.e);
                            b4Var.y.setScrollY((int) j9.a(scrollY2, 0.0f, Math.max(r5.getContentHeight(), b4Var.y.getHeight()) - b4Var.e));
                        }
                    }
                    float a10 = j9.a(b4Var.r, (-b4Var.f) + b4Var.e, (b4Var.getHeight() - b4Var.f) + b4Var.e);
                    b4Var.r = a10;
                    if (b4Var.J && !b4Var.L) {
                        b4Var.r = Math.min(a10, (-b4Var.f) + b4Var.e);
                    }
                    b4Var.c();
                }
                return true;
            case 1:
                br brVar = (br) this.c;
                if (brVar.n || brVar.f) {
                    float abs3 = Math.abs(f10);
                    float f19 = this.b;
                    if (abs3 >= f19 || Math.abs(f11) >= f19) {
                        brVar.n = false;
                        brVar.f = false;
                        brVar.removeCallbacks(brVar.r);
                        brVar.removeCallbacks(brVar.h);
                    }
                }
                return false;
            default:
                ve0 ve0Var = (ve0) this.c;
                if (ve0Var.e || ve0Var.h) {
                    motionEvent3 = motionEvent2;
                } else {
                    if (ve0Var.D || ve0Var.b != 1.0f || f10 > (-this.b) || Math.abs(f10) < Math.abs(1.5f * f11)) {
                        motionEvent3 = motionEvent2;
                    } else {
                        motionEvent3 = motionEvent2;
                        if (!ve0Var.d(ve0Var.getChildAt(ve0Var.b > 0.5f ? 1 : 0), motionEvent3)) {
                            ve0Var.e = true;
                            MotionEvent obtain2 = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
                            for (int i10 = 0; i10 < ve0Var.getChildCount(); i10++) {
                                ve0Var.getChildAt(i10).dispatchTouchEvent(obtain2);
                            }
                            obtain2.recycle();
                        }
                    }
                    ve0Var.h = true;
                }
                if (ve0Var.e) {
                    ve0Var.c = -1.0f;
                    ve0Var.b = 1.0f - Math.max(0.0f, Math.min(1.0f, (motionEvent3.getX() - motionEvent.getX()) / ve0Var.getWidth()));
                    ve0Var.c(true);
                }
                return ve0Var.e;
        }
    }
}
