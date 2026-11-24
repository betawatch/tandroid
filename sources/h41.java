// default package

import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class h41 implements RequestDelegate {
    public final /* synthetic */ byte a;
    public final /* synthetic */ j41 b;

    public /* synthetic */ h41(j41 j41Var, byte b) {
        this.a = b;
        this.b = j41Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        byte b = this.a;
        final j41 j41Var = this.b;
        switch (b) {
            case 0:
                final byte b2 = 1;
                gl.d3(new Runnable() { // from class: g41
                    @Override // java.lang.Runnable
                    public final void run() {
                        byte b3 = b2;
                        TLObject tLObject2 = tLObject;
                        j41 j41Var2 = j41Var;
                        switch (b3) {
                            case 0:
                                int i = j41Var2.a;
                                if (tLObject2 instanceof TL_account.TL_businessChatLink) {
                                    TL_account.TL_businessChatLink tL_businessChatLink = (TL_account.TL_businessChatLink) tLObject2;
                                    j41Var2.b.add(tL_businessChatLink);
                                    kk7.f(i).k(kk7.I1, new Object[0]);
                                    kk7.f(i).k(kk7.J1, tL_businessChatLink);
                                    j41Var2.f();
                                    break;
                                }
                                break;
                            default:
                                ArrayList arrayList = j41Var2.b;
                                int i2 = j41Var2.a;
                                if (tLObject2 instanceof TL_account.businessChatLinks) {
                                    TL_account.businessChatLinks businesschatlinks = (TL_account.businessChatLinks) tLObject2;
                                    arrayList.clear();
                                    arrayList.addAll(businesschatlinks.links);
                                    na7.q1(i2).a4(businesschatlinks.users, false);
                                    na7.q1(i2).U3(businesschatlinks.chats, false);
                                    ad7.Y(i2).j1(businesschatlinks.users, businesschatlinks.chats, true, true);
                                    kk7.f(i2).k(kk7.I1, new Object[0]);
                                    j41Var2.f();
                                } else {
                                    fa4.g(new RuntimeException("Unexpected response from server!"), true);
                                }
                                j41Var2.c = false;
                                j41Var2.d = true;
                                break;
                        }
                    }
                });
                break;
            default:
                final byte b3 = 0;
                gl.d3(new Runnable() { // from class: g41
                    @Override // java.lang.Runnable
                    public final void run() {
                        byte b32 = b3;
                        TLObject tLObject2 = tLObject;
                        j41 j41Var2 = j41Var;
                        switch (b32) {
                            case 0:
                                int i = j41Var2.a;
                                if (tLObject2 instanceof TL_account.TL_businessChatLink) {
                                    TL_account.TL_businessChatLink tL_businessChatLink = (TL_account.TL_businessChatLink) tLObject2;
                                    j41Var2.b.add(tL_businessChatLink);
                                    kk7.f(i).k(kk7.I1, new Object[0]);
                                    kk7.f(i).k(kk7.J1, tL_businessChatLink);
                                    j41Var2.f();
                                    break;
                                }
                                break;
                            default:
                                ArrayList arrayList = j41Var2.b;
                                int i2 = j41Var2.a;
                                if (tLObject2 instanceof TL_account.businessChatLinks) {
                                    TL_account.businessChatLinks businesschatlinks = (TL_account.businessChatLinks) tLObject2;
                                    arrayList.clear();
                                    arrayList.addAll(businesschatlinks.links);
                                    na7.q1(i2).a4(businesschatlinks.users, false);
                                    na7.q1(i2).U3(businesschatlinks.chats, false);
                                    ad7.Y(i2).j1(businesschatlinks.users, businesschatlinks.chats, true, true);
                                    kk7.f(i2).k(kk7.I1, new Object[0]);
                                    j41Var2.f();
                                } else {
                                    fa4.g(new RuntimeException("Unexpected response from server!"), true);
                                }
                                j41Var2.c = false;
                                j41Var2.d = true;
                                break;
                        }
                    }
                });
                break;
        }
    }
}
