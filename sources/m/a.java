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
import org.telegram.ui.Components.hg;
import org.telegram.ui.Components.hv0;
import org.telegram.ui.Components.jf;
import org.telegram.ui.Components.jx;
import org.telegram.ui.Components.wy;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class a implements r0.n0, jx {
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
        wy wyVar;
        jf jfVar;
        ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.c;
        if (chatActivityEnterView.s3) {
            return (chatActivityEnterView.u3 || (jfVar = chatActivityEnterView.A0) == null || jfVar.length() <= 0) && (wyVar = chatActivityEnterView.Q0.u0) != null && wyVar.h() > 0 && !chatActivityEnterView.f3;
        }
        return false;
    }

    public void e() {
        ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.c;
        hv0 hv0Var = chatActivityEnterView.h1;
        if (d()) {
            AnimatorSet animatorSet = chatActivityEnterView.w3;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            chatActivityEnterView.z3 = true;
            this.a = chatActivityEnterView.u3;
            chatActivityEnterView.u3 = true;
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 1);
            int height = ((((hv0Var.getHeight() - AndroidUtilities.statusBarHeight) - AndroidUtilities.navigationBarHeight) - AndroidUtilities.dp(6.0f)) - org.telegram.ui.ActionBar.l.getCurrentActionBarHeight()) - chatActivityEnterView.getHeight();
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
            hv0Var.requestLayout();
            if (chatActivityEnterView.t4) {
                hv0Var.setForeground(new cf.f(chatActivityEnterView));
            }
            this.b = (int) chatActivityEnterView.getTranslationY();
            hg hgVar = chatActivityEnterView.U2;
            if (hgVar != null) {
                hgVar.s1();
            }
        }
    }

    public a(MessageDigest messageDigest, int i10) {
        ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN);
        this.c = messageDigest;
        this.b = i10;
    }
}
