package e0;

import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextPaint;
import android.view.View;
import androidx.core.graphics.drawable.IconCompat;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import k2.t0;
import org.telegram.messenger.cd;
import org.telegram.messenger.me;
import org.telegram.ui.Components.dc;
import org.telegram.ui.Components.e6;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.t5;
import org.telegram.ui.Components.th0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class h {
    public int a;
    public boolean b;
    public boolean c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    public Object h;

    public h(View view) {
        this.h = new Paint(1);
        this.d = new t5(view, 350L, gr.h);
        this.f = new th0(view);
        this.g = new dc(view);
        e6 e6Var = new e6(false, false, false);
        this.e = e6Var;
        e6Var.w(org.telegram.messenger.i0.L(11.0f));
        e6Var.r(true, true);
        e6Var.setCallback(view);
        e6Var.M = (int) (org.telegram.messenger.i0.q.x * 0.3f);
        this.b = false;
        e6Var.t(cd.L0(2131746454, null), false, true);
        String L0 = cd.L0(2131746453, null);
        TextPaint textPaint = e6Var.a;
        this.a = (int) Math.ceil(Math.max(textPaint.measureText(L0), textPaint.measureText(cd.L0(2131746454, null))));
    }

    public void a(n0 n0Var) {
        if (((ArrayList) this.h) == null) {
            this.h = new ArrayList();
        }
        ((ArrayList) this.h).add(n0Var);
    }

    public i b() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = (ArrayList) this.h;
        if (arrayList3 != null) {
            int size = arrayList3.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList3.get(i10);
                i10++;
                n0 n0Var = (n0) obj;
                n0Var.getClass();
                arrayList2.add(n0Var);
            }
        }
        return new i((IconCompat) this.d, (CharSequence) this.e, (PendingIntent) this.f, (Bundle) this.g, arrayList2.isEmpty() ? null : (n0[]) arrayList2.toArray(new n0[arrayList2.size()]), arrayList.isEmpty() ? null : (n0[]) arrayList.toArray(new n0[arrayList.size()]), this.b, this.a, this.c);
    }

    public boolean c() {
        ki.k kVar = (ki.k) this.e;
        kVar.getClass();
        ki.k.q();
        ki.g gVar = null;
        gVar = null;
        gVar = null;
        gVar = null;
        gVar = null;
        if (kVar.G == 5 && kVar.z != null && kVar.r == 0 && kVar.s == kVar.j()) {
            kVar.p();
            ki.j jVar = kVar.z;
            long j10 = kVar.j();
            long length = jVar.b.length();
            kVar.a(jVar, length);
            synchronized (kVar.l) {
                if (jVar.d && !jVar.e) {
                    jVar.e = true;
                    kVar.k.execute(new ki.c(kVar, jVar, length, j10, 0));
                    File file = jVar.b;
                    byte[] bArr = kVar.B;
                    kVar.C = new ki.g(file, j10, bArr != null ? (byte[]) bArr.clone() : null);
                    kVar.s(8);
                    kVar.c();
                    kVar.t();
                    kVar.l("detached_preview");
                    gVar = kVar.C;
                }
            }
        }
        if (gVar == null) {
            return false;
        }
        ((ki.k) this.e).o();
        this.c = true;
        return true;
    }

    public void d(Canvas canvas, RectF rectF, float f7, float f10, int i10, boolean z10, boolean z11) {
        Paint paint = (Paint) this.h;
        th0 th0Var = (th0) this.f;
        e6 e6Var = (e6) this.e;
        if (z10 != this.b) {
            this.b = z10;
            e6Var.t(cd.L0(z10 ? 2131746453 : 2131746454, null), true, true);
        }
        int c10 = (int) (e6Var.c() + org.telegram.messenger.i0.L(23.66f));
        float L = org.telegram.messenger.i0.L(17.66f);
        rectF.set(f7 - c10, f10 - L, f7, f10);
        float a2 = ((dc) this.g).a(0.02f) * ((t5) this.d).d(z11);
        if (a2 > 0.0f) {
            paint.setColor(i0.b.o(i10, 30));
            canvas.save();
            canvas.scale(a2, a2, f7, f10);
            float f11 = L / 2.0f;
            canvas.drawRoundRect(rectF, f11, f11, paint);
            e6Var.setBounds((int) (rectF.left + org.telegram.messenger.i0.L(6.0f)), (int) rectF.top, (int) (rectF.right - org.telegram.messenger.i0.L(17.66f)), (int) rectF.bottom);
            e6Var.u(i10);
            e6Var.draw(canvas);
            float L2 = org.telegram.messenger.i0.L(14.0f);
            int L3 = (int) ((rectF.right - org.telegram.messenger.i0.L(3.33f)) - L2);
            float f12 = L2 / 2.0f;
            th0Var.setBounds(L3, (int) ((rectF.centerY() - f12) + org.telegram.messenger.i0.L(0.33f)), (int) (rectF.right - org.telegram.messenger.i0.L(3.33f)), (int) (rectF.centerY() + f12 + org.telegram.messenger.i0.L(0.33f)));
            Paint paint2 = th0Var.b;
            paint2.setColor(i10);
            paint2.setAlpha(th0Var.d);
            boolean z12 = !z10;
            if (th0Var.e != z12) {
                th0Var.e = z12;
                th0Var.a.invalidate();
            }
            th0Var.draw(canvas);
            canvas.restore();
        }
    }

    public boolean e() {
        ki.k kVar = (ki.k) this.e;
        kVar.getClass();
        ki.k.q();
        return kVar.e().a == 5;
    }

    public void f() {
        this.b = true;
    }

    public void g(boolean z10) {
        this.c = z10;
        ((dc) this.g).c(z10);
    }

    public boolean h() {
        ki.k kVar = (ki.k) this.e;
        kVar.getClass();
        ki.k.q();
        if (kVar.G != 1) {
            return false;
        }
        File file = kVar.b;
        if ((!file.isDirectory() && !file.mkdirs()) || !file.canWrite()) {
            kVar.g(new IllegalStateException("Output directory is not writable: " + file));
            return false;
        }
        kVar.h.b("start requested");
        kVar.d();
        kVar.s(2);
        kVar.u(0L, -1L, null);
        return true;
    }

    public h(Context context, File file, me meVar) {
        this.d = new Handler(Looper.getMainLooper());
        this.f = new Object();
        this.g = new HashMap();
        this.h = new HashSet();
        this.a = 1;
        t0 t0Var = new t0(context, 1);
        t0Var.c = file;
        ki.i iVar = (ki.i) mi.e.c.a();
        if (iVar != null) {
            t0Var.d = iVar;
            t0Var.b = false;
            t0Var.e = new m5.e(this, meVar, false, 6);
            t0Var.f = new m4.c(8, this, meVar);
            t0Var.g = new oa.d(13);
            this.e = new ki.k(t0Var);
            return;
        }
        throw new IllegalArgumentException("Noise suppression mode is required");
    }

    public h(int i10, String str, PendingIntent pendingIntent) {
        IconCompat e = i10 == 0 ? null : IconCompat.e(null, "", i10);
        Bundle bundle = new Bundle();
        this.b = true;
        this.c = true;
        this.d = e;
        this.e = r.d(str);
        this.f = pendingIntent;
        this.g = bundle;
        this.h = null;
        this.b = true;
        this.a = 0;
        this.c = true;
    }
}
