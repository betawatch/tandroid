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
import org.telegram.ui.Components.p21;
import org.telegram.ui.oy0;
import org.telegram.ui.wn0;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final class c10 extends c1 {
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
    public final np n;
    public Boolean r;
    public Boolean s;
    public final ArrayList w;
    public final HashSet x;
    public final HashSet y;

    public c10(np npVar) {
        super(npVar.currentAccount);
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
        this.n = npVar;
        g0.i3(new as(this, 17), 150L);
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
            List list = O;
            if (i7 >= list.size()) {
                break;
            }
            v00 v00Var = new v00();
            String str = (String) list.get(i7);
            v00Var.a = str;
            if ("no".equals(str)) {
                v00Var.a = "nb";
            }
            v00Var.b = p21.K0(p21.O0(v00Var.a, null, null));
            v00Var.c = p21.K0(p21.W0(v00Var.a, true));
            if (v00Var.b != null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(v00Var.b);
                sb2.append(" ");
                String str2 = v00Var.c;
                if (str2 == null) {
                    str2 = "";
                }
                sb2.append(str2);
                v00Var.d = sb2.toString().toLowerCase();
                arrayList.add(v00Var);
            }
            i7++;
        }
        if (Build.VERSION.SDK_INT >= 24) {
            Collections.sort(arrayList, new k00(Collator.getInstance(Locale.getDefault()), 0));
            return arrayList;
        }
        Collections.sort(arrayList, Comparator$-CC.comparing(new aa.l(7)));
        return arrayList;
    }

    public static ArrayList o(String str) {
        ArrayList arrayList = new ArrayList();
        if (P == null) {
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
                linkedHashSet.addAll(oy0.d0());
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
                            if (p21.O0(locale, null, null) != null) {
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
                    v00 v00Var = new v00();
                    v00Var.a = str2;
                    if ("no".equals(str2)) {
                        v00Var.a = "nb";
                    }
                    v00Var.b = p21.K0(p21.O0(v00Var.a, null, null));
                    v00Var.c = p21.K0(p21.W0(v00Var.a, true));
                    if (v00Var.b != null) {
                        v00Var.d = (v00Var.b + " " + v00Var.c).toLowerCase();
                        arrayList.add(v00Var);
                    }
                }
            }
        }
        return arrayList;
    }

    public static boolean x(gj gjVar) {
        TLRPC.Message message;
        if (gjVar == null || (message = gjVar.k) == null || message.summary_from_language == null || gjVar.P3() || gjVar.G0 || gjVar.r4()) {
            return false;
        }
        int i7 = gjVar.D;
        return (i7 == 0 || i7 == 3 || i7 == 1 || i7 == 9 || i7 == 14 || i7 == 17) && !TextUtils.isEmpty(gjVar.k.message) && gjVar.k.message.length() > 100;
    }

    public static boolean y(gj gjVar) {
        if (gjVar == null || gjVar.k == null || gjVar.P3() || gjVar.G0 || gjVar.r4() || (gj.m1(gjVar) instanceof TLRPC.TL_messageMediaWidget)) {
            return false;
        }
        int i7 = gjVar.D;
        if (i7 != 0 && i7 != 3 && i7 != 1 && i7 != 2 && i7 != 5 && i7 != 9 && i7 != 14 && i7 != 17 && i7 != 36) {
            return false;
        }
        if (TextUtils.isEmpty(gjVar.k.message) && !(gj.m1(gjVar) instanceof TLRPC.TL_messageMediaPoll)) {
            TLRPC.Message message = gjVar.k;
            if (message.rich_message == null && (!message.voiceTranscriptionOpen || TextUtils.isEmpty(message.voiceTranscription) || !gjVar.k.voiceTranscriptionFinal)) {
                return false;
            }
        }
        return true;
    }

    public final boolean A(gj gjVar) {
        TLRPC.Message message;
        boolean z10 = true;
        if (gjVar != null && (message = gjVar.k) != null && message.summarizedOpen) {
            return this.G.contains(Integer.valueOf(Objects.hash(Long.valueOf(gj.B0(message)), Integer.valueOf(gjVar.e1()), Integer.valueOf(B(gj.B0(gjVar.k)) ? 1 : 0))));
        }
        synchronized (this) {
            if (gjVar != null) {
                try {
                    TLRPC.Message message2 = gjVar.k;
                    if (message2 != null) {
                        if (((message2.voiceTranscriptionOpen && message2.voiceTranscriptionFinal) ? this.y : this.x).contains(Integer.valueOf(gjVar.e1())) && B(gj.B0(gjVar.k))) {
                        }
                    }
                } finally {
                }
            }
            z10 = false;
        }
        return z10;
    }

    public final boolean B(long j3) {
        if (v(j3)) {
            return ((Boolean) this.a.get(j3, Boolean.valueOf(q(j3)))).booleanValue();
        }
        return false;
    }

    public final void C(gj gjVar) {
        Long valueOf = Long.valueOf(gj.B0(gjVar.k));
        HashMap hashMap = this.f;
        HashMap hashMap2 = (HashMap) hashMap.get(valueOf);
        if (hashMap2 == null) {
            Long valueOf2 = Long.valueOf(gj.B0(gjVar.k));
            HashMap hashMap3 = new HashMap();
            hashMap.put(valueOf2, hashMap3);
            hashMap2 = hashMap3;
        }
        hashMap2.put(Integer.valueOf(gjVar.e1()), gjVar);
    }

    public final void E(gj gjVar, String str, s00 s00Var) {
        Throwable th2;
        w00 w00Var;
        if (gjVar.e1() >= 0) {
            long B0 = gj.B0(gjVar.k);
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
                            w00Var = new w00();
                            arrayList.add(w00Var);
                        } else {
                            w00Var = (w00) arrayList.get(arrayList.size() - 1);
                        }
                        if (w00Var.b.contains(Integer.valueOf(gjVar.e1()))) {
                            return;
                        }
                        TLRPC.MessageMedia m12 = gj.m1(gjVar);
                        if (m12 instanceof TLRPC.TL_messageMediaPoll) {
                            z00 a10 = z00.a((TLRPC.TL_messageMediaPoll) m12);
                            z00 z00Var = gjVar.k.translatedPoll;
                            TLRPC.TL_textWithEntities tL_textWithEntities = a10.a;
                            int length = tL_textWithEntities != null ? tL_textWithEntities.text.length() : 0;
                            for (int i7 = 0; i7 < a10.b.size(); i7++) {
                                length += ((TLRPC.PollAnswer) a10.b.get(i7)).text.text.length();
                            }
                            TLRPC.TL_textWithEntities tL_textWithEntities2 = a10.c;
                            if (tL_textWithEntities2 != null) {
                                length += tL_textWithEntities2.text.length();
                            }
                            if (w00Var.g + length >= 25000 || w00Var.b.size() + 1 >= 20) {
                                g0.r(w00Var.a);
                                g0.h3(w00Var.a);
                                w00Var = new w00();
                                arrayList.add(w00Var);
                            }
                            dr drVar = w00Var.a;
                            if (drVar != null) {
                                g0.r(drVar);
                            }
                            this.x.add(Integer.valueOf(gjVar.e1()));
                            w00Var.b.add(Integer.valueOf(gjVar.e1()));
                            a8.b("pending translation +" + gjVar.e1() + " poll message");
                            w00Var.c.add(new Pair(a10, z00Var));
                            w00Var.d.add(s00Var);
                            w00Var.e = str;
                            w00Var.g = w00Var.g + length;
                            w00 w00Var2 = w00Var;
                            dr drVar2 = new dr(this, B0, w00Var2, 8);
                            w00Var2.a = drVar2;
                            g0.i3(drVar2, w00Var2.f);
                            w00Var2.f /= 2;
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

    public final void F(gj gjVar, String str, z10 z10Var) {
        int i7 = 1;
        int hash = Objects.hash(Long.valueOf(gj.B0(gjVar.k)), Integer.valueOf(gjVar.e1()), Integer.valueOf(str != null ? 1 : 0));
        Integer valueOf = Integer.valueOf(hash);
        HashSet hashSet = this.G;
        if (hashSet.contains(valueOf)) {
            return;
        }
        hashSet.add(Integer.valueOf(hash));
        TLRPC.TL_messages_summarizeText tL_messages_summarizeText = new TLRPC.TL_messages_summarizeText();
        tL_messages_summarizeText.peer = np.s1(this.currentAccount).j1(gj.B0(gjVar.k));
        tL_messages_summarizeText.id = gjVar.e1();
        if (str != null) {
            tL_messages_summarizeText.flags |= 1;
            tL_messages_summarizeText.to_lang = D(str);
        }
        ConnectionsManager.getInstance(this.currentAccount).sendRequestTyped(tL_messages_summarizeText, new d3.b(i7), new et(this, hash, z10Var));
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x00f6 A[Catch: all -> 0x006f, TryCatch #0 {all -> 0x006f, blocks: (B:25:0x0055, B:27:0x0061, B:28:0x0072, B:30:0x0078, B:31:0x008c, B:33:0x009c, B:37:0x00a0, B:40:0x00ca, B:42:0x00d1, B:46:0x00f2, B:48:0x00f6, B:49:0x00f9, B:50:0x0152, B:52:0x00df, B:53:0x00a7, B:54:0x00ac, B:56:0x00b0, B:58:0x00b4, B:59:0x00b9, B:61:0x00bd, B:62:0x00c2, B:64:0x00c6, B:65:0x0081), top: B:24:0x0055 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void G(gj gjVar, String str, u00 u00Var) {
        y00 y00Var;
        String str2;
        z3 z3Var;
        if (gjVar.k == null || gjVar.e1() < 0) {
            return;
        }
        TLRPC.Message message = gjVar.k;
        int i7 = 0;
        boolean z10 = message.voiceTranscription != null && message.voiceTranscriptionFinal && message.voiceTranscriptionOpen;
        long B0 = gj.B0(message);
        HashMap hashMap = z10 ? this.F : this.E;
        HashSet hashSet = z10 ? this.y : this.x;
        TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
        if (z10) {
            String str3 = gjVar.k.voiceTranscription;
            tL_textWithEntities.text = str3;
            if (TextUtils.isEmpty(str3)) {
                return;
            }
        } else {
            TLRPC.Message message2 = gjVar.k;
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
                    y00Var = new y00();
                    arrayList.add(y00Var);
                } else {
                    y00Var = (y00) arrayList.get(arrayList.size() - 1);
                }
                if (y00Var.b.contains(Integer.valueOf(gjVar.e1()))) {
                    return;
                }
                if (z10) {
                    String str4 = gjVar.k.voiceTranscription;
                    if (str4 != null) {
                        i7 = str4.length();
                    }
                } else {
                    TLRPC.Message message3 = gjVar.k;
                    if (message3 == null || (str2 = message3.message) == null) {
                        CharSequence charSequence = gjVar.z;
                        if (charSequence != null) {
                            i7 = charSequence.length();
                        } else {
                            CharSequence charSequence2 = gjVar.v;
                            if (charSequence2 != null) {
                                i7 = charSequence2.length();
                            }
                        }
                    } else {
                        i7 = str2.length();
                    }
                }
                if (y00Var.g + i7 < 25000) {
                    if (y00Var.b.size() + 1 >= 20) {
                    }
                    y00 y00Var2 = y00Var;
                    z3Var = y00Var2.a;
                    if (z3Var != null) {
                        g0.r(z3Var);
                    }
                    hashSet.add(Integer.valueOf(gjVar.e1()));
                    y00Var2.b.add(Integer.valueOf(gjVar.e1()));
                    a8.b("pending translation +" + gjVar.e1() + " message");
                    y00Var2.c.add(tL_textWithEntities);
                    y00Var2.d.add(u00Var);
                    y00Var2.e = str;
                    y00Var2.g += i7;
                    z3 z3Var2 = new z3(this, hashMap, B0, y00Var2, z10, hashSet);
                    y00Var2.a = z3Var2;
                    g0.i3(z3Var2, y00Var2.f);
                    y00Var2.f /= 2;
                }
                g0.r(y00Var.a);
                g0.h3(y00Var.a);
                y00Var = new y00();
                arrayList.add(y00Var);
                y00 y00Var22 = y00Var;
                z3Var = y00Var22.a;
                if (z3Var != null) {
                }
                hashSet.add(Integer.valueOf(gjVar.e1()));
                y00Var22.b.add(Integer.valueOf(gjVar.e1()));
                a8.b("pending translation +" + gjVar.e1() + " message");
                y00Var22.c.add(tL_textWithEntities);
                y00Var22.d.add(u00Var);
                y00Var22.e = str;
                y00Var22.g += i7;
                z3 z3Var22 = new z3(this, hashMap, B0, y00Var22, z10, hashSet);
                y00Var22.a = z3Var22;
                g0.i3(z3Var22, y00Var22.f);
                y00Var22.f /= 2;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void H() {
        StringBuilder sb2 = new StringBuilder();
        boolean z10 = true;
        int i7 = 0;
        while (true) {
            LongSparseArray longSparseArray = this.a;
            if (i7 >= longSparseArray.size()) {
                break;
            }
            try {
                long keyAt = longSparseArray.keyAt(i7);
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
        np.s1(this.currentAccount).f7.edit().putString("translating_dialog_languages2", sb2.toString()).putStringSet("hidden_translation_at", hashSet).apply();
    }

    public final void I(long j3, String str) {
        c10 c10Var;
        long j10;
        String str2;
        Boolean bool;
        if (TextUtils.equals(m(j3), str)) {
            return;
        }
        if (B(j3)) {
            c10Var = this;
            j10 = j3;
            str2 = str;
            g0.i3(new a4(c10Var, j10, str2, 9), 150L);
        } else {
            c10Var = this;
            j10 = j3;
            str2 = str;
            synchronized (this) {
                c10Var.d.put(Long.valueOf(j10), str2);
            }
        }
        c(j10);
        synchronized (this) {
            LongSparseArray longSparseArray = c10Var.a;
            bool = Boolean.FALSE;
            longSparseArray.put(j10, bool);
        }
        ns.f(c10Var.currentAccount).k(ns.P1, Long.valueOf(j10), bool);
        p21.T0(str2);
    }

    public final void J(long j3, boolean z10, boolean z11) {
        TLRPC.TL_messages_togglePeerTranslations tL_messages_togglePeerTranslations = new TLRPC.TL_messages_togglePeerTranslations();
        tL_messages_togglePeerTranslations.peer = getMessagesController().j1(j3);
        tL_messages_togglePeerTranslations.disabled = z10;
        getConnectionsManager().sendRequest(tL_messages_togglePeerTranslations, null);
        TLRPC.ChatFull N0 = getMessagesController().N0(-j3);
        if (N0 != null) {
            N0.translations_disabled = z10;
            getMessagesStorage().N1(N0, true);
        }
        TLRPC.UserFull b22 = getMessagesController().b2(j3);
        if (b22 != null) {
            b22.translations_disabled = z10;
            getMessagesStorage().j2(b22, true);
        }
        synchronized (this) {
            try {
                if (z10) {
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
        if (z11) {
            return;
        }
        ns.f(this.currentAccount).k(ns.P1, Long.valueOf(j3), Boolean.valueOf(B(j3)));
    }

    public final boolean K(long j3, boolean z10) {
        boolean B = B(j3);
        int i7 = ns.P1;
        boolean z11 = true;
        LongSparseArray longSparseArray = this.a;
        if (z10 && !B) {
            Boolean bool = Boolean.TRUE;
            longSparseArray.put(j3, bool);
            ns.f(this.currentAccount).k(i7, Long.valueOf(j3), bool);
        } else if (z10 || !B) {
            z11 = false;
        } else {
            Boolean bool2 = Boolean.FALSE;
            longSparseArray.put(j3, bool2);
            ns.f(this.currentAccount).k(i7, Long.valueOf(j3), bool2);
            c(j3);
        }
        H();
        return z11;
    }

    public final void L(gj gjVar, wn0 wn0Var) {
        if (gjVar == null || gjVar.k == null) {
            return;
        }
        f3.s sVar = new f3.s(gjVar);
        String M0 = p21.M0();
        TLRPC.Message message = gjVar.k;
        if (message.translatedText != null && TextUtils.equals(message.translatedToLanguage, M0)) {
            wn0Var.run();
            return;
        }
        HashSet hashSet = this.M;
        if (hashSet.contains(sVar)) {
            wn0Var.run();
            return;
        }
        hashSet.add(sVar);
        TLRPC.TL_messages_translateText tL_messages_translateText = new TLRPC.TL_messages_translateText();
        tL_messages_translateText.flags |= 2;
        TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
        TLRPC.Message message2 = gjVar.k;
        tL_textWithEntities.text = message2.message;
        ArrayList<TLRPC.MessageEntity> arrayList = message2.entities;
        tL_textWithEntities.entities = arrayList;
        if (arrayList == null) {
            tL_textWithEntities.entities = new ArrayList<>();
        }
        tL_messages_translateText.text.add(tL_textWithEntities);
        tL_messages_translateText.to_lang = D(M0);
        getConnectionsManager().sendRequest(tL_messages_translateText, new jm(this, gjVar, M0, sVar, wn0Var, System.currentTimeMillis(), tL_textWithEntities));
    }

    public final void M(long j3) {
        boolean z10;
        if (v(j3) && t(j3)) {
            boolean contains = this.h.contains(Long.valueOf(j3));
            TLRPC.ChatFull N0 = getMessagesController().N0(-j3);
            if (N0 != null) {
                z10 = N0.translations_disabled;
            } else {
                TLRPC.UserFull b22 = getMessagesController().b2(j3);
                z10 = b22 != null ? b22.translations_disabled : false;
            }
            synchronized (this) {
                try {
                    if (z10) {
                        this.h.add(Long.valueOf(j3));
                        this.a.remove(j3);
                    } else {
                        this.h.remove(Long.valueOf(j3));
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (contains != z10) {
                H();
                ns.f(this.currentAccount).k(ns.P1, Long.valueOf(j3), Boolean.valueOf(B(j3)));
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0025, code lost:
    
        if (android.text.TextUtils.equals(r0.translatedToLanguage, org.telegram.ui.Components.p21.M0()) != false) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean b(gj gjVar, String str) {
        String str2;
        TLRPC.Message message = gjVar.k;
        if (message != null && (str2 = message.originalLanguage) != null) {
            str = str2;
        }
        if (message == null || TextUtils.isEmpty(message.message)) {
            return false;
        }
        if (str == null) {
            TLRPC.Message message2 = gjVar.k;
            if (message2.translatedText != null) {
            }
        }
        if (str == null || w(gjVar.k.originalLanguage)) {
            return false;
        }
        return !gjVar.L2;
    }

    public final void c(long j3) {
        synchronized (this) {
            try {
                ArrayList arrayList = (ArrayList) this.E.get(Long.valueOf(j3));
                if (arrayList != null) {
                    int size = arrayList.size();
                    int i7 = 0;
                    while (i7 < size) {
                        Object obj = arrayList.get(i7);
                        i7++;
                        y00 y00Var = (y00) obj;
                        g0.r(y00Var.a);
                        if (y00Var.h != -1) {
                            getConnectionsManager().cancelRequest(y00Var.h, true);
                            ArrayList arrayList2 = y00Var.b;
                            int size2 = arrayList2.size();
                            int i10 = 0;
                            while (i10 < size2) {
                                Object obj2 = arrayList2.get(i10);
                                i10++;
                                this.x.remove((Integer) obj2);
                            }
                        }
                    }
                    this.E.remove(Long.valueOf(j3));
                }
                ArrayList arrayList3 = (ArrayList) this.F.get(Long.valueOf(j3));
                if (arrayList3 != null) {
                    int size3 = arrayList3.size();
                    int i11 = 0;
                    while (i11 < size3) {
                        Object obj3 = arrayList3.get(i11);
                        i11++;
                        y00 y00Var2 = (y00) obj3;
                        g0.r(y00Var2.a);
                        if (y00Var2.h != -1) {
                            getConnectionsManager().cancelRequest(y00Var2.h, true);
                            ArrayList arrayList4 = y00Var2.b;
                            int size4 = arrayList4.size();
                            int i12 = 0;
                            while (i12 < size4) {
                                Object obj4 = arrayList4.get(i12);
                                i12++;
                                this.y.remove((Integer) obj4);
                            }
                        }
                    }
                    this.F.remove(Long.valueOf(j3));
                }
                ArrayList arrayList5 = (ArrayList) this.H.get(Long.valueOf(j3));
                if (arrayList5 != null) {
                    int size5 = arrayList5.size();
                    int i13 = 0;
                    while (i13 < size5) {
                        Object obj5 = arrayList5.get(i13);
                        i13++;
                        w00 w00Var = (w00) obj5;
                        g0.r(w00Var.a);
                        if (w00Var.h != -1) {
                            getConnectionsManager().cancelRequest(w00Var.h, true);
                            ArrayList arrayList6 = w00Var.b;
                            int size6 = arrayList6.size();
                            int i14 = 0;
                            while (i14 < size6) {
                                Object obj6 = arrayList6.get(i14);
                                i14++;
                                this.x.remove((Integer) obj6);
                            }
                        }
                    }
                    this.H.remove(Long.valueOf(j3));
                }
                ArrayList arrayList7 = (ArrayList) this.I.get(Long.valueOf(j3));
                if (arrayList7 != null) {
                    int size7 = arrayList7.size();
                    int i15 = 0;
                    while (i15 < size7) {
                        Object obj7 = arrayList7.get(i15);
                        i15++;
                        x00 x00Var = (x00) obj7;
                        g0.r(x00Var.a);
                        if (x00Var.f != -1) {
                            getConnectionsManager().cancelRequest(x00Var.f, true);
                            ArrayList arrayList8 = x00Var.b;
                            int size8 = arrayList8.size();
                            int i16 = 0;
                            while (i16 < size8) {
                                Object obj8 = arrayList8.get(i16);
                                i16++;
                                this.x.remove((Integer) obj8);
                            }
                        }
                    }
                    this.I.remove(Long.valueOf(j3));
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
            getMessagesStorage().a.c(new l00(this, j3, 1));
        }
    }

    public final void f(gj gjVar) {
        TLRPC.Message message;
        String str;
        String str2;
        if (gjVar == null || (message = gjVar.k) == null) {
            return;
        }
        long B0 = gj.B0(message);
        Long valueOf = Long.valueOf(B0);
        HashMap hashMap = this.c;
        b10 b10Var = (b10) hashMap.get(valueOf);
        if (b10Var == null) {
            Long valueOf2 = Long.valueOf(B0);
            b10 b10Var2 = new b10();
            b10Var2.a = new HashSet();
            b10Var2.b = new HashSet();
            b10Var2.c = new HashSet();
            hashMap.put(valueOf2, b10Var2);
            b10Var = b10Var2;
        }
        HashSet hashSet = b10Var.c;
        HashSet hashSet2 = b10Var.a;
        HashSet hashSet3 = b10Var.b;
        boolean z10 = false;
        boolean z11 = y(gjVar) && ((str2 = gjVar.k.originalLanguage) == null || "und".equals(str2));
        if (y(gjVar) && (str = gjVar.k.originalLanguage) != null && !"und".equals(str) && !w(gjVar.k.originalLanguage)) {
            z10 = true;
        }
        if (z11) {
            hashSet3.add(Integer.valueOf(gjVar.e1()));
        } else {
            (z10 ? hashSet2 : hashSet).add(Integer.valueOf(gjVar.e1()));
        }
        if (!z11) {
            this.e.put(Long.valueOf(B0), gjVar.k.originalLanguage);
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
                g0.i3(new l00(this, B0, 0), 450L);
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
                    ns.f(this.currentAccount).k(ns.P1, l11, Boolean.FALSE);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [org.telegram.messenger.u00] */
    /* JADX WARN: Type inference failed for: r0v14, types: [org.telegram.messenger.s00] */
    public final void h(gj gjVar, boolean z10, final boolean z11) {
        TLRPC.Message message;
        final gj gjVar2;
        z00 z00Var;
        x00 x00Var;
        z00 z00Var2;
        gj gjVar3;
        if (gjVar == null || (message = gjVar.k) == null) {
            return;
        }
        final long B0 = gj.B0(message);
        r2 = null;
        r2 = null;
        String str = null;
        if (z10) {
            TLRPC.Message message2 = gjVar.k;
            if (message2.summarizedOpen && message2.summaryText == null && !B(gj.B0(message2))) {
                F(gjVar, null, new q00(this, gjVar, B0));
            }
        }
        if (v(B0)) {
            if (!z11 && (gjVar3 = gjVar.C) != null) {
                h(gjVar3, z10, true);
            }
            if (y(gjVar)) {
                if (!B(B0)) {
                    TLRPC.Message message3 = gjVar.k;
                    if (message3 != null) {
                        if (!TextUtils.isEmpty(message3.message)) {
                            str = gjVar.k.message;
                        } else if (gjVar.D == 36 && !TextUtils.isEmpty(gjVar.v)) {
                            str = gjVar.v.toString();
                        }
                    }
                    if (!y(gjVar) || gjVar.k == null || TextUtils.isEmpty(str)) {
                        return;
                    }
                    TLRPC.Message message4 = gjVar.k;
                    if (message4.originalLanguage != null) {
                        f(gjVar);
                        return;
                    }
                    long B02 = gj.B0(message4);
                    int hash = Objects.hash(Long.valueOf(gj.B0(gjVar.k)), Integer.valueOf(gjVar.e1()));
                    if (t(B02) || this.w.contains(Integer.valueOf(hash))) {
                        return;
                    }
                    this.w.add(Integer.valueOf(hash));
                    Utilities.d.c(new j00(this, str, gjVar, B02, hash, 0));
                    return;
                }
                if (z(B0)) {
                    return;
                }
                String m10 = m(B0);
                if (!z11 && gjVar.D != 36) {
                    TLRPC.Message message5 = gjVar.k;
                    if ((((message5.voiceTranscriptionOpen && message5.voiceTranscriptionFinal) ? message5.translatedVoiceTranscription : message5.translatedText) == null && message5.translatedPoll == null) || (((z00Var2 = message5.translatedPoll) != null && !z00.b(gjVar, z00Var2)) || !m10.equals(gjVar.k.translatedToLanguage))) {
                        int e12 = gjVar.e1();
                        HashMap hashMap = (HashMap) this.f.get(Long.valueOf(B0));
                        gjVar2 = hashMap != null ? (gj) hashMap.get(Integer.valueOf(e12)) : null;
                        if (gjVar2 != null) {
                            TLRPC.Message message6 = gjVar.k;
                            TLRPC.Message message7 = gjVar2.k;
                            message6.translatedToLanguage = message7.translatedToLanguage;
                            message6.translatedText = message7.translatedText;
                            message6.translatedPoll = message7.translatedPoll;
                            if (z10 || !B(B0)) {
                            }
                            if (gjVar2.D != 36) {
                                TLRPC.Message message8 = gjVar2.k;
                                if (message8.summarizedOpen) {
                                    if (message8.translatedSummaryText == null || !m10.equals(message8.translatedSummaryLanguage)) {
                                        F(gjVar2, m10, new t00(this, gjVar2, m10, B0));
                                        return;
                                    }
                                    return;
                                }
                                if (!(((message8.voiceTranscriptionOpen && message8.voiceTranscriptionFinal) ? message8.translatedVoiceTranscription : message8.translatedText) == null && message8.translatedPoll == null) && (((z00Var = message8.translatedPoll) == null || z00.b(gjVar2, z00Var)) && m10.equals(gjVar2.k.translatedToLanguage))) {
                                    if (z11) {
                                        C(gjVar2);
                                        return;
                                    }
                                    return;
                                } else {
                                    ns.f(this.currentAccount).k(ns.N1, gjVar2);
                                    if (!(gj.m1(gjVar2) instanceof TLRPC.TL_messageMediaPoll)) {
                                        G(gjVar2, m10, new w10() { // from class: org.telegram.messenger.u00
                                            @Override // org.telegram.messenger.w10
                                            public final void a(Object obj, Object obj2, Object obj3, Object obj4) {
                                                Boolean bool = (Boolean) obj;
                                                Integer num = (Integer) obj2;
                                                TLRPC.TL_textWithEntities tL_textWithEntities = (TLRPC.TL_textWithEntities) obj3;
                                                String str2 = (String) obj4;
                                                gj gjVar4 = gjVar2;
                                                if (gjVar4.e1() != num.intValue()) {
                                                    a8.d("wtf, asked to translate " + gjVar4.e1() + " but got " + num + "!");
                                                }
                                                gjVar4.k.translatedToLanguage = str2;
                                                if (bool.booleanValue()) {
                                                    gjVar4.k.translatedVoiceTranscription = tL_textWithEntities;
                                                } else {
                                                    gjVar4.k.translatedText = tL_textWithEntities;
                                                }
                                                gjVar4.k.translatedPoll = null;
                                                c10 c10Var = c10.this;
                                                if (z11) {
                                                    c10Var.C(gjVar4);
                                                }
                                                vr messagesStorage = c10Var.getMessagesStorage();
                                                TLRPC.Message message9 = gjVar4.k;
                                                long j3 = B0;
                                                messagesStorage.X1(j3, message9);
                                                ns.f(c10Var.currentAccount).k(ns.M1, gjVar4);
                                                ArrayList arrayList = (ArrayList) c10Var.n.S.f(j3);
                                                if (arrayList != null) {
                                                    for (int i7 = 0; i7 < arrayList.size(); i7++) {
                                                        gj gjVar5 = (gj) arrayList.get(i7);
                                                        if (gjVar5 != null && gjVar5.e1() == gjVar4.e1()) {
                                                            gjVar5.k.translatedToLanguage = str2;
                                                            if (bool.booleanValue()) {
                                                                gjVar5.k.translatedVoiceTranscription = tL_textWithEntities;
                                                            } else {
                                                                gjVar5.k.translatedText = tL_textWithEntities;
                                                            }
                                                            gjVar5.k.translatedPoll = null;
                                                            if (gjVar5.g6(false)) {
                                                                ns.f(c10Var.currentAccount).k(ns.r, 0);
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
                                        E(gjVar2, m10, new u10(this) { // from class: org.telegram.messenger.s00
                                            public final /* synthetic */ c10 b;

                                            {
                                                this.b = this;
                                            }

                                            @Override // org.telegram.messenger.u10
                                            public final void a(Object obj, Object obj2, Object obj3) {
                                                int i10 = i7;
                                                long j3 = B0;
                                                boolean z12 = z11;
                                                gj gjVar4 = gjVar2;
                                                c10 c10Var = this.b;
                                                switch (i10) {
                                                    case 0:
                                                        Integer num = (Integer) obj;
                                                        TL_iv.RichMessage richMessage = (TL_iv.RichMessage) obj2;
                                                        String str2 = (String) obj3;
                                                        if (gjVar4.e1() != num.intValue()) {
                                                            a8.d("wtf, asked to translate " + gjVar4.e1() + " rich message but got " + num + "!");
                                                        }
                                                        TLRPC.Message message9 = gjVar4.k;
                                                        message9.translatedToLanguage = str2;
                                                        message9.translatedText = null;
                                                        message9.translatedVoiceTranscription = null;
                                                        message9.translatedPoll = null;
                                                        message9.translatedRichMessage = richMessage;
                                                        if (z12) {
                                                            c10Var.C(gjVar4);
                                                        }
                                                        c10Var.getMessagesStorage().X1(j3, gjVar4.k);
                                                        ns.f(c10Var.currentAccount).k(128, gjVar4);
                                                        ArrayList arrayList = (ArrayList) c10Var.n.S.f(j3);
                                                        if (arrayList != null) {
                                                            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                                                                gj gjVar5 = (gj) arrayList.get(i11);
                                                                if (gjVar5 != null && gjVar5.e1() == gjVar4.e1()) {
                                                                    TLRPC.Message message10 = gjVar5.k;
                                                                    message10.translatedToLanguage = str2;
                                                                    message10.translatedRichMessage = richMessage;
                                                                    if (gjVar5.g6(false)) {
                                                                        ns.f(c10Var.currentAccount).k(2, 0);
                                                                        break;
                                                                    }
                                                                }
                                                            }
                                                            break;
                                                        }
                                                        break;
                                                    default:
                                                        Integer num2 = (Integer) obj;
                                                        z00 z00Var3 = (z00) obj2;
                                                        String str3 = (String) obj3;
                                                        boolean z13 = false;
                                                        if (gjVar4.e1() != num2.intValue()) {
                                                            a8.d("wtf, asked to translate " + gjVar4.e1() + " poll but got " + num2 + "!");
                                                        }
                                                        TLRPC.Message message11 = gjVar4.k;
                                                        message11.translatedToLanguage = str3;
                                                        message11.translatedText = null;
                                                        message11.translatedVoiceTranscription = null;
                                                        message11.translatedPoll = z00Var3;
                                                        if (z12) {
                                                            c10Var.C(gjVar4);
                                                        }
                                                        c10Var.getMessagesStorage().X1(j3, gjVar4.k);
                                                        ns.f(c10Var.currentAccount).k(128, gjVar4);
                                                        ArrayList arrayList2 = (ArrayList) c10Var.n.S.f(j3);
                                                        if (arrayList2 != null) {
                                                            int i12 = 0;
                                                            while (i12 < arrayList2.size()) {
                                                                gj gjVar6 = (gj) arrayList2.get(i12);
                                                                if (gjVar6 != null && gjVar6.e1() == gjVar4.e1()) {
                                                                    TLRPC.Message message12 = gjVar6.k;
                                                                    message12.translatedToLanguage = str3;
                                                                    message12.translatedText = null;
                                                                    message12.translatedVoiceTranscription = null;
                                                                    message12.translatedPoll = z00Var3;
                                                                    boolean z14 = z13;
                                                                    if (gjVar6.g6(z14)) {
                                                                        ns f10 = ns.f(c10Var.currentAccount);
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
                            TLRPC.Message message9 = gjVar2.k;
                            if (message9.translatedRichMessage == null || !m10.equals(message9.translatedToLanguage)) {
                                ns.f(this.currentAccount).k(ns.N1, gjVar2);
                                final int i10 = 0;
                                u10 u10Var = new u10(this) { // from class: org.telegram.messenger.s00
                                    public final /* synthetic */ c10 b;

                                    {
                                        this.b = this;
                                    }

                                    @Override // org.telegram.messenger.u10
                                    public final void a(Object obj, Object obj2, Object obj3) {
                                        int i102 = i10;
                                        long j3 = B0;
                                        boolean z12 = z11;
                                        gj gjVar4 = gjVar2;
                                        c10 c10Var = this.b;
                                        switch (i102) {
                                            case 0:
                                                Integer num = (Integer) obj;
                                                TL_iv.RichMessage richMessage = (TL_iv.RichMessage) obj2;
                                                String str2 = (String) obj3;
                                                if (gjVar4.e1() != num.intValue()) {
                                                    a8.d("wtf, asked to translate " + gjVar4.e1() + " rich message but got " + num + "!");
                                                }
                                                TLRPC.Message message92 = gjVar4.k;
                                                message92.translatedToLanguage = str2;
                                                message92.translatedText = null;
                                                message92.translatedVoiceTranscription = null;
                                                message92.translatedPoll = null;
                                                message92.translatedRichMessage = richMessage;
                                                if (z12) {
                                                    c10Var.C(gjVar4);
                                                }
                                                c10Var.getMessagesStorage().X1(j3, gjVar4.k);
                                                ns.f(c10Var.currentAccount).k(128, gjVar4);
                                                ArrayList arrayList = (ArrayList) c10Var.n.S.f(j3);
                                                if (arrayList != null) {
                                                    for (int i11 = 0; i11 < arrayList.size(); i11++) {
                                                        gj gjVar5 = (gj) arrayList.get(i11);
                                                        if (gjVar5 != null && gjVar5.e1() == gjVar4.e1()) {
                                                            TLRPC.Message message10 = gjVar5.k;
                                                            message10.translatedToLanguage = str2;
                                                            message10.translatedRichMessage = richMessage;
                                                            if (gjVar5.g6(false)) {
                                                                ns.f(c10Var.currentAccount).k(2, 0);
                                                                break;
                                                            }
                                                        }
                                                    }
                                                    break;
                                                }
                                                break;
                                            default:
                                                Integer num2 = (Integer) obj;
                                                z00 z00Var3 = (z00) obj2;
                                                String str3 = (String) obj3;
                                                boolean z13 = false;
                                                if (gjVar4.e1() != num2.intValue()) {
                                                    a8.d("wtf, asked to translate " + gjVar4.e1() + " poll but got " + num2 + "!");
                                                }
                                                TLRPC.Message message11 = gjVar4.k;
                                                message11.translatedToLanguage = str3;
                                                message11.translatedText = null;
                                                message11.translatedVoiceTranscription = null;
                                                message11.translatedPoll = z00Var3;
                                                if (z12) {
                                                    c10Var.C(gjVar4);
                                                }
                                                c10Var.getMessagesStorage().X1(j3, gjVar4.k);
                                                ns.f(c10Var.currentAccount).k(128, gjVar4);
                                                ArrayList arrayList2 = (ArrayList) c10Var.n.S.f(j3);
                                                if (arrayList2 != null) {
                                                    int i12 = 0;
                                                    while (i12 < arrayList2.size()) {
                                                        gj gjVar6 = (gj) arrayList2.get(i12);
                                                        if (gjVar6 != null && gjVar6.e1() == gjVar4.e1()) {
                                                            TLRPC.Message message12 = gjVar6.k;
                                                            message12.translatedToLanguage = str3;
                                                            message12.translatedText = null;
                                                            message12.translatedVoiceTranscription = null;
                                                            message12.translatedPoll = z00Var3;
                                                            boolean z14 = z13;
                                                            if (gjVar6.g6(z14)) {
                                                                ns f10 = ns.f(c10Var.currentAccount);
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
                                if (gjVar2.k == null || gjVar2.e1() < 0) {
                                    return;
                                }
                                TLRPC.Message message10 = gjVar2.k;
                                if (message10.rich_message == null) {
                                    return;
                                }
                                long B03 = gj.B0(message10);
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
                                            x00Var = new x00();
                                            arrayList.add(x00Var);
                                        } else {
                                            x00Var = (x00) arrayList.get(arrayList.size() - 1);
                                        }
                                        if (x00Var.b.contains(Integer.valueOf(gjVar2.e1()))) {
                                            return;
                                        }
                                        if (x00Var.b.size() + 1 >= 20) {
                                            g0.r(x00Var.a);
                                            g0.h3(x00Var.a);
                                            x00Var = new x00();
                                            arrayList.add(x00Var);
                                        }
                                        dr drVar = x00Var.a;
                                        if (drVar != null) {
                                            g0.r(drVar);
                                        }
                                        this.x.add(Integer.valueOf(gjVar2.e1()));
                                        x00Var.b.add(Integer.valueOf(gjVar2.e1()));
                                        a8.b("pending translation +" + gjVar2.e1() + " rich message");
                                        x00Var.c.add(u10Var);
                                        x00Var.d = m10;
                                        x00 x00Var2 = x00Var;
                                        dr drVar2 = new dr(this, B03, x00Var2, 7);
                                        x00Var2.a = drVar2;
                                        g0.i3(drVar2, x00Var2.e);
                                        x00Var2.e /= 2;
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
                gjVar2 = gjVar;
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
                        int i7 = 0;
                        while (i7 < size) {
                            Object obj = arrayList.get(i7);
                            i7++;
                            y00 y00Var = (y00) obj;
                            g0.r(y00Var.a);
                            if (y00Var.h != -1) {
                                getConnectionsManager().cancelRequest(y00Var.h, true);
                                ArrayList arrayList2 = y00Var.b;
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
                            y00 y00Var2 = (y00) obj3;
                            g0.r(y00Var2.a);
                            if (y00Var2.h != -1) {
                                getConnectionsManager().cancelRequest(y00Var2.h, true);
                                ArrayList arrayList4 = y00Var2.b;
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
                            w00 w00Var = (w00) obj5;
                            g0.r(w00Var.a);
                            if (w00Var.h != -1) {
                                getConnectionsManager().cancelRequest(w00Var.h, true);
                                ArrayList arrayList6 = w00Var.b;
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
                            x00 x00Var = (x00) obj7;
                            g0.r(x00Var.a);
                            if (x00Var.f != -1) {
                                getConnectionsManager().cancelRequest(x00Var.f, true);
                                ArrayList arrayList8 = x00Var.b;
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
        np.s1(this.currentAccount).f7.edit().remove("translating_dialog_languages2").remove("hidden_translation_at").apply();
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

    public final void k(gj gjVar, di.l9 l9Var) {
        TLRPC.Message message = gjVar.k;
        if (message == null || TextUtils.isEmpty(message.message)) {
            return;
        }
        if (!TextUtils.isEmpty(gjVar.k.originalLanguage)) {
            l9Var.a(gjVar.k.originalLanguage);
            return;
        }
        f3.s sVar = new f3.s(gjVar);
        HashSet hashSet = this.L;
        if (hashSet.contains(sVar)) {
            return;
        }
        hashSet.add(sVar);
        b6.d(gjVar.k.message, new i00(this, gjVar, sVar, l9Var), new i00(this, gjVar, sVar, l9Var), false);
    }

    public final void l(TL_stories.StoryItem storyItem) {
        String str;
        if (storyItem == null || storyItem.detectedLng != null || (str = storyItem.caption) == null || str.length() == 0) {
            return;
        }
        a10 a10Var = new a10();
        HashSet hashSet = this.J;
        if (hashSet.contains(a10Var)) {
            return;
        }
        hashSet.add(a10Var);
        b6.d(storyItem.caption, new p00(this, storyItem, a10Var), new p00(this, storyItem, a10Var), false);
    }

    public final String m(long j3) {
        String str = (String) this.d.get(Long.valueOf(j3));
        if (str == null && ((str = p21.M0()) == null || str.equals((String) this.e.get(Long.valueOf(j3))))) {
            str = j();
        }
        return "nb".equals(str) ? "no" : str;
    }

    public final void p(gj gjVar) {
        TLRPC.Message message = gjVar.k;
        if (message == null) {
            return;
        }
        long B0 = gj.B0(message);
        if (v(B0)) {
            TLRPC.Message message2 = gjVar.k;
            message2.translatedToLanguage = null;
            message2.translatedText = null;
            message2.translatedVoiceTranscription = null;
            message2.translatedPoll = null;
            message2.summaryText = null;
            message2.translatedSummaryText = null;
            message2.translatedSummaryLanguage = null;
            getMessagesStorage().X1(B0, gjVar.k);
            g0.h3(new a4(this, gjVar, B0, 8));
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
            this.r = Boolean.valueOf(this.n.f7.getBoolean("translate_chat_button", true));
        }
        return this.r.booleanValue();
    }

    public final boolean s() {
        if (!getMessagesController().H2()) {
            return false;
        }
        if (this.s == null) {
            this.s = Boolean.valueOf(this.n.f7.getBoolean("translate_button", np.e1().getBoolean("translate_button", false)));
        }
        return this.s.booleanValue();
    }

    public final boolean t(long j3) {
        return this.b.contains(Long.valueOf(j3)) && v(j3) && !m5.C(j3) && getUserConfig().e() != j3;
    }

    public final boolean u() {
        return r() && m10.i(this.currentAccount).q();
    }

    public final boolean v(long j3) {
        if (!r()) {
            return false;
        }
        TLRPC.Chat M0 = getMessagesController().M0(Long.valueOf(-j3));
        if (m10.i(this.currentAccount).q()) {
            return true;
        }
        return M0 != null && M0.autotranslation;
    }

    public final boolean w(String str) {
        if (getUserConfig().q()) {
            return oy0.d0().contains(str);
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
