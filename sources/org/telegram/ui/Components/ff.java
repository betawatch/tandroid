package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class ff extends vo0 {
    public final /* synthetic */ ChatActivityEnterView H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ff(ChatActivityEnterView chatActivityEnterView, final Context context, final org.telegram.ui.co coVar, MessagesController messagesController, final boolean z10, TLRPC.Peer peer, TLRPC.TL_channels_sendAsPeers tL_channels_sendAsPeers, final androidx.car.app.utils.a aVar, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.H = chatActivityEnterView;
        this.b = true;
        this.c = ImageReceiver.DEFAULT_CROSSFADE_DURATION;
        this.f = -1L;
        this.j = new AnimationNotificationsLocker();
        e();
        this.z = new ArrayList();
        this.G = new ArrayList();
        this.r = peer;
        this.s = tL_channels_sendAsPeers;
        ah.y yVar = new ah.y(this, context, 19);
        this.t = yVar;
        yVar.setLayoutParams(w7.x5.c(-2.0f, -2));
        setContentView(yVar);
        setWidth(-2);
        setHeight(-2);
        setBackgroundDrawable(null);
        Drawable mutate = context.getDrawable(R.drawable.popup_fixed_alert4).mutate();
        mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.G8, f6Var), PorterDuff.Mode.MULTIPLY));
        yVar.setBackground(mutate);
        Rect rect = new Rect();
        mutate.getPadding(rect);
        yVar.setPadding(rect.left, rect.top, rect.right, rect.bottom);
        int width = (int) ((coVar == null ? AndroidUtilities.displaySize.x : coVar.X0.getWidth()) * 0.75f);
        po0 po0Var = new po0(context, width, AndroidUtilities.dp(450.0f));
        this.o = po0Var;
        po0Var.setOrientation(1);
        TextView textView = new TextView(context);
        this.p = textView;
        org.telegram.messenger.wl.n(org.telegram.ui.ActionBar.j6.m5, f6Var, textView, 1, 16.0f);
        textView.setText(LocaleController.getString(R.string.SendMessageAsTitle));
        textView.setTypeface(AndroidUtilities.bold(), 1);
        int dp = AndroidUtilities.dp(18.0f);
        textView.setPadding(dp, AndroidUtilities.dp(12.0f), dp, AndroidUtilities.dp(12.0f));
        po0Var.addView(textView);
        FrameLayout frameLayout = new FrameLayout(context);
        final ArrayList<TLRPC.TL_sendAsPeer> arrayList = tL_channels_sendAsPeers.peers;
        ll0 ll0Var = new ll0(context, null);
        this.v = ll0Var;
        s4.c0 c0Var = new s4.c0();
        this.w = c0Var;
        ll0Var.setLayoutManager(c0Var);
        ll0Var.setAdapter(new qo0(f6Var, arrayList, messagesController, width, peer));
        ll0Var.j(new ro0(this));
        ll0Var.setOnItemClickListener(new zk0() { // from class: org.telegram.ui.Components.oo0
            @Override // org.telegram.ui.Components.zk0
            public final void a(int i10, View view) {
                vo0.k(ff.this, arrayList, context, coVar, z10, aVar, view, i10);
            }
        });
        ll0Var.setOverScrollMode(2);
        frameLayout.addView(ll0Var);
        View view = new View(context);
        this.u = view;
        Drawable drawable = context.getDrawable(R.drawable.header_shadow);
        drawable.setAlpha(153);
        view.setBackground(drawable);
        view.setAlpha(0.0f);
        frameLayout.addView(view, w7.x5.c(4.0f, -1));
        po0Var.addView(frameLayout, w7.x5.c(-2.0f, -1));
        yVar.addView(po0Var);
    }

    @Override // org.telegram.ui.Components.vo0, org.telegram.ui.ActionBar.n1, android.widget.PopupWindow
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
            l(new o1.k[0]);
            chatActivityEnterView.p0.a(true, true, 0.0f);
            return;
        }
        int size = arrayList.size();
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((o1.k) obj).c();
        }
        arrayList.clear();
        super.dismiss();
    }
}
