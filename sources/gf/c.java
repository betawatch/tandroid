package gf;

import android.content.Context;
import android.util.Log;
import android.view.View;
import com.google.android.gms.internal.vision.t2;
import java.util.ArrayList;
import org.telegram.ui.Components.uy;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
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

    public w8.b a() {
        boolean z9;
        x8.b bVar = new x8.b();
        int i7 = this.c;
        bVar.a = i7;
        int i10 = this.a;
        bVar.b = i10;
        boolean z10 = false;
        bVar.c = 0;
        bVar.d = false;
        bVar.e = this.b;
        bVar.f = -1.0f;
        if (i7 == 2 || i10 != 2) {
            z9 = true;
        } else {
            Log.e("FaceDetector", "Contour is not supported for non-SELFIE mode.");
            z9 = false;
        }
        if (bVar.b == 2 && bVar.c == 1) {
            Log.e("FaceDetector", "Classification is not supported with contour.");
        } else {
            z10 = z9;
        }
        if (z10) {
            return new w8.b(new t2((Context) this.d, bVar));
        }
        throw new IllegalArgumentException("Invalid build options");
    }

    public void b(int i7) {
        if (i7 == 0 || i7 == 1 || i7 == 2) {
            this.a = i7;
            return;
        }
        StringBuilder sb2 = new StringBuilder(34);
        sb2.append("Invalid landmark type: ");
        sb2.append(i7);
        throw new IllegalArgumentException(sb2.toString());
    }

    public void c(int i7) {
        if (i7 == 0 || i7 == 1 || i7 == 2) {
            this.c = i7;
            return;
        }
        StringBuilder sb2 = new StringBuilder(25);
        sb2.append("Invalid mode: ");
        sb2.append(i7);
        throw new IllegalArgumentException(sb2.toString());
    }

    public c(mf.a... aVarArr) {
        this.a = -1;
        this.c = -1;
        this.b = false;
        this.d = aVarArr;
    }

    public c(View view, ArrayList arrayList, xh.j jVar) {
        this.d = new uy(view.getContext(), new xh.i(this, view, arrayList, jVar));
    }
}
