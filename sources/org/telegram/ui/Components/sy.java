package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.UserConfig;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final class sy implements hz {
    public final /* synthetic */ ty a;

    public sy(ty tyVar) {
        this.a = tyVar;
    }

    @Override // org.telegram.ui.Components.hz
    public final void e() {
        ty tyVar = this.a;
        if (tyVar.F.V.F) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        tyVar.F.V.e(true);
        ty.E(tyVar, new yt(6, this, arrayList), arrayList, true);
    }

    @Override // java.lang.Runnable
    public final void run() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        String str = this.a.v;
        yt ytVar = new yt(5, this, str);
        if (Emoji.fullyConsistsOfEmojis(str)) {
            ux0.z3.fetch(UserConfig.selectedAccount, str, new org.telegram.ui.ActionBar.m3(28, linkedHashSet, ytVar));
        } else {
            ytVar.run();
        }
    }
}
