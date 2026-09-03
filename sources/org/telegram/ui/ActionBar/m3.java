package org.telegram.ui.ActionBar;

import android.graphics.Bitmap;
import android.text.TextUtils;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
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
    public org.telegram.ui.n4 J;
    public rh.u0 K;
    public boolean L;
    public rh.y3 a;
    public org.telegram.ui.web.y0 b;
    public org.telegram.ui.r3 c;
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
    public b4.e0 w;
    public String x;
    public boolean y;
    public boolean z;

    public final void a() {
        try {
            org.telegram.ui.web.y0 y0Var = this.b;
            if (y0Var != null) {
                y0Var.destroy();
                this.b = null;
            }
            org.telegram.ui.n4 n4Var = this.J;
            if (n4Var != null) {
                n4Var.s();
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public String b() {
        if (this.J != null) {
            return TextUtils.isEmpty(this.E) ? LocaleController.getString(R.string.WebEmpty) : this.E;
        }
        rh.y3 y3Var = this.a;
        return y3Var == null ? "" : UserObject.getUserName(MessagesController.getInstance(y3Var.a).getUser(Long.valueOf(this.a.c)));
    }
}
