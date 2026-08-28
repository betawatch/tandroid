package m;

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
import org.telegram.ui.Components.cx;
import org.telegram.ui.Components.eg;
import org.telegram.ui.Components.ff;
import org.telegram.ui.Components.ny;
import org.telegram.ui.Components.vc;
import org.telegram.ui.Components.xu0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class a implements r0.n0, cx {
    public boolean a;
    public int b;
    public Object c;

    public /* synthetic */ a(FrameLayout frameLayout) {
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
        ny nyVar;
        ff ffVar;
        ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.c;
        if (chatActivityEnterView.s3) {
            return (chatActivityEnterView.u3 || (ffVar = chatActivityEnterView.A0) == null || ffVar.length() <= 0) && (nyVar = chatActivityEnterView.Q0.u0) != null && nyVar.h() > 0 && !chatActivityEnterView.f3;
        }
        return false;
    }

    public void e() {
        ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.c;
        xu0 xu0Var = chatActivityEnterView.h1;
        if (d()) {
            AnimatorSet animatorSet = chatActivityEnterView.w3;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            chatActivityEnterView.z3 = true;
            this.a = chatActivityEnterView.u3;
            chatActivityEnterView.u3 = true;
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 1);
            int height = ((((xu0Var.getHeight() - AndroidUtilities.statusBarHeight) - AndroidUtilities.navigationBarHeight) - AndroidUtilities.dp(6.0f)) - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - chatActivityEnterView.getHeight();
            chatActivityEnterView.y3 = height;
            if (chatActivityEnterView.M1 == 2) {
                int dp = AndroidUtilities.dp(175.0f);
                Point point = AndroidUtilities.displaySize;
                chatActivityEnterView.y3 = Math.min(height, dp + (point.x > point.y ? chatActivityEnterView.t2 : chatActivityEnterView.s2));
            }
            if (chatActivityEnterView.Y4 == null) {
                chatActivityEnterView.Q0.getLayoutParams().height = chatActivityEnterView.y3;
            }
            chatActivityEnterView.Q0.setLayerType(2, null);
            xu0Var.requestLayout();
            if (chatActivityEnterView.t4) {
                xu0Var.setForeground(new vc(chatActivityEnterView));
            }
            this.b = (int) chatActivityEnterView.getTranslationY();
            eg egVar = chatActivityEnterView.U2;
            if (egVar != null) {
                egVar.j1();
            }
        }
    }

    public a(MessageDigest messageDigest, int i9) {
        ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN);
        this.c = messageDigest;
        this.b = i9;
    }
}
