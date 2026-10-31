package c5;

import android.animation.AnimatorSet;
import android.graphics.Point;
import android.widget.FrameLayout;
import androidx.appcompat.widget.ActionBarContextView;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.MessageDigest;
import org.telegram.messenger.i0;
import org.telegram.messenger.zs;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.bx;
import org.telegram.ui.Components.ny;
import org.telegram.ui.Components.se;
import org.telegram.ui.Components.sf;
import org.telegram.ui.Components.uu0;
import r0.l0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class e implements l0, bx {
    public int a;
    public boolean b;
    public Object c;

    public /* synthetic */ e(FrameLayout frameLayout) {
        this.c = frameLayout;
    }

    @Override // r0.l0
    public void a() {
        this.b = true;
    }

    @Override // r0.l0
    public void b() {
        super/*android.view.ViewGroup*/.setVisibility(0);
        this.b = false;
    }

    @Override // r0.l0
    public void c() {
        if (this.b) {
            return;
        }
        ActionBarContextView actionBarContextView = (ActionBarContextView) this.c;
        actionBarContextView.f = null;
        super/*android.view.ViewGroup*/.setVisibility(this.a);
    }

    public boolean d() {
        ny nyVar;
        se seVar;
        ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.c;
        if (chatActivityEnterView.x3) {
            return (chatActivityEnterView.z3 || (seVar = chatActivityEnterView.E0) == null || seVar.length() <= 0) && (nyVar = chatActivityEnterView.U0.y0) != null && nyVar.b() > 0 && !chatActivityEnterView.k3;
        }
        return false;
    }

    public void e() {
        ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.c;
        uu0 uu0Var = chatActivityEnterView.m1;
        if (d()) {
            AnimatorSet animatorSet = chatActivityEnterView.B3;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            chatActivityEnterView.E3 = true;
            this.b = chatActivityEnterView.z3;
            chatActivityEnterView.z3 = true;
            zs.e().k(zs.j1, 1);
            int height = ((((uu0Var.getHeight() - i0.m) - i0.n) - i0.L(6.0f)) - org.telegram.ui.ActionBar.l.getCurrentActionBarHeight()) - chatActivityEnterView.getHeight();
            chatActivityEnterView.D3 = height;
            if (chatActivityEnterView.R1 == 2) {
                int L = i0.L(175.0f);
                Point point = i0.q;
                chatActivityEnterView.D3 = Math.min(height, L + (point.x > point.y ? chatActivityEnterView.y2 : chatActivityEnterView.x2));
            }
            if (chatActivityEnterView.h5 == null) {
                chatActivityEnterView.U0.getLayoutParams().height = chatActivityEnterView.D3;
            }
            chatActivityEnterView.U0.setLayerType(2, null);
            uu0Var.requestLayout();
            if (chatActivityEnterView.y4) {
                uu0Var.setForeground(new jh.g(chatActivityEnterView));
            }
            this.a = (int) chatActivityEnterView.getTranslationY();
            sf sfVar = chatActivityEnterView.Z2;
            if (sfVar != null) {
                sfVar.d1();
            }
        }
    }

    public e(MessageDigest messageDigest, int i10) {
        ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN);
        this.c = messageDigest;
        this.a = i10;
    }
}
