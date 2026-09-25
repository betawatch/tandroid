package ci;

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
import org.telegram.messenger.ok;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.kl0;
import org.telegram.ui.Components.wl0;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes4.dex */
public final class f9 extends org.telegram.ui.ActionBar.e3 implements NotificationCenter.NotificationCenterDelegate {
    public final int b;
    public ArrayList c;
    public final TLRPC.InputPeer d;
    public final Utilities.Callback e;
    public final wl0 f;
    public final e9 h;
    public final TextView n;

    public f9(Context context, final int i10, boolean z10, TLRPC.InputPeer inputPeer, final Utilities.Callback callback, final org.telegram.ui.ActionBar.d6 d6Var) {
        super(1, context, d6Var, false);
        fixNavigationBar();
        MessagesController.getInstance(i10).getStoriesController().R();
        this.b = i10;
        this.c = MessagesController.getInstance(i10).getStoriesController().T;
        this.d = inputPeer;
        this.e = callback;
        this.containerView = new c9(this, context, d6Var);
        wl0 wl0Var = new wl0(context, d6Var);
        this.f = wl0Var;
        int i11 = this.backgroundPaddingLeft;
        wl0Var.setPadding(i11, 0, i11, 0);
        e9 e9Var = new e9(this);
        this.h = e9Var;
        wl0Var.setAdapter(e9Var);
        wl0Var.setLayoutManager(new s4.c0());
        this.containerView.addView(wl0Var, w7.y5.e(-1, -1, 119));
        wl0Var.setOnItemClickListener(new kl0() { // from class: ci.b9
            @Override // org.telegram.ui.Components.kl0
            public final void d(int i12, View view) {
                if (i12 <= 1) {
                    return;
                }
                f9 f9Var = f9.this;
                TLRPC.InputPeer inputPeer2 = (TLRPC.InputPeer) f9Var.c.get(i12 - 2);
                long j3 = inputPeer2.channel_id;
                Utilities.Callback callback2 = callback;
                if (j3 == 0 && inputPeer2.chat_id == 0) {
                    callback2.run(inputPeer2);
                    f9Var.dismiss();
                    return;
                }
                Context context2 = f9Var.getContext();
                org.telegram.ui.ActionBar.d6 d6Var2 = d6Var;
                org.telegram.ui.ActionBar.a2 a2Var = new org.telegram.ui.ActionBar.a2(context2, 3, d6Var2);
                a2Var.q(200L);
                MessagesController.getInstance(i10).getStoriesController().k(DialogObject.getPeerDialogId(inputPeer2), new ai.c5(a2Var, callback2, inputPeer2, 4), true, d6Var2);
                f9Var.dismiss();
            }
        });
        wl0Var.setOnScrollListener(new d9(this));
        TextView textView = new TextView(getContext());
        this.n = textView;
        ok.n(org.telegram.ui.ActionBar.h6.G6, d6Var, textView, 1, 20.0f);
        textView.setPadding(AndroidUtilities.dp(22.0f) + this.backgroundPaddingLeft, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(22.0f) + this.backgroundPaddingLeft, AndroidUtilities.dp(14.0f));
        textView.setBackgroundColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.h5, d6Var));
        textView.setTypeface(AndroidUtilities.bold());
        textView.setText(LocaleController.getString(z10 ? R.string.StoryPrivacyPublishLiveAs : R.string.StoryPrivacyPublishAs));
        this.containerView.addView(textView, w7.y5.c(-2.0f, -1));
    }

    @Override // org.telegram.ui.ActionBar.e3
    public final boolean canDismissWithSwipe() {
        return s() > ((float) ((int) (((float) AndroidUtilities.displaySize.y) * 0.5f)));
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.storiesSendAsUpdate) {
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
        int i10 = 0;
        while (true) {
            wl0 wl0Var = this.f;
            if (i10 >= wl0Var.getChildCount()) {
                return measuredHeight;
            }
            View childAt = wl0Var.getChildAt(i10);
            if (childAt != null && (R = RecyclerView.R(childAt)) != -1 && R > 0) {
                measuredHeight = Math.min(AndroidUtilities.lerp(measuredHeight, childAt.getY(), childAt.getAlpha()), measuredHeight);
            }
            i10++;
        }
    }
}
