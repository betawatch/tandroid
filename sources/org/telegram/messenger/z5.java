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
import org.telegram.ui.Components.l51;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class z5 extends c1 implements cs {
    public static volatile z5[] U = new z5[4];
    public int E;
    public boolean F;
    public final a0.h G;
    public final ArrayList H;
    public final ArrayList I;
    public final SparseArray J;
    public final y5 K;
    public final y5 L;
    public final y5 M;
    public final y5 N;
    public final y5 O;
    public final y5 P;
    public int Q;
    public int R;
    public int S;
    public final mi.b0 T;
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

    public z5(int i3) {
        super(i3);
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
        this.T = new mi.b0(this, 4);
        SharedPreferences sharedPreferences = hp.s1(this.currentAccount).e7;
        y5 y5Var = new y5(sharedPreferences.getString("preset0", "1_1_1_1_1048576_512000_512000_524288_0_0_1_1_50_0"), "1_1_1_1_1048576_512000_512000_524288_0_0_1_1_50_0");
        this.K = y5Var;
        y5Var.e = false;
        this.L = new y5(sharedPreferences.getString("preset1", "13_13_13_13_1048576_10485760_1048576_524288_1_1_1_0_100_1"), "13_13_13_13_1048576_10485760_1048576_524288_1_1_1_0_100_1");
        this.M = new y5(sharedPreferences.getString("preset2", "13_13_13_13_1048576_15728640_3145728_524288_1_1_1_0_100_1"), "13_13_13_13_1048576_15728640_3145728_524288_1_1_1_0_100_1");
        boolean contains = sharedPreferences.contains("newConfig");
        if (contains || !getUserConfig().p()) {
            this.N = new y5(sharedPreferences.getString("mobilePreset", "13_13_13_13_1048576_10485760_1048576_524288_1_1_1_0_100_1"), "13_13_13_13_1048576_10485760_1048576_524288_1_1_1_0_100_1");
            this.O = new y5(sharedPreferences.getString("wifiPreset", "13_13_13_13_1048576_15728640_3145728_524288_1_1_1_0_100_1"), "13_13_13_13_1048576_15728640_3145728_524288_1_1_1_0_100_1");
            this.P = new y5(sharedPreferences.getString("roamingPreset", "1_1_1_1_1048576_512000_512000_524288_0_0_1_1_50_0"), "1_1_1_1_1048576_512000_512000_524288_0_0_1_1_50_0");
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
            y5 y5Var2 = new y5(iArr, this.L.b[0], jArr[2], jArr[3], true, true, z10, false, 100, false);
            this.N = y5Var2;
            y5 y5Var3 = new y5(iArr2, this.M.b[0], jArr2[2], jArr2[3], true, true, z10, false, 100, true);
            this.O = y5Var3;
            y5 y5Var4 = new y5(iArr3, this.K.b[0], jArr3[2], jArr3[3], false, false, z10, true, 50, true);
            this.P = y5Var4;
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.putBoolean("newConfig", true);
            edit.putString("mobilePreset", y5Var2.toString());
            edit.putString("wifiPreset", y5Var3.toString());
            edit.putString("roamingPreset", y5Var4.toString());
            this.Q = 3;
            edit.putInt("currentMobilePreset", 3);
            this.R = 3;
            edit.putInt("currentWifiPreset", 3);
            this.S = 3;
            edit.putInt("currentRoamingPreset", 3);
            edit.commit();
        }
        g0.h3(new w5(this, 1));
        androidx.mediarouter.app.f fVar = new androidx.mediarouter.app.f(this, 7);
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

    public static z5 q(int i3) {
        z5 z5Var;
        z5 z5Var2 = U[i3];
        if (z5Var2 != null) {
            return z5Var2;
        }
        synchronized (z5.class) {
            try {
                z5Var = U[i3];
                if (z5Var == null) {
                    z5[] z5VarArr = U;
                    z5 z5Var3 = new z5(i3);
                    z5VarArr[i3] = z5Var3;
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
        long j10 = jArr[1];
        if (j10 == 0) {
            return 0.0f;
        }
        return Math.min(1.0f, jArr[0] / j10);
    }

    public static int x(int i3) {
        if (i3 == 1) {
            return 0;
        }
        if (i3 == 2) {
            return 2;
        }
        if (i3 == 4) {
            return 1;
        }
        return i3 == 8 ? 2 : 0;
    }

    public final void a(String str, zi ziVar, x5 x5Var) {
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
        if (ziVar != null) {
            HashMap hashMap2 = this.r;
            ArrayList arrayList2 = (ArrayList) hashMap2.get(str);
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                hashMap2.put(str, arrayList2);
            }
            arrayList2.add(ziVar);
        }
        this.s.put(x5Var.getObserverTag(), str);
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
        int i3;
        char c2;
        int e10;
        y5 n4;
        if (message == null || (message.media instanceof TLRPC.TL_messageMediaStory)) {
            return f() ? 2 : 0;
        }
        boolean M4 = zi.M4(message);
        if (M4 || zi.u3(message) || zi.k4(message) || (zi.o1(message) instanceof TLRPC.TL_messageMediaGame)) {
            i3 = 4;
        } else if (zi.S4(message)) {
            i3 = 2;
        } else if (zi.T3(message) || zi.x4(message) || zi.M2(message)) {
            i3 = 1;
        } else {
            if (zi.G0(message) == null) {
                return 0;
            }
            i3 = 8;
        }
        TLRPC.Peer peer = message.peer_id;
        if (peer != null) {
            if (peer.user_id == 0) {
                if (peer.chat_id != 0) {
                    if (message.from_id instanceof TLRPC.TL_peerUser) {
                    }
                    c2 = 2;
                } else {
                    TLRPC.Chat M0 = peer.channel_id != 0 ? getMessagesController().M0(Long.valueOf(message.peer_id.channel_id)) : null;
                    if (t3.T(M0) && M0.megagroup) {
                        if (message.from_id instanceof TLRPC.TL_peerUser) {
                        }
                        c2 = 2;
                    } else {
                        c2 = 3;
                    }
                }
                e10 = t0.e();
                if (e10 == 1) {
                    if (!this.O.g) {
                        return 0;
                    }
                    n4 = p();
                } else if (e10 == 2) {
                    if (!this.P.g) {
                        return 0;
                    }
                    n4 = o();
                } else {
                    if (!this.N.g) {
                        return 0;
                    }
                    n4 = n();
                }
                int[] iArr = n4.a;
                long[] jArr = n4.b;
                int i10 = iArr[c2];
                long max = i3 == 2 ? Math.max(524288L, jArr[x(i3)]) : jArr[x(i3)];
                long q12 = zi.q1(zi.o1(message));
                return (M4 || !n4.c || q12 <= max || max <= 2097152) ? ((i3 != 1 || (q12 != 0 && q12 <= max)) && (i3 == 2 || (i10 & i3) != 0)) ? 1 : 0 : (i10 & i3) != 0 ? 2 : 0;
            }
            c2 = 0;
            e10 = t0.e();
            if (e10 == 1) {
            }
            int[] iArr2 = n4.a;
            long[] jArr2 = n4.b;
            int i102 = iArr2[c2];
            if (i3 == 2) {
            }
            long q122 = zi.q1(zi.o1(message));
            if (M4) {
            }
        }
        c2 = 1;
        e10 = t0.e();
        if (e10 == 1) {
        }
        int[] iArr22 = n4.a;
        long[] jArr22 = n4.b;
        int i1022 = iArr22[c2];
        if (i3 == 2) {
        }
        long q1222 = zi.q1(zi.o1(message));
        if (M4) {
        }
    }

    public final boolean c(int i3, long j10) {
        y5 n4;
        int e10 = t0.e();
        if (e10 == 1) {
            if (!this.O.g) {
                return false;
            }
            n4 = p();
        } else if (e10 == 2) {
            if (!this.P.g) {
                return false;
            }
            n4 = o();
        } else {
            if (!this.N.g) {
                return false;
            }
            n4 = n();
        }
        int i10 = n4.a[1];
        long j11 = n4.b[x(i3)];
        if (i3 == 1 || (j10 != 0 && j10 <= j11)) {
            return i3 == 2 || (i3 & i10) != 0;
        }
        return false;
    }

    public final boolean d(zi ziVar) {
        TL_stories.StoryItem storyItem;
        TLRPC.MessageMedia messageMedia;
        if (ziVar.D == 23) {
            int i3 = az.a;
            return (!lc.e(1024) || (storyItem = ((TLRPC.TL_messageMediaStory) zi.n1(ziVar)).storyItem) == null || (messageMedia = storyItem.media) == null || messageMedia.document == null || !storyItem.isPublic) ? false : true;
        }
        if (ziVar.Y0 != null) {
            return true;
        }
        return !ziVar.y3() && e(ziVar) == 1;
    }

    @Override // org.telegram.messenger.cs
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        a0.h hVar = this.G;
        int i11 = hs.Z1;
        SparseArray sparseArray = this.s;
        HashMap hashMap = this.n;
        if (i3 == i11 || i3 == hs.S1) {
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
        if (i3 == hs.Y1 || i3 == hs.R1) {
            this.w = true;
            String str2 = (String) objArr[0];
            HashMap hashMap2 = this.r;
            ArrayList arrayList2 = (ArrayList) hashMap2.get(str2);
            if (arrayList2 != null) {
                int size2 = arrayList2.size();
                for (int i13 = 0; i13 < size2; i13++) {
                    ((zi) arrayList2.get(i13)).x0 = true;
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
        if (i3 == hs.X1) {
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
        if (i3 == hs.W1) {
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
                        ky kyVar = (ky) arrayList6.get(i17);
                        if (kyVar.n == null) {
                            long j10 = kyVar.a;
                            Long l14 = (Long) hVar.f(j10);
                            if (kyVar.e == 4) {
                                if (l14 != null && l14.longValue() + 4000 >= System.currentTimeMillis()) {
                                }
                                zi ziVar = (zi) kyVar.E.get(str3 + "_i");
                                if (ziVar != null && zi.M4(ziVar.k)) {
                                    getMessagesController().C4(5, 0, j10, 0, null);
                                } else if (ziVar == null || ziVar.F0() == null) {
                                    getMessagesController().C4(4, 0, j10, 0, null);
                                } else {
                                    getMessagesController().C4(3, 0, j10, 0, null);
                                }
                                hVar.k(Long.valueOf(System.currentTimeMillis()), j10);
                            } else {
                                kyVar.m.F0();
                                if (l14 == null || l14.longValue() + 4000 < System.currentTimeMillis()) {
                                    if (kyVar.m.i4()) {
                                        getMessagesController().C4(8, 0, j10, 0, null);
                                    } else if (zi.M4(kyVar.m.k)) {
                                        getMessagesController().C4(5, 0, j10, 0, null);
                                    } else if (zi.S4(kyVar.m.k)) {
                                        getMessagesController().C4(9, 0, j10, 0, null);
                                    } else if (kyVar.m.F0() != null) {
                                        getMessagesController().C4(3, 0, j10, 0, null);
                                    } else if (kyVar.g != null) {
                                        getMessagesController().C4(4, 0, j10, 0, null);
                                    }
                                    hVar.k(Long.valueOf(System.currentTimeMillis()), j10);
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
    public final int e(zi ziVar) {
        TLRPC.Message message;
        int i3;
        char c2;
        int e10;
        y5 n4;
        l51 l51Var;
        long q12;
        if (ziVar == null || (message = ziVar.k) == null) {
            return 0;
        }
        if (message.media instanceof TLRPC.TL_messageMediaStory) {
            return f() ? 2 : 0;
        }
        boolean M4 = zi.M4(message);
        if (M4 || zi.u3(message) || zi.k4(message) || (zi.o1(message) instanceof TLRPC.TL_messageMediaGame)) {
            i3 = 4;
        } else if (zi.S4(message)) {
            i3 = 2;
        } else if (zi.T3(message) || zi.x4(message) || zi.M2(message)) {
            i3 = 1;
        } else {
            if (zi.G0(message) == null) {
                return 0;
            }
            i3 = 8;
        }
        TLRPC.Peer peer = message.peer_id;
        if (peer != null) {
            if (peer.user_id == 0) {
                if (peer.chat_id != 0) {
                    if (message.from_id instanceof TLRPC.TL_peerUser) {
                    }
                    c2 = 2;
                } else {
                    TLRPC.Chat M0 = peer.channel_id != 0 ? getMessagesController().M0(Long.valueOf(message.peer_id.channel_id)) : null;
                    if (t3.T(M0) && M0.megagroup) {
                        if (message.from_id instanceof TLRPC.TL_peerUser) {
                        }
                        c2 = 2;
                    } else {
                        c2 = 3;
                    }
                }
                e10 = t0.e();
                if (e10 == 1) {
                    if (!this.O.g) {
                        return 0;
                    }
                    n4 = p();
                } else if (e10 == 2) {
                    if (!this.P.g) {
                        return 0;
                    }
                    n4 = o();
                } else {
                    if (!this.N.g) {
                        return 0;
                    }
                    n4 = n();
                }
                int[] iArr = n4.a;
                long[] jArr = n4.b;
                int i10 = iArr[c2];
                long max = i3 == 2 ? Math.max(524288L, jArr[x(i3)]) : jArr[x(i3)];
                l51Var = ziVar.e3;
                if (l51Var != null) {
                    q12 = l51Var.g.size;
                } else {
                    l51 l51Var2 = ziVar.f3;
                    q12 = l51Var2 != null ? l51Var2.g.size : zi.q1(zi.o1(message));
                }
                return (M4 || !n4.c || q12 <= max || max <= 2097152) ? ((i3 != 1 || (q12 != 0 && q12 <= max)) && (i3 == 2 || (i10 & i3) != 0)) ? 1 : 0 : (i10 & i3) != 0 ? 2 : 0;
            }
            c2 = 0;
            e10 = t0.e();
            if (e10 == 1) {
            }
            int[] iArr2 = n4.a;
            long[] jArr2 = n4.b;
            int i102 = iArr2[c2];
            if (i3 == 2) {
            }
            l51Var = ziVar.e3;
            if (l51Var != null) {
            }
            if (M4) {
            }
        }
        c2 = 1;
        e10 = t0.e();
        if (e10 == 1) {
        }
        int[] iArr22 = n4.a;
        long[] jArr22 = n4.b;
        int i1022 = iArr22[c2];
        if (i3 == 2) {
        }
        l51Var = ziVar.e3;
        if (l51Var != null) {
        }
        if (M4) {
        }
    }

    public final boolean f() {
        y5 n4;
        int e10 = t0.e();
        if (e10 == 1) {
            if (!this.O.g) {
                return false;
            }
            n4 = p();
        } else if (e10 == 2) {
            if (!this.P.g) {
                return false;
            }
            n4 = o();
        } else {
            if (!this.N.g) {
                return false;
            }
            n4 = n();
        }
        return n4.e;
    }

    public final void g() {
        int i3;
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
        if (this.N.g || this.P.g || this.O.g) {
            i3 = 0;
            for (int i18 = 0; i18 < 4; i18++) {
                if ((n().a[i18] & 1) != 0 || (p().a[i18] & 1) != 0 || (o().a[i18] & 1) != 0) {
                    i3 |= 1;
                }
                if ((n().a[i18] & 2) != 0 || (p().a[i18] & 2) != 0 || (o().a[i18] & 2) != 0) {
                    i3 |= 2;
                }
                if ((n().a[i18] & 4) != 0 || (p().a[i18] & 4) != 0 || (o().a[i18] & 4) != 0) {
                    i3 |= 4;
                }
                if ((n().a[i18] & 8) != 0 || (p().a[i18] & 8) != 0 || (o().a[i18] & 8) != 0) {
                    i3 |= 8;
                }
            }
        } else {
            i3 = 0;
        }
        if (i3 == 0) {
            getMessagesStorage().r(0);
            return;
        }
        if ((i3 & 1) == 0) {
            getMessagesStorage().r(1);
        }
        if ((i3 & 2) == 0) {
            getMessagesStorage().r(2);
        }
        if ((i3 & 4) == 0) {
            getMessagesStorage().r(4);
        }
        if ((i3 & 8) == 0) {
            getMessagesStorage().r(8);
        }
    }

    public final void h(int i3, String str) {
        HashMap hashMap = this.f;
        a6 a6Var = (a6) hashMap.get(str);
        if (a6Var != null) {
            hashMap.remove(str);
            this.h.remove(new Pair(Long.valueOf(a6Var.c), Integer.valueOf(a6Var.b)));
            if (i3 == 0 || i3 == 2) {
                qr messagesStorage = getMessagesStorage();
                long j10 = a6Var.c;
                messagesStorage.a.c(new rp(messagesStorage, a6Var.b, j10, 6));
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

    public final void i(int i3, long j10) {
        SparseArray sparseArray = this.J;
        zi ziVar = (zi) sparseArray.get(i3);
        if (ziVar == null || zi.B0(ziVar.k) != j10) {
            return;
        }
        sparseArray.remove(i3);
        if (sparseArray.size() == 0) {
            getNotificationCenter().k(hs.b5, new Object[0]);
        }
    }

    public final void j(ArrayList arrayList) {
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
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
                        if (((zi) arrayList.get(i3)).f1() == ((zi) arrayList3.get(i11)).f1() && zi.B0(((zi) arrayList3.get(i11)).k) == zi.B0(((zi) arrayList.get(i3)).k)) {
                            arrayList3.remove(i11);
                            break;
                        }
                        i11++;
                    }
                } else {
                    if (((zi) arrayList.get(i3)).f1() == ((zi) arrayList2.get(i10)).f1() && zi.B0(((zi) arrayList2.get(i10)).k) == zi.B0(((zi) arrayList.get(i3)).k)) {
                        arrayList2.remove(i10);
                        break;
                    }
                    i10++;
                }
            }
            ((zi) arrayList.get(i3)).P = false;
            w7.G(this.currentAccount).X(((zi) arrayList.get(i3)).F0(), arrayList.get(i3), 0, 0);
            w7.G(this.currentAccount).f(((zi) arrayList.get(i3)).F0());
        }
        getNotificationCenter().k(hs.b5, new Object[0]);
        getMessagesStorage().a.c(new b4(3, this, arrayList));
    }

    public final int k() {
        int i3 = this.E;
        this.E = i3 + 1;
        return i3;
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
        int i3 = 0;
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
            i3 |= i12 << (i10 * 8);
        }
        return i3;
    }

    public final int m() {
        int e10 = t0.e();
        int i3 = 0;
        if (e10 == 1) {
            if (!this.O.g) {
                return 0;
            }
            int i10 = 0;
            while (i3 < 4) {
                i10 |= p().a[i3];
                i3++;
            }
            return i10;
        }
        if (e10 == 2) {
            if (!this.P.g) {
                return 0;
            }
            int i11 = 0;
            while (i3 < 4) {
                i11 |= o().a[i3];
                i3++;
            }
            return i11;
        }
        if (!this.N.g) {
            return 0;
        }
        int i12 = 0;
        while (i3 < 4) {
            i12 |= n().a[i3];
            i3++;
        }
        return i12;
    }

    public final y5 n() {
        int i3 = this.Q;
        return i3 == 0 ? this.K : i3 == 1 ? this.L : i3 == 2 ? this.M : this.N;
    }

    public final y5 o() {
        int i3 = this.S;
        return i3 == 0 ? this.K : i3 == 1 ? this.L : i3 == 2 ? this.M : this.P;
    }

    public final y5 p() {
        int i3 = this.R;
        return i3 == 0 ? this.K : i3 == 1 ? this.L : i3 == 2 ? this.M : this.O;
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

    public final void t(int i3) {
        int m10 = m();
        if ((m10 & 1) != 0 && (i3 & 1) != 0 && this.b.isEmpty()) {
            qr messagesStorage = getMessagesStorage();
            messagesStorage.a.c(new kp(messagesStorage, 1, 6));
        }
        if ((m10 & 2) != 0 && (i3 & 2) != 0 && this.c.isEmpty()) {
            qr messagesStorage2 = getMessagesStorage();
            messagesStorage2.a.c(new kp(messagesStorage2, 2, 6));
        }
        if ((m10 & 4) != 0 && (i3 & 4) != 0 && this.e.isEmpty()) {
            qr messagesStorage3 = getMessagesStorage();
            messagesStorage3.a.c(new kp(messagesStorage3, 4, 6));
        }
        int i10 = 8;
        if ((m10 & 8) == 0 || (i3 & 8) == 0 || !this.d.isEmpty()) {
            return;
        }
        qr messagesStorage4 = getMessagesStorage();
        messagesStorage4.a.c(new kp(messagesStorage4, i10, 6));
    }

    public final void u() {
        HashMap hashMap = this.x;
        for (Map.Entry entry : hashMap.entrySet()) {
            a((String) entry.getKey(), null, (x5) entry.getValue());
        }
        hashMap.clear();
        ArrayList arrayList = this.y;
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
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
                int i3 = 0;
                while (i3 < arrayList.size()) {
                    WeakReference weakReference = (WeakReference) arrayList.get(i3);
                    if (weakReference.get() == null || weakReference.get() == x5Var) {
                        arrayList.remove(i3);
                        i3--;
                    }
                    i3++;
                }
                if (arrayList.isEmpty()) {
                    hashMap.remove(str);
                }
            }
            sparseArray.remove(x5Var.getObserverTag());
        }
    }

    public final void w(int i3) {
        y5 o10;
        boolean z10;
        TL_account.saveAutoDownloadSettings saveautodownloadsettings = new TL_account.saveAutoDownloadSettings();
        if (i3 == 0) {
            o10 = n();
            z10 = this.N.g;
        } else if (i3 == 1) {
            o10 = p();
            z10 = this.O.g;
        } else {
            o10 = o();
            z10 = this.P.g;
        }
        TLRPC.TL_autoDownloadSettings tL_autoDownloadSettings = new TLRPC.TL_autoDownloadSettings();
        saveautodownloadsettings.settings = tL_autoDownloadSettings;
        boolean z11 = o10.d;
        long[] jArr = o10.b;
        tL_autoDownloadSettings.audio_preload_next = z11;
        tL_autoDownloadSettings.video_preload_large = o10.c;
        tL_autoDownloadSettings.phonecalls_less_data = o10.f;
        tL_autoDownloadSettings.video_upload_maxbitrate = o10.h;
        tL_autoDownloadSettings.disabled = !z10;
        int i10 = 0;
        boolean z12 = false;
        boolean z13 = false;
        boolean z14 = false;
        while (true) {
            int[] iArr = o10.a;
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
        getConnectionsManager().sendRequest(saveautodownloadsettings, new ei.u5(9));
    }

    public final void y() {
        ArrayList arrayList = this.H;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (getFileLoader().T(((zi) arrayList.get(size)).S0())) {
                getFileLoader().X(((zi) arrayList.get(size)).F0(), arrayList.get(size), 2, 0);
            }
        }
    }
}
