package af;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.internal.vision.t2;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes.dex */
public final class d {
    public int a;
    public boolean b;
    public int c;
    public final Object d;

    public d(Context context) {
        this.a = 0;
        this.b = true;
        this.c = 0;
        this.d = context;
    }

    public t8.b a() {
        boolean z10;
        u8.b bVar = new u8.b();
        int i10 = this.c;
        bVar.a = i10;
        int i11 = this.a;
        bVar.b = i11;
        boolean z11 = false;
        bVar.c = 0;
        bVar.d = false;
        bVar.e = this.b;
        bVar.f = -1.0f;
        if (i10 == 2 || i11 != 2) {
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
            return new t8.b(new t2((Context) this.d, bVar));
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
            this.c = i10;
            return;
        }
        StringBuilder sb2 = new StringBuilder(25);
        sb2.append("Invalid mode: ");
        sb2.append(i10);
        throw new IllegalArgumentException(sb2.toString());
    }

    public d(ff.a... aVarArr) {
        this.a = -1;
        this.c = -1;
        this.b = false;
        this.d = aVarArr;
    }
}
