package org.telegram.ui.Components;

import android.app.Activity;
import android.view.View;
import android.widget.ImageView;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class xd implements View.OnClickListener {
    public final /* synthetic */ org.telegram.ui.an a;
    public final /* synthetic */ Activity b;
    public final /* synthetic */ ChatActivityEnterView c;

    public xd(ChatActivityEnterView chatActivityEnterView, org.telegram.ui.an anVar, Activity activity) {
        this.c = chatActivityEnterView;
        this.a = anVar;
        this.b = activity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String str;
        int i7;
        org.telegram.ui.an anVar = this.a;
        if (anVar == null) {
            return;
        }
        ChatActivityEnterView chatActivityEnterView = this.c;
        chatActivityEnterView.O2 = !chatActivityEnterView.O2;
        if (chatActivityEnterView.f0 == null) {
            chatActivityEnterView.f0 = new br(this.b, R.drawable.input_notify_on, org.telegram.ui.ActionBar.j6.Nl);
        }
        chatActivityEnterView.f0.a(chatActivityEnterView.O2, true);
        chatActivityEnterView.q2.setImageDrawable(chatActivityEnterView.f0);
        org.telegram.messenger.np.s1(chatActivityEnterView.R).e7.edit().putBoolean("silent_" + chatActivityEnterView.y3, chatActivityEnterView.O2).commit();
        org.telegram.messenger.at.t(chatActivityEnterView.R).c0(chatActivityEnterView.y3, anVar == null ? 0L : anVar.b(), true);
        anVar.h8();
        UndoView undoView = anVar.N3;
        if (undoView != null) {
            undoView.j(!chatActivityEnterView.O2 ? 54 : 55, 0L, null);
        }
        ImageView imageView = chatActivityEnterView.q2;
        if (chatActivityEnterView.O2) {
            str = "AccDescrChanSilentOn";
            i7 = 2131754906;
        } else {
            str = "AccDescrChanSilentOff";
            i7 = 2131754907;
        }
        imageView.setContentDescription(org.telegram.messenger.hd.M0(i7, str));
        chatActivityEnterView.a2(true);
    }
}
