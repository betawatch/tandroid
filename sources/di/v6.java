package di;

import android.app.Activity;
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
import org.telegram.messenger.ff;
import org.telegram.messenger.gj;
import org.telegram.messenger.hd;
import org.telegram.messenger.k10;
import org.telegram.messenger.ls;
import org.telegram.messenger.np;
import org.telegram.messenger.p10;
import org.telegram.messenger.s10;
import org.telegram.messenger.si;
import org.telegram.messenger.ur;
import org.telegram.messenger.w10;
import org.telegram.messenger.y10;
import org.telegram.messenger.ys;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Cells.n8;
import org.telegram.ui.Components.a70;
import org.telegram.ui.Components.fq0;
import org.telegram.ui.Components.gj0;
import org.telegram.ui.Components.o41;
import org.telegram.ui.Components.oq;
import org.telegram.ui.Components.rj0;
import org.telegram.ui.Components.rt0;
import org.telegram.ui.Components.sj0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.NotificationsCustomSettingsActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.bb1;
import org.telegram.ui.cx;
import org.telegram.ui.ll0;
import org.telegram.ui.tv;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final /* synthetic */ class v6 implements ll0, w10, OnSuccessListener, sj0, s10, rj0, fi.x6, fi.z8, xh.j, r0.m, h9.h1, org.telegram.ui.ActionBar.q1, gj0, sg.j1, CameraController.VideoTakeCallback, rt0, f3.g {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ v6(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // r0.m
    public r0.l1 P0(View view, r0.l1 l1Var) {
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

    @Override // xh.j
    public void a(xh.f fVar, float f10, float f11) {
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

    @Override // fi.x6
    public void b(boolean z10) {
        fi.a5 a5Var = (fi.a5) this.b;
        if (a5Var != null) {
            a5Var.c();
        }
    }

    @Override // org.telegram.ui.Components.rj0
    public /* synthetic */ boolean b1(View view) {
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
    public boolean c(int i7, final View view) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        long j3;
        oq oqVar;
        boolean z10;
        boolean z11;
        a70 a70Var;
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
                final tv tvVar = (tv) obj;
                if (tvVar.O == 0.0f && tvVar.o0 == 0.0f) {
                    final long j10 = ((fi.p) view).F;
                    cx cxVar = tvVar.P0;
                    i10 = ((org.telegram.ui.ActionBar.g2) cxVar).currentAccount;
                    si.d0(i10).P0(true);
                    a70 I = a70.I(cxVar, view);
                    I.z.set(0, org.telegram.messenger.g0.L(8.0f), 0, 0);
                    I.X(org.telegram.ui.ActionBar.m6.e0(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f), cxVar.getThemedColor(org.telegram.ui.ActionBar.m6.d6)));
                    I.b0(0.0f, org.telegram.messenger.g0.L(8.0f));
                    cxVar.M0 = I;
                    if (!p10.B(j10)) {
                        try {
                            view.performHapticFeedback(0);
                        } catch (Exception unused) {
                        }
                        i11 = ((org.telegram.ui.ActionBar.g2) cxVar).currentAccount;
                        if (j10 != k10.i(i11).e()) {
                            final TLRPC.User c22 = cxVar.getMessagesController().c2(Long.valueOf(j10));
                            TLRPC.Chat O0 = cxVar.getMessagesController().O0(Long.valueOf(-j10));
                            final String v = ys.v(j10, 0L, false);
                            i12 = ((org.telegram.ui.ActionBar.g2) cxVar).currentAccount;
                            boolean h02 = NotificationsCustomSettingsActivity.h0(i12, j10);
                            i13 = ((org.telegram.ui.ActionBar.g2) cxVar).currentAccount;
                            boolean K3 = np.u1(i13).K3();
                            i14 = ((org.telegram.ui.ActionBar.g2) cxVar).currentAccount;
                            boolean q10 = k10.i(i14).q();
                            i15 = ((org.telegram.ui.ActionBar.g2) cxVar).currentAccount;
                            boolean L = np.u1(i15).R1().L(j10);
                            i16 = ((org.telegram.ui.ActionBar.g2) cxVar).currentAccount;
                            boolean H = np.u1(i16).R1().H(j10);
                            if (K3 || j10 <= 0 || q10) {
                                j3 = 0;
                            } else {
                                j3 = 0;
                                Drawable drawable = tvVar.getContext().getDrawable(R.drawable.msg_gallery_locked2);
                                if (drawable != null) {
                                    Drawable drawable2 = tvVar.getContext().getDrawable(R.drawable.msg_stealth_locked);
                                    if (drawable2 != null) {
                                        org.telegram.ui.ActionBar.t6.x(tvVar, drawable2, org.telegram.ui.ActionBar.m6.F8, cxVar.getResourceProvider(), PorterDuff.Mode.MULTIPLY);
                                    }
                                    drawable.setColorFilter(new PorterDuffColorFilter(i0.a.f(0.5f, -1, -16777216), PorterDuff.Mode.MULTIPLY));
                                    oqVar = new oq(drawable2, drawable);
                                    if (j10 < j3 && cxVar.k4().j(j10)) {
                                        final int i23 = 4;
                                        cxVar.M0.b(R.drawable.msg_stories_add, null, hd.N0(2131754381, null), org.telegram.ui.ActionBar.m6.F8, org.telegram.ui.ActionBar.m6.E8, new Runnable() { // from class: org.telegram.ui.pv
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                int i24;
                                                switch (i23) {
                                                    case 0:
                                                        tvVar.P0.presentFragment(bn.ua(j10));
                                                        break;
                                                    case 1:
                                                        org.telegram.messenger.g0.h3(new tu(tvVar.P0, j10, !r2.t4(), 0), 200L);
                                                        break;
                                                    case 2:
                                                        org.telegram.messenger.g0.h3(new tu(tvVar.P0, j10, !r2.t4(), 0), 200L);
                                                        break;
                                                    case 3:
                                                        cx cxVar2 = tvVar.P0;
                                                        i24 = ((org.telegram.ui.ActionBar.g2) cxVar2).currentAccount;
                                                        org.telegram.messenger.si d02 = org.telegram.messenger.si.d0(i24);
                                                        long j11 = j10;
                                                        d02.S1(j11);
                                                        cxVar2.getMessagesController().R1().l0(j11, true, false);
                                                        break;
                                                    case 4:
                                                        tvVar.P0.F0.j(j10);
                                                        break;
                                                    case 5:
                                                        tvVar.P0.presentFragment(bn.ua(j10));
                                                        break;
                                                    default:
                                                        tvVar.P0.presentFragment(ProfileActivity.D4(j10));
                                                        break;
                                                }
                                            }
                                        });
                                    }
                                    if (c22 != null && !c22.contact) {
                                        i18 = ((org.telegram.ui.ActionBar.g2) cxVar).currentAccount;
                                        if (si.d0(i18).I(j10)) {
                                            z10 = true;
                                            a70 a70Var2 = cxVar.M0;
                                            final int i24 = 5;
                                            a70Var2.l(R.drawable.msg_discussion, hd.N0(2131745405, null), new Runnable() { // from class: org.telegram.ui.pv
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    int i242;
                                                    switch (i24) {
                                                        case 0:
                                                            tvVar.P0.presentFragment(bn.ua(j10));
                                                            break;
                                                        case 1:
                                                            org.telegram.messenger.g0.h3(new tu(tvVar.P0, j10, !r2.t4(), 0), 200L);
                                                            break;
                                                        case 2:
                                                            org.telegram.messenger.g0.h3(new tu(tvVar.P0, j10, !r2.t4(), 0), 200L);
                                                            break;
                                                        case 3:
                                                            cx cxVar2 = tvVar.P0;
                                                            i242 = ((org.telegram.ui.ActionBar.g2) cxVar2).currentAccount;
                                                            org.telegram.messenger.si d02 = org.telegram.messenger.si.d0(i242);
                                                            long j11 = j10;
                                                            d02.S1(j11);
                                                            cxVar2.getMessagesController().R1().l0(j11, true, false);
                                                            break;
                                                        case 4:
                                                            tvVar.P0.F0.j(j10);
                                                            break;
                                                        case 5:
                                                            tvVar.P0.presentFragment(bn.ua(j10));
                                                            break;
                                                        default:
                                                            tvVar.P0.presentFragment(ProfileActivity.D4(j10));
                                                            break;
                                                    }
                                                }
                                            }, j10 > j3);
                                            final int i25 = 6;
                                            a70Var2.l(R.drawable.msg_openprofile, hd.N0(2131747592, null), new Runnable() { // from class: org.telegram.ui.pv
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    int i242;
                                                    switch (i25) {
                                                        case 0:
                                                            tvVar.P0.presentFragment(bn.ua(j10));
                                                            break;
                                                        case 1:
                                                            org.telegram.messenger.g0.h3(new tu(tvVar.P0, j10, !r2.t4(), 0), 200L);
                                                            break;
                                                        case 2:
                                                            org.telegram.messenger.g0.h3(new tu(tvVar.P0, j10, !r2.t4(), 0), 200L);
                                                            break;
                                                        case 3:
                                                            cx cxVar2 = tvVar.P0;
                                                            i242 = ((org.telegram.ui.ActionBar.g2) cxVar2).currentAccount;
                                                            org.telegram.messenger.si d02 = org.telegram.messenger.si.d0(i242);
                                                            long j11 = j10;
                                                            d02.S1(j11);
                                                            cxVar2.getMessagesController().R1().l0(j11, true, false);
                                                            break;
                                                        case 4:
                                                            tvVar.P0.F0.j(j10);
                                                            break;
                                                        case 5:
                                                            tvVar.P0.presentFragment(bn.ua(j10));
                                                            break;
                                                        default:
                                                            tvVar.P0.presentFragment(ProfileActivity.D4(j10));
                                                            break;
                                                    }
                                                }
                                            }, j10 > j3);
                                            final int i26 = 0;
                                            a70Var2.l(R.drawable.msg_channel, hd.N0(org.telegram.messenger.v3.V(O0) ? 2131747617 : 2131747605, null), new Runnable() { // from class: org.telegram.ui.pv
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    int i242;
                                                    switch (i26) {
                                                        case 0:
                                                            tvVar.P0.presentFragment(bn.ua(j10));
                                                            break;
                                                        case 1:
                                                            org.telegram.messenger.g0.h3(new tu(tvVar.P0, j10, !r2.t4(), 0), 200L);
                                                            break;
                                                        case 2:
                                                            org.telegram.messenger.g0.h3(new tu(tvVar.P0, j10, !r2.t4(), 0), 200L);
                                                            break;
                                                        case 3:
                                                            cx cxVar2 = tvVar.P0;
                                                            i242 = ((org.telegram.ui.ActionBar.g2) cxVar2).currentAccount;
                                                            org.telegram.messenger.si d02 = org.telegram.messenger.si.d0(i242);
                                                            long j11 = j10;
                                                            d02.S1(j11);
                                                            cxVar2.getMessagesController().R1().l0(j11, true, false);
                                                            break;
                                                        case 4:
                                                            tvVar.P0.F0.j(j10);
                                                            break;
                                                        case 5:
                                                            tvVar.P0.presentFragment(bn.ua(j10));
                                                            break;
                                                        default:
                                                            tvVar.P0.presentFragment(ProfileActivity.D4(j10));
                                                            break;
                                                    }
                                                }
                                            }, j10 < j3);
                                            final int i27 = 0;
                                            a70Var2.l(R.drawable.msg_mute, hd.N0(2131747669, null), new Runnable() { // from class: org.telegram.ui.qv
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    int i28;
                                                    String trim;
                                                    int i29;
                                                    int i30 = i27;
                                                    TLRPC.User user = c22;
                                                    String str = v;
                                                    tv tvVar2 = tvVar;
                                                    switch (i30) {
                                                        case 0:
                                                            cx cxVar2 = tvVar2.P0;
                                                            i28 = ((org.telegram.ui.ActionBar.g2) cxVar2).currentAccount;
                                                            org.telegram.messenger.np.u1(i28).g7.edit().putBoolean("stories_" + str, false).apply();
                                                            cxVar2.getNotificationsController().c0(j10, 0L, true);
                                                            trim = user != null ? user.first_name.trim() : "";
                                                            int indexOf = trim.indexOf(" ");
                                                            if (indexOf > 0) {
                                                                trim = trim.substring(0, indexOf);
                                                            }
                                                            org.telegram.ui.Components.lc.b0(cxVar2).V(Arrays.asList(user), org.telegram.messenger.g0.W2(org.telegram.messenger.hd.a0("NotificationsStoryMutedHint", null, 2131747668, trim)), null, null).j();
                                                            break;
                                                        default:
                                                            cx cxVar3 = tvVar2.P0;
                                                            i29 = ((org.telegram.ui.ActionBar.g2) cxVar3).currentAccount;
                                                            org.telegram.messenger.np.u1(i29).g7.edit().putBoolean("stories_" + str, true).apply();
                                                            cxVar3.getNotificationsController().c0(j10, 0L, true);
                                                            trim = user != null ? user.first_name.trim() : "";
                                                            int indexOf2 = trim.indexOf(" ");
                                                            if (indexOf2 > 0) {
                                                                trim = trim.substring(0, indexOf2);
                                                            }
                                                            org.telegram.ui.Components.lc.b0(cxVar3).V(Arrays.asList(user), org.telegram.messenger.g0.W2(org.telegram.messenger.hd.a0("NotificationsStoryUnmutedHint", null, 2131747665, trim)), null, null).j();
                                                            break;
                                                    }
                                                }
                                            }, !h02 && j10 > j3);
                                            a70Var2.F();
                                            final int i28 = 1;
                                            a70Var2.l(R.drawable.msg_unmute, hd.N0(2131747666, null), new Runnable() { // from class: org.telegram.ui.qv
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    int i282;
                                                    String trim;
                                                    int i29;
                                                    int i30 = i28;
                                                    TLRPC.User user = c22;
                                                    String str = v;
                                                    tv tvVar2 = tvVar;
                                                    switch (i30) {
                                                        case 0:
                                                            cx cxVar2 = tvVar2.P0;
                                                            i282 = ((org.telegram.ui.ActionBar.g2) cxVar2).currentAccount;
                                                            org.telegram.messenger.np.u1(i282).g7.edit().putBoolean("stories_" + str, false).apply();
                                                            cxVar2.getNotificationsController().c0(j10, 0L, true);
                                                            trim = user != null ? user.first_name.trim() : "";
                                                            int indexOf = trim.indexOf(" ");
                                                            if (indexOf > 0) {
                                                                trim = trim.substring(0, indexOf);
                                                            }
                                                            org.telegram.ui.Components.lc.b0(cxVar2).V(Arrays.asList(user), org.telegram.messenger.g0.W2(org.telegram.messenger.hd.a0("NotificationsStoryMutedHint", null, 2131747668, trim)), null, null).j();
                                                            break;
                                                        default:
                                                            cx cxVar3 = tvVar2.P0;
                                                            i29 = ((org.telegram.ui.ActionBar.g2) cxVar3).currentAccount;
                                                            org.telegram.messenger.np.u1(i29).g7.edit().putBoolean("stories_" + str, true).apply();
                                                            cxVar3.getNotificationsController().c0(j10, 0L, true);
                                                            trim = user != null ? user.first_name.trim() : "";
                                                            int indexOf2 = trim.indexOf(" ");
                                                            if (indexOf2 > 0) {
                                                                trim = trim.substring(0, indexOf2);
                                                            }
                                                            org.telegram.ui.Components.lc.b0(cxVar3).V(Arrays.asList(user), org.telegram.messenger.g0.W2(org.telegram.messenger.hd.a0("NotificationsStoryUnmutedHint", null, 2131747665, trim)), null, null).j();
                                                            break;
                                                    }
                                                }
                                            }, h02 && j10 > j3);
                                            a70Var2.F();
                                            final int i29 = 0;
                                            a70Var2.l(R.drawable.msg_stories_stealth2, hd.N0(2131743317, null), new Runnable() { // from class: org.telegram.ui.rv
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    org.telegram.ui.ActionBar.h6 h6Var;
                                                    int i30;
                                                    org.telegram.ui.ActionBar.h6 h6Var2;
                                                    switch (i29) {
                                                        case 0:
                                                            tv tvVar2 = tvVar;
                                                            cx cxVar2 = tvVar2.P0;
                                                            TL_stories.TL_storiesStealthMode tL_storiesStealthMode = org.telegram.messenger.np.u1(org.telegram.messenger.k10.t0).R1().B;
                                                            View view2 = view;
                                                            if (tL_storiesStealthMode != null) {
                                                                i30 = ((org.telegram.ui.ActionBar.g2) cxVar2).currentAccount;
                                                                if (ConnectionsManager.getInstance(i30).getCurrentTime() < tL_storiesStealthMode.active_until_date) {
                                                                    if (view2 instanceof fi.p) {
                                                                        cxVar2.F0.i((fi.p) view2, false);
                                                                        break;
                                                                    }
                                                                }
                                                            }
                                                            Context context = tvVar2.getContext();
                                                            h6Var = ((org.telegram.ui.ActionBar.g2) cxVar2).resourceProvider;
                                                            fi.n5 n5Var = new fi.n5(context, 0.0f, 1, h6Var);
                                                            n5Var.p1 = new sv(tvVar2, view2, 1);
                                                            cxVar2.showDialog(n5Var);
                                                            break;
                                                        default:
                                                            tv tvVar3 = tvVar;
                                                            Context context2 = tvVar3.getContext();
                                                            cx cxVar3 = tvVar3.P0;
                                                            h6Var2 = ((org.telegram.ui.ActionBar.g2) cxVar3).resourceProvider;
                                                            fi.n5 n5Var2 = new fi.n5(context2, 0.0f, 1, h6Var2);
                                                            n5Var2.p1 = new sv(tvVar3, view, 0);
                                                            cxVar3.showDialog(n5Var2);
                                                            break;
                                                    }
                                                }
                                            }, K3 && j10 > j3 && q10 && L && !H);
                                            a70Var2.F();
                                            z11 = K3 && j10 > j3 && !q10 && L && !H;
                                            String N0 = hd.N0(2131743317, null);
                                            final int i30 = 1;
                                            Runnable runnable = new Runnable() { // from class: org.telegram.ui.rv
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    org.telegram.ui.ActionBar.h6 h6Var;
                                                    int i302;
                                                    org.telegram.ui.ActionBar.h6 h6Var2;
                                                    switch (i30) {
                                                        case 0:
                                                            tv tvVar2 = tvVar;
                                                            cx cxVar2 = tvVar2.P0;
                                                            TL_stories.TL_storiesStealthMode tL_storiesStealthMode = org.telegram.messenger.np.u1(org.telegram.messenger.k10.t0).R1().B;
                                                            View view2 = view;
                                                            if (tL_storiesStealthMode != null) {
                                                                i302 = ((org.telegram.ui.ActionBar.g2) cxVar2).currentAccount;
                                                                if (ConnectionsManager.getInstance(i302).getCurrentTime() < tL_storiesStealthMode.active_until_date) {
                                                                    if (view2 instanceof fi.p) {
                                                                        cxVar2.F0.i((fi.p) view2, false);
                                                                        break;
                                                                    }
                                                                }
                                                            }
                                                            Context context = tvVar2.getContext();
                                                            h6Var = ((org.telegram.ui.ActionBar.g2) cxVar2).resourceProvider;
                                                            fi.n5 n5Var = new fi.n5(context, 0.0f, 1, h6Var);
                                                            n5Var.p1 = new sv(tvVar2, view2, 1);
                                                            cxVar2.showDialog(n5Var);
                                                            break;
                                                        default:
                                                            tv tvVar3 = tvVar;
                                                            Context context2 = tvVar3.getContext();
                                                            cx cxVar3 = tvVar3.P0;
                                                            h6Var2 = ((org.telegram.ui.ActionBar.g2) cxVar3).resourceProvider;
                                                            fi.n5 n5Var2 = new fi.n5(context2, 0.0f, 1, h6Var2);
                                                            n5Var2.p1 = new sv(tvVar3, view, 0);
                                                            cxVar3.showDialog(n5Var2);
                                                            break;
                                                    }
                                                }
                                            };
                                            if (z11) {
                                                a70Var2.b(R.drawable.msg_stories_stealth2, oqVar, N0, org.telegram.ui.ActionBar.m6.F8, org.telegram.ui.ActionBar.m6.E8, runnable);
                                                a70Var = a70Var2;
                                            } else {
                                                a70Var = a70Var2;
                                            }
                                            a70Var.F();
                                            final int i31 = 1;
                                            a70Var.l(R.drawable.msg_archive, hd.N0(2131754150, null), new Runnable() { // from class: org.telegram.ui.pv
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    int i242;
                                                    switch (i31) {
                                                        case 0:
                                                            tvVar.P0.presentFragment(bn.ua(j10));
                                                            break;
                                                        case 1:
                                                            org.telegram.messenger.g0.h3(new tu(tvVar.P0, j10, !r2.t4(), 0), 200L);
                                                            break;
                                                        case 2:
                                                            org.telegram.messenger.g0.h3(new tu(tvVar.P0, j10, !r2.t4(), 0), 200L);
                                                            break;
                                                        case 3:
                                                            cx cxVar2 = tvVar.P0;
                                                            i242 = ((org.telegram.ui.ActionBar.g2) cxVar2).currentAccount;
                                                            org.telegram.messenger.si d02 = org.telegram.messenger.si.d0(i242);
                                                            long j11 = j10;
                                                            d02.S1(j11);
                                                            cxVar2.getMessagesController().R1().l0(j11, true, false);
                                                            break;
                                                        case 4:
                                                            tvVar.P0.F0.j(j10);
                                                            break;
                                                        case 5:
                                                            tvVar.P0.presentFragment(bn.ua(j10));
                                                            break;
                                                        default:
                                                            tvVar.P0.presentFragment(ProfileActivity.D4(j10));
                                                            break;
                                                    }
                                                }
                                            }, z10 && !cxVar.t4());
                                            a70Var.F();
                                            final int i32 = 2;
                                            a70Var.l(R.drawable.msg_unarchive, hd.N0(2131743669, null), new Runnable() { // from class: org.telegram.ui.pv
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    int i242;
                                                    switch (i32) {
                                                        case 0:
                                                            tvVar.P0.presentFragment(bn.ua(j10));
                                                            break;
                                                        case 1:
                                                            org.telegram.messenger.g0.h3(new tu(tvVar.P0, j10, !r2.t4(), 0), 200L);
                                                            break;
                                                        case 2:
                                                            org.telegram.messenger.g0.h3(new tu(tvVar.P0, j10, !r2.t4(), 0), 200L);
                                                            break;
                                                        case 3:
                                                            cx cxVar2 = tvVar.P0;
                                                            i242 = ((org.telegram.ui.ActionBar.g2) cxVar2).currentAccount;
                                                            org.telegram.messenger.si d02 = org.telegram.messenger.si.d0(i242);
                                                            long j11 = j10;
                                                            d02.S1(j11);
                                                            cxVar2.getMessagesController().R1().l0(j11, true, false);
                                                            break;
                                                        case 4:
                                                            tvVar.P0.F0.j(j10);
                                                            break;
                                                        case 5:
                                                            tvVar.P0.presentFragment(bn.ua(j10));
                                                            break;
                                                        default:
                                                            tvVar.P0.presentFragment(ProfileActivity.D4(j10));
                                                            break;
                                                    }
                                                }
                                            }, z10 && cxVar.t4());
                                            a70Var.F();
                                            i17 = 3;
                                            a70Var.l(R.drawable.msg_delete, hd.N0(2131744505, null), new Runnable() { // from class: org.telegram.ui.pv
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    int i242;
                                                    switch (i17) {
                                                        case 0:
                                                            tvVar.P0.presentFragment(bn.ua(j10));
                                                            break;
                                                        case 1:
                                                            org.telegram.messenger.g0.h3(new tu(tvVar.P0, j10, !r2.t4(), 0), 200L);
                                                            break;
                                                        case 2:
                                                            org.telegram.messenger.g0.h3(new tu(tvVar.P0, j10, !r2.t4(), 0), 200L);
                                                            break;
                                                        case 3:
                                                            cx cxVar2 = tvVar.P0;
                                                            i242 = ((org.telegram.ui.ActionBar.g2) cxVar2).currentAccount;
                                                            org.telegram.messenger.si d02 = org.telegram.messenger.si.d0(i242);
                                                            long j11 = j10;
                                                            d02.S1(j11);
                                                            cxVar2.getMessagesController().R1().l0(j11, true, false);
                                                            break;
                                                        case 4:
                                                            tvVar.P0.F0.j(j10);
                                                            break;
                                                        case 5:
                                                            tvVar.P0.presentFragment(bn.ua(j10));
                                                            break;
                                                        default:
                                                            tvVar.P0.presentFragment(ProfileActivity.D4(j10));
                                                            break;
                                                    }
                                                }
                                            }, z10);
                                        }
                                    }
                                    z10 = false;
                                    a70 a70Var22 = cxVar.M0;
                                    final int i242 = 5;
                                    a70Var22.l(R.drawable.msg_discussion, hd.N0(2131745405, null), new Runnable() { // from class: org.telegram.ui.pv
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            int i2422;
                                            switch (i242) {
                                                case 0:
                                                    tvVar.P0.presentFragment(bn.ua(j10));
                                                    break;
                                                case 1:
                                                    org.telegram.messenger.g0.h3(new tu(tvVar.P0, j10, !r2.t4(), 0), 200L);
                                                    break;
                                                case 2:
                                                    org.telegram.messenger.g0.h3(new tu(tvVar.P0, j10, !r2.t4(), 0), 200L);
                                                    break;
                                                case 3:
                                                    cx cxVar2 = tvVar.P0;
                                                    i2422 = ((org.telegram.ui.ActionBar.g2) cxVar2).currentAccount;
                                                    org.telegram.messenger.si d02 = org.telegram.messenger.si.d0(i2422);
                                                    long j11 = j10;
                                                    d02.S1(j11);
                                                    cxVar2.getMessagesController().R1().l0(j11, true, false);
                                                    break;
                                                case 4:
                                                    tvVar.P0.F0.j(j10);
                                                    break;
                                                case 5:
                                                    tvVar.P0.presentFragment(bn.ua(j10));
                                                    break;
                                                default:
                                                    tvVar.P0.presentFragment(ProfileActivity.D4(j10));
                                                    break;
                                            }
                                        }
                                    }, j10 > j3);
                                    final int i252 = 6;
                                    a70Var22.l(R.drawable.msg_openprofile, hd.N0(2131747592, null), new Runnable() { // from class: org.telegram.ui.pv
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            int i2422;
                                            switch (i252) {
                                                case 0:
                                                    tvVar.P0.presentFragment(bn.ua(j10));
                                                    break;
                                                case 1:
                                                    org.telegram.messenger.g0.h3(new tu(tvVar.P0, j10, !r2.t4(), 0), 200L);
                                                    break;
                                                case 2:
                                                    org.telegram.messenger.g0.h3(new tu(tvVar.P0, j10, !r2.t4(), 0), 200L);
                                                    break;
                                                case 3:
                                                    cx cxVar2 = tvVar.P0;
                                                    i2422 = ((org.telegram.ui.ActionBar.g2) cxVar2).currentAccount;
                                                    org.telegram.messenger.si d02 = org.telegram.messenger.si.d0(i2422);
                                                    long j11 = j10;
                                                    d02.S1(j11);
                                                    cxVar2.getMessagesController().R1().l0(j11, true, false);
                                                    break;
                                                case 4:
                                                    tvVar.P0.F0.j(j10);
                                                    break;
                                                case 5:
                                                    tvVar.P0.presentFragment(bn.ua(j10));
                                                    break;
                                                default:
                                                    tvVar.P0.presentFragment(ProfileActivity.D4(j10));
                                                    break;
                                            }
                                        }
                                    }, j10 > j3);
                                    final int i262 = 0;
                                    a70Var22.l(R.drawable.msg_channel, hd.N0(org.telegram.messenger.v3.V(O0) ? 2131747617 : 2131747605, null), new Runnable() { // from class: org.telegram.ui.pv
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            int i2422;
                                            switch (i262) {
                                                case 0:
                                                    tvVar.P0.presentFragment(bn.ua(j10));
                                                    break;
                                                case 1:
                                                    org.telegram.messenger.g0.h3(new tu(tvVar.P0, j10, !r2.t4(), 0), 200L);
                                                    break;
                                                case 2:
                                                    org.telegram.messenger.g0.h3(new tu(tvVar.P0, j10, !r2.t4(), 0), 200L);
                                                    break;
                                                case 3:
                                                    cx cxVar2 = tvVar.P0;
                                                    i2422 = ((org.telegram.ui.ActionBar.g2) cxVar2).currentAccount;
                                                    org.telegram.messenger.si d02 = org.telegram.messenger.si.d0(i2422);
                                                    long j11 = j10;
                                                    d02.S1(j11);
                                                    cxVar2.getMessagesController().R1().l0(j11, true, false);
                                                    break;
                                                case 4:
                                                    tvVar.P0.F0.j(j10);
                                                    break;
                                                case 5:
                                                    tvVar.P0.presentFragment(bn.ua(j10));
                                                    break;
                                                default:
                                                    tvVar.P0.presentFragment(ProfileActivity.D4(j10));
                                                    break;
                                            }
                                        }
                                    }, j10 < j3);
                                    final int i272 = 0;
                                    a70Var22.l(R.drawable.msg_mute, hd.N0(2131747669, null), new Runnable() { // from class: org.telegram.ui.qv
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            int i282;
                                            String trim;
                                            int i292;
                                            int i302 = i272;
                                            TLRPC.User user = c22;
                                            String str = v;
                                            tv tvVar2 = tvVar;
                                            switch (i302) {
                                                case 0:
                                                    cx cxVar2 = tvVar2.P0;
                                                    i282 = ((org.telegram.ui.ActionBar.g2) cxVar2).currentAccount;
                                                    org.telegram.messenger.np.u1(i282).g7.edit().putBoolean("stories_" + str, false).apply();
                                                    cxVar2.getNotificationsController().c0(j10, 0L, true);
                                                    trim = user != null ? user.first_name.trim() : "";
                                                    int indexOf = trim.indexOf(" ");
                                                    if (indexOf > 0) {
                                                        trim = trim.substring(0, indexOf);
                                                    }
                                                    org.telegram.ui.Components.lc.b0(cxVar2).V(Arrays.asList(user), org.telegram.messenger.g0.W2(org.telegram.messenger.hd.a0("NotificationsStoryMutedHint", null, 2131747668, trim)), null, null).j();
                                                    break;
                                                default:
                                                    cx cxVar3 = tvVar2.P0;
                                                    i292 = ((org.telegram.ui.ActionBar.g2) cxVar3).currentAccount;
                                                    org.telegram.messenger.np.u1(i292).g7.edit().putBoolean("stories_" + str, true).apply();
                                                    cxVar3.getNotificationsController().c0(j10, 0L, true);
                                                    trim = user != null ? user.first_name.trim() : "";
                                                    int indexOf2 = trim.indexOf(" ");
                                                    if (indexOf2 > 0) {
                                                        trim = trim.substring(0, indexOf2);
                                                    }
                                                    org.telegram.ui.Components.lc.b0(cxVar3).V(Arrays.asList(user), org.telegram.messenger.g0.W2(org.telegram.messenger.hd.a0("NotificationsStoryUnmutedHint", null, 2131747665, trim)), null, null).j();
                                                    break;
                                            }
                                        }
                                    }, !h02 && j10 > j3);
                                    a70Var22.F();
                                    final int i282 = 1;
                                    a70Var22.l(R.drawable.msg_unmute, hd.N0(2131747666, null), new Runnable() { // from class: org.telegram.ui.qv
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            int i2822;
                                            String trim;
                                            int i292;
                                            int i302 = i282;
                                            TLRPC.User user = c22;
                                            String str = v;
                                            tv tvVar2 = tvVar;
                                            switch (i302) {
                                                case 0:
                                                    cx cxVar2 = tvVar2.P0;
                                                    i2822 = ((org.telegram.ui.ActionBar.g2) cxVar2).currentAccount;
                                                    org.telegram.messenger.np.u1(i2822).g7.edit().putBoolean("stories_" + str, false).apply();
                                                    cxVar2.getNotificationsController().c0(j10, 0L, true);
                                                    trim = user != null ? user.first_name.trim() : "";
                                                    int indexOf = trim.indexOf(" ");
                                                    if (indexOf > 0) {
                                                        trim = trim.substring(0, indexOf);
                                                    }
                                                    org.telegram.ui.Components.lc.b0(cxVar2).V(Arrays.asList(user), org.telegram.messenger.g0.W2(org.telegram.messenger.hd.a0("NotificationsStoryMutedHint", null, 2131747668, trim)), null, null).j();
                                                    break;
                                                default:
                                                    cx cxVar3 = tvVar2.P0;
                                                    i292 = ((org.telegram.ui.ActionBar.g2) cxVar3).currentAccount;
                                                    org.telegram.messenger.np.u1(i292).g7.edit().putBoolean("stories_" + str, true).apply();
                                                    cxVar3.getNotificationsController().c0(j10, 0L, true);
                                                    trim = user != null ? user.first_name.trim() : "";
                                                    int indexOf2 = trim.indexOf(" ");
                                                    if (indexOf2 > 0) {
                                                        trim = trim.substring(0, indexOf2);
                                                    }
                                                    org.telegram.ui.Components.lc.b0(cxVar3).V(Arrays.asList(user), org.telegram.messenger.g0.W2(org.telegram.messenger.hd.a0("NotificationsStoryUnmutedHint", null, 2131747665, trim)), null, null).j();
                                                    break;
                                            }
                                        }
                                    }, h02 && j10 > j3);
                                    a70Var22.F();
                                    final int i292 = 0;
                                    a70Var22.l(R.drawable.msg_stories_stealth2, hd.N0(2131743317, null), new Runnable() { // from class: org.telegram.ui.rv
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            org.telegram.ui.ActionBar.h6 h6Var;
                                            int i302;
                                            org.telegram.ui.ActionBar.h6 h6Var2;
                                            switch (i292) {
                                                case 0:
                                                    tv tvVar2 = tvVar;
                                                    cx cxVar2 = tvVar2.P0;
                                                    TL_stories.TL_storiesStealthMode tL_storiesStealthMode = org.telegram.messenger.np.u1(org.telegram.messenger.k10.t0).R1().B;
                                                    View view2 = view;
                                                    if (tL_storiesStealthMode != null) {
                                                        i302 = ((org.telegram.ui.ActionBar.g2) cxVar2).currentAccount;
                                                        if (ConnectionsManager.getInstance(i302).getCurrentTime() < tL_storiesStealthMode.active_until_date) {
                                                            if (view2 instanceof fi.p) {
                                                                cxVar2.F0.i((fi.p) view2, false);
                                                                break;
                                                            }
                                                        }
                                                    }
                                                    Context context = tvVar2.getContext();
                                                    h6Var = ((org.telegram.ui.ActionBar.g2) cxVar2).resourceProvider;
                                                    fi.n5 n5Var = new fi.n5(context, 0.0f, 1, h6Var);
                                                    n5Var.p1 = new sv(tvVar2, view2, 1);
                                                    cxVar2.showDialog(n5Var);
                                                    break;
                                                default:
                                                    tv tvVar3 = tvVar;
                                                    Context context2 = tvVar3.getContext();
                                                    cx cxVar3 = tvVar3.P0;
                                                    h6Var2 = ((org.telegram.ui.ActionBar.g2) cxVar3).resourceProvider;
                                                    fi.n5 n5Var2 = new fi.n5(context2, 0.0f, 1, h6Var2);
                                                    n5Var2.p1 = new sv(tvVar3, view, 0);
                                                    cxVar3.showDialog(n5Var2);
                                                    break;
                                            }
                                        }
                                    }, K3 && j10 > j3 && q10 && L && !H);
                                    a70Var22.F();
                                    if (K3) {
                                    }
                                    String N02 = hd.N0(2131743317, null);
                                    final int i302 = 1;
                                    Runnable runnable2 = new Runnable() { // from class: org.telegram.ui.rv
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            org.telegram.ui.ActionBar.h6 h6Var;
                                            int i3022;
                                            org.telegram.ui.ActionBar.h6 h6Var2;
                                            switch (i302) {
                                                case 0:
                                                    tv tvVar2 = tvVar;
                                                    cx cxVar2 = tvVar2.P0;
                                                    TL_stories.TL_storiesStealthMode tL_storiesStealthMode = org.telegram.messenger.np.u1(org.telegram.messenger.k10.t0).R1().B;
                                                    View view2 = view;
                                                    if (tL_storiesStealthMode != null) {
                                                        i3022 = ((org.telegram.ui.ActionBar.g2) cxVar2).currentAccount;
                                                        if (ConnectionsManager.getInstance(i3022).getCurrentTime() < tL_storiesStealthMode.active_until_date) {
                                                            if (view2 instanceof fi.p) {
                                                                cxVar2.F0.i((fi.p) view2, false);
                                                                break;
                                                            }
                                                        }
                                                    }
                                                    Context context = tvVar2.getContext();
                                                    h6Var = ((org.telegram.ui.ActionBar.g2) cxVar2).resourceProvider;
                                                    fi.n5 n5Var = new fi.n5(context, 0.0f, 1, h6Var);
                                                    n5Var.p1 = new sv(tvVar2, view2, 1);
                                                    cxVar2.showDialog(n5Var);
                                                    break;
                                                default:
                                                    tv tvVar3 = tvVar;
                                                    Context context2 = tvVar3.getContext();
                                                    cx cxVar3 = tvVar3.P0;
                                                    h6Var2 = ((org.telegram.ui.ActionBar.g2) cxVar3).resourceProvider;
                                                    fi.n5 n5Var2 = new fi.n5(context2, 0.0f, 1, h6Var2);
                                                    n5Var2.p1 = new sv(tvVar3, view, 0);
                                                    cxVar3.showDialog(n5Var2);
                                                    break;
                                            }
                                        }
                                    };
                                    if (z11) {
                                    }
                                    a70Var.F();
                                    final int i312 = 1;
                                    a70Var.l(R.drawable.msg_archive, hd.N0(2131754150, null), new Runnable() { // from class: org.telegram.ui.pv
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            int i2422;
                                            switch (i312) {
                                                case 0:
                                                    tvVar.P0.presentFragment(bn.ua(j10));
                                                    break;
                                                case 1:
                                                    org.telegram.messenger.g0.h3(new tu(tvVar.P0, j10, !r2.t4(), 0), 200L);
                                                    break;
                                                case 2:
                                                    org.telegram.messenger.g0.h3(new tu(tvVar.P0, j10, !r2.t4(), 0), 200L);
                                                    break;
                                                case 3:
                                                    cx cxVar2 = tvVar.P0;
                                                    i2422 = ((org.telegram.ui.ActionBar.g2) cxVar2).currentAccount;
                                                    org.telegram.messenger.si d02 = org.telegram.messenger.si.d0(i2422);
                                                    long j11 = j10;
                                                    d02.S1(j11);
                                                    cxVar2.getMessagesController().R1().l0(j11, true, false);
                                                    break;
                                                case 4:
                                                    tvVar.P0.F0.j(j10);
                                                    break;
                                                case 5:
                                                    tvVar.P0.presentFragment(bn.ua(j10));
                                                    break;
                                                default:
                                                    tvVar.P0.presentFragment(ProfileActivity.D4(j10));
                                                    break;
                                            }
                                        }
                                    }, z10 && !cxVar.t4());
                                    a70Var.F();
                                    final int i322 = 2;
                                    a70Var.l(R.drawable.msg_unarchive, hd.N0(2131743669, null), new Runnable() { // from class: org.telegram.ui.pv
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            int i2422;
                                            switch (i322) {
                                                case 0:
                                                    tvVar.P0.presentFragment(bn.ua(j10));
                                                    break;
                                                case 1:
                                                    org.telegram.messenger.g0.h3(new tu(tvVar.P0, j10, !r2.t4(), 0), 200L);
                                                    break;
                                                case 2:
                                                    org.telegram.messenger.g0.h3(new tu(tvVar.P0, j10, !r2.t4(), 0), 200L);
                                                    break;
                                                case 3:
                                                    cx cxVar2 = tvVar.P0;
                                                    i2422 = ((org.telegram.ui.ActionBar.g2) cxVar2).currentAccount;
                                                    org.telegram.messenger.si d02 = org.telegram.messenger.si.d0(i2422);
                                                    long j11 = j10;
                                                    d02.S1(j11);
                                                    cxVar2.getMessagesController().R1().l0(j11, true, false);
                                                    break;
                                                case 4:
                                                    tvVar.P0.F0.j(j10);
                                                    break;
                                                case 5:
                                                    tvVar.P0.presentFragment(bn.ua(j10));
                                                    break;
                                                default:
                                                    tvVar.P0.presentFragment(ProfileActivity.D4(j10));
                                                    break;
                                            }
                                        }
                                    }, z10 && cxVar.t4());
                                    a70Var.F();
                                    i17 = 3;
                                    a70Var.l(R.drawable.msg_delete, hd.N0(2131744505, null), new Runnable() { // from class: org.telegram.ui.pv
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            int i2422;
                                            switch (i17) {
                                                case 0:
                                                    tvVar.P0.presentFragment(bn.ua(j10));
                                                    break;
                                                case 1:
                                                    org.telegram.messenger.g0.h3(new tu(tvVar.P0, j10, !r2.t4(), 0), 200L);
                                                    break;
                                                case 2:
                                                    org.telegram.messenger.g0.h3(new tu(tvVar.P0, j10, !r2.t4(), 0), 200L);
                                                    break;
                                                case 3:
                                                    cx cxVar2 = tvVar.P0;
                                                    i2422 = ((org.telegram.ui.ActionBar.g2) cxVar2).currentAccount;
                                                    org.telegram.messenger.si d02 = org.telegram.messenger.si.d0(i2422);
                                                    long j11 = j10;
                                                    d02.S1(j11);
                                                    cxVar2.getMessagesController().R1().l0(j11, true, false);
                                                    break;
                                                case 4:
                                                    tvVar.P0.F0.j(j10);
                                                    break;
                                                case 5:
                                                    tvVar.P0.presentFragment(bn.ua(j10));
                                                    break;
                                                default:
                                                    tvVar.P0.presentFragment(ProfileActivity.D4(j10));
                                                    break;
                                            }
                                        }
                                    }, z10);
                                }
                            }
                            oqVar = null;
                            if (j10 < j3) {
                                final int i232 = 4;
                                cxVar.M0.b(R.drawable.msg_stories_add, null, hd.N0(2131754381, null), org.telegram.ui.ActionBar.m6.F8, org.telegram.ui.ActionBar.m6.E8, new Runnable() { // from class: org.telegram.ui.pv
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        int i2422;
                                        switch (i232) {
                                            case 0:
                                                tvVar.P0.presentFragment(bn.ua(j10));
                                                break;
                                            case 1:
                                                org.telegram.messenger.g0.h3(new tu(tvVar.P0, j10, !r2.t4(), 0), 200L);
                                                break;
                                            case 2:
                                                org.telegram.messenger.g0.h3(new tu(tvVar.P0, j10, !r2.t4(), 0), 200L);
                                                break;
                                            case 3:
                                                cx cxVar2 = tvVar.P0;
                                                i2422 = ((org.telegram.ui.ActionBar.g2) cxVar2).currentAccount;
                                                org.telegram.messenger.si d02 = org.telegram.messenger.si.d0(i2422);
                                                long j11 = j10;
                                                d02.S1(j11);
                                                cxVar2.getMessagesController().R1().l0(j11, true, false);
                                                break;
                                            case 4:
                                                tvVar.P0.F0.j(j10);
                                                break;
                                            case 5:
                                                tvVar.P0.presentFragment(bn.ua(j10));
                                                break;
                                            default:
                                                tvVar.P0.presentFragment(ProfileActivity.D4(j10));
                                                break;
                                        }
                                    }
                                });
                            }
                            if (c22 != null) {
                                i18 = ((org.telegram.ui.ActionBar.g2) cxVar).currentAccount;
                                if (si.d0(i18).I(j10)) {
                                }
                            }
                            z10 = false;
                            a70 a70Var222 = cxVar.M0;
                            final int i2422 = 5;
                            a70Var222.l(R.drawable.msg_discussion, hd.N0(2131745405, null), new Runnable() { // from class: org.telegram.ui.pv
                                @Override // java.lang.Runnable
                                public final void run() {
                                    int i24222;
                                    switch (i2422) {
                                        case 0:
                                            tvVar.P0.presentFragment(bn.ua(j10));
                                            break;
                                        case 1:
                                            org.telegram.messenger.g0.h3(new tu(tvVar.P0, j10, !r2.t4(), 0), 200L);
                                            break;
                                        case 2:
                                            org.telegram.messenger.g0.h3(new tu(tvVar.P0, j10, !r2.t4(), 0), 200L);
                                            break;
                                        case 3:
                                            cx cxVar2 = tvVar.P0;
                                            i24222 = ((org.telegram.ui.ActionBar.g2) cxVar2).currentAccount;
                                            org.telegram.messenger.si d02 = org.telegram.messenger.si.d0(i24222);
                                            long j11 = j10;
                                            d02.S1(j11);
                                            cxVar2.getMessagesController().R1().l0(j11, true, false);
                                            break;
                                        case 4:
                                            tvVar.P0.F0.j(j10);
                                            break;
                                        case 5:
                                            tvVar.P0.presentFragment(bn.ua(j10));
                                            break;
                                        default:
                                            tvVar.P0.presentFragment(ProfileActivity.D4(j10));
                                            break;
                                    }
                                }
                            }, j10 > j3);
                            final int i2522 = 6;
                            a70Var222.l(R.drawable.msg_openprofile, hd.N0(2131747592, null), new Runnable() { // from class: org.telegram.ui.pv
                                @Override // java.lang.Runnable
                                public final void run() {
                                    int i24222;
                                    switch (i2522) {
                                        case 0:
                                            tvVar.P0.presentFragment(bn.ua(j10));
                                            break;
                                        case 1:
                                            org.telegram.messenger.g0.h3(new tu(tvVar.P0, j10, !r2.t4(), 0), 200L);
                                            break;
                                        case 2:
                                            org.telegram.messenger.g0.h3(new tu(tvVar.P0, j10, !r2.t4(), 0), 200L);
                                            break;
                                        case 3:
                                            cx cxVar2 = tvVar.P0;
                                            i24222 = ((org.telegram.ui.ActionBar.g2) cxVar2).currentAccount;
                                            org.telegram.messenger.si d02 = org.telegram.messenger.si.d0(i24222);
                                            long j11 = j10;
                                            d02.S1(j11);
                                            cxVar2.getMessagesController().R1().l0(j11, true, false);
                                            break;
                                        case 4:
                                            tvVar.P0.F0.j(j10);
                                            break;
                                        case 5:
                                            tvVar.P0.presentFragment(bn.ua(j10));
                                            break;
                                        default:
                                            tvVar.P0.presentFragment(ProfileActivity.D4(j10));
                                            break;
                                    }
                                }
                            }, j10 > j3);
                            final int i2622 = 0;
                            a70Var222.l(R.drawable.msg_channel, hd.N0(org.telegram.messenger.v3.V(O0) ? 2131747617 : 2131747605, null), new Runnable() { // from class: org.telegram.ui.pv
                                @Override // java.lang.Runnable
                                public final void run() {
                                    int i24222;
                                    switch (i2622) {
                                        case 0:
                                            tvVar.P0.presentFragment(bn.ua(j10));
                                            break;
                                        case 1:
                                            org.telegram.messenger.g0.h3(new tu(tvVar.P0, j10, !r2.t4(), 0), 200L);
                                            break;
                                        case 2:
                                            org.telegram.messenger.g0.h3(new tu(tvVar.P0, j10, !r2.t4(), 0), 200L);
                                            break;
                                        case 3:
                                            cx cxVar2 = tvVar.P0;
                                            i24222 = ((org.telegram.ui.ActionBar.g2) cxVar2).currentAccount;
                                            org.telegram.messenger.si d02 = org.telegram.messenger.si.d0(i24222);
                                            long j11 = j10;
                                            d02.S1(j11);
                                            cxVar2.getMessagesController().R1().l0(j11, true, false);
                                            break;
                                        case 4:
                                            tvVar.P0.F0.j(j10);
                                            break;
                                        case 5:
                                            tvVar.P0.presentFragment(bn.ua(j10));
                                            break;
                                        default:
                                            tvVar.P0.presentFragment(ProfileActivity.D4(j10));
                                            break;
                                    }
                                }
                            }, j10 < j3);
                            final int i2722 = 0;
                            a70Var222.l(R.drawable.msg_mute, hd.N0(2131747669, null), new Runnable() { // from class: org.telegram.ui.qv
                                @Override // java.lang.Runnable
                                public final void run() {
                                    int i2822;
                                    String trim;
                                    int i2922;
                                    int i3022 = i2722;
                                    TLRPC.User user = c22;
                                    String str = v;
                                    tv tvVar2 = tvVar;
                                    switch (i3022) {
                                        case 0:
                                            cx cxVar2 = tvVar2.P0;
                                            i2822 = ((org.telegram.ui.ActionBar.g2) cxVar2).currentAccount;
                                            org.telegram.messenger.np.u1(i2822).g7.edit().putBoolean("stories_" + str, false).apply();
                                            cxVar2.getNotificationsController().c0(j10, 0L, true);
                                            trim = user != null ? user.first_name.trim() : "";
                                            int indexOf = trim.indexOf(" ");
                                            if (indexOf > 0) {
                                                trim = trim.substring(0, indexOf);
                                            }
                                            org.telegram.ui.Components.lc.b0(cxVar2).V(Arrays.asList(user), org.telegram.messenger.g0.W2(org.telegram.messenger.hd.a0("NotificationsStoryMutedHint", null, 2131747668, trim)), null, null).j();
                                            break;
                                        default:
                                            cx cxVar3 = tvVar2.P0;
                                            i2922 = ((org.telegram.ui.ActionBar.g2) cxVar3).currentAccount;
                                            org.telegram.messenger.np.u1(i2922).g7.edit().putBoolean("stories_" + str, true).apply();
                                            cxVar3.getNotificationsController().c0(j10, 0L, true);
                                            trim = user != null ? user.first_name.trim() : "";
                                            int indexOf2 = trim.indexOf(" ");
                                            if (indexOf2 > 0) {
                                                trim = trim.substring(0, indexOf2);
                                            }
                                            org.telegram.ui.Components.lc.b0(cxVar3).V(Arrays.asList(user), org.telegram.messenger.g0.W2(org.telegram.messenger.hd.a0("NotificationsStoryUnmutedHint", null, 2131747665, trim)), null, null).j();
                                            break;
                                    }
                                }
                            }, !h02 && j10 > j3);
                            a70Var222.F();
                            final int i2822 = 1;
                            a70Var222.l(R.drawable.msg_unmute, hd.N0(2131747666, null), new Runnable() { // from class: org.telegram.ui.qv
                                @Override // java.lang.Runnable
                                public final void run() {
                                    int i28222;
                                    String trim;
                                    int i2922;
                                    int i3022 = i2822;
                                    TLRPC.User user = c22;
                                    String str = v;
                                    tv tvVar2 = tvVar;
                                    switch (i3022) {
                                        case 0:
                                            cx cxVar2 = tvVar2.P0;
                                            i28222 = ((org.telegram.ui.ActionBar.g2) cxVar2).currentAccount;
                                            org.telegram.messenger.np.u1(i28222).g7.edit().putBoolean("stories_" + str, false).apply();
                                            cxVar2.getNotificationsController().c0(j10, 0L, true);
                                            trim = user != null ? user.first_name.trim() : "";
                                            int indexOf = trim.indexOf(" ");
                                            if (indexOf > 0) {
                                                trim = trim.substring(0, indexOf);
                                            }
                                            org.telegram.ui.Components.lc.b0(cxVar2).V(Arrays.asList(user), org.telegram.messenger.g0.W2(org.telegram.messenger.hd.a0("NotificationsStoryMutedHint", null, 2131747668, trim)), null, null).j();
                                            break;
                                        default:
                                            cx cxVar3 = tvVar2.P0;
                                            i2922 = ((org.telegram.ui.ActionBar.g2) cxVar3).currentAccount;
                                            org.telegram.messenger.np.u1(i2922).g7.edit().putBoolean("stories_" + str, true).apply();
                                            cxVar3.getNotificationsController().c0(j10, 0L, true);
                                            trim = user != null ? user.first_name.trim() : "";
                                            int indexOf2 = trim.indexOf(" ");
                                            if (indexOf2 > 0) {
                                                trim = trim.substring(0, indexOf2);
                                            }
                                            org.telegram.ui.Components.lc.b0(cxVar3).V(Arrays.asList(user), org.telegram.messenger.g0.W2(org.telegram.messenger.hd.a0("NotificationsStoryUnmutedHint", null, 2131747665, trim)), null, null).j();
                                            break;
                                    }
                                }
                            }, h02 && j10 > j3);
                            a70Var222.F();
                            final int i2922 = 0;
                            a70Var222.l(R.drawable.msg_stories_stealth2, hd.N0(2131743317, null), new Runnable() { // from class: org.telegram.ui.rv
                                @Override // java.lang.Runnable
                                public final void run() {
                                    org.telegram.ui.ActionBar.h6 h6Var;
                                    int i3022;
                                    org.telegram.ui.ActionBar.h6 h6Var2;
                                    switch (i2922) {
                                        case 0:
                                            tv tvVar2 = tvVar;
                                            cx cxVar2 = tvVar2.P0;
                                            TL_stories.TL_storiesStealthMode tL_storiesStealthMode = org.telegram.messenger.np.u1(org.telegram.messenger.k10.t0).R1().B;
                                            View view2 = view;
                                            if (tL_storiesStealthMode != null) {
                                                i3022 = ((org.telegram.ui.ActionBar.g2) cxVar2).currentAccount;
                                                if (ConnectionsManager.getInstance(i3022).getCurrentTime() < tL_storiesStealthMode.active_until_date) {
                                                    if (view2 instanceof fi.p) {
                                                        cxVar2.F0.i((fi.p) view2, false);
                                                        break;
                                                    }
                                                }
                                            }
                                            Context context = tvVar2.getContext();
                                            h6Var = ((org.telegram.ui.ActionBar.g2) cxVar2).resourceProvider;
                                            fi.n5 n5Var = new fi.n5(context, 0.0f, 1, h6Var);
                                            n5Var.p1 = new sv(tvVar2, view2, 1);
                                            cxVar2.showDialog(n5Var);
                                            break;
                                        default:
                                            tv tvVar3 = tvVar;
                                            Context context2 = tvVar3.getContext();
                                            cx cxVar3 = tvVar3.P0;
                                            h6Var2 = ((org.telegram.ui.ActionBar.g2) cxVar3).resourceProvider;
                                            fi.n5 n5Var2 = new fi.n5(context2, 0.0f, 1, h6Var2);
                                            n5Var2.p1 = new sv(tvVar3, view, 0);
                                            cxVar3.showDialog(n5Var2);
                                            break;
                                    }
                                }
                            }, K3 && j10 > j3 && q10 && L && !H);
                            a70Var222.F();
                            if (K3) {
                            }
                            String N022 = hd.N0(2131743317, null);
                            final int i3022 = 1;
                            Runnable runnable22 = new Runnable() { // from class: org.telegram.ui.rv
                                @Override // java.lang.Runnable
                                public final void run() {
                                    org.telegram.ui.ActionBar.h6 h6Var;
                                    int i30222;
                                    org.telegram.ui.ActionBar.h6 h6Var2;
                                    switch (i3022) {
                                        case 0:
                                            tv tvVar2 = tvVar;
                                            cx cxVar2 = tvVar2.P0;
                                            TL_stories.TL_storiesStealthMode tL_storiesStealthMode = org.telegram.messenger.np.u1(org.telegram.messenger.k10.t0).R1().B;
                                            View view2 = view;
                                            if (tL_storiesStealthMode != null) {
                                                i30222 = ((org.telegram.ui.ActionBar.g2) cxVar2).currentAccount;
                                                if (ConnectionsManager.getInstance(i30222).getCurrentTime() < tL_storiesStealthMode.active_until_date) {
                                                    if (view2 instanceof fi.p) {
                                                        cxVar2.F0.i((fi.p) view2, false);
                                                        break;
                                                    }
                                                }
                                            }
                                            Context context = tvVar2.getContext();
                                            h6Var = ((org.telegram.ui.ActionBar.g2) cxVar2).resourceProvider;
                                            fi.n5 n5Var = new fi.n5(context, 0.0f, 1, h6Var);
                                            n5Var.p1 = new sv(tvVar2, view2, 1);
                                            cxVar2.showDialog(n5Var);
                                            break;
                                        default:
                                            tv tvVar3 = tvVar;
                                            Context context2 = tvVar3.getContext();
                                            cx cxVar3 = tvVar3.P0;
                                            h6Var2 = ((org.telegram.ui.ActionBar.g2) cxVar3).resourceProvider;
                                            fi.n5 n5Var2 = new fi.n5(context2, 0.0f, 1, h6Var2);
                                            n5Var2.p1 = new sv(tvVar3, view, 0);
                                            cxVar3.showDialog(n5Var2);
                                            break;
                                    }
                                }
                            };
                            if (z11) {
                            }
                            a70Var.F();
                            final int i3122 = 1;
                            a70Var.l(R.drawable.msg_archive, hd.N0(2131754150, null), new Runnable() { // from class: org.telegram.ui.pv
                                @Override // java.lang.Runnable
                                public final void run() {
                                    int i24222;
                                    switch (i3122) {
                                        case 0:
                                            tvVar.P0.presentFragment(bn.ua(j10));
                                            break;
                                        case 1:
                                            org.telegram.messenger.g0.h3(new tu(tvVar.P0, j10, !r2.t4(), 0), 200L);
                                            break;
                                        case 2:
                                            org.telegram.messenger.g0.h3(new tu(tvVar.P0, j10, !r2.t4(), 0), 200L);
                                            break;
                                        case 3:
                                            cx cxVar2 = tvVar.P0;
                                            i24222 = ((org.telegram.ui.ActionBar.g2) cxVar2).currentAccount;
                                            org.telegram.messenger.si d02 = org.telegram.messenger.si.d0(i24222);
                                            long j11 = j10;
                                            d02.S1(j11);
                                            cxVar2.getMessagesController().R1().l0(j11, true, false);
                                            break;
                                        case 4:
                                            tvVar.P0.F0.j(j10);
                                            break;
                                        case 5:
                                            tvVar.P0.presentFragment(bn.ua(j10));
                                            break;
                                        default:
                                            tvVar.P0.presentFragment(ProfileActivity.D4(j10));
                                            break;
                                    }
                                }
                            }, z10 && !cxVar.t4());
                            a70Var.F();
                            final int i3222 = 2;
                            a70Var.l(R.drawable.msg_unarchive, hd.N0(2131743669, null), new Runnable() { // from class: org.telegram.ui.pv
                                @Override // java.lang.Runnable
                                public final void run() {
                                    int i24222;
                                    switch (i3222) {
                                        case 0:
                                            tvVar.P0.presentFragment(bn.ua(j10));
                                            break;
                                        case 1:
                                            org.telegram.messenger.g0.h3(new tu(tvVar.P0, j10, !r2.t4(), 0), 200L);
                                            break;
                                        case 2:
                                            org.telegram.messenger.g0.h3(new tu(tvVar.P0, j10, !r2.t4(), 0), 200L);
                                            break;
                                        case 3:
                                            cx cxVar2 = tvVar.P0;
                                            i24222 = ((org.telegram.ui.ActionBar.g2) cxVar2).currentAccount;
                                            org.telegram.messenger.si d02 = org.telegram.messenger.si.d0(i24222);
                                            long j11 = j10;
                                            d02.S1(j11);
                                            cxVar2.getMessagesController().R1().l0(j11, true, false);
                                            break;
                                        case 4:
                                            tvVar.P0.F0.j(j10);
                                            break;
                                        case 5:
                                            tvVar.P0.presentFragment(bn.ua(j10));
                                            break;
                                        default:
                                            tvVar.P0.presentFragment(ProfileActivity.D4(j10));
                                            break;
                                    }
                                }
                            }, z10 && cxVar.t4());
                            a70Var.F();
                            i17 = 3;
                            a70Var.l(R.drawable.msg_delete, hd.N0(2131744505, null), new Runnable() { // from class: org.telegram.ui.pv
                                @Override // java.lang.Runnable
                                public final void run() {
                                    int i24222;
                                    switch (i17) {
                                        case 0:
                                            tvVar.P0.presentFragment(bn.ua(j10));
                                            break;
                                        case 1:
                                            org.telegram.messenger.g0.h3(new tu(tvVar.P0, j10, !r2.t4(), 0), 200L);
                                            break;
                                        case 2:
                                            org.telegram.messenger.g0.h3(new tu(tvVar.P0, j10, !r2.t4(), 0), 200L);
                                            break;
                                        case 3:
                                            cx cxVar2 = tvVar.P0;
                                            i24222 = ((org.telegram.ui.ActionBar.g2) cxVar2).currentAccount;
                                            org.telegram.messenger.si d02 = org.telegram.messenger.si.d0(i24222);
                                            long j11 = j10;
                                            d02.S1(j11);
                                            cxVar2.getMessagesController().R1().l0(j11, true, false);
                                            break;
                                        case 4:
                                            tvVar.P0.F0.j(j10);
                                            break;
                                        case 5:
                                            tvVar.P0.presentFragment(bn.ua(j10));
                                            break;
                                        default:
                                            tvVar.P0.presentFragment(ProfileActivity.D4(j10));
                                            break;
                                    }
                                }
                            }, z10);
                        } else if (cxVar.P3) {
                            a70 a70Var3 = cxVar.M0;
                            String N03 = hd.N0(2131754381, null);
                            int i33 = org.telegram.ui.ActionBar.m6.F8;
                            int i34 = org.telegram.ui.ActionBar.m6.E8;
                            a70Var3.b(R.drawable.msg_stories_add, null, N03, i33, i34, new Runnable() { // from class: org.telegram.ui.ov
                                @Override // java.lang.Runnable
                                public final void run() {
                                    int i35;
                                    int i36;
                                    switch (i21) {
                                        case 0:
                                            tvVar.P0.F0.j(0L);
                                            break;
                                        case 1:
                                            Bundle bundle = new Bundle();
                                            cx cxVar2 = tvVar.P0;
                                            i35 = ((org.telegram.ui.ActionBar.g2) cxVar2).currentAccount;
                                            bundle.putLong("dialog_id", org.telegram.messenger.k10.i(i35).e());
                                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                            bundle.putInt("start_from", 9);
                                            cxVar2.presentFragment(new org.telegram.ui.Components.k90(bundle, null));
                                            break;
                                        default:
                                            Bundle bundle2 = new Bundle();
                                            cx cxVar3 = tvVar.P0;
                                            i36 = ((org.telegram.ui.ActionBar.g2) cxVar3).currentAccount;
                                            bundle2.putLong("dialog_id", org.telegram.messenger.k10.i(i36).e());
                                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                            cxVar3.presentFragment(new org.telegram.ui.Components.k90(bundle2, null));
                                            break;
                                    }
                                }
                            });
                            cxVar.M0.b(R.drawable.msg_stories_archive, null, hd.N0(2131754120, null), i33, i34, new Runnable() { // from class: org.telegram.ui.ov
                                @Override // java.lang.Runnable
                                public final void run() {
                                    int i35;
                                    int i36;
                                    switch (i22) {
                                        case 0:
                                            tvVar.P0.F0.j(0L);
                                            break;
                                        case 1:
                                            Bundle bundle = new Bundle();
                                            cx cxVar2 = tvVar.P0;
                                            i35 = ((org.telegram.ui.ActionBar.g2) cxVar2).currentAccount;
                                            bundle.putLong("dialog_id", org.telegram.messenger.k10.i(i35).e());
                                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                            bundle.putInt("start_from", 9);
                                            cxVar2.presentFragment(new org.telegram.ui.Components.k90(bundle, null));
                                            break;
                                        default:
                                            Bundle bundle2 = new Bundle();
                                            cx cxVar3 = tvVar.P0;
                                            i36 = ((org.telegram.ui.ActionBar.g2) cxVar3).currentAccount;
                                            bundle2.putLong("dialog_id", org.telegram.messenger.k10.i(i36).e());
                                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                            cxVar3.presentFragment(new org.telegram.ui.Components.k90(bundle2, null));
                                            break;
                                    }
                                }
                            });
                            cxVar.M0.b(R.drawable.msg_stories_saved, null, hd.N0(2131745689, null), i33, i34, new Runnable() { // from class: org.telegram.ui.ov
                                @Override // java.lang.Runnable
                                public final void run() {
                                    int i35;
                                    int i36;
                                    switch (i20) {
                                        case 0:
                                            tvVar.P0.F0.j(0L);
                                            break;
                                        case 1:
                                            Bundle bundle = new Bundle();
                                            cx cxVar2 = tvVar.P0;
                                            i35 = ((org.telegram.ui.ActionBar.g2) cxVar2).currentAccount;
                                            bundle.putLong("dialog_id", org.telegram.messenger.k10.i(i35).e());
                                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                            bundle.putInt("start_from", 9);
                                            cxVar2.presentFragment(new org.telegram.ui.Components.k90(bundle, null));
                                            break;
                                        default:
                                            Bundle bundle2 = new Bundle();
                                            cx cxVar3 = tvVar.P0;
                                            i36 = ((org.telegram.ui.ActionBar.g2) cxVar3).currentAccount;
                                            bundle2.putLong("dialog_id", org.telegram.messenger.k10.i(i36).e());
                                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                            cxVar3.presentFragment(new org.telegram.ui.Components.k90(bundle2, null));
                                            break;
                                    }
                                }
                            });
                            i17 = 3;
                        } else {
                            tv tvVar2 = cxVar.F0;
                            if (tvVar2 != null) {
                                tvVar2.n();
                            }
                        }
                        a70 a70Var4 = cxVar.M0;
                        a70Var4.i = i17;
                        a70Var4.b0(org.telegram.messenger.g0.L(-8.0f), org.telegram.messenger.g0.L(-10.0f));
                        a70Var4.a0();
                        return false;
                    }
                    q2Var.a();
                }
                return false;
            case 15:
                fq0 fq0Var = ((gi.m) obj).a0;
                if (fq0Var.H.F1 || !(view instanceof org.telegram.ui.Cells.p7)) {
                    return false;
                }
                gj messageObject = ((org.telegram.ui.Cells.p7) view).getMessageObject();
                if (fq0Var.c(messageObject)) {
                    fq0Var.g(messageObject);
                } else {
                    fq0Var.e(messageObject);
                }
                return true;
            default:
                hi.d3 d3Var = (hi.d3) obj;
                ArrayList arrayList = d3Var.c0;
                ArrayList arrayList2 = d3Var.i0;
                if (i7 < 2 || d3Var.a0 == null || !(view instanceof hi.z2)) {
                    return false;
                }
                int i35 = i7 - 2;
                if (d3Var.d0) {
                    if (i35 == 0) {
                        return false;
                    }
                    i35 = i7 - 3;
                } else if (d3Var.e0) {
                    if (i35 >= 0 && i35 < arrayList.size()) {
                        return false;
                    }
                    i35 -= arrayList.size();
                }
                if (i35 < 0 || i35 >= d3Var.g0.size()) {
                    return false;
                }
                ff ffVar = (ff) d3Var.g0.get(i35);
                if (!arrayList2.isEmpty() || d3Var.R) {
                    return false;
                }
                if (arrayList2.contains(ffVar)) {
                    arrayList2.remove(ffVar);
                } else {
                    if (arrayList2.size() + 1 > d3Var.S) {
                        int i36 = -d3Var.O;
                        d3Var.O = i36;
                        org.telegram.messenger.g0.E3(i36, view, null);
                        q2Var.a();
                        return true;
                    }
                    arrayList2.add(ffVar);
                }
                org.telegram.messenger.g0.Z3(d3Var.d);
                d3Var.j();
                return true;
        }
    }

    @Override // org.telegram.ui.ll0
    public void d(int i7) {
        switch (this.a) {
            case 0:
                org.telegram.ui.Wallet.e0 e0Var = (org.telegram.ui.Wallet.e0) this.b;
                if (i7 != 1) {
                    if (i7 != 3) {
                        e0Var.a(Boolean.FALSE, null);
                        break;
                    }
                } else {
                    e0Var.a(Boolean.TRUE, null);
                    break;
                }
                break;
            default:
                bi.e8 e8Var = (bi.e8) this.b;
                if (i7 != 1) {
                    if (i7 != 3) {
                        e8Var.a(Boolean.FALSE, null);
                        break;
                    }
                } else {
                    e8Var.a(Boolean.TRUE, null);
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.rj0
    public void f(float f10, float f11, int i7, View view) {
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

    @Override // org.telegram.messenger.s10
    public Object g(Number number, Object obj) {
        int i7 = this.a;
        Object obj2 = this.b;
        switch (i7) {
            case 6:
                return fi.t0.a((fi.t0) obj2, (Long) obj);
            default:
                fq0 fq0Var = (fq0) obj2;
                if (((Integer) number).intValue() != -1) {
                    return Boolean.FALSE;
                }
                new gi.p(fq0Var.a, hd.N0(2131746497, null), new ai.h0(fq0Var, 20)).show();
                return Boolean.TRUE;
        }
    }

    @Override // org.telegram.ui.ActionBar.q1
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        int i10;
        switch (this.a) {
            case 17:
                hi.sa saVar = ((hi.ia) ((hi.t) this.b)).S1;
                hi.ga gaVar = saVar.Y0;
                if (gaVar != null) {
                    gaVar.s(null, null, true);
                }
                hi.u9 u9Var = saVar.w1;
                if (u9Var != null) {
                    u9Var.n0();
                }
                hi.ia iaVar = saVar.d1;
                if (iaVar != null) {
                    iaVar.setHasRoundVideo(false);
                }
                hi.c7 c7Var = saVar.L1;
                if (c7Var != null) {
                    File file = c7Var.o0;
                    if (file != null) {
                        try {
                            file.delete();
                        } catch (Exception unused) {
                        }
                        saVar.L1.o0 = null;
                    }
                    if (saVar.L1.p0 != null) {
                        try {
                            new File(saVar.L1.p0).delete();
                        } catch (Exception unused2) {
                        }
                        saVar.L1.p0 = null;
                        break;
                    }
                }
                break;
            case 22:
                ((hi.d5) this.b).a.Z1.r();
                break;
            case 24:
                ((TwoStepVerificationActivity) this.b).presentFragment(new bb1(6, null));
                break;
            default:
                kg.s1 s1Var = (kg.s1) ((bi.v1) this.b).b;
                i10 = ((org.telegram.ui.ActionBar.g2) s1Var).currentAccount;
                kg.v1 f10 = kg.v1.f(i10);
                ArrayList arrayList = s1Var.b;
                int i11 = f10.a;
                int i12 = 0;
                while (i12 < arrayList.size()) {
                    if (f10.c(((Integer) arrayList.get(i12)).intValue()) == null) {
                        arrayList.remove(i12);
                        i12--;
                    }
                    i12++;
                }
                if (!arrayList.isEmpty()) {
                    for (int i13 = 0; i13 < arrayList.size(); i13++) {
                        kg.u1 c10 = f10.c(((Integer) arrayList.get(i13)).intValue());
                        f10.b.remove(c10);
                        f10.a(c10.b);
                        TLRPC.TL_messages_deleteQuickReplyShortcut tL_messages_deleteQuickReplyShortcut = new TLRPC.TL_messages_deleteQuickReplyShortcut();
                        tL_messages_deleteQuickReplyShortcut.shortcut_id = c10.a;
                        ConnectionsManager.getInstance(i11).sendRequest(tL_messages_deleteQuickReplyShortcut, new fi.l5(6));
                        if ("hello".equals(c10.b)) {
                            ConnectionsManager.getInstance(i11).sendRequest(new TL_account.updateBusinessGreetingMessage(), null);
                            TLRPC.UserFull d2 = np.u1(i11).d2(k10.i(i11).e());
                            if (d2 != null) {
                                d2.flags2 &= -5;
                                d2.business_greeting_message = null;
                                ur.a0(i11).j2(d2, true);
                            }
                        } else if ("away".equals(c10.b)) {
                            ConnectionsManager.getInstance(i11).sendRequest(new TL_account.updateBusinessAwayMessage(), null);
                            TLRPC.UserFull d22 = np.u1(i11).d2(k10.i(i11).e());
                            if (d22 != null) {
                                d22.flags2 &= -9;
                                d22.business_away_message = null;
                                ur.a0(i11).j2(d22, true);
                            }
                        }
                    }
                    f10.l();
                    ur a02 = ur.a0(i11);
                    a02.a.c(new hi.z0(a02, arrayList, 2));
                    ls.f(i11).k(ls.F1, new Object[0]);
                }
                kg.s1.c0(s1Var);
                break;
        }
    }

    @Override // org.telegram.ui.Components.gj0
    public void i() {
        ((hi.o1) this.b).invalidate();
    }

    @Override // org.telegram.ui.Components.rt0
    public /* synthetic */ float j(RecyclerView recyclerView) {
        return org.telegram.ui.Cells.c0.c(recyclerView);
    }

    @Override // f3.g
    public long k(long j3) {
        return h2.l0.j((j3 * r0.e) / 1000000, 0L, ((f3.u) this.b).j - 1);
    }

    @Override // org.telegram.messenger.w10
    public void l(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        org.telegram.ui.ActionBar.g2 T;
        int i7;
        int i10 = 3;
        final int i11 = 1;
        final int i12 = 0;
        switch (this.a) {
            case 2:
                mb mbVar = (mb) this.b;
                o41 o41Var = (o41) obj;
                Object obj3 = o41Var.H;
                if (obj3 instanceof TL_stars.StarsTransaction) {
                    pb.l1(mbVar.getContext(), false, 0L, mbVar.c, (TL_stars.StarsTransaction) o41Var.H, mbVar.b);
                    break;
                } else if ((obj3 instanceof TL_wallet.walletTransaction) && (T = LaunchActivity.T()) != null) {
                    T.presentFragment(new org.telegram.ui.Wallet.n6());
                    break;
                }
                break;
            case 20:
                hi.l9 l9Var = (hi.l9) this.b;
                o41 o41Var2 = (o41) obj;
                int i13 = o41Var2.d;
                hi.c7 c7Var = (hi.c7) o41Var2.H;
                l9Var.c(false, true);
                hi.sa saVar = l9Var.P;
                if (c7Var != saVar.L1 && !saVar.Y1) {
                    saVar.e1.setSelected(i13);
                    saVar.Y1 = true;
                    ai.c1 c1Var = new ai.c1(saVar, i13, 12);
                    hi.u9 u9Var = saVar.w1;
                    hi.c7 c7Var2 = saVar.L1;
                    if (u9Var != null && c7Var2 != null) {
                        if (u9Var.r0()) {
                            c7Var2.f();
                            Utilities.g.c(new hi.u8(saVar, u9Var, c7Var2.i0, c7Var2.j0, c7Var2, u9Var.y0.getPainting().E, u9Var.r0(), c1Var, 0));
                            break;
                        } else {
                            c1Var.run();
                            break;
                        }
                    } else {
                        c1Var.run();
                        break;
                    }
                }
                break;
            case 27:
                kg.e1 e1Var = (kg.e1) this.b;
                o41 o41Var3 = (o41) obj;
                View view = (View) obj2;
                float floatValue = ((Float) serializable).floatValue();
                int i14 = o41Var3.d;
                if (i14 == -1) {
                    boolean z10 = !e1Var.d;
                    e1Var.d = z10;
                    ((org.telegram.ui.Cells.s8) view).setChecked(z10);
                    e1Var.a.g3.O(true);
                    e1Var.d0(true);
                    break;
                } else if (i14 == -2) {
                    kg.y1 y1Var = new kg.y1(null);
                    y1Var.n = e1Var.n;
                    y1Var.c = new ai.y1(25, e1Var, view);
                    e1Var.presentFragment(y1Var);
                    break;
                } else if (o41Var3.a == 5 && i14 >= 0 && i14 < e1Var.f.length) {
                    if (!hd.a0 ? floatValue < view.getMeasuredWidth() - org.telegram.messenger.g0.L(76.0f) : floatValue > org.telegram.messenger.g0.L(76.0f)) {
                        int i15 = (o41Var3.d + 6) % 7;
                        int i16 = 0;
                        for (int i17 = 0; i17 < e1Var.f[i15].size(); i17++) {
                            if (((kg.d1) e1Var.f[i15].get(i17)).b > i16) {
                                i16 = ((kg.d1) e1Var.f[i15].get(i17)).b;
                            }
                        }
                        int max = Math.max(0, i16 - 1439);
                        int i18 = (o41Var3.d + 1) % 7;
                        int i19 = 1440;
                        for (int i20 = 0; i20 < e1Var.f[i18].size(); i20++) {
                            if (((kg.d1) e1Var.f[i18].get(i20)).a < i19) {
                                i19 = ((kg.d1) e1Var.f[i18].get(i20)).a;
                            }
                        }
                        int i21 = i19 + 1439;
                        CharSequence charSequence = o41Var3.m;
                        ArrayList arrayList = e1Var.f[o41Var3.d];
                        int i22 = 0;
                        while (i12 < 7) {
                            ArrayList arrayList2 = e1Var.f[i12];
                            if (arrayList2 != null) {
                                i22 = Math.max(1, arrayList2.size()) + i22;
                            }
                            i12++;
                        }
                        kg.g1 g1Var = new kg.g1(charSequence, arrayList, max, i21, 28 - i22);
                        g1Var.f = new kg.i0(e1Var, i10);
                        g1Var.h = new ji.i(4, e1Var, o41Var3);
                        e1Var.presentFragment(g1Var);
                        break;
                    } else {
                        if (e1Var.f[o41Var3.d].isEmpty()) {
                            ((org.telegram.ui.Cells.j5) view).setChecked(true);
                            e1Var.f[o41Var3.d].add(new kg.d1(0, 1439));
                            e1Var.c0(o41Var3.d);
                        } else {
                            e1Var.f[o41Var3.d].clear();
                            ((org.telegram.ui.Cells.j5) view).setChecked(false);
                        }
                        ((org.telegram.ui.Cells.j5) view).setValue(kg.e1.f0(e1Var.f[o41Var3.d]));
                        e1Var.d0(true);
                        break;
                    }
                }
                break;
            default:
                final kg.g1 g1Var2 = (kg.g1) this.b;
                o41 o41Var4 = (o41) obj;
                final View view2 = (View) obj2;
                int i23 = g1Var2.c;
                int i24 = g1Var2.d;
                ArrayList arrayList3 = g1Var2.b;
                int i25 = o41Var4.d;
                if (i25 == -1) {
                    g1Var2.r = !g1Var2.r;
                    arrayList3.clear();
                    if (g1Var2.r) {
                        arrayList3.add(new kg.d1(0, 1439));
                    }
                    org.telegram.ui.Cells.s8 s8Var = (org.telegram.ui.Cells.s8) view2;
                    boolean z11 = g1Var2.r;
                    o41Var4.e = z11;
                    s8Var.setChecked(z11);
                    boolean z12 = g1Var2.r;
                    s8Var.b(org.telegram.ui.ActionBar.m6.x0(null, z12 ? org.telegram.ui.ActionBar.m6.f6 : org.telegram.ui.ActionBar.m6.e6, false), z12);
                    g1Var2.n.g3.O(true);
                    kg.i0 i0Var = g1Var2.f;
                    if (i0Var != null) {
                        i0Var.run();
                        break;
                    }
                } else if (i25 == -2) {
                    if (arrayList3.isEmpty() || g1Var2.Z()) {
                        if (g1Var2.Z()) {
                            arrayList3.clear();
                        }
                        int j3 = Utilities.j(480, i24 - 1, i23);
                        arrayList3.add(new kg.d1(j3, Utilities.j(1200, i24, j3 + 1)));
                    } else {
                        int i26 = ((kg.d1) i5.c.h(1, arrayList3)).b;
                        int j10 = Utilities.j(i26 + 30, i24 - 1, i23);
                        arrayList3.add(new kg.d1(j10, Utilities.j((i26 + 1560) / 2, i24, j10 + 1)));
                    }
                    kg.i0 i0Var2 = g1Var2.f;
                    if (i0Var2 != null) {
                        i0Var2.run();
                    }
                    g1Var2.n.g3.O(true);
                    break;
                } else if (o41Var4.a == 3 && (i7 = i25 / 3) >= 0 && i7 < arrayList3.size()) {
                    int i27 = i7 - 1;
                    kg.d1 d1Var = i27 >= 0 ? (kg.d1) arrayList3.get(i27) : null;
                    final kg.d1 d1Var2 = (kg.d1) arrayList3.get(i7);
                    int i28 = i7 + 1;
                    kg.d1 d1Var3 = i28 < arrayList3.size() ? (kg.d1) arrayList3.get(i28) : null;
                    int i29 = o41Var4.d % 3;
                    if (i29 == 0) {
                        Activity parentActivity = g1Var2.getParentActivity();
                        String N0 = hd.N0(2131752738, null);
                        int i30 = d1Var2.a;
                        if (d1Var != null) {
                            i23 = d1Var.b + 1;
                        }
                        org.telegram.ui.Components.c5.U(parentActivity, N0, i30, i23, d1Var2.b - 1, new y10() { // from class: kg.f1
                            @Override // org.telegram.messenger.y10
                            public final void a(Object obj4) {
                                Integer num = (Integer) obj4;
                                switch (i12) {
                                    case 0:
                                        g1 g1Var3 = g1Var2;
                                        boolean a02 = g1Var3.a0();
                                        n8 n8Var = (n8) view2;
                                        int intValue = num.intValue();
                                        d1Var2.a = intValue;
                                        n8Var.w(d1.a(intValue), true);
                                        if (a02 != g1Var3.a0()) {
                                            g1Var3.n.g3.O(true);
                                        }
                                        i0 i0Var3 = g1Var3.f;
                                        if (i0Var3 != null) {
                                            i0Var3.run();
                                            break;
                                        }
                                        break;
                                    default:
                                        g1 g1Var4 = g1Var2;
                                        boolean a03 = g1Var4.a0();
                                        n8 n8Var2 = (n8) view2;
                                        int intValue2 = num.intValue();
                                        d1Var2.b = intValue2;
                                        n8Var2.w(d1.a(intValue2), true);
                                        if (a03 != g1Var4.a0()) {
                                            g1Var4.n.g3.O(true);
                                        }
                                        i0 i0Var4 = g1Var4.f;
                                        if (i0Var4 != null) {
                                            i0Var4.run();
                                            break;
                                        }
                                        break;
                                }
                            }
                        });
                        break;
                    } else if (i29 == 1) {
                        Activity parentActivity2 = g1Var2.getParentActivity();
                        String N02 = hd.N0(2131752744, null);
                        int i31 = d1Var2.b;
                        int i32 = d1Var2.a + 1;
                        if (d1Var3 != null) {
                            i24 = d1Var3.a - 1;
                        }
                        org.telegram.ui.Components.c5.U(parentActivity2, N02, i31, i32, i24, new y10() { // from class: kg.f1
                            @Override // org.telegram.messenger.y10
                            public final void a(Object obj4) {
                                Integer num = (Integer) obj4;
                                switch (i11) {
                                    case 0:
                                        g1 g1Var3 = g1Var2;
                                        boolean a02 = g1Var3.a0();
                                        n8 n8Var = (n8) view2;
                                        int intValue = num.intValue();
                                        d1Var2.a = intValue;
                                        n8Var.w(d1.a(intValue), true);
                                        if (a02 != g1Var3.a0()) {
                                            g1Var3.n.g3.O(true);
                                        }
                                        i0 i0Var3 = g1Var3.f;
                                        if (i0Var3 != null) {
                                            i0Var3.run();
                                            break;
                                        }
                                        break;
                                    default:
                                        g1 g1Var4 = g1Var2;
                                        boolean a03 = g1Var4.a0();
                                        n8 n8Var2 = (n8) view2;
                                        int intValue2 = num.intValue();
                                        d1Var2.b = intValue2;
                                        n8Var2.w(d1.a(intValue2), true);
                                        if (a03 != g1Var4.a0()) {
                                            g1Var4.n.g3.O(true);
                                        }
                                        i0 i0Var4 = g1Var4.f;
                                        if (i0Var4 != null) {
                                            i0Var4.run();
                                            break;
                                        }
                                        break;
                                }
                            }
                        });
                        break;
                    } else if (i29 == 2) {
                        arrayList3.remove(i7);
                        if (arrayList3.isEmpty()) {
                            arrayList3.add(new kg.d1(0, 1439));
                        }
                        g1Var2.n.g3.O(true);
                        kg.i0 i0Var3 = g1Var2.f;
                        if (i0Var3 != null) {
                            i0Var3.run();
                            break;
                        }
                    }
                }
                break;
        }
    }

    @Override // h9.h1
    public Object m(Object obj, Object obj2) {
        return h9.o.y((List) ((Collection) obj2), new q4.q(((h9.m1) this.b).f, obj, false, 24));
    }

    @Override // org.telegram.ui.Components.rt0
    public RecyclerView n(View view) {
        ((ob) this.b).getClass();
        return ((mb) view).a;
    }

    @Override // fi.z8
    public void o(float f10, Canvas canvas, RectF rectF, boolean z10) {
        Path path = (Path) this.b;
        if (z10) {
            return;
        }
        path.rewind();
        float pow = (float) Math.pow(f10, 2.0d);
        path.addCircle((rectF.right + org.telegram.messenger.g0.L(7.0f)) - (org.telegram.messenger.g0.L(14.0f) * pow), (rectF.bottom + org.telegram.messenger.g0.L(7.0f)) - (org.telegram.messenger.g0.L(14.0f) * pow), org.telegram.messenger.g0.L(11.0f), Path.Direction.CW);
        canvas.clipPath(path, Region.Op.DIFFERENCE);
    }

    @Override // org.telegram.messenger.camera.CameraController.VideoTakeCallback
    public void onFinishVideoRecording(String str, long j3) {
        hi.p9 p9Var = (hi.p9) this.b;
        hi.sa saVar = p9Var.a;
        hi.d6 d6Var = saVar.P0;
        int i7 = saVar.c;
        if (d6Var != null) {
            d6Var.g(true);
        }
        if (saVar.p0()) {
            saVar.s.d();
        }
        if (saVar.H1 == null || saVar.C0 == null) {
            return;
        }
        saVar.R1 = false;
        saVar.S1 = false;
        hi.z5 z5Var = saVar.D0;
        if (z5Var != null) {
            z5Var.c(false);
        }
        if (j3 <= 800) {
            saVar.g(false, true);
            saVar.c0(false);
            saVar.K0.b(false, true);
            hi.d6 d6Var2 = saVar.P0;
            if (d6Var2 != null) {
                d6Var2.g(true);
            }
            try {
                saVar.H1.delete();
                saVar.H1 = null;
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
        saVar.h0(false, true);
        hi.c7 o4 = hi.c7.o(saVar.H1, str, j3);
        o4.J0 = saVar.w0;
        o4.K0 = saVar.x0;
        o4.B();
        saVar.g(false, true);
        saVar.c0(false);
        saVar.K0.b(false, true);
        hi.d6 d6Var3 = saVar.P0;
        if (d6Var3 != null) {
            d6Var3.g(true);
        }
        if (!saVar.B0.j()) {
            saVar.L1 = o4;
            hi.q8.a(i7, o4);
            saVar.M1 = false;
            int videoWidth = saVar.C0.getVideoWidth();
            int videoHeight = saVar.C0.getVideoHeight();
            if (videoWidth > 0 && videoHeight > 0) {
                hi.c7 c7Var = saVar.L1;
                c7Var.k0 = videoWidth;
                c7Var.l0 = videoHeight;
                c7Var.A();
            }
            saVar.K(new hi.n9(p9Var, 3), 0L);
            return;
        }
        saVar.H1 = null;
        o4.P = 1.0f;
        if (saVar.B0.l(o4)) {
            hi.c7 a10 = hi.c7.a(saVar.B0.getLayout(), saVar.B0.getContent());
            saVar.L1 = a10;
            hi.q8.a(i7, a10);
            saVar.M1 = false;
            int videoWidth2 = saVar.C0.getVideoWidth();
            int videoHeight2 = saVar.C0.getVideoHeight();
            if (videoWidth2 > 0 && videoHeight2 > 0) {
                hi.c7 c7Var2 = saVar.L1;
                c7Var2.k0 = videoWidth2;
                c7Var2.l0 = videoHeight2;
                c7Var2.A();
            }
        }
        saVar.l0(true);
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

    @Override // org.telegram.ui.Components.rt0
    public /* synthetic */ void r(RecyclerView recyclerView) {
        org.telegram.ui.Cells.c0.b(recyclerView);
    }

    @Override // sg.j1
    public void u() {
        hi.u9 u9Var = (hi.u9) this.b;
        TextView textView = u9Var.Y0;
        boolean a10 = u9Var.n0.a();
        ImageView imageView = u9Var.X0;
        imageView.animate().cancel();
        imageView.animate().alpha(a10 ? 1.0f : 0.6f).translationY(0.0f).setDuration(150L).start();
        imageView.setClickable(a10);
        textView.animate().cancel();
        textView.animate().alpha(a10 ? 1.0f : 0.6f).translationY(0.0f).setDuration(150L).start();
        textView.setClickable(a10);
    }

    @Override // org.telegram.ui.Components.rj0
    public /* synthetic */ void s0(View view, float f10, float f11) {
    }
}
