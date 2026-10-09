package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final /* synthetic */ class o31 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ zn b;
    public final /* synthetic */ Activity c;
    public final /* synthetic */ org.telegram.ui.ActionBar.e6 d;
    public final /* synthetic */ MessageObject e;

    public /* synthetic */ o31(zn znVar, Activity activity, org.telegram.ui.ActionBar.e6 e6Var, MessageObject messageObject, int i10) {
        this.a = i10;
        this.b = znVar;
        this.c = activity;
        this.d = e6Var;
        this.e = messageObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                zn znVar = this.b;
                org.telegram.ui.Components.ad a02 = org.telegram.ui.Components.ad.a0(znVar);
                String string = LocaleController.getString(R.string.AdReported);
                final int i10 = 1;
                final Activity activity = this.c;
                a02.c(AndroidUtilities.replaceSingleTag(string, -1, 2, new Runnable() { // from class: org.telegram.ui.p31
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                of.f.s(activity, "https://promote.telegram.org/guidelines");
                                break;
                            case 1:
                                of.f.s(activity, "https://promote.telegram.org/guidelines");
                                break;
                            default:
                                of.f.s(activity, "https://promote.telegram.org/guidelines");
                                break;
                        }
                    }
                }, this.d)).j();
                MessageObject messageObject = this.e;
                znVar.Ja(messageObject);
                znVar.La(messageObject);
                break;
            case 1:
                zn znVar2 = this.b;
                org.telegram.ui.Components.ad a03 = org.telegram.ui.Components.ad.a0(znVar2);
                String string2 = LocaleController.getString(R.string.AdReported);
                final int i11 = 0;
                final Activity activity2 = this.c;
                a03.c(AndroidUtilities.replaceSingleTag(string2, -1, 2, new Runnable() { // from class: org.telegram.ui.p31
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                of.f.s(activity2, "https://promote.telegram.org/guidelines");
                                break;
                            case 1:
                                of.f.s(activity2, "https://promote.telegram.org/guidelines");
                                break;
                            default:
                                of.f.s(activity2, "https://promote.telegram.org/guidelines");
                                break;
                        }
                    }
                }, this.d)).j();
                MessageObject messageObject2 = this.e;
                znVar2.Ja(messageObject2);
                znVar2.La(messageObject2);
                break;
            default:
                zn znVar3 = this.b;
                org.telegram.ui.Components.ad a04 = org.telegram.ui.Components.ad.a0(znVar3);
                String string3 = LocaleController.getString(R.string.AdReported);
                final int i12 = 2;
                final Activity activity3 = this.c;
                a04.c(AndroidUtilities.replaceSingleTag(string3, -1, 2, new Runnable() { // from class: org.telegram.ui.p31
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i12) {
                            case 0:
                                of.f.s(activity3, "https://promote.telegram.org/guidelines");
                                break;
                            case 1:
                                of.f.s(activity3, "https://promote.telegram.org/guidelines");
                                break;
                            default:
                                of.f.s(activity3, "https://promote.telegram.org/guidelines");
                                break;
                        }
                    }
                }, this.d)).j();
                MessageObject messageObject3 = this.e;
                znVar3.Ja(messageObject3);
                znVar3.La(messageObject3);
                break;
        }
    }
}
