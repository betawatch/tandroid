package bi;

import android.content.Context;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.ij;
import org.telegram.messenger.ls;
import org.telegram.messenger.qp;
import org.telegram.messenger.qs;
import org.telegram.messenger.v10;
import org.telegram.messenger.yr;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PasskeysActivity;
import org.telegram.ui.PrivacySettingsActivity;
import org.telegram.ui.gq0;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final /* synthetic */ class v0 implements v10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ v0(int i7, org.telegram.ui.ActionBar.f2 f2Var, vf.b bVar, org.telegram.ui.ActionBar.u1 u1Var) {
        this.a = 0;
        this.b = i7;
        this.c = f2Var;
        this.d = bVar;
        this.e = u1Var;
    }

    @Override // org.telegram.messenger.v10
    public final void a(Object obj, Object obj2) {
        boolean z9;
        int i7 = this.a;
        int i10 = 1;
        int i11 = this.b;
        boolean z10 = false;
        Object obj3 = this.e;
        Object obj4 = this.d;
        Object obj5 = this.c;
        switch (i7) {
            case 0:
                org.telegram.ui.ActionBar.f2 f2Var = (org.telegram.ui.ActionBar.f2) obj5;
                vf.b bVar = (vf.b) obj4;
                org.telegram.ui.ActionBar.u1 u1Var = (org.telegram.ui.ActionBar.u1) obj3;
                TLRPC.Updates updates = (TLRPC.Updates) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (updates != null && tL_error == null) {
                    qp.s1(i11).O3(updates, false);
                }
                org.telegram.messenger.g0.h3(new ai.d0(f2Var, tL_error, bVar, u1Var, 4));
                break;
            case 1:
                boolean[] zArr = (boolean[]) obj5;
                Context context = (Context) obj4;
                org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) obj3;
                Long l10 = (Long) obj;
                String str = (String) obj2;
                if (l10 != null && l10.longValue() != 0) {
                    int i12 = this.b;
                    org.telegram.messenger.w9.c(i12).j(l10.longValue(), new z4(zArr, context, f6Var, i12, str, 0));
                    break;
                } else {
                    zArr[0] = false;
                    break;
                }
            case 2:
                hi.z0 z0Var = (hi.z0) obj4;
                ls[] lsVarArr = (ls[]) obj3;
                ((int[]) obj5)[0] = -1;
                TLRPC.MessageMedia messageMedia = ((TL_account.webPagePreview) obj).media;
                if (!(messageMedia instanceof TLRPC.TL_messageMediaEmpty)) {
                    TLRPC.WebPage webPage = messageMedia.webpage;
                    if (!(webPage instanceof TLRPC.TL_webPageEmpty)) {
                        if (messageMedia instanceof TLRPC.TL_messageMediaWebPage) {
                            if (webPage instanceof TLRPC.TL_webPagePending) {
                                long j3 = webPage.id;
                                int i13 = this.b;
                                hi.b1 b1Var = new hi.b1(j3, lsVarArr, i13, z0Var);
                                lsVarArr[0] = b1Var;
                                qs.f(i13).b(b1Var, 59);
                                break;
                            } else {
                                z0Var.a(webPage instanceof TLRPC.TL_webPage ? webPage : null);
                                break;
                            }
                        } else {
                            z0Var.a(null);
                            break;
                        }
                    }
                }
                z0Var.a(null);
                break;
            case 3:
                org.telegram.ui.ActionBar.u1[] u1VarArr = (org.telegram.ui.ActionBar.u1[]) obj4;
                org.telegram.ui.ActionBar.f2 f2Var2 = (org.telegram.ui.ActionBar.f2) obj5;
                TLRPC.Chat chat = (TLRPC.Chat) obj3;
                ArrayList arrayList = (ArrayList) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                org.telegram.ui.ActionBar.u1 u1Var2 = u1VarArr[0];
                if (u1Var2 != null) {
                    u1Var2.dismiss();
                    u1VarArr[0] = null;
                }
                if (tL_error2 != null) {
                    org.telegram.ui.Components.hc.a0(f2Var2).f0(tL_error2, false);
                    break;
                } else if (arrayList != null) {
                    if (arrayList.isEmpty()) {
                        org.telegram.messenger.k5.o(null, 2131751905, org.telegram.ui.Components.hc.a0(f2Var2), R.raw.info, 36);
                        break;
                    } else if (arrayList.isEmpty()) {
                        org.telegram.ui.Components.hc.a0(f2Var2).Q(R.raw.info, 36, "").j();
                        break;
                    } else {
                        f2Var2.showDialog(new ii.d0(f2Var2, 0L, arrayList, new hi.d4(f2Var2, chat, i11, i10)));
                        break;
                    }
                }
                break;
            case 4:
                org.telegram.ui.a1 a1Var = (org.telegram.ui.a1) obj5;
                TLRPC.TL_channels_joinChannel tL_channels_joinChannel = (TLRPC.TL_channels_joinChannel) obj4;
                TLRPC.Chat chat2 = (TLRPC.Chat) obj3;
                TLRPC.ChatInviteJoinResult chatInviteJoinResult = (TLRPC.ChatInviteJoinResult) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                int i14 = this.b;
                if (tL_error3 != null) {
                    org.telegram.messenger.g0.h3(new ai.a1(a1Var, i14, tL_error3, tL_channels_joinChannel, 13));
                    break;
                } else {
                    if (chatInviteJoinResult instanceof TLRPC.TL_chatInviteJoinResultOk) {
                        TLRPC.Updates updates2 = ((TLRPC.TL_chatInviteJoinResultOk) chatInviteJoinResult).updates;
                        int i15 = 0;
                        while (true) {
                            if (i15 < updates2.updates.size()) {
                                TLRPC.Update update = updates2.updates.get(i15);
                                if ((update instanceof TL_update.TL_updateNewChannelMessage) && (((TL_update.TL_updateNewChannelMessage) update).message.action instanceof TLRPC.TL_messageActionChatAddUser)) {
                                    z9 = true;
                                } else {
                                    i15++;
                                }
                            } else {
                                z9 = false;
                            }
                        }
                        qp.s1(i14).O3(updates2, false);
                        z10 = z9;
                    } else if (chatInviteJoinResult instanceof TLRPC.TL_chatInviteJoinResultWebView) {
                        org.telegram.messenger.g0.h3(new ai.e0(i14, (TLRPC.TL_chatInviteJoinResultWebView) chatInviteJoinResult, chat2, 28));
                        z10 = true;
                    }
                    if (!z10) {
                        qp.s1(i14).B0(chat2.id, true);
                    }
                    org.telegram.messenger.g0.h3(new gq0(a1Var, 5));
                    org.telegram.messenger.g0.i3(new bg.m0(i14, chat2, 17), 1000L);
                    yr a02 = yr.a0(i14);
                    long j10 = chat2.id;
                    a02.R1(-j10, j10, new ArrayList(), null);
                    break;
                }
                break;
            case 5:
                org.telegram.ui.Components.g0 g0Var = (org.telegram.ui.Components.g0) obj5;
                org.telegram.ui.ActionBar.k5 k5Var = (org.telegram.ui.ActionBar.k5) obj4;
                TLRPC.TL_messages_composeMessageWithAI tL_messages_composeMessageWithAI = (TLRPC.TL_messages_composeMessageWithAI) obj3;
                TLRPC.TL_composedMessageWithAI tL_composedMessageWithAI = (TLRPC.TL_composedMessageWithAI) obj;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) obj2;
                FrameLayout frameLayout = g0Var.y2;
                g0Var.I2 = -1;
                g0Var.J2 = false;
                if (tL_error4 == null || (!"SUMMARY_FLOOD_PREMIUM".equalsIgnoreCase(tL_error4.text) && !"AICOMPOSE_FLOOD_PREMIUM".equalsIgnoreCase(tL_error4.text))) {
                    if (tL_error4 != null) {
                        org.telegram.ui.Cells.f1.r(frameLayout, g0Var.I0, tL_error4, false);
                        k5Var.i(null);
                        g0Var.B2 = true;
                        g0Var.C2 = false;
                        g0Var.u1(true);
                        break;
                    } else if (tL_composedMessageWithAI == null) {
                        k5Var.i(null);
                        g0Var.B2 = true;
                        g0Var.C2 = false;
                        g0Var.u1(true);
                        break;
                    } else {
                        k5Var.i(null);
                        g0Var.C2 = false;
                        g0Var.u1(true);
                        g0Var.K2[i11] = tL_messages_composeMessageWithAI;
                        if (i11 == 0) {
                            g0Var.R1 = false;
                            g0Var.S1 = ij.h0(tL_composedMessageWithAI.result_text, false);
                        } else if (i11 == 1) {
                            g0Var.U1 = false;
                            g0Var.V1 = ij.h0(tL_composedMessageWithAI.result_text, false);
                        } else if (i11 == 2) {
                            g0Var.X1 = false;
                            TLRPC.TL_textWithEntities tL_textWithEntities = tL_composedMessageWithAI.diff_text;
                            if (tL_textWithEntities != null) {
                                g0Var.Y1 = ij.h0(tL_textWithEntities, false);
                                g0Var.a2 = ij.h0(tL_composedMessageWithAI.result_text, false);
                            } else {
                                CharSequence h02 = ij.h0(tL_composedMessageWithAI.result_text, false);
                                g0Var.a2 = h02;
                                g0Var.Y1 = h02;
                            }
                        }
                        g0Var.G2.O(true);
                        break;
                    }
                } else {
                    new org.telegram.ui.Components.hc(frameLayout, g0Var.I0).I(R.raw.star_premium_2, org.telegram.messenger.hd.M0(2131754989, null), org.telegram.messenger.g0.X2(org.telegram.messenger.hd.M0(2131754990, null))).j();
                    g0Var.C2 = true;
                    g0Var.u1(true);
                    break;
                }
                break;
            case 6:
                org.telegram.ui.Components.g0 g0Var2 = (org.telegram.ui.Components.g0) obj5;
                org.telegram.ui.ActionBar.k5 k5Var2 = (org.telegram.ui.ActionBar.k5) obj4;
                TLRPC.TL_messages_composeRichMessageWithAI tL_messages_composeRichMessageWithAI = (TLRPC.TL_messages_composeRichMessageWithAI) obj3;
                TLRPC.TL_composedRichMessageWithAI tL_composedRichMessageWithAI = (TLRPC.TL_composedRichMessageWithAI) obj;
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) obj2;
                FrameLayout frameLayout2 = g0Var2.y2;
                g0Var2.I2 = -1;
                g0Var2.J2 = false;
                if (tL_error5 == null || (!"SUMMARY_FLOOD_PREMIUM".equalsIgnoreCase(tL_error5.text) && !"AICOMPOSE_FLOOD_PREMIUM".equalsIgnoreCase(tL_error5.text))) {
                    if (tL_error5 != null) {
                        org.telegram.ui.Cells.f1.r(frameLayout2, g0Var2.I0, tL_error5, false);
                        k5Var2.i(null);
                        g0Var2.B2 = true;
                        g0Var2.C2 = false;
                        g0Var2.u1(true);
                        break;
                    } else if (tL_composedRichMessageWithAI == null) {
                        k5Var2.i(null);
                        g0Var2.B2 = true;
                        g0Var2.C2 = false;
                        g0Var2.u1(true);
                        break;
                    } else {
                        k5Var2.i(null);
                        g0Var2.C2 = false;
                        g0Var2.u1(true);
                        g0Var2.L2[i11] = tL_messages_composeRichMessageWithAI;
                        if (i11 == 0) {
                            g0Var2.R1 = false;
                            g0Var2.T1 = tL_composedRichMessageWithAI.result;
                        } else if (i11 == 1) {
                            g0Var2.U1 = false;
                            g0Var2.W1 = tL_composedRichMessageWithAI.result;
                        } else if (i11 == 2) {
                            g0Var2.X1 = false;
                            g0Var2.Z1 = tL_composedRichMessageWithAI.result;
                        }
                        g0Var2.G2.O(true);
                        break;
                    }
                } else {
                    new org.telegram.ui.Components.hc(frameLayout2, g0Var2.I0).I(R.raw.star_premium_2, org.telegram.messenger.hd.M0(2131754989, null), org.telegram.messenger.g0.X2(org.telegram.messenger.hd.M0(2131754990, null))).j();
                    g0Var2.C2 = true;
                    g0Var2.u1(true);
                    break;
                }
                break;
            case 7:
                boolean[] zArr2 = (boolean[]) obj5;
                ArrayList arrayList2 = (ArrayList) obj4;
                v10 v10Var = (v10) obj3;
                String str2 = (String) obj;
                Boolean bool = (Boolean) obj2;
                if (!zArr2[0]) {
                    if (str2 != null) {
                        arrayList2.set(i11, str2);
                        for (int i16 = 0; i16 < arrayList2.size(); i16++) {
                            if (arrayList2.get(i16) == null) {
                                break;
                            }
                        }
                        zArr2[0] = true;
                        v10Var.a(TextUtils.join("", arrayList2), Boolean.FALSE);
                        break;
                    } else {
                        zArr2[0] = true;
                        v10Var.a(null, bool);
                        break;
                    }
                }
                break;
            case 8:
                Context context2 = (Context) obj4;
                org.telegram.ui.ActionBar.v2 v2Var = (org.telegram.ui.ActionBar.v2) obj3;
                TL_account.Passkey passkey = (TL_account.Passkey) obj;
                String str3 = (String) obj2;
                ((fi.d) obj5).setLoading(false);
                if (!"CANCELLED".equalsIgnoreCase(str3)) {
                    if ("EMPTY".equalsIgnoreCase(str3)) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context2);
                        String M0 = org.telegram.messenger.hd.M0(2131747631, null);
                        org.telegram.ui.ActionBar.u1 u1Var3 = alertDialog$Builder.a;
                        u1Var3.R = M0;
                        u1Var3.T = org.telegram.messenger.hd.M0(2131747632, null);
                        alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131747830, null), null);
                        u1Var3.setOnDismissListener(new org.telegram.ui.q5(v2Var, 9));
                        alertDialog$Builder.p();
                        break;
                    } else {
                        org.telegram.ui.ActionBar.f2 T = LaunchActivity.T();
                        if (T != null) {
                            if (str3 != null) {
                                new org.telegram.ui.Components.hc(v2Var.E, v2Var.I0).e0(str3, false);
                                break;
                            } else if (passkey != null) {
                                qp.s1(i11).k4(0L, "SETUP_PASSKEY");
                                if (T instanceof PasskeysActivity) {
                                    v2Var.dismiss();
                                    ((PasskeysActivity) T).d0(passkey);
                                    break;
                                } else if (T instanceof PrivacySettingsActivity) {
                                    v2Var.dismiss();
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
                                    ConnectionsManager.getInstance(i11).sendRequestTyped(new TL_account.getPasskeys(), new d3.b(1), new org.telegram.ui.n6(v2Var, passkey, str3, 3));
                                    break;
                                }
                            }
                        }
                    }
                }
                break;
            default:
                org.telegram.ui.ActionBar.f6 f6Var2 = (org.telegram.ui.ActionBar.f6) obj3;
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj;
                ((Runnable[]) obj5)[0] = null;
                TextView textView = ((TextView[]) obj4)[0];
                if (textView != null && wallettransaction != null) {
                    long j11 = wallettransaction.fee;
                    if (j11 > 0) {
                        textView.setText(org.telegram.ui.Wallet.y5.w0(i11, j11, f6Var2));
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ v0(Object obj, int i7, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = i7;
        this.d = obj2;
        this.e = obj3;
    }

    public /* synthetic */ v0(Object obj, Object obj2, int i7, Object obj3, int i10) {
        this.a = i10;
        this.c = obj;
        this.d = obj2;
        this.b = i7;
        this.e = obj3;
    }

    public /* synthetic */ v0(Object obj, Object obj2, Object obj3, int i7, int i10) {
        this.a = i10;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = i7;
    }

    public /* synthetic */ v0(org.telegram.ui.ActionBar.u1[] u1VarArr, org.telegram.ui.ActionBar.f2 f2Var, int i7, TLRPC.Chat chat) {
        this.a = 3;
        this.d = u1VarArr;
        this.c = f2Var;
        this.b = i7;
        this.e = chat;
    }
}
