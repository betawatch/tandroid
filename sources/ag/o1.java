package ag;

import android.content.ContentProviderClient;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Handler;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import android.view.MenuItem;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.TextView;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;
import bg.v2;
import com.google.android.gms.internal.cast.z4;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import i7.c7;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ReadOnlyBufferException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.CopyOnWriteArrayList;
import lh.d4;
import lh.z8;
import nh.ja;
import org.json.JSONObject;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.hu0;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class o1 implements androidx.lifecycle.a0, androidx.activity.result.b, com.google.android.gms.common.api.internal.s, f2.s1, l.w, Continuation, OnCompleteListener, m.f2, hu0, l.i, md.b, v2, o0.a {
    public final /* synthetic */ int a;
    public Object b;

    public /* synthetic */ o1(int i10, boolean z10) {
        this.a = i10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v20 */
    public static void A(CharSequence charSequence, ByteBuffer byteBuffer) {
        int i10;
        char charAt;
        if (byteBuffer.isReadOnly()) {
            throw new ReadOnlyBufferException();
        }
        char c3 = 57343;
        int i11 = 0;
        if (!byteBuffer.hasArray()) {
            int length = charSequence.length();
            while (i11 < length) {
                char charAt2 = charSequence.charAt(i11);
                char c6 = charAt2;
                if (charAt2 >= 128) {
                    if (charAt2 < 2048) {
                        byteBuffer.put((byte) ((charAt2 >>> 6) | 960));
                        c6 = (charAt2 & '?') | 128;
                    } else {
                        if (charAt2 >= 55296 && 57343 >= charAt2) {
                            int i12 = i11 + 1;
                            if (i12 != charSequence.length()) {
                                char charAt3 = charSequence.charAt(i12);
                                if (Character.isSurrogatePair(charAt2, charAt3)) {
                                    int codePoint = Character.toCodePoint(charAt2, charAt3);
                                    byteBuffer.put((byte) ((codePoint >>> 18) | 240));
                                    byteBuffer.put((byte) (((codePoint >>> 12) & 63) | 128));
                                    byteBuffer.put((byte) (((codePoint >>> 6) & 63) | 128));
                                    byteBuffer.put((byte) ((codePoint & 63) | 128));
                                    i11 = i12;
                                } else {
                                    i11 = i12;
                                }
                            }
                            StringBuilder sb2 = new StringBuilder(39);
                            sb2.append("Unpaired surrogate at index ");
                            sb2.append(i11 - 1);
                            throw new IllegalArgumentException(sb2.toString());
                        }
                        byteBuffer.put((byte) ((charAt2 >>> '\f') | 480));
                        byteBuffer.put((byte) (((charAt2 >>> 6) & 63) | 128));
                        byteBuffer.put((byte) ((charAt2 & '?') | 128));
                        i11++;
                    }
                }
                byteBuffer.put((byte) c6);
                i11++;
            }
            return;
        }
        try {
            byte[] array = byteBuffer.array();
            int arrayOffset = byteBuffer.arrayOffset() + byteBuffer.position();
            int remaining = byteBuffer.remaining();
            int length2 = charSequence.length();
            int i13 = remaining + arrayOffset;
            while (i11 < length2) {
                int i14 = i11 + arrayOffset;
                if (i14 >= i13 || (charAt = charSequence.charAt(i11)) >= 128) {
                    break;
                }
                array[i14] = (byte) charAt;
                i11++;
            }
            if (i11 == length2) {
                i10 = arrayOffset + length2;
            } else {
                i10 = arrayOffset + i11;
                while (i11 < length2) {
                    char charAt4 = charSequence.charAt(i11);
                    if (charAt4 < 128 && i10 < i13) {
                        array[i10] = (byte) charAt4;
                        i10++;
                    } else if (charAt4 < 2048 && i10 <= i13 - 2) {
                        int i15 = i10 + 1;
                        array[i10] = (byte) ((charAt4 >>> 6) | 960);
                        i10 += 2;
                        array[i15] = (byte) ((charAt4 & '?') | 128);
                    } else {
                        if ((charAt4 >= 55296 && c3 >= charAt4) || i10 > i13 - 3) {
                            if (i10 > i13 - 4) {
                                StringBuilder sb3 = new StringBuilder(37);
                                sb3.append("Failed writing ");
                                sb3.append(charAt4);
                                sb3.append(" at index ");
                                sb3.append(i10);
                                throw new ArrayIndexOutOfBoundsException(sb3.toString());
                            }
                            int i16 = i11 + 1;
                            if (i16 != charSequence.length()) {
                                char charAt5 = charSequence.charAt(i16);
                                if (Character.isSurrogatePair(charAt4, charAt5)) {
                                    int codePoint2 = Character.toCodePoint(charAt4, charAt5);
                                    array[i10] = (byte) ((codePoint2 >>> 18) | 240);
                                    array[i10 + 1] = (byte) (((codePoint2 >>> 12) & 63) | 128);
                                    int i17 = i10 + 3;
                                    array[i10 + 2] = (byte) (((codePoint2 >>> 6) & 63) | 128);
                                    i10 += 4;
                                    array[i17] = (byte) ((codePoint2 & 63) | 128);
                                    i11 = i16;
                                } else {
                                    i11 = i16;
                                }
                            }
                            StringBuilder sb4 = new StringBuilder(39);
                            sb4.append("Unpaired surrogate at index ");
                            sb4.append(i11 - 1);
                            throw new IllegalArgumentException(sb4.toString());
                        }
                        array[i10] = (byte) ((charAt4 >>> '\f') | 480);
                        int i18 = i10 + 2;
                        array[i10 + 1] = (byte) (((charAt4 >>> 6) & 63) | 128);
                        i10 += 3;
                        array[i18] = (byte) ((charAt4 & '?') | 128);
                    }
                    i11++;
                    c3 = 57343;
                }
            }
            byteBuffer.position(i10 - byteBuffer.arrayOffset());
        } catch (ArrayIndexOutOfBoundsException e10) {
            BufferOverflowException bufferOverflowException = new BufferOverflowException();
            bufferOverflowException.initCause(e10);
            throw bufferOverflowException;
        }
    }

    public static int C(long j10) {
        if (((-128) & j10) == 0) {
            return 1;
        }
        if (((-16384) & j10) == 0) {
            return 2;
        }
        if (((-2097152) & j10) == 0) {
            return 3;
        }
        if (((-268435456) & j10) == 0) {
            return 4;
        }
        if (((-34359738368L) & j10) == 0) {
            return 5;
        }
        if (((-4398046511104L) & j10) == 0) {
            return 6;
        }
        if (((-562949953421312L) & j10) == 0) {
            return 7;
        }
        if (((-72057594037927936L) & j10) == 0) {
            return 8;
        }
        return (j10 & Long.MIN_VALUE) == 0 ? 9 : 10;
    }

    public static int E(int i10) {
        return F(i10 << 3);
    }

    public static int F(int i10) {
        if ((i10 & (-128)) == 0) {
            return 1;
        }
        if ((i10 & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i10) == 0) {
            return 3;
        }
        return (i10 & (-268435456)) == 0 ? 4 : 5;
    }

    public static int p(CharSequence charSequence) {
        int length = charSequence.length();
        int i10 = 0;
        int i11 = 0;
        while (i11 < length && charSequence.charAt(i11) < 128) {
            i11++;
        }
        int i12 = length;
        while (true) {
            if (i11 >= length) {
                break;
            }
            char charAt = charSequence.charAt(i11);
            if (charAt < 2048) {
                i12 += (127 - charAt) >>> 31;
                i11++;
            } else {
                int length2 = charSequence.length();
                while (i11 < length2) {
                    char charAt2 = charSequence.charAt(i11);
                    if (charAt2 < 2048) {
                        i10 += (127 - charAt2) >>> 31;
                    } else {
                        i10 += 2;
                        if (55296 <= charAt2 && charAt2 <= 57343) {
                            if (Character.codePointAt(charSequence, i11) < 65536) {
                                StringBuilder sb2 = new StringBuilder(39);
                                sb2.append("Unpaired surrogate at index ");
                                sb2.append(i11);
                                throw new IllegalArgumentException(sb2.toString());
                            }
                            i11++;
                        }
                    }
                    i11++;
                }
                i12 += i10;
            }
        }
        if (i12 >= length) {
            return i12;
        }
        StringBuilder sb3 = new StringBuilder(54);
        sb3.append("UTF-8 length does not fit in int: ");
        sb3.append(i12 + 4294967296L);
        throw new IllegalArgumentException(sb3.toString());
    }

    public static int w(int i10, String str) {
        int E = E(i10);
        int p10 = p(str);
        return F(p10) + p10 + E;
    }

    public void B(long j10) {
        while (((-128) & j10) != 0) {
            u((((int) j10) & 127) | 128);
            j10 >>>= 7;
        }
        u((int) j10);
    }

    @Override // org.telegram.ui.hu0
    public void D(MessageObject messageObject) {
        ((z8) ((d4) this.b).M1).f(false);
    }

    @Override // bg.v2
    public void K(float f9) {
        ja jaVar = (ja) this.b;
        h1.e(jaVar.B1).k(String.valueOf(m.a.indexOf(jaVar.K0.getCurrentBrush())), f9);
        k2 k2Var = jaVar.w1;
        k2Var.c = f9;
        jaVar.E0(k2Var, null, false);
    }

    @Override // androidx.lifecycle.a0
    public void S(Object obj) {
        CharSequence charSequence = (CharSequence) obj;
        androidx.biometric.g0 g0Var = (androidx.biometric.g0) this.b;
        Handler handler = g0Var.w0;
        q1 q1Var = g0Var.x0;
        handler.removeCallbacks(q1Var);
        TextView textView = g0Var.C0;
        if (textView != null) {
            textView.setText(charSequence);
        }
        handler.postDelayed(q1Var, 2000L);
    }

    public void a(int i10, boolean z10) {
        c2.u uVar = (c2.u) this.b;
        if (z10) {
            uVar.b(i10);
        } else {
            uVar.getClass();
        }
    }

    @Override // com.google.android.gms.common.api.internal.s
    public void accept(Object obj, Object obj2) {
        switch (this.a) {
            case 9:
                s7.e eVar = (s7.e) this.b;
                d7.z zVar = (d7.z) ((d7.k) obj).u();
                d7.f fVar = new d7.f(1, (TaskCompletionSource) obj2);
                Parcel M0 = zVar.M0();
                d7.d.c(M0, eVar);
                d7.d.d(M0, fVar);
                M0.writeString(null);
                zVar.Q0(M0, 63);
                return;
            case 10:
            default:
                n6.b bVar = new n6.b(0, (TaskCompletionSource) obj2);
                z6.m1 m1Var = (z6.m1) ((z6.l1) obj).u();
                o6.v vVar = (o6.v) this.b;
                Parcel obtain = Parcel.obtain();
                obtain.writeInterfaceToken(m1Var.b);
                int i10 = z6.j.a;
                obtain.writeStrongBinder(bVar);
                obtain.writeInt(1);
                vVar.writeToParcel(obtain, 0);
                Parcel obtain2 = Parcel.obtain();
                try {
                    m1Var.a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return;
                } finally {
                    obtain.recycle();
                    obtain2.recycle();
                }
            case 11:
                e6.f fVar2 = new e6.f(1, (TaskCompletionSource) obj2);
                e6.e eVar2 = (e6.e) ((e6.h) obj).u();
                e6.a aVar = (e6.a) this.b;
                Parcel G0 = eVar2.G0();
                w6.a.d(G0, fVar2);
                w6.a.c(G0, aVar);
                G0.writeStrongBinder(null);
                eVar2.H0(G0, 2);
                return;
        }
    }

    @Override // l.w
    public void b(l.k kVar, boolean z10) {
        g.p pVar;
        g.q qVar = (g.q) this.b;
        l.k k9 = kVar.k();
        int i10 = 0;
        boolean z11 = k9 != kVar;
        if (z11) {
            kVar = k9;
        }
        g.p[] pVarArr = qVar.Q;
        int length = pVarArr != null ? pVarArr.length : 0;
        while (true) {
            if (i10 < length) {
                pVar = pVarArr[i10];
                if (pVar != null && pVar.h == kVar) {
                    break;
                } else {
                    i10++;
                }
            } else {
                pVar = null;
                break;
            }
        }
        if (pVar != null) {
            if (!z11) {
                qVar.h(pVar, z10);
            } else {
                qVar.f(pVar.a, pVar, k9);
                qVar.h(pVar, true);
            }
        }
    }

    @Override // org.telegram.ui.hu0
    public /* synthetic */ TextureView b0() {
        return null;
    }

    public void c() {
        r1 r1Var = ((t1) this.b).d;
        if (r1Var != null) {
            p1 p1Var = r1Var.s;
            if (p1Var != null) {
                r1Var.cancelRunnable(p1Var);
                r1Var.s = null;
            }
            p1 p1Var2 = new p1(r1Var, 1);
            r1Var.s = p1Var2;
            r1Var.postRunnable(p1Var2, 1L);
        }
    }

    @Override // o0.a
    public void close() {
        ContentProviderClient contentProviderClient = (ContentProviderClient) this.b;
        if (contentProviderClient != null) {
            contentProviderClient.release();
        }
    }

    @Override // f2.s1
    public int d(View view) {
        return f2.w0.z(view) - ((ViewGroup.MarginLayoutParams) ((f2.x0) view.getLayoutParams())).topMargin;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // md.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object e(md.c cVar, uc.c cVar2) {
        md.a aVar;
        int i10;
        Throwable th2;
        nd.g gVar;
        if (cVar2 instanceof md.a) {
            aVar = (md.a) cVar2;
            int i11 = aVar.d;
            if ((i11 & TLObject.FLAG_31) != 0) {
                aVar.d = i11 - TLObject.FLAG_31;
                Object obj = aVar.b;
                tc.a aVar2 = tc.a.a;
                i10 = aVar.d;
                qc.i iVar = qc.i.a;
                if (i10 != 0) {
                    c7.b(obj);
                    nd.g gVar2 = new nd.g(cVar, aVar.getContext());
                    try {
                        aVar.a = gVar2;
                        aVar.d = 1;
                        Object invoke = ((k1.o) this.b).invoke(gVar2, aVar);
                        if (invoke != aVar2) {
                            invoke = iVar;
                        }
                        if (invoke == aVar2) {
                            return aVar2;
                        }
                        gVar = gVar2;
                    } catch (Throwable th3) {
                        th2 = th3;
                        gVar = gVar2;
                        gVar.releaseIntercepted();
                        throw th2;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    gVar = aVar.a;
                    try {
                        c7.b(obj);
                    } catch (Throwable th4) {
                        th2 = th4;
                        gVar.releaseIntercepted();
                        throw th2;
                    }
                }
                gVar.releaseIntercepted();
                return iVar;
            }
        }
        aVar = new md.a(this, cVar2);
        Object obj2 = aVar.b;
        tc.a aVar22 = tc.a.a;
        i10 = aVar.d;
        qc.i iVar2 = qc.i.a;
        if (i10 != 0) {
        }
        gVar.releaseIntercepted();
        return iVar2;
    }

    public void f(c2.r rVar, c2.n nVar, Collection collection) {
        c2.e eVar = (c2.e) this.b;
        if (rVar != eVar.y || nVar == null) {
            if (rVar == eVar.e) {
                if (nVar != null) {
                    eVar.n(eVar.d, nVar);
                }
                eVar.d.n(collection);
                return;
            }
            return;
        }
        c2.a0 a0Var = eVar.x.a;
        String d = nVar.d();
        c2.b0 b0Var = new c2.b0(a0Var, d, eVar.b(a0Var, d), false);
        b0Var.i(nVar);
        if (eVar.d == b0Var) {
            return;
        }
        eVar.h(eVar, b0Var, eVar.y, 3, eVar.x, collection);
        eVar.x = null;
        eVar.y = null;
    }

    @Override // m.f2
    public void g(l.k kVar, MenuItem menuItem) {
        ((l.e) this.b).f.removeCallbacksAndMessages(kVar);
    }

    @Override // bg.v2
    public float get() {
        ja jaVar = (ja) this.b;
        int i10 = jaVar.B1;
        m currentBrush = jaVar.K0.getCurrentBrush();
        return currentBrush == null ? h1.e(i10).i : h1.e(i10).f(String.valueOf(m.a.indexOf(currentBrush)), currentBrush.d());
    }

    @Override // l.w
    public boolean h(l.k kVar) {
        Window.Callback callback;
        g.q qVar = (g.q) this.b;
        if (kVar != kVar.k() || !qVar.K || (callback = qVar.f.getCallback()) == null || qVar.V) {
            return true;
        }
        callback.onMenuOpened(108, kVar);
        return true;
    }

    @Override // l.i
    public void i(l.k kVar) {
        m5.i iVar = ((ActionMenuView) this.b).G;
        if (iVar != null) {
            iVar.i(kVar);
        }
    }

    public n9.a j(JSONObject jSONObject) {
        n9.b dVar;
        int i10 = jSONObject.getInt("settings_version");
        if (i10 != 3) {
            Log.e("FirebaseCrashlytics", "Could not determine SettingsJsonTransform for settings version " + i10 + ". Using default settings values.", null);
            dVar = new f7.v(14);
        } else {
            dVar = new x9.d(14);
        }
        return dVar.d((ya.a) this.b, jSONObject);
    }

    public void k(int i10) {
        RecyclerView recyclerView = (RecyclerView) this.b;
        View childAt = recyclerView.getChildAt(i10);
        if (childAt != null) {
            recyclerView.r(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeViewAt(i10);
    }

    @Override // androidx.activity.result.b
    public void l(Object obj) {
        Map map = (Map) obj;
        androidx.fragment.app.j0 j0Var = (androidx.fragment.app.j0) this.b;
        ArrayList arrayList = new ArrayList(map.values());
        int[] iArr = new int[arrayList.size()];
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            iArr[i10] = ((Boolean) arrayList.get(i10)).booleanValue() ? 0 : -1;
        }
        androidx.fragment.app.f0 f0Var = (androidx.fragment.app.f0) j0Var.F.pollFirst();
        if (f0Var == null) {
            Log.w("FragmentManager", "No permissions were requested for " + this);
        } else {
            String str = f0Var.a;
            if (j0Var.c.q(str) == null) {
                Log.w("FragmentManager", "Permission request result delivered for unknown Fragment " + str);
            }
        }
    }

    @Override // o0.a
    public Cursor m(Uri uri, String[] strArr, String[] strArr2) {
        ContentProviderClient contentProviderClient = (ContentProviderClient) this.b;
        if (contentProviderClient == null) {
            return null;
        }
        try {
            return contentProviderClient.query(uri, strArr, "query = ?", strArr2, null, null);
        } catch (RemoteException e10) {
            Log.w("FontsProvider", "Unable to query the content provider", e10);
            return null;
        }
    }

    @Override // f2.s1
    public int n() {
        return ((f2.w0) this.b).G();
    }

    @Override // m.f2
    public void o(l.k kVar, l.m mVar) {
        l.e eVar = (l.e) this.b;
        Handler handler = eVar.f;
        handler.removeCallbacksAndMessages(null);
        ArrayList arrayList = eVar.n;
        int size = arrayList.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                i10 = -1;
                break;
            } else if (kVar == ((l.d) arrayList.get(i10)).b) {
                break;
            } else {
                i10++;
            }
        }
        if (i10 == -1) {
            return;
        }
        int i11 = i10 + 1;
        handler.postAtTime(new c2.p(this, i11 < arrayList.size() ? (l.d) arrayList.get(i11) : null, mVar, kVar, 6), kVar, SystemClock.uptimeMillis() + 200);
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        k8.e0 e0Var = (k8.e0) this.b;
        if (task.isSuccessful()) {
            j8.m.K0(e0Var, true, (byte[]) task.getResult());
        } else {
            Log.e("WearableLS", "Failed to resolve future, sending null response", task.getException());
            j8.m.K0(e0Var, false, null);
        }
    }

    @Override // l.i
    public boolean q(l.k kVar, MenuItem menuItem) {
        m.l lVar = ((ActionMenuView) this.b).L;
        if (lVar == null) {
            return false;
        }
        Iterator it = ((CopyOnWriteArrayList) ((Toolbar) ((ha.c) lVar).b).S.c).iterator();
        while (it.hasNext()) {
            if (((androidx.fragment.app.b0) it.next()).a.p()) {
                return true;
            }
        }
        return false;
    }

    public void r(int i10, String str) {
        ByteBuffer byteBuffer = (ByteBuffer) this.b;
        x(i10, 2);
        try {
            int F = F(str.length());
            if (F != F(str.length() * 3)) {
                v(p(str));
                A(str, byteBuffer);
                return;
            }
            int position = byteBuffer.position();
            if (byteBuffer.remaining() < F) {
                throw new z4(position + F, byteBuffer.limit());
            }
            byteBuffer.position(position + F);
            A(str, byteBuffer);
            int position2 = byteBuffer.position();
            byteBuffer.position(position);
            v((position2 - position) - F);
            byteBuffer.position(position2);
        } catch (BufferOverflowException e10) {
            z4 z4Var = new z4(byteBuffer.position(), byteBuffer.limit());
            z4Var.initCause(e10);
            throw z4Var;
        }
    }

    @Override // f2.s1
    public int s() {
        f2.w0 w0Var = (f2.w0) this.b;
        return w0Var.n - w0Var.C();
    }

    public void t(int i10, byte[] bArr) {
        x(i10, 2);
        v(bArr.length);
        int length = bArr.length;
        ByteBuffer byteBuffer = (ByteBuffer) this.b;
        if (byteBuffer.remaining() < length) {
            throw new z4(byteBuffer.position(), byteBuffer.limit());
        }
        byteBuffer.put(bArr, 0, length);
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        return ((Callable) this.b).call();
    }

    public void u(int i10) {
        byte b10 = (byte) i10;
        ByteBuffer byteBuffer = (ByteBuffer) this.b;
        if (!byteBuffer.hasRemaining()) {
            throw new z4(byteBuffer.position(), byteBuffer.limit());
        }
        byteBuffer.put(b10);
    }

    public void v(int i10) {
        while ((i10 & (-128)) != 0) {
            u((i10 & 127) | 128);
            i10 >>>= 7;
        }
        u(i10);
    }

    public void x(int i10, int i11) {
        v((i10 << 3) | i11);
    }

    @Override // org.telegram.ui.hu0
    public void x0(MessageObject messageObject) {
        ((z8) ((d4) this.b).M1).f(true);
    }

    @Override // f2.s1
    public View y(int i10) {
        return ((f2.w0) this.b).q(i10);
    }

    @Override // f2.s1
    public int z(View view) {
        return f2.w0.v(view) + ((ViewGroup.MarginLayoutParams) ((f2.x0) view.getLayoutParams())).bottomMargin;
    }

    public /* synthetic */ o1(com.google.android.gms.common.api.j jVar, a6.a aVar, int i10) {
        this.a = i10;
        this.b = aVar;
    }

    public /* synthetic */ o1(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    public o1(byte[] bArr, int i10) {
        this.a = 8;
        ByteBuffer wrap = ByteBuffer.wrap(bArr, 0, i10);
        this.b = wrap;
        wrap.order(ByteOrder.LITTLE_ENDIAN);
    }

    public o1(int i10) {
        this.a = i10;
        switch (i10) {
            case 6:
                this.b = new CopyOnWriteArrayList();
                break;
            case 17:
                this.b = new c2.u();
                break;
            default:
                this.b = new LinkedHashMap(0, 0.75f, true);
                break;
        }
    }

    public o1(Context context, Uri uri) {
        this.a = 28;
        this.b = context.getContentResolver().acquireUnstableContentProviderClient(uri);
    }
}
