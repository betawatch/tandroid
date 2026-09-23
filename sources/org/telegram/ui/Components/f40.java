package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public abstract class f40 extends v51 {
    public final int N;
    public final ArrayList O;
    public boolean P;
    public ai.v8 Q;
    public boolean R;
    public boolean S;
    public int T;
    public int U;
    public boolean V;
    public int W;
    public String X;
    public String Y;
    public int Z;
    public xm a0;
    public final boolean[] b0;

    public f40(ml0 ml0Var, Context context, int i10) {
        super(ml0Var, context, i10, 0, false, null, null);
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
        ai.v8 v8Var = this.Q;
        if (v8Var != null && v8Var.I != 0) {
            ConnectionsManager.getInstance(v8Var.c).cancelRequest(v8Var.I, true);
            v8Var.I = 0;
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
        ml0 ml0Var;
        if (TextUtils.isEmpty(this.X) || this.V || this.S || (ml0Var = this.d) == null) {
            return;
        }
        for (int i10 = 0; i10 < ml0Var.getChildCount(); i10++) {
            if (ml0Var.getChildAt(i10) instanceof u00) {
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
        xm xmVar = new xm(this, i10, X, 5);
        this.a0 = xmVar;
        AndroidUtilities.runOnUIThread(xmVar, 300L);
    }
}
