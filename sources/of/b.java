package of;

import a3.h0;
import a3.j0;
import a9.r;
import android.content.Context;
import android.graphics.Rect;
import android.media.session.MediaController;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Messenger;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.support.v4.media.session.MediaSessionCompat$Token;
import android.support.v4.media.session.l;
import android.support.v4.media.session.m;
import android.text.Editable;
import android.text.Selection;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.emoji2.text.v;
import b2.x1;
import bi.cb;
import c3.i;
import c3.o;
import c3.p;
import com.google.android.gms.cast.CastDevice;
import d6.h;
import e2.d0;
import g.j;
import g6.n;
import hi.e4;
import hi.g6;
import hi.k1;
import hi.m3;
import hi.m4;
import hi.s;
import hi.w3;
import hi.x3;
import hi.y3;
import hi.z3;
import i9.w;
import i9.y;
import j$.util.DesugarCollections;
import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.lang.ref.ReferenceQueue;
import java.lang.reflect.Constructor;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import l.b0;
import le.k;
import m.e3;
import m.r3;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.Components.w70;
import org.telegram.ui.Components.wc;
import org.telegram.ui.Components.yi;
import org.telegram.ui.PhotoViewer;
import r0.i0;
import r0.l0;
import v7.u7;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class b implements h, ce.b, ea.a, n, x3, i, le.f, n5.b {
    public static volatile b d;
    public final /* synthetic */ int a;
    public Object b;
    public Object c;

    public /* synthetic */ b(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj2;
        this.c = obj;
    }

    public static boolean I(Editable editable, KeyEvent keyEvent, boolean z10) {
        v[] vVarArr;
        if (KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState())) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (selectionStart != -1 && selectionEnd != -1 && selectionStart == selectionEnd && (vVarArr = (v[]) editable.getSpans(selectionStart, selectionEnd, v.class)) != null && vVarArr.length > 0) {
                for (v vVar : vVarArr) {
                    int spanStart = editable.getSpanStart(vVar);
                    int spanEnd = editable.getSpanEnd(vVar);
                    if ((z10 && spanStart == selectionStart) || ((!z10 && spanEnd == selectionStart) || (selectionStart > spanStart && selectionStart < spanEnd))) {
                        editable.delete(spanStart, spanEnd);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private final void L(i2.g gVar) {
        synchronized (gVar) {
        }
        Handler handler = (Handler) this.b;
        if (handler != null) {
            handler.post(new j0(this, gVar, 1));
        }
    }

    public static b d0() {
        b bVar;
        b bVar2 = d;
        if (bVar2 != null) {
            return bVar2;
        }
        synchronized (b.class) {
            try {
                bVar = d;
                if (bVar == null) {
                    bVar = new b(0);
                    d = bVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return bVar;
    }

    public static String t0(b bVar) {
        Collection<String> collection = (Collection) bVar.c;
        StringBuilder sb2 = new StringBuilder("com.google.android.gms.cast.CATEGORY_CAST");
        String str = (String) bVar.b;
        if (str != null) {
            String upperCase = str.toUpperCase(Locale.ROOT);
            if (!upperCase.matches("[A-F0-9]+")) {
                throw new IllegalArgumentException("Invalid application ID: ".concat(str));
            }
            sb2.append("/");
            sb2.append(upperCase);
        }
        if (collection != null) {
            if (collection.isEmpty()) {
                throw new IllegalArgumentException("Must specify at least one namespace");
            }
            if (str == null) {
                sb2.append("/");
            }
            sb2.append("/");
            boolean z10 = true;
            for (String str2 : collection) {
                g6.a.b(str2);
                if (!z10) {
                    sb2.append(",");
                }
                if (!g6.a.a.matcher(str2).matches()) {
                    StringBuilder sb3 = new StringBuilder(str2.length());
                    for (int i10 = 0; i10 < str2.length(); i10++) {
                        char charAt = str2.charAt(i10);
                        if ((charAt < 'A' || charAt > 'Z') && ((charAt < 'a' || charAt > 'z') && !((charAt >= '0' && charAt <= '9') || charAt == '_' || charAt == '-' || charAt == '.' || charAt == ':'))) {
                            sb3.append(String.format("%%%04x", Integer.valueOf(charAt)));
                        } else {
                            sb3.append(charAt);
                        }
                    }
                    str2 = sb3.toString();
                }
                sb2.append(str2);
                z10 = false;
            }
        }
        if (str == null && collection == null) {
            sb2.append("/");
        }
        if (collection == null) {
            sb2.append("/");
        }
        sb2.append("//ALLOW_IPV6");
        return sb2.toString();
    }

    @Override // d6.h
    public void A(d6.f fVar, String str) {
        d6.c cVar = (d6.c) fVar;
        Log.d("CAST_SESSION", "onSessionStarted " + cVar.a() + " " + str);
        p0(cVar);
    }

    @Override // d6.h
    public void B(d6.f fVar, int i10) {
        Log.d("CAST_SESSION", "onSessionStartSuspended " + ((d6.c) fVar).a() + " " + i10);
    }

    @Override // hi.x3
    public void C(k1 k1Var, boolean z10) {
        ((s) this.c).b.t1(k1Var, z10);
    }

    @Override // c3.i
    public void D() {
        e2.v vVar = (e2.v) this.c;
        byte[] bArr = d0.b;
        vVar.getClass();
        vVar.H(bArr.length, bArr);
    }

    public void E(Object obj, String str) {
        ((ArrayList) this.b).add(a4.a.C(str, "=", String.valueOf(obj)));
    }

    public void F() {
        this.b = null;
        this.c = null;
    }

    @Override // hi.x3
    public void G() {
        s sVar = (s) this.c;
        if (sVar.getCurrentItemTop() != sVar.I) {
            sVar.b.X1(sVar, 0);
        }
        sVar.a0();
        s.K(sVar);
    }

    public w H(byte[] bArr) {
        byte[] bArr2;
        e3 e3Var = (e3) this.c;
        if (e3Var != null && (bArr2 = (byte[]) e3Var.b) != null && Arrays.equals(bArr2, bArr)) {
            w wVar = (w) ((e3) this.c).d;
            e2.d.h(wVar);
            return wVar;
        }
        g2.i iVar = (g2.i) this.b;
        w a2 = ((y) iVar.a).a(new com.google.firebase.messaging.h(1, iVar, bArr));
        this.c = new e3(bArr, a2);
        return a2;
    }

    public void J(i2.g gVar) {
        switch (this.a) {
            case 1:
                L(gVar);
                break;
            default:
                synchronized (gVar) {
                }
                Handler handler = (Handler) this.b;
                if (handler != null) {
                    handler.post(new k2.g(this, gVar, 0));
                    break;
                }
                break;
        }
    }

    @Override // hi.x3
    public void K(int i10) {
        s sVar = (s) this.c;
        sVar.b.X1(sVar, i10);
        sVar.a0();
        s.K(sVar);
    }

    public void M(androidx.fragment.app.s f7, boolean z10) {
        kotlin.jvm.internal.i.e(f7, "f");
        androidx.fragment.app.s sVar = ((androidx.fragment.app.j0) this.b).y;
        if (sVar != null) {
            sVar.p().o.M(f7, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.c).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z10) {
                throw null;
            }
            throw null;
        }
    }

    public void N(androidx.fragment.app.s f7, boolean z10) {
        kotlin.jvm.internal.i.e(f7, "f");
        androidx.fragment.app.j0 j0Var = (androidx.fragment.app.j0) this.b;
        androidx.fragment.app.v vVar = j0Var.w.b;
        androidx.fragment.app.s sVar = j0Var.y;
        if (sVar != null) {
            sVar.p().o.N(f7, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.c).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z10) {
                throw null;
            }
            throw null;
        }
    }

    public void O(androidx.fragment.app.s f7, boolean z10) {
        kotlin.jvm.internal.i.e(f7, "f");
        androidx.fragment.app.s sVar = ((androidx.fragment.app.j0) this.b).y;
        if (sVar != null) {
            sVar.p().o.O(f7, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.c).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z10) {
                throw null;
            }
            throw null;
        }
    }

    public void P(androidx.fragment.app.s f7, boolean z10) {
        kotlin.jvm.internal.i.e(f7, "f");
        androidx.fragment.app.s sVar = ((androidx.fragment.app.j0) this.b).y;
        if (sVar != null) {
            sVar.p().o.P(f7, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.c).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z10) {
                throw null;
            }
            throw null;
        }
    }

    public void Q(androidx.fragment.app.s f7, boolean z10) {
        kotlin.jvm.internal.i.e(f7, "f");
        androidx.fragment.app.s sVar = ((androidx.fragment.app.j0) this.b).y;
        if (sVar != null) {
            sVar.p().o.Q(f7, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.c).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z10) {
                throw null;
            }
            throw null;
        }
    }

    public void R(androidx.fragment.app.s f7, boolean z10) {
        kotlin.jvm.internal.i.e(f7, "f");
        androidx.fragment.app.s sVar = ((androidx.fragment.app.j0) this.b).y;
        if (sVar != null) {
            sVar.p().o.R(f7, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.c).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z10) {
                throw null;
            }
            throw null;
        }
    }

    public void S(androidx.fragment.app.s f7, boolean z10) {
        kotlin.jvm.internal.i.e(f7, "f");
        androidx.fragment.app.j0 j0Var = (androidx.fragment.app.j0) this.b;
        androidx.fragment.app.v vVar = j0Var.w.b;
        androidx.fragment.app.s sVar = j0Var.y;
        if (sVar != null) {
            sVar.p().o.S(f7, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.c).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z10) {
                throw null;
            }
            throw null;
        }
    }

    public void T(androidx.fragment.app.s f7, boolean z10) {
        kotlin.jvm.internal.i.e(f7, "f");
        androidx.fragment.app.s sVar = ((androidx.fragment.app.j0) this.b).y;
        if (sVar != null) {
            sVar.p().o.T(f7, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.c).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z10) {
                throw null;
            }
            throw null;
        }
    }

    public void U(androidx.fragment.app.s f7, boolean z10) {
        kotlin.jvm.internal.i.e(f7, "f");
        androidx.fragment.app.s sVar = ((androidx.fragment.app.j0) this.b).y;
        if (sVar != null) {
            sVar.p().o.U(f7, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.c).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z10) {
                throw null;
            }
            throw null;
        }
    }

    public void V(androidx.fragment.app.s f7, Bundle bundle, boolean z10) {
        kotlin.jvm.internal.i.e(f7, "f");
        androidx.fragment.app.s sVar = ((androidx.fragment.app.j0) this.b).y;
        if (sVar != null) {
            sVar.p().o.V(f7, bundle, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.c).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z10) {
                throw null;
            }
            throw null;
        }
    }

    public void W(androidx.fragment.app.s f7, boolean z10) {
        kotlin.jvm.internal.i.e(f7, "f");
        androidx.fragment.app.s sVar = ((androidx.fragment.app.j0) this.b).y;
        if (sVar != null) {
            sVar.p().o.W(f7, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.c).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z10) {
                throw null;
            }
            throw null;
        }
    }

    public void X(androidx.fragment.app.s f7, boolean z10) {
        kotlin.jvm.internal.i.e(f7, "f");
        androidx.fragment.app.s sVar = ((androidx.fragment.app.j0) this.b).y;
        if (sVar != null) {
            sVar.p().o.X(f7, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.c).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z10) {
                throw null;
            }
            throw null;
        }
    }

    @Override // hi.x3
    public void Y() {
        e4 e4Var = ((s) this.c).s;
        if (e4Var != null) {
            e4Var.e(false, true);
            int i10 = e4Var.b0;
            e4Var.f(i10 != 2 ? i10 : 0, true);
        }
    }

    public void Z(androidx.fragment.app.s f7, boolean z10) {
        kotlin.jvm.internal.i.e(f7, "f");
        androidx.fragment.app.s sVar = ((androidx.fragment.app.j0) this.b).y;
        if (sVar != null) {
            sVar.p().o.Z(f7, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.c).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z10) {
                throw null;
            }
            throw null;
        }
    }

    @Override // le.f
    public void a() {
        ((k) this.b).a();
    }

    @Override // hi.x3
    public w70 a0(View view) {
        s sVar = (s) this.c;
        w70 w70Var = new w70(sVar, (f6) this.b, view, false, false, true);
        sVar.H = w70Var;
        return w70Var;
    }

    @Override // d6.h
    public void b(d6.f fVar, String str) {
        Log.d("CAST_SESSION", "onSessionResuming " + ((d6.c) fVar).a() + " " + str);
    }

    public byte[] b0(n3.a aVar) {
        DataOutputStream dataOutputStream = (DataOutputStream) this.c;
        ByteArrayOutputStream byteArrayOutputStream = (ByteArrayOutputStream) this.b;
        byteArrayOutputStream.reset();
        try {
            dataOutputStream.writeBytes(aVar.a);
            dataOutputStream.writeByte(0);
            dataOutputStream.writeBytes(aVar.b);
            dataOutputStream.writeByte(0);
            dataOutputStream.writeLong(aVar.c);
            dataOutputStream.writeLong(aVar.d);
            dataOutputStream.write(aVar.e);
            dataOutputStream.flush();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // d6.h
    public void c(d6.f fVar, int i10) {
        Log.d("CAST_SESSION", "onSessionStartFailed " + ((d6.c) fVar).a() + " " + i10);
    }

    public o c0(Object... objArr) {
        Constructor a2;
        synchronized (((AtomicBoolean) this.c)) {
            if (!((AtomicBoolean) this.c).get()) {
                try {
                    a2 = ((androidx.emoji2.text.w) this.b).a();
                } catch (ClassNotFoundException unused) {
                    ((AtomicBoolean) this.c).set(true);
                } catch (Exception e) {
                    throw new RuntimeException("Error instantiating extension", e);
                }
            }
            a2 = null;
        }
        if (a2 == null) {
            return null;
        }
        try {
            return (o) a2.newInstance(objArr);
        } catch (Exception e7) {
            throw new IllegalStateException("Unexpected error creating extractor", e7);
        }
    }

    @Override // d6.h
    public void d(d6.f fVar, boolean z10) {
        Log.d("CAST_SESSION", "onSessionResumed " + ((d6.c) fVar).a() + " " + z10);
    }

    @Override // hi.x3
    public void e0() {
        s sVar = (s) this.c;
        sVar.X();
        sVar.Y();
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0023 A[RETURN] */
    @Override // hi.x3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean f(float f7) {
        boolean z10;
        e4 e4Var = ((s) this.c).s;
        if (e4Var != null) {
            FrameLayout frameLayout = e4Var.H;
            if (frameLayout != null) {
                frameLayout.getLocationOnScreen(new int[2]);
                if (f7 >= r4[1]) {
                    z10 = true;
                    e4Var.e(z10, true);
                    if (!z10) {
                        return true;
                    }
                }
            }
            z10 = false;
            e4Var.e(z10, true);
            if (!z10) {
            }
        }
        return false;
    }

    public synchronized Map f0() {
        try {
            if (((Map) this.c) == null) {
                this.c = DesugarCollections.unmodifiableMap(new HashMap((HashMap) this.b));
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return (Map) this.c;
    }

    @Override // le.f
    public boolean g() {
        return false;
    }

    public l g0() {
        MediaController.TransportControls transportControls = ((android.support.v4.media.session.h) this.b).a.getTransportControls();
        int i10 = Build.VERSION.SDK_INT;
        return i10 >= 29 ? new android.support.v4.media.session.o(transportControls) : i10 >= 24 ? new android.support.v4.media.session.n(transportControls) : i10 >= 23 ? new m(transportControls) : new l(transportControls);
    }

    @Override // fd.a
    public Object get() {
        return new m5.d((Context) ((r) this.b).a, (e3) ((l2.g) this.c).get());
    }

    @Override // hi.x3
    public void h(g6 g6Var, String str) {
        s sVar = (s) this.c;
        if (sVar.v == null) {
            f6 f6Var = (f6) this.b;
            sVar.v = new r3(new cb(12, this, f6Var), f6Var);
        }
        sVar.v.d(g6Var, str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00bb, code lost:
    
        if (r6 >= r7) goto L11;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0108  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean h0(CharSequence charSequence, int i10, int i11, androidx.emoji2.text.o oVar) {
        boolean z10;
        if (oVar.c == 0) {
            androidx.emoji2.text.h hVar = (androidx.emoji2.text.h) this.c;
            p1.a b10 = oVar.b();
            int a2 = b10.a(8);
            short s10 = a2 != 0 ? ((ByteBuffer) b10.d).getShort(a2 + b10.a) : (short) 0;
            androidx.emoji2.text.d dVar = (androidx.emoji2.text.d) hVar;
            dVar.getClass();
            int i12 = Build.VERSION.SDK_INT;
            if (i12 >= 23 || s10 <= i12) {
                ThreadLocal threadLocal = androidx.emoji2.text.d.b;
                if (threadLocal.get() == null) {
                    threadLocal.set(new StringBuilder());
                }
                StringBuilder sb2 = (StringBuilder) threadLocal.get();
                sb2.setLength(0);
                while (i10 < i11) {
                    sb2.append(charSequence.charAt(i10));
                    i10++;
                }
                TextPaint textPaint = dVar.a;
                String sb3 = sb2.toString();
                ThreadLocal threadLocal2 = i0.d.a;
                if (Build.VERSION.SDK_INT >= 23) {
                    z10 = e0.b.n(textPaint, sb3);
                } else {
                    int length = sb3.length();
                    if (length != 1 || !Character.isWhitespace(sb3.charAt(0))) {
                        float measureText = textPaint.measureText("\udfffd");
                        float measureText2 = textPaint.measureText("m");
                        float measureText3 = textPaint.measureText(sb3);
                        float f7 = 0.0f;
                        if (measureText3 != 0.0f) {
                            if (sb3.codePointCount(0, sb3.length()) > 1) {
                                if (measureText3 <= measureText2 * 2.0f) {
                                    int i13 = 0;
                                    while (i13 < length) {
                                        int charCount = Character.charCount(sb3.codePointAt(i13)) + i13;
                                        f7 += textPaint.measureText(sb3, i13, charCount);
                                        i13 = charCount;
                                    }
                                }
                            }
                            if (measureText3 == measureText) {
                                ThreadLocal threadLocal3 = i0.d.a;
                                q0.b bVar = (q0.b) threadLocal3.get();
                                if (bVar == null) {
                                    bVar = new q0.b(new Rect(), new Rect());
                                    threadLocal3.set(bVar);
                                } else {
                                    ((Rect) bVar.a).setEmpty();
                                    ((Rect) bVar.b).setEmpty();
                                }
                                Object obj = bVar.b;
                                Rect rect = (Rect) bVar.a;
                                textPaint.getTextBounds("\udfffd", 0, 2, rect);
                                textPaint.getTextBounds(sb3, 0, length, (Rect) obj);
                                z10 = !rect.equals(obj);
                            }
                        }
                    }
                    z10 = true;
                }
                oVar.c = !z10 ? 2 : 1;
            }
            z10 = false;
            oVar.c = !z10 ? 2 : 1;
        }
        return oVar.c == 2;
    }

    @Override // le.f
    public boolean i(float f7) {
        return false;
    }

    public boolean i0() {
        return ((a) ((e3) this.b).d) != null;
    }

    public void j0(k.a aVar) {
        com.google.firebase.messaging.s sVar = (com.google.firebase.messaging.s) this.b;
        ((ActionMode.Callback) sVar.b).onDestroyActionMode(sVar.c(aVar));
        g.s sVar2 = (g.s) this.c;
        if (sVar2.E != null) {
            sVar2.f.getDecorView().removeCallbacks(sVar2.F);
        }
        if (sVar2.y != null) {
            l0 l0Var = sVar2.G;
            if (l0Var != null) {
                l0Var.b();
            }
            l0 a2 = i0.a(sVar2.y);
            a2.a(0.0f);
            sVar2.G = a2;
            a2.d(new j(this, 2));
        }
        sVar2.x = null;
        ViewGroup viewGroup = sVar2.J;
        WeakHashMap weakHashMap = i0.a;
        r0.y.c(viewGroup);
        sVar2.x();
    }

    @Override // hi.x3
    public void k(hi.a aVar) {
        s sVar = (s) this.c;
        yi yiVar = sVar.b;
        p2 p2Var = yiVar.f0;
        if (p2Var != null && aVar != null && (aVar.b instanceof TL_iv.pageBlockMap) && AndroidUtilities.isMapsInstalled(p2Var)) {
            yi yiVar2 = new yi(sVar.getContext(), yiVar.f0, false, false, false, null);
            yiVar2.Z1 = new ob.a(10);
            yiVar2.P = true;
            yiVar2.x1.setVisibility(8);
            yiVar2.t2 = new androidx.car.app.utils.a(sVar, aVar, yiVar2, 8);
            yiVar2.r1();
            yiVar2.show();
        }
    }

    public boolean k0(k.a aVar, Menu menu) {
        ViewGroup viewGroup = ((g.s) this.c).J;
        WeakHashMap weakHashMap = i0.a;
        r0.y.c(viewGroup);
        com.google.firebase.messaging.s sVar = (com.google.firebase.messaging.s) this.b;
        ActionMode.Callback callback = (ActionMode.Callback) sVar.b;
        k.e c10 = sVar.c(aVar);
        a0.l lVar = (a0.l) sVar.e;
        Menu menu2 = (Menu) lVar.get(menu);
        if (menu2 == null) {
            menu2 = new b0((Context) sVar.c, (l.l) menu);
            lVar.put(menu, menu2);
        }
        return callback.onPrepareActionMode(c10, menu2);
    }

    @Override // ea.a
    public StackTraceElement[] l(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr.length <= 1024) {
            return stackTraceElementArr;
        }
        ea.a[] aVarArr = (ea.a[]) this.b;
        StackTraceElement[] stackTraceElementArr2 = stackTraceElementArr;
        for (int i10 = 0; i10 < 1; i10++) {
            ea.a aVar = aVarArr[i10];
            if (stackTraceElementArr2.length <= 1024) {
                break;
            }
            stackTraceElementArr2 = aVar.l(stackTraceElementArr);
        }
        return stackTraceElementArr2.length > 1024 ? ((rb.a) this.c).l(stackTraceElementArr2) : stackTraceElementArr2;
    }

    public void l0(o0.g gVar) {
        androidx.biometric.n nVar = (androidx.biometric.n) this.c;
        pb.c cVar = (pb.c) this.b;
        int i10 = gVar.b;
        if (i10 != 0) {
            nVar.execute(new androidx.activity.i(cVar, i10));
        } else {
            nVar.execute(new i9.s(19, cVar, gVar.a));
        }
    }

    @Override // g6.n
    public void m(String str, long j3, long j10, long j11) {
        n nVar = (n) this.b;
        if (nVar != null) {
            nVar.m(str, j3, j10, j11);
        }
    }

    public void m0(androidx.mediarouter.app.r rVar) {
        if (rVar == null) {
            throw new IllegalArgumentException("callback must not be null");
        }
        if (!((Set) this.c).add(rVar)) {
            Log.w("MediaControllerCompat", "the callback has already been registered");
            return;
        }
        Handler handler = new Handler();
        rVar.f(handler);
        android.support.v4.media.session.h hVar = (android.support.v4.media.session.h) this.b;
        hVar.a.registerCallback(rVar.a, handler);
        synchronized (hVar.b) {
            if (hVar.e.a() != null) {
                android.support.v4.media.session.g gVar = new android.support.v4.media.session.g(rVar);
                hVar.d.put(rVar, gVar);
                rVar.c = gVar;
                try {
                    hVar.e.a().o(gVar);
                    rVar.e(13, null, null);
                } catch (RemoteException e) {
                    Log.e("MediaControllerCompat", "Dead object in registerCallback.", e);
                }
            } else {
                rVar.c = null;
                hVar.c.add(rVar);
            }
        }
    }

    @Override // c3.i
    public c3.h n(p pVar, long j3) {
        long position = pVar.getPosition();
        int min = (int) Math.min(20000L, pVar.getLength() - position);
        e2.v vVar = (e2.v) this.c;
        vVar.G(min);
        pVar.b(0, min, vVar.a);
        int i10 = -1;
        long j10 = -9223372036854775807L;
        int i11 = -1;
        while (vVar.a() >= 4) {
            if (h3.a.a(vVar.b, vVar.a) != 442) {
                vVar.K(1);
            } else {
                vVar.K(4);
                long c10 = j4.y.c(vVar);
                if (c10 != -9223372036854775807L) {
                    long b10 = ((e2.b0) this.b).b(c10);
                    if (b10 > j3) {
                        return j10 == -9223372036854775807L ? new c3.h(-1, b10, position) : new c3.h(0, -9223372036854775807L, position + i11);
                    }
                    if (b10 + 100000 > j3) {
                        return new c3.h(0, -9223372036854775807L, position + vVar.b);
                    }
                    j10 = b10;
                    i11 = vVar.b;
                }
                int i12 = vVar.c;
                if (vVar.a() >= 10) {
                    vVar.K(9);
                    int x10 = vVar.x() & 7;
                    if (vVar.a() >= x10) {
                        vVar.K(x10);
                        if (vVar.a() >= 4) {
                            if (h3.a.a(vVar.b, vVar.a) == 443) {
                                vVar.K(4);
                                int D = vVar.D();
                                if (vVar.a() < D) {
                                    vVar.J(i12);
                                } else {
                                    vVar.K(D);
                                }
                            }
                            while (true) {
                                if (vVar.a() < 4) {
                                    break;
                                }
                                int a2 = h3.a.a(vVar.b, vVar.a);
                                if (a2 == 442 || a2 == 441 || (a2 >>> 8) != 1) {
                                    break;
                                }
                                vVar.K(4);
                                if (vVar.a() < 2) {
                                    vVar.J(i12);
                                    break;
                                }
                                vVar.J(Math.min(vVar.c, vVar.b + vVar.D()));
                            }
                        } else {
                            vVar.J(i12);
                        }
                    } else {
                        vVar.J(i12);
                    }
                } else {
                    vVar.J(i12);
                }
                i10 = vVar.b;
            }
        }
        return j10 != -9223372036854775807L ? new c3.h(-2, j10, position + i10) : c3.h.d;
    }

    public void n0(Object obj) {
        Handler handler = (Handler) this.b;
        if (handler != null) {
            handler.post(new h0(this, obj, SystemClock.elapsedRealtime(), 0));
        }
    }

    @Override // hi.x3
    public void o(y3 y3Var, View view) {
        s sVar = (s) this.c;
        w70 w70Var = new w70(sVar, (f6) this.b, view, false, false, true);
        w70Var.Q = true;
        p2 p2Var = sVar.b.f0;
        sVar.getContext();
        sVar.H = m4.b(w70Var, p2Var, y3Var, true);
    }

    public void o0(g gVar) {
        d dVar;
        g gVar2;
        int i10;
        Log.d("CAST_CONTROLLER", "set current media");
        e3 e3Var = (e3) this.b;
        g gVar3 = (g) e3Var.c;
        if (b5.d.u()) {
            if (gVar3 == null && gVar == null) {
                return;
            }
            if (gVar3 != null) {
                ArrayList arrayList = gVar3.a;
                if (gVar != null && arrayList.size() == gVar.a.size()) {
                    while (i10 < arrayList.size()) {
                        f a2 = gVar3.a(i10);
                        f a10 = gVar.a(i10);
                        i10 = ((a2 == null && a10 == null) || (a2 != null && a10 != null && Objects.equals(a2.a, a10.a) && Objects.equals(a2.b, a10.b) && Objects.equals(a2.c, a10.c) && Objects.equals(a2.d, a10.d) && a2.e == a10.e && a2.f == a10.f)) ? i10 + 1 : 0;
                    }
                    return;
                }
            }
        }
        if (((a) e3Var.d) != null && gVar != null) {
            e3Var.o(gVar);
        }
        if (((a) e3Var.d) != null && (gVar2 = (g) e3Var.c) != null) {
            e3Var.S(gVar2);
        }
        if (gVar != null && gVar.a.size() > 0 && !gVar.a(0).a.startsWith("audio/") && (dVar = (d) e3Var.b) != null) {
            dVar.l(null, null);
        }
        a aVar = (a) e3Var.d;
        if (aVar != null && gVar != null) {
            aVar.d = gVar;
            aVar.g = 0;
            aVar.h = 0;
            aVar.p();
        }
        e3Var.c = gVar;
    }

    @Override // hi.x3
    public void onContentChanged() {
        s sVar = (s) this.c;
        e4 e4Var = sVar.s;
        if (e4Var != null) {
            e4Var.setSendLoading(sVar.r.l3());
        }
        sVar.V(true);
        sVar.Y();
        hi.e eVar = sVar.P;
        AndroidUtilities.cancelRunOnUIThread(eVar);
        AndroidUtilities.runOnUIThread(eVar, 1000L);
    }

    @Override // d6.h
    public void p(d6.f fVar, int i10) {
        Log.d("CAST_SESSION", "onSessionEnded " + ((d6.c) fVar).a() + " " + i10);
        ((e3) this.b).V(null);
    }

    public void p0(d6.c cVar) {
        e3 e3Var = (e3) this.b;
        if (cVar == null) {
            return;
        }
        n6.l.e("Must be called from the main thread.");
        e6.h hVar = cVar.j;
        String a2 = cVar.a();
        if (TextUtils.isEmpty(a2) || hVar == null) {
            return;
        }
        a aVar = (a) e3Var.d;
        if (aVar == null || !TextUtils.equals(aVar.c.a(), a2)) {
            e3Var.V(new a(cVar, (d6.g) this.c, hVar));
            n6.l.e("Must be called from the main thread.");
            CastDevice castDevice = cVar.k;
            String str = castDevice != null ? castDevice.d : null;
            PhotoViewer t12 = PhotoViewer.t1();
            d.i();
            if (t12.E == null || t12.e0 == null || !t12.Q1()) {
                return;
            }
            new wc(t12.e0, new zh.b()).Q(R.raw.forward, 36, !TextUtils.isEmpty(str) ? LocaleController.formatString(R.string.ChromecastStartedTo, str) : LocaleController.getString(R.string.ChromecastStarted)).j();
        }
    }

    @Override // hi.x3
    public void q(int i10) {
        s.O((s) this.c, 74, i10);
    }

    public void q0(androidx.mediarouter.app.r rVar) {
        if (rVar == null) {
            throw new IllegalArgumentException("callback must not be null");
        }
        if (!((Set) this.c).remove(rVar)) {
            Log.w("MediaControllerCompat", "the callback has never been registered");
            return;
        }
        try {
            ((android.support.v4.media.session.h) this.b).b(rVar);
        } finally {
            rVar.f(null);
        }
    }

    @Override // d6.h
    public void r(d6.f fVar) {
        d6.c cVar = (d6.c) fVar;
        Log.d("CAST_SESSION", "onSessionStarting " + cVar.a());
        p0(cVar);
    }

    public void r0(x1 x1Var) {
        Handler handler = (Handler) this.b;
        if (handler != null) {
            handler.post(new a1.e(2, this, x1Var));
        }
    }

    @Override // hi.x3
    public void s() {
        s sVar = (s) this.c;
        z3 z3Var = sVar.r;
        e4 e4Var = sVar.s;
        if (e4Var != null) {
            m3 m3Var = z3Var.n3;
            int i10 = (m3Var != null && m3Var.y() && z3Var.B4()) ? 1 : 0;
            if (e4Var.a0 == 2) {
                e4Var.b0 = i10;
            } else {
                e4Var.f(i10, true);
            }
            if (i10 != 0) {
                sVar.W();
            }
        }
        sVar.Z();
    }

    public int s0(Context context, com.google.android.gms.common.api.c cVar) {
        SparseIntArray sparseIntArray = (SparseIntArray) this.b;
        n6.l.h(context);
        n6.l.h(cVar);
        int i10 = 0;
        if (!cVar.k()) {
            return 0;
        }
        int l4 = cVar.l();
        int i11 = sparseIntArray.get(l4, -1);
        if (i11 != -1) {
            return i11;
        }
        int i12 = 0;
        while (true) {
            if (i12 >= sparseIntArray.size()) {
                i10 = -1;
                break;
            }
            int keyAt = sparseIntArray.keyAt(i12);
            if (keyAt > l4 && sparseIntArray.get(keyAt) == 0) {
                break;
            }
            i12++;
        }
        if (i10 == -1) {
            i10 = ((k6.e) this.c).d(context, l4);
        }
        sparseIntArray.put(l4, i10);
        return i10;
    }

    @Override // hi.x3
    public void t(w3 w3Var, View view) {
        s sVar = (s) this.c;
        w70 w70Var = new w70(sVar, (f6) this.b, view, false, false, true);
        w70Var.Q = true;
        sVar.H = m4.c(w70Var, sVar.b.f0, sVar.getContext(), (f6) this.b, w3Var, true);
    }

    public String toString() {
        switch (this.a) {
            case 27:
                StringBuilder sb2 = new StringBuilder(100);
                sb2.append(this.c.getClass().getSimpleName());
                sb2.append('{');
                ArrayList arrayList = (ArrayList) this.b;
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    sb2.append((String) arrayList.get(i10));
                    if (i10 < size - 1) {
                        sb2.append(", ");
                    }
                }
                sb2.append('}');
                return sb2.toString();
            default:
                return super.toString();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0062, code lost:
    
        if (r2.c(r6, r7, r0) == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // ce.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object u(ce.c cVar, kd.c cVar2) {
        ce.d dVar;
        int i10;
        b bVar;
        Throwable th2;
        if (cVar2 instanceof ce.d) {
            dVar = (ce.d) cVar2;
            int i11 = dVar.b;
            if ((i11 & TLObject.FLAG_31) != 0) {
                dVar.b = i11 - TLObject.FLAG_31;
                Object obj = dVar.a;
                Object obj2 = jd.a.a;
                i10 = dVar.b;
                if (i10 != 0) {
                    u7.b(obj);
                    ce.b bVar2 = (ce.b) this.b;
                    dVar.d = this;
                    dVar.e = cVar;
                    dVar.b = 1;
                    obj = ce.p.a(bVar2, cVar, dVar);
                    if (obj != obj2) {
                        bVar = this;
                    }
                    return obj2;
                }
                if (i10 != 1) {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    u7.b(obj);
                    return gd.i.a;
                }
                cVar = dVar.e;
                bVar = dVar.d;
                u7.b(obj);
                th2 = (Throwable) obj;
                if (th2 != null) {
                    za.w wVar = (za.w) bVar.c;
                    dVar.d = null;
                    dVar.e = null;
                    dVar.b = 2;
                }
                return gd.i.a;
            }
        }
        dVar = new ce.d(this, cVar2);
        Object obj3 = dVar.a;
        Object obj22 = jd.a.a;
        i10 = dVar.b;
        if (i10 != 0) {
        }
        th2 = (Throwable) obj3;
        if (th2 != null) {
        }
        return gd.i.a;
    }

    @Override // d6.h
    public void v(d6.f fVar, int i10) {
        Log.d("CAST_SESSION", "onSessionResumeFailed " + ((d6.c) fVar).a() + " " + i10);
    }

    @Override // hi.x3
    public void w() {
        e4 e4Var = ((s) this.c).s;
        if (e4Var != null) {
            int i10 = e4Var.a0;
            if (i10 == 2) {
                i10 = 0;
            }
            e4Var.b0 = i10;
            e4Var.e(false, false);
            e4Var.f(2, true);
        }
    }

    @Override // le.f
    public void x() {
        ((k) this.b).e((le.l) this.c);
    }

    @Override // g6.n
    public void y(String str, long j3, int i10, Object obj, long j10, long j11) {
        int i11;
        g6.m mVar = (g6.m) this.c;
        if (((n) this.b) != null) {
            if (i10 == 2001) {
                Object[] objArr = {Integer.valueOf(mVar.i)};
                g6.b bVar = mVar.a;
                Log.w(bVar.a, bVar.d("Possibility of local queue out of sync with receiver queue. Refetching sequence number. Current Local Sequence Number = %d", objArr));
                Iterator it = ((e6.h) mVar.h.b).i.iterator();
                while (it.hasNext()) {
                    ((e6.g) it.next()).o();
                }
                i11 = 2001;
            } else {
                i11 = i10;
            }
            ((n) this.b).y(str, j3, i11, obj, j10, j11);
        }
    }

    @Override // d6.h
    public void z(d6.f fVar) {
        Log.d("CAST_SESSION", "onSessionEnding " + ((d6.c) fVar).a());
    }

    public /* synthetic */ b(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    public /* synthetic */ b(Object obj, Object obj2, boolean z10, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    public b(IBinder iBinder) {
        this.a = 20;
        String interfaceDescriptor = iBinder.getInterfaceDescriptor();
        if (interfaceDescriptor != "android.os.IMessenger" && (interfaceDescriptor == null || !interfaceDescriptor.equals("android.os.IMessenger"))) {
            if (interfaceDescriptor != "com.google.android.gms.iid.IMessengerCompat" && (interfaceDescriptor == null || !interfaceDescriptor.equals("com.google.android.gms.iid.IMessengerCompat"))) {
                Log.w("MessengerIpcClient", "Invalid interface descriptor: ".concat(String.valueOf(interfaceDescriptor)));
                throw new RemoteException();
            }
            this.c = new j6.f(iBinder);
            this.b = null;
            return;
        }
        this.b = new Messenger(iBinder);
        this.c = null;
    }

    public /* synthetic */ b(Object obj) {
        this.a = 27;
        this.c = obj;
        this.b = new ArrayList();
    }

    public b(m6.a aVar) {
        this.a = 12;
        this.b = aVar == null ? null : aVar.b;
    }

    public b(k6.e eVar) {
        this.a = 28;
        this.b = new SparseIntArray();
        n6.l.h(eVar);
        this.c = eVar;
    }

    public b(androidx.fragment.app.j0 j0Var) {
        this.a = 4;
        this.b = j0Var;
        this.c = new CopyOnWriteArrayList();
    }

    public b(ea.a[] aVarArr) {
        this.a = 11;
        this.b = aVarArr;
        this.c = new rb.a(7);
    }

    @Override // le.f
    public void j() {
    }

    public b(int i10) {
        this.a = i10;
        switch (i10) {
            case 10:
                this.b = new ConcurrentHashMap(16, 0.75f, 10);
                this.c = new ReferenceQueue();
                break;
            case 14:
                this.b = new HashMap();
                break;
            case 17:
                break;
            case 26:
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
                this.b = byteArrayOutputStream;
                this.c = new DataOutputStream(byteArrayOutputStream);
                break;
            default:
                d6.a c10 = d6.a.c(ApplicationLoader.applicationContext);
                n2.l lVar = new n2.l(3);
                c10.getClass();
                n6.l.e("Must be called from the main thread.");
                d6.g gVar = c10.c;
                gVar.getClass();
                boolean z10 = false;
                try {
                    d6.y yVar = gVar.a;
                    d6.j jVar = new d6.j(lVar);
                    Parcel O0 = yVar.O0();
                    com.google.android.gms.internal.cast.v.d(O0, jVar);
                    yVar.S0(O0, 4);
                } catch (RemoteException e) {
                    d6.g.c.a(e, "Unable to call %s on %s.", "addCastStateListener", d6.y.class.getSimpleName());
                }
                this.b = new e3(9, z10);
                d6.g b10 = c10.b();
                this.c = b10;
                b10.a(this);
                p0(b10.c());
                break;
        }
    }

    @Override // le.f
    public void e(boolean z10) {
    }

    public b(e2.b0 b0Var) {
        this.a = 19;
        this.b = b0Var;
        this.c = new e2.v();
    }

    public b(com.google.firebase.messaging.s sVar, rb.a aVar, androidx.emoji2.text.d dVar) {
        this.a = 3;
        this.b = sVar;
        this.c = dVar;
    }

    public b(String str) {
        this.a = 18;
        this.c = null;
        this.b = str;
    }

    public b(Handler handler, a3.l0 l0Var) {
        this.a = 1;
        if (l0Var != null) {
            handler.getClass();
        } else {
            handler = null;
        }
        this.b = handler;
        this.c = l0Var;
    }

    public b(Handler handler, k2.j jVar) {
        this.a = 21;
        if (jVar != null) {
            handler.getClass();
        } else {
            handler = null;
        }
        this.b = handler;
        this.c = jVar;
    }

    public b(Context context, MediaSessionCompat$Token mediaSessionCompat$Token) {
        this.a = 2;
        if (mediaSessionCompat$Token != null) {
            this.c = DesugarCollections.synchronizedSet(new HashSet());
            if (Build.VERSION.SDK_INT >= 29) {
                this.b = new android.support.v4.media.session.i(context, mediaSessionCompat$Token);
                return;
            } else {
                this.b = new android.support.v4.media.session.h(context, mediaSessionCompat$Token);
                return;
            }
        }
        throw new IllegalArgumentException("sessionToken must not be null");
    }

    public b(androidx.emoji2.text.w wVar) {
        this.a = 5;
        this.b = wVar;
        this.c = new AtomicBoolean(false);
    }
}
