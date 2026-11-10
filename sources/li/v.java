package li;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.ShapeDrawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import c8.ha;
import c8.ka;
import org.telegram.messenger.au;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.c20;
import org.telegram.messenger.id;
import org.telegram.messenger.qp;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_aicompose;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.ma;
import org.telegram.ui.Components.oj0;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.wq;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes4.dex */
public final class v extends ma {
    public final int S1;
    public final c20 T1;
    public m41 U1;
    public final FrameLayout V1;
    public final FrameLayout W1;
    public final au X1;
    public final FrameLayout Y1;
    public final org.telegram.ui.Cells.k3 Z1;
    public final fi.d a2;
    public boolean b2;
    public int c2;
    public TL_iv.RichMessage d2;

    public v(int i7, Context context, c20 c20Var, h6 h6Var) {
        super(context, null, true, false, h6Var);
        this.S1 = i7;
        this.T1 = c20Var;
        int i10 = m6.a7;
        w0(i10);
        P(i10);
        FrameLayout frameLayout = new FrameLayout(context);
        this.V1 = frameLayout;
        TextView textView = new TextView(context);
        textView.setText(id.M0(2131754060, null));
        final int i11 = 1;
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        int i12 = m6.G6;
        t6.U(textView, i12, h6Var);
        textView.setGravity(19);
        frameLayout.addView(textView, ha.d(-1, 56.0f, 51, 22.0f, 6.0f, 56.0f, 0.0f));
        this.C1 = org.telegram.messenger.g0.L(-8.0f);
        ImageView e10 = org.telegram.messenger.camera.q.e(context, R.drawable.ic_close_white);
        e10.setScaleType(ImageView.ScaleType.CENTER);
        t6.s(e10, i12, h6Var, PorterDuff.Mode.SRC_IN);
        ka.a(e10);
        final int i13 = 0;
        e10.setOnClickListener(new View.OnClickListener(this) { // from class: li.t
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
                        org.telegram.ui.Cells.k3 k3Var = vVar.Z1;
                        if (!vVar.b2) {
                            TL_iv.RichMessage richMessage = vVar.d2;
                            if (richMessage == null) {
                                String trim = k3Var.d.getText().toString().trim();
                                if (!TextUtils.isEmpty(trim)) {
                                    vVar.b2 = true;
                                    vVar.a2.setLoading(true);
                                    TLRPC.TL_messages_composeRichMessageWithAI tL_messages_composeRichMessageWithAI = new TLRPC.TL_messages_composeRichMessageWithAI();
                                    TL_aicompose.inputAiComposeToneSingleUse inputaicomposetonesingleuse = new TL_aicompose.inputAiComposeToneSingleUse();
                                    inputaicomposetonesingleuse.custom_prompt = trim;
                                    tL_messages_composeRichMessageWithAI.tone = inputaicomposetonesingleuse;
                                    vVar.c2 = ConnectionsManager.getInstance(vVar.S1).sendRequest(tL_messages_composeRichMessageWithAI, new bi.j0(vVar, 20));
                                    org.telegram.messenger.g0.v1(k3Var.d);
                                    break;
                                }
                            } else {
                                c20 c20Var2 = vVar.T1;
                                if (c20Var2 != null) {
                                    c20Var2.a(richMessage);
                                }
                                vVar.dismiss();
                                break;
                            }
                        }
                        break;
                }
            }
        });
        frameLayout.addView(e10, ha.d(48, 48.0f, 53, 0.0f, 10.0f, 12.0f, 0.0f));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.W1 = frameLayout2;
        au auVar = new au(i7, context, h6Var);
        this.X1 = auVar;
        auVar.setPadding(org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(12.0f));
        int L = org.telegram.messenger.g0.L(12.0f);
        int i14 = m6.d6;
        ShapeDrawable d02 = m6.d0(L, m6.w0(i14, h6Var));
        p6 M = t6.M(i14);
        auVar.setBackground(d02);
        t6.j(auVar, d02, M, null, h6Var);
        frameLayout2.addView(auVar, ha.c(-2.0f, -1));
        frameLayout2.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f), 0);
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.Y1 = frameLayout3;
        org.telegram.ui.Cells.k3 k3Var = new org.telegram.ui.Cells.k3(context, id.M0(2131754058, null), true, false, ((org.telegram.messenger.j0) qp.s1(i7).x7.R.b).c, h6Var);
        this.Z1 = k3Var;
        org.telegram.ui.Cells.i3 i3Var = k3Var.d;
        i3Var.setImeOptions(6);
        i3Var.setMaxLines(5);
        ShapeDrawable d03 = m6.d0(org.telegram.messenger.g0.L(20.0f), m6.w0(i14, h6Var));
        p6 M2 = t6.M(i14);
        k3Var.setBackground(d03);
        t6.j(k3Var, d03, M2, null, h6Var);
        i3Var.addTextChangedListener(new u(this));
        frameLayout3.addView(k3Var, ha.c(-2.0f, -1));
        frameLayout3.setPadding(org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f), 0);
        fi.d h = org.telegram.messenger.k5.h(24, context, h6Var, true);
        this.a2 = h;
        h.i(id.M0(2131754059, null), false, true);
        h.setOnClickListener(new View.OnClickListener(this) { // from class: li.t
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
                        org.telegram.ui.Cells.k3 k3Var2 = vVar.Z1;
                        if (!vVar.b2) {
                            TL_iv.RichMessage richMessage = vVar.d2;
                            if (richMessage == null) {
                                String trim = k3Var2.d.getText().toString().trim();
                                if (!TextUtils.isEmpty(trim)) {
                                    vVar.b2 = true;
                                    vVar.a2.setLoading(true);
                                    TLRPC.TL_messages_composeRichMessageWithAI tL_messages_composeRichMessageWithAI = new TLRPC.TL_messages_composeRichMessageWithAI();
                                    TL_aicompose.inputAiComposeToneSingleUse inputaicomposetonesingleuse = new TL_aicompose.inputAiComposeToneSingleUse();
                                    inputaicomposetonesingleuse.custom_prompt = trim;
                                    tL_messages_composeRichMessageWithAI.tone = inputaicomposetonesingleuse;
                                    vVar.c2 = ConnectionsManager.getInstance(vVar.S1).sendRequest(tL_messages_composeRichMessageWithAI, new bi.j0(vVar, 20));
                                    org.telegram.messenger.g0.v1(k3Var2.d);
                                    break;
                                }
                            } else {
                                c20 c20Var2 = vVar.T1;
                                if (c20Var2 != null) {
                                    c20Var2.a(richMessage);
                                }
                                vVar.dismiss();
                                break;
                            }
                        }
                        break;
                }
            }
        });
        this.b.addView(h, ha.d(-1, 48.0f, 87, 12.0f, 12.0f, 12.0f, 12.0f));
        ((ViewGroup.MarginLayoutParams) h.getLayoutParams()).leftMargin += this.t0;
        ((ViewGroup.MarginLayoutParams) h.getLayoutParams()).rightMargin += this.t0;
        v4.k kVar = new v4.k();
        kVar.m = false;
        kVar.C = false;
        kVar.o(wq.h);
        kVar.n(350L);
        this.n1.setItemAnimator(kVar);
        pj0 pj0Var = this.n1;
        int i15 = this.t0;
        pj0Var.setPadding(i15, 0, i15, org.telegram.messenger.g0.L(72.0f));
        this.n1.setClipToPadding(false);
        this.U1.O(false);
        d1();
    }

    @Override // org.telegram.ui.Components.ma
    public final oj0 L0(pj0 pj0Var) {
        m41 m41Var = new m41(pj0Var, getContext(), this.S1, 0, true, new hi.u1(this, 17), this.I0);
        this.U1 = m41Var;
        return m41Var;
    }

    @Override // org.telegram.ui.Components.ma
    public final CharSequence O0() {
        return id.M0(2131754060, null);
    }

    public final void d1() {
        TL_iv.RichMessage richMessage = this.d2;
        fi.d dVar = this.a2;
        if (richMessage != null) {
            dVar.setEnabled(true);
        } else {
            dVar.setEnabled(!TextUtils.isEmpty(this.Z1.d.getText().toString().trim()));
        }
    }

    @Override // org.telegram.ui.ActionBar.w2, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.b2
    public final void dismiss() {
        if (this.c2 != 0) {
            ConnectionsManager.getInstance(this.S1).cancelRequest(this.c2, true);
            this.c2 = 0;
        }
        org.telegram.messenger.g0.v1(this.Z1.d);
        super.dismiss();
    }

    @Override // org.telegram.ui.ActionBar.w2, android.app.Dialog
    public final void show() {
        super.show();
        org.telegram.messenger.g0.i3(new l2.a0(this, 3), 200L);
    }
}
