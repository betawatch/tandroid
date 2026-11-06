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
import org.telegram.messenger.hd;
import org.telegram.messenger.ij;
import org.telegram.messenger.qp;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.wp;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final /* synthetic */ class m0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ t0 b;

    public /* synthetic */ m0(t0 t0Var, int i7) {
        this.a = i7;
        this.b = t0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0152  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        ij ijVar;
        long j3;
        t0 t0Var;
        TL_wallet.walletTransaction wallettransaction;
        m0 m0Var;
        t0 t0Var2;
        int i7 = this.a;
        t0 t0Var3 = this.b;
        switch (i7) {
            case 0:
                q0 q0Var = t0Var3.f1;
                org.telegram.ui.ActionBar.f2 t6 = q0Var != null ? q0Var.t() : null;
                if (t6 == null) {
                    t6 = LaunchActivity.T();
                }
                if (t6 != null) {
                    t6.presentFragment(new org.telegram.ui.Wallet.y5());
                    break;
                }
                break;
            case 1:
                int i10 = t0Var3.H;
                if (t0Var3.S() && (ijVar = t0Var3.P0) != null && ijVar.k != null) {
                    org.telegram.ui.Wallet.n0 x10 = org.telegram.ui.Wallet.n0.x(i10);
                    TLRPC.TL_messageActionGramTransfer tL_messageActionGramTransfer = (TLRPC.TL_messageActionGramTransfer) ijVar.k.action;
                    boolean z9 = ijVar.Q3() && ijVar.k.send_state == 2;
                    boolean z10 = ijVar.Q3() && ijVar.k.send_state == 1;
                    t0Var3.playSoundEffect(0);
                    TLRPC.Message message = ijVar.k;
                    if (message != null) {
                        TLRPC.MessageAction messageAction = message.action;
                        if (messageAction instanceof TLRPC.TL_messageActionGramTransfer) {
                            TLRPC.TL_messageActionGramTransfer tL_messageActionGramTransfer2 = (TLRPC.TL_messageActionGramTransfer) messageAction;
                            if (!TextUtils.isEmpty(tL_messageActionGramTransfer2.transaction_id) && x10.n != null) {
                                for (int i11 = 0; i11 < x10.n.c.size(); i11++) {
                                    wallettransaction = (TL_wallet.walletTransaction) x10.n.c.get(i11);
                                    j3 = 0;
                                    if (TextUtils.equals(wallettransaction.id, tL_messageActionGramTransfer2.transaction_id)) {
                                        t0Var = t0Var3;
                                        if (wallettransaction == null) {
                                            if ((!z10 && !TextUtils.isEmpty(tL_messageActionGramTransfer.transaction_id)) || tL_messageActionGramTransfer.comment_encrypted_preparing) {
                                                wallettransaction = new TL_wallet.walletTransaction();
                                                wallettransaction.id = tL_messageActionGramTransfer.transaction_id;
                                                wallettransaction.failed = z9;
                                                wallettransaction.pending = z10;
                                                wallettransaction.incoming = !ijVar.Q3();
                                                wallettransaction.comment = tL_messageActionGramTransfer.comment;
                                                wallettransaction.comment_encrypted = tL_messageActionGramTransfer.comment_encrypted;
                                                wallettransaction.comment_encrypted_preparing = tL_messageActionGramTransfer.comment_encrypted_preparing;
                                                wallettransaction.amount = tL_messageActionGramTransfer.amount;
                                                TL_wallet.walletTransactionPeerUser wallettransactionpeeruser = new TL_wallet.walletTransactionPeerUser();
                                                wallettransaction.peer = wallettransactionpeeruser;
                                                wallettransactionpeeruser.address = tL_messageActionGramTransfer.peer_address;
                                                wallettransactionpeeruser.user_id = ij.B0(ijVar.k);
                                                wallettransaction.preview = true;
                                                wallettransaction.date = ijVar.k.date;
                                            }
                                        }
                                        t0Var2 = t0Var;
                                        m0Var = new m0(t0Var2, 0);
                                        if (!t0Var2.P0.Q3() || !qp.s1(i10).S3.contains("WALLET_FIRST_INCOMING_TRANSFER")) {
                                            org.telegram.ui.Wallet.y5.G0(t0Var2.getContext(), t0Var2.H, wallettransaction, null, null, null, m0Var, t0Var2.g1);
                                            break;
                                        } else {
                                            qp.s1(i10).k4(j3, "WALLET_FIRST_INCOMING_TRANSFER");
                                            Context context = t0Var2.getContext();
                                            org.telegram.ui.ActionBar.f6 f6Var = t0Var2.g1;
                                            org.telegram.ui.ActionBar.v2 l10 = org.telegram.messenger.k5.l(1, context, f6Var, false);
                                            FrameLayout frameLayout = new FrameLayout(context);
                                            int L = org.telegram.messenger.g0.L(16.0f);
                                            int i12 = org.telegram.ui.ActionBar.k6.h5;
                                            Drawable d02 = org.telegram.ui.ActionBar.k6.d0(L, org.telegram.ui.ActionBar.k6.w0(i12, f6Var));
                                            org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i12);
                                            frameLayout.setBackground(d02);
                                            org.telegram.ui.ActionBar.r6.k(frameLayout, d02, N, null, f6Var);
                                            frameLayout.setPadding(org.telegram.messenger.g0.L(36.0f), 0, org.telegram.messenger.g0.L(36.0f), org.telegram.messenger.g0.L(14.0f));
                                            LinearLayout linearLayout = new LinearLayout(context);
                                            linearLayout.setOrientation(1);
                                            linearLayout.setGravity(1);
                                            frameLayout.addView(linearLayout, c8.ha.c(-2.0f, -1));
                                            linearLayout.addView(new org.telegram.ui.Wallet.w6(120, context, false), c8.ha.t(120, 120, 1, 0, 0, 0, -8));
                                            TextView textView = new TextView(context);
                                            textView.setText(hd.M0(2131743117, null));
                                            org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.j5, f6Var);
                                            textView.setTextSize(1, 17.0f);
                                            textView.setTypeface(org.telegram.messenger.g0.o1("fonts/rmedium.ttf"));
                                            textView.setGravity(17);
                                            TextView f10 = org.telegram.messenger.camera.q.f(linearLayout, textView, c8.ha.t(-1, -2, 1, 0, 0, 0, 6), context);
                                            double d = ((org.telegram.messenger.i0) qp.s1(i10).x7.l.b).a;
                                            f10.setText((d <= 0.0d || Double.isNaN(d) || Double.isInfinite(d)) ? hd.M0(2131743116, null) : hd.a0(null, null, 2131743115, org.telegram.ui.Wallet.n0.s(1000000000L, false), String.format(hd.E0().y, "%.2f", Double.valueOf(d))));
                                            org.telegram.ui.ActionBar.r6.V(f10, org.telegram.ui.ActionBar.k6.r5, f6Var);
                                            f10.setTextSize(1, 14.0f);
                                            f10.setGravity(17);
                                            f10.setLineSpacing(org.telegram.messenger.g0.L(1.0f), 1.0f);
                                            linearLayout.addView(f10, c8.ha.t(-1, -2, 1, 0, 0, 0, 24));
                                            org.telegram.ui.Wallet.r5 r5Var = new org.telegram.ui.Wallet.r5(context, f6Var);
                                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(hd.M0(2131743114, null));
                                            wp wpVar = new wp(R.drawable.mini_attach, 2);
                                            wpVar.c(org.telegram.messenger.g0.L(14.0f));
                                            int indexOf = spannableStringBuilder.toString().indexOf("📎");
                                            spannableStringBuilder.setSpan(wpVar, indexOf, indexOf + 2, 33);
                                            int indexOf2 = spannableStringBuilder.toString().indexOf("→");
                                            spannableStringBuilder.setSpan(new wp(R.drawable.wallet_intro_arrow, 2), indexOf2, indexOf2 + 1, 33);
                                            r5Var.setPadding(org.telegram.messenger.g0.L(0.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(0.0f), org.telegram.messenger.g0.L(8.0f));
                                            r5Var.a(R.drawable.wallet_intro_telegram, hd.M0(2131743023, null), spannableStringBuilder);
                                            int i13 = org.telegram.ui.ActionBar.k6.n6;
                                            PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                                            org.telegram.ui.ActionBar.r6.t(r5Var.b, i13, f6Var, mode);
                                            linearLayout.addView(r5Var, c8.ha.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
                                            org.telegram.ui.Wallet.r5 r5Var2 = new org.telegram.ui.Wallet.r5(context, f6Var);
                                            r5Var2.setPadding(org.telegram.messenger.g0.L(0.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(0.0f), org.telegram.messenger.g0.L(8.0f));
                                            r5Var2.a(R.drawable.wallet_intro_trade, hd.M0(2131742989, null), hd.M0(2131743112, null));
                                            org.telegram.ui.ActionBar.r6.t(r5Var2.b, i13, f6Var, mode);
                                            linearLayout.addView(r5Var2, c8.ha.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
                                            org.telegram.ui.Wallet.r5 r5Var3 = new org.telegram.ui.Wallet.r5(context, f6Var);
                                            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(hd.M0(2131743113, null));
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
                                            r5Var3.setPadding(org.telegram.messenger.g0.L(0.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(0.0f), org.telegram.messenger.g0.L(8.0f));
                                            r5Var3.a(R.drawable.wallet_intro_store, hd.M0(2131743009, null), spannableStringBuilder2);
                                            org.telegram.ui.ActionBar.r6.t(r5Var3.b, org.telegram.ui.ActionBar.k6.n6, f6Var, PorterDuff.Mode.SRC_IN);
                                            linearLayout.addView(r5Var3, c8.ha.k(0.0f, 0.0f, 0.0f, 14.0f, -1, -2));
                                            fi.d h = org.telegram.messenger.k5.h(24, context, f6Var, true);
                                            h.setText(hd.M0(2131743102, null));
                                            linearLayout.addView(h, c8.ha.t(-1, 48, 1, 0, 0, 0, 0));
                                            c8.ka.b(h, 0.02f, 1.1f);
                                            l10.N = frameLayout;
                                            org.telegram.ui.ActionBar.v2[] v2VarArr = {l10};
                                            v2VarArr[0].u0(true);
                                            v2VarArr[0].N();
                                            h.setOnClickListener(new org.telegram.ui.Wallet.n4(v2VarArr, 0));
                                            v2VarArr[0].show();
                                            v2VarArr[0].n(new l2.z0(t0Var2, wallettransaction, m0Var, 22));
                                            break;
                                        }
                                    }
                                }
                            }
                            j3 = 0;
                            if (ijVar.k.random_id != 0) {
                                ArrayList arrayList = x10.p;
                                int size = arrayList.size();
                                int i15 = 0;
                                while (i15 < size) {
                                    Object obj = arrayList.get(i15);
                                    i15++;
                                    TL_wallet.walletTransaction wallettransaction2 = (TL_wallet.walletTransaction) obj;
                                    t0Var = t0Var3;
                                    if (wallettransaction2.random_id == ijVar.k.random_id) {
                                        wallettransaction = wallettransaction2;
                                        if (wallettransaction == null) {
                                        }
                                        t0Var2 = t0Var;
                                        m0Var = new m0(t0Var2, 0);
                                        if (!t0Var2.P0.Q3()) {
                                        }
                                        org.telegram.ui.Wallet.y5.G0(t0Var2.getContext(), t0Var2.H, wallettransaction, null, null, null, m0Var, t0Var2.g1);
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
                            if (!t0Var2.P0.Q3()) {
                            }
                            org.telegram.ui.Wallet.y5.G0(t0Var2.getContext(), t0Var2.H, wallettransaction, null, null, null, m0Var, t0Var2.g1);
                        }
                    }
                    t0Var = t0Var3;
                    wallettransaction = null;
                    j3 = 0;
                    if (wallettransaction == null) {
                    }
                    t0Var2 = t0Var;
                    m0Var = new m0(t0Var2, 0);
                    if (!t0Var2.P0.Q3()) {
                    }
                    org.telegram.ui.Wallet.y5.G0(t0Var2.getContext(), t0Var2.H, wallettransaction, null, null, null, m0Var, t0Var2.g1);
                }
                break;
            case 2:
                t0Var3.T();
                break;
            case 3:
                q0 q0Var2 = t0Var3.f1;
                if (q0Var2 != null) {
                    q0Var2.F(t0Var3);
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
                t0Var3.G = false;
                t0Var3.getMessageObject().L0 = true;
                ArrayList arrayList2 = t0Var3.s1.c;
                if (arrayList2 != null) {
                    arrayList2.clear();
                }
                t0Var3.invalidate();
                break;
        }
    }
}
