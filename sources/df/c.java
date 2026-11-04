package df;

import android.content.Context;
import android.util.Log;
import android.view.View;
import com.google.android.gms.internal.vision.t2;
import java.util.ArrayList;
import org.telegram.ui.Components.y00;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class c {
    public int a;
    public boolean b;
    public int c;
    public final Object d;

    public c(Context context) {
        this.a = 0;
        this.b = true;
        this.c = 0;
        this.d = context;
    }

    public v8.b a() {
        boolean z10;
        w8.c cVar = new w8.c();
        int i3 = this.c;
        cVar.a = i3;
        int i10 = this.a;
        cVar.b = i10;
        boolean z11 = false;
        cVar.c = 0;
        cVar.d = false;
        cVar.e = this.b;
        cVar.f = -1.0f;
        if (i3 == 2 || i10 != 2) {
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
            return new v8.b(new t2((Context) this.d, cVar));
        }
        throw new IllegalArgumentException("Invalid build options");
    }

    public void b(int i3) {
        if (i3 == 0 || i3 == 1 || i3 == 2) {
            this.a = i3;
            return;
        }
        StringBuilder sb2 = new StringBuilder(34);
        sb2.append("Invalid landmark type: ");
        sb2.append(i3);
        throw new IllegalArgumentException(sb2.toString());
    }

    public void c(int i3) {
        if (i3 == 0 || i3 == 1 || i3 == 2) {
            this.c = i3;
            return;
        }
        StringBuilder sb2 = new StringBuilder(25);
        sb2.append("Invalid mode: ");
        sb2.append(i3);
        throw new IllegalArgumentException(sb2.toString());
    }

    public c(jf.a... aVarArr) {
        this.a = -1;
        this.c = -1;
        this.b = false;
        this.d = aVarArr;
    }

    public c(View view, ArrayList arrayList, yh.j jVar) {
        this.d = new y00(view.getContext(), new yh.i(this, view, arrayList, jVar));
    }
}
