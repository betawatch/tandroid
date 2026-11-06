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
import org.telegram.messenger.hd;
import org.telegram.messenger.qp;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_aicompose;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.na;
import org.telegram.ui.Components.oj0;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.xq;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes4.dex */
public final class v extends na {
    public final int P1;
    public final c20 Q1;
    public l41 R1;
    public final FrameLayout S1;
    public final FrameLayout T1;
    public final au U1;
    public final FrameLayout V1;
    public final org.telegram.ui.Cells.k3 W1;
    public final fi.d X1;
    public boolean Y1;
    public int Z1;
    public TL_iv.RichMessage a2;

    public v(int i7, Context context, c20 c20Var, f6 f6Var) {
        super(context, null, true, false, f6Var);
        this.P1 = i7;
        this.Q1 = c20Var;
        int i10 = k6.a7;
        w0(i10);
        P(i10);
        FrameLayout frameLayout = new FrameLayout(context);
        this.S1 = frameLayout;
        TextView textView = new TextView(context);
        textView.setText(hd.M0(2131754060, null));
        final int i11 = 1;
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        int i12 = k6.G6;
        r6.V(textView, i12, f6Var);
        textView.setGravity(19);
        frameLayout.addView(textView, ha.d(-1, 56.0f, 51, 22.0f, 6.0f, 56.0f, 0.0f));
        this.z1 = org.telegram.messenger.g0.L(-8.0f);
        ImageView e10 = org.telegram.messenger.camera.q.e(context, R.drawable.ic_close_white);
        e10.setScaleType(ImageView.ScaleType.CENTER);
        r6.t(e10, i12, f6Var, PorterDuff.Mode.SRC_IN);
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
                        org.telegram.ui.Cells.k3 k3Var = vVar.W1;
                        if (!vVar.Y1) {
                            TL_iv.RichMessage richMessage = vVar.a2;
                            if (richMessage == null) {
                                String trim = k3Var.d.getText().toString().trim();
                                if (!TextUtils.isEmpty(trim)) {
                                    vVar.Y1 = true;
                                    vVar.X1.setLoading(true);
                                    TLRPC.TL_messages_composeRichMessageWithAI tL_messages_composeRichMessageWithAI = new TLRPC.TL_messages_composeRichMessageWithAI();
                                    TL_aicompose.inputAiComposeToneSingleUse inputaicomposetonesingleuse = new TL_aicompose.inputAiComposeToneSingleUse();
                                    inputaicomposetonesingleuse.custom_prompt = trim;
                                    tL_messages_composeRichMessageWithAI.tone = inputaicomposetonesingleuse;
                                    vVar.Z1 = ConnectionsManager.getInstance(vVar.P1).sendRequest(tL_messages_composeRichMessageWithAI, new bi.j0(vVar, 20));
                                    org.telegram.messenger.g0.v1(k3Var.d);
                                    break;
                                }
                            } else {
                                c20 c20Var2 = vVar.Q1;
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
        this.T1 = frameLayout2;
        au auVar = new au(i7, context, f6Var);
        this.U1 = auVar;
        auVar.setPadding(org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(12.0f));
        int L = org.telegram.messenger.g0.L(12.0f);
        int i14 = k6.d6;
        ShapeDrawable d02 = k6.d0(L, k6.w0(i14, f6Var));
        n6 N = r6.N(i14);
        auVar.setBackground(d02);
        r6.k(auVar, d02, N, null, f6Var);
        frameLayout2.addView(auVar, ha.c(-2.0f, -1));
        frameLayout2.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f), 0);
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.V1 = frameLayout3;
        org.telegram.ui.Cells.k3 k3Var = new org.telegram.ui.Cells.k3(context, hd.M0(2131754058, null), true, false, ((org.telegram.messenger.j0) qp.s1(i7).x7.R.b).c, f6Var);
        this.W1 = k3Var;
        org.telegram.ui.Cells.i3 i3Var = k3Var.d;
        i3Var.setImeOptions(6);
        i3Var.setMaxLines(5);
        ShapeDrawable d03 = k6.d0(org.telegram.messenger.g0.L(20.0f), k6.w0(i14, f6Var));
        n6 N2 = r6.N(i14);
        k3Var.setBackground(d03);
        r6.k(k3Var, d03, N2, null, f6Var);
        i3Var.addTextChangedListener(new u(this));
        frameLayout3.addView(k3Var, ha.c(-2.0f, -1));
        frameLayout3.setPadding(org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f), 0);
        fi.d h = org.telegram.messenger.k5.h(24, context, f6Var, true);
        this.X1 = h;
        h.i(hd.M0(2131754059, null), false, true);
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
                        org.telegram.ui.Cells.k3 k3Var2 = vVar.W1;
                        if (!vVar.Y1) {
                            TL_iv.RichMessage richMessage = vVar.a2;
                            if (richMessage == null) {
                                String trim = k3Var2.d.getText().toString().trim();
                                if (!TextUtils.isEmpty(trim)) {
                                    vVar.Y1 = true;
                                    vVar.X1.setLoading(true);
                                    TLRPC.TL_messages_composeRichMessageWithAI tL_messages_composeRichMessageWithAI = new TLRPC.TL_messages_composeRichMessageWithAI();
                                    TL_aicompose.inputAiComposeToneSingleUse inputaicomposetonesingleuse = new TL_aicompose.inputAiComposeToneSingleUse();
                                    inputaicomposetonesingleuse.custom_prompt = trim;
                                    tL_messages_composeRichMessageWithAI.tone = inputaicomposetonesingleuse;
                                    vVar.Z1 = ConnectionsManager.getInstance(vVar.P1).sendRequest(tL_messages_composeRichMessageWithAI, new bi.j0(vVar, 20));
                                    org.telegram.messenger.g0.v1(k3Var2.d);
                                    break;
                                }
                            } else {
                                c20 c20Var2 = vVar.Q1;
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
        kVar.o(xq.h);
        kVar.n(350L);
        this.k1.setItemAnimator(kVar);
        pj0 pj0Var = this.k1;
        int i15 = this.t0;
        pj0Var.setPadding(i15, 0, i15, org.telegram.messenger.g0.L(72.0f));
        this.k1.setClipToPadding(false);
        this.R1.O(false);
        d1();
    }

    @Override // org.telegram.ui.Components.na
    public final oj0 L0(pj0 pj0Var) {
        l41 l41Var = new l41(pj0Var, getContext(), this.P1, 0, true, new hi.u1(this, 17), this.I0);
        this.R1 = l41Var;
        return l41Var;
    }

    @Override // org.telegram.ui.Components.na
    public final CharSequence O0() {
        return hd.M0(2131754060, null);
    }

    public final void d1() {
        TL_iv.RichMessage richMessage = this.a2;
        fi.d dVar = this.X1;
        if (richMessage != null) {
            dVar.setEnabled(true);
        } else {
            dVar.setEnabled(!TextUtils.isEmpty(this.W1.d.getText().toString().trim()));
        }
    }

    @Override // org.telegram.ui.ActionBar.v2, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.b2
    public final void dismiss() {
        if (this.Z1 != 0) {
            ConnectionsManager.getInstance(this.P1).cancelRequest(this.Z1, true);
            this.Z1 = 0;
        }
        org.telegram.messenger.g0.v1(this.W1.d);
        super.dismiss();
    }

    @Override // org.telegram.ui.ActionBar.v2, android.app.Dialog
    public final void show() {
        super.show();
        org.telegram.messenger.g0.i3(new l2.w(this, 4), 200L);
    }
}
