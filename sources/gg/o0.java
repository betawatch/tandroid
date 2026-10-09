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
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.fr;
import org.telegram.ui.Components.y9;
import w7.x5;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class o0 extends FrameLayout {
    public static final /* synthetic */ int f = 0;
    public final e6 a;
    public final y9 b;
    public final TextView c;
    public fr d;
    public p0 e;

    public o0(Context context, e6 e6Var) {
        super(context);
        this.a = e6Var;
        y9 y9Var = new y9(context);
        this.b = y9Var;
        addView(y9Var, x5.d(30.0f, 30));
        TextView textView = new TextView(context);
        this.c = textView;
        textView.setTextSize(1, 14.0f);
        addView(textView, x5.a(-2.0f, 36.0f, 0.0f, 14.0f, 0.0f, -2, 16));
        a();
    }

    public final void a() {
        int dp = AndroidUtilities.dp(28.0f);
        int i10 = i6.ci;
        e6 e6Var = this.a;
        setBackground(i6.c0(dp, i6.w0(i10, e6Var)));
        this.c.setTextColor(i6.w0(i6.G6, e6Var));
        fr frVar = this.d;
        if (frVar != null) {
            if (this.e.d == 7) {
                i6.w1(frVar, i6.w0(i6.Oh, e6Var), false);
                i6.w1(this.d, i6.w0(i6.Sh, e6Var), true);
            } else {
                i6.w1(frVar, i6.w0(i6.Oh, e6Var), false);
                i6.w1(this.d, i6.w0(i6.Sh, e6Var), true);
            }
        }
    }

    public void setData(p0 p0Var) {
        this.e = p0Var;
        y9 y9Var = this.b;
        y9Var.getImageReceiver().clearImage();
        int i10 = p0Var.d;
        String str = p0Var.c;
        TextView textView = this.c;
        e6 e6Var = this.a;
        if (i10 == 7) {
            fr M = i6.M(AndroidUtilities.dp(32.0f), R.drawable.chats_archive);
            this.d = M;
            int dp = AndroidUtilities.dp(16.0f);
            int dp2 = AndroidUtilities.dp(16.0f);
            M.e = dp;
            M.f = dp2;
            i6.w1(this.d, i6.w0(i6.Oh, e6Var), false);
            i6.w1(this.d, i6.w0(i6.Sh, e6Var), true);
            y9Var.setImageDrawable(this.d);
            textView.setText(str);
            return;
        }
        fr M2 = i6.M(AndroidUtilities.dp(32.0f), p0Var.a);
        this.d = M2;
        int i11 = i6.Oh;
        i6.w1(M2, i6.w0(i11, e6Var), false);
        fr frVar = this.d;
        int i12 = i6.Sh;
        i6.w1(frVar, i6.w0(i12, e6Var), true);
        if (p0Var.d == 4) {
            TLObject tLObject = p0Var.f;
            if (tLObject instanceof TLRPC.User) {
                TLRPC.User user = (TLRPC.User) tLObject;
                if (UserConfig.getInstance(UserConfig.selectedAccount).getCurrentUser().id == user.id) {
                    fr M3 = i6.M(AndroidUtilities.dp(32.0f), R.drawable.chats_saved);
                    int dp3 = AndroidUtilities.dp(16.0f);
                    int dp4 = AndroidUtilities.dp(16.0f);
                    M3.e = dp3;
                    M3.f = dp4;
                    i6.w1(M3, i6.w0(i11, e6Var), false);
                    i6.w1(M3, i6.w0(i12, e6Var), true);
                    y9Var.setImageDrawable(M3);
                } else {
                    y9Var.getImageReceiver().setRoundRadius(AndroidUtilities.dp(16.0f));
                    y9Var.getImageReceiver().setForUserOrChat(user, this.d);
                }
            } else if (tLObject instanceof TLRPC.Chat) {
                TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                y9Var.getImageReceiver().setRoundRadius(AndroidUtilities.dp(ChatObject.isCommunity(chat) ? 10.0f : 16.0f));
                y9Var.getImageReceiver().setForUserOrChat(chat, this.d);
            }
        } else {
            y9Var.setImageDrawable(this.d);
        }
        textView.setText(str);
    }
}
