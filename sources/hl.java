// default package

import android.content.Intent;
import android.text.TextUtils;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class hl implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Intent b;

    public /* synthetic */ hl(Intent intent, byte b) {
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
                    int i = z8c.t0;
                    a.v();
                    byte b2 = 0;
                    if (!gm.n2(false) && !gda.B) {
                        String stringExtra = intent.getStringExtra("android.intent.extra.TEXT");
                        if (!TextUtils.isEmpty(stringExtra)) {
                            String stringExtra2 = intent.getStringExtra("com.google.android.voicesearch.extra.RECIPIENT_CONTACT_URI");
                            long parseLong = Long.parseLong(intent.getStringExtra("com.google.android.voicesearch.extra.RECIPIENT_CONTACT_CHAT_ID"));
                            TLRPC.User W1 = oc7.r1(i).W1(Long.valueOf(parseLong));
                            if (W1 == null && (W1 = cf7.Y(i).h0(parseLong)) != null) {
                                oc7.r1(i).c4(W1, true, false);
                            }
                            if (W1 != null) {
                                bw2.r(i);
                                if (stringExtra2 != null) {
                                    Utilities.h.c(new iv2(stringExtra2, b2));
                                }
                                a6a.B(i).q0(y5a.b(stringExtra, W1.id, null, null, null, true, null, null, null, true, 0, 0, null, false));
                                break;
                            }
                        }
                    }
                } catch (Exception e) {
                    fc4.g(e, true);
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
