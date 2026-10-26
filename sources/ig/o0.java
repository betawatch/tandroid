package ig;

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
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.ar;
import org.telegram.ui.Components.gb1;
import org.telegram.ui.Components.y9;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class o0 extends FrameLayout implements p6 {
    public final u6 a;
    public final y9 b;
    public final TextView c;
    public ar d;
    public p0 e;

    public o0(Context context, u6 u6Var) {
        super(context);
        this.a = u6Var;
        y9 y9Var = new y9(context);
        this.b = y9Var;
        addView(y9Var, gb1.g(30.0f, 30));
        TextView textView = new TextView(context);
        this.c = textView;
        textView.setTextSize(1, 14.0f);
        addView(textView, gb1.h(-2, -2.0f, 16, 36.0f, 0.0f, 14.0f, 0.0f));
        updateColors();
    }

    public void setData(p0 p0Var) {
        this.e = p0Var;
        y9 y9Var = this.b;
        y9Var.getImageReceiver().clearImage();
        int i10 = p0Var.d;
        String str = p0Var.c;
        TextView textView = this.c;
        u6 u6Var = this.a;
        if (i10 == 7) {
            ar M = y6.M(AndroidUtilities.dp(32.0f), R.drawable.chats_archive);
            this.d = M;
            int dp = AndroidUtilities.dp(16.0f);
            int dp2 = AndroidUtilities.dp(16.0f);
            M.e = dp;
            M.f = dp2;
            y6.y1(this.d, y6.w0(y6.Oh, u6Var), false);
            y6.y1(this.d, y6.w0(y6.Sh, u6Var), true);
            y9Var.setImageDrawable(this.d);
            textView.setText(str);
            return;
        }
        ar M2 = y6.M(AndroidUtilities.dp(32.0f), p0Var.a);
        this.d = M2;
        int i11 = y6.Oh;
        y6.y1(M2, y6.w0(i11, u6Var), false);
        ar arVar = this.d;
        int i12 = y6.Sh;
        y6.y1(arVar, y6.w0(i12, u6Var), true);
        if (p0Var.d == 4) {
            TLObject tLObject = p0Var.f;
            if (tLObject instanceof TLRPC.User) {
                TLRPC.User user = (TLRPC.User) tLObject;
                if (UserConfig.getInstance(UserConfig.selectedAccount).getCurrentUser().id == user.id) {
                    ar M3 = y6.M(AndroidUtilities.dp(32.0f), R.drawable.chats_saved);
                    int dp3 = AndroidUtilities.dp(16.0f);
                    int dp4 = AndroidUtilities.dp(16.0f);
                    M3.e = dp3;
                    M3.f = dp4;
                    y6.y1(M3, y6.w0(i11, u6Var), false);
                    y6.y1(M3, y6.w0(i12, u6Var), true);
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

    @Override // org.telegram.ui.ActionBar.p6
    public final void updateColors() {
        p0 p0Var;
        boolean z10 = getBackground() instanceof ShapeDrawable;
        u6 u6Var = this.a;
        if (z10) {
            y6.z1(y6.w0(y6.ci, u6Var), getBackground());
            invalidate();
        } else {
            setBackground(y6.c0(AndroidUtilities.dp(28.0f), y6.w0(y6.ci, u6Var)));
        }
        TextView textView = this.c;
        if (textView != null) {
            textView.setTextColor(y6.w0(y6.G6, u6Var));
        }
        ar arVar = this.d;
        if (arVar == null || (p0Var = this.e) == null) {
            return;
        }
        if (p0Var.d == 7) {
            y6.y1(arVar, y6.w0(y6.Oh, u6Var), false);
            y6.y1(this.d, y6.w0(y6.Sh, u6Var), true);
        } else {
            y6.y1(arVar, y6.w0(y6.Oh, u6Var), false);
            y6.y1(this.d, y6.w0(y6.Sh, u6Var), true);
        }
    }

    @Override // org.telegram.ui.ActionBar.p6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
