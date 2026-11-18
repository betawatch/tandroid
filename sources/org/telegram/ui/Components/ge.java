package org.telegram.ui.Components;

import android.app.Activity;
import android.view.View;
import android.widget.ImageView;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class ge implements View.OnClickListener {
    public final /* synthetic */ org.telegram.ui.bn a;
    public final /* synthetic */ Activity b;
    public final /* synthetic */ ChatActivityEnterView c;

    public ge(ChatActivityEnterView chatActivityEnterView, org.telegram.ui.bn bnVar, Activity activity) {
        this.c = chatActivityEnterView;
        this.a = bnVar;
        this.b = activity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String str;
        int i7;
        org.telegram.ui.bn bnVar = this.a;
        if (bnVar == null) {
            return;
        }
        ChatActivityEnterView chatActivityEnterView = this.c;
        chatActivityEnterView.U2 = !chatActivityEnterView.U2;
        if (chatActivityEnterView.f0 == null) {
            chatActivityEnterView.f0 = new ir(this.b, R.drawable.input_notify_on, org.telegram.ui.ActionBar.n6.Nl);
        }
        chatActivityEnterView.f0.a(chatActivityEnterView.U2, true);
        chatActivityEnterView.w2.setImageDrawable(chatActivityEnterView.f0);
        org.telegram.messenger.mp.u1(chatActivityEnterView.R).g7.edit().putBoolean("silent_" + chatActivityEnterView.E3, chatActivityEnterView.U2).commit();
        org.telegram.messenger.xs.t(chatActivityEnterView.R).c0(chatActivityEnterView.E3, bnVar == null ? 0L : bnVar.d(), true);
        bnVar.h8();
        UndoView undoView = bnVar.N3;
        if (undoView != null) {
            undoView.j(!chatActivityEnterView.U2 ? 54 : 55, 0L, null);
        }
        ImageView imageView = chatActivityEnterView.w2;
        if (chatActivityEnterView.U2) {
            str = "AccDescrChanSilentOn";
            i7 = 2131754906;
        } else {
            str = "AccDescrChanSilentOff";
            i7 = 2131754907;
        }
        imageView.setContentDescription(org.telegram.messenger.gd.M0(i7, str));
        chatActivityEnterView.j2(true);
    }
}
