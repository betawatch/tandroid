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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class uf0 extends ep {
    public final ArrayList c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public final Context e;
    public final Paint f;
    public k9 g;
    public final /* synthetic */ vf0 h;

    public uf0(vf0 vf0Var, Context context, org.telegram.ui.nv0 nv0Var) {
        this.h = vf0Var;
        this.e = context;
        this.g = nv0Var;
        Paint paint = new Paint(1);
        this.f = paint;
        paint.setColor(-16777216);
    }

    @Override // b5.a
    public final void a(b5.l lVar, Object obj) {
        sf0 sf0Var = (sf0) obj;
        View view = sf0Var.b;
        if (view != null) {
            lVar.removeView(view);
        }
        if (sf0Var.a) {
            return;
        }
        qf0 qf0Var = sf0Var.c;
        if (qf0Var.getImageReceiver().n0 != null) {
            Drawable t10 = qf0Var.getImageReceiver().t();
            if (t10 instanceof t5) {
                ((t5) t10).w(qf0Var);
            }
        }
        qf0Var.setRoundRadius(0);
        lVar.removeView(qf0Var);
        qf0Var.getImageReceiver().c();
    }

    @Override // b5.a
    public final int b() {
        return this.c.size();
    }

    @Override // b5.a
    public final int c(Object obj) {
        int indexOf = this.c.indexOf((sf0) obj);
        if (indexOf == -1) {
            return -2;
        }
        return indexOf;
    }

    @Override // b5.a
    public final CharSequence d(int i3) {
        return (k(i3) + 1) + "/" + this.h.getRealCount();
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01a0  */
    @Override // b5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(b5.l lVar, int i3) {
        int i10;
        SparseArray sparseArray;
        boolean z10;
        boolean z11;
        String str;
        Bitmap n4;
        sf0 sf0Var = (sf0) this.c.get(i3);
        int k10 = k(i3);
        vf0 vf0Var = this.h;
        boolean z12 = vf0Var.j1;
        SparseArray sparseArray2 = vf0Var.e1;
        ArrayList arrayList = vf0Var.c1;
        ArrayList arrayList2 = vf0Var.b1;
        ArrayList arrayList3 = vf0Var.Y0;
        ArrayList arrayList4 = vf0Var.Z0;
        ArrayList arrayList5 = vf0Var.a1;
        ArrayList arrayList6 = vf0Var.X0;
        Context context = this.e;
        if (z12 && k10 == 0) {
            sf0Var.a = true;
            if (sf0Var.b == null) {
                sf0Var.b = new tf0(context);
            }
            if (sf0Var.b.getParent() == null) {
                lVar.addView(sf0Var.b);
            }
            return sf0Var;
        }
        sf0Var.a = false;
        tf0 tf0Var = sf0Var.b;
        if (tf0Var != null && tf0Var.getParent() != null) {
            lVar.removeView(sf0Var.b);
        }
        if (sf0Var.c == null) {
            qf0 qf0Var = new qf0(vf0Var, context, i3, this.f);
            sf0Var.c = qf0Var;
            this.d.set(i3, qf0Var);
        }
        if (sf0Var.c.getParent() == null) {
            lVar.addView(sf0Var.c);
        }
        sf0Var.c.getImageReceiver().x0 = true;
        int i11 = vf0Var.j1 ? k10 - 1 : k10;
        if (i11 != 0) {
            i10 = k10;
            sparseArray = sparseArray2;
            if (i11 >= 0 && i11 < arrayList6.size()) {
                org.telegram.messenger.ac acVar = (org.telegram.messenger.ac) arrayList6.get(i11);
                sf0Var.c.M = acVar != null;
                z10 = arrayList5.get(i11) == null;
                org.telegram.messenger.ac acVar2 = (org.telegram.messenger.ac) arrayList4.get(i11);
                sf0Var.c.q((x41) arrayList5.get(i11), acVar, null, (org.telegram.messenger.ac) arrayList3.get(i11), (org.telegram.messenger.ac) arrayList4.get(i11), (acVar2 == null || !(acVar2.k instanceof TLRPC.TL_photoStrippedSize)) ? null : "b", ((Integer) arrayList2.get(i11)).intValue(), "avatar_" + vf0Var.F0);
                if ((i11 >= 0 || i11 >= arrayList.size() || arrayList.get(i11) == null) ? z10 : true) {
                }
                sf0Var.c.getImageReceiver().h1 = new y00(this);
                sf0Var.c.getImageReceiver().l1 = (byte) 2;
                qf0 qf0Var2 = sf0Var.c;
                int i12 = vf0Var.n1;
                int i13 = vf0Var.o1;
                qf0Var2.t(i12, i12, i13, i13);
                sf0Var.c.setTag(Integer.valueOf(i10));
                return sf0Var;
            }
            z10 = false;
            if ((i11 >= 0 || i11 >= arrayList.size() || arrayList.get(i11) == null) ? z10 : true) {
            }
            sf0Var.c.getImageReceiver().h1 = new y00(this);
            sf0Var.c.getImageReceiver().l1 = (byte) 2;
            qf0 qf0Var22 = sf0Var.c;
            int i122 = vf0Var.n1;
            int i132 = vf0Var.o1;
            qf0Var22.t(i122, i122, i132, i132);
            sf0Var.c.setTag(Integer.valueOf(i10));
            return sf0Var;
        }
        k9 k9Var = this.g;
        Drawable t10 = k9Var == null ? null : k9Var.getImageReceiver().t();
        if (t10 instanceof t5) {
            t5 t5Var = (t5) t10;
            if (t5Var.s()) {
                sf0Var.c.setImageDrawable(t10);
                t5Var.f(sf0Var.c);
                t5Var.S = true;
                i10 = k10;
                sparseArray = sparseArray2;
                z10 = false;
                if ((i11 >= 0 || i11 >= arrayList.size() || arrayList.get(i11) == null) ? z10 : true) {
                    SparseArray sparseArray3 = sparseArray;
                    sf0Var.c.I = (RadialProgress2) sparseArray3.get(i11);
                    qf0 qf0Var3 = sf0Var.c;
                    if (qf0Var3.I == null) {
                        qf0Var3.I = new RadialProgress2(qf0Var3, null);
                        RadialProgress2 radialProgress2 = sf0Var.c.I;
                        radialProgress2.E = 0.0f;
                        radialProgress2.setIcon(10, false, false);
                        sf0Var.c.I.setColors(1107296256, 1107296256, -1, -1);
                        sparseArray3.append(i11, sf0Var.c.I);
                    }
                    if (vf0Var.h1) {
                        vf0Var.invalidate();
                    } else {
                        vf0Var.postInvalidateOnAnimation();
                    }
                }
                sf0Var.c.getImageReceiver().h1 = new y00(this);
                sf0Var.c.getImageReceiver().l1 = (byte) 2;
                qf0 qf0Var222 = sf0Var.c;
                int i1222 = vf0Var.n1;
                int i1322 = vf0Var.o1;
                qf0Var222.t(i1222, i1222, i1322, i1322);
                sf0Var.c.setTag(Integer.valueOf(i10));
                return sf0Var;
            }
        }
        if (i11 >= 0 && i11 < arrayList6.size()) {
            org.telegram.messenger.ac acVar3 = (org.telegram.messenger.ac) arrayList6.get(i11);
            sf0Var.c.M = acVar3 != null;
            boolean z13 = arrayList5.get(i11) == null;
            if (!vf0Var.K0 || acVar3 == null) {
                z11 = z13;
            } else {
                z11 = z13;
                if (acVar3.p == 2) {
                    str = "avatar";
                    org.telegram.messenger.ac acVar4 = (org.telegram.messenger.ac) arrayList4.get(i11);
                    k9 k9Var2 = this.g;
                    i10 = k10;
                    n4 = (k9Var2 == null && vf0Var.f1) ? k9Var2.getImageReceiver().n() : null;
                    StringBuilder sb2 = new StringBuilder("avatar_");
                    sparseArray = sparseArray2;
                    sb2.append(vf0Var.F0);
                    String sb3 = sb2.toString();
                    if (n4 == null && arrayList5.get(i11) == null) {
                        qf0 qf0Var4 = sf0Var.c;
                        org.telegram.messenger.ac acVar5 = (org.telegram.messenger.ac) arrayList6.get(i11);
                        org.telegram.messenger.ac acVar6 = (org.telegram.messenger.ac) arrayList3.get(i11);
                        int intValue = ((Integer) arrayList2.get(i11)).intValue();
                        qf0Var4.getClass();
                        qf0Var4.a.u0(acVar5, str, acVar6, null, null, null, new BitmapDrawable((Resources) null, n4), intValue, null, sb3, 1);
                        qf0Var4.d();
                    } else if (vf0Var.L0 == null) {
                        sf0Var.c.q((x41) arrayList5.get(i11), (org.telegram.messenger.ac) arrayList6.get(i11), str, (org.telegram.messenger.ac) arrayList3.get(i11), vf0Var.L0, null, ((Integer) arrayList2.get(i11)).intValue(), sb3);
                    } else {
                        sf0Var.c.q((x41) arrayList5.get(i11), acVar3, null, (org.telegram.messenger.ac) arrayList3.get(i11), (org.telegram.messenger.ac) arrayList4.get(i11), (acVar4 == null || !(acVar4.k instanceof TLRPC.TL_photoStrippedSize)) ? null : "b", ((Integer) arrayList2.get(i11)).intValue(), sb3);
                    }
                    z10 = z11;
                    if ((i11 >= 0 || i11 >= arrayList.size() || arrayList.get(i11) == null) ? z10 : true) {
                    }
                    sf0Var.c.getImageReceiver().h1 = new y00(this);
                    sf0Var.c.getImageReceiver().l1 = (byte) 2;
                    qf0 qf0Var2222 = sf0Var.c;
                    int i12222 = vf0Var.n1;
                    int i13222 = vf0Var.o1;
                    qf0Var2222.t(i12222, i12222, i13222, i13222);
                    sf0Var.c.setTag(Integer.valueOf(i10));
                    return sf0Var;
                }
            }
            str = null;
            org.telegram.messenger.ac acVar42 = (org.telegram.messenger.ac) arrayList4.get(i11);
            k9 k9Var22 = this.g;
            i10 = k10;
            if (k9Var22 == null) {
            }
            StringBuilder sb22 = new StringBuilder("avatar_");
            sparseArray = sparseArray2;
            sb22.append(vf0Var.F0);
            String sb32 = sb22.toString();
            if (n4 == null) {
            }
            if (vf0Var.L0 == null) {
            }
            z10 = z11;
            if ((i11 >= 0 || i11 >= arrayList.size() || arrayList.get(i11) == null) ? z10 : true) {
            }
            sf0Var.c.getImageReceiver().h1 = new y00(this);
            sf0Var.c.getImageReceiver().l1 = (byte) 2;
            qf0 qf0Var22222 = sf0Var.c;
            int i122222 = vf0Var.n1;
            int i132222 = vf0Var.o1;
            qf0Var22222.t(i122222, i122222, i132222, i132222);
            sf0Var.c.setTag(Integer.valueOf(i10));
            return sf0Var;
        }
        i10 = k10;
        sparseArray = sparseArray2;
        z10 = false;
        if ((i11 >= 0 || i11 >= arrayList.size() || arrayList.get(i11) == null) ? z10 : true) {
        }
        sf0Var.c.getImageReceiver().h1 = new y00(this);
        sf0Var.c.getImageReceiver().l1 = (byte) 2;
        qf0 qf0Var222222 = sf0Var.c;
        int i1222222 = vf0Var.n1;
        int i1322222 = vf0Var.o1;
        qf0Var222222.t(i1222222, i1222222, i1322222, i1322222);
        sf0Var.c.setTag(Integer.valueOf(i10));
        return sf0Var;
    }

    @Override // b5.a
    public final boolean f(View view, Object obj) {
        sf0 sf0Var = (sf0) obj;
        return sf0Var.a ? view == sf0Var.b : view == sf0Var.c;
    }

    @Override // b5.a
    public final void g() {
        ArrayList arrayList;
        int i3 = 0;
        while (true) {
            arrayList = this.d;
            if (i3 >= arrayList.size()) {
                break;
            }
            if (arrayList.get(i3) != null) {
                ((k9) arrayList.get(i3)).getImageReceiver().c();
            }
            i3++;
        }
        ArrayList arrayList2 = this.c;
        arrayList2.clear();
        arrayList.clear();
        vf0 vf0Var = this.h;
        int size = vf0Var.Y0.size();
        if (vf0Var.j1) {
            size++;
        }
        org.telegram.messenger.po poVar = vf0Var.T0;
        int j10 = (j() * 2) + Math.max(poVar == null ? 0 : poVar.b.size(), size);
        for (int i10 = 0; i10 < j10; i10++) {
            arrayList2.add(new sf0());
            arrayList.add(null);
        }
        super.g();
    }

    @Override // org.telegram.ui.Components.ep
    public final int j() {
        vf0 vf0Var = this.h;
        int size = vf0Var.Y0.size();
        if (vf0Var.j1) {
            size++;
        }
        if (size >= 2) {
            return vf0Var.getOffscreenPageLimit();
        }
        return 0;
    }
}
