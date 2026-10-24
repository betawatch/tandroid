package ei;

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
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.am0;
import org.telegram.ui.Components.mm0;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes4.dex */
public final class t8 extends org.telegram.ui.ActionBar.h3 implements NotificationCenter.NotificationCenterDelegate {
    public final int b;
    public ArrayList c;
    public final TLRPC.InputPeer d;
    public final Utilities.Callback e;
    public final mm0 f;
    public final s8 h;
    public final TextView n;

    public t8(Context context, final int i10, boolean z10, TLRPC.InputPeer inputPeer, final Utilities.Callback callback, final org.telegram.ui.ActionBar.g6 g6Var) {
        super(1, context, g6Var, false);
        fixNavigationBar();
        MessagesController.getInstance(i10).getStoriesController().R();
        this.b = i10;
        this.c = MessagesController.getInstance(i10).getStoriesController().T;
        this.d = inputPeer;
        this.e = callback;
        this.containerView = new q8(this, context, g6Var);
        mm0 mm0Var = new mm0(context, g6Var);
        this.f = mm0Var;
        int i11 = this.backgroundPaddingLeft;
        mm0Var.setPadding(i11, 0, i11, 0);
        s8 s8Var = new s8(this);
        this.h = s8Var;
        mm0Var.setAdapter(s8Var);
        mm0Var.setLayoutManager(new s4.b0());
        this.containerView.addView(mm0Var, w7.z5.e(-1, -1, 119));
        mm0Var.setOnItemClickListener(new am0() { // from class: ei.p8
            @Override // org.telegram.ui.Components.am0
            public final void d(int i12, View view) {
                if (i12 <= 1) {
                    return;
                }
                t8 t8Var = t8.this;
                TLRPC.InputPeer inputPeer2 = (TLRPC.InputPeer) t8Var.c.get(i12 - 2);
                long j10 = inputPeer2.channel_id;
                Utilities.Callback callback2 = callback;
                if (j10 == 0 && inputPeer2.chat_id == 0) {
                    callback2.run(inputPeer2);
                    t8Var.dismiss();
                    return;
                }
                Context context2 = t8Var.getContext();
                org.telegram.ui.ActionBar.g6 g6Var2 = g6Var;
                org.telegram.ui.ActionBar.c2 c2Var = new org.telegram.ui.ActionBar.c2(context2, 3, g6Var2);
                c2Var.r(200L);
                MessagesController.getInstance(i10).getStoriesController().k(DialogObject.getPeerDialogId(inputPeer2), new ai.a4(c2Var, callback2, inputPeer2, 5), true, g6Var2);
                t8Var.dismiss();
            }
        });
        mm0Var.setOnScrollListener(new r8(this));
        TextView textView = new TextView(getContext());
        this.n = textView;
        org.telegram.ui.ActionBar.r6.W(textView, org.telegram.ui.ActionBar.k6.G6, g6Var);
        textView.setTextSize(1, 20.0f);
        textView.setPadding(AndroidUtilities.dp(22.0f) + this.backgroundPaddingLeft, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(22.0f) + this.backgroundPaddingLeft, AndroidUtilities.dp(14.0f));
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.h5, textView, g6Var);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setText(LocaleController.getString(z10 ? R.string.StoryPrivacyPublishLiveAs : R.string.StoryPrivacyPublishAs));
        this.containerView.addView(textView, w7.z5.c(-2.0f, -1));
    }

    @Override // org.telegram.ui.ActionBar.h3
    public final boolean canDismissWithSwipe() {
        return t() > ((float) ((int) (((float) AndroidUtilities.displaySize.y) * 0.5f)));
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

    public final float t() {
        int R;
        float measuredHeight = this.containerView.getMeasuredHeight();
        int i10 = 0;
        while (true) {
            mm0 mm0Var = this.f;
            if (i10 >= mm0Var.getChildCount()) {
                return measuredHeight;
            }
            View childAt = mm0Var.getChildAt(i10);
            if (childAt != null && (R = RecyclerView.R(childAt)) != -1 && R > 0) {
                measuredHeight = Math.min(AndroidUtilities.lerp(measuredHeight, childAt.getY(), childAt.getAlpha()), measuredHeight);
            }
            i10++;
        }
    }
}
