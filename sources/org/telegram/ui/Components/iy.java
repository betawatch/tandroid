package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.UserConfig;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class iy implements yy {
    public final /* synthetic */ jy a;

    public iy(jy jyVar) {
        this.a = jyVar;
    }

    @Override // org.telegram.ui.Components.yy
    public final void d() {
        jy jyVar = this.a;
        if (jyVar.F.V.F) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        jyVar.F.V.e(true);
        jy.E(jyVar, new oh(29, this, arrayList), arrayList, true);
    }

    @Override // java.lang.Runnable
    public final void run() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        String str = this.a.v;
        oh ohVar = new oh(28, this, str);
        if (Emoji.fullyConsistsOfEmojis(str)) {
            xw0.y3.fetch(UserConfig.selectedAccount, str, new org.telegram.ui.pf(15, linkedHashSet, ohVar));
        } else {
            ohVar.run();
        }
    }
}
