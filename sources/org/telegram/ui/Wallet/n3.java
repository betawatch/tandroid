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
import org.telegram.ui.Components.k01;
import org.telegram.ui.Components.k91;
import org.telegram.ui.Components.m01;
import org.telegram.ui.Components.n01;
import org.telegram.ui.Components.za;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.je1;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes4.dex */
public final /* synthetic */ class n3 implements Utilities.Callback {
    public final /* synthetic */ LinearLayout a;
    public final /* synthetic */ d4 b;
    public final /* synthetic */ org.telegram.ui.ActionBar.c6 c;
    public final /* synthetic */ int d;
    public final /* synthetic */ TextView e;
    public final /* synthetic */ i2[] f;
    public final /* synthetic */ n01 g;
    public final /* synthetic */ Utilities.Callback3 h;
    public final /* synthetic */ Context i;
    public final /* synthetic */ TextView[] j;
    public final /* synthetic */ int k;
    public final /* synthetic */ SpannableString[] l;

    public /* synthetic */ n3(LinearLayout linearLayout, d4 d4Var, org.telegram.ui.ActionBar.c6 c6Var, int i10, TextView textView, i2[] i2VarArr, n01 n01Var, Utilities.Callback3 callback3, Context context, TextView[] textViewArr, int i11, SpannableString[] spannableStringArr) {
        this.a = linearLayout;
        this.b = d4Var;
        this.c = c6Var;
        this.d = i10;
        this.e = textView;
        this.f = i2VarArr;
        this.g = n01Var;
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
    /* JADX WARN: Type inference failed for: r4v9, types: [org.telegram.ui.Components.bd[], org.telegram.ui.Components.m01[]] */
    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        boolean z10;
        boolean z11;
        long j10;
        i2 i2Var;
        za zaVar;
        i2 i2Var2;
        za zaVar2;
        final i2[] i2VarArr;
        n01 n01Var;
        CharSequence charSequence;
        ?? r42;
        char c10;
        boolean z12;
        int i10;
        char c11;
        i2 i2Var3;
        za zaVar3;
        TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj;
        long abs = Math.abs(wallettransaction.amount);
        boolean z13 = wallettransaction.incoming;
        long abs2 = Math.abs(wallettransaction.fee);
        boolean z14 = wallettransaction.pending || wallettransaction.failed;
        LinearLayout linearLayout = this.a;
        boolean z15 = ((linearLayout.getParent() instanceof View) && (linearLayout.getParent().getParent() instanceof k91) && ((k91) linearLayout.getParent().getParent()).getViewPages()[0] != linearLayout.getParent()) ? false : true;
        boolean z16 = wallettransaction.key_change;
        org.telegram.ui.ActionBar.c6 c6Var = this.c;
        int i11 = this.d;
        i2[] i2VarArr2 = this.f;
        final int i12 = 1;
        if (z16 || wallettransaction.nft != null) {
            z10 = z13;
            z11 = z14;
            boolean z17 = z15;
            j10 = abs2;
            if (!z16) {
                TL_wallet.nftItem nftitem = wallettransaction.nft;
                if (nftitem != null && z17 && (i2Var = i2VarArr2[0]) != null && (zaVar = i2Var.e) != null) {
                    zaVar.setTitle(TextUtils.isEmpty(nftitem.name) ? LocaleController.getString(R.string.WalletCollectible) : wallettransaction.nft.name);
                }
            } else if (z17 && (i2Var2 = i2VarArr2[0]) != null && (zaVar2 = i2Var2.e) != null) {
                zaVar2.setTitle(j0.k("Grams", j0.o(j0.n(abs, false), 0.75f), R.string.Grams_other));
            }
        } else {
            int w02 = z14 ? org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.z6, c6Var) : org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.Oh, c6Var);
            d4 d4Var = this.b;
            d4Var.setTextColor(w02);
            SpannableStringBuilder o10 = j0.o(j0.n(abs, false), 0.75f);
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
            spannableStringBuilder.append((CharSequence) j0.k("Grams", o10, R.string.Grams_other));
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
            d4Var.setText(spannableStringBuilder);
            CharSequence l4 = j0.v(i11).l(abs, false);
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
            if (z12 && (i2Var3 = i2VarArr2[c11]) != null && (zaVar3 = i2Var3.e) != null) {
                zaVar3.setTitle(j0.k("Grams", o10, R.string.Grams_other));
            }
        }
        n01 n01Var2 = this.g;
        n01Var2.removeAllViews();
        TL_wallet.WalletTransactionPeer walletTransactionPeer = wallettransaction.peer;
        boolean z18 = walletTransactionPeer instanceof TL_wallet.walletTransactionPeerUser;
        int i13 = 9;
        Utilities.Callback3 callback3 = this.h;
        if (z18) {
            TL_wallet.walletTransactionPeerUser wallettransactionpeeruser = (TL_wallet.walletTransactionPeerUser) walletTransactionPeer;
            TLRPC.User user = MessagesController.getInstance(i11).getUser(Long.valueOf(wallettransactionpeeruser.user_id));
            if (user == null || UserObject.isService(user.id)) {
                i2VarArr = i2VarArr2;
            } else {
                i2VarArr = i2VarArr2;
                n01Var2.l(LocaleController.getString(z10 ? R.string.WalletSender : R.string.WalletRecipient), i11, wallettransactionpeeruser.user_id, new k(callback3, i2VarArr2, wallettransactionpeeruser, 9), LocaleController.getString(R.string.WalletSend), callback3 != null ? null : new je1(21, i2VarArr2, user));
            }
            n01Var = n01Var2;
            if (!TextUtils.isEmpty(wallettransactionpeeruser.domain)) {
                n01Var = n01Var2;
                if (!TextUtils.isEmpty(wallettransactionpeeruser.address)) {
                    n01Var2.h(LocaleController.getString(R.string.WalletDomain), wallettransactionpeeruser.domain, new k(i2VarArr, user, wallettransactionpeeruser, 10));
                    n01Var = n01Var2;
                }
            }
        } else {
            i2VarArr = i2VarArr2;
            n01Var = n01Var2;
            if (walletTransactionPeer instanceof TL_wallet.walletTransactionPeerAddress) {
                final TL_wallet.walletTransactionPeerAddress wallettransactionpeeraddress = (TL_wallet.walletTransactionPeerAddress) walletTransactionPeer;
                n01Var = n01Var2;
                if (!TextUtils.isEmpty(wallettransactionpeeraddress.domain)) {
                    if (TextUtils.isEmpty(wallettransactionpeeraddress.address)) {
                        n01Var2.h(LocaleController.getString(z10 ? R.string.WalletSender : R.string.WalletRecipient), wallettransactionpeeraddress.domain, new ah.j(19));
                        n01Var = n01Var2;
                    } else {
                        final int i14 = 0;
                        n01Var2.g(LocaleController.getString(z10 ? R.string.WalletSender : R.string.WalletRecipient), wallettransactionpeeraddress.domain, new Runnable() { // from class: org.telegram.ui.Wallet.s3
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i14) {
                                    case 0:
                                        i2[] i2VarArr3 = i2VarArr;
                                        i2 i2Var4 = i2VarArr3[0];
                                        final int i15 = 1;
                                        final TL_wallet.walletTransactionPeerAddress wallettransactionpeeraddress2 = wallettransactionpeeraddress;
                                        i2Var4.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: org.telegram.ui.Wallet.t3
                                            @Override // android.content.DialogInterface.OnDismissListener
                                            public final void onDismiss(DialogInterface dialogInterface) {
                                                switch (i15) {
                                                    case 0:
                                                        org.telegram.ui.ActionBar.m2 U = LaunchActivity.U();
                                                        if (U != null) {
                                                            TL_wallet.walletTransactionPeerAddress wallettransactionpeeraddress3 = wallettransactionpeeraddress2;
                                                            i8 i8Var = new i8(wallettransactionpeeraddress3.address);
                                                            i8Var.u0(wallettransactionpeeraddress3.domain);
                                                            U.presentFragment(i8Var);
                                                            break;
                                                        }
                                                        break;
                                                    default:
                                                        org.telegram.ui.ActionBar.m2 U2 = LaunchActivity.U();
                                                        if (U2 != null) {
                                                            TL_wallet.walletTransactionPeerAddress wallettransactionpeeraddress4 = wallettransactionpeeraddress2;
                                                            i8 i8Var2 = new i8(wallettransactionpeeraddress4.address);
                                                            i8Var2.u0(wallettransactionpeeraddress4.domain);
                                                            U2.presentFragment(i8Var2);
                                                            break;
                                                        }
                                                        break;
                                                }
                                            }
                                        });
                                        i2VarArr3[0].dismiss();
                                        break;
                                    default:
                                        i2[] i2VarArr4 = i2VarArr;
                                        i2 i2Var5 = i2VarArr4[0];
                                        final int i16 = 0;
                                        final TL_wallet.walletTransactionPeerAddress wallettransactionpeeraddress3 = wallettransactionpeeraddress;
                                        i2Var5.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: org.telegram.ui.Wallet.t3
                                            @Override // android.content.DialogInterface.OnDismissListener
                                            public final void onDismiss(DialogInterface dialogInterface) {
                                                switch (i16) {
                                                    case 0:
                                                        org.telegram.ui.ActionBar.m2 U = LaunchActivity.U();
                                                        if (U != null) {
                                                            TL_wallet.walletTransactionPeerAddress wallettransactionpeeraddress32 = wallettransactionpeeraddress3;
                                                            i8 i8Var = new i8(wallettransactionpeeraddress32.address);
                                                            i8Var.u0(wallettransactionpeeraddress32.domain);
                                                            U.presentFragment(i8Var);
                                                            break;
                                                        }
                                                        break;
                                                    default:
                                                        org.telegram.ui.ActionBar.m2 U2 = LaunchActivity.U();
                                                        if (U2 != null) {
                                                            TL_wallet.walletTransactionPeerAddress wallettransactionpeeraddress4 = wallettransactionpeeraddress3;
                                                            i8 i8Var2 = new i8(wallettransactionpeeraddress4.address);
                                                            i8Var2.u0(wallettransactionpeeraddress4.domain);
                                                            U2.presentFragment(i8Var2);
                                                            break;
                                                        }
                                                        break;
                                                }
                                            }
                                        });
                                        i2VarArr4[0].dismiss();
                                        break;
                                }
                            }
                        }, LocaleController.getString(R.string.WalletSend), callback3 != null ? 0 : new Runnable() { // from class: org.telegram.ui.Wallet.s3
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i12) {
                                    case 0:
                                        i2[] i2VarArr3 = i2VarArr;
                                        i2 i2Var4 = i2VarArr3[0];
                                        final int i15 = 1;
                                        final TL_wallet.walletTransactionPeerAddress wallettransactionpeeraddress2 = wallettransactionpeeraddress;
                                        i2Var4.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: org.telegram.ui.Wallet.t3
                                            @Override // android.content.DialogInterface.OnDismissListener
                                            public final void onDismiss(DialogInterface dialogInterface) {
                                                switch (i15) {
                                                    case 0:
                                                        org.telegram.ui.ActionBar.m2 U = LaunchActivity.U();
                                                        if (U != null) {
                                                            TL_wallet.walletTransactionPeerAddress wallettransactionpeeraddress32 = wallettransactionpeeraddress2;
                                                            i8 i8Var = new i8(wallettransactionpeeraddress32.address);
                                                            i8Var.u0(wallettransactionpeeraddress32.domain);
                                                            U.presentFragment(i8Var);
                                                            break;
                                                        }
                                                        break;
                                                    default:
                                                        org.telegram.ui.ActionBar.m2 U2 = LaunchActivity.U();
                                                        if (U2 != null) {
                                                            TL_wallet.walletTransactionPeerAddress wallettransactionpeeraddress4 = wallettransactionpeeraddress2;
                                                            i8 i8Var2 = new i8(wallettransactionpeeraddress4.address);
                                                            i8Var2.u0(wallettransactionpeeraddress4.domain);
                                                            U2.presentFragment(i8Var2);
                                                            break;
                                                        }
                                                        break;
                                                }
                                            }
                                        });
                                        i2VarArr3[0].dismiss();
                                        break;
                                    default:
                                        i2[] i2VarArr4 = i2VarArr;
                                        i2 i2Var5 = i2VarArr4[0];
                                        final int i16 = 0;
                                        final TL_wallet.walletTransactionPeerAddress wallettransactionpeeraddress3 = wallettransactionpeeraddress;
                                        i2Var5.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: org.telegram.ui.Wallet.t3
                                            @Override // android.content.DialogInterface.OnDismissListener
                                            public final void onDismiss(DialogInterface dialogInterface) {
                                                switch (i16) {
                                                    case 0:
                                                        org.telegram.ui.ActionBar.m2 U = LaunchActivity.U();
                                                        if (U != null) {
                                                            TL_wallet.walletTransactionPeerAddress wallettransactionpeeraddress32 = wallettransactionpeeraddress3;
                                                            i8 i8Var = new i8(wallettransactionpeeraddress32.address);
                                                            i8Var.u0(wallettransactionpeeraddress32.domain);
                                                            U.presentFragment(i8Var);
                                                            break;
                                                        }
                                                        break;
                                                    default:
                                                        org.telegram.ui.ActionBar.m2 U2 = LaunchActivity.U();
                                                        if (U2 != null) {
                                                            TL_wallet.walletTransactionPeerAddress wallettransactionpeeraddress4 = wallettransactionpeeraddress3;
                                                            i8 i8Var2 = new i8(wallettransactionpeeraddress4.address);
                                                            i8Var2.u0(wallettransactionpeeraddress4.domain);
                                                            U2.presentFragment(i8Var2);
                                                            break;
                                                        }
                                                        break;
                                                }
                                            }
                                        });
                                        i2VarArr4[0].dismiss();
                                        break;
                                }
                            }
                        });
                        n01Var = n01Var2;
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
            je1 je1Var = new je1(22, i2VarArr, c6Var);
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
                spannableStringBuilder3.setSpan(new org.telegram.ui.Cells.i(str, je1Var, i13), 0, spannableStringBuilder3.length(), 33);
                charSequence = spannableStringBuilder3;
            }
            n01Var.i(string, charSequence, 14, null, z20 ? LocaleController.getString(R.string.WalletSend) : null, new je1(23, i2VarArr, walletTransactionPeer2));
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
                    textViewArr[0].setText(z4.l0(i11, j11, c6Var));
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
                TableRow tableRow = new TableRow(n01Var.getContext());
                tableRow.addView(new m01(n01Var, string2), new TableRow.LayoutParams(-2, -1));
                tableRow.addView(new k01(n01Var, textView3, false), new TableRow.LayoutParams(0, -1, 1.0f));
                n01Var.addView(tableRow);
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
            n01Var.e(LocaleController.getString(R.string.WalletFee), spannableStringBuilder4, "?", new org.telegram.messenger.k7(context, c6Var, i11, j10, 17), null);
        }
        if (wallettransaction.date != 0) {
            n01Var.c(LocaleController.getString(R.string.WalletDate), LocaleController.formatShortDateTime(wallettransaction.date), r42, r42);
        }
    }
}
