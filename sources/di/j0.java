package di;

import android.content.Context;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.fj;
import org.telegram.messenger.fs;
import org.telegram.messenger.gd;
import org.telegram.messenger.ks;
import org.telegram.messenger.mp;
import org.telegram.messenger.q10;
import org.telegram.messenger.tr;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PasskeysActivity;
import org.telegram.ui.PrivacySettingsActivity;
import org.telegram.ui.hq0;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final /* synthetic */ class j0 implements q10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ j0(int i7, org.telegram.ui.ActionBar.g2 g2Var, vf.b bVar, org.telegram.ui.ActionBar.t1 t1Var) {
        this.a = 0;
        this.b = i7;
        this.c = g2Var;
        this.d = bVar;
        this.e = t1Var;
    }

    @Override // org.telegram.messenger.q10
    public final void a(Object obj, Object obj2) {
        boolean z10;
        int i7 = this.a;
        int i10 = 1;
        int i11 = this.b;
        boolean z11 = false;
        Object obj3 = this.e;
        Object obj4 = this.d;
        Object obj5 = this.c;
        switch (i7) {
            case 0:
                org.telegram.ui.ActionBar.g2 g2Var = (org.telegram.ui.ActionBar.g2) obj5;
                vf.b bVar = (vf.b) obj4;
                org.telegram.ui.ActionBar.t1 t1Var = (org.telegram.ui.ActionBar.t1) obj3;
                TLRPC.Updates updates = (TLRPC.Updates) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (updates != null && tL_error == null) {
                    mp.u1(i11).V3(updates, false);
                }
                org.telegram.messenger.g0.g3(new ai.r(g2Var, tL_error, bVar, t1Var, 8));
                break;
            case 1:
                boolean[] zArr = (boolean[]) obj5;
                Context context = (Context) obj4;
                org.telegram.ui.ActionBar.h6 h6Var = (org.telegram.ui.ActionBar.h6) obj3;
                Long l10 = (Long) obj;
                String str = (String) obj2;
                if (l10 != null && l10.longValue() != 0) {
                    int i12 = this.b;
                    org.telegram.messenger.u9.c(i12).j(l10.longValue(), new b4(zArr, context, h6Var, i12, str, 0));
                    break;
                } else {
                    zArr[0] = false;
                    break;
                }
                break;
            case 2:
                ki.x0 x0Var = (ki.x0) obj4;
                fs[] fsVarArr = (fs[]) obj3;
                ((int[]) obj5)[0] = -1;
                TLRPC.MessageMedia messageMedia = ((TL_account.webPagePreview) obj).media;
                if (!(messageMedia instanceof TLRPC.TL_messageMediaEmpty)) {
                    TLRPC.WebPage webPage = messageMedia.webpage;
                    if (!(webPage instanceof TLRPC.TL_webPageEmpty)) {
                        if (messageMedia instanceof TLRPC.TL_messageMediaWebPage) {
                            if (webPage instanceof TLRPC.TL_webPagePending) {
                                long j3 = webPage.id;
                                int i13 = this.b;
                                ki.z0 z0Var = new ki.z0(j3, fsVarArr, i13, x0Var);
                                fsVarArr[0] = z0Var;
                                ks.f(i13).b(z0Var, 59);
                                break;
                            } else {
                                x0Var.a(webPage instanceof TLRPC.TL_webPage ? webPage : null);
                                break;
                            }
                        } else {
                            x0Var.a(null);
                            break;
                        }
                    }
                }
                x0Var.a(null);
                break;
            case 3:
                org.telegram.ui.ActionBar.t1[] t1VarArr = (org.telegram.ui.ActionBar.t1[]) obj4;
                org.telegram.ui.ActionBar.g2 g2Var2 = (org.telegram.ui.ActionBar.g2) obj5;
                TLRPC.Chat chat = (TLRPC.Chat) obj3;
                ArrayList arrayList = (ArrayList) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                org.telegram.ui.ActionBar.t1 t1Var2 = t1VarArr[0];
                if (t1Var2 != null) {
                    t1Var2.dismiss();
                    t1VarArr[0] = null;
                }
                if (tL_error2 != null) {
                    org.telegram.ui.Components.lc.b0(g2Var2).g0(tL_error2, false);
                    break;
                } else if (arrayList != null) {
                    if (arrayList.isEmpty()) {
                        org.telegram.messenger.f3.n(null, 2131751893, org.telegram.ui.Components.lc.b0(g2Var2), R.raw.info, 36);
                        break;
                    } else if (arrayList.isEmpty()) {
                        org.telegram.ui.Components.lc.b0(g2Var2).Q(R.raw.info, 36, "").j();
                        break;
                    } else {
                        g2Var2.showDialog(new li.d0(g2Var2, 0L, arrayList, new bi.h5(g2Var2, chat, i11, 2)));
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
                    org.telegram.messenger.g0.g3(new bi.x4(a1Var, i14, tL_error3, tL_channels_joinChannel, 14));
                    break;
                } else {
                    if (chatInviteJoinResult instanceof TLRPC.TL_chatInviteJoinResultOk) {
                        TLRPC.Updates updates2 = ((TLRPC.TL_chatInviteJoinResultOk) chatInviteJoinResult).updates;
                        int i15 = 0;
                        while (true) {
                            if (i15 < updates2.updates.size()) {
                                TLRPC.Update update = updates2.updates.get(i15);
                                if ((update instanceof TL_update.TL_updateNewChannelMessage) && (((TL_update.TL_updateNewChannelMessage) update).message.action instanceof TLRPC.TL_messageActionChatAddUser)) {
                                    z10 = true;
                                } else {
                                    i15++;
                                }
                            } else {
                                z10 = false;
                            }
                        }
                        mp.u1(i14).V3(updates2, false);
                        z11 = z10;
                    } else if (chatInviteJoinResult instanceof TLRPC.TL_chatInviteJoinResultWebView) {
                        org.telegram.messenger.g0.g3(new org.telegram.ui.b0(i14, (TLRPC.TL_chatInviteJoinResultWebView) chatInviteJoinResult, chat2, 2));
                        z11 = true;
                    }
                    if (!z11) {
                        mp.u1(i14).D0(chat2.id, true);
                    }
                    org.telegram.messenger.g0.g3(new hq0(a1Var, 5));
                    org.telegram.messenger.g0.h3(new ai.y0(i14, chat2, 21), 1000L);
                    tr a02 = tr.a0(i14);
                    long j10 = chat2.id;
                    a02.R1(-j10, j10, new ArrayList(), null);
                    break;
                }
                break;
            case 5:
                org.telegram.ui.Components.n0 n0Var = (org.telegram.ui.Components.n0) obj5;
                org.telegram.ui.ActionBar.m5 m5Var = (org.telegram.ui.ActionBar.m5) obj4;
                TLRPC.TL_messages_composeMessageWithAI tL_messages_composeMessageWithAI = (TLRPC.TL_messages_composeMessageWithAI) obj3;
                TLRPC.TL_composedMessageWithAI tL_composedMessageWithAI = (TLRPC.TL_composedMessageWithAI) obj;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) obj2;
                FrameLayout frameLayout = n0Var.E2;
                n0Var.V2 = -1;
                n0Var.W2 = false;
                if (tL_error4 == null || (!"SUMMARY_FLOOD_PREMIUM".equalsIgnoreCase(tL_error4.text) && !"AICOMPOSE_FLOOD_PREMIUM".equalsIgnoreCase(tL_error4.text))) {
                    if (tL_error4 != null) {
                        org.telegram.ui.Cells.c0.t(frameLayout, n0Var.J0, tL_error4, false);
                        m5Var.i(null);
                        n0Var.H2 = true;
                        n0Var.I2 = false;
                        n0Var.B1(true);
                        break;
                    } else if (tL_composedMessageWithAI == null) {
                        m5Var.i(null);
                        n0Var.H2 = true;
                        n0Var.I2 = false;
                        n0Var.B1(true);
                        break;
                    } else {
                        m5Var.i(null);
                        n0Var.I2 = false;
                        n0Var.B1(true);
                        n0Var.X2[i11] = tL_messages_composeMessageWithAI;
                        if (i11 == 0) {
                            n0Var.V1 = false;
                            n0Var.W1 = fj.h0(tL_composedMessageWithAI.result_text, false);
                        } else if (i11 == 1) {
                            n0Var.Y1 = false;
                            n0Var.Z1 = fj.h0(tL_composedMessageWithAI.result_text, false);
                        } else if (i11 == 2) {
                            n0Var.b2 = false;
                            TLRPC.TL_textWithEntities tL_textWithEntities = tL_composedMessageWithAI.diff_text;
                            if (tL_textWithEntities != null) {
                                n0Var.c2 = fj.h0(tL_textWithEntities, false);
                                n0Var.e2 = fj.h0(tL_composedMessageWithAI.result_text, false);
                            } else {
                                CharSequence h02 = fj.h0(tL_composedMessageWithAI.result_text, false);
                                n0Var.e2 = h02;
                                n0Var.c2 = h02;
                            }
                        }
                        n0Var.P2.O(true);
                        break;
                    }
                } else {
                    new org.telegram.ui.Components.lc(frameLayout, n0Var.J0).I(R.raw.star_premium_2, gd.N0(2131754989, null), org.telegram.messenger.g0.W2(gd.N0(2131754990, null))).j();
                    n0Var.I2 = true;
                    n0Var.B1(true);
                    break;
                }
                break;
            case 6:
                org.telegram.ui.Components.n0 n0Var2 = (org.telegram.ui.Components.n0) obj5;
                org.telegram.ui.ActionBar.m5 m5Var2 = (org.telegram.ui.ActionBar.m5) obj4;
                TLRPC.TL_messages_composeRichMessageWithAI tL_messages_composeRichMessageWithAI = (TLRPC.TL_messages_composeRichMessageWithAI) obj3;
                TLRPC.TL_composedRichMessageWithAI tL_composedRichMessageWithAI = (TLRPC.TL_composedRichMessageWithAI) obj;
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) obj2;
                FrameLayout frameLayout2 = n0Var2.E2;
                n0Var2.V2 = -1;
                n0Var2.W2 = false;
                if (tL_error5 == null || (!"SUMMARY_FLOOD_PREMIUM".equalsIgnoreCase(tL_error5.text) && !"AICOMPOSE_FLOOD_PREMIUM".equalsIgnoreCase(tL_error5.text))) {
                    if (tL_error5 != null) {
                        org.telegram.ui.Cells.c0.t(frameLayout2, n0Var2.J0, tL_error5, false);
                        m5Var2.i(null);
                        n0Var2.H2 = true;
                        n0Var2.I2 = false;
                        n0Var2.B1(true);
                        break;
                    } else if (tL_composedRichMessageWithAI == null) {
                        m5Var2.i(null);
                        n0Var2.H2 = true;
                        n0Var2.I2 = false;
                        n0Var2.B1(true);
                        break;
                    } else {
                        m5Var2.i(null);
                        n0Var2.I2 = false;
                        n0Var2.B1(true);
                        n0Var2.Y2[i11] = tL_messages_composeRichMessageWithAI;
                        if (i11 == 0) {
                            n0Var2.V1 = false;
                            n0Var2.X1 = tL_composedRichMessageWithAI.result;
                        } else if (i11 == 1) {
                            n0Var2.Y1 = false;
                            n0Var2.a2 = tL_composedRichMessageWithAI.result;
                        } else if (i11 == 2) {
                            n0Var2.b2 = false;
                            n0Var2.d2 = tL_composedRichMessageWithAI.result;
                        }
                        n0Var2.P2.O(true);
                        break;
                    }
                } else {
                    new org.telegram.ui.Components.lc(frameLayout2, n0Var2.J0).I(R.raw.star_premium_2, gd.N0(2131754989, null), org.telegram.messenger.g0.W2(gd.N0(2131754990, null))).j();
                    n0Var2.I2 = true;
                    n0Var2.B1(true);
                    break;
                }
                break;
            case 7:
                boolean[] zArr2 = (boolean[]) obj5;
                ArrayList arrayList2 = (ArrayList) obj4;
                q10 q10Var = (q10) obj3;
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
                        q10Var.a(TextUtils.join("", arrayList2), Boolean.FALSE);
                        break;
                    } else {
                        zArr2[0] = true;
                        q10Var.a(null, bool);
                        break;
                    }
                }
                break;
            case 8:
                Context context2 = (Context) obj4;
                org.telegram.ui.ActionBar.w2 w2Var = (org.telegram.ui.ActionBar.w2) obj3;
                TL_account.Passkey passkey = (TL_account.Passkey) obj;
                String str3 = (String) obj2;
                ((hi.e) obj5).setLoading(false);
                if (!"CANCELLED".equalsIgnoreCase(str3)) {
                    if ("EMPTY".equalsIgnoreCase(str3)) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context2);
                        String N0 = gd.N0(2131747438, null);
                        org.telegram.ui.ActionBar.t1 t1Var3 = alertDialog$Builder.a;
                        t1Var3.S = N0;
                        t1Var3.U = gd.N0(2131747439, null);
                        alertDialog$Builder.k(gd.N0(2131747637, null), null);
                        t1Var3.setOnDismissListener(new org.telegram.ui.q5(w2Var, 9));
                        alertDialog$Builder.p();
                        break;
                    } else {
                        org.telegram.ui.ActionBar.g2 T = LaunchActivity.T();
                        if (T != null) {
                            if (str3 != null) {
                                new org.telegram.ui.Components.lc(w2Var.F, w2Var.J0).f0(str3, false);
                                break;
                            } else if (passkey != null) {
                                mp.u1(i11).s4(0L, "SETUP_PASSKEY");
                                if (T instanceof PasskeysActivity) {
                                    w2Var.dismiss();
                                    ((PasskeysActivity) T).d0(passkey);
                                    break;
                                } else if (T instanceof PrivacySettingsActivity) {
                                    w2Var.dismiss();
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
                                    ConnectionsManager.getInstance(i11).sendRequestTyped(new TL_account.getPasskeys(), new d3.b(i10), new org.telegram.ui.m6(w2Var, passkey, str3, 3));
                                    break;
                                }
                            }
                        }
                    }
                }
                break;
            default:
                org.telegram.ui.ActionBar.h6 h6Var2 = (org.telegram.ui.ActionBar.h6) obj3;
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj;
                ((Runnable[]) obj5)[0] = null;
                TextView textView = ((TextView[]) obj4)[0];
                if (textView != null && wallettransaction != null) {
                    long j11 = wallettransaction.fee;
                    if (j11 > 0) {
                        textView.setText(org.telegram.ui.Wallet.n6.z0(i11, j11, h6Var2));
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ j0(Object obj, int i7, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = i7;
        this.d = obj2;
        this.e = obj3;
    }

    public /* synthetic */ j0(Object obj, Object obj2, int i7, Object obj3, int i10) {
        this.a = i10;
        this.c = obj;
        this.d = obj2;
        this.b = i7;
        this.e = obj3;
    }

    public /* synthetic */ j0(Object obj, Object obj2, Object obj3, int i7, int i10) {
        this.a = i10;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = i7;
    }

    public /* synthetic */ j0(org.telegram.ui.ActionBar.t1[] t1VarArr, org.telegram.ui.ActionBar.g2 g2Var, int i7, TLRPC.Chat chat) {
        this.a = 3;
        this.d = t1VarArr;
        this.c = g2Var;
        this.b = i7;
        this.e = chat;
    }
}
