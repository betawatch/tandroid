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

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class ve extends yo0 {
    public final /* synthetic */ ChatActivityEnterView H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ve(ChatActivityEnterView chatActivityEnterView, final Context context, final org.telegram.ui.zn znVar, MessagesController messagesController, final boolean z4, TLRPC.Peer peer, TLRPC.TL_channels_sendAsPeers tL_channels_sendAsPeers, final androidx.car.app.utils.a aVar, org.telegram.ui.ActionBar.f6 f6Var) {
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
        dg.u2 u2Var = new dg.u2(this, context, 24);
        this.t = u2Var;
        u2Var.setLayoutParams(k7.b6.c(-2.0f, -2));
        setContentView(u2Var);
        setWidth(-2);
        setHeight(-2);
        setBackgroundDrawable(null);
        Drawable mutate = context.getDrawable(R.drawable.popup_fixed_alert4).mutate();
        mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.G8, f6Var), PorterDuff.Mode.MULTIPLY));
        u2Var.setBackground(mutate);
        Rect rect = new Rect();
        mutate.getPadding(rect);
        u2Var.setPadding(rect.left, rect.top, rect.right, rect.bottom);
        int width = (int) ((znVar == null ? AndroidUtilities.displaySize.x : znVar.U0.getWidth()) * 0.75f);
        so0 so0Var = new so0(context, width, AndroidUtilities.dp(450.0f));
        this.o = so0Var;
        so0Var.setOrientation(1);
        TextView textView = new TextView(context);
        this.p = textView;
        org.telegram.ui.b.l(org.telegram.ui.ActionBar.j6.m5, f6Var, textView, 1, 16.0f);
        textView.setText(LocaleController.getString(R.string.SendMessageAsTitle));
        textView.setTypeface(AndroidUtilities.bold(), 1);
        int dp = AndroidUtilities.dp(18.0f);
        textView.setPadding(dp, AndroidUtilities.dp(12.0f), dp, AndroidUtilities.dp(12.0f));
        so0Var.addView(textView);
        FrameLayout frameLayout = new FrameLayout(context);
        final ArrayList<TLRPC.TL_sendAsPeer> arrayList = tL_channels_sendAsPeers.peers;
        rl0 rl0Var = new rl0(context, null);
        this.v = rl0Var;
        f2.i0 i0Var = new f2.i0();
        this.w = i0Var;
        rl0Var.setLayoutManager(i0Var);
        rl0Var.setAdapter(new to0(f6Var, arrayList, messagesController, width, peer));
        rl0Var.j(new uo0(this));
        rl0Var.setOnItemClickListener(new hl0() { // from class: org.telegram.ui.Components.ro0
            @Override // org.telegram.ui.Components.hl0
            public final void d(int i10, View view) {
                yo0.k(ve.this, arrayList, context, znVar, z4, aVar, view, i10);
            }
        });
        rl0Var.setOverScrollMode(2);
        frameLayout.addView(rl0Var);
        View view = new View(context);
        this.u = view;
        Drawable drawable = context.getDrawable(R.drawable.header_shadow);
        drawable.setAlpha(153);
        view.setBackground(drawable);
        view.setAlpha(0.0f);
        frameLayout.addView(view, k7.b6.c(4.0f, -1));
        so0Var.addView(frameLayout, k7.b6.c(-2.0f, -1));
        u2Var.addView(so0Var);
    }

    @Override // org.telegram.ui.Components.yo0, org.telegram.ui.ActionBar.p1, android.widget.PopupWindow
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
