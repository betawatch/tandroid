// default package

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public abstract class oh0 extends ka {
    public final boolean d;
    public final boolean e;
    public final ArrayList f = new ArrayList();
    public String h;
    public nh0 n;
    public mh0 r;
    public int s;
    public boolean w;

    public oh0(boolean z, boolean z2) {
        this.d = z;
        this.e = z2;
    }

    public final void F() {
        if (this.r != null) {
            Utilities.g.a(this.r);
            this.r = null;
        }
        this.s++;
    }

    public final void G(String str) {
        F();
        if (TextUtils.isEmpty(str)) {
            this.f.clear();
            this.w = false;
            f();
        } else {
            this.w = true;
            mp3 mp3Var = Utilities.g;
            mh0 mh0Var = new mh0((rc6) this, str, (byte) 0);
            this.r = mh0Var;
            mp3Var.d(mh0Var, 400L);
        }
    }
}
