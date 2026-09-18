package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class p31 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ bo b;
    public final /* synthetic */ Activity c;
    public final /* synthetic */ org.telegram.ui.ActionBar.f6 d;
    public final /* synthetic */ MessageObject e;

    public /* synthetic */ p31(bo boVar, Activity activity, org.telegram.ui.ActionBar.f6 f6Var, MessageObject messageObject, int i10) {
        this.a = i10;
        this.b = boVar;
        this.c = activity;
        this.d = f6Var;
        this.e = messageObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                bo boVar = this.b;
                org.telegram.ui.Components.vc a02 = org.telegram.ui.Components.vc.a0(boVar);
                String string = LocaleController.getString(R.string.AdReported);
                final int i10 = 1;
                final Activity activity = this.c;
                a02.c(AndroidUtilities.replaceSingleTag(string, -1, 2, new Runnable() { // from class: org.telegram.ui.q31
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
                boVar.Fa(messageObject);
                boVar.Ha(messageObject);
                break;
            case 1:
                bo boVar2 = this.b;
                org.telegram.ui.Components.vc a03 = org.telegram.ui.Components.vc.a0(boVar2);
                String string2 = LocaleController.getString(R.string.AdReported);
                final int i11 = 0;
                final Activity activity2 = this.c;
                a03.c(AndroidUtilities.replaceSingleTag(string2, -1, 2, new Runnable() { // from class: org.telegram.ui.q31
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
                boVar2.Fa(messageObject2);
                boVar2.Ha(messageObject2);
                break;
            default:
                bo boVar3 = this.b;
                org.telegram.ui.Components.vc a04 = org.telegram.ui.Components.vc.a0(boVar3);
                String string3 = LocaleController.getString(R.string.AdReported);
                final int i12 = 2;
                final Activity activity3 = this.c;
                a04.c(AndroidUtilities.replaceSingleTag(string3, -1, 2, new Runnable() { // from class: org.telegram.ui.q31
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
                boVar3.Fa(messageObject3);
                boVar3.Ha(messageObject3);
                break;
        }
    }
}
