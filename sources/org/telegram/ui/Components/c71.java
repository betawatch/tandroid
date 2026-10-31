package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.AsyncTask;
import java.util.ArrayList;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class c71 extends AsyncTask {
    public int a = 0;
    public final Paint b = new Paint(3);
    public final /* synthetic */ f71 c;

    public c71(f71 f71Var) {
        this.c = f71Var;
    }

    @Override // android.os.AsyncTask
    public final Object doInBackground(Object[] objArr) {
        Bitmap frameAtTime;
        f71 f71Var = this.c;
        this.a = ((Integer[]) objArr)[0].intValue();
        Bitmap bitmap = null;
        if (!isCancelled()) {
            try {
                frameAtTime = f71Var.D.getFrameAtTime(f71Var.H * this.a * 1000, 2);
            } catch (Exception e) {
                e = e;
            }
            try {
                if (!isCancelled()) {
                    if (frameAtTime == null) {
                        return frameAtTime;
                    }
                    Bitmap createBitmap = Bitmap.createBitmap(f71Var.I, f71Var.J, frameAtTime.getConfig());
                    Canvas canvas = new Canvas(createBitmap);
                    float max = Math.max(f71Var.I / frameAtTime.getWidth(), f71Var.J / frameAtTime.getHeight());
                    int width = (int) (frameAtTime.getWidth() * max);
                    int height = (int) (frameAtTime.getHeight() * max);
                    Rect rect = new Rect(0, 0, frameAtTime.getWidth(), frameAtTime.getHeight());
                    int i10 = f71Var.I;
                    int i11 = f71Var.J;
                    canvas.drawBitmap(frameAtTime, rect, new Rect((i10 - width) / 2, (i11 - height) / 2, (i10 + width) / 2, (i11 + height) / 2), this.b);
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
        f71 f71Var = this.c;
        ArrayList arrayList = f71Var.F;
        d71 d71Var = new d71();
        d71Var.a = bitmap;
        arrayList.add(d71Var);
        f71Var.invalidate();
        int i10 = this.a;
        if (i10 < f71Var.K) {
            f71Var.d(i10 + 1);
        }
    }
}
