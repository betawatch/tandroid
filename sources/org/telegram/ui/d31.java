package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class d31 implements h31 {
    public final /* synthetic */ xn a;
    public final /* synthetic */ Activity b;
    public final /* synthetic */ org.telegram.ui.ActionBar.g6 c;
    public final /* synthetic */ MessageObject d;

    public d31(xn xnVar, Activity activity, org.telegram.ui.ActionBar.g6 g6Var, MessageObject messageObject) {
        this.a = xnVar;
        this.b = activity;
        this.c = g6Var;
        this.d = messageObject;
    }

    @Override // org.telegram.ui.h31
    public final void a() {
        AndroidUtilities.runOnUIThread(new x21(this.a, this.b, this.c, this.d, 2), 200L);
    }

    @Override // org.telegram.ui.h31
    public final void b() {
        AndroidUtilities.runOnUIThread(new re(this.a, this.d, 8), 200L);
    }

    @Override // org.telegram.ui.h31
    public final void c() {
        xn xnVar = this.a;
        xnVar.showDialog(new fg.n1((org.telegram.ui.ActionBar.p2) xnVar, 3, true));
    }
}
