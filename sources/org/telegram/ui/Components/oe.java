package org.telegram.ui.Components;

import android.app.Activity;
import android.view.View;
import android.widget.ImageView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationsController;
import org.telegram.messenger.NotificationsSettingsFacade;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class oe implements View.OnClickListener {
    public final /* synthetic */ org.telegram.ui.zn a;
    public final /* synthetic */ Activity b;
    public final /* synthetic */ ChatActivityEnterView c;

    public oe(ChatActivityEnterView chatActivityEnterView, org.telegram.ui.zn znVar, Activity activity) {
        this.c = chatActivityEnterView;
        this.a = znVar;
        this.b = activity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String str;
        int i10;
        org.telegram.ui.zn znVar = this.a;
        if (znVar == null) {
            return;
        }
        ChatActivityEnterView chatActivityEnterView = this.c;
        chatActivityEnterView.g2 = !chatActivityEnterView.g2;
        if (chatActivityEnterView.e0 == null) {
            chatActivityEnterView.e0 = new nr(this.b, R.drawable.input_notify_on, org.telegram.ui.ActionBar.j6.Wk);
        }
        chatActivityEnterView.e0.a(chatActivityEnterView.g2, true);
        chatActivityEnterView.I1.setImageDrawable(chatActivityEnterView.e0);
        MessagesController.getNotificationsSettings(chatActivityEnterView.Q).edit().putBoolean(NotificationsSettingsFacade.PROPERTY_SILENT + chatActivityEnterView.Q2, chatActivityEnterView.g2).commit();
        NotificationsController.getInstance(chatActivityEnterView.Q).updateServerNotificationsSettings(chatActivityEnterView.Q2, znVar == null ? 0L : znVar.d());
        znVar.Q7();
        UndoView undoView = znVar.y3;
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
        chatActivityEnterView.F1(true);
    }
}
