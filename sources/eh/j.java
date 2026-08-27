package eh;

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

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class j {
    public static HashMap n;
    public final double a;
    public final double b;
    public final int c;
    public final ag.d d;
    public final g e;
    public i f;
    public final int g;
    public final int h;
    public boolean i;
    public final ArrayList j = new ArrayList();
    public final HashMap k = new HashMap();
    public int l = 0;
    public final f m = new f(this, 0);

    public j(int i10, ag.d dVar, int i11, int i12) {
        double d = 1.0d / ((int) AndroidUtilities.screenRefreshRate);
        this.a = d;
        this.b = d * 4.0d;
        this.c = i10;
        this.g = i11;
        this.h = i12;
        this.d = dVar;
        g gVar = new g(this, dVar.getContext());
        this.e = gVar;
        gVar.setSurfaceTextureListener(new h(this, 0));
        gVar.setOpaque(false);
        dVar.addView(gVar);
    }

    public static j d(int i10, View view, ViewGroup viewGroup) {
        int min;
        if (view == null) {
            return null;
        }
        if (n == null) {
            n = new HashMap();
        }
        j jVar = (j) n.get(Integer.valueOf(i10));
        if (jVar == null) {
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
            Integer valueOf = Integer.valueOf(i10);
            ag.d dVar = new ag.d(viewGroup.getContext(), 1);
            viewGroup.addView(dVar);
            j jVar2 = new j(i10, dVar, min, min);
            hashMap.put(valueOf, jVar2);
            jVar = jVar2;
        }
        jVar.a(view);
        return jVar;
    }

    public static j e(View view) {
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
        i iVar;
        HashMap hashMap = n;
        if (hashMap == null) {
            return;
        }
        for (j jVar : hashMap.values()) {
            if (jVar.c == 0 && (iVar = jVar.f) != null) {
                iVar.b = z10;
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
        int i10 = this.l;
        this.l = i10 + 1;
        this.k.put(view, Integer.valueOf(i10));
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

    public final void c(Canvas canvas, View view, int i10, int i11, float f10, boolean z10) {
        if (canvas == null || view == null) {
            return;
        }
        canvas.save();
        Integer num = (Integer) this.k.get(view);
        if (num == null) {
            num = 0;
        }
        int i12 = this.g;
        int i13 = this.h;
        if (i10 > i12 || i11 > i13) {
            float max = Math.max(i10 / i12, i11 / i13);
            canvas.scale(max, max);
        }
        if (num.intValue() % 4 == 1) {
            canvas.rotate(180.0f, i12 / 2.0f, i13 / 2.0f);
        }
        if (num.intValue() % 4 == 2) {
            canvas.scale(-1.0f, 1.0f, i12 / 2.0f, i13 / 2.0f);
        }
        if (num.intValue() % 4 == 3) {
            canvas.scale(1.0f, -1.0f, i12 / 2.0f, i13 / 2.0f);
        }
        g gVar = this.e;
        if (z10) {
            Bitmap bitmap = gVar.getBitmap();
            if (bitmap != null) {
                Paint paint = new Paint(7);
                paint.setColor(-1);
                canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
                bitmap.recycle();
            }
        } else {
            gVar.setAlpha(f10);
            gVar.draw(canvas);
        }
        canvas.restore();
    }
}
