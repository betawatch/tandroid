package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.UserConfig;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class sy implements hz {
    public final /* synthetic */ ty a;

    public sy(ty tyVar) {
        this.a = tyVar;
    }

    public final boolean a() {
        return this.a.F.V.F;
    }

    @Override // org.telegram.ui.Components.hz
    public final void e() {
        if (a()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        ty tyVar = this.a;
        tyVar.F.V.e(true);
        ty.E(tyVar, new yt(6, this, arrayList), arrayList, true);
    }

    @Override // java.lang.Runnable
    public final void run() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        String str = this.a.v;
        yt ytVar = new yt(5, this, str);
        if (Emoji.fullyConsistsOfEmojis(str)) {
            px0.w3.fetch(UserConfig.selectedAccount, str, new org.telegram.ui.ActionBar.j3(28, linkedHashSet, ytVar));
        } else {
            ytVar.run();
        }
    }
}
