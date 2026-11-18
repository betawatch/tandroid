package kg;

import java.util.ArrayList;
import org.telegram.messenger.a8;
import org.telegram.messenger.ks;
import org.telegram.messenger.mp;
import org.telegram.messenger.tr;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class x implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ y b;

    public /* synthetic */ x(y yVar, int i7) {
        this.a = i7;
        this.b = yVar;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final int i7 = 1;
                final y yVar = this.b;
                org.telegram.messenger.g0.g3(new Runnable() { // from class: kg.w
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i10 = i7;
                        TLObject tLObject2 = tLObject;
                        y yVar2 = yVar;
                        switch (i10) {
                            case 0:
                                int i11 = yVar2.a;
                                if (tLObject2 instanceof TL_account.TL_businessChatLink) {
                                    TL_account.TL_businessChatLink tL_businessChatLink = (TL_account.TL_businessChatLink) tLObject2;
                                    yVar2.b.add(tL_businessChatLink);
                                    ks.f(i11).k(ks.J1, new Object[0]);
                                    ks.f(i11).k(ks.K1, tL_businessChatLink);
                                    yVar2.f();
                                    break;
                                }
                                break;
                            default:
                                ArrayList arrayList = yVar2.b;
                                int i12 = yVar2.a;
                                if (tLObject2 instanceof TL_account.businessChatLinks) {
                                    TL_account.businessChatLinks businesschatlinks = (TL_account.businessChatLinks) tLObject2;
                                    arrayList.clear();
                                    arrayList.addAll(businesschatlinks.links);
                                    mp.u1(i12).f4(businesschatlinks.users, false);
                                    mp.u1(i12).Z3(businesschatlinks.chats, false);
                                    tr.a0(i12).m1(businesschatlinks.users, businesschatlinks.chats, true, true);
                                    ks.f(i12).k(ks.J1, new Object[0]);
                                    yVar2.f();
                                } else {
                                    a8.g(new RuntimeException("Unexpected response from server!"), true);
                                }
                                yVar2.c = false;
                                yVar2.d = true;
                                break;
                        }
                    }
                });
                break;
            default:
                final int i10 = 0;
                final y yVar2 = this.b;
                org.telegram.messenger.g0.g3(new Runnable() { // from class: kg.w
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i102 = i10;
                        TLObject tLObject2 = tLObject;
                        y yVar22 = yVar2;
                        switch (i102) {
                            case 0:
                                int i11 = yVar22.a;
                                if (tLObject2 instanceof TL_account.TL_businessChatLink) {
                                    TL_account.TL_businessChatLink tL_businessChatLink = (TL_account.TL_businessChatLink) tLObject2;
                                    yVar22.b.add(tL_businessChatLink);
                                    ks.f(i11).k(ks.J1, new Object[0]);
                                    ks.f(i11).k(ks.K1, tL_businessChatLink);
                                    yVar22.f();
                                    break;
                                }
                                break;
                            default:
                                ArrayList arrayList = yVar22.b;
                                int i12 = yVar22.a;
                                if (tLObject2 instanceof TL_account.businessChatLinks) {
                                    TL_account.businessChatLinks businesschatlinks = (TL_account.businessChatLinks) tLObject2;
                                    arrayList.clear();
                                    arrayList.addAll(businesschatlinks.links);
                                    mp.u1(i12).f4(businesschatlinks.users, false);
                                    mp.u1(i12).Z3(businesschatlinks.chats, false);
                                    tr.a0(i12).m1(businesschatlinks.users, businesschatlinks.chats, true, true);
                                    ks.f(i12).k(ks.J1, new Object[0]);
                                    yVar22.f();
                                } else {
                                    a8.g(new RuntimeException("Unexpected response from server!"), true);
                                }
                                yVar22.c = false;
                                yVar22.d = true;
                                break;
                        }
                    }
                });
                break;
        }
    }
}
