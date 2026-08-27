package org.telegram.ui.ActionBar;

import android.graphics.Bitmap;
import android.text.TextUtils;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public class l3 {
    public boolean A;
    public boolean B;
    public String C;
    public Bitmap D;
    public boolean E;
    public String F;
    public float G;
    public org.telegram.ui.m4 H;
    public nh.x0 I;
    public boolean J;
    public nh.q4 a;
    public org.telegram.ui.web.w0 b;
    public org.telegram.ui.q3 c;
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
    public b6.a u;
    public String v;
    public boolean w;
    public boolean x;
    public boolean y;
    public boolean z;

    public final void a() {
        try {
            org.telegram.ui.web.w0 w0Var = this.b;
            if (w0Var != null) {
                w0Var.destroy();
                this.b = null;
            }
            org.telegram.ui.m4 m4Var = this.H;
            if (m4Var != null) {
                m4Var.s();
            }
        } catch (Exception e9) {
            FileLog.e(e9);
        }
    }

    public String b() {
        if (this.H != null) {
            return TextUtils.isEmpty(this.C) ? LocaleController.getString(R.string.WebEmpty) : this.C;
        }
        nh.q4 q4Var = this.a;
        return q4Var == null ? "" : UserObject.getUserName(MessagesController.getInstance(q4Var.a).getUser(Long.valueOf(this.a.c)));
    }
}
