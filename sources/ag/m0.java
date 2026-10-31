package ag;

import java.util.ArrayList;
import org.telegram.messenger.f8;
import org.telegram.messenger.hs;
import org.telegram.messenger.vp;
import org.telegram.messenger.zs;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class m0 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ s0 b;

    public /* synthetic */ m0(s0 s0Var, int i10) {
        this.a = i10;
        this.b = s0Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final int i10 = 1;
                final s0 s0Var = this.b;
                org.telegram.messenger.i0.g3(new Runnable() { // from class: ag.l0
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i11 = i10;
                        TLObject tLObject2 = tLObject;
                        s0 s0Var2 = s0Var;
                        switch (i11) {
                            case 0:
                                int i12 = s0Var2.a;
                                if (tLObject2 instanceof TL_account.TL_businessChatLink) {
                                    TL_account.TL_businessChatLink tL_businessChatLink = (TL_account.TL_businessChatLink) tLObject2;
                                    s0Var2.b.add(tL_businessChatLink);
                                    zs.f(i12).k(zs.J1, new Object[0]);
                                    zs.f(i12).k(zs.K1, tL_businessChatLink);
                                    s0Var2.f();
                                    break;
                                }
                                break;
                            default:
                                ArrayList arrayList = s0Var2.b;
                                int i13 = s0Var2.a;
                                if (tLObject2 instanceof TL_account.businessChatLinks) {
                                    TL_account.businessChatLinks businesschatlinks = (TL_account.businessChatLinks) tLObject2;
                                    arrayList.clear();
                                    arrayList.addAll(businesschatlinks.links);
                                    vp.r1(i13).V3(businesschatlinks.users, false);
                                    vp.r1(i13).P3(businesschatlinks.chats, false);
                                    hs.a0(i13).m1(businesschatlinks.users, businesschatlinks.chats, true, true);
                                    zs.f(i13).k(zs.J1, new Object[0]);
                                    s0Var2.f();
                                } else {
                                    f8.g(new RuntimeException("Unexpected response from server!"), true);
                                }
                                s0Var2.c = false;
                                s0Var2.d = true;
                                break;
                        }
                    }
                });
                break;
            default:
                final int i11 = 0;
                final s0 s0Var2 = this.b;
                org.telegram.messenger.i0.g3(new Runnable() { // from class: ag.l0
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i112 = i11;
                        TLObject tLObject2 = tLObject;
                        s0 s0Var22 = s0Var2;
                        switch (i112) {
                            case 0:
                                int i12 = s0Var22.a;
                                if (tLObject2 instanceof TL_account.TL_businessChatLink) {
                                    TL_account.TL_businessChatLink tL_businessChatLink = (TL_account.TL_businessChatLink) tLObject2;
                                    s0Var22.b.add(tL_businessChatLink);
                                    zs.f(i12).k(zs.J1, new Object[0]);
                                    zs.f(i12).k(zs.K1, tL_businessChatLink);
                                    s0Var22.f();
                                    break;
                                }
                                break;
                            default:
                                ArrayList arrayList = s0Var22.b;
                                int i13 = s0Var22.a;
                                if (tLObject2 instanceof TL_account.businessChatLinks) {
                                    TL_account.businessChatLinks businesschatlinks = (TL_account.businessChatLinks) tLObject2;
                                    arrayList.clear();
                                    arrayList.addAll(businesschatlinks.links);
                                    vp.r1(i13).V3(businesschatlinks.users, false);
                                    vp.r1(i13).P3(businesschatlinks.chats, false);
                                    hs.a0(i13).m1(businesschatlinks.users, businesschatlinks.chats, true, true);
                                    zs.f(i13).k(zs.J1, new Object[0]);
                                    s0Var22.f();
                                } else {
                                    f8.g(new RuntimeException("Unexpected response from server!"), true);
                                }
                                s0Var22.c = false;
                                s0Var22.d = true;
                                break;
                        }
                    }
                });
                break;
        }
    }
}
