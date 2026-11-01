package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final /* synthetic */ class so implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ a3 b;

    public /* synthetic */ so(a3 a3Var, int i10) {
        this.a = i10;
        this.b = a3Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        String str;
        int i10;
        String str2;
        int i11;
        switch (this.a) {
            case 0:
                boolean z10 = tLObject instanceof TLRPC.TL_help_appConfigNotModified;
                a3 a3Var = this.b;
                if (!z10) {
                    if (!(tLObject instanceof TLRPC.TL_help_appConfig)) {
                        StringBuilder sb2 = new StringBuilder("getting appconfig error ");
                        if (tL_error != null) {
                            str = tL_error.code + " " + tL_error.text;
                        } else {
                            str = "";
                        }
                        sb2.append(str);
                        f8.d(sb2.toString());
                        a3Var.a(Boolean.FALSE, null, 0L, Boolean.valueOf(tL_error == null || !((i10 = tL_error.code) == -2000 || i10 == -2001)));
                        break;
                    } else {
                        a3Var.a(Boolean.FALSE, (TLRPC.TL_help_appConfig) tLObject, Long.valueOf(r6.hash), Boolean.TRUE);
                        break;
                    }
                } else {
                    Boolean bool = Boolean.TRUE;
                    a3Var.a(bool, null, 0L, bool);
                    break;
                }
                break;
            default:
                boolean z11 = tLObject instanceof TLRPC.TL_messages_availableEffectsNotModified;
                a3 a3Var2 = this.b;
                if (!z11) {
                    if (!(tLObject instanceof TLRPC.TL_messages_availableEffects)) {
                        StringBuilder sb3 = new StringBuilder("getting available effects error ");
                        if (tL_error != null) {
                            str2 = tL_error.code + " " + tL_error.text;
                        } else {
                            str2 = "";
                        }
                        sb3.append(str2);
                        f8.d(sb3.toString());
                        a3Var2.a(Boolean.FALSE, null, 0L, Boolean.valueOf(tL_error == null || !((i11 = tL_error.code) == -2000 || i11 == -2001)));
                        break;
                    } else {
                        a3Var2.a(Boolean.FALSE, (TLRPC.TL_messages_availableEffects) tLObject, Long.valueOf(r6.hash), Boolean.TRUE);
                        break;
                    }
                } else {
                    Boolean bool2 = Boolean.TRUE;
                    a3Var2.a(bool2, null, 0L, bool2);
                    break;
                }
        }
    }
}
