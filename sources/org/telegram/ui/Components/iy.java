package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.UserConfig;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class iy implements xy {
    public final /* synthetic */ jy a;

    public iy(jy jyVar) {
        this.a = jyVar;
    }

    @Override // org.telegram.ui.Components.xy
    public final void d() {
        jy jyVar = this.a;
        if (jyVar.C.S.C) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        jyVar.C.S.e(true);
        jy.E(jyVar, new em(16, this, arrayList), arrayList, true);
    }

    @Override // java.lang.Runnable
    public final void run() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        String str = this.a.v;
        em emVar = new em(15, this, str);
        if (Emoji.fullyConsistsOfEmojis(str)) {
            xw0.v3.fetch(UserConfig.selectedAccount, str, new vk(2, linkedHashSet, emVar));
        } else {
            emVar.run();
        }
    }
}
