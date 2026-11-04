package ei;

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
import ci.wb;
import org.telegram.messenger.bd;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.hp;
import org.telegram.messenger.l10;
import org.telegram.messenger.p10;
import org.telegram.messenger.u10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.ia;
import org.telegram.ui.Components.n61;
import org.telegram.ui.Components.rx0;
import org.telegram.ui.Components.wp;
import org.telegram.ui.Components.x70;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ma1;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class s implements u10 {
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

    public /* synthetic */ s(LinearLayout linearLayout, org.telegram.ui.Wallet.z4 z4Var, org.telegram.ui.ActionBar.e6 e6Var, int i3, TextView textView, org.telegram.ui.Wallet.y2[] y2VarArr, rx0 rx0Var, p10 p10Var, Context context, TextView[] textViewArr, SpannableString[] spannableStringArr) {
        this.c = linearLayout;
        this.d = z4Var;
        this.e = e6Var;
        this.b = i3;
        this.f = textView;
        this.g = y2VarArr;
        this.h = rx0Var;
        this.i = p10Var;
        this.j = context;
        this.k = textViewArr;
        this.l = spannableStringArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:91:0x04ea  */
    /* JADX WARN: Type inference failed for: r10v15 */
    /* JADX WARN: Type inference failed for: r10v16 */
    /* JADX WARN: Type inference failed for: r10v17 */
    /* JADX WARN: Type inference failed for: r10v18 */
    /* JADX WARN: Type inference failed for: r10v19 */
    /* JADX WARN: Type inference failed for: r10v20 */
    /* JADX WARN: Type inference failed for: r10v21 */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v7, types: [org.telegram.ui.Components.rx0] */
    /* JADX WARN: Type inference failed for: r12v8, types: [org.telegram.ui.Wallet.q4] */
    /* JADX WARN: Type inference failed for: r16v4, types: [org.telegram.ui.Components.rx0] */
    /* JADX WARN: Type inference failed for: r3v5, types: [org.telegram.ui.Wallet.p4] */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v19, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Type inference failed for: r6v36 */
    /* JADX WARN: Type inference failed for: r6v38, types: [java.lang.String, org.telegram.ui.Components.hc[], org.telegram.ui.Components.qx0[]] */
    /* JADX WARN: Type inference failed for: r6v39 */
    @Override // org.telegram.messenger.u10
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Object obj) {
        Context context;
        boolean z10;
        long j10;
        org.telegram.ui.Wallet.y2 y2Var;
        ia iaVar;
        org.telegram.ui.Wallet.y2 y2Var2;
        ia iaVar2;
        int i3;
        ?? r42;
        String M0;
        rx0 rx0Var;
        CharSequence charSequence;
        ?? r62;
        String str;
        String M02;
        int i10;
        char c2;
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
                u0 u0Var = (u0) obj7;
                ai.o2 o2Var = (ai.o2) viewGroup;
                ai.o2 o2Var2 = (ai.o2) obj5;
                ai.o2 o2Var3 = (ai.o2) obj4;
                t tVar = (t) obj3;
                boolean[] zArr = (boolean[]) obj2;
                Integer num = (Integer) obj;
                long intValue = num.intValue();
                jArr[0] = intValue;
                ((gi.d) view).i(wb.Y0(false, bd.a0(null, null, 2131745166, bd.E(intValue, ',')), (wp[]) obj8), true, true);
                u0Var.g = jArr[0];
                ((p0) obj6).set(u0Var);
                int intValue2 = num.intValue();
                int i12 = this.b;
                int b10 = u.b(i12, intValue2, 0);
                int b11 = u.b(i12, num.intValue(), 1);
                int b12 = u.b(i12, num.intValue(), 2);
                ((org.telegram.ui.Components.h6) o2Var.b).c(b10 >= 60 ? bd.a0(null, null, 2131745316, Integer.valueOf(b10 / 60)) : bd.a0(null, null, 2131745314, Integer.valueOf(b10)), true, true);
                ((org.telegram.ui.Components.h6) o2Var2.b).c(bd.E(b11, ','), true, true);
                ((org.telegram.ui.Components.h6) o2Var3.b).c(bd.E(b12, ','), true, true);
                tVar.f(u.b(i12, num.intValue(), 3), u.b(i12, num.intValue(), 4), true ^ zArr[0]);
                zArr[0] = false;
                break;
            default:
                LinearLayout linearLayout = (LinearLayout) obj9;
                org.telegram.ui.Wallet.z4 z4Var = (org.telegram.ui.Wallet.z4) view;
                org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) obj8;
                TextView textView = (TextView) obj7;
                final org.telegram.ui.Wallet.y2[] y2VarArr = (org.telegram.ui.Wallet.y2[]) obj6;
                rx0 rx0Var2 = (rx0) viewGroup;
                p10 p10Var = (p10) obj5;
                Context context2 = (Context) obj4;
                TextView[] textViewArr = (TextView[]) obj3;
                SpannableString[] spannableStringArr = (SpannableString[]) obj2;
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj;
                final int i13 = 1;
                long abs = Math.abs(wallettransaction.amount);
                boolean z11 = wallettransaction.incoming;
                long abs2 = Math.abs(wallettransaction.fee);
                boolean z12 = wallettransaction.pending || wallettransaction.failed;
                boolean z13 = ((linearLayout.getParent() instanceof View) && (linearLayout.getParent().getParent() instanceof n61) && ((n61) linearLayout.getParent().getParent()).getViewPages()[0] != linearLayout.getParent()) ? false : true;
                boolean z14 = wallettransaction.key_change;
                boolean z15 = z13;
                int i14 = this.b;
                if (z14 || wallettransaction.nft != null) {
                    context = context2;
                    z10 = z11;
                    j10 = abs2;
                    if (!z14) {
                        TL_wallet.nftItem nftitem = wallettransaction.nft;
                        if (nftitem != null && z15 && (y2Var = y2VarArr[0]) != null && (iaVar = y2Var.m1) != null) {
                            iaVar.setTitle(TextUtils.isEmpty(nftitem.name) ? bd.M0(2131743186, null) : wallettransaction.nft.name);
                        }
                    } else if (z15 && (y2Var2 = y2VarArr[0]) != null && (iaVar2 = y2Var2.m1) != null) {
                        iaVar2.setTitle(org.telegram.ui.Wallet.k0.l("Grams", org.telegram.ui.Wallet.k0.q(org.telegram.ui.Wallet.k0.o(abs, false), 0.75f), 2131749515));
                    }
                } else {
                    org.telegram.ui.ActionBar.r6.V(z4Var, z12 ? org.telegram.ui.ActionBar.k6.z6 : org.telegram.ui.ActionBar.k6.Ci, e6Var);
                    SpannableStringBuilder q10 = org.telegram.ui.Wallet.k0.q(org.telegram.ui.Wallet.k0.o(abs, false), 0.75f);
                    context = context2;
                    q10.insert(0, (CharSequence) (z11 ? "+" : "–"));
                    if (z12) {
                        z10 = z11;
                        j10 = abs2;
                    } else {
                        z10 = z11;
                        j10 = abs2;
                        q10.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.k6.w0(z11 ? org.telegram.ui.ActionBar.k6.ik : org.telegram.ui.ActionBar.k6.G6, e6Var)), 0, q10.length(), 33);
                    }
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append((CharSequence) org.telegram.ui.Wallet.k0.l("Grams", q10, 2131749515));
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
                    z4Var.setText(spannableStringBuilder);
                    CharSequence m10 = org.telegram.ui.Wallet.k0.x(i14).m(abs, false);
                    if (z12) {
                        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(wallettransaction.failed ? bd.M0(2131743133, null) : x9.a(textView, bd.M0(2131743024, null)));
                        c2 = 0;
                        spannableStringBuilder2.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.k6.w0(wallettransaction.failed ? org.telegram.ui.ActionBar.k6.p7 : org.telegram.ui.ActionBar.k6.n6, e6Var)), 0, spannableStringBuilder2.length(), 33);
                        textView.setText(bd.V(null, null, 2131742997, m10, spannableStringBuilder2));
                    } else {
                        c2 = 0;
                        textView.setText(m10);
                    }
                    if (z15 && (y2Var3 = y2VarArr[c2]) != null && (iaVar3 = y2Var3.m1) != null) {
                        iaVar3.setTitle(org.telegram.ui.Wallet.k0.l("Grams", q10, 2131749515));
                    }
                }
                rx0Var2.removeAllViews();
                final TL_wallet.WalletTransactionPeer walletTransactionPeer = wallettransaction.peer;
                int i15 = 11;
                if (walletTransactionPeer instanceof TL_wallet.walletTransactionPeerUser) {
                    TL_wallet.walletTransactionPeerUser wallettransactionpeeruser = (TL_wallet.walletTransactionPeerUser) walletTransactionPeer;
                    TLRPC.User a22 = hp.s1(i14).a2(Long.valueOf(wallettransactionpeeruser.user_id));
                    if (a22 != null && !l10.A(a22.id)) {
                        if (z10) {
                            str = null;
                            M02 = bd.M0(2131743025, null);
                        } else {
                            str = null;
                            M02 = bd.M0(2131743050, null);
                        }
                        rx0Var2.m(M02, i14, wallettransactionpeeruser.user_id, new org.telegram.ui.Wallet.g(p10Var, y2VarArr, wallettransactionpeeruser, 11), bd.M0(2131743032, str), p10Var != null ? null : new ma1(17, y2VarArr, a22));
                    }
                    rx0 rx0Var3 = rx0Var2;
                    if (!TextUtils.isEmpty(wallettransactionpeeruser.domain) && !TextUtils.isEmpty(wallettransactionpeeruser.address)) {
                        rx0Var3.i(bd.M0(2131743139, null), wallettransactionpeeruser.domain, new org.telegram.ui.Wallet.g(y2VarArr, a22, wallettransactionpeeruser, 12));
                    }
                    i3 = i14;
                    rx0Var = rx0Var3;
                } else {
                    rx0 rx0Var4 = rx0Var2;
                    if (walletTransactionPeer instanceof TL_wallet.walletTransactionPeerChannel) {
                        if (hp.s1(i14).M0(Long.valueOf(walletTransactionPeer.channel_id)) != null) {
                            rx0Var4.n(z10 ? bd.M0(2131743025, null) : bd.M0(2131743050, null), i14, -walletTransactionPeer.channel_id, new org.telegram.ui.Wallet.g(p10Var, y2VarArr, walletTransactionPeer, 13));
                        }
                        i3 = i14;
                        rx0Var = rx0Var4;
                        if (!TextUtils.isEmpty(walletTransactionPeer.domain)) {
                            rx0Var = rx0Var4;
                            if (!TextUtils.isEmpty(walletTransactionPeer.address)) {
                                final int i16 = 0;
                                rx0Var4.i(bd.M0(2131743139, null), walletTransactionPeer.domain, new Runnable() { // from class: org.telegram.ui.Wallet.p4
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i16) {
                                            case 0:
                                                y2[] y2VarArr2 = y2VarArr;
                                                y2 y2Var4 = y2VarArr2[0];
                                                final int i17 = 1;
                                                final TL_wallet.WalletTransactionPeer walletTransactionPeer2 = walletTransactionPeer;
                                                y2Var4.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: org.telegram.ui.Wallet.s4
                                                    @Override // android.content.DialogInterface.OnDismissListener
                                                    public final void onDismiss(DialogInterface dialogInterface) {
                                                        switch (i17) {
                                                            case 0:
                                                                org.telegram.ui.ActionBar.d2 T = LaunchActivity.T();
                                                                if (T != null) {
                                                                    T.presentFragment(new m9(walletTransactionPeer2.address));
                                                                    break;
                                                                }
                                                                break;
                                                            default:
                                                                org.telegram.ui.ActionBar.d2 T2 = LaunchActivity.T();
                                                                if (T2 != null) {
                                                                    TL_wallet.WalletTransactionPeer walletTransactionPeer3 = walletTransactionPeer2;
                                                                    m9 m9Var = new m9(walletTransactionPeer3.address);
                                                                    m9Var.A0(walletTransactionPeer3.domain);
                                                                    T2.presentFragment(m9Var);
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
                                                final int i18 = 0;
                                                final TL_wallet.WalletTransactionPeer walletTransactionPeer3 = walletTransactionPeer;
                                                y2Var5.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: org.telegram.ui.Wallet.s4
                                                    @Override // android.content.DialogInterface.OnDismissListener
                                                    public final void onDismiss(DialogInterface dialogInterface) {
                                                        switch (i18) {
                                                            case 0:
                                                                org.telegram.ui.ActionBar.d2 T = LaunchActivity.T();
                                                                if (T != null) {
                                                                    T.presentFragment(new m9(walletTransactionPeer3.address));
                                                                    break;
                                                                }
                                                                break;
                                                            default:
                                                                org.telegram.ui.ActionBar.d2 T2 = LaunchActivity.T();
                                                                if (T2 != null) {
                                                                    TL_wallet.WalletTransactionPeer walletTransactionPeer32 = walletTransactionPeer3;
                                                                    m9 m9Var = new m9(walletTransactionPeer32.address);
                                                                    m9Var.A0(walletTransactionPeer32.domain);
                                                                    T2.presentFragment(m9Var);
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
                                rx0Var = rx0Var4;
                            }
                        }
                    } else {
                        i3 = i14;
                        rx0Var = rx0Var4;
                        if (walletTransactionPeer instanceof TL_wallet.walletTransactionPeerAddress) {
                            final TL_wallet.walletTransactionPeerAddress wallettransactionpeeraddress = (TL_wallet.walletTransactionPeerAddress) walletTransactionPeer;
                            rx0Var = rx0Var4;
                            if (!TextUtils.isEmpty(wallettransactionpeeraddress.domain)) {
                                if (TextUtils.isEmpty(wallettransactionpeeraddress.address)) {
                                    rx0Var4.i(z10 ? bd.M0(2131743025, null) : bd.M0(2131743050, null), wallettransactionpeeraddress.domain, new ai.y1(26));
                                    rx0Var = rx0Var4;
                                } else {
                                    if (z10) {
                                        r42 = null;
                                        M0 = bd.M0(2131743025, null);
                                    } else {
                                        r42 = null;
                                        M0 = bd.M0(2131743050, null);
                                    }
                                    final int i17 = 0;
                                    rx0Var4.h(M0, wallettransactionpeeraddress.domain, new Runnable() { // from class: org.telegram.ui.Wallet.q4
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (i17) {
                                                case 0:
                                                    y2[] y2VarArr2 = y2VarArr;
                                                    y2 y2Var4 = y2VarArr2[0];
                                                    final int i18 = 0;
                                                    final TL_wallet.walletTransactionPeerAddress wallettransactionpeeraddress2 = wallettransactionpeeraddress;
                                                    y2Var4.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: org.telegram.ui.Wallet.t4
                                                        @Override // android.content.DialogInterface.OnDismissListener
                                                        public final void onDismiss(DialogInterface dialogInterface) {
                                                            switch (i18) {
                                                                case 0:
                                                                    org.telegram.ui.ActionBar.d2 T = LaunchActivity.T();
                                                                    if (T != null) {
                                                                        TL_wallet.walletTransactionPeerAddress wallettransactionpeeraddress3 = wallettransactionpeeraddress2;
                                                                        m9 m9Var = new m9(wallettransactionpeeraddress3.address);
                                                                        m9Var.A0(wallettransactionpeeraddress3.domain);
                                                                        T.presentFragment(m9Var);
                                                                        break;
                                                                    }
                                                                    break;
                                                                default:
                                                                    org.telegram.ui.ActionBar.d2 T2 = LaunchActivity.T();
                                                                    if (T2 != null) {
                                                                        TL_wallet.walletTransactionPeerAddress wallettransactionpeeraddress4 = wallettransactionpeeraddress2;
                                                                        m9 m9Var2 = new m9(wallettransactionpeeraddress4.address);
                                                                        m9Var2.A0(wallettransactionpeeraddress4.domain);
                                                                        T2.presentFragment(m9Var2);
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
                                                    final int i19 = 1;
                                                    final TL_wallet.walletTransactionPeerAddress wallettransactionpeeraddress3 = wallettransactionpeeraddress;
                                                    y2Var5.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: org.telegram.ui.Wallet.t4
                                                        @Override // android.content.DialogInterface.OnDismissListener
                                                        public final void onDismiss(DialogInterface dialogInterface) {
                                                            switch (i19) {
                                                                case 0:
                                                                    org.telegram.ui.ActionBar.d2 T = LaunchActivity.T();
                                                                    if (T != null) {
                                                                        TL_wallet.walletTransactionPeerAddress wallettransactionpeeraddress32 = wallettransactionpeeraddress3;
                                                                        m9 m9Var = new m9(wallettransactionpeeraddress32.address);
                                                                        m9Var.A0(wallettransactionpeeraddress32.domain);
                                                                        T.presentFragment(m9Var);
                                                                        break;
                                                                    }
                                                                    break;
                                                                default:
                                                                    org.telegram.ui.ActionBar.d2 T2 = LaunchActivity.T();
                                                                    if (T2 != null) {
                                                                        TL_wallet.walletTransactionPeerAddress wallettransactionpeeraddress4 = wallettransactionpeeraddress3;
                                                                        m9 m9Var2 = new m9(wallettransactionpeeraddress4.address);
                                                                        m9Var2.A0(wallettransactionpeeraddress4.domain);
                                                                        T2.presentFragment(m9Var2);
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
                                    }, bd.M0(2131743032, r42), p10Var != null ? r42 : new Runnable() { // from class: org.telegram.ui.Wallet.q4
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (i13) {
                                                case 0:
                                                    y2[] y2VarArr2 = y2VarArr;
                                                    y2 y2Var4 = y2VarArr2[0];
                                                    final int i18 = 0;
                                                    final TL_wallet.walletTransactionPeerAddress wallettransactionpeeraddress2 = wallettransactionpeeraddress;
                                                    y2Var4.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: org.telegram.ui.Wallet.t4
                                                        @Override // android.content.DialogInterface.OnDismissListener
                                                        public final void onDismiss(DialogInterface dialogInterface) {
                                                            switch (i18) {
                                                                case 0:
                                                                    org.telegram.ui.ActionBar.d2 T = LaunchActivity.T();
                                                                    if (T != null) {
                                                                        TL_wallet.walletTransactionPeerAddress wallettransactionpeeraddress32 = wallettransactionpeeraddress2;
                                                                        m9 m9Var = new m9(wallettransactionpeeraddress32.address);
                                                                        m9Var.A0(wallettransactionpeeraddress32.domain);
                                                                        T.presentFragment(m9Var);
                                                                        break;
                                                                    }
                                                                    break;
                                                                default:
                                                                    org.telegram.ui.ActionBar.d2 T2 = LaunchActivity.T();
                                                                    if (T2 != null) {
                                                                        TL_wallet.walletTransactionPeerAddress wallettransactionpeeraddress4 = wallettransactionpeeraddress2;
                                                                        m9 m9Var2 = new m9(wallettransactionpeeraddress4.address);
                                                                        m9Var2.A0(wallettransactionpeeraddress4.domain);
                                                                        T2.presentFragment(m9Var2);
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
                                                    final int i19 = 1;
                                                    final TL_wallet.walletTransactionPeerAddress wallettransactionpeeraddress3 = wallettransactionpeeraddress;
                                                    y2Var5.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: org.telegram.ui.Wallet.t4
                                                        @Override // android.content.DialogInterface.OnDismissListener
                                                        public final void onDismiss(DialogInterface dialogInterface) {
                                                            switch (i19) {
                                                                case 0:
                                                                    org.telegram.ui.ActionBar.d2 T = LaunchActivity.T();
                                                                    if (T != null) {
                                                                        TL_wallet.walletTransactionPeerAddress wallettransactionpeeraddress32 = wallettransactionpeeraddress3;
                                                                        m9 m9Var = new m9(wallettransactionpeeraddress32.address);
                                                                        m9Var.A0(wallettransactionpeeraddress32.domain);
                                                                        T.presentFragment(m9Var);
                                                                        break;
                                                                    }
                                                                    break;
                                                                default:
                                                                    org.telegram.ui.ActionBar.d2 T2 = LaunchActivity.T();
                                                                    if (T2 != null) {
                                                                        TL_wallet.walletTransactionPeerAddress wallettransactionpeeraddress4 = wallettransactionpeeraddress3;
                                                                        m9 m9Var2 = new m9(wallettransactionpeeraddress4.address);
                                                                        m9Var2.A0(wallettransactionpeeraddress4.domain);
                                                                        T2.presentFragment(m9Var2);
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
                                    rx0Var = rx0Var4;
                                }
                            }
                        }
                    }
                }
                final TL_wallet.WalletTransactionPeer walletTransactionPeer2 = wallettransaction.peer;
                boolean z16 = walletTransactionPeer2 instanceof TL_wallet.walletTransactionPeerUser;
                if (z16 || (walletTransactionPeer2 instanceof TL_wallet.walletTransactionPeerChannel) || (walletTransactionPeer2 instanceof TL_wallet.walletTransactionPeerAddress)) {
                    boolean z17 = p10Var == null && !(z16 && hp.s1(i3).a2(Long.valueOf(walletTransactionPeer2.user_id)) != null && !l10.A(walletTransactionPeer2.user_id)) && TextUtils.isEmpty(walletTransactionPeer2.domain) && !TextUtils.isEmpty(walletTransactionPeer2.address);
                    String M03 = bd.M0(2131743213, null);
                    String str2 = walletTransactionPeer2.address;
                    ma1 ma1Var = new ma1(18, y2VarArr, e6Var);
                    if (TextUtils.isEmpty(str2)) {
                        charSequence = bd.M0(2131742983, null);
                    } else {
                        SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder();
                        for (int i18 = 0; i18 < str2.length(); i18++) {
                            if (i18 > 0 && i18 % 4 == 0) {
                                spannableStringBuilder3.append(i18 % 16 == 0 ? '\n' : ' ');
                                spannableStringBuilder3.length();
                            }
                            spannableStringBuilder3.append(str2.charAt(i18));
                            if (i18 % 4 == 3) {
                                spannableStringBuilder3.length();
                            }
                        }
                        spannableStringBuilder3.setSpan(new org.telegram.ui.Cells.h(str2, ma1Var, i15), 0, spannableStringBuilder3.length(), 33);
                        charSequence = spannableStringBuilder3;
                    }
                    final int i19 = 1;
                    rx0Var.j(M03, charSequence, 14, null, z17 ? bd.M0(2131743032, null) : null, new Runnable() { // from class: org.telegram.ui.Wallet.p4
                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i19) {
                                case 0:
                                    y2[] y2VarArr2 = y2VarArr;
                                    y2 y2Var4 = y2VarArr2[0];
                                    final int i172 = 1;
                                    final TL_wallet.WalletTransactionPeer walletTransactionPeer22 = walletTransactionPeer2;
                                    y2Var4.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: org.telegram.ui.Wallet.s4
                                        @Override // android.content.DialogInterface.OnDismissListener
                                        public final void onDismiss(DialogInterface dialogInterface) {
                                            switch (i172) {
                                                case 0:
                                                    org.telegram.ui.ActionBar.d2 T = LaunchActivity.T();
                                                    if (T != null) {
                                                        T.presentFragment(new m9(walletTransactionPeer22.address));
                                                        break;
                                                    }
                                                    break;
                                                default:
                                                    org.telegram.ui.ActionBar.d2 T2 = LaunchActivity.T();
                                                    if (T2 != null) {
                                                        TL_wallet.WalletTransactionPeer walletTransactionPeer32 = walletTransactionPeer22;
                                                        m9 m9Var = new m9(walletTransactionPeer32.address);
                                                        m9Var.A0(walletTransactionPeer32.domain);
                                                        T2.presentFragment(m9Var);
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
                                    final int i182 = 0;
                                    final TL_wallet.WalletTransactionPeer walletTransactionPeer3 = walletTransactionPeer2;
                                    y2Var5.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: org.telegram.ui.Wallet.s4
                                        @Override // android.content.DialogInterface.OnDismissListener
                                        public final void onDismiss(DialogInterface dialogInterface) {
                                            switch (i182) {
                                                case 0:
                                                    org.telegram.ui.ActionBar.d2 T = LaunchActivity.T();
                                                    if (T != null) {
                                                        T.presentFragment(new m9(walletTransactionPeer3.address));
                                                        break;
                                                    }
                                                    break;
                                                default:
                                                    org.telegram.ui.ActionBar.d2 T2 = LaunchActivity.T();
                                                    if (T2 != null) {
                                                        TL_wallet.WalletTransactionPeer walletTransactionPeer32 = walletTransactionPeer3;
                                                        m9 m9Var = new m9(walletTransactionPeer32.address);
                                                        m9Var.A0(walletTransactionPeer32.domain);
                                                        T2.presentFragment(m9Var);
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
                if (j10 <= 0 || !wallettransaction.gasless) {
                    Context context3 = context;
                    long j11 = j10;
                    if (j10 > 0 || wallettransaction.nft != null || wallettransaction.preview) {
                        TextView textView2 = new TextView(context3);
                        textViewArr[0] = textView2;
                        textView2.setGravity(16);
                        textViewArr[0].setIncludeFontPadding(false);
                        textViewArr[0].setTextSize(1, 14.0f);
                        org.telegram.ui.ActionBar.r6.V(textViewArr[0], z12 ? org.telegram.ui.ActionBar.k6.z6 : org.telegram.ui.ActionBar.k6.G6, e6Var);
                        if (!wallettransaction.preview || j10 > 0) {
                            textViewArr[0].setText(org.telegram.ui.Wallet.w5.w0(i3, j11, e6Var));
                        } else {
                            if (spannableStringArr[0] == null) {
                                SpannableString spannableString = new SpannableString(bd.M0(2131748787, null));
                                spannableStringArr[0] = spannableString;
                                spannableString.setSpan(new x70(org.telegram.messenger.g0.L(150.0f), textViewArr[0]), 0, spannableStringArr[0].length(), 33);
                            }
                            textViewArr[0].setText(spannableStringArr[0]);
                        }
                        r62 = 0;
                        rx0Var.f(textViewArr[0], bd.M0(2131743131, null));
                        if (wallettransaction.date == 0) {
                            rx0Var.c(bd.M0(2131743154, r62), bd.Q(wallettransaction.date), r62, r62);
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
                    spannableStringBuilder4.append((CharSequence) bd.M0(2131743128, null));
                    rx0Var.e(bd.M0(2131743131, null), spannableStringBuilder4, "?", new ci.f8(i3, 7, j10, context, e6Var), null);
                }
                r62 = 0;
                if (wallettransaction.date == 0) {
                }
                break;
        }
    }

    public /* synthetic */ s(long[] jArr, gi.d dVar, wp[] wpVarArr, u0 u0Var, p0 p0Var, int i3, ai.o2 o2Var, ai.o2 o2Var2, ai.o2 o2Var3, t tVar, boolean[] zArr) {
        this.c = jArr;
        this.d = dVar;
        this.e = wpVarArr;
        this.f = u0Var;
        this.g = p0Var;
        this.b = i3;
        this.h = o2Var;
        this.i = o2Var2;
        this.j = o2Var3;
        this.k = tVar;
        this.l = zArr;
    }
}
