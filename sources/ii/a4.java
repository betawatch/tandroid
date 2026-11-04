package ii;

import android.graphics.Typeface;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewGroup;
import b8.be;
import org.telegram.ui.Components.br;
import org.telegram.ui.Components.xe0;
import org.telegram.ui.Components.yq;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class a4 extends GestureDetector.SimpleOnGestureListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ ViewGroup c;

    public /* synthetic */ a4(ViewGroup viewGroup, int i3, int i10) {
        this.a = i10;
        this.c = viewGroup;
        this.b = i3;
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
        org.telegram.ui.web.t0 t0Var;
        int i3 = this.a;
        ViewGroup viewGroup = this.c;
        switch (i3) {
            case 0:
                c4 c4Var = (c4) viewGroup;
                if (c4Var.d || !c4Var.N) {
                    return false;
                }
                if (c4Var.K && !c4Var.M) {
                    return false;
                }
                if (c4Var.O && !c4Var.b(false)) {
                    return false;
                }
                float x10 = motionEvent.getX();
                float y9 = motionEvent.getY();
                float x11 = motionEvent2.getX();
                float y10 = motionEvent2.getY();
                Typeface typeface = org.telegram.messenger.g0.a;
                float f12 = x11 - x10;
                float f13 = y10 - y9;
                float sqrt = (float) Math.sqrt((f13 * f13) + (f12 * f12));
                float eventTime = motionEvent2.getEventTime() - motionEvent.getEventTime();
                if (f11 >= org.telegram.messenger.g0.L(650.0f) && ((sqrt > org.telegram.messenger.g0.L(200.0f) || eventTime > 250.0f) && ((t0Var = c4Var.y) == null || t0Var.getScrollY() == 0))) {
                    c4Var.x = true;
                    float f14 = c4Var.r;
                    if (f14 < c4Var.I && !c4Var.K) {
                        c4Var.e(0.0f);
                    } else if (c4Var.K && c4Var.M && (c4Var.R == (-c4Var.f) + c4Var.e || (f14 <= (-r9) && f11 < org.telegram.messenger.g0.L(1200.0f)))) {
                        c4Var.e((-c4Var.f) + c4Var.e);
                    } else {
                        b4 b4Var = c4Var.G;
                        if (b4Var != null) {
                            b4Var.a(false);
                        }
                    }
                } else {
                    if (f11 > -700.0f) {
                        return false;
                    }
                    float f15 = c4Var.r;
                    float f16 = (-c4Var.f) + c4Var.e;
                    if (f15 <= f16) {
                        return false;
                    }
                    c4Var.x = true;
                    c4Var.e(f16);
                }
                return true;
            case 1:
            default:
                return super.onFling(motionEvent, motionEvent2, f10, f11);
            case 2:
                xe0 xe0Var = (xe0) viewGroup;
                if (!xe0Var.f && !xe0Var.h && f10 >= 600.0f) {
                    xe0Var.e = false;
                    xe0Var.h = false;
                    xe0Var.a(0.0f, f10 / 6000.0f);
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
        org.telegram.ui.web.t0 t0Var;
        MotionEvent motionEvent3;
        switch (this.a) {
            case 0:
                c4 c4Var = (c4) this.c;
                if (c4Var.T) {
                    f12 = f11;
                } else {
                    float f13 = c4Var.S + f11;
                    c4Var.S = f13;
                    float abs = Math.abs(f13);
                    float f14 = c4Var.U;
                    if (abs > f14) {
                        c4Var.T = true;
                        float f15 = c4Var.S;
                        f12 = f15 > 0.0f ? f15 - f14 : f15 + f14;
                    } else {
                        f12 = 0.0f;
                    }
                }
                if (!c4Var.c && !c4Var.d && c4Var.N) {
                    if (!c4Var.O || c4Var.r != (-c4Var.f) + c4Var.e || c4Var.b(false)) {
                        if (!((Boolean) c4Var.J.k(null)).booleanValue() || c4Var.r != (-c4Var.f) + c4Var.e) {
                            float abs2 = Math.abs(f12);
                            float f16 = this.b;
                            if (abs2 >= f16 && Math.abs(f12) * 1.5f >= Math.abs(f10) && (c4Var.r != (-c4Var.f) + c4Var.e || (t0Var = c4Var.y) == null || (f12 < 0.0f && t0Var.getScrollY() == 0))) {
                                c4Var.c = true;
                                MotionEvent obtain = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
                                for (int i3 = 0; i3 < c4Var.getChildCount(); i3++) {
                                    c4Var.getChildAt(i3).dispatchTouchEvent(obtain);
                                }
                                obtain.recycle();
                                return true;
                            }
                            org.telegram.ui.web.t0 t0Var2 = c4Var.y;
                            if (t0Var2 != null) {
                                break;
                            }
                            if (Math.abs(f10) >= f16) {
                                break;
                            }
                        } else {
                            c4Var.d = true;
                        }
                    }
                }
                if (c4Var.c) {
                    if (f12 < 0.0f) {
                        float f17 = c4Var.r;
                        if (f17 > (-c4Var.f) + c4Var.e) {
                            c4Var.r = f17 - f12;
                        } else {
                            if (c4Var.y != null) {
                                float scrollY = r6.getScrollY() + f12;
                                c4Var.y.setScrollY((int) be.a(scrollY, 0.0f, Math.max(r2.getContentHeight(), c4Var.y.getHeight()) - c4Var.e));
                                if (scrollY < 0.0f) {
                                    c4Var.r -= scrollY;
                                }
                            } else {
                                c4Var.r = f17 - f12;
                            }
                        }
                    } else if (f12 > 0.0f) {
                        float f18 = c4Var.r - f12;
                        c4Var.r = f18;
                        if (c4Var.y != null && f18 < (-c4Var.f) + c4Var.e) {
                            float scrollY2 = r2.getScrollY() - ((c4Var.r + c4Var.f) - c4Var.e);
                            c4Var.y.setScrollY((int) be.a(scrollY2, 0.0f, Math.max(r5.getContentHeight(), c4Var.y.getHeight()) - c4Var.e));
                        }
                    }
                    float a10 = be.a(c4Var.r, (-c4Var.f) + c4Var.e, (c4Var.getHeight() - c4Var.f) + c4Var.e);
                    c4Var.r = a10;
                    if (c4Var.K && !c4Var.M) {
                        c4Var.r = Math.min(a10, (-c4Var.f) + c4Var.e);
                    }
                    c4Var.c();
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
                xe0 xe0Var = (xe0) this.c;
                if (xe0Var.e || xe0Var.h) {
                    motionEvent3 = motionEvent2;
                } else {
                    if (xe0Var.E || xe0Var.b != 1.0f || f10 > (-this.b) || Math.abs(f10) < Math.abs(1.5f * f11)) {
                        motionEvent3 = motionEvent2;
                    } else {
                        motionEvent3 = motionEvent2;
                        if (!xe0Var.d(xe0Var.getChildAt(xe0Var.b > 0.5f ? 1 : 0), motionEvent3)) {
                            xe0Var.e = true;
                            MotionEvent obtain2 = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
                            for (int i10 = 0; i10 < xe0Var.getChildCount(); i10++) {
                                xe0Var.getChildAt(i10).dispatchTouchEvent(obtain2);
                            }
                            obtain2.recycle();
                        }
                    }
                    xe0Var.h = true;
                }
                if (xe0Var.e) {
                    xe0Var.c = -1.0f;
                    xe0Var.b = 1.0f - Math.max(0.0f, Math.min(1.0f, (motionEvent3.getX() - motionEvent.getX()) / xe0Var.getWidth()));
                    xe0Var.c(true);
                }
                return xe0Var.e;
        }
    }
}
