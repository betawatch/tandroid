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

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class gg0 extends wp {
    public final ArrayList c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public final Context e;
    public final Paint f;
    public q9 g;
    public final /* synthetic */ hg0 h;

    public gg0(hg0 hg0Var, Context context, org.telegram.ui.wv0 wv0Var) {
        this.h = hg0Var;
        this.e = context;
        this.g = wv0Var;
        Paint paint = new Paint(1);
        this.f = paint;
        paint.setColor(-16777216);
    }

    @Override // c5.a
    public final void a(c5.l lVar, Object obj) {
        eg0 eg0Var = (eg0) obj;
        View view = eg0Var.b;
        if (view != null) {
            lVar.removeView(view);
        }
        if (eg0Var.a) {
            return;
        }
        cg0 cg0Var = eg0Var.c;
        if (cg0Var.getImageReceiver().n0 != null) {
            Drawable t6 = cg0Var.getImageReceiver().t();
            if (t6 instanceof c6) {
                ((c6) t6).w(cg0Var);
            }
        }
        cg0Var.setRoundRadius(0);
        lVar.removeView(cg0Var);
        cg0Var.getImageReceiver().c();
    }

    @Override // c5.a
    public final int b() {
        return this.c.size();
    }

    @Override // c5.a
    public final int c(Object obj) {
        int indexOf = this.c.indexOf((eg0) obj);
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
    public final Object e(c5.l lVar, int i7) {
        int i10;
        SparseArray sparseArray;
        boolean z10;
        boolean z11;
        String str;
        Bitmap n10;
        eg0 eg0Var = (eg0) this.c.get(i7);
        int k10 = k(i7);
        hg0 hg0Var = this.h;
        boolean z12 = hg0Var.j1;
        SparseArray sparseArray2 = hg0Var.e1;
        ArrayList arrayList = hg0Var.c1;
        ArrayList arrayList2 = hg0Var.b1;
        ArrayList arrayList3 = hg0Var.Y0;
        ArrayList arrayList4 = hg0Var.Z0;
        ArrayList arrayList5 = hg0Var.a1;
        ArrayList arrayList6 = hg0Var.X0;
        Context context = this.e;
        if (z12 && k10 == 0) {
            eg0Var.a = true;
            if (eg0Var.b == null) {
                eg0Var.b = new fg0(context);
            }
            if (eg0Var.b.getParent() == null) {
                lVar.addView(eg0Var.b);
            }
            return eg0Var;
        }
        eg0Var.a = false;
        fg0 fg0Var = eg0Var.b;
        if (fg0Var != null && fg0Var.getParent() != null) {
            lVar.removeView(eg0Var.b);
        }
        if (eg0Var.c == null) {
            cg0 cg0Var = new cg0(hg0Var, context, i7, this.f);
            eg0Var.c = cg0Var;
            this.d.set(i7, cg0Var);
        }
        if (eg0Var.c.getParent() == null) {
            lVar.addView(eg0Var.c);
        }
        eg0Var.c.getImageReceiver().x0 = true;
        int i11 = hg0Var.j1 ? k10 - 1 : k10;
        if (i11 != 0) {
            i10 = k10;
            sparseArray = sparseArray2;
            if (i11 >= 0 && i11 < arrayList6.size()) {
                org.telegram.messenger.gc gcVar = (org.telegram.messenger.gc) arrayList6.get(i11);
                eg0Var.c.M = gcVar != null;
                z10 = arrayList5.get(i11) == null;
                org.telegram.messenger.gc gcVar2 = (org.telegram.messenger.gc) arrayList4.get(i11);
                eg0Var.c.q((t51) arrayList5.get(i11), gcVar, null, (org.telegram.messenger.gc) arrayList3.get(i11), (org.telegram.messenger.gc) arrayList4.get(i11), (gcVar2 == null || !(gcVar2.k instanceof TLRPC.TL_photoStrippedSize)) ? null : "b", ((Integer) arrayList2.get(i11)).intValue(), "avatar_" + hg0Var.F0);
                if ((i11 >= 0 || i11 >= arrayList.size() || arrayList.get(i11) == null) ? z10 : true) {
                }
                eg0Var.c.getImageReceiver().h1 = new org.telegram.ui.Cells.c5(this);
                eg0Var.c.getImageReceiver().l1 = (byte) 2;
                cg0 cg0Var2 = eg0Var.c;
                int i12 = hg0Var.n1;
                int i13 = hg0Var.o1;
                cg0Var2.t(i12, i12, i13, i13);
                eg0Var.c.setTag(Integer.valueOf(i10));
                return eg0Var;
            }
            z10 = false;
            if ((i11 >= 0 || i11 >= arrayList.size() || arrayList.get(i11) == null) ? z10 : true) {
            }
            eg0Var.c.getImageReceiver().h1 = new org.telegram.ui.Cells.c5(this);
            eg0Var.c.getImageReceiver().l1 = (byte) 2;
            cg0 cg0Var22 = eg0Var.c;
            int i122 = hg0Var.n1;
            int i132 = hg0Var.o1;
            cg0Var22.t(i122, i122, i132, i132);
            eg0Var.c.setTag(Integer.valueOf(i10));
            return eg0Var;
        }
        q9 q9Var = this.g;
        Drawable t6 = q9Var == null ? null : q9Var.getImageReceiver().t();
        if (t6 instanceof c6) {
            c6 c6Var = (c6) t6;
            if (c6Var.s()) {
                eg0Var.c.setImageDrawable(t6);
                c6Var.f(eg0Var.c);
                c6Var.S = true;
                i10 = k10;
                sparseArray = sparseArray2;
                z10 = false;
                if ((i11 >= 0 || i11 >= arrayList.size() || arrayList.get(i11) == null) ? z10 : true) {
                    SparseArray sparseArray3 = sparseArray;
                    eg0Var.c.I = (RadialProgress2) sparseArray3.get(i11);
                    cg0 cg0Var3 = eg0Var.c;
                    if (cg0Var3.I == null) {
                        cg0Var3.I = new RadialProgress2(cg0Var3, null);
                        RadialProgress2 radialProgress2 = eg0Var.c.I;
                        radialProgress2.E = 0.0f;
                        radialProgress2.setIcon(10, false, false);
                        eg0Var.c.I.setColors(1107296256, 1107296256, -1, -1);
                        sparseArray3.append(i11, eg0Var.c.I);
                    }
                    if (hg0Var.h1) {
                        hg0Var.invalidate();
                    } else {
                        hg0Var.postInvalidateOnAnimation();
                    }
                }
                eg0Var.c.getImageReceiver().h1 = new org.telegram.ui.Cells.c5(this);
                eg0Var.c.getImageReceiver().l1 = (byte) 2;
                cg0 cg0Var222 = eg0Var.c;
                int i1222 = hg0Var.n1;
                int i1322 = hg0Var.o1;
                cg0Var222.t(i1222, i1222, i1322, i1322);
                eg0Var.c.setTag(Integer.valueOf(i10));
                return eg0Var;
            }
        }
        if (i11 >= 0 && i11 < arrayList6.size()) {
            org.telegram.messenger.gc gcVar3 = (org.telegram.messenger.gc) arrayList6.get(i11);
            eg0Var.c.M = gcVar3 != null;
            boolean z13 = arrayList5.get(i11) == null;
            if (!hg0Var.K0 || gcVar3 == null) {
                z11 = z13;
            } else {
                z11 = z13;
                if (gcVar3.p == 2) {
                    str = "avatar";
                    org.telegram.messenger.gc gcVar4 = (org.telegram.messenger.gc) arrayList4.get(i11);
                    q9 q9Var2 = this.g;
                    i10 = k10;
                    n10 = (q9Var2 == null && hg0Var.f1) ? q9Var2.getImageReceiver().n() : null;
                    StringBuilder sb2 = new StringBuilder("avatar_");
                    sparseArray = sparseArray2;
                    sb2.append(hg0Var.F0);
                    String sb3 = sb2.toString();
                    if (n10 == null && arrayList5.get(i11) == null) {
                        cg0 cg0Var4 = eg0Var.c;
                        org.telegram.messenger.gc gcVar5 = (org.telegram.messenger.gc) arrayList6.get(i11);
                        org.telegram.messenger.gc gcVar6 = (org.telegram.messenger.gc) arrayList3.get(i11);
                        int intValue = ((Integer) arrayList2.get(i11)).intValue();
                        cg0Var4.getClass();
                        cg0Var4.a.u0(gcVar5, str, gcVar6, null, null, null, new BitmapDrawable((Resources) null, n10), intValue, null, sb3, 1);
                        cg0Var4.d();
                    } else if (hg0Var.L0 == null) {
                        eg0Var.c.q((t51) arrayList5.get(i11), (org.telegram.messenger.gc) arrayList6.get(i11), str, (org.telegram.messenger.gc) arrayList3.get(i11), hg0Var.L0, null, ((Integer) arrayList2.get(i11)).intValue(), sb3);
                    } else {
                        eg0Var.c.q((t51) arrayList5.get(i11), gcVar3, null, (org.telegram.messenger.gc) arrayList3.get(i11), (org.telegram.messenger.gc) arrayList4.get(i11), (gcVar4 == null || !(gcVar4.k instanceof TLRPC.TL_photoStrippedSize)) ? null : "b", ((Integer) arrayList2.get(i11)).intValue(), sb3);
                    }
                    z10 = z11;
                    if ((i11 >= 0 || i11 >= arrayList.size() || arrayList.get(i11) == null) ? z10 : true) {
                    }
                    eg0Var.c.getImageReceiver().h1 = new org.telegram.ui.Cells.c5(this);
                    eg0Var.c.getImageReceiver().l1 = (byte) 2;
                    cg0 cg0Var2222 = eg0Var.c;
                    int i12222 = hg0Var.n1;
                    int i13222 = hg0Var.o1;
                    cg0Var2222.t(i12222, i12222, i13222, i13222);
                    eg0Var.c.setTag(Integer.valueOf(i10));
                    return eg0Var;
                }
            }
            str = null;
            org.telegram.messenger.gc gcVar42 = (org.telegram.messenger.gc) arrayList4.get(i11);
            q9 q9Var22 = this.g;
            i10 = k10;
            if (q9Var22 == null) {
            }
            StringBuilder sb22 = new StringBuilder("avatar_");
            sparseArray = sparseArray2;
            sb22.append(hg0Var.F0);
            String sb32 = sb22.toString();
            if (n10 == null) {
            }
            if (hg0Var.L0 == null) {
            }
            z10 = z11;
            if ((i11 >= 0 || i11 >= arrayList.size() || arrayList.get(i11) == null) ? z10 : true) {
            }
            eg0Var.c.getImageReceiver().h1 = new org.telegram.ui.Cells.c5(this);
            eg0Var.c.getImageReceiver().l1 = (byte) 2;
            cg0 cg0Var22222 = eg0Var.c;
            int i122222 = hg0Var.n1;
            int i132222 = hg0Var.o1;
            cg0Var22222.t(i122222, i122222, i132222, i132222);
            eg0Var.c.setTag(Integer.valueOf(i10));
            return eg0Var;
        }
        i10 = k10;
        sparseArray = sparseArray2;
        z10 = false;
        if ((i11 >= 0 || i11 >= arrayList.size() || arrayList.get(i11) == null) ? z10 : true) {
        }
        eg0Var.c.getImageReceiver().h1 = new org.telegram.ui.Cells.c5(this);
        eg0Var.c.getImageReceiver().l1 = (byte) 2;
        cg0 cg0Var222222 = eg0Var.c;
        int i1222222 = hg0Var.n1;
        int i1322222 = hg0Var.o1;
        cg0Var222222.t(i1222222, i1222222, i1322222, i1322222);
        eg0Var.c.setTag(Integer.valueOf(i10));
        return eg0Var;
    }

    @Override // c5.a
    public final boolean f(View view, Object obj) {
        eg0 eg0Var = (eg0) obj;
        return eg0Var.a ? view == eg0Var.b : view == eg0Var.c;
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
                ((q9) arrayList.get(i7)).getImageReceiver().c();
            }
            i7++;
        }
        ArrayList arrayList2 = this.c;
        arrayList2.clear();
        arrayList.clear();
        hg0 hg0Var = this.h;
        int size = hg0Var.Y0.size();
        if (hg0Var.j1) {
            size++;
        }
        org.telegram.messenger.vo voVar = hg0Var.T0;
        int j3 = (j() * 2) + Math.max(voVar == null ? 0 : voVar.b.size(), size);
        for (int i10 = 0; i10 < j3; i10++) {
            arrayList2.add(new eg0());
            arrayList.add(null);
        }
        super.g();
    }

    @Override // org.telegram.ui.Components.wp
    public final int j() {
        hg0 hg0Var = this.h;
        int size = hg0Var.Y0.size();
        if (hg0Var.j1) {
            size++;
        }
        if (size >= 2) {
            return hg0Var.getOffscreenPageLimit();
        }
        return 0;
    }
}
