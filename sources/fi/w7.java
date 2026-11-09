package fi;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.c20;
import org.telegram.messenger.id;
import org.telegram.messenger.ls;
import org.telegram.messenger.qp;
import org.telegram.messenger.qs;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.cj0;
import org.telegram.ui.Components.qj0;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class w7 extends org.telegram.ui.ActionBar.v2 implements ls {
    public final int i1;
    public ArrayList j1;
    public final TLRPC.InputPeer k1;
    public final qj0 l1;
    public final v7 m1;
    public final TextView n1;

    public w7(Context context, final int i7, boolean z9, TLRPC.InputPeer inputPeer, final c20 c20Var, final org.telegram.ui.ActionBar.g6 g6Var) {
        super(1, context, g6Var, false);
        N();
        qp.s1(i7).P1().U();
        this.i1 = i7;
        this.j1 = qp.s1(i7).P1().T;
        this.k1 = inputPeer;
        this.b = new t7(this, context, g6Var);
        qj0 qj0Var = new qj0(context, g6Var);
        this.l1 = qj0Var;
        int i10 = this.t0;
        qj0Var.setPadding(i10, 0, i10, 0);
        v7 v7Var = new v7(this);
        this.m1 = v7Var;
        qj0Var.setAdapter(v7Var);
        qj0Var.setLayoutManager(new v4.b0());
        this.b.addView(qj0Var, c8.ha.e(-1, -1, qs.E1));
        qj0Var.setOnItemClickListener(new cj0() { // from class: fi.s7
            @Override // org.telegram.ui.Components.cj0
            public final void c(int i11, View view) {
                if (i11 <= 1) {
                    return;
                }
                w7 w7Var = w7.this;
                TLRPC.InputPeer inputPeer2 = (TLRPC.InputPeer) w7Var.j1.get(i11 - 2);
                long j3 = inputPeer2.channel_id;
                c20 c20Var2 = c20Var;
                if (j3 == 0 && inputPeer2.chat_id == 0) {
                    c20Var2.a(inputPeer2);
                    w7Var.dismiss();
                    return;
                }
                Context context2 = w7Var.getContext();
                org.telegram.ui.ActionBar.g6 g6Var2 = g6Var;
                org.telegram.ui.ActionBar.u1 u1Var = new org.telegram.ui.ActionBar.u1(3, context2, g6Var2);
                u1Var.r(200L);
                qp.s1(i7).P1().k(org.telegram.messenger.m5.n(inputPeer2), new bi.v3(u1Var, c20Var2, inputPeer2, 5), true, g6Var2);
                w7Var.dismiss();
            }
        });
        qj0Var.setOnScrollListener(new u7(this));
        TextView textView = new TextView(getContext());
        this.n1 = textView;
        org.telegram.ui.ActionBar.s6.U(textView, org.telegram.ui.ActionBar.l6.G6, g6Var);
        textView.setTextSize(1, 20.0f);
        textView.setPadding(org.telegram.messenger.g0.L(22.0f) + this.t0, org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(22.0f) + this.t0, org.telegram.messenger.g0.L(14.0f));
        org.telegram.ui.ActionBar.s6.h(org.telegram.ui.ActionBar.l6.h5, textView, g6Var);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setText(id.M0(z9 ? 2131744517 : 2131744518, null));
        this.b.addView(textView, c8.ha.c(-2.0f, -1));
    }

    @Override // org.telegram.ui.ActionBar.v2
    public final boolean G() {
        return I0() > ((float) ((int) (((float) org.telegram.messenger.g0.q.y) * 0.5f)));
    }

    public final float I0() {
        int R;
        float measuredHeight = this.b.getMeasuredHeight();
        int i7 = 0;
        while (true) {
            qj0 qj0Var = this.l1;
            if (i7 >= qj0Var.getChildCount()) {
                return measuredHeight;
            }
            View childAt = qj0Var.getChildAt(i7);
            if (childAt != null && (R = RecyclerView.R(childAt)) != -1 && R > 0) {
                measuredHeight = Math.min(org.telegram.messenger.g0.T1(measuredHeight, childAt.getY(), childAt.getAlpha()), measuredHeight);
            }
            i7++;
        }
    }

    @Override // org.telegram.messenger.ls
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == qs.c3) {
            this.j1 = qp.s1(this.i1).P1().T;
            this.m1.f();
        }
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        qs.f(this.i1).c(this, qs.c3);
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        qs.f(this.i1).n(this, qs.c3);
    }
}
