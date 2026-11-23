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
import bi.o5;
import bi.p3;
import bi.t2;
import di.y8;
import hi.nb;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import org.telegram.messenger.a8;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.f3;
import org.telegram.messenger.fj;
import org.telegram.messenger.gd;
import org.telegram.messenger.i10;
import org.telegram.messenger.ks;
import org.telegram.messenger.mp;
import org.telegram.messenger.n10;
import org.telegram.messenger.nr;
import org.telegram.messenger.qd;
import org.telegram.messenger.ro;
import org.telegram.messenger.tr;
import org.telegram.messenger.v3;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.messenger.w10;
import org.telegram.messenger.w7;
import org.telegram.messenger.zq;
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
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.w2;
import org.telegram.ui.Components.RLottieNative;
import org.telegram.ui.Components.a9;
import org.telegram.ui.Components.g00;
import org.telegram.ui.Components.iu0;
import org.telegram.ui.Components.ju0;
import org.telegram.ui.Components.kc;
import org.telegram.ui.Components.ku0;
import org.telegram.ui.Components.p9;
import org.telegram.ui.Components.xr;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.SecretMediaViewer;
import org.telegram.ui.bn;
import org.telegram.ui.bx;
import org.telegram.ui.e40;
import org.telegram.ui.g4;
import org.telegram.ui.hi;
import org.telegram.ui.hm;
import org.telegram.ui.i50;
import org.telegram.ui.ld0;
import org.telegram.ui.le0;
import org.telegram.ui.lw;
import org.telegram.ui.mm;
import org.telegram.ui.pn0;
import org.telegram.ui.r90;
import org.telegram.ui.wl;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class d1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ d1(int i7, Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.a = i10;
        this.b = i7;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
    }

    private final void a() {
        TLObject tLObject = (TLObject) this.c;
        HashSet hashSet = (HashSet) this.d;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) this.e;
        org.telegram.ui.ActionBar.g2 g2Var = (org.telegram.ui.ActionBar.g2) this.f;
        boolean z10 = tLObject instanceof TLRPC.Updates;
        int i7 = this.b;
        if (!z10) {
            if (!(tLObject instanceof TL_phone.groupCall)) {
                if (tL_error != null) {
                    kc.b0(g2Var).g0(tL_error, false);
                    return;
                }
                return;
            }
            TL_phone.groupCall groupcall = (TL_phone.groupCall) tLObject;
            mp.u1(i7).f4(groupcall.users, false);
            mp.u1(i7).Z3(groupcall.chats, false);
            if (LaunchActivity.H1 == null) {
                return;
            }
            TLRPC.TL_inputGroupCall tL_inputGroupCall = new TLRPC.TL_inputGroupCall();
            TLRPC.GroupCall groupCall = groupcall.call;
            tL_inputGroupCall.id = groupCall.id;
            tL_inputGroupCall.access_hash = groupCall.access_hash;
            org.telegram.ui.Components.voip.c2.g(LaunchActivity.H1, i7, tL_inputGroupCall, false, groupCall, hashSet);
            return;
        }
        TLRPC.Updates updates = (TLRPC.Updates) tLObject;
        mp.u1(i7).f4(updates.users, false);
        mp.u1(i7).Z3(updates.chats, false);
        ArrayList B0 = mp.B0(updates, TL_update.TL_updateGroupCall.class);
        int size = B0.size();
        TLRPC.GroupCall groupCall2 = null;
        int i10 = 0;
        while (i10 < size) {
            Object obj = B0.get(i10);
            i10++;
            groupCall2 = ((TL_update.TL_updateGroupCall) obj).call;
        }
        if (LaunchActivity.H1 == null || groupCall2 == null) {
            return;
        }
        TLRPC.TL_inputGroupCall tL_inputGroupCall2 = new TLRPC.TL_inputGroupCall();
        tL_inputGroupCall2.id = groupCall2.id;
        tL_inputGroupCall2.access_hash = groupCall2.access_hash;
        org.telegram.ui.Components.voip.c2.g(LaunchActivity.H1, i7, tL_inputGroupCall2, false, groupCall2, hashSet);
    }

    private final void b() {
        org.telegram.ui.ActionBar.g2 Q;
        TLRPC.Chat chat = (TLRPC.Chat) this.c;
        ArrayList arrayList = (ArrayList) this.d;
        ArrayList arrayList2 = (ArrayList) this.e;
        ArrayList arrayList3 = (ArrayList) this.f;
        if (!LaunchActivity.E1 || (Q = LaunchActivity.Q()) == null || Q.getParentActivity() == null) {
            return;
        }
        ug.k0 k0Var = new ug.k0(11, this.b, Q.getParentActivity(), Q, null);
        k0Var.D1(chat, arrayList, arrayList2, arrayList3, null);
        k0Var.show();
    }

    private final void c() {
        SharedPreferences sharedPreferences = (SharedPreferences) this.c;
        TLRPC.TL_help_support tL_help_support = (TLRPC.TL_help_support) this.d;
        org.telegram.ui.ActionBar.t1 t1Var = (org.telegram.ui.ActionBar.t1) this.e;
        org.telegram.ui.ActionBar.g2 g2Var = (org.telegram.ui.ActionBar.g2) this.f;
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putLong("support_id2", tL_help_support.user.id);
        SerializedData serializedData = new SerializedData();
        tL_help_support.user.serializeToStream(serializedData);
        edit.putString("support_user", Base64.encodeToString(serializedData.toByteArray(), 0));
        edit.commit();
        serializedData.cleanup();
        try {
            t1Var.dismiss();
        } catch (Exception e10) {
            a8.g(e10, true);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(tL_help_support.user);
        int i7 = this.b;
        tr.a0(i7).m1(arrayList, null, true, true);
        mp.u1(i7).e4(tL_help_support.user, false, false);
        Bundle bundle = new Bundle();
        bundle.putLong("user_id", tL_help_support.user.id);
        g2Var.presentFragment(new bn(bundle));
    }

    private final void d() {
        org.telegram.ui.ActionBar.t1[] t1VarArr = (org.telegram.ui.ActionBar.t1[]) this.d;
        int[] iArr = (int[]) this.c;
        Runnable runnable = (Runnable) this.e;
        org.telegram.ui.ActionBar.g2 g2Var = (org.telegram.ui.ActionBar.g2) this.f;
        org.telegram.ui.ActionBar.t1 t1Var = t1VarArr[0];
        if (t1Var == null) {
            return;
        }
        t1Var.setOnCancelListener(new org.telegram.ui.Components.w1(iArr, this.b, runnable));
        g2Var.showDialog(t1VarArr[0]);
    }

    private final void f() {
        xr.e1((xr) this.d, (TLObject) this.e, (TLRPC.InputPeer) this.f, this.b, (int[]) this.c);
    }

    private final void g() {
        int i7;
        int i10;
        ku0 ku0Var = (ku0) this.c;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) this.d;
        fj fjVar = (fj) this.e;
        org.telegram.ui.Cells.r1 r1Var = (org.telegram.ui.Cells.r1) this.f;
        int[] iArr = ku0Var.e;
        RLottieNative[] rLottieNativeArr = ku0Var.g1;
        if (ku0Var.X0) {
            org.telegram.messenger.g0.g3(new iu0(ku0Var, 2));
            return;
        }
        boolean z10 = false;
        int i11 = 0;
        while (true) {
            int length = rLottieNativeArr.length;
            i7 = this.b;
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
                    w7.G(i10.t0);
                    String y22 = org.telegram.messenger.g0.y2(w7.J(document, null, true, true), 0);
                    if (TextUtils.isEmpty(y22)) {
                        org.telegram.messenger.g0.g3(new ju0(document, i7, fjVar, r1Var, tL_messages_stickerSet, 1));
                        z10 = true;
                    } else {
                        rLottieNativeArr[i11] = RLottieNative.b(y22, iArr, null, null);
                        ku0Var.h1[i11] = iArr[0];
                    }
                }
            }
            i11++;
        }
        if (z10) {
            org.telegram.messenger.g0.g3(new iu0(ku0Var, 3));
        } else {
            org.telegram.messenger.g0.g3(new org.telegram.ui.f0(ku0Var, i7, r1Var, 23));
        }
    }

    private final void h() {
        boolean z10;
        LaunchActivity launchActivity = (LaunchActivity) this.c;
        TLObject tLObject = (TLObject) this.d;
        Uri uri = (Uri) this.e;
        org.telegram.ui.ActionBar.t1 t1Var = (org.telegram.ui.ActionBar.t1) this.f;
        String str = LaunchActivity.C1;
        if (launchActivity.isFinishing()) {
            return;
        }
        if (tLObject == null || launchActivity.p0 == null) {
            if (launchActivity.X == null) {
                launchActivity.X = new ArrayList();
            }
            launchActivity.X.add(0, launchActivity.Y);
            launchActivity.Y = null;
            launchActivity.j0(true);
        } else {
            TLRPC.TL_messages_historyImportParsed tL_messages_historyImportParsed = (TLRPC.TL_messages_historyImportParsed) tLObject;
            Bundle k10 = a8.p0.k("onlySelect", true);
            k10.putString("importTitle", tL_messages_historyImportParsed.title);
            k10.putBoolean("allowSwitchAccount", true);
            if (tL_messages_historyImportParsed.pm) {
                k10.putInt("dialogsType", 12);
            } else if (tL_messages_historyImportParsed.group) {
                k10.putInt("dialogsType", 11);
            } else {
                String uri2 = uri.toString();
                int i7 = this.b;
                Iterator it = mp.u1(i7).a4.iterator();
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
                    Iterator it2 = mp.u1(i7).Z3.iterator();
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
            } else if (PhotoViewer.A1() && PhotoViewer.p1().Q1()) {
                PhotoViewer.p1().z0(false, true);
            } else if (g4.G() && g4.v().W) {
                g4.v().m(false, true);
            }
            nb.w();
            e40 e40Var = e40.C5;
            if (e40Var != null) {
                e40Var.dismiss();
            }
            if (org.telegram.messenger.g0.Q1()) {
                launchActivity.p0.X(true, true);
                launchActivity.r0.X(true, true);
            }
            bx bxVar = new bx(k10);
            bxVar.E2 = launchActivity;
            ((ActionBarLayout) launchActivity.M()).V(bxVar, !org.telegram.messenger.g0.Q1() ? launchActivity.p0.getFragmentStack().size() <= 1 || !(launchActivity.p0.getFragmentStack().get(launchActivity.p0.getFragmentStack().size() - 1) instanceof le0) : launchActivity.q0.getFragmentStack().isEmpty() || !(launchActivity.q0.getFragmentStack().get(launchActivity.q0.getFragmentStack().size() - 1) instanceof le0), false);
        }
        try {
            t1Var.dismiss();
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    private final void i() {
        LaunchActivity launchActivity = (LaunchActivity) this.c;
        i50 i50Var = (i50) this.d;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) this.e;
        TLRPC.Updates updates = (TLRPC.Updates) this.f;
        ArrayList arrayList = launchActivity.e0;
        if (launchActivity.isFinishing()) {
            return;
        }
        try {
            i50Var.run();
        } catch (Exception e10) {
            a8.g(e10, true);
        }
        if (tL_error != null) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(launchActivity);
            String N0 = gd.N0(R.string.AppName, null);
            org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
            t1Var.S = N0;
            if (tL_error.text.startsWith("FLOOD_WAIT")) {
                t1Var.U = gd.N0(2131750670, null);
            } else if (tL_error.text.equals("USERS_TOO_MUCH")) {
                t1Var.U = gd.N0(2131748883, null);
            } else {
                t1Var.U = gd.N0(2131748882, null);
            }
            alertDialog$Builder.k(gd.N0(2131747637, null), null);
            launchActivity.F0(alertDialog$Builder);
            return;
        }
        if (launchActivity.p0 == null || updates == null || updates.chats.isEmpty()) {
            return;
        }
        TLRPC.Chat chat = updates.chats.get(0);
        chat.left = false;
        chat.kicked = false;
        int i7 = this.b;
        mp.u1(i7).f4(updates.users, false);
        mp.u1(i7).Z3(updates.chats, false);
        Bundle bundle = new Bundle();
        bundle.putLong("chat_id", chat.id);
        if (arrayList.isEmpty() || mp.u1(i7).E(bundle, (org.telegram.ui.ActionBar.g2) i5.c.h(1, arrayList), null, null)) {
            bn bnVar = new bn(bundle);
            ks.f(i7).k(ks.t, new Object[0]);
            ((ActionBarLayout) launchActivity.M()).V(bnVar, false, true);
        }
    }

    private final void j() {
        kc b02;
        ArrayList<TLRPC.User> arrayList;
        ArrayList<TLRPC.Chat> arrayList2;
        LaunchActivity launchActivity = (LaunchActivity) this.c;
        TLObject tLObject = (TLObject) this.d;
        String str = (String) this.e;
        i50 i50Var = (i50) this.f;
        org.telegram.ui.ActionBar.g2 g2Var = (org.telegram.ui.ActionBar.g2) i5.c.h(1, launchActivity.e0);
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
                int i7 = this.b;
                int i10 = 0;
                mp.u1(i7).Z3(arrayList2, false);
                mp.u1(i7).f4(arrayList, false);
                if (!z10 || !((TL_chatlists.TL_chatlists_chatlistInvite) chatlist_chatlistinvite).peers.isEmpty()) {
                    g00 g00Var = new g00(g2Var, false);
                    g00Var.U1 = -1;
                    g00Var.Y1 = "";
                    g00Var.Z1 = new ArrayList();
                    g00Var.b2 = "";
                    g00Var.d2 = new ArrayList();
                    ArrayList arrayList3 = new ArrayList();
                    g00Var.e2 = arrayList3;
                    g00Var.v2 = -1;
                    g00Var.y2 = -5;
                    g00Var.T1 = str;
                    g00Var.V1 = chatlist_chatlistinvite;
                    arrayList3.clear();
                    if (z10) {
                        TL_chatlists.TL_chatlists_chatlistInvite tL_chatlists_chatlistInvite2 = (TL_chatlists.TL_chatlists_chatlistInvite) chatlist_chatlistinvite;
                        TLRPC.TL_textWithEntities tL_textWithEntities = tL_chatlists_chatlistInvite2.title;
                        g00Var.Y1 = tL_textWithEntities.text;
                        g00Var.Z1 = tL_textWithEntities.entities;
                        g00Var.a2 = tL_chatlists_chatlistInvite2.title_noanimate;
                        g00Var.c2 = tL_chatlists_chatlistInvite2.peers;
                    } else if (chatlist_chatlistinvite instanceof TL_chatlists.TL_chatlists_chatlistInviteAlready) {
                        TL_chatlists.TL_chatlists_chatlistInviteAlready tL_chatlists_chatlistInviteAlready2 = (TL_chatlists.TL_chatlists_chatlistInviteAlready) chatlist_chatlistinvite;
                        g00Var.c2 = tL_chatlists_chatlistInviteAlready2.missing_peers;
                        g00Var.f2 = tL_chatlists_chatlistInviteAlready2.already_peers;
                        g00Var.U1 = tL_chatlists_chatlistInviteAlready2.filter_id;
                        ArrayList arrayList4 = g2Var.getMessagesController().Q0;
                        if (arrayList4 != null) {
                            while (true) {
                                if (i10 >= arrayList4.size()) {
                                    break;
                                }
                                ro roVar = (ro) arrayList4.get(i10);
                                if (roVar.a == g00Var.U1) {
                                    g00Var.Y1 = roVar.b;
                                    g00Var.Z1 = roVar.c;
                                    g00Var.a2 = roVar.n;
                                    break;
                                }
                                i10++;
                            }
                        }
                    }
                    g00Var.g1();
                    g2Var.showDialog(g00Var);
                    i50Var.run();
                    return;
                }
                b02 = kc.b0(g2Var);
            } else {
                b02 = kc.b0(g2Var);
            }
            i50Var.run();
            return;
        } catch (Exception e10) {
            a8.g(e10, true);
            return;
        }
        f3.o(null, 2131748016, b02, null);
    }

    private final void k() {
        ((r90) this.c).v((String) this.d, this.b + 1, (String) this.e, (String) this.f);
    }

    private final void l() {
        ld0 ld0Var = (ld0) this.c;
        String str = (String) this.d;
        String str2 = (String) this.e;
        String str3 = (String) this.f;
        ArrayList arrayList = new ArrayList();
        f5.a aVar = new f5.a();
        aVar.c = "inapp";
        aVar.b = str;
        arrayList.add(aVar.a());
        a8.b("LoginBilling querying \"" + str + "\" product");
        org.telegram.messenger.r1.i().o(arrayList, new o5(ld0Var, str, str2, str3, this.b));
    }

    private final void m() {
        int[] iArr = (int[]) this.c;
        a9 a9Var = (a9) this.d;
        TLRPC.User user = (TLRPC.User) this.e;
        p9 p9Var = (p9) this.f;
        iArr[0] = this.b;
        a9Var.r(user);
        p9Var.f(user, a9Var);
    }

    private final void n() {
        p4.n0 n0Var = (p4.n0) this.c;
        p4.j1 j1Var = (p4.j1) this.d;
        q4.r rVar = (q4.r) this.e;
        p4.m0 m0Var = (p4.m0) this.f;
        ab.c0 c0Var = n0Var.g;
        if (n0Var.h.j()) {
            return;
        }
        boolean isActive = ((q4.l) n0Var.n.b).a.isActive();
        int i7 = this.b;
        if (!isActive) {
            StringBuilder sb2 = new StringBuilder("Ignore incoming session command before initialization. command=");
            sb2.append(j1Var == null ? Integer.valueOf(i7) : j1Var.b);
            sb2.append(", pid=");
            sb2.append(rVar.a.b);
            h2.a.l("MediaSessionLegacyStub", sb2.toString());
            return;
        }
        p4.v m0 = n0Var.m0(rVar);
        if (j1Var != null) {
            if (!c0Var.F(m0, j1Var)) {
                return;
            }
        } else if (!c0Var.E(m0, i7)) {
            return;
        }
        try {
            m0Var.f(m0);
        } catch (RemoteException e10) {
            h2.a.m("MediaSessionLegacyStub", "Exception in " + m0, e10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:270:0x0697 A[Catch: Exception -> 0x0620, TryCatch #0 {Exception -> 0x0620, blocks: (B:250:0x0608, B:252:0x0617, B:255:0x0626, B:257:0x0630, B:258:0x0633, B:261:0x0643, B:263:0x064d, B:265:0x0653, B:266:0x0656, B:268:0x0691, B:270:0x0697, B:272:0x069d, B:273:0x06a0, B:275:0x06a5, B:277:0x06ab, B:278:0x06ae, B:281:0x06b7, B:283:0x06c1, B:285:0x06d1, B:287:0x06dd, B:289:0x06e9, B:293:0x0732, B:295:0x0738, B:296:0x073b, B:298:0x0744, B:299:0x0747, B:300:0x0751, B:303:0x0759, B:309:0x076c, B:311:0x0772, B:318:0x07a3, B:320:0x07a9, B:322:0x07c7, B:323:0x07d8, B:325:0x07dc, B:327:0x07f1, B:328:0x07f7, B:330:0x07fd, B:331:0x0801, B:333:0x0807, B:334:0x080b, B:336:0x081a, B:445:0x07d0, B:447:0x06fa, B:449:0x070a, B:451:0x0714, B:453:0x072d, B:459:0x065b, B:461:0x0665, B:463:0x066b, B:464:0x066e, B:465:0x0672, B:467:0x067c, B:469:0x0682, B:471:0x0688, B:472:0x068b), top: B:249:0x0608 }] */
    /* JADX WARN: Removed duplicated region for block: B:283:0x06c1 A[Catch: Exception -> 0x0620, TryCatch #0 {Exception -> 0x0620, blocks: (B:250:0x0608, B:252:0x0617, B:255:0x0626, B:257:0x0630, B:258:0x0633, B:261:0x0643, B:263:0x064d, B:265:0x0653, B:266:0x0656, B:268:0x0691, B:270:0x0697, B:272:0x069d, B:273:0x06a0, B:275:0x06a5, B:277:0x06ab, B:278:0x06ae, B:281:0x06b7, B:283:0x06c1, B:285:0x06d1, B:287:0x06dd, B:289:0x06e9, B:293:0x0732, B:295:0x0738, B:296:0x073b, B:298:0x0744, B:299:0x0747, B:300:0x0751, B:303:0x0759, B:309:0x076c, B:311:0x0772, B:318:0x07a3, B:320:0x07a9, B:322:0x07c7, B:323:0x07d8, B:325:0x07dc, B:327:0x07f1, B:328:0x07f7, B:330:0x07fd, B:331:0x0801, B:333:0x0807, B:334:0x080b, B:336:0x081a, B:445:0x07d0, B:447:0x06fa, B:449:0x070a, B:451:0x0714, B:453:0x072d, B:459:0x065b, B:461:0x0665, B:463:0x066b, B:464:0x066e, B:465:0x0672, B:467:0x067c, B:469:0x0682, B:471:0x0688, B:472:0x068b), top: B:249:0x0608 }] */
    /* JADX WARN: Removed duplicated region for block: B:295:0x0738 A[Catch: Exception -> 0x0620, TryCatch #0 {Exception -> 0x0620, blocks: (B:250:0x0608, B:252:0x0617, B:255:0x0626, B:257:0x0630, B:258:0x0633, B:261:0x0643, B:263:0x064d, B:265:0x0653, B:266:0x0656, B:268:0x0691, B:270:0x0697, B:272:0x069d, B:273:0x06a0, B:275:0x06a5, B:277:0x06ab, B:278:0x06ae, B:281:0x06b7, B:283:0x06c1, B:285:0x06d1, B:287:0x06dd, B:289:0x06e9, B:293:0x0732, B:295:0x0738, B:296:0x073b, B:298:0x0744, B:299:0x0747, B:300:0x0751, B:303:0x0759, B:309:0x076c, B:311:0x0772, B:318:0x07a3, B:320:0x07a9, B:322:0x07c7, B:323:0x07d8, B:325:0x07dc, B:327:0x07f1, B:328:0x07f7, B:330:0x07fd, B:331:0x0801, B:333:0x0807, B:334:0x080b, B:336:0x081a, B:445:0x07d0, B:447:0x06fa, B:449:0x070a, B:451:0x0714, B:453:0x072d, B:459:0x065b, B:461:0x0665, B:463:0x066b, B:464:0x066e, B:465:0x0672, B:467:0x067c, B:469:0x0682, B:471:0x0688, B:472:0x068b), top: B:249:0x0608 }] */
    /* JADX WARN: Removed duplicated region for block: B:298:0x0744 A[Catch: Exception -> 0x0620, TryCatch #0 {Exception -> 0x0620, blocks: (B:250:0x0608, B:252:0x0617, B:255:0x0626, B:257:0x0630, B:258:0x0633, B:261:0x0643, B:263:0x064d, B:265:0x0653, B:266:0x0656, B:268:0x0691, B:270:0x0697, B:272:0x069d, B:273:0x06a0, B:275:0x06a5, B:277:0x06ab, B:278:0x06ae, B:281:0x06b7, B:283:0x06c1, B:285:0x06d1, B:287:0x06dd, B:289:0x06e9, B:293:0x0732, B:295:0x0738, B:296:0x073b, B:298:0x0744, B:299:0x0747, B:300:0x0751, B:303:0x0759, B:309:0x076c, B:311:0x0772, B:318:0x07a3, B:320:0x07a9, B:322:0x07c7, B:323:0x07d8, B:325:0x07dc, B:327:0x07f1, B:328:0x07f7, B:330:0x07fd, B:331:0x0801, B:333:0x0807, B:334:0x080b, B:336:0x081a, B:445:0x07d0, B:447:0x06fa, B:449:0x070a, B:451:0x0714, B:453:0x072d, B:459:0x065b, B:461:0x0665, B:463:0x066b, B:464:0x066e, B:465:0x0672, B:467:0x067c, B:469:0x0682, B:471:0x0688, B:472:0x068b), top: B:249:0x0608 }] */
    /* JADX WARN: Removed duplicated region for block: B:303:0x0759 A[Catch: Exception -> 0x0620, TRY_ENTER, TRY_LEAVE, TryCatch #0 {Exception -> 0x0620, blocks: (B:250:0x0608, B:252:0x0617, B:255:0x0626, B:257:0x0630, B:258:0x0633, B:261:0x0643, B:263:0x064d, B:265:0x0653, B:266:0x0656, B:268:0x0691, B:270:0x0697, B:272:0x069d, B:273:0x06a0, B:275:0x06a5, B:277:0x06ab, B:278:0x06ae, B:281:0x06b7, B:283:0x06c1, B:285:0x06d1, B:287:0x06dd, B:289:0x06e9, B:293:0x0732, B:295:0x0738, B:296:0x073b, B:298:0x0744, B:299:0x0747, B:300:0x0751, B:303:0x0759, B:309:0x076c, B:311:0x0772, B:318:0x07a3, B:320:0x07a9, B:322:0x07c7, B:323:0x07d8, B:325:0x07dc, B:327:0x07f1, B:328:0x07f7, B:330:0x07fd, B:331:0x0801, B:333:0x0807, B:334:0x080b, B:336:0x081a, B:445:0x07d0, B:447:0x06fa, B:449:0x070a, B:451:0x0714, B:453:0x072d, B:459:0x065b, B:461:0x0665, B:463:0x066b, B:464:0x066e, B:465:0x0672, B:467:0x067c, B:469:0x0682, B:471:0x0688, B:472:0x068b), top: B:249:0x0608 }] */
    /* JADX WARN: Removed duplicated region for block: B:317:0x07a1  */
    /* JADX WARN: Removed duplicated region for block: B:389:0x090a A[Catch: Exception -> 0x0a48, TryCatch #2 {Exception -> 0x0a48, blocks: (B:339:0x0822, B:340:0x082f, B:342:0x0835, B:344:0x0841, B:346:0x0849, B:348:0x0853, B:350:0x0861, B:351:0x0867, B:353:0x086d, B:355:0x0877, B:357:0x0885, B:358:0x0889, B:360:0x088f, B:362:0x0899, B:364:0x08a7, B:365:0x08ab, B:367:0x08b1, B:369:0x08b7, B:371:0x08c1, B:373:0x08c7, B:374:0x08ca, B:375:0x08cf, B:378:0x08d6, B:380:0x08dc, B:385:0x08ee, B:387:0x08f4, B:389:0x090a, B:396:0x091b, B:398:0x0927, B:400:0x0960, B:402:0x0975, B:403:0x097b, B:405:0x0981, B:406:0x0985, B:408:0x098b, B:409:0x098f, B:411:0x0999, B:412:0x09a5, B:414:0x09ab, B:416:0x09b5, B:420:0x09c2, B:422:0x09c8, B:424:0x09d4, B:426:0x0a0d, B:427:0x0a1a, B:382:0x08ea), top: B:338:0x0822 }] */
    /* JADX WARN: Removed duplicated region for block: B:457:0x074b  */
    /* JADX WARN: Removed duplicated region for block: B:458:0x06b5  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        String str;
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings;
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings2;
        jg.c cVar;
        int i7;
        String str2;
        int i10;
        List<Address> fromLocationName;
        List<Address> fromLocationName2;
        HashSet hashSet;
        HashSet hashSet2;
        int i11;
        Locale locale;
        String str3;
        List<Address> list;
        int i12;
        List<Address> list2;
        HashSet hashSet3;
        int i13;
        HashSet hashSet4;
        StringBuilder sb2;
        StringBuilder sb3;
        String str4;
        String thoroughfare;
        Address address;
        boolean z10;
        boolean z11;
        String countryName;
        StringBuilder sb4;
        HashSet hashSet5;
        boolean z12;
        StringBuilder sb5;
        boolean z13;
        String str5;
        int i14;
        long j3;
        final long j10;
        long j11;
        g4 g4Var;
        int i15;
        int i16;
        Object obj;
        String lowerCase;
        str = "";
        long j12 = 0;
        int i17 = 2;
        int i18 = 0;
        switch (this.a) {
            case 0:
                int i19 = this.b;
                int[] iArr = (int[]) this.c;
                f1 f1Var = (f1) this.d;
                w7 w7Var = (w7) this.e;
                TLRPC.Document document = (TLRPC.Document) this.f;
                ks f10 = ks.f(i19);
                while (i18 < 3) {
                    f10.b(f1Var, iArr[i18]);
                    i18++;
                }
                w7Var.W(document, "speech_model", 3, 1);
                break;
            case 1:
                p3 p3Var = (p3) this.c;
                Context context = (Context) this.d;
                int i20 = this.b;
                TL_stars.StarGift starGift = (TL_stars.StarGift) this.e;
                w10 w10Var = (w10) this.f;
                long j13 = p3Var.X1;
                bi.j2 j2Var = new bi.j2(p3Var, w10Var, i17);
                boolean z14 = starGift.limited;
                new t2(p3Var, context, i20, starGift, j13, j2Var, z14 && (disallowedGiftsSettings2 = p3Var.W1) != null && disallowedGiftsSettings2.disallow_limited_stargifts, z14 && (disallowedGiftsSettings = p3Var.W1) != null && disallowedGiftsSettings.disallow_unique_stargifts).show();
                break;
            case 2:
                hi.e eVar = (hi.e) this.c;
                w2[] w2VarArr = (w2[]) this.d;
                int i21 = this.b;
                TLObject tLObject = (TLObject) this.e;
                String str6 = (String) this.f;
                eVar.setLoading(false);
                w2 w2Var = w2VarArr[0];
                if (w2Var != null) {
                    w2Var.dismiss();
                }
                y8.y(i21, false).Q();
                org.telegram.ui.ActionBar.g2 T = LaunchActivity.T();
                if (T != null) {
                    kc.b0(T).V(Collections.singletonList(tLObject), gd.N0(2131744738, null), org.telegram.messenger.g0.W2(gd.a0(null, null, 2131744737, str6)), null).k(false);
                    break;
                }
                break;
            case 3:
                jg.c cVar2 = (jg.c) this.c;
                Locale locale2 = (Locale) this.d;
                String str7 = (String) this.e;
                Locale locale3 = (Locale) this.f;
                int i22 = this.b;
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
                        i12 = i17;
                        HashSet hashSet6 = hashSet;
                        double latitude = address2.getLatitude();
                        locale = locale2;
                        str3 = str;
                        double longitude = address2.getLongitude();
                        list = fromLocationName2;
                        StringBuilder sb6 = new StringBuilder();
                        i7 = i22;
                        try {
                            sb2 = new StringBuilder();
                            str2 = str7;
                            try {
                                sb3 = new StringBuilder();
                                String locality = address2.getLocality();
                                if (TextUtils.isEmpty(locality)) {
                                    locality = address2.getAdminArea();
                                }
                                list2 = fromLocationName;
                                str4 = locality;
                                if (address3 != null && TextUtils.isEmpty(address3.getLocality())) {
                                    address3.getAdminArea();
                                }
                                i13 = i11;
                                thoroughfare = address2.getThoroughfare();
                                address = address3;
                            } catch (Exception unused2) {
                                cVar = cVar2;
                            }
                        } catch (Exception unused3) {
                            cVar = cVar2;
                        }
                        if (TextUtils.isEmpty(thoroughfare) || TextUtils.equals(thoroughfare, address2.getAdminArea())) {
                            String subLocality = address2.getSubLocality();
                            if (TextUtils.isEmpty(subLocality)) {
                                String locality2 = address2.getLocality();
                                if (TextUtils.isEmpty(locality2) || TextUtils.equals(locality2, str4)) {
                                    z10 = true;
                                    sb3 = null;
                                    if (TextUtils.isEmpty(str4)) {
                                        if (sb2.length() > 0) {
                                            sb2.append(", ");
                                        }
                                        sb2.append(str4);
                                        if (sb3 != null) {
                                            if (sb3.length() > 0) {
                                                sb3.append(", ");
                                            }
                                            sb3.append(str4);
                                        }
                                        z11 = false;
                                    } else {
                                        z11 = true;
                                    }
                                    boolean z15 = z10;
                                    countryName = address2.getCountryName();
                                    if (TextUtils.isEmpty(countryName)) {
                                        sb4 = sb3;
                                        z12 = z11;
                                        if (!"US".equals(address2.getCountryCode()) && !"AE".equals(address2.getCountryCode()) && (!"GB".equals(address2.getCountryCode()) || !"en".equals(locale.getLanguage()))) {
                                            hashSet5 = hashSet2;
                                            str5 = countryName;
                                            if (sb2.length() > 0) {
                                                sb2.append(", ");
                                            }
                                            sb2.append(str5);
                                            if (sb6.length() > 0) {
                                                sb6.append(", ");
                                            }
                                            sb6.append(countryName);
                                        }
                                        String[] split = countryName.split(" ");
                                        int length = split.length;
                                        hashSet5 = hashSet2;
                                        str5 = str3;
                                        int i23 = 0;
                                        while (i23 < length) {
                                            int i24 = i23;
                                            String str8 = split[i24];
                                            if (str8.length() > 0) {
                                                i14 = length;
                                                str5 = str5 + str8.charAt(0);
                                            } else {
                                                i14 = length;
                                            }
                                            i23 = i24 + 1;
                                            length = i14;
                                        }
                                        if (sb2.length() > 0) {
                                        }
                                        sb2.append(str5);
                                        if (sb6.length() > 0) {
                                        }
                                        sb6.append(countryName);
                                    } else {
                                        sb4 = sb3;
                                        hashSet5 = hashSet2;
                                        z12 = z11;
                                    }
                                    if (cVar2.e) {
                                        if (sb4 == null || sb4.length() <= 0) {
                                            sb5 = sb6;
                                            cVar = cVar2;
                                        } else {
                                            TLRPC.TL_messageMediaVenue tL_messageMediaVenue = new TLRPC.TL_messageMediaVenue();
                                            TLRPC.TL_geoPoint tL_geoPoint = new TLRPC.TL_geoPoint();
                                            tL_messageMediaVenue.geo = tL_geoPoint;
                                            tL_geoPoint.lat = latitude;
                                            tL_geoPoint._long = longitude;
                                            tL_messageMediaVenue.query_id = -1L;
                                            tL_messageMediaVenue.title = sb4.toString();
                                            tL_messageMediaVenue.icon = "pin";
                                            tL_messageMediaVenue.address = z15 ? gd.N0(2131747401, null) : gd.N0(2131747266, null);
                                            if (address != null) {
                                                TL_stories.TL_geoPointAddress tL_geoPointAddress = new TL_stories.TL_geoPointAddress();
                                                tL_messageMediaVenue.geoAddress = tL_geoPointAddress;
                                                tL_geoPointAddress.country_iso2 = address.getCountryCode();
                                                String locality3 = TextUtils.isEmpty(null) ? address.getLocality() : null;
                                                if (TextUtils.isEmpty(locality3)) {
                                                    locality3 = address.getAdminArea();
                                                }
                                                if (TextUtils.isEmpty(locality3)) {
                                                    locality3 = address.getSubAdminArea();
                                                }
                                                String adminArea = address.getAdminArea();
                                                StringBuilder sb7 = new StringBuilder();
                                                if (TextUtils.isEmpty(adminArea)) {
                                                    sb5 = sb6;
                                                    cVar = cVar2;
                                                } else {
                                                    sb5 = sb6;
                                                    TL_stories.TL_geoPointAddress tL_geoPointAddress2 = tL_messageMediaVenue.geoAddress;
                                                    tL_geoPointAddress2.state = adminArea;
                                                    cVar = cVar2;
                                                    try {
                                                        tL_geoPointAddress2.flags |= 1;
                                                    } catch (Exception unused4) {
                                                    }
                                                }
                                                if (!TextUtils.isEmpty(locality3)) {
                                                    TL_stories.TL_geoPointAddress tL_geoPointAddress3 = tL_messageMediaVenue.geoAddress;
                                                    tL_geoPointAddress3.city = locality3;
                                                    tL_geoPointAddress3.flags |= 2;
                                                }
                                                if (!z15) {
                                                    String thoroughfare2 = (!TextUtils.isEmpty(null) || TextUtils.equals(address.getThoroughfare(), str4) || TextUtils.equals(address.getThoroughfare(), address.getCountryName())) ? null : address.getThoroughfare();
                                                    if (TextUtils.isEmpty(thoroughfare2) && !TextUtils.equals(address.getSubLocality(), str4) && !TextUtils.equals(address.getSubLocality(), address.getCountryName())) {
                                                        thoroughfare2 = address.getSubLocality();
                                                    }
                                                    if (TextUtils.isEmpty(thoroughfare2) && !TextUtils.equals(address.getLocality(), str4) && !TextUtils.equals(address.getLocality(), address.getCountryName())) {
                                                        thoroughfare2 = address.getLocality();
                                                    }
                                                    if (TextUtils.isEmpty(thoroughfare2) || TextUtils.equals(thoroughfare2, adminArea) || TextUtils.equals(thoroughfare2, address.getCountryName())) {
                                                        sb7 = null;
                                                    } else {
                                                        if (sb7.length() > 0) {
                                                            sb7.append(", ");
                                                        }
                                                        sb7.append(thoroughfare2);
                                                    }
                                                    if (!TextUtils.isEmpty(sb7)) {
                                                        int i25 = 0;
                                                        while (true) {
                                                            String[] strArr = qd.Q;
                                                            if (i25 < 19) {
                                                                if (strArr[i25].equalsIgnoreCase(sb7.toString())) {
                                                                    z13 = true;
                                                                } else {
                                                                    i25++;
                                                                }
                                                            }
                                                        }
                                                    }
                                                    z13 = false;
                                                    if (!TextUtils.isEmpty(sb7)) {
                                                        TL_stories.TL_geoPointAddress tL_geoPointAddress4 = tL_messageMediaVenue.geoAddress;
                                                        tL_geoPointAddress4.flags |= 4;
                                                        tL_geoPointAddress4.street = sb7.toString();
                                                    }
                                                    if (!z13) {
                                                        arrayList.add(tL_messageMediaVenue);
                                                        if (arrayList.size() >= i10) {
                                                            org.telegram.messenger.g0.g3(new x0((Object) cVar, i7, str2, (Serializable) arrayList, 6));
                                                            break;
                                                        }
                                                    }
                                                }
                                            } else {
                                                sb5 = sb6;
                                                cVar = cVar2;
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
                                                TLRPC.TL_messageMediaVenue tL_messageMediaVenue2 = new TLRPC.TL_messageMediaVenue();
                                                TLRPC.TL_geoPoint tL_geoPoint2 = new TLRPC.TL_geoPoint();
                                                tL_messageMediaVenue2.geo = tL_geoPoint2;
                                                tL_geoPoint2.lat = latitude;
                                                tL_geoPoint2._long = longitude;
                                                tL_messageMediaVenue2.query_id = -1L;
                                                tL_messageMediaVenue2.title = sb2.toString();
                                                tL_messageMediaVenue2.icon = "city";
                                                tL_messageMediaVenue2.emoji = qd.b(address2.getCountryCode());
                                                hashSet3.add(tL_messageMediaVenue2.title);
                                                tL_messageMediaVenue2.address = gd.N0(2131747401, null);
                                                if (address != null) {
                                                    TL_stories.TL_geoPointAddress tL_geoPointAddress5 = new TL_stories.TL_geoPointAddress();
                                                    tL_messageMediaVenue2.geoAddress = tL_geoPointAddress5;
                                                    tL_geoPointAddress5.country_iso2 = address.getCountryCode();
                                                    String locality4 = TextUtils.isEmpty(null) ? address.getLocality() : null;
                                                    if (TextUtils.isEmpty(locality4)) {
                                                        locality4 = address.getAdminArea();
                                                    }
                                                    if (TextUtils.isEmpty(locality4)) {
                                                        locality4 = address.getSubAdminArea();
                                                    }
                                                    String adminArea2 = address.getAdminArea();
                                                    if (!TextUtils.isEmpty(adminArea2)) {
                                                        TL_stories.TL_geoPointAddress tL_geoPointAddress6 = tL_messageMediaVenue2.geoAddress;
                                                        tL_geoPointAddress6.state = adminArea2;
                                                        tL_geoPointAddress6.flags |= 1;
                                                    }
                                                    if (!TextUtils.isEmpty(locality4)) {
                                                        TL_stories.TL_geoPointAddress tL_geoPointAddress7 = tL_messageMediaVenue2.geoAddress;
                                                        tL_geoPointAddress7.city = locality4;
                                                        tL_geoPointAddress7.flags |= 2;
                                                    }
                                                }
                                                arrayList.add(tL_messageMediaVenue2);
                                                if (arrayList.size() >= i10) {
                                                    org.telegram.messenger.g0.g3(new x0((Object) cVar, i7, str2, (Serializable) arrayList, 6));
                                                }
                                            }
                                        }
                                        if (sb5.length() > 0) {
                                            hashSet4 = hashSet6;
                                            if (hashSet4.contains(sb5.toString())) {
                                                continue;
                                            } else {
                                                TLRPC.TL_messageMediaVenue tL_messageMediaVenue3 = new TLRPC.TL_messageMediaVenue();
                                                TLRPC.TL_geoPoint tL_geoPoint3 = new TLRPC.TL_geoPoint();
                                                tL_messageMediaVenue3.geo = tL_geoPoint3;
                                                tL_geoPoint3.lat = latitude;
                                                tL_geoPoint3._long = longitude;
                                                tL_messageMediaVenue3.query_id = -1L;
                                                tL_messageMediaVenue3.title = sb5.toString();
                                                tL_messageMediaVenue3.icon = "country";
                                                tL_messageMediaVenue3.emoji = qd.b(address2.getCountryCode());
                                                hashSet4.add(tL_messageMediaVenue3.title);
                                                tL_messageMediaVenue3.address = gd.N0(2131751742, null);
                                                if (address != null) {
                                                    TL_stories.TL_geoPointAddress tL_geoPointAddress8 = new TL_stories.TL_geoPointAddress();
                                                    tL_messageMediaVenue3.geoAddress = tL_geoPointAddress8;
                                                    tL_geoPointAddress8.country_iso2 = address.getCountryCode();
                                                }
                                                arrayList.add(tL_messageMediaVenue3);
                                                if (arrayList.size() >= i10) {
                                                    org.telegram.messenger.g0.g3(new x0((Object) cVar, i7, str2, (Serializable) arrayList, 6));
                                                }
                                            }
                                        } else {
                                            hashSet4 = hashSet6;
                                        }
                                    } else {
                                        StringBuilder sb8 = new StringBuilder();
                                        try {
                                            String addressLine = address2.getAddressLine(0);
                                            if (!TextUtils.isEmpty(addressLine)) {
                                                sb8.append(addressLine);
                                            }
                                        } catch (Exception unused5) {
                                        }
                                        if (sb8.length() > 0) {
                                            TLRPC.TL_messageMediaVenue tL_messageMediaVenue4 = new TLRPC.TL_messageMediaVenue();
                                            TLRPC.TL_geoPoint tL_geoPoint4 = new TLRPC.TL_geoPoint();
                                            tL_messageMediaVenue4.geo = tL_geoPoint4;
                                            tL_geoPoint4.lat = latitude;
                                            tL_geoPoint4._long = longitude;
                                            tL_messageMediaVenue4.query_id = -1L;
                                            tL_messageMediaVenue4.title = sb8.toString();
                                            tL_messageMediaVenue4.icon = "pin";
                                            tL_messageMediaVenue4.address = gd.N0(2131747408, null);
                                            arrayList.add(tL_messageMediaVenue4);
                                        }
                                        cVar = cVar2;
                                        hashSet4 = hashSet6;
                                        hashSet3 = hashSet5;
                                    }
                                } else {
                                    if (sb3.length() > 0) {
                                        sb3.append(", ");
                                    }
                                    sb3.append(locality2);
                                }
                            } else {
                                if (sb3.length() > 0) {
                                    sb3.append(", ");
                                }
                                sb3.append(subLocality);
                            }
                        } else {
                            if (sb3.length() > 0) {
                                sb3.append(", ");
                            }
                            sb3.append(thoroughfare);
                        }
                        z10 = false;
                        if (TextUtils.isEmpty(str4)) {
                        }
                        boolean z152 = z10;
                        countryName = address2.getCountryName();
                        if (TextUtils.isEmpty(countryName)) {
                        }
                        if (cVar2.e) {
                        }
                    } else {
                        locale = locale2;
                        str3 = str;
                        list = fromLocationName2;
                        i12 = i17;
                        cVar = cVar2;
                        i7 = i22;
                        str2 = str7;
                        list2 = fromLocationName;
                        hashSet3 = hashSet2;
                        i13 = i11;
                        hashSet4 = hashSet;
                    }
                    i11 = i13 + 1;
                    hashSet2 = hashSet3;
                    hashSet = hashSet4;
                    i17 = i12;
                    str = str3;
                    locale2 = locale;
                    fromLocationName2 = list;
                    i22 = i7;
                    str7 = str2;
                    fromLocationName = list2;
                    cVar2 = cVar;
                }
                cVar = cVar2;
                i7 = i22;
                str2 = str7;
                org.telegram.messenger.g0.g3(new x0((Object) cVar, i7, str2, (Serializable) arrayList, 6));
                break;
            case 4:
                final jg.h0 h0Var = (jg.h0) this.c;
                int i26 = this.b;
                ArrayList arrayList2 = (ArrayList) this.d;
                ArrayList arrayList3 = (ArrayList) this.e;
                ArrayList arrayList4 = (ArrayList) this.f;
                jg.z zVar = h0Var.k0;
                ArrayList arrayList5 = h0Var.w0;
                int i27 = h0Var.t0;
                h0Var.E0--;
                if (i26 == h0Var.e0) {
                    h0Var.g0 = i26;
                    if (h0Var.f0 != i26) {
                        zVar.b();
                    }
                    if (h0Var.h0 != i26) {
                        h0Var.J.clear();
                    }
                    h0Var.O = true;
                    int i28 = 0;
                    while (i28 < arrayList2.size()) {
                        if (!h0Var.F(arrayList2.get(i28))) {
                            arrayList2.remove(i28);
                            i28--;
                        }
                        i28++;
                    }
                    boolean z16 = true;
                    int size = arrayList5.size();
                    int i29 = 0;
                    while (i29 < arrayList2.size()) {
                        final Object obj2 = arrayList2.get(i29);
                        if (obj2 instanceof TLRPC.User) {
                            TLRPC.User user = (TLRPC.User) obj2;
                            j3 = j12;
                            mp.u1(i27).e4(user, z16, false);
                            j10 = user.id;
                        } else {
                            j3 = j12;
                            if (obj2 instanceof TLRPC.Chat) {
                                TLRPC.Chat chat = (TLRPC.Chat) obj2;
                                mp.u1(i27).X3(chat, z16);
                                j10 = -chat.id;
                            } else {
                                if (obj2 instanceof TLRPC.EncryptedChat) {
                                    mp.u1(i27).b4((TLRPC.EncryptedChat) obj2, z16);
                                }
                                j10 = j3;
                            }
                        }
                        if (j10 == j3 || ((TLRPC.Dialog) mp.u1(i27).R.f(j10)) != null) {
                            j11 = j10;
                        } else {
                            tr a02 = tr.a0(i27);
                            j11 = j10;
                            a02.a.c(new zq(a02, j11, new nr() { // from class: jg.y
                                @Override // org.telegram.messenger.nr
                                public final void a(int i30) {
                                    int i31 = h0.this.t0;
                                    if (i30 != -1) {
                                        TLRPC.TL_dialog tL_dialog = new TLRPC.TL_dialog();
                                        long j14 = j10;
                                        tL_dialog.id = j14;
                                        if (i30 != 0) {
                                            tL_dialog.folder_id = i30;
                                        }
                                        Object obj3 = obj2;
                                        if (obj3 instanceof TLRPC.Chat) {
                                            tL_dialog.flags = v3.T((TLRPC.Chat) obj3) ? 1 : 0;
                                        }
                                        mp.u1(i31).R.k(tL_dialog, j14);
                                        mp.u1(i31).y.add(tL_dialog);
                                        mp.u1(i31).f5(null);
                                    }
                                }
                            }, 1));
                        }
                        if (h0Var.R() && !(obj2 instanceof TLRPC.EncryptedChat)) {
                            lw lwVar = h0Var.V;
                            boolean z17 = lwVar != null && lwVar.a() == j11;
                            for (int i30 = 0; !z17 && i30 < size; i30++) {
                                jg.g0 g0Var = (jg.g0) arrayList5.get(i30);
                                if (g0Var != null && g0Var.c == j11) {
                                    z17 = true;
                                }
                            }
                            if (z17) {
                                arrayList2.remove(i29);
                                arrayList3.remove(i29);
                                i29--;
                            }
                        }
                        z16 = true;
                        i29++;
                        j12 = j3;
                    }
                    mp.u1(i27).f4(arrayList4, z16);
                    h0Var.s = arrayList2;
                    h0Var.H = arrayList3;
                    zVar.f(arrayList2, arrayList5);
                    h0Var.f();
                    lw lwVar2 = h0Var.V;
                    if (lwVar2 != null) {
                        lwVar2.d(h0Var.E0 > 0 ? z16 : false, z16);
                        h0Var.V.c();
                        break;
                    }
                }
                break;
            case 5:
                jg.s1 s1Var = (jg.s1) this.c;
                int i31 = this.b;
                ArrayList arrayList6 = (ArrayList) this.d;
                ArrayList arrayList7 = (ArrayList) this.e;
                ArrayList arrayList8 = (ArrayList) this.f;
                if (i31 == s1Var.F) {
                    s1Var.d = arrayList6;
                    s1Var.e = arrayList7;
                    s1Var.I = arrayList8;
                    s1Var.f.f(arrayList6, null);
                    s1Var.E = false;
                    s1Var.f();
                    s1Var.F();
                    break;
                }
                break;
            case 6:
                long[] jArr = (long[]) this.c;
                int i32 = this.b;
                p9 p9Var = (p9) this.d;
                p9 p9Var2 = (p9) this.e;
                TextView textView = (TextView) this.f;
                if (jArr[0] >= 0) {
                    TLRPC.User c22 = mp.u1(i32).c2(Long.valueOf(jArr[0]));
                    a9 a9Var = new a9((i6) null);
                    a9Var.r(c22);
                    p9Var.f(c22, a9Var);
                } else {
                    TLRPC.Chat O0 = mp.u1(i32).O0(Long.valueOf(-jArr[0]));
                    a9 a9Var2 = new a9((i6) null);
                    a9Var2.q(O0);
                    p9Var.f(O0, a9Var2);
                }
                if (jArr[0] >= 0) {
                    TLRPC.User c23 = mp.u1(i32).c2(Long.valueOf(jArr[0]));
                    if (p9Var2 != null) {
                        a9 a9Var3 = new a9((i6) null);
                        a9Var3.r(c23);
                        p9Var2.f(c23, a9Var3);
                    }
                    if (textView != null) {
                        textView.setText(n10.q(c23));
                        break;
                    }
                } else {
                    TLRPC.Chat O02 = mp.u1(i32).O0(Long.valueOf(-jArr[0]));
                    if (p9Var2 != null) {
                        a9 a9Var4 = new a9((i6) null);
                        a9Var4.q(O02);
                        p9Var2.f(O02, a9Var4);
                    }
                    if (textView != null) {
                        textView.setText(O02 != null ? O02.title : "");
                        break;
                    }
                }
                break;
            case 7:
                TLObject tLObject2 = (TLObject) this.c;
                boolean[] zArr = (boolean[]) this.d;
                w10 w10Var2 = (w10) this.e;
                int i33 = this.b;
                TL_account.updateEmojiStatus updateemojistatus = (TL_account.updateEmojiStatus) this.f;
                if (tLObject2 instanceof TLRPC.TL_boolTrue) {
                    TLRPC.User f11 = i10.i(i33).f();
                    if (f11 != null) {
                        f11.emoji_status = updateemojistatus.emoji_status;
                        ks.f(i33).k(ks.p5, f11);
                        mp.u1(i33).v5(f11.id, f11.emoji_status);
                    }
                    if (!zArr[0]) {
                        zArr[0] = true;
                        w10Var2.a(null);
                        break;
                    }
                } else if (!zArr[0]) {
                    zArr[0] = true;
                    w10Var2.a("SERVER_ERROR");
                    break;
                }
                break;
            case 8:
                l2.d1 d1Var = (l2.d1) this.c;
                Pair pair = (Pair) this.d;
                d1Var.b.h.I(((Integer) pair.first).intValue(), (x2.g0) pair.second, (x2.u) this.e, (x2.c0) this.f, this.b);
                break;
            case 9:
                ((VoIPService) this.c).lambda$startConferenceGroupCall$33((TLObject) this.d, this.b, (String) this.e, (TLRPC.TL_error) this.f);
                break;
            case 10:
                g4 g4Var2 = (g4) this.c;
                ArrayList arrayList9 = (ArrayList) this.d;
                HashMap hashMap = (HashMap) this.e;
                String str9 = (String) this.f;
                int i34 = this.b;
                ArrayList arrayList10 = new ArrayList();
                int size2 = arrayList9.size();
                int i35 = 0;
                while (i35 < size2) {
                    Object obj3 = arrayList9.get(i35);
                    TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) hashMap.get(obj3);
                    if (obj3 instanceof TL_iv.RichText) {
                        TL_iv.RichText richText = (TL_iv.RichText) obj3;
                        TLRPC.WebPage webPage = g4Var2.v0[i18].c.F;
                        int i36 = i35;
                        g4Var = g4Var2;
                        i15 = i36;
                        i16 = i18;
                        obj = obj3;
                        CharSequence A = g4.A(g4Var, webPage, null, richText, richText, pageBlock, 1000);
                        if (!TextUtils.isEmpty(A)) {
                            lowerCase = A.toString().toLowerCase();
                        }
                        lowerCase = null;
                    } else {
                        int i37 = i35;
                        g4Var = g4Var2;
                        i15 = i37;
                        i16 = i18;
                        obj = obj3;
                        if (obj instanceof String) {
                            lowerCase = ((String) obj).toLowerCase();
                        }
                        lowerCase = null;
                    }
                    if (lowerCase != null) {
                        int i38 = i16;
                        while (true) {
                            int indexOf = lowerCase.indexOf(str9, i38);
                            if (indexOf >= 0) {
                                int length2 = str9.length() + indexOf;
                                if (indexOf == 0 || org.telegram.messenger.g0.K1(lowerCase.charAt(indexOf - 1))) {
                                    org.telegram.ui.p3 p3Var2 = new org.telegram.ui.p3();
                                    p3Var2.a = indexOf;
                                    p3Var2.c = pageBlock;
                                    p3Var2.b = obj;
                                    arrayList10.add(p3Var2);
                                }
                                i38 = length2;
                            }
                        }
                    }
                    g4 g4Var3 = g4Var;
                    i35 = i15 + 1;
                    g4Var2 = g4Var3;
                    i18 = i16;
                }
                org.telegram.messenger.g0.g3(new x0(g4Var2, i34, arrayList10, str9, 16));
                break;
            case 11:
                a();
                break;
            case 12:
                bn.i0((bn) this.c, this.b, (Boolean) this.d, (TLRPC.WebPage) this.e, (TL_account.getWebPagePreview) this.f);
                break;
            case 13:
                mm mmVar = (mm) this.c;
                hi hiVar = (hi) this.d;
                hiVar.b = mmVar.a.getMessagesController().t0(-((TLRPC.Chat) this.e).id, this.b, new hm(mmVar, hiVar, (bn) this.f));
                break;
            case 14:
                mm mmVar2 = (mm) this.c;
                int i39 = this.b;
                fj fjVar = (fj) this.d;
                Integer num = (Integer) this.e;
                byte[] bArr = (byte[]) this.f;
                bn bnVar = mmVar2.a;
                bnVar.Bb(i39, fjVar.e1(), true, fj.B0(fjVar.k) == bnVar.d7 ? 1 : 0, true, 0, num, bArr, new wl(mmVar2, fjVar, 1));
                break;
            case 15:
                b();
                break;
            case 16:
                c();
                break;
            case 17:
                d();
                break;
            case 18:
                f();
                break;
            case 19:
                g();
                break;
            case 20:
                h();
                break;
            case 21:
                i();
                break;
            case 22:
                j();
                break;
            case 23:
                k();
                break;
            case 24:
                l();
                break;
            case 25:
                m();
                break;
            case 26:
                n();
                break;
            default:
                tg.i2 i2Var = (tg.i2) this.c;
                int i40 = this.b;
                List list3 = (List) this.d;
                ArrayList arrayList11 = (ArrayList) this.e;
                pn0 pn0Var = (pn0) this.f;
                if (i2Var.J != null && !i2Var.E) {
                    Matrix matrix = new Matrix();
                    matrix.postScale(1.0f / i2Var.J.getWidth(), 1.0f / i2Var.J.getHeight());
                    matrix.postTranslate(-0.5f, -0.5f);
                    matrix.postRotate(i40);
                    matrix.postTranslate(0.5f, 0.5f);
                    if ((i40 / 90) % 2 != 0) {
                        matrix.postScale(i2Var.J.getHeight(), i2Var.J.getWidth());
                    } else {
                        matrix.postScale(i2Var.J.getWidth(), i2Var.J.getHeight());
                    }
                    if (list3.isEmpty()) {
                        tg.f2 f2Var = new tg.f2(i2Var);
                        f2Var.h.set(0.0f, 0.0f, i2Var.J.getWidth(), i2Var.J.getHeight());
                        f2Var.i.set(f2Var.h);
                        matrix.mapRect(f2Var.i);
                        f2Var.c = i40;
                        Bitmap d = i2Var.d(0, 0, i2Var.J, false);
                        f2Var.d = d;
                        if (d == null) {
                            a8.g(new RuntimeException("createSmoothEdgesSegmentedImage failed on empty image"), true);
                            break;
                        } else {
                            f2Var.f = f2Var.c();
                            tg.i2.c(f2Var, i2Var.U, i2Var.V);
                            i2Var.P = f2Var.j;
                            i2Var.Q = f2Var.k;
                            arrayList11.add(f2Var);
                            org.telegram.messenger.g0.g3(new p4.l0(i2Var, arrayList11, pn0Var, f2Var));
                            i2Var.F = f2Var;
                            i2Var.E = true;
                            i2Var.y = false;
                            break;
                        }
                    } else {
                        for (int i41 = 0; i41 < list3.size(); i41++) {
                            tg.h2 h2Var = (tg.h2) list3.get(i41);
                            tg.f2 f2Var2 = new tg.f2(i2Var);
                            f2Var2.h.set(h2Var.b, h2Var.c, r13 + h2Var.d, r15 + h2Var.e);
                            f2Var2.i.set(f2Var2.h);
                            matrix.mapRect(f2Var2.i);
                            f2Var2.c = i40;
                            Bitmap d2 = i2Var.d(h2Var.b, h2Var.c, h2Var.a, false);
                            f2Var2.d = d2;
                            if (d2 != null) {
                                f2Var2.f = f2Var2.c();
                                tg.i2.c(f2Var2, i2Var.U, i2Var.V);
                                i2Var.P = f2Var2.j;
                                i2Var.Q = f2Var2.k;
                                arrayList11.add(f2Var2);
                            }
                        }
                        i2Var.F = null;
                        i2Var.E = true;
                        i2Var.y = false;
                        org.telegram.messenger.g0.g3(new org.telegram.ui.web.t1(18, i2Var, arrayList11));
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ d1(Object obj, int i7, Object obj2, Object obj3, Object obj4, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = i7;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
    }

    public /* synthetic */ d1(Object obj, Object obj2, int i7, Object obj3, Object obj4, int i10) {
        this.a = i10;
        this.c = obj;
        this.d = obj2;
        this.b = i7;
        this.e = obj3;
        this.f = obj4;
    }

    public /* synthetic */ d1(Object obj, Object obj2, Object obj3, int i7, Object obj4, int i10) {
        this.a = i10;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = i7;
        this.f = obj4;
    }

    public /* synthetic */ d1(Object obj, Object obj2, Object obj3, Object obj4, int i7, int i10) {
        this.a = i10;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
        this.b = i7;
    }

    public /* synthetic */ d1(xr xrVar, TLObject tLObject, TLRPC.InputPeer inputPeer, int i7, int[] iArr) {
        this.a = 18;
        this.d = xrVar;
        this.e = tLObject;
        this.f = inputPeer;
        this.b = i7;
        this.c = iArr;
    }

    public /* synthetic */ d1(org.telegram.ui.ActionBar.t1[] t1VarArr, int[] iArr, int i7, Runnable runnable, org.telegram.ui.ActionBar.g2 g2Var) {
        this.a = 17;
        this.d = t1VarArr;
        this.c = iArr;
        this.b = i7;
        this.e = runnable;
        this.f = g2Var;
    }
}
