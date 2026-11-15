package bg;

import android.animation.AnimatorSet;
import android.graphics.Point;
import android.widget.FrameLayout;
import androidx.appcompat.widget.ActionBarContextView;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.MessageDigest;
import org.telegram.messenger.ns;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.cg;
import org.telegram.ui.Components.dy;
import org.telegram.ui.Components.jc;
import org.telegram.ui.Components.st0;
import org.telegram.ui.Components.sw;
import org.telegram.ui.Components.xe;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes.dex */
public final class v0 implements r0.m0, sw {
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
        dy dyVar;
        xe xeVar;
        ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.c;
        if (chatActivityEnterView.f4) {
            return (chatActivityEnterView.h4 || (xeVar = chatActivityEnterView.F0) == null || xeVar.length() <= 0) && (dyVar = chatActivityEnterView.V0.z0) != null && dyVar.b() > 0 && !chatActivityEnterView.S3;
        }
        return false;
    }

    public void e() {
        ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.c;
        st0 st0Var = chatActivityEnterView.U1;
        if (d()) {
            AnimatorSet animatorSet = chatActivityEnterView.j4;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            chatActivityEnterView.m4 = true;
            this.a = chatActivityEnterView.h4;
            chatActivityEnterView.h4 = true;
            ns.e().k(ns.j1, 1);
            int height = ((((st0Var.getHeight() - org.telegram.messenger.g0.m) - org.telegram.messenger.g0.n) - org.telegram.messenger.g0.L(6.0f)) - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - chatActivityEnterView.getHeight();
            chatActivityEnterView.l4 = height;
            if (chatActivityEnterView.z2 == 2) {
                int L = org.telegram.messenger.g0.L(175.0f);
                Point point = org.telegram.messenger.g0.q;
                chatActivityEnterView.l4 = Math.min(height, L + (point.x > point.y ? chatActivityEnterView.g3 : chatActivityEnterView.f3));
            }
            if (chatActivityEnterView.C6 == null) {
                chatActivityEnterView.V0.getLayoutParams().height = chatActivityEnterView.l4;
            }
            chatActivityEnterView.V0.setLayerType(2, null);
            st0Var.requestLayout();
            if (chatActivityEnterView.Q5) {
                st0Var.setForeground(new jc(chatActivityEnterView));
            }
            this.b = (int) chatActivityEnterView.getTranslationY();
            cg cgVar = chatActivityEnterView.H3;
            if (cgVar != null) {
                cgVar.q1();
            }
        }
    }

    public v0(MessageDigest messageDigest, int i7) {
        ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN);
        this.c = messageDigest;
        this.b = i7;
    }
}
