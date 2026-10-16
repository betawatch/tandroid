package org.telegram.ui.ActionBar;

import android.graphics.Bitmap;
import android.text.TextUtils;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public class l3 {
    public boolean A;
    public boolean B;
    public boolean C;
    public boolean D;
    public String E;
    public Bitmap F;
    public boolean G;
    public String H;
    public float I;
    public org.telegram.ui.k4 J;
    public fi.z0 K;
    public boolean L;
    public fi.e5 a;
    public org.telegram.ui.web.z0 b;
    public org.telegram.ui.o3 c;
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
            org.telegram.ui.web.z0 z0Var = this.b;
            if (z0Var != null) {
                z0Var.destroy();
                this.b = null;
            }
            org.telegram.ui.k4 k4Var = this.J;
            if (k4Var != null) {
                k4Var.s();
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public String b() {
        if (this.J != null) {
            return TextUtils.isEmpty(this.E) ? LocaleController.getString(R.string.WebEmpty) : this.E;
        }
        fi.e5 e5Var = this.a;
        return e5Var == null ? "" : e5Var.g == 6 ? e5Var.e : UserObject.getUserName(MessagesController.getInstance(e5Var.a).getUser(Long.valueOf(this.a.c)));
    }
}
