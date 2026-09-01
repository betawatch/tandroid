package h8;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.internal.vision.t2;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
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
        boolean z4;
        i8.b bVar = new i8.b();
        int i10 = this.b;
        bVar.a = i10;
        int i11 = this.a;
        bVar.b = i11;
        boolean z10 = false;
        bVar.c = 0;
        bVar.d = false;
        bVar.e = this.c;
        bVar.f = -1.0f;
        if (i10 == 2 || i11 != 2) {
            z4 = true;
        } else {
            Log.e("FaceDetector", "Contour is not supported for non-SELFIE mode.");
            z4 = false;
        }
        if (bVar.b == 2 && bVar.c == 1) {
            Log.e("FaceDetector", "Classification is not supported with contour.");
        } else {
            z10 = z4;
        }
        if (z10) {
            return new c(new t2((Context) this.d, bVar));
        }
        throw new IllegalArgumentException("Invalid build options");
    }

    public void b(int i10) {
        if (i10 == 0 || i10 == 1 || i10 == 2) {
            this.a = i10;
            return;
        }
        StringBuilder sb = new StringBuilder(34);
        sb.append("Invalid landmark type: ");
        sb.append(i10);
        throw new IllegalArgumentException(sb.toString());
    }

    public void c(int i10) {
        if (i10 == 0 || i10 == 1 || i10 == 2) {
            this.b = i10;
            return;
        }
        StringBuilder sb = new StringBuilder(25);
        sb.append("Invalid mode: ");
        sb.append(i10);
        throw new IllegalArgumentException(sb.toString());
    }

    public b(pe.a... aVarArr) {
        this.a = -1;
        this.b = -1;
        this.c = false;
        this.d = aVarArr;
    }
}
