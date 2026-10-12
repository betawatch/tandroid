package e0;

import android.app.Notification;
import android.app.RemoteInput;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import androidx.core.graphics.drawable.IconCompat;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.telegram.messenger.NotificationsController;
import org.telegram.ui.Components.vz0;
import org.telegram.ui.Components.xz0;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes.dex */
public final class g0 implements j4.a0 {
    public int a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;

    public g0(int i10) {
        this.a = i10;
        int i11 = i10 * 8;
        this.b = new float[i11];
        this.c = new float[i11];
        this.d = new short[i10 * 6];
        this.e = new int[i10 * 4];
        for (short s10 = 0; s10 < i10; s10 = (short) (s10 + 1)) {
            int i12 = s10 * 6;
            int i13 = s10 * 4;
            short[] sArr = (short[]) this.d;
            short s11 = (short) i13;
            sArr[i12] = s11;
            sArr[i12 + 1] = (short) (i13 + 1);
            short s12 = (short) (i13 + 2);
            sArr[i12 + 2] = s12;
            sArr[i12 + 3] = s12;
            sArr[i12 + 4] = (short) (i13 + 3);
            sArr[i12 + 5] = s11;
        }
    }

    public static void c(float[] fArr, int i10, float f7, float f10, float f11, float f12) {
        int i11 = i10 * 8;
        fArr[i11] = f7;
        fArr[i11 + 1] = f10;
        fArr[i11 + 2] = f11;
        fArr[i11 + 3] = f10;
        fArr[i11 + 4] = f11;
        fArr[i11 + 5] = f12;
        fArr[i11 + 6] = f7;
        fArr[i11 + 7] = f12;
    }

    public static void d(Notification notification) {
        notification.sound = null;
        notification.vibrate = null;
        notification.defaults &= -4;
    }

    @Override // j4.a0
    public void a(e2.x xVar) {
        e2.k0 k0Var;
        e2.k0 k0Var2;
        SparseArray sparseArray;
        int i10;
        a4.g gVar;
        char c10;
        int i11;
        int i12;
        e2.k0 k0Var3;
        SparseArray sparseArray2 = (SparseArray) this.c;
        SparseIntArray sparseIntArray = (SparseIntArray) this.d;
        a4.g gVar2 = (a4.g) this.b;
        j4.d0 d0Var = (j4.d0) this.e;
        SparseArray sparseArray3 = d0Var.h;
        SparseBooleanArray sparseBooleanArray = d0Var.i;
        j4.f fVar = d0Var.f;
        List list = d0Var.c;
        int i13 = d0Var.a;
        if (xVar.A() == 2) {
            if (i13 == 1 || i13 == 2 || d0Var.n == 1) {
                k0Var = (e2.k0) list.get(0);
            } else {
                k0Var = new e2.k0(((e2.k0) list.get(0)).d());
                list.add(k0Var);
            }
            if ((xVar.A() & 128) != 0) {
                xVar.O(1);
                int H = xVar.H();
                xVar.O(3);
                xVar.k(0, 2, gVar2.b);
                gVar2.m(0);
                gVar2.o(3);
                d0Var.t = gVar2.g(13);
                xVar.k(0, 2, gVar2.b);
                gVar2.m(0);
                gVar2.o(4);
                xVar.O(gVar2.g(12));
                if (i13 == 2 && d0Var.r == null) {
                    j4.g0 a2 = fVar.a(21, new j6.l(21, null, 0, null, e2.m0.b));
                    d0Var.r = a2;
                    if (a2 != null) {
                        a2.b(k0Var, d0Var.m, new j4.f0(H, 21, 8192));
                    }
                }
                sparseArray2.clear();
                sparseIntArray.clear();
                int a10 = xVar.a();
                while (a10 > 0) {
                    xVar.k(0, 5, gVar2.b);
                    gVar2.m(0);
                    int g10 = gVar2.g(8);
                    gVar2.o(3);
                    int g11 = gVar2.g(13);
                    gVar2.o(4);
                    int g12 = gVar2.g(12);
                    int i14 = xVar.b;
                    int i15 = i14 + g12;
                    int i16 = -1;
                    String str = null;
                    ArrayList arrayList = null;
                    int i17 = 0;
                    int i18 = a10;
                    while (true) {
                        if (xVar.b >= i15) {
                            gVar = gVar2;
                            break;
                        }
                        int A = xVar.A();
                        gVar = gVar2;
                        int A2 = xVar.b + xVar.A();
                        if (A2 > i15) {
                            break;
                        }
                        SparseArray sparseArray4 = sparseArray3;
                        if (A == 5) {
                            long C = xVar.C();
                            if (C == 1094921523) {
                                i16 = 129;
                            } else if (C == 1161904947) {
                                i16 = 135;
                            } else {
                                if (C != 1094921524) {
                                    if (C == 1212503619) {
                                        i16 = 36;
                                    }
                                }
                                i16 = 172;
                            }
                            i11 = A2;
                            i12 = H;
                            k0Var3 = k0Var;
                        } else if (A == 106) {
                            i11 = A2;
                            i12 = H;
                            k0Var3 = k0Var;
                            i16 = 129;
                        } else if (A == 122) {
                            i12 = H;
                            k0Var3 = k0Var;
                            i16 = 135;
                            i11 = A2;
                        } else {
                            if (A == 127) {
                                int A3 = xVar.A();
                                if (A3 != 21) {
                                    if (A3 == 14) {
                                        i16 = 136;
                                    } else if (A3 == 33) {
                                        i16 = 139;
                                    }
                                }
                                i16 = 172;
                            } else if (A == 123) {
                                i16 = 138;
                            } else if (A == 10) {
                                str = xVar.y(3, StandardCharsets.UTF_8).trim();
                                i11 = A2;
                                i17 = xVar.A();
                                i12 = H;
                                k0Var3 = k0Var;
                            } else {
                                if (A == 89) {
                                    ArrayList arrayList2 = new ArrayList();
                                    while (xVar.b < A2) {
                                        String trim = xVar.y(3, StandardCharsets.UTF_8).trim();
                                        xVar.A();
                                        e2.k0 k0Var4 = k0Var;
                                        byte[] bArr = new byte[4];
                                        xVar.k(0, 4, bArr);
                                        arrayList2.add(new j4.e0(trim, bArr));
                                        k0Var = k0Var4;
                                        A2 = A2;
                                        H = H;
                                    }
                                    i11 = A2;
                                    i12 = H;
                                    k0Var3 = k0Var;
                                    arrayList = arrayList2;
                                    i16 = 89;
                                } else {
                                    i11 = A2;
                                    i12 = H;
                                    k0Var3 = k0Var;
                                    if (A == 111) {
                                        i16 = 257;
                                    }
                                }
                                xVar.O(i11 - xVar.b);
                                k0Var = k0Var3;
                                gVar2 = gVar;
                                sparseArray3 = sparseArray4;
                                H = i12;
                            }
                            i11 = A2;
                            i12 = H;
                            k0Var3 = k0Var;
                        }
                        xVar.O(i11 - xVar.b);
                        k0Var = k0Var3;
                        gVar2 = gVar;
                        sparseArray3 = sparseArray4;
                        H = i12;
                    }
                    SparseArray sparseArray5 = sparseArray3;
                    int i19 = H;
                    e2.k0 k0Var5 = k0Var;
                    xVar.N(i15);
                    j6.l lVar = new j6.l(i16, str, i17, arrayList, Arrays.copyOfRange(xVar.a, i14, i15));
                    if (g10 == 6 || g10 == 5) {
                        g10 = i16;
                    }
                    int i20 = i18 - (g12 + 5);
                    int i21 = i13 == 2 ? g10 : g11;
                    if (sparseBooleanArray.get(i21)) {
                        c10 = 21;
                    } else {
                        c10 = 21;
                        j4.g0 a11 = (i13 == 2 && g10 == 21) ? d0Var.r : fVar.a(g10, lVar);
                        if (i13 != 2 || g11 < sparseIntArray.get(i21, 8192)) {
                            sparseIntArray.put(i21, g11);
                            sparseArray2.put(i21, a11);
                        }
                    }
                    a10 = i20;
                    k0Var = k0Var5;
                    gVar2 = gVar;
                    sparseArray3 = sparseArray5;
                    H = i19;
                }
                SparseArray sparseArray6 = sparseArray3;
                int i22 = H;
                e2.k0 k0Var6 = k0Var;
                int size = sparseIntArray.size();
                int i23 = 0;
                while (i23 < size) {
                    int keyAt = sparseIntArray.keyAt(i23);
                    int valueAt = sparseIntArray.valueAt(i23);
                    sparseBooleanArray.put(keyAt, true);
                    d0Var.j.put(valueAt, true);
                    j4.g0 g0Var = (j4.g0) sparseArray2.valueAt(i23);
                    if (g0Var != null) {
                        if (g0Var != d0Var.r) {
                            i10 = i22;
                            k0Var2 = k0Var6;
                            g0Var.b(k0Var2, d0Var.m, new j4.f0(i10, keyAt, 8192));
                        } else {
                            k0Var2 = k0Var6;
                            i10 = i22;
                        }
                        sparseArray = sparseArray6;
                        sparseArray.put(valueAt, g0Var);
                    } else {
                        k0Var2 = k0Var6;
                        sparseArray = sparseArray6;
                        i10 = i22;
                    }
                    i23++;
                    sparseArray6 = sparseArray;
                    i22 = i10;
                    k0Var6 = k0Var2;
                }
                SparseArray sparseArray7 = sparseArray6;
                if (i13 == 2) {
                    if (d0Var.o) {
                        return;
                    }
                    d0Var.m.D();
                    d0Var.n = 0;
                    d0Var.o = true;
                    return;
                }
                sparseArray7.remove(this.a);
                int i24 = i13 == 1 ? 0 : d0Var.n - 1;
                d0Var.n = i24;
                if (i24 == 0) {
                    d0Var.m.D();
                    d0Var.o = true;
                }
            }
        }
    }

    public void e(int i10, int i11) {
        int[] iArr = (int[]) this.e;
        int i12 = i10 * 4;
        iArr[i12] = i11;
        iArr[i12 + 1] = i11;
        iArr[i12 + 2] = i11;
        iArr[i12 + 3] = i11;
    }

    public void f(int i10) {
        int[] iArr = (int[]) this.d;
        if (iArr[i10] != 0) {
            return;
        }
        iArr[i10] = 1;
        for (vz0 vz0Var : ((vz0[][]) this.c)[i10]) {
            f(vz0Var.a.b);
            vz0[] vz0VarArr = (vz0[]) this.b;
            int i11 = this.a;
            this.a = i11 - 1;
            vz0VarArr[i11] = vz0Var;
        }
        iArr[i10] = 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0413  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0437  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0462  */
    /* JADX WARN: Removed duplicated region for block: B:150:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:157:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public g0(r rVar) {
        String str;
        int i10;
        Notification.BubbleMetadata bubbleMetadata;
        int i11;
        Notification.BubbleMetadata a2;
        f0.f fVar;
        Bundle bundle;
        ArrayList arrayList;
        int i12;
        Bundle[] bundleArr;
        ArrayList arrayList2;
        Bundle bundle2;
        new ArrayList();
        this.e = new Bundle();
        this.d = rVar;
        Context context = rVar.a;
        ArrayList arrayList3 = rVar.F;
        ArrayList arrayList4 = rVar.c;
        ArrayList arrayList5 = rVar.d;
        this.b = context;
        if (Build.VERSION.SDK_INT >= 26) {
            this.c = c2.i.b(context, rVar.y);
        } else {
            this.c = new Notification.Builder(context);
        }
        Notification notification = rVar.E;
        Context context2 = null;
        ((Notification.Builder) this.c).setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, null).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(rVar.e).setContentText(rVar.f).setContentInfo(null).setContentIntent(rVar.g).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(null, (notification.flags & 128) != 0).setNumber(rVar.i).setProgress(rVar.n, rVar.o, rVar.p);
        Notification.Builder builder = (Notification.Builder) this.c;
        IconCompat iconCompat = rVar.h;
        builder.setLargeIcon(iconCompat == null ? null : iconCompat.m(context));
        ((Notification.Builder) this.c).setSubText(rVar.m).setUsesChronometer(false).setPriority(rVar.j);
        ArrayList arrayList6 = rVar.b;
        int size = arrayList6.size();
        int i13 = 0;
        while (true) {
            str = "android.support.allowGeneratedReplies";
            if (i13 >= size) {
                break;
            }
            Object obj = arrayList6.get(i13);
            i13++;
            i iVar = (i) obj;
            IconCompat a10 = iVar.a();
            int i14 = iVar.f;
            boolean z10 = iVar.d;
            Bundle bundle3 = iVar.a;
            ArrayList arrayList7 = arrayList6;
            int i15 = size;
            Notification.Action.Builder builder2 = new Notification.Action.Builder(a10 != null ? a10.m(context2) : context2, iVar.h, iVar.i);
            p0[] p0VarArr = iVar.c;
            if (p0VarArr != null) {
                RemoteInput[] a11 = p0.a(p0VarArr);
                int length = a11.length;
                int i16 = 0;
                while (i16 < length) {
                    RemoteInput[] remoteInputArr = a11;
                    builder2.addRemoteInput(remoteInputArr[i16]);
                    i16++;
                    a11 = remoteInputArr;
                }
            }
            if (bundle3 != null) {
                bundle2 = new Bundle(bundle3);
            } else {
                bundle2 = new Bundle();
            }
            bundle2.putBoolean("android.support.allowGeneratedReplies", z10);
            int i17 = Build.VERSION.SDK_INT;
            if (i17 >= 24) {
                androidx.emoji2.text.w.h(builder2, z10);
            }
            bundle2.putInt("android.support.action.semanticAction", i14);
            if (i17 >= 28) {
                b5.d.y(builder2, i14);
            }
            if (i17 >= 29) {
                b2.d.l(builder2);
            }
            if (i17 >= 31) {
                f0.e(builder2);
            }
            bundle2.putBoolean("android.support.action.showsUserInterface", iVar.e);
            builder2.addExtras(bundle2);
            ((Notification.Builder) this.c).addAction(builder2.build());
            arrayList6 = arrayList7;
            size = i15;
            context2 = null;
        }
        Bundle bundle4 = rVar.v;
        if (bundle4 != null) {
            ((Bundle) this.e).putAll(bundle4);
        }
        int i18 = Build.VERSION.SDK_INT;
        ((Notification.Builder) this.c).setShowWhen(rVar.k);
        ((Notification.Builder) this.c).setLocalOnly(rVar.t);
        ((Notification.Builder) this.c).setGroup(rVar.q);
        ((Notification.Builder) this.c).setSortKey(rVar.s);
        ((Notification.Builder) this.c).setGroupSummary(rVar.r);
        this.a = rVar.B;
        ((Notification.Builder) this.c).setCategory(rVar.u);
        ((Notification.Builder) this.c).setColor(rVar.w);
        ((Notification.Builder) this.c).setVisibility(rVar.x);
        ((Notification.Builder) this.c).setPublicVersion(null);
        ((Notification.Builder) this.c).setSound(notification.sound, notification.audioAttributes);
        if (i18 < 28) {
            if (arrayList4 == null) {
                arrayList2 = null;
            } else {
                arrayList2 = new ArrayList(arrayList4.size());
                int size2 = arrayList4.size();
                int i19 = 0;
                while (i19 < size2) {
                    Object obj2 = arrayList4.get(i19);
                    i19++;
                    n0 n0Var = (n0) obj2;
                    CharSequence charSequence = n0Var.a;
                    String str2 = n0Var.c;
                    if (str2 == null) {
                        if (charSequence != null) {
                            str2 = "name:" + ((Object) charSequence);
                        } else {
                            str2 = "";
                        }
                    }
                    arrayList2.add(str2);
                }
            }
            if (arrayList2 != null) {
                if (arrayList3 == null) {
                    arrayList3 = arrayList2;
                } else {
                    a0.g gVar = new a0.g(arrayList3.size() + arrayList2.size());
                    gVar.addAll(arrayList2);
                    gVar.addAll(arrayList3);
                    arrayList3 = new ArrayList(gVar);
                }
            }
        }
        if (arrayList3 != null && !arrayList3.isEmpty()) {
            int size3 = arrayList3.size();
            int i20 = 0;
            while (i20 < size3) {
                Object obj3 = arrayList3.get(i20);
                i20++;
                ((Notification.Builder) this.c).addPerson((String) obj3);
            }
        }
        if (arrayList5.size() > 0) {
            if (rVar.v == null) {
                rVar.v = new Bundle();
            }
            Bundle bundle5 = rVar.v.getBundle("android.car.EXTENSIONS");
            bundle5 = bundle5 == null ? new Bundle() : bundle5;
            Bundle bundle6 = new Bundle(bundle5);
            Bundle bundle7 = new Bundle();
            int i21 = 0;
            while (i21 < arrayList5.size()) {
                String num = Integer.toString(i21);
                i iVar2 = (i) arrayList5.get(i21);
                Bundle bundle8 = new Bundle();
                IconCompat a12 = iVar2.a();
                Bundle bundle9 = iVar2.a;
                bundle8.putInt("icon", a12 != null ? a12.g() : 0);
                bundle8.putCharSequence("title", iVar2.h);
                bundle8.putParcelable("actionIntent", iVar2.i);
                if (bundle9 != null) {
                    bundle = new Bundle(bundle9);
                } else {
                    bundle = new Bundle();
                }
                bundle.putBoolean(str, iVar2.d);
                bundle8.putBundle("extras", bundle);
                p0[] p0VarArr2 = iVar2.c;
                if (p0VarArr2 == null) {
                    arrayList = arrayList5;
                    i12 = i21;
                    bundleArr = null;
                } else {
                    Bundle[] bundleArr2 = new Bundle[p0VarArr2.length];
                    arrayList = arrayList5;
                    i12 = i21;
                    int i22 = 0;
                    while (i22 < p0VarArr2.length) {
                        p0 p0Var = p0VarArr2[i22];
                        int i23 = i22;
                        Bundle bundle10 = new Bundle();
                        p0Var.getClass();
                        p0[] p0VarArr3 = p0VarArr2;
                        String str3 = str;
                        bundle10.putString("resultKey", NotificationsController.EXTRA_VOICE_REPLY);
                        bundle10.putCharSequence("label", p0Var.a);
                        bundle10.putCharSequenceArray("choices", null);
                        bundle10.putBoolean("allowFreeFormInput", true);
                        bundle10.putBundle("extras", p0Var.b);
                        HashSet hashSet = p0Var.c;
                        if (!hashSet.isEmpty()) {
                            ArrayList<String> arrayList8 = new ArrayList<>(hashSet.size());
                            Iterator it = hashSet.iterator();
                            while (it.hasNext()) {
                                arrayList8.add((String) it.next());
                            }
                            bundle10.putStringArrayList("allowedDataTypes", arrayList8);
                        }
                        bundleArr2[i23] = bundle10;
                        i22 = i23 + 1;
                        p0VarArr2 = p0VarArr3;
                        str = str3;
                    }
                    bundleArr = bundleArr2;
                }
                String str4 = str;
                bundle8.putParcelableArray("remoteInputs", bundleArr);
                bundle8.putBoolean("showsUserInterface", iVar2.e);
                bundle8.putInt("semanticAction", iVar2.f);
                bundle7.putBundle(num, bundle8);
                i21 = i12 + 1;
                arrayList5 = arrayList;
                str = str4;
            }
            bundle5.putBundle("invisible_actions", bundle7);
            bundle6.putBundle("invisible_actions", bundle7);
            if (rVar.v == null) {
                rVar.v = new Bundle();
            }
            rVar.v.putBundle("android.car.EXTENSIONS", bundle5);
            ((Bundle) this.e).putBundle("android.car.EXTENSIONS", bundle6);
        }
        int i24 = Build.VERSION.SDK_INT;
        if (i24 >= 24) {
            ((Notification.Builder) this.c).setExtras(rVar.v);
            androidx.emoji2.text.w.i((Notification.Builder) this.c);
        }
        if (i24 >= 26) {
            c2.i.i((Notification.Builder) this.c);
            c2.i.k((Notification.Builder) this.c);
            c2.i.l((Notification.Builder) this.c, rVar.z);
            c2.i.m((Notification.Builder) this.c);
            c2.i.j((Notification.Builder) this.c, rVar.B);
            if (!TextUtils.isEmpty(rVar.y)) {
                bubbleMetadata = null;
                i10 = 0;
                ((Notification.Builder) this.c).setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
                if (i24 >= 28) {
                    int size4 = arrayList4.size();
                    int i25 = i10;
                    while (i25 < size4) {
                        Object obj4 = arrayList4.get(i25);
                        i25++;
                        n0 n0Var2 = (n0) obj4;
                        Notification.Builder builder3 = (Notification.Builder) this.c;
                        n0Var2.getClass();
                        b5.d.a(builder3, b5.d.E(n0Var2));
                    }
                }
                i11 = Build.VERSION.SDK_INT;
                if (i11 >= 29) {
                    return;
                }
                b2.d.i((Notification.Builder) this.c, rVar.C);
                Notification.Builder builder4 = (Notification.Builder) this.c;
                p pVar = rVar.D;
                if (pVar != null) {
                    if (i11 >= 30) {
                        a2 = o.a(pVar);
                    } else if (i11 == 29) {
                        a2 = n.a(pVar);
                    }
                    b2.d.k(builder4, a2);
                    fVar = rVar.A;
                    if (fVar == null) {
                        b2.d.n((Notification.Builder) this.c, fVar.b);
                        return;
                    }
                    return;
                }
                a2 = bubbleMetadata;
                b2.d.k(builder4, a2);
                fVar = rVar.A;
                if (fVar == null) {
                }
            }
        }
        i10 = 0;
        bubbleMetadata = null;
        if (i24 >= 28) {
        }
        i11 = Build.VERSION.SDK_INT;
        if (i11 >= 29) {
        }
    }

    @Override // j4.a0
    public void b(e2.k0 k0Var, c3.q qVar, j4.f0 f0Var) {
    }

    public g0(c3.z zVar, c3.k0 k0Var, byte[] bArr, ai.a[] aVarArr, int i10) {
        this.b = zVar;
        this.c = k0Var;
        this.d = bArr;
        this.e = aVarArr;
        this.a = i10;
    }

    public g0(j4.d0 d0Var, int i10) {
        this.e = d0Var;
        this.b = new a4.g(new byte[5], 5);
        this.c = new SparseArray();
        this.d = new SparseIntArray();
        this.a = i10;
    }

    public g0(xz0 xz0Var, vz0[] vz0VarArr) {
        this.e = xz0Var;
        int length = vz0VarArr.length;
        this.b = new vz0[length];
        this.a = length - 1;
        int e = xz0Var.e() + 1;
        vz0[][] vz0VarArr2 = new vz0[e][];
        int[] iArr = new int[e];
        for (vz0 vz0Var : vz0VarArr) {
            int i10 = vz0Var.a.a;
            iArr[i10] = iArr[i10] + 1;
        }
        for (int i11 = 0; i11 < e; i11++) {
            vz0VarArr2[i11] = new vz0[iArr[i11]];
        }
        Arrays.fill(iArr, 0);
        for (vz0 vz0Var2 : vz0VarArr) {
            int i12 = vz0Var2.a.a;
            vz0[] vz0VarArr3 = vz0VarArr2[i12];
            int i13 = iArr[i12];
            iArr[i12] = i13 + 1;
            vz0VarArr3[i13] = vz0Var2;
        }
        this.c = vz0VarArr2;
        this.d = new int[((xz0) this.e).e() + 1];
    }
}
