package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class ie extends co0 {
    public final /* synthetic */ ChatActivityEnterView H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ie(ChatActivityEnterView chatActivityEnterView, final Context context, final org.telegram.ui.un unVar, org.telegram.messenger.vp vpVar, final boolean z10, TLRPC.Peer peer, TLRPC.TL_channels_sendAsPeers tL_channels_sendAsPeers, final androidx.car.app.utils.a aVar, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context);
        this.H = chatActivityEnterView;
        this.b = true;
        this.c = org.telegram.messenger.zs.g2;
        this.f = -1L;
        this.j = new e2.f(null);
        e();
        this.z = new ArrayList();
        this.G = new ArrayList();
        this.r = peer;
        this.s = tL_channels_sendAsPeers;
        jg.l0 l0Var = new jg.l0(this, context, 23);
        this.t = l0Var;
        l0Var.setLayoutParams(w7.b6.c(-2.0f, -2));
        setContentView(l0Var);
        setWidth(-2);
        setHeight(-2);
        setBackgroundDrawable(null);
        Drawable mutate = context.getDrawable(R.drawable.popup_fixed_alert4).mutate();
        org.telegram.ui.ActionBar.a7.y(l0Var, mutate, org.telegram.ui.ActionBar.t6.G8, p6Var, PorterDuff.Mode.MULTIPLY);
        l0Var.setBackground(mutate);
        Rect rect = new Rect();
        mutate.getPadding(rect);
        l0Var.setPadding(rect.left, rect.top, rect.right, rect.bottom);
        int width = (int) ((unVar == null ? org.telegram.messenger.i0.q.x : unVar.l1.getWidth()) * 0.75f);
        wn0 wn0Var = new wn0(context, width, org.telegram.messenger.i0.L(450.0f));
        this.o = wn0Var;
        wn0Var.setOrientation(1);
        TextView textView = new TextView(context);
        this.p = textView;
        org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.m5, p6Var);
        textView.setTextSize(1, 16.0f);
        textView.setText(org.telegram.messenger.cd.L0(2131745617, null));
        textView.setTypeface(org.telegram.messenger.i0.o(), 1);
        int L = org.telegram.messenger.i0.L(18.0f);
        textView.setPadding(L, org.telegram.messenger.i0.L(12.0f), L, org.telegram.messenger.i0.L(12.0f));
        wn0Var.addView(textView);
        FrameLayout frameLayout = new FrameLayout(context);
        final ArrayList<TLRPC.TL_sendAsPeer> arrayList = tL_channels_sendAsPeers.peers;
        tk0 tk0Var = new tk0(context, null);
        this.v = tk0Var;
        s4.a0 a0Var = new s4.a0();
        this.w = a0Var;
        tk0Var.setLayoutManager(a0Var);
        tk0Var.setAdapter(new xn0(p6Var, arrayList, vpVar, width, peer));
        tk0Var.j(new yn0(this));
        tk0Var.setOnItemClickListener(new gk0(arrayList, context, unVar, z10, aVar) { // from class: org.telegram.ui.Components.vn0
            public final /* synthetic */ List b;
            public final /* synthetic */ Context c;
            public final /* synthetic */ org.telegram.ui.un d;
            public final /* synthetic */ androidx.car.app.utils.a e;

            {
                this.e = aVar;
            }

            @Override // org.telegram.ui.Components.gk0
            public final void f(int i10, View view) {
                co0.k(ie.this, this.b, this.c, this.d, this.e, view, i10);
            }
        });
        tk0Var.setOverScrollMode(2);
        frameLayout.addView(tk0Var);
        View view = new View(context);
        this.u = view;
        Drawable drawable = context.getDrawable(R.drawable.header_shadow);
        drawable.setAlpha(org.telegram.messenger.zs.j2);
        view.setBackground(drawable);
        view.setAlpha(0.0f);
        frameLayout.addView(view, w7.b6.c(4.0f, -1));
        wn0Var.addView(frameLayout, w7.b6.c(-2.0f, -1));
        l0Var.addView(wn0Var);
    }

    @Override // org.telegram.ui.Components.co0, org.telegram.ui.ActionBar.k1, android.widget.PopupWindow
    public final void dismiss() {
        ArrayList arrayList = this.z;
        ChatActivityEnterView chatActivityEnterView = this.H;
        if (chatActivityEnterView.q0 != this) {
            super.dismiss();
            return;
        }
        chatActivityEnterView.q0 = null;
        int i10 = 0;
        if (!this.q) {
            l(new o1.j[0]);
            chatActivityEnterView.p0.a(true, true, 0.0f);
            return;
        }
        int size = arrayList.size();
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((o1.j) obj).d();
        }
        arrayList.clear();
        super.dismiss();
    }
}
