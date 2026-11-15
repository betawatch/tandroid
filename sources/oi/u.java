package oi;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.ShapeDrawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import c8.na;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.hd;
import org.telegram.messenger.i20;
import org.telegram.messenger.np;
import org.telegram.messenger.xt;
import org.telegram.messenger.z10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_aicompose;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.q6;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.ja;
import org.telegram.ui.Components.p41;
import org.telegram.ui.Components.tj0;
import org.telegram.ui.Components.uj0;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes4.dex */
public final class u extends ja {
    public final int T1;
    public final z10 U1;
    public p41 V1;
    public final FrameLayout W1;
    public final FrameLayout X1;
    public final xt Y1;
    public final FrameLayout Z1;
    public final org.telegram.ui.Cells.k3 a2;
    public final hi.d b2;
    public boolean c2;
    public int d2;
    public TL_iv.RichMessage e2;

    public u(int i7, Context context, z10 z10Var, e6 e6Var) {
        super(context, null, true, false, e6Var);
        this.T1 = i7;
        this.U1 = z10Var;
        int i10 = j6.a7;
        w0(i10);
        Q(i10);
        FrameLayout frameLayout = new FrameLayout(context);
        this.W1 = frameLayout;
        TextView textView = new TextView(context);
        textView.setText(hd.M0(2131754060, null));
        final int i11 = 1;
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        int i12 = j6.G6;
        q6.U(textView, i12, e6Var);
        textView.setGravity(19);
        frameLayout.addView(textView, c8.ja.d(-1, 56.0f, 51, 22.0f, 6.0f, 56.0f, 0.0f));
        this.D1 = org.telegram.messenger.g0.L(-8.0f);
        ImageView e10 = i20.e(context, R.drawable.ic_close_white);
        e10.setScaleType(ImageView.ScaleType.CENTER);
        q6.s(e10, i12, e6Var, PorterDuff.Mode.SRC_IN);
        na.a(e10);
        final int i13 = 0;
        e10.setOnClickListener(new View.OnClickListener(this) { // from class: oi.s
            public final /* synthetic */ u b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i13) {
                    case 0:
                        this.b.dismiss();
                        break;
                    default:
                        u uVar = this.b;
                        org.telegram.ui.Cells.k3 k3Var = uVar.a2;
                        if (!uVar.c2) {
                            TL_iv.RichMessage richMessage = uVar.e2;
                            if (richMessage == null) {
                                String trim = k3Var.d.getText().toString().trim();
                                if (!TextUtils.isEmpty(trim)) {
                                    uVar.c2 = true;
                                    uVar.b2.setLoading(true);
                                    TLRPC.TL_messages_composeRichMessageWithAI tL_messages_composeRichMessageWithAI = new TLRPC.TL_messages_composeRichMessageWithAI();
                                    TL_aicompose.inputAiComposeToneSingleUse inputaicomposetonesingleuse = new TL_aicompose.inputAiComposeToneSingleUse();
                                    inputaicomposetonesingleuse.custom_prompt = trim;
                                    tL_messages_composeRichMessageWithAI.tone = inputaicomposetonesingleuse;
                                    uVar.d2 = ConnectionsManager.getInstance(uVar.T1).sendRequest(tL_messages_composeRichMessageWithAI, new ai.d1(uVar, 21));
                                    org.telegram.messenger.g0.v1(k3Var.d);
                                    break;
                                }
                            } else {
                                z10 z10Var2 = uVar.U1;
                                if (z10Var2 != null) {
                                    z10Var2.a(richMessage);
                                }
                                uVar.dismiss();
                                break;
                            }
                        }
                        break;
                }
            }
        });
        frameLayout.addView(e10, c8.ja.d(48, 48.0f, 53, 0.0f, 10.0f, 12.0f, 0.0f));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.X1 = frameLayout2;
        xt xtVar = new xt(i7, context, e6Var);
        this.Y1 = xtVar;
        xtVar.setPadding(org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(12.0f));
        int L = org.telegram.messenger.g0.L(12.0f);
        int i14 = j6.d6;
        ShapeDrawable d02 = j6.d0(L, j6.w0(i14, e6Var));
        m6 M = q6.M(i14);
        xtVar.setBackground(d02);
        q6.j(xtVar, d02, M, null, e6Var);
        frameLayout2.addView(xtVar, c8.ja.c(-2.0f, -1));
        frameLayout2.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f), 0);
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.Z1 = frameLayout3;
        org.telegram.ui.Cells.k3 k3Var = new org.telegram.ui.Cells.k3(context, hd.M0(2131754058, null), true, false, ((org.telegram.messenger.j0) np.s1(i7).y7.R.b).c, e6Var);
        this.a2 = k3Var;
        org.telegram.ui.Cells.i3 i3Var = k3Var.d;
        i3Var.setImeOptions(6);
        i3Var.setMaxLines(5);
        ShapeDrawable d03 = j6.d0(org.telegram.messenger.g0.L(20.0f), j6.w0(i14, e6Var));
        m6 M2 = q6.M(i14);
        k3Var.setBackground(d03);
        q6.j(k3Var, d03, M2, null, e6Var);
        i3Var.addTextChangedListener(new t(this));
        frameLayout3.addView(k3Var, c8.ja.c(-2.0f, -1));
        frameLayout3.setPadding(org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f), 0);
        hi.d g10 = i20.g(24, context, e6Var, true);
        this.b2 = g10;
        g10.i(hd.M0(2131754059, null), false, true);
        g10.setOnClickListener(new View.OnClickListener(this) { // from class: oi.s
            public final /* synthetic */ u b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        this.b.dismiss();
                        break;
                    default:
                        u uVar = this.b;
                        org.telegram.ui.Cells.k3 k3Var2 = uVar.a2;
                        if (!uVar.c2) {
                            TL_iv.RichMessage richMessage = uVar.e2;
                            if (richMessage == null) {
                                String trim = k3Var2.d.getText().toString().trim();
                                if (!TextUtils.isEmpty(trim)) {
                                    uVar.c2 = true;
                                    uVar.b2.setLoading(true);
                                    TLRPC.TL_messages_composeRichMessageWithAI tL_messages_composeRichMessageWithAI = new TLRPC.TL_messages_composeRichMessageWithAI();
                                    TL_aicompose.inputAiComposeToneSingleUse inputaicomposetonesingleuse = new TL_aicompose.inputAiComposeToneSingleUse();
                                    inputaicomposetonesingleuse.custom_prompt = trim;
                                    tL_messages_composeRichMessageWithAI.tone = inputaicomposetonesingleuse;
                                    uVar.d2 = ConnectionsManager.getInstance(uVar.T1).sendRequest(tL_messages_composeRichMessageWithAI, new ai.d1(uVar, 21));
                                    org.telegram.messenger.g0.v1(k3Var2.d);
                                    break;
                                }
                            } else {
                                z10 z10Var2 = uVar.U1;
                                if (z10Var2 != null) {
                                    z10Var2.a(richMessage);
                                }
                                uVar.dismiss();
                                break;
                            }
                        }
                        break;
                }
            }
        });
        this.b.addView(g10, c8.ja.d(-1, 48.0f, 87, 12.0f, 12.0f, 12.0f, 12.0f));
        ((ViewGroup.MarginLayoutParams) g10.getLayoutParams()).leftMargin += this.u0;
        ((ViewGroup.MarginLayoutParams) g10.getLayoutParams()).rightMargin += this.u0;
        v4.k kVar = new v4.k();
        kVar.m = false;
        kVar.C = false;
        kVar.o(er.h);
        kVar.n(350L);
        this.o1.setItemAnimator(kVar);
        uj0 uj0Var = this.o1;
        int i15 = this.u0;
        uj0Var.setPadding(i15, 0, i15, org.telegram.messenger.g0.L(72.0f));
        this.o1.setClipToPadding(false);
        this.V1.O(false);
        d1();
    }

    @Override // org.telegram.ui.Components.ja
    public final tj0 L0(uj0 uj0Var) {
        p41 p41Var = new p41(uj0Var, getContext(), this.T1, 0, true, new hi.q4(this, 27), this.J0);
        this.V1 = p41Var;
        return p41Var;
    }

    @Override // org.telegram.ui.Components.ja
    public final CharSequence O0() {
        return hd.M0(2131754060, null);
    }

    public final void d1() {
        TL_iv.RichMessage richMessage = this.e2;
        hi.d dVar = this.b2;
        if (richMessage != null) {
            dVar.setEnabled(true);
        } else {
            dVar.setEnabled(!TextUtils.isEmpty(this.a2.d.getText().toString().trim()));
        }
    }

    @Override // org.telegram.ui.ActionBar.u2, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.a2
    public final void dismiss() {
        if (this.d2 != 0) {
            ConnectionsManager.getInstance(this.T1).cancelRequest(this.d2, true);
            this.d2 = 0;
        }
        org.telegram.messenger.g0.v1(this.a2.d);
        super.dismiss();
    }

    @Override // org.telegram.ui.ActionBar.u2, android.app.Dialog
    public final void show() {
        super.show();
        org.telegram.messenger.g0.i3(new kg.j1(this, 22), 200L);
    }
}
