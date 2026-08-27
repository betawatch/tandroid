package e8;

import a5.n;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.internal.vision.f3;
import com.google.android.gms.internal.vision.t2;
import java.nio.ByteBuffer;
import java.util.HashSet;
import y5.l;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class c extends b8.a {
    public final b8.c b;
    public final t2 c;
    public final Object d;
    public boolean e;

    public c(t2 t2Var) {
        super(0);
        this.b = new b8.c();
        this.d = new Object();
        this.e = true;
        this.c = t2Var;
    }

    @Override // b8.a
    public final void N() {
        super.N();
        synchronized (this.d) {
            try {
                if (this.e) {
                    this.c.l();
                    this.e = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final SparseArray Q(n nVar) {
        ByteBuffer q6;
        a[] n10;
        Bitmap bitmap = (Bitmap) nVar.d;
        if (bitmap != null) {
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            int i10 = width * height;
            q6 = ByteBuffer.allocateDirect(((((height + 1) / 2) * ((width + 1) / 2)) << 1) + i10);
            int i11 = i10;
            for (int i12 = 0; i12 < i10; i12++) {
                int i13 = i12 % width;
                int i14 = i12 / width;
                int pixel = bitmap.getPixel(i13, i14);
                float red = Color.red(pixel);
                float green = Color.green(pixel);
                float blue = Color.blue(pixel);
                q6.put(i12, (byte) ((0.114f * blue) + (0.587f * green) + (0.299f * red)));
                if (i14 % 2 == 0 && i13 % 2 == 0) {
                    float d = com.google.android.recaptcha.internal.a.d(blue, 0.5f, ((-0.331f) * green) + ((-0.169f) * red), 128.0f);
                    float d10 = com.google.android.recaptcha.internal.a.d(blue, -0.081f, (green * (-0.419f)) + (red * 0.5f), 128.0f);
                    int i15 = i11 + 1;
                    q6.put(i11, (byte) d);
                    i11 += 2;
                    q6.put(i15, (byte) d10);
                }
            }
        } else {
            q6 = nVar.q();
        }
        synchronized (this.d) {
            if (!this.e) {
                throw new IllegalStateException("Cannot use detector after release()");
            }
            t2 t2Var = this.c;
            l.h(q6);
            n10 = t2Var.n(q6, f3.b(nVar));
        }
        HashSet hashSet = new HashSet();
        SparseArray sparseArray = new SparseArray(n10.length);
        int i16 = 0;
        for (a aVar : n10) {
            int i17 = aVar.a;
            i16 = Math.max(i16, i17);
            if (hashSet.contains(Integer.valueOf(i17))) {
                i17 = i16 + 1;
                i16 = i17;
            }
            hashSet.add(Integer.valueOf(i17));
            sparseArray.append(this.b.a(i17), aVar);
        }
        return sparseArray;
    }

    public final void finalize() {
        try {
            synchronized (this.d) {
                try {
                    if (this.e) {
                        Log.w("FaceDetector", "FaceDetector was not released with FaceDetector.release()");
                        N();
                    }
                } finally {
                }
            }
        } finally {
            super.finalize();
        }
    }
}
