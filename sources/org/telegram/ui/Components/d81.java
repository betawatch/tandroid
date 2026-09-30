package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.AsyncTask;
import java.util.ArrayList;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes3.dex */
public final class d81 extends AsyncTask {
    public int a = 0;
    public final Paint b = new Paint(3);
    public final /* synthetic */ g81 c;

    public d81(g81 g81Var) {
        this.c = g81Var;
    }

    @Override // android.os.AsyncTask
    public final Object doInBackground(Object[] objArr) {
        g81 g81Var = this.c;
        this.a = ((Integer[]) objArr)[0].intValue();
        Bitmap bitmap = null;
        if (!isCancelled()) {
            try {
                Bitmap frameAtTime = g81Var.y.getFrameAtTime(g81Var.H * this.a * 1000, 2);
                try {
                    if (!isCancelled()) {
                        if (frameAtTime == null) {
                            return frameAtTime;
                        }
                        Bitmap createBitmap = Bitmap.createBitmap(g81Var.I, g81Var.J, frameAtTime.getConfig());
                        Canvas canvas = new Canvas(createBitmap);
                        float max = Math.max(g81Var.I / frameAtTime.getWidth(), g81Var.J / frameAtTime.getHeight());
                        int width = (int) (frameAtTime.getWidth() * max);
                        int height = (int) (frameAtTime.getHeight() * max);
                        Rect rect = new Rect(0, 0, frameAtTime.getWidth(), frameAtTime.getHeight());
                        int i10 = g81Var.I;
                        int i11 = g81Var.J;
                        canvas.drawBitmap(frameAtTime, rect, new Rect((i10 - width) / 2, (i11 - height) / 2, (i10 + width) / 2, (i11 + height) / 2), this.b);
                        frameAtTime.recycle();
                        return createBitmap;
                    }
                } catch (Exception e) {
                    e = e;
                    bitmap = frameAtTime;
                    FileLog.e(e);
                    return bitmap;
                }
            } catch (Exception e7) {
                e = e7;
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
        g81 g81Var = this.c;
        ArrayList arrayList = g81Var.F;
        e81 e81Var = new e81();
        e81Var.a = bitmap;
        arrayList.add(e81Var);
        g81Var.invalidate();
        int i10 = this.a;
        if (i10 < g81Var.K) {
            g81Var.d(i10 + 1);
        }
    }
}
