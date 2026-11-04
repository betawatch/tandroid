package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class oq extends ma {
    public final m60 Q1;
    public final ArrayList R1;
    public final boolean S1;
    public final boolean T1;
    public final boolean U1;
    public boolean V1;
    public TLRPC.Peer W1;
    public TLRPC.InputPeer X1;
    public final org.telegram.ui.ActionBar.d2 Y1;
    public final long Z1;

    public oq(org.telegram.ui.ActionBar.d2 d2Var, ArrayList arrayList, long j10, m60 m60Var) {
        super(d2Var, false);
        boolean z10;
        String a02;
        TLRPC.Chat M0 = org.telegram.messenger.hp.s1(this.a).M0(Long.valueOf(-j10));
        this.Y1 = d2Var;
        this.Z1 = j10;
        this.s1 = 0.26f;
        ArrayList arrayList2 = new ArrayList(arrayList);
        this.R1 = arrayList2;
        this.Q1 = m60Var;
        boolean W = org.telegram.messenger.t3.W(M0);
        this.U1 = W;
        this.W1 = (TLRPC.Peer) arrayList2.get(0);
        final int i3 = 1;
        this.S1 = arrayList2.size() > 1;
        this.T1 = org.telegram.messenger.t3.w(14, M0);
        Context context = this.b.getContext();
        this.b.addView(new ai.x2(18, context, this), b8.mf.d(-1, 120.0f, 80, 0.0f, 0.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        textView.setGravity(17);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView.setSingleLine(true);
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setText(W ? org.telegram.messenger.bd.a0(null, null, 2131743465, new Object[0]) : org.telegram.messenger.bd.a0(null, null, 2131743334, new Object[0]));
        org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.Gi, null);
        int L = org.telegram.messenger.g0.L(8.0f);
        int i10 = org.telegram.ui.ActionBar.k6.Ci;
        int x02 = org.telegram.ui.ActionBar.k6.x0(null, i10, false);
        int i11 = org.telegram.ui.ActionBar.k6.d6;
        int o10 = i0.a.o(org.telegram.ui.ActionBar.k6.x0(null, i11, false), 120);
        org.telegram.ui.Cells.y k02 = org.telegram.ui.ActionBar.k6.k0(L, L, L, L, x02, o10, o10);
        org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i10);
        org.telegram.ui.ActionBar.n6 h = org.telegram.ui.ActionBar.r6.h(i11, 120);
        textView.setBackground(k02);
        org.telegram.ui.ActionBar.r6.k(textView, k02, N, h, null);
        this.b.addView(textView, b8.mf.d(-1, 48.0f, 80, 16.0f, 0.0f, 16.0f, 60.0f));
        TextView textView2 = new TextView(context);
        textView2.setGravity(17);
        textView2.setEllipsize(truncateAt);
        textView2.setSingleLine(true);
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(org.telegram.messenger.g0.o());
        if (W) {
            z10 = false;
            a02 = org.telegram.messenger.bd.a0(null, null, 2131743472, new Object[0]);
        } else {
            z10 = false;
            a02 = org.telegram.messenger.bd.a0(null, null, 2131743351, new Object[0]);
        }
        textView2.setText(a02);
        textView2.setLetterSpacing(0.025f);
        org.telegram.ui.ActionBar.r6.V(textView2, i10, null);
        int L2 = org.telegram.messenger.g0.L(8.0f);
        int o11 = i0.a.o(org.telegram.ui.ActionBar.k6.x0(null, i10, z10), 120);
        org.telegram.ui.Cells.y k03 = org.telegram.ui.ActionBar.k6.k0(L2, L2, L2, L2, 0, o11, o11);
        org.telegram.ui.ActionBar.n6 h7 = org.telegram.ui.ActionBar.r6.h(i10, 120);
        textView2.setBackground(k03);
        org.telegram.ui.ActionBar.r6.k(textView2, k03, null, h7, null);
        this.b.addView(textView2, b8.mf.d(-1, 48.0f, 80, 16.0f, 0.0f, 16.0f, 6.0f));
        final int i12 = 0;
        textView.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.mq
            public final /* synthetic */ oq b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i12) {
                    case 0:
                        oq oqVar = this.b;
                        oqVar.X1 = org.telegram.messenger.hp.s1(oqVar.a).j1(org.telegram.messenger.zi.C1(oqVar.W1));
                        oqVar.dismiss();
                        break;
                    default:
                        oq oqVar2 = this.b;
                        oqVar2.X1 = org.telegram.messenger.hp.s1(oqVar2.a).j1(org.telegram.messenger.zi.C1(oqVar2.W1));
                        oqVar2.V1 = true;
                        oqVar2.dismiss();
                        break;
                }
            }
        });
        textView2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.mq
            public final /* synthetic */ oq b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i3) {
                    case 0:
                        oq oqVar = this.b;
                        oqVar.X1 = org.telegram.messenger.hp.s1(oqVar.a).j1(org.telegram.messenger.zi.C1(oqVar.W1));
                        oqVar.dismiss();
                        break;
                    default:
                        oq oqVar2 = this.b;
                        oqVar2.X1 = org.telegram.messenger.hp.s1(oqVar2.a).j1(org.telegram.messenger.zi.C1(oqVar2.W1));
                        oqVar2.V1 = true;
                        oqVar2.dismiss();
                        break;
                }
            }
        });
        tj0 tj0Var = this.l1;
        int i13 = this.u0;
        tj0Var.setPadding(i13, 0, i13, org.telegram.messenger.g0.L(120.0f));
        this.l1.setOnItemClickListener(new k(this, 4));
        N();
        b1();
    }

    @Override // org.telegram.ui.ActionBar.t2
    public final void K() {
        super.K();
        TLRPC.InputPeer inputPeer = this.X1;
        if (inputPeer != null) {
            this.Q1.a(inputPeer, this.R1.size() > 1, this.V1, false);
        }
    }

    @Override // org.telegram.ui.Components.ma
    public final sj0 L0(tj0 tj0Var) {
        return new nq(this);
    }

    @Override // org.telegram.ui.Components.ma
    public final CharSequence O0() {
        return this.U1 ? org.telegram.messenger.bd.M0(2131744913, null) : org.telegram.messenger.bd.M0(2131744910, null);
    }
}
