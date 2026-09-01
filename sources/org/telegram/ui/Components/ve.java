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

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class ve extends ap0 {
    public final /* synthetic */ ChatActivityEnterView H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ve(ChatActivityEnterView chatActivityEnterView, final Context context, final org.telegram.ui.xn xnVar, MessagesController messagesController, final boolean z4, TLRPC.Peer peer, TLRPC.TL_channels_sendAsPeers tL_channels_sendAsPeers, final androidx.car.app.utils.a aVar, org.telegram.ui.ActionBar.g6 g6Var) {
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
        eg.s2 s2Var = new eg.s2(this, context, 24);
        this.t = s2Var;
        s2Var.setLayoutParams(k7.c6.c(-2.0f, -2));
        setContentView(s2Var);
        setWidth(-2);
        setHeight(-2);
        setBackgroundDrawable(null);
        Drawable mutate = context.getDrawable(R.drawable.popup_fixed_alert4).mutate();
        mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.G8, g6Var), PorterDuff.Mode.MULTIPLY));
        s2Var.setBackground(mutate);
        Rect rect = new Rect();
        mutate.getPadding(rect);
        s2Var.setPadding(rect.left, rect.top, rect.right, rect.bottom);
        int width = (int) ((xnVar == null ? AndroidUtilities.displaySize.x : xnVar.U0.getWidth()) * 0.75f);
        uo0 uo0Var = new uo0(context, width, AndroidUtilities.dp(450.0f));
        this.o = uo0Var;
        uo0Var.setOrientation(1);
        TextView textView = new TextView(context);
        this.p = textView;
        org.telegram.ui.b.l(org.telegram.ui.ActionBar.k6.m5, g6Var, textView, 1, 16.0f);
        textView.setText(LocaleController.getString(R.string.SendMessageAsTitle));
        textView.setTypeface(AndroidUtilities.bold(), 1);
        int dp = AndroidUtilities.dp(18.0f);
        textView.setPadding(dp, AndroidUtilities.dp(12.0f), dp, AndroidUtilities.dp(12.0f));
        uo0Var.addView(textView);
        FrameLayout frameLayout = new FrameLayout(context);
        final ArrayList<TLRPC.TL_sendAsPeer> arrayList = tL_channels_sendAsPeers.peers;
        tl0 tl0Var = new tl0(context, null);
        this.v = tl0Var;
        f2.j0 j0Var = new f2.j0();
        this.w = j0Var;
        tl0Var.setLayoutManager(j0Var);
        tl0Var.setAdapter(new vo0(g6Var, arrayList, messagesController, width, peer));
        tl0Var.j(new wo0(this));
        tl0Var.setOnItemClickListener(new jl0() { // from class: org.telegram.ui.Components.to0
            @Override // org.telegram.ui.Components.jl0
            public final void f(int i10, View view) {
                ap0.k(ve.this, arrayList, context, xnVar, z4, aVar, view, i10);
            }
        });
        tl0Var.setOverScrollMode(2);
        frameLayout.addView(tl0Var);
        View view = new View(context);
        this.u = view;
        Drawable drawable = context.getDrawable(R.drawable.header_shadow);
        drawable.setAlpha(153);
        view.setBackground(drawable);
        view.setAlpha(0.0f);
        frameLayout.addView(view, k7.c6.c(4.0f, -1));
        uo0Var.addView(frameLayout, k7.c6.c(-2.0f, -1));
        s2Var.addView(uo0Var);
    }

    @Override // org.telegram.ui.Components.ap0, org.telegram.ui.ActionBar.p1, android.widget.PopupWindow
    public final void dismiss() {
        ArrayList arrayList = this.z;
        ChatActivityEnterView chatActivityEnterView = this.H;
        if (chatActivityEnterView.n0 != this) {
            super.dismiss();
            return;
        }
        chatActivityEnterView.n0 = null;
        int i10 = 0;
        if (!this.q) {
            l(new o1.j[0]);
            chatActivityEnterView.m0.a(true, true, 0.0f);
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
