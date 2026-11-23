package org.telegram.ui.ActionBar;

import a8.xa;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.k10;
import org.telegram.messenger.np;
import org.telegram.messenger.p10;
import org.telegram.messenger.y10;
import org.telegram.ui.bn;
import org.telegram.ui.rj;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final /* synthetic */ class b3 implements y10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ b3(int i7, Object obj, Object obj2) {
        this.a = i7;
        this.c = obj;
        this.b = obj2;
    }

    @Override // org.telegram.messenger.y10
    public final void a(Object obj) {
        int i7;
        bn bnVar;
        rj rjVar;
        int i10 = this.a;
        Object obj2 = this.b;
        Object obj3 = this.c;
        switch (i10) {
            case 0:
                f3 f3Var = (f3) obj3;
                e3 e3Var = (e3) obj2;
                g2 g2Var = (g2) obj;
                if (g2Var != null) {
                    if ((g2Var instanceof bn) && (rjVar = (bnVar = (bn) g2Var).a0) != null) {
                        rjVar.U();
                        bnVar.a0.L0(true, false, true);
                    }
                    if (g2Var.getContext() != null && g2Var.getParentActivity() != null) {
                        ki.s2 s2Var = new ki.s2(g2Var.getContext(), g2Var.getResourceProvider());
                        s2Var.m0 = g2Var.getParentActivity();
                        if (e3Var != null && e3Var.a != null) {
                            s2Var.G0 = true;
                            boolean z10 = e3Var.o;
                            s2Var.X = z10;
                            if (z10) {
                                s2Var.A(e3Var.r, false);
                            }
                            if (e3Var.n) {
                                i7 = e3Var.q;
                            } else {
                                int i11 = e3Var.p;
                                if (i11 < 0) {
                                    i11 = m6.d6;
                                }
                                i7 = m6.w0(i11, s2Var.G);
                            }
                            s2Var.y(i7, e3Var.n, false);
                            s2Var.D(e3Var.s, false);
                            s2Var.H0 = e3Var.j;
                            s2Var.I0 = e3Var.k;
                            boolean z11 = e3Var.u;
                            s2Var.y0 = z11;
                            ki.k2 k2Var = s2Var.E;
                            k2Var.setIsBackButtonVisible(z11);
                            s2Var.x.setAllowSwipes(e3Var.l);
                            org.telegram.messenger.g0.P3(s2Var.Y.getBackButton(), s2Var.y0 ? R.drawable.ic_ab_back : R.drawable.ic_close_white);
                            org.telegram.messenger.h2 h2Var = s2Var.o0;
                            if (h2Var != null) {
                                boolean z12 = s2Var.y0;
                                h2Var.L = z12;
                                h2Var.M.d(z12);
                                h2Var.invalidate();
                            }
                            s2Var.t0 = e3Var.y;
                            s2Var.B0 = Boolean.valueOf(e3Var.B);
                            s2Var.C0 = e3Var.C;
                            ki.v0 v0Var = e3Var.K;
                            s2Var.D0 = v0Var;
                            if (v0Var != null) {
                                ki.t0 t0Var = v0Var.r;
                                SensorManager sensorManager = v0Var.a;
                                if (v0Var.l) {
                                    v0Var.l = false;
                                    if (sensorManager != null) {
                                        Sensor sensor = v0Var.b;
                                        if (sensor != null) {
                                            sensorManager.registerListener(v0Var.n, sensor, ki.v0.a(v0Var.c));
                                        }
                                        Sensor sensor2 = v0Var.d;
                                        if (sensor2 != null) {
                                            sensorManager.registerListener(v0Var.p, sensor2, ki.v0.a(v0Var.e));
                                        }
                                        Sensor sensor3 = v0Var.g;
                                        if (sensor3 != null) {
                                            sensorManager.registerListener(t0Var, sensor3, ki.v0.a(v0Var.h));
                                        }
                                        Sensor sensor4 = v0Var.f;
                                        if (sensor4 != null) {
                                            sensorManager.registerListener(t0Var, sensor4, ki.v0.a(v0Var.h));
                                        }
                                        Sensor sensor5 = v0Var.i;
                                        if (sensor5 != null) {
                                            sensorManager.registerListener(v0Var.t, sensor5, ki.v0.a(v0Var.j));
                                        }
                                    }
                                }
                            }
                            xa xaVar = e3Var.w;
                            if (xaVar != null) {
                                ki.o2 o2Var = s2Var.n0;
                                int totalHeight = o2Var.getTotalHeight();
                                o2Var.e = xaVar;
                                ki.r[] rVarArr = o2Var.f;
                                ki.t.b(rVarArr[0].l, (ki.s) xaVar.c, false);
                                ki.t.b(rVarArr[1].l, (ki.s) xaVar.d, false);
                                o2Var.invalidate();
                                if (totalHeight != o2Var.getTotalHeight() && o2Var.r != null) {
                                    if (totalHeight < o2Var.getTotalHeight()) {
                                        org.telegram.messenger.g0.h3(o2Var.r, 200L);
                                    } else {
                                        o2Var.r.run();
                                    }
                                }
                                int i12 = xaVar.b;
                                Paint paint = o2Var.a;
                                o2Var.e.b = i12;
                                paint.setColor(i12);
                                o2Var.d.a(i12, true);
                            }
                            s2Var.C(e3Var.z, false, e3Var.A);
                            ki.e4 e4Var = e3Var.a;
                            s2Var.I = e4Var != null ? e4Var.a : k10.t0;
                            org.telegram.ui.web.s0 s0Var = e3Var.b;
                            if (s0Var != null) {
                                s0Var.onResume();
                                k2Var.O(s2Var.I, e3Var.b, e3Var.d, e3Var.f, e3Var.e);
                                boolean z13 = e3Var.t || e3Var.b.b;
                                String str = e3Var.x;
                                k2Var.g("setState(" + z13 + ", " + str + ")");
                                k2Var.O = z13;
                                k2Var.b = str;
                                if (m6.I.q() != e3Var.D) {
                                    k2Var.z();
                                }
                            } else {
                                e4Var.q = null;
                                e4Var.r = 0L;
                            }
                            s2Var.x(g2Var, e3Var.a);
                            s2Var.d0 = e3Var.v;
                            if (e3Var.G) {
                                s2Var.X0 = true;
                                s2Var.m();
                                org.telegram.ui.b3 b3Var = s2Var.Z0;
                                String q10 = s2Var.q() ? s2Var.x0.e : p10.q(np.u1(s2Var.I).c2(Long.valueOf(s2Var.J)));
                                String str2 = e3Var.H;
                                s2Var.Y0 = str2;
                                b3Var.a(q10, str2);
                                org.telegram.ui.b3 b3Var2 = s2Var.Z0;
                                Paint paint2 = s2Var.R;
                                b3Var2.b(org.telegram.messenger.g0.B(paint2.getColor()) <= 0.721f, false);
                                s2Var.Z0.setBackgroundColor(paint2.getColor());
                                s2Var.Z0.setVisibility(0);
                                s2Var.Z0.setAlpha(1.0f);
                            }
                            s2Var.t(e3Var.L);
                            f3Var.h(f3Var.x, e3Var, false);
                            s2Var.show();
                            break;
                        }
                    }
                }
                break;
            case 1:
                j3 j3Var = (j3) obj3;
                ((e3) obj2).m = (Bitmap) obj;
                j3Var.d().setDrawingFromOverlay(false);
                j3Var.release();
                break;
            default:
                l3 l3Var = (l3) obj2;
                m3 m3Var = (m3) ((hi.c6) obj3).q;
                if (!((Boolean) obj).booleanValue()) {
                    l3Var.a(0.0f);
                    break;
                } else {
                    l3Var.a(1.0f);
                    if (m3Var.a.getTabs().isEmpty()) {
                        m3Var.a(false);
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ b3(e3 e3Var, j3 j3Var) {
        this.a = 1;
        this.b = e3Var;
        this.c = j3Var;
    }
}
