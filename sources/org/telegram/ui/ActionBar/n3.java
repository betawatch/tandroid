package org.telegram.ui.ActionBar;

import android.graphics.Bitmap;
import android.text.TextUtils;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public class n3 {
    public boolean A;
    public boolean B;
    public boolean C;
    public boolean D;
    public String E;
    public Bitmap F;
    public boolean G;
    public String H;
    public float I;
    public org.telegram.ui.i4 J;
    public fi.a1 K;
    public boolean L;
    public fi.f5 a;
    public org.telegram.ui.web.z0 b;
    public org.telegram.ui.m3 c;
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
            org.telegram.ui.i4 i4Var = this.J;
            if (i4Var != null) {
                i4Var.s();
            }
        } catch (Exception e7) {
            FileLog.e(e7);
        }
    }

    public String b() {
        if (this.J != null) {
            return TextUtils.isEmpty(this.E) ? LocaleController.getString(R.string.WebEmpty) : this.E;
        }
        fi.f5 f5Var = this.a;
        return f5Var == null ? "" : UserObject.getUserName(MessagesController.getInstance(f5Var.a).getUser(Long.valueOf(this.a.c)));
    }
}
