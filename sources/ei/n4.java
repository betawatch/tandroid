package ei;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.fh0;
import org.telegram.ui.Components.sr;
import org.telegram.ui.Components.vr;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes4.dex */
public final class n4 extends GestureDetector.SimpleOnGestureListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ ViewGroup c;

    public /* synthetic */ n4(ViewGroup viewGroup, int i10, int i11) {
        this.a = i11;
        this.c = viewGroup;
        this.b = i10;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onDown(MotionEvent motionEvent) {
        switch (this.a) {
            case 1:
                vr vrVar = (vr) this.c;
                sr srVar = vrVar.r;
                if (vrVar.n) {
                    vrVar.removeCallbacks(srVar);
                }
                vrVar.n = true;
                vrVar.postDelayed(srVar, 200L);
                vrVar.h.run();
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
                p4 p4Var = (p4) this.c;
                if (p4Var.d || !p4Var.M) {
                    return false;
                }
                if (p4Var.J && !p4Var.L) {
                    return false;
                }
                if (p4Var.N && !p4Var.b(false)) {
                    return false;
                }
                float distance = AndroidUtilities.distance(motionEvent.getX(), motionEvent.getY(), motionEvent2.getX(), motionEvent2.getY());
                float eventTime = motionEvent2.getEventTime() - motionEvent.getEventTime();
                if (f10 >= AndroidUtilities.dp(650.0f) && ((distance > AndroidUtilities.dp(200.0f) || eventTime > 250.0f) && ((y0Var = p4Var.x) == null || y0Var.getScrollY() == 0))) {
                    p4Var.w = true;
                    float f11 = p4Var.r;
                    if (f11 < p4Var.H && !p4Var.J) {
                        p4Var.e(0.0f);
                    } else if (p4Var.J && p4Var.L && (p4Var.Q == (-p4Var.f) + p4Var.e || (f11 <= (-r7) && f10 < AndroidUtilities.dp(1200.0f)))) {
                        p4Var.e((-p4Var.f) + p4Var.e);
                    } else {
                        o4 o4Var = p4Var.F;
                        if (o4Var != null) {
                            o4Var.j(false);
                        }
                    }
                } else {
                    if (f10 > -700.0f) {
                        return false;
                    }
                    float f12 = p4Var.r;
                    float f13 = (-p4Var.f) + p4Var.e;
                    if (f12 <= f13) {
                        return false;
                    }
                    p4Var.w = true;
                    p4Var.e(f13);
                }
                return true;
            case 1:
            default:
                return super.onFling(motionEvent, motionEvent2, f7, f10);
            case 2:
                fh0 fh0Var = (fh0) this.c;
                if (!fh0Var.f && !fh0Var.h && f7 >= 600.0f) {
                    fh0Var.e = false;
                    fh0Var.h = false;
                    fh0Var.a(0.0f, f7 / 6000.0f);
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
                p4 p4Var = (p4) this.c;
                if (p4Var.S) {
                    f11 = f10;
                } else {
                    float f12 = p4Var.R + f10;
                    p4Var.R = f12;
                    float abs = Math.abs(f12);
                    float f13 = p4Var.T;
                    if (abs > f13) {
                        p4Var.S = true;
                        float f14 = p4Var.R;
                        f11 = f14 > 0.0f ? f14 - f13 : f14 + f13;
                    } else {
                        f11 = 0.0f;
                    }
                }
                if (!p4Var.c && !p4Var.d && p4Var.M) {
                    if (!p4Var.N || p4Var.r != (-p4Var.f) + p4Var.e || p4Var.b(false)) {
                        if (!((Boolean) p4Var.I.provide(null)).booleanValue() || p4Var.r != (-p4Var.f) + p4Var.e) {
                            float abs2 = Math.abs(f11);
                            float f15 = this.b;
                            if (abs2 >= f15 && Math.abs(f11) * 1.5f >= Math.abs(f7) && (p4Var.r != (-p4Var.f) + p4Var.e || (y0Var = p4Var.x) == null || (f11 < 0.0f && y0Var.getScrollY() == 0))) {
                                p4Var.c = true;
                                MotionEvent obtain = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
                                for (int i10 = 0; i10 < p4Var.getChildCount(); i10++) {
                                    p4Var.getChildAt(i10).dispatchTouchEvent(obtain);
                                }
                                obtain.recycle();
                                return true;
                            }
                            org.telegram.ui.web.y0 y0Var2 = p4Var.x;
                            if (y0Var2 != null) {
                                break;
                            }
                            if (Math.abs(f7) >= f15) {
                                break;
                            }
                        } else {
                            p4Var.d = true;
                        }
                    }
                }
                if (p4Var.c) {
                    if (f11 < 0.0f) {
                        float f16 = p4Var.r;
                        if (f16 > (-p4Var.f) + p4Var.e) {
                            p4Var.r = f16 - f11;
                        } else {
                            if (p4Var.x != null) {
                                float scrollY = r6.getScrollY() + f11;
                                p4Var.x.setScrollY((int) w7.q.a(scrollY, 0.0f, Math.max(r2.getContentHeight(), p4Var.x.getHeight()) - p4Var.e));
                                if (scrollY < 0.0f) {
                                    p4Var.r -= scrollY;
                                }
                            } else {
                                p4Var.r = f16 - f11;
                            }
                        }
                    } else if (f11 > 0.0f) {
                        float f17 = p4Var.r - f11;
                        p4Var.r = f17;
                        if (p4Var.x != null && f17 < (-p4Var.f) + p4Var.e) {
                            float scrollY2 = r2.getScrollY() - ((p4Var.r + p4Var.f) - p4Var.e);
                            p4Var.x.setScrollY((int) w7.q.a(scrollY2, 0.0f, Math.max(r5.getContentHeight(), p4Var.x.getHeight()) - p4Var.e));
                        }
                    }
                    float a2 = w7.q.a(p4Var.r, (-p4Var.f) + p4Var.e, (p4Var.getHeight() - p4Var.f) + p4Var.e);
                    p4Var.r = a2;
                    if (p4Var.J && !p4Var.L) {
                        p4Var.r = Math.min(a2, (-p4Var.f) + p4Var.e);
                    }
                    p4Var.c();
                }
                return true;
            case 1:
                vr vrVar = (vr) this.c;
                if (vrVar.n || vrVar.f) {
                    float abs3 = Math.abs(f7);
                    float f18 = this.b;
                    if (abs3 >= f18 || Math.abs(f10) >= f18) {
                        vrVar.n = false;
                        vrVar.f = false;
                        vrVar.removeCallbacks(vrVar.r);
                        vrVar.removeCallbacks(vrVar.h);
                    }
                }
                return false;
            default:
                fh0 fh0Var = (fh0) this.c;
                if (fh0Var.e || fh0Var.h) {
                    motionEvent3 = motionEvent2;
                } else {
                    if (fh0Var.y || fh0Var.b != 1.0f || f7 > (-this.b) || Math.abs(f7) < Math.abs(1.5f * f10)) {
                        motionEvent3 = motionEvent2;
                    } else {
                        motionEvent3 = motionEvent2;
                        if (!fh0Var.d(motionEvent3, fh0Var.getChildAt(fh0Var.b > 0.5f ? 1 : 0))) {
                            fh0Var.e = true;
                            MotionEvent obtain2 = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
                            for (int i11 = 0; i11 < fh0Var.getChildCount(); i11++) {
                                fh0Var.getChildAt(i11).dispatchTouchEvent(obtain2);
                            }
                            obtain2.recycle();
                        }
                    }
                    fh0Var.h = true;
                }
                if (fh0Var.e) {
                    fh0Var.c = -1.0f;
                    fh0Var.b = 1.0f - Math.max(0.0f, Math.min(1.0f, (motionEvent3.getX() - motionEvent.getX()) / fh0Var.getWidth()));
                    fh0Var.c(true);
                }
                return fh0Var.e;
        }
    }
}
