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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class le extends en0 {
    public final /* synthetic */ ChatActivityEnterView H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public le(ChatActivityEnterView chatActivityEnterView, final Context context, final org.telegram.ui.wm wmVar, org.telegram.messenger.hp hpVar, final boolean z10, TLRPC.Peer peer, TLRPC.TL_channels_sendAsPeers tL_channels_sendAsPeers, final aa.a aVar, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.H = chatActivityEnterView;
        this.b = true;
        this.c = org.telegram.messenger.hs.g2;
        this.f = -1L;
        this.j = new g2.g((int[]) null);
        e();
        this.z = new ArrayList();
        this.G = new ArrayList();
        this.r = peer;
        this.s = tL_channels_sendAsPeers;
        ai.o2 o2Var = new ai.o2(26, context, this);
        this.t = o2Var;
        o2Var.setLayoutParams(b8.mf.c(-2.0f, -2));
        setContentView(o2Var);
        setWidth(-2);
        setHeight(-2);
        setBackgroundDrawable(null);
        Drawable mutate = context.getDrawable(R.drawable.popup_fixed_alert4).mutate();
        org.telegram.ui.ActionBar.r6.y(o2Var, mutate, org.telegram.ui.ActionBar.k6.G8, e6Var, PorterDuff.Mode.MULTIPLY);
        o2Var.setBackground(mutate);
        Rect rect = new Rect();
        mutate.getPadding(rect);
        o2Var.setPadding(rect.left, rect.top, rect.right, rect.bottom);
        int width = (int) ((wmVar == null ? org.telegram.messenger.g0.q.x : wmVar.m1.getWidth()) * 0.75f);
        ym0 ym0Var = new ym0(context, width, org.telegram.messenger.g0.L(450.0f));
        this.o = ym0Var;
        ym0Var.setOrientation(1);
        TextView textView = new TextView(context);
        this.p = textView;
        org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.m5, e6Var);
        textView.setTextSize(1, 16.0f);
        textView.setText(org.telegram.messenger.bd.M0(2131745610, null));
        textView.setTypeface(org.telegram.messenger.g0.o(), 1);
        int L = org.telegram.messenger.g0.L(18.0f);
        textView.setPadding(L, org.telegram.messenger.g0.L(12.0f), L, org.telegram.messenger.g0.L(12.0f));
        ym0Var.addView(textView);
        FrameLayout frameLayout = new FrameLayout(context);
        final ArrayList<TLRPC.TL_sendAsPeer> arrayList = tL_channels_sendAsPeers.peers;
        tj0 tj0Var = new tj0(context, null);
        this.v = tj0Var;
        u4.b0 b0Var = new u4.b0();
        this.w = b0Var;
        tj0Var.setLayoutManager(b0Var);
        tj0Var.setAdapter(new zm0(e6Var, arrayList, hpVar, width, peer));
        tj0Var.j(new an0(this));
        tj0Var.setOnItemClickListener(new fj0(arrayList, context, wmVar, z10, aVar) { // from class: org.telegram.ui.Components.xm0
            public final /* synthetic */ List b;
            public final /* synthetic */ Context c;
            public final /* synthetic */ org.telegram.ui.wm d;
            public final /* synthetic */ aa.a e;

            {
                this.e = aVar;
            }

            @Override // org.telegram.ui.Components.fj0
            public final void f(int i3, View view) {
                en0.k(le.this, this.b, this.c, this.d, this.e, view, i3);
            }
        });
        tj0Var.setOverScrollMode(2);
        frameLayout.addView(tj0Var);
        View view = new View(context);
        this.u = view;
        Drawable drawable = context.getDrawable(R.drawable.header_shadow);
        drawable.setAlpha(org.telegram.messenger.hs.j2);
        view.setBackground(drawable);
        view.setAlpha(0.0f);
        frameLayout.addView(view, b8.mf.c(4.0f, -1));
        ym0Var.addView(frameLayout, b8.mf.c(-2.0f, -1));
        o2Var.addView(ym0Var);
    }

    @Override // org.telegram.ui.Components.en0, org.telegram.ui.ActionBar.f1, android.widget.PopupWindow
    public final void dismiss() {
        ArrayList arrayList = this.z;
        ChatActivityEnterView chatActivityEnterView = this.H;
        if (chatActivityEnterView.r0 != this) {
            super.dismiss();
            return;
        }
        chatActivityEnterView.r0 = null;
        int i3 = 0;
        if (!this.q) {
            l(new q1.g[0]);
            chatActivityEnterView.q0.a(true, true, 0.0f);
            return;
        }
        int size = arrayList.size();
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            ((q1.g) obj).d();
        }
        arrayList.clear();
        super.dismiss();
    }
}
