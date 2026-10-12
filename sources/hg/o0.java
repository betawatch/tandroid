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
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.cr;
import org.telegram.ui.Components.z9;
import w7.a6;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class o0 extends FrameLayout {
    public static final /* synthetic */ int f = 0;
    public final c6 a;
    public final z9 b;
    public final TextView c;
    public cr d;
    public p0 e;

    public o0(Context context, c6 c6Var) {
        super(context);
        this.a = c6Var;
        z9 z9Var = new z9(context);
        this.b = z9Var;
        addView(z9Var, a6.d(30.0f, 30));
        TextView textView = new TextView(context);
        this.c = textView;
        textView.setTextSize(1, 14.0f);
        addView(textView, a6.a(-2.0f, 36.0f, 0.0f, 14.0f, 0.0f, -2, 16));
        a();
    }

    public final void a() {
        int dp = AndroidUtilities.dp(28.0f);
        int i10 = g6.ci;
        c6 c6Var = this.a;
        setBackground(g6.c0(dp, g6.w0(i10, c6Var)));
        this.c.setTextColor(g6.w0(g6.G6, c6Var));
        cr crVar = this.d;
        if (crVar != null) {
            if (this.e.d == 7) {
                g6.w1(crVar, g6.w0(g6.Oh, c6Var), false);
                g6.w1(this.d, g6.w0(g6.Sh, c6Var), true);
            } else {
                g6.w1(crVar, g6.w0(g6.Oh, c6Var), false);
                g6.w1(this.d, g6.w0(g6.Sh, c6Var), true);
            }
        }
    }

    public void setData(p0 p0Var) {
        this.e = p0Var;
        z9 z9Var = this.b;
        z9Var.getImageReceiver().clearImage();
        int i10 = p0Var.d;
        String str = p0Var.c;
        TextView textView = this.c;
        c6 c6Var = this.a;
        if (i10 == 7) {
            cr M = g6.M(AndroidUtilities.dp(32.0f), R.drawable.chats_archive);
            this.d = M;
            int dp = AndroidUtilities.dp(16.0f);
            int dp2 = AndroidUtilities.dp(16.0f);
            M.e = dp;
            M.f = dp2;
            g6.w1(this.d, g6.w0(g6.Oh, c6Var), false);
            g6.w1(this.d, g6.w0(g6.Sh, c6Var), true);
            z9Var.setImageDrawable(this.d);
            textView.setText(str);
            return;
        }
        cr M2 = g6.M(AndroidUtilities.dp(32.0f), p0Var.a);
        this.d = M2;
        int i11 = g6.Oh;
        g6.w1(M2, g6.w0(i11, c6Var), false);
        cr crVar = this.d;
        int i12 = g6.Sh;
        g6.w1(crVar, g6.w0(i12, c6Var), true);
        if (p0Var.d == 4) {
            TLObject tLObject = p0Var.f;
            if (tLObject instanceof TLRPC.User) {
                TLRPC.User user = (TLRPC.User) tLObject;
                if (UserConfig.getInstance(UserConfig.selectedAccount).getCurrentUser().id == user.id) {
                    cr M3 = g6.M(AndroidUtilities.dp(32.0f), R.drawable.chats_saved);
                    int dp3 = AndroidUtilities.dp(16.0f);
                    int dp4 = AndroidUtilities.dp(16.0f);
                    M3.e = dp3;
                    M3.f = dp4;
                    g6.w1(M3, g6.w0(i11, c6Var), false);
                    g6.w1(M3, g6.w0(i12, c6Var), true);
                    z9Var.setImageDrawable(M3);
                } else {
                    z9Var.getImageReceiver().setRoundRadius(AndroidUtilities.dp(16.0f));
                    z9Var.getImageReceiver().setForUserOrChat(user, this.d);
                }
            } else if (tLObject instanceof TLRPC.Chat) {
                TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                z9Var.getImageReceiver().setRoundRadius(AndroidUtilities.dp(ChatObject.isCommunity(chat) ? 10.0f : 16.0f));
                z9Var.getImageReceiver().setForUserOrChat(chat, this.d);
            }
        } else {
            z9Var.setImageDrawable(this.d);
        }
        textView.setText(str);
    }
}
