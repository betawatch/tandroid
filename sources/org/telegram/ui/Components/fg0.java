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

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class fg0 extends tp {
    public final ArrayList c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public final Context e;
    public final Paint f;
    public p9 g;
    public final /* synthetic */ gg0 h;

    public fg0(gg0 gg0Var, Context context, org.telegram.ui.vv0 vv0Var) {
        this.h = gg0Var;
        this.e = context;
        this.g = vv0Var;
        Paint paint = new Paint(1);
        this.f = paint;
        paint.setColor(-16777216);
    }

    @Override // c5.a
    public final void a(c5.l lVar, Object obj) {
        dg0 dg0Var = (dg0) obj;
        View view = dg0Var.b;
        if (view != null) {
            lVar.removeView(view);
        }
        if (dg0Var.a) {
            return;
        }
        bg0 bg0Var = dg0Var.c;
        if (bg0Var.getImageReceiver().n0 != null) {
            Drawable t6 = bg0Var.getImageReceiver().t();
            if (t6 instanceof b6) {
                ((b6) t6).w(bg0Var);
            }
        }
        bg0Var.setRoundRadius(0);
        lVar.removeView(bg0Var);
        bg0Var.getImageReceiver().c();
    }

    @Override // c5.a
    public final int b() {
        return this.c.size();
    }

    @Override // c5.a
    public final int c(Object obj) {
        int indexOf = this.c.indexOf((dg0) obj);
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
        dg0 dg0Var = (dg0) this.c.get(i7);
        int k10 = k(i7);
        gg0 gg0Var = this.h;
        boolean z12 = gg0Var.j1;
        SparseArray sparseArray2 = gg0Var.e1;
        ArrayList arrayList = gg0Var.c1;
        ArrayList arrayList2 = gg0Var.b1;
        ArrayList arrayList3 = gg0Var.Y0;
        ArrayList arrayList4 = gg0Var.Z0;
        ArrayList arrayList5 = gg0Var.a1;
        ArrayList arrayList6 = gg0Var.X0;
        Context context = this.e;
        if (z12 && k10 == 0) {
            dg0Var.a = true;
            if (dg0Var.b == null) {
                dg0Var.b = new eg0(context);
            }
            if (dg0Var.b.getParent() == null) {
                lVar.addView(dg0Var.b);
            }
            return dg0Var;
        }
        dg0Var.a = false;
        eg0 eg0Var = dg0Var.b;
        if (eg0Var != null && eg0Var.getParent() != null) {
            lVar.removeView(dg0Var.b);
        }
        if (dg0Var.c == null) {
            bg0 bg0Var = new bg0(gg0Var, context, i7, this.f);
            dg0Var.c = bg0Var;
            this.d.set(i7, bg0Var);
        }
        if (dg0Var.c.getParent() == null) {
            lVar.addView(dg0Var.c);
        }
        dg0Var.c.getImageReceiver().x0 = true;
        int i11 = gg0Var.j1 ? k10 - 1 : k10;
        if (i11 != 0) {
            i10 = k10;
            sparseArray = sparseArray2;
            if (i11 >= 0 && i11 < arrayList6.size()) {
                org.telegram.messenger.fc fcVar = (org.telegram.messenger.fc) arrayList6.get(i11);
                dg0Var.c.M = fcVar != null;
                z10 = arrayList5.get(i11) == null;
                org.telegram.messenger.fc fcVar2 = (org.telegram.messenger.fc) arrayList4.get(i11);
                dg0Var.c.q((s51) arrayList5.get(i11), fcVar, null, (org.telegram.messenger.fc) arrayList3.get(i11), (org.telegram.messenger.fc) arrayList4.get(i11), (fcVar2 == null || !(fcVar2.k instanceof TLRPC.TL_photoStrippedSize)) ? null : "b", ((Integer) arrayList2.get(i11)).intValue(), "avatar_" + gg0Var.F0);
                if ((i11 >= 0 || i11 >= arrayList.size() || arrayList.get(i11) == null) ? z10 : true) {
                }
                dg0Var.c.getImageReceiver().h1 = new org.telegram.ui.ActionBar.i5(this);
                dg0Var.c.getImageReceiver().l1 = (byte) 2;
                bg0 bg0Var2 = dg0Var.c;
                int i12 = gg0Var.n1;
                int i13 = gg0Var.o1;
                bg0Var2.t(i12, i12, i13, i13);
                dg0Var.c.setTag(Integer.valueOf(i10));
                return dg0Var;
            }
            z10 = false;
            if ((i11 >= 0 || i11 >= arrayList.size() || arrayList.get(i11) == null) ? z10 : true) {
            }
            dg0Var.c.getImageReceiver().h1 = new org.telegram.ui.ActionBar.i5(this);
            dg0Var.c.getImageReceiver().l1 = (byte) 2;
            bg0 bg0Var22 = dg0Var.c;
            int i122 = gg0Var.n1;
            int i132 = gg0Var.o1;
            bg0Var22.t(i122, i122, i132, i132);
            dg0Var.c.setTag(Integer.valueOf(i10));
            return dg0Var;
        }
        p9 p9Var = this.g;
        Drawable t6 = p9Var == null ? null : p9Var.getImageReceiver().t();
        if (t6 instanceof b6) {
            b6 b6Var = (b6) t6;
            if (b6Var.s()) {
                dg0Var.c.setImageDrawable(t6);
                b6Var.f(dg0Var.c);
                b6Var.S = true;
                i10 = k10;
                sparseArray = sparseArray2;
                z10 = false;
                if ((i11 >= 0 || i11 >= arrayList.size() || arrayList.get(i11) == null) ? z10 : true) {
                    SparseArray sparseArray3 = sparseArray;
                    dg0Var.c.I = (RadialProgress2) sparseArray3.get(i11);
                    bg0 bg0Var3 = dg0Var.c;
                    if (bg0Var3.I == null) {
                        bg0Var3.I = new RadialProgress2(bg0Var3, null);
                        RadialProgress2 radialProgress2 = dg0Var.c.I;
                        radialProgress2.E = 0.0f;
                        radialProgress2.setIcon(10, false, false);
                        dg0Var.c.I.setColors(1107296256, 1107296256, -1, -1);
                        sparseArray3.append(i11, dg0Var.c.I);
                    }
                    if (gg0Var.h1) {
                        gg0Var.invalidate();
                    } else {
                        gg0Var.postInvalidateOnAnimation();
                    }
                }
                dg0Var.c.getImageReceiver().h1 = new org.telegram.ui.ActionBar.i5(this);
                dg0Var.c.getImageReceiver().l1 = (byte) 2;
                bg0 bg0Var222 = dg0Var.c;
                int i1222 = gg0Var.n1;
                int i1322 = gg0Var.o1;
                bg0Var222.t(i1222, i1222, i1322, i1322);
                dg0Var.c.setTag(Integer.valueOf(i10));
                return dg0Var;
            }
        }
        if (i11 >= 0 && i11 < arrayList6.size()) {
            org.telegram.messenger.fc fcVar3 = (org.telegram.messenger.fc) arrayList6.get(i11);
            dg0Var.c.M = fcVar3 != null;
            boolean z13 = arrayList5.get(i11) == null;
            if (!gg0Var.K0 || fcVar3 == null) {
                z11 = z13;
            } else {
                z11 = z13;
                if (fcVar3.p == 2) {
                    str = "avatar";
                    org.telegram.messenger.fc fcVar4 = (org.telegram.messenger.fc) arrayList4.get(i11);
                    p9 p9Var2 = this.g;
                    i10 = k10;
                    n10 = (p9Var2 == null && gg0Var.f1) ? p9Var2.getImageReceiver().n() : null;
                    StringBuilder sb2 = new StringBuilder("avatar_");
                    sparseArray = sparseArray2;
                    sb2.append(gg0Var.F0);
                    String sb3 = sb2.toString();
                    if (n10 == null && arrayList5.get(i11) == null) {
                        bg0 bg0Var4 = dg0Var.c;
                        org.telegram.messenger.fc fcVar5 = (org.telegram.messenger.fc) arrayList6.get(i11);
                        org.telegram.messenger.fc fcVar6 = (org.telegram.messenger.fc) arrayList3.get(i11);
                        int intValue = ((Integer) arrayList2.get(i11)).intValue();
                        bg0Var4.getClass();
                        bg0Var4.a.v0(fcVar5, str, fcVar6, null, null, null, new BitmapDrawable((Resources) null, n10), intValue, null, sb3, 1);
                        bg0Var4.e();
                    } else if (gg0Var.L0 == null) {
                        dg0Var.c.q((s51) arrayList5.get(i11), (org.telegram.messenger.fc) arrayList6.get(i11), str, (org.telegram.messenger.fc) arrayList3.get(i11), gg0Var.L0, null, ((Integer) arrayList2.get(i11)).intValue(), sb3);
                    } else {
                        dg0Var.c.q((s51) arrayList5.get(i11), fcVar3, null, (org.telegram.messenger.fc) arrayList3.get(i11), (org.telegram.messenger.fc) arrayList4.get(i11), (fcVar4 == null || !(fcVar4.k instanceof TLRPC.TL_photoStrippedSize)) ? null : "b", ((Integer) arrayList2.get(i11)).intValue(), sb3);
                    }
                    z10 = z11;
                    if ((i11 >= 0 || i11 >= arrayList.size() || arrayList.get(i11) == null) ? z10 : true) {
                    }
                    dg0Var.c.getImageReceiver().h1 = new org.telegram.ui.ActionBar.i5(this);
                    dg0Var.c.getImageReceiver().l1 = (byte) 2;
                    bg0 bg0Var2222 = dg0Var.c;
                    int i12222 = gg0Var.n1;
                    int i13222 = gg0Var.o1;
                    bg0Var2222.t(i12222, i12222, i13222, i13222);
                    dg0Var.c.setTag(Integer.valueOf(i10));
                    return dg0Var;
                }
            }
            str = null;
            org.telegram.messenger.fc fcVar42 = (org.telegram.messenger.fc) arrayList4.get(i11);
            p9 p9Var22 = this.g;
            i10 = k10;
            if (p9Var22 == null) {
            }
            StringBuilder sb22 = new StringBuilder("avatar_");
            sparseArray = sparseArray2;
            sb22.append(gg0Var.F0);
            String sb32 = sb22.toString();
            if (n10 == null) {
            }
            if (gg0Var.L0 == null) {
            }
            z10 = z11;
            if ((i11 >= 0 || i11 >= arrayList.size() || arrayList.get(i11) == null) ? z10 : true) {
            }
            dg0Var.c.getImageReceiver().h1 = new org.telegram.ui.ActionBar.i5(this);
            dg0Var.c.getImageReceiver().l1 = (byte) 2;
            bg0 bg0Var22222 = dg0Var.c;
            int i122222 = gg0Var.n1;
            int i132222 = gg0Var.o1;
            bg0Var22222.t(i122222, i122222, i132222, i132222);
            dg0Var.c.setTag(Integer.valueOf(i10));
            return dg0Var;
        }
        i10 = k10;
        sparseArray = sparseArray2;
        z10 = false;
        if ((i11 >= 0 || i11 >= arrayList.size() || arrayList.get(i11) == null) ? z10 : true) {
        }
        dg0Var.c.getImageReceiver().h1 = new org.telegram.ui.ActionBar.i5(this);
        dg0Var.c.getImageReceiver().l1 = (byte) 2;
        bg0 bg0Var222222 = dg0Var.c;
        int i1222222 = gg0Var.n1;
        int i1322222 = gg0Var.o1;
        bg0Var222222.t(i1222222, i1222222, i1322222, i1322222);
        dg0Var.c.setTag(Integer.valueOf(i10));
        return dg0Var;
    }

    @Override // c5.a
    public final boolean f(View view, Object obj) {
        dg0 dg0Var = (dg0) obj;
        return dg0Var.a ? view == dg0Var.b : view == dg0Var.c;
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
                ((p9) arrayList.get(i7)).getImageReceiver().c();
            }
            i7++;
        }
        ArrayList arrayList2 = this.c;
        arrayList2.clear();
        arrayList.clear();
        gg0 gg0Var = this.h;
        int size = gg0Var.Y0.size();
        if (gg0Var.j1) {
            size++;
        }
        org.telegram.messenger.uo uoVar = gg0Var.T0;
        int j3 = (j() * 2) + Math.max(uoVar == null ? 0 : uoVar.b.size(), size);
        for (int i10 = 0; i10 < j3; i10++) {
            arrayList2.add(new dg0());
            arrayList.add(null);
        }
        super.g();
    }

    @Override // org.telegram.ui.Components.tp
    public final int j() {
        gg0 gg0Var = this.h;
        int size = gg0Var.Y0.size();
        if (gg0Var.j1) {
            size++;
        }
        if (size >= 2) {
            return gg0Var.getOffscreenPageLimit();
        }
        return 0;
    }
}
