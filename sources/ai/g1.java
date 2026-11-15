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
import bi.b3;
import di.u8;
import hi.sa;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import org.telegram.messenger.a8;
import org.telegram.messenger.ar;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.gj;
import org.telegram.messenger.hd;
import org.telegram.messenger.k5;
import org.telegram.messenger.m10;
import org.telegram.messenger.np;
import org.telegram.messenger.ns;
import org.telegram.messenger.pr;
import org.telegram.messenger.q10;
import org.telegram.messenger.rd;
import org.telegram.messenger.so;
import org.telegram.messenger.t3;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.messenger.vr;
import org.telegram.messenger.w7;
import org.telegram.messenger.z10;
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
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.Components.RLottieNative;
import org.telegram.ui.Components.au0;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.i9;
import org.telegram.ui.Components.rr;
import org.telegram.ui.Components.t8;
import org.telegram.ui.Components.yt0;
import org.telegram.ui.Components.zt0;
import org.telegram.ui.Components.zz;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.SecretMediaViewer;
import org.telegram.ui.an;
import org.telegram.ui.c40;
import org.telegram.ui.g4;
import org.telegram.ui.g50;
import org.telegram.ui.gm;
import org.telegram.ui.hi;
import org.telegram.ui.je0;
import org.telegram.ui.jw;
import org.telegram.ui.kd0;
import org.telegram.ui.lm;
import org.telegram.ui.ln0;
import org.telegram.ui.p3;
import org.telegram.ui.q90;
import org.telegram.ui.vl;
import org.telegram.ui.yw;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class g1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ g1(int i7, Object obj, Object obj2, Object obj3, Object obj4, int i10) {
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
        org.telegram.ui.ActionBar.e2 e2Var = (org.telegram.ui.ActionBar.e2) this.f;
        boolean z10 = tLObject instanceof TLRPC.Updates;
        int i7 = this.b;
        if (!z10) {
            if (!(tLObject instanceof TL_phone.groupCall)) {
                if (tL_error != null) {
                    cc.a0(e2Var).f0(tL_error, false);
                    return;
                }
                return;
            }
            TL_phone.groupCall groupcall = (TL_phone.groupCall) tLObject;
            np.s1(i7).Y3(groupcall.users, false);
            np.s1(i7).S3(groupcall.chats, false);
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
        np.s1(i7).Y3(updates.users, false);
        np.s1(i7).S3(updates.chats, false);
        ArrayList z02 = np.z0(updates, TL_update.TL_updateGroupCall.class);
        int size = z02.size();
        TLRPC.GroupCall groupCall2 = null;
        int i10 = 0;
        while (i10 < size) {
            Object obj = z02.get(i10);
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
        org.telegram.ui.ActionBar.e2 Q;
        TLRPC.Chat chat = (TLRPC.Chat) this.c;
        ArrayList arrayList = (ArrayList) this.d;
        ArrayList arrayList2 = (ArrayList) this.e;
        ArrayList arrayList3 = (ArrayList) this.f;
        if (!LaunchActivity.E1 || (Q = LaunchActivity.Q()) == null || Q.getParentActivity() == null) {
            return;
        }
        ug.j0 j0Var = new ug.j0(11, this.b, Q.getParentActivity(), Q, null);
        j0Var.C1(chat, arrayList, arrayList2, arrayList3, null);
        j0Var.show();
    }

    private final void c() {
        SharedPreferences sharedPreferences = (SharedPreferences) this.c;
        TLRPC.TL_help_support tL_help_support = (TLRPC.TL_help_support) this.d;
        org.telegram.ui.ActionBar.t1 t1Var = (org.telegram.ui.ActionBar.t1) this.e;
        org.telegram.ui.ActionBar.e2 e2Var = (org.telegram.ui.ActionBar.e2) this.f;
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
        vr.a0(i7).m1(arrayList, null, true, true);
        np.s1(i7).X3(tL_help_support.user, false, false);
        Bundle bundle = new Bundle();
        bundle.putLong("user_id", tL_help_support.user.id);
        e2Var.presentFragment(new an(bundle));
    }

    private final void d() {
        org.telegram.ui.ActionBar.t1[] t1VarArr = (org.telegram.ui.ActionBar.t1[]) this.d;
        int[] iArr = (int[]) this.c;
        Runnable runnable = (Runnable) this.e;
        org.telegram.ui.ActionBar.e2 e2Var = (org.telegram.ui.ActionBar.e2) this.f;
        org.telegram.ui.ActionBar.t1 t1Var = t1VarArr[0];
        if (t1Var == null) {
            return;
        }
        t1Var.setOnCancelListener(new org.telegram.ui.Components.m1(iArr, this.b, runnable));
        e2Var.showDialog(t1VarArr[0]);
    }

    private final void f() {
        rr.d1((rr) this.d, (TLObject) this.e, (TLRPC.InputPeer) this.f, this.b, (int[]) this.c);
    }

    private final void g() {
        int i7;
        int i10;
        au0 au0Var = (au0) this.c;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) this.d;
        gj gjVar = (gj) this.e;
        org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) this.f;
        int[] iArr = au0Var.e;
        RLottieNative[] rLottieNativeArr = au0Var.g1;
        if (au0Var.X0) {
            org.telegram.messenger.g0.h3(new yt0(au0Var, 2));
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
                    w7.G(m10.t0);
                    String y22 = org.telegram.messenger.g0.y2(w7.J(document, null, true, true), 0);
                    if (TextUtils.isEmpty(y22)) {
                        org.telegram.messenger.g0.h3(new zt0(document, i7, gjVar, q1Var, tL_messages_stickerSet, 1));
                        z10 = true;
                    } else {
                        rLottieNativeArr[i11] = RLottieNative.b(y22, iArr, null, null);
                        au0Var.h1[i11] = iArr[0];
                    }
                }
            }
            i11++;
        }
        if (z10) {
            org.telegram.messenger.g0.h3(new yt0(au0Var, 3));
        } else {
            org.telegram.messenger.g0.h3(new org.telegram.ui.f0(au0Var, i7, q1Var, 23));
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
                Iterator it = np.s1(i7).Y3.iterator();
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
                    Iterator it2 = np.s1(i7).X3.iterator();
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
            } else if (PhotoViewer.A1() && PhotoViewer.p1().P1()) {
                PhotoViewer.p1().z0(false, true);
            } else if (g4.G() && g4.v().W) {
                g4.v().m(false, true);
            }
            sa.w();
            c40 c40Var = c40.C5;
            if (c40Var != null) {
                c40Var.dismiss();
            }
            if (org.telegram.messenger.g0.Q1()) {
                launchActivity.p0.X(true, true);
                launchActivity.r0.X(true, true);
            }
            yw ywVar = new yw(k10);
            ywVar.E2 = launchActivity;
            ((ActionBarLayout) launchActivity.M()).V(ywVar, !org.telegram.messenger.g0.Q1() ? launchActivity.p0.getFragmentStack().size() <= 1 || !(launchActivity.p0.getFragmentStack().get(launchActivity.p0.getFragmentStack().size() - 1) instanceof je0) : launchActivity.q0.getFragmentStack().isEmpty() || !(launchActivity.q0.getFragmentStack().get(launchActivity.q0.getFragmentStack().size() - 1) instanceof je0), false);
        }
        try {
            t1Var.dismiss();
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    private final void i() {
        LaunchActivity launchActivity = (LaunchActivity) this.c;
        g50 g50Var = (g50) this.d;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) this.e;
        TLRPC.Updates updates = (TLRPC.Updates) this.f;
        ArrayList arrayList = launchActivity.e0;
        if (launchActivity.isFinishing()) {
            return;
        }
        try {
            g50Var.run();
        } catch (Exception e10) {
            a8.g(e10, true);
        }
        if (tL_error != null) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(launchActivity);
            String M0 = hd.M0(R.string.AppName, null);
            org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
            t1Var.S = M0;
            if (tL_error.text.startsWith("FLOOD_WAIT")) {
                t1Var.U = hd.M0(2131750687, null);
            } else if (tL_error.text.equals("USERS_TOO_MUCH")) {
                t1Var.U = hd.M0(2131749076, null);
            } else {
                t1Var.U = hd.M0(2131749075, null);
            }
            alertDialog$Builder.k(hd.M0(2131747831, null), null);
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
        np.s1(i7).Y3(updates.users, false);
        np.s1(i7).S3(updates.chats, false);
        Bundle bundle = new Bundle();
        bundle.putLong("chat_id", chat.id);
        if (arrayList.isEmpty() || np.s1(i7).E(bundle, (org.telegram.ui.ActionBar.e2) i5.c.h(1, arrayList), null, null)) {
            an anVar = new an(bundle);
            ns.f(i7).k(ns.t, new Object[0]);
            ((ActionBarLayout) launchActivity.M()).V(anVar, false, true);
        }
    }

    private final void j() {
        cc a02;
        ArrayList<TLRPC.User> arrayList;
        ArrayList<TLRPC.Chat> arrayList2;
        LaunchActivity launchActivity = (LaunchActivity) this.c;
        TLObject tLObject = (TLObject) this.d;
        String str = (String) this.e;
        g50 g50Var = (g50) this.f;
        org.telegram.ui.ActionBar.e2 e2Var = (org.telegram.ui.ActionBar.e2) i5.c.h(1, launchActivity.e0);
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
                np.s1(i7).S3(arrayList2, false);
                np.s1(i7).Y3(arrayList, false);
                if (!z10 || !((TL_chatlists.TL_chatlists_chatlistInvite) chatlist_chatlistinvite).peers.isEmpty()) {
                    zz zzVar = new zz(e2Var, false);
                    zzVar.U1 = -1;
                    zzVar.Y1 = "";
                    zzVar.Z1 = new ArrayList();
                    zzVar.b2 = "";
                    zzVar.d2 = new ArrayList();
                    ArrayList arrayList3 = new ArrayList();
                    zzVar.e2 = arrayList3;
                    zzVar.v2 = -1;
                    zzVar.y2 = -5;
                    zzVar.T1 = str;
                    zzVar.V1 = chatlist_chatlistinvite;
                    arrayList3.clear();
                    if (z10) {
                        TL_chatlists.TL_chatlists_chatlistInvite tL_chatlists_chatlistInvite2 = (TL_chatlists.TL_chatlists_chatlistInvite) chatlist_chatlistinvite;
                        TLRPC.TL_textWithEntities tL_textWithEntities = tL_chatlists_chatlistInvite2.title;
                        zzVar.Y1 = tL_textWithEntities.text;
                        zzVar.Z1 = tL_textWithEntities.entities;
                        zzVar.a2 = tL_chatlists_chatlistInvite2.title_noanimate;
                        zzVar.c2 = tL_chatlists_chatlistInvite2.peers;
                    } else if (chatlist_chatlistinvite instanceof TL_chatlists.TL_chatlists_chatlistInviteAlready) {
                        TL_chatlists.TL_chatlists_chatlistInviteAlready tL_chatlists_chatlistInviteAlready2 = (TL_chatlists.TL_chatlists_chatlistInviteAlready) chatlist_chatlistinvite;
                        zzVar.c2 = tL_chatlists_chatlistInviteAlready2.missing_peers;
                        zzVar.f2 = tL_chatlists_chatlistInviteAlready2.already_peers;
                        zzVar.U1 = tL_chatlists_chatlistInviteAlready2.filter_id;
                        ArrayList arrayList4 = e2Var.getMessagesController().Q0;
                        if (arrayList4 != null) {
                            while (true) {
                                if (i10 >= arrayList4.size()) {
                                    break;
                                }
                                so soVar = (so) arrayList4.get(i10);
                                if (soVar.a == zzVar.U1) {
                                    zzVar.Y1 = soVar.b;
                                    zzVar.Z1 = soVar.c;
                                    zzVar.a2 = soVar.n;
                                    break;
                                }
                                i10++;
                            }
                        }
                    }
                    zzVar.f1();
                    e2Var.showDialog(zzVar);
                    g50Var.run();
                    return;
                }
                a02 = cc.a0(e2Var);
            } else {
                a02 = cc.a0(e2Var);
            }
            g50Var.run();
            return;
        } catch (Exception e10) {
            a8.g(e10, true);
            return;
        }
        k5.o(null, 2131748209, a02, null);
    }

    private final void k() {
        ((q90) this.c).v((String) this.d, this.b + 1, (String) this.e, (String) this.f);
    }

    private final void l() {
        kd0 kd0Var = (kd0) this.c;
        String str = (String) this.d;
        String str2 = (String) this.e;
        String str3 = (String) this.f;
        ArrayList arrayList = new ArrayList();
        f5.a aVar = new f5.a();
        aVar.c = "inapp";
        aVar.b = str;
        arrayList.add(aVar.a());
        a8.b("LoginBilling querying \"" + str + "\" product");
        org.telegram.messenger.r1.i().o(arrayList, new b3(kd0Var, str, str2, str3, this.b));
    }

    private final void m() {
        int[] iArr = (int[]) this.c;
        t8 t8Var = (t8) this.d;
        TLRPC.User user = (TLRPC.User) this.e;
        i9 i9Var = (i9) this.f;
        iArr[0] = this.b;
        t8Var.r(user);
        i9Var.f(user, t8Var);
    }

    private final void n() {
        p4.m0 m0Var = (p4.m0) this.c;
        p4.i1 i1Var = (p4.i1) this.d;
        q4.r rVar = (q4.r) this.e;
        p4.l0 l0Var = (p4.l0) this.f;
        ab.c0 c0Var = m0Var.g;
        if (m0Var.h.j()) {
            return;
        }
        boolean isActive = ((q4.l) m0Var.n.b).a.isActive();
        int i7 = this.b;
        if (!isActive) {
            StringBuilder sb2 = new StringBuilder("Ignore incoming session command before initialization. command=");
            sb2.append(i1Var == null ? Integer.valueOf(i7) : i1Var.b);
            sb2.append(", pid=");
            sb2.append(rVar.a.b);
            h2.a.l("MediaSessionLegacyStub", sb2.toString());
            return;
        }
        p4.v m0 = m0Var.m0(rVar);
        if (i1Var != null) {
            if (!c0Var.C(m0, i1Var)) {
                return;
            }
        } else if (!c0Var.A(m0, i7)) {
            return;
        }
        try {
            l0Var.f(m0);
        } catch (RemoteException e10) {
            h2.a.m("MediaSessionLegacyStub", "Exception in " + m0, e10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:268:0x068f A[Catch: Exception -> 0x0616, TryCatch #2 {Exception -> 0x0616, blocks: (B:247:0x05ea, B:249:0x060d, B:252:0x061c, B:254:0x0626, B:255:0x0629, B:259:0x0639, B:261:0x0643, B:263:0x0649, B:264:0x064c, B:266:0x0689, B:268:0x068f, B:270:0x0695, B:271:0x0698, B:273:0x069d, B:275:0x06a3, B:276:0x06a6, B:279:0x06af, B:281:0x06b9, B:283:0x06c9, B:285:0x06d5, B:287:0x06e1, B:291:0x072a, B:293:0x0730, B:294:0x0733, B:296:0x073c, B:297:0x073f, B:298:0x0749, B:448:0x06f2, B:450:0x0702, B:452:0x070c, B:454:0x0725, B:460:0x0653, B:462:0x065d, B:464:0x0663, B:465:0x0666, B:466:0x066a, B:468:0x0674, B:470:0x067a, B:472:0x0680, B:473:0x0683), top: B:246:0x05ea }] */
    /* JADX WARN: Removed duplicated region for block: B:281:0x06b9 A[Catch: Exception -> 0x0616, TryCatch #2 {Exception -> 0x0616, blocks: (B:247:0x05ea, B:249:0x060d, B:252:0x061c, B:254:0x0626, B:255:0x0629, B:259:0x0639, B:261:0x0643, B:263:0x0649, B:264:0x064c, B:266:0x0689, B:268:0x068f, B:270:0x0695, B:271:0x0698, B:273:0x069d, B:275:0x06a3, B:276:0x06a6, B:279:0x06af, B:281:0x06b9, B:283:0x06c9, B:285:0x06d5, B:287:0x06e1, B:291:0x072a, B:293:0x0730, B:294:0x0733, B:296:0x073c, B:297:0x073f, B:298:0x0749, B:448:0x06f2, B:450:0x0702, B:452:0x070c, B:454:0x0725, B:460:0x0653, B:462:0x065d, B:464:0x0663, B:465:0x0666, B:466:0x066a, B:468:0x0674, B:470:0x067a, B:472:0x0680, B:473:0x0683), top: B:246:0x05ea }] */
    /* JADX WARN: Removed duplicated region for block: B:293:0x0730 A[Catch: Exception -> 0x0616, TryCatch #2 {Exception -> 0x0616, blocks: (B:247:0x05ea, B:249:0x060d, B:252:0x061c, B:254:0x0626, B:255:0x0629, B:259:0x0639, B:261:0x0643, B:263:0x0649, B:264:0x064c, B:266:0x0689, B:268:0x068f, B:270:0x0695, B:271:0x0698, B:273:0x069d, B:275:0x06a3, B:276:0x06a6, B:279:0x06af, B:281:0x06b9, B:283:0x06c9, B:285:0x06d5, B:287:0x06e1, B:291:0x072a, B:293:0x0730, B:294:0x0733, B:296:0x073c, B:297:0x073f, B:298:0x0749, B:448:0x06f2, B:450:0x0702, B:452:0x070c, B:454:0x0725, B:460:0x0653, B:462:0x065d, B:464:0x0663, B:465:0x0666, B:466:0x066a, B:468:0x0674, B:470:0x067a, B:472:0x0680, B:473:0x0683), top: B:246:0x05ea }] */
    /* JADX WARN: Removed duplicated region for block: B:296:0x073c A[Catch: Exception -> 0x0616, TryCatch #2 {Exception -> 0x0616, blocks: (B:247:0x05ea, B:249:0x060d, B:252:0x061c, B:254:0x0626, B:255:0x0629, B:259:0x0639, B:261:0x0643, B:263:0x0649, B:264:0x064c, B:266:0x0689, B:268:0x068f, B:270:0x0695, B:271:0x0698, B:273:0x069d, B:275:0x06a3, B:276:0x06a6, B:279:0x06af, B:281:0x06b9, B:283:0x06c9, B:285:0x06d5, B:287:0x06e1, B:291:0x072a, B:293:0x0730, B:294:0x0733, B:296:0x073c, B:297:0x073f, B:298:0x0749, B:448:0x06f2, B:450:0x0702, B:452:0x070c, B:454:0x0725, B:460:0x0653, B:462:0x065d, B:464:0x0663, B:465:0x0666, B:466:0x066a, B:468:0x0674, B:470:0x067a, B:472:0x0680, B:473:0x0683), top: B:246:0x05ea }] */
    /* JADX WARN: Removed duplicated region for block: B:301:0x07a0  */
    /* JADX WARN: Removed duplicated region for block: B:373:0x0909 A[Catch: Exception -> 0x0a41, TryCatch #4 {Exception -> 0x0a41, blocks: (B:323:0x0821, B:324:0x082e, B:326:0x0834, B:328:0x0840, B:330:0x0848, B:332:0x0852, B:334:0x0860, B:335:0x0866, B:337:0x086c, B:339:0x0876, B:341:0x0884, B:342:0x0888, B:344:0x088e, B:346:0x0898, B:348:0x08a6, B:349:0x08aa, B:351:0x08b0, B:353:0x08b6, B:355:0x08c0, B:357:0x08c6, B:358:0x08c9, B:359:0x08ce, B:362:0x08d5, B:364:0x08db, B:369:0x08ed, B:371:0x08f3, B:373:0x0909, B:380:0x091a, B:382:0x0926, B:384:0x095f, B:386:0x0974, B:387:0x097a, B:389:0x0980, B:390:0x0984, B:392:0x098a, B:393:0x098e, B:395:0x0998, B:396:0x09a4, B:398:0x09aa, B:400:0x09b4, B:404:0x09c1, B:406:0x09c7, B:408:0x09d3, B:410:0x0a0c, B:411:0x0a19, B:366:0x08e9), top: B:322:0x0821 }] */
    /* JADX WARN: Removed duplicated region for block: B:432:0x0753 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:458:0x0743  */
    /* JADX WARN: Removed duplicated region for block: B:459:0x06ad  */
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
        HashSet hashSet3;
        List<Address> list2;
        HashSet hashSet4;
        int i12;
        double longitude;
        StringBuilder sb2;
        StringBuilder sb3;
        StringBuilder sb4;
        Address address;
        String str4;
        String thoroughfare;
        HashSet hashSet5;
        boolean z10;
        boolean z11;
        String countryName;
        HashSet hashSet6;
        StringBuilder sb5;
        boolean z12;
        StringBuilder sb6;
        boolean z13;
        String str5;
        int i13;
        long j3;
        final long j10;
        long j11;
        int i14;
        Object obj;
        String lowerCase;
        str = "";
        long j12 = 0;
        int i15 = 0;
        switch (this.a) {
            case 0:
                int i16 = this.b;
                int[] iArr = (int[]) this.c;
                h1 h1Var = (h1) this.d;
                w7 w7Var = (w7) this.e;
                TLRPC.Document document = (TLRPC.Document) this.f;
                ns f10 = ns.f(i16);
                while (i15 < 3) {
                    f10.b(h1Var, iArr[i15]);
                    i15++;
                }
                w7Var.W(document, "speech_model", 3, 1);
                break;
            case 1:
                bi.s2 s2Var = (bi.s2) this.c;
                Context context = (Context) this.d;
                int i17 = this.b;
                TL_stars.StarGift starGift = (TL_stars.StarGift) this.e;
                z10 z10Var = (z10) this.f;
                long j13 = s2Var.X1;
                bi.k1 k1Var = new bi.k1(s2Var, z10Var, 1);
                boolean z14 = starGift.limited;
                new bi.t1(s2Var, context, i17, starGift, j13, k1Var, z14 && (disallowedGiftsSettings2 = s2Var.W1) != null && disallowedGiftsSettings2.disallow_limited_stargifts, z14 && (disallowedGiftsSettings = s2Var.W1) != null && disallowedGiftsSettings.disallow_unique_stargifts).show();
                break;
            case 2:
                hi.d dVar = (hi.d) this.c;
                org.telegram.ui.ActionBar.u2[] u2VarArr = (org.telegram.ui.ActionBar.u2[]) this.d;
                int i18 = this.b;
                TLObject tLObject = (TLObject) this.e;
                String str6 = (String) this.f;
                dVar.setLoading(false);
                org.telegram.ui.ActionBar.u2 u2Var = u2VarArr[0];
                if (u2Var != null) {
                    u2Var.dismiss();
                }
                u8.y(i18, false).R();
                org.telegram.ui.ActionBar.e2 T = LaunchActivity.T();
                if (T != null) {
                    cc.a0(T).V(Collections.singletonList(tLObject), hd.M0(2131744979, null), org.telegram.messenger.g0.X2(hd.a0(null, null, 2131744978, str6)), null).k(false);
                    break;
                }
                break;
            case 3:
                jg.c cVar2 = (jg.c) this.c;
                Locale locale2 = (Locale) this.d;
                String str7 = (String) this.e;
                Locale locale3 = (Locale) this.f;
                int i19 = this.b;
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
                        locale = locale2;
                        String str8 = str;
                        double latitude = address2.getLatitude();
                        i7 = i19;
                        str2 = str7;
                        try {
                            longitude = address2.getLongitude();
                            list = fromLocationName2;
                            sb2 = new StringBuilder();
                            list2 = fromLocationName;
                            sb3 = new StringBuilder();
                            i12 = i11;
                            sb4 = new StringBuilder();
                            String locality = address2.getLocality();
                            if (TextUtils.isEmpty(locality)) {
                                locality = address2.getAdminArea();
                            }
                            address = address3;
                            str4 = locality;
                            if (address != null && TextUtils.isEmpty(address.getLocality())) {
                                address.getAdminArea();
                            }
                            str3 = str8;
                            thoroughfare = address2.getThoroughfare();
                        } catch (Exception unused2) {
                            cVar = cVar2;
                        }
                        if (TextUtils.isEmpty(thoroughfare)) {
                            hashSet5 = hashSet;
                        } else {
                            hashSet5 = hashSet;
                            if (!TextUtils.equals(thoroughfare, address2.getAdminArea())) {
                                if (sb4.length() > 0) {
                                    sb4.append(", ");
                                }
                                sb4.append(thoroughfare);
                                z10 = false;
                                if (TextUtils.isEmpty(str4)) {
                                    z11 = true;
                                } else {
                                    if (sb3.length() > 0) {
                                        sb3.append(", ");
                                    }
                                    sb3.append(str4);
                                    if (sb4 != null) {
                                        if (sb4.length() > 0) {
                                            sb4.append(", ");
                                        }
                                        sb4.append(str4);
                                    }
                                    z11 = false;
                                }
                                boolean z15 = z10;
                                countryName = address2.getCountryName();
                                if (TextUtils.isEmpty(countryName)) {
                                    hashSet6 = hashSet2;
                                    sb5 = sb4;
                                    z12 = z11;
                                } else {
                                    sb5 = sb4;
                                    z12 = z11;
                                    if (!"US".equals(address2.getCountryCode()) && !"AE".equals(address2.getCountryCode()) && (!"GB".equals(address2.getCountryCode()) || !"en".equals(locale.getLanguage()))) {
                                        hashSet6 = hashSet2;
                                        str5 = countryName;
                                        if (sb3.length() > 0) {
                                            sb3.append(", ");
                                        }
                                        sb3.append(str5);
                                        if (sb2.length() > 0) {
                                            sb2.append(", ");
                                        }
                                        sb2.append(countryName);
                                    }
                                    String[] split = countryName.split(" ");
                                    int length = split.length;
                                    hashSet6 = hashSet2;
                                    str5 = str3;
                                    int i20 = 0;
                                    while (i20 < length) {
                                        int i21 = i20;
                                        String str9 = split[i21];
                                        if (str9.length() > 0) {
                                            i13 = length;
                                            str5 = str5 + str9.charAt(0);
                                        } else {
                                            i13 = length;
                                        }
                                        i20 = i21 + 1;
                                        length = i13;
                                    }
                                    if (sb3.length() > 0) {
                                    }
                                    sb3.append(str5);
                                    if (sb2.length() > 0) {
                                    }
                                    sb2.append(countryName);
                                }
                                jg.c cVar3 = cVar2;
                                if (cVar2.e) {
                                    try {
                                        StringBuilder sb7 = new StringBuilder();
                                        try {
                                            String addressLine = address2.getAddressLine(0);
                                            if (!TextUtils.isEmpty(addressLine)) {
                                                sb7.append(addressLine);
                                            }
                                        } catch (Exception unused3) {
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
                                            tL_messageMediaVenue.address = hd.M0(2131747602, null);
                                            arrayList.add(tL_messageMediaVenue);
                                        }
                                        cVar = cVar3;
                                        hashSet3 = hashSet5;
                                        hashSet4 = hashSet6;
                                    } catch (Exception unused4) {
                                        cVar = cVar3;
                                    }
                                } else {
                                    if (sb5 == null || sb5.length() <= 0) {
                                        sb6 = sb3;
                                        cVar = cVar3;
                                    } else {
                                        TLRPC.TL_messageMediaVenue tL_messageMediaVenue2 = new TLRPC.TL_messageMediaVenue();
                                        TLRPC.TL_geoPoint tL_geoPoint2 = new TLRPC.TL_geoPoint();
                                        tL_messageMediaVenue2.geo = tL_geoPoint2;
                                        tL_geoPoint2.lat = latitude;
                                        tL_geoPoint2._long = longitude;
                                        tL_messageMediaVenue2.query_id = -1L;
                                        tL_messageMediaVenue2.title = sb5.toString();
                                        tL_messageMediaVenue2.icon = "pin";
                                        tL_messageMediaVenue2.address = z15 ? hd.M0(2131747595, null) : hd.M0(2131747460, null);
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
                                                sb6 = sb3;
                                                cVar = cVar3;
                                            } else {
                                                sb6 = sb3;
                                                TL_stories.TL_geoPointAddress tL_geoPointAddress2 = tL_messageMediaVenue2.geoAddress;
                                                tL_geoPointAddress2.state = adminArea;
                                                cVar = cVar3;
                                                try {
                                                    tL_geoPointAddress2.flags |= 1;
                                                } catch (Exception unused5) {
                                                }
                                            }
                                            if (!TextUtils.isEmpty(locality2)) {
                                                TL_stories.TL_geoPointAddress tL_geoPointAddress3 = tL_messageMediaVenue2.geoAddress;
                                                tL_geoPointAddress3.city = locality2;
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
                                                    sb8 = null;
                                                } else {
                                                    if (sb8.length() > 0) {
                                                        sb8.append(", ");
                                                    }
                                                    sb8.append(thoroughfare2);
                                                }
                                                if (!TextUtils.isEmpty(sb8)) {
                                                    int i22 = 0;
                                                    while (true) {
                                                        String[] strArr = rd.Q;
                                                        if (i22 < 19) {
                                                            if (strArr[i22].equalsIgnoreCase(sb8.toString())) {
                                                                z13 = true;
                                                            } else {
                                                                i22++;
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
                                                        org.telegram.messenger.g0.h3(new ci.p0(cVar, i7, str2, arrayList, 4));
                                                        break;
                                                    }
                                                }
                                            }
                                        } else {
                                            sb6 = sb3;
                                            cVar = cVar3;
                                        }
                                        z13 = false;
                                        if (!z13) {
                                        }
                                    }
                                    if (z12) {
                                        hashSet4 = hashSet6;
                                    } else {
                                        hashSet4 = hashSet6;
                                        if (!hashSet4.contains(sb6.toString())) {
                                            TLRPC.TL_messageMediaVenue tL_messageMediaVenue3 = new TLRPC.TL_messageMediaVenue();
                                            TLRPC.TL_geoPoint tL_geoPoint3 = new TLRPC.TL_geoPoint();
                                            tL_messageMediaVenue3.geo = tL_geoPoint3;
                                            tL_geoPoint3.lat = latitude;
                                            tL_geoPoint3._long = longitude;
                                            tL_messageMediaVenue3.query_id = -1L;
                                            tL_messageMediaVenue3.title = sb6.toString();
                                            tL_messageMediaVenue3.icon = "city";
                                            tL_messageMediaVenue3.emoji = rd.b(address2.getCountryCode());
                                            hashSet4.add(tL_messageMediaVenue3.title);
                                            tL_messageMediaVenue3.address = hd.M0(2131747595, null);
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
                                                org.telegram.messenger.g0.h3(new ci.p0(cVar, i7, str2, arrayList, 4));
                                            }
                                        }
                                    }
                                    if (sb2.length() > 0) {
                                        hashSet3 = hashSet5;
                                        if (hashSet3.contains(sb2.toString())) {
                                            continue;
                                        } else {
                                            TLRPC.TL_messageMediaVenue tL_messageMediaVenue4 = new TLRPC.TL_messageMediaVenue();
                                            TLRPC.TL_geoPoint tL_geoPoint4 = new TLRPC.TL_geoPoint();
                                            tL_messageMediaVenue4.geo = tL_geoPoint4;
                                            tL_geoPoint4.lat = latitude;
                                            tL_geoPoint4._long = longitude;
                                            tL_messageMediaVenue4.query_id = -1L;
                                            tL_messageMediaVenue4.title = sb2.toString();
                                            tL_messageMediaVenue4.icon = "country";
                                            tL_messageMediaVenue4.emoji = rd.b(address2.getCountryCode());
                                            hashSet3.add(tL_messageMediaVenue4.title);
                                            tL_messageMediaVenue4.address = hd.M0(2131751754, null);
                                            if (address != null) {
                                                TL_stories.TL_geoPointAddress tL_geoPointAddress8 = new TL_stories.TL_geoPointAddress();
                                                tL_messageMediaVenue4.geoAddress = tL_geoPointAddress8;
                                                tL_geoPointAddress8.country_iso2 = address.getCountryCode();
                                            }
                                            arrayList.add(tL_messageMediaVenue4);
                                            if (arrayList.size() >= i10) {
                                                org.telegram.messenger.g0.h3(new ci.p0(cVar, i7, str2, arrayList, 4));
                                            }
                                        }
                                    } else {
                                        hashSet3 = hashSet5;
                                    }
                                }
                            }
                        }
                        String subLocality = address2.getSubLocality();
                        if (TextUtils.isEmpty(subLocality)) {
                            String locality4 = address2.getLocality();
                            if (TextUtils.isEmpty(locality4) || TextUtils.equals(locality4, str4)) {
                                z10 = true;
                                sb4 = null;
                                if (TextUtils.isEmpty(str4)) {
                                }
                                boolean z152 = z10;
                                countryName = address2.getCountryName();
                                if (TextUtils.isEmpty(countryName)) {
                                }
                                jg.c cVar32 = cVar2;
                                if (cVar2.e) {
                                }
                            } else {
                                if (sb4.length() > 0) {
                                    sb4.append(", ");
                                }
                                sb4.append(locality4);
                            }
                        } else {
                            if (sb4.length() > 0) {
                                sb4.append(", ");
                            }
                            sb4.append(subLocality);
                        }
                        z10 = false;
                        if (TextUtils.isEmpty(str4)) {
                        }
                        boolean z1522 = z10;
                        countryName = address2.getCountryName();
                        if (TextUtils.isEmpty(countryName)) {
                        }
                        jg.c cVar322 = cVar2;
                        if (cVar2.e) {
                        }
                    } else {
                        locale = locale2;
                        str3 = str;
                        list = fromLocationName2;
                        cVar = cVar2;
                        i7 = i19;
                        str2 = str7;
                        hashSet3 = hashSet;
                        list2 = fromLocationName;
                        hashSet4 = hashSet2;
                        i12 = i11;
                    }
                    i11 = i12 + 1;
                    hashSet2 = hashSet4;
                    hashSet = hashSet3;
                    locale2 = locale;
                    str7 = str2;
                    i19 = i7;
                    fromLocationName2 = list;
                    fromLocationName = list2;
                    str = str3;
                    cVar2 = cVar;
                }
                cVar = cVar2;
                i7 = i19;
                str2 = str7;
                org.telegram.messenger.g0.h3(new ci.p0(cVar, i7, str2, arrayList, 4));
                break;
            case 4:
                final jg.h0 h0Var = (jg.h0) this.c;
                int i23 = this.b;
                ArrayList arrayList2 = (ArrayList) this.d;
                ArrayList arrayList3 = (ArrayList) this.e;
                ArrayList arrayList4 = (ArrayList) this.f;
                jg.z zVar = h0Var.k0;
                ArrayList arrayList5 = h0Var.w0;
                int i24 = h0Var.t0;
                h0Var.E0--;
                if (i23 == h0Var.e0) {
                    h0Var.g0 = i23;
                    if (h0Var.f0 != i23) {
                        zVar.b();
                    }
                    if (h0Var.h0 != i23) {
                        h0Var.J.clear();
                    }
                    h0Var.O = true;
                    int i25 = 0;
                    while (i25 < arrayList2.size()) {
                        if (!h0Var.F(arrayList2.get(i25))) {
                            arrayList2.remove(i25);
                            i25--;
                        }
                        i25++;
                    }
                    boolean z16 = true;
                    int size = arrayList5.size();
                    int i26 = 0;
                    while (i26 < arrayList2.size()) {
                        final Object obj2 = arrayList2.get(i26);
                        if (obj2 instanceof TLRPC.User) {
                            TLRPC.User user = (TLRPC.User) obj2;
                            j3 = j12;
                            np.s1(i24).X3(user, z16, false);
                            j10 = user.id;
                        } else {
                            j3 = j12;
                            if (obj2 instanceof TLRPC.Chat) {
                                TLRPC.Chat chat = (TLRPC.Chat) obj2;
                                np.s1(i24).Q3(chat, z16);
                                j10 = -chat.id;
                            } else {
                                if (obj2 instanceof TLRPC.EncryptedChat) {
                                    np.s1(i24).U3((TLRPC.EncryptedChat) obj2, z16);
                                }
                                j10 = j3;
                            }
                        }
                        if (j10 == j3 || ((TLRPC.Dialog) np.s1(i24).R.f(j10)) != null) {
                            j11 = j10;
                        } else {
                            vr a02 = vr.a0(i24);
                            j11 = j10;
                            a02.a.c(new ar(a02, j11, new pr() { // from class: jg.y
                                @Override // org.telegram.messenger.pr
                                public final void a(int i27) {
                                    int i28 = h0.this.t0;
                                    if (i27 != -1) {
                                        TLRPC.TL_dialog tL_dialog = new TLRPC.TL_dialog();
                                        long j14 = j10;
                                        tL_dialog.id = j14;
                                        if (i27 != 0) {
                                            tL_dialog.folder_id = i27;
                                        }
                                        Object obj3 = obj2;
                                        if (obj3 instanceof TLRPC.Chat) {
                                            tL_dialog.flags = t3.T((TLRPC.Chat) obj3) ? 1 : 0;
                                        }
                                        np.s1(i28).R.k(tL_dialog, j14);
                                        np.s1(i28).y.add(tL_dialog);
                                        np.s1(i28).U4(null);
                                    }
                                }
                            }, 1));
                        }
                        if (h0Var.R() && !(obj2 instanceof TLRPC.EncryptedChat)) {
                            jw jwVar = h0Var.V;
                            boolean z17 = jwVar != null && jwVar.a() == j11;
                            for (int i27 = 0; !z17 && i27 < size; i27++) {
                                jg.g0 g0Var = (jg.g0) arrayList5.get(i27);
                                if (g0Var != null && g0Var.c == j11) {
                                    z17 = true;
                                }
                            }
                            if (z17) {
                                arrayList2.remove(i26);
                                arrayList3.remove(i26);
                                i26--;
                            }
                        }
                        z16 = true;
                        i26++;
                        j12 = j3;
                    }
                    np.s1(i24).Y3(arrayList4, z16);
                    h0Var.s = arrayList2;
                    h0Var.H = arrayList3;
                    zVar.f(arrayList2, arrayList5);
                    h0Var.f();
                    jw jwVar2 = h0Var.V;
                    if (jwVar2 != null) {
                        jwVar2.d(h0Var.E0 > 0 ? z16 : false, z16);
                        h0Var.V.c();
                        break;
                    }
                }
                break;
            case 5:
                jg.s1 s1Var = (jg.s1) this.c;
                int i28 = this.b;
                ArrayList arrayList6 = (ArrayList) this.d;
                ArrayList arrayList7 = (ArrayList) this.e;
                ArrayList arrayList8 = (ArrayList) this.f;
                if (i28 == s1Var.F) {
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
                int i29 = this.b;
                i9 i9Var = (i9) this.d;
                i9 i9Var2 = (i9) this.e;
                TextView textView = (TextView) this.f;
                if (jArr[0] >= 0) {
                    TLRPC.User a22 = np.s1(i29).a2(Long.valueOf(jArr[0]));
                    t8 t8Var = new t8((e6) null);
                    t8Var.r(a22);
                    i9Var.f(a22, t8Var);
                } else {
                    TLRPC.Chat M0 = np.s1(i29).M0(Long.valueOf(-jArr[0]));
                    t8 t8Var2 = new t8((e6) null);
                    t8Var2.q(M0);
                    i9Var.f(M0, t8Var2);
                }
                if (jArr[0] >= 0) {
                    TLRPC.User a23 = np.s1(i29).a2(Long.valueOf(jArr[0]));
                    if (i9Var2 != null) {
                        t8 t8Var3 = new t8((e6) null);
                        t8Var3.r(a23);
                        i9Var2.f(a23, t8Var3);
                    }
                    if (textView != null) {
                        textView.setText(q10.p(a23));
                        break;
                    }
                } else {
                    TLRPC.Chat M02 = np.s1(i29).M0(Long.valueOf(-jArr[0]));
                    if (i9Var2 != null) {
                        t8 t8Var4 = new t8((e6) null);
                        t8Var4.q(M02);
                        i9Var2.f(M02, t8Var4);
                    }
                    if (textView != null) {
                        textView.setText(M02 != null ? M02.title : "");
                        break;
                    }
                }
                break;
            case 7:
                TLObject tLObject2 = (TLObject) this.c;
                boolean[] zArr = (boolean[]) this.d;
                z10 z10Var2 = (z10) this.e;
                int i30 = this.b;
                TL_account.updateEmojiStatus updateemojistatus = (TL_account.updateEmojiStatus) this.f;
                if (tLObject2 instanceof TLRPC.TL_boolTrue) {
                    TLRPC.User f11 = m10.i(i30).f();
                    if (f11 != null) {
                        f11.emoji_status = updateemojistatus.emoji_status;
                        ns.f(i30).k(ns.m5, f11);
                        np.s1(i30).k5(f11.id, f11.emoji_status);
                    }
                    if (!zArr[0]) {
                        zArr[0] = true;
                        z10Var2.a(null);
                        break;
                    }
                } else if (!zArr[0]) {
                    zArr[0] = true;
                    z10Var2.a("SERVER_ERROR");
                    break;
                }
                break;
            case 8:
                l2.c1 c1Var = (l2.c1) this.c;
                Pair pair = (Pair) this.d;
                c1Var.b.h.I(((Integer) pair.first).intValue(), (x2.f0) pair.second, (x2.t) this.e, (x2.b0) this.f, this.b);
                break;
            case 9:
                ((VoIPService) this.c).lambda$startConferenceGroupCall$33((TLObject) this.d, this.b, (String) this.e, (TLRPC.TL_error) this.f);
                break;
            case 10:
                g4 g4Var = (g4) this.c;
                ArrayList arrayList9 = (ArrayList) this.d;
                HashMap hashMap = (HashMap) this.e;
                String str10 = (String) this.f;
                int i31 = this.b;
                ArrayList arrayList10 = new ArrayList();
                int size2 = arrayList9.size();
                int i32 = 0;
                while (i32 < size2) {
                    Object obj3 = arrayList9.get(i32);
                    TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) hashMap.get(obj3);
                    if (obj3 instanceof TL_iv.RichText) {
                        TL_iv.RichText richText = (TL_iv.RichText) obj3;
                        TLRPC.WebPage webPage = g4Var.v0[i15].c.F;
                        i14 = i15;
                        obj = obj3;
                        CharSequence A = g4.A(g4Var, webPage, null, richText, richText, pageBlock, 1000);
                        if (!TextUtils.isEmpty(A)) {
                            lowerCase = A.toString().toLowerCase();
                        }
                        lowerCase = null;
                    } else {
                        i14 = i15;
                        obj = obj3;
                        if (obj instanceof String) {
                            lowerCase = ((String) obj).toLowerCase();
                        }
                        lowerCase = null;
                    }
                    if (lowerCase != null) {
                        int i33 = i14;
                        while (true) {
                            int indexOf = lowerCase.indexOf(str10, i33);
                            if (indexOf >= 0) {
                                int length2 = str10.length() + indexOf;
                                if (indexOf == 0 || org.telegram.messenger.g0.K1(lowerCase.charAt(indexOf - 1))) {
                                    p3 p3Var = new p3();
                                    p3Var.a = indexOf;
                                    p3Var.c = pageBlock;
                                    p3Var.b = obj;
                                    arrayList10.add(p3Var);
                                }
                                i33 = length2;
                            }
                        }
                    }
                    i32++;
                    i15 = i14;
                }
                org.telegram.messenger.g0.h3(new ci.p0((Object) g4Var, i31, (Object) arrayList10, str10, 14));
                break;
            case 11:
                a();
                break;
            case 12:
                an.i0((an) this.c, this.b, (Boolean) this.d, (TLRPC.WebPage) this.e, (TL_account.getWebPagePreview) this.f);
                break;
            case 13:
                lm lmVar = (lm) this.c;
                hi hiVar = (hi) this.d;
                hiVar.b = lmVar.a.getMessagesController().s0(-((TLRPC.Chat) this.e).id, this.b, new gm(lmVar, hiVar, (an) this.f));
                break;
            case 14:
                lm lmVar2 = (lm) this.c;
                int i34 = this.b;
                gj gjVar = (gj) this.d;
                Integer num = (Integer) this.e;
                byte[] bArr = (byte[]) this.f;
                an anVar = lmVar2.a;
                anVar.Bb(i34, gjVar.e1(), true, gj.B0(gjVar.k) == anVar.c7 ? 1 : 0, true, 0, num, bArr, new vl(lmVar2, gjVar, 1));
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
                tg.e2 e2Var = (tg.e2) this.c;
                int i35 = this.b;
                List list3 = (List) this.d;
                ArrayList arrayList11 = (ArrayList) this.e;
                ln0 ln0Var = (ln0) this.f;
                if (e2Var.J != null && !e2Var.E) {
                    Matrix matrix = new Matrix();
                    matrix.postScale(1.0f / e2Var.J.getWidth(), 1.0f / e2Var.J.getHeight());
                    matrix.postTranslate(-0.5f, -0.5f);
                    matrix.postRotate(i35);
                    matrix.postTranslate(0.5f, 0.5f);
                    if ((i35 / 90) % 2 != 0) {
                        matrix.postScale(e2Var.J.getHeight(), e2Var.J.getWidth());
                    } else {
                        matrix.postScale(e2Var.J.getWidth(), e2Var.J.getHeight());
                    }
                    if (list3.isEmpty()) {
                        tg.b2 b2Var = new tg.b2(e2Var);
                        b2Var.h.set(0.0f, 0.0f, e2Var.J.getWidth(), e2Var.J.getHeight());
                        b2Var.i.set(b2Var.h);
                        matrix.mapRect(b2Var.i);
                        b2Var.c = i35;
                        Bitmap d = e2Var.d(0, 0, e2Var.J, false);
                        b2Var.d = d;
                        if (d == null) {
                            a8.g(new RuntimeException("createSmoothEdgesSegmentedImage failed on empty image"), true);
                            break;
                        } else {
                            b2Var.f = b2Var.c();
                            tg.e2.c(b2Var, e2Var.U, e2Var.V);
                            e2Var.P = b2Var.j;
                            e2Var.Q = b2Var.k;
                            arrayList11.add(b2Var);
                            org.telegram.messenger.g0.h3(new t5.a(e2Var, arrayList11, ln0Var, b2Var, 1));
                            e2Var.F = b2Var;
                            e2Var.E = true;
                            e2Var.y = false;
                            break;
                        }
                    } else {
                        for (int i36 = 0; i36 < list3.size(); i36++) {
                            tg.d2 d2Var = (tg.d2) list3.get(i36);
                            tg.b2 b2Var2 = new tg.b2(e2Var);
                            b2Var2.h.set(d2Var.b, d2Var.c, r13 + d2Var.d, r15 + d2Var.e);
                            b2Var2.i.set(b2Var2.h);
                            matrix.mapRect(b2Var2.i);
                            b2Var2.c = i35;
                            Bitmap d2 = e2Var.d(d2Var.b, d2Var.c, d2Var.a, false);
                            b2Var2.d = d2;
                            if (d2 != null) {
                                b2Var2.f = b2Var2.c();
                                tg.e2.c(b2Var2, e2Var.U, e2Var.V);
                                e2Var.P = b2Var2.j;
                                e2Var.Q = b2Var2.k;
                                arrayList11.add(b2Var2);
                            }
                        }
                        e2Var.F = null;
                        e2Var.E = true;
                        e2Var.y = false;
                        org.telegram.messenger.g0.h3(new org.telegram.ui.web.e1(20, e2Var, arrayList11));
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ g1(Object obj, int i7, Object obj2, Object obj3, Object obj4, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = i7;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
    }

    public /* synthetic */ g1(Object obj, Object obj2, int i7, Object obj3, Object obj4, int i10) {
        this.a = i10;
        this.c = obj;
        this.d = obj2;
        this.b = i7;
        this.e = obj3;
        this.f = obj4;
    }

    public /* synthetic */ g1(Object obj, Object obj2, Object obj3, int i7, Object obj4, int i10) {
        this.a = i10;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = i7;
        this.f = obj4;
    }

    public /* synthetic */ g1(Object obj, Object obj2, Object obj3, Object obj4, int i7, int i10) {
        this.a = i10;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
        this.b = i7;
    }

    public /* synthetic */ g1(rr rrVar, TLObject tLObject, TLRPC.InputPeer inputPeer, int i7, int[] iArr) {
        this.a = 18;
        this.d = rrVar;
        this.e = tLObject;
        this.f = inputPeer;
        this.b = i7;
        this.c = iArr;
    }

    public /* synthetic */ g1(org.telegram.ui.ActionBar.t1[] t1VarArr, int[] iArr, int i7, Runnable runnable, org.telegram.ui.ActionBar.e2 e2Var) {
        this.a = 17;
        this.d = t1VarArr;
        this.c = iArr;
        this.b = i7;
        this.e = runnable;
        this.f = e2Var;
    }
}
