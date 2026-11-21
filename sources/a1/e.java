package a1;

import aa.e0;
import aa.p;
import aa.t;
import aa.v;
import ab.l;
import ab.u;
import ai.d1;
import ai.e2;
import ai.f0;
import ai.m0;
import ai.p0;
import ai.q2;
import ai.r2;
import ai.w1;
import ai.x;
import ai.x1;
import ai.y2;
import ai.z;
import android.content.Intent;
import android.speech.SpeechRecognizer;
import android.support.v4.media.session.a0;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import bi.b1;
import bi.g3;
import bi.n6;
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
import org.telegram.messenger.ks;
import org.telegram.messenger.mp;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.messenger.x10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.g2;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.gq0;
import org.telegram.ui.Components.lc;
import org.telegram.ui.Components.z2;
import org.telegram.ui.Dictation.DictationAsr;
import org.telegram.ui.Dictation.DictationLid;
import org.telegram.ui.LaunchActivity;
import v0.n;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
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
    /* JADX WARN: Removed duplicated region for block: B:102:0x0297 A[Catch: all -> 0x0215, InterruptedException -> 0x03c3, TryCatch #11 {InterruptedException -> 0x03c3, all -> 0x0215, blocks: (B:181:0x02fd, B:183:0x0307, B:186:0x030c, B:188:0x0312, B:192:0x0326, B:194:0x0350, B:198:0x033d, B:200:0x0341, B:202:0x0349, B:209:0x0353, B:75:0x0211, B:76:0x021b, B:83:0x0258, B:84:0x025a, B:89:0x0263, B:91:0x0267, B:93:0x0274, B:95:0x027c, B:100:0x028f, B:102:0x0297, B:104:0x02b6, B:105:0x02be, B:106:0x02c7, B:108:0x02cb, B:112:0x02dc, B:114:0x02e7, B:115:0x02ee, B:127:0x0228, B:129:0x0243), top: B:180:0x02fd }] */
    /* JADX WARN: Removed duplicated region for block: B:116:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x03ca  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x038e  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x028b  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        SparseArray sparseArray;
        int i7;
        int i10;
        int i11;
        a0 a0Var;
        ByteBuffer byteBuffer;
        SparseArray sparseArray2;
        a0 a0Var2;
        float sqrt;
        long j3;
        String nativeSessionPush;
        a0 a0Var3;
        a0 a0Var4;
        x c10;
        String nativeSessionPush2;
        boolean z10;
        int i12 = 4;
        int i13 = 8;
        String str = null;
        boolean z11 = true;
        int i14 = 0;
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
                int i15 = 0;
                while (i15 < size) {
                    Object obj = arrayList.get(i15);
                    i15++;
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
                w1 w1Var = (w1) this.c;
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
                    int i16 = read / 2;
                    double d = 0.0d;
                    for (int i17 = 0; i17 < i16; i17++) {
                        int i18 = i17 * 2;
                        double d2 = (short) ((bArr[i18 + 1] << 8) | (bArr[i18] & 255));
                        d += d2 * d2;
                    }
                    w1Var.a((float) Math.max(0.0d, Math.min(1.0d, ((Math.log10(Math.max(1.0d, Math.sqrt(d / Math.max(1, i16)))) * 20.0d) - 42.0d) / 30.0d)));
                }
                return;
            case 12:
                ((p0) this.b).A((String) this.c);
                return;
            case 13:
                ((p0) this.b).c((ai.g) this.c);
                return;
            case 14:
                p0 p0Var = (p0) this.b;
                e2 e2Var = (e2) this.c;
                if (p0Var.G == e2Var && p0Var.r == 1) {
                    e2Var.s();
                    return;
                }
                return;
            case 15:
                ((z2) this.b).a((ai.g) this.c);
                return;
            case 16:
                g0.g3(new d1((x10) this.c, DictationLid.m((byte[]) this.b).length / 32, 0));
                return;
            case 17:
                e2 e2Var2 = (e2) this.b;
                Runnable runnable = (Runnable) this.c;
                if (e2Var2.j) {
                    return;
                }
                runnable.run();
                return;
            case 18:
                r2 r2Var = (r2) this.b;
                a0 a0Var5 = (a0) this.c;
                r2Var.getClass();
                SparseArray sparseArray3 = new SparseArray();
                int i19 = 0;
                while (r2Var.d) {
                    try {
                        byte[] readIncomingAudio = NativeInstance.readIncomingAudio();
                        long currentTimeMillis2 = System.currentTimeMillis();
                        if (readIncomingAudio != null) {
                            ByteBuffer order = ByteBuffer.wrap(readIncomingAudio).order(ByteOrder.LITTLE_ENDIAN);
                            while (true) {
                                if (order.remaining() >= i13) {
                                    int i20 = order.getInt();
                                    i11 = i13;
                                    int i21 = order.getInt() * 2;
                                    int position = order.position();
                                    if (i21 <= order.remaining()) {
                                        order.position(position + i21);
                                        if (i20 == 0) {
                                            r2Var.a.getClass();
                                            VoIPService sharedInstance = VoIPService.getSharedInstance();
                                            if (sharedInstance == null || sharedInstance.isMicMute()) {
                                                i13 = i11;
                                            }
                                        }
                                        q2 q2Var = (q2) sparseArray3.get(i20);
                                        if (q2Var == null) {
                                            q2Var = new q2(r2Var, i20);
                                            byteBuffer = order;
                                            long j11 = r2Var.f;
                                            SparseArray sparseArray4 = sparseArray3;
                                            try {
                                                r2Var.f = j11 + 1;
                                                q2Var.f = j11;
                                                if (i20 == 0 && r2Var.c) {
                                                    ExecutorService executorService = DictationLid.a;
                                                    q2Var.k = mp.g1().getString("tinylid_lang", str);
                                                }
                                                sparseArray2 = sparseArray4;
                                                sparseArray2.put(i20, q2Var);
                                            } catch (InterruptedException unused2) {
                                                sparseArray = sparseArray4;
                                                while (i10 < sparseArray.size()) {
                                                }
                                                return;
                                            } catch (Throwable th3) {
                                                th = th3;
                                                sparseArray = sparseArray4;
                                                try {
                                                    Log.e("Dictation", "live captions", th);
                                                    while (i7 < sparseArray.size()) {
                                                    }
                                                    return;
                                                } catch (Throwable th4) {
                                                    for (int i22 = 0; i22 < sparseArray.size(); i22++) {
                                                        q2 q2Var2 = (q2) sparseArray.valueAt(i22);
                                                        x xVar = q2Var2.d;
                                                        if (xVar != null) {
                                                            xVar.a();
                                                            q2Var2.d = null;
                                                        }
                                                        q2Var2.b();
                                                    }
                                                    throw th4;
                                                }
                                            }
                                        } else {
                                            byteBuffer = order;
                                            sparseArray2 = sparseArray3;
                                        }
                                        int i23 = i21 / 2;
                                        if (i23 == 0) {
                                            sqrt = 0.0f;
                                            a0Var2 = a0Var5;
                                        } else {
                                            int i24 = 0;
                                            double d10 = 0.0d;
                                            while (i24 < i23) {
                                                int i25 = (i24 * 2) + position;
                                                double d11 = (short) ((readIncomingAudio[i25 + 1] << 8) | (readIncomingAudio[i25] & 255));
                                                d10 = (d11 * d11) + d10;
                                                i24++;
                                                a0Var5 = a0Var5;
                                            }
                                            a0Var2 = a0Var5;
                                            sqrt = (float) Math.sqrt(d10 / i23);
                                        }
                                        boolean z12 = sqrt >= 400.0f;
                                        if (z12) {
                                            q2Var.e = currentTimeMillis2;
                                        }
                                        if (q2Var.d == null) {
                                            if (!z12 || i19 >= 4) {
                                                j3 = 0;
                                            } else {
                                                String str4 = q2Var.k;
                                                if (str4 != null) {
                                                    a0Var3 = a0Var2;
                                                    a0Var4 = DictationAsr.V(str4, a0Var3, false);
                                                } else {
                                                    a0Var3 = a0Var2;
                                                    a0Var4 = null;
                                                }
                                                if (a0Var4 != null) {
                                                    ai.t tVar3 = (ai.t) a0Var4.b;
                                                    ai.t[] tVarArr = DictationAsr.a;
                                                    if (tVar3 != null) {
                                                        j3 = 0;
                                                        if (tVar3.f != 0) {
                                                            z10 = true;
                                                            if (z10) {
                                                                c10 = x.c(a0Var4, q2Var);
                                                                q2Var.d = c10;
                                                                if (c10 == null) {
                                                                    i19++;
                                                                    q2Var.h = 0;
                                                                    q2Var.g = 0;
                                                                    q2Var.e();
                                                                    q2Var.c(0, q2Var.c, q2Var.b);
                                                                    x xVar2 = q2Var.d;
                                                                    byte[] bArr2 = q2Var.b;
                                                                    int i26 = q2Var.c;
                                                                    a0Var2 = a0Var3;
                                                                    long j12 = xVar2.c;
                                                                    if (j12 != j3) {
                                                                        nativeSessionPush2 = DictationAsr.nativeSessionPush(j12, bArr2, 0, i26);
                                                                        xVar2.b(nativeSessionPush2);
                                                                    }
                                                                    q2Var.c = 0;
                                                                } else {
                                                                    a0Var2 = a0Var3;
                                                                }
                                                            }
                                                        }
                                                    } else {
                                                        j3 = 0;
                                                    }
                                                    z10 = false;
                                                    if (z10) {
                                                    }
                                                } else {
                                                    j3 = 0;
                                                }
                                                a0Var4 = a0Var3;
                                                c10 = x.c(a0Var4, q2Var);
                                                q2Var.d = c10;
                                                if (c10 == null) {
                                                }
                                            }
                                            if (q2Var.d == null) {
                                                q2Var.d(position, i21, readIncomingAudio);
                                                sparseArray3 = sparseArray2;
                                                i13 = i11;
                                                order = byteBuffer;
                                                a0Var5 = a0Var2;
                                                str = null;
                                            }
                                        } else {
                                            j3 = 0;
                                        }
                                        q2Var.c(position, i21, readIncomingAudio);
                                        x xVar3 = q2Var.d;
                                        long j13 = xVar3.c;
                                        if (j13 != j3) {
                                            nativeSessionPush = DictationAsr.nativeSessionPush(j13, readIncomingAudio, position, i21);
                                            xVar3.b(nativeSessionPush);
                                        }
                                        q2Var.a();
                                        sparseArray3 = sparseArray2;
                                        i13 = i11;
                                        order = byteBuffer;
                                        a0Var5 = a0Var2;
                                        str = null;
                                    }
                                } else {
                                    i11 = i13;
                                }
                            }
                            a0Var = a0Var5;
                            sparseArray = sparseArray3;
                        } else {
                            i11 = i13;
                            a0Var = a0Var5;
                            sparseArray = sparseArray3;
                        }
                        while (true) {
                            try {
                                Runnable runnable2 = (Runnable) r2Var.b.poll();
                                if (runnable2 != null) {
                                    runnable2.run();
                                } else {
                                    for (int i27 = 0; i27 < sparseArray.size(); i27++) {
                                        q2 q2Var3 = (q2) sparseArray.valueAt(i27);
                                        long j14 = currentTimeMillis2 - q2Var3.e;
                                        x xVar4 = q2Var3.d;
                                        if (xVar4 != null && j14 > 6000) {
                                            xVar4.a();
                                            q2Var3.d = null;
                                            i19--;
                                            q2Var3.b();
                                            q2Var3.e();
                                        } else if (xVar4 != null && j14 > 1600 && q2Var3.i && !q2Var3.j.isEmpty()) {
                                            q2Var3.b();
                                            q2Var3.g = q2Var3.h;
                                        }
                                    }
                                    Thread.sleep(60L);
                                    sparseArray3 = sparseArray;
                                    i13 = i11;
                                    a0Var5 = a0Var;
                                    str = null;
                                }
                            } catch (InterruptedException unused3) {
                                for (i10 = 0; i10 < sparseArray.size(); i10++) {
                                    q2 q2Var4 = (q2) sparseArray.valueAt(i10);
                                    x xVar5 = q2Var4.d;
                                    if (xVar5 != null) {
                                        xVar5.a();
                                        q2Var4.d = null;
                                    }
                                    q2Var4.b();
                                }
                                return;
                            } catch (Throwable th5) {
                                th = th5;
                                Log.e("Dictation", "live captions", th);
                                for (i7 = 0; i7 < sparseArray.size(); i7++) {
                                    q2 q2Var5 = (q2) sparseArray.valueAt(i7);
                                    x xVar6 = q2Var5.d;
                                    if (xVar6 != null) {
                                        xVar6.a();
                                        q2Var5.d = null;
                                    }
                                    q2Var5.b();
                                }
                                return;
                            }
                        }
                    } catch (InterruptedException unused4) {
                        sparseArray = sparseArray3;
                    } catch (Throwable th6) {
                        th = th6;
                        sparseArray = sparseArray3;
                    }
                }
                SparseArray sparseArray5 = sparseArray3;
                for (int i28 = 0; i28 < sparseArray5.size(); i28++) {
                    q2 q2Var6 = (q2) sparseArray5.valueAt(i28);
                    x xVar7 = q2Var6.d;
                    if (xVar7 != null) {
                        xVar7.a();
                        q2Var6.d = null;
                    }
                    q2Var6.b();
                }
                return;
            case 19:
                ai.z2 z2Var = (ai.z2) this.b;
                y2 y2Var = (y2) this.c;
                View view = y2Var.W;
                View view2 = z2Var.fragmentView;
                if (!(view2 instanceof ViewGroup) || view == null) {
                    return;
                }
                ViewGroup viewGroup = (ViewGroup) view2;
                b1 b1Var = new b1(z2Var.getParentActivity(), view, z2Var.getResourceProvider(), new c(z2Var, 9));
                b1Var.M = g0.L(ks.x3);
                b1Var.L = 0;
                b1Var.S = true;
                int w02 = m6.w0(m6.G6, z2Var.getResourceProvider());
                String d02 = DictationAsr.d0(y2Var.f, y2Var.a);
                String[] strArr = y2Var.V;
                int length = strArr.length;
                while (i14 < length) {
                    String str5 = strArr[i14];
                    b1Var.a(new m0(z2Var.getParentActivity(), p0.N(str5), null, w02, str5.equals(d02)), 44, new e(20, y2Var, str5));
                    i14++;
                    z11 = true;
                }
                b1Var.setFocusableInTouchMode(z11);
                b1Var.setOnKeyListener(new f0(3, b1Var));
                viewGroup.addView(b1Var, new FrameLayout.LayoutParams(-1, -1));
                b1Var.requestFocus();
                b1Var.f();
                return;
            case 20:
                y2 y2Var2 = (y2) this.b;
                DictationAsr.Z(y2Var2.a, (String) this.c);
                y2Var2.c();
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
                ((bi.z2) this.b).k().g0((TLRPC.TL_error) this.c, false);
                return;
            case 26:
                g3 g3Var = (g3) this.b;
                TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) this.c;
                g3Var.getClass();
                if (savedStarGift.unsaved) {
                    return;
                }
                g3Var.G.setVisibility(8);
                return;
            case 27:
                TL_stars.StarGift starGift = (TL_stars.StarGift) this.b;
                CharSequence charSequence = (CharSequence) this.c;
                g2 T = LaunchActivity.T();
                lc b02 = T != null ? lc.b0(T) : lc.Y();
                TLRPC.Document document = starGift.getDocument();
                gc q10 = document != null ? b02.q(document, charSequence) : b02.Q(R.raw.contact_check, 36, charSequence);
                q10.t = true;
                q10.j();
                return;
            case 28:
                gq0 gq0Var = (gq0) this.b;
                TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) this.c;
                gq0Var.h(tL_starGiftCollection.title, new x1(i12, gq0Var, tL_starGiftCollection));
                return;
            default:
                n6 n6Var = (n6) this.b;
                g0.g((String) this.c);
                lc.b0(n6Var.a.a).k(false).j();
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
