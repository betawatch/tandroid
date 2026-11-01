package i2;

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
import java.util.regex.Pattern;
import mg.f2;
import mg.i2;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.as;
import org.telegram.messenger.at;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.dd;
import org.telegram.messenger.e20;
import org.telegram.messenger.kj;
import org.telegram.messenger.nc;
import org.telegram.messenger.pz;
import org.telegram.messenger.rz;
import org.telegram.messenger.w3;
import org.telegram.messenger.wp;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.k2;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.ActionBar.x1;
import org.telegram.ui.Components.a6;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.fo;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.ik0;
import org.telegram.ui.Components.jk0;
import org.telegram.ui.Components.kk0;
import org.telegram.ui.Components.lj0;
import org.telegram.ui.Components.mj0;
import org.telegram.ui.Components.n7;
import org.telegram.ui.Components.nj0;
import org.telegram.ui.Components.o7;
import org.telegram.ui.Components.q4;
import org.telegram.ui.Components.w7;
import org.telegram.ui.Components.wb0;
import org.telegram.ui.Components.yn;
import org.telegram.ui.ContactsActivity;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PrivacyControlActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.ab0;
import org.telegram.ui.ff0;
import org.telegram.ui.gf0;
import org.telegram.ui.jl0;
import org.telegram.ui.l10;
import org.telegram.ui.nj;
import org.telegram.ui.rh0;
import org.telegram.ui.rk0;
import org.telegram.ui.sb0;
import org.telegram.ui.uh0;
import org.telegram.ui.un;
import v7.t6;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final /* synthetic */ class q implements e2.o, e2.j, kk0, as, wb0, nc, q4, jk0, ik0, org.telegram.ui.ActionBar.u1, sb0, ek0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ q(int i10, Object obj, int i11) {
        this.a = i11;
        this.b = i10;
        this.c = obj;
    }

    @Override // org.telegram.ui.Components.q4
    public void K(int i10, int i11, boolean z10) {
        switch (this.a) {
            case 8:
                org.telegram.messenger.i0.h3(new u(i10, this.b, (fo) this.c, 10), 16L);
                break;
            default:
                org.telegram.messenger.i0.h3(new u(i10, this.b, (yn) this.c, 11), 16L);
                break;
        }
    }

    @Override // e2.j
    public void accept(Object obj) {
        m4.p pVar;
        m4.p pVar2;
        m4.w wVar = (m4.w) this.c;
        int i10 = this.b;
        try {
            try {
                pVar2 = (m4.p) ((j9.y) obj).get();
                t6.l(pVar2, "LibraryResult must not be null");
            } catch (InterruptedException e) {
                e = e;
                e2.a.m("MediaSessionStub", "Library operation failed", e);
                String str = m4.p.d;
                m4.r1 r1Var = new m4.r1("no error message provided", -1, Bundle.EMPTY);
                pVar = new m4.p(r1Var.a, SystemClock.elapsedRealtime(), r1Var);
                pVar2 = pVar;
                m4.v vVar = wVar.d;
                vVar.getClass();
                vVar.a(i10, pVar2);
            } catch (CancellationException e7) {
                e2.a.m("MediaSessionStub", "Library operation cancelled", e7);
                String str2 = m4.p.d;
                m4.r1 r1Var2 = new m4.r1("no error message provided", 1, Bundle.EMPTY);
                pVar = new m4.p(r1Var2.a, SystemClock.elapsedRealtime(), r1Var2);
                pVar2 = pVar;
                m4.v vVar2 = wVar.d;
                vVar2.getClass();
                vVar2.a(i10, pVar2);
            } catch (ExecutionException e10) {
                e = e10;
                e2.a.m("MediaSessionStub", "Library operation failed", e);
                String str3 = m4.p.d;
                m4.r1 r1Var3 = new m4.r1("no error message provided", -1, Bundle.EMPTY);
                pVar = new m4.p(r1Var3.a, SystemClock.elapsedRealtime(), r1Var3);
                pVar2 = pVar;
                m4.v vVar22 = wVar.d;
                vVar22.getClass();
                vVar22.a(i10, pVar2);
            }
            m4.v vVar222 = wVar.d;
            vVar222.getClass();
            vVar222.a(i10, pVar2);
        } catch (RemoteException e11) {
            e2.a.m("MediaSessionStub", "Failed to send result to browser " + wVar, e11);
        }
    }

    @Override // org.telegram.ui.Components.ik0
    public void b(float f7, float f10, int i10, View view) {
        int i11 = this.a;
        int i12 = this.b;
        Object obj = this.c;
        switch (i11) {
            case 11:
                ContactsActivity.c0((ContactsActivity) obj, i12, view, i10);
                break;
            default:
                uh0 uh0Var = (uh0) obj;
                f2 f2Var = uh0Var.Q1;
                HashSet hashSet = uh0Var.V1;
                if (view instanceof qg.k) {
                    TLRPC.User user = ((qg.k) view).getUser();
                    long j10 = user.id;
                    if (hashSet.contains(Long.valueOf(j10))) {
                        hashSet.remove(Long.valueOf(j10));
                    } else {
                        hashSet.add(Long.valueOf(j10));
                        uh0Var.a2.put(Long.valueOf(j10), user);
                    }
                    if (hashSet.size() != i12 + 1) {
                        f2Var.b(true, hashSet, new rh0(uh0Var, 2), null);
                        uh0Var.g1(true, false);
                        if (!TextUtils.isEmpty(uh0Var.b2)) {
                            uh0Var.b2 = null;
                            f2Var.setText("");
                            org.telegram.messenger.i0.r(uh0Var.l2);
                            uh0Var.f1(true, true);
                            break;
                        }
                    } else {
                        hashSet.remove(Long.valueOf(j10));
                        String G = dd.G(uh0Var.h2, "BotMultiContactsSelectorLimit", new Object[0]);
                        p2 p2Var = uh0Var.c;
                        new cc(p2Var, uh0Var.I0).Q(R.raw.chats_infotip, 36, G).k(true);
                        try {
                            p2Var.performHapticFeedback(3, 2);
                            break;
                        } catch (Exception unused) {
                            return;
                        }
                    }
                }
                break;
        }
    }

    @Override // org.telegram.ui.sb0
    public void d(TLRPC.MessageMedia messageMedia, int i10, boolean z10, int i11, long j10) {
        HashMap hashMap = (HashMap) this.c;
        Pattern pattern = LaunchActivity.D1;
        Iterator it = hashMap.entrySet().iterator();
        while (it.hasNext()) {
            kj kjVar = (kj) ((Map.Entry) it.next()).getValue();
            TLRPC.MessageMedia messageMedia2 = messageMedia;
            rz.C(this.b).r0(pz.d(messageMedia2, kj.B0(kjVar.k), kjVar, null, null, null, true, 0));
            messageMedia = messageMedia2;
        }
    }

    @Override // org.telegram.ui.Components.wb0
    public String e(int i10) {
        Calendar calendar = (Calendar) this.c;
        int i11 = this.b;
        calendar.clear();
        calendar.set(1, i11);
        calendar.set(2, 0);
        calendar.add(2, i10 - 120);
        if (calendar.get(1) != i11) {
            return dd.D0().u0().format(calendar.getTimeInMillis());
        }
        dd D0 = dd.D0();
        if (D0.r == null) {
            synchronized (D0) {
                try {
                    if (D0.r == null) {
                        Locale locale = D0.y;
                        if (locale == null) {
                            locale = Locale.getDefault();
                        }
                        D0.r = dd.k(locale, D0.N0(2131742791, "formatterMonthOnly", null), "MMMM");
                    }
                } finally {
                }
            }
        }
        return D0.r.format(calendar.getTimeInMillis());
    }

    @Override // org.telegram.ui.Components.jk0
    public boolean f(int i10, View view) {
        nj0 nj0Var = (nj0) this.c;
        if (this.b == 5) {
            nj0Var.getClass();
            return false;
        }
        mj0 mj0Var = nj0Var.g0;
        if (mj0Var == null || !(view instanceof lj0)) {
            return false;
        }
        mj0Var.x(nj0Var, ((lj0) view).e, true, false);
        return true;
    }

    @Override // org.telegram.ui.ActionBar.u1
    public void h(x1 x1Var, int i10) {
        int i11 = this.a;
        int i12 = this.b;
        Object obj = this.c;
        switch (i11) {
            case 12:
                ArrayList arrayList = ((LaunchActivity) obj).d0;
                if (!arrayList.isEmpty()) {
                    wp.r1(i12).v3("spambot", (k2) i0.a.g(1, arrayList), 1, null);
                    break;
                }
                break;
            case 13:
            case 14:
            case 16:
            default:
                ProfileActivity profileActivity = (ProfileActivity) obj;
                RectF rectF = ProfileActivity.S6;
                TLRPC.UserFull a2 = profileActivity.getMessagesController().a2(profileActivity.d1);
                if (a2 != null) {
                    a2.flags2 &= -4194305;
                    a2.note = null;
                    profileActivity.getMessagesStorage().j2(a2, true);
                }
                TLRPC.TL_updateContactNote tL_updateContactNote = new TLRPC.TL_updateContactNote();
                tL_updateContactNote.id = profileActivity.getMessagesController().n1(profileActivity.d1);
                tL_updateContactNote.note = new TLRPC.TL_textWithEntities();
                profileActivity.getConnectionsManager().sendRequest(tL_updateContactNote, null);
                profileActivity.J5();
                profileActivity.d.s(i12);
                break;
            case 15:
                gf0 gf0Var = ((ff0) obj).a0;
                if (e20.s0 != i12) {
                    ((LaunchActivity) gf0Var.getParentActivity()).O0(i12);
                }
                gf0Var.finishFragment();
                break;
            case 17:
                jl0 jl0Var = ((rk0) obj).a;
                jl0Var.D1(jl0Var.Y[i12]);
                break;
            case 18:
                PrivacyControlActivity privacyControlActivity = (PrivacyControlActivity) obj;
                privacyControlActivity.getClass();
                privacyControlActivity.presentFragment(new PrivacyControlActivity(i12, false), true);
                break;
        }
    }

    @Override // org.telegram.ui.Components.ik0
    public /* synthetic */ boolean h1(View view) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.messenger.as
    public void i(boolean z10) {
        un unVar = ((nj) this.c).b;
        int i10 = this.b;
        if (i10 == 15 && w3.T(unVar.e)) {
            TLRPC.Chat chat = unVar.e;
            if (!chat.megagroup || w3.t0(chat)) {
                unVar.getMessagesController().X(2, unVar.j6, z10);
                return;
            }
        }
        if (i10 == 15) {
            unVar.La(unVar.r4, z10);
            return;
        }
        at notificationCenter = unVar.getNotificationCenter();
        int i11 = at.t;
        notificationCenter.n(unVar, i11);
        unVar.getNotificationCenter().k(i11, new Object[0]);
        unVar.finishFragment();
        unVar.getNotificationCenter().k(at.K2, Long.valueOf(unVar.j6), unVar.f, unVar.e, Boolean.valueOf(z10));
    }

    @Override // e2.o
    public void invoke(Object obj) {
        switch (this.a) {
            case 0:
                ((b2.d1) obj).O(((m1) this.c).a, this.b);
                break;
            case 1:
                b2.d1 d1Var = (b2.d1) obj;
                d1Var.C(this.b, (b2.p0) this.c);
                break;
            default:
                j2.a aVar = (j2.a) this.c;
                j2.b bVar = (j2.b) obj;
                bVar.getClass();
                bVar.B(aVar, this.b);
                break;
        }
    }

    @Override // org.telegram.messenger.nc
    public void q(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        n7 n7Var = (n7) this.c;
        if (this.b == n7Var.b) {
            w7 w7Var = n7Var.e;
            Bitmap n10 = imageReceiver.n();
            int L = ((n10 == null || !imageReceiver.J()) && !imageReceiver.I()) ? 0 : org.telegram.messenger.i0.L(64.0f);
            o7 o7Var = w7Var.z1;
            ValueAnimator valueAnimator = w7Var.J2;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                w7Var.J2 = null;
            }
            if (o7Var.getCustomPaddingRight() != L) {
                ValueAnimator ofInt = ValueAnimator.ofInt(o7Var.getCustomPaddingRight(), L);
                w7Var.J2 = ofInt;
                if (L == 0) {
                    ofInt.setStartDelay(200L);
                    w7Var.J2.setDuration(100L);
                } else {
                    ofInt.setDuration(200L);
                }
                w7Var.J2.setInterpolator(new DecelerateInterpolator());
                w7Var.J2.addUpdateListener(new a6(w7Var, 2));
                w7Var.J2.start();
            }
            if (w7Var.Y1.getTag() != null) {
                w7Var.Z1.setImageBitmap(n10);
            }
        }
    }

    @Override // org.telegram.ui.Components.ik0
    public /* synthetic */ void q0(View view, float f7, float f10) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Components.ek0
    public int run() {
        s4.a0 a0Var = ((ab0) this.c).c;
        int L = org.telegram.messenger.i0.L(60.0f);
        int i10 = this.b;
        a0Var.h1(i10, L);
        return i10;
    }

    public /* synthetic */ q(j2.a aVar, int i10, b2.e1 e1Var, b2.e1 e1Var2) {
        this.a = 2;
        this.c = aVar;
        this.b = i10;
    }

    public /* synthetic */ q(Object obj, int i10, int i11) {
        this.a = i11;
        this.c = obj;
        this.b = i10;
    }

    public /* synthetic */ q(nj njVar, int i10, boolean z10) {
        this.a = 5;
        this.c = njVar;
        this.b = i10;
    }

    @Override // org.telegram.ui.Components.kk0
    public /* synthetic */ void g() {
    }

    @Override // org.telegram.ui.Components.kk0
    public boolean b(float f7, float f10, int i10, View view) {
        i2 i2Var = (i2) this.c;
        l10 l10Var = i2Var.V1;
        HashSet hashSet = i2Var.Z1;
        if (!(view instanceof qg.k)) {
            return false;
        }
        qg.k kVar = (qg.k) view;
        TLRPC.User user = kVar.getUser();
        long j10 = user != null ? user.id : -kVar.getChat().id;
        int i11 = this.b;
        boolean z10 = (i11 == 4 && hashSet.isEmpty()) ? false : true;
        if (hashSet.contains(Long.valueOf(j10))) {
            hashSet.remove(Long.valueOf(j10));
        } else {
            hashSet.add(Long.valueOf(j10));
            i2Var.f2.put(Long.valueOf(j10), user);
        }
        if (hashSet.size() == i2Var.h1() + 1) {
            hashSet.remove(Long.valueOf(j10));
            i2Var.m1();
            return true;
        }
        boolean z11 = (i11 == 4 && hashSet.isEmpty()) ? false : true;
        if (z10 != z11) {
            l10Var.setVisibility(0);
            l10Var.animate().alpha(z11 ? 1.0f : 0.0f).translationY(z11 ? 0.0f : org.telegram.messenger.i0.L(12.0f)).setInterpolator(gr.h).setDuration(320L).withEndAction(!z11 ? new mg.w1(i2Var, 7) : null).start();
            ng.i iVar = i2Var.h2;
            boolean z12 = !z11;
            if (iVar.D != z12) {
                iVar.D = z12;
                org.telegram.messenger.i0.d0(iVar.f, new ng.g(z12));
            }
        }
        i2Var.e1();
        i2Var.R1.b(true, hashSet, new mg.w1(i2Var, 8), null);
        i2Var.p1(true, true);
        i2Var.f1();
        return true;
    }

    @Override // org.telegram.messenger.nc
    public /* synthetic */ void j(ImageReceiver imageReceiver) {
    }

    @Override // org.telegram.ui.Components.kk0
    public /* synthetic */ void p(float f7) {
    }

    @Override // org.telegram.messenger.nc
    public /* synthetic */ void s(int i10, Drawable drawable) {
    }

    private final /* synthetic */ void a(View view, float f7, float f10) {
    }

    private final /* synthetic */ void c(View view, float f7, float f10) {
    }
}
