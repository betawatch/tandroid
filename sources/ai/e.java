package ai;

import android.app.Activity;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import di.c6;
import di.d3;
import di.e3;
import di.v8;
import fi.h7;
import fi.k7;
import fi.l7;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.h00;
import org.telegram.messenger.k5;
import org.telegram.messenger.np;
import org.telegram.messenger.s10;
import org.telegram.messenger.so;
import org.telegram.messenger.vr;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.RequestDelegateTimestamp;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_chatlists;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.m60;
import org.telegram.ui.Components.ok0;
import org.telegram.ui.Components.q4;
import org.telegram.ui.Components.t4;
import org.telegram.ui.an;
import org.telegram.ui.de;
import org.telegram.ui.wy;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class e implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;

    public /* synthetic */ e(c6 c6Var, TLObject tLObject, String str, TL_stars.InputSavedStarGift inputSavedStarGift, TLRPC.TL_error tL_error, long j3) {
        this.a = 1;
        this.d = c6Var;
        this.e = tLObject;
        this.b = str;
        this.f = inputSavedStarGift;
        this.h = tL_error;
        this.c = j3;
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x01eb  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        TL_stars.SavedStarGift savedStarGift;
        boolean z10;
        TLRPC.Chat M0;
        TLRPC.User a22;
        int i7 = 1;
        int i10 = 0;
        switch (this.a) {
            case 0:
                i iVar = (i) this.d;
                boolean[] zArr = (boolean[]) this.e;
                h hVar = (h) this.f;
                String str = (String) this.b;
                g gVar = (g) this.h;
                long j3 = this.c;
                iVar.getClass();
                if (!zArr[0]) {
                    zArr[0] = true;
                    Log.d("Dictation", "AI server timeout (25 s): " + hVar.a + " → mock");
                    iVar.b();
                    i.c(hVar, str, gVar, j3);
                    break;
                }
                break;
            case 1:
                c6 c6Var = (c6) this.d;
                TLObject tLObject = (TLObject) this.e;
                String str2 = (String) this.b;
                TL_stars.InputSavedStarGift inputSavedStarGift = (TL_stars.InputSavedStarGift) this.f;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.h;
                long j10 = this.c;
                if (!(tLObject instanceof TLRPC.TL_payments_paymentResult)) {
                    if (tL_error != null && "BALANCE_TOO_LOW".equals(tL_error.text)) {
                        if (!np.s1(c6Var.a).k7) {
                            v8 y10 = v8.y(c6Var.a, false);
                            di.m1 m1Var = new di.m1(c6Var, j10, 6);
                            y10.e = false;
                            y10.q(m1Var, false, true);
                            y10.e = true;
                            break;
                        } else {
                            c6Var.g2.setLoading(false);
                            v8.c0(c6Var.getContext(), c6Var.J0);
                            break;
                        }
                    } else {
                        c6Var.k().f0(tL_error, false);
                        break;
                    }
                } else {
                    TLRPC.TL_payments_paymentResult tL_payments_paymentResult = (TLRPC.TL_payments_paymentResult) tLObject;
                    np.s1(c6Var.a).Y3(tL_payments_paymentResult.updates.users, false);
                    np.s1(c6Var.a).S3(tL_payments_paymentResult.updates.chats, false);
                    v8.y(c6Var.a, false).S(false);
                    v8.y(c6Var.a, false).O();
                    if (!TextUtils.isEmpty(str2) && (savedStarGift = c6Var.B2) != null) {
                        savedStarGift.flags &= -65537;
                        savedStarGift.prepaid_upgrade_hash = null;
                    }
                    c6Var.n2 = true;
                    c6Var.o3 = null;
                    c6Var.m1(inputSavedStarGift, tL_payments_paymentResult.updates, new d3(c6Var, str2, i10));
                    Utilities.d.c(new e3(c6Var, tL_payments_paymentResult, i10));
                    break;
                }
                break;
            case 2:
                v8 v8Var = (v8) this.d;
                boolean[] zArr2 = (boolean[]) this.e;
                long j11 = this.c;
                TLObject tLObject2 = (TLObject) this.f;
                TLRPC.TL_textWithEntities tL_textWithEntities = (TLRPC.TL_textWithEntities) this.b;
                s10 s10Var = (s10) this.h;
                zArr2[0] = true;
                v8Var.g(j11, tLObject2, tL_textWithEntities, s10Var);
                break;
            case 3:
                v8 v8Var2 = (v8) this.d;
                boolean[] zArr3 = (boolean[]) this.e;
                TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift = (TLRPC.TL_payments_paymentFormStarGift) this.f;
                TL_stars.StarGift starGift = (TL_stars.StarGift) this.b;
                long j12 = this.c;
                s10 s10Var2 = (s10) this.h;
                zArr3[0] = true;
                v8Var2.h(tL_payments_paymentFormStarGift, starGift, j12, null, true, s10Var2);
                break;
            case 4:
                k7 k7Var = (k7) this.d;
                TLObject tLObject3 = (TLObject) this.e;
                long j13 = this.c;
                View view = (View) this.f;
                h7 h7Var = (h7) this.b;
                np npVar = (np) this.h;
                if (tLObject3 != null) {
                    TL_stories.TL_stories_peerStories tL_stories_peerStories = (TL_stories.TL_stories_peerStories) tLObject3;
                    np.s1(k7Var.a).Y3(tL_stories_peerStories.users, false);
                    np.s1(k7Var.a).S3(tL_stories_peerStories.chats, false);
                    TL_stories.PeerStories peerStories = tL_stories_peerStories.stories;
                    if (!peerStories.stories.isEmpty()) {
                        np.s1(k7Var.a).P1().d0(j13, peerStories);
                        l7.n(peerStories, new di.f2(k7Var, view, j13, h7Var, 11));
                        z10 = false;
                        if (j13 > 0 && (a22 = npVar.a2(Long.valueOf(j13))) != null) {
                            a22.stories_unavailable = true;
                            vr.a0(k7Var.a).m1(Collections.singletonList(a22), null, false, true);
                            npVar.X3(a22, false, false);
                        }
                        if (j13 < 0 && (M0 = npVar.M0(Long.valueOf(-j13))) != null) {
                            M0.stories_unavailable = true;
                            vr.a0(k7Var.a).m1(null, Collections.singletonList(M0), false, true);
                            npVar.Q3(M0, false);
                        }
                        if (!z10) {
                            view.invalidate();
                            np.s1(k7Var.a).P1().h0(j13, false);
                            break;
                        }
                    }
                }
                z10 = true;
                if (j13 > 0) {
                    a22.stories_unavailable = true;
                    vr.a0(k7Var.a).m1(Collections.singletonList(a22), null, false, true);
                    npVar.X3(a22, false, false);
                }
                if (j13 < 0) {
                    M0.stories_unavailable = true;
                    vr.a0(k7Var.a).m1(null, Collections.singletonList(M0), false, true);
                    npVar.Q3(M0, false);
                }
                if (!z10) {
                }
                break;
            case 5:
                h00 h00Var = (h00) this.d;
                TLObject tLObject4 = (TLObject) this.e;
                long j14 = this.c;
                TLRPC.TL_messages_forumTopics tL_messages_forumTopics = (TLRPC.TL_messages_forumTopics) this.f;
                a0.h hVar2 = (a0.h) this.b;
                Runnable runnable = (Runnable) this.h;
                TLRPC.TL_messages_forumTopics tL_messages_forumTopics2 = (TLRPC.TL_messages_forumTopics) tLObject4;
                h00Var.getMessagesController().Y3(tL_messages_forumTopics2.users, false);
                h00Var.getMessagesController().S3(tL_messages_forumTopics2.chats, false);
                h00Var.u(j14, tL_messages_forumTopics.topics, hVar2, false, 2, -1);
                h00Var.getMessagesStorage().C1(h00Var.getConnectionsManager().getCurrentTime(), -j14, (List) h00Var.a.f(j14), true);
                h00Var.getMessagesStorage().j1(tL_messages_forumTopics.messages, false, true, false, 0, false, 0, 0L);
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            case 6:
                ((ConnectionsManager) this.d).lambda$sendRequestInternal$7((RequestDelegate) this.e, (TLObject) this.f, (TLRPC.TL_error) this.b, (RequestDelegateTimestamp) this.h, this.c);
                break;
            case 7:
                an anVar = (an) this.d;
                m60 m60Var = (m60) this.e;
                long j15 = this.c;
                TLRPC.TL_messageEntityFormattedDate tL_messageEntityFormattedDate = (TLRPC.TL_messageEntityFormattedDate) this.f;
                ArrayList arrayList = (ArrayList) this.b;
                ok0 ok0Var = (ok0) this.h;
                m60Var.n0 = true;
                Activity parentActivity = anVar.getParentActivity();
                long j16 = tL_messageEntityFormattedDate.date;
                bg.e0 e0Var = new bg.e0(anVar, arrayList, j15, ok0Var, 3);
                de deVar = new de(ok0Var, i7);
                Pattern pattern = t4.a;
                t4.H(parentActivity, j15, j16, 0, true, e0Var, deVar, new q4(null), null);
                break;
            default:
                org.telegram.ui.ActionBar.e2 e2Var = (org.telegram.ui.ActionBar.e2) this.d;
                TLObject tLObject5 = (TLObject) this.e;
                so soVar = (so) this.f;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.b;
                Runnable runnable2 = (Runnable) this.h;
                long j17 = this.c;
                if (e2Var.getContext() != null) {
                    if (tLObject5 instanceof TL_chatlists.TL_chatlists_exportedInvites) {
                        TL_chatlists.TL_chatlists_exportedInvites tL_chatlists_exportedInvites = (TL_chatlists.TL_chatlists_exportedInvites) tLObject5;
                        e2Var.getMessagesController().S3(tL_chatlists_exportedInvites.chats, false);
                        e2Var.getMessagesController().Y3(tL_chatlists_exportedInvites.users, false);
                        new wy(e2Var, soVar, tL_chatlists_exportedInvites.invites).show();
                    } else if (tL_error2 == null || !"FILTER_ID_INVALID".equals(tL_error2.text) || soVar.e()) {
                        k5.o(null, 2131743879, cc.a0(e2Var), null);
                    } else {
                        new wy(e2Var, soVar, null).show();
                    }
                    if (runnable2 != null) {
                        org.telegram.messenger.g0.i3(runnable2, Math.max(0L, 200 - (System.currentTimeMillis() - j17)));
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ e(v8 v8Var, boolean[] zArr, TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift, TL_stars.StarGift starGift, long j3, s10 s10Var) {
        this.a = 3;
        this.d = v8Var;
        this.e = zArr;
        this.f = tL_payments_paymentFormStarGift;
        this.b = starGift;
        this.c = j3;
        this.h = s10Var;
    }

    public /* synthetic */ e(Object obj, Object obj2, long j3, Object obj3, Object obj4, Object obj5, int i7) {
        this.a = i7;
        this.d = obj;
        this.e = obj2;
        this.c = j3;
        this.f = obj3;
        this.b = obj4;
        this.h = obj5;
    }

    public /* synthetic */ e(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, long j3, int i7) {
        this.a = i7;
        this.d = obj;
        this.e = obj2;
        this.f = obj3;
        this.b = obj4;
        this.h = obj5;
        this.c = j3;
    }
}
