package ai;

import org.telegram.messenger.FileLoader;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final class z implements NotificationCenter.NotificationCenterDelegate {
    public final int a;
    public final TLRPC.Document b;
    public final int c;
    public final n1 d;
    public boolean e;
    public boolean f;
    public boolean h;

    public z(int i10, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, int i11, n1 n1Var) {
        this.a = i10;
        this.b = document;
        this.c = i11;
        this.d = n1Var;
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.fileLoaded);
        if (!FileLoader.getInstance(i10).getPathToAttach(document, true).exists()) {
            FileLoader.getInstance(i10).loadFile(document, tL_starGiftUnique, 3, 1);
        }
        a();
    }

    public final void a() {
        if (this.e || this.f || !FileLoader.getInstance(this.a).getPathToAttach(this.b, true).exists()) {
            return;
        }
        this.f = true;
        NotificationCenter.getInstance(this.a).removeObserver(this, NotificationCenter.fileLoaded);
        Utilities.globalQueue.postRunnable(new a1.f(8, this, FileLoader.getInstance(this.a).getPathToAttach(this.b, true)));
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.fileLoaded) {
            a();
        }
    }
}
