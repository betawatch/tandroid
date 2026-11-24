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
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.m;
import org.telegram.ui.o;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class b0 implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ b0(Object obj, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        i22 i22Var;
        boolean p1;
        k57 k57Var;
        TLRPC.Document document;
        byte b = this.a;
        byte b2 = 4;
        byte b3 = 3;
        byte b4 = 2;
        CharSequence charSequence = null;
        r8 = false;
        boolean z = false;
        Object obj = this.d;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (b) {
            case 0:
                e0 e0Var = (e0) obj3;
                TL_aicompose.AiComposeTone aiComposeTone = (TL_aicompose.AiComposeTone) obj2;
                ylb ylbVar = (ylb) obj;
                b61 b61Var = e0Var.a2;
                if (b61Var.e0 && !b61Var.R) {
                    if (e0Var.Y0()) {
                        e0Var.dismiss();
                        break;
                    } else {
                        b61Var.setLoading(true);
                        TL_aicompose.saveTone savetone = new TL_aicompose.saveTone();
                        savetone.tone = TL_aicompose.InputAiComposeTone.from(aiComposeTone);
                        ConnectionsManager.getInstance(e0Var.a).sendRequestTyped(savetone, new kc(false ? (byte) 1 : (byte) 0), new p((Object) e0Var, (Object) ylbVar, (Object) aiComposeTone, (byte) (1 == true ? 1 : 0)));
                        break;
                    }
                }
                break;
            case 1:
                new tz((Context) obj2, null, null, (hv4) obj).show();
                ((j9) obj3).dismiss();
                break;
            case 2:
                ((boolean[]) obj3)[0] = false;
                ((gk) obj2).y(-1, 0, true);
                ((my0) ((k6d) obj).b).y0.run();
                break;
            case 3:
                td tdVar = (td) obj2;
                ek ekVar = (ek) obj;
                he heVar = ((he[]) obj3)[0];
                if (heVar != null) {
                    heVar.setOnDismissListener(null);
                }
                tdVar.run();
                ekVar.a(((k5) view).getAccountNumber());
                break;
            case 4:
                gda.l0 = ((Integer) ((ArrayList) obj3).get(((Integer) view.getTag()).intValue())).intValue();
                SharedPreferences.Editor edit = oc7.d1().edit();
                edit.putInt("mapPreviewType", gda.l0);
                edit.apply();
                ((Runnable) obj2).run();
                ((AlertDialog$Builder) obj).a.M0.run();
                break;
            case 5:
                bw8 bw8Var = (bw8) obj3;
                zx0 zx0Var = (zx0) obj;
                SharedPreferences.Editor edit2 = oc7.d1().edit();
                edit2.putBoolean("proxy_enabled", true);
                bw8Var.i(edit2);
                edit2.commit();
                gda.x1 = gda.a(new fda(bw8Var));
                ConnectionsManager.setProxySettings(true, bw8Var);
                nm7.e().k(nm7.E4, new Object[0]);
                d lastFragment = ((LaunchActivity) obj2).N().getLastFragment();
                if (lastFragment instanceof yv1) {
                    yv1 yv1Var = (yv1) lastFragment;
                    yv1Var.i6();
                    UndoView undoView = yv1Var.N3;
                    if (undoView != null) {
                        undoView.j(87, 0L, null);
                        zx0Var.run();
                        break;
                    }
                }
                nm7.e().k(nm7.T4, 6, jb6.M0(2131746343, null));
                zx0Var.run();
            case 6:
                o oVar = (o) obj3;
                String str = (String) obj2;
                m mVar = (m) obj;
                oVar.i0.k(false);
                gm.t1(oVar.i0.c0);
                if (TextUtils.isEmpty(str)) {
                    str = "about:blank";
                }
                gm.g(str);
                new c41(mVar.f, null).k(false).k(true);
                break;
            case 7:
                tz tzVar = (tz) obj3;
                boolean[] zArr = (boolean[]) obj2;
                ylb ylbVar2 = (ylb) obj;
                if (!zArr[0]) {
                    zArr[0] = true;
                    lv4.c(tzVar.a).e(tzVar.S1, new iu(tzVar, zArr, ylbVar2, b4));
                    break;
                }
                break;
            case 8:
                e00 e00Var = (e00) obj3;
                int i = e00Var.a;
                hv4 hv4Var = e00Var.h2;
                new kpa((Context) obj2, (ylb) obj, i, hv4Var.d.title, hv4Var.h, false).show();
                e00Var.dismiss();
                break;
            case 9:
                e00 e00Var2 = (e00) obj3;
                boolean[] zArr2 = (boolean[]) obj2;
                ylb ylbVar3 = (ylb) obj;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    lv4.c(e00Var2.a).e(e00Var2.T1, new iu(e00Var2, zArr2, ylbVar3, b3));
                    break;
                }
                break;
            case 10:
                ((h30) obj3).n.R0((j30) obj2, (k47) obj);
                break;
            case 11:
                w41 w41Var = (w41) obj3;
                bu5 G = bu5.G(((yv1) obj2).getLayoutContainer(), (ylb) obj, w41Var.n);
                G.b(R.drawable.msg_cancel, jb6.M0(2131753667, null), new v41(w41Var, 1 == true ? 1 : 0), true);
                G.F();
                if (w41Var.y != null) {
                    G.b(R.drawable.msg_settings, jb6.M0(2131753668, null), new v41(w41Var, b4), false);
                }
                G.b0(gm.L(10.0f), gm.L(7.0f));
                G.s = (short) 0;
                G.a0();
                break;
            case 12:
                g81 g81Var = (g81) obj3;
                d dVar = (d) obj;
                Bundle bundle = new Bundle();
                b81 b81Var = ((p81) obj2).d;
                long j = b81Var.b;
                if (j > 0) {
                    bundle.putLong("user_id", j);
                } else {
                    bundle.putLong("chat_id", -j);
                }
                bundle.putInt("message_id", b81Var.g);
                dVar.presentFragment(new yv1(bundle));
                g81Var.f.G.dismiss();
                m8 m8Var = g81Var.a;
                if (m8Var != null) {
                    m8Var.d(true);
                    break;
                }
                break;
            case 13:
                l9b l9bVar = (l9b) obj3;
                FrameLayout frameLayout = (FrameLayout) obj2;
                r63 r63Var = (r63) obj;
                bu5 bu5Var = l9bVar.V0;
                if (bu5Var == null || !bu5Var.E()) {
                    vc1 vc1Var = new vc1(l9bVar, false ? (byte) 1 : (byte) 0);
                    boolean p = z8c.h(l9bVar.V).p();
                    vc1 vc1Var2 = p ? null : new vc1(l9bVar, 1 == true ? 1 : 0);
                    bu5 G2 = bu5.G(frameLayout, r63Var, l9bVar.T0);
                    l9bVar.V0 = G2;
                    G2.o(13, gm.L(200.0f), jb6.N0("StoryPeriodHint"));
                    l9bVar.V0.j();
                    int i2 = 0;
                    while (true) {
                        int[] iArr = yc1.Q1;
                        if (i2 >= b2) {
                            bu5 bu5Var2 = l9bVar.V0;
                            bu5Var2.s = (short) 0;
                            bu5Var2.a0();
                            break;
                        } else {
                            int i3 = iArr[i2];
                            bu5 bu5Var3 = l9bVar.V0;
                            String N0 = i3 == Integer.MAX_VALUE ? jb6.N0("StoryPeriodKeep") : jb6.G(i3 / 3600, "Hours", new Object[0]);
                            int i4 = cmb.D8;
                            bu5Var3.a(0, null, N0, i4, i4, new eh((Object) vc1Var, i3, (byte) 11));
                            bu5Var3.N((p || i3 == 86400 || i3 == Integer.MAX_VALUE) ? null : new eh((Object) vc1Var2, i3, (byte) 12));
                            if (l9bVar.X0 == i2) {
                                l9bVar.V0.M();
                            }
                            i2++;
                            b2 = 4;
                        }
                    }
                }
                break;
            case 14:
                c29 c29Var = (c29) obj3;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) obj2;
                int[] iArr2 = (int[]) obj;
                if (c29Var == null || c29Var.x) {
                    actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().e(iArr2[0]);
                    break;
                }
                break;
            case 15:
                yv1 yv1Var2 = (yv1) obj3;
                TL_keyboard.KeyboardInlineButton keyboardInlineButton = (TL_keyboard.KeyboardInlineButton) obj2;
                k47 k47Var = (k47) obj;
                if (yv1Var2.getParentActivity() != null) {
                    if (yv1Var2.d1.getVisibility() != 0 || kfb.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeSwitchInline.class) || kfb.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeCallback.class) || kfb.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeGame.class) || kfb.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeUrl.class) || kfb.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeBuy.class) || kfb.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeUrlAuth.class) || kfb.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeUserProfile.class)) {
                        yv1Var2.a0.s0(keyboardInlineButton, k47Var, k47Var, null);
                        break;
                    }
                }
                break;
            case 16:
                ((yv1) obj3).Ma((hg0) obj2, (TLRPC.ReactionCount) obj, 0.0f, 0.0f);
                break;
            case 17:
                ((yv1) obj3).K8((boolean[]) obj2, (Context) obj);
                break;
            case 18:
                ((yv1) obj3).M8((os1) obj2, (boolean[]) obj);
                break;
            case 19:
                iv1 iv1Var = (iv1) obj3;
                TLRPC.Chat chat = (TLRPC.Chat) obj2;
                rc2 rc2Var = (rc2) obj;
                d dVar2 = iv1Var.a;
                dVar2.finishPreviewFragment();
                chat.left = false;
                if (rc2Var.w != null) {
                    dVar2.getNotificationCenter().k(nm7.h3, Long.valueOf(rc2Var.w.e));
                }
                dVar2.getMessagesController().k(chat.id, dVar2.getUserConfig().f(), null, dVar2, false, new uu1(iv1Var, chat, b3), null);
                break;
            case 20:
                i22 i22Var2 = (i22) obj3;
                d dVar3 = (d) obj2;
                ylb ylbVar4 = (ylb) obj;
                d dVar4 = i22Var2.Z1;
                int i5 = i22Var2.G3;
                p12 p12Var = i22Var2.F2;
                oy1 oy1Var = i22Var2.b2;
                long i6 = oy1Var != null ? oy1Var.i() : 0L;
                i22Var2.K2 = i6;
                p12Var.setEffect(i6);
                i22Var2.f1 = true;
                if (i22Var2.E1 - i22Var2.F1 < 0) {
                    gm.z3(i22Var2.t1);
                    gm.z3(i22Var2.u1);
                    try {
                        p12Var.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    if (!oc7.r1(i5).H3() && oc7.r1(i5).l4.h1.f() > i22Var2.F1) {
                        i22Var2.y1(dVar3);
                    }
                    oy1 oy1Var2 = i22Var2.b2;
                    if (oy1Var2 != null) {
                        oy1Var2.f(false);
                        i22Var2.b2 = null;
                        break;
                    }
                } else {
                    if (i22Var2.E3 == null && (dVar4 instanceof yv1)) {
                        yv1 yv1Var3 = (yv1) dVar4;
                        if (yv1Var3.X7()) {
                            ik.J(i22Var2.getContext(), yv1Var3.a(), new d12(i22Var2, i6, false ? (byte) 1 : (byte) 0), ylbVar4);
                            i22Var = i22Var2;
                            i22Var.q1(false, false);
                            break;
                        }
                    }
                    a22 a22Var = i22Var2.v2;
                    if (a22Var == i22Var2.d2 || a22Var == i22Var2.k2) {
                        i22Var = i22Var2;
                        p1 = i22Var.p1(true, 0, 0, i6, i22Var2.a1());
                    } else {
                        if (!a22Var.K(true, 0, 0, i6, i22Var2.a1())) {
                            i22Var2.A4 = true;
                            i22Var2.dismiss();
                        }
                        i22Var = i22Var2;
                        p1 = false;
                    }
                    oy1 oy1Var3 = i22Var.b2;
                    if (oy1Var3 != null) {
                        oy1Var3.f(!p1);
                        i22Var.b2 = null;
                    }
                    i22Var.q1(false, false);
                }
                break;
            case 21:
                i22 i22Var3 = (i22) obj3;
                k47 k47Var2 = (k47) obj2;
                i22Var3.q1(!i22Var3.W1, true);
                TLRPC.Message message = k47Var2.k;
                boolean z2 = i22Var3.W1;
                message.invert_media = z2;
                ((k57) obj).a(!z2, true);
                i22Var3.b2.d(k47Var2);
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = i22Var3.d2;
                if (chatAttachAlertPhotoLayout != null && (k57Var = chatAttachAlertPhotoLayout.e1) != null) {
                    k57Var.a(!i22Var3.W1, true);
                }
                i22Var3.b2.n(!i22Var3.W1);
                break;
            case 22:
                ba2 ba2Var = (ba2) obj3;
                v09[] v09VarArr = (v09[]) obj2;
                k6d k6dVar = (k6d) obj;
                Integer num = (Integer) view.getTag();
                v09VarArr[0].a(num.intValue() == 0);
                v09VarArr[1].a(num.intValue() == 1);
                ba2Var.K0 = num.intValue() == 1;
                ((my0) k6dVar.b).y0.run();
                ba2Var.u0(true, true);
                break;
            case 23:
                yg2 yg2Var = (yg2) obj3;
                TL_account.TL_connectedBot tL_connectedBot = (TL_account.TL_connectedBot) obj2;
                ge7 ge7Var = (ge7) obj;
                b61 b61Var2 = yg2Var.X1;
                if (!b61Var2.R) {
                    b61Var2.setLoading(true);
                    TL_account.updateConnectedBot updateconnectedbot = new TL_account.updateConnectedBot();
                    updateconnectedbot.deleted = true;
                    updateconnectedbot.bot = oc7.r1(yg2Var.a).n1(tL_connectedBot.bot_id);
                    updateconnectedbot.recipients = new TL_account.TL_inputBusinessBotRecipients();
                    ConnectionsManager.getInstance(yg2Var.a).sendRequest(updateconnectedbot, new pm(yg2Var, ge7Var, (byte) 24));
                    break;
                }
                break;
            case 24:
                k47 k47Var3 = (k47) obj2;
                PhotoViewer photoViewer = ((zh2) obj3).c.a;
                Drawable[] drawableArr = PhotoViewer.d9;
                ArrayList arrayList = ((kdc) obj).d;
                if (arrayList.isEmpty()) {
                    document = null;
                } else {
                    int size = arrayList.size();
                    int i7 = 0;
                    while (true) {
                        if (i7 < size) {
                            Object obj4 = arrayList.get(i7);
                            i7++;
                            mdc mdcVar = (mdc) obj4;
                            if (mdcVar.b()) {
                                document = mdcVar.g;
                            }
                        } else {
                            long j2 = Long.MAX_VALUE;
                            mdc mdcVar2 = null;
                            for (int i8 = 0; i8 < arrayList.size(); i8++) {
                                mdc mdcVar3 = (mdc) arrayList.get(i8);
                                if (mdcVar3.k < j2 && ndc.C0(mdcVar3.m)) {
                                    j2 = mdcVar3.k;
                                    mdcVar2 = mdcVar3;
                                }
                            }
                            document = mdcVar2 != null ? mdcVar2.g : ((mdc) arrayList.get(0)).g;
                        }
                    }
                }
                if (document != null) {
                    bc4.G(photoViewer.U);
                    File J = bc4.J(document, null, false, true);
                    if (J == null || !J.exists()) {
                        bc4.G(photoViewer.U);
                        J = bc4.J(document, null, true, true);
                    }
                    if (J == null || !J.exists()) {
                        ArrayList arrayList2 = new ArrayList();
                        k47Var3.f3 = document;
                        arrayList2.add(k47Var3);
                        MediaController.f0(photoViewer.E, j5.a(photoViewer.U), arrayList2, new zf1(photoViewer, b2));
                    } else {
                        MediaController.d0(J.toString(), photoViewer.E, 1, null, null, new t88(photoViewer, b4));
                    }
                    photoViewer.p0.U(null, null);
                    break;
                }
                break;
            case 25:
                co2 co2Var = (co2) obj3;
                qac qacVar = (qac) obj2;
                TLRPC.Chat chat2 = (TLRPC.Chat) obj;
                boolean z3 = co2Var.T1;
                if (chat2 != null && !sd2.w(27, chat2)) {
                    z = true;
                }
                co2Var.Y0(qacVar, z3, z);
                break;
            case 26:
                tu2 tu2Var = (tu2) obj3;
                TLRPC.User user = (TLRPC.User) obj;
                ik.L((Context) obj2, jb6.M0(2131745819, null), jb6.a0(null, null, 2131745820, user.first_name), jb6.M0(2131745851, null), new ju2(tu2Var, user, 1 == true ? 1 : 0), tu2Var.r).o();
                break;
            case 27:
                qu3 qu3Var = (qu3) obj3;
                vc vcVar = (vc) obj2;
                aa7 aa7Var = (aa7) obj;
                try {
                    charSequence = ((ClipboardManager) qu3Var.getContext().getSystemService("clipboard")).getPrimaryClip().getItemAt(0).coerceToText(qu3Var.getContext());
                } catch (Exception e) {
                    fc4.g(e, true);
                }
                if (charSequence != null) {
                    vcVar.setText(charSequence);
                    vcVar.setSelection(0, vcVar.getText().length());
                }
                aa7Var.run();
                break;
            case 28:
                cv3 cv3Var = (cv3) obj3;
                ela elaVar = (ela) obj2;
                ylb ylbVar5 = (ylb) obj;
                wu3 wu3Var = cv3Var.a;
                c51 c51Var = cv3Var.b;
                if (c51Var.isEnabled() && c51Var.getAlpha() >= 0.5f) {
                    gb gbVar = cv3Var.L;
                    if (gbVar == null || !gbVar.f) {
                        if (cv3Var.n) {
                            wu3Var.m();
                            bu5 bu5Var4 = new bu5(elaVar, ylbVar5, c51Var, false, false, true);
                            bu5Var4.a0 = gm.L(280.0f);
                            wu3Var.o(null, new t27(bu5Var4, wu3Var));
                            bu5Var4.X = true;
                            bu5Var4.a0();
                            break;
                        } else if (cv3Var.e) {
                            if (cv3Var.y) {
                                cv3Var.k(true);
                                cv3Var.y = false;
                                cv3Var.p();
                            }
                            cv3Var.v();
                            break;
                        } else {
                            cv3Var.x(1);
                            boolean isFocused = wu3Var.isFocused();
                            cv3Var.d.A(wu3Var.length() > 0, false);
                            wu3Var.requestFocus();
                            if (!isFocused) {
                                wu3Var.setSelection(wu3Var.length());
                                break;
                            }
                        }
                    }
                }
                break;
            default:
                jo6 jo6Var = (jo6) obj2;
                pt4 pt4Var = (pt4) obj;
                tt4 tt4Var = ((nt4) obj3).c;
                ArrayList arrayList3 = tt4Var.i0;
                if (arrayList3.contains(jo6Var)) {
                    arrayList3.remove(jo6Var);
                } else if (arrayList3.size() + 1 > tt4Var.S) {
                    int i9 = -tt4Var.O;
                    tt4Var.O = i9;
                    gm.A3(i9, pt4Var, null);
                    xx0.E.a();
                    break;
                } else {
                    arrayList3.add(jo6Var);
                }
                gm.V3(tt4Var.d);
                tt4Var.j();
                break;
        }
    }
}
