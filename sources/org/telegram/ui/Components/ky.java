package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.UserConfig;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class ky implements zy {
    public final /* synthetic */ ly a;

    public ky(ly lyVar) {
        this.a = lyVar;
    }

    @Override // org.telegram.ui.Components.zy
    public final void d() {
        ly lyVar = this.a;
        if (lyVar.F.V.F) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        lyVar.F.V.e(true);
        ly.E(lyVar, new vw(4, this, arrayList), arrayList, true);
    }

    @Override // java.lang.Runnable
    public final void run() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        String str = this.a.v;
        vw vwVar = new vw(3, this, str);
        if (Emoji.fullyConsistsOfEmojis(str)) {
            gx0.y3.fetch(UserConfig.selectedAccount, str, new org.telegram.ui.oc(22, linkedHashSet, vwVar));
        } else {
            vwVar.run();
        }
    }
}
