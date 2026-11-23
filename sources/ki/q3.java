package ki;

import android.graphics.Typeface;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewGroup;
import c8.m9;
import org.telegram.ui.Components.jf0;
import org.telegram.ui.Components.lr;
import org.telegram.ui.Components.or;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final class q3 extends GestureDetector.SimpleOnGestureListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ ViewGroup c;

    public /* synthetic */ q3(ViewGroup viewGroup, int i7, int i10) {
        this.a = i10;
        this.c = viewGroup;
        this.b = i7;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onDown(MotionEvent motionEvent) {
        switch (this.a) {
            case 1:
                or orVar = (or) this.c;
                lr lrVar = orVar.r;
                if (orVar.n) {
                    orVar.removeCallbacks(lrVar);
                }
                orVar.n = true;
                orVar.postDelayed(lrVar, 200L);
                orVar.h.run();
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
                s3 s3Var = (s3) viewGroup;
                if (s3Var.d || !s3Var.N) {
                    return false;
                }
                if (s3Var.K && !s3Var.M) {
                    return false;
                }
                if (s3Var.O && !s3Var.b(false)) {
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
                if (f11 >= org.telegram.messenger.g0.L(650.0f) && ((sqrt > org.telegram.messenger.g0.L(200.0f) || eventTime > 250.0f) && ((s0Var = s3Var.y) == null || s0Var.getScrollY() == 0))) {
                    s3Var.x = true;
                    float f14 = s3Var.r;
                    if (f14 < s3Var.I && !s3Var.K) {
                        s3Var.e(0.0f);
                    } else if (s3Var.K && s3Var.M && (s3Var.R == (-s3Var.f) + s3Var.e || (f14 <= (-r9) && f11 < org.telegram.messenger.g0.L(1200.0f)))) {
                        s3Var.e((-s3Var.f) + s3Var.e);
                    } else {
                        r3 r3Var = s3Var.G;
                        if (r3Var != null) {
                            r3Var.b(false);
                        }
                    }
                } else {
                    if (f11 > -700.0f) {
                        return false;
                    }
                    float f15 = s3Var.r;
                    float f16 = (-s3Var.f) + s3Var.e;
                    if (f15 <= f16) {
                        return false;
                    }
                    s3Var.x = true;
                    s3Var.e(f16);
                }
                return true;
            case 1:
            default:
                return super.onFling(motionEvent, motionEvent2, f10, f11);
            case 2:
                jf0 jf0Var = (jf0) viewGroup;
                if (!jf0Var.f && !jf0Var.h && f10 >= 600.0f) {
                    jf0Var.e = false;
                    jf0Var.h = false;
                    jf0Var.a(0.0f, f10 / 6000.0f);
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
                s3 s3Var = (s3) this.c;
                if (s3Var.T) {
                    f12 = f11;
                } else {
                    float f13 = s3Var.S + f11;
                    s3Var.S = f13;
                    float abs = Math.abs(f13);
                    float f14 = s3Var.U;
                    if (abs > f14) {
                        s3Var.T = true;
                        float f15 = s3Var.S;
                        f12 = f15 > 0.0f ? f15 - f14 : f15 + f14;
                    } else {
                        f12 = 0.0f;
                    }
                }
                if (!s3Var.c && !s3Var.d && s3Var.N) {
                    if (!s3Var.O || s3Var.r != (-s3Var.f) + s3Var.e || s3Var.b(false)) {
                        if (!((Boolean) s3Var.J.h(null)).booleanValue() || s3Var.r != (-s3Var.f) + s3Var.e) {
                            float abs2 = Math.abs(f12);
                            float f16 = this.b;
                            if (abs2 >= f16 && Math.abs(f12) * 1.5f >= Math.abs(f10) && (s3Var.r != (-s3Var.f) + s3Var.e || (s0Var = s3Var.y) == null || (f12 < 0.0f && s0Var.getScrollY() == 0))) {
                                s3Var.c = true;
                                MotionEvent obtain = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
                                for (int i7 = 0; i7 < s3Var.getChildCount(); i7++) {
                                    s3Var.getChildAt(i7).dispatchTouchEvent(obtain);
                                }
                                obtain.recycle();
                                return true;
                            }
                            org.telegram.ui.web.s0 s0Var2 = s3Var.y;
                            if (s0Var2 != null) {
                                break;
                            }
                            if (Math.abs(f10) >= f16) {
                                break;
                            }
                        } else {
                            s3Var.d = true;
                        }
                    }
                }
                if (s3Var.c) {
                    if (f12 < 0.0f) {
                        float f17 = s3Var.r;
                        if (f17 > (-s3Var.f) + s3Var.e) {
                            s3Var.r = f17 - f12;
                        } else {
                            if (s3Var.y != null) {
                                float scrollY = r6.getScrollY() + f12;
                                s3Var.y.setScrollY((int) m9.a(scrollY, 0.0f, Math.max(r2.getContentHeight(), s3Var.y.getHeight()) - s3Var.e));
                                if (scrollY < 0.0f) {
                                    s3Var.r -= scrollY;
                                }
                            } else {
                                s3Var.r = f17 - f12;
                            }
                        }
                    } else if (f12 > 0.0f) {
                        float f18 = s3Var.r - f12;
                        s3Var.r = f18;
                        if (s3Var.y != null && f18 < (-s3Var.f) + s3Var.e) {
                            float scrollY2 = r2.getScrollY() - ((s3Var.r + s3Var.f) - s3Var.e);
                            s3Var.y.setScrollY((int) m9.a(scrollY2, 0.0f, Math.max(r5.getContentHeight(), s3Var.y.getHeight()) - s3Var.e));
                        }
                    }
                    float a10 = m9.a(s3Var.r, (-s3Var.f) + s3Var.e, (s3Var.getHeight() - s3Var.f) + s3Var.e);
                    s3Var.r = a10;
                    if (s3Var.K && !s3Var.M) {
                        s3Var.r = Math.min(a10, (-s3Var.f) + s3Var.e);
                    }
                    s3Var.c();
                }
                return true;
            case 1:
                or orVar = (or) this.c;
                if (orVar.n || orVar.f) {
                    float abs3 = Math.abs(f10);
                    float f19 = this.b;
                    if (abs3 >= f19 || Math.abs(f11) >= f19) {
                        orVar.n = false;
                        orVar.f = false;
                        orVar.removeCallbacks(orVar.r);
                        orVar.removeCallbacks(orVar.h);
                    }
                }
                return false;
            default:
                jf0 jf0Var = (jf0) this.c;
                if (jf0Var.e || jf0Var.h) {
                    motionEvent3 = motionEvent2;
                } else {
                    if (jf0Var.E || jf0Var.b != 1.0f || f10 > (-this.b) || Math.abs(f10) < Math.abs(1.5f * f11)) {
                        motionEvent3 = motionEvent2;
                    } else {
                        motionEvent3 = motionEvent2;
                        if (!jf0Var.d(jf0Var.getChildAt(jf0Var.b > 0.5f ? 1 : 0), motionEvent3)) {
                            jf0Var.e = true;
                            MotionEvent obtain2 = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
                            for (int i10 = 0; i10 < jf0Var.getChildCount(); i10++) {
                                jf0Var.getChildAt(i10).dispatchTouchEvent(obtain2);
                            }
                            obtain2.recycle();
                        }
                    }
                    jf0Var.h = true;
                }
                if (jf0Var.e) {
                    jf0Var.c = -1.0f;
                    jf0Var.b = 1.0f - Math.max(0.0f, Math.min(1.0f, (motionEvent3.getX() - motionEvent.getX()) / jf0Var.getWidth()));
                    jf0Var.c(true);
                }
                return jf0Var.e;
        }
    }
}
