package a1;

import aa.e0;
import aa.p;
import aa.t;
import aa.v;
import ab.l;
import ab.u;
import ai.b1;
import ai.c2;
import ai.n0;
import ai.o2;
import ai.p2;
import ai.u1;
import ai.v1;
import ai.x;
import ai.z;
import android.content.Intent;
import android.speech.SpeechRecognizer;
import android.support.v4.media.session.a0;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import bi.c3;
import bi.k6;
import bi.v2;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.messaging.FirebaseMessaging;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicMarkableReference;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.r;
import m.o3;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.g0;
import org.telegram.messenger.mp;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.messenger.x10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.h2;
import org.telegram.ui.Components.eq0;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.lc;
import org.telegram.ui.Components.y2;
import org.telegram.ui.Dictation.DictationAsr;
import org.telegram.ui.Dictation.DictationLid;
import org.telegram.ui.LaunchActivity;
import v0.n;
import w0.h;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
public final /* synthetic */ class e implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ e(int i7, Object obj, Object obj2) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01fe A[Catch: all -> 0x014a, InterruptedException -> 0x0336, TryCatch #7 {InterruptedException -> 0x0336, all -> 0x014a, blocks: (B:39:0x00f6, B:41:0x00fa, B:43:0x0104, B:44:0x0110, B:46:0x0116, B:129:0x0273, B:131:0x027d, B:134:0x0282, B:136:0x0288, B:140:0x029c, B:142:0x02c6, B:146:0x02b3, B:148:0x02b7, B:150:0x02bf, B:157:0x02c9, B:48:0x012e, B:50:0x0135, B:52:0x0140, B:55:0x014d, B:57:0x0155, B:59:0x016a, B:61:0x016e, B:62:0x017c, B:63:0x0184, B:70:0x01bd, B:71:0x01bf, B:76:0x01ca, B:78:0x01ce, B:80:0x01db, B:82:0x01e3, B:87:0x01f6, B:89:0x01fe, B:91:0x021d, B:93:0x022c, B:94:0x0239, B:96:0x023d, B:101:0x0256, B:103:0x0261, B:104:0x0268, B:117:0x0190, B:119:0x01aa), top: B:38:0x00f6 }] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x023d A[Catch: all -> 0x014a, InterruptedException -> 0x0336, TryCatch #7 {InterruptedException -> 0x0336, all -> 0x014a, blocks: (B:39:0x00f6, B:41:0x00fa, B:43:0x0104, B:44:0x0110, B:46:0x0116, B:129:0x0273, B:131:0x027d, B:134:0x0282, B:136:0x0288, B:140:0x029c, B:142:0x02c6, B:146:0x02b3, B:148:0x02b7, B:150:0x02bf, B:157:0x02c9, B:48:0x012e, B:50:0x0135, B:52:0x0140, B:55:0x014d, B:57:0x0155, B:59:0x016a, B:61:0x016e, B:62:0x017c, B:63:0x0184, B:70:0x01bd, B:71:0x01bf, B:76:0x01ca, B:78:0x01ce, B:80:0x01db, B:82:0x01e3, B:87:0x01f6, B:89:0x01fe, B:91:0x021d, B:93:0x022c, B:94:0x0239, B:96:0x023d, B:101:0x0256, B:103:0x0261, B:104:0x0268, B:117:0x0190, B:119:0x01aa), top: B:38:0x00f6 }] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        c2 c2Var;
        int i7;
        int i10;
        a0 a0Var;
        ByteBuffer byteBuffer;
        float sqrt;
        long j3;
        ByteBuffer byteBuffer2;
        String nativeSessionPush;
        a0 a0Var2;
        a0 a0Var3;
        x c10;
        String nativeSessionPush2;
        a0 a0Var4;
        boolean z10;
        int i11 = 4;
        int i12 = 8;
        String str = null;
        switch (this.a) {
            case 0:
                CredentialProviderPlayServicesImpl.runFallbackClearCredFlow$lambda$27$lambda$26$lambda$25$lambda$24((v0.g) this.b, (Exception) this.c);
                return;
            case 1:
                CredentialProviderPlayServicesImpl.onClearCredential$lambda$14$lambda$13$lambda$12((v0.g) this.b, (r) this.c);
                return;
            case 2:
                ((p) this.b).d((String) this.c, Boolean.FALSE);
                return;
            case 3:
                t tVar = (t) this.b;
                String str2 = (String) this.c;
                o3 o3Var = tVar.f.d;
                o3Var.getClass();
                String b10 = ca.e.b(1024, str2);
                synchronized (((AtomicMarkableReference) o3Var.g)) {
                    try {
                        String str3 = (String) ((AtomicMarkableReference) o3Var.g).getReference();
                        if (b10 == null ? str3 == null : b10.equals(str3)) {
                            return;
                        }
                        ((AtomicMarkableReference) o3Var.g).set(b10, true);
                        ((ba.e) o3Var.b).b.a(new ca.r(o3Var, 0));
                        return;
                    } finally {
                    }
                }
            case 4:
                t tVar2 = (t) this.b;
                Throwable th2 = (Throwable) this.c;
                Map map = Collections.EMPTY_MAP;
                p pVar = tVar2.f;
                Thread currentThread = Thread.currentThread();
                pVar.getClass();
                long currentTimeMillis = System.currentTimeMillis();
                v vVar = pVar.n;
                if (vVar == null || !vVar.e.get()) {
                    long j10 = currentTimeMillis / 1000;
                    String g10 = pVar.g();
                    if (g10 == null) {
                        Log.w("FirebaseCrashlytics", "Tried to write a non-fatal exception while no session was open.", null);
                        return;
                    }
                    ca.c cVar = new ca.c(g10, j10, map);
                    e0 e0Var = pVar.m;
                    e0Var.getClass();
                    String concat = "Persisting non-fatal event for session ".concat(g10);
                    if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                        Log.v("FirebaseCrashlytics", concat, null);
                    }
                    e0Var.g(th2, currentThread, "error", cVar, false);
                    return;
                }
                return;
            case 5:
                ((l) this.b).a((Intent) this.c);
                return;
            case 6:
                FirebaseMessaging firebaseMessaging = (FirebaseMessaging) this.b;
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.c;
                ob.c cVar2 = FirebaseMessaging.m;
                try {
                    taskCompletionSource.setResult(firebaseMessaging.a());
                    return;
                } catch (Exception e10) {
                    taskCompletionSource.setException(e10);
                    return;
                }
            case 7:
                u uVar = (u) this.b;
                TaskCompletionSource taskCompletionSource2 = (TaskCompletionSource) this.c;
                try {
                    taskCompletionSource2.setResult(uVar.a());
                    return;
                } catch (Exception e11) {
                    taskCompletionSource2.setException(e11);
                    return;
                }
            case 8:
                boolean[] zArr = (boolean[]) this.b;
                ArrayList arrayList = (ArrayList) this.c;
                if (zArr[0]) {
                    return;
                }
                zArr[0] = true;
                ai.d.d = false;
                int size = arrayList.size();
                int i13 = 0;
                while (i13 < size) {
                    Object obj = arrayList.get(i13);
                    i13++;
                    try {
                        ((SpeechRecognizer) obj).destroy();
                    } catch (Throwable unused) {
                    }
                }
                return;
            case 9:
                boolean[] zArr2 = (boolean[]) this.b;
                e eVar = (e) this.c;
                if (!zArr2[0]) {
                    Log.d("Dictation", "support probe: no answer");
                }
                eVar.run();
                return;
            case 10:
                ((ai.f) this.b).c(null, ((TLRPC.TL_composedMessageWithAI) this.c).result_text.text);
                return;
            case 11:
                z zVar = (z) this.b;
                u1 u1Var = (u1) this.c;
                byte[] bArr = new byte[3200];
                while (!zVar.d) {
                    int read = zVar.e.read(bArr, 0, 3200);
                    if (read <= 0) {
                        if (read < 0) {
                            Log.d("Dictation", "audio read " + read);
                            return;
                        }
                        return;
                    }
                    zVar.a(read, bArr);
                    int i14 = read / 2;
                    double d = 0.0d;
                    for (int i15 = 0; i15 < i14; i15++) {
                        int i16 = i15 * 2;
                        double d2 = (short) ((bArr[i16 + 1] << 8) | (bArr[i16] & 255));
                        d += d2 * d2;
                    }
                    u1Var.a((float) Math.max(0.0d, Math.min(1.0d, ((Math.log10(Math.max(1.0d, Math.sqrt(d / Math.max(1, i14)))) * 20.0d) - 42.0d) / 30.0d)));
                }
                return;
            case 12:
                n0 n0Var = (n0) this.b;
                String str4 = (String) this.c;
                n0Var.getClass();
                DictationAsr.S(str4);
                DictationAsr.r(DictationAsr.H(str4));
                n0Var.w.setLanguage(n0.p(str4));
                if (n0Var.r != 1 || (c2Var = n0Var.G) == null) {
                    return;
                }
                c2Var.p(str4);
                return;
            case 13:
                ((n0) this.b).c((ai.g) this.c);
                return;
            case 14:
                n0 n0Var2 = (n0) this.b;
                c2 c2Var2 = (c2) this.c;
                if (n0Var2.G == c2Var2 && n0Var2.r == 1) {
                    c2Var2.s();
                    return;
                }
                return;
            case 15:
                ((y2) this.b).a((ai.g) this.c);
                return;
            case 16:
                g0.g3(new b1((x10) this.c, DictationLid.m((byte[]) this.b).length / 32, 0));
                return;
            case 17:
                c2 c2Var3 = (c2) this.b;
                Runnable runnable = (Runnable) this.c;
                if (c2Var3.j) {
                    return;
                }
                runnable.run();
                return;
            case 18:
                p2 p2Var = (p2) this.b;
                a0 a0Var5 = (a0) this.c;
                p2Var.getClass();
                SparseArray sparseArray = new SparseArray();
                int i17 = 0;
                while (p2Var.d) {
                    try {
                        byte[] readIncomingAudio = NativeInstance.readIncomingAudio();
                        long currentTimeMillis2 = System.currentTimeMillis();
                        if (readIncomingAudio != null) {
                            ByteBuffer order = ByteBuffer.wrap(readIncomingAudio).order(ByteOrder.LITTLE_ENDIAN);
                            while (true) {
                                if (order.remaining() >= i12) {
                                    int i18 = order.getInt();
                                    int i19 = order.getInt() * 2;
                                    i7 = i12;
                                    int position = order.position();
                                    if (i19 <= order.remaining()) {
                                        order.position(position + i19);
                                        if (i18 == 0) {
                                            p2Var.a.getClass();
                                            VoIPService sharedInstance = VoIPService.getSharedInstance();
                                            if (sharedInstance == null || sharedInstance.isMicMute()) {
                                                i12 = i7;
                                            }
                                        }
                                        o2 o2Var = (o2) sparseArray.get(i18);
                                        if (o2Var == null) {
                                            o2Var = new o2(p2Var, i18);
                                            a0Var = a0Var5;
                                            long j11 = p2Var.f;
                                            i10 = i19;
                                            p2Var.f = j11 + 1;
                                            o2Var.f = j11;
                                            if (i18 == 0 && p2Var.c) {
                                                ExecutorService executorService = DictationLid.a;
                                                o2Var.k = mp.g1().getString("tinylid_lang", str);
                                            }
                                            sparseArray.put(i18, o2Var);
                                        } else {
                                            i10 = i19;
                                            a0Var = a0Var5;
                                        }
                                        int i20 = i10 / 2;
                                        if (i20 == 0) {
                                            sqrt = 0.0f;
                                            byteBuffer = order;
                                        } else {
                                            int i21 = 0;
                                            double d10 = 0.0d;
                                            while (i21 < i20) {
                                                int i22 = (i21 * 2) + position;
                                                ByteBuffer byteBuffer3 = order;
                                                double d11 = (short) ((readIncomingAudio[i22 + 1] << 8) | (readIncomingAudio[i22] & 255));
                                                d10 += d11 * d11;
                                                i21++;
                                                order = byteBuffer3;
                                            }
                                            byteBuffer = order;
                                            sqrt = (float) Math.sqrt(d10 / i20);
                                        }
                                        boolean z11 = sqrt >= 400.0f;
                                        if (z11) {
                                            o2Var.e = currentTimeMillis2;
                                        }
                                        if (o2Var.d == null) {
                                            if (!z11 || i17 >= 4) {
                                                j3 = 0;
                                                a0Var5 = a0Var;
                                            } else {
                                                String str5 = o2Var.k;
                                                if (str5 != null) {
                                                    a0Var5 = a0Var;
                                                    a0Var2 = DictationAsr.R(str5, a0Var5, false);
                                                } else {
                                                    a0Var5 = a0Var;
                                                    a0Var2 = null;
                                                }
                                                if (a0Var2 != null) {
                                                    ai.t tVar3 = (ai.t) a0Var2.b;
                                                    ai.t[] tVarArr = DictationAsr.a;
                                                    if (tVar3 != null) {
                                                        a0Var4 = a0Var2;
                                                        if (tVar3.d != 0) {
                                                            z10 = true;
                                                            if (z10) {
                                                                a0Var3 = a0Var4;
                                                                c10 = x.c(a0Var3, o2Var);
                                                                o2Var.d = c10;
                                                                if (c10 == null) {
                                                                    i17++;
                                                                    o2Var.h = 0;
                                                                    o2Var.g = 0;
                                                                    o2Var.e();
                                                                    o2Var.c(0, o2Var.c, o2Var.b);
                                                                    x xVar = o2Var.d;
                                                                    byte[] bArr2 = o2Var.b;
                                                                    int i23 = o2Var.c;
                                                                    j3 = 0;
                                                                    long j12 = xVar.c;
                                                                    if (j12 != 0) {
                                                                        byteBuffer2 = byteBuffer;
                                                                        nativeSessionPush2 = DictationAsr.nativeSessionPush(j12, bArr2, 0, i23);
                                                                        xVar.b(nativeSessionPush2);
                                                                    } else {
                                                                        byteBuffer2 = byteBuffer;
                                                                    }
                                                                    o2Var.c = 0;
                                                                    if (o2Var.d == null) {
                                                                        o2Var.d(position, i10, readIncomingAudio);
                                                                        i12 = i7;
                                                                        order = byteBuffer2;
                                                                        str = null;
                                                                    }
                                                                } else {
                                                                    j3 = 0;
                                                                }
                                                            }
                                                        }
                                                    } else {
                                                        a0Var4 = a0Var2;
                                                    }
                                                    z10 = false;
                                                    if (z10) {
                                                    }
                                                }
                                                a0Var3 = a0Var5;
                                                c10 = x.c(a0Var3, o2Var);
                                                o2Var.d = c10;
                                                if (c10 == null) {
                                                }
                                            }
                                            byteBuffer2 = byteBuffer;
                                            if (o2Var.d == null) {
                                            }
                                        } else {
                                            j3 = 0;
                                            a0Var5 = a0Var;
                                            byteBuffer2 = byteBuffer;
                                        }
                                        int i24 = i10;
                                        o2Var.c(position, i24, readIncomingAudio);
                                        x xVar2 = o2Var.d;
                                        long j13 = xVar2.c;
                                        if (j13 != j3) {
                                            nativeSessionPush = DictationAsr.nativeSessionPush(j13, readIncomingAudio, position, i24);
                                            xVar2.b(nativeSessionPush);
                                        }
                                        o2Var.a();
                                        i12 = i7;
                                        order = byteBuffer2;
                                        str = null;
                                    }
                                } else {
                                    i7 = i12;
                                }
                            }
                        } else {
                            i7 = i12;
                        }
                        while (true) {
                            Runnable runnable2 = (Runnable) p2Var.b.poll();
                            if (runnable2 != null) {
                                runnable2.run();
                            } else {
                                for (int i25 = 0; i25 < sparseArray.size(); i25++) {
                                    o2 o2Var2 = (o2) sparseArray.valueAt(i25);
                                    long j14 = currentTimeMillis2 - o2Var2.e;
                                    x xVar3 = o2Var2.d;
                                    if (xVar3 != null && j14 > 6000) {
                                        xVar3.a();
                                        o2Var2.d = null;
                                        i17--;
                                        o2Var2.b();
                                        o2Var2.e();
                                    } else if (xVar3 != null && j14 > 1600 && o2Var2.i && !o2Var2.j.isEmpty()) {
                                        o2Var2.b();
                                        o2Var2.g = o2Var2.h;
                                    }
                                }
                                Thread.sleep(60L);
                                i12 = i7;
                                str = null;
                            }
                        }
                    } catch (InterruptedException unused2) {
                        for (int i26 = 0; i26 < sparseArray.size(); i26++) {
                            o2 o2Var3 = (o2) sparseArray.valueAt(i26);
                            x xVar4 = o2Var3.d;
                            if (xVar4 != null) {
                                xVar4.a();
                                o2Var3.d = null;
                            }
                            o2Var3.b();
                        }
                        return;
                    } catch (Throwable th3) {
                        try {
                            Log.e("Dictation", "live captions", th3);
                            for (int i27 = 0; i27 < sparseArray.size(); i27++) {
                                o2 o2Var4 = (o2) sparseArray.valueAt(i27);
                                x xVar5 = o2Var4.d;
                                if (xVar5 != null) {
                                    xVar5.a();
                                    o2Var4.d = null;
                                }
                                o2Var4.b();
                            }
                            return;
                        } finally {
                            for (int i28 = 0; i28 < sparseArray.size(); i28++) {
                                o2 o2Var5 = (o2) sparseArray.valueAt(i28);
                                x xVar6 = o2Var5.d;
                                if (xVar6 != null) {
                                    xVar6.a();
                                    o2Var5.d = null;
                                }
                                o2Var5.b();
                            }
                        }
                    }
                }
                return;
            case 19:
                ViewGroup container = (ViewGroup) this.b;
                j.e(container, "$container");
                container.endViewTransition(null);
                throw null;
            case 20:
                ((v0.g) this.b).a(this.c);
                return;
            case 21:
                ((v0.g) this.b).onResult((n) this.c);
                return;
            case 22:
                bi.d dVar = (bi.d) this.b;
                View.OnClickListener onClickListener = (View.OnClickListener) this.c;
                dVar.getClass();
                onClickListener.onClick(dVar);
                return;
            case 23:
                ((v2) this.b).k().g0((TLRPC.TL_error) this.c, false);
                return;
            case 24:
                c3 c3Var = (c3) this.b;
                TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) this.c;
                c3Var.getClass();
                if (savedStarGift.unsaved) {
                    return;
                }
                c3Var.G.setVisibility(8);
                return;
            case 25:
                TL_stars.StarGift starGift = (TL_stars.StarGift) this.b;
                CharSequence charSequence = (CharSequence) this.c;
                h2 T = LaunchActivity.T();
                lc b02 = T != null ? lc.b0(T) : lc.Y();
                TLRPC.Document document = starGift.getDocument();
                gc q10 = document != null ? b02.q(document, charSequence) : b02.Q(R.raw.contact_check, 36, charSequence);
                q10.t = true;
                q10.j();
                return;
            case 26:
                eq0 eq0Var = (eq0) this.b;
                TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) this.c;
                eq0Var.h(tL_starGiftCollection.title, new v1(i11, eq0Var, tL_starGiftCollection));
                return;
            case 27:
                k6 k6Var = (k6) this.b;
                g0.g((String) this.c);
                lc.b0(k6Var.a.a).k(false).j();
                return;
            case 28:
                ((c1.f) this.b).f().a(((r) this.c).a);
                return;
            default:
                ((c1.f) this.b).f().a((h) this.c);
                return;
        }
    }

    public /* synthetic */ e(t tVar, Throwable th2) {
        this.a = 4;
        Map map = Collections.EMPTY_MAP;
        this.b = tVar;
        this.c = th2;
    }
}
