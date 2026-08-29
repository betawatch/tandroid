package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.UserConfig;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class dy implements sy {
    public final /* synthetic */ ey a;

    public dy(ey eyVar) {
        this.a = eyVar;
    }

    @Override // org.telegram.ui.Components.sy
    public final void d() {
        ey eyVar = this.a;
        if (eyVar.B.R.B) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        eyVar.B.R.e(true);
        ey.E(eyVar, new gt(8, this, arrayList), arrayList, true);
    }

    @Override // java.lang.Runnable
    public final void run() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        String str = this.a.v;
        gt gtVar = new gt(7, this, str);
        if (Emoji.fullyConsistsOfEmojis(str)) {
            ow0.u3.fetch(UserConfig.selectedAccount, str, new org.telegram.ui.tm(10, linkedHashSet, gtVar));
        } else {
            gtVar.run();
        }
    }
}
