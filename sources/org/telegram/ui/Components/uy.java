package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.UserConfig;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
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
        vy.E(vyVar, new sk(22, this, arrayList), arrayList, true);
    }

    @Override // java.lang.Runnable
    public final void run() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        String str = this.a.v;
        sk skVar = new sk(21, this, str);
        if (Emoji.fullyConsistsOfEmojis(str)) {
            ux0.w3.fetch(UserConfig.selectedAccount, str, new org.telegram.ui.vc(22, linkedHashSet, skVar));
        } else {
            skVar.run();
        }
    }
}
