package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public final /* synthetic */ class f31 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ yn b;
    public final /* synthetic */ Activity c;
    public final /* synthetic */ org.telegram.ui.ActionBar.d6 d;
    public final /* synthetic */ MessageObject e;

    public /* synthetic */ f31(yn ynVar, Activity activity, org.telegram.ui.ActionBar.d6 d6Var, MessageObject messageObject, int i10) {
        this.a = i10;
        this.b = ynVar;
        this.c = activity;
        this.d = d6Var;
        this.e = messageObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                yn ynVar = this.b;
                org.telegram.ui.Components.yc a02 = org.telegram.ui.Components.yc.a0(ynVar);
                String string = LocaleController.getString(R.string.AdReported);
                final int i10 = 1;
                final Activity activity = this.c;
                a02.c(AndroidUtilities.replaceSingleTag(string, -1, 2, new Runnable() { // from class: org.telegram.ui.g31
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
                ynVar.Ea(messageObject);
                ynVar.Ga(messageObject);
                break;
            case 1:
                yn ynVar2 = this.b;
                org.telegram.ui.Components.yc a03 = org.telegram.ui.Components.yc.a0(ynVar2);
                String string2 = LocaleController.getString(R.string.AdReported);
                final int i11 = 0;
                final Activity activity2 = this.c;
                a03.c(AndroidUtilities.replaceSingleTag(string2, -1, 2, new Runnable() { // from class: org.telegram.ui.g31
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
                ynVar2.Ea(messageObject2);
                ynVar2.Ga(messageObject2);
                break;
            default:
                yn ynVar3 = this.b;
                org.telegram.ui.Components.yc a04 = org.telegram.ui.Components.yc.a0(ynVar3);
                String string3 = LocaleController.getString(R.string.AdReported);
                final int i12 = 2;
                final Activity activity3 = this.c;
                a04.c(AndroidUtilities.replaceSingleTag(string3, -1, 2, new Runnable() { // from class: org.telegram.ui.g31
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
                ynVar3.Ea(messageObject3);
                ynVar3.Ga(messageObject3);
                break;
        }
    }
}
