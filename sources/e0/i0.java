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
import org.telegram.ui.Components.qy0;
import org.telegram.ui.Components.sy0;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class i0 implements y3.y {
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

    public static void a(float[] fArr, int i10, float f9, float f10, float f11, float f12) {
        int i11 = i10 * 8;
        fArr[i11] = f9;
        fArr[i11 + 1] = f10;
        fArr[i11 + 2] = f11;
        fArr[i11 + 3] = f10;
        fArr[i11 + 4] = f11;
        fArr[i11 + 5] = f12;
        fArr[i11 + 6] = f9;
        fArr[i11 + 7] = f12;
    }

    public static void d(Notification notification) {
        notification.sound = null;
        notification.vibrate = null;
        notification.defaults &= -4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x0164, code lost:
    
        if (r32.r() == 21) goto L41;
     */
    @Override // y3.y
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void c(f5.w wVar) {
        f5.c0 c0Var;
        SparseArray sparseArray;
        f5.c0 c0Var2;
        int i10;
        int i11;
        SparseArray sparseArray2;
        int i12;
        SparseArray sparseArray3 = (SparseArray) this.c;
        SparseIntArray sparseIntArray = (SparseIntArray) this.d;
        f5.v vVar = (f5.v) this.b;
        y3.b0 b0Var = (y3.b0) this.e;
        SparseArray sparseArray4 = b0Var.f;
        SparseBooleanArray sparseBooleanArray = b0Var.g;
        o0.i iVar = b0Var.e;
        List list = b0Var.b;
        int i13 = b0Var.a;
        if (wVar.r() != 2) {
            return;
        }
        if (i13 == 1 || i13 == 2 || b0Var.l == 1) {
            c0Var = (f5.c0) list.get(0);
        } else {
            c0Var = new f5.c0(((f5.c0) list.get(0)).c());
            list.add(c0Var);
        }
        if ((wVar.r() & 128) == 0) {
            return;
        }
        wVar.D(1);
        int w10 = wVar.w();
        wVar.D(3);
        wVar.c(0, 2, vVar.b);
        vVar.p(0);
        vVar.s(3);
        b0Var.r = vVar.i(13);
        wVar.c(0, 2, vVar.b);
        vVar.p(0);
        vVar.s(4);
        wVar.D(vVar.i(12));
        if (i13 == 2 && b0Var.p == null) {
            y3.e0 a2 = iVar.a(21, new v5.c(21, (String) null, (ArrayList) null, f5.d0.f));
            b0Var.p = a2;
            if (a2 != null) {
                a2.b(c0Var, b0Var.k, new y3.d0(w10, 21, 8192));
            }
        }
        sparseArray3.clear();
        sparseIntArray.clear();
        int a10 = wVar.a();
        while (a10 > 0) {
            wVar.c(0, 5, vVar.b);
            vVar.p(0);
            int i14 = vVar.i(8);
            vVar.s(3);
            int i15 = vVar.i(13);
            vVar.s(4);
            int i16 = vVar.i(12);
            int i17 = wVar.b;
            int i18 = i17 + i16;
            int i19 = a10;
            f5.v vVar2 = vVar;
            SparseArray sparseArray5 = sparseArray4;
            f5.c0 c0Var3 = c0Var;
            int i20 = -1;
            String str = null;
            ArrayList arrayList = null;
            while (true) {
                if (wVar.b >= i18) {
                    i11 = w10;
                    break;
                }
                int r6 = wVar.r();
                i11 = w10;
                int r9 = wVar.b + wVar.r();
                if (r9 > i18) {
                    break;
                }
                SparseArray sparseArray6 = sparseArray3;
                if (r6 == 5) {
                    long s10 = wVar.s();
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
                    i12 = r9;
                } else if (r6 == 106) {
                    i12 = r9;
                    i20 = 129;
                } else if (r6 == 122) {
                    i12 = r9;
                    i20 = 135;
                } else {
                    if (r6 != 127) {
                        if (r6 == 123) {
                            i20 = 138;
                        } else if (r6 == 10) {
                            str = wVar.p(3, p8.d.c).trim();
                        } else if (r6 == 89) {
                            arrayList = new ArrayList();
                            while (wVar.b < r9) {
                                String trim = wVar.p(3, p8.d.c).trim();
                                wVar.r();
                                byte[] bArr = new byte[4];
                                wVar.c(0, 4, bArr);
                                arrayList.add(new y3.c0(trim, bArr));
                                r9 = r9;
                            }
                            i12 = r9;
                            i20 = 89;
                        } else {
                            i12 = r9;
                            if (r6 == 111) {
                                i20 = 257;
                            }
                            wVar.D(i12 - wVar.b);
                            w10 = i11;
                            sparseArray3 = sparseArray6;
                        }
                    }
                    i12 = r9;
                }
                wVar.D(i12 - wVar.b);
                w10 = i11;
                sparseArray3 = sparseArray6;
            }
            SparseArray sparseArray7 = sparseArray3;
            wVar.C(i18);
            v5.c cVar = new v5.c(i20, str, arrayList, Arrays.copyOfRange(wVar.a, i17, i18));
            if (i14 == 6 || i14 == 5) {
                i14 = i20;
            }
            a10 = i19 - (i16 + 5);
            int i21 = i13 == 2 ? i14 : i15;
            if (sparseBooleanArray.get(i21)) {
                sparseArray2 = sparseArray7;
            } else {
                y3.e0 a11 = (i13 == 2 && i14 == 21) ? b0Var.p : iVar.a(i14, cVar);
                if (i13 != 2 || i15 < sparseIntArray.get(i21, 8192)) {
                    sparseIntArray.put(i21, i15);
                    sparseArray2 = sparseArray7;
                    sparseArray2.put(i21, a11);
                } else {
                    sparseArray2 = sparseArray7;
                }
            }
            sparseArray3 = sparseArray2;
            vVar = vVar2;
            sparseArray4 = sparseArray5;
            c0Var = c0Var3;
            w10 = i11;
        }
        SparseArray sparseArray8 = sparseArray4;
        int i22 = w10;
        f5.c0 c0Var4 = c0Var;
        SparseArray sparseArray9 = sparseArray3;
        int size = sparseIntArray.size();
        int i23 = 0;
        while (i23 < size) {
            int keyAt = sparseIntArray.keyAt(i23);
            int valueAt = sparseIntArray.valueAt(i23);
            sparseBooleanArray.put(keyAt, true);
            b0Var.h.put(valueAt, true);
            y3.e0 e0Var = (y3.e0) sparseArray9.valueAt(i23);
            if (e0Var != null) {
                if (e0Var != b0Var.p) {
                    i10 = i22;
                    c0Var2 = c0Var4;
                    e0Var.b(c0Var2, b0Var.k, new y3.d0(i10, keyAt, 8192));
                } else {
                    c0Var2 = c0Var4;
                    i10 = i22;
                }
                sparseArray = sparseArray8;
                sparseArray.put(valueAt, e0Var);
            } else {
                sparseArray = sparseArray8;
                c0Var2 = c0Var4;
                i10 = i22;
            }
            i23++;
            sparseArray8 = sparseArray;
            i22 = i10;
            c0Var4 = c0Var2;
        }
        SparseArray sparseArray10 = sparseArray8;
        if (i13 == 2) {
            if (b0Var.m) {
                return;
            }
            b0Var.k.e1();
            b0Var.l = 0;
            b0Var.m = true;
            return;
        }
        sparseArray10.remove(this.a);
        int i24 = i13 == 1 ? 0 : b0Var.l - 1;
        b0Var.l = i24;
        if (i24 == 0) {
            b0Var.k.e1();
            b0Var.m = true;
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
        for (qy0 qy0Var : ((qy0[][]) this.c)[i10]) {
            f(qy0Var.a.b);
            qy0[] qy0VarArr = (qy0[]) this.b;
            int i11 = this.a;
            this.a = i11 - 1;
            qy0VarArr[i11] = qy0Var;
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
            this.c = i6.a.a(context, tVar.y);
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
                androidx.emoji2.text.v.h(builder, z10);
            }
            bundle2.putInt("android.support.action.semanticAction", i17);
            if (i19 >= 28) {
                d1.f.y(builder, i17);
            }
            if (i19 >= 29) {
                com.google.firebase.messaging.p.g(builder);
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
            androidx.emoji2.text.v.i((Notification.Builder) this.c);
        }
        if (i26 >= 26) {
            i6.a.i((Notification.Builder) this.c);
            i6.a.o((Notification.Builder) this.c);
            i6.a.p((Notification.Builder) this.c, tVar.z);
            i6.a.q((Notification.Builder) this.c);
            i6.a.k((Notification.Builder) this.c, tVar.B);
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
                        d1.f.a(builder4, d1.f.E(p0Var2));
                    }
                }
                i11 = Build.VERSION.SDK_INT;
                if (i11 >= 29) {
                    return;
                }
                com.google.firebase.messaging.p.e((Notification.Builder) this.c, tVar.C);
                Notification.Builder builder5 = (Notification.Builder) this.c;
                r rVar = tVar.D;
                if (rVar != null) {
                    if (i11 >= 30) {
                        a2 = q.a(rVar);
                    } else if (i11 == 29) {
                        a2 = p.a(rVar);
                    }
                    com.google.firebase.messaging.p.f(builder5, a2);
                    hVar = tVar.A;
                    if (hVar == null) {
                        com.google.firebase.messaging.p.i((Notification.Builder) this.c, hVar.b);
                        return;
                    }
                    return;
                }
                a2 = bubbleMetadata;
                com.google.firebase.messaging.p.f(builder5, a2);
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

    @Override // y3.y
    public void b(f5.c0 c0Var, o3.m mVar, y3.d0 d0Var) {
    }

    public i0(l3.p0 p0Var, o3.y yVar, byte[] bArr, f5.c[] cVarArr, int i10) {
        this.b = p0Var;
        this.c = yVar;
        this.d = bArr;
        this.e = cVarArr;
        this.a = i10;
    }

    public i0(y3.b0 b0Var, int i10) {
        this.e = b0Var;
        this.b = new f5.v(new byte[5], 5);
        this.c = new SparseArray();
        this.d = new SparseIntArray();
        this.a = i10;
    }

    public i0(sy0 sy0Var, qy0[] qy0VarArr) {
        this.e = sy0Var;
        int length = qy0VarArr.length;
        this.b = new qy0[length];
        this.a = length - 1;
        int e10 = sy0Var.e() + 1;
        qy0[][] qy0VarArr2 = new qy0[e10][];
        int[] iArr = new int[e10];
        for (qy0 qy0Var : qy0VarArr) {
            int i10 = qy0Var.a.a;
            iArr[i10] = iArr[i10] + 1;
        }
        for (int i11 = 0; i11 < e10; i11++) {
            qy0VarArr2[i11] = new qy0[iArr[i11]];
        }
        Arrays.fill(iArr, 0);
        for (qy0 qy0Var2 : qy0VarArr) {
            int i12 = qy0Var2.a.a;
            qy0[] qy0VarArr3 = qy0VarArr2[i12];
            int i13 = iArr[i12];
            iArr[i12] = i13 + 1;
            qy0VarArr3[i13] = qy0Var2;
        }
        this.c = qy0VarArr2;
        this.d = new int[((sy0) this.e).e() + 1];
    }
}
