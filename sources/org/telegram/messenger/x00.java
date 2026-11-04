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
import org.telegram.ui.Components.f21;
import org.telegram.ui.gy0;
import org.telegram.ui.qn0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class x00 extends c1 {
    public static final List N = Arrays.asList("en", "ar", "zh", "fr", "de", "it", "ja", "ko", "pt", "ru", "es", "uk");
    public static final List O = Arrays.asList("af", "sq", "am", "ar", "hy", "az", "eu", "be", "bn", "bs", "bg", "ca", "ceb", "zh-cn", "zh", "zh-tw", "co", "hr", "cs", "da", "nl", "en", "eo", "et", "fi", "fr", "fy", "gl", "ka", "de", "el", "gu", "ht", "ha", "haw", "he", "hi", "hmn", "hu", "is", "ig", "id", "ga", "it", "ja", "jv", "kn", "kk", "km", "rw", "ko", "ku", "ky", "lo", "la", "lv", "lt", "lb", "mk", "mg", "ms", "ml", "mt", "mi", "mr", "mn", "my", "ne", "no", "ny", "or", "ps", "fa", "pl", "pt", "pt-br", "pa", "ro", "ru", "sm", "gd", "sr", "st", "sn", "sd", "si", "sk", "sl", "so", "es", "su", "sw", "sv", "tl", "tg", "ta", "tt", "te", "th", "tr", "tk", "uk", "ur", "ug", "uz", "vi", "cy", "xh", "yi", "yo", "zu");
    public static LinkedHashSet P = null;
    public final HashMap E;
    public final HashMap F;
    public final HashSet G;
    public final HashMap H;
    public final HashMap I;
    public final HashSet J;
    public final HashSet K;
    public final HashSet L;
    public final HashSet M;
    public final LongSparseArray a;
    public final HashSet b;
    public final HashMap c;
    public final HashMap d;
    public final HashMap e;
    public final HashMap f;
    public final HashSet h;
    public final hp n;
    public Boolean r;
    public Boolean s;
    public final ArrayList w;
    public final HashSet x;
    public final HashSet y;

    public x00(hp hpVar) {
        super(hpVar.currentAccount);
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
        this.E = new HashMap();
        this.F = new HashMap();
        this.G = new HashSet();
        this.H = new HashMap();
        this.I = new HashMap();
        this.J = new HashSet();
        this.K = new HashSet();
        this.L = new HashSet();
        this.M = new HashSet();
        this.n = hpVar;
        g0.i3(new vs(this, 17), 150L);
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
        String str = bd.E0().B.f;
        return str != null ? str.split("_")[0] : str;
    }

    public static ArrayList n() {
        ArrayList arrayList = new ArrayList();
        int i3 = 0;
        while (true) {
            List list = O;
            if (i3 >= list.size()) {
                break;
            }
            q00 q00Var = new q00();
            String str = (String) list.get(i3);
            q00Var.a = str;
            if ("no".equals(str)) {
                q00Var.a = "nb";
            }
            q00Var.b = f21.K0(f21.O0(q00Var.a, null, null));
            q00Var.c = f21.K0(f21.V0(q00Var.a, true));
            if (q00Var.b != null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(q00Var.b);
                sb2.append(" ");
                String str2 = q00Var.c;
                if (str2 == null) {
                    str2 = "";
                }
                sb2.append(str2);
                q00Var.d = sb2.toString().toLowerCase();
                arrayList.add(q00Var);
            }
            i3++;
        }
        if (Build.VERSION.SDK_INT >= 24) {
            Collections.sort(arrayList, new f00(Collator.getInstance(Locale.getDefault()), 0));
            return arrayList;
        }
        Collections.sort(arrayList, Comparator$-CC.comparing(new fa.b(6)));
        return arrayList;
    }

    public static ArrayList o(String str) {
        ArrayList arrayList = new ArrayList();
        if (P == null) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            try {
                linkedHashSet.add(bd.E0().B.f);
            } catch (Exception e10) {
                a8.g(e10, true);
            }
            try {
                linkedHashSet.add(Resources.getSystem().getConfiguration().locale.getLanguage());
            } catch (Exception e11) {
                a8.g(e11, true);
            }
            try {
                linkedHashSet.addAll(gy0.d0());
            } catch (Exception e12) {
                a8.g(e12, true);
            }
            try {
                InputMethodManager inputMethodManager = (InputMethodManager) t0.b.getSystemService("input_method");
                Iterator<InputMethodInfo> it = inputMethodManager.getEnabledInputMethodList().iterator();
                while (it.hasNext()) {
                    for (InputMethodSubtype inputMethodSubtype : inputMethodManager.getEnabledInputMethodSubtypeList(it.next(), true)) {
                        if ("keyboard".equals(inputMethodSubtype.getMode())) {
                            String locale = inputMethodSubtype.getLocale();
                            if (locale != null && locale.contains("_")) {
                                locale = locale.split("_")[0];
                            }
                            if (f21.O0(locale, null, null) != null) {
                                linkedHashSet.add(locale);
                            }
                        }
                    }
                }
            } catch (Exception e13) {
                a8.g(e13, true);
            }
            P = linkedHashSet;
        }
        Iterator it2 = P.iterator();
        while (it2.hasNext()) {
            String str2 = (String) it2.next();
            if (!TextUtils.equals(str2, str) && (!"no".equals(str) || !"nb".equals(str2))) {
                if (!"nb".equals(str) || !"no".equals(str2)) {
                    q00 q00Var = new q00();
                    q00Var.a = str2;
                    if ("no".equals(str2)) {
                        q00Var.a = "nb";
                    }
                    q00Var.b = f21.K0(f21.O0(q00Var.a, null, null));
                    q00Var.c = f21.K0(f21.V0(q00Var.a, true));
                    if (q00Var.b != null) {
                        q00Var.d = (q00Var.b + " " + q00Var.c).toLowerCase();
                        arrayList.add(q00Var);
                    }
                }
            }
        }
        return arrayList;
    }

    public static boolean x(zi ziVar) {
        TLRPC.Message message;
        if (ziVar == null || (message = ziVar.k) == null || message.summary_from_language == null || ziVar.Q3() || ziVar.E0 || ziVar.s4()) {
            return false;
        }
        int i3 = ziVar.D;
        return (i3 == 0 || i3 == 3 || i3 == 1 || i3 == 9 || i3 == 14 || i3 == 17) && !TextUtils.isEmpty(ziVar.k.message) && ziVar.k.message.length() > 100;
    }

    public static boolean y(zi ziVar) {
        if (ziVar == null || ziVar.k == null || ziVar.Q3() || ziVar.E0 || ziVar.s4() || (zi.n1(ziVar) instanceof TLRPC.TL_messageMediaWidget)) {
            return false;
        }
        int i3 = ziVar.D;
        if (i3 != 0 && i3 != 3 && i3 != 1 && i3 != 2 && i3 != 5 && i3 != 9 && i3 != 14 && i3 != 17 && i3 != 36) {
            return false;
        }
        if (TextUtils.isEmpty(ziVar.k.message) && !(zi.n1(ziVar) instanceof TLRPC.TL_messageMediaPoll)) {
            TLRPC.Message message = ziVar.k;
            if (message.rich_message == null && (!message.voiceTranscriptionOpen || TextUtils.isEmpty(message.voiceTranscription) || !ziVar.k.voiceTranscriptionFinal)) {
                return false;
            }
        }
        return true;
    }

    public final boolean A(zi ziVar) {
        TLRPC.Message message;
        boolean z10 = true;
        if (ziVar != null && (message = ziVar.k) != null && message.summarizedOpen) {
            return this.G.contains(Integer.valueOf(Objects.hash(Long.valueOf(zi.B0(message)), Integer.valueOf(ziVar.f1()), Integer.valueOf(B(zi.B0(ziVar.k)) ? 1 : 0))));
        }
        synchronized (this) {
            if (ziVar != null) {
                try {
                    TLRPC.Message message2 = ziVar.k;
                    if (message2 != null) {
                        if (((message2.voiceTranscriptionOpen && message2.voiceTranscriptionFinal) ? this.y : this.x).contains(Integer.valueOf(ziVar.f1())) && B(zi.B0(ziVar.k))) {
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

    public final void C(zi ziVar) {
        Long valueOf = Long.valueOf(zi.B0(ziVar.k));
        HashMap hashMap = this.f;
        HashMap hashMap2 = (HashMap) hashMap.get(valueOf);
        if (hashMap2 == null) {
            Long valueOf2 = Long.valueOf(zi.B0(ziVar.k));
            HashMap hashMap3 = new HashMap();
            hashMap.put(valueOf2, hashMap3);
            hashMap2 = hashMap3;
        }
        hashMap2.put(Integer.valueOf(ziVar.f1()), ziVar);
    }

    public final void E(zi ziVar, String str, n00 n00Var) {
        Throwable th2;
        r00 r00Var;
        if (ziVar.f1() >= 0) {
            long B0 = zi.B0(ziVar.k);
            synchronized (this) {
                try {
                    try {
                        ArrayList arrayList = (ArrayList) this.H.get(Long.valueOf(B0));
                        if (arrayList == null) {
                            try {
                                HashMap hashMap = this.H;
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
                            r00Var = new r00();
                            arrayList.add(r00Var);
                        } else {
                            r00Var = (r00) arrayList.get(arrayList.size() - 1);
                        }
                        if (r00Var.b.contains(Integer.valueOf(ziVar.f1()))) {
                            return;
                        }
                        TLRPC.MessageMedia n12 = zi.n1(ziVar);
                        if (n12 instanceof TLRPC.TL_messageMediaPoll) {
                            u00 a10 = u00.a((TLRPC.TL_messageMediaPoll) n12);
                            u00 u00Var = ziVar.k.translatedPoll;
                            TLRPC.TL_textWithEntities tL_textWithEntities = a10.a;
                            int length = tL_textWithEntities != null ? tL_textWithEntities.text.length() : 0;
                            for (int i3 = 0; i3 < a10.b.size(); i3++) {
                                length += ((TLRPC.PollAnswer) a10.b.get(i3)).text.text.length();
                            }
                            TLRPC.TL_textWithEntities tL_textWithEntities2 = a10.c;
                            if (tL_textWithEntities2 != null) {
                                length += tL_textWithEntities2.text.length();
                            }
                            if (r00Var.g + length >= 25000 || r00Var.b.size() + 1 >= 20) {
                                g0.r(r00Var.a);
                                g0.h3(r00Var.a);
                                r00Var = new r00();
                                arrayList.add(r00Var);
                            }
                            zq zqVar = r00Var.a;
                            if (zqVar != null) {
                                g0.r(zqVar);
                            }
                            this.x.add(Integer.valueOf(ziVar.f1()));
                            r00Var.b.add(Integer.valueOf(ziVar.f1()));
                            a8.b("pending translation +" + ziVar.f1() + " poll message");
                            r00Var.c.add(new Pair(a10, u00Var));
                            r00Var.d.add(n00Var);
                            r00Var.e = str;
                            r00Var.g = r00Var.g + length;
                            r00 r00Var2 = r00Var;
                            zq zqVar2 = new zq(this, B0, r00Var2, 8);
                            r00Var2.a = zqVar2;
                            g0.i3(zqVar2, r00Var2.f);
                            r00Var2.f /= 2;
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

    public final void F(zi ziVar, String str, u10 u10Var) {
        int i3 = 1;
        int hash = Objects.hash(Long.valueOf(zi.B0(ziVar.k)), Integer.valueOf(ziVar.f1()), Integer.valueOf(str != null ? 1 : 0));
        Integer valueOf = Integer.valueOf(hash);
        HashSet hashSet = this.G;
        if (hashSet.contains(valueOf)) {
            return;
        }
        hashSet.add(Integer.valueOf(hash));
        TLRPC.TL_messages_summarizeText tL_messages_summarizeText = new TLRPC.TL_messages_summarizeText();
        tL_messages_summarizeText.peer = hp.s1(this.currentAccount).j1(zi.B0(ziVar.k));
        tL_messages_summarizeText.id = ziVar.f1();
        if (str != null) {
            tL_messages_summarizeText.flags |= 1;
            tL_messages_summarizeText.to_lang = D(str);
        }
        ConnectionsManager.getInstance(this.currentAccount).sendRequestTyped(tL_messages_summarizeText, new c3.b(i3), new zs(this, hash, u10Var));
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x00f6 A[Catch: all -> 0x006f, TryCatch #0 {all -> 0x006f, blocks: (B:25:0x0055, B:27:0x0061, B:28:0x0072, B:30:0x0078, B:31:0x008c, B:33:0x009c, B:37:0x00a0, B:40:0x00ca, B:42:0x00d1, B:46:0x00f2, B:48:0x00f6, B:49:0x00f9, B:50:0x0152, B:52:0x00df, B:53:0x00a7, B:54:0x00ac, B:56:0x00b0, B:58:0x00b4, B:59:0x00b9, B:61:0x00bd, B:62:0x00c2, B:64:0x00c6, B:65:0x0081), top: B:24:0x0055 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void G(zi ziVar, String str, p00 p00Var) {
        t00 t00Var;
        String str2;
        z3 z3Var;
        if (ziVar.k == null || ziVar.f1() < 0) {
            return;
        }
        TLRPC.Message message = ziVar.k;
        int i3 = 0;
        boolean z10 = message.voiceTranscription != null && message.voiceTranscriptionFinal && message.voiceTranscriptionOpen;
        long B0 = zi.B0(message);
        HashMap hashMap = z10 ? this.F : this.E;
        HashSet hashSet = z10 ? this.y : this.x;
        TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
        if (z10) {
            String str3 = ziVar.k.voiceTranscription;
            tL_textWithEntities.text = str3;
            if (TextUtils.isEmpty(str3)) {
                return;
            }
        } else {
            TLRPC.Message message2 = ziVar.k;
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
                    t00Var = new t00();
                    arrayList.add(t00Var);
                } else {
                    t00Var = (t00) arrayList.get(arrayList.size() - 1);
                }
                if (t00Var.b.contains(Integer.valueOf(ziVar.f1()))) {
                    return;
                }
                if (z10) {
                    String str4 = ziVar.k.voiceTranscription;
                    if (str4 != null) {
                        i3 = str4.length();
                    }
                } else {
                    TLRPC.Message message3 = ziVar.k;
                    if (message3 == null || (str2 = message3.message) == null) {
                        CharSequence charSequence = ziVar.z;
                        if (charSequence != null) {
                            i3 = charSequence.length();
                        } else {
                            CharSequence charSequence2 = ziVar.v;
                            if (charSequence2 != null) {
                                i3 = charSequence2.length();
                            }
                        }
                    } else {
                        i3 = str2.length();
                    }
                }
                if (t00Var.g + i3 < 25000) {
                    if (t00Var.b.size() + 1 >= 20) {
                    }
                    t00 t00Var2 = t00Var;
                    z3Var = t00Var2.a;
                    if (z3Var != null) {
                        g0.r(z3Var);
                    }
                    hashSet.add(Integer.valueOf(ziVar.f1()));
                    t00Var2.b.add(Integer.valueOf(ziVar.f1()));
                    a8.b("pending translation +" + ziVar.f1() + " message");
                    t00Var2.c.add(tL_textWithEntities);
                    t00Var2.d.add(p00Var);
                    t00Var2.e = str;
                    t00Var2.g += i3;
                    z3 z3Var2 = new z3(this, hashMap, B0, t00Var2, z10, hashSet);
                    t00Var2.a = z3Var2;
                    g0.i3(z3Var2, t00Var2.f);
                    t00Var2.f /= 2;
                }
                g0.r(t00Var.a);
                g0.h3(t00Var.a);
                t00Var = new t00();
                arrayList.add(t00Var);
                t00 t00Var22 = t00Var;
                z3Var = t00Var22.a;
                if (z3Var != null) {
                }
                hashSet.add(Integer.valueOf(ziVar.f1()));
                t00Var22.b.add(Integer.valueOf(ziVar.f1()));
                a8.b("pending translation +" + ziVar.f1() + " message");
                t00Var22.c.add(tL_textWithEntities);
                t00Var22.d.add(p00Var);
                t00Var22.e = str;
                t00Var22.g += i3;
                z3 z3Var22 = new z3(this, hashMap, B0, t00Var22, z10, hashSet);
                t00Var22.a = z3Var22;
                g0.i3(z3Var22, t00Var22.f);
                t00Var22.f /= 2;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void H() {
        StringBuilder sb2 = new StringBuilder();
        boolean z10 = true;
        int i3 = 0;
        while (true) {
            LongSparseArray longSparseArray = this.a;
            if (i3 >= longSparseArray.size()) {
                break;
            }
            try {
                long keyAt = longSparseArray.keyAt(i3);
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
                if (!((Boolean) longSparseArray.valueAt(i3)).booleanValue()) {
                    sb2.append("!");
                }
            } catch (Exception unused) {
            }
            i3++;
        }
        HashSet hashSet = new HashSet();
        Iterator it = this.h.iterator();
        while (it.hasNext()) {
            try {
                hashSet.add("" + it.next());
            } catch (Exception e10) {
                a8.g(e10, true);
            }
        }
        hp.s1(this.currentAccount).e7.edit().putString("translating_dialog_languages2", sb2.toString()).putStringSet("hidden_translation_at", hashSet).apply();
    }

    public final void I(long j10, String str) {
        x00 x00Var;
        long j11;
        String str2;
        Boolean bool;
        if (TextUtils.equals(m(j10), str)) {
            return;
        }
        if (B(j10)) {
            x00Var = this;
            j11 = j10;
            str2 = str;
            g0.i3(new a4(x00Var, j11, str2, 9), 150L);
        } else {
            x00Var = this;
            j11 = j10;
            str2 = str;
            synchronized (this) {
                x00Var.d.put(Long.valueOf(j11), str2);
            }
        }
        c(j11);
        synchronized (this) {
            LongSparseArray longSparseArray = x00Var.a;
            bool = Boolean.FALSE;
            longSparseArray.put(j11, bool);
        }
        hs.f(x00Var.currentAccount).k(hs.P1, Long.valueOf(j11), bool);
        f21.S0(str2);
    }

    public final void J(long j10, boolean z10, boolean z11) {
        TLRPC.TL_messages_togglePeerTranslations tL_messages_togglePeerTranslations = new TLRPC.TL_messages_togglePeerTranslations();
        tL_messages_togglePeerTranslations.peer = getMessagesController().j1(j10);
        tL_messages_togglePeerTranslations.disabled = z10;
        getConnectionsManager().sendRequest(tL_messages_togglePeerTranslations, null);
        TLRPC.ChatFull N0 = getMessagesController().N0(-j10);
        if (N0 != null) {
            N0.translations_disabled = z10;
            getMessagesStorage().N1(N0, true);
        }
        TLRPC.UserFull b22 = getMessagesController().b2(j10);
        if (b22 != null) {
            b22.translations_disabled = z10;
            getMessagesStorage().j2(b22, true);
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
        hs.f(this.currentAccount).k(hs.P1, Long.valueOf(j10), Boolean.valueOf(B(j10)));
    }

    public final boolean K(long j10, boolean z10) {
        boolean B = B(j10);
        int i3 = hs.P1;
        boolean z11 = true;
        LongSparseArray longSparseArray = this.a;
        if (z10 && !B) {
            Boolean bool = Boolean.TRUE;
            longSparseArray.put(j10, bool);
            hs.f(this.currentAccount).k(i3, Long.valueOf(j10), bool);
        } else if (z10 || !B) {
            z11 = false;
        } else {
            Boolean bool2 = Boolean.FALSE;
            longSparseArray.put(j10, bool2);
            hs.f(this.currentAccount).k(i3, Long.valueOf(j10), bool2);
            c(j10);
        }
        H();
        return z11;
    }

    public final void L(zi ziVar, qn0 qn0Var) {
        if (ziVar == null || ziVar.k == null) {
            return;
        }
        e3.s sVar = new e3.s(ziVar);
        String M0 = f21.M0();
        TLRPC.Message message = ziVar.k;
        if (message.translatedText != null && TextUtils.equals(message.translatedToLanguage, M0)) {
            qn0Var.run();
            return;
        }
        HashSet hashSet = this.M;
        if (hashSet.contains(sVar)) {
            qn0Var.run();
            return;
        }
        hashSet.add(sVar);
        TLRPC.TL_messages_translateText tL_messages_translateText = new TLRPC.TL_messages_translateText();
        tL_messages_translateText.flags |= 2;
        TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
        TLRPC.Message message2 = ziVar.k;
        tL_textWithEntities.text = message2.message;
        ArrayList<TLRPC.MessageEntity> arrayList = message2.entities;
        tL_textWithEntities.entities = arrayList;
        if (arrayList == null) {
            tL_textWithEntities.entities = new ArrayList<>();
        }
        tL_messages_translateText.text.add(tL_textWithEntities);
        tL_messages_translateText.to_lang = D(M0);
        getConnectionsManager().sendRequest(tL_messages_translateText, new cm(this, ziVar, M0, sVar, qn0Var, System.currentTimeMillis(), tL_textWithEntities));
    }

    public final void M(long j10) {
        boolean z10;
        if (v(j10) && t(j10)) {
            boolean contains = this.h.contains(Long.valueOf(j10));
            TLRPC.ChatFull N0 = getMessagesController().N0(-j10);
            if (N0 != null) {
                z10 = N0.translations_disabled;
            } else {
                TLRPC.UserFull b22 = getMessagesController().b2(j10);
                z10 = b22 != null ? b22.translations_disabled : false;
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
                hs.f(this.currentAccount).k(hs.P1, Long.valueOf(j10), Boolean.valueOf(B(j10)));
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0025, code lost:
    
        if (android.text.TextUtils.equals(r0.translatedToLanguage, org.telegram.ui.Components.f21.M0()) != false) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean b(zi ziVar, String str) {
        String str2;
        TLRPC.Message message = ziVar.k;
        if (message != null && (str2 = message.originalLanguage) != null) {
            str = str2;
        }
        if (message == null || TextUtils.isEmpty(message.message)) {
            return false;
        }
        if (str == null) {
            TLRPC.Message message2 = ziVar.k;
            if (message2.translatedText != null) {
            }
        }
        if (str == null || w(ziVar.k.originalLanguage)) {
            return false;
        }
        return !ziVar.J2;
    }

    public final void c(long j10) {
        synchronized (this) {
            try {
                ArrayList arrayList = (ArrayList) this.E.get(Long.valueOf(j10));
                if (arrayList != null) {
                    int size = arrayList.size();
                    int i3 = 0;
                    while (i3 < size) {
                        Object obj = arrayList.get(i3);
                        i3++;
                        t00 t00Var = (t00) obj;
                        g0.r(t00Var.a);
                        if (t00Var.h != -1) {
                            getConnectionsManager().cancelRequest(t00Var.h, true);
                            ArrayList arrayList2 = t00Var.b;
                            int size2 = arrayList2.size();
                            int i10 = 0;
                            while (i10 < size2) {
                                Object obj2 = arrayList2.get(i10);
                                i10++;
                                this.x.remove((Integer) obj2);
                            }
                        }
                    }
                    this.E.remove(Long.valueOf(j10));
                }
                ArrayList arrayList3 = (ArrayList) this.F.get(Long.valueOf(j10));
                if (arrayList3 != null) {
                    int size3 = arrayList3.size();
                    int i11 = 0;
                    while (i11 < size3) {
                        Object obj3 = arrayList3.get(i11);
                        i11++;
                        t00 t00Var2 = (t00) obj3;
                        g0.r(t00Var2.a);
                        if (t00Var2.h != -1) {
                            getConnectionsManager().cancelRequest(t00Var2.h, true);
                            ArrayList arrayList4 = t00Var2.b;
                            int size4 = arrayList4.size();
                            int i12 = 0;
                            while (i12 < size4) {
                                Object obj4 = arrayList4.get(i12);
                                i12++;
                                this.y.remove((Integer) obj4);
                            }
                        }
                    }
                    this.F.remove(Long.valueOf(j10));
                }
                ArrayList arrayList5 = (ArrayList) this.H.get(Long.valueOf(j10));
                if (arrayList5 != null) {
                    int size5 = arrayList5.size();
                    int i13 = 0;
                    while (i13 < size5) {
                        Object obj5 = arrayList5.get(i13);
                        i13++;
                        r00 r00Var = (r00) obj5;
                        g0.r(r00Var.a);
                        if (r00Var.h != -1) {
                            getConnectionsManager().cancelRequest(r00Var.h, true);
                            ArrayList arrayList6 = r00Var.b;
                            int size6 = arrayList6.size();
                            int i14 = 0;
                            while (i14 < size6) {
                                Object obj6 = arrayList6.get(i14);
                                i14++;
                                this.x.remove((Integer) obj6);
                            }
                        }
                    }
                    this.H.remove(Long.valueOf(j10));
                }
                ArrayList arrayList7 = (ArrayList) this.I.get(Long.valueOf(j10));
                if (arrayList7 != null) {
                    int size7 = arrayList7.size();
                    int i15 = 0;
                    while (i15 < size7) {
                        Object obj7 = arrayList7.get(i15);
                        i15++;
                        s00 s00Var = (s00) obj7;
                        g0.r(s00Var.a);
                        if (s00Var.f != -1) {
                            getConnectionsManager().cancelRequest(s00Var.f, true);
                            ArrayList arrayList8 = s00Var.b;
                            int size8 = arrayList8.size();
                            int i16 = 0;
                            while (i16 < size8) {
                                Object obj8 = arrayList8.get(i16);
                                i16++;
                                this.x.remove((Integer) obj8);
                            }
                        }
                    }
                    this.I.remove(Long.valueOf(j10));
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
            getMessagesStorage().a.c(new g00(this, j10, 1));
        }
    }

    public final void f(zi ziVar) {
        TLRPC.Message message;
        String str;
        String str2;
        if (ziVar == null || (message = ziVar.k) == null) {
            return;
        }
        long B0 = zi.B0(message);
        Long valueOf = Long.valueOf(B0);
        HashMap hashMap = this.c;
        w00 w00Var = (w00) hashMap.get(valueOf);
        if (w00Var == null) {
            Long valueOf2 = Long.valueOf(B0);
            w00 w00Var2 = new w00();
            w00Var2.a = new HashSet();
            w00Var2.b = new HashSet();
            w00Var2.c = new HashSet();
            hashMap.put(valueOf2, w00Var2);
            w00Var = w00Var2;
        }
        HashSet hashSet = w00Var.c;
        HashSet hashSet2 = w00Var.a;
        HashSet hashSet3 = w00Var.b;
        boolean z10 = false;
        boolean z11 = y(ziVar) && ((str2 = ziVar.k.originalLanguage) == null || "und".equals(str2));
        if (y(ziVar) && (str = ziVar.k.originalLanguage) != null && !"und".equals(str) && !w(ziVar.k.originalLanguage)) {
            z10 = true;
        }
        if (z11) {
            hashSet3.add(Integer.valueOf(ziVar.f1()));
        } else {
            (z10 ? hashSet2 : hashSet).add(Integer.valueOf(ziVar.f1()));
        }
        if (!z11) {
            this.e.put(Long.valueOf(B0), ziVar.k.originalLanguage);
        }
        int size = hashSet2.size();
        int size2 = hashSet3.size();
        int size3 = size + size2 + hashSet.size();
        boolean q10 = q(B0);
        if (size3 >= (q10 ? 2 : 6)) {
            if (q10) {
                if (size < 2.0f) {
                    return;
                }
            } else if (size / (size + r4) < 0.6f) {
                return;
            }
            if (size2 / size3 < (q10 ? 0.8f : 0.65f)) {
                this.b.add(Long.valueOf(B0));
                hashMap.remove(Long.valueOf(B0));
                g0.i3(new g00(this, B0, 0), 450L);
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
                    Long l10 = (Long) it.next();
                    long longValue = l10.longValue();
                    String str = (String) this.e.get(l10);
                    if (str != null && w(str)) {
                        c(longValue);
                        this.a.remove(longValue);
                        arrayList.add(l10);
                    }
                }
                this.b.clear();
                H();
                int size = arrayList.size();
                int i3 = 0;
                while (i3 < size) {
                    Object obj = arrayList.get(i3);
                    i3++;
                    Long l11 = (Long) obj;
                    l11.getClass();
                    hs.f(this.currentAccount).k(hs.P1, l11, Boolean.FALSE);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [org.telegram.messenger.p00] */
    /* JADX WARN: Type inference failed for: r0v14, types: [org.telegram.messenger.n00] */
    public final void h(zi ziVar, boolean z10, final boolean z11) {
        TLRPC.Message message;
        final zi ziVar2;
        u00 u00Var;
        s00 s00Var;
        u00 u00Var2;
        zi ziVar3;
        if (ziVar == null || (message = ziVar.k) == null) {
            return;
        }
        final long B0 = zi.B0(message);
        r2 = null;
        r2 = null;
        String str = null;
        if (z10) {
            TLRPC.Message message2 = ziVar.k;
            if (message2.summarizedOpen && message2.summaryText == null && !B(zi.B0(message2))) {
                F(ziVar, null, new l00(this, ziVar, B0));
            }
        }
        if (v(B0)) {
            if (!z11 && (ziVar3 = ziVar.C) != null) {
                h(ziVar3, z10, true);
            }
            if (y(ziVar)) {
                if (!B(B0)) {
                    TLRPC.Message message3 = ziVar.k;
                    if (message3 != null) {
                        if (!TextUtils.isEmpty(message3.message)) {
                            str = ziVar.k.message;
                        } else if (ziVar.D == 36 && !TextUtils.isEmpty(ziVar.v)) {
                            str = ziVar.v.toString();
                        }
                    }
                    if (!y(ziVar) || ziVar.k == null || TextUtils.isEmpty(str)) {
                        return;
                    }
                    TLRPC.Message message4 = ziVar.k;
                    if (message4.originalLanguage != null) {
                        f(ziVar);
                        return;
                    }
                    long B02 = zi.B0(message4);
                    int hash = Objects.hash(Long.valueOf(zi.B0(ziVar.k)), Integer.valueOf(ziVar.f1()));
                    if (t(B02) || this.w.contains(Integer.valueOf(hash))) {
                        return;
                    }
                    this.w.add(Integer.valueOf(hash));
                    Utilities.d.c(new e00(this, str, ziVar, B02, hash, 0));
                    return;
                }
                if (z(B0)) {
                    return;
                }
                String m10 = m(B0);
                if (!z11 && ziVar.D != 36) {
                    TLRPC.Message message5 = ziVar.k;
                    if ((((message5.voiceTranscriptionOpen && message5.voiceTranscriptionFinal) ? message5.translatedVoiceTranscription : message5.translatedText) == null && message5.translatedPoll == null) || (((u00Var2 = message5.translatedPoll) != null && !u00.b(ziVar, u00Var2)) || !m10.equals(ziVar.k.translatedToLanguage))) {
                        int f12 = ziVar.f1();
                        HashMap hashMap = (HashMap) this.f.get(Long.valueOf(B0));
                        ziVar2 = hashMap != null ? (zi) hashMap.get(Integer.valueOf(f12)) : null;
                        if (ziVar2 != null) {
                            TLRPC.Message message6 = ziVar.k;
                            TLRPC.Message message7 = ziVar2.k;
                            message6.translatedToLanguage = message7.translatedToLanguage;
                            message6.translatedText = message7.translatedText;
                            message6.translatedPoll = message7.translatedPoll;
                            if (z10 || !B(B0)) {
                            }
                            if (ziVar2.D != 36) {
                                TLRPC.Message message8 = ziVar2.k;
                                if (message8.summarizedOpen) {
                                    if (message8.translatedSummaryText == null || !m10.equals(message8.translatedSummaryLanguage)) {
                                        F(ziVar2, m10, new o00(this, ziVar2, m10, B0));
                                        return;
                                    }
                                    return;
                                }
                                if (!(((message8.voiceTranscriptionOpen && message8.voiceTranscriptionFinal) ? message8.translatedVoiceTranscription : message8.translatedText) == null && message8.translatedPoll == null) && (((u00Var = message8.translatedPoll) == null || u00.b(ziVar2, u00Var)) && m10.equals(ziVar2.k.translatedToLanguage))) {
                                    if (z11) {
                                        C(ziVar2);
                                        return;
                                    }
                                    return;
                                } else {
                                    hs.f(this.currentAccount).k(hs.N1, ziVar2);
                                    if (!(zi.n1(ziVar2) instanceof TLRPC.TL_messageMediaPoll)) {
                                        G(ziVar2, m10, new r10() { // from class: org.telegram.messenger.p00
                                            @Override // org.telegram.messenger.r10
                                            public final void a(Object obj, Object obj2, Object obj3, Object obj4) {
                                                Boolean bool = (Boolean) obj;
                                                Integer num = (Integer) obj2;
                                                TLRPC.TL_textWithEntities tL_textWithEntities = (TLRPC.TL_textWithEntities) obj3;
                                                String str2 = (String) obj4;
                                                zi ziVar4 = ziVar2;
                                                if (ziVar4.f1() != num.intValue()) {
                                                    a8.d("wtf, asked to translate " + ziVar4.f1() + " but got " + num + "!");
                                                }
                                                ziVar4.k.translatedToLanguage = str2;
                                                if (bool.booleanValue()) {
                                                    ziVar4.k.translatedVoiceTranscription = tL_textWithEntities;
                                                } else {
                                                    ziVar4.k.translatedText = tL_textWithEntities;
                                                }
                                                ziVar4.k.translatedPoll = null;
                                                x00 x00Var = x00.this;
                                                if (z11) {
                                                    x00Var.C(ziVar4);
                                                }
                                                qr messagesStorage = x00Var.getMessagesStorage();
                                                TLRPC.Message message9 = ziVar4.k;
                                                long j10 = B0;
                                                messagesStorage.X1(j10, message9);
                                                hs.f(x00Var.currentAccount).k(hs.M1, ziVar4);
                                                ArrayList arrayList = (ArrayList) x00Var.n.S.f(j10);
                                                if (arrayList != null) {
                                                    for (int i3 = 0; i3 < arrayList.size(); i3++) {
                                                        zi ziVar5 = (zi) arrayList.get(i3);
                                                        if (ziVar5 != null && ziVar5.f1() == ziVar4.f1()) {
                                                            ziVar5.k.translatedToLanguage = str2;
                                                            if (bool.booleanValue()) {
                                                                ziVar5.k.translatedVoiceTranscription = tL_textWithEntities;
                                                            } else {
                                                                ziVar5.k.translatedText = tL_textWithEntities;
                                                            }
                                                            ziVar5.k.translatedPoll = null;
                                                            if (ziVar5.h6(false)) {
                                                                hs.f(x00Var.currentAccount).k(hs.r, 0);
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
                                        final int i3 = 1;
                                        E(ziVar2, m10, new p10(this) { // from class: org.telegram.messenger.n00
                                            public final /* synthetic */ x00 b;

                                            {
                                                this.b = this;
                                            }

                                            @Override // org.telegram.messenger.p10
                                            public final void a(Object obj, Object obj2, Object obj3) {
                                                int i10 = i3;
                                                long j10 = B0;
                                                boolean z12 = z11;
                                                zi ziVar4 = ziVar2;
                                                x00 x00Var = this.b;
                                                switch (i10) {
                                                    case 0:
                                                        Integer num = (Integer) obj;
                                                        TL_iv.RichMessage richMessage = (TL_iv.RichMessage) obj2;
                                                        String str2 = (String) obj3;
                                                        if (ziVar4.f1() != num.intValue()) {
                                                            a8.d("wtf, asked to translate " + ziVar4.f1() + " rich message but got " + num + "!");
                                                        }
                                                        TLRPC.Message message9 = ziVar4.k;
                                                        message9.translatedToLanguage = str2;
                                                        message9.translatedText = null;
                                                        message9.translatedVoiceTranscription = null;
                                                        message9.translatedPoll = null;
                                                        message9.translatedRichMessage = richMessage;
                                                        if (z12) {
                                                            x00Var.C(ziVar4);
                                                        }
                                                        x00Var.getMessagesStorage().X1(j10, ziVar4.k);
                                                        hs.f(x00Var.currentAccount).k(128, ziVar4);
                                                        ArrayList arrayList = (ArrayList) x00Var.n.S.f(j10);
                                                        if (arrayList != null) {
                                                            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                                                                zi ziVar5 = (zi) arrayList.get(i11);
                                                                if (ziVar5 != null && ziVar5.f1() == ziVar4.f1()) {
                                                                    TLRPC.Message message10 = ziVar5.k;
                                                                    message10.translatedToLanguage = str2;
                                                                    message10.translatedRichMessage = richMessage;
                                                                    if (ziVar5.h6(false)) {
                                                                        hs.f(x00Var.currentAccount).k(2, 0);
                                                                        break;
                                                                    }
                                                                }
                                                            }
                                                            break;
                                                        }
                                                        break;
                                                    default:
                                                        Integer num2 = (Integer) obj;
                                                        u00 u00Var3 = (u00) obj2;
                                                        String str3 = (String) obj3;
                                                        boolean z13 = false;
                                                        if (ziVar4.f1() != num2.intValue()) {
                                                            a8.d("wtf, asked to translate " + ziVar4.f1() + " poll but got " + num2 + "!");
                                                        }
                                                        TLRPC.Message message11 = ziVar4.k;
                                                        message11.translatedToLanguage = str3;
                                                        message11.translatedText = null;
                                                        message11.translatedVoiceTranscription = null;
                                                        message11.translatedPoll = u00Var3;
                                                        if (z12) {
                                                            x00Var.C(ziVar4);
                                                        }
                                                        x00Var.getMessagesStorage().X1(j10, ziVar4.k);
                                                        hs.f(x00Var.currentAccount).k(128, ziVar4);
                                                        ArrayList arrayList2 = (ArrayList) x00Var.n.S.f(j10);
                                                        if (arrayList2 != null) {
                                                            int i12 = 0;
                                                            while (i12 < arrayList2.size()) {
                                                                zi ziVar6 = (zi) arrayList2.get(i12);
                                                                if (ziVar6 != null && ziVar6.f1() == ziVar4.f1()) {
                                                                    TLRPC.Message message12 = ziVar6.k;
                                                                    message12.translatedToLanguage = str3;
                                                                    message12.translatedText = null;
                                                                    message12.translatedVoiceTranscription = null;
                                                                    message12.translatedPoll = u00Var3;
                                                                    boolean z14 = z13;
                                                                    if (ziVar6.h6(z14)) {
                                                                        hs f10 = hs.f(x00Var.currentAccount);
                                                                        Object[] objArr = new Object[1];
                                                                        objArr[z14 ? 1 : 0] = Integer.valueOf(z14 ? 1 : 0);
                                                                        f10.k(2, objArr);
                                                                        break;
                                                                    }
                                                                } else {
                                                                    i12++;
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
                            TLRPC.Message message9 = ziVar2.k;
                            if (message9.translatedRichMessage == null || !m10.equals(message9.translatedToLanguage)) {
                                hs.f(this.currentAccount).k(hs.N1, ziVar2);
                                final int i10 = 0;
                                p10 p10Var = new p10(this) { // from class: org.telegram.messenger.n00
                                    public final /* synthetic */ x00 b;

                                    {
                                        this.b = this;
                                    }

                                    @Override // org.telegram.messenger.p10
                                    public final void a(Object obj, Object obj2, Object obj3) {
                                        int i102 = i10;
                                        long j10 = B0;
                                        boolean z12 = z11;
                                        zi ziVar4 = ziVar2;
                                        x00 x00Var = this.b;
                                        switch (i102) {
                                            case 0:
                                                Integer num = (Integer) obj;
                                                TL_iv.RichMessage richMessage = (TL_iv.RichMessage) obj2;
                                                String str2 = (String) obj3;
                                                if (ziVar4.f1() != num.intValue()) {
                                                    a8.d("wtf, asked to translate " + ziVar4.f1() + " rich message but got " + num + "!");
                                                }
                                                TLRPC.Message message92 = ziVar4.k;
                                                message92.translatedToLanguage = str2;
                                                message92.translatedText = null;
                                                message92.translatedVoiceTranscription = null;
                                                message92.translatedPoll = null;
                                                message92.translatedRichMessage = richMessage;
                                                if (z12) {
                                                    x00Var.C(ziVar4);
                                                }
                                                x00Var.getMessagesStorage().X1(j10, ziVar4.k);
                                                hs.f(x00Var.currentAccount).k(128, ziVar4);
                                                ArrayList arrayList = (ArrayList) x00Var.n.S.f(j10);
                                                if (arrayList != null) {
                                                    for (int i11 = 0; i11 < arrayList.size(); i11++) {
                                                        zi ziVar5 = (zi) arrayList.get(i11);
                                                        if (ziVar5 != null && ziVar5.f1() == ziVar4.f1()) {
                                                            TLRPC.Message message10 = ziVar5.k;
                                                            message10.translatedToLanguage = str2;
                                                            message10.translatedRichMessage = richMessage;
                                                            if (ziVar5.h6(false)) {
                                                                hs.f(x00Var.currentAccount).k(2, 0);
                                                                break;
                                                            }
                                                        }
                                                    }
                                                    break;
                                                }
                                                break;
                                            default:
                                                Integer num2 = (Integer) obj;
                                                u00 u00Var3 = (u00) obj2;
                                                String str3 = (String) obj3;
                                                boolean z13 = false;
                                                if (ziVar4.f1() != num2.intValue()) {
                                                    a8.d("wtf, asked to translate " + ziVar4.f1() + " poll but got " + num2 + "!");
                                                }
                                                TLRPC.Message message11 = ziVar4.k;
                                                message11.translatedToLanguage = str3;
                                                message11.translatedText = null;
                                                message11.translatedVoiceTranscription = null;
                                                message11.translatedPoll = u00Var3;
                                                if (z12) {
                                                    x00Var.C(ziVar4);
                                                }
                                                x00Var.getMessagesStorage().X1(j10, ziVar4.k);
                                                hs.f(x00Var.currentAccount).k(128, ziVar4);
                                                ArrayList arrayList2 = (ArrayList) x00Var.n.S.f(j10);
                                                if (arrayList2 != null) {
                                                    int i12 = 0;
                                                    while (i12 < arrayList2.size()) {
                                                        zi ziVar6 = (zi) arrayList2.get(i12);
                                                        if (ziVar6 != null && ziVar6.f1() == ziVar4.f1()) {
                                                            TLRPC.Message message12 = ziVar6.k;
                                                            message12.translatedToLanguage = str3;
                                                            message12.translatedText = null;
                                                            message12.translatedVoiceTranscription = null;
                                                            message12.translatedPoll = u00Var3;
                                                            boolean z14 = z13;
                                                            if (ziVar6.h6(z14)) {
                                                                hs f10 = hs.f(x00Var.currentAccount);
                                                                Object[] objArr = new Object[1];
                                                                objArr[z14 ? 1 : 0] = Integer.valueOf(z14 ? 1 : 0);
                                                                f10.k(2, objArr);
                                                                break;
                                                            }
                                                        } else {
                                                            i12++;
                                                            z13 = false;
                                                        }
                                                    }
                                                    break;
                                                }
                                                break;
                                        }
                                    }
                                };
                                if (ziVar2.k == null || ziVar2.f1() < 0) {
                                    return;
                                }
                                TLRPC.Message message10 = ziVar2.k;
                                if (message10.rich_message == null) {
                                    return;
                                }
                                long B03 = zi.B0(message10);
                                synchronized (this) {
                                    try {
                                        ArrayList arrayList = (ArrayList) this.I.get(Long.valueOf(B03));
                                        if (arrayList == null) {
                                            HashMap hashMap2 = this.I;
                                            Long valueOf = Long.valueOf(B03);
                                            ArrayList arrayList2 = new ArrayList();
                                            hashMap2.put(valueOf, arrayList2);
                                            arrayList = arrayList2;
                                        }
                                        if (arrayList.isEmpty()) {
                                            s00Var = new s00();
                                            arrayList.add(s00Var);
                                        } else {
                                            s00Var = (s00) arrayList.get(arrayList.size() - 1);
                                        }
                                        if (s00Var.b.contains(Integer.valueOf(ziVar2.f1()))) {
                                            return;
                                        }
                                        if (s00Var.b.size() + 1 >= 20) {
                                            g0.r(s00Var.a);
                                            g0.h3(s00Var.a);
                                            s00Var = new s00();
                                            arrayList.add(s00Var);
                                        }
                                        zq zqVar = s00Var.a;
                                        if (zqVar != null) {
                                            g0.r(zqVar);
                                        }
                                        this.x.add(Integer.valueOf(ziVar2.f1()));
                                        s00Var.b.add(Integer.valueOf(ziVar2.f1()));
                                        a8.b("pending translation +" + ziVar2.f1() + " rich message");
                                        s00Var.c.add(p10Var);
                                        s00Var.d = m10;
                                        s00 s00Var2 = s00Var;
                                        zq zqVar2 = new zq(this, B03, s00Var2, 7);
                                        s00Var2.a = zqVar2;
                                        g0.i3(zqVar2, s00Var2.e);
                                        s00Var2.e /= 2;
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
                ziVar2 = ziVar;
                if (z10) {
                }
            }
        }
    }

    public final void i() {
        synchronized (this) {
            try {
                for (ArrayList arrayList : this.E.values()) {
                    if (arrayList != null) {
                        int size = arrayList.size();
                        int i3 = 0;
                        while (i3 < size) {
                            Object obj = arrayList.get(i3);
                            i3++;
                            t00 t00Var = (t00) obj;
                            g0.r(t00Var.a);
                            if (t00Var.h != -1) {
                                getConnectionsManager().cancelRequest(t00Var.h, true);
                                ArrayList arrayList2 = t00Var.b;
                                int size2 = arrayList2.size();
                                int i10 = 0;
                                while (i10 < size2) {
                                    Object obj2 = arrayList2.get(i10);
                                    i10++;
                                    this.x.remove((Integer) obj2);
                                }
                            }
                        }
                    }
                }
                for (ArrayList arrayList3 : this.F.values()) {
                    if (arrayList3 != null) {
                        int size3 = arrayList3.size();
                        int i11 = 0;
                        while (i11 < size3) {
                            Object obj3 = arrayList3.get(i11);
                            i11++;
                            t00 t00Var2 = (t00) obj3;
                            g0.r(t00Var2.a);
                            if (t00Var2.h != -1) {
                                getConnectionsManager().cancelRequest(t00Var2.h, true);
                                ArrayList arrayList4 = t00Var2.b;
                                int size4 = arrayList4.size();
                                int i12 = 0;
                                while (i12 < size4) {
                                    Object obj4 = arrayList4.get(i12);
                                    i12++;
                                    this.y.remove((Integer) obj4);
                                }
                            }
                        }
                    }
                }
                for (ArrayList arrayList5 : this.H.values()) {
                    if (arrayList5 != null) {
                        int size5 = arrayList5.size();
                        int i13 = 0;
                        while (i13 < size5) {
                            Object obj5 = arrayList5.get(i13);
                            i13++;
                            r00 r00Var = (r00) obj5;
                            g0.r(r00Var.a);
                            if (r00Var.h != -1) {
                                getConnectionsManager().cancelRequest(r00Var.h, true);
                                ArrayList arrayList6 = r00Var.b;
                                int size6 = arrayList6.size();
                                int i14 = 0;
                                while (i14 < size6) {
                                    Object obj6 = arrayList6.get(i14);
                                    i14++;
                                    this.x.remove((Integer) obj6);
                                }
                            }
                        }
                    }
                }
                for (ArrayList arrayList7 : this.I.values()) {
                    if (arrayList7 != null) {
                        int size7 = arrayList7.size();
                        int i15 = 0;
                        while (i15 < size7) {
                            Object obj7 = arrayList7.get(i15);
                            i15++;
                            s00 s00Var = (s00) obj7;
                            g0.r(s00Var.a);
                            if (s00Var.f != -1) {
                                getConnectionsManager().cancelRequest(s00Var.f, true);
                                ArrayList arrayList8 = s00Var.b;
                                int size8 = arrayList8.size();
                                int i16 = 0;
                                while (i16 < size8) {
                                    Object obj8 = arrayList8.get(i16);
                                    i16++;
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
        hp.s1(this.currentAccount).e7.edit().remove("translating_dialog_languages2").remove("hidden_translation_at").apply();
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

    public final void k(zi ziVar, ci.w9 w9Var) {
        TLRPC.Message message = ziVar.k;
        if (message == null || TextUtils.isEmpty(message.message)) {
            return;
        }
        if (!TextUtils.isEmpty(ziVar.k.originalLanguage)) {
            w9Var.a(ziVar.k.originalLanguage);
            return;
        }
        e3.s sVar = new e3.s(ziVar);
        HashSet hashSet = this.L;
        if (hashSet.contains(sVar)) {
            return;
        }
        hashSet.add(sVar);
        b6.d(ziVar.k.message, new d00(this, ziVar, sVar, w9Var), new d00(this, ziVar, sVar, w9Var), false);
    }

    public final void l(TL_stories.StoryItem storyItem) {
        String str;
        if (storyItem == null || storyItem.detectedLng != null || (str = storyItem.caption) == null || str.length() == 0) {
            return;
        }
        v00 v00Var = new v00();
        HashSet hashSet = this.J;
        if (hashSet.contains(v00Var)) {
            return;
        }
        hashSet.add(v00Var);
        b6.d(storyItem.caption, new k00(this, storyItem, v00Var), new k00(this, storyItem, v00Var), false);
    }

    public final String m(long j10) {
        String str = (String) this.d.get(Long.valueOf(j10));
        if (str == null && ((str = f21.M0()) == null || str.equals((String) this.e.get(Long.valueOf(j10))))) {
            str = j();
        }
        return "nb".equals(str) ? "no" : str;
    }

    public final void p(zi ziVar) {
        TLRPC.Message message = ziVar.k;
        if (message == null) {
            return;
        }
        long B0 = zi.B0(message);
        if (v(B0)) {
            TLRPC.Message message2 = ziVar.k;
            message2.translatedToLanguage = null;
            message2.translatedText = null;
            message2.translatedVoiceTranscription = null;
            message2.translatedPoll = null;
            message2.summaryText = null;
            message2.translatedSummaryText = null;
            message2.translatedSummaryLanguage = null;
            getMessagesStorage().X1(B0, ziVar.k);
            g0.h3(new a4(this, ziVar, B0, 8));
        }
    }

    public final boolean q(long j10) {
        TLRPC.Chat M0;
        return t(j10) && (M0 = getMessagesController().M0(Long.valueOf(-j10))) != null && M0.autotranslation;
    }

    public final boolean r() {
        if (!getMessagesController().G2()) {
            return false;
        }
        if (this.r == null) {
            this.r = Boolean.valueOf(this.n.e7.getBoolean("translate_chat_button", true));
        }
        return this.r.booleanValue();
    }

    public final boolean s() {
        if (!getMessagesController().H2()) {
            return false;
        }
        if (this.s == null) {
            this.s = Boolean.valueOf(this.n.e7.getBoolean("translate_button", hp.e1().getBoolean("translate_button", false)));
        }
        return this.s.booleanValue();
    }

    public final boolean t(long j10) {
        return this.b.contains(Long.valueOf(j10)) && v(j10) && !m5.C(j10) && getUserConfig().e() != j10;
    }

    public final boolean u() {
        return r() && h10.i(this.currentAccount).q();
    }

    public final boolean v(long j10) {
        if (!r()) {
            return false;
        }
        TLRPC.Chat M0 = getMessagesController().M0(Long.valueOf(-j10));
        if (h10.i(this.currentAccount).q()) {
            return true;
        }
        return M0 != null && M0.autotranslation;
    }

    public final boolean w(String str) {
        if (getUserConfig().q()) {
            return gy0.d0().contains(str);
        }
        try {
            return TextUtils.equals(bd.E0().B.f, str);
        } catch (Exception unused) {
            return false;
        }
    }

    public final boolean z(long j10) {
        if (this.h.contains(Long.valueOf(j10))) {
            return true;
        }
        TLRPC.ChatFull N0 = getMessagesController().N0(-j10);
        if (N0 != null) {
            return N0.translations_disabled;
        }
        TLRPC.UserFull b22 = getMessagesController().b2(j10);
        if (b22 != null) {
            return b22.translations_disabled;
        }
        return false;
    }
}
