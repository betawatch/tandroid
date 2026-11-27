// default package

import android.text.Editable;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class a52 implements Runnable {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ byte c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Serializable f;
    public final /* synthetic */ Object h;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ a52(sm5 sm5Var, File file, String str, int i, Object obj, int i2) {
        this.d = sm5Var;
        this.e = file;
        this.f = str;
        this.b = i;
        this.h = obj;
        this.c = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b;
        hc4 E;
        byte b2 = this.a;
        Object obj = this.h;
        Serializable serializable = this.f;
        Object obj2 = this.e;
        Object obj3 = this.d;
        switch (b2) {
            case 0:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) obj3;
                e eVar = (e) obj2;
                ArrayList arrayList = (ArrayList) serializable;
                zu1 zu1Var = (zu1) obj;
                boolean z = ChatAttachAlertPhotoLayout.r1;
                n12 n12Var = chatAttachAlertPhotoLayout.b;
                if (!n12Var.z1 || n12Var.A1) {
                    b = this.c;
                } else {
                    PhotoViewer.q0().T1(null, eVar, null);
                    PhotoViewer q0 = PhotoViewer.q0();
                    q0.h = 0;
                    q0.n = false;
                    b = 3;
                }
                if (n12Var.B1) {
                    b = 13;
                }
                PhotoViewer.q0().o1(arrayList, this.b, b, false, chatAttachAlertPhotoLayout.i1, n12Var.B1 ? null : zu1Var);
                PhotoViewer.q0().G1(n12Var.K1);
                if (n12Var.z1 && !n12Var.A1) {
                    PhotoViewer.q0().P = false;
                } else if (n12Var.N2 != 0) {
                    PhotoViewer.q0().P = true;
                    PhotoViewer.q0().Q = n12Var.O2 != null;
                }
                if (n12Var.A1) {
                    PhotoViewer.q0().U(null, null, false, n12Var.D1);
                }
                if (ChatAttachAlertPhotoLayout.T()) {
                    PhotoViewer q02 = PhotoViewer.q0();
                    Editable text = n12Var.V0().getText();
                    q02.u7 = true;
                    q02.v7 = text;
                    q02.J1(null, text, false, false);
                    q02.E2(null);
                    break;
                }
                break;
            default:
                sm5 sm5Var = (sm5) obj3;
                File file = (File) obj2;
                String str = (String) serializable;
                sm5Var.getClass();
                int i = this.b;
                if (file != null && ((str.endsWith(".mp4") || str.endsWith(".jpg")) && (E = xb4.E(obj)) != null)) {
                    r47 r47Var = obj instanceof r47 ? (r47) obj : null;
                    long j = E.a;
                    if (eye.d(j >= 0 ? 1 : xc2.V(uc7.s1(i).M0(Long.valueOf(-j))) ? 4 : 2, E, r47Var, i)) {
                        hl.e(file.toString());
                    }
                }
                jn7.f(i).k(jn7.Y1, str, file);
                in5 in5Var = sm5Var.b;
                in5Var.s.c(new av2(in5Var, str, this.c, file, (byte) 1));
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ a52(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, int i, e eVar, ArrayList arrayList, int i2, zu1 zu1Var) {
        this.d = chatAttachAlertPhotoLayout;
        this.c = i;
        this.e = eVar;
        this.f = arrayList;
        this.b = i2;
        this.h = zu1Var;
    }
}
