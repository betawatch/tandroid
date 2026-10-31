package org.telegram.ui.ActionBar;

import android.graphics.Bitmap;
import android.text.TextUtils;
import org.telegram.messenger.cd;
import org.telegram.messenger.f8;
import org.telegram.messenger.h20;
import org.telegram.messenger.vp;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
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
    public xh.s3 a;
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
            return TextUtils.isEmpty(this.E) ? cd.L0(2131742952, null) : this.E;
        }
        xh.s3 s3Var = this.a;
        return s3Var == null ? "" : s3Var.g == 6 ? s3Var.e : h20.p(vp.r1(s3Var.a).Z1(Long.valueOf(this.a.c)));
    }
}
