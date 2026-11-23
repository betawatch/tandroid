package bg;

import android.animation.AnimatorSet;
import android.graphics.Point;
import android.widget.FrameLayout;
import androidx.appcompat.widget.ActionBarContextView;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.MessageDigest;
import org.telegram.messenger.ls;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.ax;
import org.telegram.ui.Components.du0;
import org.telegram.ui.Components.gf;
import org.telegram.ui.Components.ly;
import org.telegram.ui.Components.ng;
import org.telegram.ui.Components.sc;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes.dex */
public final class w0 implements r0.m0, ax {
    public boolean a;
    public int b;
    public Object c;

    public /* synthetic */ w0(FrameLayout frameLayout) {
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
        ly lyVar;
        gf gfVar;
        ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.c;
        if (chatActivityEnterView.n4) {
            return (chatActivityEnterView.p4 || (gfVar = chatActivityEnterView.F0) == null || gfVar.length() <= 0) && (lyVar = chatActivityEnterView.V0.z0) != null && lyVar.b() > 0 && !chatActivityEnterView.a4;
        }
        return false;
    }

    public void e() {
        ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.c;
        du0 du0Var = chatActivityEnterView.c2;
        if (d()) {
            AnimatorSet animatorSet = chatActivityEnterView.r4;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            chatActivityEnterView.u4 = true;
            this.a = chatActivityEnterView.p4;
            chatActivityEnterView.p4 = true;
            ls.e().k(ls.j1, 1);
            int height = ((((du0Var.getHeight() - org.telegram.messenger.g0.m) - org.telegram.messenger.g0.n) - org.telegram.messenger.g0.L(6.0f)) - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - chatActivityEnterView.getHeight();
            chatActivityEnterView.t4 = height;
            if (chatActivityEnterView.H2 == 2) {
                int L = org.telegram.messenger.g0.L(175.0f);
                Point point = org.telegram.messenger.g0.q;
                chatActivityEnterView.t4 = Math.min(height, L + (point.x > point.y ? chatActivityEnterView.o3 : chatActivityEnterView.n3));
            }
            if (chatActivityEnterView.e7 == null) {
                chatActivityEnterView.V0.getLayoutParams().height = chatActivityEnterView.t4;
            }
            chatActivityEnterView.V0.setLayerType(2, null);
            du0Var.requestLayout();
            if (chatActivityEnterView.Y5) {
                du0Var.setForeground(new sc(chatActivityEnterView));
            }
            this.b = (int) chatActivityEnterView.getTranslationY();
            ng ngVar = chatActivityEnterView.P3;
            if (ngVar != null) {
                ngVar.q1();
            }
        }
    }

    public w0(MessageDigest messageDigest, int i7) {
        ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN);
        this.c = messageDigest;
        this.b = i7;
    }
}
