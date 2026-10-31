package i2;

import ag.g3;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Pair;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import jg.q2;
import jg.s2;
import jg.u2;
import jg.v2;
import org.telegram.messenger.ap;
import org.telegram.messenger.b8;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.bs;
import org.telegram.messenger.cd;
import org.telegram.messenger.d20;
import org.telegram.messenger.f8;
import org.telegram.messenger.h20;
import org.telegram.messenger.hs;
import org.telegram.messenger.jj;
import org.telegram.messenger.lr;
import org.telegram.messenger.m5;
import org.telegram.messenger.q20;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.messenger.vp;
import org.telegram.messenger.w3;
import org.telegram.messenger.zs;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_chatlists;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.k2;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.x1;
import org.telegram.ui.ActionBar.z2;
import org.telegram.ui.Components.RLottieNative;
import org.telegram.ui.Components.av0;
import org.telegram.ui.Components.bv0;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.cv0;
import org.telegram.ui.Components.g9;
import org.telegram.ui.Components.j00;
import org.telegram.ui.Components.ji0;
import org.telegram.ui.Components.r8;
import org.telegram.ui.Components.vr;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.SecretMediaViewer;
import org.telegram.ui.an;
import org.telegram.ui.ay;
import org.telegram.ui.b50;
import org.telegram.ui.bj;
import org.telegram.ui.f70;
import org.telegram.ui.fn;
import org.telegram.ui.h4;
import org.telegram.ui.mx;
import org.telegram.ui.pf0;
import org.telegram.ui.q3;
import org.telegram.ui.qm;
import org.telegram.ui.se0;
import org.telegram.ui.ua0;
import org.telegram.ui.un;
import org.telegram.ui.wo0;
import rh.e6;
import vh.o8;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class g1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ g1(int i10, TLRPC.Chat chat, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3) {
        this.a = 9;
        this.b = i10;
        this.c = chat;
        this.d = arrayList;
        this.e = arrayList2;
        this.f = arrayList3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v35, types: [zf.m1, zf.t] */
    /* JADX WARN: Type inference failed for: r11v23, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v125 */
    /* JADX WARN: Type inference failed for: r3v126, types: [int] */
    /* JADX WARN: Type inference failed for: r3v136 */
    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        String lowerCase;
        k2 Q;
        boolean z10;
        boolean z11;
        boolean z12;
        cc a02;
        ArrayList<TLRPC.User> arrayList;
        ArrayList<TLRPC.Chat> arrayList2;
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings;
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings2;
        long j10;
        final long j11;
        long j12;
        boolean z13;
        boolean z14;
        int i10 = 2;
        boolean z15 = true;
        boolean z16 = false;
        switch (this.a) {
            case 0:
                i1 i1Var = (i1) this.c;
                Pair pair = (Pair) this.d;
                i1Var.b.h.G(((Integer) pair.first).intValue(), (u2.g0) pair.second, (u2.u) this.e, (u2.c0) this.f, this.b);
                break;
            case 1:
                v2 v2Var = (v2) this.c;
                int i11 = this.b;
                List list = (List) this.d;
                ArrayList arrayList3 = (ArrayList) this.e;
                wo0 wo0Var = (wo0) this.f;
                if (v2Var.I != null && !v2Var.D) {
                    Matrix matrix = new Matrix();
                    matrix.postScale(1.0f / v2Var.I.getWidth(), 1.0f / v2Var.I.getHeight());
                    matrix.postTranslate(-0.5f, -0.5f);
                    matrix.postRotate(i11);
                    matrix.postTranslate(0.5f, 0.5f);
                    if ((i11 / 90) % 2 != 0) {
                        matrix.postScale(v2Var.I.getHeight(), v2Var.I.getWidth());
                    } else {
                        matrix.postScale(v2Var.I.getWidth(), v2Var.I.getHeight());
                    }
                    if (list.isEmpty()) {
                        s2 s2Var = new s2(v2Var);
                        s2Var.h.set(0.0f, 0.0f, v2Var.I.getWidth(), v2Var.I.getHeight());
                        s2Var.i.set(s2Var.h);
                        matrix.mapRect(s2Var.i);
                        s2Var.c = i11;
                        Bitmap d = v2Var.d(0, 0, v2Var.I, false);
                        s2Var.d = d;
                        if (d == null) {
                            f8.g(new RuntimeException("createSmoothEdgesSegmentedImage failed on empty image"), true);
                            break;
                        } else {
                            s2Var.f = s2Var.c();
                            v2.c(s2Var, v2Var.T, v2Var.U);
                            v2Var.O = s2Var.j;
                            v2Var.P = s2Var.k;
                            arrayList3.add(s2Var);
                            org.telegram.messenger.i0.g3(new ag.q0(v2Var, arrayList3, wo0Var, s2Var, 5));
                            v2Var.E = s2Var;
                            v2Var.D = true;
                            v2Var.y = false;
                            break;
                        }
                    } else {
                        for (int i12 = 0; i12 < list.size(); i12++) {
                            u2 u2Var = (u2) list.get(i12);
                            s2 s2Var2 = new s2(v2Var);
                            s2Var2.h.set(u2Var.b, u2Var.c, r10 + u2Var.d, r12 + u2Var.e);
                            s2Var2.i.set(s2Var2.h);
                            matrix.mapRect(s2Var2.i);
                            s2Var2.c = i11;
                            Bitmap d10 = v2Var.d(u2Var.b, u2Var.c, u2Var.a, false);
                            s2Var2.d = d10;
                            if (d10 != null) {
                                s2Var2.f = s2Var2.c();
                                v2.c(s2Var2, v2Var.T, v2Var.U);
                                v2Var.O = s2Var2.j;
                                v2Var.P = s2Var2.k;
                                arrayList3.add(s2Var2);
                            }
                        }
                        v2Var.E = null;
                        v2Var.D = true;
                        v2Var.y = false;
                        org.telegram.messenger.i0.g3(new d1.e(26, v2Var, arrayList3));
                        break;
                    }
                }
                break;
            case 2:
                m4.p0 p0Var = (m4.p0) this.c;
                m4.p1 p1Var = (m4.p1) this.d;
                int i13 = this.b;
                n4.r rVar = (n4.r) this.e;
                m4.o0 o0Var = (m4.o0) this.f;
                xa.n nVar = p0Var.g;
                if (!p0Var.h.j()) {
                    if (!((n4.l) p0Var.n.a).a.isActive()) {
                        StringBuilder sb2 = new StringBuilder("Ignore incoming session command before initialization. command=");
                        sb2.append(p1Var == null ? Integer.valueOf(i13) : p1Var.b);
                        sb2.append(", pid=");
                        sb2.append(rVar.a.b);
                        e2.a.l("MediaSessionLegacyStub", sb2.toString());
                        break;
                    } else {
                        m4.w m0 = p0Var.m0(rVar);
                        if (p1Var != null) {
                            if (!nVar.O(m0, p1Var)) {
                            }
                        } else if (!nVar.N(m0, i13)) {
                        }
                        try {
                            o0Var.b(m0);
                            break;
                        } catch (RemoteException e) {
                            e2.a.m("MediaSessionLegacyStub", "Exception in " + m0, e);
                            return;
                        }
                    }
                }
                break;
            case 3:
                ((VoIPService) this.c).lambda$startConferenceGroupCall$33((TLObject) this.d, this.b, (String) this.e, (TLRPC.TL_error) this.f);
                break;
            case 4:
                h4 h4Var = (h4) this.c;
                ArrayList arrayList4 = (ArrayList) this.d;
                HashMap hashMap = (HashMap) this.e;
                String str = (String) this.f;
                int i14 = this.b;
                ArrayList arrayList5 = new ArrayList();
                int size = arrayList4.size();
                for (int i15 = 0; i15 < size; i15++) {
                    Object obj2 = arrayList4.get(i15);
                    TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) hashMap.get(obj2);
                    if (obj2 instanceof TL_iv.RichText) {
                        TL_iv.RichText richText = (TL_iv.RichText) obj2;
                        obj = obj2;
                        CharSequence A = h4.A(h4Var, h4Var.u0[0].c.E, null, richText, richText, pageBlock, 1000);
                        if (!TextUtils.isEmpty(A)) {
                            lowerCase = A.toString().toLowerCase();
                        }
                        lowerCase = null;
                    } else {
                        obj = obj2;
                        if (obj instanceof String) {
                            lowerCase = ((String) obj).toLowerCase();
                        }
                        lowerCase = null;
                    }
                    if (lowerCase != null) {
                        int i16 = 0;
                        while (true) {
                            int indexOf = lowerCase.indexOf(str, i16);
                            if (indexOf >= 0) {
                                int length = str.length() + indexOf;
                                if (indexOf == 0 || org.telegram.messenger.i0.K1(lowerCase.charAt(indexOf - 1))) {
                                    q3 q3Var = new q3();
                                    q3Var.a = indexOf;
                                    q3Var.c = pageBlock;
                                    q3Var.b = obj;
                                    arrayList5.add(q3Var);
                                }
                                i16 = length;
                            }
                        }
                    }
                }
                org.telegram.messenger.i0.g3(new g3(h4Var, i14, arrayList5, str, 9));
                break;
            case 5:
                TLObject tLObject = (TLObject) this.c;
                int i17 = this.b;
                HashSet hashSet = (HashSet) this.d;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.e;
                k2 k2Var = (k2) this.f;
                if (tLObject instanceof TLRPC.Updates) {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                    vp.r1(i17).V3(updates.users, false);
                    vp.r1(i17).P3(updates.chats, false);
                    ArrayList z02 = vp.z0(updates, TL_update.TL_updateGroupCall.class);
                    int size2 = z02.size();
                    TLRPC.GroupCall groupCall = null;
                    int i18 = 0;
                    while (i18 < size2) {
                        Object obj3 = z02.get(i18);
                        i18++;
                        groupCall = ((TL_update.TL_updateGroupCall) obj3).call;
                    }
                    if (LaunchActivity.I1 != null && groupCall != null) {
                        TLRPC.TL_inputGroupCall tL_inputGroupCall = new TLRPC.TL_inputGroupCall();
                        tL_inputGroupCall.id = groupCall.id;
                        tL_inputGroupCall.access_hash = groupCall.access_hash;
                        org.telegram.ui.Components.voip.m1.g(LaunchActivity.I1, i17, tL_inputGroupCall, false, groupCall, hashSet);
                        break;
                    }
                } else if (tLObject instanceof TL_phone.groupCall) {
                    TL_phone.groupCall groupcall = (TL_phone.groupCall) tLObject;
                    vp.r1(i17).V3(groupcall.users, false);
                    vp.r1(i17).P3(groupcall.chats, false);
                    if (LaunchActivity.I1 != null) {
                        TLRPC.TL_inputGroupCall tL_inputGroupCall2 = new TLRPC.TL_inputGroupCall();
                        TLRPC.GroupCall groupCall2 = groupcall.call;
                        tL_inputGroupCall2.id = groupCall2.id;
                        tL_inputGroupCall2.access_hash = groupCall2.access_hash;
                        org.telegram.ui.Components.voip.m1.g(LaunchActivity.I1, i17, tL_inputGroupCall2, false, groupCall2, hashSet);
                        break;
                    }
                } else if (tL_error != null) {
                    cc.a0(k2Var).f0(tL_error, false);
                    break;
                }
                break;
            case 6:
                un.Q0((un) this.c, this.b, (Boolean) this.d, (TLRPC.WebPage) this.e, (TL_account.getWebPagePreview) this.f);
                break;
            case 7:
                fn fnVar = (fn) this.c;
                bj bjVar = (bj) this.d;
                bjVar.b = fnVar.a.getMessagesController().s0(-((TLRPC.Chat) this.e).id, this.b, new an(fnVar, bjVar, (un) this.f));
                break;
            case 8:
                fn fnVar2 = (fn) this.c;
                int i19 = this.b;
                jj jjVar = (jj) this.d;
                Integer num = (Integer) this.e;
                byte[] bArr = (byte[]) this.f;
                un unVar = fnVar2.a;
                unVar.nb(i19, jjVar.f1(), true, jj.B0(jjVar.k) == unVar.b7 ? 1 : 0, true, 0, num, bArr, new qm(fnVar2, jjVar, 1));
                break;
            case 9:
                int i20 = this.b;
                TLRPC.Chat chat = (TLRPC.Chat) this.c;
                ArrayList arrayList6 = (ArrayList) this.d;
                ArrayList arrayList7 = (ArrayList) this.e;
                ArrayList arrayList8 = (ArrayList) this.f;
                if (LaunchActivity.E1 && (Q = LaunchActivity.Q()) != null && Q.getParentActivity() != null) {
                    kg.q0 q0Var = new kg.q0(11, i20, Q.getParentActivity(), Q, null);
                    q0Var.C1(chat, arrayList6, arrayList7, arrayList8, null);
                    q0Var.show();
                    break;
                }
                break;
            case 10:
                SharedPreferences sharedPreferences = (SharedPreferences) this.c;
                TLRPC.TL_help_support tL_help_support = (TLRPC.TL_help_support) this.d;
                x1 x1Var = (x1) this.e;
                int i21 = this.b;
                k2 k2Var2 = (k2) this.f;
                SharedPreferences.Editor edit = sharedPreferences.edit();
                edit.putLong("support_id2", tL_help_support.user.id);
                SerializedData serializedData = new SerializedData();
                tL_help_support.user.serializeToStream(serializedData);
                edit.putString("support_user", Base64.encodeToString(serializedData.toByteArray(), 0));
                edit.commit();
                serializedData.cleanup();
                try {
                    x1Var.dismiss();
                    z10 = true;
                } catch (Exception e7) {
                    z10 = true;
                    f8.g(e7, true);
                }
                ArrayList arrayList9 = new ArrayList();
                arrayList9.add(tL_help_support.user);
                hs.a0(i21).m1(arrayList9, null, z10, z10);
                vp.r1(i21).U3(tL_help_support.user, false, false);
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", tL_help_support.user.id);
                k2Var2.presentFragment(new un(bundle));
                break;
            case 11:
                x1[] x1VarArr = (x1[]) this.c;
                int[] iArr = (int[]) this.d;
                int i22 = this.b;
                Runnable runnable = (Runnable) this.e;
                k2 k2Var3 = (k2) this.f;
                x1 x1Var2 = x1VarArr[0];
                if (x1Var2 != null) {
                    x1Var2.setOnCancelListener(new org.telegram.ui.Components.n1(iArr, i22, runnable));
                    k2Var3.showDialog(x1VarArr[0]);
                    break;
                }
                break;
            case 12:
                vr.d1((vr) this.c, (TLObject) this.d, (TLRPC.InputPeer) this.e, this.b, (int[]) this.f);
                break;
            case 13:
                cv0 cv0Var = (cv0) this.c;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) this.d;
                int i23 = this.b;
                jj jjVar2 = (jj) this.e;
                org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) this.f;
                int[] iArr2 = cv0Var.e;
                RLottieNative[] rLottieNativeArr = cv0Var.f1;
                if (cv0Var.W0) {
                    org.telegram.messenger.i0.g3(new av0(cv0Var, 2));
                    break;
                } else {
                    int i24 = 0;
                    boolean z17 = false;
                    while (i24 < rLottieNativeArr.length) {
                        if (rLottieNativeArr[i24] == null) {
                            int i25 = i24 == 0 ? 1 : i24 == 1 ? 8 : i24 == 2 ? 14 : i24 == 3 ? 20 : 2;
                            if (i25 < tL_messages_stickerSet.documents.size()) {
                                TLRPC.Document document = tL_messages_stickerSet.documents.get(i25);
                                b8.G(d20.s0);
                                String y22 = org.telegram.messenger.i0.y2(b8.K(document, null, true, true), 0);
                                if (TextUtils.isEmpty(y22)) {
                                    org.telegram.messenger.i0.g3(new bv0(document, i23, jjVar2, q1Var, tL_messages_stickerSet, 1));
                                    z17 = true;
                                } else {
                                    rLottieNativeArr[i24] = RLottieNative.b(y22, iArr2, null, null);
                                    cv0Var.g1[i24] = iArr2[0];
                                }
                            }
                        }
                        i24++;
                    }
                    if (z17) {
                        org.telegram.messenger.i0.g3(new av0(cv0Var, 3));
                        break;
                    } else {
                        org.telegram.messenger.i0.g3(new ji0(cv0Var, i23, q1Var, 7));
                        break;
                    }
                }
            case 14:
                LaunchActivity launchActivity = (LaunchActivity) this.c;
                TLObject tLObject2 = (TLObject) this.d;
                Uri uri = (Uri) this.e;
                int i26 = this.b;
                x1 x1Var3 = (x1) this.f;
                Pattern pattern = LaunchActivity.D1;
                if (!launchActivity.isFinishing()) {
                    if (tLObject2 == null || launchActivity.q0 == null) {
                        if (launchActivity.W == null) {
                            launchActivity.W = new ArrayList();
                        }
                        launchActivity.W.add(0, launchActivity.X);
                        launchActivity.X = null;
                        z11 = true;
                        launchActivity.j0(true);
                    } else {
                        TLRPC.TL_messages_historyImportParsed tL_messages_historyImportParsed = (TLRPC.TL_messages_historyImportParsed) tLObject2;
                        Bundle g10 = a1.g.g("onlySelect", true);
                        g10.putString("importTitle", tL_messages_historyImportParsed.title);
                        g10.putBoolean("allowSwitchAccount", true);
                        if (tL_messages_historyImportParsed.pm) {
                            g10.putInt("dialogsType", 12);
                        } else if (tL_messages_historyImportParsed.group) {
                            g10.putInt("dialogsType", 11);
                        } else {
                            String uri2 = uri.toString();
                            Iterator it = vp.r1(i26).Z3.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    z12 = false;
                                } else if (uri2.contains((String) it.next())) {
                                    g10.putInt("dialogsType", 12);
                                    z12 = true;
                                }
                            }
                            if (!z12) {
                                Iterator it2 = vp.r1(i26).Y3.iterator();
                                while (true) {
                                    if (it2.hasNext()) {
                                        if (uri2.contains((String) it2.next())) {
                                            g10.putInt("dialogsType", 11);
                                            z12 = true;
                                        }
                                    }
                                }
                                if (!z12) {
                                    g10.putInt("dialogsType", 13);
                                }
                            }
                        }
                        if (SecretMediaViewer.g() && SecretMediaViewer.f().s) {
                            SecretMediaViewer.f().e(false, false);
                        } else if (PhotoViewer.F1() && PhotoViewer.v1().U1()) {
                            PhotoViewer.v1().H0(false, true);
                        } else if (h4.G() && h4.v().V) {
                            h4.v().m(false, true);
                        }
                        o8.w();
                        b50 b50Var = b50.u5;
                        if (b50Var != null) {
                            b50Var.dismiss();
                        }
                        if (org.telegram.messenger.i0.Q1()) {
                            launchActivity.q0.W(true, true);
                            launchActivity.s0.W(true, true);
                        }
                        ay ayVar = new ay(g10);
                        ayVar.C2 = launchActivity;
                        ((ActionBarLayout) launchActivity.M()).U(ayVar, !org.telegram.messenger.i0.Q1() ? launchActivity.q0.getFragmentStack().size() <= 1 || !(launchActivity.q0.getFragmentStack().get(launchActivity.q0.getFragmentStack().size() - 1) instanceof pf0) : launchActivity.r0.getFragmentStack().isEmpty() || !(launchActivity.r0.getFragmentStack().get(launchActivity.r0.getFragmentStack().size() + (-1)) instanceof pf0), false);
                        z11 = true;
                    }
                    try {
                        x1Var3.dismiss();
                        break;
                    } catch (Exception e10) {
                        f8.g(e10, z11);
                        return;
                    }
                }
                break;
            case 15:
                LaunchActivity launchActivity2 = (LaunchActivity) this.c;
                f70 f70Var = (f70) this.d;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.e;
                TLRPC.Updates updates2 = (TLRPC.Updates) this.f;
                int i27 = this.b;
                ArrayList arrayList10 = launchActivity2.d0;
                if (!launchActivity2.isFinishing()) {
                    try {
                        f70Var.run();
                    } catch (Exception e11) {
                        f8.g(e11, true);
                    }
                    if (tL_error2 != null) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(launchActivity2);
                        alertDialog$Builder.a.R = cd.L0(R.string.AppName, null);
                        if (tL_error2.text.startsWith("FLOOD_WAIT")) {
                            alertDialog$Builder.a.T = cd.L0(2131750688, null);
                        } else if (tL_error2.text.equals("USERS_TOO_MUCH")) {
                            alertDialog$Builder.a.T = cd.L0(2131749086, null);
                        } else {
                            alertDialog$Builder.a.T = cd.L0(2131749085, null);
                        }
                        alertDialog$Builder.k(cd.L0(2131747847, null), null);
                        launchActivity2.F0(alertDialog$Builder);
                        break;
                    } else if (launchActivity2.q0 != null && updates2 != null && !updates2.chats.isEmpty()) {
                        TLRPC.Chat chat2 = updates2.chats.get(0);
                        chat2.left = false;
                        chat2.kicked = false;
                        vp.r1(i27).V3(updates2.users, false);
                        vp.r1(i27).P3(updates2.chats, false);
                        Bundle bundle2 = new Bundle();
                        bundle2.putLong("chat_id", chat2.id);
                        if (arrayList10.isEmpty() || vp.r1(i27).E(bundle2, (k2) i0.a.g(1, arrayList10), null, null)) {
                            un unVar2 = new un(bundle2);
                            zs.f(i27).k(4, new Object[0]);
                            ((ActionBarLayout) launchActivity2.M()).U(unVar2, false, true);
                            break;
                        }
                    }
                }
                break;
            case 16:
                LaunchActivity launchActivity3 = (LaunchActivity) this.c;
                TLObject tLObject3 = (TLObject) this.d;
                int i28 = this.b;
                String str2 = (String) this.e;
                f70 f70Var2 = (f70) this.f;
                k2 k2Var4 = (k2) i0.a.g(1, launchActivity3.d0);
                try {
                    if (tLObject3 instanceof TL_chatlists.chatlist_ChatlistInvite) {
                        TL_chatlists.chatlist_ChatlistInvite chatlist_chatlistinvite = (TL_chatlists.chatlist_ChatlistInvite) tLObject3;
                        boolean z18 = chatlist_chatlistinvite instanceof TL_chatlists.TL_chatlists_chatlistInvite;
                        if (z18) {
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
                        vp.r1(i28).P3(arrayList2, false);
                        vp.r1(i28).V3(arrayList, false);
                        if (!z18 || !((TL_chatlists.TL_chatlists_chatlistInvite) chatlist_chatlistinvite).peers.isEmpty()) {
                            j00 j00Var = new j00(k2Var4, false);
                            j00Var.Q1 = -1;
                            j00Var.U1 = "";
                            j00Var.V1 = new ArrayList();
                            j00Var.X1 = "";
                            j00Var.Z1 = new ArrayList();
                            ArrayList arrayList11 = new ArrayList();
                            j00Var.a2 = arrayList11;
                            j00Var.r2 = -1;
                            j00Var.u2 = -5;
                            j00Var.P1 = str2;
                            j00Var.R1 = chatlist_chatlistinvite;
                            arrayList11.clear();
                            if (z18) {
                                TL_chatlists.TL_chatlists_chatlistInvite tL_chatlists_chatlistInvite2 = (TL_chatlists.TL_chatlists_chatlistInvite) chatlist_chatlistinvite;
                                TLRPC.TL_textWithEntities tL_textWithEntities = tL_chatlists_chatlistInvite2.title;
                                j00Var.U1 = tL_textWithEntities.text;
                                j00Var.V1 = tL_textWithEntities.entities;
                                j00Var.W1 = tL_chatlists_chatlistInvite2.title_noanimate;
                                j00Var.Y1 = tL_chatlists_chatlistInvite2.peers;
                            } else if (chatlist_chatlistinvite instanceof TL_chatlists.TL_chatlists_chatlistInviteAlready) {
                                TL_chatlists.TL_chatlists_chatlistInviteAlready tL_chatlists_chatlistInviteAlready2 = (TL_chatlists.TL_chatlists_chatlistInviteAlready) chatlist_chatlistinvite;
                                j00Var.Y1 = tL_chatlists_chatlistInviteAlready2.missing_peers;
                                j00Var.b2 = tL_chatlists_chatlistInviteAlready2.already_peers;
                                j00Var.Q1 = tL_chatlists_chatlistInviteAlready2.filter_id;
                                ArrayList arrayList12 = k2Var4.getMessagesController().P0;
                                if (arrayList12 != null) {
                                    int i29 = 0;
                                    while (true) {
                                        if (i29 < arrayList12.size()) {
                                            ap apVar = (ap) arrayList12.get(i29);
                                            if (apVar.a == j00Var.Q1) {
                                                j00Var.U1 = apVar.b;
                                                j00Var.V1 = apVar.c;
                                                j00Var.W1 = apVar.n;
                                            } else {
                                                i29++;
                                            }
                                        }
                                    }
                                }
                            }
                            j00Var.f1();
                            k2Var4.showDialog(j00Var);
                            f70Var2.run();
                            break;
                        } else {
                            a02 = cc.a0(k2Var4);
                        }
                    } else {
                        a02 = cc.a0(k2Var4);
                    }
                    f70Var2.run();
                } catch (Exception e12) {
                    f8.g(e12, true);
                    return;
                }
                m5.o(null, 2131748226, a02, null);
                break;
            case 17:
                ((ua0) this.c).v((String) this.d, this.b + 1, (String) this.e, (String) this.f);
                break;
            case 18:
                se0 se0Var = (se0) this.c;
                String str3 = (String) this.d;
                String str4 = (String) this.e;
                String str5 = (String) this.f;
                int i30 = this.b;
                ArrayList arrayList13 = new ArrayList();
                c5.a aVar = new c5.a();
                aVar.c = "inapp";
                aVar.b = str3;
                arrayList13.add(aVar.a());
                f8.b("LoginBilling querying \"" + str3 + "\" product");
                org.telegram.messenger.u1.i().o(arrayList13, new q2(se0Var, str3, str4, str5, i30));
                break;
            case 19:
                int[] iArr3 = (int[]) this.c;
                int i31 = this.b;
                r8 r8Var = (r8) this.d;
                TLRPC.User user = (TLRPC.User) this.e;
                g9 g9Var = (g9) this.f;
                iArr3[0] = i31;
                r8Var.r(user);
                g9Var.e(user, r8Var);
                break;
            case 20:
                ph.l1 l1Var = (ph.l1) this.c;
                Context context = (Context) this.d;
                int i32 = this.b;
                TL_stars.StarGift starGift = (TL_stars.StarGift) this.e;
                q20 q20Var = (q20) this.f;
                long j13 = l1Var.T1;
                ph.n0 n0Var = new ph.n0(l1Var, q20Var, i10);
                boolean z19 = starGift.limited;
                new ph.t0(l1Var, context, i32, starGift, j13, n0Var, z19 && (disallowedGiftsSettings2 = l1Var.S1) != null && disallowedGiftsSettings2.disallow_limited_stargifts, z19 && (disallowedGiftsSettings = l1Var.S1) != null && disallowedGiftsSettings.disallow_unique_stargifts).show();
                break;
            case 21:
                vh.d dVar = (vh.d) this.c;
                z2[] z2VarArr = (z2[]) this.d;
                int i33 = this.b;
                TLObject tLObject4 = (TLObject) this.e;
                String str6 = (String) this.f;
                dVar.setLoading(false);
                z2 z2Var = z2VarArr[0];
                if (z2Var != null) {
                    z2Var.dismiss();
                }
                e6.y(i33, false).R();
                k2 T = LaunchActivity.T();
                if (T != null) {
                    cc.a0(T).V(Collections.singletonList(tLObject4), cd.L0(2131744997, null), org.telegram.messenger.i0.W2(cd.a0(null, null, 2131744996, str6)), null).k(false);
                    break;
                }
                break;
            case 22:
                long[] jArr = (long[]) this.c;
                int i34 = this.b;
                g9 g9Var2 = (g9) this.d;
                g9 g9Var3 = (g9) this.e;
                TextView textView = (TextView) this.f;
                if (jArr[0] >= 0) {
                    TLRPC.User Z1 = vp.r1(i34).Z1(Long.valueOf(jArr[0]));
                    r8 r8Var2 = new r8((p6) null);
                    r8Var2.r(Z1);
                    g9Var2.e(Z1, r8Var2);
                } else {
                    TLRPC.Chat L0 = vp.r1(i34).L0(Long.valueOf(-jArr[0]));
                    r8 r8Var3 = new r8((p6) null);
                    r8Var3.q(L0);
                    g9Var2.e(L0, r8Var3);
                }
                if (jArr[0] >= 0) {
                    TLRPC.User Z12 = vp.r1(i34).Z1(Long.valueOf(jArr[0]));
                    if (g9Var3 != null) {
                        r8 r8Var4 = new r8((p6) null);
                        r8Var4.r(Z12);
                        g9Var3.e(Z12, r8Var4);
                    }
                    if (textView != null) {
                        textView.setText(h20.p(Z12));
                        break;
                    }
                } else {
                    TLRPC.Chat L02 = vp.r1(i34).L0(Long.valueOf(-jArr[0]));
                    if (g9Var3 != null) {
                        r8 r8Var5 = new r8((p6) null);
                        r8Var5.q(L02);
                        g9Var3.e(L02, r8Var5);
                    }
                    if (textView != null) {
                        textView.setText(L02 != null ? L02.title : "");
                        break;
                    }
                }
                break;
            case 23:
                TLObject tLObject5 = (TLObject) this.c;
                boolean[] zArr = (boolean[]) this.d;
                q20 q20Var2 = (q20) this.e;
                int i35 = this.b;
                TL_account.updateEmojiStatus updateemojistatus = (TL_account.updateEmojiStatus) this.f;
                if (tLObject5 instanceof TLRPC.TL_boolTrue) {
                    TLRPC.User f7 = d20.i(i35).f();
                    if (f7 != null) {
                        f7.emoji_status = updateemojistatus.emoji_status;
                        zs.f(i35).k(zs.m5, f7);
                        vp.r1(i35).g5(f7.id, f7.emoji_status);
                    }
                    if (!zArr[0]) {
                        zArr[0] = true;
                        q20Var2.a(null);
                        break;
                    }
                } else if (!zArr[0]) {
                    zArr[0] = true;
                    q20Var2.a("SERVER_ERROR");
                    break;
                }
                break;
            case 24:
                final zf.z zVar = (zf.z) this.c;
                int i36 = this.b;
                ArrayList arrayList14 = (ArrayList) this.d;
                ArrayList arrayList15 = (ArrayList) this.e;
                ArrayList arrayList16 = (ArrayList) this.f;
                ?? r10 = zVar.j0;
                ?? r11 = zVar.v0;
                int i37 = zVar.s0;
                zVar.D0--;
                if (i36 == zVar.d0) {
                    zVar.f0 = i36;
                    if (zVar.e0 != i36) {
                        r10.b();
                    }
                    if (zVar.g0 != i36) {
                        zVar.I.clear();
                    }
                    zVar.N = true;
                    int i38 = 0;
                    while (i38 < arrayList14.size()) {
                        if (!zVar.F(arrayList14.get(i38))) {
                            arrayList14.remove(i38);
                            i38--;
                        }
                        i38++;
                    }
                    int size3 = r11.size();
                    int i39 = 0;
                    while (i39 < arrayList14.size()) {
                        final Object obj4 = arrayList14.get(i39);
                        if (obj4 instanceof TLRPC.User) {
                            TLRPC.User user2 = (TLRPC.User) obj4;
                            j10 = 0;
                            vp.r1(i37).U3(user2, z15, z16);
                            j11 = user2.id;
                        } else {
                            j10 = 0;
                            if (obj4 instanceof TLRPC.Chat) {
                                TLRPC.Chat chat3 = (TLRPC.Chat) obj4;
                                vp.r1(i37).N3(chat3, z15);
                                j11 = -chat3.id;
                            } else {
                                if (obj4 instanceof TLRPC.EncryptedChat) {
                                    vp.r1(i37).R3((TLRPC.EncryptedChat) obj4, z15);
                                }
                                j11 = 0;
                            }
                        }
                        if (j11 == j10 || ((TLRPC.Dialog) vp.r1(i37).Q.f(j11)) != null) {
                            j12 = j11;
                            z13 = z15;
                            z14 = z16;
                        } else {
                            hs a03 = hs.a0(i37);
                            z14 = z16;
                            z13 = z15;
                            j12 = j11;
                            a03.a.c(new lr(a03, j12, new bs() { // from class: zf.s
                                @Override // org.telegram.messenger.bs
                                public final void a(int i40) {
                                    int i41 = z.this.s0;
                                    if (i40 != -1) {
                                        TLRPC.TL_dialog tL_dialog = new TLRPC.TL_dialog();
                                        long j14 = j11;
                                        tL_dialog.id = j14;
                                        if (i40 != 0) {
                                            tL_dialog.folder_id = i40;
                                        }
                                        Object obj5 = obj4;
                                        if (obj5 instanceof TLRPC.Chat) {
                                            tL_dialog.flags = w3.T((TLRPC.Chat) obj5) ? 1 : 0;
                                        }
                                        vp.r1(i41).Q.k(tL_dialog, j14);
                                        vp.r1(i41).y.add(tL_dialog);
                                        vp.r1(i41).Q4(null);
                                    }
                                }
                            }, 1));
                        }
                        if (zVar.R() && !(obj4 instanceof TLRPC.EncryptedChat)) {
                            mx mxVar = zVar.U;
                            boolean z20 = (mxVar == null || mxVar.a() != j12) ? z14 : z13;
                            for (?? r32 = z14; !z20 && r32 < size3; r32++) {
                                zf.y yVar = (zf.y) r11.get(r32);
                                if (yVar != null && yVar.c == j12) {
                                    z20 = z13;
                                }
                            }
                            if (z20) {
                                arrayList14.remove(i39);
                                arrayList15.remove(i39);
                                i39--;
                            }
                        }
                        i39++;
                        z16 = z14;
                        z15 = z13;
                    }
                    boolean z21 = z15;
                    boolean z22 = z16;
                    vp.r1(i37).V3(arrayList16, z21);
                    zVar.s = arrayList14;
                    zVar.G = arrayList15;
                    r10.f(arrayList14, r11);
                    zVar.f();
                    mx mxVar2 = zVar.U;
                    if (mxVar2 != null) {
                        mxVar2.d(zVar.D0 > 0 ? z21 : z22, z21);
                        zVar.U.c();
                        break;
                    }
                }
                break;
            default:
                zf.f1 f1Var = (zf.f1) this.c;
                int i40 = this.b;
                ArrayList arrayList17 = (ArrayList) this.d;
                ArrayList arrayList18 = (ArrayList) this.e;
                ArrayList arrayList19 = (ArrayList) this.f;
                if (i40 == f1Var.E) {
                    f1Var.d = arrayList17;
                    f1Var.e = arrayList18;
                    f1Var.H = arrayList19;
                    f1Var.f.f(arrayList17, null);
                    f1Var.D = false;
                    f1Var.f();
                    f1Var.F();
                    break;
                }
                break;
        }
    }

    public /* synthetic */ g1(Object obj, int i10, Object obj2, Object obj3, Object obj4, int i11) {
        this.a = i11;
        this.c = obj;
        this.b = i10;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
    }

    public /* synthetic */ g1(Object obj, Object obj2, int i10, Object obj3, Object obj4, int i11) {
        this.a = i11;
        this.c = obj;
        this.d = obj2;
        this.b = i10;
        this.e = obj3;
        this.f = obj4;
    }

    public /* synthetic */ g1(Object obj, Object obj2, Object obj3, int i10, Object obj4, int i11) {
        this.a = i11;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = i10;
        this.f = obj4;
    }

    public /* synthetic */ g1(Object obj, Object obj2, Object obj3, Object obj4, int i10, int i11) {
        this.a = i11;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
        this.b = i10;
    }
}
