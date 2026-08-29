package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class p21 implements t21 {
    public final /* synthetic */ tn a;
    public final /* synthetic */ Activity b;
    public final /* synthetic */ org.telegram.ui.ActionBar.c6 c;
    public final /* synthetic */ MessageObject d;

    public p21(tn tnVar, Activity activity, org.telegram.ui.ActionBar.c6 c6Var, MessageObject messageObject) {
        this.a = tnVar;
        this.b = activity;
        this.c = c6Var;
        this.d = messageObject;
    }

    @Override // org.telegram.ui.t21
    public final void a() {
        AndroidUtilities.runOnUIThread(new j21(this.a, this.b, this.c, this.d, 2), 200L);
    }

    @Override // org.telegram.ui.t21
    public final void b() {
        AndroidUtilities.runOnUIThread(new ke(this.a, this.d, 8), 200L);
    }

    @Override // org.telegram.ui.t21
    public final void c() {
        tn tnVar = this.a;
        tnVar.showDialog(new cg.p1((org.telegram.ui.ActionBar.o2) tnVar, 3, true));
    }
}
