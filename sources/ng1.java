// default package

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
import org.telegram.messenger.a;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class ng1 implements mc2 {
    public final /* synthetic */ sg1 a;

    public ng1(sg1 sg1Var) {
        this.a = sg1Var;
    }

    @Override // mc2
    public final boolean A0(long j) {
        return false;
    }

    @Override // mc2
    public final boolean D1(gn gnVar) {
        return false;
    }

    @Override // mc2
    public final boolean E(rc2 rc2Var, TLRPC.TodoItem todoItem) {
        return false;
    }

    @Override // mc2
    public final void H(rc2 rc2Var, int i, float f, float f2, boolean z) {
        k47 k47Var = rc2Var.getMessageObject().C;
        long B0 = k47.B0(k47Var.k);
        vg1 vg1Var = this.a.n;
        if (B0 == (-vg1Var.f.id)) {
            for (int i2 = 0; i2 < vg1Var.p0.size(); i2++) {
                k47 k47Var2 = (k47) vg1Var.p0.get(i2);
                if (k47Var2 != null && k47Var2.U != 1 && k47Var2.L1() == k47Var.L1()) {
                    vg1Var.c1(k47Var2);
                    return;
                }
            }
        }
        Bundle bundle = new Bundle();
        bundle.putLong("chat_id", vg1Var.f.id);
        bundle.putInt("message_id", k47Var.L1());
        vg1Var.presentFragment(new yv1(bundle));
    }

    @Override // mc2
    public final boolean J0(rc2 rc2Var, TLRPC.TodoItem todoItem, boolean z) {
        return false;
    }

    @Override // mc2
    public final boolean K() {
        return false;
    }

    @Override // mc2
    public final void L0(rc2 rc2Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        k47 messageObject = rc2Var.getMessageObject();
        vg1 vg1Var = this.a.n;
        if (vg1Var.q0.contains(Long.valueOf(messageObject.T))) {
            vg1Var.q0.remove(Long.valueOf(messageObject.T));
        } else {
            vg1Var.q0.add(Long.valueOf(messageObject.T));
        }
        vg1Var.a1(true);
        vg1Var.O0();
        vg1Var.F.f();
    }

    @Override // mc2
    public final void M(rc2 rc2Var, CharacterStyle characterStyle, boolean z) {
        TLRPC.WebPage webPage;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        vg1 vg1Var = this.a.n;
        if (characterStyle != null) {
            k47 messageObject = rc2Var.getMessageObject();
            if (characterStyle instanceof f6c) {
                f6c f6cVar = (f6c) characterStyle;
                gm.g(f6cVar.a.subSequence(f6cVar.b, f6cVar.c).toString());
                if (gm.C3()) {
                    Toast.makeText(vg1Var.getParentActivity(), jb6.M0(2131743879, null), 0).show();
                    return;
                }
                return;
            }
            if (characterStyle instanceof j6c) {
                Long A = Utilities.A(((j6c) characterStyle).getURL());
                long longValue = A.longValue();
                if (longValue > 0) {
                    i4 = ((d) vg1Var).currentAccount;
                    TLRPC.User W1 = oc7.r1(i4).W1(A);
                    if (W1 != null) {
                        i5 = ((d) vg1Var).currentAccount;
                        oc7.r1(i5).D3(W1, null, vg1Var, 0);
                        return;
                    }
                    return;
                }
                i2 = ((d) vg1Var).currentAccount;
                TLRPC.Chat L0 = oc7.r1(i2).L0(Long.valueOf(-longValue));
                if (L0 != null) {
                    i3 = ((d) vg1Var).currentAccount;
                    oc7.r1(i3).D3(null, L0, vg1Var, 0);
                    return;
                }
                return;
            }
            if (characterStyle instanceof g6c) {
                String url = ((g6c) characterStyle).getURL();
                if (url.startsWith("@")) {
                    i = ((d) vg1Var).currentAccount;
                    oc7.r1(i).C3(url.substring(1), vg1Var, 0, null);
                    return;
                } else {
                    if (url.startsWith("#")) {
                        nk3 nk3Var = new nk3(null);
                        nk3Var.p2 = url;
                        vg1Var.presentFragment(nk3Var);
                        return;
                    }
                    return;
                }
            }
            String url2 = ((URLSpan) characterStyle).getURL();
            if (z) {
                my0 i6 = wi8.i(vg1Var.getParentActivity(), false, 1, null);
                i6.P = url2;
                i6.Q = false;
                CharSequence[] charSequenceArr = {jb6.M0(2131747550, null), jb6.M0(2131751704, null)};
                ff ffVar = new ff((Object) this, (Object) url2, (byte) 2);
                i6.M = charSequenceArr;
                i6.L = ffVar;
                vg1Var.showDialog(i6);
                return;
            }
            if (characterStyle instanceof i6c) {
                String url3 = ((i6c) characterStyle).getURL();
                if (l11.h(url3)) {
                    l11.q(vg1Var.getParentActivity(), url3, true);
                    return;
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(vg1Var.getParentActivity());
                String M0 = jb6.M0(2131747512, null);
                he heVar = alertDialog$Builder.a;
                heVar.S = M0;
                heVar.U = jb6.a0(null, null, 2131747515, url3);
                alertDialog$Builder.j(jb6.M0(2131747550, null), new g11((Object) vg1Var, (Object) url3, (byte) 6));
                alertDialog$Builder.g(jb6.M0(2131752542, null), null);
                vg1Var.showDialog(heVar);
                return;
            }
            TLRPC.MessageMedia messageMedia = messageObject.k.media;
            if ((messageMedia instanceof TLRPC.TL_messageMediaWebPage) && (webPage = messageMedia.webpage) != null && webPage.cached_page != null) {
                String lowerCase = url2.toLowerCase();
                String lowerCase2 = messageObject.k.media.webpage.url.toLowerCase();
                if ((l11.j(lowerCase, false, false) || lowerCase.contains("t.me/iv")) && (lowerCase.contains(lowerCase2) || lowerCase2.contains(lowerCase))) {
                    LaunchActivity launchActivity = LaunchActivity.H1;
                    if (launchActivity == null || launchActivity.O() == null || LaunchActivity.H1.O().k(messageObject) == null) {
                        vg1Var.createArticleViewer(false).L(messageObject, null, null, null);
                        return;
                    }
                    return;
                }
            }
            l11.q(vg1Var.getParentActivity(), url2, true);
        }
    }

    @Override // mc2
    public final pc8 M1() {
        return null;
    }

    @Override // mc2
    public final boolean N() {
        return false;
    }

    @Override // mc2
    public final int O() {
        return 0;
    }

    @Override // mc2
    public final boolean O1(long j) {
        return false;
    }

    @Override // mc2
    public final String P0(rc2 rc2Var) {
        return null;
    }

    @Override // mc2
    public final int Q(rc2 rc2Var) {
        return 0;
    }

    @Override // mc2
    public final hw1 S() {
        return null;
    }

    @Override // mc2
    public final boolean S0(rc2 rc2Var, TL_iv.PageBlock pageBlock) {
        return false;
    }

    @Override // mc2
    public final boolean U1(k47 k47Var) {
        return true;
    }

    @Override // mc2
    public final void W(rc2 rc2Var, TLRPC.User user, float f, float f2) {
        int i;
        if (user != null) {
            long j = user.id;
            i = ((d) this.a.n).currentAccount;
            if (j != z8c.h(i).e()) {
                a(user);
            }
        }
    }

    @Override // mc2
    public final void W1(rc2 rc2Var, TLRPC.Chat chat, int i, float f, float f2, boolean z) {
        int i2;
        vg1 vg1Var = this.a.n;
        if (chat == null || chat == vg1Var.f) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("chat_id", chat.id);
        if (i != 0) {
            bundle.putInt("message_id", i);
        }
        i2 = ((d) vg1Var).currentAccount;
        if (oc7.r1(i2).A(bundle, vg1Var, null, null)) {
            vg1Var.presentFragment(new yv1(bundle), true);
        }
    }

    @Override // mc2
    public final boolean Y1(rc2 rc2Var, TLRPC.User user) {
        int i;
        int i2;
        wc0 b;
        vg1 vg1Var = this.a.n;
        if (user != null) {
            long j = user.id;
            i = ((d) vg1Var).currentAccount;
            if (j != z8c.h(i).e()) {
                cd0[] cd0VarArr = {cd0.d, cd0.h};
                TLRPC.UserFull X1 = vg1Var.getMessagesController().X1(user.id);
                if (X1 != null) {
                    b = wc0.c(user, X1, cd0VarArr);
                } else {
                    i2 = ((d) vg1Var).classGuid;
                    b = wc0.b(user, i2, cd0VarArr);
                }
                if (yh4.l(b)) {
                    yh4.t().J((ViewGroup) vg1Var.fragmentView, vg1Var.getResourceProvider(), b, new g11(this, rc2Var, user));
                    return true;
                }
            }
        }
        return false;
    }

    @Override // mc2
    public final boolean Z() {
        return false;
    }

    @Override // mc2
    public final void Z0(rc2 rc2Var) {
        sg1 sg1Var = this.a;
        vg1 vg1Var = sg1Var.n;
        if (vg1Var.getParentActivity() == null) {
            return;
        }
        vg1Var.showDialog(tca.G0(sg1Var.c, rc2Var.getMessageObject(), null, sd2.T(vg1Var.f) && !vg1Var.f.megagroup, null));
    }

    @Override // mc2
    public final boolean Z1(rc2 rc2Var) {
        return false;
    }

    public final void a(TLRPC.User user) {
        Bundle bundle = new Bundle();
        bundle.putLong("user_id", user.id);
        vg1 vg1Var = this.a.n;
        long j = user.id;
        int i = vg1.Q0;
        vg1Var.J0(bundle, j);
        ProfileActivity profileActivity = new ProfileActivity(bundle, null);
        profileActivity.B3(0);
        vg1Var.presentFragment(profileActivity);
    }

    @Override // mc2
    public final CharacterStyle a0(rc2 rc2Var) {
        return null;
    }

    @Override // mc2
    public final boolean b() {
        return true;
    }

    @Override // mc2
    public final boolean d0() {
        return true;
    }

    @Override // mc2
    public final void d2(rc2 rc2Var, float f, float f2) {
        vg1 vg1Var = this.a.n;
        int i = vg1.Q0;
        vg1Var.M0(rc2Var, 0.0f, 0.0f);
    }

    @Override // mc2
    public final boolean f() {
        return true;
    }

    @Override // mc2
    public final void i() {
        a.t();
        boolean z = e21.a;
        a.q();
        l11.u(this.a.n.getParentActivity(), e21.g);
    }

    @Override // mc2
    public final boolean l0(rc2 rc2Var, boolean z) {
        return false;
    }

    @Override // mc2
    public final boolean l1() {
        return false;
    }

    @Override // mc2
    public final /* synthetic */ boolean m1(k47 k47Var) {
        return aq1.a(k47Var);
    }

    @Override // mc2
    public final boolean m2(int i) {
        return false;
    }

    @Override // mc2
    public final boolean n1(rc2 rc2Var, int i) {
        return false;
    }

    @Override // mc2
    public final boolean n2(rc2 rc2Var, k47 k47Var) {
        if (k47.Q4(k47Var.k) || k47Var.g4()) {
            boolean R = MediaController.w().R(k47Var);
            MediaController.w().q0(null, false);
            return R;
        }
        if (k47Var.I3()) {
            return MediaController.w().n0(this.a.n.p0, k47Var, 0L, true, null, 0L);
        }
        return false;
    }

    @Override // mc2
    public final boolean p0(rc2 rc2Var, TLRPC.Chat chat) {
        return false;
    }

    @Override // mc2
    public final hkb p2() {
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00f3, code lost:
    
        if (r13.exists() == false) goto L51;
     */
    @Override // mc2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void r0(rc2 rc2Var, float f, float f2, boolean z) {
        int i;
        File file;
        vg1 vg1Var = this.a.n;
        k47 messageObject = rc2Var.getMessageObject();
        if (k47.j1(messageObject.k) != null) {
            vg1Var.showDialog(new x2b(vg1Var.getParentActivity(), vg1Var, k47.j1(messageObject.k), null, null, null));
            return;
        }
        File file2 = null;
        if (k47.K4(messageObject.k) || (i = messageObject.D) == 1 || ((i == 0 && !messageObject.Z4()) || k47.t3(messageObject.k))) {
            PhotoViewer.r0().T1(null, vg1Var, null);
            PhotoViewer.r0().l1(messageObject, null, 0L, 0L, 0L, vg1Var.C0);
            return;
        }
        int i2 = messageObject.D;
        if (i2 == 3) {
            try {
                String str = messageObject.k.attachPath;
                if (str != null && str.length() != 0) {
                    file2 = new File(messageObject.k.attachPath);
                }
                if (file2 == null || !file2.exists()) {
                    bc4 fileLoader = vg1Var.getFileLoader();
                    TLRPC.Message message = messageObject.k;
                    fileLoader.getClass();
                    file2 = bc4.M(message, false, true);
                }
                Intent intent = new Intent("android.intent.action.VIEW");
                if (Build.VERSION.SDK_INT >= 24) {
                    intent.setFlags(1);
                    Activity parentActivity = vg1Var.getParentActivity();
                    a.d();
                    intent.setDataAndType(FileProvider.c(parentActivity, "org.telegram.messenger.beta.provider", file2), "video/mp4");
                } else {
                    intent.setDataAndType(Uri.fromFile(file2), "video/mp4");
                }
                vg1Var.getParentActivity().startActivityForResult(intent, 500);
                return;
            } catch (Exception unused) {
                int i3 = vg1.Q0;
                vg1Var.K0(messageObject);
                return;
            }
        }
        if (i2 == 4) {
            if (gm.H1(vg1Var)) {
                pc6 pc6Var = new pc6(0);
                pc6Var.G0(messageObject);
                vg1Var.presentFragment(pc6Var);
                return;
            }
            return;
        }
        if (i2 == 9 || i2 == 0) {
            if (messageObject.I0().toLowerCase().endsWith("attheme")) {
                String str2 = messageObject.k.attachPath;
                if (str2 != null && str2.length() != 0) {
                    file = new File(messageObject.k.attachPath);
                }
                file = null;
                if (file == null) {
                    bc4 fileLoader2 = vg1Var.getFileLoader();
                    TLRPC.Message message2 = messageObject.k;
                    fileLoader2.getClass();
                    File M = bc4.M(message2, false, true);
                    if (M.exists()) {
                        file = M;
                    }
                }
                zs zsVar = vg1Var.y;
                if (zsVar != null) {
                    if (zsVar.M0() < vg1Var.y.A() - 1) {
                        vg1Var.h0 = vg1Var.y.K0();
                        b59 b59Var = (b59) vg1Var.w.K(vg1Var.h0);
                        if (b59Var != null) {
                            vg1Var.i0 = b59Var.a.getTop();
                        } else {
                            vg1Var.h0 = -1;
                        }
                    } else {
                        vg1Var.h0 = -1;
                    }
                }
                bmb u = cmb.u(file, messageObject.I0(), null, true);
                if (u != null) {
                    vg1Var.presentFragment(new rob(u));
                    return;
                }
                vg1Var.h0 = -1;
            }
            try {
                gm.r2(messageObject, vg1Var.getParentActivity(), null, false);
            } catch (Exception unused2) {
                int i4 = vg1.Q0;
                vg1Var.K0(messageObject);
            }
        }
    }

    @Override // mc2
    public final String t(long j) {
        return null;
    }

    @Override // mc2
    public final boolean t0(rc2 rc2Var, TLRPC.PollAnswer pollAnswer) {
        return false;
    }

    @Override // mc2
    public final void t1(rc2 rc2Var, int i) {
        TLRPC.WebPage webPage;
        int i2;
        vg1 vg1Var = this.a.n;
        k47 messageObject = rc2Var.getMessageObject();
        TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent = messageObject.L1;
        if (tL_channelAdminLogEvent != null && (tL_channelAdminLogEvent.action instanceof TLRPC.TL_channelAdminLogEventActionEditMessage)) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", -k47.B0(messageObject.k));
            bundle.putInt("message_id", messageObject.L1());
            yv1 yv1Var = new yv1(bundle);
            if (sd2.c0(vg1Var.f)) {
                long B0 = k47.B0(messageObject.k);
                i2 = ((d) vg1Var).currentAccount;
                no4.a(yv1Var, bf7.a(B0, k47.b2(i2, messageObject.k, true, false)));
            }
            vg1Var.presentFragment(yv1Var);
            return;
        }
        if (i == 0) {
            TLRPC.MessageMedia messageMedia = messageObject.k.media;
            if (messageMedia == null || (webPage = messageMedia.webpage) == null || webPage.cached_page == null) {
                return;
            }
            LaunchActivity launchActivity = LaunchActivity.H1;
            if (launchActivity == null || launchActivity.O() == null || LaunchActivity.H1.O().k(messageObject) == null) {
                vg1Var.createArticleViewer(false).L(messageObject, null, null, null);
                return;
            }
            return;
        }
        if (i != 5) {
            TLRPC.MessageMedia messageMedia2 = messageObject.k.media;
            if (messageMedia2 == null || messageMedia2.webpage == null) {
                return;
            }
            l11.u(vg1Var.getParentActivity(), messageObject.k.media.webpage.url);
            return;
        }
        TLRPC.User W1 = vg1Var.getMessagesController().W1(Long.valueOf(messageObject.k.media.user_id));
        TLRPC.MessageMedia messageMedia3 = messageObject.k.media;
        String str = messageMedia3.vcard;
        String str2 = messageMedia3.first_name;
        String str3 = messageMedia3.last_name;
        try {
            File f1 = gm.f1();
            f1.mkdirs();
            File file = new File(f1, "vcard.vcf");
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));
            bufferedWriter.write(str);
            bufferedWriter.close();
            vg1Var.showDialog(new d68(vg1Var, null, W1, null, file, null, str2, str3, null));
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    @Override // mc2
    public final void u(rc2 rc2Var, float f, float f2) {
        vg1 vg1Var = this.a.n;
        int i = vg1.Q0;
        vg1Var.M0(rc2Var, 0.0f, 0.0f);
    }

    @Override // mc2
    public final void w1(k47 k47Var, String str, String str2, String str3, String str4, int i, int i2) {
        vg1 vg1Var = this.a.n;
        zv3.I0(vg1Var, k47Var, vg1Var.C0, str2, str3, str4, str, i, i2, -1, false);
    }

    @Override // mc2
    public final boolean x0(rc2 rc2Var) {
        return false;
    }

    @Override // mc2
    public final void x1(rc2 rc2Var, TLRPC.WebPage webPage, String str, boolean z) {
        l11.u(rc2Var.getContext(), str);
    }

    @Override // mc2
    public final boolean z1() {
        return false;
    }

    @Override // mc2
    public final void A(rc2 rc2Var) {
    }

    @Override // mc2
    public final void C1() {
    }

    @Override // mc2
    public final void F0(rc2 rc2Var) {
    }

    @Override // mc2
    public final void G(rc2 rc2Var) {
    }

    @Override // mc2
    public final void J1(rc2 rc2Var) {
    }

    @Override // mc2
    public final void L1(rc2 rc2Var) {
    }

    @Override // mc2
    public final void M0(rc2 rc2Var) {
    }

    @Override // mc2
    public final void P(rc2 rc2Var) {
    }

    @Override // mc2
    public final void Q0(rc2 rc2Var) {
    }

    @Override // mc2
    public final void Q1(rc2 rc2Var) {
    }

    @Override // mc2
    public final void R(rc2 rc2Var) {
    }

    @Override // mc2
    public final void T(k47 k47Var) {
    }

    @Override // mc2
    public final void T0() {
    }

    @Override // mc2
    public final void U0(rc2 rc2Var) {
    }

    @Override // mc2
    public final void X0(rc2 rc2Var) {
    }

    @Override // mc2
    public final void Y(int i) {
    }

    @Override // mc2
    public final void c() {
    }

    @Override // mc2
    public final void e0(k47 k47Var) {
    }

    @Override // mc2
    public final void g2() {
    }

    @Override // mc2
    public final void h0(String str) {
    }

    @Override // mc2
    public final void i2(rc2 rc2Var) {
    }

    @Override // mc2
    public final void k(rc2 rc2Var) {
    }

    @Override // mc2
    public final void k0(rc2 rc2Var) {
    }

    @Override // mc2
    public final void k1(rc2 rc2Var) {
    }

    @Override // mc2
    public final void o2() {
    }

    @Override // mc2
    public final void q() {
    }

    @Override // mc2
    public final void q1(h47 h47Var) {
    }

    @Override // mc2
    public final void q2(rc2 rc2Var) {
    }

    @Override // mc2
    public final void s0() {
    }

    @Override // mc2
    public final void y1(rc2 rc2Var) {
    }

    @Override // mc2
    public final void B1(rc2 rc2Var, ir0 ir0Var) {
    }

    @Override // mc2
    public final void D0(rc2 rc2Var, boolean z) {
    }

    @Override // mc2
    public final void N1(String str, String str2) {
    }

    @Override // mc2
    public final void P1(rc2 rc2Var, n28 n28Var) {
    }

    @Override // mc2
    public final void U(rc2 rc2Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    @Override // mc2
    public final void X1(rc2 rc2Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    @Override // mc2
    public final void i0(rc2 rc2Var, int i) {
    }

    @Override // mc2
    public final void m0(rc2 rc2Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override // mc2
    public final void o1(rc2 rc2Var, boolean z) {
    }

    @Override // mc2
    public final void v0(rc2 rc2Var, long j) {
    }

    @Override // mc2
    public final void F(rc2 rc2Var, TLRPC.Document document, RectF rectF) {
    }

    @Override // mc2
    public final void I1(rc2 rc2Var, TLObject tLObject, boolean z) {
    }

    @Override // mc2
    public final void N0(rc2 rc2Var, float f, float f2) {
    }

    @Override // mc2
    public final void i1(rc2 rc2Var, float f, float f2) {
    }

    @Override // mc2
    public final void l2(rc2 rc2Var, boolean z, boolean z2) {
    }

    @Override // mc2
    public final void o0(rc2 rc2Var, int i, int i2) {
    }

    @Override // mc2
    public final void u1(rc2 rc2Var, boolean z, boolean z2) {
    }

    @Override // mc2
    public final void m(rc2 rc2Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i) {
    }

    @Override // mc2
    public final void z(rc2 rc2Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    @Override // mc2
    public final void V0(rc2 rc2Var, TLRPC.ReactionCount reactionCount, boolean z, float f, float f2) {
    }

    @Override // mc2
    public final void b1(rc2 rc2Var, ArrayList arrayList, int i, int i2, int i3) {
    }
}
