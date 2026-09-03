package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class c31 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ zn b;
    public final /* synthetic */ Activity c;
    public final /* synthetic */ org.telegram.ui.ActionBar.f6 d;
    public final /* synthetic */ MessageObject e;

    public /* synthetic */ c31(zn znVar, Activity activity, org.telegram.ui.ActionBar.f6 f6Var, MessageObject messageObject, int i10) {
        this.a = i10;
        this.b = znVar;
        this.c = activity;
        this.d = f6Var;
        this.e = messageObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                zn znVar = this.b;
                org.telegram.ui.Components.qc a02 = org.telegram.ui.Components.qc.a0(znVar);
                String string = LocaleController.getString(R.string.AdReported);
                final int i10 = 1;
                final Activity activity = this.c;
                a02.c(AndroidUtilities.replaceSingleTag(string, -1, 2, new Runnable() { // from class: org.telegram.ui.d31
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                ze.d.s(activity, "https://promote.telegram.org/guidelines");
                                break;
                            case 1:
                                ze.d.s(activity, "https://promote.telegram.org/guidelines");
                                break;
                            default:
                                ze.d.s(activity, "https://promote.telegram.org/guidelines");
                                break;
                        }
                    }
                }, this.d)).j();
                MessageObject messageObject = this.e;
                znVar.Fa(messageObject);
                znVar.Ha(messageObject);
                break;
            case 1:
                zn znVar2 = this.b;
                org.telegram.ui.Components.qc a03 = org.telegram.ui.Components.qc.a0(znVar2);
                String string2 = LocaleController.getString(R.string.AdReported);
                final int i11 = 0;
                final Activity activity2 = this.c;
                a03.c(AndroidUtilities.replaceSingleTag(string2, -1, 2, new Runnable() { // from class: org.telegram.ui.d31
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                ze.d.s(activity2, "https://promote.telegram.org/guidelines");
                                break;
                            case 1:
                                ze.d.s(activity2, "https://promote.telegram.org/guidelines");
                                break;
                            default:
                                ze.d.s(activity2, "https://promote.telegram.org/guidelines");
                                break;
                        }
                    }
                }, this.d)).j();
                MessageObject messageObject2 = this.e;
                znVar2.Fa(messageObject2);
                znVar2.Ha(messageObject2);
                break;
            default:
                zn znVar3 = this.b;
                org.telegram.ui.Components.qc a04 = org.telegram.ui.Components.qc.a0(znVar3);
                String string3 = LocaleController.getString(R.string.AdReported);
                final int i12 = 2;
                final Activity activity3 = this.c;
                a04.c(AndroidUtilities.replaceSingleTag(string3, -1, 2, new Runnable() { // from class: org.telegram.ui.d31
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i12) {
                            case 0:
                                ze.d.s(activity3, "https://promote.telegram.org/guidelines");
                                break;
                            case 1:
                                ze.d.s(activity3, "https://promote.telegram.org/guidelines");
                                break;
                            default:
                                ze.d.s(activity3, "https://promote.telegram.org/guidelines");
                                break;
                        }
                    }
                }, this.d)).j();
                MessageObject messageObject3 = this.e;
                znVar3.Fa(messageObject3);
                znVar3.Ha(messageObject3);
                break;
        }
    }
}
