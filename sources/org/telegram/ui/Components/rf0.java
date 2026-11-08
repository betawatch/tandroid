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

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class rf0 extends ep {
    public final ArrayList c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public final Context e;
    public final Paint f;
    public l9 g;
    public final /* synthetic */ sf0 h;

    public rf0(sf0 sf0Var, Context context, org.telegram.ui.wv0 wv0Var) {
        this.h = sf0Var;
        this.e = context;
        this.g = wv0Var;
        Paint paint = new Paint(1);
        this.f = paint;
        paint.setColor(-16777216);
    }

    @Override // c5.a
    public final void a(c5.k kVar, Object obj) {
        pf0 pf0Var = (pf0) obj;
        View view = pf0Var.b;
        if (view != null) {
            kVar.removeView(view);
        }
        if (pf0Var.a) {
            return;
        }
        nf0 nf0Var = pf0Var.c;
        if (nf0Var.getImageReceiver().m0 != null) {
            Drawable t6 = nf0Var.getImageReceiver().t();
            if (t6 instanceof v5) {
                ((v5) t6).w(nf0Var);
            }
        }
        nf0Var.setRoundRadius(0);
        kVar.removeView(nf0Var);
        nf0Var.getImageReceiver().c();
    }

    @Override // c5.a
    public final int b() {
        return this.c.size();
    }

    @Override // c5.a
    public final int c(Object obj) {
        int indexOf = this.c.indexOf((pf0) obj);
        if (indexOf == -1) {
            return -2;
        }
        return indexOf;
    }

    @Override // c5.a
    public final CharSequence d(int i7) {
        return (k(i7) + 1) + "/" + this.h.getRealCount();
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01a0  */
    @Override // c5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(c5.k kVar, int i7) {
        int i10;
        SparseArray sparseArray;
        boolean z9;
        boolean z10;
        String str;
        Bitmap n10;
        pf0 pf0Var = (pf0) this.c.get(i7);
        int k10 = k(i7);
        sf0 sf0Var = this.h;
        boolean z11 = sf0Var.i1;
        SparseArray sparseArray2 = sf0Var.d1;
        ArrayList arrayList = sf0Var.b1;
        ArrayList arrayList2 = sf0Var.a1;
        ArrayList arrayList3 = sf0Var.X0;
        ArrayList arrayList4 = sf0Var.Y0;
        ArrayList arrayList5 = sf0Var.Z0;
        ArrayList arrayList6 = sf0Var.W0;
        Context context = this.e;
        if (z11 && k10 == 0) {
            pf0Var.a = true;
            if (pf0Var.b == null) {
                pf0Var.b = new qf0(context);
            }
            if (pf0Var.b.getParent() == null) {
                kVar.addView(pf0Var.b);
            }
            return pf0Var;
        }
        pf0Var.a = false;
        qf0 qf0Var = pf0Var.b;
        if (qf0Var != null && qf0Var.getParent() != null) {
            kVar.removeView(pf0Var.b);
        }
        if (pf0Var.c == null) {
            nf0 nf0Var = new nf0(sf0Var, context, i7, this.f);
            pf0Var.c = nf0Var;
            this.d.set(i7, nf0Var);
        }
        if (pf0Var.c.getParent() == null) {
            kVar.addView(pf0Var.c);
        }
        pf0Var.c.getImageReceiver().w0 = true;
        int i11 = sf0Var.i1 ? k10 - 1 : k10;
        if (i11 != 0) {
            i10 = k10;
            sparseArray = sparseArray2;
            if (i11 >= 0 && i11 < arrayList6.size()) {
                org.telegram.messenger.hc hcVar = (org.telegram.messenger.hc) arrayList6.get(i11);
                pf0Var.c.L = hcVar != null;
                z9 = arrayList5.get(i11) == null;
                org.telegram.messenger.hc hcVar2 = (org.telegram.messenger.hc) arrayList4.get(i11);
                pf0Var.c.q((d51) arrayList5.get(i11), hcVar, null, (org.telegram.messenger.hc) arrayList3.get(i11), (org.telegram.messenger.hc) arrayList4.get(i11), (hcVar2 == null || !(hcVar2.k instanceof TLRPC.TL_photoStrippedSize)) ? null : "b", ((Integer) arrayList2.get(i11)).intValue(), "avatar_" + sf0Var.E0);
                if ((i11 >= 0 || i11 >= arrayList.size() || arrayList.get(i11) == null) ? z9 : true) {
                }
                pf0Var.c.getImageReceiver().g1 = new n(this);
                pf0Var.c.getImageReceiver().k1 = (byte) 2;
                nf0 nf0Var2 = pf0Var.c;
                int i12 = sf0Var.m1;
                int i13 = sf0Var.n1;
                nf0Var2.t(i12, i12, i13, i13);
                pf0Var.c.setTag(Integer.valueOf(i10));
                return pf0Var;
            }
            z9 = false;
            if ((i11 >= 0 || i11 >= arrayList.size() || arrayList.get(i11) == null) ? z9 : true) {
            }
            pf0Var.c.getImageReceiver().g1 = new n(this);
            pf0Var.c.getImageReceiver().k1 = (byte) 2;
            nf0 nf0Var22 = pf0Var.c;
            int i122 = sf0Var.m1;
            int i132 = sf0Var.n1;
            nf0Var22.t(i122, i122, i132, i132);
            pf0Var.c.setTag(Integer.valueOf(i10));
            return pf0Var;
        }
        l9 l9Var = this.g;
        Drawable t6 = l9Var == null ? null : l9Var.getImageReceiver().t();
        if (t6 instanceof v5) {
            v5 v5Var = (v5) t6;
            if (v5Var.s()) {
                pf0Var.c.setImageDrawable(t6);
                v5Var.f(pf0Var.c);
                v5Var.R = true;
                i10 = k10;
                sparseArray = sparseArray2;
                z9 = false;
                if ((i11 >= 0 || i11 >= arrayList.size() || arrayList.get(i11) == null) ? z9 : true) {
                    SparseArray sparseArray3 = sparseArray;
                    pf0Var.c.H = (RadialProgress2) sparseArray3.get(i11);
                    nf0 nf0Var3 = pf0Var.c;
                    if (nf0Var3.H == null) {
                        nf0Var3.H = new RadialProgress2(nf0Var3, null);
                        RadialProgress2 radialProgress2 = pf0Var.c.H;
                        radialProgress2.E = 0.0f;
                        radialProgress2.setIcon(10, false, false);
                        pf0Var.c.H.setColors(1107296256, 1107296256, -1, -1);
                        sparseArray3.append(i11, pf0Var.c.H);
                    }
                    if (sf0Var.g1) {
                        sf0Var.invalidate();
                    } else {
                        sf0Var.postInvalidateOnAnimation();
                    }
                }
                pf0Var.c.getImageReceiver().g1 = new n(this);
                pf0Var.c.getImageReceiver().k1 = (byte) 2;
                nf0 nf0Var222 = pf0Var.c;
                int i1222 = sf0Var.m1;
                int i1322 = sf0Var.n1;
                nf0Var222.t(i1222, i1222, i1322, i1322);
                pf0Var.c.setTag(Integer.valueOf(i10));
                return pf0Var;
            }
        }
        if (i11 >= 0 && i11 < arrayList6.size()) {
            org.telegram.messenger.hc hcVar3 = (org.telegram.messenger.hc) arrayList6.get(i11);
            pf0Var.c.L = hcVar3 != null;
            boolean z12 = arrayList5.get(i11) == null;
            if (!sf0Var.J0 || hcVar3 == null) {
                z10 = z12;
            } else {
                z10 = z12;
                if (hcVar3.p == 2) {
                    str = "avatar";
                    org.telegram.messenger.hc hcVar4 = (org.telegram.messenger.hc) arrayList4.get(i11);
                    l9 l9Var2 = this.g;
                    i10 = k10;
                    n10 = (l9Var2 == null && sf0Var.e1) ? l9Var2.getImageReceiver().n() : null;
                    StringBuilder sb2 = new StringBuilder("avatar_");
                    sparseArray = sparseArray2;
                    sb2.append(sf0Var.E0);
                    String sb3 = sb2.toString();
                    if (n10 == null && arrayList5.get(i11) == null) {
                        nf0 nf0Var4 = pf0Var.c;
                        org.telegram.messenger.hc hcVar5 = (org.telegram.messenger.hc) arrayList6.get(i11);
                        org.telegram.messenger.hc hcVar6 = (org.telegram.messenger.hc) arrayList3.get(i11);
                        int intValue = ((Integer) arrayList2.get(i11)).intValue();
                        nf0Var4.getClass();
                        nf0Var4.a.u0(hcVar5, str, hcVar6, null, null, null, new BitmapDrawable((Resources) null, n10), intValue, null, sb3, 1);
                        nf0Var4.d();
                    } else if (sf0Var.K0 == null) {
                        pf0Var.c.q((d51) arrayList5.get(i11), (org.telegram.messenger.hc) arrayList6.get(i11), str, (org.telegram.messenger.hc) arrayList3.get(i11), sf0Var.K0, null, ((Integer) arrayList2.get(i11)).intValue(), sb3);
                    } else {
                        pf0Var.c.q((d51) arrayList5.get(i11), hcVar3, null, (org.telegram.messenger.hc) arrayList3.get(i11), (org.telegram.messenger.hc) arrayList4.get(i11), (hcVar4 == null || !(hcVar4.k instanceof TLRPC.TL_photoStrippedSize)) ? null : "b", ((Integer) arrayList2.get(i11)).intValue(), sb3);
                    }
                    z9 = z10;
                    if ((i11 >= 0 || i11 >= arrayList.size() || arrayList.get(i11) == null) ? z9 : true) {
                    }
                    pf0Var.c.getImageReceiver().g1 = new n(this);
                    pf0Var.c.getImageReceiver().k1 = (byte) 2;
                    nf0 nf0Var2222 = pf0Var.c;
                    int i12222 = sf0Var.m1;
                    int i13222 = sf0Var.n1;
                    nf0Var2222.t(i12222, i12222, i13222, i13222);
                    pf0Var.c.setTag(Integer.valueOf(i10));
                    return pf0Var;
                }
            }
            str = null;
            org.telegram.messenger.hc hcVar42 = (org.telegram.messenger.hc) arrayList4.get(i11);
            l9 l9Var22 = this.g;
            i10 = k10;
            if (l9Var22 == null) {
            }
            StringBuilder sb22 = new StringBuilder("avatar_");
            sparseArray = sparseArray2;
            sb22.append(sf0Var.E0);
            String sb32 = sb22.toString();
            if (n10 == null) {
            }
            if (sf0Var.K0 == null) {
            }
            z9 = z10;
            if ((i11 >= 0 || i11 >= arrayList.size() || arrayList.get(i11) == null) ? z9 : true) {
            }
            pf0Var.c.getImageReceiver().g1 = new n(this);
            pf0Var.c.getImageReceiver().k1 = (byte) 2;
            nf0 nf0Var22222 = pf0Var.c;
            int i122222 = sf0Var.m1;
            int i132222 = sf0Var.n1;
            nf0Var22222.t(i122222, i122222, i132222, i132222);
            pf0Var.c.setTag(Integer.valueOf(i10));
            return pf0Var;
        }
        i10 = k10;
        sparseArray = sparseArray2;
        z9 = false;
        if ((i11 >= 0 || i11 >= arrayList.size() || arrayList.get(i11) == null) ? z9 : true) {
        }
        pf0Var.c.getImageReceiver().g1 = new n(this);
        pf0Var.c.getImageReceiver().k1 = (byte) 2;
        nf0 nf0Var222222 = pf0Var.c;
        int i1222222 = sf0Var.m1;
        int i1322222 = sf0Var.n1;
        nf0Var222222.t(i1222222, i1222222, i1322222, i1322222);
        pf0Var.c.setTag(Integer.valueOf(i10));
        return pf0Var;
    }

    @Override // c5.a
    public final boolean f(View view, Object obj) {
        pf0 pf0Var = (pf0) obj;
        return pf0Var.a ? view == pf0Var.b : view == pf0Var.c;
    }

    @Override // c5.a
    public final void g() {
        ArrayList arrayList;
        int i7 = 0;
        while (true) {
            arrayList = this.d;
            if (i7 >= arrayList.size()) {
                break;
            }
            if (arrayList.get(i7) != null) {
                ((l9) arrayList.get(i7)).getImageReceiver().c();
            }
            i7++;
        }
        ArrayList arrayList2 = this.c;
        arrayList2.clear();
        arrayList.clear();
        sf0 sf0Var = this.h;
        int size = sf0Var.X0.size();
        if (sf0Var.i1) {
            size++;
        }
        org.telegram.messenger.yo yoVar = sf0Var.S0;
        int j3 = (j() * 2) + Math.max(yoVar == null ? 0 : yoVar.b.size(), size);
        for (int i10 = 0; i10 < j3; i10++) {
            arrayList2.add(new pf0());
            arrayList.add(null);
        }
        super.g();
    }

    @Override // org.telegram.ui.Components.ep
    public final int j() {
        sf0 sf0Var = this.h;
        int size = sf0Var.X0.size();
        if (sf0Var.i1) {
            size++;
        }
        if (size >= 2) {
            return sf0Var.getOffscreenPageLimit();
        }
        return 0;
    }
}
