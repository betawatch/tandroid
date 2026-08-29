package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class je implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ tn b;
    public final /* synthetic */ String c;

    public /* synthetic */ je(tn tnVar, String str, int i10) {
        this.a = i10;
        this.b = tnVar;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                tn.W0(this.b, this.c);
                break;
            case 1:
                tn.h1(this.b, this.c);
                break;
            case 2:
                m4.f(this.c, r1.currentAccount, r1.T0, null, this.b.aa);
                break;
            case 3:
                tn tnVar = this.b;
                String str = this.c;
                if (str != null) {
                    tnVar.getClass();
                    if (str.length() != 0) {
                        tnVar.getMessagesController().sendBotStart(tnVar.f, str);
                        break;
                    }
                }
                tnVar.getSendMessagesHelper().sendMessage(SendMessagesHelper.SendMessageParams.of("/start", tnVar.P5, null, null, null, false, null, null, null, true, 0, 0, null, false));
                break;
            case 4:
                this.b.la(this.c);
                break;
            case 5:
                this.b.da(this.c, false);
                break;
            case 6:
                ye.d.s(this.b.getParentActivity(), "tel:" + this.c);
                break;
            case 7:
                AndroidUtilities.addToClipboard(this.c);
                b.n(R.string.PhoneCopied, org.telegram.ui.Components.tc.a0(this.b));
                break;
            case 8:
                tn.u1(this.b, this.c);
                break;
            case 9:
                ye.d.s(this.b.getParentActivity(), "tel:" + this.c);
                break;
            case 10:
                AndroidUtilities.addToClipboard(this.c);
                b.n(R.string.PhoneCopied, org.telegram.ui.Components.tc.a0(this.b));
                break;
            default:
                ye.d.s(this.b.getParentActivity(), "https://fragment.com/username/" + this.c);
                break;
        }
    }
}
