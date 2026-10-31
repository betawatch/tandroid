package org.telegram.ui.Components;

import android.graphics.Typeface;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewGroup;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class jr extends GestureDetector.SimpleOnGestureListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ ViewGroup c;

    public /* synthetic */ jr(ViewGroup viewGroup, int i10, int i11) {
        this.a = i11;
        this.c = viewGroup;
        this.b = i10;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onDown(MotionEvent motionEvent) {
        switch (this.a) {
            case 0:
                lr lrVar = (lr) this.c;
                hr hrVar = lrVar.r;
                if (lrVar.n) {
                    lrVar.removeCallbacks(hrVar);
                }
                lrVar.n = true;
                lrVar.postDelayed(hrVar, 200L);
                lrVar.h.run();
                return true;
            case 1:
                return true;
            default:
                return super.onDown(motionEvent);
        }
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        org.telegram.ui.web.v0 v0Var;
        int i10 = this.a;
        ViewGroup viewGroup = this.c;
        switch (i10) {
            case 1:
                yf0 yf0Var = (yf0) viewGroup;
                if (!yf0Var.f && !yf0Var.h && f7 >= 600.0f) {
                    yf0Var.e = false;
                    yf0Var.h = false;
                    yf0Var.a(0.0f, f7 / 6000.0f);
                }
                return false;
            case 2:
                xh.h3 h3Var = (xh.h3) viewGroup;
                if (h3Var.d || !h3Var.M) {
                    return false;
                }
                if (h3Var.J && !h3Var.L) {
                    return false;
                }
                if (h3Var.N && !h3Var.b(false)) {
                    return false;
                }
                float x10 = motionEvent.getX();
                float y3 = motionEvent.getY();
                float x11 = motionEvent2.getX();
                float y10 = motionEvent2.getY();
                Typeface typeface = org.telegram.messenger.i0.a;
                float f11 = x11 - x10;
                float f12 = y10 - y3;
                float sqrt = (float) Math.sqrt((f12 * f12) + (f11 * f11));
                float eventTime = motionEvent2.getEventTime() - motionEvent.getEventTime();
                if (f10 >= org.telegram.messenger.i0.L(650.0f) && ((sqrt > org.telegram.messenger.i0.L(200.0f) || eventTime > 250.0f) && ((v0Var = h3Var.y) == null || v0Var.getScrollY() == 0))) {
                    h3Var.x = true;
                    float f13 = h3Var.r;
                    if (f13 < h3Var.H && !h3Var.J) {
                        h3Var.e(0.0f);
                    } else if (h3Var.J && h3Var.L && (h3Var.Q == (-h3Var.f) + h3Var.e || (f13 <= (-r9) && f10 < org.telegram.messenger.i0.L(1200.0f)))) {
                        h3Var.e((-h3Var.f) + h3Var.e);
                    } else {
                        xh.g3 g3Var = h3Var.F;
                        if (g3Var != null) {
                            g3Var.a(false);
                        }
                    }
                } else {
                    if (f10 > -700.0f) {
                        return false;
                    }
                    float f14 = h3Var.r;
                    float f15 = (-h3Var.f) + h3Var.e;
                    if (f14 <= f15) {
                        return false;
                    }
                    h3Var.x = true;
                    h3Var.e(f15);
                }
                return true;
            default:
                return super.onFling(motionEvent, motionEvent2, f7, f10);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x00da, code lost:
    
        if (r5.canScrollHorizontally(r20 >= 0.0f ? 1 : -1) == false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00f1, code lost:
    
        r1.d = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00ef, code lost:
    
        if ((java.lang.Math.abs(r20) * 1.5f) >= java.lang.Math.abs(r2)) goto L60;
     */
    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        MotionEvent motionEvent3;
        float f11;
        org.telegram.ui.web.v0 v0Var;
        switch (this.a) {
            case 0:
                lr lrVar = (lr) this.c;
                if (lrVar.n || lrVar.f) {
                    float abs = Math.abs(f7);
                    float f12 = this.b;
                    if (abs >= f12 || Math.abs(f10) >= f12) {
                        lrVar.n = false;
                        lrVar.f = false;
                        lrVar.removeCallbacks(lrVar.r);
                        lrVar.removeCallbacks(lrVar.h);
                    }
                }
                return false;
            case 1:
                yf0 yf0Var = (yf0) this.c;
                if (yf0Var.e || yf0Var.h) {
                    motionEvent3 = motionEvent2;
                } else {
                    if (yf0Var.D || yf0Var.b != 1.0f || f7 > (-this.b) || Math.abs(f7) < Math.abs(1.5f * f10)) {
                        motionEvent3 = motionEvent2;
                    } else {
                        motionEvent3 = motionEvent2;
                        if (!yf0Var.d(yf0Var.getChildAt(yf0Var.b > 0.5f ? 1 : 0), motionEvent3)) {
                            yf0Var.e = true;
                            MotionEvent obtain = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
                            for (int i10 = 0; i10 < yf0Var.getChildCount(); i10++) {
                                yf0Var.getChildAt(i10).dispatchTouchEvent(obtain);
                            }
                            obtain.recycle();
                        }
                    }
                    yf0Var.h = true;
                }
                if (yf0Var.e) {
                    yf0Var.c = -1.0f;
                    yf0Var.b = 1.0f - Math.max(0.0f, Math.min(1.0f, (motionEvent3.getX() - motionEvent.getX()) / yf0Var.getWidth()));
                    yf0Var.c(true);
                }
                return yf0Var.e;
            default:
                xh.h3 h3Var = (xh.h3) this.c;
                if (h3Var.S) {
                    f11 = f10;
                } else {
                    float f13 = h3Var.R + f10;
                    h3Var.R = f13;
                    float abs2 = Math.abs(f13);
                    float f14 = h3Var.T;
                    if (abs2 > f14) {
                        h3Var.S = true;
                        float f15 = h3Var.R;
                        f11 = f15 > 0.0f ? f15 - f14 : f15 + f14;
                    } else {
                        f11 = 0.0f;
                    }
                }
                if (!h3Var.c && !h3Var.d && h3Var.M) {
                    if (!h3Var.N || h3Var.r != (-h3Var.f) + h3Var.e || h3Var.b(false)) {
                        if (!((Boolean) h3Var.I.l(null)).booleanValue() || h3Var.r != (-h3Var.f) + h3Var.e) {
                            float abs3 = Math.abs(f11);
                            float f16 = this.b;
                            if (abs3 >= f16 && Math.abs(f11) * 1.5f >= Math.abs(f7) && (h3Var.r != (-h3Var.f) + h3Var.e || (v0Var = h3Var.y) == null || (f11 < 0.0f && v0Var.getScrollY() == 0))) {
                                h3Var.c = true;
                                MotionEvent obtain2 = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
                                for (int i11 = 0; i11 < h3Var.getChildCount(); i11++) {
                                    h3Var.getChildAt(i11).dispatchTouchEvent(obtain2);
                                }
                                obtain2.recycle();
                                return true;
                            }
                            org.telegram.ui.web.v0 v0Var2 = h3Var.y;
                            if (v0Var2 != null) {
                                break;
                            }
                            if (Math.abs(f7) >= f16) {
                                break;
                            }
                        } else {
                            h3Var.d = true;
                        }
                    }
                }
                if (h3Var.c) {
                    if (f11 < 0.0f) {
                        float f17 = h3Var.r;
                        if (f17 > (-h3Var.f) + h3Var.e) {
                            h3Var.r = f17 - f11;
                        } else {
                            if (h3Var.y != null) {
                                float scrollY = r6.getScrollY() + f11;
                                h3Var.y.setScrollY((int) w7.u.a(scrollY, 0.0f, Math.max(r2.getContentHeight(), h3Var.y.getHeight()) - h3Var.e));
                                if (scrollY < 0.0f) {
                                    h3Var.r -= scrollY;
                                }
                            } else {
                                h3Var.r = f17 - f11;
                            }
                        }
                    } else if (f11 > 0.0f) {
                        float f18 = h3Var.r - f11;
                        h3Var.r = f18;
                        if (h3Var.y != null && f18 < (-h3Var.f) + h3Var.e) {
                            float scrollY2 = r2.getScrollY() - ((h3Var.r + h3Var.f) - h3Var.e);
                            h3Var.y.setScrollY((int) w7.u.a(scrollY2, 0.0f, Math.max(r5.getContentHeight(), h3Var.y.getHeight()) - h3Var.e));
                        }
                    }
                    float a2 = w7.u.a(h3Var.r, (-h3Var.f) + h3Var.e, (h3Var.getHeight() - h3Var.f) + h3Var.e);
                    h3Var.r = a2;
                    if (h3Var.J && !h3Var.L) {
                        h3Var.r = Math.min(a2, (-h3Var.f) + h3Var.e);
                    }
                    h3Var.c();
                }
                return true;
        }
    }
}
