package org.telegram.ui.ActionBar;

import a8.xa;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.j10;
import org.telegram.messenger.mp;
import org.telegram.messenger.o10;
import org.telegram.messenger.x10;
import org.telegram.ui.bn;
import org.telegram.ui.rj;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class c3 implements x10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ c3(int i7, Object obj, Object obj2) {
        this.a = i7;
        this.c = obj;
        this.b = obj2;
    }

    @Override // org.telegram.messenger.x10
    public final void a(Object obj) {
        int i7;
        bn bnVar;
        rj rjVar;
        int i10 = this.a;
        Object obj2 = this.b;
        Object obj3 = this.c;
        switch (i10) {
            case 0:
                g3 g3Var = (g3) obj3;
                f3 f3Var = (f3) obj2;
                h2 h2Var = (h2) obj;
                if (h2Var != null) {
                    if ((h2Var instanceof bn) && (rjVar = (bnVar = (bn) h2Var).a0) != null) {
                        rjVar.U();
                        bnVar.a0.H0(true, false, true);
                    }
                    if (h2Var.getContext() != null && h2Var.getParentActivity() != null) {
                        ki.t2 t2Var = new ki.t2(h2Var.getContext(), h2Var.getResourceProvider());
                        t2Var.m0 = h2Var.getParentActivity();
                        if (f3Var != null && f3Var.a != null) {
                            t2Var.G0 = true;
                            boolean z10 = f3Var.o;
                            t2Var.X = z10;
                            if (z10) {
                                t2Var.A(f3Var.r, false);
                            }
                            if (f3Var.n) {
                                i7 = f3Var.q;
                            } else {
                                int i11 = f3Var.p;
                                if (i11 < 0) {
                                    i11 = n6.d6;
                                }
                                i7 = n6.w0(i11, t2Var.G);
                            }
                            t2Var.y(i7, f3Var.n, false);
                            t2Var.D(f3Var.s, false);
                            t2Var.H0 = f3Var.j;
                            t2Var.I0 = f3Var.k;
                            boolean z11 = f3Var.u;
                            t2Var.y0 = z11;
                            ki.l2 l2Var = t2Var.E;
                            l2Var.setIsBackButtonVisible(z11);
                            t2Var.x.setAllowSwipes(f3Var.l);
                            org.telegram.messenger.g0.P3(t2Var.Y.getBackButton(), t2Var.y0 ? R.drawable.ic_ab_back : R.drawable.ic_close_white);
                            org.telegram.messenger.h2 h2Var2 = t2Var.o0;
                            if (h2Var2 != null) {
                                boolean z12 = t2Var.y0;
                                h2Var2.L = z12;
                                h2Var2.M.d(z12);
                                h2Var2.invalidate();
                            }
                            t2Var.t0 = f3Var.y;
                            t2Var.B0 = Boolean.valueOf(f3Var.B);
                            t2Var.C0 = f3Var.C;
                            ki.w0 w0Var = f3Var.K;
                            t2Var.D0 = w0Var;
                            if (w0Var != null) {
                                ki.u0 u0Var = w0Var.r;
                                SensorManager sensorManager = w0Var.a;
                                if (w0Var.l) {
                                    w0Var.l = false;
                                    if (sensorManager != null) {
                                        Sensor sensor = w0Var.b;
                                        if (sensor != null) {
                                            sensorManager.registerListener(w0Var.n, sensor, ki.w0.a(w0Var.c));
                                        }
                                        Sensor sensor2 = w0Var.d;
                                        if (sensor2 != null) {
                                            sensorManager.registerListener(w0Var.p, sensor2, ki.w0.a(w0Var.e));
                                        }
                                        Sensor sensor3 = w0Var.g;
                                        if (sensor3 != null) {
                                            sensorManager.registerListener(u0Var, sensor3, ki.w0.a(w0Var.h));
                                        }
                                        Sensor sensor4 = w0Var.f;
                                        if (sensor4 != null) {
                                            sensorManager.registerListener(u0Var, sensor4, ki.w0.a(w0Var.h));
                                        }
                                        Sensor sensor5 = w0Var.i;
                                        if (sensor5 != null) {
                                            sensorManager.registerListener(w0Var.t, sensor5, ki.w0.a(w0Var.j));
                                        }
                                    }
                                }
                            }
                            xa xaVar = f3Var.w;
                            if (xaVar != null) {
                                ki.p2 p2Var = t2Var.n0;
                                int totalHeight = p2Var.getTotalHeight();
                                p2Var.e = xaVar;
                                ki.s[] sVarArr = p2Var.f;
                                ki.u.b(sVarArr[0].l, (ki.t) xaVar.c, false);
                                ki.u.b(sVarArr[1].l, (ki.t) xaVar.d, false);
                                p2Var.invalidate();
                                if (totalHeight != p2Var.getTotalHeight() && p2Var.r != null) {
                                    if (totalHeight < p2Var.getTotalHeight()) {
                                        org.telegram.messenger.g0.h3(p2Var.r, 200L);
                                    } else {
                                        p2Var.r.run();
                                    }
                                }
                                int i12 = xaVar.b;
                                Paint paint = p2Var.a;
                                p2Var.e.b = i12;
                                paint.setColor(i12);
                                p2Var.d.a(i12, true);
                            }
                            t2Var.C(f3Var.z, false, f3Var.A);
                            ki.f4 f4Var = f3Var.a;
                            t2Var.I = f4Var != null ? f4Var.a : j10.t0;
                            org.telegram.ui.web.s0 s0Var = f3Var.b;
                            if (s0Var != null) {
                                s0Var.onResume();
                                l2Var.O(t2Var.I, f3Var.b, f3Var.d, f3Var.f, f3Var.e);
                                boolean z13 = f3Var.t || f3Var.b.b;
                                String str = f3Var.x;
                                l2Var.g("setState(" + z13 + ", " + str + ")");
                                l2Var.O = z13;
                                l2Var.b = str;
                                if (n6.I.q() != f3Var.D) {
                                    l2Var.z();
                                }
                            } else {
                                f4Var.q = null;
                                f4Var.r = 0L;
                            }
                            t2Var.x(h2Var, f3Var.a);
                            t2Var.d0 = f3Var.v;
                            if (f3Var.G) {
                                t2Var.X0 = true;
                                t2Var.m();
                                org.telegram.ui.b3 b3Var = t2Var.Z0;
                                String q10 = t2Var.q() ? t2Var.x0.e : o10.q(mp.u1(t2Var.I).c2(Long.valueOf(t2Var.J)));
                                String str2 = f3Var.H;
                                t2Var.Y0 = str2;
                                b3Var.a(q10, str2);
                                org.telegram.ui.b3 b3Var2 = t2Var.Z0;
                                Paint paint2 = t2Var.R;
                                b3Var2.b(org.telegram.messenger.g0.B(paint2.getColor()) <= 0.721f, false);
                                t2Var.Z0.setBackgroundColor(paint2.getColor());
                                t2Var.Z0.setVisibility(0);
                                t2Var.Z0.setAlpha(1.0f);
                            }
                            t2Var.t(f3Var.L);
                            g3Var.h(g3Var.x, f3Var, false);
                            t2Var.show();
                            break;
                        }
                    }
                }
                break;
            case 1:
                k3 k3Var = (k3) obj3;
                ((f3) obj2).m = (Bitmap) obj;
                k3Var.d().setDrawingFromOverlay(false);
                k3Var.release();
                break;
            default:
                m3 m3Var = (m3) obj2;
                n3 n3Var = (n3) ((hi.d6) obj3).q;
                if (!((Boolean) obj).booleanValue()) {
                    m3Var.a(0.0f);
                    break;
                } else {
                    m3Var.a(1.0f);
                    if (n3Var.a.getTabs().isEmpty()) {
                        n3Var.a(false);
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ c3(f3 f3Var, k3 k3Var) {
        this.a = 1;
        this.b = f3Var;
        this.c = k3Var;
    }
}
