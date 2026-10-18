package org.telegram.ui.Wallet;

import ai.xb;
import android.content.Context;
import android.content.DialogInterface;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.c91;
import org.telegram.ui.Components.ca0;
import org.telegram.ui.Components.j01;
import org.telegram.ui.Components.xa;
import org.telegram.ui.Components.yq;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes4.dex */
public final /* synthetic */ class x3 implements Utilities.Callback {
    public final /* synthetic */ LinearLayout a;
    public final /* synthetic */ p4 b;
    public final /* synthetic */ org.telegram.ui.ActionBar.d6 c;
    public final /* synthetic */ int d;
    public final /* synthetic */ TextView e;
    public final /* synthetic */ k2[] f;
    public final /* synthetic */ j01 g;
    public final /* synthetic */ Utilities.Callback3 h;
    public final /* synthetic */ Context i;
    public final /* synthetic */ TextView[] j;
    public final /* synthetic */ int k;
    public final /* synthetic */ SpannableString[] l;

    public /* synthetic */ x3(LinearLayout linearLayout, p4 p4Var, org.telegram.ui.ActionBar.d6 d6Var, int i10, TextView textView, k2[] k2VarArr, j01 j01Var, Utilities.Callback3 callback3, Context context, TextView[] textViewArr, int i11, SpannableString[] spannableStringArr) {
        this.a = linearLayout;
        this.b = p4Var;
        this.c = d6Var;
        this.d = i10;
        this.e = textView;
        this.f = k2VarArr;
        this.g = j01Var;
        this.h = callback3;
        this.i = context;
        this.j = textViewArr;
        this.k = i11;
        this.l = spannableStringArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v2, types: [org.telegram.ui.Wallet.e4] */
    /* JADX WARN: Type inference failed for: r26v1, types: [org.telegram.ui.Components.j01] */
    /* JADX WARN: Type inference failed for: r3v37, types: [org.telegram.ui.Wallet.d4] */
    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        boolean z10;
        boolean z11;
        long j10;
        k2 k2Var;
        xa xaVar;
        k2 k2Var2;
        xa xaVar2;
        final k2[] k2VarArr;
        j01 j01Var;
        CharSequence charSequence;
        char c10;
        boolean z12;
        int i10;
        char c11;
        k2 k2Var3;
        xa xaVar3;
        TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj;
        long abs = Math.abs(wallettransaction.amount);
        boolean z13 = wallettransaction.incoming;
        long abs2 = Math.abs(wallettransaction.fee);
        boolean z14 = wallettransaction.pending || wallettransaction.failed;
        LinearLayout linearLayout = this.a;
        boolean z15 = ((linearLayout.getParent() instanceof View) && (linearLayout.getParent().getParent() instanceof c91) && ((c91) linearLayout.getParent().getParent()).getViewPages()[0] != linearLayout.getParent()) ? false : true;
        boolean z16 = wallettransaction.key_change;
        org.telegram.ui.ActionBar.d6 d6Var = this.c;
        int i11 = this.d;
        k2[] k2VarArr2 = this.f;
        final int i12 = 1;
        if (z16 || wallettransaction.nft != null) {
            z10 = z13;
            z11 = z14;
            boolean z17 = z15;
            j10 = abs2;
            if (!z16) {
                TL_wallet.nftItem nftitem = wallettransaction.nft;
                if (nftitem != null && z17 && (k2Var = k2VarArr2[0]) != null && (xaVar = k2Var.e) != null) {
                    xaVar.setTitle(TextUtils.isEmpty(nftitem.name) ? LocaleController.getString(R.string.WalletCollectible) : wallettransaction.nft.name);
                }
            } else if (z17 && (k2Var2 = k2VarArr2[0]) != null && (xaVar2 = k2Var2.e) != null) {
                xaVar2.setTitle(m0.k("Grams", m0.p(m0.n(abs, false), 0.75f), R.string.Grams_other));
            }
        } else {
            int w02 = z14 ? org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.z6, d6Var) : org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Oh, d6Var);
            p4 p4Var = this.b;
            p4Var.setTextColor(w02);
            SpannableStringBuilder p5 = m0.p(m0.n(abs, false), 0.75f);
            z10 = z13;
            p5.insert(0, (CharSequence) (z13 ? "+" : "–"));
            if (z14) {
                z11 = z14;
                z12 = z15;
            } else {
                z11 = z14;
                z12 = z15;
                p5.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.h6.w0(z10 ? org.telegram.ui.ActionBar.h6.uj : org.telegram.ui.ActionBar.h6.G6, d6Var)), 0, p5.length(), 33);
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) m0.k("Grams", p5, R.string.Grams_other));
            int indexOf = TextUtils.indexOf(spannableStringBuilder, p5);
            int length = p5.length() + indexOf;
            if (indexOf > 0) {
                j10 = abs2;
                i10 = 33;
                spannableStringBuilder.setSpan(new RelativeSizeSpan(0.75f), 0, indexOf, 33);
            } else {
                j10 = abs2;
                i10 = 33;
            }
            if (indexOf >= 0 && length < spannableStringBuilder.length()) {
                spannableStringBuilder.setSpan(new RelativeSizeSpan(0.75f), length, spannableStringBuilder.length(), i10);
            }
            p4Var.setText(spannableStringBuilder);
            CharSequence l4 = m0.w(i11).l(abs, false);
            TextView textView = this.e;
            if (z11) {
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(wallettransaction.failed ? LocaleController.getString(R.string.WalletFailed) : ci.fa.a(textView, LocaleController.getString(R.string.WalletSending)));
                c11 = 0;
                spannableStringBuilder2.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.h6.w0(wallettransaction.failed ? org.telegram.ui.ActionBar.h6.p7 : org.telegram.ui.ActionBar.h6.n6, d6Var)), 0, spannableStringBuilder2.length(), 33);
                textView.setText(LocaleController.formatSpannable(R.string.WalletTransactionAmountStatus, l4, spannableStringBuilder2));
            } else {
                c11 = 0;
                textView.setText(l4);
            }
            if (z12 && (k2Var3 = k2VarArr2[c11]) != null && (xaVar3 = k2Var3.e) != null) {
                xaVar3.setTitle(m0.k("Grams", p5, R.string.Grams_other));
            }
        }
        j01 j01Var2 = this.g;
        j01Var2.removeAllViews();
        final TL_wallet.WalletTransactionPeer walletTransactionPeer = wallettransaction.peer;
        boolean z18 = walletTransactionPeer instanceof TL_wallet.walletTransactionPeerUser;
        Utilities.Callback3 callback3 = this.h;
        if (z18) {
            TL_wallet.walletTransactionPeerUser wallettransactionpeeruser = (TL_wallet.walletTransactionPeerUser) walletTransactionPeer;
            TLRPC.User user = MessagesController.getInstance(i11).getUser(Long.valueOf(wallettransactionpeeruser.user_id));
            if (user == null || UserObject.isService(user.id)) {
                k2VarArr = k2VarArr2;
            } else {
                k2VarArr = k2VarArr2;
                j01Var2.m(LocaleController.getString(z10 ? R.string.WalletSender : R.string.WalletRecipient), i11, wallettransactionpeeruser.user_id, new h(callback3, k2VarArr2, wallettransactionpeeruser, 10), LocaleController.getString(R.string.WalletSend), callback3 != null ? null : new v3(4, k2VarArr2, user));
            }
            j01Var = j01Var2;
            if (!TextUtils.isEmpty(wallettransactionpeeruser.domain)) {
                j01Var = j01Var2;
                if (!TextUtils.isEmpty(wallettransactionpeeruser.address)) {
                    j01Var2.i(LocaleController.getString(R.string.WalletDomain), wallettransactionpeeruser.domain, new h(k2VarArr, user, wallettransactionpeeruser, 11));
                    j01Var = j01Var2;
                }
            }
        } else {
            k2VarArr = k2VarArr2;
            if (walletTransactionPeer instanceof TL_wallet.walletTransactionPeerChannel) {
                if (MessagesController.getInstance(i11).getChat(Long.valueOf(walletTransactionPeer.channel_id)) != null) {
                    j01Var2.n(LocaleController.getString(z10 ? R.string.WalletSender : R.string.WalletRecipient), i11, -walletTransactionPeer.channel_id, new h(callback3, k2VarArr, walletTransactionPeer, 12));
                }
                j01Var = j01Var2;
                if (!TextUtils.isEmpty(walletTransactionPeer.domain)) {
                    j01Var = j01Var2;
                    if (!TextUtils.isEmpty(walletTransactionPeer.address)) {
                        final int i13 = 0;
                        j01Var2.i(LocaleController.getString(R.string.WalletDomain), walletTransactionPeer.domain, new Runnable() { // from class: org.telegram.ui.Wallet.d4
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i13) {
                                    case 0:
                                        k2[] k2VarArr3 = k2VarArr;
                                        k2 k2Var4 = k2VarArr3[0];
                                        final int i14 = 1;
                                        final TL_wallet.WalletTransactionPeer walletTransactionPeer2 = walletTransactionPeer;
                                        k2Var4.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: org.telegram.ui.Wallet.f4
                                            @Override // android.content.DialogInterface.OnDismissListener
                                            public final void onDismiss(DialogInterface dialogInterface) {
                                                switch (i14) {
                                                    case 0:
                                                        org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                                                        if (U != null) {
                                                            U.presentFragment(new i9(walletTransactionPeer2.address));
                                                            break;
                                                        }
                                                        break;
                                                    default:
                                                        org.telegram.ui.ActionBar.n2 U2 = LaunchActivity.U();
                                                        if (U2 != null) {
                                                            TL_wallet.WalletTransactionPeer walletTransactionPeer3 = walletTransactionPeer2;
                                                            i9 i9Var = new i9(walletTransactionPeer3.address);
                                                            i9Var.u0(walletTransactionPeer3.domain);
                                                            U2.presentFragment(i9Var);
                                                            break;
                                                        }
                                                        break;
                                                }
                                            }
                                        });
                                        k2VarArr3[0].dismiss();
                                        break;
                                    default:
                                        k2[] k2VarArr4 = k2VarArr;
                                        k2 k2Var5 = k2VarArr4[0];
                                        final int i15 = 0;
                                        final TL_wallet.WalletTransactionPeer walletTransactionPeer3 = walletTransactionPeer;
                                        k2Var5.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: org.telegram.ui.Wallet.f4
                                            @Override // android.content.DialogInterface.OnDismissListener
                                            public final void onDismiss(DialogInterface dialogInterface) {
                                                switch (i15) {
                                                    case 0:
                                                        org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                                                        if (U != null) {
                                                            U.presentFragment(new i9(walletTransactionPeer3.address));
                                                            break;
                                                        }
                                                        break;
                                                    default:
                                                        org.telegram.ui.ActionBar.n2 U2 = LaunchActivity.U();
                                                        if (U2 != null) {
                                                            TL_wallet.WalletTransactionPeer walletTransactionPeer32 = walletTransactionPeer3;
                                                            i9 i9Var = new i9(walletTransactionPeer32.address);
                                                            i9Var.u0(walletTransactionPeer32.domain);
                                                            U2.presentFragment(i9Var);
                                                            break;
                                                        }
                                                        break;
                                                }
                                            }
                                        });
                                        k2VarArr4[0].dismiss();
                                        break;
                                }
                            }
                        });
                        j01Var = j01Var2;
                    }
                }
            } else {
                j01Var = j01Var2;
                if (walletTransactionPeer instanceof TL_wallet.walletTransactionPeerAddress) {
                    final TL_wallet.walletTransactionPeerAddress wallettransactionpeeraddress = (TL_wallet.walletTransactionPeerAddress) walletTransactionPeer;
                    j01Var = j01Var2;
                    if (!TextUtils.isEmpty(wallettransactionpeeraddress.domain)) {
                        if (TextUtils.isEmpty(wallettransactionpeeraddress.address)) {
                            j01Var2.i(LocaleController.getString(z10 ? R.string.WalletSender : R.string.WalletRecipient), wallettransactionpeeraddress.domain, new ah.j(22));
                            j01Var = j01Var2;
                        } else {
                            final int i14 = 0;
                            j01Var2.h(LocaleController.getString(z10 ? R.string.WalletSender : R.string.WalletRecipient), wallettransactionpeeraddress.domain, new Runnable() { // from class: org.telegram.ui.Wallet.e4
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i14) {
                                        case 0:
                                            k2[] k2VarArr3 = k2VarArr;
                                            k2 k2Var4 = k2VarArr3[0];
                                            final int i15 = 0;
                                            final TL_wallet.walletTransactionPeerAddress wallettransactionpeeraddress2 = wallettransactionpeeraddress;
                                            k2Var4.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: org.telegram.ui.Wallet.g4
                                                @Override // android.content.DialogInterface.OnDismissListener
                                                public final void onDismiss(DialogInterface dialogInterface) {
                                                    switch (i15) {
                                                        case 0:
                                                            org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                                                            if (U != null) {
                                                                TL_wallet.walletTransactionPeerAddress wallettransactionpeeraddress3 = wallettransactionpeeraddress2;
                                                                i9 i9Var = new i9(wallettransactionpeeraddress3.address);
                                                                i9Var.u0(wallettransactionpeeraddress3.domain);
                                                                U.presentFragment(i9Var);
                                                                break;
                                                            }
                                                            break;
                                                        default:
                                                            org.telegram.ui.ActionBar.n2 U2 = LaunchActivity.U();
                                                            if (U2 != null) {
                                                                TL_wallet.walletTransactionPeerAddress wallettransactionpeeraddress4 = wallettransactionpeeraddress2;
                                                                i9 i9Var2 = new i9(wallettransactionpeeraddress4.address);
                                                                i9Var2.u0(wallettransactionpeeraddress4.domain);
                                                                U2.presentFragment(i9Var2);
                                                                break;
                                                            }
                                                            break;
                                                    }
                                                }
                                            });
                                            k2VarArr3[0].dismiss();
                                            break;
                                        default:
                                            k2[] k2VarArr4 = k2VarArr;
                                            k2 k2Var5 = k2VarArr4[0];
                                            final int i16 = 1;
                                            final TL_wallet.walletTransactionPeerAddress wallettransactionpeeraddress3 = wallettransactionpeeraddress;
                                            k2Var5.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: org.telegram.ui.Wallet.g4
                                                @Override // android.content.DialogInterface.OnDismissListener
                                                public final void onDismiss(DialogInterface dialogInterface) {
                                                    switch (i16) {
                                                        case 0:
                                                            org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                                                            if (U != null) {
                                                                TL_wallet.walletTransactionPeerAddress wallettransactionpeeraddress32 = wallettransactionpeeraddress3;
                                                                i9 i9Var = new i9(wallettransactionpeeraddress32.address);
                                                                i9Var.u0(wallettransactionpeeraddress32.domain);
                                                                U.presentFragment(i9Var);
                                                                break;
                                                            }
                                                            break;
                                                        default:
                                                            org.telegram.ui.ActionBar.n2 U2 = LaunchActivity.U();
                                                            if (U2 != null) {
                                                                TL_wallet.walletTransactionPeerAddress wallettransactionpeeraddress4 = wallettransactionpeeraddress3;
                                                                i9 i9Var2 = new i9(wallettransactionpeeraddress4.address);
                                                                i9Var2.u0(wallettransactionpeeraddress4.domain);
                                                                U2.presentFragment(i9Var2);
                                                                break;
                                                            }
                                                            break;
                                                    }
                                                }
                                            });
                                            k2VarArr4[0].dismiss();
                                            break;
                                    }
                                }
                            }, LocaleController.getString(R.string.WalletSend), callback3 != null ? null : new Runnable() { // from class: org.telegram.ui.Wallet.e4
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i12) {
                                        case 0:
                                            k2[] k2VarArr3 = k2VarArr;
                                            k2 k2Var4 = k2VarArr3[0];
                                            final int i15 = 0;
                                            final TL_wallet.walletTransactionPeerAddress wallettransactionpeeraddress2 = wallettransactionpeeraddress;
                                            k2Var4.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: org.telegram.ui.Wallet.g4
                                                @Override // android.content.DialogInterface.OnDismissListener
                                                public final void onDismiss(DialogInterface dialogInterface) {
                                                    switch (i15) {
                                                        case 0:
                                                            org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                                                            if (U != null) {
                                                                TL_wallet.walletTransactionPeerAddress wallettransactionpeeraddress32 = wallettransactionpeeraddress2;
                                                                i9 i9Var = new i9(wallettransactionpeeraddress32.address);
                                                                i9Var.u0(wallettransactionpeeraddress32.domain);
                                                                U.presentFragment(i9Var);
                                                                break;
                                                            }
                                                            break;
                                                        default:
                                                            org.telegram.ui.ActionBar.n2 U2 = LaunchActivity.U();
                                                            if (U2 != null) {
                                                                TL_wallet.walletTransactionPeerAddress wallettransactionpeeraddress4 = wallettransactionpeeraddress2;
                                                                i9 i9Var2 = new i9(wallettransactionpeeraddress4.address);
                                                                i9Var2.u0(wallettransactionpeeraddress4.domain);
                                                                U2.presentFragment(i9Var2);
                                                                break;
                                                            }
                                                            break;
                                                    }
                                                }
                                            });
                                            k2VarArr3[0].dismiss();
                                            break;
                                        default:
                                            k2[] k2VarArr4 = k2VarArr;
                                            k2 k2Var5 = k2VarArr4[0];
                                            final int i16 = 1;
                                            final TL_wallet.walletTransactionPeerAddress wallettransactionpeeraddress3 = wallettransactionpeeraddress;
                                            k2Var5.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: org.telegram.ui.Wallet.g4
                                                @Override // android.content.DialogInterface.OnDismissListener
                                                public final void onDismiss(DialogInterface dialogInterface) {
                                                    switch (i16) {
                                                        case 0:
                                                            org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                                                            if (U != null) {
                                                                TL_wallet.walletTransactionPeerAddress wallettransactionpeeraddress32 = wallettransactionpeeraddress3;
                                                                i9 i9Var = new i9(wallettransactionpeeraddress32.address);
                                                                i9Var.u0(wallettransactionpeeraddress32.domain);
                                                                U.presentFragment(i9Var);
                                                                break;
                                                            }
                                                            break;
                                                        default:
                                                            org.telegram.ui.ActionBar.n2 U2 = LaunchActivity.U();
                                                            if (U2 != null) {
                                                                TL_wallet.walletTransactionPeerAddress wallettransactionpeeraddress4 = wallettransactionpeeraddress3;
                                                                i9 i9Var2 = new i9(wallettransactionpeeraddress4.address);
                                                                i9Var2.u0(wallettransactionpeeraddress4.domain);
                                                                U2.presentFragment(i9Var2);
                                                                break;
                                                            }
                                                            break;
                                                    }
                                                }
                                            });
                                            k2VarArr4[0].dismiss();
                                            break;
                                    }
                                }
                            });
                            j01Var = j01Var2;
                        }
                    }
                }
            }
        }
        final TL_wallet.WalletTransactionPeer walletTransactionPeer2 = wallettransaction.peer;
        boolean z19 = walletTransactionPeer2 instanceof TL_wallet.walletTransactionPeerUser;
        if (z19 || (walletTransactionPeer2 instanceof TL_wallet.walletTransactionPeerChannel) || (walletTransactionPeer2 instanceof TL_wallet.walletTransactionPeerAddress)) {
            boolean z20 = callback3 == null && !(z19 && MessagesController.getInstance(i11).getUser(Long.valueOf(walletTransactionPeer2.user_id)) != null && !UserObject.isService(walletTransactionPeer2.user_id)) && TextUtils.isEmpty(walletTransactionPeer2.domain) && !TextUtils.isEmpty(walletTransactionPeer2.address);
            String string = LocaleController.getString(R.string.WalletAddress);
            String str = walletTransactionPeer2.address;
            v3 v3Var = new v3(5, k2VarArr, d6Var);
            if (TextUtils.isEmpty(str)) {
                charSequence = LocaleController.getString(R.string.WalletUnknown);
            } else {
                SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder();
                for (int i15 = 0; i15 < str.length(); i15++) {
                    if (i15 > 0 && i15 % 4 == 0) {
                        spannableStringBuilder3.append(i15 % 16 == 0 ? '\n' : ' ');
                        spannableStringBuilder3.length();
                    }
                    spannableStringBuilder3.append(str.charAt(i15));
                    if (i15 % 4 == 3) {
                        spannableStringBuilder3.length();
                    }
                }
                spannableStringBuilder3.setSpan(new org.telegram.ui.Cells.i(str, v3Var, 9), 0, spannableStringBuilder3.length(), 33);
                charSequence = spannableStringBuilder3;
            }
            final int i16 = 1;
            j01Var.j(string, charSequence, 14, null, z20 ? LocaleController.getString(R.string.WalletSend) : null, new Runnable() { // from class: org.telegram.ui.Wallet.d4
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i16) {
                        case 0:
                            k2[] k2VarArr3 = k2VarArr;
                            k2 k2Var4 = k2VarArr3[0];
                            final int i142 = 1;
                            final TL_wallet.WalletTransactionPeer walletTransactionPeer22 = walletTransactionPeer2;
                            k2Var4.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: org.telegram.ui.Wallet.f4
                                @Override // android.content.DialogInterface.OnDismissListener
                                public final void onDismiss(DialogInterface dialogInterface) {
                                    switch (i142) {
                                        case 0:
                                            org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                                            if (U != null) {
                                                U.presentFragment(new i9(walletTransactionPeer22.address));
                                                break;
                                            }
                                            break;
                                        default:
                                            org.telegram.ui.ActionBar.n2 U2 = LaunchActivity.U();
                                            if (U2 != null) {
                                                TL_wallet.WalletTransactionPeer walletTransactionPeer32 = walletTransactionPeer22;
                                                i9 i9Var = new i9(walletTransactionPeer32.address);
                                                i9Var.u0(walletTransactionPeer32.domain);
                                                U2.presentFragment(i9Var);
                                                break;
                                            }
                                            break;
                                    }
                                }
                            });
                            k2VarArr3[0].dismiss();
                            break;
                        default:
                            k2[] k2VarArr4 = k2VarArr;
                            k2 k2Var5 = k2VarArr4[0];
                            final int i152 = 0;
                            final TL_wallet.WalletTransactionPeer walletTransactionPeer3 = walletTransactionPeer2;
                            k2Var5.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: org.telegram.ui.Wallet.f4
                                @Override // android.content.DialogInterface.OnDismissListener
                                public final void onDismiss(DialogInterface dialogInterface) {
                                    switch (i152) {
                                        case 0:
                                            org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                                            if (U != null) {
                                                U.presentFragment(new i9(walletTransactionPeer3.address));
                                                break;
                                            }
                                            break;
                                        default:
                                            org.telegram.ui.ActionBar.n2 U2 = LaunchActivity.U();
                                            if (U2 != null) {
                                                TL_wallet.WalletTransactionPeer walletTransactionPeer32 = walletTransactionPeer3;
                                                i9 i9Var = new i9(walletTransactionPeer32.address);
                                                i9Var.u0(walletTransactionPeer32.domain);
                                                U2.presentFragment(i9Var);
                                                break;
                                            }
                                            break;
                                    }
                                }
                            });
                            k2VarArr4[0].dismiss();
                            break;
                    }
                }
            });
        }
        Context context = this.i;
        if (j10 <= 0 || !wallettransaction.gasless) {
            long j11 = j10;
            if (j10 > 0 || wallettransaction.nft != null || wallettransaction.preview) {
                TextView textView2 = new TextView(context);
                TextView[] textViewArr = this.j;
                textViewArr[0] = textView2;
                textView2.setGravity(16);
                textViewArr[0].setIncludeFontPadding(false);
                textViewArr[0].setTextSize(1, 14.0f);
                textViewArr[0].setTextColor(z11 ? org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.z6, d6Var) : this.k);
                if (!wallettransaction.preview || j10 > 0) {
                    c10 = 0;
                    textViewArr[0].setText(n5.s0(i11, j11, d6Var));
                } else {
                    SpannableString[] spannableStringArr = this.l;
                    c10 = 0;
                    if (spannableStringArr[0] == null) {
                        SpannableString spannableString = new SpannableString(LocaleController.getString(R.string.Loading));
                        spannableStringArr[0] = spannableString;
                        spannableString.setSpan(new ca0(AndroidUtilities.dp(150.0f), textViewArr[0]), 0, spannableStringArr[0].length(), 33);
                    }
                    textViewArr[0].setText(spannableStringArr[0]);
                }
                j01Var.f(textViewArr[c10], LocaleController.getString(R.string.WalletFee));
            }
        } else {
            SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder("x ");
            yq yqVar = new yq(R.drawable.wallet_gram_small, 2);
            yqVar.recolorDrawable = false;
            yqVar.setSize(AndroidUtilities.dp(16.0f));
            yqVar.translate(0.0f, AndroidUtilities.dp(1.0f));
            spannableStringBuilder4.setSpan(yqVar, 0, 1, 33);
            spannableStringBuilder4.append((CharSequence) LocaleController.getString(R.string.WalletFeePaidByTelegram));
            j01Var.e(LocaleController.getString(R.string.WalletFee), spannableStringBuilder4, "?", new xb(context, d6Var, i11, j10, 18), null);
        }
        if (wallettransaction.date != 0) {
            j01Var.c(LocaleController.getString(R.string.WalletDate), LocaleController.formatShortDateTime(wallettransaction.date), null, null);
        }
    }
}
