package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class a41 implements e41 {
    public final /* synthetic */ fo a;
    public final /* synthetic */ Activity b;
    public final /* synthetic */ org.telegram.ui.ActionBar.c6 c;
    public final /* synthetic */ MessageObject d;

    public a41(fo foVar, Activity activity, org.telegram.ui.ActionBar.c6 c6Var, MessageObject messageObject) {
        this.a = foVar;
        this.b = activity;
        this.c = c6Var;
        this.d = messageObject;
    }

    @Override // org.telegram.ui.e41
    public final void a() {
        AndroidUtilities.runOnUIThread(new u31(this.a, this.b, this.c, this.d, 2), 200L);
    }

    @Override // org.telegram.ui.e41
    public final void b() {
        AndroidUtilities.runOnUIThread(new bf(this.a, this.d, 8), 200L);
    }

    @Override // org.telegram.ui.e41
    public final void c() {
        fo foVar = this.a;
        foVar.showDialog(new sg.y0((org.telegram.ui.ActionBar.m2) foVar, 3, true));
    }
}
