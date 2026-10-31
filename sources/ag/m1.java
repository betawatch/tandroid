package ag;

import java.util.ArrayList;
import org.telegram.messenger.vp;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.tc1;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class m1 implements RequestDelegate {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ TLObject c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ m1(t1 t1Var, int[] iArr, ArrayList arrayList, boolean z10, TLRPC.User user) {
        this.d = t1Var;
        this.e = iArr;
        this.f = arrayList;
        this.b = z10;
        this.c = user;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                org.telegram.messenger.i0.g3(new p1((t1) this.d, tL_error, tLObject, (int[]) this.e, (ArrayList) this.f, this.b, (TLRPC.User) this.c));
                break;
            case 1:
                oh.q qVar = (oh.q) this.d;
                TLRPC.TL_chatInviteImporter tL_chatInviteImporter = (TLRPC.TL_chatInviteImporter) this.e;
                TLRPC.User user = (TLRPC.User) this.c;
                TLRPC.TL_messages_hideChatJoinRequest tL_messages_hideChatJoinRequest = (TLRPC.TL_messages_hideChatJoinRequest) this.f;
                if (tL_error == null) {
                    vp.r1(qVar.k).L3((TLRPC.TL_updates) tLObject, false);
                }
                org.telegram.messenger.i0.g3(new p1(qVar, tL_error, tLObject, tL_chatInviteImporter, this.b, user, tL_messages_hideChatJoinRequest));
                break;
            default:
                org.telegram.messenger.i0.g3(new p1((tc1) this.d, tL_error, this.b, tLObject, (byte[]) this.e, (String) this.f, (TL_account.passwordInputSettings) this.c));
                break;
        }
    }

    public /* synthetic */ m1(oh.q qVar, TLRPC.TL_chatInviteImporter tL_chatInviteImporter, boolean z10, TLRPC.User user, TLRPC.TL_messages_hideChatJoinRequest tL_messages_hideChatJoinRequest) {
        this.d = qVar;
        this.e = tL_chatInviteImporter;
        this.b = z10;
        this.c = user;
        this.f = tL_messages_hideChatJoinRequest;
    }

    public /* synthetic */ m1(tc1 tc1Var, boolean z10, byte[] bArr, String str, TL_account.passwordInputSettings passwordinputsettings) {
        this.d = tc1Var;
        this.b = z10;
        this.e = bArr;
        this.f = str;
        this.c = passwordinputsettings;
    }
}
