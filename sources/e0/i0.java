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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.telegram.messenger.NotificationsController;
import org.telegram.ui.Components.fy0;
import org.telegram.ui.Components.hy0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class i0 implements w3.y {
    public int a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;

    public i0(int i9) {
        this.a = i9;
        int i10 = i9 * 8;
        this.b = new float[i10];
        this.c = new float[i10];
        this.d = new short[i9 * 6];
        this.e = new int[i9 * 4];
        for (short s10 = 0; s10 < i9; s10 = (short) (s10 + 1)) {
            int i11 = s10 * 6;
            int i12 = s10 * 4;
            short[] sArr = (short[]) this.d;
            short s11 = (short) i12;
            sArr[i11] = s11;
            sArr[i11 + 1] = (short) (i12 + 1);
            short s12 = (short) (i12 + 2);
            sArr[i11 + 2] = s12;
            sArr[i11 + 3] = s12;
            sArr[i11 + 4] = (short) (i12 + 3);
            sArr[i11 + 5] = s11;
        }
    }

    public static void a(float[] fArr, int i9, float f10, float f11, float f12, float f13) {
        int i10 = i9 * 8;
        fArr[i10] = f10;
        fArr[i10 + 1] = f11;
        fArr[i10 + 2] = f12;
        fArr[i10 + 3] = f11;
        fArr[i10 + 4] = f12;
        fArr[i10 + 5] = f13;
        fArr[i10 + 6] = f10;
        fArr[i10 + 7] = f13;
    }

    public static void b(Notification notification) {
        notification.sound = null;
        notification.vibrate = null;
        notification.defaults &= -4;
    }

    public void c(int i9, int i10) {
        int[] iArr = (int[]) this.e;
        int i11 = i9 * 4;
        iArr[i11] = i10;
        iArr[i11 + 1] = i10;
        iArr[i11 + 2] = i10;
        iArr[i11 + 3] = i10;
    }

    public void d(int i9) {
        int[] iArr = (int[]) this.d;
        if (iArr[i9] != 0) {
            return;
        }
        iArr[i9] = 1;
        for (fy0 fy0Var : ((fy0[][]) this.c)[i9]) {
            d(fy0Var.a.b);
            fy0[] fy0VarArr = (fy0[]) this.b;
            int i10 = this.a;
            this.a = i10 - 1;
            fy0VarArr[i10] = fy0Var;
        }
        iArr[i9] = 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x0164, code lost:
    
        if (r32.r() == 21) goto L41;
     */
    @Override // w3.y
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void g(d5.y yVar) {
        d5.e0 e0Var;
        SparseArray sparseArray;
        d5.e0 e0Var2;
        int i9;
        int i10;
        SparseArray sparseArray2;
        int i11;
        SparseArray sparseArray3 = (SparseArray) this.c;
        SparseIntArray sparseIntArray = (SparseIntArray) this.d;
        d5.x xVar = (d5.x) this.b;
        w3.b0 b0Var = (w3.b0) this.e;
        SparseArray sparseArray4 = b0Var.f;
        SparseBooleanArray sparseBooleanArray = b0Var.g;
        o0.h hVar = b0Var.e;
        List list = b0Var.b;
        int i12 = b0Var.a;
        if (yVar.r() != 2) {
            return;
        }
        if (i12 == 1 || i12 == 2 || b0Var.l == 1) {
            e0Var = (d5.e0) list.get(0);
        } else {
            e0Var = new d5.e0(((d5.e0) list.get(0)).c());
            list.add(e0Var);
        }
        if ((yVar.r() & 128) == 0) {
            return;
        }
        yVar.D(1);
        int w8 = yVar.w();
        yVar.D(3);
        yVar.c(0, 2, xVar.b);
        xVar.p(0);
        xVar.s(3);
        b0Var.r = xVar.i(13);
        yVar.c(0, 2, xVar.b);
        xVar.p(0);
        xVar.s(4);
        yVar.D(xVar.i(12));
        if (i12 == 2 && b0Var.p == null) {
            w3.e0 a2 = hVar.a(21, new t5.c(21, (String) null, (ArrayList) null, d5.f0.f));
            b0Var.p = a2;
            if (a2 != null) {
                a2.e(e0Var, b0Var.k, new w3.d0(w8, 21, 8192));
            }
        }
        sparseArray3.clear();
        sparseIntArray.clear();
        int a3 = yVar.a();
        while (a3 > 0) {
            yVar.c(0, 5, xVar.b);
            xVar.p(0);
            int i13 = xVar.i(8);
            xVar.s(3);
            int i14 = xVar.i(13);
            xVar.s(4);
            int i15 = xVar.i(12);
            int i16 = yVar.b;
            int i17 = i16 + i15;
            int i18 = a3;
            d5.x xVar2 = xVar;
            SparseArray sparseArray5 = sparseArray4;
            d5.e0 e0Var3 = e0Var;
            int i19 = -1;
            String str = null;
            ArrayList arrayList = null;
            while (true) {
                if (yVar.b >= i17) {
                    i10 = w8;
                    break;
                }
                int r10 = yVar.r();
                i10 = w8;
                int r11 = yVar.b + yVar.r();
                if (r11 > i17) {
                    break;
                }
                SparseArray sparseArray6 = sparseArray3;
                if (r10 == 5) {
                    long s10 = yVar.s();
                    if (s10 == 1094921523) {
                        i19 = 129;
                    } else if (s10 == 1161904947) {
                        i19 = 135;
                    } else {
                        if (s10 != 1094921524) {
                            if (s10 == 1212503619) {
                                i19 = 36;
                            }
                        }
                        i19 = 172;
                    }
                    i11 = r11;
                } else if (r10 == 106) {
                    i11 = r11;
                    i19 = 129;
                } else if (r10 == 122) {
                    i11 = r11;
                    i19 = 135;
                } else {
                    if (r10 != 127) {
                        if (r10 == 123) {
                            i19 = 138;
                        } else if (r10 == 10) {
                            str = yVar.p(3, n8.d.c).trim();
                        } else if (r10 == 89) {
                            arrayList = new ArrayList();
                            while (yVar.b < r11) {
                                String trim = yVar.p(3, n8.d.c).trim();
                                yVar.r();
                                byte[] bArr = new byte[4];
                                yVar.c(0, 4, bArr);
                                arrayList.add(new w3.c0(trim, bArr));
                                r11 = r11;
                            }
                            i11 = r11;
                            i19 = 89;
                        } else {
                            i11 = r11;
                            if (r10 == 111) {
                                i19 = 257;
                            }
                            yVar.D(i11 - yVar.b);
                            w8 = i10;
                            sparseArray3 = sparseArray6;
                        }
                    }
                    i11 = r11;
                }
                yVar.D(i11 - yVar.b);
                w8 = i10;
                sparseArray3 = sparseArray6;
            }
            SparseArray sparseArray7 = sparseArray3;
            yVar.C(i17);
            t5.c cVar = new t5.c(i19, str, arrayList, Arrays.copyOfRange(yVar.a, i16, i17));
            if (i13 == 6 || i13 == 5) {
                i13 = i19;
            }
            a3 = i18 - (i15 + 5);
            int i20 = i12 == 2 ? i13 : i14;
            if (sparseBooleanArray.get(i20)) {
                sparseArray2 = sparseArray7;
            } else {
                w3.e0 a10 = (i12 == 2 && i13 == 21) ? b0Var.p : hVar.a(i13, cVar);
                if (i12 != 2 || i14 < sparseIntArray.get(i20, 8192)) {
                    sparseIntArray.put(i20, i14);
                    sparseArray2 = sparseArray7;
                    sparseArray2.put(i20, a10);
                } else {
                    sparseArray2 = sparseArray7;
                }
            }
            sparseArray3 = sparseArray2;
            xVar = xVar2;
            sparseArray4 = sparseArray5;
            e0Var = e0Var3;
            w8 = i10;
        }
        SparseArray sparseArray8 = sparseArray4;
        int i21 = w8;
        d5.e0 e0Var4 = e0Var;
        SparseArray sparseArray9 = sparseArray3;
        int size = sparseIntArray.size();
        int i22 = 0;
        while (i22 < size) {
            int keyAt = sparseIntArray.keyAt(i22);
            int valueAt = sparseIntArray.valueAt(i22);
            sparseBooleanArray.put(keyAt, true);
            b0Var.h.put(valueAt, true);
            w3.e0 e0Var5 = (w3.e0) sparseArray9.valueAt(i22);
            if (e0Var5 != null) {
                if (e0Var5 != b0Var.p) {
                    i9 = i21;
                    e0Var2 = e0Var4;
                    e0Var5.e(e0Var2, b0Var.k, new w3.d0(i9, keyAt, 8192));
                } else {
                    e0Var2 = e0Var4;
                    i9 = i21;
                }
                sparseArray = sparseArray8;
                sparseArray.put(valueAt, e0Var5);
            } else {
                sparseArray = sparseArray8;
                e0Var2 = e0Var4;
                i9 = i21;
            }
            i22++;
            sparseArray8 = sparseArray;
            i21 = i9;
            e0Var4 = e0Var2;
        }
        SparseArray sparseArray10 = sparseArray8;
        if (i12 == 2) {
            if (b0Var.m) {
                return;
            }
            b0Var.k.B();
            b0Var.l = 0;
            b0Var.m = true;
            return;
        }
        sparseArray10.remove(this.a);
        int i23 = i12 == 1 ? 0 : b0Var.l - 1;
        b0Var.l = i23;
        if (i23 == 0) {
            b0Var.k.B();
            b0Var.m = true;
        }
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
        int i9;
        Notification.BubbleMetadata bubbleMetadata;
        int i10;
        Notification.BubbleMetadata a2;
        f0.h hVar;
        Bundle bundle;
        ArrayList arrayList;
        int i11;
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
        int i12 = Build.VERSION.SDK_INT;
        if (i12 >= 26) {
            this.c = g6.a.a(context, tVar.y);
        } else {
            this.c = new Notification.Builder(context);
        }
        Notification notification = tVar.E;
        ((Notification.Builder) this.c).setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, null).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(tVar.e).setContentText(tVar.f).setContentInfo(null).setContentIntent(tVar.g).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(null, (notification.flags & 128) != 0).setNumber(tVar.i).setProgress(tVar.n, tVar.o, tVar.p);
        if (i12 < 23) {
            Notification.Builder builder2 = (Notification.Builder) this.c;
            IconCompat iconCompat = tVar.h;
            builder2.setLargeIcon(iconCompat == null ? null : iconCompat.f());
        } else {
            Notification.Builder builder3 = (Notification.Builder) this.c;
            IconCompat iconCompat2 = tVar.h;
            b.v(builder3, iconCompat2 == null ? null : iconCompat2.m(context));
        }
        ((Notification.Builder) this.c).setSubText(tVar.m).setUsesChronometer(false).setPriority(tVar.j);
        ArrayList arrayList6 = tVar.b;
        int size = arrayList6.size();
        int i13 = 0;
        while (i13 < size) {
            Object obj = arrayList6.get(i13);
            int i14 = i13 + 1;
            k kVar = (k) obj;
            int i15 = Build.VERSION.SDK_INT;
            IconCompat a3 = kVar.a();
            int i16 = kVar.f;
            boolean z10 = kVar.d;
            Bundle bundle3 = kVar.a;
            ArrayList arrayList7 = arrayList6;
            PendingIntent pendingIntent = kVar.i;
            int i17 = size;
            CharSequence charSequence = kVar.h;
            if (i15 >= 23) {
                builder = b.b(a3 != null ? a3.m(null) : null, charSequence, pendingIntent);
            } else {
                builder = new Notification.Action.Builder(a3 != null ? a3.g() : 0, charSequence, pendingIntent);
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
            int i18 = Build.VERSION.SDK_INT;
            if (i18 >= 24) {
                androidx.emoji2.text.v.h(builder, z10);
            }
            bundle2.putInt("android.support.action.semanticAction", i16);
            if (i18 >= 28) {
                d1.f.x(builder, i16);
            }
            if (i18 >= 29) {
                com.google.firebase.messaging.q.g(builder);
            }
            if (i18 >= 31) {
                h0.a(builder);
            }
            bundle2.putBoolean("android.support.action.showsUserInterface", kVar.e);
            builder.addExtras(bundle2);
            ((Notification.Builder) this.c).addAction(builder.build());
            arrayList6 = arrayList7;
            size = i17;
            i13 = i14;
        }
        Bundle bundle4 = tVar.v;
        if (bundle4 != null) {
            ((Bundle) this.e).putAll(bundle4);
        }
        int i19 = Build.VERSION.SDK_INT;
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
        if (i19 < 28) {
            if (arrayList4 == null) {
                arrayList2 = null;
            } else {
                arrayList2 = new ArrayList(arrayList4.size());
                int size2 = arrayList4.size();
                int i20 = 0;
                while (i20 < size2) {
                    Object obj2 = arrayList4.get(i20);
                    i20++;
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
            int i21 = 0;
            while (i21 < size3) {
                Object obj3 = arrayList3.get(i21);
                i21++;
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
            int i22 = 0;
            while (i22 < arrayList5.size()) {
                String num = Integer.toString(i22);
                k kVar2 = (k) arrayList5.get(i22);
                Bundle bundle8 = new Bundle();
                IconCompat a10 = kVar2.a();
                Bundle bundle9 = kVar2.a;
                bundle8.putInt("icon", a10 != null ? a10.g() : 0);
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
                    i11 = i22;
                    bundleArr = null;
                } else {
                    Bundle[] bundleArr2 = new Bundle[r0VarArr2.length];
                    arrayList = arrayList5;
                    i11 = i22;
                    int i23 = 0;
                    while (i23 < r0VarArr2.length) {
                        r0 r0Var = r0VarArr2[i23];
                        int i24 = i23;
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
                        bundleArr3[i24] = bundle10;
                        i23 = i24 + 1;
                        r0VarArr2 = r0VarArr3;
                        bundleArr2 = bundleArr3;
                    }
                    bundleArr = bundleArr2;
                }
                bundle8.putParcelableArray("remoteInputs", bundleArr);
                bundle8.putBoolean("showsUserInterface", kVar2.e);
                bundle8.putInt("semanticAction", kVar2.f);
                bundle7.putBundle(num, bundle8);
                i22 = i11 + 1;
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
        int i25 = Build.VERSION.SDK_INT;
        if (i25 >= 24) {
            ((Notification.Builder) this.c).setExtras(tVar.v);
            androidx.emoji2.text.v.i((Notification.Builder) this.c);
        }
        if (i25 >= 26) {
            g6.a.h((Notification.Builder) this.c);
            g6.a.n((Notification.Builder) this.c);
            g6.a.o((Notification.Builder) this.c, tVar.z);
            g6.a.p((Notification.Builder) this.c);
            g6.a.j((Notification.Builder) this.c, tVar.B);
            if (!TextUtils.isEmpty(tVar.y)) {
                bubbleMetadata = null;
                i9 = 0;
                ((Notification.Builder) this.c).setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
                if (i25 >= 28) {
                    int size4 = arrayList4.size();
                    while (i9 < size4) {
                        Object obj4 = arrayList4.get(i9);
                        i9++;
                        p0 p0Var2 = (p0) obj4;
                        Notification.Builder builder4 = (Notification.Builder) this.c;
                        p0Var2.getClass();
                        d1.f.a(builder4, d1.f.D(p0Var2));
                    }
                }
                i10 = Build.VERSION.SDK_INT;
                if (i10 >= 29) {
                    return;
                }
                com.google.firebase.messaging.q.e((Notification.Builder) this.c, tVar.C);
                Notification.Builder builder5 = (Notification.Builder) this.c;
                r rVar = tVar.D;
                if (rVar != null) {
                    if (i10 >= 30) {
                        a2 = q.a(rVar);
                    } else if (i10 == 29) {
                        a2 = p.a(rVar);
                    }
                    com.google.firebase.messaging.q.f(builder5, a2);
                    hVar = tVar.A;
                    if (hVar == null) {
                        com.google.firebase.messaging.q.i((Notification.Builder) this.c, hVar.b);
                        return;
                    }
                    return;
                }
                a2 = bubbleMetadata;
                com.google.firebase.messaging.q.f(builder5, a2);
                hVar = tVar.A;
                if (hVar == null) {
                }
            }
        }
        i9 = 0;
        bubbleMetadata = null;
        if (i25 >= 28) {
        }
        i10 = Build.VERSION.SDK_INT;
        if (i10 >= 29) {
        }
    }

    @Override // w3.y
    public void e(d5.e0 e0Var, m3.m mVar, w3.d0 d0Var) {
    }

    public i0(j3.n0 n0Var, m3.y yVar, byte[] bArr, d5.c[] cVarArr, int i9) {
        this.b = n0Var;
        this.c = yVar;
        this.d = bArr;
        this.e = cVarArr;
        this.a = i9;
    }

    public i0(w3.b0 b0Var, int i9) {
        this.e = b0Var;
        this.b = new d5.x(new byte[5], 5);
        this.c = new SparseArray();
        this.d = new SparseIntArray();
        this.a = i9;
    }

    public i0(hy0 hy0Var, fy0[] fy0VarArr) {
        this.e = hy0Var;
        int length = fy0VarArr.length;
        this.b = new fy0[length];
        this.a = length - 1;
        int e10 = hy0Var.e() + 1;
        fy0[][] fy0VarArr2 = new fy0[e10][];
        int[] iArr = new int[e10];
        for (fy0 fy0Var : fy0VarArr) {
            int i9 = fy0Var.a.a;
            iArr[i9] = iArr[i9] + 1;
        }
        for (int i10 = 0; i10 < e10; i10++) {
            fy0VarArr2[i10] = new fy0[iArr[i10]];
        }
        Arrays.fill(iArr, 0);
        for (fy0 fy0Var2 : fy0VarArr) {
            int i11 = fy0Var2.a.a;
            fy0[] fy0VarArr3 = fy0VarArr2[i11];
            int i12 = iArr[i11];
            iArr[i11] = i12 + 1;
            fy0VarArr3[i12] = fy0Var2;
        }
        this.c = fy0VarArr2;
        this.d = new int[((hy0) this.e).e() + 1];
    }
}
