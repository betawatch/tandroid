package org.telegram.messenger;

import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.os.Build;
import android.util.Pair;
import android.util.SparseArray;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.s51;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes.dex */
public final class z5 extends c1 implements ls {
    public static volatile z5[] T = new z5[4];
    public int D;
    public boolean E;
    public final a0.h F;
    public final ArrayList G;
    public final ArrayList H;
    public final SparseArray I;
    public final y5 J;
    public final y5 K;
    public final y5 L;
    public final y5 M;
    public final y5 N;
    public final y5 O;
    public int P;
    public int Q;
    public int R;
    public final m.f3 S;
    public int a;
    public final ArrayList b;
    public final ArrayList c;
    public final ArrayList d;
    public final ArrayList e;
    public final HashMap f;
    public final HashMap h;
    public final HashMap n;
    public final HashMap r;
    public final SparseArray s;
    public boolean w;
    public final HashMap x;
    public final ArrayList y;

    public z5(int i7) {
        super(i7);
        Object obj;
        this.a = 0;
        this.b = new ArrayList();
        this.c = new ArrayList();
        this.d = new ArrayList();
        this.e = new ArrayList();
        this.f = new HashMap();
        this.h = new HashMap();
        this.n = new HashMap();
        this.r = new HashMap();
        this.s = new SparseArray();
        this.w = false;
        this.x = new HashMap();
        this.y = new ArrayList();
        this.D = 0;
        this.F = new a0.h();
        this.G = new ArrayList();
        this.H = new ArrayList();
        this.I = new SparseArray();
        this.S = new m.f3(this, 5);
        SharedPreferences sharedPreferences = qp.s1(this.currentAccount).e7;
        y5 y5Var = new y5(sharedPreferences.getString("preset0", "1_1_1_1_1048576_512000_512000_524288_0_0_1_1_50_0"), "1_1_1_1_1048576_512000_512000_524288_0_0_1_1_50_0");
        this.J = y5Var;
        y5Var.e = false;
        this.K = new y5(sharedPreferences.getString("preset1", "13_13_13_13_1048576_10485760_1048576_524288_1_1_1_0_100_1"), "13_13_13_13_1048576_10485760_1048576_524288_1_1_1_0_100_1");
        this.L = new y5(sharedPreferences.getString("preset2", "13_13_13_13_1048576_15728640_3145728_524288_1_1_1_0_100_1"), "13_13_13_13_1048576_15728640_3145728_524288_1_1_1_0_100_1");
        boolean contains = sharedPreferences.contains("newConfig");
        if (contains || !getUserConfig().p()) {
            this.M = new y5(sharedPreferences.getString("mobilePreset", "13_13_13_13_1048576_10485760_1048576_524288_1_1_1_0_100_1"), "13_13_13_13_1048576_10485760_1048576_524288_1_1_1_0_100_1");
            this.N = new y5(sharedPreferences.getString("wifiPreset", "13_13_13_13_1048576_15728640_3145728_524288_1_1_1_0_100_1"), "13_13_13_13_1048576_15728640_3145728_524288_1_1_1_0_100_1");
            this.O = new y5(sharedPreferences.getString("roamingPreset", "1_1_1_1_1048576_512000_512000_524288_0_0_1_1_50_0"), "1_1_1_1_1048576_512000_512000_524288_0_0_1_1_50_0");
            this.P = sharedPreferences.getInt("currentMobilePreset", 3);
            this.Q = sharedPreferences.getInt("currentWifiPreset", 3);
            this.R = sharedPreferences.getInt("currentRoamingPreset", 3);
            if (!contains) {
                sharedPreferences.edit().putBoolean("newConfig", true).commit();
            }
        } else {
            int[] iArr = new int[4];
            int[] iArr2 = new int[4];
            int[] iArr3 = new int[4];
            long[] jArr = new long[7];
            long[] jArr2 = new long[7];
            long[] jArr3 = new long[7];
            int i10 = 0;
            for (int i11 = 4; i10 < i11; i11 = 4) {
                int i12 = i10;
                StringBuilder sb2 = new StringBuilder("mobileDataDownloadMask");
                Object obj2 = "";
                if (i12 == 0) {
                    obj = "";
                } else {
                    obj = "";
                    obj2 = Integer.valueOf(i12);
                }
                sb2.append(obj2);
                String sb3 = sb2.toString();
                if (i12 == 0 || sharedPreferences.contains(sb3)) {
                    iArr[i12] = sharedPreferences.getInt(sb3, 13);
                    StringBuilder sb4 = new StringBuilder("wifiDownloadMask");
                    sb4.append(i12 == 0 ? obj : Integer.valueOf(i12));
                    iArr2[i12] = sharedPreferences.getInt(sb4.toString(), 13);
                    StringBuilder sb5 = new StringBuilder("roamingDownloadMask");
                    sb5.append(i12 == 0 ? obj : Integer.valueOf(i12));
                    iArr3[i12] = sharedPreferences.getInt(sb5.toString(), 1);
                } else {
                    iArr[i12] = iArr[0];
                    iArr2[i12] = iArr2[0];
                    iArr3[i12] = iArr3[0];
                }
                i10 = i12 + 1;
            }
            jArr[2] = sharedPreferences.getLong("mobileMaxDownloadSize2", this.K.b[1]);
            jArr[3] = sharedPreferences.getLong("mobileMaxDownloadSize3", this.K.b[2]);
            jArr2[2] = sharedPreferences.getLong("wifiMaxDownloadSize2", this.L.b[1]);
            jArr2[3] = sharedPreferences.getLong("wifiMaxDownloadSize3", this.L.b[2]);
            jArr3[2] = sharedPreferences.getLong("roamingMaxDownloadSize2", this.J.b[1]);
            jArr3[3] = sharedPreferences.getLong("roamingMaxDownloadSize3", this.J.b[2]);
            boolean z9 = sharedPreferences.getBoolean("globalAutodownloadEnabled", true);
            y5 y5Var2 = new y5(iArr, this.K.b[0], jArr[2], jArr[3], true, true, z9, false, 100, false);
            this.M = y5Var2;
            y5 y5Var3 = new y5(iArr2, this.L.b[0], jArr2[2], jArr2[3], true, true, z9, false, 100, true);
            this.N = y5Var3;
            y5 y5Var4 = new y5(iArr3, this.J.b[0], jArr3[2], jArr3[3], false, false, z9, true, 50, true);
            this.O = y5Var4;
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.putBoolean("newConfig", true);
            edit.putString("mobilePreset", y5Var2.toString());
            edit.putString("wifiPreset", y5Var3.toString());
            edit.putString("roamingPreset", y5Var4.toString());
            this.P = 3;
            edit.putInt("currentMobilePreset", 3);
            this.Q = 3;
            edit.putInt("currentWifiPreset", 3);
            this.R = 3;
            edit.putInt("currentRoamingPreset", 3);
            edit.commit();
        }
        g0.h3(new w5(this, 1));
        androidx.mediarouter.app.f fVar = new androidx.mediarouter.app.f(this, 5);
        IntentFilter intentFilter = new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE");
        if (Build.VERSION.SDK_INT >= 33) {
            t0.b.registerReceiver(fVar, intentFilter, 4);
        } else {
            t0.b.registerReceiver(fVar, intentFilter);
        }
        if (getUserConfig().p()) {
            g();
        }
    }

    public static z5 q(int i7) {
        z5 z5Var;
        z5 z5Var2 = T[i7];
        if (z5Var2 != null) {
            return z5Var2;
        }
        synchronized (z5.class) {
            try {
                z5Var = T[i7];
                if (z5Var == null) {
                    z5[] z5VarArr = T;
                    z5 z5Var3 = new z5(i7);
                    z5VarArr[i7] = z5Var3;
                    z5Var = z5Var3;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z5Var;
    }

    public static float r(long[] jArr) {
        if (jArr.length < 2) {
            return 0.0f;
        }
        long j3 = jArr[1];
        if (j3 == 0) {
            return 0.0f;
        }
        return Math.min(1.0f, jArr[0] / j3);
    }

    public static int x(int i7) {
        if (i7 == 1) {
            return 0;
        }
        if (i7 == 2) {
            return 2;
        }
        if (i7 == 4) {
            return 1;
        }
        return i7 == 8 ? 2 : 0;
    }

    public final void a(String str, ij ijVar, x5 x5Var) {
        if (this.w) {
            this.x.put(str, x5Var);
            return;
        }
        v(x5Var);
        HashMap hashMap = this.n;
        ArrayList arrayList = (ArrayList) hashMap.get(str);
        if (arrayList == null) {
            arrayList = new ArrayList();
            hashMap.put(str, arrayList);
        }
        arrayList.add(new WeakReference(x5Var));
        if (ijVar != null) {
            HashMap hashMap2 = this.r;
            ArrayList arrayList2 = (ArrayList) hashMap2.get(str);
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                hashMap2.put(str, arrayList2);
            }
            arrayList2.add(ijVar);
        }
        this.s.put(x5Var.getObserverTag(), str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0070, code lost:
    
        if (getContactsController().f0.containsKey(java.lang.Long.valueOf(r7.user_id)) != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0094, code lost:
    
        if (getContactsController().f0.containsKey(java.lang.Long.valueOf(r18.from_id.user_id)) != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x00d3, code lost:
    
        if (getContactsController().f0.containsKey(java.lang.Long.valueOf(r18.from_id.user_id)) != false) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00e9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int b(TLRPC.Message message) {
        int i7;
        char c10;
        int e10;
        y5 n10;
        if (message == null || (message.media instanceof TLRPC.TL_messageMediaStory)) {
            return f() ? 2 : 0;
        }
        boolean L4 = ij.L4(message);
        if (L4 || ij.t3(message) || ij.j4(message) || (ij.n1(message) instanceof TLRPC.TL_messageMediaGame)) {
            i7 = 4;
        } else if (ij.R4(message)) {
            i7 = 2;
        } else if (ij.S3(message) || ij.w4(message) || ij.L2(message)) {
            i7 = 1;
        } else {
            if (ij.G0(message) == null) {
                return 0;
            }
            i7 = 8;
        }
        TLRPC.Peer peer = message.peer_id;
        if (peer != null) {
            if (peer.user_id == 0) {
                if (peer.chat_id != 0) {
                    if (message.from_id instanceof TLRPC.TL_peerUser) {
                    }
                    c10 = 2;
                } else {
                    TLRPC.Chat M0 = peer.channel_id != 0 ? getMessagesController().M0(Long.valueOf(message.peer_id.channel_id)) : null;
                    if (t3.T(M0) && M0.megagroup) {
                        if (message.from_id instanceof TLRPC.TL_peerUser) {
                        }
                        c10 = 2;
                    } else {
                        c10 = 3;
                    }
                }
                e10 = t0.e();
                if (e10 == 1) {
                    if (!this.N.g) {
                        return 0;
                    }
                    n10 = p();
                } else if (e10 == 2) {
                    if (!this.O.g) {
                        return 0;
                    }
                    n10 = o();
                } else {
                    if (!this.M.g) {
                        return 0;
                    }
                    n10 = n();
                }
                int[] iArr = n10.a;
                long[] jArr = n10.b;
                int i10 = iArr[c10];
                long max = i7 == 2 ? Math.max(524288L, jArr[x(i7)]) : jArr[x(i7)];
                long p12 = ij.p1(ij.n1(message));
                return (L4 || !n10.c || p12 <= max || max <= 2097152) ? ((i7 != 1 || (p12 != 0 && p12 <= max)) && (i7 == 2 || (i10 & i7) != 0)) ? 1 : 0 : (i10 & i7) != 0 ? 2 : 0;
            }
            c10 = 0;
            e10 = t0.e();
            if (e10 == 1) {
            }
            int[] iArr2 = n10.a;
            long[] jArr2 = n10.b;
            int i102 = iArr2[c10];
            if (i7 == 2) {
            }
            long p122 = ij.p1(ij.n1(message));
            if (L4) {
            }
        }
        c10 = 1;
        e10 = t0.e();
        if (e10 == 1) {
        }
        int[] iArr22 = n10.a;
        long[] jArr22 = n10.b;
        int i1022 = iArr22[c10];
        if (i7 == 2) {
        }
        long p1222 = ij.p1(ij.n1(message));
        if (L4) {
        }
    }

    public final boolean c(int i7, long j3) {
        y5 n10;
        int e10 = t0.e();
        if (e10 == 1) {
            if (!this.N.g) {
                return false;
            }
            n10 = p();
        } else if (e10 == 2) {
            if (!this.O.g) {
                return false;
            }
            n10 = o();
        } else {
            if (!this.M.g) {
                return false;
            }
            n10 = n();
        }
        int i10 = n10.a[1];
        long j10 = n10.b[x(i7)];
        if (i7 == 1 || (j3 != 0 && j3 <= j10)) {
            return i7 == 2 || (i7 & i10) != 0;
        }
        return false;
    }

    public final boolean d(ij ijVar) {
        TL_stories.StoryItem storyItem;
        TLRPC.MessageMedia messageMedia;
        if (ijVar.D == 23) {
            int i7 = iz.a;
            return (!sc.e(1024) || (storyItem = ((TLRPC.TL_messageMediaStory) ij.m1(ijVar)).storyItem) == null || (messageMedia = storyItem.media) == null || messageMedia.document == null || !storyItem.isPublic) ? false : true;
        }
        if (ijVar.Y0 != null) {
            return true;
        }
        return !ijVar.x3() && e(ijVar) == 1;
    }

    @Override // org.telegram.messenger.ls
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        a0.h hVar = this.F;
        int i11 = qs.Z1;
        SparseArray sparseArray = this.s;
        HashMap hashMap = this.n;
        if (i7 == i11 || i7 == qs.S1) {
            String str = (String) objArr[0];
            Integer num = (Integer) objArr[1];
            this.w = true;
            ArrayList arrayList = (ArrayList) hashMap.get(str);
            if (arrayList != null) {
                int size = arrayList.size();
                for (int i12 = 0; i12 < size; i12++) {
                    WeakReference weakReference = (WeakReference) arrayList.get(i12);
                    if (weakReference.get() != null) {
                        ((x5) weakReference.get()).C(num.intValue() == 1);
                        if (num.intValue() != 1) {
                            sparseArray.remove(((x5) weakReference.get()).getObserverTag());
                        }
                    }
                }
                if (num.intValue() != 1) {
                    hashMap.remove(str);
                }
            }
            this.w = false;
            u();
            h(num.intValue(), str);
            return;
        }
        if (i7 == qs.Y1 || i7 == qs.R1) {
            this.w = true;
            String str2 = (String) objArr[0];
            HashMap hashMap2 = this.r;
            ArrayList arrayList2 = (ArrayList) hashMap2.get(str2);
            if (arrayList2 != null) {
                int size2 = arrayList2.size();
                for (int i13 = 0; i13 < size2; i13++) {
                    ((ij) arrayList2.get(i13)).x0 = true;
                }
                hashMap2.remove(str2);
            }
            ArrayList arrayList3 = (ArrayList) hashMap.get(str2);
            if (arrayList3 != null) {
                int size3 = arrayList3.size();
                for (int i14 = 0; i14 < size3; i14++) {
                    WeakReference weakReference2 = (WeakReference) arrayList3.get(i14);
                    if (weakReference2.get() != null) {
                        ((x5) weakReference2.get()).M(str2);
                        sparseArray.remove(((x5) weakReference2.get()).getObserverTag());
                    }
                }
                hashMap.remove(str2);
            }
            this.w = false;
            u();
            h(0, str2);
            return;
        }
        if (i7 == qs.X1) {
            this.w = true;
            ArrayList arrayList4 = (ArrayList) hashMap.get((String) objArr[0]);
            if (arrayList4 != null) {
                Long l10 = (Long) objArr[1];
                Long l11 = (Long) objArr[2];
                int size4 = arrayList4.size();
                for (int i15 = 0; i15 < size4; i15++) {
                    WeakReference weakReference3 = (WeakReference) arrayList4.get(i15);
                    if (weakReference3.get() != null) {
                        ((x5) weakReference3.get()).i(l10.longValue(), l11.longValue());
                    }
                }
            }
            this.w = false;
            u();
            return;
        }
        if (i7 == qs.W1) {
            this.w = true;
            String str3 = (String) objArr[0];
            ArrayList arrayList5 = (ArrayList) hashMap.get(str3);
            if (arrayList5 != null) {
                Long l12 = (Long) objArr[1];
                Long l13 = (Long) objArr[2];
                Boolean bool = (Boolean) objArr[3];
                int size5 = arrayList5.size();
                for (int i16 = 0; i16 < size5; i16++) {
                    WeakReference weakReference4 = (WeakReference) arrayList5.get(i16);
                    if (weakReference4.get() != null) {
                        x5 x5Var = (x5) weakReference4.get();
                        long longValue = l12.longValue();
                        long longValue2 = l13.longValue();
                        bool.getClass();
                        x5Var.o(longValue, longValue2);
                    }
                }
            }
            this.w = false;
            u();
            try {
                ArrayList arrayList6 = (ArrayList) getSendMessagesHelper().a.get(str3);
                if (arrayList6 != null) {
                    for (int i17 = 0; i17 < arrayList6.size(); i17++) {
                        sy syVar = (sy) arrayList6.get(i17);
                        if (syVar.n == null) {
                            long j3 = syVar.a;
                            Long l14 = (Long) hVar.f(j3);
                            if (syVar.e == 4) {
                                if (l14 != null && l14.longValue() + 4000 >= System.currentTimeMillis()) {
                                }
                                ij ijVar = (ij) syVar.E.get(str3 + "_i");
                                if (ijVar != null && ij.L4(ijVar.k)) {
                                    getMessagesController().C4(5, 0, j3, 0, null);
                                } else if (ijVar == null || ijVar.F0() == null) {
                                    getMessagesController().C4(4, 0, j3, 0, null);
                                } else {
                                    getMessagesController().C4(3, 0, j3, 0, null);
                                }
                                hVar.k(Long.valueOf(System.currentTimeMillis()), j3);
                            } else {
                                syVar.m.F0();
                                if (l14 == null || l14.longValue() + 4000 < System.currentTimeMillis()) {
                                    if (syVar.m.h4()) {
                                        getMessagesController().C4(8, 0, j3, 0, null);
                                    } else if (ij.L4(syVar.m.k)) {
                                        getMessagesController().C4(5, 0, j3, 0, null);
                                    } else if (ij.R4(syVar.m.k)) {
                                        getMessagesController().C4(9, 0, j3, 0, null);
                                    } else if (syVar.m.F0() != null) {
                                        getMessagesController().C4(3, 0, j3, 0, null);
                                    } else if (syVar.g != null) {
                                        getMessagesController().C4(4, 0, j3, 0, null);
                                    }
                                    hVar.k(Long.valueOf(System.currentTimeMillis()), j3);
                                }
                            }
                        }
                    }
                }
            } catch (Exception e10) {
                a8.g(e10, true);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0078, code lost:
    
        if (getContactsController().f0.containsKey(java.lang.Long.valueOf(r6.user_id)) != false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x009c, code lost:
    
        if (getContactsController().f0.containsKey(java.lang.Long.valueOf(r1.from_id.user_id)) != false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x00db, code lost:
    
        if (getContactsController().f0.containsKey(java.lang.Long.valueOf(r1.from_id.user_id)) != false) goto L44;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00f1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int e(ij ijVar) {
        TLRPC.Message message;
        int i7;
        char c10;
        int e10;
        y5 n10;
        s51 s51Var;
        long p12;
        if (ijVar == null || (message = ijVar.k) == null) {
            return 0;
        }
        if (message.media instanceof TLRPC.TL_messageMediaStory) {
            return f() ? 2 : 0;
        }
        boolean L4 = ij.L4(message);
        if (L4 || ij.t3(message) || ij.j4(message) || (ij.n1(message) instanceof TLRPC.TL_messageMediaGame)) {
            i7 = 4;
        } else if (ij.R4(message)) {
            i7 = 2;
        } else if (ij.S3(message) || ij.w4(message) || ij.L2(message)) {
            i7 = 1;
        } else {
            if (ij.G0(message) == null) {
                return 0;
            }
            i7 = 8;
        }
        TLRPC.Peer peer = message.peer_id;
        if (peer != null) {
            if (peer.user_id == 0) {
                if (peer.chat_id != 0) {
                    if (message.from_id instanceof TLRPC.TL_peerUser) {
                    }
                    c10 = 2;
                } else {
                    TLRPC.Chat M0 = peer.channel_id != 0 ? getMessagesController().M0(Long.valueOf(message.peer_id.channel_id)) : null;
                    if (t3.T(M0) && M0.megagroup) {
                        if (message.from_id instanceof TLRPC.TL_peerUser) {
                        }
                        c10 = 2;
                    } else {
                        c10 = 3;
                    }
                }
                e10 = t0.e();
                if (e10 == 1) {
                    if (!this.N.g) {
                        return 0;
                    }
                    n10 = p();
                } else if (e10 == 2) {
                    if (!this.O.g) {
                        return 0;
                    }
                    n10 = o();
                } else {
                    if (!this.M.g) {
                        return 0;
                    }
                    n10 = n();
                }
                int[] iArr = n10.a;
                long[] jArr = n10.b;
                int i10 = iArr[c10];
                long max = i7 == 2 ? Math.max(524288L, jArr[x(i7)]) : jArr[x(i7)];
                s51Var = ijVar.e3;
                if (s51Var != null) {
                    p12 = s51Var.g.size;
                } else {
                    s51 s51Var2 = ijVar.f3;
                    p12 = s51Var2 != null ? s51Var2.g.size : ij.p1(ij.n1(message));
                }
                return (L4 || !n10.c || p12 <= max || max <= 2097152) ? ((i7 != 1 || (p12 != 0 && p12 <= max)) && (i7 == 2 || (i10 & i7) != 0)) ? 1 : 0 : (i10 & i7) != 0 ? 2 : 0;
            }
            c10 = 0;
            e10 = t0.e();
            if (e10 == 1) {
            }
            int[] iArr2 = n10.a;
            long[] jArr2 = n10.b;
            int i102 = iArr2[c10];
            if (i7 == 2) {
            }
            s51Var = ijVar.e3;
            if (s51Var != null) {
            }
            if (L4) {
            }
        }
        c10 = 1;
        e10 = t0.e();
        if (e10 == 1) {
        }
        int[] iArr22 = n10.a;
        long[] jArr22 = n10.b;
        int i1022 = iArr22[c10];
        if (i7 == 2) {
        }
        s51Var = ijVar.e3;
        if (s51Var != null) {
        }
        if (L4) {
        }
    }

    public final boolean f() {
        y5 n10;
        int e10 = t0.e();
        if (e10 == 1) {
            if (!this.N.g) {
                return false;
            }
            n10 = p();
        } else if (e10 == 2) {
            if (!this.O.g) {
                return false;
            }
            n10 = o();
        } else {
            if (!this.M.g) {
                return false;
            }
            n10 = n();
        }
        return n10.e;
    }

    public final void g() {
        int i7;
        int m10 = m();
        if (m10 == this.a) {
            return;
        }
        this.a = m10;
        int i10 = m10 & 1;
        ArrayList arrayList = this.b;
        if (i10 == 0) {
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                a6 a6Var = (a6) arrayList.get(i11);
                TLObject tLObject = a6Var.a;
                if (tLObject instanceof TLRPC.Photo) {
                    TLRPC.PhotoSize w10 = w7.w(((TLRPC.Photo) tLObject).sizes, g0.Z0(false), false, null, false);
                    w7 fileLoader = getFileLoader();
                    fileLoader.getClass();
                    fileLoader.e(null, null, null, w10.location, null, null);
                } else if (tLObject instanceof TLRPC.Document) {
                    getFileLoader().f((TLRPC.Document) a6Var.a);
                }
            }
            arrayList.clear();
        } else if (arrayList.isEmpty()) {
            t(1);
        }
        int i12 = m10 & 2;
        ArrayList arrayList2 = this.c;
        if (i12 == 0) {
            for (int i13 = 0; i13 < arrayList2.size(); i13++) {
                getFileLoader().f((TLRPC.Document) ((a6) arrayList2.get(i13)).a);
            }
            arrayList2.clear();
        } else if (arrayList2.isEmpty()) {
            t(2);
        }
        int i14 = m10 & 8;
        ArrayList arrayList3 = this.d;
        if (i14 == 0) {
            for (int i15 = 0; i15 < arrayList3.size(); i15++) {
                getFileLoader().f((TLRPC.Document) ((a6) arrayList3.get(i15)).a);
            }
            arrayList3.clear();
        } else if (arrayList3.isEmpty()) {
            t(8);
        }
        int i16 = m10 & 4;
        ArrayList arrayList4 = this.e;
        if (i16 == 0) {
            for (int i17 = 0; i17 < arrayList4.size(); i17++) {
                getFileLoader().f((TLRPC.Document) ((a6) arrayList4.get(i17)).a);
            }
            arrayList4.clear();
        } else if (arrayList4.isEmpty()) {
            t(4);
        }
        if (this.M.g || this.O.g || this.N.g) {
            i7 = 0;
            for (int i18 = 0; i18 < 4; i18++) {
                if ((n().a[i18] & 1) != 0 || (p().a[i18] & 1) != 0 || (o().a[i18] & 1) != 0) {
                    i7 |= 1;
                }
                if ((n().a[i18] & 2) != 0 || (p().a[i18] & 2) != 0 || (o().a[i18] & 2) != 0) {
                    i7 |= 2;
                }
                if ((n().a[i18] & 4) != 0 || (p().a[i18] & 4) != 0 || (o().a[i18] & 4) != 0) {
                    i7 |= 4;
                }
                if ((n().a[i18] & 8) != 0 || (p().a[i18] & 8) != 0 || (o().a[i18] & 8) != 0) {
                    i7 |= 8;
                }
            }
        } else {
            i7 = 0;
        }
        if (i7 == 0) {
            getMessagesStorage().r(0);
            return;
        }
        if ((i7 & 1) == 0) {
            getMessagesStorage().r(1);
        }
        if ((i7 & 2) == 0) {
            getMessagesStorage().r(2);
        }
        if ((i7 & 4) == 0) {
            getMessagesStorage().r(4);
        }
        if ((i7 & 8) == 0) {
            getMessagesStorage().r(8);
        }
    }

    public final void h(int i7, String str) {
        HashMap hashMap = this.f;
        a6 a6Var = (a6) hashMap.get(str);
        if (a6Var != null) {
            hashMap.remove(str);
            this.h.remove(new Pair(Long.valueOf(a6Var.c), Integer.valueOf(a6Var.b)));
            if (i7 == 0 || i7 == 2) {
                yr messagesStorage = getMessagesStorage();
                long j3 = a6Var.c;
                messagesStorage.a.c(new aq(messagesStorage, a6Var.b, j3, 6));
            }
            int i10 = a6Var.b;
            if (i10 == 1) {
                ArrayList arrayList = this.b;
                arrayList.remove(a6Var);
                if (arrayList.isEmpty()) {
                    t(1);
                    return;
                }
                return;
            }
            if (i10 == 2) {
                ArrayList arrayList2 = this.c;
                arrayList2.remove(a6Var);
                if (arrayList2.isEmpty()) {
                    t(2);
                    return;
                }
                return;
            }
            if (i10 == 4) {
                ArrayList arrayList3 = this.e;
                arrayList3.remove(a6Var);
                if (arrayList3.isEmpty()) {
                    t(4);
                    return;
                }
                return;
            }
            if (i10 == 8) {
                ArrayList arrayList4 = this.d;
                arrayList4.remove(a6Var);
                if (arrayList4.isEmpty()) {
                    t(8);
                }
            }
        }
    }

    public final void i(int i7, long j3) {
        SparseArray sparseArray = this.I;
        ij ijVar = (ij) sparseArray.get(i7);
        if (ijVar == null || ij.B0(ijVar.k) != j3) {
            return;
        }
        sparseArray.remove(i7);
        if (sparseArray.size() == 0) {
            getNotificationCenter().k(qs.b5, new Object[0]);
        }
    }

    public final void j(ArrayList arrayList) {
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            int i10 = 0;
            while (true) {
                ArrayList arrayList2 = this.H;
                if (i10 >= arrayList2.size()) {
                    int i11 = 0;
                    while (true) {
                        ArrayList arrayList3 = this.G;
                        if (i11 >= arrayList3.size()) {
                            break;
                        }
                        if (((ij) arrayList.get(i7)).e1() == ((ij) arrayList3.get(i11)).e1() && ij.B0(((ij) arrayList3.get(i11)).k) == ij.B0(((ij) arrayList.get(i7)).k)) {
                            arrayList3.remove(i11);
                            break;
                        }
                        i11++;
                    }
                } else {
                    if (((ij) arrayList.get(i7)).e1() == ((ij) arrayList2.get(i10)).e1() && ij.B0(((ij) arrayList2.get(i10)).k) == ij.B0(((ij) arrayList.get(i7)).k)) {
                        arrayList2.remove(i10);
                        break;
                    }
                    i10++;
                }
            }
            ((ij) arrayList.get(i7)).P = false;
            w7.G(this.currentAccount).W(((ij) arrayList.get(i7)).F0(), arrayList.get(i7), 0, 0);
            w7.G(this.currentAccount).f(((ij) arrayList.get(i7)).F0());
        }
        getNotificationCenter().k(qs.b5, new Object[0]);
        getMessagesStorage().a.c(new b4(3, this, arrayList));
    }

    public final int k() {
        int i7 = this.D;
        this.D = i7 + 1;
        return i7;
    }

    public final int l() {
        int[] iArr;
        int e10 = t0.e();
        if (e10 == 1) {
            if (!this.N.g) {
                return 0;
            }
            iArr = p().a;
        } else if (e10 == 2) {
            if (!this.O.g) {
                return 0;
            }
            iArr = o().a;
        } else {
            if (!this.M.g) {
                return 0;
            }
            iArr = n().a;
        }
        int i7 = 0;
        for (int i10 = 0; i10 < iArr.length; i10++) {
            int i11 = iArr[i10];
            int i12 = (i11 & 1) != 0 ? 1 : 0;
            if ((i11 & 2) != 0) {
                i12 |= 2;
            }
            if ((i11 & 4) != 0) {
                i12 |= 4;
            }
            if ((i11 & 8) != 0) {
                i12 |= 8;
            }
            i7 |= i12 << (i10 * 8);
        }
        return i7;
    }

    public final int m() {
        int e10 = t0.e();
        int i7 = 0;
        if (e10 == 1) {
            if (!this.N.g) {
                return 0;
            }
            int i10 = 0;
            while (i7 < 4) {
                i10 |= p().a[i7];
                i7++;
            }
            return i10;
        }
        if (e10 == 2) {
            if (!this.O.g) {
                return 0;
            }
            int i11 = 0;
            while (i7 < 4) {
                i11 |= o().a[i7];
                i7++;
            }
            return i11;
        }
        if (!this.M.g) {
            return 0;
        }
        int i12 = 0;
        while (i7 < 4) {
            i12 |= n().a[i7];
            i7++;
        }
        return i12;
    }

    public final y5 n() {
        int i7 = this.P;
        return i7 == 0 ? this.J : i7 == 1 ? this.K : i7 == 2 ? this.L : this.M;
    }

    public final y5 o() {
        int i7 = this.R;
        return i7 == 0 ? this.J : i7 == 1 ? this.K : i7 == 2 ? this.L : this.O;
    }

    public final y5 p() {
        int i7 = this.Q;
        return i7 == 0 ? this.J : i7 == 1 ? this.K : i7 == 2 ? this.L : this.N;
    }

    public final void s(boolean z9) {
        if (this.E) {
            return;
        }
        if (z9 || Math.abs(System.currentTimeMillis() - getUserConfig().a0) >= 86400000) {
            this.E = true;
            getConnectionsManager().sendRequest(new TL_account.getAutoDownloadSettings(), new s1(this, 1));
        }
    }

    public final void t(int i7) {
        int m10 = m();
        if ((m10 & 1) != 0 && (i7 & 1) != 0 && this.b.isEmpty()) {
            yr messagesStorage = getMessagesStorage();
            messagesStorage.a.c(new tp(messagesStorage, 1, 6));
        }
        if ((m10 & 2) != 0 && (i7 & 2) != 0 && this.c.isEmpty()) {
            yr messagesStorage2 = getMessagesStorage();
            messagesStorage2.a.c(new tp(messagesStorage2, 2, 6));
        }
        if ((m10 & 4) != 0 && (i7 & 4) != 0 && this.e.isEmpty()) {
            yr messagesStorage3 = getMessagesStorage();
            messagesStorage3.a.c(new tp(messagesStorage3, 4, 6));
        }
        int i10 = 8;
        if ((m10 & 8) == 0 || (i7 & 8) == 0 || !this.d.isEmpty()) {
            return;
        }
        yr messagesStorage4 = getMessagesStorage();
        messagesStorage4.a.c(new tp(messagesStorage4, i10, 6));
    }

    public final void u() {
        HashMap hashMap = this.x;
        for (Map.Entry entry : hashMap.entrySet()) {
            a((String) entry.getKey(), null, (x5) entry.getValue());
        }
        hashMap.clear();
        ArrayList arrayList = this.y;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            v((x5) obj);
        }
        arrayList.clear();
    }

    public final void v(x5 x5Var) {
        if (this.w) {
            this.y.add(x5Var);
            return;
        }
        int observerTag = x5Var.getObserverTag();
        SparseArray sparseArray = this.s;
        String str = (String) sparseArray.get(observerTag);
        if (str != null) {
            HashMap hashMap = this.n;
            ArrayList arrayList = (ArrayList) hashMap.get(str);
            if (arrayList != null) {
                int i7 = 0;
                while (i7 < arrayList.size()) {
                    WeakReference weakReference = (WeakReference) arrayList.get(i7);
                    if (weakReference.get() == null || weakReference.get() == x5Var) {
                        arrayList.remove(i7);
                        i7--;
                    }
                    i7++;
                }
                if (arrayList.isEmpty()) {
                    hashMap.remove(str);
                }
            }
            sparseArray.remove(x5Var.getObserverTag());
        }
    }

    public final void w(int i7) {
        y5 o4;
        boolean z9;
        TL_account.saveAutoDownloadSettings saveautodownloadsettings = new TL_account.saveAutoDownloadSettings();
        if (i7 == 0) {
            o4 = n();
            z9 = this.M.g;
        } else if (i7 == 1) {
            o4 = p();
            z9 = this.N.g;
        } else {
            o4 = o();
            z9 = this.O.g;
        }
        TLRPC.TL_autoDownloadSettings tL_autoDownloadSettings = new TLRPC.TL_autoDownloadSettings();
        saveautodownloadsettings.settings = tL_autoDownloadSettings;
        boolean z10 = o4.d;
        long[] jArr = o4.b;
        tL_autoDownloadSettings.audio_preload_next = z10;
        tL_autoDownloadSettings.video_preload_large = o4.c;
        tL_autoDownloadSettings.phonecalls_less_data = o4.f;
        tL_autoDownloadSettings.video_upload_maxbitrate = o4.h;
        tL_autoDownloadSettings.disabled = !z9;
        int i10 = 0;
        boolean z11 = false;
        boolean z12 = false;
        boolean z13 = false;
        while (true) {
            int[] iArr = o4.a;
            if (i10 >= iArr.length) {
                break;
            }
            int i11 = iArr[i10];
            if ((i11 & 1) != 0) {
                z11 = true;
            }
            if ((i11 & 4) != 0) {
                z12 = true;
            }
            if ((i11 & 8) != 0) {
                z13 = true;
            }
            if (z11 && z12 && z13) {
                break;
            } else {
                i10++;
            }
        }
        TLRPC.TL_autoDownloadSettings tL_autoDownloadSettings2 = saveautodownloadsettings.settings;
        tL_autoDownloadSettings2.photo_size_max = z11 ? (int) jArr[0] : 0;
        tL_autoDownloadSettings2.video_size_max = z12 ? jArr[1] : 0L;
        tL_autoDownloadSettings2.file_size_max = z13 ? jArr[2] : 0L;
        getConnectionsManager().sendRequest(saveautodownloadsettings, new di.v5(9));
    }

    public final void y() {
        ArrayList arrayList = this.G;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (getFileLoader().S(((ij) arrayList.get(size)).S0())) {
                getFileLoader().W(((ij) arrayList.get(size)).F0(), arrayList.get(size), 2, 0);
            }
        }
    }
}
