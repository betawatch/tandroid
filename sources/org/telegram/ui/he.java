package org.telegram.ui;

import android.app.Activity;
import android.net.Uri;
import android.text.TextUtils;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class he implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ cn b;
    public final /* synthetic */ String c;

    public /* synthetic */ he(cn cnVar, String str, int i7) {
        this.a = i7;
        this.b = cnVar;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        String str = this.c;
        cn cnVar = this.b;
        switch (i7) {
            case 0:
                cn.t1(cnVar, str);
                break;
            case 1:
                cn.B1(cnVar, str);
                break;
            case 2:
                g4.d(str, cnVar.currentAccount, cnVar.l1, null, cnVar.za);
                break;
            case 3:
                if (str != null) {
                    cnVar.getClass();
                    if (str.length() != 0) {
                        cnVar.getMessagesController().A4(str, cnVar.f);
                        break;
                    }
                }
                cnVar.getSendMessagesHelper().r0(org.telegram.messenger.ez.b("/start", cnVar.j6, null, null, null, false, null, null, null, true, 0, 0, null, false));
                break;
            case 4:
                cnVar.Na(str);
                break;
            case 5:
                cnVar.getClass();
                cnVar.presentFragment(new org.telegram.ui.Wallet.l9(str));
                break;
            case 6:
                String str2 = cnVar.getMessagesController().H6;
                if (TextUtils.isEmpty(str2)) {
                    str2 = "https://tonviewer.com/";
                } else if (!str2.endsWith("/")) {
                    str2 = str2.concat("/");
                }
                Activity parentActivity = cnVar.getParentActivity();
                StringBuilder m10 = com.google.android.recaptcha.internal.a.m(str2);
                m10.append(Uri.encode(str));
                vf.c.v(parentActivity, m10.toString(), false);
                break;
            case 7:
                cnVar.Fa(str, false);
                break;
            case 8:
                vf.c.t(cnVar.getParentActivity(), "tel:" + str);
                break;
            case 9:
                org.telegram.messenger.g0.g(str);
                org.telegram.messenger.camera.q.r(null, 2131747295, org.telegram.ui.Components.hc.a0(cnVar));
                break;
            case 10:
                cn.a0(cnVar, str);
                break;
            case 11:
                vf.c.t(cnVar.getParentActivity(), "tel:" + str);
                break;
            case 12:
                org.telegram.messenger.g0.g(str);
                org.telegram.messenger.camera.q.r(null, 2131747295, org.telegram.ui.Components.hc.a0(cnVar));
                break;
            default:
                vf.c.t(cnVar.getParentActivity(), "https://fragment.com/username/" + str);
                break;
        }
    }
}
