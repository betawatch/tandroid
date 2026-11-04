package ci;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.c00;
import org.telegram.messenger.hp;
import org.telegram.messenger.mo;
import org.telegram.messenger.n10;
import org.telegram.messenger.qr;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.RequestDelegateTimestamp;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_chatlists;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.f60;
import org.telegram.ui.Components.nk0;
import org.telegram.ui.ee;
import org.telegram.ui.sy;
import org.telegram.ui.wm;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class z2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;

    public /* synthetic */ z2(l6 l6Var, TLObject tLObject, String str, TL_stars.InputSavedStarGift inputSavedStarGift, TLRPC.TL_error tL_error, long j10) {
        this.a = 0;
        this.d = l6Var;
        this.c = tLObject;
        this.e = str;
        this.f = inputSavedStarGift;
        this.h = tL_error;
        this.b = j10;
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
        int i3 = 1;
        int i10 = 0;
        switch (this.a) {
            case 0:
                l6 l6Var = (l6) this.d;
                TLObject tLObject = (TLObject) this.c;
                String str = (String) this.e;
                TL_stars.InputSavedStarGift inputSavedStarGift = (TL_stars.InputSavedStarGift) this.f;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.h;
                long j10 = this.b;
                if (!(tLObject instanceof TLRPC.TL_payments_paymentResult)) {
                    if (tL_error != null && "BALANCE_TOO_LOW".equals(tL_error.text)) {
                        if (!hp.s1(l6Var.a).j7) {
                            e9 y9 = e9.y(l6Var.a, false);
                            t1 t1Var = new t1(l6Var, j10, 6);
                            y9.e = false;
                            y9.q(t1Var, false, true);
                            y9.e = true;
                            break;
                        } else {
                            l6Var.d2.setLoading(false);
                            e9.c0(l6Var.getContext(), l6Var.J0);
                            break;
                        }
                    } else {
                        l6Var.k().f0(tL_error, false);
                        break;
                    }
                } else {
                    TLRPC.TL_payments_paymentResult tL_payments_paymentResult = (TLRPC.TL_payments_paymentResult) tLObject;
                    hp.s1(l6Var.a).Y3(tL_payments_paymentResult.updates.users, false);
                    hp.s1(l6Var.a).S3(tL_payments_paymentResult.updates.chats, false);
                    e9.y(l6Var.a, false).S(false);
                    e9.y(l6Var.a, false).O();
                    if (!TextUtils.isEmpty(str) && (savedStarGift = l6Var.y2) != null) {
                        savedStarGift.flags &= -65537;
                        savedStarGift.prepaid_upgrade_hash = null;
                    }
                    l6Var.k2 = true;
                    l6Var.l3 = null;
                    l6Var.m1(inputSavedStarGift, tL_payments_paymentResult.updates, new m3(l6Var, str, i10));
                    Utilities.d.c(new n3(l6Var, tL_payments_paymentResult, i10));
                    break;
                }
                break;
            case 1:
                e9 e9Var = (e9) this.d;
                boolean[] zArr = (boolean[]) this.e;
                long j11 = this.b;
                TLObject tLObject2 = (TLObject) this.c;
                TLRPC.TL_textWithEntities tL_textWithEntities = (TLRPC.TL_textWithEntities) this.f;
                n10 n10Var = (n10) this.h;
                zArr[0] = true;
                e9Var.g(j11, tLObject2, tL_textWithEntities, n10Var);
                break;
            case 2:
                e9 e9Var2 = (e9) this.d;
                boolean[] zArr2 = (boolean[]) this.c;
                TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift = (TLRPC.TL_payments_paymentFormStarGift) this.e;
                TL_stars.StarGift starGift = (TL_stars.StarGift) this.f;
                long j12 = this.b;
                n10 n10Var2 = (n10) this.h;
                zArr2[0] = true;
                e9Var2.h(tL_payments_paymentFormStarGift, starGift, j12, null, true, n10Var2);
                break;
            case 3:
                ei.r7 r7Var = (ei.r7) this.d;
                TLObject tLObject3 = (TLObject) this.c;
                long j13 = this.b;
                View view = (View) this.e;
                ei.o7 o7Var = (ei.o7) this.f;
                hp hpVar = (hp) this.h;
                if (tLObject3 != null) {
                    TL_stories.TL_stories_peerStories tL_stories_peerStories = (TL_stories.TL_stories_peerStories) tLObject3;
                    hp.s1(r7Var.a).Y3(tL_stories_peerStories.users, false);
                    hp.s1(r7Var.a).S3(tL_stories_peerStories.chats, false);
                    TL_stories.PeerStories peerStories = tL_stories_peerStories.stories;
                    if (!peerStories.stories.isEmpty()) {
                        hp.s1(r7Var.a).P1().d0(j13, peerStories);
                        ei.s7.n(peerStories, new l2(r7Var, view, j13, o7Var, 11));
                        z10 = false;
                        if (j13 > 0 && (a22 = hpVar.a2(Long.valueOf(j13))) != null) {
                            a22.stories_unavailable = true;
                            qr.a0(r7Var.a).m1(Collections.singletonList(a22), null, false, true);
                            hpVar.X3(a22, false, false);
                        }
                        if (j13 < 0 && (M0 = hpVar.M0(Long.valueOf(-j13))) != null) {
                            M0.stories_unavailable = true;
                            qr.a0(r7Var.a).m1(null, Collections.singletonList(M0), false, true);
                            hpVar.Q3(M0, false);
                        }
                        if (!z10) {
                            view.invalidate();
                            hp.s1(r7Var.a).P1().h0(j13, false);
                            break;
                        }
                    }
                }
                z10 = true;
                if (j13 > 0) {
                    a22.stories_unavailable = true;
                    qr.a0(r7Var.a).m1(Collections.singletonList(a22), null, false, true);
                    hpVar.X3(a22, false, false);
                }
                if (j13 < 0) {
                    M0.stories_unavailable = true;
                    qr.a0(r7Var.a).m1(null, Collections.singletonList(M0), false, true);
                    hpVar.Q3(M0, false);
                }
                if (!z10) {
                }
                break;
            case 4:
                c00 c00Var = (c00) this.d;
                TLObject tLObject4 = (TLObject) this.c;
                long j14 = this.b;
                TLRPC.TL_messages_forumTopics tL_messages_forumTopics = (TLRPC.TL_messages_forumTopics) this.e;
                a0.h hVar = (a0.h) this.f;
                Runnable runnable = (Runnable) this.h;
                TLRPC.TL_messages_forumTopics tL_messages_forumTopics2 = (TLRPC.TL_messages_forumTopics) tLObject4;
                c00Var.getMessagesController().Y3(tL_messages_forumTopics2.users, false);
                c00Var.getMessagesController().S3(tL_messages_forumTopics2.chats, false);
                c00Var.u(j14, tL_messages_forumTopics.topics, hVar, false, 2, -1);
                c00Var.getMessagesStorage().C1(c00Var.getConnectionsManager().getCurrentTime(), -j14, (List) c00Var.a.f(j14), true);
                c00Var.getMessagesStorage().j1(tL_messages_forumTopics.messages, false, true, false, 0, false, 0, 0L);
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            case 5:
                ((ConnectionsManager) this.d).lambda$sendRequestInternal$7((RequestDelegate) this.e, (TLObject) this.c, (TLRPC.TL_error) this.h, (RequestDelegateTimestamp) this.f, this.b);
                break;
            case 6:
                wm wmVar = (wm) this.d;
                f60 f60Var = (f60) this.c;
                long j15 = this.b;
                TLRPC.TL_messageEntityFormattedDate tL_messageEntityFormattedDate = (TLRPC.TL_messageEntityFormattedDate) this.e;
                ArrayList arrayList = (ArrayList) this.f;
                nk0 nk0Var = (nk0) this.h;
                f60Var.n0 = true;
                Activity parentActivity = wmVar.getParentActivity();
                long j16 = tL_messageEntityFormattedDate.date;
                cg.d0 d0Var = new cg.d0(wmVar, arrayList, j15, nk0Var, 3);
                ee eeVar = new ee(nk0Var, i3);
                Pattern pattern = org.telegram.ui.Components.t4.a;
                org.telegram.ui.Components.t4.J(parentActivity, j15, j16, 0, true, d0Var, eeVar, new org.telegram.ui.Components.q4(null), null);
                break;
            default:
                org.telegram.ui.ActionBar.d2 d2Var = (org.telegram.ui.ActionBar.d2) this.d;
                TLObject tLObject5 = (TLObject) this.c;
                mo moVar = (mo) this.e;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.h;
                Runnable runnable2 = (Runnable) this.f;
                long j17 = this.b;
                if (d2Var.getContext() != null) {
                    if (tLObject5 instanceof TL_chatlists.TL_chatlists_exportedInvites) {
                        TL_chatlists.TL_chatlists_exportedInvites tL_chatlists_exportedInvites = (TL_chatlists.TL_chatlists_exportedInvites) tLObject5;
                        d2Var.getMessagesController().S3(tL_chatlists_exportedInvites.chats, false);
                        d2Var.getMessagesController().Y3(tL_chatlists_exportedInvites.users, false);
                        new sy(d2Var, moVar, tL_chatlists_exportedInvites.invites).show();
                    } else if (tL_error2 == null || !"FILTER_ID_INVALID".equals(tL_error2.text) || moVar.e()) {
                        org.telegram.messenger.k5.p(null, 2131743889, org.telegram.ui.Components.fc.a0(d2Var), null);
                    } else {
                        new sy(d2Var, moVar, null).show();
                    }
                    if (runnable2 != null) {
                        org.telegram.messenger.g0.i3(runnable2, Math.max(0L, 200 - (System.currentTimeMillis() - j17)));
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ z2(e9 e9Var, boolean[] zArr, long j10, TLObject tLObject, TLRPC.TL_textWithEntities tL_textWithEntities, n10 n10Var) {
        this.a = 1;
        this.d = e9Var;
        this.e = zArr;
        this.b = j10;
        this.c = tLObject;
        this.f = tL_textWithEntities;
        this.h = n10Var;
    }

    public /* synthetic */ z2(e9 e9Var, boolean[] zArr, TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift, TL_stars.StarGift starGift, long j10, n10 n10Var) {
        this.a = 2;
        this.d = e9Var;
        this.c = zArr;
        this.e = tL_payments_paymentFormStarGift;
        this.f = starGift;
        this.b = j10;
        this.h = n10Var;
    }

    public /* synthetic */ z2(Object obj, Object obj2, long j10, Object obj3, Object obj4, Object obj5, int i3) {
        this.a = i3;
        this.d = obj;
        this.c = obj2;
        this.b = j10;
        this.e = obj3;
        this.f = obj4;
        this.h = obj5;
    }

    public /* synthetic */ z2(ConnectionsManager connectionsManager, RequestDelegate requestDelegate, TLObject tLObject, TLRPC.TL_error tL_error, RequestDelegateTimestamp requestDelegateTimestamp, long j10) {
        this.a = 5;
        this.d = connectionsManager;
        this.e = requestDelegate;
        this.c = tLObject;
        this.h = tL_error;
        this.f = requestDelegateTimestamp;
        this.b = j10;
    }

    public /* synthetic */ z2(org.telegram.ui.ActionBar.d2 d2Var, TLObject tLObject, mo moVar, TLRPC.TL_error tL_error, Runnable runnable, long j10) {
        this.a = 7;
        this.d = d2Var;
        this.c = tLObject;
        this.e = moVar;
        this.h = tL_error;
        this.f = runnable;
        this.b = j10;
    }
}
