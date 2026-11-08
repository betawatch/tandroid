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
import di.h4;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.messenger.id;
import org.telegram.messenger.me;
import org.telegram.ui.Components.i6;
import org.telegram.ui.Components.ic;
import org.telegram.ui.Components.rg0;
import org.telegram.ui.Components.w5;
import org.telegram.ui.Components.xq;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
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
        this.d = new w5(view, 350L, xq.h);
        this.f = new rg0(view);
        this.g = new ic(view);
        i6 i6Var = new i6(false, false, false);
        this.e = i6Var;
        i6Var.w(org.telegram.messenger.g0.L(11.0f));
        i6Var.r(true, true);
        i6Var.setCallback(view);
        i6Var.M = (int) (org.telegram.messenger.g0.q.x * 0.3f);
        this.b = false;
        i6Var.t(id.M0(2131746440, null), false, true);
        String M0 = id.M0(2131746439, null);
        TextPaint textPaint = i6Var.a;
        this.a = (int) Math.ceil(Math.max(textPaint.measureText(M0), textPaint.measureText(id.M0(2131746440, null))));
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
        vi.h hVar = (vi.h) this.e;
        hVar.getClass();
        vi.h.q();
        ac.e eVar = null;
        eVar = null;
        eVar = null;
        eVar = null;
        eVar = null;
        if (hVar.G == 5 && hVar.z != null && hVar.r == 0 && hVar.s == hVar.j()) {
            hVar.p();
            vi.g gVar = hVar.z;
            long j3 = hVar.j();
            long length = gVar.b.length();
            hVar.a(gVar, length);
            synchronized (hVar.l) {
                if (gVar.d && !gVar.e) {
                    gVar.e = true;
                    hVar.k.execute(new vi.c(hVar, gVar, length, j3, 0));
                    File file = gVar.b;
                    byte[] bArr = hVar.B;
                    hVar.C = new ac.e(file, j3, bArr != null ? (byte[]) bArr.clone() : null);
                    hVar.s(8);
                    hVar.c();
                    hVar.t();
                    hVar.l("detached_preview");
                    eVar = hVar.C;
                }
            }
        }
        if (eVar == null) {
            return false;
        }
        ((vi.h) this.e).o();
        this.c = true;
        return true;
    }

    public void d(Canvas canvas, RectF rectF, float f10, float f11, int i7, boolean z9, boolean z10) {
        Paint paint = (Paint) this.h;
        rg0 rg0Var = (rg0) this.f;
        i6 i6Var = (i6) this.e;
        if (z9 != this.b) {
            this.b = z9;
            i6Var.t(id.M0(z9 ? 2131746439 : 2131746440, null), true, true);
        }
        int c10 = (int) (i6Var.c() + org.telegram.messenger.g0.L(23.66f));
        float L = org.telegram.messenger.g0.L(17.66f);
        rectF.set(f10 - c10, f11 - L, f10, f11);
        float a10 = ((ic) this.g).a(0.02f) * ((w5) this.d).d(z10);
        if (a10 > 0.0f) {
            paint.setColor(i0.a.o(i7, 30));
            canvas.save();
            canvas.scale(a10, a10, f10, f11);
            float f12 = L / 2.0f;
            canvas.drawRoundRect(rectF, f12, f12, paint);
            i6Var.setBounds((int) (rectF.left + org.telegram.messenger.g0.L(6.0f)), (int) rectF.top, (int) (rectF.right - org.telegram.messenger.g0.L(17.66f)), (int) rectF.bottom);
            i6Var.u(i7);
            i6Var.draw(canvas);
            float L2 = org.telegram.messenger.g0.L(14.0f);
            int L3 = (int) ((rectF.right - org.telegram.messenger.g0.L(3.33f)) - L2);
            float f13 = L2 / 2.0f;
            rg0Var.setBounds(L3, (int) ((rectF.centerY() - f13) + org.telegram.messenger.g0.L(0.33f)), (int) (rectF.right - org.telegram.messenger.g0.L(3.33f)), (int) (rectF.centerY() + f13 + org.telegram.messenger.g0.L(0.33f)));
            Paint paint2 = rg0Var.b;
            paint2.setColor(i7);
            paint2.setAlpha(rg0Var.d);
            boolean z11 = !z9;
            if (rg0Var.e != z11) {
                rg0Var.e = z11;
                rg0Var.a.invalidate();
            }
            rg0Var.draw(canvas);
            canvas.restore();
        }
    }

    public boolean e() {
        vi.h hVar = (vi.h) this.e;
        hVar.getClass();
        vi.h.q();
        return hVar.e().a == 5;
    }

    public void f() {
        this.b = true;
    }

    public void g(boolean z9) {
        this.c = z9;
        ((ic) this.g).c(z9);
    }

    public boolean h() {
        vi.h hVar = (vi.h) this.e;
        hVar.getClass();
        vi.h.q();
        if (hVar.G != 1) {
            return false;
        }
        File file = hVar.b;
        if ((!file.isDirectory() && !file.mkdirs()) || !file.canWrite()) {
            hVar.g(new IllegalStateException("Output directory is not writable: " + file));
            return false;
        }
        hVar.h.b("start requested");
        hVar.d();
        hVar.s(2);
        hVar.u(0L, -1L, null);
        return true;
    }

    public g(Context context, File file, me meVar) {
        this.d = new Handler(Looper.getMainLooper());
        this.f = new Object();
        this.g = new HashMap();
        this.h = new HashSet();
        this.a = 1;
        h4 h4Var = new h4(context, 3);
        h4Var.c = file;
        vi.f fVar = (vi.f) xi.e.c.a();
        if (fVar != null) {
            h4Var.d = fVar;
            h4Var.a = false;
            h4Var.e = new j2.n(11, this, meVar);
            h4Var.f = new m4.d0(this, meVar, false);
            h4Var.g = new w7.s(16, false);
            this.e = new vi.h(h4Var);
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
