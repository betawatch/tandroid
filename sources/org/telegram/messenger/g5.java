package org.telegram.messenger;

import android.accounts.Account;
import android.content.ContentProviderOperation;
import android.content.ContentProviderResult;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.net.Uri;
import android.provider.ContactsContract;
import android.text.TextUtils;
import android.util.SparseArray;
import j$.util.concurrent.ConcurrentHashMap;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final class g5 extends c1 {
    public static Locale n0;
    public static Collator o0;
    public static final String[] p0 = {"lookup", "data1", "data2", "data3", "display_name", "account_type"};
    public static final String[] q0 = {"lookup", "data2", "data3", "data5"};
    public static volatile g5[] r0 = new g5[4];
    public boolean D;
    public final HashMap E;
    public int F;
    public int G;
    public int H;
    public final int[] I;
    public ArrayList J;
    public ArrayList K;
    public ArrayList L;
    public ArrayList M;
    public ArrayList N;
    public ArrayList O;
    public ArrayList P;
    public ArrayList Q;
    public ArrayList R;
    public ArrayList S;
    public ArrayList T;
    public ArrayList U;
    public ArrayList V;
    public ArrayList W;
    public TLRPC.GlobalPrivacySettings X;
    public HashMap Y;
    public HashMap Z;
    public Account a;
    public ArrayList a0;
    public boolean b;
    public HashMap b0;
    public final Object c;
    public ArrayList c0;
    public boolean d;
    public HashMap d0;
    public boolean e;
    public ArrayList e0;
    public final Object f;
    public ConcurrentHashMap f0;
    public HashMap g0;
    public boolean h;
    public ArrayList h0;
    public HashMap i0;
    public ArrayList j0;
    public HashMap k0;
    public HashMap l0;
    public int m0;
    public boolean n;
    public boolean r;
    public boolean s;
    public String w;
    public final ArrayList x;
    public String y;

    public g5(int i7) {
        super(i7);
        this.c = new Object();
        this.f = new Object();
        this.w = "";
        this.x = new ArrayList();
        HashMap hashMap = new HashMap();
        this.E = hashMap;
        this.I = new int[15];
        this.Y = new HashMap();
        this.Z = new HashMap();
        this.a0 = new ArrayList();
        this.b0 = new HashMap();
        this.c0 = new ArrayList();
        this.d0 = new HashMap();
        this.e0 = new ArrayList();
        this.f0 = new ConcurrentHashMap(20, 1.0f, 2);
        this.g0 = new HashMap();
        this.h0 = new ArrayList();
        this.i0 = new HashMap();
        this.j0 = new ArrayList();
        this.k0 = new HashMap();
        this.l0 = new HashMap();
        if (qp.s1(this.currentAccount).e7.getBoolean("needGetStatuses", false)) {
            I();
        }
        hashMap.put("À", "A");
        hashMap.put("Á", "A");
        hashMap.put("Ä", "A");
        hashMap.put("Ù", "U");
        hashMap.put("Ú", "U");
        hashMap.put("Ü", "U");
        hashMap.put("Ì", "I");
        hashMap.put("Í", "I");
        hashMap.put("Ï", "I");
        hashMap.put("È", "E");
        hashMap.put("É", "E");
        hashMap.put("Ê", "E");
        hashMap.put("Ë", "E");
        hashMap.put("Ò", "O");
        hashMap.put("Ó", "O");
        hashMap.put("Ö", "O");
        hashMap.put("Ç", "C");
        hashMap.put("Ñ", "N");
        hashMap.put("Ÿ", "Y");
        hashMap.put("Ý", "Y");
        hashMap.put("Ţ", "Y");
        if (i7 == 0) {
            Utilities.e.c(new k4(this, 8));
        }
    }

    public static String m(int i7, String str, String str2) {
        if (str != null) {
            str = str.trim();
        }
        if (str != null && str2 == null && i7 > 0 && str.contains(" ")) {
            int indexOf = str.indexOf(" ");
            String substring = str.substring(indexOf + 1);
            str = str.substring(0, indexOf);
            str2 = substring;
        }
        if (str2 != null) {
            str2 = str2.trim();
        }
        StringBuilder sb2 = new StringBuilder((str != null ? str.length() : 0) + (str2 != null ? str2.length() : 0) + 1);
        if (id.b0 == 1) {
            if (str == null || str.length() <= 0) {
                if (str2 != null && str2.length() > 0) {
                    if (i7 > 0 && str2.length() > i7 + 2) {
                        return str2.substring(0, i7) + "…";
                    }
                    sb2.append(str2);
                }
            } else {
                if (i7 > 0 && str.length() > i7 + 2) {
                    return str.substring(0, i7) + "…";
                }
                sb2.append(str);
                if (str2 != null && str2.length() > 0) {
                    sb2.append(" ");
                    if (i7 > 0) {
                        if (str2.length() + sb2.length() > i7) {
                            sb2.append(str2.charAt(0));
                        }
                    }
                    sb2.append(str2);
                }
            }
        } else if (str2 == null || str2.length() <= 0) {
            if (str != null && str.length() > 0) {
                if (i7 > 0 && str.length() > i7 + 2) {
                    return str.substring(0, i7) + "…";
                }
                sb2.append(str);
            }
        } else {
            if (i7 > 0 && str2.length() > i7 + 2) {
                return str2.substring(0, i7) + "…";
            }
            sb2.append(str2);
            if (str != null && str.length() > 0) {
                sb2.append(" ");
                if (i7 > 0) {
                    if (str.length() + sb2.length() > i7) {
                        sb2.append(str.charAt(0));
                    }
                }
                sb2.append(str);
            }
        }
        return sb2.toString();
    }

    public static String n(String str, String str2) {
        return m(0, str, str2);
    }

    public static String o(TLObject tLObject) {
        return tLObject instanceof TLRPC.User ? p((TLRPC.User) tLObject) : tLObject instanceof TLRPC.Chat ? ((TLRPC.Chat) tLObject).title : id.M0(2131749329, null);
    }

    public static String p(TLRPC.User user) {
        return user == null ? "" : m(0, user.first_name, user.last_name);
    }

    public static HashMap q(HashMap hashMap) {
        HashMap hashMap2 = new HashMap();
        for (Map.Entry entry : hashMap.entrySet()) {
            d5 d5Var = new d5();
            d5 d5Var2 = (d5) entry.getValue();
            d5Var.h.addAll(d5Var2.h);
            d5Var.e.addAll(d5Var2.e);
            d5Var.f.addAll(d5Var2.f);
            d5Var.g.addAll(d5Var2.g);
            d5Var.i = d5Var2.i;
            d5Var.j = d5Var2.j;
            d5Var.a = d5Var2.a;
            String str = d5Var2.b;
            d5Var.b = str;
            hashMap2.put(str, d5Var);
        }
        return hashMap2;
    }

    public static g5 r(int i7) {
        g5 g5Var;
        g5 g5Var2 = r0[i7];
        if (g5Var2 != null) {
            return g5Var2;
        }
        synchronized (g5.class) {
            try {
                g5Var = r0[i7];
                if (g5Var == null) {
                    g5[] g5VarArr = r0;
                    g5 g5Var3 = new g5(i7);
                    g5VarArr[i7] = g5Var3;
                    g5Var = g5Var3;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return g5Var;
    }

    public static Collator u() {
        if (o0 == null || n0 != Locale.getDefault()) {
            try {
                Locale locale = Locale.getDefault();
                n0 = locale;
                Collator collator = Collator.getInstance(locale);
                o0 = collator;
                collator.setStrength(1);
            } catch (Exception e10) {
                a8.g(e10, true);
            }
        }
        if (o0 == null) {
            try {
                Collator collator2 = Collator.getInstance();
                o0 = collator2;
                collator2.setStrength(1);
            } catch (Exception e11) {
                a8.g(e11, true);
            }
        }
        if (o0 == null) {
            o0 = new c5();
        }
        return o0;
    }

    public static boolean w() {
        return t0.b.checkSelfPermission("android.permission.READ_CONTACTS") == 0;
    }

    public static boolean z(String str) {
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        int length = str.length();
        int i7 = 0;
        for (int i10 = 0; i10 < length; i10++) {
            char charAt = str.charAt(i10);
            if (charAt >= '0' && charAt <= '9') {
                i7++;
            }
        }
        return i7 > 3;
    }

    public final void A(long j3, boolean z9) {
        synchronized (this.c) {
            this.b = true;
        }
        if (z9) {
            if (r2.a) {
                a8.b("load contacts from cache");
            }
            yr messagesStorage = getMessagesStorage();
            messagesStorage.a.c(new rq(messagesStorage, 18));
            return;
        }
        if (r2.a) {
            a8.b("load contacts from server");
        }
        TLRPC.TL_contacts_getContacts tL_contacts_getContacts = new TLRPC.TL_contacts_getContacts();
        tL_contacts_getContacts.hash = j3;
        getConnectionsManager().sendRequest(tL_contacts_getContacts, new v4(this, j3, 0));
    }

    public final void B() {
        if (this.F == 0) {
            this.F = 1;
            getConnectionsManager().sendRequest(new TL_account.getGlobalPrivacySettings(), new q4(this, 1));
        }
    }

    public final void C() {
        D(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ba A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void D(boolean z9) {
        if (this.G == 0) {
            this.G = 1;
            getConnectionsManager().sendRequest(new TL_account.getAccountTTL(), new q4(this, 2));
        }
        B();
        int i7 = 0;
        while (true) {
            int[] iArr = this.I;
            if (i7 >= iArr.length) {
                getNotificationCenter().k(qs.k0, new Object[0]);
                return;
            }
            if (z9) {
                if (iArr[i7] == 1) {
                    i7++;
                }
                iArr[i7] = 1;
                TL_account.getPrivacy getprivacy = new TL_account.getPrivacy();
                switch (i7) {
                    case 0:
                        getprivacy.key = new TLRPC.TL_inputPrivacyKeyStatusTimestamp();
                        getConnectionsManager().sendRequest(getprivacy, new fo(this, i7, 3));
                        break;
                    case 1:
                        getprivacy.key = new TLRPC.TL_inputPrivacyKeyChatInvite();
                        getConnectionsManager().sendRequest(getprivacy, new fo(this, i7, 3));
                        break;
                    case 2:
                        getprivacy.key = new TLRPC.TL_inputPrivacyKeyPhoneCall();
                        getConnectionsManager().sendRequest(getprivacy, new fo(this, i7, 3));
                        break;
                    case 3:
                        getprivacy.key = new TLRPC.TL_inputPrivacyKeyPhoneP2P();
                        getConnectionsManager().sendRequest(getprivacy, new fo(this, i7, 3));
                        break;
                    case 4:
                        getprivacy.key = new TLRPC.TL_inputPrivacyKeyProfilePhoto();
                        getConnectionsManager().sendRequest(getprivacy, new fo(this, i7, 3));
                        break;
                    case 5:
                        getprivacy.key = new TLRPC.TL_inputPrivacyKeyForwards();
                        getConnectionsManager().sendRequest(getprivacy, new fo(this, i7, 3));
                        break;
                    case 6:
                        getprivacy.key = new TLRPC.TL_inputPrivacyKeyPhoneNumber();
                        getConnectionsManager().sendRequest(getprivacy, new fo(this, i7, 3));
                        break;
                    case 7:
                        getprivacy.key = new TLRPC.TL_inputPrivacyKeyAddedByPhone();
                        getConnectionsManager().sendRequest(getprivacy, new fo(this, i7, 3));
                        break;
                    case 8:
                        getprivacy.key = new TLRPC.TL_inputPrivacyKeyVoiceMessages();
                        getConnectionsManager().sendRequest(getprivacy, new fo(this, i7, 3));
                        break;
                    case 9:
                        getprivacy.key = new TLRPC.TL_inputPrivacyKeyAbout();
                        getConnectionsManager().sendRequest(getprivacy, new fo(this, i7, 3));
                        break;
                    case 11:
                        getprivacy.key = new TLRPC.TL_inputPrivacyKeyBirthday();
                        getConnectionsManager().sendRequest(getprivacy, new fo(this, i7, 3));
                        break;
                    case 12:
                        getprivacy.key = new TLRPC.TL_inputPrivacyKeyStarGiftsAutoSave();
                        getConnectionsManager().sendRequest(getprivacy, new fo(this, i7, 3));
                        break;
                    case 13:
                        getprivacy.key = new TLRPC.TL_inputPrivacyKeyNoPaidMessages();
                        getConnectionsManager().sendRequest(getprivacy, new fo(this, i7, 3));
                        break;
                    case 14:
                        getprivacy.key = new TLRPC.TL_inputPrivacyKeySavedMusic();
                        getConnectionsManager().sendRequest(getprivacy, new fo(this, i7, 3));
                        break;
                }
                i7++;
            } else {
                if (iArr[i7] != 0) {
                    i7++;
                }
                iArr[i7] = 1;
                TL_account.getPrivacy getprivacy2 = new TL_account.getPrivacy();
                switch (i7) {
                }
                i7++;
            }
        }
    }

    public final void E(HashMap hashMap, ArrayList arrayList, HashMap hashMap2, boolean z9) {
        Utilities.e.c(new gy(this, z9, new ArrayList(this.e0), hashMap2, hashMap, arrayList));
    }

    public final void F(final HashMap hashMap, final boolean z9, final boolean z10, final boolean z11, final boolean z12, final boolean z13, final boolean z14) {
        if (z10 || this.r) {
            Utilities.e.c(new Runnable() { // from class: org.telegram.messenger.b5
                /* JADX WARN: Code restructure failed: missing block: B:129:0x0335, code lost:
                
                    if (r9.intValue() == 1) goto L134;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:134:0x033b, code lost:
                
                    if (r5 != false) goto L136;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:136:0x0343, code lost:
                
                    if (r2.k0.containsKey(r8) == false) goto L135;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:137:0x0345, code lost:
                
                    r21 = r21 + 1;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:138:0x034a, code lost:
                
                    r19 = r19 + 1;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:139:0x034c, code lost:
                
                    r8 = new org.telegram.tgnet.TLRPC.TL_inputPhoneContact();
                    r9 = r5;
                    r11 = r6;
                    r8.client_id = (r7 << 32) | r1.a;
                    r8.first_name = r1.i;
                    r8.last_name = r1.j;
                    r8.phone = (java.lang.String) r1.e.get(r7);
                    r15.add(r8);
                 */
                /* JADX WARN: Code restructure failed: missing block: B:151:0x017f, code lost:
                
                    if (r6.j.equals(r1.j) == false) goto L52;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:50:0x016a, code lost:
                
                    if (r6.i.equals(r1.i) != false) goto L48;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:51:0x0181, code lost:
                
                    r5 = true;
                 */
                /* JADX WARN: Removed duplicated region for block: B:105:0x02b0  */
                /* JADX WARN: Removed duplicated region for block: B:197:0x04f6  */
                /* JADX WARN: Removed duplicated region for block: B:199:0x0512  */
                /* JADX WARN: Removed duplicated region for block: B:201:0x051f  */
                /* JADX WARN: Removed duplicated region for block: B:75:0x0230  */
                @Override // java.lang.Runnable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void run() {
                    boolean z15;
                    boolean z16;
                    ArrayList arrayList;
                    boolean z17;
                    HashMap hashMap2;
                    HashMap hashMap3;
                    boolean z18;
                    int i7;
                    int i10;
                    int i11;
                    HashMap hashMap4;
                    final int i12;
                    d5 d5Var;
                    ArrayList arrayList2;
                    boolean z19;
                    HashMap hashMap5;
                    HashMap hashMap6;
                    HashMap hashMap7;
                    boolean z20;
                    int indexOf;
                    HashMap hashMap8;
                    HashMap hashMap9;
                    boolean z21;
                    int i13;
                    boolean z22;
                    boolean z23;
                    final g5 g5Var = g5.this;
                    final HashMap hashMap10 = hashMap;
                    boolean z24 = z11;
                    boolean z25 = z9;
                    boolean z26 = z10;
                    boolean z27 = z12;
                    boolean z28 = z13;
                    boolean z29 = z14;
                    HashMap hashMap11 = new HashMap();
                    Iterator it = hashMap10.entrySet().iterator();
                    while (it.hasNext()) {
                        d5 d5Var2 = (d5) ((Map.Entry) it.next()).getValue();
                        for (int i14 = 0; i14 < d5Var2.g.size(); i14++) {
                            hashMap11.put((String) d5Var2.g.get(i14), d5Var2);
                        }
                    }
                    if (r2.a) {
                        a8.b("start read contacts from phone");
                    }
                    if (!z24) {
                        g5Var.e();
                    }
                    final HashMap H = g5Var.H();
                    HashMap hashMap12 = new HashMap();
                    HashMap hashMap13 = new HashMap();
                    boolean z30 = z28;
                    ArrayList arrayList3 = new ArrayList();
                    Iterator it2 = H.entrySet().iterator();
                    while (it2.hasNext()) {
                        d5 d5Var3 = (d5) ((Map.Entry) it2.next()).getValue();
                        int size = d5Var3.g.size();
                        boolean z31 = z25;
                        int i15 = 0;
                        while (i15 < size) {
                            int i16 = size;
                            hashMap13.put(((String) d5Var3.g.get(i15)).substring(Math.max(0, r0.length() - 7)), d5Var3);
                            i15++;
                            size = i16;
                            z27 = z27;
                        }
                        boolean z32 = z27;
                        String a10 = d5.a(d5Var3.i, d5Var3.j);
                        ArrayList arrayList4 = (ArrayList) hashMap12.get(a10);
                        if (arrayList4 == null) {
                            arrayList4 = new ArrayList();
                            hashMap12.put(a10, arrayList4);
                            arrayList3.add(a10);
                        }
                        arrayList4.add(d5Var3);
                        z25 = z31;
                        z27 = z32;
                    }
                    boolean z33 = z25;
                    boolean z34 = z27;
                    final HashMap hashMap14 = new HashMap();
                    int size2 = hashMap10.size();
                    ArrayList arrayList5 = new ArrayList();
                    if (hashMap10.isEmpty()) {
                        z15 = z26;
                        z16 = z24;
                        arrayList = arrayList3;
                        z17 = z29;
                        hashMap2 = hashMap12;
                        hashMap3 = hashMap13;
                        z18 = z30;
                        if (z33) {
                            i10 = 0;
                            for (Map.Entry entry : H.entrySet()) {
                                d5 d5Var4 = (d5) entry.getValue();
                                while (i11 < d5Var4.e.size()) {
                                    if (!z34) {
                                        String str = (String) d5Var4.g.get(i11);
                                        String substring = str.substring(Math.max(0, str.length() - 7));
                                        TLRPC.TL_contact tL_contact = (TLRPC.TL_contact) g5Var.k0.get(str);
                                        if (tL_contact != null) {
                                            TLRPC.User a22 = g5Var.getMessagesController().a2(Long.valueOf(tL_contact.user_id));
                                            if (a22 != null) {
                                                i10++;
                                                String str2 = a22.first_name;
                                                if (str2 == null) {
                                                    str2 = "";
                                                }
                                                String str3 = a22.last_name;
                                                if (str3 == null) {
                                                    str3 = "";
                                                }
                                                if (str2.equals(d5Var4.i)) {
                                                    i11 = str3.equals(d5Var4.j) ? i11 + 1 : 0;
                                                }
                                                if (TextUtils.isEmpty(d5Var4.i) && TextUtils.isEmpty(d5Var4.j)) {
                                                }
                                            }
                                        } else if (g5Var.l0.containsKey(substring)) {
                                            i10++;
                                        }
                                    }
                                    TLRPC.TL_inputPhoneContact tL_inputPhoneContact = new TLRPC.TL_inputPhoneContact();
                                    tL_inputPhoneContact.client_id = d5Var4.a | (i11 << 32);
                                    tL_inputPhoneContact.first_name = d5Var4.i;
                                    tL_inputPhoneContact.last_name = d5Var4.j;
                                    tL_inputPhoneContact.phone = (String) d5Var4.e.get(i11);
                                    arrayList5.add(tL_inputPhoneContact);
                                }
                            }
                            i7 = 0;
                        } else {
                            i7 = 0;
                            i10 = 0;
                        }
                    } else {
                        Iterator it3 = H.entrySet().iterator();
                        int i17 = 0;
                        int i18 = 0;
                        while (it3.hasNext()) {
                            Map.Entry entry2 = (Map.Entry) it3.next();
                            String str4 = (String) entry2.getKey();
                            Iterator it4 = it3;
                            d5 d5Var5 = (d5) entry2.getValue();
                            d5 d5Var6 = (d5) hashMap10.get(str4);
                            boolean z35 = z26;
                            boolean z36 = z24;
                            if (d5Var6 == null) {
                                for (int i19 = 0; i19 < d5Var5.g.size(); i19++) {
                                    d5Var = (d5) hashMap11.get(d5Var5.g.get(i19));
                                    if (d5Var != null) {
                                        str4 = d5Var.b;
                                        break;
                                    }
                                }
                            }
                            d5Var = d5Var6;
                            if (d5Var != null) {
                                d5Var5.l = d5Var.l;
                            }
                            if (d5Var != null) {
                                if (TextUtils.isEmpty(d5Var5.i)) {
                                    arrayList2 = arrayList3;
                                } else {
                                    arrayList2 = arrayList3;
                                }
                                if (!TextUtils.isEmpty(d5Var5.j)) {
                                }
                            } else {
                                arrayList2 = arrayList3;
                            }
                            boolean z37 = false;
                            if (d5Var == null || z37) {
                                z19 = z29;
                                hashMap5 = hashMap11;
                                hashMap6 = hashMap12;
                                hashMap7 = hashMap13;
                                z20 = z30;
                                int i20 = 0;
                                while (i20 < d5Var5.e.size()) {
                                    String str5 = (String) d5Var5.g.get(i20);
                                    str5.substring(Math.max(0, str5.length() - 7));
                                    hashMap14.put(str5, d5Var5);
                                    if (d5Var != null && (indexOf = d5Var.g.indexOf(str5)) != -1) {
                                        Integer num = (Integer) d5Var.h.get(indexOf);
                                        d5Var5.h.set(i20, num);
                                    }
                                    boolean z38 = z37;
                                    d5 d5Var7 = d5Var;
                                    i20++;
                                    z37 = z38;
                                    d5Var = d5Var7;
                                }
                                if (d5Var != null) {
                                    hashMap10.remove(str4);
                                }
                            } else {
                                int i21 = 0;
                                while (i21 < d5Var5.e.size()) {
                                    String str6 = (String) d5Var5.g.get(i21);
                                    boolean z39 = z29;
                                    HashMap hashMap15 = hashMap11;
                                    String substring2 = str6.substring(Math.max(0, str6.length() - 7));
                                    hashMap14.put(str6, d5Var5);
                                    int indexOf2 = d5Var.g.indexOf(str6);
                                    if (z33) {
                                        TLRPC.TL_contact tL_contact2 = (TLRPC.TL_contact) g5Var.k0.get(str6);
                                        if (tL_contact2 != null) {
                                            hashMap8 = hashMap12;
                                            hashMap9 = hashMap13;
                                            z21 = z30;
                                            TLRPC.User a23 = g5Var.getMessagesController().a2(Long.valueOf(tL_contact2.user_id));
                                            if (a23 != null) {
                                                i18++;
                                                if (TextUtils.isEmpty(a23.first_name) && TextUtils.isEmpty(a23.last_name) && (!TextUtils.isEmpty(d5Var5.i) || !TextUtils.isEmpty(d5Var5.j))) {
                                                    z23 = true;
                                                    indexOf2 = -1;
                                                    z22 = z23;
                                                    i13 = indexOf2;
                                                    if (i13 != -1) {
                                                        d5Var5.h.set(i21, (Integer) d5Var.h.get(i13));
                                                        d5Var.e.remove(i13);
                                                        d5Var.g.remove(i13);
                                                        d5Var.h.remove(i13);
                                                        d5Var.f.remove(i13);
                                                    } else if (z33) {
                                                        if (!z22) {
                                                            TLRPC.TL_contact tL_contact3 = (TLRPC.TL_contact) g5Var.k0.get(str6);
                                                            if (tL_contact3 != null) {
                                                                TLRPC.User a24 = g5Var.getMessagesController().a2(Long.valueOf(tL_contact3.user_id));
                                                                if (a24 != null) {
                                                                    i18++;
                                                                    String str7 = a24.first_name;
                                                                    if (str7 == null) {
                                                                        str7 = "";
                                                                    }
                                                                    String str8 = a24.last_name;
                                                                    if (str8 == null) {
                                                                        str8 = "";
                                                                    }
                                                                    if (str7.equals(d5Var5.i)) {
                                                                        if (str8.equals(d5Var5.j)) {
                                                                        }
                                                                    }
                                                                    if (TextUtils.isEmpty(d5Var5.i) && TextUtils.isEmpty(d5Var5.j)) {
                                                                    }
                                                                } else {
                                                                    i17++;
                                                                }
                                                            } else if (g5Var.l0.containsKey(substring2)) {
                                                                i18++;
                                                            }
                                                        }
                                                        TLRPC.TL_inputPhoneContact tL_inputPhoneContact2 = new TLRPC.TL_inputPhoneContact();
                                                        tL_inputPhoneContact2.client_id = d5Var5.a | (i21 << 32);
                                                        tL_inputPhoneContact2.first_name = d5Var5.i;
                                                        tL_inputPhoneContact2.last_name = d5Var5.j;
                                                        tL_inputPhoneContact2.phone = (String) d5Var5.e.get(i21);
                                                        arrayList5.add(tL_inputPhoneContact2);
                                                    }
                                                    i21++;
                                                    hashMap11 = hashMap15;
                                                    z29 = z39;
                                                    hashMap12 = hashMap8;
                                                    hashMap13 = hashMap9;
                                                    z30 = z21;
                                                }
                                            }
                                            z23 = false;
                                            z22 = z23;
                                            i13 = indexOf2;
                                            if (i13 != -1) {
                                            }
                                            i21++;
                                            hashMap11 = hashMap15;
                                            z29 = z39;
                                            hashMap12 = hashMap8;
                                            hashMap13 = hashMap9;
                                            z30 = z21;
                                        } else {
                                            hashMap8 = hashMap12;
                                            hashMap9 = hashMap13;
                                            z21 = z30;
                                            if (g5Var.l0.containsKey(substring2)) {
                                                i18++;
                                            }
                                        }
                                    } else {
                                        hashMap8 = hashMap12;
                                        hashMap9 = hashMap13;
                                        z21 = z30;
                                    }
                                    i13 = indexOf2;
                                    z22 = false;
                                    if (i13 != -1) {
                                    }
                                    i21++;
                                    hashMap11 = hashMap15;
                                    z29 = z39;
                                    hashMap12 = hashMap8;
                                    hashMap13 = hashMap9;
                                    z30 = z21;
                                }
                                z19 = z29;
                                hashMap5 = hashMap11;
                                hashMap6 = hashMap12;
                                hashMap7 = hashMap13;
                                z20 = z30;
                                if (d5Var.e.isEmpty()) {
                                    hashMap10.remove(str4);
                                }
                            }
                            arrayList3 = arrayList2;
                            it3 = it4;
                            z26 = z35;
                            z24 = z36;
                            hashMap11 = hashMap5;
                            z29 = z19;
                            hashMap12 = hashMap6;
                            hashMap13 = hashMap7;
                            z30 = z20;
                        }
                        z15 = z26;
                        z16 = z24;
                        arrayList = arrayList3;
                        z17 = z29;
                        hashMap2 = hashMap12;
                        hashMap3 = hashMap13;
                        z18 = z30;
                        if (!z15 && hashMap10.isEmpty() && arrayList5.isEmpty() && size2 == H.size()) {
                            if (r2.a) {
                                a8.b("contacts not changed!");
                                return;
                            }
                            return;
                        } else {
                            if (z33 && !hashMap10.isEmpty() && !H.isEmpty() && arrayList5.isEmpty()) {
                                g5Var.getMessagesStorage().Z0(H, false, false);
                            }
                            i7 = i17;
                            i10 = i18;
                        }
                    }
                    if (r2.a) {
                        a8.b("done processing contacts");
                    }
                    if (!z33) {
                        final ArrayList arrayList6 = arrayList;
                        final boolean z40 = z15;
                        final HashMap hashMap16 = hashMap2;
                        final HashMap hashMap17 = hashMap3;
                        final int i22 = 2;
                        Utilities.d.c(new Runnable() { // from class: org.telegram.messenger.n4
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i22) {
                                    case 0:
                                        g5 g5Var2 = g5Var;
                                        ArrayList arrayList7 = g5Var2.x;
                                        g5Var2.Z = hashMap14;
                                        HashMap hashMap18 = H;
                                        g5Var2.Y = hashMap18;
                                        g5Var2.e = false;
                                        g5Var2.r = true;
                                        if (z40) {
                                            g5Var2.h = true;
                                        }
                                        if (!arrayList7.isEmpty() && g5Var2.h) {
                                            g5Var2.c(arrayList7, null, null, null);
                                            arrayList7.clear();
                                        }
                                        g5Var2.getMessagesStorage().Z0(hashMap18, false, false);
                                        g0.h3(new u4(g5Var2, hashMap16, arrayList6, hashMap17, 0));
                                        break;
                                    case 1:
                                        g5 g5Var3 = g5Var;
                                        ArrayList arrayList8 = g5Var3.x;
                                        g5Var3.Z = hashMap14;
                                        g5Var3.Y = H;
                                        g5Var3.e = false;
                                        g5Var3.r = true;
                                        if (z40) {
                                            g5Var3.h = true;
                                        }
                                        if (!arrayList8.isEmpty() && g5Var3.h) {
                                            g5Var3.c(arrayList8, null, null, null);
                                            arrayList8.clear();
                                        }
                                        g0.h3(new u4(g5Var3, hashMap16, arrayList6, hashMap17, 1));
                                        break;
                                    default:
                                        g5 g5Var4 = g5Var;
                                        ArrayList arrayList9 = g5Var4.x;
                                        g5Var4.Z = hashMap14;
                                        g5Var4.Y = H;
                                        g5Var4.e = false;
                                        g5Var4.r = true;
                                        if (z40) {
                                            g5Var4.h = true;
                                        }
                                        if (!arrayList9.isEmpty() && g5Var4.h) {
                                            g5Var4.c(arrayList9, null, null, null);
                                            arrayList9.clear();
                                        }
                                        g0.h3(new u4(g5Var4, hashMap16, arrayList6, hashMap17, 2));
                                        break;
                                }
                            }
                        });
                        if (H.isEmpty()) {
                            return;
                        }
                        g5Var.getMessagesStorage().Z0(H, false, false);
                        return;
                    }
                    if (arrayList5.isEmpty()) {
                        final ArrayList arrayList7 = arrayList;
                        final boolean z41 = z15;
                        final HashMap hashMap18 = hashMap2;
                        final HashMap hashMap19 = hashMap3;
                        final int i23 = 1;
                        Utilities.d.c(new Runnable() { // from class: org.telegram.messenger.n4
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i23) {
                                    case 0:
                                        g5 g5Var2 = g5Var;
                                        ArrayList arrayList72 = g5Var2.x;
                                        g5Var2.Z = hashMap14;
                                        HashMap hashMap182 = H;
                                        g5Var2.Y = hashMap182;
                                        g5Var2.e = false;
                                        g5Var2.r = true;
                                        if (z41) {
                                            g5Var2.h = true;
                                        }
                                        if (!arrayList72.isEmpty() && g5Var2.h) {
                                            g5Var2.c(arrayList72, null, null, null);
                                            arrayList72.clear();
                                        }
                                        g5Var2.getMessagesStorage().Z0(hashMap182, false, false);
                                        g0.h3(new u4(g5Var2, hashMap18, arrayList7, hashMap19, 0));
                                        break;
                                    case 1:
                                        g5 g5Var3 = g5Var;
                                        ArrayList arrayList8 = g5Var3.x;
                                        g5Var3.Z = hashMap14;
                                        g5Var3.Y = H;
                                        g5Var3.e = false;
                                        g5Var3.r = true;
                                        if (z41) {
                                            g5Var3.h = true;
                                        }
                                        if (!arrayList8.isEmpty() && g5Var3.h) {
                                            g5Var3.c(arrayList8, null, null, null);
                                            arrayList8.clear();
                                        }
                                        g0.h3(new u4(g5Var3, hashMap18, arrayList7, hashMap19, 1));
                                        break;
                                    default:
                                        g5 g5Var4 = g5Var;
                                        ArrayList arrayList9 = g5Var4.x;
                                        g5Var4.Z = hashMap14;
                                        g5Var4.Y = H;
                                        g5Var4.e = false;
                                        g5Var4.r = true;
                                        if (z41) {
                                            g5Var4.h = true;
                                        }
                                        if (!arrayList9.isEmpty() && g5Var4.h) {
                                            g5Var4.c(arrayList9, null, null, null);
                                            arrayList9.clear();
                                        }
                                        g0.h3(new u4(g5Var4, hashMap18, arrayList7, hashMap19, 2));
                                        break;
                                }
                            }
                        });
                        return;
                    }
                    if (r2.a) {
                        a8.d("start import contacts");
                    }
                    if (z18 && i7 != 0) {
                        if (i7 >= 30) {
                            hashMap4 = hashMap14;
                            i12 = 1;
                        } else if (z15 && size2 == 0 && g5Var.k0.size() - i10 > (g5Var.k0.size() / 3) * 2) {
                            hashMap4 = hashMap14;
                            i12 = 2;
                        }
                        if (r2.a) {
                            StringBuilder o4 = jg.g.o("new phone book contacts ", i7, " serverContactsInPhonebook ", i10, " totalContacts ");
                            o4.append(g5Var.k0.size());
                            a8.b(o4.toString());
                        }
                        if (i12 == 0) {
                            final boolean z42 = z15;
                            final boolean z43 = z16;
                            g0.h3(new Runnable() { // from class: org.telegram.messenger.m4
                                @Override // java.lang.Runnable
                                public final void run() {
                                    g5.this.getNotificationCenter().k(qs.Q, Integer.valueOf(i12), hashMap10, Boolean.valueOf(z42), Boolean.valueOf(z43));
                                }
                            });
                            return;
                        }
                        final boolean z44 = z15;
                        if (z17) {
                            final HashMap hashMap20 = hashMap4;
                            final int i24 = 0;
                            final ArrayList arrayList8 = arrayList;
                            final HashMap hashMap21 = hashMap2;
                            final HashMap hashMap22 = hashMap3;
                            Utilities.d.c(new Runnable() { // from class: org.telegram.messenger.n4
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i24) {
                                        case 0:
                                            g5 g5Var2 = g5Var;
                                            ArrayList arrayList72 = g5Var2.x;
                                            g5Var2.Z = hashMap20;
                                            HashMap hashMap182 = H;
                                            g5Var2.Y = hashMap182;
                                            g5Var2.e = false;
                                            g5Var2.r = true;
                                            if (z44) {
                                                g5Var2.h = true;
                                            }
                                            if (!arrayList72.isEmpty() && g5Var2.h) {
                                                g5Var2.c(arrayList72, null, null, null);
                                                arrayList72.clear();
                                            }
                                            g5Var2.getMessagesStorage().Z0(hashMap182, false, false);
                                            g0.h3(new u4(g5Var2, hashMap21, arrayList8, hashMap22, 0));
                                            break;
                                        case 1:
                                            g5 g5Var3 = g5Var;
                                            ArrayList arrayList82 = g5Var3.x;
                                            g5Var3.Z = hashMap20;
                                            g5Var3.Y = H;
                                            g5Var3.e = false;
                                            g5Var3.r = true;
                                            if (z44) {
                                                g5Var3.h = true;
                                            }
                                            if (!arrayList82.isEmpty() && g5Var3.h) {
                                                g5Var3.c(arrayList82, null, null, null);
                                                arrayList82.clear();
                                            }
                                            g0.h3(new u4(g5Var3, hashMap21, arrayList8, hashMap22, 1));
                                            break;
                                        default:
                                            g5 g5Var4 = g5Var;
                                            ArrayList arrayList9 = g5Var4.x;
                                            g5Var4.Z = hashMap20;
                                            g5Var4.Y = H;
                                            g5Var4.e = false;
                                            g5Var4.r = true;
                                            if (z44) {
                                                g5Var4.h = true;
                                            }
                                            if (!arrayList9.isEmpty() && g5Var4.h) {
                                                g5Var4.c(arrayList9, null, null, null);
                                                arrayList9.clear();
                                            }
                                            g0.h3(new u4(g5Var4, hashMap21, arrayList8, hashMap22, 2));
                                            break;
                                    }
                                }
                            });
                            return;
                        }
                        ArrayList arrayList9 = arrayList;
                        HashMap hashMap23 = hashMap3;
                        boolean[] zArr = {false};
                        HashMap hashMap24 = new HashMap(H);
                        HashMap hashMap25 = H;
                        SparseArray sparseArray = new SparseArray();
                        Iterator it5 = hashMap24.entrySet().iterator();
                        while (it5.hasNext()) {
                            d5 d5Var8 = (d5) ((Map.Entry) it5.next()).getValue();
                            sparseArray.put(d5Var8.a, d5Var8.b);
                        }
                        g5Var.m0 = 0;
                        int ceil = (int) Math.ceil(arrayList5.size() / 500.0d);
                        int i25 = 0;
                        while (i25 < ceil) {
                            ArrayList arrayList10 = arrayList9;
                            TLRPC.TL_contacts_importContacts tL_contacts_importContacts = new TLRPC.TL_contacts_importContacts();
                            int i26 = i25 * 500;
                            tL_contacts_importContacts.contacts = new ArrayList<>(arrayList5.subList(i26, Math.min(i26 + 500, arrayList5.size())));
                            ConnectionsManager connectionsManager = g5Var.getConnectionsManager();
                            HashMap hashMap26 = hashMap23;
                            int i27 = ceil;
                            boolean z45 = z44;
                            boolean[] zArr2 = zArr;
                            HashMap hashMap27 = hashMap2;
                            o4 o4Var = new o4(g5Var, hashMap24, sparseArray, zArr2, hashMap25, tL_contacts_importContacts, i27, hashMap4, z45, hashMap27, arrayList10, hashMap26);
                            arrayList9 = arrayList10;
                            z44 = z45;
                            hashMap23 = hashMap26;
                            connectionsManager.sendRequest(tL_contacts_importContacts, o4Var, 6);
                            i25++;
                            hashMap4 = hashMap4;
                            hashMap24 = hashMap24;
                            hashMap2 = hashMap27;
                            ceil = i27;
                            zArr = zArr2;
                            hashMap25 = hashMap25;
                            sparseArray = sparseArray;
                        }
                        return;
                    }
                    hashMap4 = hashMap14;
                    i12 = 0;
                    if (r2.a) {
                    }
                    if (i12 == 0) {
                    }
                }
            });
        }
    }

    public final void G(ArrayList arrayList, ConcurrentHashMap concurrentHashMap) {
        ArrayList arrayList2;
        int indexOf;
        int indexOf2;
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        int size = arrayList.size();
        int i7 = 0;
        while (true) {
            arrayList2 = this.x;
            if (i7 >= size) {
                break;
            }
            Object obj = arrayList.get(i7);
            i7++;
            Long l10 = (Long) obj;
            if (l10.longValue() > 0) {
                TLRPC.TL_contact tL_contact = new TLRPC.TL_contact();
                tL_contact.user_id = l10.longValue();
                arrayList3.add(tL_contact);
                if (!arrayList2.isEmpty() && (indexOf = arrayList2.indexOf(Long.valueOf(-l10.longValue()))) != -1) {
                    arrayList2.remove(indexOf);
                }
            } else if (l10.longValue() < 0) {
                arrayList4.add(Long.valueOf(-l10.longValue()));
                if (!arrayList2.isEmpty() && (indexOf2 = arrayList2.indexOf(Long.valueOf(-l10.longValue()))) != -1) {
                    arrayList2.remove(indexOf2);
                }
            }
        }
        if (!arrayList4.isEmpty()) {
            yr messagesStorage = getMessagesStorage();
            messagesStorage.getClass();
            if (!arrayList4.isEmpty()) {
                messagesStorage.a.c(new sp(messagesStorage, arrayList4, 0));
            }
        }
        if (!arrayList3.isEmpty()) {
            getMessagesStorage().c1(arrayList3, false);
        }
        if (this.h && this.r) {
            c(arrayList, concurrentHashMap, arrayList3, arrayList4);
            return;
        }
        arrayList2.addAll(arrayList);
        if (r2.a) {
            a8.b("delay update - contacts add = " + arrayList3.size() + " delete = " + arrayList4.size());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0586  */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x056f A[Catch: all -> 0x0573, TRY_LEAVE, TryCatch #10 {all -> 0x0573, blocks: (B:62:0x056a, B:64:0x056f), top: B:61:0x056a }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0578 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v2, types: [boolean, int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final HashMap H() {
        HashMap hashMap;
        Cursor cursor;
        boolean z9;
        Cursor cursor2;
        HashMap hashMap2;
        int i7;
        HashMap hashMap3;
        ContentResolver contentResolver;
        String str;
        ArrayList arrayList;
        long j3;
        int i10;
        int i11;
        int i12;
        HashMap hashMap4;
        Cursor cursor3;
        String substring;
        ContentResolver contentResolver2;
        String str2;
        long j10;
        StringBuilder sb2;
        ArrayList arrayList2;
        Cursor cursor4;
        Cursor cursor5;
        long currentTimeMillis;
        if (!getUserConfig().U) {
            if (r2.a) {
                a8.b("contacts sync disabled");
            }
            return new HashMap();
        }
        if (!w()) {
            if (r2.a) {
                a8.b("app has no contacts permissions");
            }
            return new HashMap();
        }
        ?? r32 = 1;
        try {
            StringBuilder sb3 = new StringBuilder();
            ContentResolver contentResolver3 = t0.b.getContentResolver();
            HashMap hashMap5 = new HashMap();
            ArrayList arrayList3 = new ArrayList();
            Cursor query = contentResolver3.query(ContactsContract.CommonDataKinds.Phone.CONTENT_URI, p0, null, null, null);
            try {
                long currentTimeMillis2 = System.currentTimeMillis();
                String str3 = "+";
                if (query != 0) {
                    try {
                        int count = query.getCount();
                        if (count > 0) {
                            hashMap3 = new HashMap(count);
                            i7 = 1;
                            while (query.moveToNext()) {
                                try {
                                    String string = query.getString(r32);
                                    String string2 = query.getString(5);
                                    if (string2 == null) {
                                        string2 = "";
                                    }
                                    boolean z10 = string2.indexOf(".sim") != 0 ? r32 : false;
                                    if (!TextUtils.isEmpty(string)) {
                                        String d = pf.b.d(string, r32);
                                        if (!TextUtils.isEmpty(d)) {
                                            if (d.startsWith(str3)) {
                                                try {
                                                    substring = d.substring(r32);
                                                } catch (Throwable th2) {
                                                    th = th2;
                                                    z9 = r32;
                                                    hashMap = hashMap3;
                                                    cursor2 = query;
                                                    try {
                                                        a8.g(th, z9);
                                                        if (hashMap != null) {
                                                        }
                                                        if (cursor2 != null) {
                                                        }
                                                        hashMap2 = hashMap;
                                                        if (hashMap2 != null) {
                                                        }
                                                    } finally {
                                                    }
                                                }
                                            } else {
                                                substring = d;
                                            }
                                            contentResolver2 = contentResolver3;
                                            str2 = str3;
                                            String string3 = query.getString(0);
                                            sb3.setLength(0);
                                            DatabaseUtils.appendEscapedSQLString(sb3, string3);
                                            String sb4 = sb3.toString();
                                            j10 = currentTimeMillis2;
                                            d5 d5Var = (d5) hashMap5.get(substring);
                                            if (d5Var != null) {
                                                if (!d5Var.d && !string2.equals(d5Var.c)) {
                                                    sb3.setLength(0);
                                                    DatabaseUtils.appendEscapedSQLString(sb3, d5Var.b);
                                                    arrayList3.remove(sb3.toString());
                                                    arrayList3.add(sb4);
                                                    d5Var.b = string3;
                                                    d5Var.d = z10;
                                                    d5Var.c = string2;
                                                }
                                                contentResolver3 = contentResolver2;
                                                str3 = str2;
                                                currentTimeMillis2 = j10;
                                                r32 = 1;
                                            } else {
                                                if (!arrayList3.contains(sb4)) {
                                                    arrayList3.add(sb4);
                                                }
                                                int i13 = query.getInt(2);
                                                d5 d5Var2 = (d5) hashMap3.get(string3);
                                                if (d5Var2 == null) {
                                                    d5Var2 = new d5();
                                                    String string4 = query.getString(4);
                                                    String trim = string4 == null ? "" : string4.trim();
                                                    if (z(trim)) {
                                                        d5Var2.i = trim;
                                                        d5Var2.j = "";
                                                        sb2 = sb3;
                                                        arrayList2 = arrayList3;
                                                    } else {
                                                        String str4 = trim;
                                                        sb2 = sb3;
                                                        int lastIndexOf = str4.lastIndexOf(32);
                                                        arrayList2 = arrayList3;
                                                        if (lastIndexOf != -1) {
                                                            d5Var2.i = str4.substring(0, lastIndexOf).trim();
                                                            d5Var2.j = str4.substring(lastIndexOf + 1).trim();
                                                        } else {
                                                            d5Var2.i = str4;
                                                            d5Var2.j = "";
                                                        }
                                                    }
                                                    d5Var2.c = string2;
                                                    d5Var2.d = z10;
                                                    d5Var2.b = string3;
                                                    d5Var2.a = i7;
                                                    hashMap3.put(string3, d5Var2);
                                                    i7++;
                                                } else {
                                                    sb2 = sb3;
                                                    arrayList2 = arrayList3;
                                                }
                                                d5Var2.g.add(substring);
                                                d5Var2.e.add(d);
                                                d5Var2.h.add(0);
                                                if (i13 == 0) {
                                                    String string5 = query.getString(3);
                                                    ArrayList arrayList4 = d5Var2.f;
                                                    if (string5 == null) {
                                                        string5 = id.M0(2131747292, null);
                                                    }
                                                    arrayList4.add(string5);
                                                } else if (i13 == 1) {
                                                    d5Var2.f.add(id.M0(2131747294, null));
                                                } else {
                                                    if (i13 == 2) {
                                                        d5Var2.f.add(id.M0(2131747292, null));
                                                    } else if (i13 == 3) {
                                                        d5Var2.f.add(id.M0(2131747282, null));
                                                    } else if (i13 == 12) {
                                                        d5Var2.f.add(id.M0(2131747293, null));
                                                    } else {
                                                        d5Var2.f.add(id.M0(2131747283, null));
                                                    }
                                                    hashMap5.put(substring, d5Var2);
                                                    contentResolver3 = contentResolver2;
                                                    str3 = str2;
                                                    sb3 = sb2;
                                                    currentTimeMillis2 = j10;
                                                    arrayList3 = arrayList2;
                                                    r32 = 1;
                                                }
                                                hashMap5.put(substring, d5Var2);
                                                contentResolver3 = contentResolver2;
                                                str3 = str2;
                                                sb3 = sb2;
                                                currentTimeMillis2 = j10;
                                                arrayList3 = arrayList2;
                                                r32 = 1;
                                            }
                                        }
                                    }
                                    contentResolver2 = contentResolver3;
                                    str2 = str3;
                                    j10 = currentTimeMillis2;
                                    contentResolver3 = contentResolver2;
                                    str3 = str2;
                                    currentTimeMillis2 = j10;
                                    r32 = 1;
                                } catch (Throwable th3) {
                                    th = th3;
                                    hashMap = hashMap3;
                                    cursor = query;
                                    z9 = true;
                                    cursor2 = cursor;
                                    a8.g(th, z9);
                                    if (hashMap != null) {
                                    }
                                    if (cursor2 != null) {
                                    }
                                    hashMap2 = hashMap;
                                    if (hashMap2 != null) {
                                    }
                                }
                            }
                        } else {
                            i7 = 1;
                            hashMap3 = null;
                        }
                        contentResolver = contentResolver3;
                        str = str3;
                        arrayList = arrayList3;
                        j3 = currentTimeMillis2;
                        i10 = 3;
                        i11 = 2;
                        try {
                            query.close();
                        } catch (Exception unused) {
                        }
                        i12 = i7;
                        hashMap4 = hashMap3;
                        cursor3 = null;
                    } catch (Throwable th4) {
                        th = th4;
                        hashMap = null;
                        cursor = query;
                    }
                } else {
                    contentResolver = contentResolver3;
                    str = "+";
                    arrayList = arrayList3;
                    j3 = currentTimeMillis2;
                    i10 = 3;
                    i11 = 2;
                    cursor3 = query;
                    hashMap4 = null;
                    i12 = 1;
                }
                try {
                    String join = TextUtils.join(",", arrayList);
                    int i14 = i11;
                    ContentResolver contentResolver4 = contentResolver;
                    int i15 = i10;
                    String str5 = str;
                    Cursor query2 = contentResolver4.query(ContactsContract.Data.CONTENT_URI, q0, "lookup IN (" + join + ") AND mimetype = 'vnd.android.cursor.item/name'", null, null);
                    if (query2 != null) {
                        while (query2.moveToNext()) {
                            try {
                                String string6 = query2.getString(0);
                                String string7 = query2.getString(1);
                                String string8 = query2.getString(i14);
                                String string9 = query2.getString(i15);
                                d5 d5Var3 = hashMap4 != null ? (d5) hashMap4.get(string6) : null;
                                if (d5Var3 != null && !d5Var3.k) {
                                    if (d5Var3.d) {
                                        if (string7 != null) {
                                            d5Var3.i = string7;
                                        } else {
                                            d5Var3.i = "";
                                        }
                                        if (string8 != null) {
                                            d5Var3.j = string8;
                                        } else {
                                            d5Var3.j = "";
                                        }
                                        if (!TextUtils.isEmpty(string9)) {
                                            if (TextUtils.isEmpty(d5Var3.i)) {
                                                d5Var3.i = string9;
                                            } else {
                                                d5Var3.i += " " + string9;
                                            }
                                        }
                                    } else if ((!z(string7) && (d5Var3.i.contains(string7) || string7.contains(d5Var3.i))) || (!z(string8) && (d5Var3.j.contains(string8) || string7.contains(d5Var3.j)))) {
                                        if (string7 != null) {
                                            d5Var3.i = string7;
                                        } else {
                                            d5Var3.i = "";
                                        }
                                        if (!TextUtils.isEmpty(string9)) {
                                            if (TextUtils.isEmpty(d5Var3.i)) {
                                                d5Var3.i = string9;
                                            } else {
                                                d5Var3.i += " " + string9;
                                            }
                                        }
                                        if (string8 != null) {
                                            d5Var3.j = string8;
                                        } else {
                                            d5Var3.j = "";
                                        }
                                    }
                                    d5Var3.k = true;
                                }
                            } catch (Throwable th5) {
                                th = th5;
                                hashMap = hashMap4;
                                cursor = query2;
                                z9 = true;
                                cursor2 = cursor;
                                a8.g(th, z9);
                                if (hashMap != null) {
                                }
                                if (cursor2 != null) {
                                }
                                hashMap2 = hashMap;
                                if (hashMap2 != null) {
                                }
                            }
                        }
                        try {
                            query2.close();
                        } catch (Exception unused2) {
                        }
                        cursor5 = null;
                    } else {
                        cursor5 = query2;
                    }
                    try {
                        StringBuilder sb5 = new StringBuilder();
                        sb5.append("loading contacts 1 query time = ");
                        sb5.append(System.currentTimeMillis() - j3);
                        sb5.append(" contactsSize = ");
                        sb5.append(hashMap4 == null ? 0 : hashMap4.size());
                        a8.b(sb5.toString());
                        long currentTimeMillis3 = System.currentTimeMillis();
                        HashMap hashMap6 = new HashMap();
                        ArrayList arrayList5 = new ArrayList();
                        Cursor query3 = contentResolver4.query(ContactsContract.Contacts.CONTENT_URI, new String[]{"_id", "lookup", "display_name"}, "has_phone_number = ?", new String[]{"0"}, null);
                        if (query3 != null) {
                            while (query3.moveToNext()) {
                                try {
                                    f5 f5Var = new f5();
                                    f5Var.a = query3.getString(0);
                                    f5Var.b = query3.getString(1);
                                    f5Var.c = query3.getString(i14);
                                    if (hashMap4 != null && hashMap4.get(f5Var.b) != null) {
                                    }
                                    if (!TextUtils.isEmpty(f5Var.c)) {
                                        hashMap6.put(f5Var.a, f5Var);
                                        arrayList5.add(f5Var.a);
                                    }
                                } catch (Throwable th6) {
                                    th = th6;
                                    hashMap = hashMap4;
                                    cursor = cursor5;
                                    z9 = true;
                                    cursor2 = cursor;
                                    a8.g(th, z9);
                                    if (hashMap != null) {
                                    }
                                    if (cursor2 != null) {
                                    }
                                    hashMap2 = hashMap;
                                    if (hashMap2 != null) {
                                    }
                                }
                            }
                            query3.close();
                        }
                        a8.b("loading contacts 2 query time = " + (System.currentTimeMillis() - currentTimeMillis3) + " phoneBookConacts size = " + arrayList5.size());
                        currentTimeMillis = System.currentTimeMillis();
                        if (arrayList5.isEmpty()) {
                            hashMap2 = hashMap4;
                            cursor3 = cursor5;
                        } else {
                            Pattern compile = Pattern.compile(".*(\\+[0-9 \\-]+).*");
                            hashMap2 = hashMap4;
                            try {
                                Cursor query4 = contentResolver4.query(ContactsContract.Data.CONTENT_URI, new String[]{"contact_id", "data1", "data2", "data3", "data4"}, "contact_id IN (" + TextUtils.join(", ", arrayList5) + ")", null, null);
                                if (query4 != null) {
                                    while (query4.moveToNext()) {
                                        try {
                                            f5 f5Var2 = (f5) hashMap6.get(query4.getString(0));
                                            if (f5Var2 != null) {
                                                String[] strArr = {query4.getString(1), query4.getString(2), query4.getString(3), query4.getString(4)};
                                                for (int i16 = 0; i16 < 4; i16++) {
                                                    String str6 = strArr[i16];
                                                    if (str6 != null) {
                                                        Matcher matcher = compile.matcher(str6);
                                                        if (matcher.matches()) {
                                                            f5Var2.d = matcher.group(1).replace(" ", "").replace("-", "");
                                                        }
                                                        String str7 = f5Var2.d;
                                                        if (str7 != null) {
                                                            if (str7.startsWith(str5)) {
                                                                str7 = f5Var2.d.substring(1);
                                                            }
                                                            d5 d5Var4 = new d5();
                                                            d5Var4.i = f5Var2.c;
                                                            d5Var4.j = "";
                                                            int i17 = i12 + 1;
                                                            d5Var4.a = i12;
                                                            d5Var4.b = f5Var2.b;
                                                            d5Var4.e.add(f5Var2.d);
                                                            d5Var4.g.add(str7);
                                                            d5Var4.h.add(0);
                                                            d5Var4.f.add(id.M0(2131747283, null));
                                                            HashMap hashMap7 = hashMap2 == null ? new HashMap() : hashMap2;
                                                            try {
                                                                hashMap7.put(f5Var2.b, d5Var4);
                                                                hashMap2 = hashMap7;
                                                                i12 = i17;
                                                            } catch (Throwable th7) {
                                                                th = th7;
                                                                cursor = query4;
                                                                hashMap = hashMap7;
                                                                z9 = true;
                                                                cursor2 = cursor;
                                                                a8.g(th, z9);
                                                                if (hashMap != null) {
                                                                }
                                                                if (cursor2 != null) {
                                                                }
                                                                hashMap2 = hashMap;
                                                                if (hashMap2 != null) {
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        } catch (Throwable th8) {
                                            th = th8;
                                            cursor4 = query4;
                                            hashMap = hashMap2;
                                            cursor = cursor4;
                                            z9 = true;
                                            cursor2 = cursor;
                                            a8.g(th, z9);
                                            if (hashMap != null) {
                                            }
                                            if (cursor2 != null) {
                                            }
                                            hashMap2 = hashMap;
                                            if (hashMap2 != null) {
                                            }
                                        }
                                    }
                                    query4.close();
                                }
                                cursor3 = query4;
                            } catch (Throwable th9) {
                                th = th9;
                                cursor4 = cursor5;
                                hashMap = hashMap2;
                                cursor = cursor4;
                                z9 = true;
                                cursor2 = cursor;
                                a8.g(th, z9);
                                if (hashMap != null) {
                                    hashMap.clear();
                                }
                                if (cursor2 != null) {
                                    try {
                                        cursor2.close();
                                    } catch (Exception e10) {
                                        a8.g(e10, true);
                                    }
                                }
                                hashMap2 = hashMap;
                                if (hashMap2 != null) {
                                }
                            }
                        }
                    } catch (Throwable th10) {
                        th = th10;
                        hashMap2 = hashMap4;
                    }
                    try {
                        a8.b("loading contacts 3 query time = " + (System.currentTimeMillis() - currentTimeMillis));
                        if (cursor3 != null) {
                            try {
                                cursor3.close();
                            } catch (Exception e11) {
                                a8.g(e11, true);
                            }
                        }
                    } catch (Throwable th11) {
                        th = th11;
                        cursor4 = cursor3;
                        hashMap = hashMap2;
                        cursor = cursor4;
                        z9 = true;
                        cursor2 = cursor;
                        a8.g(th, z9);
                        if (hashMap != null) {
                        }
                        if (cursor2 != null) {
                        }
                        hashMap2 = hashMap;
                        if (hashMap2 != null) {
                        }
                    }
                } catch (Throwable th12) {
                    th = th12;
                    hashMap2 = hashMap4;
                }
            } catch (Throwable th13) {
                th = th13;
                hashMap = null;
                cursor = query;
            }
        } catch (Throwable th14) {
            th = th14;
            hashMap = null;
            cursor = null;
        }
        return hashMap2 != null ? hashMap2 : new HashMap();
    }

    public final void I() {
        L();
        qp messagesController = getMessagesController();
        messagesController.r1.clear();
        messagesController.w1.clear();
        SharedPreferences.Editor edit = qp.s1(this.currentAccount).e7.edit();
        edit.putBoolean("needGetStatuses", true).commit();
        getConnectionsManager().sendRequest(new TLRPC.TL_contacts_getStatuses(), new r4(2, this, edit));
    }

    public final void J(boolean z9) {
        try {
            if (qp.s1(this.currentAccount).e7.getLong("lastReloadStatusTime", 0L) >= System.currentTimeMillis() - 10800000 && !z9) {
                return;
            }
            I();
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    public final void K() {
        getConnectionsManager().sendRequest(new TLRPC.TL_contacts_resetSaved(), new di.u5(9));
    }

    public final void L() {
        try {
            qp.s1(this.currentAccount).e7.edit().putLong("lastReloadStatusTime", System.currentTimeMillis()).commit();
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    public final void M(int i7, ArrayList arrayList) {
        switch (i7) {
            case 0:
                this.J = arrayList;
                break;
            case 1:
                this.K = arrayList;
                break;
            case 2:
                this.L = arrayList;
                break;
            case 3:
                this.M = arrayList;
                break;
            case 4:
                this.N = arrayList;
                break;
            case 5:
                this.Q = arrayList;
                break;
            case 6:
                this.R = arrayList;
                break;
            case 7:
                this.S = arrayList;
                break;
            case 8:
                this.T = arrayList;
                break;
            case 9:
                this.O = arrayList;
                break;
            case 11:
                this.U = arrayList;
                break;
            case 12:
                this.V = arrayList;
                break;
            case 13:
                this.W = arrayList;
                break;
            case 14:
                this.P = arrayList;
                break;
        }
        getNotificationCenter().k(qs.k0, new Object[0]);
        I();
    }

    public final void N() {
        HashMap hashMap = new HashMap();
        int size = this.e0.size();
        for (int i7 = 0; i7 < size; i7++) {
            TLRPC.TL_contact tL_contact = (TLRPC.TL_contact) this.e0.get(i7);
            TLRPC.User a22 = getMessagesController().a2(Long.valueOf(tL_contact.user_id));
            if (a22 != null && !TextUtils.isEmpty(a22.phone)) {
                hashMap.put(a22.phone, tL_contact);
            }
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = this.Y.entrySet().iterator();
        while (it.hasNext()) {
            d5 d5Var = (d5) ((Map.Entry) it.next()).getValue();
            int i10 = 0;
            while (true) {
                if (i10 >= d5Var.e.size()) {
                    arrayList.add(d5Var);
                    break;
                } else if (!hashMap.containsKey((String) d5Var.g.get(i10)) && ((Integer) d5Var.h.get(i10)).intValue() != 1) {
                    i10++;
                }
            }
        }
        Collections.sort(arrayList, new t4(u(), 1));
        this.a0 = arrayList;
    }

    public final void a(TLRPC.User user) {
        Uri uri;
        if (this.a == null || t0.b.checkSelfPermission("android.permission.WRITE_CONTACTS") != 0) {
            return;
        }
        synchronized (this.f) {
            this.d = true;
        }
        ContentResolver contentResolver = t0.b.getContentResolver();
        try {
            contentResolver.delete(ContactsContract.RawContacts.CONTENT_URI.buildUpon().appendQueryParameter("caller_is_syncadapter", "true").appendQueryParameter("account_name", this.a.name).appendQueryParameter("account_type", this.a.type).build(), "sync2 = " + user.id, null);
        } catch (Exception unused) {
        }
        ArrayList<ContentProviderOperation> arrayList = new ArrayList<>();
        b(arrayList, user);
        try {
            ContentProviderResult[] applyBatch = contentResolver.applyBatch("com.android.contacts", arrayList);
            if (applyBatch != null && applyBatch.length > 0 && (uri = applyBatch[0].uri) != null) {
                Long.parseLong(uri.getLastPathSegment());
            }
        } catch (Exception e10) {
            a8.g(e10, true);
        }
        synchronized (this.f) {
            this.d = false;
        }
    }

    public final void b(ArrayList arrayList, TLRPC.User user) {
        String str;
        if (user == null) {
            return;
        }
        int size = arrayList.size();
        ContentProviderOperation.Builder newInsert = ContentProviderOperation.newInsert(ContactsContract.RawContacts.CONTENT_URI);
        newInsert.withValue("account_name", this.a.name);
        newInsert.withValue("account_type", this.a.type);
        newInsert.withValue("sync1", TextUtils.isEmpty(user.phone) ? "" : user.phone);
        newInsert.withValue("sync2", Long.valueOf(user.id));
        arrayList.add(newInsert.build());
        Uri uri = ContactsContract.Data.CONTENT_URI;
        ContentProviderOperation.Builder newInsert2 = ContentProviderOperation.newInsert(uri);
        newInsert2.withValueBackReference("raw_contact_id", size);
        newInsert2.withValue("mimetype", "vnd.android.cursor.item/name");
        newInsert2.withValue("data2", user.first_name);
        newInsert2.withValue("data3", user.last_name);
        arrayList.add(newInsert2.build());
        if (TextUtils.isEmpty(user.phone)) {
            str = m(0, user.first_name, user.last_name);
        } else {
            str = "+" + user.phone;
        }
        ContentProviderOperation.Builder newInsert3 = ContentProviderOperation.newInsert(uri);
        newInsert3.withValueBackReference("raw_contact_id", size);
        newInsert3.withValue("mimetype", "vnd.android.cursor.item/vnd.org.telegram.messenger.android.profile");
        newInsert3.withValue("data1", Long.valueOf(user.id));
        newInsert3.withValue("data2", "Telegram Profile");
        newInsert3.withValue("data3", id.a0("ContactShortcutMessage", null, 2131751786, str));
        newInsert3.withValue("data4", Long.valueOf(user.id));
        arrayList.add(newInsert3.build());
        ContentProviderOperation.Builder newInsert4 = ContentProviderOperation.newInsert(uri);
        newInsert4.withValueBackReference("raw_contact_id", size);
        newInsert4.withValue("mimetype", "vnd.android.cursor.item/vnd.org.telegram.messenger.android.call");
        newInsert4.withValue("data1", Long.valueOf(user.id));
        newInsert4.withValue("data2", "Telegram Voice Call");
        newInsert4.withValue("data3", id.a0("ContactShortcutVoiceCall", null, 2131751784, str));
        newInsert4.withValue("data4", Long.valueOf(user.id));
        arrayList.add(newInsert4.build());
        ContentProviderOperation.Builder newInsert5 = ContentProviderOperation.newInsert(uri);
        newInsert5.withValueBackReference("raw_contact_id", size);
        newInsert5.withValue("mimetype", "vnd.android.cursor.item/vnd.org.telegram.messenger.android.call.video");
        newInsert5.withValue("data1", Long.valueOf(user.id));
        newInsert5.withValue("data2", "Telegram Video Call");
        newInsert5.withValue("data3", id.a0("ContactShortcutVideoCall", null, 2131751785, str));
        newInsert5.withValue("data4", Long.valueOf(user.id));
        arrayList.add(newInsert5.build());
    }

    public final void c(ArrayList arrayList, ConcurrentHashMap concurrentHashMap, ArrayList arrayList2, ArrayList arrayList3) {
        ArrayList arrayList4;
        ArrayList arrayList5;
        int indexOf;
        int indexOf2;
        if (arrayList2 == null || arrayList3 == null) {
            arrayList4 = new ArrayList();
            arrayList5 = new ArrayList();
            for (int i7 = 0; i7 < arrayList.size(); i7++) {
                Long l10 = (Long) arrayList.get(i7);
                if (l10.longValue() > 0) {
                    TLRPC.TL_contact tL_contact = new TLRPC.TL_contact();
                    tL_contact.user_id = l10.longValue();
                    arrayList4.add(tL_contact);
                } else if (l10.longValue() < 0) {
                    arrayList5.add(Long.valueOf(-l10.longValue()));
                }
            }
        } else {
            arrayList4 = arrayList2;
            arrayList5 = arrayList3;
        }
        if (r2.a) {
            a8.b("process update - contacts add = " + arrayList4.size() + " delete = " + arrayList5.size());
        }
        StringBuilder sb2 = new StringBuilder();
        StringBuilder sb3 = new StringBuilder();
        boolean z9 = false;
        for (int i10 = 0; i10 < arrayList4.size(); i10++) {
            TLRPC.TL_contact tL_contact2 = (TLRPC.TL_contact) arrayList4.get(i10);
            TLRPC.User user = concurrentHashMap != null ? (TLRPC.User) concurrentHashMap.get(Long.valueOf(tL_contact2.user_id)) : null;
            if (user == null) {
                user = getMessagesController().a2(Long.valueOf(tL_contact2.user_id));
            } else {
                getMessagesController().X3(user, true, false);
            }
            if (user == null || TextUtils.isEmpty(user.phone)) {
                z9 = true;
            } else {
                d5 d5Var = (d5) this.Z.get(user.phone);
                if (d5Var != null && (indexOf2 = d5Var.g.indexOf(user.phone)) != -1) {
                    d5Var.h.set(indexOf2, 0);
                }
                if (sb2.length() != 0) {
                    sb2.append(",");
                }
                sb2.append(user.phone);
            }
        }
        for (int i11 = 0; i11 < arrayList5.size(); i11++) {
            Long l11 = (Long) arrayList5.get(i11);
            Utilities.h.c(new b4(26, this, l11));
            TLRPC.User user2 = concurrentHashMap != null ? (TLRPC.User) concurrentHashMap.get(l11) : null;
            if (user2 == null) {
                user2 = getMessagesController().a2(l11);
            } else {
                getMessagesController().X3(user2, true, false);
            }
            if (user2 == null) {
                z9 = true;
            } else if (!TextUtils.isEmpty(user2.phone)) {
                d5 d5Var2 = (d5) this.Z.get(user2.phone);
                if (d5Var2 != null && (indexOf = d5Var2.g.indexOf(user2.phone)) != -1) {
                    d5Var2.h.set(indexOf, 1);
                }
                if (sb3.length() != 0) {
                    sb3.append(",");
                }
                sb3.append(user2.phone);
            }
        }
        if (sb2.length() != 0 || sb3.length() != 0) {
            getMessagesStorage().f(sb2.toString(), sb3.toString());
        }
        if (z9) {
            Utilities.d.c(new k4(this, 2));
        } else {
            g0.h3(new ng(this, arrayList4, arrayList5, 15));
        }
    }

    public final void d(boolean z9) {
        Collator u10 = u();
        if (z9) {
            Collections.sort(this.e0, new s4(this, u10, 0));
        }
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        for (int i7 = 0; i7 < this.e0.size(); i7++) {
            TLRPC.TL_contact tL_contact = (TLRPC.TL_contact) this.e0.get(i7);
            TLRPC.User a22 = getMessagesController().a2(Long.valueOf(tL_contact.user_id));
            if (a22 != null) {
                String j3 = t10.j(a22, true);
                if (j3.length() > 1) {
                    j3 = j3.substring(0, 1);
                }
                String upperCase = j3.length() == 0 ? "#" : j3.toUpperCase();
                String str = (String) this.E.get(upperCase);
                if (str != null) {
                    upperCase = str;
                }
                ArrayList arrayList2 = (ArrayList) hashMap.get(upperCase);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                    hashMap.put(upperCase, arrayList2);
                    arrayList.add(upperCase);
                }
                arrayList2.add(tL_contact);
            }
        }
        Collections.sort(arrayList, new t4(u10, 0));
        this.g0 = hashMap;
        this.h0 = arrayList;
    }

    public final boolean e() {
        boolean z9 = false;
        try {
        } catch (Exception e10) {
            a8.g(e10, true);
        }
        if (!w()) {
            return false;
        }
        try {
            Cursor query = t0.b.getContentResolver().query(ContactsContract.RawContacts.CONTENT_URI, new String[]{"version"}, null, null, null);
            if (query != null) {
                try {
                    StringBuilder sb2 = new StringBuilder();
                    while (query.moveToNext()) {
                        sb2.append(query.getString(query.getColumnIndex("version")));
                    }
                    String sb3 = sb2.toString();
                    if (this.w.length() != 0 && !this.w.equals(sb3)) {
                        z9 = true;
                    }
                    this.w = sb3;
                } catch (Throwable th2) {
                    boolean z10 = z9;
                    try {
                        try {
                            query.close();
                            throw th2;
                        } catch (Exception e11) {
                            e = e11;
                            z9 = z10;
                            a8.g(e, true);
                            return z9;
                        }
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                        throw th2;
                    }
                }
            }
            if (query != null) {
                query.close();
            }
        } catch (Exception e12) {
            e = e12;
        }
        return z9;
    }

    public final void f() {
        SharedPreferences sharedPreferences = qp.s1(this.currentAccount).e7;
        this.y = sharedPreferences.getString("invitelink", null);
        int i7 = sharedPreferences.getInt("invitelinktime", 0);
        if (this.D) {
            return;
        }
        if (this.y == null || Math.abs((System.currentTimeMillis() / 1000) - i7) >= 86400) {
            this.D = true;
            getConnectionsManager().sendRequest(new TLRPC.TL_help_getInviteText(), new q4(this, 0), 2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0238 A[Catch: Exception -> 0x023c, TryCatch #0 {Exception -> 0x023c, blocks: (B:22:0x0238, B:23:0x023f, B:20:0x01a9), top: B:19:0x01a9 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g(long j3, String str, String str2) {
        Cursor cursor;
        int parseInt;
        Cursor cursor2;
        if (!w()) {
            return;
        }
        try {
            ContentResolver contentResolver = t0.b.getContentResolver();
            ArrayList<ContentProviderOperation> arrayList = new ArrayList<>();
            Uri build = ContactsContract.Groups.CONTENT_URI.buildUpon().appendQueryParameter("caller_is_syncadapter", "true").build();
            Uri build2 = ContactsContract.RawContacts.CONTENT_URI.buildUpon().appendQueryParameter("caller_is_syncadapter", "true").build();
            Account account = this.a;
            Cursor query = contentResolver.query(build, new String[]{"_id"}, "title=? AND account_type=? AND account_name=?", new String[]{"TelegramConnectionService", account.type, account.name}, null);
            if (query == null || !query.moveToFirst()) {
                ContentValues contentValues = new ContentValues();
                cursor = query;
                contentValues.put("account_type", this.a.type);
                contentValues.put("account_name", this.a.name);
                contentValues.put("group_visible", (Integer) 0);
                contentValues.put("group_is_read_only", (Integer) 1);
                contentValues.put("title", "TelegramConnectionService");
                parseInt = Integer.parseInt(contentResolver.insert(build, contentValues).getLastPathSegment());
            } else {
                parseInt = query.getInt(0);
                cursor = query;
            }
            if (cursor != null) {
                cursor.close();
            }
            Uri uri = ContactsContract.Data.CONTENT_URI;
            Cursor query2 = contentResolver.query(uri, new String[]{"raw_contact_id"}, "mimetype=? AND data1=?", new String[]{"vnd.android.cursor.item/group_membership", parseInt + ""}, null);
            int size = arrayList.size();
            int i7 = parseInt;
            try {
                if (query2 != null) {
                    try {
                        if (query2.moveToFirst()) {
                            int i10 = query2.getInt(0);
                            cursor2 = query2;
                            arrayList.add(ContentProviderOperation.newUpdate(build2).withSelection("_id=?", new String[]{i10 + ""}).withValue("deleted", 0).build());
                            ContentProviderOperation.Builder withSelection = ContentProviderOperation.newUpdate(uri).withSelection("raw_contact_id=? AND mimetype=?", new String[]{i10 + "", "vnd.android.cursor.item/phone_v2"});
                            StringBuilder sb2 = new StringBuilder("+99084");
                            sb2.append(j3);
                            arrayList.add(withSelection.withValue("data1", sb2.toString()).build());
                            arrayList.add(ContentProviderOperation.newUpdate(uri).withSelection("raw_contact_id=? AND mimetype=?", new String[]{i10 + "", "vnd.android.cursor.item/name"}).withValue("data2", str).withValue("data3", str2).build());
                            if (cursor2 != null) {
                                cursor2.close();
                            }
                            contentResolver.applyBatch("com.android.contacts", arrayList);
                            return;
                        }
                    } catch (Exception e10) {
                        e = e10;
                        a8.g(e, true);
                        return;
                    }
                }
                arrayList.add(ContentProviderOperation.newInsert(build2).withValue("account_type", this.a.type).withValue("account_name", this.a.name).withValue("raw_contact_is_read_only", 1).withValue("aggregation_mode", 3).build());
                arrayList.add(ContentProviderOperation.newInsert(uri).withValueBackReference("raw_contact_id", size).withValue("mimetype", "vnd.android.cursor.item/name").withValue("data2", str).withValue("data3", str2).build());
                arrayList.add(ContentProviderOperation.newInsert(uri).withValueBackReference("raw_contact_id", size).withValue("mimetype", "vnd.android.cursor.item/phone_v2").withValue("data1", "+99084" + j3).build());
                arrayList.add(ContentProviderOperation.newInsert(uri).withValueBackReference("raw_contact_id", size).withValue("mimetype", "vnd.android.cursor.item/group_membership").withValue("data1", Integer.valueOf(i7)).build());
                if (cursor2 != null) {
                }
                contentResolver.applyBatch("com.android.contacts", arrayList);
                return;
            } catch (Exception e11) {
                e = e11;
                a8.g(e, true);
                return;
            }
            cursor2 = query2;
        } catch (Exception e12) {
            e = e12;
        }
    }

    public final void h() {
        if (w()) {
            try {
                ContentResolver contentResolver = t0.b.getContentResolver();
                Account account = this.a;
                Cursor query = contentResolver.query(ContactsContract.Groups.CONTENT_URI, new String[]{"_id"}, "title=? AND account_type=? AND account_name=?", new String[]{"TelegramConnectionService", account.type, account.name}, null);
                if (query == null || !query.moveToFirst()) {
                    if (query != null) {
                        query.close();
                        return;
                    }
                    return;
                }
                int i7 = query.getInt(0);
                query.close();
                Cursor query2 = contentResolver.query(ContactsContract.Data.CONTENT_URI, new String[]{"raw_contact_id"}, "mimetype=? AND data1=?", new String[]{"vnd.android.cursor.item/group_membership", i7 + ""}, null);
                if (query2 == null || !query2.moveToFirst()) {
                    if (query2 != null) {
                        query2.close();
                        return;
                    }
                    return;
                }
                int i10 = query2.getInt(0);
                query2.close();
                contentResolver.delete(ContactsContract.RawContacts.CONTENT_URI, "_id=?", new String[]{i10 + ""});
            } catch (Exception e10) {
                a8.g(e10, true);
            }
        }
    }

    public final void i(ArrayList arrayList, boolean z9) {
        if (arrayList.isEmpty()) {
            return;
        }
        TLRPC.TL_contacts_deleteContacts tL_contacts_deleteContacts = new TLRPC.TL_contacts_deleteContacts();
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            TLRPC.User user = (TLRPC.User) arrayList.get(i7);
            di.y6 P1 = getMessagesController().P1();
            long j3 = user.id;
            int i10 = P1.a;
            ArrayList arrayList3 = P1.h;
            ArrayList arrayList4 = P1.g;
            int i11 = 0;
            while (true) {
                if (i11 >= arrayList4.size()) {
                    break;
                }
                if (m5.o(((TL_stories.PeerStories) arrayList4.get(i11)).peer) == j3) {
                    arrayList4.remove(i11);
                    break;
                }
                i11++;
            }
            int i12 = 0;
            while (true) {
                if (i12 >= arrayList3.size()) {
                    break;
                }
                if (m5.o(((TL_stories.PeerStories) arrayList3.get(i12)).peer) == j3) {
                    arrayList3.remove(i12);
                    break;
                }
                i12++;
            }
            di.l7 l7Var = P1.k;
            l7Var.b.a.c(new bi.r3(l7Var, j3, 6));
            qp.s1(i10).D();
            qs.f(i10).k(qs.v5, new Object[0]);
            TLRPC.InputUser q12 = getMessagesController().q1(user);
            user.contact = false;
            arrayList2.add(Long.valueOf(user.id));
            tL_contacts_deleteContacts.id.add(q12);
        }
        getConnectionsManager().sendRequest(tL_contacts_deleteContacts, new p4(this, arrayList2, arrayList, z9, ((TLRPC.User) arrayList.get(0)).first_name));
    }

    public final void j(long j3) {
        if (w()) {
            synchronized (this.f) {
                this.d = true;
            }
            try {
                t0.b.getContentResolver().delete(ContactsContract.RawContacts.CONTENT_URI.buildUpon().appendQueryParameter("caller_is_syncadapter", "true").appendQueryParameter("account_name", this.a.name).appendQueryParameter("account_type", this.a.type).build(), "sync2 = " + j3, null);
            } catch (Exception e10) {
                a8.g(e10, false);
            }
            synchronized (this.f) {
                this.d = false;
            }
        }
    }

    public final void k(ContentResolver contentResolver, Account account, ArrayList arrayList, a0.h hVar, a0.h hVar2) {
        synchronized (this.f) {
            this.d = true;
        }
        try {
            Uri build = ContactsContract.RawContacts.CONTENT_URI.buildUpon().appendQueryParameter("caller_is_syncadapter", "true").build();
            if (arrayList.size() > (hVar.m() * 2) + 500) {
                contentResolver.delete(build, "account_type=? AND account_name=? AND sync2 IS NOT NULL", new String[]{account.type, account.name});
                for (int i7 = 0; i7 < hVar.m(); i7++) {
                    long j3 = hVar.j(i7);
                    if (((Long) hVar.n(i7)).equals(hVar2.f(j3))) {
                        hVar2.l(j3);
                    }
                }
            } else {
                StringBuilder sb2 = new StringBuilder();
                int i10 = 0;
                while (i10 < arrayList.size()) {
                    if (sb2.length() != 0) {
                        sb2.append(',');
                    }
                    sb2.append(arrayList.get(i10));
                    int i11 = i10 + 1;
                    if (i11 % 500 == 0 || i10 == arrayList.size() - 1) {
                        contentResolver.delete(build, "_id IN (" + ((Object) sb2) + ")", null);
                        sb2.setLength(0);
                    }
                    i10 = i11;
                }
            }
        } catch (Exception e10) {
            a8.g(e10, true);
        }
        synchronized (this.f) {
            this.d = false;
        }
    }

    public final void l() {
        Utilities.e.c(new k4(this, 1));
    }

    public final String s(int i7) {
        String str = this.y;
        if (str == null) {
            str = "https://telegram.org/dl";
        }
        if (i7 <= 1) {
            return id.a0(null, null, 2131749117, str);
        }
        try {
            return String.format(id.K0(i7, "InviteTextNum"), Integer.valueOf(i7), str);
        } catch (Exception unused) {
            return id.a0(null, null, 2131749117, str);
        }
    }

    public final boolean t(int i7) {
        return this.I[i7] != 2;
    }

    public final ArrayList v(int i7) {
        switch (i7) {
            case 0:
                return this.J;
            case 1:
                return this.K;
            case 2:
                return this.L;
            case 3:
                return this.M;
            case 4:
                return this.N;
            case 5:
                return this.Q;
            case 6:
                return this.R;
            case 7:
                return this.S;
            case 8:
                return this.T;
            case 9:
                return this.O;
            case 10:
            default:
                return null;
            case 11:
                return this.U;
            case 12:
                return this.V;
            case 13:
                return this.W;
            case 14:
                return this.P;
        }
    }

    public final boolean x(long j3) {
        return this.f0.get(Long.valueOf(j3)) != null;
    }

    public final boolean y() {
        boolean z9;
        synchronized (this.c) {
            z9 = this.b;
        }
        return z9;
    }
}
