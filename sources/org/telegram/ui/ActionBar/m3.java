package org.telegram.ui.ActionBar;

import android.graphics.Rect;
import android.graphics.RectF;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import org.telegram.messenger.cd;
import org.telegram.tgnet.TLObject;
import vh.o7;
import vh.o8;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class m3 extends j1.b {
    public final /* synthetic */ int o = 0;
    public final Rect p;
    public final /* synthetic */ View q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m3(q3 q3Var, q3 q3Var2) {
        super(q3Var2);
        this.q = q3Var;
        this.p = new Rect();
    }

    @Override // j1.b
    public final int g(float f7, float f10) {
        switch (this.o) {
            case 0:
                q3 q3Var = (q3) this.q;
                ArrayList arrayList = q3Var.R;
                if (q3Var.V >= 0.5f) {
                    org.telegram.ui.Cells.y yVar = q3Var.i0;
                    if (yVar != null && yVar.getBounds().contains((int) f7, (int) f10)) {
                        return 1;
                    }
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        p3 p3Var = (p3) arrayList.get(size);
                        float f11 = p3Var.i;
                        RectF rectF = p3Var.a;
                        if (Math.abs(f11) < 0.4f && rectF.contains(f7, f10)) {
                            Rect bounds = p3Var.d.l.getBounds();
                            return (bounds.isEmpty() || !bounds.contains((int) (f7 - rectF.left), (int) ((f10 - rectF.top) - ((float) org.telegram.messenger.i0.L(24.0f))))) ? size + 1000 : size + 2000;
                        }
                    }
                }
                return -1;
            default:
                vh.r4 r4Var = (vh.r4) this.q;
                if (Math.abs(f7 - r4Var.k0) <= org.telegram.messenger.i0.L(30.0f) && Math.abs(f10 - r4Var.j0) <= org.telegram.messenger.i0.L(30.0f) && !r4Var.b() && !r4Var.u0) {
                    return 0;
                }
                if (Math.abs(f7 - r4Var.l0) <= org.telegram.messenger.i0.L(30.0f) && Math.abs(f10 - r4Var.j0) <= org.telegram.messenger.i0.L(30.0f) && !r4Var.b() && !r4Var.u0) {
                    return 2;
                }
                if (Math.abs(f7 - r4Var.i0) > org.telegram.messenger.i0.L(60.0f) || Math.abs(f10 - r4Var.j0) > org.telegram.messenger.i0.L(60.0f)) {
                    return TLObject.FLAG_31;
                }
                return 1;
        }
    }

    @Override // j1.b
    public final void h(ArrayList arrayList) {
        switch (this.o) {
            case 0:
                q3 q3Var = (q3) this.q;
                ArrayList arrayList2 = q3Var.R;
                if (q3Var.V >= 0.5f) {
                    org.telegram.ui.Cells.y yVar = q3Var.i0;
                    if (yVar != null && !yVar.getBounds().isEmpty()) {
                        arrayList.add(1);
                    }
                    for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                        p3 p3Var = (p3) arrayList2.get(i10);
                        if (Math.abs(p3Var.i) < 0.4f && !p3Var.a.isEmpty()) {
                            arrayList.add(Integer.valueOf(i10 + 1000));
                            f3 f3Var = p3Var.d;
                            if (f3Var != null && !f3Var.l.getBounds().isEmpty()) {
                                arrayList.add(Integer.valueOf(i10 + 2000));
                            }
                        }
                    }
                    break;
                }
                break;
            default:
                vh.r4 r4Var = (vh.r4) this.q;
                if (!r4Var.b() && !r4Var.u0) {
                    arrayList.add(0);
                }
                arrayList.add(1);
                if (!r4Var.b() && !r4Var.u0) {
                    arrayList.add(2);
                    break;
                }
                break;
        }
    }

    @Override // j1.b
    public final boolean k(int i10, int i11) {
        int i12;
        boolean z10;
        int i13 = this.o;
        View view = this.q;
        switch (i13) {
            case 0:
                q3 q3Var = (q3) view;
                ArrayList arrayList = q3Var.R;
                if (i11 != 16) {
                    return false;
                }
                if (i10 == 1) {
                    i3 i3Var = q3Var.a;
                    if (i3Var != null) {
                        i3Var.f();
                    }
                    q3Var.a(false);
                } else {
                    if (i10 >= 2000) {
                        i12 = i10 - 2000;
                        z10 = true;
                    } else {
                        if (i10 < 1000) {
                            return false;
                        }
                        i12 = i10 - 1000;
                        z10 = false;
                    }
                    if (i12 < 0 || i12 >= arrayList.size()) {
                        return false;
                    }
                    p3 p3Var = (p3) arrayList.get(i12);
                    if (z10) {
                        i3 i3Var2 = q3Var.a;
                        if (i3Var2 != null) {
                            i3Var2.g(p3Var.c, new ag.e0(10, this, p3Var));
                        }
                    } else if (q3Var.a != null) {
                        q3Var.a(false);
                        p3Var.getClass();
                        q3Var.a.e(p3Var.c);
                    }
                }
                return true;
            default:
                vh.r4 r4Var = (vh.r4) view;
                if (r4Var.a == null || r4Var.u0 || i11 != 16) {
                    return false;
                }
                if (i10 != 0) {
                    if (i10 != 1) {
                        if (i10 != 2 || r4Var.b()) {
                            return false;
                        }
                        r4Var.d(180.0f);
                        ((o7) r4Var.a).b();
                    } else if (r4Var.b()) {
                        ((o7) r4Var.a).a();
                    } else if (r4Var.r0) {
                        r4Var.r0 = false;
                        r4Var.z0 = false;
                        r4Var.v0 = SystemClock.elapsedRealtime();
                        r4Var.u0 = true;
                        ((o7) r4Var.a).e(false);
                        r4Var.invalidate();
                    } else if (!r4Var.o0) {
                        ((o7) r4Var.a).d();
                    } else if (o8.c(((o7) r4Var.a).a)) {
                        r4Var.R = 0L;
                        r4Var.Q = System.currentTimeMillis();
                        r4Var.A0 = false;
                        ((o7) r4Var.a).f(new vh.d0(this, 11), false);
                    }
                } else {
                    if (r4Var.b()) {
                        return false;
                    }
                    if (r4Var.r0 && r4Var.A0) {
                        r4Var.z0 = false;
                        r4Var.G0.e(true, 1.0f);
                        vh.o2 o2Var = ((o7) r4Var.a).a.T0;
                        o2Var.a.t(cd.L0(2131744680, null), true, true);
                        o2Var.invalidate();
                        r4Var.invalidate();
                    } else {
                        ((o7) r4Var.a).c();
                    }
                }
                return true;
        }
    }

    @Override // j1.b
    public final void l(int i10, s0.c cVar) {
        int i11;
        boolean z10;
        String str;
        String str2;
        boolean z11;
        int i12 = this.o;
        String str3 = "";
        View view = this.q;
        Rect rect = this.p;
        switch (i12) {
            case 0:
                q3 q3Var = (q3) view;
                ArrayList arrayList = q3Var.R;
                cVar.i("android.widget.Button");
                cVar.b(s0.b.c);
                if (i10 != 1) {
                    if (i10 < 2000) {
                        if (i10 < 1000) {
                            rect.set(0, 0, 1, 1);
                            cVar.h(rect);
                            cVar.p(false);
                            break;
                        } else {
                            i11 = i10 - 1000;
                            z10 = false;
                        }
                    } else {
                        i11 = i10 - 2000;
                        z10 = true;
                    }
                    if (i11 >= 0 && i11 < arrayList.size()) {
                        p3 p3Var = (p3) arrayList.get(i11);
                        h3 h3Var = p3Var.c;
                        RectF rectF = p3Var.a;
                        if (h3Var != null && h3Var.b() != null) {
                            str3 = p3Var.c.b();
                        }
                        if (!z10) {
                            rect.set((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
                            cVar.h(rect);
                            if (TextUtils.isEmpty(str3)) {
                                str = cd.L0(2131747833, null);
                            } else {
                                str = cd.L0(2131747833, null) + ", " + str3;
                            }
                            cVar.j(str);
                            break;
                        } else {
                            Rect bounds = p3Var.d.l.getBounds();
                            rect.set((int) (rectF.left + bounds.left), (int) (rectF.top + org.telegram.messenger.i0.L(24.0f) + bounds.top), (int) (rectF.left + bounds.right), (int) (rectF.top + org.telegram.messenger.i0.L(24.0f) + bounds.bottom));
                            cVar.h(rect);
                            if (TextUtils.isEmpty(str3)) {
                                str2 = cd.L0(2131752041, null);
                            } else {
                                str2 = cd.L0(2131752041, null) + ", " + str3;
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
                    org.telegram.ui.Cells.y yVar = q3Var.i0;
                    if (yVar != null) {
                        rect.set(yVar.getBounds());
                    } else {
                        rect.set(0, 0, 1, 1);
                        cVar.p(false);
                    }
                    cVar.h(rect);
                    cVar.j(cd.L0(2131753099, null));
                    break;
                }
                break;
            default:
                AccessibilityNodeInfo accessibilityNodeInfo = cVar.a;
                vh.r4 r4Var = (vh.r4) view;
                cVar.i("android.widget.Button");
                if (i10 == 0) {
                    int L = org.telegram.messenger.i0.L(22.0f);
                    float f7 = r4Var.k0;
                    float f10 = L;
                    float f11 = r4Var.j0;
                    rect.set((int) (f7 - f10), (int) (f11 - f10), (int) (f7 + f10), (int) (f11 + f10));
                    cVar.h(rect);
                    cVar.j((r4Var.r0 && r4Var.A0) ? cd.L0(2131754846, null) : cd.L0(2131754912, null));
                    z11 = (r4Var.u0 || r4Var.b()) ? false : true;
                    accessibilityNodeInfo.setEnabled(z11);
                    if (z11) {
                        cVar.b(s0.b.c);
                        break;
                    }
                } else if (i10 == 1) {
                    int L2 = org.telegram.messenger.i0.L(40.0f);
                    float f12 = r4Var.i0;
                    float f13 = L2;
                    float f14 = r4Var.j0;
                    rect.set((int) (f12 - f13), (int) (f14 - f13), (int) (f12 + f13), (int) (f14 + f13));
                    cVar.h(rect);
                    cVar.j(r4Var.b() ? cd.L0(2131745657, null) : r4Var.r0 ? cd.L0(2131754754, null) : r4Var.o0 ? cd.L0(2131754758, null) : cd.L0(2131754747, null));
                    accessibilityNodeInfo.setEnabled(!r4Var.u0);
                    if (!r4Var.u0) {
                        cVar.b(s0.b.c);
                        break;
                    }
                } else if (i10 == 2) {
                    int L3 = org.telegram.messenger.i0.L(22.0f);
                    float f15 = r4Var.l0;
                    float f16 = L3;
                    float f17 = r4Var.j0;
                    rect.set((int) (f15 - f16), (int) (f17 - f16), (int) (f15 + f16), (int) (f17 + f16));
                    cVar.h(rect);
                    cVar.j(cd.L0(2131754752, null));
                    z11 = (r4Var.u0 || r4Var.b()) ? false : true;
                    accessibilityNodeInfo.setEnabled(z11);
                    if (z11) {
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
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m3(vh.r4 r4Var, vh.r4 r4Var2) {
        super(r4Var2);
        this.q = r4Var;
        this.p = new Rect();
    }
}
