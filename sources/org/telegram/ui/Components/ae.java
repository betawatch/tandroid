package org.telegram.ui.Components;

import android.app.Activity;
import android.view.View;
import android.widget.ImageView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationsController;
import org.telegram.messenger.NotificationsSettingsFacade;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class ae implements View.OnClickListener {
    public final /* synthetic */ org.telegram.ui.rn a;
    public final /* synthetic */ Activity b;
    public final /* synthetic */ ChatActivityEnterView c;

    public ae(ChatActivityEnterView chatActivityEnterView, org.telegram.ui.rn rnVar, Activity activity) {
        this.c = chatActivityEnterView;
        this.a = rnVar;
        this.b = activity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String str;
        int i10;
        org.telegram.ui.rn rnVar = this.a;
        if (rnVar == null) {
            return;
        }
        ChatActivityEnterView chatActivityEnterView = this.c;
        chatActivityEnterView.b2 = !chatActivityEnterView.b2;
        if (chatActivityEnterView.a0 == null) {
            chatActivityEnterView.a0 = new br(this.b, R.drawable.input_notify_on, org.telegram.ui.ActionBar.g6.Wk);
        }
        chatActivityEnterView.a0.a(chatActivityEnterView.b2, true);
        chatActivityEnterView.D1.setImageDrawable(chatActivityEnterView.a0);
        MessagesController.getNotificationsSettings(chatActivityEnterView.M).edit().putBoolean(NotificationsSettingsFacade.PROPERTY_SILENT + chatActivityEnterView.L2, chatActivityEnterView.b2).commit();
        NotificationsController.getInstance(chatActivityEnterView.M).updateServerNotificationsSettings(chatActivityEnterView.L2, rnVar == null ? 0L : rnVar.b());
        rnVar.Q7();
        UndoView undoView = rnVar.u3;
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
        chatActivityEnterView.F1(true);
    }
}
