// default package

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class o03 extends fy0 {
    public final vt5 S1;
    public final ArrayList T1;
    public final boolean U1;
    public final boolean V1;
    public final boolean W1;
    public boolean X1;
    public TLRPC.Peer Y1;
    public TLRPC.InputPeer Z1;
    public final d a2;
    public final long b2;

    public o03(d dVar, ArrayList arrayList, long j, vt5 vt5Var) {
        super(dVar, false);
        boolean z;
        String a0;
        TLRPC.Chat K0 = na7.q1(this.a).K0(Long.valueOf(-j));
        this.a2 = dVar;
        this.b2 = j;
        this.u1 = 0.26f;
        ArrayList arrayList2 = new ArrayList(arrayList);
        this.T1 = arrayList2;
        this.S1 = vt5Var;
        boolean W = hc2.W(K0);
        this.W1 = W;
        this.Y1 = (TLRPC.Peer) arrayList2.get(0);
        final byte b = 1;
        this.U1 = arrayList2.size() > 1;
        this.V1 = hc2.w(14, K0);
        Context context = this.b.getContext();
        this.b.addView(new sb((byte) 9, context, this), nme.d(-1, 120.0f, 80, 0.0f, 0.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        textView.setGravity(17);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView.setSingleLine(true);
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(gl.o());
        textView.setText(W ? k96.a0(null, null, 2131743213, new Object[0]) : k96.a0(null, null, 2131743082, new Object[0]));
        zkb.X(textView, bkb.Ii, null);
        int L = gl.L(8.0f);
        int i = bkb.Ei;
        int w0 = bkb.w0(null, i, false);
        int i2 = bkb.c6;
        int o = bm2.o(bkb.w0(null, i2, false), 120);
        ff0 i0 = bkb.i0(L, L, L, L, w0, o, o);
        vkb M = zkb.M(i);
        vkb g = zkb.g(i2, 120);
        textView.setBackground(i0);
        zkb.j(textView, i0, M, g, null);
        this.b.addView(textView, nme.d(-1, 48.0f, 80, 16.0f, 0.0f, 16.0f, 60.0f));
        TextView textView2 = new TextView(context);
        textView2.setGravity(17);
        textView2.setEllipsize(truncateAt);
        textView2.setSingleLine(true);
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(gl.o());
        if (W) {
            z = false;
            a0 = k96.a0(null, null, 2131743220, new Object[0]);
        } else {
            z = false;
            a0 = k96.a0(null, null, 2131743099, new Object[0]);
        }
        textView2.setText(a0);
        textView2.setLetterSpacing(0.025f);
        zkb.X(textView2, i, null);
        int L2 = gl.L(8.0f);
        int o2 = bm2.o(bkb.w0(null, i, z), 120);
        ff0 i02 = bkb.i0(L2, L2, L2, L2, 0, o2, o2);
        vkb g2 = zkb.g(i, 120);
        textView2.setBackground(i02);
        zkb.j(textView2, i02, null, g2, null);
        this.b.addView(textView2, nme.d(-1, 48.0f, 80, 16.0f, 0.0f, 16.0f, 6.0f));
        final byte b2 = 0;
        textView.setOnClickListener(new View.OnClickListener(this) { // from class: m03
            public final /* synthetic */ o03 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b3 = b2;
                o03 o03Var = this.b;
                switch (b3) {
                    case 0:
                        o03Var.Z1 = na7.q1(o03Var.a).h1(k27.B1(o03Var.Y1));
                        o03Var.dismiss();
                        break;
                    default:
                        o03Var.Z1 = na7.q1(o03Var.a).h1(k27.B1(o03Var.Y1));
                        o03Var.X1 = true;
                        o03Var.dismiss();
                        break;
                }
            }
        });
        textView2.setOnClickListener(new View.OnClickListener(this) { // from class: m03
            public final /* synthetic */ o03 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b3 = b;
                o03 o03Var = this.b;
                switch (b3) {
                    case 0:
                        o03Var.Z1 = na7.q1(o03Var.a).h1(k27.B1(o03Var.Y1));
                        o03Var.dismiss();
                        break;
                    default:
                        o03Var.Z1 = na7.q1(o03Var.a).h1(k27.B1(o03Var.Y1));
                        o03Var.X1 = true;
                        o03Var.dismiss();
                        break;
                }
            }
        });
        o39 o39Var = this.n1;
        int i3 = this.u0;
        o39Var.setPadding(i3, 0, i3, gl.L(120.0f));
        this.n1.setOnItemClickListener(new u(this, (byte) 18));
        K();
        W0();
    }

    @Override // fy0
    public final n39 G0(o39 o39Var) {
        return new n03(this);
    }

    @Override // fx0
    public final void I() {
        super.I();
        TLRPC.InputPeer inputPeer = this.Z1;
        if (inputPeer != null) {
            this.S1.a(inputPeer, this.T1.size() > 1, this.X1, false);
        }
    }

    @Override // fy0
    public final CharSequence J0() {
        return this.W1 ? k96.M0(2131744666, null) : k96.M0(2131744663, null);
    }
}
