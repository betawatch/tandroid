// default package

import java.util.HashSet;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class o91 implements RequestDelegate {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ia1 b;
    public final /* synthetic */ he c;
    public final /* synthetic */ HashSet d;
    public final /* synthetic */ TLRPC.TL_inputGroupCallInviteMessage e;
    public final /* synthetic */ boolean f;

    public /* synthetic */ o91(ia1 ia1Var, he heVar, HashSet hashSet, TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage, boolean z, byte b) {
        this.a = b;
        this.b = ia1Var;
        this.c = heVar;
        this.d = hashSet;
        this.e = tL_inputGroupCallInviteMessage;
        this.f = z;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final ia1 ia1Var = this.b;
                ia1Var.getClass();
                final byte b = 0;
                final he heVar = this.c;
                final HashSet hashSet = this.d;
                final TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage = this.e;
                final boolean z = this.f;
                gm.c3(new Runnable() { // from class: q91
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (b) {
                            case 0:
                                ia1Var.i0(heVar, tLObject, hashSet, tL_inputGroupCallInviteMessage, z, tL_error);
                                break;
                            default:
                                ia1Var.h0(heVar, tLObject, hashSet, tL_inputGroupCallInviteMessage, z, tL_error);
                                break;
                        }
                    }
                });
                break;
            default:
                final byte b2 = 1;
                final ia1 ia1Var2 = this.b;
                final he heVar2 = this.c;
                final HashSet hashSet2 = this.d;
                final TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage2 = this.e;
                final boolean z2 = this.f;
                gm.c3(new Runnable() { // from class: q91
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (b2) {
                            case 0:
                                ia1Var2.i0(heVar2, tLObject, hashSet2, tL_inputGroupCallInviteMessage2, z2, tL_error);
                                break;
                            default:
                                ia1Var2.h0(heVar2, tLObject, hashSet2, tL_inputGroupCallInviteMessage2, z2, tL_error);
                                break;
                        }
                    }
                });
                break;
        }
    }
}
