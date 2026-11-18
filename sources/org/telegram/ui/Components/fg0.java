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

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public class fg0 extends vp implements org.telegram.messenger.fs {
    public final org.telegram.ui.ActionBar.k A0;
    public boolean B0;
    public boolean C0;
    public final ck0 D0;
    public final eg0 E0;
    public long F0;
    public TLRPC.ChatFull G0;
    public final bg0 H0;
    public boolean I0;
    public boolean J0;
    public final boolean K0;
    public org.telegram.messenger.fc L0;
    public final int M0;
    public final Path N0;
    public final RectF O0;
    public final float[] P0;
    public org.telegram.messenger.fc Q0;
    public org.telegram.messenger.fc R0;
    public q51 S0;
    public org.telegram.messenger.uo T0;
    public final ArrayList U0;
    public final ArrayList V0;
    public final ArrayList W0;
    public final ArrayList X0;
    public final ArrayList Y0;
    public final ArrayList Z0;
    public final ArrayList a1;
    public final ArrayList b1;
    public final ArrayList c1;
    public int d1;
    public final SparseArray e1;
    public boolean f1;
    public boolean g1;
    public boolean h1;
    public org.telegram.ui.fr0 i1;
    public boolean j1;
    public int k1;
    public int l1;
    public int m1;
    public int n1;
    public int o1;
    public int p1;
    public xf0 q1;
    public org.telegram.messenger.fc r1;
    public org.telegram.messenger.fc s1;
    public final PointF y0;
    public final int z0;

    public fg0(Context context, org.telegram.ui.ActionBar.k kVar, ck0 ck0Var, org.telegram.ui.q4 q4Var) {
        super(context);
        this.y0 = new PointF();
        this.B0 = true;
        this.C0 = true;
        int i7 = org.telegram.messenger.j10.t0;
        this.M0 = i7;
        this.N0 = new Path();
        this.O0 = new RectF();
        this.P0 = new float[8];
        this.U0 = new ArrayList();
        this.V0 = new ArrayList();
        this.W0 = new ArrayList();
        this.X0 = new ArrayList();
        this.Y0 = new ArrayList();
        this.Z0 = new ArrayList();
        this.a1 = new ArrayList();
        this.b1 = new ArrayList();
        this.c1 = new ArrayList();
        this.e1 = new SparseArray();
        this.f1 = true;
        this.k1 = -1;
        this.l1 = -1;
        setOffscreenPageLimit(2);
        this.q1 = null;
        this.K0 = false;
        this.D0 = ck0Var;
        ConnectionsManager.generateClassGuid();
        this.A0 = kVar;
        this.z0 = ViewConfiguration.get(context).getScaledTouchSlop();
        this.H0 = q4Var;
        b(new yf0(this));
        eg0 eg0Var = new eg0(this, getContext(), null);
        this.E0 = eg0Var;
        setAdapter((up) eg0Var);
        org.telegram.messenger.ks.f(i7).c(this, org.telegram.messenger.ks.b0);
        org.telegram.messenger.ks.f(i7).c(this, org.telegram.messenger.ks.Y1);
        org.telegram.messenger.ks.f(i7).c(this, org.telegram.messenger.ks.X1);
        org.telegram.messenger.ks.f(i7).c(this, org.telegram.messenger.ks.c0);
        org.telegram.messenger.ks.f(i7).c(this, org.telegram.messenger.ks.g3);
        this.T0 = null;
    }

    public final void A(org.telegram.messenger.fc fcVar, org.telegram.messenger.fc fcVar2) {
        this.Q0 = fcVar;
        this.V0.add(0, null);
        this.U0.add(0, null);
        this.Y0.add(0, fcVar);
        this.Z0.add(0, fcVar2);
        this.a1.add(0, null);
        this.X0.add(0, null);
        this.W0.add(0, null);
        this.b1.add(0, -1);
        this.c1.add(0, Float.valueOf(0.0f));
        this.E0.g();
        L();
        this.r1 = fcVar;
        this.s1 = fcVar2;
    }

    public final void B(float f10, int i7) {
        int i10 = this.k1;
        float f11 = 0.0f;
        if (i10 >= 0 || this.l1 >= 0) {
            if (i10 < 0) {
                i10 = this.l1;
            }
            int k10 = this.E0.k(i7);
            if (this.j1) {
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

    public final org.telegram.messenger.fc C(org.telegram.messenger.fc fcVar, org.telegram.messenger.fc fcVar2) {
        TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated;
        if (fcVar == null) {
            return null;
        }
        int i7 = 0;
        while (i7 < 2) {
            ArrayList arrayList = i7 == 0 ? this.Z0 : this.Y0;
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                org.telegram.messenger.fc fcVar3 = (org.telegram.messenger.fc) arrayList.get(i10);
                if (fcVar3 != null && (tL_fileLocationToBeDeprecated = fcVar3.f) != null) {
                    int i11 = fcVar3.a;
                    if (i11 == fcVar.a) {
                        int i12 = tL_fileLocationToBeDeprecated.local_id;
                        TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated2 = fcVar.f;
                        if (i12 == tL_fileLocationToBeDeprecated2.local_id && tL_fileLocationToBeDeprecated.volume_id == tL_fileLocationToBeDeprecated2.volume_id) {
                            return (org.telegram.messenger.fc) this.X0.get(i10);
                        }
                    }
                    if (i11 == fcVar2.a) {
                        int i13 = tL_fileLocationToBeDeprecated.local_id;
                        TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated3 = fcVar2.f;
                        if (i13 == tL_fileLocationToBeDeprecated3.local_id && tL_fileLocationToBeDeprecated.volume_id == tL_fileLocationToBeDeprecated3.volume_id) {
                            return (org.telegram.messenger.fc) this.X0.get(i10);
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

    public final org.telegram.messenger.fc D(int i7) {
        if (i7 < 0) {
            return null;
        }
        ArrayList arrayList = this.Y0;
        if (i7 >= arrayList.size()) {
            return null;
        }
        org.telegram.messenger.fc fcVar = (org.telegram.messenger.fc) this.X0.get(i7);
        return fcVar != null ? fcVar : (org.telegram.messenger.fc) arrayList.get(i7);
    }

    public final View E(int i7) {
        eg0 eg0Var = this.E0;
        if (eg0Var == null) {
            return null;
        }
        ArrayList arrayList = eg0Var.c;
        if (arrayList.size() <= i7 || i7 < 0) {
            return null;
        }
        cg0 cg0Var = (cg0) arrayList.get(i7);
        dg0 dg0Var = cg0Var.b;
        return dg0Var == null ? cg0Var.c : dg0Var;
    }

    public final TLRPC.Photo F(int i7) {
        if (i7 < 0) {
            return null;
        }
        ArrayList arrayList = this.W0;
        if (i7 >= arrayList.size()) {
            return null;
        }
        return (TLRPC.Photo) arrayList.get(i7);
    }

    public final org.telegram.messenger.fc G(int i7) {
        if (i7 < 0) {
            return null;
        }
        ArrayList arrayList = this.Y0;
        if (i7 >= arrayList.size()) {
            return null;
        }
        return (org.telegram.messenger.fc) arrayList.get(i7);
    }

    public final boolean H(q51 q51Var, org.telegram.messenger.fc fcVar, org.telegram.messenger.fc fcVar2, boolean z10) {
        org.telegram.messenger.uo uoVar;
        org.telegram.messenger.uo uoVar2;
        if (fcVar != null && fcVar2 != null && this.d1 == 0) {
            org.telegram.messenger.fc fcVar3 = this.Q0;
            ArrayList arrayList = this.Y0;
            if (fcVar3 == null || fcVar3.f.local_id != fcVar.f.local_id) {
                boolean isEmpty = arrayList.isEmpty();
                eg0 eg0Var = this.E0;
                if (!isEmpty) {
                    this.Q0 = fcVar;
                    if (z10 && (uoVar2 = this.T0) != null) {
                        uoVar2.f();
                        this.T0.b(getCurrentItem() - (eg0Var != null ? eg0Var.j() : 0), true);
                    }
                    return true;
                }
                if (z10 && (uoVar = this.T0) != null) {
                    uoVar.f();
                    this.T0.b(getCurrentItem() - (eg0Var != null ? eg0Var.j() : 0), true);
                }
            }
            if (arrayList.isEmpty()) {
                this.Q0 = fcVar;
                this.R0 = fcVar2;
                this.S0 = q51Var;
                this.V0.add(null);
                this.U0.add(null);
                arrayList.add(fcVar);
                this.Z0.add(fcVar2);
                this.a1.add(q51Var);
                this.X0.add(null);
                this.W0.add(null);
                this.b1.add(-1);
                this.c1.add(null);
                getAdapter().g();
                L();
                return true;
            }
        }
        return false;
    }

    public final boolean I() {
        int realPosition = getRealPosition();
        if (this.j1) {
            if (realPosition == 0) {
                return false;
            }
            realPosition--;
        }
        if (realPosition < 0) {
            return false;
        }
        ArrayList arrayList = this.X0;
        return realPosition < arrayList.size() && arrayList.get(realPosition) != null;
    }

    public final boolean J() {
        q9 currentItemView;
        if (this.X0.get(this.j1 ? getRealPosition() - 1 : getRealPosition()) == null || (currentItemView = getCurrentItemView()) == null) {
            return false;
        }
        b6 m10 = currentItemView.getImageReceiver().m();
        return m10 == null || !m10.s();
    }

    public final void K() {
        this.q1 = null;
        int i7 = this.M0;
        org.telegram.messenger.ks.f(i7).n(this, org.telegram.messenger.ks.b0);
        org.telegram.messenger.ks.f(i7).n(this, org.telegram.messenger.ks.Y1);
        org.telegram.messenger.ks f10 = org.telegram.messenger.ks.f(i7);
        int i10 = org.telegram.messenger.ks.X1;
        f10.n(this, i10);
        org.telegram.messenger.ks.f(i7).n(this, i10);
        org.telegram.messenger.ks.f(i7).n(this, org.telegram.messenger.ks.c0);
        org.telegram.messenger.ks.f(i7).n(this, org.telegram.messenger.ks.g3);
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (childAt instanceof q9) {
                q9 q9Var = (q9) childAt;
                if (q9Var.getImageReceiver().n0 != null) {
                    Drawable t6 = q9Var.getImageReceiver().t();
                    if (t6 instanceof b6) {
                        ((b6) t6).w(q9Var);
                    }
                }
            }
        }
    }

    public final void L() {
        x(this.E0.j(), false);
    }

    public final void M(long j3, boolean z10) {
        if (this.F0 == j3 && !z10) {
            L();
            return;
        }
        this.g1 = true;
        this.U0.clear();
        this.V0.clear();
        this.W0.clear();
        this.X0.clear();
        this.Y0.clear();
        this.Z0.clear();
        this.b1.clear();
        this.c1.clear();
        this.E0.g();
        x(0, false);
        this.p1 = 0;
        this.L0 = null;
        this.Q0 = null;
        this.F0 = j3;
        org.telegram.messenger.uo W0 = org.telegram.messenger.mp.u1(this.M0).W0(j3);
        this.T0 = W0;
        W0.h.getMessagesStorage().a.c(new org.telegram.messenger.so(W0, 0));
    }

    public final void N(int i7, int i10) {
        this.n1 = i7;
        this.o1 = i10;
        eg0 eg0Var = this.E0;
        if (eg0Var != null) {
            for (int i11 = 0; i11 < eg0Var.c.size(); i11++) {
                if (((cg0) eg0Var.c.get(i11)).c != null) {
                    ag0 ag0Var = ((cg0) eg0Var.c.get(i11)).c;
                    int i12 = this.n1;
                    int i13 = this.o1;
                    ag0Var.t(i12, i12, i13, i13);
                }
            }
        }
    }

    public final void O(org.telegram.messenger.fc fcVar, float f10) {
        if (fcVar == null) {
            return;
        }
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.Y0;
            if (i7 >= arrayList.size()) {
                break;
            }
            if (arrayList.get(i7) == fcVar) {
                this.c1.set(i7, Float.valueOf(f10));
                SparseArray sparseArray = this.e1;
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

    @Override // org.telegram.messenger.fs
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        org.telegram.messenger.uo uoVar;
        TLRPC.User user;
        ArrayList arrayList;
        org.telegram.messenger.fc fcVar;
        int i11;
        boolean z10;
        boolean z11;
        int i12;
        ArrayList arrayList2;
        ArrayList arrayList3;
        org.telegram.messenger.fc fcVar2;
        Integer num;
        ArrayList<TLRPC.PhotoSize> arrayList4;
        boolean z12;
        TLRPC.User user2;
        boolean z13;
        int i13;
        boolean z14;
        TLRPC.Photo photo;
        Integer num2 = -1;
        int i14 = org.telegram.messenger.ks.g3;
        ArrayList arrayList5 = this.V0;
        ArrayList arrayList6 = this.U0;
        if (i7 != i14) {
            int i15 = org.telegram.messenger.ks.Y1;
            SparseArray sparseArray = this.e1;
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
            if (i7 != org.telegram.messenger.ks.X1) {
                if (i7 == org.telegram.messenger.ks.c0 && this.d1 == 0 && (uoVar = this.T0) != null) {
                    uoVar.f();
                    org.telegram.messenger.uo uoVar2 = this.T0;
                    int currentItem = getCurrentItem();
                    eg0 eg0Var = this.E0;
                    uoVar2.b(currentItem - (eg0Var != null ? eg0Var.j() : 0), true);
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
        org.telegram.messenger.uo uoVar3 = (org.telegram.messenger.uo) objArr[0];
        if (this.T0 == uoVar3) {
            ArrayList arrayList7 = new ArrayList(uoVar3.b);
            if (arrayList7.isEmpty() && uoVar3.c) {
                return;
            }
            this.k1 = -1;
            this.l1 = -1;
            int i18 = this.M0;
            TLRPC.User c22 = org.telegram.messenger.mp.u1(i18).c2(Long.valueOf(this.F0));
            TLRPC.UserFull d2 = org.telegram.messenger.mp.u1(i18).d2(this.F0);
            if (d2 != null && (photo = d2.personal_photo) != null) {
                arrayList7.add(0, photo);
                this.k1 = 0;
            }
            if (c22 != null && c22.self && org.telegram.messenger.o10.r(d2)) {
                arrayList7.add(d2.fallback_photo);
                this.l1 = arrayList7.size() - 1;
            }
            arrayList5.clear();
            arrayList6.clear();
            ArrayList arrayList8 = this.Y0;
            arrayList8.clear();
            ArrayList arrayList9 = this.X0;
            arrayList9.clear();
            ArrayList arrayList10 = this.Z0;
            arrayList10.clear();
            ArrayList arrayList11 = this.a1;
            arrayList11.clear();
            ArrayList arrayList12 = this.W0;
            arrayList12.clear();
            ArrayList arrayList13 = this.b1;
            arrayList13.clear();
            ArrayList arrayList14 = this.c1;
            arrayList14.clear();
            if (org.telegram.messenger.n5.z(this.F0)) {
                TLRPC.Chat O0 = org.telegram.messenger.mp.u1(i18).O0(Long.valueOf(-this.F0));
                fcVar = org.telegram.messenger.fc.m(i18, 0, O0);
                arrayList = arrayList8;
                if (fcVar != null) {
                    arrayList.add(fcVar);
                    user = c22;
                    arrayList10.add(org.telegram.messenger.fc.m(i18, 1, O0));
                    arrayList11.add(null);
                    arrayList5.add(null);
                    TLRPC.ChatFull chatFull = this.G0;
                    if (chatFull == null || !org.telegram.messenger.w7.U(fcVar.f, chatFull.chat_photo)) {
                        z14 = false;
                        arrayList12.add(null);
                        arrayList6.add(null);
                        arrayList9.add(null);
                    } else {
                        arrayList12.add(this.G0.chat_photo);
                        if (this.G0.chat_photo.video_sizes.isEmpty()) {
                            z14 = false;
                            arrayList9.add(null);
                            arrayList6.add(null);
                        } else {
                            TLRPC.VideoSize x10 = org.telegram.messenger.w7.x(1000, this.G0.chat_photo.video_sizes);
                            arrayList9.add(org.telegram.messenger.fc.j(x10, this.G0.chat_photo));
                            z14 = false;
                            arrayList6.add(org.telegram.messenger.w7.r(null, x10));
                        }
                    }
                    arrayList13.add(num2);
                    arrayList14.add(z14);
                } else {
                    user = c22;
                }
            } else {
                user = c22;
                arrayList = arrayList8;
                fcVar = null;
            }
            int i19 = 0;
            while (true) {
                int size = arrayList7.size();
                i11 = i18;
                z10 = this.K0;
                if (i19 >= size) {
                    break;
                }
                TLRPC.Photo photo2 = (TLRPC.Photo) arrayList7.get(i19);
                if (photo2 == null || (photo2 instanceof TLRPC.TL_photoEmpty) || (arrayList4 = photo2.sizes) == null) {
                    i12 = i19;
                    arrayList2 = arrayList7;
                    arrayList3 = arrayList14;
                    fcVar2 = fcVar;
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
                    if (fcVar != null) {
                        int size3 = photo2.sizes.size();
                        int i21 = 0;
                        while (i21 < size3) {
                            TLRPC.FileLocation fileLocation = photo2.sizes.get(i21).location;
                            int i22 = size3;
                            if (fileLocation != null) {
                                int i23 = fileLocation.local_id;
                                i13 = i21;
                                TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated = fcVar.f;
                                fcVar2 = fcVar;
                                if (i23 == tL_fileLocationToBeDeprecated.local_id) {
                                    num = num2;
                                    if (fileLocation.volume_id == tL_fileLocationToBeDeprecated.volume_id) {
                                        arrayList12.set(0, photo2);
                                        if (!photo2.video_sizes.isEmpty()) {
                                            arrayList9.set(0, org.telegram.messenger.fc.j(org.telegram.messenger.w7.x(1000, photo2.video_sizes), photo2));
                                        }
                                        arrayList3 = arrayList15;
                                    } else {
                                        i21 = i13 + 1;
                                        num2 = num;
                                        size3 = i22;
                                        fcVar = fcVar2;
                                    }
                                }
                            } else {
                                i13 = i21;
                                fcVar2 = fcVar;
                            }
                            num = num2;
                            i21 = i13 + 1;
                            num2 = num;
                            size3 = i22;
                            fcVar = fcVar2;
                        }
                    }
                    fcVar2 = fcVar;
                    num = num2;
                    TLRPC.PhotoSize w11 = org.telegram.messenger.w7.w(photo2.sizes, 640, false, null, false);
                    if (w11 != null) {
                        int i24 = photo2.dc_id;
                        if (i24 != 0) {
                            TLRPC.FileLocation fileLocation2 = w11.location;
                            fileLocation2.dc_id = i24;
                            fileLocation2.file_reference = photo2.file_reference;
                        }
                        org.telegram.messenger.fc i25 = org.telegram.messenger.fc.i(w11, photo2);
                        if (i25 != null) {
                            org.telegram.messenger.fc fcVar3 = this.Q0;
                            if (fcVar3 == null || fcVar3.s != i25.s || z10 || this.F0 == org.telegram.messenger.j10.i(i11).e()) {
                                TLRPC.User user3 = user;
                                arrayList.add(i25);
                                arrayList5.add(org.telegram.messenger.w7.r(null, w10 instanceof TLRPC.TL_photoStrippedSize ? w11 : w10));
                                arrayList10.add(org.telegram.messenger.fc.i(w10, photo2));
                                if (photo2.video_sizes.isEmpty()) {
                                    user = user3;
                                    z12 = false;
                                    arrayList9.add(null);
                                    arrayList6.add(null);
                                    arrayList11.add(null);
                                } else {
                                    TLRPC.VideoSize x11 = org.telegram.messenger.w7.x(1000, photo2.video_sizes);
                                    TLRPC.VideoSize R = org.telegram.messenger.w7.R(photo2);
                                    if (R != null) {
                                        user = user3;
                                        arrayList11.add(new q51(R, user3 != null && user3.premium, 2));
                                        z12 = false;
                                        arrayList9.add(null);
                                        arrayList6.add(null);
                                    } else {
                                        user = user3;
                                        z12 = false;
                                        arrayList11.add(null);
                                        arrayList9.add(org.telegram.messenger.fc.j(x11, photo2));
                                        arrayList6.add(org.telegram.messenger.w7.r(null, x11));
                                    }
                                }
                                arrayList12.add(photo2);
                                arrayList13.add(Integer.valueOf(w11.size));
                                arrayList3 = arrayList15;
                                arrayList3.add(z12);
                            } else {
                                arrayList5.add(null);
                                arrayList.add(this.Q0);
                                org.telegram.messenger.fc fcVar4 = this.R0;
                                if (fcVar4 == null) {
                                    fcVar4 = org.telegram.messenger.fc.i(w10, photo2);
                                }
                                arrayList10.add(fcVar4);
                                if (photo2.video_sizes.isEmpty()) {
                                    user2 = user;
                                    z13 = false;
                                    arrayList11.add(this.S0);
                                    arrayList9.add(null);
                                    arrayList6.add(null);
                                } else {
                                    TLRPC.VideoSize x12 = org.telegram.messenger.w7.x(1000, photo2.video_sizes);
                                    TLRPC.VideoSize R2 = org.telegram.messenger.w7.R(photo2);
                                    if (R2 != null) {
                                        user2 = user;
                                        arrayList11.add(new q51(R2, user != null && user2.premium, 2));
                                        z13 = false;
                                        arrayList9.add(null);
                                        arrayList6.add(null);
                                    } else {
                                        user2 = user;
                                        z13 = false;
                                        arrayList11.add(null);
                                        arrayList9.add(org.telegram.messenger.fc.j(x12, photo2));
                                        arrayList6.add(org.telegram.messenger.w7.r(null, x12));
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
                i19 = i12 + 1;
                arrayList14 = arrayList3;
                num2 = num;
                i18 = i11;
                arrayList7 = arrayList2;
                fcVar = fcVar2;
            }
            int size4 = arrayList10.size();
            if (size4 > 1) {
                int i26 = 0;
                while (true) {
                    if (i26 >= (size4 > 2 ? 2 : 1)) {
                        break;
                    }
                    org.telegram.messenger.w7.G(i11).V((org.telegram.messenger.fc) arrayList10.get(i26 == 0 ? 1 : size4 - 1), null, null, 0, 1);
                    i26++;
                }
            }
            getAdapter().g();
            if (z10) {
                if (!this.I0 || this.g1) {
                    L();
                }
            } else if (!this.I0 || this.g1) {
                L();
                getAdapter().g();
                B(0.0f, getRealPosition());
            }
            if (this.l1 >= 0 || this.k1 >= 0) {
                z11 = false;
            } else {
                z11 = false;
                B(0.0f, 0);
            }
            this.g1 = z11;
            bg0 bg0Var = this.H0;
            if (bg0Var != null) {
                bg0Var.c();
            }
            org.telegram.messenger.fc fcVar5 = this.r1;
            if (fcVar5 != null) {
                A(fcVar5, this.s1);
            }
        }
    }

    public xf0 getBlurDrawer() {
        return this.q1;
    }

    public float getCurrentItemProgress() {
        b6 m10;
        q9 currentItemView = getCurrentItemView();
        if (currentItemView == null || (m10 = currentItemView.getImageReceiver().m()) == null) {
            return 0.0f;
        }
        return m10.n();
    }

    public q9 getCurrentItemView() {
        eg0 eg0Var = this.E0;
        if (eg0Var == null || eg0Var.c.isEmpty()) {
            return null;
        }
        return ((cg0) eg0Var.c.get(getCurrentItem())).c;
    }

    public long getDialogId() {
        return this.F0;
    }

    public int getRealCount() {
        int size = this.W0.size();
        return this.j1 ? size + 1 : size;
    }

    public int getRealPosition() {
        return this.E0.k(getCurrentItem());
    }

    @Override // c5.l, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.D0.getScrollState() != 0) {
            return false;
        }
        if (getParent() != null && getParent().getParent() != null) {
            getParent().getParent().requestDisallowInterceptTouchEvent(canScrollHorizontally(-1));
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // c5.l, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
        xf0 xf0Var = this.q1;
        if (xf0Var != null) {
            xf0Var.setTranslationY(getHeight() - this.q1.getMeasuredHeight());
        }
    }

    @Override // c5.l, android.view.View
    public final void onSizeChanged(int i7, int i10, int i11, int i12) {
        super.onSizeChanged(i7, i10, i11, i12);
        xf0 xf0Var = this.q1;
        if (xf0Var != null) {
            xf0Var.H = true;
            xf0Var.postInvalidateOnAnimation();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:99:0x016f, code lost:
    
        if (r0 > r5) goto L88;
     */
    @Override // c5.l, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int i7;
        eg0 eg0Var = this.E0;
        if (eg0Var != null) {
            ck0 ck0Var = this.D0;
            if (ck0Var.getScrollState() != 0 && !this.B0 && this.C0) {
                this.C0 = false;
                MotionEvent obtain = MotionEvent.obtain(motionEvent);
                obtain.setAction(3);
                super.onTouchEvent(obtain);
                obtain.recycle();
                return false;
            }
            int action = motionEvent.getAction();
            org.telegram.ui.fr0 fr0Var = this.i1;
            bg0 bg0Var = this.H0;
            if (fr0Var != null && getCurrentItemView() != null) {
                if (action != 0 && this.J0) {
                    org.telegram.ui.fr0 fr0Var2 = this.i1;
                    if (!fr0Var2.n) {
                        fr0Var2.a(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0), this, getCurrentItemView().getImageReceiver(), null, 0);
                    }
                }
                if (this.i1.a(motionEvent, this, getCurrentItemView().getImageReceiver(), null, 0)) {
                    if (!this.J0) {
                        this.J0 = true;
                        if (bg0Var != null) {
                            bg0Var.a();
                        }
                    }
                    return true;
                }
            }
            PointF pointF = this.y0;
            if (action == 0) {
                this.B0 = true;
                this.C0 = true;
                this.I0 = true;
                pointF.set(motionEvent.getX(), motionEvent.getY());
                if (eg0Var.c.size() > 1 && bg0Var != null) {
                    bg0Var.b(motionEvent.getX() < ((float) getWidth()) / 3.0f);
                }
                this.J0 = false;
            } else if (action == 1) {
                if (!this.J0) {
                    int realCount = getRealCount();
                    int currentItem = getCurrentItem();
                    if (realCount > 1) {
                        if (motionEvent.getX() > getWidth() / 3.0f) {
                            i7 = eg0Var.j();
                            int i10 = currentItem + 1;
                            if (i10 < realCount + i7) {
                                i7 = i10;
                            }
                        } else {
                            int i11 = (-1) + currentItem;
                            i7 = i11 < eg0Var.j() ? (realCount + r0) - 1 : i11;
                        }
                        if (bg0Var != null) {
                            bg0Var.a();
                        }
                        x(i7, false);
                    }
                }
            } else if (action == 2) {
                float x10 = motionEvent.getX() - pointF.x;
                float y10 = motionEvent.getY() - pointF.y;
                float abs = Math.abs(y10);
                float f10 = this.z0;
                boolean z10 = abs >= f10 || Math.abs(x10) >= f10;
                if (z10) {
                    this.J0 = true;
                    if (bg0Var != null) {
                        bg0Var.a();
                    }
                }
                boolean z11 = this.C0;
                if (z11 && this.B0) {
                    if (z10) {
                        if (Math.abs(y10) > Math.abs(x10)) {
                            this.C0 = false;
                            MotionEvent obtain2 = MotionEvent.obtain(motionEvent);
                            obtain2.setAction(3);
                            super.onTouchEvent(obtain2);
                            obtain2.recycle();
                        } else {
                            this.B0 = false;
                            MotionEvent obtain3 = MotionEvent.obtain(motionEvent);
                            obtain3.setAction(3);
                            ck0Var.onTouchEvent(obtain3);
                            obtain3.recycle();
                        }
                    }
                } else if (z11) {
                    if (!canScrollHorizontally(-1)) {
                    }
                }
            }
            boolean onTouchEvent = this.B0 ? ck0Var.onTouchEvent(motionEvent) : false;
            if (this.C0) {
                try {
                    onTouchEvent |= super.onTouchEvent(motionEvent);
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                }
            }
            if (action == 1 || action == 3) {
                this.B0 = false;
                this.C0 = false;
            }
            return onTouchEvent;
        }
        return false;
    }

    @Override // android.view.View
    public void setAlpha(float f10) {
        super.setAlpha(f10);
        xf0 xf0Var = this.q1;
        if (xf0Var != null) {
            xf0Var.setAlpha(f10);
        }
    }

    public void setAnimatedFileMaybe(b6 b6Var) {
        eg0 eg0Var;
        if (b6Var == null || (eg0Var = this.E0) == null) {
            return;
        }
        int childCount = getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if ((childAt instanceof q9) && eg0Var.k(eg0Var.d.indexOf(childAt)) == 0) {
                q9 q9Var = (q9) childAt;
                b6 m10 = q9Var.getImageReceiver().m();
                if (m10 != b6Var) {
                    if (m10 != null) {
                        m10.w(q9Var);
                    }
                    q9Var.setImageDrawable(b6Var);
                    b6Var.f(this);
                    b6Var.S = true;
                }
            }
        }
    }

    public void setChatInfo(TLRPC.ChatFull chatFull) {
        this.G0 = chatFull;
        ArrayList arrayList = this.W0;
        if (arrayList.isEmpty() || arrayList.get(0) != null || this.G0 == null) {
            return;
        }
        ArrayList arrayList2 = this.Y0;
        if (arrayList2.get(0) == null || !org.telegram.messenger.w7.U(((org.telegram.messenger.fc) arrayList2.get(0)).f, this.G0.chat_photo)) {
            return;
        }
        arrayList.set(0, this.G0.chat_photo);
        boolean isEmpty = this.G0.chat_photo.video_sizes.isEmpty();
        ArrayList arrayList3 = this.U0;
        ArrayList arrayList4 = this.X0;
        if (isEmpty) {
            arrayList4.set(0, null);
            arrayList3.add(0, null);
        } else {
            TLRPC.VideoSize x10 = org.telegram.messenger.w7.x(1000, this.G0.chat_photo.video_sizes);
            arrayList4.set(0, org.telegram.messenger.fc.j(x10, this.G0.chat_photo));
            arrayList3.set(0, org.telegram.messenger.w7.r(null, x10));
            bg0 bg0Var = this.H0;
            if (bg0Var != null) {
                bg0Var.c();
            }
        }
        this.c1.set(0, null);
        this.E0.g();
    }

    public void setCreateThumbFromParent(boolean z10) {
        this.f1 = z10;
    }

    public void setData(long j3) {
        M(j3, false);
    }

    public void setHasActiveVideo(boolean z10) {
        this.j1 = z10;
    }

    public void setImagesLayerNum(int i7) {
        this.m1 = i7;
    }

    public void setInvalidateWithParent(boolean z10) {
        this.h1 = z10;
    }

    public void setParentAvatarImage(q9 q9Var) {
        eg0 eg0Var = this.E0;
        if (eg0Var != null) {
            eg0Var.g = q9Var;
        }
    }

    public void setPinchToZoomHelper(org.telegram.ui.fr0 fr0Var) {
        this.i1 = fr0Var;
    }

    @Override // android.view.View
    public void setVisibility(int i7) {
        super.setVisibility(i7);
        xf0 xf0Var = this.q1;
        if (xf0Var != null) {
            xf0Var.setVisibility(i7);
        }
    }

    public void setCustomAvatarProgress(float f10) {
    }

    public fg0(Context context, long j3, org.telegram.ui.ActionBar.k kVar, ck0 ck0Var, org.telegram.ui.wv0 wv0Var, bg0 bg0Var, xf0 xf0Var) {
        super(context);
        this.y0 = new PointF();
        this.B0 = true;
        this.C0 = true;
        int i7 = org.telegram.messenger.j10.t0;
        this.M0 = i7;
        this.N0 = new Path();
        this.O0 = new RectF();
        this.P0 = new float[8];
        this.U0 = new ArrayList();
        this.V0 = new ArrayList();
        this.W0 = new ArrayList();
        this.X0 = new ArrayList();
        this.Y0 = new ArrayList();
        this.Z0 = new ArrayList();
        this.a1 = new ArrayList();
        this.b1 = new ArrayList();
        this.c1 = new ArrayList();
        this.e1 = new SparseArray();
        this.f1 = true;
        this.k1 = -1;
        this.l1 = -1;
        this.q1 = xf0Var;
        setPadding(0, 0, 0, xf0Var == null ? 0 : xf0Var.n);
        if (xf0Var != null) {
            xf0Var.setView(this);
        }
        setVisibility(8);
        setOverScrollMode(2);
        setOffscreenPageLimit(2);
        this.K0 = true;
        this.F0 = j3;
        this.D0 = ck0Var;
        this.A0 = kVar;
        eg0 eg0Var = new eg0(this, getContext(), wv0Var);
        this.E0 = eg0Var;
        setAdapter((up) eg0Var);
        this.z0 = ViewConfiguration.get(context).getScaledTouchSlop();
        this.H0 = bg0Var;
        b(new zf0((org.telegram.ui.av0) this));
        org.telegram.messenger.ks.f(i7).c(this, org.telegram.messenger.ks.b0);
        org.telegram.messenger.ks.f(i7).c(this, org.telegram.messenger.ks.Y1);
        org.telegram.messenger.ks.f(i7).c(this, org.telegram.messenger.ks.X1);
        org.telegram.messenger.ks.f(i7).c(this, org.telegram.messenger.ks.c0);
        org.telegram.messenger.ks.f(i7).c(this, org.telegram.messenger.ks.g3);
        org.telegram.messenger.uo W0 = org.telegram.messenger.mp.u1(i7).W0(j3);
        this.T0 = W0;
        W0.h.getMessagesStorage().a.c(new org.telegram.messenger.so(W0, 0));
    }
}
