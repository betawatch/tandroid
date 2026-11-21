package di;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.e00;
import org.telegram.messenger.mp;
import org.telegram.messenger.q10;
import org.telegram.messenger.ro;
import org.telegram.messenger.tr;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.RequestDelegateTimestamp;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_chatlists;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.a70;
import org.telegram.ui.Components.yk0;
import org.telegram.ui.bn;
import org.telegram.ui.fe;
import org.telegram.ui.zy;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final /* synthetic */ class a3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;

    public /* synthetic */ a3(f6 f6Var, TLObject tLObject, String str, TL_stars.InputSavedStarGift inputSavedStarGift, TLRPC.TL_error tL_error, long j3) {
        this.a = 0;
        this.d = f6Var;
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
        boolean z10;
        TLRPC.Chat O0;
        TLRPC.User c22;
        int i7 = 1;
        int i10 = 0;
        switch (this.a) {
            case 0:
                f6 f6Var = (f6) this.d;
                TLObject tLObject = (TLObject) this.c;
                String str = (String) this.e;
                TL_stars.InputSavedStarGift inputSavedStarGift = (TL_stars.InputSavedStarGift) this.f;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.h;
                long j3 = this.b;
                if (!(tLObject instanceof TLRPC.TL_payments_paymentResult)) {
                    if (tL_error != null && "BALANCE_TOO_LOW".equals(tL_error.text)) {
                        if (!mp.u1(f6Var.a).m7) {
                            y8 y10 = y8.y(f6Var.a, false);
                            m1 m1Var = new m1(f6Var, j3, 6);
                            y10.e = false;
                            y10.q(m1Var, false, true);
                            y10.e = true;
                            break;
                        } else {
                            f6Var.g2.setLoading(false);
                            y8.c0(f6Var.getContext(), f6Var.J0);
                            break;
                        }
                    } else {
                        f6Var.k().g0(tL_error, false);
                        break;
                    }
                } else {
                    TLRPC.TL_payments_paymentResult tL_payments_paymentResult = (TLRPC.TL_payments_paymentResult) tLObject;
                    mp.u1(f6Var.a).f4(tL_payments_paymentResult.updates.users, false);
                    mp.u1(f6Var.a).Z3(tL_payments_paymentResult.updates.chats, false);
                    y8.y(f6Var.a, false).R(false);
                    y8.y(f6Var.a, false).N();
                    if (!TextUtils.isEmpty(str) && (savedStarGift = f6Var.B2) != null) {
                        savedStarGift.flags &= -65537;
                        savedStarGift.prepaid_upgrade_hash = null;
                    }
                    f6Var.n2 = true;
                    f6Var.r3 = null;
                    f6Var.o1(inputSavedStarGift, tL_payments_paymentResult.updates, new h3(f6Var, str, i7));
                    Utilities.d.c(new i3(f6Var, tL_payments_paymentResult, i10));
                    break;
                }
                break;
            case 1:
                y8 y8Var = (y8) this.d;
                boolean[] zArr = (boolean[]) this.e;
                long j10 = this.b;
                TLObject tLObject2 = (TLObject) this.c;
                TLRPC.TL_textWithEntities tL_textWithEntities = (TLRPC.TL_textWithEntities) this.f;
                q10 q10Var = (q10) this.h;
                zArr[0] = true;
                y8Var.g(j10, tLObject2, tL_textWithEntities, q10Var);
                break;
            case 2:
                fi.h7 h7Var = (fi.h7) this.d;
                TLObject tLObject3 = (TLObject) this.c;
                long j11 = this.b;
                View view = (View) this.e;
                fi.e7 e7Var = (fi.e7) this.f;
                mp mpVar = (mp) this.h;
                if (tLObject3 != null) {
                    TL_stories.TL_stories_peerStories tL_stories_peerStories = (TL_stories.TL_stories_peerStories) tLObject3;
                    mp.u1(h7Var.a).f4(tL_stories_peerStories.users, false);
                    mp.u1(h7Var.a).Z3(tL_stories_peerStories.chats, false);
                    TL_stories.PeerStories peerStories = tL_stories_peerStories.stories;
                    if (!peerStories.stories.isEmpty()) {
                        mp.u1(h7Var.a).R1().d0(j11, peerStories);
                        fi.i7.n(peerStories, new j2(h7Var, view, j11, e7Var, 10));
                        z10 = false;
                        if (j11 > 0 && (c22 = mpVar.c2(Long.valueOf(j11))) != null) {
                            c22.stories_unavailable = true;
                            tr.a0(h7Var.a).m1(Collections.singletonList(c22), null, false, true);
                            mpVar.e4(c22, false, false);
                        }
                        if (j11 < 0 && (O0 = mpVar.O0(Long.valueOf(-j11))) != null) {
                            O0.stories_unavailable = true;
                            tr.a0(h7Var.a).m1(null, Collections.singletonList(O0), false, true);
                            mpVar.X3(O0, false);
                        }
                        if (!z10) {
                            view.invalidate();
                            mp.u1(h7Var.a).R1().h0(j11, false);
                            break;
                        }
                    }
                }
                z10 = true;
                if (j11 > 0) {
                    c22.stories_unavailable = true;
                    tr.a0(h7Var.a).m1(Collections.singletonList(c22), null, false, true);
                    mpVar.e4(c22, false, false);
                }
                if (j11 < 0) {
                    O0.stories_unavailable = true;
                    tr.a0(h7Var.a).m1(null, Collections.singletonList(O0), false, true);
                    mpVar.X3(O0, false);
                }
                if (!z10) {
                }
                break;
            case 3:
                e00 e00Var = (e00) this.d;
                TLObject tLObject4 = (TLObject) this.c;
                long j12 = this.b;
                TLRPC.TL_messages_forumTopics tL_messages_forumTopics = (TLRPC.TL_messages_forumTopics) this.e;
                a0.h hVar = (a0.h) this.f;
                Runnable runnable = (Runnable) this.h;
                TLRPC.TL_messages_forumTopics tL_messages_forumTopics2 = (TLRPC.TL_messages_forumTopics) tLObject4;
                e00Var.getMessagesController().f4(tL_messages_forumTopics2.users, false);
                e00Var.getMessagesController().Z3(tL_messages_forumTopics2.chats, false);
                e00Var.u(j12, tL_messages_forumTopics.topics, hVar, false, 2, -1);
                e00Var.getMessagesStorage().C1(e00Var.getConnectionsManager().getCurrentTime(), -j12, (List) e00Var.a.f(j12), true);
                e00Var.getMessagesStorage().j1(tL_messages_forumTopics.messages, false, true, false, 0, false, 0, 0L);
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            case 4:
                ((ConnectionsManager) this.d).lambda$sendRequestInternal$7((RequestDelegate) this.e, (TLObject) this.c, (TLRPC.TL_error) this.h, (RequestDelegateTimestamp) this.f, this.b);
                break;
            case 5:
                bn bnVar = (bn) this.d;
                a70 a70Var = (a70) this.c;
                long j13 = this.b;
                TLRPC.TL_messageEntityFormattedDate tL_messageEntityFormattedDate = (TLRPC.TL_messageEntityFormattedDate) this.e;
                ArrayList arrayList = (ArrayList) this.f;
                yk0 yk0Var = (yk0) this.h;
                a70Var.q0 = true;
                Activity parentActivity = bnVar.getParentActivity();
                long j14 = tL_messageEntityFormattedDate.date;
                bg.f0 f0Var = new bg.f0(bnVar, arrayList, j13, yk0Var, 4);
                fe feVar = new fe(yk0Var, i7);
                Pattern pattern = org.telegram.ui.Components.c5.a;
                org.telegram.ui.Components.c5.H(parentActivity, j13, j14, 0, true, f0Var, feVar, new org.telegram.ui.Components.z4(null), null);
                break;
            default:
                org.telegram.ui.ActionBar.g2 g2Var = (org.telegram.ui.ActionBar.g2) this.d;
                TLObject tLObject5 = (TLObject) this.c;
                ro roVar = (ro) this.e;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.h;
                Runnable runnable2 = (Runnable) this.f;
                long j15 = this.b;
                if (g2Var.getContext() != null) {
                    if (tLObject5 instanceof TL_chatlists.TL_chatlists_exportedInvites) {
                        TL_chatlists.TL_chatlists_exportedInvites tL_chatlists_exportedInvites = (TL_chatlists.TL_chatlists_exportedInvites) tLObject5;
                        g2Var.getMessagesController().Z3(tL_chatlists_exportedInvites.chats, false);
                        g2Var.getMessagesController().f4(tL_chatlists_exportedInvites.users, false);
                        new zy(g2Var, roVar, tL_chatlists_exportedInvites.invites).show();
                    } else if (tL_error2 == null || !"FILTER_ID_INVALID".equals(tL_error2.text) || roVar.d()) {
                        org.telegram.messenger.f3.o(null, 2131743636, org.telegram.ui.Components.lc.b0(g2Var), null);
                    } else {
                        new zy(g2Var, roVar, null).show();
                    }
                    if (runnable2 != null) {
                        org.telegram.messenger.g0.h3(runnable2, Math.max(0L, 200 - (System.currentTimeMillis() - j15)));
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ a3(y8 y8Var, boolean[] zArr, long j3, TLObject tLObject, TLRPC.TL_textWithEntities tL_textWithEntities, q10 q10Var) {
        this.a = 1;
        this.d = y8Var;
        this.e = zArr;
        this.b = j3;
        this.c = tLObject;
        this.f = tL_textWithEntities;
        this.h = q10Var;
    }

    public /* synthetic */ a3(Object obj, Object obj2, long j3, Object obj3, Object obj4, Object obj5, int i7) {
        this.a = i7;
        this.d = obj;
        this.c = obj2;
        this.b = j3;
        this.e = obj3;
        this.f = obj4;
        this.h = obj5;
    }

    public /* synthetic */ a3(ConnectionsManager connectionsManager, RequestDelegate requestDelegate, TLObject tLObject, TLRPC.TL_error tL_error, RequestDelegateTimestamp requestDelegateTimestamp, long j3) {
        this.a = 4;
        this.d = connectionsManager;
        this.e = requestDelegate;
        this.c = tLObject;
        this.h = tL_error;
        this.f = requestDelegateTimestamp;
        this.b = j3;
    }

    public /* synthetic */ a3(org.telegram.ui.ActionBar.g2 g2Var, TLObject tLObject, ro roVar, TLRPC.TL_error tL_error, Runnable runnable, long j3) {
        this.a = 6;
        this.d = g2Var;
        this.c = tLObject;
        this.e = roVar;
        this.h = tL_error;
        this.f = runnable;
        this.b = j3;
    }
}
