package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final class k21 implements o21 {
    public final /* synthetic */ sn a;
    public final /* synthetic */ Activity b;
    public final /* synthetic */ org.telegram.ui.ActionBar.g6 c;
    public final /* synthetic */ MessageObject d;

    public k21(sn snVar, Activity activity, org.telegram.ui.ActionBar.g6 g6Var, MessageObject messageObject) {
        this.a = snVar;
        this.b = activity;
        this.c = g6Var;
        this.d = messageObject;
    }

    @Override // org.telegram.ui.o21
    public final void a() {
        AndroidUtilities.runOnUIThread(new e21(this.a, this.b, this.c, this.d, 2), 200L);
    }

    @Override // org.telegram.ui.o21
    public final void b() {
        AndroidUtilities.runOnUIThread(new se(this.a, this.d, 8), 200L);
    }

    @Override // org.telegram.ui.o21
    public final void c() {
        sn snVar = this.a;
        snVar.showDialog(new sg.y0((org.telegram.ui.ActionBar.o2) snVar, 3, true));
    }
}
