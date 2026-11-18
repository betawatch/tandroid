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
import fi.y3;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.messenger.gd;
import org.telegram.messenger.ke;
import org.telegram.ui.Components.c6;
import org.telegram.ui.Components.eh0;
import org.telegram.ui.Components.lr;
import org.telegram.ui.Components.m6;
import org.telegram.ui.Components.mc;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes.dex */
public final class g {
    public int a;
    public boolean b;
    public boolean c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    public Object h;

    public g(View view) {
        this.h = new Paint(1);
        this.d = new c6(view, 350L, lr.h);
        this.f = new eh0(view);
        this.g = new mc(view);
        m6 m6Var = new m6(false, false, false);
        this.e = m6Var;
        m6Var.w(org.telegram.messenger.g0.L(11.0f));
        m6Var.r(true, true);
        m6Var.setCallback(view);
        m6Var.N = (int) (org.telegram.messenger.g0.q.x * 0.3f);
        this.b = false;
        m6Var.t(gd.M0(2131746244, null), false, true);
        String M0 = gd.M0(2131746243, null);
        TextPaint textPaint = m6Var.a;
        this.a = (int) Math.ceil(Math.max(textPaint.measureText(M0), textPaint.measureText(gd.M0(2131746244, null))));
    }

    public void a(l0 l0Var) {
        if (((ArrayList) this.h) == null) {
            this.h = new ArrayList();
        }
        ((ArrayList) this.h).add(l0Var);
    }

    public h b() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = (ArrayList) this.h;
        if (arrayList3 != null) {
            int size = arrayList3.size();
            int i7 = 0;
            while (i7 < size) {
                Object obj = arrayList3.get(i7);
                i7++;
                l0 l0Var = (l0) obj;
                l0Var.getClass();
                arrayList2.add(l0Var);
            }
        }
        return new h((IconCompat) this.d, (CharSequence) this.e, (PendingIntent) this.f, (Bundle) this.g, arrayList2.isEmpty() ? null : (l0[]) arrayList2.toArray(new l0[arrayList2.size()]), arrayList.isEmpty() ? null : (l0[]) arrayList.toArray(new l0[arrayList.size()]), this.b, this.a, this.c);
    }

    public boolean c() {
        yi.j jVar = (yi.j) this.e;
        jVar.getClass();
        yi.j.q();
        ac.e eVar = null;
        eVar = null;
        eVar = null;
        eVar = null;
        eVar = null;
        if (jVar.G == 5 && jVar.z != null && jVar.r == 0 && jVar.s == jVar.j()) {
            jVar.p();
            yi.h hVar = jVar.z;
            long j3 = jVar.j();
            long length = hVar.b.length();
            jVar.a(hVar, length);
            synchronized (jVar.l) {
                if (hVar.d && !hVar.e) {
                    hVar.e = true;
                    jVar.k.execute(new yi.c(jVar, hVar, length, j3, 0));
                    File file = hVar.b;
                    byte[] bArr = jVar.B;
                    jVar.C = new ac.e(file, j3, bArr != null ? (byte[]) bArr.clone() : null);
                    jVar.s(8);
                    jVar.c();
                    jVar.t();
                    jVar.l("detached_preview");
                    eVar = jVar.C;
                }
            }
        }
        if (eVar == null) {
            return false;
        }
        ((yi.j) this.e).o();
        this.c = true;
        return true;
    }

    public void d(Canvas canvas, RectF rectF, float f10, float f11, int i7, boolean z10, boolean z11) {
        Paint paint = (Paint) this.h;
        eh0 eh0Var = (eh0) this.f;
        m6 m6Var = (m6) this.e;
        if (z10 != this.b) {
            this.b = z10;
            m6Var.t(gd.M0(z10 ? 2131746243 : 2131746244, null), true, true);
        }
        int c10 = (int) (m6Var.c() + org.telegram.messenger.g0.L(23.66f));
        float L = org.telegram.messenger.g0.L(17.66f);
        rectF.set(f10 - c10, f11 - L, f10, f11);
        float a10 = ((mc) this.g).a(0.02f) * ((c6) this.d).d(z11);
        if (a10 > 0.0f) {
            paint.setColor(i0.a.o(i7, 30));
            canvas.save();
            canvas.scale(a10, a10, f10, f11);
            float f12 = L / 2.0f;
            canvas.drawRoundRect(rectF, f12, f12, paint);
            m6Var.setBounds((int) (rectF.left + org.telegram.messenger.g0.L(6.0f)), (int) rectF.top, (int) (rectF.right - org.telegram.messenger.g0.L(17.66f)), (int) rectF.bottom);
            m6Var.u(i7);
            m6Var.draw(canvas);
            float L2 = org.telegram.messenger.g0.L(14.0f);
            int L3 = (int) ((rectF.right - org.telegram.messenger.g0.L(3.33f)) - L2);
            float f13 = L2 / 2.0f;
            eh0Var.setBounds(L3, (int) ((rectF.centerY() - f13) + org.telegram.messenger.g0.L(0.33f)), (int) (rectF.right - org.telegram.messenger.g0.L(3.33f)), (int) (rectF.centerY() + f13 + org.telegram.messenger.g0.L(0.33f)));
            Paint paint2 = eh0Var.b;
            paint2.setColor(i7);
            paint2.setAlpha(eh0Var.d);
            boolean z12 = !z10;
            if (eh0Var.e != z12) {
                eh0Var.e = z12;
                eh0Var.a.invalidate();
            }
            eh0Var.draw(canvas);
            canvas.restore();
        }
    }

    public boolean e() {
        yi.j jVar = (yi.j) this.e;
        jVar.getClass();
        yi.j.q();
        return jVar.e().a == 5;
    }

    public void f() {
        this.b = true;
    }

    public void g(boolean z10) {
        this.c = z10;
        ((mc) this.g).c(z10);
    }

    public boolean h() {
        yi.j jVar = (yi.j) this.e;
        jVar.getClass();
        yi.j.q();
        if (jVar.G != 1) {
            return false;
        }
        File file = jVar.b;
        if ((!file.isDirectory() && !file.mkdirs()) || !file.canWrite()) {
            jVar.g(new IllegalStateException("Output directory is not writable: " + file));
            return false;
        }
        jVar.h.b("start requested");
        jVar.d();
        jVar.s(2);
        jVar.u(0L, -1L, null);
        return true;
    }

    public g(Context context, File file, ke keVar) {
        this.d = new Handler(Looper.getMainLooper());
        this.f = new Object();
        this.g = new HashMap();
        this.h = new HashSet();
        this.a = 1;
        y3 y3Var = new y3(context, 3);
        y3Var.c = file;
        yi.g gVar = (yi.g) aj.e.c.a();
        if (gVar != null) {
            y3Var.d = gVar;
            y3Var.a = false;
            y3Var.e = new ji.j(this, keVar, false, 9);
            y3Var.f = new k8.a(8, this, keVar);
            y3Var.g = new nb.a(17);
            this.e = new yi.j(y3Var);
            return;
        }
        throw new IllegalArgumentException("Noise suppression mode is required");
    }

    public g(int i7, PendingIntent pendingIntent, String str) {
        IconCompat e10 = i7 == 0 ? null : IconCompat.e(null, "", i7);
        Bundle bundle = new Bundle();
        this.b = true;
        this.c = true;
        this.d = e10;
        this.e = q.d(str);
        this.f = pendingIntent;
        this.g = bundle;
        this.h = null;
        this.b = true;
        this.a = 0;
        this.c = true;
    }
}
