package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class o21 implements s21 {
    public final /* synthetic */ rn a;
    public final /* synthetic */ Activity b;
    public final /* synthetic */ org.telegram.ui.ActionBar.c6 c;
    public final /* synthetic */ MessageObject d;

    public o21(rn rnVar, Activity activity, org.telegram.ui.ActionBar.c6 c6Var, MessageObject messageObject) {
        this.a = rnVar;
        this.b = activity;
        this.c = c6Var;
        this.d = messageObject;
    }

    @Override // org.telegram.ui.s21
    public final void a() {
        AndroidUtilities.runOnUIThread(new h21(this.a, this.b, this.c, this.d, 2), 200L);
    }

    @Override // org.telegram.ui.s21
    public final void b() {
        AndroidUtilities.runOnUIThread(new me(this.a, this.d, 8), 200L);
    }

    @Override // org.telegram.ui.s21
    public final void c() {
        rn rnVar = this.a;
        rnVar.showDialog(new ag.g2((org.telegram.ui.ActionBar.n2) rnVar, 3, true));
    }
}
