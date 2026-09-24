package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.UserConfig;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
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
        ly.E(lyVar, new cv(5, this, arrayList), arrayList, true);
    }

    @Override // java.lang.Runnable
    public final void run() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        String str = this.a.v;
        cv cvVar = new cv(4, this, str);
        if (Emoji.fullyConsistsOfEmojis(str)) {
            gx0.y3.fetch(UserConfig.selectedAccount, str, new org.telegram.ui.oc(22, linkedHashSet, cvVar));
        } else {
            cvVar.run();
        }
    }
}
