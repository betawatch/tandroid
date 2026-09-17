package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.UserConfig;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes3.dex */
public final class jy implements yy {
    public final /* synthetic */ ky a;

    public jy(ky kyVar) {
        this.a = kyVar;
    }

    @Override // org.telegram.ui.Components.yy
    public final void d() {
        ky kyVar = this.a;
        if (kyVar.F.V.F) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        kyVar.F.V.e(true);
        ky.E(kyVar, new zu(5, this, arrayList), arrayList, true);
    }

    @Override // java.lang.Runnable
    public final void run() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        String str = this.a.v;
        zu zuVar = new zu(4, this, str);
        if (Emoji.fullyConsistsOfEmojis(str)) {
            vw0.y3.fetch(UserConfig.selectedAccount, str, new org.telegram.ui.nf(15, linkedHashSet, zuVar));
        } else {
            zuVar.run();
        }
    }
}
