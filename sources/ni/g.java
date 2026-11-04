package ni;

import java.io.IOException;
import java.io.InputStream;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.ArrayList;
import java.util.logging.Level;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.d2;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes4.dex */
public final class g implements Runnable {
    public final /* synthetic */ int a;
    public boolean b;
    public Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ g(Object obj, Object obj2, boolean z10, int i3) {
        this.a = i3;
        this.d = obj;
        this.c = obj2;
        this.b = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                l lVar = (l) this.d;
                ArrayList arrayList = (ArrayList) this.c;
                int size = arrayList.size();
                int i3 = 0;
                while (i3 < size) {
                    Object obj = arrayList.get(i3);
                    i3++;
                    u4.j jVar = (u4.j) obj;
                    lVar.T(jVar.a, jVar, this.b);
                }
                arrayList.clear();
                lVar.u.remove(arrayList);
                break;
            case 1:
                ActionBarLayout actionBarLayout = (ActionBarLayout) this.d;
                if (actionBarLayout.e == this) {
                    actionBarLayout.e = null;
                    ((d2) this.c).onTransitionAnimationStart(true, false);
                    actionBarLayout.h0(true, true, this.b);
                    break;
                }
                break;
            default:
                try {
                    ((vc.i) this.d).a.bind(new InetSocketAddress(61578));
                    this.b = true;
                    do {
                        try {
                            Socket accept = ((vc.i) this.d).a.accept();
                            accept.setSoTimeout(5000);
                            InputStream inputStream = accept.getInputStream();
                            vc.i iVar = (vc.i) this.d;
                            iVar.c.D(new vc.a(iVar, inputStream, accept));
                        } catch (IOException e10) {
                            vc.i.d.log(Level.FINE, "Communication with the client broken", (Throwable) e10);
                        }
                    } while (!((vc.i) this.d).a.isClosed());
                } catch (IOException e11) {
                    this.c = e11;
                    return;
                }
        }
    }

    public g(vc.i iVar) {
        this.a = 2;
        this.d = iVar;
        this.b = false;
    }
}
