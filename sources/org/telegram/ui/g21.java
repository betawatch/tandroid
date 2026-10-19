package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class g21 implements k21 {
    public final /* synthetic */ qn a;
    public final /* synthetic */ Activity b;
    public final /* synthetic */ org.telegram.ui.ActionBar.d6 c;
    public final /* synthetic */ MessageObject d;

    public g21(qn qnVar, Activity activity, org.telegram.ui.ActionBar.d6 d6Var, MessageObject messageObject) {
        this.a = qnVar;
        this.b = activity;
        this.c = d6Var;
        this.d = messageObject;
    }

    @Override // org.telegram.ui.k21
    public final void a() {
        AndroidUtilities.runOnUIThread(new a21(this.a, this.b, this.c, this.d, 2), 200L);
    }

    @Override // org.telegram.ui.k21
    public final void b() {
        AndroidUtilities.runOnUIThread(new se(this.a, this.d, 8), 200L);
    }

    @Override // org.telegram.ui.k21
    public final void c() {
        qn qnVar = this.a;
        qnVar.showDialog(new sg.y0((org.telegram.ui.ActionBar.n2) qnVar, 3, true));
    }
}
