// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.net.Uri;
import android.os.SystemClock;
import android.util.LongSparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class n02 extends View implements ViewTreeObserver.OnPreDrawListener, ViewTreeObserver.OnScrollChangedListener, ViewTreeObserver.OnGlobalLayoutListener {
    public ViewGroup E;
    public vr1 F;
    public ha4 G;
    public boolean H;
    public boolean I;
    public ViewTreeObserver J;
    public final boolean a;
    public final RectF b;
    public final RectF c;
    public final RectF d;
    public final LongSparseArray e;
    public final fo1 f;
    public ra4 h;
    public final vh2 n;
    public yv1 r;
    public k47 s;
    public long w;
    public boolean x;
    public String y;

    public n02(Context context) {
        super(context);
        this.b = new RectF();
        this.c = new RectF();
        this.d = new RectF();
        this.e = new LongSparseArray();
        this.f = new fo1(this, (byte) 17);
        this.n = new vh2((byte) 2);
        this.a = gda.c1;
    }

    public final void a(k47 k47Var, String str, String str2, String str3, boolean z) {
        long j;
        long[] g = (k47Var == null || k47.B0(k47Var.k) != this.w) ? null : g(k47Var);
        if (g == null) {
            return;
        }
        long j2 = k47Var.k.grouped_id;
        byte b = 1;
        int i = (int) g[1];
        vh6 vh6Var = this.r.P6;
        int i2 = 0;
        while (true) {
            j = 0;
            if (j2 == 0 || i2 >= vh6Var.m()) {
                break;
            }
            f47 f47Var = (f47) vh6Var.n(i2);
            if (!f47Var.d.isEmpty() && ((k47) f47Var.d.get(0)).k.grouped_id == j2) {
                i = Math.min(i, d(f47Var));
            }
            i2++;
        }
        TLRPC.Chat L0 = oc7.r1(this.r.getCurrentAccount()).L0(Long.valueOf(-g[0]));
        long j3 = g[0];
        if (L0 != null && !L0.min) {
            j = L0.access_hash;
        }
        String str4 = this.y;
        this.r.getClass();
        la4 la4Var = new la4(j3, j, i, str, str2, str4, null, ia4.d(this.r.getCurrentAccount()), Utilities.b.nextLong());
        if (!this.x) {
            la4Var.k = this.w;
            la4Var.l = k47Var.e1();
        }
        this.s = z ? k47Var : null;
        ra4 ra4Var = this.h;
        boolean equals = str.equals("open_media");
        boolean z2 = z || (PhotoViewer.C0() && PhotoViewer.r0().V0());
        ra4Var.a();
        ra4Var.b = la4Var;
        ra4Var.c = SystemClock.uptimeMillis();
        ra4Var.d = equals;
        ra4Var.e = equals && z2;
        ra4Var.g = null;
        ra4Var.f = true;
        int currentAccount = this.r.getCurrentAccount();
        ia4.g = str3 != null ? la4Var : null;
        ia4.h = str3;
        String f = ia4.f(currentAccount);
        la4 a = la4.a(la4Var.b());
        if (f != null) {
            ia4.d.postRunnable(new ba4(f, a, b));
        }
        h(100L);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:52:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(final k47 k47Var, String str) {
        String str2;
        final String str3;
        final byte b = 0;
        final byte b2 = 1;
        boolean z = str != null && l11.h(str);
        if (str != null) {
            String lowerCase = str.indexOf(58) > 0 ? str.substring(0, str.indexOf(58)).toLowerCase() : "";
            String lowerCase2 = str.toLowerCase();
            if (!str.startsWith("@") && !lowerCase.equals("tg")) {
                if (lowerCase.equals("http") || lowerCase.equals("https") || lowerCase.equals("tonsite")) {
                    String str4 = lowerCase2.substring(lowerCase.length() + 1).replaceFirst("^//", "").split("[/?#:]", 2)[0];
                    if (str4.equals("telegra.ph") || str4.equals("te.legra.ph") || str4.equals("graph.org") || (str4.equals("telegram.org") && lowerCase2.matches(".*telegram\\.org/(faq|privacy|blog).*"))) {
                        str3 = "iv";
                    } else if (!z) {
                        str3 = "external";
                    }
                    if (str3 != null) {
                        long uptimeMillis = SystemClock.uptimeMillis();
                        vh2 vh2Var = this.n;
                        if (str == null || !str.equals((String) vh2Var.c) || uptimeMillis - vh2Var.b >= 1000) {
                            vh2Var.c = str;
                            vh2Var.b = uptimeMillis;
                            if ("iv".equals(str3)) {
                                final String uri = l11.C(Uri.parse(str)).toString();
                                hi2 hi2Var = ia4.f;
                                Runnable runnable = new Runnable(this) { // from class: l02
                                    public final /* synthetic */ n02 b;

                                    {
                                        this.b = this;
                                    }

                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (b) {
                                            case 0:
                                                this.b.a(k47Var, "open_iv", null, uri, false);
                                                break;
                                            default:
                                                this.b.a(k47Var, "open_link", uri, null, false);
                                                break;
                                        }
                                    }
                                };
                                hi2Var.b = str;
                                hi2Var.c = runnable;
                                return;
                            }
                            if (!"external".equals(str3)) {
                                a(k47Var, "open_link", str3, null, false);
                                return;
                            }
                            hi2 hi2Var2 = ia4.f;
                            Runnable runnable2 = new Runnable(this) { // from class: l02
                                public final /* synthetic */ n02 b;

                                {
                                    this.b = this;
                                }

                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (b2) {
                                        case 0:
                                            this.b.a(k47Var, "open_iv", null, str3, false);
                                            break;
                                        default:
                                            this.b.a(k47Var, "open_link", str3, null, false);
                                            break;
                                    }
                                }
                            };
                            hi2Var2.b = str;
                            hi2Var2.c = runnable2;
                            return;
                        }
                        return;
                    }
                    return;
                }
            }
            str2 = "in_app";
            str3 = str2;
            if (str3 != null) {
            }
        }
        str2 = null;
        str3 = str2;
        if (str3 != null) {
        }
    }

    public final void c(yv1 yv1Var, long j, ViewGroup viewGroup, vr1 vr1Var) {
        this.r = yv1Var;
        this.w = j;
        this.E = viewGroup;
        this.F = vr1Var;
        this.h = new ra4(new h64((byte) 11), new ca4(ia4.f(yv1Var.getCurrentAccount()), (byte) 0));
        boolean V = sd2.V(yv1Var.e);
        this.x = V;
        String str = j == z8c.h(yv1Var.getCurrentAccount()).e() ? "saved" : j > 0 ? m9c.v(yv1Var.h()) ? "bot" : "chat" : V ? "channel" : yv1Var.v4 ? "discussion" : "group";
        this.y = str;
        if (str.equals("saved")) {
            return;
        }
        this.G = new ha4(yv1Var.getCurrentAccount(), this.y);
    }

    public final int d(f47 f47Var) {
        ArrayList arrayList = f47Var.d;
        int size = arrayList.size();
        int i = ConnectionsManager.DEFAULT_DATACENTER_ID;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            long[] g = g((k47) obj);
            if (g != null) {
                i = (int) Math.min(i, g[1]);
            }
        }
        return i;
    }

    /* JADX WARN: Removed duplicated region for block: B:213:0x0401  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0410 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e() {
        LongSparseArray longSparseArray;
        ka4 ka4Var;
        int i;
        int i2;
        float f;
        View view;
        long e1;
        f47 f47Var;
        int i3;
        int i4;
        f47 f47Var2;
        float[] fArr;
        float f2;
        int i5;
        int i6;
        int i7;
        if (this.E == null || this.F == null || this.G == null) {
            return;
        }
        this.r.getClass();
        LongSparseArray longSparseArray2 = this.e;
        longSparseArray2.clear();
        int childCount = this.F.getChildCount();
        int i8 = 0;
        int i9 = 0;
        while (i9 < childCount) {
            View childAt = this.F.getChildAt(i9);
            rc2 rc2Var = childAt instanceof rc2 ? (rc2) childAt : null;
            k47 messageObject = rc2Var != null ? rc2Var.getMessageObject() : null;
            long[] g = (messageObject == null || k47.B0(messageObject.k) != this.w) ? null : g(messageObject);
            if (g != null) {
                ViewGroup viewGroup = this.E;
                RectF rectF = this.d;
                if (zgc.c(childAt, viewGroup, rectF)) {
                    long j = messageObject.k.grouped_id;
                    if (j != 0) {
                        view = childAt;
                        e1 = j;
                        f = 0.0f;
                    } else {
                        f = 0.0f;
                        view = childAt;
                        e1 = messageObject.e1();
                    }
                    m02 m02Var = (m02) longSparseArray2.get(e1);
                    if (m02Var == null) {
                        long e12 = j != 0 ? j : messageObject.e1();
                        m02Var = new m02();
                        longSparseArray2.put(e12, m02Var);
                        m02Var.a.set(rectF);
                        m02Var.c = j;
                        m02Var.d = g[i8];
                        m02Var.e = messageObject.e1();
                    }
                    HashMap hashMap = m02Var.j;
                    m02Var.a.union(rectF);
                    m02Var.f = (int) Math.min(m02Var.f, g[1]);
                    f47 currentMessagesGroup = rc2Var.getCurrentMessagesGroup();
                    c47 currentPosition = rc2Var.getCurrentPosition();
                    if (j != 0) {
                        if (m02Var.i == null) {
                            ArrayList arrayList = new ArrayList();
                            vh6 vh6Var = this.r.P6;
                            int i10 = i8;
                            while (i10 < vh6Var.m()) {
                                f47 f47Var3 = (f47) vh6Var.n(i10);
                                if (arrayList.contains(f47Var3) || f47Var3.d.isEmpty()) {
                                    i7 = childCount;
                                } else {
                                    i7 = childCount;
                                    if (((k47) f47Var3.d.get(0)).k.grouped_id == m02Var.c) {
                                        arrayList.add(f47Var3);
                                    }
                                }
                                i10++;
                                childCount = i7;
                            }
                            i = childCount;
                            if (currentMessagesGroup != null && !currentMessagesGroup.d.isEmpty() && !arrayList.contains(currentMessagesGroup)) {
                                arrayList.add(currentMessagesGroup);
                            }
                            m02Var.i = new float[0];
                            if (!arrayList.isEmpty()) {
                                Collections.sort(arrayList, new i01(this, (byte) 1));
                                m02Var.f = Math.min(m02Var.f, d((f47) arrayList.get(0)));
                                int size = arrayList.size();
                                int i11 = 0;
                                float f3 = 1.0f;
                                while (i11 < size) {
                                    Object obj = arrayList.get(i11);
                                    i11++;
                                    ArrayList arrayList2 = ((f47) obj).e;
                                    int size2 = arrayList2.size();
                                    int i12 = size;
                                    int i13 = 0;
                                    while (i13 < size2) {
                                        Object obj2 = arrayList2.get(i13);
                                        int i14 = i13 + 1;
                                        float f4 = ((c47) obj2).s;
                                        if (f4 > f) {
                                            f3 = f4;
                                        }
                                        i13 = i14;
                                    }
                                    size = i12;
                                }
                                int size3 = arrayList.size();
                                int i15 = 0;
                                while (i15 < size3) {
                                    Object obj3 = arrayList.get(i15);
                                    int i16 = i15 + 1;
                                    f47 f47Var4 = (f47) obj3;
                                    int length = m02Var.i.length;
                                    int i17 = size3;
                                    hashMap.put(f47Var4, Integer.valueOf(length));
                                    ArrayList arrayList3 = f47Var4.e;
                                    if (arrayList3.isEmpty()) {
                                        i3 = i16;
                                        i4 = i9;
                                        float[] copyOf = Arrays.copyOf(m02Var.i, length + 1);
                                        m02Var.i = copyOf;
                                        k47 k47Var = (k47) f47Var4.d.get(0);
                                        if (k47Var.U2() || k47Var.I3()) {
                                            fArr = copyOf;
                                            f47Var2 = currentMessagesGroup;
                                            f2 = 100.0f;
                                        } else {
                                            fArr = copyOf;
                                            f47Var2 = currentMessagesGroup;
                                            TLRPC.PhotoSize w = bc4.w(k47Var.p0, gm.Y0(false), false, null, false);
                                            f2 = ((w == null || (i5 = w.w) <= 0 || (i6 = w.h) <= 0) ? 1.0f : Math.min(1.0f, (i6 * 0.98280096f) / i5)) * f3;
                                        }
                                        fArr[length] = f2;
                                    } else {
                                        i3 = i16;
                                        i4 = i9;
                                        f47Var2 = currentMessagesGroup;
                                    }
                                    int size4 = arrayList3.size();
                                    int i18 = 0;
                                    while (i18 < size4) {
                                        Object obj4 = arrayList3.get(i18);
                                        i18++;
                                        int i19 = ((c47) obj4).d + length;
                                        float[] fArr2 = m02Var.i;
                                        int i20 = size4;
                                        if (i19 >= fArr2.length) {
                                            m02Var.i = Arrays.copyOf(fArr2, i19 + 1);
                                        }
                                        size4 = i20;
                                    }
                                    int size5 = arrayList3.size();
                                    int i21 = 0;
                                    while (i21 < size5) {
                                        Object obj5 = arrayList3.get(i21);
                                        i21++;
                                        c47 c47Var = (c47) obj5;
                                        int i22 = c47Var.c;
                                        ArrayList arrayList4 = arrayList3;
                                        while (true) {
                                            if (i22 <= c47Var.d) {
                                                float[] fArr3 = m02Var.i;
                                                int i23 = length + i22;
                                                float f5 = fArr3[i23];
                                                int i24 = size5;
                                                float f6 = c47Var.f;
                                                float f7 = c47Var.s;
                                                if (f7 <= f) {
                                                    f7 = 1.0f;
                                                }
                                                fArr3[i23] = Math.max(f5, (f7 * f6) / ((r2 - c47Var.c) + 1));
                                                i22++;
                                                size5 = i24;
                                            }
                                        }
                                        arrayList3 = arrayList4;
                                    }
                                    size3 = i17;
                                    i15 = i3;
                                    i9 = i4;
                                    currentMessagesGroup = f47Var2;
                                }
                            }
                        } else {
                            i = childCount;
                        }
                        i2 = i9;
                        f47 f47Var5 = currentMessagesGroup;
                        if (f47Var5 == null) {
                            int e13 = messageObject.e1();
                            Iterator it = hashMap.keySet().iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    f47Var = null;
                                    break;
                                }
                                f47 f47Var6 = (f47) it.next();
                                ArrayList arrayList5 = f47Var6.d;
                                int size6 = arrayList5.size();
                                int i25 = 0;
                                while (i25 < size6) {
                                    Object obj6 = arrayList5.get(i25);
                                    i25++;
                                    if (((k47) obj6).e1() == e13) {
                                        f47Var = f47Var6;
                                        break;
                                    }
                                }
                            }
                        } else {
                            f47Var = f47Var5;
                        }
                        Integer num = f47Var != null ? (Integer) hashMap.get(f47Var) : null;
                        if (num != null && (currentPosition != null || f47Var.e.isEmpty())) {
                            ImageReceiver photoImage = rc2Var.getPhotoImage();
                            boolean z = !f47Var.i && !messageObject.U2() && !messageObject.I3() && photoImage.O0 > f && photoImage.M0 >= f && photoImage.x() <= ((float) view.getHeight());
                            float f8 = rectF.top;
                            if (z) {
                                f8 += photoImage.M0;
                            }
                            m02Var.b.union(rectF.left, f8, rectF.right, z ? photoImage.O0 + f8 : rectF.bottom);
                            m02Var.g = Math.min(m02Var.g, num.intValue() + (currentPosition != null ? currentPosition.c : (byte) 0));
                            m02Var.h = Math.max(m02Var.h, num.intValue() + (currentPosition != null ? currentPosition.d : (byte) 0));
                        }
                        i9 = i2 + 1;
                        childCount = i;
                        i8 = 0;
                    }
                }
            }
            i = childCount;
            i2 = i9;
            i9 = i2 + 1;
            childCount = i;
            i8 = 0;
        }
        ArrayList arrayList6 = new ArrayList();
        int i26 = 0;
        while (i26 < longSparseArray2.size()) {
            m02 m02Var2 = (m02) longSparseArray2.valueAt(i26);
            int i27 = m02Var2.h;
            RectF rectF2 = m02Var2.a;
            if (i27 >= 0) {
                float f9 = rectF2.top;
                float f10 = rectF2.bottom;
                RectF rectF3 = m02Var2.b;
                float f11 = rectF3.top;
                float f12 = rectF3.bottom;
                float[] fArr4 = m02Var2.i;
                int i28 = m02Var2.g;
                longSparseArray = longSparseArray2;
                float f13 = 0.0f;
                float f14 = 0.0f;
                float f15 = 0.0f;
                for (int i29 = 0; i29 < fArr4.length; i29++) {
                    if (i29 < i28) {
                        f14 += fArr4[i29];
                    } else if (i29 > i27) {
                        f15 += fArr4[i29];
                    } else {
                        f13 += fArr4[i29];
                    }
                }
                float f16 = f13 > 0.0f ? (f12 - f11) / f13 : 0.0f;
                float[] fArr5 = {Math.min(f9, f11 - (f14 * f16)), Math.max(f10, (f15 * f16) + f12)};
                rectF2.top = fArr5[0];
                rectF2.bottom = fArr5[1];
            } else {
                longSparseArray = longSparseArray2;
            }
            long j2 = m02Var2.d;
            int i30 = m02Var2.f;
            long j3 = m02Var2.c;
            float f17 = rectF2.top;
            float f18 = rectF2.bottom;
            RectF rectF4 = this.c;
            float f19 = rectF4.top;
            float f20 = rectF4.bottom;
            this.r.getClass();
            float f21 = f20 - f19;
            float max = Math.max(f17, f19);
            float min = Math.min(f18, f20);
            if (f21 > 0.0f && max < min) {
                float f22 = f18 - f17;
                if (min - max >= Math.min(f22, f21) / 2.0f) {
                    ka4Var = new ka4(j2, i30, j3, max - f17, min - f17, f22, f21, null);
                    if (ka4Var != null) {
                        if (!this.x) {
                            ka4Var.a = this.w;
                            ka4Var.b = m02Var2.e;
                        }
                        arrayList6.add(ka4Var);
                    }
                    i26++;
                    longSparseArray2 = longSparseArray;
                }
            }
            ka4Var = null;
            if (ka4Var != null) {
            }
            i26++;
            longSparseArray2 = longSparseArray;
        }
        this.G.a.c(arrayList6);
        if (this.a) {
            invalidate();
        }
    }

    public final void f() {
        ha4 ha4Var = this.G;
        if (ha4Var != null) {
            pa4 pa4Var = ha4Var.a;
            pa4Var.getClass();
            long uptimeMillis = SystemClock.uptimeMillis();
            HashMap hashMap = pa4Var.c;
            Iterator it = hashMap.values().iterator();
            while (it.hasNext()) {
                ((oa4) it.next()).a(uptimeMillis);
            }
            pa4Var.f = uptimeMillis;
            if (pa4Var.e) {
                ArrayList arrayList = pa4Var.d;
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    ka4 ka4Var = (ka4) obj;
                    if (hashMap.get(ka4Var.a()) != null && ((oa4) hashMap.get(ka4Var.a())).h) {
                        hashMap.put(ka4Var.a(), new oa4(pa4Var, ka4Var, uptimeMillis));
                    }
                }
            }
        }
        ra4 ra4Var = this.h;
        long uptimeMillis2 = SystemClock.uptimeMillis();
        if (ra4Var.b != null) {
            if (!(ra4Var.d && ra4Var.e) && uptimeMillis2 >= ra4Var.c + 1000) {
                ra4Var.a();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long[] g(k47 k47Var) {
        long j;
        TLRPC.MessageFwdHeader messageFwdHeader = k47Var.k.fwd_from;
        if (messageFwdHeader != null) {
            TLRPC.Peer peer = messageFwdHeader.from_id;
            if (peer instanceof TLRPC.TL_peerChannel) {
                j = peer.channel_id;
                if (k47Var.e1() > 0) {
                    boolean z = this.x;
                    long j2 = this.w;
                    int e1 = k47Var.e1();
                    int i = messageFwdHeader != null ? messageFwdHeader.channel_post : 0;
                    if (z) {
                        return new long[]{j2, e1};
                    }
                    if (j != 0 && i != 0) {
                        return new long[]{-j, i};
                    }
                }
                return null;
            }
        }
        j = 0;
        if (k47Var.e1() > 0) {
        }
        return null;
    }

    public final void h(long j) {
        if (this.I) {
            return;
        }
        this.I = true;
        gm.d3(this.f, j);
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        this.J = viewTreeObserver;
        viewTreeObserver.addOnPreDrawListener(this);
        this.J.addOnGlobalLayoutListener(this);
        this.J.addOnScrollChangedListener(this);
        h(100L);
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        ViewTreeObserver viewTreeObserver = this.J;
        if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
            this.J.removeOnPreDrawListener(this);
            this.J.removeOnGlobalLayoutListener(this);
            this.J.removeOnScrollChangedListener(this);
        }
        this.J = null;
        gm.r(this.f);
        this.I = false;
        ha4 ha4Var = this.G;
        if (ha4Var != null) {
            ha4Var.a.b(false);
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (!this.a) {
            return;
        }
        canvas.drawRect(this.c, cmb.Hm);
        int i = 0;
        while (true) {
            LongSparseArray longSparseArray = this.e;
            if (i >= longSparseArray.size()) {
                return;
            }
            canvas.drawRect(((m02) longSparseArray.valueAt(i)).a, cmb.Im);
            i++;
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        this.H = true;
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        RectF rectF = this.b;
        this.c.set(rectF.left, rectF.top, getMeasuredWidth() - rectF.right, getMeasuredHeight() - rectF.bottom);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        if (!this.H) {
            return true;
        }
        e();
        this.H = false;
        if (this.e.size() <= 0) {
            return true;
        }
        h(100L);
        return true;
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        this.H = true;
    }
}
