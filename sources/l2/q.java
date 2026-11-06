package l2;

import a8.ia;
import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
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
import org.telegram.messenger.ez;
import org.telegram.messenger.gz;
import org.telegram.messenger.hd;
import org.telegram.messenger.ij;
import org.telegram.messenger.lc;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.messenger.qr;
import org.telegram.messenger.qs;
import org.telegram.messenger.t3;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.f2;
import org.telegram.ui.ActionBar.l2;
import org.telegram.ui.Components.b8;
import org.telegram.ui.Components.cj0;
import org.telegram.ui.Components.db0;
import org.telegram.ui.Components.dj0;
import org.telegram.ui.Components.e6;
import org.telegram.ui.Components.ej0;
import org.telegram.ui.Components.gi0;
import org.telegram.ui.Components.hc;
import org.telegram.ui.Components.hi0;
import org.telegram.ui.Components.ii0;
import org.telegram.ui.Components.qn;
import org.telegram.ui.Components.s7;
import org.telegram.ui.Components.t4;
import org.telegram.ui.Components.t7;
import org.telegram.ui.Components.xn;
import org.telegram.ui.Components.xq;
import org.telegram.ui.Components.yi0;
import org.telegram.ui.ContactsActivity;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PrivacyControlActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.an;
import org.telegram.ui.be0;
import org.telegram.ui.bk0;
import org.telegram.ui.ce0;
import org.telegram.ui.kg0;
import org.telegram.ui.kj0;
import org.telegram.ui.ma0;
import org.telegram.ui.ng0;
import org.telegram.ui.qg0;
import org.telegram.ui.si;
import org.telegram.ui.w90;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public final /* synthetic */ class q implements h2.o, qr, db0, lc, t4, dj0, cj0, org.telegram.ui.ActionBar.r1, ma0, yi0, h2.j, ej0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ q(int i7, Object obj, int i10) {
        this.a = i10;
        this.b = i7;
        this.c = obj;
    }

    @Override // org.telegram.ui.Components.t4
    public void L(int i7, int i10, boolean z9) {
        switch (this.a) {
            case 6:
                org.telegram.messenger.g0.i3(new jg.r(i7, this.b, (xn) this.c, 11), 16L);
                break;
            default:
                org.telegram.messenger.g0.i3(new jg.r(i7, this.b, (qn) this.c, 12), 16L);
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
                ia.k(oVar2, "LibraryResult must not be null");
            } catch (InterruptedException e10) {
                e = e10;
                h2.a.m("MediaSessionStub", "Library operation failed", e);
                String str = p4.o.d;
                p4.k1 k1Var = new p4.k1("no error message provided", -1, Bundle.EMPTY);
                oVar = new p4.o(k1Var.a, SystemClock.elapsedRealtime(), k1Var);
                oVar2 = oVar;
                p4.u uVar = vVar.d;
                uVar.getClass();
                uVar.i(i7, oVar2);
            } catch (CancellationException e11) {
                h2.a.m("MediaSessionStub", "Library operation cancelled", e11);
                String str2 = p4.o.d;
                p4.k1 k1Var2 = new p4.k1("no error message provided", 1, Bundle.EMPTY);
                oVar = new p4.o(k1Var2.a, SystemClock.elapsedRealtime(), k1Var2);
                oVar2 = oVar;
                p4.u uVar2 = vVar.d;
                uVar2.getClass();
                uVar2.i(i7, oVar2);
            } catch (ExecutionException e12) {
                e = e12;
                h2.a.m("MediaSessionStub", "Library operation failed", e);
                String str3 = p4.o.d;
                p4.k1 k1Var3 = new p4.k1("no error message provided", -1, Bundle.EMPTY);
                oVar = new p4.o(k1Var3.a, SystemClock.elapsedRealtime(), k1Var3);
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

    @Override // org.telegram.ui.Components.dj0
    public boolean c(int i7, View view) {
        ii0 ii0Var = (ii0) this.c;
        if (this.b == 5) {
            ii0Var.getClass();
            return false;
        }
        hi0 hi0Var = ii0Var.g0;
        if (hi0Var == null || !(view instanceof gi0)) {
            return false;
        }
        hi0Var.i(ii0Var, ((gi0) view).e, true, false);
        return true;
    }

    @Override // org.telegram.ui.ma0
    public void d(TLRPC.MessageMedia messageMedia, int i7, boolean z9, int i10, long j3) {
        HashMap hashMap = (HashMap) this.c;
        String str = LaunchActivity.B1;
        Iterator it = hashMap.entrySet().iterator();
        while (it.hasNext()) {
            ij ijVar = (ij) ((Map.Entry) it.next()).getValue();
            TLRPC.MessageMedia messageMedia2 = messageMedia;
            gz.C(this.b).r0(ez.d(messageMedia2, ij.B0(ijVar.k), ijVar, null, null, null, true, 0));
            messageMedia = messageMedia2;
        }
    }

    @Override // org.telegram.ui.Components.cj0
    public void f(float f10, float f11, int i7, View view) {
        int i10 = this.a;
        int i11 = this.b;
        Object obj = this.c;
        switch (i10) {
            case 9:
                ContactsActivity.c0((ContactsActivity) obj, i11, view, i7);
                break;
            default:
                qg0 qg0Var = (qg0) obj;
                ng0 ng0Var = qg0Var.Q1;
                HashSet hashSet = qg0Var.V1;
                if (view instanceof ah.r) {
                    TLRPC.User user = ((ah.r) view).getUser();
                    long j3 = user.id;
                    if (hashSet.contains(Long.valueOf(j3))) {
                        hashSet.remove(Long.valueOf(j3));
                    } else {
                        hashSet.add(Long.valueOf(j3));
                        qg0Var.a2.put(Long.valueOf(j3), user);
                    }
                    if (hashSet.size() != i11 + 1) {
                        ng0Var.b(true, hashSet, new kg0(qg0Var, 2), null);
                        qg0Var.g1(true, false);
                        if (!TextUtils.isEmpty(qg0Var.b2)) {
                            qg0Var.b2 = null;
                            ng0Var.setText("");
                            org.telegram.messenger.g0.r(qg0Var.l2);
                            qg0Var.f1(true, true);
                            break;
                        }
                    } else {
                        hashSet.remove(Long.valueOf(j3));
                        String G = hd.G(qg0Var.h2, "BotMultiContactsSelectorLimit", new Object[0]);
                        l2 l2Var = qg0Var.c;
                        new hc(l2Var, qg0Var.I0).Q(R.raw.chats_infotip, 36, G).k(true);
                        try {
                            l2Var.performHapticFeedback(3, 2);
                            break;
                        } catch (Exception unused) {
                            return;
                        }
                    }
                }
                break;
        }
    }

    @Override // org.telegram.messenger.lc
    public void f0(ImageReceiver imageReceiver, boolean z9, boolean z10, boolean z11) {
        s7 s7Var = (s7) this.c;
        if (this.b == s7Var.b) {
            b8 b8Var = s7Var.e;
            Bitmap n10 = imageReceiver.n();
            int L = ((n10 == null || !imageReceiver.J()) && !imageReceiver.I()) ? 0 : org.telegram.messenger.g0.L(64.0f);
            t7 t7Var = b8Var.z1;
            ValueAnimator valueAnimator = b8Var.J2;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                b8Var.J2 = null;
            }
            if (t7Var.getCustomPaddingRight() != L) {
                ValueAnimator ofInt = ValueAnimator.ofInt(t7Var.getCustomPaddingRight(), L);
                b8Var.J2 = ofInt;
                if (L == 0) {
                    ofInt.setStartDelay(200L);
                    b8Var.J2.setDuration(100L);
                } else {
                    ofInt.setDuration(200L);
                }
                b8Var.J2.setInterpolator(new DecelerateInterpolator());
                b8Var.J2.addUpdateListener(new e6(b8Var, 2));
                b8Var.J2.start();
            }
            if (b8Var.Y1.getTag() != null) {
                b8Var.Z1.setImageBitmap(n10);
            }
        }
    }

    @Override // org.telegram.ui.Components.cj0
    public /* synthetic */ boolean f1(View view) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.r1
    public void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        int i10 = this.a;
        int i11 = this.b;
        Object obj = this.c;
        switch (i10) {
            case 10:
                ArrayList arrayList = ((LaunchActivity) obj).d0;
                if (!arrayList.isEmpty()) {
                    qp.s1(i11).y3("spambot", (f2) jg.g.i(1, arrayList), 1, null);
                    break;
                }
                break;
            case 11:
            case 12:
            case 14:
            default:
                ProfileActivity profileActivity = (ProfileActivity) obj;
                RectF rectF = ProfileActivity.S6;
                TLRPC.UserFull b22 = profileActivity.getMessagesController().b2(profileActivity.d1);
                if (b22 != null) {
                    b22.flags2 &= -4194305;
                    b22.note = null;
                    profileActivity.getMessagesStorage().j2(b22, true);
                }
                TLRPC.TL_updateContactNote tL_updateContactNote = new TLRPC.TL_updateContactNote();
                tL_updateContactNote.id = profileActivity.getMessagesController().o1(profileActivity.d1);
                tL_updateContactNote.note = new TLRPC.TL_textWithEntities();
                profileActivity.getConnectionsManager().sendRequest(tL_updateContactNote, null);
                profileActivity.J5();
                profileActivity.d.s(i11);
                break;
            case 13:
                ce0 ce0Var = ((be0) obj).g0;
                if (p10.s0 != i11) {
                    ((LaunchActivity) ce0Var.getParentActivity()).O0(i11);
                }
                ce0Var.finishFragment();
                break;
            case 15:
                bk0 bk0Var = ((kj0) obj).a;
                bk0Var.D1(bk0Var.Y[i11]);
                break;
            case 16:
                PrivacyControlActivity privacyControlActivity = (PrivacyControlActivity) obj;
                privacyControlActivity.getClass();
                privacyControlActivity.presentFragment(new PrivacyControlActivity(i11, false), true);
                break;
        }
    }

    @Override // org.telegram.ui.Components.db0
    public String h(int i7) {
        Calendar calendar = (Calendar) this.c;
        int i10 = this.b;
        calendar.clear();
        calendar.set(1, i10);
        calendar.set(2, 0);
        calendar.add(2, i7 - 120);
        if (calendar.get(1) != i10) {
            return hd.E0().v0().format(calendar.getTimeInMillis());
        }
        hd E0 = hd.E0();
        if (E0.r == null) {
            synchronized (E0) {
                try {
                    if (E0.r == null) {
                        Locale locale = E0.y;
                        if (locale == null) {
                            locale = Locale.getDefault();
                        }
                        E0.r = hd.k(locale, E0.O0(2131742767, "formatterMonthOnly", null), "MMMM");
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
            case 0:
                ((e2.a1) obj).L(((k1) this.c).a, this.b);
                break;
            case 1:
                e2.a1 a1Var = (e2.a1) obj;
                a1Var.v(this.b, (e2.l0) this.c);
                break;
            default:
                m2.a aVar = (m2.a) this.c;
                m2.b bVar = (m2.b) obj;
                bVar.getClass();
                bVar.A(aVar, this.b);
                break;
        }
    }

    @Override // org.telegram.messenger.qr
    public void k(boolean z9) {
        an anVar = ((si) this.c).b;
        int i7 = this.b;
        if (i7 == 15 && t3.T(anVar.e)) {
            TLRPC.Chat chat = anVar.e;
            if (!chat.megagroup || t3.t0(chat)) {
                anVar.getMessagesController().X(2, anVar.j6, z9);
                return;
            }
        }
        if (i7 == 15) {
            anVar.Qa(anVar.r4, z9);
            return;
        }
        qs notificationCenter = anVar.getNotificationCenter();
        int i10 = qs.t;
        notificationCenter.n(anVar, i10);
        anVar.getNotificationCenter().k(i10, new Object[0]);
        anVar.finishFragment();
        anVar.getNotificationCenter().k(qs.K2, Long.valueOf(anVar.j6), anVar.f, anVar.e, Boolean.valueOf(z9));
    }

    @Override // org.telegram.ui.Components.cj0
    public /* synthetic */ void r0(View view, float f10, float f11) {
        int i7 = this.a;
    }

    @Override // org.telegram.ui.Components.yi0
    public int run() {
        v4.b0 b0Var = ((w90) this.c).c;
        int L = org.telegram.messenger.g0.L(60.0f);
        int i7 = this.b;
        b0Var.h1(i7, L);
        return i7;
    }

    public /* synthetic */ q(Object obj, int i7, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = i7;
    }

    public /* synthetic */ q(m2.a aVar, int i7, e2.b1 b1Var, e2.b1 b1Var2) {
        this.a = 2;
        this.c = aVar;
        this.b = i7;
    }

    public /* synthetic */ q(si siVar, int i7, boolean z9) {
        this.a = 3;
        this.c = siVar;
        this.b = i7;
    }

    @Override // org.telegram.ui.Components.ej0
    public /* synthetic */ void i() {
    }

    @Override // org.telegram.ui.Components.ej0
    public boolean f(float f10, float f11, int i7, View view) {
        wg.f1 f1Var = (wg.f1) this.c;
        ah.a aVar = f1Var.V1;
        HashSet hashSet = f1Var.Z1;
        if (!(view instanceof ah.r)) {
            return false;
        }
        ah.r rVar = (ah.r) view;
        TLRPC.User user = rVar.getUser();
        long j3 = user != null ? user.id : -rVar.getChat().id;
        int i10 = this.b;
        boolean z9 = (i10 == 4 && hashSet.isEmpty()) ? false : true;
        if (hashSet.contains(Long.valueOf(j3))) {
            hashSet.remove(Long.valueOf(j3));
        } else {
            hashSet.add(Long.valueOf(j3));
            f1Var.f2.put(Long.valueOf(j3), user);
        }
        if (hashSet.size() == f1Var.h1() + 1) {
            hashSet.remove(Long.valueOf(j3));
            f1Var.m1();
            return true;
        }
        boolean z10 = (i10 == 4 && hashSet.isEmpty()) ? false : true;
        if (z9 != z10) {
            aVar.setVisibility(0);
            aVar.animate().alpha(z10 ? 1.0f : 0.0f).translationY(z10 ? 0.0f : org.telegram.messenger.g0.L(12.0f)).setInterpolator(xq.h).setDuration(320L).withEndAction(!z10 ? new wg.x0(f1Var, 7) : null).start();
            xg.i iVar = f1Var.h2;
            boolean z11 = !z10;
            if (iVar.D != z11) {
                iVar.D = z11;
                org.telegram.messenger.g0.d0(iVar.f, new xg.g(z11));
            }
        }
        f1Var.e1();
        f1Var.R1.b(true, hashSet, new wg.x0(f1Var, 8), null);
        f1Var.p1(true, true);
        f1Var.f1();
        return true;
    }

    @Override // org.telegram.messenger.lc
    public /* synthetic */ void O(ImageReceiver imageReceiver) {
    }

    @Override // org.telegram.ui.Components.ej0
    public /* synthetic */ void q(float f10) {
    }

    @Override // org.telegram.messenger.lc
    public /* synthetic */ void t0(int i7, Drawable drawable) {
    }

    private final /* synthetic */ void a(View view, float f10, float f11) {
    }

    private final /* synthetic */ void b(View view, float f10, float f11) {
    }
}
