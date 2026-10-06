package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.UserConfig;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public final class my implements bz {
    public final /* synthetic */ ny a;

    public my(ny nyVar) {
        this.a = nyVar;
    }

    public final boolean a() {
        return this.a.F.V.F;
    }

    @Override // org.telegram.ui.Components.bz
    public final void d() {
        if (a()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        ny nyVar = this.a;
        nyVar.F.V.e(true);
        ny.E(nyVar, new yw(3, this, arrayList), arrayList, true);
    }

    @Override // java.lang.Runnable
    public final void run() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        String str = this.a.v;
        yw ywVar = new yw(2, this, str);
        if (Emoji.fullyConsistsOfEmojis(str)) {
            sx0.F3.fetch(UserConfig.selectedAccount, str, new org.telegram.ui.qc(22, linkedHashSet, ywVar));
        } else {
            ywVar.run();
        }
    }
}
