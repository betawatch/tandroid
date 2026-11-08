package nb;

import a8.r7;
import ad.c;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Paint;
import android.graphics.RectF;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.Editable;
import android.text.style.CharacterStyle;
import b7.l;
import bg.n;
import bi.x5;
import c4.k;
import c8.z0;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import f3.g;
import g6.d0;
import ia.d;
import j$.util.Objects;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ShortBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import lf.b;
import m8.e;
import org.json.JSONObject;
import org.telegram.messenger.IMapsProvider;
import org.telegram.messenger.ab;
import org.telegram.messenger.ca;
import org.telegram.messenger.cb;
import org.telegram.messenger.da;
import org.telegram.messenger.fj;
import org.telegram.messenger.ga;
import org.telegram.messenger.ij;
import org.telegram.messenger.o10;
import org.telegram.messenger.o2;
import org.telegram.messenger.ua;
import org.telegram.messenger.va;
import org.telegram.messenger.wa;
import org.telegram.messenger.xa;
import org.telegram.messenger.ya;
import org.telegram.messenger.za;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.Cells.f1;
import org.telegram.ui.Cells.j9;
import org.telegram.ui.Cells.l1;
import org.telegram.ui.Cells.q1;
import org.telegram.ui.Components.r5;
import org.telegram.ui.fr0;
import org.xml.sax.Attributes;
import pb.h;
import q2.f;
import q2.j;
import q2.m;
import q2.x;
import u2.u;
import w7.o;
import w7.q;
import w7.s;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final class a implements k, eg.a, g, fg.a, d, ja.a, b, Continuation, u9.d, IMapsProvider, gh.a, l1, m, u, x5.a {
    public static final /* synthetic */ a b = new a(14);
    public final /* synthetic */ int a;

    public /* synthetic */ a(int i7) {
        this.a = i7;
    }

    public static ia.b W(s sVar) {
        return new ia.b(System.currentTimeMillis() + 3600000, new l(8), new ia.a(true, false, false), 10.0d, 1.2d, 60);
    }

    public static n c0(Editable editable, int i7) {
        n[] nVarArr = (n[]) editable.getSpans(0, editable.length(), n.class);
        if (nVarArr.length == 0) {
            return null;
        }
        for (int length = nVarArr.length; length > 0; length--) {
            int i10 = length - 1;
            if (editable.getSpanFlags(nVarArr[i10]) == 17) {
                n nVar = nVarArr[i10];
                if (nVar.a == i7) {
                    return nVar;
                }
            }
        }
        return null;
    }

    public static boolean f0(boolean z9, String str, Editable editable, Attributes attributes) {
        int i7;
        boolean z10 = false;
        Object obj = null;
        if (str.startsWith("animated-emoji")) {
            if (z9) {
                String a10 = bg.m.a("data-document-id", attributes);
                if (a10 != null) {
                    editable.setSpan(new r5(Long.parseLong(a10), (Paint.FontMetricsInt) null), editable.length(), editable.length(), 17);
                    return true;
                }
            } else {
                Object[] spans = editable.getSpans(0, editable.length(), r5.class);
                if (spans.length != 0) {
                    int length = spans.length;
                    while (true) {
                        if (length <= 0) {
                            break;
                        }
                        int i10 = length - 1;
                        if (editable.getSpanFlags(spans[i10]) == 17) {
                            obj = spans[i10];
                            break;
                        }
                        length--;
                    }
                }
                Object obj2 = (r5) obj;
                if (obj2 != null) {
                    int spanStart = editable.getSpanStart(obj2);
                    editable.removeSpan(obj2);
                    if (spanStart != editable.length()) {
                        editable.setSpan(obj2, spanStart, editable.length(), 33);
                        return true;
                    }
                    return true;
                }
            }
            return false;
        }
        if (str.equals("spoiler")) {
            if (z9) {
                editable.setSpan(new n(0), editable.length(), editable.length(), 17);
                return true;
            }
            Object c02 = c0(editable, 0);
            if (c02 != null) {
                int spanStart2 = editable.getSpanStart(c02);
                editable.removeSpan(c02);
                if (spanStart2 != editable.length()) {
                    editable.setSpan(c02, spanStart2, editable.length(), 33);
                    return true;
                }
                return true;
            }
            return false;
        }
        if (str.equals("pre")) {
            if (z9) {
                String a11 = bg.m.a("language", attributes);
                if (a11 == null) {
                    a11 = bg.m.a("lang", attributes);
                }
                if (a11 == null) {
                    a11 = bg.m.a("lng", attributes);
                }
                editable.setSpan(new n(a11), editable.length(), editable.length(), 17);
                return true;
            }
            Object c03 = c0(editable, 1);
            if (c03 != null) {
                int spanStart3 = editable.getSpanStart(c03);
                editable.removeSpan(c03);
                if (spanStart3 != editable.length()) {
                    editable.setSpan(c03, spanStart3, editable.length(), 33);
                    return true;
                }
                return true;
            }
            return false;
        }
        if (!str.equals("blockquote")) {
            if (str.equals("details")) {
                if (z9) {
                    editable.setSpan(new n(3), editable.length(), editable.length(), 17);
                    return true;
                }
                Object c04 = c0(editable, 3);
                if (c04 != null) {
                    int spanStart4 = editable.getSpanStart(c04);
                    editable.removeSpan(c04);
                    if (spanStart4 != editable.length()) {
                        editable.setSpan(c04, spanStart4, editable.length(), 33);
                    }
                    return true;
                }
            }
            return false;
        }
        if (z9) {
            String a12 = bg.m.a("class", attributes);
            if (bg.m.a("data-collapsed", attributes) != null || (a12 != null && a12.contains("telegram-collapsed-quote"))) {
                z10 = true;
            }
            editable.setSpan(new n(z10 ? 3 : 2), editable.length(), editable.length(), 17);
            return true;
        }
        n[] nVarArr = (n[]) editable.getSpans(0, editable.length(), n.class);
        for (int length2 = nVarArr.length - 1; length2 >= 0; length2--) {
            n nVar = nVarArr[length2];
            if (editable.getSpanFlags(nVar) == 17 && ((i7 = nVar.a) == 2 || i7 == 3)) {
                obj = nVar;
                break;
            }
        }
        if (obj != null) {
            int spanStart5 = editable.getSpanStart(obj);
            editable.removeSpan(obj);
            if (spanStart5 != editable.length()) {
                editable.setSpan(obj, spanStart5, editable.length(), 33);
                return true;
            }
            return true;
        }
        return false;
    }

    public static String l0(c cVar) {
        String str = cVar.a;
        if ("br".equals(str)) {
            return "\n";
        }
        if ("img".equals(str)) {
            String str2 = (String) cVar.a().get("alt");
            return (str2 == null || str2.length() == 0) ? "￼" : str2;
        }
        if ("iframe".equals(str)) {
            return " ";
        }
        return null;
    }

    public static void r0(String str) {
        if (str == null || str.length() == 0) {
            throw new tc.c("Invalid Publishable Key: You must use a valid publishable key to create a token.  For more info, see https://stripe.com/docs/stripe.js.", null);
        }
        if (str.startsWith("sk_")) {
            throw new tc.c("Invalid Publishable Key: You are using a secret key to create a token, instead of the publishable one. For more info, see https://stripe.com/docs/stripe.js", null);
        }
    }

    public static final CharSequence t0(Object obj) {
        Objects.requireNonNull(obj);
        return obj instanceof CharSequence ? (CharSequence) obj : obj.toString();
    }

    @Override // gh.a
    public int A() {
        return 0;
    }

    @Override // ja.a
    public StackTraceElement[] B(StackTraceElement[] stackTraceElementArr) {
        int i7;
        HashMap hashMap = new HashMap();
        StackTraceElement[] stackTraceElementArr2 = new StackTraceElement[stackTraceElementArr.length];
        int i10 = 0;
        int i11 = 0;
        int i12 = 1;
        while (i10 < stackTraceElementArr.length) {
            StackTraceElement stackTraceElement = stackTraceElementArr[i10];
            Integer num = (Integer) hashMap.get(stackTraceElement);
            if (num != null) {
                int intValue = num.intValue();
                int i13 = i10 - intValue;
                if (i10 + i13 <= stackTraceElementArr.length) {
                    for (int i14 = 0; i14 < i13; i14++) {
                        if (stackTraceElementArr[intValue + i14].equals(stackTraceElementArr[i10 + i14])) {
                        }
                    }
                    int intValue2 = i10 - num.intValue();
                    if (i12 < 10) {
                        System.arraycopy(stackTraceElementArr, i10, stackTraceElementArr2, i11, intValue2);
                        i11 += intValue2;
                        i12++;
                    }
                    i7 = (intValue2 - 1) + i10;
                    hashMap.put(stackTraceElement, Integer.valueOf(i10));
                    i10 = i7 + 1;
                }
            }
            stackTraceElementArr2[i11] = stackTraceElementArr[i10];
            i11++;
            i12 = 1;
            i7 = i10;
            hashMap.put(stackTraceElement, Integer.valueOf(i10));
            i10 = i7 + 1;
        }
        StackTraceElement[] stackTraceElementArr3 = new StackTraceElement[i11];
        System.arraycopy(stackTraceElementArr2, 0, stackTraceElementArr3, 0, i11);
        return i11 < stackTraceElementArr.length ? stackTraceElementArr3 : stackTraceElementArr;
    }

    @Override // org.telegram.ui.Cells.l1
    public void B1(q1 q1Var, TLRPC.WebPage webPage, String str, boolean z9) {
        vf.c.t(q1Var.getContext(), str);
    }

    @Override // gh.a
    public /* synthetic */ int C0() {
        return 0;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ CharacterStyle C1(q1 q1Var) {
        return null;
    }

    @Override // c4.k
    public int D(e2.u uVar) {
        return 1;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean E1(q1 q1Var, ij ijVar) {
        return false;
    }

    @Override // q2.m
    public int F(e2.u uVar) {
        return uVar.w != null ? 1 : 0;
    }

    @Override // eg.a
    public void H0(ShortBuffer shortBuffer, int i7, ShortBuffer shortBuffer2, int i10) {
        (i7 == 6 ? eg.a.p : i7 > i10 ? eg.a.l : i7 < i10 ? eg.a.m : eg.a.o).H0(shortBuffer, i7, shortBuffer2, i10);
    }

    @Override // u2.u
    public boolean I(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean J0(long j3) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean J1(q1 q1Var, TLRPC.PollAnswer pollAnswer) {
        return false;
    }

    @Override // u2.u
    public int L() {
        return MediaCodecList.getCodecCount();
    }

    @Override // gh.a
    public /* synthetic */ int M() {
        return 0;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ fr0 N1() {
        return null;
    }

    @Override // gh.a
    public int O() {
        return 0;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean O0(q1 q1Var, boolean z9) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean Q(q1 q1Var, TLRPC.TodoItem todoItem, boolean z9) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean Q1(long j3) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean R() {
        return false;
    }

    @Override // gh.a
    public int R0() {
        return 0;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean S(q1 q1Var) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean S1(q1 q1Var, TLRPC.TodoItem todoItem) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean T() {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean W0(ij ijVar) {
        return f1.a(ijVar);
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ int X() {
        return 0;
    }

    @Override // u2.u
    public boolean Y() {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ jh.a Z() {
        return null;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean a0(q1 q1Var) {
        return false;
    }

    @Override // lf.b
    public lf.a b(wf.b bVar) {
        return new gf.l(bVar);
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean b0(q1 q1Var, TLRPC.User user) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean b2(q1 q1Var, TL_iv.PageBlock pageBlock) {
        return false;
    }

    @Override // ia.d
    public ia.b c(s sVar, JSONObject jSONObject) {
        return W(sVar);
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean d() {
        return false;
    }

    @Override // u9.d
    public Object e(r7 r7Var) {
        switch (this.a) {
            case 15:
                return new h();
            default:
                synchronized (q.class) {
                    byte b10 = (byte) (((byte) 1) | 2);
                    if (b10 != 3) {
                        StringBuilder sb2 = new StringBuilder();
                        if ((b10 & 1) == 0) {
                            sb2.append(" enableFirelog");
                        }
                        if ((b10 & 2) == 0) {
                            sb2.append(" firelogEventType");
                        }
                        throw new IllegalStateException("Missing required properties:".concat(sb2.toString()));
                    }
                    q.a(new o());
                }
                return new a(0);
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean e0() {
        return false;
    }

    @Override // gh.a
    public int e1() {
        return 0;
    }

    @Override // u2.u
    public MediaCodecInfo f(int i7) {
        return MediaCodecList.getCodecInfoAt(i7);
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean g() {
        return true;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean g2(int i7) {
        return false;
    }

    @Override // org.telegram.messenger.IMapsProvider
    public int getInstallMapsString() {
        return 2131749197;
    }

    @Override // org.telegram.messenger.IMapsProvider
    public String getMapsAppPackageName() {
        return "com.google.android.apps.maps";
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ String h(q1 q1Var) {
        return null;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ int h0(q1 q1Var) {
        return 0;
    }

    @Override // q2.m
    public q2.g i(j jVar, e2.u uVar) {
        if (uVar.w == null) {
            return null;
        }
        return new q2.n(new f(6001, new x()));
    }

    @Override // org.telegram.messenger.IMapsProvider
    public void initializeMaps(Context context) {
        synchronized (k8.b.class) {
            k8.b.a(context);
        }
    }

    @Override // gh.a
    public /* synthetic */ float j0() {
        return -1.0f;
    }

    @Override // org.telegram.ui.Cells.l1
    public boolean k0() {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ j9 k2() {
        return null;
    }

    @Override // c4.k
    public c4.m l(e2.u uVar) {
        throw new IllegalStateException("This SubtitleParser.Factory doesn't support any formats.");
    }

    @Override // org.telegram.messenger.IMapsProvider
    public ya loadRawResourceStyle(Context context, int i7) {
        InputStream openRawResource = context.getResources().openRawResource(i7);
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr = new byte[1024];
            while (true) {
                try {
                    int read = openRawResource.read(bArr, 0, 1024);
                    if (read == -1) {
                        x6.b.a(openRawResource);
                        x6.b.a(byteArrayOutputStream);
                        e eVar = new e(new String(byteArrayOutputStream.toByteArray(), "UTF-8"));
                        ga gaVar = new ga();
                        gaVar.a = eVar;
                        return gaVar;
                    }
                    byteArrayOutputStream.write(bArr, 0, read);
                } catch (Throwable th2) {
                    x6.b.a(openRawResource);
                    x6.b.a(byteArrayOutputStream);
                    throw th2;
                }
            }
        } catch (IOException e10) {
            throw new Resources.NotFoundException("Failed to read resource " + i7 + ": " + e10.toString());
        }
    }

    @Override // q2.m
    public /* synthetic */ q2.l m(j jVar, e2.u uVar) {
        return q2.l.z;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean n0(r5 r5Var) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean n1() {
        return false;
    }

    @Override // org.telegram.messenger.IMapsProvider
    public ua newCameraUpdateLatLng(cb cbVar) {
        LatLng latLng = new LatLng(cbVar.a, cbVar.b);
        try {
            l8.a aVar = z0.a;
            q6.m.h(aVar, "CameraUpdateFactory is not initialized");
            Parcel p12 = aVar.p1();
            v7.b.b(p12, latLng);
            Parcel o12 = aVar.o1(p12, 8);
            a7.a m12 = a7.b.m1(o12.readStrongBinder());
            o12.recycle();
            return new ca(new k8.a(m12, 0));
        } catch (RemoteException e10) {
            throw new androidx.car.app.j(e10);
        }
    }

    @Override // org.telegram.messenger.IMapsProvider
    public ua newCameraUpdateLatLngBounds(wa waVar, int i7) {
        LatLngBounds latLngBounds = ((da) waVar).a;
        try {
            l8.a aVar = z0.a;
            q6.m.h(aVar, "CameraUpdateFactory is not initialized");
            Parcel p12 = aVar.p1();
            v7.b.b(p12, latLngBounds);
            p12.writeInt(i7);
            Parcel o12 = aVar.o1(p12, 10);
            a7.a m12 = a7.b.m1(o12.readStrongBinder());
            o12.recycle();
            return new ca(new k8.a(m12, 0));
        } catch (RemoteException e10) {
            throw new androidx.car.app.j(e10);
        }
    }

    @Override // org.telegram.messenger.IMapsProvider
    public ua newCameraUpdateLatLngZoom(cb cbVar, float f10) {
        LatLng latLng = new LatLng(cbVar.a, cbVar.b);
        try {
            l8.a aVar = z0.a;
            q6.m.h(aVar, "CameraUpdateFactory is not initialized");
            Parcel p12 = aVar.p1();
            v7.b.b(p12, latLng);
            p12.writeFloat(f10);
            Parcel o12 = aVar.o1(p12, 9);
            a7.a m12 = a7.b.m1(o12.readStrongBinder());
            o12.recycle();
            return new ca(new k8.a(m12, 0));
        } catch (RemoteException e10) {
            throw new androidx.car.app.j(e10);
        }
    }

    @Override // gh.a
    public /* synthetic */ float o0() {
        return -1.0f;
    }

    @Override // org.telegram.messenger.IMapsProvider
    public va onCreateCircleOptions() {
        h9.f1 f1Var = new h9.f1(22, false);
        m8.b bVar = new m8.b();
        bVar.a = null;
        bVar.b = 0.0d;
        bVar.c = 10.0f;
        bVar.d = -16777216;
        bVar.e = 0;
        bVar.f = 0.0f;
        bVar.h = true;
        bVar.n = false;
        bVar.r = null;
        f1Var.b = bVar;
        return f1Var;
    }

    @Override // org.telegram.messenger.IMapsProvider
    public xa onCreateLatLngBoundsBuilder() {
        d0 d0Var = new d0(25, false);
        m8.d dVar = new m8.d(0);
        dVar.b = Double.POSITIVE_INFINITY;
        dVar.c = Double.NEGATIVE_INFINITY;
        dVar.d = Double.NaN;
        dVar.e = Double.NaN;
        d0Var.b = dVar;
        return d0Var;
    }

    @Override // org.telegram.messenger.IMapsProvider
    public za onCreateMapView(Context context) {
        r7 r7Var = new r7(13, (byte) 0);
        r7Var.b = new x5(r7Var, context);
        return r7Var;
    }

    @Override // org.telegram.messenger.IMapsProvider
    public ab onCreateMarkerOptions() {
        gf.g gVar = new gf.g(24);
        m8.g gVar2 = new m8.g();
        gVar2.e = 0.5f;
        gVar2.f = 1.0f;
        gVar2.n = true;
        gVar2.r = false;
        gVar2.s = 0.0f;
        gVar2.w = 0.5f;
        gVar2.x = 0.0f;
        gVar2.y = 1.0f;
        gVar.b = gVar2;
        return gVar;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean p1(q1 q1Var, int i7) {
        return false;
    }

    @Override // fg.a
    public void q0(ShortBuffer shortBuffer, int i7, ShortBuffer shortBuffer2, int i10, int i11) {
        if (i7 > i10) {
            throw new IllegalArgumentException("Illegal use of UpsampleAudioResampler");
        }
        if (i11 != 1 && i11 != 2) {
            throw new IllegalArgumentException(jg.g.j(i11, "Illegal use of UpsampleAudioResampler. Channels:"));
        }
        int remaining = shortBuffer.remaining() / i11;
        int ceil = ((int) Math.ceil((i10 / i7) * remaining)) - remaining;
        float f10 = remaining;
        float f11 = f10 / f10;
        float f12 = ceil;
        float f13 = f12 / f12;
        while (remaining > 0 && ceil > 0) {
            if (f11 >= f13) {
                shortBuffer2.put(shortBuffer.get());
                if (i11 == 2) {
                    shortBuffer2.put(shortBuffer.get());
                }
                remaining--;
                f11 = remaining / f10;
            } else {
                shortBuffer2.put(shortBuffer2.get(shortBuffer2.position() - i11));
                if (i11 == 2) {
                    shortBuffer2.put(shortBuffer2.get(shortBuffer2.position() - i11));
                }
                ceil--;
                f13 = ceil / f12;
            }
        }
    }

    @Override // x5.a
    public long s() {
        return System.currentTimeMillis();
    }

    @Override // u2.u
    public boolean t(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return "secure-playback".equals(str) && "video/avc".equals(str2);
    }

    @Override // com.google.android.gms.tasks.Continuation
    public /* synthetic */ Object then(Task task) {
        Intent intent = (Intent) ((Bundle) task.getResult()).getParcelable("notification_data");
        if (intent != null) {
            return new m6.a(intent);
        }
        return null;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean u1(q1 q1Var, TLRPC.Chat chat) {
        return false;
    }

    @Override // gh.a
    public /* synthetic */ float v0() {
        return 0.0f;
    }

    @Override // c4.k
    public boolean w(e2.u uVar) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean w1() {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ boolean x0(ij ijVar) {
        return true;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ String y(long j3) {
        return null;
    }

    @Override // eg.a
    public int z1(int i7, int i10, int i11) {
        return (i10 == 6 ? eg.a.p : i10 > i11 ? eg.a.l : i10 < i11 ? eg.a.m : eg.a.o).z1(i7, i10, i11);
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void F1() {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void Z0() {
    }

    @Override // q2.m
    public /* synthetic */ void a() {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void e2() {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void i2() {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void k() {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void p() {
    }

    @Override // q2.m
    public /* synthetic */ void release() {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void u() {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void z0() {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void A1(ij ijVar) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void C(q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void D0(q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void G0(q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void H(q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void J(fj fjVar) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void K0(q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void N(q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void P(ij ijVar) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void P0(q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void Q0(q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void U1(q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void V(q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void c2(q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void d0(int i7) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void i0(q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void m0(String str) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void o(q1 q1Var) {
    }

    @Override // f3.g
    public long q(long j3) {
        return j3;
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void r(q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void r1(q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void v(q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void x(q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void y0(q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void y1(q1 q1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void z(q1 q1Var) {
    }

    @Override // q2.m
    public void E(Looper looper, m2.j jVar) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void G(q1 q1Var, o2 o2Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void H1(q1 q1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void K1(q1 q1Var, o10 o10Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void L0(q1 q1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void P1(String str, String str2) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void W1(q1 q1Var, long j3) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void b1(q1 q1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void g1(q1 q1Var, int i7) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void s1(q1 q1Var, boolean z9) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void v1(q1 q1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void x1(q1 q1Var, int i7) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void A0(q1 q1Var, TLObject tLObject, boolean z9) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void B0(q1 q1Var, float f10, float f11) {
    }

    @Override // org.telegram.ui.Cells.l1
    public void E0(q1 q1Var, boolean z9, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void K(q1 q1Var, TLRPC.Document document, RectF rectF) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void N0(q1 q1Var, CharacterStyle characterStyle, boolean z9) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void g0(q1 q1Var, float f10, float f11) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void j1(q1 q1Var, float f10, float f11) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void j2(q1 q1Var, int i7, int i10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void p0(q1 q1Var, float f10, float f11) {
    }

    @Override // org.telegram.ui.Cells.l1
    public void q1(q1 q1Var, boolean z9, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void I1(q1 q1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void n(q1 q1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i7) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void s0(q1 q1Var, TLRPC.User user, float f10, float f11) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void u0(q1 q1Var, float f10, float f11, boolean z9) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void R1(q1 q1Var, int i7, float f10, float f11, boolean z9) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void f2(q1 q1Var, TLRPC.ReactionCount reactionCount, boolean z9, float f10, float f11) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void j(q1 q1Var, ArrayList arrayList, int i7, int i10, int i11) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void U(q1 q1Var, TLRPC.Chat chat, int i7, float f10, float f11, boolean z9) {
    }

    @Override // org.telegram.ui.Cells.l1
    public /* synthetic */ void D1(ij ijVar, String str, String str2, String str3, String str4, int i7, int i10) {
    }
}
