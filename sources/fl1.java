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

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class fl1 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;

    public /* synthetic */ fl1(Object obj, Object obj2, long j, Object obj3, Object obj4, Object obj5, byte b) {
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
        TLRPC.Chat K0;
        TLRPC.User V1;
        byte b = 1;
        byte b2 = 0;
        switch (this.a) {
            case 0:
                mu1 mu1Var = (mu1) this.c;
                cs5 cs5Var = (cs5) this.d;
                long j = this.b;
                TLRPC.TL_messageEntityFormattedDate tL_messageEntityFormattedDate = (TLRPC.TL_messageEntityFormattedDate) this.e;
                ArrayList arrayList = (ArrayList) this.f;
                tq9 tq9Var = (tq9) this.h;
                cs5Var.q0 = true;
                Activity parentActivity = mu1Var.getParentActivity();
                long j2 = tL_messageEntityFormattedDate.date;
                qm1 qm1Var = new qm1((Object) mu1Var, (Object) arrayList, j, (Object) tq9Var, (byte) 0);
                zk1 zk1Var = new zk1(tq9Var, b);
                Pattern pattern = ij.a;
                ij.H(parentActivity, j, j2, 0, true, qm1Var, zk1Var, new fj(null), null);
                break;
            case 1:
                ((ConnectionsManager) this.c).lambda$sendRequestInternal$7((RequestDelegate) this.d, (TLObject) this.e, (TLRPC.TL_error) this.f, (RequestDelegateTimestamp) this.h, this.b);
                break;
            case 2:
                d dVar = (d) this.c;
                TLObject tLObject = (TLObject) this.d;
                t97 t97Var = (t97) this.e;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f;
                s54 s54Var = (s54) this.h;
                long j3 = this.b;
                if (dVar.getContext() != null) {
                    if (tLObject instanceof TL_chatlists.TL_chatlists_exportedInvites) {
                        TL_chatlists.TL_chatlists_exportedInvites tL_chatlists_exportedInvites = (TL_chatlists.TL_chatlists_exportedInvites) tLObject;
                        dVar.getMessagesController().U3(tL_chatlists_exportedInvites.chats, false);
                        dVar.getMessagesController().a4(tL_chatlists_exportedInvites.users, false);
                        new cd4(dVar, t97Var, tL_chatlists_exportedInvites.invites).show();
                    } else if (tL_error == null || !"FILTER_ID_INVALID".equals(tL_error.text) || t97Var.d()) {
                        yjb.x(null, 2131743640, u21.b0(dVar), null);
                    } else {
                        new cd4(dVar, t97Var, null).show();
                    }
                    if (s54Var != null) {
                        gl.e3(s54Var, Math.max(0L, 200 - (System.currentTimeMillis() - j3)));
                        break;
                    }
                }
                break;
            case 3:
                vqa vqaVar = (vqa) this.c;
                TLObject tLObject2 = (TLObject) this.d;
                String str = (String) this.e;
                TL_stars.InputSavedStarGift inputSavedStarGift = (TL_stars.InputSavedStarGift) this.f;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.h;
                long j4 = this.b;
                if (!(tLObject2 instanceof TLRPC.TL_payments_paymentResult)) {
                    if (tL_error2 != null && "BALANCE_TOO_LOW".equals(tL_error2.text)) {
                        if (!na7.q1(vqaVar.a).Z4()) {
                            vqaVar.f2.setLoading(false);
                            gta.c0(vqaVar.getContext(), vqaVar.J0);
                            break;
                        } else {
                            gta v = gta.v(vqaVar.a, false);
                            pna pnaVar = new pna(vqaVar, j4, (byte) 6);
                            v.e = false;
                            v.n(pnaVar, false, true);
                            v.e = true;
                            break;
                        }
                    } else {
                        vqaVar.j().g0(tL_error2, false);
                        break;
                    }
                } else {
                    TLRPC.TL_payments_paymentResult tL_payments_paymentResult = (TLRPC.TL_payments_paymentResult) tLObject2;
                    na7.q1(vqaVar.a).a4(tL_payments_paymentResult.updates.users, false);
                    na7.q1(vqaVar.a).U3(tL_payments_paymentResult.updates.chats, false);
                    gta.v(vqaVar.a, false).P(false);
                    gta.v(vqaVar.a, false).L();
                    if (!TextUtils.isEmpty(str) && (savedStarGift = vqaVar.A2) != null) {
                        savedStarGift.flags &= -65537;
                        savedStarGift.prepaid_upgrade_hash = null;
                    }
                    vqaVar.m2 = true;
                    vqaVar.q3 = null;
                    vqaVar.c1(inputSavedStarGift, tL_payments_paymentResult.updates, new noa(vqaVar, str, b));
                    Utilities.d.c(new ooa(vqaVar, tL_payments_paymentResult, b2));
                    break;
                }
                break;
            case 4:
                gta gtaVar = (gta) this.c;
                boolean[] zArr = (boolean[]) this.d;
                long j5 = this.b;
                TLObject tLObject3 = (TLObject) this.e;
                TLRPC.TL_textWithEntities tL_textWithEntities = (TLRPC.TL_textWithEntities) this.f;
                i8c i8cVar = (i8c) this.h;
                zArr[0] = true;
                gtaVar.e(j5, tLObject3, tL_textWithEntities, i8cVar);
                break;
            case 5:
                w2b w2bVar = (w2b) this.c;
                TLObject tLObject4 = (TLObject) this.d;
                long j6 = this.b;
                View view = (View) this.e;
                u2b u2bVar = (u2b) this.f;
                na7 na7Var = (na7) this.h;
                if (tLObject4 != null) {
                    TL_stories.TL_stories_peerStories tL_stories_peerStories = (TL_stories.TL_stories_peerStories) tLObject4;
                    na7.q1(w2bVar.a).a4(tL_stories_peerStories.users, false);
                    na7.q1(w2bVar.a).U3(tL_stories_peerStories.chats, false);
                    TL_stories.PeerStories peerStories = tL_stories_peerStories.stories;
                    if (!peerStories.stories.isEmpty()) {
                        na7.q1(w2bVar.a).M1().c0(j6, peerStories);
                        x2b.n(peerStories, new mx8((Object) w2bVar, (Object) view, j6, (Object) u2bVar, (byte) 13));
                        z = false;
                        if (j6 > 0 && (V1 = na7Var.V1(Long.valueOf(j6))) != null) {
                            V1.stories_unavailable = true;
                            ad7.Y(w2bVar.a).j1(Collections.singletonList(V1), null, false, true);
                            na7Var.Z3(V1, false, false);
                        }
                        if (j6 < 0 && (K0 = na7Var.K0(Long.valueOf(-j6))) != null) {
                            K0.stories_unavailable = true;
                            ad7.Y(w2bVar.a).j1(null, Collections.singletonList(K0), false, true);
                            na7Var.S3(K0, false);
                        }
                        if (!z) {
                            view.invalidate();
                            na7.q1(w2bVar.a).M1().g0(j6, false);
                            break;
                        }
                    }
                }
                z = true;
                if (j6 > 0) {
                    V1.stories_unavailable = true;
                    ad7.Y(w2bVar.a).j1(Collections.singletonList(V1), null, false, true);
                    na7Var.Z3(V1, false, false);
                }
                if (j6 < 0) {
                    K0.stories_unavailable = true;
                    ad7.Y(w2bVar.a).j1(null, Collections.singletonList(K0), false, true);
                    na7Var.S3(K0, false);
                }
                if (!z) {
                }
                break;
            default:
                pub pubVar = (pub) this.c;
                TLObject tLObject5 = (TLObject) this.d;
                long j7 = this.b;
                TLRPC.TL_messages_forumTopics tL_messages_forumTopics = (TLRPC.TL_messages_forumTopics) this.e;
                vf6 vf6Var = (vf6) this.f;
                n30 n30Var = (n30) this.h;
                TLRPC.TL_messages_forumTopics tL_messages_forumTopics2 = (TLRPC.TL_messages_forumTopics) tLObject5;
                pubVar.getMessagesController().a4(tL_messages_forumTopics2.users, false);
                pubVar.getMessagesController().U3(tL_messages_forumTopics2.chats, false);
                pubVar.u(j7, tL_messages_forumTopics.topics, vf6Var, false, 2, -1);
                pubVar.getMessagesStorage().z1(pubVar.getConnectionsManager().getCurrentTime(), -j7, (List) pubVar.a.f(j7), true);
                pubVar.getMessagesStorage().g1(tL_messages_forumTopics.messages, false, true, false, 0, false, 0, 0L);
                if (n30Var != null) {
                    n30Var.run();
                    break;
                }
                break;
        }
    }

    public /* synthetic */ fl1(Object obj, Object obj2, Object obj3, TLObject tLObject, Object obj4, long j, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = tLObject;
        this.h = obj4;
        this.b = j;
    }
}
