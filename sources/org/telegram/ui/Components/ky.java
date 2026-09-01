package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.UserConfig;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
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
        ly.E(lyVar, new gm(16, this, arrayList), arrayList, true);
    }

    @Override // java.lang.Runnable
    public final void run() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        String str = this.a.v;
        gm gmVar = new gm(15, this, str);
        if (Emoji.fullyConsistsOfEmojis(str)) {
            yw0.v3.fetch(UserConfig.selectedAccount, str, new xk(2, linkedHashSet, gmVar));
        } else {
            gmVar.run();
        }
    }
}
