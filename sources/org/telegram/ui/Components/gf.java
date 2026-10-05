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

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class gf extends pp0 {
    public final /* synthetic */ ChatActivityEnterView H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gf(ChatActivityEnterView chatActivityEnterView, final Context context, final org.telegram.ui.yn ynVar, MessagesController messagesController, final boolean z10, TLRPC.Peer peer, TLRPC.TL_channels_sendAsPeers tL_channels_sendAsPeers, final ai.q5 q5Var, org.telegram.ui.ActionBar.d6 d6Var) {
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
        f0Var.setLayoutParams(w7.z5.c(-2.0f, -2));
        setContentView(f0Var);
        setWidth(-2);
        setHeight(-2);
        setBackgroundDrawable(null);
        Drawable mutate = context.getDrawable(R.drawable.popup_fixed_alert4).mutate();
        mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.G8, d6Var), PorterDuff.Mode.MULTIPLY));
        f0Var.setBackground(mutate);
        Rect rect = new Rect();
        mutate.getPadding(rect);
        f0Var.setPadding(rect.left, rect.top, rect.right, rect.bottom);
        int width = (int) ((ynVar == null ? AndroidUtilities.displaySize.x : ynVar.V0.getWidth()) * 0.75f);
        jp0 jp0Var = new jp0(context, width, AndroidUtilities.dp(450.0f));
        this.o = jp0Var;
        jp0Var.setOrientation(1);
        TextView textView = new TextView(context);
        this.p = textView;
        org.telegram.messenger.bi.m(org.telegram.ui.ActionBar.i6.m5, d6Var, textView, 1, 16.0f);
        textView.setText(LocaleController.getString(R.string.SendMessageAsTitle));
        textView.setTypeface(AndroidUtilities.bold(), 1);
        int dp = AndroidUtilities.dp(18.0f);
        textView.setPadding(dp, AndroidUtilities.dp(12.0f), dp, AndroidUtilities.dp(12.0f));
        jp0Var.addView(textView);
        FrameLayout frameLayout = new FrameLayout(context);
        final ArrayList<TLRPC.TL_sendAsPeer> arrayList = tL_channels_sendAsPeers.peers;
        zl0 zl0Var = new zl0(context, null);
        this.v = zl0Var;
        s4.c0 c0Var = new s4.c0();
        this.w = c0Var;
        zl0Var.setLayoutManager(c0Var);
        zl0Var.setAdapter(new kp0(d6Var, arrayList, messagesController, width, peer));
        zl0Var.j(new lp0(this));
        zl0Var.setOnItemClickListener(new ml0() { // from class: org.telegram.ui.Components.ip0
            @Override // org.telegram.ui.Components.ml0
            public final void d(int i10, View view) {
                pp0.k(gf.this, arrayList, context, ynVar, z10, q5Var, view, i10);
            }
        });
        zl0Var.setOverScrollMode(2);
        frameLayout.addView(zl0Var);
        View view = new View(context);
        this.u = view;
        Drawable drawable = context.getDrawable(R.drawable.header_shadow);
        drawable.setAlpha(153);
        view.setBackground(drawable);
        view.setAlpha(0.0f);
        frameLayout.addView(view, w7.z5.c(4.0f, -1));
        jp0Var.addView(frameLayout, w7.z5.c(-2.0f, -1));
        f0Var.addView(jp0Var);
    }

    @Override // org.telegram.ui.Components.pp0, org.telegram.ui.ActionBar.n1, android.widget.PopupWindow
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
