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
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class of1 implements rb2 {
    public final /* synthetic */ tf1 a;

    public of1(tf1 tf1Var) {
        this.a = tf1Var;
    }

    @Override // rb2
    public final boolean A1(hm hmVar) {
        return false;
    }

    @Override // rb2
    public final boolean E(wb2 wb2Var, TLRPC.TodoItem todoItem) {
        return false;
    }

    @Override // rb2
    public final boolean G0(wb2 wb2Var, TLRPC.TodoItem todoItem, boolean z) {
        return false;
    }

    @Override // rb2
    public final void H(wb2 wb2Var, int i, float f, float f2, boolean z) {
        r47 r47Var = wb2Var.getMessageObject().C;
        long B0 = r47.B0(r47Var.k);
        wf1 wf1Var = this.a.n;
        if (B0 == (-wf1Var.f.id)) {
            for (int i2 = 0; i2 < wf1Var.p0.size(); i2++) {
                r47 r47Var2 = (r47) wf1Var.p0.get(i2);
                if (r47Var2 != null && r47Var2.U != 1 && r47Var2.L1() == r47Var.L1()) {
                    wf1Var.c1(r47Var2);
                    return;
                }
            }
        }
        Bundle bundle = new Bundle();
        bundle.putLong("chat_id", wf1Var.f.id);
        bundle.putInt("message_id", r47Var.L1());
        wf1Var.presentFragment(new zu1(bundle));
    }

    @Override // rb2
    public final void I0(wb2 wb2Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        r47 messageObject = wb2Var.getMessageObject();
        wf1 wf1Var = this.a.n;
        if (wf1Var.q0.contains(Long.valueOf(messageObject.T))) {
            wf1Var.q0.remove(Long.valueOf(messageObject.T));
        } else {
            wf1Var.q0.add(Long.valueOf(messageObject.T));
        }
        wf1Var.a1(true);
        wf1Var.O0();
        wf1Var.F.f();
    }

    @Override // rb2
    public final de8 J1() {
        return null;
    }

    @Override // rb2
    public final boolean K() {
        return false;
    }

    @Override // rb2
    public final void L(wb2 wb2Var, CharacterStyle characterStyle, boolean z) {
        TLRPC.WebPage webPage;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        wf1 wf1Var = this.a.n;
        if (characterStyle != null) {
            r47 messageObject = wb2Var.getMessageObject();
            if (characterStyle instanceof e8c) {
                e8c e8cVar = (e8c) characterStyle;
                hl.g(e8cVar.a.subSequence(e8cVar.b, e8cVar.c).toString());
                if (hl.C3()) {
                    Toast.makeText(wf1Var.getParentActivity(), ob6.M0(2131743847, null), 0).show();
                    return;
                }
                return;
            }
            if (characterStyle instanceof i8c) {
                Long A = Utilities.A(((i8c) characterStyle).getURL());
                long longValue = A.longValue();
                if (longValue > 0) {
                    i4 = ((e) wf1Var).currentAccount;
                    TLRPC.User X1 = uc7.s1(i4).X1(A);
                    if (X1 != null) {
                        i5 = ((e) wf1Var).currentAccount;
                        uc7.s1(i5).I3(X1, null, wf1Var, 0);
                        return;
                    }
                    return;
                }
                i2 = ((e) wf1Var).currentAccount;
                TLRPC.Chat M0 = uc7.s1(i2).M0(Long.valueOf(-longValue));
                if (M0 != null) {
                    i3 = ((e) wf1Var).currentAccount;
                    uc7.s1(i3).I3(null, M0, wf1Var, 0);
                    return;
                }
                return;
            }
            if (characterStyle instanceof f8c) {
                String url = ((f8c) characterStyle).getURL();
                if (url.startsWith("@")) {
                    i = ((e) wf1Var).currentAccount;
                    uc7.s1(i).H3(url.substring(1), wf1Var, 0, null);
                    return;
                } else {
                    if (url.startsWith("#")) {
                        uj3 uj3Var = new uj3(null);
                        uj3Var.p2 = url;
                        wf1Var.presentFragment(uj3Var);
                        return;
                    }
                    return;
                }
            }
            String url2 = ((URLSpan) characterStyle).getURL();
            if (z) {
                nx0 i6 = ik8.i(wf1Var.getParentActivity(), false, 1, null);
                i6.P = url2;
                i6.Q = false;
                CharSequence[] charSequenceArr = {ob6.M0(2131747544, null), ob6.M0(2131751732, null)};
                oh ohVar = new oh((Object) this, (Object) url2, (byte) 2);
                i6.M = charSequenceArr;
                i6.L = ohVar;
                wf1Var.showDialog(i6);
                return;
            }
            if (characterStyle instanceof h8c) {
                String url3 = ((h8c) characterStyle).getURL();
                if (m01.h(url3)) {
                    m01.q(wf1Var.getParentActivity(), url3, true);
                    return;
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(wf1Var.getParentActivity());
                String M02 = ob6.M0(2131747506, null);
                id idVar = alertDialog$Builder.a;
                idVar.S = M02;
                idVar.U = ob6.a0(null, null, 2131747509, url3);
                alertDialog$Builder.j(ob6.M0(2131747544, null), new h01((Object) wf1Var, (Object) url3, (byte) 6));
                alertDialog$Builder.g(ob6.M0(2131752570, null), null);
                wf1Var.showDialog(idVar);
                return;
            }
            TLRPC.MessageMedia messageMedia = messageObject.k.media;
            if ((messageMedia instanceof TLRPC.TL_messageMediaWebPage) && (webPage = messageMedia.webpage) != null && webPage.cached_page != null) {
                String lowerCase = url2.toLowerCase();
                String lowerCase2 = messageObject.k.media.webpage.url.toLowerCase();
                if ((m01.j(lowerCase, false, false) || lowerCase.contains("t.me/iv")) && (lowerCase.contains(lowerCase2) || lowerCase2.contains(lowerCase))) {
                    LaunchActivity launchActivity = LaunchActivity.H1;
                    if (launchActivity == null || launchActivity.O() == null || LaunchActivity.H1.O().k(messageObject) == null) {
                        wf1Var.createArticleViewer(false).L(messageObject, null, null, null);
                        return;
                    }
                    return;
                }
            }
            m01.q(wf1Var.getParentActivity(), url2, true);
        }
    }

    @Override // rb2
    public final boolean L1(long j) {
        return false;
    }

    @Override // rb2
    public final boolean M() {
        return false;
    }

    @Override // rb2
    public final String M0(wb2 wb2Var) {
        return null;
    }

    @Override // rb2
    public final int N() {
        return 0;
    }

    @Override // rb2
    public final int P(wb2 wb2Var) {
        return 0;
    }

    @Override // rb2
    public final boolean P0(wb2 wb2Var, TL_iv.PageBlock pageBlock) {
        return false;
    }

    @Override // rb2
    public final boolean R1(r47 r47Var) {
        return true;
    }

    @Override // rb2
    public final iv1 S() {
        return null;
    }

    @Override // rb2
    public final void T1(wb2 wb2Var, TLRPC.Chat chat, int i, float f, float f2, boolean z) {
        int i2;
        wf1 wf1Var = this.a.n;
        if (chat == null || chat == wf1Var.f) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("chat_id", chat.id);
        if (i != 0) {
            bundle.putInt("message_id", i);
        }
        i2 = ((e) wf1Var).currentAccount;
        if (uc7.s1(i2).C(bundle, wf1Var, null, null)) {
            wf1Var.presentFragment(new zu1(bundle), true);
        }
    }

    @Override // rb2
    public final boolean V1(wb2 wb2Var, TLRPC.User user) {
        int i;
        int i2;
        yb0 b;
        wf1 wf1Var = this.a.n;
        if (user != null) {
            long j = user.id;
            i = ((e) wf1Var).currentAccount;
            if (j != yac.h(i).e()) {
                ec0[] ec0VarArr = {ec0.d, ec0.h};
                TLRPC.UserFull Y1 = wf1Var.getMessagesController().Y1(user.id);
                if (Y1 != null) {
                    b = yb0.c(user, Y1, ec0VarArr);
                } else {
                    i2 = ((e) wf1Var).classGuid;
                    b = yb0.b(user, i2, ec0VarArr);
                }
                if (vh4.i(b)) {
                    vh4.r().J((ViewGroup) wf1Var.fragmentView, wf1Var.getResourceProvider(), b, new h01(this, wb2Var, user));
                    return true;
                }
            }
        }
        return false;
    }

    @Override // rb2
    public final void W(wb2 wb2Var, TLRPC.User user, float f, float f2) {
        int i;
        if (user != null) {
            long j = user.id;
            i = ((e) this.a.n).currentAccount;
            if (j != yac.h(i).e()) {
                a(user);
            }
        }
    }

    @Override // rb2
    public final boolean W1(wb2 wb2Var) {
        return false;
    }

    @Override // rb2
    public final boolean Z() {
        return false;
    }

    public final void a(TLRPC.User user) {
        Bundle bundle = new Bundle();
        bundle.putLong("user_id", user.id);
        wf1 wf1Var = this.a.n;
        long j = user.id;
        int i = wf1.Q0;
        wf1Var.J0(bundle, j);
        ProfileActivity profileActivity = new ProfileActivity(bundle, null);
        profileActivity.y3(0);
        wf1Var.presentFragment(profileActivity);
    }

    @Override // rb2
    public final CharacterStyle a0(wb2 wb2Var) {
        return null;
    }

    @Override // rb2
    public final void a1(wb2 wb2Var) {
        tf1 tf1Var = this.a;
        wf1 wf1Var = tf1Var.n;
        if (wf1Var.getParentActivity() == null) {
            return;
        }
        wf1Var.showDialog(kea.H0(tf1Var.c, wb2Var.getMessageObject(), null, xc2.T(wf1Var.f) && !wf1Var.f.megagroup, null));
    }

    @Override // rb2
    public final void a2(wb2 wb2Var, float f, float f2) {
        wf1 wf1Var = this.a.n;
        int i = wf1.Q0;
        wf1Var.M0(wb2Var, 0.0f, 0.0f);
    }

    @Override // rb2
    public final boolean b() {
        return true;
    }

    @Override // rb2
    public final boolean c0() {
        return true;
    }

    @Override // rb2, al1
    public final boolean h() {
        return true;
    }

    @Override // rb2
    public final void i() {
        a.t();
        boolean z = f11.a;
        a.q();
        m01.u(this.a.n.getParentActivity(), f11.g);
    }

    @Override // rb2
    public final boolean i1() {
        return false;
    }

    @Override // rb2
    public final boolean i2(int i) {
        return false;
    }

    @Override // rb2
    public final /* synthetic */ boolean j1(r47 r47Var) {
        return bp1.a(r47Var);
    }

    @Override // rb2
    public final boolean j2(wb2 wb2Var, r47 r47Var) {
        if (r47.Q4(r47Var.k) || r47Var.g4()) {
            boolean V = MediaController.z().V(r47Var);
            MediaController.z().u0(null, false);
            return V;
        }
        if (r47Var.I3()) {
            return MediaController.z().q0(this.a.n.p0, r47Var, 0L, true, null, 0L);
        }
        return false;
    }

    @Override // rb2
    public final boolean k0(wb2 wb2Var, boolean z) {
        return false;
    }

    @Override // rb2
    public final boolean k1(wb2 wb2Var, int i) {
        return false;
    }

    @Override // rb2
    public final bmb l2() {
        return null;
    }

    @Override // rb2
    public final boolean o0(wb2 wb2Var, TLRPC.Chat chat) {
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00f3, code lost:
    
        if (r13.exists() == false) goto L51;
     */
    @Override // rb2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void q0(wb2 wb2Var, float f, float f2, boolean z) {
        int i;
        File file;
        wf1 wf1Var = this.a.n;
        r47 messageObject = wb2Var.getMessageObject();
        if (r47.j1(messageObject.k) != null) {
            wf1Var.showDialog(new s4b(wf1Var.getParentActivity(), wf1Var, r47.j1(messageObject.k), null, null, null));
            return;
        }
        File file2 = null;
        if (r47.K4(messageObject.k) || (i = messageObject.D) == 1 || ((i == 0 && !messageObject.Z4()) || r47.t3(messageObject.k))) {
            PhotoViewer.q0().T1(null, wf1Var, null);
            PhotoViewer.q0().l1(messageObject, null, 0L, 0L, 0L, wf1Var.C0);
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
                    xb4 fileLoader = wf1Var.getFileLoader();
                    TLRPC.Message message = messageObject.k;
                    fileLoader.getClass();
                    file2 = xb4.M(message, false, true);
                }
                Intent intent = new Intent("android.intent.action.VIEW");
                if (Build.VERSION.SDK_INT >= 24) {
                    intent.setFlags(1);
                    Activity parentActivity = wf1Var.getParentActivity();
                    a.d();
                    intent.setDataAndType(FileProvider.c(parentActivity, "org.telegram.messenger.beta.provider", file2), "video/mp4");
                } else {
                    intent.setDataAndType(Uri.fromFile(file2), "video/mp4");
                }
                wf1Var.getParentActivity().startActivityForResult(intent, 500);
                return;
            } catch (Exception unused) {
                int i3 = wf1.Q0;
                wf1Var.K0(messageObject);
                return;
            }
        }
        if (i2 == 4) {
            if (hl.H1(wf1Var)) {
                uc6 uc6Var = new uc6(0);
                uc6Var.G0(messageObject);
                wf1Var.presentFragment(uc6Var);
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
                    xb4 fileLoader2 = wf1Var.getFileLoader();
                    TLRPC.Message message2 = messageObject.k;
                    fileLoader2.getClass();
                    File M = xb4.M(message2, false, true);
                    if (M.exists()) {
                        file = M;
                    }
                }
                as asVar = wf1Var.y;
                if (asVar != null) {
                    if (asVar.M0() < wf1Var.y.A() - 1) {
                        wf1Var.h0 = wf1Var.y.K0();
                        n69 n69Var = (n69) wf1Var.w.L(wf1Var.h0);
                        if (n69Var != null) {
                            wf1Var.i0 = n69Var.a.getTop();
                        } else {
                            wf1Var.h0 = -1;
                        }
                    } else {
                        wf1Var.h0 = -1;
                    }
                }
                znb u = aob.u(file, messageObject.I0(), null, true);
                if (u != null) {
                    wf1Var.presentFragment(new pqb(u));
                    return;
                }
                wf1Var.h0 = -1;
            }
            try {
                hl.r2(messageObject, wf1Var.getParentActivity(), null, false);
            } catch (Exception unused2) {
                int i4 = wf1.Q0;
                wf1Var.K0(messageObject);
            }
        }
    }

    @Override // rb2
    public final void q1(wb2 wb2Var, int i) {
        TLRPC.WebPage webPage;
        int i2;
        wf1 wf1Var = this.a.n;
        r47 messageObject = wb2Var.getMessageObject();
        TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent = messageObject.L1;
        if (tL_channelAdminLogEvent != null && (tL_channelAdminLogEvent.action instanceof TLRPC.TL_channelAdminLogEventActionEditMessage)) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", -r47.B0(messageObject.k));
            bundle.putInt("message_id", messageObject.L1());
            zu1 zu1Var = new zu1(bundle);
            if (xc2.c0(wf1Var.f)) {
                long B0 = r47.B0(messageObject.k);
                i2 = ((e) wf1Var).currentAccount;
                ro4.a(zu1Var, jf7.a(B0, r47.b2(i2, messageObject.k, true, false)));
            }
            wf1Var.presentFragment(zu1Var);
            return;
        }
        if (i == 0) {
            TLRPC.MessageMedia messageMedia = messageObject.k.media;
            if (messageMedia == null || (webPage = messageMedia.webpage) == null || webPage.cached_page == null) {
                return;
            }
            LaunchActivity launchActivity = LaunchActivity.H1;
            if (launchActivity == null || launchActivity.O() == null || LaunchActivity.H1.O().k(messageObject) == null) {
                wf1Var.createArticleViewer(false).L(messageObject, null, null, null);
                return;
            }
            return;
        }
        if (i != 5) {
            TLRPC.MessageMedia messageMedia2 = messageObject.k.media;
            if (messageMedia2 == null || messageMedia2.webpage == null) {
                return;
            }
            m01.u(wf1Var.getParentActivity(), messageObject.k.media.webpage.url);
            return;
        }
        TLRPC.User X1 = wf1Var.getMessagesController().X1(Long.valueOf(messageObject.k.media.user_id));
        TLRPC.MessageMedia messageMedia3 = messageObject.k.media;
        String str = messageMedia3.vcard;
        String str2 = messageMedia3.first_name;
        String str3 = messageMedia3.last_name;
        try {
            File f1 = hl.f1();
            f1.mkdirs();
            File file = new File(f1, "vcard.vcf");
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));
            bufferedWriter.write(str);
            bufferedWriter.close();
            wf1Var.showDialog(new r78(wf1Var, null, X1, null, file, null, str2, str3, null));
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    @Override // rb2
    public final boolean s0(wb2 wb2Var, TLRPC.PollAnswer pollAnswer) {
        return false;
    }

    @Override // rb2
    public final void t1(r47 r47Var, String str, String str2, String str3, String str4, int i, int i2) {
        wf1 wf1Var = this.a.n;
        iv3.J0(wf1Var, r47Var, wf1Var.C0, str2, str3, str4, str, i, i2, -1, false);
    }

    @Override // rb2
    public final String u(long j) {
        return null;
    }

    @Override // rb2
    public final void u1(wb2 wb2Var, TLRPC.WebPage webPage, String str, boolean z) {
        m01.u(wb2Var.getContext(), str);
    }

    @Override // rb2
    public final void v(wb2 wb2Var, float f, float f2) {
        wf1 wf1Var = this.a.n;
        int i = wf1.Q0;
        wf1Var.M0(wb2Var, 0.0f, 0.0f);
    }

    @Override // rb2
    public final boolean w0(wb2 wb2Var) {
        return false;
    }

    @Override // rb2
    public final boolean w1() {
        return false;
    }

    @Override // rb2
    public final boolean y0(long j) {
        return false;
    }

    @Override // rb2
    public final void Q0() {
    }

    @Override // rb2
    public final void d() {
    }

    @Override // rb2
    public final void d2() {
    }

    @Override // rb2
    public final void k2() {
    }

    @Override // rb2
    public final void r() {
    }

    @Override // rb2
    public final void r0() {
    }

    @Override // rb2
    public final void z1() {
    }

    @Override // rb2
    public final void A(wb2 wb2Var) {
    }

    @Override // rb2
    public final void C0(wb2 wb2Var) {
    }

    @Override // rb2
    public final void G(wb2 wb2Var) {
    }

    @Override // rb2
    public final void G1(wb2 wb2Var) {
    }

    @Override // rb2
    public final void I1(wb2 wb2Var) {
    }

    @Override // rb2
    public final void J0(wb2 wb2Var) {
    }

    @Override // rb2
    public final void N0(wb2 wb2Var) {
    }

    @Override // rb2
    public final void N1(wb2 wb2Var) {
    }

    @Override // rb2
    public final void O(wb2 wb2Var) {
    }

    @Override // rb2
    public final void Q(wb2 wb2Var) {
    }

    @Override // rb2
    public final void T(r47 r47Var) {
    }

    @Override // rb2
    public final void U0(wb2 wb2Var) {
    }

    @Override // rb2
    public final void Y(int i) {
    }

    @Override // rb2
    public final void Y0(wb2 wb2Var) {
    }

    @Override // rb2
    public final void d0(r47 r47Var) {
    }

    @Override // rb2
    public final void e2(wb2 wb2Var) {
    }

    @Override // rb2
    public final void g0(String str) {
    }

    @Override // rb2
    public final void h1(wb2 wb2Var) {
    }

    @Override // rb2
    public final void j0(wb2 wb2Var) {
    }

    @Override // rb2
    public final void l(wb2 wb2Var) {
    }

    @Override // rb2
    public final void m2(wb2 wb2Var) {
    }

    @Override // rb2
    public final void n1(o47 o47Var) {
    }

    @Override // rb2
    public final void v1(wb2 wb2Var) {
    }

    @Override // rb2
    public final void A0(wb2 wb2Var, boolean z) {
    }

    @Override // rb2
    public final void K1(String str, String str2) {
    }

    @Override // rb2
    public final void M1(wb2 wb2Var, q38 q38Var) {
    }

    @Override // rb2
    public final void U(wb2 wb2Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    @Override // rb2
    public final void U1(wb2 wb2Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    @Override // rb2
    public final void h0(wb2 wb2Var, int i) {
    }

    @Override // rb2
    public final void l0(wb2 wb2Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override // rb2
    public final void l1(wb2 wb2Var, boolean z) {
    }

    @Override // rb2
    public final void u0(wb2 wb2Var, long j) {
    }

    @Override // rb2
    public final void y1(wb2 wb2Var, iq0 iq0Var) {
    }

    @Override // rb2
    public final void F(wb2 wb2Var, TLRPC.Document document, RectF rectF) {
    }

    @Override // rb2
    public final void F1(wb2 wb2Var, TLObject tLObject, boolean z) {
    }

    @Override // rb2
    public final void K0(wb2 wb2Var, float f, float f2) {
    }

    @Override // rb2
    public final void f1(wb2 wb2Var, float f, float f2) {
    }

    @Override // rb2
    public final void h2(wb2 wb2Var, boolean z, boolean z2) {
    }

    @Override // rb2
    public final void n0(wb2 wb2Var, int i, int i2) {
    }

    @Override // rb2
    public final void r1(wb2 wb2Var, boolean z, boolean z2) {
    }

    @Override // rb2
    public final void m(wb2 wb2Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i) {
    }

    @Override // rb2
    public final void z(wb2 wb2Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    @Override // rb2
    public final void V0(wb2 wb2Var, TLRPC.ReactionCount reactionCount, boolean z, float f, float f2) {
    }

    @Override // rb2
    public final void c1(wb2 wb2Var, ArrayList arrayList, int i, int i2, int i3) {
    }
}
