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
import org.telegram.ui.Components.t61;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class b6 extends f1 implements us {
    public static volatile b6[] T = new b6[4];
    public int D;
    public boolean E;
    public final a0.h F;
    public final ArrayList G;
    public final ArrayList H;
    public final SparseArray I;
    public final a6 J;
    public final a6 K;
    public final a6 L;
    public final a6 M;
    public final a6 N;
    public final a6 O;
    public int P;
    public int Q;
    public int R;
    public final mg.c2 S;
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

    public b6(int i10) {
        super(i10);
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
        this.S = new mg.c2(this, 3);
        SharedPreferences sharedPreferences = vp.r1(this.currentAccount).f7;
        a6 a6Var = new a6(sharedPreferences.getString("preset0", "1_1_1_1_1048576_512000_512000_524288_0_0_1_1_50_0"), "1_1_1_1_1048576_512000_512000_524288_0_0_1_1_50_0");
        this.J = a6Var;
        a6Var.e = false;
        this.K = new a6(sharedPreferences.getString("preset1", "13_13_13_13_1048576_10485760_1048576_524288_1_1_1_0_100_1"), "13_13_13_13_1048576_10485760_1048576_524288_1_1_1_0_100_1");
        this.L = new a6(sharedPreferences.getString("preset2", "13_13_13_13_1048576_15728640_3145728_524288_1_1_1_0_100_1"), "13_13_13_13_1048576_15728640_3145728_524288_1_1_1_0_100_1");
        boolean contains = sharedPreferences.contains("newConfig");
        if (contains || !getUserConfig().p()) {
            this.M = new a6(sharedPreferences.getString("mobilePreset", "13_13_13_13_1048576_10485760_1048576_524288_1_1_1_0_100_1"), "13_13_13_13_1048576_10485760_1048576_524288_1_1_1_0_100_1");
            this.N = new a6(sharedPreferences.getString("wifiPreset", "13_13_13_13_1048576_15728640_3145728_524288_1_1_1_0_100_1"), "13_13_13_13_1048576_15728640_3145728_524288_1_1_1_0_100_1");
            this.O = new a6(sharedPreferences.getString("roamingPreset", "1_1_1_1_1048576_512000_512000_524288_0_0_1_1_50_0"), "1_1_1_1_1048576_512000_512000_524288_0_0_1_1_50_0");
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
            int i11 = 0;
            for (int i12 = 4; i11 < i12; i12 = 4) {
                int i13 = i11;
                StringBuilder sb2 = new StringBuilder("mobileDataDownloadMask");
                Object obj2 = "";
                if (i13 == 0) {
                    obj = "";
                } else {
                    obj = "";
                    obj2 = Integer.valueOf(i13);
                }
                sb2.append(obj2);
                String sb3 = sb2.toString();
                if (i13 == 0 || sharedPreferences.contains(sb3)) {
                    iArr[i13] = sharedPreferences.getInt(sb3, 13);
                    StringBuilder sb4 = new StringBuilder("wifiDownloadMask");
                    sb4.append(i13 == 0 ? obj : Integer.valueOf(i13));
                    iArr2[i13] = sharedPreferences.getInt(sb4.toString(), 13);
                    StringBuilder sb5 = new StringBuilder("roamingDownloadMask");
                    sb5.append(i13 == 0 ? obj : Integer.valueOf(i13));
                    iArr3[i13] = sharedPreferences.getInt(sb5.toString(), 1);
                } else {
                    iArr[i13] = iArr[0];
                    iArr2[i13] = iArr2[0];
                    iArr3[i13] = iArr3[0];
                }
                i11 = i13 + 1;
            }
            jArr[2] = sharedPreferences.getLong("mobileMaxDownloadSize2", this.K.b[1]);
            jArr[3] = sharedPreferences.getLong("mobileMaxDownloadSize3", this.K.b[2]);
            jArr2[2] = sharedPreferences.getLong("wifiMaxDownloadSize2", this.L.b[1]);
            jArr2[3] = sharedPreferences.getLong("wifiMaxDownloadSize3", this.L.b[2]);
            jArr3[2] = sharedPreferences.getLong("roamingMaxDownloadSize2", this.J.b[1]);
            jArr3[3] = sharedPreferences.getLong("roamingMaxDownloadSize3", this.J.b[2]);
            boolean z10 = sharedPreferences.getBoolean("globalAutodownloadEnabled", true);
            a6 a6Var2 = new a6(iArr, this.K.b[0], jArr[2], jArr[3], true, true, z10, false, 100, false);
            this.M = a6Var2;
            a6 a6Var3 = new a6(iArr2, this.L.b[0], jArr2[2], jArr2[3], true, true, z10, false, 100, true);
            this.N = a6Var3;
            a6 a6Var4 = new a6(iArr3, this.J.b[0], jArr3[2], jArr3[3], false, false, z10, true, 50, true);
            this.O = a6Var4;
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.putBoolean("newConfig", true);
            edit.putString("mobilePreset", a6Var2.toString());
            edit.putString("wifiPreset", a6Var3.toString());
            edit.putString("roamingPreset", a6Var4.toString());
            this.P = 3;
            edit.putInt("currentMobilePreset", 3);
            this.Q = 3;
            edit.putInt("currentWifiPreset", 3);
            this.R = 3;
            edit.putInt("currentRoamingPreset", 3);
            edit.commit();
        }
        i0.g3(new y5(this, 1));
        androidx.mediarouter.app.f fVar = new androidx.mediarouter.app.f(this, 8);
        IntentFilter intentFilter = new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE");
        if (Build.VERSION.SDK_INT >= 33) {
            w0.b.registerReceiver(fVar, intentFilter, 4);
        } else {
            w0.b.registerReceiver(fVar, intentFilter);
        }
        if (getUserConfig().p()) {
            g();
        }
    }

    public static b6 q(int i10) {
        b6 b6Var;
        b6 b6Var2 = T[i10];
        if (b6Var2 != null) {
            return b6Var2;
        }
        synchronized (b6.class) {
            try {
                b6Var = T[i10];
                if (b6Var == null) {
                    b6[] b6VarArr = T;
                    b6 b6Var3 = new b6(i10);
                    b6VarArr[i10] = b6Var3;
                    b6Var = b6Var3;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return b6Var;
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

    public static int x(int i10) {
        if (i10 == 1) {
            return 0;
        }
        if (i10 == 2) {
            return 2;
        }
        if (i10 == 4) {
            return 1;
        }
        return i10 == 8 ? 2 : 0;
    }

    public final void a(String str, jj jjVar, z5 z5Var) {
        if (this.w) {
            this.x.put(str, z5Var);
            return;
        }
        v(z5Var);
        HashMap hashMap = this.n;
        ArrayList arrayList = (ArrayList) hashMap.get(str);
        if (arrayList == null) {
            arrayList = new ArrayList();
            hashMap.put(str, arrayList);
        }
        arrayList.add(new WeakReference(z5Var));
        if (jjVar != null) {
            HashMap hashMap2 = this.r;
            ArrayList arrayList2 = (ArrayList) hashMap2.get(str);
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                hashMap2.put(str, arrayList2);
            }
            arrayList2.add(jjVar);
        }
        this.s.put(z5Var.getObserverTag(), str);
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
        int i10;
        char c10;
        int e;
        a6 n10;
        if (message == null || (message.media instanceof TLRPC.TL_messageMediaStory)) {
            return f() ? 2 : 0;
        }
        boolean L4 = jj.L4(message);
        if (L4 || jj.t3(message) || jj.j4(message) || (jj.o1(message) instanceof TLRPC.TL_messageMediaGame)) {
            i10 = 4;
        } else if (jj.R4(message)) {
            i10 = 2;
        } else if (jj.S3(message) || jj.w4(message) || jj.L2(message)) {
            i10 = 1;
        } else {
            if (jj.G0(message) == null) {
                return 0;
            }
            i10 = 8;
        }
        TLRPC.Peer peer = message.peer_id;
        if (peer != null) {
            if (peer.user_id == 0) {
                if (peer.chat_id != 0) {
                    if (message.from_id instanceof TLRPC.TL_peerUser) {
                    }
                    c10 = 2;
                } else {
                    TLRPC.Chat L0 = peer.channel_id != 0 ? getMessagesController().L0(Long.valueOf(message.peer_id.channel_id)) : null;
                    if (w3.T(L0) && L0.megagroup) {
                        if (message.from_id instanceof TLRPC.TL_peerUser) {
                        }
                        c10 = 2;
                    } else {
                        c10 = 3;
                    }
                }
                e = w0.e();
                if (e == 1) {
                    if (!this.N.g) {
                        return 0;
                    }
                    n10 = p();
                } else if (e == 2) {
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
                int i11 = iArr[c10];
                long max = i10 == 2 ? Math.max(524288L, jArr[x(i10)]) : jArr[x(i10)];
                long q12 = jj.q1(jj.o1(message));
                return (L4 || !n10.c || q12 <= max || max <= 2097152) ? ((i10 != 1 || (q12 != 0 && q12 <= max)) && (i10 == 2 || (i11 & i10) != 0)) ? 1 : 0 : (i11 & i10) != 0 ? 2 : 0;
            }
            c10 = 0;
            e = w0.e();
            if (e == 1) {
            }
            int[] iArr2 = n10.a;
            long[] jArr2 = n10.b;
            int i112 = iArr2[c10];
            if (i10 == 2) {
            }
            long q122 = jj.q1(jj.o1(message));
            if (L4) {
            }
        }
        c10 = 1;
        e = w0.e();
        if (e == 1) {
        }
        int[] iArr22 = n10.a;
        long[] jArr22 = n10.b;
        int i1122 = iArr22[c10];
        if (i10 == 2) {
        }
        long q1222 = jj.q1(jj.o1(message));
        if (L4) {
        }
    }

    public final boolean c(int i10, long j10) {
        a6 n10;
        int e = w0.e();
        if (e == 1) {
            if (!this.N.g) {
                return false;
            }
            n10 = p();
        } else if (e == 2) {
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
        int i11 = n10.a[1];
        long j11 = n10.b[x(i10)];
        if (i10 == 1 || (j10 != 0 && j10 <= j11)) {
            return i10 == 2 || (i10 & i11) != 0;
        }
        return false;
    }

    public final boolean d(jj jjVar) {
        TL_stories.StoryItem storyItem;
        TLRPC.MessageMedia messageMedia;
        if (jjVar.D == 23) {
            int i10 = tz.a;
            return (!sc.e(1024) || (storyItem = ((TLRPC.TL_messageMediaStory) jj.n1(jjVar)).storyItem) == null || (messageMedia = storyItem.media) == null || messageMedia.document == null || !storyItem.isPublic) ? false : true;
        }
        if (jjVar.Y0 != null) {
            return true;
        }
        return !jjVar.x3() && e(jjVar) == 1;
    }

    @Override // org.telegram.messenger.us
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        a0.h hVar = this.F;
        int i12 = zs.Z1;
        SparseArray sparseArray = this.s;
        HashMap hashMap = this.n;
        if (i10 == i12 || i10 == zs.S1) {
            String str = (String) objArr[0];
            Integer num = (Integer) objArr[1];
            this.w = true;
            ArrayList arrayList = (ArrayList) hashMap.get(str);
            if (arrayList != null) {
                int size = arrayList.size();
                for (int i13 = 0; i13 < size; i13++) {
                    WeakReference weakReference = (WeakReference) arrayList.get(i13);
                    if (weakReference.get() != null) {
                        ((z5) weakReference.get()).C(num.intValue() == 1);
                        if (num.intValue() != 1) {
                            sparseArray.remove(((z5) weakReference.get()).getObserverTag());
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
        if (i10 == zs.Y1 || i10 == zs.R1) {
            this.w = true;
            String str2 = (String) objArr[0];
            HashMap hashMap2 = this.r;
            ArrayList arrayList2 = (ArrayList) hashMap2.get(str2);
            if (arrayList2 != null) {
                int size2 = arrayList2.size();
                for (int i14 = 0; i14 < size2; i14++) {
                    ((jj) arrayList2.get(i14)).x0 = true;
                }
                hashMap2.remove(str2);
            }
            ArrayList arrayList3 = (ArrayList) hashMap.get(str2);
            if (arrayList3 != null) {
                int size3 = arrayList3.size();
                for (int i15 = 0; i15 < size3; i15++) {
                    WeakReference weakReference2 = (WeakReference) arrayList3.get(i15);
                    if (weakReference2.get() != null) {
                        ((z5) weakReference2.get()).M(str2);
                        sparseArray.remove(((z5) weakReference2.get()).getObserverTag());
                    }
                }
                hashMap.remove(str2);
            }
            this.w = false;
            u();
            h(0, str2);
            return;
        }
        if (i10 == zs.X1) {
            this.w = true;
            ArrayList arrayList4 = (ArrayList) hashMap.get((String) objArr[0]);
            if (arrayList4 != null) {
                Long l4 = (Long) objArr[1];
                Long l10 = (Long) objArr[2];
                int size4 = arrayList4.size();
                for (int i16 = 0; i16 < size4; i16++) {
                    WeakReference weakReference3 = (WeakReference) arrayList4.get(i16);
                    if (weakReference3.get() != null) {
                        ((z5) weakReference3.get()).i(l4.longValue(), l10.longValue());
                    }
                }
            }
            this.w = false;
            u();
            return;
        }
        if (i10 == zs.W1) {
            this.w = true;
            String str3 = (String) objArr[0];
            ArrayList arrayList5 = (ArrayList) hashMap.get(str3);
            if (arrayList5 != null) {
                Long l11 = (Long) objArr[1];
                Long l12 = (Long) objArr[2];
                Boolean bool = (Boolean) objArr[3];
                int size5 = arrayList5.size();
                for (int i17 = 0; i17 < size5; i17++) {
                    WeakReference weakReference4 = (WeakReference) arrayList5.get(i17);
                    if (weakReference4.get() != null) {
                        z5 z5Var = (z5) weakReference4.get();
                        long longValue = l11.longValue();
                        long longValue2 = l12.longValue();
                        bool.getClass();
                        z5Var.n(longValue, longValue2);
                    }
                }
            }
            this.w = false;
            u();
            try {
                ArrayList arrayList6 = (ArrayList) getSendMessagesHelper().a.get(str3);
                if (arrayList6 != null) {
                    for (int i18 = 0; i18 < arrayList6.size(); i18++) {
                        cz czVar = (cz) arrayList6.get(i18);
                        if (czVar.n == null) {
                            long j10 = czVar.a;
                            Long l13 = (Long) hVar.f(j10);
                            if (czVar.e == 4) {
                                if (l13 != null && l13.longValue() + 4000 >= System.currentTimeMillis()) {
                                }
                                jj jjVar = (jj) czVar.E.get(str3 + "_i");
                                if (jjVar != null && jj.L4(jjVar.k)) {
                                    getMessagesController().z4(5, 0, j10, 0, null);
                                } else if (jjVar == null || jjVar.F0() == null) {
                                    getMessagesController().z4(4, 0, j10, 0, null);
                                } else {
                                    getMessagesController().z4(3, 0, j10, 0, null);
                                }
                                hVar.k(Long.valueOf(System.currentTimeMillis()), j10);
                            } else {
                                czVar.m.F0();
                                if (l13 == null || l13.longValue() + 4000 < System.currentTimeMillis()) {
                                    if (czVar.m.h4()) {
                                        getMessagesController().z4(8, 0, j10, 0, null);
                                    } else if (jj.L4(czVar.m.k)) {
                                        getMessagesController().z4(5, 0, j10, 0, null);
                                    } else if (jj.R4(czVar.m.k)) {
                                        getMessagesController().z4(9, 0, j10, 0, null);
                                    } else if (czVar.m.F0() != null) {
                                        getMessagesController().z4(3, 0, j10, 0, null);
                                    } else if (czVar.g != null) {
                                        getMessagesController().z4(4, 0, j10, 0, null);
                                    }
                                    hVar.k(Long.valueOf(System.currentTimeMillis()), j10);
                                }
                            }
                        }
                    }
                }
            } catch (Exception e) {
                f8.g(e, true);
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
    public final int e(jj jjVar) {
        TLRPC.Message message;
        int i10;
        char c10;
        int e;
        a6 n10;
        t61 t61Var;
        long q12;
        if (jjVar == null || (message = jjVar.k) == null) {
            return 0;
        }
        if (message.media instanceof TLRPC.TL_messageMediaStory) {
            return f() ? 2 : 0;
        }
        boolean L4 = jj.L4(message);
        if (L4 || jj.t3(message) || jj.j4(message) || (jj.o1(message) instanceof TLRPC.TL_messageMediaGame)) {
            i10 = 4;
        } else if (jj.R4(message)) {
            i10 = 2;
        } else if (jj.S3(message) || jj.w4(message) || jj.L2(message)) {
            i10 = 1;
        } else {
            if (jj.G0(message) == null) {
                return 0;
            }
            i10 = 8;
        }
        TLRPC.Peer peer = message.peer_id;
        if (peer != null) {
            if (peer.user_id == 0) {
                if (peer.chat_id != 0) {
                    if (message.from_id instanceof TLRPC.TL_peerUser) {
                    }
                    c10 = 2;
                } else {
                    TLRPC.Chat L0 = peer.channel_id != 0 ? getMessagesController().L0(Long.valueOf(message.peer_id.channel_id)) : null;
                    if (w3.T(L0) && L0.megagroup) {
                        if (message.from_id instanceof TLRPC.TL_peerUser) {
                        }
                        c10 = 2;
                    } else {
                        c10 = 3;
                    }
                }
                e = w0.e();
                if (e == 1) {
                    if (!this.N.g) {
                        return 0;
                    }
                    n10 = p();
                } else if (e == 2) {
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
                int i11 = iArr[c10];
                long max = i10 == 2 ? Math.max(524288L, jArr[x(i10)]) : jArr[x(i10)];
                t61Var = jjVar.b3;
                if (t61Var != null) {
                    q12 = t61Var.g.size;
                } else {
                    t61 t61Var2 = jjVar.c3;
                    q12 = t61Var2 != null ? t61Var2.g.size : jj.q1(jj.o1(message));
                }
                return (L4 || !n10.c || q12 <= max || max <= 2097152) ? ((i10 != 1 || (q12 != 0 && q12 <= max)) && (i10 == 2 || (i11 & i10) != 0)) ? 1 : 0 : (i11 & i10) != 0 ? 2 : 0;
            }
            c10 = 0;
            e = w0.e();
            if (e == 1) {
            }
            int[] iArr2 = n10.a;
            long[] jArr2 = n10.b;
            int i112 = iArr2[c10];
            if (i10 == 2) {
            }
            t61Var = jjVar.b3;
            if (t61Var != null) {
            }
            if (L4) {
            }
        }
        c10 = 1;
        e = w0.e();
        if (e == 1) {
        }
        int[] iArr22 = n10.a;
        long[] jArr22 = n10.b;
        int i1122 = iArr22[c10];
        if (i10 == 2) {
        }
        t61Var = jjVar.b3;
        if (t61Var != null) {
        }
        if (L4) {
        }
    }

    public final boolean f() {
        a6 n10;
        int e = w0.e();
        if (e == 1) {
            if (!this.N.g) {
                return false;
            }
            n10 = p();
        } else if (e == 2) {
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
        int i10;
        int m10 = m();
        if (m10 == this.a) {
            return;
        }
        this.a = m10;
        int i11 = m10 & 1;
        ArrayList arrayList = this.b;
        if (i11 == 0) {
            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                c6 c6Var = (c6) arrayList.get(i12);
                TLObject tLObject = c6Var.a;
                if (tLObject instanceof TLRPC.Photo) {
                    TLRPC.PhotoSize w9 = b8.w(((TLRPC.Photo) tLObject).sizes, i0.Z0(false), false, null, false);
                    b8 fileLoader = getFileLoader();
                    fileLoader.getClass();
                    fileLoader.e(null, null, null, w9.location, null, null);
                } else if (tLObject instanceof TLRPC.Document) {
                    getFileLoader().f((TLRPC.Document) c6Var.a);
                }
            }
            arrayList.clear();
        } else if (arrayList.isEmpty()) {
            t(1);
        }
        int i13 = m10 & 2;
        ArrayList arrayList2 = this.c;
        if (i13 == 0) {
            for (int i14 = 0; i14 < arrayList2.size(); i14++) {
                getFileLoader().f((TLRPC.Document) ((c6) arrayList2.get(i14)).a);
            }
            arrayList2.clear();
        } else if (arrayList2.isEmpty()) {
            t(2);
        }
        int i15 = m10 & 8;
        ArrayList arrayList3 = this.d;
        if (i15 == 0) {
            for (int i16 = 0; i16 < arrayList3.size(); i16++) {
                getFileLoader().f((TLRPC.Document) ((c6) arrayList3.get(i16)).a);
            }
            arrayList3.clear();
        } else if (arrayList3.isEmpty()) {
            t(8);
        }
        int i17 = m10 & 4;
        ArrayList arrayList4 = this.e;
        if (i17 == 0) {
            for (int i18 = 0; i18 < arrayList4.size(); i18++) {
                getFileLoader().f((TLRPC.Document) ((c6) arrayList4.get(i18)).a);
            }
            arrayList4.clear();
        } else if (arrayList4.isEmpty()) {
            t(4);
        }
        if (this.M.g || this.O.g || this.N.g) {
            i10 = 0;
            for (int i19 = 0; i19 < 4; i19++) {
                if ((n().a[i19] & 1) != 0 || (p().a[i19] & 1) != 0 || (o().a[i19] & 1) != 0) {
                    i10 |= 1;
                }
                if ((n().a[i19] & 2) != 0 || (p().a[i19] & 2) != 0 || (o().a[i19] & 2) != 0) {
                    i10 |= 2;
                }
                if ((n().a[i19] & 4) != 0 || (p().a[i19] & 4) != 0 || (o().a[i19] & 4) != 0) {
                    i10 |= 4;
                }
                if ((n().a[i19] & 8) != 0 || (p().a[i19] & 8) != 0 || (o().a[i19] & 8) != 0) {
                    i10 |= 8;
                }
            }
        } else {
            i10 = 0;
        }
        if (i10 == 0) {
            getMessagesStorage().r(0);
            return;
        }
        if ((i10 & 1) == 0) {
            getMessagesStorage().r(1);
        }
        if ((i10 & 2) == 0) {
            getMessagesStorage().r(2);
        }
        if ((i10 & 4) == 0) {
            getMessagesStorage().r(4);
        }
        if ((i10 & 8) == 0) {
            getMessagesStorage().r(8);
        }
    }

    public final void h(int i10, String str) {
        HashMap hashMap = this.f;
        c6 c6Var = (c6) hashMap.get(str);
        if (c6Var != null) {
            hashMap.remove(str);
            this.h.remove(new Pair(Long.valueOf(c6Var.c), Integer.valueOf(c6Var.b)));
            if (i10 == 0 || i10 == 2) {
                hs messagesStorage = getMessagesStorage();
                long j10 = c6Var.c;
                messagesStorage.a.c(new gq(messagesStorage, c6Var.b, j10, 6));
            }
            int i11 = c6Var.b;
            if (i11 == 1) {
                ArrayList arrayList = this.b;
                arrayList.remove(c6Var);
                if (arrayList.isEmpty()) {
                    t(1);
                    return;
                }
                return;
            }
            if (i11 == 2) {
                ArrayList arrayList2 = this.c;
                arrayList2.remove(c6Var);
                if (arrayList2.isEmpty()) {
                    t(2);
                    return;
                }
                return;
            }
            if (i11 == 4) {
                ArrayList arrayList3 = this.e;
                arrayList3.remove(c6Var);
                if (arrayList3.isEmpty()) {
                    t(4);
                    return;
                }
                return;
            }
            if (i11 == 8) {
                ArrayList arrayList4 = this.d;
                arrayList4.remove(c6Var);
                if (arrayList4.isEmpty()) {
                    t(8);
                }
            }
        }
    }

    public final void i(int i10, long j10) {
        SparseArray sparseArray = this.I;
        jj jjVar = (jj) sparseArray.get(i10);
        if (jjVar == null || jj.B0(jjVar.k) != j10) {
            return;
        }
        sparseArray.remove(i10);
        if (sparseArray.size() == 0) {
            getNotificationCenter().k(zs.b5, new Object[0]);
        }
    }

    public final void j(ArrayList arrayList) {
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            int i11 = 0;
            while (true) {
                ArrayList arrayList2 = this.H;
                if (i11 >= arrayList2.size()) {
                    int i12 = 0;
                    while (true) {
                        ArrayList arrayList3 = this.G;
                        if (i12 >= arrayList3.size()) {
                            break;
                        }
                        if (((jj) arrayList.get(i10)).f1() == ((jj) arrayList3.get(i12)).f1() && jj.B0(((jj) arrayList3.get(i12)).k) == jj.B0(((jj) arrayList.get(i10)).k)) {
                            arrayList3.remove(i12);
                            break;
                        }
                        i12++;
                    }
                } else {
                    if (((jj) arrayList.get(i10)).f1() == ((jj) arrayList2.get(i11)).f1() && jj.B0(((jj) arrayList2.get(i11)).k) == jj.B0(((jj) arrayList.get(i10)).k)) {
                        arrayList2.remove(i11);
                        break;
                    }
                    i11++;
                }
            }
            ((jj) arrayList.get(i10)).P = false;
            b8.G(this.currentAccount).X(((jj) arrayList.get(i10)).F0(), arrayList.get(i10), 0, 0);
            b8.G(this.currentAccount).f(((jj) arrayList.get(i10)).F0());
        }
        getNotificationCenter().k(zs.b5, new Object[0]);
        getMessagesStorage().a.c(new e4(3, this, arrayList));
    }

    public final int k() {
        int i10 = this.D;
        this.D = i10 + 1;
        return i10;
    }

    public final int l() {
        int[] iArr;
        int e = w0.e();
        if (e == 1) {
            if (!this.N.g) {
                return 0;
            }
            iArr = p().a;
        } else if (e == 2) {
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
        int i10 = 0;
        for (int i11 = 0; i11 < iArr.length; i11++) {
            int i12 = iArr[i11];
            int i13 = (i12 & 1) != 0 ? 1 : 0;
            if ((i12 & 2) != 0) {
                i13 |= 2;
            }
            if ((i12 & 4) != 0) {
                i13 |= 4;
            }
            if ((i12 & 8) != 0) {
                i13 |= 8;
            }
            i10 |= i13 << (i11 * 8);
        }
        return i10;
    }

    public final int m() {
        int e = w0.e();
        int i10 = 0;
        if (e == 1) {
            if (!this.N.g) {
                return 0;
            }
            int i11 = 0;
            while (i10 < 4) {
                i11 |= p().a[i10];
                i10++;
            }
            return i11;
        }
        if (e == 2) {
            if (!this.O.g) {
                return 0;
            }
            int i12 = 0;
            while (i10 < 4) {
                i12 |= o().a[i10];
                i10++;
            }
            return i12;
        }
        if (!this.M.g) {
            return 0;
        }
        int i13 = 0;
        while (i10 < 4) {
            i13 |= n().a[i10];
            i10++;
        }
        return i13;
    }

    public final a6 n() {
        int i10 = this.P;
        return i10 == 0 ? this.J : i10 == 1 ? this.K : i10 == 2 ? this.L : this.M;
    }

    public final a6 o() {
        int i10 = this.R;
        return i10 == 0 ? this.J : i10 == 1 ? this.K : i10 == 2 ? this.L : this.O;
    }

    public final a6 p() {
        int i10 = this.Q;
        return i10 == 0 ? this.J : i10 == 1 ? this.K : i10 == 2 ? this.L : this.N;
    }

    public final void s(boolean z10) {
        if (this.E) {
            return;
        }
        if (z10 || Math.abs(System.currentTimeMillis() - getUserConfig().a0) >= 86400000) {
            this.E = true;
            getConnectionsManager().sendRequest(new TL_account.getAutoDownloadSettings(), new v1(this, 1));
        }
    }

    public final void t(int i10) {
        int m10 = m();
        if ((m10 & 1) != 0 && (i10 & 1) != 0 && this.b.isEmpty()) {
            hs messagesStorage = getMessagesStorage();
            messagesStorage.a.c(new yp(messagesStorage, 1, 6));
        }
        if ((m10 & 2) != 0 && (i10 & 2) != 0 && this.c.isEmpty()) {
            hs messagesStorage2 = getMessagesStorage();
            messagesStorage2.a.c(new yp(messagesStorage2, 2, 6));
        }
        if ((m10 & 4) != 0 && (i10 & 4) != 0 && this.e.isEmpty()) {
            hs messagesStorage3 = getMessagesStorage();
            messagesStorage3.a.c(new yp(messagesStorage3, 4, 6));
        }
        int i11 = 8;
        if ((m10 & 8) == 0 || (i10 & 8) == 0 || !this.d.isEmpty()) {
            return;
        }
        hs messagesStorage4 = getMessagesStorage();
        messagesStorage4.a.c(new yp(messagesStorage4, i11, 6));
    }

    public final void u() {
        HashMap hashMap = this.x;
        for (Map.Entry entry : hashMap.entrySet()) {
            a((String) entry.getKey(), null, (z5) entry.getValue());
        }
        hashMap.clear();
        ArrayList arrayList = this.y;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            v((z5) obj);
        }
        arrayList.clear();
    }

    public final void v(z5 z5Var) {
        if (this.w) {
            this.y.add(z5Var);
            return;
        }
        int observerTag = z5Var.getObserverTag();
        SparseArray sparseArray = this.s;
        String str = (String) sparseArray.get(observerTag);
        if (str != null) {
            HashMap hashMap = this.n;
            ArrayList arrayList = (ArrayList) hashMap.get(str);
            if (arrayList != null) {
                int i10 = 0;
                while (i10 < arrayList.size()) {
                    WeakReference weakReference = (WeakReference) arrayList.get(i10);
                    if (weakReference.get() == null || weakReference.get() == z5Var) {
                        arrayList.remove(i10);
                        i10--;
                    }
                    i10++;
                }
                if (arrayList.isEmpty()) {
                    hashMap.remove(str);
                }
            }
            sparseArray.remove(z5Var.getObserverTag());
        }
    }

    public final void w(int i10) {
        a6 o10;
        boolean z10;
        TL_account.saveAutoDownloadSettings saveautodownloadsettings = new TL_account.saveAutoDownloadSettings();
        if (i10 == 0) {
            o10 = n();
            z10 = this.M.g;
        } else if (i10 == 1) {
            o10 = p();
            z10 = this.N.g;
        } else {
            o10 = o();
            z10 = this.O.g;
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
        int i11 = 0;
        boolean z12 = false;
        boolean z13 = false;
        boolean z14 = false;
        while (true) {
            int[] iArr = o10.a;
            if (i11 >= iArr.length) {
                break;
            }
            int i12 = iArr[i11];
            if ((i12 & 1) != 0) {
                z12 = true;
            }
            if ((i12 & 4) != 0) {
                z13 = true;
            }
            if ((i12 & 8) != 0) {
                z14 = true;
            }
            if (z12 && z13 && z14) {
                break;
            } else {
                i11++;
            }
        }
        TLRPC.TL_autoDownloadSettings tL_autoDownloadSettings2 = saveautodownloadsettings.settings;
        tL_autoDownloadSettings2.photo_size_max = z12 ? (int) jArr[0] : 0;
        tL_autoDownloadSettings2.video_size_max = z13 ? jArr[1] : 0L;
        tL_autoDownloadSettings2.file_size_max = z14 ? jArr[2] : 0L;
        getConnectionsManager().sendRequest(saveautodownloadsettings, new ag.c3(4));
    }

    public final void y() {
        ArrayList arrayList = this.G;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (getFileLoader().T(((jj) arrayList.get(size)).S0())) {
                getFileLoader().X(((jj) arrayList.get(size)).F0(), arrayList.get(size), 2, 0);
            }
        }
    }
}
