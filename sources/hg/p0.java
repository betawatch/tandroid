package hg;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.oq;
import org.telegram.ui.Components.x9;
import w7.x5;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final class p0 extends FrameLayout {
    public static final /* synthetic */ int f = 0;
    public final f6 a;
    public final x9 b;
    public final TextView c;
    public oq d;
    public q0 e;

    public p0(Context context, f6 f6Var) {
        super(context);
        this.a = f6Var;
        x9 x9Var = new x9(context);
        this.b = x9Var;
        addView(x9Var, x5.c(30.0f, 30));
        TextView textView = new TextView(context);
        this.c = textView;
        textView.setTextSize(1, 14.0f);
        addView(textView, x5.d(-2, -2.0f, 16, 36.0f, 0.0f, 14.0f, 0.0f));
        a();
    }

    public final void a() {
        int dp = AndroidUtilities.dp(28.0f);
        int i10 = j6.ci;
        f6 f6Var = this.a;
        setBackground(j6.b0(dp, j6.v0(i10, f6Var)));
        this.c.setTextColor(j6.v0(j6.G6, f6Var));
        oq oqVar = this.d;
        if (oqVar != null) {
            if (this.e.d == 7) {
                j6.v1(oqVar, j6.v0(j6.Oh, f6Var), false);
                j6.v1(this.d, j6.v0(j6.Sh, f6Var), true);
            } else {
                j6.v1(oqVar, j6.v0(j6.Oh, f6Var), false);
                j6.v1(this.d, j6.v0(j6.Sh, f6Var), true);
            }
        }
    }

    public void setData(q0 q0Var) {
        this.e = q0Var;
        x9 x9Var = this.b;
        x9Var.getImageReceiver().clearImage();
        int i10 = q0Var.d;
        String str = q0Var.c;
        TextView textView = this.c;
        f6 f6Var = this.a;
        if (i10 == 7) {
            oq L = j6.L(AndroidUtilities.dp(32.0f), R.drawable.chats_archive);
            this.d = L;
            int dp = AndroidUtilities.dp(16.0f);
            int dp2 = AndroidUtilities.dp(16.0f);
            L.e = dp;
            L.f = dp2;
            j6.v1(this.d, j6.v0(j6.Oh, f6Var), false);
            j6.v1(this.d, j6.v0(j6.Sh, f6Var), true);
            x9Var.setImageDrawable(this.d);
            textView.setText(str);
            return;
        }
        oq L2 = j6.L(AndroidUtilities.dp(32.0f), q0Var.a);
        this.d = L2;
        int i11 = j6.Oh;
        j6.v1(L2, j6.v0(i11, f6Var), false);
        oq oqVar = this.d;
        int i12 = j6.Sh;
        j6.v1(oqVar, j6.v0(i12, f6Var), true);
        if (q0Var.d == 4) {
            TLObject tLObject = q0Var.f;
            if (tLObject instanceof TLRPC.User) {
                TLRPC.User user = (TLRPC.User) tLObject;
                if (UserConfig.getInstance(UserConfig.selectedAccount).getCurrentUser().id == user.id) {
                    oq L3 = j6.L(AndroidUtilities.dp(32.0f), R.drawable.chats_saved);
                    int dp3 = AndroidUtilities.dp(16.0f);
                    int dp4 = AndroidUtilities.dp(16.0f);
                    L3.e = dp3;
                    L3.f = dp4;
                    j6.v1(L3, j6.v0(i11, f6Var), false);
                    j6.v1(L3, j6.v0(i12, f6Var), true);
                    x9Var.setImageDrawable(L3);
                } else {
                    x9Var.getImageReceiver().setRoundRadius(AndroidUtilities.dp(16.0f));
                    x9Var.getImageReceiver().setForUserOrChat(user, this.d);
                }
            } else if (tLObject instanceof TLRPC.Chat) {
                TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                x9Var.getImageReceiver().setRoundRadius(AndroidUtilities.dp(ChatObject.isCommunity(chat) ? 10.0f : 16.0f));
                x9Var.getImageReceiver().setForUserOrChat(chat, this.d);
            }
        } else {
            x9Var.setImageDrawable(this.d);
        }
        textView.setText(str);
    }
}
