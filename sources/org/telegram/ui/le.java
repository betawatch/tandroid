package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class le implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ rn b;
    public final /* synthetic */ String c;

    public /* synthetic */ le(rn rnVar, String str, int i10) {
        this.a = i10;
        this.b = rnVar;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                rn.W0(this.b, this.c);
                break;
            case 1:
                rn.h1(this.b, this.c);
                break;
            case 2:
                m4.f(this.c, r1.currentAccount, r1.T0, null, this.b.aa);
                break;
            case 3:
                rn rnVar = this.b;
                String str = this.c;
                if (str != null) {
                    rnVar.getClass();
                    if (str.length() != 0) {
                        rnVar.getMessagesController().sendBotStart(rnVar.f, str);
                        break;
                    }
                }
                rnVar.getSendMessagesHelper().sendMessage(SendMessagesHelper.SendMessageParams.of("/start", rnVar.P5, null, null, null, false, null, null, null, true, 0, 0, null, false));
                break;
            case 4:
                this.b.la(this.c);
                break;
            case 5:
                this.b.da(this.c, false);
                break;
            case 6:
                we.e.s(this.b.getParentActivity(), "tel:" + this.c);
                break;
            case 7:
                AndroidUtilities.addToClipboard(this.c);
                org.telegram.messenger.rl.m(R.string.PhoneCopied, org.telegram.ui.Components.mc.a0(this.b));
                break;
            case 8:
                rn.u1(this.b, this.c);
                break;
            case 9:
                we.e.s(this.b.getParentActivity(), "tel:" + this.c);
                break;
            case 10:
                AndroidUtilities.addToClipboard(this.c);
                org.telegram.messenger.rl.m(R.string.PhoneCopied, org.telegram.ui.Components.mc.a0(this.b));
                break;
            default:
                we.e.s(this.b.getParentActivity(), "https://fragment.com/username/" + this.c);
                break;
        }
    }
}
