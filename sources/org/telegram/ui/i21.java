package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
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
        snVar.showDialog(new sg.y0((org.telegram.ui.ActionBar.n2) snVar, 3, true));
    }
}
