package c2;

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
import org.telegram.ui.Components.cd;
import org.telegram.ui.Components.mg;
import org.telegram.ui.Components.of;
import org.telegram.ui.Components.px;
import org.telegram.ui.Components.qv0;
import r0.m0;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes.dex */
public final class a implements m0, px {
    public boolean a;
    public int b;
    public Object c;

    public /* synthetic */ a(FrameLayout frameLayout) {
        this.c = frameLayout;
    }

    @Override // r0.m0
    public void a() {
        this.a = true;
    }

    @Override // r0.m0
    public void b() {
        super/*android.view.ViewGroup*/.setVisibility(0);
        this.a = false;
    }

    @Override // r0.m0
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
        of ofVar;
        ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.c;
        if (chatActivityEnterView.w3) {
            return (chatActivityEnterView.y3 || (ofVar = chatActivityEnterView.E0) == null || ofVar.length() <= 0) && (bzVar = chatActivityEnterView.U0.y0) != null && bzVar.h() > 0 && !chatActivityEnterView.j3;
        }
        return false;
    }

    public void e() {
        ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.c;
        qv0 qv0Var = chatActivityEnterView.l1;
        if (d()) {
            AnimatorSet animatorSet = chatActivityEnterView.A3;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            chatActivityEnterView.D3 = true;
            this.a = chatActivityEnterView.y3;
            chatActivityEnterView.y3 = true;
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 1);
            int height = ((((qv0Var.getHeight() - AndroidUtilities.statusBarHeight) - AndroidUtilities.navigationBarHeight) - AndroidUtilities.dp(6.0f)) - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - chatActivityEnterView.getHeight();
            chatActivityEnterView.C3 = height;
            if (chatActivityEnterView.Q1 == 2) {
                int dp = AndroidUtilities.dp(175.0f);
                Point point = AndroidUtilities.displaySize;
                chatActivityEnterView.C3 = Math.min(height, dp + (point.x > point.y ? chatActivityEnterView.x2 : chatActivityEnterView.w2));
            }
            if (chatActivityEnterView.d5 == null) {
                chatActivityEnterView.U0.getLayoutParams().height = chatActivityEnterView.C3;
            }
            chatActivityEnterView.U0.setLayerType(2, null);
            qv0Var.requestLayout();
            if (chatActivityEnterView.y4) {
                qv0Var.setForeground(new cd(chatActivityEnterView));
            }
            this.b = (int) chatActivityEnterView.getTranslationY();
            mg mgVar = chatActivityEnterView.Y2;
            if (mgVar != null) {
                mgVar.s1();
            }
        }
    }

    public a(MessageDigest messageDigest, int i10) {
        ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN);
        this.c = messageDigest;
        this.b = i10;
    }
}
