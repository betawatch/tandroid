// default package

import android.content.Context;
import android.graphics.Point;
import android.view.View;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.a;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class f72 extends p02 {
    public final g24 n;
    public final o39 r;
    public final byte s;
    public final jr w;
    public int x;

    /* JADX WARN: Multi-variable type inference failed */
    public f72(int i, x02 x02Var, wjb wjbVar, Context context) {
        super(x02Var, wjbVar, context);
        this.s = i;
        g24 g24Var = new g24(context, wjbVar);
        this.n = g24Var;
        g24Var.setText(k96.M0(2131747988, null));
        g24Var.setOnTouchListener(null);
        g24Var.setTextSize(16);
        addView(g24Var, nme.c(-2.0f, -1));
        g24Var.a(R.raw.media_forbidden, kk7.f2, kk7.f2);
        TLRPC.Chat S0 = this.b.S0();
        byte b = 4;
        if (i == 1) {
            g24Var.setText(hc2.L(7, S0));
        } else if (i == 3) {
            g24Var.setText(hc2.L(18, S0));
        } else if (i == 4) {
            g24Var.setText(hc2.L(19, S0));
        } else {
            g24Var.setText(hc2.L(22, S0));
        }
        g24Var.c();
        o39 o39Var = new o39(context, wjbVar);
        this.r = o39Var;
        o39Var.setSectionsType(2);
        o39Var.setVerticalScrollBarEnabled(false);
        o39Var.setLayoutManager(new t26());
        o39Var.setClipToPadding(false);
        jr jrVar = new jr(this, b);
        this.w = jrVar;
        o39Var.setAdapter(jrVar);
        o39Var.setPadding(0, 0, 0, gl.L(48.0f));
        o39Var.setOnScrollListener(new y(this, (byte) 23));
        addView(o39Var, nme.c(-1.0f, -1));
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    @Override // p02
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void C(int i, int i2) {
        int i3;
        int i4;
        o39 o39Var;
        int max = Math.max(0, i2 - a.getCurrentActionBarHeight());
        if (this.x != max) {
            this.x = max;
            this.w.f();
        }
        if (!gl.O1()) {
            Point point = gl.q;
            if (point.x > point.y) {
                i3 = (int) (i2 / 3.5f);
                int L = i3 - gl.L(52.0f);
                i4 = L >= 0 ? L : 0;
                o39Var = this.r;
                if (o39Var.getPaddingTop() == i4) {
                    o39Var.setPadding(gl.L(6.0f), i4, gl.L(6.0f), gl.L(48.0f));
                    return;
                }
                return;
            }
        }
        i3 = (i2 / 5) << 1;
        int L2 = i3 - gl.L(52.0f);
        if (L2 >= 0) {
        }
        o39Var = this.r;
        if (o39Var.getPaddingTop() == i4) {
        }
    }

    @Override // p02
    public int getCurrentItemTop() {
        o39 o39Var = this.r;
        if (o39Var.getChildCount() <= 0) {
            return ConnectionsManager.DEFAULT_DATACENTER_ID;
        }
        int i = 0;
        View childAt = o39Var.getChildAt(0);
        y29 y29Var = (y29) o39Var.G(childAt);
        int top = childAt.getTop() - gl.L(8.0f);
        if (top > 0 && y29Var != null && y29Var.b() == 0) {
            i = top;
        }
        if (top < 0 || y29Var == null || y29Var.b() != 0) {
            top = i;
        }
        int measuredHeight = (getMeasuredHeight() - top) - gl.L(50.0f);
        this.n.setTranslationY(((measuredHeight - r4.getMeasuredHeight()) / 2) + top);
        return gl.L(12.0f) + top;
    }

    @Override // p02
    public int getFirstOffset() {
        return gl.L(4.0f) + getListTopPadding();
    }

    @Override // p02
    public int getListTopPadding() {
        return this.r.getPaddingTop();
    }

    @Override // android.view.View
    public void setTranslationY(float f) {
        super.setTranslationY(f);
        this.b.b.invalidate();
    }
}
