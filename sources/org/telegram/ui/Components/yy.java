package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.UserConfig;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class yy implements nz {
    public final /* synthetic */ zy a;

    public yy(zy zyVar) {
        this.a = zyVar;
    }

    @Override // org.telegram.ui.Components.nz
    public final void d() {
        zy zyVar = this.a;
        if (zyVar.F.V.F) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        zyVar.F.V.e(true);
        zy.E(zyVar, new zr(11, this, arrayList), arrayList, true);
    }

    @Override // java.lang.Runnable
    public final void run() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        String str = this.a.v;
        zr zrVar = new zr(10, this, str);
        if (Emoji.fullyConsistsOfEmojis(str)) {
            yx0.w3.fetch(UserConfig.selectedAccount, str, new org.telegram.ui.pc(22, linkedHashSet, zrVar));
        } else {
            zrVar.run();
        }
    }
}
