package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final /* synthetic */ class p31 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ co b;
    public final /* synthetic */ Activity c;
    public final /* synthetic */ org.telegram.ui.ActionBar.f6 d;
    public final /* synthetic */ MessageObject e;

    public /* synthetic */ p31(co coVar, Activity activity, org.telegram.ui.ActionBar.f6 f6Var, MessageObject messageObject, int i10) {
        this.a = i10;
        this.b = coVar;
        this.c = activity;
        this.d = f6Var;
        this.e = messageObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                co coVar = this.b;
                org.telegram.ui.Components.yc a02 = org.telegram.ui.Components.yc.a0(coVar);
                String string = LocaleController.getString(R.string.AdReported);
                final int i10 = 1;
                final Activity activity = this.c;
                a02.c(AndroidUtilities.replaceSingleTag(string, -1, 2, new Runnable() { // from class: org.telegram.ui.r31
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
                coVar.Fa(messageObject);
                coVar.Ha(messageObject);
                break;
            case 1:
                co coVar2 = this.b;
                org.telegram.ui.Components.yc a03 = org.telegram.ui.Components.yc.a0(coVar2);
                String string2 = LocaleController.getString(R.string.AdReported);
                final int i11 = 0;
                final Activity activity2 = this.c;
                a03.c(AndroidUtilities.replaceSingleTag(string2, -1, 2, new Runnable() { // from class: org.telegram.ui.r31
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
                coVar2.Fa(messageObject2);
                coVar2.Ha(messageObject2);
                break;
            default:
                co coVar3 = this.b;
                org.telegram.ui.Components.yc a04 = org.telegram.ui.Components.yc.a0(coVar3);
                String string3 = LocaleController.getString(R.string.AdReported);
                final int i12 = 2;
                final Activity activity3 = this.c;
                a04.c(AndroidUtilities.replaceSingleTag(string3, -1, 2, new Runnable() { // from class: org.telegram.ui.r31
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
                coVar3.Fa(messageObject3);
                coVar3.Ha(messageObject3);
                break;
        }
    }
}
