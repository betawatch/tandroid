package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.AsyncTask;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class g71 extends AsyncTask {
    public int a = 0;
    public final /* synthetic */ j71 b;

    public g71(j71 j71Var) {
        this.b = j71Var;
    }

    @Override // android.os.AsyncTask
    public final Object doInBackground(Object[] objArr) {
        Bitmap frameAtTime;
        j71 j71Var = this.b;
        this.a = ((Integer[]) objArr)[0].intValue();
        Bitmap bitmap = null;
        if (!isCancelled()) {
            try {
                frameAtTime = j71Var.r.getFrameAtTime(j71Var.y * this.a * 1000, 2);
            } catch (Exception e) {
                e = e;
            }
            try {
                if (!isCancelled()) {
                    if (frameAtTime == null) {
                        return frameAtTime;
                    }
                    Bitmap createBitmap = Bitmap.createBitmap(j71Var.D, j71Var.E, frameAtTime.getConfig());
                    Canvas canvas = new Canvas(createBitmap);
                    float max = Math.max(j71Var.D / frameAtTime.getWidth(), j71Var.E / frameAtTime.getHeight());
                    int width = (int) (frameAtTime.getWidth() * max);
                    int height = (int) (frameAtTime.getHeight() * max);
                    canvas.drawBitmap(frameAtTime, new Rect(0, 0, frameAtTime.getWidth(), frameAtTime.getHeight()), new Rect((j71Var.D - width) / 2, (j71Var.E - height) / 2, width, height), (Paint) null);
                    frameAtTime.recycle();
                    return createBitmap;
                }
            } catch (Exception e7) {
                e = e7;
                bitmap = frameAtTime;
                org.telegram.messenger.f8.g(e, true);
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
        j71 j71Var = this.b;
        j71Var.w.add(bitmap);
        j71Var.invalidate();
        int i10 = this.a;
        if (i10 < j71Var.F) {
            j71Var.b(i10 + 1);
        } else {
            j71Var.O = true;
        }
    }
}
