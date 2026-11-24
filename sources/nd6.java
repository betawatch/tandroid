// default package

import android.os.Bundle;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class nd6 implements Runnable {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ qd6 b;
    public final /* synthetic */ TLRPC.TL_error c;
    public final /* synthetic */ Bundle d;
    public final /* synthetic */ TLObject e;

    public /* synthetic */ nd6(qd6 qd6Var, TLObject tLObject, Bundle bundle, TLRPC.TL_error tL_error) {
        this.b = qd6Var;
        this.e = tLObject;
        this.d = bundle;
        this.c = tL_error;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        byte b = this.a;
        TLObject tLObject = this.e;
        Bundle bundle = this.d;
        TLRPC.TL_error tL_error = this.c;
        qd6 qd6Var = this.b;
        switch (b) {
            case 0:
                mf6 mf6Var = qd6Var.b0;
                qd6Var.N = false;
                qd6Var.w.invalidate();
                if (tLObject == null) {
                    if (tL_error != null && (str = tL_error.text) != null) {
                        if (!str.contains("PHONE_NUMBER_INVALID")) {
                            if (!tL_error.text.contains("PHONE_CODE_EMPTY") && !tL_error.text.contains("PHONE_CODE_INVALID")) {
                                if (!tL_error.text.contains("PHONE_CODE_EXPIRED")) {
                                    if (!tL_error.text.startsWith("FLOOD_WAIT")) {
                                        if (tL_error.code != -1000) {
                                            mf6Var.y1(k96.M0(2131745878, null), k96.M0(2131751093, null) + "\n" + tL_error.text);
                                            break;
                                        }
                                    } else {
                                        mf6Var.y1(k96.M0(2131745878, null), k96.M0(2131750670, null));
                                        break;
                                    }
                                } else {
                                    qd6Var.d(true);
                                    mf6Var.I1(0, true, null, true);
                                    mf6Var.y1(k96.M0(2131745878, null), k96.M0(2131752009, null));
                                    break;
                                }
                            } else {
                                mf6Var.y1(k96.M0(2131745878, null), k96.M0(2131748991, null));
                                break;
                            }
                        } else {
                            mf6Var.y1(k96.M0(2131745878, null), k96.M0(2131748987, null));
                            break;
                        }
                    }
                } else {
                    qd6Var.T = bundle;
                    TLRPC.TL_auth_sentCode tL_auth_sentCode = (TLRPC.TL_auth_sentCode) tLObject;
                    qd6Var.U = tL_auth_sentCode;
                    mf6Var.p1(bundle, tL_auth_sentCode, true);
                    break;
                }
                break;
            default:
                mf6 mf6Var2 = qd6Var.b0;
                qd6Var.S = false;
                if (tL_error == null) {
                    mf6Var2.p1(bundle, (TLRPC.TL_auth_sentCode) tLObject, true);
                } else {
                    String str2 = tL_error.text;
                    if (str2 != null) {
                        if (str2.contains("PHONE_NUMBER_INVALID")) {
                            mf6Var2.y1(k96.M0(2131745878, null), k96.M0(2131748987, null));
                        } else if (tL_error.text.contains("PHONE_CODE_EMPTY") || tL_error.text.contains("PHONE_CODE_INVALID")) {
                            mf6Var2.y1(k96.M0(2131745878, null), k96.M0(2131748991, null));
                        } else if (tL_error.text.contains("PHONE_CODE_EXPIRED")) {
                            qd6Var.d(true);
                            mf6Var2.I1(0, true, null, true);
                            mf6Var2.y1(k96.M0(2131745878, null), k96.M0(2131752009, null));
                        } else if (tL_error.text.startsWith("FLOOD_WAIT")) {
                            mf6Var2.y1(k96.M0(2131745878, null), k96.M0(2131750670, null));
                        } else if (tL_error.code != -1000) {
                            mf6Var2.y1(k96.M0(2131745878, null), k96.M0(2131751093, null) + "\n" + tL_error.text);
                        }
                    }
                }
                mf6Var2.x1(false, true);
                break;
        }
    }

    public /* synthetic */ nd6(qd6 qd6Var, TLRPC.TL_error tL_error, Bundle bundle, TLObject tLObject) {
        this.b = qd6Var;
        this.c = tL_error;
        this.d = bundle;
        this.e = tLObject;
    }
}
