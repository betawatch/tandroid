package ab;

import a8.h7;
import a8.r7;
import android.app.Activity;
import android.content.Context;
import android.graphics.Typeface;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import gb.y0;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import m1.u0;
import org.json.JSONObject;
import org.telegram.messenger.a8;
import org.telegram.messenger.ij;
import org.telegram.messenger.ls;
import org.telegram.messenger.ms;
import org.telegram.messenger.qs;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.ActionBar.f2;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.l71;
import org.telegram.ui.cn;
import org.telegram.ui.gy0;
import org.telegram.ui.ie;
import org.telegram.ui.ly0;
import org.telegram.ui.ny0;
import org.telegram.ui.web.c1;
import org.telegram.ui.web.d1;
import ug.w0;
import zd.a1;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final class b0 implements ib.b, ms, ny0, q5.b {
    public static b0 f;
    public final /* synthetic */ int a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;

    public /* synthetic */ b0(int i7, boolean z9) {
        this.a = i7;
    }

    public static void f(String str, String str2, HashMap hashMap) {
        d1 d1Var = new d1();
        String[] split = str2.split(";(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)");
        for (int i7 = 0; i7 < split.length; i7++) {
            String trim = split[i7].trim();
            if (!trim.isEmpty()) {
                int indexOf = trim.indexOf(61);
                if (i7 == 0 || indexOf < 0) {
                    d1Var.a = trim;
                } else {
                    String trim2 = trim.substring(0, indexOf).trim();
                    String trim3 = trim.substring(indexOf + 1).trim();
                    if (trim3.length() >= 2 && trim3.charAt(0) == '\"' && trim3.charAt(trim3.length() - 1) == '\"') {
                        trim3 = com.google.android.recaptcha.internal.a.k(trim3, 1, 1);
                    }
                    d1Var.b.put(trim2, trim3);
                }
            }
        }
        hashMap.put(str.trim().toLowerCase(), d1Var);
    }

    public static synchronized b0 k() {
        b0 b0Var;
        synchronized (b0.class) {
            try {
                if (f == null) {
                    f = new b0(0);
                }
                b0Var = f;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return b0Var;
    }

    public static void r(long j3, HashMap hashMap) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : hashMap.entrySet()) {
            if (((Long) entry.getValue()).longValue() <= j3) {
                arrayList.add(entry.getKey());
            }
        }
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            hashMap.remove(arrayList.get(i7));
        }
    }

    @Override // org.telegram.ui.ny0
    public void a() {
        org.telegram.messenger.g0.i3(new gy0((cn) this.b, (Activity) this.c, (h6) this.d, (ij) this.e, 2), 200L);
    }

    @Override // org.telegram.messenger.ms
    public void b() {
        a0.k kVar = (a0.k) this.d;
        if (((ls) this.c) == null) {
            return;
        }
        b0 b0Var = (b0) this.e;
        if (b0Var != null) {
            b0Var.b();
            this.e = null;
        }
        int i7 = kVar.b;
        for (int i10 = 0; i10 < i7; i10++) {
            qs qsVar = (qs) this.b;
            ls lsVar = (ls) this.c;
            if (i10 < 0) {
                kVar.getClass();
            } else if (i10 < kVar.b) {
                qsVar.n(lsVar, kVar.a[i10]);
            }
            StringBuilder n10 = jg.g.n(i10, "Index ", " must be in 0..");
            n10.append(kVar.b - 1);
            throw new IndexOutOfBoundsException(n10.toString());
        }
        kVar.b = 0;
        this.b = null;
        this.c = null;
    }

    public b0 c(int i7) {
        if (((ls) this.c) == null) {
            return this;
        }
        a0.k kVar = (a0.k) this.d;
        int i10 = kVar.b + 1;
        int[] iArr = kVar.a;
        if (iArr.length < i10) {
            int[] copyOf = Arrays.copyOf(iArr, Math.max(i10, (iArr.length * 3) / 2));
            kotlin.jvm.internal.j.d(copyOf, "copyOf(this, newSize)");
            kVar.a = copyOf;
        }
        int[] iArr2 = kVar.a;
        int i11 = kVar.b;
        iArr2[i11] = i7;
        kVar.b = i11 + 1;
        ((qs) this.b).b((ls) this.c, i7);
        return this;
    }

    @Override // org.telegram.ui.ny0
    public void d() {
        org.telegram.messenger.g0.i3(new ie((cn) this.b, (ij) this.e, 8), 200L);
    }

    public b0 e(int i7) {
        if (((ls) this.c) == null) {
            return this;
        }
        if (((b0) this.e) == null) {
            this.e = new b0(qs.e(), (ls) this.c);
        }
        ((b0) this.e).c(i7);
        return this;
    }

    @Override // org.telegram.ui.ny0
    public void g() {
        cn cnVar = (cn) this.b;
        cnVar.showDialog(new w0((f2) cnVar, 3, true));
    }

    @Override // fd.a
    public Object get() {
        switch (this.a) {
            case 3:
                return new gb.o((o9.g) ((d9.o) this.b).a, (jb.l) ((ib.c) this.c).get(), (id.h) ((ib.c) this.d).get(), (y0) ((ib.c) this.e).get());
            default:
                return new ui.e((Executor) ((fd.a) this.b).get(), (v5.d) ((fd.a) this.c).get(), (ly0) ((ly0) this.d).get(), (w5.c) ((fd.a) this.e).get(), false, 13);
        }
    }

    public ArrayList h(List list) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        HashMap hashMap = (HashMap) this.b;
        r(elapsedRealtime, hashMap);
        HashMap hashMap2 = (HashMap) this.c;
        r(elapsedRealtime, hashMap2);
        ArrayList arrayList = new ArrayList();
        for (int i7 = 0; i7 < list.size(); i7++) {
            p2.b bVar = (p2.b) list.get(i7);
            if (!hashMap.containsKey(bVar.b) && !hashMap2.containsKey(Integer.valueOf(bVar.c))) {
                arrayList.add(bVar);
            }
        }
        return arrayList;
    }

    public void i(String str, String[] strArr) {
        HashMap hashMap = new HashMap();
        for (String str2 : strArr) {
            hashMap.put(str2, "");
        }
        boolean[] zArr = new boolean[1];
        for (String str3 : str.split(";")) {
            o(str3, hashMap, zArr, 100);
            if (zArr[0]) {
                return;
            }
        }
    }

    public String j(String str) {
        ArrayList arrayList = (ArrayList) this.c;
        try {
            String quote = Pattern.quote(str);
            Locale locale = Locale.US;
            Matcher matcher = Pattern.compile("(?x)(?:function\\s+" + quote + "|[{;,]\\s*" + quote + "\\s*=\\s*function|var\\s+" + quote + "\\s*=\\s*function)\\s*\\(([^)]*)\\)\\s*\\{([^}]+)\\}").matcher((String) this.b);
            if (matcher.find()) {
                String group = matcher.group();
                if (!arrayList.contains(group)) {
                    arrayList.add(group + ";");
                }
                i(matcher.group(2), matcher.group(1).split(","));
            }
        } catch (Exception e10) {
            arrayList.clear();
            a8.g(e10, true);
        }
        return TextUtils.join("", arrayList);
    }

    public boolean l(Context context) {
        if (((Boolean) this.d) == null) {
            this.d = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0);
        }
        if (!((Boolean) this.c).booleanValue() && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: android.permission.ACCESS_NETWORK_STATE this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return ((Boolean) this.d).booleanValue();
    }

    public boolean m(Context context) {
        if (((Boolean) this.c) == null) {
            this.c = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0);
        }
        if (!((Boolean) this.c).booleanValue() && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: android.permission.WAKE_LOCK this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return ((Boolean) this.c).booleanValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0055, code lost:
    
        if (r4 != 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0063, code lost:
    
        throw new java.lang.Exception(rf.b.i("Premature end of parens in ", r13));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void n(int i7, String str, HashMap hashMap) {
        String trim = str.trim();
        if (TextUtils.isEmpty(trim)) {
            return;
        }
        if (trim.charAt(0) == '(') {
            Matcher matcher = l71.z0.matcher(trim);
            int i10 = 0;
            while (true) {
                if (!matcher.find()) {
                    break;
                }
                if (matcher.group(0).indexOf(48) == 40) {
                    i10++;
                } else {
                    i10--;
                    if (i10 == 0) {
                        n(i7, trim.substring(1, matcher.start()), hashMap);
                        trim = trim.substring(matcher.end()).trim();
                        if (TextUtils.isEmpty(trim)) {
                            return;
                        }
                    }
                }
            }
        }
        int i11 = 0;
        while (true) {
            String[] strArr = (String[]) this.e;
            if (i11 < strArr.length) {
                String str2 = strArr[i11];
                Locale locale = Locale.US;
                Matcher matcher2 = Pattern.compile("(?x)([a-zA-Z_$][a-zA-Z_$0-9]*)(?:\\[([^\\]]+?)\\])?\\s*" + Pattern.quote(str2) + "(.*)$").matcher(trim);
                if (matcher2.find()) {
                    n(i7 - 1, matcher2.group(3), hashMap);
                    String group = matcher2.group(2);
                    if (TextUtils.isEmpty(group)) {
                        hashMap.put(matcher2.group(1), "");
                        return;
                    } else {
                        n(i7, group, hashMap);
                        return;
                    }
                }
                i11++;
            } else {
                try {
                    Integer.parseInt(trim);
                    return;
                } catch (Exception unused) {
                    Locale locale2 = Locale.US;
                    if (Pattern.compile("(?!if|return|true|false)([a-zA-Z_$][a-zA-Z_$0-9]*)$").matcher(trim).find()) {
                        return;
                    }
                    if (trim.charAt(0) == '\"' && trim.charAt(trim.length() - 1) == '\"') {
                        return;
                    }
                    try {
                        new JSONObject(trim).toString();
                        return;
                    } catch (Exception unused2) {
                        Locale locale3 = Locale.US;
                        Matcher matcher3 = Pattern.compile("([a-zA-Z_$][a-zA-Z_$0-9]*)\\[(.+)\\]$").matcher(trim);
                        if (matcher3.find()) {
                            matcher3.group(1);
                            n(i7 - 1, matcher3.group(2), hashMap);
                            return;
                        }
                        Matcher matcher4 = Pattern.compile("([a-zA-Z_$][a-zA-Z_$0-9]*)(?:\\.([^(]+)|\\[([^]]+)\\])\\s*(?:\\(+([^()]*)\\))?$").matcher(trim);
                        if (matcher4.find()) {
                            String group2 = matcher4.group(1);
                            String group3 = matcher4.group(2);
                            String group4 = matcher4.group(3);
                            if (TextUtils.isEmpty(group3)) {
                                group3 = group4;
                            }
                            group3.replace("\"", "");
                            String group5 = matcher4.group(4);
                            if (hashMap.get(group2) == null) {
                                ArrayList arrayList = (ArrayList) this.c;
                                new HashMap();
                                Matcher matcher5 = Pattern.compile("(?:var\\s+)?" + Pattern.quote(group2) + "\\s*=\\s*\\{\\s*(((?:[a-zA-Z$0-9]+|\"[a-zA-Z$0-9]+\"|'[a-zA-Z$0-9]+')\\s*:\\s*function\\(.*?\\)\\s*\\{.*?\\}(?:,\\s*)?)*)\\}\\s*;").matcher((String) this.b);
                                String str3 = null;
                                while (true) {
                                    if (!matcher5.find()) {
                                        break;
                                    }
                                    String group6 = matcher5.group();
                                    String group7 = matcher5.group(2);
                                    if (TextUtils.isEmpty(group7)) {
                                        str3 = group7;
                                    } else {
                                        if (!arrayList.contains(group6)) {
                                            arrayList.add(matcher5.group());
                                        }
                                        str3 = group7;
                                    }
                                }
                                Matcher matcher6 = Pattern.compile("((?:[a-zA-Z$0-9]+|\"[a-zA-Z$0-9]+\"|'[a-zA-Z$0-9]+'))\\s*:\\s*function\\(([a-z,]+)\\)\\{([^}]+)\\}").matcher(str3);
                                while (matcher6.find()) {
                                    i(matcher6.group(3), matcher6.group(2).split(","));
                                }
                            }
                            if (group5 == null) {
                                return;
                            }
                            if (trim.charAt(trim.length() - 1) != ')') {
                                throw new Exception("last char not ')'");
                            }
                            if (group5.length() != 0) {
                                for (String str4 : group5.split(",")) {
                                    n(i7, str4, hashMap);
                                }
                                return;
                            }
                            return;
                        }
                        Matcher matcher7 = Pattern.compile("([a-zA-Z_$][a-zA-Z_$0-9]*)\\[(.+)\\]$").matcher(trim);
                        if (matcher7.find()) {
                            hashMap.get(matcher7.group(1));
                            n(i7 - 1, matcher7.group(2), hashMap);
                            return;
                        }
                        int i12 = 0;
                        while (true) {
                            String[] strArr2 = (String[]) this.d;
                            if (i12 >= strArr2.length) {
                                Locale locale4 = Locale.US;
                                Matcher matcher8 = Pattern.compile("^([a-zA-Z_$][a-zA-Z_$0-9]*)\\(([a-zA-Z0-9_$,]*)\\)$").matcher(trim);
                                if (matcher8.find()) {
                                    j(matcher8.group(1));
                                }
                                throw new Exception("Unsupported JS expression ".concat(trim));
                            }
                            String str5 = strArr2[i12];
                            Locale locale5 = Locale.US;
                            Matcher matcher9 = Pattern.compile("(.+?)" + Pattern.quote(str5) + "(.+)").matcher(trim);
                            if (matcher9.find()) {
                                boolean[] zArr = new boolean[1];
                                int i13 = i7 - 1;
                                o(matcher9.group(1), hashMap, zArr, i13);
                                if (zArr[0]) {
                                    throw new Exception(com.google.android.recaptcha.internal.a.l("Premature left-side return of ", str5, " in ", trim));
                                }
                                o(matcher9.group(2), hashMap, zArr, i13);
                                if (zArr[0]) {
                                    throw new Exception(com.google.android.recaptcha.internal.a.l("Premature right-side return of ", str5, " in ", trim));
                                }
                            }
                            i12++;
                        }
                    }
                }
            }
        }
    }

    public void o(String str, HashMap hashMap, boolean[] zArr, int i7) {
        if (i7 < 0) {
            throw new Exception("recursion limit reached");
        }
        zArr[0] = false;
        String trim = str.trim();
        Matcher matcher = l71.x0.matcher(trim);
        if (matcher.find()) {
            trim = trim.substring(matcher.group(0).length());
        } else {
            Matcher matcher2 = l71.y0.matcher(trim);
            if (matcher2.find()) {
                trim = trim.substring(matcher2.group(0).length());
                zArr[0] = true;
            }
        }
        n(i7, trim, hashMap);
    }

    public kf.f p(String str) {
        if (str == null) {
            throw new NullPointerException("input must not be null");
        }
        gf.h hVar = new gf.h((ArrayList) this.b, (lf.b) this.d, (ArrayList) this.c);
        int i7 = 0;
        while (true) {
            int length = str.length();
            int i10 = i7;
            while (true) {
                if (i10 >= length) {
                    i10 = -1;
                    break;
                }
                char charAt = str.charAt(i10);
                if (charAt == '\n' || charAt == '\r') {
                    break;
                }
                i10++;
            }
            if (i10 == -1) {
                break;
            }
            hVar.i(str.substring(i7, i10));
            i7 = i10 + 1;
            if (i7 < str.length() && str.charAt(i10) == '\r' && str.charAt(i7) == '\n') {
                i7 = i10 + 2;
            }
        }
        if (str.length() > 0 && (i7 == 0 || i7 < str.length())) {
            hVar.i(str.substring(i7));
        }
        hVar.f(hVar.n);
        lf.a b10 = hVar.j.b(new wf.b(20, hVar.k, hVar.m));
        Iterator it = hVar.o.iterator();
        while (it.hasNext()) {
            ((mf.a) it.next()).g(b10);
        }
        kf.f fVar = (kf.f) hVar.l.b;
        Iterator it2 = ((ArrayList) this.e).iterator();
        if (!it2.hasNext()) {
            return fVar;
        }
        it2.next().getClass();
        throw new ClassCastException();
    }

    public HashMap q(BufferedReader bufferedReader) {
        String str;
        StringBuilder sb2;
        HashMap hashMap = new HashMap();
        loop0: while (true) {
            str = null;
            sb2 = null;
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break loop0;
                }
                long[] jArr = (long[]) this.e;
                jArr[0] = jArr[0] + readLine.getBytes().length + 2;
                String trim = readLine.trim();
                if (trim.isEmpty()) {
                    break loop0;
                }
                if (str == null || sb2 == null) {
                    int indexOf = trim.indexOf(58);
                    if (indexOf >= 0) {
                        String trim2 = trim.substring(0, indexOf).trim();
                        String trim3 = trim.substring(indexOf + 1).trim();
                        if (trim3.endsWith(";")) {
                            sb2 = com.google.android.recaptcha.internal.a.m(trim3);
                            str = trim2;
                        } else {
                            f(trim2, trim3, hashMap);
                        }
                    }
                } else {
                    sb2.append(trim);
                    if (!trim.endsWith(";")) {
                        break;
                    }
                }
            }
            f(str, sb2.toString(), hashMap);
        }
        if (str != null && sb2 != null) {
            f(str, sb2.toString(), hashMap);
        }
        return hashMap;
    }

    public p2.b s(List list) {
        p2.b bVar;
        HashMap hashMap = (HashMap) this.d;
        ArrayList h = h(list);
        if (h.size() < 2) {
            return (p2.b) h9.o.m(h, null);
        }
        Collections.sort(h, new jg.x(10));
        ArrayList arrayList = new ArrayList();
        int i7 = 0;
        int i10 = ((p2.b) h.get(0)).c;
        int i11 = 0;
        while (true) {
            if (i11 >= h.size()) {
                break;
            }
            p2.b bVar2 = (p2.b) h.get(i11);
            if (i10 == bVar2.c) {
                arrayList.add(new Pair(bVar2.b, Integer.valueOf(bVar2.d)));
                i11++;
            } else if (arrayList.size() == 1) {
                return (p2.b) h.get(0);
            }
        }
        p2.b bVar3 = (p2.b) hashMap.get(arrayList);
        if (bVar3 != null) {
            return bVar3;
        }
        List subList = h.subList(0, arrayList.size());
        int i12 = 0;
        for (int i13 = 0; i13 < subList.size(); i13++) {
            i12 += ((p2.b) subList.get(i13)).d;
        }
        int nextInt = ((Random) this.e).nextInt(i12);
        int i14 = 0;
        while (true) {
            if (i7 >= subList.size()) {
                bVar = (p2.b) h9.o.n(subList);
                break;
            }
            bVar = (p2.b) subList.get(i7);
            i14 += bVar.d;
            if (nextInt < i14) {
                break;
            }
            i7++;
        }
        hashMap.put(arrayList, bVar);
        return bVar;
    }

    public /* synthetic */ b0(Object obj, Object obj2, Object obj3, Object obj4, int i7) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    public b0(File file) {
        this.a = 12;
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        this.c = arrayList;
        HashMap hashMap2 = new HashMap();
        this.d = hashMap2;
        long[] jArr = new long[1];
        this.e = jArr;
        this.b = file;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
        hashMap.putAll(q(bufferedReader));
        d1 d1Var = (d1) hashMap.get("content-type");
        String str = d1Var == null ? null : (String) d1Var.b.get("boundary");
        if (str != null) {
            int length = str.length() + 2;
            c1 c1Var = null;
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                jArr[0] = jArr[0] + readLine.getBytes().length + 2;
                if (readLine.length() == length && readLine.substring(2).equals(str)) {
                    if (c1Var != null) {
                        c1Var.d = (jArr[0] - length) - 2;
                        arrayList.add(c1Var);
                        d1 d1Var2 = (d1) c1Var.a.get("content-location");
                        hashMap2.put(d1Var2 == null ? null : d1Var2.a, c1Var);
                    }
                    c1Var = new c1();
                    c1Var.b = (File) this.b;
                    c1Var.a.putAll(q(bufferedReader));
                    c1Var.c = jArr[0];
                }
            }
            if (c1Var != null && c1Var.c != 0 && c1Var.d != 0) {
                arrayList.add(c1Var);
                d1 d1Var3 = (d1) c1Var.a.get("content-location");
                hashMap2.put(d1Var3 != null ? d1Var3.a : null, c1Var);
            }
        }
        bufferedReader.close();
    }

    public b0(zd.z zVar, m1.y yVar, be.l lVar) {
        this.a = 6;
        this.b = zVar;
        this.c = lVar;
        this.d = h7.a(ConnectionsManager.DEFAULT_DATACENTER_ID, null, 6);
        this.e = new g6.d0(17);
        a1 a1Var = (a1) zVar.c().get(zd.y.b);
        if (a1Var != null) {
            a1Var.invokeOnCompletion(new u0(1, yVar, this));
        }
    }

    public b0(r7 r7Var) {
        this.a = 5;
        ArrayList arrayList = (ArrayList) r7Var.b;
        LinkedHashSet linkedHashSet = (LinkedHashSet) r7Var.e;
        LinkedHashSet linkedHashSet2 = gf.h.p;
        ArrayList arrayList2 = new ArrayList();
        arrayList2.addAll(arrayList);
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            arrayList2.add(gf.h.q.get((Class) it.next()));
        }
        this.b = arrayList2;
        lf.b bVar = (q4.q) r7Var.f;
        bVar = bVar == null ? new nb.a(13) : bVar;
        this.d = bVar;
        this.e = (ArrayList) r7Var.d;
        ArrayList arrayList3 = (ArrayList) r7Var.c;
        this.c = arrayList3;
        bVar.b(new wf.b(20, arrayList3, Collections.EMPTY_MAP));
    }

    public b0(Typeface typeface, s1.b bVar) {
        int i7;
        int i10;
        int i11;
        int i12;
        this.a = 1;
        this.e = typeface;
        this.b = bVar;
        this.d = new androidx.emoji2.text.s(1024);
        int a10 = bVar.a(6);
        if (a10 != 0) {
            int i13 = a10 + bVar.a;
            i7 = ((ByteBuffer) bVar.d).getInt(((ByteBuffer) bVar.d).getInt(i13) + i13);
        } else {
            i7 = 0;
        }
        this.c = new char[i7 * 2];
        int a11 = bVar.a(6);
        if (a11 != 0) {
            int i14 = a11 + bVar.a;
            i10 = ((ByteBuffer) bVar.d).getInt(((ByteBuffer) bVar.d).getInt(i14) + i14);
        } else {
            i10 = 0;
        }
        for (int i15 = 0; i15 < i10; i15++) {
            androidx.emoji2.text.o oVar = new androidx.emoji2.text.o(this, i15);
            s1.a b10 = oVar.b();
            int a12 = b10.a(4);
            Character.toChars(a12 != 0 ? ((ByteBuffer) b10.d).getInt(a12 + b10.a) : 0, (char[]) this.c, i15 * 2);
            s1.a b11 = oVar.b();
            int a13 = b11.a(16);
            if (a13 != 0) {
                int i16 = a13 + b11.a;
                i11 = ((ByteBuffer) b11.d).getInt(((ByteBuffer) b11.d).getInt(i16) + i16);
            } else {
                i11 = 0;
            }
            if (i11 > 0) {
                androidx.emoji2.text.s sVar = (androidx.emoji2.text.s) this.d;
                s1.a b12 = oVar.b();
                int a14 = b12.a(16);
                if (a14 != 0) {
                    int i17 = a14 + b12.a;
                    i12 = ((ByteBuffer) b12.d).getInt(((ByteBuffer) b12.d).getInt(i17) + i17);
                } else {
                    i12 = 0;
                }
                sVar.a(oVar, 0, i12 - 1);
            } else {
                throw new IllegalArgumentException("invalid metadata codepoint length");
            }
        }
    }

    public b0(int i7) {
        this.a = i7;
        switch (i7) {
            case 7:
                Random random = new Random();
                this.d = new HashMap();
                this.e = random;
                this.b = new HashMap();
                this.c = new HashMap();
                break;
            default:
                this.b = null;
                this.c = null;
                this.d = null;
                this.e = new ArrayDeque();
                break;
        }
    }

    public b0(String str) {
        this.a = 9;
        this.c = new ArrayList();
        this.d = new String[]{"|", "^", "&", ">>", "<<", "-", "+", "%", "/", "*"};
        this.e = new String[]{"|=", "^=", "&=", ">>=", "<<=", "-=", "+=", "%=", "/=", "*=", "="};
        this.b = str;
    }

    public b0(qs qsVar, ls lsVar) {
        this.a = 8;
        a0.k kVar = new a0.k();
        kVar.a = new int[16];
        this.d = kVar;
        this.b = qsVar;
        this.c = lsVar;
    }
}
