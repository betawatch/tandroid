// default package

import java.util.HashMap;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class d52 implements pcc {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ int d;
    public final /* synthetic */ q52 e;

    public /* synthetic */ d52(j52 j52Var, boolean z, boolean z2, int i) {
        this.e = j52Var;
        this.b = z;
        this.c = z2;
        this.d = i;
    }

    @Override // pcc
    public final void a(Object obj) {
        byte b = this.a;
        q52 q52Var = this.e;
        switch (b) {
            case 0:
                Long l = (Long) obj;
                n12 n12Var = ((l52) q52Var).b.b;
                if (n12Var != null) {
                    n12Var.F3 = true;
                }
                n12Var.W3.z0(7, true, this.b, this.d, 0, 0L, n12Var.b1(), this.c, l.longValue());
                HashMap hashMap = ChatAttachAlertPhotoLayout.t1;
                hashMap.clear();
                ChatAttachAlertPhotoLayout.s1.clear();
                ChatAttachAlertPhotoLayout.u1.clear();
                hashMap.clear();
                PhotoViewer.q0();
                PhotoViewer.q0().A(PhotoViewer.q0().Q, false);
                PhotoViewer.q0().v2 = true;
                break;
            default:
                Long l2 = (Long) obj;
                PhotoViewer.q0();
                PhotoViewer.q0().P = false;
                PhotoViewer.q0().v2 = false;
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = ((j52) q52Var).c;
                n12 n12Var2 = chatAttachAlertPhotoLayout.b;
                n12Var2.s4 = true;
                n12Var2.F3 = true;
                chatAttachAlertPhotoLayout.a0(false);
                l12 l12Var = n12Var2.W3;
                boolean z = this.b;
                l12Var.z0(z ? 4 : 8, true, this.c, this.d, 0, 0L, n12Var2.b1(), z, l2.longValue());
                ChatAttachAlertPhotoLayout.s1.clear();
                ChatAttachAlertPhotoLayout.u1.clear();
                ChatAttachAlertPhotoLayout.t1.clear();
                chatAttachAlertPhotoLayout.H.f();
                chatAttachAlertPhotoLayout.w.f();
                n12Var2.a(true);
                PhotoViewer.q0();
                PhotoViewer.q0().A(PhotoViewer.q0().Q, false);
                PhotoViewer.q0().v2 = true;
                break;
        }
    }

    public /* synthetic */ d52(l52 l52Var, boolean z, int i, boolean z2) {
        this.e = l52Var;
        this.b = z;
        this.d = i;
        this.c = z2;
    }
}
