package gc;

import java.io.IOException;
import java.io.InputStream;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.ArrayList;
import java.util.logging.Level;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.o2;
import rh.m;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class j implements Runnable {
    public final /* synthetic */ int a;
    public boolean b;
    public Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ j(Object obj, Object obj2, boolean z10, int i9) {
        this.a = i9;
        this.d = obj;
        this.c = obj2;
        this.b = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                try {
                    ((k) this.d).a.bind(new InetSocketAddress(61578));
                    this.b = true;
                    do {
                        try {
                            Socket accept = ((k) this.d).a.accept();
                            accept.setSoTimeout(5000);
                            InputStream inputStream = accept.getInputStream();
                            k kVar = (k) this.d;
                            kVar.c.G(new a(kVar, inputStream, accept));
                        } catch (IOException e10) {
                            k.d.log(Level.FINE, "Communication with the client broken", (Throwable) e10);
                        }
                    } while (!((k) this.d).a.isClosed());
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
                int i9 = 0;
                while (i9 < size) {
                    Object obj = arrayList.get(i9);
                    i9++;
                    f2.m mVar2 = (f2.m) obj;
                    mVar.T(mVar2.a, mVar2, this.b);
                }
                arrayList.clear();
                mVar.u.remove(arrayList);
                break;
        }
    }

    public j(k kVar) {
        this.a = 0;
        this.d = kVar;
        this.b = false;
    }
}
