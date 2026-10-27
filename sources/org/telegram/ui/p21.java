package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class p21 implements s21 {
    public final /* synthetic */ wn a;
    public final /* synthetic */ Activity b;
    public final /* synthetic */ org.telegram.ui.ActionBar.u6 c;
    public final /* synthetic */ MessageObject d;

    public p21(wn wnVar, Activity activity, org.telegram.ui.ActionBar.u6 u6Var, MessageObject messageObject) {
        this.a = wnVar;
        this.b = activity;
        this.c = u6Var;
        this.d = messageObject;
    }

    @Override // org.telegram.ui.s21
    public final void a() {
        AndroidUtilities.runOnUIThread(new j21(this.a, this.b, this.c, this.d, 2), 200L);
    }

    @Override // org.telegram.ui.s21
    public final void b() {
        AndroidUtilities.runOnUIThread(new te(this.a, this.d, 8), 200L);
    }

    @Override // org.telegram.ui.s21
    public final void c() {
        wn wnVar = this.a;
        wnVar.showDialog(new tg.y0((org.telegram.ui.ActionBar.r2) wnVar, 3, true));
    }
}
