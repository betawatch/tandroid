// default package

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
import org.telegram.ui.Components.ChatActivityEnterView;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class hy1 extends l6a {
    public final /* synthetic */ ChatActivityEnterView H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hy1(ChatActivityEnterView chatActivityEnterView, final Context context, final yv1 yv1Var, oc7 oc7Var, final boolean z, TLRPC.Peer peer, TLRPC.TL_channels_sendAsPeers tL_channels_sendAsPeers, final jf jfVar, ylb ylbVar) {
        super(context);
        this.H = chatActivityEnterView;
        this.b = true;
        this.c = (short) 150;
        this.f = -1L;
        this.j = new po(null);
        e();
        this.z = new ArrayList();
        this.G = new ArrayList();
        this.r = peer;
        this.s = tL_channels_sendAsPeers;
        ne6 ne6Var = new ne6((byte) 20, context, this);
        this.t = ne6Var;
        ne6Var.setLayoutParams(qoe.c(-2.0f, -2));
        setContentView(ne6Var);
        setWidth(-2);
        setHeight(-2);
        setBackgroundDrawable(null);
        Drawable mutate = context.getDrawable(R.drawable.popup_fixed_alert4).mutate();
        anb.x(ne6Var, mutate, cmb.F8, ylbVar, PorterDuff.Mode.MULTIPLY);
        ne6Var.setBackground(mutate);
        Rect rect = new Rect();
        mutate.getPadding(rect);
        ne6Var.setPadding(rect.left, rect.top, rect.right, rect.bottom);
        int width = (int) ((yv1Var == null ? gm.q.x : yv1Var.m1.getWidth()) * 0.75f);
        f6a f6aVar = new f6a(context, width, gm.L(450.0f));
        this.o = f6aVar;
        f6aVar.setOrientation(1);
        TextView textView = new TextView(context);
        this.p = textView;
        anb.X(textView, cmb.l5, ylbVar);
        textView.setTextSize(1, 16.0f);
        textView.setText(jb6.M0(2131745334, null));
        textView.setTypeface(gm.o(), 1);
        int L = gm.L(18.0f);
        textView.setPadding(L, gm.L(12.0f), L, gm.L(12.0f));
        f6aVar.addView(textView);
        FrameLayout frameLayout = new FrameLayout(context);
        final ArrayList<TLRPC.TL_sendAsPeer> arrayList = tL_channels_sendAsPeers.peers;
        r59 r59Var = new r59(context, null);
        this.v = r59Var;
        u46 u46Var = new u46();
        this.w = u46Var;
        r59Var.setLayoutManager(u46Var);
        r59Var.setAdapter(new g6a(ylbVar, arrayList, oc7Var, width, peer));
        r59Var.j(new h6a(this));
        r59Var.setOnItemClickListener(new f59(arrayList, context, yv1Var, z, jfVar) { // from class: d6a
            public final /* synthetic */ List b;
            public final /* synthetic */ Context c;
            public final /* synthetic */ yv1 d;
            public final /* synthetic */ jf e;

            {
                this.e = jfVar;
            }

            @Override // f59
            public final void g(int i, View view) {
                hy1.this.k(this.b, this.c, this.d, this.e, view, i);
            }
        });
        r59Var.setOverScrollMode(2);
        frameLayout.addView(r59Var);
        View view = new View(context);
        this.u = view;
        Drawable drawable = context.getDrawable(R.drawable.header_shadow);
        drawable.setAlpha(nm7.i2);
        view.setBackground(drawable);
        view.setAlpha(0.0f);
        frameLayout.addView(view, qoe.c(4.0f, -1));
        f6aVar.addView(frameLayout, qoe.c(-2.0f, -1));
        ne6Var.addView(f6aVar);
    }

    @Override // l6a, m8, android.widget.PopupWindow
    public final void dismiss() {
        ArrayList arrayList = this.z;
        ChatActivityEnterView chatActivityEnterView = this.H;
        if (chatActivityEnterView.r0 != this) {
            super.dismiss();
            return;
        }
        chatActivityEnterView.r0 = null;
        int i = 0;
        if (!this.q) {
            l(new zna[0]);
            chatActivityEnterView.q0.a(true, true, 0.0f);
            return;
        }
        int size = arrayList.size();
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((zna) obj).d();
        }
        arrayList.clear();
        super.dismiss();
    }
}
