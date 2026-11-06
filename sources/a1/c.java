package a1;

import a3.n;
import a3.p;
import a8.b8;
import a8.r7;
import aa.o;
import ab.m0;
import ab.o0;
import android.content.Context;
import android.content.Intent;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import bi.ad;
import bi.dd;
import bi.e1;
import bi.ea;
import bi.m7;
import bi.mc;
import bi.q1;
import bi.u6;
import bi.y;
import bi.z;
import com.google.android.gms.common.api.h;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import db.m;
import db.q;
import db.r;
import db.t;
import db.u;
import di.g1;
import di.g2;
import di.r0;
import di.s0;
import di.u0;
import e2.m1;
import h2.j;
import h9.f0;
import h9.i0;
import h9.t1;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ScheduledFuture;
import k2.i;
import org.scilab.forge.jlatexmath.TeXSymbolParser;
import org.telegram.messenger.a20;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.c20;
import org.telegram.messenger.d1;
import org.telegram.messenger.dt;
import org.telegram.messenger.g0;
import org.telegram.messenger.hd;
import org.telegram.messenger.p10;
import org.telegram.messenger.p2;
import org.telegram.messenger.qp;
import org.telegram.messenger.t10;
import org.telegram.messenger.t3;
import org.telegram.messenger.ui;
import org.telegram.messenger.v10;
import org.telegram.messenger.w10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.f2;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r1;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.ActionBar.u1;
import org.telegram.ui.Cells.t0;
import org.telegram.ui.Components.cj0;
import org.telegram.ui.Components.dj0;
import org.telegram.ui.Components.k60;
import org.telegram.ui.Components.t4;
import org.telegram.ui.Components.x31;
import org.telegram.ui.Components.xp;
import org.telegram.ui.NotificationsCustomSettingsActivity;
import org.telegram.ui.Wallet.v1;
import org.telegram.ui.gl0;
import org.telegram.ui.pv;
import org.telegram.ui.ww;
import v4.l0;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final /* synthetic */ class c implements OnSuccessListener, p, Continuation, OnCompleteListener, a20, t4, r1, bg.p, te.b, gl0, j, i, com.google.android.gms.common.api.internal.p, dj0, w10, cj0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ c(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // org.telegram.ui.Components.t4
    public void L(int i7, int i10, boolean z9) {
        e1 e1Var = (e1) this.b;
        if (z9) {
            long j3 = i7;
            if (e1Var.z1 != j3) {
                e1Var.z1 = j3;
                e1Var.p1.setText(e1.K0(j3));
            }
            e1Var.J0(true);
        }
    }

    @Override // te.b
    public void Y(int i7, float f10, float f11, te.c cVar) {
        View view = ((m7) this.b).b;
        if (view instanceof t0) {
            ((t0) view).T();
        } else {
            view.invalidate();
        }
    }

    @Override // k2.i
    public void a(k2.j jVar) {
        d4.j jVar2 = (d4.j) this.b;
        d4.i iVar = (d4.i) jVar;
        iVar.clear();
        jVar2.b.add(iVar);
    }

    @Override // com.google.android.gms.common.api.internal.p
    public void accept(Object obj, Object obj2) {
        q qVar = (q) this.b;
        db.p clientImpl = (db.p) obj;
        kotlin.jvm.internal.j.e(clientImpl, "clientImpl");
        u uVar = new u((TaskCompletionSource) obj2);
        t tVar = (t) clientImpl.n();
        com.google.android.gms.common.api.g gVar = new com.google.android.gms.common.api.g(new h(-1, -1, 0, true), false);
        gVar.c = false;
        r rVar = (r) tVar;
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken("com.google.firebase.pnv.internal.IFpnvService");
        int i7 = db.e.a;
        obtain.writeStrongBinder(uVar);
        obtain.writeInt(1);
        qVar.writeToParcel(obtain, 0);
        obtain.writeInt(1);
        gVar.writeToParcel(obtain, 0);
        Parcel obtain2 = Parcel.obtain();
        try {
            rVar.a.transact(3, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain.recycle();
            obtain2.recycle();
        }
    }

    @Override // org.telegram.ui.gl0
    public void b(int i7) {
        switch (this.a) {
            case 16:
                v10 v10Var = (v10) this.b;
                if (i7 != 1) {
                    if (i7 != 3) {
                        v10Var.a(Boolean.FALSE, null);
                        break;
                    }
                } else {
                    v10Var.a(Boolean.TRUE, null);
                    break;
                }
                break;
            case 17:
                v1 v1Var = (v1) this.b;
                if (i7 != 1) {
                    if (i7 != 3) {
                        v1Var.a(Boolean.FALSE, null);
                        break;
                    }
                } else {
                    v1Var.a(Boolean.TRUE, null);
                    break;
                }
                break;
            default:
                mc mcVar = (mc) this.b;
                if (i7 != 1) {
                    if (i7 != 3) {
                        mcVar.a(Boolean.FALSE, null);
                        break;
                    }
                } else {
                    mcVar.a(Boolean.TRUE, null);
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
    @Override // org.telegram.ui.Components.dj0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean c(int i7, final View view) {
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
        boolean z9;
        boolean z10;
        k60 k60Var;
        final int i17;
        int i18;
        Drawable drawable;
        final pv pvVar = (pv) this.b;
        final int i19 = 0;
        if (pvVar.N == 0.0f && pvVar.n0 == 0.0f) {
            final long j3 = ((di.p) view).E;
            ww wwVar = pvVar.O0;
            i10 = ((f2) wwVar).currentAccount;
            final int i20 = 1;
            ui.b0(i10).M0(true);
            k60 H = k60.H(wwVar, view);
            H.z.set(0, g0.L(8.0f), 0, 0);
            H.W(k6.e0(g0.L(12.0f), g0.L(12.0f), wwVar.getThemedColor(k6.d6)));
            H.a0(0.0f, g0.L(8.0f));
            wwVar.L0 = H;
            if (!t10.A(j3)) {
                try {
                    view.performHapticFeedback(0);
                } catch (Exception unused) {
                }
                i11 = ((f2) wwVar).currentAccount;
                final int i21 = 2;
                if (j3 != p10.i(i11).e()) {
                    final TLRPC.User a22 = wwVar.getMessagesController().a2(Long.valueOf(j3));
                    TLRPC.Chat M0 = wwVar.getMessagesController().M0(Long.valueOf(-j3));
                    String v = dt.v(j3, 0L, false);
                    i12 = ((f2) wwVar).currentAccount;
                    boolean h02 = NotificationsCustomSettingsActivity.h0(i12, j3);
                    i13 = ((f2) wwVar).currentAccount;
                    boolean D3 = qp.s1(i13).D3();
                    i14 = ((f2) wwVar).currentAccount;
                    boolean q10 = p10.i(i14).q();
                    i15 = ((f2) wwVar).currentAccount;
                    boolean L = qp.s1(i15).P1().L(j3);
                    i16 = ((f2) wwVar).currentAccount;
                    boolean H2 = qp.s1(i16).P1().H(j3);
                    if (D3 || j3 <= 0 || q10 || (drawable = pvVar.getContext().getDrawable(R.drawable.msg_gallery_locked2)) == null) {
                        chat = M0;
                        str = v;
                        xpVar = null;
                    } else {
                        Drawable drawable2 = pvVar.getContext().getDrawable(R.drawable.msg_stealth_locked);
                        if (drawable2 != null) {
                            chat = M0;
                            r6.y(pvVar, drawable2, k6.F8, wwVar.getResourceProvider(), PorterDuff.Mode.MULTIPLY);
                        } else {
                            chat = M0;
                        }
                        str = v;
                        drawable.setColorFilter(new PorterDuffColorFilter(i0.a.f(0.5f, -1, -16777216), PorterDuff.Mode.MULTIPLY));
                        xpVar = new xp(drawable2, drawable);
                    }
                    if (j3 < 0 && wwVar.j4().j(j3)) {
                        final int i22 = 4;
                        wwVar.L0.b(R.drawable.msg_stories_add, null, hd.M0(2131754384, null), k6.F8, k6.E8, new Runnable() { // from class: org.telegram.ui.lv
                            @Override // java.lang.Runnable
                            public final void run() {
                                int i23;
                                switch (i22) {
                                    case 0:
                                        pvVar.O0.presentFragment(an.ra(j3));
                                        break;
                                    case 1:
                                        org.telegram.messenger.g0.i3(new su(pvVar.O0, j3, !r2.q4(), 0), 200L);
                                        break;
                                    case 2:
                                        org.telegram.messenger.g0.i3(new su(pvVar.O0, j3, !r2.q4(), 0), 200L);
                                        break;
                                    case 3:
                                        ww wwVar2 = pvVar.O0;
                                        i23 = ((org.telegram.ui.ActionBar.f2) wwVar2).currentAccount;
                                        org.telegram.messenger.ui b02 = org.telegram.messenger.ui.b0(i23);
                                        long j10 = j3;
                                        b02.N1(j10);
                                        wwVar2.getMessagesController().P1().l0(j10, true, false);
                                        break;
                                    case 4:
                                        pvVar.O0.E0.j(j3);
                                        break;
                                    case 5:
                                        pvVar.O0.presentFragment(an.ra(j3));
                                        break;
                                    default:
                                        pvVar.O0.presentFragment(ProfileActivity.A4(j3));
                                        break;
                                }
                            }
                        });
                    }
                    if (a22 != null && !a22.contact) {
                        i18 = ((f2) wwVar).currentAccount;
                        if (ui.b0(i18).G(j3)) {
                            z9 = true;
                            k60 k60Var2 = wwVar.L0;
                            final int i23 = 5;
                            k60Var2.l(R.drawable.msg_discussion, hd.M0(2131745602, null), new Runnable() { // from class: org.telegram.ui.lv
                                @Override // java.lang.Runnable
                                public final void run() {
                                    int i232;
                                    switch (i23) {
                                        case 0:
                                            pvVar.O0.presentFragment(an.ra(j3));
                                            break;
                                        case 1:
                                            org.telegram.messenger.g0.i3(new su(pvVar.O0, j3, !r2.q4(), 0), 200L);
                                            break;
                                        case 2:
                                            org.telegram.messenger.g0.i3(new su(pvVar.O0, j3, !r2.q4(), 0), 200L);
                                            break;
                                        case 3:
                                            ww wwVar2 = pvVar.O0;
                                            i232 = ((org.telegram.ui.ActionBar.f2) wwVar2).currentAccount;
                                            org.telegram.messenger.ui b02 = org.telegram.messenger.ui.b0(i232);
                                            long j10 = j3;
                                            b02.N1(j10);
                                            wwVar2.getMessagesController().P1().l0(j10, true, false);
                                            break;
                                        case 4:
                                            pvVar.O0.E0.j(j3);
                                            break;
                                        case 5:
                                            pvVar.O0.presentFragment(an.ra(j3));
                                            break;
                                        default:
                                            pvVar.O0.presentFragment(ProfileActivity.A4(j3));
                                            break;
                                    }
                                }
                            }, j3 <= 0);
                            final int i24 = 6;
                            k60Var2.l(R.drawable.msg_openprofile, hd.M0(2131747785, null), new Runnable() { // from class: org.telegram.ui.lv
                                @Override // java.lang.Runnable
                                public final void run() {
                                    int i232;
                                    switch (i24) {
                                        case 0:
                                            pvVar.O0.presentFragment(an.ra(j3));
                                            break;
                                        case 1:
                                            org.telegram.messenger.g0.i3(new su(pvVar.O0, j3, !r2.q4(), 0), 200L);
                                            break;
                                        case 2:
                                            org.telegram.messenger.g0.i3(new su(pvVar.O0, j3, !r2.q4(), 0), 200L);
                                            break;
                                        case 3:
                                            ww wwVar2 = pvVar.O0;
                                            i232 = ((org.telegram.ui.ActionBar.f2) wwVar2).currentAccount;
                                            org.telegram.messenger.ui b02 = org.telegram.messenger.ui.b0(i232);
                                            long j10 = j3;
                                            b02.N1(j10);
                                            wwVar2.getMessagesController().P1().l0(j10, true, false);
                                            break;
                                        case 4:
                                            pvVar.O0.E0.j(j3);
                                            break;
                                        case 5:
                                            pvVar.O0.presentFragment(an.ra(j3));
                                            break;
                                        default:
                                            pvVar.O0.presentFragment(ProfileActivity.A4(j3));
                                            break;
                                    }
                                }
                            }, j3 <= 0);
                            final int i25 = 0;
                            k60Var2.l(R.drawable.msg_channel, hd.M0(!t3.V(chat) ? 2131747810 : 2131747798, null), new Runnable() { // from class: org.telegram.ui.lv
                                @Override // java.lang.Runnable
                                public final void run() {
                                    int i232;
                                    switch (i25) {
                                        case 0:
                                            pvVar.O0.presentFragment(an.ra(j3));
                                            break;
                                        case 1:
                                            org.telegram.messenger.g0.i3(new su(pvVar.O0, j3, !r2.q4(), 0), 200L);
                                            break;
                                        case 2:
                                            org.telegram.messenger.g0.i3(new su(pvVar.O0, j3, !r2.q4(), 0), 200L);
                                            break;
                                        case 3:
                                            ww wwVar2 = pvVar.O0;
                                            i232 = ((org.telegram.ui.ActionBar.f2) wwVar2).currentAccount;
                                            org.telegram.messenger.ui b02 = org.telegram.messenger.ui.b0(i232);
                                            long j10 = j3;
                                            b02.N1(j10);
                                            wwVar2.getMessagesController().P1().l0(j10, true, false);
                                            break;
                                        case 4:
                                            pvVar.O0.E0.j(j3);
                                            break;
                                        case 5:
                                            pvVar.O0.presentFragment(an.ra(j3));
                                            break;
                                        default:
                                            pvVar.O0.presentFragment(ProfileActivity.A4(j3));
                                            break;
                                    }
                                }
                            }, j3 >= 0);
                            final int i26 = 0;
                            final String str2 = str;
                            k60Var2.l(R.drawable.msg_mute, hd.M0(2131747862, null), new Runnable() { // from class: org.telegram.ui.mv
                                @Override // java.lang.Runnable
                                public final void run() {
                                    int i27;
                                    String trim;
                                    int i28;
                                    int i29 = i26;
                                    TLRPC.User user = a22;
                                    String str3 = str2;
                                    pv pvVar2 = pvVar;
                                    switch (i29) {
                                        case 0:
                                            ww wwVar2 = pvVar2.O0;
                                            i27 = ((org.telegram.ui.ActionBar.f2) wwVar2).currentAccount;
                                            org.telegram.messenger.qp.s1(i27).d7.edit().putBoolean("stories_" + str3, false).apply();
                                            wwVar2.getNotificationsController().c0(j3, 0L, true);
                                            trim = user != null ? user.first_name.trim() : "";
                                            int indexOf = trim.indexOf(" ");
                                            if (indexOf > 0) {
                                                trim = trim.substring(0, indexOf);
                                            }
                                            org.telegram.ui.Components.hc.a0(wwVar2).V(Arrays.asList(user), org.telegram.messenger.g0.X2(org.telegram.messenger.hd.a0("NotificationsStoryMutedHint", null, 2131747861, trim)), null, null).j();
                                            break;
                                        default:
                                            ww wwVar3 = pvVar2.O0;
                                            i28 = ((org.telegram.ui.ActionBar.f2) wwVar3).currentAccount;
                                            org.telegram.messenger.qp.s1(i28).d7.edit().putBoolean("stories_" + str3, true).apply();
                                            wwVar3.getNotificationsController().c0(j3, 0L, true);
                                            trim = user != null ? user.first_name.trim() : "";
                                            int indexOf2 = trim.indexOf(" ");
                                            if (indexOf2 > 0) {
                                                trim = trim.substring(0, indexOf2);
                                            }
                                            org.telegram.ui.Components.hc.a0(wwVar3).V(Arrays.asList(user), org.telegram.messenger.g0.X2(org.telegram.messenger.hd.a0("NotificationsStoryUnmutedHint", null, 2131747858, trim)), null, null).j();
                                            break;
                                    }
                                }
                            }, !h02 && j3 > 0);
                            k60Var2.E();
                            final int i27 = 1;
                            k60Var2.l(R.drawable.msg_unmute, hd.M0(2131747859, null), new Runnable() { // from class: org.telegram.ui.mv
                                @Override // java.lang.Runnable
                                public final void run() {
                                    int i272;
                                    String trim;
                                    int i28;
                                    int i29 = i27;
                                    TLRPC.User user = a22;
                                    String str3 = str2;
                                    pv pvVar2 = pvVar;
                                    switch (i29) {
                                        case 0:
                                            ww wwVar2 = pvVar2.O0;
                                            i272 = ((org.telegram.ui.ActionBar.f2) wwVar2).currentAccount;
                                            org.telegram.messenger.qp.s1(i272).d7.edit().putBoolean("stories_" + str3, false).apply();
                                            wwVar2.getNotificationsController().c0(j3, 0L, true);
                                            trim = user != null ? user.first_name.trim() : "";
                                            int indexOf = trim.indexOf(" ");
                                            if (indexOf > 0) {
                                                trim = trim.substring(0, indexOf);
                                            }
                                            org.telegram.ui.Components.hc.a0(wwVar2).V(Arrays.asList(user), org.telegram.messenger.g0.X2(org.telegram.messenger.hd.a0("NotificationsStoryMutedHint", null, 2131747861, trim)), null, null).j();
                                            break;
                                        default:
                                            ww wwVar3 = pvVar2.O0;
                                            i28 = ((org.telegram.ui.ActionBar.f2) wwVar3).currentAccount;
                                            org.telegram.messenger.qp.s1(i28).d7.edit().putBoolean("stories_" + str3, true).apply();
                                            wwVar3.getNotificationsController().c0(j3, 0L, true);
                                            trim = user != null ? user.first_name.trim() : "";
                                            int indexOf2 = trim.indexOf(" ");
                                            if (indexOf2 > 0) {
                                                trim = trim.substring(0, indexOf2);
                                            }
                                            org.telegram.ui.Components.hc.a0(wwVar3).V(Arrays.asList(user), org.telegram.messenger.g0.X2(org.telegram.messenger.hd.a0("NotificationsStoryUnmutedHint", null, 2131747858, trim)), null, null).j();
                                            break;
                                    }
                                }
                            }, h02 && j3 > 0);
                            k60Var2.E();
                            final int i28 = 0;
                            k60Var2.l(R.drawable.msg_stories_stealth2, hd.M0(2131743563, null), new Runnable() { // from class: org.telegram.ui.nv
                                @Override // java.lang.Runnable
                                public final void run() {
                                    org.telegram.ui.ActionBar.f6 f6Var;
                                    int i29;
                                    org.telegram.ui.ActionBar.f6 f6Var2;
                                    switch (i28) {
                                        case 0:
                                            pv pvVar2 = pvVar;
                                            ww wwVar2 = pvVar2.O0;
                                            TL_stories.TL_storiesStealthMode tL_storiesStealthMode = org.telegram.messenger.qp.s1(org.telegram.messenger.p10.s0).P1().B;
                                            View view2 = view;
                                            if (tL_storiesStealthMode != null) {
                                                i29 = ((org.telegram.ui.ActionBar.f2) wwVar2).currentAccount;
                                                if (ConnectionsManager.getInstance(i29).getCurrentTime() < tL_storiesStealthMode.active_until_date) {
                                                    if (view2 instanceof di.p) {
                                                        wwVar2.E0.i((di.p) view2, false);
                                                        break;
                                                    }
                                                }
                                            }
                                            Context context = pvVar2.getContext();
                                            f6Var = ((org.telegram.ui.ActionBar.f2) wwVar2).resourceProvider;
                                            di.w5 w5Var = new di.w5(context, 0.0f, 1, f6Var);
                                            w5Var.l1 = new ov(pvVar2, view2, 1);
                                            wwVar2.showDialog(w5Var);
                                            break;
                                        default:
                                            pv pvVar3 = pvVar;
                                            Context context2 = pvVar3.getContext();
                                            ww wwVar3 = pvVar3.O0;
                                            f6Var2 = ((org.telegram.ui.ActionBar.f2) wwVar3).resourceProvider;
                                            di.w5 w5Var2 = new di.w5(context2, 0.0f, 1, f6Var2);
                                            w5Var2.l1 = new ov(pvVar3, view, 0);
                                            wwVar3.showDialog(w5Var2);
                                            break;
                                    }
                                }
                            }, D3 && j3 > 0 && q10 && L && !H2);
                            k60Var2.E();
                            z10 = D3 && j3 > 0 && !q10 && L && !H2;
                            String M02 = hd.M0(2131743563, null);
                            final int i29 = 1;
                            Runnable runnable = new Runnable() { // from class: org.telegram.ui.nv
                                @Override // java.lang.Runnable
                                public final void run() {
                                    org.telegram.ui.ActionBar.f6 f6Var;
                                    int i292;
                                    org.telegram.ui.ActionBar.f6 f6Var2;
                                    switch (i29) {
                                        case 0:
                                            pv pvVar2 = pvVar;
                                            ww wwVar2 = pvVar2.O0;
                                            TL_stories.TL_storiesStealthMode tL_storiesStealthMode = org.telegram.messenger.qp.s1(org.telegram.messenger.p10.s0).P1().B;
                                            View view2 = view;
                                            if (tL_storiesStealthMode != null) {
                                                i292 = ((org.telegram.ui.ActionBar.f2) wwVar2).currentAccount;
                                                if (ConnectionsManager.getInstance(i292).getCurrentTime() < tL_storiesStealthMode.active_until_date) {
                                                    if (view2 instanceof di.p) {
                                                        wwVar2.E0.i((di.p) view2, false);
                                                        break;
                                                    }
                                                }
                                            }
                                            Context context = pvVar2.getContext();
                                            f6Var = ((org.telegram.ui.ActionBar.f2) wwVar2).resourceProvider;
                                            di.w5 w5Var = new di.w5(context, 0.0f, 1, f6Var);
                                            w5Var.l1 = new ov(pvVar2, view2, 1);
                                            wwVar2.showDialog(w5Var);
                                            break;
                                        default:
                                            pv pvVar3 = pvVar;
                                            Context context2 = pvVar3.getContext();
                                            ww wwVar3 = pvVar3.O0;
                                            f6Var2 = ((org.telegram.ui.ActionBar.f2) wwVar3).resourceProvider;
                                            di.w5 w5Var2 = new di.w5(context2, 0.0f, 1, f6Var2);
                                            w5Var2.l1 = new ov(pvVar3, view, 0);
                                            wwVar3.showDialog(w5Var2);
                                            break;
                                    }
                                }
                            };
                            if (z10) {
                                k60Var = k60Var2;
                            } else {
                                k60Var2.b(R.drawable.msg_stories_stealth2, xpVar, M02, k6.F8, k6.E8, runnable);
                                k60Var = k60Var2;
                            }
                            k60Var.E();
                            final int i30 = 1;
                            k60Var.l(R.drawable.msg_archive, hd.M0(2131754153, null), new Runnable() { // from class: org.telegram.ui.lv
                                @Override // java.lang.Runnable
                                public final void run() {
                                    int i232;
                                    switch (i30) {
                                        case 0:
                                            pvVar.O0.presentFragment(an.ra(j3));
                                            break;
                                        case 1:
                                            org.telegram.messenger.g0.i3(new su(pvVar.O0, j3, !r2.q4(), 0), 200L);
                                            break;
                                        case 2:
                                            org.telegram.messenger.g0.i3(new su(pvVar.O0, j3, !r2.q4(), 0), 200L);
                                            break;
                                        case 3:
                                            ww wwVar2 = pvVar.O0;
                                            i232 = ((org.telegram.ui.ActionBar.f2) wwVar2).currentAccount;
                                            org.telegram.messenger.ui b02 = org.telegram.messenger.ui.b0(i232);
                                            long j10 = j3;
                                            b02.N1(j10);
                                            wwVar2.getMessagesController().P1().l0(j10, true, false);
                                            break;
                                        case 4:
                                            pvVar.O0.E0.j(j3);
                                            break;
                                        case 5:
                                            pvVar.O0.presentFragment(an.ra(j3));
                                            break;
                                        default:
                                            pvVar.O0.presentFragment(ProfileActivity.A4(j3));
                                            break;
                                    }
                                }
                            }, z9 && !wwVar.q4());
                            k60Var.E();
                            final int i31 = 2;
                            k60Var.l(R.drawable.msg_unarchive, hd.M0(2131743915, null), new Runnable() { // from class: org.telegram.ui.lv
                                @Override // java.lang.Runnable
                                public final void run() {
                                    int i232;
                                    switch (i31) {
                                        case 0:
                                            pvVar.O0.presentFragment(an.ra(j3));
                                            break;
                                        case 1:
                                            org.telegram.messenger.g0.i3(new su(pvVar.O0, j3, !r2.q4(), 0), 200L);
                                            break;
                                        case 2:
                                            org.telegram.messenger.g0.i3(new su(pvVar.O0, j3, !r2.q4(), 0), 200L);
                                            break;
                                        case 3:
                                            ww wwVar2 = pvVar.O0;
                                            i232 = ((org.telegram.ui.ActionBar.f2) wwVar2).currentAccount;
                                            org.telegram.messenger.ui b02 = org.telegram.messenger.ui.b0(i232);
                                            long j10 = j3;
                                            b02.N1(j10);
                                            wwVar2.getMessagesController().P1().l0(j10, true, false);
                                            break;
                                        case 4:
                                            pvVar.O0.E0.j(j3);
                                            break;
                                        case 5:
                                            pvVar.O0.presentFragment(an.ra(j3));
                                            break;
                                        default:
                                            pvVar.O0.presentFragment(ProfileActivity.A4(j3));
                                            break;
                                    }
                                }
                            }, z9 && wwVar.q4());
                            k60Var.E();
                            i17 = 3;
                            k60Var.l(R.drawable.msg_delete, hd.M0(2131744749, null), new Runnable() { // from class: org.telegram.ui.lv
                                @Override // java.lang.Runnable
                                public final void run() {
                                    int i232;
                                    switch (i17) {
                                        case 0:
                                            pvVar.O0.presentFragment(an.ra(j3));
                                            break;
                                        case 1:
                                            org.telegram.messenger.g0.i3(new su(pvVar.O0, j3, !r2.q4(), 0), 200L);
                                            break;
                                        case 2:
                                            org.telegram.messenger.g0.i3(new su(pvVar.O0, j3, !r2.q4(), 0), 200L);
                                            break;
                                        case 3:
                                            ww wwVar2 = pvVar.O0;
                                            i232 = ((org.telegram.ui.ActionBar.f2) wwVar2).currentAccount;
                                            org.telegram.messenger.ui b02 = org.telegram.messenger.ui.b0(i232);
                                            long j10 = j3;
                                            b02.N1(j10);
                                            wwVar2.getMessagesController().P1().l0(j10, true, false);
                                            break;
                                        case 4:
                                            pvVar.O0.E0.j(j3);
                                            break;
                                        case 5:
                                            pvVar.O0.presentFragment(an.ra(j3));
                                            break;
                                        default:
                                            pvVar.O0.presentFragment(ProfileActivity.A4(j3));
                                            break;
                                    }
                                }
                            }, z9);
                        }
                    }
                    z9 = false;
                    k60 k60Var22 = wwVar.L0;
                    final int i232 = 5;
                    k60Var22.l(R.drawable.msg_discussion, hd.M0(2131745602, null), new Runnable() { // from class: org.telegram.ui.lv
                        @Override // java.lang.Runnable
                        public final void run() {
                            int i2322;
                            switch (i232) {
                                case 0:
                                    pvVar.O0.presentFragment(an.ra(j3));
                                    break;
                                case 1:
                                    org.telegram.messenger.g0.i3(new su(pvVar.O0, j3, !r2.q4(), 0), 200L);
                                    break;
                                case 2:
                                    org.telegram.messenger.g0.i3(new su(pvVar.O0, j3, !r2.q4(), 0), 200L);
                                    break;
                                case 3:
                                    ww wwVar2 = pvVar.O0;
                                    i2322 = ((org.telegram.ui.ActionBar.f2) wwVar2).currentAccount;
                                    org.telegram.messenger.ui b02 = org.telegram.messenger.ui.b0(i2322);
                                    long j10 = j3;
                                    b02.N1(j10);
                                    wwVar2.getMessagesController().P1().l0(j10, true, false);
                                    break;
                                case 4:
                                    pvVar.O0.E0.j(j3);
                                    break;
                                case 5:
                                    pvVar.O0.presentFragment(an.ra(j3));
                                    break;
                                default:
                                    pvVar.O0.presentFragment(ProfileActivity.A4(j3));
                                    break;
                            }
                        }
                    }, j3 <= 0);
                    final int i242 = 6;
                    k60Var22.l(R.drawable.msg_openprofile, hd.M0(2131747785, null), new Runnable() { // from class: org.telegram.ui.lv
                        @Override // java.lang.Runnable
                        public final void run() {
                            int i2322;
                            switch (i242) {
                                case 0:
                                    pvVar.O0.presentFragment(an.ra(j3));
                                    break;
                                case 1:
                                    org.telegram.messenger.g0.i3(new su(pvVar.O0, j3, !r2.q4(), 0), 200L);
                                    break;
                                case 2:
                                    org.telegram.messenger.g0.i3(new su(pvVar.O0, j3, !r2.q4(), 0), 200L);
                                    break;
                                case 3:
                                    ww wwVar2 = pvVar.O0;
                                    i2322 = ((org.telegram.ui.ActionBar.f2) wwVar2).currentAccount;
                                    org.telegram.messenger.ui b02 = org.telegram.messenger.ui.b0(i2322);
                                    long j10 = j3;
                                    b02.N1(j10);
                                    wwVar2.getMessagesController().P1().l0(j10, true, false);
                                    break;
                                case 4:
                                    pvVar.O0.E0.j(j3);
                                    break;
                                case 5:
                                    pvVar.O0.presentFragment(an.ra(j3));
                                    break;
                                default:
                                    pvVar.O0.presentFragment(ProfileActivity.A4(j3));
                                    break;
                            }
                        }
                    }, j3 <= 0);
                    final int i252 = 0;
                    k60Var22.l(R.drawable.msg_channel, hd.M0(!t3.V(chat) ? 2131747810 : 2131747798, null), new Runnable() { // from class: org.telegram.ui.lv
                        @Override // java.lang.Runnable
                        public final void run() {
                            int i2322;
                            switch (i252) {
                                case 0:
                                    pvVar.O0.presentFragment(an.ra(j3));
                                    break;
                                case 1:
                                    org.telegram.messenger.g0.i3(new su(pvVar.O0, j3, !r2.q4(), 0), 200L);
                                    break;
                                case 2:
                                    org.telegram.messenger.g0.i3(new su(pvVar.O0, j3, !r2.q4(), 0), 200L);
                                    break;
                                case 3:
                                    ww wwVar2 = pvVar.O0;
                                    i2322 = ((org.telegram.ui.ActionBar.f2) wwVar2).currentAccount;
                                    org.telegram.messenger.ui b02 = org.telegram.messenger.ui.b0(i2322);
                                    long j10 = j3;
                                    b02.N1(j10);
                                    wwVar2.getMessagesController().P1().l0(j10, true, false);
                                    break;
                                case 4:
                                    pvVar.O0.E0.j(j3);
                                    break;
                                case 5:
                                    pvVar.O0.presentFragment(an.ra(j3));
                                    break;
                                default:
                                    pvVar.O0.presentFragment(ProfileActivity.A4(j3));
                                    break;
                            }
                        }
                    }, j3 >= 0);
                    final int i262 = 0;
                    final String str22 = str;
                    k60Var22.l(R.drawable.msg_mute, hd.M0(2131747862, null), new Runnable() { // from class: org.telegram.ui.mv
                        @Override // java.lang.Runnable
                        public final void run() {
                            int i272;
                            String trim;
                            int i282;
                            int i292 = i262;
                            TLRPC.User user = a22;
                            String str3 = str22;
                            pv pvVar2 = pvVar;
                            switch (i292) {
                                case 0:
                                    ww wwVar2 = pvVar2.O0;
                                    i272 = ((org.telegram.ui.ActionBar.f2) wwVar2).currentAccount;
                                    org.telegram.messenger.qp.s1(i272).d7.edit().putBoolean("stories_" + str3, false).apply();
                                    wwVar2.getNotificationsController().c0(j3, 0L, true);
                                    trim = user != null ? user.first_name.trim() : "";
                                    int indexOf = trim.indexOf(" ");
                                    if (indexOf > 0) {
                                        trim = trim.substring(0, indexOf);
                                    }
                                    org.telegram.ui.Components.hc.a0(wwVar2).V(Arrays.asList(user), org.telegram.messenger.g0.X2(org.telegram.messenger.hd.a0("NotificationsStoryMutedHint", null, 2131747861, trim)), null, null).j();
                                    break;
                                default:
                                    ww wwVar3 = pvVar2.O0;
                                    i282 = ((org.telegram.ui.ActionBar.f2) wwVar3).currentAccount;
                                    org.telegram.messenger.qp.s1(i282).d7.edit().putBoolean("stories_" + str3, true).apply();
                                    wwVar3.getNotificationsController().c0(j3, 0L, true);
                                    trim = user != null ? user.first_name.trim() : "";
                                    int indexOf2 = trim.indexOf(" ");
                                    if (indexOf2 > 0) {
                                        trim = trim.substring(0, indexOf2);
                                    }
                                    org.telegram.ui.Components.hc.a0(wwVar3).V(Arrays.asList(user), org.telegram.messenger.g0.X2(org.telegram.messenger.hd.a0("NotificationsStoryUnmutedHint", null, 2131747858, trim)), null, null).j();
                                    break;
                            }
                        }
                    }, !h02 && j3 > 0);
                    k60Var22.E();
                    final int i272 = 1;
                    k60Var22.l(R.drawable.msg_unmute, hd.M0(2131747859, null), new Runnable() { // from class: org.telegram.ui.mv
                        @Override // java.lang.Runnable
                        public final void run() {
                            int i2722;
                            String trim;
                            int i282;
                            int i292 = i272;
                            TLRPC.User user = a22;
                            String str3 = str22;
                            pv pvVar2 = pvVar;
                            switch (i292) {
                                case 0:
                                    ww wwVar2 = pvVar2.O0;
                                    i2722 = ((org.telegram.ui.ActionBar.f2) wwVar2).currentAccount;
                                    org.telegram.messenger.qp.s1(i2722).d7.edit().putBoolean("stories_" + str3, false).apply();
                                    wwVar2.getNotificationsController().c0(j3, 0L, true);
                                    trim = user != null ? user.first_name.trim() : "";
                                    int indexOf = trim.indexOf(" ");
                                    if (indexOf > 0) {
                                        trim = trim.substring(0, indexOf);
                                    }
                                    org.telegram.ui.Components.hc.a0(wwVar2).V(Arrays.asList(user), org.telegram.messenger.g0.X2(org.telegram.messenger.hd.a0("NotificationsStoryMutedHint", null, 2131747861, trim)), null, null).j();
                                    break;
                                default:
                                    ww wwVar3 = pvVar2.O0;
                                    i282 = ((org.telegram.ui.ActionBar.f2) wwVar3).currentAccount;
                                    org.telegram.messenger.qp.s1(i282).d7.edit().putBoolean("stories_" + str3, true).apply();
                                    wwVar3.getNotificationsController().c0(j3, 0L, true);
                                    trim = user != null ? user.first_name.trim() : "";
                                    int indexOf2 = trim.indexOf(" ");
                                    if (indexOf2 > 0) {
                                        trim = trim.substring(0, indexOf2);
                                    }
                                    org.telegram.ui.Components.hc.a0(wwVar3).V(Arrays.asList(user), org.telegram.messenger.g0.X2(org.telegram.messenger.hd.a0("NotificationsStoryUnmutedHint", null, 2131747858, trim)), null, null).j();
                                    break;
                            }
                        }
                    }, h02 && j3 > 0);
                    k60Var22.E();
                    final int i282 = 0;
                    k60Var22.l(R.drawable.msg_stories_stealth2, hd.M0(2131743563, null), new Runnable() { // from class: org.telegram.ui.nv
                        @Override // java.lang.Runnable
                        public final void run() {
                            org.telegram.ui.ActionBar.f6 f6Var;
                            int i292;
                            org.telegram.ui.ActionBar.f6 f6Var2;
                            switch (i282) {
                                case 0:
                                    pv pvVar2 = pvVar;
                                    ww wwVar2 = pvVar2.O0;
                                    TL_stories.TL_storiesStealthMode tL_storiesStealthMode = org.telegram.messenger.qp.s1(org.telegram.messenger.p10.s0).P1().B;
                                    View view2 = view;
                                    if (tL_storiesStealthMode != null) {
                                        i292 = ((org.telegram.ui.ActionBar.f2) wwVar2).currentAccount;
                                        if (ConnectionsManager.getInstance(i292).getCurrentTime() < tL_storiesStealthMode.active_until_date) {
                                            if (view2 instanceof di.p) {
                                                wwVar2.E0.i((di.p) view2, false);
                                                break;
                                            }
                                        }
                                    }
                                    Context context = pvVar2.getContext();
                                    f6Var = ((org.telegram.ui.ActionBar.f2) wwVar2).resourceProvider;
                                    di.w5 w5Var = new di.w5(context, 0.0f, 1, f6Var);
                                    w5Var.l1 = new ov(pvVar2, view2, 1);
                                    wwVar2.showDialog(w5Var);
                                    break;
                                default:
                                    pv pvVar3 = pvVar;
                                    Context context2 = pvVar3.getContext();
                                    ww wwVar3 = pvVar3.O0;
                                    f6Var2 = ((org.telegram.ui.ActionBar.f2) wwVar3).resourceProvider;
                                    di.w5 w5Var2 = new di.w5(context2, 0.0f, 1, f6Var2);
                                    w5Var2.l1 = new ov(pvVar3, view, 0);
                                    wwVar3.showDialog(w5Var2);
                                    break;
                            }
                        }
                    }, D3 && j3 > 0 && q10 && L && !H2);
                    k60Var22.E();
                    if (D3) {
                    }
                    String M022 = hd.M0(2131743563, null);
                    final int i292 = 1;
                    Runnable runnable2 = new Runnable() { // from class: org.telegram.ui.nv
                        @Override // java.lang.Runnable
                        public final void run() {
                            org.telegram.ui.ActionBar.f6 f6Var;
                            int i2922;
                            org.telegram.ui.ActionBar.f6 f6Var2;
                            switch (i292) {
                                case 0:
                                    pv pvVar2 = pvVar;
                                    ww wwVar2 = pvVar2.O0;
                                    TL_stories.TL_storiesStealthMode tL_storiesStealthMode = org.telegram.messenger.qp.s1(org.telegram.messenger.p10.s0).P1().B;
                                    View view2 = view;
                                    if (tL_storiesStealthMode != null) {
                                        i2922 = ((org.telegram.ui.ActionBar.f2) wwVar2).currentAccount;
                                        if (ConnectionsManager.getInstance(i2922).getCurrentTime() < tL_storiesStealthMode.active_until_date) {
                                            if (view2 instanceof di.p) {
                                                wwVar2.E0.i((di.p) view2, false);
                                                break;
                                            }
                                        }
                                    }
                                    Context context = pvVar2.getContext();
                                    f6Var = ((org.telegram.ui.ActionBar.f2) wwVar2).resourceProvider;
                                    di.w5 w5Var = new di.w5(context, 0.0f, 1, f6Var);
                                    w5Var.l1 = new ov(pvVar2, view2, 1);
                                    wwVar2.showDialog(w5Var);
                                    break;
                                default:
                                    pv pvVar3 = pvVar;
                                    Context context2 = pvVar3.getContext();
                                    ww wwVar3 = pvVar3.O0;
                                    f6Var2 = ((org.telegram.ui.ActionBar.f2) wwVar3).resourceProvider;
                                    di.w5 w5Var2 = new di.w5(context2, 0.0f, 1, f6Var2);
                                    w5Var2.l1 = new ov(pvVar3, view, 0);
                                    wwVar3.showDialog(w5Var2);
                                    break;
                            }
                        }
                    };
                    if (z10) {
                    }
                    k60Var.E();
                    final int i302 = 1;
                    k60Var.l(R.drawable.msg_archive, hd.M0(2131754153, null), new Runnable() { // from class: org.telegram.ui.lv
                        @Override // java.lang.Runnable
                        public final void run() {
                            int i2322;
                            switch (i302) {
                                case 0:
                                    pvVar.O0.presentFragment(an.ra(j3));
                                    break;
                                case 1:
                                    org.telegram.messenger.g0.i3(new su(pvVar.O0, j3, !r2.q4(), 0), 200L);
                                    break;
                                case 2:
                                    org.telegram.messenger.g0.i3(new su(pvVar.O0, j3, !r2.q4(), 0), 200L);
                                    break;
                                case 3:
                                    ww wwVar2 = pvVar.O0;
                                    i2322 = ((org.telegram.ui.ActionBar.f2) wwVar2).currentAccount;
                                    org.telegram.messenger.ui b02 = org.telegram.messenger.ui.b0(i2322);
                                    long j10 = j3;
                                    b02.N1(j10);
                                    wwVar2.getMessagesController().P1().l0(j10, true, false);
                                    break;
                                case 4:
                                    pvVar.O0.E0.j(j3);
                                    break;
                                case 5:
                                    pvVar.O0.presentFragment(an.ra(j3));
                                    break;
                                default:
                                    pvVar.O0.presentFragment(ProfileActivity.A4(j3));
                                    break;
                            }
                        }
                    }, z9 && !wwVar.q4());
                    k60Var.E();
                    final int i312 = 2;
                    k60Var.l(R.drawable.msg_unarchive, hd.M0(2131743915, null), new Runnable() { // from class: org.telegram.ui.lv
                        @Override // java.lang.Runnable
                        public final void run() {
                            int i2322;
                            switch (i312) {
                                case 0:
                                    pvVar.O0.presentFragment(an.ra(j3));
                                    break;
                                case 1:
                                    org.telegram.messenger.g0.i3(new su(pvVar.O0, j3, !r2.q4(), 0), 200L);
                                    break;
                                case 2:
                                    org.telegram.messenger.g0.i3(new su(pvVar.O0, j3, !r2.q4(), 0), 200L);
                                    break;
                                case 3:
                                    ww wwVar2 = pvVar.O0;
                                    i2322 = ((org.telegram.ui.ActionBar.f2) wwVar2).currentAccount;
                                    org.telegram.messenger.ui b02 = org.telegram.messenger.ui.b0(i2322);
                                    long j10 = j3;
                                    b02.N1(j10);
                                    wwVar2.getMessagesController().P1().l0(j10, true, false);
                                    break;
                                case 4:
                                    pvVar.O0.E0.j(j3);
                                    break;
                                case 5:
                                    pvVar.O0.presentFragment(an.ra(j3));
                                    break;
                                default:
                                    pvVar.O0.presentFragment(ProfileActivity.A4(j3));
                                    break;
                            }
                        }
                    }, z9 && wwVar.q4());
                    k60Var.E();
                    i17 = 3;
                    k60Var.l(R.drawable.msg_delete, hd.M0(2131744749, null), new Runnable() { // from class: org.telegram.ui.lv
                        @Override // java.lang.Runnable
                        public final void run() {
                            int i2322;
                            switch (i17) {
                                case 0:
                                    pvVar.O0.presentFragment(an.ra(j3));
                                    break;
                                case 1:
                                    org.telegram.messenger.g0.i3(new su(pvVar.O0, j3, !r2.q4(), 0), 200L);
                                    break;
                                case 2:
                                    org.telegram.messenger.g0.i3(new su(pvVar.O0, j3, !r2.q4(), 0), 200L);
                                    break;
                                case 3:
                                    ww wwVar2 = pvVar.O0;
                                    i2322 = ((org.telegram.ui.ActionBar.f2) wwVar2).currentAccount;
                                    org.telegram.messenger.ui b02 = org.telegram.messenger.ui.b0(i2322);
                                    long j10 = j3;
                                    b02.N1(j10);
                                    wwVar2.getMessagesController().P1().l0(j10, true, false);
                                    break;
                                case 4:
                                    pvVar.O0.E0.j(j3);
                                    break;
                                case 5:
                                    pvVar.O0.presentFragment(an.ra(j3));
                                    break;
                                default:
                                    pvVar.O0.presentFragment(ProfileActivity.A4(j3));
                                    break;
                            }
                        }
                    }, z9);
                } else if (wwVar.N3) {
                    k60 k60Var3 = wwVar.L0;
                    String M03 = hd.M0(2131754384, null);
                    int i32 = k6.F8;
                    int i33 = k6.E8;
                    k60Var3.b(R.drawable.msg_stories_add, null, M03, i32, i33, new Runnable() { // from class: org.telegram.ui.kv
                        @Override // java.lang.Runnable
                        public final void run() {
                            int i34;
                            int i35;
                            switch (i19) {
                                case 0:
                                    pvVar.O0.E0.j(0L);
                                    break;
                                case 1:
                                    Bundle bundle = new Bundle();
                                    ww wwVar2 = pvVar.O0;
                                    i34 = ((org.telegram.ui.ActionBar.f2) wwVar2).currentAccount;
                                    bundle.putLong("dialog_id", org.telegram.messenger.p10.i(i34).e());
                                    bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                    bundle.putInt("start_from", 9);
                                    wwVar2.presentFragment(new org.telegram.ui.Components.u80(bundle, null));
                                    break;
                                default:
                                    Bundle bundle2 = new Bundle();
                                    ww wwVar3 = pvVar.O0;
                                    i35 = ((org.telegram.ui.ActionBar.f2) wwVar3).currentAccount;
                                    bundle2.putLong("dialog_id", org.telegram.messenger.p10.i(i35).e());
                                    bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                    wwVar3.presentFragment(new org.telegram.ui.Components.u80(bundle2, null));
                                    break;
                            }
                        }
                    });
                    wwVar.L0.b(R.drawable.msg_stories_archive, null, hd.M0(2131754123, null), i32, i33, new Runnable() { // from class: org.telegram.ui.kv
                        @Override // java.lang.Runnable
                        public final void run() {
                            int i34;
                            int i35;
                            switch (i20) {
                                case 0:
                                    pvVar.O0.E0.j(0L);
                                    break;
                                case 1:
                                    Bundle bundle = new Bundle();
                                    ww wwVar2 = pvVar.O0;
                                    i34 = ((org.telegram.ui.ActionBar.f2) wwVar2).currentAccount;
                                    bundle.putLong("dialog_id", org.telegram.messenger.p10.i(i34).e());
                                    bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                    bundle.putInt("start_from", 9);
                                    wwVar2.presentFragment(new org.telegram.ui.Components.u80(bundle, null));
                                    break;
                                default:
                                    Bundle bundle2 = new Bundle();
                                    ww wwVar3 = pvVar.O0;
                                    i35 = ((org.telegram.ui.ActionBar.f2) wwVar3).currentAccount;
                                    bundle2.putLong("dialog_id", org.telegram.messenger.p10.i(i35).e());
                                    bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                    wwVar3.presentFragment(new org.telegram.ui.Components.u80(bundle2, null));
                                    break;
                            }
                        }
                    });
                    wwVar.L0.b(R.drawable.msg_stories_saved, null, hd.M0(2131745886, null), i32, i33, new Runnable() { // from class: org.telegram.ui.kv
                        @Override // java.lang.Runnable
                        public final void run() {
                            int i34;
                            int i35;
                            switch (i21) {
                                case 0:
                                    pvVar.O0.E0.j(0L);
                                    break;
                                case 1:
                                    Bundle bundle = new Bundle();
                                    ww wwVar2 = pvVar.O0;
                                    i34 = ((org.telegram.ui.ActionBar.f2) wwVar2).currentAccount;
                                    bundle.putLong("dialog_id", org.telegram.messenger.p10.i(i34).e());
                                    bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                    bundle.putInt("start_from", 9);
                                    wwVar2.presentFragment(new org.telegram.ui.Components.u80(bundle, null));
                                    break;
                                default:
                                    Bundle bundle2 = new Bundle();
                                    ww wwVar3 = pvVar.O0;
                                    i35 = ((org.telegram.ui.ActionBar.f2) wwVar3).currentAccount;
                                    bundle2.putLong("dialog_id", org.telegram.messenger.p10.i(i35).e());
                                    bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                    wwVar3.presentFragment(new org.telegram.ui.Components.u80(bundle2, null));
                                    break;
                            }
                        }
                    });
                    i17 = 3;
                } else {
                    pv pvVar2 = wwVar.E0;
                    if (pvVar2 != null) {
                        pvVar2.n();
                    }
                }
                k60 k60Var4 = wwVar.L0;
                k60Var4.i = i17;
                k60Var4.a0(g0.L(-8.0f), g0.L(-10.0f));
                k60Var4.Z();
                return false;
            }
            p2.D.a();
        }
        return false;
    }

    @Override // org.telegram.messenger.w10
    public Object d(Number number, Object obj) {
        return u0.a((u0) this.b, (Long) obj);
    }

    @Override // org.telegram.ui.Components.cj0
    public void f(float f10, float f11, int i7, View view) {
        long j3;
        int i10;
        int i11;
        int i12;
        g2 g2Var = (g2) this.b;
        q1 q1Var = g2Var.c;
        ArrayList arrayList = g2Var.r;
        di.t0 t0Var = ((r0) view).f;
        int i13 = g2Var.N;
        int currentTime = ConnectionsManager.getInstance(i13).getCurrentTime();
        HashSet hashSet = new HashSet();
        int i14 = 0;
        int i15 = 0;
        while (true) {
            if (i15 >= t0Var.f.size()) {
                break;
            }
            s0 s0Var = (s0) t0Var.f.get(i15);
            long j10 = s0Var.g;
            if (j10 > 0 && currentTime - s0Var.d <= di.t.b(i13, (int) j10, 0)) {
                hashSet.add(Integer.valueOf(s0Var.a));
            }
            i15++;
        }
        g1 g1Var = g2Var.P;
        long j11 = g1Var != null ? g1Var.j() : 0L;
        int i16 = 0;
        int i17 = 0;
        while (i16 < arrayList.size()) {
            s0 s0Var2 = (s0) arrayList.get(i16);
            if (s0Var2.b || !s0Var2.e || s0Var2.g >= j11) {
                if (hashSet.contains(Integer.valueOf(s0Var2.a))) {
                    j3 = j11;
                    if (g2Var.x != t0Var.b || (i12 = g2Var.y) == 0 || s0Var2.a < i12) {
                        i10 = s0Var2.a;
                        break;
                    }
                } else {
                    j3 = j11;
                }
                i17++;
            } else {
                j3 = j11;
            }
            i16++;
            j11 = j3;
        }
        j3 = j11;
        i10 = -1;
        if (i10 < 0) {
            int i18 = 0;
            while (true) {
                if (i14 >= arrayList.size()) {
                    i17 = i18;
                    i11 = -1;
                    break;
                }
                s0 s0Var3 = (s0) arrayList.get(i14);
                if (s0Var3.b || !s0Var3.e || s0Var3.g >= j3) {
                    if (hashSet.contains(Integer.valueOf(s0Var3.a))) {
                        i11 = s0Var3.a;
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
        g2Var.x = t0Var.b;
        g2Var.y = i11;
        g2Var.D = true;
        l0 itemAnimator = q1Var.getItemAnimator();
        q1Var.setItemAnimator(null);
        g2Var.d.i1(i17, q1Var.getHeight() / 2, true);
        g2Var.e.g(i17);
        q1Var.setItemAnimator(itemAnimator);
    }

    @Override // org.telegram.ui.Components.cj0
    public /* synthetic */ boolean f1(View view) {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.r1
    public void g(u1 u1Var, int i7) {
        ((c20) this.b).a(u1Var.h(i7, true, true));
    }

    @Override // a3.p
    public t1 h(int i7, m1 m1Var, int[] iArr) {
        n nVar = (n) this.b;
        f0 p10 = i0.p();
        for (int i10 = 0; i10 < m1Var.a; i10++) {
            p10.c(new a3.j(i7, m1Var, i10, nVar, iArr[i10]));
        }
        return p10.f();
    }

    @Override // org.telegram.messenger.a20
    public void i(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        int i7;
        f6 f6Var;
        switch (this.a) {
            case 10:
                y yVar = (y) this.b;
                x31 x31Var = (x31) obj;
                z zVar = yVar.r;
                if (!(x31Var.G instanceof TL_stars.StarsTransaction)) {
                    if (yVar.h) {
                        yVar.h = false;
                        yVar.a();
                        break;
                    }
                } else {
                    Context context = yVar.getContext();
                    long j3 = zVar.b;
                    i7 = ((f2) zVar).currentAccount;
                    TL_stars.StarsTransaction starsTransaction = (TL_stars.StarsTransaction) x31Var.G;
                    f6Var = ((f2) zVar).resourceProvider;
                    dd.k1(context, true, j3, i7, starsTransaction, f6Var);
                    break;
                }
                break;
            case 15:
                ea.b((ea) this.b, (ArrayList) obj, (Integer) obj2, (Long) number, (ArrayList) serializable, (ArrayList) serializable2);
                break;
            default:
                ad adVar = (ad) this.b;
                x31 x31Var2 = (x31) obj;
                if (x31Var2.G instanceof TL_stars.StarsTransaction) {
                    dd.k1(adVar.getContext(), false, 0L, adVar.c, (TL_stars.StarsTransaction) x31Var2.G, adVar.b);
                    break;
                }
                break;
        }
    }

    @Override // bg.p
    public void j(long j3) {
        ((u6) this.b).h();
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        switch (this.a) {
            case 5:
                m0.b((Intent) this.b);
                break;
            case 6:
                ((o0) this.b).b.trySetResult(null);
                break;
            default:
                ((ScheduledFuture) this.b).cancel(false);
                break;
        }
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        switch (this.a) {
            case 0:
                ((f) this.b).invoke(obj);
                break;
            case 20:
                ((ae.d) this.b).invoke(obj);
                break;
            default:
                ((ae.d) this.b).invoke(obj);
                break;
        }
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        Exception exception;
        Task forException;
        String message;
        switch (this.a) {
            case 2:
                ((CountDownLatch) this.b).countDown();
                return null;
            case 3:
                r7 r7Var = (r7) this.b;
                r7Var.getClass();
                if (task.isSuccessful() || (exception = task.getException()) == null || TextUtils.isEmpty(exception.getMessage()) || !exception.getMessage().contains("FID_ALREADY_USED:")) {
                    return task;
                }
                Log.w("FirebaseMessaging", "FID_ALREADY_USED Detected. Retrying with FID cache clearing!");
                ((va.c) ((va.d) r7Var.d)).c.b().delete();
                return r7Var.C();
            case 4:
                ((b8) this.b).getClass();
                Bundle bundle = (Bundle) task.getResult(IOException.class);
                if (bundle == null) {
                    throw new IOException("SERVICE_NOT_AVAILABLE");
                }
                String string = bundle.getString("registration_id");
                if (string != null || (string = bundle.getString("unregistered")) != null) {
                    return string;
                }
                String string2 = bundle.getString("error");
                if ("RST".equals(string2)) {
                    throw new IOException("INSTANCE_ID_RESET");
                }
                if (string2 != null) {
                    throw new IOException(string2);
                }
                Log.w("FirebaseMessaging", "Unexpected response: " + bundle, new Throwable());
                throw new IOException("SERVICE_NOT_AVAILABLE");
            case 5:
            case 6:
            case 7:
            default:
                db.n this$0 = (db.n) this.b;
                kotlin.jvm.internal.j.e(this$0, "this$0");
                kotlin.jvm.internal.j.e(task, "task");
                d1 d1Var = db.n.b;
                if (task.isSuccessful()) {
                    d1Var.a("Successfully completed the operation", new Object[0]);
                    Task forResult = Tasks.forResult(m.b.invoke(task.getResult()));
                    kotlin.jvm.internal.j.d(forResult, "{\n      logger.d(\"Succes…ccess(task.result))\n    }");
                    return forResult;
                }
                Log.e(d1Var.a, d1Var.b("Failed to fetch the Verification Support Info: " + task.getException(), new Object[0]));
                Exception exception2 = task.getException();
                if (exception2 == null || (message = exception2.getMessage()) == null || !xd.d.e(message, "test_number_token is invalid")) {
                    forException = Tasks.forException(new db.b(exception2 instanceof com.google.android.gms.common.api.f ? ((com.google.android.gms.common.api.f) exception2).getStatus().a : 55501, "Failed to fetch the Verification Support Info"));
                } else {
                    d1Var.a("Backend rejected the test number token.", new Object[0]);
                    forException = Tasks.forException(new db.b(55507, "Invalid test number ID(s) - might be empty, expired or duplicated."));
                }
                kotlin.jvm.internal.j.d(forException, "{\n      logger.e(\"$onFai…reMessage))\n      }\n    }");
                return forException;
            case 8:
                return (Task) ((o) this.b).call();
        }
    }

    @Override // h2.j
    public void accept(Object obj) {
        switch (this.a) {
            case 21:
                c4.h hVar = (c4.h) this.b;
                c4.a aVar = (c4.a) obj;
                c4.g gVar = new c4.g(aVar.b, sa.d.w0(aVar.a, aVar.c));
                hVar.c.add(gVar);
                long j3 = hVar.j;
                if (j3 == -9223372036854775807L || aVar.d >= j3) {
                    hVar.g(gVar);
                    break;
                }
                break;
            default:
                ((f0) this.b).c((c4.a) obj);
                break;
        }
    }

    @Override // te.b
    public /* synthetic */ void F(float f10, int i7) {
    }

    @Override // org.telegram.ui.Components.cj0
    public /* synthetic */ void r0(View view, float f10, float f11) {
    }
}
