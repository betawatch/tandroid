package kh;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.ll;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.mk0;
import org.telegram.ui.Components.wk0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class u8 extends org.telegram.ui.ActionBar.f3 implements NotificationCenter.NotificationCenterDelegate {
    public final int b;
    public ArrayList c;
    public final TLRPC.InputPeer d;
    public final Utilities.Callback e;
    public final wk0 f;
    public final t8 h;
    public final TextView n;

    public u8(Context context, final int i9, boolean z10, TLRPC.InputPeer inputPeer, final Utilities.Callback callback, final org.telegram.ui.ActionBar.b6 b6Var) {
        super(context, b6Var, false, false);
        fixNavigationBar();
        MessagesController.getInstance(i9).getStoriesController().R();
        this.b = i9;
        this.c = MessagesController.getInstance(i9).getStoriesController().T;
        this.d = inputPeer;
        this.e = callback;
        this.containerView = new r8(this, context, b6Var);
        wk0 wk0Var = new wk0(context, b6Var);
        this.f = wk0Var;
        int i10 = this.backgroundPaddingLeft;
        wk0Var.setPadding(i10, 0, i10, 0);
        t8 t8Var = new t8(this);
        this.h = t8Var;
        wk0Var.setAdapter(t8Var);
        wk0Var.setLayoutManager(new f2.m0());
        this.containerView.addView(wk0Var, g7.e6.e(-1, -1, 119));
        wk0Var.setOnItemClickListener(new mk0() { // from class: kh.q8
            @Override // org.telegram.ui.Components.mk0
            public final void a(int i11, View view) {
                if (i11 <= 1) {
                    return;
                }
                u8 u8Var = u8.this;
                TLRPC.InputPeer inputPeer2 = (TLRPC.InputPeer) u8Var.c.get(i11 - 2);
                long j10 = inputPeer2.channel_id;
                Utilities.Callback callback2 = callback;
                if (j10 == 0 && inputPeer2.chat_id == 0) {
                    callback2.run(inputPeer2);
                    u8Var.dismiss();
                    return;
                }
                Context context2 = u8Var.getContext();
                org.telegram.ui.ActionBar.b6 b6Var2 = b6Var;
                org.telegram.ui.ActionBar.c2 c2Var = new org.telegram.ui.ActionBar.c2(context2, 3, b6Var2);
                c2Var.q(200L);
                MessagesController.getInstance(i9).getStoriesController().k(DialogObject.getPeerDialogId(inputPeer2), new g7(c2Var, callback2, inputPeer2, 1), true, b6Var2);
                u8Var.dismiss();
            }
        });
        wk0Var.setOnScrollListener(new s8(this));
        TextView textView = new TextView(getContext());
        this.n = textView;
        ll.n(org.telegram.ui.ActionBar.f6.G6, b6Var, textView, 1, 20.0f);
        textView.setPadding(AndroidUtilities.dp(22.0f) + this.backgroundPaddingLeft, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(22.0f) + this.backgroundPaddingLeft, AndroidUtilities.dp(14.0f));
        textView.setBackgroundColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.h5, b6Var));
        textView.setTypeface(AndroidUtilities.bold());
        textView.setText(LocaleController.getString(z10 ? R.string.StoryPrivacyPublishLiveAs : R.string.StoryPrivacyPublishAs));
        this.containerView.addView(textView, g7.e6.c(-2.0f, -1));
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final boolean canDismissWithSwipe() {
        return s() > ((float) ((int) (((float) AndroidUtilities.displaySize.y) * 0.5f)));
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        if (i9 == NotificationCenter.storiesSendAsUpdate) {
            this.c = MessagesController.getInstance(this.b).getStoriesController().T;
            this.h.l();
        }
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getInstance(this.b).addObserver(this, NotificationCenter.storiesSendAsUpdate);
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.b).removeObserver(this, NotificationCenter.storiesSendAsUpdate);
    }

    public final float s() {
        int R;
        float measuredHeight = this.containerView.getMeasuredHeight();
        int i9 = 0;
        while (true) {
            wk0 wk0Var = this.f;
            if (i9 >= wk0Var.getChildCount()) {
                return measuredHeight;
            }
            View childAt = wk0Var.getChildAt(i9);
            if (childAt != null && (R = RecyclerView.R(childAt)) != -1 && R > 0) {
                measuredHeight = Math.min(AndroidUtilities.lerp(measuredHeight, childAt.getY(), childAt.getAlpha()), measuredHeight);
            }
            i9++;
        }
    }
}
