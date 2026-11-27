// default package

import android.content.ClipboardManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_aicompose;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.m;
import org.telegram.ui.o;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class c0 implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ c0(Object obj, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        n12 n12Var;
        boolean q1;
        r57 r57Var;
        TLRPC.Document document;
        byte b = this.a;
        byte b2 = 3;
        byte b3 = 4;
        byte b4 = 2;
        CharSequence charSequence = null;
        r8 = false;
        boolean z = false;
        Object obj = this.d;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (b) {
            case 0:
                f0 f0Var = (f0) obj3;
                TL_aicompose.AiComposeTone aiComposeTone = (TL_aicompose.AiComposeTone) obj2;
                vnb vnbVar = (vnb) obj;
                c51 c51Var = f0Var.a2;
                if (c51Var.e0 && !c51Var.R) {
                    if (f0Var.Z0()) {
                        f0Var.dismiss();
                        break;
                    } else {
                        c51Var.setLoading(true);
                        TL_aicompose.saveTone savetone = new TL_aicompose.saveTone();
                        savetone.tone = TL_aicompose.InputAiComposeTone.from(aiComposeTone);
                        ConnectionsManager.getInstance(f0Var.a).sendRequestTyped(savetone, new ic(false ? (byte) 1 : (byte) 0), new p((Object) f0Var, (Object) vnbVar, (Object) aiComposeTone, (byte) (1 == true ? 1 : 0)));
                        break;
                    }
                }
                break;
            case 1:
                new uy((Context) obj2, null, null, (kv4) obj).show();
                ((k9) obj3).dismiss();
                break;
            case 2:
                xea.l0 = ((Integer) ((ArrayList) obj3).get(((Integer) view.getTag()).intValue())).intValue();
                SharedPreferences.Editor edit = uc7.e1().edit();
                edit.putInt("mapPreviewType", xea.l0);
                edit.apply();
                ((Runnable) obj2).run();
                ((AlertDialog$Builder) obj).a.M0.run();
                break;
            case 3:
                ((boolean[]) obj3)[0] = false;
                ((hj) obj2).y(-1, 0, true);
                ((nx0) ((z8d) obj).b).y0.run();
                break;
            case 4:
                uc ucVar = (uc) obj2;
                fj fjVar = (fj) obj;
                id idVar = ((id[]) obj3)[0];
                if (idVar != null) {
                    idVar.setOnDismissListener(null);
                }
                ucVar.run();
                fjVar.a(((l5) view).getAccountNumber());
                break;
            case 5:
                jx8 jx8Var = (jx8) obj3;
                ax0 ax0Var = (ax0) obj;
                SharedPreferences.Editor edit2 = uc7.e1().edit();
                edit2.putBoolean("proxy_enabled", true);
                jx8Var.i(edit2);
                edit2.commit();
                xea.x1 = xea.a(new wea(jx8Var));
                ConnectionsManager.setProxySettings(true, jx8Var);
                jn7.e().k(jn7.D4, new Object[0]);
                e lastFragment = ((LaunchActivity) obj2).N().getLastFragment();
                if (lastFragment instanceof zu1) {
                    zu1 zu1Var = (zu1) lastFragment;
                    zu1Var.i6();
                    UndoView undoView = zu1Var.N3;
                    if (undoView != null) {
                        undoView.j(87, 0L, null);
                        ax0Var.run();
                        break;
                    }
                }
                jn7.e().k(jn7.S4, 6, ob6.M0(2131746337, null));
                ax0Var.run();
            case 6:
                o oVar = (o) obj3;
                String str = (String) obj2;
                m mVar = (m) obj;
                oVar.i0.k(false);
                hl.t1(oVar.i0.c0);
                if (TextUtils.isEmpty(str)) {
                    str = "about:blank";
                }
                hl.g(str);
                new d31(mVar.f, null).k(false).k(true);
                break;
            case 7:
                uy uyVar = (uy) obj3;
                boolean[] zArr = (boolean[]) obj2;
                vnb vnbVar2 = (vnb) obj;
                if (!zArr[0]) {
                    zArr[0] = true;
                    ov4.c(uyVar.a).e(uyVar.S1, new gt(uyVar, zArr, vnbVar2, b4));
                    break;
                }
                break;
            case 8:
                fz fzVar = (fz) obj3;
                int i = fzVar.a;
                kv4 kv4Var = fzVar.h2;
                new gra((Context) obj2, (vnb) obj, i, kv4Var.d.title, kv4Var.h, false).show();
                fzVar.dismiss();
                break;
            case 9:
                fz fzVar2 = (fz) obj3;
                boolean[] zArr2 = (boolean[]) obj2;
                vnb vnbVar3 = (vnb) obj;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    ov4.c(fzVar2.a).e(fzVar2.T1, new gt(fzVar2, zArr2, vnbVar3, b2));
                    break;
                }
                break;
            case 10:
                ((i20) obj3).n.S0((k20) obj2, (r47) obj);
                break;
            case 11:
                x31 x31Var = (x31) obj3;
                fu5 G = fu5.G(((zu1) obj2).getLayoutContainer(), (vnb) obj, x31Var.n);
                G.b(R.drawable.msg_cancel, ob6.M0(2131753695, null), new w31(x31Var, 1 == true ? 1 : 0), true);
                G.F();
                if (x31Var.y != null) {
                    G.b(R.drawable.msg_settings, ob6.M0(2131753696, null), new w31(x31Var, b4), false);
                }
                G.b0(hl.L(10.0f), hl.L(7.0f));
                G.s = (short) 0;
                G.a0();
                break;
            case 12:
                h71 h71Var = (h71) obj3;
                e eVar = (e) obj;
                Bundle bundle = new Bundle();
                c71 c71Var = ((p71) obj2).d;
                long j = c71Var.b;
                if (j > 0) {
                    bundle.putLong("user_id", j);
                } else {
                    bundle.putLong("chat_id", -j);
                }
                bundle.putInt("message_id", c71Var.g);
                eVar.presentFragment(new zu1(bundle));
                h71Var.f.G.dismiss();
                n8 n8Var = h71Var.a;
                if (n8Var != null) {
                    n8Var.d(true);
                    break;
                }
                break;
            case 13:
                hbb hbbVar = (hbb) obj3;
                FrameLayout frameLayout = (FrameLayout) obj2;
                x53 x53Var = (x53) obj;
                fu5 fu5Var = hbbVar.V0;
                if (fu5Var == null || !fu5Var.E()) {
                    wb1 wb1Var = new wb1(hbbVar, false ? (byte) 1 : (byte) 0);
                    boolean p = yac.h(hbbVar.V).p();
                    wb1 wb1Var2 = p ? null : new wb1(hbbVar, 1 == true ? 1 : 0);
                    fu5 G2 = fu5.G(frameLayout, x53Var, hbbVar.T0);
                    hbbVar.V0 = G2;
                    G2.o(13, hl.L(200.0f), ob6.N0("StoryPeriodHint"));
                    hbbVar.V0.j();
                    int i2 = 0;
                    while (true) {
                        int[] iArr = zb1.Q1;
                        if (i2 >= b3) {
                            fu5 fu5Var2 = hbbVar.V0;
                            fu5Var2.s = (short) 0;
                            fu5Var2.a0();
                            break;
                        } else {
                            int i3 = iArr[i2];
                            fu5 fu5Var3 = hbbVar.V0;
                            String N0 = i3 == Integer.MAX_VALUE ? ob6.N0("StoryPeriodKeep") : ob6.G(i3 / 3600, "Hours", new Object[0]);
                            int i4 = aob.E8;
                            fu5Var3.a(0, null, N0, null, i4, i4, new zd((Object) wb1Var, i3, (byte) 11));
                            fu5Var3.N((p || i3 == 86400 || i3 == Integer.MAX_VALUE) ? null : new zd((Object) wb1Var2, i3, (byte) 12));
                            if (hbbVar.X0 == i2) {
                                hbbVar.V0.M();
                            }
                            i2++;
                            b3 = 4;
                        }
                    }
                }
                break;
            case 14:
                zu1 zu1Var2 = (zu1) obj3;
                TL_keyboard.KeyboardInlineButton keyboardInlineButton = (TL_keyboard.KeyboardInlineButton) obj2;
                r47 r47Var = (r47) obj;
                if (zu1Var2.getParentActivity() != null) {
                    if (zu1Var2.d1.getVisibility() != 0 || ehb.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeSwitchInline.class) || ehb.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeCallback.class) || ehb.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeGame.class) || ehb.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeUrl.class) || ehb.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeBuy.class) || ehb.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeUrlAuth.class) || ehb.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeUserProfile.class)) {
                        zu1Var2.a0.u0(keyboardInlineButton, r47Var, r47Var, null);
                        break;
                    }
                }
                break;
            case 15:
                ((zu1) obj3).Na((jf0) obj2, (TLRPC.ReactionCount) obj, 0.0f, 0.0f);
                break;
            case 16:
                ((zu1) obj3).L8((boolean[]) obj2, (Context) obj);
                break;
            case 17:
                o39 o39Var = (o39) obj3;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) obj2;
                int[] iArr2 = (int[]) obj;
                if (o39Var == null || o39Var.x) {
                    actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().e(iArr2[0]);
                    break;
                }
                break;
            case 18:
                ((zu1) obj3).N8((pr1) obj2, (boolean[]) obj);
                break;
            case 19:
                ju1 ju1Var = (ju1) obj3;
                TLRPC.Chat chat = (TLRPC.Chat) obj2;
                wb2 wb2Var = (wb2) obj;
                e eVar2 = ju1Var.a;
                eVar2.finishPreviewFragment();
                chat.left = false;
                if (wb2Var.w != null) {
                    eVar2.getNotificationCenter().k(jn7.h3, Long.valueOf(wb2Var.w.e));
                }
                eVar2.getMessagesController().k(chat.id, eVar2.getUserConfig().f(), null, eVar2, false, new vt1(ju1Var, chat, false ? (byte) 1 : (byte) 0), null);
                break;
            case 20:
                n12 n12Var2 = (n12) obj3;
                e eVar3 = (e) obj2;
                vnb vnbVar4 = (vnb) obj;
                e eVar4 = n12Var2.Z1;
                int i5 = n12Var2.G3;
                u02 u02Var = n12Var2.F2;
                ox1 ox1Var = n12Var2.b2;
                long i6 = ox1Var != null ? ox1Var.i() : 0L;
                n12Var2.K2 = i6;
                u02Var.setEffect(i6);
                n12Var2.f1 = true;
                if (n12Var2.E1 - n12Var2.F1 < 0) {
                    hl.z3(n12Var2.t1);
                    hl.z3(n12Var2.u1);
                    try {
                        u02Var.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    if (!uc7.s1(i5).M3() && uc7.s1(i5).k4.p1.f() > n12Var2.F1) {
                        n12Var2.z1(eVar3);
                    }
                    ox1 ox1Var2 = n12Var2.b2;
                    if (ox1Var2 != null) {
                        ox1Var2.f(false);
                        n12Var2.b2 = null;
                        break;
                    }
                } else {
                    if (n12Var2.E3 == null && (eVar4 instanceof zu1)) {
                        zu1 zu1Var3 = (zu1) eVar4;
                        if (zu1Var3.X7()) {
                            jj.J(n12Var2.getContext(), zu1Var3.a(), new i02(n12Var2, i6, false ? (byte) 1 : (byte) 0), vnbVar4);
                            n12Var = n12Var2;
                            n12Var.r1(false, false);
                            break;
                        }
                    }
                    f12 f12Var = n12Var2.v2;
                    if (f12Var == n12Var2.d2 || f12Var == n12Var2.k2) {
                        n12Var = n12Var2;
                        q1 = n12Var.q1(true, 0, 0, i6, n12Var2.b1());
                    } else {
                        if (!f12Var.K(true, 0, 0, i6, n12Var2.b1())) {
                            n12Var2.A4 = true;
                            n12Var2.dismiss();
                        }
                        n12Var = n12Var2;
                        q1 = false;
                    }
                    ox1 ox1Var3 = n12Var.b2;
                    if (ox1Var3 != null) {
                        ox1Var3.f(!q1);
                        n12Var.b2 = null;
                    }
                    n12Var.r1(false, false);
                }
                break;
            case 21:
                n12 n12Var3 = (n12) obj3;
                r47 r47Var2 = (r47) obj2;
                n12Var3.r1(!n12Var3.W1, true);
                TLRPC.Message message = r47Var2.k;
                boolean z2 = n12Var3.W1;
                message.invert_media = z2;
                ((r57) obj).a(!z2, true);
                n12Var3.b2.d(r47Var2);
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = n12Var3.d2;
                if (chatAttachAlertPhotoLayout != null && (r57Var = chatAttachAlertPhotoLayout.e1) != null) {
                    r57Var.a(!n12Var3.W1, true);
                }
                n12Var3.b2.n(!n12Var3.W1);
                break;
            case 22:
                g92 g92Var = (g92) obj3;
                h29[] h29VarArr = (h29[]) obj2;
                z8d z8dVar = (z8d) obj;
                Integer num = (Integer) view.getTag();
                h29VarArr[0].a(num.intValue() == 0);
                h29VarArr[1].a(num.intValue() == 1);
                g92Var.K0 = num.intValue() == 1;
                ((nx0) z8dVar.b).y0.run();
                g92Var.t0(true, true);
                break;
            case 23:
                dg2 dg2Var = (dg2) obj3;
                TL_account.TL_connectedBot tL_connectedBot = (TL_account.TL_connectedBot) obj2;
                me7 me7Var = (me7) obj;
                c51 c51Var2 = dg2Var.X1;
                if (!c51Var2.R) {
                    c51Var2.setLoading(true);
                    TL_account.updateConnectedBot updateconnectedbot = new TL_account.updateConnectedBot();
                    updateconnectedbot.deleted = true;
                    updateconnectedbot.bot = uc7.s1(dg2Var.a).o1(tL_connectedBot.bot_id);
                    updateconnectedbot.recipients = new TL_account.TL_inputBusinessBotRecipients();
                    ConnectionsManager.getInstance(dg2Var.a).sendRequest(updateconnectedbot, new ql(dg2Var, me7Var, (byte) 24));
                    break;
                }
                break;
            case 24:
                r47 r47Var3 = (r47) obj2;
                PhotoViewer photoViewer = ((dh2) obj3).c.a;
                Drawable[] drawableArr = PhotoViewer.d9;
                ArrayList arrayList = ((hfc) obj).d;
                if (arrayList.isEmpty()) {
                    document = null;
                } else {
                    int size = arrayList.size();
                    int i7 = 0;
                    while (true) {
                        if (i7 < size) {
                            Object obj4 = arrayList.get(i7);
                            i7++;
                            jfc jfcVar = (jfc) obj4;
                            if (jfcVar.b()) {
                                document = jfcVar.g;
                            }
                        } else {
                            long j2 = Long.MAX_VALUE;
                            jfc jfcVar2 = null;
                            for (int i8 = 0; i8 < arrayList.size(); i8++) {
                                jfc jfcVar3 = (jfc) arrayList.get(i8);
                                if (jfcVar3.k < j2 && kfc.C0(jfcVar3.m)) {
                                    j2 = jfcVar3.k;
                                    jfcVar2 = jfcVar3;
                                }
                            }
                            document = jfcVar2 != null ? jfcVar2.g : ((jfc) arrayList.get(0)).g;
                        }
                    }
                }
                if (document != null) {
                    xb4.G(photoViewer.U);
                    File J = xb4.J(document, null, false, true);
                    if (J == null || !J.exists()) {
                        xb4.G(photoViewer.U);
                        J = xb4.J(document, null, true, true);
                    }
                    if (J == null || !J.exists()) {
                        ArrayList arrayList2 = new ArrayList();
                        r47Var3.f3 = document;
                        arrayList2.add(r47Var3);
                        MediaController.i0(photoViewer.E, k5.a(photoViewer.U), arrayList2, new ze1(photoViewer, b3));
                    } else {
                        MediaController.g0(J.toString(), photoViewer.E, 1, null, null, new ea8(photoViewer, 1 == true ? 1 : 0));
                    }
                    photoViewer.p0.U(null, null);
                    break;
                }
                break;
            case 25:
                kn2 kn2Var = (kn2) obj3;
                pcc pccVar = (pcc) obj2;
                TLRPC.Chat chat2 = (TLRPC.Chat) obj;
                boolean z3 = kn2Var.T1;
                if (chat2 != null && !xc2.w(27, chat2)) {
                    z = true;
                }
                kn2Var.Z0(pccVar, z3, z);
                break;
            case 26:
                cu2 cu2Var = (cu2) obj3;
                TLRPC.User user = (TLRPC.User) obj;
                jj.L((Context) obj2, ob6.M0(2131745813, null), ob6.a0(null, null, 2131745814, user.first_name), ob6.M0(2131745845, null), new st2(cu2Var, user, 1 == true ? 1 : 0), cu2Var.r).o();
                break;
            case 27:
                xt3 xt3Var = (xt3) obj3;
                xs0 xs0Var = (xs0) obj2;
                va7 va7Var = (va7) obj;
                try {
                    charSequence = ((ClipboardManager) xt3Var.getContext().getSystemService("clipboard")).getPrimaryClip().getItemAt(0).coerceToText(xt3Var.getContext());
                } catch (Exception e) {
                    cc4.g(e, true);
                }
                if (charSequence != null) {
                    xs0Var.setText(charSequence);
                    xs0Var.setSelection(0, xs0Var.getText().length());
                }
                va7Var.run();
                break;
            case 28:
                iu3 iu3Var = (iu3) obj3;
                wma wmaVar = (wma) obj2;
                vnb vnbVar5 = (vnb) obj;
                du3 du3Var = iu3Var.a;
                d41 d41Var = iu3Var.b;
                if (d41Var.isEnabled() && d41Var.getAlpha() >= 0.5f) {
                    hb hbVar = iu3Var.L;
                    if (hbVar == null || !hbVar.f) {
                        if (iu3Var.n) {
                            du3Var.m();
                            fu5 fu5Var4 = new fu5(wmaVar, vnbVar5, d41Var, false, false, true);
                            fu5Var4.d0 = hl.L(280.0f);
                            du3Var.o(null, new a37(fu5Var4, du3Var));
                            fu5Var4.a0 = true;
                            fu5Var4.a0();
                            break;
                        } else if (iu3Var.e) {
                            if (iu3Var.y) {
                                iu3Var.k(true);
                                iu3Var.y = false;
                                iu3Var.p();
                            }
                            iu3Var.v();
                            break;
                        } else {
                            iu3Var.x(1);
                            boolean isFocused = du3Var.isFocused();
                            iu3Var.d.B(du3Var.length() > 0, false);
                            du3Var.requestFocus();
                            if (!isFocused) {
                                du3Var.setSelection(du3Var.length());
                                break;
                            }
                        }
                    }
                }
                break;
            default:
                no6 no6Var = (no6) obj2;
                st4 st4Var = (st4) obj;
                wt4 wt4Var = ((qt4) obj3).c;
                ArrayList arrayList3 = wt4Var.i0;
                if (arrayList3.contains(no6Var)) {
                    arrayList3.remove(no6Var);
                } else if (arrayList3.size() + 1 > wt4Var.S) {
                    int i9 = -wt4Var.O;
                    wt4Var.O = i9;
                    hl.A3(i9, st4Var, null);
                    yw0.E.a();
                    break;
                } else {
                    arrayList3.add(no6Var);
                }
                hl.V3(wt4Var.d);
                wt4Var.j();
                break;
        }
    }
}
