package fi;

import android.graphics.Rect;
import android.graphics.RectF;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import org.telegram.messenger.id;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class f6 extends k1.b {
    public final /* synthetic */ int o = 0;
    public final Rect p;
    public final /* synthetic */ View q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f6(org.telegram.ui.ActionBar.k3 k3Var, org.telegram.ui.ActionBar.k3 k3Var2) {
        super(k3Var2);
        this.q = k3Var;
        this.p = new Rect();
    }

    @Override // k1.b
    public final int g(float f10, float f11) {
        switch (this.o) {
            case 0:
                g6 g6Var = (g6) this.q;
                if (Math.abs(f10 - g6Var.k0) <= org.telegram.messenger.g0.L(30.0f) && Math.abs(f11 - g6Var.j0) <= org.telegram.messenger.g0.L(30.0f) && !g6Var.b() && !g6Var.u0) {
                    return 0;
                }
                if (Math.abs(f10 - g6Var.l0) <= org.telegram.messenger.g0.L(30.0f) && Math.abs(f11 - g6Var.j0) <= org.telegram.messenger.g0.L(30.0f) && !g6Var.b() && !g6Var.u0) {
                    return 2;
                }
                if (Math.abs(f10 - g6Var.i0) > org.telegram.messenger.g0.L(60.0f) || Math.abs(f11 - g6Var.j0) > org.telegram.messenger.g0.L(60.0f)) {
                    return TLObject.FLAG_31;
                }
                return 1;
            default:
                org.telegram.ui.ActionBar.k3 k3Var = (org.telegram.ui.ActionBar.k3) this.q;
                ArrayList arrayList = k3Var.R;
                if (k3Var.V >= 0.5f) {
                    org.telegram.ui.Cells.y yVar = k3Var.i0;
                    if (yVar != null && yVar.getBounds().contains((int) f10, (int) f11)) {
                        return 1;
                    }
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        org.telegram.ui.ActionBar.j3 j3Var = (org.telegram.ui.ActionBar.j3) arrayList.get(size);
                        float f12 = j3Var.i;
                        RectF rectF = j3Var.a;
                        if (Math.abs(f12) < 0.4f && rectF.contains(f10, f11)) {
                            Rect bounds = j3Var.d.l.getBounds();
                            return (bounds.isEmpty() || !bounds.contains((int) (f10 - rectF.left), (int) ((f11 - rectF.top) - ((float) org.telegram.messenger.g0.L(24.0f))))) ? size + 1000 : size + 2000;
                        }
                    }
                }
                return -1;
        }
    }

    @Override // k1.b
    public final void h(ArrayList arrayList) {
        switch (this.o) {
            case 0:
                g6 g6Var = (g6) this.q;
                if (!g6Var.b() && !g6Var.u0) {
                    arrayList.add(0);
                }
                arrayList.add(1);
                if (!g6Var.b() && !g6Var.u0) {
                    arrayList.add(2);
                    break;
                }
                break;
            default:
                org.telegram.ui.ActionBar.k3 k3Var = (org.telegram.ui.ActionBar.k3) this.q;
                ArrayList arrayList2 = k3Var.R;
                if (k3Var.V >= 0.5f) {
                    org.telegram.ui.Cells.y yVar = k3Var.i0;
                    if (yVar != null && !yVar.getBounds().isEmpty()) {
                        arrayList.add(1);
                    }
                    for (int i7 = 0; i7 < arrayList2.size(); i7++) {
                        org.telegram.ui.ActionBar.j3 j3Var = (org.telegram.ui.ActionBar.j3) arrayList2.get(i7);
                        if (Math.abs(j3Var.i) < 0.4f && !j3Var.a.isEmpty()) {
                            arrayList.add(Integer.valueOf(i7 + 1000));
                            org.telegram.ui.ActionBar.a3 a3Var = j3Var.d;
                            if (a3Var != null && !a3Var.l.getBounds().isEmpty()) {
                                arrayList.add(Integer.valueOf(i7 + 2000));
                            }
                        }
                    }
                    break;
                }
                break;
        }
    }

    @Override // k1.b
    public final boolean k(int i7, int i10) {
        int i11;
        boolean z9;
        int i12 = this.o;
        View view = this.q;
        switch (i12) {
            case 0:
                g6 g6Var = (g6) view;
                if (g6Var.a == null || g6Var.u0 || i10 != 16) {
                    return false;
                }
                if (i7 != 0) {
                    if (i7 != 1) {
                        if (i7 != 2 || g6Var.b()) {
                            return false;
                        }
                        g6Var.d(180.0f);
                        ((s9) g6Var.a).b();
                    } else if (g6Var.b()) {
                        ((s9) g6Var.a).a();
                    } else if (g6Var.r0) {
                        g6Var.r0 = false;
                        g6Var.z0 = false;
                        g6Var.v0 = SystemClock.elapsedRealtime();
                        g6Var.u0 = true;
                        ((s9) g6Var.a).e(false);
                        g6Var.invalidate();
                    } else if (!g6Var.o0) {
                        ((s9) g6Var.a).d();
                    } else if (va.c(((s9) g6Var.a).a)) {
                        g6Var.R = 0L;
                        g6Var.Q = System.currentTimeMillis();
                        g6Var.A0 = false;
                        ((s9) g6Var.a).f(new di.s7(this, 26), false);
                    }
                } else {
                    if (g6Var.b()) {
                        return false;
                    }
                    if (g6Var.r0 && g6Var.A0) {
                        g6Var.z0 = false;
                        g6Var.G0.e(true, 1.0f);
                        k3 k3Var = ((s9) g6Var.a).a.T0;
                        k3Var.a.t(id.M0(2131744664, null), true, true);
                        k3Var.invalidate();
                        g6Var.invalidate();
                    } else {
                        ((s9) g6Var.a).c();
                    }
                }
                return true;
            default:
                org.telegram.ui.ActionBar.k3 k3Var2 = (org.telegram.ui.ActionBar.k3) view;
                ArrayList arrayList = k3Var2.R;
                if (i10 != 16) {
                    return false;
                }
                if (i7 == 1) {
                    org.telegram.ui.ActionBar.d3 d3Var = k3Var2.a;
                    if (d3Var != null) {
                        d3Var.f();
                    }
                    k3Var2.a(false);
                } else {
                    if (i7 >= 2000) {
                        i11 = i7 - 2000;
                        z9 = true;
                    } else {
                        if (i7 < 1000) {
                            return false;
                        }
                        i11 = i7 - 1000;
                        z9 = false;
                    }
                    if (i11 < 0 || i11 >= arrayList.size()) {
                        return false;
                    }
                    org.telegram.ui.ActionBar.j3 j3Var = (org.telegram.ui.ActionBar.j3) arrayList.get(i11);
                    if (z9) {
                        org.telegram.ui.ActionBar.d3 d3Var2 = k3Var2.a;
                        if (d3Var2 != null) {
                            d3Var2.g(j3Var.c, new org.telegram.messenger.voip.k(3, this, j3Var));
                        }
                    } else if (k3Var2.a != null) {
                        k3Var2.a(false);
                        j3Var.getClass();
                        k3Var2.a.e(j3Var.c);
                    }
                }
                return true;
        }
    }

    @Override // k1.b
    public final void l(int i7, s0.d dVar) {
        boolean z9;
        int i10;
        boolean z10;
        String str;
        String str2;
        int i11 = this.o;
        String str3 = "";
        Rect rect = this.p;
        View view = this.q;
        switch (i11) {
            case 0:
                AccessibilityNodeInfo accessibilityNodeInfo = dVar.a;
                g6 g6Var = (g6) view;
                dVar.i("android.widget.Button");
                if (i7 == 0) {
                    int L = org.telegram.messenger.g0.L(22.0f);
                    float f10 = g6Var.k0;
                    float f11 = L;
                    float f12 = g6Var.j0;
                    rect.set((int) (f10 - f11), (int) (f12 - f11), (int) (f10 + f11), (int) (f12 + f11));
                    dVar.h(rect);
                    dVar.j((g6Var.r0 && g6Var.A0) ? id.M0(2131754846, null) : id.M0(2131754912, null));
                    z9 = (g6Var.u0 || g6Var.b()) ? false : true;
                    accessibilityNodeInfo.setEnabled(z9);
                    if (z9) {
                        dVar.b(s0.c.c);
                        break;
                    }
                } else if (i7 == 1) {
                    int L2 = org.telegram.messenger.g0.L(40.0f);
                    float f13 = g6Var.i0;
                    float f14 = L2;
                    float f15 = g6Var.j0;
                    rect.set((int) (f13 - f14), (int) (f15 - f14), (int) (f13 + f14), (int) (f15 + f14));
                    dVar.h(rect);
                    dVar.j(g6Var.b() ? id.M0(2131745643, null) : g6Var.r0 ? id.M0(2131754754, null) : g6Var.o0 ? id.M0(2131754758, null) : id.M0(2131754747, null));
                    accessibilityNodeInfo.setEnabled(!g6Var.u0);
                    if (!g6Var.u0) {
                        dVar.b(s0.c.c);
                        break;
                    }
                } else if (i7 == 2) {
                    int L3 = org.telegram.messenger.g0.L(22.0f);
                    float f16 = g6Var.l0;
                    float f17 = L3;
                    float f18 = g6Var.j0;
                    rect.set((int) (f16 - f17), (int) (f18 - f17), (int) (f16 + f17), (int) (f18 + f17));
                    dVar.h(rect);
                    dVar.j(id.M0(2131754752, null));
                    z9 = (g6Var.u0 || g6Var.b()) ? false : true;
                    accessibilityNodeInfo.setEnabled(z9);
                    if (z9) {
                        dVar.b(s0.c.c);
                        break;
                    }
                } else {
                    rect.set(0, 0, 1, 1);
                    dVar.h(rect);
                    dVar.p(false);
                    dVar.j("");
                    break;
                }
                break;
            default:
                org.telegram.ui.ActionBar.k3 k3Var = (org.telegram.ui.ActionBar.k3) view;
                ArrayList arrayList = k3Var.R;
                dVar.i("android.widget.Button");
                dVar.b(s0.c.c);
                if (i7 != 1) {
                    if (i7 < 2000) {
                        if (i7 < 1000) {
                            rect.set(0, 0, 1, 1);
                            dVar.h(rect);
                            dVar.p(false);
                            break;
                        } else {
                            i10 = i7 - 1000;
                            z10 = false;
                        }
                    } else {
                        i10 = i7 - 2000;
                        z10 = true;
                    }
                    if (i10 >= 0 && i10 < arrayList.size()) {
                        org.telegram.ui.ActionBar.j3 j3Var = (org.telegram.ui.ActionBar.j3) arrayList.get(i10);
                        org.telegram.ui.ActionBar.c3 c3Var = j3Var.c;
                        RectF rectF = j3Var.a;
                        if (c3Var != null && c3Var.b() != null) {
                            str3 = j3Var.c.b();
                        }
                        if (!z10) {
                            rect.set((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
                            dVar.h(rect);
                            if (TextUtils.isEmpty(str3)) {
                                str = id.M0(2131747818, null);
                            } else {
                                str = id.M0(2131747818, null) + ", " + str3;
                            }
                            dVar.j(str);
                            break;
                        } else {
                            Rect bounds = j3Var.d.l.getBounds();
                            rect.set((int) (rectF.left + bounds.left), (int) (rectF.top + org.telegram.messenger.g0.L(24.0f) + bounds.top), (int) (rectF.left + bounds.right), (int) (rectF.top + org.telegram.messenger.g0.L(24.0f) + bounds.bottom));
                            dVar.h(rect);
                            if (TextUtils.isEmpty(str3)) {
                                str2 = id.M0(2131752041, null);
                            } else {
                                str2 = id.M0(2131752041, null) + ", " + str3;
                            }
                            dVar.j(str2);
                            break;
                        }
                    } else {
                        rect.set(0, 0, 1, 1);
                        dVar.h(rect);
                        dVar.p(false);
                        break;
                    }
                } else {
                    org.telegram.ui.Cells.y yVar = k3Var.i0;
                    if (yVar != null) {
                        rect.set(yVar.getBounds());
                    } else {
                        rect.set(0, 0, 1, 1);
                        dVar.p(false);
                    }
                    dVar.h(rect);
                    dVar.j(id.M0(2131753099, null));
                    break;
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f6(g6 g6Var, g6 g6Var2) {
        super(g6Var2);
        this.q = g6Var;
        this.p = new Rect();
    }
}
