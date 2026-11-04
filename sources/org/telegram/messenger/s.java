package org.telegram.messenger;

import android.content.Intent;
import android.text.TextUtils;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class s implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Intent b;

    public /* synthetic */ s(Intent intent, int i3) {
        this.a = i3;
        this.b = intent;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                Intent intent = this.b;
                try {
                    int i3 = h10.t0;
                    t0.w();
                    if (!g0.p2(false) && !az.C) {
                        String stringExtra = intent.getStringExtra("android.intent.extra.TEXT");
                        if (!TextUtils.isEmpty(stringExtra)) {
                            String stringExtra2 = intent.getStringExtra("com.google.android.voicesearch.extra.RECIPIENT_CONTACT_URI");
                            long parseLong = Long.parseLong(intent.getStringExtra("com.google.android.voicesearch.extra.RECIPIENT_CONTACT_CHAT_ID"));
                            TLRPC.User a22 = hp.s1(i3).a2(Long.valueOf(parseLong));
                            if (a22 == null && (a22 = qr.a0(i3).k0(parseLong)) != null) {
                                hp.s1(i3).X3(a22, true, false);
                            }
                            if (a22 != null) {
                                g5.r(i3);
                                if (stringExtra2 != null) {
                                    Utilities.h.c(new l4(stringExtra2, 0));
                                }
                                yy.C(i3).r0(wy.b(stringExtra, a22.id, null, null, null, true, null, null, null, true, 0, 0, null, false));
                                break;
                            }
                        }
                    }
                } catch (Exception e10) {
                    a8.g(e10, true);
                    return;
                }
                break;
            case 1:
                t0.b.sendBroadcast(this.b);
                break;
            case 2:
                t0.b.sendBroadcast(this.b);
                break;
            case 3:
                t0.b.sendBroadcast(this.b);
                break;
            case 4:
                try {
                    t0.b.sendBroadcast(this.b);
                    break;
                } catch (Exception unused) {
                    return;
                }
            default:
                t0.b.sendBroadcast(this.b);
                break;
        }
    }
}
