package ci;

import android.content.Context;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.bd;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cs;
import org.telegram.messenger.hp;
import org.telegram.messenger.hs;
import org.telegram.messenger.n10;
import org.telegram.messenger.qr;
import org.telegram.messenger.zi;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PasskeysActivity;
import org.telegram.ui.PrivacySettingsActivity;
import org.telegram.ui.xp0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class o0 implements n10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ o0(int i3, org.telegram.ui.ActionBar.d2 d2Var, sf.b bVar, org.telegram.ui.ActionBar.s1 s1Var) {
        this.a = 0;
        this.b = i3;
        this.c = d2Var;
        this.d = bVar;
        this.e = s1Var;
    }

    @Override // org.telegram.messenger.n10
    public final void a(Object obj, Object obj2) {
        boolean z10;
        int i3 = this.a;
        int i10 = this.b;
        boolean z11 = false;
        Object obj3 = this.e;
        Object obj4 = this.d;
        Object obj5 = this.c;
        switch (i3) {
            case 0:
                org.telegram.ui.ActionBar.d2 d2Var = (org.telegram.ui.ActionBar.d2) obj5;
                sf.b bVar = (sf.b) obj4;
                org.telegram.ui.ActionBar.s1 s1Var = (org.telegram.ui.ActionBar.s1) obj3;
                TLRPC.Updates updates = (TLRPC.Updates) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (updates != null && tL_error == null) {
                    hp.s1(i10).O3(updates, false);
                }
                org.telegram.messenger.g0.h3(new ai.z3(d2Var, tL_error, bVar, s1Var, 6));
                break;
            case 1:
                boolean[] zArr = (boolean[]) obj5;
                Context context = (Context) obj4;
                org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) obj3;
                Long l10 = (Long) obj;
                String str = (String) obj2;
                if (l10 != null && l10.longValue() != 0) {
                    int i11 = this.b;
                    org.telegram.messenger.q9.c(i11).j(l10.longValue(), new i4(zArr, context, e6Var, i11, str, 0));
                    break;
                } else {
                    zArr[0] = false;
                    break;
                }
                break;
            case 2:
                ii.a1 a1Var = (ii.a1) obj4;
                cs[] csVarArr = (cs[]) obj3;
                ((int[]) obj5)[0] = -1;
                TLRPC.MessageMedia messageMedia = ((TL_account.webPagePreview) obj).media;
                if (!(messageMedia instanceof TLRPC.TL_messageMediaEmpty)) {
                    TLRPC.WebPage webPage = messageMedia.webpage;
                    if (!(webPage instanceof TLRPC.TL_webPageEmpty)) {
                        if (messageMedia instanceof TLRPC.TL_messageMediaWebPage) {
                            if (webPage instanceof TLRPC.TL_webPagePending) {
                                long j10 = webPage.id;
                                int i12 = this.b;
                                ii.c1 c1Var = new ii.c1(j10, csVarArr, i12, a1Var);
                                csVarArr[0] = c1Var;
                                hs.f(i12).b(c1Var, 59);
                                break;
                            } else {
                                a1Var.a(webPage instanceof TLRPC.TL_webPage ? webPage : null);
                                break;
                            }
                        } else {
                            a1Var.a(null);
                            break;
                        }
                    }
                }
                a1Var.a(null);
                break;
            case 3:
                org.telegram.ui.ActionBar.s1[] s1VarArr = (org.telegram.ui.ActionBar.s1[]) obj4;
                org.telegram.ui.ActionBar.d2 d2Var2 = (org.telegram.ui.ActionBar.d2) obj5;
                TLRPC.Chat chat = (TLRPC.Chat) obj3;
                ArrayList arrayList = (ArrayList) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                org.telegram.ui.ActionBar.s1 s1Var2 = s1VarArr[0];
                if (s1Var2 != null) {
                    s1Var2.dismiss();
                    s1VarArr[0] = null;
                }
                if (tL_error2 != null) {
                    org.telegram.ui.Components.fc.a0(d2Var2).f0(tL_error2, false);
                    break;
                } else if (arrayList != null) {
                    if (arrayList.isEmpty()) {
                        org.telegram.messenger.k5.o(null, 2131751905, org.telegram.ui.Components.fc.a0(d2Var2), R.raw.info, 36);
                        break;
                    } else if (arrayList.isEmpty()) {
                        org.telegram.ui.Components.fc.a0(d2Var2).Q(R.raw.info, 36, "").j();
                        break;
                    } else {
                        d2Var2.showDialog(new ji.b0(d2Var2, 0L, arrayList, new ai.g3(d2Var2, chat, i10, 2)));
                        break;
                    }
                }
                break;
            case 4:
                org.telegram.ui.b1 b1Var = (org.telegram.ui.b1) obj5;
                TLRPC.TL_channels_joinChannel tL_channels_joinChannel = (TLRPC.TL_channels_joinChannel) obj4;
                TLRPC.Chat chat2 = (TLRPC.Chat) obj3;
                TLRPC.ChatInviteJoinResult chatInviteJoinResult = (TLRPC.ChatInviteJoinResult) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                int i13 = this.b;
                if (tL_error3 != null) {
                    org.telegram.messenger.g0.h3(new bi.q0(b1Var, i13, tL_error3, tL_channels_joinChannel, 14));
                    break;
                } else {
                    if (chatInviteJoinResult instanceof TLRPC.TL_chatInviteJoinResultOk) {
                        TLRPC.Updates updates2 = ((TLRPC.TL_chatInviteJoinResultOk) chatInviteJoinResult).updates;
                        int i14 = 0;
                        while (true) {
                            if (i14 < updates2.updates.size()) {
                                TLRPC.Update update = updates2.updates.get(i14);
                                if ((update instanceof TL_update.TL_updateNewChannelMessage) && (((TL_update.TL_updateNewChannelMessage) update).message.action instanceof TLRPC.TL_messageActionChatAddUser)) {
                                    z10 = true;
                                } else {
                                    i14++;
                                }
                            } else {
                                z10 = false;
                            }
                        }
                        hp.s1(i13).O3(updates2, false);
                        z11 = z10;
                    } else if (chatInviteJoinResult instanceof TLRPC.TL_chatInviteJoinResultWebView) {
                        org.telegram.messenger.g0.h3(new ai.e3(i13, (TLRPC.TL_chatInviteJoinResultWebView) chatInviteJoinResult, chat2, 29));
                        z11 = true;
                    }
                    if (!z11) {
                        hp.s1(i13).B0(chat2.id, true);
                    }
                    org.telegram.messenger.g0.h3(new xp0(b1Var, 5));
                    org.telegram.messenger.g0.i3(new cg.l0(i13, chat2, 17), 1000L);
                    qr a02 = qr.a0(i13);
                    long j11 = chat2.id;
                    a02.R1(-j11, j11, new ArrayList(), null);
                    break;
                }
                break;
            case 5:
                org.telegram.ui.Components.e0 e0Var = (org.telegram.ui.Components.e0) obj5;
                org.telegram.ui.ActionBar.k5 k5Var = (org.telegram.ui.ActionBar.k5) obj4;
                TLRPC.TL_messages_composeMessageWithAI tL_messages_composeMessageWithAI = (TLRPC.TL_messages_composeMessageWithAI) obj3;
                TLRPC.TL_composedMessageWithAI tL_composedMessageWithAI = (TLRPC.TL_composedMessageWithAI) obj;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) obj2;
                FrameLayout frameLayout = e0Var.z2;
                e0Var.J2 = -1;
                e0Var.K2 = false;
                if (tL_error4 == null || (!"SUMMARY_FLOOD_PREMIUM".equalsIgnoreCase(tL_error4.text) && !"AICOMPOSE_FLOOD_PREMIUM".equalsIgnoreCase(tL_error4.text))) {
                    if (tL_error4 != null) {
                        org.telegram.ui.Cells.f1.v(frameLayout, e0Var.J0, tL_error4, false);
                        k5Var.i(null);
                        e0Var.C2 = true;
                        e0Var.D2 = false;
                        e0Var.u1(true);
                        break;
                    } else if (tL_composedMessageWithAI == null) {
                        k5Var.i(null);
                        e0Var.C2 = true;
                        e0Var.D2 = false;
                        e0Var.u1(true);
                        break;
                    } else {
                        k5Var.i(null);
                        e0Var.D2 = false;
                        e0Var.u1(true);
                        e0Var.L2[i10] = tL_messages_composeMessageWithAI;
                        if (i10 == 0) {
                            e0Var.S1 = false;
                            e0Var.T1 = zi.h0(tL_composedMessageWithAI.result_text, false);
                        } else if (i10 == 1) {
                            e0Var.V1 = false;
                            e0Var.W1 = zi.h0(tL_composedMessageWithAI.result_text, false);
                        } else if (i10 == 2) {
                            e0Var.Y1 = false;
                            TLRPC.TL_textWithEntities tL_textWithEntities = tL_composedMessageWithAI.diff_text;
                            if (tL_textWithEntities != null) {
                                e0Var.Z1 = zi.h0(tL_textWithEntities, false);
                                e0Var.b2 = zi.h0(tL_composedMessageWithAI.result_text, false);
                            } else {
                                CharSequence h02 = zi.h0(tL_composedMessageWithAI.result_text, false);
                                e0Var.b2 = h02;
                                e0Var.Z1 = h02;
                            }
                        }
                        e0Var.H2.O(true);
                        break;
                    }
                } else {
                    new org.telegram.ui.Components.fc(frameLayout, e0Var.J0).I(R.raw.star_premium_2, bd.M0(2131754989, null), org.telegram.messenger.g0.X2(bd.M0(2131754990, null))).j();
                    e0Var.D2 = true;
                    e0Var.u1(true);
                    break;
                }
                break;
            case 6:
                org.telegram.ui.Components.e0 e0Var2 = (org.telegram.ui.Components.e0) obj5;
                org.telegram.ui.ActionBar.k5 k5Var2 = (org.telegram.ui.ActionBar.k5) obj4;
                TLRPC.TL_messages_composeRichMessageWithAI tL_messages_composeRichMessageWithAI = (TLRPC.TL_messages_composeRichMessageWithAI) obj3;
                TLRPC.TL_composedRichMessageWithAI tL_composedRichMessageWithAI = (TLRPC.TL_composedRichMessageWithAI) obj;
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) obj2;
                FrameLayout frameLayout2 = e0Var2.z2;
                e0Var2.J2 = -1;
                e0Var2.K2 = false;
                if (tL_error5 == null || (!"SUMMARY_FLOOD_PREMIUM".equalsIgnoreCase(tL_error5.text) && !"AICOMPOSE_FLOOD_PREMIUM".equalsIgnoreCase(tL_error5.text))) {
                    if (tL_error5 != null) {
                        org.telegram.ui.Cells.f1.v(frameLayout2, e0Var2.J0, tL_error5, false);
                        k5Var2.i(null);
                        e0Var2.C2 = true;
                        e0Var2.D2 = false;
                        e0Var2.u1(true);
                        break;
                    } else if (tL_composedRichMessageWithAI == null) {
                        k5Var2.i(null);
                        e0Var2.C2 = true;
                        e0Var2.D2 = false;
                        e0Var2.u1(true);
                        break;
                    } else {
                        k5Var2.i(null);
                        e0Var2.D2 = false;
                        e0Var2.u1(true);
                        e0Var2.M2[i10] = tL_messages_composeRichMessageWithAI;
                        if (i10 == 0) {
                            e0Var2.S1 = false;
                            e0Var2.U1 = tL_composedRichMessageWithAI.result;
                        } else if (i10 == 1) {
                            e0Var2.V1 = false;
                            e0Var2.X1 = tL_composedRichMessageWithAI.result;
                        } else if (i10 == 2) {
                            e0Var2.Y1 = false;
                            e0Var2.a2 = tL_composedRichMessageWithAI.result;
                        }
                        e0Var2.H2.O(true);
                        break;
                    }
                } else {
                    new org.telegram.ui.Components.fc(frameLayout2, e0Var2.J0).I(R.raw.star_premium_2, bd.M0(2131754989, null), org.telegram.messenger.g0.X2(bd.M0(2131754990, null))).j();
                    e0Var2.D2 = true;
                    e0Var2.u1(true);
                    break;
                }
                break;
            case 7:
                boolean[] zArr2 = (boolean[]) obj5;
                ArrayList arrayList2 = (ArrayList) obj4;
                n10 n10Var = (n10) obj3;
                String str2 = (String) obj;
                Boolean bool = (Boolean) obj2;
                if (!zArr2[0]) {
                    if (str2 != null) {
                        arrayList2.set(i10, str2);
                        for (int i15 = 0; i15 < arrayList2.size(); i15++) {
                            if (arrayList2.get(i15) == null) {
                                break;
                            }
                        }
                        zArr2[0] = true;
                        n10Var.a(TextUtils.join("", arrayList2), Boolean.FALSE);
                        break;
                    } else {
                        zArr2[0] = true;
                        n10Var.a(null, bool);
                        break;
                    }
                }
                break;
            case 8:
                Context context2 = (Context) obj4;
                org.telegram.ui.ActionBar.t2 t2Var = (org.telegram.ui.ActionBar.t2) obj3;
                TL_account.Passkey passkey = (TL_account.Passkey) obj;
                String str3 = (String) obj2;
                ((gi.d) obj5).setLoading(false);
                if (!"CANCELLED".equalsIgnoreCase(str3)) {
                    if ("EMPTY".equalsIgnoreCase(str3)) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context2);
                        String M0 = bd.M0(2131747640, null);
                        org.telegram.ui.ActionBar.s1 s1Var3 = alertDialog$Builder.a;
                        s1Var3.S = M0;
                        s1Var3.U = bd.M0(2131747641, null);
                        alertDialog$Builder.k(bd.M0(2131747839, null), null);
                        s1Var3.setOnDismissListener(new org.telegram.ui.s5(t2Var, 9));
                        alertDialog$Builder.p();
                        break;
                    } else {
                        org.telegram.ui.ActionBar.d2 T = LaunchActivity.T();
                        if (T != null) {
                            if (str3 != null) {
                                new org.telegram.ui.Components.fc(t2Var.F, t2Var.J0).e0(str3, false);
                                break;
                            } else if (passkey != null) {
                                hp.s1(i10).k4(0L, "SETUP_PASSKEY");
                                if (T instanceof PasskeysActivity) {
                                    t2Var.dismiss();
                                    ((PasskeysActivity) T).d0(passkey);
                                    break;
                                } else if (T instanceof PrivacySettingsActivity) {
                                    t2Var.dismiss();
                                    PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) T;
                                    ArrayList arrayList3 = privacySettingsActivity.e;
                                    if (arrayList3 == null) {
                                        arrayList3 = new ArrayList();
                                    }
                                    arrayList3.add(passkey);
                                    privacySettingsActivity.F0(true);
                                    T.presentFragment(new PasskeysActivity(arrayList3));
                                    break;
                                } else {
                                    ConnectionsManager.getInstance(i10).sendRequestTyped(new TL_account.getPasskeys(), new c3.b(1), new org.telegram.ui.o6(t2Var, passkey, str3, 3));
                                    break;
                                }
                            }
                        }
                    }
                }
                break;
            default:
                org.telegram.ui.ActionBar.e6 e6Var2 = (org.telegram.ui.ActionBar.e6) obj3;
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj;
                ((Runnable[]) obj5)[0] = null;
                TextView textView = ((TextView[]) obj4)[0];
                if (textView != null && wallettransaction != null) {
                    long j12 = wallettransaction.fee;
                    if (j12 > 0) {
                        textView.setText(org.telegram.ui.Wallet.w5.w0(i10, j12, e6Var2));
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ o0(Object obj, int i3, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = i3;
        this.d = obj2;
        this.e = obj3;
    }

    public /* synthetic */ o0(Object obj, Object obj2, int i3, Object obj3, int i10) {
        this.a = i10;
        this.c = obj;
        this.d = obj2;
        this.b = i3;
        this.e = obj3;
    }

    public /* synthetic */ o0(Object obj, Object obj2, Object obj3, int i3, int i10) {
        this.a = i10;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = i3;
    }

    public /* synthetic */ o0(org.telegram.ui.ActionBar.s1[] s1VarArr, org.telegram.ui.ActionBar.d2 d2Var, int i3, TLRPC.Chat chat) {
        this.a = 3;
        this.d = s1VarArr;
        this.c = d2Var;
        this.b = i3;
        this.e = chat;
    }
}
