package bd;

import java.io.IOException;
import java.io.InputStream;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.ArrayList;
import java.util.logging.Level;
import mi.m;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.r2;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final class j implements Runnable {
    public final /* synthetic */ int a;
    public boolean b;
    public Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ j(Object obj, Object obj2, boolean z10, int i10) {
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
                    ((k) this.d).a.bind(new InetSocketAddress(61578));
                    this.b = true;
                    do {
                        try {
                            Socket accept = ((k) this.d).a.accept();
                            accept.setSoTimeout(5000);
                            InputStream inputStream = accept.getInputStream();
                            k kVar = (k) this.d;
                            kVar.c.y(new a(kVar, inputStream, accept));
                        } catch (IOException e) {
                            k.d.log(Level.FINE, "Communication with the client broken", (Throwable) e);
                        }
                    } while (!((k) this.d).a.isClosed());
                } catch (IOException e10) {
                    this.c = e10;
                    return;
                }
            case 1:
                m mVar = (m) this.d;
                ArrayList arrayList = (ArrayList) this.c;
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    s4.k kVar2 = (s4.k) obj;
                    mVar.T(kVar2.a, kVar2, this.b);
                }
                arrayList.clear();
                mVar.u.remove(arrayList);
                break;
            default:
                ActionBarLayout actionBarLayout = (ActionBarLayout) this.d;
                if (actionBarLayout.e == this) {
                    actionBarLayout.e = null;
                    ((r2) this.c).onTransitionAnimationStart(true, false);
                    actionBarLayout.g0(true, true, this.b);
                    break;
                }
                break;
        }
    }

    public j(k kVar) {
        this.a = 0;
        this.d = kVar;
        this.b = false;
    }
}
