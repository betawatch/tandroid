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

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class cf extends wo0 {
    public final /* synthetic */ ChatActivityEnterView H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cf(ChatActivityEnterView chatActivityEnterView, final Context context, final org.telegram.ui.bo boVar, MessagesController messagesController, final boolean z10, TLRPC.Peer peer, TLRPC.TL_channels_sendAsPeers tL_channels_sendAsPeers, final ai.r5 r5Var, org.telegram.ui.ActionBar.f6 f6Var) {
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
        ai.f0 f0Var = new ai.f0(this, context, 18);
        this.t = f0Var;
        f0Var.setLayoutParams(w7.x5.c(-2.0f, -2));
        setContentView(f0Var);
        setWidth(-2);
        setHeight(-2);
        setBackgroundDrawable(null);
        Drawable mutate = context.getDrawable(R.drawable.popup_fixed_alert4).mutate();
        mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.G8, f6Var), PorterDuff.Mode.MULTIPLY));
        f0Var.setBackground(mutate);
        Rect rect = new Rect();
        mutate.getPadding(rect);
        f0Var.setPadding(rect.left, rect.top, rect.right, rect.bottom);
        int width = (int) ((boVar == null ? AndroidUtilities.displaySize.x : boVar.X0.getWidth()) * 0.75f);
        qo0 qo0Var = new qo0(context, width, AndroidUtilities.dp(450.0f));
        this.o = qo0Var;
        qo0Var.setOrientation(1);
        TextView textView = new TextView(context);
        this.p = textView;
        org.telegram.messenger.wl.n(org.telegram.ui.ActionBar.j6.m5, f6Var, textView, 1, 16.0f);
        textView.setText(LocaleController.getString(R.string.SendMessageAsTitle));
        textView.setTypeface(AndroidUtilities.bold(), 1);
        int dp = AndroidUtilities.dp(18.0f);
        textView.setPadding(dp, AndroidUtilities.dp(12.0f), dp, AndroidUtilities.dp(12.0f));
        qo0Var.addView(textView);
        FrameLayout frameLayout = new FrameLayout(context);
        final ArrayList<TLRPC.TL_sendAsPeer> arrayList = tL_channels_sendAsPeers.peers;
        ml0 ml0Var = new ml0(context, null);
        this.v = ml0Var;
        s4.c0 c0Var = new s4.c0();
        this.w = c0Var;
        ml0Var.setLayoutManager(c0Var);
        ml0Var.setAdapter(new ro0(f6Var, arrayList, messagesController, width, peer));
        ml0Var.j(new so0(this));
        ml0Var.setOnItemClickListener(new al0() { // from class: org.telegram.ui.Components.po0
            @Override // org.telegram.ui.Components.al0
            public final void d(int i10, View view) {
                wo0.k(cf.this, arrayList, context, boVar, z10, r5Var, view, i10);
            }
        });
        ml0Var.setOverScrollMode(2);
        frameLayout.addView(ml0Var);
        View view = new View(context);
        this.u = view;
        Drawable drawable = context.getDrawable(R.drawable.header_shadow);
        drawable.setAlpha(153);
        view.setBackground(drawable);
        view.setAlpha(0.0f);
        frameLayout.addView(view, w7.x5.c(4.0f, -1));
        qo0Var.addView(frameLayout, w7.x5.c(-2.0f, -1));
        f0Var.addView(qo0Var);
    }

    @Override // org.telegram.ui.Components.wo0, org.telegram.ui.ActionBar.o1, android.widget.PopupWindow
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
