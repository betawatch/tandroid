package org.telegram.ui;

import android.app.Activity;
import android.net.Uri;
import android.text.TextUtils;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class ee implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ an b;
    public final /* synthetic */ String c;

    public /* synthetic */ ee(an anVar, String str, int i7) {
        this.a = i7;
        this.b = anVar;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        String str = this.c;
        an anVar = this.b;
        switch (i7) {
            case 0:
                an.t1(anVar, str);
                break;
            case 1:
                an.B1(anVar, str);
                break;
            case 2:
                g4.d(str, anVar.currentAccount, anVar.m1, null, anVar.Aa);
                break;
            case 3:
                if (str != null) {
                    anVar.getClass();
                    if (str.length() != 0) {
                        anVar.getMessagesController().A4(str, anVar.f);
                        break;
                    }
                }
                anVar.getSendMessagesHelper().r0(org.telegram.messenger.cz.b("/start", anVar.k6, null, null, null, false, null, null, null, true, 0, 0, null, false));
                break;
            case 4:
                anVar.Oa(str);
                break;
            case 5:
                anVar.getClass();
                anVar.presentFragment(new org.telegram.ui.Wallet.p9(str));
                break;
            case 6:
                String str2 = anVar.getMessagesController().I6;
                if (TextUtils.isEmpty(str2)) {
                    str2 = "https://tonviewer.com/";
                } else if (!str2.endsWith("/")) {
                    str2 = str2.concat("/");
                }
                Activity parentActivity = anVar.getParentActivity();
                StringBuilder m10 = com.google.android.gms.internal.vision.e2.m(str2);
                m10.append(Uri.encode(str));
                vf.c.v(parentActivity, m10.toString(), false);
                break;
            case 7:
                anVar.Ga(str, false);
                break;
            case 8:
                vf.c.t(anVar.getParentActivity(), "tel:" + str);
                break;
            case 9:
                org.telegram.messenger.g0.g(str);
                org.telegram.messenger.i20.s(null, 2131747295, org.telegram.ui.Components.cc.a0(anVar));
                break;
            case 10:
                an.a0(anVar, str);
                break;
            case 11:
                vf.c.t(anVar.getParentActivity(), "tel:" + str);
                break;
            case 12:
                org.telegram.messenger.g0.g(str);
                org.telegram.messenger.i20.s(null, 2131747295, org.telegram.ui.Components.cc.a0(anVar));
                break;
            default:
                vf.c.t(anVar.getParentActivity(), "https://fragment.com/username/" + str);
                break;
        }
    }
}
