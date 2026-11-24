// default package

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Wallet.c;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class nk1 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ uk1 b;

    public /* synthetic */ nk1(uk1 uk1Var, byte b) {
        this.a = b;
        this.b = uk1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0158  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        k27 k27Var;
        byte b;
        TL_wallet.walletTransaction wallettransaction;
        nk1 nk1Var;
        byte b2 = 1;
        switch (this.a) {
            case 0:
                this.b.requestLayout();
                break;
            case 1:
                uk1 uk1Var = this.b;
                uk1Var.H = false;
                uk1Var.getMessageObject().N0 = true;
                uk1Var.t1.f.clear();
                uk1Var.invalidate();
                break;
            case 2:
                rk1 rk1Var = this.b.g1;
                d v = rk1Var != null ? rk1Var.v() : null;
                if (v == null) {
                    v = LaunchActivity.S();
                }
                if (v != null) {
                    v.presentFragment(new hmc());
                    break;
                }
                break;
            case 3:
                uk1 uk1Var2 = this.b;
                if (uk1Var2.V() && (k27Var = uk1Var2.Q0) != null && k27Var.k != null) {
                    c C = c.C(uk1Var2.I);
                    TLRPC.TL_messageActionGramTransfer tL_messageActionGramTransfer = (TLRPC.TL_messageActionGramTransfer) k27Var.k.action;
                    byte b3 = 2;
                    boolean z = k27Var.O3() && k27Var.k.send_state == 2;
                    boolean z2 = k27Var.O3() && k27Var.k.send_state == 1;
                    uk1Var2.playSoundEffect(0);
                    TLRPC.Message message = k27Var.k;
                    if (message != null) {
                        TLRPC.MessageAction messageAction = message.action;
                        if (messageAction instanceof TLRPC.TL_messageActionGramTransfer) {
                            TLRPC.TL_messageActionGramTransfer tL_messageActionGramTransfer2 = (TLRPC.TL_messageActionGramTransfer) messageAction;
                            if (!TextUtils.isEmpty(tL_messageActionGramTransfer2.transaction_id) && C.n != null) {
                                for (int i = 0; i < C.n.c.size(); i++) {
                                    wallettransaction = (TL_wallet.walletTransaction) C.n.c.get(i);
                                    if (TextUtils.equals(wallettransaction.id, tL_messageActionGramTransfer2.transaction_id)) {
                                        b = 1;
                                        if (wallettransaction == null) {
                                            if ((!z2 && !TextUtils.isEmpty(tL_messageActionGramTransfer.transaction_id)) || tL_messageActionGramTransfer.comment_encrypted_preparing) {
                                                wallettransaction = new TL_wallet.walletTransaction();
                                                wallettransaction.id = tL_messageActionGramTransfer.transaction_id;
                                                wallettransaction.failed = z;
                                                wallettransaction.pending = z2;
                                                wallettransaction.incoming = !k27Var.O3();
                                                wallettransaction.comment = tL_messageActionGramTransfer.comment;
                                                wallettransaction.comment_encrypted = tL_messageActionGramTransfer.comment_encrypted;
                                                wallettransaction.comment_encrypted_preparing = tL_messageActionGramTransfer.comment_encrypted_preparing;
                                                wallettransaction.amount = tL_messageActionGramTransfer.amount;
                                                if (TextUtils.isEmpty(tL_messageActionGramTransfer.onramp_provider_name) || !l7c.B(k27.B0(k27Var.k))) {
                                                    TL_wallet.walletTransactionPeerUser wallettransactionpeeruser = new TL_wallet.walletTransactionPeerUser();
                                                    wallettransaction.peer = wallettransactionpeeruser;
                                                    wallettransactionpeeruser.address = tL_messageActionGramTransfer.peer_address;
                                                    wallettransactionpeeruser.user_id = k27.B0(k27Var.k);
                                                } else {
                                                    TL_wallet.walletTransactionPeerOnramp wallettransactionpeeronramp = new TL_wallet.walletTransactionPeerOnramp();
                                                    wallettransactionpeeronramp.provider_name = tL_messageActionGramTransfer.onramp_provider_name;
                                                    wallettransactionpeeronramp.address = tL_messageActionGramTransfer.peer_address;
                                                    wallettransaction.peer = wallettransactionpeeronramp;
                                                }
                                                wallettransaction.preview = b;
                                                wallettransaction.date = k27Var.k.date;
                                            }
                                        }
                                        nk1Var = new nk1(uk1Var2, b3);
                                        if (!uk1Var2.Q0.O3() || !na7.q1(uk1Var2.I).u3.contains("WALLET_FIRST_INCOMING_TRANSFER")) {
                                            hmc.I0(uk1Var2.getContext(), uk1Var2.I, wallettransaction, null, null, null, nk1Var, uk1Var2.h1);
                                            break;
                                        } else {
                                            na7.q1(uk1Var2.I).m4(0L, "WALLET_FIRST_INCOMING_TRANSFER");
                                            Context context = uk1Var2.getContext();
                                            int i2 = uk1Var2.I;
                                            wjb wjbVar = uk1Var2.h1;
                                            fx0 h = de9.h(1, wjbVar, context, false);
                                            FrameLayout frameLayout = new FrameLayout(context);
                                            int L = gl.L(16.0f);
                                            int i3 = bkb.g5;
                                            Drawable b0 = bkb.b0(L, bkb.v0(i3, wjbVar));
                                            vkb M = zkb.M(i3);
                                            frameLayout.setBackground(b0);
                                            zkb.j(frameLayout, b0, M, null, wjbVar);
                                            frameLayout.setPadding(gl.L(36.0f), 0, gl.L(36.0f), gl.L(14.0f));
                                            LinearLayout linearLayout = new LinearLayout(context);
                                            linearLayout.setOrientation(1);
                                            linearLayout.setGravity(1);
                                            frameLayout.addView(linearLayout, nme.c(-2.0f, -1));
                                            linearLayout.addView(new lnc(120, context, false), nme.t(120, 120, 1, 0, 0, 0, -8));
                                            TextView textView = new TextView(context);
                                            textView.setText(k96.M0(2131742872, null));
                                            zkb.X(textView, bkb.i5, wjbVar);
                                            textView.setTextSize(1, 17.0f);
                                            textView.setTypeface(gl.n1("fonts/rmedium.ttf"));
                                            textView.setGravity(17);
                                            TextView m = ug8.m(linearLayout, textView, nme.t(-1, -2, 1, 0, 0, 0, 6), context);
                                            double d = na7.q1(i2).k4.k.i;
                                            m.setText((d <= 0.0d || Double.isNaN(d) || Double.isInfinite(d)) ? k96.M0(2131742871, null) : k96.a0(null, null, 2131742870, c.w(1000000000L, false), String.format(k96.D0().y, "%.2f", Double.valueOf(d))));
                                            zkb.X(m, bkb.q5, wjbVar);
                                            m.setTextSize(1, 14.0f);
                                            m.setGravity(17);
                                            m.setLineSpacing(gl.L(1.0f), 1.0f);
                                            linearLayout.addView(m, nme.t(-1, -2, 1, 0, 0, 0, 24));
                                            amc amcVar = new amc(context, wjbVar);
                                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(k96.M0(2131742869, null));
                                            cm2 cm2Var = new cm2(R.drawable.mini_attach, 2);
                                            cm2Var.c(gl.L(14.0f));
                                            int indexOf = spannableStringBuilder.toString().indexOf("📎");
                                            spannableStringBuilder.setSpan(cm2Var, indexOf, indexOf + 2, 33);
                                            int indexOf2 = spannableStringBuilder.toString().indexOf("→");
                                            spannableStringBuilder.setSpan(new cm2(R.drawable.wallet_intro_arrow, 2), indexOf2, indexOf2 + 1, 33);
                                            amcVar.setPadding(gl.L(0.0f), gl.L(8.0f), gl.L(0.0f), gl.L(8.0f));
                                            amcVar.a(R.drawable.wallet_intro_telegram, k96.M0(2131742759, null), spannableStringBuilder);
                                            ImageView imageView = amcVar.b;
                                            int i4 = bkb.m6;
                                            PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                                            zkb.s(imageView, i4, wjbVar, mode);
                                            linearLayout.addView(amcVar, nme.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
                                            amc amcVar2 = new amc(context, wjbVar);
                                            amcVar2.setPadding(gl.L(0.0f), gl.L(8.0f), gl.L(0.0f), gl.L(8.0f));
                                            amcVar2.a(R.drawable.wallet_intro_trade, k96.M0(2131742725, null), k96.M0(2131742867, null));
                                            zkb.s(amcVar2.b, i4, wjbVar, mode);
                                            linearLayout.addView(amcVar2, nme.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
                                            amc amcVar3 = new amc(context, wjbVar);
                                            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(k96.M0(2131742868, null));
                                            cm2 cm2Var2 = new cm2(R.drawable.wallet_intro_chats, 2);
                                            int indexOf3 = spannableStringBuilder2.toString().indexOf("💬");
                                            spannableStringBuilder2.setSpan(cm2Var2, indexOf3, indexOf3 + 2, 33);
                                            int indexOf4 = spannableStringBuilder2.toString().indexOf("⋮");
                                            spannableStringBuilder2.setSpan(new cm2(R.drawable.wallet_intro_options, 2), indexOf4, indexOf4 + 1, 33);
                                            int indexOf5 = TextUtils.indexOf(spannableStringBuilder2, "→");
                                            while (indexOf5 >= 0) {
                                                int i5 = indexOf5 + 1;
                                                spannableStringBuilder2.setSpan(new cm2(R.drawable.wallet_intro_arrow, 2), indexOf5, i5, 33);
                                                indexOf5 = TextUtils.indexOf(spannableStringBuilder2, "→", i5);
                                            }
                                            amcVar3.setPadding(gl.L(0.0f), gl.L(8.0f), gl.L(0.0f), gl.L(8.0f));
                                            amcVar3.a(R.drawable.wallet_intro_store, k96.M0(2131742745, null), spannableStringBuilder2);
                                            zkb.s(amcVar3.b, bkb.m6, wjbVar, PorterDuff.Mode.SRC_IN);
                                            linearLayout.addView(amcVar3, nme.k(0.0f, 0.0f, 0.0f, 14.0f, -1, -2));
                                            u41 i6 = yjb.i(24, wjbVar, context, true);
                                            i6.setText(k96.M0(2131742857, null));
                                            linearLayout.addView(i6, nme.t(-1, 48, 1, 0, 0, 0, 0));
                                            ote.b(i6, 0.02f, 1.1f);
                                            h.O = frameLayout;
                                            fx0[] fx0VarArr = {h};
                                            fx0VarArr[0].r0(true);
                                            fx0VarArr[0].K();
                                            i6.setOnClickListener(new f5(fx0VarArr, (byte) 8));
                                            fx0VarArr[0].show();
                                            fx0VarArr[0].n(new fv0((Object) uk1Var2, (Object) wallettransaction, (Object) nk1Var, (byte) 22));
                                            break;
                                        }
                                    }
                                }
                            }
                            if (k27Var.k.random_id != 0) {
                                ArrayList arrayList = C.p;
                                int size = arrayList.size();
                                int i7 = 0;
                                while (i7 < size) {
                                    Object obj = arrayList.get(i7);
                                    i7++;
                                    wallettransaction = (TL_wallet.walletTransaction) obj;
                                    b = b2;
                                    if (wallettransaction.random_id != k27Var.k.random_id) {
                                        b2 = b;
                                    } else {
                                        if (wallettransaction == null) {
                                        }
                                        nk1Var = new nk1(uk1Var2, b3);
                                        if (!uk1Var2.Q0.O3()) {
                                        }
                                        hmc.I0(uk1Var2.getContext(), uk1Var2.I, wallettransaction, null, null, null, nk1Var, uk1Var2.h1);
                                    }
                                }
                            }
                        }
                    }
                    b = b2;
                    wallettransaction = null;
                    if (wallettransaction == null) {
                    }
                    nk1Var = new nk1(uk1Var2, b3);
                    if (!uk1Var2.Q0.O3()) {
                    }
                    hmc.I0(uk1Var2.getContext(), uk1Var2.I, wallettransaction, null, null, null, nk1Var, uk1Var2.h1);
                }
                break;
            case 4:
                this.b.W();
                break;
            case 5:
                uk1 uk1Var3 = this.b;
                rk1 rk1Var2 = uk1Var3.g1;
                if (rk1Var2 != null) {
                    rk1Var2.R(uk1Var3);
                    break;
                }
                break;
            case 6:
                uk1 uk1Var4 = this.b;
                uk1Var4.post(new nk1(uk1Var4, b2));
                break;
            default:
                this.b.invalidate();
                break;
        }
    }
}
