// default package

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
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class lv2 extends rf0 {
    public static Locale o0;
    public static Collator p0;
    public static final String[] q0 = {"lookup", "data1", "data2", "data3", "display_name", "account_type"};
    public static final String[] r0 = {"lookup", "data2", "data3", "data5"};
    public static volatile lv2[] s0 = new lv2[4];
    public boolean E;
    public final HashMap F;
    public byte G;
    public byte H;
    public int I;
    public final int[] J;
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
    public ArrayList X;
    public TLRPC.GlobalPrivacySettings Y;
    public HashMap Z;
    public Account a;
    public HashMap a0;
    public boolean b;
    public ArrayList b0;
    public final Object c;
    public HashMap c0;
    public boolean d;
    public ArrayList d0;
    public boolean e;
    public HashMap e0;
    public final Object f;
    public ArrayList f0;
    public ConcurrentHashMap g0;
    public boolean h;
    public HashMap h0;
    public ArrayList i0;
    public HashMap j0;
    public ArrayList k0;
    public HashMap l0;
    public HashMap m0;
    public boolean n;
    public int n0;
    public boolean r;
    public boolean s;
    public String w;
    public final ArrayList x;
    public String y;

    public lv2(int i) {
        super(i);
        this.c = new Object();
        this.f = new Object();
        this.w = "";
        this.x = new ArrayList();
        HashMap hashMap = new HashMap();
        this.F = hashMap;
        this.J = new int[15];
        this.Z = new HashMap();
        this.a0 = new HashMap();
        this.b0 = new ArrayList();
        this.c0 = new HashMap();
        this.d0 = new ArrayList();
        this.e0 = new HashMap();
        this.f0 = new ArrayList();
        this.g0 = new ConcurrentHashMap(20, 1.0f, 2);
        this.h0 = new HashMap();
        this.i0 = new ArrayList();
        this.j0 = new HashMap();
        this.k0 = new ArrayList();
        this.l0 = new HashMap();
        this.m0 = new HashMap();
        if (uc7.s1(this.currentAccount).X3.getBoolean("needGetStatuses", false)) {
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
        if (i == 0) {
            Utilities.e.c(new pu2(this, (byte) 6));
        }
    }

    public static String m(int i, String str, String str2) {
        if (str != null) {
            str = str.trim();
        }
        if (str != null && str2 == null && i > 0 && str.contains(" ")) {
            int indexOf = str.indexOf(" ");
            String substring = str.substring(indexOf + 1);
            str = str.substring(0, indexOf);
            str2 = substring;
        }
        if (str2 != null) {
            str2 = str2.trim();
        }
        StringBuilder sb = new StringBuilder((str != null ? str.length() : 0) + (str2 != null ? str2.length() : 0) + 1);
        if (ob6.b0 == 1) {
            if (str == null || str.length() <= 0) {
                if (str2 != null && str2.length() > 0) {
                    if (i > 0 && str2.length() > i + 2) {
                        return str2.substring(0, i).concat("…");
                    }
                    sb.append(str2);
                }
            } else {
                if (i > 0 && str.length() > i + 2) {
                    return str.substring(0, i).concat("…");
                }
                sb.append(str);
                if (str2 != null && str2.length() > 0) {
                    sb.append(" ");
                    if (i > 0) {
                        if (str2.length() + sb.length() > i) {
                            sb.append(str2.charAt(0));
                        }
                    }
                    sb.append(str2);
                }
            }
        } else if (str2 == null || str2.length() <= 0) {
            if (str != null && str.length() > 0) {
                if (i > 0 && str.length() > i + 2) {
                    return str.substring(0, i).concat("…");
                }
                sb.append(str);
            }
        } else {
            if (i > 0 && str2.length() > i + 2) {
                return str2.substring(0, i).concat("…");
            }
            sb.append(str2);
            if (str != null && str.length() > 0) {
                sb.append(" ");
                if (i > 0) {
                    if (str.length() + sb.length() > i) {
                        sb.append(str.charAt(0));
                    }
                }
                sb.append(str);
            }
        }
        return sb.toString();
    }

    public static String n(String str, String str2) {
        return m(0, str, str2);
    }

    public static String o(TLObject tLObject) {
        return tLObject instanceof TLRPC.User ? p((TLRPC.User) tLObject) : tLObject instanceof TLRPC.Chat ? ((TLRPC.Chat) tLObject).title : ob6.M0(2131749082, null);
    }

    public static String p(TLRPC.User user) {
        return user == null ? "" : m(0, user.first_name, user.last_name);
    }

    public static HashMap q(HashMap hashMap) {
        HashMap hashMap2 = new HashMap();
        for (Map.Entry entry : hashMap.entrySet()) {
            iv2 iv2Var = new iv2();
            iv2 iv2Var2 = (iv2) entry.getValue();
            iv2Var.h.addAll(iv2Var2.h);
            iv2Var.e.addAll(iv2Var2.e);
            iv2Var.f.addAll(iv2Var2.f);
            iv2Var.g.addAll(iv2Var2.g);
            iv2Var.i = iv2Var2.i;
            iv2Var.j = iv2Var2.j;
            iv2Var.a = iv2Var2.a;
            String str = iv2Var2.b;
            iv2Var.b = str;
            hashMap2.put(str, iv2Var);
        }
        return hashMap2;
    }

    public static lv2 r(int i) {
        lv2 lv2Var;
        lv2 lv2Var2 = s0[i];
        if (lv2Var2 != null) {
            return lv2Var2;
        }
        synchronized (lv2.class) {
            lv2Var = s0[i];
            if (lv2Var == null) {
                lv2[] lv2VarArr = s0;
                lv2 lv2Var3 = new lv2(i);
                lv2VarArr[i] = lv2Var3;
                lv2Var = lv2Var3;
            }
        }
        return lv2Var;
    }

    public static Collator u() {
        if (p0 == null || o0 != Locale.getDefault()) {
            try {
                Locale locale = Locale.getDefault();
                o0 = locale;
                Collator collator = Collator.getInstance(locale);
                p0 = collator;
                collator.setStrength(1);
            } catch (Exception e) {
                cc4.g(e, true);
            }
        }
        if (p0 == null) {
            try {
                Collator collator2 = Collator.getInstance();
                p0 = collator2;
                collator2.setStrength(1);
            } catch (Exception e2) {
                cc4.g(e2, true);
            }
        }
        if (p0 == null) {
            p0 = new hv2();
        }
        return p0;
    }

    public static boolean w() {
        return a.b.checkSelfPermission("android.permission.READ_CONTACTS") == 0;
    }

    public static boolean z(String str) {
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        int length = str.length();
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            char charAt = str.charAt(i2);
            if (charAt >= '0' && charAt <= '9') {
                i++;
            }
        }
        return i > 3;
    }

    public final void A(long j, boolean z) {
        synchronized (this.c) {
            this.b = true;
        }
        if (z) {
            if (f11.a) {
                cc4.b("load contacts from cache");
            }
            jf7 messagesStorage = getMessagesStorage();
            messagesStorage.a.c(new be7(messagesStorage, (byte) 16));
            return;
        }
        if (f11.a) {
            cc4.b("load contacts from server");
        }
        TLRPC.TL_contacts_getContacts tL_contacts_getContacts = new TLRPC.TL_contacts_getContacts();
        tL_contacts_getContacts.hash = j;
        getConnectionsManager().sendRequest(tL_contacts_getContacts, new yu2(this, j, (byte) 0));
    }

    public final void B() {
        if (this.G == 0) {
            this.G = (byte) 1;
            getConnectionsManager().sendRequest(new TL_account.getGlobalPrivacySettings(), new ou2(this, (byte) 0));
        }
    }

    public final void C() {
        D(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b7 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void D(boolean z) {
        byte b = 1;
        if (this.H == 0) {
            this.H = (byte) 1;
            getConnectionsManager().sendRequest(new TL_account.getAccountTTL(), new ou2(this, (byte) 2));
        }
        B();
        int i = 0;
        while (true) {
            int[] iArr = this.J;
            if (i >= iArr.length) {
                getNotificationCenter().k(jn7.k0, new Object[0]);
                return;
            }
            if (z) {
                if (iArr[i] == 1) {
                    i++;
                }
                iArr[i] = 1;
                TL_account.getPrivacy getprivacy = new TL_account.getPrivacy();
                switch (i) {
                    case 0:
                        getprivacy.key = new TLRPC.TL_inputPrivacyKeyStatusTimestamp();
                        getConnectionsManager().sendRequest(getprivacy, new b22(this, i, b));
                        break;
                    case 1:
                        getprivacy.key = new TLRPC.TL_inputPrivacyKeyChatInvite();
                        getConnectionsManager().sendRequest(getprivacy, new b22(this, i, b));
                        break;
                    case 2:
                        getprivacy.key = new TLRPC.TL_inputPrivacyKeyPhoneCall();
                        getConnectionsManager().sendRequest(getprivacy, new b22(this, i, b));
                        break;
                    case 3:
                        getprivacy.key = new TLRPC.TL_inputPrivacyKeyPhoneP2P();
                        getConnectionsManager().sendRequest(getprivacy, new b22(this, i, b));
                        break;
                    case 4:
                        getprivacy.key = new TLRPC.TL_inputPrivacyKeyProfilePhoto();
                        getConnectionsManager().sendRequest(getprivacy, new b22(this, i, b));
                        break;
                    case 5:
                        getprivacy.key = new TLRPC.TL_inputPrivacyKeyForwards();
                        getConnectionsManager().sendRequest(getprivacy, new b22(this, i, b));
                        break;
                    case 6:
                        getprivacy.key = new TLRPC.TL_inputPrivacyKeyPhoneNumber();
                        getConnectionsManager().sendRequest(getprivacy, new b22(this, i, b));
                        break;
                    case 7:
                        getprivacy.key = new TLRPC.TL_inputPrivacyKeyAddedByPhone();
                        getConnectionsManager().sendRequest(getprivacy, new b22(this, i, b));
                        break;
                    case 8:
                        getprivacy.key = new TLRPC.TL_inputPrivacyKeyVoiceMessages();
                        getConnectionsManager().sendRequest(getprivacy, new b22(this, i, b));
                        break;
                    case 9:
                        getprivacy.key = new TLRPC.TL_inputPrivacyKeyAbout();
                        getConnectionsManager().sendRequest(getprivacy, new b22(this, i, b));
                        break;
                    case 11:
                        getprivacy.key = new TLRPC.TL_inputPrivacyKeyBirthday();
                        getConnectionsManager().sendRequest(getprivacy, new b22(this, i, b));
                        break;
                    case 12:
                        getprivacy.key = new TLRPC.TL_inputPrivacyKeyStarGiftsAutoSave();
                        getConnectionsManager().sendRequest(getprivacy, new b22(this, i, b));
                        break;
                    case 13:
                        getprivacy.key = new TLRPC.TL_inputPrivacyKeyNoPaidMessages();
                        getConnectionsManager().sendRequest(getprivacy, new b22(this, i, b));
                        break;
                    case 14:
                        getprivacy.key = new TLRPC.TL_inputPrivacyKeySavedMusic();
                        getConnectionsManager().sendRequest(getprivacy, new b22(this, i, b));
                        break;
                }
                i++;
            } else {
                if (iArr[i] != 0) {
                    i++;
                }
                iArr[i] = 1;
                TL_account.getPrivacy getprivacy2 = new TL_account.getPrivacy();
                switch (i) {
                }
                i++;
            }
        }
    }

    public final void E(HashMap hashMap, ArrayList arrayList, HashMap hashMap2, boolean z) {
        Utilities.e.c(new y6a(this, z, new ArrayList(this.f0), hashMap2, hashMap, arrayList));
    }

    public final void F(final HashMap hashMap, final boolean z, final boolean z2, final boolean z3, final boolean z4, final boolean z5, final boolean z6) {
        if (z2 || this.r) {
            Utilities.e.c(new Runnable() { // from class: gv2
                /* JADX WARN: Code restructure failed: missing block: B:148:0x017c, code lost:
                
                    if (r6.j.equals(r4.j) == false) goto L51;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:49:0x0167, code lost:
                
                    if (r6.i.equals(r4.i) != false) goto L47;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:50:0x017e, code lost:
                
                    r5 = true;
                 */
                /* JADX WARN: Removed duplicated region for block: B:104:0x029b  */
                /* JADX WARN: Removed duplicated region for block: B:194:0x04ee  */
                /* JADX WARN: Removed duplicated region for block: B:196:0x050a  */
                /* JADX WARN: Removed duplicated region for block: B:198:0x0518  */
                /* JADX WARN: Removed duplicated region for block: B:74:0x021c  */
                @Override // java.lang.Runnable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void run() {
                    boolean z7;
                    ArrayList arrayList;
                    boolean z8;
                    HashMap hashMap2;
                    HashMap hashMap3;
                    HashMap hashMap4;
                    HashMap hashMap5;
                    HashMap hashMap6;
                    int i;
                    int i2;
                    HashMap hashMap7;
                    HashMap hashMap8;
                    final int i3;
                    iv2 iv2Var;
                    boolean z9;
                    HashMap hashMap9;
                    HashMap hashMap10;
                    HashMap hashMap11;
                    HashMap hashMap12;
                    int i4;
                    int indexOf;
                    HashMap hashMap13;
                    int i5;
                    HashMap hashMap14;
                    int i6;
                    boolean z10;
                    boolean z11;
                    final lv2 lv2Var = lv2.this;
                    HashMap hashMap15 = hashMap;
                    boolean z12 = z3;
                    boolean z13 = z;
                    boolean z14 = z2;
                    boolean z15 = z4;
                    boolean z16 = z5;
                    boolean z17 = z6;
                    HashMap hashMap16 = new HashMap();
                    Iterator it = hashMap15.entrySet().iterator();
                    while (it.hasNext()) {
                        iv2 iv2Var2 = (iv2) ((Map.Entry) it.next()).getValue();
                        for (int i7 = 0; i7 < iv2Var2.g.size(); i7++) {
                            hashMap16.put((String) iv2Var2.g.get(i7), iv2Var2);
                        }
                    }
                    if (f11.a) {
                        cc4.b("start read contacts from phone");
                    }
                    if (!z12) {
                        lv2Var.e();
                    }
                    HashMap H = lv2Var.H();
                    HashMap hashMap17 = new HashMap();
                    HashMap hashMap18 = new HashMap();
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it2 = H.entrySet().iterator();
                    while (it2.hasNext()) {
                        iv2 iv2Var3 = (iv2) ((Map.Entry) it2.next()).getValue();
                        int size = iv2Var3.g.size();
                        boolean z18 = z17;
                        int i8 = 0;
                        while (true) {
                            z11 = z13;
                            if (i8 >= size) {
                                break;
                            }
                            hashMap18.put(((String) iv2Var3.g.get(i8)).substring(Math.max(0, r2.length() - 7)), iv2Var3);
                            i8++;
                            z13 = z11;
                            z14 = z14;
                        }
                        boolean z19 = z14;
                        String a = iv2.a(iv2Var3.i, iv2Var3.j);
                        ArrayList arrayList3 = (ArrayList) hashMap17.get(a);
                        if (arrayList3 == null) {
                            arrayList3 = new ArrayList();
                            hashMap17.put(a, arrayList3);
                            arrayList2.add(a);
                        }
                        arrayList3.add(iv2Var3);
                        z17 = z18;
                        z13 = z11;
                        z14 = z19;
                    }
                    boolean z20 = z17;
                    boolean z21 = z13;
                    final boolean z22 = z14;
                    HashMap hashMap19 = new HashMap();
                    int size2 = hashMap15.size();
                    ArrayList arrayList4 = new ArrayList();
                    if (hashMap15.isEmpty()) {
                        z7 = z12;
                        arrayList = arrayList2;
                        z8 = z16;
                        hashMap2 = H;
                        hashMap3 = hashMap17;
                        hashMap4 = hashMap18;
                        if (z21) {
                            i = 0;
                            for (Map.Entry entry : hashMap2.entrySet()) {
                                iv2 iv2Var4 = (iv2) entry.getValue();
                                int i9 = i;
                                int i10 = 0;
                                while (i10 < iv2Var4.e.size()) {
                                    if (!z15) {
                                        String str = (String) iv2Var4.g.get(i10);
                                        String substring = str.substring(Math.max(0, str.length() - 7));
                                        TLRPC.TL_contact tL_contact = (TLRPC.TL_contact) lv2Var.l0.get(str);
                                        if (tL_contact != null) {
                                            TLRPC.User X1 = lv2Var.getMessagesController().X1(Long.valueOf(tL_contact.user_id));
                                            if (X1 != null) {
                                                i9++;
                                                String str2 = X1.first_name;
                                                if (str2 == null) {
                                                    str2 = "";
                                                }
                                                String str3 = X1.last_name;
                                                if (str3 == null) {
                                                    str3 = "";
                                                }
                                                if ((str2.equals(iv2Var4.i) && str3.equals(iv2Var4.j)) || (TextUtils.isEmpty(iv2Var4.i) && TextUtils.isEmpty(iv2Var4.j))) {
                                                    hashMap7 = hashMap19;
                                                    hashMap8 = hashMap15;
                                                    i10++;
                                                    hashMap15 = hashMap8;
                                                    hashMap19 = hashMap7;
                                                }
                                            }
                                        } else if (lv2Var.m0.containsKey(substring)) {
                                            i9++;
                                        }
                                    }
                                    TLRPC.TL_inputPhoneContact tL_inputPhoneContact = new TLRPC.TL_inputPhoneContact();
                                    hashMap7 = hashMap19;
                                    hashMap8 = hashMap15;
                                    tL_inputPhoneContact.client_id = iv2Var4.a | (i10 << 32);
                                    tL_inputPhoneContact.first_name = iv2Var4.i;
                                    tL_inputPhoneContact.last_name = iv2Var4.j;
                                    tL_inputPhoneContact.phone = (String) iv2Var4.e.get(i10);
                                    arrayList4.add(tL_inputPhoneContact);
                                    i10++;
                                    hashMap15 = hashMap8;
                                    hashMap19 = hashMap7;
                                }
                                i = i9;
                            }
                            hashMap5 = hashMap19;
                            hashMap6 = hashMap15;
                        } else {
                            hashMap5 = hashMap19;
                            hashMap6 = hashMap15;
                            i = 0;
                        }
                        i2 = 0;
                    } else {
                        Iterator it3 = H.entrySet().iterator();
                        i2 = 0;
                        int i11 = 0;
                        while (it3.hasNext()) {
                            Map.Entry entry2 = (Map.Entry) it3.next();
                            String str4 = (String) entry2.getKey();
                            Iterator it4 = it3;
                            iv2 iv2Var5 = (iv2) entry2.getValue();
                            iv2 iv2Var6 = (iv2) hashMap15.get(str4);
                            boolean z23 = z12;
                            ArrayList arrayList5 = arrayList2;
                            if (iv2Var6 == null) {
                                for (int i12 = 0; i12 < iv2Var5.g.size(); i12++) {
                                    iv2Var = (iv2) hashMap16.get(iv2Var5.g.get(i12));
                                    if (iv2Var != null) {
                                        str4 = iv2Var.b;
                                        break;
                                    }
                                }
                            }
                            iv2Var = iv2Var6;
                            if (iv2Var != null) {
                                iv2Var5.l = iv2Var.l;
                                if (TextUtils.isEmpty(iv2Var5.i)) {
                                    z9 = z16;
                                } else {
                                    z9 = z16;
                                }
                                if (!TextUtils.isEmpty(iv2Var5.j)) {
                                }
                            } else {
                                z9 = z16;
                            }
                            boolean z24 = false;
                            if (iv2Var == null || z24) {
                                hashMap9 = hashMap16;
                                hashMap10 = H;
                                hashMap11 = hashMap17;
                                hashMap12 = hashMap18;
                                while (i4 < iv2Var5.e.size()) {
                                    String str5 = (String) iv2Var5.g.get(i4);
                                    str5.substring(Math.max(0, str5.length() - 7));
                                    hashMap19.put(str5, iv2Var5);
                                    if (iv2Var != null && (indexOf = iv2Var.g.indexOf(str5)) != -1) {
                                        Integer num = (Integer) iv2Var.h.get(indexOf);
                                        iv2Var5.h.set(i4, num);
                                        i4 = num.intValue() == 1 ? i4 + 1 : 0;
                                    }
                                    if (z21) {
                                        if (!z24) {
                                            if (lv2Var.l0.containsKey(str5)) {
                                                i11++;
                                            } else {
                                                i2++;
                                            }
                                        }
                                        TLRPC.TL_inputPhoneContact tL_inputPhoneContact2 = new TLRPC.TL_inputPhoneContact();
                                        tL_inputPhoneContact2.client_id = iv2Var5.a | (i4 << 32);
                                        tL_inputPhoneContact2.first_name = iv2Var5.i;
                                        tL_inputPhoneContact2.last_name = iv2Var5.j;
                                        tL_inputPhoneContact2.phone = (String) iv2Var5.e.get(i4);
                                        arrayList4.add(tL_inputPhoneContact2);
                                        i2 = i2;
                                    }
                                }
                                if (iv2Var != null) {
                                    hashMap15.remove(str4);
                                }
                            } else {
                                int i13 = 0;
                                while (i13 < iv2Var5.e.size()) {
                                    String str6 = (String) iv2Var5.g.get(i13);
                                    HashMap hashMap20 = hashMap16;
                                    HashMap hashMap21 = hashMap17;
                                    String substring2 = str6.substring(Math.max(0, str6.length() - 7));
                                    hashMap19.put(str6, iv2Var5);
                                    int indexOf2 = iv2Var.g.indexOf(str6);
                                    if (z21) {
                                        i5 = indexOf2;
                                        TLRPC.TL_contact tL_contact2 = (TLRPC.TL_contact) lv2Var.l0.get(str6);
                                        if (tL_contact2 != null) {
                                            hashMap14 = hashMap18;
                                            hashMap13 = H;
                                            TLRPC.User X12 = lv2Var.getMessagesController().X1(Long.valueOf(tL_contact2.user_id));
                                            if (X12 != null) {
                                                i11++;
                                                if (TextUtils.isEmpty(X12.first_name) && TextUtils.isEmpty(X12.last_name) && (!TextUtils.isEmpty(iv2Var5.i) || !TextUtils.isEmpty(iv2Var5.j))) {
                                                    z10 = true;
                                                    i5 = -1;
                                                    i6 = i5;
                                                    if (i6 != -1) {
                                                        iv2Var5.h.set(i13, (Integer) iv2Var.h.get(i6));
                                                        iv2Var.e.remove(i6);
                                                        iv2Var.g.remove(i6);
                                                        iv2Var.h.remove(i6);
                                                        iv2Var.f.remove(i6);
                                                    } else if (z21) {
                                                        if (!z10) {
                                                            TLRPC.TL_contact tL_contact3 = (TLRPC.TL_contact) lv2Var.l0.get(str6);
                                                            if (tL_contact3 != null) {
                                                                TLRPC.User X13 = lv2Var.getMessagesController().X1(Long.valueOf(tL_contact3.user_id));
                                                                if (X13 != null) {
                                                                    i11++;
                                                                    String str7 = X13.first_name;
                                                                    if (str7 == null) {
                                                                        str7 = "";
                                                                    }
                                                                    String str8 = X13.last_name;
                                                                    if (str8 == null) {
                                                                        str8 = "";
                                                                    }
                                                                    if (str7.equals(iv2Var5.i)) {
                                                                        if (str8.equals(iv2Var5.j)) {
                                                                        }
                                                                    }
                                                                    if (TextUtils.isEmpty(iv2Var5.i) && TextUtils.isEmpty(iv2Var5.j)) {
                                                                    }
                                                                } else {
                                                                    i2++;
                                                                }
                                                            } else if (lv2Var.m0.containsKey(substring2)) {
                                                                i11++;
                                                            }
                                                        }
                                                        TLRPC.TL_inputPhoneContact tL_inputPhoneContact3 = new TLRPC.TL_inputPhoneContact();
                                                        tL_inputPhoneContact3.client_id = iv2Var5.a | (i13 << 32);
                                                        tL_inputPhoneContact3.first_name = iv2Var5.i;
                                                        tL_inputPhoneContact3.last_name = iv2Var5.j;
                                                        tL_inputPhoneContact3.phone = (String) iv2Var5.e.get(i13);
                                                        arrayList4.add(tL_inputPhoneContact3);
                                                    }
                                                    i13++;
                                                    hashMap17 = hashMap21;
                                                    hashMap16 = hashMap20;
                                                    hashMap18 = hashMap14;
                                                    H = hashMap13;
                                                }
                                            }
                                            z10 = false;
                                            i6 = i5;
                                            if (i6 != -1) {
                                            }
                                            i13++;
                                            hashMap17 = hashMap21;
                                            hashMap16 = hashMap20;
                                            hashMap18 = hashMap14;
                                            H = hashMap13;
                                        } else {
                                            hashMap13 = H;
                                            hashMap14 = hashMap18;
                                            if (lv2Var.m0.containsKey(substring2)) {
                                                i11++;
                                            }
                                        }
                                    } else {
                                        hashMap13 = H;
                                        i5 = indexOf2;
                                        hashMap14 = hashMap18;
                                    }
                                    i6 = i5;
                                    z10 = false;
                                    if (i6 != -1) {
                                    }
                                    i13++;
                                    hashMap17 = hashMap21;
                                    hashMap16 = hashMap20;
                                    hashMap18 = hashMap14;
                                    H = hashMap13;
                                }
                                hashMap9 = hashMap16;
                                hashMap10 = H;
                                hashMap11 = hashMap17;
                                hashMap12 = hashMap18;
                                if (iv2Var.e.isEmpty()) {
                                    hashMap15.remove(str4);
                                }
                            }
                            z16 = z9;
                            it3 = it4;
                            z12 = z23;
                            arrayList2 = arrayList5;
                            hashMap17 = hashMap11;
                            hashMap16 = hashMap9;
                            hashMap18 = hashMap12;
                            H = hashMap10;
                        }
                        z7 = z12;
                        arrayList = arrayList2;
                        z8 = z16;
                        HashMap hashMap22 = H;
                        hashMap3 = hashMap17;
                        hashMap4 = hashMap18;
                        if (!z22 && hashMap15.isEmpty() && arrayList4.isEmpty() && size2 == hashMap22.size()) {
                            if (f11.a) {
                                cc4.b("contacts not changed!");
                                return;
                            }
                            return;
                        }
                        if (!z21 || hashMap15.isEmpty() || hashMap22.isEmpty() || !arrayList4.isEmpty()) {
                            hashMap2 = hashMap22;
                        } else {
                            hashMap2 = hashMap22;
                            lv2Var.getMessagesStorage().W0(hashMap2, false, false);
                        }
                        hashMap6 = hashMap15;
                        i = i11;
                        hashMap5 = hashMap19;
                    }
                    if (f11.a) {
                        cc4.b("done processing contacts");
                    }
                    if (!z21) {
                        final HashMap hashMap23 = hashMap2;
                        final HashMap hashMap24 = hashMap5;
                        final ArrayList arrayList6 = arrayList;
                        final HashMap hashMap25 = hashMap3;
                        final HashMap hashMap26 = hashMap4;
                        final byte b = 2;
                        Utilities.d.c(new Runnable() { // from class: tu2
                            @Override // java.lang.Runnable
                            public final void run() {
                                byte b2 = b;
                                boolean z25 = z22;
                                HashMap hashMap27 = hashMap23;
                                HashMap hashMap28 = hashMap24;
                                switch (b2) {
                                    case 0:
                                        lv2 lv2Var2 = lv2Var;
                                        ArrayList arrayList7 = lv2Var2.x;
                                        lv2Var2.a0 = hashMap28;
                                        lv2Var2.Z = hashMap27;
                                        lv2Var2.e = false;
                                        lv2Var2.r = true;
                                        if (z25) {
                                            lv2Var2.h = true;
                                        }
                                        if (!arrayList7.isEmpty() && lv2Var2.h) {
                                            lv2Var2.c(arrayList7, null, null, null);
                                            arrayList7.clear();
                                        }
                                        lv2Var2.getMessagesStorage().W0(hashMap27, false, false);
                                        hl.c3(new xu2(lv2Var2, hashMap25, arrayList6, hashMap26, (byte) 0));
                                        break;
                                    case 1:
                                        lv2 lv2Var3 = lv2Var;
                                        ArrayList arrayList8 = lv2Var3.x;
                                        lv2Var3.a0 = hashMap28;
                                        lv2Var3.Z = hashMap27;
                                        lv2Var3.e = false;
                                        lv2Var3.r = true;
                                        if (z25) {
                                            lv2Var3.h = true;
                                        }
                                        if (!arrayList8.isEmpty() && lv2Var3.h) {
                                            lv2Var3.c(arrayList8, null, null, null);
                                            arrayList8.clear();
                                        }
                                        hl.c3(new xu2(lv2Var3, hashMap25, arrayList6, hashMap26, (byte) 1));
                                        break;
                                    default:
                                        lv2 lv2Var4 = lv2Var;
                                        ArrayList arrayList9 = lv2Var4.x;
                                        lv2Var4.a0 = hashMap28;
                                        lv2Var4.Z = hashMap27;
                                        lv2Var4.e = false;
                                        lv2Var4.r = true;
                                        if (z25) {
                                            lv2Var4.h = true;
                                        }
                                        if (!arrayList9.isEmpty() && lv2Var4.h) {
                                            lv2Var4.c(arrayList9, null, null, null);
                                            arrayList9.clear();
                                        }
                                        hl.c3(new xu2(lv2Var4, hashMap25, arrayList6, hashMap26, (byte) 2));
                                        break;
                                }
                            }
                        });
                        if (hashMap23.isEmpty()) {
                            return;
                        }
                        lv2Var.getMessagesStorage().W0(hashMap23, false, false);
                        return;
                    }
                    if (arrayList4.isEmpty()) {
                        final HashMap hashMap27 = hashMap2;
                        final HashMap hashMap28 = hashMap5;
                        final ArrayList arrayList7 = arrayList;
                        final HashMap hashMap29 = hashMap3;
                        final HashMap hashMap30 = hashMap4;
                        final byte b2 = 1;
                        Utilities.d.c(new Runnable() { // from class: tu2
                            @Override // java.lang.Runnable
                            public final void run() {
                                byte b22 = b2;
                                boolean z25 = z22;
                                HashMap hashMap272 = hashMap27;
                                HashMap hashMap282 = hashMap28;
                                switch (b22) {
                                    case 0:
                                        lv2 lv2Var2 = lv2Var;
                                        ArrayList arrayList72 = lv2Var2.x;
                                        lv2Var2.a0 = hashMap282;
                                        lv2Var2.Z = hashMap272;
                                        lv2Var2.e = false;
                                        lv2Var2.r = true;
                                        if (z25) {
                                            lv2Var2.h = true;
                                        }
                                        if (!arrayList72.isEmpty() && lv2Var2.h) {
                                            lv2Var2.c(arrayList72, null, null, null);
                                            arrayList72.clear();
                                        }
                                        lv2Var2.getMessagesStorage().W0(hashMap272, false, false);
                                        hl.c3(new xu2(lv2Var2, hashMap29, arrayList7, hashMap30, (byte) 0));
                                        break;
                                    case 1:
                                        lv2 lv2Var3 = lv2Var;
                                        ArrayList arrayList8 = lv2Var3.x;
                                        lv2Var3.a0 = hashMap282;
                                        lv2Var3.Z = hashMap272;
                                        lv2Var3.e = false;
                                        lv2Var3.r = true;
                                        if (z25) {
                                            lv2Var3.h = true;
                                        }
                                        if (!arrayList8.isEmpty() && lv2Var3.h) {
                                            lv2Var3.c(arrayList8, null, null, null);
                                            arrayList8.clear();
                                        }
                                        hl.c3(new xu2(lv2Var3, hashMap29, arrayList7, hashMap30, (byte) 1));
                                        break;
                                    default:
                                        lv2 lv2Var4 = lv2Var;
                                        ArrayList arrayList9 = lv2Var4.x;
                                        lv2Var4.a0 = hashMap282;
                                        lv2Var4.Z = hashMap272;
                                        lv2Var4.e = false;
                                        lv2Var4.r = true;
                                        if (z25) {
                                            lv2Var4.h = true;
                                        }
                                        if (!arrayList9.isEmpty() && lv2Var4.h) {
                                            lv2Var4.c(arrayList9, null, null, null);
                                            arrayList9.clear();
                                        }
                                        hl.c3(new xu2(lv2Var4, hashMap29, arrayList7, hashMap30, (byte) 2));
                                        break;
                                }
                            }
                        });
                        return;
                    }
                    if (f11.a) {
                        cc4.d("start import contacts");
                    }
                    if (z8 && i2 != 0) {
                        if (i2 >= 30) {
                            i3 = 1;
                        } else if (z22 && size2 == 0 && lv2Var.l0.size() - i > ((lv2Var.l0.size() / 3) << 1)) {
                            i3 = 2;
                        }
                        if (f11.a) {
                            StringBuilder p = bs2.p("new phone book contacts ", i2, " serverContactsInPhonebook ", i, " totalContacts ");
                            p.append(lv2Var.l0.size());
                            cc4.b(p.toString());
                        }
                        if (i3 == 0) {
                            final HashMap hashMap31 = hashMap6;
                            final boolean z25 = z7;
                            hl.c3(new Runnable() { // from class: su2
                                @Override // java.lang.Runnable
                                public final void run() {
                                    lv2.this.getNotificationCenter().k(jn7.P, Integer.valueOf(i3), hashMap31, Boolean.valueOf(z22), Boolean.valueOf(z25));
                                }
                            });
                            return;
                        }
                        final boolean z26 = z22;
                        if (z20) {
                            final byte b3 = 0;
                            final HashMap hashMap32 = hashMap2;
                            final HashMap hashMap33 = hashMap5;
                            final ArrayList arrayList8 = arrayList;
                            final HashMap hashMap34 = hashMap3;
                            final HashMap hashMap35 = hashMap4;
                            Utilities.d.c(new Runnable() { // from class: tu2
                                @Override // java.lang.Runnable
                                public final void run() {
                                    byte b22 = b3;
                                    boolean z252 = z26;
                                    HashMap hashMap272 = hashMap32;
                                    HashMap hashMap282 = hashMap33;
                                    switch (b22) {
                                        case 0:
                                            lv2 lv2Var2 = lv2Var;
                                            ArrayList arrayList72 = lv2Var2.x;
                                            lv2Var2.a0 = hashMap282;
                                            lv2Var2.Z = hashMap272;
                                            lv2Var2.e = false;
                                            lv2Var2.r = true;
                                            if (z252) {
                                                lv2Var2.h = true;
                                            }
                                            if (!arrayList72.isEmpty() && lv2Var2.h) {
                                                lv2Var2.c(arrayList72, null, null, null);
                                                arrayList72.clear();
                                            }
                                            lv2Var2.getMessagesStorage().W0(hashMap272, false, false);
                                            hl.c3(new xu2(lv2Var2, hashMap34, arrayList8, hashMap35, (byte) 0));
                                            break;
                                        case 1:
                                            lv2 lv2Var3 = lv2Var;
                                            ArrayList arrayList82 = lv2Var3.x;
                                            lv2Var3.a0 = hashMap282;
                                            lv2Var3.Z = hashMap272;
                                            lv2Var3.e = false;
                                            lv2Var3.r = true;
                                            if (z252) {
                                                lv2Var3.h = true;
                                            }
                                            if (!arrayList82.isEmpty() && lv2Var3.h) {
                                                lv2Var3.c(arrayList82, null, null, null);
                                                arrayList82.clear();
                                            }
                                            hl.c3(new xu2(lv2Var3, hashMap34, arrayList8, hashMap35, (byte) 1));
                                            break;
                                        default:
                                            lv2 lv2Var4 = lv2Var;
                                            ArrayList arrayList9 = lv2Var4.x;
                                            lv2Var4.a0 = hashMap282;
                                            lv2Var4.Z = hashMap272;
                                            lv2Var4.e = false;
                                            lv2Var4.r = true;
                                            if (z252) {
                                                lv2Var4.h = true;
                                            }
                                            if (!arrayList9.isEmpty() && lv2Var4.h) {
                                                lv2Var4.c(arrayList9, null, null, null);
                                                arrayList9.clear();
                                            }
                                            hl.c3(new xu2(lv2Var4, hashMap34, arrayList8, hashMap35, (byte) 2));
                                            break;
                                    }
                                }
                            });
                            return;
                        }
                        HashMap hashMap36 = hashMap2;
                        ArrayList arrayList9 = arrayList;
                        HashMap hashMap37 = hashMap3;
                        HashMap hashMap38 = hashMap4;
                        boolean[] zArr = {false};
                        HashMap hashMap39 = new HashMap(hashMap36);
                        HashMap hashMap40 = hashMap36;
                        SparseArray sparseArray = new SparseArray();
                        Iterator it5 = hashMap39.entrySet().iterator();
                        while (it5.hasNext()) {
                            iv2 iv2Var7 = (iv2) ((Map.Entry) it5.next()).getValue();
                            sparseArray.put(iv2Var7.a, iv2Var7.b);
                        }
                        lv2Var.n0 = 0;
                        int ceil = (int) Math.ceil(arrayList4.size() / 500.0d);
                        int i14 = 0;
                        while (i14 < ceil) {
                            ArrayList arrayList10 = arrayList9;
                            TLRPC.TL_contacts_importContacts tL_contacts_importContacts = new TLRPC.TL_contacts_importContacts();
                            int i15 = i14 * 500;
                            tL_contacts_importContacts.contacts = new ArrayList<>(arrayList4.subList(i15, Math.min(i15 + 500, arrayList4.size())));
                            ConnectionsManager connectionsManager = lv2Var.getConnectionsManager();
                            boolean z27 = z26;
                            boolean[] zArr2 = zArr;
                            HashMap hashMap41 = hashMap37;
                            HashMap hashMap42 = hashMap38;
                            int i16 = ceil;
                            HashMap hashMap43 = hashMap5;
                            HashMap hashMap44 = hashMap40;
                            uu2 uu2Var = new uu2(lv2Var, hashMap39, sparseArray, zArr2, hashMap44, tL_contacts_importContacts, i16, hashMap43, z27, hashMap41, arrayList10, hashMap42);
                            arrayList9 = arrayList10;
                            z26 = z27;
                            hashMap37 = hashMap41;
                            hashMap38 = hashMap42;
                            connectionsManager.sendRequest(tL_contacts_importContacts, uu2Var, 6);
                            i14++;
                            zArr = zArr2;
                            hashMap5 = hashMap43;
                            hashMap40 = hashMap44;
                            hashMap39 = hashMap39;
                            sparseArray = sparseArray;
                            ceil = i16;
                        }
                        return;
                    }
                    i3 = 0;
                    if (f11.a) {
                    }
                    if (i3 == 0) {
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
        int i = 0;
        while (true) {
            arrayList2 = this.x;
            if (i >= size) {
                break;
            }
            Object obj = arrayList.get(i);
            i++;
            Long l = (Long) obj;
            if (l.longValue() > 0) {
                TLRPC.TL_contact tL_contact = new TLRPC.TL_contact();
                tL_contact.user_id = l.longValue();
                arrayList3.add(tL_contact);
                if (!arrayList2.isEmpty() && (indexOf = arrayList2.indexOf(Long.valueOf(-l.longValue()))) != -1) {
                    arrayList2.remove(indexOf);
                }
            } else if (l.longValue() < 0) {
                arrayList4.add(Long.valueOf(-l.longValue()));
                if (!arrayList2.isEmpty() && (indexOf2 = arrayList2.indexOf(Long.valueOf(-l.longValue()))) != -1) {
                    arrayList2.remove(indexOf2);
                }
            }
        }
        if (!arrayList4.isEmpty()) {
            jf7 messagesStorage = getMessagesStorage();
            messagesStorage.getClass();
            if (!arrayList4.isEmpty()) {
                messagesStorage.a.c(new q41(messagesStorage, arrayList4, (byte) 18));
            }
        }
        if (!arrayList3.isEmpty()) {
            getMessagesStorage().Z0(arrayList3, false);
        }
        if (this.h && this.r) {
            c(arrayList, concurrentHashMap, arrayList3, arrayList4);
            return;
        }
        arrayList2.addAll(arrayList);
        if (f11.a) {
            cc4.b("delay update - contacts add = " + arrayList3.size() + " delete = " + arrayList4.size());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:110:0x053e A[Catch: all -> 0x0555, TRY_LEAVE, TryCatch #10 {all -> 0x0555, blocks: (B:108:0x0539, B:110:0x053e), top: B:107:0x0539 }] */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0543 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x054f  */
    /* JADX WARN: Removed duplicated region for block: B:96:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v5, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final HashMap H() {
        Cursor cursor;
        HashMap hashMap;
        boolean z;
        HashMap hashMap2;
        int i;
        HashMap hashMap3;
        ContentResolver contentResolver;
        String str;
        ArrayList arrayList;
        long j;
        int i2;
        int i3;
        int i4;
        Cursor cursor2;
        ContentResolver contentResolver2;
        String str2;
        long j2;
        String substring;
        StringBuilder sb;
        ArrayList arrayList2;
        if (!getUserConfig().V) {
            if (f11.a) {
                cc4.b("contacts sync disabled");
            }
            return new HashMap();
        }
        if (!w()) {
            if (f11.a) {
                cc4.b("app has no contacts permissions");
            }
            return new HashMap();
        }
        ?? r3 = 1;
        try {
            StringBuilder sb2 = new StringBuilder();
            ContentResolver contentResolver3 = a.b.getContentResolver();
            HashMap hashMap4 = new HashMap();
            ArrayList arrayList3 = new ArrayList();
            Cursor query = contentResolver3.query(ContactsContract.CommonDataKinds.Phone.CONTENT_URI, q0, null, null, null);
            try {
                long currentTimeMillis = System.currentTimeMillis();
                String str3 = "+";
                if (query != 0) {
                    try {
                        int count = query.getCount();
                        if (count > 0) {
                            hashMap3 = new HashMap(count);
                            i = 1;
                            while (query.moveToNext()) {
                                try {
                                    String string = query.getString(r3);
                                    String string2 = query.getString(5);
                                    if (string2 == null) {
                                        string2 = "";
                                    }
                                    boolean z2 = string2.indexOf(".sim") != 0 ? r3 : false;
                                    if (!TextUtils.isEmpty(string)) {
                                        String h = f78.h(string, r3);
                                        if (!TextUtils.isEmpty(h)) {
                                            if (h.startsWith(str3)) {
                                                try {
                                                    substring = h.substring(r3);
                                                } catch (Throwable th) {
                                                    th = th;
                                                    cursor = query;
                                                    hashMap = hashMap3;
                                                    z = r3;
                                                    try {
                                                        cc4.g(th, z);
                                                        if (hashMap != null) {
                                                        }
                                                        if (cursor != null) {
                                                        }
                                                        hashMap2 = hashMap;
                                                        if (hashMap2 != null) {
                                                        }
                                                    } finally {
                                                    }
                                                }
                                            } else {
                                                substring = h;
                                            }
                                            contentResolver2 = contentResolver3;
                                            str2 = str3;
                                            String string3 = query.getString(0);
                                            sb2.setLength(0);
                                            DatabaseUtils.appendEscapedSQLString(sb2, string3);
                                            String sb3 = sb2.toString();
                                            j2 = currentTimeMillis;
                                            iv2 iv2Var = (iv2) hashMap4.get(substring);
                                            if (iv2Var != null) {
                                                if (!iv2Var.d && !string2.equals(iv2Var.c)) {
                                                    sb2.setLength(0);
                                                    DatabaseUtils.appendEscapedSQLString(sb2, iv2Var.b);
                                                    arrayList3.remove(sb2.toString());
                                                    arrayList3.add(sb3);
                                                    iv2Var.b = string3;
                                                    iv2Var.d = z2;
                                                    iv2Var.c = string2;
                                                }
                                                contentResolver3 = contentResolver2;
                                                str3 = str2;
                                                currentTimeMillis = j2;
                                                r3 = 1;
                                            } else {
                                                if (!arrayList3.contains(sb3)) {
                                                    arrayList3.add(sb3);
                                                }
                                                int i5 = query.getInt(2);
                                                iv2 iv2Var2 = (iv2) hashMap3.get(string3);
                                                if (iv2Var2 == null) {
                                                    iv2Var2 = new iv2();
                                                    String string4 = query.getString(4);
                                                    String trim = string4 == null ? "" : string4.trim();
                                                    String str4 = trim;
                                                    if (z(trim)) {
                                                        iv2Var2.i = str4;
                                                        iv2Var2.j = "";
                                                        sb = sb2;
                                                        arrayList2 = arrayList3;
                                                    } else {
                                                        sb = sb2;
                                                        int lastIndexOf = str4.lastIndexOf(32);
                                                        arrayList2 = arrayList3;
                                                        if (lastIndexOf != -1) {
                                                            iv2Var2.i = str4.substring(0, lastIndexOf).trim();
                                                            iv2Var2.j = str4.substring(lastIndexOf + 1).trim();
                                                        } else {
                                                            iv2Var2.i = str4;
                                                            iv2Var2.j = "";
                                                        }
                                                    }
                                                    iv2Var2.c = string2;
                                                    iv2Var2.d = z2;
                                                    iv2Var2.b = string3;
                                                    iv2Var2.a = i;
                                                    hashMap3.put(string3, iv2Var2);
                                                    i++;
                                                } else {
                                                    sb = sb2;
                                                    arrayList2 = arrayList3;
                                                }
                                                iv2Var2.g.add(substring);
                                                iv2Var2.e.add(h);
                                                iv2Var2.h.add(0);
                                                if (i5 == 0) {
                                                    String string5 = query.getString(3);
                                                    ArrayList arrayList4 = iv2Var2.f;
                                                    if (string5 == null) {
                                                        string5 = ob6.M0(2131747018, null);
                                                    }
                                                    arrayList4.add(string5);
                                                } else if (i5 == 1) {
                                                    iv2Var2.f.add(ob6.M0(2131747020, null));
                                                } else if (i5 == 2) {
                                                    iv2Var2.f.add(ob6.M0(2131747018, null));
                                                } else {
                                                    ArrayList arrayList5 = iv2Var2.f;
                                                    if (i5 == 3) {
                                                        arrayList5.add(ob6.M0(2131747008, null));
                                                    } else if (i5 == 12) {
                                                        arrayList5.add(ob6.M0(2131747019, null));
                                                    } else {
                                                        arrayList5.add(ob6.M0(2131747009, null));
                                                    }
                                                }
                                                hashMap4.put(substring, iv2Var2);
                                                contentResolver3 = contentResolver2;
                                                str3 = str2;
                                                sb2 = sb;
                                                currentTimeMillis = j2;
                                                arrayList3 = arrayList2;
                                                r3 = 1;
                                            }
                                        }
                                    }
                                    contentResolver2 = contentResolver3;
                                    str2 = str3;
                                    j2 = currentTimeMillis;
                                    contentResolver3 = contentResolver2;
                                    str3 = str2;
                                    currentTimeMillis = j2;
                                    r3 = 1;
                                } catch (Throwable th2) {
                                    th = th2;
                                    cursor = query;
                                    hashMap = hashMap3;
                                    z = true;
                                    cc4.g(th, z);
                                    if (hashMap != null) {
                                    }
                                    if (cursor != null) {
                                    }
                                    hashMap2 = hashMap;
                                    if (hashMap2 != null) {
                                    }
                                }
                            }
                        } else {
                            i = 1;
                            hashMap3 = null;
                        }
                        contentResolver = contentResolver3;
                        str = str3;
                        arrayList = arrayList3;
                        j = currentTimeMillis;
                        i2 = 2;
                        i3 = 3;
                        try {
                            query.close();
                        } catch (Exception unused) {
                        }
                        i4 = i;
                        hashMap2 = hashMap3;
                        cursor2 = null;
                    } catch (Throwable th3) {
                        th = th3;
                        cursor = query;
                        hashMap = null;
                    }
                } else {
                    contentResolver = contentResolver3;
                    str = "+";
                    arrayList = arrayList3;
                    j = currentTimeMillis;
                    i2 = 2;
                    i3 = 3;
                    cursor2 = query;
                    i4 = 1;
                    hashMap2 = null;
                }
                try {
                    String join = TextUtils.join(",", arrayList);
                    int i6 = i3;
                    int i7 = i2;
                    ContentResolver contentResolver4 = contentResolver;
                    String str5 = str;
                    Cursor query2 = contentResolver4.query(ContactsContract.Data.CONTENT_URI, r0, "lookup IN (" + join + ") AND mimetype = 'vnd.android.cursor.item/name'", null, null);
                    if (query2 != null) {
                        while (query2.moveToNext()) {
                            try {
                                String string6 = query2.getString(0);
                                String string7 = query2.getString(1);
                                String string8 = query2.getString(i7);
                                String string9 = query2.getString(i6);
                                iv2 iv2Var3 = hashMap2 != null ? (iv2) hashMap2.get(string6) : null;
                                if (iv2Var3 != null && !iv2Var3.k) {
                                    if (iv2Var3.d) {
                                        if (string7 != null) {
                                            iv2Var3.i = string7;
                                        } else {
                                            iv2Var3.i = "";
                                        }
                                        if (string8 != null) {
                                            iv2Var3.j = string8;
                                        } else {
                                            iv2Var3.j = "";
                                        }
                                        if (!TextUtils.isEmpty(string9)) {
                                            if (TextUtils.isEmpty(iv2Var3.i)) {
                                                iv2Var3.i = string9;
                                            } else {
                                                iv2Var3.i += " " + string9;
                                            }
                                        }
                                    } else if ((!z(string7) && (iv2Var3.i.contains(string7) || string7.contains(iv2Var3.i))) || (!z(string8) && (iv2Var3.j.contains(string8) || string7.contains(iv2Var3.j)))) {
                                        if (string7 != null) {
                                            iv2Var3.i = string7;
                                        } else {
                                            iv2Var3.i = "";
                                        }
                                        if (!TextUtils.isEmpty(string9)) {
                                            if (TextUtils.isEmpty(iv2Var3.i)) {
                                                iv2Var3.i = string9;
                                            } else {
                                                iv2Var3.i += " " + string9;
                                            }
                                        }
                                        if (string8 != null) {
                                            iv2Var3.j = string8;
                                        } else {
                                            iv2Var3.j = "";
                                        }
                                    }
                                    iv2Var3.k = true;
                                }
                            } catch (Throwable th4) {
                                th = th4;
                                hashMap = hashMap2;
                                cursor = query2;
                                z = true;
                                cc4.g(th, z);
                                if (hashMap != null) {
                                }
                                if (cursor != null) {
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
                        cursor = null;
                    } else {
                        cursor = query2;
                    }
                    try {
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append("loading contacts 1 query time = ");
                        sb4.append(System.currentTimeMillis() - j);
                        sb4.append(" contactsSize = ");
                        sb4.append(hashMap2 == null ? 0 : hashMap2.size());
                        cc4.b(sb4.toString());
                        long currentTimeMillis2 = System.currentTimeMillis();
                        HashMap hashMap5 = new HashMap();
                        ArrayList arrayList6 = new ArrayList();
                        Cursor query3 = contentResolver4.query(ContactsContract.Contacts.CONTENT_URI, new String[]{"_id", "lookup", "display_name"}, "has_phone_number = ?", new String[]{"0"}, null);
                        if (query3 != null) {
                            while (query3.moveToNext()) {
                                kv2 kv2Var = new kv2();
                                kv2Var.a = query3.getString(0);
                                kv2Var.b = query3.getString(1);
                                kv2Var.c = query3.getString(i7);
                                if (hashMap2 == null || hashMap2.get(kv2Var.b) == null) {
                                    if (!TextUtils.isEmpty(kv2Var.c)) {
                                        hashMap5.put(kv2Var.a, kv2Var);
                                        arrayList6.add(kv2Var.a);
                                    }
                                }
                            }
                            query3.close();
                        }
                        cc4.b("loading contacts 2 query time = " + (System.currentTimeMillis() - currentTimeMillis2) + " phoneBookConacts size = " + arrayList6.size());
                        long currentTimeMillis3 = System.currentTimeMillis();
                        if (arrayList6.isEmpty()) {
                            cursor2 = cursor;
                        } else {
                            Pattern compile = Pattern.compile(".*(\\+[0-9 \\-]+).*");
                            int i8 = i4;
                            Cursor query4 = contentResolver4.query(ContactsContract.Data.CONTENT_URI, new String[]{"contact_id", "data1", "data2", "data3", "data4"}, "contact_id IN (" + TextUtils.join(", ", arrayList6) + ")", null, null);
                            if (query4 != null) {
                                HashMap hashMap6 = hashMap2;
                                int i9 = i8;
                                while (query4.moveToNext()) {
                                    try {
                                        kv2 kv2Var2 = (kv2) hashMap5.get(query4.getString(0));
                                        if (kv2Var2 != null) {
                                            int i10 = 4;
                                            String[] strArr = {query4.getString(1), query4.getString(2), query4.getString(3), query4.getString(4)};
                                            int i11 = 0;
                                            while (true) {
                                                if (i11 >= i10) {
                                                    break;
                                                }
                                                String str6 = strArr[i11];
                                                if (str6 != null) {
                                                    Matcher matcher = compile.matcher(str6);
                                                    if (matcher.matches()) {
                                                        kv2Var2.d = matcher.group(1).replace(" ", "").replace("-", "");
                                                    }
                                                    String str7 = kv2Var2.d;
                                                    if (str7 != null) {
                                                        if (str7.startsWith(str5)) {
                                                            str7 = kv2Var2.d.substring(1);
                                                        }
                                                        iv2 iv2Var4 = new iv2();
                                                        iv2Var4.i = kv2Var2.c;
                                                        iv2Var4.j = "";
                                                        int i12 = i9 + 1;
                                                        iv2Var4.a = i9;
                                                        iv2Var4.b = kv2Var2.b;
                                                        iv2Var4.e.add(kv2Var2.d);
                                                        iv2Var4.g.add(str7);
                                                        iv2Var4.h.add(0);
                                                        iv2Var4.f.add(ob6.M0(2131747009, null));
                                                        if (hashMap6 == null) {
                                                            hashMap6 = new HashMap();
                                                        }
                                                        hashMap6.put(kv2Var2.b, iv2Var4);
                                                        i9 = i12;
                                                    }
                                                }
                                                i11++;
                                                i10 = 4;
                                            }
                                        }
                                    } catch (Throwable th5) {
                                        th = th5;
                                        cursor = query4;
                                        hashMap = hashMap6;
                                        z = true;
                                        cc4.g(th, z);
                                        if (hashMap != null) {
                                        }
                                        if (cursor != null) {
                                        }
                                        hashMap2 = hashMap;
                                        if (hashMap2 != null) {
                                        }
                                    }
                                }
                                query4.close();
                                cursor2 = query4;
                                hashMap2 = hashMap6;
                            } else {
                                cursor2 = query4;
                            }
                        }
                        cc4.b("loading contacts 3 query time = " + (System.currentTimeMillis() - currentTimeMillis3));
                        if (cursor2 != null) {
                            try {
                                cursor2.close();
                            } catch (Exception e) {
                                cc4.g(e, true);
                            }
                        }
                    } catch (Throwable th6) {
                        th = th6;
                        hashMap = hashMap2;
                        z = true;
                        cc4.g(th, z);
                        if (hashMap != null) {
                            hashMap.clear();
                        }
                        if (cursor != null) {
                            try {
                                cursor.close();
                            } catch (Exception e2) {
                                cc4.g(e2, true);
                            }
                        }
                        hashMap2 = hashMap;
                        if (hashMap2 != null) {
                        }
                    }
                } catch (Throwable th7) {
                    th = th7;
                    cursor = cursor2;
                }
            } catch (Throwable th8) {
                th = th8;
                hashMap = null;
                cursor = query;
            }
        } catch (Throwable th9) {
            th = th9;
            cursor = null;
            hashMap = null;
        }
        return hashMap2 != null ? new HashMap() : hashMap2;
    }

    public final void I() {
        L();
        uc7 messagesController = getMessagesController();
        messagesController.i1.clear();
        messagesController.p1.clear();
        SharedPreferences.Editor edit = uc7.s1(this.currentAccount).X3.edit();
        edit.putBoolean("needGetStatuses", true).commit();
        getConnectionsManager().sendRequest(new TLRPC.TL_contacts_getStatuses(), new ql(this, edit, (byte) 28));
    }

    public final void J(boolean z) {
        try {
            if (uc7.s1(this.currentAccount).X3.getLong("lastReloadStatusTime", 0L) < System.currentTimeMillis() - 10800000 || z) {
                I();
            }
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    public final void K() {
        getConnectionsManager().sendRequest(new TLRPC.TL_contacts_resetSaved(), new xe2((byte) 0));
    }

    public final void L() {
        try {
            uc7.s1(this.currentAccount).X3.edit().putLong("lastReloadStatusTime", System.currentTimeMillis()).commit();
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    public final void M(int i, ArrayList arrayList) {
        switch (i) {
            case 0:
                this.K = arrayList;
                break;
            case 1:
                this.L = arrayList;
                break;
            case 2:
                this.M = arrayList;
                break;
            case 3:
                this.N = arrayList;
                break;
            case 4:
                this.O = arrayList;
                break;
            case 5:
                this.R = arrayList;
                break;
            case 6:
                this.S = arrayList;
                break;
            case 7:
                this.T = arrayList;
                break;
            case 8:
                this.U = arrayList;
                break;
            case 9:
                this.P = arrayList;
                break;
            case 11:
                this.V = arrayList;
                break;
            case 12:
                this.W = arrayList;
                break;
            case 13:
                this.X = arrayList;
                break;
            case 14:
                this.Q = arrayList;
                break;
        }
        getNotificationCenter().k(jn7.k0, new Object[0]);
        I();
    }

    public final void N() {
        HashMap hashMap = new HashMap();
        int size = this.f0.size();
        for (int i = 0; i < size; i++) {
            TLRPC.TL_contact tL_contact = (TLRPC.TL_contact) this.f0.get(i);
            TLRPC.User X1 = getMessagesController().X1(Long.valueOf(tL_contact.user_id));
            if (X1 != null && !TextUtils.isEmpty(X1.phone)) {
                hashMap.put(X1.phone, tL_contact);
            }
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = this.Z.entrySet().iterator();
        while (it.hasNext()) {
            iv2 iv2Var = (iv2) ((Map.Entry) it.next()).getValue();
            int i2 = 0;
            while (true) {
                if (i2 >= iv2Var.e.size()) {
                    arrayList.add(iv2Var);
                    break;
                } else if (!hashMap.containsKey((String) iv2Var.g.get(i2)) && ((Integer) iv2Var.h.get(i2)).intValue() != 1) {
                    i2++;
                }
            }
        }
        Collections.sort(arrayList, new kn0(u(), (byte) 2));
        this.b0 = arrayList;
    }

    public final void a(TLRPC.User user) {
        Uri uri;
        if (this.a == null || a.b.checkSelfPermission("android.permission.WRITE_CONTACTS") != 0) {
            return;
        }
        synchronized (this.f) {
            this.d = true;
        }
        ContentResolver contentResolver = a.b.getContentResolver();
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
        } catch (Exception e) {
            cc4.g(e, true);
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
        newInsert3.withValue("data3", ob6.a0("ContactShortcutMessage", null, 2131751751, str));
        newInsert3.withValue("data4", Long.valueOf(user.id));
        arrayList.add(newInsert3.build());
        ContentProviderOperation.Builder newInsert4 = ContentProviderOperation.newInsert(uri);
        newInsert4.withValueBackReference("raw_contact_id", size);
        newInsert4.withValue("mimetype", "vnd.android.cursor.item/vnd.org.telegram.messenger.android.call");
        String str2 = str;
        newInsert4.withValue("data1", Long.valueOf(user.id));
        newInsert4.withValue("data2", "Telegram Voice Call");
        newInsert4.withValue("data3", ob6.a0("ContactShortcutVoiceCall", null, 2131751749, str2));
        newInsert4.withValue("data4", Long.valueOf(user.id));
        arrayList.add(newInsert4.build());
        ContentProviderOperation.Builder newInsert5 = ContentProviderOperation.newInsert(uri);
        newInsert5.withValueBackReference("raw_contact_id", size);
        newInsert5.withValue("mimetype", "vnd.android.cursor.item/vnd.org.telegram.messenger.android.call.video");
        newInsert5.withValue("data1", Long.valueOf(user.id));
        newInsert5.withValue("data2", "Telegram Video Call");
        newInsert5.withValue("data3", ob6.a0("ContactShortcutVideoCall", null, 2131751750, str2));
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
            for (int i = 0; i < arrayList.size(); i++) {
                Long l = (Long) arrayList.get(i);
                if (l.longValue() > 0) {
                    TLRPC.TL_contact tL_contact = new TLRPC.TL_contact();
                    tL_contact.user_id = l.longValue();
                    arrayList4.add(tL_contact);
                } else if (l.longValue() < 0) {
                    arrayList5.add(Long.valueOf(-l.longValue()));
                }
            }
        } else {
            arrayList4 = arrayList2;
            arrayList5 = arrayList3;
        }
        if (f11.a) {
            cc4.b("process update - contacts add = " + arrayList4.size() + " delete = " + arrayList5.size());
        }
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        boolean z = false;
        for (int i2 = 0; i2 < arrayList4.size(); i2++) {
            TLRPC.TL_contact tL_contact2 = (TLRPC.TL_contact) arrayList4.get(i2);
            TLRPC.User user = concurrentHashMap != null ? (TLRPC.User) concurrentHashMap.get(Long.valueOf(tL_contact2.user_id)) : null;
            if (user == null) {
                user = getMessagesController().X1(Long.valueOf(tL_contact2.user_id));
            } else {
                getMessagesController().i4(user, true, false);
            }
            if (user == null || TextUtils.isEmpty(user.phone)) {
                z = true;
            } else {
                iv2 iv2Var = (iv2) this.a0.get(user.phone);
                if (iv2Var != null && (indexOf2 = iv2Var.g.indexOf(user.phone)) != -1) {
                    iv2Var.h.set(indexOf2, 0);
                }
                if (sb.length() != 0) {
                    sb.append(",");
                }
                sb.append(user.phone);
            }
        }
        for (int i3 = 0; i3 < arrayList5.size(); i3++) {
            Long l2 = (Long) arrayList5.get(i3);
            Utilities.h.c(new ea2(this, l2, (byte) 27));
            TLRPC.User user2 = concurrentHashMap != null ? (TLRPC.User) concurrentHashMap.get(l2) : null;
            if (user2 == null) {
                user2 = getMessagesController().X1(l2);
            } else {
                getMessagesController().i4(user2, true, false);
            }
            if (user2 == null) {
                z = true;
            } else if (!TextUtils.isEmpty(user2.phone)) {
                iv2 iv2Var2 = (iv2) this.a0.get(user2.phone);
                if (iv2Var2 != null && (indexOf = iv2Var2.g.indexOf(user2.phone)) != -1) {
                    iv2Var2.h.set(indexOf, 1);
                }
                if (sb2.length() != 0) {
                    sb2.append(",");
                }
                sb2.append(user2.phone);
            }
        }
        if (sb.length() != 0 || sb2.length() != 0) {
            getMessagesStorage().e(sb.toString(), sb2.toString());
        }
        if (z) {
            Utilities.d.c(new pu2(this, (byte) 2));
        } else {
            hl.c3(new on1(this, arrayList4, arrayList5, (byte) 29));
        }
    }

    public final void d(boolean z) {
        Collator u = u();
        byte b = 0;
        if (z) {
            Collections.sort(this.f0, new wu2(this, u, b));
        }
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (true) {
            byte b2 = 1;
            if (i >= this.f0.size()) {
                Collections.sort(arrayList, new kn0(u, b2));
                this.h0 = hashMap;
                this.i0 = arrayList;
                return;
            }
            TLRPC.TL_contact tL_contact = (TLRPC.TL_contact) this.f0.get(i);
            TLRPC.User X1 = getMessagesController().X1(Long.valueOf(tL_contact.user_id));
            if (X1 != null) {
                String k = lbc.k(X1, true);
                if (k.length() > 1) {
                    k = k.substring(0, 1);
                }
                String upperCase = k.length() == 0 ? "#" : k.toUpperCase();
                String str = (String) this.F.get(upperCase);
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
            i++;
        }
    }

    public final boolean e() {
        boolean z = false;
        try {
        } catch (Exception e) {
            cc4.g(e, true);
        }
        if (!w()) {
            return false;
        }
        try {
            Cursor query = a.b.getContentResolver().query(ContactsContract.RawContacts.CONTENT_URI, new String[]{"version"}, null, null, null);
            if (query != null) {
                try {
                    StringBuilder sb = new StringBuilder();
                    while (query.moveToNext()) {
                        sb.append(query.getString(query.getColumnIndex("version")));
                    }
                    String sb2 = sb.toString();
                    if (this.w.length() != 0 && !this.w.equals(sb2)) {
                        z = true;
                    }
                    this.w = sb2;
                } finally {
                }
            }
            if (query != null) {
                query.close();
            }
        } catch (Exception e2) {
            cc4.g(e2, true);
        }
        return z;
    }

    public final void f() {
        SharedPreferences sharedPreferences = uc7.s1(this.currentAccount).X3;
        this.y = sharedPreferences.getString("invitelink", null);
        int i = sharedPreferences.getInt("invitelinktime", 0);
        if (this.E) {
            return;
        }
        if (this.y == null || Math.abs((System.currentTimeMillis() / 1000) - i) >= 86400) {
            this.E = true;
            getConnectionsManager().sendRequest(new TLRPC.TL_help_getInviteText(), new ou2(this, (byte) 1), 2);
        }
    }

    public final void g(long j, String str, String str2) {
        Cursor cursor;
        int parseInt;
        Cursor cursor2;
        if (w()) {
            try {
                ContentResolver contentResolver = a.b.getContentResolver();
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
                int i = parseInt;
                if (query2 == null || !query2.moveToFirst()) {
                    cursor2 = query2;
                    arrayList.add(ContentProviderOperation.newInsert(build2).withValue("account_type", this.a.type).withValue("account_name", this.a.name).withValue("raw_contact_is_read_only", 1).withValue("aggregation_mode", 3).build());
                    arrayList.add(ContentProviderOperation.newInsert(uri).withValueBackReference("raw_contact_id", size).withValue("mimetype", "vnd.android.cursor.item/name").withValue("data2", str).withValue("data3", str2).build());
                    arrayList.add(ContentProviderOperation.newInsert(uri).withValueBackReference("raw_contact_id", size).withValue("mimetype", "vnd.android.cursor.item/phone_v2").withValue("data1", "+99084" + j).build());
                    arrayList.add(ContentProviderOperation.newInsert(uri).withValueBackReference("raw_contact_id", size).withValue("mimetype", "vnd.android.cursor.item/group_membership").withValue("data1", Integer.valueOf(i)).build());
                } else {
                    int i2 = query2.getInt(0);
                    cursor2 = query2;
                    arrayList.add(ContentProviderOperation.newUpdate(build2).withSelection("_id=?", new String[]{i2 + ""}).withValue("deleted", 0).build());
                    ContentProviderOperation.Builder withSelection = ContentProviderOperation.newUpdate(uri).withSelection("raw_contact_id=? AND mimetype=?", new String[]{i2 + "", "vnd.android.cursor.item/phone_v2"});
                    StringBuilder sb = new StringBuilder("+99084");
                    sb.append(j);
                    arrayList.add(withSelection.withValue("data1", sb.toString()).build());
                    arrayList.add(ContentProviderOperation.newUpdate(uri).withSelection("raw_contact_id=? AND mimetype=?", new String[]{i2 + "", "vnd.android.cursor.item/name"}).withValue("data2", str).withValue("data3", str2).build());
                }
                if (cursor2 != null) {
                    cursor2.close();
                }
                contentResolver.applyBatch("com.android.contacts", arrayList);
            } catch (Exception e) {
                cc4.g(e, true);
            }
        }
    }

    public final void h() {
        if (w()) {
            try {
                ContentResolver contentResolver = a.b.getContentResolver();
                Account account = this.a;
                Cursor query = contentResolver.query(ContactsContract.Groups.CONTENT_URI, new String[]{"_id"}, "title=? AND account_type=? AND account_name=?", new String[]{"TelegramConnectionService", account.type, account.name}, null);
                if (query != null) {
                    if (!query.moveToFirst()) {
                        query.close();
                        return;
                    }
                    int i = query.getInt(0);
                    query.close();
                    Cursor query2 = contentResolver.query(ContactsContract.Data.CONTENT_URI, new String[]{"raw_contact_id"}, "mimetype=? AND data1=?", new String[]{"vnd.android.cursor.item/group_membership", i + ""}, null);
                    if (query2 != null) {
                        if (!query2.moveToFirst()) {
                            query2.close();
                            return;
                        }
                        int i2 = query2.getInt(0);
                        query2.close();
                        contentResolver.delete(ContactsContract.RawContacts.CONTENT_URI, "_id=?", new String[]{i2 + ""});
                    }
                }
            } catch (Exception e) {
                cc4.g(e, true);
            }
        }
    }

    public final void i(ArrayList arrayList, boolean z) {
        if (arrayList.isEmpty()) {
            return;
        }
        TLRPC.TL_contacts_deleteContacts tL_contacts_deleteContacts = new TLRPC.TL_contacts_deleteContacts();
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            TLRPC.User user = (TLRPC.User) arrayList.get(i);
            c6b O1 = getMessagesController().O1();
            long j = user.id;
            int i2 = O1.a;
            ArrayList arrayList3 = O1.h;
            ArrayList arrayList4 = O1.g;
            int i3 = 0;
            while (true) {
                if (i3 >= arrayList4.size()) {
                    break;
                }
                if (wf3.n(((TL_stories.PeerStories) arrayList4.get(i3)).peer) == j) {
                    arrayList4.remove(i3);
                    break;
                }
                i3++;
            }
            int i4 = 0;
            while (true) {
                if (i4 >= arrayList3.size()) {
                    break;
                }
                if (wf3.n(((TL_stories.PeerStories) arrayList3.get(i4)).peer) == j) {
                    arrayList3.remove(i4);
                    break;
                }
                i4++;
            }
            o6b o6bVar = O1.k;
            o6bVar.b.a.c(new pqa(o6bVar, j, (byte) 4));
            uc7.s1(i2).B();
            jn7.f(i2).k(jn7.y5, new Object[0]);
            TLRPC.InputUser q1 = getMessagesController().q1(user);
            user.contact = false;
            arrayList2.add(Long.valueOf(user.id));
            tL_contacts_deleteContacts.id.add(q1);
        }
        getConnectionsManager().sendRequest(tL_contacts_deleteContacts, new gg2(this, arrayList2, arrayList, z, ((TLRPC.User) arrayList.get(0)).first_name));
    }

    public final void j(long j) {
        if (w()) {
            synchronized (this.f) {
                this.d = true;
            }
            try {
                a.b.getContentResolver().delete(ContactsContract.RawContacts.CONTENT_URI.buildUpon().appendQueryParameter("caller_is_syncadapter", "true").appendQueryParameter("account_name", this.a.name).appendQueryParameter("account_type", this.a.type).build(), "sync2 = " + j, null);
            } catch (Exception e) {
                cc4.g(e, false);
            }
            synchronized (this.f) {
                this.d = false;
            }
        }
    }

    public final void k(ContentResolver contentResolver, Account account, ArrayList arrayList, zh6 zh6Var, zh6 zh6Var2) {
        synchronized (this.f) {
            this.d = true;
        }
        try {
            Uri build = ContactsContract.RawContacts.CONTENT_URI.buildUpon().appendQueryParameter("caller_is_syncadapter", "true").build();
            if (arrayList.size() > (zh6Var.m() << 1) + 500) {
                contentResolver.delete(build, "account_type=? AND account_name=? AND sync2 IS NOT NULL", new String[]{account.type, account.name});
                for (int i = 0; i < zh6Var.m(); i++) {
                    long j = zh6Var.j(i);
                    if (((Long) zh6Var.n(i)).equals(zh6Var2.f(j))) {
                        zh6Var2.l(j);
                    }
                }
            } else {
                StringBuilder sb = new StringBuilder();
                int i2 = 0;
                while (i2 < arrayList.size()) {
                    if (sb.length() != 0) {
                        sb.append(',');
                    }
                    sb.append(arrayList.get(i2));
                    int i3 = i2 + 1;
                    if (i3 % 500 == 0 || i2 == arrayList.size() - 1) {
                        contentResolver.delete(build, "_id IN (" + ((Object) sb) + ")", null);
                        sb.setLength(0);
                    }
                    i2 = i3;
                }
            }
        } catch (Exception e) {
            cc4.g(e, true);
        }
        synchronized (this.f) {
            this.d = false;
        }
    }

    public final void l() {
        Utilities.e.c(new pu2(this, (byte) 1));
    }

    public final String s(int i) {
        String str = this.y;
        if (str == null) {
            str = "https://telegram.org/dl";
        }
        if (i <= 1) {
            return ob6.a0(null, null, 2131748870, str);
        }
        try {
            return String.format(ob6.J0(i, "InviteTextNum"), Integer.valueOf(i), str);
        } catch (Exception unused) {
            return ob6.a0(null, null, 2131748870, str);
        }
    }

    public final boolean t(int i) {
        return this.J[i] != 2;
    }

    public final ArrayList v(int i) {
        switch (i) {
            case 0:
                return this.K;
            case 1:
                return this.L;
            case 2:
                return this.M;
            case 3:
                return this.N;
            case 4:
                return this.O;
            case 5:
                return this.R;
            case 6:
                return this.S;
            case 7:
                return this.T;
            case 8:
                return this.U;
            case 9:
                return this.P;
            case 10:
            default:
                return null;
            case 11:
                return this.V;
            case 12:
                return this.W;
            case 13:
                return this.X;
            case 14:
                return this.Q;
        }
    }

    public final boolean x(long j) {
        return this.g0.get(Long.valueOf(j)) != null;
    }

    public final boolean y() {
        boolean z;
        synchronized (this.c) {
            z = this.b;
        }
        return z;
    }
}
