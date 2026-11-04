package org.telegram.ui;

import android.app.Activity;
import android.net.Uri;
import android.text.TextUtils;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class fe implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ wm b;
    public final /* synthetic */ String c;

    public /* synthetic */ fe(wm wmVar, String str, int i3) {
        this.a = i3;
        this.b = wmVar;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i3 = this.a;
        String str = this.c;
        wm wmVar = this.b;
        switch (i3) {
            case 0:
                wm.x1(wmVar, str);
                break;
            case 1:
                wm.W0(wmVar, str);
                break;
            case 2:
                i4.d(str, wmVar.currentAccount, wmVar.m1, null, wmVar.ya);
                break;
            case 3:
                if (str != null) {
                    wmVar.getClass();
                    if (str.length() != 0) {
                        wmVar.getMessagesController().A4(str, wmVar.f);
                        break;
                    }
                }
                wmVar.getSendMessagesHelper().r0(org.telegram.messenger.wy.b("/start", wmVar.k6, null, null, null, false, null, null, null, true, 0, 0, null, false));
                break;
            case 4:
                wmVar.La(str);
                break;
            case 5:
                wmVar.Da(str, false);
                break;
            case 6:
                wmVar.getClass();
                wmVar.presentFragment(new org.telegram.ui.Wallet.m9(str));
                break;
            case 7:
                String str2 = wmVar.getMessagesController().H6;
                if (TextUtils.isEmpty(str2)) {
                    str2 = "https://tonviewer.com/";
                } else if (!str2.endsWith("/")) {
                    str2 = str2.concat("/");
                }
                Activity parentActivity = wmVar.getParentActivity();
                StringBuilder l10 = com.google.android.recaptcha.internal.a.l(str2);
                l10.append(Uri.encode(str));
                sf.c.v(parentActivity, l10.toString(), false);
                break;
            case 8:
                sf.c.t(wmVar.getParentActivity(), "tel:" + str);
                break;
            case 9:
                org.telegram.messenger.g0.g(str);
                org.telegram.messenger.camera.q.r(null, 2131747303, org.telegram.ui.Components.fc.a0(wmVar));
                break;
            case 10:
                wm.l1(wmVar, str);
                break;
            case 11:
                sf.c.t(wmVar.getParentActivity(), "tel:" + str);
                break;
            case 12:
                org.telegram.messenger.g0.g(str);
                org.telegram.messenger.camera.q.r(null, 2131747303, org.telegram.ui.Components.fc.a0(wmVar));
                break;
            default:
                sf.c.t(wmVar.getParentActivity(), "https://fragment.com/username/" + str);
                break;
        }
    }
}
