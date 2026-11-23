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

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final class m6 extends k1.b {
    public final /* synthetic */ int o = 0;
    public final Rect p;
    public final /* synthetic */ View q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m6(org.telegram.ui.ActionBar.m3 m3Var, org.telegram.ui.ActionBar.m3 m3Var2) {
        super(m3Var2);
        this.q = m3Var;
        this.p = new Rect();
    }

    @Override // k1.b
    public final int g(float f10, float f11) {
        switch (this.o) {
            case 0:
                n6 n6Var = (n6) this.q;
                if (Math.abs(f10 - n6Var.l0) <= org.telegram.messenger.g0.L(30.0f) && Math.abs(f11 - n6Var.k0) <= org.telegram.messenger.g0.L(30.0f) && !n6Var.b() && !n6Var.v0) {
                    return 0;
                }
                if (Math.abs(f10 - n6Var.m0) <= org.telegram.messenger.g0.L(30.0f) && Math.abs(f11 - n6Var.k0) <= org.telegram.messenger.g0.L(30.0f) && !n6Var.b() && !n6Var.v0) {
                    return 2;
                }
                if (Math.abs(f10 - n6Var.j0) > org.telegram.messenger.g0.L(60.0f) || Math.abs(f11 - n6Var.k0) > org.telegram.messenger.g0.L(60.0f)) {
                    return TLObject.FLAG_31;
                }
                return 1;
            default:
                org.telegram.ui.ActionBar.m3 m3Var = (org.telegram.ui.ActionBar.m3) this.q;
                ArrayList arrayList = m3Var.S;
                if (m3Var.W >= 0.5f) {
                    org.telegram.ui.Cells.y yVar = m3Var.j0;
                    if (yVar != null && yVar.getBounds().contains((int) f10, (int) f11)) {
                        return 1;
                    }
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        org.telegram.ui.ActionBar.l3 l3Var = (org.telegram.ui.ActionBar.l3) arrayList.get(size);
                        float f12 = l3Var.i;
                        RectF rectF = l3Var.a;
                        if (Math.abs(f12) < 0.4f && rectF.contains(f10, f11)) {
                            Rect bounds = l3Var.d.l.getBounds();
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
                n6 n6Var = (n6) this.q;
                if (!n6Var.b() && !n6Var.v0) {
                    arrayList.add(0);
                }
                arrayList.add(1);
                if (!n6Var.b() && !n6Var.v0) {
                    arrayList.add(2);
                    break;
                }
                break;
            default:
                org.telegram.ui.ActionBar.m3 m3Var = (org.telegram.ui.ActionBar.m3) this.q;
                ArrayList arrayList2 = m3Var.S;
                if (m3Var.W >= 0.5f) {
                    org.telegram.ui.Cells.y yVar = m3Var.j0;
                    if (yVar != null && !yVar.getBounds().isEmpty()) {
                        arrayList.add(1);
                    }
                    for (int i7 = 0; i7 < arrayList2.size(); i7++) {
                        org.telegram.ui.ActionBar.l3 l3Var = (org.telegram.ui.ActionBar.l3) arrayList2.get(i7);
                        if (Math.abs(l3Var.i) < 0.4f && !l3Var.a.isEmpty()) {
                            arrayList.add(Integer.valueOf(i7 + 1000));
                            org.telegram.ui.ActionBar.c3 c3Var = l3Var.d;
                            if (c3Var != null && !c3Var.l.getBounds().isEmpty()) {
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
                n6 n6Var = (n6) view;
                if (n6Var.a == null || n6Var.v0 || i10 != 16) {
                    return false;
                }
                if (i7 != 0) {
                    if (i7 != 1) {
                        if (i7 != 2 || n6Var.b()) {
                            return false;
                        }
                        n6Var.d(180.0f);
                        ((ka) n6Var.a).b();
                    } else if (n6Var.b()) {
                        ((ka) n6Var.a).a();
                    } else if (n6Var.s0) {
                        n6Var.s0 = false;
                        n6Var.A0 = false;
                        n6Var.w0 = SystemClock.elapsedRealtime();
                        n6Var.v0 = true;
                        ((ka) n6Var.a).e(false);
                        n6Var.invalidate();
                    } else if (!n6Var.p0) {
                        ((ka) n6Var.a).d();
                    } else if (nb.c(((ka) n6Var.a).a)) {
                        n6Var.S = 0L;
                        n6Var.R = System.currentTimeMillis();
                        n6Var.B0 = false;
                        ((ka) n6Var.a).f(new w(this, 14), false);
                    }
                } else {
                    if (n6Var.b()) {
                        return false;
                    }
                    if (n6Var.s0 && n6Var.B0) {
                        n6Var.A0 = false;
                        n6Var.H0.e(true, 1.0f);
                        r3 r3Var = ((ka) n6Var.a).a.U0;
                        r3Var.a.t(gd.N0(2131744417, null), true, true);
                        r3Var.invalidate();
                        n6Var.invalidate();
                    } else {
                        ((ka) n6Var.a).c();
                    }
                }
                return true;
            default:
                org.telegram.ui.ActionBar.m3 m3Var = (org.telegram.ui.ActionBar.m3) view;
                ArrayList arrayList = m3Var.S;
                if (i10 != 16) {
                    return false;
                }
                if (i7 == 1) {
                    org.telegram.ui.ActionBar.f3 f3Var = m3Var.a;
                    if (f3Var != null) {
                        f3Var.f();
                    }
                    m3Var.a(false);
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
                    org.telegram.ui.ActionBar.l3 l3Var = (org.telegram.ui.ActionBar.l3) arrayList.get(i11);
                    if (z10) {
                        org.telegram.ui.ActionBar.f3 f3Var2 = m3Var.a;
                        if (f3Var2 != null) {
                            f3Var2.g(l3Var.c, new org.telegram.ui.ActionBar.b3(i13, this, l3Var));
                        }
                    } else if (m3Var.a != null) {
                        m3Var.a(false);
                        l3Var.getClass();
                        m3Var.a.e(l3Var.c);
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
                n6 n6Var = (n6) view;
                cVar.i("android.widget.Button");
                if (i7 == 0) {
                    int L = org.telegram.messenger.g0.L(22.0f);
                    float f10 = n6Var.l0;
                    float f11 = L;
                    float f12 = n6Var.k0;
                    rect.set((int) (f10 - f11), (int) (f12 - f11), (int) (f10 + f11), (int) (f12 + f11));
                    cVar.h(rect);
                    cVar.j((n6Var.s0 && n6Var.B0) ? gd.N0(2131754845, null) : gd.N0(2131754912, null));
                    z10 = (n6Var.v0 || n6Var.b()) ? false : true;
                    accessibilityNodeInfo.setEnabled(z10);
                    if (z10) {
                        cVar.b(s0.b.c);
                        break;
                    }
                } else if (i7 == 1) {
                    int L2 = org.telegram.messenger.g0.L(40.0f);
                    float f13 = n6Var.j0;
                    float f14 = L2;
                    float f15 = n6Var.k0;
                    rect.set((int) (f13 - f14), (int) (f15 - f14), (int) (f13 + f14), (int) (f15 + f14));
                    cVar.h(rect);
                    cVar.j(n6Var.b() ? gd.N0(2131745444, null) : n6Var.s0 ? gd.N0(2131754753, null) : n6Var.p0 ? gd.N0(2131754757, null) : gd.N0(2131754746, null));
                    accessibilityNodeInfo.setEnabled(!n6Var.v0);
                    if (!n6Var.v0) {
                        cVar.b(s0.b.c);
                        break;
                    }
                } else if (i7 == 2) {
                    int L3 = org.telegram.messenger.g0.L(22.0f);
                    float f16 = n6Var.m0;
                    float f17 = L3;
                    float f18 = n6Var.k0;
                    rect.set((int) (f16 - f17), (int) (f18 - f17), (int) (f16 + f17), (int) (f18 + f17));
                    cVar.h(rect);
                    cVar.j(gd.N0(2131754751, null));
                    z10 = (n6Var.v0 || n6Var.b()) ? false : true;
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
                org.telegram.ui.ActionBar.m3 m3Var = (org.telegram.ui.ActionBar.m3) view;
                ArrayList arrayList = m3Var.S;
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
                        org.telegram.ui.ActionBar.l3 l3Var = (org.telegram.ui.ActionBar.l3) arrayList.get(i10);
                        org.telegram.ui.ActionBar.e3 e3Var = l3Var.c;
                        RectF rectF = l3Var.a;
                        if (e3Var != null && e3Var.b() != null) {
                            str3 = l3Var.c.b();
                        }
                        if (!z11) {
                            rect.set((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
                            cVar.h(rect);
                            if (TextUtils.isEmpty(str3)) {
                                str = gd.N0(2131747623, null);
                            } else {
                                str = gd.N0(2131747623, null) + ", " + str3;
                            }
                            cVar.j(str);
                            break;
                        } else {
                            Rect bounds = l3Var.d.l.getBounds();
                            rect.set((int) (rectF.left + bounds.left), (int) (rectF.top + org.telegram.messenger.g0.L(24.0f) + bounds.top), (int) (rectF.left + bounds.right), (int) (rectF.top + org.telegram.messenger.g0.L(24.0f) + bounds.bottom));
                            cVar.h(rect);
                            if (TextUtils.isEmpty(str3)) {
                                str2 = gd.N0(2131752029, null);
                            } else {
                                str2 = gd.N0(2131752029, null) + ", " + str3;
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
                    org.telegram.ui.Cells.y yVar = m3Var.j0;
                    if (yVar != null) {
                        rect.set(yVar.getBounds());
                    } else {
                        rect.set(0, 0, 1, 1);
                        cVar.p(false);
                    }
                    cVar.h(rect);
                    cVar.j(gd.N0(2131753096, null));
                    break;
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m6(n6 n6Var, n6 n6Var2) {
        super(n6Var2);
        this.q = n6Var;
        this.p = new Rect();
    }
}
