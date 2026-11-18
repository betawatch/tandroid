package bg;

import android.animation.AnimatorSet;
import android.graphics.Point;
import android.widget.FrameLayout;
import androidx.appcompat.widget.ActionBarContextView;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.MessageDigest;
import org.telegram.messenger.ks;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.au0;
import org.telegram.ui.Components.gf;
import org.telegram.ui.Components.jy;
import org.telegram.ui.Components.kg;
import org.telegram.ui.Components.sc;
import org.telegram.ui.Components.yw;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
public final class w0 implements r0.m0, yw {
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
        jy jyVar;
        gf gfVar;
        ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.c;
        if (chatActivityEnterView.l4) {
            return (chatActivityEnterView.n4 || (gfVar = chatActivityEnterView.F0) == null || gfVar.length() <= 0) && (jyVar = chatActivityEnterView.V0.z0) != null && jyVar.b() > 0 && !chatActivityEnterView.Y3;
        }
        return false;
    }

    public void e() {
        ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.c;
        au0 au0Var = chatActivityEnterView.a2;
        if (d()) {
            AnimatorSet animatorSet = chatActivityEnterView.p4;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            chatActivityEnterView.s4 = true;
            this.a = chatActivityEnterView.n4;
            chatActivityEnterView.n4 = true;
            ks.e().k(ks.j1, 1);
            int height = ((((au0Var.getHeight() - org.telegram.messenger.g0.m) - org.telegram.messenger.g0.n) - org.telegram.messenger.g0.L(6.0f)) - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - chatActivityEnterView.getHeight();
            chatActivityEnterView.r4 = height;
            if (chatActivityEnterView.F2 == 2) {
                int L = org.telegram.messenger.g0.L(175.0f);
                Point point = org.telegram.messenger.g0.q;
                chatActivityEnterView.r4 = Math.min(height, L + (point.x > point.y ? chatActivityEnterView.m3 : chatActivityEnterView.l3));
            }
            if (chatActivityEnterView.c7 == null) {
                chatActivityEnterView.V0.getLayoutParams().height = chatActivityEnterView.r4;
            }
            chatActivityEnterView.V0.setLayerType(2, null);
            au0Var.requestLayout();
            if (chatActivityEnterView.W5) {
                au0Var.setForeground(new sc(chatActivityEnterView));
            }
            this.b = (int) chatActivityEnterView.getTranslationY();
            kg kgVar = chatActivityEnterView.N3;
            if (kgVar != null) {
                kgVar.q1();
            }
        }
    }

    public w0(MessageDigest messageDigest, int i7) {
        ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN);
        this.c = messageDigest;
        this.b = i7;
    }
}
