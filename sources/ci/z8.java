package ci;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.z71;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes4.dex */
public final class z8 extends z71 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ fa c;

    public /* synthetic */ z8(fa faVar, Context context, int i10) {
        this.a = i10;
        this.c = faVar;
        this.b = context;
    }

    @Override // org.telegram.ui.Components.z71
    public final void b(View view, int i10, int i11) {
        switch (this.a) {
            case 0:
                ((y9) view).b(i11);
                break;
            default:
                ((y9) view).b(i11);
                break;
        }
    }

    @Override // org.telegram.ui.Components.z71
    public final View d(int i10) {
        switch (this.a) {
        }
        return new y9(this.c, this.b);
    }

    @Override // org.telegram.ui.Components.z71
    public final int e() {
        switch (this.a) {
            case 0:
                return 2;
            default:
                return 1;
        }
    }

    @Override // org.telegram.ui.Components.z71
    public final int h(int i10) {
        switch (this.a) {
            case 0:
                if (i10 == 0) {
                    return 0;
                }
                return this.c.M;
            default:
                return 5;
        }
    }
}
