package org.telegram.ui.Components;

import android.app.Activity;
import android.view.View;
import android.widget.ImageView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationsController;
import org.telegram.messenger.NotificationsSettingsFacade;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class oe implements View.OnClickListener {
    public final /* synthetic */ org.telegram.ui.xn a;
    public final /* synthetic */ Activity b;
    public final /* synthetic */ ChatActivityEnterView c;

    public oe(ChatActivityEnterView chatActivityEnterView, org.telegram.ui.xn xnVar, Activity activity) {
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
        chatActivityEnterView.f2 = !chatActivityEnterView.f2;
        if (chatActivityEnterView.e0 == null) {
            chatActivityEnterView.e0 = new or(this.b, R.drawable.input_notify_on, org.telegram.ui.ActionBar.h6.Wk);
        }
        chatActivityEnterView.e0.a(chatActivityEnterView.f2, true);
        chatActivityEnterView.H1.setImageDrawable(chatActivityEnterView.e0);
        MessagesController.getNotificationsSettings(chatActivityEnterView.Q).edit().putBoolean(NotificationsSettingsFacade.PROPERTY_SILENT + chatActivityEnterView.P2, chatActivityEnterView.f2).commit();
        NotificationsController.getInstance(chatActivityEnterView.Q).updateServerNotificationsSettings(chatActivityEnterView.P2, xnVar == null ? 0L : xnVar.d());
        xnVar.Q7();
        UndoView undoView = xnVar.y3;
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
