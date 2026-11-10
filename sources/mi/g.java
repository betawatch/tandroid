package mi;

import java.io.IOException;
import java.io.InputStream;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.ArrayList;
import java.util.logging.Level;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.f2;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes4.dex */
public final class g implements Runnable {
    public final /* synthetic */ int a;
    public boolean b;
    public Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ g(Object obj, Object obj2, boolean z9, int i7) {
        this.a = i7;
        this.d = obj;
        this.c = obj2;
        this.b = z9;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                l lVar = (l) this.d;
                ArrayList arrayList = (ArrayList) this.c;
                int size = arrayList.size();
                int i7 = 0;
                while (i7 < size) {
                    Object obj = arrayList.get(i7);
                    i7++;
                    v4.j jVar = (v4.j) obj;
                    lVar.T(jVar.a, jVar, this.b);
                }
                arrayList.clear();
                lVar.u.remove(arrayList);
                break;
            case 1:
                ActionBarLayout actionBarLayout = (ActionBarLayout) this.d;
                if (actionBarLayout.e == this) {
                    actionBarLayout.e = null;
                    ((f2) this.c).onTransitionAnimationStart(true, false);
                    actionBarLayout.h0(true, true, this.b);
                    break;
                }
                break;
            default:
                try {
                    ((yc.i) this.d).a.bind(new InetSocketAddress(61578));
                    this.b = true;
                    do {
                        try {
                            Socket accept = ((yc.i) this.d).a.accept();
                            accept.setSoTimeout(5000);
                            InputStream inputStream = accept.getInputStream();
                            yc.i iVar = (yc.i) this.d;
                            iVar.c.D(new yc.a(iVar, inputStream, accept));
                        } catch (IOException e10) {
                            yc.i.d.log(Level.FINE, "Communication with the client broken", (Throwable) e10);
                        }
                    } while (!((yc.i) this.d).a.isClosed());
                } catch (IOException e11) {
                    this.c = e11;
                    return;
                }
        }
    }

    public g(yc.i iVar) {
        this.a = 2;
        this.d = iVar;
        this.b = false;
    }
}
