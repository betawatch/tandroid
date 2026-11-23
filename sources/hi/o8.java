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
import org.telegram.messenger.w10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.qj0;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final class o8 extends org.telegram.ui.ActionBar.w2 implements fs {
    public final int m1;
    public ArrayList n1;
    public final TLRPC.InputPeer o1;
    public final ek0 p1;
    public final n8 q1;
    public final TextView r1;

    public o8(Context context, final int i7, boolean z10, TLRPC.InputPeer inputPeer, final w10 w10Var, final org.telegram.ui.ActionBar.i6 i6Var) {
        super(1, context, i6Var, false);
        O();
        mp.u1(i7).R1().U();
        this.m1 = i7;
        this.n1 = mp.u1(i7).R1().T;
        this.o1 = inputPeer;
        this.b = new l8(this, context, i6Var);
        ek0 ek0Var = new ek0(context, i6Var);
        this.p1 = ek0Var;
        int i10 = this.u0;
        ek0Var.setPadding(i10, 0, i10, 0);
        n8 n8Var = new n8(this);
        this.q1 = n8Var;
        ek0Var.setAdapter(n8Var);
        ek0Var.setLayoutManager(new v4.c0());
        this.b.addView(ek0Var, c8.na.e(-1, -1, ks.E1));
        ek0Var.setOnItemClickListener(new qj0() { // from class: hi.k8
            @Override // org.telegram.ui.Components.qj0
            public final void b(int i11, View view) {
                if (i11 <= 1) {
                    return;
                }
                o8 o8Var = o8.this;
                TLRPC.InputPeer inputPeer2 = (TLRPC.InputPeer) o8Var.n1.get(i11 - 2);
                long j3 = inputPeer2.channel_id;
                w10 w10Var2 = w10Var;
                if (j3 == 0 && inputPeer2.chat_id == 0) {
                    w10Var2.a(inputPeer2);
                    o8Var.dismiss();
                    return;
                }
                Context context2 = o8Var.getContext();
                org.telegram.ui.ActionBar.i6 i6Var2 = i6Var;
                org.telegram.ui.ActionBar.t1 t1Var = new org.telegram.ui.ActionBar.t1(3, context2, i6Var2);
                t1Var.r(200L);
                mp.u1(i7).R1().k(org.telegram.messenger.n5.n(inputPeer2), new bi.j(t1Var, w10Var2, inputPeer2, 10), true, i6Var2);
                o8Var.dismiss();
            }
        });
        ek0Var.setOnScrollListener(new m8(this));
        TextView textView = new TextView(getContext());
        this.r1 = textView;
        org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.G6, i6Var);
        textView.setTextSize(1, 20.0f);
        textView.setPadding(org.telegram.messenger.g0.L(22.0f) + this.u0, org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(22.0f) + this.u0, org.telegram.messenger.g0.L(14.0f));
        org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.h5, textView, i6Var);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setText(gd.N0(z10 ? 2131744273 : 2131744274, null));
        this.b.addView(textView, c8.na.c(-2.0f, -1));
    }

    @Override // org.telegram.ui.ActionBar.w2
    public final boolean F() {
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
