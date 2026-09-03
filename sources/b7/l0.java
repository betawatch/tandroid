package b7;

import android.animation.AnimatorSet;
import android.graphics.Point;
import android.widget.FrameLayout;
import androidx.appcompat.widget.ActionBarContextView;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.MessageDigest;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.bz;
import org.telegram.ui.Components.eg;
import org.telegram.ui.Components.ff;
import org.telegram.ui.Components.ox;
import org.telegram.ui.Components.qv0;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class l0 implements r0.n0, ox {
    public boolean a;
    public int b;
    public Object c;

    public /* synthetic */ l0(FrameLayout frameLayout) {
        this.c = frameLayout;
    }

    @Override // r0.n0
    public void a() {
        this.a = true;
    }

    @Override // r0.n0
    public void b() {
        super/*android.view.ViewGroup*/.setVisibility(0);
        this.a = false;
    }

    @Override // r0.n0
    public void c() {
        if (this.a) {
            return;
        }
        ActionBarContextView actionBarContextView = (ActionBarContextView) this.c;
        actionBarContextView.f = null;
        super/*android.view.ViewGroup*/.setVisibility(this.b);
    }

    public boolean d() {
        bz bzVar;
        ff ffVar;
        ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.c;
        if (chatActivityEnterView.t3) {
            return (chatActivityEnterView.v3 || (ffVar = chatActivityEnterView.B0) == null || ffVar.length() <= 0) && (bzVar = chatActivityEnterView.R0.v0) != null && bzVar.h() > 0 && !chatActivityEnterView.g3;
        }
        return false;
    }

    public void e() {
        ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.c;
        qv0 qv0Var = chatActivityEnterView.i1;
        if (d()) {
            AnimatorSet animatorSet = chatActivityEnterView.x3;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            chatActivityEnterView.A3 = true;
            this.a = chatActivityEnterView.v3;
            chatActivityEnterView.v3 = true;
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 1);
            int height = ((((qv0Var.getHeight() - AndroidUtilities.statusBarHeight) - AndroidUtilities.navigationBarHeight) - AndroidUtilities.dp(6.0f)) - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - chatActivityEnterView.getHeight();
            chatActivityEnterView.z3 = height;
            if (chatActivityEnterView.N1 == 2) {
                int dp = AndroidUtilities.dp(175.0f);
                Point point = AndroidUtilities.displaySize;
                chatActivityEnterView.z3 = Math.min(height, dp + (point.x > point.y ? chatActivityEnterView.u2 : chatActivityEnterView.t2));
            }
            if (chatActivityEnterView.Z4 == null) {
                chatActivityEnterView.R0.getLayoutParams().height = chatActivityEnterView.z3;
            }
            chatActivityEnterView.R0.setLayerType(2, null);
            qv0Var.requestLayout();
            if (chatActivityEnterView.u4) {
                qv0Var.setForeground(new df.f(chatActivityEnterView));
            }
            this.b = (int) chatActivityEnterView.getTranslationY();
            eg egVar = chatActivityEnterView.V2;
            if (egVar != null) {
                egVar.x1();
            }
        }
    }

    public l0(MessageDigest messageDigest, int i10) {
        ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN);
        this.c = messageDigest;
        this.b = i10;
    }
}
