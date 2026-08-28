package d8;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.internal.vision.t2;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class b {
    public int a;
    public int b;
    public boolean c;
    public final Object d;

    public b(Context context) {
        this.a = 0;
        this.c = true;
        this.b = 0;
        this.d = context;
    }

    public c a() {
        boolean z10;
        e8.b bVar = new e8.b();
        int i9 = this.b;
        bVar.a = i9;
        int i10 = this.a;
        bVar.b = i10;
        boolean z11 = false;
        bVar.c = 0;
        bVar.d = false;
        bVar.e = this.c;
        bVar.f = -1.0f;
        if (i9 == 2 || i10 != 2) {
            z10 = true;
        } else {
            Log.e("FaceDetector", "Contour is not supported for non-SELFIE mode.");
            z10 = false;
        }
        if (bVar.b == 2 && bVar.c == 1) {
            Log.e("FaceDetector", "Classification is not supported with contour.");
        } else {
            z11 = z10;
        }
        if (z11) {
            return new c(new t2((Context) this.d, bVar));
        }
        throw new IllegalArgumentException("Invalid build options");
    }

    public void b(int i9) {
        if (i9 == 0 || i9 == 1 || i9 == 2) {
            this.a = i9;
            return;
        }
        StringBuilder sb2 = new StringBuilder(34);
        sb2.append("Invalid landmark type: ");
        sb2.append(i9);
        throw new IllegalArgumentException(sb2.toString());
    }

    public void c(int i9) {
        if (i9 == 0 || i9 == 1 || i9 == 2) {
            this.b = i9;
            return;
        }
        StringBuilder sb2 = new StringBuilder(25);
        sb2.append("Invalid mode: ");
        sb2.append(i9);
        throw new IllegalArgumentException(sb2.toString());
    }

    public b(ke.a... aVarArr) {
        this.a = -1;
        this.b = -1;
        this.c = false;
        this.d = aVarArr;
    }
}
