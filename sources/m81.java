// default package

import java.util.HashSet;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class m81 implements RequestDelegate {
    public final /* synthetic */ byte a;
    public final /* synthetic */ i91 b;
    public final /* synthetic */ id c;
    public final /* synthetic */ HashSet d;
    public final /* synthetic */ TLRPC.TL_inputGroupCallInviteMessage e;
    public final /* synthetic */ boolean f;

    public /* synthetic */ m81(i91 i91Var, id idVar, HashSet hashSet, TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage, boolean z, byte b) {
        this.a = b;
        this.b = i91Var;
        this.c = idVar;
        this.d = hashSet;
        this.e = tL_inputGroupCallInviteMessage;
        this.f = z;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final i91 i91Var = this.b;
                i91Var.getClass();
                final byte b = 0;
                final id idVar = this.c;
                final HashSet hashSet = this.d;
                final TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage = this.e;
                final boolean z = this.f;
                hl.c3(new Runnable() { // from class: o81
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (b) {
                            case 0:
                                i91Var.h0(idVar, tLObject, hashSet, tL_inputGroupCallInviteMessage, z, tL_error);
                                break;
                            default:
                                i91Var.g0(idVar, tLObject, hashSet, tL_inputGroupCallInviteMessage, z, tL_error);
                                break;
                        }
                    }
                });
                break;
            default:
                final byte b2 = 1;
                final i91 i91Var2 = this.b;
                final id idVar2 = this.c;
                final HashSet hashSet2 = this.d;
                final TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage2 = this.e;
                final boolean z2 = this.f;
                hl.c3(new Runnable() { // from class: o81
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (b2) {
                            case 0:
                                i91Var2.h0(idVar2, tLObject, hashSet2, tL_inputGroupCallInviteMessage2, z2, tL_error);
                                break;
                            default:
                                i91Var2.g0(idVar2, tLObject, hashSet2, tL_inputGroupCallInviteMessage2, z2, tL_error);
                                break;
                        }
                    }
                });
                break;
        }
    }
}
