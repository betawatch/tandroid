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

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class db implements org.telegram.ui.Cells.m1 {
    public final /* synthetic */ ib a;

    public db(ib ibVar) {
        this.a = ibVar;
    }

    @Override // org.telegram.ui.Cells.m1
    public final void A0(org.telegram.ui.Cells.r1 r1Var, TLRPC.User user, float f10, float f11) {
        int i7;
        if (user != null) {
            long j3 = user.id;
            i7 = ((org.telegram.ui.ActionBar.g2) this.a.n).currentAccount;
            if (j3 != org.telegram.messenger.i10.i(i7).e()) {
                a(user);
            }
        }
    }

    @Override // org.telegram.ui.Cells.m1
    public final /* synthetic */ org.telegram.ui.Cells.j9 B2() {
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00f5, code lost:
    
        if (r15.exists() != false) goto L55;
     */
    @Override // org.telegram.ui.Cells.m1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void C0(org.telegram.ui.Cells.r1 r1Var, float f10, float f11, boolean z10) {
        int i7;
        File file;
        lb lbVar = this.a.n;
        org.telegram.messenger.fj messageObject = r1Var.getMessageObject();
        if (org.telegram.messenger.fj.j1(messageObject.k) != null) {
            lbVar.showDialog(new org.telegram.ui.Components.jw0(lbVar.getParentActivity(), lbVar, org.telegram.messenger.fj.j1(messageObject.k), null, null, null));
            return;
        }
        File file2 = null;
        if (org.telegram.messenger.fj.L4(messageObject.k) || (i7 = messageObject.D) == 1 || ((i7 == 0 && !messageObject.a5()) || org.telegram.messenger.fj.t3(messageObject.k))) {
            PhotoViewer.p1().J2(null, lbVar, null);
            PhotoViewer.p1().f2(messageObject, null, 0L, 0L, 0L, lbVar.C0);
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
                    org.telegram.messenger.w7 fileLoader = lbVar.getFileLoader();
                    TLRPC.Message message = messageObject.k;
                    fileLoader.getClass();
                    file2 = org.telegram.messenger.w7.M(message, false, true);
                }
                Intent intent = new Intent("android.intent.action.VIEW");
                if (Build.VERSION.SDK_INT >= 24) {
                    intent.setFlags(1);
                    Activity parentActivity = lbVar.getParentActivity();
                    org.telegram.messenger.t0.d();
                    intent.setDataAndType(FileProvider.d(parentActivity, "org.telegram.messenger.beta.provider", file2), "video/mp4");
                } else {
                    intent.setDataAndType(Uri.fromFile(file2), "video/mp4");
                }
                lbVar.getParentActivity().startActivityForResult(intent, 500);
                return;
            } catch (Exception unused) {
                lb.A0(lbVar, messageObject);
                return;
            }
        }
        if (i10 == 4) {
            if (org.telegram.messenger.g0.J1(lbVar)) {
                pa0 pa0Var = new pa0(0);
                pa0Var.G0(messageObject);
                lbVar.presentFragment(pa0Var);
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
                    org.telegram.messenger.w7 fileLoader2 = lbVar.getFileLoader();
                    TLRPC.Message message2 = messageObject.k;
                    fileLoader2.getClass();
                    File M = org.telegram.messenger.w7.M(message2, false, true);
                    if (M.exists()) {
                        file = M;
                    }
                }
                jg.b0 b0Var = lbVar.y;
                if (b0Var != null) {
                    if (b0Var.N0() < lbVar.y.B() - 1) {
                        lbVar.h0 = lbVar.y.L0();
                        org.telegram.ui.Components.mj0 mj0Var = (org.telegram.ui.Components.mj0) lbVar.w.K(lbVar.h0);
                        if (mj0Var != null) {
                            lbVar.i0 = mj0Var.a.getTop();
                        } else {
                            lbVar.h0 = -1;
                        }
                    } else {
                        lbVar.h0 = -1;
                    }
                }
                org.telegram.ui.ActionBar.m6 v = org.telegram.ui.ActionBar.n6.v(file, messageObject.I0(), null, true);
                if (v != null) {
                    lbVar.presentFragment(new v71(v));
                    return;
                }
                lbVar.h0 = -1;
            }
            try {
                org.telegram.messenger.g0.u2(messageObject, lbVar.getParentActivity(), null, false);
            } catch (Exception unused2) {
                lb.A0(lbVar, messageObject);
            }
        }
    }

    @Override // org.telegram.ui.Cells.m1
    public final /* synthetic */ String D(long j3) {
        return null;
    }

    @Override // org.telegram.ui.Cells.m1
    public final /* synthetic */ boolean F0(org.telegram.messenger.fj fjVar) {
        return true;
    }

    @Override // org.telegram.ui.Cells.m1
    public final /* synthetic */ boolean H1(org.telegram.ui.Cells.r1 r1Var, TLRPC.Chat chat) {
        return false;
    }

    @Override // org.telegram.ui.Cells.m1
    public final void J0(org.telegram.ui.Cells.r1 r1Var, float f10, float f11) {
        lb lbVar = this.a.n;
        int i7 = lb.R0;
        lbVar.U0(r1Var, 0.0f, 0.0f);
    }

    @Override // org.telegram.ui.Cells.m1
    public final /* synthetic */ boolean J1() {
        return false;
    }

    @Override // org.telegram.ui.Cells.m1
    public final void Q1(org.telegram.ui.Cells.r1 r1Var, TLRPC.WebPage webPage, String str, boolean z10) {
        vf.c.t(r1Var.getContext(), str);
    }

    @Override // org.telegram.ui.Cells.m1
    public final /* synthetic */ boolean R0(long j3) {
        return false;
    }

    @Override // org.telegram.ui.Cells.m1
    public final /* synthetic */ CharacterStyle R1(org.telegram.ui.Cells.r1 r1Var) {
        return null;
    }

    @Override // org.telegram.ui.Cells.m1
    public final void S1(org.telegram.messenger.fj fjVar, String str, String str2, String str3, String str4, int i7, int i10) {
        lb lbVar = this.a.n;
        org.telegram.ui.Components.gu.O0(lbVar, fjVar, lbVar.C0, str2, str3, str4, str, i7, i10, -1, false);
    }

    @Override // org.telegram.ui.Cells.m1
    public final boolean T1(org.telegram.ui.Cells.r1 r1Var, org.telegram.messenger.fj fjVar) {
        if (org.telegram.messenger.fj.R4(fjVar.k) || fjVar.h4()) {
            boolean S = MediaController.B().S(fjVar);
            MediaController.B().r0(null, false);
            return S;
        }
        if (fjVar.I3()) {
            return MediaController.B().o0(this.a.n.p0, fjVar, 0L, true, null, 0L);
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.m1
    public final /* synthetic */ boolean X(org.telegram.ui.Cells.r1 r1Var, TLRPC.TodoItem todoItem, boolean z10) {
        return false;
    }

    @Override // org.telegram.ui.Cells.m1
    public final /* synthetic */ boolean Y() {
        return false;
    }

    @Override // org.telegram.ui.Cells.m1
    public final /* synthetic */ boolean Z(org.telegram.ui.Cells.r1 r1Var) {
        return false;
    }

    public final void a(TLRPC.User user) {
        Bundle bundle = new Bundle();
        bundle.putLong("user_id", user.id);
        ib ibVar = this.a;
        lb.u0(ibVar.n, bundle, user.id);
        ProfileActivity profileActivity = new ProfileActivity(bundle, null);
        profileActivity.j5(0);
        ibVar.n.presentFragment(profileActivity);
    }

    @Override // org.telegram.ui.Cells.m1
    public final void a1(org.telegram.ui.Cells.r1 r1Var, CharacterStyle characterStyle, boolean z10) {
        TLRPC.WebPage webPage;
        int i7;
        int i10;
        int i11;
        int i12;
        int i13;
        lb lbVar = this.a.n;
        if (characterStyle == null) {
            return;
        }
        org.telegram.messenger.fj messageObject = r1Var.getMessageObject();
        if (characterStyle instanceof org.telegram.ui.Components.q41) {
            org.telegram.ui.Components.q41 q41Var = (org.telegram.ui.Components.q41) characterStyle;
            org.telegram.messenger.g0.g(q41Var.a.subSequence(q41Var.b, q41Var.c).toString());
            if (org.telegram.messenger.g0.G3()) {
                Toast.makeText(lbVar.getParentActivity(), org.telegram.messenger.gd.N0(2131743949, null), 0).show();
                return;
            }
            return;
        }
        if (characterStyle instanceof org.telegram.ui.Components.u41) {
            Long A = Utilities.A(((org.telegram.ui.Components.u41) characterStyle).getURL());
            long longValue = A.longValue();
            if (longValue > 0) {
                i12 = ((org.telegram.ui.ActionBar.g2) lbVar).currentAccount;
                TLRPC.User c22 = org.telegram.messenger.mp.u1(i12).c2(A);
                if (c22 != null) {
                    i13 = ((org.telegram.ui.ActionBar.g2) lbVar).currentAccount;
                    org.telegram.messenger.mp.u1(i13).G3(c22, null, lbVar, 0);
                    return;
                }
                return;
            }
            i10 = ((org.telegram.ui.ActionBar.g2) lbVar).currentAccount;
            TLRPC.Chat O0 = org.telegram.messenger.mp.u1(i10).O0(Long.valueOf(-longValue));
            if (O0 != null) {
                i11 = ((org.telegram.ui.ActionBar.g2) lbVar).currentAccount;
                org.telegram.messenger.mp.u1(i11).G3(null, O0, lbVar, 0);
                return;
            }
            return;
        }
        if (characterStyle instanceof org.telegram.ui.Components.r41) {
            String url = ((org.telegram.ui.Components.r41) characterStyle).getURL();
            if (url.startsWith("@")) {
                i7 = ((org.telegram.ui.ActionBar.g2) lbVar).currentAccount;
                org.telegram.messenger.mp.u1(i7).F3(url.substring(1), lbVar, 0, null);
                return;
            } else {
                if (url.startsWith("#")) {
                    bx bxVar = new bx(null);
                    bxVar.p2 = url;
                    lbVar.presentFragment(bxVar);
                    return;
                }
                return;
            }
        }
        String url2 = ((URLSpan) characterStyle).getURL();
        if (z10) {
            org.telegram.ui.ActionBar.w2 j3 = org.telegram.messenger.m10.j(lbVar.getParentActivity(), false, 1, null);
            j3.P = url2;
            j3.Q = false;
            CharSequence[] charSequenceArr = {org.telegram.messenger.gd.N0(2131747623, null), org.telegram.messenger.gd.N0(2131751755, null)};
            og.j jVar = new og.j(2, this, url2);
            j3.M = charSequenceArr;
            j3.L = jVar;
            lbVar.showDialog(j3);
            return;
        }
        if (characterStyle instanceof org.telegram.ui.Components.t41) {
            String url3 = ((org.telegram.ui.Components.t41) characterStyle).getURL();
            if (vf.c.g(Uri.parse(url3), false, null)) {
                vf.c.p(lbVar.getParentActivity(), url3, true);
                return;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(lbVar.getParentActivity());
            String N0 = org.telegram.messenger.gd.N0(2131747585, null);
            org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
            t1Var.S = N0;
            t1Var.U = org.telegram.messenger.gd.a0(null, null, 2131747588, url3);
            alertDialog$Builder.k(org.telegram.messenger.gd.N0(2131747623, null), new oi.f0(7, lbVar, url3));
            alertDialog$Builder.h(org.telegram.messenger.gd.N0(2131752577, null), null);
            lbVar.showDialog(t1Var);
            return;
        }
        TLRPC.MessageMedia messageMedia = messageObject.k.media;
        if ((messageMedia instanceof TLRPC.TL_messageMediaWebPage) && (webPage = messageMedia.webpage) != null && webPage.cached_page != null) {
            String lowerCase = url2.toLowerCase();
            String lowerCase2 = messageObject.k.media.webpage.url.toLowerCase();
            if ((vf.c.i(lowerCase, false, false) || lowerCase.contains("t.me/iv")) && (lowerCase.contains(lowerCase2) || lowerCase2.contains(lowerCase))) {
                LaunchActivity launchActivity = LaunchActivity.H1;
                if (launchActivity == null || launchActivity.N() == null || LaunchActivity.H1.N().l(messageObject) == null) {
                    lbVar.createArticleViewer(false).L(messageObject, null, null, null);
                    return;
                }
                return;
            }
        }
        vf.c.p(lbVar.getParentActivity(), url2, true);
    }

    @Override // org.telegram.ui.Cells.m1
    public final /* synthetic */ boolean a2(org.telegram.ui.Cells.r1 r1Var, TLRPC.PollAnswer pollAnswer) {
        return false;
    }

    @Override // org.telegram.ui.Cells.m1
    public final /* synthetic */ boolean b0() {
        return false;
    }

    @Override // org.telegram.ui.Cells.m1
    public final void c0(org.telegram.ui.Cells.r1 r1Var, TLRPC.Chat chat, int i7, float f10, float f11, boolean z10) {
        int i10;
        lb lbVar = this.a.n;
        if (chat == null || chat == lbVar.f) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("chat_id", chat.id);
        if (i7 != 0) {
            bundle.putInt("message_id", i7);
        }
        i10 = ((org.telegram.ui.ActionBar.g2) lbVar).currentAccount;
        if (org.telegram.messenger.mp.u1(i10).E(bundle, lbVar, null, null)) {
            lbVar.presentFragment(new bn(bundle), true);
        }
    }

    @Override // org.telegram.ui.Cells.m1
    public final /* synthetic */ boolean c1(org.telegram.ui.Cells.r1 r1Var, boolean z10) {
        return false;
    }

    @Override // org.telegram.ui.Cells.m1
    public final /* synthetic */ fr0 c2() {
        return null;
    }

    @Override // org.telegram.ui.Cells.m1
    public final boolean d() {
        return true;
    }

    @Override // org.telegram.ui.Cells.m1
    public final /* synthetic */ int e0() {
        return 0;
    }

    @Override // org.telegram.ui.Cells.m1
    public final /* synthetic */ boolean f2(long j3) {
        return false;
    }

    @Override // org.telegram.ui.Cells.m1
    public final /* synthetic */ boolean g1(org.telegram.messenger.fj fjVar) {
        return org.telegram.ui.Cells.c0.a(fjVar);
    }

    @Override // org.telegram.ui.Cells.m1
    public final void g2(org.telegram.ui.Cells.r1 r1Var, int i7, float f10, float f11, boolean z10) {
        org.telegram.messenger.fj fjVar = r1Var.getMessageObject().C;
        long B0 = org.telegram.messenger.fj.B0(fjVar.k);
        lb lbVar = this.a.n;
        if (B0 == (-lbVar.f.id)) {
            for (int i10 = 0; i10 < lbVar.p0.size(); i10++) {
                org.telegram.messenger.fj fjVar2 = (org.telegram.messenger.fj) lbVar.p0.get(i10);
                if (fjVar2 != null && fjVar2.U != 1 && fjVar2.L1() == fjVar.L1()) {
                    lbVar.d1(fjVar2);
                    return;
                }
            }
        }
        Bundle bundle = new Bundle();
        bundle.putLong("chat_id", lbVar.f.id);
        bundle.putInt("message_id", fjVar.L1());
        lbVar.presentFragment(new bn(bundle));
    }

    @Override // org.telegram.ui.Cells.m1
    public final /* synthetic */ jh.a h0() {
        return null;
    }

    @Override // org.telegram.ui.Cells.m1
    public final boolean i() {
        return true;
    }

    @Override // org.telegram.ui.Cells.m1
    public final /* synthetic */ boolean j0(org.telegram.ui.Cells.r1 r1Var) {
        return false;
    }

    @Override // org.telegram.ui.Cells.m1
    public final /* synthetic */ boolean j2(org.telegram.ui.Cells.r1 r1Var, TLRPC.TodoItem todoItem) {
        return false;
    }

    @Override // org.telegram.ui.Cells.m1
    public final /* synthetic */ String k(org.telegram.ui.Cells.r1 r1Var) {
        return null;
    }

    @Override // org.telegram.ui.Cells.m1
    public final boolean k0(org.telegram.ui.Cells.r1 r1Var, TLRPC.User user) {
        int i7;
        int i10;
        w4 b10;
        lb lbVar = this.a.n;
        if (user != null) {
            long j3 = user.id;
            i7 = ((org.telegram.ui.ActionBar.g2) lbVar).currentAccount;
            if (j3 != org.telegram.messenger.i10.i(i7).e()) {
                c5[] c5VarArr = {c5.d, c5.h};
                TLRPC.UserFull d2 = lbVar.getMessagesController().d2(user.id);
                if (d2 != null) {
                    b10 = w4.c(user, d2, c5VarArr);
                } else {
                    i10 = ((org.telegram.ui.ActionBar.g2) lbVar).classGuid;
                    b10 = w4.b(user, i10, c5VarArr);
                }
                if (ab.q.i(b10)) {
                    ab.q.p().D((ViewGroup) lbVar.fragmentView, lbVar.getResourceProvider(), b10, new oi.f0(this, r1Var, user));
                    return true;
                }
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.m1
    public final void m1(org.telegram.ui.Cells.r1 r1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        org.telegram.messenger.fj messageObject = r1Var.getMessageObject();
        ib ibVar = this.a;
        if (ibVar.n.q0.contains(Long.valueOf(messageObject.T))) {
            ibVar.n.q0.remove(Long.valueOf(messageObject.T));
        } else {
            ibVar.n.q0.add(Long.valueOf(messageObject.T));
        }
        ibVar.n.b1(true);
        ibVar.n.W0();
        ibVar.n.F.f();
    }

    @Override // org.telegram.ui.Cells.m1
    public final /* synthetic */ boolean n0() {
        return false;
    }

    @Override // org.telegram.ui.Cells.m1
    public final void p() {
        org.telegram.messenger.t0.u();
        boolean z10 = org.telegram.messenger.s2.a;
        org.telegram.messenger.t0.r();
        vf.c.t(this.a.n.getParentActivity(), org.telegram.messenger.s2.g);
    }

    @Override // org.telegram.ui.Cells.m1
    public final /* synthetic */ int p0(org.telegram.ui.Cells.r1 r1Var) {
        return 0;
    }

    @Override // org.telegram.ui.Cells.m1
    public final void p1(org.telegram.ui.Cells.r1 r1Var, int i7) {
        TLRPC.WebPage webPage;
        int i10;
        lb lbVar = this.a.n;
        org.telegram.messenger.fj messageObject = r1Var.getMessageObject();
        TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent = messageObject.L1;
        if (tL_channelAdminLogEvent != null && (tL_channelAdminLogEvent.action instanceof TLRPC.TL_channelAdminLogEventActionEditMessage)) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", -org.telegram.messenger.fj.B0(messageObject.k));
            bundle.putInt("message_id", messageObject.L1());
            bn bnVar = new bn(bundle);
            if (org.telegram.messenger.v3.c0(lbVar.f)) {
                long B0 = org.telegram.messenger.fj.B0(messageObject.k);
                i10 = ((org.telegram.ui.ActionBar.g2) lbVar).currentAccount;
                qg.c.a(bnVar, org.telegram.messenger.sr.a(B0, org.telegram.messenger.fj.b2(i10, messageObject.k, true, false)));
            }
            lbVar.presentFragment(bnVar);
            return;
        }
        if (i7 == 0) {
            TLRPC.MessageMedia messageMedia = messageObject.k.media;
            if (messageMedia == null || (webPage = messageMedia.webpage) == null || webPage.cached_page == null) {
                return;
            }
            LaunchActivity launchActivity = LaunchActivity.H1;
            if (launchActivity == null || launchActivity.N() == null || LaunchActivity.H1.N().l(messageObject) == null) {
                lbVar.createArticleViewer(false).L(messageObject, null, null, null);
                return;
            }
            return;
        }
        if (i7 != 5) {
            TLRPC.MessageMedia messageMedia2 = messageObject.k.media;
            if (messageMedia2 == null || messageMedia2.webpage == null) {
                return;
            }
            vf.c.t(lbVar.getParentActivity(), messageObject.k.media.webpage.url);
            return;
        }
        TLRPC.User c22 = lbVar.getMessagesController().c2(Long.valueOf(messageObject.k.media.user_id));
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
            lbVar.showDialog(new org.telegram.ui.Components.kd0(lbVar, null, c22, null, file, null, str2, str3, null));
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.Cells.m1
    public final /* synthetic */ boolean p2(org.telegram.ui.Cells.r1 r1Var, TL_iv.PageBlock pageBlock) {
        return false;
    }

    @Override // org.telegram.ui.Cells.m1
    public final boolean r0() {
        return true;
    }

    @Override // org.telegram.ui.Cells.m1
    public final void t(org.telegram.ui.Cells.r1 r1Var) {
        ib ibVar = this.a;
        lb lbVar = ibVar.n;
        if (lbVar.getParentActivity() == null) {
            return;
        }
        lbVar.showDialog(org.telegram.ui.Components.zo0.O0(ibVar.c, r1Var.getMessageObject(), null, org.telegram.messenger.v3.T(lbVar.f) && !lbVar.f.megagroup, null));
    }

    @Override // org.telegram.ui.Cells.m1
    public final /* synthetic */ boolean v0(org.telegram.ui.Components.x5 x5Var) {
        return false;
    }

    @Override // org.telegram.ui.Cells.m1
    public final void x0(org.telegram.ui.Cells.r1 r1Var, float f10, float f11) {
        lb lbVar = this.a.n;
        int i7 = lb.R0;
        lbVar.U0(r1Var, 0.0f, 0.0f);
    }

    @Override // org.telegram.ui.Cells.m1
    public final /* synthetic */ boolean x1() {
        return false;
    }

    @Override // org.telegram.ui.Cells.m1
    public final /* synthetic */ boolean y2(int i7) {
        return false;
    }

    @Override // org.telegram.ui.Cells.m1
    public final /* synthetic */ boolean z1(org.telegram.ui.Cells.r1 r1Var, int i7) {
        return false;
    }

    @Override // org.telegram.ui.Cells.m1
    public final /* synthetic */ void A(org.telegram.ui.Cells.r1 r1Var) {
    }

    @Override // org.telegram.ui.Cells.m1
    public final /* synthetic */ void C(org.telegram.ui.Cells.r1 r1Var) {
    }

    @Override // org.telegram.ui.Cells.m1
    public final /* synthetic */ void C1(org.telegram.ui.Cells.r1 r1Var) {
    }

    @Override // org.telegram.ui.Cells.m1
    public final /* synthetic */ void F(org.telegram.ui.Cells.r1 r1Var) {
    }

    @Override // org.telegram.ui.Cells.m1
    public final /* synthetic */ void G0(org.telegram.ui.Cells.r1 r1Var) {
    }

    @Override // org.telegram.ui.Cells.m1
    public final /* synthetic */ void J(org.telegram.ui.Cells.r1 r1Var) {
    }

    @Override // org.telegram.ui.Cells.m1
    public final /* synthetic */ void L0(org.telegram.ui.Cells.r1 r1Var) {
    }

    @Override // org.telegram.ui.Cells.m1
    public final /* synthetic */ void L1(org.telegram.ui.Cells.r1 r1Var) {
    }

    @Override // org.telegram.ui.Cells.m1
    public final /* synthetic */ void M(org.telegram.ui.Cells.r1 r1Var) {
    }

    @Override // org.telegram.ui.Cells.m1
    public final /* synthetic */ void N0(org.telegram.ui.Cells.r1 r1Var) {
    }

    @Override // org.telegram.ui.Cells.m1
    public final /* synthetic */ void O(org.telegram.messenger.cj cjVar) {
    }

    @Override // org.telegram.ui.Cells.m1
    public final /* synthetic */ void O1(org.telegram.messenger.fj fjVar) {
    }

    @Override // org.telegram.ui.Cells.m1
    public final void R(org.telegram.ui.Cells.r1 r1Var) {
    }

    @Override // org.telegram.ui.Cells.m1
    public final /* synthetic */ void S0(org.telegram.ui.Cells.r1 r1Var) {
    }

    @Override // org.telegram.ui.Cells.m1
    public final /* synthetic */ void W(org.telegram.messenger.fj fjVar) {
    }

    @Override // org.telegram.ui.Cells.m1
    public final /* synthetic */ void d0(org.telegram.ui.Cells.r1 r1Var) {
    }

    @Override // org.telegram.ui.Cells.m1
    public final /* synthetic */ void e1(org.telegram.ui.Cells.r1 r1Var) {
    }

    @Override // org.telegram.ui.Cells.m1
    public final /* synthetic */ void f1(org.telegram.ui.Cells.r1 r1Var) {
    }

    @Override // org.telegram.ui.Cells.m1
    public final /* synthetic */ void k2(org.telegram.ui.Cells.r1 r1Var) {
    }

    @Override // org.telegram.ui.Cells.m1
    public final /* synthetic */ void m0(int i7) {
    }

    @Override // org.telegram.ui.Cells.m1
    public final /* synthetic */ void q0(org.telegram.ui.Cells.r1 r1Var) {
    }

    @Override // org.telegram.ui.Cells.m1
    public final /* synthetic */ void q2(org.telegram.ui.Cells.r1 r1Var) {
    }

    @Override // org.telegram.ui.Cells.m1
    public final /* synthetic */ void s(org.telegram.ui.Cells.r1 r1Var) {
    }

    @Override // org.telegram.ui.Cells.m1
    public final void t0(String str) {
    }

    @Override // org.telegram.ui.Cells.m1
    public final /* synthetic */ void H0() {
    }

    @Override // org.telegram.ui.Cells.m1
    public final /* synthetic */ void U1() {
    }

    @Override // org.telegram.ui.Cells.m1
    public final /* synthetic */ void e() {
    }

    @Override // org.telegram.ui.Cells.m1
    public final /* synthetic */ void k1() {
    }

    @Override // org.telegram.ui.Cells.m1
    public final /* synthetic */ void u2() {
    }

    @Override // org.telegram.ui.Cells.m1
    public final /* synthetic */ void x() {
    }

    @Override // org.telegram.ui.Cells.m1
    public final /* synthetic */ void z2() {
    }

    @Override // org.telegram.ui.Cells.m1
    public final /* synthetic */ void F1(org.telegram.ui.Cells.r1 r1Var, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.m1
    public final /* synthetic */ void I1(org.telegram.ui.Cells.r1 r1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override // org.telegram.ui.Cells.m1
    public final /* synthetic */ void K1(org.telegram.ui.Cells.r1 r1Var, int i7) {
    }

    @Override // org.telegram.ui.Cells.m1
    public final /* synthetic */ void L(org.telegram.ui.Cells.r1 r1Var, org.telegram.messenger.p2 p2Var) {
    }

    @Override // org.telegram.ui.Cells.m1
    public final /* synthetic */ void W0(org.telegram.ui.Cells.r1 r1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    @Override // org.telegram.ui.Cells.m1
    public final /* synthetic */ void Y1(org.telegram.ui.Cells.r1 r1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    @Override // org.telegram.ui.Cells.m1
    public final /* synthetic */ void b2(org.telegram.ui.Cells.r1 r1Var, org.telegram.messenger.h10 h10Var) {
    }

    @Override // org.telegram.ui.Cells.m1
    public final /* synthetic */ void e2(String str, String str2) {
    }

    @Override // org.telegram.ui.Cells.m1
    public final /* synthetic */ void l2(org.telegram.ui.Cells.r1 r1Var, long j3) {
    }

    @Override // org.telegram.ui.Cells.m1
    public final /* synthetic */ void A2(org.telegram.ui.Cells.r1 r1Var, int i7, int i10) {
    }

    @Override // org.telegram.ui.Cells.m1
    public final void B1(org.telegram.ui.Cells.r1 r1Var, boolean z10, boolean z11) {
    }

    @Override // org.telegram.ui.Cells.m1
    public final /* synthetic */ void I0(org.telegram.ui.Cells.r1 r1Var, TLObject tLObject, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.m1
    public final void M0(org.telegram.ui.Cells.r1 r1Var, boolean z10, boolean z11) {
    }

    @Override // org.telegram.ui.Cells.m1
    public final /* synthetic */ void P(org.telegram.ui.Cells.r1 r1Var, TLRPC.Document document, RectF rectF) {
    }

    @Override // org.telegram.ui.Cells.m1
    public final /* synthetic */ void o0(org.telegram.ui.Cells.r1 r1Var, float f10, float f11) {
    }

    @Override // org.telegram.ui.Cells.m1
    public final /* synthetic */ void t1(org.telegram.ui.Cells.r1 r1Var, float f10, float f11) {
    }

    @Override // org.telegram.ui.Cells.m1
    public final /* synthetic */ void Z1(org.telegram.ui.Cells.r1 r1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    @Override // org.telegram.ui.Cells.m1
    public final /* synthetic */ void q(org.telegram.ui.Cells.r1 r1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i7) {
    }

    @Override // org.telegram.ui.Cells.m1
    public final /* synthetic */ void m(org.telegram.ui.Cells.r1 r1Var, ArrayList arrayList, int i7, int i10, int i11) {
    }

    @Override // org.telegram.ui.Cells.m1
    public final /* synthetic */ void w2(org.telegram.ui.Cells.r1 r1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f10, float f11) {
    }
}
