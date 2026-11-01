package org.telegram.ui.Wallet;

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
import org.telegram.messenger.beta.R;
import org.telegram.messenger.dd;
import org.telegram.messenger.i20;
import org.telegram.messenger.m20;
import org.telegram.messenger.r20;
import org.telegram.messenger.wp;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.dq;
import org.telegram.ui.Components.u80;
import org.telegram.ui.Components.x71;
import org.telegram.ui.Components.xy0;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class q4 implements r20 {
    public final /* synthetic */ int a = 0;
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

    public /* synthetic */ q4(LinearLayout linearLayout, d5 d5Var, org.telegram.ui.ActionBar.p6 p6Var, int i10, TextView textView, a3[] a3VarArr, xy0 xy0Var, m20 m20Var, Context context, TextView[] textViewArr, SpannableString[] spannableStringArr) {
        this.c = linearLayout;
        this.d = d5Var;
        this.e = p6Var;
        this.b = i10;
        this.f = textView;
        this.g = a3VarArr;
        this.h = xy0Var;
        this.i = m20Var;
        this.j = context;
        this.k = textViewArr;
        this.l = spannableStringArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:97:0x05bb  */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v15 */
    /* JADX WARN: Type inference failed for: r10v16 */
    /* JADX WARN: Type inference failed for: r10v17 */
    /* JADX WARN: Type inference failed for: r10v18 */
    /* JADX WARN: Type inference failed for: r10v19 */
    /* JADX WARN: Type inference failed for: r10v20 */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v4, types: [org.telegram.ui.Components.xy0] */
    /* JADX WARN: Type inference failed for: r14v5 */
    /* JADX WARN: Type inference failed for: r14v6, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r14v7 */
    /* JADX WARN: Type inference failed for: r17v4, types: [org.telegram.ui.Components.xy0] */
    /* JADX WARN: Type inference failed for: r3v3, types: [org.telegram.ui.Wallet.s4] */
    /* JADX WARN: Type inference failed for: r4v39 */
    /* JADX WARN: Type inference failed for: r4v44, types: [java.lang.String, org.telegram.ui.Components.ec[], org.telegram.ui.Components.wy0[]] */
    /* JADX WARN: Type inference failed for: r4v45 */
    /* JADX WARN: Type inference failed for: r8v4, types: [org.telegram.ui.Wallet.t4] */
    @Override // org.telegram.messenger.r20
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Object obj) {
        Context context;
        boolean z10;
        int i10;
        TextView[] textViewArr;
        boolean z11;
        a3 a3Var;
        org.telegram.ui.Components.da daVar;
        a3 a3Var2;
        org.telegram.ui.Components.da daVar2;
        int i11;
        ?? r14;
        String L0;
        xy0 xy0Var;
        CharSequence charSequence;
        ?? r42;
        xy0 xy0Var2;
        int i12;
        String str;
        String L02;
        int i13;
        char c10;
        a3 a3Var3;
        org.telegram.ui.Components.da daVar3;
        int i14 = this.a;
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
        final int i15 = 1;
        switch (i14) {
            case 0:
                LinearLayout linearLayout = (LinearLayout) obj9;
                d5 d5Var = (d5) view;
                org.telegram.ui.ActionBar.p6 p6Var = (org.telegram.ui.ActionBar.p6) obj8;
                TextView textView = (TextView) obj7;
                final a3[] a3VarArr = (a3[]) obj6;
                xy0 xy0Var3 = (xy0) viewGroup;
                m20 m20Var = (m20) obj5;
                Context context2 = (Context) obj4;
                TextView[] textViewArr2 = (TextView[]) obj3;
                SpannableString[] spannableStringArr = (SpannableString[]) obj2;
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj;
                long abs = Math.abs(wallettransaction.amount);
                boolean z12 = wallettransaction.incoming;
                long abs2 = Math.abs(wallettransaction.fee);
                boolean z13 = wallettransaction.pending || wallettransaction.failed;
                boolean z14 = ((linearLayout.getParent() instanceof View) && (linearLayout.getParent().getParent() instanceof x71) && ((x71) linearLayout.getParent().getParent()).getViewPages()[0] != linearLayout.getParent()) ? false : true;
                boolean z15 = wallettransaction.key_change;
                int i16 = this.b;
                boolean z16 = z14;
                if (z15 || wallettransaction.nft != null) {
                    context = context2;
                    z10 = z12;
                    i10 = i16;
                    textViewArr = textViewArr2;
                    z11 = z13;
                    if (!z15) {
                        TL_wallet.nftItem nftitem = wallettransaction.nft;
                        if (nftitem != null && z16 && (a3Var = a3VarArr[0]) != null && (daVar = a3Var.l1) != null) {
                            daVar.setTitle(TextUtils.isEmpty(nftitem.name) ? dd.L0(2131743202, null) : wallettransaction.nft.name);
                        }
                    } else if (z16 && (a3Var2 = a3VarArr[0]) != null && (daVar2 = a3Var2.l1) != null) {
                        daVar2.setTitle(k0.l("Grams", k0.q(k0.o(abs, false), 0.75f), 2131749516));
                    }
                } else {
                    org.telegram.ui.ActionBar.a7.V(d5Var, z13 ? org.telegram.ui.ActionBar.t6.z6 : org.telegram.ui.ActionBar.t6.Ci, p6Var);
                    SpannableStringBuilder q6 = k0.q(k0.o(abs, false), 0.75f);
                    context = context2;
                    q6.insert(0, (CharSequence) (z12 ? "+" : "–"));
                    if (z13) {
                        z10 = z12;
                        i10 = i16;
                    } else {
                        z10 = z12;
                        i10 = i16;
                        q6.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.t6.w0(z12 ? org.telegram.ui.ActionBar.t6.ik : org.telegram.ui.ActionBar.t6.G6, p6Var)), 0, q6.length(), 33);
                    }
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append((CharSequence) k0.l("Grams", q6, 2131749516));
                    int indexOf = TextUtils.indexOf(spannableStringBuilder, q6);
                    int length = q6.length() + indexOf;
                    if (indexOf > 0) {
                        textViewArr = textViewArr2;
                        z11 = z13;
                        i13 = 33;
                        spannableStringBuilder.setSpan(new RelativeSizeSpan(0.75f), 0, indexOf, 33);
                    } else {
                        textViewArr = textViewArr2;
                        z11 = z13;
                        i13 = 33;
                    }
                    if (indexOf >= 0 && length < spannableStringBuilder.length()) {
                        spannableStringBuilder.setSpan(new RelativeSizeSpan(0.75f), length, spannableStringBuilder.length(), i13);
                    }
                    d5Var.setText(spannableStringBuilder);
                    CharSequence m10 = k0.x(i10).m(abs, false);
                    if (z11) {
                        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(wallettransaction.failed ? dd.L0(2131743149, null) : th.u7.a(textView, dd.L0(2131743040, null)));
                        c10 = 0;
                        spannableStringBuilder2.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.t6.w0(wallettransaction.failed ? org.telegram.ui.ActionBar.t6.p7 : org.telegram.ui.ActionBar.t6.n6, p6Var)), 0, spannableStringBuilder2.length(), 33);
                        textView.setText(dd.V(null, null, 2131743013, m10, spannableStringBuilder2));
                    } else {
                        c10 = 0;
                        textView.setText(m10);
                    }
                    if (z16 && (a3Var3 = a3VarArr[c10]) != null && (daVar3 = a3Var3.l1) != null) {
                        daVar3.setTitle(k0.l("Grams", q6, 2131749516));
                    }
                }
                xy0Var3.removeAllViews();
                final TL_wallet.WalletTransactionPeer walletTransactionPeer = wallettransaction.peer;
                int i17 = 11;
                if (walletTransactionPeer instanceof TL_wallet.walletTransactionPeerUser) {
                    TL_wallet.walletTransactionPeerUser wallettransactionpeeruser = (TL_wallet.walletTransactionPeerUser) walletTransactionPeer;
                    TLRPC.User Z1 = wp.r1(i10).Z1(Long.valueOf(wallettransactionpeeruser.user_id));
                    if (Z1 == null || i20.A(Z1.id)) {
                        xy0Var2 = xy0Var3;
                        i12 = i10;
                    } else {
                        if (z10) {
                            str = null;
                            L02 = dd.L0(2131743041, null);
                        } else {
                            str = null;
                            L02 = dd.L0(2131743066, null);
                        }
                        i12 = i10;
                        xy0Var3.m(L02, i12, wallettransactionpeeruser.user_id, new g(m20Var, a3VarArr, wallettransactionpeeruser, 11), dd.L0(2131743048, str), m20Var != null ? null : new m2(6, a3VarArr, Z1));
                        xy0Var2 = xy0Var3;
                    }
                    if (!TextUtils.isEmpty(wallettransactionpeeruser.domain) && !TextUtils.isEmpty(wallettransactionpeeruser.address)) {
                        xy0Var2.i(dd.L0(2131743155, null), wallettransactionpeeruser.domain, new g(a3VarArr, Z1, wallettransactionpeeruser, 12));
                    }
                    i11 = i12;
                    xy0Var = xy0Var2;
                } else {
                    xy0 xy0Var4 = xy0Var3;
                    int i18 = i10;
                    if (walletTransactionPeer instanceof TL_wallet.walletTransactionPeerChannel) {
                        if (wp.r1(i18).L0(Long.valueOf(walletTransactionPeer.channel_id)) != null) {
                            xy0Var4.n(z10 ? dd.L0(2131743041, null) : dd.L0(2131743066, null), i18, -walletTransactionPeer.channel_id, new g(m20Var, a3VarArr, walletTransactionPeer, 13));
                        }
                        i11 = i18;
                        xy0Var = xy0Var4;
                        if (!TextUtils.isEmpty(walletTransactionPeer.domain)) {
                            xy0Var = xy0Var4;
                            if (!TextUtils.isEmpty(walletTransactionPeer.address)) {
                                final int i19 = 0;
                                xy0Var4.i(dd.L0(2131743155, null), walletTransactionPeer.domain, new Runnable() { // from class: org.telegram.ui.Wallet.s4
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i19) {
                                            case 0:
                                                a3[] a3VarArr2 = a3VarArr;
                                                a3 a3Var4 = a3VarArr2[0];
                                                final int i20 = 1;
                                                final TL_wallet.WalletTransactionPeer walletTransactionPeer2 = walletTransactionPeer;
                                                a3Var4.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: org.telegram.ui.Wallet.v4
                                                    @Override // android.content.DialogInterface.OnDismissListener
                                                    public final void onDismiss(DialogInterface dialogInterface) {
                                                        switch (i20) {
                                                            case 0:
                                                                org.telegram.ui.ActionBar.k2 T = LaunchActivity.T();
                                                                if (T != null) {
                                                                    T.presentFragment(new r9(walletTransactionPeer2.address));
                                                                    break;
                                                                }
                                                                break;
                                                            default:
                                                                org.telegram.ui.ActionBar.k2 T2 = LaunchActivity.T();
                                                                if (T2 != null) {
                                                                    TL_wallet.WalletTransactionPeer walletTransactionPeer3 = walletTransactionPeer2;
                                                                    r9 r9Var = new r9(walletTransactionPeer3.address);
                                                                    r9Var.A0(walletTransactionPeer3.domain);
                                                                    T2.presentFragment(r9Var);
                                                                    break;
                                                                }
                                                                break;
                                                        }
                                                    }
                                                });
                                                a3VarArr2[0].dismiss();
                                                break;
                                            default:
                                                a3[] a3VarArr3 = a3VarArr;
                                                a3 a3Var5 = a3VarArr3[0];
                                                final int i21 = 0;
                                                final TL_wallet.WalletTransactionPeer walletTransactionPeer3 = walletTransactionPeer;
                                                a3Var5.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: org.telegram.ui.Wallet.v4
                                                    @Override // android.content.DialogInterface.OnDismissListener
                                                    public final void onDismiss(DialogInterface dialogInterface) {
                                                        switch (i21) {
                                                            case 0:
                                                                org.telegram.ui.ActionBar.k2 T = LaunchActivity.T();
                                                                if (T != null) {
                                                                    T.presentFragment(new r9(walletTransactionPeer3.address));
                                                                    break;
                                                                }
                                                                break;
                                                            default:
                                                                org.telegram.ui.ActionBar.k2 T2 = LaunchActivity.T();
                                                                if (T2 != null) {
                                                                    TL_wallet.WalletTransactionPeer walletTransactionPeer32 = walletTransactionPeer3;
                                                                    r9 r9Var = new r9(walletTransactionPeer32.address);
                                                                    r9Var.A0(walletTransactionPeer32.domain);
                                                                    T2.presentFragment(r9Var);
                                                                    break;
                                                                }
                                                                break;
                                                        }
                                                    }
                                                });
                                                a3VarArr3[0].dismiss();
                                                break;
                                        }
                                    }
                                });
                                xy0Var = xy0Var4;
                            }
                        }
                    } else {
                        i11 = i18;
                        xy0Var = xy0Var4;
                        if (walletTransactionPeer instanceof TL_wallet.walletTransactionPeerAddress) {
                            final TL_wallet.walletTransactionPeerAddress wallettransactionpeeraddress = (TL_wallet.walletTransactionPeerAddress) walletTransactionPeer;
                            xy0Var = xy0Var4;
                            if (!TextUtils.isEmpty(wallettransactionpeeraddress.domain)) {
                                if (TextUtils.isEmpty(wallettransactionpeeraddress.address)) {
                                    xy0Var4.i(z10 ? dd.L0(2131743041, null) : dd.L0(2131743066, null), wallettransactionpeeraddress.domain, new ag.f3(13));
                                    xy0Var = xy0Var4;
                                } else {
                                    if (z10) {
                                        r14 = null;
                                        L0 = dd.L0(2131743041, null);
                                    } else {
                                        r14 = null;
                                        L0 = dd.L0(2131743066, null);
                                    }
                                    final int i20 = 0;
                                    xy0Var4.h(L0, wallettransactionpeeraddress.domain, new Runnable() { // from class: org.telegram.ui.Wallet.t4
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (i20) {
                                                case 0:
                                                    a3[] a3VarArr2 = a3VarArr;
                                                    a3 a3Var4 = a3VarArr2[0];
                                                    final int i21 = 0;
                                                    final TL_wallet.walletTransactionPeerAddress wallettransactionpeeraddress2 = wallettransactionpeeraddress;
                                                    a3Var4.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: org.telegram.ui.Wallet.w4
                                                        @Override // android.content.DialogInterface.OnDismissListener
                                                        public final void onDismiss(DialogInterface dialogInterface) {
                                                            switch (i21) {
                                                                case 0:
                                                                    org.telegram.ui.ActionBar.k2 T = LaunchActivity.T();
                                                                    if (T != null) {
                                                                        TL_wallet.walletTransactionPeerAddress wallettransactionpeeraddress3 = wallettransactionpeeraddress2;
                                                                        r9 r9Var = new r9(wallettransactionpeeraddress3.address);
                                                                        r9Var.A0(wallettransactionpeeraddress3.domain);
                                                                        T.presentFragment(r9Var);
                                                                        break;
                                                                    }
                                                                    break;
                                                                default:
                                                                    org.telegram.ui.ActionBar.k2 T2 = LaunchActivity.T();
                                                                    if (T2 != null) {
                                                                        TL_wallet.walletTransactionPeerAddress wallettransactionpeeraddress4 = wallettransactionpeeraddress2;
                                                                        r9 r9Var2 = new r9(wallettransactionpeeraddress4.address);
                                                                        r9Var2.A0(wallettransactionpeeraddress4.domain);
                                                                        T2.presentFragment(r9Var2);
                                                                        break;
                                                                    }
                                                                    break;
                                                            }
                                                        }
                                                    });
                                                    a3VarArr2[0].dismiss();
                                                    break;
                                                default:
                                                    a3[] a3VarArr3 = a3VarArr;
                                                    a3 a3Var5 = a3VarArr3[0];
                                                    final int i22 = 1;
                                                    final TL_wallet.walletTransactionPeerAddress wallettransactionpeeraddress3 = wallettransactionpeeraddress;
                                                    a3Var5.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: org.telegram.ui.Wallet.w4
                                                        @Override // android.content.DialogInterface.OnDismissListener
                                                        public final void onDismiss(DialogInterface dialogInterface) {
                                                            switch (i22) {
                                                                case 0:
                                                                    org.telegram.ui.ActionBar.k2 T = LaunchActivity.T();
                                                                    if (T != null) {
                                                                        TL_wallet.walletTransactionPeerAddress wallettransactionpeeraddress32 = wallettransactionpeeraddress3;
                                                                        r9 r9Var = new r9(wallettransactionpeeraddress32.address);
                                                                        r9Var.A0(wallettransactionpeeraddress32.domain);
                                                                        T.presentFragment(r9Var);
                                                                        break;
                                                                    }
                                                                    break;
                                                                default:
                                                                    org.telegram.ui.ActionBar.k2 T2 = LaunchActivity.T();
                                                                    if (T2 != null) {
                                                                        TL_wallet.walletTransactionPeerAddress wallettransactionpeeraddress4 = wallettransactionpeeraddress3;
                                                                        r9 r9Var2 = new r9(wallettransactionpeeraddress4.address);
                                                                        r9Var2.A0(wallettransactionpeeraddress4.domain);
                                                                        T2.presentFragment(r9Var2);
                                                                        break;
                                                                    }
                                                                    break;
                                                            }
                                                        }
                                                    });
                                                    a3VarArr3[0].dismiss();
                                                    break;
                                            }
                                        }
                                    }, dd.L0(2131743048, r14), m20Var != null ? r14 : new Runnable() { // from class: org.telegram.ui.Wallet.t4
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (i15) {
                                                case 0:
                                                    a3[] a3VarArr2 = a3VarArr;
                                                    a3 a3Var4 = a3VarArr2[0];
                                                    final int i21 = 0;
                                                    final TL_wallet.walletTransactionPeerAddress wallettransactionpeeraddress2 = wallettransactionpeeraddress;
                                                    a3Var4.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: org.telegram.ui.Wallet.w4
                                                        @Override // android.content.DialogInterface.OnDismissListener
                                                        public final void onDismiss(DialogInterface dialogInterface) {
                                                            switch (i21) {
                                                                case 0:
                                                                    org.telegram.ui.ActionBar.k2 T = LaunchActivity.T();
                                                                    if (T != null) {
                                                                        TL_wallet.walletTransactionPeerAddress wallettransactionpeeraddress32 = wallettransactionpeeraddress2;
                                                                        r9 r9Var = new r9(wallettransactionpeeraddress32.address);
                                                                        r9Var.A0(wallettransactionpeeraddress32.domain);
                                                                        T.presentFragment(r9Var);
                                                                        break;
                                                                    }
                                                                    break;
                                                                default:
                                                                    org.telegram.ui.ActionBar.k2 T2 = LaunchActivity.T();
                                                                    if (T2 != null) {
                                                                        TL_wallet.walletTransactionPeerAddress wallettransactionpeeraddress4 = wallettransactionpeeraddress2;
                                                                        r9 r9Var2 = new r9(wallettransactionpeeraddress4.address);
                                                                        r9Var2.A0(wallettransactionpeeraddress4.domain);
                                                                        T2.presentFragment(r9Var2);
                                                                        break;
                                                                    }
                                                                    break;
                                                            }
                                                        }
                                                    });
                                                    a3VarArr2[0].dismiss();
                                                    break;
                                                default:
                                                    a3[] a3VarArr3 = a3VarArr;
                                                    a3 a3Var5 = a3VarArr3[0];
                                                    final int i22 = 1;
                                                    final TL_wallet.walletTransactionPeerAddress wallettransactionpeeraddress3 = wallettransactionpeeraddress;
                                                    a3Var5.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: org.telegram.ui.Wallet.w4
                                                        @Override // android.content.DialogInterface.OnDismissListener
                                                        public final void onDismiss(DialogInterface dialogInterface) {
                                                            switch (i22) {
                                                                case 0:
                                                                    org.telegram.ui.ActionBar.k2 T = LaunchActivity.T();
                                                                    if (T != null) {
                                                                        TL_wallet.walletTransactionPeerAddress wallettransactionpeeraddress32 = wallettransactionpeeraddress3;
                                                                        r9 r9Var = new r9(wallettransactionpeeraddress32.address);
                                                                        r9Var.A0(wallettransactionpeeraddress32.domain);
                                                                        T.presentFragment(r9Var);
                                                                        break;
                                                                    }
                                                                    break;
                                                                default:
                                                                    org.telegram.ui.ActionBar.k2 T2 = LaunchActivity.T();
                                                                    if (T2 != null) {
                                                                        TL_wallet.walletTransactionPeerAddress wallettransactionpeeraddress4 = wallettransactionpeeraddress3;
                                                                        r9 r9Var2 = new r9(wallettransactionpeeraddress4.address);
                                                                        r9Var2.A0(wallettransactionpeeraddress4.domain);
                                                                        T2.presentFragment(r9Var2);
                                                                        break;
                                                                    }
                                                                    break;
                                                            }
                                                        }
                                                    });
                                                    a3VarArr3[0].dismiss();
                                                    break;
                                            }
                                        }
                                    });
                                    xy0Var = xy0Var4;
                                }
                            }
                        }
                    }
                }
                final TL_wallet.WalletTransactionPeer walletTransactionPeer2 = wallettransaction.peer;
                boolean z17 = walletTransactionPeer2 instanceof TL_wallet.walletTransactionPeerUser;
                if (z17 || (walletTransactionPeer2 instanceof TL_wallet.walletTransactionPeerChannel) || (walletTransactionPeer2 instanceof TL_wallet.walletTransactionPeerAddress)) {
                    boolean z18 = m20Var == null && !(z17 && wp.r1(i11).Z1(Long.valueOf(walletTransactionPeer2.user_id)) != null && !i20.A(walletTransactionPeer2.user_id)) && TextUtils.isEmpty(walletTransactionPeer2.domain) && !TextUtils.isEmpty(walletTransactionPeer2.address);
                    String L03 = dd.L0(2131743229, null);
                    String str2 = walletTransactionPeer2.address;
                    m2 m2Var = new m2(7, a3VarArr, p6Var);
                    if (TextUtils.isEmpty(str2)) {
                        charSequence = dd.L0(2131742999, null);
                    } else {
                        SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder();
                        for (int i21 = 0; i21 < str2.length(); i21++) {
                            if (i21 > 0 && i21 % 4 == 0) {
                                spannableStringBuilder3.append(i21 % 16 == 0 ? '\n' : ' ');
                                spannableStringBuilder3.length();
                            }
                            spannableStringBuilder3.append(str2.charAt(i21));
                            if (i21 % 4 == 3) {
                                spannableStringBuilder3.length();
                            }
                        }
                        spannableStringBuilder3.setSpan(new org.telegram.ui.Cells.h(str2, m2Var, i17), 0, spannableStringBuilder3.length(), 33);
                        charSequence = spannableStringBuilder3;
                    }
                    final int i22 = 1;
                    xy0Var.j(L03, charSequence, 14, null, z18 ? dd.L0(2131743048, null) : null, new Runnable() { // from class: org.telegram.ui.Wallet.s4
                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i22) {
                                case 0:
                                    a3[] a3VarArr2 = a3VarArr;
                                    a3 a3Var4 = a3VarArr2[0];
                                    final int i202 = 1;
                                    final TL_wallet.WalletTransactionPeer walletTransactionPeer22 = walletTransactionPeer2;
                                    a3Var4.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: org.telegram.ui.Wallet.v4
                                        @Override // android.content.DialogInterface.OnDismissListener
                                        public final void onDismiss(DialogInterface dialogInterface) {
                                            switch (i202) {
                                                case 0:
                                                    org.telegram.ui.ActionBar.k2 T = LaunchActivity.T();
                                                    if (T != null) {
                                                        T.presentFragment(new r9(walletTransactionPeer22.address));
                                                        break;
                                                    }
                                                    break;
                                                default:
                                                    org.telegram.ui.ActionBar.k2 T2 = LaunchActivity.T();
                                                    if (T2 != null) {
                                                        TL_wallet.WalletTransactionPeer walletTransactionPeer32 = walletTransactionPeer22;
                                                        r9 r9Var = new r9(walletTransactionPeer32.address);
                                                        r9Var.A0(walletTransactionPeer32.domain);
                                                        T2.presentFragment(r9Var);
                                                        break;
                                                    }
                                                    break;
                                            }
                                        }
                                    });
                                    a3VarArr2[0].dismiss();
                                    break;
                                default:
                                    a3[] a3VarArr3 = a3VarArr;
                                    a3 a3Var5 = a3VarArr3[0];
                                    final int i212 = 0;
                                    final TL_wallet.WalletTransactionPeer walletTransactionPeer3 = walletTransactionPeer2;
                                    a3Var5.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: org.telegram.ui.Wallet.v4
                                        @Override // android.content.DialogInterface.OnDismissListener
                                        public final void onDismiss(DialogInterface dialogInterface) {
                                            switch (i212) {
                                                case 0:
                                                    org.telegram.ui.ActionBar.k2 T = LaunchActivity.T();
                                                    if (T != null) {
                                                        T.presentFragment(new r9(walletTransactionPeer3.address));
                                                        break;
                                                    }
                                                    break;
                                                default:
                                                    org.telegram.ui.ActionBar.k2 T2 = LaunchActivity.T();
                                                    if (T2 != null) {
                                                        TL_wallet.WalletTransactionPeer walletTransactionPeer32 = walletTransactionPeer3;
                                                        r9 r9Var = new r9(walletTransactionPeer32.address);
                                                        r9Var.A0(walletTransactionPeer32.domain);
                                                        T2.presentFragment(r9Var);
                                                        break;
                                                    }
                                                    break;
                                            }
                                        }
                                    });
                                    a3VarArr3[0].dismiss();
                                    break;
                            }
                        }
                    });
                }
                if (abs2 <= 0 || !wallettransaction.gasless) {
                    Context context3 = context;
                    if (abs2 > 0 || wallettransaction.nft != null || wallettransaction.preview) {
                        TextView textView2 = new TextView(context3);
                        textViewArr[0] = textView2;
                        textView2.setGravity(16);
                        textViewArr[0].setIncludeFontPadding(false);
                        textViewArr[0].setTextSize(1, 14.0f);
                        org.telegram.ui.ActionBar.a7.V(textViewArr[0], z11 ? org.telegram.ui.ActionBar.t6.z6 : org.telegram.ui.ActionBar.t6.G6, p6Var);
                        if (!wallettransaction.preview || abs2 > 0) {
                            textViewArr[0].setText(b6.w0(i11, abs2, p6Var));
                        } else {
                            if (spannableStringArr[0] == null) {
                                SpannableString spannableString = new SpannableString(dd.L0(2131748789, null));
                                spannableStringArr[0] = spannableString;
                                spannableString.setSpan(new u80(org.telegram.messenger.i0.L(150.0f), textViewArr[0]), 0, spannableStringArr[0].length(), 33);
                            }
                            textViewArr[0].setText(spannableStringArr[0]);
                        }
                        r42 = 0;
                        xy0Var.f(textViewArr[0], dd.L0(2131743147, null));
                        if (wallettransaction.date == 0) {
                            xy0Var.c(dd.L0(2131743170, r42), dd.Q(wallettransaction.date), r42, r42);
                            break;
                        }
                    }
                } else {
                    SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder("x ");
                    dq dqVar = new dq(R.drawable.wallet_gram_small, 2);
                    dqVar.d = false;
                    dqVar.c(org.telegram.messenger.i0.L(16.0f));
                    float L = org.telegram.messenger.i0.L(1.0f);
                    dqVar.r = 0.0f;
                    dqVar.s = L;
                    spannableStringBuilder4.setSpan(dqVar, 0, 1, 33);
                    spannableStringBuilder4.append((CharSequence) dd.L0(2131743144, null));
                    xy0Var.e(dd.L0(2131743147, null), spannableStringBuilder4, "?", new org.telegram.ui.z(i11, 5, abs2, context, p6Var), null);
                }
                r42 = 0;
                if (wallettransaction.date == 0) {
                }
                break;
            default:
                long[] jArr = (long[]) obj9;
                th.h0 h0Var = (th.h0) obj7;
                org.telegram.ui.Components.voip.j0 j0Var = (org.telegram.ui.Components.voip.j0) viewGroup;
                org.telegram.ui.Components.voip.j0 j0Var2 = (org.telegram.ui.Components.voip.j0) obj5;
                org.telegram.ui.Components.voip.j0 j0Var3 = (org.telegram.ui.Components.voip.j0) obj4;
                th.n nVar = (th.n) obj3;
                boolean[] zArr = (boolean[]) obj2;
                Integer num = (Integer) obj;
                long intValue = num.intValue();
                jArr[0] = intValue;
                ((vh.d) view).i(rh.h8.Y0(false, dd.a0(null, null, 2131745174, dd.E(intValue, ',')), (dq[]) obj8), true, true);
                h0Var.g = jArr[0];
                ((th.c0) obj6).set(h0Var);
                int intValue2 = num.intValue();
                int i23 = this.b;
                int b10 = th.o.b(i23, intValue2, 0);
                int b11 = th.o.b(i23, num.intValue(), 1);
                int b12 = th.o.b(i23, num.intValue(), 2);
                ((org.telegram.ui.Components.f6) j0Var.b).c(b10 >= 60 ? dd.a0(null, null, 2131745324, Integer.valueOf(b10 / 60)) : dd.a0(null, null, 2131745322, Integer.valueOf(b10)), true, true);
                ((org.telegram.ui.Components.f6) j0Var2.b).c(dd.E(b11, ','), true, true);
                ((org.telegram.ui.Components.f6) j0Var3.b).c(dd.E(b12, ','), true, true);
                nVar.f(th.o.b(i23, num.intValue(), 3), th.o.b(i23, num.intValue(), 4), !zArr[0]);
                zArr[0] = false;
                break;
        }
    }

    public /* synthetic */ q4(long[] jArr, vh.d dVar, dq[] dqVarArr, th.h0 h0Var, th.c0 c0Var, int i10, org.telegram.ui.Components.voip.j0 j0Var, org.telegram.ui.Components.voip.j0 j0Var2, org.telegram.ui.Components.voip.j0 j0Var3, th.n nVar, boolean[] zArr) {
        this.c = jArr;
        this.d = dVar;
        this.e = dqVarArr;
        this.f = h0Var;
        this.g = c0Var;
        this.b = i10;
        this.h = j0Var;
        this.i = j0Var2;
        this.j = j0Var3;
        this.k = nVar;
        this.l = zArr;
    }
}
