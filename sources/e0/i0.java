package e0;

import android.app.Notification;
import android.app.PendingIntent;
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
import org.telegram.ui.Components.xy0;
import org.telegram.ui.Components.zy0;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes.dex */
public final class i0 implements j4.a0 {
    public int a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;

    public i0(int i10) {
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

    public static void d(Notification notification) {
        notification.sound = null;
        notification.vibrate = null;
        notification.defaults &= -4;
    }

    @Override // j4.a0
    public void b(e2.v vVar) {
        e2.b0 b0Var;
        e2.b0 b0Var2;
        SparseArray sparseArray;
        int i10;
        a4.h hVar;
        int i11;
        int i12;
        e2.b0 b0Var3;
        SparseArray sparseArray2 = (SparseArray) this.c;
        SparseIntArray sparseIntArray = (SparseIntArray) this.d;
        a4.h hVar2 = (a4.h) this.b;
        j4.d0 d0Var = (j4.d0) this.e;
        SparseArray sparseArray3 = d0Var.h;
        SparseBooleanArray sparseBooleanArray = d0Var.i;
        j4.f fVar = d0Var.f;
        List list = d0Var.c;
        int i13 = d0Var.a;
        if (vVar.x() == 2) {
            if (i13 == 1 || i13 == 2 || d0Var.n == 1) {
                b0Var = (e2.b0) list.get(0);
            } else {
                b0Var = new e2.b0(((e2.b0) list.get(0)).d());
                list.add(b0Var);
            }
            if ((vVar.x() & 128) != 0) {
                vVar.K(1);
                int D = vVar.D();
                vVar.K(3);
                vVar.h(0, 2, hVar2.b);
                hVar2.q(0);
                hVar2.t(3);
                d0Var.t = hVar2.i(13);
                vVar.h(0, 2, hVar2.b);
                hVar2.q(0);
                hVar2.t(4);
                vVar.K(hVar2.i(12));
                if (i13 == 2 && d0Var.r == null) {
                    j4.g0 a2 = fVar.a(21, new j6.l(21, null, 0, null, e2.d0.b));
                    d0Var.r = a2;
                    if (a2 != null) {
                        a2.c(b0Var, d0Var.m, new j4.f0(D, 21, 8192));
                    }
                }
                sparseArray2.clear();
                sparseIntArray.clear();
                int a10 = vVar.a();
                while (a10 > 0) {
                    vVar.h(0, 5, hVar2.b);
                    hVar2.q(0);
                    int i14 = hVar2.i(8);
                    hVar2.t(3);
                    int i15 = hVar2.i(13);
                    hVar2.t(4);
                    int i16 = hVar2.i(12);
                    int i17 = vVar.b;
                    int i18 = i17 + i16;
                    int i19 = a10;
                    String str = null;
                    ArrayList arrayList = null;
                    int i20 = -1;
                    int i21 = 0;
                    while (true) {
                        if (vVar.b >= i18) {
                            hVar = hVar2;
                            break;
                        }
                        int x10 = vVar.x();
                        hVar = hVar2;
                        int x11 = vVar.b + vVar.x();
                        if (x11 > i18) {
                            break;
                        }
                        SparseArray sparseArray4 = sparseArray3;
                        if (x10 == 5) {
                            long z10 = vVar.z();
                            if (z10 == 1094921523) {
                                i20 = 129;
                            } else if (z10 == 1161904947) {
                                i20 = 135;
                            } else {
                                if (z10 != 1094921524) {
                                    if (z10 == 1212503619) {
                                        i20 = 36;
                                    }
                                }
                                i20 = 172;
                            }
                            i11 = x11;
                            i12 = D;
                            b0Var3 = b0Var;
                        } else if (x10 == 106) {
                            i11 = x11;
                            i12 = D;
                            b0Var3 = b0Var;
                            i20 = 129;
                        } else if (x10 == 122) {
                            i11 = x11;
                            i12 = D;
                            b0Var3 = b0Var;
                            i20 = 135;
                        } else if (x10 == 127) {
                            int x12 = vVar.x();
                            if (x12 != 21) {
                                if (x12 == 14) {
                                    i20 = 136;
                                } else if (x12 == 33) {
                                    i20 = 139;
                                }
                                i11 = x11;
                                i12 = D;
                                b0Var3 = b0Var;
                            }
                            i20 = 172;
                            i11 = x11;
                            i12 = D;
                            b0Var3 = b0Var;
                        } else if (x10 == 123) {
                            i11 = x11;
                            i12 = D;
                            b0Var3 = b0Var;
                            i20 = 138;
                        } else if (x10 == 10) {
                            str = vVar.v(3, StandardCharsets.UTF_8).trim();
                            i11 = x11;
                            i21 = vVar.x();
                            i12 = D;
                            b0Var3 = b0Var;
                        } else if (x10 == 89) {
                            ArrayList arrayList2 = new ArrayList();
                            while (vVar.b < x11) {
                                String trim = vVar.v(3, StandardCharsets.UTF_8).trim();
                                vVar.x();
                                e2.b0 b0Var4 = b0Var;
                                byte[] bArr = new byte[4];
                                vVar.h(0, 4, bArr);
                                arrayList2.add(new j4.e0(trim, bArr));
                                b0Var = b0Var4;
                                x11 = x11;
                                D = D;
                            }
                            i11 = x11;
                            i12 = D;
                            b0Var3 = b0Var;
                            arrayList = arrayList2;
                            i20 = 89;
                        } else {
                            i11 = x11;
                            i12 = D;
                            b0Var3 = b0Var;
                            if (x10 == 111) {
                                i20 = 257;
                            }
                        }
                        vVar.K(i11 - vVar.b);
                        b0Var = b0Var3;
                        hVar2 = hVar;
                        sparseArray3 = sparseArray4;
                        D = i12;
                    }
                    SparseArray sparseArray5 = sparseArray3;
                    int i22 = D;
                    e2.b0 b0Var5 = b0Var;
                    vVar.J(i18);
                    j6.l lVar = new j6.l(i20, str, i21, arrayList, Arrays.copyOfRange(vVar.a, i17, i18));
                    if (i14 == 6 || i14 == 5) {
                        i14 = i20;
                    }
                    int i23 = i19 - (i16 + 5);
                    int i24 = i13 == 2 ? i14 : i15;
                    if (!sparseBooleanArray.get(i24)) {
                        j4.g0 a11 = (i13 == 2 && i14 == 21) ? d0Var.r : fVar.a(i14, lVar);
                        if (i13 != 2 || i15 < sparseIntArray.get(i24, 8192)) {
                            sparseIntArray.put(i24, i15);
                            sparseArray2.put(i24, a11);
                        }
                    }
                    a10 = i23;
                    b0Var = b0Var5;
                    hVar2 = hVar;
                    sparseArray3 = sparseArray5;
                    D = i22;
                }
                SparseArray sparseArray6 = sparseArray3;
                int i25 = D;
                e2.b0 b0Var6 = b0Var;
                int size = sparseIntArray.size();
                int i26 = 0;
                while (i26 < size) {
                    int keyAt = sparseIntArray.keyAt(i26);
                    int valueAt = sparseIntArray.valueAt(i26);
                    sparseBooleanArray.put(keyAt, true);
                    d0Var.j.put(valueAt, true);
                    j4.g0 g0Var = (j4.g0) sparseArray2.valueAt(i26);
                    if (g0Var != null) {
                        if (g0Var != d0Var.r) {
                            i10 = i25;
                            b0Var2 = b0Var6;
                            g0Var.c(b0Var2, d0Var.m, new j4.f0(i10, keyAt, 8192));
                        } else {
                            b0Var2 = b0Var6;
                            i10 = i25;
                        }
                        sparseArray = sparseArray6;
                        sparseArray.put(valueAt, g0Var);
                    } else {
                        b0Var2 = b0Var6;
                        sparseArray = sparseArray6;
                        i10 = i25;
                    }
                    i26++;
                    sparseArray6 = sparseArray;
                    i25 = i10;
                    b0Var6 = b0Var2;
                }
                SparseArray sparseArray7 = sparseArray6;
                if (i13 == 2) {
                    if (d0Var.o) {
                        return;
                    }
                    d0Var.m.Z0();
                    d0Var.n = 0;
                    d0Var.o = true;
                    return;
                }
                sparseArray7.remove(this.a);
                int i27 = i13 == 1 ? 0 : d0Var.n - 1;
                d0Var.n = i27;
                if (i27 == 0) {
                    d0Var.m.Z0();
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
        for (xy0 xy0Var : ((xy0[][]) this.c)[i10]) {
            f(xy0Var.a.b);
            xy0[] xy0VarArr = (xy0[]) this.b;
            int i11 = this.a;
            this.a = i11 - 1;
            xy0VarArr[i11] = xy0Var;
        }
        iArr[i10] = 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:146:0x0440  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0463  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x048e  */
    /* JADX WARN: Removed duplicated region for block: B:160:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:167:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public i0(t tVar) {
        int i10;
        Notification.BubbleMetadata bubbleMetadata;
        int i11;
        Notification.BubbleMetadata a2;
        f0.h hVar;
        Bundle bundle;
        ArrayList arrayList;
        int i12;
        Bundle[] bundleArr;
        ArrayList arrayList2;
        Notification.Action.Builder builder;
        Bundle bundle2;
        new ArrayList();
        this.e = new Bundle();
        this.d = tVar;
        Context context = tVar.a;
        ArrayList arrayList3 = tVar.F;
        ArrayList arrayList4 = tVar.c;
        ArrayList arrayList5 = tVar.d;
        this.b = context;
        int i13 = Build.VERSION.SDK_INT;
        if (i13 >= 26) {
            this.c = c2.d.b(context, tVar.y);
        } else {
            this.c = new Notification.Builder(context);
        }
        Notification notification = tVar.E;
        ((Notification.Builder) this.c).setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, null).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(tVar.e).setContentText(tVar.f).setContentInfo(null).setContentIntent(tVar.g).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(null, (notification.flags & 128) != 0).setNumber(tVar.i).setProgress(tVar.n, tVar.o, tVar.p);
        if (i13 < 23) {
            Notification.Builder builder2 = (Notification.Builder) this.c;
            IconCompat iconCompat = tVar.h;
            builder2.setLargeIcon(iconCompat == null ? null : iconCompat.f());
        } else {
            Notification.Builder builder3 = (Notification.Builder) this.c;
            IconCompat iconCompat2 = tVar.h;
            b.C(builder3, iconCompat2 == null ? null : iconCompat2.m(context));
        }
        ((Notification.Builder) this.c).setSubText(tVar.m).setUsesChronometer(false).setPriority(tVar.j);
        ArrayList arrayList6 = tVar.b;
        int size = arrayList6.size();
        int i14 = 0;
        while (i14 < size) {
            Object obj = arrayList6.get(i14);
            int i15 = i14 + 1;
            k kVar = (k) obj;
            int i16 = Build.VERSION.SDK_INT;
            IconCompat a10 = kVar.a();
            int i17 = kVar.f;
            boolean z10 = kVar.d;
            Bundle bundle3 = kVar.a;
            ArrayList arrayList7 = arrayList6;
            PendingIntent pendingIntent = kVar.i;
            int i18 = size;
            CharSequence charSequence = kVar.h;
            if (i16 >= 23) {
                builder = b.b(a10 != null ? a10.m(null) : null, charSequence, pendingIntent);
            } else {
                builder = new Notification.Action.Builder(a10 != null ? a10.g() : 0, charSequence, pendingIntent);
            }
            r0[] r0VarArr = kVar.c;
            if (r0VarArr != null) {
                for (RemoteInput remoteInput : r0.a(r0VarArr)) {
                    builder.addRemoteInput(remoteInput);
                }
            }
            if (bundle3 != null) {
                bundle2 = new Bundle(bundle3);
            } else {
                bundle2 = new Bundle();
            }
            bundle2.putBoolean("android.support.allowGeneratedReplies", z10);
            int i19 = Build.VERSION.SDK_INT;
            if (i19 >= 24) {
                androidx.emoji2.text.x.h(builder, z10);
            }
            bundle2.putInt("android.support.action.semanticAction", i17);
            if (i19 >= 28) {
                b5.d.y(builder, i17);
            }
            if (i19 >= 29) {
                b2.c.m(builder);
            }
            if (i19 >= 31) {
                h0.c(builder);
            }
            bundle2.putBoolean("android.support.action.showsUserInterface", kVar.e);
            builder.addExtras(bundle2);
            ((Notification.Builder) this.c).addAction(builder.build());
            arrayList6 = arrayList7;
            size = i18;
            i14 = i15;
        }
        Bundle bundle4 = tVar.v;
        if (bundle4 != null) {
            ((Bundle) this.e).putAll(bundle4);
        }
        int i20 = Build.VERSION.SDK_INT;
        ((Notification.Builder) this.c).setShowWhen(tVar.k);
        ((Notification.Builder) this.c).setLocalOnly(tVar.t);
        ((Notification.Builder) this.c).setGroup(tVar.q);
        ((Notification.Builder) this.c).setSortKey(tVar.s);
        ((Notification.Builder) this.c).setGroupSummary(tVar.r);
        this.a = tVar.B;
        ((Notification.Builder) this.c).setCategory(tVar.u);
        ((Notification.Builder) this.c).setColor(tVar.w);
        ((Notification.Builder) this.c).setVisibility(tVar.x);
        ((Notification.Builder) this.c).setPublicVersion(null);
        ((Notification.Builder) this.c).setSound(notification.sound, notification.audioAttributes);
        if (i20 < 28) {
            if (arrayList4 == null) {
                arrayList2 = null;
            } else {
                arrayList2 = new ArrayList(arrayList4.size());
                int size2 = arrayList4.size();
                int i21 = 0;
                while (i21 < size2) {
                    Object obj2 = arrayList4.get(i21);
                    i21++;
                    p0 p0Var = (p0) obj2;
                    CharSequence charSequence2 = p0Var.a;
                    String str = p0Var.c;
                    if (str == null) {
                        str = charSequence2 != null ? "name:" + ((Object) charSequence2) : "";
                    }
                    arrayList2.add(str);
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
            int i22 = 0;
            while (i22 < size3) {
                Object obj3 = arrayList3.get(i22);
                i22++;
                ((Notification.Builder) this.c).addPerson((String) obj3);
            }
        }
        if (arrayList5.size() > 0) {
            if (tVar.v == null) {
                tVar.v = new Bundle();
            }
            Bundle bundle5 = tVar.v.getBundle("android.car.EXTENSIONS");
            bundle5 = bundle5 == null ? new Bundle() : bundle5;
            Bundle bundle6 = new Bundle(bundle5);
            Bundle bundle7 = new Bundle();
            int i23 = 0;
            while (i23 < arrayList5.size()) {
                String num = Integer.toString(i23);
                k kVar2 = (k) arrayList5.get(i23);
                Bundle bundle8 = new Bundle();
                IconCompat a11 = kVar2.a();
                Bundle bundle9 = kVar2.a;
                bundle8.putInt("icon", a11 != null ? a11.g() : 0);
                bundle8.putCharSequence("title", kVar2.h);
                bundle8.putParcelable("actionIntent", kVar2.i);
                if (bundle9 != null) {
                    bundle = new Bundle(bundle9);
                } else {
                    bundle = new Bundle();
                }
                bundle.putBoolean("android.support.allowGeneratedReplies", kVar2.d);
                bundle8.putBundle("extras", bundle);
                r0[] r0VarArr2 = kVar2.c;
                if (r0VarArr2 == null) {
                    arrayList = arrayList5;
                    i12 = i23;
                    bundleArr = null;
                } else {
                    Bundle[] bundleArr2 = new Bundle[r0VarArr2.length];
                    arrayList = arrayList5;
                    i12 = i23;
                    int i24 = 0;
                    while (i24 < r0VarArr2.length) {
                        r0 r0Var = r0VarArr2[i24];
                        int i25 = i24;
                        Bundle bundle10 = new Bundle();
                        r0Var.getClass();
                        r0[] r0VarArr3 = r0VarArr2;
                        Bundle[] bundleArr3 = bundleArr2;
                        bundle10.putString("resultKey", NotificationsController.EXTRA_VOICE_REPLY);
                        bundle10.putCharSequence("label", r0Var.a);
                        bundle10.putCharSequenceArray("choices", null);
                        bundle10.putBoolean("allowFreeFormInput", true);
                        bundle10.putBundle("extras", r0Var.b);
                        HashSet hashSet = r0Var.c;
                        if (!hashSet.isEmpty()) {
                            ArrayList<String> arrayList8 = new ArrayList<>(hashSet.size());
                            Iterator it = hashSet.iterator();
                            while (it.hasNext()) {
                                arrayList8.add((String) it.next());
                            }
                            bundle10.putStringArrayList("allowedDataTypes", arrayList8);
                        }
                        bundleArr3[i25] = bundle10;
                        i24 = i25 + 1;
                        r0VarArr2 = r0VarArr3;
                        bundleArr2 = bundleArr3;
                    }
                    bundleArr = bundleArr2;
                }
                bundle8.putParcelableArray("remoteInputs", bundleArr);
                bundle8.putBoolean("showsUserInterface", kVar2.e);
                bundle8.putInt("semanticAction", kVar2.f);
                bundle7.putBundle(num, bundle8);
                i23 = i12 + 1;
                arrayList5 = arrayList;
            }
            bundle5.putBundle("invisible_actions", bundle7);
            bundle6.putBundle("invisible_actions", bundle7);
            if (tVar.v == null) {
                tVar.v = new Bundle();
            }
            tVar.v.putBundle("android.car.EXTENSIONS", bundle5);
            ((Bundle) this.e).putBundle("android.car.EXTENSIONS", bundle6);
        }
        int i26 = Build.VERSION.SDK_INT;
        if (i26 >= 24) {
            ((Notification.Builder) this.c).setExtras(tVar.v);
            androidx.emoji2.text.x.i((Notification.Builder) this.c);
        }
        if (i26 >= 26) {
            c2.d.i((Notification.Builder) this.c);
            c2.d.k((Notification.Builder) this.c);
            c2.d.l((Notification.Builder) this.c, tVar.z);
            c2.d.m((Notification.Builder) this.c);
            c2.d.j((Notification.Builder) this.c, tVar.B);
            if (!TextUtils.isEmpty(tVar.y)) {
                bubbleMetadata = null;
                i10 = 0;
                ((Notification.Builder) this.c).setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
                if (i26 >= 28) {
                    int size4 = arrayList4.size();
                    while (i10 < size4) {
                        Object obj4 = arrayList4.get(i10);
                        i10++;
                        p0 p0Var2 = (p0) obj4;
                        Notification.Builder builder4 = (Notification.Builder) this.c;
                        p0Var2.getClass();
                        b5.d.a(builder4, b5.d.E(p0Var2));
                    }
                }
                i11 = Build.VERSION.SDK_INT;
                if (i11 >= 29) {
                    return;
                }
                b2.c.j((Notification.Builder) this.c, tVar.C);
                Notification.Builder builder5 = (Notification.Builder) this.c;
                r rVar = tVar.D;
                if (rVar != null) {
                    if (i11 >= 30) {
                        a2 = q.a(rVar);
                    } else if (i11 == 29) {
                        a2 = p.a(rVar);
                    }
                    b2.c.l(builder5, a2);
                    hVar = tVar.A;
                    if (hVar == null) {
                        b2.c.o((Notification.Builder) this.c, hVar.b);
                        return;
                    }
                    return;
                }
                a2 = bubbleMetadata;
                b2.c.l(builder5, a2);
                hVar = tVar.A;
                if (hVar == null) {
                }
            }
        }
        i10 = 0;
        bubbleMetadata = null;
        if (i26 >= 28) {
        }
        i11 = Build.VERSION.SDK_INT;
        if (i11 >= 29) {
        }
    }

    @Override // j4.a0
    public void c(e2.b0 b0Var, c3.q qVar, j4.f0 f0Var) {
    }

    public i0(c3.z zVar, c3.j0 j0Var, byte[] bArr, ai.a[] aVarArr, int i10) {
        this.b = zVar;
        this.c = j0Var;
        this.d = bArr;
        this.e = aVarArr;
        this.a = i10;
    }

    public i0(j4.d0 d0Var, int i10) {
        this.e = d0Var;
        this.b = new a4.h(new byte[5], 5);
        this.c = new SparseArray();
        this.d = new SparseIntArray();
        this.a = i10;
    }

    public i0(zy0 zy0Var, xy0[] xy0VarArr) {
        this.e = zy0Var;
        int length = xy0VarArr.length;
        this.b = new xy0[length];
        this.a = length - 1;
        int e7 = zy0Var.e() + 1;
        xy0[][] xy0VarArr2 = new xy0[e7][];
        int[] iArr = new int[e7];
        for (xy0 xy0Var : xy0VarArr) {
            int i10 = xy0Var.a.a;
            iArr[i10] = iArr[i10] + 1;
        }
        for (int i11 = 0; i11 < e7; i11++) {
            xy0VarArr2[i11] = new xy0[iArr[i11]];
        }
        Arrays.fill(iArr, 0);
        for (xy0 xy0Var2 : xy0VarArr) {
            int i12 = xy0Var2.a.a;
            xy0[] xy0VarArr3 = xy0VarArr2[i12];
            int i13 = iArr[i12];
            iArr[i12] = i13 + 1;
            xy0VarArr3[i13] = xy0Var2;
        }
        this.c = xy0VarArr2;
        this.d = new int[((zy0) this.e).e() + 1];
    }
}
