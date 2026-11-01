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

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class ug0 extends mp {
    public final ArrayList c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public final Context e;
    public final Paint f;
    public g9 g;
    public final /* synthetic */ vg0 h;

    public ug0(vg0 vg0Var, Context context, org.telegram.ui.ix0 ix0Var) {
        this.h = vg0Var;
        this.e = context;
        this.g = ix0Var;
        Paint paint = new Paint(1);
        this.f = paint;
        paint.setColor(-16777216);
    }

    @Override // z4.a
    public final void a(z4.g gVar, Object obj) {
        sg0 sg0Var = (sg0) obj;
        View view = sg0Var.b;
        if (view != null) {
            gVar.removeView(view);
        }
        if (sg0Var.a) {
            return;
        }
        qg0 qg0Var = sg0Var.c;
        if (qg0Var.getImageReceiver().m0 != null) {
            Drawable t10 = qg0Var.getImageReceiver().t();
            if (t10 instanceof s5) {
                ((s5) t10).w(qg0Var);
            }
        }
        qg0Var.setRoundRadius(0);
        gVar.removeView(qg0Var);
        qg0Var.getImageReceiver().c();
    }

    @Override // z4.a
    public final int b() {
        return this.c.size();
    }

    @Override // z4.a
    public final int c(Object obj) {
        int indexOf = this.c.indexOf((sg0) obj);
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
        org.telegram.messenger.ep epVar = this.h.S0;
        sb2.append(epVar == null ? 0 : epVar.b.size());
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
        sg0 sg0Var = (sg0) this.c.get(i10);
        int k10 = k(i10);
        vg0 vg0Var = this.h;
        boolean z12 = vg0Var.i1;
        SparseArray sparseArray2 = vg0Var.d1;
        ArrayList arrayList = vg0Var.b1;
        ArrayList arrayList2 = vg0Var.a1;
        ArrayList arrayList3 = vg0Var.X0;
        ArrayList arrayList4 = vg0Var.Y0;
        ArrayList arrayList5 = vg0Var.Z0;
        ArrayList arrayList6 = vg0Var.W0;
        Context context = this.e;
        if (z12 && k10 == 0) {
            sg0Var.a = true;
            if (sg0Var.b == null) {
                sg0Var.b = new tg0(context);
            }
            if (sg0Var.b.getParent() == null) {
                gVar.addView(sg0Var.b);
            }
            return sg0Var;
        }
        sg0Var.a = false;
        tg0 tg0Var = sg0Var.b;
        if (tg0Var != null && tg0Var.getParent() != null) {
            gVar.removeView(sg0Var.b);
        }
        if (sg0Var.c == null) {
            qg0 qg0Var = new qg0(vg0Var, context, i10, this.f);
            sg0Var.c = qg0Var;
            this.d.set(i10, qg0Var);
        }
        if (sg0Var.c.getParent() == null) {
            gVar.addView(sg0Var.c);
        }
        sg0Var.c.getImageReceiver().w0 = true;
        int i12 = vg0Var.i1 ? k10 - 1 : k10;
        if (i12 != 0) {
            i11 = k10;
            sparseArray = sparseArray2;
            if (i12 >= 0 && i12 < arrayList6.size()) {
                org.telegram.messenger.jc jcVar = (org.telegram.messenger.jc) arrayList6.get(i12);
                sg0Var.c.L = jcVar != null;
                z10 = arrayList5.get(i12) == null;
                org.telegram.messenger.jc jcVar2 = (org.telegram.messenger.jc) arrayList4.get(i12);
                sg0Var.c.q((h61) arrayList5.get(i12), jcVar, null, (org.telegram.messenger.jc) arrayList3.get(i12), (org.telegram.messenger.jc) arrayList4.get(i12), (jcVar2 == null || !(jcVar2.k instanceof TLRPC.TL_photoStrippedSize)) ? null : "b", ((Integer) arrayList2.get(i12)).intValue(), "avatar_" + vg0Var.E0);
                if ((i12 >= 0 || i12 >= arrayList.size() || arrayList.get(i12) == null) ? z10 : true) {
                }
                sg0Var.c.getImageReceiver().g1 = new l2.f(this, 18);
                sg0Var.c.getImageReceiver().k1 = (byte) 2;
                qg0 qg0Var2 = sg0Var.c;
                int i13 = vg0Var.m1;
                int i14 = vg0Var.n1;
                qg0Var2.t(i13, i13, i14, i14);
                sg0Var.c.setTag(Integer.valueOf(i11));
                return sg0Var;
            }
            z10 = false;
            if ((i12 >= 0 || i12 >= arrayList.size() || arrayList.get(i12) == null) ? z10 : true) {
            }
            sg0Var.c.getImageReceiver().g1 = new l2.f(this, 18);
            sg0Var.c.getImageReceiver().k1 = (byte) 2;
            qg0 qg0Var22 = sg0Var.c;
            int i132 = vg0Var.m1;
            int i142 = vg0Var.n1;
            qg0Var22.t(i132, i132, i142, i142);
            sg0Var.c.setTag(Integer.valueOf(i11));
            return sg0Var;
        }
        g9 g9Var = this.g;
        Drawable t10 = g9Var == null ? null : g9Var.getImageReceiver().t();
        if (t10 instanceof s5) {
            s5 s5Var = (s5) t10;
            if (s5Var.s()) {
                sg0Var.c.setImageDrawable(t10);
                s5Var.f(sg0Var.c);
                s5Var.R = true;
                i11 = k10;
                sparseArray = sparseArray2;
                z10 = false;
                if ((i12 >= 0 || i12 >= arrayList.size() || arrayList.get(i12) == null) ? z10 : true) {
                    SparseArray sparseArray3 = sparseArray;
                    sg0Var.c.H = (RadialProgress2) sparseArray3.get(i12);
                    qg0 qg0Var3 = sg0Var.c;
                    if (qg0Var3.H == null) {
                        qg0Var3.H = new RadialProgress2(qg0Var3, null);
                        RadialProgress2 radialProgress2 = sg0Var.c.H;
                        radialProgress2.E = 0.0f;
                        radialProgress2.setIcon(10, false, false);
                        sg0Var.c.H.setColors(1107296256, 1107296256, -1, -1);
                        sparseArray3.append(i12, sg0Var.c.H);
                    }
                    if (vg0Var.g1) {
                        vg0Var.invalidate();
                    } else {
                        vg0Var.postInvalidateOnAnimation();
                    }
                }
                sg0Var.c.getImageReceiver().g1 = new l2.f(this, 18);
                sg0Var.c.getImageReceiver().k1 = (byte) 2;
                qg0 qg0Var222 = sg0Var.c;
                int i1322 = vg0Var.m1;
                int i1422 = vg0Var.n1;
                qg0Var222.t(i1322, i1322, i1422, i1422);
                sg0Var.c.setTag(Integer.valueOf(i11));
                return sg0Var;
            }
        }
        if (i12 >= 0 && i12 < arrayList6.size()) {
            org.telegram.messenger.jc jcVar3 = (org.telegram.messenger.jc) arrayList6.get(i12);
            sg0Var.c.L = jcVar3 != null;
            boolean z13 = arrayList5.get(i12) == null;
            if (!vg0Var.J0 || jcVar3 == null) {
                z11 = z13;
            } else {
                z11 = z13;
                if (jcVar3.p == 2) {
                    str = "avatar";
                    org.telegram.messenger.jc jcVar4 = (org.telegram.messenger.jc) arrayList4.get(i12);
                    g9 g9Var2 = this.g;
                    i11 = k10;
                    n10 = (g9Var2 == null && vg0Var.e1) ? g9Var2.getImageReceiver().n() : null;
                    StringBuilder sb2 = new StringBuilder("avatar_");
                    sparseArray = sparseArray2;
                    sb2.append(vg0Var.E0);
                    String sb3 = sb2.toString();
                    if (n10 == null && arrayList5.get(i12) == null) {
                        qg0 qg0Var4 = sg0Var.c;
                        org.telegram.messenger.jc jcVar5 = (org.telegram.messenger.jc) arrayList6.get(i12);
                        org.telegram.messenger.jc jcVar6 = (org.telegram.messenger.jc) arrayList3.get(i12);
                        int intValue = ((Integer) arrayList2.get(i12)).intValue();
                        qg0Var4.getClass();
                        qg0Var4.a.u0(jcVar5, str, jcVar6, null, null, null, new BitmapDrawable((Resources) null, n10), intValue, null, sb3, 1);
                        qg0Var4.d();
                    } else if (vg0Var.K0 == null) {
                        sg0Var.c.q((h61) arrayList5.get(i12), (org.telegram.messenger.jc) arrayList6.get(i12), str, (org.telegram.messenger.jc) arrayList3.get(i12), vg0Var.K0, null, ((Integer) arrayList2.get(i12)).intValue(), sb3);
                    } else {
                        sg0Var.c.q((h61) arrayList5.get(i12), jcVar3, null, (org.telegram.messenger.jc) arrayList3.get(i12), (org.telegram.messenger.jc) arrayList4.get(i12), (jcVar4 == null || !(jcVar4.k instanceof TLRPC.TL_photoStrippedSize)) ? null : "b", ((Integer) arrayList2.get(i12)).intValue(), sb3);
                    }
                    z10 = z11;
                    if ((i12 >= 0 || i12 >= arrayList.size() || arrayList.get(i12) == null) ? z10 : true) {
                    }
                    sg0Var.c.getImageReceiver().g1 = new l2.f(this, 18);
                    sg0Var.c.getImageReceiver().k1 = (byte) 2;
                    qg0 qg0Var2222 = sg0Var.c;
                    int i13222 = vg0Var.m1;
                    int i14222 = vg0Var.n1;
                    qg0Var2222.t(i13222, i13222, i14222, i14222);
                    sg0Var.c.setTag(Integer.valueOf(i11));
                    return sg0Var;
                }
            }
            str = null;
            org.telegram.messenger.jc jcVar42 = (org.telegram.messenger.jc) arrayList4.get(i12);
            g9 g9Var22 = this.g;
            i11 = k10;
            if (g9Var22 == null) {
            }
            StringBuilder sb22 = new StringBuilder("avatar_");
            sparseArray = sparseArray2;
            sb22.append(vg0Var.E0);
            String sb32 = sb22.toString();
            if (n10 == null) {
            }
            if (vg0Var.K0 == null) {
            }
            z10 = z11;
            if ((i12 >= 0 || i12 >= arrayList.size() || arrayList.get(i12) == null) ? z10 : true) {
            }
            sg0Var.c.getImageReceiver().g1 = new l2.f(this, 18);
            sg0Var.c.getImageReceiver().k1 = (byte) 2;
            qg0 qg0Var22222 = sg0Var.c;
            int i132222 = vg0Var.m1;
            int i142222 = vg0Var.n1;
            qg0Var22222.t(i132222, i132222, i142222, i142222);
            sg0Var.c.setTag(Integer.valueOf(i11));
            return sg0Var;
        }
        i11 = k10;
        sparseArray = sparseArray2;
        z10 = false;
        if ((i12 >= 0 || i12 >= arrayList.size() || arrayList.get(i12) == null) ? z10 : true) {
        }
        sg0Var.c.getImageReceiver().g1 = new l2.f(this, 18);
        sg0Var.c.getImageReceiver().k1 = (byte) 2;
        qg0 qg0Var222222 = sg0Var.c;
        int i1322222 = vg0Var.m1;
        int i1422222 = vg0Var.n1;
        qg0Var222222.t(i1322222, i1322222, i1422222, i1422222);
        sg0Var.c.setTag(Integer.valueOf(i11));
        return sg0Var;
    }

    @Override // z4.a
    public final boolean f(View view, Object obj) {
        sg0 sg0Var = (sg0) obj;
        return sg0Var.a ? view == sg0Var.b : view == sg0Var.c;
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
        vg0 vg0Var = this.h;
        int size = vg0Var.X0.size();
        if (vg0Var.i1) {
            size++;
        }
        org.telegram.messenger.ep epVar = vg0Var.S0;
        int j10 = (j() * 2) + Math.max(epVar == null ? 0 : epVar.b.size(), size);
        for (int i11 = 0; i11 < j10; i11++) {
            arrayList2.add(new sg0());
            arrayList.add(null);
        }
        super.g();
    }

    @Override // org.telegram.ui.Components.mp
    public final int j() {
        vg0 vg0Var = this.h;
        int size = vg0Var.X0.size();
        if (vg0Var.i1) {
            size++;
        }
        if (size >= 2) {
            return vg0Var.getOffscreenPageLimit();
        }
        return 0;
    }
}
