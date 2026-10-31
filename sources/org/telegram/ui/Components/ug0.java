package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public class ug0 extends np implements org.telegram.messenger.us {
    public boolean A0;
    public boolean B0;
    public final tk0 C0;
    public final tg0 D0;
    public long E0;
    public TLRPC.ChatFull F0;
    public final qg0 G0;
    public boolean H0;
    public boolean I0;
    public final boolean J0;
    public org.telegram.messenger.ic K0;
    public final int L0;
    public final Path M0;
    public final RectF N0;
    public final float[] O0;
    public org.telegram.messenger.ic P0;
    public org.telegram.messenger.ic Q0;
    public g61 R0;
    public org.telegram.messenger.dp S0;
    public final ArrayList T0;
    public final ArrayList U0;
    public final ArrayList V0;
    public final ArrayList W0;
    public final ArrayList X0;
    public final ArrayList Y0;
    public final ArrayList Z0;
    public final ArrayList a1;
    public final ArrayList b1;
    public int c1;
    public final SparseArray d1;
    public boolean e1;
    public boolean f1;
    public boolean g1;
    public org.telegram.ui.qs0 h1;
    public boolean i1;
    public int j1;
    public int k1;
    public int l1;
    public int m1;
    public int n1;
    public int o1;
    public mg0 p1;
    public org.telegram.messenger.ic q1;
    public org.telegram.messenger.ic r1;
    public final PointF x0;
    public final int y0;
    public final org.telegram.ui.ActionBar.l z0;

    public ug0(Context context, org.telegram.ui.ActionBar.l lVar, tk0 tk0Var, org.telegram.ui.q4 q4Var) {
        super(context);
        this.x0 = new PointF();
        this.A0 = true;
        this.B0 = true;
        int i10 = org.telegram.messenger.d20.s0;
        this.L0 = i10;
        this.M0 = new Path();
        this.N0 = new RectF();
        this.O0 = new float[8];
        this.T0 = new ArrayList();
        this.U0 = new ArrayList();
        this.V0 = new ArrayList();
        this.W0 = new ArrayList();
        this.X0 = new ArrayList();
        this.Y0 = new ArrayList();
        this.Z0 = new ArrayList();
        this.a1 = new ArrayList();
        this.b1 = new ArrayList();
        this.d1 = new SparseArray();
        this.e1 = true;
        this.j1 = -1;
        this.k1 = -1;
        setOffscreenPageLimit(2);
        this.p1 = null;
        this.J0 = false;
        this.C0 = tk0Var;
        ConnectionsManager.generateClassGuid();
        this.z0 = lVar;
        this.y0 = ViewConfiguration.get(context).getScaledTouchSlop();
        this.G0 = q4Var;
        b(new ng0(this));
        tg0 tg0Var = new tg0(this, getContext(), null);
        this.D0 = tg0Var;
        setAdapter((mp) tg0Var);
        org.telegram.messenger.zs.f(i10).c(this, org.telegram.messenger.zs.b0);
        org.telegram.messenger.zs.f(i10).c(this, org.telegram.messenger.zs.Y1);
        org.telegram.messenger.zs.f(i10).c(this, org.telegram.messenger.zs.X1);
        org.telegram.messenger.zs.f(i10).c(this, org.telegram.messenger.zs.c0);
        org.telegram.messenger.zs.f(i10).c(this, org.telegram.messenger.zs.e3);
        this.S0 = null;
    }

    public final void A(org.telegram.messenger.ic icVar, org.telegram.messenger.ic icVar2) {
        this.P0 = icVar;
        this.U0.add(0, null);
        this.T0.add(0, null);
        this.X0.add(0, icVar);
        this.Y0.add(0, icVar2);
        this.Z0.add(0, null);
        this.W0.add(0, null);
        this.V0.add(0, null);
        this.a1.add(0, -1);
        this.b1.add(0, Float.valueOf(0.0f));
        this.D0.g();
        L();
        this.q1 = icVar;
        this.r1 = icVar2;
    }

    public final void B(float f7, int i10) {
        int i11 = this.j1;
        float f10 = 0.0f;
        if (i11 >= 0 || this.k1 >= 0) {
            if (i11 < 0) {
                i11 = this.k1;
            }
            int k10 = this.D0.k(i10);
            if (this.i1) {
                k10--;
            }
            float f11 = k10 == i11 ? 1.0f - f7 : (getRealCount() <= 0 || (k10 + (-1)) % getRealCount() != i11) ? (getRealCount() <= 0 || (k10 + 1) % getRealCount() != i11) ? 0.0f : (1.0f - f7) + 1.0f : (1.0f - f7) - 1.0f;
            if (f11 > 1.0f) {
                f11 = 2.0f - f11;
            }
            f10 = Utilities.i(f11, 1.0f, 0.0f);
        }
        setCustomAvatarProgress(f10);
    }

    public final org.telegram.messenger.ic C(org.telegram.messenger.ic icVar, org.telegram.messenger.ic icVar2) {
        TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated;
        if (icVar == null) {
            return null;
        }
        int i10 = 0;
        while (i10 < 2) {
            ArrayList arrayList = i10 == 0 ? this.Y0 : this.X0;
            int size = arrayList.size();
            for (int i11 = 0; i11 < size; i11++) {
                org.telegram.messenger.ic icVar3 = (org.telegram.messenger.ic) arrayList.get(i11);
                if (icVar3 != null && (tL_fileLocationToBeDeprecated = icVar3.f) != null) {
                    int i12 = icVar3.a;
                    if (i12 == icVar.a) {
                        int i13 = tL_fileLocationToBeDeprecated.local_id;
                        TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated2 = icVar.f;
                        if (i13 == tL_fileLocationToBeDeprecated2.local_id && tL_fileLocationToBeDeprecated.volume_id == tL_fileLocationToBeDeprecated2.volume_id) {
                            return (org.telegram.messenger.ic) this.W0.get(i11);
                        }
                    }
                    if (i12 == icVar2.a) {
                        int i14 = tL_fileLocationToBeDeprecated.local_id;
                        TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated3 = icVar2.f;
                        if (i14 == tL_fileLocationToBeDeprecated3.local_id && tL_fileLocationToBeDeprecated.volume_id == tL_fileLocationToBeDeprecated3.volume_id) {
                            return (org.telegram.messenger.ic) this.W0.get(i11);
                        }
                    } else {
                        continue;
                    }
                }
            }
            i10++;
        }
        return null;
    }

    public final org.telegram.messenger.ic D(int i10) {
        if (i10 < 0) {
            return null;
        }
        ArrayList arrayList = this.X0;
        if (i10 >= arrayList.size()) {
            return null;
        }
        org.telegram.messenger.ic icVar = (org.telegram.messenger.ic) this.W0.get(i10);
        return icVar != null ? icVar : (org.telegram.messenger.ic) arrayList.get(i10);
    }

    public final View E(int i10) {
        tg0 tg0Var = this.D0;
        if (tg0Var == null) {
            return null;
        }
        ArrayList arrayList = tg0Var.c;
        if (arrayList.size() <= i10 || i10 < 0) {
            return null;
        }
        rg0 rg0Var = (rg0) arrayList.get(i10);
        sg0 sg0Var = rg0Var.b;
        return sg0Var == null ? rg0Var.c : sg0Var;
    }

    public final TLRPC.Photo F(int i10) {
        if (i10 < 0) {
            return null;
        }
        ArrayList arrayList = this.V0;
        if (i10 >= arrayList.size()) {
            return null;
        }
        return (TLRPC.Photo) arrayList.get(i10);
    }

    public final org.telegram.messenger.ic G(int i10) {
        if (i10 < 0) {
            return null;
        }
        ArrayList arrayList = this.X0;
        if (i10 >= arrayList.size()) {
            return null;
        }
        return (org.telegram.messenger.ic) arrayList.get(i10);
    }

    public final boolean H(g61 g61Var, org.telegram.messenger.ic icVar, org.telegram.messenger.ic icVar2, boolean z10) {
        org.telegram.messenger.dp dpVar;
        org.telegram.messenger.dp dpVar2;
        if (icVar != null && icVar2 != null && this.c1 == 0) {
            org.telegram.messenger.ic icVar3 = this.P0;
            ArrayList arrayList = this.X0;
            if (icVar3 == null || icVar3.f.local_id != icVar.f.local_id) {
                boolean isEmpty = arrayList.isEmpty();
                tg0 tg0Var = this.D0;
                if (!isEmpty) {
                    this.P0 = icVar;
                    if (z10 && (dpVar2 = this.S0) != null) {
                        dpVar2.e();
                        this.S0.b(getCurrentItem() - (tg0Var != null ? tg0Var.j() : 0), true);
                    }
                    return true;
                }
                if (z10 && (dpVar = this.S0) != null) {
                    dpVar.e();
                    this.S0.b(getCurrentItem() - (tg0Var != null ? tg0Var.j() : 0), true);
                }
            }
            if (arrayList.isEmpty()) {
                this.P0 = icVar;
                this.Q0 = icVar2;
                this.R0 = g61Var;
                this.U0.add(null);
                this.T0.add(null);
                arrayList.add(icVar);
                this.Y0.add(icVar2);
                this.Z0.add(g61Var);
                this.W0.add(null);
                this.V0.add(null);
                this.a1.add(-1);
                this.b1.add(null);
                getAdapter().g();
                L();
                return true;
            }
        }
        return false;
    }

    public final boolean I() {
        int realPosition = getRealPosition();
        if (this.i1) {
            if (realPosition == 0) {
                return false;
            }
            realPosition--;
        }
        if (realPosition < 0) {
            return false;
        }
        ArrayList arrayList = this.W0;
        return realPosition < arrayList.size() && arrayList.get(realPosition) != null;
    }

    public final boolean J() {
        g9 currentItemView;
        if (this.W0.get(this.i1 ? getRealPosition() - 1 : getRealPosition()) == null || (currentItemView = getCurrentItemView()) == null) {
            return false;
        }
        s5 m10 = currentItemView.getImageReceiver().m();
        return m10 == null || !m10.s();
    }

    public final void K() {
        this.p1 = null;
        int i10 = this.L0;
        org.telegram.messenger.zs.f(i10).n(this, org.telegram.messenger.zs.b0);
        org.telegram.messenger.zs.f(i10).n(this, org.telegram.messenger.zs.Y1);
        org.telegram.messenger.zs f7 = org.telegram.messenger.zs.f(i10);
        int i11 = org.telegram.messenger.zs.X1;
        f7.n(this, i11);
        org.telegram.messenger.zs.f(i10).n(this, i11);
        org.telegram.messenger.zs.f(i10).n(this, org.telegram.messenger.zs.c0);
        org.telegram.messenger.zs.f(i10).n(this, org.telegram.messenger.zs.e3);
        int childCount = getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (childAt instanceof g9) {
                g9 g9Var = (g9) childAt;
                if (g9Var.getImageReceiver().m0 != null) {
                    Drawable t10 = g9Var.getImageReceiver().t();
                    if (t10 instanceof s5) {
                        ((s5) t10).w(g9Var);
                    }
                }
            }
        }
    }

    public final void L() {
        x(this.D0.j(), false);
    }

    public final void M(long j10, boolean z10) {
        if (this.E0 == j10 && !z10) {
            L();
            return;
        }
        this.f1 = true;
        this.T0.clear();
        this.U0.clear();
        this.V0.clear();
        this.W0.clear();
        this.X0.clear();
        this.Y0.clear();
        this.a1.clear();
        this.b1.clear();
        this.D0.g();
        x(0, false);
        this.o1 = 0;
        this.K0 = null;
        this.P0 = null;
        this.E0 = j10;
        org.telegram.messenger.dp T0 = org.telegram.messenger.vp.r1(this.L0).T0(j10);
        this.S0 = T0;
        T0.h.getMessagesStorage().a.c(new org.telegram.messenger.bp(T0, 0));
    }

    public final void N(int i10, int i11) {
        this.m1 = i10;
        this.n1 = i11;
        tg0 tg0Var = this.D0;
        if (tg0Var != null) {
            for (int i12 = 0; i12 < tg0Var.c.size(); i12++) {
                if (((rg0) tg0Var.c.get(i12)).c != null) {
                    pg0 pg0Var = ((rg0) tg0Var.c.get(i12)).c;
                    int i13 = this.m1;
                    int i14 = this.n1;
                    pg0Var.t(i13, i13, i14, i14);
                }
            }
        }
    }

    public final void O(org.telegram.messenger.ic icVar, float f7) {
        if (icVar == null) {
            return;
        }
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.X0;
            if (i10 >= arrayList.size()) {
                break;
            }
            if (arrayList.get(i10) == icVar) {
                this.b1.set(i10, Float.valueOf(f7));
                SparseArray sparseArray = this.d1;
                if (sparseArray.get(i10) != null) {
                    ((RadialProgress2) sparseArray.get(i10)).p(true, f7);
                }
            } else {
                i10++;
            }
        }
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            getChildAt(i11).invalidate();
        }
    }

    @Override // org.telegram.messenger.us
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        org.telegram.messenger.dp dpVar;
        TLRPC.User user;
        ArrayList arrayList;
        org.telegram.messenger.ic icVar;
        int i12;
        boolean z10;
        boolean z11;
        int i13;
        ArrayList arrayList2;
        ArrayList arrayList3;
        org.telegram.messenger.ic icVar2;
        Integer num;
        ArrayList<TLRPC.PhotoSize> arrayList4;
        boolean z12;
        TLRPC.User user2;
        boolean z13;
        int i14;
        boolean z14;
        TLRPC.Photo photo;
        Integer num2 = -1;
        int i15 = org.telegram.messenger.zs.e3;
        ArrayList arrayList5 = this.U0;
        ArrayList arrayList6 = this.T0;
        if (i10 != i15) {
            int i16 = org.telegram.messenger.zs.Y1;
            SparseArray sparseArray = this.d1;
            if (i10 == i16) {
                String str = (String) objArr[0];
                for (int i17 = 0; i17 < arrayList5.size(); i17++) {
                    String str2 = (String) arrayList6.get(i17);
                    if (str2 == null) {
                        str2 = (String) arrayList5.get(i17);
                    }
                    if (str2 != null && TextUtils.equals(str, str2)) {
                        RadialProgress2 radialProgress2 = (RadialProgress2) sparseArray.get(i17);
                        if (radialProgress2 != null) {
                            radialProgress2.p(true, 1.0f);
                        }
                        invalidate();
                    }
                }
                return;
            }
            if (i10 != org.telegram.messenger.zs.X1) {
                if (i10 == org.telegram.messenger.zs.c0 && this.c1 == 0 && (dpVar = this.S0) != null) {
                    dpVar.e();
                    org.telegram.messenger.dp dpVar2 = this.S0;
                    int currentItem = getCurrentItem();
                    tg0 tg0Var = this.D0;
                    dpVar2.b(currentItem - (tg0Var != null ? tg0Var.j() : 0), true);
                    return;
                }
                return;
            }
            String str3 = (String) objArr[0];
            for (int i18 = 0; i18 < arrayList5.size(); i18++) {
                String str4 = (String) arrayList6.get(i18);
                if (str4 == null) {
                    str4 = (String) arrayList5.get(i18);
                }
                if (str4 != null && TextUtils.equals(str3, str4)) {
                    RadialProgress2 radialProgress22 = (RadialProgress2) sparseArray.get(i18);
                    if (radialProgress22 != null) {
                        radialProgress22.p(true, Math.min(1.0f, ((Long) objArr[1]).longValue() / ((Long) objArr[2]).longValue()));
                    }
                    invalidate();
                }
            }
            return;
        }
        org.telegram.messenger.dp dpVar3 = (org.telegram.messenger.dp) objArr[0];
        if (this.S0 == dpVar3) {
            ArrayList arrayList7 = new ArrayList(dpVar3.b);
            if (arrayList7.isEmpty() && dpVar3.c) {
                return;
            }
            this.j1 = -1;
            this.k1 = -1;
            int i19 = this.L0;
            TLRPC.User Z1 = org.telegram.messenger.vp.r1(i19).Z1(Long.valueOf(this.E0));
            TLRPC.UserFull a2 = org.telegram.messenger.vp.r1(i19).a2(this.E0);
            if (a2 != null && (photo = a2.personal_photo) != null) {
                arrayList7.add(0, photo);
                this.j1 = 0;
            }
            if (Z1 != null && Z1.self && org.telegram.messenger.h20.q(a2)) {
                arrayList7.add(a2.fallback_photo);
                this.k1 = arrayList7.size() - 1;
            }
            arrayList5.clear();
            arrayList6.clear();
            ArrayList arrayList8 = this.X0;
            arrayList8.clear();
            ArrayList arrayList9 = this.W0;
            arrayList9.clear();
            ArrayList arrayList10 = this.Y0;
            arrayList10.clear();
            ArrayList arrayList11 = this.Z0;
            arrayList11.clear();
            ArrayList arrayList12 = this.V0;
            arrayList12.clear();
            ArrayList arrayList13 = this.a1;
            arrayList13.clear();
            ArrayList arrayList14 = this.b1;
            arrayList14.clear();
            if (org.telegram.messenger.o5.z(this.E0)) {
                TLRPC.Chat L0 = org.telegram.messenger.vp.r1(i19).L0(Long.valueOf(-this.E0));
                icVar = org.telegram.messenger.ic.m(i19, 0, L0);
                arrayList = arrayList8;
                if (icVar != null) {
                    arrayList.add(icVar);
                    user = Z1;
                    arrayList10.add(org.telegram.messenger.ic.m(i19, 1, L0));
                    arrayList11.add(null);
                    arrayList5.add(null);
                    TLRPC.ChatFull chatFull = this.F0;
                    if (chatFull == null || !org.telegram.messenger.b8.V(icVar.f, chatFull.chat_photo)) {
                        z14 = false;
                        arrayList12.add(null);
                        arrayList6.add(null);
                        arrayList9.add(null);
                    } else {
                        arrayList12.add(this.F0.chat_photo);
                        if (this.F0.chat_photo.video_sizes.isEmpty()) {
                            z14 = false;
                            arrayList9.add(null);
                            arrayList6.add(null);
                        } else {
                            TLRPC.VideoSize x10 = org.telegram.messenger.b8.x(1000, this.F0.chat_photo.video_sizes);
                            arrayList9.add(org.telegram.messenger.ic.j(x10, this.F0.chat_photo));
                            z14 = false;
                            arrayList6.add(org.telegram.messenger.b8.r(null, x10));
                        }
                    }
                    arrayList13.add(num2);
                    arrayList14.add(z14);
                } else {
                    user = Z1;
                }
            } else {
                user = Z1;
                arrayList = arrayList8;
                icVar = null;
            }
            int i20 = 0;
            while (true) {
                int size = arrayList7.size();
                i12 = i19;
                z10 = this.J0;
                if (i20 >= size) {
                    break;
                }
                TLRPC.Photo photo2 = (TLRPC.Photo) arrayList7.get(i20);
                if (photo2 == null || (photo2 instanceof TLRPC.TL_photoEmpty) || (arrayList4 = photo2.sizes) == null) {
                    i13 = i20;
                    arrayList2 = arrayList7;
                    arrayList3 = arrayList14;
                    icVar2 = icVar;
                    num = num2;
                    arrayList12.add(null);
                    arrayList.add(null);
                    arrayList10.add(null);
                    arrayList11.add(null);
                    arrayList5.add(null);
                    arrayList9.add(null);
                    arrayList6.add(null);
                    arrayList13.add(num);
                    arrayList3.add(null);
                } else {
                    i13 = i20;
                    arrayList2 = arrayList7;
                    ArrayList arrayList15 = arrayList14;
                    TLRPC.PhotoSize w9 = org.telegram.messenger.b8.w(arrayList4, 50, false, null, false);
                    int size2 = photo2.sizes.size();
                    int i21 = 0;
                    while (true) {
                        if (i21 >= size2) {
                            break;
                        }
                        TLRPC.PhotoSize photoSize = photo2.sizes.get(i21);
                        TLRPC.PhotoSize photoSize2 = w9;
                        if (photoSize instanceof TLRPC.TL_photoStrippedSize) {
                            w9 = photoSize;
                            break;
                        } else {
                            i21++;
                            w9 = photoSize2;
                        }
                    }
                    if (icVar != null) {
                        int size3 = photo2.sizes.size();
                        int i22 = 0;
                        while (i22 < size3) {
                            TLRPC.FileLocation fileLocation = photo2.sizes.get(i22).location;
                            int i23 = size3;
                            if (fileLocation != null) {
                                int i24 = fileLocation.local_id;
                                i14 = i22;
                                TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated = icVar.f;
                                icVar2 = icVar;
                                if (i24 == tL_fileLocationToBeDeprecated.local_id) {
                                    num = num2;
                                    if (fileLocation.volume_id == tL_fileLocationToBeDeprecated.volume_id) {
                                        arrayList12.set(0, photo2);
                                        if (!photo2.video_sizes.isEmpty()) {
                                            arrayList9.set(0, org.telegram.messenger.ic.j(org.telegram.messenger.b8.x(1000, photo2.video_sizes), photo2));
                                        }
                                        arrayList3 = arrayList15;
                                    } else {
                                        i22 = i14 + 1;
                                        num2 = num;
                                        size3 = i23;
                                        icVar = icVar2;
                                    }
                                }
                            } else {
                                i14 = i22;
                                icVar2 = icVar;
                            }
                            num = num2;
                            i22 = i14 + 1;
                            num2 = num;
                            size3 = i23;
                            icVar = icVar2;
                        }
                    }
                    icVar2 = icVar;
                    num = num2;
                    TLRPC.PhotoSize w10 = org.telegram.messenger.b8.w(photo2.sizes, 640, false, null, false);
                    if (w10 != null) {
                        int i25 = photo2.dc_id;
                        if (i25 != 0) {
                            TLRPC.FileLocation fileLocation2 = w10.location;
                            fileLocation2.dc_id = i25;
                            fileLocation2.file_reference = photo2.file_reference;
                        }
                        org.telegram.messenger.ic i26 = org.telegram.messenger.ic.i(w10, photo2);
                        if (i26 != null) {
                            org.telegram.messenger.ic icVar3 = this.P0;
                            if (icVar3 == null || icVar3.s != i26.s || z10 || this.E0 == org.telegram.messenger.d20.i(i12).e()) {
                                TLRPC.User user3 = user;
                                arrayList.add(i26);
                                arrayList5.add(org.telegram.messenger.b8.r(null, w9 instanceof TLRPC.TL_photoStrippedSize ? w10 : w9));
                                arrayList10.add(org.telegram.messenger.ic.i(w9, photo2));
                                if (photo2.video_sizes.isEmpty()) {
                                    user = user3;
                                    z12 = false;
                                    arrayList9.add(null);
                                    arrayList6.add(null);
                                    arrayList11.add(null);
                                } else {
                                    TLRPC.VideoSize x11 = org.telegram.messenger.b8.x(1000, photo2.video_sizes);
                                    TLRPC.VideoSize S = org.telegram.messenger.b8.S(photo2);
                                    if (S != null) {
                                        user = user3;
                                        arrayList11.add(new g61(S, user3 != null && user3.premium, 2));
                                        z12 = false;
                                        arrayList9.add(null);
                                        arrayList6.add(null);
                                    } else {
                                        user = user3;
                                        z12 = false;
                                        arrayList11.add(null);
                                        arrayList9.add(org.telegram.messenger.ic.j(x11, photo2));
                                        arrayList6.add(org.telegram.messenger.b8.r(null, x11));
                                    }
                                }
                                arrayList12.add(photo2);
                                arrayList13.add(Integer.valueOf(w10.size));
                                arrayList3 = arrayList15;
                                arrayList3.add(z12);
                            } else {
                                arrayList5.add(null);
                                arrayList.add(this.P0);
                                org.telegram.messenger.ic icVar4 = this.Q0;
                                if (icVar4 == null) {
                                    icVar4 = org.telegram.messenger.ic.i(w9, photo2);
                                }
                                arrayList10.add(icVar4);
                                if (photo2.video_sizes.isEmpty()) {
                                    user2 = user;
                                    z13 = false;
                                    arrayList11.add(this.R0);
                                    arrayList9.add(null);
                                    arrayList6.add(null);
                                } else {
                                    TLRPC.VideoSize x12 = org.telegram.messenger.b8.x(1000, photo2.video_sizes);
                                    TLRPC.VideoSize S2 = org.telegram.messenger.b8.S(photo2);
                                    if (S2 != null) {
                                        user2 = user;
                                        arrayList11.add(new g61(S2, user != null && user2.premium, 2));
                                        z13 = false;
                                        arrayList9.add(null);
                                        arrayList6.add(null);
                                    } else {
                                        user2 = user;
                                        z13 = false;
                                        arrayList11.add(null);
                                        arrayList9.add(org.telegram.messenger.ic.j(x12, photo2));
                                        arrayList6.add(org.telegram.messenger.b8.r(null, x12));
                                    }
                                }
                                arrayList12.add(z13);
                                arrayList13.add(num);
                                arrayList3 = arrayList15;
                                arrayList3.add(z13);
                                user = user2;
                            }
                        }
                    }
                    arrayList3 = arrayList15;
                }
                i20 = i13 + 1;
                arrayList14 = arrayList3;
                num2 = num;
                i19 = i12;
                arrayList7 = arrayList2;
                icVar = icVar2;
            }
            int size4 = arrayList10.size();
            if (size4 > 1) {
                int i27 = 0;
                while (true) {
                    if (i27 >= (size4 > 2 ? 2 : 1)) {
                        break;
                    }
                    org.telegram.messenger.b8.G(i12).W((org.telegram.messenger.ic) arrayList10.get(i27 == 0 ? 1 : size4 - 1), null, null, 0, 1);
                    i27++;
                }
            }
            getAdapter().g();
            if (z10) {
                if (!this.H0 || this.f1) {
                    L();
                }
            } else if (!this.H0 || this.f1) {
                L();
                getAdapter().g();
                B(0.0f, getRealPosition());
            }
            if (this.k1 >= 0 || this.j1 >= 0) {
                z11 = false;
            } else {
                z11 = false;
                B(0.0f, 0);
            }
            this.f1 = z11;
            qg0 qg0Var = this.G0;
            if (qg0Var != null) {
                qg0Var.c();
            }
            org.telegram.messenger.ic icVar5 = this.q1;
            if (icVar5 != null) {
                A(icVar5, this.r1);
            }
        }
    }

    public mg0 getBlurDrawer() {
        return this.p1;
    }

    public float getCurrentItemProgress() {
        s5 m10;
        g9 currentItemView = getCurrentItemView();
        if (currentItemView == null || (m10 = currentItemView.getImageReceiver().m()) == null) {
            return 0.0f;
        }
        return m10.n();
    }

    public g9 getCurrentItemView() {
        tg0 tg0Var = this.D0;
        if (tg0Var == null || tg0Var.c.isEmpty()) {
            return null;
        }
        return ((rg0) tg0Var.c.get(getCurrentItem())).c;
    }

    public long getDialogId() {
        return this.E0;
    }

    public int getRealCount() {
        int size = this.V0.size();
        return this.i1 ? size + 1 : size;
    }

    public int getRealPosition() {
        return this.D0.k(getCurrentItem());
    }

    @Override // z4.g, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.C0.getScrollState() != 0) {
            return false;
        }
        if (getParent() != null && getParent().getParent() != null) {
            getParent().getParent().requestDisallowInterceptTouchEvent(canScrollHorizontally(-1));
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // z4.g, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        mg0 mg0Var = this.p1;
        if (mg0Var != null) {
            mg0Var.setTranslationY(getHeight() - this.p1.getMeasuredHeight());
        }
    }

    @Override // z4.g, android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        mg0 mg0Var = this.p1;
        if (mg0Var != null) {
            mg0Var.G = true;
            mg0Var.postInvalidateOnAnimation();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:99:0x016f, code lost:
    
        if (r0 > r5) goto L88;
     */
    @Override // z4.g, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int i10;
        tg0 tg0Var = this.D0;
        if (tg0Var != null) {
            tk0 tk0Var = this.C0;
            if (tk0Var.getScrollState() != 0 && !this.A0 && this.B0) {
                this.B0 = false;
                MotionEvent obtain = MotionEvent.obtain(motionEvent);
                obtain.setAction(3);
                super.onTouchEvent(obtain);
                obtain.recycle();
                return false;
            }
            int action = motionEvent.getAction();
            org.telegram.ui.qs0 qs0Var = this.h1;
            qg0 qg0Var = this.G0;
            if (qs0Var != null && getCurrentItemView() != null) {
                if (action != 0 && this.I0) {
                    org.telegram.ui.qs0 qs0Var2 = this.h1;
                    if (!qs0Var2.n) {
                        qs0Var2.a(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0), this, getCurrentItemView().getImageReceiver(), null, 0);
                    }
                }
                if (this.h1.a(motionEvent, this, getCurrentItemView().getImageReceiver(), null, 0)) {
                    if (!this.I0) {
                        this.I0 = true;
                        if (qg0Var != null) {
                            qg0Var.a();
                        }
                    }
                    return true;
                }
            }
            PointF pointF = this.x0;
            if (action == 0) {
                this.A0 = true;
                this.B0 = true;
                this.H0 = true;
                pointF.set(motionEvent.getX(), motionEvent.getY());
                if (tg0Var.c.size() > 1 && qg0Var != null) {
                    qg0Var.b(motionEvent.getX() < ((float) getWidth()) / 3.0f);
                }
                this.I0 = false;
            } else if (action == 1) {
                if (!this.I0) {
                    int realCount = getRealCount();
                    int currentItem = getCurrentItem();
                    if (realCount > 1) {
                        if (motionEvent.getX() > getWidth() / 3.0f) {
                            i10 = tg0Var.j();
                            int i11 = currentItem + 1;
                            if (i11 < realCount + i10) {
                                i10 = i11;
                            }
                        } else {
                            int i12 = (-1) + currentItem;
                            i10 = i12 < tg0Var.j() ? (realCount + r0) - 1 : i12;
                        }
                        if (qg0Var != null) {
                            qg0Var.a();
                        }
                        x(i10, false);
                    }
                }
            } else if (action == 2) {
                float x10 = motionEvent.getX() - pointF.x;
                float y3 = motionEvent.getY() - pointF.y;
                float abs = Math.abs(y3);
                float f7 = this.y0;
                boolean z10 = abs >= f7 || Math.abs(x10) >= f7;
                if (z10) {
                    this.I0 = true;
                    if (qg0Var != null) {
                        qg0Var.a();
                    }
                }
                boolean z11 = this.B0;
                if (z11 && this.A0) {
                    if (z10) {
                        if (Math.abs(y3) > Math.abs(x10)) {
                            this.B0 = false;
                            MotionEvent obtain2 = MotionEvent.obtain(motionEvent);
                            obtain2.setAction(3);
                            super.onTouchEvent(obtain2);
                            obtain2.recycle();
                        } else {
                            this.A0 = false;
                            MotionEvent obtain3 = MotionEvent.obtain(motionEvent);
                            obtain3.setAction(3);
                            tk0Var.onTouchEvent(obtain3);
                            obtain3.recycle();
                        }
                    }
                } else if (z11) {
                    if (!canScrollHorizontally(-1)) {
                    }
                }
            }
            boolean onTouchEvent = this.A0 ? tk0Var.onTouchEvent(motionEvent) : false;
            if (this.B0) {
                try {
                    onTouchEvent |= super.onTouchEvent(motionEvent);
                } catch (Exception e) {
                    org.telegram.messenger.f8.g(e, true);
                }
            }
            if (action == 1 || action == 3) {
                this.A0 = false;
                this.B0 = false;
            }
            return onTouchEvent;
        }
        return false;
    }

    @Override // android.view.View
    public void setAlpha(float f7) {
        super.setAlpha(f7);
        mg0 mg0Var = this.p1;
        if (mg0Var != null) {
            mg0Var.setAlpha(f7);
        }
    }

    public void setAnimatedFileMaybe(s5 s5Var) {
        tg0 tg0Var;
        if (s5Var == null || (tg0Var = this.D0) == null) {
            return;
        }
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if ((childAt instanceof g9) && tg0Var.k(tg0Var.d.indexOf(childAt)) == 0) {
                g9 g9Var = (g9) childAt;
                s5 m10 = g9Var.getImageReceiver().m();
                if (m10 != s5Var) {
                    if (m10 != null) {
                        m10.w(g9Var);
                    }
                    g9Var.setImageDrawable(s5Var);
                    s5Var.f(this);
                    s5Var.R = true;
                }
            }
        }
    }

    public void setChatInfo(TLRPC.ChatFull chatFull) {
        this.F0 = chatFull;
        ArrayList arrayList = this.V0;
        if (arrayList.isEmpty() || arrayList.get(0) != null || this.F0 == null) {
            return;
        }
        ArrayList arrayList2 = this.X0;
        if (arrayList2.get(0) == null || !org.telegram.messenger.b8.V(((org.telegram.messenger.ic) arrayList2.get(0)).f, this.F0.chat_photo)) {
            return;
        }
        arrayList.set(0, this.F0.chat_photo);
        boolean isEmpty = this.F0.chat_photo.video_sizes.isEmpty();
        ArrayList arrayList3 = this.T0;
        ArrayList arrayList4 = this.W0;
        if (isEmpty) {
            arrayList4.set(0, null);
            arrayList3.add(0, null);
        } else {
            TLRPC.VideoSize x10 = org.telegram.messenger.b8.x(1000, this.F0.chat_photo.video_sizes);
            arrayList4.set(0, org.telegram.messenger.ic.j(x10, this.F0.chat_photo));
            arrayList3.set(0, org.telegram.messenger.b8.r(null, x10));
            qg0 qg0Var = this.G0;
            if (qg0Var != null) {
                qg0Var.c();
            }
        }
        this.b1.set(0, null);
        this.D0.g();
    }

    public void setCreateThumbFromParent(boolean z10) {
        this.e1 = z10;
    }

    public void setData(long j10) {
        M(j10, false);
    }

    public void setHasActiveVideo(boolean z10) {
        this.i1 = z10;
    }

    public void setImagesLayerNum(int i10) {
        this.l1 = i10;
    }

    public void setInvalidateWithParent(boolean z10) {
        this.g1 = z10;
    }

    public void setParentAvatarImage(g9 g9Var) {
        tg0 tg0Var = this.D0;
        if (tg0Var != null) {
            tg0Var.g = g9Var;
        }
    }

    public void setPinchToZoomHelper(org.telegram.ui.qs0 qs0Var) {
        this.h1 = qs0Var;
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        mg0 mg0Var = this.p1;
        if (mg0Var != null) {
            mg0Var.setVisibility(i10);
        }
    }

    public void setCustomAvatarProgress(float f7) {
    }

    public ug0(Context context, long j10, org.telegram.ui.ActionBar.l lVar, tk0 tk0Var, org.telegram.ui.jx0 jx0Var, qg0 qg0Var, mg0 mg0Var) {
        super(context);
        this.x0 = new PointF();
        this.A0 = true;
        this.B0 = true;
        int i10 = org.telegram.messenger.d20.s0;
        this.L0 = i10;
        this.M0 = new Path();
        this.N0 = new RectF();
        this.O0 = new float[8];
        this.T0 = new ArrayList();
        this.U0 = new ArrayList();
        this.V0 = new ArrayList();
        this.W0 = new ArrayList();
        this.X0 = new ArrayList();
        this.Y0 = new ArrayList();
        this.Z0 = new ArrayList();
        this.a1 = new ArrayList();
        this.b1 = new ArrayList();
        this.d1 = new SparseArray();
        this.e1 = true;
        this.j1 = -1;
        this.k1 = -1;
        this.p1 = mg0Var;
        setPadding(0, 0, 0, mg0Var == null ? 0 : mg0Var.n);
        if (mg0Var != null) {
            mg0Var.setView(this);
        }
        setVisibility(8);
        setOverScrollMode(2);
        setOffscreenPageLimit(2);
        this.J0 = true;
        this.E0 = j10;
        this.C0 = tk0Var;
        this.z0 = lVar;
        tg0 tg0Var = new tg0(this, getContext(), jx0Var);
        this.D0 = tg0Var;
        setAdapter((mp) tg0Var);
        this.y0 = ViewConfiguration.get(context).getScaledTouchSlop();
        this.G0 = qg0Var;
        b(new og0((org.telegram.ui.kw0) this));
        org.telegram.messenger.zs.f(i10).c(this, org.telegram.messenger.zs.b0);
        org.telegram.messenger.zs.f(i10).c(this, org.telegram.messenger.zs.Y1);
        org.telegram.messenger.zs.f(i10).c(this, org.telegram.messenger.zs.X1);
        org.telegram.messenger.zs.f(i10).c(this, org.telegram.messenger.zs.c0);
        org.telegram.messenger.zs.f(i10).c(this, org.telegram.messenger.zs.e3);
        org.telegram.messenger.dp T0 = org.telegram.messenger.vp.r1(i10).T0(j10);
        this.S0 = T0;
        T0.h.getMessagesStorage().a.c(new org.telegram.messenger.bp(T0, 0));
    }
}
