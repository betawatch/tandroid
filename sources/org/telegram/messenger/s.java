package org.telegram.messenger;

import android.content.Intent;
import android.text.TextUtils;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public final /* synthetic */ class s implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Intent b;

    public /* synthetic */ s(Intent intent, int i7) {
        this.a = i7;
        this.b = intent;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                Intent intent = this.b;
                try {
                    int i7 = i10.t0;
                    t0.w();
                    if (!g0.p2(false) && !bz.C) {
                        String stringExtra = intent.getStringExtra("android.intent.extra.TEXT");
                        if (!TextUtils.isEmpty(stringExtra)) {
                            String stringExtra2 = intent.getStringExtra("com.google.android.voicesearch.extra.RECIPIENT_CONTACT_URI");
                            long parseLong = Long.parseLong(intent.getStringExtra("com.google.android.voicesearch.extra.RECIPIENT_CONTACT_CHAT_ID"));
                            TLRPC.User c22 = mp.u1(i7).c2(Long.valueOf(parseLong));
                            if (c22 == null && (c22 = tr.a0(i7).k0(parseLong)) != null) {
                                mp.u1(i7).e4(c22, true, false);
                            }
                            if (c22 != null) {
                                i5.r(i7);
                                if (stringExtra2 != null) {
                                    Utilities.h.c(new n4(stringExtra2, 0));
                                }
                                zy.C(i7).r0(xy.b(stringExtra, c22.id, null, null, null, true, null, null, null, true, 0, 0, null, false));
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
