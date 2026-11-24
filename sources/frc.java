// default package

import android.util.Log;
import java.io.File;
import java.util.Iterator;
import org.telegram.messenger.a;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.WallpapersListActivity;
import org.telegram.utils.twidget.x;
import org.telegram.utils.twidget.z;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class frc implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ frc(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x006c, code lost:
    
        if (r0.l != false) goto L27;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        byte b = this.a;
        byte b2 = 0;
        byte b3 = 1;
        svc svcVar = null;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((WallpapersListActivity) obj).D0(false);
                return;
            case 1:
                ((gmc) obj).invalidateSelf();
                return;
            case 2:
                tsc tscVar = (tsc) obj;
                File databasePath = a.b.getDatabasePath("webview.db");
                long length = (databasePath == null || !databasePath.exists()) ? 0L : databasePath.length();
                File databasePath2 = a.b.getDatabasePath("webviewCache.db");
                if (databasePath2 != null && databasePath2.exists()) {
                    length += databasePath2.length();
                }
                File file = new File(a.b.getApplicationInfo().dataDir, "app_webview");
                if (file.exists()) {
                    length += tsc.d0(file, Boolean.FALSE);
                }
                File file2 = new File(a.b.getApplicationInfo().dataDir, "cache/WebView");
                if (file2.exists()) {
                    length += tsc.d0(file2, null);
                }
                File file3 = new File(a.b.getApplicationInfo().dataDir, "app_webview");
                gl.d3(new w20(tscVar, length, file3.exists() ? tsc.d0(file3, Boolean.TRUE) : 0L, (byte) 5));
                return;
            case 3:
                ((stc) ((up5) ((fb) obj).b).b).w.c();
                return;
            case 4:
                ((otc) obj).d(false, true);
                return;
            case 5:
                utc utcVar = (utc) obj;
                gl.e3(new ttc(utcVar.a, utcVar.b, b3), 500L);
                return;
            case 6:
                vvc.s((svc) obj);
                return;
            case 7:
                uvc uvcVar = (uvc) obj;
                int i = uvcVar.a;
                Iterator it = vvc.a.values().iterator();
                while (true) {
                    if (it.hasNext()) {
                        svc svcVar2 = (svc) it.next();
                        if (svcVar2.b == i && svcVar2.l == uvcVar.b && !svcVar2.k && svcVar2.x > 0 && svcVar2.d > 0) {
                            svcVar = svcVar2;
                        }
                    }
                }
                if (svcVar == null) {
                    vvc.E();
                    return;
                }
                TLRPC.TL_messages_getWidgetPublicData tL_messages_getWidgetPublicData = new TLRPC.TL_messages_getWidgetPublicData();
                tL_messages_getWidgetPublicData.peer = na7.q1(svcVar.b).h1(svcVar.c);
                tL_messages_getWidgetPublicData.msg_id = svcVar.d;
                tL_messages_getWidgetPublicData.hash = uvcVar.c;
                uvcVar.e = ConnectionsManager.getInstance(i).sendRequestTyped(tL_messages_getWidgetPublicData, new hc(b2), new n4b(uvcVar, (byte) 14));
                return;
            case 8:
                yvc yvcVar = (yvc) obj;
                synchronized (yvcVar.E.a) {
                    if (!yvcVar.n && yvcVar.e <= 0) {
                        if (yvcVar.E.r() <= 1) {
                            x xVar = yvcVar.E;
                            if (xVar.k) {
                                break;
                            }
                        }
                        yvcVar.E.o(yvcVar);
                        yvcVar.E.u();
                        return;
                    }
                    return;
                }
            case 9:
                bwc bwcVar = (bwc) obj;
                z zVar = bwcVar.e;
                if (zVar != null) {
                    zVar.f(bwcVar.w);
                    return;
                }
                return;
            case 10:
                nyc nycVar = (nyc) obj;
                Log.w("FirebaseMessaging", "Service took too long to process intent: " + nycVar.a.getAction() + " finishing.");
                nycVar.b.trySetResult(null);
                return;
            default:
                wtc wtcVar = (wtc) obj;
                ((lo9) wtcVar.d).f(new dkc(wtcVar, (byte) 13));
                return;
        }
    }
}
