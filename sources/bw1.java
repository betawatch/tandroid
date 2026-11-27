// default package

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Wallet.c;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes3.dex */
public final /* synthetic */ class bw1 implements kcc {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ bw1(Object obj, Object obj2, Object obj3, Object obj4, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    @Override // kcc
    public final void a(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        Object obj4 = this.e;
        Object obj5 = this.d;
        Object obj6 = this.c;
        Object obj7 = this.b;
        switch (b) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj7;
                boolean[] zArr = (boolean[]) obj6;
                lnc lncVar = (lnc) obj5;
                String str = (String) obj4;
                Boolean bool = (Boolean) obj;
                Integer num = (Integer) obj2;
                Integer num2 = (Integer) obj3;
                int i = ChatActivityEnterView.X7;
                mv1 mv1Var = chatActivityEnterView.p6;
                if (!zArr[0]) {
                    zArr[0] = true;
                    chatActivityEnterView.N0 = System.currentTimeMillis();
                    lncVar.run();
                    long N2 = chatActivityEnterView.N2(str, new ao1(chatActivityEnterView, bool, num, num2, (byte) 4));
                    chatActivityEnterView.o6 = num.intValue() == 0;
                    hl.r(mv1Var);
                    hl.d3(mv1Var, N2 + 500);
                    break;
                }
                break;
            case 1:
                c cVar = (c) obj7;
                pcc pccVar = (pcc) obj6;
                byte[] bArr = (byte[]) obj5;
                c35 c35Var = (c35) obj4;
                TL_wallet.WalletState walletState = (TL_wallet.WalletState) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                int i2 = cVar.a;
                if (tL_error == null) {
                    cVar.z0(walletState);
                    new k35(i2, c.B(), cVar.x()).q(yac.h(i2).e(), bArr, c35Var, pccVar);
                    cVar.Z();
                    break;
                } else if (!"WALLET_PROOF_EXPIRED".equalsIgnoreCase(tL_error.text)) {
                    String str2 = tL_error.text;
                    if (str2 == null) {
                        str2 = "NULL_ERROR";
                    }
                    pccVar.a(str2);
                    break;
                }
                break;
            default:
                muc mucVar = (muc) obj7;
                c cVar2 = (c) obj6;
                TLRPC.User user = (TLRPC.User) obj5;
                String str3 = (String) obj4;
                String str4 = (String) obj;
                pcc pccVar2 = (pcc) obj3;
                if (!c.b(mucVar.f, cVar2.x())) {
                    pccVar2.a("WALLET_CHANGED");
                    break;
                } else {
                    cVar2.n0(user, str3, 0L, str4, null, mucVar.e, null, new ku9(mucVar, pccVar2, (byte) 23), null);
                    break;
                }
        }
    }
}
