package org.telegram.ui.Components;

import android.app.Activity;
import android.view.View;
import android.widget.ImageView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationsController;
import org.telegram.messenger.NotificationsSettingsFacade;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class he implements View.OnClickListener {
    public final /* synthetic */ org.telegram.ui.tn a;
    public final /* synthetic */ Activity b;
    public final /* synthetic */ ChatActivityEnterView c;

    public he(ChatActivityEnterView chatActivityEnterView, org.telegram.ui.tn tnVar, Activity activity) {
        this.c = chatActivityEnterView;
        this.a = tnVar;
        this.b = activity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String str;
        int i10;
        org.telegram.ui.tn tnVar = this.a;
        if (tnVar == null) {
            return;
        }
        ChatActivityEnterView chatActivityEnterView = this.c;
        chatActivityEnterView.b2 = !chatActivityEnterView.b2;
        if (chatActivityEnterView.a0 == null) {
            chatActivityEnterView.a0 = new gr(this.b, R.drawable.input_notify_on, org.telegram.ui.ActionBar.g6.Wk);
        }
        chatActivityEnterView.a0.a(chatActivityEnterView.b2, true);
        chatActivityEnterView.D1.setImageDrawable(chatActivityEnterView.a0);
        MessagesController.getNotificationsSettings(chatActivityEnterView.M).edit().putBoolean(NotificationsSettingsFacade.PROPERTY_SILENT + chatActivityEnterView.L2, chatActivityEnterView.b2).commit();
        NotificationsController.getInstance(chatActivityEnterView.M).updateServerNotificationsSettings(chatActivityEnterView.L2, tnVar == null ? 0L : tnVar.b());
        tnVar.Q7();
        UndoView undoView = tnVar.u3;
        if (undoView != null) {
            undoView.j(!chatActivityEnterView.b2 ? 54 : 55, 0L, null);
        }
        ImageView imageView = chatActivityEnterView.D1;
        if (chatActivityEnterView.b2) {
            str = "AccDescrChanSilentOn";
            i10 = R.string.AccDescrChanSilentOn;
        } else {
            str = "AccDescrChanSilentOff";
            i10 = R.string.AccDescrChanSilentOff;
        }
        imageView.setContentDescription(LocaleController.getString(str, i10));
        chatActivityEnterView.G1(true);
    }
}
