package ki;

import android.graphics.Typeface;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewGroup;
import c8.l9;
import org.telegram.ui.Components.kf0;
import org.telegram.ui.Components.or;
import org.telegram.ui.Components.rr;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes4.dex */
public final class p3 extends GestureDetector.SimpleOnGestureListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ ViewGroup c;

    public /* synthetic */ p3(ViewGroup viewGroup, int i7, int i10) {
        this.a = i10;
        this.c = viewGroup;
        this.b = i7;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onDown(MotionEvent motionEvent) {
        switch (this.a) {
            case 1:
                rr rrVar = (rr) this.c;
                or orVar = rrVar.r;
                if (rrVar.n) {
                    rrVar.removeCallbacks(orVar);
                }
                rrVar.n = true;
                rrVar.postDelayed(orVar, 200L);
                rrVar.h.run();
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
                r3 r3Var = (r3) viewGroup;
                if (r3Var.d || !r3Var.N) {
                    return false;
                }
                if (r3Var.K && !r3Var.M) {
                    return false;
                }
                if (r3Var.O && !r3Var.b(false)) {
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
                if (f11 >= org.telegram.messenger.g0.L(650.0f) && ((sqrt > org.telegram.messenger.g0.L(200.0f) || eventTime > 250.0f) && ((s0Var = r3Var.y) == null || s0Var.getScrollY() == 0))) {
                    r3Var.x = true;
                    float f14 = r3Var.r;
                    if (f14 < r3Var.I && !r3Var.K) {
                        r3Var.e(0.0f);
                    } else if (r3Var.K && r3Var.M && (r3Var.R == (-r3Var.f) + r3Var.e || (f14 <= (-r9) && f11 < org.telegram.messenger.g0.L(1200.0f)))) {
                        r3Var.e((-r3Var.f) + r3Var.e);
                    } else {
                        q3 q3Var = r3Var.G;
                        if (q3Var != null) {
                            q3Var.s(false);
                        }
                    }
                } else {
                    if (f11 > -700.0f) {
                        return false;
                    }
                    float f15 = r3Var.r;
                    float f16 = (-r3Var.f) + r3Var.e;
                    if (f15 <= f16) {
                        return false;
                    }
                    r3Var.x = true;
                    r3Var.e(f16);
                }
                return true;
            case 1:
            default:
                return super.onFling(motionEvent, motionEvent2, f10, f11);
            case 2:
                kf0 kf0Var = (kf0) viewGroup;
                if (!kf0Var.f && !kf0Var.h && f10 >= 600.0f) {
                    kf0Var.e = false;
                    kf0Var.h = false;
                    kf0Var.a(0.0f, f10 / 6000.0f);
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
                r3 r3Var = (r3) this.c;
                if (r3Var.T) {
                    f12 = f11;
                } else {
                    float f13 = r3Var.S + f11;
                    r3Var.S = f13;
                    float abs = Math.abs(f13);
                    float f14 = r3Var.U;
                    if (abs > f14) {
                        r3Var.T = true;
                        float f15 = r3Var.S;
                        f12 = f15 > 0.0f ? f15 - f14 : f15 + f14;
                    } else {
                        f12 = 0.0f;
                    }
                }
                if (!r3Var.c && !r3Var.d && r3Var.N) {
                    if (!r3Var.O || r3Var.r != (-r3Var.f) + r3Var.e || r3Var.b(false)) {
                        if (!((Boolean) r3Var.J.m(null)).booleanValue() || r3Var.r != (-r3Var.f) + r3Var.e) {
                            float abs2 = Math.abs(f12);
                            float f16 = this.b;
                            if (abs2 >= f16 && Math.abs(f12) * 1.5f >= Math.abs(f10) && (r3Var.r != (-r3Var.f) + r3Var.e || (s0Var = r3Var.y) == null || (f12 < 0.0f && s0Var.getScrollY() == 0))) {
                                r3Var.c = true;
                                MotionEvent obtain = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
                                for (int i7 = 0; i7 < r3Var.getChildCount(); i7++) {
                                    r3Var.getChildAt(i7).dispatchTouchEvent(obtain);
                                }
                                obtain.recycle();
                                return true;
                            }
                            org.telegram.ui.web.s0 s0Var2 = r3Var.y;
                            if (s0Var2 != null) {
                                break;
                            }
                            if (Math.abs(f10) >= f16) {
                                break;
                            }
                        } else {
                            r3Var.d = true;
                        }
                    }
                }
                if (r3Var.c) {
                    if (f12 < 0.0f) {
                        float f17 = r3Var.r;
                        if (f17 > (-r3Var.f) + r3Var.e) {
                            r3Var.r = f17 - f12;
                        } else {
                            if (r3Var.y != null) {
                                float scrollY = r6.getScrollY() + f12;
                                r3Var.y.setScrollY((int) l9.a(scrollY, 0.0f, Math.max(r2.getContentHeight(), r3Var.y.getHeight()) - r3Var.e));
                                if (scrollY < 0.0f) {
                                    r3Var.r -= scrollY;
                                }
                            } else {
                                r3Var.r = f17 - f12;
                            }
                        }
                    } else if (f12 > 0.0f) {
                        float f18 = r3Var.r - f12;
                        r3Var.r = f18;
                        if (r3Var.y != null && f18 < (-r3Var.f) + r3Var.e) {
                            float scrollY2 = r2.getScrollY() - ((r3Var.r + r3Var.f) - r3Var.e);
                            r3Var.y.setScrollY((int) l9.a(scrollY2, 0.0f, Math.max(r5.getContentHeight(), r3Var.y.getHeight()) - r3Var.e));
                        }
                    }
                    float a10 = l9.a(r3Var.r, (-r3Var.f) + r3Var.e, (r3Var.getHeight() - r3Var.f) + r3Var.e);
                    r3Var.r = a10;
                    if (r3Var.K && !r3Var.M) {
                        r3Var.r = Math.min(a10, (-r3Var.f) + r3Var.e);
                    }
                    r3Var.c();
                }
                return true;
            case 1:
                rr rrVar = (rr) this.c;
                if (rrVar.n || rrVar.f) {
                    float abs3 = Math.abs(f10);
                    float f19 = this.b;
                    if (abs3 >= f19 || Math.abs(f11) >= f19) {
                        rrVar.n = false;
                        rrVar.f = false;
                        rrVar.removeCallbacks(rrVar.r);
                        rrVar.removeCallbacks(rrVar.h);
                    }
                }
                return false;
            default:
                kf0 kf0Var = (kf0) this.c;
                if (kf0Var.e || kf0Var.h) {
                    motionEvent3 = motionEvent2;
                } else {
                    if (kf0Var.E || kf0Var.b != 1.0f || f10 > (-this.b) || Math.abs(f10) < Math.abs(1.5f * f11)) {
                        motionEvent3 = motionEvent2;
                    } else {
                        motionEvent3 = motionEvent2;
                        if (!kf0Var.d(kf0Var.getChildAt(kf0Var.b > 0.5f ? 1 : 0), motionEvent3)) {
                            kf0Var.e = true;
                            MotionEvent obtain2 = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
                            for (int i10 = 0; i10 < kf0Var.getChildCount(); i10++) {
                                kf0Var.getChildAt(i10).dispatchTouchEvent(obtain2);
                            }
                            obtain2.recycle();
                        }
                    }
                    kf0Var.h = true;
                }
                if (kf0Var.e) {
                    kf0Var.c = -1.0f;
                    kf0Var.b = 1.0f - Math.max(0.0f, Math.min(1.0f, (motionEvent3.getX() - motionEvent.getX()) / kf0Var.getWidth()));
                    kf0Var.c(true);
                }
                return kf0Var.e;
        }
    }
}
