// default package

import android.app.Activity;
import android.view.View;
import android.widget.ImageView;
import org.telegram.messenger.beta.R;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class fw1 implements View.OnClickListener {
    public final /* synthetic */ mu1 a;
    public final /* synthetic */ Activity b;
    public final /* synthetic */ ChatActivityEnterView c;

    public fw1(ChatActivityEnterView chatActivityEnterView, mu1 mu1Var, Activity activity) {
        this.c = chatActivityEnterView;
        this.a = mu1Var;
        this.b = activity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String str;
        int i;
        ChatActivityEnterView chatActivityEnterView = this.c;
        ImageView imageView = chatActivityEnterView.y2;
        mu1 mu1Var = this.a;
        if (mu1Var == null) {
            return;
        }
        chatActivityEnterView.W2 = !chatActivityEnterView.W2;
        k33 k33Var = chatActivityEnterView.f0;
        if (k33Var == null) {
            k33Var = new k33(this.b, R.drawable.input_notify_on, bkb.Ml);
            chatActivityEnterView.f0 = k33Var;
        }
        k33Var.a(chatActivityEnterView.W2, true);
        imageView.setImageDrawable(chatActivityEnterView.f0);
        na7.q1(chatActivityEnterView.R).W3.edit().putBoolean("silent_" + chatActivityEnterView.G3, chatActivityEnterView.W2).commit();
        im7.n(chatActivityEnterView.R).c0(chatActivityEnterView.G3, mu1Var.d(), true);
        mu1Var.Z5();
        UndoView undoView = mu1Var.N3;
        if (undoView != null) {
            undoView.j(!chatActivityEnterView.W2 ? 54 : 55, 0L, null);
        }
        if (chatActivityEnterView.W2) {
            str = "AccDescrChanSilentOn";
            i = 2131754906;
        } else {
            str = "AccDescrChanSilentOff";
            i = 2131754907;
        }
        imageView.setContentDescription(k96.M0(i, str));
        chatActivityEnterView.m2(true);
    }
}
