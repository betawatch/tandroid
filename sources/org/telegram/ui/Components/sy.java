package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.UserConfig;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class sy implements hz {
    public final /* synthetic */ ty a;

    public sy(ty tyVar) {
        this.a = tyVar;
    }

    @Override // org.telegram.ui.Components.hz
    public final void e() {
        ty tyVar = this.a;
        if (tyVar.F.V.F) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        tyVar.F.V.e(true);
        ty.E(tyVar, new yt(6, this, arrayList), arrayList, true);
    }

    @Override // java.lang.Runnable
    public final void run() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        String str = this.a.v;
        yt ytVar = new yt(5, this, str);
        if (Emoji.fullyConsistsOfEmojis(str)) {
            ux0.z3.fetch(UserConfig.selectedAccount, str, new org.telegram.ui.ActionBar.m3(28, linkedHashSet, ytVar));
        } else {
            ytVar.run();
        }
    }
}
