package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.AsyncTask;
import java.util.ArrayList;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class p71 extends AsyncTask {
    public int a = 0;
    public final Paint b = new Paint(3);
    public final /* synthetic */ s71 c;

    public p71(s71 s71Var) {
        this.c = s71Var;
    }

    @Override // android.os.AsyncTask
    public final Object doInBackground(Object[] objArr) {
        s71 s71Var = this.c;
        this.a = ((Integer[]) objArr)[0].intValue();
        Bitmap bitmap = null;
        if (!isCancelled()) {
            try {
                Bitmap frameAtTime = s71Var.y.getFrameAtTime(s71Var.H * this.a * 1000, 2);
                try {
                    if (!isCancelled()) {
                        if (frameAtTime == null) {
                            return frameAtTime;
                        }
                        Bitmap createBitmap = Bitmap.createBitmap(s71Var.I, s71Var.J, frameAtTime.getConfig());
                        Canvas canvas = new Canvas(createBitmap);
                        float max = Math.max(s71Var.I / frameAtTime.getWidth(), s71Var.J / frameAtTime.getHeight());
                        int width = (int) (frameAtTime.getWidth() * max);
                        int height = (int) (frameAtTime.getHeight() * max);
                        Rect rect = new Rect(0, 0, frameAtTime.getWidth(), frameAtTime.getHeight());
                        int i10 = s71Var.I;
                        int i11 = s71Var.J;
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
        s71 s71Var = this.c;
        ArrayList arrayList = s71Var.F;
        q71 q71Var = new q71();
        q71Var.a = bitmap;
        arrayList.add(q71Var);
        s71Var.invalidate();
        int i10 = this.a;
        if (i10 < s71Var.K) {
            s71Var.d(i10 + 1);
        }
    }
}
