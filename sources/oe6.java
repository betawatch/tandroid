// default package

import android.os.Bundle;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class oe6 implements RequestDelegate {
    public final /* synthetic */ byte a;
    public final /* synthetic */ qh6 b;
    public final /* synthetic */ TLRPC.auth_SentCode c;
    public final /* synthetic */ Bundle d;
    public final /* synthetic */ boolean e;

    public /* synthetic */ oe6(byte b, qh6 qh6Var, Bundle bundle, TLRPC.auth_SentCode auth_sentcode, boolean z) {
        this.a = b;
        this.b = qh6Var;
        this.c = auth_sentcode;
        this.d = bundle;
        this.e = z;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                boolean z = tLObject instanceof TLRPC.TL_boolTrue;
                final qh6 qh6Var = this.b;
                final TLRPC.auth_SentCode auth_sentcode = this.c;
                final Bundle bundle = this.d;
                if (!z) {
                    qh6Var.getClass();
                    cc4.b("{SAFETYNET_REQUESTFIREBASESMS_FALSE} Resend firebase sms because auth.requestFirebaseSms = false");
                    qh6Var.H1(bundle, auth_sentcode, "SAFETYNET_REQUESTFIREBASESMS_FALSE");
                    break;
                } else {
                    qh6Var.y1(false, true);
                    qh6Var.r0 = false;
                    auth_sentcode.type.verifiedFirebase = true;
                    final byte b = 0;
                    final boolean z2 = this.e;
                    hl.c3(new Runnable() { // from class: pe6
                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (b) {
                                case 0:
                                    qh6Var.q1(bundle, auth_sentcode, z2);
                                    break;
                                default:
                                    qh6Var.q1(bundle, auth_sentcode, z2);
                                    break;
                            }
                        }
                    });
                    break;
                }
            default:
                boolean z3 = tLObject instanceof TLRPC.TL_boolTrue;
                final qh6 qh6Var2 = this.b;
                final TLRPC.auth_SentCode auth_sentcode2 = this.c;
                final Bundle bundle2 = this.d;
                if (!z3) {
                    qh6Var2.getClass();
                    cc4.b("{PLAYINTEGRITY_REQUESTFIREBASESMS_FALSE} Resend firebase sms because auth.requestFirebaseSms = false");
                    qh6Var2.H1(bundle2, auth_sentcode2, "PLAYINTEGRITY_REQUESTFIREBASESMS_FALSE");
                    break;
                } else {
                    qh6Var2.y1(false, true);
                    qh6Var2.r0 = false;
                    auth_sentcode2.type.verifiedFirebase = true;
                    final byte b2 = 1;
                    final boolean z4 = this.e;
                    hl.c3(new Runnable() { // from class: pe6
                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (b2) {
                                case 0:
                                    qh6Var2.q1(bundle2, auth_sentcode2, z4);
                                    break;
                                default:
                                    qh6Var2.q1(bundle2, auth_sentcode2, z4);
                                    break;
                            }
                        }
                    });
                    break;
                }
        }
    }
}
