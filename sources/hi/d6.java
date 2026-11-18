package hi;

import android.graphics.Rect;
import android.graphics.RectF;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import org.telegram.messenger.gd;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes4.dex */
public final class d6 extends k1.b {
    public final /* synthetic */ int o = 0;
    public final Rect p;
    public final /* synthetic */ View q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d6(org.telegram.ui.ActionBar.n3 n3Var, org.telegram.ui.ActionBar.n3 n3Var2) {
        super(n3Var2);
        this.q = n3Var;
        this.p = new Rect();
    }

    @Override // k1.b
    public final int g(float f10, float f11) {
        switch (this.o) {
            case 0:
                e6 e6Var = (e6) this.q;
                if (Math.abs(f10 - e6Var.l0) <= org.telegram.messenger.g0.L(30.0f) && Math.abs(f11 - e6Var.k0) <= org.telegram.messenger.g0.L(30.0f) && !e6Var.b() && !e6Var.v0) {
                    return 0;
                }
                if (Math.abs(f10 - e6Var.m0) <= org.telegram.messenger.g0.L(30.0f) && Math.abs(f11 - e6Var.k0) <= org.telegram.messenger.g0.L(30.0f) && !e6Var.b() && !e6Var.v0) {
                    return 2;
                }
                if (Math.abs(f10 - e6Var.j0) > org.telegram.messenger.g0.L(60.0f) || Math.abs(f11 - e6Var.k0) > org.telegram.messenger.g0.L(60.0f)) {
                    return TLObject.FLAG_31;
                }
                return 1;
            default:
                org.telegram.ui.ActionBar.n3 n3Var = (org.telegram.ui.ActionBar.n3) this.q;
                ArrayList arrayList = n3Var.S;
                if (n3Var.W >= 0.5f) {
                    org.telegram.ui.Cells.y yVar = n3Var.j0;
                    if (yVar != null && yVar.getBounds().contains((int) f10, (int) f11)) {
                        return 1;
                    }
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        org.telegram.ui.ActionBar.m3 m3Var = (org.telegram.ui.ActionBar.m3) arrayList.get(size);
                        float f12 = m3Var.i;
                        RectF rectF = m3Var.a;
                        if (Math.abs(f12) < 0.4f && rectF.contains(f10, f11)) {
                            Rect bounds = m3Var.d.l.getBounds();
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
                e6 e6Var = (e6) this.q;
                if (!e6Var.b() && !e6Var.v0) {
                    arrayList.add(0);
                }
                arrayList.add(1);
                if (!e6Var.b() && !e6Var.v0) {
                    arrayList.add(2);
                    break;
                }
                break;
            default:
                org.telegram.ui.ActionBar.n3 n3Var = (org.telegram.ui.ActionBar.n3) this.q;
                ArrayList arrayList2 = n3Var.S;
                if (n3Var.W >= 0.5f) {
                    org.telegram.ui.Cells.y yVar = n3Var.j0;
                    if (yVar != null && !yVar.getBounds().isEmpty()) {
                        arrayList.add(1);
                    }
                    for (int i7 = 0; i7 < arrayList2.size(); i7++) {
                        org.telegram.ui.ActionBar.m3 m3Var = (org.telegram.ui.ActionBar.m3) arrayList2.get(i7);
                        if (Math.abs(m3Var.i) < 0.4f && !m3Var.a.isEmpty()) {
                            arrayList.add(Integer.valueOf(i7 + 1000));
                            org.telegram.ui.ActionBar.d3 d3Var = m3Var.d;
                            if (d3Var != null && !d3Var.l.getBounds().isEmpty()) {
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
        boolean z10;
        int i12 = this.o;
        int i13 = 2;
        View view = this.q;
        switch (i12) {
            case 0:
                e6 e6Var = (e6) view;
                if (e6Var.a == null || e6Var.v0 || i10 != 16) {
                    return false;
                }
                if (i7 != 0) {
                    if (i7 != 1) {
                        if (i7 != 2 || e6Var.b()) {
                            return false;
                        }
                        e6Var.d(180.0f);
                        ((q9) e6Var.a).b();
                    } else if (e6Var.b()) {
                        ((q9) e6Var.a).a();
                    } else if (e6Var.s0) {
                        e6Var.s0 = false;
                        e6Var.A0 = false;
                        e6Var.w0 = SystemClock.elapsedRealtime();
                        e6Var.v0 = true;
                        ((q9) e6Var.a).e(false);
                        e6Var.invalidate();
                    } else if (!e6Var.p0) {
                        ((q9) e6Var.a).d();
                    } else if (ta.c(((q9) e6Var.a).a)) {
                        e6Var.S = 0L;
                        e6Var.R = System.currentTimeMillis();
                        e6Var.B0 = false;
                        ((q9) e6Var.a).f(new k(this, 13), false);
                    }
                } else {
                    if (e6Var.b()) {
                        return false;
                    }
                    if (e6Var.s0 && e6Var.B0) {
                        e6Var.A0 = false;
                        e6Var.H0.e(true, 1.0f);
                        j3 j3Var = ((q9) e6Var.a).a.U0;
                        j3Var.a.t(gd.M0(2131744426, null), true, true);
                        j3Var.invalidate();
                        e6Var.invalidate();
                    } else {
                        ((q9) e6Var.a).c();
                    }
                }
                return true;
            default:
                org.telegram.ui.ActionBar.n3 n3Var = (org.telegram.ui.ActionBar.n3) view;
                ArrayList arrayList = n3Var.S;
                if (i10 != 16) {
                    return false;
                }
                if (i7 == 1) {
                    org.telegram.ui.ActionBar.g3 g3Var = n3Var.a;
                    if (g3Var != null) {
                        g3Var.f();
                    }
                    n3Var.a(false);
                } else {
                    if (i7 >= 2000) {
                        i11 = i7 - 2000;
                        z10 = true;
                    } else {
                        if (i7 < 1000) {
                            return false;
                        }
                        i11 = i7 - 1000;
                        z10 = false;
                    }
                    if (i11 < 0 || i11 >= arrayList.size()) {
                        return false;
                    }
                    org.telegram.ui.ActionBar.m3 m3Var = (org.telegram.ui.ActionBar.m3) arrayList.get(i11);
                    if (z10) {
                        org.telegram.ui.ActionBar.g3 g3Var2 = n3Var.a;
                        if (g3Var2 != null) {
                            g3Var2.g(m3Var.c, new org.telegram.ui.ActionBar.c3(i13, this, m3Var));
                        }
                    } else if (n3Var.a != null) {
                        n3Var.a(false);
                        m3Var.getClass();
                        n3Var.a.e(m3Var.c);
                    }
                }
                return true;
        }
    }

    @Override // k1.b
    public final void l(int i7, s0.c cVar) {
        boolean z10;
        int i10;
        boolean z11;
        String str;
        String str2;
        int i11 = this.o;
        String str3 = "";
        Rect rect = this.p;
        View view = this.q;
        switch (i11) {
            case 0:
                AccessibilityNodeInfo accessibilityNodeInfo = cVar.a;
                e6 e6Var = (e6) view;
                cVar.i("android.widget.Button");
                if (i7 == 0) {
                    int L = org.telegram.messenger.g0.L(22.0f);
                    float f10 = e6Var.l0;
                    float f11 = L;
                    float f12 = e6Var.k0;
                    rect.set((int) (f10 - f11), (int) (f12 - f11), (int) (f10 + f11), (int) (f12 + f11));
                    cVar.h(rect);
                    cVar.j((e6Var.s0 && e6Var.B0) ? gd.M0(2131754846, null) : gd.M0(2131754912, null));
                    z10 = (e6Var.v0 || e6Var.b()) ? false : true;
                    accessibilityNodeInfo.setEnabled(z10);
                    if (z10) {
                        cVar.b(s0.b.c);
                        break;
                    }
                } else if (i7 == 1) {
                    int L2 = org.telegram.messenger.g0.L(40.0f);
                    float f13 = e6Var.j0;
                    float f14 = L2;
                    float f15 = e6Var.k0;
                    rect.set((int) (f13 - f14), (int) (f15 - f14), (int) (f13 + f14), (int) (f15 + f14));
                    cVar.h(rect);
                    cVar.j(e6Var.b() ? gd.M0(2131745445, null) : e6Var.s0 ? gd.M0(2131754754, null) : e6Var.p0 ? gd.M0(2131754758, null) : gd.M0(2131754747, null));
                    accessibilityNodeInfo.setEnabled(!e6Var.v0);
                    if (!e6Var.v0) {
                        cVar.b(s0.b.c);
                        break;
                    }
                } else if (i7 == 2) {
                    int L3 = org.telegram.messenger.g0.L(22.0f);
                    float f16 = e6Var.m0;
                    float f17 = L3;
                    float f18 = e6Var.k0;
                    rect.set((int) (f16 - f17), (int) (f18 - f17), (int) (f16 + f17), (int) (f18 + f17));
                    cVar.h(rect);
                    cVar.j(gd.M0(2131754752, null));
                    z10 = (e6Var.v0 || e6Var.b()) ? false : true;
                    accessibilityNodeInfo.setEnabled(z10);
                    if (z10) {
                        cVar.b(s0.b.c);
                        break;
                    }
                } else {
                    rect.set(0, 0, 1, 1);
                    cVar.h(rect);
                    cVar.p(false);
                    cVar.j("");
                    break;
                }
                break;
            default:
                org.telegram.ui.ActionBar.n3 n3Var = (org.telegram.ui.ActionBar.n3) view;
                ArrayList arrayList = n3Var.S;
                cVar.i("android.widget.Button");
                cVar.b(s0.b.c);
                if (i7 != 1) {
                    if (i7 < 2000) {
                        if (i7 < 1000) {
                            rect.set(0, 0, 1, 1);
                            cVar.h(rect);
                            cVar.p(false);
                            break;
                        } else {
                            i10 = i7 - 1000;
                            z11 = false;
                        }
                    } else {
                        i10 = i7 - 2000;
                        z11 = true;
                    }
                    if (i10 >= 0 && i10 < arrayList.size()) {
                        org.telegram.ui.ActionBar.m3 m3Var = (org.telegram.ui.ActionBar.m3) arrayList.get(i10);
                        org.telegram.ui.ActionBar.f3 f3Var = m3Var.c;
                        RectF rectF = m3Var.a;
                        if (f3Var != null && f3Var.b() != null) {
                            str3 = m3Var.c.b();
                        }
                        if (!z11) {
                            rect.set((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
                            cVar.h(rect);
                            if (TextUtils.isEmpty(str3)) {
                                str = gd.M0(2131747624, null);
                            } else {
                                str = gd.M0(2131747624, null) + ", " + str3;
                            }
                            cVar.j(str);
                            break;
                        } else {
                            Rect bounds = m3Var.d.l.getBounds();
                            rect.set((int) (rectF.left + bounds.left), (int) (rectF.top + org.telegram.messenger.g0.L(24.0f) + bounds.top), (int) (rectF.left + bounds.right), (int) (rectF.top + org.telegram.messenger.g0.L(24.0f) + bounds.bottom));
                            cVar.h(rect);
                            if (TextUtils.isEmpty(str3)) {
                                str2 = gd.M0(2131752030, null);
                            } else {
                                str2 = gd.M0(2131752030, null) + ", " + str3;
                            }
                            cVar.j(str2);
                            break;
                        }
                    } else {
                        rect.set(0, 0, 1, 1);
                        cVar.h(rect);
                        cVar.p(false);
                        break;
                    }
                } else {
                    org.telegram.ui.Cells.y yVar = n3Var.j0;
                    if (yVar != null) {
                        rect.set(yVar.getBounds());
                    } else {
                        rect.set(0, 0, 1, 1);
                        cVar.p(false);
                    }
                    cVar.h(rect);
                    cVar.j(gd.M0(2131753097, null));
                    break;
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d6(e6 e6Var, e6 e6Var2) {
        super(e6Var2);
        this.q = e6Var;
        this.p = new Rect();
    }
}
