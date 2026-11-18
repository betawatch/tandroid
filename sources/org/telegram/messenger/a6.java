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
import org.telegram.ui.Components.e61;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
public final class a6 extends c1 implements fs {
    public static volatile a6[] U = new a6[4];
    public int E;
    public boolean F;
    public final a0.h G;
    public final ArrayList H;
    public final ArrayList I;
    public final SparseArray J;
    public final z5 K;
    public final z5 L;
    public final z5 M;
    public final z5 N;
    public final z5 O;
    public final z5 P;
    public int Q;
    public int R;
    public int S;
    public final j6.o T;
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

    public a6(int i7) {
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
        this.E = 0;
        this.G = new a0.h();
        this.H = new ArrayList();
        this.I = new ArrayList();
        this.J = new SparseArray();
        this.T = new j6.o(this, 8);
        SharedPreferences sharedPreferences = mp.u1(this.currentAccount).h7;
        z5 z5Var = new z5(sharedPreferences.getString("preset0", "1_1_1_1_1048576_512000_512000_524288_0_0_1_1_50_0"), "1_1_1_1_1048576_512000_512000_524288_0_0_1_1_50_0");
        this.K = z5Var;
        z5Var.e = false;
        this.L = new z5(sharedPreferences.getString("preset1", "13_13_13_13_1048576_10485760_1048576_524288_1_1_1_0_100_1"), "13_13_13_13_1048576_10485760_1048576_524288_1_1_1_0_100_1");
        this.M = new z5(sharedPreferences.getString("preset2", "13_13_13_13_1048576_15728640_3145728_524288_1_1_1_0_100_1"), "13_13_13_13_1048576_15728640_3145728_524288_1_1_1_0_100_1");
        boolean contains = sharedPreferences.contains("newConfig");
        if (contains || !getUserConfig().p()) {
            this.N = new z5(sharedPreferences.getString("mobilePreset", "13_13_13_13_1048576_10485760_1048576_524288_1_1_1_0_100_1"), "13_13_13_13_1048576_10485760_1048576_524288_1_1_1_0_100_1");
            this.O = new z5(sharedPreferences.getString("wifiPreset", "13_13_13_13_1048576_15728640_3145728_524288_1_1_1_0_100_1"), "13_13_13_13_1048576_15728640_3145728_524288_1_1_1_0_100_1");
            this.P = new z5(sharedPreferences.getString("roamingPreset", "1_1_1_1_1048576_512000_512000_524288_0_0_1_1_50_0"), "1_1_1_1_1048576_512000_512000_524288_0_0_1_1_50_0");
            this.Q = sharedPreferences.getInt("currentMobilePreset", 3);
            this.R = sharedPreferences.getInt("currentWifiPreset", 3);
            this.S = sharedPreferences.getInt("currentRoamingPreset", 3);
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
            jArr[2] = sharedPreferences.getLong("mobileMaxDownloadSize2", this.L.b[1]);
            jArr[3] = sharedPreferences.getLong("mobileMaxDownloadSize3", this.L.b[2]);
            jArr2[2] = sharedPreferences.getLong("wifiMaxDownloadSize2", this.M.b[1]);
            jArr2[3] = sharedPreferences.getLong("wifiMaxDownloadSize3", this.M.b[2]);
            jArr3[2] = sharedPreferences.getLong("roamingMaxDownloadSize2", this.K.b[1]);
            jArr3[3] = sharedPreferences.getLong("roamingMaxDownloadSize3", this.K.b[2]);
            boolean z10 = sharedPreferences.getBoolean("globalAutodownloadEnabled", true);
            z5 z5Var2 = new z5(iArr, this.L.b[0], jArr[2], jArr[3], true, true, z10, false, 100, false);
            this.N = z5Var2;
            z5 z5Var3 = new z5(iArr2, this.M.b[0], jArr2[2], jArr2[3], true, true, z10, false, 100, true);
            this.O = z5Var3;
            z5 z5Var4 = new z5(iArr3, this.K.b[0], jArr3[2], jArr3[3], false, false, z10, true, 50, true);
            this.P = z5Var4;
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.putBoolean("newConfig", true);
            edit.putString("mobilePreset", z5Var2.toString());
            edit.putString("wifiPreset", z5Var3.toString());
            edit.putString("roamingPreset", z5Var4.toString());
            this.Q = 3;
            edit.putInt("currentMobilePreset", 3);
            this.R = 3;
            edit.putInt("currentWifiPreset", 3);
            this.S = 3;
            edit.putInt("currentRoamingPreset", 3);
            edit.commit();
        }
        g0.g3(new x5(this, 1));
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

    public static a6 q(int i7) {
        a6 a6Var;
        a6 a6Var2 = U[i7];
        if (a6Var2 != null) {
            return a6Var2;
        }
        synchronized (a6.class) {
            try {
                a6Var = U[i7];
                if (a6Var == null) {
                    a6[] a6VarArr = U;
                    a6 a6Var3 = new a6(i7);
                    a6VarArr[i7] = a6Var3;
                    a6Var = a6Var3;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return a6Var;
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

    public final void a(String str, fj fjVar, y5 y5Var) {
        if (this.w) {
            this.x.put(str, y5Var);
            return;
        }
        v(y5Var);
        HashMap hashMap = this.n;
        ArrayList arrayList = (ArrayList) hashMap.get(str);
        if (arrayList == null) {
            arrayList = new ArrayList();
            hashMap.put(str, arrayList);
        }
        arrayList.add(new WeakReference(y5Var));
        if (fjVar != null) {
            HashMap hashMap2 = this.r;
            ArrayList arrayList2 = (ArrayList) hashMap2.get(str);
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                hashMap2.put(str, arrayList2);
            }
            arrayList2.add(fjVar);
        }
        this.s.put(y5Var.getObserverTag(), str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0070, code lost:
    
        if (getContactsController().g0.containsKey(java.lang.Long.valueOf(r7.user_id)) != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0094, code lost:
    
        if (getContactsController().g0.containsKey(java.lang.Long.valueOf(r18.from_id.user_id)) != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x00d3, code lost:
    
        if (getContactsController().g0.containsKey(java.lang.Long.valueOf(r18.from_id.user_id)) != false) goto L38;
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
        z5 n10;
        if (message == null || (message.media instanceof TLRPC.TL_messageMediaStory)) {
            return f() ? 2 : 0;
        }
        boolean L4 = fj.L4(message);
        if (L4 || fj.t3(message) || fj.j4(message) || (fj.n1(message) instanceof TLRPC.TL_messageMediaGame)) {
            i7 = 4;
        } else if (fj.R4(message)) {
            i7 = 2;
        } else if (fj.S3(message) || fj.w4(message) || fj.L2(message)) {
            i7 = 1;
        } else {
            if (fj.G0(message) == null) {
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
                    TLRPC.Chat O0 = peer.channel_id != 0 ? getMessagesController().O0(Long.valueOf(message.peer_id.channel_id)) : null;
                    if (v3.T(O0) && O0.megagroup) {
                        if (message.from_id instanceof TLRPC.TL_peerUser) {
                        }
                        c10 = 2;
                    } else {
                        c10 = 3;
                    }
                }
                e10 = t0.e();
                if (e10 == 1) {
                    if (!this.O.g) {
                        return 0;
                    }
                    n10 = p();
                } else if (e10 == 2) {
                    if (!this.P.g) {
                        return 0;
                    }
                    n10 = o();
                } else {
                    if (!this.N.g) {
                        return 0;
                    }
                    n10 = n();
                }
                int[] iArr = n10.a;
                long[] jArr = n10.b;
                int i10 = iArr[c10];
                long max = i7 == 2 ? Math.max(524288L, jArr[x(i7)]) : jArr[x(i7)];
                long p12 = fj.p1(fj.n1(message));
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
            long p122 = fj.p1(fj.n1(message));
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
        long p1222 = fj.p1(fj.n1(message));
        if (L4) {
        }
    }

    public final boolean c(int i7, long j3) {
        z5 n10;
        int e10 = t0.e();
        if (e10 == 1) {
            if (!this.O.g) {
                return false;
            }
            n10 = p();
        } else if (e10 == 2) {
            if (!this.P.g) {
                return false;
            }
            n10 = o();
        } else {
            if (!this.N.g) {
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

    public final boolean d(fj fjVar) {
        TL_stories.StoryItem storyItem;
        TLRPC.MessageMedia messageMedia;
        if (fjVar.D == 23) {
            int i7 = bz.a;
            return (!pc.e(1024) || (storyItem = ((TLRPC.TL_messageMediaStory) fj.m1(fjVar)).storyItem) == null || (messageMedia = storyItem.media) == null || messageMedia.document == null || !storyItem.isPublic) ? false : true;
        }
        if (fjVar.a1 != null) {
            return true;
        }
        return !fjVar.x3() && e(fjVar) == 1;
    }

    @Override // org.telegram.messenger.fs
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        a0.h hVar = this.G;
        int i11 = ks.Z1;
        SparseArray sparseArray = this.s;
        HashMap hashMap = this.n;
        if (i7 == i11 || i7 == ks.S1) {
            String str = (String) objArr[0];
            Integer num = (Integer) objArr[1];
            this.w = true;
            ArrayList arrayList = (ArrayList) hashMap.get(str);
            if (arrayList != null) {
                int size = arrayList.size();
                for (int i12 = 0; i12 < size; i12++) {
                    WeakReference weakReference = (WeakReference) arrayList.get(i12);
                    if (weakReference.get() != null) {
                        ((y5) weakReference.get()).C(num.intValue() == 1);
                        if (num.intValue() != 1) {
                            sparseArray.remove(((y5) weakReference.get()).getObserverTag());
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
        if (i7 == ks.Y1 || i7 == ks.R1) {
            this.w = true;
            String str2 = (String) objArr[0];
            HashMap hashMap2 = this.r;
            ArrayList arrayList2 = (ArrayList) hashMap2.get(str2);
            if (arrayList2 != null) {
                int size2 = arrayList2.size();
                for (int i13 = 0; i13 < size2; i13++) {
                    ((fj) arrayList2.get(i13)).z0 = true;
                }
                hashMap2.remove(str2);
            }
            ArrayList arrayList3 = (ArrayList) hashMap.get(str2);
            if (arrayList3 != null) {
                int size3 = arrayList3.size();
                for (int i14 = 0; i14 < size3; i14++) {
                    WeakReference weakReference2 = (WeakReference) arrayList3.get(i14);
                    if (weakReference2.get() != null) {
                        ((y5) weakReference2.get()).N(str2);
                        sparseArray.remove(((y5) weakReference2.get()).getObserverTag());
                    }
                }
                hashMap.remove(str2);
            }
            this.w = false;
            u();
            h(0, str2);
            return;
        }
        if (i7 == ks.X1) {
            this.w = true;
            ArrayList arrayList4 = (ArrayList) hashMap.get((String) objArr[0]);
            if (arrayList4 != null) {
                Long l10 = (Long) objArr[1];
                Long l11 = (Long) objArr[2];
                int size4 = arrayList4.size();
                for (int i15 = 0; i15 < size4; i15++) {
                    WeakReference weakReference3 = (WeakReference) arrayList4.get(i15);
                    if (weakReference3.get() != null) {
                        ((y5) weakReference3.get()).i(l10.longValue(), l11.longValue());
                    }
                }
            }
            this.w = false;
            u();
            return;
        }
        if (i7 == ks.W1) {
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
                        y5 y5Var = (y5) weakReference4.get();
                        long longValue = l12.longValue();
                        long longValue2 = l13.longValue();
                        bool.getClass();
                        y5Var.o(longValue, longValue2);
                    }
                }
            }
            this.w = false;
            u();
            try {
                ArrayList arrayList6 = (ArrayList) getSendMessagesHelper().a.get(str3);
                if (arrayList6 != null) {
                    for (int i17 = 0; i17 < arrayList6.size(); i17++) {
                        ly lyVar = (ly) arrayList6.get(i17);
                        if (lyVar.n == null) {
                            long j3 = lyVar.a;
                            Long l14 = (Long) hVar.f(j3);
                            if (lyVar.e == 4) {
                                if (l14 != null && l14.longValue() + 4000 >= System.currentTimeMillis()) {
                                }
                                fj fjVar = (fj) lyVar.E.get(str3 + "_i");
                                if (fjVar != null && fj.L4(fjVar.k)) {
                                    getMessagesController().N4(5, 0, j3, 0, null);
                                } else if (fjVar == null || fjVar.F0() == null) {
                                    getMessagesController().N4(4, 0, j3, 0, null);
                                } else {
                                    getMessagesController().N4(3, 0, j3, 0, null);
                                }
                                hVar.k(Long.valueOf(System.currentTimeMillis()), j3);
                            } else {
                                lyVar.m.F0();
                                if (l14 == null || l14.longValue() + 4000 < System.currentTimeMillis()) {
                                    if (lyVar.m.h4()) {
                                        getMessagesController().N4(8, 0, j3, 0, null);
                                    } else if (fj.L4(lyVar.m.k)) {
                                        getMessagesController().N4(5, 0, j3, 0, null);
                                    } else if (fj.R4(lyVar.m.k)) {
                                        getMessagesController().N4(9, 0, j3, 0, null);
                                    } else if (lyVar.m.F0() != null) {
                                        getMessagesController().N4(3, 0, j3, 0, null);
                                    } else if (lyVar.g != null) {
                                        getMessagesController().N4(4, 0, j3, 0, null);
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
    
        if (getContactsController().g0.containsKey(java.lang.Long.valueOf(r6.user_id)) != false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x009c, code lost:
    
        if (getContactsController().g0.containsKey(java.lang.Long.valueOf(r1.from_id.user_id)) != false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x00db, code lost:
    
        if (getContactsController().g0.containsKey(java.lang.Long.valueOf(r1.from_id.user_id)) != false) goto L44;
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
    public final int e(fj fjVar) {
        TLRPC.Message message;
        int i7;
        char c10;
        int e10;
        z5 n10;
        e61 e61Var;
        long p12;
        if (fjVar == null || (message = fjVar.k) == null) {
            return 0;
        }
        if (message.media instanceof TLRPC.TL_messageMediaStory) {
            return f() ? 2 : 0;
        }
        boolean L4 = fj.L4(message);
        if (L4 || fj.t3(message) || fj.j4(message) || (fj.n1(message) instanceof TLRPC.TL_messageMediaGame)) {
            i7 = 4;
        } else if (fj.R4(message)) {
            i7 = 2;
        } else if (fj.S3(message) || fj.w4(message) || fj.L2(message)) {
            i7 = 1;
        } else {
            if (fj.G0(message) == null) {
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
                    TLRPC.Chat O0 = peer.channel_id != 0 ? getMessagesController().O0(Long.valueOf(message.peer_id.channel_id)) : null;
                    if (v3.T(O0) && O0.megagroup) {
                        if (message.from_id instanceof TLRPC.TL_peerUser) {
                        }
                        c10 = 2;
                    } else {
                        c10 = 3;
                    }
                }
                e10 = t0.e();
                if (e10 == 1) {
                    if (!this.O.g) {
                        return 0;
                    }
                    n10 = p();
                } else if (e10 == 2) {
                    if (!this.P.g) {
                        return 0;
                    }
                    n10 = o();
                } else {
                    if (!this.N.g) {
                        return 0;
                    }
                    n10 = n();
                }
                int[] iArr = n10.a;
                long[] jArr = n10.b;
                int i10 = iArr[c10];
                long max = i7 == 2 ? Math.max(524288L, jArr[x(i7)]) : jArr[x(i7)];
                e61Var = fjVar.g3;
                if (e61Var != null) {
                    p12 = e61Var.g.size;
                } else {
                    e61 e61Var2 = fjVar.h3;
                    p12 = e61Var2 != null ? e61Var2.g.size : fj.p1(fj.n1(message));
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
            e61Var = fjVar.g3;
            if (e61Var != null) {
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
        e61Var = fjVar.g3;
        if (e61Var != null) {
        }
        if (L4) {
        }
    }

    public final boolean f() {
        z5 n10;
        int e10 = t0.e();
        if (e10 == 1) {
            if (!this.O.g) {
                return false;
            }
            n10 = p();
        } else if (e10 == 2) {
            if (!this.P.g) {
                return false;
            }
            n10 = o();
        } else {
            if (!this.N.g) {
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
                b6 b6Var = (b6) arrayList.get(i11);
                TLObject tLObject = b6Var.a;
                if (tLObject instanceof TLRPC.Photo) {
                    TLRPC.PhotoSize w10 = w7.w(((TLRPC.Photo) tLObject).sizes, g0.Z0(false), false, null, false);
                    w7 fileLoader = getFileLoader();
                    fileLoader.getClass();
                    fileLoader.e(null, null, null, w10.location, null, null);
                } else if (tLObject instanceof TLRPC.Document) {
                    getFileLoader().f((TLRPC.Document) b6Var.a);
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
                getFileLoader().f((TLRPC.Document) ((b6) arrayList2.get(i13)).a);
            }
            arrayList2.clear();
        } else if (arrayList2.isEmpty()) {
            t(2);
        }
        int i14 = m10 & 8;
        ArrayList arrayList3 = this.d;
        if (i14 == 0) {
            for (int i15 = 0; i15 < arrayList3.size(); i15++) {
                getFileLoader().f((TLRPC.Document) ((b6) arrayList3.get(i15)).a);
            }
            arrayList3.clear();
        } else if (arrayList3.isEmpty()) {
            t(8);
        }
        int i16 = m10 & 4;
        ArrayList arrayList4 = this.e;
        if (i16 == 0) {
            for (int i17 = 0; i17 < arrayList4.size(); i17++) {
                getFileLoader().f((TLRPC.Document) ((b6) arrayList4.get(i17)).a);
            }
            arrayList4.clear();
        } else if (arrayList4.isEmpty()) {
            t(4);
        }
        if (this.N.g || this.P.g || this.O.g) {
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
        b6 b6Var = (b6) hashMap.get(str);
        if (b6Var != null) {
            hashMap.remove(str);
            this.h.remove(new Pair(Long.valueOf(b6Var.c), Integer.valueOf(b6Var.b)));
            if (i7 == 0 || i7 == 2) {
                tr messagesStorage = getMessagesStorage();
                long j3 = b6Var.c;
                messagesStorage.a.c(new vp(messagesStorage, b6Var.b, j3, 6));
            }
            int i10 = b6Var.b;
            if (i10 == 1) {
                ArrayList arrayList = this.b;
                arrayList.remove(b6Var);
                if (arrayList.isEmpty()) {
                    t(1);
                    return;
                }
                return;
            }
            if (i10 == 2) {
                ArrayList arrayList2 = this.c;
                arrayList2.remove(b6Var);
                if (arrayList2.isEmpty()) {
                    t(2);
                    return;
                }
                return;
            }
            if (i10 == 4) {
                ArrayList arrayList3 = this.e;
                arrayList3.remove(b6Var);
                if (arrayList3.isEmpty()) {
                    t(4);
                    return;
                }
                return;
            }
            if (i10 == 8) {
                ArrayList arrayList4 = this.d;
                arrayList4.remove(b6Var);
                if (arrayList4.isEmpty()) {
                    t(8);
                }
            }
        }
    }

    public final void i(int i7, long j3) {
        SparseArray sparseArray = this.J;
        fj fjVar = (fj) sparseArray.get(i7);
        if (fjVar == null || fj.B0(fjVar.k) != j3) {
            return;
        }
        sparseArray.remove(i7);
        if (sparseArray.size() == 0) {
            getNotificationCenter().k(ks.d5, new Object[0]);
        }
    }

    public final void j(ArrayList arrayList) {
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            int i10 = 0;
            while (true) {
                ArrayList arrayList2 = this.I;
                if (i10 >= arrayList2.size()) {
                    int i11 = 0;
                    while (true) {
                        ArrayList arrayList3 = this.H;
                        if (i11 >= arrayList3.size()) {
                            break;
                        }
                        if (((fj) arrayList.get(i7)).e1() == ((fj) arrayList3.get(i11)).e1() && fj.B0(((fj) arrayList3.get(i11)).k) == fj.B0(((fj) arrayList.get(i7)).k)) {
                            arrayList3.remove(i11);
                            break;
                        }
                        i11++;
                    }
                } else {
                    if (((fj) arrayList.get(i7)).e1() == ((fj) arrayList2.get(i10)).e1() && fj.B0(((fj) arrayList2.get(i10)).k) == fj.B0(((fj) arrayList.get(i7)).k)) {
                        arrayList2.remove(i10);
                        break;
                    }
                    i10++;
                }
            }
            ((fj) arrayList.get(i7)).P = false;
            w7.G(this.currentAccount).W(((fj) arrayList.get(i7)).F0(), arrayList.get(i7), 0, 0);
            w7.G(this.currentAccount).f(((fj) arrayList.get(i7)).F0());
        }
        getNotificationCenter().k(ks.d5, new Object[0]);
        getMessagesStorage().a.c(new w3(3, this, arrayList));
    }

    public final int k() {
        int i7 = this.E;
        this.E = i7 + 1;
        return i7;
    }

    public final int l() {
        int[] iArr;
        int e10 = t0.e();
        if (e10 == 1) {
            if (!this.O.g) {
                return 0;
            }
            iArr = p().a;
        } else if (e10 == 2) {
            if (!this.P.g) {
                return 0;
            }
            iArr = o().a;
        } else {
            if (!this.N.g) {
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
            if (!this.O.g) {
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
            if (!this.P.g) {
                return 0;
            }
            int i11 = 0;
            while (i7 < 4) {
                i11 |= o().a[i7];
                i7++;
            }
            return i11;
        }
        if (!this.N.g) {
            return 0;
        }
        int i12 = 0;
        while (i7 < 4) {
            i12 |= n().a[i7];
            i7++;
        }
        return i12;
    }

    public final z5 n() {
        int i7 = this.Q;
        return i7 == 0 ? this.K : i7 == 1 ? this.L : i7 == 2 ? this.M : this.N;
    }

    public final z5 o() {
        int i7 = this.S;
        return i7 == 0 ? this.K : i7 == 1 ? this.L : i7 == 2 ? this.M : this.P;
    }

    public final z5 p() {
        int i7 = this.R;
        return i7 == 0 ? this.K : i7 == 1 ? this.L : i7 == 2 ? this.M : this.O;
    }

    public final void s(boolean z10) {
        if (this.F) {
            return;
        }
        if (z10 || Math.abs(System.currentTimeMillis() - getUserConfig().b0) >= 86400000) {
            this.F = true;
            getConnectionsManager().sendRequest(new TL_account.getAutoDownloadSettings(), new s1(this, 1));
        }
    }

    public final void t(int i7) {
        int m10 = m();
        if ((m10 & 1) != 0 && (i7 & 1) != 0 && this.b.isEmpty()) {
            tr messagesStorage = getMessagesStorage();
            messagesStorage.a.c(new rp(messagesStorage, 1, 5));
        }
        if ((m10 & 2) != 0 && (i7 & 2) != 0 && this.c.isEmpty()) {
            tr messagesStorage2 = getMessagesStorage();
            messagesStorage2.a.c(new rp(messagesStorage2, 2, 5));
        }
        if ((m10 & 4) != 0 && (i7 & 4) != 0 && this.e.isEmpty()) {
            tr messagesStorage3 = getMessagesStorage();
            messagesStorage3.a.c(new rp(messagesStorage3, 4, 5));
        }
        int i10 = 8;
        if ((m10 & 8) == 0 || (i7 & 8) == 0 || !this.d.isEmpty()) {
            return;
        }
        tr messagesStorage4 = getMessagesStorage();
        messagesStorage4.a.c(new rp(messagesStorage4, i10, 5));
    }

    public final void u() {
        HashMap hashMap = this.x;
        for (Map.Entry entry : hashMap.entrySet()) {
            a((String) entry.getKey(), null, (y5) entry.getValue());
        }
        hashMap.clear();
        ArrayList arrayList = this.y;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            v((y5) obj);
        }
        arrayList.clear();
    }

    public final void v(y5 y5Var) {
        if (this.w) {
            this.y.add(y5Var);
            return;
        }
        int observerTag = y5Var.getObserverTag();
        SparseArray sparseArray = this.s;
        String str = (String) sparseArray.get(observerTag);
        if (str != null) {
            HashMap hashMap = this.n;
            ArrayList arrayList = (ArrayList) hashMap.get(str);
            if (arrayList != null) {
                int i7 = 0;
                while (i7 < arrayList.size()) {
                    WeakReference weakReference = (WeakReference) arrayList.get(i7);
                    if (weakReference.get() == null || weakReference.get() == y5Var) {
                        arrayList.remove(i7);
                        i7--;
                    }
                    i7++;
                }
                if (arrayList.isEmpty()) {
                    hashMap.remove(str);
                }
            }
            sparseArray.remove(y5Var.getObserverTag());
        }
    }

    public final void w(int i7) {
        z5 o4;
        boolean z10;
        TL_account.saveAutoDownloadSettings saveautodownloadsettings = new TL_account.saveAutoDownloadSettings();
        if (i7 == 0) {
            o4 = n();
            z10 = this.N.g;
        } else if (i7 == 1) {
            o4 = p();
            z10 = this.O.g;
        } else {
            o4 = o();
            z10 = this.P.g;
        }
        TLRPC.TL_autoDownloadSettings tL_autoDownloadSettings = new TLRPC.TL_autoDownloadSettings();
        saveautodownloadsettings.settings = tL_autoDownloadSettings;
        boolean z11 = o4.d;
        long[] jArr = o4.b;
        tL_autoDownloadSettings.audio_preload_next = z11;
        tL_autoDownloadSettings.video_preload_large = o4.c;
        tL_autoDownloadSettings.phonecalls_less_data = o4.f;
        tL_autoDownloadSettings.video_upload_maxbitrate = o4.h;
        tL_autoDownloadSettings.disabled = !z10;
        int i10 = 0;
        boolean z12 = false;
        boolean z13 = false;
        boolean z14 = false;
        while (true) {
            int[] iArr = o4.a;
            if (i10 >= iArr.length) {
                break;
            }
            int i11 = iArr[i10];
            if ((i11 & 1) != 0) {
                z12 = true;
            }
            if ((i11 & 4) != 0) {
                z13 = true;
            }
            if ((i11 & 8) != 0) {
                z14 = true;
            }
            if (z12 && z13 && z14) {
                break;
            } else {
                i10++;
            }
        }
        TLRPC.TL_autoDownloadSettings tL_autoDownloadSettings2 = saveautodownloadsettings.settings;
        tL_autoDownloadSettings2.photo_size_max = z12 ? (int) jArr[0] : 0;
        tL_autoDownloadSettings2.video_size_max = z13 ? jArr[1] : 0L;
        tL_autoDownloadSettings2.file_size_max = z14 ? jArr[2] : 0L;
        getConnectionsManager().sendRequest(saveautodownloadsettings, new fi.k5(9));
    }

    public final void y() {
        ArrayList arrayList = this.H;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (getFileLoader().S(((fj) arrayList.get(size)).S0())) {
                getFileLoader().W(((fj) arrayList.get(size)).F0(), arrayList.get(size), 2, 0);
            }
        }
    }
}
