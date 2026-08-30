package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class gd0 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ ng0 b;
    public final /* synthetic */ TLRPC.auth_SentCode c;
    public final /* synthetic */ Bundle d;
    public final /* synthetic */ boolean e;

    public /* synthetic */ gd0(int i10, Bundle bundle, TLRPC.auth_SentCode auth_sentcode, ng0 ng0Var, boolean z4) {
        this.a = i10;
        this.b = ng0Var;
        this.c = auth_sentcode;
        this.d = bundle;
        this.e = z4;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                boolean z4 = tLObject instanceof TLRPC.TL_boolTrue;
                final ng0 ng0Var = this.b;
                final TLRPC.auth_SentCode auth_sentcode = this.c;
                final Bundle bundle = this.d;
                if (!z4) {
                    FileLog.d("{PLAYINTEGRITY_REQUESTFIREBASESMS_FALSE} Resend firebase sms because auth.requestFirebaseSms = false");
                    ng0Var.s1(bundle, auth_sentcode, "PLAYINTEGRITY_REQUESTFIREBASESMS_FALSE");
                    break;
                } else {
                    ng0Var.k1(false, true);
                    ng0Var.l0 = false;
                    auth_sentcode.type.verifiedFirebase = true;
                    final int i10 = 1;
                    final boolean z10 = this.e;
                    AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.id0
                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i10) {
                                case 0:
                                    ng0Var.g1(bundle, auth_sentcode, z10);
                                    break;
                                default:
                                    ng0Var.g1(bundle, auth_sentcode, z10);
                                    break;
                            }
                        }
                    });
                    break;
                }
            default:
                boolean z11 = tLObject instanceof TLRPC.TL_boolTrue;
                final ng0 ng0Var2 = this.b;
                final TLRPC.auth_SentCode auth_sentcode2 = this.c;
                final Bundle bundle2 = this.d;
                if (!z11) {
                    FileLog.d("{SAFETYNET_REQUESTFIREBASESMS_FALSE} Resend firebase sms because auth.requestFirebaseSms = false");
                    ng0Var2.s1(bundle2, auth_sentcode2, "SAFETYNET_REQUESTFIREBASESMS_FALSE");
                    break;
                } else {
                    ng0Var2.k1(false, true);
                    ng0Var2.l0 = false;
                    auth_sentcode2.type.verifiedFirebase = true;
                    final int i11 = 0;
                    final boolean z12 = this.e;
                    AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.id0
                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i11) {
                                case 0:
                                    ng0Var2.g1(bundle2, auth_sentcode2, z12);
                                    break;
                                default:
                                    ng0Var2.g1(bundle2, auth_sentcode2, z12);
                                    break;
                            }
                        }
                    });
                    break;
                }
        }
    }
}
