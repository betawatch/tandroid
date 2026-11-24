// default package

import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class o51 implements RequestDelegate {
    public final /* synthetic */ byte a;
    public final /* synthetic */ q51 b;

    public /* synthetic */ o51(q51 q51Var, byte b) {
        this.a = b;
        this.b = q51Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        byte b = this.a;
        final q51 q51Var = this.b;
        switch (b) {
            case 0:
                final byte b2 = 1;
                gm.c3(new Runnable() { // from class: n51
                    @Override // java.lang.Runnable
                    public final void run() {
                        byte b3 = b2;
                        TLObject tLObject2 = tLObject;
                        q51 q51Var2 = q51Var;
                        switch (b3) {
                            case 0:
                                int i = q51Var2.a;
                                if (tLObject2 instanceof TL_account.TL_businessChatLink) {
                                    TL_account.TL_businessChatLink tL_businessChatLink = (TL_account.TL_businessChatLink) tLObject2;
                                    q51Var2.b.add(tL_businessChatLink);
                                    nm7.f(i).k(nm7.J1, new Object[0]);
                                    nm7.f(i).k(nm7.K1, tL_businessChatLink);
                                    q51Var2.f();
                                    break;
                                }
                                break;
                            default:
                                ArrayList arrayList = q51Var2.b;
                                int i2 = q51Var2.a;
                                if (tLObject2 instanceof TL_account.businessChatLinks) {
                                    TL_account.businessChatLinks businesschatlinks = (TL_account.businessChatLinks) tLObject2;
                                    arrayList.clear();
                                    arrayList.addAll(businesschatlinks.links);
                                    oc7.r1(i2).d4(businesschatlinks.users, false);
                                    oc7.r1(i2).X3(businesschatlinks.chats, false);
                                    cf7.Y(i2).j1(businesschatlinks.users, businesschatlinks.chats, true, true);
                                    nm7.f(i2).k(nm7.J1, new Object[0]);
                                    q51Var2.f();
                                } else {
                                    fc4.g(new RuntimeException("Unexpected response from server!"), true);
                                }
                                q51Var2.c = false;
                                q51Var2.d = true;
                                break;
                        }
                    }
                });
                break;
            default:
                final byte b3 = 0;
                gm.c3(new Runnable() { // from class: n51
                    @Override // java.lang.Runnable
                    public final void run() {
                        byte b32 = b3;
                        TLObject tLObject2 = tLObject;
                        q51 q51Var2 = q51Var;
                        switch (b32) {
                            case 0:
                                int i = q51Var2.a;
                                if (tLObject2 instanceof TL_account.TL_businessChatLink) {
                                    TL_account.TL_businessChatLink tL_businessChatLink = (TL_account.TL_businessChatLink) tLObject2;
                                    q51Var2.b.add(tL_businessChatLink);
                                    nm7.f(i).k(nm7.J1, new Object[0]);
                                    nm7.f(i).k(nm7.K1, tL_businessChatLink);
                                    q51Var2.f();
                                    break;
                                }
                                break;
                            default:
                                ArrayList arrayList = q51Var2.b;
                                int i2 = q51Var2.a;
                                if (tLObject2 instanceof TL_account.businessChatLinks) {
                                    TL_account.businessChatLinks businesschatlinks = (TL_account.businessChatLinks) tLObject2;
                                    arrayList.clear();
                                    arrayList.addAll(businesschatlinks.links);
                                    oc7.r1(i2).d4(businesschatlinks.users, false);
                                    oc7.r1(i2).X3(businesschatlinks.chats, false);
                                    cf7.Y(i2).j1(businesschatlinks.users, businesschatlinks.chats, true, true);
                                    nm7.f(i2).k(nm7.J1, new Object[0]);
                                    q51Var2.f();
                                } else {
                                    fc4.g(new RuntimeException("Unexpected response from server!"), true);
                                }
                                q51Var2.c = false;
                                q51Var2.d = true;
                                break;
                        }
                    }
                });
                break;
        }
    }
}
