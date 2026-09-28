package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.UserConfig;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
/* loaded from: classes3.dex */
public final class ly implements az {
    public final /* synthetic */ my a;

    public ly(my myVar) {
        this.a = myVar;
    }

    @Override // org.telegram.ui.Components.az
    public final void d() {
        my myVar = this.a;
        if (myVar.F.V.F) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        myVar.F.V.e(true);
        my.E(myVar, new ww(4, this, arrayList), arrayList, true);
    }

    @Override // java.lang.Runnable
    public final void run() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        String str = this.a.v;
        ww wwVar = new ww(3, this, str);
        if (Emoji.fullyConsistsOfEmojis(str)) {
            ix0.y3.fetch(UserConfig.selectedAccount, str, new org.telegram.ui.oc(22, linkedHashSet, wwVar));
        } else {
            wwVar.run();
        }
    }
}
