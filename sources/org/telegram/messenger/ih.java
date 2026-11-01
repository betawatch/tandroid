package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final /* synthetic */ class ih implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ vi b;
    public final /* synthetic */ ArrayList c;

    public /* synthetic */ ih(vi viVar, ArrayList arrayList, int i10) {
        this.a = i10;
        this.b = viVar;
        this.c = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        ArrayList arrayList = this.c;
        vi viVar = this.b;
        switch (i10) {
            case 0:
                viVar.getNotificationCenter().k(56, Long.valueOf(kj.B0(((kj) arrayList.get(0)).k)), null, Boolean.TRUE, arrayList, null, 0, -1, Boolean.FALSE);
                break;
            default:
                try {
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList arrayList3 = new ArrayList();
                    a0.h hVar = new a0.h();
                    a0.h hVar2 = new a0.h();
                    for (int i11 = 0; i11 < arrayList.size(); i11++) {
                        try {
                            is.d((TLRPC.Message) arrayList.get(i11), hVar, hVar2);
                        } catch (Exception e) {
                            viVar.getMessagesStorage().o(e, true);
                        }
                    }
                    viVar.getMessagesStorage().K0(hVar, hVar2, arrayList2, arrayList3, 0);
                    break;
                } catch (Exception e7) {
                    f8.g(e7, true);
                    return;
                }
        }
    }
}
