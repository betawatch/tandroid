// default package

import android.app.Activity;
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
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.Components.RadialProgress2;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public class et8 extends hi2 implements fn7 {
    public final a A0;
    public boolean B0;
    public boolean C0;
    public final d79 D0;
    public final dt8 E0;
    public long F0;
    public TLRPC.ChatFull G0;
    public final at8 H0;
    public boolean I0;
    public boolean J0;
    public final boolean K0;
    public jn5 L0;
    public final int M0;
    public final Path N0;
    public final RectF O0;
    public final float[] P0;
    public jn5 Q0;
    public jn5 R0;
    public idc S0;
    public dc7 T0;
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
    public de8 i1;
    public boolean j1;
    public int k1;
    public int l1;
    public int m1;
    public int n1;
    public int o1;
    public int p1;
    public ws8 q1;
    public jn5 r1;
    public jn5 s1;
    public final PointF y0;
    public final int z0;

    public et8(Context context, long j, a aVar, zp8 zp8Var, iq8 iq8Var, at8 at8Var, ws8 ws8Var) {
        super(context);
        this.y0 = new PointF();
        this.B0 = true;
        this.C0 = true;
        int i = yac.t0;
        this.M0 = i;
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
        this.q1 = ws8Var;
        byte b = 0;
        setPadding(0, 0, 0, ws8Var == null ? 0 : ws8Var.n);
        if (ws8Var != null) {
            ws8Var.setView(this);
        }
        setVisibility(8);
        setOverScrollMode(2);
        setOffscreenPageLimit(2);
        this.K0 = true;
        this.F0 = j;
        this.D0 = zp8Var;
        this.A0 = aVar;
        dt8 dt8Var = new dt8(this, getContext(), iq8Var);
        this.E0 = dt8Var;
        setAdapter((gi2) dt8Var);
        this.z0 = ViewConfiguration.get(context).getScaledTouchSlop();
        this.H0 = at8Var;
        b(new ys8((jq8) this));
        jn7.f(i).b(this, jn7.b0);
        jn7.f(i).b(this, jn7.Y1);
        jn7.f(i).b(this, jn7.X1);
        jn7.f(i).b(this, jn7.c0);
        jn7.f(i).b(this, jn7.g3);
        dc7 U0 = uc7.s1(i).U0(j);
        this.T0 = U0;
        U0.h.getMessagesStorage().a.c(new bc7(U0, b));
    }

    public final void A(jn5 jn5Var, jn5 jn5Var2) {
        this.Q0 = jn5Var;
        this.V0.add(0, null);
        this.U0.add(0, null);
        this.Y0.add(0, jn5Var);
        this.Z0.add(0, jn5Var2);
        this.a1.add(0, null);
        this.X0.add(0, null);
        this.W0.add(0, null);
        this.b1.add(0, -1);
        this.c1.add(0, Float.valueOf(0.0f));
        this.E0.g();
        L();
        this.r1 = jn5Var;
        this.s1 = jn5Var2;
    }

    public final void B(float f, int i) {
        int i2 = this.k1;
        float f2 = 0.0f;
        if (i2 >= 0 || this.l1 >= 0) {
            if (i2 < 0) {
                i2 = this.l1;
            }
            int k = this.E0.k(i);
            if (this.j1) {
                k--;
            }
            float f3 = k == i2 ? 1.0f - f : (getRealCount() <= 0 || (k + (-1)) % getRealCount() != i2) ? (getRealCount() <= 0 || (k + 1) % getRealCount() != i2) ? 0.0f : (1.0f - f) + 1.0f : (1.0f - f) - 1.0f;
            if (f3 > 1.0f) {
                f3 = 2.0f - f3;
            }
            f2 = Utilities.i(f3, 1.0f, 0.0f);
        }
        setCustomAvatarProgress(f2);
    }

    public final jn5 C(jn5 jn5Var, jn5 jn5Var2) {
        TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated;
        if (jn5Var == null) {
            return null;
        }
        int i = 0;
        while (i < 2) {
            ArrayList arrayList = i == 0 ? this.Z0 : this.Y0;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                jn5 jn5Var3 = (jn5) arrayList.get(i2);
                if (jn5Var3 != null && (tL_fileLocationToBeDeprecated = jn5Var3.f) != null) {
                    int i3 = jn5Var3.a;
                    if (i3 == jn5Var.a) {
                        int i4 = tL_fileLocationToBeDeprecated.local_id;
                        TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated2 = jn5Var.f;
                        if (i4 == tL_fileLocationToBeDeprecated2.local_id && tL_fileLocationToBeDeprecated.volume_id == tL_fileLocationToBeDeprecated2.volume_id) {
                            return (jn5) this.X0.get(i2);
                        }
                    }
                    if (i3 == jn5Var2.a) {
                        int i5 = tL_fileLocationToBeDeprecated.local_id;
                        TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated3 = jn5Var2.f;
                        if (i5 == tL_fileLocationToBeDeprecated3.local_id && tL_fileLocationToBeDeprecated.volume_id == tL_fileLocationToBeDeprecated3.volume_id) {
                            return (jn5) this.X0.get(i2);
                        }
                    } else {
                        continue;
                    }
                }
            }
            i++;
        }
        return null;
    }

    public final jn5 D(int i) {
        if (i < 0) {
            return null;
        }
        ArrayList arrayList = this.Y0;
        if (i >= arrayList.size()) {
            return null;
        }
        jn5 jn5Var = (jn5) this.X0.get(i);
        return jn5Var != null ? jn5Var : (jn5) arrayList.get(i);
    }

    public final View E(int i) {
        dt8 dt8Var = this.E0;
        if (dt8Var == null) {
            return null;
        }
        ArrayList arrayList = dt8Var.c;
        if (arrayList.size() <= i || i < 0) {
            return null;
        }
        bt8 bt8Var = (bt8) arrayList.get(i);
        ct8 ct8Var = bt8Var.b;
        return ct8Var == null ? bt8Var.c : ct8Var;
    }

    public final TLRPC.Photo F(int i) {
        if (i < 0) {
            return null;
        }
        ArrayList arrayList = this.W0;
        if (i < arrayList.size()) {
            return (TLRPC.Photo) arrayList.get(i);
        }
        return null;
    }

    public final jn5 G(int i) {
        if (i < 0) {
            return null;
        }
        ArrayList arrayList = this.Y0;
        if (i < arrayList.size()) {
            return (jn5) arrayList.get(i);
        }
        return null;
    }

    public final boolean H(idc idcVar, jn5 jn5Var, jn5 jn5Var2, boolean z) {
        dc7 dc7Var;
        dc7 dc7Var2;
        if (jn5Var != null && jn5Var2 != null && this.d1 == 0) {
            jn5 jn5Var3 = this.Q0;
            ArrayList arrayList = this.Y0;
            if (jn5Var3 == null || jn5Var3.f.local_id != jn5Var.f.local_id) {
                boolean isEmpty = arrayList.isEmpty();
                dt8 dt8Var = this.E0;
                if (!isEmpty) {
                    this.Q0 = jn5Var;
                    if (z && (dc7Var2 = this.T0) != null) {
                        dc7Var2.f();
                        this.T0.b(getCurrentItem() - (dt8Var != null ? dt8Var.j() : 0), true);
                    }
                    return true;
                }
                if (z && (dc7Var = this.T0) != null) {
                    dc7Var.f();
                    this.T0.b(getCurrentItem() - (dt8Var != null ? dt8Var.j() : 0), true);
                }
            }
            if (arrayList.isEmpty()) {
                this.Q0 = jn5Var;
                this.R0 = jn5Var2;
                this.S0 = idcVar;
                this.V0.add(null);
                this.U0.add(null);
                arrayList.add(jn5Var);
                this.Z0.add(jn5Var2);
                this.a1.add(idcVar);
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
        de0 currentItemView;
        if (this.X0.get(this.j1 ? getRealPosition() - 1 : getRealPosition()) == null || (currentItemView = getCurrentItemView()) == null) {
            return false;
        }
        lm m = currentItemView.getImageReceiver().m();
        return m == null || !m.s();
    }

    public final void K() {
        this.q1 = null;
        int i = this.M0;
        jn7.f(i).n(this, jn7.b0);
        jn7.f(i).n(this, jn7.Y1);
        jn7 f = jn7.f(i);
        int i2 = jn7.X1;
        f.n(this, i2);
        jn7.f(i).n(this, i2);
        jn7.f(i).n(this, jn7.c0);
        jn7.f(i).n(this, jn7.g3);
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (childAt instanceof de0) {
                de0 de0Var = (de0) childAt;
                if (de0Var.getImageReceiver().n0 != null) {
                    Drawable t = de0Var.getImageReceiver().t();
                    if (t instanceof lm) {
                        ((lm) t).w(de0Var);
                    }
                }
            }
        }
    }

    public final void L() {
        x(this.E0.j(), false);
    }

    public final void M(long j, boolean z) {
        if (this.F0 == j && !z) {
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
        this.F0 = j;
        dc7 U0 = uc7.s1(this.M0).U0(j);
        this.T0 = U0;
        U0.h.getMessagesStorage().a.c(new bc7(U0, (byte) 0));
    }

    public final void N(int i, int i2) {
        this.n1 = i;
        this.o1 = i2;
        dt8 dt8Var = this.E0;
        if (dt8Var != null) {
            ArrayList arrayList = dt8Var.c;
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                if (((bt8) arrayList.get(i3)).c != null) {
                    zs8 zs8Var = ((bt8) arrayList.get(i3)).c;
                    int i4 = this.n1;
                    int i5 = this.o1;
                    zs8Var.s(i4, i4, i5, i5);
                }
            }
        }
    }

    public final void O(jn5 jn5Var, float f) {
        if (jn5Var != null) {
            int i = 0;
            while (true) {
                ArrayList arrayList = this.Y0;
                if (i >= arrayList.size()) {
                    break;
                }
                if (arrayList.get(i) == jn5Var) {
                    this.c1.set(i, Float.valueOf(f));
                    SparseArray sparseArray = this.e1;
                    if (sparseArray.get(i) != null) {
                        ((RadialProgress2) sparseArray.get(i)).o(true, f);
                    }
                } else {
                    i++;
                }
            }
            for (int i2 = 0; i2 < getChildCount(); i2++) {
                getChildAt(i2).invalidate();
            }
        }
    }

    @Override // fn7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        dc7 dc7Var;
        TLRPC.User user;
        ArrayList arrayList;
        jn5 jn5Var;
        int i3;
        boolean z;
        boolean z2;
        int i4;
        ArrayList arrayList2;
        ArrayList arrayList3;
        jn5 jn5Var2;
        Integer num;
        ArrayList<TLRPC.PhotoSize> arrayList4;
        boolean z3;
        TLRPC.User user2;
        boolean z4;
        int i5;
        boolean z5;
        TLRPC.Photo photo;
        Integer num2 = -1;
        int i6 = jn7.g3;
        ArrayList arrayList5 = this.V0;
        ArrayList arrayList6 = this.U0;
        if (i != i6) {
            int i7 = jn7.Y1;
            SparseArray sparseArray = this.e1;
            if (i == i7) {
                String str = (String) objArr[0];
                for (int i8 = 0; i8 < arrayList5.size(); i8++) {
                    String str2 = (String) arrayList6.get(i8);
                    if (str2 == null) {
                        str2 = (String) arrayList5.get(i8);
                    }
                    if (str2 != null && TextUtils.equals(str, str2)) {
                        RadialProgress2 radialProgress2 = (RadialProgress2) sparseArray.get(i8);
                        if (radialProgress2 != null) {
                            radialProgress2.o(true, 1.0f);
                        }
                        invalidate();
                    }
                }
                return;
            }
            if (i != jn7.X1) {
                if (i == jn7.c0 && this.d1 == 0 && (dc7Var = this.T0) != null) {
                    dc7Var.f();
                    dc7 dc7Var2 = this.T0;
                    int currentItem = getCurrentItem();
                    dt8 dt8Var = this.E0;
                    dc7Var2.b(currentItem - (dt8Var != null ? dt8Var.j() : 0), true);
                    return;
                }
                return;
            }
            String str3 = (String) objArr[0];
            for (int i9 = 0; i9 < arrayList5.size(); i9++) {
                String str4 = (String) arrayList6.get(i9);
                if (str4 == null) {
                    str4 = (String) arrayList5.get(i9);
                }
                if (str4 != null && TextUtils.equals(str3, str4)) {
                    RadialProgress2 radialProgress22 = (RadialProgress2) sparseArray.get(i9);
                    if (radialProgress22 != null) {
                        radialProgress22.o(true, Math.min(1.0f, ((Long) objArr[1]).longValue() / ((Long) objArr[2]).longValue()));
                    }
                    invalidate();
                }
            }
            return;
        }
        dc7 dc7Var3 = (dc7) objArr[0];
        if (this.T0 == dc7Var3) {
            ArrayList arrayList7 = new ArrayList(dc7Var3.b);
            if (arrayList7.isEmpty() && dc7Var3.c) {
                return;
            }
            this.k1 = -1;
            this.l1 = -1;
            int i10 = this.M0;
            TLRPC.User X1 = uc7.s1(i10).X1(Long.valueOf(this.F0));
            TLRPC.UserFull Y1 = uc7.s1(i10).Y1(this.F0);
            if (Y1 != null && (photo = Y1.personal_photo) != null) {
                arrayList7.add(0, photo);
                this.k1 = 0;
            }
            if (X1 != null && X1.self && lbc.s(Y1)) {
                arrayList7.add(Y1.fallback_photo);
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
            if (wf3.y(this.F0)) {
                TLRPC.Chat M0 = uc7.s1(i10).M0(Long.valueOf(-this.F0));
                jn5Var = jn5.m(i10, 0, M0);
                arrayList = arrayList8;
                if (jn5Var != null) {
                    arrayList.add(jn5Var);
                    user = X1;
                    arrayList10.add(jn5.m(i10, 1, M0));
                    arrayList11.add(null);
                    arrayList5.add(null);
                    TLRPC.ChatFull chatFull = this.G0;
                    if (chatFull == null || !xb4.U(jn5Var.f, chatFull.chat_photo)) {
                        z5 = false;
                        arrayList12.add(null);
                        arrayList6.add(null);
                        arrayList9.add(null);
                    } else {
                        arrayList12.add(this.G0.chat_photo);
                        if (this.G0.chat_photo.video_sizes.isEmpty()) {
                            z5 = false;
                            arrayList9.add(null);
                            arrayList6.add(null);
                        } else {
                            TLRPC.VideoSize x = xb4.x(1000, this.G0.chat_photo.video_sizes);
                            arrayList9.add(jn5.j(x, this.G0.chat_photo));
                            z5 = false;
                            arrayList6.add(xb4.r(null, x));
                        }
                    }
                    arrayList13.add(num2);
                    arrayList14.add(z5);
                } else {
                    user = X1;
                }
            } else {
                user = X1;
                arrayList = arrayList8;
                jn5Var = null;
            }
            int i11 = 0;
            while (true) {
                int size = arrayList7.size();
                i3 = i10;
                z = this.K0;
                if (i11 >= size) {
                    break;
                }
                TLRPC.Photo photo2 = (TLRPC.Photo) arrayList7.get(i11);
                if (photo2 == null || (photo2 instanceof TLRPC.TL_photoEmpty) || (arrayList4 = photo2.sizes) == null) {
                    i4 = i11;
                    arrayList2 = arrayList7;
                    arrayList3 = arrayList14;
                    jn5Var2 = jn5Var;
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
                    i4 = i11;
                    arrayList2 = arrayList7;
                    ArrayList arrayList15 = arrayList14;
                    TLRPC.PhotoSize w = xb4.w(arrayList4, 50, false, null, false);
                    int size2 = photo2.sizes.size();
                    int i12 = 0;
                    while (true) {
                        if (i12 >= size2) {
                            break;
                        }
                        TLRPC.PhotoSize photoSize = photo2.sizes.get(i12);
                        TLRPC.PhotoSize photoSize2 = w;
                        if (photoSize instanceof TLRPC.TL_photoStrippedSize) {
                            w = photoSize;
                            break;
                        } else {
                            i12++;
                            w = photoSize2;
                        }
                    }
                    if (jn5Var != null) {
                        int size3 = photo2.sizes.size();
                        int i13 = 0;
                        while (i13 < size3) {
                            TLRPC.FileLocation fileLocation = photo2.sizes.get(i13).location;
                            int i14 = size3;
                            if (fileLocation != null) {
                                int i15 = fileLocation.local_id;
                                i5 = i13;
                                TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated = jn5Var.f;
                                jn5Var2 = jn5Var;
                                if (i15 == tL_fileLocationToBeDeprecated.local_id) {
                                    num = num2;
                                    if (fileLocation.volume_id == tL_fileLocationToBeDeprecated.volume_id) {
                                        arrayList12.set(0, photo2);
                                        if (!photo2.video_sizes.isEmpty()) {
                                            arrayList9.set(0, jn5.j(xb4.x(1000, photo2.video_sizes), photo2));
                                        }
                                        arrayList3 = arrayList15;
                                    } else {
                                        i13 = i5 + 1;
                                        num2 = num;
                                        size3 = i14;
                                        jn5Var = jn5Var2;
                                    }
                                }
                            } else {
                                i5 = i13;
                                jn5Var2 = jn5Var;
                            }
                            num = num2;
                            i13 = i5 + 1;
                            num2 = num;
                            size3 = i14;
                            jn5Var = jn5Var2;
                        }
                    }
                    jn5Var2 = jn5Var;
                    num = num2;
                    TLRPC.PhotoSize w2 = xb4.w(photo2.sizes, 640, false, null, false);
                    if (w2 != null) {
                        int i16 = photo2.dc_id;
                        if (i16 != 0) {
                            TLRPC.FileLocation fileLocation2 = w2.location;
                            fileLocation2.dc_id = i16;
                            fileLocation2.file_reference = photo2.file_reference;
                        }
                        jn5 i17 = jn5.i(w2, photo2);
                        if (i17 != null) {
                            jn5 jn5Var3 = this.Q0;
                            if (jn5Var3 == null || jn5Var3.s != i17.s || z || this.F0 == yac.h(i3).e()) {
                                TLRPC.User user3 = user;
                                arrayList.add(i17);
                                arrayList5.add(xb4.r(null, w instanceof TLRPC.TL_photoStrippedSize ? w2 : w));
                                arrayList10.add(jn5.i(w, photo2));
                                if (photo2.video_sizes.isEmpty()) {
                                    user = user3;
                                    z3 = false;
                                    arrayList9.add(null);
                                    arrayList6.add(null);
                                    arrayList11.add(null);
                                } else {
                                    TLRPC.VideoSize x2 = xb4.x(1000, photo2.video_sizes);
                                    TLRPC.VideoSize R = xb4.R(photo2);
                                    if (R != null) {
                                        user = user3;
                                        arrayList11.add(new idc(R, user3 != null && user3.premium, 2));
                                        z3 = false;
                                        arrayList9.add(null);
                                        arrayList6.add(null);
                                    } else {
                                        user = user3;
                                        z3 = false;
                                        arrayList11.add(null);
                                        arrayList9.add(jn5.j(x2, photo2));
                                        arrayList6.add(xb4.r(null, x2));
                                    }
                                }
                                arrayList12.add(photo2);
                                arrayList13.add(Integer.valueOf(w2.size));
                                arrayList3 = arrayList15;
                                arrayList3.add(z3);
                            } else {
                                arrayList5.add(null);
                                arrayList.add(this.Q0);
                                jn5 jn5Var4 = this.R0;
                                if (jn5Var4 == null) {
                                    jn5Var4 = jn5.i(w, photo2);
                                }
                                arrayList10.add(jn5Var4);
                                if (photo2.video_sizes.isEmpty()) {
                                    user2 = user;
                                    z4 = false;
                                    arrayList11.add(this.S0);
                                    arrayList9.add(null);
                                    arrayList6.add(null);
                                } else {
                                    TLRPC.VideoSize x3 = xb4.x(1000, photo2.video_sizes);
                                    TLRPC.VideoSize R2 = xb4.R(photo2);
                                    if (R2 != null) {
                                        user2 = user;
                                        arrayList11.add(new idc(R2, user != null && user2.premium, 2));
                                        z4 = false;
                                        arrayList9.add(null);
                                        arrayList6.add(null);
                                    } else {
                                        user2 = user;
                                        z4 = false;
                                        arrayList11.add(null);
                                        arrayList9.add(jn5.j(x3, photo2));
                                        arrayList6.add(xb4.r(null, x3));
                                    }
                                }
                                arrayList12.add(z4);
                                arrayList13.add(num);
                                arrayList3 = arrayList15;
                                arrayList3.add(z4);
                                user = user2;
                            }
                        }
                    }
                    arrayList3 = arrayList15;
                }
                i11 = i4 + 1;
                arrayList14 = arrayList3;
                num2 = num;
                i10 = i3;
                arrayList7 = arrayList2;
                jn5Var = jn5Var2;
            }
            int size4 = arrayList10.size();
            if (size4 > 1) {
                int i18 = 0;
                while (true) {
                    if (i18 >= (size4 > 2 ? 2 : 1)) {
                        break;
                    }
                    xb4.G(i3).V((jn5) arrayList10.get(i18 == 0 ? 1 : size4 - 1), null, null, 0, 1);
                    i18++;
                }
            }
            getAdapter().g();
            boolean z6 = this.I0;
            if (z) {
                if (!z6 || this.g1) {
                    L();
                }
            } else if (!z6 || this.g1) {
                L();
                getAdapter().g();
                B(0.0f, getRealPosition());
            }
            if (this.l1 >= 0 || this.k1 >= 0) {
                z2 = false;
            } else {
                z2 = false;
                B(0.0f, 0);
            }
            this.g1 = z2;
            at8 at8Var = this.H0;
            if (at8Var != null) {
                at8Var.c();
            }
            jn5 jn5Var5 = this.r1;
            if (jn5Var5 != null) {
                A(jn5Var5, this.s1);
            }
        }
    }

    public ws8 getBlurDrawer() {
        return this.q1;
    }

    public float getCurrentItemProgress() {
        lm m;
        de0 currentItemView = getCurrentItemView();
        if (currentItemView == null || (m = currentItemView.getImageReceiver().m()) == null) {
            return 0.0f;
        }
        return m.n();
    }

    public de0 getCurrentItemView() {
        dt8 dt8Var = this.E0;
        if (dt8Var == null) {
            return null;
        }
        ArrayList arrayList = dt8Var.c;
        if (arrayList.isEmpty()) {
            return null;
        }
        return ((bt8) arrayList.get(getCurrentItem())).c;
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

    @Override // fic, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.D0.getScrollState() != 0) {
            return false;
        }
        if (getParent() != null && getParent().getParent() != null) {
            getParent().getParent().requestDisallowInterceptTouchEvent(canScrollHorizontally(-1));
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // fic, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        ws8 ws8Var = this.q1;
        if (ws8Var != null) {
            ws8Var.setTranslationY(getHeight() - this.q1.getMeasuredHeight());
        }
    }

    @Override // fic, android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        ws8 ws8Var = this.q1;
        if (ws8Var != null) {
            ws8Var.H = true;
            ws8Var.postInvalidateOnAnimation();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:98:0x0169, code lost:
    
        if (r0 > r5) goto L84;
     */
    @Override // fic, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int i;
        dt8 dt8Var = this.E0;
        if (dt8Var != null) {
            d79 d79Var = this.D0;
            if (d79Var.getScrollState() != 0 && !this.B0 && this.C0) {
                this.C0 = false;
                MotionEvent obtain = MotionEvent.obtain(motionEvent);
                obtain.setAction(3);
                super.onTouchEvent(obtain);
                obtain.recycle();
                return false;
            }
            int action = motionEvent.getAction();
            de8 de8Var = this.i1;
            at8 at8Var = this.H0;
            if (de8Var != null && getCurrentItemView() != null) {
                if (action != 0 && this.J0) {
                    de8 de8Var2 = this.i1;
                    if (!de8Var2.n) {
                        de8Var2.a(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0), this, getCurrentItemView().getImageReceiver(), null, 0);
                    }
                }
                if (this.i1.a(motionEvent, this, getCurrentItemView().getImageReceiver(), null, 0)) {
                    if (!this.J0) {
                        this.J0 = true;
                        if (at8Var != null) {
                            at8Var.a();
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
                if (dt8Var.c.size() > 1 && at8Var != null) {
                    at8Var.b(motionEvent.getX() < ((float) getWidth()) / 3.0f);
                }
                this.J0 = false;
            } else if (action == 1) {
                if (!this.J0) {
                    int realCount = getRealCount();
                    int currentItem = getCurrentItem();
                    if (realCount > 1) {
                        if (motionEvent.getX() > getWidth() / 3.0f) {
                            i = dt8Var.j();
                            int i2 = currentItem + 1;
                            if (i2 < realCount + i) {
                                i = i2;
                            }
                        } else {
                            int i3 = (-1) + currentItem;
                            i = i3 < dt8Var.j() ? (realCount + r0) - 1 : i3;
                        }
                        if (at8Var != null) {
                            at8Var.a();
                        }
                        x(i, false);
                    }
                }
            } else if (action == 2) {
                float x = motionEvent.getX() - pointF.x;
                float y = motionEvent.getY() - pointF.y;
                float abs = Math.abs(y);
                float f = this.z0;
                boolean z = abs >= f || Math.abs(x) >= f;
                if (z) {
                    this.J0 = true;
                    if (at8Var != null) {
                        at8Var.a();
                    }
                }
                if (this.C0) {
                    if (this.B0) {
                        if (z) {
                            if (Math.abs(y) > Math.abs(x)) {
                                this.C0 = false;
                                MotionEvent obtain2 = MotionEvent.obtain(motionEvent);
                                obtain2.setAction(3);
                                super.onTouchEvent(obtain2);
                                obtain2.recycle();
                            } else {
                                this.B0 = false;
                                MotionEvent obtain3 = MotionEvent.obtain(motionEvent);
                                obtain3.setAction(3);
                                d79Var.onTouchEvent(obtain3);
                                obtain3.recycle();
                            }
                        }
                    } else if (!canScrollHorizontally(-1)) {
                    }
                }
            }
            boolean onTouchEvent = this.B0 ? d79Var.onTouchEvent(motionEvent) : false;
            if (this.C0) {
                try {
                    onTouchEvent |= super.onTouchEvent(motionEvent);
                } catch (Exception e) {
                    cc4.g(e, true);
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
    public void setAlpha(float f) {
        super.setAlpha(f);
        ws8 ws8Var = this.q1;
        if (ws8Var != null) {
            ws8Var.setAlpha(f);
        }
    }

    public void setAnimatedFileMaybe(lm lmVar) {
        dt8 dt8Var;
        if (lmVar == null || (dt8Var = this.E0) == null) {
            return;
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if ((childAt instanceof de0) && dt8Var.k(dt8Var.d.indexOf(childAt)) == 0) {
                de0 de0Var = (de0) childAt;
                lm m = de0Var.getImageReceiver().m();
                if (m != lmVar) {
                    if (m != null) {
                        m.w(de0Var);
                    }
                    de0Var.setImageDrawable(lmVar);
                    lmVar.f(this);
                    lmVar.S = true;
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
        if (arrayList2.get(0) == null || !xb4.U(((jn5) arrayList2.get(0)).f, this.G0.chat_photo)) {
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
            TLRPC.VideoSize x = xb4.x(1000, this.G0.chat_photo.video_sizes);
            arrayList4.set(0, jn5.j(x, this.G0.chat_photo));
            arrayList3.set(0, xb4.r(null, x));
            at8 at8Var = this.H0;
            if (at8Var != null) {
                at8Var.c();
            }
        }
        this.c1.set(0, null);
        this.E0.g();
    }

    public void setCreateThumbFromParent(boolean z) {
        this.f1 = z;
    }

    public void setData(long j) {
        M(j, false);
    }

    public void setHasActiveVideo(boolean z) {
        this.j1 = z;
    }

    public void setImagesLayerNum(int i) {
        this.m1 = i;
    }

    public void setInvalidateWithParent(boolean z) {
        this.h1 = z;
    }

    public void setParentAvatarImage(de0 de0Var) {
        dt8 dt8Var = this.E0;
        if (dt8Var != null) {
            dt8Var.g = de0Var;
        }
    }

    public void setPinchToZoomHelper(de8 de8Var) {
        this.i1 = de8Var;
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        ws8 ws8Var = this.q1;
        if (ws8Var != null) {
            ws8Var.setVisibility(i);
        }
    }

    public void setCustomAvatarProgress(float f) {
    }

    public et8(Activity activity, a aVar, d79 d79Var, sb0 sb0Var) {
        super(activity);
        this.y0 = new PointF();
        this.B0 = true;
        this.C0 = true;
        int i = yac.t0;
        this.M0 = i;
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
        this.D0 = d79Var;
        ConnectionsManager.generateClassGuid();
        this.A0 = aVar;
        this.z0 = ViewConfiguration.get(activity).getScaledTouchSlop();
        this.H0 = sb0Var;
        b(new xs8(this));
        dt8 dt8Var = new dt8(this, getContext(), null);
        this.E0 = dt8Var;
        setAdapter((gi2) dt8Var);
        jn7.f(i).b(this, jn7.b0);
        jn7.f(i).b(this, jn7.Y1);
        jn7.f(i).b(this, jn7.X1);
        jn7.f(i).b(this, jn7.c0);
        jn7.f(i).b(this, jn7.g3);
        this.T0 = null;
    }
}
