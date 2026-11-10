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

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class eb implements org.telegram.ui.Cells.l1 {
    public final /* synthetic */ jb a;

    public eb(jb jbVar) {
        this.a = jbVar;
    }

    @Override // org.telegram.ui.Cells.l1
    public final void B0(org.telegram.ui.Cells.q1 q1Var, float f10, float f11) {
        mb mbVar = this.a.n;
        int i7 = mb.Q0;
        mbVar.U0(q1Var, 0.0f, 0.0f);
    }

    @Override // org.telegram.ui.Cells.l1
    public final void B1(org.telegram.ui.Cells.q1 q1Var, TLRPC.WebPage webPage, String str, boolean z9) {
        vf.c.t(q1Var.getContext(), str);
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ CharacterStyle C1(org.telegram.ui.Cells.q1 q1Var) {
        return null;
    }

    @Override // org.telegram.ui.Cells.l1
    public final void D1(org.telegram.messenger.ij ijVar, String str, String str2, String str3, String str4, int i7, int i10) {
        mb mbVar = this.a.n;
        org.telegram.ui.Components.vt.N0(mbVar, ijVar, mbVar.B0, str2, str3, str4, str, i7, i10, -1, false);
    }

    @Override // org.telegram.ui.Cells.l1
    public final boolean E1(org.telegram.ui.Cells.q1 q1Var, org.telegram.messenger.ij ijVar) {
        if (org.telegram.messenger.ij.R4(ijVar.k) || ijVar.h4()) {
            boolean S = MediaController.B().S(ijVar);
            MediaController.B().r0(null, false);
            return S;
        }
        if (ijVar.I3()) {
            return MediaController.B().o0(this.a.n.o0, ijVar, 0L, true, null, 0L);
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ boolean J0(long j3) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ boolean J1(org.telegram.ui.Cells.q1 q1Var, TLRPC.PollAnswer pollAnswer) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public final void N0(org.telegram.ui.Cells.q1 q1Var, CharacterStyle characterStyle, boolean z9) {
        TLRPC.WebPage webPage;
        int i7;
        int i10;
        int i11;
        int i12;
        int i13;
        mb mbVar = this.a.n;
        if (characterStyle == null) {
            return;
        }
        org.telegram.messenger.ij messageObject = q1Var.getMessageObject();
        if (characterStyle instanceof org.telegram.ui.Components.a41) {
            org.telegram.ui.Components.a41 a41Var = (org.telegram.ui.Components.a41) characterStyle;
            org.telegram.messenger.g0.g(a41Var.a.subSequence(a41Var.b, a41Var.c).toString());
            if (org.telegram.messenger.g0.I3()) {
                Toast.makeText(mbVar.getParentActivity(), org.telegram.messenger.id.M0(2131744194, null), 0).show();
                return;
            }
            return;
        }
        if (characterStyle instanceof org.telegram.ui.Components.e41) {
            Long A = Utilities.A(((org.telegram.ui.Components.e41) characterStyle).getURL());
            long longValue = A.longValue();
            if (longValue > 0) {
                i12 = ((org.telegram.ui.ActionBar.f2) mbVar).currentAccount;
                TLRPC.User a22 = org.telegram.messenger.qp.s1(i12).a2(A);
                if (a22 != null) {
                    i13 = ((org.telegram.ui.ActionBar.f2) mbVar).currentAccount;
                    org.telegram.messenger.qp.s1(i13).z3(a22, null, mbVar, 0);
                    return;
                }
                return;
            }
            i10 = ((org.telegram.ui.ActionBar.f2) mbVar).currentAccount;
            TLRPC.Chat M0 = org.telegram.messenger.qp.s1(i10).M0(Long.valueOf(-longValue));
            if (M0 != null) {
                i11 = ((org.telegram.ui.ActionBar.f2) mbVar).currentAccount;
                org.telegram.messenger.qp.s1(i11).z3(null, M0, mbVar, 0);
                return;
            }
            return;
        }
        if (characterStyle instanceof org.telegram.ui.Components.b41) {
            String url = ((org.telegram.ui.Components.b41) characterStyle).getURL();
            if (url.startsWith("@")) {
                i7 = ((org.telegram.ui.ActionBar.f2) mbVar).currentAccount;
                org.telegram.messenger.qp.s1(i7).y3(url.substring(1), mbVar, 0, null);
                return;
            } else {
                if (url.startsWith("#")) {
                    zw zwVar = new zw(null);
                    zwVar.o2 = url;
                    mbVar.presentFragment(zwVar);
                    return;
                }
                return;
            }
        }
        String url2 = ((URLSpan) characterStyle).getURL();
        if (z9) {
            org.telegram.ui.ActionBar.w2 h = org.telegram.messenger.camera.q.h(mbVar.getParentActivity(), false, 1, null);
            h.O = url2;
            h.P = false;
            CharSequence[] charSequenceArr = {org.telegram.messenger.id.M0(2131747817, null), org.telegram.messenger.id.M0(2131751767, null)};
            og.j jVar = new og.j(2, this, url2);
            h.L = charSequenceArr;
            h.K = jVar;
            mbVar.showDialog(h);
            return;
        }
        if (characterStyle instanceof org.telegram.ui.Components.d41) {
            String url3 = ((org.telegram.ui.Components.d41) characterStyle).getURL();
            if (vf.c.g(Uri.parse(url3), false, null)) {
                vf.c.p(mbVar.getParentActivity(), url3, true);
                return;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(mbVar.getParentActivity());
            String M02 = org.telegram.messenger.id.M0(2131747779, null);
            org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
            u1Var.R = M02;
            u1Var.T = org.telegram.messenger.id.a0(null, null, 2131747782, url3);
            alertDialog$Builder.k(org.telegram.messenger.id.M0(2131747817, null), new ni.c(5, mbVar, url3));
            alertDialog$Builder.h(org.telegram.messenger.id.M0(2131752589, null), null);
            mbVar.showDialog(u1Var);
            return;
        }
        TLRPC.MessageMedia messageMedia = messageObject.k.media;
        if ((messageMedia instanceof TLRPC.TL_messageMediaWebPage) && (webPage = messageMedia.webpage) != null && webPage.cached_page != null) {
            String lowerCase = url2.toLowerCase();
            String lowerCase2 = messageObject.k.media.webpage.url.toLowerCase();
            if ((vf.c.i(lowerCase, false, false) || lowerCase.contains("t.me/iv")) && (lowerCase.contains(lowerCase2) || lowerCase2.contains(lowerCase))) {
                LaunchActivity launchActivity = LaunchActivity.G1;
                if (launchActivity == null || launchActivity.O() == null || LaunchActivity.G1.O().l(messageObject) == null) {
                    mbVar.createArticleViewer(false).L(messageObject, null, null, null);
                    return;
                }
                return;
            }
        }
        vf.c.p(mbVar.getParentActivity(), url2, true);
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ ir0 N1() {
        return null;
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ boolean O0(org.telegram.ui.Cells.q1 q1Var, boolean z9) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ boolean Q(org.telegram.ui.Cells.q1 q1Var, TLRPC.TodoItem todoItem, boolean z9) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ boolean Q1(long j3) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ boolean R() {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public final void R1(org.telegram.ui.Cells.q1 q1Var, int i7, float f10, float f11, boolean z9) {
        org.telegram.messenger.ij ijVar = q1Var.getMessageObject().C;
        long B0 = org.telegram.messenger.ij.B0(ijVar.k);
        mb mbVar = this.a.n;
        if (B0 == (-mbVar.f.id)) {
            for (int i10 = 0; i10 < mbVar.o0.size(); i10++) {
                org.telegram.messenger.ij ijVar2 = (org.telegram.messenger.ij) mbVar.o0.get(i10);
                if (ijVar2 != null && ijVar2.U != 1 && ijVar2.L1() == ijVar.L1()) {
                    mbVar.d1(ijVar2);
                    return;
                }
            }
        }
        Bundle bundle = new Bundle();
        bundle.putLong("chat_id", mbVar.f.id);
        bundle.putInt("message_id", ijVar.L1());
        mbVar.presentFragment(new cn(bundle));
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ boolean S(org.telegram.ui.Cells.q1 q1Var) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ boolean S1(org.telegram.ui.Cells.q1 q1Var, TLRPC.TodoItem todoItem) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ boolean T() {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public final void U(org.telegram.ui.Cells.q1 q1Var, TLRPC.Chat chat, int i7, float f10, float f11, boolean z9) {
        int i10;
        mb mbVar = this.a.n;
        if (chat == null || chat == mbVar.f) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("chat_id", chat.id);
        if (i7 != 0) {
            bundle.putInt("message_id", i7);
        }
        i10 = ((org.telegram.ui.ActionBar.f2) mbVar).currentAccount;
        if (org.telegram.messenger.qp.s1(i10).E(bundle, mbVar, null, null)) {
            mbVar.presentFragment(new cn(bundle), true);
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ boolean W0(org.telegram.messenger.ij ijVar) {
        return org.telegram.ui.Cells.f1.a(ijVar);
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ int X() {
        return 0;
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ jh.a Z() {
        return null;
    }

    public final void a(TLRPC.User user) {
        Bundle bundle = new Bundle();
        bundle.putLong("user_id", user.id);
        jb jbVar = this.a;
        mb.u0(jbVar.n, bundle, user.id);
        ProfileActivity profileActivity = new ProfileActivity(bundle, null);
        profileActivity.j5(0);
        jbVar.n.presentFragment(profileActivity);
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ boolean a0(org.telegram.ui.Cells.q1 q1Var) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public final boolean b0(org.telegram.ui.Cells.q1 q1Var, TLRPC.User user) {
        int i7;
        int i10;
        w4 b10;
        mb mbVar = this.a.n;
        if (user != null) {
            long j3 = user.id;
            i7 = ((org.telegram.ui.ActionBar.f2) mbVar).currentAccount;
            if (j3 != org.telegram.messenger.p10.i(i7).e()) {
                c5[] c5VarArr = {c5.d, c5.h};
                TLRPC.UserFull b22 = mbVar.getMessagesController().b2(user.id);
                if (b22 != null) {
                    b10 = w4.c(user, b22, c5VarArr);
                } else {
                    i10 = ((org.telegram.ui.ActionBar.f2) mbVar).classGuid;
                    b10 = w4.b(user, i10, c5VarArr);
                }
                if (ab.q.i(b10)) {
                    ab.q.o().C((ViewGroup) mbVar.fragmentView, mbVar.getResourceProvider(), b10, new ni.c(this, q1Var, user));
                    return true;
                }
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public final void b1(org.telegram.ui.Cells.q1 q1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        org.telegram.messenger.ij messageObject = q1Var.getMessageObject();
        jb jbVar = this.a;
        if (jbVar.n.p0.contains(Long.valueOf(messageObject.T))) {
            jbVar.n.p0.remove(Long.valueOf(messageObject.T));
        } else {
            jbVar.n.p0.add(Long.valueOf(messageObject.T));
        }
        jbVar.n.b1(true);
        jbVar.n.W0();
        jbVar.n.E.f();
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ boolean b2(org.telegram.ui.Cells.q1 q1Var, TL_iv.PageBlock pageBlock) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public final boolean d() {
        return true;
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ boolean e0() {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public final boolean g() {
        return true;
    }

    @Override // org.telegram.ui.Cells.l1
    public final void g1(org.telegram.ui.Cells.q1 q1Var, int i7) {
        TLRPC.WebPage webPage;
        int i10;
        mb mbVar = this.a.n;
        org.telegram.messenger.ij messageObject = q1Var.getMessageObject();
        TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent = messageObject.J1;
        if (tL_channelAdminLogEvent != null && (tL_channelAdminLogEvent.action instanceof TLRPC.TL_channelAdminLogEventActionEditMessage)) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", -org.telegram.messenger.ij.B0(messageObject.k));
            bundle.putInt("message_id", messageObject.L1());
            cn cnVar = new cn(bundle);
            if (org.telegram.messenger.t3.c0(mbVar.f)) {
                long B0 = org.telegram.messenger.ij.B0(messageObject.k);
                i10 = ((org.telegram.ui.ActionBar.f2) mbVar).currentAccount;
                qg.d.a(cnVar, org.telegram.messenger.xr.a(B0, org.telegram.messenger.ij.b2(i10, messageObject.k, true, false)));
            }
            mbVar.presentFragment(cnVar);
            return;
        }
        if (i7 == 0) {
            TLRPC.MessageMedia messageMedia = messageObject.k.media;
            if (messageMedia == null || (webPage = messageMedia.webpage) == null || webPage.cached_page == null) {
                return;
            }
            LaunchActivity launchActivity = LaunchActivity.G1;
            if (launchActivity == null || launchActivity.O() == null || LaunchActivity.G1.O().l(messageObject) == null) {
                mbVar.createArticleViewer(false).L(messageObject, null, null, null);
                return;
            }
            return;
        }
        if (i7 != 5) {
            TLRPC.MessageMedia messageMedia2 = messageObject.k.media;
            if (messageMedia2 == null || messageMedia2.webpage == null) {
                return;
            }
            vf.c.t(mbVar.getParentActivity(), messageObject.k.media.webpage.url);
            return;
        }
        TLRPC.User a22 = mbVar.getMessagesController().a2(Long.valueOf(messageObject.k.media.user_id));
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
            mbVar.showDialog(new org.telegram.ui.Components.ad0(mbVar, null, a22, null, file, null, str2, str3, null));
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ boolean g2(int i7) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ String h(org.telegram.ui.Cells.q1 q1Var) {
        return null;
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ int h0(org.telegram.ui.Cells.q1 q1Var) {
        return 0;
    }

    @Override // org.telegram.ui.Cells.l1
    public final void k() {
        org.telegram.messenger.t0.u();
        boolean z9 = org.telegram.messenger.r2.a;
        org.telegram.messenger.t0.r();
        vf.c.t(this.a.n.getParentActivity(), org.telegram.messenger.r2.g);
    }

    @Override // org.telegram.ui.Cells.l1
    public final boolean k0() {
        return true;
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ org.telegram.ui.Cells.j9 k2() {
        return null;
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ boolean n0(org.telegram.ui.Components.q5 q5Var) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ boolean n1() {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public final void p0(org.telegram.ui.Cells.q1 q1Var, float f10, float f11) {
        mb mbVar = this.a.n;
        int i7 = mb.Q0;
        mbVar.U0(q1Var, 0.0f, 0.0f);
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ boolean p1(org.telegram.ui.Cells.q1 q1Var, int i7) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public final void r(org.telegram.ui.Cells.q1 q1Var) {
        jb jbVar = this.a;
        mb mbVar = jbVar.n;
        if (mbVar.getParentActivity() == null) {
            return;
        }
        mbVar.showDialog(org.telegram.ui.Components.mo0.N0(jbVar.c, q1Var.getMessageObject(), null, org.telegram.messenger.t3.T(mbVar.f) && !mbVar.f.megagroup, null));
    }

    @Override // org.telegram.ui.Cells.l1
    public final void s0(org.telegram.ui.Cells.q1 q1Var, TLRPC.User user, float f10, float f11) {
        int i7;
        if (user != null) {
            long j3 = user.id;
            i7 = ((org.telegram.ui.ActionBar.f2) this.a.n).currentAccount;
            if (j3 != org.telegram.messenger.p10.i(i7).e()) {
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
    public final void u0(org.telegram.ui.Cells.q1 q1Var, float f10, float f11, boolean z9) {
        int i7;
        File file;
        mb mbVar = this.a.n;
        org.telegram.messenger.ij messageObject = q1Var.getMessageObject();
        if (org.telegram.messenger.ij.j1(messageObject.k) != null) {
            mbVar.showDialog(new org.telegram.ui.Components.yv0(mbVar.getParentActivity(), mbVar, org.telegram.messenger.ij.j1(messageObject.k), null, null, null));
            return;
        }
        File file2 = null;
        if (org.telegram.messenger.ij.L4(messageObject.k) || (i7 = messageObject.D) == 1 || ((i7 == 0 && !messageObject.a5()) || org.telegram.messenger.ij.t3(messageObject.k))) {
            PhotoViewer.p1().H2(null, mbVar, null);
            PhotoViewer.p1().d2(messageObject, null, 0L, 0L, 0L, mbVar.B0);
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
                    org.telegram.messenger.w7 fileLoader = mbVar.getFileLoader();
                    TLRPC.Message message = messageObject.k;
                    fileLoader.getClass();
                    file2 = org.telegram.messenger.w7.M(message, false, true);
                }
                Intent intent = new Intent("android.intent.action.VIEW");
                if (Build.VERSION.SDK_INT >= 24) {
                    intent.setFlags(1);
                    Activity parentActivity = mbVar.getParentActivity();
                    org.telegram.messenger.t0.d();
                    intent.setDataAndType(FileProvider.d(parentActivity, "org.telegram.messenger.beta.provider", file2), "video/mp4");
                } else {
                    intent.setDataAndType(Uri.fromFile(file2), "video/mp4");
                }
                mbVar.getParentActivity().startActivityForResult(intent, 500);
                return;
            } catch (Exception unused) {
                mb.A0(mbVar, messageObject);
                return;
            }
        }
        if (i10 == 4) {
            if (org.telegram.messenger.g0.J1(mbVar)) {
                sa0 sa0Var = new sa0(0);
                sa0Var.G0(messageObject);
                mbVar.presentFragment(sa0Var);
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
                    org.telegram.messenger.w7 fileLoader2 = mbVar.getFileLoader();
                    TLRPC.Message message2 = messageObject.k;
                    fileLoader2.getClass();
                    File M = org.telegram.messenger.w7.M(message2, false, true);
                    if (M.exists()) {
                        file = M;
                    }
                }
                jg.b0 b0Var = mbVar.y;
                if (b0Var != null) {
                    if (b0Var.N0() < mbVar.y.B() - 1) {
                        mbVar.g0 = mbVar.y.L0();
                        org.telegram.ui.Components.xi0 xi0Var = (org.telegram.ui.Components.xi0) mbVar.w.K(mbVar.g0);
                        if (xi0Var != null) {
                            mbVar.h0 = xi0Var.a.getTop();
                        } else {
                            mbVar.g0 = -1;
                        }
                    } else {
                        mbVar.g0 = -1;
                    }
                }
                org.telegram.ui.ActionBar.l6 v = org.telegram.ui.ActionBar.m6.v(file, messageObject.I0(), null, true);
                if (v != null) {
                    mbVar.presentFragment(new x71(v));
                    return;
                }
                mbVar.g0 = -1;
            }
            try {
                org.telegram.messenger.g0.u2(messageObject, mbVar.getParentActivity(), null, false);
            } catch (Exception unused2) {
                mb.A0(mbVar, messageObject);
            }
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ boolean u1(org.telegram.ui.Cells.q1 q1Var, TLRPC.Chat chat) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ boolean w1() {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ boolean x0(org.telegram.messenger.ij ijVar) {
        return true;
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ String y(long j3) {
        return null;
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void A1(org.telegram.messenger.ij ijVar) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void C(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void D0(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void G0(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void H(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void J(org.telegram.messenger.fj fjVar) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void K0(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final void N(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void P(org.telegram.messenger.ij ijVar) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void P0(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void Q0(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void U1(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void V(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void c2(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void d0(int i7) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void i0(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final void m0(String str) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void o(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void r1(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void v(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void x(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void y0(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void y1(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void z(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void F1() {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void Z0() {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void e2() {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void i2() {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void p() {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void u() {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void z0() {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void G(org.telegram.ui.Cells.q1 q1Var, org.telegram.messenger.o2 o2Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void H1(org.telegram.ui.Cells.q1 q1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void K1(org.telegram.ui.Cells.q1 q1Var, org.telegram.messenger.o10 o10Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void L0(org.telegram.ui.Cells.q1 q1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void P1(String str, String str2) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void W1(org.telegram.ui.Cells.q1 q1Var, long j3) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void s1(org.telegram.ui.Cells.q1 q1Var, boolean z9) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void v1(org.telegram.ui.Cells.q1 q1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void x1(org.telegram.ui.Cells.q1 q1Var, int i7) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void A0(org.telegram.ui.Cells.q1 q1Var, TLObject tLObject, boolean z9) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final void E0(org.telegram.ui.Cells.q1 q1Var, boolean z9, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void K(org.telegram.ui.Cells.q1 q1Var, TLRPC.Document document, RectF rectF) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void g0(org.telegram.ui.Cells.q1 q1Var, float f10, float f11) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void j1(org.telegram.ui.Cells.q1 q1Var, float f10, float f11) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void j2(org.telegram.ui.Cells.q1 q1Var, int i7, int i10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final void q1(org.telegram.ui.Cells.q1 q1Var, boolean z9, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void I1(org.telegram.ui.Cells.q1 q1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void n(org.telegram.ui.Cells.q1 q1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i7) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void f2(org.telegram.ui.Cells.q1 q1Var, TLRPC.ReactionCount reactionCount, boolean z9, float f10, float f11) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void j(org.telegram.ui.Cells.q1 q1Var, ArrayList arrayList, int i7, int i10, int i11) {
    }
}
