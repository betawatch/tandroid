// default package

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.RadialProgress2;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class dt8 extends gi2 {
    public final ArrayList c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public final Context e;
    public final Paint f;
    public de0 g;
    public final /* synthetic */ et8 h;

    public dt8(et8 et8Var, Context context, iq8 iq8Var) {
        this.h = et8Var;
        this.e = context;
        this.g = iq8Var;
        Paint paint = new Paint(1);
        this.f = paint;
        paint.setColor(-16777216);
    }

    @Override // vu7
    public final void a(fic ficVar, Object obj) {
        bt8 bt8Var = (bt8) obj;
        View view = bt8Var.b;
        if (view != null) {
            ficVar.removeView(view);
        }
        if (bt8Var.a) {
            return;
        }
        zs8 zs8Var = bt8Var.c;
        if (zs8Var.getImageReceiver().n0 != null) {
            Drawable t = zs8Var.getImageReceiver().t();
            if (t instanceof lm) {
                ((lm) t).w(zs8Var);
            }
        }
        zs8Var.setRoundRadius(0);
        ficVar.removeView(zs8Var);
        zs8Var.getImageReceiver().c();
    }

    @Override // vu7
    public final int b() {
        return this.c.size();
    }

    @Override // vu7
    public final int c(Object obj) {
        int indexOf = this.c.indexOf((bt8) obj);
        if (indexOf == -1) {
            return -2;
        }
        return indexOf;
    }

    @Override // vu7
    public final CharSequence d(int i) {
        return (k(i) + 1) + "/" + this.h.getRealCount();
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01ac  */
    @Override // vu7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(fic ficVar, int i) {
        int i2;
        SparseArray sparseArray;
        boolean z;
        boolean z2;
        String str;
        Bitmap n;
        bt8 bt8Var = (bt8) this.c.get(i);
        int k = k(i);
        et8 et8Var = this.h;
        boolean z3 = et8Var.j1;
        SparseArray sparseArray2 = et8Var.e1;
        ArrayList arrayList = et8Var.c1;
        ArrayList arrayList2 = et8Var.b1;
        ArrayList arrayList3 = et8Var.Y0;
        ArrayList arrayList4 = et8Var.Z0;
        ArrayList arrayList5 = et8Var.a1;
        ArrayList arrayList6 = et8Var.X0;
        Context context = this.e;
        if (z3 && k == 0) {
            bt8Var.a = true;
            ct8 ct8Var = bt8Var.b;
            if (ct8Var == null) {
                ct8Var = new ct8(context);
                bt8Var.b = ct8Var;
            }
            if (ct8Var.getParent() == null) {
                ficVar.addView(bt8Var.b);
            }
            return bt8Var;
        }
        bt8Var.a = false;
        ct8 ct8Var2 = bt8Var.b;
        if (ct8Var2 != null && ct8Var2.getParent() != null) {
            ficVar.removeView(bt8Var.b);
        }
        if (bt8Var.c == null) {
            zs8 zs8Var = new zs8(et8Var, context, i, this.f);
            bt8Var.c = zs8Var;
            this.d.set(i, zs8Var);
        }
        if (bt8Var.c.getParent() == null) {
            ficVar.addView(bt8Var.c);
        }
        bt8Var.c.getImageReceiver().x0 = true;
        int i3 = et8Var.j1 ? k - 1 : k;
        if (i3 != 0) {
            i2 = k;
            sparseArray = sparseArray2;
            if (i3 >= 0 && i3 < arrayList6.size()) {
                jn5 jn5Var = (jn5) arrayList6.get(i3);
                bt8Var.c.M = jn5Var != null;
                z = arrayList5.get(i3) == null;
                jn5 jn5Var2 = (jn5) arrayList4.get(i3);
                String str2 = (jn5Var2 == null || !(jn5Var2.k instanceof TLRPC.TL_photoStrippedSize)) ? null : "b";
                String str3 = "avatar_" + et8Var.F0;
                zs8 zs8Var2 = bt8Var.c;
                idc idcVar = (idc) arrayList5.get(i3);
                jn5 jn5Var3 = (jn5) arrayList3.get(i3);
                jn5 jn5Var4 = (jn5) arrayList4.get(i3);
                int intValue = ((Integer) arrayList2.get(i3)).intValue();
                ImageReceiver imageReceiver = zs8Var2.a;
                if (idcVar != null) {
                    imageReceiver.g0(idcVar);
                } else {
                    imageReceiver.Y(jn5Var, null, jn5Var3, null, jn5Var4, str2, null, intValue, null, str3, 1);
                }
                zs8Var2.e();
                if ((i3 >= 0 || i3 >= arrayList.size() || arrayList.get(i3) == null) ? z : true) {
                }
                bt8Var.c.getImageReceiver().h1 = new v34(this, (byte) 28);
                bt8Var.c.getImageReceiver().l1 = (byte) 2;
                zs8 zs8Var3 = bt8Var.c;
                int i4 = et8Var.n1;
                int i5 = et8Var.o1;
                zs8Var3.s(i4, i4, i5, i5);
                bt8Var.c.setTag(Integer.valueOf(i2));
                return bt8Var;
            }
            z = false;
            if ((i3 >= 0 || i3 >= arrayList.size() || arrayList.get(i3) == null) ? z : true) {
            }
            bt8Var.c.getImageReceiver().h1 = new v34(this, (byte) 28);
            bt8Var.c.getImageReceiver().l1 = (byte) 2;
            zs8 zs8Var32 = bt8Var.c;
            int i42 = et8Var.n1;
            int i52 = et8Var.o1;
            zs8Var32.s(i42, i42, i52, i52);
            bt8Var.c.setTag(Integer.valueOf(i2));
            return bt8Var;
        }
        de0 de0Var = this.g;
        Drawable t = de0Var == null ? null : de0Var.getImageReceiver().t();
        if (t instanceof lm) {
            lm lmVar = (lm) t;
            if (lmVar.s()) {
                bt8Var.c.setImageDrawable(t);
                lmVar.f(bt8Var.c);
                lmVar.S = true;
                i2 = k;
                sparseArray = sparseArray2;
                z = false;
                if ((i3 >= 0 || i3 >= arrayList.size() || arrayList.get(i3) == null) ? z : true) {
                    SparseArray sparseArray3 = sparseArray;
                    bt8Var.c.I = (RadialProgress2) sparseArray3.get(i3);
                    zs8 zs8Var4 = bt8Var.c;
                    if (zs8Var4.I == null) {
                        zs8Var4.I = new RadialProgress2(zs8Var4, null);
                        RadialProgress2 radialProgress2 = bt8Var.c.I;
                        radialProgress2.E = 0.0f;
                        radialProgress2.setIcon(10, false, false);
                        bt8Var.c.I.setColors(1107296256, 1107296256, -1, -1);
                        sparseArray3.append(i3, bt8Var.c.I);
                    }
                    if (et8Var.h1) {
                        et8Var.invalidate();
                    } else {
                        et8Var.postInvalidateOnAnimation();
                    }
                }
                bt8Var.c.getImageReceiver().h1 = new v34(this, (byte) 28);
                bt8Var.c.getImageReceiver().l1 = (byte) 2;
                zs8 zs8Var322 = bt8Var.c;
                int i422 = et8Var.n1;
                int i522 = et8Var.o1;
                zs8Var322.s(i422, i422, i522, i522);
                bt8Var.c.setTag(Integer.valueOf(i2));
                return bt8Var;
            }
        }
        if (i3 >= 0 && i3 < arrayList6.size()) {
            jn5 jn5Var5 = (jn5) arrayList6.get(i3);
            bt8Var.c.M = jn5Var5 != null;
            boolean z4 = arrayList5.get(i3) == null;
            if (!et8Var.K0 || jn5Var5 == null) {
                z2 = z4;
            } else {
                z2 = z4;
                if (jn5Var5.p == 2) {
                    str = "avatar";
                    jn5 jn5Var6 = (jn5) arrayList4.get(i3);
                    de0 de0Var2 = this.g;
                    i2 = k;
                    n = (de0Var2 == null && et8Var.f1) ? de0Var2.getImageReceiver().n() : null;
                    StringBuilder sb = new StringBuilder("avatar_");
                    sparseArray = sparseArray2;
                    sb.append(et8Var.F0);
                    String sb2 = sb.toString();
                    if (n == null && arrayList5.get(i3) == null) {
                        zs8 zs8Var5 = bt8Var.c;
                        jn5 jn5Var7 = (jn5) arrayList6.get(i3);
                        jn5 jn5Var8 = (jn5) arrayList3.get(i3);
                        int intValue2 = ((Integer) arrayList2.get(i3)).intValue();
                        zs8Var5.getClass();
                        zs8Var5.a.Y(jn5Var7, str, jn5Var8, null, null, null, new BitmapDrawable((Resources) null, n), intValue2, null, sb2, 1);
                        zs8Var5.e();
                    } else if (et8Var.L0 == null) {
                        zs8 zs8Var6 = bt8Var.c;
                        idc idcVar2 = (idc) arrayList5.get(i3);
                        jn5 jn5Var9 = (jn5) arrayList6.get(i3);
                        jn5 jn5Var10 = (jn5) arrayList3.get(i3);
                        jn5 jn5Var11 = et8Var.L0;
                        int intValue3 = ((Integer) arrayList2.get(i3)).intValue();
                        ImageReceiver imageReceiver2 = zs8Var6.a;
                        if (idcVar2 != null) {
                            imageReceiver2.g0(idcVar2);
                        } else {
                            imageReceiver2.Y(jn5Var9, str, jn5Var10, null, jn5Var11, null, null, intValue3, null, sb2, 1);
                        }
                        zs8Var6.e();
                    } else {
                        String str4 = (jn5Var6 == null || !(jn5Var6.k instanceof TLRPC.TL_photoStrippedSize)) ? null : "b";
                        zs8 zs8Var7 = bt8Var.c;
                        idc idcVar3 = (idc) arrayList5.get(i3);
                        jn5 jn5Var12 = (jn5) arrayList3.get(i3);
                        jn5 jn5Var13 = (jn5) arrayList4.get(i3);
                        int intValue4 = ((Integer) arrayList2.get(i3)).intValue();
                        ImageReceiver imageReceiver3 = zs8Var7.a;
                        if (idcVar3 != null) {
                            imageReceiver3.g0(idcVar3);
                        } else {
                            imageReceiver3.Y(jn5Var5, null, jn5Var12, null, jn5Var13, str4, null, intValue4, null, sb2, 1);
                        }
                        zs8Var7.e();
                    }
                    z = z2;
                    if ((i3 >= 0 || i3 >= arrayList.size() || arrayList.get(i3) == null) ? z : true) {
                    }
                    bt8Var.c.getImageReceiver().h1 = new v34(this, (byte) 28);
                    bt8Var.c.getImageReceiver().l1 = (byte) 2;
                    zs8 zs8Var3222 = bt8Var.c;
                    int i4222 = et8Var.n1;
                    int i5222 = et8Var.o1;
                    zs8Var3222.s(i4222, i4222, i5222, i5222);
                    bt8Var.c.setTag(Integer.valueOf(i2));
                    return bt8Var;
                }
            }
            str = null;
            jn5 jn5Var62 = (jn5) arrayList4.get(i3);
            de0 de0Var22 = this.g;
            i2 = k;
            if (de0Var22 == null) {
            }
            StringBuilder sb3 = new StringBuilder("avatar_");
            sparseArray = sparseArray2;
            sb3.append(et8Var.F0);
            String sb22 = sb3.toString();
            if (n == null) {
            }
            if (et8Var.L0 == null) {
            }
            z = z2;
            if ((i3 >= 0 || i3 >= arrayList.size() || arrayList.get(i3) == null) ? z : true) {
            }
            bt8Var.c.getImageReceiver().h1 = new v34(this, (byte) 28);
            bt8Var.c.getImageReceiver().l1 = (byte) 2;
            zs8 zs8Var32222 = bt8Var.c;
            int i42222 = et8Var.n1;
            int i52222 = et8Var.o1;
            zs8Var32222.s(i42222, i42222, i52222, i52222);
            bt8Var.c.setTag(Integer.valueOf(i2));
            return bt8Var;
        }
        i2 = k;
        sparseArray = sparseArray2;
        z = false;
        if ((i3 >= 0 || i3 >= arrayList.size() || arrayList.get(i3) == null) ? z : true) {
        }
        bt8Var.c.getImageReceiver().h1 = new v34(this, (byte) 28);
        bt8Var.c.getImageReceiver().l1 = (byte) 2;
        zs8 zs8Var322222 = bt8Var.c;
        int i422222 = et8Var.n1;
        int i522222 = et8Var.o1;
        zs8Var322222.s(i422222, i422222, i522222, i522222);
        bt8Var.c.setTag(Integer.valueOf(i2));
        return bt8Var;
    }

    @Override // vu7
    public final boolean f(View view, Object obj) {
        bt8 bt8Var = (bt8) obj;
        return bt8Var.a ? view == bt8Var.b : view == bt8Var.c;
    }

    @Override // vu7
    public final void g() {
        ArrayList arrayList;
        int i = 0;
        while (true) {
            arrayList = this.d;
            if (i >= arrayList.size()) {
                break;
            }
            if (arrayList.get(i) != null) {
                ((de0) arrayList.get(i)).getImageReceiver().c();
            }
            i++;
        }
        ArrayList arrayList2 = this.c;
        arrayList2.clear();
        arrayList.clear();
        et8 et8Var = this.h;
        int size = et8Var.Y0.size();
        if (et8Var.j1) {
            size++;
        }
        dc7 dc7Var = et8Var.T0;
        int max = Math.max(dc7Var == null ? 0 : dc7Var.b.size(), size) + (j() << 1);
        for (int i2 = 0; i2 < max; i2++) {
            arrayList2.add(new bt8());
            arrayList.add(null);
        }
        super.g();
    }

    @Override // gi2
    public final int j() {
        et8 et8Var = this.h;
        int size = et8Var.Y0.size();
        if (et8Var.j1) {
            size++;
        }
        if (size >= 2) {
            return et8Var.getOffscreenPageLimit();
        }
        return 0;
    }
}
