// default package

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class f98 extends yc8 {
    public final /* synthetic */ l98 a;

    public f98(l98 l98Var) {
        this.a = l98Var;
    }

    @Override // yc8, ed8
    public final int D(int i, oec oecVar) {
        int a0;
        boolean z;
        l98 l98Var = this.a;
        ArrayList arrayList = l98Var.f;
        ArrayList arrayList2 = l98Var.c;
        do6 do6Var = l98Var.K;
        if (do6Var != null) {
            if (i >= 0 && i < do6Var.e.size()) {
                no6 no6Var = (no6) do6Var.e.get(i);
                a0 = l98Var.a0(-1, no6Var);
                if (a0 == -1) {
                    no6Var.s = oecVar;
                    a0 = arrayList2.indexOf(Integer.valueOf(no6Var.C));
                    z = true;
                } else {
                    no6Var.s = null;
                    z = false;
                }
            }
            return -1;
        }
        if (i >= 0 && i < arrayList.size()) {
            ro6 ro6Var = (ro6) arrayList.get(i);
            a0 = l98Var.a0(-1, ro6Var);
            if (a0 == -1) {
                ro6Var.s = oecVar;
                a0 = arrayList2.indexOf(ro6Var.B);
                z = true;
            } else {
                ro6Var.s = null;
                z = false;
            }
        }
        return -1;
        int childCount = l98Var.L.getChildCount();
        int i2 = 0;
        while (true) {
            if (i2 >= childCount) {
                break;
            }
            View childAt = l98Var.L.getChildAt(i2);
            if (((Integer) childAt.getTag()).intValue() == i) {
                ((d88) childAt).b(l98Var.e ? a0 : -1, z, false);
            } else {
                i2++;
            }
        }
        l98Var.m0(z ? 1 : 2);
        l98Var.t0.h();
        return a0;
    }

    @Override // yc8, ed8
    public final void F() {
        l98 l98Var = this.a;
        int childCount = l98Var.L.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = l98Var.L.getChildAt(i);
            if (childAt instanceof d88) {
                ((d88) childAt).g(true);
            }
        }
    }

    @Override // yc8, ed8
    public final int G() {
        return this.a.b.size();
    }

    @Override // yc8, ed8
    public final void L(int i, oec oecVar, boolean z, int i2, int i3, boolean z2) {
        l98 l98Var = this.a;
        ArrayList arrayList = l98Var.f;
        do6 do6Var = l98Var.K;
        if (l98Var.b.isEmpty()) {
            if (do6Var != null) {
                if (i < 0 || i >= do6Var.e.size()) {
                    return;
                }
                no6 no6Var = (no6) do6Var.e.get(i);
                no6Var.s = oecVar;
                l98Var.a0(-1, no6Var);
            } else {
                if (i < 0 || i >= arrayList.size()) {
                    return;
                }
                ro6 ro6Var = (ro6) arrayList.get(i);
                ro6Var.s = oecVar;
                l98Var.a0(-1, ro6Var);
            }
        }
        l98Var.i0(i2, z);
    }

    @Override // yc8, ed8
    public final fd8 M(r47 r47Var, TLRPC.FileLocation fileLocation, int i, boolean z, boolean z2) {
        l98 l98Var = this.a;
        d88 c0 = l98Var.c0(i);
        if (c0 == null) {
            return null;
        }
        de0 imageView = c0.getImageView();
        int[] iArr = new int[2];
        imageView.getLocationInWindow(iArr);
        fd8 fd8Var = new fd8();
        fd8Var.b = iArr[0];
        fd8Var.c = iArr[1];
        fd8Var.d = l98Var.L;
        ImageReceiver imageReceiver = imageView.getImageReceiver();
        fd8Var.a = imageReceiver;
        fd8Var.e = imageReceiver.p();
        fd8Var.k = c0.getScale();
        c0.g(false);
        return fd8Var;
    }

    @Override // yc8, ed8
    public final int R(Object obj) {
        l98 l98Var = this.a;
        ArrayList arrayList = l98Var.c;
        HashMap hashMap = l98Var.b;
        Object valueOf = obj instanceof no6 ? Integer.valueOf(((no6) obj).C) : obj instanceof ro6 ? ((ro6) obj).B : null;
        if (valueOf == null || !hashMap.containsKey(valueOf)) {
            return -1;
        }
        hashMap.remove(valueOf);
        int indexOf = arrayList.indexOf(valueOf);
        if (indexOf >= 0) {
            arrayList.remove(indexOf);
        }
        if (l98Var.e) {
            l98Var.l0();
        }
        return indexOf;
    }

    @Override // yc8, ed8
    public final void X(int i) {
        l98 l98Var = this.a;
        do6 do6Var = l98Var.K;
        d88 c0 = l98Var.c0(i);
        if (c0 != null) {
            if (do6Var == null) {
                c0.e((ro6) l98Var.f.get(i));
                return;
            }
            de0 imageView = c0.getImageView();
            imageView.q();
            no6 no6Var = (no6) do6Var.e.get(i);
            String str = no6Var.c;
            int i2 = no6Var.C;
            String str2 = no6Var.I;
            if (str != null) {
                imageView.o(str, null, aob.R4);
                return;
            }
            if (str2 == null) {
                imageView.setImageDrawable(aob.R4);
                return;
            }
            imageView.r(no6Var.J, no6Var.K, true);
            if (!no6Var.b || no6Var.d()) {
                imageView.o(dze.d("thumb://", i2, ":", str2), null, aob.R4);
            } else {
                imageView.o(dze.d("vthumb://", i2, ":", str2), null, aob.R4);
            }
        }
    }

    @Override // yc8, ed8
    public final void b0(int i) {
        l98 l98Var = this.a;
        int childCount = l98Var.L.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = l98Var.L.getChildAt(i2);
            if (childAt.getTag() != null) {
                d88 d88Var = (d88) childAt;
                int intValue = ((Integer) childAt.getTag()).intValue();
                do6 do6Var = l98Var.K;
                if (do6Var == null ? !(intValue < 0 || intValue >= l98Var.f.size()) : !(intValue < 0 || intValue >= do6Var.e.size())) {
                    if (intValue == i) {
                        d88Var.g(true);
                        return;
                    }
                }
            }
        }
    }

    @Override // yc8, ed8
    public final ArrayList d() {
        return this.a.c;
    }

    @Override // yc8, ed8
    public final mn5 k(int i) {
        d88 c0 = this.a.c0(i);
        if (c0 != null) {
            return c0.getImageView().getImageReceiver().p();
        }
        return null;
    }

    @Override // yc8, ed8
    public final boolean t() {
        l98 l98Var = this.a;
        l98Var.t0.C(0, true, true);
        l98Var.finishFragment();
        return true;
    }

    @Override // yc8, ed8
    public final HashMap u() {
        return this.a.b;
    }

    @Override // yc8, ed8
    public final boolean w(int i) {
        l98 l98Var = this.a;
        ArrayList arrayList = l98Var.f;
        HashMap hashMap = l98Var.b;
        do6 do6Var = l98Var.K;
        return do6Var != null ? i >= 0 && i < do6Var.e.size() && hashMap.containsKey(Integer.valueOf(((no6) do6Var.e.get(i)).C)) : i >= 0 && i < arrayList.size() && hashMap.containsKey(((ro6) arrayList.get(i)).B);
    }

    @Override // yc8, ed8
    public final boolean y() {
        return this.a.F;
    }
}
