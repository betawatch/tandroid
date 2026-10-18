package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class i21 implements m21 {
    public final /* synthetic */ sn a;
    public final /* synthetic */ Activity b;
    public final /* synthetic */ org.telegram.ui.ActionBar.d6 c;
    public final /* synthetic */ MessageObject d;

    public i21(sn snVar, Activity activity, org.telegram.ui.ActionBar.d6 d6Var, MessageObject messageObject) {
        this.a = snVar;
        this.b = activity;
        this.c = d6Var;
        this.d = messageObject;
    }

    @Override // org.telegram.ui.m21
    public final void a() {
        AndroidUtilities.runOnUIThread(new c21(this.a, this.b, this.c, this.d, 2), 200L);
    }

    @Override // org.telegram.ui.m21
    public final void b() {
        AndroidUtilities.runOnUIThread(new ue(this.a, this.d, 8), 200L);
    }

    @Override // org.telegram.ui.m21
    public final void c() {
        sn snVar = this.a;
        snVar.showDialog(new sg.x0((org.telegram.ui.ActionBar.n2) snVar, 3, true));
    }
}
