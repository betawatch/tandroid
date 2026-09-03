package bf;

import a4.k;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.content.res.Resources;
import android.graphics.Rect;
import android.media.MediaCodec;
import android.media.session.MediaController;
import android.media.session.PlaybackState;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Parcel;
import android.os.RemoteException;
import android.support.v4.media.session.MediaSessionCompat$Token;
import android.support.v4.media.session.PlaybackStateCompat;
import android.support.v4.media.session.l;
import android.support.v4.media.session.m;
import android.support.v4.media.session.n;
import android.support.v4.media.session.o;
import android.text.Editable;
import android.text.Selection;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.animation.Animation;
import androidx.emoji2.text.v;
import androidx.fragment.app.j0;
import androidx.fragment.app.s;
import b4.b0;
import b4.c0;
import b4.f0;
import b4.h0;
import b4.x;
import b4.y;
import c2.e0;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.internal.cast.c1;
import com.google.android.gms.internal.cast.c2;
import com.google.android.gms.internal.cast.r;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import d4.j;
import dh.i;
import f2.m1;
import f2.q1;
import f2.r1;
import h5.d0;
import h5.w;
import h7.u;
import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.lang.ref.ReferenceQueue;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.OverlappingFileLockException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.qc;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class b implements r5.h, v4.f, r3.e, b0, OnCompleteListener, com.google.android.gms.internal.clearcut.h, j, xd.b, a3.b {
    public static volatile b d;
    public final /* synthetic */ int a;
    public Object b;
    public Object c;

    public /* synthetic */ b(char c3, int i10) {
        this.a = i10;
    }

    public static b O() {
        b bVar;
        b bVar2 = d;
        if (bVar2 != null) {
            return bVar2;
        }
        synchronized (b.class) {
            try {
                bVar = d;
                if (bVar == null) {
                    bVar = new b(0, (byte) 0);
                    d = bVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return bVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0049 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0042 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static b p(Context context) {
        FileChannel fileChannel;
        FileLock fileLock;
        try {
            fileChannel = new RandomAccessFile(new File(context.getFilesDir(), "generatefid.lock"), "rw").getChannel();
            try {
                fileLock = fileChannel.lock();
            } catch (IOException | Error | OverlappingFileLockException e6) {
                e = e6;
                fileLock = null;
            }
        } catch (IOException | Error | OverlappingFileLockException e10) {
            e = e10;
            fileChannel = null;
            fileLock = null;
        }
        try {
            return new b(17, fileChannel, fileLock);
        } catch (IOException e11) {
            e = e11;
            Log.e("CrossProcessLock", "encountered error while creating and acquiring the lock, ignoring", e);
            if (fileLock != null) {
                try {
                    fileLock.release();
                } catch (IOException unused) {
                }
            }
            if (fileChannel != null) {
                try {
                    fileChannel.close();
                } catch (IOException unused2) {
                }
            }
            return null;
        } catch (Error e12) {
            e = e12;
            Log.e("CrossProcessLock", "encountered error while creating and acquiring the lock, ignoring", e);
            if (fileLock != null) {
            }
            if (fileChannel != null) {
            }
            return null;
        } catch (OverlappingFileLockException e13) {
            e = e13;
            Log.e("CrossProcessLock", "encountered error while creating and acquiring the lock, ignoring", e);
            if (fileLock != null) {
            }
            if (fileChannel != null) {
            }
            return null;
        }
    }

    public static boolean u(Editable editable, KeyEvent keyEvent, boolean z4) {
        v[] vVarArr;
        if (KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState())) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (selectionStart != -1 && selectionEnd != -1 && selectionStart == selectionEnd && (vVarArr = (v[]) editable.getSpans(selectionStart, selectionEnd, v.class)) != null && vVarArr.length > 0) {
                for (v vVar : vVarArr) {
                    int spanStart = editable.getSpanStart(vVar);
                    int spanEnd = editable.getSpanEnd(vVar);
                    if ((z4 && spanStart == selectionStart) || ((!z4 && spanEnd == selectionStart) || (selectionStart > spanStart && selectionStart < spanEnd))) {
                        editable.delete(spanStart, spanEnd);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public void A(s f10, boolean z4) {
        kotlin.jvm.internal.j.e(f10, "f");
        s sVar = ((j0) this.b).y;
        if (sVar != null) {
            sVar.p().o.A(f10, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.c).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z4) {
                throw null;
            }
            throw null;
        }
    }

    public void B(s f10, boolean z4) {
        kotlin.jvm.internal.j.e(f10, "f");
        s sVar = ((j0) this.b).y;
        if (sVar != null) {
            sVar.p().o.B(f10, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.c).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z4) {
                throw null;
            }
            throw null;
        }
    }

    public void C(s f10, boolean z4) {
        kotlin.jvm.internal.j.e(f10, "f");
        s sVar = ((j0) this.b).y;
        if (sVar != null) {
            sVar.p().o.C(f10, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.c).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z4) {
                throw null;
            }
            throw null;
        }
    }

    public void D(s f10, boolean z4) {
        kotlin.jvm.internal.j.e(f10, "f");
        s sVar = ((j0) this.b).y;
        if (sVar != null) {
            sVar.p().o.D(f10, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.c).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z4) {
                throw null;
            }
            throw null;
        }
    }

    public void E(s f10, boolean z4) {
        kotlin.jvm.internal.j.e(f10, "f");
        j0 j0Var = (j0) this.b;
        androidx.fragment.app.v vVar = j0Var.w.b;
        s sVar = j0Var.y;
        if (sVar != null) {
            sVar.p().o.E(f10, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.c).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z4) {
                throw null;
            }
            throw null;
        }
    }

    public void F(s f10, boolean z4) {
        kotlin.jvm.internal.j.e(f10, "f");
        s sVar = ((j0) this.b).y;
        if (sVar != null) {
            sVar.p().o.F(f10, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.c).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z4) {
                throw null;
            }
            throw null;
        }
    }

    public void G(s f10, boolean z4) {
        kotlin.jvm.internal.j.e(f10, "f");
        s sVar = ((j0) this.b).y;
        if (sVar != null) {
            sVar.p().o.G(f10, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.c).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z4) {
                throw null;
            }
            throw null;
        }
    }

    public void H(s f10, Bundle bundle, boolean z4) {
        kotlin.jvm.internal.j.e(f10, "f");
        s sVar = ((j0) this.b).y;
        if (sVar != null) {
            sVar.p().o.H(f10, bundle, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.c).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z4) {
                throw null;
            }
            throw null;
        }
    }

    public void I(s f10, boolean z4) {
        kotlin.jvm.internal.j.e(f10, "f");
        s sVar = ((j0) this.b).y;
        if (sVar != null) {
            sVar.p().o.I(f10, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.c).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z4) {
                throw null;
            }
            throw null;
        }
    }

    public void J(s f10, boolean z4) {
        kotlin.jvm.internal.j.e(f10, "f");
        s sVar = ((j0) this.b).y;
        if (sVar != null) {
            sVar.p().o.J(f10, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.c).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z4) {
                throw null;
            }
            throw null;
        }
    }

    public void K(s f10, boolean z4) {
        kotlin.jvm.internal.j.e(f10, "f");
        s sVar = ((j0) this.b).y;
        if (sVar != null) {
            sVar.p().o.K(f10, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.c).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z4) {
                throw null;
            }
            throw null;
        }
    }

    @Override // xd.b
    public void L(int i10, float f10, float f11, xd.c cVar) {
        i iVar = (i) this.c;
        iVar.c.a(f10);
        iVar.d.a(f10);
        iVar.b.a(f10);
        ((Runnable) this.b).run();
    }

    public View M(int i10, int i11, int i12, int i13) {
        a5.b bVar = (a5.b) this.c;
        q1 q1Var = (q1) this.b;
        int n10 = q1Var.n();
        int v = q1Var.v();
        int i14 = i11 > i10 ? 1 : -1;
        View view = null;
        while (i10 != i11) {
            View I = q1Var.I(i10);
            int d10 = q1Var.d(I);
            int J = q1Var.J(I);
            bVar.b = n10;
            bVar.c = v;
            bVar.d = d10;
            bVar.e = J;
            if (i12 != 0) {
                bVar.a = i12;
                if (bVar.a()) {
                    return I;
                }
            }
            if (i13 != 0) {
                bVar.a = i13;
                if (bVar.a()) {
                    view = I;
                }
            }
            i10 += i14;
        }
        return view;
    }

    public File N() {
        if (((File) this.b) == null) {
            synchronized (this) {
                try {
                    if (((File) this.b) == null) {
                        w8.g gVar = (w8.g) this.c;
                        gVar.a();
                        this.b = new File(gVar.a.getFilesDir(), "PersistedInstallation." + ((w8.g) this.c).d() + ".json");
                    }
                } finally {
                }
            }
        }
        return (File) this.b;
    }

    public PlaybackStateCompat P() {
        android.support.v4.media.session.h hVar = (android.support.v4.media.session.h) this.b;
        MediaSessionCompat$Token mediaSessionCompat$Token = hVar.e;
        if (mediaSessionCompat$Token.a() != null) {
            try {
                return mediaSessionCompat$Token.a().b();
            } catch (RemoteException e6) {
                Log.e("MediaControllerCompat", "Dead object in getPlaybackState.", e6);
            }
        }
        PlaybackState playbackState = hVar.a.getPlaybackState();
        if (playbackState != null) {
            return PlaybackStateCompat.a(playbackState);
        }
        return null;
    }

    public String Q(String str) {
        String str2 = (String) this.c;
        Resources resources = (Resources) this.b;
        int identifier = resources.getIdentifier(str, "string", str2);
        if (identifier == 0) {
            return null;
        }
        return resources.getString(identifier);
    }

    public l R() {
        MediaController.TransportControls transportControls = ((android.support.v4.media.session.h) this.b).a.getTransportControls();
        int i10 = Build.VERSION.SDK_INT;
        return i10 >= 29 ? new o(transportControls) : i10 >= 24 ? new n(transportControls) : i10 >= 23 ? new m(transportControls) : new l(transportControls);
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00bb, code lost:
    
        if (r6 >= r7) goto L11;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0108  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean S(CharSequence charSequence, int i10, int i11, androidx.emoji2.text.o oVar) {
        boolean z4;
        if (oVar.c == 0) {
            androidx.emoji2.text.h hVar = (androidx.emoji2.text.h) this.c;
            p1.a b10 = oVar.b();
            int a2 = b10.a(8);
            short s6 = a2 != 0 ? ((ByteBuffer) b10.d).getShort(a2 + b10.a) : (short) 0;
            androidx.emoji2.text.d dVar = (androidx.emoji2.text.d) hVar;
            dVar.getClass();
            int i12 = Build.VERSION.SDK_INT;
            if (i12 >= 23 || s6 <= i12) {
                ThreadLocal threadLocal = androidx.emoji2.text.d.b;
                if (threadLocal.get() == null) {
                    threadLocal.set(new StringBuilder());
                }
                StringBuilder sb = (StringBuilder) threadLocal.get();
                sb.setLength(0);
                while (i10 < i11) {
                    sb.append(charSequence.charAt(i10));
                    i10++;
                }
                TextPaint textPaint = dVar.a;
                String sb2 = sb.toString();
                ThreadLocal threadLocal2 = i0.c.a;
                if (Build.VERSION.SDK_INT >= 23) {
                    z4 = e0.b.l(textPaint, sb2);
                } else {
                    int length = sb2.length();
                    if (length != 1 || !Character.isWhitespace(sb2.charAt(0))) {
                        float measureText = textPaint.measureText("\udfffd");
                        float measureText2 = textPaint.measureText("m");
                        float measureText3 = textPaint.measureText(sb2);
                        float f10 = 0.0f;
                        if (measureText3 != 0.0f) {
                            if (sb2.codePointCount(0, sb2.length()) > 1) {
                                if (measureText3 <= measureText2 * 2.0f) {
                                    int i13 = 0;
                                    while (i13 < length) {
                                        int charCount = Character.charCount(sb2.codePointAt(i13)) + i13;
                                        f10 += textPaint.measureText(sb2, i13, charCount);
                                        i13 = charCount;
                                    }
                                }
                            }
                            if (measureText3 == measureText) {
                                ThreadLocal threadLocal3 = i0.c.a;
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
                                textPaint.getTextBounds(sb2, 0, length, (Rect) obj);
                                z4 = !rect.equals(obj);
                            }
                        }
                    }
                    z4 = true;
                }
                oVar.c = !z4 ? 2 : 1;
            }
            z4 = false;
            oVar.c = !z4 ? 2 : 1;
        }
        return oVar.c == 2;
    }

    public void T(da.b bVar) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("Fid", bVar.a);
            jSONObject.put("Status", m1.j.c(bVar.b));
            jSONObject.put("AuthToken", bVar.c);
            jSONObject.put("RefreshToken", bVar.d);
            jSONObject.put("TokenCreationEpochInSecs", bVar.f);
            jSONObject.put("ExpiresInSecs", bVar.e);
            jSONObject.put("FisError", bVar.g);
            w8.g gVar = (w8.g) this.c;
            gVar.a();
            File createTempFile = File.createTempFile("PersistedInstallation", "tmp", gVar.a.getFilesDir());
            FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
            fileOutputStream.write(jSONObject.toString().getBytes("UTF-8"));
            fileOutputStream.close();
            if (createTempFile.renameTo(N())) {
            } else {
                throw new IOException("unable to rename the tmpfile to PersistedInstallation");
            }
        } catch (IOException | JSONException unused) {
        }
    }

    public boolean U() {
        return ((a) ((androidx.biometric.e) this.b).d) != null;
    }

    public boolean V(View view) {
        a5.b bVar = (a5.b) this.c;
        q1 q1Var = (q1) this.b;
        int n10 = q1Var.n();
        int v = q1Var.v();
        int d10 = q1Var.d(view);
        int J = q1Var.J(view);
        bVar.b = n10;
        bVar.c = v;
        bVar.d = d10;
        bVar.e = J;
        bVar.a = 24579;
        return bVar.a();
    }

    public c5.e W(m1 m1Var, int i10) {
        r1 r1Var;
        c5.e eVar;
        a0.f fVar = (a0.f) this.b;
        int c3 = fVar.c(m1Var);
        if (c3 >= 0 && (r1Var = (r1) fVar.h(c3)) != null) {
            int i11 = r1Var.a;
            if ((i11 & i10) != 0) {
                int i12 = i11 & (~i10);
                r1Var.a = i12;
                if (i10 == 4) {
                    eVar = r1Var.b;
                } else {
                    if (i10 != 8) {
                        throw new IllegalArgumentException("Must provide flag PRE or POST");
                    }
                    eVar = r1Var.c;
                }
                if ((i12 & 12) == 0) {
                    fVar.f(c3);
                    r1Var.a = 0;
                    r1Var.b = null;
                    r1Var.c = null;
                    r1.d.h(r1Var);
                }
                return eVar;
            }
        }
        return null;
    }

    public da.b X() {
        JSONObject jSONObject;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[16384];
        try {
            FileInputStream fileInputStream = new FileInputStream(N());
            while (true) {
                try {
                    int read = fileInputStream.read(bArr, 0, 16384);
                    if (read < 0) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr, 0, read);
                } finally {
                }
            }
            jSONObject = new JSONObject(byteArrayOutputStream.toString());
            fileInputStream.close();
        } catch (IOException | JSONException unused) {
            jSONObject = new JSONObject();
        }
        String optString = jSONObject.optString("Fid", null);
        int optInt = jSONObject.optInt("Status", 0);
        String optString2 = jSONObject.optString("AuthToken", null);
        String optString3 = jSONObject.optString("RefreshToken", null);
        long optLong = jSONObject.optLong("TokenCreationEpochInSecs", 0L);
        long optLong2 = jSONObject.optLong("ExpiresInSecs", 0L);
        String optString4 = jSONObject.optString("FisError", null);
        int i10 = m1.j.d(5)[optInt];
        if (i10 == 0) {
            throw new NullPointerException("Null registrationStatus");
        }
        String str = i10 == 0 ? " registrationStatus" : "";
        if (str.isEmpty()) {
            return new da.b(optString, i10, optString2, optString3, optLong2, optLong, optString4);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    public void Y(androidx.mediarouter.app.s sVar) {
        if (sVar == null) {
            throw new IllegalArgumentException("callback must not be null");
        }
        if (((ConcurrentHashMap) this.c).putIfAbsent(sVar, Boolean.TRUE) != null) {
            Log.w("MediaControllerCompat", "the callback has already been registered");
            return;
        }
        Handler handler = new Handler();
        sVar.f(handler);
        android.support.v4.media.session.h hVar = (android.support.v4.media.session.h) this.b;
        hVar.a.registerCallback(sVar.a, handler);
        synchronized (hVar.b) {
            if (hVar.e.a() != null) {
                android.support.v4.media.session.g gVar = new android.support.v4.media.session.g(sVar);
                hVar.d.put(sVar, gVar);
                sVar.c = gVar;
                try {
                    hVar.e.a().j(gVar);
                    sVar.e(13, null, null);
                } catch (RemoteException e6) {
                    Log.e("MediaControllerCompat", "Dead object in registerCallback.", e6);
                }
            } else {
                sVar.c = null;
                hVar.c.add(sVar);
            }
        }
    }

    public void Z() {
        try {
            ((FileLock) this.c).release();
            ((FileChannel) this.b).close();
        } catch (IOException e6) {
            Log.e("CrossProcessLock", "encountered error while releasing, ignoring", e6);
        }
    }

    @Override // b4.b0
    public void a(w wVar) {
        f0 f0Var = (f0) this.c;
        SparseArray sparseArray = f0Var.f;
        h5.v vVar = (h5.v) this.b;
        if (wVar.u() == 0 && (wVar.u() & 128) != 0) {
            wVar.G(6);
            int a2 = wVar.a() / 4;
            for (int i10 = 0; i10 < a2; i10++) {
                wVar.e(0, 4, vVar.b);
                vVar.p(0);
                int i11 = vVar.i(16);
                vVar.s(3);
                if (i11 == 0) {
                    vVar.s(13);
                } else {
                    int i12 = vVar.i(13);
                    if (sparseArray.get(i12) == null) {
                        sparseArray.put(i12, new c0(new k(f0Var, i12)));
                        f0Var.l++;
                    }
                }
            }
            if (f0Var.a != 2) {
                sparseArray.remove(0);
            }
        }
    }

    public void a0(m1 m1Var) {
        r1 r1Var = (r1) ((a0.f) this.b).get(m1Var);
        if (r1Var == null) {
            return;
        }
        r1Var.a &= -2;
    }

    @Override // r3.e
    public r3.d b(r3.l lVar, long j10) {
        long position = lVar.getPosition();
        int min = (int) Math.min(20000L, lVar.getLength() - position);
        w wVar = (w) this.c;
        wVar.C(min);
        lVar.b(0, min, wVar.a);
        int i10 = -1;
        long j11 = -9223372036854775807L;
        int i11 = -1;
        while (wVar.a() >= 4) {
            if (x.a(wVar.b, wVar.a) != 442) {
                wVar.G(1);
            } else {
                wVar.G(4);
                long c3 = y.c(wVar);
                if (c3 != -9223372036854775807L) {
                    long b10 = ((h5.c0) this.b).b(c3);
                    if (b10 > j10) {
                        return j11 == -9223372036854775807L ? new r3.d(-1, b10, position) : new r3.d(0, -9223372036854775807L, position + i11);
                    }
                    if (b10 + 100000 > j10) {
                        return new r3.d(0, -9223372036854775807L, position + wVar.b);
                    }
                    j11 = b10;
                    i11 = wVar.b;
                }
                int i12 = wVar.c;
                if (wVar.a() >= 10) {
                    wVar.G(9);
                    int u10 = wVar.u() & 7;
                    if (wVar.a() >= u10) {
                        wVar.G(u10);
                        if (wVar.a() >= 4) {
                            if (x.a(wVar.b, wVar.a) == 443) {
                                wVar.G(4);
                                int z4 = wVar.z();
                                if (wVar.a() < z4) {
                                    wVar.F(i12);
                                } else {
                                    wVar.G(z4);
                                }
                            }
                            while (true) {
                                if (wVar.a() < 4) {
                                    break;
                                }
                                int a2 = x.a(wVar.b, wVar.a);
                                if (a2 == 442 || a2 == 441 || (a2 >>> 8) != 1) {
                                    break;
                                }
                                wVar.G(4);
                                if (wVar.a() < 2) {
                                    wVar.F(i12);
                                    break;
                                }
                                wVar.F(Math.min(wVar.c, wVar.b + wVar.z()));
                            }
                        } else {
                            wVar.F(i12);
                        }
                    } else {
                        wVar.F(i12);
                    }
                } else {
                    wVar.F(i12);
                }
                i10 = wVar.b;
            }
        }
        return j11 != -9223372036854775807L ? new r3.d(-2, j11, position + i10) : r3.d.d;
    }

    public void b0(m1 m1Var) {
        a0.f fVar = (a0.f) this.b;
        a0.h hVar = (a0.h) this.c;
        int m9 = hVar.m() - 1;
        while (true) {
            if (m9 < 0) {
                break;
            }
            if (m1Var == hVar.n(m9)) {
                Object[] objArr = hVar.c;
                Object obj = objArr[m9];
                Object obj2 = a0.i.a;
                if (obj != obj2) {
                    objArr[m9] = obj2;
                    hVar.a = true;
                }
            } else {
                m9--;
            }
        }
        r1 r1Var = (r1) fVar.get(m1Var);
        if (r1Var != null) {
            fVar.remove(m1Var);
            r1Var.a = 0;
            r1Var.b = null;
            r1Var.c = null;
            r1.d.h(r1Var);
        }
    }

    public void c0(h hVar) {
        e eVar;
        h hVar2;
        int i10;
        Log.d("CAST_CONTROLLER", "set current media");
        androidx.biometric.e eVar2 = (androidx.biometric.e) this.b;
        h hVar3 = (h) eVar2.c;
        if (d1.f.u()) {
            if (hVar3 == null && hVar == null) {
                return;
            }
            if (hVar3 != null) {
                ArrayList arrayList = hVar3.a;
                if (hVar != null && arrayList.size() == hVar.a.size()) {
                    while (i10 < arrayList.size()) {
                        g a2 = hVar3.a(i10);
                        g a10 = hVar.a(i10);
                        i10 = ((a2 == null && a10 == null) || (a2 != null && a10 != null && Objects.equals(a2.a, a10.a) && Objects.equals(a2.b, a10.b) && Objects.equals(a2.c, a10.c) && Objects.equals(a2.d, a10.d) && a2.e == a10.e && a2.f == a10.f)) ? i10 + 1 : 0;
                    }
                    return;
                }
            }
        }
        if (((a) eVar2.d) != null && hVar != null) {
            eVar2.e(hVar);
        }
        if (((a) eVar2.d) != null && (hVar2 = (h) eVar2.c) != null) {
            eVar2.z(hVar2);
        }
        if (hVar != null && hVar.a.size() > 0 && !hVar.a(0).a.startsWith("audio/") && (eVar = (e) eVar2.b) != null) {
            eVar.l(null, null);
        }
        a aVar = (a) eVar2.d;
        if (aVar != null && hVar != null) {
            aVar.d = hVar;
            aVar.g = 0;
            aVar.h = 0;
            aVar.p();
        }
        eVar2.c = hVar;
    }

    @Override // v4.f
    public int d(long j10) {
        int i10;
        switch (this.a) {
            case 2:
                ArrayList arrayList = (ArrayList) this.c;
                Long valueOf = Long.valueOf(j10);
                int i11 = d0.a;
                int binarySearch = Collections.binarySearch(arrayList, valueOf);
                if (binarySearch < 0) {
                    i10 = ~binarySearch;
                } else {
                    int size = arrayList.size();
                    do {
                        binarySearch++;
                        if (binarySearch < size) {
                        }
                        i10 = binarySearch;
                    } while (((Comparable) arrayList.get(binarySearch)).compareTo(valueOf) == 0);
                    i10 = binarySearch;
                }
                if (i10 < arrayList.size()) {
                    return i10;
                }
                return -1;
            default:
                long[] jArr = (long[]) this.c;
                int b10 = d0.b(jArr, j10, false);
                if (b10 < jArr.length) {
                    return b10;
                }
                return -1;
        }
    }

    public void d0(r5.c cVar) {
        androidx.biometric.e eVar = (androidx.biometric.e) this.b;
        if (cVar == null) {
            return;
        }
        b6.m.e("Must be called from the main thread.");
        s5.h hVar = cVar.j;
        String a2 = cVar.a();
        if (TextUtils.isEmpty(a2) || hVar == null) {
            return;
        }
        a aVar = (a) eVar.d;
        if (aVar == null || !TextUtils.equals(aVar.c.a(), a2)) {
            eVar.B(new a(cVar, (r5.g) this.c, hVar));
            b6.m.e("Must be called from the main thread.");
            CastDevice castDevice = cVar.k;
            String str = castDevice != null ? castDevice.d : null;
            PhotoViewer t12 = PhotoViewer.t1();
            e.i();
            if (t12.B == null || t12.b0 == null || !t12.Q1()) {
                return;
            }
            new qc(t12.b0, new oh.b()).Q(R.raw.forward, 36, !TextUtils.isEmpty(str) ? LocaleController.formatString(R.string.ChromecastStartedTo, str) : LocaleController.getString(R.string.ChromecastStarted)).j();
        }
    }

    @Override // r5.h
    public void e(r5.f fVar, int i10) {
        Log.d("CAST_SESSION", "onSessionResumeFailed " + ((r5.c) fVar).a() + " " + i10);
    }

    public void e0(androidx.mediarouter.app.s sVar) {
        if (sVar == null) {
            throw new IllegalArgumentException("callback must not be null");
        }
        if (((ConcurrentHashMap) this.c).remove(sVar) == null) {
            Log.w("MediaControllerCompat", "the callback has never been registered");
            return;
        }
        try {
            ((android.support.v4.media.session.h) this.b).b(sVar);
        } finally {
            sVar.f(null);
        }
    }

    @Override // r5.h
    public void f(r5.f fVar, String str) {
        r5.c cVar = (r5.c) fVar;
        Log.d("CAST_SESSION", "onSessionStarted " + cVar.a() + " " + str);
        d0(cVar);
    }

    public int f0(Context context, com.google.android.gms.common.api.c cVar) {
        SparseIntArray sparseIntArray = (SparseIntArray) this.b;
        b6.m.h(context);
        b6.m.h(cVar);
        int i10 = 0;
        if (!cVar.j()) {
            return 0;
        }
        int k10 = cVar.k();
        int i11 = sparseIntArray.get(k10, -1);
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
            if (keyAt > k10 && sparseIntArray.get(keyAt) == 0) {
                break;
            }
            i12++;
        }
        if (i10 == -1) {
            i10 = ((y5.e) this.c).d(context, k10);
        }
        sparseIntArray.put(k10, i10);
        return i10;
    }

    @Override // r5.h
    public void g(r5.f fVar, boolean z4) {
        Log.d("CAST_SESSION", "onSessionResumed " + ((r5.c) fVar).a() + " " + z4);
    }

    @Override // rc.a
    public Object get() {
        int i10 = 7;
        z9.d dVar = new z9.d(i10);
        u uVar = new u(i10);
        Object obj = ((rc.a) this.b).get();
        rc.a aVar = (rc.a) this.c;
        return new f3.h(dVar, uVar, f3.a.f, (f3.j) obj, aVar);
    }

    @Override // r5.h
    public void h(r5.f fVar, int i10) {
        Log.d("CAST_SESSION", "onSessionStartSuspended " + ((r5.c) fVar).a() + " " + i10);
    }

    @Override // r5.h
    public void i(r5.f fVar, int i10) {
        Log.d("CAST_SESSION", "onSessionStartFailed " + ((r5.c) fVar).a() + " " + i10);
    }

    @Override // r5.h
    public void j(r5.f fVar) {
        r5.c cVar = (r5.c) fVar;
        Log.d("CAST_SESSION", "onSessionStarting " + cVar.a());
        d0(cVar);
    }

    @Override // r5.h
    public void k(r5.f fVar, String str) {
        Log.d("CAST_SESSION", "onSessionResuming " + ((r5.c) fVar).a() + " " + str);
    }

    @Override // v4.f
    public long l(int i10) {
        switch (this.a) {
            case 2:
                ArrayList arrayList = (ArrayList) this.c;
                h5.a.f(i10 >= 0);
                h5.a.f(i10 < arrayList.size());
                return ((Long) arrayList.get(i10)).longValue();
            default:
                long[] jArr = (long[]) this.c;
                h5.a.f(i10 >= 0);
                h5.a.f(i10 < jArr.length);
                return jArr[i10];
        }
    }

    @Override // r5.h
    public void m(r5.f fVar) {
        Log.d("CAST_SESSION", "onSessionEnding " + ((r5.c) fVar).a());
    }

    @Override // r3.e
    public void n() {
        w wVar = (w) this.c;
        byte[] bArr = d0.f;
        wVar.getClass();
        wVar.D(bArr.length, bArr);
    }

    @Override // r5.h
    public void o(r5.f fVar, int i10) {
        Log.d("CAST_SESSION", "onSessionEnded " + ((r5.c) fVar).a() + " " + i10);
        ((androidx.biometric.e) this.b).B(null);
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        boolean z4;
        r5.b bVar;
        com.google.android.gms.internal.cast.o oVar = (com.google.android.gms.internal.cast.o) this.b;
        r5.b bVar2 = (r5.b) this.c;
        c2.c0 c0Var = oVar.c;
        u5.b bVar3 = com.google.android.gms.internal.cast.o.j;
        if (task.isSuccessful()) {
            Bundle bundle = (Bundle) task.getResult();
            boolean z10 = bundle != null && bundle.containsKey("com.google.android.gms.cast.FLAG_OUTPUT_SWITCHER_ENABLED");
            bVar3.b("The module-to-client output switcher flag %s", true != z10 ? "not existed" : "existed");
            if (z10) {
                z4 = bundle.getBoolean("com.google.android.gms.cast.FLAG_OUTPUT_SWITCHER_ENABLED");
                Log.i(bVar3.a, bVar3.d("Set up output switcher flags: %b (from module), %b (from CastOptions)", Boolean.valueOf(z4), Boolean.valueOf(bVar2.x)));
                boolean z11 = !z4 && bVar2.x;
                if (c0Var != null || (bVar = oVar.d) == null) {
                }
                boolean z12 = bVar.v;
                boolean z13 = bVar.s;
                e0 e0Var = new e0();
                int i10 = Build.VERSION.SDK_INT;
                if (i10 >= 30) {
                    e0Var.b = z11;
                }
                if (i10 >= 30) {
                    e0Var.d = z12;
                }
                if (i10 >= 30) {
                    e0Var.c = z13;
                }
                c2.c0.i(new c2.f0(e0Var));
                Log.i(bVar3.a, bVar3.d("media transfer = %b, session transfer = %b, transfer to local = %b, in-app output switcher = %b", Boolean.valueOf(oVar.i), Boolean.valueOf(z11), Boolean.valueOf(z12), Boolean.valueOf(z13)));
                if (z12) {
                    r rVar = oVar.f;
                    b6.m.h(rVar);
                    com.google.android.gms.internal.cast.n nVar = new com.google.android.gms.internal.cast.n(rVar);
                    c2.c0.b();
                    c2.c0.c().f = nVar;
                    c2.a(c1.Y);
                    return;
                }
                return;
            }
        }
        z4 = true;
        Log.i(bVar3.a, bVar3.d("Set up output switcher flags: %b (from module), %b (from CastOptions)", Boolean.valueOf(z4), Boolean.valueOf(bVar2.x)));
        if (z4) {
        }
        if (c0Var != null) {
        }
    }

    @Override // v4.f
    public List q(long j10) {
        v4.b bVar;
        switch (this.a) {
            case 2:
                int c3 = d0.c((ArrayList) this.c, Long.valueOf(j10), false);
                return c3 == -1 ? Collections.EMPTY_LIST : (List) ((ArrayList) this.b).get(c3);
            default:
                int e6 = d0.e((long[]) this.c, j10, false);
                return (e6 == -1 || (bVar = ((v4.b[]) this.b)[e6]) == v4.b.E) ? Collections.EMPTY_LIST : Collections.singletonList(bVar);
        }
    }

    public void r(Object obj, String str) {
        ((ArrayList) this.b).add(android.support.v4.media.a.z(str, "=", String.valueOf(obj)));
    }

    public void s(m1 m1Var, c5.e eVar) {
        a0.f fVar = (a0.f) this.b;
        r1 r1Var = (r1) fVar.get(m1Var);
        if (r1Var == null) {
            r1Var = r1.a();
            fVar.put(m1Var, r1Var);
        }
        r1Var.c = eVar;
        r1Var.a |= 8;
    }

    @Override // d4.j
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public d4.c A1(d4.i iVar) {
        MediaCodec mediaCodec;
        String str = iVar.a.a;
        d4.c cVar = null;
        try {
            h5.a.c("createCodec:" + str);
            mediaCodec = MediaCodec.createByCodecName(str);
            try {
                d4.c cVar2 = new d4.c(mediaCodec, (HandlerThread) ((d4.b) this.b).get(), (HandlerThread) ((d4.b) this.c).get());
                try {
                    h5.a.q();
                    d4.c.i(cVar2, iVar.b, iVar.d, iVar.e);
                    return cVar2;
                } catch (Exception e6) {
                    e = e6;
                    cVar = cVar2;
                    if (cVar != null) {
                        cVar.release();
                    } else if (mediaCodec != null) {
                        mediaCodec.release();
                    }
                    throw e;
                }
            } catch (Exception e10) {
                e = e10;
            }
        } catch (Exception e11) {
            e = e11;
            mediaCodec = null;
        }
    }

    public String toString() {
        switch (this.a) {
            case 12:
                StringBuilder sb = new StringBuilder(100);
                sb.append(this.c.getClass().getSimpleName());
                sb.append('{');
                ArrayList arrayList = (ArrayList) this.b;
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    sb.append((String) arrayList.get(i10));
                    if (i10 < size - 1) {
                        sb.append(", ");
                    }
                }
                sb.append('}');
                return sb.toString();
            default:
                return super.toString();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.util.List] */
    public ArrayList v() {
        ?? arrayList;
        ArrayList arrayList2 = new ArrayList();
        o5.i iVar = (o5.i) this.c;
        Context context = (Context) this.b;
        Class cls = (Class) iVar.b;
        Bundle bundle = null;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                Log.w("ComponentDiscovery", "Context has no PackageManager.");
            } else {
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, (Class<?>) cls), 128);
                if (serviceInfo == null) {
                    Log.w("ComponentDiscovery", cls + " has no service info.");
                } else {
                    bundle = serviceInfo.metaData;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
            Log.w("ComponentDiscovery", "Application info not found.");
        }
        if (bundle == null) {
            Log.w("ComponentDiscovery", "Could not retrieve metadata, returning empty list of registrars.");
            arrayList = Collections.EMPTY_LIST;
        } else {
            arrayList = new ArrayList();
            for (String str : bundle.keySet()) {
                if ("com.google.firebase.components.ComponentRegistrar".equals(bundle.get(str)) && str.startsWith("com.google.firebase.components:")) {
                    arrayList.add(str.substring(31));
                }
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(new c9.d((String) it.next(), 0));
        }
        return arrayList2;
    }

    public void w(s f10, boolean z4) {
        kotlin.jvm.internal.j.e(f10, "f");
        s sVar = ((j0) this.b).y;
        if (sVar != null) {
            sVar.p().o.w(f10, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.c).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z4) {
                throw null;
            }
            throw null;
        }
    }

    @Override // v4.f
    public int x() {
        switch (this.a) {
            case 2:
                return ((ArrayList) this.c).size();
            default:
                return ((long[]) this.c).length;
        }
    }

    public void y(s f10, boolean z4) {
        kotlin.jvm.internal.j.e(f10, "f");
        j0 j0Var = (j0) this.b;
        androidx.fragment.app.v vVar = j0Var.w.b;
        s sVar = j0Var.y;
        if (sVar != null) {
            sVar.p().o.y(f10, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.c).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z4) {
                throw null;
            }
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002f  */
    @Override // xd.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void z(float f10, int i10) {
        boolean z4;
        i iVar = (i) this.c;
        boolean z10 = true;
        if ((iVar.b() == 0.0f && iVar.s == 2) || iVar.s == 3) {
            iVar.s = 1;
            z4 = true;
        } else {
            z4 = false;
        }
        if (f10 == 1.0f) {
            int i11 = iVar.w;
            int i12 = iVar.v;
            if (i11 != i12) {
                iVar.w = i12;
                if (z10) {
                    ((Runnable) this.b).run();
                }
                iVar.a();
            }
        }
        z10 = z4;
        if (z10) {
        }
        iVar.a();
    }

    @Override // com.google.android.gms.internal.clearcut.h
    public Object zzp() {
        com.google.android.gms.internal.clearcut.d dVar = (com.google.android.gms.internal.clearcut.d) this.b;
        com.google.android.gms.internal.clearcut.b bVar = (com.google.android.gms.internal.clearcut.b) this.c;
        bVar.getClass();
        Map b10 = com.google.android.gms.internal.clearcut.d.e() ? ((Boolean) com.google.android.gms.internal.clearcut.d.c(new com.google.android.gms.internal.clearcut.e("gms:phenotype:phenotype_flag:debug_disable_caching", 0))).booleanValue() : false ? bVar.b() : bVar.e;
        if (b10 == null) {
            synchronized (bVar.d) {
                try {
                    HashMap hashMap = bVar.e;
                    b10 = hashMap;
                    if (hashMap == null) {
                        HashMap b11 = bVar.b();
                        bVar.e = b11;
                        b10 = b11;
                    }
                } finally {
                }
            }
        }
        if (b10 == null) {
            b10 = Collections.EMPTY_MAP;
        }
        return (String) b10.get(dVar.b);
    }

    public /* synthetic */ b(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    public /* synthetic */ b(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    public /* synthetic */ b(Object obj, Object obj2, boolean z4, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = obj2;
    }

    public b(Context context) {
        this.a = 13;
        b6.m.h(context);
        Resources resources = context.getResources();
        this.b = resources;
        this.c = resources.getResourcePackageName(org.telegram.messenger.beta.R.string.common_google_play_services_unknown_issue);
    }

    public /* synthetic */ b(Object obj) {
        this.a = 12;
        this.c = obj;
        this.b = new ArrayList();
    }

    public b(y5.e eVar) {
        this.a = 14;
        this.b = new SparseIntArray();
        b6.m.h(eVar);
        this.c = eVar;
    }

    public b(j0 j0Var) {
        this.a = 7;
        this.b = j0Var;
        this.c = new CopyOnWriteArrayList();
    }

    public b(int i10, byte b10) {
        this.a = i10;
        boolean z4 = false;
        switch (i10) {
            case 21:
                this.b = new ConcurrentHashMap(16, 0.75f, 10);
                this.c = new ReferenceQueue();
                break;
            case 28:
                this.b = new a0.f(0);
                this.c = new a0.h();
                break;
            default:
                r5.a c3 = r5.a.c(ApplicationLoader.applicationContext);
                androidx.emoji2.text.w wVar = new androidx.emoji2.text.w(3);
                c3.getClass();
                b6.m.e("Must be called from the main thread.");
                r5.g gVar = c3.c;
                gVar.getClass();
                try {
                    r5.y yVar = gVar.a;
                    r5.j jVar = new r5.j(wVar);
                    Parcel M0 = yVar.M0();
                    com.google.android.gms.internal.cast.s.d(M0, jVar);
                    yVar.Q0(M0, 4);
                } catch (RemoteException e6) {
                    r5.g.c.a(e6, "Unable to call %s on %s.", "addCastStateListener", r5.y.class.getSimpleName());
                }
                this.b = new androidx.biometric.e(8, z4);
                r5.g b11 = c3.b();
                this.c = b11;
                b11.a(this);
                d0(b11.c());
                break;
        }
    }

    public b(h5.c0 c0Var) {
        this.a = 9;
        this.b = c0Var;
        this.c = new w();
    }

    public b(int i10) {
        this.a = 22;
        d4.b bVar = new d4.b(i10, 0);
        d4.b bVar2 = new d4.b(i10, 1);
        this.b = bVar;
        this.c = bVar2;
    }

    public b(w8.g gVar) {
        this.a = 23;
        this.c = gVar;
    }

    public b(com.google.firebase.messaging.s sVar, ab.a aVar, androidx.emoji2.text.d dVar) {
        this.a = 5;
        this.b = sVar;
        this.c = dVar;
    }

    public b(q1 q1Var) {
        this.a = 27;
        this.b = q1Var;
        a5.b bVar = new a5.b();
        bVar.a = 0;
        this.c = bVar;
    }

    public b(Animation animation) {
        this.a = 6;
        this.b = animation;
        this.c = null;
    }

    public b(Animator animator) {
        this.a = 6;
        this.b = null;
        AnimatorSet animatorSet = new AnimatorSet();
        this.c = animatorSet;
        animatorSet.play(animator);
    }

    public b(Context context, android.support.v4.media.session.c0 c0Var) {
        this.a = 3;
        this.c = new ConcurrentHashMap();
        MediaSessionCompat$Token mediaSessionCompat$Token = c0Var.a.b;
        if (Build.VERSION.SDK_INT >= 29) {
            this.b = new android.support.v4.media.session.i(context, mediaSessionCompat$Token);
        } else {
            this.b = new android.support.v4.media.session.h(context, mediaSessionCompat$Token);
        }
    }

    public b(Context context, MediaSessionCompat$Token mediaSessionCompat$Token) {
        this.a = 3;
        this.c = new ConcurrentHashMap();
        if (mediaSessionCompat$Token != null) {
            this.b = new android.support.v4.media.session.h(context, mediaSessionCompat$Token);
            return;
        }
        throw new IllegalArgumentException("sessionToken must not be null");
    }

    @Override // b4.b0
    public void c(h5.c0 c0Var, r3.m mVar, h0 h0Var) {
    }

    public b(f0 f0Var) {
        this.a = 10;
        this.c = f0Var;
        this.b = new h5.v(new byte[4], 4);
    }
}
