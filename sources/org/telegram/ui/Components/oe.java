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

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class oe extends fn0 {
    public final /* synthetic */ ChatActivityEnterView H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oe(ChatActivityEnterView chatActivityEnterView, final Context context, final org.telegram.ui.an anVar, org.telegram.messenger.np npVar, final boolean z10, TLRPC.Peer peer, TLRPC.TL_channels_sendAsPeers tL_channels_sendAsPeers, final a3.h hVar, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.H = chatActivityEnterView;
        this.b = true;
        this.c = org.telegram.messenger.ns.g2;
        this.f = -1L;
        this.j = new h2.f((int[]) null);
        e();
        this.z = new ArrayList();
        this.G = new ArrayList();
        this.r = peer;
        this.s = tL_channels_sendAsPeers;
        bi.g2 g2Var = new bi.g2(25, context, this);
        this.t = g2Var;
        g2Var.setLayoutParams(c8.ja.c(-2.0f, -2));
        setContentView(g2Var);
        setWidth(-2);
        setHeight(-2);
        setBackgroundDrawable(null);
        Drawable mutate = context.getDrawable(R.drawable.popup_fixed_alert4).mutate();
        org.telegram.ui.ActionBar.q6.x(g2Var, mutate, org.telegram.ui.ActionBar.j6.G8, e6Var, PorterDuff.Mode.MULTIPLY);
        g2Var.setBackground(mutate);
        Rect rect = new Rect();
        mutate.getPadding(rect);
        g2Var.setPadding(rect.left, rect.top, rect.right, rect.bottom);
        int width = (int) ((anVar == null ? org.telegram.messenger.g0.q.x : anVar.m1.getWidth()) * 0.75f);
        zm0 zm0Var = new zm0(context, width, org.telegram.messenger.g0.L(450.0f));
        this.o = zm0Var;
        zm0Var.setOrientation(1);
        TextView textView = new TextView(context);
        this.p = textView;
        org.telegram.ui.ActionBar.q6.U(textView, org.telegram.ui.ActionBar.j6.m5, e6Var);
        textView.setTextSize(1, 16.0f);
        textView.setText(org.telegram.messenger.hd.M0(2131745600, null));
        textView.setTypeface(org.telegram.messenger.g0.o(), 1);
        int L = org.telegram.messenger.g0.L(18.0f);
        textView.setPadding(L, org.telegram.messenger.g0.L(12.0f), L, org.telegram.messenger.g0.L(12.0f));
        zm0Var.addView(textView);
        FrameLayout frameLayout = new FrameLayout(context);
        final ArrayList<TLRPC.TL_sendAsPeer> arrayList = tL_channels_sendAsPeers.peers;
        uj0 uj0Var = new uj0(context, null);
        this.v = uj0Var;
        v4.b0 b0Var = new v4.b0();
        this.w = b0Var;
        uj0Var.setLayoutManager(b0Var);
        uj0Var.setAdapter(new an0(e6Var, arrayList, npVar, width, peer));
        uj0Var.j(new bn0(this));
        uj0Var.setOnItemClickListener(new gj0(arrayList, context, anVar, z10, hVar) { // from class: org.telegram.ui.Components.ym0
            public final /* synthetic */ List b;
            public final /* synthetic */ Context c;
            public final /* synthetic */ org.telegram.ui.an d;
            public final /* synthetic */ a3.h e;

            {
                this.e = hVar;
            }

            @Override // org.telegram.ui.Components.gj0
            public final void b(int i7, View view) {
                fn0.k(oe.this, this.b, this.c, this.d, this.e, view, i7);
            }
        });
        uj0Var.setOverScrollMode(2);
        frameLayout.addView(uj0Var);
        View view = new View(context);
        this.u = view;
        Drawable drawable = context.getDrawable(R.drawable.header_shadow);
        drawable.setAlpha(org.telegram.messenger.ns.j2);
        view.setBackground(drawable);
        view.setAlpha(0.0f);
        frameLayout.addView(view, c8.ja.c(4.0f, -1));
        zm0Var.addView(frameLayout, c8.ja.c(-2.0f, -1));
        g2Var.addView(zm0Var);
    }

    @Override // org.telegram.ui.Components.fn0, org.telegram.ui.ActionBar.g1, android.widget.PopupWindow
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
