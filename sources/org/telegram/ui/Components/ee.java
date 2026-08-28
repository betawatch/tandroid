package org.telegram.ui.Components;

import android.app.Activity;
import android.view.View;
import android.widget.ImageView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationsController;
import org.telegram.messenger.NotificationsSettingsFacade;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class ee implements View.OnClickListener {
    public final /* synthetic */ org.telegram.ui.qn a;
    public final /* synthetic */ Activity b;
    public final /* synthetic */ ChatActivityEnterView c;

    public ee(ChatActivityEnterView chatActivityEnterView, org.telegram.ui.qn qnVar, Activity activity) {
        this.c = chatActivityEnterView;
        this.a = qnVar;
        this.b = activity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String str;
        int i9;
        org.telegram.ui.qn qnVar = this.a;
        if (qnVar == null) {
            return;
        }
        ChatActivityEnterView chatActivityEnterView = this.c;
        chatActivityEnterView.b2 = !chatActivityEnterView.b2;
        if (chatActivityEnterView.a0 == null) {
            chatActivityEnterView.a0 = new dr(this.b, R.drawable.input_notify_on, org.telegram.ui.ActionBar.f6.Wk);
        }
        chatActivityEnterView.a0.a(chatActivityEnterView.b2, true);
        chatActivityEnterView.D1.setImageDrawable(chatActivityEnterView.a0);
        MessagesController.getNotificationsSettings(chatActivityEnterView.M).edit().putBoolean(NotificationsSettingsFacade.PROPERTY_SILENT + chatActivityEnterView.L2, chatActivityEnterView.b2).commit();
        NotificationsController.getInstance(chatActivityEnterView.M).updateServerNotificationsSettings(chatActivityEnterView.L2, qnVar == null ? 0L : qnVar.b());
        qnVar.Q7();
        UndoView undoView = qnVar.u3;
        if (undoView != null) {
            undoView.j(!chatActivityEnterView.b2 ? 54 : 55, 0L, null);
        }
        ImageView imageView = chatActivityEnterView.D1;
        if (chatActivityEnterView.b2) {
            str = "AccDescrChanSilentOn";
            i9 = R.string.AccDescrChanSilentOn;
        } else {
            str = "AccDescrChanSilentOff";
            i9 = R.string.AccDescrChanSilentOff;
        }
        imageView.setContentDescription(LocaleController.getString(str, i9));
        chatActivityEnterView.G1(true);
    }
}
