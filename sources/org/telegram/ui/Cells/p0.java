package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.sk;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.br;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final /* synthetic */ class p0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ w0 b;

    public /* synthetic */ p0(w0 w0Var, int i10) {
        this.a = i10;
        this.b = w0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0152  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        MessageObject messageObject;
        long j10;
        w0 w0Var;
        TL_wallet.walletTransaction wallettransaction;
        TL_wallet.walletTransaction wallettransaction2;
        p0 p0Var;
        w0 w0Var2;
        int i10;
        String string;
        int i11 = this.a;
        w0 w0Var3 = this.b;
        switch (i11) {
            case 0:
                t0 t0Var = w0Var3.f1;
                org.telegram.ui.ActionBar.m2 M0 = t0Var != null ? t0Var.M0() : null;
                if (M0 == null) {
                    M0 = LaunchActivity.U();
                }
                if (M0 != null) {
                    M0.presentFragment(new org.telegram.ui.Wallet.a5());
                    break;
                }
                break;
            case 1:
                int i12 = w0Var3.H;
                if (w0Var3.M() && (messageObject = w0Var3.P0) != null && messageObject.messageOwner != null) {
                    org.telegram.ui.Wallet.k0 v = org.telegram.ui.Wallet.k0.v(i12);
                    TLRPC.TL_messageActionGramTransfer tL_messageActionGramTransfer = (TLRPC.TL_messageActionGramTransfer) messageObject.messageOwner.action;
                    boolean z10 = messageObject.isOutOwner() && messageObject.messageOwner.send_state == 2;
                    boolean z11 = messageObject.isOutOwner() && messageObject.messageOwner.send_state == 1;
                    w0Var3.playSoundEffect(0);
                    TLRPC.Message message = messageObject.messageOwner;
                    if (message != null) {
                        TLRPC.MessageAction messageAction = message.action;
                        if (messageAction instanceof TLRPC.TL_messageActionGramTransfer) {
                            TLRPC.TL_messageActionGramTransfer tL_messageActionGramTransfer2 = (TLRPC.TL_messageActionGramTransfer) messageAction;
                            if (!TextUtils.isEmpty(tL_messageActionGramTransfer2.transaction_id) && v.n != null) {
                                for (int i13 = 0; i13 < v.n.c.size(); i13++) {
                                    wallettransaction = (TL_wallet.walletTransaction) v.n.c.get(i13);
                                    j10 = 0;
                                    if (TextUtils.equals(wallettransaction.id, tL_messageActionGramTransfer2.transaction_id)) {
                                        w0Var = w0Var3;
                                        if (wallettransaction == null) {
                                            if ((!z11 && !TextUtils.isEmpty(tL_messageActionGramTransfer.transaction_id)) || tL_messageActionGramTransfer.comment_encrypted_preparing) {
                                                wallettransaction = new TL_wallet.walletTransaction();
                                                wallettransaction.id = tL_messageActionGramTransfer.transaction_id;
                                                wallettransaction.failed = z10;
                                                wallettransaction.pending = z11;
                                                wallettransaction.incoming = !messageObject.isOutOwner();
                                                wallettransaction.comment = tL_messageActionGramTransfer.comment;
                                                wallettransaction.comment_encrypted = tL_messageActionGramTransfer.comment_encrypted;
                                                wallettransaction.comment_encrypted_preparing = tL_messageActionGramTransfer.comment_encrypted_preparing;
                                                wallettransaction.amount = tL_messageActionGramTransfer.amount;
                                                TL_wallet.walletTransactionPeerUser wallettransactionpeeruser = new TL_wallet.walletTransactionPeerUser();
                                                wallettransaction.peer = wallettransactionpeeruser;
                                                wallettransactionpeeruser.address = tL_messageActionGramTransfer.peer_address;
                                                wallettransactionpeeruser.user_id = messageObject.getDialogId();
                                                wallettransaction.preview = true;
                                                wallettransaction.date = messageObject.messageOwner.date;
                                            }
                                        }
                                        wallettransaction2 = wallettransaction;
                                        w0Var2 = w0Var;
                                        p0Var = new p0(w0Var2, 0);
                                        if (!w0Var2.P0.isOutOwner() || !MessagesController.getInstance(i12).pendingSuggestions.contains("WALLET_FIRST_INCOMING_TRANSFER")) {
                                            org.telegram.ui.Wallet.a5.s0(w0Var2.getContext(), w0Var2.H, wallettransaction2, null, null, null, p0Var, w0Var2.g1);
                                            break;
                                        } else {
                                            MessagesController.getInstance(i12).removeSuggestion(j10, "WALLET_FIRST_INCOMING_TRANSFER");
                                            Context context = w0Var2.getContext();
                                            org.telegram.ui.ActionBar.c6 c6Var = w0Var2.g1;
                                            org.telegram.ui.ActionBar.e3 i14 = sk.i(1, context, c6Var, false);
                                            FrameLayout frameLayout = new FrameLayout(context);
                                            frameLayout.setBackground(org.telegram.ui.ActionBar.g6.c0(AndroidUtilities.dp(16.0f), org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.h5, c6Var)));
                                            frameLayout.setPadding(AndroidUtilities.dp(36.0f), 0, AndroidUtilities.dp(36.0f), AndroidUtilities.dp(14.0f));
                                            LinearLayout linearLayout = new LinearLayout(context);
                                            linearLayout.setOrientation(1);
                                            linearLayout.setGravity(1);
                                            frameLayout.addView(linearLayout, w7.z5.d(-2.0f, -1));
                                            linearLayout.addView(new org.telegram.ui.Wallet.c6(120, context, false), w7.z5.t(120, 120, 1, 0, 0, 0, -8));
                                            TextView textView = new TextView(context);
                                            textView.setText(LocaleController.getString(R.string.WalletFirstGrams));
                                            sk.o(org.telegram.ui.ActionBar.g6.j5, c6Var, textView, 1, 17.0f);
                                            textView.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM));
                                            textView.setGravity(17);
                                            TextView i15 = com.google.android.gms.internal.play_billing.k3.i(linearLayout, textView, w7.z5.t(-1, -2, 1, 0, 0, 0, 6), context);
                                            double d = MessagesController.getInstance(i12).config.tonUsdRate.get();
                                            if (d <= 0.0d || Double.isNaN(d) || Double.isInfinite(d)) {
                                                i10 = 1;
                                                string = LocaleController.getString(R.string.WalletFirstGramsActions);
                                            } else {
                                                i10 = 1;
                                                string = LocaleController.formatString(R.string.WalletFirstGramsRate, org.telegram.ui.Wallet.k0.q(1000000000L, false), String.format(LocaleController.getInstance().getCurrentLocale(), "%.2f", Double.valueOf(d)));
                                            }
                                            i15.setText(string);
                                            sk.o(org.telegram.ui.ActionBar.g6.r5, c6Var, i15, i10, 14.0f);
                                            i15.setGravity(17);
                                            i15.setLineSpacing(AndroidUtilities.dp(1.0f), 1.0f);
                                            linearLayout.addView(i15, w7.z5.t(-1, -2, 1, 0, 0, 0, 24));
                                            org.telegram.ui.Wallet.s4 s4Var = new org.telegram.ui.Wallet.s4(context, c6Var);
                                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LocaleController.getString(R.string.WalletFirstGramsSendInfo));
                                            br brVar = new br(R.drawable.mini_attach, 2);
                                            brVar.setSize(AndroidUtilities.dp(14.0f));
                                            int indexOf = spannableStringBuilder.toString().indexOf("📎");
                                            spannableStringBuilder.setSpan(brVar, indexOf, indexOf + 2, 33);
                                            int indexOf2 = spannableStringBuilder.toString().indexOf("→");
                                            spannableStringBuilder.setSpan(new br(R.drawable.wallet_intro_arrow, 2), indexOf2, indexOf2 + 1, 33);
                                            s4Var.setPadding(AndroidUtilities.dp(0.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(0.0f), AndroidUtilities.dp(8.0f));
                                            s4Var.a(LocaleController.getString(R.string.WalletSend), spannableStringBuilder, R.drawable.wallet_intro_telegram);
                                            int i16 = org.telegram.ui.ActionBar.g6.n6;
                                            int w02 = org.telegram.ui.ActionBar.g6.w0(i16, c6Var);
                                            PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                                            s4Var.b.setColorFilter(new PorterDuffColorFilter(w02, mode));
                                            linearLayout.addView(s4Var, w7.z5.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
                                            org.telegram.ui.Wallet.s4 s4Var2 = new org.telegram.ui.Wallet.s4(context, c6Var);
                                            s4Var2.setPadding(AndroidUtilities.dp(0.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(0.0f), AndroidUtilities.dp(8.0f));
                                            s4Var2.a(LocaleController.getString(R.string.WalletTrade), LocaleController.getString(R.string.WalletFirstGramsTradeInfo), R.drawable.wallet_intro_trade);
                                            s4Var2.b.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(i16, c6Var), mode));
                                            linearLayout.addView(s4Var2, w7.z5.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
                                            org.telegram.ui.Wallet.s4 s4Var3 = new org.telegram.ui.Wallet.s4(context, c6Var);
                                            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(LocaleController.getString(R.string.WalletFirstGramsStoreInfo));
                                            br brVar2 = new br(R.drawable.wallet_intro_chats, 2);
                                            int indexOf3 = spannableStringBuilder2.toString().indexOf("💬");
                                            spannableStringBuilder2.setSpan(brVar2, indexOf3, indexOf3 + 2, 33);
                                            int indexOf4 = spannableStringBuilder2.toString().indexOf("⋮");
                                            spannableStringBuilder2.setSpan(new br(R.drawable.wallet_intro_options, 2), indexOf4, indexOf4 + 1, 33);
                                            int indexOf5 = TextUtils.indexOf(spannableStringBuilder2, "→");
                                            while (indexOf5 >= 0) {
                                                int i17 = indexOf5 + 1;
                                                spannableStringBuilder2.setSpan(new br(R.drawable.wallet_intro_arrow, 2), indexOf5, i17, 33);
                                                indexOf5 = TextUtils.indexOf(spannableStringBuilder2, "→", i17);
                                            }
                                            s4Var3.setPadding(AndroidUtilities.dp(0.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(0.0f), AndroidUtilities.dp(8.0f));
                                            s4Var3.a(LocaleController.getString(R.string.WalletStore), spannableStringBuilder2, R.drawable.wallet_intro_store);
                                            s4Var3.b.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.n6, c6Var), PorterDuff.Mode.SRC_IN));
                                            linearLayout.addView(s4Var3, w7.z5.k(0.0f, 0.0f, 0.0f, 14.0f, -1, -2));
                                            di.d f7 = sk.f(24, context, c6Var, true);
                                            f7.setText(LocaleController.getString(R.string.WalletGotIt));
                                            linearLayout.addView(f7, w7.z5.t(-1, 48, 1, 0, 0, 0, 0));
                                            w7.b6.b(f7, 0.02f, 1.1f);
                                            i14.customView = frameLayout;
                                            org.telegram.ui.ActionBar.e3[] e3VarArr = {i14};
                                            e3VarArr[0].setAllowNestedScroll(true);
                                            e3VarArr[0].fixNavigationBar();
                                            f7.setOnClickListener(new org.telegram.ui.Wallet.r3(e3VarArr, 0));
                                            e3VarArr[0].show();
                                            e3VarArr[0].setOnDismissListener(new org.telegram.messenger.video.f(w0Var2, wallettransaction2, p0Var, 8));
                                            break;
                                        }
                                    }
                                }
                            }
                            j10 = 0;
                            if (messageObject.messageOwner.random_id != 0) {
                                ArrayList arrayList = v.p;
                                int size = arrayList.size();
                                int i18 = 0;
                                while (i18 < size) {
                                    Object obj = arrayList.get(i18);
                                    i18++;
                                    TL_wallet.walletTransaction wallettransaction3 = (TL_wallet.walletTransaction) obj;
                                    w0Var = w0Var3;
                                    if (wallettransaction3.random_id == messageObject.messageOwner.random_id) {
                                        wallettransaction = wallettransaction3;
                                        if (wallettransaction == null) {
                                        }
                                        wallettransaction2 = wallettransaction;
                                        w0Var2 = w0Var;
                                        p0Var = new p0(w0Var2, 0);
                                        if (!w0Var2.P0.isOutOwner()) {
                                        }
                                        org.telegram.ui.Wallet.a5.s0(w0Var2.getContext(), w0Var2.H, wallettransaction2, null, null, null, p0Var, w0Var2.g1);
                                    } else {
                                        w0Var3 = w0Var;
                                    }
                                }
                            }
                            w0Var = w0Var3;
                            wallettransaction = null;
                            if (wallettransaction == null) {
                            }
                            wallettransaction2 = wallettransaction;
                            w0Var2 = w0Var;
                            p0Var = new p0(w0Var2, 0);
                            if (!w0Var2.P0.isOutOwner()) {
                            }
                            org.telegram.ui.Wallet.a5.s0(w0Var2.getContext(), w0Var2.H, wallettransaction2, null, null, null, p0Var, w0Var2.g1);
                        }
                    }
                    w0Var = w0Var3;
                    wallettransaction = null;
                    j10 = 0;
                    if (wallettransaction == null) {
                    }
                    wallettransaction2 = wallettransaction;
                    w0Var2 = w0Var;
                    p0Var = new p0(w0Var2, 0);
                    if (!w0Var2.P0.isOutOwner()) {
                    }
                    org.telegram.ui.Wallet.a5.s0(w0Var2.getContext(), w0Var2.H, wallettransaction2, null, null, null, p0Var, w0Var2.g1);
                }
                break;
            case 2:
                w0Var3.N();
                break;
            case 3:
                t0 t0Var2 = w0Var3.f1;
                if (t0Var2 != null) {
                    t0Var2.u1(w0Var3);
                    break;
                }
                break;
            case 4:
                w0Var3.post(new p0(w0Var3, 6));
                break;
            case 5:
                w0Var3.requestLayout();
                break;
            default:
                w0Var3.G = false;
                w0Var3.getMessageObject().isSpoilersRevealed = true;
                ArrayList arrayList2 = w0Var3.s1.c;
                if (arrayList2 != null) {
                    arrayList2.clear();
                }
                w0Var3.invalidate();
                break;
        }
    }
}
