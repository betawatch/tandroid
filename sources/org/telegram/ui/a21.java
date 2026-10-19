package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final /* synthetic */ class a21 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ qn b;
    public final /* synthetic */ Activity c;
    public final /* synthetic */ org.telegram.ui.ActionBar.d6 d;
    public final /* synthetic */ MessageObject e;

    public /* synthetic */ a21(qn qnVar, Activity activity, org.telegram.ui.ActionBar.d6 d6Var, MessageObject messageObject, int i10) {
        this.a = i10;
        this.b = qnVar;
        this.c = activity;
        this.d = d6Var;
        this.e = messageObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                qn qnVar = this.b;
                org.telegram.ui.Components.xc a02 = org.telegram.ui.Components.xc.a0(qnVar);
                String string = LocaleController.getString(R.string.AdReported);
                final int i10 = 1;
                final Activity activity = this.c;
                a02.c(AndroidUtilities.replaceSingleTag(string, -1, 2, new Runnable() { // from class: org.telegram.ui.b21
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                pf.d.r(activity, "https://promote.telegram.org/guidelines");
                                break;
                            case 1:
                                pf.d.r(activity, "https://promote.telegram.org/guidelines");
                                break;
                            default:
                                pf.d.r(activity, "https://promote.telegram.org/guidelines");
                                break;
                        }
                    }
                }, this.d)).j();
                MessageObject messageObject = this.e;
                qnVar.Ja(messageObject);
                qnVar.La(messageObject);
                break;
            case 1:
                qn qnVar2 = this.b;
                org.telegram.ui.Components.xc a03 = org.telegram.ui.Components.xc.a0(qnVar2);
                String string2 = LocaleController.getString(R.string.AdReported);
                final int i11 = 0;
                final Activity activity2 = this.c;
                a03.c(AndroidUtilities.replaceSingleTag(string2, -1, 2, new Runnable() { // from class: org.telegram.ui.b21
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                pf.d.r(activity2, "https://promote.telegram.org/guidelines");
                                break;
                            case 1:
                                pf.d.r(activity2, "https://promote.telegram.org/guidelines");
                                break;
                            default:
                                pf.d.r(activity2, "https://promote.telegram.org/guidelines");
                                break;
                        }
                    }
                }, this.d)).j();
                MessageObject messageObject2 = this.e;
                qnVar2.Ja(messageObject2);
                qnVar2.La(messageObject2);
                break;
            default:
                qn qnVar3 = this.b;
                org.telegram.ui.Components.xc a04 = org.telegram.ui.Components.xc.a0(qnVar3);
                String string3 = LocaleController.getString(R.string.AdReported);
                final int i12 = 2;
                final Activity activity3 = this.c;
                a04.c(AndroidUtilities.replaceSingleTag(string3, -1, 2, new Runnable() { // from class: org.telegram.ui.b21
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i12) {
                            case 0:
                                pf.d.r(activity3, "https://promote.telegram.org/guidelines");
                                break;
                            case 1:
                                pf.d.r(activity3, "https://promote.telegram.org/guidelines");
                                break;
                            default:
                                pf.d.r(activity3, "https://promote.telegram.org/guidelines");
                                break;
                        }
                    }
                }, this.d)).j();
                MessageObject messageObject3 = this.e;
                qnVar3.Ja(messageObject3);
                qnVar3.La(messageObject3);
                break;
        }
    }
}
