package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes.dex */
public final /* synthetic */ class vv implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ xv b;
    public final /* synthetic */ ArrayList c;

    public /* synthetic */ vv(xv xvVar, ArrayList arrayList, int i7) {
        this.a = i7;
        this.b = xvVar;
        this.c = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                xv xvVar = this.b;
                xvVar.getClass();
                int i7 = 0;
                while (true) {
                    ArrayList arrayList = this.c;
                    if (i7 >= arrayList.size()) {
                        break;
                    } else {
                        fj fjVar = new fj(xvVar.currentAccount, (TLRPC.Message) arrayList.get(i7), false, true);
                        fjVar.C0 = true;
                        xvVar.getSendMessagesHelper().k0(0L, fjVar, true);
                        i7++;
                    }
                }
            default:
                xv xvVar2 = this.b;
                xvVar2.getClass();
                int i10 = 0;
                while (true) {
                    ArrayList arrayList2 = this.c;
                    if (i10 >= arrayList2.size()) {
                        break;
                    } else {
                        fj fjVar2 = (fj) xvVar2.getMessagesController().T.f(((Long) arrayList2.get(i10)).longValue());
                        if (fjVar2 != null) {
                            fjVar2.Z = true;
                        }
                        i10++;
                    }
                }
        }
    }
}
