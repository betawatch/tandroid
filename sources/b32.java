// default package

import android.graphics.Typeface;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewGroup;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class b32 extends GestureDetector.SimpleOnGestureListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;
    public final /* synthetic */ ViewGroup c;

    public /* synthetic */ b32(ViewGroup viewGroup, int i, byte b) {
        this.a = b;
        this.c = viewGroup;
        this.b = i;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        switch (this.a) {
            case 1:
                d63 d63Var = (d63) this.c;
                a63 a63Var = d63Var.r;
                if (d63Var.n) {
                    d63Var.removeCallbacks(a63Var);
                }
                d63Var.n = true;
                d63Var.postDelayed(a63Var, 200L);
                d63Var.h.run();
                return true;
            case 2:
                return true;
            default:
                return super.onDown(motionEvent);
        }
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        mw0 mw0Var;
        byte b = this.a;
        ViewGroup viewGroup = this.c;
        switch (b) {
            case 0:
                d32 d32Var = (d32) viewGroup;
                if (d32Var.d || !d32Var.N) {
                    return false;
                }
                if (d32Var.K && !d32Var.M) {
                    return false;
                }
                if (d32Var.O && !d32Var.b(false)) {
                    return false;
                }
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                float x2 = motionEvent2.getX();
                float y2 = motionEvent2.getY();
                Typeface typeface = gm.a;
                float f3 = x2 - x;
                float f4 = y2 - y;
                float sqrt = (float) Math.sqrt((f4 * f4) + (f3 * f3));
                float eventTime = motionEvent2.getEventTime() - motionEvent.getEventTime();
                if (f2 >= gm.L(650.0f) && ((sqrt > gm.L(200.0f) || eventTime > 250.0f) && ((mw0Var = d32Var.y) == null || mw0Var.getScrollY() == 0))) {
                    d32Var.x = true;
                    float f5 = d32Var.r;
                    if (f5 < d32Var.I && !d32Var.K) {
                        d32Var.d(0.0f);
                    } else if (d32Var.K && d32Var.M && (d32Var.R == (-d32Var.f) + d32Var.e || (f5 <= (-r7) && f2 < gm.L(1200.0f)))) {
                        d32Var.d((-d32Var.f) + d32Var.e);
                    } else {
                        c32 c32Var = d32Var.G;
                        if (c32Var != null) {
                            c32Var.e(false);
                        }
                    }
                } else {
                    if (f2 > -700.0f) {
                        return false;
                    }
                    float f6 = d32Var.r;
                    float f7 = (-d32Var.f) + d32Var.e;
                    if (f6 <= f7) {
                        return false;
                    }
                    d32Var.x = true;
                    d32Var.d(f7);
                }
                return true;
            case 1:
            default:
                return super.onFling(motionEvent, motionEvent2, f, f2);
            case 2:
                th8 th8Var = (th8) viewGroup;
                if (!th8Var.f && !th8Var.h && f >= 600.0f) {
                    th8Var.e = false;
                    th8Var.h = false;
                    th8Var.a(0.0f, f / 6000.0f);
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
        mw0 mw0Var;
        MotionEvent motionEvent3;
        byte b = this.a;
        int i = this.b;
        ViewGroup viewGroup = this.c;
        int i2 = 0;
        switch (b) {
            case 0:
                d32 d32Var = (d32) viewGroup;
                if (d32Var.T) {
                    f3 = f2;
                } else {
                    float f4 = d32Var.S + f2;
                    d32Var.S = f4;
                    float abs = Math.abs(f4);
                    float f5 = d32Var.U;
                    if (abs > f5) {
                        d32Var.T = true;
                        float f6 = d32Var.S;
                        f3 = f6 > 0.0f ? f6 - f5 : f6 + f5;
                    } else {
                        f3 = 0.0f;
                    }
                }
                if (!d32Var.c && !d32Var.d && d32Var.N && (!d32Var.O || d32Var.r != (-d32Var.f) + d32Var.e || d32Var.b(false))) {
                    if (((Boolean) d32Var.J.l(null)).booleanValue() && d32Var.r == (-d32Var.f) + d32Var.e) {
                        d32Var.d = true;
                    } else {
                        float f7 = i;
                        if (Math.abs(f3) >= f7 && Math.abs(f3) * 1.5f >= Math.abs(f) && (d32Var.r != (-d32Var.f) + d32Var.e || (mw0Var = d32Var.y) == null || (f3 < 0.0f && mw0Var.getScrollY() == 0))) {
                            d32Var.c = true;
                            MotionEvent obtain = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
                            while (i2 < d32Var.getChildCount()) {
                                d32Var.getChildAt(i2).dispatchTouchEvent(obtain);
                                i2++;
                            }
                            obtain.recycle();
                            return true;
                        }
                        mw0 mw0Var2 = d32Var.y;
                        if (mw0Var2 != null) {
                            break;
                        }
                        if (Math.abs(f) >= f7) {
                            break;
                        }
                    }
                }
                if (d32Var.c) {
                    if (f3 < 0.0f) {
                        float f8 = d32Var.r;
                        if (f8 > (-d32Var.f) + d32Var.e) {
                            d32Var.r = f8 - f3;
                        } else {
                            if (d32Var.y != null) {
                                float scrollY = r5.getScrollY() + f3;
                                d32Var.y.setScrollY((int) pqe.a(scrollY, 0.0f, Math.max(r1.getContentHeight(), d32Var.y.getHeight()) - d32Var.e));
                                if (scrollY < 0.0f) {
                                    d32Var.r -= scrollY;
                                }
                            } else {
                                d32Var.r = f8 - f3;
                            }
                        }
                    } else if (f3 > 0.0f) {
                        float f9 = d32Var.r - f3;
                        d32Var.r = f9;
                        if (d32Var.y != null && f9 < (-d32Var.f) + d32Var.e) {
                            float scrollY2 = r1.getScrollY() - ((d32Var.r + d32Var.f) - d32Var.e);
                            d32Var.y.setScrollY((int) pqe.a(scrollY2, 0.0f, Math.max(r3.getContentHeight(), d32Var.y.getHeight()) - d32Var.e));
                        }
                    }
                    float a = pqe.a(d32Var.r, (-d32Var.f) + d32Var.e, (d32Var.getHeight() - d32Var.f) + d32Var.e);
                    d32Var.r = a;
                    if (d32Var.K && !d32Var.M) {
                        d32Var.r = Math.min(a, (-d32Var.f) + d32Var.e);
                    }
                    d32Var.c();
                }
                return true;
            case 1:
                d63 d63Var = (d63) viewGroup;
                if (d63Var.n || d63Var.f) {
                    float f10 = i;
                    if (Math.abs(f) >= f10 || Math.abs(f2) >= f10) {
                        d63Var.n = false;
                        d63Var.f = false;
                        d63Var.removeCallbacks(d63Var.r);
                        d63Var.removeCallbacks(d63Var.h);
                    }
                }
                return false;
            default:
                th8 th8Var = (th8) viewGroup;
                if (th8Var.e || th8Var.h) {
                    motionEvent3 = motionEvent2;
                } else {
                    if (th8Var.E || th8Var.b != 1.0f || f > (-i) || Math.abs(f) < Math.abs(1.5f * f2)) {
                        motionEvent3 = motionEvent2;
                    } else {
                        motionEvent3 = motionEvent2;
                        if (!th8Var.d(th8Var.getChildAt(th8Var.b > 0.5f ? 1 : 0), motionEvent3)) {
                            th8Var.e = true;
                            MotionEvent obtain2 = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
                            while (i2 < th8Var.getChildCount()) {
                                th8Var.getChildAt(i2).dispatchTouchEvent(obtain2);
                                i2++;
                            }
                            obtain2.recycle();
                        }
                    }
                    th8Var.h = true;
                }
                if (th8Var.e) {
                    th8Var.c = -1.0f;
                    th8Var.b = 1.0f - Math.max(0.0f, Math.min(1.0f, (motionEvent3.getX() - motionEvent.getX()) / th8Var.getWidth()));
                    th8Var.c(true);
                }
                return th8Var.e;
        }
    }
}
