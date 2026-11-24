// default package

import android.content.Intent;
import android.text.TextUtils;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final /* synthetic */ class hk implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Intent b;

    public /* synthetic */ hk(Intent intent, byte b) {
        this.a = b;
        this.b = intent;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        Intent intent = this.b;
        switch (b) {
            case 0:
                try {
                    int i = y6c.t0;
                    a.v();
                    byte b2 = 0;
                    if (!gl.n2(false) && !gba.B) {
                        String stringExtra = intent.getStringExtra("android.intent.extra.TEXT");
                        if (!TextUtils.isEmpty(stringExtra)) {
                            String stringExtra2 = intent.getStringExtra("com.google.android.voicesearch.extra.RECIPIENT_CONTACT_URI");
                            long parseLong = Long.parseLong(intent.getStringExtra("com.google.android.voicesearch.extra.RECIPIENT_CONTACT_CHAT_ID"));
                            TLRPC.User V1 = na7.q1(i).V1(Long.valueOf(parseLong));
                            if (V1 == null && (V1 = ad7.Y(i).h0(parseLong)) != null) {
                                na7.q1(i).a4(V1, true, false);
                            }
                            if (V1 != null) {
                                qu2.r(i);
                                if (stringExtra2 != null) {
                                    Utilities.h.c(new xt2(stringExtra2, b2));
                                }
                                z3a.B(i).q0(x3a.b(stringExtra, V1.id, null, null, null, true, null, null, null, true, 0, 0, null, false));
                                break;
                            }
                        }
                    }
                } catch (Exception e) {
                    fa4.g(e, true);
                    return;
                }
                break;
            case 1:
                a.b.sendBroadcast(intent);
                break;
            case 2:
                a.b.sendBroadcast(intent);
                break;
            case 3:
                a.b.sendBroadcast(intent);
                break;
            case 4:
                try {
                    a.b.sendBroadcast(intent);
                    break;
                } catch (Exception unused) {
                    return;
                }
            default:
                a.b.sendBroadcast(intent);
                break;
        }
    }
}
