package hg;

import android.content.Context;
import android.graphics.drawable.ShapeDrawable;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.w9;
import org.telegram.ui.Components.yq;
import w7.z5;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final class n0 extends FrameLayout implements b6 {
    public final g6 a;
    public final w9 b;
    public final TextView c;
    public yq d;
    public o0 e;

    public n0(Context context, g6 g6Var) {
        super(context);
        this.a = g6Var;
        w9 w9Var = new w9(context);
        this.b = w9Var;
        addView(w9Var, z5.c(30.0f, 30));
        TextView textView = new TextView(context);
        this.c = textView;
        textView.setTextSize(1, 14.0f);
        addView(textView, z5.d(-2, -2.0f, 16, 36.0f, 0.0f, 14.0f, 0.0f));
        updateColors();
    }

    public void setData(o0 o0Var) {
        this.e = o0Var;
        w9 w9Var = this.b;
        w9Var.getImageReceiver().clearImage();
        int i10 = o0Var.d;
        String str = o0Var.c;
        TextView textView = this.c;
        g6 g6Var = this.a;
        if (i10 == 7) {
            yq M = k6.M(AndroidUtilities.dp(32.0f), R.drawable.chats_archive);
            this.d = M;
            int dp = AndroidUtilities.dp(16.0f);
            int dp2 = AndroidUtilities.dp(16.0f);
            M.e = dp;
            M.f = dp2;
            k6.y1(this.d, k6.w0(k6.Oh, g6Var), false);
            k6.y1(this.d, k6.w0(k6.Sh, g6Var), true);
            w9Var.setImageDrawable(this.d);
            textView.setText(str);
            return;
        }
        yq M2 = k6.M(AndroidUtilities.dp(32.0f), o0Var.a);
        this.d = M2;
        int i11 = k6.Oh;
        k6.y1(M2, k6.w0(i11, g6Var), false);
        yq yqVar = this.d;
        int i12 = k6.Sh;
        k6.y1(yqVar, k6.w0(i12, g6Var), true);
        if (o0Var.d == 4) {
            TLObject tLObject = o0Var.f;
            if (tLObject instanceof TLRPC.User) {
                TLRPC.User user = (TLRPC.User) tLObject;
                if (UserConfig.getInstance(UserConfig.selectedAccount).getCurrentUser().id == user.id) {
                    yq M3 = k6.M(AndroidUtilities.dp(32.0f), R.drawable.chats_saved);
                    int dp3 = AndroidUtilities.dp(16.0f);
                    int dp4 = AndroidUtilities.dp(16.0f);
                    M3.e = dp3;
                    M3.f = dp4;
                    k6.y1(M3, k6.w0(i11, g6Var), false);
                    k6.y1(M3, k6.w0(i12, g6Var), true);
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

    @Override // org.telegram.ui.ActionBar.b6
    public final void updateColors() {
        o0 o0Var;
        boolean z10 = getBackground() instanceof ShapeDrawable;
        g6 g6Var = this.a;
        if (z10) {
            k6.z1(k6.w0(k6.ci, g6Var), getBackground());
            invalidate();
        } else {
            setBackground(k6.c0(AndroidUtilities.dp(28.0f), k6.w0(k6.ci, g6Var)));
        }
        TextView textView = this.c;
        if (textView != null) {
            textView.setTextColor(k6.w0(k6.G6, g6Var));
        }
        yq yqVar = this.d;
        if (yqVar == null || (o0Var = this.e) == null) {
            return;
        }
        if (o0Var.d == 7) {
            k6.y1(yqVar, k6.w0(k6.Oh, g6Var), false);
            k6.y1(this.d, k6.w0(k6.Sh, g6Var), true);
        } else {
            k6.y1(yqVar, k6.w0(k6.Oh, g6Var), false);
            k6.y1(this.d, k6.w0(k6.Sh, g6Var), true);
        }
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
