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
import org.telegram.messenger.wl;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.al0;
import org.telegram.ui.Components.ml0;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes4.dex */
public final class i9 extends org.telegram.ui.ActionBar.g3 implements NotificationCenter.NotificationCenterDelegate {
    public final int b;
    public ArrayList c;
    public final TLRPC.InputPeer d;
    public final Utilities.Callback e;
    public final ml0 f;
    public final h9 h;
    public final TextView n;

    public i9(Context context, final int i10, boolean z10, TLRPC.InputPeer inputPeer, final Utilities.Callback callback, final org.telegram.ui.ActionBar.f6 f6Var) {
        super(1, context, f6Var, false);
        fixNavigationBar();
        MessagesController.getInstance(i10).getStoriesController().R();
        this.b = i10;
        this.c = MessagesController.getInstance(i10).getStoriesController().T;
        this.d = inputPeer;
        this.e = callback;
        this.containerView = new f9(this, context, f6Var);
        ml0 ml0Var = new ml0(context, f6Var);
        this.f = ml0Var;
        int i11 = this.backgroundPaddingLeft;
        ml0Var.setPadding(i11, 0, i11, 0);
        h9 h9Var = new h9(this);
        this.h = h9Var;
        ml0Var.setAdapter(h9Var);
        ml0Var.setLayoutManager(new s4.c0());
        this.containerView.addView(ml0Var, w7.x5.e(-1, -1, 119));
        ml0Var.setOnItemClickListener(new al0() { // from class: ci.e9
            @Override // org.telegram.ui.Components.al0
            public final void d(int i12, View view) {
                if (i12 <= 1) {
                    return;
                }
                i9 i9Var = i9.this;
                TLRPC.InputPeer inputPeer2 = (TLRPC.InputPeer) i9Var.c.get(i12 - 2);
                long j3 = inputPeer2.channel_id;
                Utilities.Callback callback2 = callback;
                if (j3 == 0 && inputPeer2.chat_id == 0) {
                    callback2.run(inputPeer2);
                    i9Var.dismiss();
                    return;
                }
                Context context2 = i9Var.getContext();
                org.telegram.ui.ActionBar.f6 f6Var2 = f6Var;
                org.telegram.ui.ActionBar.c2 c2Var = new org.telegram.ui.ActionBar.c2(context2, 3, f6Var2);
                c2Var.q(200L);
                MessagesController.getInstance(i10).getStoriesController().k(DialogObject.getPeerDialogId(inputPeer2), new s7(c2Var, callback2, inputPeer2, 1), true, f6Var2);
                i9Var.dismiss();
            }
        });
        ml0Var.setOnScrollListener(new g9(this));
        TextView textView = new TextView(getContext());
        this.n = textView;
        wl.n(org.telegram.ui.ActionBar.j6.G6, f6Var, textView, 1, 20.0f);
        textView.setPadding(AndroidUtilities.dp(22.0f) + this.backgroundPaddingLeft, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(22.0f) + this.backgroundPaddingLeft, AndroidUtilities.dp(14.0f));
        textView.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.h5, f6Var));
        textView.setTypeface(AndroidUtilities.bold());
        textView.setText(LocaleController.getString(z10 ? R.string.StoryPrivacyPublishLiveAs : R.string.StoryPrivacyPublishAs));
        this.containerView.addView(textView, w7.x5.c(-2.0f, -1));
    }

    @Override // org.telegram.ui.ActionBar.g3
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
        int S;
        float measuredHeight = this.containerView.getMeasuredHeight();
        int i10 = 0;
        while (true) {
            ml0 ml0Var = this.f;
            if (i10 >= ml0Var.getChildCount()) {
                return measuredHeight;
            }
            View childAt = ml0Var.getChildAt(i10);
            if (childAt != null && (S = RecyclerView.S(childAt)) != -1 && S > 0) {
                measuredHeight = Math.min(AndroidUtilities.lerp(measuredHeight, childAt.getY(), childAt.getAlpha()), measuredHeight);
            }
            i10++;
        }
    }
}
