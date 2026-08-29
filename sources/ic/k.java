package ic;

import java.io.IOException;
import java.io.InputStream;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.ArrayList;
import java.util.logging.Level;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.o2;
import uh.m;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class k implements Runnable {
    public final /* synthetic */ int a;
    public boolean b;
    public Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ k(Object obj, Object obj2, boolean z10, int i10) {
        this.a = i10;
        this.d = obj;
        this.c = obj2;
        this.b = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                try {
                    ((l) this.d).a.bind(new InetSocketAddress(61578));
                    this.b = true;
                    do {
                        try {
                            Socket accept = ((l) this.d).a.accept();
                            accept.setSoTimeout(5000);
                            InputStream inputStream = accept.getInputStream();
                            l lVar = (l) this.d;
                            lVar.c.C(new a(lVar, inputStream, accept));
                        } catch (IOException e10) {
                            l.d.log(Level.FINE, "Communication with the client broken", (Throwable) e10);
                        }
                    } while (!((l) this.d).a.isClosed());
                } catch (IOException e11) {
                    this.c = e11;
                    return;
                }
            case 1:
                ActionBarLayout actionBarLayout = (ActionBarLayout) this.d;
                if (actionBarLayout.e == this) {
                    actionBarLayout.e = null;
                    ((o2) this.c).onTransitionAnimationStart(true, false);
                    actionBarLayout.d0(true, true, this.b);
                    break;
                }
                break;
            default:
                m mVar = (m) this.d;
                ArrayList arrayList = (ArrayList) this.c;
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    f2.k kVar = (f2.k) obj;
                    mVar.T(kVar.a, kVar, this.b);
                }
                arrayList.clear();
                mVar.u.remove(arrayList);
                break;
        }
    }

    public k(l lVar) {
        this.a = 0;
        this.d = lVar;
        this.b = false;
    }
}
