package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class j21 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ tn b;
    public final /* synthetic */ Activity c;
    public final /* synthetic */ org.telegram.ui.ActionBar.c6 d;
    public final /* synthetic */ MessageObject e;

    public /* synthetic */ j21(tn tnVar, Activity activity, org.telegram.ui.ActionBar.c6 c6Var, MessageObject messageObject, int i10) {
        this.a = i10;
        this.b = tnVar;
        this.c = activity;
        this.d = c6Var;
        this.e = messageObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                tn tnVar = this.b;
                org.telegram.ui.Components.tc a02 = org.telegram.ui.Components.tc.a0(tnVar);
                String string = LocaleController.getString(R.string.AdReported);
                final int i10 = 1;
                final Activity activity = this.c;
                a02.c(AndroidUtilities.replaceSingleTag(string, -1, 2, new Runnable() { // from class: org.telegram.ui.k21
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                ye.d.s(activity, "https://promote.telegram.org/guidelines");
                                break;
                            case 1:
                                ye.d.s(activity, "https://promote.telegram.org/guidelines");
                                break;
                            default:
                                ye.d.s(activity, "https://promote.telegram.org/guidelines");
                                break;
                        }
                    }
                }, this.d)).j();
                MessageObject messageObject = this.e;
                tnVar.Fa(messageObject);
                tnVar.Ha(messageObject);
                break;
            case 1:
                tn tnVar2 = this.b;
                org.telegram.ui.Components.tc a03 = org.telegram.ui.Components.tc.a0(tnVar2);
                String string2 = LocaleController.getString(R.string.AdReported);
                final int i11 = 0;
                final Activity activity2 = this.c;
                a03.c(AndroidUtilities.replaceSingleTag(string2, -1, 2, new Runnable() { // from class: org.telegram.ui.k21
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                ye.d.s(activity2, "https://promote.telegram.org/guidelines");
                                break;
                            case 1:
                                ye.d.s(activity2, "https://promote.telegram.org/guidelines");
                                break;
                            default:
                                ye.d.s(activity2, "https://promote.telegram.org/guidelines");
                                break;
                        }
                    }
                }, this.d)).j();
                MessageObject messageObject2 = this.e;
                tnVar2.Fa(messageObject2);
                tnVar2.Ha(messageObject2);
                break;
            default:
                tn tnVar3 = this.b;
                org.telegram.ui.Components.tc a04 = org.telegram.ui.Components.tc.a0(tnVar3);
                String string3 = LocaleController.getString(R.string.AdReported);
                final int i12 = 2;
                final Activity activity3 = this.c;
                a04.c(AndroidUtilities.replaceSingleTag(string3, -1, 2, new Runnable() { // from class: org.telegram.ui.k21
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i12) {
                            case 0:
                                ye.d.s(activity3, "https://promote.telegram.org/guidelines");
                                break;
                            case 1:
                                ye.d.s(activity3, "https://promote.telegram.org/guidelines");
                                break;
                            default:
                                ye.d.s(activity3, "https://promote.telegram.org/guidelines");
                                break;
                        }
                    }
                }, this.d)).j();
                MessageObject messageObject3 = this.e;
                tnVar3.Fa(messageObject3);
                tnVar3.Ha(messageObject3);
                break;
        }
    }
}
