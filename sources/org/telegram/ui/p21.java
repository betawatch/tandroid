package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class p21 implements t21 {
    public final /* synthetic */ qn a;
    public final /* synthetic */ Activity b;
    public final /* synthetic */ org.telegram.ui.ActionBar.b6 c;
    public final /* synthetic */ MessageObject d;

    public p21(qn qnVar, Activity activity, org.telegram.ui.ActionBar.b6 b6Var, MessageObject messageObject) {
        this.a = qnVar;
        this.b = activity;
        this.c = b6Var;
        this.d = messageObject;
    }

    @Override // org.telegram.ui.t21
    public final void a() {
        AndroidUtilities.runOnUIThread(new i21(this.a, this.b, this.c, this.d, 2), 200L);
    }

    @Override // org.telegram.ui.t21
    public final void b() {
        AndroidUtilities.runOnUIThread(new me(this.a, this.d, 8), 200L);
    }

    @Override // org.telegram.ui.t21
    public final void c() {
        qn qnVar = this.a;
        qnVar.showDialog(new zf.x0((org.telegram.ui.ActionBar.o2) qnVar, 3, true));
    }
}
