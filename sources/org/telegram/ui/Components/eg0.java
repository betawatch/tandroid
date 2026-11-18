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

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class eg0 extends up {
    public final ArrayList c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public final Context e;
    public final Paint f;
    public q9 g;
    public final /* synthetic */ fg0 h;

    public eg0(fg0 fg0Var, Context context, org.telegram.ui.wv0 wv0Var) {
        this.h = fg0Var;
        this.e = context;
        this.g = wv0Var;
        Paint paint = new Paint(1);
        this.f = paint;
        paint.setColor(-16777216);
    }

    @Override // c5.a
    public final void a(c5.l lVar, Object obj) {
        cg0 cg0Var = (cg0) obj;
        View view = cg0Var.b;
        if (view != null) {
            lVar.removeView(view);
        }
        if (cg0Var.a) {
            return;
        }
        ag0 ag0Var = cg0Var.c;
        if (ag0Var.getImageReceiver().n0 != null) {
            Drawable t6 = ag0Var.getImageReceiver().t();
            if (t6 instanceof b6) {
                ((b6) t6).w(ag0Var);
            }
        }
        ag0Var.setRoundRadius(0);
        lVar.removeView(ag0Var);
        ag0Var.getImageReceiver().c();
    }

    @Override // c5.a
    public final int b() {
        return this.c.size();
    }

    @Override // c5.a
    public final int c(Object obj) {
        int indexOf = this.c.indexOf((cg0) obj);
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
        cg0 cg0Var = (cg0) this.c.get(i7);
        int k10 = k(i7);
        fg0 fg0Var = this.h;
        boolean z12 = fg0Var.j1;
        SparseArray sparseArray2 = fg0Var.e1;
        ArrayList arrayList = fg0Var.c1;
        ArrayList arrayList2 = fg0Var.b1;
        ArrayList arrayList3 = fg0Var.Y0;
        ArrayList arrayList4 = fg0Var.Z0;
        ArrayList arrayList5 = fg0Var.a1;
        ArrayList arrayList6 = fg0Var.X0;
        Context context = this.e;
        if (z12 && k10 == 0) {
            cg0Var.a = true;
            if (cg0Var.b == null) {
                cg0Var.b = new dg0(context);
            }
            if (cg0Var.b.getParent() == null) {
                lVar.addView(cg0Var.b);
            }
            return cg0Var;
        }
        cg0Var.a = false;
        dg0 dg0Var = cg0Var.b;
        if (dg0Var != null && dg0Var.getParent() != null) {
            lVar.removeView(cg0Var.b);
        }
        if (cg0Var.c == null) {
            ag0 ag0Var = new ag0(fg0Var, context, i7, this.f);
            cg0Var.c = ag0Var;
            this.d.set(i7, ag0Var);
        }
        if (cg0Var.c.getParent() == null) {
            lVar.addView(cg0Var.c);
        }
        cg0Var.c.getImageReceiver().x0 = true;
        int i11 = fg0Var.j1 ? k10 - 1 : k10;
        if (i11 != 0) {
            i10 = k10;
            sparseArray = sparseArray2;
            if (i11 >= 0 && i11 < arrayList6.size()) {
                org.telegram.messenger.fc fcVar = (org.telegram.messenger.fc) arrayList6.get(i11);
                cg0Var.c.M = fcVar != null;
                z10 = arrayList5.get(i11) == null;
                org.telegram.messenger.fc fcVar2 = (org.telegram.messenger.fc) arrayList4.get(i11);
                cg0Var.c.q((q51) arrayList5.get(i11), fcVar, null, (org.telegram.messenger.fc) arrayList3.get(i11), (org.telegram.messenger.fc) arrayList4.get(i11), (fcVar2 == null || !(fcVar2.k instanceof TLRPC.TL_photoStrippedSize)) ? null : "b", ((Integer) arrayList2.get(i11)).intValue(), "avatar_" + fg0Var.F0);
                if ((i11 >= 0 || i11 >= arrayList.size() || arrayList.get(i11) == null) ? z10 : true) {
                }
                cg0Var.c.getImageReceiver().h1 = new org.telegram.ui.Cells.c5(this);
                cg0Var.c.getImageReceiver().l1 = (byte) 2;
                ag0 ag0Var2 = cg0Var.c;
                int i12 = fg0Var.n1;
                int i13 = fg0Var.o1;
                ag0Var2.t(i12, i12, i13, i13);
                cg0Var.c.setTag(Integer.valueOf(i10));
                return cg0Var;
            }
            z10 = false;
            if ((i11 >= 0 || i11 >= arrayList.size() || arrayList.get(i11) == null) ? z10 : true) {
            }
            cg0Var.c.getImageReceiver().h1 = new org.telegram.ui.Cells.c5(this);
            cg0Var.c.getImageReceiver().l1 = (byte) 2;
            ag0 ag0Var22 = cg0Var.c;
            int i122 = fg0Var.n1;
            int i132 = fg0Var.o1;
            ag0Var22.t(i122, i122, i132, i132);
            cg0Var.c.setTag(Integer.valueOf(i10));
            return cg0Var;
        }
        q9 q9Var = this.g;
        Drawable t6 = q9Var == null ? null : q9Var.getImageReceiver().t();
        if (t6 instanceof b6) {
            b6 b6Var = (b6) t6;
            if (b6Var.s()) {
                cg0Var.c.setImageDrawable(t6);
                b6Var.f(cg0Var.c);
                b6Var.S = true;
                i10 = k10;
                sparseArray = sparseArray2;
                z10 = false;
                if ((i11 >= 0 || i11 >= arrayList.size() || arrayList.get(i11) == null) ? z10 : true) {
                    SparseArray sparseArray3 = sparseArray;
                    cg0Var.c.I = (RadialProgress2) sparseArray3.get(i11);
                    ag0 ag0Var3 = cg0Var.c;
                    if (ag0Var3.I == null) {
                        ag0Var3.I = new RadialProgress2(ag0Var3, null);
                        RadialProgress2 radialProgress2 = cg0Var.c.I;
                        radialProgress2.E = 0.0f;
                        radialProgress2.setIcon(10, false, false);
                        cg0Var.c.I.setColors(1107296256, 1107296256, -1, -1);
                        sparseArray3.append(i11, cg0Var.c.I);
                    }
                    if (fg0Var.h1) {
                        fg0Var.invalidate();
                    } else {
                        fg0Var.postInvalidateOnAnimation();
                    }
                }
                cg0Var.c.getImageReceiver().h1 = new org.telegram.ui.Cells.c5(this);
                cg0Var.c.getImageReceiver().l1 = (byte) 2;
                ag0 ag0Var222 = cg0Var.c;
                int i1222 = fg0Var.n1;
                int i1322 = fg0Var.o1;
                ag0Var222.t(i1222, i1222, i1322, i1322);
                cg0Var.c.setTag(Integer.valueOf(i10));
                return cg0Var;
            }
        }
        if (i11 >= 0 && i11 < arrayList6.size()) {
            org.telegram.messenger.fc fcVar3 = (org.telegram.messenger.fc) arrayList6.get(i11);
            cg0Var.c.M = fcVar3 != null;
            boolean z13 = arrayList5.get(i11) == null;
            if (!fg0Var.K0 || fcVar3 == null) {
                z11 = z13;
            } else {
                z11 = z13;
                if (fcVar3.p == 2) {
                    str = "avatar";
                    org.telegram.messenger.fc fcVar4 = (org.telegram.messenger.fc) arrayList4.get(i11);
                    q9 q9Var2 = this.g;
                    i10 = k10;
                    n10 = (q9Var2 == null && fg0Var.f1) ? q9Var2.getImageReceiver().n() : null;
                    StringBuilder sb2 = new StringBuilder("avatar_");
                    sparseArray = sparseArray2;
                    sb2.append(fg0Var.F0);
                    String sb3 = sb2.toString();
                    if (n10 == null && arrayList5.get(i11) == null) {
                        ag0 ag0Var4 = cg0Var.c;
                        org.telegram.messenger.fc fcVar5 = (org.telegram.messenger.fc) arrayList6.get(i11);
                        org.telegram.messenger.fc fcVar6 = (org.telegram.messenger.fc) arrayList3.get(i11);
                        int intValue = ((Integer) arrayList2.get(i11)).intValue();
                        ag0Var4.getClass();
                        ag0Var4.a.u0(fcVar5, str, fcVar6, null, null, null, new BitmapDrawable((Resources) null, n10), intValue, null, sb3, 1);
                        ag0Var4.d();
                    } else if (fg0Var.L0 == null) {
                        cg0Var.c.q((q51) arrayList5.get(i11), (org.telegram.messenger.fc) arrayList6.get(i11), str, (org.telegram.messenger.fc) arrayList3.get(i11), fg0Var.L0, null, ((Integer) arrayList2.get(i11)).intValue(), sb3);
                    } else {
                        cg0Var.c.q((q51) arrayList5.get(i11), fcVar3, null, (org.telegram.messenger.fc) arrayList3.get(i11), (org.telegram.messenger.fc) arrayList4.get(i11), (fcVar4 == null || !(fcVar4.k instanceof TLRPC.TL_photoStrippedSize)) ? null : "b", ((Integer) arrayList2.get(i11)).intValue(), sb3);
                    }
                    z10 = z11;
                    if ((i11 >= 0 || i11 >= arrayList.size() || arrayList.get(i11) == null) ? z10 : true) {
                    }
                    cg0Var.c.getImageReceiver().h1 = new org.telegram.ui.Cells.c5(this);
                    cg0Var.c.getImageReceiver().l1 = (byte) 2;
                    ag0 ag0Var2222 = cg0Var.c;
                    int i12222 = fg0Var.n1;
                    int i13222 = fg0Var.o1;
                    ag0Var2222.t(i12222, i12222, i13222, i13222);
                    cg0Var.c.setTag(Integer.valueOf(i10));
                    return cg0Var;
                }
            }
            str = null;
            org.telegram.messenger.fc fcVar42 = (org.telegram.messenger.fc) arrayList4.get(i11);
            q9 q9Var22 = this.g;
            i10 = k10;
            if (q9Var22 == null) {
            }
            StringBuilder sb22 = new StringBuilder("avatar_");
            sparseArray = sparseArray2;
            sb22.append(fg0Var.F0);
            String sb32 = sb22.toString();
            if (n10 == null) {
            }
            if (fg0Var.L0 == null) {
            }
            z10 = z11;
            if ((i11 >= 0 || i11 >= arrayList.size() || arrayList.get(i11) == null) ? z10 : true) {
            }
            cg0Var.c.getImageReceiver().h1 = new org.telegram.ui.Cells.c5(this);
            cg0Var.c.getImageReceiver().l1 = (byte) 2;
            ag0 ag0Var22222 = cg0Var.c;
            int i122222 = fg0Var.n1;
            int i132222 = fg0Var.o1;
            ag0Var22222.t(i122222, i122222, i132222, i132222);
            cg0Var.c.setTag(Integer.valueOf(i10));
            return cg0Var;
        }
        i10 = k10;
        sparseArray = sparseArray2;
        z10 = false;
        if ((i11 >= 0 || i11 >= arrayList.size() || arrayList.get(i11) == null) ? z10 : true) {
        }
        cg0Var.c.getImageReceiver().h1 = new org.telegram.ui.Cells.c5(this);
        cg0Var.c.getImageReceiver().l1 = (byte) 2;
        ag0 ag0Var222222 = cg0Var.c;
        int i1222222 = fg0Var.n1;
        int i1322222 = fg0Var.o1;
        ag0Var222222.t(i1222222, i1222222, i1322222, i1322222);
        cg0Var.c.setTag(Integer.valueOf(i10));
        return cg0Var;
    }

    @Override // c5.a
    public final boolean f(View view, Object obj) {
        cg0 cg0Var = (cg0) obj;
        return cg0Var.a ? view == cg0Var.b : view == cg0Var.c;
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
        fg0 fg0Var = this.h;
        int size = fg0Var.Y0.size();
        if (fg0Var.j1) {
            size++;
        }
        org.telegram.messenger.uo uoVar = fg0Var.T0;
        int j3 = (j() * 2) + Math.max(uoVar == null ? 0 : uoVar.b.size(), size);
        for (int i10 = 0; i10 < j3; i10++) {
            arrayList2.add(new cg0());
            arrayList.add(null);
        }
        super.g();
    }

    @Override // org.telegram.ui.Components.up
    public final int j() {
        fg0 fg0Var = this.h;
        int size = fg0Var.Y0.size();
        if (fg0Var.j1) {
            size++;
        }
        if (size >= 2) {
            return fg0Var.getOffscreenPageLimit();
        }
        return 0;
    }
}
