package org.telegram.ui.Components;

import android.app.Activity;
import android.view.View;
import android.widget.ImageView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationsController;
import org.telegram.messenger.NotificationsSettingsFacade;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class me implements View.OnClickListener {
    public final /* synthetic */ org.telegram.ui.bo a;
    public final /* synthetic */ Activity b;
    public final /* synthetic */ ChatActivityEnterView c;

    public me(ChatActivityEnterView chatActivityEnterView, org.telegram.ui.bo boVar, Activity activity) {
        this.c = chatActivityEnterView;
        this.a = boVar;
        this.b = activity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String str;
        int i10;
        org.telegram.ui.bo boVar = this.a;
        if (boVar == null) {
            return;
        }
        ChatActivityEnterView chatActivityEnterView = this.c;
        chatActivityEnterView.f2 = !chatActivityEnterView.f2;
        if (chatActivityEnterView.e0 == null) {
            chatActivityEnterView.e0 = new nr(this.b, R.drawable.input_notify_on, org.telegram.ui.ActionBar.i6.Wk);
        }
        chatActivityEnterView.e0.a(chatActivityEnterView.f2, true);
        chatActivityEnterView.H1.setImageDrawable(chatActivityEnterView.e0);
        MessagesController.getNotificationsSettings(chatActivityEnterView.Q).edit().putBoolean(NotificationsSettingsFacade.PROPERTY_SILENT + chatActivityEnterView.P2, chatActivityEnterView.f2).commit();
        NotificationsController.getInstance(chatActivityEnterView.Q).updateServerNotificationsSettings(chatActivityEnterView.P2, boVar == null ? 0L : boVar.d());
        boVar.Q7();
        UndoView undoView = boVar.y3;
        if (undoView != null) {
            undoView.j(!chatActivityEnterView.f2 ? 54 : 55, 0L, null);
        }
        ImageView imageView = chatActivityEnterView.H1;
        if (chatActivityEnterView.f2) {
            str = "AccDescrChanSilentOn";
            i10 = R.string.AccDescrChanSilentOn;
        } else {
            str = "AccDescrChanSilentOff";
            i10 = R.string.AccDescrChanSilentOff;
        }
        imageView.setContentDescription(LocaleController.getString(str, i10));
        chatActivityEnterView.H1(true);
    }
}
