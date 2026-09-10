package ii;

import java.io.IOException;
import java.io.InputStream;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.ArrayList;
import java.util.logging.Level;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.p2;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final class g implements Runnable {
    public final /* synthetic */ int a;
    public boolean b;
    public Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ g(Object obj, Object obj2, boolean z10, int i10) {
        this.a = i10;
        this.d = obj;
        this.c = obj2;
        this.b = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                n nVar = (n) this.d;
                ArrayList arrayList = (ArrayList) this.c;
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    s4.i iVar = (s4.i) obj;
                    nVar.T(iVar.a, iVar, this.b);
                }
                arrayList.clear();
                nVar.u.remove(arrayList);
                break;
            case 1:
                ActionBarLayout actionBarLayout = (ActionBarLayout) this.d;
                if (actionBarLayout.e == this) {
                    actionBarLayout.e = null;
                    ((p2) this.c).onTransitionAnimationStart(true, false);
                    actionBarLayout.d0(true, true, this.b);
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
                            yc.i iVar2 = (yc.i) this.d;
                            iVar2.c.y(new yc.a(iVar2, inputStream, accept));
                        } catch (IOException e) {
                            yc.i.d.log(Level.FINE, "Communication with the client broken", (Throwable) e);
                        }
                    } while (!((yc.i) this.d).a.isClosed());
                } catch (IOException e7) {
                    this.c = e7;
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
