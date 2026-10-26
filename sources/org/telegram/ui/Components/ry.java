package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.UserConfig;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class ry implements gz {
    public final /* synthetic */ sy a;

    public ry(sy syVar) {
        this.a = syVar;
    }

    public final boolean a() {
        return this.a.F.V.F;
    }

    @Override // org.telegram.ui.Components.gz
    public final void e() {
        if (a()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        sy syVar = this.a;
        syVar.F.V.e(true);
        sy.E(syVar, new so(16, this, arrayList), arrayList, true);
    }

    @Override // java.lang.Runnable
    public final void run() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        String str = this.a.v;
        so soVar = new so(15, this, str);
        if (Emoji.fullyConsistsOfEmojis(str)) {
            by0.G3.fetch(UserConfig.selectedAccount, str, new oy(0, linkedHashSet, soVar));
        } else {
            soVar.run();
        }
    }
}
