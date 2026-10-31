package ci;

import java.io.IOException;
import java.io.InputStream;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.ArrayList;
import java.util.logging.Level;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.k2;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes4.dex */
public final class h implements Runnable {
    public final /* synthetic */ int a;
    public boolean b;
    public Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ h(Object obj, Object obj2, boolean z10, int i10) {
        this.a = i10;
        this.d = obj;
        this.c = obj2;
        this.b = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                o oVar = (o) this.d;
                ArrayList arrayList = (ArrayList) this.c;
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    s4.i iVar = (s4.i) obj;
                    oVar.T(iVar.a, iVar, this.b);
                }
                arrayList.clear();
                oVar.u.remove(arrayList);
                break;
            case 1:
                ActionBarLayout actionBarLayout = (ActionBarLayout) this.d;
                if (actionBarLayout.e == this) {
                    actionBarLayout.e = null;
                    ((k2) this.c).onTransitionAnimationStart(true, false);
                    actionBarLayout.g0(true, true, this.b);
                    break;
                }
                break;
            default:
                try {
                    ((sc.j) this.d).a.bind(new InetSocketAddress(61578));
                    this.b = true;
                    do {
                        try {
                            Socket accept = ((sc.j) this.d).a.accept();
                            accept.setSoTimeout(5000);
                            InputStream inputStream = accept.getInputStream();
                            sc.j jVar = (sc.j) this.d;
                            jVar.c.D(new sc.a(jVar, inputStream, accept));
                        } catch (IOException e) {
                            sc.j.d.log(Level.FINE, "Communication with the client broken", (Throwable) e);
                        }
                    } while (!((sc.j) this.d).a.isClosed());
                } catch (IOException e7) {
                    this.c = e7;
                    return;
                }
        }
    }

    public h(sc.j jVar) {
        this.a = 2;
        this.d = jVar;
        this.b = false;
    }
}
