// default package

import android.widget.ImageView;
import java.util.HashMap;
import java.util.Map;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public class e29 extends ImageView {
    public HashMap a;
    public b29 b;
    public c29 c;
    public boolean d;
    public boolean e;
    public boolean f;
    public Integer h;
    public boolean n;

    public final void a() {
        b29 b29Var = this.b;
        if (b29Var != null) {
            b29Var.stop();
        }
        c29 c29Var = this.c;
        if (c29Var != null) {
            c29Var.K();
            this.c = null;
        }
        this.b = null;
        setImageDrawable(null);
    }

    public final boolean b() {
        b29 b29Var = this.b;
        return b29Var != null && b29Var.l0;
    }

    public final void d() {
        b29 b29Var = this.b;
        if (b29Var == null && this.c == null) {
            return;
        }
        this.f = true;
        if (this.e) {
            if (b29Var != null) {
                b29Var.start();
            }
            c29 c29Var = this.c;
            if (c29Var != null) {
                c29Var.w0(false);
            }
        }
    }

    public final void e(int i, int i2, int i3) {
        f(i, i2, i3, null);
    }

    public final void f(int i, int i2, int i3, int[] iArr) {
        setAnimation(new b29(i, hl.L(i2), hl.L(i3), false, iArr));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0113  */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g(int i, int i2, TLRPC.Document document) {
        jn5 jn5Var;
        String str;
        ?? r1;
        boolean z;
        c29 c29Var = this.c;
        if (c29Var != null) {
            c29Var.K();
            this.c = null;
        }
        if (document == null) {
            return;
        }
        c29 c29Var2 = new c29(this);
        this.c = c29Var2;
        c29Var2.A1 = true;
        String str2 = document.localThumbPath;
        if (str2 != null) {
            jn5Var = jn5.g(str2);
            str = qd4.m(i, i2, "_");
        } else {
            jn5Var = null;
            str = null;
        }
        TLRPC.PhotoSize w = xb4.w(document.thumbs, 90, false, null, false);
        if (this.n) {
            this.c.Y(jn5.b(document), i + "_" + i2 + "_lastframe", jn5.c(w, document), qd4.m(i, i2, "_"), jn5Var, str, null, 0L, null, document, 1);
        } else {
            if (!"video/webm".equals(document.mime_type)) {
                ggb d = lp3.d(document.thumbs, aob.m6, 0.2f, false);
                if (d != null) {
                    d.e = 512;
                    d.f = 512;
                }
                r1 = 0;
                this.c.Y(jn5.b(document), i + "_" + i2 + "", jn5.c(w, document), qd4.m(i, i2, "_"), jn5Var, str, d, 0L, null, document, 1);
                c29 c29Var3 = this.c;
                c29Var3.S0 = true;
                c29Var3.p0(this);
                z = this.d;
                c29 c29Var4 = this.c;
                if (z) {
                    c29Var4.M(r1);
                } else {
                    c29Var4.M(1);
                    c29 c29Var5 = this.c;
                    c29Var5.v0 = true;
                    c29Var5.u0 = true;
                }
                c29 c29Var6 = this.c;
                Integer num = this.h;
                c29Var6.m0(num == null ? num.intValue() : 7);
                this.c.C1 = r1;
                setImageDrawable(new d29(this, i, i2));
                if (this.e) {
                    return;
                }
                this.c.I();
                return;
            }
            c29 c29Var7 = this.c;
            jn5 b = jn5.b(document);
            String str3 = i + "_" + i2 + "_g";
            if (jn5Var == null) {
                jn5Var = jn5.c(w, document);
            }
            c29Var7.Z(b, str3, jn5Var, str, null, document.size, null, document, 1);
        }
        r1 = 0;
        c29 c29Var32 = this.c;
        c29Var32.S0 = true;
        c29Var32.p0(this);
        z = this.d;
        c29 c29Var42 = this.c;
        if (z) {
        }
        c29 c29Var62 = this.c;
        Integer num2 = this.h;
        c29Var62.m0(num2 == null ? num2.intValue() : 7);
        this.c.C1 = r1;
        setImageDrawable(new d29(this, i, i2));
        if (this.e) {
        }
    }

    public b29 getAnimatedDrawable() {
        return this.b;
    }

    public ImageReceiver getImageReceiver() {
        return this.c;
    }

    public final void h(int i, String str) {
        HashMap hashMap = this.a;
        if (hashMap == null) {
            hashMap = new HashMap();
            this.a = hashMap;
        }
        hashMap.put(str, Integer.valueOf(i));
        b29 b29Var = this.b;
        if (b29Var != null) {
            b29Var.L(i, str);
        }
    }

    public final void i() {
        b29 b29Var = this.b;
        if (b29Var == null && this.c == null) {
            return;
        }
        this.f = false;
        if (this.e) {
            if (b29Var != null) {
                b29Var.stop();
            }
            c29 c29Var = this.c;
            if (c29Var != null) {
                c29Var.x0();
            }
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.e = true;
        c29 c29Var = this.c;
        if (c29Var != null) {
            c29Var.I();
            if (this.f) {
                this.c.w0(false);
            }
        }
        b29 b29Var = this.b;
        if (b29Var != null) {
            b29Var.setCallback(this);
            if (this.f) {
                this.b.start();
            }
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.e = false;
        b29 b29Var = this.b;
        if (b29Var != null) {
            b29Var.stop();
        }
        c29 c29Var = this.c;
        if (c29Var != null) {
            c29Var.K();
        }
    }

    public void setAnimation(b29 b29Var) {
        if (this.b == b29Var) {
            return;
        }
        c29 c29Var = this.c;
        if (c29Var != null) {
            c29Var.K();
            this.c = null;
        }
        this.b = b29Var;
        b29Var.M(this);
        if (this.d) {
            this.b.F(1);
        }
        HashMap hashMap = this.a;
        if (hashMap != null) {
            this.b.a0 = true;
            for (Map.Entry entry : hashMap.entrySet()) {
                b29 b29Var2 = this.b;
                String str = (String) entry.getKey();
                Integer num = (Integer) entry.getValue();
                num.getClass();
                b29Var2.s.put(str, num);
                b29Var2.B();
            }
            this.b.j();
        }
        this.b.E(true);
        setImageDrawable(this.b);
    }

    public void setAutoRepeat(boolean z) {
        this.d = z;
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        super.setImageResource(i);
        this.b = null;
    }

    public void setLayerNum(Integer num) {
        this.h = num;
        c29 c29Var = this.c;
        if (c29Var != null) {
            c29Var.m0(num.intValue());
        }
    }

    public void setOnAnimationEndListener(Runnable runnable) {
        b29 b29Var = this.b;
        if (b29Var != null) {
            b29Var.u0 = runnable;
        }
    }

    public void setOnlyLastFrame(boolean z) {
        this.n = z;
    }

    public void setProgress(float f) {
        b29 b29Var = this.b;
        if (b29Var != null) {
            b29Var.O(true, f);
        }
    }

    public void c() {
    }
}
