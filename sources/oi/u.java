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
import c8.ma;
import c8.ra;
import hi.e7;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.gd;
import org.telegram.messenger.mp;
import org.telegram.messenger.n10;
import org.telegram.messenger.ut;
import org.telegram.messenger.x10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_aicompose;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.q6;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Components.bk0;
import org.telegram.ui.Components.ck0;
import org.telegram.ui.Components.lr;
import org.telegram.ui.Components.sa;
import org.telegram.ui.Components.z41;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes4.dex */
public final class u extends sa {
    public final int T1;
    public final x10 U1;
    public z41 V1;
    public final FrameLayout W1;
    public final FrameLayout X1;
    public final ut Y1;
    public final FrameLayout Z1;
    public final org.telegram.ui.Cells.k3 a2;
    public final hi.d b2;
    public boolean c2;
    public int d2;
    public TL_iv.RichMessage e2;

    public u(int i7, Context context, x10 x10Var, i6 i6Var) {
        super(context, null, true, false, i6Var);
        this.T1 = i7;
        this.U1 = x10Var;
        int i10 = n6.a7;
        w0(i10);
        Q(i10);
        FrameLayout frameLayout = new FrameLayout(context);
        this.W1 = frameLayout;
        TextView textView = new TextView(context);
        textView.setText(gd.M0(2131754058, null));
        final int i11 = 1;
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        int i12 = n6.G6;
        u6.U(textView, i12, i6Var);
        textView.setGravity(19);
        frameLayout.addView(textView, ma.d(-1, 56.0f, 51, 22.0f, 6.0f, 56.0f, 0.0f));
        this.D1 = org.telegram.messenger.g0.L(-8.0f);
        ImageView e10 = n10.e(context, R.drawable.ic_close_white);
        e10.setScaleType(ImageView.ScaleType.CENTER);
        u6.s(e10, i12, i6Var, PorterDuff.Mode.SRC_IN);
        ra.a(e10);
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
                                    uVar.d2 = ConnectionsManager.getInstance(uVar.T1).sendRequest(tL_messages_composeRichMessageWithAI, new ai.e1(uVar, 23));
                                    org.telegram.messenger.g0.v1(k3Var.d);
                                    break;
                                }
                            } else {
                                x10 x10Var2 = uVar.U1;
                                if (x10Var2 != null) {
                                    x10Var2.a(richMessage);
                                }
                                uVar.dismiss();
                                break;
                            }
                        }
                        break;
                }
            }
        });
        frameLayout.addView(e10, ma.d(48, 48.0f, 53, 0.0f, 10.0f, 12.0f, 0.0f));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.X1 = frameLayout2;
        ut utVar = new ut(i7, context, i6Var);
        this.Y1 = utVar;
        utVar.setPadding(org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(12.0f));
        int L = org.telegram.messenger.g0.L(12.0f);
        int i14 = n6.d6;
        ShapeDrawable d02 = n6.d0(L, n6.w0(i14, i6Var));
        q6 M = u6.M(i14);
        utVar.setBackground(d02);
        u6.j(utVar, d02, M, null, i6Var);
        frameLayout2.addView(utVar, ma.c(-2.0f, -1));
        frameLayout2.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f), 0);
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.Z1 = frameLayout3;
        org.telegram.ui.Cells.k3 k3Var = new org.telegram.ui.Cells.k3(context, gd.M0(2131754056, null), true, false, ((org.telegram.messenger.j0) mp.u1(i7).A7.W.b).c, i6Var);
        this.a2 = k3Var;
        org.telegram.ui.Cells.i3 i3Var = k3Var.d;
        i3Var.setImeOptions(6);
        i3Var.setMaxLines(5);
        ShapeDrawable d03 = n6.d0(org.telegram.messenger.g0.L(20.0f), n6.w0(i14, i6Var));
        q6 M2 = u6.M(i14);
        k3Var.setBackground(d03);
        u6.j(k3Var, d03, M2, null, i6Var);
        i3Var.addTextChangedListener(new t(this));
        frameLayout3.addView(k3Var, ma.c(-2.0f, -1));
        frameLayout3.setPadding(org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f), 0);
        hi.d g10 = n10.g(24, context, i6Var, true);
        this.b2 = g10;
        g10.i(gd.M0(2131754057, null), false, true);
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
                                    uVar.d2 = ConnectionsManager.getInstance(uVar.T1).sendRequest(tL_messages_composeRichMessageWithAI, new ai.e1(uVar, 23));
                                    org.telegram.messenger.g0.v1(k3Var2.d);
                                    break;
                                }
                            } else {
                                x10 x10Var2 = uVar.U1;
                                if (x10Var2 != null) {
                                    x10Var2.a(richMessage);
                                }
                                uVar.dismiss();
                                break;
                            }
                        }
                        break;
                }
            }
        });
        this.b.addView(g10, ma.d(-1, 48.0f, 87, 12.0f, 12.0f, 12.0f, 12.0f));
        ((ViewGroup.MarginLayoutParams) g10.getLayoutParams()).leftMargin += this.u0;
        ((ViewGroup.MarginLayoutParams) g10.getLayoutParams()).rightMargin += this.u0;
        v4.k kVar = new v4.k();
        kVar.m = false;
        kVar.C = false;
        kVar.o(lr.h);
        kVar.n(350L);
        this.o1.setItemAnimator(kVar);
        ck0 ck0Var = this.o1;
        int i15 = this.u0;
        ck0Var.setPadding(i15, 0, i15, org.telegram.messenger.g0.L(72.0f));
        this.o1.setClipToPadding(false);
        this.V1.O(false);
        e1();
    }

    @Override // org.telegram.ui.Components.sa
    public final bk0 M0(ck0 ck0Var) {
        z41 z41Var = new z41(ck0Var, getContext(), this.T1, 0, true, new e7(this, 27), this.J0);
        this.V1 = z41Var;
        return z41Var;
    }

    @Override // org.telegram.ui.Components.sa
    public final CharSequence P0() {
        return gd.M0(2131754058, null);
    }

    @Override // org.telegram.ui.ActionBar.x2, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.d2
    public final void dismiss() {
        if (this.d2 != 0) {
            ConnectionsManager.getInstance(this.T1).cancelRequest(this.d2, true);
            this.d2 = 0;
        }
        org.telegram.messenger.g0.v1(this.a2.d);
        super.dismiss();
    }

    public final void e1() {
        TL_iv.RichMessage richMessage = this.e2;
        hi.d dVar = this.b2;
        if (richMessage != null) {
            dVar.setEnabled(true);
        } else {
            dVar.setEnabled(!TextUtils.isEmpty(this.a2.d.getText().toString().trim()));
        }
    }

    @Override // org.telegram.ui.ActionBar.x2, android.app.Dialog
    public final void show() {
        super.show();
        org.telegram.messenger.g0.h3(new kg.j0(this, 26), 200L);
    }
}
