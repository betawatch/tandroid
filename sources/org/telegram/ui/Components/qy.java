package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.UserConfig;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class qy implements fz {
    public final /* synthetic */ ry a;

    public qy(ry ryVar) {
        this.a = ryVar;
    }

    @Override // org.telegram.ui.Components.fz
    public final void d() {
        ry ryVar = this.a;
        if (ryVar.F.V.F) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        ryVar.F.V.e(true);
        ry.E(ryVar, new hy(2, this, arrayList), arrayList, true);
    }

    @Override // java.lang.Runnable
    public final void run() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        String str = this.a.v;
        hy hyVar = new hy(1, this, str);
        if (Emoji.fullyConsistsOfEmojis(str)) {
            hx0.y3.fetch(UserConfig.selectedAccount, str, new org.telegram.ui.pf(15, linkedHashSet, hyVar));
        } else {
            hyVar.run();
        }
    }
}
