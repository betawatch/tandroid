package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class cr extends sa {
    public final e70 T1;
    public final ArrayList U1;
    public final boolean V1;
    public final boolean W1;
    public final boolean X1;
    public boolean Y1;
    public TLRPC.Peer Z1;
    public TLRPC.InputPeer a2;
    public final org.telegram.ui.ActionBar.h2 b2;
    public final long c2;

    public cr(org.telegram.ui.ActionBar.h2 h2Var, ArrayList arrayList, long j3, e70 e70Var) {
        super(h2Var, false);
        boolean z10;
        String a02;
        TLRPC.Chat O0 = org.telegram.messenger.mp.u1(this.a).O0(Long.valueOf(-j3));
        this.b2 = h2Var;
        this.c2 = j3;
        this.v1 = 0.26f;
        ArrayList arrayList2 = new ArrayList(arrayList);
        this.U1 = arrayList2;
        this.T1 = e70Var;
        boolean W = org.telegram.messenger.v3.W(O0);
        this.X1 = W;
        this.Z1 = (TLRPC.Peer) arrayList2.get(0);
        final int i7 = 1;
        this.V1 = arrayList2.size() > 1;
        this.W1 = org.telegram.messenger.v3.w(14, O0);
        Context context = this.b.getContext();
        this.b.addView(new bi.i3(18, context, this), c8.ma.d(-1, 120.0f, 80, 0.0f, 0.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        textView.setGravity(17);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView.setSingleLine(true);
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setText(W ? org.telegram.messenger.gd.a0(null, null, 2131743218, new Object[0]) : org.telegram.messenger.gd.a0(null, null, 2131743087, new Object[0]));
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
        this.b.addView(textView, c8.ma.d(-1, 48.0f, 80, 16.0f, 0.0f, 16.0f, 60.0f));
        TextView textView2 = new TextView(context);
        textView2.setGravity(17);
        textView2.setEllipsize(truncateAt);
        textView2.setSingleLine(true);
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(org.telegram.messenger.g0.o());
        if (W) {
            z10 = false;
            a02 = org.telegram.messenger.gd.a0(null, null, 2131743225, new Object[0]);
        } else {
            z10 = false;
            a02 = org.telegram.messenger.gd.a0(null, null, 2131743104, new Object[0]);
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
        this.b.addView(textView2, c8.ma.d(-1, 48.0f, 80, 16.0f, 0.0f, 16.0f, 6.0f));
        final int i12 = 0;
        textView.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.ar
            public final /* synthetic */ cr b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i12) {
                    case 0:
                        cr crVar = this.b;
                        crVar.a2 = org.telegram.messenger.mp.u1(crVar.a).l1(org.telegram.messenger.fj.B1(crVar.Z1));
                        crVar.dismiss();
                        break;
                    default:
                        cr crVar2 = this.b;
                        crVar2.a2 = org.telegram.messenger.mp.u1(crVar2.a).l1(org.telegram.messenger.fj.B1(crVar2.Z1));
                        crVar2.Y1 = true;
                        crVar2.dismiss();
                        break;
                }
            }
        });
        textView2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.ar
            public final /* synthetic */ cr b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i7) {
                    case 0:
                        cr crVar = this.b;
                        crVar.a2 = org.telegram.messenger.mp.u1(crVar.a).l1(org.telegram.messenger.fj.B1(crVar.Z1));
                        crVar.dismiss();
                        break;
                    default:
                        cr crVar2 = this.b;
                        crVar2.a2 = org.telegram.messenger.mp.u1(crVar2.a).l1(org.telegram.messenger.fj.B1(crVar2.Z1));
                        crVar2.Y1 = true;
                        crVar2.dismiss();
                        break;
                }
            }
        });
        ck0 ck0Var = this.o1;
        int i13 = this.u0;
        ck0Var.setPadding(i13, 0, i13, org.telegram.messenger.g0.L(120.0f));
        this.o1.setOnItemClickListener(new n(this, 4));
        O();
        c1();
    }

    @Override // org.telegram.ui.ActionBar.x2
    public final void L() {
        super.L();
        TLRPC.InputPeer inputPeer = this.a2;
        if (inputPeer != null) {
            this.T1.a(inputPeer, this.U1.size() > 1, this.Y1, false);
        }
    }

    @Override // org.telegram.ui.Components.sa
    public final bk0 M0(ck0 ck0Var) {
        return new br(this);
    }

    @Override // org.telegram.ui.Components.sa
    public final CharSequence P0() {
        return this.X1 ? org.telegram.messenger.gd.M0(2131744668, null) : org.telegram.messenger.gd.M0(2131744665, null);
    }
}
