package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.AsyncTask;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class t71 extends AsyncTask {
    public int a = 0;
    public final /* synthetic */ w71 b;

    public t71(w71 w71Var) {
        this.b = w71Var;
    }

    @Override // android.os.AsyncTask
    public final Object doInBackground(Object[] objArr) {
        Bitmap frameAtTime;
        w71 w71Var = this.b;
        this.a = ((Integer[]) objArr)[0].intValue();
        Bitmap bitmap = null;
        if (!isCancelled()) {
            try {
                frameAtTime = w71Var.r.getFrameAtTime(w71Var.x * this.a * 1000, 2);
            } catch (Exception e) {
                e = e;
            }
            try {
                if (!isCancelled()) {
                    if (frameAtTime == null) {
                        return frameAtTime;
                    }
                    Bitmap createBitmap = Bitmap.createBitmap(w71Var.y, w71Var.E, frameAtTime.getConfig());
                    Canvas canvas = new Canvas(createBitmap);
                    float max = Math.max(w71Var.y / frameAtTime.getWidth(), w71Var.E / frameAtTime.getHeight());
                    int width = (int) (frameAtTime.getWidth() * max);
                    int height = (int) (frameAtTime.getHeight() * max);
                    canvas.drawBitmap(frameAtTime, new Rect(0, 0, frameAtTime.getWidth(), frameAtTime.getHeight()), new Rect((w71Var.y - width) / 2, (w71Var.E - height) / 2, width, height), (Paint) null);
                    frameAtTime.recycle();
                    return createBitmap;
                }
            } catch (Exception e7) {
                e = e7;
                bitmap = frameAtTime;
                FileLog.e(e);
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
        w71 w71Var = this.b;
        w71Var.v.add(bitmap);
        w71Var.invalidate();
        int i10 = this.a;
        if (i10 < w71Var.F) {
            w71Var.b(i10 + 1);
        } else {
            w71Var.O = true;
        }
    }
}
