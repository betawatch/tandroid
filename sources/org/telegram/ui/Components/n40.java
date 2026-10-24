package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public abstract class n40 extends b71 {
    public final int P;
    public final ArrayList Q;
    public boolean R;
    public ci.t6 S;
    public boolean T;
    public boolean U;
    public int V;
    public int W;
    public boolean X;
    public int Y;
    public String Z;
    public String a0;
    public int b0;
    public org.telegram.ui.h4 c0;
    public final boolean[] d0;

    public n40(mm0 mm0Var, Context context, int i10) {
        super(mm0Var, context, i10, 0, false, null, null);
        this.Q = new ArrayList();
        this.V = 0;
        this.W = -1;
        this.d0 = new boolean[1];
        this.v = new d(this, 16);
        this.P = i10;
    }

    public static String X(String str, boolean[] zArr) {
        if (zArr != null) {
            zArr[0] = false;
        }
        if (str == null || str.isEmpty()) {
            return null;
        }
        String trim = str.trim();
        if (trim.length() <= 1) {
            return null;
        }
        if ((trim.charAt(0) != '#' && trim.charAt(0) != '$') || trim.indexOf(64) >= 0) {
            return null;
        }
        if (zArr != null) {
            zArr[0] = trim.charAt(0) == '$';
        }
        return trim.substring(1);
    }

    public final void V() {
        ci.t6 t6Var = this.S;
        if (t6Var != null && t6Var.I != 0) {
            ConnectionsManager.getInstance(t6Var.c).cancelRequest(t6Var.I, true);
            t6Var.I = 0;
        }
        this.R = false;
        if (this.W >= 0) {
            ConnectionsManager.getInstance(this.P).cancelRequest(this.W, true);
            this.W = -1;
        }
        AndroidUtilities.cancelRunOnUIThread(this.c0);
        this.V++;
        this.U = false;
    }

    public final void W() {
        mm0 mm0Var;
        if (TextUtils.isEmpty(this.Z) || this.X || this.U || (mm0Var = this.d) == null) {
            return;
        }
        for (int i10 = 0; i10 < mm0Var.getChildCount(); i10++) {
            if (mm0Var.getChildAt(i10) instanceof b10) {
                Y(this.Z);
                return;
            }
        }
    }

    public final void Y(String str) {
        this.Z = str;
        String X = X(str, this.d0);
        if (!TextUtils.equals(this.a0, X)) {
            this.Q.clear();
            this.X = false;
            this.Y = 0;
            V();
        } else if (this.U) {
            return;
        }
        int i10 = this.V + 1;
        this.V = i10;
        if (X == null) {
            return;
        }
        this.U = true;
        N(true);
        org.telegram.ui.h4 h4Var = new org.telegram.ui.h4(this, i10, X, 11);
        this.c0 = h4Var;
        AndroidUtilities.runOnUIThread(h4Var, 300L);
    }
}
