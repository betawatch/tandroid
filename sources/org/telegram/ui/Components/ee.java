package org.telegram.ui.Components;

import android.app.Activity;
import android.view.View;
import android.widget.ImageView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationsController;
import org.telegram.messenger.NotificationsSettingsFacade;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class ee implements View.OnClickListener {
    public final /* synthetic */ org.telegram.ui.zn a;
    public final /* synthetic */ Activity b;
    public final /* synthetic */ ChatActivityEnterView c;

    public ee(ChatActivityEnterView chatActivityEnterView, org.telegram.ui.zn znVar, Activity activity) {
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
        chatActivityEnterView.c2 = !chatActivityEnterView.c2;
        if (chatActivityEnterView.b0 == null) {
            chatActivityEnterView.b0 = new jr(this.b, R.drawable.input_notify_on, org.telegram.ui.ActionBar.j6.Wk);
        }
        chatActivityEnterView.b0.a(chatActivityEnterView.c2, true);
        chatActivityEnterView.E1.setImageDrawable(chatActivityEnterView.b0);
        MessagesController.getNotificationsSettings(chatActivityEnterView.N).edit().putBoolean(NotificationsSettingsFacade.PROPERTY_SILENT + chatActivityEnterView.M2, chatActivityEnterView.c2).commit();
        NotificationsController.getInstance(chatActivityEnterView.N).updateServerNotificationsSettings(chatActivityEnterView.M2, znVar == null ? 0L : znVar.d());
        znVar.Q7();
        UndoView undoView = znVar.v3;
        if (undoView != null) {
            undoView.j(!chatActivityEnterView.c2 ? 54 : 55, 0L, null);
        }
        ImageView imageView = chatActivityEnterView.E1;
        if (chatActivityEnterView.c2) {
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
