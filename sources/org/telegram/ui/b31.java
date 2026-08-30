package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class b31 implements f31 {
    public final /* synthetic */ xn a;
    public final /* synthetic */ Activity b;
    public final /* synthetic */ org.telegram.ui.ActionBar.f6 c;
    public final /* synthetic */ MessageObject d;

    public b31(xn xnVar, Activity activity, org.telegram.ui.ActionBar.f6 f6Var, MessageObject messageObject) {
        this.a = xnVar;
        this.b = activity;
        this.c = f6Var;
        this.d = messageObject;
    }

    @Override // org.telegram.ui.f31
    public final void a() {
        AndroidUtilities.runOnUIThread(new v21(this.a, this.b, this.c, this.d, 2), 200L);
    }

    @Override // org.telegram.ui.f31
    public final void b() {
        AndroidUtilities.runOnUIThread(new re(this.a, this.d, 8), 200L);
    }

    @Override // org.telegram.ui.f31
    public final void c() {
        xn xnVar = this.a;
        xnVar.showDialog(new eg.o1((org.telegram.ui.ActionBar.p2) xnVar, 3, true));
    }
}
