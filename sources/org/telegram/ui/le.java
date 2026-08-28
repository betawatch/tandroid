package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class le implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ qn b;
    public final /* synthetic */ String c;

    public /* synthetic */ le(qn qnVar, String str, int i9) {
        this.a = i9;
        this.b = qnVar;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                qn.W0(this.b, this.c);
                break;
            case 1:
                qn.h1(this.b, this.c);
                break;
            case 2:
                l4.f(this.c, r1.currentAccount, r1.T0, null, this.b.aa);
                break;
            case 3:
                qn qnVar = this.b;
                String str = this.c;
                if (str != null) {
                    qnVar.getClass();
                    if (str.length() != 0) {
                        qnVar.getMessagesController().sendBotStart(qnVar.f, str);
                        break;
                    }
                }
                qnVar.getSendMessagesHelper().sendMessage(SendMessagesHelper.SendMessageParams.of("/start", qnVar.P5, null, null, null, false, null, null, null, true, 0, 0, null, false));
                break;
            case 4:
                this.b.la(this.c);
                break;
            case 5:
                this.b.da(this.c, false);
                break;
            case 6:
                ve.e.s(this.b.getParentActivity(), "tel:" + this.c);
                break;
            case 7:
                AndroidUtilities.addToClipboard(this.c);
                org.telegram.messenger.ll.o(R.string.PhoneCopied, org.telegram.ui.Components.oc.a0(this.b));
                break;
            case 8:
                qn.u1(this.b, this.c);
                break;
            case 9:
                ve.e.s(this.b.getParentActivity(), "tel:" + this.c);
                break;
            case 10:
                AndroidUtilities.addToClipboard(this.c);
                org.telegram.messenger.ll.o(R.string.PhoneCopied, org.telegram.ui.Components.oc.a0(this.b));
                break;
            default:
                ve.e.s(this.b.getParentActivity(), "https://fragment.com/username/" + this.c);
                break;
        }
    }
}
