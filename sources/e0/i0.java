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
import org.telegram.ui.Components.hy0;
import org.telegram.ui.Components.jy0;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class i0 implements w3.y {
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

    public static void c(float[] fArr, int i10, float f10, float f11, float f12, float f13) {
        int i11 = i10 * 8;
        fArr[i11] = f10;
        fArr[i11 + 1] = f11;
        fArr[i11 + 2] = f12;
        fArr[i11 + 3] = f11;
        fArr[i11 + 4] = f12;
        fArr[i11 + 5] = f13;
        fArr[i11 + 6] = f10;
        fArr[i11 + 7] = f13;
    }

    public static void d(Notification notification) {
        notification.sound = null;
        notification.vibrate = null;
        notification.defaults &= -4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x0164, code lost:
    
        if (r32.r() == 21) goto L41;
     */
    @Override // w3.y
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void b(d5.z zVar) {
        d5.f0 f0Var;
        SparseArray sparseArray;
        d5.f0 f0Var2;
        int i10;
        int i11;
        SparseArray sparseArray2;
        int i12;
        SparseArray sparseArray3 = (SparseArray) this.c;
        SparseIntArray sparseIntArray = (SparseIntArray) this.d;
        d5.y yVar = (d5.y) this.b;
        w3.c0 c0Var = (w3.c0) this.e;
        SparseArray sparseArray4 = c0Var.f;
        SparseBooleanArray sparseBooleanArray = c0Var.g;
        o0.i iVar = c0Var.e;
        List list = c0Var.b;
        int i13 = c0Var.a;
        if (zVar.r() != 2) {
            return;
        }
        if (i13 == 1 || i13 == 2 || c0Var.l == 1) {
            f0Var = (d5.f0) list.get(0);
        } else {
            f0Var = new d5.f0(((d5.f0) list.get(0)).c());
            list.add(f0Var);
        }
        if ((zVar.r() & 128) == 0) {
            return;
        }
        zVar.D(1);
        int w10 = zVar.w();
        zVar.D(3);
        zVar.c(0, 2, yVar.b);
        yVar.p(0);
        yVar.s(3);
        c0Var.r = yVar.i(13);
        zVar.c(0, 2, yVar.b);
        yVar.p(0);
        yVar.s(4);
        zVar.D(yVar.i(12));
        if (i13 == 2 && c0Var.p == null) {
            w3.f0 a2 = iVar.a(21, new u2.b(21, (String) null, (ArrayList) null, d5.g0.f));
            c0Var.p = a2;
            if (a2 != null) {
                a2.a(f0Var, c0Var.k, new w3.e0(w10, 21, 8192));
            }
        }
        sparseArray3.clear();
        sparseIntArray.clear();
        int a3 = zVar.a();
        while (a3 > 0) {
            zVar.c(0, 5, yVar.b);
            yVar.p(0);
            int i14 = yVar.i(8);
            yVar.s(3);
            int i15 = yVar.i(13);
            yVar.s(4);
            int i16 = yVar.i(12);
            int i17 = zVar.b;
            int i18 = i17 + i16;
            int i19 = a3;
            d5.y yVar2 = yVar;
            SparseArray sparseArray5 = sparseArray4;
            d5.f0 f0Var3 = f0Var;
            int i20 = -1;
            String str = null;
            ArrayList arrayList = null;
            while (true) {
                if (zVar.b >= i18) {
                    i11 = w10;
                    break;
                }
                int r10 = zVar.r();
                i11 = w10;
                int r11 = zVar.b + zVar.r();
                if (r11 > i18) {
                    break;
                }
                SparseArray sparseArray6 = sparseArray3;
                if (r10 == 5) {
                    long s10 = zVar.s();
                    if (s10 == 1094921523) {
                        i20 = 129;
                    } else if (s10 == 1161904947) {
                        i20 = 135;
                    } else {
                        if (s10 != 1094921524) {
                            if (s10 == 1212503619) {
                                i20 = 36;
                            }
                        }
                        i20 = 172;
                    }
                    i12 = r11;
                } else if (r10 == 106) {
                    i12 = r11;
                    i20 = 129;
                } else if (r10 == 122) {
                    i12 = r11;
                    i20 = 135;
                } else {
                    if (r10 != 127) {
                        if (r10 == 123) {
                            i20 = 138;
                        } else if (r10 == 10) {
                            str = zVar.p(3, o8.d.c).trim();
                        } else if (r10 == 89) {
                            arrayList = new ArrayList();
                            while (zVar.b < r11) {
                                String trim = zVar.p(3, o8.d.c).trim();
                                zVar.r();
                                byte[] bArr = new byte[4];
                                zVar.c(0, 4, bArr);
                                arrayList.add(new w3.d0(trim, bArr));
                                r11 = r11;
                            }
                            i12 = r11;
                            i20 = 89;
                        } else {
                            i12 = r11;
                            if (r10 == 111) {
                                i20 = 257;
                            }
                            zVar.D(i12 - zVar.b);
                            w10 = i11;
                            sparseArray3 = sparseArray6;
                        }
                    }
                    i12 = r11;
                }
                zVar.D(i12 - zVar.b);
                w10 = i11;
                sparseArray3 = sparseArray6;
            }
            SparseArray sparseArray7 = sparseArray3;
            zVar.C(i18);
            u2.b bVar = new u2.b(i20, str, arrayList, Arrays.copyOfRange(zVar.a, i17, i18));
            if (i14 == 6 || i14 == 5) {
                i14 = i20;
            }
            a3 = i19 - (i16 + 5);
            int i21 = i13 == 2 ? i14 : i15;
            if (sparseBooleanArray.get(i21)) {
                sparseArray2 = sparseArray7;
            } else {
                w3.f0 a10 = (i13 == 2 && i14 == 21) ? c0Var.p : iVar.a(i14, bVar);
                if (i13 != 2 || i15 < sparseIntArray.get(i21, 8192)) {
                    sparseIntArray.put(i21, i15);
                    sparseArray2 = sparseArray7;
                    sparseArray2.put(i21, a10);
                } else {
                    sparseArray2 = sparseArray7;
                }
            }
            sparseArray3 = sparseArray2;
            yVar = yVar2;
            sparseArray4 = sparseArray5;
            f0Var = f0Var3;
            w10 = i11;
        }
        SparseArray sparseArray8 = sparseArray4;
        int i22 = w10;
        d5.f0 f0Var4 = f0Var;
        SparseArray sparseArray9 = sparseArray3;
        int size = sparseIntArray.size();
        int i23 = 0;
        while (i23 < size) {
            int keyAt = sparseIntArray.keyAt(i23);
            int valueAt = sparseIntArray.valueAt(i23);
            sparseBooleanArray.put(keyAt, true);
            c0Var.h.put(valueAt, true);
            w3.f0 f0Var5 = (w3.f0) sparseArray9.valueAt(i23);
            if (f0Var5 != null) {
                if (f0Var5 != c0Var.p) {
                    i10 = i22;
                    f0Var2 = f0Var4;
                    f0Var5.a(f0Var2, c0Var.k, new w3.e0(i10, keyAt, 8192));
                } else {
                    f0Var2 = f0Var4;
                    i10 = i22;
                }
                sparseArray = sparseArray8;
                sparseArray.put(valueAt, f0Var5);
            } else {
                sparseArray = sparseArray8;
                f0Var2 = f0Var4;
                i10 = i22;
            }
            i23++;
            sparseArray8 = sparseArray;
            i22 = i10;
            f0Var4 = f0Var2;
        }
        SparseArray sparseArray10 = sparseArray8;
        if (i13 == 2) {
            if (c0Var.m) {
                return;
            }
            c0Var.k.A();
            c0Var.l = 0;
            c0Var.m = true;
            return;
        }
        sparseArray10.remove(this.a);
        int i24 = i13 == 1 ? 0 : c0Var.l - 1;
        c0Var.l = i24;
        if (i24 == 0) {
            c0Var.k.A();
            c0Var.m = true;
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
        for (hy0 hy0Var : ((hy0[][]) this.c)[i10]) {
            f(hy0Var.a.b);
            hy0[] hy0VarArr = (hy0[]) this.b;
            int i11 = this.a;
            this.a = i11 - 1;
            hy0VarArr[i11] = hy0Var;
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
            this.c = h6.a.a(context, tVar.y);
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
            b.v(builder3, iconCompat2 == null ? null : iconCompat2.m(context));
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
            IconCompat a3 = kVar.a();
            int i17 = kVar.f;
            boolean z10 = kVar.d;
            Bundle bundle3 = kVar.a;
            ArrayList arrayList7 = arrayList6;
            PendingIntent pendingIntent = kVar.i;
            int i18 = size;
            CharSequence charSequence = kVar.h;
            if (i16 >= 23) {
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
            int i19 = Build.VERSION.SDK_INT;
            if (i19 >= 24) {
                androidx.emoji2.text.v.h(builder, z10);
            }
            bundle2.putInt("android.support.action.semanticAction", i17);
            if (i19 >= 28) {
                d1.f.x(builder, i17);
            }
            if (i19 >= 29) {
                com.google.firebase.messaging.q.g(builder);
            }
            if (i19 >= 31) {
                h0.a(builder);
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
            androidx.emoji2.text.v.i((Notification.Builder) this.c);
        }
        if (i26 >= 26) {
            h6.a.h((Notification.Builder) this.c);
            h6.a.n((Notification.Builder) this.c);
            h6.a.o((Notification.Builder) this.c, tVar.z);
            h6.a.p((Notification.Builder) this.c);
            h6.a.j((Notification.Builder) this.c, tVar.B);
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
                        d1.f.a(builder4, d1.f.D(p0Var2));
                    }
                }
                i11 = Build.VERSION.SDK_INT;
                if (i11 >= 29) {
                    return;
                }
                com.google.firebase.messaging.q.e((Notification.Builder) this.c, tVar.C);
                Notification.Builder builder5 = (Notification.Builder) this.c;
                r rVar = tVar.D;
                if (rVar != null) {
                    if (i11 >= 30) {
                        a2 = q.a(rVar);
                    } else if (i11 == 29) {
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
        i10 = 0;
        bubbleMetadata = null;
        if (i26 >= 28) {
        }
        i11 = Build.VERSION.SDK_INT;
        if (i11 >= 29) {
        }
    }

    @Override // w3.y
    public void a(d5.f0 f0Var, m3.m mVar, w3.e0 e0Var) {
    }

    public i0(j3.o0 o0Var, m3.y yVar, byte[] bArr, d5.c[] cVarArr, int i10) {
        this.b = o0Var;
        this.c = yVar;
        this.d = bArr;
        this.e = cVarArr;
        this.a = i10;
    }

    public i0(w3.c0 c0Var, int i10) {
        this.e = c0Var;
        this.b = new d5.y(new byte[5], 5);
        this.c = new SparseArray();
        this.d = new SparseIntArray();
        this.a = i10;
    }

    public i0(jy0 jy0Var, hy0[] hy0VarArr) {
        this.e = jy0Var;
        int length = hy0VarArr.length;
        this.b = new hy0[length];
        this.a = length - 1;
        int e9 = jy0Var.e() + 1;
        hy0[][] hy0VarArr2 = new hy0[e9][];
        int[] iArr = new int[e9];
        for (hy0 hy0Var : hy0VarArr) {
            int i10 = hy0Var.a.a;
            iArr[i10] = iArr[i10] + 1;
        }
        for (int i11 = 0; i11 < e9; i11++) {
            hy0VarArr2[i11] = new hy0[iArr[i11]];
        }
        Arrays.fill(iArr, 0);
        for (hy0 hy0Var2 : hy0VarArr) {
            int i12 = hy0Var2.a.a;
            hy0[] hy0VarArr3 = hy0VarArr2[i12];
            int i13 = iArr[i12];
            iArr[i12] = i13 + 1;
            hy0VarArr3[i13] = hy0Var2;
        }
        this.c = hy0VarArr2;
        this.d = new int[((jy0) this.e).e() + 1];
    }
}
