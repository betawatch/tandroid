package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public abstract class v20 extends m41 {
    public final int P;
    public final ArrayList Q;
    public boolean R;
    public di.l6 S;
    public boolean T;
    public boolean U;
    public int V;
    public int W;
    public boolean X;
    public int Y;
    public String Z;
    public String a0;
    public int b0;
    public org.telegram.ui.q8 c0;
    public final boolean[] d0;

    public v20(qj0 qj0Var, Context context, int i7) {
        super(qj0Var, context, i7, 0, false, null, null);
        this.Q = new ArrayList();
        this.V = 0;
        this.W = -1;
        this.d0 = new boolean[1];
        this.w = new d(this, 16);
        this.P = i7;
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
        di.l6 l6Var = this.S;
        if (l6Var != null && l6Var.I != 0) {
            ConnectionsManager.getInstance(l6Var.c).cancelRequest(l6Var.I, true);
            l6Var.I = 0;
        }
        this.R = false;
        if (this.W >= 0) {
            ConnectionsManager.getInstance(this.P).cancelRequest(this.W, true);
            this.W = -1;
        }
        org.telegram.messenger.g0.r(this.c0);
        this.V++;
        this.U = false;
    }

    public final void X() {
        qj0 qj0Var;
        if (TextUtils.isEmpty(this.Z) || this.X || this.U || (qj0Var = this.d) == null) {
            return;
        }
        for (int i7 = 0; i7 < qj0Var.getChildCount(); i7++) {
            if (qj0Var.getChildAt(i7) instanceof mz) {
                Z(this.Z);
                return;
            }
        }
    }

    public final void Z(String str) {
        this.Z = str;
        String Y = Y(str, this.d0);
        if (!TextUtils.equals(this.a0, Y)) {
            this.Q.clear();
            this.X = false;
            this.Y = 0;
            W();
        } else if (this.U) {
            return;
        }
        int i7 = this.V + 1;
        this.V = i7;
        if (Y == null) {
            return;
        }
        this.U = true;
        O(true);
        org.telegram.ui.q8 q8Var = new org.telegram.ui.q8(this, i7, Y);
        this.c0 = q8Var;
        org.telegram.messenger.g0.i3(q8Var, 300L);
    }
}
