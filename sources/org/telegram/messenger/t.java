package org.telegram.messenger;

import android.content.Intent;
import android.text.TextUtils;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final /* synthetic */ class t implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Intent b;

    public /* synthetic */ t(Intent intent, int i10) {
        this.a = i10;
        this.b = intent;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                Intent intent = this.b;
                try {
                    int i10 = e20.s0;
                    w0.w();
                    if (!i0.p2(false) && !uz.C) {
                        String stringExtra = intent.getStringExtra("android.intent.extra.TEXT");
                        if (!TextUtils.isEmpty(stringExtra)) {
                            String stringExtra2 = intent.getStringExtra("com.google.android.voicesearch.extra.RECIPIENT_CONTACT_URI");
                            long parseLong = Long.parseLong(intent.getStringExtra("com.google.android.voicesearch.extra.RECIPIENT_CONTACT_CHAT_ID"));
                            TLRPC.User Z1 = wp.r1(i10).Z1(Long.valueOf(parseLong));
                            if (Z1 == null && (Z1 = is.a0(i10).k0(parseLong)) != null) {
                                wp.r1(i10).U3(Z1, true, false);
                            }
                            if (Z1 != null) {
                                i5.r(i10);
                                if (stringExtra2 != null) {
                                    Utilities.h.c(new o4(stringExtra2, 0));
                                }
                                rz.C(i10).r0(pz.b(stringExtra, Z1.id, null, null, null, true, null, null, null, true, 0, 0, null, false));
                                break;
                            }
                        }
                    }
                } catch (Exception e) {
                    f8.g(e, true);
                    return;
                }
                break;
            case 1:
                w0.b.sendBroadcast(this.b);
                break;
            case 2:
                w0.b.sendBroadcast(this.b);
                break;
            case 3:
                w0.b.sendBroadcast(this.b);
                break;
            case 4:
                try {
                    w0.b.sendBroadcast(this.b);
                    break;
                } catch (Exception unused) {
                    return;
                }
            default:
                w0.b.sendBroadcast(this.b);
                break;
        }
    }
}
