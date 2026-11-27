// default package

import android.content.Intent;
import android.text.TextUtils;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
                    int i = yac.t0;
                    a.v();
                    byte b2 = 0;
                    if (!hl.n2(false) && !xea.B) {
                        String stringExtra = intent.getStringExtra("android.intent.extra.TEXT");
                        if (!TextUtils.isEmpty(stringExtra)) {
                            String stringExtra2 = intent.getStringExtra("com.google.android.voicesearch.extra.RECIPIENT_CONTACT_URI");
                            long parseLong = Long.parseLong(intent.getStringExtra("com.google.android.voicesearch.extra.RECIPIENT_CONTACT_CHAT_ID"));
                            TLRPC.User X1 = uc7.s1(i).X1(Long.valueOf(parseLong));
                            if (X1 == null && (X1 = jf7.Y(i).h0(parseLong)) != null) {
                                uc7.s1(i).i4(X1, true, false);
                            }
                            if (X1 != null) {
                                lv2.r(i);
                                if (stringExtra2 != null) {
                                    Utilities.h.c(new qu2(stringExtra2, b2));
                                }
                                r7a.B(i).q0(p7a.b(stringExtra, X1.id, null, null, null, true, null, null, null, true, 0, 0, null, false));
                                break;
                            }
                        }
                    }
                } catch (Exception e) {
                    cc4.g(e, true);
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
