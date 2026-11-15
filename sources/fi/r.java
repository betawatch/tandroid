package fi;

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
import di.mb;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.hd;
import org.telegram.messenger.np;
import org.telegram.messenger.q10;
import org.telegram.messenger.u10;
import org.telegram.messenger.z10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.e80;
import org.telegram.ui.Components.eq;
import org.telegram.ui.Components.fa;
import org.telegram.ui.Components.vx0;
import org.telegram.ui.Components.w61;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class r implements z10 {
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

    public /* synthetic */ r(LinearLayout linearLayout, org.telegram.ui.Wallet.b5 b5Var, org.telegram.ui.ActionBar.e6 e6Var, int i7, TextView textView, org.telegram.ui.Wallet.x2[] x2VarArr, vx0 vx0Var, u10 u10Var, Context context, TextView[] textViewArr, SpannableString[] spannableStringArr) {
        this.c = linearLayout;
        this.d = b5Var;
        this.e = e6Var;
        this.b = i7;
        this.f = textView;
        this.g = x2VarArr;
        this.h = vx0Var;
        this.i = u10Var;
        this.j = context;
        this.k = textViewArr;
        this.l = spannableStringArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:91:0x04ec  */
    /* JADX WARN: Type inference failed for: r10v5, types: [org.telegram.ui.Wallet.s4] */
    /* JADX WARN: Type inference failed for: r16v4, types: [org.telegram.ui.Components.vx0] */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v20, types: [org.telegram.ui.Wallet.r4] */
    /* JADX WARN: Type inference failed for: r5v33 */
    /* JADX WARN: Type inference failed for: r5v37, types: [java.lang.String, org.telegram.ui.Components.ec[], org.telegram.ui.Components.ux0[]] */
    /* JADX WARN: Type inference failed for: r5v38 */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v20 */
    /* JADX WARN: Type inference failed for: r8v21 */
    /* JADX WARN: Type inference failed for: r8v22 */
    /* JADX WARN: Type inference failed for: r8v23 */
    /* JADX WARN: Type inference failed for: r8v24 */
    /* JADX WARN: Type inference failed for: r8v25 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8, types: [org.telegram.ui.Components.vx0] */
    @Override // org.telegram.messenger.z10
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Object obj) {
        Context context;
        boolean z10;
        long j3;
        org.telegram.ui.Wallet.x2 x2Var;
        fa faVar;
        org.telegram.ui.Wallet.x2 x2Var2;
        fa faVar2;
        int i7;
        ?? r32;
        String M0;
        vx0 vx0Var;
        CharSequence charSequence;
        ?? r52;
        String str;
        String M02;
        int i10;
        char c10;
        org.telegram.ui.Wallet.x2 x2Var3;
        fa faVar3;
        int i11 = this.a;
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
        switch (i11) {
            case 0:
                long[] jArr = (long[]) obj9;
                s0 s0Var = (s0) obj7;
                bi.g2 g2Var = (bi.g2) viewGroup;
                bi.g2 g2Var2 = (bi.g2) obj5;
                bi.g2 g2Var3 = (bi.g2) obj4;
                s sVar = (s) obj3;
                boolean[] zArr = (boolean[]) obj2;
                Integer num = (Integer) obj;
                long intValue = num.intValue();
                jArr[0] = intValue;
                ((hi.d) view).i(mb.Y0(false, hd.a0(null, null, 2131745156, hd.E(intValue, ',')), (eq[]) obj8), true, true);
                s0Var.g = jArr[0];
                ((n0) obj6).set(s0Var);
                int intValue2 = num.intValue();
                int i12 = this.b;
                int b10 = t.b(i12, intValue2, 0);
                int b11 = t.b(i12, num.intValue(), 1);
                int b12 = t.b(i12, num.intValue(), 2);
                ((org.telegram.ui.Components.h6) g2Var.b).c(b10 >= 60 ? hd.a0(null, null, 2131745306, Integer.valueOf(b10 / 60)) : hd.a0(null, null, 2131745304, Integer.valueOf(b10)), true, true);
                ((org.telegram.ui.Components.h6) g2Var2.b).c(hd.E(b11, ','), true, true);
                ((org.telegram.ui.Components.h6) g2Var3.b).c(hd.E(b12, ','), true, true);
                sVar.f(t.b(i12, num.intValue(), 3), t.b(i12, num.intValue(), 4), true ^ zArr[0]);
                zArr[0] = false;
                break;
            default:
                LinearLayout linearLayout = (LinearLayout) obj9;
                org.telegram.ui.Wallet.b5 b5Var = (org.telegram.ui.Wallet.b5) view;
                org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) obj8;
                TextView textView = (TextView) obj7;
                final org.telegram.ui.Wallet.x2[] x2VarArr = (org.telegram.ui.Wallet.x2[]) obj6;
                vx0 vx0Var2 = (vx0) viewGroup;
                u10 u10Var = (u10) obj5;
                Context context2 = (Context) obj4;
                TextView[] textViewArr = (TextView[]) obj3;
                SpannableString[] spannableStringArr = (SpannableString[]) obj2;
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj;
                final int i13 = 1;
                long abs = Math.abs(wallettransaction.amount);
                boolean z11 = wallettransaction.incoming;
                long abs2 = Math.abs(wallettransaction.fee);
                boolean z12 = wallettransaction.pending || wallettransaction.failed;
                boolean z13 = ((linearLayout.getParent() instanceof View) && (linearLayout.getParent().getParent() instanceof w61) && ((w61) linearLayout.getParent().getParent()).getViewPages()[0] != linearLayout.getParent()) ? false : true;
                boolean z14 = wallettransaction.key_change;
                boolean z15 = z13;
                int i14 = this.b;
                if (z14 || wallettransaction.nft != null) {
                    context = context2;
                    z10 = z11;
                    j3 = abs2;
                    if (!z14) {
                        TL_wallet.nftItem nftitem = wallettransaction.nft;
                        if (nftitem != null && z15 && (x2Var = x2VarArr[0]) != null && (faVar = x2Var.p1) != null) {
                            faVar.setTitle(TextUtils.isEmpty(nftitem.name) ? hd.M0(2131743176, null) : wallettransaction.nft.name);
                        }
                    } else if (z15 && (x2Var2 = x2VarArr[0]) != null && (faVar2 = x2Var2.p1) != null) {
                        faVar2.setTitle(org.telegram.ui.Wallet.l0.l("Grams", org.telegram.ui.Wallet.l0.q(org.telegram.ui.Wallet.l0.o(abs, false), 0.75f), 2131749507));
                    }
                } else {
                    org.telegram.ui.ActionBar.q6.U(b5Var, z12 ? org.telegram.ui.ActionBar.j6.z6 : org.telegram.ui.ActionBar.j6.Fi, e6Var);
                    SpannableStringBuilder q10 = org.telegram.ui.Wallet.l0.q(org.telegram.ui.Wallet.l0.o(abs, false), 0.75f);
                    context = context2;
                    q10.insert(0, (CharSequence) (z11 ? "+" : "–"));
                    if (z12) {
                        z10 = z11;
                        j3 = abs2;
                    } else {
                        z10 = z11;
                        j3 = abs2;
                        q10.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.j6.w0(z11 ? org.telegram.ui.ActionBar.j6.lk : org.telegram.ui.ActionBar.j6.G6, e6Var)), 0, q10.length(), 33);
                    }
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append((CharSequence) org.telegram.ui.Wallet.l0.l("Grams", q10, 2131749507));
                    int indexOf = TextUtils.indexOf(spannableStringBuilder, q10);
                    int length = q10.length() + indexOf;
                    if (indexOf > 0) {
                        i10 = 33;
                        spannableStringBuilder.setSpan(new RelativeSizeSpan(0.75f), 0, indexOf, 33);
                    } else {
                        i10 = 33;
                    }
                    if (indexOf >= 0 && length < spannableStringBuilder.length()) {
                        spannableStringBuilder.setSpan(new RelativeSizeSpan(0.75f), length, spannableStringBuilder.length(), i10);
                    }
                    b5Var.setText(spannableStringBuilder);
                    CharSequence m10 = org.telegram.ui.Wallet.l0.x(i14).m(abs, false);
                    if (z12) {
                        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(wallettransaction.failed ? hd.M0(2131743123, null) : o9.a(textView, hd.M0(2131743014, null)));
                        c10 = 0;
                        spannableStringBuilder2.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.j6.w0(wallettransaction.failed ? org.telegram.ui.ActionBar.j6.p7 : org.telegram.ui.ActionBar.j6.n6, e6Var)), 0, spannableStringBuilder2.length(), 33);
                        textView.setText(hd.V(null, null, 2131742987, m10, spannableStringBuilder2));
                    } else {
                        c10 = 0;
                        textView.setText(m10);
                    }
                    if (z15 && (x2Var3 = x2VarArr[c10]) != null && (faVar3 = x2Var3.p1) != null) {
                        faVar3.setTitle(org.telegram.ui.Wallet.l0.l("Grams", q10, 2131749507));
                    }
                }
                vx0Var2.removeAllViews();
                final TL_wallet.WalletTransactionPeer walletTransactionPeer = wallettransaction.peer;
                if (walletTransactionPeer instanceof TL_wallet.walletTransactionPeerUser) {
                    TL_wallet.walletTransactionPeerUser wallettransactionpeeruser = (TL_wallet.walletTransactionPeerUser) walletTransactionPeer;
                    TLRPC.User a22 = np.s1(i14).a2(Long.valueOf(wallettransactionpeeruser.user_id));
                    if (a22 != null && !q10.A(a22.id)) {
                        if (z10) {
                            str = null;
                            M02 = hd.M0(2131743015, null);
                        } else {
                            str = null;
                            M02 = hd.M0(2131743040, null);
                        }
                        vx0Var2.m(M02, i14, wallettransactionpeeruser.user_id, new org.telegram.ui.Wallet.g(u10Var, x2VarArr, wallettransactionpeeruser, 12), hd.M0(2131743022, str), u10Var != null ? null : new org.telegram.ui.Wallet.r(8, x2VarArr, a22));
                    }
                    vx0 vx0Var3 = vx0Var2;
                    if (!TextUtils.isEmpty(wallettransactionpeeruser.domain) && !TextUtils.isEmpty(wallettransactionpeeruser.address)) {
                        vx0Var3.i(hd.M0(2131743129, null), wallettransactionpeeruser.domain, new org.telegram.ui.Wallet.g(x2VarArr, a22, wallettransactionpeeruser, 13));
                    }
                    i7 = i14;
                    vx0Var = vx0Var3;
                } else {
                    vx0 vx0Var4 = vx0Var2;
                    if (walletTransactionPeer instanceof TL_wallet.walletTransactionPeerChannel) {
                        if (np.s1(i14).M0(Long.valueOf(walletTransactionPeer.channel_id)) != null) {
                            vx0Var4.n(z10 ? hd.M0(2131743015, null) : hd.M0(2131743040, null), i14, -walletTransactionPeer.channel_id, new org.telegram.ui.Wallet.g(u10Var, x2VarArr, walletTransactionPeer, 14));
                        }
                        i7 = i14;
                        vx0Var = vx0Var4;
                        if (!TextUtils.isEmpty(walletTransactionPeer.domain)) {
                            vx0Var = vx0Var4;
                            if (!TextUtils.isEmpty(walletTransactionPeer.address)) {
                                final int i15 = 0;
                                vx0Var4.i(hd.M0(2131743129, null), walletTransactionPeer.domain, new Runnable() { // from class: org.telegram.ui.Wallet.r4
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i15) {
                                            case 0:
                                                x2[] x2VarArr2 = x2VarArr;
                                                x2 x2Var4 = x2VarArr2[0];
                                                final int i16 = 1;
                                                final TL_wallet.WalletTransactionPeer walletTransactionPeer2 = walletTransactionPeer;
                                                x2Var4.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: org.telegram.ui.Wallet.u4
                                                    @Override // android.content.DialogInterface.OnDismissListener
                                                    public final void onDismiss(DialogInterface dialogInterface) {
                                                        switch (i16) {
                                                            case 0:
                                                                org.telegram.ui.ActionBar.e2 T = LaunchActivity.T();
                                                                if (T != null) {
                                                                    T.presentFragment(new p9(walletTransactionPeer2.address));
                                                                    break;
                                                                }
                                                                break;
                                                            default:
                                                                org.telegram.ui.ActionBar.e2 T2 = LaunchActivity.T();
                                                                if (T2 != null) {
                                                                    TL_wallet.WalletTransactionPeer walletTransactionPeer3 = walletTransactionPeer2;
                                                                    p9 p9Var = new p9(walletTransactionPeer3.address);
                                                                    p9Var.A0(walletTransactionPeer3.domain);
                                                                    T2.presentFragment(p9Var);
                                                                    break;
                                                                }
                                                                break;
                                                        }
                                                    }
                                                });
                                                x2VarArr2[0].dismiss();
                                                break;
                                            default:
                                                x2[] x2VarArr3 = x2VarArr;
                                                x2 x2Var5 = x2VarArr3[0];
                                                final int i17 = 0;
                                                final TL_wallet.WalletTransactionPeer walletTransactionPeer3 = walletTransactionPeer;
                                                x2Var5.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: org.telegram.ui.Wallet.u4
                                                    @Override // android.content.DialogInterface.OnDismissListener
                                                    public final void onDismiss(DialogInterface dialogInterface) {
                                                        switch (i17) {
                                                            case 0:
                                                                org.telegram.ui.ActionBar.e2 T = LaunchActivity.T();
                                                                if (T != null) {
                                                                    T.presentFragment(new p9(walletTransactionPeer3.address));
                                                                    break;
                                                                }
                                                                break;
                                                            default:
                                                                org.telegram.ui.ActionBar.e2 T2 = LaunchActivity.T();
                                                                if (T2 != null) {
                                                                    TL_wallet.WalletTransactionPeer walletTransactionPeer32 = walletTransactionPeer3;
                                                                    p9 p9Var = new p9(walletTransactionPeer32.address);
                                                                    p9Var.A0(walletTransactionPeer32.domain);
                                                                    T2.presentFragment(p9Var);
                                                                    break;
                                                                }
                                                                break;
                                                        }
                                                    }
                                                });
                                                x2VarArr3[0].dismiss();
                                                break;
                                        }
                                    }
                                });
                                vx0Var = vx0Var4;
                            }
                        }
                    } else {
                        i7 = i14;
                        vx0Var = vx0Var4;
                        if (walletTransactionPeer instanceof TL_wallet.walletTransactionPeerAddress) {
                            final TL_wallet.walletTransactionPeerAddress wallettransactionpeeraddress = (TL_wallet.walletTransactionPeerAddress) walletTransactionPeer;
                            vx0Var = vx0Var4;
                            if (!TextUtils.isEmpty(wallettransactionpeeraddress.domain)) {
                                if (TextUtils.isEmpty(wallettransactionpeeraddress.address)) {
                                    vx0Var4.i(z10 ? hd.M0(2131743015, null) : hd.M0(2131743040, null), wallettransactionpeeraddress.domain, new ai.o(28));
                                    vx0Var = vx0Var4;
                                } else {
                                    if (z10) {
                                        r32 = null;
                                        M0 = hd.M0(2131743015, null);
                                    } else {
                                        r32 = null;
                                        M0 = hd.M0(2131743040, null);
                                    }
                                    final int i16 = 0;
                                    vx0Var4.h(M0, wallettransactionpeeraddress.domain, new Runnable() { // from class: org.telegram.ui.Wallet.s4
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (i16) {
                                                case 0:
                                                    x2[] x2VarArr2 = x2VarArr;
                                                    x2 x2Var4 = x2VarArr2[0];
                                                    final int i17 = 0;
                                                    final TL_wallet.walletTransactionPeerAddress wallettransactionpeeraddress2 = wallettransactionpeeraddress;
                                                    x2Var4.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: org.telegram.ui.Wallet.v4
                                                        @Override // android.content.DialogInterface.OnDismissListener
                                                        public final void onDismiss(DialogInterface dialogInterface) {
                                                            switch (i17) {
                                                                case 0:
                                                                    org.telegram.ui.ActionBar.e2 T = LaunchActivity.T();
                                                                    if (T != null) {
                                                                        TL_wallet.walletTransactionPeerAddress wallettransactionpeeraddress3 = wallettransactionpeeraddress2;
                                                                        p9 p9Var = new p9(wallettransactionpeeraddress3.address);
                                                                        p9Var.A0(wallettransactionpeeraddress3.domain);
                                                                        T.presentFragment(p9Var);
                                                                        break;
                                                                    }
                                                                    break;
                                                                default:
                                                                    org.telegram.ui.ActionBar.e2 T2 = LaunchActivity.T();
                                                                    if (T2 != null) {
                                                                        TL_wallet.walletTransactionPeerAddress wallettransactionpeeraddress4 = wallettransactionpeeraddress2;
                                                                        p9 p9Var2 = new p9(wallettransactionpeeraddress4.address);
                                                                        p9Var2.A0(wallettransactionpeeraddress4.domain);
                                                                        T2.presentFragment(p9Var2);
                                                                        break;
                                                                    }
                                                                    break;
                                                            }
                                                        }
                                                    });
                                                    x2VarArr2[0].dismiss();
                                                    break;
                                                default:
                                                    x2[] x2VarArr3 = x2VarArr;
                                                    x2 x2Var5 = x2VarArr3[0];
                                                    final int i18 = 1;
                                                    final TL_wallet.walletTransactionPeerAddress wallettransactionpeeraddress3 = wallettransactionpeeraddress;
                                                    x2Var5.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: org.telegram.ui.Wallet.v4
                                                        @Override // android.content.DialogInterface.OnDismissListener
                                                        public final void onDismiss(DialogInterface dialogInterface) {
                                                            switch (i18) {
                                                                case 0:
                                                                    org.telegram.ui.ActionBar.e2 T = LaunchActivity.T();
                                                                    if (T != null) {
                                                                        TL_wallet.walletTransactionPeerAddress wallettransactionpeeraddress32 = wallettransactionpeeraddress3;
                                                                        p9 p9Var = new p9(wallettransactionpeeraddress32.address);
                                                                        p9Var.A0(wallettransactionpeeraddress32.domain);
                                                                        T.presentFragment(p9Var);
                                                                        break;
                                                                    }
                                                                    break;
                                                                default:
                                                                    org.telegram.ui.ActionBar.e2 T2 = LaunchActivity.T();
                                                                    if (T2 != null) {
                                                                        TL_wallet.walletTransactionPeerAddress wallettransactionpeeraddress4 = wallettransactionpeeraddress3;
                                                                        p9 p9Var2 = new p9(wallettransactionpeeraddress4.address);
                                                                        p9Var2.A0(wallettransactionpeeraddress4.domain);
                                                                        T2.presentFragment(p9Var2);
                                                                        break;
                                                                    }
                                                                    break;
                                                            }
                                                        }
                                                    });
                                                    x2VarArr3[0].dismiss();
                                                    break;
                                            }
                                        }
                                    }, hd.M0(2131743022, r32), u10Var != null ? r32 : new Runnable() { // from class: org.telegram.ui.Wallet.s4
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (i13) {
                                                case 0:
                                                    x2[] x2VarArr2 = x2VarArr;
                                                    x2 x2Var4 = x2VarArr2[0];
                                                    final int i17 = 0;
                                                    final TL_wallet.walletTransactionPeerAddress wallettransactionpeeraddress2 = wallettransactionpeeraddress;
                                                    x2Var4.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: org.telegram.ui.Wallet.v4
                                                        @Override // android.content.DialogInterface.OnDismissListener
                                                        public final void onDismiss(DialogInterface dialogInterface) {
                                                            switch (i17) {
                                                                case 0:
                                                                    org.telegram.ui.ActionBar.e2 T = LaunchActivity.T();
                                                                    if (T != null) {
                                                                        TL_wallet.walletTransactionPeerAddress wallettransactionpeeraddress32 = wallettransactionpeeraddress2;
                                                                        p9 p9Var = new p9(wallettransactionpeeraddress32.address);
                                                                        p9Var.A0(wallettransactionpeeraddress32.domain);
                                                                        T.presentFragment(p9Var);
                                                                        break;
                                                                    }
                                                                    break;
                                                                default:
                                                                    org.telegram.ui.ActionBar.e2 T2 = LaunchActivity.T();
                                                                    if (T2 != null) {
                                                                        TL_wallet.walletTransactionPeerAddress wallettransactionpeeraddress4 = wallettransactionpeeraddress2;
                                                                        p9 p9Var2 = new p9(wallettransactionpeeraddress4.address);
                                                                        p9Var2.A0(wallettransactionpeeraddress4.domain);
                                                                        T2.presentFragment(p9Var2);
                                                                        break;
                                                                    }
                                                                    break;
                                                            }
                                                        }
                                                    });
                                                    x2VarArr2[0].dismiss();
                                                    break;
                                                default:
                                                    x2[] x2VarArr3 = x2VarArr;
                                                    x2 x2Var5 = x2VarArr3[0];
                                                    final int i18 = 1;
                                                    final TL_wallet.walletTransactionPeerAddress wallettransactionpeeraddress3 = wallettransactionpeeraddress;
                                                    x2Var5.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: org.telegram.ui.Wallet.v4
                                                        @Override // android.content.DialogInterface.OnDismissListener
                                                        public final void onDismiss(DialogInterface dialogInterface) {
                                                            switch (i18) {
                                                                case 0:
                                                                    org.telegram.ui.ActionBar.e2 T = LaunchActivity.T();
                                                                    if (T != null) {
                                                                        TL_wallet.walletTransactionPeerAddress wallettransactionpeeraddress32 = wallettransactionpeeraddress3;
                                                                        p9 p9Var = new p9(wallettransactionpeeraddress32.address);
                                                                        p9Var.A0(wallettransactionpeeraddress32.domain);
                                                                        T.presentFragment(p9Var);
                                                                        break;
                                                                    }
                                                                    break;
                                                                default:
                                                                    org.telegram.ui.ActionBar.e2 T2 = LaunchActivity.T();
                                                                    if (T2 != null) {
                                                                        TL_wallet.walletTransactionPeerAddress wallettransactionpeeraddress4 = wallettransactionpeeraddress3;
                                                                        p9 p9Var2 = new p9(wallettransactionpeeraddress4.address);
                                                                        p9Var2.A0(wallettransactionpeeraddress4.domain);
                                                                        T2.presentFragment(p9Var2);
                                                                        break;
                                                                    }
                                                                    break;
                                                            }
                                                        }
                                                    });
                                                    x2VarArr3[0].dismiss();
                                                    break;
                                            }
                                        }
                                    });
                                    vx0Var = vx0Var4;
                                }
                            }
                        }
                    }
                }
                final TL_wallet.WalletTransactionPeer walletTransactionPeer2 = wallettransaction.peer;
                boolean z16 = walletTransactionPeer2 instanceof TL_wallet.walletTransactionPeerUser;
                if (z16 || (walletTransactionPeer2 instanceof TL_wallet.walletTransactionPeerChannel) || (walletTransactionPeer2 instanceof TL_wallet.walletTransactionPeerAddress)) {
                    boolean z17 = u10Var == null && !(z16 && np.s1(i7).a2(Long.valueOf(walletTransactionPeer2.user_id)) != null && !q10.A(walletTransactionPeer2.user_id)) && TextUtils.isEmpty(walletTransactionPeer2.domain) && !TextUtils.isEmpty(walletTransactionPeer2.address);
                    String M03 = hd.M0(2131743203, null);
                    String str2 = walletTransactionPeer2.address;
                    org.telegram.ui.Wallet.r rVar = new org.telegram.ui.Wallet.r(9, x2VarArr, e6Var);
                    if (TextUtils.isEmpty(str2)) {
                        charSequence = hd.M0(2131742973, null);
                    } else {
                        SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder();
                        for (int i17 = 0; i17 < str2.length(); i17++) {
                            if (i17 > 0 && i17 % 4 == 0) {
                                spannableStringBuilder3.append(i17 % 16 == 0 ? '\n' : ' ');
                                spannableStringBuilder3.length();
                            }
                            spannableStringBuilder3.append(str2.charAt(i17));
                            if (i17 % 4 == 3) {
                                spannableStringBuilder3.length();
                            }
                        }
                        spannableStringBuilder3.setSpan(new org.telegram.ui.Cells.h(str2, rVar, 11), 0, spannableStringBuilder3.length(), 33);
                        charSequence = spannableStringBuilder3;
                    }
                    final int i18 = 1;
                    vx0Var.j(M03, charSequence, 14, null, z17 ? hd.M0(2131743022, null) : null, new Runnable() { // from class: org.telegram.ui.Wallet.r4
                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i18) {
                                case 0:
                                    x2[] x2VarArr2 = x2VarArr;
                                    x2 x2Var4 = x2VarArr2[0];
                                    final int i162 = 1;
                                    final TL_wallet.WalletTransactionPeer walletTransactionPeer22 = walletTransactionPeer2;
                                    x2Var4.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: org.telegram.ui.Wallet.u4
                                        @Override // android.content.DialogInterface.OnDismissListener
                                        public final void onDismiss(DialogInterface dialogInterface) {
                                            switch (i162) {
                                                case 0:
                                                    org.telegram.ui.ActionBar.e2 T = LaunchActivity.T();
                                                    if (T != null) {
                                                        T.presentFragment(new p9(walletTransactionPeer22.address));
                                                        break;
                                                    }
                                                    break;
                                                default:
                                                    org.telegram.ui.ActionBar.e2 T2 = LaunchActivity.T();
                                                    if (T2 != null) {
                                                        TL_wallet.WalletTransactionPeer walletTransactionPeer32 = walletTransactionPeer22;
                                                        p9 p9Var = new p9(walletTransactionPeer32.address);
                                                        p9Var.A0(walletTransactionPeer32.domain);
                                                        T2.presentFragment(p9Var);
                                                        break;
                                                    }
                                                    break;
                                            }
                                        }
                                    });
                                    x2VarArr2[0].dismiss();
                                    break;
                                default:
                                    x2[] x2VarArr3 = x2VarArr;
                                    x2 x2Var5 = x2VarArr3[0];
                                    final int i172 = 0;
                                    final TL_wallet.WalletTransactionPeer walletTransactionPeer3 = walletTransactionPeer2;
                                    x2Var5.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: org.telegram.ui.Wallet.u4
                                        @Override // android.content.DialogInterface.OnDismissListener
                                        public final void onDismiss(DialogInterface dialogInterface) {
                                            switch (i172) {
                                                case 0:
                                                    org.telegram.ui.ActionBar.e2 T = LaunchActivity.T();
                                                    if (T != null) {
                                                        T.presentFragment(new p9(walletTransactionPeer3.address));
                                                        break;
                                                    }
                                                    break;
                                                default:
                                                    org.telegram.ui.ActionBar.e2 T2 = LaunchActivity.T();
                                                    if (T2 != null) {
                                                        TL_wallet.WalletTransactionPeer walletTransactionPeer32 = walletTransactionPeer3;
                                                        p9 p9Var = new p9(walletTransactionPeer32.address);
                                                        p9Var.A0(walletTransactionPeer32.domain);
                                                        T2.presentFragment(p9Var);
                                                        break;
                                                    }
                                                    break;
                                            }
                                        }
                                    });
                                    x2VarArr3[0].dismiss();
                                    break;
                            }
                        }
                    });
                }
                if (j3 <= 0 || !wallettransaction.gasless) {
                    Context context3 = context;
                    long j10 = j3;
                    if (j3 > 0 || wallettransaction.nft != null || wallettransaction.preview) {
                        TextView textView2 = new TextView(context3);
                        textViewArr[0] = textView2;
                        textView2.setGravity(16);
                        textViewArr[0].setIncludeFontPadding(false);
                        textViewArr[0].setTextSize(1, 14.0f);
                        org.telegram.ui.ActionBar.q6.U(textViewArr[0], z12 ? org.telegram.ui.ActionBar.j6.z6 : org.telegram.ui.ActionBar.j6.G6, e6Var);
                        if (!wallettransaction.preview || j3 > 0) {
                            textViewArr[0].setText(org.telegram.ui.Wallet.y5.w0(i7, j10, e6Var));
                        } else {
                            if (spannableStringArr[0] == null) {
                                SpannableString spannableString = new SpannableString(hd.M0(2131748779, null));
                                spannableStringArr[0] = spannableString;
                                spannableString.setSpan(new e80(org.telegram.messenger.g0.L(150.0f), textViewArr[0]), 0, spannableStringArr[0].length(), 33);
                            }
                            textViewArr[0].setText(spannableStringArr[0]);
                        }
                        r52 = 0;
                        vx0Var.f(textViewArr[0], hd.M0(2131743121, null));
                        if (wallettransaction.date == 0) {
                            vx0Var.c(hd.M0(2131743144, r52), hd.Q(wallettransaction.date), r52, r52);
                            break;
                        }
                    }
                } else {
                    SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder("x ");
                    eq eqVar = new eq(R.drawable.wallet_gram_small, 2);
                    eqVar.d = false;
                    eqVar.c(org.telegram.messenger.g0.L(16.0f));
                    float L = org.telegram.messenger.g0.L(1.0f);
                    eqVar.r = 0.0f;
                    eqVar.s = L;
                    spannableStringBuilder4.setSpan(eqVar, 0, 1, 33);
                    spannableStringBuilder4.append((CharSequence) hd.M0(2131743118, null));
                    vx0Var.e(hd.M0(2131743121, null), spannableStringBuilder4, "?", new di.x7(i7, 7, j3, context, e6Var), null);
                }
                r52 = 0;
                if (wallettransaction.date == 0) {
                }
                break;
        }
    }

    public /* synthetic */ r(long[] jArr, hi.d dVar, eq[] eqVarArr, s0 s0Var, n0 n0Var, int i7, bi.g2 g2Var, bi.g2 g2Var2, bi.g2 g2Var3, s sVar, boolean[] zArr) {
        this.c = jArr;
        this.d = dVar;
        this.e = eqVarArr;
        this.f = s0Var;
        this.g = n0Var;
        this.b = i7;
        this.h = g2Var;
        this.i = g2Var2;
        this.j = g2Var3;
        this.k = sVar;
        this.l = zArr;
    }
}
