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
import org.telegram.ui.Components.e21;
import org.telegram.ui.qy0;
import org.telegram.ui.vn0;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public final class f10 extends c1 {
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
    public final qp n;
    public Boolean r;
    public Boolean s;
    public final ArrayList w;
    public final HashSet x;
    public final HashSet y;

    public f10(qp qpVar) {
        super(qpVar.currentAccount);
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
        this.n = qpVar;
        g0.i3(new ds(this, 17), 150L);
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
        String str = hd.E0().B.f;
        return str != null ? str.split("_")[0] : str;
    }

    public static ArrayList n() {
        ArrayList arrayList = new ArrayList();
        int i7 = 0;
        while (true) {
            List list = N;
            if (i7 >= list.size()) {
                break;
            }
            y00 y00Var = new y00();
            String str = (String) list.get(i7);
            y00Var.a = str;
            if ("no".equals(str)) {
                y00Var.a = "nb";
            }
            y00Var.b = e21.K0(e21.O0(y00Var.a, null, null));
            y00Var.c = e21.K0(e21.V0(y00Var.a, true));
            if (y00Var.b != null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(y00Var.b);
                sb2.append(" ");
                String str2 = y00Var.c;
                if (str2 == null) {
                    str2 = "";
                }
                sb2.append(str2);
                y00Var.d = sb2.toString().toLowerCase();
                arrayList.add(y00Var);
            }
            i7++;
        }
        if (Build.VERSION.SDK_INT >= 24) {
            Collections.sort(arrayList, new n00(Collator.getInstance(Locale.getDefault()), 0));
            return arrayList;
        }
        Collections.sort(arrayList, Comparator$-CC.comparing(new aa.l(7)));
        return arrayList;
    }

    public static ArrayList o(String str) {
        ArrayList arrayList = new ArrayList();
        if (O == null) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            try {
                linkedHashSet.add(hd.E0().B.f);
            } catch (Exception e10) {
                a8.g(e10, true);
            }
            try {
                linkedHashSet.add(Resources.getSystem().getConfiguration().locale.getLanguage());
            } catch (Exception e11) {
                a8.g(e11, true);
            }
            try {
                linkedHashSet.addAll(qy0.d0());
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
                            if (e21.O0(locale, null, null) != null) {
                                linkedHashSet.add(locale);
                            }
                        }
                    }
                }
            } catch (Exception e13) {
                a8.g(e13, true);
            }
            O = linkedHashSet;
        }
        Iterator it2 = O.iterator();
        while (it2.hasNext()) {
            String str2 = (String) it2.next();
            if (!TextUtils.equals(str2, str) && (!"no".equals(str) || !"nb".equals(str2))) {
                if (!"nb".equals(str) || !"no".equals(str2)) {
                    y00 y00Var = new y00();
                    y00Var.a = str2;
                    if ("no".equals(str2)) {
                        y00Var.a = "nb";
                    }
                    y00Var.b = e21.K0(e21.O0(y00Var.a, null, null));
                    y00Var.c = e21.K0(e21.V0(y00Var.a, true));
                    if (y00Var.b != null) {
                        y00Var.d = (y00Var.b + " " + y00Var.c).toLowerCase();
                        arrayList.add(y00Var);
                    }
                }
            }
        }
        return arrayList;
    }

    public static boolean x(ij ijVar) {
        TLRPC.Message message;
        if (ijVar == null || (message = ijVar.k) == null || message.summary_from_language == null || ijVar.Q3() || ijVar.E0 || ijVar.s4()) {
            return false;
        }
        int i7 = ijVar.D;
        return (i7 == 0 || i7 == 3 || i7 == 1 || i7 == 9 || i7 == 14 || i7 == 17) && !TextUtils.isEmpty(ijVar.k.message) && ijVar.k.message.length() > 100;
    }

    public static boolean y(ij ijVar) {
        if (ijVar == null || ijVar.k == null || ijVar.Q3() || ijVar.E0 || ijVar.s4() || (ij.n1(ijVar) instanceof TLRPC.TL_messageMediaWidget)) {
            return false;
        }
        int i7 = ijVar.D;
        if (i7 != 0 && i7 != 3 && i7 != 1 && i7 != 2 && i7 != 5 && i7 != 9 && i7 != 14 && i7 != 17 && i7 != 36) {
            return false;
        }
        if (TextUtils.isEmpty(ijVar.k.message) && !(ij.n1(ijVar) instanceof TLRPC.TL_messageMediaPoll)) {
            TLRPC.Message message = ijVar.k;
            if (message.rich_message == null && (!message.voiceTranscriptionOpen || TextUtils.isEmpty(message.voiceTranscription) || !ijVar.k.voiceTranscriptionFinal)) {
                return false;
            }
        }
        return true;
    }

    public final boolean A(ij ijVar) {
        TLRPC.Message message;
        boolean z9 = true;
        if (ijVar != null && (message = ijVar.k) != null && message.summarizedOpen) {
            return this.F.contains(Integer.valueOf(Objects.hash(Long.valueOf(ij.B0(message)), Integer.valueOf(ijVar.f1()), Integer.valueOf(B(ij.B0(ijVar.k)) ? 1 : 0))));
        }
        synchronized (this) {
            if (ijVar != null) {
                try {
                    TLRPC.Message message2 = ijVar.k;
                    if (message2 != null) {
                        if (((message2.voiceTranscriptionOpen && message2.voiceTranscriptionFinal) ? this.y : this.x).contains(Integer.valueOf(ijVar.f1())) && B(ij.B0(ijVar.k))) {
                        }
                    }
                } finally {
                }
            }
            z9 = false;
        }
        return z9;
    }

    public final boolean B(long j3) {
        if (v(j3)) {
            return ((Boolean) this.a.get(j3, Boolean.valueOf(q(j3)))).booleanValue();
        }
        return false;
    }

    public final void C(ij ijVar) {
        Long valueOf = Long.valueOf(ij.B0(ijVar.k));
        HashMap hashMap = this.f;
        HashMap hashMap2 = (HashMap) hashMap.get(valueOf);
        if (hashMap2 == null) {
            Long valueOf2 = Long.valueOf(ij.B0(ijVar.k));
            HashMap hashMap3 = new HashMap();
            hashMap.put(valueOf2, hashMap3);
            hashMap2 = hashMap3;
        }
        hashMap2.put(Integer.valueOf(ijVar.f1()), ijVar);
    }

    public final void E(ij ijVar, String str, v00 v00Var) {
        Throwable th2;
        z00 z00Var;
        if (ijVar.f1() >= 0) {
            long B0 = ij.B0(ijVar.k);
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
                            z00Var = new z00();
                            arrayList.add(z00Var);
                        } else {
                            z00Var = (z00) arrayList.get(arrayList.size() - 1);
                        }
                        if (z00Var.b.contains(Integer.valueOf(ijVar.f1()))) {
                            return;
                        }
                        TLRPC.MessageMedia n1 = ij.n1(ijVar);
                        if (n1 instanceof TLRPC.TL_messageMediaPoll) {
                            c10 a10 = c10.a((TLRPC.TL_messageMediaPoll) n1);
                            c10 c10Var = ijVar.k.translatedPoll;
                            TLRPC.TL_textWithEntities tL_textWithEntities = a10.a;
                            int length = tL_textWithEntities != null ? tL_textWithEntities.text.length() : 0;
                            for (int i7 = 0; i7 < a10.b.size(); i7++) {
                                length += ((TLRPC.PollAnswer) a10.b.get(i7)).text.text.length();
                            }
                            TLRPC.TL_textWithEntities tL_textWithEntities2 = a10.c;
                            if (tL_textWithEntities2 != null) {
                                length += tL_textWithEntities2.text.length();
                            }
                            if (z00Var.g + length >= 25000 || z00Var.b.size() + 1 >= 20) {
                                g0.r(z00Var.a);
                                g0.h3(z00Var.a);
                                z00Var = new z00();
                                arrayList.add(z00Var);
                            }
                            hr hrVar = z00Var.a;
                            if (hrVar != null) {
                                g0.r(hrVar);
                            }
                            this.x.add(Integer.valueOf(ijVar.f1()));
                            z00Var.b.add(Integer.valueOf(ijVar.f1()));
                            a8.b("pending translation +" + ijVar.f1() + " poll message");
                            z00Var.c.add(new Pair(a10, c10Var));
                            z00Var.d.add(v00Var);
                            z00Var.e = str;
                            z00Var.g = z00Var.g + length;
                            z00 z00Var2 = z00Var;
                            hr hrVar2 = new hr(this, B0, z00Var2, 8);
                            z00Var2.a = hrVar2;
                            g0.i3(hrVar2, z00Var2.f);
                            z00Var2.f /= 2;
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

    public final void F(ij ijVar, String str, c20 c20Var) {
        int i7 = 1;
        int hash = Objects.hash(Long.valueOf(ij.B0(ijVar.k)), Integer.valueOf(ijVar.f1()), Integer.valueOf(str != null ? 1 : 0));
        Integer valueOf = Integer.valueOf(hash);
        HashSet hashSet = this.F;
        if (hashSet.contains(valueOf)) {
            return;
        }
        hashSet.add(Integer.valueOf(hash));
        TLRPC.TL_messages_summarizeText tL_messages_summarizeText = new TLRPC.TL_messages_summarizeText();
        tL_messages_summarizeText.peer = qp.s1(this.currentAccount).j1(ij.B0(ijVar.k));
        tL_messages_summarizeText.id = ijVar.f1();
        if (str != null) {
            tL_messages_summarizeText.flags |= 1;
            tL_messages_summarizeText.to_lang = D(str);
        }
        ConnectionsManager.getInstance(this.currentAccount).sendRequestTyped(tL_messages_summarizeText, new d3.b(i7), new ht(this, hash, c20Var));
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x00f6 A[Catch: all -> 0x006f, TryCatch #0 {all -> 0x006f, blocks: (B:25:0x0055, B:27:0x0061, B:28:0x0072, B:30:0x0078, B:31:0x008c, B:33:0x009c, B:37:0x00a0, B:40:0x00ca, B:42:0x00d1, B:46:0x00f2, B:48:0x00f6, B:49:0x00f9, B:50:0x0152, B:52:0x00df, B:53:0x00a7, B:54:0x00ac, B:56:0x00b0, B:58:0x00b4, B:59:0x00b9, B:61:0x00bd, B:62:0x00c2, B:64:0x00c6, B:65:0x0081), top: B:24:0x0055 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void G(ij ijVar, String str, x00 x00Var) {
        b10 b10Var;
        String str2;
        z3 z3Var;
        if (ijVar.k == null || ijVar.f1() < 0) {
            return;
        }
        TLRPC.Message message = ijVar.k;
        int i7 = 0;
        boolean z9 = message.voiceTranscription != null && message.voiceTranscriptionFinal && message.voiceTranscriptionOpen;
        long B0 = ij.B0(message);
        HashMap hashMap = z9 ? this.E : this.D;
        HashSet hashSet = z9 ? this.y : this.x;
        TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
        if (z9) {
            String str3 = ijVar.k.voiceTranscription;
            tL_textWithEntities.text = str3;
            if (TextUtils.isEmpty(str3)) {
                return;
            }
        } else {
            TLRPC.Message message2 = ijVar.k;
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
                    b10Var = new b10();
                    arrayList.add(b10Var);
                } else {
                    b10Var = (b10) arrayList.get(arrayList.size() - 1);
                }
                if (b10Var.b.contains(Integer.valueOf(ijVar.f1()))) {
                    return;
                }
                if (z9) {
                    String str4 = ijVar.k.voiceTranscription;
                    if (str4 != null) {
                        i7 = str4.length();
                    }
                } else {
                    TLRPC.Message message3 = ijVar.k;
                    if (message3 == null || (str2 = message3.message) == null) {
                        CharSequence charSequence = ijVar.z;
                        if (charSequence != null) {
                            i7 = charSequence.length();
                        } else {
                            CharSequence charSequence2 = ijVar.v;
                            if (charSequence2 != null) {
                                i7 = charSequence2.length();
                            }
                        }
                    } else {
                        i7 = str2.length();
                    }
                }
                if (b10Var.g + i7 < 25000) {
                    if (b10Var.b.size() + 1 >= 20) {
                    }
                    b10 b10Var2 = b10Var;
                    z3Var = b10Var2.a;
                    if (z3Var != null) {
                        g0.r(z3Var);
                    }
                    hashSet.add(Integer.valueOf(ijVar.f1()));
                    b10Var2.b.add(Integer.valueOf(ijVar.f1()));
                    a8.b("pending translation +" + ijVar.f1() + " message");
                    b10Var2.c.add(tL_textWithEntities);
                    b10Var2.d.add(x00Var);
                    b10Var2.e = str;
                    b10Var2.g += i7;
                    z3 z3Var2 = new z3(this, hashMap, B0, b10Var2, z9, hashSet);
                    b10Var2.a = z3Var2;
                    g0.i3(z3Var2, b10Var2.f);
                    b10Var2.f /= 2;
                }
                g0.r(b10Var.a);
                g0.h3(b10Var.a);
                b10Var = new b10();
                arrayList.add(b10Var);
                b10 b10Var22 = b10Var;
                z3Var = b10Var22.a;
                if (z3Var != null) {
                }
                hashSet.add(Integer.valueOf(ijVar.f1()));
                b10Var22.b.add(Integer.valueOf(ijVar.f1()));
                a8.b("pending translation +" + ijVar.f1() + " message");
                b10Var22.c.add(tL_textWithEntities);
                b10Var22.d.add(x00Var);
                b10Var22.e = str;
                b10Var22.g += i7;
                z3 z3Var22 = new z3(this, hashMap, B0, b10Var22, z9, hashSet);
                b10Var22.a = z3Var22;
                g0.i3(z3Var22, b10Var22.f);
                b10Var22.f /= 2;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void H() {
        StringBuilder sb2 = new StringBuilder();
        boolean z9 = true;
        int i7 = 0;
        while (true) {
            LongSparseArray longSparseArray = this.a;
            if (i7 >= longSparseArray.size()) {
                break;
            }
            try {
                long keyAt = longSparseArray.keyAt(i7);
                if (!z9) {
                    sb2.append(";");
                }
                if (z9) {
                    z9 = false;
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
                if (!((Boolean) longSparseArray.valueAt(i7)).booleanValue()) {
                    sb2.append("!");
                }
            } catch (Exception unused) {
            }
            i7++;
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
        qp.s1(this.currentAccount).e7.edit().putString("translating_dialog_languages2", sb2.toString()).putStringSet("hidden_translation_at", hashSet).apply();
    }

    public final void I(long j3, String str) {
        f10 f10Var;
        long j10;
        String str2;
        Boolean bool;
        if (TextUtils.equals(m(j3), str)) {
            return;
        }
        if (B(j3)) {
            f10Var = this;
            j10 = j3;
            str2 = str;
            g0.i3(new a4(f10Var, j10, str2, 9), 150L);
        } else {
            f10Var = this;
            j10 = j3;
            str2 = str;
            synchronized (this) {
                f10Var.d.put(Long.valueOf(j10), str2);
            }
        }
        c(j10);
        synchronized (this) {
            LongSparseArray longSparseArray = f10Var.a;
            bool = Boolean.FALSE;
            longSparseArray.put(j10, bool);
        }
        qs.f(f10Var.currentAccount).k(qs.P1, Long.valueOf(j10), bool);
        e21.S0(str2);
    }

    public final void J(long j3, boolean z9, boolean z10) {
        TLRPC.TL_messages_togglePeerTranslations tL_messages_togglePeerTranslations = new TLRPC.TL_messages_togglePeerTranslations();
        tL_messages_togglePeerTranslations.peer = getMessagesController().j1(j3);
        tL_messages_togglePeerTranslations.disabled = z9;
        getConnectionsManager().sendRequest(tL_messages_togglePeerTranslations, null);
        TLRPC.ChatFull N0 = getMessagesController().N0(-j3);
        if (N0 != null) {
            N0.translations_disabled = z9;
            getMessagesStorage().N1(N0, true);
        }
        TLRPC.UserFull b22 = getMessagesController().b2(j3);
        if (b22 != null) {
            b22.translations_disabled = z9;
            getMessagesStorage().j2(b22, true);
        }
        synchronized (this) {
            try {
                if (z9) {
                    this.h.add(Long.valueOf(j3));
                    this.a.remove(j3);
                } else {
                    this.h.remove(Long.valueOf(j3));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        H();
        if (z10) {
            return;
        }
        qs.f(this.currentAccount).k(qs.P1, Long.valueOf(j3), Boolean.valueOf(B(j3)));
    }

    public final boolean K(long j3, boolean z9) {
        boolean B = B(j3);
        int i7 = qs.P1;
        boolean z10 = true;
        LongSparseArray longSparseArray = this.a;
        if (z9 && !B) {
            Boolean bool = Boolean.TRUE;
            longSparseArray.put(j3, bool);
            qs.f(this.currentAccount).k(i7, Long.valueOf(j3), bool);
        } else if (z9 || !B) {
            z10 = false;
        } else {
            Boolean bool2 = Boolean.FALSE;
            longSparseArray.put(j3, bool2);
            qs.f(this.currentAccount).k(i7, Long.valueOf(j3), bool2);
            c(j3);
        }
        H();
        return z10;
    }

    public final void L(ij ijVar, vn0 vn0Var) {
        if (ijVar == null || ijVar.k == null) {
            return;
        }
        f3.s sVar = new f3.s(ijVar);
        String M0 = e21.M0();
        TLRPC.Message message = ijVar.k;
        if (message.translatedText != null && TextUtils.equals(message.translatedToLanguage, M0)) {
            vn0Var.run();
            return;
        }
        HashSet hashSet = this.L;
        if (hashSet.contains(sVar)) {
            vn0Var.run();
            return;
        }
        hashSet.add(sVar);
        TLRPC.TL_messages_translateText tL_messages_translateText = new TLRPC.TL_messages_translateText();
        tL_messages_translateText.flags |= 2;
        TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
        TLRPC.Message message2 = ijVar.k;
        tL_textWithEntities.text = message2.message;
        ArrayList<TLRPC.MessageEntity> arrayList = message2.entities;
        tL_textWithEntities.entities = arrayList;
        if (arrayList == null) {
            tL_textWithEntities.entities = new ArrayList<>();
        }
        tL_messages_translateText.text.add(tL_textWithEntities);
        tL_messages_translateText.to_lang = D(M0);
        getConnectionsManager().sendRequest(tL_messages_translateText, new mm(this, ijVar, M0, sVar, vn0Var, System.currentTimeMillis(), tL_textWithEntities));
    }

    public final void M(long j3) {
        boolean z9;
        if (v(j3) && t(j3)) {
            boolean contains = this.h.contains(Long.valueOf(j3));
            TLRPC.ChatFull N0 = getMessagesController().N0(-j3);
            if (N0 != null) {
                z9 = N0.translations_disabled;
            } else {
                TLRPC.UserFull b22 = getMessagesController().b2(j3);
                z9 = b22 != null ? b22.translations_disabled : false;
            }
            synchronized (this) {
                try {
                    if (z9) {
                        this.h.add(Long.valueOf(j3));
                        this.a.remove(j3);
                    } else {
                        this.h.remove(Long.valueOf(j3));
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (contains != z9) {
                H();
                qs.f(this.currentAccount).k(qs.P1, Long.valueOf(j3), Boolean.valueOf(B(j3)));
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0025, code lost:
    
        if (android.text.TextUtils.equals(r0.translatedToLanguage, org.telegram.ui.Components.e21.M0()) != false) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean b(ij ijVar, String str) {
        String str2;
        TLRPC.Message message = ijVar.k;
        if (message != null && (str2 = message.originalLanguage) != null) {
            str = str2;
        }
        if (message == null || TextUtils.isEmpty(message.message)) {
            return false;
        }
        if (str == null) {
            TLRPC.Message message2 = ijVar.k;
            if (message2.translatedText != null) {
            }
        }
        if (str == null || w(ijVar.k.originalLanguage)) {
            return false;
        }
        return !ijVar.J2;
    }

    public final void c(long j3) {
        synchronized (this) {
            try {
                ArrayList arrayList = (ArrayList) this.D.get(Long.valueOf(j3));
                if (arrayList != null) {
                    int size = arrayList.size();
                    int i7 = 0;
                    while (i7 < size) {
                        Object obj = arrayList.get(i7);
                        i7++;
                        b10 b10Var = (b10) obj;
                        g0.r(b10Var.a);
                        if (b10Var.h != -1) {
                            getConnectionsManager().cancelRequest(b10Var.h, true);
                            ArrayList arrayList2 = b10Var.b;
                            int size2 = arrayList2.size();
                            int i10 = 0;
                            while (i10 < size2) {
                                Object obj2 = arrayList2.get(i10);
                                i10++;
                                this.x.remove((Integer) obj2);
                            }
                        }
                    }
                    this.D.remove(Long.valueOf(j3));
                }
                ArrayList arrayList3 = (ArrayList) this.E.get(Long.valueOf(j3));
                if (arrayList3 != null) {
                    int size3 = arrayList3.size();
                    int i11 = 0;
                    while (i11 < size3) {
                        Object obj3 = arrayList3.get(i11);
                        i11++;
                        b10 b10Var2 = (b10) obj3;
                        g0.r(b10Var2.a);
                        if (b10Var2.h != -1) {
                            getConnectionsManager().cancelRequest(b10Var2.h, true);
                            ArrayList arrayList4 = b10Var2.b;
                            int size4 = arrayList4.size();
                            int i12 = 0;
                            while (i12 < size4) {
                                Object obj4 = arrayList4.get(i12);
                                i12++;
                                this.y.remove((Integer) obj4);
                            }
                        }
                    }
                    this.E.remove(Long.valueOf(j3));
                }
                ArrayList arrayList5 = (ArrayList) this.G.get(Long.valueOf(j3));
                if (arrayList5 != null) {
                    int size5 = arrayList5.size();
                    int i13 = 0;
                    while (i13 < size5) {
                        Object obj5 = arrayList5.get(i13);
                        i13++;
                        z00 z00Var = (z00) obj5;
                        g0.r(z00Var.a);
                        if (z00Var.h != -1) {
                            getConnectionsManager().cancelRequest(z00Var.h, true);
                            ArrayList arrayList6 = z00Var.b;
                            int size6 = arrayList6.size();
                            int i14 = 0;
                            while (i14 < size6) {
                                Object obj6 = arrayList6.get(i14);
                                i14++;
                                this.x.remove((Integer) obj6);
                            }
                        }
                    }
                    this.G.remove(Long.valueOf(j3));
                }
                ArrayList arrayList7 = (ArrayList) this.H.get(Long.valueOf(j3));
                if (arrayList7 != null) {
                    int size7 = arrayList7.size();
                    int i15 = 0;
                    while (i15 < size7) {
                        Object obj7 = arrayList7.get(i15);
                        i15++;
                        a10 a10Var = (a10) obj7;
                        g0.r(a10Var.a);
                        if (a10Var.f != -1) {
                            getConnectionsManager().cancelRequest(a10Var.f, true);
                            ArrayList arrayList8 = a10Var.b;
                            int size8 = arrayList8.size();
                            int i16 = 0;
                            while (i16 < size8) {
                                Object obj8 = arrayList8.get(i16);
                                i16++;
                                this.x.remove((Integer) obj8);
                            }
                        }
                    }
                    this.H.remove(Long.valueOf(j3));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void d(long j3) {
        if (v(j3)) {
            e(j3);
        }
    }

    public final void e(long j3) {
        if (((Boolean) this.a.get(j3, Boolean.valueOf(q(j3)))).booleanValue()) {
            getMessagesStorage().a.c(new o00(this, j3, 1));
        }
    }

    public final void f(ij ijVar) {
        TLRPC.Message message;
        String str;
        String str2;
        if (ijVar == null || (message = ijVar.k) == null) {
            return;
        }
        long B0 = ij.B0(message);
        Long valueOf = Long.valueOf(B0);
        HashMap hashMap = this.c;
        e10 e10Var = (e10) hashMap.get(valueOf);
        if (e10Var == null) {
            Long valueOf2 = Long.valueOf(B0);
            e10 e10Var2 = new e10();
            e10Var2.a = new HashSet();
            e10Var2.b = new HashSet();
            e10Var2.c = new HashSet();
            hashMap.put(valueOf2, e10Var2);
            e10Var = e10Var2;
        }
        HashSet hashSet = e10Var.c;
        HashSet hashSet2 = e10Var.a;
        HashSet hashSet3 = e10Var.b;
        boolean z9 = false;
        boolean z10 = y(ijVar) && ((str2 = ijVar.k.originalLanguage) == null || "und".equals(str2));
        if (y(ijVar) && (str = ijVar.k.originalLanguage) != null && !"und".equals(str) && !w(ijVar.k.originalLanguage)) {
            z9 = true;
        }
        if (z10) {
            hashSet3.add(Integer.valueOf(ijVar.f1()));
        } else {
            (z9 ? hashSet2 : hashSet).add(Integer.valueOf(ijVar.f1()));
        }
        if (!z10) {
            this.e.put(Long.valueOf(B0), ijVar.k.originalLanguage);
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
                g0.i3(new o00(this, B0, 0), 450L);
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
                int i7 = 0;
                while (i7 < size) {
                    Object obj = arrayList.get(i7);
                    i7++;
                    Long l11 = (Long) obj;
                    l11.getClass();
                    qs.f(this.currentAccount).k(qs.P1, l11, Boolean.FALSE);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [org.telegram.messenger.x00] */
    /* JADX WARN: Type inference failed for: r0v14, types: [org.telegram.messenger.v00] */
    public final void h(ij ijVar, boolean z9, final boolean z10) {
        TLRPC.Message message;
        final ij ijVar2;
        c10 c10Var;
        a10 a10Var;
        c10 c10Var2;
        ij ijVar3;
        if (ijVar == null || (message = ijVar.k) == null) {
            return;
        }
        final long B0 = ij.B0(message);
        r2 = null;
        r2 = null;
        String str = null;
        if (z9) {
            TLRPC.Message message2 = ijVar.k;
            if (message2.summarizedOpen && message2.summaryText == null && !B(ij.B0(message2))) {
                F(ijVar, null, new t00(this, ijVar, B0));
            }
        }
        if (v(B0)) {
            if (!z10 && (ijVar3 = ijVar.C) != null) {
                h(ijVar3, z9, true);
            }
            if (y(ijVar)) {
                if (!B(B0)) {
                    TLRPC.Message message3 = ijVar.k;
                    if (message3 != null) {
                        if (!TextUtils.isEmpty(message3.message)) {
                            str = ijVar.k.message;
                        } else if (ijVar.D == 36 && !TextUtils.isEmpty(ijVar.v)) {
                            str = ijVar.v.toString();
                        }
                    }
                    if (!y(ijVar) || ijVar.k == null || TextUtils.isEmpty(str)) {
                        return;
                    }
                    TLRPC.Message message4 = ijVar.k;
                    if (message4.originalLanguage != null) {
                        f(ijVar);
                        return;
                    }
                    long B02 = ij.B0(message4);
                    int hash = Objects.hash(Long.valueOf(ij.B0(ijVar.k)), Integer.valueOf(ijVar.f1()));
                    if (t(B02) || this.w.contains(Integer.valueOf(hash))) {
                        return;
                    }
                    this.w.add(Integer.valueOf(hash));
                    Utilities.d.c(new m00(this, str, ijVar, B02, hash, 0));
                    return;
                }
                if (z(B0)) {
                    return;
                }
                String m10 = m(B0);
                if (!z10 && ijVar.D != 36) {
                    TLRPC.Message message5 = ijVar.k;
                    if ((((message5.voiceTranscriptionOpen && message5.voiceTranscriptionFinal) ? message5.translatedVoiceTranscription : message5.translatedText) == null && message5.translatedPoll == null) || (((c10Var2 = message5.translatedPoll) != null && !c10.b(ijVar, c10Var2)) || !m10.equals(ijVar.k.translatedToLanguage))) {
                        int f12 = ijVar.f1();
                        HashMap hashMap = (HashMap) this.f.get(Long.valueOf(B0));
                        ijVar2 = hashMap != null ? (ij) hashMap.get(Integer.valueOf(f12)) : null;
                        if (ijVar2 != null) {
                            TLRPC.Message message6 = ijVar.k;
                            TLRPC.Message message7 = ijVar2.k;
                            message6.translatedToLanguage = message7.translatedToLanguage;
                            message6.translatedText = message7.translatedText;
                            message6.translatedPoll = message7.translatedPoll;
                            if (z9 || !B(B0)) {
                            }
                            if (ijVar2.D != 36) {
                                TLRPC.Message message8 = ijVar2.k;
                                if (message8.summarizedOpen) {
                                    if (message8.translatedSummaryText == null || !m10.equals(message8.translatedSummaryLanguage)) {
                                        F(ijVar2, m10, new w00(this, ijVar2, m10, B0));
                                        return;
                                    }
                                    return;
                                }
                                if (!(((message8.voiceTranscriptionOpen && message8.voiceTranscriptionFinal) ? message8.translatedVoiceTranscription : message8.translatedText) == null && message8.translatedPoll == null) && (((c10Var = message8.translatedPoll) == null || c10.b(ijVar2, c10Var)) && m10.equals(ijVar2.k.translatedToLanguage))) {
                                    if (z10) {
                                        C(ijVar2);
                                        return;
                                    }
                                    return;
                                } else {
                                    qs.f(this.currentAccount).k(qs.N1, ijVar2);
                                    if (!(ij.n1(ijVar2) instanceof TLRPC.TL_messageMediaPoll)) {
                                        G(ijVar2, m10, new z10() { // from class: org.telegram.messenger.x00
                                            @Override // org.telegram.messenger.z10
                                            public final void a(Object obj, Object obj2, Object obj3, Object obj4) {
                                                Boolean bool = (Boolean) obj;
                                                Integer num = (Integer) obj2;
                                                TLRPC.TL_textWithEntities tL_textWithEntities = (TLRPC.TL_textWithEntities) obj3;
                                                String str2 = (String) obj4;
                                                ij ijVar4 = ijVar2;
                                                if (ijVar4.f1() != num.intValue()) {
                                                    a8.d("wtf, asked to translate " + ijVar4.f1() + " but got " + num + "!");
                                                }
                                                ijVar4.k.translatedToLanguage = str2;
                                                if (bool.booleanValue()) {
                                                    ijVar4.k.translatedVoiceTranscription = tL_textWithEntities;
                                                } else {
                                                    ijVar4.k.translatedText = tL_textWithEntities;
                                                }
                                                ijVar4.k.translatedPoll = null;
                                                f10 f10Var = f10.this;
                                                if (z10) {
                                                    f10Var.C(ijVar4);
                                                }
                                                yr messagesStorage = f10Var.getMessagesStorage();
                                                TLRPC.Message message9 = ijVar4.k;
                                                long j3 = B0;
                                                messagesStorage.X1(j3, message9);
                                                qs.f(f10Var.currentAccount).k(qs.M1, ijVar4);
                                                ArrayList arrayList = (ArrayList) f10Var.n.R.f(j3);
                                                if (arrayList != null) {
                                                    for (int i7 = 0; i7 < arrayList.size(); i7++) {
                                                        ij ijVar5 = (ij) arrayList.get(i7);
                                                        if (ijVar5 != null && ijVar5.f1() == ijVar4.f1()) {
                                                            ijVar5.k.translatedToLanguage = str2;
                                                            if (bool.booleanValue()) {
                                                                ijVar5.k.translatedVoiceTranscription = tL_textWithEntities;
                                                            } else {
                                                                ijVar5.k.translatedText = tL_textWithEntities;
                                                            }
                                                            ijVar5.k.translatedPoll = null;
                                                            if (ijVar5.h6(false)) {
                                                                qs.f(f10Var.currentAccount).k(qs.r, 0);
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
                                        final int i7 = 1;
                                        E(ijVar2, m10, new x10(this) { // from class: org.telegram.messenger.v00
                                            public final /* synthetic */ f10 b;

                                            {
                                                this.b = this;
                                            }

                                            @Override // org.telegram.messenger.x10
                                            public final void a(Object obj, Object obj2, Object obj3) {
                                                int i10 = i7;
                                                long j3 = B0;
                                                boolean z11 = z10;
                                                ij ijVar4 = ijVar2;
                                                f10 f10Var = this.b;
                                                switch (i10) {
                                                    case 0:
                                                        Integer num = (Integer) obj;
                                                        TL_iv.RichMessage richMessage = (TL_iv.RichMessage) obj2;
                                                        String str2 = (String) obj3;
                                                        if (ijVar4.f1() != num.intValue()) {
                                                            a8.d("wtf, asked to translate " + ijVar4.f1() + " rich message but got " + num + "!");
                                                        }
                                                        TLRPC.Message message9 = ijVar4.k;
                                                        message9.translatedToLanguage = str2;
                                                        message9.translatedText = null;
                                                        message9.translatedVoiceTranscription = null;
                                                        message9.translatedPoll = null;
                                                        message9.translatedRichMessage = richMessage;
                                                        if (z11) {
                                                            f10Var.C(ijVar4);
                                                        }
                                                        f10Var.getMessagesStorage().X1(j3, ijVar4.k);
                                                        qs.f(f10Var.currentAccount).k(128, ijVar4);
                                                        ArrayList arrayList = (ArrayList) f10Var.n.R.f(j3);
                                                        if (arrayList != null) {
                                                            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                                                                ij ijVar5 = (ij) arrayList.get(i11);
                                                                if (ijVar5 != null && ijVar5.f1() == ijVar4.f1()) {
                                                                    TLRPC.Message message10 = ijVar5.k;
                                                                    message10.translatedToLanguage = str2;
                                                                    message10.translatedRichMessage = richMessage;
                                                                    if (ijVar5.h6(false)) {
                                                                        qs.f(f10Var.currentAccount).k(2, 0);
                                                                        break;
                                                                    }
                                                                }
                                                            }
                                                            break;
                                                        }
                                                        break;
                                                    default:
                                                        Integer num2 = (Integer) obj;
                                                        c10 c10Var3 = (c10) obj2;
                                                        String str3 = (String) obj3;
                                                        boolean z12 = false;
                                                        if (ijVar4.f1() != num2.intValue()) {
                                                            a8.d("wtf, asked to translate " + ijVar4.f1() + " poll but got " + num2 + "!");
                                                        }
                                                        TLRPC.Message message11 = ijVar4.k;
                                                        message11.translatedToLanguage = str3;
                                                        message11.translatedText = null;
                                                        message11.translatedVoiceTranscription = null;
                                                        message11.translatedPoll = c10Var3;
                                                        if (z11) {
                                                            f10Var.C(ijVar4);
                                                        }
                                                        f10Var.getMessagesStorage().X1(j3, ijVar4.k);
                                                        qs.f(f10Var.currentAccount).k(128, ijVar4);
                                                        ArrayList arrayList2 = (ArrayList) f10Var.n.R.f(j3);
                                                        if (arrayList2 != null) {
                                                            int i12 = 0;
                                                            while (i12 < arrayList2.size()) {
                                                                ij ijVar6 = (ij) arrayList2.get(i12);
                                                                if (ijVar6 != null && ijVar6.f1() == ijVar4.f1()) {
                                                                    TLRPC.Message message12 = ijVar6.k;
                                                                    message12.translatedToLanguage = str3;
                                                                    message12.translatedText = null;
                                                                    message12.translatedVoiceTranscription = null;
                                                                    message12.translatedPoll = c10Var3;
                                                                    boolean z13 = z12;
                                                                    if (ijVar6.h6(z13)) {
                                                                        qs f10 = qs.f(f10Var.currentAccount);
                                                                        Object[] objArr = new Object[1];
                                                                        objArr[z13 ? 1 : 0] = Integer.valueOf(z13 ? 1 : 0);
                                                                        f10.k(2, objArr);
                                                                        break;
                                                                    }
                                                                } else {
                                                                    i12++;
                                                                    z12 = false;
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
                            TLRPC.Message message9 = ijVar2.k;
                            if (message9.translatedRichMessage == null || !m10.equals(message9.translatedToLanguage)) {
                                qs.f(this.currentAccount).k(qs.N1, ijVar2);
                                final int i10 = 0;
                                x10 x10Var = new x10(this) { // from class: org.telegram.messenger.v00
                                    public final /* synthetic */ f10 b;

                                    {
                                        this.b = this;
                                    }

                                    @Override // org.telegram.messenger.x10
                                    public final void a(Object obj, Object obj2, Object obj3) {
                                        int i102 = i10;
                                        long j3 = B0;
                                        boolean z11 = z10;
                                        ij ijVar4 = ijVar2;
                                        f10 f10Var = this.b;
                                        switch (i102) {
                                            case 0:
                                                Integer num = (Integer) obj;
                                                TL_iv.RichMessage richMessage = (TL_iv.RichMessage) obj2;
                                                String str2 = (String) obj3;
                                                if (ijVar4.f1() != num.intValue()) {
                                                    a8.d("wtf, asked to translate " + ijVar4.f1() + " rich message but got " + num + "!");
                                                }
                                                TLRPC.Message message92 = ijVar4.k;
                                                message92.translatedToLanguage = str2;
                                                message92.translatedText = null;
                                                message92.translatedVoiceTranscription = null;
                                                message92.translatedPoll = null;
                                                message92.translatedRichMessage = richMessage;
                                                if (z11) {
                                                    f10Var.C(ijVar4);
                                                }
                                                f10Var.getMessagesStorage().X1(j3, ijVar4.k);
                                                qs.f(f10Var.currentAccount).k(128, ijVar4);
                                                ArrayList arrayList = (ArrayList) f10Var.n.R.f(j3);
                                                if (arrayList != null) {
                                                    for (int i11 = 0; i11 < arrayList.size(); i11++) {
                                                        ij ijVar5 = (ij) arrayList.get(i11);
                                                        if (ijVar5 != null && ijVar5.f1() == ijVar4.f1()) {
                                                            TLRPC.Message message10 = ijVar5.k;
                                                            message10.translatedToLanguage = str2;
                                                            message10.translatedRichMessage = richMessage;
                                                            if (ijVar5.h6(false)) {
                                                                qs.f(f10Var.currentAccount).k(2, 0);
                                                                break;
                                                            }
                                                        }
                                                    }
                                                    break;
                                                }
                                                break;
                                            default:
                                                Integer num2 = (Integer) obj;
                                                c10 c10Var3 = (c10) obj2;
                                                String str3 = (String) obj3;
                                                boolean z12 = false;
                                                if (ijVar4.f1() != num2.intValue()) {
                                                    a8.d("wtf, asked to translate " + ijVar4.f1() + " poll but got " + num2 + "!");
                                                }
                                                TLRPC.Message message11 = ijVar4.k;
                                                message11.translatedToLanguage = str3;
                                                message11.translatedText = null;
                                                message11.translatedVoiceTranscription = null;
                                                message11.translatedPoll = c10Var3;
                                                if (z11) {
                                                    f10Var.C(ijVar4);
                                                }
                                                f10Var.getMessagesStorage().X1(j3, ijVar4.k);
                                                qs.f(f10Var.currentAccount).k(128, ijVar4);
                                                ArrayList arrayList2 = (ArrayList) f10Var.n.R.f(j3);
                                                if (arrayList2 != null) {
                                                    int i12 = 0;
                                                    while (i12 < arrayList2.size()) {
                                                        ij ijVar6 = (ij) arrayList2.get(i12);
                                                        if (ijVar6 != null && ijVar6.f1() == ijVar4.f1()) {
                                                            TLRPC.Message message12 = ijVar6.k;
                                                            message12.translatedToLanguage = str3;
                                                            message12.translatedText = null;
                                                            message12.translatedVoiceTranscription = null;
                                                            message12.translatedPoll = c10Var3;
                                                            boolean z13 = z12;
                                                            if (ijVar6.h6(z13)) {
                                                                qs f10 = qs.f(f10Var.currentAccount);
                                                                Object[] objArr = new Object[1];
                                                                objArr[z13 ? 1 : 0] = Integer.valueOf(z13 ? 1 : 0);
                                                                f10.k(2, objArr);
                                                                break;
                                                            }
                                                        } else {
                                                            i12++;
                                                            z12 = false;
                                                        }
                                                    }
                                                    break;
                                                }
                                                break;
                                        }
                                    }
                                };
                                if (ijVar2.k == null || ijVar2.f1() < 0) {
                                    return;
                                }
                                TLRPC.Message message10 = ijVar2.k;
                                if (message10.rich_message == null) {
                                    return;
                                }
                                long B03 = ij.B0(message10);
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
                                            a10Var = new a10();
                                            arrayList.add(a10Var);
                                        } else {
                                            a10Var = (a10) arrayList.get(arrayList.size() - 1);
                                        }
                                        if (a10Var.b.contains(Integer.valueOf(ijVar2.f1()))) {
                                            return;
                                        }
                                        if (a10Var.b.size() + 1 >= 20) {
                                            g0.r(a10Var.a);
                                            g0.h3(a10Var.a);
                                            a10Var = new a10();
                                            arrayList.add(a10Var);
                                        }
                                        hr hrVar = a10Var.a;
                                        if (hrVar != null) {
                                            g0.r(hrVar);
                                        }
                                        this.x.add(Integer.valueOf(ijVar2.f1()));
                                        a10Var.b.add(Integer.valueOf(ijVar2.f1()));
                                        a8.b("pending translation +" + ijVar2.f1() + " rich message");
                                        a10Var.c.add(x10Var);
                                        a10Var.d = m10;
                                        a10 a10Var2 = a10Var;
                                        hr hrVar2 = new hr(this, B03, a10Var2, 7);
                                        a10Var2.a = hrVar2;
                                        g0.i3(hrVar2, a10Var2.e);
                                        a10Var2.e /= 2;
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
                ijVar2 = ijVar;
                if (z9) {
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
                        int i7 = 0;
                        while (i7 < size) {
                            Object obj = arrayList.get(i7);
                            i7++;
                            b10 b10Var = (b10) obj;
                            g0.r(b10Var.a);
                            if (b10Var.h != -1) {
                                getConnectionsManager().cancelRequest(b10Var.h, true);
                                ArrayList arrayList2 = b10Var.b;
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
                for (ArrayList arrayList3 : this.E.values()) {
                    if (arrayList3 != null) {
                        int size3 = arrayList3.size();
                        int i11 = 0;
                        while (i11 < size3) {
                            Object obj3 = arrayList3.get(i11);
                            i11++;
                            b10 b10Var2 = (b10) obj3;
                            g0.r(b10Var2.a);
                            if (b10Var2.h != -1) {
                                getConnectionsManager().cancelRequest(b10Var2.h, true);
                                ArrayList arrayList4 = b10Var2.b;
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
                for (ArrayList arrayList5 : this.G.values()) {
                    if (arrayList5 != null) {
                        int size5 = arrayList5.size();
                        int i13 = 0;
                        while (i13 < size5) {
                            Object obj5 = arrayList5.get(i13);
                            i13++;
                            z00 z00Var = (z00) obj5;
                            g0.r(z00Var.a);
                            if (z00Var.h != -1) {
                                getConnectionsManager().cancelRequest(z00Var.h, true);
                                ArrayList arrayList6 = z00Var.b;
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
                for (ArrayList arrayList7 : this.H.values()) {
                    if (arrayList7 != null) {
                        int size7 = arrayList7.size();
                        int i15 = 0;
                        while (i15 < size7) {
                            Object obj7 = arrayList7.get(i15);
                            i15++;
                            a10 a10Var = (a10) obj7;
                            g0.r(a10Var.a);
                            if (a10Var.f != -1) {
                                getConnectionsManager().cancelRequest(a10Var.f, true);
                                ArrayList arrayList8 = a10Var.b;
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
        qp.s1(this.currentAccount).e7.edit().remove("translating_dialog_languages2").remove("hidden_translation_at").apply();
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

    public final void k(ij ijVar, bi.ya yaVar) {
        TLRPC.Message message = ijVar.k;
        if (message == null || TextUtils.isEmpty(message.message)) {
            return;
        }
        if (!TextUtils.isEmpty(ijVar.k.originalLanguage)) {
            yaVar.a(ijVar.k.originalLanguage);
            return;
        }
        f3.s sVar = new f3.s(ijVar);
        HashSet hashSet = this.K;
        if (hashSet.contains(sVar)) {
            return;
        }
        hashSet.add(sVar);
        b6.d(ijVar.k.message, new l00(this, ijVar, sVar, yaVar), new l00(this, ijVar, sVar, yaVar), false);
    }

    public final void l(TL_stories.StoryItem storyItem) {
        String str;
        if (storyItem == null || storyItem.detectedLng != null || (str = storyItem.caption) == null || str.length() == 0) {
            return;
        }
        d10 d10Var = new d10();
        HashSet hashSet = this.I;
        if (hashSet.contains(d10Var)) {
            return;
        }
        hashSet.add(d10Var);
        b6.d(storyItem.caption, new s00(this, storyItem, d10Var), new s00(this, storyItem, d10Var), false);
    }

    public final String m(long j3) {
        String str = (String) this.d.get(Long.valueOf(j3));
        if (str == null && ((str = e21.M0()) == null || str.equals((String) this.e.get(Long.valueOf(j3))))) {
            str = j();
        }
        return "nb".equals(str) ? "no" : str;
    }

    public final void p(ij ijVar) {
        TLRPC.Message message = ijVar.k;
        if (message == null) {
            return;
        }
        long B0 = ij.B0(message);
        if (v(B0)) {
            TLRPC.Message message2 = ijVar.k;
            message2.translatedToLanguage = null;
            message2.translatedText = null;
            message2.translatedVoiceTranscription = null;
            message2.translatedPoll = null;
            message2.summaryText = null;
            message2.translatedSummaryText = null;
            message2.translatedSummaryLanguage = null;
            getMessagesStorage().X1(B0, ijVar.k);
            g0.h3(new a4(this, ijVar, B0, 8));
        }
    }

    public final boolean q(long j3) {
        TLRPC.Chat M0;
        return t(j3) && (M0 = getMessagesController().M0(Long.valueOf(-j3))) != null && M0.autotranslation;
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
            this.s = Boolean.valueOf(this.n.e7.getBoolean("translate_button", qp.e1().getBoolean("translate_button", false)));
        }
        return this.s.booleanValue();
    }

    public final boolean t(long j3) {
        return this.b.contains(Long.valueOf(j3)) && v(j3) && !m5.C(j3) && getUserConfig().e() != j3;
    }

    public final boolean u() {
        return r() && p10.i(this.currentAccount).q();
    }

    public final boolean v(long j3) {
        if (!r()) {
            return false;
        }
        TLRPC.Chat M0 = getMessagesController().M0(Long.valueOf(-j3));
        if (p10.i(this.currentAccount).q()) {
            return true;
        }
        return M0 != null && M0.autotranslation;
    }

    public final boolean w(String str) {
        if (getUserConfig().q()) {
            return qy0.d0().contains(str);
        }
        try {
            return TextUtils.equals(hd.E0().B.f, str);
        } catch (Exception unused) {
            return false;
        }
    }

    public final boolean z(long j3) {
        if (this.h.contains(Long.valueOf(j3))) {
            return true;
        }
        TLRPC.ChatFull N0 = getMessagesController().N0(-j3);
        if (N0 != null) {
            return N0.translations_disabled;
        }
        TLRPC.UserFull b22 = getMessagesController().b2(j3);
        if (b22 != null) {
            return b22.translations_disabled;
        }
        return false;
    }
}
