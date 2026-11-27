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
import org.telegram.ui.ActionBar.e;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class nm1 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;

    public /* synthetic */ nm1(Object obj, Object obj2, long j, Object obj3, Object obj4, Object obj5, byte b) {
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
        TLRPC.Chat M0;
        TLRPC.User X1;
        byte b = 1;
        byte b2 = 0;
        switch (this.a) {
            case 0:
                zu1 zu1Var = (zu1) this.c;
                fu5 fu5Var = (fu5) this.d;
                long j = this.b;
                TLRPC.TL_messageEntityFormattedDate tL_messageEntityFormattedDate = (TLRPC.TL_messageEntityFormattedDate) this.e;
                ArrayList arrayList = (ArrayList) this.f;
                mu9 mu9Var = (mu9) this.h;
                fu5Var.t0 = true;
                Activity parentActivity = zu1Var.getParentActivity();
                long j2 = tL_messageEntityFormattedDate.date;
                jn1 jn1Var = new jn1((Object) zu1Var, (Object) arrayList, j, (Object) mu9Var, (byte) 0);
                dm1 dm1Var = new dm1(mu9Var, b);
                Pattern pattern = jj.a;
                jj.H(parentActivity, j, j2, 0, true, jn1Var, dm1Var, new gj(null), null);
                break;
            case 1:
                ((ConnectionsManager) this.c).lambda$sendRequestInternal$7((RequestDelegate) this.d, (TLObject) this.e, (TLRPC.TL_error) this.f, (RequestDelegateTimestamp) this.h, this.b);
                break;
            case 2:
                e eVar = (e) this.c;
                TLObject tLObject = (TLObject) this.d;
                ac7 ac7Var = (ac7) this.e;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f;
                lw3 lw3Var = (lw3) this.h;
                long j3 = this.b;
                if (eVar.getContext() != null) {
                    if (tLObject instanceof TL_chatlists.TL_chatlists_exportedInvites) {
                        TL_chatlists.TL_chatlists_exportedInvites tL_chatlists_exportedInvites = (TL_chatlists.TL_chatlists_exportedInvites) tLObject;
                        eVar.getMessagesController().c4(tL_chatlists_exportedInvites.chats, false);
                        eVar.getMessagesController().j4(tL_chatlists_exportedInvites.users, false);
                        new af4(eVar, ac7Var, tL_chatlists_exportedInvites.invites).show();
                    } else if (tL_error == null || !"FILTER_ID_INVALID".equals(tL_error.text) || ac7Var.d()) {
                        xnb.x(null, 2131743534, d31.b0(eVar), null);
                    } else {
                        new af4(eVar, ac7Var, null).show();
                    }
                    if (lw3Var != null) {
                        hl.d3(lw3Var, Math.max(0L, 200 - (System.currentTimeMillis() - j3)));
                        break;
                    }
                }
                break;
            case 3:
                wua wuaVar = (wua) this.c;
                TLObject tLObject2 = (TLObject) this.d;
                String str = (String) this.e;
                TL_stars.InputSavedStarGift inputSavedStarGift = (TL_stars.InputSavedStarGift) this.f;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.h;
                long j4 = this.b;
                if (!(tLObject2 instanceof TLRPC.TL_payments_paymentResult)) {
                    if (tL_error2 != null && "BALANCE_TOO_LOW".equals(tL_error2.text)) {
                        if (!uc7.s1(wuaVar.a).i5()) {
                            wuaVar.f2.setLoading(false);
                            jxa.d0(wuaVar.getContext(), wuaVar.J0);
                            break;
                        } else {
                            jxa v = jxa.v(wuaVar.a, false);
                            lra lraVar = new lra(wuaVar, j4, (byte) 5);
                            v.e = false;
                            v.n(lraVar, false, true);
                            v.e = true;
                            break;
                        }
                    } else {
                        wuaVar.j().g0(tL_error2, false);
                        break;
                    }
                } else {
                    TLRPC.TL_payments_paymentResult tL_payments_paymentResult = (TLRPC.TL_payments_paymentResult) tLObject2;
                    uc7.s1(wuaVar.a).j4(tL_payments_paymentResult.updates.users, false);
                    uc7.s1(wuaVar.a).c4(tL_payments_paymentResult.updates.chats, false);
                    jxa.v(wuaVar.a, false).Q(false);
                    jxa.v(wuaVar.a, false).L();
                    if (!TextUtils.isEmpty(str) && (savedStarGift = wuaVar.A2) != null) {
                        savedStarGift.flags &= -65537;
                        savedStarGift.prepaid_upgrade_hash = null;
                    }
                    wuaVar.m2 = true;
                    wuaVar.q3 = null;
                    wuaVar.d1(inputSavedStarGift, tL_payments_paymentResult.updates, new tra(wuaVar, str, (byte) 4));
                    Utilities.d.c(new psa(wuaVar, tL_payments_paymentResult, b2));
                    break;
                }
                break;
            case 4:
                jxa jxaVar = (jxa) this.c;
                boolean[] zArr = (boolean[]) this.d;
                long j5 = this.b;
                TLObject tLObject3 = (TLObject) this.e;
                TLRPC.TL_textWithEntities tL_textWithEntities = (TLRPC.TL_textWithEntities) this.f;
                icc iccVar = (icc) this.h;
                zArr[0] = true;
                jxaVar.e(j5, tLObject3, tL_textWithEntities, iccVar);
                break;
            case 5:
                s6b s6bVar = (s6b) this.c;
                TLObject tLObject4 = (TLObject) this.d;
                long j6 = this.b;
                View view = (View) this.e;
                q6b q6bVar = (q6b) this.f;
                uc7 uc7Var = (uc7) this.h;
                if (tLObject4 != null) {
                    TL_stories.TL_stories_peerStories tL_stories_peerStories = (TL_stories.TL_stories_peerStories) tLObject4;
                    uc7.s1(s6bVar.a).j4(tL_stories_peerStories.users, false);
                    uc7.s1(s6bVar.a).c4(tL_stories_peerStories.chats, false);
                    TL_stories.PeerStories peerStories = tL_stories_peerStories.stories;
                    if (!peerStories.stories.isEmpty()) {
                        uc7.s1(s6bVar.a).O1().c0(j6, peerStories);
                        t6b.n(peerStories, new y09((Object) s6bVar, (Object) view, j6, (Object) q6bVar, (byte) 13));
                        z = false;
                        if (j6 > 0 && (X1 = uc7Var.X1(Long.valueOf(j6))) != null) {
                            X1.stories_unavailable = true;
                            jf7.Y(s6bVar.a).j1(Collections.singletonList(X1), null, false, true);
                            uc7Var.i4(X1, false, false);
                        }
                        if (j6 < 0 && (M0 = uc7Var.M0(Long.valueOf(-j6))) != null) {
                            M0.stories_unavailable = true;
                            jf7.Y(s6bVar.a).j1(null, Collections.singletonList(M0), false, true);
                            uc7Var.a4(M0, false);
                        }
                        if (!z) {
                            view.invalidate();
                            uc7.s1(s6bVar.a).O1().g0(j6, false);
                            break;
                        }
                    }
                }
                z = true;
                if (j6 > 0) {
                    X1.stories_unavailable = true;
                    jf7.Y(s6bVar.a).j1(Collections.singletonList(X1), null, false, true);
                    uc7Var.i4(X1, false, false);
                }
                if (j6 < 0) {
                    M0.stories_unavailable = true;
                    jf7.Y(s6bVar.a).j1(null, Collections.singletonList(M0), false, true);
                    uc7Var.a4(M0, false);
                }
                if (!z) {
                }
                break;
            default:
                qyb qybVar = (qyb) this.c;
                TLObject tLObject5 = (TLObject) this.d;
                long j7 = this.b;
                TLRPC.TL_messages_forumTopics tL_messages_forumTopics = (TLRPC.TL_messages_forumTopics) this.e;
                zh6 zh6Var = (zh6) this.f;
                o30 o30Var = (o30) this.h;
                TLRPC.TL_messages_forumTopics tL_messages_forumTopics2 = (TLRPC.TL_messages_forumTopics) tLObject5;
                qybVar.getMessagesController().j4(tL_messages_forumTopics2.users, false);
                qybVar.getMessagesController().c4(tL_messages_forumTopics2.chats, false);
                qybVar.u(j7, tL_messages_forumTopics.topics, zh6Var, false, 2, -1);
                qybVar.getMessagesStorage().z1(qybVar.getConnectionsManager().getCurrentTime(), -j7, (List) qybVar.a.f(j7), true);
                qybVar.getMessagesStorage().g1(tL_messages_forumTopics.messages, false, true, false, 0, false, 0, 0L);
                if (o30Var != null) {
                    o30Var.run();
                    break;
                }
                break;
        }
    }

    public /* synthetic */ nm1(Object obj, Object obj2, Object obj3, TLObject tLObject, Object obj4, long j, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = tLObject;
        this.h = obj4;
        this.b = j;
    }
}
