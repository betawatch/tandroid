package gi;

import android.graphics.Rect;
import android.graphics.RectF;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import org.telegram.messenger.bd;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class g6 extends j1.b {
    public final /* synthetic */ int o = 0;
    public final Rect p;
    public final /* synthetic */ View q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g6(org.telegram.ui.ActionBar.j3 j3Var, org.telegram.ui.ActionBar.j3 j3Var2) {
        super(j3Var2);
        this.q = j3Var;
        this.p = new Rect();
    }

    @Override // j1.b
    public final int g(float f10, float f11) {
        switch (this.o) {
            case 0:
                h6 h6Var = (h6) this.q;
                if (Math.abs(f10 - h6Var.l0) <= org.telegram.messenger.g0.L(30.0f) && Math.abs(f11 - h6Var.k0) <= org.telegram.messenger.g0.L(30.0f) && !h6Var.b() && !h6Var.v0) {
                    return 0;
                }
                if (Math.abs(f10 - h6Var.m0) <= org.telegram.messenger.g0.L(30.0f) && Math.abs(f11 - h6Var.k0) <= org.telegram.messenger.g0.L(30.0f) && !h6Var.b() && !h6Var.v0) {
                    return 2;
                }
                if (Math.abs(f10 - h6Var.j0) > org.telegram.messenger.g0.L(60.0f) || Math.abs(f11 - h6Var.k0) > org.telegram.messenger.g0.L(60.0f)) {
                    return TLObject.FLAG_31;
                }
                return 1;
            default:
                org.telegram.ui.ActionBar.j3 j3Var = (org.telegram.ui.ActionBar.j3) this.q;
                ArrayList arrayList = j3Var.S;
                if (j3Var.W >= 0.5f) {
                    org.telegram.ui.Cells.y yVar = j3Var.j0;
                    if (yVar != null && yVar.getBounds().contains((int) f10, (int) f11)) {
                        return 1;
                    }
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        org.telegram.ui.ActionBar.i3 i3Var = (org.telegram.ui.ActionBar.i3) arrayList.get(size);
                        float f12 = i3Var.i;
                        RectF rectF = i3Var.a;
                        if (Math.abs(f12) < 0.4f && rectF.contains(f10, f11)) {
                            Rect bounds = i3Var.d.l.getBounds();
                            return (bounds.isEmpty() || !bounds.contains((int) (f10 - rectF.left), (int) ((f11 - rectF.top) - ((float) org.telegram.messenger.g0.L(24.0f))))) ? size + 1000 : size + 2000;
                        }
                    }
                }
                return -1;
        }
    }

    @Override // j1.b
    public final void h(ArrayList arrayList) {
        switch (this.o) {
            case 0:
                h6 h6Var = (h6) this.q;
                if (!h6Var.b() && !h6Var.v0) {
                    arrayList.add(0);
                }
                arrayList.add(1);
                if (!h6Var.b() && !h6Var.v0) {
                    arrayList.add(2);
                    break;
                }
                break;
            default:
                org.telegram.ui.ActionBar.j3 j3Var = (org.telegram.ui.ActionBar.j3) this.q;
                ArrayList arrayList2 = j3Var.S;
                if (j3Var.W >= 0.5f) {
                    org.telegram.ui.Cells.y yVar = j3Var.j0;
                    if (yVar != null && !yVar.getBounds().isEmpty()) {
                        arrayList.add(1);
                    }
                    for (int i3 = 0; i3 < arrayList2.size(); i3++) {
                        org.telegram.ui.ActionBar.i3 i3Var = (org.telegram.ui.ActionBar.i3) arrayList2.get(i3);
                        if (Math.abs(i3Var.i) < 0.4f && !i3Var.a.isEmpty()) {
                            arrayList.add(Integer.valueOf(i3 + 1000));
                            org.telegram.ui.ActionBar.y2 y2Var = i3Var.d;
                            if (y2Var != null && !y2Var.l.getBounds().isEmpty()) {
                                arrayList.add(Integer.valueOf(i3 + 2000));
                            }
                        }
                    }
                    break;
                }
                break;
        }
    }

    @Override // j1.b
    public final boolean k(int i3, int i10) {
        int i11;
        boolean z10;
        int i12 = this.o;
        View view = this.q;
        switch (i12) {
            case 0:
                h6 h6Var = (h6) view;
                if (h6Var.a != null && !h6Var.v0 && i10 == 16) {
                    if (i3 == 0) {
                        if (!h6Var.b()) {
                            if (!h6Var.s0 || !h6Var.B0) {
                                ((s9) h6Var.a).c();
                                break;
                            } else {
                                h6Var.A0 = false;
                                h6Var.H0.e(true, 1.0f);
                                i3 i3Var = ((s9) h6Var.a).a.U0;
                                i3Var.a.t(bd.M0(2131744671, null), true, true);
                                i3Var.invalidate();
                                h6Var.invalidate();
                                break;
                            }
                        }
                    } else if (i3 == 1) {
                        if (!h6Var.b()) {
                            if (!h6Var.s0) {
                                if (!h6Var.p0) {
                                    ((s9) h6Var.a).d();
                                    break;
                                } else if (va.c(((s9) h6Var.a).a)) {
                                    h6Var.S = 0L;
                                    h6Var.R = System.currentTimeMillis();
                                    h6Var.B0 = false;
                                    ((s9) h6Var.a).f(new f6(this, 0), false);
                                    break;
                                }
                            } else {
                                h6Var.s0 = false;
                                h6Var.A0 = false;
                                h6Var.w0 = SystemClock.elapsedRealtime();
                                h6Var.v0 = true;
                                ((s9) h6Var.a).e(false);
                                h6Var.invalidate();
                                break;
                            }
                        } else {
                            ((s9) h6Var.a).a();
                            break;
                        }
                    } else if (i3 == 2 && !h6Var.b()) {
                        h6Var.d(180.0f);
                        ((s9) h6Var.a).b();
                        break;
                    }
                }
                break;
            default:
                org.telegram.ui.ActionBar.j3 j3Var = (org.telegram.ui.ActionBar.j3) view;
                ArrayList arrayList = j3Var.S;
                if (i10 == 16) {
                    if (i3 != 1) {
                        if (i3 >= 2000) {
                            i11 = i3 - 2000;
                            z10 = true;
                        } else if (i3 >= 1000) {
                            i11 = i3 - 1000;
                            z10 = false;
                        }
                        if (i11 >= 0 && i11 < arrayList.size()) {
                            org.telegram.ui.ActionBar.i3 i3Var2 = (org.telegram.ui.ActionBar.i3) arrayList.get(i11);
                            if (!z10) {
                                if (j3Var.a != null) {
                                    j3Var.a(false);
                                    i3Var2.getClass();
                                    j3Var.a.e(i3Var2.c);
                                    break;
                                }
                            } else {
                                org.telegram.ui.ActionBar.b3 b3Var = j3Var.a;
                                if (b3Var != null) {
                                    b3Var.g(i3Var2.c, new mi.f(7, this, i3Var2));
                                    break;
                                }
                            }
                        }
                    } else {
                        org.telegram.ui.ActionBar.b3 b3Var2 = j3Var.a;
                        if (b3Var2 != null) {
                            b3Var2.f();
                        }
                        j3Var.a(false);
                        break;
                    }
                }
                break;
        }
        return false;
    }

    @Override // j1.b
    public final void l(int i3, s0.d dVar) {
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
                AccessibilityNodeInfo accessibilityNodeInfo = dVar.a;
                h6 h6Var = (h6) view;
                dVar.i("android.widget.Button");
                if (i3 == 0) {
                    int L = org.telegram.messenger.g0.L(22.0f);
                    float f10 = h6Var.l0;
                    float f11 = L;
                    float f12 = h6Var.k0;
                    rect.set((int) (f10 - f11), (int) (f12 - f11), (int) (f10 + f11), (int) (f12 + f11));
                    dVar.h(rect);
                    dVar.j((h6Var.s0 && h6Var.B0) ? bd.M0(2131754846, null) : bd.M0(2131754912, null));
                    z10 = (h6Var.v0 || h6Var.b()) ? false : true;
                    accessibilityNodeInfo.setEnabled(z10);
                    if (z10) {
                        dVar.b(s0.c.c);
                        break;
                    }
                } else if (i3 == 1) {
                    int L2 = org.telegram.messenger.g0.L(40.0f);
                    float f13 = h6Var.j0;
                    float f14 = L2;
                    float f15 = h6Var.k0;
                    rect.set((int) (f13 - f14), (int) (f15 - f14), (int) (f13 + f14), (int) (f15 + f14));
                    dVar.h(rect);
                    dVar.j(h6Var.b() ? bd.M0(2131745650, null) : h6Var.s0 ? bd.M0(2131754754, null) : h6Var.p0 ? bd.M0(2131754758, null) : bd.M0(2131754747, null));
                    accessibilityNodeInfo.setEnabled(!h6Var.v0);
                    if (!h6Var.v0) {
                        dVar.b(s0.c.c);
                        break;
                    }
                } else if (i3 == 2) {
                    int L3 = org.telegram.messenger.g0.L(22.0f);
                    float f16 = h6Var.m0;
                    float f17 = L3;
                    float f18 = h6Var.k0;
                    rect.set((int) (f16 - f17), (int) (f18 - f17), (int) (f16 + f17), (int) (f18 + f17));
                    dVar.h(rect);
                    dVar.j(bd.M0(2131754752, null));
                    z10 = (h6Var.v0 || h6Var.b()) ? false : true;
                    accessibilityNodeInfo.setEnabled(z10);
                    if (z10) {
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
                org.telegram.ui.ActionBar.j3 j3Var = (org.telegram.ui.ActionBar.j3) view;
                ArrayList arrayList = j3Var.S;
                dVar.i("android.widget.Button");
                dVar.b(s0.c.c);
                if (i3 != 1) {
                    if (i3 < 2000) {
                        if (i3 < 1000) {
                            rect.set(0, 0, 1, 1);
                            dVar.h(rect);
                            dVar.p(false);
                            break;
                        } else {
                            i10 = i3 - 1000;
                            z11 = false;
                        }
                    } else {
                        i10 = i3 - 2000;
                        z11 = true;
                    }
                    if (i10 >= 0 && i10 < arrayList.size()) {
                        org.telegram.ui.ActionBar.i3 i3Var = (org.telegram.ui.ActionBar.i3) arrayList.get(i10);
                        org.telegram.ui.ActionBar.a3 a3Var = i3Var.c;
                        RectF rectF = i3Var.a;
                        if (a3Var != null && a3Var.b() != null) {
                            str3 = i3Var.c.b();
                        }
                        if (!z11) {
                            rect.set((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
                            dVar.h(rect);
                            if (TextUtils.isEmpty(str3)) {
                                str = bd.M0(2131747825, null);
                            } else {
                                str = bd.M0(2131747825, null) + ", " + str3;
                            }
                            dVar.j(str);
                            break;
                        } else {
                            Rect bounds = i3Var.d.l.getBounds();
                            rect.set((int) (rectF.left + bounds.left), (int) (rectF.top + org.telegram.messenger.g0.L(24.0f) + bounds.top), (int) (rectF.left + bounds.right), (int) (rectF.top + org.telegram.messenger.g0.L(24.0f) + bounds.bottom));
                            dVar.h(rect);
                            if (TextUtils.isEmpty(str3)) {
                                str2 = bd.M0(2131752041, null);
                            } else {
                                str2 = bd.M0(2131752041, null) + ", " + str3;
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
                    org.telegram.ui.Cells.y yVar = j3Var.j0;
                    if (yVar != null) {
                        rect.set(yVar.getBounds());
                    } else {
                        rect.set(0, 0, 1, 1);
                        dVar.p(false);
                    }
                    dVar.h(rect);
                    dVar.j(bd.M0(2131753099, null));
                    break;
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g6(h6 h6Var, h6 h6Var2) {
        super(h6Var2);
        this.q = h6Var;
        this.p = new Rect();
    }
}
