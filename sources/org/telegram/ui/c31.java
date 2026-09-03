package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class c31 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ xn b;
    public final /* synthetic */ Activity c;
    public final /* synthetic */ org.telegram.ui.ActionBar.g6 d;
    public final /* synthetic */ MessageObject e;

    public /* synthetic */ c31(xn xnVar, Activity activity, org.telegram.ui.ActionBar.g6 g6Var, MessageObject messageObject, int i10) {
        this.a = i10;
        this.b = xnVar;
        this.c = activity;
        this.d = g6Var;
        this.e = messageObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                xn xnVar = this.b;
                org.telegram.ui.Components.qc a02 = org.telegram.ui.Components.qc.a0(xnVar);
                String string = LocaleController.getString(R.string.AdReported);
                final int i10 = 1;
                final Activity activity = this.c;
                a02.c(AndroidUtilities.replaceSingleTag(string, -1, 2, new Runnable() { // from class: org.telegram.ui.d31
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                af.g.s(activity, "https://promote.telegram.org/guidelines");
                                break;
                            case 1:
                                af.g.s(activity, "https://promote.telegram.org/guidelines");
                                break;
                            default:
                                af.g.s(activity, "https://promote.telegram.org/guidelines");
                                break;
                        }
                    }
                }, this.d)).j();
                MessageObject messageObject = this.e;
                xnVar.Fa(messageObject);
                xnVar.Ha(messageObject);
                break;
            case 1:
                xn xnVar2 = this.b;
                org.telegram.ui.Components.qc a03 = org.telegram.ui.Components.qc.a0(xnVar2);
                String string2 = LocaleController.getString(R.string.AdReported);
                final int i11 = 0;
                final Activity activity2 = this.c;
                a03.c(AndroidUtilities.replaceSingleTag(string2, -1, 2, new Runnable() { // from class: org.telegram.ui.d31
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                af.g.s(activity2, "https://promote.telegram.org/guidelines");
                                break;
                            case 1:
                                af.g.s(activity2, "https://promote.telegram.org/guidelines");
                                break;
                            default:
                                af.g.s(activity2, "https://promote.telegram.org/guidelines");
                                break;
                        }
                    }
                }, this.d)).j();
                MessageObject messageObject2 = this.e;
                xnVar2.Fa(messageObject2);
                xnVar2.Ha(messageObject2);
                break;
            default:
                xn xnVar3 = this.b;
                org.telegram.ui.Components.qc a04 = org.telegram.ui.Components.qc.a0(xnVar3);
                String string3 = LocaleController.getString(R.string.AdReported);
                final int i12 = 2;
                final Activity activity3 = this.c;
                a04.c(AndroidUtilities.replaceSingleTag(string3, -1, 2, new Runnable() { // from class: org.telegram.ui.d31
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i12) {
                            case 0:
                                af.g.s(activity3, "https://promote.telegram.org/guidelines");
                                break;
                            case 1:
                                af.g.s(activity3, "https://promote.telegram.org/guidelines");
                                break;
                            default:
                                af.g.s(activity3, "https://promote.telegram.org/guidelines");
                                break;
                        }
                    }
                }, this.d)).j();
                MessageObject messageObject3 = this.e;
                xnVar3.Fa(messageObject3);
                xnVar3.Ha(messageObject3);
                break;
        }
    }
}
