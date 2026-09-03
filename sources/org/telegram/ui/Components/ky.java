package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.UserConfig;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class ky implements zy {
    public final /* synthetic */ ly a;

    public ky(ly lyVar) {
        this.a = lyVar;
    }

    @Override // org.telegram.ui.Components.zy
    public final void d() {
        ly lyVar = this.a;
        if (lyVar.C.S.C) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        lyVar.C.S.e(true);
        ly.E(lyVar, new eo(15, this, arrayList), arrayList, true);
    }

    @Override // java.lang.Runnable
    public final void run() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        String str = this.a.v;
        eo eoVar = new eo(14, this, str);
        if (Emoji.fullyConsistsOfEmojis(str)) {
            xw0.v3.fetch(UserConfig.selectedAccount, str, new xk(2, linkedHashSet, eoVar));
        } else {
            eoVar.run();
        }
    }
}
