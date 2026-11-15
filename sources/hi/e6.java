package hi;

import android.graphics.Rect;
import android.graphics.RectF;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import org.telegram.messenger.hd;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class e6 extends k1.b {
    public final /* synthetic */ int o = 0;
    public final Rect p;
    public final /* synthetic */ View q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e6(org.telegram.ui.ActionBar.j3 j3Var, org.telegram.ui.ActionBar.j3 j3Var2) {
        super(j3Var2);
        this.q = j3Var;
        this.p = new Rect();
    }

    @Override // k1.b
    public final int g(float f10, float f11) {
        switch (this.o) {
            case 0:
                f6 f6Var = (f6) this.q;
                if (Math.abs(f10 - f6Var.l0) <= org.telegram.messenger.g0.L(30.0f) && Math.abs(f11 - f6Var.k0) <= org.telegram.messenger.g0.L(30.0f) && !f6Var.b() && !f6Var.v0) {
                    return 0;
                }
                if (Math.abs(f10 - f6Var.m0) <= org.telegram.messenger.g0.L(30.0f) && Math.abs(f11 - f6Var.k0) <= org.telegram.messenger.g0.L(30.0f) && !f6Var.b() && !f6Var.v0) {
                    return 2;
                }
                if (Math.abs(f10 - f6Var.j0) > org.telegram.messenger.g0.L(60.0f) || Math.abs(f11 - f6Var.k0) > org.telegram.messenger.g0.L(60.0f)) {
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

    @Override // k1.b
    public final void h(ArrayList arrayList) {
        switch (this.o) {
            case 0:
                f6 f6Var = (f6) this.q;
                if (!f6Var.b() && !f6Var.v0) {
                    arrayList.add(0);
                }
                arrayList.add(1);
                if (!f6Var.b() && !f6Var.v0) {
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
                    for (int i7 = 0; i7 < arrayList2.size(); i7++) {
                        org.telegram.ui.ActionBar.i3 i3Var = (org.telegram.ui.ActionBar.i3) arrayList2.get(i7);
                        if (Math.abs(i3Var.i) < 0.4f && !i3Var.a.isEmpty()) {
                            arrayList.add(Integer.valueOf(i7 + 1000));
                            org.telegram.ui.ActionBar.z2 z2Var = i3Var.d;
                            if (z2Var != null && !z2Var.l.getBounds().isEmpty()) {
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
        View view = this.q;
        switch (i12) {
            case 0:
                f6 f6Var = (f6) view;
                if (f6Var.a == null || f6Var.v0 || i10 != 16) {
                    return false;
                }
                if (i7 != 0) {
                    if (i7 != 1) {
                        if (i7 != 2 || f6Var.b()) {
                            return false;
                        }
                        f6Var.d(180.0f);
                        ((p9) f6Var.a).b();
                    } else if (f6Var.b()) {
                        ((p9) f6Var.a).a();
                    } else if (f6Var.s0) {
                        f6Var.s0 = false;
                        f6Var.A0 = false;
                        f6Var.w0 = SystemClock.elapsedRealtime();
                        f6Var.v0 = true;
                        ((p9) f6Var.a).e(false);
                        f6Var.invalidate();
                    } else if (!f6Var.p0) {
                        ((p9) f6Var.a).d();
                    } else if (sa.c(((p9) f6Var.a).a)) {
                        f6Var.S = 0L;
                        f6Var.R = System.currentTimeMillis();
                        f6Var.B0 = false;
                        ((p9) f6Var.a).f(new e1(this, 9), false);
                    }
                } else {
                    if (f6Var.b()) {
                        return false;
                    }
                    if (f6Var.s0 && f6Var.B0) {
                        f6Var.A0 = false;
                        f6Var.H0.e(true, 1.0f);
                        i3 i3Var = ((p9) f6Var.a).a.U0;
                        i3Var.a.t(hd.M0(2131744661, null), true, true);
                        i3Var.invalidate();
                        f6Var.invalidate();
                    } else {
                        ((p9) f6Var.a).c();
                    }
                }
                return true;
            default:
                org.telegram.ui.ActionBar.j3 j3Var = (org.telegram.ui.ActionBar.j3) view;
                ArrayList arrayList = j3Var.S;
                if (i10 != 16) {
                    return false;
                }
                if (i7 == 1) {
                    org.telegram.ui.ActionBar.c3 c3Var = j3Var.a;
                    if (c3Var != null) {
                        c3Var.f();
                    }
                    j3Var.a(false);
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
                    org.telegram.ui.ActionBar.i3 i3Var2 = (org.telegram.ui.ActionBar.i3) arrayList.get(i11);
                    if (z10) {
                        org.telegram.ui.ActionBar.c3 c3Var2 = j3Var.a;
                        if (c3Var2 != null) {
                            c3Var2.g(i3Var2.c, new li.v(8, this, i3Var2));
                        }
                    } else if (j3Var.a != null) {
                        j3Var.a(false);
                        i3Var2.getClass();
                        j3Var.a.e(i3Var2.c);
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
                f6 f6Var = (f6) view;
                cVar.i("android.widget.Button");
                if (i7 == 0) {
                    int L = org.telegram.messenger.g0.L(22.0f);
                    float f10 = f6Var.l0;
                    float f11 = L;
                    float f12 = f6Var.k0;
                    rect.set((int) (f10 - f11), (int) (f12 - f11), (int) (f10 + f11), (int) (f12 + f11));
                    cVar.h(rect);
                    cVar.j((f6Var.s0 && f6Var.B0) ? hd.M0(2131754846, null) : hd.M0(2131754912, null));
                    z10 = (f6Var.v0 || f6Var.b()) ? false : true;
                    accessibilityNodeInfo.setEnabled(z10);
                    if (z10) {
                        cVar.b(s0.b.c);
                        break;
                    }
                } else if (i7 == 1) {
                    int L2 = org.telegram.messenger.g0.L(40.0f);
                    float f13 = f6Var.j0;
                    float f14 = L2;
                    float f15 = f6Var.k0;
                    rect.set((int) (f13 - f14), (int) (f15 - f14), (int) (f13 + f14), (int) (f15 + f14));
                    cVar.h(rect);
                    cVar.j(f6Var.b() ? hd.M0(2131745640, null) : f6Var.s0 ? hd.M0(2131754754, null) : f6Var.p0 ? hd.M0(2131754758, null) : hd.M0(2131754747, null));
                    accessibilityNodeInfo.setEnabled(!f6Var.v0);
                    if (!f6Var.v0) {
                        cVar.b(s0.b.c);
                        break;
                    }
                } else if (i7 == 2) {
                    int L3 = org.telegram.messenger.g0.L(22.0f);
                    float f16 = f6Var.m0;
                    float f17 = L3;
                    float f18 = f6Var.k0;
                    rect.set((int) (f16 - f17), (int) (f18 - f17), (int) (f16 + f17), (int) (f18 + f17));
                    cVar.h(rect);
                    cVar.j(hd.M0(2131754752, null));
                    z10 = (f6Var.v0 || f6Var.b()) ? false : true;
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
                org.telegram.ui.ActionBar.j3 j3Var = (org.telegram.ui.ActionBar.j3) view;
                ArrayList arrayList = j3Var.S;
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
                        org.telegram.ui.ActionBar.i3 i3Var = (org.telegram.ui.ActionBar.i3) arrayList.get(i10);
                        org.telegram.ui.ActionBar.b3 b3Var = i3Var.c;
                        RectF rectF = i3Var.a;
                        if (b3Var != null && b3Var.b() != null) {
                            str3 = i3Var.c.b();
                        }
                        if (!z11) {
                            rect.set((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
                            cVar.h(rect);
                            if (TextUtils.isEmpty(str3)) {
                                str = hd.M0(2131747817, null);
                            } else {
                                str = hd.M0(2131747817, null) + ", " + str3;
                            }
                            cVar.j(str);
                            break;
                        } else {
                            Rect bounds = i3Var.d.l.getBounds();
                            rect.set((int) (rectF.left + bounds.left), (int) (rectF.top + org.telegram.messenger.g0.L(24.0f) + bounds.top), (int) (rectF.left + bounds.right), (int) (rectF.top + org.telegram.messenger.g0.L(24.0f) + bounds.bottom));
                            cVar.h(rect);
                            if (TextUtils.isEmpty(str3)) {
                                str2 = hd.M0(2131752041, null);
                            } else {
                                str2 = hd.M0(2131752041, null) + ", " + str3;
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
                    org.telegram.ui.Cells.y yVar = j3Var.j0;
                    if (yVar != null) {
                        rect.set(yVar.getBounds());
                    } else {
                        rect.set(0, 0, 1, 1);
                        cVar.p(false);
                    }
                    cVar.h(rect);
                    cVar.j(hd.M0(2131753099, null));
                    break;
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e6(f6 f6Var, f6 f6Var2) {
        super(f6Var2);
        this.q = f6Var;
        this.p = new Rect();
    }
}
