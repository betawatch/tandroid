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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class ve extends eo0 {
    public final /* synthetic */ ChatActivityEnterView H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ve(ChatActivityEnterView chatActivityEnterView, final Context context, final org.telegram.ui.qn qnVar, MessagesController messagesController, final boolean z10, TLRPC.Peer peer, TLRPC.TL_channels_sendAsPeers tL_channels_sendAsPeers, final androidx.car.app.utils.a aVar, org.telegram.ui.ActionBar.b6 b6Var) {
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
        fh.d2 d2Var = new fh.d2(this, context, 21);
        this.t = d2Var;
        d2Var.setLayoutParams(g7.e6.c(-2.0f, -2));
        setContentView(d2Var);
        setWidth(-2);
        setHeight(-2);
        setBackgroundDrawable(null);
        Drawable mutate = context.getDrawable(R.drawable.popup_fixed_alert4).mutate();
        mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.G8, b6Var), PorterDuff.Mode.MULTIPLY));
        d2Var.setBackground(mutate);
        Rect rect = new Rect();
        mutate.getPadding(rect);
        d2Var.setPadding(rect.left, rect.top, rect.right, rect.bottom);
        int width = (int) ((qnVar == null ? AndroidUtilities.displaySize.x : qnVar.T0.getWidth()) * 0.75f);
        yn0 yn0Var = new yn0(context, width, AndroidUtilities.dp(450.0f));
        this.o = yn0Var;
        yn0Var.setOrientation(1);
        TextView textView = new TextView(context);
        this.p = textView;
        org.telegram.messenger.ll.n(org.telegram.ui.ActionBar.f6.m5, b6Var, textView, 1, 16.0f);
        textView.setText(LocaleController.getString(R.string.SendMessageAsTitle));
        textView.setTypeface(AndroidUtilities.bold(), 1);
        int dp = AndroidUtilities.dp(18.0f);
        textView.setPadding(dp, AndroidUtilities.dp(12.0f), dp, AndroidUtilities.dp(12.0f));
        yn0Var.addView(textView);
        FrameLayout frameLayout = new FrameLayout(context);
        final ArrayList<TLRPC.TL_sendAsPeer> arrayList = tL_channels_sendAsPeers.peers;
        wk0 wk0Var = new wk0(context, null);
        this.v = wk0Var;
        f2.m0 m0Var = new f2.m0();
        this.w = m0Var;
        wk0Var.setLayoutManager(m0Var);
        wk0Var.setAdapter(new zn0(b6Var, arrayList, messagesController, width, peer));
        wk0Var.j(new ao0(this));
        wk0Var.setOnItemClickListener(new mk0() { // from class: org.telegram.ui.Components.xn0
            @Override // org.telegram.ui.Components.mk0
            public final void a(int i9, View view) {
                eo0.k(ve.this, arrayList, context, qnVar, z10, aVar, view, i9);
            }
        });
        wk0Var.setOverScrollMode(2);
        frameLayout.addView(wk0Var);
        View view = new View(context);
        this.u = view;
        Drawable drawable = context.getDrawable(R.drawable.header_shadow);
        drawable.setAlpha(153);
        view.setBackground(drawable);
        view.setAlpha(0.0f);
        frameLayout.addView(view, g7.e6.c(4.0f, -1));
        yn0Var.addView(frameLayout, g7.e6.c(-2.0f, -1));
        d2Var.addView(yn0Var);
    }

    @Override // org.telegram.ui.Components.eo0, org.telegram.ui.ActionBar.o1, android.widget.PopupWindow
    public final void dismiss() {
        ArrayList arrayList = this.z;
        ChatActivityEnterView chatActivityEnterView = this.H;
        if (chatActivityEnterView.m0 != this) {
            super.dismiss();
            return;
        }
        chatActivityEnterView.m0 = null;
        int i9 = 0;
        if (!this.q) {
            l(new o1.j[0]);
            chatActivityEnterView.l0.a(true, true, 0.0f);
            return;
        }
        int size = arrayList.size();
        while (i9 < size) {
            Object obj = arrayList.get(i9);
            i9++;
            ((o1.j) obj).c();
        }
        arrayList.clear();
        super.dismiss();
    }
}
