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

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class ye extends pn0 {
    public final /* synthetic */ ChatActivityEnterView H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ye(ChatActivityEnterView chatActivityEnterView, final Context context, final org.telegram.ui.bn bnVar, org.telegram.messenger.mp mpVar, final boolean z10, TLRPC.Peer peer, TLRPC.TL_channels_sendAsPeers tL_channels_sendAsPeers, final a3.h hVar, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context);
        this.H = chatActivityEnterView;
        this.b = true;
        this.c = org.telegram.messenger.ks.g2;
        this.f = -1L;
        this.j = new h2.f((int[]) null);
        e();
        this.z = new ArrayList();
        this.G = new ArrayList();
        this.r = peer;
        this.s = tL_channels_sendAsPeers;
        bi.g3 g3Var = new bi.g3(25, context, this);
        this.t = g3Var;
        g3Var.setLayoutParams(c8.na.c(-2.0f, -2));
        setContentView(g3Var);
        setWidth(-2);
        setHeight(-2);
        setBackgroundDrawable(null);
        Drawable mutate = context.getDrawable(R.drawable.popup_fixed_alert4).mutate();
        org.telegram.ui.ActionBar.u6.x(g3Var, mutate, org.telegram.ui.ActionBar.n6.G8, i6Var, PorterDuff.Mode.MULTIPLY);
        g3Var.setBackground(mutate);
        Rect rect = new Rect();
        mutate.getPadding(rect);
        g3Var.setPadding(rect.left, rect.top, rect.right, rect.bottom);
        int width = (int) ((bnVar == null ? org.telegram.messenger.g0.q.x : bnVar.m1.getWidth()) * 0.75f);
        jn0 jn0Var = new jn0(context, width, org.telegram.messenger.g0.L(450.0f));
        this.o = jn0Var;
        jn0Var.setOrientation(1);
        TextView textView = new TextView(context);
        this.p = textView;
        org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.m5, i6Var);
        textView.setTextSize(1, 16.0f);
        textView.setText(org.telegram.messenger.gd.N0(2131745404, null));
        textView.setTypeface(org.telegram.messenger.g0.o(), 1);
        int L = org.telegram.messenger.g0.L(18.0f);
        textView.setPadding(L, org.telegram.messenger.g0.L(12.0f), L, org.telegram.messenger.g0.L(12.0f));
        jn0Var.addView(textView);
        FrameLayout frameLayout = new FrameLayout(context);
        final ArrayList<TLRPC.TL_sendAsPeer> arrayList = tL_channels_sendAsPeers.peers;
        ek0 ek0Var = new ek0(context, null);
        this.v = ek0Var;
        v4.c0 c0Var = new v4.c0();
        this.w = c0Var;
        ek0Var.setLayoutManager(c0Var);
        ek0Var.setAdapter(new kn0(i6Var, arrayList, mpVar, width, peer));
        ek0Var.j(new ln0(this));
        ek0Var.setOnItemClickListener(new qj0(arrayList, context, bnVar, z10, hVar) { // from class: org.telegram.ui.Components.in0
            public final /* synthetic */ List b;
            public final /* synthetic */ Context c;
            public final /* synthetic */ org.telegram.ui.bn d;
            public final /* synthetic */ a3.h e;

            {
                this.e = hVar;
            }

            @Override // org.telegram.ui.Components.qj0
            public final void b(int i7, View view) {
                pn0.k(ye.this, this.b, this.c, this.d, this.e, view, i7);
            }
        });
        ek0Var.setOverScrollMode(2);
        frameLayout.addView(ek0Var);
        View view = new View(context);
        this.u = view;
        Drawable drawable = context.getDrawable(R.drawable.header_shadow);
        drawable.setAlpha(org.telegram.messenger.ks.j2);
        view.setBackground(drawable);
        view.setAlpha(0.0f);
        frameLayout.addView(view, c8.na.c(4.0f, -1));
        jn0Var.addView(frameLayout, c8.na.c(-2.0f, -1));
        g3Var.addView(jn0Var);
    }

    @Override // org.telegram.ui.Components.pn0, org.telegram.ui.ActionBar.g1, android.widget.PopupWindow
    public final void dismiss() {
        ArrayList arrayList = this.z;
        ChatActivityEnterView chatActivityEnterView = this.H;
        if (chatActivityEnterView.r0 != this) {
            super.dismiss();
            return;
        }
        chatActivityEnterView.r0 = null;
        int i7 = 0;
        if (!this.q) {
            l(new r1.g[0]);
            chatActivityEnterView.q0.a(true, true, 0.0f);
            return;
        }
        int size = arrayList.size();
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            ((r1.g) obj).d();
        }
        arrayList.clear();
        super.dismiss();
    }
}
