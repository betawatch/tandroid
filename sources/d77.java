// default package

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.ui.SecretMediaViewer;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final /* synthetic */ class d77 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ uc7 b;
    public final /* synthetic */ zh6 c;
    public final /* synthetic */ zh6 d;

    public /* synthetic */ d77(uc7 uc7Var, zh6 zh6Var, zh6 zh6Var2, byte b) {
        this.a = b;
        this.b = uc7Var;
        this.c = zh6Var;
        this.d = zh6Var2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        ArrayList arrayList;
        boolean z2 = false;
        byte b = 1;
        switch (this.a) {
            case 0:
                uc7 uc7Var = this.b;
                zh6 zh6Var = this.c;
                zh6 zh6Var2 = this.d;
                if (zh6Var != null) {
                    int i = 0;
                    for (int m = zh6Var.m(); i < m; m = m) {
                        ArrayList arrayList2 = (ArrayList) zh6Var.n(i);
                        uc7Var.Y(arrayList2, null, null, zh6Var.j(i), true, 0, !arrayList2.isEmpty() && ((Integer) arrayList2.get(0)).intValue() > 0, 0L, null, 0);
                        i++;
                    }
                }
                if (zh6Var2 != null) {
                    Object[] objArr = SecretMediaViewer.e() && SecretMediaViewer.d().s;
                    r47 r47Var = objArr == true ? SecretMediaViewer.d().g0 : null;
                    int m2 = zh6Var2.m();
                    int i2 = 0;
                    while (i2 < m2) {
                        long j = zh6Var2.j(i2);
                        ArrayList arrayList3 = (ArrayList) zh6Var2.n(i2);
                        if (objArr == true && r47Var != null && r47Var.K1 == uc7Var.currentAccount && r47.B0(r47Var.k) == j && arrayList3.contains(Integer.valueOf(r47Var.e1()))) {
                            int e1 = r47Var.e1();
                            arrayList3.remove(Integer.valueOf(e1));
                            r47Var.I0 = true;
                            long T = uc7Var.T(e1, j);
                            arrayList = arrayList3;
                            uc7 uc7Var2 = uc7Var;
                            z = z2;
                            uc7Var = uc7Var2;
                            SecretMediaViewer.d().o1 = new m30((rf0) uc7Var2, T, j, e1, (byte) 4);
                            jn7 notificationCenter = uc7Var.getNotificationCenter();
                            Object[] objArr2 = new Object[1];
                            objArr2[z ? 1 : 0] = r47Var.k;
                            notificationCenter.k(49, objArr2);
                        } else {
                            z = z2;
                            arrayList = arrayList3;
                        }
                        if (!arrayList.isEmpty()) {
                            jf7 messagesStorage = uc7Var.getMessagesStorage();
                            messagesStorage.a.c(new se7(messagesStorage, arrayList, j, (byte) 1));
                        }
                        i2++;
                        z2 = z;
                    }
                }
                Utilities.d.c(new d77(uc7Var, zh6Var, zh6Var2, (byte) 3));
                break;
            case 1:
                uc7 uc7Var3 = this.b;
                zh6 zh6Var3 = this.c;
                zh6 zh6Var4 = this.d;
                uc7Var3.X = zh6Var3;
                uc7Var3.Y = zh6Var4;
                break;
            case 2:
                uc7 uc7Var4 = this.b;
                zh6 zh6Var5 = this.c;
                zh6 zh6Var6 = this.d;
                uc7Var4.M1 = true;
                jf7 messagesStorage2 = uc7Var4.getMessagesStorage();
                messagesStorage2.a.c(new fd7(messagesStorage2, zh6Var5, zh6Var6, b));
                break;
            default:
                uc7 uc7Var5 = this.b;
                Utilities.d.c(new d77(uc7Var5, this.c, this.d, (byte) 2));
                uc7Var5.N1 = 0;
                uc7Var5.O1 = null;
                uc7Var5.P1 = null;
                break;
        }
    }
}
