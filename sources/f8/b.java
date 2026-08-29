package f8;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.internal.vision.t2;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
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
        g8.c cVar = new g8.c();
        int i10 = this.b;
        cVar.a = i10;
        int i11 = this.a;
        cVar.b = i11;
        boolean z11 = false;
        cVar.c = 0;
        cVar.d = false;
        cVar.e = this.c;
        cVar.f = -1.0f;
        if (i10 == 2 || i11 != 2) {
            z10 = true;
        } else {
            Log.e("FaceDetector", "Contour is not supported for non-SELFIE mode.");
            z10 = false;
        }
        if (cVar.b == 2 && cVar.c == 1) {
            Log.e("FaceDetector", "Classification is not supported with contour.");
        } else {
            z11 = z10;
        }
        if (z11) {
            return new c(new t2((Context) this.d, cVar));
        }
        throw new IllegalArgumentException("Invalid build options");
    }

    public void b(int i10) {
        if (i10 == 0 || i10 == 1 || i10 == 2) {
            this.a = i10;
            return;
        }
        StringBuilder sb2 = new StringBuilder(34);
        sb2.append("Invalid landmark type: ");
        sb2.append(i10);
        throw new IllegalArgumentException(sb2.toString());
    }

    public void c(int i10) {
        if (i10 == 0 || i10 == 1 || i10 == 2) {
            this.b = i10;
            return;
        }
        StringBuilder sb2 = new StringBuilder(25);
        sb2.append("Invalid mode: ");
        sb2.append(i10);
        throw new IllegalArgumentException(sb2.toString());
    }

    public b(ne.a... aVarArr) {
        this.a = -1;
        this.b = -1;
        this.c = false;
        this.d = aVarArr;
    }
}
