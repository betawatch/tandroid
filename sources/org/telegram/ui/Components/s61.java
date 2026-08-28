package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.AsyncTask;
import java.util.ArrayList;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class s61 extends AsyncTask {
    public int a = 0;
    public final Paint b = new Paint(3);
    public final /* synthetic */ v61 c;

    public s61(v61 v61Var) {
        this.c = v61Var;
    }

    @Override // android.os.AsyncTask
    public final Object doInBackground(Object[] objArr) {
        v61 v61Var = this.c;
        this.a = ((Integer[]) objArr)[0].intValue();
        Bitmap bitmap = null;
        if (!isCancelled()) {
            try {
                Bitmap frameAtTime = v61Var.y.getFrameAtTime(v61Var.D * this.a * 1000, 2);
                try {
                    if (!isCancelled()) {
                        if (frameAtTime == null) {
                            return frameAtTime;
                        }
                        Bitmap createBitmap = Bitmap.createBitmap(v61Var.E, v61Var.F, frameAtTime.getConfig());
                        Canvas canvas = new Canvas(createBitmap);
                        float max = Math.max(v61Var.E / frameAtTime.getWidth(), v61Var.F / frameAtTime.getHeight());
                        int width = (int) (frameAtTime.getWidth() * max);
                        int height = (int) (frameAtTime.getHeight() * max);
                        Rect rect = new Rect(0, 0, frameAtTime.getWidth(), frameAtTime.getHeight());
                        int i9 = v61Var.E;
                        int i10 = v61Var.F;
                        canvas.drawBitmap(frameAtTime, rect, new Rect((i9 - width) / 2, (i10 - height) / 2, (i9 + width) / 2, (i10 + height) / 2), this.b);
                        frameAtTime.recycle();
                        return createBitmap;
                    }
                } catch (Exception e10) {
                    e = e10;
                    bitmap = frameAtTime;
                    FileLog.e(e);
                    return bitmap;
                }
            } catch (Exception e11) {
                e = e11;
            }
        }
        return null;
    }

    @Override // android.os.AsyncTask
    public final void onPostExecute(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        if (isCancelled()) {
            return;
        }
        v61 v61Var = this.c;
        ArrayList arrayList = v61Var.B;
        t61 t61Var = new t61();
        t61Var.a = bitmap;
        arrayList.add(t61Var);
        v61Var.invalidate();
        int i9 = this.a;
        if (i9 < v61Var.G) {
            v61Var.d(i9 + 1);
        }
    }
}
