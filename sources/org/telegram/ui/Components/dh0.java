package org.telegram.ui.Components;

import android.content.Context;
import android.widget.ImageView;
import java.util.HashMap;
import java.util.Map;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public class dh0 extends ImageView {
    public HashMap a;
    public ah0 b;
    public bh0 c;
    public boolean d;
    public boolean e;
    public boolean f;
    public Integer h;
    public boolean n;

    public dh0(Context context) {
        super(context);
    }

    public final void a() {
        ah0 ah0Var = this.b;
        if (ah0Var != null) {
            ah0Var.stop();
        }
        bh0 bh0Var = this.c;
        if (bh0Var != null) {
            bh0Var.R();
            this.c = null;
        }
        this.b = null;
        setImageDrawable(null);
    }

    public final boolean b() {
        ah0 ah0Var = this.b;
        return ah0Var != null && ah0Var.k0;
    }

    public final void d() {
        ah0 ah0Var = this.b;
        if (ah0Var == null && this.c == null) {
            return;
        }
        this.f = true;
        if (this.e) {
            if (ah0Var != null) {
                ah0Var.start();
            }
            bh0 bh0Var = this.c;
            if (bh0Var != null) {
                bh0Var.P0(false);
            }
        }
    }

    public final void e(int i7, int i10, int i11) {
        f(i7, i10, i11, null);
    }

    public final void f(int i7, int i10, int i11, int[] iArr) {
        setAnimation(new ah0(i7, org.telegram.messenger.g0.L(i10), org.telegram.messenger.g0.L(i11), false, iArr));
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
    public final void g(int i7, int i10, TLRPC.Document document) {
        org.telegram.messenger.hc hcVar;
        String str;
        ?? r12;
        bh0 bh0Var = this.c;
        if (bh0Var != null) {
            bh0Var.R();
            this.c = null;
        }
        if (document == null) {
            return;
        }
        bh0 bh0Var2 = new bh0(this);
        this.c = bh0Var2;
        bh0Var2.z1 = true;
        String str2 = document.localThumbPath;
        if (str2 != null) {
            hcVar = org.telegram.messenger.hc.g(str2);
            str = com.google.android.recaptcha.internal.a.j(i7, "_", i10);
        } else {
            hcVar = null;
            str = null;
        }
        TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(document.thumbs, 90, false, null, false);
        if (this.n) {
            this.c.u0(org.telegram.messenger.hc.b(document), i7 + "_" + i10 + "_lastframe", org.telegram.messenger.hc.c(w10, document), com.google.android.recaptcha.internal.a.j(i7, "_", i10), hcVar, str, null, 0L, null, document, 1);
        } else {
            if (!"video/webm".equals(document.mime_type)) {
                org.telegram.messenger.rz d = org.telegram.messenger.t5.d(document.thumbs, org.telegram.ui.ActionBar.l6.m6, 0.2f, false);
                if (d != null) {
                    d.e = 512;
                    d.f = 512;
                }
                r12 = 0;
                this.c.u0(org.telegram.messenger.hc.b(document), i7 + "_" + i10 + "", org.telegram.messenger.hc.c(w10, document), com.google.android.recaptcha.internal.a.j(i7, "_", i10), hcVar, str, d, 0L, null, document, 1);
                bh0 bh0Var3 = this.c;
                bh0Var3.R0 = true;
                bh0Var3.H0(this);
                if (this.d) {
                    this.c.W(r12);
                } else {
                    this.c.W(1);
                    bh0 bh0Var4 = this.c;
                    bh0Var4.u0 = true;
                    bh0Var4.t0 = true;
                }
                bh0 bh0Var5 = this.c;
                Integer num = this.h;
                bh0Var5.E0(num == null ? num.intValue() : 7);
                this.c.B1 = r12;
                setImageDrawable(new ch0(this, i7, i10));
                if (this.e) {
                    return;
                }
                this.c.P();
                return;
            }
            bh0 bh0Var6 = this.c;
            org.telegram.messenger.hc b10 = org.telegram.messenger.hc.b(document);
            String str3 = i7 + "_" + i10 + "_g";
            if (hcVar == null) {
                hcVar = org.telegram.messenger.hc.c(w10, document);
            }
            bh0Var6.r0(b10, str3, hcVar, str, null, document.size, null, document, 1);
        }
        r12 = 0;
        bh0 bh0Var32 = this.c;
        bh0Var32.R0 = true;
        bh0Var32.H0(this);
        if (this.d) {
        }
        bh0 bh0Var52 = this.c;
        Integer num2 = this.h;
        bh0Var52.E0(num2 == null ? num2.intValue() : 7);
        this.c.B1 = r12;
        setImageDrawable(new ch0(this, i7, i10));
        if (this.e) {
        }
    }

    public ah0 getAnimatedDrawable() {
        return this.b;
    }

    public ImageReceiver getImageReceiver() {
        return this.c;
    }

    public final void h(int i7, String str) {
        if (this.a == null) {
            this.a = new HashMap();
        }
        this.a.put(str, Integer.valueOf(i7));
        ah0 ah0Var = this.b;
        if (ah0Var != null) {
            ah0Var.Q(i7, str);
        }
    }

    public final void i() {
        ah0 ah0Var = this.b;
        if (ah0Var == null && this.c == null) {
            return;
        }
        this.f = false;
        if (this.e) {
            if (ah0Var != null) {
                ah0Var.stop();
            }
            bh0 bh0Var = this.c;
            if (bh0Var != null) {
                bh0Var.Q0();
            }
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.e = true;
        bh0 bh0Var = this.c;
        if (bh0Var != null) {
            bh0Var.P();
            if (this.f) {
                this.c.P0(false);
            }
        }
        ah0 ah0Var = this.b;
        if (ah0Var != null) {
            ah0Var.setCallback(this);
            if (this.f) {
                this.b.start();
            }
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.e = false;
        ah0 ah0Var = this.b;
        if (ah0Var != null) {
            ah0Var.stop();
        }
        bh0 bh0Var = this.c;
        if (bh0Var != null) {
            bh0Var.R();
        }
    }

    public void setAnimation(ah0 ah0Var) {
        if (this.b == ah0Var) {
            return;
        }
        bh0 bh0Var = this.c;
        if (bh0Var != null) {
            bh0Var.R();
            this.c = null;
        }
        this.b = ah0Var;
        ah0Var.R(this);
        if (this.d) {
            this.b.K(1);
        }
        HashMap hashMap = this.a;
        if (hashMap != null) {
            this.b.Z = true;
            for (Map.Entry entry : hashMap.entrySet()) {
                ah0 ah0Var2 = this.b;
                String str = (String) entry.getKey();
                Integer num = (Integer) entry.getValue();
                num.getClass();
                ah0Var2.s.put(str, num);
                ah0Var2.G();
            }
            this.b.o();
        }
        this.b.J(true);
        setImageDrawable(this.b);
    }

    public void setAutoRepeat(boolean z9) {
        this.d = z9;
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i7) {
        super.setImageResource(i7);
        this.b = null;
    }

    public void setLayerNum(Integer num) {
        this.h = num;
        bh0 bh0Var = this.c;
        if (bh0Var != null) {
            bh0Var.E0(num.intValue());
        }
    }

    public void setOnAnimationEndListener(Runnable runnable) {
        ah0 ah0Var = this.b;
        if (ah0Var != null) {
            ah0Var.t0 = runnable;
        }
    }

    public void setOnlyLastFrame(boolean z9) {
        this.n = z9;
    }

    public void setProgress(float f10) {
        ah0 ah0Var = this.b;
        if (ah0Var != null) {
            ah0Var.T(true, f10);
        }
    }

    public void c() {
    }
}
