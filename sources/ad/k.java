package ad;

import java.io.IOException;
import java.io.InputStream;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.ArrayList;
import java.util.logging.Level;
import ki.n;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.m2;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
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
                        } catch (IOException e) {
                            l.d.log(Level.FINE, "Communication with the client broken", (Throwable) e);
                        }
                    } while (!((l) this.d).a.isClosed());
                } catch (IOException e7) {
                    this.c = e7;
                    return;
                }
            case 1:
                n nVar = (n) this.d;
                ArrayList arrayList = (ArrayList) this.c;
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    s4.j jVar = (s4.j) obj;
                    nVar.T(jVar.a, jVar, this.b);
                }
                arrayList.clear();
                nVar.u.remove(arrayList);
                break;
            default:
                ActionBarLayout actionBarLayout = (ActionBarLayout) this.d;
                if (actionBarLayout.e == this) {
                    actionBarLayout.e = null;
                    ((m2) this.c).onTransitionAnimationStart(true, false);
                    actionBarLayout.d0(true, true, this.b);
                    break;
                }
                break;
        }
    }

    public k(l lVar) {
        this.a = 0;
        this.d = lVar;
        this.b = false;
    }
}
