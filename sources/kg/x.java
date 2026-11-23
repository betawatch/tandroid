package kg;

import java.util.ArrayList;
import org.telegram.messenger.a8;
import org.telegram.messenger.ls;
import org.telegram.messenger.np;
import org.telegram.messenger.ur;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final /* synthetic */ class x implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ z b;

    public /* synthetic */ x(z zVar, int i7) {
        this.a = i7;
        this.b = zVar;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final int i7 = 1;
                final z zVar = this.b;
                org.telegram.messenger.g0.g3(new Runnable() { // from class: kg.w
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i10 = i7;
                        TLObject tLObject2 = tLObject;
                        z zVar2 = zVar;
                        switch (i10) {
                            case 0:
                                int i11 = zVar2.a;
                                if (tLObject2 instanceof TL_account.TL_businessChatLink) {
                                    TL_account.TL_businessChatLink tL_businessChatLink = (TL_account.TL_businessChatLink) tLObject2;
                                    zVar2.b.add(tL_businessChatLink);
                                    ls.f(i11).k(ls.J1, new Object[0]);
                                    ls.f(i11).k(ls.K1, tL_businessChatLink);
                                    zVar2.f();
                                    break;
                                }
                                break;
                            default:
                                ArrayList arrayList = zVar2.b;
                                int i12 = zVar2.a;
                                if (tLObject2 instanceof TL_account.businessChatLinks) {
                                    TL_account.businessChatLinks businesschatlinks = (TL_account.businessChatLinks) tLObject2;
                                    arrayList.clear();
                                    arrayList.addAll(businesschatlinks.links);
                                    np.u1(i12).f4(businesschatlinks.users, false);
                                    np.u1(i12).Z3(businesschatlinks.chats, false);
                                    ur.a0(i12).m1(businesschatlinks.users, businesschatlinks.chats, true, true);
                                    ls.f(i12).k(ls.J1, new Object[0]);
                                    zVar2.f();
                                } else {
                                    a8.g(new RuntimeException("Unexpected response from server!"), true);
                                }
                                zVar2.c = false;
                                zVar2.d = true;
                                break;
                        }
                    }
                });
                break;
            default:
                final int i10 = 0;
                final z zVar2 = this.b;
                org.telegram.messenger.g0.g3(new Runnable() { // from class: kg.w
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i102 = i10;
                        TLObject tLObject2 = tLObject;
                        z zVar22 = zVar2;
                        switch (i102) {
                            case 0:
                                int i11 = zVar22.a;
                                if (tLObject2 instanceof TL_account.TL_businessChatLink) {
                                    TL_account.TL_businessChatLink tL_businessChatLink = (TL_account.TL_businessChatLink) tLObject2;
                                    zVar22.b.add(tL_businessChatLink);
                                    ls.f(i11).k(ls.J1, new Object[0]);
                                    ls.f(i11).k(ls.K1, tL_businessChatLink);
                                    zVar22.f();
                                    break;
                                }
                                break;
                            default:
                                ArrayList arrayList = zVar22.b;
                                int i12 = zVar22.a;
                                if (tLObject2 instanceof TL_account.businessChatLinks) {
                                    TL_account.businessChatLinks businesschatlinks = (TL_account.businessChatLinks) tLObject2;
                                    arrayList.clear();
                                    arrayList.addAll(businesschatlinks.links);
                                    np.u1(i12).f4(businesschatlinks.users, false);
                                    np.u1(i12).Z3(businesschatlinks.chats, false);
                                    ur.a0(i12).m1(businesschatlinks.users, businesschatlinks.chats, true, true);
                                    ls.f(i12).k(ls.J1, new Object[0]);
                                    zVar22.f();
                                } else {
                                    a8.g(new RuntimeException("Unexpected response from server!"), true);
                                }
                                zVar22.c = false;
                                zVar22.d = true;
                                break;
                        }
                    }
                });
                break;
        }
    }
}
