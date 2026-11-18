package kg;

import java.util.ArrayList;
import org.telegram.messenger.mp;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.bb1;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class o0 implements RequestDelegate {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ TLObject f;

    public /* synthetic */ o0(t0 t0Var, int[] iArr, ArrayList arrayList, boolean z10, TLRPC.User user) {
        this.c = t0Var;
        this.d = iArr;
        this.e = arrayList;
        this.b = z10;
        this.f = user;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                org.telegram.messenger.g0.g3(new r0((t0) this.c, tL_error, tLObject, (int[]) this.d, (ArrayList) this.e, this.b, (TLRPC.User) this.f));
                break;
            case 1:
                org.telegram.messenger.g0.g3(new r0((bb1) this.c, tL_error, this.b, tLObject, (byte[]) this.d, (String) this.e, (TL_account.passwordInputSettings) this.f));
                break;
            default:
                zh.l lVar = (zh.l) this.c;
                TLRPC.TL_chatInviteImporter tL_chatInviteImporter = (TLRPC.TL_chatInviteImporter) this.d;
                TLRPC.User user = (TLRPC.User) this.f;
                TLRPC.TL_messages_hideChatJoinRequest tL_messages_hideChatJoinRequest = (TLRPC.TL_messages_hideChatJoinRequest) this.e;
                if (tL_error == null) {
                    mp.u1(lVar.k).V3((TLRPC.TL_updates) tLObject, false);
                }
                org.telegram.messenger.g0.g3(new r0(lVar, tL_error, tLObject, tL_chatInviteImporter, this.b, user, tL_messages_hideChatJoinRequest));
                break;
        }
    }

    public /* synthetic */ o0(bb1 bb1Var, boolean z10, byte[] bArr, String str, TL_account.passwordInputSettings passwordinputsettings) {
        this.c = bb1Var;
        this.b = z10;
        this.d = bArr;
        this.e = str;
        this.f = passwordinputsettings;
    }

    public /* synthetic */ o0(zh.l lVar, TLRPC.TL_chatInviteImporter tL_chatInviteImporter, boolean z10, TLRPC.User user, TLRPC.TL_messages_hideChatJoinRequest tL_messages_hideChatJoinRequest) {
        this.c = lVar;
        this.d = tL_chatInviteImporter;
        this.b = z10;
        this.f = user;
        this.e = tL_messages_hideChatJoinRequest;
    }
}
