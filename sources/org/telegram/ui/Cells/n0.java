package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.gj;
import org.telegram.messenger.hd;
import org.telegram.messenger.np;
import org.telegram.messenger.o10;
import org.telegram.messenger.p10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.nq;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final /* synthetic */ class n0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ v0 b;

    public /* synthetic */ n0(v0 v0Var, int i7) {
        this.a = i7;
        this.b = v0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0169  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        gj gjVar;
        long j3;
        int i7;
        v0 v0Var;
        TL_wallet.walletTransaction wallettransaction;
        n0 n0Var;
        v0 v0Var2;
        int i10 = this.a;
        int i11 = 1;
        v0 v0Var3 = this.b;
        switch (i10) {
            case 0:
                v0Var3.requestLayout();
                break;
            case 1:
                v0Var3.H = false;
                v0Var3.getMessageObject().N0 = true;
                ArrayList arrayList = v0Var3.t1.c;
                if (arrayList != null) {
                    arrayList.clear();
                }
                v0Var3.invalidate();
                break;
            case 2:
                s0 s0Var = v0Var3.g1;
                org.telegram.ui.ActionBar.g2 G = s0Var != null ? s0Var.G() : null;
                if (G == null) {
                    G = LaunchActivity.T();
                }
                if (G != null) {
                    G.presentFragment(new org.telegram.ui.Wallet.n6());
                    break;
                }
                break;
            case 3:
                int i12 = v0Var3.I;
                if (v0Var3.T() && (gjVar = v0Var3.Q0) != null && gjVar.k != null) {
                    org.telegram.ui.Wallet.u0 D = org.telegram.ui.Wallet.u0.D(i12);
                    TLRPC.TL_messageActionGramTransfer tL_messageActionGramTransfer = (TLRPC.TL_messageActionGramTransfer) gjVar.k.action;
                    int i13 = 2;
                    boolean z10 = gjVar.P3() && gjVar.k.send_state == 2;
                    boolean z11 = gjVar.P3() && gjVar.k.send_state == 1;
                    v0Var3.playSoundEffect(0);
                    TLRPC.Message message = gjVar.k;
                    if (message != null) {
                        TLRPC.MessageAction messageAction = message.action;
                        if (messageAction instanceof TLRPC.TL_messageActionGramTransfer) {
                            TLRPC.TL_messageActionGramTransfer tL_messageActionGramTransfer2 = (TLRPC.TL_messageActionGramTransfer) messageAction;
                            if (!TextUtils.isEmpty(tL_messageActionGramTransfer2.transaction_id) && D.n != null) {
                                for (int i14 = 0; i14 < D.n.c.size(); i14++) {
                                    wallettransaction = (TL_wallet.walletTransaction) D.n.c.get(i14);
                                    j3 = 0;
                                    if (TextUtils.equals(wallettransaction.id, tL_messageActionGramTransfer2.transaction_id)) {
                                        i7 = 1;
                                        v0Var = v0Var3;
                                        if (wallettransaction == null) {
                                            if ((!z11 && !TextUtils.isEmpty(tL_messageActionGramTransfer.transaction_id)) || tL_messageActionGramTransfer.comment_encrypted_preparing) {
                                                wallettransaction = new TL_wallet.walletTransaction();
                                                wallettransaction.id = tL_messageActionGramTransfer.transaction_id;
                                                wallettransaction.failed = z10;
                                                wallettransaction.pending = z11;
                                                wallettransaction.incoming = !gjVar.P3();
                                                wallettransaction.comment = tL_messageActionGramTransfer.comment;
                                                wallettransaction.comment_encrypted = tL_messageActionGramTransfer.comment_encrypted;
                                                wallettransaction.comment_encrypted_preparing = tL_messageActionGramTransfer.comment_encrypted_preparing;
                                                wallettransaction.amount = tL_messageActionGramTransfer.amount;
                                                if (TextUtils.isEmpty(tL_messageActionGramTransfer.onramp_provider_name) || !p10.B(gj.B0(gjVar.k))) {
                                                    TL_wallet.walletTransactionPeerUser wallettransactionpeeruser = new TL_wallet.walletTransactionPeerUser();
                                                    wallettransaction.peer = wallettransactionpeeruser;
                                                    wallettransactionpeeruser.address = tL_messageActionGramTransfer.peer_address;
                                                    wallettransactionpeeruser.user_id = gj.B0(gjVar.k);
                                                } else {
                                                    TL_wallet.walletTransactionPeerOnramp wallettransactionpeeronramp = new TL_wallet.walletTransactionPeerOnramp();
                                                    wallettransactionpeeronramp.provider_name = tL_messageActionGramTransfer.onramp_provider_name;
                                                    wallettransactionpeeronramp.address = tL_messageActionGramTransfer.peer_address;
                                                    wallettransaction.peer = wallettransactionpeeronramp;
                                                }
                                                wallettransaction.preview = i7;
                                                wallettransaction.date = gjVar.k.date;
                                            }
                                        }
                                        v0Var2 = v0Var;
                                        n0Var = new n0(v0Var2, i13);
                                        if (!v0Var2.Q0.P3() || !np.u1(i12).V3.contains("WALLET_FIRST_INCOMING_TRANSFER")) {
                                            org.telegram.ui.Wallet.n6.K0(v0Var2.getContext(), v0Var2.I, wallettransaction, null, null, null, n0Var, v0Var2.h1);
                                            break;
                                        } else {
                                            np.u1(i12).s4(j3, "WALLET_FIRST_INCOMING_TRANSFER");
                                            Context context = v0Var2.getContext();
                                            org.telegram.ui.ActionBar.h6 h6Var = v0Var2.h1;
                                            org.telegram.ui.ActionBar.w2 j10 = org.telegram.messenger.f3.j(1, context, h6Var, false);
                                            FrameLayout frameLayout = new FrameLayout(context);
                                            int L = org.telegram.messenger.g0.L(16.0f);
                                            int i15 = org.telegram.ui.ActionBar.m6.h5;
                                            Drawable d02 = org.telegram.ui.ActionBar.m6.d0(L, org.telegram.ui.ActionBar.m6.w0(i15, h6Var));
                                            org.telegram.ui.ActionBar.p6 M = org.telegram.ui.ActionBar.t6.M(i15);
                                            frameLayout.setBackground(d02);
                                            org.telegram.ui.ActionBar.t6.j(frameLayout, d02, M, null, h6Var);
                                            frameLayout.setPadding(org.telegram.messenger.g0.L(36.0f), 0, org.telegram.messenger.g0.L(36.0f), org.telegram.messenger.g0.L(14.0f));
                                            LinearLayout linearLayout = new LinearLayout(context);
                                            linearLayout.setOrientation(1);
                                            linearLayout.setGravity(1);
                                            frameLayout.addView(linearLayout, c8.ma.c(-2.0f, -1));
                                            linearLayout.addView(new org.telegram.ui.Wallet.m7(120, context, false), c8.ma.t(120, 120, 1, 0, 0, 0, -8));
                                            TextView textView = new TextView(context);
                                            textView.setText(hd.N0(2131742869, null));
                                            org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.j5, h6Var);
                                            textView.setTextSize(1, 17.0f);
                                            textView.setTypeface(org.telegram.messenger.g0.o1("fonts/rmedium.ttf"));
                                            textView.setGravity(17);
                                            TextView f10 = o10.f(linearLayout, textView, c8.ma.t(-1, -2, 1, 0, 0, 0, 6), context);
                                            double d = ((org.telegram.messenger.i0) np.u1(i12).A7.l.b).a;
                                            f10.setText((d <= 0.0d || Double.isNaN(d) || Double.isInfinite(d)) ? hd.N0(2131742868, null) : hd.a0(null, null, 2131742867, org.telegram.ui.Wallet.u0.x(1000000000L, false), String.format(hd.E0().y, "%.2f", Double.valueOf(d))));
                                            org.telegram.ui.ActionBar.t6.U(f10, org.telegram.ui.ActionBar.m6.r5, h6Var);
                                            f10.setTextSize(1, 14.0f);
                                            f10.setGravity(17);
                                            f10.setLineSpacing(org.telegram.messenger.g0.L(1.0f), 1.0f);
                                            linearLayout.addView(f10, c8.ma.t(-1, -2, 1, 0, 0, 0, 24));
                                            org.telegram.ui.Wallet.g6 g6Var = new org.telegram.ui.Wallet.g6(context, h6Var);
                                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(hd.N0(2131742866, null));
                                            nq nqVar = new nq(R.drawable.mini_attach, 2);
                                            nqVar.c(org.telegram.messenger.g0.L(14.0f));
                                            int indexOf = spannableStringBuilder.toString().indexOf("📎");
                                            spannableStringBuilder.setSpan(nqVar, indexOf, indexOf + 2, 33);
                                            int indexOf2 = spannableStringBuilder.toString().indexOf("→");
                                            spannableStringBuilder.setSpan(new nq(R.drawable.wallet_intro_arrow, 2), indexOf2, indexOf2 + 1, 33);
                                            g6Var.setPadding(org.telegram.messenger.g0.L(0.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(0.0f), org.telegram.messenger.g0.L(8.0f));
                                            g6Var.a(R.drawable.wallet_intro_telegram, hd.N0(2131742756, null), spannableStringBuilder);
                                            int i16 = org.telegram.ui.ActionBar.m6.n6;
                                            PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                                            org.telegram.ui.ActionBar.t6.s(g6Var.b, i16, h6Var, mode);
                                            linearLayout.addView(g6Var, c8.ma.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
                                            org.telegram.ui.Wallet.g6 g6Var2 = new org.telegram.ui.Wallet.g6(context, h6Var);
                                            g6Var2.setPadding(org.telegram.messenger.g0.L(0.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(0.0f), org.telegram.messenger.g0.L(8.0f));
                                            g6Var2.a(R.drawable.wallet_intro_trade, hd.N0(2131742722, null), hd.N0(2131742864, null));
                                            org.telegram.ui.ActionBar.t6.s(g6Var2.b, i16, h6Var, mode);
                                            linearLayout.addView(g6Var2, c8.ma.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
                                            org.telegram.ui.Wallet.g6 g6Var3 = new org.telegram.ui.Wallet.g6(context, h6Var);
                                            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(hd.N0(2131742865, null));
                                            nq nqVar2 = new nq(R.drawable.wallet_intro_chats, 2);
                                            int indexOf3 = spannableStringBuilder2.toString().indexOf("💬");
                                            spannableStringBuilder2.setSpan(nqVar2, indexOf3, indexOf3 + 2, 33);
                                            int indexOf4 = spannableStringBuilder2.toString().indexOf("⋮");
                                            spannableStringBuilder2.setSpan(new nq(R.drawable.wallet_intro_options, 2), indexOf4, indexOf4 + 1, 33);
                                            int indexOf5 = TextUtils.indexOf(spannableStringBuilder2, "→");
                                            while (indexOf5 >= 0) {
                                                int i17 = indexOf5 + 1;
                                                spannableStringBuilder2.setSpan(new nq(R.drawable.wallet_intro_arrow, 2), indexOf5, i17, 33);
                                                indexOf5 = TextUtils.indexOf(spannableStringBuilder2, "→", i17);
                                            }
                                            g6Var3.setPadding(org.telegram.messenger.g0.L(0.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(0.0f), org.telegram.messenger.g0.L(8.0f));
                                            g6Var3.a(R.drawable.wallet_intro_store, hd.N0(2131742742, null), spannableStringBuilder2);
                                            org.telegram.ui.ActionBar.t6.s(g6Var3.b, org.telegram.ui.ActionBar.m6.n6, h6Var, PorterDuff.Mode.SRC_IN);
                                            linearLayout.addView(g6Var3, c8.ma.k(0.0f, 0.0f, 0.0f, 14.0f, -1, -2));
                                            hi.e g10 = o10.g(24, context, h6Var, true);
                                            g10.setText(hd.N0(2131742854, null));
                                            linearLayout.addView(g10, c8.ma.t(-1, 48, 1, 0, 0, 0, 0));
                                            c8.ra.b(g10, 0.02f, 1.1f);
                                            j10.O = frameLayout;
                                            org.telegram.ui.ActionBar.w2[] w2VarArr = {j10};
                                            w2VarArr[0].u0(true);
                                            w2VarArr[0].O();
                                            g10.setOnClickListener(new org.telegram.ui.Wallet.a5(w2VarArr, 0));
                                            w2VarArr[0].show();
                                            w2VarArr[0].n(new kg.y(v0Var2, wallettransaction, n0Var, 27));
                                            break;
                                        }
                                    }
                                }
                            }
                            j3 = 0;
                            if (gjVar.k.random_id != 0) {
                                ArrayList arrayList2 = D.p;
                                int size = arrayList2.size();
                                int i18 = 0;
                                while (i18 < size) {
                                    Object obj = arrayList2.get(i18);
                                    i18++;
                                    TL_wallet.walletTransaction wallettransaction2 = (TL_wallet.walletTransaction) obj;
                                    i7 = i11;
                                    v0Var = v0Var3;
                                    if (wallettransaction2.random_id == gjVar.k.random_id) {
                                        wallettransaction = wallettransaction2;
                                        if (wallettransaction == null) {
                                        }
                                        v0Var2 = v0Var;
                                        n0Var = new n0(v0Var2, i13);
                                        if (!v0Var2.Q0.P3()) {
                                        }
                                        org.telegram.ui.Wallet.n6.K0(v0Var2.getContext(), v0Var2.I, wallettransaction, null, null, null, n0Var, v0Var2.h1);
                                    } else {
                                        v0Var3 = v0Var;
                                        i11 = i7;
                                    }
                                }
                            }
                            i7 = i11;
                            v0Var = v0Var3;
                            wallettransaction = null;
                            if (wallettransaction == null) {
                            }
                            v0Var2 = v0Var;
                            n0Var = new n0(v0Var2, i13);
                            if (!v0Var2.Q0.P3()) {
                            }
                            org.telegram.ui.Wallet.n6.K0(v0Var2.getContext(), v0Var2.I, wallettransaction, null, null, null, n0Var, v0Var2.h1);
                        }
                    }
                    i7 = 1;
                    v0Var = v0Var3;
                    wallettransaction = null;
                    j3 = 0;
                    if (wallettransaction == null) {
                    }
                    v0Var2 = v0Var;
                    n0Var = new n0(v0Var2, i13);
                    if (!v0Var2.Q0.P3()) {
                    }
                    org.telegram.ui.Wallet.n6.K0(v0Var2.getContext(), v0Var2.I, wallettransaction, null, null, null, n0Var, v0Var2.h1);
                }
                break;
            case 4:
                v0Var3.U();
                break;
            case 5:
                s0 s0Var2 = v0Var3.g1;
                if (s0Var2 != null) {
                    s0Var2.a0(v0Var3);
                    break;
                }
                break;
            default:
                v0Var3.post(new n0(v0Var3, i11));
                break;
        }
    }
}
