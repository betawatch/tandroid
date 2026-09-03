package org.telegram.ui.ActionBar;

import android.graphics.Bitmap;
import android.text.TextUtils;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public class n3 {
    public boolean A;
    public boolean B;
    public String C;
    public Bitmap D;
    public boolean E;
    public String F;
    public float G;
    public org.telegram.ui.l4 H;
    public sh.u0 I;
    public boolean J;
    public sh.y3 a;
    public org.telegram.ui.web.x0 b;
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
    public b4.e0 u;
    public String v;
    public boolean w;
    public boolean x;
    public boolean y;
    public boolean z;

    public final void a() {
        try {
            org.telegram.ui.web.x0 x0Var = this.b;
            if (x0Var != null) {
                x0Var.destroy();
                this.b = null;
            }
            org.telegram.ui.l4 l4Var = this.H;
            if (l4Var != null) {
                l4Var.s();
            }
        } catch (Exception e6) {
            FileLog.e(e6);
        }
    }

    public String b() {
        if (this.H != null) {
            return TextUtils.isEmpty(this.C) ? LocaleController.getString(R.string.WebEmpty) : this.C;
        }
        sh.y3 y3Var = this.a;
        return y3Var == null ? "" : UserObject.getUserName(MessagesController.getInstance(y3Var.a).getUser(Long.valueOf(this.a.c)));
    }
}
