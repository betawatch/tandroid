package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.UserConfig;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
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
            ww0.y3.fetch(UserConfig.selectedAccount, str, new org.telegram.ui.nf(15, linkedHashSet, ohVar));
        } else {
            ohVar.run();
        }
    }
}
