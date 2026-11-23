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
import hi.d7;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.hd;
import org.telegram.messenger.np;
import org.telegram.messenger.o10;
import org.telegram.messenger.vt;
import org.telegram.messenger.y10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_aicompose;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.c51;
import org.telegram.ui.Components.dk0;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.sa;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes4.dex */
public final class v extends sa {
    public final int T1;
    public final y10 U1;
    public c51 V1;
    public final FrameLayout W1;
    public final FrameLayout X1;
    public final vt Y1;
    public final FrameLayout Z1;
    public final org.telegram.ui.Cells.l3 a2;
    public final hi.e b2;
    public boolean c2;
    public int d2;
    public TL_iv.RichMessage e2;

    public v(int i7, Context context, y10 y10Var, h6 h6Var) {
        super(context, null, true, false, h6Var);
        this.T1 = i7;
        this.U1 = y10Var;
        int i10 = m6.a7;
        w0(i10);
        Q(i10);
        FrameLayout frameLayout = new FrameLayout(context);
        this.W1 = frameLayout;
        TextView textView = new TextView(context);
        textView.setText(hd.N0(2131754057, null));
        final int i11 = 1;
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        int i12 = m6.G6;
        t6.U(textView, i12, h6Var);
        textView.setGravity(19);
        frameLayout.addView(textView, ma.d(-1, 56.0f, 51, 22.0f, 6.0f, 56.0f, 0.0f));
        this.D1 = org.telegram.messenger.g0.L(-8.0f);
        ImageView e10 = o10.e(context, R.drawable.ic_close_white);
        e10.setScaleType(ImageView.ScaleType.CENTER);
        t6.s(e10, i12, h6Var, PorterDuff.Mode.SRC_IN);
        ra.a(e10);
        final int i13 = 0;
        e10.setOnClickListener(new View.OnClickListener(this) { // from class: oi.s
            public final /* synthetic */ v b;

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
                        v vVar = this.b;
                        org.telegram.ui.Cells.l3 l3Var = vVar.a2;
                        if (!vVar.c2) {
                            TL_iv.RichMessage richMessage = vVar.e2;
                            if (richMessage == null) {
                                String trim = l3Var.d.getText().toString().trim();
                                if (!TextUtils.isEmpty(trim)) {
                                    vVar.c2 = true;
                                    vVar.b2.setLoading(true);
                                    TLRPC.TL_messages_composeRichMessageWithAI tL_messages_composeRichMessageWithAI = new TLRPC.TL_messages_composeRichMessageWithAI();
                                    TL_aicompose.inputAiComposeToneSingleUse inputaicomposetonesingleuse = new TL_aicompose.inputAiComposeToneSingleUse();
                                    inputaicomposetonesingleuse.custom_prompt = trim;
                                    tL_messages_composeRichMessageWithAI.tone = inputaicomposetonesingleuse;
                                    vVar.d2 = ConnectionsManager.getInstance(vVar.T1).sendRequest(tL_messages_composeRichMessageWithAI, new ai.g1(vVar, 23));
                                    org.telegram.messenger.g0.v1(l3Var.d);
                                    break;
                                }
                            } else {
                                y10 y10Var2 = vVar.U1;
                                if (y10Var2 != null) {
                                    y10Var2.a(richMessage);
                                }
                                vVar.dismiss();
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
        vt vtVar = new vt(i7, context, h6Var);
        this.Y1 = vtVar;
        vtVar.setPadding(org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(12.0f));
        int L = org.telegram.messenger.g0.L(12.0f);
        int i14 = m6.d6;
        ShapeDrawable d02 = m6.d0(L, m6.w0(i14, h6Var));
        p6 M = t6.M(i14);
        vtVar.setBackground(d02);
        t6.j(vtVar, d02, M, null, h6Var);
        frameLayout2.addView(vtVar, ma.c(-2.0f, -1));
        frameLayout2.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f), 0);
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.Z1 = frameLayout3;
        org.telegram.ui.Cells.l3 l3Var = new org.telegram.ui.Cells.l3(context, hd.N0(2131754055, null), true, false, ((org.telegram.messenger.j0) np.u1(i7).A7.W.b).c, h6Var);
        this.a2 = l3Var;
        org.telegram.ui.Cells.j3 j3Var = l3Var.d;
        j3Var.setImeOptions(6);
        j3Var.setMaxLines(5);
        ShapeDrawable d03 = m6.d0(org.telegram.messenger.g0.L(20.0f), m6.w0(i14, h6Var));
        p6 M2 = t6.M(i14);
        l3Var.setBackground(d03);
        t6.j(l3Var, d03, M2, null, h6Var);
        j3Var.addTextChangedListener(new u(this));
        frameLayout3.addView(l3Var, ma.c(-2.0f, -1));
        frameLayout3.setPadding(org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f), 0);
        hi.e g10 = o10.g(24, context, h6Var, true);
        this.b2 = g10;
        g10.i(hd.N0(2131754056, null), false, true);
        g10.setOnClickListener(new View.OnClickListener(this) { // from class: oi.s
            public final /* synthetic */ v b;

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
                        v vVar = this.b;
                        org.telegram.ui.Cells.l3 l3Var2 = vVar.a2;
                        if (!vVar.c2) {
                            TL_iv.RichMessage richMessage = vVar.e2;
                            if (richMessage == null) {
                                String trim = l3Var2.d.getText().toString().trim();
                                if (!TextUtils.isEmpty(trim)) {
                                    vVar.c2 = true;
                                    vVar.b2.setLoading(true);
                                    TLRPC.TL_messages_composeRichMessageWithAI tL_messages_composeRichMessageWithAI = new TLRPC.TL_messages_composeRichMessageWithAI();
                                    TL_aicompose.inputAiComposeToneSingleUse inputaicomposetonesingleuse = new TL_aicompose.inputAiComposeToneSingleUse();
                                    inputaicomposetonesingleuse.custom_prompt = trim;
                                    tL_messages_composeRichMessageWithAI.tone = inputaicomposetonesingleuse;
                                    vVar.d2 = ConnectionsManager.getInstance(vVar.T1).sendRequest(tL_messages_composeRichMessageWithAI, new ai.g1(vVar, 23));
                                    org.telegram.messenger.g0.v1(l3Var2.d);
                                    break;
                                }
                            } else {
                                y10 y10Var2 = vVar.U1;
                                if (y10Var2 != null) {
                                    y10Var2.a(richMessage);
                                }
                                vVar.dismiss();
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
        kVar.o(nr.h);
        kVar.n(350L);
        this.o1.setItemAnimator(kVar);
        ek0 ek0Var = this.o1;
        int i15 = this.u0;
        ek0Var.setPadding(i15, 0, i15, org.telegram.messenger.g0.L(72.0f));
        this.o1.setClipToPadding(false);
        this.V1.O(false);
        e1();
    }

    @Override // org.telegram.ui.Components.sa
    public final dk0 M0(ek0 ek0Var) {
        c51 c51Var = new c51(ek0Var, getContext(), this.T1, 0, true, new d7(this, 27), this.J0);
        this.V1 = c51Var;
        return c51Var;
    }

    @Override // org.telegram.ui.Components.sa
    public final CharSequence P0() {
        return hd.N0(2131754057, null);
    }

    @Override // org.telegram.ui.ActionBar.w2, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.c2
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
        hi.e eVar = this.b2;
        if (richMessage != null) {
            eVar.setEnabled(true);
        } else {
            eVar.setEnabled(!TextUtils.isEmpty(this.a2.d.getText().toString().trim()));
        }
    }

    @Override // org.telegram.ui.ActionBar.w2, android.app.Dialog
    public final void show() {
        super.show();
        org.telegram.messenger.g0.h3(new kg.i0(this, 26), 200L);
    }
}
