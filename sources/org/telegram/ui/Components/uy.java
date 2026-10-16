package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.UserConfig;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class uy implements jz {
    public final /* synthetic */ vy a;

    public uy(vy vyVar) {
        this.a = vyVar;
    }

    @Override // org.telegram.ui.Components.jz
    public final void e() {
        vy vyVar = this.a;
        if (vyVar.F.V.F) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        vyVar.F.V.e(true);
        vy.E(vyVar, new vm(17, this, arrayList), arrayList, true);
    }

    @Override // java.lang.Runnable
    public final void run() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        String str = this.a.v;
        vm vmVar = new vm(16, this, str);
        if (Emoji.fullyConsistsOfEmojis(str)) {
            ux0.w3.fetch(UserConfig.selectedAccount, str, new org.telegram.ui.uc(22, linkedHashSet, vmVar));
        } else {
            vmVar.run();
        }
    }
}
