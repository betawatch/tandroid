package org.telegram.ui;

import android.app.Activity;
import android.content.Intent;
import android.graphics.RectF;
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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class cb implements org.telegram.ui.Cells.l1 {
    public final /* synthetic */ hb a;

    public cb(hb hbVar) {
        this.a = hbVar;
    }

    @Override // org.telegram.ui.Cells.l1
    public final void B0(org.telegram.ui.Cells.q1 q1Var, float f10, float f11) {
        kb kbVar = this.a.n;
        int i3 = kb.R0;
        kbVar.U0(q1Var, 0.0f, 0.0f);
    }

    @Override // org.telegram.ui.Cells.l1
    public final void E1(org.telegram.ui.Cells.q1 q1Var, TLRPC.WebPage webPage, String str, boolean z10) {
        sf.c.t(q1Var.getContext(), str);
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ CharacterStyle G1(org.telegram.ui.Cells.q1 q1Var) {
        return null;
    }

    @Override // org.telegram.ui.Cells.l1
    public final void H1(org.telegram.messenger.zi ziVar, String str, String str2, String str3, String str4, int i3, int i10) {
        kb kbVar = this.a.n;
        org.telegram.ui.Components.ut.K0(kbVar, ziVar, kbVar.C0, str2, str3, str4, str, i3, i10, -1, false);
    }

    @Override // org.telegram.ui.Cells.l1
    public final boolean I1(org.telegram.ui.Cells.q1 q1Var, org.telegram.messenger.zi ziVar) {
        if (org.telegram.messenger.zi.S4(ziVar.k) || ziVar.i4()) {
            boolean S = MediaController.B().S(ziVar);
            MediaController.B().r0(null, false);
            return S;
        }
        if (ziVar.J3()) {
            return MediaController.B().o0(this.a.n.p0, ziVar, 0L, true, null, 0L);
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ boolean J0(long j10) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public final void N0(org.telegram.ui.Cells.q1 q1Var, CharacterStyle characterStyle, boolean z10) {
        TLRPC.WebPage webPage;
        int i3;
        int i10;
        int i11;
        int i12;
        int i13;
        kb kbVar = this.a.n;
        if (characterStyle == null) {
            return;
        }
        org.telegram.messenger.zi messageObject = q1Var.getMessageObject();
        if (characterStyle instanceof org.telegram.ui.Components.u31) {
            org.telegram.ui.Components.u31 u31Var = (org.telegram.ui.Components.u31) characterStyle;
            org.telegram.messenger.g0.g(u31Var.a.subSequence(u31Var.b, u31Var.c).toString());
            if (org.telegram.messenger.g0.I3()) {
                Toast.makeText(kbVar.getParentActivity(), org.telegram.messenger.bd.M0(2131744204, null), 0).show();
                return;
            }
            return;
        }
        if (characterStyle instanceof org.telegram.ui.Components.y31) {
            Long A = Utilities.A(((org.telegram.ui.Components.y31) characterStyle).getURL());
            long longValue = A.longValue();
            if (longValue > 0) {
                i12 = ((org.telegram.ui.ActionBar.d2) kbVar).currentAccount;
                TLRPC.User a22 = org.telegram.messenger.hp.s1(i12).a2(A);
                if (a22 != null) {
                    i13 = ((org.telegram.ui.ActionBar.d2) kbVar).currentAccount;
                    org.telegram.messenger.hp.s1(i13).z3(a22, null, kbVar, 0);
                    return;
                }
                return;
            }
            i10 = ((org.telegram.ui.ActionBar.d2) kbVar).currentAccount;
            TLRPC.Chat M0 = org.telegram.messenger.hp.s1(i10).M0(Long.valueOf(-longValue));
            if (M0 != null) {
                i11 = ((org.telegram.ui.ActionBar.d2) kbVar).currentAccount;
                org.telegram.messenger.hp.s1(i11).z3(null, M0, kbVar, 0);
                return;
            }
            return;
        }
        int i14 = 1;
        if (characterStyle instanceof org.telegram.ui.Components.v31) {
            String url = ((org.telegram.ui.Components.v31) characterStyle).getURL();
            if (url.startsWith("@")) {
                i3 = ((org.telegram.ui.ActionBar.d2) kbVar).currentAccount;
                org.telegram.messenger.hp.s1(i3).y3(url.substring(1), kbVar, 0, null);
                return;
            } else {
                if (url.startsWith("#")) {
                    uw uwVar = new uw(null);
                    uwVar.o2 = url;
                    kbVar.presentFragment(uwVar);
                    return;
                }
                return;
            }
        }
        String url2 = ((URLSpan) characterStyle).getURL();
        if (z10) {
            org.telegram.ui.ActionBar.t2 h = org.telegram.messenger.camera.q.h(kbVar.getParentActivity(), false, 1, null);
            h.P = url2;
            h.Q = false;
            CharSequence[] charSequenceArr = {org.telegram.messenger.bd.M0(2131747825, null), org.telegram.messenger.bd.M0(2131751767, null)};
            u uVar = new u(i14, this, url2);
            h.M = charSequenceArr;
            h.L = uVar;
            kbVar.showDialog(h);
            return;
        }
        if (characterStyle instanceof org.telegram.ui.Components.x31) {
            String url3 = ((org.telegram.ui.Components.x31) characterStyle).getURL();
            if (sf.c.g(Uri.parse(url3), false, null)) {
                sf.c.p(kbVar.getParentActivity(), url3, true);
                return;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(kbVar.getParentActivity());
            String M02 = org.telegram.messenger.bd.M0(2131747787, null);
            org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.a;
            s1Var.S = M02;
            s1Var.U = org.telegram.messenger.bd.a0(null, null, 2131747790, url3);
            alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131747825, null), new mi.d4(15, kbVar, url3));
            alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131752589, null), null);
            kbVar.showDialog(s1Var);
            return;
        }
        TLRPC.MessageMedia messageMedia = messageObject.k.media;
        if ((messageMedia instanceof TLRPC.TL_messageMediaWebPage) && (webPage = messageMedia.webpage) != null && webPage.cached_page != null) {
            String lowerCase = url2.toLowerCase();
            String lowerCase2 = messageObject.k.media.webpage.url.toLowerCase();
            if ((sf.c.i(lowerCase, false, false) || lowerCase.contains("t.me/iv")) && (lowerCase.contains(lowerCase2) || lowerCase2.contains(lowerCase))) {
                LaunchActivity launchActivity = LaunchActivity.K1;
                if (launchActivity == null || launchActivity.O() == null || LaunchActivity.K1.O().l(messageObject) == null) {
                    kbVar.createArticleViewer(false).L(messageObject, null, null, null);
                    return;
                }
                return;
            }
        }
        sf.c.p(kbVar.getParentActivity(), url2, true);
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ boolean P0(org.telegram.ui.Cells.q1 q1Var, boolean z10) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ boolean P1(org.telegram.ui.Cells.q1 q1Var, TLRPC.PollAnswer pollAnswer) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ boolean Q(org.telegram.ui.Cells.q1 q1Var, TLRPC.TodoItem todoItem, boolean z10) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ boolean R() {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ boolean S(org.telegram.ui.Cells.q1 q1Var) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ vq0 S1() {
        return null;
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ boolean T() {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public final void U(org.telegram.ui.Cells.q1 q1Var, TLRPC.Chat chat, int i3, float f10, float f11, boolean z10) {
        int i10;
        kb kbVar = this.a.n;
        if (chat == null || chat == kbVar.f) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("chat_id", chat.id);
        if (i3 != 0) {
            bundle.putInt("message_id", i3);
        }
        i10 = ((org.telegram.ui.ActionBar.d2) kbVar).currentAccount;
        if (org.telegram.messenger.hp.s1(i10).E(bundle, kbVar, null, null)) {
            kbVar.presentFragment(new wm(bundle), true);
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ boolean V1(long j10) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public final void W1(org.telegram.ui.Cells.q1 q1Var, int i3, float f10, float f11, boolean z10) {
        org.telegram.messenger.zi ziVar = q1Var.getMessageObject().C;
        long B0 = org.telegram.messenger.zi.B0(ziVar.k);
        kb kbVar = this.a.n;
        if (B0 == (-kbVar.f.id)) {
            for (int i10 = 0; i10 < kbVar.p0.size(); i10++) {
                org.telegram.messenger.zi ziVar2 = (org.telegram.messenger.zi) kbVar.p0.get(i10);
                if (ziVar2 != null && ziVar2.U != 1 && ziVar2.M1() == ziVar.M1()) {
                    kbVar.d1(ziVar2);
                    return;
                }
            }
        }
        Bundle bundle = new Bundle();
        bundle.putLong("chat_id", kbVar.f.id);
        bundle.putInt("message_id", ziVar.M1());
        kbVar.presentFragment(new wm(bundle));
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ int X() {
        return 0;
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ boolean X0(org.telegram.messenger.zi ziVar) {
        return org.telegram.ui.Cells.f1.a(ziVar);
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ boolean Y1(org.telegram.ui.Cells.q1 q1Var, TLRPC.TodoItem todoItem) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ kh.a Z() {
        return null;
    }

    public final void a(TLRPC.User user) {
        Bundle bundle = new Bundle();
        bundle.putLong("user_id", user.id);
        hb hbVar = this.a;
        kb.u0(hbVar.n, bundle, user.id);
        ProfileActivity profileActivity = new ProfileActivity(bundle, null);
        profileActivity.g5(0);
        hbVar.n.presentFragment(profileActivity);
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ boolean b0(org.telegram.ui.Cells.q1 q1Var) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public final boolean c() {
        return true;
    }

    @Override // org.telegram.ui.Cells.l1
    public final boolean d() {
        return true;
    }

    @Override // org.telegram.ui.Cells.l1
    public final boolean d0(org.telegram.ui.Cells.q1 q1Var, TLRPC.User user) {
        int i3;
        int i10;
        y4 b10;
        kb kbVar = this.a.n;
        if (user != null) {
            long j10 = user.id;
            i3 = ((org.telegram.ui.ActionBar.d2) kbVar).currentAccount;
            if (j10 != org.telegram.messenger.h10.i(i3).e()) {
                e5[] e5VarArr = {e5.d, e5.h};
                TLRPC.UserFull b22 = kbVar.getMessagesController().b2(user.id);
                if (b22 != null) {
                    b10 = y4.c(user, b22, e5VarArr);
                } else {
                    i10 = ((org.telegram.ui.ActionBar.d2) kbVar).classGuid;
                    b10 = y4.b(user, i10, e5VarArr);
                }
                if (b4.n.i(b10)) {
                    b4.n.p().C((ViewGroup) kbVar.fragmentView, kbVar.getResourceProvider(), b10, new mi.d4(this, q1Var, user));
                    return true;
                }
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public final void d1(org.telegram.ui.Cells.q1 q1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        org.telegram.messenger.zi messageObject = q1Var.getMessageObject();
        hb hbVar = this.a;
        if (hbVar.n.q0.contains(Long.valueOf(messageObject.T))) {
            hbVar.n.q0.remove(Long.valueOf(messageObject.T));
        } else {
            hbVar.n.q0.add(Long.valueOf(messageObject.T));
        }
        hbVar.n.b1(true);
        hbVar.n.W0();
        hbVar.n.F.f();
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ boolean e2(org.telegram.ui.Cells.q1 q1Var, TL_iv.PageBlock pageBlock) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ boolean f0() {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public final void f1(org.telegram.ui.Cells.q1 q1Var, int i3) {
        TLRPC.WebPage webPage;
        int i10;
        kb kbVar = this.a.n;
        org.telegram.messenger.zi messageObject = q1Var.getMessageObject();
        TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent = messageObject.J1;
        if (tL_channelAdminLogEvent != null && (tL_channelAdminLogEvent.action instanceof TLRPC.TL_channelAdminLogEventActionEditMessage)) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", -org.telegram.messenger.zi.B0(messageObject.k));
            bundle.putInt("message_id", messageObject.M1());
            wm wmVar = new wm(bundle);
            if (org.telegram.messenger.t3.c0(kbVar.f)) {
                long B0 = org.telegram.messenger.zi.B0(messageObject.k);
                i10 = ((org.telegram.ui.ActionBar.d2) kbVar).currentAccount;
                rg.c.a(wmVar, org.telegram.messenger.pr.a(B0, org.telegram.messenger.zi.c2(i10, messageObject.k, true, false)));
            }
            kbVar.presentFragment(wmVar);
            return;
        }
        if (i3 == 0) {
            TLRPC.MessageMedia messageMedia = messageObject.k.media;
            if (messageMedia == null || (webPage = messageMedia.webpage) == null || webPage.cached_page == null) {
                return;
            }
            LaunchActivity launchActivity = LaunchActivity.K1;
            if (launchActivity == null || launchActivity.O() == null || LaunchActivity.K1.O().l(messageObject) == null) {
                kbVar.createArticleViewer(false).L(messageObject, null, null, null);
                return;
            }
            return;
        }
        if (i3 != 5) {
            TLRPC.MessageMedia messageMedia2 = messageObject.k.media;
            if (messageMedia2 == null || messageMedia2.webpage == null) {
                return;
            }
            sf.c.t(kbVar.getParentActivity(), messageObject.k.media.webpage.url);
            return;
        }
        TLRPC.User a22 = kbVar.getMessagesController().a2(Long.valueOf(messageObject.k.media.user_id));
        TLRPC.MessageMedia messageMedia3 = messageObject.k.media;
        String str = messageMedia3.vcard;
        String str2 = messageMedia3.first_name;
        String str3 = messageMedia3.last_name;
        try {
            File g12 = org.telegram.messenger.g0.g1();
            g12.mkdirs();
            File file = new File(g12, "vcard.vcf");
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));
            bufferedWriter.write(str);
            bufferedWriter.close();
            kbVar.showDialog(new org.telegram.ui.Components.vc0(kbVar, null, a22, null, file, null, str2, str3, null));
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ String g(org.telegram.ui.Cells.q1 q1Var) {
        return null;
    }

    @Override // org.telegram.ui.Cells.l1
    public final void j() {
        org.telegram.messenger.t0.u();
        boolean z10 = org.telegram.messenger.r2.a;
        org.telegram.messenger.t0.r();
        sf.c.t(this.a.n.getParentActivity(), org.telegram.messenger.r2.g);
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ int j0(org.telegram.ui.Cells.q1 q1Var) {
        return 0;
    }

    @Override // org.telegram.ui.Cells.l1
    public final boolean m0() {
        return true;
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ boolean m2(int i3) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ boolean n1() {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ boolean o0(org.telegram.ui.Components.p5 p5Var) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public final void p0(org.telegram.ui.Cells.q1 q1Var, float f10, float f11) {
        kb kbVar = this.a.n;
        int i3 = kb.R0;
        kbVar.U0(q1Var, 0.0f, 0.0f);
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ boolean p1(org.telegram.ui.Cells.q1 q1Var, int i3) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ org.telegram.ui.Cells.i9 q2() {
        return null;
    }

    @Override // org.telegram.ui.Cells.l1
    public final void s(org.telegram.ui.Cells.q1 q1Var) {
        hb hbVar = this.a;
        kb kbVar = hbVar.n;
        if (kbVar.getParentActivity() == null) {
            return;
        }
        kbVar.showDialog(org.telegram.ui.Components.oo0.N0(hbVar.c, q1Var.getMessageObject(), null, org.telegram.messenger.t3.T(kbVar.f) && !kbVar.f.megagroup, null));
    }

    @Override // org.telegram.ui.Cells.l1
    public final void s0(org.telegram.ui.Cells.q1 q1Var, TLRPC.User user, float f10, float f11) {
        int i3;
        if (user != null) {
            long j10 = user.id;
            i3 = ((org.telegram.ui.ActionBar.d2) this.a.n).currentAccount;
            if (j10 != org.telegram.messenger.h10.i(i3).e()) {
                a(user);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00f5, code lost:
    
        if (r15.exists() != false) goto L55;
     */
    @Override // org.telegram.ui.Cells.l1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t0(org.telegram.ui.Cells.q1 q1Var, float f10, float f11, boolean z10) {
        int i3;
        File file;
        kb kbVar = this.a.n;
        org.telegram.messenger.zi messageObject = q1Var.getMessageObject();
        if (org.telegram.messenger.zi.k1(messageObject.k) != null) {
            kbVar.showDialog(new org.telegram.ui.Components.xv0(kbVar.getParentActivity(), kbVar, org.telegram.messenger.zi.k1(messageObject.k), null, null, null));
            return;
        }
        File file2 = null;
        if (org.telegram.messenger.zi.M4(messageObject.k) || (i3 = messageObject.D) == 1 || ((i3 == 0 && !messageObject.b5()) || org.telegram.messenger.zi.u3(messageObject.k))) {
            PhotoViewer.v1().N2(null, kbVar, null);
            PhotoViewer.v1().i2(messageObject, null, 0L, 0L, 0L, kbVar.C0);
            return;
        }
        int i10 = messageObject.D;
        if (i10 == 3) {
            try {
                String str = messageObject.k.attachPath;
                if (str != null && str.length() != 0) {
                    file2 = new File(messageObject.k.attachPath);
                }
                if (file2 == null || !file2.exists()) {
                    org.telegram.messenger.w7 fileLoader = kbVar.getFileLoader();
                    TLRPC.Message message = messageObject.k;
                    fileLoader.getClass();
                    file2 = org.telegram.messenger.w7.N(message, false, true);
                }
                Intent intent = new Intent("android.intent.action.VIEW");
                if (Build.VERSION.SDK_INT >= 24) {
                    intent.setFlags(1);
                    Activity parentActivity = kbVar.getParentActivity();
                    org.telegram.messenger.t0.d();
                    intent.setDataAndType(FileProvider.d(parentActivity, "org.telegram.messenger.beta.provider", file2), "video/mp4");
                } else {
                    intent.setDataAndType(Uri.fromFile(file2), "video/mp4");
                }
                kbVar.getParentActivity().startActivityForResult(intent, 500);
                return;
            } catch (Exception unused) {
                kb.A0(kbVar, messageObject);
                return;
            }
        }
        if (i10 == 4) {
            if (org.telegram.messenger.g0.J1(kbVar)) {
                la0 la0Var = new la0(0);
                la0Var.G0(messageObject);
                kbVar.presentFragment(la0Var);
                return;
            }
            return;
        }
        if (i10 == 9 || i10 == 0) {
            if (messageObject.I0().toLowerCase().endsWith("attheme")) {
                String str2 = messageObject.k.attachPath;
                if (str2 != null && str2.length() != 0) {
                    file = new File(messageObject.k.attachPath);
                }
                file = null;
                if (file == null) {
                    org.telegram.messenger.w7 fileLoader2 = kbVar.getFileLoader();
                    TLRPC.Message message2 = messageObject.k;
                    fileLoader2.getClass();
                    File N = org.telegram.messenger.w7.N(message2, false, true);
                    if (N.exists()) {
                        file = N;
                    }
                }
                kg.y yVar = kbVar.y;
                if (yVar != null) {
                    if (yVar.N0() < kbVar.y.B() - 1) {
                        kbVar.h0 = kbVar.y.L0();
                        org.telegram.ui.Components.bj0 bj0Var = (org.telegram.ui.Components.bj0) kbVar.w.K(kbVar.h0);
                        if (bj0Var != null) {
                            kbVar.i0 = bj0Var.a.getTop();
                        } else {
                            kbVar.h0 = -1;
                        }
                    } else {
                        kbVar.h0 = -1;
                    }
                }
                org.telegram.ui.ActionBar.j6 v = org.telegram.ui.ActionBar.k6.v(file, messageObject.I0(), null, true);
                if (v != null) {
                    kbVar.presentFragment(new l71(v));
                    return;
                }
                kbVar.h0 = -1;
            }
            try {
                org.telegram.messenger.g0.u2(messageObject, kbVar.getParentActivity(), null, false);
            } catch (Exception unused2) {
                kb.A0(kbVar, messageObject);
            }
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ boolean w1(org.telegram.ui.Cells.q1 q1Var, TLRPC.Chat chat) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ boolean x0(org.telegram.messenger.zi ziVar) {
        return true;
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ boolean y1() {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ String z(long j10) {
        return null;
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void A1(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void B(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void C(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void C1(org.telegram.messenger.zi ziVar) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void D0(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void G0(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void I(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void J(org.telegram.messenger.wi wiVar) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void K0(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final void N(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void P(org.telegram.messenger.zi ziVar) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void Q0(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void S0(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void V(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void Z1(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void e0(int i3) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void f2(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void k0(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final void n0(String str) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void p(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void t1(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void w(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void y(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void y0(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void K1() {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void c1() {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void h2() {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void o2() {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void q() {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void v() {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void z0() {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void H(org.telegram.ui.Cells.q1 q1Var, org.telegram.messenger.o2 o2Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void L0(org.telegram.ui.Cells.q1 q1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void M1(org.telegram.ui.Cells.q1 q1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void Q1(org.telegram.ui.Cells.q1 q1Var, org.telegram.messenger.g10 g10Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void U1(String str, String str2) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void a2(org.telegram.ui.Cells.q1 q1Var, long j10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void u1(org.telegram.ui.Cells.q1 q1Var, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void x1(org.telegram.ui.Cells.q1 q1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void z1(org.telegram.ui.Cells.q1 q1Var, int i3) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void A0(org.telegram.ui.Cells.q1 q1Var, TLObject tLObject, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final void E0(org.telegram.ui.Cells.q1 q1Var, boolean z10, boolean z11) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void K(org.telegram.ui.Cells.q1 q1Var, TLRPC.Document document, RectF rectF) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void h0(org.telegram.ui.Cells.q1 q1Var, float f10, float f11) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void i1(org.telegram.ui.Cells.q1 q1Var, float f10, float f11) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void p2(org.telegram.ui.Cells.q1 q1Var, int i3, int i10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final void r1(org.telegram.ui.Cells.q1 q1Var, boolean z10, boolean z11) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void N1(org.telegram.ui.Cells.q1 q1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void n(org.telegram.ui.Cells.q1 q1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i3) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void i(org.telegram.ui.Cells.q1 q1Var, ArrayList arrayList, int i3, int i10, int i11) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void i2(org.telegram.ui.Cells.q1 q1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f10, float f11) {
    }
}
