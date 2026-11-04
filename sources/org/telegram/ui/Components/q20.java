package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public abstract class q20 extends f41 {
    public final int Q;
    public final ArrayList R;
    public boolean S;
    public ei.l6 T;
    public boolean U;
    public boolean V;
    public int W;
    public int X;
    public boolean Y;
    public int Z;
    public String a0;
    public String b0;
    public int c0;
    public org.telegram.ui.f4 d0;
    public final boolean[] e0;

    public q20(tj0 tj0Var, Context context, int i3) {
        super(tj0Var, context, i3, 0, false, null, null);
        this.R = new ArrayList();
        this.W = 0;
        this.X = -1;
        this.e0 = new boolean[1];
        this.w = new e(this, 16);
        this.Q = i3;
    }

    public static String Y(String str, boolean[] zArr) {
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

    public final void W() {
        ei.l6 l6Var = this.T;
        if (l6Var != null && l6Var.I != 0) {
            ConnectionsManager.getInstance(l6Var.c).cancelRequest(l6Var.I, true);
            l6Var.I = 0;
        }
        this.S = false;
        if (this.X >= 0) {
            ConnectionsManager.getInstance(this.Q).cancelRequest(this.X, true);
            this.X = -1;
        }
        org.telegram.messenger.g0.r(this.d0);
        this.W++;
        this.V = false;
    }

    public final void X() {
        tj0 tj0Var;
        if (TextUtils.isEmpty(this.a0) || this.Y || this.V || (tj0Var = this.d) == null) {
            return;
        }
        for (int i3 = 0; i3 < tj0Var.getChildCount(); i3++) {
            if (tj0Var.getChildAt(i3) instanceof iz) {
                Z(this.a0);
                return;
            }
        }
    }

    public final void Z(String str) {
        this.a0 = str;
        String Y = Y(str, this.e0);
        if (!TextUtils.equals(this.b0, Y)) {
            this.R.clear();
            this.Y = false;
            this.Z = 0;
            W();
        } else if (this.V) {
            return;
        }
        int i3 = this.W + 1;
        this.W = i3;
        if (Y == null) {
            return;
        }
        this.V = true;
        O(true);
        org.telegram.ui.f4 f4Var = new org.telegram.ui.f4(this, i3, Y, 11);
        this.d0 = f4Var;
        org.telegram.messenger.g0.i3(f4Var, 300L);
    }
}
