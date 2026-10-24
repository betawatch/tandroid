package ad;

import java.io.IOException;
import java.io.InputStream;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.ArrayList;
import java.util.logging.Level;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.o2;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes.dex */
public final class l implements Runnable {
    public final /* synthetic */ int a;
    public boolean b;
    public Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ l(Object obj, Object obj2, boolean z10, int i10) {
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
                    ((m) this.d).a.bind(new InetSocketAddress(61578));
                    this.b = true;
                    do {
                        try {
                            Socket accept = ((m) this.d).a.accept();
                            accept.setSoTimeout(5000);
                            InputStream inputStream = accept.getInputStream();
                            m mVar = (m) this.d;
                            mVar.c.D(new a(mVar, inputStream, accept));
                        } catch (IOException e) {
                            m.d.log(Level.FINE, "Communication with the client broken", (Throwable) e);
                        }
                    } while (!((m) this.d).a.isClosed());
                } catch (IOException e7) {
                    this.c = e7;
                    return;
                }
            case 1:
                li.m mVar2 = (li.m) this.d;
                ArrayList arrayList = (ArrayList) this.c;
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    s4.j jVar = (s4.j) obj;
                    mVar2.T(jVar.a, jVar, this.b);
                }
                arrayList.clear();
                mVar2.u.remove(arrayList);
                break;
            default:
                ActionBarLayout actionBarLayout = (ActionBarLayout) this.d;
                if (actionBarLayout.e == this) {
                    actionBarLayout.e = null;
                    ((o2) this.c).onTransitionAnimationStart(true, false);
                    actionBarLayout.f0(true, true, this.b);
                    break;
                }
                break;
        }
    }

    public l(m mVar) {
        this.a = 0;
        this.d = mVar;
        this.b = false;
    }
}
