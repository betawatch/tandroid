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
import di.i4;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.messenger.id;
import org.telegram.messenger.me;
import org.telegram.ui.Components.h6;
import org.telegram.ui.Components.hc;
import org.telegram.ui.Components.rg0;
import org.telegram.ui.Components.v5;
import org.telegram.ui.Components.wq;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
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
        this.d = new v5(view, 350L, wq.h);
        this.f = new rg0(view);
        this.g = new hc(view);
        h6 h6Var = new h6(false, false, false);
        this.e = h6Var;
        h6Var.w(org.telegram.messenger.g0.L(11.0f));
        h6Var.r(true, true);
        h6Var.setCallback(view);
        h6Var.M = (int) (org.telegram.messenger.g0.q.x * 0.3f);
        this.b = false;
        h6Var.t(id.M0(2131746439, null), false, true);
        String M0 = id.M0(2131746438, null);
        TextPaint textPaint = h6Var.a;
        this.a = (int) Math.ceil(Math.max(textPaint.measureText(M0), textPaint.measureText(id.M0(2131746439, null))));
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
        h6 h6Var = (h6) this.e;
        if (z9 != this.b) {
            this.b = z9;
            h6Var.t(id.M0(z9 ? 2131746438 : 2131746439, null), true, true);
        }
        int c10 = (int) (h6Var.c() + org.telegram.messenger.g0.L(23.66f));
        float L = org.telegram.messenger.g0.L(17.66f);
        rectF.set(f10 - c10, f11 - L, f10, f11);
        float a10 = ((hc) this.g).a(0.02f) * ((v5) this.d).d(z10);
        if (a10 > 0.0f) {
            paint.setColor(i0.a.o(i7, 30));
            canvas.save();
            canvas.scale(a10, a10, f10, f11);
            float f12 = L / 2.0f;
            canvas.drawRoundRect(rectF, f12, f12, paint);
            h6Var.setBounds((int) (rectF.left + org.telegram.messenger.g0.L(6.0f)), (int) rectF.top, (int) (rectF.right - org.telegram.messenger.g0.L(17.66f)), (int) rectF.bottom);
            h6Var.u(i7);
            h6Var.draw(canvas);
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
        ((hc) this.g).c(z9);
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
        i4 i4Var = new i4(context, 3);
        i4Var.c = file;
        vi.f fVar = (vi.f) xi.e.c.a();
        if (fVar != null) {
            i4Var.d = fVar;
            i4Var.a = false;
            i4Var.e = new j2.n(11, this, meVar);
            i4Var.f = new m4.d0(this, meVar, false);
            i4Var.g = new w7.s(16, false);
            this.e = new vi.h(i4Var);
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
