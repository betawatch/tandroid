package org.telegram.ui.Components;

import android.app.Activity;
import android.view.View;
import android.widget.ImageView;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
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
        chatActivityEnterView.W2 = !chatActivityEnterView.W2;
        if (chatActivityEnterView.f0 == null) {
            chatActivityEnterView.f0 = new kr(this.b, R.drawable.input_notify_on, org.telegram.ui.ActionBar.m6.Nl);
        }
        chatActivityEnterView.f0.a(chatActivityEnterView.W2, true);
        chatActivityEnterView.y2.setImageDrawable(chatActivityEnterView.f0);
        org.telegram.messenger.np.u1(chatActivityEnterView.R).g7.edit().putBoolean("silent_" + chatActivityEnterView.G3, chatActivityEnterView.W2).commit();
        org.telegram.messenger.ys.t(chatActivityEnterView.R).c0(chatActivityEnterView.G3, bnVar == null ? 0L : bnVar.d(), true);
        bnVar.h8();
        UndoView undoView = bnVar.N3;
        if (undoView != null) {
            undoView.j(!chatActivityEnterView.W2 ? 54 : 55, 0L, null);
        }
        ImageView imageView = chatActivityEnterView.y2;
        if (chatActivityEnterView.W2) {
            str = "AccDescrChanSilentOn";
            i7 = 2131754906;
        } else {
            str = "AccDescrChanSilentOff";
            i7 = 2131754907;
        }
        imageView.setContentDescription(org.telegram.messenger.hd.N0(i7, str));
        chatActivityEnterView.n2(true);
    }
}
