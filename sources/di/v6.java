package di;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextPaint;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.tasks.OnSuccessListener;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import org.scilab.forge.jlatexmath.TeXSymbolParser;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.ef;
import org.telegram.messenger.fj;
import org.telegram.messenger.gd;
import org.telegram.messenger.i10;
import org.telegram.messenger.mp;
import org.telegram.messenger.n10;
import org.telegram.messenger.q10;
import org.telegram.messenger.ri;
import org.telegram.messenger.u10;
import org.telegram.messenger.xs;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.eq0;
import org.telegram.ui.Components.gj0;
import org.telegram.ui.Components.lq;
import org.telegram.ui.Components.n41;
import org.telegram.ui.Components.qt0;
import org.telegram.ui.Components.rj0;
import org.telegram.ui.Components.sj0;
import org.telegram.ui.Components.x60;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.NotificationsCustomSettingsActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.bx;
import org.telegram.ui.jl0;
import org.telegram.ui.sv;
import org.telegram.ui.za1;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class v6 implements jl0, u10, OnSuccessListener, sj0, q10, rj0, fi.x6, fi.z8, xh.j, r0.m, h9.g1, org.telegram.ui.ActionBar.q1, tg.a, hi.m7, gj0, sg.i1, CameraController.VideoTakeCallback, qt0, f3.g {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ v6(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // org.telegram.ui.Components.rj0
    public /* synthetic */ boolean U0(View view) {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x02d3 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:118:0x02f4 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0313 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0337 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0350  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0367  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0389  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0352  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0277  */
    @Override // org.telegram.ui.Components.sj0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean b(int i7, final View view) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        long j3;
        lq lqVar;
        boolean z10;
        boolean z11;
        x60 x60Var;
        final int i17;
        int i18;
        int i19 = this.a;
        org.telegram.messenger.q2 q2Var = org.telegram.messenger.q2.E;
        final int i20 = 2;
        Object obj = this.b;
        final int i21 = 0;
        final int i22 = 1;
        switch (i19) {
            case 5:
                final sv svVar = (sv) obj;
                if (svVar.O == 0.0f && svVar.o0 == 0.0f) {
                    final long j10 = ((fi.p) view).F;
                    bx bxVar = svVar.P0;
                    i10 = ((org.telegram.ui.ActionBar.g2) bxVar).currentAccount;
                    ri.d0(i10).P0(true);
                    x60 I = x60.I(bxVar, view);
                    I.z.set(0, org.telegram.messenger.g0.L(8.0f), 0, 0);
                    I.X(org.telegram.ui.ActionBar.n6.e0(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f), bxVar.getThemedColor(org.telegram.ui.ActionBar.n6.d6)));
                    I.b0(0.0f, org.telegram.messenger.g0.L(8.0f));
                    bxVar.M0 = I;
                    if (!n10.B(j10)) {
                        try {
                            view.performHapticFeedback(0);
                        } catch (Exception unused) {
                        }
                        i11 = ((org.telegram.ui.ActionBar.g2) bxVar).currentAccount;
                        if (j10 != i10.i(i11).e()) {
                            final TLRPC.User c22 = bxVar.getMessagesController().c2(Long.valueOf(j10));
                            TLRPC.Chat O0 = bxVar.getMessagesController().O0(Long.valueOf(-j10));
                            final String v = xs.v(j10, 0L, false);
                            i12 = ((org.telegram.ui.ActionBar.g2) bxVar).currentAccount;
                            boolean h02 = NotificationsCustomSettingsActivity.h0(i12, j10);
                            i13 = ((org.telegram.ui.ActionBar.g2) bxVar).currentAccount;
                            boolean K3 = mp.u1(i13).K3();
                            i14 = ((org.telegram.ui.ActionBar.g2) bxVar).currentAccount;
                            boolean q10 = i10.i(i14).q();
                            i15 = ((org.telegram.ui.ActionBar.g2) bxVar).currentAccount;
                            boolean L = mp.u1(i15).R1().L(j10);
                            i16 = ((org.telegram.ui.ActionBar.g2) bxVar).currentAccount;
                            boolean H = mp.u1(i16).R1().H(j10);
                            if (K3 || j10 <= 0 || q10) {
                                j3 = 0;
                            } else {
                                j3 = 0;
                                Drawable drawable = svVar.getContext().getDrawable(R.drawable.msg_gallery_locked2);
                                if (drawable != null) {
                                    Drawable drawable2 = svVar.getContext().getDrawable(R.drawable.msg_stealth_locked);
                                    if (drawable2 != null) {
                                        org.telegram.ui.ActionBar.u6.x(svVar, drawable2, org.telegram.ui.ActionBar.n6.F8, bxVar.getResourceProvider(), PorterDuff.Mode.MULTIPLY);
                                    }
                                    drawable.setColorFilter(new PorterDuffColorFilter(i0.a.f(0.5f, -1, -16777216), PorterDuff.Mode.MULTIPLY));
                                    lqVar = new lq(drawable2, drawable);
                                    if (j10 < j3 && bxVar.k4().j(j10)) {
                                        final int i23 = 4;
                                        bxVar.M0.b(R.drawable.msg_stories_add, null, gd.N0(2131754381, null), org.telegram.ui.ActionBar.n6.F8, org.telegram.ui.ActionBar.n6.E8, new Runnable() { // from class: org.telegram.ui.ov
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                int i24;
                                                switch (i23) {
                                                    case 0:
                                                        svVar.P0.presentFragment(bn.ua(j10));
                                                        break;
                                                    case 1:
                                                        org.telegram.messenger.g0.h3(new su(svVar.P0, j10, !r2.t4(), 0), 200L);
                                                        break;
                                                    case 2:
                                                        org.telegram.messenger.g0.h3(new su(svVar.P0, j10, !r2.t4(), 0), 200L);
                                                        break;
                                                    case 3:
                                                        bx bxVar2 = svVar.P0;
                                                        i24 = ((org.telegram.ui.ActionBar.g2) bxVar2).currentAccount;
                                                        org.telegram.messenger.ri d02 = org.telegram.messenger.ri.d0(i24);
                                                        long j11 = j10;
                                                        d02.S1(j11);
                                                        bxVar2.getMessagesController().R1().l0(j11, true, false);
                                                        break;
                                                    case 4:
                                                        svVar.P0.F0.j(j10);
                                                        break;
                                                    case 5:
                                                        svVar.P0.presentFragment(bn.ua(j10));
                                                        break;
                                                    default:
                                                        svVar.P0.presentFragment(ProfileActivity.D4(j10));
                                                        break;
                                                }
                                            }
                                        });
                                    }
                                    if (c22 != null && !c22.contact) {
                                        i18 = ((org.telegram.ui.ActionBar.g2) bxVar).currentAccount;
                                        if (ri.d0(i18).I(j10)) {
                                            z10 = true;
                                            x60 x60Var2 = bxVar.M0;
                                            final int i24 = 5;
                                            x60Var2.l(R.drawable.msg_discussion, gd.N0(2131745405, null), new Runnable() { // from class: org.telegram.ui.ov
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    int i242;
                                                    switch (i24) {
                                                        case 0:
                                                            svVar.P0.presentFragment(bn.ua(j10));
                                                            break;
                                                        case 1:
                                                            org.telegram.messenger.g0.h3(new su(svVar.P0, j10, !r2.t4(), 0), 200L);
                                                            break;
                                                        case 2:
                                                            org.telegram.messenger.g0.h3(new su(svVar.P0, j10, !r2.t4(), 0), 200L);
                                                            break;
                                                        case 3:
                                                            bx bxVar2 = svVar.P0;
                                                            i242 = ((org.telegram.ui.ActionBar.g2) bxVar2).currentAccount;
                                                            org.telegram.messenger.ri d02 = org.telegram.messenger.ri.d0(i242);
                                                            long j11 = j10;
                                                            d02.S1(j11);
                                                            bxVar2.getMessagesController().R1().l0(j11, true, false);
                                                            break;
                                                        case 4:
                                                            svVar.P0.F0.j(j10);
                                                            break;
                                                        case 5:
                                                            svVar.P0.presentFragment(bn.ua(j10));
                                                            break;
                                                        default:
                                                            svVar.P0.presentFragment(ProfileActivity.D4(j10));
                                                            break;
                                                    }
                                                }
                                            }, j10 > j3);
                                            final int i25 = 6;
                                            x60Var2.l(R.drawable.msg_openprofile, gd.N0(2131747592, null), new Runnable() { // from class: org.telegram.ui.ov
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    int i242;
                                                    switch (i25) {
                                                        case 0:
                                                            svVar.P0.presentFragment(bn.ua(j10));
                                                            break;
                                                        case 1:
                                                            org.telegram.messenger.g0.h3(new su(svVar.P0, j10, !r2.t4(), 0), 200L);
                                                            break;
                                                        case 2:
                                                            org.telegram.messenger.g0.h3(new su(svVar.P0, j10, !r2.t4(), 0), 200L);
                                                            break;
                                                        case 3:
                                                            bx bxVar2 = svVar.P0;
                                                            i242 = ((org.telegram.ui.ActionBar.g2) bxVar2).currentAccount;
                                                            org.telegram.messenger.ri d02 = org.telegram.messenger.ri.d0(i242);
                                                            long j11 = j10;
                                                            d02.S1(j11);
                                                            bxVar2.getMessagesController().R1().l0(j11, true, false);
                                                            break;
                                                        case 4:
                                                            svVar.P0.F0.j(j10);
                                                            break;
                                                        case 5:
                                                            svVar.P0.presentFragment(bn.ua(j10));
                                                            break;
                                                        default:
                                                            svVar.P0.presentFragment(ProfileActivity.D4(j10));
                                                            break;
                                                    }
                                                }
                                            }, j10 > j3);
                                            final int i26 = 0;
                                            x60Var2.l(R.drawable.msg_channel, gd.N0(org.telegram.messenger.v3.V(O0) ? 2131747617 : 2131747605, null), new Runnable() { // from class: org.telegram.ui.ov
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    int i242;
                                                    switch (i26) {
                                                        case 0:
                                                            svVar.P0.presentFragment(bn.ua(j10));
                                                            break;
                                                        case 1:
                                                            org.telegram.messenger.g0.h3(new su(svVar.P0, j10, !r2.t4(), 0), 200L);
                                                            break;
                                                        case 2:
                                                            org.telegram.messenger.g0.h3(new su(svVar.P0, j10, !r2.t4(), 0), 200L);
                                                            break;
                                                        case 3:
                                                            bx bxVar2 = svVar.P0;
                                                            i242 = ((org.telegram.ui.ActionBar.g2) bxVar2).currentAccount;
                                                            org.telegram.messenger.ri d02 = org.telegram.messenger.ri.d0(i242);
                                                            long j11 = j10;
                                                            d02.S1(j11);
                                                            bxVar2.getMessagesController().R1().l0(j11, true, false);
                                                            break;
                                                        case 4:
                                                            svVar.P0.F0.j(j10);
                                                            break;
                                                        case 5:
                                                            svVar.P0.presentFragment(bn.ua(j10));
                                                            break;
                                                        default:
                                                            svVar.P0.presentFragment(ProfileActivity.D4(j10));
                                                            break;
                                                    }
                                                }
                                            }, j10 < j3);
                                            final int i27 = 0;
                                            x60Var2.l(R.drawable.msg_mute, gd.N0(2131747669, null), new Runnable() { // from class: org.telegram.ui.pv
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    int i28;
                                                    String trim;
                                                    int i29;
                                                    int i30 = i27;
                                                    TLRPC.User user = c22;
                                                    String str = v;
                                                    sv svVar2 = svVar;
                                                    switch (i30) {
                                                        case 0:
                                                            bx bxVar2 = svVar2.P0;
                                                            i28 = ((org.telegram.ui.ActionBar.g2) bxVar2).currentAccount;
                                                            org.telegram.messenger.mp.u1(i28).g7.edit().putBoolean("stories_" + str, false).apply();
                                                            bxVar2.getNotificationsController().c0(j10, 0L, true);
                                                            trim = user != null ? user.first_name.trim() : "";
                                                            int indexOf = trim.indexOf(" ");
                                                            if (indexOf > 0) {
                                                                trim = trim.substring(0, indexOf);
                                                            }
                                                            org.telegram.ui.Components.kc.b0(bxVar2).V(Arrays.asList(user), org.telegram.messenger.g0.W2(org.telegram.messenger.gd.a0("NotificationsStoryMutedHint", null, 2131747668, trim)), null, null).j();
                                                            break;
                                                        default:
                                                            bx bxVar3 = svVar2.P0;
                                                            i29 = ((org.telegram.ui.ActionBar.g2) bxVar3).currentAccount;
                                                            org.telegram.messenger.mp.u1(i29).g7.edit().putBoolean("stories_" + str, true).apply();
                                                            bxVar3.getNotificationsController().c0(j10, 0L, true);
                                                            trim = user != null ? user.first_name.trim() : "";
                                                            int indexOf2 = trim.indexOf(" ");
                                                            if (indexOf2 > 0) {
                                                                trim = trim.substring(0, indexOf2);
                                                            }
                                                            org.telegram.ui.Components.kc.b0(bxVar3).V(Arrays.asList(user), org.telegram.messenger.g0.W2(org.telegram.messenger.gd.a0("NotificationsStoryUnmutedHint", null, 2131747665, trim)), null, null).j();
                                                            break;
                                                    }
                                                }
                                            }, !h02 && j10 > j3);
                                            x60Var2.F();
                                            final int i28 = 1;
                                            x60Var2.l(R.drawable.msg_unmute, gd.N0(2131747666, null), new Runnable() { // from class: org.telegram.ui.pv
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    int i282;
                                                    String trim;
                                                    int i29;
                                                    int i30 = i28;
                                                    TLRPC.User user = c22;
                                                    String str = v;
                                                    sv svVar2 = svVar;
                                                    switch (i30) {
                                                        case 0:
                                                            bx bxVar2 = svVar2.P0;
                                                            i282 = ((org.telegram.ui.ActionBar.g2) bxVar2).currentAccount;
                                                            org.telegram.messenger.mp.u1(i282).g7.edit().putBoolean("stories_" + str, false).apply();
                                                            bxVar2.getNotificationsController().c0(j10, 0L, true);
                                                            trim = user != null ? user.first_name.trim() : "";
                                                            int indexOf = trim.indexOf(" ");
                                                            if (indexOf > 0) {
                                                                trim = trim.substring(0, indexOf);
                                                            }
                                                            org.telegram.ui.Components.kc.b0(bxVar2).V(Arrays.asList(user), org.telegram.messenger.g0.W2(org.telegram.messenger.gd.a0("NotificationsStoryMutedHint", null, 2131747668, trim)), null, null).j();
                                                            break;
                                                        default:
                                                            bx bxVar3 = svVar2.P0;
                                                            i29 = ((org.telegram.ui.ActionBar.g2) bxVar3).currentAccount;
                                                            org.telegram.messenger.mp.u1(i29).g7.edit().putBoolean("stories_" + str, true).apply();
                                                            bxVar3.getNotificationsController().c0(j10, 0L, true);
                                                            trim = user != null ? user.first_name.trim() : "";
                                                            int indexOf2 = trim.indexOf(" ");
                                                            if (indexOf2 > 0) {
                                                                trim = trim.substring(0, indexOf2);
                                                            }
                                                            org.telegram.ui.Components.kc.b0(bxVar3).V(Arrays.asList(user), org.telegram.messenger.g0.W2(org.telegram.messenger.gd.a0("NotificationsStoryUnmutedHint", null, 2131747665, trim)), null, null).j();
                                                            break;
                                                    }
                                                }
                                            }, h02 && j10 > j3);
                                            x60Var2.F();
                                            final int i29 = 0;
                                            x60Var2.l(R.drawable.msg_stories_stealth2, gd.N0(2131743312, null), new Runnable() { // from class: org.telegram.ui.qv
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    org.telegram.ui.ActionBar.i6 i6Var;
                                                    int i30;
                                                    org.telegram.ui.ActionBar.i6 i6Var2;
                                                    switch (i29) {
                                                        case 0:
                                                            sv svVar2 = svVar;
                                                            bx bxVar2 = svVar2.P0;
                                                            TL_stories.TL_storiesStealthMode tL_storiesStealthMode = org.telegram.messenger.mp.u1(org.telegram.messenger.i10.t0).R1().B;
                                                            View view2 = view;
                                                            if (tL_storiesStealthMode != null) {
                                                                i30 = ((org.telegram.ui.ActionBar.g2) bxVar2).currentAccount;
                                                                if (ConnectionsManager.getInstance(i30).getCurrentTime() < tL_storiesStealthMode.active_until_date) {
                                                                    if (view2 instanceof fi.p) {
                                                                        bxVar2.F0.i((fi.p) view2, false);
                                                                        break;
                                                                    }
                                                                }
                                                            }
                                                            Context context = svVar2.getContext();
                                                            i6Var = ((org.telegram.ui.ActionBar.g2) bxVar2).resourceProvider;
                                                            fi.n5 n5Var = new fi.n5(context, 0.0f, 1, i6Var);
                                                            n5Var.p1 = new rv(svVar2, view2, 1);
                                                            bxVar2.showDialog(n5Var);
                                                            break;
                                                        default:
                                                            sv svVar3 = svVar;
                                                            Context context2 = svVar3.getContext();
                                                            bx bxVar3 = svVar3.P0;
                                                            i6Var2 = ((org.telegram.ui.ActionBar.g2) bxVar3).resourceProvider;
                                                            fi.n5 n5Var2 = new fi.n5(context2, 0.0f, 1, i6Var2);
                                                            n5Var2.p1 = new rv(svVar3, view, 0);
                                                            bxVar3.showDialog(n5Var2);
                                                            break;
                                                    }
                                                }
                                            }, K3 && j10 > j3 && q10 && L && !H);
                                            x60Var2.F();
                                            z11 = K3 && j10 > j3 && !q10 && L && !H;
                                            String N0 = gd.N0(2131743312, null);
                                            final int i30 = 1;
                                            Runnable runnable = new Runnable() { // from class: org.telegram.ui.qv
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    org.telegram.ui.ActionBar.i6 i6Var;
                                                    int i302;
                                                    org.telegram.ui.ActionBar.i6 i6Var2;
                                                    switch (i30) {
                                                        case 0:
                                                            sv svVar2 = svVar;
                                                            bx bxVar2 = svVar2.P0;
                                                            TL_stories.TL_storiesStealthMode tL_storiesStealthMode = org.telegram.messenger.mp.u1(org.telegram.messenger.i10.t0).R1().B;
                                                            View view2 = view;
                                                            if (tL_storiesStealthMode != null) {
                                                                i302 = ((org.telegram.ui.ActionBar.g2) bxVar2).currentAccount;
                                                                if (ConnectionsManager.getInstance(i302).getCurrentTime() < tL_storiesStealthMode.active_until_date) {
                                                                    if (view2 instanceof fi.p) {
                                                                        bxVar2.F0.i((fi.p) view2, false);
                                                                        break;
                                                                    }
                                                                }
                                                            }
                                                            Context context = svVar2.getContext();
                                                            i6Var = ((org.telegram.ui.ActionBar.g2) bxVar2).resourceProvider;
                                                            fi.n5 n5Var = new fi.n5(context, 0.0f, 1, i6Var);
                                                            n5Var.p1 = new rv(svVar2, view2, 1);
                                                            bxVar2.showDialog(n5Var);
                                                            break;
                                                        default:
                                                            sv svVar3 = svVar;
                                                            Context context2 = svVar3.getContext();
                                                            bx bxVar3 = svVar3.P0;
                                                            i6Var2 = ((org.telegram.ui.ActionBar.g2) bxVar3).resourceProvider;
                                                            fi.n5 n5Var2 = new fi.n5(context2, 0.0f, 1, i6Var2);
                                                            n5Var2.p1 = new rv(svVar3, view, 0);
                                                            bxVar3.showDialog(n5Var2);
                                                            break;
                                                    }
                                                }
                                            };
                                            if (z11) {
                                                x60Var2.b(R.drawable.msg_stories_stealth2, lqVar, N0, org.telegram.ui.ActionBar.n6.F8, org.telegram.ui.ActionBar.n6.E8, runnable);
                                                x60Var = x60Var2;
                                            } else {
                                                x60Var = x60Var2;
                                            }
                                            x60Var.F();
                                            final int i31 = 1;
                                            x60Var.l(R.drawable.msg_archive, gd.N0(2131754150, null), new Runnable() { // from class: org.telegram.ui.ov
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    int i242;
                                                    switch (i31) {
                                                        case 0:
                                                            svVar.P0.presentFragment(bn.ua(j10));
                                                            break;
                                                        case 1:
                                                            org.telegram.messenger.g0.h3(new su(svVar.P0, j10, !r2.t4(), 0), 200L);
                                                            break;
                                                        case 2:
                                                            org.telegram.messenger.g0.h3(new su(svVar.P0, j10, !r2.t4(), 0), 200L);
                                                            break;
                                                        case 3:
                                                            bx bxVar2 = svVar.P0;
                                                            i242 = ((org.telegram.ui.ActionBar.g2) bxVar2).currentAccount;
                                                            org.telegram.messenger.ri d02 = org.telegram.messenger.ri.d0(i242);
                                                            long j11 = j10;
                                                            d02.S1(j11);
                                                            bxVar2.getMessagesController().R1().l0(j11, true, false);
                                                            break;
                                                        case 4:
                                                            svVar.P0.F0.j(j10);
                                                            break;
                                                        case 5:
                                                            svVar.P0.presentFragment(bn.ua(j10));
                                                            break;
                                                        default:
                                                            svVar.P0.presentFragment(ProfileActivity.D4(j10));
                                                            break;
                                                    }
                                                }
                                            }, z10 && !bxVar.t4());
                                            x60Var.F();
                                            final int i32 = 2;
                                            x60Var.l(R.drawable.msg_unarchive, gd.N0(2131743667, null), new Runnable() { // from class: org.telegram.ui.ov
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    int i242;
                                                    switch (i32) {
                                                        case 0:
                                                            svVar.P0.presentFragment(bn.ua(j10));
                                                            break;
                                                        case 1:
                                                            org.telegram.messenger.g0.h3(new su(svVar.P0, j10, !r2.t4(), 0), 200L);
                                                            break;
                                                        case 2:
                                                            org.telegram.messenger.g0.h3(new su(svVar.P0, j10, !r2.t4(), 0), 200L);
                                                            break;
                                                        case 3:
                                                            bx bxVar2 = svVar.P0;
                                                            i242 = ((org.telegram.ui.ActionBar.g2) bxVar2).currentAccount;
                                                            org.telegram.messenger.ri d02 = org.telegram.messenger.ri.d0(i242);
                                                            long j11 = j10;
                                                            d02.S1(j11);
                                                            bxVar2.getMessagesController().R1().l0(j11, true, false);
                                                            break;
                                                        case 4:
                                                            svVar.P0.F0.j(j10);
                                                            break;
                                                        case 5:
                                                            svVar.P0.presentFragment(bn.ua(j10));
                                                            break;
                                                        default:
                                                            svVar.P0.presentFragment(ProfileActivity.D4(j10));
                                                            break;
                                                    }
                                                }
                                            }, z10 && bxVar.t4());
                                            x60Var.F();
                                            i17 = 3;
                                            x60Var.l(R.drawable.msg_delete, gd.N0(2131744507, null), new Runnable() { // from class: org.telegram.ui.ov
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    int i242;
                                                    switch (i17) {
                                                        case 0:
                                                            svVar.P0.presentFragment(bn.ua(j10));
                                                            break;
                                                        case 1:
                                                            org.telegram.messenger.g0.h3(new su(svVar.P0, j10, !r2.t4(), 0), 200L);
                                                            break;
                                                        case 2:
                                                            org.telegram.messenger.g0.h3(new su(svVar.P0, j10, !r2.t4(), 0), 200L);
                                                            break;
                                                        case 3:
                                                            bx bxVar2 = svVar.P0;
                                                            i242 = ((org.telegram.ui.ActionBar.g2) bxVar2).currentAccount;
                                                            org.telegram.messenger.ri d02 = org.telegram.messenger.ri.d0(i242);
                                                            long j11 = j10;
                                                            d02.S1(j11);
                                                            bxVar2.getMessagesController().R1().l0(j11, true, false);
                                                            break;
                                                        case 4:
                                                            svVar.P0.F0.j(j10);
                                                            break;
                                                        case 5:
                                                            svVar.P0.presentFragment(bn.ua(j10));
                                                            break;
                                                        default:
                                                            svVar.P0.presentFragment(ProfileActivity.D4(j10));
                                                            break;
                                                    }
                                                }
                                            }, z10);
                                        }
                                    }
                                    z10 = false;
                                    x60 x60Var22 = bxVar.M0;
                                    final int i242 = 5;
                                    x60Var22.l(R.drawable.msg_discussion, gd.N0(2131745405, null), new Runnable() { // from class: org.telegram.ui.ov
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            int i2422;
                                            switch (i242) {
                                                case 0:
                                                    svVar.P0.presentFragment(bn.ua(j10));
                                                    break;
                                                case 1:
                                                    org.telegram.messenger.g0.h3(new su(svVar.P0, j10, !r2.t4(), 0), 200L);
                                                    break;
                                                case 2:
                                                    org.telegram.messenger.g0.h3(new su(svVar.P0, j10, !r2.t4(), 0), 200L);
                                                    break;
                                                case 3:
                                                    bx bxVar2 = svVar.P0;
                                                    i2422 = ((org.telegram.ui.ActionBar.g2) bxVar2).currentAccount;
                                                    org.telegram.messenger.ri d02 = org.telegram.messenger.ri.d0(i2422);
                                                    long j11 = j10;
                                                    d02.S1(j11);
                                                    bxVar2.getMessagesController().R1().l0(j11, true, false);
                                                    break;
                                                case 4:
                                                    svVar.P0.F0.j(j10);
                                                    break;
                                                case 5:
                                                    svVar.P0.presentFragment(bn.ua(j10));
                                                    break;
                                                default:
                                                    svVar.P0.presentFragment(ProfileActivity.D4(j10));
                                                    break;
                                            }
                                        }
                                    }, j10 > j3);
                                    final int i252 = 6;
                                    x60Var22.l(R.drawable.msg_openprofile, gd.N0(2131747592, null), new Runnable() { // from class: org.telegram.ui.ov
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            int i2422;
                                            switch (i252) {
                                                case 0:
                                                    svVar.P0.presentFragment(bn.ua(j10));
                                                    break;
                                                case 1:
                                                    org.telegram.messenger.g0.h3(new su(svVar.P0, j10, !r2.t4(), 0), 200L);
                                                    break;
                                                case 2:
                                                    org.telegram.messenger.g0.h3(new su(svVar.P0, j10, !r2.t4(), 0), 200L);
                                                    break;
                                                case 3:
                                                    bx bxVar2 = svVar.P0;
                                                    i2422 = ((org.telegram.ui.ActionBar.g2) bxVar2).currentAccount;
                                                    org.telegram.messenger.ri d02 = org.telegram.messenger.ri.d0(i2422);
                                                    long j11 = j10;
                                                    d02.S1(j11);
                                                    bxVar2.getMessagesController().R1().l0(j11, true, false);
                                                    break;
                                                case 4:
                                                    svVar.P0.F0.j(j10);
                                                    break;
                                                case 5:
                                                    svVar.P0.presentFragment(bn.ua(j10));
                                                    break;
                                                default:
                                                    svVar.P0.presentFragment(ProfileActivity.D4(j10));
                                                    break;
                                            }
                                        }
                                    }, j10 > j3);
                                    final int i262 = 0;
                                    x60Var22.l(R.drawable.msg_channel, gd.N0(org.telegram.messenger.v3.V(O0) ? 2131747617 : 2131747605, null), new Runnable() { // from class: org.telegram.ui.ov
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            int i2422;
                                            switch (i262) {
                                                case 0:
                                                    svVar.P0.presentFragment(bn.ua(j10));
                                                    break;
                                                case 1:
                                                    org.telegram.messenger.g0.h3(new su(svVar.P0, j10, !r2.t4(), 0), 200L);
                                                    break;
                                                case 2:
                                                    org.telegram.messenger.g0.h3(new su(svVar.P0, j10, !r2.t4(), 0), 200L);
                                                    break;
                                                case 3:
                                                    bx bxVar2 = svVar.P0;
                                                    i2422 = ((org.telegram.ui.ActionBar.g2) bxVar2).currentAccount;
                                                    org.telegram.messenger.ri d02 = org.telegram.messenger.ri.d0(i2422);
                                                    long j11 = j10;
                                                    d02.S1(j11);
                                                    bxVar2.getMessagesController().R1().l0(j11, true, false);
                                                    break;
                                                case 4:
                                                    svVar.P0.F0.j(j10);
                                                    break;
                                                case 5:
                                                    svVar.P0.presentFragment(bn.ua(j10));
                                                    break;
                                                default:
                                                    svVar.P0.presentFragment(ProfileActivity.D4(j10));
                                                    break;
                                            }
                                        }
                                    }, j10 < j3);
                                    final int i272 = 0;
                                    x60Var22.l(R.drawable.msg_mute, gd.N0(2131747669, null), new Runnable() { // from class: org.telegram.ui.pv
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            int i282;
                                            String trim;
                                            int i292;
                                            int i302 = i272;
                                            TLRPC.User user = c22;
                                            String str = v;
                                            sv svVar2 = svVar;
                                            switch (i302) {
                                                case 0:
                                                    bx bxVar2 = svVar2.P0;
                                                    i282 = ((org.telegram.ui.ActionBar.g2) bxVar2).currentAccount;
                                                    org.telegram.messenger.mp.u1(i282).g7.edit().putBoolean("stories_" + str, false).apply();
                                                    bxVar2.getNotificationsController().c0(j10, 0L, true);
                                                    trim = user != null ? user.first_name.trim() : "";
                                                    int indexOf = trim.indexOf(" ");
                                                    if (indexOf > 0) {
                                                        trim = trim.substring(0, indexOf);
                                                    }
                                                    org.telegram.ui.Components.kc.b0(bxVar2).V(Arrays.asList(user), org.telegram.messenger.g0.W2(org.telegram.messenger.gd.a0("NotificationsStoryMutedHint", null, 2131747668, trim)), null, null).j();
                                                    break;
                                                default:
                                                    bx bxVar3 = svVar2.P0;
                                                    i292 = ((org.telegram.ui.ActionBar.g2) bxVar3).currentAccount;
                                                    org.telegram.messenger.mp.u1(i292).g7.edit().putBoolean("stories_" + str, true).apply();
                                                    bxVar3.getNotificationsController().c0(j10, 0L, true);
                                                    trim = user != null ? user.first_name.trim() : "";
                                                    int indexOf2 = trim.indexOf(" ");
                                                    if (indexOf2 > 0) {
                                                        trim = trim.substring(0, indexOf2);
                                                    }
                                                    org.telegram.ui.Components.kc.b0(bxVar3).V(Arrays.asList(user), org.telegram.messenger.g0.W2(org.telegram.messenger.gd.a0("NotificationsStoryUnmutedHint", null, 2131747665, trim)), null, null).j();
                                                    break;
                                            }
                                        }
                                    }, !h02 && j10 > j3);
                                    x60Var22.F();
                                    final int i282 = 1;
                                    x60Var22.l(R.drawable.msg_unmute, gd.N0(2131747666, null), new Runnable() { // from class: org.telegram.ui.pv
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            int i2822;
                                            String trim;
                                            int i292;
                                            int i302 = i282;
                                            TLRPC.User user = c22;
                                            String str = v;
                                            sv svVar2 = svVar;
                                            switch (i302) {
                                                case 0:
                                                    bx bxVar2 = svVar2.P0;
                                                    i2822 = ((org.telegram.ui.ActionBar.g2) bxVar2).currentAccount;
                                                    org.telegram.messenger.mp.u1(i2822).g7.edit().putBoolean("stories_" + str, false).apply();
                                                    bxVar2.getNotificationsController().c0(j10, 0L, true);
                                                    trim = user != null ? user.first_name.trim() : "";
                                                    int indexOf = trim.indexOf(" ");
                                                    if (indexOf > 0) {
                                                        trim = trim.substring(0, indexOf);
                                                    }
                                                    org.telegram.ui.Components.kc.b0(bxVar2).V(Arrays.asList(user), org.telegram.messenger.g0.W2(org.telegram.messenger.gd.a0("NotificationsStoryMutedHint", null, 2131747668, trim)), null, null).j();
                                                    break;
                                                default:
                                                    bx bxVar3 = svVar2.P0;
                                                    i292 = ((org.telegram.ui.ActionBar.g2) bxVar3).currentAccount;
                                                    org.telegram.messenger.mp.u1(i292).g7.edit().putBoolean("stories_" + str, true).apply();
                                                    bxVar3.getNotificationsController().c0(j10, 0L, true);
                                                    trim = user != null ? user.first_name.trim() : "";
                                                    int indexOf2 = trim.indexOf(" ");
                                                    if (indexOf2 > 0) {
                                                        trim = trim.substring(0, indexOf2);
                                                    }
                                                    org.telegram.ui.Components.kc.b0(bxVar3).V(Arrays.asList(user), org.telegram.messenger.g0.W2(org.telegram.messenger.gd.a0("NotificationsStoryUnmutedHint", null, 2131747665, trim)), null, null).j();
                                                    break;
                                            }
                                        }
                                    }, h02 && j10 > j3);
                                    x60Var22.F();
                                    final int i292 = 0;
                                    x60Var22.l(R.drawable.msg_stories_stealth2, gd.N0(2131743312, null), new Runnable() { // from class: org.telegram.ui.qv
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            org.telegram.ui.ActionBar.i6 i6Var;
                                            int i302;
                                            org.telegram.ui.ActionBar.i6 i6Var2;
                                            switch (i292) {
                                                case 0:
                                                    sv svVar2 = svVar;
                                                    bx bxVar2 = svVar2.P0;
                                                    TL_stories.TL_storiesStealthMode tL_storiesStealthMode = org.telegram.messenger.mp.u1(org.telegram.messenger.i10.t0).R1().B;
                                                    View view2 = view;
                                                    if (tL_storiesStealthMode != null) {
                                                        i302 = ((org.telegram.ui.ActionBar.g2) bxVar2).currentAccount;
                                                        if (ConnectionsManager.getInstance(i302).getCurrentTime() < tL_storiesStealthMode.active_until_date) {
                                                            if (view2 instanceof fi.p) {
                                                                bxVar2.F0.i((fi.p) view2, false);
                                                                break;
                                                            }
                                                        }
                                                    }
                                                    Context context = svVar2.getContext();
                                                    i6Var = ((org.telegram.ui.ActionBar.g2) bxVar2).resourceProvider;
                                                    fi.n5 n5Var = new fi.n5(context, 0.0f, 1, i6Var);
                                                    n5Var.p1 = new rv(svVar2, view2, 1);
                                                    bxVar2.showDialog(n5Var);
                                                    break;
                                                default:
                                                    sv svVar3 = svVar;
                                                    Context context2 = svVar3.getContext();
                                                    bx bxVar3 = svVar3.P0;
                                                    i6Var2 = ((org.telegram.ui.ActionBar.g2) bxVar3).resourceProvider;
                                                    fi.n5 n5Var2 = new fi.n5(context2, 0.0f, 1, i6Var2);
                                                    n5Var2.p1 = new rv(svVar3, view, 0);
                                                    bxVar3.showDialog(n5Var2);
                                                    break;
                                            }
                                        }
                                    }, K3 && j10 > j3 && q10 && L && !H);
                                    x60Var22.F();
                                    if (K3) {
                                    }
                                    String N02 = gd.N0(2131743312, null);
                                    final int i302 = 1;
                                    Runnable runnable2 = new Runnable() { // from class: org.telegram.ui.qv
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            org.telegram.ui.ActionBar.i6 i6Var;
                                            int i3022;
                                            org.telegram.ui.ActionBar.i6 i6Var2;
                                            switch (i302) {
                                                case 0:
                                                    sv svVar2 = svVar;
                                                    bx bxVar2 = svVar2.P0;
                                                    TL_stories.TL_storiesStealthMode tL_storiesStealthMode = org.telegram.messenger.mp.u1(org.telegram.messenger.i10.t0).R1().B;
                                                    View view2 = view;
                                                    if (tL_storiesStealthMode != null) {
                                                        i3022 = ((org.telegram.ui.ActionBar.g2) bxVar2).currentAccount;
                                                        if (ConnectionsManager.getInstance(i3022).getCurrentTime() < tL_storiesStealthMode.active_until_date) {
                                                            if (view2 instanceof fi.p) {
                                                                bxVar2.F0.i((fi.p) view2, false);
                                                                break;
                                                            }
                                                        }
                                                    }
                                                    Context context = svVar2.getContext();
                                                    i6Var = ((org.telegram.ui.ActionBar.g2) bxVar2).resourceProvider;
                                                    fi.n5 n5Var = new fi.n5(context, 0.0f, 1, i6Var);
                                                    n5Var.p1 = new rv(svVar2, view2, 1);
                                                    bxVar2.showDialog(n5Var);
                                                    break;
                                                default:
                                                    sv svVar3 = svVar;
                                                    Context context2 = svVar3.getContext();
                                                    bx bxVar3 = svVar3.P0;
                                                    i6Var2 = ((org.telegram.ui.ActionBar.g2) bxVar3).resourceProvider;
                                                    fi.n5 n5Var2 = new fi.n5(context2, 0.0f, 1, i6Var2);
                                                    n5Var2.p1 = new rv(svVar3, view, 0);
                                                    bxVar3.showDialog(n5Var2);
                                                    break;
                                            }
                                        }
                                    };
                                    if (z11) {
                                    }
                                    x60Var.F();
                                    final int i312 = 1;
                                    x60Var.l(R.drawable.msg_archive, gd.N0(2131754150, null), new Runnable() { // from class: org.telegram.ui.ov
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            int i2422;
                                            switch (i312) {
                                                case 0:
                                                    svVar.P0.presentFragment(bn.ua(j10));
                                                    break;
                                                case 1:
                                                    org.telegram.messenger.g0.h3(new su(svVar.P0, j10, !r2.t4(), 0), 200L);
                                                    break;
                                                case 2:
                                                    org.telegram.messenger.g0.h3(new su(svVar.P0, j10, !r2.t4(), 0), 200L);
                                                    break;
                                                case 3:
                                                    bx bxVar2 = svVar.P0;
                                                    i2422 = ((org.telegram.ui.ActionBar.g2) bxVar2).currentAccount;
                                                    org.telegram.messenger.ri d02 = org.telegram.messenger.ri.d0(i2422);
                                                    long j11 = j10;
                                                    d02.S1(j11);
                                                    bxVar2.getMessagesController().R1().l0(j11, true, false);
                                                    break;
                                                case 4:
                                                    svVar.P0.F0.j(j10);
                                                    break;
                                                case 5:
                                                    svVar.P0.presentFragment(bn.ua(j10));
                                                    break;
                                                default:
                                                    svVar.P0.presentFragment(ProfileActivity.D4(j10));
                                                    break;
                                            }
                                        }
                                    }, z10 && !bxVar.t4());
                                    x60Var.F();
                                    final int i322 = 2;
                                    x60Var.l(R.drawable.msg_unarchive, gd.N0(2131743667, null), new Runnable() { // from class: org.telegram.ui.ov
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            int i2422;
                                            switch (i322) {
                                                case 0:
                                                    svVar.P0.presentFragment(bn.ua(j10));
                                                    break;
                                                case 1:
                                                    org.telegram.messenger.g0.h3(new su(svVar.P0, j10, !r2.t4(), 0), 200L);
                                                    break;
                                                case 2:
                                                    org.telegram.messenger.g0.h3(new su(svVar.P0, j10, !r2.t4(), 0), 200L);
                                                    break;
                                                case 3:
                                                    bx bxVar2 = svVar.P0;
                                                    i2422 = ((org.telegram.ui.ActionBar.g2) bxVar2).currentAccount;
                                                    org.telegram.messenger.ri d02 = org.telegram.messenger.ri.d0(i2422);
                                                    long j11 = j10;
                                                    d02.S1(j11);
                                                    bxVar2.getMessagesController().R1().l0(j11, true, false);
                                                    break;
                                                case 4:
                                                    svVar.P0.F0.j(j10);
                                                    break;
                                                case 5:
                                                    svVar.P0.presentFragment(bn.ua(j10));
                                                    break;
                                                default:
                                                    svVar.P0.presentFragment(ProfileActivity.D4(j10));
                                                    break;
                                            }
                                        }
                                    }, z10 && bxVar.t4());
                                    x60Var.F();
                                    i17 = 3;
                                    x60Var.l(R.drawable.msg_delete, gd.N0(2131744507, null), new Runnable() { // from class: org.telegram.ui.ov
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            int i2422;
                                            switch (i17) {
                                                case 0:
                                                    svVar.P0.presentFragment(bn.ua(j10));
                                                    break;
                                                case 1:
                                                    org.telegram.messenger.g0.h3(new su(svVar.P0, j10, !r2.t4(), 0), 200L);
                                                    break;
                                                case 2:
                                                    org.telegram.messenger.g0.h3(new su(svVar.P0, j10, !r2.t4(), 0), 200L);
                                                    break;
                                                case 3:
                                                    bx bxVar2 = svVar.P0;
                                                    i2422 = ((org.telegram.ui.ActionBar.g2) bxVar2).currentAccount;
                                                    org.telegram.messenger.ri d02 = org.telegram.messenger.ri.d0(i2422);
                                                    long j11 = j10;
                                                    d02.S1(j11);
                                                    bxVar2.getMessagesController().R1().l0(j11, true, false);
                                                    break;
                                                case 4:
                                                    svVar.P0.F0.j(j10);
                                                    break;
                                                case 5:
                                                    svVar.P0.presentFragment(bn.ua(j10));
                                                    break;
                                                default:
                                                    svVar.P0.presentFragment(ProfileActivity.D4(j10));
                                                    break;
                                            }
                                        }
                                    }, z10);
                                }
                            }
                            lqVar = null;
                            if (j10 < j3) {
                                final int i232 = 4;
                                bxVar.M0.b(R.drawable.msg_stories_add, null, gd.N0(2131754381, null), org.telegram.ui.ActionBar.n6.F8, org.telegram.ui.ActionBar.n6.E8, new Runnable() { // from class: org.telegram.ui.ov
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        int i2422;
                                        switch (i232) {
                                            case 0:
                                                svVar.P0.presentFragment(bn.ua(j10));
                                                break;
                                            case 1:
                                                org.telegram.messenger.g0.h3(new su(svVar.P0, j10, !r2.t4(), 0), 200L);
                                                break;
                                            case 2:
                                                org.telegram.messenger.g0.h3(new su(svVar.P0, j10, !r2.t4(), 0), 200L);
                                                break;
                                            case 3:
                                                bx bxVar2 = svVar.P0;
                                                i2422 = ((org.telegram.ui.ActionBar.g2) bxVar2).currentAccount;
                                                org.telegram.messenger.ri d02 = org.telegram.messenger.ri.d0(i2422);
                                                long j11 = j10;
                                                d02.S1(j11);
                                                bxVar2.getMessagesController().R1().l0(j11, true, false);
                                                break;
                                            case 4:
                                                svVar.P0.F0.j(j10);
                                                break;
                                            case 5:
                                                svVar.P0.presentFragment(bn.ua(j10));
                                                break;
                                            default:
                                                svVar.P0.presentFragment(ProfileActivity.D4(j10));
                                                break;
                                        }
                                    }
                                });
                            }
                            if (c22 != null) {
                                i18 = ((org.telegram.ui.ActionBar.g2) bxVar).currentAccount;
                                if (ri.d0(i18).I(j10)) {
                                }
                            }
                            z10 = false;
                            x60 x60Var222 = bxVar.M0;
                            final int i2422 = 5;
                            x60Var222.l(R.drawable.msg_discussion, gd.N0(2131745405, null), new Runnable() { // from class: org.telegram.ui.ov
                                @Override // java.lang.Runnable
                                public final void run() {
                                    int i24222;
                                    switch (i2422) {
                                        case 0:
                                            svVar.P0.presentFragment(bn.ua(j10));
                                            break;
                                        case 1:
                                            org.telegram.messenger.g0.h3(new su(svVar.P0, j10, !r2.t4(), 0), 200L);
                                            break;
                                        case 2:
                                            org.telegram.messenger.g0.h3(new su(svVar.P0, j10, !r2.t4(), 0), 200L);
                                            break;
                                        case 3:
                                            bx bxVar2 = svVar.P0;
                                            i24222 = ((org.telegram.ui.ActionBar.g2) bxVar2).currentAccount;
                                            org.telegram.messenger.ri d02 = org.telegram.messenger.ri.d0(i24222);
                                            long j11 = j10;
                                            d02.S1(j11);
                                            bxVar2.getMessagesController().R1().l0(j11, true, false);
                                            break;
                                        case 4:
                                            svVar.P0.F0.j(j10);
                                            break;
                                        case 5:
                                            svVar.P0.presentFragment(bn.ua(j10));
                                            break;
                                        default:
                                            svVar.P0.presentFragment(ProfileActivity.D4(j10));
                                            break;
                                    }
                                }
                            }, j10 > j3);
                            final int i2522 = 6;
                            x60Var222.l(R.drawable.msg_openprofile, gd.N0(2131747592, null), new Runnable() { // from class: org.telegram.ui.ov
                                @Override // java.lang.Runnable
                                public final void run() {
                                    int i24222;
                                    switch (i2522) {
                                        case 0:
                                            svVar.P0.presentFragment(bn.ua(j10));
                                            break;
                                        case 1:
                                            org.telegram.messenger.g0.h3(new su(svVar.P0, j10, !r2.t4(), 0), 200L);
                                            break;
                                        case 2:
                                            org.telegram.messenger.g0.h3(new su(svVar.P0, j10, !r2.t4(), 0), 200L);
                                            break;
                                        case 3:
                                            bx bxVar2 = svVar.P0;
                                            i24222 = ((org.telegram.ui.ActionBar.g2) bxVar2).currentAccount;
                                            org.telegram.messenger.ri d02 = org.telegram.messenger.ri.d0(i24222);
                                            long j11 = j10;
                                            d02.S1(j11);
                                            bxVar2.getMessagesController().R1().l0(j11, true, false);
                                            break;
                                        case 4:
                                            svVar.P0.F0.j(j10);
                                            break;
                                        case 5:
                                            svVar.P0.presentFragment(bn.ua(j10));
                                            break;
                                        default:
                                            svVar.P0.presentFragment(ProfileActivity.D4(j10));
                                            break;
                                    }
                                }
                            }, j10 > j3);
                            final int i2622 = 0;
                            x60Var222.l(R.drawable.msg_channel, gd.N0(org.telegram.messenger.v3.V(O0) ? 2131747617 : 2131747605, null), new Runnable() { // from class: org.telegram.ui.ov
                                @Override // java.lang.Runnable
                                public final void run() {
                                    int i24222;
                                    switch (i2622) {
                                        case 0:
                                            svVar.P0.presentFragment(bn.ua(j10));
                                            break;
                                        case 1:
                                            org.telegram.messenger.g0.h3(new su(svVar.P0, j10, !r2.t4(), 0), 200L);
                                            break;
                                        case 2:
                                            org.telegram.messenger.g0.h3(new su(svVar.P0, j10, !r2.t4(), 0), 200L);
                                            break;
                                        case 3:
                                            bx bxVar2 = svVar.P0;
                                            i24222 = ((org.telegram.ui.ActionBar.g2) bxVar2).currentAccount;
                                            org.telegram.messenger.ri d02 = org.telegram.messenger.ri.d0(i24222);
                                            long j11 = j10;
                                            d02.S1(j11);
                                            bxVar2.getMessagesController().R1().l0(j11, true, false);
                                            break;
                                        case 4:
                                            svVar.P0.F0.j(j10);
                                            break;
                                        case 5:
                                            svVar.P0.presentFragment(bn.ua(j10));
                                            break;
                                        default:
                                            svVar.P0.presentFragment(ProfileActivity.D4(j10));
                                            break;
                                    }
                                }
                            }, j10 < j3);
                            final int i2722 = 0;
                            x60Var222.l(R.drawable.msg_mute, gd.N0(2131747669, null), new Runnable() { // from class: org.telegram.ui.pv
                                @Override // java.lang.Runnable
                                public final void run() {
                                    int i2822;
                                    String trim;
                                    int i2922;
                                    int i3022 = i2722;
                                    TLRPC.User user = c22;
                                    String str = v;
                                    sv svVar2 = svVar;
                                    switch (i3022) {
                                        case 0:
                                            bx bxVar2 = svVar2.P0;
                                            i2822 = ((org.telegram.ui.ActionBar.g2) bxVar2).currentAccount;
                                            org.telegram.messenger.mp.u1(i2822).g7.edit().putBoolean("stories_" + str, false).apply();
                                            bxVar2.getNotificationsController().c0(j10, 0L, true);
                                            trim = user != null ? user.first_name.trim() : "";
                                            int indexOf = trim.indexOf(" ");
                                            if (indexOf > 0) {
                                                trim = trim.substring(0, indexOf);
                                            }
                                            org.telegram.ui.Components.kc.b0(bxVar2).V(Arrays.asList(user), org.telegram.messenger.g0.W2(org.telegram.messenger.gd.a0("NotificationsStoryMutedHint", null, 2131747668, trim)), null, null).j();
                                            break;
                                        default:
                                            bx bxVar3 = svVar2.P0;
                                            i2922 = ((org.telegram.ui.ActionBar.g2) bxVar3).currentAccount;
                                            org.telegram.messenger.mp.u1(i2922).g7.edit().putBoolean("stories_" + str, true).apply();
                                            bxVar3.getNotificationsController().c0(j10, 0L, true);
                                            trim = user != null ? user.first_name.trim() : "";
                                            int indexOf2 = trim.indexOf(" ");
                                            if (indexOf2 > 0) {
                                                trim = trim.substring(0, indexOf2);
                                            }
                                            org.telegram.ui.Components.kc.b0(bxVar3).V(Arrays.asList(user), org.telegram.messenger.g0.W2(org.telegram.messenger.gd.a0("NotificationsStoryUnmutedHint", null, 2131747665, trim)), null, null).j();
                                            break;
                                    }
                                }
                            }, !h02 && j10 > j3);
                            x60Var222.F();
                            final int i2822 = 1;
                            x60Var222.l(R.drawable.msg_unmute, gd.N0(2131747666, null), new Runnable() { // from class: org.telegram.ui.pv
                                @Override // java.lang.Runnable
                                public final void run() {
                                    int i28222;
                                    String trim;
                                    int i2922;
                                    int i3022 = i2822;
                                    TLRPC.User user = c22;
                                    String str = v;
                                    sv svVar2 = svVar;
                                    switch (i3022) {
                                        case 0:
                                            bx bxVar2 = svVar2.P0;
                                            i28222 = ((org.telegram.ui.ActionBar.g2) bxVar2).currentAccount;
                                            org.telegram.messenger.mp.u1(i28222).g7.edit().putBoolean("stories_" + str, false).apply();
                                            bxVar2.getNotificationsController().c0(j10, 0L, true);
                                            trim = user != null ? user.first_name.trim() : "";
                                            int indexOf = trim.indexOf(" ");
                                            if (indexOf > 0) {
                                                trim = trim.substring(0, indexOf);
                                            }
                                            org.telegram.ui.Components.kc.b0(bxVar2).V(Arrays.asList(user), org.telegram.messenger.g0.W2(org.telegram.messenger.gd.a0("NotificationsStoryMutedHint", null, 2131747668, trim)), null, null).j();
                                            break;
                                        default:
                                            bx bxVar3 = svVar2.P0;
                                            i2922 = ((org.telegram.ui.ActionBar.g2) bxVar3).currentAccount;
                                            org.telegram.messenger.mp.u1(i2922).g7.edit().putBoolean("stories_" + str, true).apply();
                                            bxVar3.getNotificationsController().c0(j10, 0L, true);
                                            trim = user != null ? user.first_name.trim() : "";
                                            int indexOf2 = trim.indexOf(" ");
                                            if (indexOf2 > 0) {
                                                trim = trim.substring(0, indexOf2);
                                            }
                                            org.telegram.ui.Components.kc.b0(bxVar3).V(Arrays.asList(user), org.telegram.messenger.g0.W2(org.telegram.messenger.gd.a0("NotificationsStoryUnmutedHint", null, 2131747665, trim)), null, null).j();
                                            break;
                                    }
                                }
                            }, h02 && j10 > j3);
                            x60Var222.F();
                            final int i2922 = 0;
                            x60Var222.l(R.drawable.msg_stories_stealth2, gd.N0(2131743312, null), new Runnable() { // from class: org.telegram.ui.qv
                                @Override // java.lang.Runnable
                                public final void run() {
                                    org.telegram.ui.ActionBar.i6 i6Var;
                                    int i3022;
                                    org.telegram.ui.ActionBar.i6 i6Var2;
                                    switch (i2922) {
                                        case 0:
                                            sv svVar2 = svVar;
                                            bx bxVar2 = svVar2.P0;
                                            TL_stories.TL_storiesStealthMode tL_storiesStealthMode = org.telegram.messenger.mp.u1(org.telegram.messenger.i10.t0).R1().B;
                                            View view2 = view;
                                            if (tL_storiesStealthMode != null) {
                                                i3022 = ((org.telegram.ui.ActionBar.g2) bxVar2).currentAccount;
                                                if (ConnectionsManager.getInstance(i3022).getCurrentTime() < tL_storiesStealthMode.active_until_date) {
                                                    if (view2 instanceof fi.p) {
                                                        bxVar2.F0.i((fi.p) view2, false);
                                                        break;
                                                    }
                                                }
                                            }
                                            Context context = svVar2.getContext();
                                            i6Var = ((org.telegram.ui.ActionBar.g2) bxVar2).resourceProvider;
                                            fi.n5 n5Var = new fi.n5(context, 0.0f, 1, i6Var);
                                            n5Var.p1 = new rv(svVar2, view2, 1);
                                            bxVar2.showDialog(n5Var);
                                            break;
                                        default:
                                            sv svVar3 = svVar;
                                            Context context2 = svVar3.getContext();
                                            bx bxVar3 = svVar3.P0;
                                            i6Var2 = ((org.telegram.ui.ActionBar.g2) bxVar3).resourceProvider;
                                            fi.n5 n5Var2 = new fi.n5(context2, 0.0f, 1, i6Var2);
                                            n5Var2.p1 = new rv(svVar3, view, 0);
                                            bxVar3.showDialog(n5Var2);
                                            break;
                                    }
                                }
                            }, K3 && j10 > j3 && q10 && L && !H);
                            x60Var222.F();
                            if (K3) {
                            }
                            String N022 = gd.N0(2131743312, null);
                            final int i3022 = 1;
                            Runnable runnable22 = new Runnable() { // from class: org.telegram.ui.qv
                                @Override // java.lang.Runnable
                                public final void run() {
                                    org.telegram.ui.ActionBar.i6 i6Var;
                                    int i30222;
                                    org.telegram.ui.ActionBar.i6 i6Var2;
                                    switch (i3022) {
                                        case 0:
                                            sv svVar2 = svVar;
                                            bx bxVar2 = svVar2.P0;
                                            TL_stories.TL_storiesStealthMode tL_storiesStealthMode = org.telegram.messenger.mp.u1(org.telegram.messenger.i10.t0).R1().B;
                                            View view2 = view;
                                            if (tL_storiesStealthMode != null) {
                                                i30222 = ((org.telegram.ui.ActionBar.g2) bxVar2).currentAccount;
                                                if (ConnectionsManager.getInstance(i30222).getCurrentTime() < tL_storiesStealthMode.active_until_date) {
                                                    if (view2 instanceof fi.p) {
                                                        bxVar2.F0.i((fi.p) view2, false);
                                                        break;
                                                    }
                                                }
                                            }
                                            Context context = svVar2.getContext();
                                            i6Var = ((org.telegram.ui.ActionBar.g2) bxVar2).resourceProvider;
                                            fi.n5 n5Var = new fi.n5(context, 0.0f, 1, i6Var);
                                            n5Var.p1 = new rv(svVar2, view2, 1);
                                            bxVar2.showDialog(n5Var);
                                            break;
                                        default:
                                            sv svVar3 = svVar;
                                            Context context2 = svVar3.getContext();
                                            bx bxVar3 = svVar3.P0;
                                            i6Var2 = ((org.telegram.ui.ActionBar.g2) bxVar3).resourceProvider;
                                            fi.n5 n5Var2 = new fi.n5(context2, 0.0f, 1, i6Var2);
                                            n5Var2.p1 = new rv(svVar3, view, 0);
                                            bxVar3.showDialog(n5Var2);
                                            break;
                                    }
                                }
                            };
                            if (z11) {
                            }
                            x60Var.F();
                            final int i3122 = 1;
                            x60Var.l(R.drawable.msg_archive, gd.N0(2131754150, null), new Runnable() { // from class: org.telegram.ui.ov
                                @Override // java.lang.Runnable
                                public final void run() {
                                    int i24222;
                                    switch (i3122) {
                                        case 0:
                                            svVar.P0.presentFragment(bn.ua(j10));
                                            break;
                                        case 1:
                                            org.telegram.messenger.g0.h3(new su(svVar.P0, j10, !r2.t4(), 0), 200L);
                                            break;
                                        case 2:
                                            org.telegram.messenger.g0.h3(new su(svVar.P0, j10, !r2.t4(), 0), 200L);
                                            break;
                                        case 3:
                                            bx bxVar2 = svVar.P0;
                                            i24222 = ((org.telegram.ui.ActionBar.g2) bxVar2).currentAccount;
                                            org.telegram.messenger.ri d02 = org.telegram.messenger.ri.d0(i24222);
                                            long j11 = j10;
                                            d02.S1(j11);
                                            bxVar2.getMessagesController().R1().l0(j11, true, false);
                                            break;
                                        case 4:
                                            svVar.P0.F0.j(j10);
                                            break;
                                        case 5:
                                            svVar.P0.presentFragment(bn.ua(j10));
                                            break;
                                        default:
                                            svVar.P0.presentFragment(ProfileActivity.D4(j10));
                                            break;
                                    }
                                }
                            }, z10 && !bxVar.t4());
                            x60Var.F();
                            final int i3222 = 2;
                            x60Var.l(R.drawable.msg_unarchive, gd.N0(2131743667, null), new Runnable() { // from class: org.telegram.ui.ov
                                @Override // java.lang.Runnable
                                public final void run() {
                                    int i24222;
                                    switch (i3222) {
                                        case 0:
                                            svVar.P0.presentFragment(bn.ua(j10));
                                            break;
                                        case 1:
                                            org.telegram.messenger.g0.h3(new su(svVar.P0, j10, !r2.t4(), 0), 200L);
                                            break;
                                        case 2:
                                            org.telegram.messenger.g0.h3(new su(svVar.P0, j10, !r2.t4(), 0), 200L);
                                            break;
                                        case 3:
                                            bx bxVar2 = svVar.P0;
                                            i24222 = ((org.telegram.ui.ActionBar.g2) bxVar2).currentAccount;
                                            org.telegram.messenger.ri d02 = org.telegram.messenger.ri.d0(i24222);
                                            long j11 = j10;
                                            d02.S1(j11);
                                            bxVar2.getMessagesController().R1().l0(j11, true, false);
                                            break;
                                        case 4:
                                            svVar.P0.F0.j(j10);
                                            break;
                                        case 5:
                                            svVar.P0.presentFragment(bn.ua(j10));
                                            break;
                                        default:
                                            svVar.P0.presentFragment(ProfileActivity.D4(j10));
                                            break;
                                    }
                                }
                            }, z10 && bxVar.t4());
                            x60Var.F();
                            i17 = 3;
                            x60Var.l(R.drawable.msg_delete, gd.N0(2131744507, null), new Runnable() { // from class: org.telegram.ui.ov
                                @Override // java.lang.Runnable
                                public final void run() {
                                    int i24222;
                                    switch (i17) {
                                        case 0:
                                            svVar.P0.presentFragment(bn.ua(j10));
                                            break;
                                        case 1:
                                            org.telegram.messenger.g0.h3(new su(svVar.P0, j10, !r2.t4(), 0), 200L);
                                            break;
                                        case 2:
                                            org.telegram.messenger.g0.h3(new su(svVar.P0, j10, !r2.t4(), 0), 200L);
                                            break;
                                        case 3:
                                            bx bxVar2 = svVar.P0;
                                            i24222 = ((org.telegram.ui.ActionBar.g2) bxVar2).currentAccount;
                                            org.telegram.messenger.ri d02 = org.telegram.messenger.ri.d0(i24222);
                                            long j11 = j10;
                                            d02.S1(j11);
                                            bxVar2.getMessagesController().R1().l0(j11, true, false);
                                            break;
                                        case 4:
                                            svVar.P0.F0.j(j10);
                                            break;
                                        case 5:
                                            svVar.P0.presentFragment(bn.ua(j10));
                                            break;
                                        default:
                                            svVar.P0.presentFragment(ProfileActivity.D4(j10));
                                            break;
                                    }
                                }
                            }, z10);
                        } else if (bxVar.P3) {
                            x60 x60Var3 = bxVar.M0;
                            String N03 = gd.N0(2131754381, null);
                            int i33 = org.telegram.ui.ActionBar.n6.F8;
                            int i34 = org.telegram.ui.ActionBar.n6.E8;
                            x60Var3.b(R.drawable.msg_stories_add, null, N03, i33, i34, new Runnable() { // from class: org.telegram.ui.nv
                                @Override // java.lang.Runnable
                                public final void run() {
                                    int i35;
                                    int i36;
                                    switch (i21) {
                                        case 0:
                                            svVar.P0.F0.j(0L);
                                            break;
                                        case 1:
                                            Bundle bundle = new Bundle();
                                            bx bxVar2 = svVar.P0;
                                            i35 = ((org.telegram.ui.ActionBar.g2) bxVar2).currentAccount;
                                            bundle.putLong("dialog_id", org.telegram.messenger.i10.i(i35).e());
                                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                            bundle.putInt("start_from", 9);
                                            bxVar2.presentFragment(new org.telegram.ui.Components.h90(bundle, null));
                                            break;
                                        default:
                                            Bundle bundle2 = new Bundle();
                                            bx bxVar3 = svVar.P0;
                                            i36 = ((org.telegram.ui.ActionBar.g2) bxVar3).currentAccount;
                                            bundle2.putLong("dialog_id", org.telegram.messenger.i10.i(i36).e());
                                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                            bxVar3.presentFragment(new org.telegram.ui.Components.h90(bundle2, null));
                                            break;
                                    }
                                }
                            });
                            bxVar.M0.b(R.drawable.msg_stories_archive, null, gd.N0(2131754120, null), i33, i34, new Runnable() { // from class: org.telegram.ui.nv
                                @Override // java.lang.Runnable
                                public final void run() {
                                    int i35;
                                    int i36;
                                    switch (i22) {
                                        case 0:
                                            svVar.P0.F0.j(0L);
                                            break;
                                        case 1:
                                            Bundle bundle = new Bundle();
                                            bx bxVar2 = svVar.P0;
                                            i35 = ((org.telegram.ui.ActionBar.g2) bxVar2).currentAccount;
                                            bundle.putLong("dialog_id", org.telegram.messenger.i10.i(i35).e());
                                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                            bundle.putInt("start_from", 9);
                                            bxVar2.presentFragment(new org.telegram.ui.Components.h90(bundle, null));
                                            break;
                                        default:
                                            Bundle bundle2 = new Bundle();
                                            bx bxVar3 = svVar.P0;
                                            i36 = ((org.telegram.ui.ActionBar.g2) bxVar3).currentAccount;
                                            bundle2.putLong("dialog_id", org.telegram.messenger.i10.i(i36).e());
                                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                            bxVar3.presentFragment(new org.telegram.ui.Components.h90(bundle2, null));
                                            break;
                                    }
                                }
                            });
                            bxVar.M0.b(R.drawable.msg_stories_saved, null, gd.N0(2131745689, null), i33, i34, new Runnable() { // from class: org.telegram.ui.nv
                                @Override // java.lang.Runnable
                                public final void run() {
                                    int i35;
                                    int i36;
                                    switch (i20) {
                                        case 0:
                                            svVar.P0.F0.j(0L);
                                            break;
                                        case 1:
                                            Bundle bundle = new Bundle();
                                            bx bxVar2 = svVar.P0;
                                            i35 = ((org.telegram.ui.ActionBar.g2) bxVar2).currentAccount;
                                            bundle.putLong("dialog_id", org.telegram.messenger.i10.i(i35).e());
                                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                            bundle.putInt("start_from", 9);
                                            bxVar2.presentFragment(new org.telegram.ui.Components.h90(bundle, null));
                                            break;
                                        default:
                                            Bundle bundle2 = new Bundle();
                                            bx bxVar3 = svVar.P0;
                                            i36 = ((org.telegram.ui.ActionBar.g2) bxVar3).currentAccount;
                                            bundle2.putLong("dialog_id", org.telegram.messenger.i10.i(i36).e());
                                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                            bxVar3.presentFragment(new org.telegram.ui.Components.h90(bundle2, null));
                                            break;
                                    }
                                }
                            });
                            i17 = 3;
                        } else {
                            sv svVar2 = bxVar.F0;
                            if (svVar2 != null) {
                                svVar2.n();
                            }
                        }
                        x60 x60Var4 = bxVar.M0;
                        x60Var4.i = i17;
                        x60Var4.b0(org.telegram.messenger.g0.L(-8.0f), org.telegram.messenger.g0.L(-10.0f));
                        x60Var4.a0();
                        return false;
                    }
                    q2Var.a();
                }
                return false;
            case 15:
                eq0 eq0Var = ((gi.m) obj).a0;
                if (eq0Var.H.F1 || !(view instanceof org.telegram.ui.Cells.o7)) {
                    return false;
                }
                fj messageObject = ((org.telegram.ui.Cells.o7) view).getMessageObject();
                if (eq0Var.c(messageObject)) {
                    eq0Var.g(messageObject);
                } else {
                    eq0Var.e(messageObject);
                }
                return true;
            default:
                hi.m3 m3Var = (hi.m3) obj;
                ArrayList arrayList = m3Var.c0;
                ArrayList arrayList2 = m3Var.i0;
                if (i7 < 2 || m3Var.a0 == null || !(view instanceof hi.i3)) {
                    return false;
                }
                int i35 = i7 - 2;
                if (m3Var.d0) {
                    if (i35 == 0) {
                        return false;
                    }
                    i35 = i7 - 3;
                } else if (m3Var.e0) {
                    if (i35 >= 0 && i35 < arrayList.size()) {
                        return false;
                    }
                    i35 -= arrayList.size();
                }
                if (i35 < 0 || i35 >= m3Var.g0.size()) {
                    return false;
                }
                ef efVar = (ef) m3Var.g0.get(i35);
                if (!arrayList2.isEmpty() || m3Var.R) {
                    return false;
                }
                if (arrayList2.contains(efVar)) {
                    arrayList2.remove(efVar);
                } else {
                    if (arrayList2.size() + 1 > m3Var.S) {
                        int i36 = -m3Var.O;
                        m3Var.O = i36;
                        org.telegram.messenger.g0.E3(i36, view, null);
                        q2Var.a();
                        return true;
                    }
                    arrayList2.add(efVar);
                }
                org.telegram.messenger.g0.Z3(m3Var.d);
                m3Var.j();
                return true;
        }
    }

    @Override // fi.x6
    public void c(boolean z10) {
        fi.a5 a5Var = (fi.a5) this.b;
        if (a5Var != null) {
            a5Var.c();
        }
    }

    @Override // org.telegram.messenger.q10
    public Object d(Number number, Object obj) {
        int i7 = this.a;
        Object obj2 = this.b;
        switch (i7) {
            case 6:
                return fi.t0.a((fi.t0) obj2, (Long) obj);
            default:
                eq0 eq0Var = (eq0) obj2;
                if (((Integer) number).intValue() != -1) {
                    return Boolean.FALSE;
                }
                new gi.p(eq0Var.a, gd.N0(2131746497, null), new ai.d0(eq0Var, 20)).show();
                return Boolean.TRUE;
        }
    }

    @Override // org.telegram.ui.jl0
    public void e(int i7) {
        switch (this.a) {
            case 0:
                org.telegram.ui.Wallet.f0 f0Var = (org.telegram.ui.Wallet.f0) this.b;
                if (i7 != 1) {
                    if (i7 != 3) {
                        f0Var.a(Boolean.FALSE, null);
                        break;
                    }
                } else {
                    f0Var.a(Boolean.TRUE, null);
                    break;
                }
                break;
            default:
                bi.h8 h8Var = (bi.h8) this.b;
                if (i7 != 1) {
                    if (i7 != 3) {
                        h8Var.a(Boolean.FALSE, null);
                        break;
                    }
                } else {
                    h8Var.a(Boolean.TRUE, null);
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.gj0
    public void f() {
        ((hi.w1) this.b).invalidate();
    }

    @Override // org.telegram.ui.Components.rj0
    public void g(float f10, float f11, int i7, View view) {
        long j3;
        int i10;
        int i11;
        int i12;
        fi.a2 a2Var = (fi.a2) this.b;
        b1 b1Var = a2Var.c;
        ArrayList arrayList = a2Var.r;
        fi.s0 s0Var = ((fi.q0) view).f;
        int i13 = a2Var.O;
        int currentTime = ConnectionsManager.getInstance(i13).getCurrentTime();
        HashSet hashSet = new HashSet();
        int i14 = 0;
        int i15 = 0;
        while (true) {
            if (i15 >= s0Var.f.size()) {
                break;
            }
            fi.r0 r0Var = (fi.r0) s0Var.f.get(i15);
            long j10 = r0Var.g;
            if (j10 > 0 && currentTime - r0Var.d <= fi.t.b(i13, (int) j10, 0)) {
                hashSet.add(Integer.valueOf(r0Var.a));
            }
            i15++;
        }
        fi.c1 c1Var = a2Var.Q;
        long j11 = c1Var != null ? c1Var.j() : 0L;
        int i16 = 0;
        int i17 = 0;
        while (i16 < arrayList.size()) {
            fi.r0 r0Var2 = (fi.r0) arrayList.get(i16);
            if (r0Var2.b || !r0Var2.e || r0Var2.g >= j11) {
                if (hashSet.contains(Integer.valueOf(r0Var2.a))) {
                    j3 = j11;
                    if (a2Var.x != s0Var.b || (i12 = a2Var.y) == 0 || r0Var2.a < i12) {
                        i10 = r0Var2.a;
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
                fi.r0 r0Var3 = (fi.r0) arrayList.get(i14);
                if (r0Var3.b || !r0Var3.e || r0Var3.g >= j3) {
                    if (hashSet.contains(Integer.valueOf(r0Var3.a))) {
                        i11 = r0Var3.a;
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
        a2Var.x = s0Var.b;
        a2Var.y = i11;
        a2Var.E = true;
        v4.n0 itemAnimator = b1Var.getItemAnimator();
        b1Var.setItemAnimator(null);
        a2Var.d.i1(i17, b1Var.getHeight() / 2, true);
        a2Var.e.g(i17);
        b1Var.setItemAnimator(itemAnimator);
    }

    @Override // f3.g
    public long h(long j3) {
        return h2.l0.j((j3 * r0.e) / 1000000, 0L, ((f3.u) this.b).j - 1);
    }

    @Override // org.telegram.ui.ActionBar.q1
    public void i(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        switch (this.a) {
            case 17:
                hi.nb nbVar = ((hi.db) ((hi.s) this.b)).S1;
                hi.bb bbVar = nbVar.Y0;
                if (bbVar != null) {
                    bbVar.s(null, null, true);
                }
                hi.pa paVar = nbVar.w1;
                if (paVar != null) {
                    paVar.p0();
                }
                hi.db dbVar = nbVar.d1;
                if (dbVar != null) {
                    dbVar.setHasRoundVideo(false);
                }
                hi.x7 x7Var = nbVar.L1;
                if (x7Var != null) {
                    File file = x7Var.o0;
                    if (file != null) {
                        try {
                            file.delete();
                        } catch (Exception unused) {
                        }
                        nbVar.L1.o0 = null;
                    }
                    if (nbVar.L1.p0 != null) {
                        try {
                            new File(nbVar.L1.p0).delete();
                        } catch (Exception unused2) {
                        }
                        nbVar.L1.p0 = null;
                        break;
                    }
                }
                break;
            case 24:
                ((hi.o5) this.b).a.d2.r();
                break;
            default:
                ((TwoStepVerificationActivity) this.b).presentFragment(new za1(6, null));
                break;
        }
    }

    @Override // org.telegram.ui.Components.qt0
    public /* synthetic */ float j(RecyclerView recyclerView) {
        return org.telegram.ui.Cells.c0.c(recyclerView);
    }

    @Override // org.telegram.messenger.u10
    public void k(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        org.telegram.ui.ActionBar.g2 T;
        switch (this.a) {
            case 2:
                mb mbVar = (mb) this.b;
                n41 n41Var = (n41) obj;
                Object obj3 = n41Var.H;
                if (obj3 instanceof TL_stars.StarsTransaction) {
                    pb.l1(mbVar.getContext(), false, 0L, mbVar.c, (TL_stars.StarsTransaction) n41Var.H, mbVar.b);
                    break;
                } else if ((obj3 instanceof TL_wallet.walletTransaction) && (T = LaunchActivity.T()) != null) {
                    T.presentFragment(new org.telegram.ui.Wallet.o6());
                    break;
                }
                break;
            case 22:
                hi.ga gaVar = (hi.ga) this.b;
                n41 n41Var2 = (n41) obj;
                int i7 = n41Var2.d;
                hi.x7 x7Var = (hi.x7) n41Var2.H;
                gaVar.c(false, true);
                hi.nb nbVar = gaVar.P;
                if (x7Var != nbVar.L1 && !nbVar.Y1) {
                    nbVar.e1.setSelected(i7);
                    nbVar.Y1 = true;
                    ai.u0 u0Var = new ai.u0(nbVar, i7, 14);
                    hi.pa paVar = nbVar.w1;
                    hi.x7 x7Var2 = nbVar.L1;
                    if (paVar != null && x7Var2 != null) {
                        if (paVar.t0()) {
                            x7Var2.f();
                            Utilities.g.c(new hi.p9(nbVar, paVar, x7Var2.i0, x7Var2.j0, x7Var2, paVar.y0.getPainting().E, paVar.t0(), u0Var, 0));
                            break;
                        } else {
                            u0Var.run();
                            break;
                        }
                    } else {
                        u0Var.run();
                        break;
                    }
                }
                break;
            default:
                kg.e1 e1Var = (kg.e1) this.b;
                n41 n41Var3 = (n41) obj;
                View view = (View) obj2;
                float floatValue = ((Float) serializable).floatValue();
                int i10 = n41Var3.d;
                if (i10 == -1) {
                    boolean z10 = !e1Var.d;
                    e1Var.d = z10;
                    ((org.telegram.ui.Cells.r8) view).setChecked(z10);
                    e1Var.a.g3.O(true);
                    e1Var.d0(true);
                    break;
                } else if (i10 == -2) {
                    kg.y1 y1Var = new kg.y1(null);
                    y1Var.n = e1Var.n;
                    y1Var.c = new ai.s1(26, e1Var, view);
                    e1Var.presentFragment(y1Var);
                    break;
                } else if (n41Var3.a == 5 && i10 >= 0 && i10 < e1Var.f.length) {
                    if (!gd.a0 ? floatValue < view.getMeasuredWidth() - org.telegram.messenger.g0.L(76.0f) : floatValue > org.telegram.messenger.g0.L(76.0f)) {
                        int i11 = (n41Var3.d + 6) % 7;
                        int i12 = 0;
                        for (int i13 = 0; i13 < e1Var.f[i11].size(); i13++) {
                            if (((kg.d1) e1Var.f[i11].get(i13)).b > i12) {
                                i12 = ((kg.d1) e1Var.f[i11].get(i13)).b;
                            }
                        }
                        int max = Math.max(0, i12 - 1439);
                        int i14 = (n41Var3.d + 1) % 7;
                        int i15 = 1440;
                        for (int i16 = 0; i16 < e1Var.f[i14].size(); i16++) {
                            if (((kg.d1) e1Var.f[i14].get(i16)).a < i15) {
                                i15 = ((kg.d1) e1Var.f[i14].get(i16)).a;
                            }
                        }
                        int i17 = i15 + 1439;
                        CharSequence charSequence = n41Var3.m;
                        ArrayList arrayList = e1Var.f[n41Var3.d];
                        int i18 = 0;
                        for (int i19 = 0; i19 < 7; i19++) {
                            ArrayList arrayList2 = e1Var.f[i19];
                            if (arrayList2 != null) {
                                i18 = Math.max(1, arrayList2.size()) + i18;
                            }
                        }
                        kg.h1 h1Var = new kg.h1(charSequence, arrayList, max, i17, 28 - i18);
                        h1Var.f = new kg.i0(e1Var, 3);
                        h1Var.h = new ji.f(6, e1Var, n41Var3);
                        e1Var.presentFragment(h1Var);
                        break;
                    } else {
                        if (e1Var.f[n41Var3.d].isEmpty()) {
                            ((org.telegram.ui.Cells.i5) view).setChecked(true);
                            e1Var.f[n41Var3.d].add(new kg.d1(0, 1439));
                            e1Var.c0(n41Var3.d);
                        } else {
                            e1Var.f[n41Var3.d].clear();
                            ((org.telegram.ui.Cells.i5) view).setChecked(false);
                        }
                        ((org.telegram.ui.Cells.i5) view).setValue(kg.e1.f0(e1Var.f[n41Var3.d]));
                        e1Var.d0(true);
                        break;
                    }
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.qt0
    public RecyclerView l(View view) {
        ((ob) this.b).getClass();
        return ((mb) view).a;
    }

    @Override // r0.m
    public r0.l1 l1(View view, r0.l1 l1Var) {
        fi.f9 f9Var = (fi.f9) this.b;
        i0.b I0 = org.telegram.messenger.g0.I0(l1Var, false);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) f9Var.w.getLayoutParams();
        marginLayoutParams.topMargin = f9Var.c ? 0 : l1Var.d();
        marginLayoutParams.bottomMargin = f9Var.c ? l1Var.a.f(2).d : l1Var.a();
        marginLayoutParams.leftMargin = I0.a;
        marginLayoutParams.rightMargin = I0.c;
        fi.t8 t8Var = f9Var.s;
        if (t8Var != null) {
            t8Var.requestLayout();
        }
        fi.u8 u8Var = f9Var.w;
        if (u8Var != null) {
            u8Var.requestLayout();
        }
        return r0.l1.b;
    }

    @Override // hi.m7
    public float m(CharSequence charSequence) {
        return ((TextPaint) this.b).measureText(charSequence, 0, charSequence.length());
    }

    @Override // fi.z8
    public void n(float f10, Canvas canvas, RectF rectF, boolean z10) {
        Path path = (Path) this.b;
        if (z10) {
            return;
        }
        path.rewind();
        float pow = (float) Math.pow(f10, 2.0d);
        path.addCircle((rectF.right + org.telegram.messenger.g0.L(7.0f)) - (org.telegram.messenger.g0.L(14.0f) * pow), (rectF.bottom + org.telegram.messenger.g0.L(7.0f)) - (org.telegram.messenger.g0.L(14.0f) * pow), org.telegram.messenger.g0.L(11.0f), Path.Direction.CW);
        canvas.clipPath(path, Region.Op.DIFFERENCE);
    }

    @Override // xh.j
    public void o(xh.f fVar, float f10, float f11) {
        fi.v7 v7Var = (fi.v7) this.b;
        if (v7Var.v.y) {
            return;
        }
        fVar.q = new fi.u7(v7Var, 2);
        float sqrt = (float) Math.sqrt(Math.pow(r1.getHeight(), 2.0d) + Math.pow(r1.getWidth(), 2.0d));
        ArrayList arrayList = v7Var.i;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            ((xh.f) obj).j(f10, f11, sqrt, false);
        }
    }

    @Override // org.telegram.messenger.camera.CameraController.VideoTakeCallback
    public void onFinishVideoRecording(String str, long j3) {
        hi.ka kaVar = (hi.ka) this.b;
        hi.nb nbVar = kaVar.a;
        hi.n6 n6Var = nbVar.P0;
        int i7 = nbVar.c;
        if (n6Var != null) {
            n6Var.g(true);
        }
        if (nbVar.p0()) {
            nbVar.s.d();
        }
        if (nbVar.H1 == null || nbVar.C0 == null) {
            return;
        }
        nbVar.R1 = false;
        nbVar.S1 = false;
        hi.j6 j6Var = nbVar.D0;
        if (j6Var != null) {
            j6Var.c(false);
        }
        if (j3 <= 800) {
            nbVar.g(false, true);
            nbVar.c0(false);
            nbVar.K0.b(false, true);
            hi.n6 n6Var2 = nbVar.P0;
            if (n6Var2 != null) {
                n6Var2.g(true);
            }
            try {
                nbVar.H1.delete();
                nbVar.H1 = null;
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
            if (str != null) {
                try {
                    new File(str).delete();
                    return;
                } catch (Exception e11) {
                    org.telegram.messenger.a8.g(e11, true);
                    return;
                }
            }
            return;
        }
        nbVar.h0(false, true);
        hi.x7 o4 = hi.x7.o(nbVar.H1, str, j3);
        o4.J0 = nbVar.w0;
        o4.K0 = nbVar.x0;
        o4.B();
        nbVar.g(false, true);
        nbVar.c0(false);
        nbVar.K0.b(false, true);
        hi.n6 n6Var3 = nbVar.P0;
        if (n6Var3 != null) {
            n6Var3.g(true);
        }
        if (!nbVar.B0.j()) {
            nbVar.L1 = o4;
            hi.l9.a(i7, o4);
            nbVar.M1 = false;
            int videoWidth = nbVar.C0.getVideoWidth();
            int videoHeight = nbVar.C0.getVideoHeight();
            if (videoWidth > 0 && videoHeight > 0) {
                hi.x7 x7Var = nbVar.L1;
                x7Var.k0 = videoWidth;
                x7Var.l0 = videoHeight;
                x7Var.A();
            }
            nbVar.K(new hi.ia(kaVar, 3), 0L);
            return;
        }
        nbVar.H1 = null;
        o4.P = 1.0f;
        if (nbVar.B0.l(o4)) {
            hi.x7 a10 = hi.x7.a(nbVar.B0.getLayout(), nbVar.B0.getContent());
            nbVar.L1 = a10;
            hi.l9.a(i7, a10);
            nbVar.M1 = false;
            int videoWidth2 = nbVar.C0.getVideoWidth();
            int videoHeight2 = nbVar.C0.getVideoHeight();
            if (videoWidth2 > 0 && videoHeight2 > 0) {
                hi.x7 x7Var2 = nbVar.L1;
                x7Var2.k0 = videoWidth2;
                x7Var2.l0 = videoHeight2;
                x7Var2.A();
            }
        }
        nbVar.l0(true);
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        switch (this.a) {
            case 3:
                ((e1.b) this.b).invoke(obj);
                break;
            case 4:
                ((e1.b) this.b).invoke(obj);
                break;
            default:
                ((ae.d) this.b).invoke(obj);
                break;
        }
    }

    @Override // org.telegram.ui.Components.qt0
    public /* synthetic */ void r(RecyclerView recyclerView) {
        org.telegram.ui.Cells.c0.b(recyclerView);
    }

    @Override // h9.g1
    public Object u(Object obj, Object obj2) {
        return h9.o.y((List) ((Collection) obj2), new q4.q(((h9.l1) this.b).f, obj, false, 24));
    }

    @Override // sg.i1
    public void v() {
        hi.pa paVar = (hi.pa) this.b;
        TextView textView = paVar.Y0;
        boolean a10 = paVar.n0.a();
        ImageView imageView = paVar.X0;
        imageView.animate().cancel();
        imageView.animate().alpha(a10 ? 1.0f : 0.6f).translationY(0.0f).setDuration(150L).start();
        imageView.setClickable(a10);
        textView.animate().cancel();
        textView.animate().alpha(a10 ? 1.0f : 0.6f).translationY(0.0f).setDuration(150L).start();
        textView.setClickable(a10);
    }

    @Override // org.telegram.ui.Components.rj0
    public /* synthetic */ void f0(View view, float f10, float f11) {
    }
}
