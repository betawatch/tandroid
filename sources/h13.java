// default package

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class h13 extends ny0 {
    public final zv5 S1;
    public final ArrayList T1;
    public final boolean U1;
    public final boolean V1;
    public final boolean W1;
    public boolean X1;
    public TLRPC.Peer Y1;
    public TLRPC.InputPeer Z1;
    public final e a2;
    public final long b2;

    public h13(e eVar, ArrayList arrayList, long j, zv5 zv5Var) {
        super(eVar, false);
        boolean z;
        String a0;
        TLRPC.Chat M0 = uc7.s1(this.a).M0(Long.valueOf(-j));
        this.a2 = eVar;
        this.b2 = j;
        this.u1 = 0.26f;
        ArrayList arrayList2 = new ArrayList(arrayList);
        this.T1 = arrayList2;
        this.S1 = zv5Var;
        boolean W = xc2.W(M0);
        this.W1 = W;
        this.Y1 = (TLRPC.Peer) arrayList2.get(0);
        final byte b = 1;
        this.U1 = arrayList2.size() > 1;
        this.V1 = xc2.w(14, M0);
        Context context = this.b.getContext();
        this.b.addView(new tb((byte) 10, context, this), tre.d(-1, 120.0f, 80, 0.0f, 0.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        textView.setGravity(17);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView.setSingleLine(true);
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(hl.o());
        textView.setText(W ? ob6.a0(null, null, 2131743107, new Object[0]) : ob6.a0(null, null, 2131742976, new Object[0]));
        yob.X(textView, aob.Ji, null);
        int L = hl.L(8.0f);
        int i = aob.Fi;
        int w0 = aob.w0(null, i, false);
        int i2 = aob.d6;
        int o = vm2.o(aob.w0(null, i2, false), jn7.E1);
        hf0 i0 = aob.i0(L, L, L, L, w0, o, o);
        uob M = yob.M(i);
        uob g = yob.g(i2, jn7.E1);
        textView.setBackground(i0);
        yob.j(textView, i0, M, g, null);
        this.b.addView(textView, tre.d(-1, 48.0f, 80, 16.0f, 0.0f, 16.0f, 60.0f));
        TextView textView2 = new TextView(context);
        textView2.setGravity(17);
        textView2.setEllipsize(truncateAt);
        textView2.setSingleLine(true);
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(hl.o());
        if (W) {
            z = false;
            a0 = ob6.a0(null, null, 2131743114, new Object[0]);
        } else {
            z = false;
            a0 = ob6.a0(null, null, 2131742993, new Object[0]);
        }
        textView2.setText(a0);
        textView2.setLetterSpacing(0.025f);
        yob.X(textView2, i, null);
        int L2 = hl.L(8.0f);
        int o2 = vm2.o(aob.w0(null, i, z), jn7.E1);
        hf0 i02 = aob.i0(L2, L2, L2, L2, 0, o2, o2);
        uob g2 = yob.g(i, jn7.E1);
        textView2.setBackground(i02);
        yob.j(textView2, i02, null, g2, null);
        this.b.addView(textView2, tre.d(-1, 48.0f, 80, 16.0f, 0.0f, 16.0f, 6.0f));
        final byte b2 = 0;
        textView.setOnClickListener(new View.OnClickListener(this) { // from class: f13
            public final /* synthetic */ h13 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b3 = b2;
                h13 h13Var = this.b;
                switch (b3) {
                    case 0:
                        h13Var.Z1 = uc7.s1(h13Var.a).j1(r47.B1(h13Var.Y1));
                        h13Var.dismiss();
                        break;
                    default:
                        h13Var.Z1 = uc7.s1(h13Var.a).j1(r47.B1(h13Var.Y1));
                        h13Var.X1 = true;
                        h13Var.dismiss();
                        break;
                }
            }
        });
        textView2.setOnClickListener(new View.OnClickListener(this) { // from class: f13
            public final /* synthetic */ h13 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b3 = b;
                h13 h13Var = this.b;
                switch (b3) {
                    case 0:
                        h13Var.Z1 = uc7.s1(h13Var.a).j1(r47.B1(h13Var.Y1));
                        h13Var.dismiss();
                        break;
                    default:
                        h13Var.Z1 = uc7.s1(h13Var.a).j1(r47.B1(h13Var.Y1));
                        h13Var.X1 = true;
                        h13Var.dismiss();
                        break;
                }
            }
        });
        d79 d79Var = this.n1;
        int i3 = this.u0;
        d79Var.setPadding(i3, 0, i3, hl.L(120.0f));
        this.n1.setOnItemClickListener(new u(this, (byte) 18));
        J();
        X0();
    }

    @Override // nx0
    public final void H() {
        super.H();
        TLRPC.InputPeer inputPeer = this.Z1;
        if (inputPeer != null) {
            this.S1.a(inputPeer, this.T1.size() > 1, this.X1, false);
        }
    }

    @Override // ny0
    public final c79 H0(d79 d79Var) {
        return new g13(this);
    }

    @Override // ny0
    public final CharSequence K0() {
        return this.W1 ? ob6.M0(2131744560, null) : ob6.M0(2131744557, null);
    }
}
