package kc;

import java.io.IOException;
import java.io.InputStream;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.ArrayList;
import java.util.logging.Level;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.p2;
import wh.n;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class j implements Runnable {
    public final /* synthetic */ int a;
    public boolean b;
    public Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ j(Object obj, Object obj2, boolean z4, int i10) {
        this.a = i10;
        this.d = obj;
        this.c = obj2;
        this.b = z4;
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
                            kVar.c.w(new a(kVar, inputStream, accept));
                        } catch (IOException e) {
                            k.d.log(Level.FINE, "Communication with the client broken", (Throwable) e);
                        }
                    } while (!((k) this.d).a.isClosed());
                } catch (IOException e6) {
                    this.c = e6;
                    return;
                }
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
                n nVar = (n) this.d;
                ArrayList arrayList = (ArrayList) this.c;
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    f2.k kVar2 = (f2.k) obj;
                    nVar.T(kVar2.a, kVar2, this.b);
                }
                arrayList.clear();
                nVar.u.remove(arrayList);
                break;
        }
    }

    public j(k kVar) {
        this.a = 0;
        this.d = kVar;
        this.b = false;
    }
}
