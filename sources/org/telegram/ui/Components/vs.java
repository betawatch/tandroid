package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.SharedConfig;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public abstract class vs implements NotificationCenter.NotificationCenterDelegate {
    public static us H;
    public boolean A;
    public boolean C;
    public boolean E;
    public int F;
    public final int G;
    public boolean a;
    public Bitmap b;
    public Canvas c;
    public Bitmap d;
    public Canvas e;
    public boolean f;
    public int n;
    public boolean r;
    public int v;
    public int w;
    public int x;
    public final DispatchQueue y;
    public int h = 1;
    public final Paint s = new Paint(1);
    public final ts B = new ts(this, 0);
    public final ts D = new ts(this, 1);

    public vs() {
        if (H == null) {
            us usVar = new us();
            usVar.b = new DispatchQueue[2];
            H = usVar;
        }
        us usVar2 = H;
        int i9 = usVar2.a + 1;
        usVar2.a = i9;
        if (i9 > 1) {
            usVar2.a = 0;
        }
        DispatchQueue[] dispatchQueueArr = (DispatchQueue[]) usVar2.b;
        int i10 = usVar2.a;
        DispatchQueue dispatchQueue = dispatchQueueArr[i10];
        if (dispatchQueue == null) {
            dispatchQueue = new DispatchQueue("draw_background_queue_" + usVar2.a);
            dispatchQueueArr[i10] = dispatchQueue;
        }
        this.y = dispatchQueue;
        this.G = H.a;
    }

    public void a(Canvas canvas, long j10, int i9, int i10, float f10) {
        if (this.A) {
            if (BuildVars.DEBUG_PRIVATE_VERSION) {
                canvas.drawRect(0.0f, 0.0f, i9, i10, org.telegram.ui.ActionBar.f6.Jl);
                return;
            }
            return;
        }
        this.w = i10;
        this.x = i9;
        if (this.C) {
            this.C = false;
            Bitmap bitmap = this.d;
            Canvas canvas2 = this.e;
            this.d = this.b;
            this.e = this.c;
            this.b = bitmap;
            this.c = canvas2;
        }
        Bitmap bitmap2 = this.d;
        if (bitmap2 == null || this.E) {
            this.E = false;
            if (bitmap2 != null) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(this.d);
                AndroidUtilities.recycleBitmaps(arrayList);
                this.d = null;
            }
            int i11 = this.w + 0;
            Bitmap bitmap3 = this.d;
            if (bitmap3 != null && bitmap3.getHeight() == i11 && this.d.getWidth() == this.x) {
                this.d.eraseColor(0);
            } else {
                this.d = Bitmap.createBitmap(this.x, i11, Bitmap.Config.ARGB_8888);
                this.e = new Canvas(this.d);
            }
            this.e.save();
            this.e.translate(0.0f, 0);
            d(this.e, f10);
            this.e.restore();
        }
        if (!this.f && !this.r) {
            this.f = true;
            i(j10);
            this.F = this.v;
            this.y.postRunnable(this.B);
        }
        Bitmap bitmap4 = this.d;
        if (bitmap4 != null) {
            Paint paint = this.s;
            paint.setAlpha((int) (f10 * 255.0f));
            canvas.save();
            canvas.translate(0.0f, -0);
            b(canvas, bitmap4, paint);
            canvas.restore();
        }
    }

    public void b(Canvas canvas, Bitmap bitmap, Paint paint) {
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
    }

    public abstract void c(Canvas canvas);

    public abstract void d(Canvas canvas, float f10);

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        int i11;
        if (i9 == NotificationCenter.stopAllHeavyOperations) {
            Integer num = (Integer) objArr[0];
            if (this.h < num.intValue()) {
                if (num.intValue() != 512 || SharedConfig.getDevicePerformanceClass() < 2) {
                    int intValue = num.intValue() | this.n;
                    this.n = intValue;
                    if (intValue == 0 || this.r) {
                        return;
                    }
                    this.r = true;
                    return;
                }
                return;
            }
            return;
        }
        if (i9 == NotificationCenter.startAllHeavyOperations) {
            Integer num2 = (Integer) objArr[0];
            if (this.h >= num2.intValue() || (i11 = this.n) == 0) {
                return;
            }
            int i12 = (~num2.intValue()) & i11;
            this.n = i12;
            if (i12 == 0 && this.r) {
                this.r = false;
            }
        }
    }

    public final void e() {
        if (this.a) {
            return;
        }
        this.a = true;
        this.A = false;
        int currentHeavyOperationFlags = NotificationCenter.getGlobalInstance().getCurrentHeavyOperationFlags() & (~this.h);
        this.n = currentHeavyOperationFlags;
        if (currentHeavyOperationFlags == 0 && this.r) {
            this.r = false;
        }
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.stopAllHeavyOperations);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.startAllHeavyOperations);
    }

    public final void f() {
        if (this.a) {
            if (!this.f) {
                j();
            }
            this.a = false;
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.stopAllHeavyOperations);
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.startAllHeavyOperations);
        }
    }

    public abstract void g();

    public abstract void i(long j10);

    public final void j() {
        ArrayList arrayList = new ArrayList();
        Bitmap bitmap = this.d;
        if (bitmap != null) {
            arrayList.add(bitmap);
        }
        Bitmap bitmap2 = this.b;
        if (bitmap2 != null) {
            arrayList.add(bitmap2);
        }
        this.d = null;
        this.b = null;
        this.c = null;
        this.e = null;
        AndroidUtilities.recycleBitmaps(arrayList);
    }

    public final void k() {
        this.E = true;
        this.v++;
        if (this.d != null) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(this.d);
            this.d = null;
            AndroidUtilities.recycleBitmaps(arrayList);
        }
    }

    public final void l(int i9) {
        this.h = 7;
        if (this.a) {
            this.n = NotificationCenter.getGlobalInstance().getCurrentHeavyOperationFlags() & (~this.h);
        }
    }

    public void h() {
    }
}
