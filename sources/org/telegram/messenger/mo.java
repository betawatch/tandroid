package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final /* synthetic */ class mo implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ w2 b;

    public /* synthetic */ mo(w2 w2Var, int i7) {
        this.a = i7;
        this.b = w2Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        String str;
        int i7;
        String str2;
        int i10;
        switch (this.a) {
            case 0:
                boolean z9 = tLObject instanceof TLRPC.TL_help_appConfigNotModified;
                w2 w2Var = this.b;
                if (!z9) {
                    if (!(tLObject instanceof TLRPC.TL_help_appConfig)) {
                        StringBuilder sb2 = new StringBuilder("getting appconfig error ");
                        if (tL_error != null) {
                            str = tL_error.code + " " + tL_error.text;
                        } else {
                            str = "";
                        }
                        sb2.append(str);
                        a8.d(sb2.toString());
                        w2Var.a(Boolean.FALSE, null, 0L, Boolean.valueOf(tL_error == null || !((i7 = tL_error.code) == -2000 || i7 == -2001)));
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
                boolean z10 = tLObject instanceof TLRPC.TL_messages_availableEffectsNotModified;
                w2 w2Var2 = this.b;
                if (!z10) {
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
