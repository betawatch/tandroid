package hi;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.hd;
import org.telegram.messenger.is;
import org.telegram.messenger.np;
import org.telegram.messenger.ns;
import org.telegram.messenger.z10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.gj0;
import org.telegram.ui.Components.uj0;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class u7 extends org.telegram.ui.ActionBar.u2 implements is {
    public final int m1;
    public ArrayList n1;
    public final TLRPC.InputPeer o1;
    public final uj0 p1;
    public final t7 q1;
    public final TextView r1;

    public u7(Context context, final int i7, boolean z10, TLRPC.InputPeer inputPeer, final z10 z10Var, final org.telegram.ui.ActionBar.e6 e6Var) {
        super(1, context, e6Var, false);
        O();
        np.s1(i7).P1().U();
        this.m1 = i7;
        this.n1 = np.s1(i7).P1().T;
        this.o1 = inputPeer;
        this.b = new r7(this, context, e6Var);
        uj0 uj0Var = new uj0(context, e6Var);
        this.p1 = uj0Var;
        int i10 = this.u0;
        uj0Var.setPadding(i10, 0, i10, 0);
        t7 t7Var = new t7(this);
        this.q1 = t7Var;
        uj0Var.setAdapter(t7Var);
        uj0Var.setLayoutManager(new v4.b0());
        this.b.addView(uj0Var, c8.ja.e(-1, -1, ns.E1));
        uj0Var.setOnItemClickListener(new gj0() { // from class: hi.q7
            @Override // org.telegram.ui.Components.gj0
            public final void b(int i11, View view) {
                if (i11 <= 1) {
                    return;
                }
                u7 u7Var = u7.this;
                TLRPC.InputPeer inputPeer2 = (TLRPC.InputPeer) u7Var.n1.get(i11 - 2);
                long j3 = inputPeer2.channel_id;
                z10 z10Var2 = z10Var;
                if (j3 == 0 && inputPeer2.chat_id == 0) {
                    z10Var2.a(inputPeer2);
                    u7Var.dismiss();
                    return;
                }
                Context context2 = u7Var.getContext();
                org.telegram.ui.ActionBar.e6 e6Var2 = e6Var;
                org.telegram.ui.ActionBar.t1 t1Var = new org.telegram.ui.ActionBar.t1(3, context2, e6Var2);
                t1Var.r(200L);
                np.s1(i7).P1().k(org.telegram.messenger.m5.n(inputPeer2), new bi.j(t1Var, z10Var2, inputPeer2, 7), true, e6Var2);
                u7Var.dismiss();
            }
        });
        uj0Var.setOnScrollListener(new s7(this));
        TextView textView = new TextView(getContext());
        this.r1 = textView;
        org.telegram.ui.ActionBar.q6.U(textView, org.telegram.ui.ActionBar.j6.G6, e6Var);
        textView.setTextSize(1, 20.0f);
        textView.setPadding(org.telegram.messenger.g0.L(22.0f) + this.u0, org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(22.0f) + this.u0, org.telegram.messenger.g0.L(14.0f));
        org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.h5, textView, e6Var);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setText(hd.M0(z10 ? 2131744517 : 2131744518, null));
        this.b.addView(textView, c8.ja.c(-2.0f, -1));
    }

    @Override // org.telegram.ui.ActionBar.u2
    public final boolean H() {
        return I0() > ((float) ((int) (((float) org.telegram.messenger.g0.q.y) * 0.5f)));
    }

    public final float I0() {
        int R;
        float measuredHeight = this.b.getMeasuredHeight();
        int i7 = 0;
        while (true) {
            uj0 uj0Var = this.p1;
            if (i7 >= uj0Var.getChildCount()) {
                return measuredHeight;
            }
            View childAt = uj0Var.getChildAt(i7);
            if (childAt != null && (R = RecyclerView.R(childAt)) != -1 && R > 0) {
                measuredHeight = Math.min(org.telegram.messenger.g0.T1(measuredHeight, childAt.getY(), childAt.getAlpha()), measuredHeight);
            }
            i7++;
        }
    }

    @Override // org.telegram.messenger.is
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == ns.c3) {
            this.n1 = np.s1(this.m1).P1().T;
            this.q1.f();
        }
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ns.f(this.m1).c(this, ns.c3);
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ns.f(this.m1).n(this, ns.c3);
    }
}
