package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.UserConfig;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class jy implements yy {
    public final /* synthetic */ ky a;

    public jy(ky kyVar) {
        this.a = kyVar;
    }

    @Override // org.telegram.ui.Components.yy
    public final void d() {
        ky kyVar = this.a;
        if (kyVar.F.V.F) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        kyVar.F.V.e(true);
        ky.E(kyVar, new bv(5, this, arrayList), arrayList, true);
    }

    @Override // java.lang.Runnable
    public final void run() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        String str = this.a.v;
        bv bvVar = new bv(4, this, str);
        if (Emoji.fullyConsistsOfEmojis(str)) {
            jx0.y3.fetch(UserConfig.selectedAccount, str, new org.telegram.ui.of(15, linkedHashSet, bvVar));
        } else {
            bvVar.run();
        }
    }
}
