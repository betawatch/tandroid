package hi;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.fs;
import org.telegram.messenger.gd;
import org.telegram.messenger.ks;
import org.telegram.messenger.mp;
import org.telegram.messenger.x10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ck0;
import org.telegram.ui.Components.oj0;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes4.dex */
public final class u7 extends org.telegram.ui.ActionBar.x2 implements fs {
    public final int m1;
    public ArrayList n1;
    public final TLRPC.InputPeer o1;
    public final ck0 p1;
    public final t7 q1;
    public final TextView r1;

    public u7(Context context, final int i7, boolean z10, TLRPC.InputPeer inputPeer, final x10 x10Var, final org.telegram.ui.ActionBar.i6 i6Var) {
        super(1, context, i6Var, false);
        O();
        mp.u1(i7).R1().U();
        this.m1 = i7;
        this.n1 = mp.u1(i7).R1().T;
        this.o1 = inputPeer;
        this.b = new r7(this, context, i6Var);
        ck0 ck0Var = new ck0(context, i6Var);
        this.p1 = ck0Var;
        int i10 = this.u0;
        ck0Var.setPadding(i10, 0, i10, 0);
        t7 t7Var = new t7(this);
        this.q1 = t7Var;
        ck0Var.setAdapter(t7Var);
        ck0Var.setLayoutManager(new v4.c0());
        this.b.addView(ck0Var, c8.ma.e(-1, -1, ks.E1));
        ck0Var.setOnItemClickListener(new oj0() { // from class: hi.q7
            @Override // org.telegram.ui.Components.oj0
            public final void c(int i11, View view) {
                if (i11 <= 1) {
                    return;
                }
                u7 u7Var = u7.this;
                TLRPC.InputPeer inputPeer2 = (TLRPC.InputPeer) u7Var.n1.get(i11 - 2);
                long j3 = inputPeer2.channel_id;
                x10 x10Var2 = x10Var;
                if (j3 == 0 && inputPeer2.chat_id == 0) {
                    x10Var2.a(inputPeer2);
                    u7Var.dismiss();
                    return;
                }
                Context context2 = u7Var.getContext();
                org.telegram.ui.ActionBar.i6 i6Var2 = i6Var;
                org.telegram.ui.ActionBar.u1 u1Var = new org.telegram.ui.ActionBar.u1(3, context2, i6Var2);
                u1Var.r(200L);
                mp.u1(i7).R1().k(org.telegram.messenger.n5.n(inputPeer2), new bi.j(u1Var, x10Var2, inputPeer2, 10), true, i6Var2);
                u7Var.dismiss();
            }
        });
        ck0Var.setOnScrollListener(new s7(this));
        TextView textView = new TextView(getContext());
        this.r1 = textView;
        org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.G6, i6Var);
        textView.setTextSize(1, 20.0f);
        textView.setPadding(org.telegram.messenger.g0.L(22.0f) + this.u0, org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(22.0f) + this.u0, org.telegram.messenger.g0.L(14.0f));
        org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.h5, textView, i6Var);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setText(gd.M0(z10 ? 2131744282 : 2131744283, null));
        this.b.addView(textView, c8.ma.c(-2.0f, -1));
    }

    @Override // org.telegram.ui.ActionBar.x2
    public final boolean G() {
        return J0() > ((float) ((int) (((float) org.telegram.messenger.g0.q.y) * 0.5f)));
    }

    public final float J0() {
        int R;
        float measuredHeight = this.b.getMeasuredHeight();
        int i7 = 0;
        while (true) {
            ck0 ck0Var = this.p1;
            if (i7 >= ck0Var.getChildCount()) {
                return measuredHeight;
            }
            View childAt = ck0Var.getChildAt(i7);
            if (childAt != null && (R = RecyclerView.R(childAt)) != -1 && R > 0) {
                measuredHeight = Math.min(org.telegram.messenger.g0.T1(measuredHeight, childAt.getY(), childAt.getAlpha()), measuredHeight);
            }
            i7++;
        }
    }

    @Override // org.telegram.messenger.fs
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == ks.e3) {
            this.n1 = mp.u1(this.m1).R1().T;
            this.q1.f();
        }
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ks.f(this.m1).c(this, ks.e3);
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ks.f(this.m1).n(this, ks.e3);
    }
}
