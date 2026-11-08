package org.telegram.ui;

import android.os.Bundle;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class bc0 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ ec0 b;
    public final /* synthetic */ TLRPC.TL_error c;
    public final /* synthetic */ Bundle d;
    public final /* synthetic */ TLObject e;

    public /* synthetic */ bc0(ec0 ec0Var, TLObject tLObject, Bundle bundle, TLRPC.TL_error tL_error) {
        this.b = ec0Var;
        this.e = tLObject;
        this.d = bundle;
        this.c = tL_error;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        int i7 = this.a;
        TLObject tLObject = this.e;
        Bundle bundle = this.d;
        TLRPC.TL_error tL_error = this.c;
        ec0 ec0Var = this.b;
        switch (i7) {
            case 0:
                ce0 ce0Var = ec0Var.a0;
                ec0Var.M = false;
                ec0Var.w.invalidate();
                if (tLObject == null) {
                    if (tL_error != null && (str = tL_error.text) != null) {
                        if (!str.contains("PHONE_NUMBER_INVALID")) {
                            if (!tL_error.text.contains("PHONE_CODE_EMPTY") && !tL_error.text.contains("PHONE_CODE_INVALID")) {
                                if (!tL_error.text.contains("PHONE_CODE_EXPIRED")) {
                                    if (!tL_error.text.startsWith("FLOOD_WAIT")) {
                                        if (tL_error.code != -1000) {
                                            String M0 = org.telegram.messenger.id.M0(2131746074, null);
                                            StringBuilder sb2 = new StringBuilder();
                                            org.telegram.messenger.camera.q.q(null, 2131751106, sb2, "\n");
                                            sb2.append(tL_error.text);
                                            ce0Var.D1(M0, sb2.toString());
                                            break;
                                        }
                                    } else {
                                        ce0Var.D1(org.telegram.messenger.id.M0(2131746074, null), org.telegram.messenger.id.M0(2131750688, null));
                                        break;
                                    }
                                } else {
                                    ec0Var.c(true);
                                    ce0Var.M1(0, true, null, true);
                                    ce0Var.D1(org.telegram.messenger.id.M0(2131746074, null), org.telegram.messenger.id.M0(2131752021, null));
                                    break;
                                }
                            } else {
                                ce0Var.D1(org.telegram.messenger.id.M0(2131746074, null), org.telegram.messenger.id.M0(2131749184, null));
                                break;
                            }
                        } else {
                            ce0Var.D1(org.telegram.messenger.id.M0(2131746074, null), org.telegram.messenger.id.M0(2131749180, null));
                            break;
                        }
                    }
                } else {
                    ec0Var.S = bundle;
                    TLRPC.TL_auth_sentCode tL_auth_sentCode = (TLRPC.TL_auth_sentCode) tLObject;
                    ec0Var.T = tL_auth_sentCode;
                    ce0Var.y1(bundle, tL_auth_sentCode, true);
                    break;
                }
                break;
            default:
                ce0 ce0Var2 = ec0Var.a0;
                ec0Var.R = false;
                if (tL_error == null) {
                    ce0Var2.y1(bundle, (TLRPC.TL_auth_sentCode) tLObject, true);
                } else {
                    String str2 = tL_error.text;
                    if (str2 != null) {
                        if (str2.contains("PHONE_NUMBER_INVALID")) {
                            ce0Var2.D1(org.telegram.messenger.id.M0(2131746074, null), org.telegram.messenger.id.M0(2131749180, null));
                        } else if (tL_error.text.contains("PHONE_CODE_EMPTY") || tL_error.text.contains("PHONE_CODE_INVALID")) {
                            ce0Var2.D1(org.telegram.messenger.id.M0(2131746074, null), org.telegram.messenger.id.M0(2131749184, null));
                        } else if (tL_error.text.contains("PHONE_CODE_EXPIRED")) {
                            ec0Var.c(true);
                            ce0Var2.M1(0, true, null, true);
                            ce0Var2.D1(org.telegram.messenger.id.M0(2131746074, null), org.telegram.messenger.id.M0(2131752021, null));
                        } else if (tL_error.text.startsWith("FLOOD_WAIT")) {
                            ce0Var2.D1(org.telegram.messenger.id.M0(2131746074, null), org.telegram.messenger.id.M0(2131750688, null));
                        } else if (tL_error.code != -1000) {
                            String M02 = org.telegram.messenger.id.M0(2131746074, null);
                            StringBuilder sb3 = new StringBuilder();
                            org.telegram.messenger.camera.q.q(null, 2131751106, sb3, "\n");
                            sb3.append(tL_error.text);
                            ce0Var2.D1(M02, sb3.toString());
                        }
                    }
                }
                ce0Var2.C1(false, true);
                break;
        }
    }

    public /* synthetic */ bc0(ec0 ec0Var, TLRPC.TL_error tL_error, Bundle bundle, TLObject tLObject) {
        this.b = ec0Var;
        this.c = tL_error;
        this.d = bundle;
        this.e = tLObject;
    }
}
