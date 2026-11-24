// default package

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.ui.SecretMediaViewer;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final /* synthetic */ class b57 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ na7 b;
    public final /* synthetic */ vf6 c;
    public final /* synthetic */ vf6 d;

    public /* synthetic */ b57(na7 na7Var, vf6 vf6Var, vf6 vf6Var2, byte b) {
        this.a = b;
        this.b = na7Var;
        this.c = vf6Var;
        this.d = vf6Var2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        ArrayList arrayList;
        boolean z2 = false;
        switch (this.a) {
            case 0:
                na7 na7Var = this.b;
                vf6 vf6Var = this.c;
                vf6 vf6Var2 = this.d;
                if (vf6Var != null) {
                    int i = 0;
                    for (int m = vf6Var.m(); i < m; m = m) {
                        ArrayList arrayList2 = (ArrayList) vf6Var.n(i);
                        na7Var.W(arrayList2, null, null, vf6Var.j(i), true, 0, !arrayList2.isEmpty() && ((Integer) arrayList2.get(0)).intValue() > 0, 0L, null, 0);
                        i++;
                    }
                }
                if (vf6Var2 != null) {
                    Object[] objArr = SecretMediaViewer.e() && SecretMediaViewer.d().s;
                    k27 k27Var = objArr == true ? SecretMediaViewer.d().g0 : null;
                    int m2 = vf6Var2.m();
                    int i2 = 0;
                    while (i2 < m2) {
                        long j = vf6Var2.j(i2);
                        ArrayList arrayList3 = (ArrayList) vf6Var2.n(i2);
                        if (objArr == true && k27Var != null && k27Var.K1 == na7Var.currentAccount && k27.B0(k27Var.k) == j && arrayList3.contains(Integer.valueOf(k27Var.e1()))) {
                            int e1 = k27Var.e1();
                            arrayList3.remove(Integer.valueOf(e1));
                            k27Var.I0 = true;
                            long R = na7Var.R(e1, j);
                            arrayList = arrayList3;
                            na7 na7Var2 = na7Var;
                            z = z2;
                            na7Var = na7Var2;
                            SecretMediaViewer.d().o1 = new l30((pf0) na7Var2, R, j, e1, (byte) 4);
                            kk7 notificationCenter = na7Var.getNotificationCenter();
                            Object[] objArr2 = new Object[1];
                            objArr2[z ? 1 : 0] = k27Var.k;
                            notificationCenter.k(48, objArr2);
                        } else {
                            z = z2;
                            arrayList = arrayList3;
                        }
                        if (!arrayList.isEmpty()) {
                            ad7 messagesStorage = na7Var.getMessagesStorage();
                            messagesStorage.a.c(new jc7(messagesStorage, arrayList, j, (byte) 2));
                        }
                        i2++;
                        z2 = z;
                    }
                }
                Utilities.d.c(new b57(na7Var, vf6Var, vf6Var2, (byte) 3));
                break;
            case 1:
                na7 na7Var3 = this.b;
                vf6 vf6Var3 = this.c;
                vf6 vf6Var4 = this.d;
                na7Var3.X = vf6Var3;
                na7Var3.Y = vf6Var4;
                break;
            case 2:
                na7 na7Var4 = this.b;
                vf6 vf6Var5 = this.c;
                vf6 vf6Var6 = this.d;
                na7Var4.M1 = true;
                ad7 messagesStorage2 = na7Var4.getMessagesStorage();
                messagesStorage2.a.c(new lo6(messagesStorage2, vf6Var5, vf6Var6, (byte) 25));
                break;
            default:
                na7 na7Var5 = this.b;
                Utilities.d.c(new b57(na7Var5, this.c, this.d, (byte) 2));
                na7Var5.N1 = 0;
                na7Var5.O1 = null;
                na7Var5.P1 = null;
                break;
        }
    }
}
