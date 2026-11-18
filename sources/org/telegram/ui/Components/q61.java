package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.AsyncTask;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class q61 extends AsyncTask {
    public int a = 0;
    public final /* synthetic */ t61 b;

    public q61(t61 t61Var) {
        this.b = t61Var;
    }

    @Override // android.os.AsyncTask
    public final Object doInBackground(Object[] objArr) {
        Bitmap frameAtTime;
        t61 t61Var = this.b;
        this.a = ((Integer[]) objArr)[0].intValue();
        Bitmap bitmap = null;
        if (!isCancelled()) {
            try {
                frameAtTime = t61Var.r.getFrameAtTime(t61Var.y * this.a * 1000, 2);
            } catch (Exception e10) {
                e = e10;
            }
            try {
                if (!isCancelled()) {
                    if (frameAtTime == null) {
                        return frameAtTime;
                    }
                    Bitmap createBitmap = Bitmap.createBitmap(t61Var.E, t61Var.F, frameAtTime.getConfig());
                    Canvas canvas = new Canvas(createBitmap);
                    float max = Math.max(t61Var.E / frameAtTime.getWidth(), t61Var.F / frameAtTime.getHeight());
                    int width = (int) (frameAtTime.getWidth() * max);
                    int height = (int) (frameAtTime.getHeight() * max);
                    canvas.drawBitmap(frameAtTime, new Rect(0, 0, frameAtTime.getWidth(), frameAtTime.getHeight()), new Rect((t61Var.E - width) / 2, (t61Var.F - height) / 2, width, height), (Paint) null);
                    frameAtTime.recycle();
                    return createBitmap;
                }
            } catch (Exception e11) {
                e = e11;
                bitmap = frameAtTime;
                org.telegram.messenger.a8.g(e, true);
                return bitmap;
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
        t61 t61Var = this.b;
        t61Var.w.add(bitmap);
        t61Var.invalidate();
        int i7 = this.a;
        if (i7 < t61Var.G) {
            t61Var.b(i7 + 1);
        } else {
            t61Var.P = true;
        }
    }
}
