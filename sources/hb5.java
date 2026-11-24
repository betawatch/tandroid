// default package

import android.app.job.JobParameters;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.util.SparseArray;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LanguageSelectActivity;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class hb5 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ hb5(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        TLRPC.TL_messages_searchStickerSets tL_messages_searchStickerSets;
        Object obj;
        Object obj2;
        Object obj3;
        zq5 zq5Var;
        cf1 cf1Var;
        int i;
        byte b = this.a;
        byte b2 = 4;
        Object obj4 = null;
        byte b3 = 1;
        int i2 = 0;
        Object obj5 = this.c;
        Object obj6 = this.b;
        switch (b) {
            case 0:
                TLObject tLObject = (TLObject) obj5;
                mb5 mb5Var = ((ib5) obj6).a.h;
                if (tLObject != null) {
                    mb5Var.h0((TLRPC.TL_messages_stickerSet) tLObject);
                    break;
                } else {
                    mb5Var.h0(null);
                    break;
                }
            case 1:
                lb5 lb5Var = (lb5) obj6;
                String str = (String) obj5;
                lb5Var.h = str;
                mb5 mb5Var2 = lb5Var.r;
                if (mb5Var2.O) {
                    TLRPC.TL_messages_searchEmojiStickerSets tL_messages_searchEmojiStickerSets = new TLRPC.TL_messages_searchEmojiStickerSets();
                    tL_messages_searchEmojiStickerSets.q = str;
                    tL_messages_searchStickerSets = tL_messages_searchEmojiStickerSets;
                } else {
                    TLRPC.TL_messages_searchStickerSets tL_messages_searchStickerSets2 = new TLRPC.TL_messages_searchStickerSets();
                    tL_messages_searchStickerSets2.q = str;
                    tL_messages_searchStickerSets = tL_messages_searchStickerSets2;
                }
                lb5Var.n = mb5Var2.getConnectionsManager().sendRequest(tL_messages_searchStickerSets, new k45(lb5Var, str, str, b3), 66);
                break;
            case 2:
                me5 me5Var = (me5) ((cm0) obj6).c;
                ArrayList arrayList = me5Var.h;
                arrayList.clear();
                arrayList.addAll((ArrayList) obj5);
                me5Var.n = false;
                va vaVar = me5Var.a;
                if (vaVar != null) {
                    vaVar.g3.O(true);
                    break;
                }
                break;
            case 3:
                se5 se5Var = (se5) obj6;
                gre.p(se5Var.k);
                se5Var.i.remove((String) obj5);
                if (se5Var.m != null) {
                    se5Var.e(-9223372036854775807L);
                    break;
                }
                break;
            case 4:
                gi3 gi3Var = ((tf5) obj6).c;
                Uri uri = ((te5) obj5).y;
                sa3 sa3Var = (sa3) ((ue5) gi3Var.a).b.d.get(uri);
                if (sa3Var != null) {
                    sa3Var.e(uri, true);
                    break;
                }
                break;
            case 5:
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj5;
                try {
                    taskCompletionSource.setResult(((dk5) obj6).a());
                    break;
                } catch (Exception e) {
                    taskCompletionSource.setException(e);
                    return;
                }
            case 6:
                gl.d3(new hb5(((fl5) obj6).h(), (Runnable) obj5, (byte) 8));
                break;
            case 7:
                fl5 fl5Var = (fl5) obj6;
                fl5Var.B.add((wk5) obj5);
                gl.d3(new o94(fl5Var, obj4, i2, b2));
                break;
            case 8:
                Runnable runnable = (Runnable) obj5;
                ba4.L = (SparseArray) obj6;
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            case 9:
                sk5 sk5Var = (sk5) obj6;
                tk5 tk5Var = sk5Var.a;
                fl5 fl5Var2 = sk5Var.e;
                al5 al5Var = new al5(fl5Var2, tk5Var, (String) obj5);
                tk5Var.t = al5Var;
                fl5Var2.n.add(al5Var);
                fl5Var2.Q(false);
                break;
            case 10:
                uk5 uk5Var = (uk5) obj6;
                BitmapDrawable bitmapDrawable = (BitmapDrawable) obj5;
                fl5 fl5Var3 = uk5Var.e;
                lk5 lk5Var = fl5Var3.e;
                tk5 tk5Var2 = uk5Var.c;
                if (bitmapDrawable instanceof oy8) {
                    oy8 oy8Var = (oy8) bitmapDrawable;
                    Object obj7 = (Drawable) lk5Var.f(tk5Var2.d);
                    if (obj7 == null) {
                        lk5Var.l(tk5Var2.d, oy8Var);
                        obj3 = oy8Var;
                    } else {
                        oy8Var.x(false);
                        obj3 = obj7;
                    }
                    fl5Var3.D(tk5Var2.d);
                    obj = tk5Var2.d;
                    obj4 = obj3;
                } else if (bitmapDrawable instanceof km) {
                    km kmVar = (km) bitmapDrawable;
                    if (kmVar.o0) {
                        String str2 = tk5Var2.d;
                        ThreadLocal threadLocal = fl5.I;
                        Object u = fl5Var3.u(str2);
                        if (u == null) {
                            lk5Var.l(tk5Var2.d, kmVar);
                            obj2 = kmVar;
                        } else {
                            kmVar.u();
                            obj2 = u;
                        }
                        fl5Var3.D(tk5Var2.d);
                        obj = tk5Var2.d;
                        obj4 = obj2;
                    }
                    obj = obj4;
                    obj4 = bitmapDrawable;
                } else if (ug8.A(bitmapDrawable)) {
                    BitmapDrawable v = fl5Var3.v(tk5Var2.d);
                    if (v != null) {
                        gl.w2(bitmapDrawable.getBitmap());
                        bitmapDrawable = v;
                    } else if (tk5Var2.d.endsWith("_f")) {
                        fl5Var3.d.l(tk5Var2.d, bitmapDrawable);
                        b3 = 0;
                    } else if (!tk5Var2.d.endsWith("_isc") && !tk5Var2.d.endsWith("_nocache") && bitmapDrawable.getBitmap().getWidth() <= gl.p * 80.0f && bitmapDrawable.getBitmap().getHeight() <= gl.p * 80.0f) {
                        fl5Var3.b.l(tk5Var2.d, bitmapDrawable);
                    } else if (!tk5Var2.d.endsWith("_nocache")) {
                        fl5Var3.c.l(tk5Var2.d, bitmapDrawable);
                    }
                    if (b3 != 0) {
                        fl5Var3.D(tk5Var2.d);
                        obj4 = tk5Var2.d;
                    }
                    obj = obj4;
                    obj4 = bitmapDrawable;
                } else {
                    obj = null;
                }
                fl5Var3.s.d(new jf4((Object) uk5Var, obj4, obj, (byte) 22), tk5Var2.a ? 1L : 0L);
                break;
            case 11:
                ((el5) obj6).d.v.remove((String) obj5);
                break;
            case 12:
                wl5 wl5Var = (wl5) obj6;
                Uri uri2 = (Uri) obj5;
                wl5Var.getClass();
                try {
                    LaunchActivity launchActivity = (LaunchActivity) wl5Var.a.getParentActivity();
                    if (launchActivity != null) {
                        Bundle bundle = new Bundle();
                        if (uri2 != null) {
                            bundle.putParcelable("photoUri", uri2);
                        }
                        r48 r48Var = new r48(bundle);
                        r48Var.e = false;
                        r48Var.f = false;
                        r48Var.c = wl5Var;
                        launchActivity.t0(r48Var);
                        break;
                    }
                } catch (Exception e2) {
                    fa4.g(e2, true);
                    wl5Var.r(false, fl5.G(null, uri2, 800.0f, 800.0f, true), null);
                    return;
                }
                break;
            case 13:
                zq5 zq5Var2 = (zq5) obj6;
                TLObject tLObject2 = (TLObject) obj5;
                if (tLObject2 instanceof Vector) {
                    Vector vector = (Vector) tLObject2;
                    if (!vector.objects.isEmpty()) {
                        zq5Var2.m1.put(Long.valueOf(zq5Var2.l1.admin_id), (TLRPC.User) vector.objects.get(0));
                        zq5Var2.N1.f();
                        break;
                    }
                }
                break;
            case 14:
                tq5 tq5Var = (tq5) obj6;
                if (((TLRPC.TL_error) obj5) == null && (cf1Var = (zq5Var = tq5Var.a.c).d2) != null) {
                    TLRPC.TL_chatInviteExported tL_chatInviteExported = zq5Var.l1;
                    nf1 nf1Var = cf1Var.a;
                    ArrayList arrayList2 = nf1Var.p0;
                    int size = arrayList2.size();
                    int i3 = nf1Var.F.h;
                    TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent = new TLRPC.TL_channelAdminLogEvent();
                    TLRPC.TL_channelAdminLogEventActionExportedInviteDelete tL_channelAdminLogEventActionExportedInviteDelete = new TLRPC.TL_channelAdminLogEventActionExportedInviteDelete();
                    tL_channelAdminLogEventActionExportedInviteDelete.invite = tL_chatInviteExported;
                    tL_channelAdminLogEvent.action = tL_channelAdminLogEventActionExportedInviteDelete;
                    tL_channelAdminLogEvent.date = (int) (System.currentTimeMillis() / 1000);
                    tL_channelAdminLogEvent.user_id = y6c.h(nf1Var.getAccountInstance().a).n;
                    i = ((d) nf1Var).currentAccount;
                    if (new k27(i, tL_channelAdminLogEvent, nf1Var.o0, nf1Var.n0, nf1Var.f, nf1Var.U, true).U >= 0) {
                        nf1Var.N0();
                        int size2 = arrayList2.size() - size;
                        if (size2 > 0) {
                            nf1Var.D0.N = true;
                            kf1 kf1Var = nf1Var.F;
                            kf1Var.p(kf1Var.h, size2);
                            nf1Var.X0();
                        }
                        nf1Var.z0.remove(tL_chatInviteExported.link);
                        break;
                    }
                }
                break;
            case 15:
                l7 l7Var = (l7) obj5;
                ((jr5) obj6).v0(true);
                l7Var.requestFocus();
                gl.d3(new ar5(l7Var, b3));
                break;
            case 16:
                int i4 = JobInfoSchedulerService.a;
                ((JobInfoSchedulerService) obj6).jobFinished((JobParameters) obj5, false);
                break;
            case 17:
                Bundle bundle2 = new Bundle();
                bundle2.putLong("user_id", ((TLRPC.ChatFull) obj6).guard_bot_id);
                ((f92) obj5).presentFragment(new ProfileActivity(bundle2, null));
                break;
            case 18:
                gl.e3(new q21((fv5) obj6, (m51) obj5, (byte) 3), 150L);
                break;
            case 19:
                LanguageSelectActivity languageSelectActivity = (LanguageSelectActivity) obj6;
                languageSelectActivity.e = (ArrayList) obj5;
                languageSelectActivity.c.f();
                break;
            case 20:
                LanguageSelectActivity languageSelectActivity2 = (LanguageSelectActivity) obj6;
                String str3 = (String) obj5;
                byte b4 = 19;
                if (str3.trim().toLowerCase().length() == 0) {
                    gl.d3(new hb5(languageSelectActivity2, new ArrayList(), b4));
                    break;
                } else {
                    System.currentTimeMillis();
                    ArrayList arrayList3 = new ArrayList();
                    int size3 = languageSelectActivity2.h.size();
                    for (int i5 = 0; i5 < size3; i5++) {
                        i96 i96Var = (i96) languageSelectActivity2.h.get(i5);
                        if (i96Var.a.toLowerCase().startsWith(str3) || i96Var.b.toLowerCase().startsWith(str3)) {
                            arrayList3.add(i96Var);
                        }
                    }
                    int size4 = languageSelectActivity2.f.size();
                    while (i2 < size4) {
                        i96 i96Var2 = (i96) languageSelectActivity2.f.get(i2);
                        if (i96Var2.a.toLowerCase().startsWith(str3) || i96Var2.b.toLowerCase().startsWith(str3)) {
                            arrayList3.add(i96Var2);
                        }
                        i2++;
                    }
                    gl.d3(new hb5(languageSelectActivity2, arrayList3, b4));
                    break;
                }
                break;
            case 21:
                LaunchActivity launchActivity2 = (LaunchActivity) obj6;
                TLObject tLObject3 = (TLObject) obj5;
                String str4 = LaunchActivity.C1;
                if (tLObject3 instanceof TL_account.resolvedBusinessChatLinks) {
                    TL_account.resolvedBusinessChatLinks resolvedbusinesschatlinks = (TL_account.resolvedBusinessChatLinks) tLObject3;
                    na7.q1(launchActivity2.P).a4(resolvedbusinesschatlinks.users, false);
                    na7.q1(launchActivity2.P).U3(resolvedbusinesschatlinks.chats, false);
                    ad7.Y(launchActivity2.P).j1(resolvedbusinesschatlinks.users, resolvedbusinesschatlinks.chats, true, true);
                    Bundle bundle3 = new Bundle();
                    TLRPC.Peer peer = resolvedbusinesschatlinks.peer;
                    if (peer instanceof TLRPC.TL_peerUser) {
                        bundle3.putLong("user_id", peer.user_id);
                    } else if ((peer instanceof TLRPC.TL_peerChat) || (peer instanceof TLRPC.TL_peerChannel)) {
                        bundle3.putLong("chat_id", peer.channel_id);
                    }
                    mu1 mu1Var = new mu1(bundle3);
                    mu1Var.Fa = resolvedbusinesschatlinks;
                    launchActivity2.u0(mu1Var, false, true);
                    break;
                } else {
                    launchActivity2.F0(ij.K(launchActivity2, k96.M0(2131752704, null), k96.M0(2131752700, null)));
                    break;
                }
            case 22:
                LaunchActivity launchActivity3 = (LaunchActivity) obj6;
                TLRPC.TL_chatInviteJoinResultWebView tL_chatInviteJoinResultWebView = (TLRPC.TL_chatInviteJoinResultWebView) obj5;
                String str5 = LaunchActivity.C1;
                na7.q1(launchActivity3.P).a4(tL_chatInviteJoinResultWebView.users, false);
                bq0 b5 = bq0.b(launchActivity3.P);
                long j = tL_chatInviteJoinResultWebView.bot_id;
                b5.c(j, j, tL_chatInviteJoinResultWebView.query_id, false);
                break;
            case 23:
                String str6 = LaunchActivity.C1;
                ij.r0((u8) obj6, k96.M0(2131753891, null), k96.M0(2131751093, null) + "\n" + ((TLRPC.TL_error) obj5).text, null);
                break;
            case 24:
                LaunchActivity launchActivity4 = (LaunchActivity) obj6;
                String str7 = (String) obj5;
                String str8 = LaunchActivity.C1;
                if (!launchActivity4.p0.getFragmentStack().isEmpty()) {
                    launchActivity4.p0.getFragmentStack().get(0).presentFragment(new PremiumPreviewFragment(0, Uri.parse(str7).getQueryParameter("ref")));
                    break;
                }
                break;
            case 25:
                String str9 = LaunchActivity.C1;
                ((LaunchActivity) obj6).k0((TL_account.Password) obj5);
                break;
            case 26:
                m21 m21Var = (m21) obj5;
                String str10 = LaunchActivity.C1;
                if (!((LaunchActivity) obj6).R && LaunchActivity.G1) {
                    m21Var.j();
                    break;
                }
                break;
            case 27:
                LaunchActivity launchActivity5 = (LaunchActivity) obj6;
                mk2 mk2Var = (mk2) obj5;
                String str11 = LaunchActivity.C1;
                launchActivity5.p0.getView().setVisibility(4);
                if (gl.O1()) {
                    ActionBarLayout actionBarLayout = launchActivity5.q0;
                    if (actionBarLayout != null && actionBarLayout.getView() != null && launchActivity5.q0.getView().getVisibility() == 0) {
                        launchActivity5.q0.getView().setVisibility(4);
                    }
                    ActionBarLayout actionBarLayout2 = launchActivity5.r0;
                    if (actionBarLayout2 != null && actionBarLayout2.getView() != null) {
                        launchActivity5.r0.getView().setVisibility(4);
                    }
                }
                if (mk2Var != null) {
                    mk2Var.run();
                    break;
                }
                break;
            case 28:
                String str12 = LaunchActivity.C1;
                ((LaunchActivity) obj6).t0((qmb) obj5);
                break;
            default:
                LaunchActivity launchActivity6 = (LaunchActivity) obj6;
                c01 c01Var = (c01) obj5;
                String str13 = LaunchActivity.C1;
                launchActivity6.P0 = null;
                launchActivity6.Q0 = null;
                launchActivity6.R0 = null;
                launchActivity6.S0 = null;
                launchActivity6.V0 = null;
                launchActivity6.T0 = null;
                if (c01Var != null) {
                    c01Var.b();
                    break;
                }
                break;
        }
    }
}
