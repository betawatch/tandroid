package dh;

import android.R;
import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.RichMessageLayout;
import org.telegram.messenger.SharedConfig;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class k {
    public static HashMap n;
    public final double a;
    public final double b;
    public final int c;
    public final g d;
    public final h e;
    public j f;
    public final int g;
    public final int h;
    public boolean i;
    public final ArrayList j = new ArrayList();
    public final HashMap k = new HashMap();
    public int l = 0;
    public final f m = new f(this, 0);

    public k(int i9, g gVar, int i10, int i11) {
        double d = 1.0d / ((int) AndroidUtilities.screenRefreshRate);
        this.a = d;
        this.b = d * 4.0d;
        this.c = i9;
        this.g = i10;
        this.h = i11;
        this.d = gVar;
        h hVar = new h(this, gVar.getContext());
        this.e = hVar;
        hVar.setSurfaceTextureListener(new i(this, 0));
        hVar.setOpaque(false);
        gVar.addView(hVar);
    }

    public static k d(int i9, View view, ViewGroup viewGroup) {
        int min;
        if (view == null) {
            return null;
        }
        if (n == null) {
            n = new HashMap();
        }
        k kVar = (k) n.get(Integer.valueOf(i9));
        if (kVar == null) {
            int devicePerformanceClass = SharedConfig.getDevicePerformanceClass();
            if (devicePerformanceClass == 1) {
                Point point = AndroidUtilities.displaySize;
                min = Math.min(RichMessageLayout.PART_MAX_HEIGHT_DP, (int) (((point.x + point.y) / 2.0f) * 0.8f));
            } else if (devicePerformanceClass != 2) {
                Point point2 = AndroidUtilities.displaySize;
                min = Math.min(720, (int) (((point2.x + point2.y) / 2.0f) * 0.7f));
            } else {
                Point point3 = AndroidUtilities.displaySize;
                min = Math.min(1280, (int) (((point3.x + point3.y) / 2.0f) * 1.0f));
            }
            if (viewGroup == null) {
                return null;
            }
            HashMap hashMap = n;
            Integer valueOf = Integer.valueOf(i9);
            g gVar = new g(viewGroup.getContext(), 0);
            viewGroup.addView(gVar);
            k kVar2 = new k(i9, gVar, min, min);
            hashMap.put(valueOf, kVar2);
            kVar = kVar2;
        }
        kVar.a(view);
        return kVar;
    }

    public static k e(View view) {
        Activity findActivity = AndroidUtilities.findActivity(view.getContext());
        ViewGroup viewGroup = null;
        if (findActivity != null) {
            View rootView = findActivity.findViewById(R.id.content).getRootView();
            if (rootView instanceof ViewGroup) {
                viewGroup = (ViewGroup) rootView;
            }
        }
        return d(0, view, viewGroup);
    }

    public static void f(boolean z10) {
        j jVar;
        HashMap hashMap = n;
        if (hashMap == null) {
            return;
        }
        for (k kVar : hashMap.values()) {
            if (kVar.c == 0 && (jVar = kVar.f) != null) {
                jVar.b = z10;
            }
        }
    }

    public final void a(View view) {
        if (this.i) {
            return;
        }
        ArrayList arrayList = this.j;
        if (arrayList.contains(view)) {
            return;
        }
        arrayList.add(view);
        int i9 = this.l;
        this.l = i9 + 1;
        this.k.put(view, Integer.valueOf(i9));
    }

    public final void b(View view) {
        this.j.remove(view);
        this.k.remove(view);
        if (this.i) {
            return;
        }
        f fVar = this.m;
        AndroidUtilities.cancelRunOnUIThread(fVar);
        AndroidUtilities.runOnUIThread(fVar, 30L);
    }

    public final void c(Canvas canvas, View view, int i9, int i10, float f10, boolean z10) {
        if (canvas == null || view == null) {
            return;
        }
        canvas.save();
        Integer num = (Integer) this.k.get(view);
        if (num == null) {
            num = 0;
        }
        int i11 = this.g;
        int i12 = this.h;
        if (i9 > i11 || i10 > i12) {
            float max = Math.max(i9 / i11, i10 / i12);
            canvas.scale(max, max);
        }
        if (num.intValue() % 4 == 1) {
            canvas.rotate(180.0f, i11 / 2.0f, i12 / 2.0f);
        }
        if (num.intValue() % 4 == 2) {
            canvas.scale(-1.0f, 1.0f, i11 / 2.0f, i12 / 2.0f);
        }
        if (num.intValue() % 4 == 3) {
            canvas.scale(1.0f, -1.0f, i11 / 2.0f, i12 / 2.0f);
        }
        h hVar = this.e;
        if (z10) {
            Bitmap bitmap = hVar.getBitmap();
            if (bitmap != null) {
                Paint paint = new Paint(7);
                paint.setColor(-1);
                canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
                bitmap.recycle();
            }
        } else {
            hVar.setAlpha(f10);
            hVar.draw(canvas);
        }
        canvas.restore();
    }
}
