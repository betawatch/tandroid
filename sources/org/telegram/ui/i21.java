package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class i21 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ qn b;
    public final /* synthetic */ Activity c;
    public final /* synthetic */ org.telegram.ui.ActionBar.b6 d;
    public final /* synthetic */ MessageObject e;

    public /* synthetic */ i21(qn qnVar, Activity activity, org.telegram.ui.ActionBar.b6 b6Var, MessageObject messageObject, int i9) {
        this.a = i9;
        this.b = qnVar;
        this.c = activity;
        this.d = b6Var;
        this.e = messageObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                qn qnVar = this.b;
                org.telegram.ui.Components.oc a02 = org.telegram.ui.Components.oc.a0(qnVar);
                String string = LocaleController.getString(R.string.AdReported);
                final int i9 = 1;
                final Activity activity = this.c;
                a02.c(AndroidUtilities.replaceSingleTag(string, -1, 2, new Runnable() { // from class: org.telegram.ui.j21
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i9) {
                            case 0:
                                ve.e.s(activity, "https://promote.telegram.org/guidelines");
                                break;
                            case 1:
                                ve.e.s(activity, "https://promote.telegram.org/guidelines");
                                break;
                            default:
                                ve.e.s(activity, "https://promote.telegram.org/guidelines");
                                break;
                        }
                    }
                }, this.d)).j();
                MessageObject messageObject = this.e;
                qnVar.Fa(messageObject);
                qnVar.Ha(messageObject);
                break;
            case 1:
                qn qnVar2 = this.b;
                org.telegram.ui.Components.oc a03 = org.telegram.ui.Components.oc.a0(qnVar2);
                String string2 = LocaleController.getString(R.string.AdReported);
                final int i10 = 0;
                final Activity activity2 = this.c;
                a03.c(AndroidUtilities.replaceSingleTag(string2, -1, 2, new Runnable() { // from class: org.telegram.ui.j21
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                ve.e.s(activity2, "https://promote.telegram.org/guidelines");
                                break;
                            case 1:
                                ve.e.s(activity2, "https://promote.telegram.org/guidelines");
                                break;
                            default:
                                ve.e.s(activity2, "https://promote.telegram.org/guidelines");
                                break;
                        }
                    }
                }, this.d)).j();
                MessageObject messageObject2 = this.e;
                qnVar2.Fa(messageObject2);
                qnVar2.Ha(messageObject2);
                break;
            default:
                qn qnVar3 = this.b;
                org.telegram.ui.Components.oc a04 = org.telegram.ui.Components.oc.a0(qnVar3);
                String string3 = LocaleController.getString(R.string.AdReported);
                final int i11 = 2;
                final Activity activity3 = this.c;
                a04.c(AndroidUtilities.replaceSingleTag(string3, -1, 2, new Runnable() { // from class: org.telegram.ui.j21
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                ve.e.s(activity3, "https://promote.telegram.org/guidelines");
                                break;
                            case 1:
                                ve.e.s(activity3, "https://promote.telegram.org/guidelines");
                                break;
                            default:
                                ve.e.s(activity3, "https://promote.telegram.org/guidelines");
                                break;
                        }
                    }
                }, this.d)).j();
                MessageObject messageObject3 = this.e;
                qnVar3.Fa(messageObject3);
                qnVar3.Ha(messageObject3);
                break;
        }
    }
}
