package org.telegram.ui.Components;

import android.content.Context;
import android.widget.ImageView;
import java.util.HashMap;
import java.util.Map;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public class qh0 extends ImageView {
    public HashMap a;
    public nh0 b;
    public oh0 c;
    public boolean d;
    public boolean e;
    public boolean f;
    public Integer h;
    public boolean n;

    public qh0(Context context) {
        super(context);
    }

    public final void a() {
        nh0 nh0Var = this.b;
        if (nh0Var != null) {
            nh0Var.stop();
        }
        oh0 oh0Var = this.c;
        if (oh0Var != null) {
            oh0Var.S();
            this.c = null;
        }
        this.b = null;
        setImageDrawable(null);
    }

    public final boolean b() {
        nh0 nh0Var = this.b;
        return nh0Var != null && nh0Var.l0;
    }

    public final void d() {
        nh0 nh0Var = this.b;
        if (nh0Var == null && this.c == null) {
            return;
        }
        this.f = true;
        if (this.e) {
            if (nh0Var != null) {
                nh0Var.start();
            }
            oh0 oh0Var = this.c;
            if (oh0Var != null) {
                oh0Var.Q0(false);
            }
        }
    }

    public final void e(int i7, int i10, int i11) {
        f(i7, i10, i11, null);
    }

    public final void f(int i7, int i10, int i11, int[] iArr) {
        setAnimation(new nh0(i7, org.telegram.messenger.g0.L(i10), org.telegram.messenger.g0.L(i11), false, iArr));
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
        org.telegram.messenger.fc fcVar;
        String str;
        ?? r12;
        oh0 oh0Var = this.c;
        if (oh0Var != null) {
            oh0Var.S();
            this.c = null;
        }
        if (document == null) {
            return;
        }
        oh0 oh0Var2 = new oh0(this);
        this.c = oh0Var2;
        oh0Var2.A1 = true;
        String str2 = document.localThumbPath;
        if (str2 != null) {
            fcVar = org.telegram.messenger.fc.g(str2);
            str = com.google.android.gms.internal.vision.e2.j(i7, "_", i10);
        } else {
            fcVar = null;
            str = null;
        }
        TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(document.thumbs, 90, false, null, false);
        if (this.n) {
            this.c.v0(org.telegram.messenger.fc.b(document), i7 + "_" + i10 + "_lastframe", org.telegram.messenger.fc.c(w10, document), com.google.android.gms.internal.vision.e2.j(i7, "_", i10), fcVar, str, null, 0L, null, document, 1);
        } else {
            if (!"video/webm".equals(document.mime_type)) {
                org.telegram.messenger.kz d = org.telegram.messenger.u5.d(document.thumbs, org.telegram.ui.ActionBar.n6.m6, 0.2f, false);
                if (d != null) {
                    d.e = 512;
                    d.f = 512;
                }
                r12 = 0;
                this.c.v0(org.telegram.messenger.fc.b(document), i7 + "_" + i10 + "", org.telegram.messenger.fc.c(w10, document), com.google.android.gms.internal.vision.e2.j(i7, "_", i10), fcVar, str, d, 0L, null, document, 1);
                oh0 oh0Var3 = this.c;
                oh0Var3.S0 = true;
                oh0Var3.I0(this);
                if (this.d) {
                    this.c.X(r12);
                } else {
                    this.c.X(1);
                    oh0 oh0Var4 = this.c;
                    oh0Var4.v0 = true;
                    oh0Var4.u0 = true;
                }
                oh0 oh0Var5 = this.c;
                Integer num = this.h;
                oh0Var5.F0(num == null ? num.intValue() : 7);
                this.c.C1 = r12;
                setImageDrawable(new ph0(this, i7, i10));
                if (this.e) {
                    return;
                }
                this.c.Q();
                return;
            }
            oh0 oh0Var6 = this.c;
            org.telegram.messenger.fc b10 = org.telegram.messenger.fc.b(document);
            String str3 = i7 + "_" + i10 + "_g";
            if (fcVar == null) {
                fcVar = org.telegram.messenger.fc.c(w10, document);
            }
            oh0Var6.s0(b10, str3, fcVar, str, null, document.size, null, document, 1);
        }
        r12 = 0;
        oh0 oh0Var32 = this.c;
        oh0Var32.S0 = true;
        oh0Var32.I0(this);
        if (this.d) {
        }
        oh0 oh0Var52 = this.c;
        Integer num2 = this.h;
        oh0Var52.F0(num2 == null ? num2.intValue() : 7);
        this.c.C1 = r12;
        setImageDrawable(new ph0(this, i7, i10));
        if (this.e) {
        }
    }

    public nh0 getAnimatedDrawable() {
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
        nh0 nh0Var = this.b;
        if (nh0Var != null) {
            nh0Var.Q(i7, str);
        }
    }

    public final void i() {
        nh0 nh0Var = this.b;
        if (nh0Var == null && this.c == null) {
            return;
        }
        this.f = false;
        if (this.e) {
            if (nh0Var != null) {
                nh0Var.stop();
            }
            oh0 oh0Var = this.c;
            if (oh0Var != null) {
                oh0Var.R0();
            }
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.e = true;
        oh0 oh0Var = this.c;
        if (oh0Var != null) {
            oh0Var.Q();
            if (this.f) {
                this.c.Q0(false);
            }
        }
        nh0 nh0Var = this.b;
        if (nh0Var != null) {
            nh0Var.setCallback(this);
            if (this.f) {
                this.b.start();
            }
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.e = false;
        nh0 nh0Var = this.b;
        if (nh0Var != null) {
            nh0Var.stop();
        }
        oh0 oh0Var = this.c;
        if (oh0Var != null) {
            oh0Var.S();
        }
    }

    public void setAnimation(nh0 nh0Var) {
        if (this.b == nh0Var) {
            return;
        }
        oh0 oh0Var = this.c;
        if (oh0Var != null) {
            oh0Var.S();
            this.c = null;
        }
        this.b = nh0Var;
        nh0Var.R(this);
        if (this.d) {
            this.b.K(1);
        }
        HashMap hashMap = this.a;
        if (hashMap != null) {
            this.b.a0 = true;
            for (Map.Entry entry : hashMap.entrySet()) {
                nh0 nh0Var2 = this.b;
                String str = (String) entry.getKey();
                Integer num = (Integer) entry.getValue();
                num.getClass();
                nh0Var2.s.put(str, num);
                nh0Var2.G();
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
    public void setImageResource(int i7) {
        super.setImageResource(i7);
        this.b = null;
    }

    public void setLayerNum(Integer num) {
        this.h = num;
        oh0 oh0Var = this.c;
        if (oh0Var != null) {
            oh0Var.F0(num.intValue());
        }
    }

    public void setOnAnimationEndListener(Runnable runnable) {
        nh0 nh0Var = this.b;
        if (nh0Var != null) {
            nh0Var.u0 = runnable;
        }
    }

    public void setOnlyLastFrame(boolean z10) {
        this.n = z10;
    }

    public void setProgress(float f10) {
        nh0 nh0Var = this.b;
        if (nh0Var != null) {
            nh0Var.T(true, f10);
        }
    }

    public void c() {
    }
}
