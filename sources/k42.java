// default package

import android.text.Editable;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class k42 implements Runnable {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ byte c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Serializable f;
    public final /* synthetic */ Object h;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ k42(pk5 pk5Var, File file, String str, int i, Object obj, int i2) {
        this.d = pk5Var;
        this.e = file;
        this.f = str;
        this.b = i;
        this.h = obj;
        this.c = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b;
        ka4 E;
        byte b2 = this.a;
        Object obj = this.h;
        Serializable serializable = this.f;
        Object obj2 = this.e;
        Object obj3 = this.d;
        switch (b2) {
            case 0:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) obj3;
                d dVar = (d) obj2;
                ArrayList arrayList = (ArrayList) serializable;
                mu1 mu1Var = (mu1) obj;
                boolean z = ChatAttachAlertPhotoLayout.r1;
                x02 x02Var = chatAttachAlertPhotoLayout.b;
                if (!x02Var.z1 || x02Var.A1) {
                    b = this.c;
                } else {
                    PhotoViewer.r0().T1(null, dVar, null);
                    PhotoViewer r0 = PhotoViewer.r0();
                    r0.h = 0;
                    r0.n = false;
                    b = 3;
                }
                if (x02Var.B1) {
                    b = 13;
                }
                PhotoViewer.r0().o1(arrayList, this.b, b, false, chatAttachAlertPhotoLayout.i1, x02Var.B1 ? null : mu1Var);
                PhotoViewer.r0().G1(x02Var.K1);
                if (x02Var.z1 && !x02Var.A1) {
                    PhotoViewer.r0().P = false;
                } else if (x02Var.N2 != 0) {
                    PhotoViewer.r0().P = true;
                    PhotoViewer.r0().Q = x02Var.O2 != null;
                }
                if (x02Var.A1) {
                    PhotoViewer.r0().V(null, null, false, x02Var.D1);
                }
                if (ChatAttachAlertPhotoLayout.U()) {
                    PhotoViewer r02 = PhotoViewer.r0();
                    Editable text = x02Var.U0().getText();
                    r02.u7 = true;
                    r02.v7 = text;
                    r02.J1(null, text, false, false);
                    r02.E2(null);
                    break;
                }
                break;
            default:
                pk5 pk5Var = (pk5) obj3;
                File file = (File) obj2;
                String str = (String) serializable;
                pk5Var.getClass();
                int i = this.b;
                if (file != null && ((str.endsWith(".mp4") || str.endsWith(".jpg")) && (E = ba4.E(obj)) != null)) {
                    k27 k27Var = obj instanceof k27 ? (k27) obj : null;
                    long j = E.a;
                    if (mte.d(j >= 0 ? 1 : hc2.V(na7.q1(i).K0(Long.valueOf(-j))) ? 4 : 2, E, k27Var, i)) {
                        gl.e(file.toString());
                    }
                }
                kk7.f(i).k(kk7.X1, str, file);
                fl5 fl5Var = pk5Var.b;
                fl5Var.s.c(new hu2(fl5Var, str, this.c, file, (byte) 1));
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ k42(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, int i, d dVar, ArrayList arrayList, int i2, mu1 mu1Var) {
        this.d = chatAttachAlertPhotoLayout;
        this.c = i;
        this.e = dVar;
        this.f = arrayList;
        this.b = i2;
        this.h = mu1Var;
    }
}
