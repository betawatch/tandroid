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
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.sq;
import org.telegram.ui.Components.w9;
import w7.z5;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class p0 extends FrameLayout {
    public static final /* synthetic */ int f = 0;
    public final d6 a;
    public final w9 b;
    public final TextView c;
    public sq d;
    public q0 e;

    public p0(Context context, d6 d6Var) {
        super(context);
        this.a = d6Var;
        w9 w9Var = new w9(context);
        this.b = w9Var;
        addView(w9Var, z5.c(30.0f, 30));
        TextView textView = new TextView(context);
        this.c = textView;
        textView.setTextSize(1, 14.0f);
        addView(textView, z5.d(-2, -2.0f, 16, 36.0f, 0.0f, 14.0f, 0.0f));
        a();
    }

    public final void a() {
        int dp = AndroidUtilities.dp(28.0f);
        int i10 = i6.ci;
        d6 d6Var = this.a;
        setBackground(i6.b0(dp, i6.v0(i10, d6Var)));
        this.c.setTextColor(i6.v0(i6.G6, d6Var));
        sq sqVar = this.d;
        if (sqVar != null) {
            if (this.e.d == 7) {
                i6.v1(sqVar, i6.v0(i6.Oh, d6Var), false);
                i6.v1(this.d, i6.v0(i6.Sh, d6Var), true);
            } else {
                i6.v1(sqVar, i6.v0(i6.Oh, d6Var), false);
                i6.v1(this.d, i6.v0(i6.Sh, d6Var), true);
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
            sq L = i6.L(AndroidUtilities.dp(32.0f), R.drawable.chats_archive);
            this.d = L;
            int dp = AndroidUtilities.dp(16.0f);
            int dp2 = AndroidUtilities.dp(16.0f);
            L.e = dp;
            L.f = dp2;
            i6.v1(this.d, i6.v0(i6.Oh, d6Var), false);
            i6.v1(this.d, i6.v0(i6.Sh, d6Var), true);
            w9Var.setImageDrawable(this.d);
            textView.setText(str);
            return;
        }
        sq L2 = i6.L(AndroidUtilities.dp(32.0f), q0Var.a);
        this.d = L2;
        int i11 = i6.Oh;
        i6.v1(L2, i6.v0(i11, d6Var), false);
        sq sqVar = this.d;
        int i12 = i6.Sh;
        i6.v1(sqVar, i6.v0(i12, d6Var), true);
        if (q0Var.d == 4) {
            TLObject tLObject = q0Var.f;
            if (tLObject instanceof TLRPC.User) {
                TLRPC.User user = (TLRPC.User) tLObject;
                if (UserConfig.getInstance(UserConfig.selectedAccount).getCurrentUser().id == user.id) {
                    sq L3 = i6.L(AndroidUtilities.dp(32.0f), R.drawable.chats_saved);
                    int dp3 = AndroidUtilities.dp(16.0f);
                    int dp4 = AndroidUtilities.dp(16.0f);
                    L3.e = dp3;
                    L3.f = dp4;
                    i6.v1(L3, i6.v0(i11, d6Var), false);
                    i6.v1(L3, i6.v0(i12, d6Var), true);
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
