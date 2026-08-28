package org.telegram.ui.ActionBar;

import android.graphics.Bitmap;
import android.text.TextUtils;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public class l3 {
    public boolean A;
    public boolean B;
    public String C;
    public Bitmap D;
    public boolean E;
    public String F;
    public float G;
    public org.telegram.ui.l4 H;
    public mh.y0 I;
    public boolean J;
    public mh.s4 a;
    public org.telegram.ui.web.v0 b;
    public org.telegram.ui.p3 c;
    public Object d;
    public int e;
    public int f;
    public int g;
    public boolean h;
    public float i = Float.MAX_VALUE;
    public boolean j = true;
    public Bitmap k;
    public boolean l;
    public boolean m;
    public int n;
    public int o;
    public int p;
    public int q;
    public boolean r;
    public boolean s;
    public boolean t;
    public a6.a u;
    public String v;
    public boolean w;
    public boolean x;
    public boolean y;
    public boolean z;

    public final void a() {
        try {
            org.telegram.ui.web.v0 v0Var = this.b;
            if (v0Var != null) {
                v0Var.destroy();
                this.b = null;
            }
            org.telegram.ui.l4 l4Var = this.H;
            if (l4Var != null) {
                l4Var.s();
            }
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    public String b() {
        if (this.H != null) {
            return TextUtils.isEmpty(this.C) ? LocaleController.getString(R.string.WebEmpty) : this.C;
        }
        mh.s4 s4Var = this.a;
        return s4Var == null ? "" : UserObject.getUserName(MessagesController.getInstance(s4Var.a).getUser(Long.valueOf(this.a.c)));
    }
}
