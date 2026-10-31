package cc;

import a4.g;
import a4.l;
import ac.h;
import android.app.Notification;
import android.app.RemoteInput;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import androidx.core.graphics.drawable.IconCompat;
import androidx.emoji2.text.w;
import c3.m0;
import c3.q;
import c3.z;
import e0.i;
import e0.n;
import e0.n0;
import e0.o;
import e0.p;
import e0.r;
import e2.k0;
import e2.l0;
import e2.x;
import j4.b0;
import j4.e0;
import j4.f0;
import j4.g0;
import j4.h0;
import j6.m;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.telegram.messenger.zs;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.dy0;
import org.telegram.ui.Components.fy0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class f implements b0 {
    public final /* synthetic */ int a;
    public int b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;

    public /* synthetic */ f() {
        this.a = 0;
    }

    public static void a(float[] fArr, int i10, float f7, float f10, float f11, float f12) {
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

    public static void e(Notification notification) {
        notification.sound = null;
        notification.vibrate = null;
        notification.defaults &= -4;
    }

    public void b() {
        ((Canvas) this.c).restore();
        ((Matrix) this.d).set((Matrix) i0.a.v(1, (ArrayList) this.e));
        this.b--;
    }

    @Override // j4.b0
    public void c(x xVar) {
        k0 k0Var;
        k0 k0Var2;
        SparseArray sparseArray;
        int i10;
        g gVar;
        char c10;
        int i11;
        int i12;
        k0 k0Var3;
        SparseArray sparseArray2 = (SparseArray) this.d;
        SparseIntArray sparseIntArray = (SparseIntArray) this.e;
        g gVar2 = (g) this.c;
        e0 e0Var = (e0) this.f;
        SparseArray sparseArray3 = e0Var.h;
        SparseBooleanArray sparseBooleanArray = e0Var.i;
        j4.f fVar = e0Var.f;
        List list = e0Var.c;
        int i13 = e0Var.a;
        if (xVar.A() == 2) {
            if (i13 == 1 || i13 == 2 || e0Var.n == 1) {
                k0Var = (k0) list.get(0);
            } else {
                k0Var = new k0(((k0) list.get(0)).d());
                list.add(k0Var);
            }
            if ((xVar.A() & 128) != 0) {
                xVar.O(1);
                int H = xVar.H();
                xVar.O(3);
                xVar.k(0, 2, (byte[]) gVar2.b);
                gVar2.d0(0);
                gVar2.f0(3);
                e0Var.t = gVar2.i(13);
                xVar.k(0, 2, (byte[]) gVar2.b);
                gVar2.d0(0);
                gVar2.f0(4);
                xVar.O(gVar2.i(12));
                if (i13 == 2 && e0Var.r == null) {
                    h0 a2 = fVar.a(21, new m(21, null, 0, null, l0.b));
                    e0Var.r = a2;
                    if (a2 != null) {
                        a2.d(k0Var, e0Var.m, new g0(H, 21, TLObject.FLAG_13));
                    }
                }
                sparseArray2.clear();
                sparseIntArray.clear();
                int a10 = xVar.a();
                while (a10 > 0) {
                    xVar.k(0, 5, (byte[]) gVar2.b);
                    gVar2.d0(0);
                    int i14 = gVar2.i(8);
                    gVar2.f0(3);
                    int i15 = gVar2.i(13);
                    gVar2.f0(4);
                    int i16 = gVar2.i(12);
                    int i17 = xVar.b;
                    int i18 = i17 + i16;
                    int i19 = -1;
                    String str = null;
                    ArrayList arrayList = null;
                    int i20 = 0;
                    int i21 = a10;
                    while (true) {
                        if (xVar.b >= i18) {
                            gVar = gVar2;
                            break;
                        }
                        int A = xVar.A();
                        gVar = gVar2;
                        int A2 = xVar.b + xVar.A();
                        if (A2 > i18) {
                            break;
                        }
                        SparseArray sparseArray4 = sparseArray3;
                        if (A == 5) {
                            long C = xVar.C();
                            if (C == 1094921523) {
                                i19 = 129;
                            } else if (C == 1161904947) {
                                i19 = 135;
                            } else {
                                if (C != 1094921524) {
                                    if (C == 1212503619) {
                                        i19 = 36;
                                    }
                                }
                                i19 = 172;
                            }
                            i11 = A2;
                            i12 = H;
                            k0Var3 = k0Var;
                        } else if (A == 106) {
                            i11 = A2;
                            i12 = H;
                            k0Var3 = k0Var;
                            i19 = 129;
                        } else if (A == 122) {
                            i12 = H;
                            k0Var3 = k0Var;
                            i19 = 135;
                            i11 = A2;
                        } else {
                            if (A == 127) {
                                int A3 = xVar.A();
                                if (A3 != 21) {
                                    if (A3 == 14) {
                                        i19 = zs.S1;
                                    } else if (A3 == 33) {
                                        i19 = zs.V1;
                                    }
                                }
                                i19 = 172;
                            } else if (A == 123) {
                                i19 = 138;
                            } else if (A == 10) {
                                str = xVar.y(3, StandardCharsets.UTF_8).trim();
                                i11 = A2;
                                i20 = xVar.A();
                                i12 = H;
                                k0Var3 = k0Var;
                            } else {
                                if (A == 89) {
                                    ArrayList arrayList2 = new ArrayList();
                                    while (xVar.b < A2) {
                                        String trim = xVar.y(3, StandardCharsets.UTF_8).trim();
                                        xVar.A();
                                        k0 k0Var4 = k0Var;
                                        byte[] bArr = new byte[4];
                                        xVar.k(0, 4, bArr);
                                        arrayList2.add(new f0(trim, bArr));
                                        k0Var = k0Var4;
                                        A2 = A2;
                                        H = H;
                                    }
                                    i11 = A2;
                                    i12 = H;
                                    k0Var3 = k0Var;
                                    arrayList = arrayList2;
                                    i19 = 89;
                                } else {
                                    i11 = A2;
                                    i12 = H;
                                    k0Var3 = k0Var;
                                    if (A == 111) {
                                        i19 = 257;
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
                    int i22 = H;
                    k0 k0Var5 = k0Var;
                    xVar.N(i18);
                    m mVar = new m(i19, str, i20, arrayList, Arrays.copyOfRange(xVar.a, i17, i18));
                    if (i14 == 6 || i14 == 5) {
                        i14 = i19;
                    }
                    int i23 = i21 - (i16 + 5);
                    int i24 = i13 == 2 ? i14 : i15;
                    if (sparseBooleanArray.get(i24)) {
                        c10 = 21;
                    } else {
                        c10 = 21;
                        h0 a11 = (i13 == 2 && i14 == 21) ? e0Var.r : fVar.a(i14, mVar);
                        if (i13 != 2 || i15 < sparseIntArray.get(i24, TLObject.FLAG_13)) {
                            sparseIntArray.put(i24, i15);
                            sparseArray2.put(i24, a11);
                        }
                    }
                    a10 = i23;
                    k0Var = k0Var5;
                    gVar2 = gVar;
                    sparseArray3 = sparseArray5;
                    H = i22;
                }
                SparseArray sparseArray6 = sparseArray3;
                int i25 = H;
                k0 k0Var6 = k0Var;
                int size = sparseIntArray.size();
                int i26 = 0;
                while (i26 < size) {
                    int keyAt = sparseIntArray.keyAt(i26);
                    int valueAt = sparseIntArray.valueAt(i26);
                    sparseBooleanArray.put(keyAt, true);
                    e0Var.j.put(valueAt, true);
                    h0 h0Var = (h0) sparseArray2.valueAt(i26);
                    if (h0Var != null) {
                        if (h0Var != e0Var.r) {
                            i10 = i25;
                            k0Var2 = k0Var6;
                            h0Var.d(k0Var2, e0Var.m, new g0(i10, keyAt, TLObject.FLAG_13));
                        } else {
                            k0Var2 = k0Var6;
                            i10 = i25;
                        }
                        sparseArray = sparseArray6;
                        sparseArray.put(valueAt, h0Var);
                    } else {
                        k0Var2 = k0Var6;
                        sparseArray = sparseArray6;
                        i10 = i25;
                    }
                    i26++;
                    sparseArray6 = sparseArray;
                    i25 = i10;
                    k0Var6 = k0Var2;
                }
                SparseArray sparseArray7 = sparseArray6;
                if (i13 == 2) {
                    if (e0Var.o) {
                        return;
                    }
                    e0Var.m.Q0();
                    e0Var.n = 0;
                    e0Var.o = true;
                    return;
                }
                sparseArray7.remove(this.b);
                int i27 = i13 == 1 ? 0 : e0Var.n - 1;
                e0Var.n = i27;
                if (i27 == 0) {
                    e0Var.m.Q0();
                    e0Var.o = true;
                }
            }
        }
    }

    public void f(int i10, int i11) {
        int[] iArr = (int[]) this.f;
        int i12 = i10 * 4;
        iArr[i12] = i11;
        iArr[i12 + 1] = i11;
        iArr[i12 + 2] = i11;
        iArr[i12 + 3] = i11;
    }

    public void g(int i10) {
        int[] iArr = (int[]) this.e;
        if (iArr[i10] != 0) {
            return;
        }
        iArr[i10] = 1;
        for (dy0 dy0Var : ((dy0[][]) this.d)[i10]) {
            g(dy0Var.a.b);
            dy0[] dy0VarArr = (dy0[]) this.c;
            int i11 = this.b;
            this.b = i11 - 1;
            dy0VarArr[i11] = dy0Var;
        }
        iArr[i10] = 2;
    }

    public String toString() {
        switch (this.a) {
            case 0:
                StringBuilder sb2 = new StringBuilder(zs.e3);
                sb2.append("<<\n mode: ");
                sb2.append((ac.f) this.c);
                sb2.append("\n ecLevel: ");
                sb2.append((ac.d) this.d);
                sb2.append("\n version: ");
                sb2.append((h) this.e);
                sb2.append("\n maskPattern: ");
                sb2.append(this.b);
                if (((b4.d) this.f) == null) {
                    sb2.append("\n matrix: null\n");
                } else {
                    sb2.append("\n matrix:\n");
                    sb2.append((b4.d) this.f);
                }
                sb2.append(">>\n");
                return sb2.toString();
            default:
                return super.toString();
        }
    }

    public f(int i10) {
        this.a = 3;
        this.b = i10;
        int i11 = i10 * 8;
        this.c = new float[i11];
        this.d = new float[i11];
        this.e = new short[i10 * 6];
        this.f = new int[i10 * 4];
        for (short s10 = 0; s10 < i10; s10 = (short) (s10 + 1)) {
            int i12 = s10 * 6;
            int i13 = s10 * 4;
            short[] sArr = (short[]) this.e;
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

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0413  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0437  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0462  */
    /* JADX WARN: Removed duplicated region for block: B:150:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:157:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public f(r rVar) {
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
        this.a = 1;
        new ArrayList();
        this.f = new Bundle();
        this.e = rVar;
        Context context = rVar.a;
        ArrayList arrayList3 = rVar.G;
        ArrayList arrayList4 = rVar.c;
        ArrayList arrayList5 = rVar.d;
        this.c = context;
        if (Build.VERSION.SDK_INT >= 26) {
            this.d = c2.h.b(context, rVar.y);
        } else {
            this.d = new Notification.Builder(context);
        }
        Notification notification = rVar.F;
        Context context2 = null;
        ((Notification.Builder) this.d).setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, null).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(rVar.e).setContentText(rVar.f).setContentInfo(null).setContentIntent(rVar.g).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(null, (notification.flags & 128) != 0).setNumber(rVar.i).setProgress(rVar.n, rVar.o, rVar.p);
        Notification.Builder builder = (Notification.Builder) this.d;
        IconCompat iconCompat = rVar.h;
        builder.setLargeIcon(iconCompat == null ? null : iconCompat.m(context));
        ((Notification.Builder) this.d).setSubText(rVar.m).setUsesChronometer(false).setPriority(rVar.j);
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
            n0[] n0VarArr = iVar.c;
            if (n0VarArr != null) {
                RemoteInput[] a11 = n0.a(n0VarArr);
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
                w.i(builder2, z10);
            }
            bundle2.putInt("android.support.action.semanticAction", i14);
            if (i17 >= 28) {
                b5.d.y(builder2, i14);
            }
            if (i17 >= 29) {
                b2.d.l(builder2);
            }
            if (i17 >= 31) {
                e0.f0.g(builder2);
            }
            bundle2.putBoolean("android.support.action.showsUserInterface", iVar.e);
            builder2.addExtras(bundle2);
            ((Notification.Builder) this.d).addAction(builder2.build());
            arrayList6 = arrayList7;
            size = i15;
            context2 = null;
        }
        Bundle bundle4 = rVar.v;
        if (bundle4 != null) {
            ((Bundle) this.f).putAll(bundle4);
        }
        int i18 = Build.VERSION.SDK_INT;
        ((Notification.Builder) this.d).setShowWhen(rVar.k);
        ((Notification.Builder) this.d).setLocalOnly(rVar.t);
        ((Notification.Builder) this.d).setGroup(rVar.q);
        ((Notification.Builder) this.d).setSortKey(rVar.s);
        ((Notification.Builder) this.d).setGroupSummary(rVar.r);
        this.b = rVar.C;
        ((Notification.Builder) this.d).setCategory(rVar.u);
        ((Notification.Builder) this.d).setColor(rVar.w);
        ((Notification.Builder) this.d).setVisibility(rVar.x);
        ((Notification.Builder) this.d).setPublicVersion(null);
        ((Notification.Builder) this.d).setSound(notification.sound, notification.audioAttributes);
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
                    e0.l0 l0Var = (e0.l0) obj2;
                    CharSequence charSequence = l0Var.a;
                    String str2 = l0Var.c;
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
                ((Notification.Builder) this.d).addPerson((String) obj3);
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
                n0[] n0VarArr2 = iVar2.c;
                if (n0VarArr2 == null) {
                    arrayList = arrayList5;
                    i12 = i21;
                    bundleArr = null;
                } else {
                    Bundle[] bundleArr2 = new Bundle[n0VarArr2.length];
                    arrayList = arrayList5;
                    i12 = i21;
                    int i22 = 0;
                    while (i22 < n0VarArr2.length) {
                        n0 n0Var = n0VarArr2[i22];
                        int i23 = i22;
                        Bundle bundle10 = new Bundle();
                        n0Var.getClass();
                        n0[] n0VarArr3 = n0VarArr2;
                        String str3 = str;
                        bundle10.putString("resultKey", "extra_voice_reply");
                        bundle10.putCharSequence("label", n0Var.a);
                        bundle10.putCharSequenceArray("choices", null);
                        bundle10.putBoolean("allowFreeFormInput", true);
                        bundle10.putBundle("extras", n0Var.b);
                        HashSet hashSet = n0Var.c;
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
                        n0VarArr2 = n0VarArr3;
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
            ((Bundle) this.f).putBundle("android.car.EXTENSIONS", bundle6);
        }
        int i24 = Build.VERSION.SDK_INT;
        if (i24 >= 24) {
            ((Notification.Builder) this.d).setExtras(rVar.v);
            w.j((Notification.Builder) this.d);
        }
        if (i24 >= 26) {
            c2.h.i((Notification.Builder) this.d);
            c2.h.k((Notification.Builder) this.d);
            c2.h.l((Notification.Builder) this.d, rVar.z);
            c2.h.m((Notification.Builder) this.d, rVar.B);
            c2.h.j((Notification.Builder) this.d, rVar.C);
            if (!TextUtils.isEmpty(rVar.y)) {
                bubbleMetadata = null;
                i10 = 0;
                ((Notification.Builder) this.d).setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
                if (i24 >= 28) {
                    int size4 = arrayList4.size();
                    int i25 = i10;
                    while (i25 < size4) {
                        Object obj4 = arrayList4.get(i25);
                        i25++;
                        e0.l0 l0Var2 = (e0.l0) obj4;
                        Notification.Builder builder3 = (Notification.Builder) this.d;
                        l0Var2.getClass();
                        b5.d.a(builder3, b5.d.E(l0Var2));
                    }
                }
                i11 = Build.VERSION.SDK_INT;
                if (i11 >= 29) {
                    return;
                }
                b2.d.i((Notification.Builder) this.d, rVar.D);
                Notification.Builder builder4 = (Notification.Builder) this.d;
                p pVar = rVar.E;
                if (pVar != null) {
                    if (i11 >= 30) {
                        a2 = o.a(pVar);
                    } else if (i11 == 29) {
                        a2 = n.a(pVar);
                    }
                    b2.d.k(builder4, a2);
                    fVar = rVar.A;
                    if (fVar == null) {
                        b2.d.n((Notification.Builder) this.d, fVar.b);
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

    @Override // j4.b0
    public void d(k0 k0Var, q qVar, g0 g0Var) {
    }

    public f(z zVar, l lVar, byte[] bArr, m0[] m0VarArr, int i10) {
        this.a = 6;
        this.c = zVar;
        this.d = lVar;
        this.e = bArr;
        this.f = m0VarArr;
        this.b = i10;
    }

    public f(Canvas canvas) {
        this.a = 5;
        this.d = new Matrix();
        this.e = new ArrayList();
        this.f = new ArrayList();
        this.c = canvas;
    }

    public f(e0 e0Var, int i10) {
        this.a = 2;
        this.f = e0Var;
        this.c = new g(new byte[5], 5);
        this.d = new SparseArray();
        this.e = new SparseIntArray();
        this.b = i10;
    }

    public f(fy0 fy0Var, dy0[] dy0VarArr) {
        this.a = 4;
        this.f = fy0Var;
        int length = dy0VarArr.length;
        this.c = new dy0[length];
        this.b = length - 1;
        int e = fy0Var.e() + 1;
        dy0[][] dy0VarArr2 = new dy0[e][];
        int[] iArr = new int[e];
        for (dy0 dy0Var : dy0VarArr) {
            int i10 = dy0Var.a.a;
            iArr[i10] = iArr[i10] + 1;
        }
        for (int i11 = 0; i11 < e; i11++) {
            dy0VarArr2[i11] = new dy0[iArr[i11]];
        }
        Arrays.fill(iArr, 0);
        for (dy0 dy0Var2 : dy0VarArr) {
            int i12 = dy0Var2.a.a;
            dy0[] dy0VarArr3 = dy0VarArr2[i12];
            int i13 = iArr[i12];
            iArr[i12] = i13 + 1;
            dy0VarArr3[i13] = dy0Var2;
        }
        this.d = dy0VarArr2;
        this.e = new int[((fy0) this.f).e() + 1];
    }
}
