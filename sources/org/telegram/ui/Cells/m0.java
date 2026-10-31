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
import org.telegram.messenger.cd;
import org.telegram.messenger.jj;
import org.telegram.messenger.vp;
import org.telegram.messenger.z20;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.dq;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class m0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ s0 b;

    public /* synthetic */ m0(s0 s0Var, int i10) {
        this.a = i10;
        this.b = s0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0152  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        jj jjVar;
        long j10;
        s0 s0Var;
        TL_wallet.walletTransaction wallettransaction;
        m0 m0Var;
        s0 s0Var2;
        int i10 = this.a;
        s0 s0Var3 = this.b;
        switch (i10) {
            case 0:
                q0 q0Var = s0Var3.f1;
                org.telegram.ui.ActionBar.k2 h02 = q0Var != null ? q0Var.h0() : null;
                if (h02 == null) {
                    h02 = LaunchActivity.T();
                }
                if (h02 != null) {
                    h02.presentFragment(new org.telegram.ui.Wallet.b6());
                    break;
                }
                break;
            case 1:
                int i11 = s0Var3.H;
                if (s0Var3.T() && (jjVar = s0Var3.P0) != null && jjVar.k != null) {
                    org.telegram.ui.Wallet.k0 x10 = org.telegram.ui.Wallet.k0.x(i11);
                    TLRPC.TL_messageActionGramTransfer tL_messageActionGramTransfer = (TLRPC.TL_messageActionGramTransfer) jjVar.k.action;
                    boolean z10 = jjVar.P3() && jjVar.k.send_state == 2;
                    boolean z11 = jjVar.P3() && jjVar.k.send_state == 1;
                    s0Var3.playSoundEffect(0);
                    TLRPC.Message message = jjVar.k;
                    if (message != null) {
                        TLRPC.MessageAction messageAction = message.action;
                        if (messageAction instanceof TLRPC.TL_messageActionGramTransfer) {
                            TLRPC.TL_messageActionGramTransfer tL_messageActionGramTransfer2 = (TLRPC.TL_messageActionGramTransfer) messageAction;
                            if (!TextUtils.isEmpty(tL_messageActionGramTransfer2.transaction_id) && x10.n != null) {
                                for (int i12 = 0; i12 < x10.n.c.size(); i12++) {
                                    wallettransaction = (TL_wallet.walletTransaction) x10.n.c.get(i12);
                                    j10 = 0;
                                    if (TextUtils.equals(wallettransaction.id, tL_messageActionGramTransfer2.transaction_id)) {
                                        s0Var = s0Var3;
                                        if (wallettransaction == null) {
                                            if ((!z11 && !TextUtils.isEmpty(tL_messageActionGramTransfer.transaction_id)) || tL_messageActionGramTransfer.comment_encrypted_preparing) {
                                                wallettransaction = new TL_wallet.walletTransaction();
                                                wallettransaction.id = tL_messageActionGramTransfer.transaction_id;
                                                wallettransaction.failed = z10;
                                                wallettransaction.pending = z11;
                                                wallettransaction.incoming = !jjVar.P3();
                                                wallettransaction.comment = tL_messageActionGramTransfer.comment;
                                                wallettransaction.comment_encrypted = tL_messageActionGramTransfer.comment_encrypted;
                                                wallettransaction.comment_encrypted_preparing = tL_messageActionGramTransfer.comment_encrypted_preparing;
                                                wallettransaction.amount = tL_messageActionGramTransfer.amount;
                                                TL_wallet.walletTransactionPeerUser wallettransactionpeeruser = new TL_wallet.walletTransactionPeerUser();
                                                wallettransaction.peer = wallettransactionpeeruser;
                                                wallettransactionpeeruser.address = tL_messageActionGramTransfer.peer_address;
                                                wallettransactionpeeruser.user_id = jj.B0(jjVar.k);
                                                wallettransaction.preview = true;
                                                wallettransaction.date = jjVar.k.date;
                                            }
                                        }
                                        s0Var2 = s0Var;
                                        m0Var = new m0(s0Var2, 0);
                                        if (!s0Var2.P0.P3() || !vp.r1(i11).U3.contains("WALLET_FIRST_INCOMING_TRANSFER")) {
                                            org.telegram.ui.Wallet.b6.F0(s0Var2.getContext(), s0Var2.H, wallettransaction, null, null, null, m0Var, s0Var2.g1);
                                            break;
                                        } else {
                                            vp.r1(i11).h4(j10, "WALLET_FIRST_INCOMING_TRANSFER");
                                            Context context = s0Var2.getContext();
                                            org.telegram.ui.ActionBar.p6 p6Var = s0Var2.g1;
                                            org.telegram.ui.ActionBar.z2 k10 = org.telegram.messenger.m5.k(1, context, p6Var, false);
                                            FrameLayout frameLayout = new FrameLayout(context);
                                            int L = org.telegram.messenger.i0.L(16.0f);
                                            int i13 = org.telegram.ui.ActionBar.t6.h5;
                                            Drawable d02 = org.telegram.ui.ActionBar.t6.d0(L, org.telegram.ui.ActionBar.t6.w0(i13, p6Var));
                                            org.telegram.ui.ActionBar.w6 N = org.telegram.ui.ActionBar.a7.N(i13);
                                            frameLayout.setBackground(d02);
                                            org.telegram.ui.ActionBar.a7.k(frameLayout, d02, N, null, p6Var);
                                            frameLayout.setPadding(org.telegram.messenger.i0.L(36.0f), 0, org.telegram.messenger.i0.L(36.0f), org.telegram.messenger.i0.L(14.0f));
                                            LinearLayout linearLayout = new LinearLayout(context);
                                            linearLayout.setOrientation(1);
                                            linearLayout.setGravity(1);
                                            frameLayout.addView(linearLayout, w7.b6.c(-2.0f, -1));
                                            linearLayout.addView(new org.telegram.ui.Wallet.a7(120, context, false), w7.b6.t(120, 120, 1, 0, 0, 0, -8));
                                            TextView textView = new TextView(context);
                                            textView.setText(cd.L0(2131743142, null));
                                            org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.j5, p6Var);
                                            textView.setTextSize(1, 17.0f);
                                            textView.setTypeface(org.telegram.messenger.i0.o1("fonts/rmedium.ttf"));
                                            textView.setGravity(17);
                                            TextView f7 = z20.f(linearLayout, textView, w7.b6.t(-1, -2, 1, 0, 0, 0, 6), context);
                                            double d = ((org.telegram.messenger.k0) vp.r1(i11).y7.l.b).a;
                                            f7.setText((d <= 0.0d || Double.isNaN(d) || Double.isInfinite(d)) ? cd.L0(2131743141, null) : cd.a0(null, null, 2131743140, org.telegram.ui.Wallet.k0.s(1000000000L, false), String.format(cd.D0().y, "%.2f", Double.valueOf(d))));
                                            org.telegram.ui.ActionBar.a7.V(f7, org.telegram.ui.ActionBar.t6.r5, p6Var);
                                            f7.setTextSize(1, 14.0f);
                                            f7.setGravity(17);
                                            f7.setLineSpacing(org.telegram.messenger.i0.L(1.0f), 1.0f);
                                            linearLayout.addView(f7, w7.b6.t(-1, -2, 1, 0, 0, 0, 24));
                                            org.telegram.ui.Wallet.t5 t5Var = new org.telegram.ui.Wallet.t5(context, p6Var);
                                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(cd.L0(2131743139, null));
                                            dq dqVar = new dq(R.drawable.mini_attach, 2);
                                            dqVar.c(org.telegram.messenger.i0.L(14.0f));
                                            int indexOf = spannableStringBuilder.toString().indexOf("📎");
                                            spannableStringBuilder.setSpan(dqVar, indexOf, indexOf + 2, 33);
                                            int indexOf2 = spannableStringBuilder.toString().indexOf("→");
                                            spannableStringBuilder.setSpan(new dq(R.drawable.wallet_intro_arrow, 2), indexOf2, indexOf2 + 1, 33);
                                            t5Var.setPadding(org.telegram.messenger.i0.L(0.0f), org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(0.0f), org.telegram.messenger.i0.L(8.0f));
                                            t5Var.a(R.drawable.wallet_intro_telegram, cd.L0(2131743048, null), spannableStringBuilder);
                                            int i14 = org.telegram.ui.ActionBar.t6.n6;
                                            PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                                            org.telegram.ui.ActionBar.a7.t(t5Var.b, i14, p6Var, mode);
                                            linearLayout.addView(t5Var, w7.b6.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
                                            org.telegram.ui.Wallet.t5 t5Var2 = new org.telegram.ui.Wallet.t5(context, p6Var);
                                            t5Var2.setPadding(org.telegram.messenger.i0.L(0.0f), org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(0.0f), org.telegram.messenger.i0.L(8.0f));
                                            t5Var2.a(R.drawable.wallet_intro_trade, cd.L0(2131743014, null), cd.L0(2131743137, null));
                                            org.telegram.ui.ActionBar.a7.t(t5Var2.b, i14, p6Var, mode);
                                            linearLayout.addView(t5Var2, w7.b6.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
                                            org.telegram.ui.Wallet.t5 t5Var3 = new org.telegram.ui.Wallet.t5(context, p6Var);
                                            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(cd.L0(2131743138, null));
                                            dq dqVar2 = new dq(R.drawable.wallet_intro_chats, 2);
                                            int indexOf3 = spannableStringBuilder2.toString().indexOf("💬");
                                            spannableStringBuilder2.setSpan(dqVar2, indexOf3, indexOf3 + 2, 33);
                                            int indexOf4 = spannableStringBuilder2.toString().indexOf("⋮");
                                            spannableStringBuilder2.setSpan(new dq(R.drawable.wallet_intro_options, 2), indexOf4, indexOf4 + 1, 33);
                                            int indexOf5 = TextUtils.indexOf(spannableStringBuilder2, "→");
                                            while (indexOf5 >= 0) {
                                                int i15 = indexOf5 + 1;
                                                spannableStringBuilder2.setSpan(new dq(R.drawable.wallet_intro_arrow, 2), indexOf5, i15, 33);
                                                indexOf5 = TextUtils.indexOf(spannableStringBuilder2, "→", i15);
                                            }
                                            t5Var3.setPadding(org.telegram.messenger.i0.L(0.0f), org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(0.0f), org.telegram.messenger.i0.L(8.0f));
                                            t5Var3.a(R.drawable.wallet_intro_store, cd.L0(2131743034, null), spannableStringBuilder2);
                                            org.telegram.ui.ActionBar.a7.t(t5Var3.b, org.telegram.ui.ActionBar.t6.n6, p6Var, PorterDuff.Mode.SRC_IN);
                                            linearLayout.addView(t5Var3, w7.b6.k(0.0f, 0.0f, 0.0f, 14.0f, -1, -2));
                                            vh.d i16 = z20.i(24, context, p6Var, true);
                                            i16.setText(cd.L0(2131743127, null));
                                            linearLayout.addView(i16, w7.b6.t(-1, 48, 1, 0, 0, 0, 0));
                                            w7.e6.b(i16, 0.02f, 1.1f);
                                            k10.N = frameLayout;
                                            org.telegram.ui.ActionBar.z2[] z2VarArr = {k10};
                                            z2VarArr[0].u0(true);
                                            z2VarArr[0].O();
                                            i16.setOnClickListener(new org.telegram.ui.Wallet.n4(z2VarArr, 0));
                                            z2VarArr[0].show();
                                            z2VarArr[0].o(new li.s(s0Var2, wallettransaction, m0Var, 22));
                                            break;
                                        }
                                    }
                                }
                            }
                            j10 = 0;
                            if (jjVar.k.random_id != 0) {
                                ArrayList arrayList = x10.p;
                                int size = arrayList.size();
                                int i17 = 0;
                                while (i17 < size) {
                                    Object obj = arrayList.get(i17);
                                    i17++;
                                    TL_wallet.walletTransaction wallettransaction2 = (TL_wallet.walletTransaction) obj;
                                    s0Var = s0Var3;
                                    if (wallettransaction2.random_id == jjVar.k.random_id) {
                                        wallettransaction = wallettransaction2;
                                        if (wallettransaction == null) {
                                        }
                                        s0Var2 = s0Var;
                                        m0Var = new m0(s0Var2, 0);
                                        if (!s0Var2.P0.P3()) {
                                        }
                                        org.telegram.ui.Wallet.b6.F0(s0Var2.getContext(), s0Var2.H, wallettransaction, null, null, null, m0Var, s0Var2.g1);
                                    } else {
                                        s0Var3 = s0Var;
                                    }
                                }
                            }
                            s0Var = s0Var3;
                            wallettransaction = null;
                            if (wallettransaction == null) {
                            }
                            s0Var2 = s0Var;
                            m0Var = new m0(s0Var2, 0);
                            if (!s0Var2.P0.P3()) {
                            }
                            org.telegram.ui.Wallet.b6.F0(s0Var2.getContext(), s0Var2.H, wallettransaction, null, null, null, m0Var, s0Var2.g1);
                        }
                    }
                    s0Var = s0Var3;
                    wallettransaction = null;
                    j10 = 0;
                    if (wallettransaction == null) {
                    }
                    s0Var2 = s0Var;
                    m0Var = new m0(s0Var2, 0);
                    if (!s0Var2.P0.P3()) {
                    }
                    org.telegram.ui.Wallet.b6.F0(s0Var2.getContext(), s0Var2.H, wallettransaction, null, null, null, m0Var, s0Var2.g1);
                }
                break;
            case 2:
                s0Var3.U();
                break;
            case 3:
                q0 q0Var2 = s0Var3.f1;
                if (q0Var2 != null) {
                    q0Var2.G0(s0Var3);
                    break;
                }
                break;
            case 4:
                s0Var3.post(new m0(s0Var3, 6));
                break;
            case 5:
                s0Var3.requestLayout();
                break;
            default:
                s0Var3.G = false;
                s0Var3.getMessageObject().L0 = true;
                ArrayList arrayList2 = s0Var3.s1.e;
                if (arrayList2 != null) {
                    arrayList2.clear();
                }
                s0Var3.invalidate();
                break;
        }
    }
}
