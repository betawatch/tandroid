package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class j21 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ wn b;
    public final /* synthetic */ Activity c;
    public final /* synthetic */ org.telegram.ui.ActionBar.u6 d;
    public final /* synthetic */ MessageObject e;

    public /* synthetic */ j21(wn wnVar, Activity activity, org.telegram.ui.ActionBar.u6 u6Var, MessageObject messageObject, int i10) {
        this.a = i10;
        this.b = wnVar;
        this.c = activity;
        this.d = u6Var;
        this.e = messageObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                wn wnVar = this.b;
                org.telegram.ui.Components.wc b02 = org.telegram.ui.Components.wc.b0(wnVar);
                String string = LocaleController.getString(R.string.AdReported);
                final int i10 = 1;
                final Activity activity = this.c;
                b02.c(AndroidUtilities.replaceSingleTag(string, -1, 2, new Runnable() { // from class: org.telegram.ui.k21
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                qf.d.r(activity, "https://promote.telegram.org/guidelines");
                                break;
                            case 1:
                                qf.d.r(activity, "https://promote.telegram.org/guidelines");
                                break;
                            default:
                                qf.d.r(activity, "https://promote.telegram.org/guidelines");
                                break;
                        }
                    }
                }, this.d)).j();
                MessageObject messageObject = this.e;
                wnVar.Ra(messageObject);
                wnVar.Ta(messageObject);
                break;
            case 1:
                wn wnVar2 = this.b;
                org.telegram.ui.Components.wc b03 = org.telegram.ui.Components.wc.b0(wnVar2);
                String string2 = LocaleController.getString(R.string.AdReported);
                final int i11 = 0;
                final Activity activity2 = this.c;
                b03.c(AndroidUtilities.replaceSingleTag(string2, -1, 2, new Runnable() { // from class: org.telegram.ui.k21
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                qf.d.r(activity2, "https://promote.telegram.org/guidelines");
                                break;
                            case 1:
                                qf.d.r(activity2, "https://promote.telegram.org/guidelines");
                                break;
                            default:
                                qf.d.r(activity2, "https://promote.telegram.org/guidelines");
                                break;
                        }
                    }
                }, this.d)).j();
                MessageObject messageObject2 = this.e;
                wnVar2.Ra(messageObject2);
                wnVar2.Ta(messageObject2);
                break;
            default:
                wn wnVar3 = this.b;
                org.telegram.ui.Components.wc b04 = org.telegram.ui.Components.wc.b0(wnVar3);
                String string3 = LocaleController.getString(R.string.AdReported);
                final int i12 = 2;
                final Activity activity3 = this.c;
                b04.c(AndroidUtilities.replaceSingleTag(string3, -1, 2, new Runnable() { // from class: org.telegram.ui.k21
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i12) {
                            case 0:
                                qf.d.r(activity3, "https://promote.telegram.org/guidelines");
                                break;
                            case 1:
                                qf.d.r(activity3, "https://promote.telegram.org/guidelines");
                                break;
                            default:
                                qf.d.r(activity3, "https://promote.telegram.org/guidelines");
                                break;
                        }
                    }
                }, this.d)).j();
                MessageObject messageObject3 = this.e;
                wnVar3.Ra(messageObject3);
                wnVar3.Ta(messageObject3);
                break;
        }
    }
}
