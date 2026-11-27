// default package

import android.os.Bundle;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class kg6 implements RequestDelegate {
    public final /* synthetic */ byte a;
    public final /* synthetic */ tg6 b;
    public final /* synthetic */ Bundle c;

    public /* synthetic */ kg6(tg6 tg6Var, Bundle bundle, byte b) {
        this.a = b;
        this.b = tg6Var;
        this.c = bundle;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                tg6 tg6Var = this.b;
                if (tLObject == null) {
                    if (tL_error != null && tL_error.text != null) {
                        hl.c3(new z56(tg6Var, tL_error, (byte) 19));
                        break;
                    }
                } else {
                    hl.c3(new ls5(tg6Var, this.c, tLObject, (byte) 28));
                    break;
                }
                break;
            default:
                hl.c3(new g65(this.b, tL_error, this.c, tLObject, (byte) 18));
                break;
        }
    }
}
