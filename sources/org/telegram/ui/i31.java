package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class i31 implements m31 {
    public final /* synthetic */ xn a;
    public final /* synthetic */ Activity b;
    public final /* synthetic */ org.telegram.ui.ActionBar.g6 c;
    public final /* synthetic */ MessageObject d;

    public i31(xn xnVar, Activity activity, org.telegram.ui.ActionBar.g6 g6Var, MessageObject messageObject) {
        this.a = xnVar;
        this.b = activity;
        this.c = g6Var;
        this.d = messageObject;
    }

    @Override // org.telegram.ui.m31
    public final void a() {
        AndroidUtilities.runOnUIThread(new c31(this.a, this.b, this.c, this.d, 2), 200L);
    }

    @Override // org.telegram.ui.m31
    public final void b() {
        AndroidUtilities.runOnUIThread(new re(this.a, this.d, 8), 200L);
    }

    @Override // org.telegram.ui.m31
    public final void c() {
        xn xnVar = this.a;
        xnVar.showDialog(new fg.n1((org.telegram.ui.ActionBar.p2) xnVar, 3, true));
    }
}
