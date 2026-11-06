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

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class ne extends bn0 {
    public final /* synthetic */ ChatActivityEnterView H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ne(ChatActivityEnterView chatActivityEnterView, final Context context, final org.telegram.ui.an anVar, org.telegram.messenger.qp qpVar, final boolean z9, TLRPC.Peer peer, TLRPC.TL_channels_sendAsPeers tL_channels_sendAsPeers, final a3.h hVar, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.H = chatActivityEnterView;
        this.b = true;
        this.c = org.telegram.messenger.qs.g2;
        this.f = -1L;
        this.j = new h2.f((int[]) null);
        e();
        this.z = new ArrayList();
        this.G = new ArrayList();
        this.r = peer;
        this.s = tL_channels_sendAsPeers;
        bi.e5 e5Var = new bi.e5(24, context, this);
        this.t = e5Var;
        e5Var.setLayoutParams(c8.ha.c(-2.0f, -2));
        setContentView(e5Var);
        setWidth(-2);
        setHeight(-2);
        setBackgroundDrawable(null);
        Drawable mutate = context.getDrawable(R.drawable.popup_fixed_alert4).mutate();
        org.telegram.ui.ActionBar.r6.y(e5Var, mutate, org.telegram.ui.ActionBar.k6.G8, f6Var, PorterDuff.Mode.MULTIPLY);
        e5Var.setBackground(mutate);
        Rect rect = new Rect();
        mutate.getPadding(rect);
        e5Var.setPadding(rect.left, rect.top, rect.right, rect.bottom);
        int width = (int) ((anVar == null ? org.telegram.messenger.g0.q.x : anVar.l1.getWidth()) * 0.75f);
        vm0 vm0Var = new vm0(context, width, org.telegram.messenger.g0.L(450.0f));
        this.o = vm0Var;
        vm0Var.setOrientation(1);
        TextView textView = new TextView(context);
        this.p = textView;
        org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.m5, f6Var);
        textView.setTextSize(1, 16.0f);
        textView.setText(org.telegram.messenger.hd.M0(2131745601, null));
        textView.setTypeface(org.telegram.messenger.g0.o(), 1);
        int L = org.telegram.messenger.g0.L(18.0f);
        textView.setPadding(L, org.telegram.messenger.g0.L(12.0f), L, org.telegram.messenger.g0.L(12.0f));
        vm0Var.addView(textView);
        FrameLayout frameLayout = new FrameLayout(context);
        final ArrayList<TLRPC.TL_sendAsPeer> arrayList = tL_channels_sendAsPeers.peers;
        pj0 pj0Var = new pj0(context, null);
        this.v = pj0Var;
        v4.b0 b0Var = new v4.b0();
        this.w = b0Var;
        pj0Var.setLayoutManager(b0Var);
        pj0Var.setAdapter(new wm0(f6Var, arrayList, qpVar, width, peer));
        pj0Var.j(new xm0(this));
        pj0Var.setOnItemClickListener(new bj0(arrayList, context, anVar, z9, hVar) { // from class: org.telegram.ui.Components.um0
            public final /* synthetic */ List b;
            public final /* synthetic */ Context c;
            public final /* synthetic */ org.telegram.ui.an d;
            public final /* synthetic */ a3.h e;

            {
                this.e = hVar;
            }

            @Override // org.telegram.ui.Components.bj0
            public final void c(int i7, View view) {
                bn0.k(ne.this, this.b, this.c, this.d, this.e, view, i7);
            }
        });
        pj0Var.setOverScrollMode(2);
        frameLayout.addView(pj0Var);
        View view = new View(context);
        this.u = view;
        Drawable drawable = context.getDrawable(R.drawable.header_shadow);
        drawable.setAlpha(org.telegram.messenger.qs.j2);
        view.setBackground(drawable);
        view.setAlpha(0.0f);
        frameLayout.addView(view, c8.ha.c(4.0f, -1));
        vm0Var.addView(frameLayout, c8.ha.c(-2.0f, -1));
        e5Var.addView(vm0Var);
    }

    @Override // org.telegram.ui.Components.bn0, org.telegram.ui.ActionBar.g1, android.widget.PopupWindow
    public final void dismiss() {
        ArrayList arrayList = this.z;
        ChatActivityEnterView chatActivityEnterView = this.H;
        if (chatActivityEnterView.q0 != this) {
            super.dismiss();
            return;
        }
        chatActivityEnterView.q0 = null;
        int i7 = 0;
        if (!this.q) {
            l(new r1.g[0]);
            chatActivityEnterView.p0.a(true, true, 0.0f);
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
