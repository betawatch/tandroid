package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.UserConfig;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
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
