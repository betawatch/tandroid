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

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public class sf0 extends fp implements org.telegram.messenger.ls {
    public boolean A0;
    public boolean B0;
    public final pj0 C0;
    public final rf0 D0;
    public long E0;
    public TLRPC.ChatFull F0;
    public final of0 G0;
    public boolean H0;
    public boolean I0;
    public final boolean J0;
    public org.telegram.messenger.hc K0;
    public final int L0;
    public final Path M0;
    public final RectF N0;
    public final float[] O0;
    public org.telegram.messenger.hc P0;
    public org.telegram.messenger.hc Q0;
    public d51 R0;
    public org.telegram.messenger.yo S0;
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
    public org.telegram.ui.fr0 h1;
    public boolean i1;
    public int j1;
    public int k1;
    public int l1;
    public int m1;
    public int n1;
    public int o1;
    public kf0 p1;
    public org.telegram.messenger.hc q1;
    public org.telegram.messenger.hc r1;
    public final PointF x0;
    public final int y0;
    public final org.telegram.ui.ActionBar.k z0;

    public sf0(Context context, org.telegram.ui.ActionBar.k kVar, pj0 pj0Var, org.telegram.ui.q4 q4Var) {
        super(context);
        this.x0 = new PointF();
        this.A0 = true;
        this.B0 = true;
        int i7 = org.telegram.messenger.p10.s0;
        this.L0 = i7;
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
        this.C0 = pj0Var;
        ConnectionsManager.generateClassGuid();
        this.z0 = kVar;
        this.y0 = ViewConfiguration.get(context).getScaledTouchSlop();
        this.G0 = q4Var;
        b(new lf0(this));
        rf0 rf0Var = new rf0(this, getContext(), null);
        this.D0 = rf0Var;
        setAdapter((ep) rf0Var);
        org.telegram.messenger.qs.f(i7).c(this, org.telegram.messenger.qs.b0);
        org.telegram.messenger.qs.f(i7).c(this, org.telegram.messenger.qs.Y1);
        org.telegram.messenger.qs.f(i7).c(this, org.telegram.messenger.qs.X1);
        org.telegram.messenger.qs.f(i7).c(this, org.telegram.messenger.qs.c0);
        org.telegram.messenger.qs.f(i7).c(this, org.telegram.messenger.qs.e3);
        this.S0 = null;
    }

    public final void A(org.telegram.messenger.hc hcVar, org.telegram.messenger.hc hcVar2) {
        this.P0 = hcVar;
        this.U0.add(0, null);
        this.T0.add(0, null);
        this.X0.add(0, hcVar);
        this.Y0.add(0, hcVar2);
        this.Z0.add(0, null);
        this.W0.add(0, null);
        this.V0.add(0, null);
        this.a1.add(0, -1);
        this.b1.add(0, Float.valueOf(0.0f));
        this.D0.g();
        L();
        this.q1 = hcVar;
        this.r1 = hcVar2;
    }

    public final void B(float f10, int i7) {
        int i10 = this.j1;
        float f11 = 0.0f;
        if (i10 >= 0 || this.k1 >= 0) {
            if (i10 < 0) {
                i10 = this.k1;
            }
            int k10 = this.D0.k(i7);
            if (this.i1) {
                k10--;
            }
            float f12 = k10 == i10 ? 1.0f - f10 : (getRealCount() <= 0 || (k10 + (-1)) % getRealCount() != i10) ? (getRealCount() <= 0 || (k10 + 1) % getRealCount() != i10) ? 0.0f : (1.0f - f10) + 1.0f : (1.0f - f10) - 1.0f;
            if (f12 > 1.0f) {
                f12 = 2.0f - f12;
            }
            f11 = Utilities.i(f12, 1.0f, 0.0f);
        }
        setCustomAvatarProgress(f11);
    }

    public final org.telegram.messenger.hc C(org.telegram.messenger.hc hcVar, org.telegram.messenger.hc hcVar2) {
        TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated;
        if (hcVar == null) {
            return null;
        }
        int i7 = 0;
        while (i7 < 2) {
            ArrayList arrayList = i7 == 0 ? this.Y0 : this.X0;
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                org.telegram.messenger.hc hcVar3 = (org.telegram.messenger.hc) arrayList.get(i10);
                if (hcVar3 != null && (tL_fileLocationToBeDeprecated = hcVar3.f) != null) {
                    int i11 = hcVar3.a;
                    if (i11 == hcVar.a) {
                        int i12 = tL_fileLocationToBeDeprecated.local_id;
                        TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated2 = hcVar.f;
                        if (i12 == tL_fileLocationToBeDeprecated2.local_id && tL_fileLocationToBeDeprecated.volume_id == tL_fileLocationToBeDeprecated2.volume_id) {
                            return (org.telegram.messenger.hc) this.W0.get(i10);
                        }
                    }
                    if (i11 == hcVar2.a) {
                        int i13 = tL_fileLocationToBeDeprecated.local_id;
                        TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated3 = hcVar2.f;
                        if (i13 == tL_fileLocationToBeDeprecated3.local_id && tL_fileLocationToBeDeprecated.volume_id == tL_fileLocationToBeDeprecated3.volume_id) {
                            return (org.telegram.messenger.hc) this.W0.get(i10);
                        }
                    } else {
                        continue;
                    }
                }
            }
            i7++;
        }
        return null;
    }

    public final org.telegram.messenger.hc D(int i7) {
        if (i7 < 0) {
            return null;
        }
        ArrayList arrayList = this.X0;
        if (i7 >= arrayList.size()) {
            return null;
        }
        org.telegram.messenger.hc hcVar = (org.telegram.messenger.hc) this.W0.get(i7);
        return hcVar != null ? hcVar : (org.telegram.messenger.hc) arrayList.get(i7);
    }

    public final View E(int i7) {
        rf0 rf0Var = this.D0;
        if (rf0Var == null) {
            return null;
        }
        ArrayList arrayList = rf0Var.c;
        if (arrayList.size() <= i7 || i7 < 0) {
            return null;
        }
        pf0 pf0Var = (pf0) arrayList.get(i7);
        qf0 qf0Var = pf0Var.b;
        return qf0Var == null ? pf0Var.c : qf0Var;
    }

    public final TLRPC.Photo F(int i7) {
        if (i7 < 0) {
            return null;
        }
        ArrayList arrayList = this.V0;
        if (i7 >= arrayList.size()) {
            return null;
        }
        return (TLRPC.Photo) arrayList.get(i7);
    }

    public final org.telegram.messenger.hc G(int i7) {
        if (i7 < 0) {
            return null;
        }
        ArrayList arrayList = this.X0;
        if (i7 >= arrayList.size()) {
            return null;
        }
        return (org.telegram.messenger.hc) arrayList.get(i7);
    }

    public final boolean H(d51 d51Var, org.telegram.messenger.hc hcVar, org.telegram.messenger.hc hcVar2, boolean z9) {
        org.telegram.messenger.yo yoVar;
        org.telegram.messenger.yo yoVar2;
        if (hcVar != null && hcVar2 != null && this.c1 == 0) {
            org.telegram.messenger.hc hcVar3 = this.P0;
            ArrayList arrayList = this.X0;
            if (hcVar3 == null || hcVar3.f.local_id != hcVar.f.local_id) {
                boolean isEmpty = arrayList.isEmpty();
                rf0 rf0Var = this.D0;
                if (!isEmpty) {
                    this.P0 = hcVar;
                    if (z9 && (yoVar2 = this.S0) != null) {
                        yoVar2.f();
                        this.S0.b(getCurrentItem() - (rf0Var != null ? rf0Var.j() : 0), true);
                    }
                    return true;
                }
                if (z9 && (yoVar = this.S0) != null) {
                    yoVar.f();
                    this.S0.b(getCurrentItem() - (rf0Var != null ? rf0Var.j() : 0), true);
                }
            }
            if (arrayList.isEmpty()) {
                this.P0 = hcVar;
                this.Q0 = hcVar2;
                this.R0 = d51Var;
                this.U0.add(null);
                this.T0.add(null);
                arrayList.add(hcVar);
                this.Y0.add(hcVar2);
                this.Z0.add(d51Var);
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
        l9 currentItemView;
        if (this.W0.get(this.i1 ? getRealPosition() - 1 : getRealPosition()) == null || (currentItemView = getCurrentItemView()) == null) {
            return false;
        }
        v5 m10 = currentItemView.getImageReceiver().m();
        return m10 == null || !m10.s();
    }

    public final void K() {
        this.p1 = null;
        int i7 = this.L0;
        org.telegram.messenger.qs.f(i7).n(this, org.telegram.messenger.qs.b0);
        org.telegram.messenger.qs.f(i7).n(this, org.telegram.messenger.qs.Y1);
        org.telegram.messenger.qs f10 = org.telegram.messenger.qs.f(i7);
        int i10 = org.telegram.messenger.qs.X1;
        f10.n(this, i10);
        org.telegram.messenger.qs.f(i7).n(this, i10);
        org.telegram.messenger.qs.f(i7).n(this, org.telegram.messenger.qs.c0);
        org.telegram.messenger.qs.f(i7).n(this, org.telegram.messenger.qs.e3);
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (childAt instanceof l9) {
                l9 l9Var = (l9) childAt;
                if (l9Var.getImageReceiver().m0 != null) {
                    Drawable t6 = l9Var.getImageReceiver().t();
                    if (t6 instanceof v5) {
                        ((v5) t6).w(l9Var);
                    }
                }
            }
        }
    }

    public final void L() {
        x(this.D0.j(), false);
    }

    public final void M(long j3, boolean z9) {
        if (this.E0 == j3 && !z9) {
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
        this.E0 = j3;
        org.telegram.messenger.yo U0 = org.telegram.messenger.qp.s1(this.L0).U0(j3);
        this.S0 = U0;
        U0.h.getMessagesStorage().a.c(new org.telegram.messenger.wo(U0, 0));
    }

    public final void N(int i7, int i10) {
        this.m1 = i7;
        this.n1 = i10;
        rf0 rf0Var = this.D0;
        if (rf0Var != null) {
            for (int i11 = 0; i11 < rf0Var.c.size(); i11++) {
                if (((pf0) rf0Var.c.get(i11)).c != null) {
                    nf0 nf0Var = ((pf0) rf0Var.c.get(i11)).c;
                    int i12 = this.m1;
                    int i13 = this.n1;
                    nf0Var.t(i12, i12, i13, i13);
                }
            }
        }
    }

    public final void O(org.telegram.messenger.hc hcVar, float f10) {
        if (hcVar == null) {
            return;
        }
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.X0;
            if (i7 >= arrayList.size()) {
                break;
            }
            if (arrayList.get(i7) == hcVar) {
                this.b1.set(i7, Float.valueOf(f10));
                SparseArray sparseArray = this.d1;
                if (sparseArray.get(i7) != null) {
                    ((RadialProgress2) sparseArray.get(i7)).p(true, f10);
                }
            } else {
                i7++;
            }
        }
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            getChildAt(i10).invalidate();
        }
    }

    @Override // org.telegram.messenger.ls
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        org.telegram.messenger.yo yoVar;
        TLRPC.User user;
        ArrayList arrayList;
        org.telegram.messenger.hc hcVar;
        int i11;
        boolean z9;
        boolean z10;
        int i12;
        ArrayList arrayList2;
        ArrayList arrayList3;
        org.telegram.messenger.hc hcVar2;
        Integer num;
        ArrayList<TLRPC.PhotoSize> arrayList4;
        boolean z11;
        TLRPC.User user2;
        boolean z12;
        int i13;
        boolean z13;
        TLRPC.Photo photo;
        Integer num2 = -1;
        int i14 = org.telegram.messenger.qs.e3;
        ArrayList arrayList5 = this.U0;
        ArrayList arrayList6 = this.T0;
        if (i7 != i14) {
            int i15 = org.telegram.messenger.qs.Y1;
            SparseArray sparseArray = this.d1;
            if (i7 == i15) {
                String str = (String) objArr[0];
                for (int i16 = 0; i16 < arrayList5.size(); i16++) {
                    String str2 = (String) arrayList6.get(i16);
                    if (str2 == null) {
                        str2 = (String) arrayList5.get(i16);
                    }
                    if (str2 != null && TextUtils.equals(str, str2)) {
                        RadialProgress2 radialProgress2 = (RadialProgress2) sparseArray.get(i16);
                        if (radialProgress2 != null) {
                            radialProgress2.p(true, 1.0f);
                        }
                        invalidate();
                    }
                }
                return;
            }
            if (i7 != org.telegram.messenger.qs.X1) {
                if (i7 == org.telegram.messenger.qs.c0 && this.c1 == 0 && (yoVar = this.S0) != null) {
                    yoVar.f();
                    org.telegram.messenger.yo yoVar2 = this.S0;
                    int currentItem = getCurrentItem();
                    rf0 rf0Var = this.D0;
                    yoVar2.b(currentItem - (rf0Var != null ? rf0Var.j() : 0), true);
                    return;
                }
                return;
            }
            String str3 = (String) objArr[0];
            for (int i17 = 0; i17 < arrayList5.size(); i17++) {
                String str4 = (String) arrayList6.get(i17);
                if (str4 == null) {
                    str4 = (String) arrayList5.get(i17);
                }
                if (str4 != null && TextUtils.equals(str3, str4)) {
                    RadialProgress2 radialProgress22 = (RadialProgress2) sparseArray.get(i17);
                    if (radialProgress22 != null) {
                        radialProgress22.p(true, Math.min(1.0f, ((Long) objArr[1]).longValue() / ((Long) objArr[2]).longValue()));
                    }
                    invalidate();
                }
            }
            return;
        }
        org.telegram.messenger.yo yoVar3 = (org.telegram.messenger.yo) objArr[0];
        if (this.S0 == yoVar3) {
            ArrayList arrayList7 = new ArrayList(yoVar3.b);
            if (arrayList7.isEmpty() && yoVar3.c) {
                return;
            }
            this.j1 = -1;
            this.k1 = -1;
            int i18 = this.L0;
            TLRPC.User a22 = org.telegram.messenger.qp.s1(i18).a2(Long.valueOf(this.E0));
            TLRPC.UserFull b22 = org.telegram.messenger.qp.s1(i18).b2(this.E0);
            if (b22 != null && (photo = b22.personal_photo) != null) {
                arrayList7.add(0, photo);
                this.j1 = 0;
            }
            if (a22 != null && a22.self && org.telegram.messenger.t10.q(b22)) {
                arrayList7.add(b22.fallback_photo);
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
            if (org.telegram.messenger.m5.z(this.E0)) {
                TLRPC.Chat M0 = org.telegram.messenger.qp.s1(i18).M0(Long.valueOf(-this.E0));
                hcVar = org.telegram.messenger.hc.m(i18, 0, M0);
                arrayList = arrayList8;
                if (hcVar != null) {
                    arrayList.add(hcVar);
                    user = a22;
                    arrayList10.add(org.telegram.messenger.hc.m(i18, 1, M0));
                    arrayList11.add(null);
                    arrayList5.add(null);
                    TLRPC.ChatFull chatFull = this.F0;
                    if (chatFull == null || !org.telegram.messenger.w7.U(hcVar.f, chatFull.chat_photo)) {
                        z13 = false;
                        arrayList12.add(null);
                        arrayList6.add(null);
                        arrayList9.add(null);
                    } else {
                        arrayList12.add(this.F0.chat_photo);
                        if (this.F0.chat_photo.video_sizes.isEmpty()) {
                            z13 = false;
                            arrayList9.add(null);
                            arrayList6.add(null);
                        } else {
                            TLRPC.VideoSize x10 = org.telegram.messenger.w7.x(1000, this.F0.chat_photo.video_sizes);
                            arrayList9.add(org.telegram.messenger.hc.j(x10, this.F0.chat_photo));
                            z13 = false;
                            arrayList6.add(org.telegram.messenger.w7.r(null, x10));
                        }
                    }
                    arrayList13.add(num2);
                    arrayList14.add(z13);
                } else {
                    user = a22;
                }
            } else {
                user = a22;
                arrayList = arrayList8;
                hcVar = null;
            }
            int i19 = 0;
            while (true) {
                int size = arrayList7.size();
                i11 = i18;
                z9 = this.J0;
                if (i19 >= size) {
                    break;
                }
                TLRPC.Photo photo2 = (TLRPC.Photo) arrayList7.get(i19);
                if (photo2 == null || (photo2 instanceof TLRPC.TL_photoEmpty) || (arrayList4 = photo2.sizes) == null) {
                    i12 = i19;
                    arrayList2 = arrayList7;
                    arrayList3 = arrayList14;
                    hcVar2 = hcVar;
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
                    i12 = i19;
                    arrayList2 = arrayList7;
                    ArrayList arrayList15 = arrayList14;
                    TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(arrayList4, 50, false, null, false);
                    int size2 = photo2.sizes.size();
                    int i20 = 0;
                    while (true) {
                        if (i20 >= size2) {
                            break;
                        }
                        TLRPC.PhotoSize photoSize = photo2.sizes.get(i20);
                        TLRPC.PhotoSize photoSize2 = w10;
                        if (photoSize instanceof TLRPC.TL_photoStrippedSize) {
                            w10 = photoSize;
                            break;
                        } else {
                            i20++;
                            w10 = photoSize2;
                        }
                    }
                    if (hcVar != null) {
                        int size3 = photo2.sizes.size();
                        int i21 = 0;
                        while (i21 < size3) {
                            TLRPC.FileLocation fileLocation = photo2.sizes.get(i21).location;
                            int i22 = size3;
                            if (fileLocation != null) {
                                int i23 = fileLocation.local_id;
                                i13 = i21;
                                TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated = hcVar.f;
                                hcVar2 = hcVar;
                                if (i23 == tL_fileLocationToBeDeprecated.local_id) {
                                    num = num2;
                                    if (fileLocation.volume_id == tL_fileLocationToBeDeprecated.volume_id) {
                                        arrayList12.set(0, photo2);
                                        if (!photo2.video_sizes.isEmpty()) {
                                            arrayList9.set(0, org.telegram.messenger.hc.j(org.telegram.messenger.w7.x(1000, photo2.video_sizes), photo2));
                                        }
                                        arrayList3 = arrayList15;
                                    } else {
                                        i21 = i13 + 1;
                                        num2 = num;
                                        size3 = i22;
                                        hcVar = hcVar2;
                                    }
                                }
                            } else {
                                i13 = i21;
                                hcVar2 = hcVar;
                            }
                            num = num2;
                            i21 = i13 + 1;
                            num2 = num;
                            size3 = i22;
                            hcVar = hcVar2;
                        }
                    }
                    hcVar2 = hcVar;
                    num = num2;
                    TLRPC.PhotoSize w11 = org.telegram.messenger.w7.w(photo2.sizes, 640, false, null, false);
                    if (w11 != null) {
                        int i24 = photo2.dc_id;
                        if (i24 != 0) {
                            TLRPC.FileLocation fileLocation2 = w11.location;
                            fileLocation2.dc_id = i24;
                            fileLocation2.file_reference = photo2.file_reference;
                        }
                        org.telegram.messenger.hc i25 = org.telegram.messenger.hc.i(w11, photo2);
                        if (i25 != null) {
                            org.telegram.messenger.hc hcVar3 = this.P0;
                            if (hcVar3 == null || hcVar3.s != i25.s || z9 || this.E0 == org.telegram.messenger.p10.i(i11).e()) {
                                TLRPC.User user3 = user;
                                arrayList.add(i25);
                                arrayList5.add(org.telegram.messenger.w7.r(null, w10 instanceof TLRPC.TL_photoStrippedSize ? w11 : w10));
                                arrayList10.add(org.telegram.messenger.hc.i(w10, photo2));
                                if (photo2.video_sizes.isEmpty()) {
                                    user = user3;
                                    z11 = false;
                                    arrayList9.add(null);
                                    arrayList6.add(null);
                                    arrayList11.add(null);
                                } else {
                                    TLRPC.VideoSize x11 = org.telegram.messenger.w7.x(1000, photo2.video_sizes);
                                    TLRPC.VideoSize R = org.telegram.messenger.w7.R(photo2);
                                    if (R != null) {
                                        user = user3;
                                        arrayList11.add(new d51(R, user3 != null && user3.premium, 2));
                                        z11 = false;
                                        arrayList9.add(null);
                                        arrayList6.add(null);
                                    } else {
                                        user = user3;
                                        z11 = false;
                                        arrayList11.add(null);
                                        arrayList9.add(org.telegram.messenger.hc.j(x11, photo2));
                                        arrayList6.add(org.telegram.messenger.w7.r(null, x11));
                                    }
                                }
                                arrayList12.add(photo2);
                                arrayList13.add(Integer.valueOf(w11.size));
                                arrayList3 = arrayList15;
                                arrayList3.add(z11);
                            } else {
                                arrayList5.add(null);
                                arrayList.add(this.P0);
                                org.telegram.messenger.hc hcVar4 = this.Q0;
                                if (hcVar4 == null) {
                                    hcVar4 = org.telegram.messenger.hc.i(w10, photo2);
                                }
                                arrayList10.add(hcVar4);
                                if (photo2.video_sizes.isEmpty()) {
                                    user2 = user;
                                    z12 = false;
                                    arrayList11.add(this.R0);
                                    arrayList9.add(null);
                                    arrayList6.add(null);
                                } else {
                                    TLRPC.VideoSize x12 = org.telegram.messenger.w7.x(1000, photo2.video_sizes);
                                    TLRPC.VideoSize R2 = org.telegram.messenger.w7.R(photo2);
                                    if (R2 != null) {
                                        user2 = user;
                                        arrayList11.add(new d51(R2, user != null && user2.premium, 2));
                                        z12 = false;
                                        arrayList9.add(null);
                                        arrayList6.add(null);
                                    } else {
                                        user2 = user;
                                        z12 = false;
                                        arrayList11.add(null);
                                        arrayList9.add(org.telegram.messenger.hc.j(x12, photo2));
                                        arrayList6.add(org.telegram.messenger.w7.r(null, x12));
                                    }
                                }
                                arrayList12.add(z12);
                                arrayList13.add(num);
                                arrayList3 = arrayList15;
                                arrayList3.add(z12);
                                user = user2;
                            }
                        }
                    }
                    arrayList3 = arrayList15;
                }
                i19 = i12 + 1;
                arrayList14 = arrayList3;
                num2 = num;
                i18 = i11;
                arrayList7 = arrayList2;
                hcVar = hcVar2;
            }
            int size4 = arrayList10.size();
            if (size4 > 1) {
                int i26 = 0;
                while (true) {
                    if (i26 >= (size4 > 2 ? 2 : 1)) {
                        break;
                    }
                    org.telegram.messenger.w7.G(i11).V((org.telegram.messenger.hc) arrayList10.get(i26 == 0 ? 1 : size4 - 1), null, null, 0, 1);
                    i26++;
                }
            }
            getAdapter().g();
            if (z9) {
                if (!this.H0 || this.f1) {
                    L();
                }
            } else if (!this.H0 || this.f1) {
                L();
                getAdapter().g();
                B(0.0f, getRealPosition());
            }
            if (this.k1 >= 0 || this.j1 >= 0) {
                z10 = false;
            } else {
                z10 = false;
                B(0.0f, 0);
            }
            this.f1 = z10;
            of0 of0Var = this.G0;
            if (of0Var != null) {
                of0Var.c();
            }
            org.telegram.messenger.hc hcVar5 = this.q1;
            if (hcVar5 != null) {
                A(hcVar5, this.r1);
            }
        }
    }

    public kf0 getBlurDrawer() {
        return this.p1;
    }

    public float getCurrentItemProgress() {
        v5 m10;
        l9 currentItemView = getCurrentItemView();
        if (currentItemView == null || (m10 = currentItemView.getImageReceiver().m()) == null) {
            return 0.0f;
        }
        return m10.n();
    }

    public l9 getCurrentItemView() {
        rf0 rf0Var = this.D0;
        if (rf0Var == null || rf0Var.c.isEmpty()) {
            return null;
        }
        return ((pf0) rf0Var.c.get(getCurrentItem())).c;
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

    @Override // c5.k, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.C0.getScrollState() != 0) {
            return false;
        }
        if (getParent() != null && getParent().getParent() != null) {
            getParent().getParent().requestDisallowInterceptTouchEvent(canScrollHorizontally(-1));
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // c5.k, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        super.onLayout(z9, i7, i10, i11, i12);
        kf0 kf0Var = this.p1;
        if (kf0Var != null) {
            kf0Var.setTranslationY(getHeight() - this.p1.getMeasuredHeight());
        }
    }

    @Override // c5.k, android.view.View
    public final void onSizeChanged(int i7, int i10, int i11, int i12) {
        super.onSizeChanged(i7, i10, i11, i12);
        kf0 kf0Var = this.p1;
        if (kf0Var != null) {
            kf0Var.G = true;
            kf0Var.postInvalidateOnAnimation();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:99:0x016f, code lost:
    
        if (r0 > r5) goto L88;
     */
    @Override // c5.k, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int i7;
        rf0 rf0Var = this.D0;
        if (rf0Var != null) {
            pj0 pj0Var = this.C0;
            if (pj0Var.getScrollState() != 0 && !this.A0 && this.B0) {
                this.B0 = false;
                MotionEvent obtain = MotionEvent.obtain(motionEvent);
                obtain.setAction(3);
                super.onTouchEvent(obtain);
                obtain.recycle();
                return false;
            }
            int action = motionEvent.getAction();
            org.telegram.ui.fr0 fr0Var = this.h1;
            of0 of0Var = this.G0;
            if (fr0Var != null && getCurrentItemView() != null) {
                if (action != 0 && this.I0) {
                    org.telegram.ui.fr0 fr0Var2 = this.h1;
                    if (!fr0Var2.n) {
                        fr0Var2.a(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0), this, getCurrentItemView().getImageReceiver(), null, 0);
                    }
                }
                if (this.h1.a(motionEvent, this, getCurrentItemView().getImageReceiver(), null, 0)) {
                    if (!this.I0) {
                        this.I0 = true;
                        if (of0Var != null) {
                            of0Var.a();
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
                if (rf0Var.c.size() > 1 && of0Var != null) {
                    of0Var.b(motionEvent.getX() < ((float) getWidth()) / 3.0f);
                }
                this.I0 = false;
            } else if (action == 1) {
                if (!this.I0) {
                    int realCount = getRealCount();
                    int currentItem = getCurrentItem();
                    if (realCount > 1) {
                        if (motionEvent.getX() > getWidth() / 3.0f) {
                            i7 = rf0Var.j();
                            int i10 = currentItem + 1;
                            if (i10 < realCount + i7) {
                                i7 = i10;
                            }
                        } else {
                            int i11 = (-1) + currentItem;
                            i7 = i11 < rf0Var.j() ? (realCount + r0) - 1 : i11;
                        }
                        if (of0Var != null) {
                            of0Var.a();
                        }
                        x(i7, false);
                    }
                }
            } else if (action == 2) {
                float x10 = motionEvent.getX() - pointF.x;
                float y10 = motionEvent.getY() - pointF.y;
                float abs = Math.abs(y10);
                float f10 = this.y0;
                boolean z9 = abs >= f10 || Math.abs(x10) >= f10;
                if (z9) {
                    this.I0 = true;
                    if (of0Var != null) {
                        of0Var.a();
                    }
                }
                boolean z10 = this.B0;
                if (z10 && this.A0) {
                    if (z9) {
                        if (Math.abs(y10) > Math.abs(x10)) {
                            this.B0 = false;
                            MotionEvent obtain2 = MotionEvent.obtain(motionEvent);
                            obtain2.setAction(3);
                            super.onTouchEvent(obtain2);
                            obtain2.recycle();
                        } else {
                            this.A0 = false;
                            MotionEvent obtain3 = MotionEvent.obtain(motionEvent);
                            obtain3.setAction(3);
                            pj0Var.onTouchEvent(obtain3);
                            obtain3.recycle();
                        }
                    }
                } else if (z10) {
                    if (!canScrollHorizontally(-1)) {
                    }
                }
            }
            boolean onTouchEvent = this.A0 ? pj0Var.onTouchEvent(motionEvent) : false;
            if (this.B0) {
                try {
                    onTouchEvent |= super.onTouchEvent(motionEvent);
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
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
    public void setAlpha(float f10) {
        super.setAlpha(f10);
        kf0 kf0Var = this.p1;
        if (kf0Var != null) {
            kf0Var.setAlpha(f10);
        }
    }

    public void setAnimatedFileMaybe(v5 v5Var) {
        rf0 rf0Var;
        if (v5Var == null || (rf0Var = this.D0) == null) {
            return;
        }
        int childCount = getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if ((childAt instanceof l9) && rf0Var.k(rf0Var.d.indexOf(childAt)) == 0) {
                l9 l9Var = (l9) childAt;
                v5 m10 = l9Var.getImageReceiver().m();
                if (m10 != v5Var) {
                    if (m10 != null) {
                        m10.w(l9Var);
                    }
                    l9Var.setImageDrawable(v5Var);
                    v5Var.f(this);
                    v5Var.R = true;
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
        if (arrayList2.get(0) == null || !org.telegram.messenger.w7.U(((org.telegram.messenger.hc) arrayList2.get(0)).f, this.F0.chat_photo)) {
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
            TLRPC.VideoSize x10 = org.telegram.messenger.w7.x(1000, this.F0.chat_photo.video_sizes);
            arrayList4.set(0, org.telegram.messenger.hc.j(x10, this.F0.chat_photo));
            arrayList3.set(0, org.telegram.messenger.w7.r(null, x10));
            of0 of0Var = this.G0;
            if (of0Var != null) {
                of0Var.c();
            }
        }
        this.b1.set(0, null);
        this.D0.g();
    }

    public void setCreateThumbFromParent(boolean z9) {
        this.e1 = z9;
    }

    public void setData(long j3) {
        M(j3, false);
    }

    public void setHasActiveVideo(boolean z9) {
        this.i1 = z9;
    }

    public void setImagesLayerNum(int i7) {
        this.l1 = i7;
    }

    public void setInvalidateWithParent(boolean z9) {
        this.g1 = z9;
    }

    public void setParentAvatarImage(l9 l9Var) {
        rf0 rf0Var = this.D0;
        if (rf0Var != null) {
            rf0Var.g = l9Var;
        }
    }

    public void setPinchToZoomHelper(org.telegram.ui.fr0 fr0Var) {
        this.h1 = fr0Var;
    }

    @Override // android.view.View
    public void setVisibility(int i7) {
        super.setVisibility(i7);
        kf0 kf0Var = this.p1;
        if (kf0Var != null) {
            kf0Var.setVisibility(i7);
        }
    }

    public void setCustomAvatarProgress(float f10) {
    }

    public sf0(Context context, long j3, org.telegram.ui.ActionBar.k kVar, pj0 pj0Var, org.telegram.ui.wv0 wv0Var, of0 of0Var, kf0 kf0Var) {
        super(context);
        this.x0 = new PointF();
        this.A0 = true;
        this.B0 = true;
        int i7 = org.telegram.messenger.p10.s0;
        this.L0 = i7;
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
        this.p1 = kf0Var;
        setPadding(0, 0, 0, kf0Var == null ? 0 : kf0Var.n);
        if (kf0Var != null) {
            kf0Var.setView(this);
        }
        setVisibility(8);
        setOverScrollMode(2);
        setOffscreenPageLimit(2);
        this.J0 = true;
        this.E0 = j3;
        this.C0 = pj0Var;
        this.z0 = kVar;
        rf0 rf0Var = new rf0(this, getContext(), wv0Var);
        this.D0 = rf0Var;
        setAdapter((ep) rf0Var);
        this.y0 = ViewConfiguration.get(context).getScaledTouchSlop();
        this.G0 = of0Var;
        b(new mf0((org.telegram.ui.av0) this));
        org.telegram.messenger.qs.f(i7).c(this, org.telegram.messenger.qs.b0);
        org.telegram.messenger.qs.f(i7).c(this, org.telegram.messenger.qs.Y1);
        org.telegram.messenger.qs.f(i7).c(this, org.telegram.messenger.qs.X1);
        org.telegram.messenger.qs.f(i7).c(this, org.telegram.messenger.qs.c0);
        org.telegram.messenger.qs.f(i7).c(this, org.telegram.messenger.qs.e3);
        org.telegram.messenger.yo U0 = org.telegram.messenger.qp.s1(i7).U0(j3);
        this.S0 = U0;
        U0.h.getMessagesStorage().a.c(new org.telegram.messenger.wo(U0, 0));
    }
}
