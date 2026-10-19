package org.telegram.ui.Components;

import android.app.Activity;
import android.view.View;
import android.widget.ImageView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationsController;
import org.telegram.messenger.NotificationsSettingsFacade;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class oe implements View.OnClickListener {
    public final /* synthetic */ org.telegram.ui.qn a;
    public final /* synthetic */ Activity b;
    public final /* synthetic */ ChatActivityEnterView c;

    public oe(ChatActivityEnterView chatActivityEnterView, org.telegram.ui.qn qnVar, Activity activity) {
        this.c = chatActivityEnterView;
        this.a = qnVar;
        this.b = activity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String str;
        int i10;
        org.telegram.ui.qn qnVar = this.a;
        if (qnVar == null) {
            return;
        }
        ChatActivityEnterView chatActivityEnterView = this.c;
        chatActivityEnterView.g2 = !chatActivityEnterView.g2;
        if (chatActivityEnterView.e0 == null) {
            chatActivityEnterView.e0 = new yr(this.b, R.drawable.input_notify_on, org.telegram.ui.ActionBar.h6.Wk);
        }
        chatActivityEnterView.e0.a(chatActivityEnterView.g2, true);
        chatActivityEnterView.I1.setImageDrawable(chatActivityEnterView.e0);
        MessagesController.getNotificationsSettings(chatActivityEnterView.Q).edit().putBoolean(NotificationsSettingsFacade.PROPERTY_SILENT + chatActivityEnterView.Q2, chatActivityEnterView.g2).commit();
        NotificationsController.getInstance(chatActivityEnterView.Q).updateServerNotificationsSettings(chatActivityEnterView.Q2, qnVar == null ? 0L : qnVar.d());
        qnVar.T7();
        UndoView undoView = qnVar.y3;
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
        chatActivityEnterView.D1(true);
    }
}
