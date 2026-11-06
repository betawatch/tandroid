package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final /* synthetic */ class aj implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ bj b;
    public final /* synthetic */ String c;
    public final /* synthetic */ int d;

    public /* synthetic */ aj(bj bjVar, String str, int i7, int i10) {
        this.a = i10;
        this.b = bjVar;
        this.c = str;
        this.d = i7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                bj bjVar = this.b;
                String str = this.c;
                int i7 = this.d;
                bjVar.getClass();
                org.telegram.messenger.g0.h3(new aj(bjVar, str, i7, 1));
                break;
            default:
                bj bjVar2 = this.b;
                String str2 = this.c;
                int i10 = this.d;
                bjVar2.getClass();
                int i11 = org.telegram.messenger.p10.s0;
                Utilities.g.c(new li.g0(bjVar2, str2, new ArrayList(org.telegram.messenger.g5.r(i11).Y.values()), new ArrayList(org.telegram.messenger.g5.r(i11).e0), i11, i10));
                break;
        }
    }
}
