package hi;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.gs;
import org.telegram.messenger.hd;
import org.telegram.messenger.ls;
import org.telegram.messenger.np;
import org.telegram.messenger.y10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.qj0;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes4.dex */
public final class t7 extends org.telegram.ui.ActionBar.w2 implements gs {
    public final int m1;
    public ArrayList n1;
    public final TLRPC.InputPeer o1;
    public final ek0 p1;
    public final s7 q1;
    public final TextView r1;

    public t7(Context context, final int i7, boolean z10, TLRPC.InputPeer inputPeer, final y10 y10Var, final org.telegram.ui.ActionBar.h6 h6Var) {
        super(1, context, h6Var, false);
        O();
        np.u1(i7).R1().U();
        this.m1 = i7;
        this.n1 = np.u1(i7).R1().T;
        this.o1 = inputPeer;
        this.b = new q7(this, context, h6Var);
        ek0 ek0Var = new ek0(context, h6Var);
        this.p1 = ek0Var;
        int i10 = this.u0;
        ek0Var.setPadding(i10, 0, i10, 0);
        s7 s7Var = new s7(this);
        this.q1 = s7Var;
        ek0Var.setAdapter(s7Var);
        ek0Var.setLayoutManager(new v4.c0());
        this.b.addView(ek0Var, c8.ma.e(-1, -1, ls.E1));
        ek0Var.setOnItemClickListener(new qj0() { // from class: hi.p7
            @Override // org.telegram.ui.Components.qj0
            public final void c(int i11, View view) {
                if (i11 <= 1) {
                    return;
                }
                t7 t7Var = t7.this;
                TLRPC.InputPeer inputPeer2 = (TLRPC.InputPeer) t7Var.n1.get(i11 - 2);
                long j3 = inputPeer2.channel_id;
                y10 y10Var2 = y10Var;
                if (j3 == 0 && inputPeer2.chat_id == 0) {
                    y10Var2.a(inputPeer2);
                    t7Var.dismiss();
                    return;
                }
                Context context2 = t7Var.getContext();
                org.telegram.ui.ActionBar.h6 h6Var2 = h6Var;
                org.telegram.ui.ActionBar.t1 t1Var = new org.telegram.ui.ActionBar.t1(3, context2, h6Var2);
                t1Var.r(200L);
                np.u1(i7).R1().k(org.telegram.messenger.n5.n(inputPeer2), new bi.j(t1Var, y10Var2, inputPeer2, 10), true, h6Var2);
                t7Var.dismiss();
            }
        });
        ek0Var.setOnScrollListener(new r7(this));
        TextView textView = new TextView(getContext());
        this.r1 = textView;
        org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.G6, h6Var);
        textView.setTextSize(1, 20.0f);
        textView.setPadding(org.telegram.messenger.g0.L(22.0f) + this.u0, org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(22.0f) + this.u0, org.telegram.messenger.g0.L(14.0f));
        org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.h5, textView, h6Var);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setText(hd.N0(z10 ? 2131744274 : 2131744275, null));
        this.b.addView(textView, c8.ma.c(-2.0f, -1));
    }

    @Override // org.telegram.ui.ActionBar.w2
    public final boolean G() {
        return J0() > ((float) ((int) (((float) org.telegram.messenger.g0.q.y) * 0.5f)));
    }

    public final float J0() {
        int R;
        float measuredHeight = this.b.getMeasuredHeight();
        int i7 = 0;
        while (true) {
            ek0 ek0Var = this.p1;
            if (i7 >= ek0Var.getChildCount()) {
                return measuredHeight;
            }
            View childAt = ek0Var.getChildAt(i7);
            if (childAt != null && (R = RecyclerView.R(childAt)) != -1 && R > 0) {
                measuredHeight = Math.min(org.telegram.messenger.g0.T1(measuredHeight, childAt.getY(), childAt.getAlpha()), measuredHeight);
            }
            i7++;
        }
    }

    @Override // org.telegram.messenger.gs
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == ls.e3) {
            this.n1 = np.u1(this.m1).R1().T;
            this.q1.f();
        }
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ls.f(this.m1).c(this, ls.e3);
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ls.f(this.m1).n(this, ls.e3);
    }
}
