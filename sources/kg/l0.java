package kg;

import java.util.ArrayList;
import org.telegram.messenger.np;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.xa1;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class l0 implements RequestDelegate {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ TLObject f;

    public /* synthetic */ l0(q0 q0Var, int[] iArr, ArrayList arrayList, boolean z10, TLRPC.User user) {
        this.c = q0Var;
        this.d = iArr;
        this.e = arrayList;
        this.b = z10;
        this.f = user;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                org.telegram.messenger.g0.h3(new o0((q0) this.c, tL_error, tLObject, (int[]) this.d, (ArrayList) this.e, this.b, (TLRPC.User) this.f));
                break;
            case 1:
                org.telegram.messenger.g0.h3(new o0((xa1) this.c, tL_error, this.b, tLObject, (byte[]) this.d, (String) this.e, (TL_account.passwordInputSettings) this.f));
                break;
            default:
                zh.l lVar = (zh.l) this.c;
                TLRPC.TL_chatInviteImporter tL_chatInviteImporter = (TLRPC.TL_chatInviteImporter) this.d;
                TLRPC.User user = (TLRPC.User) this.f;
                TLRPC.TL_messages_hideChatJoinRequest tL_messages_hideChatJoinRequest = (TLRPC.TL_messages_hideChatJoinRequest) this.e;
                if (tL_error == null) {
                    np.s1(lVar.k).O3((TLRPC.TL_updates) tLObject, false);
                }
                org.telegram.messenger.g0.h3(new o0(lVar, tL_error, tLObject, tL_chatInviteImporter, this.b, user, tL_messages_hideChatJoinRequest));
                break;
        }
    }

    public /* synthetic */ l0(xa1 xa1Var, boolean z10, byte[] bArr, String str, TL_account.passwordInputSettings passwordinputsettings) {
        this.c = xa1Var;
        this.b = z10;
        this.d = bArr;
        this.e = str;
        this.f = passwordinputsettings;
    }

    public /* synthetic */ l0(zh.l lVar, TLRPC.TL_chatInviteImporter tL_chatInviteImporter, boolean z10, TLRPC.User user, TLRPC.TL_messages_hideChatJoinRequest tL_messages_hideChatJoinRequest) {
        this.c = lVar;
        this.d = tL_chatInviteImporter;
        this.b = z10;
        this.f = user;
        this.e = tL_messages_hideChatJoinRequest;
    }
}
