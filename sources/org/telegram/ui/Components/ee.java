package org.telegram.ui.Components;

import android.app.Activity;
import android.view.View;
import android.widget.ImageView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationsController;
import org.telegram.messenger.NotificationsSettingsFacade;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class ee implements View.OnClickListener {
    public final /* synthetic */ org.telegram.ui.xn a;
    public final /* synthetic */ Activity b;
    public final /* synthetic */ ChatActivityEnterView c;

    public ee(ChatActivityEnterView chatActivityEnterView, org.telegram.ui.xn xnVar, Activity activity) {
        this.c = chatActivityEnterView;
        this.a = xnVar;
        this.b = activity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String str;
        int i10;
        org.telegram.ui.xn xnVar = this.a;
        if (xnVar == null) {
            return;
        }
        ChatActivityEnterView chatActivityEnterView = this.c;
        chatActivityEnterView.c2 = !chatActivityEnterView.c2;
        if (chatActivityEnterView.b0 == null) {
            chatActivityEnterView.b0 = new kr(this.b, R.drawable.input_notify_on, org.telegram.ui.ActionBar.j6.Wk);
        }
        chatActivityEnterView.b0.a(chatActivityEnterView.c2, true);
        chatActivityEnterView.E1.setImageDrawable(chatActivityEnterView.b0);
        MessagesController.getNotificationsSettings(chatActivityEnterView.N).edit().putBoolean(NotificationsSettingsFacade.PROPERTY_SILENT + chatActivityEnterView.M2, chatActivityEnterView.c2).commit();
        NotificationsController.getInstance(chatActivityEnterView.N).updateServerNotificationsSettings(chatActivityEnterView.M2, xnVar == null ? 0L : xnVar.b());
        xnVar.Q7();
        UndoView undoView = xnVar.v3;
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
