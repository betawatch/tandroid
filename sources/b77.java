// default package

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.ui.SecretMediaViewer;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class b77 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ oc7 b;
    public final /* synthetic */ vh6 c;
    public final /* synthetic */ vh6 d;

    public /* synthetic */ b77(oc7 oc7Var, vh6 vh6Var, vh6 vh6Var2, byte b) {
        this.a = b;
        this.b = oc7Var;
        this.c = vh6Var;
        this.d = vh6Var2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        ArrayList arrayList;
        boolean z2 = false;
        switch (this.a) {
            case 0:
                oc7 oc7Var = this.b;
                vh6 vh6Var = this.c;
                vh6 vh6Var2 = this.d;
                if (vh6Var != null) {
                    int i = 0;
                    for (int m = vh6Var.m(); i < m; m = m) {
                        ArrayList arrayList2 = (ArrayList) vh6Var.n(i);
                        oc7Var.W(arrayList2, null, null, vh6Var.j(i), true, 0, !arrayList2.isEmpty() && ((Integer) arrayList2.get(0)).intValue() > 0, 0L, null, 0);
                        i++;
                    }
                }
                if (vh6Var2 != null) {
                    Object[] objArr = SecretMediaViewer.e() && SecretMediaViewer.d().s;
                    k47 k47Var = objArr == true ? SecretMediaViewer.d().g0 : null;
                    int m2 = vh6Var2.m();
                    int i2 = 0;
                    while (i2 < m2) {
                        long j = vh6Var2.j(i2);
                        ArrayList arrayList3 = (ArrayList) vh6Var2.n(i2);
                        if (objArr == true && k47Var != null && k47Var.K1 == oc7Var.currentAccount && k47.B0(k47Var.k) == j && arrayList3.contains(Integer.valueOf(k47Var.e1()))) {
                            int e1 = k47Var.e1();
                            arrayList3.remove(Integer.valueOf(e1));
                            k47Var.I0 = true;
                            long R = oc7Var.R(e1, j);
                            arrayList = arrayList3;
                            oc7 oc7Var2 = oc7Var;
                            z = z2;
                            oc7Var = oc7Var2;
                            SecretMediaViewer.d().o1 = new l40((pg0) oc7Var2, R, j, e1, (byte) 4);
                            nm7 notificationCenter = oc7Var.getNotificationCenter();
                            Object[] objArr2 = new Object[1];
                            objArr2[z ? 1 : 0] = k47Var.k;
                            notificationCenter.k(49, objArr2);
                        } else {
                            z = z2;
                            arrayList = arrayList3;
                        }
                        if (!arrayList.isEmpty()) {
                            cf7 messagesStorage = oc7Var.getMessagesStorage();
                            messagesStorage.a.c(new me7(messagesStorage, arrayList, j, (byte) 2));
                        }
                        i2++;
                        z2 = z;
                    }
                }
                Utilities.d.c(new b77(oc7Var, vh6Var, vh6Var2, (byte) 3));
                break;
            case 1:
                oc7 oc7Var3 = this.b;
                vh6 vh6Var3 = this.c;
                vh6 vh6Var4 = this.d;
                oc7Var3.X = vh6Var3;
                oc7Var3.Y = vh6Var4;
                break;
            case 2:
                oc7 oc7Var4 = this.b;
                vh6 vh6Var5 = this.c;
                vh6 vh6Var6 = this.d;
                oc7Var4.M1 = true;
                cf7 messagesStorage2 = oc7Var4.getMessagesStorage();
                messagesStorage2.a.c(new fp6(messagesStorage2, vh6Var5, vh6Var6, (byte) 28));
                break;
            default:
                oc7 oc7Var5 = this.b;
                Utilities.d.c(new b77(oc7Var5, this.c, this.d, (byte) 2));
                oc7Var5.N1 = 0;
                oc7Var5.O1 = null;
                oc7Var5.P1 = null;
                break;
        }
    }
}
