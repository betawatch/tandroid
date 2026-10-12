package org.telegram.ui;

import android.app.Activity;
import android.net.Uri;
import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final /* synthetic */ class af implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ fo b;
    public final /* synthetic */ String c;

    public /* synthetic */ af(fo foVar, String str, int i10) {
        this.a = i10;
        this.b = foVar;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                fo.q1(this.b, this.c);
                break;
            case 1:
                fo.u1(this.b, this.c);
                break;
            case 2:
                k4.f(this.c, r1.currentAccount, r1.X0, null, this.b.ea);
                break;
            case 3:
                fo foVar = this.b;
                String str = this.c;
                if (str != null) {
                    foVar.getClass();
                    if (str.length() != 0) {
                        foVar.getMessagesController().sendBotStart(foVar.f, str);
                        break;
                    }
                }
                foVar.getSendMessagesHelper().sendMessage(SendMessagesHelper.SendMessageParams.of("/start", foVar.T5, null, null, null, false, null, null, null, true, 0, 0, null, false));
                break;
            case 4:
                this.b.qa(this.c);
                break;
            case 5:
                this.b.ia(this.c, false);
                break;
            case 6:
                pf.d.s(this.b.getParentActivity(), "tel:" + this.c);
                break;
            case 7:
                AndroidUtilities.addToClipboard(this.c);
                org.telegram.messenger.yh.o(R.string.PhoneCopied, org.telegram.ui.Components.zc.a0(this.b));
                break;
            case 8:
                fo.d1(this.b, this.c);
                break;
            case 9:
                pf.d.s(this.b.getParentActivity(), "tel:" + this.c);
                break;
            case 10:
                AndroidUtilities.addToClipboard(this.c);
                org.telegram.messenger.yh.o(R.string.PhoneCopied, org.telegram.ui.Components.zc.a0(this.b));
                break;
            case 11:
                fo foVar2 = this.b;
                foVar2.getClass();
                foVar2.presentFragment(new org.telegram.ui.Wallet.i8(this.c));
                break;
            case 12:
                fo foVar3 = this.b;
                String str2 = foVar3.getMessagesController().tonBlockchainExplorerUrl;
                if (TextUtils.isEmpty(str2)) {
                    str2 = "https://tonviewer.com/";
                } else if (!str2.endsWith("/")) {
                    str2 = str2.concat("/");
                }
                Activity parentActivity = foVar3.getParentActivity();
                StringBuilder u10 = a1.g.u(str2);
                u10.append(Uri.encode(this.c));
                pf.d.u(parentActivity, u10.toString());
                break;
            default:
                pf.d.s(this.b.getParentActivity(), "https://fragment.com/username/" + this.c);
                break;
        }
    }
}
