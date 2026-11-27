// default package

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class kpa implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ mpa b;

    public /* synthetic */ kpa(mpa mpaVar, byte b) {
        this.a = b;
        this.b = mpaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        mpa mpaVar = this.b;
        switch (b) {
            case 0:
                if (mpaVar.j.isEmpty()) {
                    mpaVar.i = true;
                    mpa.n = null;
                    lpa lpaVar = mpaVar.f;
                    if (lpaVar != null) {
                        lpaVar.a = false;
                        mpaVar.f = null;
                    }
                    mpaVar.d.removeView(mpaVar.e);
                    if (mpaVar.d.getParent() instanceof ViewGroup) {
                        ((ViewGroup) mpaVar.d.getParent()).removeView(mpaVar.d);
                        break;
                    }
                }
                break;
            default:
                ArrayList arrayList = mpaVar.j;
                for (int i = 0; i < arrayList.size(); i++) {
                    ((View) arrayList.get(i)).invalidate();
                }
                break;
        }
    }
}
