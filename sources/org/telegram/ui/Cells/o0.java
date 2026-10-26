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
import org.telegram.messenger.vh;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.gb1;
import org.telegram.ui.Components.zq;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
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
                org.telegram.ui.ActionBar.r2 y3 = s0Var != null ? s0Var.y() : null;
                if (y3 == null) {
                    y3 = LaunchActivity.U();
                }
                if (y3 != null) {
                    y3.presentFragment(new org.telegram.ui.Wallet.m5());
                    break;
                }
                break;
            case 1:
                int i12 = v0Var3.H;
                if (v0Var3.L() && (messageObject = v0Var3.P0) != null && messageObject.messageOwner != null) {
                    org.telegram.ui.Wallet.l0 w10 = org.telegram.ui.Wallet.l0.w(i12);
                    TLRPC.TL_messageActionGramTransfer tL_messageActionGramTransfer = (TLRPC.TL_messageActionGramTransfer) messageObject.messageOwner.action;
                    boolean z10 = messageObject.isOutOwner() && messageObject.messageOwner.send_state == 2;
                    boolean z11 = messageObject.isOutOwner() && messageObject.messageOwner.send_state == 1;
                    v0Var3.playSoundEffect(0);
                    TLRPC.Message message = messageObject.messageOwner;
                    if (message != null) {
                        TLRPC.MessageAction messageAction = message.action;
                        if (messageAction instanceof TLRPC.TL_messageActionGramTransfer) {
                            TLRPC.TL_messageActionGramTransfer tL_messageActionGramTransfer2 = (TLRPC.TL_messageActionGramTransfer) messageAction;
                            if (!TextUtils.isEmpty(tL_messageActionGramTransfer2.transaction_id) && w10.n != null) {
                                for (int i13 = 0; i13 < w10.n.c.size(); i13++) {
                                    wallettransaction = (TL_wallet.walletTransaction) w10.n.c.get(i13);
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
                                            org.telegram.ui.Wallet.m5.C0(v0Var2.getContext(), v0Var2.H, wallettransaction, null, null, null, o0Var, v0Var2.g1);
                                            break;
                                        } else {
                                            MessagesController.getInstance(i12).removeSuggestion(j10, "WALLET_FIRST_INCOMING_TRANSFER");
                                            Context context = v0Var2.getContext();
                                            org.telegram.ui.ActionBar.u6 u6Var = v0Var2.g1;
                                            org.telegram.ui.ActionBar.k3 i14 = vh.i(1, context, u6Var, false);
                                            FrameLayout frameLayout = new FrameLayout(context);
                                            int dp = AndroidUtilities.dp(16.0f);
                                            int i15 = org.telegram.ui.ActionBar.y6.h5;
                                            Drawable c02 = org.telegram.ui.ActionBar.y6.c0(dp, org.telegram.ui.ActionBar.y6.w0(i15, u6Var));
                                            org.telegram.ui.ActionBar.b7 N = org.telegram.ui.ActionBar.f7.N(i15);
                                            frameLayout.setBackground(c02);
                                            org.telegram.ui.ActionBar.f7.k(frameLayout, c02, N, null, u6Var);
                                            frameLayout.setPadding(AndroidUtilities.dp(36.0f), 0, AndroidUtilities.dp(36.0f), AndroidUtilities.dp(14.0f));
                                            LinearLayout linearLayout = new LinearLayout(context);
                                            linearLayout.setOrientation(1);
                                            linearLayout.setGravity(1);
                                            frameLayout.addView(linearLayout, gb1.g(-2.0f, -1));
                                            linearLayout.addView(new org.telegram.ui.Wallet.l6(120, context, false), gb1.x(120, 120, 1, 0, 0, 0, -8));
                                            TextView textView = new TextView(context);
                                            textView.setText(LocaleController.getString(R.string.WalletFirstGrams));
                                            org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.j5, u6Var);
                                            textView.setTextSize(1, 17.0f);
                                            textView.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM));
                                            textView.setGravity(17);
                                            TextView e = vh.e(linearLayout, textView, gb1.x(-1, -2, 1, 0, 0, 0, 6), context);
                                            double d = MessagesController.getInstance(i12).config.tonUsdRate.get();
                                            if (d <= 0.0d || Double.isNaN(d) || Double.isInfinite(d)) {
                                                i10 = 1;
                                                string = LocaleController.getString(R.string.WalletFirstGramsActions);
                                            } else {
                                                i10 = 1;
                                                string = LocaleController.formatString(R.string.WalletFirstGramsRate, org.telegram.ui.Wallet.l0.r(1000000000L, false), String.format(LocaleController.getInstance().getCurrentLocale(), "%.2f", Double.valueOf(d)));
                                            }
                                            e.setText(string);
                                            org.telegram.ui.ActionBar.f7.V(e, org.telegram.ui.ActionBar.y6.r5, u6Var);
                                            e.setTextSize(i10, 14.0f);
                                            e.setGravity(17);
                                            e.setLineSpacing(AndroidUtilities.dp(1.0f), 1.0f);
                                            linearLayout.addView(e, gb1.x(-1, -2, 1, 0, 0, 0, 24));
                                            org.telegram.ui.Wallet.d5 d5Var = new org.telegram.ui.Wallet.d5(context, u6Var);
                                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LocaleController.getString(R.string.WalletFirstGramsSendInfo));
                                            zq zqVar = new zq(R.drawable.mini_attach, 2);
                                            zqVar.setSize(AndroidUtilities.dp(14.0f));
                                            int indexOf = spannableStringBuilder.toString().indexOf("📎");
                                            spannableStringBuilder.setSpan(zqVar, indexOf, indexOf + 2, 33);
                                            int indexOf2 = spannableStringBuilder.toString().indexOf("→");
                                            spannableStringBuilder.setSpan(new zq(R.drawable.wallet_intro_arrow, 2), indexOf2, indexOf2 + 1, 33);
                                            d5Var.setPadding(AndroidUtilities.dp(0.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(0.0f), AndroidUtilities.dp(8.0f));
                                            d5Var.a(LocaleController.getString(R.string.WalletSend), spannableStringBuilder, R.drawable.wallet_intro_telegram);
                                            int i16 = org.telegram.ui.ActionBar.y6.n6;
                                            PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                                            org.telegram.ui.ActionBar.f7.t(d5Var.b, i16, u6Var, mode);
                                            linearLayout.addView(d5Var, gb1.o(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
                                            org.telegram.ui.Wallet.d5 d5Var2 = new org.telegram.ui.Wallet.d5(context, u6Var);
                                            d5Var2.setPadding(AndroidUtilities.dp(0.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(0.0f), AndroidUtilities.dp(8.0f));
                                            d5Var2.a(LocaleController.getString(R.string.WalletTrade), LocaleController.getString(R.string.WalletFirstGramsTradeInfo), R.drawable.wallet_intro_trade);
                                            org.telegram.ui.ActionBar.f7.t(d5Var2.b, i16, u6Var, mode);
                                            linearLayout.addView(d5Var2, gb1.o(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
                                            org.telegram.ui.Wallet.d5 d5Var3 = new org.telegram.ui.Wallet.d5(context, u6Var);
                                            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(LocaleController.getString(R.string.WalletFirstGramsStoreInfo));
                                            zq zqVar2 = new zq(R.drawable.wallet_intro_chats, 2);
                                            int indexOf3 = spannableStringBuilder2.toString().indexOf("💬");
                                            spannableStringBuilder2.setSpan(zqVar2, indexOf3, indexOf3 + 2, 33);
                                            int indexOf4 = spannableStringBuilder2.toString().indexOf("⋮");
                                            spannableStringBuilder2.setSpan(new zq(R.drawable.wallet_intro_options, 2), indexOf4, indexOf4 + 1, 33);
                                            int indexOf5 = TextUtils.indexOf(spannableStringBuilder2, "→");
                                            while (indexOf5 >= 0) {
                                                int i17 = indexOf5 + 1;
                                                spannableStringBuilder2.setSpan(new zq(R.drawable.wallet_intro_arrow, 2), indexOf5, i17, 33);
                                                indexOf5 = TextUtils.indexOf(spannableStringBuilder2, "→", i17);
                                            }
                                            d5Var3.setPadding(AndroidUtilities.dp(0.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(0.0f), AndroidUtilities.dp(8.0f));
                                            d5Var3.a(LocaleController.getString(R.string.WalletStore), spannableStringBuilder2, R.drawable.wallet_intro_store);
                                            org.telegram.ui.ActionBar.f7.t(d5Var3.b, org.telegram.ui.ActionBar.y6.n6, u6Var, PorterDuff.Mode.SRC_IN);
                                            linearLayout.addView(d5Var3, gb1.o(0.0f, 0.0f, 0.0f, 14.0f, -1, -2));
                                            fi.d f7 = vh.f(24, context, u6Var, true);
                                            f7.setText(LocaleController.getString(R.string.WalletGotIt));
                                            linearLayout.addView(f7, gb1.x(-1, 48, 1, 0, 0, 0, 0));
                                            gb1.c(f7, 0.02f, 1.1f);
                                            i14.customView = frameLayout;
                                            org.telegram.ui.ActionBar.k3[] k3VarArr = {i14};
                                            k3VarArr[0].setAllowNestedScroll(true);
                                            k3VarArr[0].fixNavigationBar();
                                            f7.setOnClickListener(new org.telegram.ui.Wallet.w3(k3VarArr, 0));
                                            k3VarArr[0].show();
                                            k3VarArr[0].setOnDismissListener(new jg.f1((Object) v0Var2, (Object) wallettransaction, (Object) o0Var, 24));
                                            break;
                                        }
                                    }
                                }
                            }
                            j10 = 0;
                            if (messageObject.messageOwner.random_id != 0) {
                                ArrayList arrayList = w10.p;
                                int size = arrayList.size();
                                int i18 = 0;
                                while (i18 < size) {
                                    Object obj = arrayList.get(i18);
                                    i18++;
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
                                        org.telegram.ui.Wallet.m5.C0(v0Var2.getContext(), v0Var2.H, wallettransaction, null, null, null, o0Var, v0Var2.g1);
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
                            org.telegram.ui.Wallet.m5.C0(v0Var2.getContext(), v0Var2.H, wallettransaction, null, null, null, o0Var, v0Var2.g1);
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
                    org.telegram.ui.Wallet.m5.C0(v0Var2.getContext(), v0Var2.H, wallettransaction, null, null, null, o0Var, v0Var2.g1);
                }
                break;
            case 2:
                v0Var3.M();
                break;
            case 3:
                s0 s0Var2 = v0Var3.f1;
                if (s0Var2 != null) {
                    s0Var2.l0(v0Var3);
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
