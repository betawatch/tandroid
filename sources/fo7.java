// default package

import android.util.SparseArray;
import java.util.ArrayList;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class fo7 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ lo7 b;
    public final /* synthetic */ int c;

    public /* synthetic */ fo7(lo7 lo7Var, int i, byte b) {
        this.a = b;
        this.b = lo7Var;
        this.c = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        int i = this.c;
        lo7 lo7Var = this.b;
        switch (b) {
            case 0:
                lo7Var.getClass();
                nm7.e().k(nm7.K4, Integer.valueOf(lo7Var.currentAccount));
                lo7Var.getNotificationCenter().k(nm7.d2, Integer.valueOf(i));
                break;
            case 1:
                nm7.e().k(nm7.K4, Integer.valueOf(lo7Var.currentAccount));
                lo7Var.getNotificationCenter().k(nm7.d2, Integer.valueOf(i));
                break;
            case 2:
                nm7.e().k(nm7.K4, Integer.valueOf(lo7Var.currentAccount));
                lo7Var.getNotificationCenter().k(nm7.d2, Integer.valueOf(i));
                break;
            case 3:
                nm7.e().k(nm7.K4, Integer.valueOf(lo7Var.currentAccount));
                lo7Var.getNotificationCenter().k(nm7.d2, Integer.valueOf(i));
                break;
            case 4:
                if (lo7Var.J == 0) {
                    lo7Var.w.clear();
                    nm7.e().k(nm7.h4, new Object[0]);
                }
                nm7.e().k(nm7.K4, Integer.valueOf(lo7Var.currentAccount));
                lo7Var.getNotificationCenter().k(nm7.d2, Integer.valueOf(i));
                break;
            case 5:
                vh6 vh6Var = lo7Var.c;
                ArrayList arrayList = lo7Var.a;
                int i2 = 0;
                boolean z = false;
                while (i2 < arrayList.size()) {
                    k47 k47Var = (k47) arrayList.get(i2);
                    if (k47Var.J && Math.abs(k47Var.e1()) == i) {
                        arrayList.remove(i2);
                        SparseArray sparseArray = (SparseArray) vh6Var.f(k47.B0(k47Var.k));
                        if (sparseArray != null) {
                            sparseArray.remove(k47Var.e1());
                            if (sparseArray.size() <= 0) {
                                vh6Var.l(k47.B0(k47Var.k));
                            }
                        }
                        ArrayList arrayList2 = new ArrayList();
                        arrayList2.add(Integer.valueOf(k47Var.e1()));
                        lo7Var.getMessagesStorage().D(arrayList2, k47.B0(k47Var.k));
                        i2--;
                        z = true;
                    }
                    i2++;
                }
                if (z) {
                    lo7Var.Z(false);
                    break;
                }
                break;
            case 6:
                lo7Var.getClass();
                vh6 vh6Var2 = new vh6();
                vh6Var2.k(wpe.a(Integer.valueOf(i)), 0L);
                lo7Var.M(vh6Var2, false);
                break;
            case 7:
                if (e21.a) {
                    fc4.b("set last online from other device = " + i);
                }
                lo7Var.M = i;
                break;
            default:
                lo7Var.h(i);
                break;
        }
    }
}
