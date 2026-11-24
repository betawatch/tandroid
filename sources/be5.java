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
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Wallet.c;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class be5 implements p8c {
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

    public /* synthetic */ be5(LinearLayout linearLayout, llc llcVar, wjb wjbVar, int i, TextView textView, cj7[] cj7VarArr, mfb mfbVar, k8c k8cVar, Context context, TextView[] textViewArr, SpannableString[] spannableStringArr) {
        this.c = linearLayout;
        this.d = llcVar;
        this.e = wjbVar;
        this.b = i;
        this.f = textView;
        this.g = cj7VarArr;
        this.h = mfbVar;
        this.i = k8cVar;
        this.j = context;
        this.k = textViewArr;
        this.l = spannableStringArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:139:0x04cd, code lost:
    
        if (r1.preview == false) goto L205;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:124:0x04ed  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x04f0  */
    /* JADX WARN: Type inference failed for: r11v11, types: [mfb] */
    /* JADX WARN: Type inference failed for: r11v19 */
    /* JADX WARN: Type inference failed for: r11v20 */
    /* JADX WARN: Type inference failed for: r11v21 */
    /* JADX WARN: Type inference failed for: r11v22 */
    /* JADX WARN: Type inference failed for: r11v23 */
    /* JADX WARN: Type inference failed for: r11v24 */
    /* JADX WARN: Type inference failed for: r11v25 */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r11v9, types: [mfb] */
    /* JADX WARN: Type inference failed for: r12v13 */
    /* JADX WARN: Type inference failed for: r12v14, types: [java.lang.String, lfb[], q41[]] */
    /* JADX WARN: Type inference failed for: r12v15 */
    /* JADX WARN: Type inference failed for: r12v7, types: [alc] */
    /* JADX WARN: Type inference failed for: r16v10 */
    /* JADX WARN: Type inference failed for: r16v4 */
    /* JADX WARN: Type inference failed for: r16v5, types: [mfb] */
    /* JADX WARN: Type inference failed for: r16v8 */
    /* JADX WARN: Type inference failed for: r3v9, types: [zkc] */
    /* JADX WARN: Type inference failed for: r7v24 */
    /* JADX WARN: Type inference failed for: r7v26, types: [java.lang.String, lfb[], q41[]] */
    /* JADX WARN: Type inference failed for: r7v27 */
    @Override // p8c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Object obj) {
        Context context;
        SpannableString[] spannableStringArr;
        long j;
        boolean z;
        cj7 cj7Var;
        by0 by0Var;
        int i;
        alc alcVar;
        ?? r11;
        ?? r16;
        long j2;
        Context context2;
        long j3;
        ?? r7;
        dq7 c;
        ?? r12;
        cj7 cj7Var2;
        by0 by0Var2;
        int i2;
        char c2;
        cj7 cj7Var3;
        by0 by0Var3;
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
                i76 i76Var = (i76) obj7;
                yc ycVar = (yc) viewGroup;
                yc ycVar2 = (yc) obj5;
                yc ycVar3 = (yc) obj4;
                ce5 ce5Var = (ce5) obj3;
                boolean[] zArr = (boolean[]) obj2;
                Integer num = (Integer) obj;
                long intValue = num.intValue();
                jArr[0] = intValue;
                ((u41) view).i(jva.Y0(false, k96.a0(null, null, 2131744919, k96.E(intValue, ',')), (cm2[]) obj8), true, true);
                i76Var.g = jArr[0];
                ((d76) obj6).set(i76Var);
                int intValue2 = num.intValue();
                int i3 = this.b;
                int b2 = de5.b(i3, intValue2, 0);
                int b3 = de5.b(i3, num.intValue(), 1);
                int b4 = de5.b(i3, num.intValue(), 2);
                ((hn) ycVar.b).c(b2 >= 60 ? k96.a0(null, null, 2131745114, Integer.valueOf(b2 / 60)) : k96.a0(null, null, 2131745112, Integer.valueOf(b2)), true, true);
                ((hn) ycVar2.b).c(k96.E(b3, ','), true, true);
                ((hn) ycVar3.b).c(k96.E(b4, ','), true, true);
                ce5Var.f(de5.b(i3, num.intValue(), 3), de5.b(i3, num.intValue(), 4), !zArr[0]);
                zArr[0] = false;
                break;
            default:
                LinearLayout linearLayout = (LinearLayout) obj9;
                llc llcVar = (llc) view;
                final wjb wjbVar = (wjb) obj8;
                TextView textView = (TextView) obj7;
                final cj7[] cj7VarArr = (cj7[]) obj6;
                mfb mfbVar = (mfb) viewGroup;
                k8c k8cVar = (k8c) obj5;
                Context context3 = (Context) obj4;
                TextView[] textViewArr = (TextView[]) obj3;
                SpannableString[] spannableStringArr2 = (SpannableString[]) obj2;
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj;
                long abs = Math.abs(wallettransaction.amount);
                final byte b5 = 1;
                boolean z2 = wallettransaction.incoming;
                long abs2 = Math.abs(wallettransaction.fee);
                boolean z3 = wallettransaction.pending || wallettransaction.failed;
                boolean z4 = ((linearLayout.getParent() instanceof View) && (linearLayout.getParent().getParent() instanceof wec) && ((wec) linearLayout.getParent().getParent()).getViewPages()[0] != linearLayout.getParent()) ? false : true;
                boolean z5 = wallettransaction.key_change;
                int i4 = this.b;
                boolean z6 = z4;
                if (z5) {
                    context = context3;
                    spannableStringArr = spannableStringArr2;
                    j = abs2;
                    z = z2;
                    if (z6 && (cj7Var = cj7VarArr[0]) != null && (by0Var = cj7Var.o1) != null) {
                        by0Var.setTitle(c.p("Grams", c.u(c.s(abs, false), 0.75f), 2131749315));
                    }
                } else {
                    TL_wallet.nftItem nftitem = wallettransaction.nft;
                    if (nftitem == null) {
                        zkb.X(llcVar, z3 ? bkb.y6 : bkb.Ei, wjbVar);
                        SpannableStringBuilder u = c.u(c.s(abs, false), 0.75f);
                        context = context3;
                        u.insert(0, (CharSequence) (z2 ? "+" : "–"));
                        if (z3) {
                            spannableStringArr = spannableStringArr2;
                            j = abs2;
                        } else {
                            spannableStringArr = spannableStringArr2;
                            j = abs2;
                            u.setSpan(new ForegroundColorSpan(bkb.v0(z2 ? bkb.kk : bkb.F6, wjbVar)), 0, u.length(), 33);
                        }
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                        spannableStringBuilder.append((CharSequence) c.p("Grams", u, 2131749315));
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
                        llcVar.setText(spannableStringBuilder);
                        CharSequence q = c.C(i4).q(abs, false);
                        if (z3) {
                            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(wallettransaction.failed ? k96.M0(2131742879, null) : q6c.a(textView, k96.M0(2131742751, null)));
                            c2 = 0;
                            spannableStringBuilder2.setSpan(new ForegroundColorSpan(bkb.v0(wallettransaction.failed ? bkb.o7 : bkb.m6, wjbVar)), 0, spannableStringBuilder2.length(), 33);
                            textView.setText(k96.V(null, null, 2131742724, q, spannableStringBuilder2));
                        } else {
                            c2 = 0;
                            textView.setText(q);
                        }
                        if (z6 && (cj7Var3 = cj7VarArr[c2]) != null && (by0Var3 = cj7Var3.o1) != null) {
                            by0Var3.setTitle(c.p("Grams", u, 2131749315));
                        }
                    } else {
                        context = context3;
                        spannableStringArr = spannableStringArr2;
                        j = abs2;
                        z = z2;
                        if (z6 && (cj7Var2 = cj7VarArr[0]) != null && (by0Var2 = cj7Var2.o1) != null) {
                            by0Var2.setTitle(TextUtils.isEmpty(nftitem.name) ? k96.M0(2131742933, null) : wallettransaction.nft.name);
                        }
                    }
                }
                mfbVar.removeAllViews();
                final TL_wallet.WalletTransactionPeer walletTransactionPeer = wallettransaction.peer;
                byte b6 = 9;
                if (walletTransactionPeer instanceof TL_wallet.walletTransactionPeerUser) {
                    TL_wallet.walletTransactionPeerUser wallettransactionpeeruser = (TL_wallet.walletTransactionPeerUser) walletTransactionPeer;
                    TLRPC.User V1 = na7.q1(i4).V1(Long.valueOf(wallettransactionpeeruser.user_id));
                    if (V1 != null && !l7c.C(V1.id)) {
                        mfbVar.m(z ? k96.M0(2131742752, null) : k96.M0(2131742777, null), i4, wallettransactionpeeruser.user_id, new wbc(k8cVar, cj7VarArr, wallettransactionpeeruser, (byte) 8), k96.M0(2131742759, null), k8cVar != null ? null : new mhc(cj7VarArr, V1, (byte) 13));
                    }
                    mfb mfbVar2 = mfbVar;
                    if (!TextUtils.isEmpty(wallettransactionpeeruser.domain) && !TextUtils.isEmpty(wallettransactionpeeruser.address)) {
                        mfbVar2.i(k96.M0(2131742886, null), wallettransactionpeeruser.domain, new wbc(cj7VarArr, V1, wallettransactionpeeruser, b6));
                    }
                    i = i4;
                    r11 = mfbVar2;
                } else {
                    mfb mfbVar3 = mfbVar;
                    byte b7 = 10;
                    if (walletTransactionPeer instanceof TL_wallet.walletTransactionPeerChannel) {
                        if (na7.q1(i4).K0(Long.valueOf(walletTransactionPeer.channel_id)) != null) {
                            mfbVar3.n(z ? k96.M0(2131742752, null) : k96.M0(2131742777, null), i4, -walletTransactionPeer.channel_id, new wbc(k8cVar, cj7VarArr, walletTransactionPeer, b7));
                        }
                        i = i4;
                        r11 = mfbVar3;
                        if (!TextUtils.isEmpty(walletTransactionPeer.domain)) {
                            r11 = mfbVar3;
                            if (!TextUtils.isEmpty(walletTransactionPeer.address)) {
                                mfbVar3.i(k96.M0(2131742886, null), walletTransactionPeer.domain, new Runnable() { // from class: zkc
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        byte b8 = b5;
                                        final TL_wallet.WalletTransactionPeer walletTransactionPeer2 = walletTransactionPeer;
                                        cj7[] cj7VarArr2 = cj7VarArr;
                                        final byte b9 = 0;
                                        switch (b8) {
                                            case 0:
                                                final byte b10 = 1;
                                                cj7VarArr2[0].setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: elc
                                                    @Override // android.content.DialogInterface.OnDismissListener
                                                    public final void onDismiss(DialogInterface dialogInterface) {
                                                        byte b11 = b10;
                                                        TL_wallet.WalletTransactionPeer walletTransactionPeer3 = walletTransactionPeer2;
                                                        switch (b11) {
                                                            case 0:
                                                                d S = LaunchActivity.S();
                                                                if (S != null) {
                                                                    qpc qpcVar = new qpc(walletTransactionPeer3.address);
                                                                    qpcVar.z0(walletTransactionPeer3.domain);
                                                                    S.presentFragment(qpcVar);
                                                                    break;
                                                                }
                                                                break;
                                                            default:
                                                                d S2 = LaunchActivity.S();
                                                                if (S2 != null) {
                                                                    S2.presentFragment(new qpc(walletTransactionPeer3.address));
                                                                    break;
                                                                }
                                                                break;
                                                        }
                                                    }
                                                });
                                                cj7VarArr2[0].dismiss();
                                                break;
                                            default:
                                                cj7VarArr2[0].setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: elc
                                                    @Override // android.content.DialogInterface.OnDismissListener
                                                    public final void onDismiss(DialogInterface dialogInterface) {
                                                        byte b11 = b9;
                                                        TL_wallet.WalletTransactionPeer walletTransactionPeer3 = walletTransactionPeer2;
                                                        switch (b11) {
                                                            case 0:
                                                                d S = LaunchActivity.S();
                                                                if (S != null) {
                                                                    qpc qpcVar = new qpc(walletTransactionPeer3.address);
                                                                    qpcVar.z0(walletTransactionPeer3.domain);
                                                                    S.presentFragment(qpcVar);
                                                                    break;
                                                                }
                                                                break;
                                                            default:
                                                                d S2 = LaunchActivity.S();
                                                                if (S2 != null) {
                                                                    S2.presentFragment(new qpc(walletTransactionPeer3.address));
                                                                    break;
                                                                }
                                                                break;
                                                        }
                                                    }
                                                });
                                                cj7VarArr2[0].dismiss();
                                                break;
                                        }
                                    }
                                });
                                r11 = mfbVar3;
                            }
                        }
                    } else {
                        i = i4;
                        r11 = mfbVar3;
                        if (walletTransactionPeer instanceof TL_wallet.walletTransactionPeerAddress) {
                            final TL_wallet.walletTransactionPeerAddress wallettransactionpeeraddress = (TL_wallet.walletTransactionPeerAddress) walletTransactionPeer;
                            r11 = mfbVar3;
                            if (!TextUtils.isEmpty(wallettransactionpeeraddress.domain)) {
                                if (TextUtils.isEmpty(wallettransactionpeeraddress.address)) {
                                    mfbVar3.i(z ? k96.M0(2131742752, null) : k96.M0(2131742777, null), wallettransactionpeeraddress.domain, new jc((byte) 10));
                                    r11 = mfbVar3;
                                } else {
                                    String M0 = z ? k96.M0(2131742752, null) : k96.M0(2131742777, null);
                                    String str = wallettransactionpeeraddress.domain;
                                    final byte b8 = 0;
                                    Runnable runnable = new Runnable() { // from class: alc
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            byte b9 = b8;
                                            final TL_wallet.walletTransactionPeerAddress wallettransactionpeeraddress2 = wallettransactionpeeraddress;
                                            cj7[] cj7VarArr2 = cj7VarArr;
                                            final byte b10 = 0;
                                            switch (b9) {
                                                case 0:
                                                    cj7VarArr2[0].setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: dlc
                                                        @Override // android.content.DialogInterface.OnDismissListener
                                                        public final void onDismiss(DialogInterface dialogInterface) {
                                                            byte b11 = b10;
                                                            TL_wallet.walletTransactionPeerAddress wallettransactionpeeraddress3 = wallettransactionpeeraddress2;
                                                            switch (b11) {
                                                                case 0:
                                                                    d S = LaunchActivity.S();
                                                                    if (S != null) {
                                                                        qpc qpcVar = new qpc(wallettransactionpeeraddress3.address);
                                                                        qpcVar.z0(wallettransactionpeeraddress3.domain);
                                                                        S.presentFragment(qpcVar);
                                                                        break;
                                                                    }
                                                                    break;
                                                                default:
                                                                    d S2 = LaunchActivity.S();
                                                                    if (S2 != null) {
                                                                        qpc qpcVar2 = new qpc(wallettransactionpeeraddress3.address);
                                                                        qpcVar2.z0(wallettransactionpeeraddress3.domain);
                                                                        S2.presentFragment(qpcVar2);
                                                                        break;
                                                                    }
                                                                    break;
                                                            }
                                                        }
                                                    });
                                                    cj7VarArr2[0].dismiss();
                                                    break;
                                                default:
                                                    final byte b11 = 1;
                                                    cj7VarArr2[0].setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: dlc
                                                        @Override // android.content.DialogInterface.OnDismissListener
                                                        public final void onDismiss(DialogInterface dialogInterface) {
                                                            byte b112 = b11;
                                                            TL_wallet.walletTransactionPeerAddress wallettransactionpeeraddress3 = wallettransactionpeeraddress2;
                                                            switch (b112) {
                                                                case 0:
                                                                    d S = LaunchActivity.S();
                                                                    if (S != null) {
                                                                        qpc qpcVar = new qpc(wallettransactionpeeraddress3.address);
                                                                        qpcVar.z0(wallettransactionpeeraddress3.domain);
                                                                        S.presentFragment(qpcVar);
                                                                        break;
                                                                    }
                                                                    break;
                                                                default:
                                                                    d S2 = LaunchActivity.S();
                                                                    if (S2 != null) {
                                                                        qpc qpcVar2 = new qpc(wallettransactionpeeraddress3.address);
                                                                        qpcVar2.z0(wallettransactionpeeraddress3.domain);
                                                                        S2.presentFragment(qpcVar2);
                                                                        break;
                                                                    }
                                                                    break;
                                                            }
                                                        }
                                                    });
                                                    cj7VarArr2[0].dismiss();
                                                    break;
                                            }
                                        }
                                    };
                                    String M02 = k96.M0(2131742759, null);
                                    if (k8cVar != null) {
                                        alcVar = null;
                                    } else {
                                        final byte b9 = 1;
                                        alcVar = new Runnable() { // from class: alc
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                byte b92 = b9;
                                                final TL_wallet.walletTransactionPeerAddress wallettransactionpeeraddress2 = wallettransactionpeeraddress;
                                                cj7[] cj7VarArr2 = cj7VarArr;
                                                final byte b10 = 0;
                                                switch (b92) {
                                                    case 0:
                                                        cj7VarArr2[0].setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: dlc
                                                            @Override // android.content.DialogInterface.OnDismissListener
                                                            public final void onDismiss(DialogInterface dialogInterface) {
                                                                byte b112 = b10;
                                                                TL_wallet.walletTransactionPeerAddress wallettransactionpeeraddress3 = wallettransactionpeeraddress2;
                                                                switch (b112) {
                                                                    case 0:
                                                                        d S = LaunchActivity.S();
                                                                        if (S != null) {
                                                                            qpc qpcVar = new qpc(wallettransactionpeeraddress3.address);
                                                                            qpcVar.z0(wallettransactionpeeraddress3.domain);
                                                                            S.presentFragment(qpcVar);
                                                                            break;
                                                                        }
                                                                        break;
                                                                    default:
                                                                        d S2 = LaunchActivity.S();
                                                                        if (S2 != null) {
                                                                            qpc qpcVar2 = new qpc(wallettransactionpeeraddress3.address);
                                                                            qpcVar2.z0(wallettransactionpeeraddress3.domain);
                                                                            S2.presentFragment(qpcVar2);
                                                                            break;
                                                                        }
                                                                        break;
                                                                }
                                                            }
                                                        });
                                                        cj7VarArr2[0].dismiss();
                                                        break;
                                                    default:
                                                        final byte b11 = 1;
                                                        cj7VarArr2[0].setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: dlc
                                                            @Override // android.content.DialogInterface.OnDismissListener
                                                            public final void onDismiss(DialogInterface dialogInterface) {
                                                                byte b112 = b11;
                                                                TL_wallet.walletTransactionPeerAddress wallettransactionpeeraddress3 = wallettransactionpeeraddress2;
                                                                switch (b112) {
                                                                    case 0:
                                                                        d S = LaunchActivity.S();
                                                                        if (S != null) {
                                                                            qpc qpcVar = new qpc(wallettransactionpeeraddress3.address);
                                                                            qpcVar.z0(wallettransactionpeeraddress3.domain);
                                                                            S.presentFragment(qpcVar);
                                                                            break;
                                                                        }
                                                                        break;
                                                                    default:
                                                                        d S2 = LaunchActivity.S();
                                                                        if (S2 != null) {
                                                                            qpc qpcVar2 = new qpc(wallettransactionpeeraddress3.address);
                                                                            qpcVar2.z0(wallettransactionpeeraddress3.domain);
                                                                            S2.presentFragment(qpcVar2);
                                                                            break;
                                                                        }
                                                                        break;
                                                                }
                                                            }
                                                        });
                                                        cj7VarArr2[0].dismiss();
                                                        break;
                                                }
                                            }
                                        };
                                    }
                                    mfbVar3.h(M0, str, runnable, M02, alcVar);
                                    r11 = mfbVar3;
                                }
                            }
                        }
                    }
                }
                if (!(wallettransaction.peer instanceof TL_wallet.walletTransactionPeerOnchainGift) || (c = dq7.c(wallettransaction)) == null) {
                    r16 = r11;
                    j2 = 0;
                } else {
                    String str2 = c.l;
                    int i5 = c.j;
                    long j4 = c.f;
                    j2 = 0;
                    r11.f(k96.M0(2131742807, null), c.e(), null, null);
                    boolean z7 = c.a == 9;
                    if (j4 > 0) {
                        r12 = 0;
                        r11.f(k96.M0(z7 ? 2131749537 : 2131749535, null), cq7.i(j4), null, null);
                    } else {
                        r12 = 0;
                    }
                    if (z7 && c.i > 0) {
                        r11.f(k96.M0(2131749536, r12), cq7.j(c.i), r12, r12);
                    }
                    if (i5 > 0) {
                        r11.f(k96.M0(2131749539, r12), k96.Q(i5), r12, r12);
                    }
                    if (c.k) {
                        r11.f(k96.M0(2131749541, r12), cq7.i(c.h), r12, r12);
                    }
                    if (str2 != null) {
                        final byte b10 = 0;
                        mfb mfbVar4 = r11;
                        mfbVar4.j(k96.M0(c.m, r12), hmc.n0(str2, new Runnable() { // from class: blc
                            @Override // java.lang.Runnable
                            public final void run() {
                                byte b11 = b10;
                                wjb wjbVar2 = wjbVar;
                                cj7[] cj7VarArr2 = cj7VarArr;
                                switch (b11) {
                                    case 0:
                                        new u21(cj7VarArr2[0].F, wjbVar2).Q(R.raw.copy, 36, k96.M0(2131742958, null)).k(false);
                                        break;
                                    default:
                                        new u21(cj7VarArr2[0].F, wjbVar2).Q(R.raw.copy, 36, k96.M0(2131742958, null)).k(false);
                                        break;
                                }
                            }
                        }), 14, null, null, null);
                        r16 = mfbVar4;
                    } else {
                        r16 = r11;
                    }
                }
                final TL_wallet.WalletTransactionPeer walletTransactionPeer2 = wallettransaction.peer;
                boolean z8 = walletTransactionPeer2 instanceof TL_wallet.walletTransactionPeerUser;
                if (z8 || (walletTransactionPeer2 instanceof TL_wallet.walletTransactionPeerChannel) || (walletTransactionPeer2 instanceof TL_wallet.walletTransactionPeerAddress)) {
                    final byte b11 = 1;
                    final byte b12 = 0;
                    r16.j(k96.M0(2131742960, null), hmc.n0(walletTransactionPeer2.address, new Runnable() { // from class: blc
                        @Override // java.lang.Runnable
                        public final void run() {
                            byte b112 = b11;
                            wjb wjbVar2 = wjbVar;
                            cj7[] cj7VarArr2 = cj7VarArr;
                            switch (b112) {
                                case 0:
                                    new u21(cj7VarArr2[0].F, wjbVar2).Q(R.raw.copy, 36, k96.M0(2131742958, null)).k(false);
                                    break;
                                default:
                                    new u21(cj7VarArr2[0].F, wjbVar2).Q(R.raw.copy, 36, k96.M0(2131742958, null)).k(false);
                                    break;
                            }
                        }
                    }), 14, null, k8cVar == null && !(z8 && na7.q1(i).V1(Long.valueOf(walletTransactionPeer2.user_id)) != null && !l7c.C(walletTransactionPeer2.user_id)) && TextUtils.isEmpty(walletTransactionPeer2.domain) && !TextUtils.isEmpty(walletTransactionPeer2.address) ? k96.M0(2131742759, null) : null, new Runnable() { // from class: zkc
                        @Override // java.lang.Runnable
                        public final void run() {
                            byte b82 = b12;
                            final TL_wallet.WalletTransactionPeer walletTransactionPeer22 = walletTransactionPeer2;
                            cj7[] cj7VarArr2 = cj7VarArr;
                            final byte b92 = 0;
                            switch (b82) {
                                case 0:
                                    final byte b102 = 1;
                                    cj7VarArr2[0].setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: elc
                                        @Override // android.content.DialogInterface.OnDismissListener
                                        public final void onDismiss(DialogInterface dialogInterface) {
                                            byte b112 = b102;
                                            TL_wallet.WalletTransactionPeer walletTransactionPeer3 = walletTransactionPeer22;
                                            switch (b112) {
                                                case 0:
                                                    d S = LaunchActivity.S();
                                                    if (S != null) {
                                                        qpc qpcVar = new qpc(walletTransactionPeer3.address);
                                                        qpcVar.z0(walletTransactionPeer3.domain);
                                                        S.presentFragment(qpcVar);
                                                        break;
                                                    }
                                                    break;
                                                default:
                                                    d S2 = LaunchActivity.S();
                                                    if (S2 != null) {
                                                        S2.presentFragment(new qpc(walletTransactionPeer3.address));
                                                        break;
                                                    }
                                                    break;
                                            }
                                        }
                                    });
                                    cj7VarArr2[0].dismiss();
                                    break;
                                default:
                                    cj7VarArr2[0].setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: elc
                                        @Override // android.content.DialogInterface.OnDismissListener
                                        public final void onDismiss(DialogInterface dialogInterface) {
                                            byte b112 = b92;
                                            TL_wallet.WalletTransactionPeer walletTransactionPeer3 = walletTransactionPeer22;
                                            switch (b112) {
                                                case 0:
                                                    d S = LaunchActivity.S();
                                                    if (S != null) {
                                                        qpc qpcVar = new qpc(walletTransactionPeer3.address);
                                                        qpcVar.z0(walletTransactionPeer3.domain);
                                                        S.presentFragment(qpcVar);
                                                        break;
                                                    }
                                                    break;
                                                default:
                                                    d S2 = LaunchActivity.S();
                                                    if (S2 != null) {
                                                        S2.presentFragment(new qpc(walletTransactionPeer3.address));
                                                        break;
                                                    }
                                                    break;
                                            }
                                        }
                                    });
                                    cj7VarArr2[0].dismiss();
                                    break;
                            }
                        }
                    });
                }
                ?? r112 = r16;
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
                    zkb.X(textViewArr[0], !z3 ? bkb.y6 : bkb.F6, wjbVar);
                    if (wallettransaction.preview) {
                    }
                    textViewArr[0].setText(hmc.o0(i, j3, wjbVar));
                    r7 = 0;
                    r112.c(textViewArr[0], k96.M0(2131742877, null));
                } else if (wallettransaction.gasless) {
                    SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder("x ");
                    cm2 cm2Var = new cm2(R.drawable.wallet_gram_small, 2);
                    cm2Var.d = false;
                    cm2Var.c(gl.L(16.0f));
                    float L = gl.L(1.0f);
                    cm2Var.r = 0.0f;
                    cm2Var.s = L;
                    spannableStringBuilder3.setSpan(cm2Var, 0, 1, 33);
                    spannableStringBuilder3.append((CharSequence) k96.M0(2131742874, null));
                    r112.e(k96.M0(2131742877, null), spannableStringBuilder3, "?", new o57((Object) context, (Object) wjbVar, i, j, (byte) 21), null);
                    r7 = 0;
                } else {
                    context2 = context;
                    j3 = j;
                    TextView textView22 = new TextView(context2);
                    textViewArr[0] = textView22;
                    textView22.setGravity(16);
                    textViewArr[0].setIncludeFontPadding(false);
                    textViewArr[0].setTextSize(1, 14.0f);
                    zkb.X(textViewArr[0], !z3 ? bkb.y6 : bkb.F6, wjbVar);
                    if (wallettransaction.preview || j > j2) {
                        textViewArr[0].setText(hmc.o0(i, j3, wjbVar));
                    } else {
                        if (spannableStringArr[0] == null) {
                            SpannableString spannableString = new SpannableString(k96.M0(2131748587, null));
                            spannableStringArr[0] = spannableString;
                            spannableString.setSpan(new u86(gl.L(150.0f), textViewArr[0]), 0, spannableStringArr[0].length(), 33);
                        }
                        textViewArr[0].setText(spannableStringArr[0]);
                    }
                    r7 = 0;
                    r112.c(textViewArr[0], k96.M0(2131742877, null));
                }
                if (wallettransaction.date != 0) {
                    r112.f(k96.M0(2131742901, r7), k96.Q(wallettransaction.date), r7, r7);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ be5(long[] jArr, u41 u41Var, cm2[] cm2VarArr, i76 i76Var, d76 d76Var, int i, yc ycVar, yc ycVar2, yc ycVar3, ce5 ce5Var, boolean[] zArr) {
        this.c = jArr;
        this.d = u41Var;
        this.e = cm2VarArr;
        this.f = i76Var;
        this.g = d76Var;
        this.b = i;
        this.h = ycVar;
        this.i = ycVar2;
        this.j = ycVar3;
        this.k = ce5Var;
        this.l = zArr;
    }
}
