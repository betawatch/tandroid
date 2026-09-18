package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.UserConfig;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
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
        ky.E(kyVar, new uw(3, this, arrayList), arrayList, true);
    }

    @Override // java.lang.Runnable
    public final void run() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        String str = this.a.v;
        uw uwVar = new uw(2, this, str);
        if (Emoji.fullyConsistsOfEmojis(str)) {
            ix0.y3.fetch(UserConfig.selectedAccount, str, new org.telegram.ui.of(15, linkedHashSet, uwVar));
        } else {
            uwVar.run();
        }
    }
}
