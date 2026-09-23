package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final /* synthetic */ class g31 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ xn b;
    public final /* synthetic */ Activity c;
    public final /* synthetic */ org.telegram.ui.ActionBar.d6 d;
    public final /* synthetic */ MessageObject e;

    public /* synthetic */ g31(xn xnVar, Activity activity, org.telegram.ui.ActionBar.d6 d6Var, MessageObject messageObject, int i10) {
        this.a = i10;
        this.b = xnVar;
        this.c = activity;
        this.d = d6Var;
        this.e = messageObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                xn xnVar = this.b;
                org.telegram.ui.Components.xc a02 = org.telegram.ui.Components.xc.a0(xnVar);
                String string = LocaleController.getString(R.string.AdReported);
                final int i10 = 1;
                final Activity activity = this.c;
                a02.c(AndroidUtilities.replaceSingleTag(string, -1, 2, new Runnable() { // from class: org.telegram.ui.h31
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                nf.f.s(activity, "https://promote.telegram.org/guidelines");
                                break;
                            case 1:
                                nf.f.s(activity, "https://promote.telegram.org/guidelines");
                                break;
                            default:
                                nf.f.s(activity, "https://promote.telegram.org/guidelines");
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
                org.telegram.ui.Components.xc a03 = org.telegram.ui.Components.xc.a0(xnVar2);
                String string2 = LocaleController.getString(R.string.AdReported);
                final int i11 = 0;
                final Activity activity2 = this.c;
                a03.c(AndroidUtilities.replaceSingleTag(string2, -1, 2, new Runnable() { // from class: org.telegram.ui.h31
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                nf.f.s(activity2, "https://promote.telegram.org/guidelines");
                                break;
                            case 1:
                                nf.f.s(activity2, "https://promote.telegram.org/guidelines");
                                break;
                            default:
                                nf.f.s(activity2, "https://promote.telegram.org/guidelines");
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
                org.telegram.ui.Components.xc a04 = org.telegram.ui.Components.xc.a0(xnVar3);
                String string3 = LocaleController.getString(R.string.AdReported);
                final int i12 = 2;
                final Activity activity3 = this.c;
                a04.c(AndroidUtilities.replaceSingleTag(string3, -1, 2, new Runnable() { // from class: org.telegram.ui.h31
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i12) {
                            case 0:
                                nf.f.s(activity3, "https://promote.telegram.org/guidelines");
                                break;
                            case 1:
                                nf.f.s(activity3, "https://promote.telegram.org/guidelines");
                                break;
                            default:
                                nf.f.s(activity3, "https://promote.telegram.org/guidelines");
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
