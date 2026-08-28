package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.UserConfig;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class ux implements ky {
    public final /* synthetic */ vx a;

    public ux(vx vxVar) {
        this.a = vxVar;
    }

    @Override // org.telegram.ui.Components.ky
    public final void d() {
        vx vxVar = this.a;
        if (vxVar.B.R.B) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        vxVar.B.R.e(true);
        vx.E(vxVar, new zq(11, this, arrayList), arrayList, true);
    }

    @Override // java.lang.Runnable
    public final void run() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        String str = this.a.v;
        zq zqVar = new zq(10, this, str);
        if (Emoji.fullyConsistsOfEmojis(str)) {
            ew0.u3.fetch(UserConfig.selectedAccount, str, new org.telegram.ui.df(17, linkedHashSet, zqVar));
        } else {
            zqVar.run();
        }
    }
}
