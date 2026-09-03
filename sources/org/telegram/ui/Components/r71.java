package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.AsyncTask;
import java.util.ArrayList;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class r71 extends AsyncTask {
    public int a = 0;
    public final Paint b = new Paint(3);
    public final /* synthetic */ u71 c;

    public r71(u71 u71Var) {
        this.c = u71Var;
    }

    @Override // android.os.AsyncTask
    public final Object doInBackground(Object[] objArr) {
        u71 u71Var = this.c;
        this.a = ((Integer[]) objArr)[0].intValue();
        Bitmap bitmap = null;
        if (!isCancelled()) {
            try {
                Bitmap frameAtTime = u71Var.y.getFrameAtTime(u71Var.E * this.a * 1000, 2);
                try {
                    if (!isCancelled()) {
                        if (frameAtTime == null) {
                            return frameAtTime;
                        }
                        Bitmap createBitmap = Bitmap.createBitmap(u71Var.F, u71Var.G, frameAtTime.getConfig());
                        Canvas canvas = new Canvas(createBitmap);
                        float max = Math.max(u71Var.F / frameAtTime.getWidth(), u71Var.G / frameAtTime.getHeight());
                        int width = (int) (frameAtTime.getWidth() * max);
                        int height = (int) (frameAtTime.getHeight() * max);
                        Rect rect = new Rect(0, 0, frameAtTime.getWidth(), frameAtTime.getHeight());
                        int i10 = u71Var.F;
                        int i11 = u71Var.G;
                        canvas.drawBitmap(frameAtTime, rect, new Rect((i10 - width) / 2, (i11 - height) / 2, (i10 + width) / 2, (i11 + height) / 2), this.b);
                        frameAtTime.recycle();
                        return createBitmap;
                    }
                } catch (Exception e6) {
                    e = e6;
                    bitmap = frameAtTime;
                    FileLog.e(e);
                    return bitmap;
                }
            } catch (Exception e10) {
                e = e10;
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
        u71 u71Var = this.c;
        ArrayList arrayList = u71Var.C;
        s71 s71Var = new s71();
        s71Var.a = bitmap;
        arrayList.add(s71Var);
        u71Var.invalidate();
        int i10 = this.a;
        if (i10 < u71Var.H) {
            u71Var.d(i10 + 1);
        }
    }
}
