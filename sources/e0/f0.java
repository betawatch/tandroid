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
import org.telegram.ui.Components.tz0;
import org.telegram.ui.Components.vz0;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes.dex */
public final class f0 implements j4.a0 {
    public final /* synthetic */ int a;
    public int b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;

    public /* synthetic */ f0() {
        this.a = 2;
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
        SparseArray sparseArray2 = (SparseArray) this.d;
        SparseIntArray sparseIntArray = (SparseIntArray) this.e;
        a4.g gVar2 = (a4.g) this.c;
        j4.d0 d0Var = (j4.d0) this.f;
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
                    d0Var.m.H();
                    d0Var.n = 0;
                    d0Var.o = true;
                    return;
                }
                sparseArray7.remove(this.b);
                int i24 = i13 == 1 ? 0 : d0Var.n - 1;
                d0Var.n = i24;
                if (i24 == 0) {
                    d0Var.m.H();
                    d0Var.o = true;
                }
            }
        }
    }

    public void e(int i10, int i11) {
        int[] iArr = (int[]) this.f;
        int i12 = i10 * 4;
        iArr[i12] = i11;
        iArr[i12 + 1] = i11;
        iArr[i12 + 2] = i11;
        iArr[i12 + 3] = i11;
    }

    public void f(int i10) {
        int[] iArr = (int[]) this.e;
        if (iArr[i10] != 0) {
            return;
        }
        iArr[i10] = 1;
        for (tz0 tz0Var : ((tz0[][]) this.d)[i10]) {
            f(tz0Var.a.b);
            tz0[] tz0VarArr = (tz0[]) this.c;
            int i11 = this.b;
            this.b = i11 - 1;
            tz0VarArr[i11] = tz0Var;
        }
        iArr[i10] = 2;
    }

    public String toString() {
        switch (this.a) {
            case 2:
                StringBuilder sb2 = new StringBuilder(200);
                sb2.append("<<\n mode: ");
                sb2.append((ic.e) this.c);
                sb2.append("\n ecLevel: ");
                sb2.append((ic.c) this.d);
                sb2.append("\n version: ");
                sb2.append((ic.f) this.e);
                sb2.append("\n maskPattern: ");
                sb2.append(this.b);
                if (((kc.b) this.f) == null) {
                    sb2.append("\n matrix: null\n");
                } else {
                    sb2.append("\n matrix:\n");
                    sb2.append((kc.b) this.f);
                }
                sb2.append(">>\n");
                return sb2.toString();
            default:
                return super.toString();
        }
    }

    public f0(int i10) {
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
    /* JADX WARN: Removed duplicated region for block: B:136:0x0416  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x043a  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0465  */
    /* JADX WARN: Removed duplicated region for block: B:150:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:157:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public f0(q qVar) {
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
        this.a = 0;
        new ArrayList();
        this.f = new Bundle();
        this.e = qVar;
        Context context = qVar.a;
        ArrayList arrayList3 = qVar.F;
        ArrayList arrayList4 = qVar.c;
        ArrayList arrayList5 = qVar.d;
        this.c = context;
        if (Build.VERSION.SDK_INT >= 26) {
            this.d = c2.i.b(context, qVar.y);
        } else {
            this.d = new Notification.Builder(context);
        }
        Notification notification = qVar.E;
        Context context2 = null;
        ((Notification.Builder) this.d).setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, null).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(qVar.e).setContentText(qVar.f).setContentInfo(null).setContentIntent(qVar.g).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(null, (notification.flags & 128) != 0).setNumber(qVar.i).setProgress(qVar.n, qVar.o, qVar.p);
        Notification.Builder builder = (Notification.Builder) this.d;
        IconCompat iconCompat = qVar.h;
        builder.setLargeIcon(iconCompat == null ? null : iconCompat.m(context));
        ((Notification.Builder) this.d).setSubText(qVar.m).setUsesChronometer(false).setPriority(qVar.j);
        ArrayList arrayList6 = qVar.b;
        int size = arrayList6.size();
        int i13 = 0;
        while (true) {
            str = "android.support.allowGeneratedReplies";
            if (i13 >= size) {
                break;
            }
            Object obj = arrayList6.get(i13);
            i13++;
            h hVar = (h) obj;
            IconCompat a10 = hVar.a();
            int i14 = hVar.f;
            boolean z10 = hVar.d;
            Bundle bundle3 = hVar.a;
            ArrayList arrayList7 = arrayList6;
            int i15 = size;
            Notification.Action.Builder builder2 = new Notification.Action.Builder(a10 != null ? a10.m(context2) : context2, hVar.h, hVar.i);
            o0[] o0VarArr = hVar.c;
            if (o0VarArr != null) {
                RemoteInput[] a11 = o0.a(o0VarArr);
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
                e0.e(builder2);
            }
            bundle2.putBoolean("android.support.action.showsUserInterface", hVar.e);
            builder2.addExtras(bundle2);
            ((Notification.Builder) this.d).addAction(builder2.build());
            arrayList6 = arrayList7;
            size = i15;
            context2 = null;
        }
        Bundle bundle4 = qVar.v;
        if (bundle4 != null) {
            ((Bundle) this.f).putAll(bundle4);
        }
        int i18 = Build.VERSION.SDK_INT;
        ((Notification.Builder) this.d).setShowWhen(qVar.k);
        ((Notification.Builder) this.d).setLocalOnly(qVar.t);
        ((Notification.Builder) this.d).setGroup(qVar.q);
        ((Notification.Builder) this.d).setSortKey(qVar.s);
        ((Notification.Builder) this.d).setGroupSummary(qVar.r);
        this.b = qVar.B;
        ((Notification.Builder) this.d).setCategory(qVar.u);
        ((Notification.Builder) this.d).setColor(qVar.w);
        ((Notification.Builder) this.d).setVisibility(qVar.x);
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
                    m0 m0Var = (m0) obj2;
                    CharSequence charSequence = m0Var.a;
                    String str2 = m0Var.c;
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
            if (qVar.v == null) {
                qVar.v = new Bundle();
            }
            Bundle bundle5 = qVar.v.getBundle("android.car.EXTENSIONS");
            bundle5 = bundle5 == null ? new Bundle() : bundle5;
            Bundle bundle6 = new Bundle(bundle5);
            Bundle bundle7 = new Bundle();
            int i21 = 0;
            while (i21 < arrayList5.size()) {
                String num = Integer.toString(i21);
                h hVar2 = (h) arrayList5.get(i21);
                Bundle bundle8 = new Bundle();
                IconCompat a12 = hVar2.a();
                Bundle bundle9 = hVar2.a;
                bundle8.putInt("icon", a12 != null ? a12.g() : 0);
                bundle8.putCharSequence("title", hVar2.h);
                bundle8.putParcelable("actionIntent", hVar2.i);
                if (bundle9 != null) {
                    bundle = new Bundle(bundle9);
                } else {
                    bundle = new Bundle();
                }
                bundle.putBoolean(str, hVar2.d);
                bundle8.putBundle("extras", bundle);
                o0[] o0VarArr2 = hVar2.c;
                if (o0VarArr2 == null) {
                    arrayList = arrayList5;
                    i12 = i21;
                    bundleArr = null;
                } else {
                    Bundle[] bundleArr2 = new Bundle[o0VarArr2.length];
                    arrayList = arrayList5;
                    i12 = i21;
                    int i22 = 0;
                    while (i22 < o0VarArr2.length) {
                        o0 o0Var = o0VarArr2[i22];
                        int i23 = i22;
                        Bundle bundle10 = new Bundle();
                        o0Var.getClass();
                        o0[] o0VarArr3 = o0VarArr2;
                        String str3 = str;
                        bundle10.putString("resultKey", NotificationsController.EXTRA_VOICE_REPLY);
                        bundle10.putCharSequence("label", o0Var.a);
                        bundle10.putCharSequenceArray("choices", null);
                        bundle10.putBoolean("allowFreeFormInput", true);
                        bundle10.putBundle("extras", o0Var.b);
                        HashSet hashSet = o0Var.c;
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
                        o0VarArr2 = o0VarArr3;
                        str = str3;
                    }
                    bundleArr = bundleArr2;
                }
                String str4 = str;
                bundle8.putParcelableArray("remoteInputs", bundleArr);
                bundle8.putBoolean("showsUserInterface", hVar2.e);
                bundle8.putInt("semanticAction", hVar2.f);
                bundle7.putBundle(num, bundle8);
                i21 = i12 + 1;
                arrayList5 = arrayList;
                str = str4;
            }
            bundle5.putBundle("invisible_actions", bundle7);
            bundle6.putBundle("invisible_actions", bundle7);
            if (qVar.v == null) {
                qVar.v = new Bundle();
            }
            qVar.v.putBundle("android.car.EXTENSIONS", bundle5);
            ((Bundle) this.f).putBundle("android.car.EXTENSIONS", bundle6);
        }
        int i24 = Build.VERSION.SDK_INT;
        if (i24 >= 24) {
            ((Notification.Builder) this.d).setExtras(qVar.v);
            androidx.emoji2.text.w.i((Notification.Builder) this.d);
        }
        if (i24 >= 26) {
            c2.i.i((Notification.Builder) this.d);
            c2.i.k((Notification.Builder) this.d);
            c2.i.l((Notification.Builder) this.d, qVar.z);
            c2.i.m((Notification.Builder) this.d);
            c2.i.j((Notification.Builder) this.d, qVar.B);
            if (!TextUtils.isEmpty(qVar.y)) {
                bubbleMetadata = null;
                i10 = 0;
                ((Notification.Builder) this.d).setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
                if (i24 >= 28) {
                    int size4 = arrayList4.size();
                    int i25 = i10;
                    while (i25 < size4) {
                        Object obj4 = arrayList4.get(i25);
                        i25++;
                        m0 m0Var2 = (m0) obj4;
                        Notification.Builder builder3 = (Notification.Builder) this.d;
                        m0Var2.getClass();
                        b5.d.a(builder3, b5.d.E(m0Var2));
                    }
                }
                i11 = Build.VERSION.SDK_INT;
                if (i11 >= 29) {
                    return;
                }
                b2.d.i((Notification.Builder) this.d, qVar.C);
                Notification.Builder builder4 = (Notification.Builder) this.d;
                o oVar = qVar.D;
                if (oVar != null) {
                    if (i11 >= 30) {
                        a2 = n.a(oVar);
                    } else if (i11 == 29) {
                        a2 = m.a(oVar);
                    }
                    b2.d.k(builder4, a2);
                    fVar = qVar.A;
                    if (fVar == null) {
                        b2.d.n((Notification.Builder) this.d, fVar.b);
                        return;
                    }
                    return;
                }
                a2 = bubbleMetadata;
                b2.d.k(builder4, a2);
                fVar = qVar.A;
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

    public f0(c3.a0 a0Var, c3.l0 l0Var, byte[] bArr, bi.a[] aVarArr, int i10) {
        this.a = 5;
        this.c = a0Var;
        this.d = l0Var;
        this.e = bArr;
        this.f = aVarArr;
        this.b = i10;
    }

    public f0(j4.d0 d0Var, int i10) {
        this.a = 1;
        this.f = d0Var;
        this.c = new a4.g(new byte[5], 5);
        this.d = new SparseArray();
        this.e = new SparseIntArray();
        this.b = i10;
    }

    public f0(vz0 vz0Var, tz0[] tz0VarArr) {
        this.a = 4;
        this.f = vz0Var;
        int length = tz0VarArr.length;
        this.c = new tz0[length];
        this.b = length - 1;
        int e = vz0Var.e() + 1;
        tz0[][] tz0VarArr2 = new tz0[e][];
        int[] iArr = new int[e];
        for (tz0 tz0Var : tz0VarArr) {
            int i10 = tz0Var.a.a;
            iArr[i10] = iArr[i10] + 1;
        }
        for (int i11 = 0; i11 < e; i11++) {
            tz0VarArr2[i11] = new tz0[iArr[i11]];
        }
        Arrays.fill(iArr, 0);
        for (tz0 tz0Var2 : tz0VarArr) {
            int i12 = tz0Var2.a.a;
            tz0[] tz0VarArr3 = tz0VarArr2[i12];
            int i13 = iArr[i12];
            iArr[i12] = i13 + 1;
            tz0VarArr3[i13] = tz0Var2;
        }
        this.d = tz0VarArr2;
        this.e = new int[((vz0) this.f).e() + 1];
    }
}
