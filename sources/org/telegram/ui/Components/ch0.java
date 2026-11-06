package org.telegram.ui.Components;

import android.content.Context;
import android.widget.ImageView;
import java.util.HashMap;
import java.util.Map;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public class ch0 extends ImageView {
    public HashMap a;
    public zg0 b;
    public ah0 c;
    public boolean d;
    public boolean e;
    public boolean f;
    public Integer h;
    public boolean n;

    public ch0(Context context) {
        super(context);
    }

    public final void a() {
        zg0 zg0Var = this.b;
        if (zg0Var != null) {
            zg0Var.stop();
        }
        ah0 ah0Var = this.c;
        if (ah0Var != null) {
            ah0Var.R();
            this.c = null;
        }
        this.b = null;
        setImageDrawable(null);
    }

    public final boolean b() {
        zg0 zg0Var = this.b;
        return zg0Var != null && zg0Var.k0;
    }

    public final void d() {
        zg0 zg0Var = this.b;
        if (zg0Var == null && this.c == null) {
            return;
        }
        this.f = true;
        if (this.e) {
            if (zg0Var != null) {
                zg0Var.start();
            }
            ah0 ah0Var = this.c;
            if (ah0Var != null) {
                ah0Var.P0(false);
            }
        }
    }

    public final void e(int i7, int i10, int i11) {
        f(i7, i10, i11, null);
    }

    public final void f(int i7, int i10, int i11, int[] iArr) {
        setAnimation(new zg0(i7, org.telegram.messenger.g0.L(i10), org.telegram.messenger.g0.L(i11), false, iArr));
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
        ah0 ah0Var = this.c;
        if (ah0Var != null) {
            ah0Var.R();
            this.c = null;
        }
        if (document == null) {
            return;
        }
        ah0 ah0Var2 = new ah0(this);
        this.c = ah0Var2;
        ah0Var2.z1 = true;
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
                org.telegram.messenger.rz d = org.telegram.messenger.t5.d(document.thumbs, org.telegram.ui.ActionBar.k6.m6, 0.2f, false);
                if (d != null) {
                    d.e = 512;
                    d.f = 512;
                }
                r12 = 0;
                this.c.u0(org.telegram.messenger.hc.b(document), i7 + "_" + i10 + "", org.telegram.messenger.hc.c(w10, document), com.google.android.recaptcha.internal.a.j(i7, "_", i10), hcVar, str, d, 0L, null, document, 1);
                ah0 ah0Var3 = this.c;
                ah0Var3.R0 = true;
                ah0Var3.H0(this);
                if (this.d) {
                    this.c.W(r12);
                } else {
                    this.c.W(1);
                    ah0 ah0Var4 = this.c;
                    ah0Var4.u0 = true;
                    ah0Var4.t0 = true;
                }
                ah0 ah0Var5 = this.c;
                Integer num = this.h;
                ah0Var5.E0(num == null ? num.intValue() : 7);
                this.c.B1 = r12;
                setImageDrawable(new bh0(this, i7, i10));
                if (this.e) {
                    return;
                }
                this.c.P();
                return;
            }
            ah0 ah0Var6 = this.c;
            org.telegram.messenger.hc b10 = org.telegram.messenger.hc.b(document);
            String str3 = i7 + "_" + i10 + "_g";
            if (hcVar == null) {
                hcVar = org.telegram.messenger.hc.c(w10, document);
            }
            ah0Var6.r0(b10, str3, hcVar, str, null, document.size, null, document, 1);
        }
        r12 = 0;
        ah0 ah0Var32 = this.c;
        ah0Var32.R0 = true;
        ah0Var32.H0(this);
        if (this.d) {
        }
        ah0 ah0Var52 = this.c;
        Integer num2 = this.h;
        ah0Var52.E0(num2 == null ? num2.intValue() : 7);
        this.c.B1 = r12;
        setImageDrawable(new bh0(this, i7, i10));
        if (this.e) {
        }
    }

    public zg0 getAnimatedDrawable() {
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
        zg0 zg0Var = this.b;
        if (zg0Var != null) {
            zg0Var.Q(i7, str);
        }
    }

    public final void i() {
        zg0 zg0Var = this.b;
        if (zg0Var == null && this.c == null) {
            return;
        }
        this.f = false;
        if (this.e) {
            if (zg0Var != null) {
                zg0Var.stop();
            }
            ah0 ah0Var = this.c;
            if (ah0Var != null) {
                ah0Var.Q0();
            }
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.e = true;
        ah0 ah0Var = this.c;
        if (ah0Var != null) {
            ah0Var.P();
            if (this.f) {
                this.c.P0(false);
            }
        }
        zg0 zg0Var = this.b;
        if (zg0Var != null) {
            zg0Var.setCallback(this);
            if (this.f) {
                this.b.start();
            }
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.e = false;
        zg0 zg0Var = this.b;
        if (zg0Var != null) {
            zg0Var.stop();
        }
        ah0 ah0Var = this.c;
        if (ah0Var != null) {
            ah0Var.R();
        }
    }

    public void setAnimation(zg0 zg0Var) {
        if (this.b == zg0Var) {
            return;
        }
        ah0 ah0Var = this.c;
        if (ah0Var != null) {
            ah0Var.R();
            this.c = null;
        }
        this.b = zg0Var;
        zg0Var.R(this);
        if (this.d) {
            this.b.K(1);
        }
        HashMap hashMap = this.a;
        if (hashMap != null) {
            this.b.Z = true;
            for (Map.Entry entry : hashMap.entrySet()) {
                zg0 zg0Var2 = this.b;
                String str = (String) entry.getKey();
                Integer num = (Integer) entry.getValue();
                num.getClass();
                zg0Var2.s.put(str, num);
                zg0Var2.G();
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
        ah0 ah0Var = this.c;
        if (ah0Var != null) {
            ah0Var.E0(num.intValue());
        }
    }

    public void setOnAnimationEndListener(Runnable runnable) {
        zg0 zg0Var = this.b;
        if (zg0Var != null) {
            zg0Var.t0 = runnable;
        }
    }

    public void setOnlyLastFrame(boolean z9) {
        this.n = z9;
    }

    public void setProgress(float f10) {
        zg0 zg0Var = this.b;
        if (zg0Var != null) {
            zg0Var.T(true, f10);
        }
    }

    public void c() {
    }
}
