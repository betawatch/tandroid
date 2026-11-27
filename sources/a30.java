// default package

import android.content.Context;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.media.AudioDeviceInfo;
import android.text.TextUtils;
import android.util.LongSparseArray;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.web.BotWebViewContainer$BotWebViewProxy;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class a30 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ a30(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    private final void a() {
        boolean z;
        g01 g01Var = (g01) this.b;
        Runnable runnable = (Runnable) this.c;
        synchronized (g01Var.g) {
            z = g01Var.h;
        }
        if (z) {
            return;
        }
        runnable.run();
    }

    /* JADX WARN: Removed duplicated region for block: B:129:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:155:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00dd A[LOOP:3: B:44:0x00db->B:45:0x00dd, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x019d A[LOOP:7: B:89:0x019b->B:90:0x019d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01be  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        vz vzVar;
        int i;
        int i2;
        rv0 rv0Var;
        uu0 uu0Var;
        TL_bots.BotInfo botInfo;
        TL_bots.botAppSettings botappsettings;
        int size;
        int i3;
        Iterator it;
        int size2;
        int i4;
        int size3;
        int i5;
        xz0 xz0Var;
        int size4;
        int i6;
        int size5;
        int i7;
        int size6;
        Iterator it2;
        int i8;
        HashMap hashMap;
        boolean z;
        int i9 = 0;
        boolean z2 = true;
        switch (this.a) {
            case 0:
                i30 i30Var = (i30) this.b;
                File file = (File) this.c;
                synchronized (i30Var.m) {
                    while (true) {
                        int size7 = i30Var.m.size();
                        ArrayList arrayList = i30Var.m;
                        if (i9 < size7) {
                            File file2 = (File) arrayList.get(i9);
                            if ((file == null || !file.equals(file2)) && file2.exists() && !file2.delete()) {
                                i30Var.h.b("temporary file deletion failed: " + file2.getName());
                            }
                            i9++;
                        } else {
                            arrayList.clear();
                        }
                    }
                }
                return;
            case 1:
                lh2 lh2Var = (lh2) this.b;
                String str = (String) this.c;
                p30 p30Var = (p30) lh2Var.c;
                String str2 = gcc.a;
                ea3 ea3Var = ((n64) p30Var).a.s;
                uj U = ea3Var.U();
                ea3Var.V(U, 1012, new aa3(U, str, (byte) 29));
                return;
            case 2:
                lh2 lh2Var2 = (lh2) this.b;
                pk2 pk2Var = (pk2) this.c;
                p30 p30Var2 = (p30) lh2Var2.c;
                String str3 = gcc.a;
                ((n64) p30Var2).a.F.H(pk2Var);
                return;
            case 3:
                g40 g40Var = (g40) this.b;
                AudioDeviceInfo audioDeviceInfo = (AudioDeviceInfo) this.c;
                if (g40Var.d == null || (vzVar = ((n40) g40Var.b.b).h) == null || audioDeviceInfo.equals((AudioDeviceInfo) vzVar.s)) {
                    return;
                }
                vzVar.s = audioDeviceInfo;
                Context context = (Context) vzVar.b;
                oz ozVar = (oz) vzVar.w;
                List j = vzVar.j();
                j99 j99Var = sz.e;
                vzVar.k(sz.b(context, context.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")), ozVar, audioDeviceInfo, j));
                return;
            case 4:
                p1 p1Var = (p1) this.b;
                ArrayList arrayList2 = (ArrayList) this.c;
                x60 x60Var = (x60) p1Var.b;
                if (arrayList2.isEmpty()) {
                    return;
                }
                for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                    x60Var.getMessagesController().V4(x60Var.Y() * 60, ((Long) arrayList2.get(i10)).longValue());
                }
                if (x60Var.Y() > 0) {
                    c00.v(ob6.a0("AutodeleteTimerEnabledForChats", null, 2131753771, ob6.c0(x60Var.Y() * 60), ob6.G(arrayList2.size(), "Chats", Integer.valueOf(arrayList2.size()))), d31.b0(x60Var), R.raw.fire_on, 36);
                    return;
                } else {
                    d31.b0(x60Var).Q(R.raw.fire_off, 36, ob6.a0("AutodeleteTimerDisabledForChats", null, 2131753772, ob6.G(arrayList2.size(), "Chats", Integer.valueOf(arrayList2.size())))).j();
                    return;
                }
            case 5:
                lo loVar = (lo) this.b;
                Object apply = ((m64) this.c).apply(loVar.f);
                loVar.f = apply;
                zd0 zd0Var = new zd0(loVar, apply, (byte) 1);
                xgb xgbVar = (xgb) loVar.c;
                if (xgbVar.a.getLooper().getThread().isAlive()) {
                    xgbVar.e(zd0Var);
                    return;
                }
                return;
            case 6:
                ph0 ph0Var = (ph0) this.b;
                File file3 = (File) this.c;
                if (file3 == null) {
                    ph0Var.j = false;
                    jn7.e().k(jn7.T4, new Object[0]);
                    return;
                }
                if (!TextUtils.isEmpty(ph0Var.d)) {
                    try {
                        new File(ph0Var.d).delete();
                    } catch (Exception e) {
                        cc4.g(e, true);
                    }
                }
                ph0Var.d = file3.getAbsolutePath();
                ph0Var.f();
                ph0Var.k = 1.0f;
                ph0Var.j = false;
                jn7.e().k(jn7.T4, new Object[0]);
                return;
            case 7:
                pj0 pj0Var = (pj0) this.b;
                TLObject tLObject = (TLObject) this.c;
                int i11 = pj0Var.a;
                if (tLObject instanceof TL_account.contactBirthdays) {
                    pj0Var.b = System.currentTimeMillis();
                    TL_account.contactBirthdays contactbirthdays = (TL_account.contactBirthdays) tLObject;
                    pj0Var.c = nj0.b(contactbirthdays);
                    uc7.s1(i11).j4(contactbirthdays.users, false);
                    jf7.Y(i11).j1(contactbirthdays.users, null, true, true);
                    SharedPreferences.Editor edit = uc7.s1(i11).X3.edit();
                    edit.putLong("bday_check", pj0Var.b);
                    oj0 oj0Var = new oj0();
                    oj0Var.a = contactbirthdays.contacts;
                    SerializedData serializedData = new SerializedData(oj0Var.getObjectSize());
                    oj0Var.serializeToStream(serializedData);
                    edit.putString("bday_contacts", Utilities.f(serializedData.toByteArray()));
                    edit.apply();
                    jn7.f(i11).k(jn7.j5, new Object[0]);
                    pj0Var.e = false;
                    return;
                }
                return;
            case 8:
                jf7 jf7Var = (jf7) this.b;
                pcc pccVar = (pcc) this.c;
                HashMap f0 = jf7Var.f0();
                if (f0.isEmpty()) {
                    return;
                }
                hl.c3(new zf(pccVar, f0, (byte) 1));
                return;
            case 9:
                ((q2a) this.b).a((ArrayList) this.c);
                return;
            case 10:
                ((tn0) this.b).a((TLRPC.TL_error) this.c);
                return;
            case 11:
                ((v35) this.b).a((ArrayList) this.c);
                return;
            case 12:
                v21 I = d31.b0((zu1) this.b).I(R.raw.stars_send, ob6.M0(2131744749, null), hl.S2(ob6.H(',', "StarsGiveawaySentPopupInfo", (int) ((TL_stars.TL_starsGiveawayOption) this.c).stars)));
                I.j = 5000;
                I.k(true);
                return;
            case 13:
                jn7.f(yac.t0).k(jn7.X2, ((ao0) this.b).W1, Boolean.TRUE, (TL_stories.PrepaidGiveaway) this.c);
                return;
            case 14:
                lo0 lo0Var = (lo0) this.b;
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) this.c;
                lo0Var.U = tL_premium_boostsStatus;
                if (tL_premium_boostsStatus != null) {
                    lo0Var.getMessagesController().G0().b(lo0Var.S, lo0Var.U, new co0(lo0Var, (byte) 0));
                }
                lo0Var.i0.animate().cancel();
                lo0Var.i0.animate().alpha(0.0f).setDuration(100L).setStartDelay(0L).setListener(new h0(lo0Var, (byte) 21));
                lo0Var.I0(true);
                lo0Var.J0(true);
                lo0Var.H0(null);
                return;
            case 15:
                kr0 kr0Var = (kr0) this.b;
                String str4 = (String) this.c;
                ArrayList arrayList3 = kr0Var.f;
                int i12 = 0;
                while (true) {
                    if (i12 >= arrayList3.size()) {
                        i12 = -1;
                    } else if (!TextUtils.equals(((o5b) arrayList3.get(i12)).E, str4)) {
                        i12++;
                    }
                }
                if (i12 >= 0) {
                    kr0Var.r.e(str4.hashCode(), i12 + 1);
                    return;
                }
                return;
            case 16:
                ht0 ht0Var = (ht0) this.b;
                TLObject tLObject2 = (TLObject) this.c;
                int i13 = ht0Var.a;
                ArrayList arrayList4 = ht0Var.e;
                ht0Var.i = 0;
                if (tLObject2 instanceof TL_payments.connectedStarRefBots) {
                    TL_payments.connectedStarRefBots connectedstarrefbots = (TL_payments.connectedStarRefBots) tLObject2;
                    uc7.s1(i13).j4(connectedstarrefbots.users, false);
                    if (ht0Var.c <= 0) {
                        arrayList4.clear();
                    }
                    ht0Var.c = connectedstarrefbots.count;
                    arrayList4.addAll(connectedstarrefbots.connected_bots);
                    ht0Var.d = connectedstarrefbots.connected_bots.isEmpty() || arrayList4.size() >= ht0Var.c;
                    i = 1;
                } else {
                    i = 1;
                    ht0Var.h = true;
                    ht0Var.d = true;
                }
                ht0Var.g = false;
                jn7 f = jn7.f(i13);
                Object[] objArr = new Object[i];
                objArr[0] = Long.valueOf(ht0Var.b);
                f.k(jn7.O3, objArr);
                return;
            case 17:
                it0 it0Var = (it0) this.b;
                TLObject tLObject3 = (TLObject) this.c;
                int i14 = it0Var.a;
                ArrayList arrayList5 = it0Var.e;
                if (tLObject3 instanceof TL_payments.suggestedStarRefBots) {
                    TL_payments.suggestedStarRefBots suggestedstarrefbots = (TL_payments.suggestedStarRefBots) tLObject3;
                    uc7.s1(i14).j4(suggestedstarrefbots.users, false);
                    if (it0Var.c <= 0) {
                        arrayList5.clear();
                    }
                    it0Var.c = suggestedstarrefbots.count;
                    arrayList5.addAll(suggestedstarrefbots.suggested_bots);
                    it0Var.j = suggestedstarrefbots.next_offset;
                    it0Var.d = suggestedstarrefbots.suggested_bots.isEmpty() || arrayList5.size() >= it0Var.c;
                    i2 = 1;
                } else {
                    i2 = 1;
                    it0Var.i = true;
                    it0Var.d = true;
                }
                it0Var.h = false;
                jn7 f2 = jn7.f(i14);
                Object[] objArr2 = new Object[i2];
                objArr2[0] = Long.valueOf(it0Var.b);
                f2.k(jn7.N3, objArr2);
                return;
            case 18:
                rv0 rv0Var2 = (rv0) this.b;
                pv0 pv0Var = (pv0) this.c;
                uo0 uo0Var = rv0Var2.k0;
                uo0Var.f = true;
                uo0Var.i();
                rv0Var2.s(pv0Var);
                return;
            case 19:
                BotWebViewContainer$BotWebViewProxy botWebViewContainer$BotWebViewProxy = (BotWebViewContainer$BotWebViewProxy) this.b;
                ArrayList arrayList6 = (ArrayList) this.c;
                if (botWebViewContainer$BotWebViewProxy == null || (rv0Var = botWebViewContainer$BotWebViewProxy.a) == null || (uu0Var = rv0Var.c) == null) {
                    return;
                }
                uu0Var.f(arrayList6);
                return;
            case 20:
                xw0 xw0Var = (xw0) this.b;
                TLRPC.UserFull userFull = (TLRPC.UserFull) this.c;
                if (userFull == null || (botInfo = userFull.bot_info) == null || (botappsettings = botInfo.app_settings) == null) {
                    return;
                }
                xw0Var.g(botappsettings, true);
                return;
            case 21:
                xw0 xw0Var2 = (xw0) this.b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.c;
                if (xw0Var2.e0) {
                    return;
                }
                if (tL_error != null) {
                    xw0Var2.m(false);
                    return;
                } else {
                    hl.d3(xw0Var2.v0, 60000L);
                    return;
                }
            case 22:
                xw0 xw0Var3 = (xw0) this.b;
                v21 Q = new d31(xw0Var3.r0, xw0Var3.G).Q(R.raw.contact_check, 36, hl.S2((String) this.c));
                Q.j = 5000;
                Q.k(true);
                return;
            case 23:
                xz0 xz0Var2 = (xz0) this.b;
                nz0 nz0Var = (nz0) this.c;
                if (xz0Var2.d.get(Long.valueOf(nz0Var.a)) == nz0Var && nz0Var.h == null && xz0Var2.c == 2) {
                    xz0Var2.p(nz0Var);
                    return;
                }
                return;
            case 24:
                xz0 xz0Var3 = (xz0) this.b;
                sz0 sz0Var = (sz0) this.c;
                if (xz0Var3.P.contains(sz0Var)) {
                    xz0Var3.q(sz0Var);
                    return;
                }
                return;
            case 25:
                g01 g01Var = (g01) this.b;
                ArrayList arrayList7 = (ArrayList) this.c;
                e01 e01Var = g01Var.i;
                e01Var.getClass();
                ArrayList arrayList8 = new ArrayList(arrayList7);
                Collections.sort(arrayList8, new ta((byte) 10));
                HashSet hashSet = new HashSet();
                int size8 = arrayList8.size();
                int i15 = 0;
                while (i15 < size8) {
                    Object obj = arrayList8.get(i15);
                    i15++;
                    uz0 uz0Var = (uz0) obj;
                    if (hashSet.size() >= 4) {
                        HashSet hashSet2 = new HashSet();
                        size = arrayList7.size();
                        i3 = 0;
                        while (i3 < size) {
                            Object obj2 = arrayList7.get(i3);
                            i3++;
                            hashSet2.add(((uz0) obj2).a);
                        }
                        it = hashSet.iterator();
                        while (it.hasNext()) {
                            String str5 = (String) it.next();
                            if (!e01Var.d.contains(str5)) {
                                Long l = (Long) e01Var.g.get(str5);
                                e01Var.i.put(str5, Long.valueOf(l != null ? l.longValue() + 1 : Long.MIN_VALUE));
                                e01Var.j.remove(str5);
                            }
                        }
                        e01Var.d = hashSet;
                        ArrayList arrayList9 = new ArrayList(e01Var.b.keySet());
                        size2 = arrayList9.size();
                        i4 = 0;
                        while (i4 < size2) {
                            Object obj3 = arrayList9.get(i4);
                            i4++;
                            String str6 = (String) obj3;
                            if (!hashSet.contains(str6)) {
                                boolean contains = hashSet2.contains(str6);
                                HashSet hashSet3 = e01Var.j;
                                if (contains) {
                                    hashSet3.add(str6);
                                } else {
                                    hashSet3.remove(str6);
                                    e01Var.h.remove(str6);
                                    e01Var.i.remove(str6);
                                    e01Var.e(str6);
                                }
                            }
                        }
                        ArrayList arrayList10 = new ArrayList(e01Var.g.keySet());
                        size3 = arrayList10.size();
                        i5 = 0;
                        while (i5 < size3) {
                            Object obj4 = arrayList10.get(i5);
                            i5++;
                            String str7 = (String) obj4;
                            if (!hashSet2.contains(str7)) {
                                e01Var.g.remove(str7);
                            }
                        }
                        xz0Var = g01Var.d;
                        ArrayList arrayList11 = xz0Var.P;
                        HashMap hashMap2 = new HashMap();
                        ArrayList arrayList12 = xz0Var.H;
                        size4 = arrayList12.size();
                        i6 = 0;
                        while (i6 < size4) {
                            Object obj5 = arrayList12.get(i6);
                            i6++;
                            uz0 uz0Var2 = (uz0) obj5;
                            hashMap2.put(uz0Var2.a, Integer.valueOf(uz0Var2.b));
                        }
                        arrayList12.clear();
                        arrayList12.addAll(arrayList7);
                        size5 = arrayList12.size();
                        i7 = 0;
                        while (i7 < size5) {
                            Object obj6 = arrayList12.get(i7);
                            i7++;
                            uz0 uz0Var3 = (uz0) obj6;
                            Integer num = (Integer) hashMap2.get(uz0Var3.a);
                            if (num != null && uz0Var3.b > num.intValue()) {
                                String str8 = uz0Var3.a;
                                mz0 mz0Var = xz0Var.a;
                                int indexOf = arrayList12.indexOf(xz0Var.l(str8));
                                if (indexOf >= 0) {
                                    int i16 = xz0Var.h()[indexOf];
                                    ArrayList arrayList13 = new ArrayList();
                                    rz0 rz0Var = xz0Var.L;
                                    if (rz0Var != null && rz0Var.b > mz0Var.h()) {
                                        arrayList13.add((tz0) xz0Var.L.e);
                                    }
                                    arrayList13.addAll(xz0Var.G);
                                    int size9 = arrayList13.size();
                                    int i17 = i9;
                                    while (i17 < size9) {
                                        Object obj7 = arrayList13.get(i17);
                                        i17++;
                                        tz0 tz0Var = (tz0) obj7;
                                        ArrayList arrayList14 = tz0Var.f;
                                        boolean z3 = z2;
                                        int size10 = arrayList14.size();
                                        int i18 = 0;
                                        while (i18 < size10) {
                                            Object obj8 = arrayList14.get(i18);
                                            i18++;
                                            int i19 = size5;
                                            wz0 wz0Var = (wz0) obj8;
                                            HashMap hashMap3 = hashMap2;
                                            if (wz0Var.a.equals(str8) && wz0Var.c < i16) {
                                                sz0 sz0Var2 = new sz0(tz0Var, str8, wz0Var.b, i16);
                                                arrayList11.add(sz0Var2);
                                                xz0Var.q(sz0Var2);
                                            }
                                            size5 = i19;
                                            hashMap2 = hashMap3;
                                        }
                                        z2 = z3;
                                    }
                                    i8 = size5;
                                    hashMap = hashMap2;
                                    z = z2;
                                    StringBuilder p = ik8.p("ceiling raised for ", str8, ": re-fetching ");
                                    p.append(arrayList11.size());
                                    p.append(" parts at q");
                                    p.append(i16);
                                    mz0Var.c(p.toString());
                                    size5 = i8;
                                    z2 = z;
                                    hashMap2 = hashMap;
                                    i9 = 0;
                                }
                            }
                            i8 = size5;
                            hashMap = hashMap2;
                            z = z2;
                            size5 = i8;
                            z2 = z;
                            hashMap2 = hashMap;
                            i9 = 0;
                        }
                        for (size6 = arrayList11.size() - 1; size6 >= 0; size6--) {
                            if (xz0Var.l(((sz0) arrayList11.get(size6)).b) == null) {
                                xz0Var.f((sz0) arrayList11.remove(size6));
                            }
                        }
                        it2 = xz0Var.d.values().iterator();
                        while (it2.hasNext()) {
                            Iterator it3 = ((nz0) it2.next()).k.entrySet().iterator();
                            while (it3.hasNext()) {
                                vz0 vz0Var = (vz0) ((Map.Entry) it3.next()).getValue();
                                if (xz0Var.l(vz0Var.a) == null) {
                                    xz0Var.g(vz0Var);
                                    it3.remove();
                                }
                            }
                        }
                        if (xz0Var.c != 2) {
                            xz0Var.j();
                            xz0Var.w();
                            return;
                        }
                        return;
                    }
                    if (uz0Var.b >= 1 && !e01Var.c.contains(uz0Var.a)) {
                        hashSet.add(uz0Var.a);
                    }
                }
                HashSet hashSet22 = new HashSet();
                size = arrayList7.size();
                i3 = 0;
                while (i3 < size) {
                }
                it = hashSet.iterator();
                while (it.hasNext()) {
                }
                e01Var.d = hashSet;
                ArrayList arrayList92 = new ArrayList(e01Var.b.keySet());
                size2 = arrayList92.size();
                i4 = 0;
                while (i4 < size2) {
                }
                ArrayList arrayList102 = new ArrayList(e01Var.g.keySet());
                size3 = arrayList102.size();
                i5 = 0;
                while (i5 < size3) {
                }
                xz0Var = g01Var.d;
                ArrayList arrayList112 = xz0Var.P;
                HashMap hashMap22 = new HashMap();
                ArrayList arrayList122 = xz0Var.H;
                size4 = arrayList122.size();
                i6 = 0;
                while (i6 < size4) {
                }
                arrayList122.clear();
                arrayList122.addAll(arrayList7);
                size5 = arrayList122.size();
                i7 = 0;
                while (i7 < size5) {
                }
                while (size6 >= 0) {
                }
                it2 = xz0Var.d.values().iterator();
                while (it2.hasNext()) {
                }
                if (xz0Var.c != 2) {
                }
                break;
            case 26:
                a();
                return;
            case 27:
                ((pz0) this.b).b((oz0) this.c);
                return;
            case 28:
                ArrayList arrayList15 = (ArrayList) this.b;
                LongSparseArray longSparseArray = (LongSparseArray) this.c;
                ptd.c.addAll(0, arrayList15);
                for (int i20 = 0; i20 < longSparseArray.size(); i20++) {
                    ptd.d.put(longSparseArray.keyAt(i20), (n01) longSparseArray.valueAt(i20));
                }
                ptd.b = true;
                ptd.a = false;
                ArrayList arrayList16 = ptd.e;
                if (arrayList16 != null) {
                    int size11 = arrayList16.size();
                    while (i9 < size11) {
                        Object obj9 = arrayList16.get(i9);
                        i9++;
                        ((pcc) obj9).a(arrayList15);
                    }
                    ptd.e = null;
                    return;
                }
                return;
            default:
                v21 v21Var = (v21) this.b;
                CharSequence charSequence = (CharSequence) this.c;
                v21Var.o = true;
                z11 z11Var = v21Var.e;
                if (z11Var instanceof a21) {
                    a21 a21Var = (a21) z11Var;
                    a21Var.b.setText(charSequence);
                    hl.P3(a21Var.d, false, false);
                    hl.P3(a21Var.b, true, false);
                }
                v21Var.i(true);
                return;
        }
    }
}
