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
import org.telegram.ui.Components.ag;
import org.telegram.ui.Components.bf;
import org.telegram.ui.Components.cx;
import org.telegram.ui.Components.py;
import org.telegram.ui.Components.zu0;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
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
        py pyVar;
        bf bfVar;
        ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.c;
        if (chatActivityEnterView.s3) {
            return (chatActivityEnterView.u3 || (bfVar = chatActivityEnterView.A0) == null || bfVar.length() <= 0) && (pyVar = chatActivityEnterView.Q0.u0) != null && pyVar.h() > 0 && !chatActivityEnterView.f3;
        }
        return false;
    }

    public void e() {
        ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.c;
        zu0 zu0Var = chatActivityEnterView.h1;
        if (d()) {
            AnimatorSet animatorSet = chatActivityEnterView.w3;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            chatActivityEnterView.z3 = true;
            this.a = chatActivityEnterView.u3;
            chatActivityEnterView.u3 = true;
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 1);
            int height = ((((zu0Var.getHeight() - AndroidUtilities.statusBarHeight) - AndroidUtilities.navigationBarHeight) - AndroidUtilities.dp(6.0f)) - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - chatActivityEnterView.getHeight();
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
            zu0Var.requestLayout();
            if (chatActivityEnterView.t4) {
                zu0Var.setForeground(new af.g(chatActivityEnterView));
            }
            this.b = (int) chatActivityEnterView.getTranslationY();
            ag agVar = chatActivityEnterView.U2;
            if (agVar != null) {
                agVar.k1();
            }
        }
    }

    public a(MessageDigest messageDigest, int i10) {
        ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN);
        this.c = messageDigest;
        this.b = i10;
    }
}
