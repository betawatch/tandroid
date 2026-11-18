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
import di.pb;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.gd;
import org.telegram.messenger.mp;
import org.telegram.messenger.o10;
import org.telegram.messenger.s10;
import org.telegram.messenger.x10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.cy0;
import org.telegram.ui.Components.g71;
import org.telegram.ui.Components.lc;
import org.telegram.ui.Components.lq;
import org.telegram.ui.Components.na;
import org.telegram.ui.Components.p80;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes4.dex */
public final /* synthetic */ class r implements x10 {
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

    public /* synthetic */ r(LinearLayout linearLayout, org.telegram.ui.Wallet.q5 q5Var, org.telegram.ui.ActionBar.i6 i6Var, int i7, TextView textView, org.telegram.ui.Wallet.e3[] e3VarArr, cy0 cy0Var, s10 s10Var, Context context, TextView[] textViewArr, SpannableString[] spannableStringArr) {
        this.c = linearLayout;
        this.d = q5Var;
        this.e = i6Var;
        this.b = i7;
        this.f = textView;
        this.g = e3VarArr;
        this.h = cy0Var;
        this.i = s10Var;
        this.j = context;
        this.k = textViewArr;
        this.l = spannableStringArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0544  */
    /* JADX WARN: Type inference failed for: r11v5, types: [org.telegram.ui.Wallet.g5] */
    /* JADX WARN: Type inference failed for: r15v11 */
    /* JADX WARN: Type inference failed for: r15v12, types: [java.lang.String, org.telegram.ui.Components.by0[], org.telegram.ui.Components.nc[]] */
    /* JADX WARN: Type inference failed for: r15v14 */
    /* JADX WARN: Type inference failed for: r16v10 */
    /* JADX WARN: Type inference failed for: r16v4 */
    /* JADX WARN: Type inference failed for: r16v5, types: [org.telegram.ui.Components.cy0] */
    /* JADX WARN: Type inference failed for: r16v8 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v20, types: [org.telegram.ui.Wallet.f5] */
    /* JADX WARN: Type inference failed for: r5v36 */
    /* JADX WARN: Type inference failed for: r5v41, types: [java.lang.String, org.telegram.ui.Components.by0[], org.telegram.ui.Components.nc[]] */
    /* JADX WARN: Type inference failed for: r5v42 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v18 */
    /* JADX WARN: Type inference failed for: r9v19 */
    /* JADX WARN: Type inference failed for: r9v20 */
    /* JADX WARN: Type inference failed for: r9v21 */
    /* JADX WARN: Type inference failed for: r9v22 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v6, types: [org.telegram.ui.Components.cy0] */
    /* JADX WARN: Type inference failed for: r9v8, types: [org.telegram.ui.Components.cy0] */
    @Override // org.telegram.messenger.x10
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Object obj) {
        SpannableString[] spannableStringArr;
        long j3;
        boolean z10;
        org.telegram.ui.Wallet.e3 e3Var;
        na naVar;
        org.telegram.ui.Wallet.e3 e3Var2;
        na naVar2;
        int i7;
        ?? r32;
        String M0;
        org.telegram.ui.Wallet.g5 g5Var;
        ?? r92;
        ?? r16;
        long j10;
        ?? r52;
        org.telegram.ui.Wallet.f3 c10;
        ?? r15;
        String str;
        String M02;
        int i10;
        char c11;
        org.telegram.ui.Wallet.e3 e3Var3;
        na naVar3;
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
                r0 r0Var = (r0) obj7;
                bi.a3 a3Var = (bi.a3) viewGroup;
                bi.a3 a3Var2 = (bi.a3) obj5;
                bi.a3 a3Var3 = (bi.a3) obj4;
                s sVar = (s) obj3;
                boolean[] zArr = (boolean[]) obj2;
                Integer num = (Integer) obj;
                long intValue = num.intValue();
                jArr[0] = intValue;
                ((hi.d) view).i(pb.Z0(false, gd.a0(null, null, 2131744921, gd.E(intValue, ',')), (lq[]) obj8), true, true);
                r0Var.g = jArr[0];
                ((m0) obj6).set(r0Var);
                int intValue2 = num.intValue();
                int i12 = this.b;
                int b10 = t.b(i12, intValue2, 0);
                int b11 = t.b(i12, num.intValue(), 1);
                int b12 = t.b(i12, num.intValue(), 2);
                ((org.telegram.ui.Components.n6) a3Var.b).c(b10 >= 60 ? gd.a0(null, null, 2131745111, Integer.valueOf(b10 / 60)) : gd.a0(null, null, 2131745109, Integer.valueOf(b10)), true, true);
                ((org.telegram.ui.Components.n6) a3Var2.b).c(gd.E(b11, ','), true, true);
                ((org.telegram.ui.Components.n6) a3Var3.b).c(gd.E(b12, ','), true, true);
                sVar.f(t.b(i12, num.intValue(), 3), t.b(i12, num.intValue(), 4), true ^ zArr[0]);
                zArr[0] = false;
                break;
            default:
                LinearLayout linearLayout = (LinearLayout) obj9;
                org.telegram.ui.Wallet.q5 q5Var = (org.telegram.ui.Wallet.q5) view;
                final org.telegram.ui.ActionBar.i6 i6Var = (org.telegram.ui.ActionBar.i6) obj8;
                TextView textView = (TextView) obj7;
                final org.telegram.ui.Wallet.e3[] e3VarArr = (org.telegram.ui.Wallet.e3[]) obj6;
                cy0 cy0Var = (cy0) viewGroup;
                s10 s10Var = (s10) obj5;
                Context context = (Context) obj4;
                TextView[] textViewArr = (TextView[]) obj3;
                SpannableString[] spannableStringArr2 = (SpannableString[]) obj2;
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj;
                long abs = Math.abs(wallettransaction.amount);
                int i13 = 1;
                boolean z11 = wallettransaction.incoming;
                long abs2 = Math.abs(wallettransaction.fee);
                boolean z12 = wallettransaction.pending || wallettransaction.failed;
                boolean z13 = ((linearLayout.getParent() instanceof View) && (linearLayout.getParent().getParent() instanceof g71) && ((g71) linearLayout.getParent().getParent()).getViewPages()[0] != linearLayout.getParent()) ? false : true;
                boolean z14 = wallettransaction.key_change;
                boolean z15 = z13;
                int i14 = this.b;
                if (z14 || wallettransaction.nft != null) {
                    spannableStringArr = spannableStringArr2;
                    j3 = abs2;
                    z10 = z11;
                    if (!z14) {
                        TL_wallet.nftItem nftitem = wallettransaction.nft;
                        if (nftitem != null && z15 && (e3Var = e3VarArr[0]) != null && (naVar = e3Var.p1) != null) {
                            naVar.setTitle(TextUtils.isEmpty(nftitem.name) ? gd.M0(2131742938, null) : wallettransaction.nft.name);
                        }
                    } else if (z15 && (e3Var2 = e3VarArr[0]) != null && (naVar2 = e3Var2.p1) != null) {
                        naVar2.setTitle(org.telegram.ui.Wallet.u0.q("Grams", org.telegram.ui.Wallet.u0.v(org.telegram.ui.Wallet.u0.t(abs, false), 0.75f), 2131749315));
                    }
                } else {
                    org.telegram.ui.ActionBar.u6.U(q5Var, z12 ? org.telegram.ui.ActionBar.n6.z6 : org.telegram.ui.ActionBar.n6.Fi, i6Var);
                    SpannableStringBuilder v = org.telegram.ui.Wallet.u0.v(org.telegram.ui.Wallet.u0.t(abs, false), 0.75f);
                    spannableStringArr = spannableStringArr2;
                    v.insert(0, (CharSequence) (z11 ? "+" : "–"));
                    if (z12) {
                        j3 = abs2;
                    } else {
                        j3 = abs2;
                        v.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.n6.w0(z11 ? org.telegram.ui.ActionBar.n6.lk : org.telegram.ui.ActionBar.n6.G6, i6Var)), 0, v.length(), 33);
                    }
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append((CharSequence) org.telegram.ui.Wallet.u0.q("Grams", v, 2131749315));
                    int indexOf = TextUtils.indexOf(spannableStringBuilder, v);
                    int length = v.length() + indexOf;
                    if (indexOf > 0) {
                        z10 = z11;
                        i10 = 33;
                        spannableStringBuilder.setSpan(new RelativeSizeSpan(0.75f), 0, indexOf, 33);
                    } else {
                        z10 = z11;
                        i10 = 33;
                    }
                    if (indexOf >= 0 && length < spannableStringBuilder.length()) {
                        spannableStringBuilder.setSpan(new RelativeSizeSpan(0.75f), length, spannableStringBuilder.length(), i10);
                    }
                    q5Var.setText(spannableStringBuilder);
                    CharSequence r10 = org.telegram.ui.Wallet.u0.D(i14).r(abs, false);
                    if (z12) {
                        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(wallettransaction.failed ? gd.M0(2131742884, null) : l9.a(textView, gd.M0(2131742756, null)));
                        c11 = 0;
                        spannableStringBuilder2.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.n6.w0(wallettransaction.failed ? org.telegram.ui.ActionBar.n6.p7 : org.telegram.ui.ActionBar.n6.n6, i6Var)), 0, spannableStringBuilder2.length(), 33);
                        textView.setText(gd.V(null, null, 2131742729, r10, spannableStringBuilder2));
                    } else {
                        c11 = 0;
                        textView.setText(r10);
                    }
                    if (z15 && (e3Var3 = e3VarArr[c11]) != null && (naVar3 = e3Var3.p1) != null) {
                        naVar3.setTitle(org.telegram.ui.Wallet.u0.q("Grams", v, 2131749315));
                    }
                }
                cy0Var.removeAllViews();
                final TL_wallet.WalletTransactionPeer walletTransactionPeer = wallettransaction.peer;
                if (walletTransactionPeer instanceof TL_wallet.walletTransactionPeerUser) {
                    TL_wallet.walletTransactionPeerUser wallettransactionpeeruser = (TL_wallet.walletTransactionPeerUser) walletTransactionPeer;
                    TLRPC.User c22 = mp.u1(i14).c2(Long.valueOf(wallettransactionpeeruser.user_id));
                    if (c22 != null && !o10.B(c22.id)) {
                        if (z10) {
                            str = null;
                            M02 = gd.M0(2131742757, null);
                        } else {
                            str = null;
                            M02 = gd.M0(2131742782, null);
                        }
                        cy0Var.m(M02, i14, wallettransactionpeeruser.user_id, new org.telegram.ui.Wallet.p(s10Var, e3VarArr, wallettransactionpeeruser, 12), gd.M0(2131742764, str), s10Var != null ? null : new org.telegram.ui.Wallet.c5(i13, e3VarArr, c22));
                    }
                    cy0 cy0Var2 = cy0Var;
                    if (!TextUtils.isEmpty(wallettransactionpeeruser.domain) && !TextUtils.isEmpty(wallettransactionpeeruser.address)) {
                        cy0Var2.i(gd.M0(2131742891, null), wallettransactionpeeruser.domain, new org.telegram.ui.Wallet.p(e3VarArr, c22, wallettransactionpeeruser, 13));
                    }
                    i7 = i14;
                    r92 = cy0Var2;
                } else {
                    cy0 cy0Var3 = cy0Var;
                    if (walletTransactionPeer instanceof TL_wallet.walletTransactionPeerChannel) {
                        if (mp.u1(i14).O0(Long.valueOf(walletTransactionPeer.channel_id)) != null) {
                            cy0Var3.n(z10 ? gd.M0(2131742757, null) : gd.M0(2131742782, null), i14, -walletTransactionPeer.channel_id, new org.telegram.ui.Wallet.p(s10Var, e3VarArr, walletTransactionPeer, 14));
                        }
                        i7 = i14;
                        r92 = cy0Var3;
                        if (!TextUtils.isEmpty(walletTransactionPeer.domain)) {
                            r92 = cy0Var3;
                            if (!TextUtils.isEmpty(walletTransactionPeer.address)) {
                                final int i15 = 1;
                                cy0Var3.i(gd.M0(2131742891, null), walletTransactionPeer.domain, new Runnable() { // from class: org.telegram.ui.Wallet.f5
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i15) {
                                            case 0:
                                                e3[] e3VarArr2 = e3VarArr;
                                                e3 e3Var4 = e3VarArr2[0];
                                                final int i16 = 1;
                                                final TL_wallet.WalletTransactionPeer walletTransactionPeer2 = walletTransactionPeer;
                                                e3Var4.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: org.telegram.ui.Wallet.j5
                                                    @Override // android.content.DialogInterface.OnDismissListener
                                                    public final void onDismiss(DialogInterface dialogInterface) {
                                                        switch (i16) {
                                                            case 0:
                                                                org.telegram.ui.ActionBar.h2 T = LaunchActivity.T();
                                                                if (T != null) {
                                                                    TL_wallet.WalletTransactionPeer walletTransactionPeer3 = walletTransactionPeer2;
                                                                    da daVar = new da(walletTransactionPeer3.address);
                                                                    daVar.A0(walletTransactionPeer3.domain);
                                                                    T.presentFragment(daVar);
                                                                    break;
                                                                }
                                                                break;
                                                            default:
                                                                org.telegram.ui.ActionBar.h2 T2 = LaunchActivity.T();
                                                                if (T2 != null) {
                                                                    T2.presentFragment(new da(walletTransactionPeer2.address));
                                                                    break;
                                                                }
                                                                break;
                                                        }
                                                    }
                                                });
                                                e3VarArr2[0].dismiss();
                                                break;
                                            default:
                                                e3[] e3VarArr3 = e3VarArr;
                                                e3 e3Var5 = e3VarArr3[0];
                                                final int i17 = 0;
                                                final TL_wallet.WalletTransactionPeer walletTransactionPeer3 = walletTransactionPeer;
                                                e3Var5.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: org.telegram.ui.Wallet.j5
                                                    @Override // android.content.DialogInterface.OnDismissListener
                                                    public final void onDismiss(DialogInterface dialogInterface) {
                                                        switch (i17) {
                                                            case 0:
                                                                org.telegram.ui.ActionBar.h2 T = LaunchActivity.T();
                                                                if (T != null) {
                                                                    TL_wallet.WalletTransactionPeer walletTransactionPeer32 = walletTransactionPeer3;
                                                                    da daVar = new da(walletTransactionPeer32.address);
                                                                    daVar.A0(walletTransactionPeer32.domain);
                                                                    T.presentFragment(daVar);
                                                                    break;
                                                                }
                                                                break;
                                                            default:
                                                                org.telegram.ui.ActionBar.h2 T2 = LaunchActivity.T();
                                                                if (T2 != null) {
                                                                    T2.presentFragment(new da(walletTransactionPeer3.address));
                                                                    break;
                                                                }
                                                                break;
                                                        }
                                                    }
                                                });
                                                e3VarArr3[0].dismiss();
                                                break;
                                        }
                                    }
                                });
                                r92 = cy0Var3;
                            }
                        }
                    } else {
                        i7 = i14;
                        r92 = cy0Var3;
                        if (walletTransactionPeer instanceof TL_wallet.walletTransactionPeerAddress) {
                            final TL_wallet.walletTransactionPeerAddress wallettransactionpeeraddress = (TL_wallet.walletTransactionPeerAddress) walletTransactionPeer;
                            r92 = cy0Var3;
                            if (!TextUtils.isEmpty(wallettransactionpeeraddress.domain)) {
                                if (TextUtils.isEmpty(wallettransactionpeeraddress.address)) {
                                    cy0Var3.i(z10 ? gd.M0(2131742757, null) : gd.M0(2131742782, null), wallettransactionpeeraddress.domain, new org.telegram.messenger.j2(0));
                                    r92 = cy0Var3;
                                } else {
                                    if (z10) {
                                        r32 = null;
                                        M0 = gd.M0(2131742757, null);
                                    } else {
                                        r32 = null;
                                        M0 = gd.M0(2131742782, null);
                                    }
                                    String str2 = M0;
                                    String str3 = wallettransactionpeeraddress.domain;
                                    final int i16 = 0;
                                    Runnable runnable = new Runnable() { // from class: org.telegram.ui.Wallet.g5
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (i16) {
                                                case 0:
                                                    e3[] e3VarArr2 = e3VarArr;
                                                    e3 e3Var4 = e3VarArr2[0];
                                                    final int i17 = 0;
                                                    final TL_wallet.walletTransactionPeerAddress wallettransactionpeeraddress2 = wallettransactionpeeraddress;
                                                    e3Var4.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: org.telegram.ui.Wallet.i5
                                                        @Override // android.content.DialogInterface.OnDismissListener
                                                        public final void onDismiss(DialogInterface dialogInterface) {
                                                            switch (i17) {
                                                                case 0:
                                                                    org.telegram.ui.ActionBar.h2 T = LaunchActivity.T();
                                                                    if (T != null) {
                                                                        TL_wallet.walletTransactionPeerAddress wallettransactionpeeraddress3 = wallettransactionpeeraddress2;
                                                                        da daVar = new da(wallettransactionpeeraddress3.address);
                                                                        daVar.A0(wallettransactionpeeraddress3.domain);
                                                                        T.presentFragment(daVar);
                                                                        break;
                                                                    }
                                                                    break;
                                                                default:
                                                                    org.telegram.ui.ActionBar.h2 T2 = LaunchActivity.T();
                                                                    if (T2 != null) {
                                                                        TL_wallet.walletTransactionPeerAddress wallettransactionpeeraddress4 = wallettransactionpeeraddress2;
                                                                        da daVar2 = new da(wallettransactionpeeraddress4.address);
                                                                        daVar2.A0(wallettransactionpeeraddress4.domain);
                                                                        T2.presentFragment(daVar2);
                                                                        break;
                                                                    }
                                                                    break;
                                                            }
                                                        }
                                                    });
                                                    e3VarArr2[0].dismiss();
                                                    break;
                                                default:
                                                    e3[] e3VarArr3 = e3VarArr;
                                                    e3 e3Var5 = e3VarArr3[0];
                                                    final int i18 = 1;
                                                    final TL_wallet.walletTransactionPeerAddress wallettransactionpeeraddress3 = wallettransactionpeeraddress;
                                                    e3Var5.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: org.telegram.ui.Wallet.i5
                                                        @Override // android.content.DialogInterface.OnDismissListener
                                                        public final void onDismiss(DialogInterface dialogInterface) {
                                                            switch (i18) {
                                                                case 0:
                                                                    org.telegram.ui.ActionBar.h2 T = LaunchActivity.T();
                                                                    if (T != null) {
                                                                        TL_wallet.walletTransactionPeerAddress wallettransactionpeeraddress32 = wallettransactionpeeraddress3;
                                                                        da daVar = new da(wallettransactionpeeraddress32.address);
                                                                        daVar.A0(wallettransactionpeeraddress32.domain);
                                                                        T.presentFragment(daVar);
                                                                        break;
                                                                    }
                                                                    break;
                                                                default:
                                                                    org.telegram.ui.ActionBar.h2 T2 = LaunchActivity.T();
                                                                    if (T2 != null) {
                                                                        TL_wallet.walletTransactionPeerAddress wallettransactionpeeraddress4 = wallettransactionpeeraddress3;
                                                                        da daVar2 = new da(wallettransactionpeeraddress4.address);
                                                                        daVar2.A0(wallettransactionpeeraddress4.domain);
                                                                        T2.presentFragment(daVar2);
                                                                        break;
                                                                    }
                                                                    break;
                                                            }
                                                        }
                                                    });
                                                    e3VarArr3[0].dismiss();
                                                    break;
                                            }
                                        }
                                    };
                                    String M03 = gd.M0(2131742764, r32);
                                    if (s10Var != null) {
                                        g5Var = r32;
                                    } else {
                                        final int i17 = 1;
                                        g5Var = new Runnable() { // from class: org.telegram.ui.Wallet.g5
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                switch (i17) {
                                                    case 0:
                                                        e3[] e3VarArr2 = e3VarArr;
                                                        e3 e3Var4 = e3VarArr2[0];
                                                        final int i172 = 0;
                                                        final TL_wallet.walletTransactionPeerAddress wallettransactionpeeraddress2 = wallettransactionpeeraddress;
                                                        e3Var4.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: org.telegram.ui.Wallet.i5
                                                            @Override // android.content.DialogInterface.OnDismissListener
                                                            public final void onDismiss(DialogInterface dialogInterface) {
                                                                switch (i172) {
                                                                    case 0:
                                                                        org.telegram.ui.ActionBar.h2 T = LaunchActivity.T();
                                                                        if (T != null) {
                                                                            TL_wallet.walletTransactionPeerAddress wallettransactionpeeraddress32 = wallettransactionpeeraddress2;
                                                                            da daVar = new da(wallettransactionpeeraddress32.address);
                                                                            daVar.A0(wallettransactionpeeraddress32.domain);
                                                                            T.presentFragment(daVar);
                                                                            break;
                                                                        }
                                                                        break;
                                                                    default:
                                                                        org.telegram.ui.ActionBar.h2 T2 = LaunchActivity.T();
                                                                        if (T2 != null) {
                                                                            TL_wallet.walletTransactionPeerAddress wallettransactionpeeraddress4 = wallettransactionpeeraddress2;
                                                                            da daVar2 = new da(wallettransactionpeeraddress4.address);
                                                                            daVar2.A0(wallettransactionpeeraddress4.domain);
                                                                            T2.presentFragment(daVar2);
                                                                            break;
                                                                        }
                                                                        break;
                                                                }
                                                            }
                                                        });
                                                        e3VarArr2[0].dismiss();
                                                        break;
                                                    default:
                                                        e3[] e3VarArr3 = e3VarArr;
                                                        e3 e3Var5 = e3VarArr3[0];
                                                        final int i18 = 1;
                                                        final TL_wallet.walletTransactionPeerAddress wallettransactionpeeraddress3 = wallettransactionpeeraddress;
                                                        e3Var5.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: org.telegram.ui.Wallet.i5
                                                            @Override // android.content.DialogInterface.OnDismissListener
                                                            public final void onDismiss(DialogInterface dialogInterface) {
                                                                switch (i18) {
                                                                    case 0:
                                                                        org.telegram.ui.ActionBar.h2 T = LaunchActivity.T();
                                                                        if (T != null) {
                                                                            TL_wallet.walletTransactionPeerAddress wallettransactionpeeraddress32 = wallettransactionpeeraddress3;
                                                                            da daVar = new da(wallettransactionpeeraddress32.address);
                                                                            daVar.A0(wallettransactionpeeraddress32.domain);
                                                                            T.presentFragment(daVar);
                                                                            break;
                                                                        }
                                                                        break;
                                                                    default:
                                                                        org.telegram.ui.ActionBar.h2 T2 = LaunchActivity.T();
                                                                        if (T2 != null) {
                                                                            TL_wallet.walletTransactionPeerAddress wallettransactionpeeraddress4 = wallettransactionpeeraddress3;
                                                                            da daVar2 = new da(wallettransactionpeeraddress4.address);
                                                                            daVar2.A0(wallettransactionpeeraddress4.domain);
                                                                            T2.presentFragment(daVar2);
                                                                            break;
                                                                        }
                                                                        break;
                                                                }
                                                            }
                                                        });
                                                        e3VarArr3[0].dismiss();
                                                        break;
                                                }
                                            }
                                        };
                                    }
                                    cy0Var3.h(str2, str3, runnable, M03, g5Var);
                                    r92 = cy0Var3;
                                }
                            }
                        }
                    }
                }
                if (!(wallettransaction.peer instanceof TL_wallet.walletTransactionPeerOnchainGift) || (c10 = org.telegram.ui.Wallet.f3.c(wallettransaction)) == null) {
                    r16 = r92;
                    j10 = 0;
                } else {
                    String str4 = c10.l;
                    int i18 = c10.j;
                    long j11 = c10.f;
                    j10 = 0;
                    r92.e(gd.M0(2131742812, null), c10.e(), null, null);
                    boolean z16 = c10.a == 9;
                    if (j11 > 0) {
                        r15 = 0;
                        r92.e(gd.M0(z16 ? 2131749537 : 2131749535, null), bi.v4.i(j11), null, null);
                    } else {
                        r15 = 0;
                    }
                    if (z16 && c10.i > 0) {
                        r92.e(gd.M0(2131749536, r15), bi.v4.j(c10.i), r15, r15);
                    }
                    if (i18 > 0) {
                        r92.e(gd.M0(2131749539, r15), gd.Q(i18), r15, r15);
                    }
                    if (c10.k) {
                        r92.e(gd.M0(2131749541, r15), bi.v4.i(c10.h), r15, r15);
                    }
                    if (str4 != null) {
                        String M04 = gd.M0(c10.m, r15);
                        final int i19 = 0;
                        cy0 cy0Var4 = r92;
                        cy0Var4.j(M04, org.telegram.ui.Wallet.n6.y0(str4, new Runnable() { // from class: org.telegram.ui.Wallet.h5
                            @Override // java.lang.Runnable
                            public final void run() {
                                int i20 = i19;
                                org.telegram.ui.ActionBar.i6 i6Var2 = i6Var;
                                e3[] e3VarArr2 = e3VarArr;
                                switch (i20) {
                                    case 0:
                                        new lc(e3VarArr2[0].F, i6Var2).Q(R.raw.copy, 36, gd.M0(2131742963, null)).k(false);
                                        break;
                                    default:
                                        new lc(e3VarArr2[0].F, i6Var2).Q(R.raw.copy, 36, gd.M0(2131742963, null)).k(false);
                                        break;
                                }
                            }
                        }), 14, null, null, null);
                        r16 = cy0Var4;
                    } else {
                        r16 = r92;
                    }
                }
                final TL_wallet.WalletTransactionPeer walletTransactionPeer2 = wallettransaction.peer;
                boolean z17 = walletTransactionPeer2 instanceof TL_wallet.walletTransactionPeerUser;
                if (z17 || (walletTransactionPeer2 instanceof TL_wallet.walletTransactionPeerChannel) || (walletTransactionPeer2 instanceof TL_wallet.walletTransactionPeerAddress)) {
                    final int i20 = 1;
                    final int i21 = 0;
                    r16.j(gd.M0(2131742965, null), org.telegram.ui.Wallet.n6.y0(walletTransactionPeer2.address, new Runnable() { // from class: org.telegram.ui.Wallet.h5
                        @Override // java.lang.Runnable
                        public final void run() {
                            int i202 = i20;
                            org.telegram.ui.ActionBar.i6 i6Var2 = i6Var;
                            e3[] e3VarArr2 = e3VarArr;
                            switch (i202) {
                                case 0:
                                    new lc(e3VarArr2[0].F, i6Var2).Q(R.raw.copy, 36, gd.M0(2131742963, null)).k(false);
                                    break;
                                default:
                                    new lc(e3VarArr2[0].F, i6Var2).Q(R.raw.copy, 36, gd.M0(2131742963, null)).k(false);
                                    break;
                            }
                        }
                    }), 14, null, s10Var == null && !(z17 && mp.u1(i7).c2(Long.valueOf(walletTransactionPeer2.user_id)) != null && !o10.B(walletTransactionPeer2.user_id)) && TextUtils.isEmpty(walletTransactionPeer2.domain) && !TextUtils.isEmpty(walletTransactionPeer2.address) ? gd.M0(2131742764, null) : null, new Runnable() { // from class: org.telegram.ui.Wallet.f5
                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i21) {
                                case 0:
                                    e3[] e3VarArr2 = e3VarArr;
                                    e3 e3Var4 = e3VarArr2[0];
                                    final int i162 = 1;
                                    final TL_wallet.WalletTransactionPeer walletTransactionPeer22 = walletTransactionPeer2;
                                    e3Var4.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: org.telegram.ui.Wallet.j5
                                        @Override // android.content.DialogInterface.OnDismissListener
                                        public final void onDismiss(DialogInterface dialogInterface) {
                                            switch (i162) {
                                                case 0:
                                                    org.telegram.ui.ActionBar.h2 T = LaunchActivity.T();
                                                    if (T != null) {
                                                        TL_wallet.WalletTransactionPeer walletTransactionPeer32 = walletTransactionPeer22;
                                                        da daVar = new da(walletTransactionPeer32.address);
                                                        daVar.A0(walletTransactionPeer32.domain);
                                                        T.presentFragment(daVar);
                                                        break;
                                                    }
                                                    break;
                                                default:
                                                    org.telegram.ui.ActionBar.h2 T2 = LaunchActivity.T();
                                                    if (T2 != null) {
                                                        T2.presentFragment(new da(walletTransactionPeer22.address));
                                                        break;
                                                    }
                                                    break;
                                            }
                                        }
                                    });
                                    e3VarArr2[0].dismiss();
                                    break;
                                default:
                                    e3[] e3VarArr3 = e3VarArr;
                                    e3 e3Var5 = e3VarArr3[0];
                                    final int i172 = 0;
                                    final TL_wallet.WalletTransactionPeer walletTransactionPeer3 = walletTransactionPeer2;
                                    e3Var5.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: org.telegram.ui.Wallet.j5
                                        @Override // android.content.DialogInterface.OnDismissListener
                                        public final void onDismiss(DialogInterface dialogInterface) {
                                            switch (i172) {
                                                case 0:
                                                    org.telegram.ui.ActionBar.h2 T = LaunchActivity.T();
                                                    if (T != null) {
                                                        TL_wallet.WalletTransactionPeer walletTransactionPeer32 = walletTransactionPeer3;
                                                        da daVar = new da(walletTransactionPeer32.address);
                                                        daVar.A0(walletTransactionPeer32.domain);
                                                        T.presentFragment(daVar);
                                                        break;
                                                    }
                                                    break;
                                                default:
                                                    org.telegram.ui.ActionBar.h2 T2 = LaunchActivity.T();
                                                    if (T2 != null) {
                                                        T2.presentFragment(new da(walletTransactionPeer3.address));
                                                        break;
                                                    }
                                                    break;
                                            }
                                        }
                                    });
                                    e3VarArr3[0].dismiss();
                                    break;
                            }
                        }
                    });
                }
                ?? r93 = r16;
                if (j3 <= j10 || !wallettransaction.gasless) {
                    long j12 = j3;
                    if (j3 > j10 || wallettransaction.nft != null || wallettransaction.preview) {
                        TextView textView2 = new TextView(context);
                        textViewArr[0] = textView2;
                        textView2.setGravity(16);
                        textViewArr[0].setIncludeFontPadding(false);
                        textViewArr[0].setTextSize(1, 14.0f);
                        org.telegram.ui.ActionBar.u6.U(textViewArr[0], z12 ? org.telegram.ui.ActionBar.n6.z6 : org.telegram.ui.ActionBar.n6.G6, i6Var);
                        if (!wallettransaction.preview || j3 > j10) {
                            textViewArr[0].setText(org.telegram.ui.Wallet.n6.z0(i7, j12, i6Var));
                        } else {
                            if (spannableStringArr[0] == null) {
                                SpannableString spannableString = new SpannableString(gd.M0(2131748587, null));
                                spannableStringArr[0] = spannableString;
                                spannableString.setSpan(new p80(org.telegram.messenger.g0.L(150.0f), textViewArr[0]), 0, spannableStringArr[0].length(), 33);
                            }
                            textViewArr[0].setText(spannableStringArr[0]);
                        }
                        r52 = 0;
                        r93.c(textViewArr[0], gd.M0(2131742882, null));
                        if (wallettransaction.date == 0) {
                            r93.e(gd.M0(2131742906, r52), gd.Q(wallettransaction.date), r52, r52);
                            break;
                        }
                    }
                } else {
                    SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder("x ");
                    lq lqVar = new lq(R.drawable.wallet_gram_small, 2);
                    lqVar.d = false;
                    lqVar.c(org.telegram.messenger.g0.L(16.0f));
                    float L = org.telegram.messenger.g0.L(1.0f);
                    lqVar.r = 0.0f;
                    lqVar.s = L;
                    spannableStringBuilder3.setSpan(lqVar, 0, 1, 33);
                    spannableStringBuilder3.append((CharSequence) gd.M0(2131742879, null));
                    r93.d(gd.M0(2131742882, null), spannableStringBuilder3, "?", new bi.q3(i7, 8, j3, context, i6Var), null);
                }
                r52 = 0;
                if (wallettransaction.date == 0) {
                }
                break;
        }
    }

    public /* synthetic */ r(long[] jArr, hi.d dVar, lq[] lqVarArr, r0 r0Var, m0 m0Var, int i7, bi.a3 a3Var, bi.a3 a3Var2, bi.a3 a3Var3, s sVar, boolean[] zArr) {
        this.c = jArr;
        this.d = dVar;
        this.e = lqVarArr;
        this.f = r0Var;
        this.g = m0Var;
        this.b = i7;
        this.h = a3Var;
        this.i = a3Var2;
        this.j = a3Var3;
        this.k = sVar;
        this.l = zArr;
    }
}
