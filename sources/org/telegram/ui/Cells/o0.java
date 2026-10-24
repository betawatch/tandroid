package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
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
import org.telegram.messenger.sl;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.xq;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final /* synthetic */ class o0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ v0 b;

    public /* synthetic */ o0(v0 v0Var, int i10) {
        this.a = i10;
        this.b = v0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0150  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        MessageObject messageObject;
        long j10;
        v0 v0Var;
        TL_wallet.walletTransaction wallettransaction;
        o0 o0Var;
        v0 v0Var2;
        int i10;
        String string;
        int i11 = this.a;
        v0 v0Var3 = this.b;
        switch (i11) {
            case 0:
                s0 s0Var = v0Var3.f1;
                org.telegram.ui.ActionBar.o2 L0 = s0Var != null ? s0Var.L0() : null;
                if (L0 == null) {
                    L0 = LaunchActivity.U();
                }
                if (L0 != null) {
                    L0.presentFragment(new org.telegram.ui.Wallet.o5());
                    break;
                }
                break;
            case 1:
                int i12 = v0Var3.H;
                if (v0Var3.L() && (messageObject = v0Var3.P0) != null && messageObject.messageOwner != null) {
                    org.telegram.ui.Wallet.l0 w9 = org.telegram.ui.Wallet.l0.w(i12);
                    TLRPC.TL_messageActionGramTransfer tL_messageActionGramTransfer = (TLRPC.TL_messageActionGramTransfer) messageObject.messageOwner.action;
                    boolean z10 = messageObject.isOutOwner() && messageObject.messageOwner.send_state == 2;
                    boolean z11 = messageObject.isOutOwner() && messageObject.messageOwner.send_state == 1;
                    v0Var3.playSoundEffect(0);
                    TLRPC.Message message = messageObject.messageOwner;
                    if (message != null) {
                        TLRPC.MessageAction messageAction = message.action;
                        if (messageAction instanceof TLRPC.TL_messageActionGramTransfer) {
                            TLRPC.TL_messageActionGramTransfer tL_messageActionGramTransfer2 = (TLRPC.TL_messageActionGramTransfer) messageAction;
                            if (!TextUtils.isEmpty(tL_messageActionGramTransfer2.transaction_id) && w9.n != null) {
                                for (int i13 = 0; i13 < w9.n.c.size(); i13++) {
                                    wallettransaction = (TL_wallet.walletTransaction) w9.n.c.get(i13);
                                    j10 = 0;
                                    if (TextUtils.equals(wallettransaction.id, tL_messageActionGramTransfer2.transaction_id)) {
                                        v0Var = v0Var3;
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
                                        v0Var2 = v0Var;
                                        o0Var = new o0(v0Var2, 0);
                                        if (!v0Var2.P0.isOutOwner() || !MessagesController.getInstance(i12).pendingSuggestions.contains("WALLET_FIRST_INCOMING_TRANSFER")) {
                                            org.telegram.ui.Wallet.o5.B0(v0Var2.getContext(), v0Var2.H, wallettransaction, null, null, null, o0Var, v0Var2.g1);
                                            break;
                                        } else {
                                            MessagesController.getInstance(i12).removeSuggestion(j10, "WALLET_FIRST_INCOMING_TRANSFER");
                                            Context context = v0Var2.getContext();
                                            org.telegram.ui.ActionBar.g6 g6Var = v0Var2.g1;
                                            org.telegram.ui.ActionBar.h3 j11 = sl.j(1, context, g6Var, false);
                                            FrameLayout frameLayout = new FrameLayout(context);
                                            int dp = AndroidUtilities.dp(16.0f);
                                            int i14 = org.telegram.ui.ActionBar.k6.h5;
                                            Drawable c02 = org.telegram.ui.ActionBar.k6.c0(dp, org.telegram.ui.ActionBar.k6.w0(i14, g6Var));
                                            org.telegram.ui.ActionBar.n6 O = org.telegram.ui.ActionBar.r6.O(i14);
                                            frameLayout.setBackground(c02);
                                            org.telegram.ui.ActionBar.r6.k(frameLayout, c02, O, null, g6Var);
                                            frameLayout.setPadding(AndroidUtilities.dp(36.0f), 0, AndroidUtilities.dp(36.0f), AndroidUtilities.dp(14.0f));
                                            LinearLayout linearLayout = new LinearLayout(context);
                                            linearLayout.setOrientation(1);
                                            linearLayout.setGravity(1);
                                            frameLayout.addView(linearLayout, w7.z5.c(-2.0f, -1));
                                            linearLayout.addView(new org.telegram.ui.Wallet.m6(120, context, false), w7.z5.t(120, 120, 1, 0, 0, 0, -8));
                                            TextView textView = new TextView(context);
                                            textView.setText(LocaleController.getString(R.string.WalletFirstGrams));
                                            org.telegram.ui.ActionBar.r6.W(textView, org.telegram.ui.ActionBar.k6.j5, g6Var);
                                            textView.setTextSize(1, 17.0f);
                                            textView.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM));
                                            textView.setGravity(17);
                                            TextView f7 = sl.f(linearLayout, textView, w7.z5.t(-1, -2, 1, 0, 0, 0, 6), context);
                                            double d = MessagesController.getInstance(i12).config.tonUsdRate.get();
                                            if (d <= 0.0d || Double.isNaN(d) || Double.isInfinite(d)) {
                                                i10 = 1;
                                                string = LocaleController.getString(R.string.WalletFirstGramsActions);
                                            } else {
                                                i10 = 1;
                                                string = LocaleController.formatString(R.string.WalletFirstGramsRate, org.telegram.ui.Wallet.l0.r(1000000000L, false), String.format(LocaleController.getInstance().getCurrentLocale(), "%.2f", Double.valueOf(d)));
                                            }
                                            f7.setText(string);
                                            org.telegram.ui.ActionBar.r6.W(f7, org.telegram.ui.ActionBar.k6.r5, g6Var);
                                            f7.setTextSize(i10, 14.0f);
                                            f7.setGravity(17);
                                            f7.setLineSpacing(AndroidUtilities.dp(1.0f), 1.0f);
                                            linearLayout.addView(f7, w7.z5.t(-1, -2, 1, 0, 0, 0, 24));
                                            org.telegram.ui.Wallet.f5 f5Var = new org.telegram.ui.Wallet.f5(context, g6Var);
                                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LocaleController.getString(R.string.WalletFirstGramsSendInfo));
                                            xq xqVar = new xq(R.drawable.mini_attach, 2);
                                            xqVar.setSize(AndroidUtilities.dp(14.0f));
                                            int indexOf = spannableStringBuilder.toString().indexOf("📎");
                                            spannableStringBuilder.setSpan(xqVar, indexOf, indexOf + 2, 33);
                                            int indexOf2 = spannableStringBuilder.toString().indexOf("→");
                                            spannableStringBuilder.setSpan(new xq(R.drawable.wallet_intro_arrow, 2), indexOf2, indexOf2 + 1, 33);
                                            f5Var.setPadding(AndroidUtilities.dp(0.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(0.0f), AndroidUtilities.dp(8.0f));
                                            f5Var.a(LocaleController.getString(R.string.WalletSend), spannableStringBuilder, R.drawable.wallet_intro_telegram);
                                            int i15 = org.telegram.ui.ActionBar.k6.n6;
                                            PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                                            org.telegram.ui.ActionBar.r6.t(f5Var.b, i15, g6Var, mode);
                                            linearLayout.addView(f5Var, w7.z5.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
                                            org.telegram.ui.Wallet.f5 f5Var2 = new org.telegram.ui.Wallet.f5(context, g6Var);
                                            f5Var2.setPadding(AndroidUtilities.dp(0.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(0.0f), AndroidUtilities.dp(8.0f));
                                            f5Var2.a(LocaleController.getString(R.string.WalletTrade), LocaleController.getString(R.string.WalletFirstGramsTradeInfo), R.drawable.wallet_intro_trade);
                                            org.telegram.ui.ActionBar.r6.t(f5Var2.b, i15, g6Var, mode);
                                            linearLayout.addView(f5Var2, w7.z5.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
                                            org.telegram.ui.Wallet.f5 f5Var3 = new org.telegram.ui.Wallet.f5(context, g6Var);
                                            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(LocaleController.getString(R.string.WalletFirstGramsStoreInfo));
                                            xq xqVar2 = new xq(R.drawable.wallet_intro_chats, 2);
                                            int indexOf3 = spannableStringBuilder2.toString().indexOf("💬");
                                            spannableStringBuilder2.setSpan(xqVar2, indexOf3, indexOf3 + 2, 33);
                                            int indexOf4 = spannableStringBuilder2.toString().indexOf("⋮");
                                            spannableStringBuilder2.setSpan(new xq(R.drawable.wallet_intro_options, 2), indexOf4, indexOf4 + 1, 33);
                                            int indexOf5 = TextUtils.indexOf(spannableStringBuilder2, "→");
                                            while (indexOf5 >= 0) {
                                                int i16 = indexOf5 + 1;
                                                spannableStringBuilder2.setSpan(new xq(R.drawable.wallet_intro_arrow, 2), indexOf5, i16, 33);
                                                indexOf5 = TextUtils.indexOf(spannableStringBuilder2, "→", i16);
                                            }
                                            f5Var3.setPadding(AndroidUtilities.dp(0.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(0.0f), AndroidUtilities.dp(8.0f));
                                            f5Var3.a(LocaleController.getString(R.string.WalletStore), spannableStringBuilder2, R.drawable.wallet_intro_store);
                                            org.telegram.ui.ActionBar.r6.t(f5Var3.b, org.telegram.ui.ActionBar.k6.n6, g6Var, PorterDuff.Mode.SRC_IN);
                                            linearLayout.addView(f5Var3, w7.z5.k(0.0f, 0.0f, 0.0f, 14.0f, -1, -2));
                                            ei.d g10 = sl.g(24, context, g6Var, true);
                                            g10.setText(LocaleController.getString(R.string.WalletGotIt));
                                            linearLayout.addView(g10, w7.z5.t(-1, 48, 1, 0, 0, 0, 0));
                                            w7.b6.b(g10, 0.02f, 1.1f);
                                            j11.customView = frameLayout;
                                            org.telegram.ui.ActionBar.h3[] h3VarArr = {j11};
                                            h3VarArr[0].setAllowNestedScroll(true);
                                            h3VarArr[0].fixNavigationBar();
                                            g10.setOnClickListener(new org.telegram.ui.Wallet.w3(h3VarArr, 0));
                                            h3VarArr[0].show();
                                            h3VarArr[0].setOnDismissListener(new ig.d2(v0Var2, wallettransaction, o0Var, 23));
                                            break;
                                        }
                                    }
                                }
                            }
                            j10 = 0;
                            if (messageObject.messageOwner.random_id != 0) {
                                ArrayList arrayList = w9.p;
                                int size = arrayList.size();
                                int i17 = 0;
                                while (i17 < size) {
                                    Object obj = arrayList.get(i17);
                                    i17++;
                                    TL_wallet.walletTransaction wallettransaction2 = (TL_wallet.walletTransaction) obj;
                                    v0Var = v0Var3;
                                    if (wallettransaction2.random_id == messageObject.messageOwner.random_id) {
                                        wallettransaction = wallettransaction2;
                                        if (wallettransaction == null) {
                                        }
                                        v0Var2 = v0Var;
                                        o0Var = new o0(v0Var2, 0);
                                        if (!v0Var2.P0.isOutOwner()) {
                                        }
                                        org.telegram.ui.Wallet.o5.B0(v0Var2.getContext(), v0Var2.H, wallettransaction, null, null, null, o0Var, v0Var2.g1);
                                    } else {
                                        v0Var3 = v0Var;
                                    }
                                }
                            }
                            v0Var = v0Var3;
                            wallettransaction = null;
                            if (wallettransaction == null) {
                            }
                            v0Var2 = v0Var;
                            o0Var = new o0(v0Var2, 0);
                            if (!v0Var2.P0.isOutOwner()) {
                            }
                            org.telegram.ui.Wallet.o5.B0(v0Var2.getContext(), v0Var2.H, wallettransaction, null, null, null, o0Var, v0Var2.g1);
                        }
                    }
                    v0Var = v0Var3;
                    wallettransaction = null;
                    j10 = 0;
                    if (wallettransaction == null) {
                    }
                    v0Var2 = v0Var;
                    o0Var = new o0(v0Var2, 0);
                    if (!v0Var2.P0.isOutOwner()) {
                    }
                    org.telegram.ui.Wallet.o5.B0(v0Var2.getContext(), v0Var2.H, wallettransaction, null, null, null, o0Var, v0Var2.g1);
                }
                break;
            case 2:
                v0Var3.M();
                break;
            case 3:
                s0 s0Var2 = v0Var3.f1;
                if (s0Var2 != null) {
                    s0Var2.t1(v0Var3);
                    break;
                }
                break;
            case 4:
                v0Var3.post(new o0(v0Var3, 6));
                break;
            case 5:
                v0Var3.requestLayout();
                break;
            default:
                v0Var3.G = false;
                v0Var3.getMessageObject().isSpoilersRevealed = true;
                ArrayList arrayList2 = v0Var3.s1.c;
                if (arrayList2 != null) {
                    arrayList2.clear();
                }
                v0Var3.invalidate();
                break;
        }
    }
}
