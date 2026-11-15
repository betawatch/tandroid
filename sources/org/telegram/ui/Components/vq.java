package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class vq extends ja {
    public final t60 T1;
    public final ArrayList U1;
    public final boolean V1;
    public final boolean W1;
    public final boolean X1;
    public boolean Y1;
    public TLRPC.Peer Z1;
    public TLRPC.InputPeer a2;
    public final org.telegram.ui.ActionBar.e2 b2;
    public final long c2;

    public vq(org.telegram.ui.ActionBar.e2 e2Var, ArrayList arrayList, long j3, t60 t60Var) {
        super(e2Var, false);
        boolean z10;
        String a02;
        TLRPC.Chat M0 = org.telegram.messenger.np.s1(this.a).M0(Long.valueOf(-j3));
        this.b2 = e2Var;
        this.c2 = j3;
        this.v1 = 0.26f;
        ArrayList arrayList2 = new ArrayList(arrayList);
        this.U1 = arrayList2;
        this.T1 = t60Var;
        boolean W = org.telegram.messenger.t3.W(M0);
        this.X1 = W;
        this.Z1 = (TLRPC.Peer) arrayList2.get(0);
        final int i7 = 1;
        this.V1 = arrayList2.size() > 1;
        this.W1 = org.telegram.messenger.t3.w(14, M0);
        Context context = this.b.getContext();
        this.b.addView(new bi.o2(18, context, this), c8.ja.d(-1, 120.0f, 80, 0.0f, 0.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        textView.setGravity(17);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView.setSingleLine(true);
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setText(W ? org.telegram.messenger.hd.a0(null, null, 2131743455, new Object[0]) : org.telegram.messenger.hd.a0(null, null, 2131743324, new Object[0]));
        org.telegram.ui.ActionBar.q6.U(textView, org.telegram.ui.ActionBar.j6.Ji, null);
        int L = org.telegram.messenger.g0.L(8.0f);
        int i10 = org.telegram.ui.ActionBar.j6.Fi;
        int x02 = org.telegram.ui.ActionBar.j6.x0(null, i10, false);
        int i11 = org.telegram.ui.ActionBar.j6.d6;
        int o4 = i0.a.o(org.telegram.ui.ActionBar.j6.x0(null, i11, false), 120);
        org.telegram.ui.Cells.y k02 = org.telegram.ui.ActionBar.j6.k0(L, L, L, L, x02, o4, o4);
        org.telegram.ui.ActionBar.m6 M = org.telegram.ui.ActionBar.q6.M(i10);
        org.telegram.ui.ActionBar.m6 g10 = org.telegram.ui.ActionBar.q6.g(i11, 120);
        textView.setBackground(k02);
        org.telegram.ui.ActionBar.q6.j(textView, k02, M, g10, null);
        this.b.addView(textView, c8.ja.d(-1, 48.0f, 80, 16.0f, 0.0f, 16.0f, 60.0f));
        TextView textView2 = new TextView(context);
        textView2.setGravity(17);
        textView2.setEllipsize(truncateAt);
        textView2.setSingleLine(true);
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(org.telegram.messenger.g0.o());
        if (W) {
            z10 = false;
            a02 = org.telegram.messenger.hd.a0(null, null, 2131743462, new Object[0]);
        } else {
            z10 = false;
            a02 = org.telegram.messenger.hd.a0(null, null, 2131743341, new Object[0]);
        }
        textView2.setText(a02);
        textView2.setLetterSpacing(0.025f);
        org.telegram.ui.ActionBar.q6.U(textView2, i10, null);
        int L2 = org.telegram.messenger.g0.L(8.0f);
        int o10 = i0.a.o(org.telegram.ui.ActionBar.j6.x0(null, i10, z10), 120);
        org.telegram.ui.Cells.y k03 = org.telegram.ui.ActionBar.j6.k0(L2, L2, L2, L2, 0, o10, o10);
        org.telegram.ui.ActionBar.m6 g11 = org.telegram.ui.ActionBar.q6.g(i10, 120);
        textView2.setBackground(k03);
        org.telegram.ui.ActionBar.q6.j(textView2, k03, null, g11, null);
        this.b.addView(textView2, c8.ja.d(-1, 48.0f, 80, 16.0f, 0.0f, 16.0f, 6.0f));
        final int i12 = 0;
        textView.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.tq
            public final /* synthetic */ vq b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i12) {
                    case 0:
                        vq vqVar = this.b;
                        vqVar.a2 = org.telegram.messenger.np.s1(vqVar.a).j1(org.telegram.messenger.gj.B1(vqVar.Z1));
                        vqVar.dismiss();
                        break;
                    default:
                        vq vqVar2 = this.b;
                        vqVar2.a2 = org.telegram.messenger.np.s1(vqVar2.a).j1(org.telegram.messenger.gj.B1(vqVar2.Z1));
                        vqVar2.Y1 = true;
                        vqVar2.dismiss();
                        break;
                }
            }
        });
        textView2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.tq
            public final /* synthetic */ vq b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i7) {
                    case 0:
                        vq vqVar = this.b;
                        vqVar.a2 = org.telegram.messenger.np.s1(vqVar.a).j1(org.telegram.messenger.gj.B1(vqVar.Z1));
                        vqVar.dismiss();
                        break;
                    default:
                        vq vqVar2 = this.b;
                        vqVar2.a2 = org.telegram.messenger.np.s1(vqVar2.a).j1(org.telegram.messenger.gj.B1(vqVar2.Z1));
                        vqVar2.Y1 = true;
                        vqVar2.dismiss();
                        break;
                }
            }
        });
        uj0 uj0Var = this.o1;
        int i13 = this.u0;
        uj0Var.setPadding(i13, 0, i13, org.telegram.messenger.g0.L(120.0f));
        this.o1.setOnItemClickListener(new j(this, 4));
        O();
        b1();
    }

    @Override // org.telegram.ui.ActionBar.u2
    public final void L() {
        super.L();
        TLRPC.InputPeer inputPeer = this.a2;
        if (inputPeer != null) {
            this.T1.a(inputPeer, this.U1.size() > 1, this.Y1, false);
        }
    }

    @Override // org.telegram.ui.Components.ja
    public final tj0 L0(uj0 uj0Var) {
        return new uq(this);
    }

    @Override // org.telegram.ui.Components.ja
    public final CharSequence O0() {
        return this.X1 ? org.telegram.messenger.hd.M0(2131744903, null) : org.telegram.messenger.hd.M0(2131744900, null);
    }
}
