// default package

import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.RequestDelegateTimestamp;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_chatlists;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class om1 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;

    public /* synthetic */ om1(Object obj, Object obj2, long j, Object obj3, Object obj4, Object obj5, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.b = j;
        this.e = obj3;
        this.f = obj4;
        this.h = obj5;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0111  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        TL_stars.SavedStarGift savedStarGift;
        boolean z;
        TLRPC.Chat L0;
        TLRPC.User W1;
        byte b = 1;
        byte b2 = 0;
        switch (this.a) {
            case 0:
                yv1 yv1Var = (yv1) this.c;
                bu5 bu5Var = (bu5) this.d;
                long j = this.b;
                TLRPC.TL_messageEntityFormattedDate tL_messageEntityFormattedDate = (TLRPC.TL_messageEntityFormattedDate) this.e;
                ArrayList arrayList = (ArrayList) this.f;
                vs9 vs9Var = (vs9) this.h;
                bu5Var.q0 = true;
                Activity parentActivity = yv1Var.getParentActivity();
                long j2 = tL_messageEntityFormattedDate.date;
                zn1 zn1Var = new zn1((Object) yv1Var, (Object) arrayList, j, (Object) vs9Var, (byte) 0);
                hm1 hm1Var = new hm1(vs9Var, b);
                Pattern pattern = ik.a;
                ik.H(parentActivity, j, j2, 0, true, zn1Var, hm1Var, new fk(null), null);
                break;
            case 1:
                ((ConnectionsManager) this.c).lambda$sendRequestInternal$7((RequestDelegate) this.d, (TLObject) this.e, (TLRPC.TL_error) this.f, (RequestDelegateTimestamp) this.h, this.b);
                break;
            case 2:
                d dVar = (d) this.c;
                TLObject tLObject = (TLObject) this.d;
                ub7 ub7Var = (ub7) this.e;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f;
                a14 a14Var = (a14) this.h;
                long j3 = this.b;
                if (dVar.getContext() != null) {
                    if (tLObject instanceof TL_chatlists.TL_chatlists_exportedInvites) {
                        TL_chatlists.TL_chatlists_exportedInvites tL_chatlists_exportedInvites = (TL_chatlists.TL_chatlists_exportedInvites) tLObject;
                        dVar.getMessagesController().X3(tL_chatlists_exportedInvites.chats, false);
                        dVar.getMessagesController().d4(tL_chatlists_exportedInvites.users, false);
                        new cf4(dVar, ub7Var, tL_chatlists_exportedInvites.invites).show();
                    } else if (tL_error == null || !"FILTER_ID_INVALID".equals(tL_error.text) || ub7Var.d()) {
                        mlb.y(null, 2131743566, c41.b0(dVar), null);
                    } else {
                        new cf4(dVar, ub7Var, null).show();
                    }
                    if (a14Var != null) {
                        gm.d3(a14Var, Math.max(0L, 200 - (System.currentTimeMillis() - j3)));
                        break;
                    }
                }
                break;
            case 3:
                wsa wsaVar = (wsa) this.c;
                TLObject tLObject2 = (TLObject) this.d;
                String str = (String) this.e;
                TL_stars.InputSavedStarGift inputSavedStarGift = (TL_stars.InputSavedStarGift) this.f;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.h;
                long j4 = this.b;
                if (!(tLObject2 instanceof TLRPC.TL_payments_paymentResult)) {
                    if (tL_error2 != null && "BALANCE_TOO_LOW".equals(tL_error2.text)) {
                        if (!oc7.r1(wsaVar.a).c5()) {
                            wsaVar.f2.setLoading(false);
                            jva.c0(wsaVar.getContext(), wsaVar.J0);
                            break;
                        } else {
                            jva v = jva.v(wsaVar.a, false);
                            ppa ppaVar = new ppa(wsaVar, j4, (byte) 6);
                            v.e = false;
                            v.n(ppaVar, false, true);
                            v.e = true;
                            break;
                        }
                    } else {
                        wsaVar.j().g0(tL_error2, false);
                        break;
                    }
                } else {
                    TLRPC.TL_payments_paymentResult tL_payments_paymentResult = (TLRPC.TL_payments_paymentResult) tLObject2;
                    oc7.r1(wsaVar.a).d4(tL_payments_paymentResult.updates.users, false);
                    oc7.r1(wsaVar.a).X3(tL_payments_paymentResult.updates.chats, false);
                    jva.v(wsaVar.a, false).P(false);
                    jva.v(wsaVar.a, false).L();
                    if (!TextUtils.isEmpty(str) && (savedStarGift = wsaVar.A2) != null) {
                        savedStarGift.flags &= -65537;
                        savedStarGift.prepaid_upgrade_hash = null;
                    }
                    wsaVar.m2 = true;
                    wsaVar.q3 = null;
                    wsaVar.c1(inputSavedStarGift, tL_payments_paymentResult.updates, new nqa(wsaVar, str, b));
                    Utilities.d.c(new oqa(wsaVar, tL_payments_paymentResult, b2));
                    break;
                }
                break;
            case 4:
                jva jvaVar = (jva) this.c;
                boolean[] zArr = (boolean[]) this.d;
                long j5 = this.b;
                TLObject tLObject3 = (TLObject) this.e;
                TLRPC.TL_textWithEntities tL_textWithEntities = (TLRPC.TL_textWithEntities) this.f;
                jac jacVar = (jac) this.h;
                zArr[0] = true;
                jvaVar.e(j5, tLObject3, tL_textWithEntities, jacVar);
                break;
            case 5:
                x4b x4bVar = (x4b) this.c;
                TLObject tLObject4 = (TLObject) this.d;
                long j6 = this.b;
                View view = (View) this.e;
                v4b v4bVar = (v4b) this.f;
                oc7 oc7Var = (oc7) this.h;
                if (tLObject4 != null) {
                    TL_stories.TL_stories_peerStories tL_stories_peerStories = (TL_stories.TL_stories_peerStories) tLObject4;
                    oc7.r1(x4bVar.a).d4(tL_stories_peerStories.users, false);
                    oc7.r1(x4bVar.a).X3(tL_stories_peerStories.chats, false);
                    TL_stories.PeerStories peerStories = tL_stories_peerStories.stories;
                    if (!peerStories.stories.isEmpty()) {
                        oc7.r1(x4bVar.a).N1().c0(j6, peerStories);
                        y4b.n(peerStories, new nz8((Object) x4bVar, (Object) view, j6, (Object) v4bVar, (byte) 13));
                        z = false;
                        if (j6 > 0 && (W1 = oc7Var.W1(Long.valueOf(j6))) != null) {
                            W1.stories_unavailable = true;
                            cf7.Y(x4bVar.a).j1(Collections.singletonList(W1), null, false, true);
                            oc7Var.c4(W1, false, false);
                        }
                        if (j6 < 0 && (L0 = oc7Var.L0(Long.valueOf(-j6))) != null) {
                            L0.stories_unavailable = true;
                            cf7.Y(x4bVar.a).j1(null, Collections.singletonList(L0), false, true);
                            oc7Var.V3(L0, false);
                        }
                        if (!z) {
                            view.invalidate();
                            oc7.r1(x4bVar.a).N1().g0(j6, false);
                            break;
                        }
                    }
                }
                z = true;
                if (j6 > 0) {
                    W1.stories_unavailable = true;
                    cf7.Y(x4bVar.a).j1(Collections.singletonList(W1), null, false, true);
                    oc7Var.c4(W1, false, false);
                }
                if (j6 < 0) {
                    L0.stories_unavailable = true;
                    cf7.Y(x4bVar.a).j1(null, Collections.singletonList(L0), false, true);
                    oc7Var.V3(L0, false);
                }
                if (!z) {
                }
                break;
            default:
                qwb qwbVar = (qwb) this.c;
                TLObject tLObject5 = (TLObject) this.d;
                long j7 = this.b;
                TLRPC.TL_messages_forumTopics tL_messages_forumTopics = (TLRPC.TL_messages_forumTopics) this.e;
                vh6 vh6Var = (vh6) this.f;
                n40 n40Var = (n40) this.h;
                TLRPC.TL_messages_forumTopics tL_messages_forumTopics2 = (TLRPC.TL_messages_forumTopics) tLObject5;
                qwbVar.getMessagesController().d4(tL_messages_forumTopics2.users, false);
                qwbVar.getMessagesController().X3(tL_messages_forumTopics2.chats, false);
                qwbVar.u(j7, tL_messages_forumTopics.topics, vh6Var, false, 2, -1);
                qwbVar.getMessagesStorage().z1(qwbVar.getConnectionsManager().getCurrentTime(), -j7, (List) qwbVar.a.f(j7), true);
                qwbVar.getMessagesStorage().g1(tL_messages_forumTopics.messages, false, true, false, 0, false, 0, 0L);
                if (n40Var != null) {
                    n40Var.run();
                    break;
                }
                break;
        }
    }

    public /* synthetic */ om1(Object obj, Object obj2, Object obj3, TLObject tLObject, Object obj4, long j, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = tLObject;
        this.h = obj4;
        this.b = j;
    }
}
