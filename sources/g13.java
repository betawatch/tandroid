// default package

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class g13 extends c79 {
    public final /* synthetic */ h13 c;

    public g13(h13 h13Var) {
        this.c = h13Var;
    }

    @Override // c79
    public final boolean D(f89 f89Var) {
        return f89Var.f == 3;
    }

    @Override // j79
    public final int b() {
        h13 h13Var = this.c;
        return h13Var.U1 ? h13Var.T1.size() + 3 : h13Var.V1 ? 2 : 1;
    }

    @Override // j79
    public final int d(int i) {
        if (i == 0) {
            return 0;
        }
        if (i != 1) {
            return i != 2 ? 3 : 2;
        }
        return 1;
    }

    @Override // j79
    public final void t(f89 f89Var, int i) {
        TLObject M0;
        String str;
        int i2 = f89Var.f;
        View view = f89Var.a;
        if (i2 != 3) {
            if (i2 != 2) {
                if (i2 == 1) {
                    ((ilb) view).setText(hl.E2(hl.N2(ob6.M0(2131743082, null), aob.L6, 0, new vd2(this, (byte) 19), null), true, hl.L(1.0f), hl.L(1.0f)));
                    return;
                }
                return;
            } else {
                mf5 mf5Var = (mf5) view;
                mf5Var.setTextSize(15.0f);
                mf5Var.setPadding(0, 0, 0, hl.L(2.0f));
                mf5Var.setText(ob6.M0(2131743095, null).replace(":", ""));
                return;
            }
        }
        h13 h13Var = this.c;
        TLRPC.Peer peer = (TLRPC.Peer) h13Var.T1.get(i - 3);
        long B1 = r47.B1(peer);
        int i3 = h13Var.a;
        if (B1 > 0) {
            M0 = uc7.s1(i3).X1(Long.valueOf(B1));
            str = ob6.M0(2131743001, null);
        } else {
            M0 = uc7.s1(i3).M0(Long.valueOf(-B1));
            str = null;
        }
        bd5 bd5Var = (bd5) view;
        bd5Var.e(M0, null, str, i != b() - 1);
        bd5Var.c(peer == h13Var.Y1, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v5, types: [android.view.ViewGroup, android.widget.LinearLayout, u1] */
    @Override // j79
    public final f89 x(ViewGroup viewGroup, int i) {
        FrameLayout frameLayout;
        Context context = viewGroup.getContext();
        h13 h13Var = this.c;
        if (i == 1) {
            ilb ilbVar = new ilb(context);
            yob.h(aob.a7, h13Var.J0, ilbVar);
            ilbVar.setTopPadding(17);
            ilbVar.setBottomPadding(17);
            frameLayout = ilbVar;
        } else if (i == 2) {
            frameLayout = new mf5(context, 22);
        } else if (i != 3) {
            boolean z = h13Var.W1;
            ?? u1Var = new u1((byte) 5, context, false);
            u1Var.setOrientation(1);
            e29 e29Var = new e29(context);
            e29Var.setAutoRepeat(true);
            e29Var.f(R.raw.utyan_schedule, jn7.w1, jn7.w1, null);
            e29Var.d();
            u1Var.addView(e29Var, tre.t(jn7.w1, jn7.w1, 49, 0, 24, 0, 0));
            TextView textView = new TextView(context);
            textView.setTypeface(hl.o());
            textView.setText(z ? ob6.a0(null, null, 2131744560, new Object[0]) : ob6.a0(null, null, 2131744557, new Object[0]));
            textView.setTextSize(1, 20.0f);
            yob.X(textView, aob.G6, null);
            u1Var.addView(textView, tre.t(-2, -2, 1, 0, 14, 0, 7));
            TextView textView2 = new TextView(context);
            textView2.setTextSize(1, 14.0f);
            textView2.setGravity(1);
            yob.X(textView2, aob.j5, null);
            textView2.setText(z ? ob6.a0(null, null, 2131743110, new Object[0]) : ob6.a0(null, null, 2131742985, new Object[0]));
            textView2.setLineSpacing(textView2.getLineSpacingExtra(), textView2.getLineSpacingMultiplier() * 1.1f);
            u1Var.addView(textView2, tre.t(-2, -2, 1, 28, 0, 28, 17));
            frameLayout = u1Var;
        } else {
            frameLayout = new bd5(context, 1, 0, false);
        }
        frameLayout.setLayoutParams(new r79(-1, -2));
        return new n69(frameLayout);
    }
}
