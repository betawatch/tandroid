package org.telegram.ui.ActionBar;

import android.graphics.Bitmap;
import android.text.TextUtils;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public class m3 {
    public boolean A;
    public boolean B;
    public boolean C;
    public boolean D;
    public String E;
    public Bitmap F;
    public boolean G;
    public String H;
    public float I;
    public org.telegram.ui.l4 J;
    public gi.y0 K;
    public boolean L;
    public gi.t4 a;
    public org.telegram.ui.web.x0 b;
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
            org.telegram.ui.web.x0 x0Var = this.b;
            if (x0Var != null) {
                x0Var.destroy();
                this.b = null;
            }
            org.telegram.ui.l4 l4Var = this.J;
            if (l4Var != null) {
                l4Var.s();
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public String b() {
        if (this.J != null) {
            return TextUtils.isEmpty(this.E) ? LocaleController.getString(R.string.WebEmpty) : this.E;
        }
        gi.t4 t4Var = this.a;
        return t4Var == null ? "" : t4Var.g == 6 ? t4Var.e : UserObject.getUserName(MessagesController.getInstance(t4Var.a).getUser(Long.valueOf(this.a.c)));
    }
}
