package gi;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import b8.mf;
import java.util.ArrayList;
import org.telegram.messenger.bd;
import org.telegram.messenger.cs;
import org.telegram.messenger.hp;
import org.telegram.messenger.hs;
import org.telegram.messenger.u10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.fj0;
import org.telegram.ui.Components.tj0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class v7 extends org.telegram.ui.ActionBar.t2 implements cs {
    public final int j1;
    public ArrayList k1;
    public final TLRPC.InputPeer l1;
    public final tj0 m1;
    public final u7 n1;
    public final TextView o1;

    public v7(Context context, final int i3, boolean z10, TLRPC.InputPeer inputPeer, final u10 u10Var, final org.telegram.ui.ActionBar.e6 e6Var) {
        super(1, context, e6Var, false);
        N();
        hp.s1(i3).P1().U();
        this.j1 = i3;
        this.k1 = hp.s1(i3).P1().T;
        this.l1 = inputPeer;
        this.b = new s7(this, context, e6Var);
        tj0 tj0Var = new tj0(context, e6Var);
        this.m1 = tj0Var;
        int i10 = this.u0;
        tj0Var.setPadding(i10, 0, i10, 0);
        u7 u7Var = new u7(this);
        this.n1 = u7Var;
        tj0Var.setAdapter(u7Var);
        tj0Var.setLayoutManager(new u4.b0());
        this.b.addView(tj0Var, mf.e(-1, -1, hs.E1));
        tj0Var.setOnItemClickListener(new fj0() { // from class: gi.r7
            @Override // org.telegram.ui.Components.fj0
            public final void f(int i11, View view) {
                if (i11 <= 1) {
                    return;
                }
                v7 v7Var = v7.this;
                TLRPC.InputPeer inputPeer2 = (TLRPC.InputPeer) v7Var.k1.get(i11 - 2);
                long j10 = inputPeer2.channel_id;
                u10 u10Var2 = u10Var;
                if (j10 == 0 && inputPeer2.chat_id == 0) {
                    u10Var2.a(inputPeer2);
                    v7Var.dismiss();
                    return;
                }
                Context context2 = v7Var.getContext();
                org.telegram.ui.ActionBar.e6 e6Var2 = e6Var;
                org.telegram.ui.ActionBar.s1 s1Var = new org.telegram.ui.ActionBar.s1(3, context2, e6Var2);
                s1Var.r(200L);
                hp.s1(i3).P1().k(org.telegram.messenger.m5.n(inputPeer2), new ai.m(s1Var, u10Var2, inputPeer2, 7), true, e6Var2);
                v7Var.dismiss();
            }
        });
        tj0Var.setOnScrollListener(new t7(this));
        TextView textView = new TextView(getContext());
        this.o1 = textView;
        org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.G6, e6Var);
        textView.setTextSize(1, 20.0f);
        textView.setPadding(org.telegram.messenger.g0.L(22.0f) + this.u0, org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(22.0f) + this.u0, org.telegram.messenger.g0.L(14.0f));
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.h5, textView, e6Var);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setText(bd.M0(z10 ? 2131744527 : 2131744528, null));
        this.b.addView(textView, mf.c(-2.0f, -1));
    }

    @Override // org.telegram.ui.ActionBar.t2
    public final boolean G() {
        return I0() > ((float) ((int) (((float) org.telegram.messenger.g0.q.y) * 0.5f)));
    }

    public final float I0() {
        int R;
        float measuredHeight = this.b.getMeasuredHeight();
        int i3 = 0;
        while (true) {
            tj0 tj0Var = this.m1;
            if (i3 >= tj0Var.getChildCount()) {
                return measuredHeight;
            }
            View childAt = tj0Var.getChildAt(i3);
            if (childAt != null && (R = RecyclerView.R(childAt)) != -1 && R > 0) {
                measuredHeight = Math.min(org.telegram.messenger.g0.T1(measuredHeight, childAt.getY(), childAt.getAlpha()), measuredHeight);
            }
            i3++;
        }
    }

    @Override // org.telegram.messenger.cs
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        if (i3 == hs.c3) {
            this.k1 = hp.s1(this.j1).P1().T;
            this.n1.f();
        }
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        hs.f(this.j1).c(this, hs.c3);
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        hs.f(this.j1).n(this, hs.c3);
    }
}
