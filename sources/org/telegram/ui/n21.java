package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class n21 implements q21 {
    public final /* synthetic */ un a;
    public final /* synthetic */ Activity b;
    public final /* synthetic */ org.telegram.ui.ActionBar.u6 c;
    public final /* synthetic */ MessageObject d;

    public n21(un unVar, Activity activity, org.telegram.ui.ActionBar.u6 u6Var, MessageObject messageObject) {
        this.a = unVar;
        this.b = activity;
        this.c = u6Var;
        this.d = messageObject;
    }

    @Override // org.telegram.ui.q21
    public final void a() {
        AndroidUtilities.runOnUIThread(new h21(this.a, this.b, this.c, this.d, 2), 200L);
    }

    @Override // org.telegram.ui.q21
    public final void b() {
        AndroidUtilities.runOnUIThread(new te(this.a, this.d, 8), 200L);
    }

    @Override // org.telegram.ui.q21
    public final void c() {
        un unVar = this.a;
        unVar.showDialog(new tg.y0((org.telegram.ui.ActionBar.r2) unVar, 3, true));
    }
}
