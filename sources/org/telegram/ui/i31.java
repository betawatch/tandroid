package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class i31 implements m31 {
    public final /* synthetic */ zn a;
    public final /* synthetic */ Activity b;
    public final /* synthetic */ org.telegram.ui.ActionBar.f6 c;
    public final /* synthetic */ MessageObject d;

    public i31(zn znVar, Activity activity, org.telegram.ui.ActionBar.f6 f6Var, MessageObject messageObject) {
        this.a = znVar;
        this.b = activity;
        this.c = f6Var;
        this.d = messageObject;
    }

    @Override // org.telegram.ui.m31
    public final void a() {
        AndroidUtilities.runOnUIThread(new c31(this.a, this.b, this.c, this.d, 2), 200L);
    }

    @Override // org.telegram.ui.m31
    public final void b() {
        AndroidUtilities.runOnUIThread(new te(this.a, this.d, 8), 200L);
    }

    @Override // org.telegram.ui.m31
    public final void c() {
        zn znVar = this.a;
        znVar.showDialog(new eg.o1((org.telegram.ui.ActionBar.p2) znVar, 3, true));
    }
}
