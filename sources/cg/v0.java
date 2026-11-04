package cg;

import android.animation.AnimatorSet;
import android.graphics.Point;
import android.widget.FrameLayout;
import androidx.appcompat.widget.ActionBarContextView;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.MessageDigest;
import org.telegram.messenger.hs;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.lw;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.qt0;
import org.telegram.ui.Components.uf;
import org.telegram.ui.Components.ve;
import org.telegram.ui.Components.vx;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class v0 implements r0.m0, lw {
    public boolean a;
    public int b;
    public Object c;

    public /* synthetic */ v0(FrameLayout frameLayout) {
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
        vx vxVar;
        ve veVar;
        ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.c;
        if (chatActivityEnterView.y3) {
            return (chatActivityEnterView.A3 || (veVar = chatActivityEnterView.F0) == null || veVar.length() <= 0) && (vxVar = chatActivityEnterView.V0.z0) != null && vxVar.b() > 0 && !chatActivityEnterView.l3;
        }
        return false;
    }

    public void e() {
        ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.c;
        qt0 qt0Var = chatActivityEnterView.n1;
        if (d()) {
            AnimatorSet animatorSet = chatActivityEnterView.C3;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            chatActivityEnterView.F3 = true;
            this.a = chatActivityEnterView.A3;
            chatActivityEnterView.A3 = true;
            hs.e().k(hs.j1, 1);
            int height = ((((qt0Var.getHeight() - org.telegram.messenger.g0.m) - org.telegram.messenger.g0.n) - org.telegram.messenger.g0.L(6.0f)) - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - chatActivityEnterView.getHeight();
            chatActivityEnterView.E3 = height;
            if (chatActivityEnterView.S1 == 2) {
                int L = org.telegram.messenger.g0.L(175.0f);
                Point point = org.telegram.messenger.g0.q;
                chatActivityEnterView.E3 = Math.min(height, L + (point.x > point.y ? chatActivityEnterView.z2 : chatActivityEnterView.y2));
            }
            if (chatActivityEnterView.i5 == null) {
                chatActivityEnterView.V0.getLayoutParams().height = chatActivityEnterView.E3;
            }
            chatActivityEnterView.V0.setLayerType(2, null);
            qt0Var.requestLayout();
            if (chatActivityEnterView.z4) {
                qt0Var.setForeground(new mc(chatActivityEnterView));
            }
            this.b = (int) chatActivityEnterView.getTranslationY();
            uf ufVar = chatActivityEnterView.a3;
            if (ufVar != null) {
                ufVar.g1();
            }
        }
    }

    public v0(MessageDigest messageDigest, int i3) {
        ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN);
        this.c = messageDigest;
        this.b = i3;
    }
}
