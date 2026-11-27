// default package

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
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Wallet.c;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class cg5 implements pcc {
    public final /* synthetic */ byte a = 1;
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

    public /* synthetic */ cg5(LinearLayout linearLayout, ypc ypcVar, vnb vnbVar, int i, TextView textView, jl7[] jl7VarArr, hjb hjbVar, kcc kccVar, Context context, TextView[] textViewArr, SpannableString[] spannableStringArr) {
        this.c = linearLayout;
        this.d = ypcVar;
        this.e = vnbVar;
        this.b = i;
        this.f = textView;
        this.g = jl7VarArr;
        this.h = hjbVar;
        this.i = kccVar;
        this.j = context;
        this.k = textViewArr;
        this.l = spannableStringArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:139:0x04d1, code lost:
    
        if (r1.preview == false) goto L205;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:124:0x04f1  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x04f4  */
    /* JADX WARN: Type inference failed for: r11v7, types: [opc] */
    /* JADX WARN: Type inference failed for: r15v10 */
    /* JADX WARN: Type inference failed for: r15v8 */
    /* JADX WARN: Type inference failed for: r15v9, types: [gjb[], java.lang.String, y41[]] */
    /* JADX WARN: Type inference failed for: r16v10 */
    /* JADX WARN: Type inference failed for: r16v4 */
    /* JADX WARN: Type inference failed for: r16v5, types: [hjb] */
    /* JADX WARN: Type inference failed for: r16v8 */
    /* JADX WARN: Type inference failed for: r3v18, types: [npc] */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v14, types: [gjb[], java.lang.String, y41[]] */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v18 */
    /* JADX WARN: Type inference failed for: r9v19 */
    /* JADX WARN: Type inference failed for: r9v20 */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7, types: [hjb] */
    /* JADX WARN: Type inference failed for: r9v8, types: [hjb] */
    @Override // pcc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Object obj) {
        Context context;
        SpannableString[] spannableStringArr;
        long j;
        boolean z;
        jl7 jl7Var;
        jy0 jy0Var;
        int i;
        opc opcVar;
        ?? r9;
        ?? r16;
        long j2;
        Context context2;
        long j3;
        ?? r7;
        jt7 c;
        ?? r15;
        jl7 jl7Var2;
        jy0 jy0Var2;
        int i2;
        char c2;
        jl7 jl7Var3;
        jy0 jy0Var3;
        byte b = this.a;
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
        switch (b) {
            case 0:
                long[] jArr = (long[]) obj9;
                m96 m96Var = (m96) obj7;
                zc zcVar = (zc) viewGroup;
                zc zcVar2 = (zc) obj5;
                zc zcVar3 = (zc) obj4;
                dg5 dg5Var = (dg5) obj3;
                boolean[] zArr = (boolean[]) obj2;
                Integer num = (Integer) obj;
                long intValue = num.intValue();
                jArr[0] = intValue;
                ((c51) view).i(nza.Z0(false, ob6.a0(null, null, 2131744813, ob6.E(intValue, ',')), (wm2[]) obj8), true, true);
                m96Var.g = jArr[0];
                ((h96) obj6).set(m96Var);
                int intValue2 = num.intValue();
                int i3 = this.b;
                int b2 = eg5.b(i3, intValue2, 0);
                int b3 = eg5.b(i3, num.intValue(), 1);
                int b4 = eg5.b(i3, num.intValue(), 2);
                ((in) zcVar.b).c(b2 >= 60 ? ob6.a0(null, null, 2131745034, Integer.valueOf(b2 / 60)) : ob6.a0(null, null, 2131745032, Integer.valueOf(b2)), true, true);
                ((in) zcVar2.b).c(ob6.E(b3, ','), true, true);
                ((in) zcVar3.b).c(ob6.E(b4, ','), true, true);
                dg5Var.f(eg5.b(i3, num.intValue(), 3), eg5.b(i3, num.intValue(), 4), !zArr[0]);
                zArr[0] = false;
                break;
            default:
                LinearLayout linearLayout = (LinearLayout) obj9;
                ypc ypcVar = (ypc) view;
                final vnb vnbVar = (vnb) obj8;
                TextView textView = (TextView) obj7;
                final jl7[] jl7VarArr = (jl7[]) obj6;
                hjb hjbVar = (hjb) viewGroup;
                kcc kccVar = (kcc) obj5;
                Context context3 = (Context) obj4;
                TextView[] textViewArr = (TextView[]) obj3;
                SpannableString[] spannableStringArr2 = (SpannableString[]) obj2;
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj;
                long abs = Math.abs(wallettransaction.amount);
                final byte b5 = 1;
                boolean z2 = wallettransaction.incoming;
                long abs2 = Math.abs(wallettransaction.fee);
                boolean z3 = wallettransaction.pending || wallettransaction.failed;
                boolean z4 = ((linearLayout.getParent() instanceof View) && (linearLayout.getParent().getParent() instanceof vic) && ((vic) linearLayout.getParent().getParent()).getViewPages()[0] != linearLayout.getParent()) ? false : true;
                boolean z5 = wallettransaction.key_change;
                int i4 = this.b;
                boolean z6 = z4;
                if (z5) {
                    context = context3;
                    spannableStringArr = spannableStringArr2;
                    j = abs2;
                    z = z2;
                    if (z6 && (jl7Var = jl7VarArr[0]) != null && (jy0Var = jl7Var.o1) != null) {
                        jy0Var.setTitle(c.p("Grams", c.u(c.s(abs, false), 0.75f), 2131749261));
                    }
                } else {
                    TL_wallet.nftItem nftitem = wallettransaction.nft;
                    if (nftitem == null) {
                        yob.X(ypcVar, z3 ? aob.z6 : aob.Fi, vnbVar);
                        SpannableStringBuilder u = c.u(c.s(abs, false), 0.75f);
                        context = context3;
                        u.insert(0, (CharSequence) (z2 ? "+" : "–"));
                        if (z3) {
                            spannableStringArr = spannableStringArr2;
                            j = abs2;
                        } else {
                            spannableStringArr = spannableStringArr2;
                            j = abs2;
                            u.setSpan(new ForegroundColorSpan(aob.v0(z2 ? aob.lk : aob.G6, vnbVar)), 0, u.length(), 33);
                        }
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                        spannableStringBuilder.append((CharSequence) c.p("Grams", u, 2131749261));
                        int indexOf = TextUtils.indexOf(spannableStringBuilder, u);
                        int length = u.length() + indexOf;
                        if (indexOf > 0) {
                            z = z2;
                            i2 = 33;
                            spannableStringBuilder.setSpan(new RelativeSizeSpan(0.75f), 0, indexOf, 33);
                        } else {
                            z = z2;
                            i2 = 33;
                        }
                        if (indexOf >= 0 && length < spannableStringBuilder.length()) {
                            spannableStringBuilder.setSpan(new RelativeSizeSpan(0.75f), length, spannableStringBuilder.length(), i2);
                        }
                        ypcVar.setText(spannableStringBuilder);
                        CharSequence q = c.C(i4).q(abs, false);
                        if (z3) {
                            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(wallettransaction.failed ? ob6.M0(2131742773, null) : qac.a(textView, ob6.M0(2131742645, null)));
                            c2 = 0;
                            spannableStringBuilder2.setSpan(new ForegroundColorSpan(aob.v0(wallettransaction.failed ? aob.p7 : aob.n6, vnbVar)), 0, spannableStringBuilder2.length(), 33);
                            textView.setText(ob6.V(null, null, 2131742618, q, spannableStringBuilder2));
                        } else {
                            c2 = 0;
                            textView.setText(q);
                        }
                        if (z6 && (jl7Var3 = jl7VarArr[c2]) != null && (jy0Var3 = jl7Var3.o1) != null) {
                            jy0Var3.setTitle(c.p("Grams", u, 2131749261));
                        }
                    } else {
                        context = context3;
                        spannableStringArr = spannableStringArr2;
                        j = abs2;
                        z = z2;
                        if (z6 && (jl7Var2 = jl7VarArr[0]) != null && (jy0Var2 = jl7Var2.o1) != null) {
                            jy0Var2.setTitle(TextUtils.isEmpty(nftitem.name) ? ob6.M0(2131742827, null) : wallettransaction.nft.name);
                        }
                    }
                }
                hjbVar.removeAllViews();
                final TL_wallet.WalletTransactionPeer walletTransactionPeer = wallettransaction.peer;
                if (walletTransactionPeer instanceof TL_wallet.walletTransactionPeerUser) {
                    TL_wallet.walletTransactionPeerUser wallettransactionpeeruser = (TL_wallet.walletTransactionPeerUser) walletTransactionPeer;
                    TLRPC.User X1 = uc7.s1(i4).X1(Long.valueOf(wallettransactionpeeruser.user_id));
                    if (X1 != null && !lbc.C(X1.id)) {
                        hjbVar.m(z ? ob6.M0(2131742646, null) : ob6.M0(2131742671, null), i4, wallettransactionpeeruser.user_id, new b6c(kccVar, jl7VarArr, wallettransactionpeeruser, (byte) 18), ob6.M0(2131742653, null), kccVar != null ? null : new vlc(jl7VarArr, X1, (byte) 12));
                    }
                    hjb hjbVar2 = hjbVar;
                    if (!TextUtils.isEmpty(wallettransactionpeeruser.domain) && !TextUtils.isEmpty(wallettransactionpeeruser.address)) {
                        hjbVar2.i(ob6.M0(2131742780, null), wallettransactionpeeruser.domain, new b6c(jl7VarArr, X1, wallettransactionpeeruser, (byte) 19));
                    }
                    i = i4;
                    r9 = hjbVar2;
                } else {
                    hjb hjbVar3 = hjbVar;
                    if (walletTransactionPeer instanceof TL_wallet.walletTransactionPeerChannel) {
                        if (uc7.s1(i4).M0(Long.valueOf(walletTransactionPeer.channel_id)) != null) {
                            hjbVar3.n(z ? ob6.M0(2131742646, null) : ob6.M0(2131742671, null), i4, -walletTransactionPeer.channel_id, new b6c(kccVar, jl7VarArr, walletTransactionPeer, (byte) 20));
                        }
                        i = i4;
                        r9 = hjbVar3;
                        if (!TextUtils.isEmpty(walletTransactionPeer.domain)) {
                            r9 = hjbVar3;
                            if (!TextUtils.isEmpty(walletTransactionPeer.address)) {
                                hjbVar3.i(ob6.M0(2131742780, null), walletTransactionPeer.domain, new Runnable() { // from class: npc
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        byte b6 = b5;
                                        final TL_wallet.WalletTransactionPeer walletTransactionPeer2 = walletTransactionPeer;
                                        jl7[] jl7VarArr2 = jl7VarArr;
                                        final byte b7 = 0;
                                        switch (b6) {
                                            case 0:
                                                final byte b8 = 1;
                                                jl7VarArr2[0].setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: rpc
                                                    @Override // android.content.DialogInterface.OnDismissListener
                                                    public final void onDismiss(DialogInterface dialogInterface) {
                                                        byte b9 = b8;
                                                        TL_wallet.WalletTransactionPeer walletTransactionPeer3 = walletTransactionPeer2;
                                                        switch (b9) {
                                                            case 0:
                                                                e S = LaunchActivity.S();
                                                                if (S != null) {
                                                                    euc eucVar = new euc(walletTransactionPeer3.address);
                                                                    eucVar.A0(walletTransactionPeer3.domain);
                                                                    S.presentFragment(eucVar);
                                                                    break;
                                                                }
                                                                break;
                                                            default:
                                                                e S2 = LaunchActivity.S();
                                                                if (S2 != null) {
                                                                    S2.presentFragment(new euc(walletTransactionPeer3.address));
                                                                    break;
                                                                }
                                                                break;
                                                        }
                                                    }
                                                });
                                                jl7VarArr2[0].dismiss();
                                                break;
                                            default:
                                                jl7VarArr2[0].setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: rpc
                                                    @Override // android.content.DialogInterface.OnDismissListener
                                                    public final void onDismiss(DialogInterface dialogInterface) {
                                                        byte b9 = b7;
                                                        TL_wallet.WalletTransactionPeer walletTransactionPeer3 = walletTransactionPeer2;
                                                        switch (b9) {
                                                            case 0:
                                                                e S = LaunchActivity.S();
                                                                if (S != null) {
                                                                    euc eucVar = new euc(walletTransactionPeer3.address);
                                                                    eucVar.A0(walletTransactionPeer3.domain);
                                                                    S.presentFragment(eucVar);
                                                                    break;
                                                                }
                                                                break;
                                                            default:
                                                                e S2 = LaunchActivity.S();
                                                                if (S2 != null) {
                                                                    S2.presentFragment(new euc(walletTransactionPeer3.address));
                                                                    break;
                                                                }
                                                                break;
                                                        }
                                                    }
                                                });
                                                jl7VarArr2[0].dismiss();
                                                break;
                                        }
                                    }
                                });
                                r9 = hjbVar3;
                            }
                        }
                    } else {
                        i = i4;
                        r9 = hjbVar3;
                        if (walletTransactionPeer instanceof TL_wallet.walletTransactionPeerAddress) {
                            final TL_wallet.walletTransactionPeerAddress wallettransactionpeeraddress = (TL_wallet.walletTransactionPeerAddress) walletTransactionPeer;
                            r9 = hjbVar3;
                            if (!TextUtils.isEmpty(wallettransactionpeeraddress.domain)) {
                                if (TextUtils.isEmpty(wallettransactionpeeraddress.address)) {
                                    hjbVar3.i(z ? ob6.M0(2131742646, null) : ob6.M0(2131742671, null), wallettransactionpeeraddress.domain, new kc((byte) 10));
                                    r9 = hjbVar3;
                                } else {
                                    String M0 = z ? ob6.M0(2131742646, null) : ob6.M0(2131742671, null);
                                    String str = wallettransactionpeeraddress.domain;
                                    final byte b6 = 0;
                                    Runnable runnable = new Runnable() { // from class: opc
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            byte b7 = b6;
                                            final TL_wallet.walletTransactionPeerAddress wallettransactionpeeraddress2 = wallettransactionpeeraddress;
                                            jl7[] jl7VarArr2 = jl7VarArr;
                                            final byte b8 = 0;
                                            switch (b7) {
                                                case 0:
                                                    jl7VarArr2[0].setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: qpc
                                                        @Override // android.content.DialogInterface.OnDismissListener
                                                        public final void onDismiss(DialogInterface dialogInterface) {
                                                            byte b9 = b8;
                                                            TL_wallet.walletTransactionPeerAddress wallettransactionpeeraddress3 = wallettransactionpeeraddress2;
                                                            switch (b9) {
                                                                case 0:
                                                                    e S = LaunchActivity.S();
                                                                    if (S != null) {
                                                                        euc eucVar = new euc(wallettransactionpeeraddress3.address);
                                                                        eucVar.A0(wallettransactionpeeraddress3.domain);
                                                                        S.presentFragment(eucVar);
                                                                        break;
                                                                    }
                                                                    break;
                                                                default:
                                                                    e S2 = LaunchActivity.S();
                                                                    if (S2 != null) {
                                                                        euc eucVar2 = new euc(wallettransactionpeeraddress3.address);
                                                                        eucVar2.A0(wallettransactionpeeraddress3.domain);
                                                                        S2.presentFragment(eucVar2);
                                                                        break;
                                                                    }
                                                                    break;
                                                            }
                                                        }
                                                    });
                                                    jl7VarArr2[0].dismiss();
                                                    break;
                                                default:
                                                    final byte b9 = 1;
                                                    jl7VarArr2[0].setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: qpc
                                                        @Override // android.content.DialogInterface.OnDismissListener
                                                        public final void onDismiss(DialogInterface dialogInterface) {
                                                            byte b92 = b9;
                                                            TL_wallet.walletTransactionPeerAddress wallettransactionpeeraddress3 = wallettransactionpeeraddress2;
                                                            switch (b92) {
                                                                case 0:
                                                                    e S = LaunchActivity.S();
                                                                    if (S != null) {
                                                                        euc eucVar = new euc(wallettransactionpeeraddress3.address);
                                                                        eucVar.A0(wallettransactionpeeraddress3.domain);
                                                                        S.presentFragment(eucVar);
                                                                        break;
                                                                    }
                                                                    break;
                                                                default:
                                                                    e S2 = LaunchActivity.S();
                                                                    if (S2 != null) {
                                                                        euc eucVar2 = new euc(wallettransactionpeeraddress3.address);
                                                                        eucVar2.A0(wallettransactionpeeraddress3.domain);
                                                                        S2.presentFragment(eucVar2);
                                                                        break;
                                                                    }
                                                                    break;
                                                            }
                                                        }
                                                    });
                                                    jl7VarArr2[0].dismiss();
                                                    break;
                                            }
                                        }
                                    };
                                    String M02 = ob6.M0(2131742653, null);
                                    if (kccVar != null) {
                                        opcVar = null;
                                    } else {
                                        final byte b7 = 1;
                                        opcVar = new Runnable() { // from class: opc
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                byte b72 = b7;
                                                final TL_wallet.walletTransactionPeerAddress wallettransactionpeeraddress2 = wallettransactionpeeraddress;
                                                jl7[] jl7VarArr2 = jl7VarArr;
                                                final byte b8 = 0;
                                                switch (b72) {
                                                    case 0:
                                                        jl7VarArr2[0].setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: qpc
                                                            @Override // android.content.DialogInterface.OnDismissListener
                                                            public final void onDismiss(DialogInterface dialogInterface) {
                                                                byte b92 = b8;
                                                                TL_wallet.walletTransactionPeerAddress wallettransactionpeeraddress3 = wallettransactionpeeraddress2;
                                                                switch (b92) {
                                                                    case 0:
                                                                        e S = LaunchActivity.S();
                                                                        if (S != null) {
                                                                            euc eucVar = new euc(wallettransactionpeeraddress3.address);
                                                                            eucVar.A0(wallettransactionpeeraddress3.domain);
                                                                            S.presentFragment(eucVar);
                                                                            break;
                                                                        }
                                                                        break;
                                                                    default:
                                                                        e S2 = LaunchActivity.S();
                                                                        if (S2 != null) {
                                                                            euc eucVar2 = new euc(wallettransactionpeeraddress3.address);
                                                                            eucVar2.A0(wallettransactionpeeraddress3.domain);
                                                                            S2.presentFragment(eucVar2);
                                                                            break;
                                                                        }
                                                                        break;
                                                                }
                                                            }
                                                        });
                                                        jl7VarArr2[0].dismiss();
                                                        break;
                                                    default:
                                                        final byte b9 = 1;
                                                        jl7VarArr2[0].setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: qpc
                                                            @Override // android.content.DialogInterface.OnDismissListener
                                                            public final void onDismiss(DialogInterface dialogInterface) {
                                                                byte b92 = b9;
                                                                TL_wallet.walletTransactionPeerAddress wallettransactionpeeraddress3 = wallettransactionpeeraddress2;
                                                                switch (b92) {
                                                                    case 0:
                                                                        e S = LaunchActivity.S();
                                                                        if (S != null) {
                                                                            euc eucVar = new euc(wallettransactionpeeraddress3.address);
                                                                            eucVar.A0(wallettransactionpeeraddress3.domain);
                                                                            S.presentFragment(eucVar);
                                                                            break;
                                                                        }
                                                                        break;
                                                                    default:
                                                                        e S2 = LaunchActivity.S();
                                                                        if (S2 != null) {
                                                                            euc eucVar2 = new euc(wallettransactionpeeraddress3.address);
                                                                            eucVar2.A0(wallettransactionpeeraddress3.domain);
                                                                            S2.presentFragment(eucVar2);
                                                                            break;
                                                                        }
                                                                        break;
                                                                }
                                                            }
                                                        });
                                                        jl7VarArr2[0].dismiss();
                                                        break;
                                                }
                                            }
                                        };
                                    }
                                    hjbVar3.h(M0, str, runnable, M02, opcVar);
                                    r9 = hjbVar3;
                                }
                            }
                        }
                    }
                }
                if (!(wallettransaction.peer instanceof TL_wallet.walletTransactionPeerOnchainGift) || (c = jt7.c(wallettransaction)) == null) {
                    r16 = r9;
                    j2 = 0;
                } else {
                    String str2 = c.l;
                    int i5 = c.j;
                    long j4 = c.f;
                    j2 = 0;
                    r9.f(ob6.M0(2131742701, null), c.e(), null, null);
                    boolean z7 = c.a == 9;
                    if (j4 > 0) {
                        r15 = 0;
                        r9.f(ob6.M0(z7 ? 2131749498 : 2131749496, null), it7.j(j4), null, null);
                    } else {
                        r15 = 0;
                    }
                    if (z7 && c.i > 0) {
                        r9.f(ob6.M0(2131749497, r15), it7.k(c.i), r15, r15);
                    }
                    if (i5 > 0) {
                        r9.f(ob6.M0(2131749500, r15), ob6.Q(i5), r15, r15);
                    }
                    if (c.k) {
                        r9.f(ob6.M0(2131749502, r15), it7.j(c.h), r15, r15);
                    }
                    if (str2 != null) {
                        final byte b8 = 0;
                        hjb hjbVar4 = r9;
                        hjbVar4.j(ob6.M0(c.m, r15), uqc.n0(str2, new Runnable() { // from class: ppc
                            @Override // java.lang.Runnable
                            public final void run() {
                                byte b9 = b8;
                                vnb vnbVar2 = vnbVar;
                                jl7[] jl7VarArr2 = jl7VarArr;
                                switch (b9) {
                                    case 0:
                                        new d31(jl7VarArr2[0].F, vnbVar2).Q(R.raw.copy, 36, ob6.M0(2131742852, null)).k(false);
                                        break;
                                    default:
                                        new d31(jl7VarArr2[0].F, vnbVar2).Q(R.raw.copy, 36, ob6.M0(2131742852, null)).k(false);
                                        break;
                                }
                            }
                        }), 14, null, null, null);
                        r16 = hjbVar4;
                    } else {
                        r16 = r9;
                    }
                }
                final TL_wallet.WalletTransactionPeer walletTransactionPeer2 = wallettransaction.peer;
                boolean z8 = walletTransactionPeer2 instanceof TL_wallet.walletTransactionPeerUser;
                if (z8 || (walletTransactionPeer2 instanceof TL_wallet.walletTransactionPeerChannel) || (walletTransactionPeer2 instanceof TL_wallet.walletTransactionPeerAddress)) {
                    final byte b9 = 1;
                    final byte b10 = 0;
                    r16.j(ob6.M0(2131742854, null), uqc.n0(walletTransactionPeer2.address, new Runnable() { // from class: ppc
                        @Override // java.lang.Runnable
                        public final void run() {
                            byte b92 = b9;
                            vnb vnbVar2 = vnbVar;
                            jl7[] jl7VarArr2 = jl7VarArr;
                            switch (b92) {
                                case 0:
                                    new d31(jl7VarArr2[0].F, vnbVar2).Q(R.raw.copy, 36, ob6.M0(2131742852, null)).k(false);
                                    break;
                                default:
                                    new d31(jl7VarArr2[0].F, vnbVar2).Q(R.raw.copy, 36, ob6.M0(2131742852, null)).k(false);
                                    break;
                            }
                        }
                    }), 14, null, kccVar == null && !(z8 && uc7.s1(i).X1(Long.valueOf(walletTransactionPeer2.user_id)) != null && !lbc.C(walletTransactionPeer2.user_id)) && TextUtils.isEmpty(walletTransactionPeer2.domain) && !TextUtils.isEmpty(walletTransactionPeer2.address) ? ob6.M0(2131742653, null) : null, new Runnable() { // from class: npc
                        @Override // java.lang.Runnable
                        public final void run() {
                            byte b62 = b10;
                            final TL_wallet.WalletTransactionPeer walletTransactionPeer22 = walletTransactionPeer2;
                            jl7[] jl7VarArr2 = jl7VarArr;
                            final byte b72 = 0;
                            switch (b62) {
                                case 0:
                                    final byte b82 = 1;
                                    jl7VarArr2[0].setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: rpc
                                        @Override // android.content.DialogInterface.OnDismissListener
                                        public final void onDismiss(DialogInterface dialogInterface) {
                                            byte b92 = b82;
                                            TL_wallet.WalletTransactionPeer walletTransactionPeer3 = walletTransactionPeer22;
                                            switch (b92) {
                                                case 0:
                                                    e S = LaunchActivity.S();
                                                    if (S != null) {
                                                        euc eucVar = new euc(walletTransactionPeer3.address);
                                                        eucVar.A0(walletTransactionPeer3.domain);
                                                        S.presentFragment(eucVar);
                                                        break;
                                                    }
                                                    break;
                                                default:
                                                    e S2 = LaunchActivity.S();
                                                    if (S2 != null) {
                                                        S2.presentFragment(new euc(walletTransactionPeer3.address));
                                                        break;
                                                    }
                                                    break;
                                            }
                                        }
                                    });
                                    jl7VarArr2[0].dismiss();
                                    break;
                                default:
                                    jl7VarArr2[0].setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: rpc
                                        @Override // android.content.DialogInterface.OnDismissListener
                                        public final void onDismiss(DialogInterface dialogInterface) {
                                            byte b92 = b72;
                                            TL_wallet.WalletTransactionPeer walletTransactionPeer3 = walletTransactionPeer22;
                                            switch (b92) {
                                                case 0:
                                                    e S = LaunchActivity.S();
                                                    if (S != null) {
                                                        euc eucVar = new euc(walletTransactionPeer3.address);
                                                        eucVar.A0(walletTransactionPeer3.domain);
                                                        S.presentFragment(eucVar);
                                                        break;
                                                    }
                                                    break;
                                                default:
                                                    e S2 = LaunchActivity.S();
                                                    if (S2 != null) {
                                                        S2.presentFragment(new euc(walletTransactionPeer3.address));
                                                        break;
                                                    }
                                                    break;
                                            }
                                        }
                                    });
                                    jl7VarArr2[0].dismiss();
                                    break;
                            }
                        }
                    });
                }
                ?? r92 = r16;
                if (j <= j2) {
                    context2 = context;
                    j3 = j;
                    if (wallettransaction.nft == null) {
                        break;
                    }
                    TextView textView2 = new TextView(context2);
                    textViewArr[0] = textView2;
                    textView2.setGravity(16);
                    textViewArr[0].setIncludeFontPadding(false);
                    textViewArr[0].setTextSize(1, 14.0f);
                    yob.X(textViewArr[0], !z3 ? aob.z6 : aob.G6, vnbVar);
                    if (wallettransaction.preview) {
                    }
                    textViewArr[0].setText(uqc.o0(i, j3, vnbVar));
                    r7 = 0;
                    r92.c(textViewArr[0], ob6.M0(2131742771, null));
                } else if (wallettransaction.gasless) {
                    SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder("x ");
                    wm2 wm2Var = new wm2(R.drawable.wallet_gram_small, 2);
                    wm2Var.d = false;
                    wm2Var.c(hl.L(16.0f));
                    float L = hl.L(1.0f);
                    wm2Var.r = 0.0f;
                    wm2Var.s = L;
                    spannableStringBuilder3.setSpan(wm2Var, 0, 1, 33);
                    spannableStringBuilder3.append((CharSequence) ob6.M0(2131742768, null));
                    r92.e(ob6.M0(2131742771, null), spannableStringBuilder3, "?", new r77((Object) context, (Object) vnbVar, i, j, (byte) 21), null);
                    r7 = 0;
                } else {
                    context2 = context;
                    j3 = j;
                    TextView textView22 = new TextView(context2);
                    textViewArr[0] = textView22;
                    textView22.setGravity(16);
                    textViewArr[0].setIncludeFontPadding(false);
                    textViewArr[0].setTextSize(1, 14.0f);
                    yob.X(textViewArr[0], !z3 ? aob.z6 : aob.G6, vnbVar);
                    if (wallettransaction.preview || j > j2) {
                        textViewArr[0].setText(uqc.o0(i, j3, vnbVar));
                    } else {
                        if (spannableStringArr[0] == null) {
                            SpannableString spannableString = new SpannableString(ob6.M0(2131748533, null));
                            spannableStringArr[0] = spannableString;
                            spannableString.setSpan(new ya6(hl.L(150.0f), textViewArr[0]), 0, spannableStringArr[0].length(), 33);
                        }
                        textViewArr[0].setText(spannableStringArr[0]);
                    }
                    r7 = 0;
                    r92.c(textViewArr[0], ob6.M0(2131742771, null));
                }
                if (wallettransaction.date != 0) {
                    r92.f(ob6.M0(2131742795, r7), ob6.Q(wallettransaction.date), r7, r7);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ cg5(long[] jArr, c51 c51Var, wm2[] wm2VarArr, m96 m96Var, h96 h96Var, int i, zc zcVar, zc zcVar2, zc zcVar3, dg5 dg5Var, boolean[] zArr) {
        this.c = jArr;
        this.d = c51Var;
        this.e = wm2VarArr;
        this.f = m96Var;
        this.g = h96Var;
        this.b = i;
        this.h = zcVar;
        this.i = zcVar2;
        this.j = zcVar3;
        this.k = dg5Var;
        this.l = zArr;
    }
}
