package org.telegram.ui;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.style.CharacterStyle;
import android.text.style.URLSpan;
import android.view.ViewGroup;
import android.widget.Toast;
import androidx.core.content.FileProvider;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class jb implements org.telegram.ui.Cells.l1 {
    public final /* synthetic */ pb a;

    public jb(pb pbVar) {
        this.a = pbVar;
    }

    @Override // org.telegram.ui.Cells.l1
    public final void A0(org.telegram.ui.Cells.q1 q1Var, float f7, float f10) {
        sb sbVar = this.a.n;
        int i10 = sb.Q0;
        sbVar.T0(q1Var, 0.0f, 0.0f);
    }

    @Override // org.telegram.ui.Cells.l1
    public final boolean A1(org.telegram.ui.Cells.q1 q1Var, org.telegram.messenger.jj jjVar) {
        if (org.telegram.messenger.jj.R4(jjVar.k) || jjVar.h4()) {
            boolean S = MediaController.B().S(jjVar);
            MediaController.B().r0(null, false);
            return S;
        }
        if (jjVar.I3()) {
            return MediaController.B().o0(this.a.n.o0, jjVar, 0L, true, null);
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ boolean E1(org.telegram.ui.Cells.q1 q1Var, TLRPC.PollAnswer pollAnswer) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ qs0 H1() {
        return null;
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ boolean I0(long j10) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ boolean K1(long j10) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public final void L0(org.telegram.ui.Cells.q1 q1Var, CharacterStyle characterStyle, boolean z10) {
        TLRPC.WebPage webPage;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        sb sbVar = this.a.n;
        if (characterStyle == null) {
            return;
        }
        org.telegram.messenger.jj messageObject = q1Var.getMessageObject();
        if (characterStyle instanceof org.telegram.ui.Components.d51) {
            org.telegram.ui.Components.d51 d51Var = (org.telegram.ui.Components.d51) characterStyle;
            org.telegram.messenger.i0.g(d51Var.a.subSequence(d51Var.b, d51Var.c).toString());
            if (org.telegram.messenger.i0.H3()) {
                Toast.makeText(sbVar.getParentActivity(), org.telegram.messenger.cd.L0(2131744219, null), 0).show();
                return;
            }
            return;
        }
        if (characterStyle instanceof org.telegram.ui.Components.h51) {
            Long A = Utilities.A(((org.telegram.ui.Components.h51) characterStyle).getURL());
            long longValue = A.longValue();
            if (longValue > 0) {
                i13 = ((org.telegram.ui.ActionBar.k2) sbVar).currentAccount;
                TLRPC.User Z1 = org.telegram.messenger.vp.r1(i13).Z1(A);
                if (Z1 != null) {
                    i14 = ((org.telegram.ui.ActionBar.k2) sbVar).currentAccount;
                    org.telegram.messenger.vp.r1(i14).w3(Z1, null, sbVar, 0);
                    return;
                }
                return;
            }
            i11 = ((org.telegram.ui.ActionBar.k2) sbVar).currentAccount;
            TLRPC.Chat L0 = org.telegram.messenger.vp.r1(i11).L0(Long.valueOf(-longValue));
            if (L0 != null) {
                i12 = ((org.telegram.ui.ActionBar.k2) sbVar).currentAccount;
                org.telegram.messenger.vp.r1(i12).w3(null, L0, sbVar, 0);
                return;
            }
            return;
        }
        if (characterStyle instanceof org.telegram.ui.Components.e51) {
            String url = ((org.telegram.ui.Components.e51) characterStyle).getURL();
            if (url.startsWith("@")) {
                i10 = ((org.telegram.ui.ActionBar.k2) sbVar).currentAccount;
                org.telegram.messenger.vp.r1(i10).v3(url.substring(1), sbVar, 0, null);
                return;
            } else {
                if (url.startsWith("#")) {
                    ay ayVar = new ay(null);
                    ayVar.n2 = url;
                    sbVar.presentFragment(ayVar);
                    return;
                }
                return;
            }
        }
        String url2 = ((URLSpan) characterStyle).getURL();
        if (z10) {
            org.telegram.ui.ActionBar.z2 h = org.telegram.messenger.z20.h(sbVar.getParentActivity(), false, 1, null);
            h.O = url2;
            h.P = false;
            CharSequence[] charSequenceArr = {org.telegram.messenger.cd.L0(2131747833, null), org.telegram.messenger.cd.L0(2131751767, null)};
            eg.j jVar = new eg.j(3, this, url2);
            h.L = charSequenceArr;
            h.K = jVar;
            sbVar.showDialog(h);
            return;
        }
        if (characterStyle instanceof org.telegram.ui.Components.g51) {
            String url3 = ((org.telegram.ui.Components.g51) characterStyle).getURL();
            if (gf.f.e(Uri.parse(url3), false, null)) {
                gf.f.n(sbVar.getParentActivity(), url3, true);
                return;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(sbVar.getParentActivity());
            String L02 = org.telegram.messenger.cd.L0(2131747795, null);
            org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
            x1Var.R = L02;
            x1Var.T = org.telegram.messenger.cd.a0(null, null, 2131747798, url3);
            alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131747833, null), new ng.d(5, sbVar, url3));
            alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131752589, null), null);
            sbVar.showDialog(x1Var);
            return;
        }
        TLRPC.MessageMedia messageMedia = messageObject.k.media;
        if ((messageMedia instanceof TLRPC.TL_messageMediaWebPage) && (webPage = messageMedia.webpage) != null && webPage.cached_page != null) {
            String lowerCase = url2.toLowerCase();
            String lowerCase2 = messageObject.k.media.webpage.url.toLowerCase();
            if ((gf.f.g(lowerCase, false, false) || lowerCase.contains("t.me/iv")) && (lowerCase.contains(lowerCase2) || lowerCase2.contains(lowerCase))) {
                LaunchActivity launchActivity = LaunchActivity.I1;
                if (launchActivity == null || launchActivity.O() == null || LaunchActivity.I1.O().k(messageObject) == null) {
                    sbVar.createArticleViewer(false).L(messageObject, null, null, null);
                    return;
                }
                return;
            }
        }
        gf.f.n(sbVar.getParentActivity(), url2, true);
    }

    @Override // org.telegram.ui.Cells.l1
    public final void L1(org.telegram.ui.Cells.q1 q1Var, int i10, float f7, float f10, boolean z10) {
        org.telegram.messenger.jj jjVar = q1Var.getMessageObject().C;
        long B0 = org.telegram.messenger.jj.B0(jjVar.k);
        sb sbVar = this.a.n;
        if (B0 == (-sbVar.f.id)) {
            for (int i11 = 0; i11 < sbVar.o0.size(); i11++) {
                org.telegram.messenger.jj jjVar2 = (org.telegram.messenger.jj) sbVar.o0.get(i11);
                if (jjVar2 != null && jjVar2.U != 1 && jjVar2.M1() == jjVar.M1()) {
                    sbVar.c1(jjVar2);
                    return;
                }
            }
        }
        Bundle bundle = new Bundle();
        bundle.putLong("chat_id", sbVar.f.id);
        bundle.putInt("message_id", jjVar.M1());
        sbVar.presentFragment(new un(bundle));
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ boolean M0(org.telegram.ui.Cells.q1 q1Var, boolean z10) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ boolean N1(org.telegram.ui.Cells.q1 q1Var, TLRPC.TodoItem todoItem) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ boolean P(org.telegram.ui.Cells.q1 q1Var, TLRPC.TodoItem todoItem, boolean z10) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ boolean Q() {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ boolean R(org.telegram.ui.Cells.q1 q1Var) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ boolean S() {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ boolean S0(org.telegram.messenger.jj jjVar) {
        return org.telegram.ui.Cells.f1.a(jjVar);
    }

    @Override // org.telegram.ui.Cells.l1
    public final void T(org.telegram.ui.Cells.q1 q1Var, TLRPC.Chat chat, int i10, float f7, float f10, boolean z10) {
        int i11;
        sb sbVar = this.a.n;
        if (chat == null || chat == sbVar.f) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("chat_id", chat.id);
        if (i10 != 0) {
            bundle.putInt("message_id", i10);
        }
        i11 = ((org.telegram.ui.ActionBar.k2) sbVar).currentAccount;
        if (org.telegram.messenger.vp.r1(i11).E(bundle, sbVar, null, null)) {
            sbVar.presentFragment(new un(bundle), true);
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ int W() {
        return 0;
    }

    @Override // org.telegram.ui.Cells.l1
    public final void W0(org.telegram.ui.Cells.q1 q1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        org.telegram.messenger.jj messageObject = q1Var.getMessageObject();
        pb pbVar = this.a;
        if (pbVar.n.p0.contains(Long.valueOf(messageObject.T))) {
            pbVar.n.p0.remove(Long.valueOf(messageObject.T));
        } else {
            pbVar.n.p0.add(Long.valueOf(messageObject.T));
        }
        pbVar.n.a1(true);
        pbVar.n.V0();
        pbVar.n.E.f();
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ boolean W1(org.telegram.ui.Cells.q1 q1Var, TL_iv.PageBlock pageBlock) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ zg.a Y() {
        return null;
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ boolean Z(org.telegram.ui.Cells.q1 q1Var) {
        return false;
    }

    public final void a(TLRPC.User user) {
        Bundle bundle = new Bundle();
        bundle.putLong("user_id", user.id);
        pb pbVar = this.a;
        sb.t0(pbVar.n, bundle, user.id);
        ProfileActivity profileActivity = new ProfileActivity(bundle, null);
        profileActivity.f5(0);
        pbVar.n.presentFragment(profileActivity);
    }

    @Override // org.telegram.ui.Cells.l1
    public final boolean a0(org.telegram.ui.Cells.q1 q1Var, TLRPC.User user) {
        int i10;
        int i11;
        v4 b10;
        sb sbVar = this.a.n;
        if (user != null) {
            long j10 = user.id;
            i10 = ((org.telegram.ui.ActionBar.k2) sbVar).currentAccount;
            if (j10 != org.telegram.messenger.d20.i(i10).e()) {
                b5[] b5VarArr = {b5.d, b5.h};
                TLRPC.UserFull a2 = sbVar.getMessagesController().a2(user.id);
                if (a2 != null) {
                    b10 = v4.c(user, a2, b5VarArr);
                } else {
                    i11 = ((org.telegram.ui.ActionBar.k2) sbVar).classGuid;
                    b10 = v4.b(user, i11, b5VarArr);
                }
                if (ac.a.h(b10)) {
                    ac.a.n().A((ViewGroup) sbVar.fragmentView, sbVar.getResourceProvider(), b10, new ng.d(this, q1Var, user));
                    return true;
                }
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public final boolean c() {
        return true;
    }

    @Override // org.telegram.ui.Cells.l1
    public final void c1(org.telegram.ui.Cells.q1 q1Var, int i10) {
        TLRPC.WebPage webPage;
        int i11;
        sb sbVar = this.a.n;
        org.telegram.messenger.jj messageObject = q1Var.getMessageObject();
        TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent = messageObject.J1;
        if (tL_channelAdminLogEvent != null && (tL_channelAdminLogEvent.action instanceof TLRPC.TL_channelAdminLogEventActionEditMessage)) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", -org.telegram.messenger.jj.B0(messageObject.k));
            bundle.putInt("message_id", messageObject.M1());
            un unVar = new un(bundle);
            if (org.telegram.messenger.w3.c0(sbVar.f)) {
                long B0 = org.telegram.messenger.jj.B0(messageObject.k);
                i11 = ((org.telegram.ui.ActionBar.k2) sbVar).currentAccount;
                gg.e.a(unVar, org.telegram.messenger.gs.a(B0, org.telegram.messenger.jj.c2(i11, messageObject.k, true, false)));
            }
            sbVar.presentFragment(unVar);
            return;
        }
        if (i10 == 0) {
            TLRPC.MessageMedia messageMedia = messageObject.k.media;
            if (messageMedia == null || (webPage = messageMedia.webpage) == null || webPage.cached_page == null) {
                return;
            }
            LaunchActivity launchActivity = LaunchActivity.I1;
            if (launchActivity == null || launchActivity.O() == null || LaunchActivity.I1.O().k(messageObject) == null) {
                sbVar.createArticleViewer(false).L(messageObject, null, null, null);
                return;
            }
            return;
        }
        if (i10 != 5) {
            TLRPC.MessageMedia messageMedia2 = messageObject.k.media;
            if (messageMedia2 == null || messageMedia2.webpage == null) {
                return;
            }
            gf.f.r(sbVar.getParentActivity(), messageObject.k.media.webpage.url);
            return;
        }
        TLRPC.User Z1 = sbVar.getMessagesController().Z1(Long.valueOf(messageObject.k.media.user_id));
        TLRPC.MessageMedia messageMedia3 = messageObject.k.media;
        String str = messageMedia3.vcard;
        String str2 = messageMedia3.first_name;
        String str3 = messageMedia3.last_name;
        try {
            File g12 = org.telegram.messenger.i0.g1();
            g12.mkdirs();
            File file = new File(g12, "vcard.vcf");
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));
            bufferedWriter.write(str);
            bufferedWriter.close();
            sbVar.showDialog(new org.telegram.ui.Components.vd0(sbVar, null, Z1, null, file, null, str2, str3, null));
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ boolean c2(int i10) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ boolean d0() {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public final boolean f() {
        return true;
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ int f0(org.telegram.ui.Cells.q1 q1Var) {
        return 0;
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ org.telegram.ui.Cells.l9 g2() {
        return null;
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ String h(org.telegram.ui.Cells.q1 q1Var) {
        return null;
    }

    @Override // org.telegram.ui.Cells.l1
    public final boolean i0() {
        return true;
    }

    @Override // org.telegram.ui.Cells.l1
    public final void j() {
        org.telegram.messenger.w0.u();
        boolean z10 = org.telegram.messenger.v2.a;
        org.telegram.messenger.w0.r();
        gf.f.r(this.a.n.getParentActivity(), org.telegram.messenger.v2.g);
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ boolean j1() {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ boolean k1(org.telegram.ui.Cells.q1 q1Var, int i10) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ boolean m0(org.telegram.ui.Components.o5 o5Var) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public final void o0(org.telegram.ui.Cells.q1 q1Var, float f7, float f10) {
        sb sbVar = this.a.n;
        int i10 = sb.Q0;
        sbVar.T0(q1Var, 0.0f, 0.0f);
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ boolean p1(org.telegram.ui.Cells.q1 q1Var, TLRPC.Chat chat) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public final void q(org.telegram.ui.Cells.q1 q1Var) {
        pb pbVar = this.a;
        sb sbVar = pbVar.n;
        if (sbVar.getParentActivity() == null) {
            return;
        }
        sbVar.showDialog(org.telegram.ui.Components.op0.N0(pbVar.c, q1Var.getMessageObject(), null, org.telegram.messenger.w3.T(sbVar.f) && !sbVar.f.megagroup, null));
    }

    @Override // org.telegram.ui.Cells.l1
    public final void r0(org.telegram.ui.Cells.q1 q1Var, TLRPC.User user, float f7, float f10) {
        int i10;
        if (user != null) {
            long j10 = user.id;
            i10 = ((org.telegram.ui.ActionBar.k2) this.a.n).currentAccount;
            if (j10 != org.telegram.messenger.d20.i(i10).e()) {
                a(user);
            }
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ boolean r1() {
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00f5, code lost:
    
        if (r15.exists() != false) goto L55;
     */
    @Override // org.telegram.ui.Cells.l1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void s0(org.telegram.ui.Cells.q1 q1Var, float f7, float f10, boolean z10) {
        int i10;
        File file;
        sb sbVar = this.a.n;
        org.telegram.messenger.jj messageObject = q1Var.getMessageObject();
        if (org.telegram.messenger.jj.k1(messageObject.k) != null) {
            sbVar.showDialog(new org.telegram.ui.Components.cx0(sbVar.getParentActivity(), sbVar, org.telegram.messenger.jj.k1(messageObject.k), null, null, null));
            return;
        }
        File file2 = null;
        if (org.telegram.messenger.jj.L4(messageObject.k) || (i10 = messageObject.D) == 1 || ((i10 == 0 && !messageObject.a5()) || org.telegram.messenger.jj.t3(messageObject.k))) {
            PhotoViewer.v1().N2(null, sbVar, null);
            PhotoViewer.v1().i2(messageObject, null, 0L, 0L, 0L, sbVar.B0);
            return;
        }
        int i11 = messageObject.D;
        if (i11 == 3) {
            try {
                String str = messageObject.k.attachPath;
                if (str != null && str.length() != 0) {
                    file2 = new File(messageObject.k.attachPath);
                }
                if (file2 == null || !file2.exists()) {
                    org.telegram.messenger.b8 fileLoader = sbVar.getFileLoader();
                    TLRPC.Message message = messageObject.k;
                    fileLoader.getClass();
                    file2 = org.telegram.messenger.b8.N(message, false, true);
                }
                Intent intent = new Intent("android.intent.action.VIEW");
                if (Build.VERSION.SDK_INT >= 24) {
                    intent.setFlags(1);
                    Activity parentActivity = sbVar.getParentActivity();
                    org.telegram.messenger.w0.d();
                    intent.setDataAndType(FileProvider.d(parentActivity, "org.telegram.messenger.beta.provider", file2), "video/mp4");
                } else {
                    intent.setDataAndType(Uri.fromFile(file2), "video/mp4");
                }
                sbVar.getParentActivity().startActivityForResult(intent, 500);
                return;
            } catch (Exception unused) {
                sb.z0(sbVar, messageObject);
                return;
            }
        }
        if (i11 == 4) {
            if (org.telegram.messenger.i0.J1(sbVar)) {
                yb0 yb0Var = new yb0(0);
                yb0Var.H0(messageObject);
                sbVar.presentFragment(yb0Var);
                return;
            }
            return;
        }
        if (i11 == 9 || i11 == 0) {
            if (messageObject.I0().toLowerCase().endsWith("attheme")) {
                String str2 = messageObject.k.attachPath;
                if (str2 != null && str2.length() != 0) {
                    file = new File(messageObject.k.attachPath);
                }
                file = null;
                if (file == null) {
                    org.telegram.messenger.b8 fileLoader2 = sbVar.getFileLoader();
                    TLRPC.Message message2 = messageObject.k;
                    fileLoader2.getClass();
                    File N = org.telegram.messenger.b8.N(message2, false, true);
                    if (N.exists()) {
                        file = N;
                    }
                }
                dh.f fVar = sbVar.y;
                if (fVar != null) {
                    if (fVar.N0() < sbVar.y.B() - 1) {
                        sbVar.g0 = sbVar.y.L0();
                        org.telegram.ui.Components.ck0 ck0Var = (org.telegram.ui.Components.ck0) sbVar.w.K(sbVar.g0);
                        if (ck0Var != null) {
                            sbVar.h0 = ck0Var.a.getTop();
                        } else {
                            sbVar.g0 = -1;
                        }
                    } else {
                        sbVar.g0 = -1;
                    }
                }
                org.telegram.ui.ActionBar.s6 v = org.telegram.ui.ActionBar.t6.v(file, messageObject.I0(), null, true);
                if (v != null) {
                    sbVar.presentFragment(new m91(v));
                    return;
                }
                sbVar.g0 = -1;
            }
            try {
                org.telegram.messenger.i0.u2(messageObject, sbVar.getParentActivity(), null, false);
            } catch (Exception unused2) {
                sb.z0(sbVar, messageObject);
            }
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ boolean w0(org.telegram.messenger.jj jjVar) {
        return true;
    }

    @Override // org.telegram.ui.Cells.l1
    public final void w1(org.telegram.ui.Cells.q1 q1Var, TLRPC.WebPage webPage, String str, boolean z10) {
        gf.f.r(q1Var.getContext(), str);
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ String x(long j10) {
        return null;
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ CharacterStyle y1(org.telegram.ui.Cells.q1 q1Var) {
        return null;
    }

    @Override // org.telegram.ui.Cells.l1
    public final void z1(org.telegram.messenger.jj jjVar, String str, String str2, String str3, String str4, int i10, int i11) {
        sb sbVar = this.a.n;
        org.telegram.ui.Components.hu.K0(sbVar, jjVar, sbVar.B0, str2, str3, str4, str, i10, i11, -1, false);
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void A(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void C0(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void F0(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void H(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void J(org.telegram.messenger.gj gjVar) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void J0(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final void M(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void N0(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void O(org.telegram.messenger.jj jjVar) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void O0(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void P1(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void U(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void X1(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void c0(int i10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void g0(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final void l0(String str) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void m1(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void n(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void t(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void u1(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void v(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void v1(org.telegram.messenger.jj jjVar) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void x0(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void z(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void B1() {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void U0() {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void Z1() {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void e2() {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void o() {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void s() {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void y0() {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void C1(org.telegram.ui.Cells.q1 q1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void F1(org.telegram.ui.Cells.q1 q1Var, org.telegram.messenger.c20 c20Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void G(org.telegram.ui.Cells.q1 q1Var, org.telegram.messenger.s2 s2Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void J1(String str, String str2) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void K0(org.telegram.ui.Cells.q1 q1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void S1(org.telegram.ui.Cells.q1 q1Var, long j10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void Z0(org.telegram.ui.Cells.q1 q1Var, TLRPC.Document document) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void n1(org.telegram.ui.Cells.q1 q1Var, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void q1(org.telegram.ui.Cells.q1 q1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void s1(org.telegram.ui.Cells.q1 q1Var, int i10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final void D0(org.telegram.ui.Cells.q1 q1Var, boolean z10, boolean z11) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void e0(org.telegram.ui.Cells.q1 q1Var, float f7, float f10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void f1(org.telegram.ui.Cells.q1 q1Var, float f7, float f10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void f2(org.telegram.ui.Cells.q1 q1Var, int i10, int i11) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final void l1(org.telegram.ui.Cells.q1 q1Var, boolean z10, boolean z11) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void z0(org.telegram.ui.Cells.q1 q1Var, TLObject tLObject, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void D1(org.telegram.ui.Cells.q1 q1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void l(org.telegram.ui.Cells.q1 q1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void b2(org.telegram.ui.Cells.q1 q1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void i(org.telegram.ui.Cells.q1 q1Var, ArrayList arrayList, int i10, int i11, int i12) {
    }
}
