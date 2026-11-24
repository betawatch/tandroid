// default package

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public abstract class a52 extends i98 {
    public final /* synthetic */ ChatAttachAlertPhotoLayout a;

    public a52(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout) {
        this.a = chatAttachAlertPhotoLayout;
    }

    @Override // i98, o98
    public final int D(int i, oac oacVar) {
        boolean z;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.a;
        s42 s42Var = chatAttachAlertPhotoLayout.r;
        s42 s42Var2 = chatAttachAlertPhotoLayout.F;
        x02 x02Var = chatAttachAlertPhotoLayout.b;
        if (x02Var.P3 < 0 || ChatAttachAlertPhotoLayout.t1.size() < x02Var.P3 || w(i)) {
            boolean z2 = ChatAttachAlertPhotoLayout.r1;
            jm6 d0 = chatAttachAlertPhotoLayout.d0(i);
            if (d0 != null && !chatAttachAlertPhotoLayout.Y(d0)) {
                if (ChatAttachAlertPhotoLayout.t1.size() + 1 <= chatAttachAlertPhotoLayout.i0()) {
                    int R = chatAttachAlertPhotoLayout.R(d0, -1);
                    if (R == -1) {
                        R = ChatAttachAlertPhotoLayout.u1.indexOf(Integer.valueOf(d0.C));
                        z = true;
                    } else {
                        d0.s = null;
                        z = false;
                    }
                    d0.s = oacVar;
                    int childCount = s42Var2.getChildCount();
                    int i2 = 0;
                    while (true) {
                        if (i2 >= childCount) {
                            break;
                        }
                        View childAt = s42Var2.getChildAt(i2);
                        if (!(childAt instanceof o48) || ((Integer) childAt.getTag()).intValue() != i) {
                            i2++;
                        } else if ((x02Var.Z1 instanceof mu1) && x02Var.Q3) {
                            ((o48) childAt).b(R, z, false);
                        } else {
                            ((o48) childAt).b(-1, z, false);
                        }
                    }
                    int childCount2 = s42Var.getChildCount();
                    int i3 = 0;
                    while (true) {
                        if (i3 >= childCount2) {
                            break;
                        }
                        View childAt2 = s42Var.getChildAt(i3);
                        if (!(childAt2 instanceof o48) || ((Integer) childAt2.getTag()).intValue() != i) {
                            i3++;
                        } else if ((x02Var.Z1 instanceof mu1) && x02Var.Q3) {
                            ((o48) childAt2).b(R, z, false);
                        } else {
                            ((o48) childAt2).b(-1, z, false);
                        }
                    }
                    x02Var.F1(z ? 1 : 2);
                    return R;
                }
            }
        }
        return -1;
    }

    @Override // i98, o98
    public final int G() {
        return ChatAttachAlertPhotoLayout.t1.size();
    }

    @Override // i98, o98
    public final boolean O() {
        x02 x02Var = this.a.b;
        return x02Var != null && x02Var.c2;
    }

    @Override // i98, o98
    public final int S(int i) {
        boolean z = ChatAttachAlertPhotoLayout.r1;
        jm6 d0 = this.a.d0(i);
        if (d0 == null) {
            return -1;
        }
        return ChatAttachAlertPhotoLayout.u1.indexOf(Integer.valueOf(d0.C));
    }

    @Override // i98, o98
    public final ArrayList d() {
        return ChatAttachAlertPhotoLayout.u1;
    }

    @Override // i98, o98
    public final void m() {
        boolean z = ChatAttachAlertPhotoLayout.r1;
        this.a.y0();
    }

    @Override // i98, o98
    public final HashMap u() {
        return ChatAttachAlertPhotoLayout.t1;
    }

    @Override // i98, o98
    public final boolean w(int i) {
        boolean z = ChatAttachAlertPhotoLayout.r1;
        jm6 d0 = this.a.d0(i);
        return d0 != null && ChatAttachAlertPhotoLayout.t1.containsKey(Integer.valueOf(d0.C));
    }
}
