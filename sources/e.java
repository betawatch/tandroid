// default package

import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PasskeysActivity;
import org.telegram.ui.PrivacySettingsActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class e implements jac {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ e(int i, d dVar, k11 k11Var, he heVar) {
        this.a = (byte) 6;
        this.d = i;
        this.b = dVar;
        this.c = k11Var;
        this.e = heVar;
    }

    @Override // jac
    public final void a(Object obj, Object obj2) {
        byte b;
        byte b2 = this.a;
        byte b3 = 2;
        byte b4 = 1;
        int i = this.d;
        Object obj3 = this.e;
        byte b5 = 0;
        Object obj4 = this.c;
        Object obj5 = this.b;
        switch (b2) {
            case 0:
                a1 a1Var = (a1) obj5;
                lka lkaVar = (lka) obj4;
                TLRPC.TL_messages_composeMessageWithAI tL_messages_composeMessageWithAI = (TLRPC.TL_messages_composeMessageWithAI) obj3;
                TLRPC.TL_composedMessageWithAI tL_composedMessageWithAI = (TLRPC.TL_composedMessageWithAI) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                FrameLayout frameLayout = a1Var.D2;
                a1Var.U2 = -1;
                a1Var.V2 = false;
                if (tL_error != null) {
                    if (!"SUMMARY_FLOOD_PREMIUM".equalsIgnoreCase(tL_error.text) && !"AICOMPOSE_FLOOD_PREMIUM".equalsIgnoreCase(tL_error.text)) {
                        wi8.u(frameLayout, a1Var.J0, tL_error, false);
                        lkaVar.i(null);
                        a1Var.G2 = true;
                        a1Var.H2 = false;
                        a1Var.s1(true);
                        break;
                    } else {
                        new c41(frameLayout, a1Var.J0).I(R.raw.star_premium_2, jb6.M0(2131754989, null), gm.S2(jb6.M0(2131754990, null))).j();
                        a1Var.H2 = true;
                        a1Var.s1(true);
                        break;
                    }
                } else if (tL_composedMessageWithAI == null) {
                    lkaVar.i(null);
                    a1Var.G2 = true;
                    a1Var.H2 = false;
                    a1Var.s1(true);
                    break;
                } else {
                    lkaVar.i(null);
                    a1Var.H2 = false;
                    a1Var.s1(true);
                    a1Var.W2[i] = tL_messages_composeMessageWithAI;
                    if (i == 0) {
                        a1Var.U1 = false;
                        a1Var.V1 = k47.h0(tL_composedMessageWithAI.result_text, false);
                    } else if (i == 1) {
                        a1Var.X1 = false;
                        a1Var.Y1 = k47.h0(tL_composedMessageWithAI.result_text, false);
                    } else if (i == 2) {
                        a1Var.a2 = false;
                        TLRPC.TL_textWithEntities tL_textWithEntities = tL_composedMessageWithAI.diff_text;
                        if (tL_textWithEntities != null) {
                            a1Var.b2 = k47.h0(tL_textWithEntities, false);
                            a1Var.d2 = k47.h0(tL_composedMessageWithAI.result_text, false);
                        } else {
                            CharSequence h0 = k47.h0(tL_composedMessageWithAI.result_text, false);
                            a1Var.d2 = h0;
                            a1Var.b2 = h0;
                        }
                    }
                    a1Var.O2.O(true);
                    break;
                }
                break;
            case 1:
                a1 a1Var2 = (a1) obj5;
                lka lkaVar2 = (lka) obj4;
                TLRPC.TL_messages_composeRichMessageWithAI tL_messages_composeRichMessageWithAI = (TLRPC.TL_messages_composeRichMessageWithAI) obj3;
                TLRPC.TL_composedRichMessageWithAI tL_composedRichMessageWithAI = (TLRPC.TL_composedRichMessageWithAI) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                FrameLayout frameLayout2 = a1Var2.D2;
                a1Var2.U2 = -1;
                a1Var2.V2 = false;
                if (tL_error2 != null) {
                    if (!"SUMMARY_FLOOD_PREMIUM".equalsIgnoreCase(tL_error2.text) && !"AICOMPOSE_FLOOD_PREMIUM".equalsIgnoreCase(tL_error2.text)) {
                        wi8.u(frameLayout2, a1Var2.J0, tL_error2, false);
                        lkaVar2.i(null);
                        a1Var2.G2 = true;
                        a1Var2.H2 = false;
                        a1Var2.s1(true);
                        break;
                    } else {
                        new c41(frameLayout2, a1Var2.J0).I(R.raw.star_premium_2, jb6.M0(2131754989, null), gm.S2(jb6.M0(2131754990, null))).j();
                        a1Var2.H2 = true;
                        a1Var2.s1(true);
                        break;
                    }
                } else if (tL_composedRichMessageWithAI == null) {
                    lkaVar2.i(null);
                    a1Var2.G2 = true;
                    a1Var2.H2 = false;
                    a1Var2.s1(true);
                    break;
                } else {
                    lkaVar2.i(null);
                    a1Var2.H2 = false;
                    a1Var2.s1(true);
                    a1Var2.X2[i] = tL_messages_composeRichMessageWithAI;
                    if (i == 0) {
                        a1Var2.U1 = false;
                        a1Var2.W1 = tL_composedRichMessageWithAI.result;
                    } else if (i == 1) {
                        a1Var2.X1 = false;
                        a1Var2.Z1 = tL_composedRichMessageWithAI.result;
                    } else if (i == 2) {
                        a1Var2.a2 = false;
                        a1Var2.c2 = tL_composedRichMessageWithAI.result;
                    }
                    a1Var2.O2.O(true);
                    break;
                }
                break;
            case 2:
                ev evVar = (ev) obj5;
                TLRPC.TL_channels_joinChannel tL_channels_joinChannel = (TLRPC.TL_channels_joinChannel) obj4;
                TLRPC.Chat chat = (TLRPC.Chat) obj3;
                TLRPC.ChatInviteJoinResult chatInviteJoinResult = (TLRPC.ChatInviteJoinResult) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                int i2 = this.d;
                if (tL_error3 != null) {
                    gm.c3(new up6((Object) evVar, i2, (Object) tL_error3, (Object) tL_channels_joinChannel, (byte) 3));
                    break;
                } else {
                    if (chatInviteJoinResult instanceof TLRPC.TL_chatInviteJoinResultOk) {
                        TLRPC.Updates updates = ((TLRPC.TL_chatInviteJoinResultOk) chatInviteJoinResult).updates;
                        int i3 = 0;
                        while (true) {
                            if (i3 < updates.updates.size()) {
                                TLRPC.Update update = updates.updates.get(i3);
                                if ((update instanceof TL_update.TL_updateNewChannelMessage) && (((TL_update.TL_updateNewChannelMessage) update).message.action instanceof TLRPC.TL_messageActionChatAddUser)) {
                                    b = 1;
                                } else {
                                    i3++;
                                }
                            } else {
                                b = 0;
                            }
                        }
                        oc7.r1(i2).T3(updates, false);
                        b5 = b;
                    } else if (chatInviteJoinResult instanceof TLRPC.TL_chatInviteJoinResultWebView) {
                        gm.c3(new wc7(i2, chatInviteJoinResult, (Object) chat, (byte) 5));
                        b5 = 1;
                    }
                    if (b5 == 0) {
                        oc7.r1(i2).z0(chat.id, true);
                    }
                    gm.c3(new b1(evVar, (byte) 21));
                    gm.d3(new eh(i2, chat, b3), 1000L);
                    cf7 Y = cf7.Y(i2);
                    long j = chat.id;
                    Y.O1(-j, j, new ArrayList(), null);
                    break;
                }
            case 3:
                bt0 bt0Var = (bt0) obj4;
                jm7[] jm7VarArr = (jm7[]) obj3;
                ((int[]) obj5)[0] = -1;
                TLRPC.MessageMedia messageMedia = ((TL_account.webPagePreview) obj).media;
                if (!(messageMedia instanceof TLRPC.TL_messageMediaEmpty)) {
                    TLRPC.WebPage webPage = messageMedia.webpage;
                    if (!(webPage instanceof TLRPC.TL_webPageEmpty)) {
                        if (messageMedia instanceof TLRPC.TL_messageMediaWebPage) {
                            if (webPage instanceof TLRPC.TL_webPagePending) {
                                long j2 = webPage.id;
                                int i4 = this.d;
                                et0 et0Var = new et0(j2, jm7VarArr, i4, bt0Var);
                                jm7VarArr[0] = et0Var;
                                nm7.f(i4).a(et0Var, 60);
                                break;
                            } else {
                                bt0Var.a(webPage instanceof TLRPC.TL_webPage ? webPage : null);
                                break;
                            }
                        } else {
                            bt0Var.a(null);
                            break;
                        }
                    }
                }
                bt0Var.a(null);
                break;
            case 4:
                a81 a81Var = (a81) obj5;
                Pair pair = (Pair) obj4;
                Long l = (Long) obj;
                if (a81Var.i(pair)) {
                    Object obj6 = this.e;
                    if (obj2 != null && a81Var.b(obj6)) {
                        a81Var.a(pair, obj2);
                        rh rhVar = new rh((Object) a81Var, (Object) pair, obj2, false, (byte) 2);
                        a81Var = a81Var;
                        pair = pair;
                        gm.c3(rhVar);
                    }
                    long longValue = l.longValue();
                    int i5 = this.d;
                    a81Var.f(i5, obj6, longValue, new z71(a81Var, pair, obj2, i5, obj6));
                    break;
                } else {
                    a81Var.a(pair, obj2);
                    gm.c3(new rh((Object) a81Var, (Object) pair, obj2, true, (byte) 2));
                    break;
                }
                break;
            case 5:
                he[] heVarArr = (he[]) obj5;
                d dVar = (d) obj4;
                TLRPC.Chat chat2 = (TLRPC.Chat) obj3;
                ArrayList arrayList = (ArrayList) obj;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) obj2;
                he heVar = heVarArr[0];
                if (heVar != null) {
                    heVar.dismiss();
                    heVarArr[0] = null;
                }
                if (tL_error4 != null) {
                    c41.b0(dVar).g0(tL_error4, false);
                    break;
                } else if (arrayList != null) {
                    if (arrayList.isEmpty()) {
                        ts2.u(null, 2131751842, c41.b0(dVar), R.raw.info, 36);
                        break;
                    } else if (arrayList.isEmpty()) {
                        c41.b0(dVar).Q(R.raw.info, 36, "").j();
                        break;
                    } else {
                        dVar.showDialog(new pp2(dVar, 0L, arrayList, new h71(dVar, chat2, i, b4)));
                        break;
                    }
                }
                break;
            case 6:
                d dVar2 = (d) obj5;
                k11 k11Var = (k11) obj4;
                he heVar2 = (he) obj3;
                TLRPC.Updates updates2 = (TLRPC.Updates) obj;
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) obj2;
                if (updates2 != null && tL_error5 == null) {
                    oc7.r1(i).T3(updates2, false);
                }
                gm.c3(new xo1(dVar2, tL_error5, k11Var, heVar2));
                break;
            case 7:
                Context context = (Context) obj4;
                my0 my0Var = (my0) obj3;
                TL_account.Passkey passkey = (TL_account.Passkey) obj;
                String str = (String) obj2;
                ((b61) obj5).setLoading(false);
                if (!"CANCELLED".equalsIgnoreCase(str)) {
                    if ("EMPTY".equalsIgnoreCase(str)) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
                        String M0 = jb6.M0(2131747365, null);
                        he heVar3 = alertDialog$Builder.a;
                        heVar3.S = M0;
                        heVar3.U = jb6.M0(2131747366, null);
                        alertDialog$Builder.j(jb6.M0(2131747564, null), null);
                        heVar3.setOnDismissListener(new n1(my0Var, (byte) 27));
                        alertDialog$Builder.o();
                        break;
                    } else {
                        d S = LaunchActivity.S();
                        if (S != null) {
                            if (str != null) {
                                new c41(my0Var.F, my0Var.J0).f0(str, false);
                                break;
                            } else if (passkey != null) {
                                oc7.r1(i).p4(0L, "SETUP_PASSKEY");
                                if (S instanceof PasskeysActivity) {
                                    my0Var.dismiss();
                                    ((PasskeysActivity) S).Z(passkey);
                                    break;
                                } else if (S instanceof PrivacySettingsActivity) {
                                    my0Var.dismiss();
                                    PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) S;
                                    ArrayList arrayList2 = privacySettingsActivity.e;
                                    if (arrayList2 == null) {
                                        arrayList2 = new ArrayList();
                                    }
                                    arrayList2.add(passkey);
                                    privacySettingsActivity.F0(true);
                                    S.presentFragment(new PasskeysActivity(arrayList2));
                                    break;
                                } else {
                                    ConnectionsManager.getInstance(i).sendRequestTyped(new TL_account.getPasskeys(), new kc(b5), new p((Object) my0Var, (Object) passkey, (Object) str, (byte) 23));
                                    break;
                                }
                            }
                        }
                    }
                }
                break;
            case 8:
                boolean[] zArr = (boolean[]) obj5;
                Context context2 = (Context) obj4;
                ylb ylbVar = (ylb) obj3;
                Long l2 = (Long) obj;
                String str2 = (String) obj2;
                if (l2 != null && l2.longValue() != 0) {
                    int i6 = this.d;
                    lv4.c(i6).j(l2.longValue(), new h16(zArr, context2, ylbVar, i6, str2, (byte) 1));
                    break;
                } else {
                    zArr[0] = false;
                    break;
                }
            case 9:
                boolean[] zArr2 = (boolean[]) obj5;
                ArrayList arrayList3 = (ArrayList) obj4;
                jac jacVar = (jac) obj3;
                String str3 = (String) obj;
                Boolean bool = (Boolean) obj2;
                if (!zArr2[0]) {
                    if (str3 != null) {
                        arrayList3.set(i, str3);
                        for (int i7 = 0; i7 < arrayList3.size(); i7++) {
                            if (arrayList3.get(i7) == null) {
                                break;
                            }
                        }
                        zArr2[0] = true;
                        jacVar.a(TextUtils.join("", arrayList3), Boolean.FALSE);
                        break;
                    } else {
                        zArr2[0] = true;
                        jacVar.a(null, bool);
                        break;
                    }
                }
                break;
            default:
                ylb ylbVar2 = (ylb) obj3;
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj;
                ((Runnable[]) obj5)[0] = null;
                TextView textView = ((TextView[]) obj4)[0];
                if (textView != null && wallettransaction != null) {
                    long j3 = wallettransaction.fee;
                    if (j3 > 0) {
                        textView.setText(goc.p0(i, j3, ylbVar2));
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ e(Object obj, int i, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.b = obj;
        this.d = i;
        this.c = obj2;
        this.e = obj3;
    }

    public /* synthetic */ e(Object obj, Object obj2, int i, Object obj3, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = i;
        this.e = obj3;
    }

    public /* synthetic */ e(Object obj, Object obj2, Object obj3, int i, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.e = obj3;
        this.d = i;
    }
}
