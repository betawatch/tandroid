package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.UserConfig;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
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
        jy.E(jyVar, new il(17, this, arrayList), arrayList, true);
    }

    @Override // java.lang.Runnable
    public final void run() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        String str = this.a.v;
        il ilVar = new il(16, this, str);
        if (Emoji.fullyConsistsOfEmojis(str)) {
            xw0.v3.fetch(UserConfig.selectedAccount, str, new vk(2, linkedHashSet, ilVar));
        } else {
            ilVar.run();
        }
    }
}
