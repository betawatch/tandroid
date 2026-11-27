// default package

import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PasskeysActivity;
import org.telegram.ui.PrivacySettingsActivity;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class f implements icc {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ f(int i, e eVar, l01 l01Var, id idVar) {
        this.a = (byte) 6;
        this.d = i;
        this.b = eVar;
        this.c = l01Var;
        this.e = idVar;
    }

    @Override // icc
    public final void a(Object obj, Object obj2) {
        boolean z;
        byte b = this.a;
        byte b2 = 2;
        int i = this.d;
        Object obj3 = this.e;
        byte b3 = 0;
        Object obj4 = this.c;
        Object obj5 = this.b;
        switch (b) {
            case 0:
                b1 b1Var = (b1) obj5;
                ema emaVar = (ema) obj4;
                TLRPC.TL_messages_composeMessageWithAI tL_messages_composeMessageWithAI = (TLRPC.TL_messages_composeMessageWithAI) obj3;
                TLRPC.TL_composedMessageWithAI tL_composedMessageWithAI = (TLRPC.TL_composedMessageWithAI) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                FrameLayout frameLayout = b1Var.D2;
                b1Var.W2 = -1;
                b1Var.X2 = false;
                if (tL_error != null) {
                    if (!"SUMMARY_FLOOD_PREMIUM".equalsIgnoreCase(tL_error.text) && !"AICOMPOSE_FLOOD_PREMIUM".equalsIgnoreCase(tL_error.text)) {
                        ik8.u(frameLayout, b1Var.J0, tL_error, false);
                        emaVar.i(null);
                        b1Var.G2 = true;
                        b1Var.H2 = false;
                        b1Var.u1(true);
                        break;
                    } else {
                        new d31(frameLayout, b1Var.J0).I(R.raw.star_premium_2, ob6.M0(2131754986, null), hl.S2(ob6.M0(2131754987, null))).j();
                        b1Var.H2 = true;
                        b1Var.u1(true);
                        break;
                    }
                } else if (tL_composedMessageWithAI == null) {
                    emaVar.i(null);
                    b1Var.G2 = true;
                    b1Var.H2 = false;
                    b1Var.u1(true);
                    break;
                } else {
                    emaVar.i(null);
                    b1Var.H2 = false;
                    b1Var.u1(true);
                    b1Var.Y2[i] = tL_messages_composeMessageWithAI;
                    if (i == 0) {
                        b1Var.U1 = false;
                        b1Var.V1 = r47.h0(tL_composedMessageWithAI.result_text, false);
                    } else if (i == 1) {
                        b1Var.X1 = false;
                        b1Var.Y1 = r47.h0(tL_composedMessageWithAI.result_text, false);
                    } else if (i == 2) {
                        b1Var.a2 = false;
                        TLRPC.TL_textWithEntities tL_textWithEntities = tL_composedMessageWithAI.diff_text;
                        if (tL_textWithEntities != null) {
                            b1Var.b2 = r47.h0(tL_textWithEntities, false);
                            b1Var.d2 = r47.h0(tL_composedMessageWithAI.result_text, false);
                        } else {
                            CharSequence h0 = r47.h0(tL_composedMessageWithAI.result_text, false);
                            b1Var.d2 = h0;
                            b1Var.b2 = h0;
                        }
                    }
                    b1Var.Q2.O(true);
                    break;
                }
                break;
            case 1:
                b1 b1Var2 = (b1) obj5;
                ema emaVar2 = (ema) obj4;
                TLRPC.TL_messages_composeRichMessageWithAI tL_messages_composeRichMessageWithAI = (TLRPC.TL_messages_composeRichMessageWithAI) obj3;
                TLRPC.TL_composedRichMessageWithAI tL_composedRichMessageWithAI = (TLRPC.TL_composedRichMessageWithAI) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                FrameLayout frameLayout2 = b1Var2.D2;
                b1Var2.W2 = -1;
                b1Var2.X2 = false;
                if (tL_error2 != null) {
                    if (!"SUMMARY_FLOOD_PREMIUM".equalsIgnoreCase(tL_error2.text) && !"AICOMPOSE_FLOOD_PREMIUM".equalsIgnoreCase(tL_error2.text)) {
                        ik8.u(frameLayout2, b1Var2.J0, tL_error2, false);
                        emaVar2.i(null);
                        b1Var2.G2 = true;
                        b1Var2.H2 = false;
                        b1Var2.u1(true);
                        break;
                    } else {
                        new d31(frameLayout2, b1Var2.J0).I(R.raw.star_premium_2, ob6.M0(2131754986, null), hl.S2(ob6.M0(2131754987, null))).j();
                        b1Var2.H2 = true;
                        b1Var2.u1(true);
                        break;
                    }
                } else if (tL_composedRichMessageWithAI == null) {
                    emaVar2.i(null);
                    b1Var2.G2 = true;
                    b1Var2.H2 = false;
                    b1Var2.u1(true);
                    break;
                } else {
                    emaVar2.i(null);
                    b1Var2.H2 = false;
                    b1Var2.u1(true);
                    b1Var2.Z2[i] = tL_messages_composeRichMessageWithAI;
                    if (i == 0) {
                        b1Var2.U1 = false;
                        b1Var2.W1 = tL_composedRichMessageWithAI.result;
                    } else if (i == 1) {
                        b1Var2.X1 = false;
                        b1Var2.Z1 = tL_composedRichMessageWithAI.result;
                    } else if (i == 2) {
                        b1Var2.a2 = false;
                        b1Var2.c2 = tL_composedRichMessageWithAI.result;
                    }
                    b1Var2.Q2.O(true);
                    break;
                }
                break;
            case 2:
                fu fuVar = (fu) obj5;
                TLRPC.TL_channels_joinChannel tL_channels_joinChannel = (TLRPC.TL_channels_joinChannel) obj4;
                TLRPC.Chat chat = (TLRPC.Chat) obj3;
                TLRPC.ChatInviteJoinResult chatInviteJoinResult = (TLRPC.ChatInviteJoinResult) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                int i2 = this.d;
                if (tL_error3 != null) {
                    hl.c3(new gp6((Object) fuVar, i2, (Object) tL_error3, (Object) tL_channels_joinChannel, (byte) 3));
                    break;
                } else {
                    if (chatInviteJoinResult instanceof TLRPC.TL_chatInviteJoinResultOk) {
                        TLRPC.Updates updates = ((TLRPC.TL_chatInviteJoinResultOk) chatInviteJoinResult).updates;
                        int i3 = 0;
                        while (true) {
                            if (i3 < updates.updates.size()) {
                                TLRPC.Update update = updates.updates.get(i3);
                                if ((update instanceof TL_update.TL_updateNewChannelMessage) && (((TL_update.TL_updateNewChannelMessage) update).message.action instanceof TLRPC.TL_messageActionChatAddUser)) {
                                    z = true;
                                } else {
                                    i3++;
                                }
                            } else {
                                z = false;
                            }
                        }
                        uc7.s1(i2).Y3(updates, false);
                    } else if (chatInviteJoinResult instanceof TLRPC.TL_chatInviteJoinResultWebView) {
                        hl.c3(new ze7(i2, chatInviteJoinResult, (Object) chat, (byte) 4));
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!z) {
                        uc7.s1(i2).B0(chat.id, true);
                    }
                    hl.c3(new c1(fuVar, (byte) 19));
                    hl.d3(new zd(i2, chat, b2), 1000L);
                    jf7 Y = jf7.Y(i2);
                    long j = chat.id;
                    Y.O1(-j, j, new ArrayList(), null);
                    break;
                }
            case 3:
                bs0 bs0Var = (bs0) obj4;
                fn7[] fn7VarArr = (fn7[]) obj3;
                ((int[]) obj5)[0] = -1;
                TLRPC.MessageMedia messageMedia = ((TL_account.webPagePreview) obj).media;
                if (!(messageMedia instanceof TLRPC.TL_messageMediaEmpty)) {
                    TLRPC.WebPage webPage = messageMedia.webpage;
                    if (!(webPage instanceof TLRPC.TL_webPageEmpty)) {
                        if (messageMedia instanceof TLRPC.TL_messageMediaWebPage) {
                            if (webPage instanceof TLRPC.TL_webPagePending) {
                                long j2 = webPage.id;
                                int i4 = this.d;
                                es0 es0Var = new es0(j2, fn7VarArr, i4, bs0Var);
                                fn7VarArr[0] = es0Var;
                                jn7.f(i4).a(es0Var, 60);
                                break;
                            } else {
                                bs0Var.a(webPage instanceof TLRPC.TL_webPage ? webPage : null);
                                break;
                            }
                        } else {
                            bs0Var.a(null);
                            break;
                        }
                    }
                }
                bs0Var.a(null);
                break;
            case 4:
                b71 b71Var = (b71) obj5;
                Pair pair = (Pair) obj4;
                Long l = (Long) obj;
                if (b71Var.i(pair)) {
                    Object obj6 = this.e;
                    if (obj2 != null && b71Var.b(obj6)) {
                        b71Var.a(pair, obj2);
                        lg lgVar = new lg((Object) b71Var, (Object) pair, obj2, false, (byte) 2);
                        b71Var = b71Var;
                        pair = pair;
                        hl.c3(lgVar);
                    }
                    long longValue = l.longValue();
                    int i5 = this.d;
                    b71Var.f(i5, obj6, longValue, new a71(b71Var, pair, obj2, i5, obj6));
                    break;
                } else {
                    b71Var.a(pair, obj2);
                    hl.c3(new lg((Object) b71Var, (Object) pair, obj2, true, (byte) 2));
                    break;
                }
            case 5:
                id[] idVarArr = (id[]) obj5;
                e eVar = (e) obj4;
                TLRPC.Chat chat2 = (TLRPC.Chat) obj3;
                ArrayList arrayList = (ArrayList) obj;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) obj2;
                id idVar = idVarArr[0];
                if (idVar != null) {
                    idVar.dismiss();
                    idVarArr[0] = null;
                }
                if (tL_error4 != null) {
                    d31.b0(eVar).g0(tL_error4, false);
                    break;
                } else if (arrayList != null) {
                    if (arrayList.isEmpty()) {
                        bs2.v(null, 2131751870, d31.b0(eVar), R.raw.info, 36);
                        break;
                    } else if (arrayList.isEmpty()) {
                        d31.b0(eVar).Q(R.raw.info, 36, "").j();
                        break;
                    } else {
                        eVar.showDialog(new xo2(eVar, 0L, arrayList, new i61((Object) eVar, (Object) chat2, i, (byte) 1)));
                        break;
                    }
                }
                break;
            case 6:
                e eVar2 = (e) obj5;
                l01 l01Var = (l01) obj4;
                id idVar2 = (id) obj3;
                TLRPC.Updates updates2 = (TLRPC.Updates) obj;
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) obj2;
                if (updates2 != null && tL_error5 == null) {
                    uc7.s1(i).Y3(updates2, false);
                }
                hl.c3(new ao1(eVar2, tL_error5, l01Var, idVar2, false, (byte) 22));
                break;
            case 7:
                lm7 lm7Var = (lm7) obj5;
                jm7 jm7Var = (jm7) obj4;
                Context context = (Context) obj3;
                ArrayList arrayList2 = (ArrayList) obj;
                ArrayList arrayList3 = lm7Var.c;
                if (i != 2 || !TextUtils.isEmpty(lm7Var.Q)) {
                    ArrayList arrayList4 = jm7Var.a;
                    int size = arrayList4.size();
                    int i6 = 0;
                    while (i6 < size) {
                        Object obj7 = arrayList4.get(i6);
                        i6++;
                        if (obj7 instanceof r47) {
                            r47 r47Var = (r47) obj7;
                            ArrayList arrayList5 = (ArrayList) jm7Var.c.get(r47Var);
                            int i7 = s94.b;
                            b8c K = b8c.K(s94.class);
                            K.H = r47Var;
                            K.I = arrayList5 == null ? null : new ArrayList(arrayList5);
                            K.d = r47Var.e1();
                            K.C = r47.B0(r47Var.k);
                            arrayList2.add(K);
                        } else if (!arrayList3.isEmpty()) {
                            HashSet hashSet = lm7Var.d;
                            ii7 ii7Var = new ii7(lm7Var, (byte) 4);
                            int i8 = n94.b;
                            b8c K2 = b8c.K(n94.class);
                            K2.H = new o94(arrayList3, hashSet, ii7Var);
                            arrayList2.add(K2);
                        } else if (lm7Var.r) {
                            arrayList2.add(b8c.e(-2, ob6.M0(2131745779, null)));
                        }
                    }
                    if ((i == 2 || !jm7Var.p) && (jm7Var.k || !jm7Var.l)) {
                        int i9 = 0;
                        while (true) {
                            if (i9 < (jm7Var.a.isEmpty() ? 3 : 1)) {
                                arrayList2.add(b8c.q((-10) - i9, 39));
                                i9++;
                            }
                        }
                    } else if (jm7Var.n) {
                        ViewGroup viewGroup = jm7Var.i;
                        if (viewGroup == null) {
                            viewGroup = i == 2 ? lm7Var.l0(context) : lm7Var.k0(context, jm7Var.j);
                            jm7Var.i = viewGroup;
                        }
                        b8c b8cVar = new b8c(-3);
                        b8cVar.c = viewGroup;
                        b8cVar.A = 0;
                        b8cVar.z = 1;
                        arrayList2.add(b8cVar);
                    } else if (!jm7Var.k && jm7Var.l && (arrayList2.isEmpty() || (jm7Var.m && i != 2))) {
                        if (jm7Var.i == null) {
                            jm7Var.i = i == 2 ? lm7Var.l0(context) : lm7Var.k0(context, jm7Var.j);
                        }
                        if (arrayList2.isEmpty()) {
                            ViewGroup viewGroup2 = jm7Var.i;
                            b8c b8cVar2 = new b8c(-3);
                            b8cVar2.c = viewGroup2;
                            b8cVar2.A = 0;
                            b8cVar2.z = 1;
                            arrayList2.add(b8cVar2);
                        } else {
                            ((b8c) c00.g(1, arrayList2)).j = true;
                            ViewGroup viewGroup3 = jm7Var.i;
                            b8c b8cVar3 = new b8c(-1);
                            b8cVar3.c = viewGroup3;
                            b8cVar3.A = -2;
                            arrayList2.add(b8cVar3);
                        }
                    }
                    if (!arrayList2.isEmpty()) {
                        ((b8c) c00.g(1, arrayList2)).j = true;
                        break;
                    }
                }
                break;
            case 8:
                Context context2 = (Context) obj4;
                nx0 nx0Var = (nx0) obj3;
                TL_account.Passkey passkey = (TL_account.Passkey) obj;
                String str = (String) obj2;
                ((c51) obj5).setLoading(false);
                if (!"CANCELLED".equalsIgnoreCase(str)) {
                    if ("EMPTY".equalsIgnoreCase(str)) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context2);
                        String M0 = ob6.M0(2131747359, null);
                        id idVar3 = alertDialog$Builder.a;
                        idVar3.S = M0;
                        idVar3.U = ob6.M0(2131747360, null);
                        alertDialog$Builder.j(ob6.M0(2131747558, null), null);
                        idVar3.setOnDismissListener(new o1(nx0Var, (byte) 27));
                        alertDialog$Builder.o();
                        break;
                    } else {
                        e S = LaunchActivity.S();
                        if (S != null) {
                            if (str != null) {
                                new d31(nx0Var.F, nx0Var.J0).f0(str, false);
                                break;
                            } else if (passkey != null) {
                                uc7.s1(i).v4(0L, "SETUP_PASSKEY");
                                if (S instanceof PasskeysActivity) {
                                    nx0Var.dismiss();
                                    ((PasskeysActivity) S).Y(passkey);
                                    break;
                                } else if (S instanceof PrivacySettingsActivity) {
                                    nx0Var.dismiss();
                                    PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) S;
                                    ArrayList arrayList6 = privacySettingsActivity.e;
                                    if (arrayList6 == null) {
                                        arrayList6 = new ArrayList();
                                    }
                                    arrayList6.add(passkey);
                                    privacySettingsActivity.F0(true);
                                    S.presentFragment(new PasskeysActivity(arrayList6));
                                    break;
                                } else {
                                    ConnectionsManager.getInstance(i).sendRequestTyped(new TL_account.getPasskeys(), new ic(b3), new p((Object) nx0Var, (Object) passkey, (Object) str, (byte) 24));
                                    break;
                                }
                            }
                        }
                    }
                }
                break;
            case 9:
                boolean[] zArr = (boolean[]) obj5;
                Context context3 = (Context) obj4;
                vnb vnbVar = (vnb) obj3;
                Long l2 = (Long) obj;
                String str2 = (String) obj2;
                if (l2 != null && l2.longValue() != 0) {
                    int i10 = this.d;
                    ov4.c(i10).j(l2.longValue(), new k16(zArr, context3, vnbVar, i10, str2, (byte) 1));
                    break;
                } else {
                    zArr[0] = false;
                    break;
                }
            case 10:
                boolean[] zArr2 = (boolean[]) obj5;
                ArrayList arrayList7 = (ArrayList) obj4;
                icc iccVar = (icc) obj3;
                String str3 = (String) obj;
                Boolean bool = (Boolean) obj2;
                if (!zArr2[0]) {
                    if (str3 != null) {
                        arrayList7.set(i, str3);
                        for (int i11 = 0; i11 < arrayList7.size(); i11++) {
                            if (arrayList7.get(i11) == null) {
                                break;
                            }
                        }
                        zArr2[0] = true;
                        iccVar.a(TextUtils.join("", arrayList7), Boolean.FALSE);
                        break;
                    } else {
                        zArr2[0] = true;
                        iccVar.a(null, bool);
                        break;
                    }
                }
                break;
            default:
                vnb vnbVar2 = (vnb) obj3;
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj;
                ((Runnable[]) obj5)[0] = null;
                TextView textView = ((TextView[]) obj4)[0];
                if (textView != null && wallettransaction != null) {
                    long j3 = wallettransaction.fee;
                    if (j3 > 0) {
                        textView.setText(uqc.o0(i, j3, vnbVar2));
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ f(Object obj, int i, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.b = obj;
        this.d = i;
        this.c = obj2;
        this.e = obj3;
    }

    public /* synthetic */ f(Object obj, Object obj2, int i, Object obj3, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = i;
        this.e = obj3;
    }

    public /* synthetic */ f(Object obj, Object obj2, Object obj3, int i, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.e = obj3;
        this.d = i;
    }
}
