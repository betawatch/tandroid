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
import fi.a4;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.messenger.hd;
import org.telegram.messenger.le;
import org.telegram.ui.Components.dc;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.g6;
import org.telegram.ui.Components.u5;
import org.telegram.ui.Components.ug0;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
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
        this.d = new u5(view, 350L, er.h);
        this.f = new ug0(view);
        this.g = new dc(view);
        g6 g6Var = new g6(false, false, false);
        this.e = g6Var;
        g6Var.w(org.telegram.messenger.g0.L(11.0f));
        g6Var.r(true, true);
        g6Var.setCallback(view);
        g6Var.N = (int) (org.telegram.messenger.g0.q.x * 0.3f);
        this.b = false;
        g6Var.t(hd.M0(2131746439, null), false, true);
        String M0 = hd.M0(2131746438, null);
        TextPaint textPaint = g6Var.a;
        this.a = (int) Math.ceil(Math.max(textPaint.measureText(M0), textPaint.measureText(hd.M0(2131746439, null))));
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
            yi.i iVar = jVar.z;
            long j3 = jVar.j();
            long length = iVar.b.length();
            jVar.a(iVar, length);
            synchronized (jVar.l) {
                if (iVar.d && !iVar.e) {
                    iVar.e = true;
                    jVar.k.execute(new yi.c(jVar, iVar, length, j3, 0));
                    File file = iVar.b;
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
        ug0 ug0Var = (ug0) this.f;
        g6 g6Var = (g6) this.e;
        if (z10 != this.b) {
            this.b = z10;
            g6Var.t(hd.M0(z10 ? 2131746438 : 2131746439, null), true, true);
        }
        int c10 = (int) (g6Var.c() + org.telegram.messenger.g0.L(23.66f));
        float L = org.telegram.messenger.g0.L(17.66f);
        rectF.set(f10 - c10, f11 - L, f10, f11);
        float a10 = ((dc) this.g).a(0.02f) * ((u5) this.d).d(z11);
        if (a10 > 0.0f) {
            paint.setColor(i0.a.o(i7, 30));
            canvas.save();
            canvas.scale(a10, a10, f10, f11);
            float f12 = L / 2.0f;
            canvas.drawRoundRect(rectF, f12, f12, paint);
            g6Var.setBounds((int) (rectF.left + org.telegram.messenger.g0.L(6.0f)), (int) rectF.top, (int) (rectF.right - org.telegram.messenger.g0.L(17.66f)), (int) rectF.bottom);
            g6Var.u(i7);
            g6Var.draw(canvas);
            float L2 = org.telegram.messenger.g0.L(14.0f);
            int L3 = (int) ((rectF.right - org.telegram.messenger.g0.L(3.33f)) - L2);
            float f13 = L2 / 2.0f;
            ug0Var.setBounds(L3, (int) ((rectF.centerY() - f13) + org.telegram.messenger.g0.L(0.33f)), (int) (rectF.right - org.telegram.messenger.g0.L(3.33f)), (int) (rectF.centerY() + f13 + org.telegram.messenger.g0.L(0.33f)));
            Paint paint2 = ug0Var.b;
            paint2.setColor(i7);
            paint2.setAlpha(ug0Var.d);
            boolean z12 = !z10;
            if (ug0Var.e != z12) {
                ug0Var.e = z12;
                ug0Var.a.invalidate();
            }
            ug0Var.draw(canvas);
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
        ((dc) this.g).c(z10);
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

    public g(Context context, File file, le leVar) {
        this.d = new Handler(Looper.getMainLooper());
        this.f = new Object();
        this.g = new HashMap();
        this.h = new HashSet();
        this.a = 1;
        a4 a4Var = new a4(context, 3);
        a4Var.c = file;
        yi.h hVar = (yi.h) aj.e.c.a();
        if (hVar != null) {
            a4Var.d = hVar;
            a4Var.a = false;
            a4Var.e = new ji.j(this, leVar, false, 9);
            a4Var.f = new k8.a(8, this, leVar);
            a4Var.g = new nb.a(17);
            this.e = new yi.j(a4Var);
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
