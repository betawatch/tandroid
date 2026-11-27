// default package

import android.graphics.Typeface;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewGroup;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class g22 extends GestureDetector.SimpleOnGestureListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;
    public final /* synthetic */ ViewGroup c;

    public /* synthetic */ g22(ViewGroup viewGroup, int i, byte b) {
        this.a = b;
        this.c = viewGroup;
        this.b = i;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        switch (this.a) {
            case 1:
                k53 k53Var = (k53) this.c;
                h53 h53Var = k53Var.r;
                if (k53Var.n) {
                    k53Var.removeCallbacks(h53Var);
                }
                k53Var.n = true;
                k53Var.postDelayed(h53Var, 200L);
                k53Var.h.run();
                return true;
            case 2:
                return true;
            default:
                return super.onDown(motionEvent);
        }
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        nv0 nv0Var;
        byte b = this.a;
        ViewGroup viewGroup = this.c;
        switch (b) {
            case 0:
                i22 i22Var = (i22) viewGroup;
                if (i22Var.d || !i22Var.N) {
                    return false;
                }
                if (i22Var.K && !i22Var.M) {
                    return false;
                }
                if (i22Var.O && !i22Var.b(false)) {
                    return false;
                }
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                float x2 = motionEvent2.getX();
                float y2 = motionEvent2.getY();
                Typeface typeface = hl.a;
                float f3 = x2 - x;
                float f4 = y2 - y;
                float sqrt = (float) Math.sqrt((f4 * f4) + (f3 * f3));
                float eventTime = motionEvent2.getEventTime() - motionEvent.getEventTime();
                if (f2 >= hl.L(650.0f) && ((sqrt > hl.L(200.0f) || eventTime > 250.0f) && ((nv0Var = i22Var.y) == null || nv0Var.getScrollY() == 0))) {
                    i22Var.x = true;
                    float f5 = i22Var.r;
                    if (f5 < i22Var.I && !i22Var.K) {
                        i22Var.d(0.0f);
                    } else if (i22Var.K && i22Var.M && (i22Var.R == (-i22Var.f) + i22Var.e || (f5 <= (-r7) && f2 < hl.L(1200.0f)))) {
                        i22Var.d((-i22Var.f) + i22Var.e);
                    } else {
                        h22 h22Var = i22Var.G;
                        if (h22Var != null) {
                            h22Var.e(false);
                        }
                    }
                } else {
                    if (f2 > -700.0f) {
                        return false;
                    }
                    float f6 = i22Var.r;
                    float f7 = (-i22Var.f) + i22Var.e;
                    if (f6 <= f7) {
                        return false;
                    }
                    i22Var.x = true;
                    i22Var.d(f7);
                }
                return true;
            case 1:
            default:
                return super.onFling(motionEvent, motionEvent2, f, f2);
            case 2:
                fj8 fj8Var = (fj8) viewGroup;
                if (!fj8Var.f && !fj8Var.h && f >= 600.0f) {
                    fj8Var.e = false;
                    fj8Var.h = false;
                    fj8Var.a(0.0f, f / 6000.0f);
                }
                return false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:91:0x0195, code lost:
    
        if (r6.canScrollHorizontally(r19 >= 0.0f ? 1 : -1) == false) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01ac, code lost:
    
        r0.d = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01aa, code lost:
    
        if ((java.lang.Math.abs(r19) * 1.5f) >= java.lang.Math.abs(r1)) goto L101;
     */
    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        float f3;
        nv0 nv0Var;
        MotionEvent motionEvent3;
        byte b = this.a;
        int i = this.b;
        ViewGroup viewGroup = this.c;
        int i2 = 0;
        switch (b) {
            case 0:
                i22 i22Var = (i22) viewGroup;
                if (i22Var.T) {
                    f3 = f2;
                } else {
                    float f4 = i22Var.S + f2;
                    i22Var.S = f4;
                    float abs = Math.abs(f4);
                    float f5 = i22Var.U;
                    if (abs > f5) {
                        i22Var.T = true;
                        float f6 = i22Var.S;
                        f3 = f6 > 0.0f ? f6 - f5 : f6 + f5;
                    } else {
                        f3 = 0.0f;
                    }
                }
                if (!i22Var.c && !i22Var.d && i22Var.N && (!i22Var.O || i22Var.r != (-i22Var.f) + i22Var.e || i22Var.b(false))) {
                    if (((Boolean) i22Var.J.h(null)).booleanValue() && i22Var.r == (-i22Var.f) + i22Var.e) {
                        i22Var.d = true;
                    } else {
                        float f7 = i;
                        if (Math.abs(f3) >= f7 && Math.abs(f3) * 1.5f >= Math.abs(f) && (i22Var.r != (-i22Var.f) + i22Var.e || (nv0Var = i22Var.y) == null || (f3 < 0.0f && nv0Var.getScrollY() == 0))) {
                            i22Var.c = true;
                            MotionEvent obtain = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
                            while (i2 < i22Var.getChildCount()) {
                                i22Var.getChildAt(i2).dispatchTouchEvent(obtain);
                                i2++;
                            }
                            obtain.recycle();
                            return true;
                        }
                        nv0 nv0Var2 = i22Var.y;
                        if (nv0Var2 != null) {
                            break;
                        }
                        if (Math.abs(f) >= f7) {
                            break;
                        }
                    }
                }
                if (i22Var.c) {
                    if (f3 < 0.0f) {
                        float f8 = i22Var.r;
                        if (f8 > (-i22Var.f) + i22Var.e) {
                            i22Var.r = f8 - f3;
                        } else {
                            if (i22Var.y != null) {
                                float scrollY = r5.getScrollY() + f3;
                                i22Var.y.setScrollY((int) ete.a(scrollY, 0.0f, Math.max(r1.getContentHeight(), i22Var.y.getHeight()) - i22Var.e));
                                if (scrollY < 0.0f) {
                                    i22Var.r -= scrollY;
                                }
                            } else {
                                i22Var.r = f8 - f3;
                            }
                        }
                    } else if (f3 > 0.0f) {
                        float f9 = i22Var.r - f3;
                        i22Var.r = f9;
                        if (i22Var.y != null && f9 < (-i22Var.f) + i22Var.e) {
                            float scrollY2 = r1.getScrollY() - ((i22Var.r + i22Var.f) - i22Var.e);
                            i22Var.y.setScrollY((int) ete.a(scrollY2, 0.0f, Math.max(r3.getContentHeight(), i22Var.y.getHeight()) - i22Var.e));
                        }
                    }
                    float a = ete.a(i22Var.r, (-i22Var.f) + i22Var.e, (i22Var.getHeight() - i22Var.f) + i22Var.e);
                    i22Var.r = a;
                    if (i22Var.K && !i22Var.M) {
                        i22Var.r = Math.min(a, (-i22Var.f) + i22Var.e);
                    }
                    i22Var.c();
                }
                return true;
            case 1:
                k53 k53Var = (k53) viewGroup;
                if (k53Var.n || k53Var.f) {
                    float f10 = i;
                    if (Math.abs(f) >= f10 || Math.abs(f2) >= f10) {
                        k53Var.n = false;
                        k53Var.f = false;
                        k53Var.removeCallbacks(k53Var.r);
                        k53Var.removeCallbacks(k53Var.h);
                    }
                }
                return false;
            default:
                fj8 fj8Var = (fj8) viewGroup;
                if (fj8Var.e || fj8Var.h) {
                    motionEvent3 = motionEvent2;
                } else {
                    if (fj8Var.E || fj8Var.b != 1.0f || f > (-i) || Math.abs(f) < Math.abs(1.5f * f2)) {
                        motionEvent3 = motionEvent2;
                    } else {
                        motionEvent3 = motionEvent2;
                        if (!fj8Var.d(fj8Var.getChildAt(fj8Var.b > 0.5f ? 1 : 0), motionEvent3)) {
                            fj8Var.e = true;
                            MotionEvent obtain2 = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
                            while (i2 < fj8Var.getChildCount()) {
                                fj8Var.getChildAt(i2).dispatchTouchEvent(obtain2);
                                i2++;
                            }
                            obtain2.recycle();
                        }
                    }
                    fj8Var.h = true;
                }
                if (fj8Var.e) {
                    fj8Var.c = -1.0f;
                    fj8Var.b = 1.0f - Math.max(0.0f, Math.min(1.0f, (motionEvent3.getX() - motionEvent.getX()) / fj8Var.getWidth()));
                    fj8Var.c(true);
                }
                return fj8Var.e;
        }
    }
}
