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
import org.telegram.messenger.fj;
import org.telegram.messenger.gd;
import org.telegram.messenger.mp;
import org.telegram.messenger.n10;
import org.telegram.messenger.o10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.lq;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class n0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ u0 b;

    public /* synthetic */ n0(u0 u0Var, int i7) {
        this.a = i7;
        this.b = u0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x014e  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        fj fjVar;
        long j3;
        TL_wallet.walletTransaction wallettransaction;
        n0 n0Var;
        int i7 = this.a;
        int i10 = 1;
        int i11 = 0;
        u0 u0Var = this.b;
        switch (i7) {
            case 0:
                u0Var.H = false;
                u0Var.getMessageObject().N0 = true;
                ArrayList arrayList = u0Var.t1.c;
                if (arrayList != null) {
                    arrayList.clear();
                }
                u0Var.invalidate();
                break;
            case 1:
                r0 r0Var = u0Var.g1;
                org.telegram.ui.ActionBar.h2 G = r0Var != null ? r0Var.G() : null;
                if (G == null) {
                    G = LaunchActivity.T();
                }
                if (G != null) {
                    G.presentFragment(new org.telegram.ui.Wallet.n6());
                    break;
                }
                break;
            case 2:
                int i12 = u0Var.I;
                if (u0Var.W() && (fjVar = u0Var.Q0) != null && fjVar.k != null) {
                    org.telegram.ui.Wallet.u0 D = org.telegram.ui.Wallet.u0.D(i12);
                    TLRPC.TL_messageActionGramTransfer tL_messageActionGramTransfer = (TLRPC.TL_messageActionGramTransfer) fjVar.k.action;
                    boolean z10 = fjVar.P3() && fjVar.k.send_state == 2;
                    boolean z11 = fjVar.P3() && fjVar.k.send_state == 1;
                    u0Var.playSoundEffect(0);
                    TLRPC.Message message = fjVar.k;
                    if (message != null) {
                        TLRPC.MessageAction messageAction = message.action;
                        if (messageAction instanceof TLRPC.TL_messageActionGramTransfer) {
                            TLRPC.TL_messageActionGramTransfer tL_messageActionGramTransfer2 = (TLRPC.TL_messageActionGramTransfer) messageAction;
                            if (!TextUtils.isEmpty(tL_messageActionGramTransfer2.transaction_id) && D.n != null) {
                                for (int i13 = 0; i13 < D.n.c.size(); i13++) {
                                    wallettransaction = (TL_wallet.walletTransaction) D.n.c.get(i13);
                                    if (TextUtils.equals(wallettransaction.id, tL_messageActionGramTransfer2.transaction_id)) {
                                        j3 = 0;
                                        if (wallettransaction == null) {
                                            if ((!z11 && !TextUtils.isEmpty(tL_messageActionGramTransfer.transaction_id)) || tL_messageActionGramTransfer.comment_encrypted_preparing) {
                                                wallettransaction = new TL_wallet.walletTransaction();
                                                wallettransaction.id = tL_messageActionGramTransfer.transaction_id;
                                                wallettransaction.failed = z10;
                                                wallettransaction.pending = z11;
                                                wallettransaction.incoming = !fjVar.P3();
                                                wallettransaction.comment = tL_messageActionGramTransfer.comment;
                                                wallettransaction.comment_encrypted = tL_messageActionGramTransfer.comment_encrypted;
                                                wallettransaction.comment_encrypted_preparing = tL_messageActionGramTransfer.comment_encrypted_preparing;
                                                wallettransaction.amount = tL_messageActionGramTransfer.amount;
                                                if (TextUtils.isEmpty(tL_messageActionGramTransfer.onramp_provider_name) || !o10.B(fj.B0(fjVar.k))) {
                                                    TL_wallet.walletTransactionPeerUser wallettransactionpeeruser = new TL_wallet.walletTransactionPeerUser();
                                                    wallettransaction.peer = wallettransactionpeeruser;
                                                    wallettransactionpeeruser.address = tL_messageActionGramTransfer.peer_address;
                                                    wallettransactionpeeruser.user_id = fj.B0(fjVar.k);
                                                } else {
                                                    TL_wallet.walletTransactionPeerOnramp wallettransactionpeeronramp = new TL_wallet.walletTransactionPeerOnramp();
                                                    wallettransactionpeeronramp.provider_name = tL_messageActionGramTransfer.onramp_provider_name;
                                                    wallettransactionpeeronramp.address = tL_messageActionGramTransfer.peer_address;
                                                    wallettransaction.peer = wallettransactionpeeronramp;
                                                }
                                                wallettransaction.preview = true;
                                                wallettransaction.date = fjVar.k.date;
                                            }
                                        }
                                        n0Var = new n0(u0Var, i10);
                                        if (!u0Var.Q0.P3() || !mp.u1(i12).V3.contains("WALLET_FIRST_INCOMING_TRANSFER")) {
                                            org.telegram.ui.Wallet.n6.K0(u0Var.getContext(), u0Var.I, wallettransaction, null, null, null, n0Var, u0Var.h1);
                                            break;
                                        } else {
                                            mp.u1(i12).s4(j3, "WALLET_FIRST_INCOMING_TRANSFER");
                                            Context context = u0Var.getContext();
                                            org.telegram.ui.ActionBar.i6 i6Var = u0Var.h1;
                                            org.telegram.ui.ActionBar.x2 j10 = org.telegram.messenger.f3.j(1, context, i6Var, false);
                                            FrameLayout frameLayout = new FrameLayout(context);
                                            int L = org.telegram.messenger.g0.L(16.0f);
                                            int i14 = org.telegram.ui.ActionBar.n6.h5;
                                            Drawable d02 = org.telegram.ui.ActionBar.n6.d0(L, org.telegram.ui.ActionBar.n6.w0(i14, i6Var));
                                            org.telegram.ui.ActionBar.q6 M = org.telegram.ui.ActionBar.u6.M(i14);
                                            frameLayout.setBackground(d02);
                                            org.telegram.ui.ActionBar.u6.j(frameLayout, d02, M, null, i6Var);
                                            frameLayout.setPadding(org.telegram.messenger.g0.L(36.0f), 0, org.telegram.messenger.g0.L(36.0f), org.telegram.messenger.g0.L(14.0f));
                                            LinearLayout linearLayout = new LinearLayout(context);
                                            linearLayout.setOrientation(1);
                                            linearLayout.setGravity(1);
                                            frameLayout.addView(linearLayout, c8.ma.c(-2.0f, -1));
                                            linearLayout.addView(new org.telegram.ui.Wallet.m7(120, context, false), c8.ma.t(120, 120, 1, 0, 0, 0, -8));
                                            TextView textView = new TextView(context);
                                            textView.setText(gd.M0(2131742877, null));
                                            org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.j5, i6Var);
                                            textView.setTextSize(1, 17.0f);
                                            textView.setTypeface(org.telegram.messenger.g0.o1("fonts/rmedium.ttf"));
                                            textView.setGravity(17);
                                            TextView f10 = n10.f(linearLayout, textView, c8.ma.t(-1, -2, 1, 0, 0, 0, 6), context);
                                            double d = ((org.telegram.messenger.i0) mp.u1(i12).A7.l.b).a;
                                            f10.setText((d <= 0.0d || Double.isNaN(d) || Double.isInfinite(d)) ? gd.M0(2131742876, null) : gd.a0(null, null, 2131742875, org.telegram.ui.Wallet.u0.x(1000000000L, false), String.format(gd.E0().y, "%.2f", Double.valueOf(d))));
                                            org.telegram.ui.ActionBar.u6.U(f10, org.telegram.ui.ActionBar.n6.r5, i6Var);
                                            f10.setTextSize(1, 14.0f);
                                            f10.setGravity(17);
                                            f10.setLineSpacing(org.telegram.messenger.g0.L(1.0f), 1.0f);
                                            linearLayout.addView(f10, c8.ma.t(-1, -2, 1, 0, 0, 0, 24));
                                            org.telegram.ui.Wallet.g6 g6Var = new org.telegram.ui.Wallet.g6(context, i6Var);
                                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(gd.M0(2131742874, null));
                                            lq lqVar = new lq(R.drawable.mini_attach, 2);
                                            lqVar.c(org.telegram.messenger.g0.L(14.0f));
                                            int indexOf = spannableStringBuilder.toString().indexOf("📎");
                                            spannableStringBuilder.setSpan(lqVar, indexOf, indexOf + 2, 33);
                                            int indexOf2 = spannableStringBuilder.toString().indexOf("→");
                                            spannableStringBuilder.setSpan(new lq(R.drawable.wallet_intro_arrow, 2), indexOf2, indexOf2 + 1, 33);
                                            g6Var.setPadding(org.telegram.messenger.g0.L(0.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(0.0f), org.telegram.messenger.g0.L(8.0f));
                                            g6Var.a(R.drawable.wallet_intro_telegram, gd.M0(2131742764, null), spannableStringBuilder);
                                            int i15 = org.telegram.ui.ActionBar.n6.n6;
                                            PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                                            org.telegram.ui.ActionBar.u6.s(g6Var.b, i15, i6Var, mode);
                                            linearLayout.addView(g6Var, c8.ma.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
                                            org.telegram.ui.Wallet.g6 g6Var2 = new org.telegram.ui.Wallet.g6(context, i6Var);
                                            g6Var2.setPadding(org.telegram.messenger.g0.L(0.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(0.0f), org.telegram.messenger.g0.L(8.0f));
                                            g6Var2.a(R.drawable.wallet_intro_trade, gd.M0(2131742730, null), gd.M0(2131742872, null));
                                            org.telegram.ui.ActionBar.u6.s(g6Var2.b, i15, i6Var, mode);
                                            linearLayout.addView(g6Var2, c8.ma.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
                                            org.telegram.ui.Wallet.g6 g6Var3 = new org.telegram.ui.Wallet.g6(context, i6Var);
                                            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(gd.M0(2131742873, null));
                                            lq lqVar2 = new lq(R.drawable.wallet_intro_chats, 2);
                                            int indexOf3 = spannableStringBuilder2.toString().indexOf("💬");
                                            spannableStringBuilder2.setSpan(lqVar2, indexOf3, indexOf3 + 2, 33);
                                            int indexOf4 = spannableStringBuilder2.toString().indexOf("⋮");
                                            spannableStringBuilder2.setSpan(new lq(R.drawable.wallet_intro_options, 2), indexOf4, indexOf4 + 1, 33);
                                            int indexOf5 = TextUtils.indexOf(spannableStringBuilder2, "→");
                                            while (indexOf5 >= 0) {
                                                int i16 = indexOf5 + 1;
                                                spannableStringBuilder2.setSpan(new lq(R.drawable.wallet_intro_arrow, 2), indexOf5, i16, 33);
                                                indexOf5 = TextUtils.indexOf(spannableStringBuilder2, "→", i16);
                                            }
                                            g6Var3.setPadding(org.telegram.messenger.g0.L(0.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(0.0f), org.telegram.messenger.g0.L(8.0f));
                                            g6Var3.a(R.drawable.wallet_intro_store, gd.M0(2131742750, null), spannableStringBuilder2);
                                            org.telegram.ui.ActionBar.u6.s(g6Var3.b, org.telegram.ui.ActionBar.n6.n6, i6Var, PorterDuff.Mode.SRC_IN);
                                            linearLayout.addView(g6Var3, c8.ma.k(0.0f, 0.0f, 0.0f, 14.0f, -1, -2));
                                            hi.d g10 = n10.g(24, context, i6Var, true);
                                            g10.setText(gd.M0(2131742862, null));
                                            linearLayout.addView(g10, c8.ma.t(-1, 48, 1, 0, 0, 0, 0));
                                            c8.ra.b(g10, 0.02f, 1.1f);
                                            j10.O = frameLayout;
                                            org.telegram.ui.ActionBar.x2[] x2VarArr = {j10};
                                            x2VarArr[0].u0(true);
                                            x2VarArr[0].O();
                                            g10.setOnClickListener(new org.telegram.ui.Wallet.z4(x2VarArr, 0));
                                            x2VarArr[0].show();
                                            x2VarArr[0].n(new kg.i0(u0Var, wallettransaction, n0Var, 26));
                                            break;
                                        }
                                    }
                                }
                            }
                            j3 = 0;
                            if (fjVar.k.random_id != 0) {
                                ArrayList arrayList2 = D.p;
                                int size = arrayList2.size();
                                int i17 = 0;
                                while (i17 < size) {
                                    Object obj = arrayList2.get(i17);
                                    i17++;
                                    wallettransaction = (TL_wallet.walletTransaction) obj;
                                    if (wallettransaction.random_id == fjVar.k.random_id) {
                                        if (wallettransaction == null) {
                                        }
                                        n0Var = new n0(u0Var, i10);
                                        if (!u0Var.Q0.P3()) {
                                        }
                                        org.telegram.ui.Wallet.n6.K0(u0Var.getContext(), u0Var.I, wallettransaction, null, null, null, n0Var, u0Var.h1);
                                    }
                                }
                            }
                            wallettransaction = null;
                            if (wallettransaction == null) {
                            }
                            n0Var = new n0(u0Var, i10);
                            if (!u0Var.Q0.P3()) {
                            }
                            org.telegram.ui.Wallet.n6.K0(u0Var.getContext(), u0Var.I, wallettransaction, null, null, null, n0Var, u0Var.h1);
                        }
                    }
                    wallettransaction = null;
                    j3 = 0;
                    if (wallettransaction == null) {
                    }
                    n0Var = new n0(u0Var, i10);
                    if (!u0Var.Q0.P3()) {
                    }
                    org.telegram.ui.Wallet.n6.K0(u0Var.getContext(), u0Var.I, wallettransaction, null, null, null, n0Var, u0Var.h1);
                }
                break;
            case 3:
                u0Var.X();
                break;
            case 4:
                r0 r0Var2 = u0Var.g1;
                if (r0Var2 != null) {
                    r0Var2.a0(u0Var);
                    break;
                }
                break;
            case 5:
                u0Var.post(new n0(u0Var, i11));
                break;
            default:
                u0Var.requestLayout();
                break;
        }
    }
}
