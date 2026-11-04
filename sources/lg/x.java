package lg;

import java.util.ArrayList;
import org.telegram.messenger.a8;
import org.telegram.messenger.hp;
import org.telegram.messenger.hs;
import org.telegram.messenger.qr;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class x implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ z b;

    public /* synthetic */ x(z zVar, int i3) {
        this.a = i3;
        this.b = zVar;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final int i3 = 1;
                final z zVar = this.b;
                org.telegram.messenger.g0.h3(new Runnable() { // from class: lg.w
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i10 = i3;
                        TLObject tLObject2 = tLObject;
                        z zVar2 = zVar;
                        switch (i10) {
                            case 0:
                                int i11 = zVar2.a;
                                if (tLObject2 instanceof TL_account.TL_businessChatLink) {
                                    TL_account.TL_businessChatLink tL_businessChatLink = (TL_account.TL_businessChatLink) tLObject2;
                                    zVar2.b.add(tL_businessChatLink);
                                    hs.f(i11).k(hs.J1, new Object[0]);
                                    hs.f(i11).k(hs.K1, tL_businessChatLink);
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
                                    hp.s1(i12).Y3(businesschatlinks.users, false);
                                    hp.s1(i12).S3(businesschatlinks.chats, false);
                                    qr.a0(i12).m1(businesschatlinks.users, businesschatlinks.chats, true, true);
                                    hs.f(i12).k(hs.J1, new Object[0]);
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
                org.telegram.messenger.g0.h3(new Runnable() { // from class: lg.w
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
                                    hs.f(i11).k(hs.J1, new Object[0]);
                                    hs.f(i11).k(hs.K1, tL_businessChatLink);
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
                                    hp.s1(i12).Y3(businesschatlinks.users, false);
                                    hp.s1(i12).S3(businesschatlinks.chats, false);
                                    qr.a0(i12).m1(businesschatlinks.users, businesschatlinks.chats, true, true);
                                    hs.f(i12).k(hs.J1, new Object[0]);
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
