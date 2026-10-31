package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class yq extends ha {
    public final i70 P1;
    public final ArrayList Q1;
    public final boolean R1;
    public final boolean S1;
    public final boolean T1;
    public boolean U1;
    public TLRPC.Peer V1;
    public TLRPC.InputPeer W1;
    public final org.telegram.ui.ActionBar.k2 X1;
    public final long Y1;

    public yq(org.telegram.ui.ActionBar.k2 k2Var, ArrayList arrayList, long j10, i70 i70Var) {
        super(k2Var, false);
        boolean z10;
        String a02;
        TLRPC.Chat L0 = org.telegram.messenger.vp.r1(this.a).L0(Long.valueOf(-j10));
        this.X1 = k2Var;
        this.Y1 = j10;
        this.r1 = 0.26f;
        ArrayList arrayList2 = new ArrayList(arrayList);
        this.Q1 = arrayList2;
        this.P1 = i70Var;
        boolean W = org.telegram.messenger.w3.W(L0);
        this.T1 = W;
        this.V1 = (TLRPC.Peer) arrayList2.get(0);
        final int i10 = 1;
        this.R1 = arrayList2.size() > 1;
        this.S1 = org.telegram.messenger.w3.w(14, L0);
        Context context = this.b.getContext();
        this.b.addView(new bi.t0(this, context, 12), w7.b6.d(-1, 120.0f, 80, 0.0f, 0.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        textView.setGravity(17);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView.setSingleLine(true);
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(org.telegram.messenger.i0.o());
        textView.setText(W ? org.telegram.messenger.cd.a0(null, null, 2131743481, new Object[0]) : org.telegram.messenger.cd.a0(null, null, 2131743350, new Object[0]));
        org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.Gi, null);
        int L = org.telegram.messenger.i0.L(8.0f);
        int i11 = org.telegram.ui.ActionBar.t6.Ci;
        int x02 = org.telegram.ui.ActionBar.t6.x0(null, i11, false);
        int i12 = org.telegram.ui.ActionBar.t6.d6;
        int o10 = i0.b.o(org.telegram.ui.ActionBar.t6.x0(null, i12, false), 120);
        org.telegram.ui.Cells.y k02 = org.telegram.ui.ActionBar.t6.k0(L, L, L, L, x02, o10, o10);
        org.telegram.ui.ActionBar.w6 N = org.telegram.ui.ActionBar.a7.N(i11);
        org.telegram.ui.ActionBar.w6 h = org.telegram.ui.ActionBar.a7.h(i12, 120);
        textView.setBackground(k02);
        org.telegram.ui.ActionBar.a7.k(textView, k02, N, h, null);
        this.b.addView(textView, w7.b6.d(-1, 48.0f, 80, 16.0f, 0.0f, 16.0f, 60.0f));
        TextView textView2 = new TextView(context);
        textView2.setGravity(17);
        textView2.setEllipsize(truncateAt);
        textView2.setSingleLine(true);
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(org.telegram.messenger.i0.o());
        if (W) {
            z10 = false;
            a02 = org.telegram.messenger.cd.a0(null, null, 2131743488, new Object[0]);
        } else {
            z10 = false;
            a02 = org.telegram.messenger.cd.a0(null, null, 2131743367, new Object[0]);
        }
        textView2.setText(a02);
        textView2.setLetterSpacing(0.025f);
        org.telegram.ui.ActionBar.a7.V(textView2, i11, null);
        int L2 = org.telegram.messenger.i0.L(8.0f);
        int o11 = i0.b.o(org.telegram.ui.ActionBar.t6.x0(null, i11, z10), 120);
        org.telegram.ui.Cells.y k03 = org.telegram.ui.ActionBar.t6.k0(L2, L2, L2, L2, 0, o11, o11);
        org.telegram.ui.ActionBar.w6 h10 = org.telegram.ui.ActionBar.a7.h(i11, 120);
        textView2.setBackground(k03);
        org.telegram.ui.ActionBar.a7.k(textView2, k03, null, h10, null);
        this.b.addView(textView2, w7.b6.d(-1, 48.0f, 80, 16.0f, 0.0f, 16.0f, 6.0f));
        final int i13 = 0;
        textView.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.wq
            public final /* synthetic */ yq b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i13) {
                    case 0:
                        yq yqVar = this.b;
                        yqVar.W1 = org.telegram.messenger.vp.r1(yqVar.a).i1(org.telegram.messenger.jj.C1(yqVar.V1));
                        yqVar.dismiss();
                        break;
                    default:
                        yq yqVar2 = this.b;
                        yqVar2.W1 = org.telegram.messenger.vp.r1(yqVar2.a).i1(org.telegram.messenger.jj.C1(yqVar2.V1));
                        yqVar2.U1 = true;
                        yqVar2.dismiss();
                        break;
                }
            }
        });
        textView2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.wq
            public final /* synthetic */ yq b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        yq yqVar = this.b;
                        yqVar.W1 = org.telegram.messenger.vp.r1(yqVar.a).i1(org.telegram.messenger.jj.C1(yqVar.V1));
                        yqVar.dismiss();
                        break;
                    default:
                        yq yqVar2 = this.b;
                        yqVar2.W1 = org.telegram.messenger.vp.r1(yqVar2.a).i1(org.telegram.messenger.jj.C1(yqVar2.V1));
                        yqVar2.U1 = true;
                        yqVar2.dismiss();
                        break;
                }
            }
        });
        tk0 tk0Var = this.k1;
        int i14 = this.t0;
        tk0Var.setPadding(i14, 0, i14, org.telegram.messenger.i0.L(120.0f));
        this.k1.setOnItemClickListener(new k(this, 4));
        O();
        b1();
    }

    @Override // org.telegram.ui.ActionBar.z2
    public final void L() {
        super.L();
        TLRPC.InputPeer inputPeer = this.W1;
        if (inputPeer != null) {
            this.P1.a(inputPeer, this.Q1.size() > 1, this.U1, false);
        }
    }

    @Override // org.telegram.ui.Components.ha
    public final sk0 L0(tk0 tk0Var) {
        return new xq(this);
    }

    @Override // org.telegram.ui.Components.ha
    public final CharSequence O0() {
        return this.T1 ? org.telegram.messenger.cd.L0(2131744921, null) : org.telegram.messenger.cd.L0(2131744918, null);
    }
}
