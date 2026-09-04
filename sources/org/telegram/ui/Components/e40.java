package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public abstract class e40 extends v51 {
    public final int N;
    public final ArrayList O;
    public boolean P;
    public bi.d8 Q;
    public boolean R;
    public boolean S;
    public int T;
    public int U;
    public boolean V;
    public int W;
    public String X;
    public String Y;
    public int Z;
    public org.telegram.ui.dm a0;
    public final boolean[] b0;

    public e40(ll0 ll0Var, Context context, int i10) {
        super(ll0Var, context, i10, 0, false, null, null);
        this.O = new ArrayList();
        this.T = 0;
        this.U = -1;
        this.b0 = new boolean[1];
        this.s = new d(this, 16);
        this.N = i10;
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
        bi.d8 d8Var = this.Q;
        if (d8Var != null && d8Var.I != 0) {
            ConnectionsManager.getInstance(d8Var.c).cancelRequest(d8Var.I, true);
            d8Var.I = 0;
        }
        this.P = false;
        if (this.U >= 0) {
            ConnectionsManager.getInstance(this.N).cancelRequest(this.U, true);
            this.U = -1;
        }
        AndroidUtilities.cancelRunOnUIThread(this.a0);
        this.T++;
        this.S = false;
    }

    public final void W() {
        ll0 ll0Var;
        if (TextUtils.isEmpty(this.X) || this.V || this.S || (ll0Var = this.d) == null) {
            return;
        }
        for (int i10 = 0; i10 < ll0Var.getChildCount(); i10++) {
            if (ll0Var.getChildAt(i10) instanceof t00) {
                Y(this.X);
                return;
            }
        }
    }

    public final void Y(String str) {
        this.X = str;
        String X = X(str, this.b0);
        if (!TextUtils.equals(this.Y, X)) {
            this.O.clear();
            this.V = false;
            this.W = 0;
            V();
        } else if (this.S) {
            return;
        }
        int i10 = this.T + 1;
        this.T = i10;
        if (X == null) {
            return;
        }
        this.S = true;
        N(true);
        org.telegram.ui.dm dmVar = new org.telegram.ui.dm(this, i10, X, 6);
        this.a0 = dmVar;
        AndroidUtilities.runOnUIThread(dmVar, 300L);
    }
}
