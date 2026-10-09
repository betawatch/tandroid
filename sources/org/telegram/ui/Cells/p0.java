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
import org.telegram.messenger.bi;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.er;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
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
        long j3;
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
                org.telegram.ui.ActionBar.n2 T0 = t0Var != null ? t0Var.T0() : null;
                if (T0 == null) {
                    T0 = LaunchActivity.U();
                }
                if (T0 != null) {
                    T0.presentFragment(new org.telegram.ui.Wallet.a5());
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
                                    j3 = 0;
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
                                            MessagesController.getInstance(i12).removeSuggestion(j3, "WALLET_FIRST_INCOMING_TRANSFER");
                                            Context context = w0Var2.getContext();
                                            org.telegram.ui.ActionBar.e6 e6Var = w0Var2.g1;
                                            org.telegram.ui.ActionBar.f3 i14 = bi.i(1, context, e6Var, false);
                                            FrameLayout frameLayout = new FrameLayout(context);
                                            frameLayout.setBackground(org.telegram.ui.ActionBar.i6.c0(AndroidUtilities.dp(16.0f), org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.h5, e6Var)));
                                            frameLayout.setPadding(AndroidUtilities.dp(36.0f), 0, AndroidUtilities.dp(36.0f), AndroidUtilities.dp(14.0f));
                                            LinearLayout linearLayout = new LinearLayout(context);
                                            linearLayout.setOrientation(1);
                                            linearLayout.setGravity(1);
                                            frameLayout.addView(linearLayout, w7.x5.d(-2.0f, -1));
                                            linearLayout.addView(new org.telegram.ui.Wallet.c6(120, context, false), w7.x5.t(120, 120, 1, 0, 0, 0, -8));
                                            TextView textView = new TextView(context);
                                            textView.setText(LocaleController.getString(R.string.WalletFirstGrams));
                                            bi.o(org.telegram.ui.ActionBar.i6.j5, e6Var, textView, 1, 17.0f);
                                            textView.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM));
                                            textView.setGravity(17);
                                            TextView h = com.google.android.gms.internal.vision.e2.h(linearLayout, textView, w7.x5.t(-1, -2, 1, 0, 0, 0, 6), context);
                                            double d = MessagesController.getInstance(i12).config.tonUsdRate.get();
                                            if (d <= 0.0d || Double.isNaN(d) || Double.isInfinite(d)) {
                                                i10 = 1;
                                                string = LocaleController.getString(R.string.WalletFirstGramsActions);
                                            } else {
                                                i10 = 1;
                                                string = LocaleController.formatString(R.string.WalletFirstGramsRate, org.telegram.ui.Wallet.k0.q(1000000000L, false), String.format(LocaleController.getInstance().getCurrentLocale(), "%.2f", Double.valueOf(d)));
                                            }
                                            h.setText(string);
                                            bi.o(org.telegram.ui.ActionBar.i6.r5, e6Var, h, i10, 14.0f);
                                            h.setGravity(17);
                                            h.setLineSpacing(AndroidUtilities.dp(1.0f), 1.0f);
                                            linearLayout.addView(h, w7.x5.t(-1, -2, 1, 0, 0, 0, 24));
                                            org.telegram.ui.Wallet.r4 r4Var = new org.telegram.ui.Wallet.r4(context, e6Var);
                                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LocaleController.getString(R.string.WalletFirstGramsSendInfo));
                                            er erVar = new er(R.drawable.mini_attach, 2);
                                            erVar.setSize(AndroidUtilities.dp(14.0f));
                                            int indexOf = spannableStringBuilder.toString().indexOf("📎");
                                            spannableStringBuilder.setSpan(erVar, indexOf, indexOf + 2, 33);
                                            int indexOf2 = spannableStringBuilder.toString().indexOf("→");
                                            spannableStringBuilder.setSpan(new er(R.drawable.wallet_intro_arrow, 2), indexOf2, indexOf2 + 1, 33);
                                            r4Var.setPadding(AndroidUtilities.dp(0.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(0.0f), AndroidUtilities.dp(8.0f));
                                            r4Var.a(LocaleController.getString(R.string.WalletSend), spannableStringBuilder, R.drawable.wallet_intro_telegram);
                                            int i15 = org.telegram.ui.ActionBar.i6.n6;
                                            int w02 = org.telegram.ui.ActionBar.i6.w0(i15, e6Var);
                                            PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                                            r4Var.b.setColorFilter(new PorterDuffColorFilter(w02, mode));
                                            linearLayout.addView(r4Var, w7.x5.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
                                            org.telegram.ui.Wallet.r4 r4Var2 = new org.telegram.ui.Wallet.r4(context, e6Var);
                                            r4Var2.setPadding(AndroidUtilities.dp(0.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(0.0f), AndroidUtilities.dp(8.0f));
                                            r4Var2.a(LocaleController.getString(R.string.WalletTrade), LocaleController.getString(R.string.WalletFirstGramsTradeInfo), R.drawable.wallet_intro_trade);
                                            r4Var2.b.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.w0(i15, e6Var), mode));
                                            linearLayout.addView(r4Var2, w7.x5.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
                                            org.telegram.ui.Wallet.r4 r4Var3 = new org.telegram.ui.Wallet.r4(context, e6Var);
                                            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(LocaleController.getString(R.string.WalletFirstGramsStoreInfo));
                                            er erVar2 = new er(R.drawable.wallet_intro_chats, 2);
                                            int indexOf3 = spannableStringBuilder2.toString().indexOf("💬");
                                            spannableStringBuilder2.setSpan(erVar2, indexOf3, indexOf3 + 2, 33);
                                            int indexOf4 = spannableStringBuilder2.toString().indexOf("⋮");
                                            spannableStringBuilder2.setSpan(new er(R.drawable.wallet_intro_options, 2), indexOf4, indexOf4 + 1, 33);
                                            int indexOf5 = TextUtils.indexOf(spannableStringBuilder2, "→");
                                            while (indexOf5 >= 0) {
                                                int i16 = indexOf5 + 1;
                                                spannableStringBuilder2.setSpan(new er(R.drawable.wallet_intro_arrow, 2), indexOf5, i16, 33);
                                                indexOf5 = TextUtils.indexOf(spannableStringBuilder2, "→", i16);
                                            }
                                            r4Var3.setPadding(AndroidUtilities.dp(0.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(0.0f), AndroidUtilities.dp(8.0f));
                                            r4Var3.a(LocaleController.getString(R.string.WalletStore), spannableStringBuilder2, R.drawable.wallet_intro_store);
                                            r4Var3.b.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.n6, e6Var), PorterDuff.Mode.SRC_IN));
                                            linearLayout.addView(r4Var3, w7.x5.k(0.0f, 0.0f, 0.0f, 14.0f, -1, -2));
                                            ci.d f7 = bi.f(24, context, e6Var, true);
                                            f7.setText(LocaleController.getString(R.string.WalletGotIt));
                                            linearLayout.addView(f7, w7.x5.t(-1, 48, 1, 0, 0, 0, 0));
                                            w7.z5.b(f7, 0.02f, 1.1f);
                                            i14.customView = frameLayout;
                                            org.telegram.ui.ActionBar.f3[] f3VarArr = {i14};
                                            f3VarArr[0].setAllowNestedScroll(true);
                                            f3VarArr[0].fixNavigationBar();
                                            f7.setOnClickListener(new org.telegram.ui.Wallet.q3(f3VarArr, 0));
                                            f3VarArr[0].show();
                                            f3VarArr[0].setOnDismissListener(new org.telegram.messenger.video.f(w0Var2, wallettransaction2, p0Var, 8));
                                            break;
                                        }
                                    }
                                }
                            }
                            j3 = 0;
                            if (messageObject.messageOwner.random_id != 0) {
                                ArrayList arrayList = v.p;
                                int size = arrayList.size();
                                int i17 = 0;
                                while (i17 < size) {
                                    Object obj = arrayList.get(i17);
                                    i17++;
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
                    j3 = 0;
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
                    t0Var2.F1(w0Var3);
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
