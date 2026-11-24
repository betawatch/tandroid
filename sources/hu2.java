// default package

import android.text.TextUtils;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.File;
import java.io.Serializable;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.NotificationsCustomSettingsActivity;
import org.telegram.ui.NotificationsSettingsActivity;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class hu2 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ byte b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Serializable e;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ hu2(Object obj, Object obj2, int i, Serializable serializable, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.b = i;
        this.e = serializable;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x004f  */
    /* JADX WARN: Type inference failed for: r1v19, types: [a46] */
    /* JADX WARN: Type inference failed for: r6v2, types: [j$.util.concurrent.ConcurrentHashMap] */
    /* JADX WARN: Type inference failed for: r7v6, types: [go3] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        ArrayList arrayList;
        ArrayList arrayList2;
        switch (this.a) {
            case 0:
                final qu2 qu2Var = (qu2) this.c;
                final ArrayList arrayList3 = (ArrayList) this.d;
                final byte b = this.b;
                final ArrayList arrayList4 = (ArrayList) this.e;
                qu2Var.getMessagesController().a4(arrayList3, b == 1);
                final vf6 vf6Var = new vf6();
                final boolean isEmpty = arrayList4.isEmpty();
                if (b == 2 && !qu2Var.f0.isEmpty()) {
                    int i = 0;
                    while (i < arrayList4.size()) {
                        if (qu2Var.g0.get(Long.valueOf(((TLRPC.TL_contact) arrayList4.get(i)).user_id)) != null) {
                            arrayList4.remove(i);
                            i--;
                        }
                        i++;
                    }
                    arrayList4.addAll(qu2Var.f0);
                }
                for (int i2 = 0; i2 < arrayList4.size(); i2++) {
                    TLRPC.User V1 = qu2Var.getMessagesController().V1(Long.valueOf(((TLRPC.TL_contact) arrayList4.get(i2)).user_id));
                    if (V1 != null) {
                        vf6Var.k(V1, V1.id);
                    }
                }
                Utilities.d.c(new Runnable() { // from class: iu2
                    @Override // java.lang.Runnable
                    public final void run() {
                        long j;
                        HashMap hashMap;
                        HashMap hashMap2;
                        int i3;
                        ArrayList arrayList5;
                        int i4;
                        ConcurrentHashMap concurrentHashMap;
                        long j2;
                        long r;
                        final qu2 qu2Var2 = qu2.this;
                        ArrayList arrayList6 = qu2Var2.x;
                        if (w01.a) {
                            fa4.b("done loading contacts");
                        }
                        final byte b2 = b;
                        ArrayList arrayList7 = arrayList4;
                        long j3 = 1000;
                        int i5 = 0;
                        if (b2 != 1 || (!arrayList7.isEmpty() && Math.abs((System.currentTimeMillis() / 1000) - qu2Var2.getUserConfig().r) < 86400)) {
                            j = 1000;
                        } else {
                            ArrayList arrayList8 = new ArrayList(arrayList7);
                            Collections.sort(arrayList8, new sa((byte) 28));
                            int size = arrayList8.size();
                            long j4 = 0;
                            int i6 = -1;
                            while (i6 < size) {
                                if (i6 == -1) {
                                    j2 = j3;
                                    r = hq6.r(j4, qu2Var2.getUserConfig().h);
                                } else {
                                    j2 = j3;
                                    r = hq6.r(j4, ((TLRPC.TL_contact) arrayList8.get(i6)).user_id);
                                }
                                j4 = r;
                                i6++;
                                j3 = j2;
                            }
                            j = j3;
                            qu2Var2.A(j4, false);
                            if (arrayList7.isEmpty()) {
                                gl.d3(new wt2(qu2Var2, (byte) 9));
                                return;
                            }
                        }
                        if (b2 == 0) {
                            qu2Var2.getUserConfig().r = (int) (System.currentTimeMillis() / j);
                            qu2Var2.getUserConfig().u(false);
                        }
                        int i7 = 0;
                        final boolean z = false;
                        while (i7 < arrayList7.size()) {
                            TLRPC.TL_contact tL_contact = (TLRPC.TL_contact) arrayList7.get(i7);
                            if (na7.q1(qu2Var2.currentAccount).V1(Long.valueOf(tL_contact.user_id)) == null && tL_contact.user_id != qu2Var2.getUserConfig().e()) {
                                arrayList7.remove(i7);
                                i7--;
                                z = true;
                            }
                            i7++;
                        }
                        if (b2 != 1) {
                            qu2Var2.getMessagesStorage().j1(arrayList3, null, true, true);
                            qu2Var2.getMessagesStorage().Z0(arrayList7, b2 != 2);
                        }
                        Collator u = qu2.u();
                        vf6 vf6Var2 = vf6Var;
                        Collections.sort(arrayList7, new cu2(vf6Var2, u, (byte) 1));
                        ConcurrentHashMap concurrentHashMap2 = new ConcurrentHashMap(20, 1.0f, 2);
                        final HashMap hashMap3 = new HashMap();
                        final HashMap hashMap4 = new HashMap();
                        final ArrayList arrayList9 = new ArrayList();
                        final ArrayList arrayList10 = new ArrayList();
                        if (qu2Var2.r) {
                            hashMap = null;
                            hashMap2 = null;
                        } else {
                            hashMap2 = new HashMap();
                            hashMap = new HashMap();
                        }
                        while (i5 < arrayList7.size()) {
                            TLRPC.TL_contact tL_contact2 = (TLRPC.TL_contact) arrayList7.get(i5);
                            boolean z2 = z;
                            ArrayList arrayList11 = arrayList6;
                            TLRPC.User user = (TLRPC.User) vf6Var2.f(tL_contact2.user_id);
                            if (user == null) {
                                arrayList5 = arrayList7;
                                concurrentHashMap = concurrentHashMap2;
                                i3 = i5;
                            } else {
                                i3 = i5;
                                concurrentHashMap2.put(Long.valueOf(tL_contact2.user_id), tL_contact2);
                                if (hashMap2 == null || TextUtils.isEmpty(user.phone)) {
                                    arrayList5 = arrayList7;
                                    i4 = 0;
                                } else {
                                    hashMap2.put(user.phone, tL_contact2);
                                    arrayList5 = arrayList7;
                                    i4 = 0;
                                    hashMap.put(user.phone.substring(Math.max(0, r11.length() - 7)), tL_contact2);
                                }
                                String k = l7c.k(user, true);
                                concurrentHashMap = concurrentHashMap2;
                                if (k.length() > 1) {
                                    k = k.substring(i4, 1);
                                }
                                String upperCase = k.length() == 0 ? "#" : k.toUpperCase();
                                String str = (String) qu2Var2.F.get(upperCase);
                                if (str != null) {
                                    upperCase = str;
                                }
                                ArrayList arrayList12 = (ArrayList) hashMap3.get(upperCase);
                                if (arrayList12 == null) {
                                    arrayList12 = new ArrayList();
                                    hashMap3.put(upperCase, arrayList12);
                                    arrayList9.add(upperCase);
                                }
                                arrayList12.add(tL_contact2);
                                if (user.mutual_contact) {
                                    ArrayList arrayList13 = (ArrayList) hashMap4.get(upperCase);
                                    if (arrayList13 == null) {
                                        arrayList13 = new ArrayList();
                                        hashMap4.put(upperCase, arrayList13);
                                        arrayList10.add(upperCase);
                                    }
                                    arrayList13.add(tL_contact2);
                                }
                            }
                            i5 = i3 + 1;
                            arrayList6 = arrayList11;
                            z = z2;
                            arrayList7 = arrayList5;
                            concurrentHashMap2 = concurrentHashMap;
                        }
                        final ArrayList arrayList14 = arrayList7;
                        final ConcurrentHashMap concurrentHashMap3 = concurrentHashMap2;
                        ArrayList arrayList15 = arrayList6;
                        Collections.sort(arrayList9, new in0(u, (byte) 5));
                        Collections.sort(arrayList10, new in0(u, (byte) 6));
                        final boolean z3 = isEmpty;
                        gl.d3(new Runnable() { // from class: ju2
                            @Override // java.lang.Runnable
                            public final void run() {
                                qu2 qu2Var3 = qu2.this;
                                ArrayList arrayList16 = arrayList14;
                                ConcurrentHashMap concurrentHashMap4 = concurrentHashMap3;
                                HashMap hashMap5 = hashMap3;
                                HashMap hashMap6 = hashMap4;
                                ArrayList arrayList17 = arrayList9;
                                ArrayList arrayList18 = arrayList10;
                                byte b3 = b2;
                                boolean z4 = z3;
                                boolean z5 = z;
                                qu2Var3.f0 = arrayList16;
                                qu2Var3.g0 = concurrentHashMap4;
                                qu2Var3.h0 = hashMap5;
                                qu2Var3.j0 = hashMap6;
                                qu2Var3.i0 = arrayList17;
                                qu2Var3.k0 = arrayList18;
                                qu2Var3.n = true;
                                byte b4 = 0;
                                if (b3 != 2) {
                                    synchronized (qu2Var3.c) {
                                        qu2Var3.b = false;
                                    }
                                }
                                Utilities.h.c(new fu2(qu2Var3, new ArrayList(qu2Var3.f0), b4));
                                qu2Var3.N();
                                qu2Var3.getNotificationCenter().k(kk7.N, new Object[0]);
                                if (b3 == 1 || z4) {
                                    qu2Var3.J(false);
                                } else {
                                    qu2Var3.L();
                                }
                                if (z5) {
                                    qu2Var3.A(0L, false);
                                }
                            }
                        });
                        if (!arrayList15.isEmpty() && qu2Var2.h && qu2Var2.r) {
                            qu2Var2.c(arrayList15, null, null, null);
                            arrayList15.clear();
                        }
                        if (hashMap2 != null) {
                            gl.d3(new ku2(qu2Var2, hashMap2, hashMap, (byte) 0));
                        } else {
                            qu2Var2.h = true;
                        }
                    }
                });
                break;
            case 1:
                fl5 fl5Var = (fl5) this.c;
                String str = (String) this.d;
                byte b2 = this.b;
                File file = (File) this.e;
                ?? r6 = fl5Var.i;
                HashMap hashMap = fl5Var.g;
                HashMap hashMap2 = fl5Var.l;
                dl5 dl5Var = (dl5) hashMap2.get(str);
                if (dl5Var != null && dl5Var.a != null) {
                    fl5Var.r(b2, file, dl5Var);
                    hashMap2.remove(str);
                }
                tk5 tk5Var = (tk5) hashMap.get(str);
                if (tk5Var != null) {
                    ArrayList arrayList5 = tk5Var.v;
                    hashMap.remove(str);
                    fl5Var.h.remove(str);
                    ArrayList arrayList6 = new ArrayList();
                    for (int i3 = 0; i3 < arrayList5.size(); i3++) {
                        String str2 = (String) tk5Var.x.get(i3);
                        String str3 = (String) tk5Var.y.get(i3);
                        int intValue = ((Integer) tk5Var.z.get(i3)).intValue();
                        ImageReceiver imageReceiver = (ImageReceiver) arrayList5.get(i3);
                        int intValue2 = ((Integer) tk5Var.w.get(i3)).intValue();
                        tk5 tk5Var2 = (tk5) r6.get(str2);
                        if (tk5Var2 == null) {
                            tk5Var2 = new tk5(fl5Var);
                            tk5Var2.a = tk5Var.a;
                            tk5Var2.h = tk5Var.h;
                            tk5Var2.o = tk5Var.o;
                            tk5Var2.p = file;
                            tk5Var2.j = tk5Var.j;
                            tk5Var2.c = tk5Var.c;
                            tk5Var2.d = str2;
                            tk5Var2.n = tk5Var.n;
                            tk5Var2.i = tk5Var.i;
                            tk5Var2.m = intValue;
                            tk5Var2.g = tk5Var.g;
                            tk5Var2.r = tk5Var.r;
                            tk5Var2.u = new uk5(fl5Var, tk5Var2);
                            tk5Var2.f = str3;
                            tk5Var2.l = tk5Var.l;
                            r6.put(str2, tk5Var2);
                            fl5Var.j.add(fl5.j(str2));
                            arrayList6.add(tk5Var2.u);
                        }
                        tk5Var2.a(imageReceiver, str2, str3, intValue, intValue2);
                    }
                    for (int i4 = 0; i4 < arrayList6.size(); i4++) {
                        uk5 uk5Var = (uk5) arrayList6.get(i4);
                        tk5 tk5Var3 = uk5Var.c;
                        if (tk5Var3.m == 1) {
                            fl5Var.q.c(uk5Var);
                        } else {
                            yv2 yv2Var = fl5Var.p;
                            boolean z = tk5Var3.a;
                            if (!z) {
                                yv2Var.getClass();
                                uk5Var = new go3(z ? 1 : 0, uk5Var);
                            }
                            ((fo3) yv2Var.b).execute(uk5Var);
                        }
                    }
                    break;
                }
                break;
            default:
                ?? r1 = (a46) this.c;
                NotificationsSettingsActivity notificationsSettingsActivity = (NotificationsSettingsActivity) this.d;
                byte b3 = this.b;
                String str4 = (String) this.e;
                r1.c();
                ArrayList arrayList7 = null;
                if (b3 == 1) {
                    arrayList = notificationsSettingsActivity.d;
                } else if (b3 != 0) {
                    if (b3 == 4) {
                        arrayList2 = null;
                    } else if (b3 == 3) {
                        arrayList7 = notificationsSettingsActivity.h;
                        arrayList2 = notificationsSettingsActivity.n;
                    } else {
                        arrayList = notificationsSettingsActivity.f;
                    }
                    NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = new NotificationsCustomSettingsActivity(b3, arrayList7, arrayList2, false);
                    notificationsCustomSettingsActivity.H = true;
                    notificationsCustomSettingsActivity.p0(false);
                    r1.u(notificationsCustomSettingsActivity, false);
                    if ("show".equalsIgnoreCase(str4)) {
                        r1.x("showRow");
                    }
                    if ("new".equalsIgnoreCase(str4)) {
                        r1.x("newRow");
                    }
                    if ("important".equalsIgnoreCase(str4)) {
                        r1.x("importantRow");
                    }
                    if ("messages".equalsIgnoreCase(str4)) {
                        r1.x("messagesRow");
                    }
                    if ("stories".equalsIgnoreCase(str4)) {
                        r1.x("storiesRow");
                    }
                    if ("preview".equalsIgnoreCase(str4)) {
                        r1.x("previewRow");
                    }
                    if ("show-sender".equalsIgnoreCase(str4)) {
                        r1.x("showSenderRow");
                    }
                    if ("sound".equalsIgnoreCase(str4)) {
                        r1.x("soundRow");
                    }
                    if ("add-exception".equalsIgnoreCase(str4)) {
                        r1.x("addExceptionRow");
                    }
                    if ("delete-exceptions".equalsIgnoreCase(str4)) {
                        r1.x("deleteExceptionsRow");
                    }
                    if ("light-color".equalsIgnoreCase(str4)) {
                        r1.x("lightColorRow");
                    }
                    if ("vibrate".equalsIgnoreCase(str4)) {
                        r1.x("vibrateRow");
                    }
                    if ("popup".equalsIgnoreCase(str4)) {
                        r1.x("popupRow");
                    }
                    if (!"priority".equalsIgnoreCase(str4)) {
                        r1.x("priorityRow");
                        break;
                    }
                } else {
                    arrayList = notificationsSettingsActivity.e;
                }
                arrayList7 = arrayList;
                arrayList2 = null;
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity2 = new NotificationsCustomSettingsActivity(b3, arrayList7, arrayList2, false);
                notificationsCustomSettingsActivity2.H = true;
                notificationsCustomSettingsActivity2.p0(false);
                r1.u(notificationsCustomSettingsActivity2, false);
                if ("show".equalsIgnoreCase(str4)) {
                }
                if ("new".equalsIgnoreCase(str4)) {
                }
                if ("important".equalsIgnoreCase(str4)) {
                }
                if ("messages".equalsIgnoreCase(str4)) {
                }
                if ("stories".equalsIgnoreCase(str4)) {
                }
                if ("preview".equalsIgnoreCase(str4)) {
                }
                if ("show-sender".equalsIgnoreCase(str4)) {
                }
                if ("sound".equalsIgnoreCase(str4)) {
                }
                if ("add-exception".equalsIgnoreCase(str4)) {
                }
                if ("delete-exceptions".equalsIgnoreCase(str4)) {
                }
                if ("light-color".equalsIgnoreCase(str4)) {
                }
                if ("vibrate".equalsIgnoreCase(str4)) {
                }
                if ("popup".equalsIgnoreCase(str4)) {
                }
                if (!"priority".equalsIgnoreCase(str4)) {
                }
                break;
        }
    }
}
