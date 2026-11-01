package org.telegram.ui.ActionBar;

import android.graphics.Bitmap;
import android.text.TextUtils;
import org.telegram.messenger.dd;
import org.telegram.messenger.f8;
import org.telegram.messenger.i20;
import org.telegram.messenger.wp;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public class h3 {
    public boolean A;
    public boolean B;
    public boolean C;
    public boolean D;
    public String E;
    public Bitmap F;
    public boolean G;
    public String H;
    public float I;
    public org.telegram.ui.h4 J;
    public xh.s0 K;
    public boolean L;
    public xh.t3 a;
    public org.telegram.ui.web.v0 b;
    public org.telegram.ui.l3 c;
    public Object d;
    public boolean e;
    public String f;
    public int g;
    public int h;
    public int i;
    public boolean j;
    public float k = Float.MAX_VALUE;
    public boolean l = true;
    public Bitmap m;
    public boolean n;
    public boolean o;
    public int p;
    public int q;
    public int r;
    public int s;
    public boolean t;
    public boolean u;
    public boolean v;
    public a5.a w;
    public String x;
    public boolean y;
    public boolean z;

    public final void a() {
        try {
            org.telegram.ui.web.v0 v0Var = this.b;
            if (v0Var != null) {
                v0Var.destroy();
                this.b = null;
            }
            org.telegram.ui.h4 h4Var = this.J;
            if (h4Var != null) {
                h4Var.q();
            }
        } catch (Exception e) {
            f8.g(e, true);
        }
    }

    public String b() {
        if (this.J != null) {
            return TextUtils.isEmpty(this.E) ? dd.L0(2131742952, null) : this.E;
        }
        xh.t3 t3Var = this.a;
        return t3Var == null ? "" : t3Var.g == 6 ? t3Var.e : i20.p(wp.r1(t3Var.a).Z1(Long.valueOf(this.a.c)));
    }
}
