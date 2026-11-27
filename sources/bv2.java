// default package

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.net.Uri;
import android.os.Looper;
import android.os.Process;
import android.os.StrictMode;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicMarkableReference;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.ActionBar.e;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class bv2 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ bv2(zc1 zc1Var, Throwable th) {
        this.a = (byte) 7;
        Map map = Collections.EMPTY_MAP;
        this.b = zc1Var;
        this.c = th;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        String str2;
        d79 d79Var;
        int i = 0;
        boolean equals = false;
        switch (this.a) {
            case 0:
                ((lv2) this.b).a((TLRPC.User) this.c);
                return;
            case 1:
                lv2 lv2Var = (lv2) this.b;
                SparseArray sparseArray = (SparseArray) this.c;
                if (lv2Var.s) {
                    return;
                }
                lv2Var.s = true;
                HashMap hashMap = new HashMap();
                HashMap H = lv2Var.H();
                HashMap hashMap2 = new HashMap();
                Iterator it = H.entrySet().iterator();
                while (it.hasNext()) {
                    iv2 iv2Var = (iv2) ((Map.Entry) it.next()).getValue();
                    for (int i2 = 0; i2 < iv2Var.g.size(); i2++) {
                        hashMap2.put((String) iv2Var.g.get(i2), iv2Var.b);
                    }
                }
                for (int i3 = 0; i3 < sparseArray.size(); i3++) {
                    iv2 iv2Var2 = (iv2) sparseArray.valueAt(i3);
                    int i4 = 0;
                    while (true) {
                        if (i4 >= iv2Var2.g.size()) {
                            break;
                        }
                        String str3 = (String) hashMap2.get((String) iv2Var2.g.get(i4));
                        if (str3 != null) {
                            iv2Var2.b = str3;
                            hashMap.put(str3, iv2Var2);
                        } else {
                            i4++;
                        }
                    }
                }
                if (f11.a) {
                    cc4.b("migrated contacts " + hashMap.size() + " of " + sparseArray.size());
                }
                lv2Var.getMessagesStorage().a1(hashMap, true, false);
                return;
            case 2:
                d79 d79Var2 = (d79) this.b;
                Object obj = this.c;
                if (d79Var2 != null) {
                    d79Var2.setOnItemClickListener((r69) obj);
                    return;
                }
                return;
            case 3:
                m32 m32Var = (m32) this.b;
                String lowerCase = ((String) this.c).trim().toLowerCase();
                byte b = 4;
                if (lowerCase.length() == 0) {
                    hl.c3(new bv2(m32Var, new ArrayList(), b));
                    return;
                }
                String I3 = hl.I3(lowerCase);
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = m32Var.f;
                int size = arrayList2.size();
                while (i < size) {
                    Object obj2 = arrayList2.get(i);
                    i++;
                    gy2 gy2Var = (gy2) obj2;
                    String str4 = gy2Var.a;
                    if (str4 == null) {
                        str4 = str;
                    }
                    String lowerCase2 = str4.toLowerCase();
                    String lowerCase3 = hl.I3(gy2Var.a).toLowerCase();
                    String str5 = gy2Var.b;
                    if (str5 == null) {
                        str5 = str;
                    }
                    String lowerCase4 = str5.toLowerCase();
                    String lowerCase5 = hl.I3(gy2Var.b).toLowerCase();
                    String str6 = gy2Var.c;
                    if (str6 == null) {
                        str6 = str;
                    }
                    String concat = TextUtils.isEmpty(str6) ? str : "+".concat(str6);
                    if (lowerCase2.startsWith(lowerCase)) {
                        str2 = str;
                    } else {
                        str2 = str;
                        str = (lowerCase2.contains(" ".concat(lowerCase)) || lowerCase3.startsWith(I3) || lowerCase3.contains(" ".concat(I3)) || lowerCase4.startsWith(lowerCase) || lowerCase4.contains(" ".concat(lowerCase)) || lowerCase5.startsWith(I3) || lowerCase5.contains(" ".concat(I3)) || str6.startsWith(lowerCase) || concat.startsWith(lowerCase)) ? "" : str2;
                    }
                    arrayList.add(gy2Var);
                }
                hl.c3(new bv2((Object) m32Var, (Object) arrayList, (byte) 4));
                return;
            case 4:
                m32 m32Var2 = (m32) this.b;
                ArrayList arrayList3 = (ArrayList) this.c;
                ky2 ky2Var = (ky2) m32Var2.n;
                if (ky2Var.f) {
                    m32Var2.e = arrayList3;
                    if (ky2Var.e && (d79Var = ky2Var.a) != null) {
                        j79 adapter = d79Var.getAdapter();
                        m32 m32Var3 = ky2Var.d;
                        if (adapter != m32Var3) {
                            ky2Var.a.setAdapter(m32Var3);
                            ky2Var.a.setFastScrollVisible(false);
                        }
                    }
                    m32Var2.f();
                    return;
                }
                return;
            case 5:
                ((yy2) this.b).b((String) this.c, Boolean.FALSE);
                return;
            case 6:
                zc1 zc1Var = (zc1) this.b;
                String str7 = (String) this.c;
                gd4 gd4Var = ((yy2) zc1Var.f).d;
                String b2 = vx5.b(1024, str7);
                synchronized (((AtomicMarkableReference) gd4Var.g)) {
                    String str8 = (String) ((AtomicMarkableReference) gd4Var.g).getReference();
                    if (b2 != null) {
                        equals = b2.equals(str8);
                    } else if (str8 == null) {
                        equals = true;
                    }
                    if (equals) {
                        return;
                    }
                    ((AtomicMarkableReference) gd4Var.g).set(b2, true);
                    ((i03) ((rx6) gd4Var.c).c).a(new azb(gd4Var, (byte) 10));
                    return;
                }
            case 7:
                zc1 zc1Var2 = (zc1) this.b;
                Throwable th = (Throwable) this.c;
                Map map = Collections.EMPTY_MAP;
                yy2 yy2Var = (yy2) zc1Var2.f;
                Thread currentThread = Thread.currentThread();
                yy2Var.getClass();
                long currentTimeMillis = System.currentTimeMillis();
                h03 h03Var = yy2Var.n;
                if (h03Var == null || !h03Var.e.get()) {
                    long j = currentTimeMillis / 1000;
                    String e = yy2Var.e();
                    if (e == null) {
                        Log.w("FirebaseCrashlytics", "Tried to write a non-fatal exception while no session was open.", null);
                        return;
                    }
                    g54 g54Var = new g54(e, j, map);
                    faa faaVar = yy2Var.m;
                    String concat2 = "Persisting non-fatal event for session ".concat(e);
                    if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                        Log.v("FirebaseCrashlytics", concat2, null);
                    }
                    faaVar.g(th, currentThread, "error", g54Var, false);
                    return;
                }
                return;
            case 8:
                nx0 nx0Var = (nx0) this.b;
                Context context = (Context) this.c;
                nx0Var.dismiss();
                m01.u(context, "https://t.me/BotFather?start=deletebot");
                return;
            case 9:
                zt3 zt3Var = (zt3) this.b;
                TreeSet treeSet = (TreeSet) this.c;
                String charSequence = zt3Var.getText().toString();
                String str9 = (t03.a(charSequence, "bot") || t03.c(charSequence, treeSet) != null) ? "" : "bot";
                yt3 yt3Var = zt3Var.d;
                yt3Var.setRightText(str9);
                yt3Var.setPadding(0, hl.L(15.0f), hl.L(TextUtils.isEmpty(str9) ? 21.0f : 63.0f), hl.L(15.0f));
                return;
            case 10:
                uc7.s1(((j13) this.b).a).Y3((TLRPC.Updates) this.c, false);
                return;
            case 11:
                ((h23) this.b).onResult((u13) this.c);
                return;
            case 12:
                r13 r13Var = (r13) this.b;
                d13 d13Var = (d13) this.c;
                h23 h23Var = r13Var.f;
                if (h23Var != null) {
                    h23Var.onResult(d13Var);
                    return;
                } else {
                    ur5.e("callback");
                    throw null;
                }
            case 13:
                ((h23) this.b).B((w03) this.c);
                return;
            case 14:
                y13 y13Var = (y13) this.b;
                TLObject tLObject = (TLObject) this.c;
                if (tLObject == null || !(tLObject instanceof TL_phone.groupCallStreamRtmpUrl)) {
                    return;
                }
                TL_phone.groupCallStreamRtmpUrl groupcallstreamrtmpurl = (TL_phone.groupCallStreamRtmpUrl) tLObject;
                y13Var.W1 = groupcallstreamrtmpurl.url;
                y13Var.X1 = groupcallstreamrtmpurl.key;
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(y13Var.X1);
                y13Var.Y1 = spannableStringBuilder;
                rmb rmbVar = new rmb();
                rmbVar.a |= 256;
                rmbVar.b = 0;
                rmbVar.c = spannableStringBuilder.length();
                y13Var.Y1.setSpan(new smb(rmbVar, 0), 0, y13Var.Y1.length(), 0);
                y13Var.Z1.O(false);
                return;
            case 15:
                ((o23) this.b).e().B((xu4) this.c);
                return;
            case 16:
                ((o23) this.b).e().onResult((bv4) this.c);
                return;
            case 17:
                ((o23) this.b).e().B(((p89) this.c).a);
                return;
            case 18:
                ((h23) this.b).B(this.c);
                return;
            case 19:
                v23 v23Var = (v23) this.b;
                u13 u13Var = (u13) this.c;
                h23 h23Var2 = v23Var.f;
                if (h23Var2 != null) {
                    h23Var2.onResult(u13Var);
                    return;
                } else {
                    ur5.e("callback");
                    throw null;
                }
            case 20:
                CredentialProviderPlayServicesImpl.runFallbackClearCredFlow$lambda$27$lambda$26$lambda$25$lambda$24((h23) this.b, (Exception) this.c);
                return;
            case 21:
                CredentialProviderPlayServicesImpl.onClearCredential$lambda$14$lambda$13$lambda$12((h23) this.b, (p89) this.c);
                return;
            case 22:
                e53 e53Var = (e53) this.b;
                i49 i49Var = (i49) this.c;
                e53Var.l = true;
                e53Var.a.invalidate();
                i49Var.d1 = false;
                i49Var.invalidate();
                e53Var.c(true);
                return;
            case 23:
                m53 m53Var = (m53) this.b;
                qa qaVar = (qa) this.c;
                m53Var.getText().delete(m53Var.getText().getSpanStart(qaVar), m53Var.getText().getSpanEnd(qaVar));
                m53Var.setCursorVisible(true);
                m53Var.setLongClickable(true);
                return;
            case 24:
                q53 q53Var = (q53) this.b;
                Runnable runnable = (Runnable) this.c;
                Process.setThreadPriority(q53Var.c);
                StrictMode.ThreadPolicy threadPolicy = q53Var.d;
                if (threadPolicy != null) {
                    StrictMode.setThreadPolicy(threadPolicy);
                }
                runnable.run();
                return;
            case 25:
                j93 j93Var = (j93) this.b;
                zh6 zh6Var = (zh6) this.c;
                k93 k93Var = j93Var.U2;
                d31.x(k93Var.getParentActivity(), k93Var.b, zh6Var.m(), zh6Var.m() == 1 ? ((TLRPC.Dialog) zh6Var.n(0)).id : 0L, aob.v0(aob.wj, j93Var.J0), aob.v0(aob.yj, j93Var.J0)).j();
                return;
            case 26:
                va3 va3Var = (va3) this.b;
                ko4 ko4Var = (ko4) this.c;
                wa3 wa3Var = va3Var.d;
                if (wa3Var.F == 0 || va3Var.c) {
                    return;
                }
                Looper looper = wa3Var.J;
                looper.getClass();
                va3Var.b = wa3Var.b(looper, va3Var.a, ko4Var, false);
                wa3Var.y.add(va3Var);
                return;
            case 27:
                kb3 kb3Var = (kb3) this.b;
                Uri uri = (Uri) this.c;
                kb3Var.s = false;
                if (kb3Var.a.equals(kb3Var.y.I) || kb3Var.x) {
                    kb3Var.b(uri);
                    return;
                }
                return;
            case 28:
                yc3 yc3Var = (yc3) this.b;
                e eVar = (e) this.c;
                ad3 ad3Var = (ad3) yc3Var.c;
                ad3Var.a();
                ad3Var.c();
                int w0 = aob.w0(null, aob.q6, false);
                b29 b29Var = ad3Var.d;
                b29Var.setColorFilter(new PorterDuffColorFilter(w0, PorterDuff.Mode.SRC_IN));
                boolean i1 = aob.i1();
                skb skbVar = ad3Var.e;
                if (i1) {
                    skbVar.p(ob6.M0(2131745194, null), b29Var, true);
                    skbVar.x += 2;
                } else {
                    skbVar.p(ob6.M0(2131745195, null), b29Var, true);
                    skbVar.x += 2;
                }
                aob.K1(eVar);
                return;
            default:
                ((pd3) ((qx6) this.b).c).i.a((ggc) this.c);
                return;
        }
    }

    public /* synthetic */ bv2(j93 j93Var, zh6 zh6Var, int i) {
        this.a = (byte) 25;
        this.b = j93Var;
        this.c = zh6Var;
    }

    public /* synthetic */ bv2(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }
}
