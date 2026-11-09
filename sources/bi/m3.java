package bi;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.k00;
import org.telegram.messenger.qp;
import org.telegram.messenger.v10;
import org.telegram.messenger.vo;
import org.telegram.messenger.yr;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.RequestDelegateTimestamp;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_chatlists;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.kk0;
import org.telegram.ui.Components.l60;
import org.telegram.ui.cn;
import org.telegram.ui.ge;
import org.telegram.ui.xy;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class m3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;

    public /* synthetic */ m3(k7 k7Var, TLObject tLObject, String str, TL_stars.InputSavedStarGift inputSavedStarGift, TLRPC.TL_error tL_error, long j3) {
        this.a = 0;
        this.d = k7Var;
        this.c = tLObject;
        this.e = str;
        this.f = inputSavedStarGift;
        this.h = tL_error;
        this.b = j3;
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x01eb  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        TL_stars.SavedStarGift savedStarGift;
        boolean z9;
        TLRPC.Chat M0;
        TLRPC.User a22;
        int i7 = 1;
        int i10 = 0;
        switch (this.a) {
            case 0:
                k7 k7Var = (k7) this.d;
                TLObject tLObject = (TLObject) this.c;
                String str = (String) this.e;
                TL_stars.InputSavedStarGift inputSavedStarGift = (TL_stars.InputSavedStarGift) this.f;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.h;
                long j3 = this.b;
                if (!(tLObject instanceof TLRPC.TL_payments_paymentResult)) {
                    if (tL_error != null && "BALANCE_TOO_LOW".equals(tL_error.text)) {
                        if (!qp.s1(k7Var.a).j7) {
                            ea y10 = ea.y(k7Var.a, false);
                            a2 a2Var = new a2(k7Var, j3, 6);
                            y10.e = false;
                            y10.q(a2Var, false, true);
                            y10.e = true;
                            break;
                        } else {
                            k7Var.c2.setLoading(false);
                            ea.c0(k7Var.getContext(), k7Var.I0);
                            break;
                        }
                    } else {
                        k7Var.k().f0(tL_error, false);
                        break;
                    }
                } else {
                    TLRPC.TL_payments_paymentResult tL_payments_paymentResult = (TLRPC.TL_payments_paymentResult) tLObject;
                    qp.s1(k7Var.a).Y3(tL_payments_paymentResult.updates.users, false);
                    qp.s1(k7Var.a).S3(tL_payments_paymentResult.updates.chats, false);
                    ea.y(k7Var.a, false).S(false);
                    ea.y(k7Var.a, false).O();
                    if (!TextUtils.isEmpty(str) && (savedStarGift = k7Var.x2) != null) {
                        savedStarGift.flags &= -65537;
                        savedStarGift.prepaid_upgrade_hash = null;
                    }
                    k7Var.j2 = true;
                    k7Var.k3 = null;
                    k7Var.l1(inputSavedStarGift, tL_payments_paymentResult.updates, new b4(k7Var, str, i10));
                    Utilities.d.c(new c4(k7Var, tL_payments_paymentResult, i10));
                    break;
                }
                break;
            case 1:
                ea eaVar = (ea) this.d;
                boolean[] zArr = (boolean[]) this.e;
                long j10 = this.b;
                TLObject tLObject2 = (TLObject) this.c;
                TLRPC.TL_textWithEntities tL_textWithEntities = (TLRPC.TL_textWithEntities) this.f;
                v10 v10Var = (v10) this.h;
                zArr[0] = true;
                eaVar.g(j10, tLObject2, tL_textWithEntities, v10Var);
                break;
            case 2:
                ea eaVar2 = (ea) this.d;
                boolean[] zArr2 = (boolean[]) this.c;
                TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift = (TLRPC.TL_payments_paymentFormStarGift) this.e;
                TL_stars.StarGift starGift = (TL_stars.StarGift) this.f;
                long j11 = this.b;
                v10 v10Var2 = (v10) this.h;
                zArr2[0] = true;
                eaVar2.h(tL_payments_paymentFormStarGift, starGift, j11, null, true, v10Var2);
                break;
            case 3:
                di.r7 r7Var = (di.r7) this.d;
                TLObject tLObject3 = (TLObject) this.c;
                long j12 = this.b;
                View view = (View) this.e;
                di.o7 o7Var = (di.o7) this.f;
                qp qpVar = (qp) this.h;
                if (tLObject3 != null) {
                    TL_stories.TL_stories_peerStories tL_stories_peerStories = (TL_stories.TL_stories_peerStories) tLObject3;
                    qp.s1(r7Var.a).Y3(tL_stories_peerStories.users, false);
                    qp.s1(r7Var.a).S3(tL_stories_peerStories.chats, false);
                    TL_stories.PeerStories peerStories = tL_stories_peerStories.stories;
                    if (!peerStories.stories.isEmpty()) {
                        qp.s1(r7Var.a).P1().d0(j12, peerStories);
                        di.s7.n(peerStories, new w2(r7Var, view, j12, o7Var, 11));
                        z9 = false;
                        if (j12 > 0 && (a22 = qpVar.a2(Long.valueOf(j12))) != null) {
                            a22.stories_unavailable = true;
                            yr.a0(r7Var.a).m1(Collections.singletonList(a22), null, false, true);
                            qpVar.X3(a22, false, false);
                        }
                        if (j12 < 0 && (M0 = qpVar.M0(Long.valueOf(-j12))) != null) {
                            M0.stories_unavailable = true;
                            yr.a0(r7Var.a).m1(null, Collections.singletonList(M0), false, true);
                            qpVar.Q3(M0, false);
                        }
                        if (!z9) {
                            view.invalidate();
                            qp.s1(r7Var.a).P1().h0(j12, false);
                            break;
                        }
                    }
                }
                z9 = true;
                if (j12 > 0) {
                    a22.stories_unavailable = true;
                    yr.a0(r7Var.a).m1(Collections.singletonList(a22), null, false, true);
                    qpVar.X3(a22, false, false);
                }
                if (j12 < 0) {
                    M0.stories_unavailable = true;
                    yr.a0(r7Var.a).m1(null, Collections.singletonList(M0), false, true);
                    qpVar.Q3(M0, false);
                }
                if (!z9) {
                }
                break;
            case 4:
                k00 k00Var = (k00) this.d;
                TLObject tLObject4 = (TLObject) this.c;
                long j13 = this.b;
                TLRPC.TL_messages_forumTopics tL_messages_forumTopics = (TLRPC.TL_messages_forumTopics) this.e;
                a0.h hVar = (a0.h) this.f;
                Runnable runnable = (Runnable) this.h;
                TLRPC.TL_messages_forumTopics tL_messages_forumTopics2 = (TLRPC.TL_messages_forumTopics) tLObject4;
                k00Var.getMessagesController().Y3(tL_messages_forumTopics2.users, false);
                k00Var.getMessagesController().S3(tL_messages_forumTopics2.chats, false);
                k00Var.u(j13, tL_messages_forumTopics.topics, hVar, false, 2, -1);
                k00Var.getMessagesStorage().C1(k00Var.getConnectionsManager().getCurrentTime(), -j13, (List) k00Var.a.f(j13), true);
                k00Var.getMessagesStorage().j1(tL_messages_forumTopics.messages, false, true, false, 0, false, 0, 0L);
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            case 5:
                ((ConnectionsManager) this.d).lambda$sendRequestInternal$7((RequestDelegate) this.e, (TLObject) this.c, (TLRPC.TL_error) this.h, (RequestDelegateTimestamp) this.f, this.b);
                break;
            case 6:
                cn cnVar = (cn) this.d;
                l60 l60Var = (l60) this.c;
                long j14 = this.b;
                TLRPC.TL_messageEntityFormattedDate tL_messageEntityFormattedDate = (TLRPC.TL_messageEntityFormattedDate) this.e;
                ArrayList arrayList = (ArrayList) this.f;
                kk0 kk0Var = (kk0) this.h;
                l60Var.n0 = true;
                Activity parentActivity = cnVar.getParentActivity();
                long j15 = tL_messageEntityFormattedDate.date;
                bg.e0 e0Var = new bg.e0(cnVar, arrayList, j14, kk0Var, 3);
                ge geVar = new ge(kk0Var, i7);
                Pattern pattern = org.telegram.ui.Components.v4.a;
                org.telegram.ui.Components.v4.H(parentActivity, j14, j15, 0, true, e0Var, geVar, new org.telegram.ui.Components.s4(null), null);
                break;
            default:
                org.telegram.ui.ActionBar.f2 f2Var = (org.telegram.ui.ActionBar.f2) this.d;
                TLObject tLObject5 = (TLObject) this.c;
                vo voVar = (vo) this.e;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.h;
                Runnable runnable2 = (Runnable) this.f;
                long j16 = this.b;
                if (f2Var.getContext() != null) {
                    if (tLObject5 instanceof TL_chatlists.TL_chatlists_exportedInvites) {
                        TL_chatlists.TL_chatlists_exportedInvites tL_chatlists_exportedInvites = (TL_chatlists.TL_chatlists_exportedInvites) tLObject5;
                        f2Var.getMessagesController().S3(tL_chatlists_exportedInvites.chats, false);
                        f2Var.getMessagesController().Y3(tL_chatlists_exportedInvites.users, false);
                        new xy(f2Var, voVar, tL_chatlists_exportedInvites.invites).show();
                    } else if (tL_error2 == null || !"FILTER_ID_INVALID".equals(tL_error2.text) || voVar.e()) {
                        org.telegram.messenger.k5.p(null, 2131743879, org.telegram.ui.Components.hc.a0(f2Var), null);
                    } else {
                        new xy(f2Var, voVar, null).show();
                    }
                    if (runnable2 != null) {
                        org.telegram.messenger.g0.i3(runnable2, Math.max(0L, 200 - (System.currentTimeMillis() - j16)));
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ m3(ea eaVar, boolean[] zArr, long j3, TLObject tLObject, TLRPC.TL_textWithEntities tL_textWithEntities, v10 v10Var) {
        this.a = 1;
        this.d = eaVar;
        this.e = zArr;
        this.b = j3;
        this.c = tLObject;
        this.f = tL_textWithEntities;
        this.h = v10Var;
    }

    public /* synthetic */ m3(ea eaVar, boolean[] zArr, TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift, TL_stars.StarGift starGift, long j3, v10 v10Var) {
        this.a = 2;
        this.d = eaVar;
        this.c = zArr;
        this.e = tL_payments_paymentFormStarGift;
        this.f = starGift;
        this.b = j3;
        this.h = v10Var;
    }

    public /* synthetic */ m3(Object obj, Object obj2, long j3, Object obj3, Object obj4, Object obj5, int i7) {
        this.a = i7;
        this.d = obj;
        this.c = obj2;
        this.b = j3;
        this.e = obj3;
        this.f = obj4;
        this.h = obj5;
    }

    public /* synthetic */ m3(ConnectionsManager connectionsManager, RequestDelegate requestDelegate, TLObject tLObject, TLRPC.TL_error tL_error, RequestDelegateTimestamp requestDelegateTimestamp, long j3) {
        this.a = 5;
        this.d = connectionsManager;
        this.e = requestDelegate;
        this.c = tLObject;
        this.h = tL_error;
        this.f = requestDelegateTimestamp;
        this.b = j3;
    }

    public /* synthetic */ m3(org.telegram.ui.ActionBar.f2 f2Var, TLObject tLObject, vo voVar, TLRPC.TL_error tL_error, Runnable runnable, long j3) {
        this.a = 7;
        this.d = f2Var;
        this.c = tLObject;
        this.e = voVar;
        this.h = tL_error;
        this.f = runnable;
        this.b = j3;
    }
}
