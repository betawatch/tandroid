package gg;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.qq;
import org.telegram.ui.Components.w9;
import w7.y5;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class p0 extends FrameLayout {
    public static final /* synthetic */ int f = 0;
    public final d6 a;
    public final w9 b;
    public final TextView c;
    public qq d;
    public q0 e;

    public p0(Context context, d6 d6Var) {
        super(context);
        this.a = d6Var;
        w9 w9Var = new w9(context);
        this.b = w9Var;
        addView(w9Var, y5.c(30.0f, 30));
        TextView textView = new TextView(context);
        this.c = textView;
        textView.setTextSize(1, 14.0f);
        addView(textView, y5.d(-2, -2.0f, 16, 36.0f, 0.0f, 14.0f, 0.0f));
        a();
    }

    public final void a() {
        int dp = AndroidUtilities.dp(28.0f);
        int i10 = h6.ci;
        d6 d6Var = this.a;
        setBackground(h6.b0(dp, h6.v0(i10, d6Var)));
        this.c.setTextColor(h6.v0(h6.G6, d6Var));
        qq qqVar = this.d;
        if (qqVar != null) {
            if (this.e.d == 7) {
                h6.v1(qqVar, h6.v0(h6.Oh, d6Var), false);
                h6.v1(this.d, h6.v0(h6.Sh, d6Var), true);
            } else {
                h6.v1(qqVar, h6.v0(h6.Oh, d6Var), false);
                h6.v1(this.d, h6.v0(h6.Sh, d6Var), true);
            }
        }
    }

    public void setData(q0 q0Var) {
        this.e = q0Var;
        w9 w9Var = this.b;
        w9Var.getImageReceiver().clearImage();
        int i10 = q0Var.d;
        String str = q0Var.c;
        TextView textView = this.c;
        d6 d6Var = this.a;
        if (i10 == 7) {
            qq L = h6.L(AndroidUtilities.dp(32.0f), R.drawable.chats_archive);
            this.d = L;
            int dp = AndroidUtilities.dp(16.0f);
            int dp2 = AndroidUtilities.dp(16.0f);
            L.e = dp;
            L.f = dp2;
            h6.v1(this.d, h6.v0(h6.Oh, d6Var), false);
            h6.v1(this.d, h6.v0(h6.Sh, d6Var), true);
            w9Var.setImageDrawable(this.d);
            textView.setText(str);
            return;
        }
        qq L2 = h6.L(AndroidUtilities.dp(32.0f), q0Var.a);
        this.d = L2;
        int i11 = h6.Oh;
        h6.v1(L2, h6.v0(i11, d6Var), false);
        qq qqVar = this.d;
        int i12 = h6.Sh;
        h6.v1(qqVar, h6.v0(i12, d6Var), true);
        if (q0Var.d == 4) {
            TLObject tLObject = q0Var.f;
            if (tLObject instanceof TLRPC.User) {
                TLRPC.User user = (TLRPC.User) tLObject;
                if (UserConfig.getInstance(UserConfig.selectedAccount).getCurrentUser().id == user.id) {
                    qq L3 = h6.L(AndroidUtilities.dp(32.0f), R.drawable.chats_saved);
                    int dp3 = AndroidUtilities.dp(16.0f);
                    int dp4 = AndroidUtilities.dp(16.0f);
                    L3.e = dp3;
                    L3.f = dp4;
                    h6.v1(L3, h6.v0(i11, d6Var), false);
                    h6.v1(L3, h6.v0(i12, d6Var), true);
                    w9Var.setImageDrawable(L3);
                } else {
                    w9Var.getImageReceiver().setRoundRadius(AndroidUtilities.dp(16.0f));
                    w9Var.getImageReceiver().setForUserOrChat(user, this.d);
                }
            } else if (tLObject instanceof TLRPC.Chat) {
                TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                w9Var.getImageReceiver().setRoundRadius(AndroidUtilities.dp(ChatObject.isCommunity(chat) ? 10.0f : 16.0f));
                w9Var.getImageReceiver().setForUserOrChat(chat, this.d);
            }
        } else {
            w9Var.setImageDrawable(this.d);
        }
        textView.setText(str);
    }
}
