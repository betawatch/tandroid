package org.telegram.messenger;

import android.content.res.Resources;
import android.icu.text.Collator;
import android.os.Build;
import android.text.TextUtils;
import android.util.LongSparseArray;
import android.util.Pair;
import android.view.inputmethod.InputMethodInfo;
import android.view.inputmethod.InputMethodManager;
import android.view.inputmethod.InputMethodSubtype;
import j$.util.Comparator$-CC;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.m31;
import org.telegram.ui.e01;
import org.telegram.ui.jp0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class t10 extends f1 {
    public static final List M = Arrays.asList("en", "ar", "zh", "fr", "de", "it", "ja", "ko", "pt", "ru", "es", "uk");
    public static final List N = Arrays.asList("af", "sq", "am", "ar", "hy", "az", "eu", "be", "bn", "bs", "bg", "ca", "ceb", "zh-cn", "zh", "zh-tw", "co", "hr", "cs", "da", "nl", "en", "eo", "et", "fi", "fr", "fy", "gl", "ka", "de", "el", "gu", "ht", "ha", "haw", "he", "hi", "hmn", "hu", "is", "ig", "id", "ga", "it", "ja", "jv", "kn", "kk", "km", "rw", "ko", "ku", "ky", "lo", "la", "lv", "lt", "lb", "mk", "mg", "ms", "ml", "mt", "mi", "mr", "mn", "my", "ne", "no", "ny", "or", "ps", "fa", "pl", "pt", "pt-br", "pa", "ro", "ru", "sm", "gd", "sr", "st", "sn", "sd", "si", "sk", "sl", "so", "es", "su", "sw", "sv", "tl", "tg", "ta", "tt", "te", "th", "tr", "tk", "uk", "ur", "ug", "uz", "vi", "cy", "xh", "yi", "yo", "zu");
    public static LinkedHashSet O = null;
    public final HashMap D;
    public final HashMap E;
    public final HashSet F;
    public final HashMap G;
    public final HashMap H;
    public final HashSet I;
    public final HashSet J;
    public final HashSet K;
    public final HashSet L;
    public final LongSparseArray a;
    public final HashSet b;
    public final HashMap c;
    public final HashMap d;
    public final HashMap e;
    public final HashMap f;
    public final HashSet h;
    public final vp n;
    public Boolean r;
    public Boolean s;
    public final ArrayList w;
    public final HashSet x;
    public final HashSet y;

    public t10(vp vpVar) {
        super(vpVar.currentAccount);
        this.a = new LongSparseArray();
        this.b = new HashSet();
        this.c = new HashMap();
        this.d = new HashMap();
        this.e = new HashMap();
        this.f = new HashMap();
        this.h = new HashSet();
        this.w = new ArrayList();
        this.x = new HashSet();
        this.y = new HashSet();
        this.D = new HashMap();
        this.E = new HashMap();
        this.F = new HashSet();
        this.G = new HashMap();
        this.H = new HashMap();
        this.I = new HashSet();
        this.J = new HashSet();
        this.K = new HashSet();
        this.L = new HashSet();
        this.n = vpVar;
        i0.h3(new ms(this, 18), 150L);
    }

    public static String D(String str) {
        if (str == null) {
            return null;
        }
        if (str.contains("_")) {
            String[] split = str.split("_", 2);
            return split[0].toLowerCase() + "-" + split[1].toUpperCase();
        }
        if (!str.contains("-")) {
            return str;
        }
        String[] split2 = str.split("-", 2);
        return split2[0].toLowerCase() + "-" + split2[1].toUpperCase();
    }

    public static String j() {
        String str = cd.D0().B.f;
        return str != null ? str.split("_")[0] : str;
    }

    public static ArrayList n() {
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        while (true) {
            List list = N;
            if (i10 >= list.size()) {
                break;
            }
            m10 m10Var = new m10();
            String str = (String) list.get(i10);
            m10Var.a = str;
            if ("no".equals(str)) {
                m10Var.a = "nb";
            }
            m10Var.b = m31.K0(m31.O0(m10Var.a, null, null));
            m10Var.c = m31.K0(m31.V0(m10Var.a, true));
            if (m10Var.b != null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(m10Var.b);
                sb2.append(" ");
                String str2 = m10Var.c;
                if (str2 == null) {
                    str2 = "";
                }
                sb2.append(str2);
                m10Var.d = sb2.toString().toLowerCase();
                arrayList.add(m10Var);
            }
            i10++;
        }
        if (Build.VERSION.SDK_INT >= 24) {
            Collections.sort(arrayList, new a10(Collator.getInstance(Locale.getDefault()), 0));
            return arrayList;
        }
        Collections.sort(arrayList, Comparator$-CC.comparing(new k2.f(5)));
        return arrayList;
    }

    public static ArrayList o(String str) {
        ArrayList arrayList = new ArrayList();
        if (O == null) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            try {
                linkedHashSet.add(cd.D0().B.f);
            } catch (Exception e) {
                f8.g(e, true);
            }
            try {
                linkedHashSet.add(Resources.getSystem().getConfiguration().locale.getLanguage());
            } catch (Exception e7) {
                f8.g(e7, true);
            }
            try {
                linkedHashSet.addAll(e01.c0());
            } catch (Exception e10) {
                f8.g(e10, true);
            }
            try {
                InputMethodManager inputMethodManager = (InputMethodManager) w0.b.getSystemService("input_method");
                Iterator<InputMethodInfo> it = inputMethodManager.getEnabledInputMethodList().iterator();
                while (it.hasNext()) {
                    for (InputMethodSubtype inputMethodSubtype : inputMethodManager.getEnabledInputMethodSubtypeList(it.next(), true)) {
                        if ("keyboard".equals(inputMethodSubtype.getMode())) {
                            String locale = inputMethodSubtype.getLocale();
                            if (locale != null && locale.contains("_")) {
                                locale = locale.split("_")[0];
                            }
                            if (m31.O0(locale, null, null) != null) {
                                linkedHashSet.add(locale);
                            }
                        }
                    }
                }
            } catch (Exception e11) {
                f8.g(e11, true);
            }
            O = linkedHashSet;
        }
        Iterator it2 = O.iterator();
        while (it2.hasNext()) {
            String str2 = (String) it2.next();
            if (!TextUtils.equals(str2, str) && (!"no".equals(str) || !"nb".equals(str2))) {
                if (!"nb".equals(str) || !"no".equals(str2)) {
                    m10 m10Var = new m10();
                    m10Var.a = str2;
                    if ("no".equals(str2)) {
                        m10Var.a = "nb";
                    }
                    m10Var.b = m31.K0(m31.O0(m10Var.a, null, null));
                    m10Var.c = m31.K0(m31.V0(m10Var.a, true));
                    if (m10Var.b != null) {
                        m10Var.d = (m10Var.b + " " + m10Var.c).toLowerCase();
                        arrayList.add(m10Var);
                    }
                }
            }
        }
        return arrayList;
    }

    public static boolean x(jj jjVar) {
        TLRPC.Message message;
        if (jjVar == null || (message = jjVar.k) == null || message.summary_from_language == null || jjVar.P3() || jjVar.E0 || jjVar.r4()) {
            return false;
        }
        int i10 = jjVar.D;
        return (i10 == 0 || i10 == 3 || i10 == 1 || i10 == 9 || i10 == 14 || i10 == 17) && !TextUtils.isEmpty(jjVar.k.message) && jjVar.k.message.length() > 100;
    }

    public static boolean y(jj jjVar) {
        if (jjVar == null || jjVar.k == null || jjVar.P3() || jjVar.E0 || jjVar.r4() || (jj.n1(jjVar) instanceof TLRPC.TL_messageMediaWidget)) {
            return false;
        }
        int i10 = jjVar.D;
        if (i10 != 0 && i10 != 3 && i10 != 1 && i10 != 2 && i10 != 5 && i10 != 9 && i10 != 14 && i10 != 17 && i10 != 36) {
            return false;
        }
        if (TextUtils.isEmpty(jjVar.k.message) && !(jj.n1(jjVar) instanceof TLRPC.TL_messageMediaPoll)) {
            TLRPC.Message message = jjVar.k;
            if (message.rich_message == null && (!message.voiceTranscriptionOpen || TextUtils.isEmpty(message.voiceTranscription) || !jjVar.k.voiceTranscriptionFinal)) {
                return false;
            }
        }
        return true;
    }

    public final boolean A(jj jjVar) {
        TLRPC.Message message;
        boolean z10 = true;
        if (jjVar != null && (message = jjVar.k) != null && message.summarizedOpen) {
            return this.F.contains(Integer.valueOf(Objects.hash(Long.valueOf(jj.B0(message)), Integer.valueOf(jjVar.f1()), Integer.valueOf(B(jj.B0(jjVar.k)) ? 1 : 0))));
        }
        synchronized (this) {
            if (jjVar != null) {
                try {
                    TLRPC.Message message2 = jjVar.k;
                    if (message2 != null) {
                        if (((message2.voiceTranscriptionOpen && message2.voiceTranscriptionFinal) ? this.y : this.x).contains(Integer.valueOf(jjVar.f1())) && B(jj.B0(jjVar.k))) {
                        }
                    }
                } finally {
                }
            }
            z10 = false;
        }
        return z10;
    }

    public final boolean B(long j10) {
        if (v(j10)) {
            return ((Boolean) this.a.get(j10, Boolean.valueOf(q(j10)))).booleanValue();
        }
        return false;
    }

    public final void C(jj jjVar) {
        Long valueOf = Long.valueOf(jj.B0(jjVar.k));
        HashMap hashMap = this.f;
        HashMap hashMap2 = (HashMap) hashMap.get(valueOf);
        if (hashMap2 == null) {
            Long valueOf2 = Long.valueOf(jj.B0(jjVar.k));
            HashMap hashMap3 = new HashMap();
            hashMap.put(valueOf2, hashMap3);
            hashMap2 = hashMap3;
        }
        hashMap2.put(Integer.valueOf(jjVar.f1()), jjVar);
    }

    public final void E(jj jjVar, String str, j10 j10Var) {
        Throwable th2;
        n10 n10Var;
        if (jjVar.f1() >= 0) {
            long B0 = jj.B0(jjVar.k);
            synchronized (this) {
                try {
                    try {
                        ArrayList arrayList = (ArrayList) this.G.get(Long.valueOf(B0));
                        if (arrayList == null) {
                            try {
                                HashMap hashMap = this.G;
                                Long valueOf = Long.valueOf(B0);
                                ArrayList arrayList2 = new ArrayList();
                                hashMap.put(valueOf, arrayList2);
                                arrayList = arrayList2;
                            } catch (Throwable th3) {
                                th2 = th3;
                                throw th2;
                            }
                        }
                        if (arrayList.isEmpty()) {
                            n10Var = new n10();
                            arrayList.add(n10Var);
                        } else {
                            n10Var = (n10) arrayList.get(arrayList.size() - 1);
                        }
                        if (n10Var.b.contains(Integer.valueOf(jjVar.f1()))) {
                            return;
                        }
                        TLRPC.MessageMedia n12 = jj.n1(jjVar);
                        if (n12 instanceof TLRPC.TL_messageMediaPoll) {
                            q10 a2 = q10.a((TLRPC.TL_messageMediaPoll) n12);
                            q10 q10Var = jjVar.k.translatedPoll;
                            TLRPC.TL_textWithEntities tL_textWithEntities = a2.a;
                            int length = tL_textWithEntities != null ? tL_textWithEntities.text.length() : 0;
                            for (int i10 = 0; i10 < a2.b.size(); i10++) {
                                length += ((TLRPC.PollAnswer) a2.b.get(i10)).text.text.length();
                            }
                            TLRPC.TL_textWithEntities tL_textWithEntities2 = a2.c;
                            if (tL_textWithEntities2 != null) {
                                length += tL_textWithEntities2.text.length();
                            }
                            if (n10Var.g + length >= 25000 || n10Var.b.size() + 1 >= 20) {
                                i0.r(n10Var.a);
                                i0.g3(n10Var.a);
                                n10Var = new n10();
                                arrayList.add(n10Var);
                            }
                            or orVar = n10Var.a;
                            if (orVar != null) {
                                i0.r(orVar);
                            }
                            this.x.add(Integer.valueOf(jjVar.f1()));
                            n10Var.b.add(Integer.valueOf(jjVar.f1()));
                            f8.b("pending translation +" + jjVar.f1() + " poll message");
                            n10Var.c.add(new Pair(a2, q10Var));
                            n10Var.d.add(j10Var);
                            n10Var.e = str;
                            n10Var.g = n10Var.g + length;
                            n10 n10Var2 = n10Var;
                            or orVar2 = new or(this, B0, n10Var2, 8);
                            n10Var2.a = orVar2;
                            i0.h3(orVar2, n10Var2.f);
                            n10Var2.f /= 2;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        th2 = th;
                        throw th2;
                    }
                } catch (Throwable th5) {
                    th = th5;
                    th2 = th;
                    throw th2;
                }
            }
        }
    }

    public final void F(jj jjVar, String str, q20 q20Var) {
        int i10 = 1;
        int hash = Objects.hash(Long.valueOf(jj.B0(jjVar.k)), Integer.valueOf(jjVar.f1()), Integer.valueOf(str != null ? 1 : 0));
        Integer valueOf = Integer.valueOf(hash);
        HashSet hashSet = this.F;
        if (hashSet.contains(valueOf)) {
            return;
        }
        hashSet.add(Integer.valueOf(hash));
        TLRPC.TL_messages_summarizeText tL_messages_summarizeText = new TLRPC.TL_messages_summarizeText();
        tL_messages_summarizeText.peer = vp.r1(this.currentAccount).i1(jj.B0(jjVar.k));
        tL_messages_summarizeText.id = jjVar.f1();
        if (str != null) {
            tL_messages_summarizeText.flags |= 1;
            tL_messages_summarizeText.to_lang = D(str);
        }
        ConnectionsManager.getInstance(this.currentAccount).sendRequestTyped(tL_messages_summarizeText, new a3.b(i10), new tt(this, hash, q20Var));
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x00f6 A[Catch: all -> 0x006f, TryCatch #0 {all -> 0x006f, blocks: (B:25:0x0055, B:27:0x0061, B:28:0x0072, B:30:0x0078, B:31:0x008c, B:33:0x009c, B:37:0x00a0, B:40:0x00ca, B:42:0x00d1, B:46:0x00f2, B:48:0x00f6, B:49:0x00f9, B:50:0x0152, B:52:0x00df, B:53:0x00a7, B:54:0x00ac, B:56:0x00b0, B:58:0x00b4, B:59:0x00b9, B:61:0x00bd, B:62:0x00c2, B:64:0x00c6, B:65:0x0081), top: B:24:0x0055 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void G(jj jjVar, String str, l10 l10Var) {
        p10 p10Var;
        String str2;
        c4 c4Var;
        if (jjVar.k == null || jjVar.f1() < 0) {
            return;
        }
        TLRPC.Message message = jjVar.k;
        int i10 = 0;
        boolean z10 = message.voiceTranscription != null && message.voiceTranscriptionFinal && message.voiceTranscriptionOpen;
        long B0 = jj.B0(message);
        HashMap hashMap = z10 ? this.E : this.D;
        HashSet hashSet = z10 ? this.y : this.x;
        TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
        if (z10) {
            String str3 = jjVar.k.voiceTranscription;
            tL_textWithEntities.text = str3;
            if (TextUtils.isEmpty(str3)) {
                return;
            }
        } else {
            TLRPC.Message message2 = jjVar.k;
            tL_textWithEntities.text = message2.message;
            tL_textWithEntities.entities = message2.entities;
        }
        synchronized (this) {
            try {
                ArrayList arrayList = (ArrayList) hashMap.get(Long.valueOf(B0));
                if (arrayList == null) {
                    Long valueOf = Long.valueOf(B0);
                    ArrayList arrayList2 = new ArrayList();
                    hashMap.put(valueOf, arrayList2);
                    arrayList = arrayList2;
                }
                if (arrayList.isEmpty()) {
                    p10Var = new p10();
                    arrayList.add(p10Var);
                } else {
                    p10Var = (p10) arrayList.get(arrayList.size() - 1);
                }
                if (p10Var.b.contains(Integer.valueOf(jjVar.f1()))) {
                    return;
                }
                if (z10) {
                    String str4 = jjVar.k.voiceTranscription;
                    if (str4 != null) {
                        i10 = str4.length();
                    }
                } else {
                    TLRPC.Message message3 = jjVar.k;
                    if (message3 == null || (str2 = message3.message) == null) {
                        CharSequence charSequence = jjVar.z;
                        if (charSequence != null) {
                            i10 = charSequence.length();
                        } else {
                            CharSequence charSequence2 = jjVar.v;
                            if (charSequence2 != null) {
                                i10 = charSequence2.length();
                            }
                        }
                    } else {
                        i10 = str2.length();
                    }
                }
                if (p10Var.g + i10 < 25000) {
                    if (p10Var.b.size() + 1 >= 20) {
                    }
                    p10 p10Var2 = p10Var;
                    c4Var = p10Var2.a;
                    if (c4Var != null) {
                        i0.r(c4Var);
                    }
                    hashSet.add(Integer.valueOf(jjVar.f1()));
                    p10Var2.b.add(Integer.valueOf(jjVar.f1()));
                    f8.b("pending translation +" + jjVar.f1() + " message");
                    p10Var2.c.add(tL_textWithEntities);
                    p10Var2.d.add(l10Var);
                    p10Var2.e = str;
                    p10Var2.g += i10;
                    c4 c4Var2 = new c4(this, hashMap, B0, p10Var2, z10, hashSet);
                    p10Var2.a = c4Var2;
                    i0.h3(c4Var2, p10Var2.f);
                    p10Var2.f /= 2;
                }
                i0.r(p10Var.a);
                i0.g3(p10Var.a);
                p10Var = new p10();
                arrayList.add(p10Var);
                p10 p10Var22 = p10Var;
                c4Var = p10Var22.a;
                if (c4Var != null) {
                }
                hashSet.add(Integer.valueOf(jjVar.f1()));
                p10Var22.b.add(Integer.valueOf(jjVar.f1()));
                f8.b("pending translation +" + jjVar.f1() + " message");
                p10Var22.c.add(tL_textWithEntities);
                p10Var22.d.add(l10Var);
                p10Var22.e = str;
                p10Var22.g += i10;
                c4 c4Var22 = new c4(this, hashMap, B0, p10Var22, z10, hashSet);
                p10Var22.a = c4Var22;
                i0.h3(c4Var22, p10Var22.f);
                p10Var22.f /= 2;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void H() {
        StringBuilder sb2 = new StringBuilder();
        boolean z10 = true;
        int i10 = 0;
        while (true) {
            LongSparseArray longSparseArray = this.a;
            if (i10 >= longSparseArray.size()) {
                break;
            }
            try {
                long keyAt = longSparseArray.keyAt(i10);
                if (!z10) {
                    sb2.append(";");
                }
                if (z10) {
                    z10 = false;
                }
                String str = (String) this.e.get(Long.valueOf(keyAt));
                String str2 = "null";
                if (str == null) {
                    str = "null";
                }
                String m10 = m(keyAt);
                if (m10 != null) {
                    str2 = m10;
                }
                sb2.append(keyAt);
                sb2.append("=");
                sb2.append(str);
                sb2.append(">");
                sb2.append(str2);
                if (!((Boolean) longSparseArray.valueAt(i10)).booleanValue()) {
                    sb2.append("!");
                }
            } catch (Exception unused) {
            }
            i10++;
        }
        HashSet hashSet = new HashSet();
        Iterator it = this.h.iterator();
        while (it.hasNext()) {
            try {
                hashSet.add("" + it.next());
            } catch (Exception e) {
                f8.g(e, true);
            }
        }
        vp.r1(this.currentAccount).f7.edit().putString("translating_dialog_languages2", sb2.toString()).putStringSet("hidden_translation_at", hashSet).apply();
    }

    public final void I(long j10, String str) {
        t10 t10Var;
        long j11;
        String str2;
        Boolean bool;
        if (TextUtils.equals(m(j10), str)) {
            return;
        }
        if (B(j10)) {
            t10Var = this;
            j11 = j10;
            str2 = str;
            i0.h3(new d4(t10Var, j11, str2, 9), 150L);
        } else {
            t10Var = this;
            j11 = j10;
            str2 = str;
            synchronized (this) {
                t10Var.d.put(Long.valueOf(j11), str2);
            }
        }
        c(j11);
        synchronized (this) {
            LongSparseArray longSparseArray = t10Var.a;
            bool = Boolean.FALSE;
            longSparseArray.put(j11, bool);
        }
        zs.f(t10Var.currentAccount).k(zs.P1, Long.valueOf(j11), bool);
        m31.S0(str2);
    }

    public final void J(long j10, boolean z10, boolean z11) {
        TLRPC.TL_messages_togglePeerTranslations tL_messages_togglePeerTranslations = new TLRPC.TL_messages_togglePeerTranslations();
        tL_messages_togglePeerTranslations.peer = getMessagesController().i1(j10);
        tL_messages_togglePeerTranslations.disabled = z10;
        getConnectionsManager().sendRequest(tL_messages_togglePeerTranslations, null);
        TLRPC.ChatFull M0 = getMessagesController().M0(-j10);
        if (M0 != null) {
            M0.translations_disabled = z10;
            getMessagesStorage().N1(M0, true);
        }
        TLRPC.UserFull a2 = getMessagesController().a2(j10);
        if (a2 != null) {
            a2.translations_disabled = z10;
            getMessagesStorage().j2(a2, true);
        }
        synchronized (this) {
            try {
                if (z10) {
                    this.h.add(Long.valueOf(j10));
                    this.a.remove(j10);
                } else {
                    this.h.remove(Long.valueOf(j10));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        H();
        if (z11) {
            return;
        }
        zs.f(this.currentAccount).k(zs.P1, Long.valueOf(j10), Boolean.valueOf(B(j10)));
    }

    public final boolean K(long j10, boolean z10) {
        boolean B = B(j10);
        int i10 = zs.P1;
        boolean z11 = true;
        LongSparseArray longSparseArray = this.a;
        if (z10 && !B) {
            Boolean bool = Boolean.TRUE;
            longSparseArray.put(j10, bool);
            zs.f(this.currentAccount).k(i10, Long.valueOf(j10), bool);
        } else if (z10 || !B) {
            z11 = false;
        } else {
            Boolean bool2 = Boolean.FALSE;
            longSparseArray.put(j10, bool2);
            zs.f(this.currentAccount).k(i10, Long.valueOf(j10), bool2);
            c(j10);
        }
        H();
        return z11;
    }

    public final void L(jj jjVar, jp0 jp0Var) {
        if (jjVar == null || jjVar.k == null) {
            return;
        }
        c3.s sVar = new c3.s(jjVar);
        String M0 = m31.M0();
        TLRPC.Message message = jjVar.k;
        if (message.translatedText != null && TextUtils.equals(message.translatedToLanguage, M0)) {
            jp0Var.run();
            return;
        }
        HashSet hashSet = this.L;
        if (hashSet.contains(sVar)) {
            jp0Var.run();
            return;
        }
        hashSet.add(sVar);
        TLRPC.TL_messages_translateText tL_messages_translateText = new TLRPC.TL_messages_translateText();
        tL_messages_translateText.flags |= 2;
        TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
        TLRPC.Message message2 = jjVar.k;
        tL_textWithEntities.text = message2.message;
        ArrayList<TLRPC.MessageEntity> arrayList = message2.entities;
        tL_textWithEntities.entities = arrayList;
        if (arrayList == null) {
            tL_textWithEntities.entities = new ArrayList<>();
        }
        tL_messages_translateText.text.add(tL_textWithEntities);
        tL_messages_translateText.to_lang = D(M0);
        getConnectionsManager().sendRequest(tL_messages_translateText, new nm(this, jjVar, M0, sVar, jp0Var, System.currentTimeMillis(), tL_textWithEntities));
    }

    public final void M(long j10) {
        boolean z10;
        if (v(j10) && t(j10)) {
            boolean contains = this.h.contains(Long.valueOf(j10));
            TLRPC.ChatFull M0 = getMessagesController().M0(-j10);
            if (M0 != null) {
                z10 = M0.translations_disabled;
            } else {
                TLRPC.UserFull a2 = getMessagesController().a2(j10);
                z10 = a2 != null ? a2.translations_disabled : false;
            }
            synchronized (this) {
                try {
                    if (z10) {
                        this.h.add(Long.valueOf(j10));
                        this.a.remove(j10);
                    } else {
                        this.h.remove(Long.valueOf(j10));
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (contains != z10) {
                H();
                zs.f(this.currentAccount).k(zs.P1, Long.valueOf(j10), Boolean.valueOf(B(j10)));
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0025, code lost:
    
        if (android.text.TextUtils.equals(r0.translatedToLanguage, org.telegram.ui.Components.m31.M0()) != false) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean b(jj jjVar, String str) {
        String str2;
        TLRPC.Message message = jjVar.k;
        if (message != null && (str2 = message.originalLanguage) != null) {
            str = str2;
        }
        if (message == null || TextUtils.isEmpty(message.message)) {
            return false;
        }
        if (str == null) {
            TLRPC.Message message2 = jjVar.k;
            if (message2.translatedText != null) {
            }
        }
        if (str == null || w(jjVar.k.originalLanguage)) {
            return false;
        }
        return !jjVar.J2;
    }

    public final void c(long j10) {
        synchronized (this) {
            try {
                ArrayList arrayList = (ArrayList) this.D.get(Long.valueOf(j10));
                if (arrayList != null) {
                    int size = arrayList.size();
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        p10 p10Var = (p10) obj;
                        i0.r(p10Var.a);
                        if (p10Var.h != -1) {
                            getConnectionsManager().cancelRequest(p10Var.h, true);
                            ArrayList arrayList2 = p10Var.b;
                            int size2 = arrayList2.size();
                            int i11 = 0;
                            while (i11 < size2) {
                                Object obj2 = arrayList2.get(i11);
                                i11++;
                                this.x.remove((Integer) obj2);
                            }
                        }
                    }
                    this.D.remove(Long.valueOf(j10));
                }
                ArrayList arrayList3 = (ArrayList) this.E.get(Long.valueOf(j10));
                if (arrayList3 != null) {
                    int size3 = arrayList3.size();
                    int i12 = 0;
                    while (i12 < size3) {
                        Object obj3 = arrayList3.get(i12);
                        i12++;
                        p10 p10Var2 = (p10) obj3;
                        i0.r(p10Var2.a);
                        if (p10Var2.h != -1) {
                            getConnectionsManager().cancelRequest(p10Var2.h, true);
                            ArrayList arrayList4 = p10Var2.b;
                            int size4 = arrayList4.size();
                            int i13 = 0;
                            while (i13 < size4) {
                                Object obj4 = arrayList4.get(i13);
                                i13++;
                                this.y.remove((Integer) obj4);
                            }
                        }
                    }
                    this.E.remove(Long.valueOf(j10));
                }
                ArrayList arrayList5 = (ArrayList) this.G.get(Long.valueOf(j10));
                if (arrayList5 != null) {
                    int size5 = arrayList5.size();
                    int i14 = 0;
                    while (i14 < size5) {
                        Object obj5 = arrayList5.get(i14);
                        i14++;
                        n10 n10Var = (n10) obj5;
                        i0.r(n10Var.a);
                        if (n10Var.h != -1) {
                            getConnectionsManager().cancelRequest(n10Var.h, true);
                            ArrayList arrayList6 = n10Var.b;
                            int size6 = arrayList6.size();
                            int i15 = 0;
                            while (i15 < size6) {
                                Object obj6 = arrayList6.get(i15);
                                i15++;
                                this.x.remove((Integer) obj6);
                            }
                        }
                    }
                    this.G.remove(Long.valueOf(j10));
                }
                ArrayList arrayList7 = (ArrayList) this.H.get(Long.valueOf(j10));
                if (arrayList7 != null) {
                    int size7 = arrayList7.size();
                    int i16 = 0;
                    while (i16 < size7) {
                        Object obj7 = arrayList7.get(i16);
                        i16++;
                        o10 o10Var = (o10) obj7;
                        i0.r(o10Var.a);
                        if (o10Var.f != -1) {
                            getConnectionsManager().cancelRequest(o10Var.f, true);
                            ArrayList arrayList8 = o10Var.b;
                            int size8 = arrayList8.size();
                            int i17 = 0;
                            while (i17 < size8) {
                                Object obj8 = arrayList8.get(i17);
                                i17++;
                                this.x.remove((Integer) obj8);
                            }
                        }
                    }
                    this.H.remove(Long.valueOf(j10));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void d(long j10) {
        if (v(j10)) {
            e(j10);
        }
    }

    public final void e(long j10) {
        if (((Boolean) this.a.get(j10, Boolean.valueOf(q(j10)))).booleanValue()) {
            getMessagesStorage().a.c(new b10(this, j10, 1));
        }
    }

    public final void f(jj jjVar) {
        TLRPC.Message message;
        String str;
        String str2;
        if (jjVar == null || (message = jjVar.k) == null) {
            return;
        }
        long B0 = jj.B0(message);
        Long valueOf = Long.valueOf(B0);
        HashMap hashMap = this.c;
        s10 s10Var = (s10) hashMap.get(valueOf);
        if (s10Var == null) {
            Long valueOf2 = Long.valueOf(B0);
            s10 s10Var2 = new s10();
            s10Var2.a = new HashSet();
            s10Var2.b = new HashSet();
            s10Var2.c = new HashSet();
            hashMap.put(valueOf2, s10Var2);
            s10Var = s10Var2;
        }
        HashSet hashSet = s10Var.c;
        HashSet hashSet2 = s10Var.a;
        HashSet hashSet3 = s10Var.b;
        boolean z10 = false;
        boolean z11 = y(jjVar) && ((str2 = jjVar.k.originalLanguage) == null || "und".equals(str2));
        if (y(jjVar) && (str = jjVar.k.originalLanguage) != null && !"und".equals(str) && !w(jjVar.k.originalLanguage)) {
            z10 = true;
        }
        if (z11) {
            hashSet3.add(Integer.valueOf(jjVar.f1()));
        } else {
            (z10 ? hashSet2 : hashSet).add(Integer.valueOf(jjVar.f1()));
        }
        if (!z11) {
            this.e.put(Long.valueOf(B0), jjVar.k.originalLanguage);
        }
        int size = hashSet2.size();
        int size2 = hashSet3.size();
        int size3 = size + size2 + hashSet.size();
        boolean q6 = q(B0);
        if (size3 >= (q6 ? 2 : 6)) {
            if (q6) {
                if (size < 2.0f) {
                    return;
                }
            } else if (size / (size + r4) < 0.6f) {
                return;
            }
            if (size2 / size3 < (q6 ? 0.8f : 0.65f)) {
                this.b.add(Long.valueOf(B0));
                hashMap.remove(Long.valueOf(B0));
                i0.h3(new b10(this, B0, 0), 450L);
            }
        }
    }

    public final void g() {
        synchronized (this) {
            try {
                this.c.clear();
                ArrayList arrayList = new ArrayList();
                Iterator it = this.b.iterator();
                while (it.hasNext()) {
                    Long l4 = (Long) it.next();
                    long longValue = l4.longValue();
                    String str = (String) this.e.get(l4);
                    if (str != null && w(str)) {
                        c(longValue);
                        this.a.remove(longValue);
                        arrayList.add(l4);
                    }
                }
                this.b.clear();
                H();
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    Long l10 = (Long) obj;
                    l10.getClass();
                    zs.f(this.currentAccount).k(zs.P1, l10, Boolean.FALSE);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [org.telegram.messenger.l10] */
    /* JADX WARN: Type inference failed for: r0v14, types: [org.telegram.messenger.j10] */
    public final void h(jj jjVar, boolean z10, final boolean z11) {
        TLRPC.Message message;
        final jj jjVar2;
        q10 q10Var;
        o10 o10Var;
        q10 q10Var2;
        jj jjVar3;
        if (jjVar == null || (message = jjVar.k) == null) {
            return;
        }
        final long B0 = jj.B0(message);
        r2 = null;
        r2 = null;
        String str = null;
        if (z10) {
            TLRPC.Message message2 = jjVar.k;
            if (message2.summarizedOpen && message2.summaryText == null && !B(jj.B0(message2))) {
                F(jjVar, null, new h10(this, jjVar, B0));
            }
        }
        if (v(B0)) {
            if (!z11 && (jjVar3 = jjVar.C) != null) {
                h(jjVar3, z10, true);
            }
            if (y(jjVar)) {
                if (!B(B0)) {
                    TLRPC.Message message3 = jjVar.k;
                    if (message3 != null) {
                        if (!TextUtils.isEmpty(message3.message)) {
                            str = jjVar.k.message;
                        } else if (jjVar.D == 36 && !TextUtils.isEmpty(jjVar.v)) {
                            str = jjVar.v.toString();
                        }
                    }
                    if (!y(jjVar) || jjVar.k == null || TextUtils.isEmpty(str)) {
                        return;
                    }
                    TLRPC.Message message4 = jjVar.k;
                    if (message4.originalLanguage != null) {
                        f(jjVar);
                        return;
                    }
                    long B02 = jj.B0(message4);
                    int hash = Objects.hash(Long.valueOf(jj.B0(jjVar.k)), Integer.valueOf(jjVar.f1()));
                    if (t(B02) || this.w.contains(Integer.valueOf(hash))) {
                        return;
                    }
                    this.w.add(Integer.valueOf(hash));
                    Utilities.d.c(new z00(this, str, jjVar, B02, hash, 0));
                    return;
                }
                if (z(B0)) {
                    return;
                }
                String m10 = m(B0);
                if (!z11 && jjVar.D != 36) {
                    TLRPC.Message message5 = jjVar.k;
                    if ((((message5.voiceTranscriptionOpen && message5.voiceTranscriptionFinal) ? message5.translatedVoiceTranscription : message5.translatedText) == null && message5.translatedPoll == null) || (((q10Var2 = message5.translatedPoll) != null && !q10.b(jjVar, q10Var2)) || !m10.equals(jjVar.k.translatedToLanguage))) {
                        int f12 = jjVar.f1();
                        HashMap hashMap = (HashMap) this.f.get(Long.valueOf(B0));
                        jjVar2 = hashMap != null ? (jj) hashMap.get(Integer.valueOf(f12)) : null;
                        if (jjVar2 != null) {
                            TLRPC.Message message6 = jjVar.k;
                            TLRPC.Message message7 = jjVar2.k;
                            message6.translatedToLanguage = message7.translatedToLanguage;
                            message6.translatedText = message7.translatedText;
                            message6.translatedPoll = message7.translatedPoll;
                            if (z10 || !B(B0)) {
                            }
                            if (jjVar2.D != 36) {
                                TLRPC.Message message8 = jjVar2.k;
                                if (message8.summarizedOpen) {
                                    if (message8.translatedSummaryText == null || !m10.equals(message8.translatedSummaryLanguage)) {
                                        F(jjVar2, m10, new k10(this, jjVar2, m10, B0));
                                        return;
                                    }
                                    return;
                                }
                                if (!(((message8.voiceTranscriptionOpen && message8.voiceTranscriptionFinal) ? message8.translatedVoiceTranscription : message8.translatedText) == null && message8.translatedPoll == null) && (((q10Var = message8.translatedPoll) == null || q10.b(jjVar2, q10Var)) && m10.equals(jjVar2.k.translatedToLanguage))) {
                                    if (z11) {
                                        C(jjVar2);
                                        return;
                                    }
                                    return;
                                } else {
                                    zs.f(this.currentAccount).k(zs.N1, jjVar2);
                                    if (!(jj.n1(jjVar2) instanceof TLRPC.TL_messageMediaPoll)) {
                                        G(jjVar2, m10, new n20() { // from class: org.telegram.messenger.l10
                                            @Override // org.telegram.messenger.n20
                                            public final void a(Object obj, Object obj2, Object obj3, Object obj4) {
                                                Boolean bool = (Boolean) obj;
                                                Integer num = (Integer) obj2;
                                                TLRPC.TL_textWithEntities tL_textWithEntities = (TLRPC.TL_textWithEntities) obj3;
                                                String str2 = (String) obj4;
                                                jj jjVar4 = jjVar2;
                                                if (jjVar4.f1() != num.intValue()) {
                                                    f8.d("wtf, asked to translate " + jjVar4.f1() + " but got " + num + "!");
                                                }
                                                jjVar4.k.translatedToLanguage = str2;
                                                if (bool.booleanValue()) {
                                                    jjVar4.k.translatedVoiceTranscription = tL_textWithEntities;
                                                } else {
                                                    jjVar4.k.translatedText = tL_textWithEntities;
                                                }
                                                jjVar4.k.translatedPoll = null;
                                                t10 t10Var = t10.this;
                                                if (z11) {
                                                    t10Var.C(jjVar4);
                                                }
                                                hs messagesStorage = t10Var.getMessagesStorage();
                                                TLRPC.Message message9 = jjVar4.k;
                                                long j10 = B0;
                                                messagesStorage.X1(j10, message9);
                                                zs.f(t10Var.currentAccount).k(zs.M1, jjVar4);
                                                ArrayList arrayList = (ArrayList) t10Var.n.R.f(j10);
                                                if (arrayList != null) {
                                                    for (int i10 = 0; i10 < arrayList.size(); i10++) {
                                                        jj jjVar5 = (jj) arrayList.get(i10);
                                                        if (jjVar5 != null && jjVar5.f1() == jjVar4.f1()) {
                                                            jjVar5.k.translatedToLanguage = str2;
                                                            if (bool.booleanValue()) {
                                                                jjVar5.k.translatedVoiceTranscription = tL_textWithEntities;
                                                            } else {
                                                                jjVar5.k.translatedText = tL_textWithEntities;
                                                            }
                                                            jjVar5.k.translatedPoll = null;
                                                            if (jjVar5.e6(false)) {
                                                                zs.f(t10Var.currentAccount).k(zs.r, 0);
                                                                return;
                                                            }
                                                            return;
                                                        }
                                                    }
                                                }
                                            }
                                        });
                                        return;
                                    } else {
                                        final int i10 = 1;
                                        E(jjVar2, m10, new l20(this) { // from class: org.telegram.messenger.j10
                                            public final /* synthetic */ t10 b;

                                            {
                                                this.b = this;
                                            }

                                            @Override // org.telegram.messenger.l20
                                            public final void a(Object obj, Object obj2, Object obj3) {
                                                int i11 = i10;
                                                long j10 = B0;
                                                boolean z12 = z11;
                                                jj jjVar4 = jjVar2;
                                                t10 t10Var = this.b;
                                                switch (i11) {
                                                    case 0:
                                                        Integer num = (Integer) obj;
                                                        TL_iv.RichMessage richMessage = (TL_iv.RichMessage) obj2;
                                                        String str2 = (String) obj3;
                                                        if (jjVar4.f1() != num.intValue()) {
                                                            f8.d("wtf, asked to translate " + jjVar4.f1() + " rich message but got " + num + "!");
                                                        }
                                                        TLRPC.Message message9 = jjVar4.k;
                                                        message9.translatedToLanguage = str2;
                                                        message9.translatedText = null;
                                                        message9.translatedVoiceTranscription = null;
                                                        message9.translatedPoll = null;
                                                        message9.translatedRichMessage = richMessage;
                                                        if (z12) {
                                                            t10Var.C(jjVar4);
                                                        }
                                                        t10Var.getMessagesStorage().X1(j10, jjVar4.k);
                                                        zs.f(t10Var.currentAccount).k(128, jjVar4);
                                                        ArrayList arrayList = (ArrayList) t10Var.n.R.f(j10);
                                                        if (arrayList != null) {
                                                            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                                                                jj jjVar5 = (jj) arrayList.get(i12);
                                                                if (jjVar5 != null && jjVar5.f1() == jjVar4.f1()) {
                                                                    TLRPC.Message message10 = jjVar5.k;
                                                                    message10.translatedToLanguage = str2;
                                                                    message10.translatedRichMessage = richMessage;
                                                                    if (jjVar5.e6(false)) {
                                                                        zs.f(t10Var.currentAccount).k(2, 0);
                                                                        break;
                                                                    }
                                                                }
                                                            }
                                                            break;
                                                        }
                                                        break;
                                                    default:
                                                        Integer num2 = (Integer) obj;
                                                        q10 q10Var3 = (q10) obj2;
                                                        String str3 = (String) obj3;
                                                        boolean z13 = false;
                                                        if (jjVar4.f1() != num2.intValue()) {
                                                            f8.d("wtf, asked to translate " + jjVar4.f1() + " poll but got " + num2 + "!");
                                                        }
                                                        TLRPC.Message message11 = jjVar4.k;
                                                        message11.translatedToLanguage = str3;
                                                        message11.translatedText = null;
                                                        message11.translatedVoiceTranscription = null;
                                                        message11.translatedPoll = q10Var3;
                                                        if (z12) {
                                                            t10Var.C(jjVar4);
                                                        }
                                                        t10Var.getMessagesStorage().X1(j10, jjVar4.k);
                                                        zs.f(t10Var.currentAccount).k(128, jjVar4);
                                                        ArrayList arrayList2 = (ArrayList) t10Var.n.R.f(j10);
                                                        if (arrayList2 != null) {
                                                            int i13 = 0;
                                                            while (i13 < arrayList2.size()) {
                                                                jj jjVar6 = (jj) arrayList2.get(i13);
                                                                if (jjVar6 != null && jjVar6.f1() == jjVar4.f1()) {
                                                                    TLRPC.Message message12 = jjVar6.k;
                                                                    message12.translatedToLanguage = str3;
                                                                    message12.translatedText = null;
                                                                    message12.translatedVoiceTranscription = null;
                                                                    message12.translatedPoll = q10Var3;
                                                                    boolean z14 = z13;
                                                                    if (jjVar6.e6(z14)) {
                                                                        zs f7 = zs.f(t10Var.currentAccount);
                                                                        Object[] objArr = new Object[1];
                                                                        objArr[z14 ? 1 : 0] = Integer.valueOf(z14 ? 1 : 0);
                                                                        f7.k(2, objArr);
                                                                        break;
                                                                    }
                                                                } else {
                                                                    i13++;
                                                                    z13 = false;
                                                                }
                                                            }
                                                            break;
                                                        }
                                                        break;
                                                }
                                            }
                                        });
                                        return;
                                    }
                                }
                            }
                            TLRPC.Message message9 = jjVar2.k;
                            if (message9.translatedRichMessage == null || !m10.equals(message9.translatedToLanguage)) {
                                zs.f(this.currentAccount).k(zs.N1, jjVar2);
                                final int i11 = 0;
                                l20 l20Var = new l20(this) { // from class: org.telegram.messenger.j10
                                    public final /* synthetic */ t10 b;

                                    {
                                        this.b = this;
                                    }

                                    @Override // org.telegram.messenger.l20
                                    public final void a(Object obj, Object obj2, Object obj3) {
                                        int i112 = i11;
                                        long j10 = B0;
                                        boolean z12 = z11;
                                        jj jjVar4 = jjVar2;
                                        t10 t10Var = this.b;
                                        switch (i112) {
                                            case 0:
                                                Integer num = (Integer) obj;
                                                TL_iv.RichMessage richMessage = (TL_iv.RichMessage) obj2;
                                                String str2 = (String) obj3;
                                                if (jjVar4.f1() != num.intValue()) {
                                                    f8.d("wtf, asked to translate " + jjVar4.f1() + " rich message but got " + num + "!");
                                                }
                                                TLRPC.Message message92 = jjVar4.k;
                                                message92.translatedToLanguage = str2;
                                                message92.translatedText = null;
                                                message92.translatedVoiceTranscription = null;
                                                message92.translatedPoll = null;
                                                message92.translatedRichMessage = richMessage;
                                                if (z12) {
                                                    t10Var.C(jjVar4);
                                                }
                                                t10Var.getMessagesStorage().X1(j10, jjVar4.k);
                                                zs.f(t10Var.currentAccount).k(128, jjVar4);
                                                ArrayList arrayList = (ArrayList) t10Var.n.R.f(j10);
                                                if (arrayList != null) {
                                                    for (int i12 = 0; i12 < arrayList.size(); i12++) {
                                                        jj jjVar5 = (jj) arrayList.get(i12);
                                                        if (jjVar5 != null && jjVar5.f1() == jjVar4.f1()) {
                                                            TLRPC.Message message10 = jjVar5.k;
                                                            message10.translatedToLanguage = str2;
                                                            message10.translatedRichMessage = richMessage;
                                                            if (jjVar5.e6(false)) {
                                                                zs.f(t10Var.currentAccount).k(2, 0);
                                                                break;
                                                            }
                                                        }
                                                    }
                                                    break;
                                                }
                                                break;
                                            default:
                                                Integer num2 = (Integer) obj;
                                                q10 q10Var3 = (q10) obj2;
                                                String str3 = (String) obj3;
                                                boolean z13 = false;
                                                if (jjVar4.f1() != num2.intValue()) {
                                                    f8.d("wtf, asked to translate " + jjVar4.f1() + " poll but got " + num2 + "!");
                                                }
                                                TLRPC.Message message11 = jjVar4.k;
                                                message11.translatedToLanguage = str3;
                                                message11.translatedText = null;
                                                message11.translatedVoiceTranscription = null;
                                                message11.translatedPoll = q10Var3;
                                                if (z12) {
                                                    t10Var.C(jjVar4);
                                                }
                                                t10Var.getMessagesStorage().X1(j10, jjVar4.k);
                                                zs.f(t10Var.currentAccount).k(128, jjVar4);
                                                ArrayList arrayList2 = (ArrayList) t10Var.n.R.f(j10);
                                                if (arrayList2 != null) {
                                                    int i13 = 0;
                                                    while (i13 < arrayList2.size()) {
                                                        jj jjVar6 = (jj) arrayList2.get(i13);
                                                        if (jjVar6 != null && jjVar6.f1() == jjVar4.f1()) {
                                                            TLRPC.Message message12 = jjVar6.k;
                                                            message12.translatedToLanguage = str3;
                                                            message12.translatedText = null;
                                                            message12.translatedVoiceTranscription = null;
                                                            message12.translatedPoll = q10Var3;
                                                            boolean z14 = z13;
                                                            if (jjVar6.e6(z14)) {
                                                                zs f7 = zs.f(t10Var.currentAccount);
                                                                Object[] objArr = new Object[1];
                                                                objArr[z14 ? 1 : 0] = Integer.valueOf(z14 ? 1 : 0);
                                                                f7.k(2, objArr);
                                                                break;
                                                            }
                                                        } else {
                                                            i13++;
                                                            z13 = false;
                                                        }
                                                    }
                                                    break;
                                                }
                                                break;
                                        }
                                    }
                                };
                                if (jjVar2.k == null || jjVar2.f1() < 0) {
                                    return;
                                }
                                TLRPC.Message message10 = jjVar2.k;
                                if (message10.rich_message == null) {
                                    return;
                                }
                                long B03 = jj.B0(message10);
                                synchronized (this) {
                                    try {
                                        ArrayList arrayList = (ArrayList) this.H.get(Long.valueOf(B03));
                                        if (arrayList == null) {
                                            HashMap hashMap2 = this.H;
                                            Long valueOf = Long.valueOf(B03);
                                            ArrayList arrayList2 = new ArrayList();
                                            hashMap2.put(valueOf, arrayList2);
                                            arrayList = arrayList2;
                                        }
                                        if (arrayList.isEmpty()) {
                                            o10Var = new o10();
                                            arrayList.add(o10Var);
                                        } else {
                                            o10Var = (o10) arrayList.get(arrayList.size() - 1);
                                        }
                                        if (o10Var.b.contains(Integer.valueOf(jjVar2.f1()))) {
                                            return;
                                        }
                                        if (o10Var.b.size() + 1 >= 20) {
                                            i0.r(o10Var.a);
                                            i0.g3(o10Var.a);
                                            o10Var = new o10();
                                            arrayList.add(o10Var);
                                        }
                                        or orVar = o10Var.a;
                                        if (orVar != null) {
                                            i0.r(orVar);
                                        }
                                        this.x.add(Integer.valueOf(jjVar2.f1()));
                                        o10Var.b.add(Integer.valueOf(jjVar2.f1()));
                                        f8.b("pending translation +" + jjVar2.f1() + " rich message");
                                        o10Var.c.add(l20Var);
                                        o10Var.d = m10;
                                        o10 o10Var2 = o10Var;
                                        or orVar2 = new or(this, B03, o10Var2, 7);
                                        o10Var2.a = orVar2;
                                        i0.h3(orVar2, o10Var2.e);
                                        o10Var2.e /= 2;
                                        return;
                                    } catch (Throwable th2) {
                                        throw th2;
                                    }
                                }
                            }
                            return;
                        }
                    }
                }
                jjVar2 = jjVar;
                if (z10) {
                }
            }
        }
    }

    public final void i() {
        synchronized (this) {
            try {
                for (ArrayList arrayList : this.D.values()) {
                    if (arrayList != null) {
                        int size = arrayList.size();
                        int i10 = 0;
                        while (i10 < size) {
                            Object obj = arrayList.get(i10);
                            i10++;
                            p10 p10Var = (p10) obj;
                            i0.r(p10Var.a);
                            if (p10Var.h != -1) {
                                getConnectionsManager().cancelRequest(p10Var.h, true);
                                ArrayList arrayList2 = p10Var.b;
                                int size2 = arrayList2.size();
                                int i11 = 0;
                                while (i11 < size2) {
                                    Object obj2 = arrayList2.get(i11);
                                    i11++;
                                    this.x.remove((Integer) obj2);
                                }
                            }
                        }
                    }
                }
                for (ArrayList arrayList3 : this.E.values()) {
                    if (arrayList3 != null) {
                        int size3 = arrayList3.size();
                        int i12 = 0;
                        while (i12 < size3) {
                            Object obj3 = arrayList3.get(i12);
                            i12++;
                            p10 p10Var2 = (p10) obj3;
                            i0.r(p10Var2.a);
                            if (p10Var2.h != -1) {
                                getConnectionsManager().cancelRequest(p10Var2.h, true);
                                ArrayList arrayList4 = p10Var2.b;
                                int size4 = arrayList4.size();
                                int i13 = 0;
                                while (i13 < size4) {
                                    Object obj4 = arrayList4.get(i13);
                                    i13++;
                                    this.y.remove((Integer) obj4);
                                }
                            }
                        }
                    }
                }
                for (ArrayList arrayList5 : this.G.values()) {
                    if (arrayList5 != null) {
                        int size5 = arrayList5.size();
                        int i14 = 0;
                        while (i14 < size5) {
                            Object obj5 = arrayList5.get(i14);
                            i14++;
                            n10 n10Var = (n10) obj5;
                            i0.r(n10Var.a);
                            if (n10Var.h != -1) {
                                getConnectionsManager().cancelRequest(n10Var.h, true);
                                ArrayList arrayList6 = n10Var.b;
                                int size6 = arrayList6.size();
                                int i15 = 0;
                                while (i15 < size6) {
                                    Object obj6 = arrayList6.get(i15);
                                    i15++;
                                    this.x.remove((Integer) obj6);
                                }
                            }
                        }
                    }
                }
                for (ArrayList arrayList7 : this.H.values()) {
                    if (arrayList7 != null) {
                        int size7 = arrayList7.size();
                        int i16 = 0;
                        while (i16 < size7) {
                            Object obj7 = arrayList7.get(i16);
                            i16++;
                            o10 o10Var = (o10) obj7;
                            i0.r(o10Var.a);
                            if (o10Var.f != -1) {
                                getConnectionsManager().cancelRequest(o10Var.f, true);
                                ArrayList arrayList8 = o10Var.b;
                                int size8 = arrayList8.size();
                                int i17 = 0;
                                while (i17 < size8) {
                                    Object obj8 = arrayList8.get(i17);
                                    i17++;
                                    this.x.remove((Integer) obj8);
                                }
                            }
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        vp.r1(this.currentAccount).f7.edit().remove("translating_dialog_languages2").remove("hidden_translation_at").apply();
        this.a.clear();
        this.b.clear();
        this.c.clear();
        this.d.clear();
        this.e.clear();
        this.f.clear();
        this.h.clear();
        this.x.clear();
        this.y.clear();
    }

    public final void k(jj jjVar, bi.i6 i6Var) {
        TLRPC.Message message = jjVar.k;
        if (message == null || TextUtils.isEmpty(message.message)) {
            return;
        }
        if (!TextUtils.isEmpty(jjVar.k.originalLanguage)) {
            i6Var.a(jjVar.k.originalLanguage);
            return;
        }
        c3.s sVar = new c3.s(jjVar);
        HashSet hashSet = this.K;
        if (hashSet.contains(sVar)) {
            return;
        }
        hashSet.add(sVar);
        js.d(jjVar.k.message, new y00(this, jjVar, sVar, i6Var), new y00(this, jjVar, sVar, i6Var), false);
    }

    public final void l(TL_stories.StoryItem storyItem) {
        String str;
        if (storyItem == null || storyItem.detectedLng != null || (str = storyItem.caption) == null || str.length() == 0) {
            return;
        }
        r10 r10Var = new r10();
        HashSet hashSet = this.I;
        if (hashSet.contains(r10Var)) {
            return;
        }
        hashSet.add(r10Var);
        js.d(storyItem.caption, new g10(this, storyItem, r10Var), new g10(this, storyItem, r10Var), false);
    }

    public final String m(long j10) {
        String str = (String) this.d.get(Long.valueOf(j10));
        if (str == null && ((str = m31.M0()) == null || str.equals((String) this.e.get(Long.valueOf(j10))))) {
            str = j();
        }
        return "nb".equals(str) ? "no" : str;
    }

    public final void p(jj jjVar) {
        TLRPC.Message message = jjVar.k;
        if (message == null) {
            return;
        }
        long B0 = jj.B0(message);
        if (v(B0)) {
            TLRPC.Message message2 = jjVar.k;
            message2.translatedToLanguage = null;
            message2.translatedText = null;
            message2.translatedVoiceTranscription = null;
            message2.translatedPoll = null;
            message2.summaryText = null;
            message2.translatedSummaryText = null;
            message2.translatedSummaryLanguage = null;
            getMessagesStorage().X1(B0, jjVar.k);
            i0.g3(new d4(this, jjVar, B0, 8));
        }
    }

    public final boolean q(long j10) {
        TLRPC.Chat L0;
        return t(j10) && (L0 = getMessagesController().L0(Long.valueOf(-j10))) != null && L0.autotranslation;
    }

    public final boolean r() {
        if (!getMessagesController().F2()) {
            return false;
        }
        if (this.r == null) {
            this.r = Boolean.valueOf(this.n.f7.getBoolean("translate_chat_button", true));
        }
        return this.r.booleanValue();
    }

    public final boolean s() {
        if (!getMessagesController().G2()) {
            return false;
        }
        if (this.s == null) {
            this.s = Boolean.valueOf(this.n.f7.getBoolean("translate_button", vp.d1().getBoolean("translate_button", false)));
        }
        return this.s.booleanValue();
    }

    public final boolean t(long j10) {
        return this.b.contains(Long.valueOf(j10)) && v(j10) && !o5.C(j10) && getUserConfig().e() != j10;
    }

    public final boolean u() {
        return r() && d20.i(this.currentAccount).q();
    }

    public final boolean v(long j10) {
        if (!r()) {
            return false;
        }
        TLRPC.Chat L0 = getMessagesController().L0(Long.valueOf(-j10));
        if (d20.i(this.currentAccount).q()) {
            return true;
        }
        return L0 != null && L0.autotranslation;
    }

    public final boolean w(String str) {
        if (getUserConfig().q()) {
            return e01.c0().contains(str);
        }
        try {
            return TextUtils.equals(cd.D0().B.f, str);
        } catch (Exception unused) {
            return false;
        }
    }

    public final boolean z(long j10) {
        if (this.h.contains(Long.valueOf(j10))) {
            return true;
        }
        TLRPC.ChatFull M0 = getMessagesController().M0(-j10);
        if (M0 != null) {
            return M0.translations_disabled;
        }
        TLRPC.UserFull a2 = getMessagesController().a2(j10);
        if (a2 != null) {
            return a2.translations_disabled;
        }
        return false;
    }
}
