package ai;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.location.Address;
import android.location.Geocoder;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Pair;
import android.widget.TextView;
import ci.e9;
import gi.va;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import org.telegram.messenger.a8;
import org.telegram.messenger.bd;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.h10;
import org.telegram.messenger.hp;
import org.telegram.messenger.hs;
import org.telegram.messenger.kr;
import org.telegram.messenger.l10;
import org.telegram.messenger.ld;
import org.telegram.messenger.mo;
import org.telegram.messenger.qr;
import org.telegram.messenger.t3;
import org.telegram.messenger.u10;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.messenger.w7;
import org.telegram.messenger.wq;
import org.telegram.messenger.zi;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_chatlists;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.RLottieNative;
import org.telegram.ui.Components.fc;
import org.telegram.ui.Components.k9;
import org.telegram.ui.Components.lr;
import org.telegram.ui.Components.rz;
import org.telegram.ui.Components.u8;
import org.telegram.ui.Components.wt0;
import org.telegram.ui.Components.xt0;
import org.telegram.ui.Components.yt0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.SecretMediaViewer;
import org.telegram.ui.cm;
import org.telegram.ui.di;
import org.telegram.ui.ee0;
import org.telegram.ui.en0;
import org.telegram.ui.ew;
import org.telegram.ui.hm;
import org.telegram.ui.id0;
import org.telegram.ui.ih0;
import org.telegram.ui.ly;
import org.telegram.ui.m90;
import org.telegram.ui.rl;
import org.telegram.ui.uw;
import org.telegram.ui.wm;
import org.telegram.ui.x30;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class p1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ p1(int i3, TLRPC.Chat chat, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3) {
        this.a = 15;
        this.b = i3;
        this.c = chat;
        this.d = arrayList;
        this.e = arrayList2;
        this.f = arrayList3;
    }

    private final void a() {
        TLObject tLObject = (TLObject) this.c;
        HashSet hashSet = (HashSet) this.d;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) this.e;
        org.telegram.ui.ActionBar.d2 d2Var = (org.telegram.ui.ActionBar.d2) this.f;
        boolean z10 = tLObject instanceof TLRPC.Updates;
        int i3 = this.b;
        if (!z10) {
            if (!(tLObject instanceof TL_phone.groupCall)) {
                if (tL_error != null) {
                    fc.a0(d2Var).f0(tL_error, false);
                    return;
                }
                return;
            }
            TL_phone.groupCall groupcall = (TL_phone.groupCall) tLObject;
            hp.s1(i3).Y3(groupcall.users, false);
            hp.s1(i3).S3(groupcall.chats, false);
            if (LaunchActivity.K1 == null) {
                return;
            }
            TLRPC.TL_inputGroupCall tL_inputGroupCall = new TLRPC.TL_inputGroupCall();
            TLRPC.GroupCall groupCall = groupcall.call;
            tL_inputGroupCall.id = groupCall.id;
            tL_inputGroupCall.access_hash = groupCall.access_hash;
            org.telegram.ui.Components.voip.n1.g(LaunchActivity.K1, i3, tL_inputGroupCall, false, groupCall, hashSet);
            return;
        }
        TLRPC.Updates updates = (TLRPC.Updates) tLObject;
        hp.s1(i3).Y3(updates.users, false);
        hp.s1(i3).S3(updates.chats, false);
        ArrayList z02 = hp.z0(updates, TL_update.TL_updateGroupCall.class);
        int size = z02.size();
        TLRPC.GroupCall groupCall2 = null;
        int i10 = 0;
        while (i10 < size) {
            Object obj = z02.get(i10);
            i10++;
            groupCall2 = ((TL_update.TL_updateGroupCall) obj).call;
        }
        if (LaunchActivity.K1 == null || groupCall2 == null) {
            return;
        }
        TLRPC.TL_inputGroupCall tL_inputGroupCall2 = new TLRPC.TL_inputGroupCall();
        tL_inputGroupCall2.id = groupCall2.id;
        tL_inputGroupCall2.access_hash = groupCall2.access_hash;
        org.telegram.ui.Components.voip.n1.g(LaunchActivity.K1, i3, tL_inputGroupCall2, false, groupCall2, hashSet);
    }

    private final void b() {
        hm hmVar = (hm) this.c;
        di diVar = (di) this.d;
        TLRPC.Chat chat = (TLRPC.Chat) this.e;
        wm wmVar = (wm) this.f;
        diVar.b = hmVar.a.getMessagesController().s0(-chat.id, this.b, new cm(hmVar, diVar, wmVar));
    }

    private final void c() {
        hm hmVar = (hm) this.c;
        zi ziVar = (zi) this.d;
        Integer num = (Integer) this.e;
        byte[] bArr = (byte[]) this.f;
        wm wmVar = hmVar.a;
        wmVar.xb(this.b, ziVar.f1(), true, zi.B0(ziVar.k) == wmVar.c7 ? 1 : 0, true, 0, num, bArr, new rl(hmVar, ziVar, 1));
    }

    private final void e() {
        org.telegram.ui.ActionBar.d2 Q;
        TLRPC.Chat chat = (TLRPC.Chat) this.c;
        ArrayList arrayList = (ArrayList) this.d;
        ArrayList arrayList2 = (ArrayList) this.e;
        ArrayList arrayList3 = (ArrayList) this.f;
        if (!LaunchActivity.G1 || (Q = LaunchActivity.Q()) == null || Q.getParentActivity() == null) {
            return;
        }
        vg.i0 i0Var = new vg.i0(11, this.b, Q.getParentActivity(), Q, null);
        i0Var.C1(chat, arrayList, arrayList2, arrayList3, null);
        i0Var.show();
    }

    private final void f() {
        SharedPreferences sharedPreferences = (SharedPreferences) this.c;
        TLRPC.TL_help_support tL_help_support = (TLRPC.TL_help_support) this.d;
        org.telegram.ui.ActionBar.s1 s1Var = (org.telegram.ui.ActionBar.s1) this.e;
        org.telegram.ui.ActionBar.d2 d2Var = (org.telegram.ui.ActionBar.d2) this.f;
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putLong("support_id2", tL_help_support.user.id);
        SerializedData serializedData = new SerializedData();
        tL_help_support.user.serializeToStream(serializedData);
        edit.putString("support_user", Base64.encodeToString(serializedData.toByteArray(), 0));
        edit.commit();
        serializedData.cleanup();
        try {
            s1Var.dismiss();
        } catch (Exception e10) {
            a8.g(e10, true);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(tL_help_support.user);
        int i3 = this.b;
        qr.a0(i3).m1(arrayList, null, true, true);
        hp.s1(i3).X3(tL_help_support.user, false, false);
        Bundle bundle = new Bundle();
        bundle.putLong("user_id", tL_help_support.user.id);
        d2Var.presentFragment(new wm(bundle));
    }

    private final void g() {
        org.telegram.ui.ActionBar.s1[] s1VarArr = (org.telegram.ui.ActionBar.s1[]) this.c;
        int[] iArr = (int[]) this.d;
        Runnable runnable = (Runnable) this.e;
        org.telegram.ui.ActionBar.d2 d2Var = (org.telegram.ui.ActionBar.d2) this.f;
        org.telegram.ui.ActionBar.s1 s1Var = s1VarArr[0];
        if (s1Var == null) {
            return;
        }
        s1Var.setOnCancelListener(new org.telegram.ui.Components.n1(iArr, this.b, runnable));
        d2Var.showDialog(s1VarArr[0]);
    }

    private final void h() {
        int i3;
        int i10;
        yt0 yt0Var = (yt0) this.c;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) this.d;
        zi ziVar = (zi) this.e;
        org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) this.f;
        int[] iArr = yt0Var.e;
        RLottieNative[] rLottieNativeArr = yt0Var.g1;
        if (yt0Var.X0) {
            org.telegram.messenger.g0.h3(new wt0(yt0Var, 2));
            return;
        }
        boolean z10 = false;
        int i11 = 0;
        while (true) {
            int length = rLottieNativeArr.length;
            i3 = this.b;
            if (i11 >= length) {
                break;
            }
            if (rLottieNativeArr[i11] == null) {
                if (i11 == 0) {
                    i10 = 1;
                } else if (i11 == 1) {
                    i10 = 8;
                } else {
                    i10 = 2;
                    if (i11 == 2) {
                        i10 = 14;
                    } else if (i11 == 3) {
                        i10 = 20;
                    }
                }
                if (i10 < tL_messages_stickerSet.documents.size()) {
                    TLRPC.Document document = tL_messages_stickerSet.documents.get(i10);
                    w7.G(h10.t0);
                    String y22 = org.telegram.messenger.g0.y2(w7.K(document, null, true, true), 0);
                    if (TextUtils.isEmpty(y22)) {
                        org.telegram.messenger.g0.h3(new xt0(document, i3, ziVar, q1Var, tL_messages_stickerSet, 1));
                        z10 = true;
                    } else {
                        rLottieNativeArr[i11] = RLottieNative.b(y22, iArr, null, null);
                        yt0Var.h1[i11] = iArr[0];
                    }
                }
            }
            i11++;
        }
        if (z10) {
            org.telegram.messenger.g0.h3(new wt0(yt0Var, 3));
        } else {
            org.telegram.messenger.g0.h3(new org.telegram.ui.f4(yt0Var, i3, q1Var, 21));
        }
    }

    private final void i() {
        boolean z10;
        LaunchActivity launchActivity = (LaunchActivity) this.c;
        TLObject tLObject = (TLObject) this.d;
        Uri uri = (Uri) this.e;
        org.telegram.ui.ActionBar.s1 s1Var = (org.telegram.ui.ActionBar.s1) this.f;
        String str = LaunchActivity.E1;
        if (launchActivity.isFinishing()) {
            return;
        }
        if (tLObject == null || launchActivity.r0 == null) {
            if (launchActivity.X == null) {
                launchActivity.X = new ArrayList();
            }
            launchActivity.X.add(0, launchActivity.Y);
            launchActivity.Y = null;
            launchActivity.j0(true);
        } else {
            TLRPC.TL_messages_historyImportParsed tL_messages_historyImportParsed = (TLRPC.TL_messages_historyImportParsed) tLObject;
            Bundle k10 = a1.g.k("onlySelect", true);
            k10.putString("importTitle", tL_messages_historyImportParsed.title);
            k10.putBoolean("allowSwitchAccount", true);
            if (tL_messages_historyImportParsed.pm) {
                k10.putInt("dialogsType", 12);
            } else if (tL_messages_historyImportParsed.group) {
                k10.putInt("dialogsType", 11);
            } else {
                String uri2 = uri.toString();
                int i3 = this.b;
                Iterator it = hp.s1(i3).Y3.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z10 = false;
                        break;
                    } else if (uri2.contains((String) it.next())) {
                        k10.putInt("dialogsType", 12);
                        z10 = true;
                        break;
                    }
                }
                if (!z10) {
                    Iterator it2 = hp.s1(i3).X3.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        if (uri2.contains((String) it2.next())) {
                            k10.putInt("dialogsType", 11);
                            z10 = true;
                            break;
                        }
                    }
                    if (!z10) {
                        k10.putInt("dialogsType", 13);
                    }
                }
            }
            if (SecretMediaViewer.g() && SecretMediaViewer.f().s) {
                SecretMediaViewer.f().e(false, false);
            } else if (PhotoViewer.F1() && PhotoViewer.v1().U1()) {
                PhotoViewer.v1().H0(false, true);
            } else if (org.telegram.ui.i4.G() && org.telegram.ui.i4.v().W) {
                org.telegram.ui.i4.v().m(false, true);
            }
            va.w();
            x30 x30Var = x30.v5;
            if (x30Var != null) {
                x30Var.dismiss();
            }
            if (org.telegram.messenger.g0.Q1()) {
                launchActivity.r0.X(true, true);
                launchActivity.t0.X(true, true);
            }
            uw uwVar = new uw(k10);
            uwVar.D2 = launchActivity;
            ((ActionBarLayout) launchActivity.M()).V(uwVar, !org.telegram.messenger.g0.Q1() ? launchActivity.r0.getFragmentStack().size() <= 1 || !(launchActivity.r0.getFragmentStack().get(launchActivity.r0.getFragmentStack().size() - 1) instanceof ee0) : launchActivity.s0.getFragmentStack().isEmpty() || !(launchActivity.s0.getFragmentStack().get(launchActivity.s0.getFragmentStack().size() - 1) instanceof ee0), false);
        }
        try {
            s1Var.dismiss();
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    private final void j() {
        LaunchActivity launchActivity = (LaunchActivity) this.c;
        ly lyVar = (ly) this.d;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) this.e;
        TLRPC.Updates updates = (TLRPC.Updates) this.f;
        ArrayList arrayList = launchActivity.e0;
        if (launchActivity.isFinishing()) {
            return;
        }
        try {
            lyVar.run();
        } catch (Exception e10) {
            a8.g(e10, true);
        }
        if (tL_error != null) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(launchActivity);
            String M0 = bd.M0(R.string.AppName, null);
            org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.a;
            s1Var.S = M0;
            if (tL_error.text.startsWith("FLOOD_WAIT")) {
                s1Var.U = bd.M0(2131750688, null);
            } else if (tL_error.text.equals("USERS_TOO_MUCH")) {
                s1Var.U = bd.M0(2131749084, null);
            } else {
                s1Var.U = bd.M0(2131749083, null);
            }
            alertDialog$Builder.k(bd.M0(2131747839, null), null);
            launchActivity.F0(alertDialog$Builder);
            return;
        }
        if (launchActivity.r0 == null || updates == null || updates.chats.isEmpty()) {
            return;
        }
        TLRPC.Chat chat = updates.chats.get(0);
        chat.left = false;
        chat.kicked = false;
        int i3 = this.b;
        hp.s1(i3).Y3(updates.users, false);
        hp.s1(i3).S3(updates.chats, false);
        Bundle bundle = new Bundle();
        bundle.putLong("chat_id", chat.id);
        if (arrayList.isEmpty() || hp.s1(i3).E(bundle, (org.telegram.ui.ActionBar.d2) k2.p1.h(1, arrayList), null, null)) {
            wm wmVar = new wm(bundle);
            hs.f(i3).k(hs.t, new Object[0]);
            ((ActionBarLayout) launchActivity.M()).V(wmVar, false, true);
        }
    }

    private final void k() {
        fc a02;
        ArrayList<TLRPC.User> arrayList;
        ArrayList<TLRPC.Chat> arrayList2;
        LaunchActivity launchActivity = (LaunchActivity) this.c;
        TLObject tLObject = (TLObject) this.d;
        String str = (String) this.e;
        ly lyVar = (ly) this.f;
        org.telegram.ui.ActionBar.d2 d2Var = (org.telegram.ui.ActionBar.d2) k2.p1.h(1, launchActivity.e0);
        try {
            if (tLObject instanceof TL_chatlists.chatlist_ChatlistInvite) {
                TL_chatlists.chatlist_ChatlistInvite chatlist_chatlistinvite = (TL_chatlists.chatlist_ChatlistInvite) tLObject;
                boolean z10 = chatlist_chatlistinvite instanceof TL_chatlists.TL_chatlists_chatlistInvite;
                if (z10) {
                    TL_chatlists.TL_chatlists_chatlistInvite tL_chatlists_chatlistInvite = (TL_chatlists.TL_chatlists_chatlistInvite) chatlist_chatlistinvite;
                    arrayList2 = tL_chatlists_chatlistInvite.chats;
                    arrayList = tL_chatlists_chatlistInvite.users;
                } else if (chatlist_chatlistinvite instanceof TL_chatlists.TL_chatlists_chatlistInviteAlready) {
                    TL_chatlists.TL_chatlists_chatlistInviteAlready tL_chatlists_chatlistInviteAlready = (TL_chatlists.TL_chatlists_chatlistInviteAlready) chatlist_chatlistinvite;
                    arrayList2 = tL_chatlists_chatlistInviteAlready.chats;
                    arrayList = tL_chatlists_chatlistInviteAlready.users;
                } else {
                    arrayList = null;
                    arrayList2 = null;
                }
                int i3 = this.b;
                int i10 = 0;
                hp.s1(i3).S3(arrayList2, false);
                hp.s1(i3).Y3(arrayList, false);
                if (!z10 || !((TL_chatlists.TL_chatlists_chatlistInvite) chatlist_chatlistinvite).peers.isEmpty()) {
                    rz rzVar = new rz(d2Var, false);
                    rzVar.R1 = -1;
                    rzVar.V1 = "";
                    rzVar.W1 = new ArrayList();
                    rzVar.Y1 = "";
                    rzVar.a2 = new ArrayList();
                    ArrayList arrayList3 = new ArrayList();
                    rzVar.b2 = arrayList3;
                    rzVar.s2 = -1;
                    rzVar.v2 = -5;
                    rzVar.Q1 = str;
                    rzVar.S1 = chatlist_chatlistinvite;
                    arrayList3.clear();
                    if (z10) {
                        TL_chatlists.TL_chatlists_chatlistInvite tL_chatlists_chatlistInvite2 = (TL_chatlists.TL_chatlists_chatlistInvite) chatlist_chatlistinvite;
                        TLRPC.TL_textWithEntities tL_textWithEntities = tL_chatlists_chatlistInvite2.title;
                        rzVar.V1 = tL_textWithEntities.text;
                        rzVar.W1 = tL_textWithEntities.entities;
                        rzVar.X1 = tL_chatlists_chatlistInvite2.title_noanimate;
                        rzVar.Z1 = tL_chatlists_chatlistInvite2.peers;
                    } else if (chatlist_chatlistinvite instanceof TL_chatlists.TL_chatlists_chatlistInviteAlready) {
                        TL_chatlists.TL_chatlists_chatlistInviteAlready tL_chatlists_chatlistInviteAlready2 = (TL_chatlists.TL_chatlists_chatlistInviteAlready) chatlist_chatlistinvite;
                        rzVar.Z1 = tL_chatlists_chatlistInviteAlready2.missing_peers;
                        rzVar.c2 = tL_chatlists_chatlistInviteAlready2.already_peers;
                        rzVar.R1 = tL_chatlists_chatlistInviteAlready2.filter_id;
                        ArrayList arrayList4 = d2Var.getMessagesController().Q0;
                        if (arrayList4 != null) {
                            while (true) {
                                if (i10 >= arrayList4.size()) {
                                    break;
                                }
                                mo moVar = (mo) arrayList4.get(i10);
                                if (moVar.a == rzVar.R1) {
                                    rzVar.V1 = moVar.b;
                                    rzVar.W1 = moVar.c;
                                    rzVar.X1 = moVar.n;
                                    break;
                                }
                                i10++;
                            }
                        }
                    }
                    rzVar.f1();
                    d2Var.showDialog(rzVar);
                    lyVar.run();
                    return;
                }
                a02 = fc.a0(d2Var);
            } else {
                a02 = fc.a0(d2Var);
            }
            lyVar.run();
            return;
        } catch (Exception e10) {
            a8.g(e10, true);
            return;
        }
        org.telegram.messenger.k5.p(null, 2131748217, a02, null);
    }

    private final void l() {
        ((m90) this.c).v((String) this.d, this.b + 1, (String) this.e, (String) this.f);
    }

    private final void m() {
        id0 id0Var = (id0) this.c;
        String str = (String) this.d;
        String str2 = (String) this.e;
        String str3 = (String) this.f;
        ArrayList arrayList = new ArrayList();
        e5.a aVar = new e5.a();
        aVar.c = "inapp";
        aVar.b = str;
        arrayList.add(aVar.a());
        a8.b("LoginBilling querying \"" + str + "\" product");
        org.telegram.messenger.r1.i().o(arrayList, new m3(id0Var, str, str2, str3, this.b));
    }

    private final void n() {
        int[] iArr = (int[]) this.c;
        u8 u8Var = (u8) this.d;
        TLRPC.User user = (TLRPC.User) this.e;
        k9 k9Var = (k9) this.f;
        iArr[0] = this.b;
        u8Var.r(user);
        k9Var.e(user, u8Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:252:0x058d A[Catch: Exception -> 0x0514, TryCatch #5 {Exception -> 0x0514, blocks: (B:231:0x04fc, B:233:0x050b, B:236:0x051a, B:238:0x0524, B:239:0x0527, B:243:0x0537, B:245:0x0541, B:247:0x0547, B:248:0x054a, B:250:0x0587, B:252:0x058d, B:254:0x0593, B:255:0x0596, B:257:0x059b, B:259:0x05a1, B:260:0x05a4, B:263:0x05ad, B:265:0x05b7, B:267:0x05c7, B:269:0x05d3, B:271:0x05df, B:275:0x0628, B:277:0x062e, B:278:0x0631, B:280:0x063a, B:281:0x063d, B:282:0x0647, B:435:0x05f0, B:437:0x0600, B:439:0x060a, B:441:0x0623, B:447:0x0551, B:449:0x055b, B:451:0x0561, B:452:0x0564, B:453:0x0568, B:455:0x0572, B:457:0x0578, B:459:0x057e, B:460:0x0581), top: B:230:0x04fc }] */
    /* JADX WARN: Removed duplicated region for block: B:265:0x05b7 A[Catch: Exception -> 0x0514, TryCatch #5 {Exception -> 0x0514, blocks: (B:231:0x04fc, B:233:0x050b, B:236:0x051a, B:238:0x0524, B:239:0x0527, B:243:0x0537, B:245:0x0541, B:247:0x0547, B:248:0x054a, B:250:0x0587, B:252:0x058d, B:254:0x0593, B:255:0x0596, B:257:0x059b, B:259:0x05a1, B:260:0x05a4, B:263:0x05ad, B:265:0x05b7, B:267:0x05c7, B:269:0x05d3, B:271:0x05df, B:275:0x0628, B:277:0x062e, B:278:0x0631, B:280:0x063a, B:281:0x063d, B:282:0x0647, B:435:0x05f0, B:437:0x0600, B:439:0x060a, B:441:0x0623, B:447:0x0551, B:449:0x055b, B:451:0x0561, B:452:0x0564, B:453:0x0568, B:455:0x0572, B:457:0x0578, B:459:0x057e, B:460:0x0581), top: B:230:0x04fc }] */
    /* JADX WARN: Removed duplicated region for block: B:277:0x062e A[Catch: Exception -> 0x0514, TryCatch #5 {Exception -> 0x0514, blocks: (B:231:0x04fc, B:233:0x050b, B:236:0x051a, B:238:0x0524, B:239:0x0527, B:243:0x0537, B:245:0x0541, B:247:0x0547, B:248:0x054a, B:250:0x0587, B:252:0x058d, B:254:0x0593, B:255:0x0596, B:257:0x059b, B:259:0x05a1, B:260:0x05a4, B:263:0x05ad, B:265:0x05b7, B:267:0x05c7, B:269:0x05d3, B:271:0x05df, B:275:0x0628, B:277:0x062e, B:278:0x0631, B:280:0x063a, B:281:0x063d, B:282:0x0647, B:435:0x05f0, B:437:0x0600, B:439:0x060a, B:441:0x0623, B:447:0x0551, B:449:0x055b, B:451:0x0561, B:452:0x0564, B:453:0x0568, B:455:0x0572, B:457:0x0578, B:459:0x057e, B:460:0x0581), top: B:230:0x04fc }] */
    /* JADX WARN: Removed duplicated region for block: B:280:0x063a A[Catch: Exception -> 0x0514, TryCatch #5 {Exception -> 0x0514, blocks: (B:231:0x04fc, B:233:0x050b, B:236:0x051a, B:238:0x0524, B:239:0x0527, B:243:0x0537, B:245:0x0541, B:247:0x0547, B:248:0x054a, B:250:0x0587, B:252:0x058d, B:254:0x0593, B:255:0x0596, B:257:0x059b, B:259:0x05a1, B:260:0x05a4, B:263:0x05ad, B:265:0x05b7, B:267:0x05c7, B:269:0x05d3, B:271:0x05df, B:275:0x0628, B:277:0x062e, B:278:0x0631, B:280:0x063a, B:281:0x063d, B:282:0x0647, B:435:0x05f0, B:437:0x0600, B:439:0x060a, B:441:0x0623, B:447:0x0551, B:449:0x055b, B:451:0x0561, B:452:0x0564, B:453:0x0568, B:455:0x0572, B:457:0x0578, B:459:0x057e, B:460:0x0581), top: B:230:0x04fc }] */
    /* JADX WARN: Removed duplicated region for block: B:285:0x069e  */
    /* JADX WARN: Removed duplicated region for block: B:357:0x0810 A[Catch: Exception -> 0x094f, TryCatch #1 {Exception -> 0x094f, blocks: (B:307:0x071f, B:308:0x072c, B:310:0x0732, B:312:0x073e, B:314:0x0746, B:316:0x0750, B:318:0x075e, B:319:0x0764, B:321:0x076a, B:323:0x0774, B:325:0x0782, B:326:0x0786, B:328:0x078c, B:330:0x0796, B:332:0x07a4, B:333:0x07a8, B:335:0x07ae, B:337:0x07b4, B:339:0x07be, B:341:0x07c4, B:342:0x07c7, B:343:0x07cc, B:346:0x07d3, B:348:0x07d9, B:353:0x07eb, B:355:0x07f1, B:357:0x0810, B:364:0x0823, B:366:0x082f, B:368:0x0868, B:370:0x087d, B:371:0x0883, B:373:0x0889, B:374:0x088d, B:376:0x0893, B:377:0x0897, B:379:0x08a1, B:380:0x08ad, B:382:0x08b3, B:384:0x08bd, B:388:0x08ca, B:390:0x08d0, B:392:0x08dc, B:394:0x0915, B:395:0x0922, B:350:0x07e7), top: B:306:0x071f }] */
    /* JADX WARN: Removed duplicated region for block: B:418:0x0651 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:445:0x0641  */
    /* JADX WARN: Removed duplicated region for block: B:446:0x05ab  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings;
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings2;
        char c2;
        kg.c cVar;
        int i3;
        String str;
        int i10;
        List<Address> fromLocationName;
        List<Address> fromLocationName2;
        HashSet hashSet;
        HashSet hashSet2;
        int i11;
        Locale locale;
        String str2;
        List<Address> list;
        int i12;
        List<Address> list2;
        HashSet hashSet3;
        int i13;
        StringBuilder sb2;
        StringBuilder sb3;
        String str3;
        Address address;
        String thoroughfare;
        HashSet hashSet4;
        boolean z10;
        boolean z11;
        String countryName;
        StringBuilder sb4;
        HashSet hashSet5;
        boolean z12;
        StringBuilder sb5;
        boolean z13;
        String str4;
        int i14;
        long j10;
        final long j11;
        long j12;
        Object obj;
        String lowerCase;
        String str5 = "";
        int i15 = 2;
        char c10 = 0;
        switch (this.a) {
            case 0:
                b3 b3Var = (b3) this.c;
                Context context = (Context) this.d;
                int i16 = this.b;
                TL_stars.StarGift starGift = (TL_stars.StarGift) this.e;
                u10 u10Var = (u10) this.f;
                long j13 = b3Var.U1;
                l1 l1Var = new l1(b3Var, u10Var, i15);
                boolean z14 = starGift.limited;
                new b2(b3Var, context, i16, starGift, j13, l1Var, z14 && (disallowedGiftsSettings2 = b3Var.T1) != null && disallowedGiftsSettings2.disallow_limited_stargifts, z14 && (disallowedGiftsSettings = b3Var.T1) != null && disallowedGiftsSettings.disallow_unique_stargifts).show();
                break;
            case 1:
                gi.d dVar = (gi.d) this.c;
                org.telegram.ui.ActionBar.t2[] t2VarArr = (org.telegram.ui.ActionBar.t2[]) this.d;
                int i17 = this.b;
                TLObject tLObject = (TLObject) this.e;
                String str6 = (String) this.f;
                dVar.setLoading(false);
                org.telegram.ui.ActionBar.t2 t2Var = t2VarArr[0];
                if (t2Var != null) {
                    t2Var.dismiss();
                }
                e9.y(i17, false).R();
                org.telegram.ui.ActionBar.d2 T = LaunchActivity.T();
                if (T != null) {
                    fc.a0(T).V(Collections.singletonList(tLObject), bd.M0(2131744989, null), org.telegram.messenger.g0.X2(bd.a0(null, null, 2131744988, str6)), null).k(false);
                    break;
                }
                break;
            case 2:
                long[] jArr = (long[]) this.c;
                int i18 = this.b;
                k9 k9Var = (k9) this.d;
                k9 k9Var2 = (k9) this.e;
                TextView textView = (TextView) this.f;
                if (jArr[0] >= 0) {
                    TLRPC.User a22 = hp.s1(i18).a2(Long.valueOf(jArr[0]));
                    u8 u8Var = new u8((org.telegram.ui.ActionBar.e6) null);
                    u8Var.r(a22);
                    k9Var.e(a22, u8Var);
                } else {
                    TLRPC.Chat M0 = hp.s1(i18).M0(Long.valueOf(-jArr[0]));
                    u8 u8Var2 = new u8((org.telegram.ui.ActionBar.e6) null);
                    u8Var2.q(M0);
                    k9Var.e(M0, u8Var2);
                }
                if (jArr[0] >= 0) {
                    TLRPC.User a23 = hp.s1(i18).a2(Long.valueOf(jArr[0]));
                    if (k9Var2 != null) {
                        u8 u8Var3 = new u8((org.telegram.ui.ActionBar.e6) null);
                        u8Var3.r(a23);
                        k9Var2.e(a23, u8Var3);
                    }
                    if (textView != null) {
                        textView.setText(l10.p(a23));
                        break;
                    }
                } else {
                    TLRPC.Chat M02 = hp.s1(i18).M0(Long.valueOf(-jArr[0]));
                    if (k9Var2 != null) {
                        u8 u8Var4 = new u8((org.telegram.ui.ActionBar.e6) null);
                        u8Var4.q(M02);
                        k9Var2.e(M02, u8Var4);
                    }
                    if (textView != null) {
                        textView.setText(M02 == null ? "" : M02.title);
                        break;
                    }
                }
                break;
            case 3:
                TLObject tLObject2 = (TLObject) this.c;
                boolean[] zArr = (boolean[]) this.d;
                u10 u10Var2 = (u10) this.f;
                int i19 = this.b;
                TL_account.updateEmojiStatus updateemojistatus = (TL_account.updateEmojiStatus) this.e;
                if (tLObject2 instanceof TLRPC.TL_boolTrue) {
                    TLRPC.User f10 = h10.i(i19).f();
                    if (f10 != null) {
                        f10.emoji_status = updateemojistatus.emoji_status;
                        c2 = 0;
                        hs.f(i19).k(hs.m5, f10);
                        hp.s1(i19).j5(f10.id, f10.emoji_status);
                    } else {
                        c2 = 0;
                    }
                    if (!zArr[c2]) {
                        zArr[c2] = true;
                        u10Var2.a(null);
                        break;
                    }
                } else if (!zArr[0]) {
                    zArr[0] = true;
                    u10Var2.a("SERVER_ERROR");
                    break;
                }
                break;
            case 4:
                k2.f1 f1Var = (k2.f1) this.c;
                Pair pair = (Pair) this.d;
                f1Var.b.h.K(((Integer) pair.first).intValue(), (w2.g0) pair.second, (w2.u) this.e, (w2.c0) this.f, this.b);
                break;
            case 5:
                kg.c cVar2 = (kg.c) this.c;
                Locale locale2 = (Locale) this.d;
                String str7 = (String) this.e;
                Locale locale3 = (Locale) this.f;
                int i20 = this.b;
                cVar2.getClass();
                ArrayList arrayList = new ArrayList();
                try {
                    i10 = cVar2.e ? 10 : 5;
                    fromLocationName = new Geocoder(org.telegram.messenger.t0.b, locale2).getFromLocationName(str7, 5);
                    fromLocationName2 = cVar2.d ? new Geocoder(org.telegram.messenger.t0.b, locale3).getFromLocationName(str7, 5) : null;
                    hashSet = new HashSet();
                    hashSet2 = new HashSet();
                    i11 = 0;
                } catch (Exception unused) {
                }
                while (i11 < fromLocationName.size()) {
                    Address address2 = fromLocationName.get(i11);
                    Address address3 = (fromLocationName2 == null || i11 >= fromLocationName2.size()) ? null : fromLocationName2.get(i11);
                    if (address2.hasLatitude() && address2.hasLongitude()) {
                        i12 = i15;
                        list2 = fromLocationName;
                        double latitude = address2.getLatitude();
                        str2 = str5;
                        list = fromLocationName2;
                        double longitude = address2.getLongitude();
                        locale = locale2;
                        StringBuilder sb6 = new StringBuilder();
                        i3 = i20;
                        try {
                            sb2 = new StringBuilder();
                            str = str7;
                            try {
                                sb3 = new StringBuilder();
                                String locality = address2.getLocality();
                                if (TextUtils.isEmpty(locality)) {
                                    locality = address2.getAdminArea();
                                }
                                i13 = i11;
                                str3 = locality;
                                if (address3 != null && TextUtils.isEmpty(address3.getLocality())) {
                                    address3.getAdminArea();
                                }
                                address = address3;
                                thoroughfare = address2.getThoroughfare();
                            } catch (Exception unused2) {
                                cVar = cVar2;
                            }
                        } catch (Exception unused3) {
                            cVar = cVar2;
                        }
                        if (!TextUtils.isEmpty(thoroughfare)) {
                            hashSet4 = hashSet;
                            if (!TextUtils.equals(thoroughfare, address2.getAdminArea())) {
                                if (sb3.length() > 0) {
                                    sb3.append(", ");
                                }
                                sb3.append(thoroughfare);
                                z10 = false;
                                if (TextUtils.isEmpty(str3)) {
                                    z11 = true;
                                } else {
                                    if (sb2.length() > 0) {
                                        sb2.append(", ");
                                    }
                                    sb2.append(str3);
                                    if (sb3 != null) {
                                        if (sb3.length() > 0) {
                                            sb3.append(", ");
                                        }
                                        sb3.append(str3);
                                    }
                                    z11 = false;
                                }
                                boolean z15 = z10;
                                countryName = address2.getCountryName();
                                if (TextUtils.isEmpty(countryName)) {
                                    sb4 = sb3;
                                    hashSet5 = hashSet2;
                                    z12 = z11;
                                } else {
                                    sb4 = sb3;
                                    z12 = z11;
                                    if (!"US".equals(address2.getCountryCode()) && !"AE".equals(address2.getCountryCode()) && (!"GB".equals(address2.getCountryCode()) || !"en".equals(locale.getLanguage()))) {
                                        hashSet5 = hashSet2;
                                        str4 = countryName;
                                        if (sb2.length() > 0) {
                                            sb2.append(", ");
                                        }
                                        sb2.append(str4);
                                        if (sb6.length() > 0) {
                                            sb6.append(", ");
                                        }
                                        sb6.append(countryName);
                                    }
                                    String[] split = countryName.split(" ");
                                    int length = split.length;
                                    hashSet5 = hashSet2;
                                    str4 = str2;
                                    int i21 = 0;
                                    while (i21 < length) {
                                        int i22 = i21;
                                        String str8 = split[i22];
                                        if (str8.length() > 0) {
                                            i14 = length;
                                            str4 = str4 + str8.charAt(0);
                                        } else {
                                            i14 = length;
                                        }
                                        i21 = i22 + 1;
                                        length = i14;
                                    }
                                    if (sb2.length() > 0) {
                                    }
                                    sb2.append(str4);
                                    if (sb6.length() > 0) {
                                    }
                                    sb6.append(countryName);
                                }
                                kg.c cVar3 = cVar2;
                                if (cVar2.e) {
                                    try {
                                        StringBuilder sb7 = new StringBuilder();
                                        try {
                                            String addressLine = address2.getAddressLine(0);
                                            if (!TextUtils.isEmpty(addressLine)) {
                                                sb7.append(addressLine);
                                            }
                                        } catch (Exception unused4) {
                                        }
                                        if (sb7.length() > 0) {
                                            TLRPC.TL_messageMediaVenue tL_messageMediaVenue = new TLRPC.TL_messageMediaVenue();
                                            TLRPC.TL_geoPoint tL_geoPoint = new TLRPC.TL_geoPoint();
                                            tL_messageMediaVenue.geo = tL_geoPoint;
                                            tL_geoPoint.lat = latitude;
                                            tL_geoPoint._long = longitude;
                                            tL_messageMediaVenue.query_id = -1L;
                                            tL_messageMediaVenue.title = sb7.toString();
                                            tL_messageMediaVenue.icon = "pin";
                                            tL_messageMediaVenue.address = bd.M0(2131747610, null);
                                            arrayList.add(tL_messageMediaVenue);
                                        }
                                        cVar = cVar3;
                                        hashSet = hashSet4;
                                        hashSet3 = hashSet5;
                                    } catch (Exception unused5) {
                                        cVar = cVar3;
                                    }
                                } else {
                                    if (sb4 == null || sb4.length() <= 0) {
                                        sb5 = sb6;
                                        cVar = cVar3;
                                    } else {
                                        TLRPC.TL_messageMediaVenue tL_messageMediaVenue2 = new TLRPC.TL_messageMediaVenue();
                                        TLRPC.TL_geoPoint tL_geoPoint2 = new TLRPC.TL_geoPoint();
                                        tL_messageMediaVenue2.geo = tL_geoPoint2;
                                        tL_geoPoint2.lat = latitude;
                                        tL_geoPoint2._long = longitude;
                                        tL_messageMediaVenue2.query_id = -1L;
                                        tL_messageMediaVenue2.title = sb4.toString();
                                        tL_messageMediaVenue2.icon = "pin";
                                        tL_messageMediaVenue2.address = z15 ? bd.M0(2131747603, null) : bd.M0(2131747468, null);
                                        if (address != null) {
                                            TL_stories.TL_geoPointAddress tL_geoPointAddress = new TL_stories.TL_geoPointAddress();
                                            tL_messageMediaVenue2.geoAddress = tL_geoPointAddress;
                                            tL_geoPointAddress.country_iso2 = address.getCountryCode();
                                            String locality2 = TextUtils.isEmpty(null) ? address.getLocality() : null;
                                            if (TextUtils.isEmpty(locality2)) {
                                                locality2 = address.getAdminArea();
                                            }
                                            if (TextUtils.isEmpty(locality2)) {
                                                locality2 = address.getSubAdminArea();
                                            }
                                            String adminArea = address.getAdminArea();
                                            StringBuilder sb8 = new StringBuilder();
                                            if (TextUtils.isEmpty(adminArea)) {
                                                sb5 = sb6;
                                                cVar = cVar3;
                                            } else {
                                                sb5 = sb6;
                                                TL_stories.TL_geoPointAddress tL_geoPointAddress2 = tL_messageMediaVenue2.geoAddress;
                                                tL_geoPointAddress2.state = adminArea;
                                                cVar = cVar3;
                                                try {
                                                    tL_geoPointAddress2.flags |= 1;
                                                } catch (Exception unused6) {
                                                }
                                            }
                                            if (!TextUtils.isEmpty(locality2)) {
                                                TL_stories.TL_geoPointAddress tL_geoPointAddress3 = tL_messageMediaVenue2.geoAddress;
                                                tL_geoPointAddress3.city = locality2;
                                                tL_geoPointAddress3.flags |= 2;
                                            }
                                            if (!z15) {
                                                String thoroughfare2 = (!TextUtils.isEmpty(null) || TextUtils.equals(address.getThoroughfare(), str3) || TextUtils.equals(address.getThoroughfare(), address.getCountryName())) ? null : address.getThoroughfare();
                                                if (TextUtils.isEmpty(thoroughfare2) && !TextUtils.equals(address.getSubLocality(), str3) && !TextUtils.equals(address.getSubLocality(), address.getCountryName())) {
                                                    thoroughfare2 = address.getSubLocality();
                                                }
                                                if (TextUtils.isEmpty(thoroughfare2) && !TextUtils.equals(address.getLocality(), str3) && !TextUtils.equals(address.getLocality(), address.getCountryName())) {
                                                    thoroughfare2 = address.getLocality();
                                                }
                                                if (TextUtils.isEmpty(thoroughfare2) || TextUtils.equals(thoroughfare2, adminArea) || TextUtils.equals(thoroughfare2, address.getCountryName())) {
                                                    sb8 = null;
                                                } else {
                                                    if (sb8.length() > 0) {
                                                        sb8.append(", ");
                                                    }
                                                    sb8.append(thoroughfare2);
                                                }
                                                if (!TextUtils.isEmpty(sb8)) {
                                                    int i23 = 0;
                                                    while (true) {
                                                        String[] strArr = ld.Q;
                                                        if (i23 < 19) {
                                                            if (strArr[i23].equalsIgnoreCase(sb8.toString())) {
                                                                z13 = true;
                                                            } else {
                                                                i23++;
                                                            }
                                                        }
                                                    }
                                                }
                                                z13 = false;
                                                if (!TextUtils.isEmpty(sb8)) {
                                                    TL_stories.TL_geoPointAddress tL_geoPointAddress4 = tL_messageMediaVenue2.geoAddress;
                                                    tL_geoPointAddress4.flags |= 4;
                                                    tL_geoPointAddress4.street = sb8.toString();
                                                }
                                                if (!z13) {
                                                    arrayList.add(tL_messageMediaVenue2);
                                                    if (arrayList.size() >= i10) {
                                                    }
                                                }
                                            }
                                        } else {
                                            sb5 = sb6;
                                            cVar = cVar3;
                                        }
                                        z13 = false;
                                        if (!z13) {
                                        }
                                    }
                                    if (z12) {
                                        hashSet3 = hashSet5;
                                    } else {
                                        hashSet3 = hashSet5;
                                        if (!hashSet3.contains(sb2.toString())) {
                                            TLRPC.TL_messageMediaVenue tL_messageMediaVenue3 = new TLRPC.TL_messageMediaVenue();
                                            TLRPC.TL_geoPoint tL_geoPoint3 = new TLRPC.TL_geoPoint();
                                            tL_messageMediaVenue3.geo = tL_geoPoint3;
                                            tL_geoPoint3.lat = latitude;
                                            tL_geoPoint3._long = longitude;
                                            tL_messageMediaVenue3.query_id = -1L;
                                            tL_messageMediaVenue3.title = sb2.toString();
                                            tL_messageMediaVenue3.icon = "city";
                                            tL_messageMediaVenue3.emoji = ld.b(address2.getCountryCode());
                                            hashSet3.add(tL_messageMediaVenue3.title);
                                            tL_messageMediaVenue3.address = bd.M0(2131747603, null);
                                            if (address != null) {
                                                TL_stories.TL_geoPointAddress tL_geoPointAddress5 = new TL_stories.TL_geoPointAddress();
                                                tL_messageMediaVenue3.geoAddress = tL_geoPointAddress5;
                                                tL_geoPointAddress5.country_iso2 = address.getCountryCode();
                                                String locality3 = TextUtils.isEmpty(null) ? address.getLocality() : null;
                                                if (TextUtils.isEmpty(locality3)) {
                                                    locality3 = address.getAdminArea();
                                                }
                                                if (TextUtils.isEmpty(locality3)) {
                                                    locality3 = address.getSubAdminArea();
                                                }
                                                String adminArea2 = address.getAdminArea();
                                                if (!TextUtils.isEmpty(adminArea2)) {
                                                    TL_stories.TL_geoPointAddress tL_geoPointAddress6 = tL_messageMediaVenue3.geoAddress;
                                                    tL_geoPointAddress6.state = adminArea2;
                                                    tL_geoPointAddress6.flags |= 1;
                                                }
                                                if (!TextUtils.isEmpty(locality3)) {
                                                    TL_stories.TL_geoPointAddress tL_geoPointAddress7 = tL_messageMediaVenue3.geoAddress;
                                                    tL_geoPointAddress7.city = locality3;
                                                    tL_geoPointAddress7.flags |= 2;
                                                }
                                            }
                                            arrayList.add(tL_messageMediaVenue3);
                                            if (arrayList.size() >= i10) {
                                            }
                                        }
                                    }
                                    if (sb5.length() > 0) {
                                        hashSet = hashSet4;
                                        if (hashSet.contains(sb5.toString())) {
                                            continue;
                                        } else {
                                            TLRPC.TL_messageMediaVenue tL_messageMediaVenue4 = new TLRPC.TL_messageMediaVenue();
                                            TLRPC.TL_geoPoint tL_geoPoint4 = new TLRPC.TL_geoPoint();
                                            tL_messageMediaVenue4.geo = tL_geoPoint4;
                                            tL_geoPoint4.lat = latitude;
                                            tL_geoPoint4._long = longitude;
                                            tL_messageMediaVenue4.query_id = -1L;
                                            tL_messageMediaVenue4.title = sb5.toString();
                                            tL_messageMediaVenue4.icon = "country";
                                            tL_messageMediaVenue4.emoji = ld.b(address2.getCountryCode());
                                            hashSet.add(tL_messageMediaVenue4.title);
                                            tL_messageMediaVenue4.address = bd.M0(2131751754, null);
                                            if (address != null) {
                                                TL_stories.TL_geoPointAddress tL_geoPointAddress8 = new TL_stories.TL_geoPointAddress();
                                                tL_messageMediaVenue4.geoAddress = tL_geoPointAddress8;
                                                tL_geoPointAddress8.country_iso2 = address.getCountryCode();
                                            }
                                            arrayList.add(tL_messageMediaVenue4);
                                            if (arrayList.size() >= i10) {
                                            }
                                        }
                                    } else {
                                        hashSet = hashSet4;
                                    }
                                    i11 = i13 + 1;
                                    hashSet2 = hashSet3;
                                    i15 = i12;
                                    fromLocationName = list2;
                                    str5 = str2;
                                    fromLocationName2 = list;
                                    locale2 = locale;
                                    i20 = i3;
                                    str7 = str;
                                    cVar2 = cVar;
                                }
                                org.telegram.messenger.g0.h3(new bi.q0(cVar, i3, str, arrayList, 6));
                                break;
                            }
                        } else {
                            hashSet4 = hashSet;
                        }
                        String subLocality = address2.getSubLocality();
                        if (TextUtils.isEmpty(subLocality)) {
                            String locality4 = address2.getLocality();
                            if (TextUtils.isEmpty(locality4) || TextUtils.equals(locality4, str3)) {
                                z10 = true;
                                sb3 = null;
                                if (TextUtils.isEmpty(str3)) {
                                }
                                boolean z152 = z10;
                                countryName = address2.getCountryName();
                                if (TextUtils.isEmpty(countryName)) {
                                }
                                kg.c cVar32 = cVar2;
                                if (cVar2.e) {
                                }
                                org.telegram.messenger.g0.h3(new bi.q0(cVar, i3, str, arrayList, 6));
                            } else {
                                if (sb3.length() > 0) {
                                    sb3.append(", ");
                                }
                                sb3.append(locality4);
                            }
                        } else {
                            if (sb3.length() > 0) {
                                sb3.append(", ");
                            }
                            sb3.append(subLocality);
                        }
                        z10 = false;
                        if (TextUtils.isEmpty(str3)) {
                        }
                        boolean z1522 = z10;
                        countryName = address2.getCountryName();
                        if (TextUtils.isEmpty(countryName)) {
                        }
                        kg.c cVar322 = cVar2;
                        if (cVar2.e) {
                        }
                        org.telegram.messenger.g0.h3(new bi.q0(cVar, i3, str, arrayList, 6));
                    } else {
                        locale = locale2;
                        str2 = str5;
                        list = fromLocationName2;
                        i12 = i15;
                        list2 = fromLocationName;
                        cVar = cVar2;
                        i3 = i20;
                        str = str7;
                        hashSet3 = hashSet2;
                        i13 = i11;
                    }
                    i11 = i13 + 1;
                    hashSet2 = hashSet3;
                    i15 = i12;
                    fromLocationName = list2;
                    str5 = str2;
                    fromLocationName2 = list;
                    locale2 = locale;
                    i20 = i3;
                    str7 = str;
                    cVar2 = cVar;
                }
                cVar = cVar2;
                i3 = i20;
                str = str7;
                org.telegram.messenger.g0.h3(new bi.q0(cVar, i3, str, arrayList, 6));
                break;
            case 6:
                final kg.e0 e0Var = (kg.e0) this.c;
                int i24 = this.b;
                ArrayList arrayList2 = (ArrayList) this.d;
                ArrayList arrayList3 = (ArrayList) this.e;
                ArrayList arrayList4 = (ArrayList) this.f;
                kg.w wVar = e0Var.k0;
                ArrayList arrayList5 = e0Var.w0;
                int i25 = e0Var.t0;
                e0Var.E0--;
                if (i24 == e0Var.e0) {
                    e0Var.g0 = i24;
                    if (e0Var.f0 != i24) {
                        wVar.b();
                    }
                    if (e0Var.h0 != i24) {
                        e0Var.J.clear();
                    }
                    e0Var.O = true;
                    int i26 = 0;
                    while (i26 < arrayList2.size()) {
                        if (!e0Var.F(arrayList2.get(i26))) {
                            arrayList2.remove(i26);
                            i26--;
                        }
                        i26++;
                    }
                    boolean z16 = true;
                    int size = arrayList5.size();
                    int i27 = 0;
                    while (i27 < arrayList2.size()) {
                        final Object obj2 = arrayList2.get(i27);
                        if (obj2 instanceof TLRPC.User) {
                            TLRPC.User user = (TLRPC.User) obj2;
                            j10 = 0;
                            hp.s1(i25).X3(user, z16, false);
                            j11 = user.id;
                        } else {
                            j10 = 0;
                            if (obj2 instanceof TLRPC.Chat) {
                                TLRPC.Chat chat = (TLRPC.Chat) obj2;
                                hp.s1(i25).Q3(chat, z16);
                                j11 = -chat.id;
                            } else {
                                if (obj2 instanceof TLRPC.EncryptedChat) {
                                    hp.s1(i25).U3((TLRPC.EncryptedChat) obj2, z16);
                                }
                                j11 = 0;
                            }
                        }
                        if (j11 == j10 || ((TLRPC.Dialog) hp.s1(i25).R.f(j11)) != null) {
                            j12 = j11;
                        } else {
                            qr a02 = qr.a0(i25);
                            j12 = j11;
                            a02.a.c(new wq(a02, j12, new kr() { // from class: kg.v
                                @Override // org.telegram.messenger.kr
                                public final void a(int i28) {
                                    int i29 = e0.this.t0;
                                    if (i28 != -1) {
                                        TLRPC.TL_dialog tL_dialog = new TLRPC.TL_dialog();
                                        long j14 = j11;
                                        tL_dialog.id = j14;
                                        if (i28 != 0) {
                                            tL_dialog.folder_id = i28;
                                        }
                                        Object obj3 = obj2;
                                        if (obj3 instanceof TLRPC.Chat) {
                                            tL_dialog.flags = t3.T((TLRPC.Chat) obj3) ? 1 : 0;
                                        }
                                        hp.s1(i29).R.k(tL_dialog, j14);
                                        hp.s1(i29).y.add(tL_dialog);
                                        hp.s1(i29).T4(null);
                                    }
                                }
                            }, 1));
                        }
                        if (e0Var.R() && !(obj2 instanceof TLRPC.EncryptedChat)) {
                            ew ewVar = e0Var.V;
                            boolean z17 = ewVar != null && ewVar.a() == j12;
                            for (int i28 = 0; !z17 && i28 < size; i28++) {
                                kg.d0 d0Var = (kg.d0) arrayList5.get(i28);
                                if (d0Var != null && d0Var.c == j12) {
                                    z17 = true;
                                }
                            }
                            if (z17) {
                                arrayList2.remove(i27);
                                arrayList3.remove(i27);
                                i27--;
                            }
                        }
                        z16 = true;
                        i27++;
                    }
                    hp.s1(i25).Y3(arrayList4, z16);
                    e0Var.s = arrayList2;
                    e0Var.H = arrayList3;
                    wVar.f(arrayList2, arrayList5);
                    e0Var.f();
                    ew ewVar2 = e0Var.V;
                    if (ewVar2 != null) {
                        ewVar2.d(e0Var.E0 > 0 ? z16 : false, z16);
                        e0Var.V.c();
                        break;
                    }
                }
                break;
            case 7:
                kg.o1 o1Var = (kg.o1) this.c;
                int i29 = this.b;
                ArrayList arrayList6 = (ArrayList) this.d;
                ArrayList arrayList7 = (ArrayList) this.e;
                ArrayList arrayList8 = (ArrayList) this.f;
                if (i29 == o1Var.F) {
                    o1Var.d = arrayList6;
                    o1Var.e = arrayList7;
                    o1Var.I = arrayList8;
                    o1Var.f.f(arrayList6, null);
                    o1Var.E = false;
                    o1Var.f();
                    o1Var.F();
                    break;
                }
                break;
            case 8:
                o4.o0 o0Var = (o4.o0) this.c;
                o4.n1 n1Var = (o4.n1) this.d;
                int i30 = this.b;
                p4.r rVar = (p4.r) this.e;
                o4.n0 n0Var = (o4.n0) this.f;
                ui.f fVar = o0Var.g;
                if (!o0Var.h.j()) {
                    if (!((p4.l) o0Var.n.a).a.isActive()) {
                        StringBuilder sb9 = new StringBuilder("Ignore incoming session command before initialization. command=");
                        sb9.append(n1Var == null ? Integer.valueOf(i30) : n1Var.b);
                        sb9.append(", pid=");
                        sb9.append(rVar.a.b);
                        g2.a.l("MediaSessionLegacyStub", sb9.toString());
                        break;
                    } else {
                        o4.v m0 = o0Var.m0(rVar);
                        if (n1Var != null) {
                            if (!fVar.y(m0, n1Var)) {
                            }
                        } else if (!fVar.x(m0, i30)) {
                        }
                        try {
                            n0Var.c(m0);
                            break;
                        } catch (RemoteException e10) {
                            g2.a.m("MediaSessionLegacyStub", "Exception in " + m0, e10);
                            return;
                        }
                    }
                }
                break;
            case 9:
                ((VoIPService) this.c).lambda$startConferenceGroupCall$33((TLObject) this.d, this.b, (String) this.e, (TLRPC.TL_error) this.f);
                break;
            case 10:
                org.telegram.ui.i4 i4Var = (org.telegram.ui.i4) this.c;
                ArrayList arrayList9 = (ArrayList) this.d;
                HashMap hashMap = (HashMap) this.e;
                String str9 = (String) this.f;
                int i31 = this.b;
                ArrayList arrayList10 = new ArrayList();
                int size2 = arrayList9.size();
                int i32 = 0;
                while (i32 < size2) {
                    Object obj3 = arrayList9.get(i32);
                    TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) hashMap.get(obj3);
                    if (obj3 instanceof TL_iv.RichText) {
                        TL_iv.RichText richText = (TL_iv.RichText) obj3;
                        TLRPC.WebPage webPage = i4Var.v0[c10].c.F;
                        obj = obj3;
                        CharSequence A = org.telegram.ui.i4.A(i4Var, webPage, null, richText, richText, pageBlock, 1000);
                        if (!TextUtils.isEmpty(A)) {
                            lowerCase = A.toString().toLowerCase();
                        }
                        lowerCase = null;
                    } else {
                        obj = obj3;
                        if (obj instanceof String) {
                            lowerCase = ((String) obj).toLowerCase();
                        }
                        lowerCase = null;
                    }
                    if (lowerCase != null) {
                        int i33 = 0;
                        while (true) {
                            int indexOf = lowerCase.indexOf(str9, i33);
                            if (indexOf >= 0) {
                                int length2 = str9.length() + indexOf;
                                if (indexOf == 0 || org.telegram.messenger.g0.K1(lowerCase.charAt(indexOf - 1))) {
                                    org.telegram.ui.q3 q3Var = new org.telegram.ui.q3();
                                    q3Var.a = indexOf;
                                    q3Var.c = pageBlock;
                                    q3Var.b = obj;
                                    arrayList10.add(q3Var);
                                }
                                i33 = length2;
                            }
                        }
                    }
                    i32++;
                    c10 = 0;
                }
                org.telegram.messenger.g0.h3(new bi.q0((Object) i4Var, i31, (Object) arrayList10, str9, 15));
                break;
            case 11:
                a();
                break;
            case 12:
                wm.h0((wm) this.c, this.b, (Boolean) this.d, (TLRPC.WebPage) this.e, (TL_account.getWebPagePreview) this.f);
                break;
            case 13:
                b();
                break;
            case 14:
                c();
                break;
            case 15:
                e();
                break;
            case 16:
                f();
                break;
            case 17:
                g();
                break;
            case 18:
                lr.d1((lr) this.c, (TLObject) this.d, (TLRPC.InputPeer) this.e, this.b, (int[]) this.f);
                break;
            case 19:
                h();
                break;
            case 20:
                i();
                break;
            case 21:
                j();
                break;
            case 22:
                k();
                break;
            case 23:
                l();
                break;
            case 24:
                m();
                break;
            case 25:
                n();
                break;
            default:
                ug.c2 c2Var = (ug.c2) this.c;
                int i34 = this.b;
                List list3 = (List) this.d;
                ArrayList arrayList11 = (ArrayList) this.e;
                en0 en0Var = (en0) this.f;
                if (c2Var.J != null && !c2Var.E) {
                    Matrix matrix = new Matrix();
                    matrix.postScale(1.0f / c2Var.J.getWidth(), 1.0f / c2Var.J.getHeight());
                    matrix.postTranslate(-0.5f, -0.5f);
                    matrix.postRotate(i34);
                    matrix.postTranslate(0.5f, 0.5f);
                    if ((i34 / 90) % 2 != 0) {
                        matrix.postScale(c2Var.J.getHeight(), c2Var.J.getWidth());
                    } else {
                        matrix.postScale(c2Var.J.getWidth(), c2Var.J.getHeight());
                    }
                    if (list3.isEmpty()) {
                        ug.z1 z1Var = new ug.z1(c2Var);
                        z1Var.h.set(0.0f, 0.0f, c2Var.J.getWidth(), c2Var.J.getHeight());
                        z1Var.i.set(z1Var.h);
                        matrix.mapRect(z1Var.i);
                        z1Var.c = i34;
                        Bitmap d = c2Var.d(0, 0, c2Var.J, false);
                        z1Var.d = d;
                        if (d == null) {
                            a8.g(new RuntimeException("createSmoothEdgesSegmentedImage failed on empty image"), true);
                            break;
                        } else {
                            z1Var.f = z1Var.c();
                            ug.c2.c(z1Var, c2Var.U, c2Var.V);
                            c2Var.P = z1Var.j;
                            c2Var.Q = z1Var.k;
                            arrayList11.add(z1Var);
                            org.telegram.messenger.g0.h3(new ih0(c2Var, arrayList11, en0Var, z1Var, 28));
                            c2Var.F = z1Var;
                            c2Var.E = true;
                            c2Var.y = false;
                            break;
                        }
                    } else {
                        for (int i35 = 0; i35 < list3.size(); i35++) {
                            ug.b2 b2Var = (ug.b2) list3.get(i35);
                            ug.z1 z1Var2 = new ug.z1(c2Var);
                            z1Var2.h.set(b2Var.b, b2Var.c, r14 + b2Var.d, r5 + b2Var.e);
                            z1Var2.i.set(z1Var2.h);
                            matrix.mapRect(z1Var2.i);
                            z1Var2.c = i34;
                            Bitmap d10 = c2Var.d(b2Var.b, b2Var.c, b2Var.a, false);
                            z1Var2.d = d10;
                            if (d10 != null) {
                                z1Var2.f = z1Var2.c();
                                ug.c2.c(z1Var2, c2Var.U, c2Var.V);
                                c2Var.P = z1Var2.j;
                                c2Var.Q = z1Var2.k;
                                arrayList11.add(z1Var2);
                            }
                        }
                        c2Var.F = null;
                        c2Var.E = true;
                        c2Var.y = false;
                        org.telegram.messenger.g0.h3(new u9.a(4, c2Var, arrayList11));
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ p1(Object obj, int i3, Object obj2, Object obj3, Object obj4, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = i3;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
    }

    public /* synthetic */ p1(Object obj, Object obj2, int i3, Object obj3, Object obj4, int i10) {
        this.a = i10;
        this.c = obj;
        this.d = obj2;
        this.b = i3;
        this.e = obj3;
        this.f = obj4;
    }

    public /* synthetic */ p1(Object obj, Object obj2, Object obj3, int i3, Object obj4, int i10) {
        this.a = i10;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = i3;
        this.f = obj4;
    }

    public /* synthetic */ p1(Object obj, Object obj2, Object obj3, Object obj4, int i3, int i10) {
        this.a = i10;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
        this.b = i3;
    }

    public /* synthetic */ p1(TLObject tLObject, boolean[] zArr, u10 u10Var, int i3, TL_account.updateEmojiStatus updateemojistatus) {
        this.a = 3;
        this.c = tLObject;
        this.d = zArr;
        this.f = u10Var;
        this.b = i3;
        this.e = updateemojistatus;
    }
}
