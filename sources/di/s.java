package di;

import android.content.Context;
import android.content.DialogInterface;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import bi.dd;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.fa0;
import org.telegram.ui.Components.v91;
import org.telegram.ui.Components.x01;
import org.telegram.ui.Components.xa;
import org.telegram.ui.Components.zq;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.yc1;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final /* synthetic */ class s implements Utilities.Callback {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ View d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ ViewGroup h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;
    public final /* synthetic */ Object l;

    public /* synthetic */ s(LinearLayout linearLayout, org.telegram.ui.Wallet.n4 n4Var, org.telegram.ui.ActionBar.u6 u6Var, int i10, TextView textView, org.telegram.ui.Wallet.j2[] j2VarArr, x01 x01Var, Utilities.Callback3 callback3, Context context, TextView[] textViewArr, SpannableString[] spannableStringArr) {
        this.c = linearLayout;
        this.d = n4Var;
        this.e = u6Var;
        this.b = i10;
        this.f = textView;
        this.g = j2VarArr;
        this.h = x01Var;
        this.i = callback3;
        this.j = context;
        this.k = textViewArr;
        this.l = spannableStringArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v11, types: [org.telegram.ui.Wallet.b4] */
    /* JADX WARN: Type inference failed for: r16v4, types: [org.telegram.ui.Components.x01] */
    /* JADX WARN: Type inference failed for: r3v6, types: [org.telegram.ui.Wallet.a4] */
    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        SpannableString[] spannableStringArr;
        long j10;
        boolean z10;
        org.telegram.ui.Wallet.j2 j2Var;
        xa xaVar;
        org.telegram.ui.Wallet.j2 j2Var2;
        xa xaVar2;
        x01 x01Var;
        int i10;
        CharSequence charSequence;
        int i11;
        char c10;
        org.telegram.ui.Wallet.j2 j2Var3;
        xa xaVar3;
        int i12 = this.a;
        Object obj2 = this.l;
        Object obj3 = this.k;
        Object obj4 = this.j;
        Object obj5 = this.i;
        ViewGroup viewGroup = this.h;
        Object obj6 = this.g;
        Object obj7 = this.f;
        Object obj8 = this.e;
        View view = this.d;
        Object obj9 = this.c;
        switch (i12) {
            case 0:
                long[] jArr = (long[]) obj9;
                v0 v0Var = (v0) obj7;
                bh.r rVar = (bh.r) viewGroup;
                bh.r rVar2 = (bh.r) obj5;
                bh.r rVar3 = (bh.r) obj4;
                t tVar = (t) obj3;
                boolean[] zArr = (boolean[]) obj2;
                Integer num = (Integer) obj;
                long intValue = num.intValue();
                jArr[0] = intValue;
                ((fi.d) view).i(dd.U0(false, LocaleController.formatString(R.string.StarsAddHighlightedMessage, LocaleController.formatNumber(intValue, ',')), (zq[]) obj8), true, true);
                v0Var.g = jArr[0];
                ((q0) obj6).set(v0Var);
                int intValue2 = num.intValue();
                int i13 = this.b;
                int b10 = u.b(i13, intValue2, 0);
                int b11 = u.b(i13, num.intValue(), 1);
                int b12 = u.b(i13, num.intValue(), 2);
                ((org.telegram.ui.Components.s6) rVar.b).c(b10 >= 60 ? LocaleController.formatString(R.string.SlowmodeMinutes, Integer.valueOf(b10 / 60)) : LocaleController.formatString(R.string.SlowmodeSeconds, Integer.valueOf(b10)), true, true);
                ((org.telegram.ui.Components.s6) rVar2.b).c(LocaleController.formatNumber(b11, ','), true, true);
                ((org.telegram.ui.Components.s6) rVar3.b).c(LocaleController.formatNumber(b12, ','), true, true);
                tVar.f(u.b(i13, num.intValue(), 3), u.b(i13, num.intValue(), 4), true ^ zArr[0]);
                zArr[0] = false;
                break;
            default:
                LinearLayout linearLayout = (LinearLayout) obj9;
                org.telegram.ui.Wallet.n4 n4Var = (org.telegram.ui.Wallet.n4) view;
                org.telegram.ui.ActionBar.u6 u6Var = (org.telegram.ui.ActionBar.u6) obj8;
                TextView textView = (TextView) obj7;
                final org.telegram.ui.Wallet.j2[] j2VarArr = (org.telegram.ui.Wallet.j2[]) obj6;
                x01 x01Var2 = (x01) viewGroup;
                Utilities.Callback3 callback3 = (Utilities.Callback3) obj5;
                Context context = (Context) obj4;
                TextView[] textViewArr = (TextView[]) obj3;
                SpannableString[] spannableStringArr2 = (SpannableString[]) obj2;
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj;
                long abs = Math.abs(wallettransaction.amount);
                final int i14 = 1;
                boolean z11 = wallettransaction.incoming;
                long abs2 = Math.abs(wallettransaction.fee);
                boolean z12 = wallettransaction.pending || wallettransaction.failed;
                boolean z13 = ((linearLayout.getParent() instanceof View) && (linearLayout.getParent().getParent() instanceof v91) && ((v91) linearLayout.getParent().getParent()).getViewPages()[0] != linearLayout.getParent()) ? false : true;
                boolean z14 = wallettransaction.key_change;
                boolean z15 = z13;
                int i15 = this.b;
                if (z14 || wallettransaction.nft != null) {
                    spannableStringArr = spannableStringArr2;
                    j10 = abs2;
                    z10 = z11;
                    if (!z14) {
                        TL_wallet.nftItem nftitem = wallettransaction.nft;
                        if (nftitem != null && z15 && (j2Var = j2VarArr[0]) != null && (xaVar = j2Var.e) != null) {
                            xaVar.setTitle(TextUtils.isEmpty(nftitem.name) ? LocaleController.getString(R.string.WalletCollectible) : wallettransaction.nft.name);
                        }
                    } else if (z15 && (j2Var2 = j2VarArr[0]) != null && (xaVar2 = j2Var2.e) != null) {
                        xaVar2.setTitle(org.telegram.ui.Wallet.l0.l("Grams", org.telegram.ui.Wallet.l0.q(org.telegram.ui.Wallet.l0.o(abs, false), 0.75f), R.string.Grams_other));
                    }
                } else {
                    org.telegram.ui.ActionBar.f7.V(n4Var, z12 ? org.telegram.ui.ActionBar.y6.z6 : org.telegram.ui.ActionBar.y6.Oh, u6Var);
                    SpannableStringBuilder q5 = org.telegram.ui.Wallet.l0.q(org.telegram.ui.Wallet.l0.o(abs, false), 0.75f);
                    spannableStringArr = spannableStringArr2;
                    q5.insert(0, (CharSequence) (z11 ? "+" : "–"));
                    if (z12) {
                        j10 = abs2;
                    } else {
                        j10 = abs2;
                        q5.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.y6.w0(z11 ? org.telegram.ui.ActionBar.y6.uj : org.telegram.ui.ActionBar.y6.G6, u6Var)), 0, q5.length(), 33);
                    }
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append((CharSequence) org.telegram.ui.Wallet.l0.l("Grams", q5, R.string.Grams_other));
                    int indexOf = TextUtils.indexOf(spannableStringBuilder, q5);
                    int length = q5.length() + indexOf;
                    if (indexOf > 0) {
                        z10 = z11;
                        i11 = 33;
                        spannableStringBuilder.setSpan(new RelativeSizeSpan(0.75f), 0, indexOf, 33);
                    } else {
                        z10 = z11;
                        i11 = 33;
                    }
                    if (indexOf >= 0 && length < spannableStringBuilder.length()) {
                        spannableStringBuilder.setSpan(new RelativeSizeSpan(0.75f), length, spannableStringBuilder.length(), i11);
                    }
                    n4Var.setText(spannableStringBuilder);
                    CharSequence m10 = org.telegram.ui.Wallet.l0.x(i15).m(abs, false);
                    if (z12) {
                        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(wallettransaction.failed ? LocaleController.getString(R.string.WalletFailed) : ea.a(textView, LocaleController.getString(R.string.WalletSending)));
                        c10 = 0;
                        spannableStringBuilder2.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.y6.w0(wallettransaction.failed ? org.telegram.ui.ActionBar.y6.p7 : org.telegram.ui.ActionBar.y6.n6, u6Var)), 0, spannableStringBuilder2.length(), 33);
                        textView.setText(LocaleController.formatSpannable(R.string.WalletTransactionAmountStatus, m10, spannableStringBuilder2));
                    } else {
                        c10 = 0;
                        textView.setText(m10);
                    }
                    if (z15 && (j2Var3 = j2VarArr[c10]) != null && (xaVar3 = j2Var3.e) != null) {
                        xaVar3.setTitle(org.telegram.ui.Wallet.l0.l("Grams", q5, R.string.Grams_other));
                    }
                }
                x01Var2.removeAllViews();
                final TL_wallet.WalletTransactionPeer walletTransactionPeer = wallettransaction.peer;
                int i16 = 9;
                if (walletTransactionPeer instanceof TL_wallet.walletTransactionPeerUser) {
                    TL_wallet.walletTransactionPeerUser wallettransactionpeeruser = (TL_wallet.walletTransactionPeerUser) walletTransactionPeer;
                    TLRPC.User user = MessagesController.getInstance(i15).getUser(Long.valueOf(wallettransactionpeeruser.user_id));
                    if (user != null && !UserObject.isService(user.id)) {
                        x01Var2.m(LocaleController.getString(z10 ? R.string.WalletSender : R.string.WalletRecipient), i15, wallettransactionpeeruser.user_id, new org.telegram.ui.Wallet.h(callback3, j2VarArr, wallettransactionpeeruser, 9), LocaleController.getString(R.string.WalletSend), callback3 != null ? null : new yc1(25, j2VarArr, user));
                    }
                    x01Var = x01Var2;
                    if (!TextUtils.isEmpty(wallettransactionpeeruser.domain) && !TextUtils.isEmpty(wallettransactionpeeruser.address)) {
                        x01Var.i(LocaleController.getString(R.string.WalletDomain), wallettransactionpeeruser.domain, new org.telegram.ui.Wallet.h(j2VarArr, user, wallettransactionpeeruser, 10));
                    }
                    i10 = i15;
                } else {
                    x01Var = x01Var2;
                    if (walletTransactionPeer instanceof TL_wallet.walletTransactionPeerChannel) {
                        if (MessagesController.getInstance(i15).getChat(Long.valueOf(walletTransactionPeer.channel_id)) != null) {
                            x01Var.n(LocaleController.getString(z10 ? R.string.WalletSender : R.string.WalletRecipient), i15, -walletTransactionPeer.channel_id, new org.telegram.ui.Wallet.h(callback3, j2VarArr, walletTransactionPeer, 11));
                        }
                        i10 = i15;
                        if (!TextUtils.isEmpty(walletTransactionPeer.domain) && !TextUtils.isEmpty(walletTransactionPeer.address)) {
                            final int i17 = 0;
                            x01Var.i(LocaleController.getString(R.string.WalletDomain), walletTransactionPeer.domain, new Runnable() { // from class: org.telegram.ui.Wallet.a4
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i17) {
                                        case 0:
                                            j2[] j2VarArr2 = j2VarArr;
                                            j2 j2Var4 = j2VarArr2[0];
                                            final int i18 = 1;
                                            final TL_wallet.WalletTransactionPeer walletTransactionPeer2 = walletTransactionPeer;
                                            j2Var4.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: org.telegram.ui.Wallet.d4
                                                @Override // android.content.DialogInterface.OnDismissListener
                                                public final void onDismiss(DialogInterface dialogInterface) {
                                                    switch (i18) {
                                                        case 0:
                                                            org.telegram.ui.ActionBar.r2 U = LaunchActivity.U();
                                                            if (U != null) {
                                                                U.presentFragment(new i9(walletTransactionPeer2.address));
                                                                break;
                                                            }
                                                            break;
                                                        default:
                                                            org.telegram.ui.ActionBar.r2 U2 = LaunchActivity.U();
                                                            if (U2 != null) {
                                                                TL_wallet.WalletTransactionPeer walletTransactionPeer3 = walletTransactionPeer2;
                                                                i9 i9Var = new i9(walletTransactionPeer3.address);
                                                                i9Var.w0(walletTransactionPeer3.domain);
                                                                U2.presentFragment(i9Var);
                                                                break;
                                                            }
                                                            break;
                                                    }
                                                }
                                            });
                                            j2VarArr2[0].dismiss();
                                            break;
                                        default:
                                            j2[] j2VarArr3 = j2VarArr;
                                            j2 j2Var5 = j2VarArr3[0];
                                            final int i19 = 0;
                                            final TL_wallet.WalletTransactionPeer walletTransactionPeer3 = walletTransactionPeer;
                                            j2Var5.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: org.telegram.ui.Wallet.d4
                                                @Override // android.content.DialogInterface.OnDismissListener
                                                public final void onDismiss(DialogInterface dialogInterface) {
                                                    switch (i19) {
                                                        case 0:
                                                            org.telegram.ui.ActionBar.r2 U = LaunchActivity.U();
                                                            if (U != null) {
                                                                U.presentFragment(new i9(walletTransactionPeer3.address));
                                                                break;
                                                            }
                                                            break;
                                                        default:
                                                            org.telegram.ui.ActionBar.r2 U2 = LaunchActivity.U();
                                                            if (U2 != null) {
                                                                TL_wallet.WalletTransactionPeer walletTransactionPeer32 = walletTransactionPeer3;
                                                                i9 i9Var = new i9(walletTransactionPeer32.address);
                                                                i9Var.w0(walletTransactionPeer32.domain);
                                                                U2.presentFragment(i9Var);
                                                                break;
                                                            }
                                                            break;
                                                    }
                                                }
                                            });
                                            j2VarArr3[0].dismiss();
                                            break;
                                    }
                                }
                            });
                        }
                    } else {
                        i10 = i15;
                        if (walletTransactionPeer instanceof TL_wallet.walletTransactionPeerAddress) {
                            final TL_wallet.walletTransactionPeerAddress wallettransactionpeeraddress = (TL_wallet.walletTransactionPeerAddress) walletTransactionPeer;
                            if (!TextUtils.isEmpty(wallettransactionpeeraddress.domain)) {
                                if (TextUtils.isEmpty(wallettransactionpeeraddress.address)) {
                                    x01Var.i(LocaleController.getString(z10 ? R.string.WalletSender : R.string.WalletRecipient), wallettransactionpeeraddress.domain, new ag.c(25));
                                } else {
                                    final int i18 = 0;
                                    x01Var.h(LocaleController.getString(z10 ? R.string.WalletSender : R.string.WalletRecipient), wallettransactionpeeraddress.domain, new Runnable() { // from class: org.telegram.ui.Wallet.b4
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (i18) {
                                                case 0:
                                                    j2[] j2VarArr2 = j2VarArr;
                                                    j2 j2Var4 = j2VarArr2[0];
                                                    final int i19 = 0;
                                                    final TL_wallet.walletTransactionPeerAddress wallettransactionpeeraddress2 = wallettransactionpeeraddress;
                                                    j2Var4.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: org.telegram.ui.Wallet.e4
                                                        @Override // android.content.DialogInterface.OnDismissListener
                                                        public final void onDismiss(DialogInterface dialogInterface) {
                                                            switch (i19) {
                                                                case 0:
                                                                    org.telegram.ui.ActionBar.r2 U = LaunchActivity.U();
                                                                    if (U != null) {
                                                                        TL_wallet.walletTransactionPeerAddress wallettransactionpeeraddress3 = wallettransactionpeeraddress2;
                                                                        i9 i9Var = new i9(wallettransactionpeeraddress3.address);
                                                                        i9Var.w0(wallettransactionpeeraddress3.domain);
                                                                        U.presentFragment(i9Var);
                                                                        break;
                                                                    }
                                                                    break;
                                                                default:
                                                                    org.telegram.ui.ActionBar.r2 U2 = LaunchActivity.U();
                                                                    if (U2 != null) {
                                                                        TL_wallet.walletTransactionPeerAddress wallettransactionpeeraddress4 = wallettransactionpeeraddress2;
                                                                        i9 i9Var2 = new i9(wallettransactionpeeraddress4.address);
                                                                        i9Var2.w0(wallettransactionpeeraddress4.domain);
                                                                        U2.presentFragment(i9Var2);
                                                                        break;
                                                                    }
                                                                    break;
                                                            }
                                                        }
                                                    });
                                                    j2VarArr2[0].dismiss();
                                                    break;
                                                default:
                                                    j2[] j2VarArr3 = j2VarArr;
                                                    j2 j2Var5 = j2VarArr3[0];
                                                    final int i20 = 1;
                                                    final TL_wallet.walletTransactionPeerAddress wallettransactionpeeraddress3 = wallettransactionpeeraddress;
                                                    j2Var5.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: org.telegram.ui.Wallet.e4
                                                        @Override // android.content.DialogInterface.OnDismissListener
                                                        public final void onDismiss(DialogInterface dialogInterface) {
                                                            switch (i20) {
                                                                case 0:
                                                                    org.telegram.ui.ActionBar.r2 U = LaunchActivity.U();
                                                                    if (U != null) {
                                                                        TL_wallet.walletTransactionPeerAddress wallettransactionpeeraddress32 = wallettransactionpeeraddress3;
                                                                        i9 i9Var = new i9(wallettransactionpeeraddress32.address);
                                                                        i9Var.w0(wallettransactionpeeraddress32.domain);
                                                                        U.presentFragment(i9Var);
                                                                        break;
                                                                    }
                                                                    break;
                                                                default:
                                                                    org.telegram.ui.ActionBar.r2 U2 = LaunchActivity.U();
                                                                    if (U2 != null) {
                                                                        TL_wallet.walletTransactionPeerAddress wallettransactionpeeraddress4 = wallettransactionpeeraddress3;
                                                                        i9 i9Var2 = new i9(wallettransactionpeeraddress4.address);
                                                                        i9Var2.w0(wallettransactionpeeraddress4.domain);
                                                                        U2.presentFragment(i9Var2);
                                                                        break;
                                                                    }
                                                                    break;
                                                            }
                                                        }
                                                    });
                                                    j2VarArr3[0].dismiss();
                                                    break;
                                            }
                                        }
                                    }, LocaleController.getString(R.string.WalletSend), callback3 != null ? null : new Runnable() { // from class: org.telegram.ui.Wallet.b4
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (i14) {
                                                case 0:
                                                    j2[] j2VarArr2 = j2VarArr;
                                                    j2 j2Var4 = j2VarArr2[0];
                                                    final int i19 = 0;
                                                    final TL_wallet.walletTransactionPeerAddress wallettransactionpeeraddress2 = wallettransactionpeeraddress;
                                                    j2Var4.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: org.telegram.ui.Wallet.e4
                                                        @Override // android.content.DialogInterface.OnDismissListener
                                                        public final void onDismiss(DialogInterface dialogInterface) {
                                                            switch (i19) {
                                                                case 0:
                                                                    org.telegram.ui.ActionBar.r2 U = LaunchActivity.U();
                                                                    if (U != null) {
                                                                        TL_wallet.walletTransactionPeerAddress wallettransactionpeeraddress32 = wallettransactionpeeraddress2;
                                                                        i9 i9Var = new i9(wallettransactionpeeraddress32.address);
                                                                        i9Var.w0(wallettransactionpeeraddress32.domain);
                                                                        U.presentFragment(i9Var);
                                                                        break;
                                                                    }
                                                                    break;
                                                                default:
                                                                    org.telegram.ui.ActionBar.r2 U2 = LaunchActivity.U();
                                                                    if (U2 != null) {
                                                                        TL_wallet.walletTransactionPeerAddress wallettransactionpeeraddress4 = wallettransactionpeeraddress2;
                                                                        i9 i9Var2 = new i9(wallettransactionpeeraddress4.address);
                                                                        i9Var2.w0(wallettransactionpeeraddress4.domain);
                                                                        U2.presentFragment(i9Var2);
                                                                        break;
                                                                    }
                                                                    break;
                                                            }
                                                        }
                                                    });
                                                    j2VarArr2[0].dismiss();
                                                    break;
                                                default:
                                                    j2[] j2VarArr3 = j2VarArr;
                                                    j2 j2Var5 = j2VarArr3[0];
                                                    final int i20 = 1;
                                                    final TL_wallet.walletTransactionPeerAddress wallettransactionpeeraddress3 = wallettransactionpeeraddress;
                                                    j2Var5.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: org.telegram.ui.Wallet.e4
                                                        @Override // android.content.DialogInterface.OnDismissListener
                                                        public final void onDismiss(DialogInterface dialogInterface) {
                                                            switch (i20) {
                                                                case 0:
                                                                    org.telegram.ui.ActionBar.r2 U = LaunchActivity.U();
                                                                    if (U != null) {
                                                                        TL_wallet.walletTransactionPeerAddress wallettransactionpeeraddress32 = wallettransactionpeeraddress3;
                                                                        i9 i9Var = new i9(wallettransactionpeeraddress32.address);
                                                                        i9Var.w0(wallettransactionpeeraddress32.domain);
                                                                        U.presentFragment(i9Var);
                                                                        break;
                                                                    }
                                                                    break;
                                                                default:
                                                                    org.telegram.ui.ActionBar.r2 U2 = LaunchActivity.U();
                                                                    if (U2 != null) {
                                                                        TL_wallet.walletTransactionPeerAddress wallettransactionpeeraddress4 = wallettransactionpeeraddress3;
                                                                        i9 i9Var2 = new i9(wallettransactionpeeraddress4.address);
                                                                        i9Var2.w0(wallettransactionpeeraddress4.domain);
                                                                        U2.presentFragment(i9Var2);
                                                                        break;
                                                                    }
                                                                    break;
                                                            }
                                                        }
                                                    });
                                                    j2VarArr3[0].dismiss();
                                                    break;
                                            }
                                        }
                                    });
                                    x01Var = x01Var;
                                }
                            }
                        }
                    }
                }
                final TL_wallet.WalletTransactionPeer walletTransactionPeer2 = wallettransaction.peer;
                boolean z16 = walletTransactionPeer2 instanceof TL_wallet.walletTransactionPeerUser;
                if (z16 || (walletTransactionPeer2 instanceof TL_wallet.walletTransactionPeerChannel) || (walletTransactionPeer2 instanceof TL_wallet.walletTransactionPeerAddress)) {
                    boolean z17 = callback3 == null && !(z16 && MessagesController.getInstance(i10).getUser(Long.valueOf(walletTransactionPeer2.user_id)) != null && !UserObject.isService(walletTransactionPeer2.user_id)) && TextUtils.isEmpty(walletTransactionPeer2.domain) && !TextUtils.isEmpty(walletTransactionPeer2.address);
                    String string = LocaleController.getString(R.string.WalletAddress);
                    String str = walletTransactionPeer2.address;
                    yc1 yc1Var = new yc1(26, j2VarArr, u6Var);
                    if (TextUtils.isEmpty(str)) {
                        charSequence = LocaleController.getString(R.string.WalletUnknown);
                    } else {
                        SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder();
                        for (int i19 = 0; i19 < str.length(); i19++) {
                            if (i19 > 0 && i19 % 4 == 0) {
                                spannableStringBuilder3.append(i19 % 16 == 0 ? '\n' : ' ');
                                spannableStringBuilder3.length();
                            }
                            spannableStringBuilder3.append(str.charAt(i19));
                            if (i19 % 4 == 3) {
                                spannableStringBuilder3.length();
                            }
                        }
                        spannableStringBuilder3.setSpan(new org.telegram.ui.Cells.i(str, yc1Var, i16), 0, spannableStringBuilder3.length(), 33);
                        charSequence = spannableStringBuilder3;
                    }
                    final int i20 = 1;
                    x01Var.j(string, charSequence, 14, null, z17 ? LocaleController.getString(R.string.WalletSend) : null, new Runnable() { // from class: org.telegram.ui.Wallet.a4
                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i20) {
                                case 0:
                                    j2[] j2VarArr2 = j2VarArr;
                                    j2 j2Var4 = j2VarArr2[0];
                                    final int i182 = 1;
                                    final TL_wallet.WalletTransactionPeer walletTransactionPeer22 = walletTransactionPeer2;
                                    j2Var4.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: org.telegram.ui.Wallet.d4
                                        @Override // android.content.DialogInterface.OnDismissListener
                                        public final void onDismiss(DialogInterface dialogInterface) {
                                            switch (i182) {
                                                case 0:
                                                    org.telegram.ui.ActionBar.r2 U = LaunchActivity.U();
                                                    if (U != null) {
                                                        U.presentFragment(new i9(walletTransactionPeer22.address));
                                                        break;
                                                    }
                                                    break;
                                                default:
                                                    org.telegram.ui.ActionBar.r2 U2 = LaunchActivity.U();
                                                    if (U2 != null) {
                                                        TL_wallet.WalletTransactionPeer walletTransactionPeer32 = walletTransactionPeer22;
                                                        i9 i9Var = new i9(walletTransactionPeer32.address);
                                                        i9Var.w0(walletTransactionPeer32.domain);
                                                        U2.presentFragment(i9Var);
                                                        break;
                                                    }
                                                    break;
                                            }
                                        }
                                    });
                                    j2VarArr2[0].dismiss();
                                    break;
                                default:
                                    j2[] j2VarArr3 = j2VarArr;
                                    j2 j2Var5 = j2VarArr3[0];
                                    final int i192 = 0;
                                    final TL_wallet.WalletTransactionPeer walletTransactionPeer3 = walletTransactionPeer2;
                                    j2Var5.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: org.telegram.ui.Wallet.d4
                                        @Override // android.content.DialogInterface.OnDismissListener
                                        public final void onDismiss(DialogInterface dialogInterface) {
                                            switch (i192) {
                                                case 0:
                                                    org.telegram.ui.ActionBar.r2 U = LaunchActivity.U();
                                                    if (U != null) {
                                                        U.presentFragment(new i9(walletTransactionPeer3.address));
                                                        break;
                                                    }
                                                    break;
                                                default:
                                                    org.telegram.ui.ActionBar.r2 U2 = LaunchActivity.U();
                                                    if (U2 != null) {
                                                        TL_wallet.WalletTransactionPeer walletTransactionPeer32 = walletTransactionPeer3;
                                                        i9 i9Var = new i9(walletTransactionPeer32.address);
                                                        i9Var.w0(walletTransactionPeer32.domain);
                                                        U2.presentFragment(i9Var);
                                                        break;
                                                    }
                                                    break;
                                            }
                                        }
                                    });
                                    j2VarArr3[0].dismiss();
                                    break;
                            }
                        }
                    });
                }
                if (j10 <= 0 || !wallettransaction.gasless) {
                    int i21 = i10;
                    long j11 = j10;
                    if (j10 > 0 || wallettransaction.nft != null || wallettransaction.preview) {
                        TextView textView2 = new TextView(context);
                        textViewArr[0] = textView2;
                        textView2.setGravity(16);
                        textViewArr[0].setIncludeFontPadding(false);
                        textViewArr[0].setTextSize(1, 14.0f);
                        org.telegram.ui.ActionBar.f7.V(textViewArr[0], z12 ? org.telegram.ui.ActionBar.y6.z6 : org.telegram.ui.ActionBar.y6.G6, u6Var);
                        if (!wallettransaction.preview || j10 > 0) {
                            textViewArr[0].setText(org.telegram.ui.Wallet.m5.s0(i21, j11, u6Var));
                        } else {
                            if (spannableStringArr[0] == null) {
                                SpannableString spannableString = new SpannableString(LocaleController.getString(R.string.Loading));
                                spannableStringArr[0] = spannableString;
                                spannableString.setSpan(new fa0(AndroidUtilities.dp(150.0f), textViewArr[0]), 0, spannableStringArr[0].length(), 33);
                            }
                            textViewArr[0].setText(spannableStringArr[0]);
                        }
                        x01Var.f(textViewArr[0], LocaleController.getString(R.string.WalletFee));
                    }
                } else {
                    SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder("x ");
                    zq zqVar = new zq(R.drawable.wallet_gram_small, 2);
                    zqVar.recolorDrawable = false;
                    zqVar.setSize(AndroidUtilities.dp(16.0f));
                    zqVar.translate(0.0f, AndroidUtilities.dp(1.0f));
                    spannableStringBuilder4.setSpan(zqVar, 0, 1, 33);
                    spannableStringBuilder4.append((CharSequence) LocaleController.getString(R.string.WalletFeePaidByTelegram));
                    x01Var.e(LocaleController.getString(R.string.WalletFee), spannableStringBuilder4, "?", new bi.da(context, u6Var, i10, j10, 19), null);
                }
                if (wallettransaction.date != 0) {
                    x01Var.c(LocaleController.getString(R.string.WalletDate), LocaleController.formatShortDateTime(wallettransaction.date), null, null);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ s(long[] jArr, fi.d dVar, zq[] zqVarArr, v0 v0Var, q0 q0Var, int i10, bh.r rVar, bh.r rVar2, bh.r rVar3, t tVar, boolean[] zArr) {
        this.c = jArr;
        this.d = dVar;
        this.e = zqVarArr;
        this.f = v0Var;
        this.g = q0Var;
        this.b = i10;
        this.h = rVar;
        this.i = rVar2;
        this.j = rVar3;
        this.k = tVar;
        this.l = zArr;
    }
}
