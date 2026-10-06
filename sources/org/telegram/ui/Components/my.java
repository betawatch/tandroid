package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.UserConfig;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
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
