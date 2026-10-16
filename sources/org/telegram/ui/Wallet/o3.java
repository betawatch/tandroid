package org.telegram.ui.Wallet;

import android.content.Context;
import android.content.DialogInterface;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TableRow;
import android.widget.TextView;
import bi.yb;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.br;
import org.telegram.ui.Components.ia0;
import org.telegram.ui.Components.l01;
import org.telegram.ui.Components.l91;
import org.telegram.ui.Components.n01;
import org.telegram.ui.Components.o01;
import org.telegram.ui.Components.za;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.wg1;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes4.dex */
public final /* synthetic */ class o3 implements Utilities.Callback {
    public final /* synthetic */ LinearLayout a;
    public final /* synthetic */ e4 b;
    public final /* synthetic */ org.telegram.ui.ActionBar.c6 c;
    public final /* synthetic */ int d;
    public final /* synthetic */ TextView e;
    public final /* synthetic */ j2[] f;
    public final /* synthetic */ o01 g;
    public final /* synthetic */ Utilities.Callback3 h;
    public final /* synthetic */ Context i;
    public final /* synthetic */ TextView[] j;
    public final /* synthetic */ int k;
    public final /* synthetic */ SpannableString[] l;

    public /* synthetic */ o3(LinearLayout linearLayout, e4 e4Var, org.telegram.ui.ActionBar.c6 c6Var, int i10, TextView textView, j2[] j2VarArr, o01 o01Var, Utilities.Callback3 callback3, Context context, TextView[] textViewArr, int i11, SpannableString[] spannableStringArr) {
        this.a = linearLayout;
        this.b = e4Var;
        this.c = c6Var;
        this.d = i10;
        this.e = textView;
        this.f = j2VarArr;
        this.g = o01Var;
        this.h = callback3;
        this.i = context;
        this.j = textViewArr;
        this.k = i11;
        this.l = spannableStringArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9, types: [org.telegram.ui.Components.bd[], org.telegram.ui.Components.n01[]] */
    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        boolean z10;
        boolean z11;
        long j10;
        j2 j2Var;
        za zaVar;
        j2 j2Var2;
        za zaVar2;
        final j2[] j2VarArr;
        o01 o01Var;
        CharSequence charSequence;
        ?? r42;
        char c10;
        boolean z12;
        int i10;
        char c11;
        j2 j2Var3;
        za zaVar3;
        TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj;
        long abs = Math.abs(wallettransaction.amount);
        boolean z13 = wallettransaction.incoming;
        long abs2 = Math.abs(wallettransaction.fee);
        boolean z14 = wallettransaction.pending || wallettransaction.failed;
        LinearLayout linearLayout = this.a;
        boolean z15 = ((linearLayout.getParent() instanceof View) && (linearLayout.getParent().getParent() instanceof l91) && ((l91) linearLayout.getParent().getParent()).getViewPages()[0] != linearLayout.getParent()) ? false : true;
        boolean z16 = wallettransaction.key_change;
        org.telegram.ui.ActionBar.c6 c6Var = this.c;
        int i11 = this.d;
        j2[] j2VarArr2 = this.f;
        final int i12 = 1;
        if (z16 || wallettransaction.nft != null) {
            z10 = z13;
            z11 = z14;
            boolean z17 = z15;
            j10 = abs2;
            if (!z16) {
                TL_wallet.nftItem nftitem = wallettransaction.nft;
                if (nftitem != null && z17 && (j2Var = j2VarArr2[0]) != null && (zaVar = j2Var.e) != null) {
                    zaVar.setTitle(TextUtils.isEmpty(nftitem.name) ? LocaleController.getString(R.string.WalletCollectible) : wallettransaction.nft.name);
                }
            } else if (z17 && (j2Var2 = j2VarArr2[0]) != null && (zaVar2 = j2Var2.e) != null) {
                zaVar2.setTitle(k0.k("Grams", k0.o(k0.n(abs, false), 0.75f), R.string.Grams_other));
            }
        } else {
            int w02 = z14 ? org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.z6, c6Var) : org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.Oh, c6Var);
            e4 e4Var = this.b;
            e4Var.setTextColor(w02);
            SpannableStringBuilder o10 = k0.o(k0.n(abs, false), 0.75f);
            z10 = z13;
            o10.insert(0, (CharSequence) (z13 ? "+" : "–"));
            if (z14) {
                z11 = z14;
                z12 = z15;
            } else {
                z11 = z14;
                z12 = z15;
                o10.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.g6.w0(z10 ? org.telegram.ui.ActionBar.g6.uj : org.telegram.ui.ActionBar.g6.G6, c6Var)), 0, o10.length(), 33);
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) k0.k("Grams", o10, R.string.Grams_other));
            int indexOf = TextUtils.indexOf(spannableStringBuilder, o10);
            int length = o10.length() + indexOf;
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
            e4Var.setText(spannableStringBuilder);
            CharSequence l4 = k0.v(i11).l(abs, false);
            TextView textView = this.e;
            if (z11) {
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(wallettransaction.failed ? LocaleController.getString(R.string.WalletFailed) : yb.a(textView, LocaleController.getString(R.string.WalletSending)));
                c11 = 0;
                spannableStringBuilder2.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.g6.w0(wallettransaction.failed ? org.telegram.ui.ActionBar.g6.p7 : org.telegram.ui.ActionBar.g6.n6, c6Var)), 0, spannableStringBuilder2.length(), 33);
                textView.setText(LocaleController.formatSpannable(R.string.WalletTransactionAmountStatus, l4, spannableStringBuilder2));
            } else {
                c11 = 0;
                textView.setText(l4);
            }
            if (z12 && (j2Var3 = j2VarArr2[c11]) != null && (zaVar3 = j2Var3.e) != null) {
                zaVar3.setTitle(k0.k("Grams", o10, R.string.Grams_other));
            }
        }
        o01 o01Var2 = this.g;
        o01Var2.removeAllViews();
        TL_wallet.WalletTransactionPeer walletTransactionPeer = wallettransaction.peer;
        boolean z18 = walletTransactionPeer instanceof TL_wallet.walletTransactionPeerUser;
        int i13 = 9;
        Utilities.Callback3 callback3 = this.h;
        if (z18) {
            TL_wallet.walletTransactionPeerUser wallettransactionpeeruser = (TL_wallet.walletTransactionPeerUser) walletTransactionPeer;
            TLRPC.User user = MessagesController.getInstance(i11).getUser(Long.valueOf(wallettransactionpeeruser.user_id));
            if (user == null || UserObject.isService(user.id)) {
                j2VarArr = j2VarArr2;
            } else {
                j2VarArr = j2VarArr2;
                o01Var2.l(LocaleController.getString(z10 ? R.string.WalletSender : R.string.WalletRecipient), i11, wallettransactionpeeruser.user_id, new l(callback3, j2VarArr2, wallettransactionpeeruser, 9), LocaleController.getString(R.string.WalletSend), callback3 != null ? null : new wg1(16, j2VarArr2, user));
            }
            o01Var = o01Var2;
            if (!TextUtils.isEmpty(wallettransactionpeeruser.domain)) {
                o01Var = o01Var2;
                if (!TextUtils.isEmpty(wallettransactionpeeruser.address)) {
                    o01Var2.h(LocaleController.getString(R.string.WalletDomain), wallettransactionpeeruser.domain, new l(j2VarArr, user, wallettransactionpeeruser, 10));
                    o01Var = o01Var2;
                }
            }
        } else {
            j2VarArr = j2VarArr2;
            o01Var = o01Var2;
            if (walletTransactionPeer instanceof TL_wallet.walletTransactionPeerAddress) {
                final TL_wallet.walletTransactionPeerAddress wallettransactionpeeraddress = (TL_wallet.walletTransactionPeerAddress) walletTransactionPeer;
                o01Var = o01Var2;
                if (!TextUtils.isEmpty(wallettransactionpeeraddress.domain)) {
                    if (TextUtils.isEmpty(wallettransactionpeeraddress.address)) {
                        o01Var2.h(LocaleController.getString(z10 ? R.string.WalletSender : R.string.WalletRecipient), wallettransactionpeeraddress.domain, new ah.j(19));
                        o01Var = o01Var2;
                    } else {
                        final int i14 = 0;
                        o01Var2.g(LocaleController.getString(z10 ? R.string.WalletSender : R.string.WalletRecipient), wallettransactionpeeraddress.domain, new Runnable() { // from class: org.telegram.ui.Wallet.t3
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i14) {
                                    case 0:
                                        j2[] j2VarArr3 = j2VarArr;
                                        j2 j2Var4 = j2VarArr3[0];
                                        final int i15 = 1;
                                        final TL_wallet.walletTransactionPeerAddress wallettransactionpeeraddress2 = wallettransactionpeeraddress;
                                        j2Var4.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: org.telegram.ui.Wallet.u3
                                            @Override // android.content.DialogInterface.OnDismissListener
                                            public final void onDismiss(DialogInterface dialogInterface) {
                                                switch (i15) {
                                                    case 0:
                                                        org.telegram.ui.ActionBar.m2 U = LaunchActivity.U();
                                                        if (U != null) {
                                                            TL_wallet.walletTransactionPeerAddress wallettransactionpeeraddress3 = wallettransactionpeeraddress2;
                                                            j8 j8Var = new j8(wallettransactionpeeraddress3.address);
                                                            j8Var.u0(wallettransactionpeeraddress3.domain);
                                                            U.presentFragment(j8Var);
                                                            break;
                                                        }
                                                        break;
                                                    default:
                                                        org.telegram.ui.ActionBar.m2 U2 = LaunchActivity.U();
                                                        if (U2 != null) {
                                                            TL_wallet.walletTransactionPeerAddress wallettransactionpeeraddress4 = wallettransactionpeeraddress2;
                                                            j8 j8Var2 = new j8(wallettransactionpeeraddress4.address);
                                                            j8Var2.u0(wallettransactionpeeraddress4.domain);
                                                            U2.presentFragment(j8Var2);
                                                            break;
                                                        }
                                                        break;
                                                }
                                            }
                                        });
                                        j2VarArr3[0].dismiss();
                                        break;
                                    default:
                                        j2[] j2VarArr4 = j2VarArr;
                                        j2 j2Var5 = j2VarArr4[0];
                                        final int i16 = 0;
                                        final TL_wallet.walletTransactionPeerAddress wallettransactionpeeraddress3 = wallettransactionpeeraddress;
                                        j2Var5.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: org.telegram.ui.Wallet.u3
                                            @Override // android.content.DialogInterface.OnDismissListener
                                            public final void onDismiss(DialogInterface dialogInterface) {
                                                switch (i16) {
                                                    case 0:
                                                        org.telegram.ui.ActionBar.m2 U = LaunchActivity.U();
                                                        if (U != null) {
                                                            TL_wallet.walletTransactionPeerAddress wallettransactionpeeraddress32 = wallettransactionpeeraddress3;
                                                            j8 j8Var = new j8(wallettransactionpeeraddress32.address);
                                                            j8Var.u0(wallettransactionpeeraddress32.domain);
                                                            U.presentFragment(j8Var);
                                                            break;
                                                        }
                                                        break;
                                                    default:
                                                        org.telegram.ui.ActionBar.m2 U2 = LaunchActivity.U();
                                                        if (U2 != null) {
                                                            TL_wallet.walletTransactionPeerAddress wallettransactionpeeraddress4 = wallettransactionpeeraddress3;
                                                            j8 j8Var2 = new j8(wallettransactionpeeraddress4.address);
                                                            j8Var2.u0(wallettransactionpeeraddress4.domain);
                                                            U2.presentFragment(j8Var2);
                                                            break;
                                                        }
                                                        break;
                                                }
                                            }
                                        });
                                        j2VarArr4[0].dismiss();
                                        break;
                                }
                            }
                        }, LocaleController.getString(R.string.WalletSend), callback3 != null ? 0 : new Runnable() { // from class: org.telegram.ui.Wallet.t3
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i12) {
                                    case 0:
                                        j2[] j2VarArr3 = j2VarArr;
                                        j2 j2Var4 = j2VarArr3[0];
                                        final int i15 = 1;
                                        final TL_wallet.walletTransactionPeerAddress wallettransactionpeeraddress2 = wallettransactionpeeraddress;
                                        j2Var4.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: org.telegram.ui.Wallet.u3
                                            @Override // android.content.DialogInterface.OnDismissListener
                                            public final void onDismiss(DialogInterface dialogInterface) {
                                                switch (i15) {
                                                    case 0:
                                                        org.telegram.ui.ActionBar.m2 U = LaunchActivity.U();
                                                        if (U != null) {
                                                            TL_wallet.walletTransactionPeerAddress wallettransactionpeeraddress32 = wallettransactionpeeraddress2;
                                                            j8 j8Var = new j8(wallettransactionpeeraddress32.address);
                                                            j8Var.u0(wallettransactionpeeraddress32.domain);
                                                            U.presentFragment(j8Var);
                                                            break;
                                                        }
                                                        break;
                                                    default:
                                                        org.telegram.ui.ActionBar.m2 U2 = LaunchActivity.U();
                                                        if (U2 != null) {
                                                            TL_wallet.walletTransactionPeerAddress wallettransactionpeeraddress4 = wallettransactionpeeraddress2;
                                                            j8 j8Var2 = new j8(wallettransactionpeeraddress4.address);
                                                            j8Var2.u0(wallettransactionpeeraddress4.domain);
                                                            U2.presentFragment(j8Var2);
                                                            break;
                                                        }
                                                        break;
                                                }
                                            }
                                        });
                                        j2VarArr3[0].dismiss();
                                        break;
                                    default:
                                        j2[] j2VarArr4 = j2VarArr;
                                        j2 j2Var5 = j2VarArr4[0];
                                        final int i16 = 0;
                                        final TL_wallet.walletTransactionPeerAddress wallettransactionpeeraddress3 = wallettransactionpeeraddress;
                                        j2Var5.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: org.telegram.ui.Wallet.u3
                                            @Override // android.content.DialogInterface.OnDismissListener
                                            public final void onDismiss(DialogInterface dialogInterface) {
                                                switch (i16) {
                                                    case 0:
                                                        org.telegram.ui.ActionBar.m2 U = LaunchActivity.U();
                                                        if (U != null) {
                                                            TL_wallet.walletTransactionPeerAddress wallettransactionpeeraddress32 = wallettransactionpeeraddress3;
                                                            j8 j8Var = new j8(wallettransactionpeeraddress32.address);
                                                            j8Var.u0(wallettransactionpeeraddress32.domain);
                                                            U.presentFragment(j8Var);
                                                            break;
                                                        }
                                                        break;
                                                    default:
                                                        org.telegram.ui.ActionBar.m2 U2 = LaunchActivity.U();
                                                        if (U2 != null) {
                                                            TL_wallet.walletTransactionPeerAddress wallettransactionpeeraddress4 = wallettransactionpeeraddress3;
                                                            j8 j8Var2 = new j8(wallettransactionpeeraddress4.address);
                                                            j8Var2.u0(wallettransactionpeeraddress4.domain);
                                                            U2.presentFragment(j8Var2);
                                                            break;
                                                        }
                                                        break;
                                                }
                                            }
                                        });
                                        j2VarArr4[0].dismiss();
                                        break;
                                }
                            }
                        });
                        o01Var = o01Var2;
                    }
                }
            }
        }
        TL_wallet.WalletTransactionPeer walletTransactionPeer2 = wallettransaction.peer;
        boolean z19 = walletTransactionPeer2 instanceof TL_wallet.walletTransactionPeerUser;
        if (z19 || (walletTransactionPeer2 instanceof TL_wallet.walletTransactionPeerAddress)) {
            boolean z20 = callback3 == null && !(z19 && MessagesController.getInstance(i11).getUser(Long.valueOf(walletTransactionPeer2.user_id)) != null && !UserObject.isService(walletTransactionPeer2.user_id)) && TextUtils.isEmpty(walletTransactionPeer2.domain) && !TextUtils.isEmpty(walletTransactionPeer2.address);
            String string = LocaleController.getString(R.string.WalletAddress);
            String str = walletTransactionPeer2.address;
            wg1 wg1Var = new wg1(17, j2VarArr, c6Var);
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
                spannableStringBuilder3.setSpan(new org.telegram.ui.Cells.i(str, wg1Var, i13), 0, spannableStringBuilder3.length(), 33);
                charSequence = spannableStringBuilder3;
            }
            o01Var.i(string, charSequence, 14, null, z20 ? LocaleController.getString(R.string.WalletSend) : null, new wg1(18, j2VarArr, walletTransactionPeer2));
        }
        Context context = this.i;
        if (j10 <= 0 || !wallettransaction.gasless) {
            long j11 = j10;
            r42 = 0;
            r42 = 0;
            if (j10 > 0 || wallettransaction.nft != null || wallettransaction.preview) {
                TextView textView2 = new TextView(context);
                TextView[] textViewArr = this.j;
                textViewArr[0] = textView2;
                textView2.setGravity(16);
                textViewArr[0].setIncludeFontPadding(false);
                textViewArr[0].setTextSize(1, 14.0f);
                textViewArr[0].setTextColor(z11 ? org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.z6, c6Var) : this.k);
                if (!wallettransaction.preview || j10 > 0) {
                    c10 = 0;
                    textViewArr[0].setText(a5.l0(i11, j11, c6Var));
                } else {
                    SpannableString[] spannableStringArr = this.l;
                    c10 = 0;
                    if (spannableStringArr[0] == null) {
                        SpannableString spannableString = new SpannableString(LocaleController.getString(R.string.Loading));
                        spannableStringArr[0] = spannableString;
                        spannableString.setSpan(new ia0(AndroidUtilities.dp(150.0f), textViewArr[0]), 0, spannableStringArr[0].length(), 33);
                    }
                    textViewArr[0].setText(spannableStringArr[0]);
                }
                String string2 = LocaleController.getString(R.string.WalletFee);
                TextView textView3 = textViewArr[c10];
                TableRow tableRow = new TableRow(o01Var.getContext());
                tableRow.addView(new n01(o01Var, string2), new TableRow.LayoutParams(-2, -1));
                tableRow.addView(new l01(o01Var, textView3, false), new TableRow.LayoutParams(0, -1, 1.0f));
                o01Var.addView(tableRow);
            }
        } else {
            SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder("x ");
            br brVar = new br(R.drawable.wallet_gram_small, 2);
            brVar.recolorDrawable = false;
            brVar.setSize(AndroidUtilities.dp(16.0f));
            brVar.translate(0.0f, AndroidUtilities.dp(1.0f));
            spannableStringBuilder4.setSpan(brVar, 0, 1, 33);
            spannableStringBuilder4.append((CharSequence) LocaleController.getString(R.string.WalletFeePaidByTelegram));
            r42 = 0;
            o01Var.e(LocaleController.getString(R.string.WalletFee), spannableStringBuilder4, "?", new org.telegram.messenger.k7(context, c6Var, i11, j10, 17), null);
        }
        if (wallettransaction.date != 0) {
            o01Var.c(LocaleController.getString(R.string.WalletDate), LocaleController.formatShortDateTime(wallettransaction.date), r42, r42);
        }
    }
}
