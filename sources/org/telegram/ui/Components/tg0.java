package org.telegram.ui.Components;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class tg0 extends mp {
    public final ArrayList c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public final Context e;
    public final Paint f;
    public g9 g;
    public final /* synthetic */ ug0 h;

    public tg0(ug0 ug0Var, Context context, org.telegram.ui.jx0 jx0Var) {
        this.h = ug0Var;
        this.e = context;
        this.g = jx0Var;
        Paint paint = new Paint(1);
        this.f = paint;
        paint.setColor(-16777216);
    }

    @Override // z4.a
    public final void a(z4.g gVar, Object obj) {
        rg0 rg0Var = (rg0) obj;
        View view = rg0Var.b;
        if (view != null) {
            gVar.removeView(view);
        }
        if (rg0Var.a) {
            return;
        }
        pg0 pg0Var = rg0Var.c;
        if (pg0Var.getImageReceiver().m0 != null) {
            Drawable t10 = pg0Var.getImageReceiver().t();
            if (t10 instanceof s5) {
                ((s5) t10).w(pg0Var);
            }
        }
        pg0Var.setRoundRadius(0);
        gVar.removeView(pg0Var);
        pg0Var.getImageReceiver().c();
    }

    @Override // z4.a
    public final int b() {
        return this.c.size();
    }

    @Override // z4.a
    public final int c(Object obj) {
        int indexOf = this.c.indexOf((rg0) obj);
        if (indexOf == -1) {
            return -2;
        }
        return indexOf;
    }

    @Override // z4.a
    public final CharSequence d(int i10) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(k(i10) + 1);
        sb2.append("/");
        org.telegram.messenger.dp dpVar = this.h.S0;
        sb2.append(dpVar == null ? 0 : dpVar.b.size());
        return sb2.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01a0  */
    @Override // z4.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(z4.g gVar, int i10) {
        int i11;
        SparseArray sparseArray;
        boolean z10;
        boolean z11;
        String str;
        Bitmap n10;
        rg0 rg0Var = (rg0) this.c.get(i10);
        int k10 = k(i10);
        ug0 ug0Var = this.h;
        boolean z12 = ug0Var.i1;
        SparseArray sparseArray2 = ug0Var.d1;
        ArrayList arrayList = ug0Var.b1;
        ArrayList arrayList2 = ug0Var.a1;
        ArrayList arrayList3 = ug0Var.X0;
        ArrayList arrayList4 = ug0Var.Y0;
        ArrayList arrayList5 = ug0Var.Z0;
        ArrayList arrayList6 = ug0Var.W0;
        Context context = this.e;
        if (z12 && k10 == 0) {
            rg0Var.a = true;
            if (rg0Var.b == null) {
                rg0Var.b = new sg0(context);
            }
            if (rg0Var.b.getParent() == null) {
                gVar.addView(rg0Var.b);
            }
            return rg0Var;
        }
        rg0Var.a = false;
        sg0 sg0Var = rg0Var.b;
        if (sg0Var != null && sg0Var.getParent() != null) {
            gVar.removeView(rg0Var.b);
        }
        if (rg0Var.c == null) {
            pg0 pg0Var = new pg0(ug0Var, context, i10, this.f);
            rg0Var.c = pg0Var;
            this.d.set(i10, pg0Var);
        }
        if (rg0Var.c.getParent() == null) {
            gVar.addView(rg0Var.c);
        }
        rg0Var.c.getImageReceiver().w0 = true;
        int i12 = ug0Var.i1 ? k10 - 1 : k10;
        if (i12 != 0) {
            i11 = k10;
            sparseArray = sparseArray2;
            if (i12 >= 0 && i12 < arrayList6.size()) {
                org.telegram.messenger.ic icVar = (org.telegram.messenger.ic) arrayList6.get(i12);
                rg0Var.c.L = icVar != null;
                z10 = arrayList5.get(i12) == null;
                org.telegram.messenger.ic icVar2 = (org.telegram.messenger.ic) arrayList4.get(i12);
                rg0Var.c.q((g61) arrayList5.get(i12), icVar, null, (org.telegram.messenger.ic) arrayList3.get(i12), (org.telegram.messenger.ic) arrayList4.get(i12), (icVar2 == null || !(icVar2.k instanceof TLRPC.TL_photoStrippedSize)) ? null : "b", ((Integer) arrayList2.get(i12)).intValue(), "avatar_" + ug0Var.E0);
                if ((i12 >= 0 || i12 >= arrayList.size() || arrayList.get(i12) == null) ? z10 : true) {
                }
                rg0Var.c.getImageReceiver().g1 = new l2.f(this, 18);
                rg0Var.c.getImageReceiver().k1 = (byte) 2;
                pg0 pg0Var2 = rg0Var.c;
                int i13 = ug0Var.m1;
                int i14 = ug0Var.n1;
                pg0Var2.t(i13, i13, i14, i14);
                rg0Var.c.setTag(Integer.valueOf(i11));
                return rg0Var;
            }
            z10 = false;
            if ((i12 >= 0 || i12 >= arrayList.size() || arrayList.get(i12) == null) ? z10 : true) {
            }
            rg0Var.c.getImageReceiver().g1 = new l2.f(this, 18);
            rg0Var.c.getImageReceiver().k1 = (byte) 2;
            pg0 pg0Var22 = rg0Var.c;
            int i132 = ug0Var.m1;
            int i142 = ug0Var.n1;
            pg0Var22.t(i132, i132, i142, i142);
            rg0Var.c.setTag(Integer.valueOf(i11));
            return rg0Var;
        }
        g9 g9Var = this.g;
        Drawable t10 = g9Var == null ? null : g9Var.getImageReceiver().t();
        if (t10 instanceof s5) {
            s5 s5Var = (s5) t10;
            if (s5Var.s()) {
                rg0Var.c.setImageDrawable(t10);
                s5Var.f(rg0Var.c);
                s5Var.R = true;
                i11 = k10;
                sparseArray = sparseArray2;
                z10 = false;
                if ((i12 >= 0 || i12 >= arrayList.size() || arrayList.get(i12) == null) ? z10 : true) {
                    SparseArray sparseArray3 = sparseArray;
                    rg0Var.c.H = (RadialProgress2) sparseArray3.get(i12);
                    pg0 pg0Var3 = rg0Var.c;
                    if (pg0Var3.H == null) {
                        pg0Var3.H = new RadialProgress2(pg0Var3, null);
                        RadialProgress2 radialProgress2 = rg0Var.c.H;
                        radialProgress2.E = 0.0f;
                        radialProgress2.setIcon(10, false, false);
                        rg0Var.c.H.setColors(1107296256, 1107296256, -1, -1);
                        sparseArray3.append(i12, rg0Var.c.H);
                    }
                    if (ug0Var.g1) {
                        ug0Var.invalidate();
                    } else {
                        ug0Var.postInvalidateOnAnimation();
                    }
                }
                rg0Var.c.getImageReceiver().g1 = new l2.f(this, 18);
                rg0Var.c.getImageReceiver().k1 = (byte) 2;
                pg0 pg0Var222 = rg0Var.c;
                int i1322 = ug0Var.m1;
                int i1422 = ug0Var.n1;
                pg0Var222.t(i1322, i1322, i1422, i1422);
                rg0Var.c.setTag(Integer.valueOf(i11));
                return rg0Var;
            }
        }
        if (i12 >= 0 && i12 < arrayList6.size()) {
            org.telegram.messenger.ic icVar3 = (org.telegram.messenger.ic) arrayList6.get(i12);
            rg0Var.c.L = icVar3 != null;
            boolean z13 = arrayList5.get(i12) == null;
            if (!ug0Var.J0 || icVar3 == null) {
                z11 = z13;
            } else {
                z11 = z13;
                if (icVar3.p == 2) {
                    str = "avatar";
                    org.telegram.messenger.ic icVar4 = (org.telegram.messenger.ic) arrayList4.get(i12);
                    g9 g9Var2 = this.g;
                    i11 = k10;
                    n10 = (g9Var2 == null && ug0Var.e1) ? g9Var2.getImageReceiver().n() : null;
                    StringBuilder sb2 = new StringBuilder("avatar_");
                    sparseArray = sparseArray2;
                    sb2.append(ug0Var.E0);
                    String sb3 = sb2.toString();
                    if (n10 == null && arrayList5.get(i12) == null) {
                        pg0 pg0Var4 = rg0Var.c;
                        org.telegram.messenger.ic icVar5 = (org.telegram.messenger.ic) arrayList6.get(i12);
                        org.telegram.messenger.ic icVar6 = (org.telegram.messenger.ic) arrayList3.get(i12);
                        int intValue = ((Integer) arrayList2.get(i12)).intValue();
                        pg0Var4.getClass();
                        pg0Var4.a.u0(icVar5, str, icVar6, null, null, null, new BitmapDrawable((Resources) null, n10), intValue, null, sb3, 1);
                        pg0Var4.d();
                    } else if (ug0Var.K0 == null) {
                        rg0Var.c.q((g61) arrayList5.get(i12), (org.telegram.messenger.ic) arrayList6.get(i12), str, (org.telegram.messenger.ic) arrayList3.get(i12), ug0Var.K0, null, ((Integer) arrayList2.get(i12)).intValue(), sb3);
                    } else {
                        rg0Var.c.q((g61) arrayList5.get(i12), icVar3, null, (org.telegram.messenger.ic) arrayList3.get(i12), (org.telegram.messenger.ic) arrayList4.get(i12), (icVar4 == null || !(icVar4.k instanceof TLRPC.TL_photoStrippedSize)) ? null : "b", ((Integer) arrayList2.get(i12)).intValue(), sb3);
                    }
                    z10 = z11;
                    if ((i12 >= 0 || i12 >= arrayList.size() || arrayList.get(i12) == null) ? z10 : true) {
                    }
                    rg0Var.c.getImageReceiver().g1 = new l2.f(this, 18);
                    rg0Var.c.getImageReceiver().k1 = (byte) 2;
                    pg0 pg0Var2222 = rg0Var.c;
                    int i13222 = ug0Var.m1;
                    int i14222 = ug0Var.n1;
                    pg0Var2222.t(i13222, i13222, i14222, i14222);
                    rg0Var.c.setTag(Integer.valueOf(i11));
                    return rg0Var;
                }
            }
            str = null;
            org.telegram.messenger.ic icVar42 = (org.telegram.messenger.ic) arrayList4.get(i12);
            g9 g9Var22 = this.g;
            i11 = k10;
            if (g9Var22 == null) {
            }
            StringBuilder sb22 = new StringBuilder("avatar_");
            sparseArray = sparseArray2;
            sb22.append(ug0Var.E0);
            String sb32 = sb22.toString();
            if (n10 == null) {
            }
            if (ug0Var.K0 == null) {
            }
            z10 = z11;
            if ((i12 >= 0 || i12 >= arrayList.size() || arrayList.get(i12) == null) ? z10 : true) {
            }
            rg0Var.c.getImageReceiver().g1 = new l2.f(this, 18);
            rg0Var.c.getImageReceiver().k1 = (byte) 2;
            pg0 pg0Var22222 = rg0Var.c;
            int i132222 = ug0Var.m1;
            int i142222 = ug0Var.n1;
            pg0Var22222.t(i132222, i132222, i142222, i142222);
            rg0Var.c.setTag(Integer.valueOf(i11));
            return rg0Var;
        }
        i11 = k10;
        sparseArray = sparseArray2;
        z10 = false;
        if ((i12 >= 0 || i12 >= arrayList.size() || arrayList.get(i12) == null) ? z10 : true) {
        }
        rg0Var.c.getImageReceiver().g1 = new l2.f(this, 18);
        rg0Var.c.getImageReceiver().k1 = (byte) 2;
        pg0 pg0Var222222 = rg0Var.c;
        int i1322222 = ug0Var.m1;
        int i1422222 = ug0Var.n1;
        pg0Var222222.t(i1322222, i1322222, i1422222, i1422222);
        rg0Var.c.setTag(Integer.valueOf(i11));
        return rg0Var;
    }

    @Override // z4.a
    public final boolean f(View view, Object obj) {
        rg0 rg0Var = (rg0) obj;
        return rg0Var.a ? view == rg0Var.b : view == rg0Var.c;
    }

    @Override // z4.a
    public final void g() {
        ArrayList arrayList;
        int i10 = 0;
        while (true) {
            arrayList = this.d;
            if (i10 >= arrayList.size()) {
                break;
            }
            if (arrayList.get(i10) != null) {
                ((g9) arrayList.get(i10)).getImageReceiver().c();
            }
            i10++;
        }
        ArrayList arrayList2 = this.c;
        arrayList2.clear();
        arrayList.clear();
        ug0 ug0Var = this.h;
        int size = ug0Var.X0.size();
        if (ug0Var.i1) {
            size++;
        }
        org.telegram.messenger.dp dpVar = ug0Var.S0;
        int j10 = (j() * 2) + Math.max(dpVar == null ? 0 : dpVar.b.size(), size);
        for (int i11 = 0; i11 < j10; i11++) {
            arrayList2.add(new rg0());
            arrayList.add(null);
        }
        super.g();
    }

    @Override // org.telegram.ui.Components.mp
    public final int j() {
        ug0 ug0Var = this.h;
        int size = ug0Var.X0.size();
        if (ug0Var.i1) {
            size++;
        }
        if (size >= 2) {
            return ug0Var.getOffscreenPageLimit();
        }
        return 0;
    }
}
