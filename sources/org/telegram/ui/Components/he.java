package org.telegram.ui.Components;

import android.app.Activity;
import android.view.View;
import android.widget.ImageView;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class he implements View.OnClickListener {
    public final /* synthetic */ org.telegram.ui.bn a;
    public final /* synthetic */ Activity b;
    public final /* synthetic */ ChatActivityEnterView c;

    public he(ChatActivityEnterView chatActivityEnterView, org.telegram.ui.bn bnVar, Activity activity) {
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
            chatActivityEnterView.f0 = new hr(this.b, R.drawable.input_notify_on, org.telegram.ui.ActionBar.n6.Nl);
        }
        chatActivityEnterView.f0.a(chatActivityEnterView.W2, true);
        chatActivityEnterView.y2.setImageDrawable(chatActivityEnterView.f0);
        org.telegram.messenger.mp.u1(chatActivityEnterView.R).g7.edit().putBoolean("silent_" + chatActivityEnterView.G3, chatActivityEnterView.W2).commit();
        org.telegram.messenger.xs.t(chatActivityEnterView.R).c0(chatActivityEnterView.G3, bnVar == null ? 0L : bnVar.b(), true);
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
        imageView.setContentDescription(org.telegram.messenger.gd.N0(i7, str));
        chatActivityEnterView.p2(true);
    }
}
