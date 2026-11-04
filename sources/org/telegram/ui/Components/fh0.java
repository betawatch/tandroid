package org.telegram.ui.Components;

import android.content.Context;
import android.widget.ImageView;
import java.util.HashMap;
import java.util.Map;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public class fh0 extends ImageView {
    public HashMap a;
    public ch0 b;
    public dh0 c;
    public boolean d;
    public boolean e;
    public boolean f;
    public Integer h;
    public boolean n;

    public fh0(Context context) {
        super(context);
    }

    public final void a() {
        ch0 ch0Var = this.b;
        if (ch0Var != null) {
            ch0Var.stop();
        }
        dh0 dh0Var = this.c;
        if (dh0Var != null) {
            dh0Var.R();
            this.c = null;
        }
        this.b = null;
        setImageDrawable(null);
    }

    public final boolean b() {
        ch0 ch0Var = this.b;
        return ch0Var != null && ch0Var.l0;
    }

    public final void d() {
        ch0 ch0Var = this.b;
        if (ch0Var == null && this.c == null) {
            return;
        }
        this.f = true;
        if (this.e) {
            if (ch0Var != null) {
                ch0Var.start();
            }
            dh0 dh0Var = this.c;
            if (dh0Var != null) {
                dh0Var.P0(false);
            }
        }
    }

    public final void e(int i3, int i10, int i11) {
        f(i3, i10, i11, null);
    }

    public final void f(int i3, int i10, int i11, int[] iArr) {
        setAnimation(new ch0(i3, org.telegram.messenger.g0.L(i10), org.telegram.messenger.g0.L(i11), false, iArr));
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
    public final void g(int i3, int i10, TLRPC.Document document) {
        org.telegram.messenger.ac acVar;
        String str;
        ?? r12;
        dh0 dh0Var = this.c;
        if (dh0Var != null) {
            dh0Var.R();
            this.c = null;
        }
        if (document == null) {
            return;
        }
        dh0 dh0Var2 = new dh0(this);
        this.c = dh0Var2;
        dh0Var2.A1 = true;
        String str2 = document.localThumbPath;
        if (str2 != null) {
            acVar = org.telegram.messenger.ac.g(str2);
            str = com.google.android.recaptcha.internal.a.i(i3, "_", i10);
        } else {
            acVar = null;
            str = null;
        }
        TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(document.thumbs, 90, false, null, false);
        if (this.n) {
            this.c.u0(org.telegram.messenger.ac.b(document), i3 + "_" + i10 + "_lastframe", org.telegram.messenger.ac.c(w10, document), com.google.android.recaptcha.internal.a.i(i3, "_", i10), acVar, str, null, 0L, null, document, 1);
        } else {
            if (!"video/webm".equals(document.mime_type)) {
                org.telegram.messenger.jz d = org.telegram.messenger.t5.d(document.thumbs, org.telegram.ui.ActionBar.k6.m6, 0.2f, false);
                if (d != null) {
                    d.e = 512;
                    d.f = 512;
                }
                r12 = 0;
                this.c.u0(org.telegram.messenger.ac.b(document), i3 + "_" + i10 + "", org.telegram.messenger.ac.c(w10, document), com.google.android.recaptcha.internal.a.i(i3, "_", i10), acVar, str, d, 0L, null, document, 1);
                dh0 dh0Var3 = this.c;
                dh0Var3.S0 = true;
                dh0Var3.H0(this);
                if (this.d) {
                    this.c.W(r12);
                } else {
                    this.c.W(1);
                    dh0 dh0Var4 = this.c;
                    dh0Var4.v0 = true;
                    dh0Var4.u0 = true;
                }
                dh0 dh0Var5 = this.c;
                Integer num = this.h;
                dh0Var5.E0(num == null ? num.intValue() : 7);
                this.c.C1 = r12;
                setImageDrawable(new eh0(this, i3, i10));
                if (this.e) {
                    return;
                }
                this.c.P();
                return;
            }
            dh0 dh0Var6 = this.c;
            org.telegram.messenger.ac b10 = org.telegram.messenger.ac.b(document);
            String str3 = i3 + "_" + i10 + "_g";
            if (acVar == null) {
                acVar = org.telegram.messenger.ac.c(w10, document);
            }
            dh0Var6.r0(b10, str3, acVar, str, null, document.size, null, document, 1);
        }
        r12 = 0;
        dh0 dh0Var32 = this.c;
        dh0Var32.S0 = true;
        dh0Var32.H0(this);
        if (this.d) {
        }
        dh0 dh0Var52 = this.c;
        Integer num2 = this.h;
        dh0Var52.E0(num2 == null ? num2.intValue() : 7);
        this.c.C1 = r12;
        setImageDrawable(new eh0(this, i3, i10));
        if (this.e) {
        }
    }

    public ch0 getAnimatedDrawable() {
        return this.b;
    }

    public ImageReceiver getImageReceiver() {
        return this.c;
    }

    public final void h(int i3, String str) {
        if (this.a == null) {
            this.a = new HashMap();
        }
        this.a.put(str, Integer.valueOf(i3));
        ch0 ch0Var = this.b;
        if (ch0Var != null) {
            ch0Var.Q(i3, str);
        }
    }

    public final void i() {
        ch0 ch0Var = this.b;
        if (ch0Var == null && this.c == null) {
            return;
        }
        this.f = false;
        if (this.e) {
            if (ch0Var != null) {
                ch0Var.stop();
            }
            dh0 dh0Var = this.c;
            if (dh0Var != null) {
                dh0Var.Q0();
            }
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.e = true;
        dh0 dh0Var = this.c;
        if (dh0Var != null) {
            dh0Var.P();
            if (this.f) {
                this.c.P0(false);
            }
        }
        ch0 ch0Var = this.b;
        if (ch0Var != null) {
            ch0Var.setCallback(this);
            if (this.f) {
                this.b.start();
            }
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.e = false;
        ch0 ch0Var = this.b;
        if (ch0Var != null) {
            ch0Var.stop();
        }
        dh0 dh0Var = this.c;
        if (dh0Var != null) {
            dh0Var.R();
        }
    }

    public void setAnimation(ch0 ch0Var) {
        if (this.b == ch0Var) {
            return;
        }
        dh0 dh0Var = this.c;
        if (dh0Var != null) {
            dh0Var.R();
            this.c = null;
        }
        this.b = ch0Var;
        ch0Var.R(this);
        if (this.d) {
            this.b.K(1);
        }
        HashMap hashMap = this.a;
        if (hashMap != null) {
            this.b.a0 = true;
            for (Map.Entry entry : hashMap.entrySet()) {
                ch0 ch0Var2 = this.b;
                String str = (String) entry.getKey();
                Integer num = (Integer) entry.getValue();
                num.getClass();
                ch0Var2.s.put(str, num);
                ch0Var2.G();
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
    public void setImageResource(int i3) {
        super.setImageResource(i3);
        this.b = null;
    }

    public void setLayerNum(Integer num) {
        this.h = num;
        dh0 dh0Var = this.c;
        if (dh0Var != null) {
            dh0Var.E0(num.intValue());
        }
    }

    public void setOnAnimationEndListener(Runnable runnable) {
        ch0 ch0Var = this.b;
        if (ch0Var != null) {
            ch0Var.u0 = runnable;
        }
    }

    public void setOnlyLastFrame(boolean z10) {
        this.n = z10;
    }

    public void setProgress(float f10) {
        ch0 ch0Var = this.b;
        if (ch0Var != null) {
            ch0Var.T(true, f10);
        }
    }

    public void c() {
    }
}
