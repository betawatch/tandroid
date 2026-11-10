package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class nq extends ma {
    public final r60 S1;
    public final ArrayList T1;
    public final boolean U1;
    public final boolean V1;
    public final boolean W1;
    public boolean X1;
    public TLRPC.Peer Y1;
    public TLRPC.InputPeer Z1;
    public final org.telegram.ui.ActionBar.f2 a2;
    public final long b2;

    public nq(org.telegram.ui.ActionBar.f2 f2Var, ArrayList arrayList, long j3, r60 r60Var) {
        super(f2Var, false);
        boolean z9;
        String a02;
        TLRPC.Chat M0 = org.telegram.messenger.qp.s1(this.a).M0(Long.valueOf(-j3));
        this.a2 = f2Var;
        this.b2 = j3;
        this.u1 = 0.26f;
        ArrayList arrayList2 = new ArrayList(arrayList);
        this.T1 = arrayList2;
        this.S1 = r60Var;
        boolean W = org.telegram.messenger.t3.W(M0);
        this.W1 = W;
        this.Y1 = (TLRPC.Peer) arrayList2.get(0);
        final int i7 = 1;
        this.U1 = arrayList2.size() > 1;
        this.V1 = org.telegram.messenger.t3.w(14, M0);
        Context context = this.b.getContext();
        this.b.addView(new bi.ec(17, context, this), c8.ha.d(-1, 120.0f, 80, 0.0f, 0.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        textView.setGravity(17);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView.setSingleLine(true);
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setText(W ? org.telegram.messenger.id.a0(null, null, 2131743455, new Object[0]) : org.telegram.messenger.id.a0(null, null, 2131743324, new Object[0]));
        org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.Gi, null);
        int L = org.telegram.messenger.g0.L(8.0f);
        int i10 = org.telegram.ui.ActionBar.m6.Ci;
        int x02 = org.telegram.ui.ActionBar.m6.x0(null, i10, false);
        int i11 = org.telegram.ui.ActionBar.m6.d6;
        int o4 = i0.a.o(org.telegram.ui.ActionBar.m6.x0(null, i11, false), 120);
        org.telegram.ui.Cells.y k02 = org.telegram.ui.ActionBar.m6.k0(L, L, L, L, x02, o4, o4);
        org.telegram.ui.ActionBar.p6 M = org.telegram.ui.ActionBar.t6.M(i10);
        org.telegram.ui.ActionBar.p6 g10 = org.telegram.ui.ActionBar.t6.g(i11, 120);
        textView.setBackground(k02);
        org.telegram.ui.ActionBar.t6.j(textView, k02, M, g10, null);
        this.b.addView(textView, c8.ha.d(-1, 48.0f, 80, 16.0f, 0.0f, 16.0f, 60.0f));
        TextView textView2 = new TextView(context);
        textView2.setGravity(17);
        textView2.setEllipsize(truncateAt);
        textView2.setSingleLine(true);
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(org.telegram.messenger.g0.o());
        if (W) {
            z9 = false;
            a02 = org.telegram.messenger.id.a0(null, null, 2131743462, new Object[0]);
        } else {
            z9 = false;
            a02 = org.telegram.messenger.id.a0(null, null, 2131743341, new Object[0]);
        }
        textView2.setText(a02);
        textView2.setLetterSpacing(0.025f);
        org.telegram.ui.ActionBar.t6.U(textView2, i10, null);
        int L2 = org.telegram.messenger.g0.L(8.0f);
        int o10 = i0.a.o(org.telegram.ui.ActionBar.m6.x0(null, i10, z9), 120);
        org.telegram.ui.Cells.y k03 = org.telegram.ui.ActionBar.m6.k0(L2, L2, L2, L2, 0, o10, o10);
        org.telegram.ui.ActionBar.p6 g11 = org.telegram.ui.ActionBar.t6.g(i10, 120);
        textView2.setBackground(k03);
        org.telegram.ui.ActionBar.t6.j(textView2, k03, null, g11, null);
        this.b.addView(textView2, c8.ha.d(-1, 48.0f, 80, 16.0f, 0.0f, 16.0f, 6.0f));
        final int i12 = 0;
        textView.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.lq
            public final /* synthetic */ nq b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i12) {
                    case 0:
                        nq nqVar = this.b;
                        nqVar.Z1 = org.telegram.messenger.qp.s1(nqVar.a).j1(org.telegram.messenger.ij.B1(nqVar.Y1));
                        nqVar.dismiss();
                        break;
                    default:
                        nq nqVar2 = this.b;
                        nqVar2.Z1 = org.telegram.messenger.qp.s1(nqVar2.a).j1(org.telegram.messenger.ij.B1(nqVar2.Y1));
                        nqVar2.X1 = true;
                        nqVar2.dismiss();
                        break;
                }
            }
        });
        textView2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.lq
            public final /* synthetic */ nq b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i7) {
                    case 0:
                        nq nqVar = this.b;
                        nqVar.Z1 = org.telegram.messenger.qp.s1(nqVar.a).j1(org.telegram.messenger.ij.B1(nqVar.Y1));
                        nqVar.dismiss();
                        break;
                    default:
                        nq nqVar2 = this.b;
                        nqVar2.Z1 = org.telegram.messenger.qp.s1(nqVar2.a).j1(org.telegram.messenger.ij.B1(nqVar2.Y1));
                        nqVar2.X1 = true;
                        nqVar2.dismiss();
                        break;
                }
            }
        });
        pj0 pj0Var = this.n1;
        int i13 = this.t0;
        pj0Var.setPadding(i13, 0, i13, org.telegram.messenger.g0.L(120.0f));
        this.n1.setOnItemClickListener(new j(this, 4));
        N();
        b1();
    }

    @Override // org.telegram.ui.ActionBar.w2
    public final void K() {
        super.K();
        TLRPC.InputPeer inputPeer = this.Z1;
        if (inputPeer != null) {
            this.S1.a(inputPeer, this.T1.size() > 1, this.X1, false);
        }
    }

    @Override // org.telegram.ui.Components.ma
    public final oj0 L0(pj0 pj0Var) {
        return new mq(this);
    }

    @Override // org.telegram.ui.Components.ma
    public final CharSequence O0() {
        return this.W1 ? org.telegram.messenger.id.M0(2131744903, null) : org.telegram.messenger.id.M0(2131744900, null);
    }
}
