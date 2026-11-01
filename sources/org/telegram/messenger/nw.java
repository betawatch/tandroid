package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final /* synthetic */ class nw implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ pw b;
    public final /* synthetic */ ArrayList c;

    public /* synthetic */ nw(pw pwVar, ArrayList arrayList, int i10) {
        this.a = i10;
        this.b = pwVar;
        this.c = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                pw pwVar = this.b;
                pwVar.getClass();
                int i10 = 0;
                while (true) {
                    ArrayList arrayList = this.c;
                    if (i10 >= arrayList.size()) {
                        break;
                    } else {
                        kj kjVar = new kj(pwVar.currentAccount, (TLRPC.Message) arrayList.get(i10), false, true);
                        kjVar.A0 = true;
                        pwVar.getSendMessagesHelper().k0(0L, kjVar, true);
                        i10++;
                    }
                }
            default:
                pw pwVar2 = this.b;
                pwVar2.getClass();
                int i11 = 0;
                while (true) {
                    ArrayList arrayList2 = this.c;
                    if (i11 >= arrayList2.size()) {
                        break;
                    } else {
                        kj kjVar2 = (kj) pwVar2.getMessagesController().S.f(((Long) arrayList2.get(i11)).longValue());
                        if (kjVar2 != null) {
                            kjVar2.Z = true;
                        }
                        i11++;
                    }
                }
        }
    }
}
