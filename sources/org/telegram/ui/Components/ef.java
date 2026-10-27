package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
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

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class ef extends cq0 {
    public final /* synthetic */ ChatActivityEnterView H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ef(ChatActivityEnterView chatActivityEnterView, final Context context, final org.telegram.ui.wn wnVar, MessagesController messagesController, final boolean z10, TLRPC.Peer peer, TLRPC.TL_channels_sendAsPeers tL_channels_sendAsPeers, final androidx.car.app.utils.a aVar, org.telegram.ui.ActionBar.u6 u6Var) {
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
        bh.r rVar = new bh.r(this, context, 22);
        this.t = rVar;
        rVar.setLayoutParams(kb1.g(-2.0f, -2));
        setContentView(rVar);
        setWidth(-2);
        setHeight(-2);
        setBackgroundDrawable(null);
        Drawable mutate = context.getDrawable(R.drawable.popup_fixed_alert4).mutate();
        org.telegram.ui.ActionBar.f7.y(rVar, mutate, org.telegram.ui.ActionBar.y6.G8, u6Var, PorterDuff.Mode.MULTIPLY);
        rVar.setBackground(mutate);
        Rect rect = new Rect();
        mutate.getPadding(rect);
        rVar.setPadding(rect.left, rect.top, rect.right, rect.bottom);
        int width = (int) ((wnVar == null ? AndroidUtilities.displaySize.x : wnVar.j1.getWidth()) * 0.75f);
        wp0 wp0Var = new wp0(context, width, AndroidUtilities.dp(450.0f));
        this.o = wp0Var;
        wp0Var.setOrientation(1);
        TextView textView = new TextView(context);
        this.p = textView;
        org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.m5, u6Var);
        textView.setTextSize(1, 16.0f);
        textView.setText(LocaleController.getString(R.string.SendMessageAsTitle));
        textView.setTypeface(AndroidUtilities.bold(), 1);
        int dp = AndroidUtilities.dp(18.0f);
        textView.setPadding(dp, AndroidUtilities.dp(12.0f), dp, AndroidUtilities.dp(12.0f));
        wp0Var.addView(textView);
        FrameLayout frameLayout = new FrameLayout(context);
        final ArrayList<TLRPC.TL_sendAsPeer> arrayList = tL_channels_sendAsPeers.peers;
        nm0 nm0Var = new nm0(context, null);
        this.v = nm0Var;
        s4.c0 c0Var = new s4.c0();
        this.w = c0Var;
        nm0Var.setLayoutManager(c0Var);
        nm0Var.setAdapter(new xp0(u6Var, arrayList, messagesController, width, peer));
        nm0Var.j(new yp0(this));
        nm0Var.setOnItemClickListener(new am0() { // from class: org.telegram.ui.Components.vp0
            @Override // org.telegram.ui.Components.am0
            public final void c(int i10, View view) {
                cq0.k(ef.this, arrayList, context, wnVar, z10, aVar, view, i10);
            }
        });
        nm0Var.setOverScrollMode(2);
        frameLayout.addView(nm0Var);
        View view = new View(context);
        this.u = view;
        Drawable drawable = context.getDrawable(R.drawable.header_shadow);
        drawable.setAlpha(153);
        view.setBackground(drawable);
        view.setAlpha(0.0f);
        frameLayout.addView(view, kb1.g(4.0f, -1));
        wp0Var.addView(frameLayout, kb1.g(-2.0f, -1));
        rVar.addView(wp0Var);
    }

    @Override // org.telegram.ui.Components.cq0, org.telegram.ui.ActionBar.o1, android.widget.PopupWindow
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
            ((o1.j) obj).c();
        }
        arrayList.clear();
        super.dismiss();
    }
}
