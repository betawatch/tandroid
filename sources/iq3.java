// default package

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final /* synthetic */ class iq3 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ lq3 b;
    public final /* synthetic */ TLRPC.Document c;
    public final /* synthetic */ r47 d;

    public /* synthetic */ iq3(lq3 lq3Var, TLRPC.Document document, r47 r47Var, byte b) {
        this.a = b;
        this.b = lq3Var;
        this.c = document;
        this.d = r47Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x00e2  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        byte b;
        TLRPC.Document F0;
        TLRPC.Document F02;
        byte b2 = this.a;
        r47 r47Var = this.d;
        TLRPC.Document document = this.c;
        lq3 lq3Var = this.b;
        byte b3 = 1;
        switch (b2) {
            case 0:
                ArrayList arrayList = lq3Var.I;
                ArrayList arrayList2 = lq3Var.H;
                int i = 0;
                while (true) {
                    if (i < arrayList.size()) {
                        r47 r47Var2 = (r47) arrayList.get(i);
                        if (r47Var2 == null || (F02 = r47Var2.F0()) == null || F02.id != document.id) {
                            i++;
                        } else {
                            b = 1;
                        }
                    } else {
                        b = 0;
                    }
                }
                if (b == 0) {
                    for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                        r47 r47Var3 = (r47) arrayList2.get(i2);
                        if (r47Var3 != null && (F0 = r47Var3.F0()) != null && F0.id == document.id) {
                            if (b3 == 0) {
                                arrayList2.add(0, r47Var);
                                lq3Var.getMessagesStorage().a.c(new gq3(lq3Var, r47Var, (byte) 2));
                            }
                            lq3Var.getNotificationCenter().k(jn7.e5, new Object[0]);
                            break;
                        }
                    }
                }
                b3 = b;
                if (b3 == 0) {
                }
                lq3Var.getNotificationCenter().k(jn7.e5, new Object[0]);
                break;
            default:
                ArrayList arrayList3 = lq3Var.I;
                ArrayList arrayList4 = lq3Var.H;
                for (int i3 = 0; i3 < arrayList4.size(); i3++) {
                    if (((r47) arrayList4.get(i3)).F0() != null && ((r47) arrayList4.get(i3)).F0().id == document.id) {
                        arrayList4.remove(i3);
                        int i4 = 0;
                        while (true) {
                            if (i4 >= arrayList3.size()) {
                                arrayList3.add(0, r47Var);
                                lq3Var.J.put(r47Var.e1(), r47Var);
                                p1 p1Var = lq3Var.T;
                                hl.r(p1Var);
                                hl.d3(p1Var, 60000L);
                            } else if (((r47) arrayList3.get(i4)).F0() == null || ((r47) arrayList3.get(i4)).F0().id != document.id) {
                                i4++;
                            }
                        }
                        lq3Var.getNotificationCenter().k(jn7.e5, new Object[0]);
                        lq3Var.getMessagesStorage().a.c(new gq3(lq3Var, r47Var, b3));
                        break;
                    }
                }
                break;
        }
    }
}
