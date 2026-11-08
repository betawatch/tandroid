package org.telegram.ui;

import android.app.Activity;
import android.net.Uri;
import android.text.TextUtils;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class he implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ an b;
    public final /* synthetic */ String c;

    public /* synthetic */ he(an anVar, String str, int i7) {
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
                an.x1(anVar, str);
                break;
            case 1:
                an.W0(anVar, str);
                break;
            case 2:
                g4.d(str, anVar.currentAccount, anVar.l1, null, anVar.xa);
                break;
            case 3:
                if (str != null) {
                    anVar.getClass();
                    if (str.length() != 0) {
                        anVar.getMessagesController().A4(str, anVar.f);
                        break;
                    }
                }
                anVar.getSendMessagesHelper().r0(org.telegram.messenger.ez.b("/start", anVar.j6, null, null, null, false, null, null, null, true, 0, 0, null, false));
                break;
            case 4:
                anVar.La(str);
                break;
            case 5:
                anVar.Da(str, false);
                break;
            case 6:
                anVar.getClass();
                anVar.presentFragment(new org.telegram.ui.Wallet.m9(str));
                break;
            case 7:
                String str2 = anVar.getMessagesController().H6;
                if (TextUtils.isEmpty(str2)) {
                    str2 = "https://tonviewer.com/";
                } else if (!str2.endsWith("/")) {
                    str2 = str2.concat("/");
                }
                Activity parentActivity = anVar.getParentActivity();
                StringBuilder m10 = com.google.android.recaptcha.internal.a.m(str2);
                m10.append(Uri.encode(str));
                vf.c.v(parentActivity, m10.toString(), false);
                break;
            case 8:
                vf.c.t(anVar.getParentActivity(), "tel:" + str);
                break;
            case 9:
                org.telegram.messenger.g0.g(str);
                org.telegram.messenger.camera.q.r(null, 2131747296, org.telegram.ui.Components.hc.a0(anVar));
                break;
            case 10:
                an.l1(anVar, str);
                break;
            case 11:
                vf.c.t(anVar.getParentActivity(), "tel:" + str);
                break;
            case 12:
                org.telegram.messenger.g0.g(str);
                org.telegram.messenger.camera.q.r(null, 2131747296, org.telegram.ui.Components.hc.a0(anVar));
                break;
            default:
                vf.c.t(anVar.getParentActivity(), "https://fragment.com/username/" + str);
                break;
        }
    }
}
