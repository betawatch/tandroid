package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class br extends ra {
    public final d70 T1;
    public final ArrayList U1;
    public final boolean V1;
    public final boolean W1;
    public final boolean X1;
    public boolean Y1;
    public TLRPC.Peer Z1;
    public TLRPC.InputPeer a2;
    public final org.telegram.ui.ActionBar.g2 b2;
    public final long c2;

    public br(org.telegram.ui.ActionBar.g2 g2Var, ArrayList arrayList, long j3, d70 d70Var) {
        super(g2Var, false);
        boolean z10;
        String a02;
        TLRPC.Chat O0 = org.telegram.messenger.mp.u1(this.a).O0(Long.valueOf(-j3));
        this.b2 = g2Var;
        this.c2 = j3;
        this.v1 = 0.26f;
        ArrayList arrayList2 = new ArrayList(arrayList);
        this.U1 = arrayList2;
        this.T1 = d70Var;
        boolean W = org.telegram.messenger.v3.W(O0);
        this.X1 = W;
        this.Z1 = (TLRPC.Peer) arrayList2.get(0);
        final int i7 = 1;
        this.V1 = arrayList2.size() > 1;
        this.W1 = org.telegram.messenger.v3.w(14, O0);
        Context context = this.b.getContext();
        this.b.addView(new bi.o3(18, context, this), c8.na.d(-1, 120.0f, 80, 0.0f, 0.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        textView.setGravity(17);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView.setSingleLine(true);
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setText(W ? org.telegram.messenger.gd.a0(null, null, 2131743205, new Object[0]) : org.telegram.messenger.gd.a0(null, null, 2131743074, new Object[0]));
        org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.Ji, null);
        int L = org.telegram.messenger.g0.L(8.0f);
        int i10 = org.telegram.ui.ActionBar.n6.Fi;
        int x02 = org.telegram.ui.ActionBar.n6.x0(null, i10, false);
        int i11 = org.telegram.ui.ActionBar.n6.d6;
        int o4 = i0.a.o(org.telegram.ui.ActionBar.n6.x0(null, i11, false), 120);
        org.telegram.ui.Cells.y k02 = org.telegram.ui.ActionBar.n6.k0(L, L, L, L, x02, o4, o4);
        org.telegram.ui.ActionBar.q6 M = org.telegram.ui.ActionBar.u6.M(i10);
        org.telegram.ui.ActionBar.q6 g10 = org.telegram.ui.ActionBar.u6.g(i11, 120);
        textView.setBackground(k02);
        org.telegram.ui.ActionBar.u6.j(textView, k02, M, g10, null);
        this.b.addView(textView, c8.na.d(-1, 48.0f, 80, 16.0f, 0.0f, 16.0f, 60.0f));
        TextView textView2 = new TextView(context);
        textView2.setGravity(17);
        textView2.setEllipsize(truncateAt);
        textView2.setSingleLine(true);
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(org.telegram.messenger.g0.o());
        if (W) {
            z10 = false;
            a02 = org.telegram.messenger.gd.a0(null, null, 2131743212, new Object[0]);
        } else {
            z10 = false;
            a02 = org.telegram.messenger.gd.a0(null, null, 2131743091, new Object[0]);
        }
        textView2.setText(a02);
        textView2.setLetterSpacing(0.025f);
        org.telegram.ui.ActionBar.u6.U(textView2, i10, null);
        int L2 = org.telegram.messenger.g0.L(8.0f);
        int o10 = i0.a.o(org.telegram.ui.ActionBar.n6.x0(null, i10, z10), 120);
        org.telegram.ui.Cells.y k03 = org.telegram.ui.ActionBar.n6.k0(L2, L2, L2, L2, 0, o10, o10);
        org.telegram.ui.ActionBar.q6 g11 = org.telegram.ui.ActionBar.u6.g(i10, 120);
        textView2.setBackground(k03);
        org.telegram.ui.ActionBar.u6.j(textView2, k03, null, g11, null);
        this.b.addView(textView2, c8.na.d(-1, 48.0f, 80, 16.0f, 0.0f, 16.0f, 6.0f));
        final int i12 = 0;
        textView.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.zq
            public final /* synthetic */ br b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i12) {
                    case 0:
                        br brVar = this.b;
                        brVar.a2 = org.telegram.messenger.mp.u1(brVar.a).l1(org.telegram.messenger.fj.B1(brVar.Z1));
                        brVar.dismiss();
                        break;
                    default:
                        br brVar2 = this.b;
                        brVar2.a2 = org.telegram.messenger.mp.u1(brVar2.a).l1(org.telegram.messenger.fj.B1(brVar2.Z1));
                        brVar2.Y1 = true;
                        brVar2.dismiss();
                        break;
                }
            }
        });
        textView2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.zq
            public final /* synthetic */ br b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i7) {
                    case 0:
                        br brVar = this.b;
                        brVar.a2 = org.telegram.messenger.mp.u1(brVar.a).l1(org.telegram.messenger.fj.B1(brVar.Z1));
                        brVar.dismiss();
                        break;
                    default:
                        br brVar2 = this.b;
                        brVar2.a2 = org.telegram.messenger.mp.u1(brVar2.a).l1(org.telegram.messenger.fj.B1(brVar2.Z1));
                        brVar2.Y1 = true;
                        brVar2.dismiss();
                        break;
                }
            }
        });
        ek0 ek0Var = this.o1;
        int i13 = this.u0;
        ek0Var.setPadding(i13, 0, i13, org.telegram.messenger.g0.L(120.0f));
        this.o1.setOnItemClickListener(new n(this, 4));
        O();
        c1();
    }

    @Override // org.telegram.ui.ActionBar.w2
    public final void L() {
        super.L();
        TLRPC.InputPeer inputPeer = this.a2;
        if (inputPeer != null) {
            this.T1.a(inputPeer, this.U1.size() > 1, this.Y1, false);
        }
    }

    @Override // org.telegram.ui.Components.ra
    public final dk0 M0(ek0 ek0Var) {
        return new ar(this);
    }

    @Override // org.telegram.ui.Components.ra
    public final CharSequence P0() {
        return this.X1 ? org.telegram.messenger.gd.N0(2131744662, null) : org.telegram.messenger.gd.N0(2131744659, null);
    }
}
