package bg;

import android.animation.AnimatorSet;
import android.graphics.Point;
import android.widget.FrameLayout;
import androidx.appcompat.widget.ActionBarContextView;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.MessageDigest;
import org.telegram.messenger.qs;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.mw;
import org.telegram.ui.Components.oc;
import org.telegram.ui.Components.rt0;
import org.telegram.ui.Components.wf;
import org.telegram.ui.Components.xe;
import org.telegram.ui.Components.xx;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final class w0 implements r0.m0, mw {
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
        xx xxVar;
        xe xeVar;
        ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.c;
        if (chatActivityEnterView.x3) {
            return (chatActivityEnterView.z3 || (xeVar = chatActivityEnterView.E0) == null || xeVar.length() <= 0) && (xxVar = chatActivityEnterView.U0.y0) != null && xxVar.b() > 0 && !chatActivityEnterView.k3;
        }
        return false;
    }

    public void e() {
        ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.c;
        rt0 rt0Var = chatActivityEnterView.m1;
        if (d()) {
            AnimatorSet animatorSet = chatActivityEnterView.B3;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            chatActivityEnterView.E3 = true;
            this.a = chatActivityEnterView.z3;
            chatActivityEnterView.z3 = true;
            qs.e().k(qs.j1, 1);
            int height = ((((rt0Var.getHeight() - org.telegram.messenger.g0.m) - org.telegram.messenger.g0.n) - org.telegram.messenger.g0.L(6.0f)) - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - chatActivityEnterView.getHeight();
            chatActivityEnterView.D3 = height;
            if (chatActivityEnterView.R1 == 2) {
                int L = org.telegram.messenger.g0.L(175.0f);
                Point point = org.telegram.messenger.g0.q;
                chatActivityEnterView.D3 = Math.min(height, L + (point.x > point.y ? chatActivityEnterView.y2 : chatActivityEnterView.x2));
            }
            if (chatActivityEnterView.h5 == null) {
                chatActivityEnterView.U0.getLayoutParams().height = chatActivityEnterView.D3;
            }
            chatActivityEnterView.U0.setLayerType(2, null);
            rt0Var.requestLayout();
            if (chatActivityEnterView.y4) {
                rt0Var.setForeground(new oc(chatActivityEnterView));
            }
            this.b = (int) chatActivityEnterView.getTranslationY();
            wf wfVar = chatActivityEnterView.Z2;
            if (wfVar != null) {
                wfVar.h1();
            }
        }
    }

    public w0(MessageDigest messageDigest, int i7) {
        ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN);
        this.c = messageDigest;
        this.b = i7;
    }
}
