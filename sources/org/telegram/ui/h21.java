package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class h21 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ rn b;
    public final /* synthetic */ Activity c;
    public final /* synthetic */ org.telegram.ui.ActionBar.c6 d;
    public final /* synthetic */ MessageObject e;

    public /* synthetic */ h21(rn rnVar, Activity activity, org.telegram.ui.ActionBar.c6 c6Var, MessageObject messageObject, int i10) {
        this.a = i10;
        this.b = rnVar;
        this.c = activity;
        this.d = c6Var;
        this.e = messageObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                rn rnVar = this.b;
                org.telegram.ui.Components.mc a02 = org.telegram.ui.Components.mc.a0(rnVar);
                String string = LocaleController.getString(R.string.AdReported);
                final int i10 = 1;
                final Activity activity = this.c;
                a02.c(AndroidUtilities.replaceSingleTag(string, -1, 2, new Runnable() { // from class: org.telegram.ui.i21
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                we.e.s(activity, "https://promote.telegram.org/guidelines");
                                break;
                            case 1:
                                we.e.s(activity, "https://promote.telegram.org/guidelines");
                                break;
                            default:
                                we.e.s(activity, "https://promote.telegram.org/guidelines");
                                break;
                        }
                    }
                }, this.d)).j();
                MessageObject messageObject = this.e;
                rnVar.Fa(messageObject);
                rnVar.Ha(messageObject);
                break;
            case 1:
                rn rnVar2 = this.b;
                org.telegram.ui.Components.mc a03 = org.telegram.ui.Components.mc.a0(rnVar2);
                String string2 = LocaleController.getString(R.string.AdReported);
                final int i11 = 0;
                final Activity activity2 = this.c;
                a03.c(AndroidUtilities.replaceSingleTag(string2, -1, 2, new Runnable() { // from class: org.telegram.ui.i21
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                we.e.s(activity2, "https://promote.telegram.org/guidelines");
                                break;
                            case 1:
                                we.e.s(activity2, "https://promote.telegram.org/guidelines");
                                break;
                            default:
                                we.e.s(activity2, "https://promote.telegram.org/guidelines");
                                break;
                        }
                    }
                }, this.d)).j();
                MessageObject messageObject2 = this.e;
                rnVar2.Fa(messageObject2);
                rnVar2.Ha(messageObject2);
                break;
            default:
                rn rnVar3 = this.b;
                org.telegram.ui.Components.mc a04 = org.telegram.ui.Components.mc.a0(rnVar3);
                String string3 = LocaleController.getString(R.string.AdReported);
                final int i12 = 2;
                final Activity activity3 = this.c;
                a04.c(AndroidUtilities.replaceSingleTag(string3, -1, 2, new Runnable() { // from class: org.telegram.ui.i21
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i12) {
                            case 0:
                                we.e.s(activity3, "https://promote.telegram.org/guidelines");
                                break;
                            case 1:
                                we.e.s(activity3, "https://promote.telegram.org/guidelines");
                                break;
                            default:
                                we.e.s(activity3, "https://promote.telegram.org/guidelines");
                                break;
                        }
                    }
                }, this.d)).j();
                MessageObject messageObject3 = this.e;
                rnVar3.Fa(messageObject3);
                rnVar3.Ha(messageObject3);
                break;
        }
    }
}
