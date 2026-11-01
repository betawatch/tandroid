package org.telegram.ui.Components;

import android.content.Context;
import android.widget.ImageView;
import java.util.HashMap;
import java.util.Map;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public class fi0 extends ImageView {
    public HashMap a;
    public ci0 b;
    public di0 c;
    public boolean d;
    public boolean e;
    public boolean f;
    public Integer h;
    public boolean n;

    public fi0(Context context) {
        super(context);
    }

    public final void a() {
        ci0 ci0Var = this.b;
        if (ci0Var != null) {
            ci0Var.stop();
        }
        di0 di0Var = this.c;
        if (di0Var != null) {
            di0Var.R();
            this.c = null;
        }
        this.b = null;
        setImageDrawable(null);
    }

    public final boolean b() {
        ci0 ci0Var = this.b;
        return ci0Var != null && ci0Var.k0;
    }

    public final void d() {
        ci0 ci0Var = this.b;
        if (ci0Var == null && this.c == null) {
            return;
        }
        this.f = true;
        if (this.e) {
            if (ci0Var != null) {
                ci0Var.start();
            }
            di0 di0Var = this.c;
            if (di0Var != null) {
                di0Var.P0(false);
            }
        }
    }

    public final void e(int i10, int i11, int i12) {
        f(i10, i11, i12, null);
    }

    public final void f(int i10, int i11, int i12, int[] iArr) {
        setAnimation(new ci0(i10, org.telegram.messenger.i0.L(i11), org.telegram.messenger.i0.L(i12), false, iArr));
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
        org.telegram.messenger.jc jcVar;
        String str;
        ?? r12;
        di0 di0Var = this.c;
        if (di0Var != null) {
            di0Var.R();
            this.c = null;
        }
        if (document == null) {
            return;
        }
        di0 di0Var2 = new di0(this);
        this.c = di0Var2;
        di0Var2.z1 = true;
        String str2 = document.localThumbPath;
        if (str2 != null) {
            jcVar = org.telegram.messenger.jc.g(str2);
            str = a1.g.i(i10, i11, "_");
        } else {
            jcVar = null;
            str = null;
        }
        TLRPC.PhotoSize w9 = org.telegram.messenger.b8.w(document.thumbs, 90, false, null, false);
        if (this.n) {
            this.c.u0(org.telegram.messenger.jc.b(document), i10 + "_" + i11 + "_lastframe", org.telegram.messenger.jc.c(w9, document), a1.g.i(i10, i11, "_"), jcVar, str, null, 0L, null, document, 1);
        } else {
            if (!"video/webm".equals(document.mime_type)) {
                org.telegram.messenger.d00 d = org.telegram.messenger.v5.d(document.thumbs, org.telegram.ui.ActionBar.t6.m6, 0.2f, false);
                if (d != null) {
                    d.e = 512;
                    d.f = 512;
                }
                r12 = 0;
                this.c.u0(org.telegram.messenger.jc.b(document), i10 + "_" + i11 + "", org.telegram.messenger.jc.c(w9, document), a1.g.i(i10, i11, "_"), jcVar, str, d, 0L, null, document, 1);
                di0 di0Var3 = this.c;
                di0Var3.R0 = true;
                di0Var3.H0(this);
                if (this.d) {
                    this.c.W(r12);
                } else {
                    this.c.W(1);
                    di0 di0Var4 = this.c;
                    di0Var4.u0 = true;
                    di0Var4.t0 = true;
                }
                di0 di0Var5 = this.c;
                Integer num = this.h;
                di0Var5.E0(num == null ? num.intValue() : 7);
                this.c.B1 = r12;
                setImageDrawable(new ei0(this, i10, i11));
                if (this.e) {
                    return;
                }
                this.c.P();
                return;
            }
            di0 di0Var6 = this.c;
            org.telegram.messenger.jc b10 = org.telegram.messenger.jc.b(document);
            String str3 = i10 + "_" + i11 + "_g";
            if (jcVar == null) {
                jcVar = org.telegram.messenger.jc.c(w9, document);
            }
            di0Var6.r0(b10, str3, jcVar, str, null, document.size, null, document, 1);
        }
        r12 = 0;
        di0 di0Var32 = this.c;
        di0Var32.R0 = true;
        di0Var32.H0(this);
        if (this.d) {
        }
        di0 di0Var52 = this.c;
        Integer num2 = this.h;
        di0Var52.E0(num2 == null ? num2.intValue() : 7);
        this.c.B1 = r12;
        setImageDrawable(new ei0(this, i10, i11));
        if (this.e) {
        }
    }

    public ci0 getAnimatedDrawable() {
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
        ci0 ci0Var = this.b;
        if (ci0Var != null) {
            ci0Var.Q(i10, str);
        }
    }

    public final void i() {
        ci0 ci0Var = this.b;
        if (ci0Var == null && this.c == null) {
            return;
        }
        this.f = false;
        if (this.e) {
            if (ci0Var != null) {
                ci0Var.stop();
            }
            di0 di0Var = this.c;
            if (di0Var != null) {
                di0Var.Q0();
            }
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.e = true;
        di0 di0Var = this.c;
        if (di0Var != null) {
            di0Var.P();
            if (this.f) {
                this.c.P0(false);
            }
        }
        ci0 ci0Var = this.b;
        if (ci0Var != null) {
            ci0Var.setCallback(this);
            if (this.f) {
                this.b.start();
            }
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.e = false;
        ci0 ci0Var = this.b;
        if (ci0Var != null) {
            ci0Var.stop();
        }
        di0 di0Var = this.c;
        if (di0Var != null) {
            di0Var.R();
        }
    }

    public void setAnimation(ci0 ci0Var) {
        if (this.b == ci0Var) {
            return;
        }
        di0 di0Var = this.c;
        if (di0Var != null) {
            di0Var.R();
            this.c = null;
        }
        this.b = ci0Var;
        ci0Var.R(this);
        if (this.d) {
            this.b.K(1);
        }
        HashMap hashMap = this.a;
        if (hashMap != null) {
            this.b.Z = true;
            for (Map.Entry entry : hashMap.entrySet()) {
                ci0 ci0Var2 = this.b;
                String str = (String) entry.getKey();
                Integer num = (Integer) entry.getValue();
                num.getClass();
                ci0Var2.s.put(str, num);
                ci0Var2.G();
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
        di0 di0Var = this.c;
        if (di0Var != null) {
            di0Var.E0(num.intValue());
        }
    }

    public void setOnAnimationEndListener(Runnable runnable) {
        ci0 ci0Var = this.b;
        if (ci0Var != null) {
            ci0Var.t0 = runnable;
        }
    }

    public void setOnlyLastFrame(boolean z10) {
        this.n = z10;
    }

    public void setProgress(float f7) {
        ci0 ci0Var = this.b;
        if (ci0Var != null) {
            ci0Var.T(true, f7);
        }
    }

    public void c() {
    }
}
