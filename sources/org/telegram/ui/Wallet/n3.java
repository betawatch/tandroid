package org.telegram.ui.Wallet;

import ai.qc;
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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.ab;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.ja0;
import org.telegram.ui.Components.o01;
import org.telegram.ui.Components.o91;
import org.telegram.ui.Components.q01;
import org.telegram.ui.Components.r01;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ii1;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final /* synthetic */ class n3 implements Utilities.Callback {
    public final /* synthetic */ LinearLayout a;
    public final /* synthetic */ d4 b;
    public final /* synthetic */ org.telegram.ui.ActionBar.e6 c;
    public final /* synthetic */ int d;
    public final /* synthetic */ TextView e;
    public final /* synthetic */ i2[] f;
    public final /* synthetic */ r01 g;
    public final /* synthetic */ Utilities.Callback3 h;
    public final /* synthetic */ Context i;
    public final /* synthetic */ TextView[] j;
    public final /* synthetic */ int k;
    public final /* synthetic */ SpannableString[] l;

    public /* synthetic */ n3(LinearLayout linearLayout, d4 d4Var, org.telegram.ui.ActionBar.e6 e6Var, int i10, TextView textView, i2[] i2VarArr, r01 r01Var, Utilities.Callback3 callback3, Context context, TextView[] textViewArr, int i11, SpannableString[] spannableStringArr) {
        this.a = linearLayout;
        this.b = d4Var;
        this.c = e6Var;
        this.d = i10;
        this.e = textView;
        this.f = i2VarArr;
        this.g = r01Var;
        this.h = callback3;
        this.i = context;
        this.j = textViewArr;
        this.k = i11;
        this.l = spannableStringArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:95:0x03d6, code lost:
    
        if (r1.incoming == false) goto L185;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v5, types: [org.telegram.ui.Wallet.s3] */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v3, types: [android.view.View, android.view.ViewGroup, org.telegram.ui.Components.r01] */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r14v5 */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r14v7 */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Type inference failed for: r14v9 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v22 */
    /* JADX WARN: Type inference failed for: r4v23 */
    /* JADX WARN: Type inference failed for: r4v9, types: [org.telegram.ui.Components.cd[], org.telegram.ui.Components.q01[]] */
    @Override // org.telegram.messenger.Utilities.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run(Object obj) {
        boolean z10;
        boolean z11;
        long j3;
        i2 i2Var;
        ab abVar;
        i2 i2Var2;
        ab abVar2;
        final i2[] i2VarArr;
        r01 r01Var;
        CharSequence charSequence;
        char c10;
        ?? r42;
        boolean z12;
        int i10;
        char c11;
        i2 i2Var3;
        ab abVar3;
        TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj;
        long abs = Math.abs(wallettransaction.amount);
        boolean z13 = wallettransaction.incoming;
        long abs2 = Math.abs(wallettransaction.fee);
        boolean z14 = wallettransaction.pending || wallettransaction.failed;
        LinearLayout linearLayout = this.a;
        boolean z15 = ((linearLayout.getParent() instanceof View) && (linearLayout.getParent().getParent() instanceof o91) && ((o91) linearLayout.getParent().getParent()).getViewPages()[0] != linearLayout.getParent()) ? false : true;
        boolean z16 = wallettransaction.key_change;
        org.telegram.ui.ActionBar.e6 e6Var = this.c;
        int i11 = this.d;
        i2[] i2VarArr2 = this.f;
        final int i12 = 1;
        if (z16 || wallettransaction.nft != null) {
            z10 = z13;
            z11 = z14;
            boolean z17 = z15;
            j3 = abs2;
            if (!z16) {
                TL_wallet.nftItem nftitem = wallettransaction.nft;
                if (nftitem != null && z17 && (i2Var = i2VarArr2[0]) != null && (abVar = i2Var.e) != null) {
                    abVar.setTitle(TextUtils.isEmpty(nftitem.name) ? LocaleController.getString(R.string.WalletCollectible) : wallettransaction.nft.name);
                }
            } else if (z17 && (i2Var2 = i2VarArr2[0]) != null && (abVar2 = i2Var2.e) != null) {
                abVar2.setTitle(k0.k("Grams", k0.o(k0.n(abs, false), 0.75f), R.string.Grams_other));
            }
        } else {
            int w02 = z14 ? org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.z6, e6Var) : org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.Oh, e6Var);
            d4 d4Var = this.b;
            d4Var.setTextColor(w02);
            SpannableStringBuilder o9 = k0.o(k0.n(abs, false), 0.75f);
            z10 = z13;
            o9.insert(0, (CharSequence) (z13 ? "+" : "–"));
            if (z14) {
                z11 = z14;
                z12 = z15;
            } else {
                z11 = z14;
                z12 = z15;
                o9.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.i6.w0(z10 ? org.telegram.ui.ActionBar.i6.uj : org.telegram.ui.ActionBar.i6.G6, e6Var)), 0, o9.length(), 33);
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) k0.k("Grams", o9, R.string.Grams_other));
            int indexOf = TextUtils.indexOf(spannableStringBuilder, o9);
            int length = o9.length() + indexOf;
            if (indexOf > 0) {
                j3 = abs2;
                i10 = 33;
                spannableStringBuilder.setSpan(new RelativeSizeSpan(0.75f), 0, indexOf, 33);
            } else {
                j3 = abs2;
                i10 = 33;
            }
            if (indexOf >= 0 && length < spannableStringBuilder.length()) {
                spannableStringBuilder.setSpan(new RelativeSizeSpan(0.75f), length, spannableStringBuilder.length(), i10);
            }
            d4Var.setText(spannableStringBuilder);
            CharSequence l4 = k0.v(i11).l(abs, false);
            TextView textView = this.e;
            if (z11) {
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(wallettransaction.failed ? LocaleController.getString(R.string.WalletFailed) : qc.a(textView, LocaleController.getString(R.string.WalletSending)));
                c11 = 0;
                spannableStringBuilder2.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.i6.w0(wallettransaction.failed ? org.telegram.ui.ActionBar.i6.p7 : org.telegram.ui.ActionBar.i6.n6, e6Var)), 0, spannableStringBuilder2.length(), 33);
                textView.setText(LocaleController.formatSpannable(R.string.WalletTransactionAmountStatus, l4, spannableStringBuilder2));
            } else {
                c11 = 0;
                textView.setText(l4);
            }
            if (z12 && (i2Var3 = i2VarArr2[c11]) != null && (abVar3 = i2Var3.e) != null) {
                abVar3.setTitle(k0.k("Grams", o9, R.string.Grams_other));
            }
        }
        r01 r01Var2 = this.g;
        r01Var2.removeAllViews();
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
                r01Var2.l(LocaleController.getString(z10 ? R.string.WalletSender : R.string.WalletRecipient), i11, wallettransactionpeeruser.user_id, new k(callback3, i2VarArr2, wallettransactionpeeruser, 9), LocaleController.getString(R.string.WalletSend), callback3 != null ? null : new ii1(10, i2VarArr2, user));
            }
            r01Var = r01Var2;
            if (!TextUtils.isEmpty(wallettransactionpeeruser.domain)) {
                r01Var = r01Var2;
                if (!TextUtils.isEmpty(wallettransactionpeeruser.address)) {
                    r01Var2.h(LocaleController.getString(R.string.WalletDomain), wallettransactionpeeruser.domain, new k(i2VarArr, user, wallettransactionpeeruser, 10));
                    r01Var = r01Var2;
                }
            }
        } else {
            i2VarArr = i2VarArr2;
            r01Var = r01Var2;
            if (walletTransactionPeer instanceof TL_wallet.walletTransactionPeerAddress) {
                final TL_wallet.walletTransactionPeerAddress wallettransactionpeeraddress = (TL_wallet.walletTransactionPeerAddress) walletTransactionPeer;
                r01Var = r01Var2;
                if (!TextUtils.isEmpty(wallettransactionpeeraddress.domain)) {
                    if (TextUtils.isEmpty(wallettransactionpeeraddress.address)) {
                        r01Var2.h(LocaleController.getString(z10 ? R.string.WalletSender : R.string.WalletRecipient), wallettransactionpeeraddress.domain, new ai.f(18));
                        r01Var = r01Var2;
                    } else {
                        final int i14 = 0;
                        r01Var2.g(LocaleController.getString(z10 ? R.string.WalletSender : R.string.WalletRecipient), wallettransactionpeeraddress.domain, new Runnable() { // from class: org.telegram.ui.Wallet.s3
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
                                                        org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                                                        if (U != null) {
                                                            TL_wallet.walletTransactionPeerAddress wallettransactionpeeraddress3 = wallettransactionpeeraddress2;
                                                            j8 j8Var = new j8(wallettransactionpeeraddress3.address);
                                                            j8Var.u0(wallettransactionpeeraddress3.domain);
                                                            U.presentFragment(j8Var);
                                                            break;
                                                        }
                                                        break;
                                                    default:
                                                        org.telegram.ui.ActionBar.n2 U2 = LaunchActivity.U();
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
                                                        org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                                                        if (U != null) {
                                                            TL_wallet.walletTransactionPeerAddress wallettransactionpeeraddress32 = wallettransactionpeeraddress3;
                                                            j8 j8Var = new j8(wallettransactionpeeraddress32.address);
                                                            j8Var.u0(wallettransactionpeeraddress32.domain);
                                                            U.presentFragment(j8Var);
                                                            break;
                                                        }
                                                        break;
                                                    default:
                                                        org.telegram.ui.ActionBar.n2 U2 = LaunchActivity.U();
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
                                        i2VarArr4[0].dismiss();
                                        break;
                                }
                            }
                        }, LocaleController.getString(R.string.WalletSend), callback3 != null ? null : new Runnable() { // from class: org.telegram.ui.Wallet.s3
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
                                                        org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                                                        if (U != null) {
                                                            TL_wallet.walletTransactionPeerAddress wallettransactionpeeraddress32 = wallettransactionpeeraddress2;
                                                            j8 j8Var = new j8(wallettransactionpeeraddress32.address);
                                                            j8Var.u0(wallettransactionpeeraddress32.domain);
                                                            U.presentFragment(j8Var);
                                                            break;
                                                        }
                                                        break;
                                                    default:
                                                        org.telegram.ui.ActionBar.n2 U2 = LaunchActivity.U();
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
                                                        org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                                                        if (U != null) {
                                                            TL_wallet.walletTransactionPeerAddress wallettransactionpeeraddress32 = wallettransactionpeeraddress3;
                                                            j8 j8Var = new j8(wallettransactionpeeraddress32.address);
                                                            j8Var.u0(wallettransactionpeeraddress32.domain);
                                                            U.presentFragment(j8Var);
                                                            break;
                                                        }
                                                        break;
                                                    default:
                                                        org.telegram.ui.ActionBar.n2 U2 = LaunchActivity.U();
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
                                        i2VarArr4[0].dismiss();
                                        break;
                                }
                            }
                        });
                        r01Var = r01Var2;
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
            ii1 ii1Var = new ii1(11, i2VarArr, e6Var);
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
                spannableStringBuilder3.setSpan(new org.telegram.ui.Cells.i(str, ii1Var, i13), 0, spannableStringBuilder3.length(), 33);
                charSequence = spannableStringBuilder3;
            }
            r01Var.i(string, charSequence, 14, null, z20 ? LocaleController.getString(R.string.WalletSend) : null, new ii1(12, i2VarArr, walletTransactionPeer2));
        }
        Context context = this.i;
        if (j3 <= 0 || !wallettransaction.gasless) {
            Object obj2 = null;
            long j10 = j3;
            if (j3 <= 0 && wallettransaction.nft == null) {
                r42 = obj2;
                if (wallettransaction.preview) {
                    r42 = obj2;
                }
            }
            TextView textView2 = new TextView(context);
            TextView[] textViewArr = this.j;
            textViewArr[0] = textView2;
            textView2.setGravity(16);
            textViewArr[0].setIncludeFontPadding(false);
            textViewArr[0].setTextSize(1, 14.0f);
            textViewArr[0].setTextColor(z11 ? org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.z6, e6Var) : this.k);
            if (!wallettransaction.preview || j3 > 0) {
                c10 = 0;
                textViewArr[0].setText(a5.l0(i11, j10, e6Var));
            } else {
                SpannableString[] spannableStringArr = this.l;
                c10 = 0;
                if (spannableStringArr[0] == null) {
                    SpannableString spannableString = new SpannableString(LocaleController.getString(R.string.Loading));
                    spannableStringArr[0] = spannableString;
                    spannableString.setSpan(new ja0(AndroidUtilities.dp(150.0f), textViewArr[0]), 0, spannableStringArr[0].length(), 33);
                }
                textViewArr[0].setText(spannableStringArr[0]);
            }
            String string2 = LocaleController.getString(R.string.WalletFee);
            TextView textView3 = textViewArr[c10];
            TableRow tableRow = new TableRow(r01Var.getContext());
            tableRow.addView(new q01(r01Var, string2), new TableRow.LayoutParams(-2, -1));
            tableRow.addView(new o01(r01Var, textView3, false), new TableRow.LayoutParams(0, -1, 1.0f));
            r01Var.addView(tableRow);
            r42 = obj2;
        } else {
            SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder("x ");
            er erVar = new er(R.drawable.wallet_gram_small, 2);
            erVar.recolorDrawable = false;
            erVar.setSize(AndroidUtilities.dp(16.0f));
            erVar.translate(0.0f, AndroidUtilities.dp(1.0f));
            spannableStringBuilder4.setSpan(erVar, 0, 1, 33);
            spannableStringBuilder4.append((CharSequence) LocaleController.getString(R.string.WalletFeePaidByTelegram));
            r42 = 0;
            r01Var.e(LocaleController.getString(R.string.WalletFee), spannableStringBuilder4, "?", new org.telegram.messenger.h7(context, e6Var, i11, j3, 17), null);
        }
        if (wallettransaction.date != 0) {
            r01Var.c(LocaleController.getString(R.string.WalletDate), LocaleController.formatShortDateTime(wallettransaction.date), r42, r42);
        }
    }
}
