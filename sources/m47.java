// default package

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class m47 implements RequestDelegate {
    public final /* synthetic */ byte a;
    public final /* synthetic */ s47 b;

    public /* synthetic */ m47(s47 s47Var, byte b) {
        this.a = b;
        this.b = s47Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        byte b = this.a;
        final s47 s47Var = this.b;
        switch (b) {
            case 0:
                final byte b2 = 0;
                gl.c3(new Runnable() { // from class: l47
                    @Override // java.lang.Runnable
                    public final void run() {
                        byte b3 = b2;
                        TLObject tLObject2 = tLObject;
                        TLRPC.TL_error tL_error2 = tL_error;
                        s47 s47Var2 = s47Var;
                        switch (b3) {
                            case 0:
                                s47Var2.f0(tLObject2, tL_error2);
                                break;
                            case 1:
                                s47Var2.d0(tLObject2, tL_error2);
                                break;
                            default:
                                s47Var2.e0(tLObject2, tL_error2);
                                break;
                        }
                    }
                });
                break;
            case 1:
                final byte b3 = 1;
                gl.c3(new Runnable() { // from class: l47
                    @Override // java.lang.Runnable
                    public final void run() {
                        byte b32 = b3;
                        TLObject tLObject2 = tLObject;
                        TLRPC.TL_error tL_error2 = tL_error;
                        s47 s47Var2 = s47Var;
                        switch (b32) {
                            case 0:
                                s47Var2.f0(tLObject2, tL_error2);
                                break;
                            case 1:
                                s47Var2.d0(tLObject2, tL_error2);
                                break;
                            default:
                                s47Var2.e0(tLObject2, tL_error2);
                                break;
                        }
                    }
                });
                break;
            default:
                final byte b4 = 2;
                gl.c3(new Runnable() { // from class: l47
                    @Override // java.lang.Runnable
                    public final void run() {
                        byte b32 = b4;
                        TLObject tLObject2 = tLObject;
                        TLRPC.TL_error tL_error2 = tL_error;
                        s47 s47Var2 = s47Var;
                        switch (b32) {
                            case 0:
                                s47Var2.f0(tLObject2, tL_error2);
                                break;
                            case 1:
                                s47Var2.d0(tLObject2, tL_error2);
                                break;
                            default:
                                s47Var2.e0(tLObject2, tL_error2);
                                break;
                        }
                    }
                });
                break;
        }
    }
}
