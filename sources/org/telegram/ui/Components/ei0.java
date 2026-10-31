package org.telegram.ui.Components;

import android.content.Context;
import android.widget.ImageView;
import java.util.HashMap;
import java.util.Map;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public class ei0 extends ImageView {
    public HashMap a;
    public bi0 b;
    public ci0 c;
    public boolean d;
    public boolean e;
    public boolean f;
    public Integer h;
    public boolean n;

    public ei0(Context context) {
        super(context);
    }

    public final void a() {
        bi0 bi0Var = this.b;
        if (bi0Var != null) {
            bi0Var.stop();
        }
        ci0 ci0Var = this.c;
        if (ci0Var != null) {
            ci0Var.R();
            this.c = null;
        }
        this.b = null;
        setImageDrawable(null);
    }

    public final boolean b() {
        bi0 bi0Var = this.b;
        return bi0Var != null && bi0Var.k0;
    }

    public final void d() {
        bi0 bi0Var = this.b;
        if (bi0Var == null && this.c == null) {
            return;
        }
        this.f = true;
        if (this.e) {
            if (bi0Var != null) {
                bi0Var.start();
            }
            ci0 ci0Var = this.c;
            if (ci0Var != null) {
                ci0Var.P0(false);
            }
        }
    }

    public final void e(int i10, int i11, int i12) {
        f(i10, i11, i12, null);
    }

    public final void f(int i10, int i11, int i12, int[] iArr) {
        setAnimation(new bi0(i10, org.telegram.messenger.i0.L(i11), org.telegram.messenger.i0.L(i12), false, iArr));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x011b  */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g(int i10, int i11, TLRPC.Document document) {
        org.telegram.messenger.ic icVar;
        String str;
        ?? r12;
        ci0 ci0Var = this.c;
        if (ci0Var != null) {
            ci0Var.R();
            this.c = null;
        }
        if (document == null) {
            return;
        }
        ci0 ci0Var2 = new ci0(this);
        this.c = ci0Var2;
        ci0Var2.z1 = true;
        String str2 = document.localThumbPath;
        if (str2 != null) {
            icVar = org.telegram.messenger.ic.g(str2);
            str = a1.g.i(i10, i11, "_");
        } else {
            icVar = null;
            str = null;
        }
        TLRPC.PhotoSize w9 = org.telegram.messenger.b8.w(document.thumbs, 90, false, null, false);
        if (this.n) {
            this.c.u0(org.telegram.messenger.ic.b(document), i10 + "_" + i11 + "_lastframe", org.telegram.messenger.ic.c(w9, document), a1.g.i(i10, i11, "_"), icVar, str, null, 0L, null, document, 1);
        } else {
            if (!"video/webm".equals(document.mime_type)) {
                org.telegram.messenger.c00 d = org.telegram.messenger.v5.d(document.thumbs, org.telegram.ui.ActionBar.t6.m6, 0.2f, false);
                if (d != null) {
                    d.e = 512;
                    d.f = 512;
                }
                r12 = 0;
                this.c.u0(org.telegram.messenger.ic.b(document), i10 + "_" + i11 + "", org.telegram.messenger.ic.c(w9, document), a1.g.i(i10, i11, "_"), icVar, str, d, 0L, null, document, 1);
                ci0 ci0Var3 = this.c;
                ci0Var3.R0 = true;
                ci0Var3.H0(this);
                if (this.d) {
                    this.c.W(r12);
                } else {
                    this.c.W(1);
                    ci0 ci0Var4 = this.c;
                    ci0Var4.u0 = true;
                    ci0Var4.t0 = true;
                }
                ci0 ci0Var5 = this.c;
                Integer num = this.h;
                ci0Var5.E0(num == null ? num.intValue() : 7);
                this.c.B1 = r12;
                setImageDrawable(new di0(this, i10, i11));
                if (this.e) {
                    return;
                }
                this.c.P();
                return;
            }
            ci0 ci0Var6 = this.c;
            org.telegram.messenger.ic b10 = org.telegram.messenger.ic.b(document);
            String str3 = i10 + "_" + i11 + "_g";
            if (icVar == null) {
                icVar = org.telegram.messenger.ic.c(w9, document);
            }
            ci0Var6.r0(b10, str3, icVar, str, null, document.size, null, document, 1);
        }
        r12 = 0;
        ci0 ci0Var32 = this.c;
        ci0Var32.R0 = true;
        ci0Var32.H0(this);
        if (this.d) {
        }
        ci0 ci0Var52 = this.c;
        Integer num2 = this.h;
        ci0Var52.E0(num2 == null ? num2.intValue() : 7);
        this.c.B1 = r12;
        setImageDrawable(new di0(this, i10, i11));
        if (this.e) {
        }
    }

    public bi0 getAnimatedDrawable() {
        return this.b;
    }

    public ImageReceiver getImageReceiver() {
        return this.c;
    }

    public final void h(int i10, String str) {
        if (this.a == null) {
            this.a = new HashMap();
        }
        this.a.put(str, Integer.valueOf(i10));
        bi0 bi0Var = this.b;
        if (bi0Var != null) {
            bi0Var.Q(i10, str);
        }
    }

    public final void i() {
        bi0 bi0Var = this.b;
        if (bi0Var == null && this.c == null) {
            return;
        }
        this.f = false;
        if (this.e) {
            if (bi0Var != null) {
                bi0Var.stop();
            }
            ci0 ci0Var = this.c;
            if (ci0Var != null) {
                ci0Var.Q0();
            }
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.e = true;
        ci0 ci0Var = this.c;
        if (ci0Var != null) {
            ci0Var.P();
            if (this.f) {
                this.c.P0(false);
            }
        }
        bi0 bi0Var = this.b;
        if (bi0Var != null) {
            bi0Var.setCallback(this);
            if (this.f) {
                this.b.start();
            }
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.e = false;
        bi0 bi0Var = this.b;
        if (bi0Var != null) {
            bi0Var.stop();
        }
        ci0 ci0Var = this.c;
        if (ci0Var != null) {
            ci0Var.R();
        }
    }

    public void setAnimation(bi0 bi0Var) {
        if (this.b == bi0Var) {
            return;
        }
        ci0 ci0Var = this.c;
        if (ci0Var != null) {
            ci0Var.R();
            this.c = null;
        }
        this.b = bi0Var;
        bi0Var.R(this);
        if (this.d) {
            this.b.K(1);
        }
        HashMap hashMap = this.a;
        if (hashMap != null) {
            this.b.Z = true;
            for (Map.Entry entry : hashMap.entrySet()) {
                bi0 bi0Var2 = this.b;
                String str = (String) entry.getKey();
                Integer num = (Integer) entry.getValue();
                num.getClass();
                bi0Var2.s.put(str, num);
                bi0Var2.G();
            }
            this.b.o();
        }
        this.b.J(true);
        setImageDrawable(this.b);
    }

    public void setAutoRepeat(boolean z10) {
        this.d = z10;
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i10) {
        super.setImageResource(i10);
        this.b = null;
    }

    public void setLayerNum(Integer num) {
        this.h = num;
        ci0 ci0Var = this.c;
        if (ci0Var != null) {
            ci0Var.E0(num.intValue());
        }
    }

    public void setOnAnimationEndListener(Runnable runnable) {
        bi0 bi0Var = this.b;
        if (bi0Var != null) {
            bi0Var.t0 = runnable;
        }
    }

    public void setOnlyLastFrame(boolean z10) {
        this.n = z10;
    }

    public void setProgress(float f7) {
        bi0 bi0Var = this.b;
        if (bi0Var != null) {
            bi0Var.T(true, f7);
        }
    }

    public void c() {
    }
}
