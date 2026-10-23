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
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.w9;
import org.telegram.ui.Components.zq;
import w7.z5;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
public final class n0 extends FrameLayout {
    public static final /* synthetic */ int f = 0;
    public final d6 a;
    public final w9 b;
    public final TextView c;
    public zq d;
    public o0 e;

    public n0(Context context, d6 d6Var) {
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
        int i10 = h6.ci;
        d6 d6Var = this.a;
        setBackground(h6.c0(dp, h6.w0(i10, d6Var)));
        this.c.setTextColor(h6.w0(h6.G6, d6Var));
        zq zqVar = this.d;
        if (zqVar != null) {
            if (this.e.d == 7) {
                h6.w1(zqVar, h6.w0(h6.Oh, d6Var), false);
                h6.w1(this.d, h6.w0(h6.Sh, d6Var), true);
            } else {
                h6.w1(zqVar, h6.w0(h6.Oh, d6Var), false);
                h6.w1(this.d, h6.w0(h6.Sh, d6Var), true);
            }
        }
    }

    public void setData(o0 o0Var) {
        this.e = o0Var;
        w9 w9Var = this.b;
        w9Var.getImageReceiver().clearImage();
        int i10 = o0Var.d;
        String str = o0Var.c;
        TextView textView = this.c;
        d6 d6Var = this.a;
        if (i10 == 7) {
            zq M = h6.M(AndroidUtilities.dp(32.0f), R.drawable.chats_archive);
            this.d = M;
            int dp = AndroidUtilities.dp(16.0f);
            int dp2 = AndroidUtilities.dp(16.0f);
            M.e = dp;
            M.f = dp2;
            h6.w1(this.d, h6.w0(h6.Oh, d6Var), false);
            h6.w1(this.d, h6.w0(h6.Sh, d6Var), true);
            w9Var.setImageDrawable(this.d);
            textView.setText(str);
            return;
        }
        zq M2 = h6.M(AndroidUtilities.dp(32.0f), o0Var.a);
        this.d = M2;
        int i11 = h6.Oh;
        h6.w1(M2, h6.w0(i11, d6Var), false);
        zq zqVar = this.d;
        int i12 = h6.Sh;
        h6.w1(zqVar, h6.w0(i12, d6Var), true);
        if (o0Var.d == 4) {
            TLObject tLObject = o0Var.f;
            if (tLObject instanceof TLRPC.User) {
                TLRPC.User user = (TLRPC.User) tLObject;
                if (UserConfig.getInstance(UserConfig.selectedAccount).getCurrentUser().id == user.id) {
                    zq M3 = h6.M(AndroidUtilities.dp(32.0f), R.drawable.chats_saved);
                    int dp3 = AndroidUtilities.dp(16.0f);
                    int dp4 = AndroidUtilities.dp(16.0f);
                    M3.e = dp3;
                    M3.f = dp4;
                    h6.w1(M3, h6.w0(i11, d6Var), false);
                    h6.w1(M3, h6.w0(i12, d6Var), true);
                    w9Var.setImageDrawable(M3);
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
