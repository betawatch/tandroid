// default package

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public abstract class l62 extends jb8 {
    public final /* synthetic */ ChatAttachAlertPhotoLayout a;

    public l62(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout) {
        this.a = chatAttachAlertPhotoLayout;
    }

    @Override // jb8, pb8
    public final int E(int i, rcc rccVar) {
        boolean z;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.a;
        d62 d62Var = chatAttachAlertPhotoLayout.r;
        d62 d62Var2 = chatAttachAlertPhotoLayout.F;
        i22 i22Var = chatAttachAlertPhotoLayout.b;
        if (i22Var.P3 < 0 || ChatAttachAlertPhotoLayout.t1.size() < i22Var.P3 || w(i)) {
            boolean z2 = ChatAttachAlertPhotoLayout.r1;
            jo6 d0 = chatAttachAlertPhotoLayout.d0(i);
            if (d0 != null && !chatAttachAlertPhotoLayout.Y(d0)) {
                if (ChatAttachAlertPhotoLayout.t1.size() + 1 <= chatAttachAlertPhotoLayout.i0()) {
                    int Q = chatAttachAlertPhotoLayout.Q(d0, -1);
                    if (Q == -1) {
                        Q = ChatAttachAlertPhotoLayout.u1.indexOf(Integer.valueOf(d0.C));
                        z = true;
                    } else {
                        d0.s = null;
                        z = false;
                    }
                    d0.s = rccVar;
                    int childCount = d62Var2.getChildCount();
                    int i2 = 0;
                    while (true) {
                        if (i2 >= childCount) {
                            break;
                        }
                        View childAt = d62Var2.getChildAt(i2);
                        if (!(childAt instanceof q68) || ((Integer) childAt.getTag()).intValue() != i) {
                            i2++;
                        } else if ((i22Var.Z1 instanceof yv1) && i22Var.Q3) {
                            ((q68) childAt).b(Q, z, false);
                        } else {
                            ((q68) childAt).b(-1, z, false);
                        }
                    }
                    int childCount2 = d62Var.getChildCount();
                    int i3 = 0;
                    while (true) {
                        if (i3 >= childCount2) {
                            break;
                        }
                        View childAt2 = d62Var.getChildAt(i3);
                        if (!(childAt2 instanceof q68) || ((Integer) childAt2.getTag()).intValue() != i) {
                            i3++;
                        } else if ((i22Var.Z1 instanceof yv1) && i22Var.Q3) {
                            ((q68) childAt2).b(Q, z, false);
                        } else {
                            ((q68) childAt2).b(-1, z, false);
                        }
                    }
                    i22Var.F1(z ? 1 : 2);
                    return Q;
                }
            }
        }
        return -1;
    }

    @Override // jb8, pb8
    public final int H() {
        return ChatAttachAlertPhotoLayout.t1.size();
    }

    @Override // jb8, pb8
    public final boolean P() {
        i22 i22Var = this.a.b;
        return i22Var != null && i22Var.c2;
    }

    @Override // jb8, pb8
    public final int T(int i) {
        boolean z = ChatAttachAlertPhotoLayout.r1;
        jo6 d0 = this.a.d0(i);
        if (d0 == null) {
            return -1;
        }
        return ChatAttachAlertPhotoLayout.u1.indexOf(Integer.valueOf(d0.C));
    }

    @Override // jb8, pb8
    public final ArrayList d() {
        return ChatAttachAlertPhotoLayout.u1;
    }

    @Override // jb8, pb8
    public final void m() {
        boolean z = ChatAttachAlertPhotoLayout.r1;
        this.a.y0();
    }

    @Override // jb8, pb8
    public final HashMap u() {
        return ChatAttachAlertPhotoLayout.t1;
    }

    @Override // jb8, pb8
    public final boolean w(int i) {
        boolean z = ChatAttachAlertPhotoLayout.r1;
        jo6 d0 = this.a.d0(i);
        return d0 != null && ChatAttachAlertPhotoLayout.t1.containsKey(Integer.valueOf(d0.C));
    }
}
