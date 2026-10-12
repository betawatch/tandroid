package org.telegram.ui.Components;

import android.app.Activity;
import android.view.View;
import android.widget.ImageView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationsController;
import org.telegram.messenger.NotificationsSettingsFacade;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class pe implements View.OnClickListener {
    public final /* synthetic */ org.telegram.ui.fo a;
    public final /* synthetic */ Activity b;
    public final /* synthetic */ ChatActivityEnterView c;

    public pe(ChatActivityEnterView chatActivityEnterView, org.telegram.ui.fo foVar, Activity activity) {
        this.c = chatActivityEnterView;
        this.a = foVar;
        this.b = activity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String str;
        int i10;
        org.telegram.ui.fo foVar = this.a;
        if (foVar == null) {
            return;
        }
        ChatActivityEnterView chatActivityEnterView = this.c;
        chatActivityEnterView.g2 = !chatActivityEnterView.g2;
        if (chatActivityEnterView.e0 == null) {
            chatActivityEnterView.e0 = new bs(this.b, R.drawable.input_notify_on, org.telegram.ui.ActionBar.g6.Wk);
        }
        chatActivityEnterView.e0.a(chatActivityEnterView.g2, true);
        chatActivityEnterView.I1.setImageDrawable(chatActivityEnterView.e0);
        MessagesController.getNotificationsSettings(chatActivityEnterView.Q).edit().putBoolean(NotificationsSettingsFacade.PROPERTY_SILENT + chatActivityEnterView.Q2, chatActivityEnterView.g2).commit();
        NotificationsController.getInstance(chatActivityEnterView.Q).updateServerNotificationsSettings(chatActivityEnterView.Q2, foVar == null ? 0L : foVar.d());
        foVar.T7();
        UndoView undoView = foVar.y3;
        if (undoView != null) {
            undoView.j(!chatActivityEnterView.g2 ? 54 : 55, 0L, null);
        }
        ImageView imageView = chatActivityEnterView.I1;
        if (chatActivityEnterView.g2) {
            str = "AccDescrChanSilentOn";
            i10 = R.string.AccDescrChanSilentOn;
        } else {
            str = "AccDescrChanSilentOff";
            i10 = R.string.AccDescrChanSilentOff;
        }
        imageView.setContentDescription(LocaleController.getString(str, i10));
        chatActivityEnterView.E1(true);
    }
}
