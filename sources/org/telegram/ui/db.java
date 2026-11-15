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

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class db implements org.telegram.ui.Cells.l1 {
    public final /* synthetic */ ib a;

    public db(ib ibVar) {
        this.a = ibVar;
    }

    @Override // org.telegram.ui.Cells.l1
    public final void C0(org.telegram.ui.Cells.q1 q1Var, float f10, float f11) {
        lb lbVar = this.a.n;
        int i7 = lb.R0;
        lbVar.U0(q1Var, 0.0f, 0.0f);
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ boolean H1(org.telegram.ui.Cells.q1 q1Var, TLRPC.Chat chat) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ boolean J1() {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ boolean L0(long j3) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ boolean Q(org.telegram.ui.Cells.q1 q1Var, TLRPC.TodoItem todoItem, boolean z10) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public final void Q1(org.telegram.ui.Cells.q1 q1Var, TLRPC.WebPage webPage, String str, boolean z10) {
        vf.c.t(q1Var.getContext(), str);
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ boolean R() {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ CharacterStyle R1(org.telegram.ui.Cells.q1 q1Var) {
        return null;
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ boolean S(org.telegram.ui.Cells.q1 q1Var) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public final void S1(org.telegram.messenger.gj gjVar, String str, String str2, String str3, String str4, int i7, int i10) {
        lb lbVar = this.a.n;
        org.telegram.ui.Components.bu.N0(lbVar, gjVar, lbVar.C0, str2, str3, str4, str, i7, i10, -1, false);
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ boolean T() {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public final void T0(org.telegram.ui.Cells.q1 q1Var, CharacterStyle characterStyle, boolean z10) {
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
        org.telegram.messenger.gj messageObject = q1Var.getMessageObject();
        if (characterStyle instanceof org.telegram.ui.Components.e41) {
            org.telegram.ui.Components.e41 e41Var = (org.telegram.ui.Components.e41) characterStyle;
            org.telegram.messenger.g0.g(e41Var.a.subSequence(e41Var.b, e41Var.c).toString());
            if (org.telegram.messenger.g0.H3()) {
                Toast.makeText(lbVar.getParentActivity(), org.telegram.messenger.hd.M0(2131744194, null), 0).show();
                return;
            }
            return;
        }
        if (characterStyle instanceof org.telegram.ui.Components.i41) {
            Long A = Utilities.A(((org.telegram.ui.Components.i41) characterStyle).getURL());
            long longValue = A.longValue();
            if (longValue > 0) {
                i12 = ((org.telegram.ui.ActionBar.e2) lbVar).currentAccount;
                TLRPC.User a22 = org.telegram.messenger.np.s1(i12).a2(A);
                if (a22 != null) {
                    i13 = ((org.telegram.ui.ActionBar.e2) lbVar).currentAccount;
                    org.telegram.messenger.np.s1(i13).z3(a22, null, lbVar, 0);
                    return;
                }
                return;
            }
            i10 = ((org.telegram.ui.ActionBar.e2) lbVar).currentAccount;
            TLRPC.Chat M0 = org.telegram.messenger.np.s1(i10).M0(Long.valueOf(-longValue));
            if (M0 != null) {
                i11 = ((org.telegram.ui.ActionBar.e2) lbVar).currentAccount;
                org.telegram.messenger.np.s1(i11).z3(null, M0, lbVar, 0);
                return;
            }
            return;
        }
        if (characterStyle instanceof org.telegram.ui.Components.f41) {
            String url = ((org.telegram.ui.Components.f41) characterStyle).getURL();
            if (url.startsWith("@")) {
                i7 = ((org.telegram.ui.ActionBar.e2) lbVar).currentAccount;
                org.telegram.messenger.np.s1(i7).y3(url.substring(1), lbVar, 0, null);
                return;
            } else {
                if (url.startsWith("#")) {
                    yw ywVar = new yw(null);
                    ywVar.p2 = url;
                    lbVar.presentFragment(ywVar);
                    return;
                }
                return;
            }
        }
        String url2 = ((URLSpan) characterStyle).getURL();
        if (z10) {
            org.telegram.ui.ActionBar.u2 i14 = org.telegram.messenger.i20.i(lbVar.getParentActivity(), false, 1, null);
            i14.P = url2;
            i14.Q = false;
            CharSequence[] charSequenceArr = {org.telegram.messenger.hd.M0(2131747817, null), org.telegram.messenger.hd.M0(2131751767, null)};
            og.j jVar = new og.j(2, this, url2);
            i14.M = charSequenceArr;
            i14.L = jVar;
            lbVar.showDialog(i14);
            return;
        }
        if (characterStyle instanceof org.telegram.ui.Components.h41) {
            String url3 = ((org.telegram.ui.Components.h41) characterStyle).getURL();
            if (vf.c.g(Uri.parse(url3), false, null)) {
                vf.c.p(lbVar.getParentActivity(), url3, true);
                return;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(lbVar.getParentActivity());
            String M02 = org.telegram.messenger.hd.M0(2131747779, null);
            org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
            t1Var.S = M02;
            t1Var.U = org.telegram.messenger.hd.a0(null, null, 2131747782, url3);
            alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131747817, null), new m2.d(9, lbVar, url3));
            alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
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

    @Override // org.telegram.ui.Cells.l1
    public final boolean T1(org.telegram.ui.Cells.q1 q1Var, org.telegram.messenger.gj gjVar) {
        if (org.telegram.messenger.gj.R4(gjVar.k) || gjVar.h4()) {
            boolean S = MediaController.B().S(gjVar);
            MediaController.B().r0(null, false);
            return S;
        }
        if (gjVar.I3()) {
            return MediaController.B().o0(this.a.n.p0, gjVar, 0L, true, null, 0L);
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public final void U(org.telegram.ui.Cells.q1 q1Var, TLRPC.Chat chat, int i7, float f10, float f11, boolean z10) {
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
        i10 = ((org.telegram.ui.ActionBar.e2) lbVar).currentAccount;
        if (org.telegram.messenger.np.s1(i10).E(bundle, lbVar, null, null)) {
            lbVar.presentFragment(new an(bundle), true);
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ boolean V0(org.telegram.ui.Cells.q1 q1Var, boolean z10) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ int X() {
        return 0;
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ jh.a Z() {
        return null;
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ boolean Z1(org.telegram.ui.Cells.q1 q1Var, TLRPC.PollAnswer pollAnswer) {
        return false;
    }

    public final void a(TLRPC.User user) {
        Bundle bundle = new Bundle();
        bundle.putLong("user_id", user.id);
        ib ibVar = this.a;
        lb.u0(ibVar.n, bundle, user.id);
        ProfileActivity profileActivity = new ProfileActivity(bundle, null);
        profileActivity.i5(0);
        ibVar.n.presentFragment(profileActivity);
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ boolean a0(org.telegram.ui.Cells.q1 q1Var) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public final boolean c() {
        return true;
    }

    @Override // org.telegram.ui.Cells.l1
    public final boolean c0(org.telegram.ui.Cells.q1 q1Var, TLRPC.User user) {
        int i7;
        int i10;
        w4 b10;
        lb lbVar = this.a.n;
        if (user != null) {
            long j3 = user.id;
            i7 = ((org.telegram.ui.ActionBar.e2) lbVar).currentAccount;
            if (j3 != org.telegram.messenger.m10.i(i7).e()) {
                c5[] c5VarArr = {c5.d, c5.h};
                TLRPC.UserFull b22 = lbVar.getMessagesController().b2(user.id);
                if (b22 != null) {
                    b10 = w4.c(user, b22, c5VarArr);
                } else {
                    i10 = ((org.telegram.ui.ActionBar.e2) lbVar).classGuid;
                    b10 = w4.b(user, i10, c5VarArr);
                }
                if (ab.q.i(b10)) {
                    ab.q.o().D((ViewGroup) lbVar.fragmentView, lbVar.getResourceProvider(), b10, new m2.d(this, q1Var, user));
                    return true;
                }
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ dr0 c2() {
        return null;
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ boolean f0() {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ boolean f1(org.telegram.messenger.gj gjVar) {
        return org.telegram.ui.Cells.y0.a(gjVar);
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ boolean f2(long j3) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public final boolean g() {
        return true;
    }

    @Override // org.telegram.ui.Cells.l1
    public final void g2(org.telegram.ui.Cells.q1 q1Var, int i7, float f10, float f11, boolean z10) {
        org.telegram.messenger.gj gjVar = q1Var.getMessageObject().C;
        long B0 = org.telegram.messenger.gj.B0(gjVar.k);
        lb lbVar = this.a.n;
        if (B0 == (-lbVar.f.id)) {
            for (int i10 = 0; i10 < lbVar.p0.size(); i10++) {
                org.telegram.messenger.gj gjVar2 = (org.telegram.messenger.gj) lbVar.p0.get(i10);
                if (gjVar2 != null && gjVar2.U != 1 && gjVar2.L1() == gjVar.L1()) {
                    lbVar.d1(gjVar2);
                    return;
                }
            }
        }
        Bundle bundle = new Bundle();
        bundle.putLong("chat_id", lbVar.f.id);
        bundle.putInt("message_id", gjVar.L1());
        lbVar.presentFragment(new an(bundle));
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ String h(org.telegram.ui.Cells.q1 q1Var) {
        return null;
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ boolean h2(org.telegram.ui.Cells.q1 q1Var, TLRPC.TodoItem todoItem) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ int i0(org.telegram.ui.Cells.q1 q1Var) {
        return 0;
    }

    @Override // org.telegram.ui.Cells.l1
    public final void k() {
        org.telegram.messenger.t0.u();
        boolean z10 = org.telegram.messenger.r2.a;
        org.telegram.messenger.t0.r();
        vf.c.t(this.a.n.getParentActivity(), org.telegram.messenger.r2.g);
    }

    @Override // org.telegram.ui.Cells.l1
    public final void k1(org.telegram.ui.Cells.q1 q1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        org.telegram.messenger.gj messageObject = q1Var.getMessageObject();
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

    @Override // org.telegram.ui.Cells.l1
    public final boolean l0() {
        return true;
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ boolean o0(org.telegram.ui.Components.p5 p5Var) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public final void p1(org.telegram.ui.Cells.q1 q1Var, int i7) {
        TLRPC.WebPage webPage;
        int i10;
        lb lbVar = this.a.n;
        org.telegram.messenger.gj messageObject = q1Var.getMessageObject();
        TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent = messageObject.L1;
        if (tL_channelAdminLogEvent != null && (tL_channelAdminLogEvent.action instanceof TLRPC.TL_channelAdminLogEventActionEditMessage)) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", -org.telegram.messenger.gj.B0(messageObject.k));
            bundle.putInt("message_id", messageObject.L1());
            an anVar = new an(bundle);
            if (org.telegram.messenger.t3.c0(lbVar.f)) {
                long B0 = org.telegram.messenger.gj.B0(messageObject.k);
                i10 = ((org.telegram.ui.ActionBar.e2) lbVar).currentAccount;
                qg.c.a(anVar, org.telegram.messenger.ur.a(B0, org.telegram.messenger.gj.b2(i10, messageObject.k, true, false)));
            }
            lbVar.presentFragment(anVar);
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
        TLRPC.User a22 = lbVar.getMessagesController().a2(Long.valueOf(messageObject.k.media.user_id));
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
            lbVar.showDialog(new org.telegram.ui.Components.bd0(lbVar, null, a22, null, file, null, str2, str3, null));
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ boolean p2(org.telegram.ui.Cells.q1 q1Var, TL_iv.PageBlock pageBlock) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public final void q0(org.telegram.ui.Cells.q1 q1Var, float f10, float f11) {
        lb lbVar = this.a.n;
        int i7 = lb.R0;
        lbVar.U0(q1Var, 0.0f, 0.0f);
    }

    @Override // org.telegram.ui.Cells.l1
    public final void r(org.telegram.ui.Cells.q1 q1Var) {
        ib ibVar = this.a;
        lb lbVar = ibVar.n;
        if (lbVar.getParentActivity() == null) {
            return;
        }
        lbVar.showDialog(org.telegram.ui.Components.po0.N0(ibVar.c, q1Var.getMessageObject(), null, org.telegram.messenger.t3.T(lbVar.f) && !lbVar.f.megagroup, null));
    }

    @Override // org.telegram.ui.Cells.l1
    public final void u0(org.telegram.ui.Cells.q1 q1Var, TLRPC.User user, float f10, float f11) {
        int i7;
        if (user != null) {
            long j3 = user.id;
            i7 = ((org.telegram.ui.ActionBar.e2) this.a.n).currentAccount;
            if (j3 != org.telegram.messenger.m10.i(i7).e()) {
                a(user);
            }
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ boolean v2(int i7) {
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00f5, code lost:
    
        if (r15.exists() != false) goto L55;
     */
    @Override // org.telegram.ui.Cells.l1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void w0(org.telegram.ui.Cells.q1 q1Var, float f10, float f11, boolean z10) {
        int i7;
        File file;
        lb lbVar = this.a.n;
        org.telegram.messenger.gj messageObject = q1Var.getMessageObject();
        if (org.telegram.messenger.gj.j1(messageObject.k) != null) {
            lbVar.showDialog(new org.telegram.ui.Components.bw0(lbVar.getParentActivity(), lbVar, org.telegram.messenger.gj.j1(messageObject.k), null, null, null));
            return;
        }
        File file2 = null;
        if (org.telegram.messenger.gj.L4(messageObject.k) || (i7 = messageObject.D) == 1 || ((i7 == 0 && !messageObject.a5()) || org.telegram.messenger.gj.t3(messageObject.k))) {
            PhotoViewer.p1().I2(null, lbVar, null);
            PhotoViewer.p1().e2(messageObject, null, 0L, 0L, 0L, lbVar.C0);
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
                        org.telegram.ui.Components.cj0 cj0Var = (org.telegram.ui.Components.cj0) lbVar.w.K(lbVar.h0);
                        if (cj0Var != null) {
                            lbVar.i0 = cj0Var.a.getTop();
                        } else {
                            lbVar.h0 = -1;
                        }
                    } else {
                        lbVar.h0 = -1;
                    }
                }
                org.telegram.ui.ActionBar.i6 v = org.telegram.ui.ActionBar.j6.v(file, messageObject.I0(), null, true);
                if (v != null) {
                    lbVar.presentFragment(new t71(v));
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

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ String x(long j3) {
        return null;
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ boolean x1() {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ boolean y0(org.telegram.messenger.gj gjVar) {
        return true;
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ boolean z1(org.telegram.ui.Cells.q1 q1Var, int i7) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ org.telegram.ui.Cells.i9 z2() {
        return null;
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void B(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void C1(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void F0(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void H(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void I0(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void J(org.telegram.messenger.dj djVar) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void L1(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final void N(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void N0(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void O1(org.telegram.messenger.gj gjVar) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void P(org.telegram.messenger.gj gjVar) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void V(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void W0(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void X0(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void e0(int i7) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void j0(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void j2(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final void n0(String str) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void o(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void q2(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void u(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void w(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void z(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void z0(org.telegram.ui.Cells.q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void A0() {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void U1() {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void i1() {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void p() {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void s2() {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void t() {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void x2() {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void F1(org.telegram.ui.Cells.q1 q1Var, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void G(org.telegram.ui.Cells.q1 q1Var, org.telegram.messenger.o2 o2Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void I1(org.telegram.ui.Cells.q1 q1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void K1(org.telegram.ui.Cells.q1 q1Var, int i7) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void O0(org.telegram.ui.Cells.q1 q1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void X1(org.telegram.ui.Cells.q1 q1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void a2(org.telegram.ui.Cells.q1 q1Var, org.telegram.messenger.l10 l10Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void e2(String str, String str2) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void l2(org.telegram.ui.Cells.q1 q1Var, long j3) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void B0(org.telegram.ui.Cells.q1 q1Var, TLObject tLObject, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final void B1(org.telegram.ui.Cells.q1 q1Var, boolean z10, boolean z11) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final void H0(org.telegram.ui.Cells.q1 q1Var, boolean z10, boolean z11) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void K(org.telegram.ui.Cells.q1 q1Var, TLRPC.Document document, RectF rectF) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void h0(org.telegram.ui.Cells.q1 q1Var, float f10, float f11) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void t1(org.telegram.ui.Cells.q1 q1Var, float f10, float f11) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void y2(org.telegram.ui.Cells.q1 q1Var, int i7, int i10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void Y1(org.telegram.ui.Cells.q1 q1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void m(org.telegram.ui.Cells.q1 q1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i7) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void j(org.telegram.ui.Cells.q1 q1Var, ArrayList arrayList, int i7, int i10, int i11) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void t2(org.telegram.ui.Cells.q1 q1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f10, float f11) {
    }
}
