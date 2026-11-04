package k2;

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
import b8.zb;
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
import org.telegram.messenger.bd;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.ec;
import org.telegram.messenger.h10;
import org.telegram.messenger.hp;
import org.telegram.messenger.hs;
import org.telegram.messenger.ir;
import org.telegram.messenger.t3;
import org.telegram.messenger.wy;
import org.telegram.messenger.yy;
import org.telegram.messenger.zi;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.ActionBar.j2;
import org.telegram.ui.Components.c6;
import org.telegram.ui.Components.cj0;
import org.telegram.ui.Components.fc;
import org.telegram.ui.Components.gj0;
import org.telegram.ui.Components.hj0;
import org.telegram.ui.Components.ij0;
import org.telegram.ui.Components.ji0;
import org.telegram.ui.Components.ki0;
import org.telegram.ui.Components.li0;
import org.telegram.ui.Components.pn;
import org.telegram.ui.Components.q7;
import org.telegram.ui.Components.r4;
import org.telegram.ui.Components.r7;
import org.telegram.ui.Components.wn;
import org.telegram.ui.Components.xq;
import org.telegram.ui.Components.ya0;
import org.telegram.ui.Components.z7;
import org.telegram.ui.ContactsActivity;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PrivacyControlActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.eg0;
import org.telegram.ui.hg0;
import org.telegram.ui.ia0;
import org.telegram.ui.kg0;
import org.telegram.ui.oi;
import org.telegram.ui.t90;
import org.telegram.ui.wd0;
import org.telegram.ui.wm;
import org.telegram.ui.xd0;
import org.telegram.ui.yj0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class q implements g2.p, g2.k, ir, ya0, ec, r4, hj0, gj0, org.telegram.ui.ActionBar.p1, ia0, cj0, ij0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ q(int i3, Object obj, int i10) {
        this.a = i10;
        this.b = i3;
        this.c = obj;
    }

    @Override // org.telegram.ui.Components.r4
    public void L(int i3, int i10, boolean z10) {
        switch (this.a) {
            case 7:
                org.telegram.messenger.g0.i3(new u(i3, this.b, (wn) this.c, 11), 16L);
                break;
            default:
                org.telegram.messenger.g0.i3(new u(i3, this.b, (pn) this.c, 12), 16L);
                break;
        }
    }

    @Override // g2.k
    public void accept(Object obj) {
        o4.o oVar;
        o4.o oVar2;
        o4.v vVar = (o4.v) this.c;
        int i3 = this.b;
        try {
            try {
                oVar2 = (o4.o) ((l9.y) obj).get();
                zb.k(oVar2, "LibraryResult must not be null");
            } catch (InterruptedException e10) {
                e = e10;
                g2.a.m("MediaSessionStub", "Library operation failed", e);
                String str = o4.o.d;
                o4.p1 p1Var = new o4.p1("no error message provided", -1, Bundle.EMPTY);
                oVar = new o4.o(p1Var.a, SystemClock.elapsedRealtime(), p1Var);
                oVar2 = oVar;
                o4.u uVar = vVar.d;
                uVar.getClass();
                uVar.j(i3, oVar2);
            } catch (CancellationException e11) {
                g2.a.m("MediaSessionStub", "Library operation cancelled", e11);
                String str2 = o4.o.d;
                o4.p1 p1Var2 = new o4.p1("no error message provided", 1, Bundle.EMPTY);
                oVar = new o4.o(p1Var2.a, SystemClock.elapsedRealtime(), p1Var2);
                oVar2 = oVar;
                o4.u uVar2 = vVar.d;
                uVar2.getClass();
                uVar2.j(i3, oVar2);
            } catch (ExecutionException e12) {
                e = e12;
                g2.a.m("MediaSessionStub", "Library operation failed", e);
                String str3 = o4.o.d;
                o4.p1 p1Var3 = new o4.p1("no error message provided", -1, Bundle.EMPTY);
                oVar = new o4.o(p1Var3.a, SystemClock.elapsedRealtime(), p1Var3);
                oVar2 = oVar;
                o4.u uVar22 = vVar.d;
                uVar22.getClass();
                uVar22.j(i3, oVar2);
            }
            o4.u uVar222 = vVar.d;
            uVar222.getClass();
            uVar222.j(i3, oVar2);
        } catch (RemoteException e13) {
            g2.a.m("MediaSessionStub", "Failed to send result to browser " + vVar, e13);
        }
    }

    @Override // org.telegram.ui.Components.gj0
    public void b(float f10, float f11, int i3, View view) {
        int i10 = this.a;
        int i11 = this.b;
        Object obj = this.c;
        switch (i10) {
            case 10:
                ContactsActivity.c0((ContactsActivity) obj, i11, view, i3);
                break;
            default:
                kg0 kg0Var = (kg0) obj;
                hg0 hg0Var = kg0Var.R1;
                HashSet hashSet = kg0Var.W1;
                if (view instanceof bh.p) {
                    TLRPC.User user = ((bh.p) view).getUser();
                    long j10 = user.id;
                    if (hashSet.contains(Long.valueOf(j10))) {
                        hashSet.remove(Long.valueOf(j10));
                    } else {
                        hashSet.add(Long.valueOf(j10));
                        kg0Var.b2.put(Long.valueOf(j10), user);
                    }
                    if (hashSet.size() != i11 + 1) {
                        hg0Var.b(true, hashSet, new eg0(kg0Var, 2), null);
                        kg0Var.g1(true, false);
                        if (!TextUtils.isEmpty(kg0Var.c2)) {
                            kg0Var.c2 = null;
                            hg0Var.setText("");
                            org.telegram.messenger.g0.r(kg0Var.m2);
                            kg0Var.f1(true, true);
                            break;
                        }
                    } else {
                        hashSet.remove(Long.valueOf(j10));
                        String G = bd.G(kg0Var.i2, "BotMultiContactsSelectorLimit", new Object[0]);
                        j2 j2Var = kg0Var.c;
                        new fc(j2Var, kg0Var.J0).Q(R.raw.chats_infotip, 36, G).k(true);
                        try {
                            j2Var.performHapticFeedback(3, 2);
                            break;
                        } catch (Exception unused) {
                            return;
                        }
                    }
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.gj0
    public /* synthetic */ boolean b1(View view) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.ia0
    public void d(TLRPC.MessageMedia messageMedia, int i3, boolean z10, int i10, long j10) {
        HashMap hashMap = (HashMap) this.c;
        String str = LaunchActivity.E1;
        Iterator it = hashMap.entrySet().iterator();
        while (it.hasNext()) {
            zi ziVar = (zi) ((Map.Entry) it.next()).getValue();
            TLRPC.MessageMedia messageMedia2 = messageMedia;
            yy.C(this.b).r0(wy.d(messageMedia2, zi.B0(ziVar.k), ziVar, null, null, null, true, 0));
            messageMedia = messageMedia2;
        }
    }

    @Override // org.telegram.ui.Components.ya0
    public String e(int i3) {
        Calendar calendar = (Calendar) this.c;
        int i10 = this.b;
        calendar.clear();
        calendar.set(1, i10);
        calendar.set(2, 0);
        calendar.add(2, i3 - 120);
        if (calendar.get(1) != i10) {
            return bd.E0().v0().format(calendar.getTimeInMillis());
        }
        bd E0 = bd.E0();
        if (E0.r == null) {
            synchronized (E0) {
                try {
                    if (E0.r == null) {
                        Locale locale = E0.y;
                        if (locale == null) {
                            locale = Locale.getDefault();
                        }
                        E0.r = bd.k(locale, E0.O0(2131742776, "formatterMonthOnly", null), "MMMM");
                    }
                } finally {
                }
            }
        }
        return E0.r.format(calendar.getTimeInMillis());
    }

    @Override // org.telegram.ui.Components.hj0
    public boolean f(int i3, View view) {
        li0 li0Var = (li0) this.c;
        if (this.b == 5) {
            li0Var.getClass();
            return false;
        }
        ki0 ki0Var = li0Var.h0;
        if (ki0Var == null || !(view instanceof ji0)) {
            return false;
        }
        ki0Var.z(li0Var, ((ji0) view).e, true, false);
        return true;
    }

    @Override // org.telegram.ui.ActionBar.p1
    public void g(org.telegram.ui.ActionBar.s1 s1Var, int i3) {
        int i10 = this.a;
        int i11 = this.b;
        Object obj = this.c;
        switch (i10) {
            case 11:
                ArrayList arrayList = ((LaunchActivity) obj).e0;
                if (!arrayList.isEmpty()) {
                    hp.s1(i11).y3("spambot", (d2) p1.h(1, arrayList), 1, null);
                    break;
                }
                break;
            case 12:
            case 13:
            case 15:
            default:
                ProfileActivity profileActivity = (ProfileActivity) obj;
                RectF rectF = ProfileActivity.T6;
                TLRPC.UserFull b22 = profileActivity.getMessagesController().b2(profileActivity.e1);
                if (b22 != null) {
                    b22.flags2 &= -4194305;
                    b22.note = null;
                    profileActivity.getMessagesStorage().j2(b22, true);
                }
                TLRPC.TL_updateContactNote tL_updateContactNote = new TLRPC.TL_updateContactNote();
                tL_updateContactNote.id = profileActivity.getMessagesController().o1(profileActivity.e1);
                tL_updateContactNote.note = new TLRPC.TL_textWithEntities();
                profileActivity.getConnectionsManager().sendRequest(tL_updateContactNote, null);
                profileActivity.J5();
                profileActivity.d.s(i11);
                break;
            case 14:
                xd0 xd0Var = ((wd0) obj).b0;
                if (h10.t0 != i11) {
                    ((LaunchActivity) xd0Var.getParentActivity()).O0(i11);
                }
                xd0Var.finishFragment();
                break;
            case 16:
                yj0 yj0Var = ((org.telegram.ui.hj0) obj).a;
                yj0Var.D1(yj0Var.Z[i11]);
                break;
            case 17:
                PrivacyControlActivity privacyControlActivity = (PrivacyControlActivity) obj;
                privacyControlActivity.getClass();
                privacyControlActivity.presentFragment(new PrivacyControlActivity(i11, false), true);
                break;
        }
    }

    @Override // g2.p
    public void invoke(Object obj) {
        switch (this.a) {
            case 0:
                ((d2.c1) obj).E(((j1) this.c).a, this.b);
                break;
            case 1:
                d2.c1 c1Var = (d2.c1) obj;
                c1Var.n(this.b, (d2.n0) this.c);
                break;
            default:
                l2.a aVar = (l2.a) this.c;
                l2.b bVar = (l2.b) obj;
                bVar.getClass();
                bVar.A(aVar, this.b);
                break;
        }
    }

    @Override // org.telegram.messenger.ec
    public void l0(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        q7 q7Var = (q7) this.c;
        if (this.b == q7Var.b) {
            z7 z7Var = q7Var.e;
            Bitmap n4 = imageReceiver.n();
            int L = ((n4 == null || !imageReceiver.J()) && !imageReceiver.I()) ? 0 : org.telegram.messenger.g0.L(64.0f);
            r7 r7Var = z7Var.A1;
            ValueAnimator valueAnimator = z7Var.K2;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                z7Var.K2 = null;
            }
            if (r7Var.getCustomPaddingRight() != L) {
                ValueAnimator ofInt = ValueAnimator.ofInt(r7Var.getCustomPaddingRight(), L);
                z7Var.K2 = ofInt;
                if (L == 0) {
                    ofInt.setStartDelay(200L);
                    z7Var.K2.setDuration(100L);
                } else {
                    ofInt.setDuration(200L);
                }
                z7Var.K2.setInterpolator(new DecelerateInterpolator());
                z7Var.K2.addUpdateListener(new c6(z7Var, 2));
                z7Var.K2.start();
            }
            if (z7Var.Z1.getTag() != null) {
                z7Var.a2.setImageBitmap(n4);
            }
        }
    }

    @Override // org.telegram.messenger.ir
    public void o(boolean z10) {
        wm wmVar = ((oi) this.c).b;
        int i3 = this.b;
        if (i3 == 15 && t3.T(wmVar.e)) {
            TLRPC.Chat chat = wmVar.e;
            if (!chat.megagroup || t3.t0(chat)) {
                wmVar.getMessagesController().X(2, wmVar.k6, z10);
                return;
            }
        }
        if (i3 == 15) {
            wmVar.Qa(wmVar.s4, z10);
            return;
        }
        hs notificationCenter = wmVar.getNotificationCenter();
        int i10 = hs.t;
        notificationCenter.n(wmVar, i10);
        wmVar.getNotificationCenter().k(i10, new Object[0]);
        wmVar.finishFragment();
        wmVar.getNotificationCenter().k(hs.K2, Long.valueOf(wmVar.k6), wmVar.f, wmVar.e, Boolean.valueOf(z10));
    }

    @Override // org.telegram.ui.Components.gj0
    public /* synthetic */ void r0(View view, float f10, float f11) {
        int i3 = this.a;
    }

    @Override // org.telegram.ui.Components.cj0
    public int run() {
        u4.b0 b0Var = ((t90) this.c).c;
        int L = org.telegram.messenger.g0.L(60.0f);
        int i3 = this.b;
        b0Var.h1(i3, L);
        return i3;
    }

    public /* synthetic */ q(Object obj, int i3, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = i3;
    }

    public /* synthetic */ q(l2.a aVar, int i3, d2.d1 d1Var, d2.d1 d1Var2) {
        this.a = 2;
        this.c = aVar;
        this.b = i3;
    }

    public /* synthetic */ q(oi oiVar, int i3, boolean z10) {
        this.a = 4;
        this.c = oiVar;
        this.b = i3;
    }

    @Override // org.telegram.ui.Components.ij0
    public /* synthetic */ void h() {
    }

    @Override // org.telegram.ui.Components.ij0
    public boolean b(float f10, float f11, int i3, View view) {
        xg.e1 e1Var = (xg.e1) this.c;
        bh.a aVar = e1Var.W1;
        HashSet hashSet = e1Var.a2;
        if (!(view instanceof bh.p)) {
            return false;
        }
        bh.p pVar = (bh.p) view;
        TLRPC.User user = pVar.getUser();
        long j10 = user != null ? user.id : -pVar.getChat().id;
        int i10 = this.b;
        boolean z10 = (i10 == 4 && hashSet.isEmpty()) ? false : true;
        if (hashSet.contains(Long.valueOf(j10))) {
            hashSet.remove(Long.valueOf(j10));
        } else {
            hashSet.add(Long.valueOf(j10));
            e1Var.g2.put(Long.valueOf(j10), user);
        }
        if (hashSet.size() == e1Var.h1() + 1) {
            hashSet.remove(Long.valueOf(j10));
            e1Var.m1();
            return true;
        }
        boolean z11 = (i10 == 4 && hashSet.isEmpty()) ? false : true;
        if (z10 != z11) {
            aVar.setVisibility(0);
            aVar.animate().alpha(z11 ? 1.0f : 0.0f).translationY(z11 ? 0.0f : org.telegram.messenger.g0.L(12.0f)).setInterpolator(xq.h).setDuration(320L).withEndAction(!z11 ? new xg.x0(e1Var, 7) : null).start();
            yg.h hVar = e1Var.i2;
            boolean z12 = !z11;
            if (hVar.E != z12) {
                hVar.E = z12;
                org.telegram.messenger.g0.d0(hVar.f, new yg.f(z12));
            }
        }
        e1Var.e1();
        e1Var.S1.b(true, hashSet, new xg.x0(e1Var, 8), null);
        e1Var.p1(true, true);
        e1Var.f1();
        return true;
    }

    @Override // org.telegram.messenger.ec
    public /* synthetic */ void D(ImageReceiver imageReceiver) {
    }

    @Override // org.telegram.ui.Components.ij0
    public /* synthetic */ void r(float f10) {
    }

    @Override // org.telegram.messenger.ec
    public /* synthetic */ void F0(int i3, Drawable drawable) {
    }

    private final /* synthetic */ void a(View view, float f10, float f11) {
    }

    private final /* synthetic */ void c(View view, float f10, float f11) {
    }
}
