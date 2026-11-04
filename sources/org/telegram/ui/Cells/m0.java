package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import b8.mf;
import b8.pf;
import java.util.ArrayList;
import org.telegram.messenger.bd;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.hp;
import org.telegram.messenger.zi;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.wp;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class m0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ t0 b;

    public /* synthetic */ m0(t0 t0Var, int i3) {
        this.a = i3;
        this.b = t0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0152  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        zi ziVar;
        long j10;
        t0 t0Var;
        TL_wallet.walletTransaction wallettransaction;
        m0 m0Var;
        t0 t0Var2;
        int i3 = this.a;
        t0 t0Var3 = this.b;
        switch (i3) {
            case 0:
                q0 q0Var = t0Var3.g1;
                org.telegram.ui.ActionBar.d2 E = q0Var != null ? q0Var.E() : null;
                if (E == null) {
                    E = LaunchActivity.T();
                }
                if (E != null) {
                    E.presentFragment(new org.telegram.ui.Wallet.w5());
                    break;
                }
                break;
            case 1:
                int i10 = t0Var3.I;
                if (t0Var3.S() && (ziVar = t0Var3.Q0) != null && ziVar.k != null) {
                    org.telegram.ui.Wallet.k0 x10 = org.telegram.ui.Wallet.k0.x(i10);
                    TLRPC.TL_messageActionGramTransfer tL_messageActionGramTransfer = (TLRPC.TL_messageActionGramTransfer) ziVar.k.action;
                    boolean z10 = ziVar.Q3() && ziVar.k.send_state == 2;
                    boolean z11 = ziVar.Q3() && ziVar.k.send_state == 1;
                    t0Var3.playSoundEffect(0);
                    TLRPC.Message message = ziVar.k;
                    if (message != null) {
                        TLRPC.MessageAction messageAction = message.action;
                        if (messageAction instanceof TLRPC.TL_messageActionGramTransfer) {
                            TLRPC.TL_messageActionGramTransfer tL_messageActionGramTransfer2 = (TLRPC.TL_messageActionGramTransfer) messageAction;
                            if (!TextUtils.isEmpty(tL_messageActionGramTransfer2.transaction_id) && x10.n != null) {
                                for (int i11 = 0; i11 < x10.n.c.size(); i11++) {
                                    wallettransaction = (TL_wallet.walletTransaction) x10.n.c.get(i11);
                                    j10 = 0;
                                    if (TextUtils.equals(wallettransaction.id, tL_messageActionGramTransfer2.transaction_id)) {
                                        t0Var = t0Var3;
                                        if (wallettransaction == null) {
                                            if ((!z11 && !TextUtils.isEmpty(tL_messageActionGramTransfer.transaction_id)) || tL_messageActionGramTransfer.comment_encrypted_preparing) {
                                                wallettransaction = new TL_wallet.walletTransaction();
                                                wallettransaction.id = tL_messageActionGramTransfer.transaction_id;
                                                wallettransaction.failed = z10;
                                                wallettransaction.pending = z11;
                                                wallettransaction.incoming = !ziVar.Q3();
                                                wallettransaction.comment = tL_messageActionGramTransfer.comment;
                                                wallettransaction.comment_encrypted = tL_messageActionGramTransfer.comment_encrypted;
                                                wallettransaction.comment_encrypted_preparing = tL_messageActionGramTransfer.comment_encrypted_preparing;
                                                wallettransaction.amount = tL_messageActionGramTransfer.amount;
                                                TL_wallet.walletTransactionPeerUser wallettransactionpeeruser = new TL_wallet.walletTransactionPeerUser();
                                                wallettransaction.peer = wallettransactionpeeruser;
                                                wallettransactionpeeruser.address = tL_messageActionGramTransfer.peer_address;
                                                wallettransactionpeeruser.user_id = zi.B0(ziVar.k);
                                                wallettransaction.preview = true;
                                                wallettransaction.date = ziVar.k.date;
                                            }
                                        }
                                        t0Var2 = t0Var;
                                        m0Var = new m0(t0Var2, 0);
                                        if (!t0Var2.Q0.Q3() || !hp.s1(i10).T3.contains("WALLET_FIRST_INCOMING_TRANSFER")) {
                                            org.telegram.ui.Wallet.w5.G0(t0Var2.getContext(), t0Var2.I, wallettransaction, null, null, null, m0Var, t0Var2.h1);
                                            break;
                                        } else {
                                            hp.s1(i10).k4(j10, "WALLET_FIRST_INCOMING_TRANSFER");
                                            Context context = t0Var2.getContext();
                                            org.telegram.ui.ActionBar.e6 e6Var = t0Var2.h1;
                                            org.telegram.ui.ActionBar.t2 l10 = org.telegram.messenger.k5.l(1, context, e6Var, false);
                                            FrameLayout frameLayout = new FrameLayout(context);
                                            int L = org.telegram.messenger.g0.L(16.0f);
                                            int i12 = org.telegram.ui.ActionBar.k6.h5;
                                            Drawable d02 = org.telegram.ui.ActionBar.k6.d0(L, org.telegram.ui.ActionBar.k6.w0(i12, e6Var));
                                            org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i12);
                                            frameLayout.setBackground(d02);
                                            org.telegram.ui.ActionBar.r6.k(frameLayout, d02, N, null, e6Var);
                                            frameLayout.setPadding(org.telegram.messenger.g0.L(36.0f), 0, org.telegram.messenger.g0.L(36.0f), org.telegram.messenger.g0.L(14.0f));
                                            LinearLayout linearLayout = new LinearLayout(context);
                                            linearLayout.setOrientation(1);
                                            linearLayout.setGravity(1);
                                            frameLayout.addView(linearLayout, mf.c(-2.0f, -1));
                                            linearLayout.addView(new org.telegram.ui.Wallet.u6(120, context, false), mf.t(120, 120, 1, 0, 0, 0, -8));
                                            TextView textView = new TextView(context);
                                            textView.setText(bd.M0(2131743126, null));
                                            org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.j5, e6Var);
                                            textView.setTextSize(1, 17.0f);
                                            textView.setTypeface(org.telegram.messenger.g0.o1("fonts/rmedium.ttf"));
                                            textView.setGravity(17);
                                            TextView f10 = org.telegram.messenger.camera.q.f(linearLayout, textView, mf.t(-1, -2, 1, 0, 0, 0, 6), context);
                                            double d = ((org.telegram.messenger.i0) hp.s1(i10).x7.l.b).a;
                                            f10.setText((d <= 0.0d || Double.isNaN(d) || Double.isInfinite(d)) ? bd.M0(2131743125, null) : bd.a0(null, null, 2131743124, org.telegram.ui.Wallet.k0.s(1000000000L, false), String.format(bd.E0().y, "%.2f", Double.valueOf(d))));
                                            org.telegram.ui.ActionBar.r6.V(f10, org.telegram.ui.ActionBar.k6.r5, e6Var);
                                            f10.setTextSize(1, 14.0f);
                                            f10.setGravity(17);
                                            f10.setLineSpacing(org.telegram.messenger.g0.L(1.0f), 1.0f);
                                            linearLayout.addView(f10, mf.t(-1, -2, 1, 0, 0, 0, 24));
                                            org.telegram.ui.Wallet.p5 p5Var = new org.telegram.ui.Wallet.p5(context, e6Var);
                                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(bd.M0(2131743123, null));
                                            wp wpVar = new wp(R.drawable.mini_attach, 2);
                                            wpVar.c(org.telegram.messenger.g0.L(14.0f));
                                            int indexOf = spannableStringBuilder.toString().indexOf("📎");
                                            spannableStringBuilder.setSpan(wpVar, indexOf, indexOf + 2, 33);
                                            int indexOf2 = spannableStringBuilder.toString().indexOf("→");
                                            spannableStringBuilder.setSpan(new wp(R.drawable.wallet_intro_arrow, 2), indexOf2, indexOf2 + 1, 33);
                                            p5Var.setPadding(org.telegram.messenger.g0.L(0.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(0.0f), org.telegram.messenger.g0.L(8.0f));
                                            p5Var.a(R.drawable.wallet_intro_telegram, bd.M0(2131743032, null), spannableStringBuilder);
                                            int i13 = org.telegram.ui.ActionBar.k6.n6;
                                            PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                                            org.telegram.ui.ActionBar.r6.t(p5Var.b, i13, e6Var, mode);
                                            linearLayout.addView(p5Var, mf.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
                                            org.telegram.ui.Wallet.p5 p5Var2 = new org.telegram.ui.Wallet.p5(context, e6Var);
                                            p5Var2.setPadding(org.telegram.messenger.g0.L(0.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(0.0f), org.telegram.messenger.g0.L(8.0f));
                                            p5Var2.a(R.drawable.wallet_intro_trade, bd.M0(2131742998, null), bd.M0(2131743121, null));
                                            org.telegram.ui.ActionBar.r6.t(p5Var2.b, i13, e6Var, mode);
                                            linearLayout.addView(p5Var2, mf.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
                                            org.telegram.ui.Wallet.p5 p5Var3 = new org.telegram.ui.Wallet.p5(context, e6Var);
                                            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(bd.M0(2131743122, null));
                                            wp wpVar2 = new wp(R.drawable.wallet_intro_chats, 2);
                                            int indexOf3 = spannableStringBuilder2.toString().indexOf("💬");
                                            spannableStringBuilder2.setSpan(wpVar2, indexOf3, indexOf3 + 2, 33);
                                            int indexOf4 = spannableStringBuilder2.toString().indexOf("⋮");
                                            spannableStringBuilder2.setSpan(new wp(R.drawable.wallet_intro_options, 2), indexOf4, indexOf4 + 1, 33);
                                            int indexOf5 = TextUtils.indexOf(spannableStringBuilder2, "→");
                                            while (indexOf5 >= 0) {
                                                int i14 = indexOf5 + 1;
                                                spannableStringBuilder2.setSpan(new wp(R.drawable.wallet_intro_arrow, 2), indexOf5, i14, 33);
                                                indexOf5 = TextUtils.indexOf(spannableStringBuilder2, "→", i14);
                                            }
                                            p5Var3.setPadding(org.telegram.messenger.g0.L(0.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(0.0f), org.telegram.messenger.g0.L(8.0f));
                                            p5Var3.a(R.drawable.wallet_intro_store, bd.M0(2131743018, null), spannableStringBuilder2);
                                            org.telegram.ui.ActionBar.r6.t(p5Var3.b, org.telegram.ui.ActionBar.k6.n6, e6Var, PorterDuff.Mode.SRC_IN);
                                            linearLayout.addView(p5Var3, mf.k(0.0f, 0.0f, 0.0f, 14.0f, -1, -2));
                                            gi.d h = org.telegram.messenger.k5.h(24, context, e6Var, true);
                                            h.setText(bd.M0(2131743111, null));
                                            linearLayout.addView(h, mf.t(-1, 48, 1, 0, 0, 0, 0));
                                            pf.b(h, 0.02f, 1.1f);
                                            l10.O = frameLayout;
                                            org.telegram.ui.ActionBar.t2[] t2VarArr = {l10};
                                            t2VarArr[0].u0(true);
                                            t2VarArr[0].N();
                                            h.setOnClickListener(new org.telegram.ui.Wallet.l4(t2VarArr, 0));
                                            t2VarArr[0].show();
                                            t2VarArr[0].n(new lg.y(t0Var2, wallettransaction, m0Var, 26));
                                            break;
                                        }
                                    }
                                }
                            }
                            j10 = 0;
                            if (ziVar.k.random_id != 0) {
                                ArrayList arrayList = x10.p;
                                int size = arrayList.size();
                                int i15 = 0;
                                while (i15 < size) {
                                    Object obj = arrayList.get(i15);
                                    i15++;
                                    TL_wallet.walletTransaction wallettransaction2 = (TL_wallet.walletTransaction) obj;
                                    t0Var = t0Var3;
                                    if (wallettransaction2.random_id == ziVar.k.random_id) {
                                        wallettransaction = wallettransaction2;
                                        if (wallettransaction == null) {
                                        }
                                        t0Var2 = t0Var;
                                        m0Var = new m0(t0Var2, 0);
                                        if (!t0Var2.Q0.Q3()) {
                                        }
                                        org.telegram.ui.Wallet.w5.G0(t0Var2.getContext(), t0Var2.I, wallettransaction, null, null, null, m0Var, t0Var2.h1);
                                    } else {
                                        t0Var3 = t0Var;
                                    }
                                }
                            }
                            t0Var = t0Var3;
                            wallettransaction = null;
                            if (wallettransaction == null) {
                            }
                            t0Var2 = t0Var;
                            m0Var = new m0(t0Var2, 0);
                            if (!t0Var2.Q0.Q3()) {
                            }
                            org.telegram.ui.Wallet.w5.G0(t0Var2.getContext(), t0Var2.I, wallettransaction, null, null, null, m0Var, t0Var2.h1);
                        }
                    }
                    t0Var = t0Var3;
                    wallettransaction = null;
                    j10 = 0;
                    if (wallettransaction == null) {
                    }
                    t0Var2 = t0Var;
                    m0Var = new m0(t0Var2, 0);
                    if (!t0Var2.Q0.Q3()) {
                    }
                    org.telegram.ui.Wallet.w5.G0(t0Var2.getContext(), t0Var2.I, wallettransaction, null, null, null, m0Var, t0Var2.h1);
                }
                break;
            case 2:
                t0Var3.T();
                break;
            case 3:
                q0 q0Var2 = t0Var3.g1;
                if (q0Var2 != null) {
                    q0Var2.c0(t0Var3);
                    break;
                }
                break;
            case 4:
                t0Var3.post(new m0(t0Var3, 6));
                break;
            case 5:
                t0Var3.requestLayout();
                break;
            default:
                t0Var3.H = false;
                t0Var3.getMessageObject().L0 = true;
                ArrayList arrayList2 = t0Var3.t1.c;
                if (arrayList2 != null) {
                    arrayList2.clear();
                }
                t0Var3.invalidate();
                break;
        }
    }
}
