package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class h21 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ un b;
    public final /* synthetic */ Activity c;
    public final /* synthetic */ org.telegram.ui.ActionBar.u6 d;
    public final /* synthetic */ MessageObject e;

    public /* synthetic */ h21(un unVar, Activity activity, org.telegram.ui.ActionBar.u6 u6Var, MessageObject messageObject, int i10) {
        this.a = i10;
        this.b = unVar;
        this.c = activity;
        this.d = u6Var;
        this.e = messageObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                un unVar = this.b;
                org.telegram.ui.Components.wc b02 = org.telegram.ui.Components.wc.b0(unVar);
                String string = LocaleController.getString(R.string.AdReported);
                final int i10 = 1;
                final Activity activity = this.c;
                b02.c(AndroidUtilities.replaceSingleTag(string, -1, 2, new Runnable() { // from class: org.telegram.ui.i21
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
                unVar.Oa(messageObject);
                unVar.Qa(messageObject);
                break;
            case 1:
                un unVar2 = this.b;
                org.telegram.ui.Components.wc b03 = org.telegram.ui.Components.wc.b0(unVar2);
                String string2 = LocaleController.getString(R.string.AdReported);
                final int i11 = 0;
                final Activity activity2 = this.c;
                b03.c(AndroidUtilities.replaceSingleTag(string2, -1, 2, new Runnable() { // from class: org.telegram.ui.i21
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
                unVar2.Oa(messageObject2);
                unVar2.Qa(messageObject2);
                break;
            default:
                un unVar3 = this.b;
                org.telegram.ui.Components.wc b04 = org.telegram.ui.Components.wc.b0(unVar3);
                String string3 = LocaleController.getString(R.string.AdReported);
                final int i12 = 2;
                final Activity activity3 = this.c;
                b04.c(AndroidUtilities.replaceSingleTag(string3, -1, 2, new Runnable() { // from class: org.telegram.ui.i21
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
                unVar3.Oa(messageObject3);
                unVar3.Qa(messageObject3);
                break;
        }
    }
}
