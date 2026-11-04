package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class bo implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ w2 b;

    public /* synthetic */ bo(w2 w2Var, int i3) {
        this.a = i3;
        this.b = w2Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        String str;
        int i3;
        String str2;
        int i10;
        switch (this.a) {
            case 0:
                boolean z10 = tLObject instanceof TLRPC.TL_help_appConfigNotModified;
                w2 w2Var = this.b;
                if (!z10) {
                    if (!(tLObject instanceof TLRPC.TL_help_appConfig)) {
                        StringBuilder sb2 = new StringBuilder("getting appconfig error ");
                        if (tL_error != null) {
                            str = tL_error.code + " " + tL_error.text;
                        } else {
                            str = "";
                        }
                        sb2.append(str);
                        a8.d(sb2.toString());
                        w2Var.a(Boolean.FALSE, null, 0L, Boolean.valueOf(tL_error == null || !((i3 = tL_error.code) == -2000 || i3 == -2001)));
                        break;
                    } else {
                        w2Var.a(Boolean.FALSE, (TLRPC.TL_help_appConfig) tLObject, Long.valueOf(r6.hash), Boolean.TRUE);
                        break;
                    }
                } else {
                    Boolean bool = Boolean.TRUE;
                    w2Var.a(bool, null, 0L, bool);
                    break;
                }
                break;
            default:
                boolean z11 = tLObject instanceof TLRPC.TL_messages_availableEffectsNotModified;
                w2 w2Var2 = this.b;
                if (!z11) {
                    if (!(tLObject instanceof TLRPC.TL_messages_availableEffects)) {
                        StringBuilder sb3 = new StringBuilder("getting available effects error ");
                        if (tL_error != null) {
                            str2 = tL_error.code + " " + tL_error.text;
                        } else {
                            str2 = "";
                        }
                        sb3.append(str2);
                        a8.d(sb3.toString());
                        w2Var2.a(Boolean.FALSE, null, 0L, Boolean.valueOf(tL_error == null || !((i10 = tL_error.code) == -2000 || i10 == -2001)));
                        break;
                    } else {
                        w2Var2.a(Boolean.FALSE, (TLRPC.TL_messages_availableEffects) tLObject, Long.valueOf(r6.hash), Boolean.TRUE);
                        break;
                    }
                } else {
                    Boolean bool2 = Boolean.TRUE;
                    w2Var2.a(bool2, null, 0L, bool2);
                    break;
                }
        }
    }
}
