package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class m31 implements q31 {
    public final /* synthetic */ xn a;
    public final /* synthetic */ Activity b;
    public final /* synthetic */ org.telegram.ui.ActionBar.d6 c;
    public final /* synthetic */ MessageObject d;

    public m31(xn xnVar, Activity activity, org.telegram.ui.ActionBar.d6 d6Var, MessageObject messageObject) {
        this.a = xnVar;
        this.b = activity;
        this.c = d6Var;
        this.d = messageObject;
    }

    @Override // org.telegram.ui.q31
    public final void a() {
        AndroidUtilities.runOnUIThread(new g31(this.a, this.b, this.c, this.d, 2), 200L);
    }

    @Override // org.telegram.ui.q31
    public final void b() {
        AndroidUtilities.runOnUIThread(new se(this.a, this.d, 8), 200L);
    }

    @Override // org.telegram.ui.q31
    public final void c() {
        xn xnVar = this.a;
        xnVar.showDialog(new rg.x0((org.telegram.ui.ActionBar.n2) xnVar, 3, true));
    }
}
