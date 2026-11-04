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
import ei.i4;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.messenger.bd;
import org.telegram.messenger.ge;
import org.telegram.ui.Components.g6;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.u5;
import org.telegram.ui.Components.ug0;
import org.telegram.ui.Components.xq;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
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
        this.d = new u5(view, 350L, xq.h);
        this.f = new ug0(view);
        this.g = new gc(view);
        g6 g6Var = new g6(false, false, false);
        this.e = g6Var;
        g6Var.w(org.telegram.messenger.g0.L(11.0f));
        g6Var.r(true, true);
        g6Var.setCallback(view);
        g6Var.M = (int) (org.telegram.messenger.g0.q.x * 0.3f);
        this.b = false;
        g6Var.t(bd.M0(2131746447, null), false, true);
        String M0 = bd.M0(2131746446, null);
        TextPaint textPaint = g6Var.a;
        this.a = (int) Math.ceil(Math.max(textPaint.measureText(M0), textPaint.measureText(bd.M0(2131746447, null))));
    }

    public void a(m0 m0Var) {
        if (((ArrayList) this.h) == null) {
            this.h = new ArrayList();
        }
        ((ArrayList) this.h).add(m0Var);
    }

    public h b() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = (ArrayList) this.h;
        if (arrayList3 != null) {
            int size = arrayList3.size();
            int i3 = 0;
            while (i3 < size) {
                Object obj = arrayList3.get(i3);
                i3++;
                m0 m0Var = (m0) obj;
                m0Var.getClass();
                arrayList2.add(m0Var);
            }
        }
        return new h((IconCompat) this.d, (CharSequence) this.e, (PendingIntent) this.f, (Bundle) this.g, arrayList2.isEmpty() ? null : (m0[]) arrayList2.toArray(new m0[arrayList2.size()]), arrayList.isEmpty() ? null : (m0[]) arrayList.toArray(new m0[arrayList.size()]), this.b, this.a, this.c);
    }

    public boolean c() {
        vi.j jVar = (vi.j) this.e;
        jVar.getClass();
        vi.j.q();
        vi.f fVar = null;
        fVar = null;
        fVar = null;
        fVar = null;
        fVar = null;
        if (jVar.G == 5 && jVar.z != null && jVar.r == 0 && jVar.s == jVar.j()) {
            jVar.p();
            vi.i iVar = jVar.z;
            long j10 = jVar.j();
            long length = iVar.b.length();
            jVar.a(iVar, length);
            synchronized (jVar.l) {
                if (iVar.d && !iVar.e) {
                    iVar.e = true;
                    jVar.k.execute(new vi.c(jVar, iVar, length, j10, 0));
                    File file = iVar.b;
                    byte[] bArr = jVar.B;
                    jVar.C = new vi.f(file, j10, bArr != null ? (byte[]) bArr.clone() : null);
                    jVar.s(8);
                    jVar.c();
                    jVar.t();
                    jVar.l("detached_preview");
                    fVar = jVar.C;
                }
            }
        }
        if (fVar == null) {
            return false;
        }
        ((vi.j) this.e).o();
        this.c = true;
        return true;
    }

    public void d(Canvas canvas, RectF rectF, float f10, float f11, int i3, boolean z10, boolean z11) {
        Paint paint = (Paint) this.h;
        ug0 ug0Var = (ug0) this.f;
        g6 g6Var = (g6) this.e;
        if (z10 != this.b) {
            this.b = z10;
            g6Var.t(bd.M0(z10 ? 2131746446 : 2131746447, null), true, true);
        }
        int c2 = (int) (g6Var.c() + org.telegram.messenger.g0.L(23.66f));
        float L = org.telegram.messenger.g0.L(17.66f);
        rectF.set(f10 - c2, f11 - L, f10, f11);
        float a10 = ((gc) this.g).a(0.02f) * ((u5) this.d).d(z11);
        if (a10 > 0.0f) {
            paint.setColor(i0.a.o(i3, 30));
            canvas.save();
            canvas.scale(a10, a10, f10, f11);
            float f12 = L / 2.0f;
            canvas.drawRoundRect(rectF, f12, f12, paint);
            g6Var.setBounds((int) (rectF.left + org.telegram.messenger.g0.L(6.0f)), (int) rectF.top, (int) (rectF.right - org.telegram.messenger.g0.L(17.66f)), (int) rectF.bottom);
            g6Var.u(i3);
            g6Var.draw(canvas);
            float L2 = org.telegram.messenger.g0.L(14.0f);
            int L3 = (int) ((rectF.right - org.telegram.messenger.g0.L(3.33f)) - L2);
            float f13 = L2 / 2.0f;
            ug0Var.setBounds(L3, (int) ((rectF.centerY() - f13) + org.telegram.messenger.g0.L(0.33f)), (int) (rectF.right - org.telegram.messenger.g0.L(3.33f)), (int) (rectF.centerY() + f13 + org.telegram.messenger.g0.L(0.33f)));
            Paint paint2 = ug0Var.b;
            paint2.setColor(i3);
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
        vi.j jVar = (vi.j) this.e;
        jVar.getClass();
        vi.j.q();
        return jVar.e().a == 5;
    }

    public void f() {
        this.b = true;
    }

    public void g(boolean z10) {
        this.c = z10;
        ((gc) this.g).c(z10);
    }

    public boolean h() {
        vi.j jVar = (vi.j) this.e;
        jVar.getClass();
        vi.j.q();
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

    public g(Context context, File file, ge geVar) {
        this.d = new Handler(Looper.getMainLooper());
        this.f = new Object();
        this.g = new HashMap();
        this.h = new HashSet();
        this.a = 1;
        i4 i4Var = new i4(context, 3);
        i4Var.c = file;
        vi.h hVar = (vi.h) xi.e.c.a();
        if (hVar != null) {
            i4Var.d = hVar;
            i4Var.a = false;
            int i3 = 5;
            i4Var.e = new mi.h0(i3, this, geVar);
            i4Var.f = new m2.t(i3, this, geVar);
            i4Var.g = new kb.a(17);
            this.e = new vi.j(i4Var);
            return;
        }
        throw new IllegalArgumentException("Noise suppression mode is required");
    }

    public g(int i3, PendingIntent pendingIntent, String str) {
        IconCompat e10 = i3 == 0 ? null : IconCompat.e(null, "", i3);
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
