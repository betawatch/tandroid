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
import org.telegram.messenger.beta.R;
import org.telegram.messenger.c20;
import org.telegram.messenger.id;
import org.telegram.messenger.qp;
import org.telegram.messenger.t10;
import org.telegram.messenger.x10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.b80;
import org.telegram.ui.Components.ia;
import org.telegram.ui.Components.tx0;
import org.telegram.ui.Components.v61;
import org.telegram.ui.Components.wp;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.sb1;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class r implements c20 {
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

    public /* synthetic */ r(LinearLayout linearLayout, org.telegram.ui.Wallet.c5 c5Var, org.telegram.ui.ActionBar.h6 h6Var, int i7, TextView textView, org.telegram.ui.Wallet.y2[] y2VarArr, tx0 tx0Var, x10 x10Var, Context context, TextView[] textViewArr, SpannableString[] spannableStringArr) {
        this.c = linearLayout;
        this.d = c5Var;
        this.e = h6Var;
        this.b = i7;
        this.f = textView;
        this.g = y2VarArr;
        this.h = tx0Var;
        this.i = x10Var;
        this.j = context;
        this.k = textViewArr;
        this.l = spannableStringArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:91:0x04e7  */
    /* JADX WARN: Type inference failed for: r10v5, types: [org.telegram.ui.Wallet.t4] */
    /* JADX WARN: Type inference failed for: r12v10, types: [org.telegram.ui.Components.tx0] */
    /* JADX WARN: Type inference failed for: r12v18 */
    /* JADX WARN: Type inference failed for: r12v19 */
    /* JADX WARN: Type inference failed for: r12v20 */
    /* JADX WARN: Type inference failed for: r12v21 */
    /* JADX WARN: Type inference failed for: r12v22 */
    /* JADX WARN: Type inference failed for: r12v23 */
    /* JADX WARN: Type inference failed for: r12v24 */
    /* JADX WARN: Type inference failed for: r12v9 */
    /* JADX WARN: Type inference failed for: r16v4, types: [org.telegram.ui.Components.tx0] */
    /* JADX WARN: Type inference failed for: r3v7, types: [org.telegram.ui.Wallet.s4] */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v19, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Type inference failed for: r6v36 */
    /* JADX WARN: Type inference failed for: r6v38, types: [java.lang.String, org.telegram.ui.Components.ic[], org.telegram.ui.Components.sx0[]] */
    /* JADX WARN: Type inference failed for: r6v39 */
    @Override // org.telegram.messenger.c20
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Object obj) {
        Context context;
        boolean z9;
        long j3;
        org.telegram.ui.Wallet.y2 y2Var;
        ia iaVar;
        org.telegram.ui.Wallet.y2 y2Var2;
        ia iaVar2;
        int i7;
        ?? r42;
        String M0;
        tx0 tx0Var;
        CharSequence charSequence;
        ?? r62;
        String str;
        String M02;
        int i10;
        char c10;
        org.telegram.ui.Wallet.y2 y2Var3;
        ia iaVar3;
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
                bi.e5 e5Var = (bi.e5) viewGroup;
                bi.e5 e5Var2 = (bi.e5) obj5;
                bi.e5 e5Var3 = (bi.e5) obj4;
                s sVar = (s) obj3;
                boolean[] zArr = (boolean[]) obj2;
                Integer num = (Integer) obj;
                long intValue = num.intValue();
                jArr[0] = intValue;
                ((fi.d) view).i(dd.Y0(false, id.a0(null, null, 2131745156, id.E(intValue, ',')), (wp[]) obj8), true, true);
                s0Var.g = jArr[0];
                ((n0) obj6).set(s0Var);
                int intValue2 = num.intValue();
                int i12 = this.b;
                int b10 = t.b(i12, intValue2, 0);
                int b11 = t.b(i12, num.intValue(), 1);
                int b12 = t.b(i12, num.intValue(), 2);
                ((org.telegram.ui.Components.i6) e5Var.b).c(b10 >= 60 ? id.a0(null, null, 2131745306, Integer.valueOf(b10 / 60)) : id.a0(null, null, 2131745304, Integer.valueOf(b10)), true, true);
                ((org.telegram.ui.Components.i6) e5Var2.b).c(id.E(b11, ','), true, true);
                ((org.telegram.ui.Components.i6) e5Var3.b).c(id.E(b12, ','), true, true);
                sVar.f(t.b(i12, num.intValue(), 3), t.b(i12, num.intValue(), 4), true ^ zArr[0]);
                zArr[0] = false;
                break;
            default:
                LinearLayout linearLayout = (LinearLayout) obj9;
                org.telegram.ui.Wallet.c5 c5Var = (org.telegram.ui.Wallet.c5) view;
                org.telegram.ui.ActionBar.h6 h6Var = (org.telegram.ui.ActionBar.h6) obj8;
                TextView textView = (TextView) obj7;
                final org.telegram.ui.Wallet.y2[] y2VarArr = (org.telegram.ui.Wallet.y2[]) obj6;
                tx0 tx0Var2 = (tx0) viewGroup;
                x10 x10Var = (x10) obj5;
                Context context2 = (Context) obj4;
                TextView[] textViewArr = (TextView[]) obj3;
                SpannableString[] spannableStringArr = (SpannableString[]) obj2;
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj;
                final int i13 = 1;
                long abs = Math.abs(wallettransaction.amount);
                boolean z10 = wallettransaction.incoming;
                long abs2 = Math.abs(wallettransaction.fee);
                boolean z11 = wallettransaction.pending || wallettransaction.failed;
                boolean z12 = ((linearLayout.getParent() instanceof View) && (linearLayout.getParent().getParent() instanceof v61) && ((v61) linearLayout.getParent().getParent()).getViewPages()[0] != linearLayout.getParent()) ? false : true;
                boolean z13 = wallettransaction.key_change;
                boolean z14 = z12;
                int i14 = this.b;
                if (z13 || wallettransaction.nft != null) {
                    context = context2;
                    z9 = z10;
                    j3 = abs2;
                    if (!z13) {
                        TL_wallet.nftItem nftitem = wallettransaction.nft;
                        if (nftitem != null && z14 && (y2Var = y2VarArr[0]) != null && (iaVar = y2Var.o1) != null) {
                            iaVar.setTitle(TextUtils.isEmpty(nftitem.name) ? id.M0(2131743176, null) : wallettransaction.nft.name);
                        }
                    } else if (z14 && (y2Var2 = y2VarArr[0]) != null && (iaVar2 = y2Var2.o1) != null) {
                        iaVar2.setTitle(org.telegram.ui.Wallet.l0.l("Grams", org.telegram.ui.Wallet.l0.q(org.telegram.ui.Wallet.l0.o(abs, false), 0.75f), 2131749507));
                    }
                } else {
                    org.telegram.ui.ActionBar.t6.U(c5Var, z11 ? org.telegram.ui.ActionBar.m6.z6 : org.telegram.ui.ActionBar.m6.Ci, h6Var);
                    SpannableStringBuilder q10 = org.telegram.ui.Wallet.l0.q(org.telegram.ui.Wallet.l0.o(abs, false), 0.75f);
                    context = context2;
                    q10.insert(0, (CharSequence) (z10 ? "+" : "–"));
                    if (z11) {
                        z9 = z10;
                        j3 = abs2;
                    } else {
                        z9 = z10;
                        j3 = abs2;
                        q10.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.m6.w0(z10 ? org.telegram.ui.ActionBar.m6.ik : org.telegram.ui.ActionBar.m6.G6, h6Var)), 0, q10.length(), 33);
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
                    c5Var.setText(spannableStringBuilder);
                    CharSequence m10 = org.telegram.ui.Wallet.l0.x(i14).m(abs, false);
                    if (z11) {
                        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(wallettransaction.failed ? id.M0(2131743123, null) : w9.a(textView, id.M0(2131743014, null)));
                        c10 = 0;
                        spannableStringBuilder2.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.m6.w0(wallettransaction.failed ? org.telegram.ui.ActionBar.m6.p7 : org.telegram.ui.ActionBar.m6.n6, h6Var)), 0, spannableStringBuilder2.length(), 33);
                        textView.setText(id.V(null, null, 2131742987, m10, spannableStringBuilder2));
                    } else {
                        c10 = 0;
                        textView.setText(m10);
                    }
                    if (z14 && (y2Var3 = y2VarArr[c10]) != null && (iaVar3 = y2Var3.o1) != null) {
                        iaVar3.setTitle(org.telegram.ui.Wallet.l0.l("Grams", q10, 2131749507));
                    }
                }
                tx0Var2.removeAllViews();
                final TL_wallet.WalletTransactionPeer walletTransactionPeer = wallettransaction.peer;
                if (walletTransactionPeer instanceof TL_wallet.walletTransactionPeerUser) {
                    TL_wallet.walletTransactionPeerUser wallettransactionpeeruser = (TL_wallet.walletTransactionPeerUser) walletTransactionPeer;
                    TLRPC.User a22 = qp.s1(i14).a2(Long.valueOf(wallettransactionpeeruser.user_id));
                    if (a22 != null && !t10.A(a22.id)) {
                        if (z9) {
                            str = null;
                            M02 = id.M0(2131743015, null);
                        } else {
                            str = null;
                            M02 = id.M0(2131743040, null);
                        }
                        tx0Var2.m(M02, i14, wallettransactionpeeruser.user_id, new org.telegram.ui.Wallet.g(x10Var, y2VarArr, wallettransactionpeeruser, 12), id.M0(2131743022, str), x10Var != null ? null : new sb1(13, y2VarArr, a22));
                    }
                    tx0 tx0Var3 = tx0Var2;
                    if (!TextUtils.isEmpty(wallettransactionpeeruser.domain) && !TextUtils.isEmpty(wallettransactionpeeruser.address)) {
                        tx0Var3.i(id.M0(2131743129, null), wallettransactionpeeruser.domain, new org.telegram.ui.Wallet.g(y2VarArr, a22, wallettransactionpeeruser, 13));
                    }
                    i7 = i14;
                    tx0Var = tx0Var3;
                } else {
                    tx0 tx0Var4 = tx0Var2;
                    if (walletTransactionPeer instanceof TL_wallet.walletTransactionPeerChannel) {
                        if (qp.s1(i14).M0(Long.valueOf(walletTransactionPeer.channel_id)) != null) {
                            tx0Var4.n(z9 ? id.M0(2131743015, null) : id.M0(2131743040, null), i14, -walletTransactionPeer.channel_id, new org.telegram.ui.Wallet.g(x10Var, y2VarArr, walletTransactionPeer, 14));
                        }
                        i7 = i14;
                        tx0Var = tx0Var4;
                        if (!TextUtils.isEmpty(walletTransactionPeer.domain)) {
                            tx0Var = tx0Var4;
                            if (!TextUtils.isEmpty(walletTransactionPeer.address)) {
                                final int i15 = 0;
                                tx0Var4.i(id.M0(2131743129, null), walletTransactionPeer.domain, new Runnable() { // from class: org.telegram.ui.Wallet.s4
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i15) {
                                            case 0:
                                                y2[] y2VarArr2 = y2VarArr;
                                                y2 y2Var4 = y2VarArr2[0];
                                                final int i16 = 1;
                                                final TL_wallet.WalletTransactionPeer walletTransactionPeer2 = walletTransactionPeer;
                                                y2Var4.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: org.telegram.ui.Wallet.v4
                                                    @Override // android.content.DialogInterface.OnDismissListener
                                                    public final void onDismiss(DialogInterface dialogInterface) {
                                                        switch (i16) {
                                                            case 0:
                                                                org.telegram.ui.ActionBar.f2 T = LaunchActivity.T();
                                                                if (T != null) {
                                                                    T.presentFragment(new o9(walletTransactionPeer2.address));
                                                                    break;
                                                                }
                                                                break;
                                                            default:
                                                                org.telegram.ui.ActionBar.f2 T2 = LaunchActivity.T();
                                                                if (T2 != null) {
                                                                    TL_wallet.WalletTransactionPeer walletTransactionPeer3 = walletTransactionPeer2;
                                                                    o9 o9Var = new o9(walletTransactionPeer3.address);
                                                                    o9Var.A0(walletTransactionPeer3.domain);
                                                                    T2.presentFragment(o9Var);
                                                                    break;
                                                                }
                                                                break;
                                                        }
                                                    }
                                                });
                                                y2VarArr2[0].dismiss();
                                                break;
                                            default:
                                                y2[] y2VarArr3 = y2VarArr;
                                                y2 y2Var5 = y2VarArr3[0];
                                                final int i17 = 0;
                                                final TL_wallet.WalletTransactionPeer walletTransactionPeer3 = walletTransactionPeer;
                                                y2Var5.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: org.telegram.ui.Wallet.v4
                                                    @Override // android.content.DialogInterface.OnDismissListener
                                                    public final void onDismiss(DialogInterface dialogInterface) {
                                                        switch (i17) {
                                                            case 0:
                                                                org.telegram.ui.ActionBar.f2 T = LaunchActivity.T();
                                                                if (T != null) {
                                                                    T.presentFragment(new o9(walletTransactionPeer3.address));
                                                                    break;
                                                                }
                                                                break;
                                                            default:
                                                                org.telegram.ui.ActionBar.f2 T2 = LaunchActivity.T();
                                                                if (T2 != null) {
                                                                    TL_wallet.WalletTransactionPeer walletTransactionPeer32 = walletTransactionPeer3;
                                                                    o9 o9Var = new o9(walletTransactionPeer32.address);
                                                                    o9Var.A0(walletTransactionPeer32.domain);
                                                                    T2.presentFragment(o9Var);
                                                                    break;
                                                                }
                                                                break;
                                                        }
                                                    }
                                                });
                                                y2VarArr3[0].dismiss();
                                                break;
                                        }
                                    }
                                });
                                tx0Var = tx0Var4;
                            }
                        }
                    } else {
                        i7 = i14;
                        tx0Var = tx0Var4;
                        if (walletTransactionPeer instanceof TL_wallet.walletTransactionPeerAddress) {
                            final TL_wallet.walletTransactionPeerAddress wallettransactionpeeraddress = (TL_wallet.walletTransactionPeerAddress) walletTransactionPeer;
                            tx0Var = tx0Var4;
                            if (!TextUtils.isEmpty(wallettransactionpeeraddress.domain)) {
                                if (TextUtils.isEmpty(wallettransactionpeeraddress.address)) {
                                    tx0Var4.i(z9 ? id.M0(2131743015, null) : id.M0(2131743040, null), wallettransactionpeeraddress.domain, new ai.m0(24));
                                    tx0Var = tx0Var4;
                                } else {
                                    if (z9) {
                                        r42 = null;
                                        M0 = id.M0(2131743015, null);
                                    } else {
                                        r42 = null;
                                        M0 = id.M0(2131743040, null);
                                    }
                                    final int i16 = 0;
                                    tx0Var4.h(M0, wallettransactionpeeraddress.domain, new Runnable() { // from class: org.telegram.ui.Wallet.t4
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (i16) {
                                                case 0:
                                                    y2[] y2VarArr2 = y2VarArr;
                                                    y2 y2Var4 = y2VarArr2[0];
                                                    final int i17 = 0;
                                                    final TL_wallet.walletTransactionPeerAddress wallettransactionpeeraddress2 = wallettransactionpeeraddress;
                                                    y2Var4.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: org.telegram.ui.Wallet.w4
                                                        @Override // android.content.DialogInterface.OnDismissListener
                                                        public final void onDismiss(DialogInterface dialogInterface) {
                                                            switch (i17) {
                                                                case 0:
                                                                    org.telegram.ui.ActionBar.f2 T = LaunchActivity.T();
                                                                    if (T != null) {
                                                                        TL_wallet.walletTransactionPeerAddress wallettransactionpeeraddress3 = wallettransactionpeeraddress2;
                                                                        o9 o9Var = new o9(wallettransactionpeeraddress3.address);
                                                                        o9Var.A0(wallettransactionpeeraddress3.domain);
                                                                        T.presentFragment(o9Var);
                                                                        break;
                                                                    }
                                                                    break;
                                                                default:
                                                                    org.telegram.ui.ActionBar.f2 T2 = LaunchActivity.T();
                                                                    if (T2 != null) {
                                                                        TL_wallet.walletTransactionPeerAddress wallettransactionpeeraddress4 = wallettransactionpeeraddress2;
                                                                        o9 o9Var2 = new o9(wallettransactionpeeraddress4.address);
                                                                        o9Var2.A0(wallettransactionpeeraddress4.domain);
                                                                        T2.presentFragment(o9Var2);
                                                                        break;
                                                                    }
                                                                    break;
                                                            }
                                                        }
                                                    });
                                                    y2VarArr2[0].dismiss();
                                                    break;
                                                default:
                                                    y2[] y2VarArr3 = y2VarArr;
                                                    y2 y2Var5 = y2VarArr3[0];
                                                    final int i18 = 1;
                                                    final TL_wallet.walletTransactionPeerAddress wallettransactionpeeraddress3 = wallettransactionpeeraddress;
                                                    y2Var5.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: org.telegram.ui.Wallet.w4
                                                        @Override // android.content.DialogInterface.OnDismissListener
                                                        public final void onDismiss(DialogInterface dialogInterface) {
                                                            switch (i18) {
                                                                case 0:
                                                                    org.telegram.ui.ActionBar.f2 T = LaunchActivity.T();
                                                                    if (T != null) {
                                                                        TL_wallet.walletTransactionPeerAddress wallettransactionpeeraddress32 = wallettransactionpeeraddress3;
                                                                        o9 o9Var = new o9(wallettransactionpeeraddress32.address);
                                                                        o9Var.A0(wallettransactionpeeraddress32.domain);
                                                                        T.presentFragment(o9Var);
                                                                        break;
                                                                    }
                                                                    break;
                                                                default:
                                                                    org.telegram.ui.ActionBar.f2 T2 = LaunchActivity.T();
                                                                    if (T2 != null) {
                                                                        TL_wallet.walletTransactionPeerAddress wallettransactionpeeraddress4 = wallettransactionpeeraddress3;
                                                                        o9 o9Var2 = new o9(wallettransactionpeeraddress4.address);
                                                                        o9Var2.A0(wallettransactionpeeraddress4.domain);
                                                                        T2.presentFragment(o9Var2);
                                                                        break;
                                                                    }
                                                                    break;
                                                            }
                                                        }
                                                    });
                                                    y2VarArr3[0].dismiss();
                                                    break;
                                            }
                                        }
                                    }, id.M0(2131743022, r42), x10Var != null ? r42 : new Runnable() { // from class: org.telegram.ui.Wallet.t4
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (i13) {
                                                case 0:
                                                    y2[] y2VarArr2 = y2VarArr;
                                                    y2 y2Var4 = y2VarArr2[0];
                                                    final int i17 = 0;
                                                    final TL_wallet.walletTransactionPeerAddress wallettransactionpeeraddress2 = wallettransactionpeeraddress;
                                                    y2Var4.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: org.telegram.ui.Wallet.w4
                                                        @Override // android.content.DialogInterface.OnDismissListener
                                                        public final void onDismiss(DialogInterface dialogInterface) {
                                                            switch (i17) {
                                                                case 0:
                                                                    org.telegram.ui.ActionBar.f2 T = LaunchActivity.T();
                                                                    if (T != null) {
                                                                        TL_wallet.walletTransactionPeerAddress wallettransactionpeeraddress32 = wallettransactionpeeraddress2;
                                                                        o9 o9Var = new o9(wallettransactionpeeraddress32.address);
                                                                        o9Var.A0(wallettransactionpeeraddress32.domain);
                                                                        T.presentFragment(o9Var);
                                                                        break;
                                                                    }
                                                                    break;
                                                                default:
                                                                    org.telegram.ui.ActionBar.f2 T2 = LaunchActivity.T();
                                                                    if (T2 != null) {
                                                                        TL_wallet.walletTransactionPeerAddress wallettransactionpeeraddress4 = wallettransactionpeeraddress2;
                                                                        o9 o9Var2 = new o9(wallettransactionpeeraddress4.address);
                                                                        o9Var2.A0(wallettransactionpeeraddress4.domain);
                                                                        T2.presentFragment(o9Var2);
                                                                        break;
                                                                    }
                                                                    break;
                                                            }
                                                        }
                                                    });
                                                    y2VarArr2[0].dismiss();
                                                    break;
                                                default:
                                                    y2[] y2VarArr3 = y2VarArr;
                                                    y2 y2Var5 = y2VarArr3[0];
                                                    final int i18 = 1;
                                                    final TL_wallet.walletTransactionPeerAddress wallettransactionpeeraddress3 = wallettransactionpeeraddress;
                                                    y2Var5.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: org.telegram.ui.Wallet.w4
                                                        @Override // android.content.DialogInterface.OnDismissListener
                                                        public final void onDismiss(DialogInterface dialogInterface) {
                                                            switch (i18) {
                                                                case 0:
                                                                    org.telegram.ui.ActionBar.f2 T = LaunchActivity.T();
                                                                    if (T != null) {
                                                                        TL_wallet.walletTransactionPeerAddress wallettransactionpeeraddress32 = wallettransactionpeeraddress3;
                                                                        o9 o9Var = new o9(wallettransactionpeeraddress32.address);
                                                                        o9Var.A0(wallettransactionpeeraddress32.domain);
                                                                        T.presentFragment(o9Var);
                                                                        break;
                                                                    }
                                                                    break;
                                                                default:
                                                                    org.telegram.ui.ActionBar.f2 T2 = LaunchActivity.T();
                                                                    if (T2 != null) {
                                                                        TL_wallet.walletTransactionPeerAddress wallettransactionpeeraddress4 = wallettransactionpeeraddress3;
                                                                        o9 o9Var2 = new o9(wallettransactionpeeraddress4.address);
                                                                        o9Var2.A0(wallettransactionpeeraddress4.domain);
                                                                        T2.presentFragment(o9Var2);
                                                                        break;
                                                                    }
                                                                    break;
                                                            }
                                                        }
                                                    });
                                                    y2VarArr3[0].dismiss();
                                                    break;
                                            }
                                        }
                                    });
                                    tx0Var = tx0Var4;
                                }
                            }
                        }
                    }
                }
                final TL_wallet.WalletTransactionPeer walletTransactionPeer2 = wallettransaction.peer;
                boolean z15 = walletTransactionPeer2 instanceof TL_wallet.walletTransactionPeerUser;
                if (z15 || (walletTransactionPeer2 instanceof TL_wallet.walletTransactionPeerChannel) || (walletTransactionPeer2 instanceof TL_wallet.walletTransactionPeerAddress)) {
                    boolean z16 = x10Var == null && !(z15 && qp.s1(i7).a2(Long.valueOf(walletTransactionPeer2.user_id)) != null && !t10.A(walletTransactionPeer2.user_id)) && TextUtils.isEmpty(walletTransactionPeer2.domain) && !TextUtils.isEmpty(walletTransactionPeer2.address);
                    String M03 = id.M0(2131743203, null);
                    String str2 = walletTransactionPeer2.address;
                    sb1 sb1Var = new sb1(14, y2VarArr, h6Var);
                    if (TextUtils.isEmpty(str2)) {
                        charSequence = id.M0(2131742973, null);
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
                        spannableStringBuilder3.setSpan(new org.telegram.ui.Cells.h(str2, sb1Var, 11), 0, spannableStringBuilder3.length(), 33);
                        charSequence = spannableStringBuilder3;
                    }
                    final int i18 = 1;
                    tx0Var.j(M03, charSequence, 14, null, z16 ? id.M0(2131743022, null) : null, new Runnable() { // from class: org.telegram.ui.Wallet.s4
                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i18) {
                                case 0:
                                    y2[] y2VarArr2 = y2VarArr;
                                    y2 y2Var4 = y2VarArr2[0];
                                    final int i162 = 1;
                                    final TL_wallet.WalletTransactionPeer walletTransactionPeer22 = walletTransactionPeer2;
                                    y2Var4.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: org.telegram.ui.Wallet.v4
                                        @Override // android.content.DialogInterface.OnDismissListener
                                        public final void onDismiss(DialogInterface dialogInterface) {
                                            switch (i162) {
                                                case 0:
                                                    org.telegram.ui.ActionBar.f2 T = LaunchActivity.T();
                                                    if (T != null) {
                                                        T.presentFragment(new o9(walletTransactionPeer22.address));
                                                        break;
                                                    }
                                                    break;
                                                default:
                                                    org.telegram.ui.ActionBar.f2 T2 = LaunchActivity.T();
                                                    if (T2 != null) {
                                                        TL_wallet.WalletTransactionPeer walletTransactionPeer32 = walletTransactionPeer22;
                                                        o9 o9Var = new o9(walletTransactionPeer32.address);
                                                        o9Var.A0(walletTransactionPeer32.domain);
                                                        T2.presentFragment(o9Var);
                                                        break;
                                                    }
                                                    break;
                                            }
                                        }
                                    });
                                    y2VarArr2[0].dismiss();
                                    break;
                                default:
                                    y2[] y2VarArr3 = y2VarArr;
                                    y2 y2Var5 = y2VarArr3[0];
                                    final int i172 = 0;
                                    final TL_wallet.WalletTransactionPeer walletTransactionPeer3 = walletTransactionPeer2;
                                    y2Var5.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: org.telegram.ui.Wallet.v4
                                        @Override // android.content.DialogInterface.OnDismissListener
                                        public final void onDismiss(DialogInterface dialogInterface) {
                                            switch (i172) {
                                                case 0:
                                                    org.telegram.ui.ActionBar.f2 T = LaunchActivity.T();
                                                    if (T != null) {
                                                        T.presentFragment(new o9(walletTransactionPeer3.address));
                                                        break;
                                                    }
                                                    break;
                                                default:
                                                    org.telegram.ui.ActionBar.f2 T2 = LaunchActivity.T();
                                                    if (T2 != null) {
                                                        TL_wallet.WalletTransactionPeer walletTransactionPeer32 = walletTransactionPeer3;
                                                        o9 o9Var = new o9(walletTransactionPeer32.address);
                                                        o9Var.A0(walletTransactionPeer32.domain);
                                                        T2.presentFragment(o9Var);
                                                        break;
                                                    }
                                                    break;
                                            }
                                        }
                                    });
                                    y2VarArr3[0].dismiss();
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
                        org.telegram.ui.ActionBar.t6.U(textViewArr[0], z11 ? org.telegram.ui.ActionBar.m6.z6 : org.telegram.ui.ActionBar.m6.G6, h6Var);
                        if (!wallettransaction.preview || j3 > 0) {
                            textViewArr[0].setText(org.telegram.ui.Wallet.z5.w0(i7, j10, h6Var));
                        } else {
                            if (spannableStringArr[0] == null) {
                                SpannableString spannableString = new SpannableString(id.M0(2131748779, null));
                                spannableStringArr[0] = spannableString;
                                spannableString.setSpan(new b80(org.telegram.messenger.g0.L(150.0f), textViewArr[0]), 0, spannableStringArr[0].length(), 33);
                            }
                            textViewArr[0].setText(spannableStringArr[0]);
                        }
                        r62 = 0;
                        tx0Var.f(textViewArr[0], id.M0(2131743121, null));
                        if (wallettransaction.date == 0) {
                            tx0Var.c(id.M0(2131743144, r62), id.Q(wallettransaction.date), r62, r62);
                            break;
                        }
                    }
                } else {
                    SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder("x ");
                    wp wpVar = new wp(R.drawable.wallet_gram_small, 2);
                    wpVar.d = false;
                    wpVar.c(org.telegram.messenger.g0.L(16.0f));
                    float L = org.telegram.messenger.g0.L(1.0f);
                    wpVar.r = 0.0f;
                    wpVar.s = L;
                    spannableStringBuilder4.setSpan(wpVar, 0, 1, 33);
                    spannableStringBuilder4.append((CharSequence) id.M0(2131743118, null));
                    tx0Var.e(id.M0(2131743121, null), spannableStringBuilder4, "?", new bi.f9(i7, 7, j3, context, h6Var), null);
                }
                r62 = 0;
                if (wallettransaction.date == 0) {
                }
                break;
        }
    }

    public /* synthetic */ r(long[] jArr, fi.d dVar, wp[] wpVarArr, s0 s0Var, n0 n0Var, int i7, bi.e5 e5Var, bi.e5 e5Var2, bi.e5 e5Var3, s sVar, boolean[] zArr) {
        this.c = jArr;
        this.d = dVar;
        this.e = wpVarArr;
        this.f = s0Var;
        this.g = n0Var;
        this.b = i7;
        this.h = e5Var;
        this.i = e5Var2;
        this.j = e5Var3;
        this.k = sVar;
        this.l = zArr;
    }
}
