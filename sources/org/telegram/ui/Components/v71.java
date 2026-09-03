package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.AsyncTask;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class v71 extends AsyncTask {
    public int a = 0;
    public final /* synthetic */ y71 b;

    public v71(y71 y71Var) {
        this.b = y71Var;
    }

    @Override // android.os.AsyncTask
    public final Object doInBackground(Object[] objArr) {
        Bitmap frameAtTime;
        y71 y71Var = this.b;
        this.a = ((Integer[]) objArr)[0].intValue();
        Bitmap bitmap = null;
        if (!isCancelled()) {
            try {
                frameAtTime = y71Var.r.getFrameAtTime(y71Var.x * this.a * 1000, 2);
            } catch (Exception e6) {
                e = e6;
            }
            try {
                if (!isCancelled()) {
                    if (frameAtTime == null) {
                        return frameAtTime;
                    }
                    Bitmap createBitmap = Bitmap.createBitmap(y71Var.y, y71Var.B, frameAtTime.getConfig());
                    Canvas canvas = new Canvas(createBitmap);
                    float max = Math.max(y71Var.y / frameAtTime.getWidth(), y71Var.B / frameAtTime.getHeight());
                    int width = (int) (frameAtTime.getWidth() * max);
                    int height = (int) (frameAtTime.getHeight() * max);
                    canvas.drawBitmap(frameAtTime, new Rect(0, 0, frameAtTime.getWidth(), frameAtTime.getHeight()), new Rect((y71Var.y - width) / 2, (y71Var.B - height) / 2, width, height), (Paint) null);
                    frameAtTime.recycle();
                    return createBitmap;
                }
            } catch (Exception e10) {
                e = e10;
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
        y71 y71Var = this.b;
        y71Var.v.add(bitmap);
        y71Var.invalidate();
        int i10 = this.a;
        if (i10 < y71Var.C) {
            y71Var.b(i10 + 1);
        } else {
            y71Var.L = true;
        }
    }
}
