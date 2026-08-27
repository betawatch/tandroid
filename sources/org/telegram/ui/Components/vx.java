package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.UserConfig;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class vx implements ly {
    public final /* synthetic */ wx a;

    public vx(wx wxVar) {
        this.a = wxVar;
    }

    @Override // org.telegram.ui.Components.ly
    public final void d() {
        wx wxVar = this.a;
        if (wxVar.B.R.B) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        wxVar.B.R.e(true);
        wx.E(wxVar, new xq(11, this, arrayList), arrayList, true);
    }

    @Override // java.lang.Runnable
    public final void run() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        String str = this.a.v;
        xq xqVar = new xq(10, this, str);
        if (Emoji.fullyConsistsOfEmojis(str)) {
            gw0.u3.fetch(UserConfig.selectedAccount, str, new org.telegram.ui.df(17, linkedHashSet, xqVar));
        } else {
            xqVar.run();
        }
    }
}
