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

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class re extends fo0 {
    public final /* synthetic */ ChatActivityEnterView H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public re(ChatActivityEnterView chatActivityEnterView, final Context context, final org.telegram.ui.rn rnVar, MessagesController messagesController, final boolean z10, TLRPC.Peer peer, TLRPC.TL_channels_sendAsPeers tL_channels_sendAsPeers, final ag.l0 l0Var, org.telegram.ui.ActionBar.c6 c6Var) {
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
        ag.p1 p1Var = new ag.p1(this, context, 24);
        this.t = p1Var;
        p1Var.setLayoutParams(h7.z5.c(-2.0f, -2));
        setContentView(p1Var);
        setWidth(-2);
        setHeight(-2);
        setBackgroundDrawable(null);
        Drawable mutate = context.getDrawable(R.drawable.popup_fixed_alert4).mutate();
        mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.G8, c6Var), PorterDuff.Mode.MULTIPLY));
        p1Var.setBackground(mutate);
        Rect rect = new Rect();
        mutate.getPadding(rect);
        p1Var.setPadding(rect.left, rect.top, rect.right, rect.bottom);
        int width = (int) ((rnVar == null ? AndroidUtilities.displaySize.x : rnVar.T0.getWidth()) * 0.75f);
        zn0 zn0Var = new zn0(context, width, AndroidUtilities.dp(450.0f));
        this.o = zn0Var;
        zn0Var.setOrientation(1);
        TextView textView = new TextView(context);
        this.p = textView;
        org.telegram.messenger.rl.l(org.telegram.ui.ActionBar.g6.m5, c6Var, textView, 1, 16.0f);
        textView.setText(LocaleController.getString(R.string.SendMessageAsTitle));
        textView.setTypeface(AndroidUtilities.bold(), 1);
        int dp = AndroidUtilities.dp(18.0f);
        textView.setPadding(dp, AndroidUtilities.dp(12.0f), dp, AndroidUtilities.dp(12.0f));
        zn0Var.addView(textView);
        FrameLayout frameLayout = new FrameLayout(context);
        final ArrayList<TLRPC.TL_sendAsPeer> arrayList = tL_channels_sendAsPeers.peers;
        zk0 zk0Var = new zk0(context, null);
        this.v = zk0Var;
        f2.k0 k0Var = new f2.k0();
        this.w = k0Var;
        zk0Var.setLayoutManager(k0Var);
        zk0Var.setAdapter(new ao0(c6Var, arrayList, messagesController, width, peer));
        zk0Var.j(new bo0(this));
        zk0Var.setOnItemClickListener(new pk0() { // from class: org.telegram.ui.Components.yn0
            @Override // org.telegram.ui.Components.pk0
            public final void a(int i10, View view) {
                fo0.k(re.this, arrayList, context, rnVar, z10, l0Var, view, i10);
            }
        });
        zk0Var.setOverScrollMode(2);
        frameLayout.addView(zk0Var);
        View view = new View(context);
        this.u = view;
        Drawable drawable = context.getDrawable(R.drawable.header_shadow);
        drawable.setAlpha(153);
        view.setBackground(drawable);
        view.setAlpha(0.0f);
        frameLayout.addView(view, h7.z5.c(4.0f, -1));
        zn0Var.addView(frameLayout, h7.z5.c(-2.0f, -1));
        p1Var.addView(zn0Var);
    }

    @Override // org.telegram.ui.Components.fo0, org.telegram.ui.ActionBar.n1, android.widget.PopupWindow
    public final void dismiss() {
        ArrayList arrayList = this.z;
        ChatActivityEnterView chatActivityEnterView = this.H;
        if (chatActivityEnterView.m0 != this) {
            super.dismiss();
            return;
        }
        chatActivityEnterView.m0 = null;
        int i10 = 0;
        if (!this.q) {
            l(new o1.j[0]);
            chatActivityEnterView.l0.a(true, true, 0.0f);
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
