package org.telegram.ui;

import android.app.Activity;
import android.net.Uri;
import android.text.TextUtils;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ge implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ bn b;
    public final /* synthetic */ String c;

    public /* synthetic */ ge(bn bnVar, String str, int i7) {
        this.a = i7;
        this.b = bnVar;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        String str = this.c;
        bn bnVar = this.b;
        switch (i7) {
            case 0:
                bn.t1(bnVar, str);
                break;
            case 1:
                bn.B1(bnVar, str);
                break;
            case 2:
                g4.d(str, bnVar.currentAccount, bnVar.m1, null, bnVar.Ba);
                break;
            case 3:
                if (str != null) {
                    bnVar.getClass();
                    if (str.length() != 0) {
                        bnVar.getMessagesController().K4(str, bnVar.f);
                        break;
                    }
                }
                bnVar.getSendMessagesHelper().r0(org.telegram.messenger.xy.b("/start", bnVar.l6, null, null, null, false, null, null, null, true, 0, 0, null, false));
                break;
            case 4:
                bnVar.Oa(str);
                break;
            case 5:
                bnVar.getClass();
                bnVar.presentFragment(new org.telegram.ui.Wallet.da(str));
                break;
            case 6:
                String str2 = bnVar.getMessagesController().K6;
                if (TextUtils.isEmpty(str2)) {
                    str2 = "https://tonviewer.com/";
                } else if (!str2.endsWith("/")) {
                    str2 = str2.concat("/");
                }
                Activity parentActivity = bnVar.getParentActivity();
                StringBuilder m10 = com.google.android.gms.internal.vision.e2.m(str2);
                m10.append(Uri.encode(str));
                vf.c.v(parentActivity, m10.toString(), false);
                break;
            case 7:
                bnVar.Ga(str, false);
                break;
            case 8:
                vf.c.t(bnVar.getParentActivity(), "tel:" + str);
                break;
            case 9:
                org.telegram.messenger.g0.g(str);
                org.telegram.messenger.n10.t(null, 2131747101, org.telegram.ui.Components.lc.b0(bnVar));
                break;
            case 10:
                bn.a0(bnVar, str);
                break;
            case 11:
                vf.c.t(bnVar.getParentActivity(), "tel:" + str);
                break;
            case 12:
                org.telegram.messenger.g0.g(str);
                org.telegram.messenger.n10.t(null, 2131747101, org.telegram.ui.Components.lc.b0(bnVar));
                break;
            default:
                vf.c.t(bnVar.getParentActivity(), "https://fragment.com/username/" + str);
                break;
        }
    }
}
