// default package

import android.util.SparseArray;
import java.util.ArrayList;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final /* synthetic */ class cm7 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ im7 b;
    public final /* synthetic */ int c;

    public /* synthetic */ cm7(im7 im7Var, int i, byte b) {
        this.a = b;
        this.b = im7Var;
        this.c = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        int i = this.c;
        im7 im7Var = this.b;
        switch (b) {
            case 0:
                im7Var.getClass();
                kk7.e().k(kk7.I4, Integer.valueOf(im7Var.currentAccount));
                im7Var.getNotificationCenter().k(kk7.c2, Integer.valueOf(i));
                break;
            case 1:
                kk7.e().k(kk7.I4, Integer.valueOf(im7Var.currentAccount));
                im7Var.getNotificationCenter().k(kk7.c2, Integer.valueOf(i));
                break;
            case 2:
                kk7.e().k(kk7.I4, Integer.valueOf(im7Var.currentAccount));
                im7Var.getNotificationCenter().k(kk7.c2, Integer.valueOf(i));
                break;
            case 3:
                kk7.e().k(kk7.I4, Integer.valueOf(im7Var.currentAccount));
                im7Var.getNotificationCenter().k(kk7.c2, Integer.valueOf(i));
                break;
            case 4:
                if (im7Var.J == 0) {
                    im7Var.w.clear();
                    kk7.e().k(kk7.f4, new Object[0]);
                }
                kk7.e().k(kk7.I4, Integer.valueOf(im7Var.currentAccount));
                im7Var.getNotificationCenter().k(kk7.c2, Integer.valueOf(i));
                break;
            case 5:
                vf6 vf6Var = im7Var.c;
                ArrayList arrayList = im7Var.a;
                int i2 = 0;
                boolean z = false;
                while (i2 < arrayList.size()) {
                    k27 k27Var = (k27) arrayList.get(i2);
                    if (k27Var.J && Math.abs(k27Var.e1()) == i) {
                        arrayList.remove(i2);
                        SparseArray sparseArray = (SparseArray) vf6Var.f(k27.B0(k27Var.k));
                        if (sparseArray != null) {
                            sparseArray.remove(k27Var.e1());
                            if (sparseArray.size() <= 0) {
                                vf6Var.l(k27.B0(k27Var.k));
                            }
                        }
                        ArrayList arrayList2 = new ArrayList();
                        arrayList2.add(Integer.valueOf(k27Var.e1()));
                        im7Var.getMessagesStorage().D(arrayList2, k27.B0(k27Var.k));
                        i2--;
                        z = true;
                    }
                    i2++;
                }
                if (z) {
                    im7Var.Z(false);
                    break;
                }
                break;
            case 6:
                im7Var.getClass();
                vf6 vf6Var2 = new vf6();
                vf6Var2.k(tne.a(Integer.valueOf(i)), 0L);
                im7Var.M(vf6Var2, false);
                break;
            case 7:
                if (w01.a) {
                    fa4.b("set last online from other device = " + i);
                }
                im7Var.M = i;
                break;
            default:
                im7Var.h(i);
                break;
        }
    }
}
