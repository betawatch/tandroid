package f8;

import ab.e;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.internal.vision.f3;
import com.google.android.gms.internal.vision.t2;
import java.nio.ByteBuffer;
import java.util.HashSet;
import z5.l;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class c extends e {
    public final c8.b b;
    public final t2 c;
    public final Object d;
    public boolean e;

    public c(t2 t2Var) {
        super(1);
        this.b = new c8.b();
        this.d = new Object();
        this.e = true;
        this.c = t2Var;
    }

    @Override // ab.e
    public final void N() {
        super.N();
        synchronized (this.d) {
            try {
                if (this.e) {
                    this.c.l();
                    this.e = false;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final SparseArray Q(androidx.biometric.e eVar) {
        ByteBuffer r6;
        a[] n10;
        Bitmap bitmap = (Bitmap) eVar.d;
        if (bitmap != null) {
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            int i10 = width * height;
            r6 = ByteBuffer.allocateDirect(((((height + 1) / 2) * ((width + 1) / 2)) << 1) + i10);
            int i11 = i10;
            for (int i12 = 0; i12 < i10; i12++) {
                int i13 = i12 % width;
                int i14 = i12 / width;
                int pixel = bitmap.getPixel(i13, i14);
                float red = Color.red(pixel);
                float green = Color.green(pixel);
                float blue = Color.blue(pixel);
                r6.put(i12, (byte) ((0.114f * blue) + (0.587f * green) + (0.299f * red)));
                if (i14 % 2 == 0 && i13 % 2 == 0) {
                    float d = com.google.android.recaptcha.internal.a.d(blue, 0.5f, ((-0.331f) * green) + ((-0.169f) * red), 128.0f);
                    float d10 = com.google.android.recaptcha.internal.a.d(blue, -0.081f, (green * (-0.419f)) + (red * 0.5f), 128.0f);
                    int i15 = i11 + 1;
                    r6.put(i11, (byte) d);
                    i11 += 2;
                    r6.put(i15, (byte) d10);
                }
            }
        } else {
            r6 = eVar.r();
        }
        synchronized (this.d) {
            if (!this.e) {
                throw new IllegalStateException("Cannot use detector after release()");
            }
            t2 t2Var = this.c;
            l.h(r6);
            n10 = t2Var.n(r6, f3.b(eVar));
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
