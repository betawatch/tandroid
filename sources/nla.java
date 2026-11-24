// default package

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class nla implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ pla b;

    public /* synthetic */ nla(pla plaVar, byte b) {
        this.a = b;
        this.b = plaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        pla plaVar = this.b;
        switch (b) {
            case 0:
                if (plaVar.j.isEmpty()) {
                    plaVar.i = true;
                    pla.n = null;
                    ola olaVar = plaVar.f;
                    if (olaVar != null) {
                        olaVar.a = false;
                        plaVar.f = null;
                    }
                    plaVar.d.removeView(plaVar.e);
                    if (plaVar.d.getParent() instanceof ViewGroup) {
                        ((ViewGroup) plaVar.d.getParent()).removeView(plaVar.d);
                        break;
                    }
                }
                break;
            default:
                ArrayList arrayList = plaVar.j;
                for (int i = 0; i < arrayList.size(); i++) {
                    ((View) arrayList.get(i)).invalidate();
                }
                break;
        }
    }
}
