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

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class xe extends qn0 {
    public final /* synthetic */ ChatActivityEnterView H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xe(ChatActivityEnterView chatActivityEnterView, final Context context, final org.telegram.ui.bn bnVar, org.telegram.messenger.np npVar, final boolean z10, TLRPC.Peer peer, TLRPC.TL_channels_sendAsPeers tL_channels_sendAsPeers, final a3.h hVar, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context);
        this.H = chatActivityEnterView;
        this.b = true;
        this.c = org.telegram.messenger.ls.g2;
        this.f = -1L;
        this.j = new h2.f((int[]) null);
        e();
        this.z = new ArrayList();
        this.G = new ArrayList();
        this.r = peer;
        this.s = tL_channels_sendAsPeers;
        bi.e3 e3Var = new bi.e3(25, context, this);
        this.t = e3Var;
        e3Var.setLayoutParams(c8.ma.c(-2.0f, -2));
        setContentView(e3Var);
        setWidth(-2);
        setHeight(-2);
        setBackgroundDrawable(null);
        Drawable mutate = context.getDrawable(R.drawable.popup_fixed_alert4).mutate();
        org.telegram.ui.ActionBar.t6.x(e3Var, mutate, org.telegram.ui.ActionBar.m6.G8, h6Var, PorterDuff.Mode.MULTIPLY);
        e3Var.setBackground(mutate);
        Rect rect = new Rect();
        mutate.getPadding(rect);
        e3Var.setPadding(rect.left, rect.top, rect.right, rect.bottom);
        int width = (int) ((bnVar == null ? org.telegram.messenger.g0.q.x : bnVar.m1.getWidth()) * 0.75f);
        kn0 kn0Var = new kn0(context, width, org.telegram.messenger.g0.L(450.0f));
        this.o = kn0Var;
        kn0Var.setOrientation(1);
        TextView textView = new TextView(context);
        this.p = textView;
        org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.m5, h6Var);
        textView.setTextSize(1, 16.0f);
        textView.setText(org.telegram.messenger.hd.N0(2131745404, null));
        textView.setTypeface(org.telegram.messenger.g0.o(), 1);
        int L = org.telegram.messenger.g0.L(18.0f);
        textView.setPadding(L, org.telegram.messenger.g0.L(12.0f), L, org.telegram.messenger.g0.L(12.0f));
        kn0Var.addView(textView);
        FrameLayout frameLayout = new FrameLayout(context);
        final ArrayList<TLRPC.TL_sendAsPeer> arrayList = tL_channels_sendAsPeers.peers;
        ek0 ek0Var = new ek0(context, null);
        this.v = ek0Var;
        v4.c0 c0Var = new v4.c0();
        this.w = c0Var;
        ek0Var.setLayoutManager(c0Var);
        ek0Var.setAdapter(new ln0(h6Var, arrayList, npVar, width, peer));
        ek0Var.j(new mn0(this));
        ek0Var.setOnItemClickListener(new qj0(arrayList, context, bnVar, z10, hVar) { // from class: org.telegram.ui.Components.jn0
            public final /* synthetic */ List b;
            public final /* synthetic */ Context c;
            public final /* synthetic */ org.telegram.ui.bn d;
            public final /* synthetic */ a3.h e;

            {
                this.e = hVar;
            }

            @Override // org.telegram.ui.Components.qj0
            public final void c(int i7, View view) {
                qn0.k(xe.this, this.b, this.c, this.d, this.e, view, i7);
            }
        });
        ek0Var.setOverScrollMode(2);
        frameLayout.addView(ek0Var);
        View view = new View(context);
        this.u = view;
        Drawable drawable = context.getDrawable(R.drawable.header_shadow);
        drawable.setAlpha(org.telegram.messenger.ls.j2);
        view.setBackground(drawable);
        view.setAlpha(0.0f);
        frameLayout.addView(view, c8.ma.c(4.0f, -1));
        kn0Var.addView(frameLayout, c8.ma.c(-2.0f, -1));
        e3Var.addView(kn0Var);
    }

    @Override // org.telegram.ui.Components.qn0, org.telegram.ui.ActionBar.g1, android.widget.PopupWindow
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
