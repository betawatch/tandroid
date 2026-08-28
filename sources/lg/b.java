package lg;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LiteMode;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.f6;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public class b implements a {
    public final b6 a;
    public final int b;
    public final float c;
    public int d;
    public int e;
    public int f;
    public int h;

    public b(int i9, b6 b6Var) {
        this(b6Var, i9, LiteMode.isEnabled(262144) ? 0.85f : 0.76f);
    }

    public boolean a() {
        return AndroidUtilities.computePerceivedBrightness(f6.v0(this.b, this.a)) < 0.721f;
    }

    public final void b() {
        this.d = f6.l1(this.c, f6.v0(this.b, this.a));
        if (a()) {
            this.f = 687865855;
            this.h = 352321535;
            this.e = 0;
        } else {
            this.f = -1;
            this.h = -1;
            this.e = TLObject.FLAG_29;
        }
    }

    @Override // lg.a
    public int e() {
        return this.f;
    }

    @Override // lg.a
    public int g() {
        return this.h;
    }

    @Override // lg.a
    public int j() {
        return this.e;
    }

    @Override // lg.a
    public int k() {
        return this.d;
    }

    public b(b6 b6Var, int i9, float f10) {
        this.a = b6Var;
        this.b = i9;
        this.c = f10;
        b();
    }
}
