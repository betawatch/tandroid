package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public abstract class i40 extends x51 {
    public final int K;
    public final ArrayList L;
    public boolean M;
    public oh.f6 N;
    public boolean O;
    public boolean P;
    public int Q;
    public int R;
    public boolean S;
    public int T;
    public String U;
    public String V;
    public int W;
    public gy X;
    public final boolean[] Y;

    public i40(tl0 tl0Var, Context context, int i10) {
        super(tl0Var, context, i10, 0, false, null, null);
        this.L = new ArrayList();
        this.Q = 0;
        this.R = -1;
        this.Y = new boolean[1];
        this.s = new d(this, 16);
        this.K = i10;
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
        oh.f6 f6Var = this.N;
        if (f6Var != null && f6Var.I != 0) {
            ConnectionsManager.getInstance(f6Var.c).cancelRequest(f6Var.I, true);
            f6Var.I = 0;
        }
        this.M = false;
        if (this.R >= 0) {
            ConnectionsManager.getInstance(this.K).cancelRequest(this.R, true);
            this.R = -1;
        }
        AndroidUtilities.cancelRunOnUIThread(this.X);
        this.Q++;
        this.P = false;
    }

    public final void W() {
        tl0 tl0Var;
        if (TextUtils.isEmpty(this.U) || this.S || this.P || (tl0Var = this.d) == null) {
            return;
        }
        for (int i10 = 0; i10 < tl0Var.getChildCount(); i10++) {
            if (tl0Var.getChildAt(i10) instanceof u00) {
                Y(this.U);
                return;
            }
        }
    }

    public final void Y(String str) {
        this.U = str;
        String X = X(str, this.Y);
        if (!TextUtils.equals(this.V, X)) {
            this.L.clear();
            this.S = false;
            this.T = 0;
            V();
        } else if (this.P) {
            return;
        }
        int i10 = this.Q + 1;
        this.Q = i10;
        if (X == null) {
            return;
        }
        this.P = true;
        N(true);
        gy gyVar = new gy(this, i10, X, 3);
        this.X = gyVar;
        AndroidUtilities.runOnUIThread(gyVar, 300L);
    }
}
