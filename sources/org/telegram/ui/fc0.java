package org.telegram.ui;

import android.os.Bundle;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class fc0 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ hf0 b;
    public final /* synthetic */ TLRPC.auth_SentCode c;
    public final /* synthetic */ Bundle d;
    public final /* synthetic */ boolean e;

    public /* synthetic */ fc0(int i10, Bundle bundle, TLRPC.auth_SentCode auth_sentcode, hf0 hf0Var, boolean z10) {
        this.a = i10;
        this.b = hf0Var;
        this.c = auth_sentcode;
        this.d = bundle;
        this.e = z10;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                boolean z10 = tLObject instanceof TLRPC.TL_boolTrue;
                final hf0 hf0Var = this.b;
                final TLRPC.auth_SentCode auth_sentcode = this.c;
                final Bundle bundle = this.d;
                if (!z10) {
                    org.telegram.messenger.f8.b("{SAFETYNET_REQUESTFIREBASESMS_FALSE} Resend firebase sms because auth.requestFirebaseSms = false");
                    hf0Var.A1(bundle, auth_sentcode, "SAFETYNET_REQUESTFIREBASESMS_FALSE");
                    break;
                } else {
                    hf0Var.s1(false, true);
                    hf0Var.p0 = false;
                    auth_sentcode.type.verifiedFirebase = true;
                    final int i10 = 0;
                    final boolean z11 = this.e;
                    org.telegram.messenger.i0.g3(new Runnable() { // from class: org.telegram.ui.gc0
                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i10) {
                                case 0:
                                    hf0Var.o1(bundle, auth_sentcode, z11);
                                    break;
                                default:
                                    hf0Var.o1(bundle, auth_sentcode, z11);
                                    break;
                            }
                        }
                    });
                    break;
                }
            default:
                boolean z12 = tLObject instanceof TLRPC.TL_boolTrue;
                final hf0 hf0Var2 = this.b;
                final TLRPC.auth_SentCode auth_sentcode2 = this.c;
                final Bundle bundle2 = this.d;
                if (!z12) {
                    org.telegram.messenger.f8.b("{PLAYINTEGRITY_REQUESTFIREBASESMS_FALSE} Resend firebase sms because auth.requestFirebaseSms = false");
                    hf0Var2.A1(bundle2, auth_sentcode2, "PLAYINTEGRITY_REQUESTFIREBASESMS_FALSE");
                    break;
                } else {
                    hf0Var2.s1(false, true);
                    hf0Var2.p0 = false;
                    auth_sentcode2.type.verifiedFirebase = true;
                    final int i11 = 1;
                    final boolean z13 = this.e;
                    org.telegram.messenger.i0.g3(new Runnable() { // from class: org.telegram.ui.gc0
                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i11) {
                                case 0:
                                    hf0Var2.o1(bundle2, auth_sentcode2, z13);
                                    break;
                                default:
                                    hf0Var2.o1(bundle2, auth_sentcode2, z13);
                                    break;
                            }
                        }
                    });
                    break;
                }
        }
    }
}
