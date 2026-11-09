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

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class sf0 extends ep {
    public final ArrayList c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public final Context e;
    public final Paint f;
    public l9 g;
    public final /* synthetic */ tf0 h;

    public sf0(tf0 tf0Var, Context context, org.telegram.ui.yv0 yv0Var) {
        this.h = tf0Var;
        this.e = context;
        this.g = yv0Var;
        Paint paint = new Paint(1);
        this.f = paint;
        paint.setColor(-16777216);
    }

    @Override // c5.a
    public final void a(c5.k kVar, Object obj) {
        qf0 qf0Var = (qf0) obj;
        View view = qf0Var.b;
        if (view != null) {
            kVar.removeView(view);
        }
        if (qf0Var.a) {
            return;
        }
        of0 of0Var = qf0Var.c;
        if (of0Var.getImageReceiver().m0 != null) {
            Drawable t6 = of0Var.getImageReceiver().t();
            if (t6 instanceof v5) {
                ((v5) t6).w(of0Var);
            }
        }
        of0Var.setRoundRadius(0);
        kVar.removeView(of0Var);
        of0Var.getImageReceiver().c();
    }

    @Override // c5.a
    public final int b() {
        return this.c.size();
    }

    @Override // c5.a
    public final int c(Object obj) {
        int indexOf = this.c.indexOf((qf0) obj);
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
        qf0 qf0Var = (qf0) this.c.get(i7);
        int k10 = k(i7);
        tf0 tf0Var = this.h;
        boolean z11 = tf0Var.i1;
        SparseArray sparseArray2 = tf0Var.d1;
        ArrayList arrayList = tf0Var.b1;
        ArrayList arrayList2 = tf0Var.a1;
        ArrayList arrayList3 = tf0Var.X0;
        ArrayList arrayList4 = tf0Var.Y0;
        ArrayList arrayList5 = tf0Var.Z0;
        ArrayList arrayList6 = tf0Var.W0;
        Context context = this.e;
        if (z11 && k10 == 0) {
            qf0Var.a = true;
            if (qf0Var.b == null) {
                qf0Var.b = new rf0(context);
            }
            if (qf0Var.b.getParent() == null) {
                kVar.addView(qf0Var.b);
            }
            return qf0Var;
        }
        qf0Var.a = false;
        rf0 rf0Var = qf0Var.b;
        if (rf0Var != null && rf0Var.getParent() != null) {
            kVar.removeView(qf0Var.b);
        }
        if (qf0Var.c == null) {
            of0 of0Var = new of0(tf0Var, context, i7, this.f);
            qf0Var.c = of0Var;
            this.d.set(i7, of0Var);
        }
        if (qf0Var.c.getParent() == null) {
            kVar.addView(qf0Var.c);
        }
        qf0Var.c.getImageReceiver().w0 = true;
        int i11 = tf0Var.i1 ? k10 - 1 : k10;
        if (i11 != 0) {
            i10 = k10;
            sparseArray = sparseArray2;
            if (i11 >= 0 && i11 < arrayList6.size()) {
                org.telegram.messenger.hc hcVar = (org.telegram.messenger.hc) arrayList6.get(i11);
                qf0Var.c.L = hcVar != null;
                z9 = arrayList5.get(i11) == null;
                org.telegram.messenger.hc hcVar2 = (org.telegram.messenger.hc) arrayList4.get(i11);
                qf0Var.c.q((e51) arrayList5.get(i11), hcVar, null, (org.telegram.messenger.hc) arrayList3.get(i11), (org.telegram.messenger.hc) arrayList4.get(i11), (hcVar2 == null || !(hcVar2.k instanceof TLRPC.TL_photoStrippedSize)) ? null : "b", ((Integer) arrayList2.get(i11)).intValue(), "avatar_" + tf0Var.E0);
                if ((i11 >= 0 || i11 >= arrayList.size() || arrayList.get(i11) == null) ? z9 : true) {
                }
                qf0Var.c.getImageReceiver().g1 = new n(this);
                qf0Var.c.getImageReceiver().k1 = (byte) 2;
                of0 of0Var2 = qf0Var.c;
                int i12 = tf0Var.m1;
                int i13 = tf0Var.n1;
                of0Var2.t(i12, i12, i13, i13);
                qf0Var.c.setTag(Integer.valueOf(i10));
                return qf0Var;
            }
            z9 = false;
            if ((i11 >= 0 || i11 >= arrayList.size() || arrayList.get(i11) == null) ? z9 : true) {
            }
            qf0Var.c.getImageReceiver().g1 = new n(this);
            qf0Var.c.getImageReceiver().k1 = (byte) 2;
            of0 of0Var22 = qf0Var.c;
            int i122 = tf0Var.m1;
            int i132 = tf0Var.n1;
            of0Var22.t(i122, i122, i132, i132);
            qf0Var.c.setTag(Integer.valueOf(i10));
            return qf0Var;
        }
        l9 l9Var = this.g;
        Drawable t6 = l9Var == null ? null : l9Var.getImageReceiver().t();
        if (t6 instanceof v5) {
            v5 v5Var = (v5) t6;
            if (v5Var.s()) {
                qf0Var.c.setImageDrawable(t6);
                v5Var.f(qf0Var.c);
                v5Var.R = true;
                i10 = k10;
                sparseArray = sparseArray2;
                z9 = false;
                if ((i11 >= 0 || i11 >= arrayList.size() || arrayList.get(i11) == null) ? z9 : true) {
                    SparseArray sparseArray3 = sparseArray;
                    qf0Var.c.H = (RadialProgress2) sparseArray3.get(i11);
                    of0 of0Var3 = qf0Var.c;
                    if (of0Var3.H == null) {
                        of0Var3.H = new RadialProgress2(of0Var3, null);
                        RadialProgress2 radialProgress2 = qf0Var.c.H;
                        radialProgress2.E = 0.0f;
                        radialProgress2.setIcon(10, false, false);
                        qf0Var.c.H.setColors(1107296256, 1107296256, -1, -1);
                        sparseArray3.append(i11, qf0Var.c.H);
                    }
                    if (tf0Var.g1) {
                        tf0Var.invalidate();
                    } else {
                        tf0Var.postInvalidateOnAnimation();
                    }
                }
                qf0Var.c.getImageReceiver().g1 = new n(this);
                qf0Var.c.getImageReceiver().k1 = (byte) 2;
                of0 of0Var222 = qf0Var.c;
                int i1222 = tf0Var.m1;
                int i1322 = tf0Var.n1;
                of0Var222.t(i1222, i1222, i1322, i1322);
                qf0Var.c.setTag(Integer.valueOf(i10));
                return qf0Var;
            }
        }
        if (i11 >= 0 && i11 < arrayList6.size()) {
            org.telegram.messenger.hc hcVar3 = (org.telegram.messenger.hc) arrayList6.get(i11);
            qf0Var.c.L = hcVar3 != null;
            boolean z12 = arrayList5.get(i11) == null;
            if (!tf0Var.J0 || hcVar3 == null) {
                z10 = z12;
            } else {
                z10 = z12;
                if (hcVar3.p == 2) {
                    str = "avatar";
                    org.telegram.messenger.hc hcVar4 = (org.telegram.messenger.hc) arrayList4.get(i11);
                    l9 l9Var2 = this.g;
                    i10 = k10;
                    n10 = (l9Var2 == null && tf0Var.e1) ? l9Var2.getImageReceiver().n() : null;
                    StringBuilder sb2 = new StringBuilder("avatar_");
                    sparseArray = sparseArray2;
                    sb2.append(tf0Var.E0);
                    String sb3 = sb2.toString();
                    if (n10 == null && arrayList5.get(i11) == null) {
                        of0 of0Var4 = qf0Var.c;
                        org.telegram.messenger.hc hcVar5 = (org.telegram.messenger.hc) arrayList6.get(i11);
                        org.telegram.messenger.hc hcVar6 = (org.telegram.messenger.hc) arrayList3.get(i11);
                        int intValue = ((Integer) arrayList2.get(i11)).intValue();
                        of0Var4.getClass();
                        of0Var4.a.u0(hcVar5, str, hcVar6, null, null, null, new BitmapDrawable((Resources) null, n10), intValue, null, sb3, 1);
                        of0Var4.d();
                    } else if (tf0Var.K0 == null) {
                        qf0Var.c.q((e51) arrayList5.get(i11), (org.telegram.messenger.hc) arrayList6.get(i11), str, (org.telegram.messenger.hc) arrayList3.get(i11), tf0Var.K0, null, ((Integer) arrayList2.get(i11)).intValue(), sb3);
                    } else {
                        qf0Var.c.q((e51) arrayList5.get(i11), hcVar3, null, (org.telegram.messenger.hc) arrayList3.get(i11), (org.telegram.messenger.hc) arrayList4.get(i11), (hcVar4 == null || !(hcVar4.k instanceof TLRPC.TL_photoStrippedSize)) ? null : "b", ((Integer) arrayList2.get(i11)).intValue(), sb3);
                    }
                    z9 = z10;
                    if ((i11 >= 0 || i11 >= arrayList.size() || arrayList.get(i11) == null) ? z9 : true) {
                    }
                    qf0Var.c.getImageReceiver().g1 = new n(this);
                    qf0Var.c.getImageReceiver().k1 = (byte) 2;
                    of0 of0Var2222 = qf0Var.c;
                    int i12222 = tf0Var.m1;
                    int i13222 = tf0Var.n1;
                    of0Var2222.t(i12222, i12222, i13222, i13222);
                    qf0Var.c.setTag(Integer.valueOf(i10));
                    return qf0Var;
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
            sb22.append(tf0Var.E0);
            String sb32 = sb22.toString();
            if (n10 == null) {
            }
            if (tf0Var.K0 == null) {
            }
            z9 = z10;
            if ((i11 >= 0 || i11 >= arrayList.size() || arrayList.get(i11) == null) ? z9 : true) {
            }
            qf0Var.c.getImageReceiver().g1 = new n(this);
            qf0Var.c.getImageReceiver().k1 = (byte) 2;
            of0 of0Var22222 = qf0Var.c;
            int i122222 = tf0Var.m1;
            int i132222 = tf0Var.n1;
            of0Var22222.t(i122222, i122222, i132222, i132222);
            qf0Var.c.setTag(Integer.valueOf(i10));
            return qf0Var;
        }
        i10 = k10;
        sparseArray = sparseArray2;
        z9 = false;
        if ((i11 >= 0 || i11 >= arrayList.size() || arrayList.get(i11) == null) ? z9 : true) {
        }
        qf0Var.c.getImageReceiver().g1 = new n(this);
        qf0Var.c.getImageReceiver().k1 = (byte) 2;
        of0 of0Var222222 = qf0Var.c;
        int i1222222 = tf0Var.m1;
        int i1322222 = tf0Var.n1;
        of0Var222222.t(i1222222, i1222222, i1322222, i1322222);
        qf0Var.c.setTag(Integer.valueOf(i10));
        return qf0Var;
    }

    @Override // c5.a
    public final boolean f(View view, Object obj) {
        qf0 qf0Var = (qf0) obj;
        return qf0Var.a ? view == qf0Var.b : view == qf0Var.c;
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
        tf0 tf0Var = this.h;
        int size = tf0Var.X0.size();
        if (tf0Var.i1) {
            size++;
        }
        org.telegram.messenger.yo yoVar = tf0Var.S0;
        int j3 = (j() * 2) + Math.max(yoVar == null ? 0 : yoVar.b.size(), size);
        for (int i10 = 0; i10 < j3; i10++) {
            arrayList2.add(new qf0());
            arrayList.add(null);
        }
        super.g();
    }

    @Override // org.telegram.ui.Components.ep
    public final int j() {
        tf0 tf0Var = this.h;
        int size = tf0Var.X0.size();
        if (tf0Var.i1) {
            size++;
        }
        if (size >= 2) {
            return tf0Var.getOffscreenPageLimit();
        }
        return 0;
    }
}
