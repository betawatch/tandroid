package d5;

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
import org.telegram.ui.Components.dd;
import org.telegram.ui.Components.jz;
import org.telegram.ui.Components.og;
import org.telegram.ui.Components.pf;
import org.telegram.ui.Components.ww0;
import org.telegram.ui.Components.wx;
import r0.m0;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class f implements m0, wx {
    public int a;
    public boolean b;
    public Object c;

    public /* synthetic */ f(FrameLayout frameLayout) {
        this.c = frameLayout;
    }

    @Override // r0.m0
    public void a() {
        this.b = true;
    }

    @Override // r0.m0
    public void b() {
        super/*android.view.ViewGroup*/.setVisibility(0);
        this.b = false;
    }

    @Override // r0.m0
    public void c() {
        if (this.b) {
            return;
        }
        ActionBarContextView actionBarContextView = (ActionBarContextView) this.c;
        actionBarContextView.f = null;
        super/*android.view.ViewGroup*/.setVisibility(this.a);
    }

    public boolean d() {
        jz jzVar;
        pf pfVar;
        ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.c;
        if (chatActivityEnterView.x3) {
            return (chatActivityEnterView.z3 || (pfVar = chatActivityEnterView.E0) == null || pfVar.length() <= 0) && (jzVar = chatActivityEnterView.U0.y0) != null && jzVar.h() > 0 && !chatActivityEnterView.k3;
        }
        return false;
    }

    public void e() {
        ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.c;
        ww0 ww0Var = chatActivityEnterView.m1;
        if (d()) {
            AnimatorSet animatorSet = chatActivityEnterView.B3;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            chatActivityEnterView.E3 = true;
            this.b = chatActivityEnterView.z3;
            chatActivityEnterView.z3 = true;
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 1);
            int height = ((((ww0Var.getHeight() - AndroidUtilities.statusBarHeight) - AndroidUtilities.navigationBarHeight) - AndroidUtilities.dp(6.0f)) - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - chatActivityEnterView.getHeight();
            chatActivityEnterView.D3 = height;
            if (chatActivityEnterView.R1 == 2) {
                int dp = AndroidUtilities.dp(175.0f);
                Point point = AndroidUtilities.displaySize;
                chatActivityEnterView.D3 = Math.min(height, dp + (point.x > point.y ? chatActivityEnterView.y2 : chatActivityEnterView.x2));
            }
            if (chatActivityEnterView.h5 == null) {
                chatActivityEnterView.U0.getLayoutParams().height = chatActivityEnterView.D3;
            }
            chatActivityEnterView.U0.setLayerType(2, null);
            ww0Var.requestLayout();
            if (chatActivityEnterView.y4) {
                ww0Var.setForeground(new dd(chatActivityEnterView));
            }
            this.a = (int) chatActivityEnterView.getTranslationY();
            og ogVar = chatActivityEnterView.Z2;
            if (ogVar != null) {
                ogVar.c1();
            }
        }
    }

    public f(MessageDigest messageDigest, int i10) {
        ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN);
        this.c = messageDigest;
        this.a = i10;
    }
}
