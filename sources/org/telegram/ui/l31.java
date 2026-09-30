package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes3.dex */
public final class l31 implements p31 {
    public final /* synthetic */ wn a;
    public final /* synthetic */ Activity b;
    public final /* synthetic */ org.telegram.ui.ActionBar.d6 c;
    public final /* synthetic */ MessageObject d;

    public l31(wn wnVar, Activity activity, org.telegram.ui.ActionBar.d6 d6Var, MessageObject messageObject) {
        this.a = wnVar;
        this.b = activity;
        this.c = d6Var;
        this.d = messageObject;
    }

    @Override // org.telegram.ui.p31
    public final void a() {
        AndroidUtilities.runOnUIThread(new f31(this.a, this.b, this.c, this.d, 2), 200L);
    }

    @Override // org.telegram.ui.p31
    public final void b() {
        AndroidUtilities.runOnUIThread(new te(this.a, this.d, 8), 200L);
    }

    @Override // org.telegram.ui.p31
    public final void c() {
        wn wnVar = this.a;
        wnVar.showDialog(new rg.x0((org.telegram.ui.ActionBar.m2) wnVar, 3, true));
    }
}
