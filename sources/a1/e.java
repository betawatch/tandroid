package a1;

import aa.e0;
import aa.p;
import aa.t;
import aa.v;
import ab.l;
import ab.u;
import ai.b1;
import ai.c2;
import ai.h;
import ai.n0;
import ai.o2;
import ai.p2;
import ai.u1;
import ai.v1;
import ai.x;
import ai.z;
import android.content.Intent;
import android.os.ParcelFileDescriptor;
import android.os.SystemClock;
import android.speech.SpeechRecognizer;
import android.support.v4.media.session.a0;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import bi.b2;
import bi.c4;
import bi.i2;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.messaging.FirebaseMessaging;
import java.io.File;
import java.io.FileInputStream;
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
import org.telegram.messenger.g0;
import org.telegram.messenger.np;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.messenger.z10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.q2;
import org.telegram.ui.Components.wp0;
import org.telegram.ui.Dictation.DictationAsr;
import org.telegram.ui.Dictation.DictationLid;
import v0.n;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
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

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01b7 A[Catch: all -> 0x010f, InterruptedException -> 0x02d2, TryCatch #12 {InterruptedException -> 0x02d2, all -> 0x010f, blocks: (B:27:0x00b8, B:29:0x00bc, B:31:0x00c8, B:32:0x00d6, B:34:0x00dc, B:109:0x0211, B:111:0x021b, B:114:0x0220, B:116:0x0226, B:120:0x023a, B:122:0x0264, B:126:0x0251, B:128:0x0255, B:130:0x025d, B:137:0x0267, B:36:0x00f4, B:38:0x00fb, B:40:0x0106, B:43:0x0112, B:45:0x011a, B:47:0x012f, B:49:0x0133, B:50:0x0141, B:51:0x0149, B:58:0x0182, B:59:0x0184, B:64:0x018d, B:66:0x0191, B:68:0x019a, B:70:0x01a2, B:75:0x01af, B:77:0x01b7, B:79:0x01d4, B:80:0x01dc, B:84:0x01df, B:86:0x01e3, B:90:0x01f0, B:92:0x01fd, B:93:0x0204, B:97:0x0154, B:99:0x016d), top: B:26:0x00b8 }] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        c2 c2Var;
        int read;
        int i7;
        ByteBuffer byteBuffer;
        int i10;
        float sqrt;
        String nativeSessionPush;
        x c10;
        String nativeSessionPush2;
        int i11 = 8;
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
                        ((ba.e) o3Var.b).b.a(new a3.f(o3Var, 26));
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
                    long j3 = currentTimeMillis / 1000;
                    String g10 = pVar.g();
                    if (g10 == null) {
                        Log.w("FirebaseCrashlytics", "Tried to write a non-fatal exception while no session was open.", null);
                        return;
                    }
                    ca.c cVar = new ca.c(g10, j3, map);
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
                int i12 = 0;
                while (i12 < size) {
                    Object obj = arrayList.get(i12);
                    i12++;
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
                ((ai.g) this.b).g(((TLRPC.TL_composedMessageWithAI) this.c).result_text.text);
                return;
            case 11:
                ((ai.g) this.b).g((String) this.c);
                return;
            case 12:
                z zVar = (z) this.b;
                u1 u1Var = (u1) this.c;
                byte[] bArr = new byte[3200];
                while (!zVar.d) {
                    int read2 = zVar.e.read(bArr, 0, 3200);
                    if (read2 <= 0) {
                        if (read2 < 0) {
                            Log.d("Dictation", "audio read " + read2);
                            return;
                        }
                        return;
                    }
                    zVar.a(read2, bArr);
                    int i13 = read2 / 2;
                    double d = 0.0d;
                    for (int i14 = 0; i14 < i13; i14++) {
                        int i15 = i14 * 2;
                        double d2 = (short) ((bArr[i15 + 1] << 8) | (bArr[i15] & 255));
                        d += d2 * d2;
                    }
                    u1Var.a((float) Math.max(0.0d, Math.min(1.0d, ((Math.log10(Math.max(1.0d, Math.sqrt(d / Math.max(1, i13)))) * 20.0d) - 42.0d) / 30.0d)));
                }
                return;
            case 13:
                n0 n0Var = (n0) this.b;
                String str4 = (String) this.c;
                n0Var.getClass();
                DictationAsr.S(str4);
                DictationAsr.s(DictationAsr.H(str4));
                n0Var.w.setLanguage(n0.l(str4));
                if (n0Var.r != 1 || (c2Var = n0Var.G) == null) {
                    return;
                }
                c2Var.p(str4);
                return;
            case 14:
                ((n0) this.b).c((h) this.c);
                return;
            case 15:
                n0 n0Var2 = (n0) this.b;
                c2 c2Var2 = (c2) this.c;
                if (n0Var2.G == c2Var2 && n0Var2.r == 1) {
                    c2Var2.s();
                    return;
                }
                return;
            case 16:
                ((q2) this.b).a((h) this.c);
                return;
            case 17:
                g0.h3(new b1((z10) this.c, DictationLid.m((byte[]) this.b).length / 32, 0));
                return;
            case 18:
                c2 c2Var3 = (c2) this.b;
                Runnable runnable = (Runnable) this.c;
                if (c2Var3.j) {
                    return;
                }
                runnable.run();
                return;
            case 19:
                File file = (File) this.b;
                ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) this.c;
                byte[] bArr2 = new byte[3200];
                try {
                    FileInputStream fileInputStream = new FileInputStream(file);
                    try {
                        ParcelFileDescriptor.AutoCloseOutputStream autoCloseOutputStream = new ParcelFileDescriptor.AutoCloseOutputStream(parcelFileDescriptor);
                        try {
                            long elapsedRealtime = SystemClock.elapsedRealtime();
                            long j10 = 0;
                            while (!Thread.interrupted() && (read = fileInputStream.read(bArr2)) > 0) {
                                autoCloseOutputStream.write(bArr2, 0, read);
                                j10 += read;
                                long elapsedRealtime2 = (((j10 * 1000) / 32000) + elapsedRealtime) - SystemClock.elapsedRealtime();
                                if (elapsedRealtime2 > 0) {
                                    Thread.sleep(elapsedRealtime2);
                                }
                            }
                            byte[] bArr3 = new byte[3200];
                            for (int i16 = 0; i16 < 40 && !Thread.interrupted(); i16++) {
                                autoCloseOutputStream.write(bArr3);
                                Thread.sleep(100L);
                            }
                            Log.d("Dictation", "test source done");
                            autoCloseOutputStream.close();
                            fileInputStream.close();
                            return;
                        } catch (Throwable th3) {
                            try {
                                autoCloseOutputStream.close();
                                throw th3;
                            } catch (Throwable th4) {
                                th3.addSuppressed(th4);
                                throw th3;
                            }
                        }
                    } finally {
                    }
                } catch (Exception e12) {
                    Log.d("Dictation", "test source closed: " + e12);
                    return;
                }
            case 20:
                p2 p2Var = (p2) this.b;
                a0 a0Var = (a0) this.c;
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
                                if (order.remaining() >= i11) {
                                    int i18 = order.getInt();
                                    i7 = i11;
                                    int i19 = order.getInt() * 2;
                                    int position = order.position();
                                    if (i19 <= order.remaining()) {
                                        order.position(position + i19);
                                        if (i18 == 0) {
                                            p2Var.a.getClass();
                                            VoIPService sharedInstance = VoIPService.getSharedInstance();
                                            if (sharedInstance == null || sharedInstance.isMicMute()) {
                                                i11 = i7;
                                            }
                                        }
                                        o2 o2Var = (o2) sparseArray.get(i18);
                                        if (o2Var == null) {
                                            o2Var = new o2(p2Var, i18);
                                            long j11 = p2Var.f;
                                            byteBuffer = order;
                                            i10 = i19;
                                            p2Var.f = j11 + 1;
                                            o2Var.f = j11;
                                            if (i18 == 0 && p2Var.c) {
                                                ExecutorService executorService = DictationLid.a;
                                                o2Var.k = np.e1().getString("tinylid_lang", str);
                                            }
                                            sparseArray.put(i18, o2Var);
                                        } else {
                                            byteBuffer = order;
                                            i10 = i19;
                                        }
                                        int i20 = i10 / 2;
                                        if (i20 == 0) {
                                            sqrt = 0.0f;
                                        } else {
                                            double d10 = 0.0d;
                                            for (int i21 = 0; i21 < i20; i21++) {
                                                int i22 = (i21 * 2) + position;
                                                double d11 = (short) ((readIncomingAudio[i22] & 255) | (readIncomingAudio[i22 + 1] << 8));
                                                d10 = (d11 * d11) + d10;
                                            }
                                            sqrt = (float) Math.sqrt(d10 / i20);
                                        }
                                        boolean z10 = sqrt >= 400.0f;
                                        if (z10) {
                                            o2Var.e = currentTimeMillis2;
                                        }
                                        if (o2Var.d == null) {
                                            if (z10 && i17 < 4) {
                                                String str5 = o2Var.k;
                                                a0 R = str5 != null ? DictationAsr.R(str5, a0Var, false) : null;
                                                if (R != null) {
                                                    ai.t tVar3 = (ai.t) R.b;
                                                    ai.t[] tVarArr = DictationAsr.a;
                                                    if ((tVar3 == null || tVar3.d == 0) ? false : true) {
                                                        c10 = x.c(R, o2Var);
                                                        o2Var.d = c10;
                                                        if (c10 != null) {
                                                            i17++;
                                                            o2Var.h = 0;
                                                            o2Var.g = 0;
                                                            o2Var.e();
                                                            o2Var.c(0, o2Var.c, o2Var.b);
                                                            x xVar = o2Var.d;
                                                            byte[] bArr4 = o2Var.b;
                                                            int i23 = o2Var.c;
                                                            long j12 = xVar.c;
                                                            if (j12 != 0) {
                                                                nativeSessionPush2 = DictationAsr.nativeSessionPush(j12, bArr4, 0, i23);
                                                                xVar.b(nativeSessionPush2);
                                                            }
                                                            o2Var.c = 0;
                                                        }
                                                    }
                                                }
                                                R = a0Var;
                                                c10 = x.c(R, o2Var);
                                                o2Var.d = c10;
                                                if (c10 != null) {
                                                }
                                            }
                                            if (o2Var.d == null) {
                                                o2Var.d(position, i10, readIncomingAudio);
                                                i11 = i7;
                                                order = byteBuffer;
                                                str = null;
                                            }
                                        }
                                        int i24 = i10;
                                        o2Var.c(position, i24, readIncomingAudio);
                                        x xVar2 = o2Var.d;
                                        long j13 = xVar2.c;
                                        if (j13 != 0) {
                                            nativeSessionPush = DictationAsr.nativeSessionPush(j13, readIncomingAudio, position, i24);
                                            xVar2.b(nativeSessionPush);
                                        }
                                        o2Var.a();
                                        i11 = i7;
                                        order = byteBuffer;
                                        str = null;
                                    }
                                } else {
                                    i7 = i11;
                                }
                            }
                        } else {
                            i7 = i11;
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
                                i11 = i7;
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
                    } catch (Throwable th5) {
                        try {
                            Log.e("Dictation", "live captions", th5);
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
            case 21:
                ViewGroup container = (ViewGroup) this.b;
                j.e(container, "$container");
                container.endViewTransition(null);
                throw null;
            case 22:
                ((v0.g) this.b).a(this.c);
                return;
            case 23:
                ((v0.g) this.b).onResult((n) this.c);
                return;
            case 24:
                bi.d dVar = (bi.d) this.b;
                View.OnClickListener onClickListener = (View.OnClickListener) this.c;
                dVar.getClass();
                onClickListener.onClick(dVar);
                return;
            case 25:
                ((b2) this.b).k().f0((TLRPC.TL_error) this.c, false);
                return;
            case 26:
                i2 i2Var = (i2) this.b;
                TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) this.c;
                i2Var.getClass();
                if (savedStarGift.unsaved) {
                    return;
                }
                i2Var.G.setVisibility(8);
                return;
            case 27:
                wp0 wp0Var = (wp0) this.b;
                TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) this.c;
                wp0Var.h(tL_starGiftCollection.title, new v1(3, wp0Var, tL_starGiftCollection));
                return;
            case 28:
                c4 c4Var = (c4) this.b;
                g0.g((String) this.c);
                cc.a0(c4Var.a.a).k(false).j();
                return;
            default:
                ((c1.f) this.b).f().a(((r) this.c).a);
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
