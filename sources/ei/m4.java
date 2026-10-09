package ei;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.is;
import org.telegram.ui.Components.ls;
import org.telegram.ui.Components.xh0;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final class m4 extends GestureDetector.SimpleOnGestureListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ ViewGroup c;

    public /* synthetic */ m4(ViewGroup viewGroup, int i10, int i11) {
        this.a = i11;
        this.c = viewGroup;
        this.b = i10;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onDown(MotionEvent motionEvent) {
        switch (this.a) {
            case 1:
                ls lsVar = (ls) this.c;
                is isVar = lsVar.r;
                if (lsVar.n) {
                    lsVar.removeCallbacks(isVar);
                }
                lsVar.n = true;
                lsVar.postDelayed(isVar, 200L);
                lsVar.h.run();
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
                o4 o4Var = (o4) this.c;
                if (o4Var.d || !o4Var.M) {
                    return false;
                }
                if (o4Var.J && !o4Var.L) {
                    return false;
                }
                if (o4Var.N && !o4Var.b(false)) {
                    return false;
                }
                float distance = AndroidUtilities.distance(motionEvent.getX(), motionEvent.getY(), motionEvent2.getX(), motionEvent2.getY());
                float eventTime = motionEvent2.getEventTime() - motionEvent.getEventTime();
                if (f10 >= AndroidUtilities.dp(650.0f) && ((distance > AndroidUtilities.dp(200.0f) || eventTime > 250.0f) && ((y0Var = o4Var.x) == null || y0Var.getScrollY() == 0))) {
                    o4Var.w = true;
                    float f11 = o4Var.r;
                    if (f11 < o4Var.H && !o4Var.J) {
                        o4Var.e(0.0f);
                    } else if (o4Var.J && o4Var.L && (o4Var.Q == (-o4Var.f) + o4Var.e || (f11 <= (-r7) && f10 < AndroidUtilities.dp(1200.0f)))) {
                        o4Var.e((-o4Var.f) + o4Var.e);
                    } else {
                        n4 n4Var = o4Var.F;
                        if (n4Var != null) {
                            n4Var.j(false);
                        }
                    }
                } else {
                    if (f10 > -700.0f) {
                        return false;
                    }
                    float f12 = o4Var.r;
                    float f13 = (-o4Var.f) + o4Var.e;
                    if (f12 <= f13) {
                        return false;
                    }
                    o4Var.w = true;
                    o4Var.e(f13);
                }
                return true;
            case 1:
            default:
                return super.onFling(motionEvent, motionEvent2, f7, f10);
            case 2:
                xh0 xh0Var = (xh0) this.c;
                if (!xh0Var.f && !xh0Var.h && f7 >= 600.0f) {
                    xh0Var.e = false;
                    xh0Var.h = false;
                    xh0Var.a(0.0f, f7 / 6000.0f);
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
        org.telegram.ui.web.y0 y0Var;
        MotionEvent motionEvent3;
        switch (this.a) {
            case 0:
                o4 o4Var = (o4) this.c;
                if (o4Var.S) {
                    f11 = f10;
                } else {
                    float f12 = o4Var.R + f10;
                    o4Var.R = f12;
                    float abs = Math.abs(f12);
                    float f13 = o4Var.T;
                    if (abs > f13) {
                        o4Var.S = true;
                        float f14 = o4Var.R;
                        f11 = f14 > 0.0f ? f14 - f13 : f14 + f13;
                    } else {
                        f11 = 0.0f;
                    }
                }
                if (!o4Var.c && !o4Var.d && o4Var.M) {
                    if (!o4Var.N || o4Var.r != (-o4Var.f) + o4Var.e || o4Var.b(false)) {
                        if (!((Boolean) o4Var.I.provide(null)).booleanValue() || o4Var.r != (-o4Var.f) + o4Var.e) {
                            float abs2 = Math.abs(f11);
                            float f15 = this.b;
                            if (abs2 >= f15 && Math.abs(f11) * 1.5f >= Math.abs(f7) && (o4Var.r != (-o4Var.f) + o4Var.e || (y0Var = o4Var.x) == null || (f11 < 0.0f && y0Var.getScrollY() == 0))) {
                                o4Var.c = true;
                                MotionEvent obtain = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
                                for (int i10 = 0; i10 < o4Var.getChildCount(); i10++) {
                                    o4Var.getChildAt(i10).dispatchTouchEvent(obtain);
                                }
                                obtain.recycle();
                                return true;
                            }
                            org.telegram.ui.web.y0 y0Var2 = o4Var.x;
                            if (y0Var2 != null) {
                                break;
                            }
                            if (Math.abs(f7) >= f15) {
                                break;
                            }
                        } else {
                            o4Var.d = true;
                        }
                    }
                }
                if (o4Var.c) {
                    if (f11 < 0.0f) {
                        float f16 = o4Var.r;
                        if (f16 > (-o4Var.f) + o4Var.e) {
                            o4Var.r = f16 - f11;
                        } else {
                            if (o4Var.x != null) {
                                float scrollY = r6.getScrollY() + f11;
                                o4Var.x.setScrollY((int) w7.o.a(scrollY, 0.0f, Math.max(r2.getContentHeight(), o4Var.x.getHeight()) - o4Var.e));
                                if (scrollY < 0.0f) {
                                    o4Var.r -= scrollY;
                                }
                            } else {
                                o4Var.r = f16 - f11;
                            }
                        }
                    } else if (f11 > 0.0f) {
                        float f17 = o4Var.r - f11;
                        o4Var.r = f17;
                        if (o4Var.x != null && f17 < (-o4Var.f) + o4Var.e) {
                            float scrollY2 = r2.getScrollY() - ((o4Var.r + o4Var.f) - o4Var.e);
                            o4Var.x.setScrollY((int) w7.o.a(scrollY2, 0.0f, Math.max(r5.getContentHeight(), o4Var.x.getHeight()) - o4Var.e));
                        }
                    }
                    float a2 = w7.o.a(o4Var.r, (-o4Var.f) + o4Var.e, (o4Var.getHeight() - o4Var.f) + o4Var.e);
                    o4Var.r = a2;
                    if (o4Var.J && !o4Var.L) {
                        o4Var.r = Math.min(a2, (-o4Var.f) + o4Var.e);
                    }
                    o4Var.c();
                }
                return true;
            case 1:
                ls lsVar = (ls) this.c;
                if (lsVar.n || lsVar.f) {
                    float abs3 = Math.abs(f7);
                    float f18 = this.b;
                    if (abs3 >= f18 || Math.abs(f10) >= f18) {
                        lsVar.n = false;
                        lsVar.f = false;
                        lsVar.removeCallbacks(lsVar.r);
                        lsVar.removeCallbacks(lsVar.h);
                    }
                }
                return false;
            default:
                xh0 xh0Var = (xh0) this.c;
                if (xh0Var.e || xh0Var.h) {
                    motionEvent3 = motionEvent2;
                } else {
                    if (xh0Var.y || xh0Var.b != 1.0f || f7 > (-this.b) || Math.abs(f7) < Math.abs(1.5f * f10)) {
                        motionEvent3 = motionEvent2;
                    } else {
                        motionEvent3 = motionEvent2;
                        if (!xh0Var.d(motionEvent3, xh0Var.getChildAt(xh0Var.b > 0.5f ? 1 : 0))) {
                            xh0Var.e = true;
                            MotionEvent obtain2 = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
                            for (int i11 = 0; i11 < xh0Var.getChildCount(); i11++) {
                                xh0Var.getChildAt(i11).dispatchTouchEvent(obtain2);
                            }
                            obtain2.recycle();
                        }
                    }
                    xh0Var.h = true;
                }
                if (xh0Var.e) {
                    xh0Var.c = -1.0f;
                    xh0Var.b = 1.0f - Math.max(0.0f, Math.min(1.0f, (motionEvent3.getX() - motionEvent.getX()) / xh0Var.getWidth()));
                    xh0Var.c(true);
                }
                return xh0Var.e;
        }
    }
}
