package ai;

import a8.la;
import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import bi.h4;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.fj;
import org.telegram.messenger.gd;
import org.telegram.messenger.j10;
import org.telegram.messenger.jc;
import org.telegram.messenger.ks;
import org.telegram.messenger.lr;
import org.telegram.messenger.mp;
import org.telegram.messenger.v3;
import org.telegram.messenger.xy;
import org.telegram.messenger.zy;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.g8;
import org.telegram.ui.Components.lc;
import org.telegram.ui.Components.lj0;
import org.telegram.ui.Components.ob0;
import org.telegram.ui.Components.oo;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.qj0;
import org.telegram.ui.Components.ti0;
import org.telegram.ui.Components.ui0;
import org.telegram.ui.Components.vi0;
import org.telegram.ui.Components.w7;
import org.telegram.ui.Components.x7;
import org.telegram.ui.Components.z4;
import org.telegram.ui.ContactsActivity;
import org.telegram.ui.Dictation.DictationAsr;
import org.telegram.ui.Dictation.DictationLid;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PrivacyControlActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.bn;
import org.telegram.ui.de0;
import org.telegram.ui.ee0;
import org.telegram.ui.hk0;
import org.telegram.ui.na0;
import org.telegram.ui.pg0;
import org.telegram.ui.sg0;
import org.telegram.ui.ti;
import org.telegram.ui.vg0;
import org.telegram.ui.z90;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class s1 implements c1, h2.o, lr, ob0, jc, z4, qj0, pj0, org.telegram.ui.ActionBar.r1, na0, lj0, h2.j {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ s1(int i7, Object obj, int i10) {
        this.a = i10;
        this.b = i7;
        this.c = obj;
    }

    @Override // org.telegram.ui.Components.z4
    public void O(int i7, int i10, boolean z10) {
        switch (this.a) {
            case 9:
                org.telegram.messenger.g0.h3(new jg.q(i7, this.b, (oo) this.c, 12), 16L);
                break;
            default:
                org.telegram.messenger.g0.h3(new jg.q(i7, this.b, (h4) this.c, 13), 16L);
                break;
        }
    }

    @Override // ai.c1
    public void a(final float[] fArr, final long j3, final int i7) {
        boolean z10;
        android.support.v4.media.session.a0 a0Var;
        switch (this.a) {
            case 0:
                c2 c2Var = (c2) this.c;
                int i10 = this.b;
                if (!c2Var.j && i10 == c2Var.C) {
                    float min = Math.min(0.6f, DictationLid.i(i7));
                    d1 n10 = DictationLid.n(min, fArr);
                    if (n10 == null || ((!n10.c && (!"other".equals(n10.a) || n10.b < min)) || !("other".equals(n10.a) || DictationAsr.R(n10.a, c2Var.y, false) == null))) {
                        z10 = false;
                    } else {
                        Log.d("Dictation", "tinyasr stop: tinylid " + i7 + " ms speech in " + j3 + " ms: " + n10 + " → Google?");
                        c2Var.L = true;
                        if (c2Var.h(n10.a)) {
                            c2Var.f.postDelayed(new o1(c2Var, 5), (c2Var.u != null ? r1.c() / 32 : 0L) + 10000);
                            break;
                        } else {
                            z10 = false;
                            c2Var.L = false;
                        }
                    }
                    if (n10 != null && n10.c) {
                        a0Var = DictationAsr.R(n10.a, c2Var.y, z10);
                        if (a0Var != null) {
                            DictationLid.l(n10.a);
                            c2Var.r(n10.a);
                        }
                    } else if (n10 != null) {
                        a0Var = DictationAsr.Q(DictationLid.d, fArr, c2Var.y, false);
                        if (a0Var != null) {
                            c2Var.r(a0Var.i());
                        }
                    } else {
                        a0Var = null;
                    }
                    StringBuilder sb2 = new StringBuilder("tinyasr stop: tinylid ");
                    sb2.append(i7);
                    sb2.append(" ms speech in ");
                    sb2.append(j3);
                    sb2.append(" ms: ");
                    sb2.append(n10);
                    sb2.append(" → ");
                    sb2.append(a0Var != null ? a0Var : "-");
                    Log.d("Dictation", sb2.toString());
                    if (a0Var != null) {
                        t tVar = (t) a0Var.b;
                        android.support.v4.media.session.a0 a0Var2 = c2Var.y;
                        if (tVar != ((t) a0Var2.b) || !((String) a0Var.c).equals((String) a0Var2.c)) {
                            c2Var.o(a0Var);
                            break;
                        }
                    }
                    c2Var.g();
                    break;
                }
                break;
            case 1:
                x1 x1Var = (x1) this.c;
                int i11 = this.b;
                c2 c2Var2 = x1Var.b;
                c2Var2.W = false;
                int i12 = c2Var2.Y;
                if (i11 == i12) {
                    c2Var2.b0 = i7;
                }
                if (fArr != null) {
                    int i13 = c2Var2.k;
                    if (!c2Var2.j && !c2Var2.i && i11 == i12 && c2Var2.t != i13) {
                        String[] strArr = DictationLid.d;
                        int i14 = 0;
                        for (int i15 = 1; i15 < fArr.length; i15++) {
                            if (fArr[i15] > fArr[i14]) {
                                i14 = i15;
                            }
                        }
                        StringBuilder sb3 = new StringBuilder();
                        ArrayList arrayList = c2Var2.q;
                        int size = arrayList.size();
                        float f10 = 0.0f;
                        int i16 = i14;
                        int i17 = 0;
                        float f11 = 0.0f;
                        float f12 = 0.0f;
                        String str = null;
                        while (i17 < size) {
                            Object obj = arrayList.get(i17);
                            int i18 = i17 + 1;
                            int i19 = size;
                            String str2 = (String) obj;
                            ArrayList arrayList2 = arrayList;
                            float f13 = 0.0f;
                            for (int i20 = 0; i20 < strArr.length; i20++) {
                                if (u0.d(strArr[i20], str2)) {
                                    f13 += fArr[i20];
                                }
                            }
                            f11 += f13;
                            if (f13 > f12) {
                                str = str2;
                                f12 = f13;
                            }
                            sb3.append(' ');
                            sb3.append(str2);
                            sb3.append('=');
                            sb3.append(String.format(Locale.US, "%.2f", Float.valueOf(f13)));
                            i17 = i18;
                            size = i19;
                            str = str;
                            arrayList = arrayList2;
                        }
                        float f14 = f11 > 0.0f ? f12 / f11 : 0.0f;
                        StringBuilder n11 = i5.c.n("session ", i13, " tinylid ", i7, " ms speech in ");
                        n11.append(j3);
                        n11.append(" ms: top ");
                        n11.append(strArr[i16]);
                        Locale locale = Locale.US;
                        n11.append(String.format(locale, " %.2f", Float.valueOf(fArr[i16])));
                        n11.append(" |");
                        n11.append((Object) sb3);
                        n11.append(" → ");
                        n11.append(str);
                        n11.append(String.format(locale, " %.2f", Float.valueOf(f14)));
                        n11.append(" current=");
                        p5.c.t(n11, c2Var2.r, "Dictation");
                        if (str != null && !"nospeech".equals(strArr[i16]) && !"other".equals(strArr[i16]) && f11 >= 0.3f) {
                            for (int i21 = 0; i21 < strArr.length; i21++) {
                                if (u0.d(strArr[i21], str)) {
                                    f10 += fArr[i21];
                                }
                            }
                            boolean z11 = !u0.d(str, c2Var2.r) && f14 >= 0.8f && f10 >= 0.6f;
                            int i22 = (z11 && u0.d(str, c2Var2.d0)) ? c2Var2.a0 + 1 : z11 ? 1 : 0;
                            c2Var2.a0 = i22;
                            c2Var2.d0 = z11 ? str : null;
                            if (i22 >= 2) {
                                int i23 = c2Var2.b0;
                                if (i23 < 5000) {
                                    c2Var2.s++;
                                    if (c2Var2.J != null) {
                                        Log.d("Dictation", "live transcript: no switch to " + str + " (tinylid)");
                                        break;
                                    } else {
                                        c2Var2.v(str, "tinylid");
                                        c2Var2.r(str);
                                        int i24 = c2Var2.w;
                                        c2Var2.x = i24;
                                        c2Var2.X = i24;
                                        c2Var2.Y++;
                                        c2Var2.b0 = 0;
                                        c2Var2.c0 = false;
                                        c2Var2.a0 = 0;
                                        c2Var2.d0 = null;
                                        c2Var2.t = i13;
                                        i2 i2Var = c2Var2.g;
                                        if (i2Var.h(i13)) {
                                            StringBuilder m10 = i5.c.m(i13, "session ", " discarded: ");
                                            m10.append(i2.c(i2.i(i2Var.b, i2Var.c)));
                                            i2Var.j(m10.toString());
                                            i2Var.b = "";
                                            i2Var.c = "";
                                            i2Var.d = false;
                                            i2Var.f = false;
                                        }
                                        c2Var2.d();
                                        c2Var2.f.post(new m1(c2Var2, i13, 1));
                                        break;
                                    }
                                } else if (!c2Var2.c0) {
                                    c2Var2.c0 = true;
                                    p5.c.t(i5.c.m(i23, "language locked: ", " ms of speech in "), c2Var2.r, "Dictation");
                                    break;
                                }
                            }
                        }
                    }
                }
                break;
            default:
                final o2 o2Var = (o2) this.c;
                final int i25 = this.b;
                o2Var.t.b.add(new Runnable() { // from class: ai.m2
                    @Override // java.lang.Runnable
                    public final void run() {
                        android.support.v4.media.session.a0 R;
                        String nativeSessionPush;
                        o2 o2Var2 = o2.this;
                        int i26 = i25;
                        float[] fArr2 = fArr;
                        int i27 = i7;
                        long j10 = j3;
                        ByteArrayOutputStream byteArrayOutputStream = o2Var2.m;
                        o2Var2.q = false;
                        if (i26 != o2Var2.n || o2Var2.d == null || fArr2 == null) {
                            return;
                        }
                        int i28 = 0;
                        while (true) {
                            int[] iArr = DictationLid.j;
                            if (i28 >= iArr.length) {
                                i28 = -1;
                                break;
                            } else if (iArr[i28] > i27) {
                                break;
                            } else {
                                i28++;
                            }
                        }
                        o2Var2.o = i28;
                        if (i28 < 0) {
                            o2Var2.l.reset();
                            byteArrayOutputStream.reset();
                        }
                        d1 n12 = DictationLid.n(DictationLid.i(i27), fArr2);
                        android.support.v4.media.session.a0 a0Var3 = (android.support.v4.media.session.a0) o2Var2.d.d;
                        StringBuilder sb4 = new StringBuilder("live captions ");
                        int i29 = o2Var2.a;
                        i5.c.z(sb4, i29, ": tinylid ", i27, " ms speech in ");
                        sb4.append(j10);
                        sb4.append(" ms: ");
                        sb4.append(n12);
                        sb4.append(" (");
                        sb4.append(a0Var3);
                        sb4.append(")");
                        Log.d("Dictation", sb4.toString());
                        if (n12 != null) {
                            String str3 = n12.a;
                            if (n12.c && (R = DictationAsr.R(str3, a0Var3, false)) != null) {
                                t tVar2 = (t) R.b;
                                if (tVar2 == ((t) a0Var3.b) && ((String) R.c).equals((String) a0Var3.c)) {
                                    o2Var2.r = true;
                                    o2Var2.k = str3;
                                    return;
                                }
                                if (!o2Var2.r || n12.b >= 0.8f) {
                                    if (tVar2 == null || tVar2.d == 0) {
                                        org.telegram.messenger.g0.g3(new a3.f(R, 8));
                                        return;
                                    }
                                    x c10 = x.c(R, o2Var2);
                                    if (c10 == null) {
                                        return;
                                    }
                                    o2Var2.r = true;
                                    o2Var2.k = str3;
                                    StringBuilder m11 = i5.c.m(i29, "live captions ", ": replaying ");
                                    m11.append(byteArrayOutputStream.size() / 32);
                                    m11.append(" ms in ");
                                    m11.append(R);
                                    Log.d("Dictation", m11.toString());
                                    x xVar = o2Var2.d;
                                    long j11 = xVar.c;
                                    if (j11 != 0) {
                                        DictationAsr.nativeSessionFree(j11);
                                        xVar.c = 0L;
                                        DictationAsr.M((t) xVar.e);
                                    }
                                    o2Var2.d = c10;
                                    boolean z12 = false;
                                    o2Var2.h = 0;
                                    o2Var2.g = 0;
                                    int i30 = o2Var2.s;
                                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                                    x xVar2 = o2Var2.d;
                                    int length = byteArray.length;
                                    long j12 = xVar2.c;
                                    if (j12 != 0) {
                                        nativeSessionPush = DictationAsr.nativeSessionPush(j12, byteArray, 0, length);
                                        xVar2.b(nativeSessionPush);
                                    }
                                    if (o2Var2.s != i30 || o2Var2.j.isEmpty()) {
                                        return;
                                    }
                                    o2Var2.j = "";
                                    org.telegram.messenger.g0.g3(new l2(o2Var2, o2Var2.f, "", z12, 0));
                                }
                            }
                        }
                    }
                });
                break;
        }
    }

    @Override // h2.j
    public void accept(Object obj) {
        p4.o oVar;
        p4.o oVar2;
        p4.v vVar = (p4.v) this.c;
        int i7 = this.b;
        try {
            try {
                oVar2 = (p4.o) ((m9.y) obj).get();
                la.k(oVar2, "LibraryResult must not be null");
            } catch (InterruptedException e10) {
                e = e10;
                h2.a.m("MediaSessionStub", "Library operation failed", e);
                String str = p4.o.d;
                p4.m1 m1Var = new p4.m1("no error message provided", -1, Bundle.EMPTY);
                oVar = new p4.o(m1Var.a, SystemClock.elapsedRealtime(), m1Var);
                oVar2 = oVar;
                p4.u uVar = vVar.d;
                uVar.getClass();
                uVar.i(i7, oVar2);
            } catch (CancellationException e11) {
                h2.a.m("MediaSessionStub", "Library operation cancelled", e11);
                String str2 = p4.o.d;
                p4.m1 m1Var2 = new p4.m1("no error message provided", 1, Bundle.EMPTY);
                oVar = new p4.o(m1Var2.a, SystemClock.elapsedRealtime(), m1Var2);
                oVar2 = oVar;
                p4.u uVar2 = vVar.d;
                uVar2.getClass();
                uVar2.i(i7, oVar2);
            } catch (ExecutionException e12) {
                e = e12;
                h2.a.m("MediaSessionStub", "Library operation failed", e);
                String str3 = p4.o.d;
                p4.m1 m1Var3 = new p4.m1("no error message provided", -1, Bundle.EMPTY);
                oVar = new p4.o(m1Var3.a, SystemClock.elapsedRealtime(), m1Var3);
                oVar2 = oVar;
                p4.u uVar22 = vVar.d;
                uVar22.getClass();
                uVar22.i(i7, oVar2);
            }
            p4.u uVar222 = vVar.d;
            uVar222.getClass();
            uVar222.i(i7, oVar2);
        } catch (RemoteException e13) {
            h2.a.m("MediaSessionStub", "Failed to send result to browser " + vVar, e13);
        }
    }

    @Override // org.telegram.ui.na0
    public void b(TLRPC.MessageMedia messageMedia, int i7, boolean z10, int i10, long j3) {
        HashMap hashMap = (HashMap) this.c;
        String str = LaunchActivity.C1;
        Iterator it = hashMap.entrySet().iterator();
        while (it.hasNext()) {
            fj fjVar = (fj) ((Map.Entry) it.next()).getValue();
            TLRPC.MessageMedia messageMedia2 = messageMedia;
            zy.C(this.b).r0(xy.d(messageMedia2, fj.B0(fjVar.k), fjVar, null, null, null, true, 0));
            messageMedia = messageMedia2;
        }
    }

    @Override // org.telegram.ui.Components.pj0
    public /* synthetic */ boolean b1(View view) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Components.qj0
    public boolean c(int i7, View view) {
        vi0 vi0Var = (vi0) this.c;
        if (this.b == 5) {
            vi0Var.getClass();
            return false;
        }
        ui0 ui0Var = vi0Var.h0;
        if (ui0Var == null || !(view instanceof ti0)) {
            return false;
        }
        ui0Var.g(vi0Var, ((ti0) view).e, true, false);
        return true;
    }

    @Override // org.telegram.messenger.lr
    public void d(boolean z10) {
        bn bnVar = ((ti) this.c).b;
        int i7 = this.b;
        if (i7 == 15 && v3.T(bnVar.e)) {
            TLRPC.Chat chat = bnVar.e;
            if (!chat.megagroup || v3.t0(chat)) {
                bnVar.getMessagesController().X(2, bnVar.l6, z10);
                return;
            }
        }
        if (i7 == 15) {
            bnVar.Ta(bnVar.s4, z10);
            return;
        }
        ks notificationCenter = bnVar.getNotificationCenter();
        int i10 = ks.t;
        notificationCenter.n(bnVar, i10);
        bnVar.getNotificationCenter().k(i10, new Object[0]);
        bnVar.finishFragment();
        bnVar.getNotificationCenter().k(ks.K2, Long.valueOf(bnVar.l6), bnVar.f, bnVar.e, Boolean.valueOf(z10));
    }

    @Override // org.telegram.ui.Components.pj0
    public void f(float f10, float f11, int i7, View view) {
        int i10 = this.a;
        int i11 = this.b;
        Object obj = this.c;
        switch (i10) {
            case 12:
                ContactsActivity.c0((ContactsActivity) obj, i11, view, i7);
                break;
            default:
                vg0 vg0Var = (vg0) obj;
                sg0 sg0Var = vg0Var.U1;
                HashSet hashSet = vg0Var.Z1;
                if (view instanceof ah.r) {
                    TLRPC.User user = ((ah.r) view).getUser();
                    long j3 = user.id;
                    if (hashSet.contains(Long.valueOf(j3))) {
                        hashSet.remove(Long.valueOf(j3));
                    } else {
                        hashSet.add(Long.valueOf(j3));
                        vg0Var.e2.put(Long.valueOf(j3), user);
                    }
                    if (hashSet.size() != i11 + 1) {
                        sg0Var.b(true, hashSet, new pg0(vg0Var, 2), null);
                        vg0Var.h1(true, false);
                        if (!TextUtils.isEmpty(vg0Var.f2)) {
                            vg0Var.f2 = null;
                            sg0Var.setText("");
                            org.telegram.messenger.g0.r(vg0Var.p2);
                            vg0Var.g1(true, true);
                            break;
                        }
                    } else {
                        hashSet.remove(Long.valueOf(j3));
                        String G = gd.G(vg0Var.l2, "BotMultiContactsSelectorLimit", new Object[0]);
                        org.telegram.ui.ActionBar.n2 n2Var = vg0Var.c;
                        new lc(n2Var, vg0Var.J0).Q(R.raw.chats_infotip, 36, G).k(true);
                        try {
                            n2Var.performHapticFeedback(3, 2);
                            break;
                        } catch (Exception unused) {
                            return;
                        }
                    }
                }
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.r1
    public void h(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        int i10 = this.a;
        int i11 = this.b;
        Object obj = this.c;
        switch (i10) {
            case 13:
                ArrayList arrayList = ((LaunchActivity) obj).e0;
                if (!arrayList.isEmpty()) {
                    mp.u1(i11).F3("spambot", (org.telegram.ui.ActionBar.h2) i5.c.h(1, arrayList), 1, null);
                    break;
                }
                break;
            case 14:
            case 15:
            case 17:
            default:
                ProfileActivity profileActivity = (ProfileActivity) obj;
                RectF rectF = ProfileActivity.Z6;
                TLRPC.UserFull d2 = profileActivity.getMessagesController().d2(profileActivity.e1);
                if (d2 != null) {
                    d2.flags2 &= -4194305;
                    d2.note = null;
                    profileActivity.getMessagesStorage().j2(d2, true);
                }
                TLRPC.TL_updateContactNote tL_updateContactNote = new TLRPC.TL_updateContactNote();
                tL_updateContactNote.id = profileActivity.getMessagesController().q1(profileActivity.e1);
                tL_updateContactNote.note = new TLRPC.TL_textWithEntities();
                profileActivity.getConnectionsManager().sendRequest(tL_updateContactNote, null);
                profileActivity.N5();
                profileActivity.d.s(i11);
                break;
            case 16:
                ee0 ee0Var = ((de0) obj).h0;
                if (j10.t0 != i11) {
                    ((LaunchActivity) ee0Var.getParentActivity()).O0(i11);
                }
                ee0Var.finishFragment();
                break;
            case 18:
                hk0 hk0Var = ((org.telegram.ui.qj0) obj).a;
                hk0Var.D1(hk0Var.Z[i11]);
                break;
            case 19:
                PrivacyControlActivity privacyControlActivity = (PrivacyControlActivity) obj;
                privacyControlActivity.getClass();
                privacyControlActivity.presentFragment(new PrivacyControlActivity(i11, false), true);
                break;
        }
    }

    @Override // org.telegram.ui.Components.ob0
    public String i(int i7) {
        Calendar calendar = (Calendar) this.c;
        int i10 = this.b;
        calendar.clear();
        calendar.set(1, i10);
        calendar.set(2, 0);
        calendar.add(2, i7 - 120);
        if (calendar.get(1) != i10) {
            return gd.E0().v0().format(calendar.getTimeInMillis());
        }
        gd E0 = gd.E0();
        if (E0.r == null) {
            synchronized (E0) {
                try {
                    if (E0.r == null) {
                        Locale locale = E0.y;
                        if (locale == null) {
                            locale = Locale.getDefault();
                        }
                        E0.r = gd.k(locale, E0.O0(2131742508, "formatterMonthOnly", null), "MMMM");
                    }
                } finally {
                }
            }
        }
        return E0.r.format(calendar.getTimeInMillis());
    }

    @Override // h2.o
    public void invoke(Object obj) {
        switch (this.a) {
            case 3:
                ((e2.a1) obj).L(((l2.g1) this.c).a, this.b);
                break;
            case 4:
                e2.a1 a1Var = (e2.a1) obj;
                a1Var.v(this.b, (e2.l0) this.c);
                break;
            default:
                m2.a aVar = (m2.a) this.c;
                m2.b bVar = (m2.b) obj;
                bVar.getClass();
                bVar.C(aVar, this.b);
                break;
        }
    }

    @Override // org.telegram.messenger.jc
    public void m0(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        w7 w7Var = (w7) this.c;
        if (this.b == w7Var.b) {
            g8 g8Var = w7Var.e;
            Bitmap n10 = imageReceiver.n();
            int L = ((n10 == null || !imageReceiver.J()) && !imageReceiver.I()) ? 0 : org.telegram.messenger.g0.L(64.0f);
            x7 x7Var = g8Var.D1;
            ValueAnimator valueAnimator = g8Var.N2;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                g8Var.N2 = null;
            }
            if (x7Var.getCustomPaddingRight() != L) {
                ValueAnimator ofInt = ValueAnimator.ofInt(x7Var.getCustomPaddingRight(), L);
                g8Var.N2 = ofInt;
                if (L == 0) {
                    ofInt.setStartDelay(200L);
                    g8Var.N2.setDuration(100L);
                } else {
                    ofInt.setDuration(200L);
                }
                g8Var.N2.setInterpolator(new DecelerateInterpolator());
                g8Var.N2.addUpdateListener(new org.telegram.ui.Components.w(g8Var, 3));
                g8Var.N2.start();
            }
            if (g8Var.c2.getTag() != null) {
                g8Var.d2.setImageBitmap(n10);
            }
        }
    }

    @Override // org.telegram.ui.Components.lj0
    public int run() {
        v4.c0 c0Var = ((z90) this.c).c;
        int L = org.telegram.messenger.g0.L(60.0f);
        int i7 = this.b;
        c0Var.h1(i7, L);
        return i7;
    }

    @Override // org.telegram.ui.Components.pj0
    public /* synthetic */ void s0(View view, float f10, float f11) {
        int i7 = this.a;
    }

    public /* synthetic */ s1(Object obj, int i7, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = i7;
    }

    public /* synthetic */ s1(m2.a aVar, int i7, e2.b1 b1Var, e2.b1 b1Var2) {
        this.a = 5;
        this.c = aVar;
        this.b = i7;
    }

    public /* synthetic */ s1(ti tiVar, int i7, boolean z10) {
        this.a = 6;
        this.c = tiVar;
        this.b = i7;
    }

    @Override // org.telegram.messenger.jc
    public /* synthetic */ void V(ImageReceiver imageReceiver) {
    }

    @Override // org.telegram.messenger.jc
    public /* synthetic */ void G0(int i7, Drawable drawable) {
    }

    private final /* synthetic */ void e(View view, float f10, float f11) {
    }

    private final /* synthetic */ void g(View view, float f10, float f11) {
    }
}
