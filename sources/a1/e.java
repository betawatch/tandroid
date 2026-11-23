package a1;

import aa.e0;
import aa.p;
import aa.t;
import aa.v;
import ab.l;
import ab.u;
import ai.b0;
import ai.i0;
import ai.i2;
import ai.j2;
import ai.l0;
import ai.q;
import ai.q1;
import ai.q2;
import ai.r2;
import ai.s1;
import ai.u0;
import ai.w1;
import android.content.Intent;
import android.support.v4.media.session.a0;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import bi.b1;
import bi.b3;
import bi.i3;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.messaging.FirebaseMessaging;
import hi.j7;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
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
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.g2;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.Components.fc;
import org.telegram.ui.Components.fq0;
import org.telegram.ui.Components.kc;
import org.telegram.ui.Components.y2;
import org.telegram.ui.Dictation.DictationAsr;
import org.telegram.ui.Dictation.DictationLid;
import org.telegram.ui.LaunchActivity;
import v0.n;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
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
    /* JADX WARN: Removed duplicated region for block: B:99:0x0298 A[Catch: all -> 0x01bc, InterruptedException -> 0x038c, TryCatch #6 {InterruptedException -> 0x038c, all -> 0x01bc, blocks: (B:46:0x0167, B:48:0x016b, B:50:0x0175, B:51:0x0181, B:53:0x0187, B:128:0x02c8, B:130:0x02d2, B:133:0x02d7, B:135:0x02dd, B:139:0x02f1, B:141:0x031b, B:145:0x0308, B:147:0x030c, B:149:0x0314, B:156:0x031e, B:55:0x01a1, B:57:0x01a8, B:59:0x01b3, B:62:0x01bf, B:64:0x01c7, B:66:0x01dc, B:68:0x01e0, B:69:0x01ee, B:70:0x01f6, B:77:0x022f, B:78:0x0231, B:83:0x023a, B:85:0x023e, B:87:0x024b, B:90:0x0257, B:92:0x025f, B:94:0x027e, B:96:0x028d, B:97:0x0294, B:99:0x0298, B:103:0x02a8, B:105:0x02b3, B:106:0x02ba, B:116:0x0201, B:118:0x021a), top: B:45:0x0167 }] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i7;
        a0 a0Var;
        ByteBuffer byteBuffer;
        a0 a0Var2;
        float sqrt;
        long j3;
        String nativeSessionPush;
        a0 a0Var3;
        a0 a0Var4;
        String nativeSessionPush2;
        int i10 = 4;
        int i11 = 8;
        String str = null;
        int i12 = 0;
        boolean z10 = true;
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
                synchronized (((AtomicMarkableReference) o3Var.h)) {
                    try {
                        String str3 = (String) ((AtomicMarkableReference) o3Var.h).getReference();
                        if (b10 == null ? str3 == null : b10.equals(str3)) {
                            return;
                        }
                        ((AtomicMarkableReference) o3Var.h).set(b10, true);
                        ((ba.e) o3Var.b).b.a(new a3.f(o3Var, 29));
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
                ((ai.b) this.b).b(null, ((TLRPC.TL_composedMessageWithAI) this.c).result_text.text);
                return;
            case 9:
                boolean[] zArr = (boolean[]) this.b;
                j7 j7Var = (j7) this.c;
                q[] qVarArr = DictationAsr.a;
                if (zArr[0]) {
                    return;
                }
                j7Var.a(null, null, true);
                return;
            case 10:
                boolean[] zArr2 = (boolean[]) this.b;
                ai.p pVar2 = (ai.p) this.c;
                q[] qVarArr2 = DictationAsr.a;
                if (zArr2[0]) {
                    return;
                }
                pVar2.a(null, null, true);
                return;
            case 11:
                ai.v vVar2 = (ai.v) this.b;
                q1 q1Var = (q1) this.c;
                byte[] bArr = new byte[3200];
                while (!vVar2.d) {
                    int read = vVar2.e.read(bArr, 0, 3200);
                    if (read <= 0) {
                        if (read < 0) {
                            Log.d("Dictation", "audio read " + read);
                            return;
                        }
                        return;
                    }
                    vVar2.a(read, bArr);
                    int i13 = read / 2;
                    double d = 0.0d;
                    for (int i14 = 0; i14 < i13; i14++) {
                        int i15 = i14 * 2;
                        double d2 = (short) ((bArr[i15 + 1] << 8) | (bArr[i15] & 255));
                        d += d2 * d2;
                    }
                    q1Var.a((float) Math.max(0.0d, Math.min(1.0d, ((Math.log10(Math.max(1.0d, Math.sqrt(d / Math.max(1, i13)))) * 20.0d) - 42.0d) / 30.0d)));
                }
                return;
            case 12:
                ((l0) this.b).y((String) this.c);
                return;
            case 13:
                ((l0) this.b).c((ai.c) this.c);
                return;
            case 14:
                l0 l0Var = (l0) this.b;
                w1 w1Var = (w1) this.c;
                if (l0Var.G == w1Var && l0Var.r == 1) {
                    w1Var.l();
                    return;
                }
                return;
            case 15:
                ((y2) this.b).a((ai.c) this.c);
                return;
            case 16:
                g0.g3(new u0((s1) this.c, DictationLid.j((byte[]) this.b).length / 32, 0));
                return;
            case 17:
                w1 w1Var2 = (w1) this.b;
                Runnable runnable = (Runnable) this.c;
                if (w1Var2.h) {
                    return;
                }
                runnable.run();
                return;
            case 18:
                j2 j2Var = (j2) this.b;
                a0 a0Var5 = (a0) this.c;
                j2Var.getClass();
                SparseArray sparseArray = new SparseArray();
                int i16 = 0;
                while (j2Var.d) {
                    try {
                        byte[] readIncomingAudio = NativeInstance.readIncomingAudio();
                        long currentTimeMillis2 = System.currentTimeMillis();
                        if (readIncomingAudio != null) {
                            ByteBuffer order = ByteBuffer.wrap(readIncomingAudio).order(ByteOrder.LITTLE_ENDIAN);
                            while (true) {
                                if (order.remaining() >= i11) {
                                    int i17 = order.getInt();
                                    i7 = i11;
                                    int i18 = order.getInt() * 2;
                                    int position = order.position();
                                    if (i18 <= order.remaining()) {
                                        order.position(position + i18);
                                        if (i17 == 0) {
                                            j2Var.a.getClass();
                                            VoIPService sharedInstance = VoIPService.getSharedInstance();
                                            if (sharedInstance == null || sharedInstance.isMicMute()) {
                                                i11 = i7;
                                            }
                                        }
                                        i2 i2Var = (i2) sparseArray.get(i17);
                                        if (i2Var == null) {
                                            i2Var = new i2(j2Var, i17);
                                            a0Var2 = a0Var5;
                                            long j11 = j2Var.f;
                                            byteBuffer = order;
                                            j2Var.f = j11 + 1;
                                            i2Var.f = j11;
                                            if (i17 == 0 && j2Var.c) {
                                                ExecutorService executorService = DictationLid.a;
                                                i2Var.k = mp.g1().getString("tinylid_lang", str);
                                            }
                                            sparseArray.put(i17, i2Var);
                                        } else {
                                            byteBuffer = order;
                                            a0Var2 = a0Var5;
                                        }
                                        int i19 = i18 / 2;
                                        if (i19 == 0) {
                                            sqrt = 0.0f;
                                        } else {
                                            double d10 = 0.0d;
                                            for (int i20 = 0; i20 < i19; i20++) {
                                                int i21 = (i20 * 2) + position;
                                                double d11 = (short) ((readIncomingAudio[i21] & 255) | (readIncomingAudio[i21 + 1] << 8));
                                                d10 = (d11 * d11) + d10;
                                            }
                                            sqrt = (float) Math.sqrt(d10 / i19);
                                        }
                                        boolean z11 = sqrt >= 400.0f;
                                        if (z11) {
                                            i2Var.e = currentTimeMillis2;
                                        }
                                        if (i2Var.d == null) {
                                            if (z11 && i16 < 4) {
                                                String str4 = i2Var.k;
                                                if (str4 != null) {
                                                    a0Var3 = a0Var2;
                                                    a0Var4 = DictationAsr.Y(str4, a0Var3, false);
                                                } else {
                                                    a0Var3 = a0Var2;
                                                    a0Var4 = null;
                                                }
                                                if (a0Var4 == null || !DictationAsr.C((q) a0Var4.b)) {
                                                    a0Var4 = a0Var3;
                                                }
                                                ai.u c10 = ai.u.c(a0Var4, i2Var);
                                                i2Var.d = c10;
                                                if (c10 != null) {
                                                    i16++;
                                                    i2Var.h = 0;
                                                    i2Var.g = 0;
                                                    i2Var.e();
                                                    i2Var.c(0, i2Var.c, i2Var.b);
                                                    ai.u uVar2 = i2Var.d;
                                                    byte[] bArr2 = i2Var.b;
                                                    int i22 = i2Var.c;
                                                    j3 = 0;
                                                    long j12 = uVar2.c;
                                                    if (j12 != 0) {
                                                        a0Var2 = a0Var3;
                                                        nativeSessionPush2 = DictationAsr.nativeSessionPush(j12, bArr2, 0, i22);
                                                        uVar2.b(nativeSessionPush2);
                                                    } else {
                                                        a0Var2 = a0Var3;
                                                    }
                                                    i2Var.c = 0;
                                                    if (i2Var.d == null) {
                                                        i2Var.d(position, i18, readIncomingAudio);
                                                        i11 = i7;
                                                        a0Var5 = a0Var2;
                                                        order = byteBuffer;
                                                        str = null;
                                                    }
                                                } else {
                                                    a0Var2 = a0Var3;
                                                }
                                            }
                                            j3 = 0;
                                            if (i2Var.d == null) {
                                            }
                                        } else {
                                            j3 = 0;
                                        }
                                        i2Var.c(position, i18, readIncomingAudio);
                                        ai.u uVar3 = i2Var.d;
                                        long j13 = uVar3.c;
                                        if (j13 != j3) {
                                            nativeSessionPush = DictationAsr.nativeSessionPush(j13, readIncomingAudio, position, i18);
                                            uVar3.b(nativeSessionPush);
                                        }
                                        i2Var.a();
                                        i11 = i7;
                                        a0Var5 = a0Var2;
                                        order = byteBuffer;
                                        str = null;
                                    }
                                } else {
                                    i7 = i11;
                                }
                            }
                            a0Var = a0Var5;
                        } else {
                            i7 = i11;
                            a0Var = a0Var5;
                        }
                        while (true) {
                            Runnable runnable2 = (Runnable) j2Var.b.poll();
                            if (runnable2 != null) {
                                runnable2.run();
                            } else {
                                for (int i23 = 0; i23 < sparseArray.size(); i23++) {
                                    i2 i2Var2 = (i2) sparseArray.valueAt(i23);
                                    long j14 = currentTimeMillis2 - i2Var2.e;
                                    ai.u uVar4 = i2Var2.d;
                                    if (uVar4 != null && j14 > 6000) {
                                        uVar4.a();
                                        i2Var2.d = null;
                                        i16--;
                                        i2Var2.b();
                                        i2Var2.e();
                                    } else if (uVar4 != null && j14 > 1600 && i2Var2.i && !i2Var2.j.isEmpty()) {
                                        i2Var2.b();
                                        i2Var2.g = i2Var2.h;
                                    }
                                }
                                Thread.sleep(60L);
                                i11 = i7;
                                a0Var5 = a0Var;
                                str = null;
                            }
                        }
                    } catch (InterruptedException unused) {
                        for (int i24 = 0; i24 < sparseArray.size(); i24++) {
                            i2 i2Var3 = (i2) sparseArray.valueAt(i24);
                            ai.u uVar5 = i2Var3.d;
                            if (uVar5 != null) {
                                uVar5.a();
                                i2Var3.d = null;
                            }
                            i2Var3.b();
                        }
                        return;
                    } catch (Throwable th3) {
                        try {
                            Log.e("Dictation", "live captions", th3);
                            for (int i25 = 0; i25 < sparseArray.size(); i25++) {
                                i2 i2Var4 = (i2) sparseArray.valueAt(i25);
                                ai.u uVar6 = i2Var4.d;
                                if (uVar6 != null) {
                                    uVar6.a();
                                    i2Var4.d = null;
                                }
                                i2Var4.b();
                            }
                            return;
                        } catch (Throwable th4) {
                            for (int i26 = 0; i26 < sparseArray.size(); i26++) {
                                i2 i2Var5 = (i2) sparseArray.valueAt(i26);
                                ai.u uVar7 = i2Var5.d;
                                if (uVar7 != null) {
                                    uVar7.a();
                                    i2Var5.d = null;
                                }
                                i2Var5.b();
                            }
                            throw th4;
                        }
                    }
                }
                for (int i27 = 0; i27 < sparseArray.size(); i27++) {
                    i2 i2Var6 = (i2) sparseArray.valueAt(i27);
                    ai.u uVar8 = i2Var6.d;
                    if (uVar8 != null) {
                        uVar8.a();
                        i2Var6.d = null;
                    }
                    i2Var6.b();
                }
                return;
            case 19:
                r2 r2Var = (r2) this.b;
                q2 q2Var = (q2) this.c;
                View view = q2Var.W;
                View view2 = r2Var.fragmentView;
                if (!(view2 instanceof ViewGroup) || view == null) {
                    return;
                }
                ViewGroup viewGroup = (ViewGroup) view2;
                b1 b1Var = new b1(r2Var.getParentActivity(), view, r2Var.getResourceProvider(), new c(r2Var, 9));
                b1Var.M = g0.L(ks.x3);
                b1Var.n = g0.L(ks.P4);
                b1Var.L = 0;
                b1Var.S = true;
                int w02 = n6.w0(n6.G6, r2Var.getResourceProvider());
                String g02 = DictationAsr.g0(q2Var.f, q2Var.a);
                String[] strArr = q2Var.V;
                int length = strArr.length;
                while (i12 < length) {
                    String str5 = strArr[i12];
                    b1Var.a(new i0(r2Var.getParentActivity(), l0.L(str5), null, w02, str5.equals(g02)), 44, new e(20, q2Var, str5));
                    i12++;
                    z10 = true;
                }
                b1Var.setFocusableInTouchMode(z10);
                b1Var.setOnKeyListener(new b0(3, b1Var));
                viewGroup.addView(b1Var, new FrameLayout.LayoutParams(-1, -1));
                b1Var.requestFocus();
                b1Var.f();
                return;
            case 20:
                q2 q2Var2 = (q2) this.b;
                DictationAsr.c0(q2Var2.a, (String) this.c);
                q2Var2.c();
                return;
            case 21:
                ViewGroup container = (ViewGroup) this.b;
                j.e(container, "$container");
                container.endViewTransition(null);
                throw null;
            case 22:
                ((v0.g) this.b).T(this.c);
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
                ((b3) this.b).k().g0((TLRPC.TL_error) this.c, false);
                return;
            case 26:
                i3 i3Var = (i3) this.b;
                TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) this.c;
                i3Var.getClass();
                if (savedStarGift.unsaved) {
                    return;
                }
                i3Var.G.setVisibility(8);
                return;
            case 27:
                TL_stars.StarGift starGift = (TL_stars.StarGift) this.b;
                CharSequence charSequence = (CharSequence) this.c;
                g2 T = LaunchActivity.T();
                kc b02 = T != null ? kc.b0(T) : kc.Y();
                TLRPC.Document document = starGift.getDocument();
                fc q10 = document != null ? b02.q(document, charSequence) : b02.Q(R.raw.contact_check, 36, charSequence);
                q10.t = true;
                q10.j();
                return;
            default:
                fq0 fq0Var = (fq0) this.b;
                TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) this.c;
                fq0Var.h(tL_starGiftCollection.title, new s1(i10, fq0Var, tL_starGiftCollection));
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
