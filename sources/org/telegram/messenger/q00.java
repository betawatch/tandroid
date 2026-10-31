package org.telegram.messenger;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.RequestDelegateTimestamp;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_chatlists;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.nl0;
import org.telegram.ui.Components.z60;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class q00 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;

    public /* synthetic */ q00(Object obj, Object obj2, long j10, Object obj3, Object obj4, Object obj5, int i10) {
        this.a = i10;
        this.d = obj;
        this.b = obj2;
        this.c = j10;
        this.e = obj3;
        this.f = obj4;
        this.h = obj5;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00a5  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        TL_stars.SavedStarGift savedStarGift;
        boolean z10;
        TLRPC.Chat L0;
        TLRPC.User Z1;
        int i10 = 1;
        int i11 = 0;
        switch (this.a) {
            case 0:
                x00 x00Var = (x00) this.d;
                TLObject tLObject = (TLObject) this.b;
                long j10 = this.c;
                TLRPC.TL_messages_forumTopics tL_messages_forumTopics = (TLRPC.TL_messages_forumTopics) this.e;
                a0.h hVar = (a0.h) this.f;
                Runnable runnable = (Runnable) this.h;
                TLRPC.TL_messages_forumTopics tL_messages_forumTopics2 = (TLRPC.TL_messages_forumTopics) tLObject;
                x00Var.getMessagesController().V3(tL_messages_forumTopics2.users, false);
                x00Var.getMessagesController().P3(tL_messages_forumTopics2.chats, false);
                x00Var.u(j10, tL_messages_forumTopics.topics, hVar, false, 2, -1);
                x00Var.getMessagesStorage().C1(x00Var.getConnectionsManager().getCurrentTime(), -j10, (List) x00Var.a.f(j10), true);
                x00Var.getMessagesStorage().j1(tL_messages_forumTopics.messages, false, true, false, 0, false, 0, 0L);
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            case 1:
                ((ConnectionsManager) this.d).lambda$sendRequestInternal$7((RequestDelegate) this.e, (TLObject) this.b, (TLRPC.TL_error) this.f, (RequestDelegateTimestamp) this.h, this.c);
                break;
            case 2:
                org.telegram.ui.un unVar = (org.telegram.ui.un) this.d;
                z60 z60Var = (z60) this.b;
                long j11 = this.c;
                TLRPC.TL_messageEntityFormattedDate tL_messageEntityFormattedDate = (TLRPC.TL_messageEntityFormattedDate) this.e;
                ArrayList arrayList = (ArrayList) this.f;
                nl0 nl0Var = (nl0) this.h;
                z60Var.n0 = true;
                Activity parentActivity = unVar.getParentActivity();
                long j12 = tL_messageEntityFormattedDate.date;
                org.telegram.ui.vg vgVar = new org.telegram.ui.vg(unVar, arrayList, j11, nl0Var, 0);
                org.telegram.ui.se seVar = new org.telegram.ui.se(nl0Var, i10);
                Pattern pattern = org.telegram.ui.Components.s4.a;
                org.telegram.ui.Components.s4.J(parentActivity, j11, j12, 0, true, vgVar, seVar, new org.telegram.ui.Components.p4(null), null);
                break;
            case 3:
                org.telegram.ui.ActionBar.k2 k2Var = (org.telegram.ui.ActionBar.k2) this.d;
                TLObject tLObject2 = (TLObject) this.b;
                ap apVar = (ap) this.e;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f;
                Runnable runnable2 = (Runnable) this.h;
                long j13 = this.c;
                if (k2Var.getContext() != null) {
                    if (tLObject2 instanceof TL_chatlists.TL_chatlists_exportedInvites) {
                        TL_chatlists.TL_chatlists_exportedInvites tL_chatlists_exportedInvites = (TL_chatlists.TL_chatlists_exportedInvites) tLObject2;
                        k2Var.getMessagesController().P3(tL_chatlists_exportedInvites.chats, false);
                        k2Var.getMessagesController().V3(tL_chatlists_exportedInvites.users, false);
                        new org.telegram.ui.wz(k2Var, apVar, tL_chatlists_exportedInvites.invites).show();
                    } else if (tL_error == null || !"FILTER_ID_INVALID".equals(tL_error.text) || apVar.e()) {
                        m5.o(null, 2131743904, org.telegram.ui.Components.cc.a0(k2Var), null);
                    } else {
                        new org.telegram.ui.wz(k2Var, apVar, null).show();
                    }
                    if (runnable2 != null) {
                        i0.h3(runnable2, Math.max(0L, 200 - (System.currentTimeMillis() - j13)));
                        break;
                    }
                }
                break;
            case 4:
                rh.e4 e4Var = (rh.e4) this.d;
                TLObject tLObject3 = (TLObject) this.b;
                String str = (String) this.e;
                TL_stars.InputSavedStarGift inputSavedStarGift = (TL_stars.InputSavedStarGift) this.f;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.h;
                long j14 = this.c;
                if (!(tLObject3 instanceof TLRPC.TL_payments_paymentResult)) {
                    if (tL_error2 != null && "BALANCE_TOO_LOW".equals(tL_error2.text)) {
                        if (!vp.r1(e4Var.a).k7) {
                            rh.e6 y3 = rh.e6.y(e4Var.a, false);
                            rh.x0 x0Var = new rh.x0(e4Var, j14, 6);
                            y3.e = false;
                            y3.q(x0Var, false, true);
                            y3.e = true;
                            break;
                        } else {
                            e4Var.c2.setLoading(false);
                            rh.e6.c0(e4Var.getContext(), e4Var.I0);
                            break;
                        }
                    } else {
                        e4Var.k().f0(tL_error2, false);
                        break;
                    }
                } else {
                    TLRPC.TL_payments_paymentResult tL_payments_paymentResult = (TLRPC.TL_payments_paymentResult) tLObject3;
                    vp.r1(e4Var.a).V3(tL_payments_paymentResult.updates.users, false);
                    vp.r1(e4Var.a).P3(tL_payments_paymentResult.updates.chats, false);
                    rh.e6.y(e4Var.a, false).S(false);
                    rh.e6.y(e4Var.a, false).O();
                    if (!TextUtils.isEmpty(str) && (savedStarGift = e4Var.x2) != null) {
                        savedStarGift.flags &= -65537;
                        savedStarGift.prepaid_upgrade_hash = null;
                    }
                    e4Var.j2 = true;
                    e4Var.k3 = null;
                    e4Var.m1(inputSavedStarGift, tL_payments_paymentResult.updates, new rh.x1(e4Var, str, i11));
                    Utilities.d.c(new rh.y1(e4Var, tL_payments_paymentResult, i11));
                    break;
                }
                break;
            case 5:
                rh.e6 e6Var = (rh.e6) this.d;
                boolean[] zArr = (boolean[]) this.e;
                long j15 = this.c;
                TLObject tLObject4 = (TLObject) this.b;
                TLRPC.TL_textWithEntities tL_textWithEntities = (TLRPC.TL_textWithEntities) this.f;
                j20 j20Var = (j20) this.h;
                zArr[0] = true;
                e6Var.g(j15, tLObject4, tL_textWithEntities, j20Var);
                break;
            case 6:
                rh.e6 e6Var2 = (rh.e6) this.d;
                boolean[] zArr2 = (boolean[]) this.b;
                TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift = (TLRPC.TL_payments_paymentFormStarGift) this.e;
                TL_stars.StarGift starGift = (TL_stars.StarGift) this.f;
                long j16 = this.c;
                j20 j20Var2 = (j20) this.h;
                zArr2[0] = true;
                e6Var2.h(tL_payments_paymentFormStarGift, starGift, j16, null, true, j20Var2);
                break;
            default:
                th.v5 v5Var = (th.v5) this.d;
                TLObject tLObject5 = (TLObject) this.b;
                long j17 = this.c;
                View view = (View) this.e;
                th.t5 t5Var = (th.t5) this.f;
                vp vpVar = (vp) this.h;
                if (tLObject5 != null) {
                    TL_stories.TL_stories_peerStories tL_stories_peerStories = (TL_stories.TL_stories_peerStories) tLObject5;
                    vp.r1(v5Var.a).V3(tL_stories_peerStories.users, false);
                    vp.r1(v5Var.a).P3(tL_stories_peerStories.chats, false);
                    TL_stories.PeerStories peerStories = tL_stories_peerStories.stories;
                    if (!peerStories.stories.isEmpty()) {
                        vp.r1(v5Var.a).O1().d0(j17, peerStories);
                        th.w5.n(peerStories, new ag.a3(v5Var, view, j17, t5Var, 26));
                        z10 = false;
                        if (j17 > 0 && (Z1 = vpVar.Z1(Long.valueOf(j17))) != null) {
                            Z1.stories_unavailable = true;
                            hs.a0(v5Var.a).m1(Collections.singletonList(Z1), null, false, true);
                            vpVar.U3(Z1, false, false);
                        }
                        if (j17 < 0 && (L0 = vpVar.L0(Long.valueOf(-j17))) != null) {
                            L0.stories_unavailable = true;
                            hs.a0(v5Var.a).m1(null, Collections.singletonList(L0), false, true);
                            vpVar.N3(L0, false);
                        }
                        if (!z10) {
                            view.invalidate();
                            vp.r1(v5Var.a).O1().h0(j17, false);
                            break;
                        }
                    }
                }
                z10 = true;
                if (j17 > 0) {
                    Z1.stories_unavailable = true;
                    hs.a0(v5Var.a).m1(Collections.singletonList(Z1), null, false, true);
                    vpVar.U3(Z1, false, false);
                }
                if (j17 < 0) {
                    L0.stories_unavailable = true;
                    hs.a0(v5Var.a).m1(null, Collections.singletonList(L0), false, true);
                    vpVar.N3(L0, false);
                }
                if (!z10) {
                }
                break;
        }
    }

    public /* synthetic */ q00(Object obj, TLObject tLObject, Object obj2, TLObject tLObject2, Object obj3, long j10, int i10) {
        this.a = i10;
        this.d = obj;
        this.b = tLObject;
        this.e = obj2;
        this.f = tLObject2;
        this.h = obj3;
        this.c = j10;
    }

    public /* synthetic */ q00(ConnectionsManager connectionsManager, RequestDelegate requestDelegate, TLObject tLObject, TLRPC.TL_error tL_error, RequestDelegateTimestamp requestDelegateTimestamp, long j10) {
        this.a = 1;
        this.d = connectionsManager;
        this.e = requestDelegate;
        this.b = tLObject;
        this.f = tL_error;
        this.h = requestDelegateTimestamp;
        this.c = j10;
    }

    public /* synthetic */ q00(rh.e6 e6Var, boolean[] zArr, long j10, TLObject tLObject, TLRPC.TL_textWithEntities tL_textWithEntities, j20 j20Var) {
        this.a = 5;
        this.d = e6Var;
        this.e = zArr;
        this.c = j10;
        this.b = tLObject;
        this.f = tL_textWithEntities;
        this.h = j20Var;
    }

    public /* synthetic */ q00(rh.e6 e6Var, boolean[] zArr, TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift, TL_stars.StarGift starGift, long j10, j20 j20Var) {
        this.a = 6;
        this.d = e6Var;
        this.b = zArr;
        this.e = tL_payments_paymentFormStarGift;
        this.f = starGift;
        this.c = j10;
        this.h = j20Var;
    }
}
