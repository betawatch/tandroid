// default package

import android.app.Activity;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public abstract class bf5 extends l7c {
    public final int Q;
    public final ArrayList R;
    public boolean S;
    public u3b T;
    public boolean U;
    public boolean V;
    public int W;
    public int X;
    public boolean Y;
    public int Z;
    public String a0;
    public String b0;
    public int c0;
    public h65 d0;
    public final boolean[] e0;

    public bf5(r59 r59Var, Activity activity, int i) {
        super(r59Var, activity, i, 0, false, null, null);
        this.R = new ArrayList();
        this.W = 0;
        this.X = -1;
        this.e0 = new boolean[1];
        this.w = new vt4((Object) this, (byte) 11);
        this.Q = i;
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
        u3b u3bVar = this.T;
        if (u3bVar != null && u3bVar.I != 0) {
            ConnectionsManager.getInstance(u3bVar.c).cancelRequest(u3bVar.I, true);
            u3bVar.I = 0;
        }
        this.S = false;
        if (this.X >= 0) {
            ConnectionsManager.getInstance(this.Q).cancelRequest(this.X, true);
            this.X = -1;
        }
        gm.r(this.d0);
        this.W++;
        this.V = false;
    }

    public final void X() {
        r59 r59Var;
        if (TextUtils.isEmpty(this.a0) || this.Y || this.V || (r59Var = this.d) == null) {
            return;
        }
        for (int i = 0; i < r59Var.getChildCount(); i++) {
            if (r59Var.getChildAt(i) instanceof tk4) {
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
        int i = this.W + 1;
        this.W = i;
        if (Y == null) {
            return;
        }
        this.V = true;
        O(true);
        h65 h65Var = new h65(this, i, Y, (byte) 2);
        this.d0 = h65Var;
        gm.d3(h65Var, 300L);
    }
}
