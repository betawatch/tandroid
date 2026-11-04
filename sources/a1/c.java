package a1;

import ai.b3;
import ai.d6;
import ai.i1;
import ai.k0;
import ai.s;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import cg.o;
import ci.e9;
import ci.j1;
import ci.n6;
import ci.tb;
import ci.v;
import ci.w5;
import ci.wb;
import ci.x0;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import e5.l;
import ei.e8;
import ei.f8;
import ei.g1;
import ei.h7;
import ei.j5;
import ei.k2;
import ei.l9;
import ei.q;
import ei.u;
import ei.u0;
import ei.v0;
import ei.w0;
import g2.k;
import g9.f0;
import j2.i;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.scilab.forge.jlatexmath.TeXSymbolParser;
import org.telegram.messenger.bd;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.g0;
import org.telegram.messenger.h10;
import org.telegram.messenger.hp;
import org.telegram.messenger.l10;
import org.telegram.messenger.li;
import org.telegram.messenger.n10;
import org.telegram.messenger.o10;
import org.telegram.messenger.p2;
import org.telegram.messenger.q1;
import org.telegram.messenger.s10;
import org.telegram.messenger.t3;
import org.telegram.messenger.u10;
import org.telegram.messenger.us;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.p1;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Cells.t0;
import org.telegram.ui.Components.f60;
import org.telegram.ui.Components.gj0;
import org.telegram.ui.Components.hj0;
import org.telegram.ui.Components.r31;
import org.telegram.ui.Components.r4;
import org.telegram.ui.Components.xp;
import org.telegram.ui.NotificationsCustomSettingsActivity;
import org.telegram.ui.Wallet.s1;
import org.telegram.ui.cl0;
import org.telegram.ui.mv;
import org.telegram.ui.uw;
import r0.k1;
import r0.m;
import u4.m0;
import yh.j;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class c implements OnSuccessListener, Continuation, o, p1, m, q1, k, i, s10, r4, qe.b, cl0, hj0, o10, gj0, h7, l9, j {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ c(Object obj, int i3) {
        this.a = i3;
        this.b = obj;
    }

    @Override // org.telegram.ui.Components.r4
    public void L(int i3, int i10, boolean z10) {
        x0 x0Var = (x0) this.b;
        if (z10) {
            long j10 = i3;
            if (x0Var.A1 != j10) {
                x0Var.A1 = j10;
                x0Var.q1.setText(x0.K0(j10));
            }
            x0Var.J0(true);
        }
    }

    @Override // r0.m
    public k1 R0(View view, k1 k1Var) {
        ((i1) this.b).o1.j(k1Var);
        return k1.b;
    }

    @Override // qe.b
    public void Y(int i3, float f10, float f11, qe.c cVar) {
        View view = ((n6) this.b).b;
        if (view instanceof t0) {
            ((t0) view).T();
        } else {
            view.invalidate();
        }
    }

    @Override // j2.i
    public void a(j2.j jVar) {
        c4.j jVar2 = (c4.j) this.b;
        c4.i iVar = (c4.i) jVar;
        iVar.clear();
        jVar2.b.add(iVar);
    }

    @Override // g2.k
    public void accept(Object obj) {
        switch (this.a) {
            case 6:
                b4.h hVar = (b4.h) this.b;
                b4.a aVar = (b4.a) obj;
                b4.g gVar = new b4.g(aVar.b, kb.a.q4(aVar.a, aVar.c));
                hVar.c.add(gVar);
                long j10 = hVar.j;
                if (j10 == -9223372036854775807L || aVar.d >= j10) {
                    hVar.g(gVar);
                    break;
                }
                break;
            default:
                ((f0) this.b).c((b4.a) obj);
                break;
        }
    }

    @Override // org.telegram.ui.Components.gj0
    public void b(float f10, float f11, int i3, View view) {
        long j10;
        int i10;
        int i11;
        int i12;
        k2 k2Var = (k2) this.b;
        j1 j1Var = k2Var.c;
        ArrayList arrayList = k2Var.r;
        v0 v0Var = ((ei.t0) view).f;
        int i13 = k2Var.O;
        int currentTime = ConnectionsManager.getInstance(i13).getCurrentTime();
        HashSet hashSet = new HashSet();
        int i14 = 0;
        int i15 = 0;
        while (true) {
            if (i15 >= v0Var.f.size()) {
                break;
            }
            u0 u0Var = (u0) v0Var.f.get(i15);
            long j11 = u0Var.g;
            if (j11 > 0 && currentTime - u0Var.d <= u.b(i13, (int) j11, 0)) {
                hashSet.add(Integer.valueOf(u0Var.a));
            }
            i15++;
        }
        g1 g1Var = k2Var.Q;
        long j12 = g1Var != null ? g1Var.j() : 0L;
        int i16 = 0;
        int i17 = 0;
        while (i16 < arrayList.size()) {
            u0 u0Var2 = (u0) arrayList.get(i16);
            if (u0Var2.b || !u0Var2.e || u0Var2.g >= j12) {
                if (hashSet.contains(Integer.valueOf(u0Var2.a))) {
                    j10 = j12;
                    if (k2Var.x != v0Var.b || (i12 = k2Var.y) == 0 || u0Var2.a < i12) {
                        i10 = u0Var2.a;
                        break;
                    }
                } else {
                    j10 = j12;
                }
                i17++;
            } else {
                j10 = j12;
            }
            i16++;
            j12 = j10;
        }
        j10 = j12;
        i10 = -1;
        if (i10 < 0) {
            int i18 = 0;
            while (true) {
                if (i14 >= arrayList.size()) {
                    i17 = i18;
                    i11 = -1;
                    break;
                }
                u0 u0Var3 = (u0) arrayList.get(i14);
                if (u0Var3.b || !u0Var3.e || u0Var3.g >= j10) {
                    if (hashSet.contains(Integer.valueOf(u0Var3.a))) {
                        i11 = u0Var3.a;
                        i17 = i18;
                        break;
                    }
                    i18++;
                }
                i14++;
            }
        } else {
            i11 = i10;
        }
        if (i11 < 0) {
            return;
        }
        k2Var.x = v0Var.b;
        k2Var.y = i11;
        k2Var.E = true;
        m0 itemAnimator = j1Var.getItemAnimator();
        j1Var.setItemAnimator(null);
        k2Var.d.i1(i17, j1Var.getHeight() / 2, true);
        k2Var.e.g(i17);
        j1Var.setItemAnimator(itemAnimator);
    }

    @Override // org.telegram.ui.Components.gj0
    public /* synthetic */ boolean b1(View view) {
        return false;
    }

    @Override // ei.h7
    public void c(boolean z10) {
        j5 j5Var = (j5) this.b;
        if (j5Var != null) {
            j5Var.c();
        }
    }

    @Override // org.telegram.messenger.o10
    public Object d(Number number, Object obj) {
        return w0.a((w0) this.b, (Long) obj);
    }

    @Override // org.telegram.ui.cl0
    public void e(int i3) {
        switch (this.a) {
            case 17:
                n10 n10Var = (n10) this.b;
                if (i3 != 1) {
                    if (i3 != 3) {
                        n10Var.a(Boolean.FALSE, null);
                        break;
                    }
                } else {
                    n10Var.a(Boolean.TRUE, null);
                    break;
                }
                break;
            case 18:
                s1 s1Var = (s1) this.b;
                if (i3 != 1) {
                    if (i3 != 3) {
                        s1Var.a(Boolean.FALSE, null);
                        break;
                    }
                } else {
                    s1Var.a(Boolean.TRUE, null);
                    break;
                }
                break;
            default:
                d6 d6Var = (d6) this.b;
                if (i3 != 1) {
                    if (i3 != 3) {
                        d6Var.a(Boolean.FALSE, null);
                        break;
                    }
                } else {
                    d6Var.a(Boolean.TRUE, null);
                    break;
                }
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x02b7  */
    @Override // org.telegram.ui.Components.hj0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean f(int i3, final View view) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        TLRPC.Chat chat;
        String str;
        xp xpVar;
        boolean z10;
        boolean z11;
        f60 f60Var;
        final int i17;
        int i18;
        Drawable drawable;
        final mv mvVar = (mv) this.b;
        final int i19 = 0;
        if (mvVar.O == 0.0f && mvVar.o0 == 0.0f) {
            final long j10 = ((q) view).F;
            uw uwVar = mvVar.P0;
            i10 = ((d2) uwVar).currentAccount;
            final int i20 = 1;
            li.b0(i10).M0(true);
            f60 H = f60.H(uwVar, view);
            H.z.set(0, g0.L(8.0f), 0, 0);
            H.W(k6.e0(g0.L(12.0f), g0.L(12.0f), uwVar.getThemedColor(k6.d6)));
            H.a0(0.0f, g0.L(8.0f));
            uwVar.M0 = H;
            if (!l10.A(j10)) {
                try {
                    view.performHapticFeedback(0);
                } catch (Exception unused) {
                }
                i11 = ((d2) uwVar).currentAccount;
                final int i21 = 2;
                if (j10 != h10.i(i11).e()) {
                    final TLRPC.User a22 = uwVar.getMessagesController().a2(Long.valueOf(j10));
                    TLRPC.Chat M0 = uwVar.getMessagesController().M0(Long.valueOf(-j10));
                    String v = us.v(j10, 0L, false);
                    i12 = ((d2) uwVar).currentAccount;
                    boolean h02 = NotificationsCustomSettingsActivity.h0(i12, j10);
                    i13 = ((d2) uwVar).currentAccount;
                    boolean D3 = hp.s1(i13).D3();
                    i14 = ((d2) uwVar).currentAccount;
                    boolean q10 = h10.i(i14).q();
                    i15 = ((d2) uwVar).currentAccount;
                    boolean L = hp.s1(i15).P1().L(j10);
                    i16 = ((d2) uwVar).currentAccount;
                    boolean H2 = hp.s1(i16).P1().H(j10);
                    if (D3 || j10 <= 0 || q10 || (drawable = mvVar.getContext().getDrawable(R.drawable.msg_gallery_locked2)) == null) {
                        chat = M0;
                        str = v;
                        xpVar = null;
                    } else {
                        Drawable drawable2 = mvVar.getContext().getDrawable(R.drawable.msg_stealth_locked);
                        if (drawable2 != null) {
                            chat = M0;
                            r6.y(mvVar, drawable2, k6.F8, uwVar.getResourceProvider(), PorterDuff.Mode.MULTIPLY);
                        } else {
                            chat = M0;
                        }
                        str = v;
                        drawable.setColorFilter(new PorterDuffColorFilter(i0.a.f(0.5f, -1, -16777216), PorterDuff.Mode.MULTIPLY));
                        xpVar = new xp(drawable2, drawable);
                    }
                    if (j10 < 0 && uwVar.j4().j(j10)) {
                        final int i22 = 4;
                        uwVar.M0.b(R.drawable.msg_stories_add, null, bd.M0(2131754384, null), k6.F8, k6.E8, new Runnable() { // from class: org.telegram.ui.iv
                            @Override // java.lang.Runnable
                            public final void run() {
                                int i23;
                                switch (i22) {
                                    case 0:
                                        mvVar.P0.presentFragment(wm.ra(j10));
                                        break;
                                    case 1:
                                        org.telegram.messenger.g0.i3(new pu(mvVar.P0, j10, !r2.q4(), 0), 200L);
                                        break;
                                    case 2:
                                        org.telegram.messenger.g0.i3(new pu(mvVar.P0, j10, !r2.q4(), 0), 200L);
                                        break;
                                    case 3:
                                        uw uwVar2 = mvVar.P0;
                                        i23 = ((org.telegram.ui.ActionBar.d2) uwVar2).currentAccount;
                                        org.telegram.messenger.li b02 = org.telegram.messenger.li.b0(i23);
                                        long j11 = j10;
                                        b02.N1(j11);
                                        uwVar2.getMessagesController().P1().l0(j11, true, false);
                                        break;
                                    case 4:
                                        mvVar.P0.F0.j(j10);
                                        break;
                                    case 5:
                                        mvVar.P0.presentFragment(wm.ra(j10));
                                        break;
                                    default:
                                        mvVar.P0.presentFragment(ProfileActivity.A4(j10));
                                        break;
                                }
                            }
                        });
                    }
                    if (a22 != null && !a22.contact) {
                        i18 = ((d2) uwVar).currentAccount;
                        if (li.b0(i18).G(j10)) {
                            z10 = true;
                            f60 f60Var2 = uwVar.M0;
                            final int i23 = 5;
                            f60Var2.l(R.drawable.msg_discussion, bd.M0(2131745611, null), new Runnable() { // from class: org.telegram.ui.iv
                                @Override // java.lang.Runnable
                                public final void run() {
                                    int i232;
                                    switch (i23) {
                                        case 0:
                                            mvVar.P0.presentFragment(wm.ra(j10));
                                            break;
                                        case 1:
                                            org.telegram.messenger.g0.i3(new pu(mvVar.P0, j10, !r2.q4(), 0), 200L);
                                            break;
                                        case 2:
                                            org.telegram.messenger.g0.i3(new pu(mvVar.P0, j10, !r2.q4(), 0), 200L);
                                            break;
                                        case 3:
                                            uw uwVar2 = mvVar.P0;
                                            i232 = ((org.telegram.ui.ActionBar.d2) uwVar2).currentAccount;
                                            org.telegram.messenger.li b02 = org.telegram.messenger.li.b0(i232);
                                            long j11 = j10;
                                            b02.N1(j11);
                                            uwVar2.getMessagesController().P1().l0(j11, true, false);
                                            break;
                                        case 4:
                                            mvVar.P0.F0.j(j10);
                                            break;
                                        case 5:
                                            mvVar.P0.presentFragment(wm.ra(j10));
                                            break;
                                        default:
                                            mvVar.P0.presentFragment(ProfileActivity.A4(j10));
                                            break;
                                    }
                                }
                            }, j10 <= 0);
                            final int i24 = 6;
                            f60Var2.l(R.drawable.msg_openprofile, bd.M0(2131747794, null), new Runnable() { // from class: org.telegram.ui.iv
                                @Override // java.lang.Runnable
                                public final void run() {
                                    int i232;
                                    switch (i24) {
                                        case 0:
                                            mvVar.P0.presentFragment(wm.ra(j10));
                                            break;
                                        case 1:
                                            org.telegram.messenger.g0.i3(new pu(mvVar.P0, j10, !r2.q4(), 0), 200L);
                                            break;
                                        case 2:
                                            org.telegram.messenger.g0.i3(new pu(mvVar.P0, j10, !r2.q4(), 0), 200L);
                                            break;
                                        case 3:
                                            uw uwVar2 = mvVar.P0;
                                            i232 = ((org.telegram.ui.ActionBar.d2) uwVar2).currentAccount;
                                            org.telegram.messenger.li b02 = org.telegram.messenger.li.b0(i232);
                                            long j11 = j10;
                                            b02.N1(j11);
                                            uwVar2.getMessagesController().P1().l0(j11, true, false);
                                            break;
                                        case 4:
                                            mvVar.P0.F0.j(j10);
                                            break;
                                        case 5:
                                            mvVar.P0.presentFragment(wm.ra(j10));
                                            break;
                                        default:
                                            mvVar.P0.presentFragment(ProfileActivity.A4(j10));
                                            break;
                                    }
                                }
                            }, j10 <= 0);
                            final int i25 = 0;
                            f60Var2.l(R.drawable.msg_channel, bd.M0(!t3.V(chat) ? 2131747819 : 2131747807, null), new Runnable() { // from class: org.telegram.ui.iv
                                @Override // java.lang.Runnable
                                public final void run() {
                                    int i232;
                                    switch (i25) {
                                        case 0:
                                            mvVar.P0.presentFragment(wm.ra(j10));
                                            break;
                                        case 1:
                                            org.telegram.messenger.g0.i3(new pu(mvVar.P0, j10, !r2.q4(), 0), 200L);
                                            break;
                                        case 2:
                                            org.telegram.messenger.g0.i3(new pu(mvVar.P0, j10, !r2.q4(), 0), 200L);
                                            break;
                                        case 3:
                                            uw uwVar2 = mvVar.P0;
                                            i232 = ((org.telegram.ui.ActionBar.d2) uwVar2).currentAccount;
                                            org.telegram.messenger.li b02 = org.telegram.messenger.li.b0(i232);
                                            long j11 = j10;
                                            b02.N1(j11);
                                            uwVar2.getMessagesController().P1().l0(j11, true, false);
                                            break;
                                        case 4:
                                            mvVar.P0.F0.j(j10);
                                            break;
                                        case 5:
                                            mvVar.P0.presentFragment(wm.ra(j10));
                                            break;
                                        default:
                                            mvVar.P0.presentFragment(ProfileActivity.A4(j10));
                                            break;
                                    }
                                }
                            }, j10 >= 0);
                            final int i26 = 0;
                            final String str2 = str;
                            f60Var2.l(R.drawable.msg_mute, bd.M0(2131747871, null), new Runnable() { // from class: org.telegram.ui.jv
                                @Override // java.lang.Runnable
                                public final void run() {
                                    int i27;
                                    String trim;
                                    int i28;
                                    int i29 = i26;
                                    TLRPC.User user = a22;
                                    String str3 = str2;
                                    mv mvVar2 = mvVar;
                                    switch (i29) {
                                        case 0:
                                            uw uwVar2 = mvVar2.P0;
                                            i27 = ((org.telegram.ui.ActionBar.d2) uwVar2).currentAccount;
                                            org.telegram.messenger.hp.s1(i27).d7.edit().putBoolean("stories_" + str3, false).apply();
                                            uwVar2.getNotificationsController().c0(j10, 0L, true);
                                            trim = user != null ? user.first_name.trim() : "";
                                            int indexOf = trim.indexOf(" ");
                                            if (indexOf > 0) {
                                                trim = trim.substring(0, indexOf);
                                            }
                                            org.telegram.ui.Components.fc.a0(uwVar2).V(Arrays.asList(user), org.telegram.messenger.g0.X2(org.telegram.messenger.bd.a0("NotificationsStoryMutedHint", null, 2131747870, trim)), null, null).j();
                                            break;
                                        default:
                                            uw uwVar3 = mvVar2.P0;
                                            i28 = ((org.telegram.ui.ActionBar.d2) uwVar3).currentAccount;
                                            org.telegram.messenger.hp.s1(i28).d7.edit().putBoolean("stories_" + str3, true).apply();
                                            uwVar3.getNotificationsController().c0(j10, 0L, true);
                                            trim = user != null ? user.first_name.trim() : "";
                                            int indexOf2 = trim.indexOf(" ");
                                            if (indexOf2 > 0) {
                                                trim = trim.substring(0, indexOf2);
                                            }
                                            org.telegram.ui.Components.fc.a0(uwVar3).V(Arrays.asList(user), org.telegram.messenger.g0.X2(org.telegram.messenger.bd.a0("NotificationsStoryUnmutedHint", null, 2131747867, trim)), null, null).j();
                                            break;
                                    }
                                }
                            }, !h02 && j10 > 0);
                            f60Var2.E();
                            final int i27 = 1;
                            f60Var2.l(R.drawable.msg_unmute, bd.M0(2131747868, null), new Runnable() { // from class: org.telegram.ui.jv
                                @Override // java.lang.Runnable
                                public final void run() {
                                    int i272;
                                    String trim;
                                    int i28;
                                    int i29 = i27;
                                    TLRPC.User user = a22;
                                    String str3 = str2;
                                    mv mvVar2 = mvVar;
                                    switch (i29) {
                                        case 0:
                                            uw uwVar2 = mvVar2.P0;
                                            i272 = ((org.telegram.ui.ActionBar.d2) uwVar2).currentAccount;
                                            org.telegram.messenger.hp.s1(i272).d7.edit().putBoolean("stories_" + str3, false).apply();
                                            uwVar2.getNotificationsController().c0(j10, 0L, true);
                                            trim = user != null ? user.first_name.trim() : "";
                                            int indexOf = trim.indexOf(" ");
                                            if (indexOf > 0) {
                                                trim = trim.substring(0, indexOf);
                                            }
                                            org.telegram.ui.Components.fc.a0(uwVar2).V(Arrays.asList(user), org.telegram.messenger.g0.X2(org.telegram.messenger.bd.a0("NotificationsStoryMutedHint", null, 2131747870, trim)), null, null).j();
                                            break;
                                        default:
                                            uw uwVar3 = mvVar2.P0;
                                            i28 = ((org.telegram.ui.ActionBar.d2) uwVar3).currentAccount;
                                            org.telegram.messenger.hp.s1(i28).d7.edit().putBoolean("stories_" + str3, true).apply();
                                            uwVar3.getNotificationsController().c0(j10, 0L, true);
                                            trim = user != null ? user.first_name.trim() : "";
                                            int indexOf2 = trim.indexOf(" ");
                                            if (indexOf2 > 0) {
                                                trim = trim.substring(0, indexOf2);
                                            }
                                            org.telegram.ui.Components.fc.a0(uwVar3).V(Arrays.asList(user), org.telegram.messenger.g0.X2(org.telegram.messenger.bd.a0("NotificationsStoryUnmutedHint", null, 2131747867, trim)), null, null).j();
                                            break;
                                    }
                                }
                            }, h02 && j10 > 0);
                            f60Var2.E();
                            final int i28 = 0;
                            f60Var2.l(R.drawable.msg_stories_stealth2, bd.M0(2131743572, null), new Runnable() { // from class: org.telegram.ui.kv
                                @Override // java.lang.Runnable
                                public final void run() {
                                    org.telegram.ui.ActionBar.e6 e6Var;
                                    int i29;
                                    org.telegram.ui.ActionBar.e6 e6Var2;
                                    switch (i28) {
                                        case 0:
                                            mv mvVar2 = mvVar;
                                            uw uwVar2 = mvVar2.P0;
                                            TL_stories.TL_storiesStealthMode tL_storiesStealthMode = org.telegram.messenger.hp.s1(org.telegram.messenger.h10.t0).P1().B;
                                            View view2 = view;
                                            if (tL_storiesStealthMode != null) {
                                                i29 = ((org.telegram.ui.ActionBar.d2) uwVar2).currentAccount;
                                                if (ConnectionsManager.getInstance(i29).getCurrentTime() < tL_storiesStealthMode.active_until_date) {
                                                    if (view2 instanceof ei.q) {
                                                        uwVar2.F0.i((ei.q) view2, false);
                                                        break;
                                                    }
                                                }
                                            }
                                            Context context = mvVar2.getContext();
                                            e6Var = ((org.telegram.ui.ActionBar.d2) uwVar2).resourceProvider;
                                            ei.w5 w5Var = new ei.w5(context, 0.0f, 1, e6Var);
                                            w5Var.m1 = new lv(mvVar2, view2, 1);
                                            uwVar2.showDialog(w5Var);
                                            break;
                                        default:
                                            mv mvVar3 = mvVar;
                                            Context context2 = mvVar3.getContext();
                                            uw uwVar3 = mvVar3.P0;
                                            e6Var2 = ((org.telegram.ui.ActionBar.d2) uwVar3).resourceProvider;
                                            ei.w5 w5Var2 = new ei.w5(context2, 0.0f, 1, e6Var2);
                                            w5Var2.m1 = new lv(mvVar3, view, 0);
                                            uwVar3.showDialog(w5Var2);
                                            break;
                                    }
                                }
                            }, D3 && j10 > 0 && q10 && L && !H2);
                            f60Var2.E();
                            z11 = D3 && j10 > 0 && !q10 && L && !H2;
                            String M02 = bd.M0(2131743572, null);
                            final int i29 = 1;
                            Runnable runnable = new Runnable() { // from class: org.telegram.ui.kv
                                @Override // java.lang.Runnable
                                public final void run() {
                                    org.telegram.ui.ActionBar.e6 e6Var;
                                    int i292;
                                    org.telegram.ui.ActionBar.e6 e6Var2;
                                    switch (i29) {
                                        case 0:
                                            mv mvVar2 = mvVar;
                                            uw uwVar2 = mvVar2.P0;
                                            TL_stories.TL_storiesStealthMode tL_storiesStealthMode = org.telegram.messenger.hp.s1(org.telegram.messenger.h10.t0).P1().B;
                                            View view2 = view;
                                            if (tL_storiesStealthMode != null) {
                                                i292 = ((org.telegram.ui.ActionBar.d2) uwVar2).currentAccount;
                                                if (ConnectionsManager.getInstance(i292).getCurrentTime() < tL_storiesStealthMode.active_until_date) {
                                                    if (view2 instanceof ei.q) {
                                                        uwVar2.F0.i((ei.q) view2, false);
                                                        break;
                                                    }
                                                }
                                            }
                                            Context context = mvVar2.getContext();
                                            e6Var = ((org.telegram.ui.ActionBar.d2) uwVar2).resourceProvider;
                                            ei.w5 w5Var = new ei.w5(context, 0.0f, 1, e6Var);
                                            w5Var.m1 = new lv(mvVar2, view2, 1);
                                            uwVar2.showDialog(w5Var);
                                            break;
                                        default:
                                            mv mvVar3 = mvVar;
                                            Context context2 = mvVar3.getContext();
                                            uw uwVar3 = mvVar3.P0;
                                            e6Var2 = ((org.telegram.ui.ActionBar.d2) uwVar3).resourceProvider;
                                            ei.w5 w5Var2 = new ei.w5(context2, 0.0f, 1, e6Var2);
                                            w5Var2.m1 = new lv(mvVar3, view, 0);
                                            uwVar3.showDialog(w5Var2);
                                            break;
                                    }
                                }
                            };
                            if (z11) {
                                f60Var = f60Var2;
                            } else {
                                f60Var2.b(R.drawable.msg_stories_stealth2, xpVar, M02, k6.F8, k6.E8, runnable);
                                f60Var = f60Var2;
                            }
                            f60Var.E();
                            final int i30 = 1;
                            f60Var.l(R.drawable.msg_archive, bd.M0(2131754153, null), new Runnable() { // from class: org.telegram.ui.iv
                                @Override // java.lang.Runnable
                                public final void run() {
                                    int i232;
                                    switch (i30) {
                                        case 0:
                                            mvVar.P0.presentFragment(wm.ra(j10));
                                            break;
                                        case 1:
                                            org.telegram.messenger.g0.i3(new pu(mvVar.P0, j10, !r2.q4(), 0), 200L);
                                            break;
                                        case 2:
                                            org.telegram.messenger.g0.i3(new pu(mvVar.P0, j10, !r2.q4(), 0), 200L);
                                            break;
                                        case 3:
                                            uw uwVar2 = mvVar.P0;
                                            i232 = ((org.telegram.ui.ActionBar.d2) uwVar2).currentAccount;
                                            org.telegram.messenger.li b02 = org.telegram.messenger.li.b0(i232);
                                            long j11 = j10;
                                            b02.N1(j11);
                                            uwVar2.getMessagesController().P1().l0(j11, true, false);
                                            break;
                                        case 4:
                                            mvVar.P0.F0.j(j10);
                                            break;
                                        case 5:
                                            mvVar.P0.presentFragment(wm.ra(j10));
                                            break;
                                        default:
                                            mvVar.P0.presentFragment(ProfileActivity.A4(j10));
                                            break;
                                    }
                                }
                            }, z10 && !uwVar.q4());
                            f60Var.E();
                            final int i31 = 2;
                            f60Var.l(R.drawable.msg_unarchive, bd.M0(2131743924, null), new Runnable() { // from class: org.telegram.ui.iv
                                @Override // java.lang.Runnable
                                public final void run() {
                                    int i232;
                                    switch (i31) {
                                        case 0:
                                            mvVar.P0.presentFragment(wm.ra(j10));
                                            break;
                                        case 1:
                                            org.telegram.messenger.g0.i3(new pu(mvVar.P0, j10, !r2.q4(), 0), 200L);
                                            break;
                                        case 2:
                                            org.telegram.messenger.g0.i3(new pu(mvVar.P0, j10, !r2.q4(), 0), 200L);
                                            break;
                                        case 3:
                                            uw uwVar2 = mvVar.P0;
                                            i232 = ((org.telegram.ui.ActionBar.d2) uwVar2).currentAccount;
                                            org.telegram.messenger.li b02 = org.telegram.messenger.li.b0(i232);
                                            long j11 = j10;
                                            b02.N1(j11);
                                            uwVar2.getMessagesController().P1().l0(j11, true, false);
                                            break;
                                        case 4:
                                            mvVar.P0.F0.j(j10);
                                            break;
                                        case 5:
                                            mvVar.P0.presentFragment(wm.ra(j10));
                                            break;
                                        default:
                                            mvVar.P0.presentFragment(ProfileActivity.A4(j10));
                                            break;
                                    }
                                }
                            }, z10 && uwVar.q4());
                            f60Var.E();
                            i17 = 3;
                            f60Var.l(R.drawable.msg_delete, bd.M0(2131744758, null), new Runnable() { // from class: org.telegram.ui.iv
                                @Override // java.lang.Runnable
                                public final void run() {
                                    int i232;
                                    switch (i17) {
                                        case 0:
                                            mvVar.P0.presentFragment(wm.ra(j10));
                                            break;
                                        case 1:
                                            org.telegram.messenger.g0.i3(new pu(mvVar.P0, j10, !r2.q4(), 0), 200L);
                                            break;
                                        case 2:
                                            org.telegram.messenger.g0.i3(new pu(mvVar.P0, j10, !r2.q4(), 0), 200L);
                                            break;
                                        case 3:
                                            uw uwVar2 = mvVar.P0;
                                            i232 = ((org.telegram.ui.ActionBar.d2) uwVar2).currentAccount;
                                            org.telegram.messenger.li b02 = org.telegram.messenger.li.b0(i232);
                                            long j11 = j10;
                                            b02.N1(j11);
                                            uwVar2.getMessagesController().P1().l0(j11, true, false);
                                            break;
                                        case 4:
                                            mvVar.P0.F0.j(j10);
                                            break;
                                        case 5:
                                            mvVar.P0.presentFragment(wm.ra(j10));
                                            break;
                                        default:
                                            mvVar.P0.presentFragment(ProfileActivity.A4(j10));
                                            break;
                                    }
                                }
                            }, z10);
                        }
                    }
                    z10 = false;
                    f60 f60Var22 = uwVar.M0;
                    final int i232 = 5;
                    f60Var22.l(R.drawable.msg_discussion, bd.M0(2131745611, null), new Runnable() { // from class: org.telegram.ui.iv
                        @Override // java.lang.Runnable
                        public final void run() {
                            int i2322;
                            switch (i232) {
                                case 0:
                                    mvVar.P0.presentFragment(wm.ra(j10));
                                    break;
                                case 1:
                                    org.telegram.messenger.g0.i3(new pu(mvVar.P0, j10, !r2.q4(), 0), 200L);
                                    break;
                                case 2:
                                    org.telegram.messenger.g0.i3(new pu(mvVar.P0, j10, !r2.q4(), 0), 200L);
                                    break;
                                case 3:
                                    uw uwVar2 = mvVar.P0;
                                    i2322 = ((org.telegram.ui.ActionBar.d2) uwVar2).currentAccount;
                                    org.telegram.messenger.li b02 = org.telegram.messenger.li.b0(i2322);
                                    long j11 = j10;
                                    b02.N1(j11);
                                    uwVar2.getMessagesController().P1().l0(j11, true, false);
                                    break;
                                case 4:
                                    mvVar.P0.F0.j(j10);
                                    break;
                                case 5:
                                    mvVar.P0.presentFragment(wm.ra(j10));
                                    break;
                                default:
                                    mvVar.P0.presentFragment(ProfileActivity.A4(j10));
                                    break;
                            }
                        }
                    }, j10 <= 0);
                    final int i242 = 6;
                    f60Var22.l(R.drawable.msg_openprofile, bd.M0(2131747794, null), new Runnable() { // from class: org.telegram.ui.iv
                        @Override // java.lang.Runnable
                        public final void run() {
                            int i2322;
                            switch (i242) {
                                case 0:
                                    mvVar.P0.presentFragment(wm.ra(j10));
                                    break;
                                case 1:
                                    org.telegram.messenger.g0.i3(new pu(mvVar.P0, j10, !r2.q4(), 0), 200L);
                                    break;
                                case 2:
                                    org.telegram.messenger.g0.i3(new pu(mvVar.P0, j10, !r2.q4(), 0), 200L);
                                    break;
                                case 3:
                                    uw uwVar2 = mvVar.P0;
                                    i2322 = ((org.telegram.ui.ActionBar.d2) uwVar2).currentAccount;
                                    org.telegram.messenger.li b02 = org.telegram.messenger.li.b0(i2322);
                                    long j11 = j10;
                                    b02.N1(j11);
                                    uwVar2.getMessagesController().P1().l0(j11, true, false);
                                    break;
                                case 4:
                                    mvVar.P0.F0.j(j10);
                                    break;
                                case 5:
                                    mvVar.P0.presentFragment(wm.ra(j10));
                                    break;
                                default:
                                    mvVar.P0.presentFragment(ProfileActivity.A4(j10));
                                    break;
                            }
                        }
                    }, j10 <= 0);
                    final int i252 = 0;
                    f60Var22.l(R.drawable.msg_channel, bd.M0(!t3.V(chat) ? 2131747819 : 2131747807, null), new Runnable() { // from class: org.telegram.ui.iv
                        @Override // java.lang.Runnable
                        public final void run() {
                            int i2322;
                            switch (i252) {
                                case 0:
                                    mvVar.P0.presentFragment(wm.ra(j10));
                                    break;
                                case 1:
                                    org.telegram.messenger.g0.i3(new pu(mvVar.P0, j10, !r2.q4(), 0), 200L);
                                    break;
                                case 2:
                                    org.telegram.messenger.g0.i3(new pu(mvVar.P0, j10, !r2.q4(), 0), 200L);
                                    break;
                                case 3:
                                    uw uwVar2 = mvVar.P0;
                                    i2322 = ((org.telegram.ui.ActionBar.d2) uwVar2).currentAccount;
                                    org.telegram.messenger.li b02 = org.telegram.messenger.li.b0(i2322);
                                    long j11 = j10;
                                    b02.N1(j11);
                                    uwVar2.getMessagesController().P1().l0(j11, true, false);
                                    break;
                                case 4:
                                    mvVar.P0.F0.j(j10);
                                    break;
                                case 5:
                                    mvVar.P0.presentFragment(wm.ra(j10));
                                    break;
                                default:
                                    mvVar.P0.presentFragment(ProfileActivity.A4(j10));
                                    break;
                            }
                        }
                    }, j10 >= 0);
                    final int i262 = 0;
                    final String str22 = str;
                    f60Var22.l(R.drawable.msg_mute, bd.M0(2131747871, null), new Runnable() { // from class: org.telegram.ui.jv
                        @Override // java.lang.Runnable
                        public final void run() {
                            int i272;
                            String trim;
                            int i282;
                            int i292 = i262;
                            TLRPC.User user = a22;
                            String str3 = str22;
                            mv mvVar2 = mvVar;
                            switch (i292) {
                                case 0:
                                    uw uwVar2 = mvVar2.P0;
                                    i272 = ((org.telegram.ui.ActionBar.d2) uwVar2).currentAccount;
                                    org.telegram.messenger.hp.s1(i272).d7.edit().putBoolean("stories_" + str3, false).apply();
                                    uwVar2.getNotificationsController().c0(j10, 0L, true);
                                    trim = user != null ? user.first_name.trim() : "";
                                    int indexOf = trim.indexOf(" ");
                                    if (indexOf > 0) {
                                        trim = trim.substring(0, indexOf);
                                    }
                                    org.telegram.ui.Components.fc.a0(uwVar2).V(Arrays.asList(user), org.telegram.messenger.g0.X2(org.telegram.messenger.bd.a0("NotificationsStoryMutedHint", null, 2131747870, trim)), null, null).j();
                                    break;
                                default:
                                    uw uwVar3 = mvVar2.P0;
                                    i282 = ((org.telegram.ui.ActionBar.d2) uwVar3).currentAccount;
                                    org.telegram.messenger.hp.s1(i282).d7.edit().putBoolean("stories_" + str3, true).apply();
                                    uwVar3.getNotificationsController().c0(j10, 0L, true);
                                    trim = user != null ? user.first_name.trim() : "";
                                    int indexOf2 = trim.indexOf(" ");
                                    if (indexOf2 > 0) {
                                        trim = trim.substring(0, indexOf2);
                                    }
                                    org.telegram.ui.Components.fc.a0(uwVar3).V(Arrays.asList(user), org.telegram.messenger.g0.X2(org.telegram.messenger.bd.a0("NotificationsStoryUnmutedHint", null, 2131747867, trim)), null, null).j();
                                    break;
                            }
                        }
                    }, !h02 && j10 > 0);
                    f60Var22.E();
                    final int i272 = 1;
                    f60Var22.l(R.drawable.msg_unmute, bd.M0(2131747868, null), new Runnable() { // from class: org.telegram.ui.jv
                        @Override // java.lang.Runnable
                        public final void run() {
                            int i2722;
                            String trim;
                            int i282;
                            int i292 = i272;
                            TLRPC.User user = a22;
                            String str3 = str22;
                            mv mvVar2 = mvVar;
                            switch (i292) {
                                case 0:
                                    uw uwVar2 = mvVar2.P0;
                                    i2722 = ((org.telegram.ui.ActionBar.d2) uwVar2).currentAccount;
                                    org.telegram.messenger.hp.s1(i2722).d7.edit().putBoolean("stories_" + str3, false).apply();
                                    uwVar2.getNotificationsController().c0(j10, 0L, true);
                                    trim = user != null ? user.first_name.trim() : "";
                                    int indexOf = trim.indexOf(" ");
                                    if (indexOf > 0) {
                                        trim = trim.substring(0, indexOf);
                                    }
                                    org.telegram.ui.Components.fc.a0(uwVar2).V(Arrays.asList(user), org.telegram.messenger.g0.X2(org.telegram.messenger.bd.a0("NotificationsStoryMutedHint", null, 2131747870, trim)), null, null).j();
                                    break;
                                default:
                                    uw uwVar3 = mvVar2.P0;
                                    i282 = ((org.telegram.ui.ActionBar.d2) uwVar3).currentAccount;
                                    org.telegram.messenger.hp.s1(i282).d7.edit().putBoolean("stories_" + str3, true).apply();
                                    uwVar3.getNotificationsController().c0(j10, 0L, true);
                                    trim = user != null ? user.first_name.trim() : "";
                                    int indexOf2 = trim.indexOf(" ");
                                    if (indexOf2 > 0) {
                                        trim = trim.substring(0, indexOf2);
                                    }
                                    org.telegram.ui.Components.fc.a0(uwVar3).V(Arrays.asList(user), org.telegram.messenger.g0.X2(org.telegram.messenger.bd.a0("NotificationsStoryUnmutedHint", null, 2131747867, trim)), null, null).j();
                                    break;
                            }
                        }
                    }, h02 && j10 > 0);
                    f60Var22.E();
                    final int i282 = 0;
                    f60Var22.l(R.drawable.msg_stories_stealth2, bd.M0(2131743572, null), new Runnable() { // from class: org.telegram.ui.kv
                        @Override // java.lang.Runnable
                        public final void run() {
                            org.telegram.ui.ActionBar.e6 e6Var;
                            int i292;
                            org.telegram.ui.ActionBar.e6 e6Var2;
                            switch (i282) {
                                case 0:
                                    mv mvVar2 = mvVar;
                                    uw uwVar2 = mvVar2.P0;
                                    TL_stories.TL_storiesStealthMode tL_storiesStealthMode = org.telegram.messenger.hp.s1(org.telegram.messenger.h10.t0).P1().B;
                                    View view2 = view;
                                    if (tL_storiesStealthMode != null) {
                                        i292 = ((org.telegram.ui.ActionBar.d2) uwVar2).currentAccount;
                                        if (ConnectionsManager.getInstance(i292).getCurrentTime() < tL_storiesStealthMode.active_until_date) {
                                            if (view2 instanceof ei.q) {
                                                uwVar2.F0.i((ei.q) view2, false);
                                                break;
                                            }
                                        }
                                    }
                                    Context context = mvVar2.getContext();
                                    e6Var = ((org.telegram.ui.ActionBar.d2) uwVar2).resourceProvider;
                                    ei.w5 w5Var = new ei.w5(context, 0.0f, 1, e6Var);
                                    w5Var.m1 = new lv(mvVar2, view2, 1);
                                    uwVar2.showDialog(w5Var);
                                    break;
                                default:
                                    mv mvVar3 = mvVar;
                                    Context context2 = mvVar3.getContext();
                                    uw uwVar3 = mvVar3.P0;
                                    e6Var2 = ((org.telegram.ui.ActionBar.d2) uwVar3).resourceProvider;
                                    ei.w5 w5Var2 = new ei.w5(context2, 0.0f, 1, e6Var2);
                                    w5Var2.m1 = new lv(mvVar3, view, 0);
                                    uwVar3.showDialog(w5Var2);
                                    break;
                            }
                        }
                    }, D3 && j10 > 0 && q10 && L && !H2);
                    f60Var22.E();
                    if (D3) {
                    }
                    String M022 = bd.M0(2131743572, null);
                    final int i292 = 1;
                    Runnable runnable2 = new Runnable() { // from class: org.telegram.ui.kv
                        @Override // java.lang.Runnable
                        public final void run() {
                            org.telegram.ui.ActionBar.e6 e6Var;
                            int i2922;
                            org.telegram.ui.ActionBar.e6 e6Var2;
                            switch (i292) {
                                case 0:
                                    mv mvVar2 = mvVar;
                                    uw uwVar2 = mvVar2.P0;
                                    TL_stories.TL_storiesStealthMode tL_storiesStealthMode = org.telegram.messenger.hp.s1(org.telegram.messenger.h10.t0).P1().B;
                                    View view2 = view;
                                    if (tL_storiesStealthMode != null) {
                                        i2922 = ((org.telegram.ui.ActionBar.d2) uwVar2).currentAccount;
                                        if (ConnectionsManager.getInstance(i2922).getCurrentTime() < tL_storiesStealthMode.active_until_date) {
                                            if (view2 instanceof ei.q) {
                                                uwVar2.F0.i((ei.q) view2, false);
                                                break;
                                            }
                                        }
                                    }
                                    Context context = mvVar2.getContext();
                                    e6Var = ((org.telegram.ui.ActionBar.d2) uwVar2).resourceProvider;
                                    ei.w5 w5Var = new ei.w5(context, 0.0f, 1, e6Var);
                                    w5Var.m1 = new lv(mvVar2, view2, 1);
                                    uwVar2.showDialog(w5Var);
                                    break;
                                default:
                                    mv mvVar3 = mvVar;
                                    Context context2 = mvVar3.getContext();
                                    uw uwVar3 = mvVar3.P0;
                                    e6Var2 = ((org.telegram.ui.ActionBar.d2) uwVar3).resourceProvider;
                                    ei.w5 w5Var2 = new ei.w5(context2, 0.0f, 1, e6Var2);
                                    w5Var2.m1 = new lv(mvVar3, view, 0);
                                    uwVar3.showDialog(w5Var2);
                                    break;
                            }
                        }
                    };
                    if (z11) {
                    }
                    f60Var.E();
                    final int i302 = 1;
                    f60Var.l(R.drawable.msg_archive, bd.M0(2131754153, null), new Runnable() { // from class: org.telegram.ui.iv
                        @Override // java.lang.Runnable
                        public final void run() {
                            int i2322;
                            switch (i302) {
                                case 0:
                                    mvVar.P0.presentFragment(wm.ra(j10));
                                    break;
                                case 1:
                                    org.telegram.messenger.g0.i3(new pu(mvVar.P0, j10, !r2.q4(), 0), 200L);
                                    break;
                                case 2:
                                    org.telegram.messenger.g0.i3(new pu(mvVar.P0, j10, !r2.q4(), 0), 200L);
                                    break;
                                case 3:
                                    uw uwVar2 = mvVar.P0;
                                    i2322 = ((org.telegram.ui.ActionBar.d2) uwVar2).currentAccount;
                                    org.telegram.messenger.li b02 = org.telegram.messenger.li.b0(i2322);
                                    long j11 = j10;
                                    b02.N1(j11);
                                    uwVar2.getMessagesController().P1().l0(j11, true, false);
                                    break;
                                case 4:
                                    mvVar.P0.F0.j(j10);
                                    break;
                                case 5:
                                    mvVar.P0.presentFragment(wm.ra(j10));
                                    break;
                                default:
                                    mvVar.P0.presentFragment(ProfileActivity.A4(j10));
                                    break;
                            }
                        }
                    }, z10 && !uwVar.q4());
                    f60Var.E();
                    final int i312 = 2;
                    f60Var.l(R.drawable.msg_unarchive, bd.M0(2131743924, null), new Runnable() { // from class: org.telegram.ui.iv
                        @Override // java.lang.Runnable
                        public final void run() {
                            int i2322;
                            switch (i312) {
                                case 0:
                                    mvVar.P0.presentFragment(wm.ra(j10));
                                    break;
                                case 1:
                                    org.telegram.messenger.g0.i3(new pu(mvVar.P0, j10, !r2.q4(), 0), 200L);
                                    break;
                                case 2:
                                    org.telegram.messenger.g0.i3(new pu(mvVar.P0, j10, !r2.q4(), 0), 200L);
                                    break;
                                case 3:
                                    uw uwVar2 = mvVar.P0;
                                    i2322 = ((org.telegram.ui.ActionBar.d2) uwVar2).currentAccount;
                                    org.telegram.messenger.li b02 = org.telegram.messenger.li.b0(i2322);
                                    long j11 = j10;
                                    b02.N1(j11);
                                    uwVar2.getMessagesController().P1().l0(j11, true, false);
                                    break;
                                case 4:
                                    mvVar.P0.F0.j(j10);
                                    break;
                                case 5:
                                    mvVar.P0.presentFragment(wm.ra(j10));
                                    break;
                                default:
                                    mvVar.P0.presentFragment(ProfileActivity.A4(j10));
                                    break;
                            }
                        }
                    }, z10 && uwVar.q4());
                    f60Var.E();
                    i17 = 3;
                    f60Var.l(R.drawable.msg_delete, bd.M0(2131744758, null), new Runnable() { // from class: org.telegram.ui.iv
                        @Override // java.lang.Runnable
                        public final void run() {
                            int i2322;
                            switch (i17) {
                                case 0:
                                    mvVar.P0.presentFragment(wm.ra(j10));
                                    break;
                                case 1:
                                    org.telegram.messenger.g0.i3(new pu(mvVar.P0, j10, !r2.q4(), 0), 200L);
                                    break;
                                case 2:
                                    org.telegram.messenger.g0.i3(new pu(mvVar.P0, j10, !r2.q4(), 0), 200L);
                                    break;
                                case 3:
                                    uw uwVar2 = mvVar.P0;
                                    i2322 = ((org.telegram.ui.ActionBar.d2) uwVar2).currentAccount;
                                    org.telegram.messenger.li b02 = org.telegram.messenger.li.b0(i2322);
                                    long j11 = j10;
                                    b02.N1(j11);
                                    uwVar2.getMessagesController().P1().l0(j11, true, false);
                                    break;
                                case 4:
                                    mvVar.P0.F0.j(j10);
                                    break;
                                case 5:
                                    mvVar.P0.presentFragment(wm.ra(j10));
                                    break;
                                default:
                                    mvVar.P0.presentFragment(ProfileActivity.A4(j10));
                                    break;
                            }
                        }
                    }, z10);
                } else if (uwVar.O3) {
                    f60 f60Var3 = uwVar.M0;
                    String M03 = bd.M0(2131754384, null);
                    int i32 = k6.F8;
                    int i33 = k6.E8;
                    f60Var3.b(R.drawable.msg_stories_add, null, M03, i32, i33, new Runnable() { // from class: org.telegram.ui.hv
                        @Override // java.lang.Runnable
                        public final void run() {
                            int i34;
                            int i35;
                            switch (i19) {
                                case 0:
                                    mvVar.P0.F0.j(0L);
                                    break;
                                case 1:
                                    Bundle bundle = new Bundle();
                                    uw uwVar2 = mvVar.P0;
                                    i34 = ((org.telegram.ui.ActionBar.d2) uwVar2).currentAccount;
                                    bundle.putLong("dialog_id", org.telegram.messenger.h10.i(i34).e());
                                    bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                    bundle.putInt("start_from", 9);
                                    uwVar2.presentFragment(new org.telegram.ui.Components.r80(bundle, null));
                                    break;
                                default:
                                    Bundle bundle2 = new Bundle();
                                    uw uwVar3 = mvVar.P0;
                                    i35 = ((org.telegram.ui.ActionBar.d2) uwVar3).currentAccount;
                                    bundle2.putLong("dialog_id", org.telegram.messenger.h10.i(i35).e());
                                    bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                    uwVar3.presentFragment(new org.telegram.ui.Components.r80(bundle2, null));
                                    break;
                            }
                        }
                    });
                    uwVar.M0.b(R.drawable.msg_stories_archive, null, bd.M0(2131754123, null), i32, i33, new Runnable() { // from class: org.telegram.ui.hv
                        @Override // java.lang.Runnable
                        public final void run() {
                            int i34;
                            int i35;
                            switch (i20) {
                                case 0:
                                    mvVar.P0.F0.j(0L);
                                    break;
                                case 1:
                                    Bundle bundle = new Bundle();
                                    uw uwVar2 = mvVar.P0;
                                    i34 = ((org.telegram.ui.ActionBar.d2) uwVar2).currentAccount;
                                    bundle.putLong("dialog_id", org.telegram.messenger.h10.i(i34).e());
                                    bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                    bundle.putInt("start_from", 9);
                                    uwVar2.presentFragment(new org.telegram.ui.Components.r80(bundle, null));
                                    break;
                                default:
                                    Bundle bundle2 = new Bundle();
                                    uw uwVar3 = mvVar.P0;
                                    i35 = ((org.telegram.ui.ActionBar.d2) uwVar3).currentAccount;
                                    bundle2.putLong("dialog_id", org.telegram.messenger.h10.i(i35).e());
                                    bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                    uwVar3.presentFragment(new org.telegram.ui.Components.r80(bundle2, null));
                                    break;
                            }
                        }
                    });
                    uwVar.M0.b(R.drawable.msg_stories_saved, null, bd.M0(2131745895, null), i32, i33, new Runnable() { // from class: org.telegram.ui.hv
                        @Override // java.lang.Runnable
                        public final void run() {
                            int i34;
                            int i35;
                            switch (i21) {
                                case 0:
                                    mvVar.P0.F0.j(0L);
                                    break;
                                case 1:
                                    Bundle bundle = new Bundle();
                                    uw uwVar2 = mvVar.P0;
                                    i34 = ((org.telegram.ui.ActionBar.d2) uwVar2).currentAccount;
                                    bundle.putLong("dialog_id", org.telegram.messenger.h10.i(i34).e());
                                    bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                    bundle.putInt("start_from", 9);
                                    uwVar2.presentFragment(new org.telegram.ui.Components.r80(bundle, null));
                                    break;
                                default:
                                    Bundle bundle2 = new Bundle();
                                    uw uwVar3 = mvVar.P0;
                                    i35 = ((org.telegram.ui.ActionBar.d2) uwVar3).currentAccount;
                                    bundle2.putLong("dialog_id", org.telegram.messenger.h10.i(i35).e());
                                    bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                    uwVar3.presentFragment(new org.telegram.ui.Components.r80(bundle2, null));
                                    break;
                            }
                        }
                    });
                    i17 = 3;
                } else {
                    mv mvVar2 = uwVar.F0;
                    if (mvVar2 != null) {
                        mvVar2.n();
                    }
                }
                f60 f60Var4 = uwVar.M0;
                f60Var4.i = i17;
                f60Var4.a0(g0.L(-8.0f), g0.L(-10.0f));
                f60Var4.Z();
                return false;
            }
            p2.E.a();
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.p1
    public void g(org.telegram.ui.ActionBar.s1 s1Var, int i3) {
        switch (this.a) {
            case 3:
                ((k0) this.b).run();
                break;
            default:
                ((u10) this.b).a(s1Var.h(i3, true, true));
                break;
        }
    }

    @Override // cg.o
    public void h(long j10) {
        switch (this.a) {
            case 2:
                ((ai.i) this.b).a(j10, true);
                break;
            default:
                ((w5) this.b).h();
                break;
        }
    }

    @Override // ei.l9
    public void i(float f10, Canvas canvas, RectF rectF, boolean z10) {
        Path path = (Path) this.b;
        if (z10) {
            return;
        }
        path.rewind();
        float pow = (float) Math.pow(f10, 2.0d);
        path.addCircle((rectF.right + g0.L(7.0f)) - (g0.L(14.0f) * pow), (rectF.bottom + g0.L(7.0f)) - (g0.L(14.0f) * pow), g0.L(11.0f), Path.Direction.CW);
        canvas.clipPath(path, Region.Op.DIFFERENCE);
    }

    @Override // org.telegram.messenger.s10
    public void j(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        int i3;
        e6 e6Var;
        switch (this.a) {
            case 11:
                ci.u uVar = (ci.u) this.b;
                r31 r31Var = (r31) obj;
                v vVar = uVar.r;
                if (!(r31Var.G instanceof TL_stars.StarsTransaction)) {
                    if (uVar.h) {
                        uVar.h = false;
                        uVar.a();
                        break;
                    }
                } else {
                    Context context = uVar.getContext();
                    long j10 = vVar.b;
                    i3 = ((d2) vVar).currentAccount;
                    TL_stars.StarsTransaction starsTransaction = (TL_stars.StarsTransaction) r31Var.G;
                    e6Var = ((d2) vVar).resourceProvider;
                    wb.k1(context, true, j10, i3, starsTransaction, e6Var);
                    break;
                }
                break;
            case 16:
                e9.b((e9) this.b, (ArrayList) obj, (Integer) obj2, (Long) number, (ArrayList) serializable, (ArrayList) serializable2);
                break;
            default:
                tb tbVar = (tb) this.b;
                r31 r31Var2 = (r31) obj;
                if (r31Var2.G instanceof TL_stars.StarsTransaction) {
                    wb.k1(tbVar.getContext(), false, 0L, tbVar.c, (TL_stars.StarsTransaction) r31Var2.G, tbVar.b);
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.messenger.q1
    public void k(e5.f fVar, List list) {
        int i3;
        b3 b3Var = (b3) this.b;
        ArrayList arrayList = b3Var.f2;
        Iterator it = list.iterator();
        long j10 = 0;
        while (true) {
            i3 = 0;
            if (!it.hasNext()) {
                break;
            }
            l lVar = (l) it.next();
            int size = arrayList.size();
            while (true) {
                if (i3 < size) {
                    Object obj = arrayList.get(i3);
                    i3++;
                    vg.j jVar = (vg.j) obj;
                    if (jVar.h() != null && jVar.h().equals(lVar.c)) {
                        jVar.h = lVar;
                        if (jVar.f() > j10) {
                            j10 = jVar.f();
                        }
                    }
                }
            }
        }
        int size2 = arrayList.size();
        while (i3 < size2) {
            Object obj2 = arrayList.get(i3);
            i3++;
            ((vg.j) obj2).g = j10;
        }
        g0.h3(new s(b3Var, 2));
    }

    @Override // yh.j
    public void l(yh.f fVar, float f10, float f11) {
        f8 f8Var = (f8) this.b;
        if (f8Var.v.y) {
            return;
        }
        fVar.q = new e8(f8Var, 2);
        float sqrt = (float) Math.sqrt(Math.pow(r1.getHeight(), 2.0d) + Math.pow(r1.getWidth(), 2.0d));
        ArrayList arrayList = f8Var.i;
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            ((yh.f) obj).j(f10, f11, sqrt, false);
        }
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        switch (this.a) {
            case 0:
                ((b) this.b).invoke(obj);
                break;
            case 8:
                ((b1.e) this.b).invoke(obj);
                break;
            case 21:
                ((b1.e) this.b).invoke(obj);
                break;
            default:
                ((e1.b) this.b).invoke(obj);
                break;
        }
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        return (Task) ((z9.k) this.b).call();
    }

    @Override // qe.b
    public /* synthetic */ void F(float f10, int i3) {
    }

    @Override // org.telegram.ui.Components.gj0
    public /* synthetic */ void r0(View view, float f10, float f11) {
    }
}
