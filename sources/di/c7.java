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
import org.telegram.messenger.ef;
import org.telegram.messenger.fj;
import org.telegram.messenger.gd;
import org.telegram.messenger.j10;
import org.telegram.messenger.ks;
import org.telegram.messenger.mp;
import org.telegram.messenger.o10;
import org.telegram.messenger.r10;
import org.telegram.messenger.ri;
import org.telegram.messenger.tr;
import org.telegram.messenger.v10;
import org.telegram.messenger.x10;
import org.telegram.messenger.xs;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Cells.n8;
import org.telegram.ui.Components.dq0;
import org.telegram.ui.Components.ej0;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.mq;
import org.telegram.ui.Components.ot0;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.qj0;
import org.telegram.ui.Components.y60;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.NotificationsCustomSettingsActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.bb1;
import org.telegram.ui.cx;
import org.telegram.ui.ll0;
import org.telegram.ui.tv;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class c7 implements ll0, v10, OnSuccessListener, qj0, r10, pj0, fi.x6, fi.z8, xh.j, r0.m, h9.h1, org.telegram.ui.ActionBar.r1, ej0, sg.j1, CameraController.VideoTakeCallback, ot0, f3.g {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ c7(Object obj, int i7) {
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
        fi.z4 z4Var = (fi.z4) this.b;
        if (z4Var != null) {
            z4Var.c();
        }
    }

    @Override // org.telegram.ui.Components.pj0
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
    @Override // org.telegram.ui.Components.qj0
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
        mq mqVar;
        boolean z10;
        boolean z11;
        y60 y60Var;
        final int i17;
        int i18;
        int i19 = this.a;
        org.telegram.messenger.q2 q2Var = org.telegram.messenger.q2.E;
        final int i20 = 2;
        Object obj = this.b;
        final int i21 = 0;
        final int i22 = 1;
        switch (i19) {
            case 4:
                final tv tvVar = (tv) obj;
                if (tvVar.O == 0.0f && tvVar.o0 == 0.0f) {
                    final long j10 = ((fi.p) view).F;
                    cx cxVar = tvVar.P0;
                    i10 = ((org.telegram.ui.ActionBar.h2) cxVar).currentAccount;
                    ri.d0(i10).P0(true);
                    y60 I = y60.I(cxVar, view);
                    I.z.set(0, org.telegram.messenger.g0.L(8.0f), 0, 0);
                    I.X(org.telegram.ui.ActionBar.n6.e0(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f), cxVar.getThemedColor(org.telegram.ui.ActionBar.n6.d6)));
                    I.b0(0.0f, org.telegram.messenger.g0.L(8.0f));
                    cxVar.M0 = I;
                    if (!o10.B(j10)) {
                        try {
                            view.performHapticFeedback(0);
                        } catch (Exception unused) {
                        }
                        i11 = ((org.telegram.ui.ActionBar.h2) cxVar).currentAccount;
                        if (j10 != j10.i(i11).e()) {
                            final TLRPC.User c22 = cxVar.getMessagesController().c2(Long.valueOf(j10));
                            TLRPC.Chat O0 = cxVar.getMessagesController().O0(Long.valueOf(-j10));
                            final String v = xs.v(j10, 0L, false);
                            i12 = ((org.telegram.ui.ActionBar.h2) cxVar).currentAccount;
                            boolean h02 = NotificationsCustomSettingsActivity.h0(i12, j10);
                            i13 = ((org.telegram.ui.ActionBar.h2) cxVar).currentAccount;
                            boolean K3 = mp.u1(i13).K3();
                            i14 = ((org.telegram.ui.ActionBar.h2) cxVar).currentAccount;
                            boolean q10 = j10.i(i14).q();
                            i15 = ((org.telegram.ui.ActionBar.h2) cxVar).currentAccount;
                            boolean L = mp.u1(i15).R1().L(j10);
                            i16 = ((org.telegram.ui.ActionBar.h2) cxVar).currentAccount;
                            boolean H = mp.u1(i16).R1().H(j10);
                            if (K3 || j10 <= 0 || q10) {
                                j3 = 0;
                            } else {
                                j3 = 0;
                                Drawable drawable = tvVar.getContext().getDrawable(R.drawable.msg_gallery_locked2);
                                if (drawable != null) {
                                    Drawable drawable2 = tvVar.getContext().getDrawable(R.drawable.msg_stealth_locked);
                                    if (drawable2 != null) {
                                        org.telegram.ui.ActionBar.u6.x(tvVar, drawable2, org.telegram.ui.ActionBar.n6.F8, cxVar.getResourceProvider(), PorterDuff.Mode.MULTIPLY);
                                    }
                                    drawable.setColorFilter(new PorterDuffColorFilter(i0.a.f(0.5f, -1, -16777216), PorterDuff.Mode.MULTIPLY));
                                    mqVar = new mq(drawable2, drawable);
                                    if (j10 < j3 && cxVar.k4().j(j10)) {
                                        final int i23 = 4;
                                        cxVar.M0.b(R.drawable.msg_stories_add, null, gd.M0(2131754382, null), org.telegram.ui.ActionBar.n6.F8, org.telegram.ui.ActionBar.n6.E8, new Runnable() { // from class: org.telegram.ui.pv
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
                                                        i24 = ((org.telegram.ui.ActionBar.h2) cxVar2).currentAccount;
                                                        org.telegram.messenger.ri d02 = org.telegram.messenger.ri.d0(i24);
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
                                        i18 = ((org.telegram.ui.ActionBar.h2) cxVar).currentAccount;
                                        if (ri.d0(i18).I(j10)) {
                                            z10 = true;
                                            y60 y60Var2 = cxVar.M0;
                                            final int i24 = 5;
                                            y60Var2.l(R.drawable.msg_discussion, gd.M0(2131745406, null), new Runnable() { // from class: org.telegram.ui.pv
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
                                                            i242 = ((org.telegram.ui.ActionBar.h2) cxVar2).currentAccount;
                                                            org.telegram.messenger.ri d02 = org.telegram.messenger.ri.d0(i242);
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
                                            y60Var2.l(R.drawable.msg_openprofile, gd.M0(2131747593, null), new Runnable() { // from class: org.telegram.ui.pv
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
                                                            i242 = ((org.telegram.ui.ActionBar.h2) cxVar2).currentAccount;
                                                            org.telegram.messenger.ri d02 = org.telegram.messenger.ri.d0(i242);
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
                                            y60Var2.l(R.drawable.msg_channel, gd.M0(org.telegram.messenger.v3.V(O0) ? 2131747618 : 2131747606, null), new Runnable() { // from class: org.telegram.ui.pv
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
                                                            i242 = ((org.telegram.ui.ActionBar.h2) cxVar2).currentAccount;
                                                            org.telegram.messenger.ri d02 = org.telegram.messenger.ri.d0(i242);
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
                                            y60Var2.l(R.drawable.msg_mute, gd.M0(2131747670, null), new Runnable() { // from class: org.telegram.ui.qv
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
                                                            i28 = ((org.telegram.ui.ActionBar.h2) cxVar2).currentAccount;
                                                            org.telegram.messenger.mp.u1(i28).g7.edit().putBoolean("stories_" + str, false).apply();
                                                            cxVar2.getNotificationsController().c0(j10, 0L, true);
                                                            trim = user != null ? user.first_name.trim() : "";
                                                            int indexOf = trim.indexOf(" ");
                                                            if (indexOf > 0) {
                                                                trim = trim.substring(0, indexOf);
                                                            }
                                                            org.telegram.ui.Components.lc.b0(cxVar2).V(Arrays.asList(user), org.telegram.messenger.g0.W2(org.telegram.messenger.gd.a0("NotificationsStoryMutedHint", null, 2131747669, trim)), null, null).j();
                                                            break;
                                                        default:
                                                            cx cxVar3 = tvVar2.P0;
                                                            i29 = ((org.telegram.ui.ActionBar.h2) cxVar3).currentAccount;
                                                            org.telegram.messenger.mp.u1(i29).g7.edit().putBoolean("stories_" + str, true).apply();
                                                            cxVar3.getNotificationsController().c0(j10, 0L, true);
                                                            trim = user != null ? user.first_name.trim() : "";
                                                            int indexOf2 = trim.indexOf(" ");
                                                            if (indexOf2 > 0) {
                                                                trim = trim.substring(0, indexOf2);
                                                            }
                                                            org.telegram.ui.Components.lc.b0(cxVar3).V(Arrays.asList(user), org.telegram.messenger.g0.W2(org.telegram.messenger.gd.a0("NotificationsStoryUnmutedHint", null, 2131747666, trim)), null, null).j();
                                                            break;
                                                    }
                                                }
                                            }, !h02 && j10 > j3);
                                            y60Var2.F();
                                            final int i28 = 1;
                                            y60Var2.l(R.drawable.msg_unmute, gd.M0(2131747667, null), new Runnable() { // from class: org.telegram.ui.qv
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
                                                            i282 = ((org.telegram.ui.ActionBar.h2) cxVar2).currentAccount;
                                                            org.telegram.messenger.mp.u1(i282).g7.edit().putBoolean("stories_" + str, false).apply();
                                                            cxVar2.getNotificationsController().c0(j10, 0L, true);
                                                            trim = user != null ? user.first_name.trim() : "";
                                                            int indexOf = trim.indexOf(" ");
                                                            if (indexOf > 0) {
                                                                trim = trim.substring(0, indexOf);
                                                            }
                                                            org.telegram.ui.Components.lc.b0(cxVar2).V(Arrays.asList(user), org.telegram.messenger.g0.W2(org.telegram.messenger.gd.a0("NotificationsStoryMutedHint", null, 2131747669, trim)), null, null).j();
                                                            break;
                                                        default:
                                                            cx cxVar3 = tvVar2.P0;
                                                            i29 = ((org.telegram.ui.ActionBar.h2) cxVar3).currentAccount;
                                                            org.telegram.messenger.mp.u1(i29).g7.edit().putBoolean("stories_" + str, true).apply();
                                                            cxVar3.getNotificationsController().c0(j10, 0L, true);
                                                            trim = user != null ? user.first_name.trim() : "";
                                                            int indexOf2 = trim.indexOf(" ");
                                                            if (indexOf2 > 0) {
                                                                trim = trim.substring(0, indexOf2);
                                                            }
                                                            org.telegram.ui.Components.lc.b0(cxVar3).V(Arrays.asList(user), org.telegram.messenger.g0.W2(org.telegram.messenger.gd.a0("NotificationsStoryUnmutedHint", null, 2131747666, trim)), null, null).j();
                                                            break;
                                                    }
                                                }
                                            }, h02 && j10 > j3);
                                            y60Var2.F();
                                            final int i29 = 0;
                                            y60Var2.l(R.drawable.msg_stories_stealth2, gd.M0(2131743325, null), new Runnable() { // from class: org.telegram.ui.rv
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    org.telegram.ui.ActionBar.i6 i6Var;
                                                    int i30;
                                                    org.telegram.ui.ActionBar.i6 i6Var2;
                                                    switch (i29) {
                                                        case 0:
                                                            tv tvVar2 = tvVar;
                                                            cx cxVar2 = tvVar2.P0;
                                                            TL_stories.TL_storiesStealthMode tL_storiesStealthMode = org.telegram.messenger.mp.u1(org.telegram.messenger.j10.t0).R1().B;
                                                            View view2 = view;
                                                            if (tL_storiesStealthMode != null) {
                                                                i30 = ((org.telegram.ui.ActionBar.h2) cxVar2).currentAccount;
                                                                if (ConnectionsManager.getInstance(i30).getCurrentTime() < tL_storiesStealthMode.active_until_date) {
                                                                    if (view2 instanceof fi.p) {
                                                                        cxVar2.F0.i((fi.p) view2, false);
                                                                        break;
                                                                    }
                                                                }
                                                            }
                                                            Context context = tvVar2.getContext();
                                                            i6Var = ((org.telegram.ui.ActionBar.h2) cxVar2).resourceProvider;
                                                            fi.m5 m5Var = new fi.m5(context, 0.0f, 1, i6Var);
                                                            m5Var.p1 = new sv(tvVar2, view2, 1);
                                                            cxVar2.showDialog(m5Var);
                                                            break;
                                                        default:
                                                            tv tvVar3 = tvVar;
                                                            Context context2 = tvVar3.getContext();
                                                            cx cxVar3 = tvVar3.P0;
                                                            i6Var2 = ((org.telegram.ui.ActionBar.h2) cxVar3).resourceProvider;
                                                            fi.m5 m5Var2 = new fi.m5(context2, 0.0f, 1, i6Var2);
                                                            m5Var2.p1 = new sv(tvVar3, view, 0);
                                                            cxVar3.showDialog(m5Var2);
                                                            break;
                                                    }
                                                }
                                            }, K3 && j10 > j3 && q10 && L && !H);
                                            y60Var2.F();
                                            z11 = K3 && j10 > j3 && !q10 && L && !H;
                                            String M0 = gd.M0(2131743325, null);
                                            final int i30 = 1;
                                            Runnable runnable = new Runnable() { // from class: org.telegram.ui.rv
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    org.telegram.ui.ActionBar.i6 i6Var;
                                                    int i302;
                                                    org.telegram.ui.ActionBar.i6 i6Var2;
                                                    switch (i30) {
                                                        case 0:
                                                            tv tvVar2 = tvVar;
                                                            cx cxVar2 = tvVar2.P0;
                                                            TL_stories.TL_storiesStealthMode tL_storiesStealthMode = org.telegram.messenger.mp.u1(org.telegram.messenger.j10.t0).R1().B;
                                                            View view2 = view;
                                                            if (tL_storiesStealthMode != null) {
                                                                i302 = ((org.telegram.ui.ActionBar.h2) cxVar2).currentAccount;
                                                                if (ConnectionsManager.getInstance(i302).getCurrentTime() < tL_storiesStealthMode.active_until_date) {
                                                                    if (view2 instanceof fi.p) {
                                                                        cxVar2.F0.i((fi.p) view2, false);
                                                                        break;
                                                                    }
                                                                }
                                                            }
                                                            Context context = tvVar2.getContext();
                                                            i6Var = ((org.telegram.ui.ActionBar.h2) cxVar2).resourceProvider;
                                                            fi.m5 m5Var = new fi.m5(context, 0.0f, 1, i6Var);
                                                            m5Var.p1 = new sv(tvVar2, view2, 1);
                                                            cxVar2.showDialog(m5Var);
                                                            break;
                                                        default:
                                                            tv tvVar3 = tvVar;
                                                            Context context2 = tvVar3.getContext();
                                                            cx cxVar3 = tvVar3.P0;
                                                            i6Var2 = ((org.telegram.ui.ActionBar.h2) cxVar3).resourceProvider;
                                                            fi.m5 m5Var2 = new fi.m5(context2, 0.0f, 1, i6Var2);
                                                            m5Var2.p1 = new sv(tvVar3, view, 0);
                                                            cxVar3.showDialog(m5Var2);
                                                            break;
                                                    }
                                                }
                                            };
                                            if (z11) {
                                                y60Var2.b(R.drawable.msg_stories_stealth2, mqVar, M0, org.telegram.ui.ActionBar.n6.F8, org.telegram.ui.ActionBar.n6.E8, runnable);
                                                y60Var = y60Var2;
                                            } else {
                                                y60Var = y60Var2;
                                            }
                                            y60Var.F();
                                            final int i31 = 1;
                                            y60Var.l(R.drawable.msg_archive, gd.M0(2131754151, null), new Runnable() { // from class: org.telegram.ui.pv
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
                                                            i242 = ((org.telegram.ui.ActionBar.h2) cxVar2).currentAccount;
                                                            org.telegram.messenger.ri d02 = org.telegram.messenger.ri.d0(i242);
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
                                            y60Var.F();
                                            final int i32 = 2;
                                            y60Var.l(R.drawable.msg_unarchive, gd.M0(2131743677, null), new Runnable() { // from class: org.telegram.ui.pv
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
                                                            i242 = ((org.telegram.ui.ActionBar.h2) cxVar2).currentAccount;
                                                            org.telegram.messenger.ri d02 = org.telegram.messenger.ri.d0(i242);
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
                                            y60Var.F();
                                            i17 = 3;
                                            y60Var.l(R.drawable.msg_delete, gd.M0(2131744513, null), new Runnable() { // from class: org.telegram.ui.pv
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
                                                            i242 = ((org.telegram.ui.ActionBar.h2) cxVar2).currentAccount;
                                                            org.telegram.messenger.ri d02 = org.telegram.messenger.ri.d0(i242);
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
                                    y60 y60Var22 = cxVar.M0;
                                    final int i242 = 5;
                                    y60Var22.l(R.drawable.msg_discussion, gd.M0(2131745406, null), new Runnable() { // from class: org.telegram.ui.pv
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
                                                    i2422 = ((org.telegram.ui.ActionBar.h2) cxVar2).currentAccount;
                                                    org.telegram.messenger.ri d02 = org.telegram.messenger.ri.d0(i2422);
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
                                    y60Var22.l(R.drawable.msg_openprofile, gd.M0(2131747593, null), new Runnable() { // from class: org.telegram.ui.pv
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
                                                    i2422 = ((org.telegram.ui.ActionBar.h2) cxVar2).currentAccount;
                                                    org.telegram.messenger.ri d02 = org.telegram.messenger.ri.d0(i2422);
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
                                    y60Var22.l(R.drawable.msg_channel, gd.M0(org.telegram.messenger.v3.V(O0) ? 2131747618 : 2131747606, null), new Runnable() { // from class: org.telegram.ui.pv
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
                                                    i2422 = ((org.telegram.ui.ActionBar.h2) cxVar2).currentAccount;
                                                    org.telegram.messenger.ri d02 = org.telegram.messenger.ri.d0(i2422);
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
                                    y60Var22.l(R.drawable.msg_mute, gd.M0(2131747670, null), new Runnable() { // from class: org.telegram.ui.qv
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
                                                    i282 = ((org.telegram.ui.ActionBar.h2) cxVar2).currentAccount;
                                                    org.telegram.messenger.mp.u1(i282).g7.edit().putBoolean("stories_" + str, false).apply();
                                                    cxVar2.getNotificationsController().c0(j10, 0L, true);
                                                    trim = user != null ? user.first_name.trim() : "";
                                                    int indexOf = trim.indexOf(" ");
                                                    if (indexOf > 0) {
                                                        trim = trim.substring(0, indexOf);
                                                    }
                                                    org.telegram.ui.Components.lc.b0(cxVar2).V(Arrays.asList(user), org.telegram.messenger.g0.W2(org.telegram.messenger.gd.a0("NotificationsStoryMutedHint", null, 2131747669, trim)), null, null).j();
                                                    break;
                                                default:
                                                    cx cxVar3 = tvVar2.P0;
                                                    i292 = ((org.telegram.ui.ActionBar.h2) cxVar3).currentAccount;
                                                    org.telegram.messenger.mp.u1(i292).g7.edit().putBoolean("stories_" + str, true).apply();
                                                    cxVar3.getNotificationsController().c0(j10, 0L, true);
                                                    trim = user != null ? user.first_name.trim() : "";
                                                    int indexOf2 = trim.indexOf(" ");
                                                    if (indexOf2 > 0) {
                                                        trim = trim.substring(0, indexOf2);
                                                    }
                                                    org.telegram.ui.Components.lc.b0(cxVar3).V(Arrays.asList(user), org.telegram.messenger.g0.W2(org.telegram.messenger.gd.a0("NotificationsStoryUnmutedHint", null, 2131747666, trim)), null, null).j();
                                                    break;
                                            }
                                        }
                                    }, !h02 && j10 > j3);
                                    y60Var22.F();
                                    final int i282 = 1;
                                    y60Var22.l(R.drawable.msg_unmute, gd.M0(2131747667, null), new Runnable() { // from class: org.telegram.ui.qv
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
                                                    i2822 = ((org.telegram.ui.ActionBar.h2) cxVar2).currentAccount;
                                                    org.telegram.messenger.mp.u1(i2822).g7.edit().putBoolean("stories_" + str, false).apply();
                                                    cxVar2.getNotificationsController().c0(j10, 0L, true);
                                                    trim = user != null ? user.first_name.trim() : "";
                                                    int indexOf = trim.indexOf(" ");
                                                    if (indexOf > 0) {
                                                        trim = trim.substring(0, indexOf);
                                                    }
                                                    org.telegram.ui.Components.lc.b0(cxVar2).V(Arrays.asList(user), org.telegram.messenger.g0.W2(org.telegram.messenger.gd.a0("NotificationsStoryMutedHint", null, 2131747669, trim)), null, null).j();
                                                    break;
                                                default:
                                                    cx cxVar3 = tvVar2.P0;
                                                    i292 = ((org.telegram.ui.ActionBar.h2) cxVar3).currentAccount;
                                                    org.telegram.messenger.mp.u1(i292).g7.edit().putBoolean("stories_" + str, true).apply();
                                                    cxVar3.getNotificationsController().c0(j10, 0L, true);
                                                    trim = user != null ? user.first_name.trim() : "";
                                                    int indexOf2 = trim.indexOf(" ");
                                                    if (indexOf2 > 0) {
                                                        trim = trim.substring(0, indexOf2);
                                                    }
                                                    org.telegram.ui.Components.lc.b0(cxVar3).V(Arrays.asList(user), org.telegram.messenger.g0.W2(org.telegram.messenger.gd.a0("NotificationsStoryUnmutedHint", null, 2131747666, trim)), null, null).j();
                                                    break;
                                            }
                                        }
                                    }, h02 && j10 > j3);
                                    y60Var22.F();
                                    final int i292 = 0;
                                    y60Var22.l(R.drawable.msg_stories_stealth2, gd.M0(2131743325, null), new Runnable() { // from class: org.telegram.ui.rv
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            org.telegram.ui.ActionBar.i6 i6Var;
                                            int i302;
                                            org.telegram.ui.ActionBar.i6 i6Var2;
                                            switch (i292) {
                                                case 0:
                                                    tv tvVar2 = tvVar;
                                                    cx cxVar2 = tvVar2.P0;
                                                    TL_stories.TL_storiesStealthMode tL_storiesStealthMode = org.telegram.messenger.mp.u1(org.telegram.messenger.j10.t0).R1().B;
                                                    View view2 = view;
                                                    if (tL_storiesStealthMode != null) {
                                                        i302 = ((org.telegram.ui.ActionBar.h2) cxVar2).currentAccount;
                                                        if (ConnectionsManager.getInstance(i302).getCurrentTime() < tL_storiesStealthMode.active_until_date) {
                                                            if (view2 instanceof fi.p) {
                                                                cxVar2.F0.i((fi.p) view2, false);
                                                                break;
                                                            }
                                                        }
                                                    }
                                                    Context context = tvVar2.getContext();
                                                    i6Var = ((org.telegram.ui.ActionBar.h2) cxVar2).resourceProvider;
                                                    fi.m5 m5Var = new fi.m5(context, 0.0f, 1, i6Var);
                                                    m5Var.p1 = new sv(tvVar2, view2, 1);
                                                    cxVar2.showDialog(m5Var);
                                                    break;
                                                default:
                                                    tv tvVar3 = tvVar;
                                                    Context context2 = tvVar3.getContext();
                                                    cx cxVar3 = tvVar3.P0;
                                                    i6Var2 = ((org.telegram.ui.ActionBar.h2) cxVar3).resourceProvider;
                                                    fi.m5 m5Var2 = new fi.m5(context2, 0.0f, 1, i6Var2);
                                                    m5Var2.p1 = new sv(tvVar3, view, 0);
                                                    cxVar3.showDialog(m5Var2);
                                                    break;
                                            }
                                        }
                                    }, K3 && j10 > j3 && q10 && L && !H);
                                    y60Var22.F();
                                    if (K3) {
                                    }
                                    String M02 = gd.M0(2131743325, null);
                                    final int i302 = 1;
                                    Runnable runnable2 = new Runnable() { // from class: org.telegram.ui.rv
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            org.telegram.ui.ActionBar.i6 i6Var;
                                            int i3022;
                                            org.telegram.ui.ActionBar.i6 i6Var2;
                                            switch (i302) {
                                                case 0:
                                                    tv tvVar2 = tvVar;
                                                    cx cxVar2 = tvVar2.P0;
                                                    TL_stories.TL_storiesStealthMode tL_storiesStealthMode = org.telegram.messenger.mp.u1(org.telegram.messenger.j10.t0).R1().B;
                                                    View view2 = view;
                                                    if (tL_storiesStealthMode != null) {
                                                        i3022 = ((org.telegram.ui.ActionBar.h2) cxVar2).currentAccount;
                                                        if (ConnectionsManager.getInstance(i3022).getCurrentTime() < tL_storiesStealthMode.active_until_date) {
                                                            if (view2 instanceof fi.p) {
                                                                cxVar2.F0.i((fi.p) view2, false);
                                                                break;
                                                            }
                                                        }
                                                    }
                                                    Context context = tvVar2.getContext();
                                                    i6Var = ((org.telegram.ui.ActionBar.h2) cxVar2).resourceProvider;
                                                    fi.m5 m5Var = new fi.m5(context, 0.0f, 1, i6Var);
                                                    m5Var.p1 = new sv(tvVar2, view2, 1);
                                                    cxVar2.showDialog(m5Var);
                                                    break;
                                                default:
                                                    tv tvVar3 = tvVar;
                                                    Context context2 = tvVar3.getContext();
                                                    cx cxVar3 = tvVar3.P0;
                                                    i6Var2 = ((org.telegram.ui.ActionBar.h2) cxVar3).resourceProvider;
                                                    fi.m5 m5Var2 = new fi.m5(context2, 0.0f, 1, i6Var2);
                                                    m5Var2.p1 = new sv(tvVar3, view, 0);
                                                    cxVar3.showDialog(m5Var2);
                                                    break;
                                            }
                                        }
                                    };
                                    if (z11) {
                                    }
                                    y60Var.F();
                                    final int i312 = 1;
                                    y60Var.l(R.drawable.msg_archive, gd.M0(2131754151, null), new Runnable() { // from class: org.telegram.ui.pv
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
                                                    i2422 = ((org.telegram.ui.ActionBar.h2) cxVar2).currentAccount;
                                                    org.telegram.messenger.ri d02 = org.telegram.messenger.ri.d0(i2422);
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
                                    y60Var.F();
                                    final int i322 = 2;
                                    y60Var.l(R.drawable.msg_unarchive, gd.M0(2131743677, null), new Runnable() { // from class: org.telegram.ui.pv
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
                                                    i2422 = ((org.telegram.ui.ActionBar.h2) cxVar2).currentAccount;
                                                    org.telegram.messenger.ri d02 = org.telegram.messenger.ri.d0(i2422);
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
                                    y60Var.F();
                                    i17 = 3;
                                    y60Var.l(R.drawable.msg_delete, gd.M0(2131744513, null), new Runnable() { // from class: org.telegram.ui.pv
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
                                                    i2422 = ((org.telegram.ui.ActionBar.h2) cxVar2).currentAccount;
                                                    org.telegram.messenger.ri d02 = org.telegram.messenger.ri.d0(i2422);
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
                            mqVar = null;
                            if (j10 < j3) {
                                final int i232 = 4;
                                cxVar.M0.b(R.drawable.msg_stories_add, null, gd.M0(2131754382, null), org.telegram.ui.ActionBar.n6.F8, org.telegram.ui.ActionBar.n6.E8, new Runnable() { // from class: org.telegram.ui.pv
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
                                                i2422 = ((org.telegram.ui.ActionBar.h2) cxVar2).currentAccount;
                                                org.telegram.messenger.ri d02 = org.telegram.messenger.ri.d0(i2422);
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
                                i18 = ((org.telegram.ui.ActionBar.h2) cxVar).currentAccount;
                                if (ri.d0(i18).I(j10)) {
                                }
                            }
                            z10 = false;
                            y60 y60Var222 = cxVar.M0;
                            final int i2422 = 5;
                            y60Var222.l(R.drawable.msg_discussion, gd.M0(2131745406, null), new Runnable() { // from class: org.telegram.ui.pv
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
                                            i24222 = ((org.telegram.ui.ActionBar.h2) cxVar2).currentAccount;
                                            org.telegram.messenger.ri d02 = org.telegram.messenger.ri.d0(i24222);
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
                            y60Var222.l(R.drawable.msg_openprofile, gd.M0(2131747593, null), new Runnable() { // from class: org.telegram.ui.pv
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
                                            i24222 = ((org.telegram.ui.ActionBar.h2) cxVar2).currentAccount;
                                            org.telegram.messenger.ri d02 = org.telegram.messenger.ri.d0(i24222);
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
                            y60Var222.l(R.drawable.msg_channel, gd.M0(org.telegram.messenger.v3.V(O0) ? 2131747618 : 2131747606, null), new Runnable() { // from class: org.telegram.ui.pv
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
                                            i24222 = ((org.telegram.ui.ActionBar.h2) cxVar2).currentAccount;
                                            org.telegram.messenger.ri d02 = org.telegram.messenger.ri.d0(i24222);
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
                            y60Var222.l(R.drawable.msg_mute, gd.M0(2131747670, null), new Runnable() { // from class: org.telegram.ui.qv
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
                                            i2822 = ((org.telegram.ui.ActionBar.h2) cxVar2).currentAccount;
                                            org.telegram.messenger.mp.u1(i2822).g7.edit().putBoolean("stories_" + str, false).apply();
                                            cxVar2.getNotificationsController().c0(j10, 0L, true);
                                            trim = user != null ? user.first_name.trim() : "";
                                            int indexOf = trim.indexOf(" ");
                                            if (indexOf > 0) {
                                                trim = trim.substring(0, indexOf);
                                            }
                                            org.telegram.ui.Components.lc.b0(cxVar2).V(Arrays.asList(user), org.telegram.messenger.g0.W2(org.telegram.messenger.gd.a0("NotificationsStoryMutedHint", null, 2131747669, trim)), null, null).j();
                                            break;
                                        default:
                                            cx cxVar3 = tvVar2.P0;
                                            i2922 = ((org.telegram.ui.ActionBar.h2) cxVar3).currentAccount;
                                            org.telegram.messenger.mp.u1(i2922).g7.edit().putBoolean("stories_" + str, true).apply();
                                            cxVar3.getNotificationsController().c0(j10, 0L, true);
                                            trim = user != null ? user.first_name.trim() : "";
                                            int indexOf2 = trim.indexOf(" ");
                                            if (indexOf2 > 0) {
                                                trim = trim.substring(0, indexOf2);
                                            }
                                            org.telegram.ui.Components.lc.b0(cxVar3).V(Arrays.asList(user), org.telegram.messenger.g0.W2(org.telegram.messenger.gd.a0("NotificationsStoryUnmutedHint", null, 2131747666, trim)), null, null).j();
                                            break;
                                    }
                                }
                            }, !h02 && j10 > j3);
                            y60Var222.F();
                            final int i2822 = 1;
                            y60Var222.l(R.drawable.msg_unmute, gd.M0(2131747667, null), new Runnable() { // from class: org.telegram.ui.qv
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
                                            i28222 = ((org.telegram.ui.ActionBar.h2) cxVar2).currentAccount;
                                            org.telegram.messenger.mp.u1(i28222).g7.edit().putBoolean("stories_" + str, false).apply();
                                            cxVar2.getNotificationsController().c0(j10, 0L, true);
                                            trim = user != null ? user.first_name.trim() : "";
                                            int indexOf = trim.indexOf(" ");
                                            if (indexOf > 0) {
                                                trim = trim.substring(0, indexOf);
                                            }
                                            org.telegram.ui.Components.lc.b0(cxVar2).V(Arrays.asList(user), org.telegram.messenger.g0.W2(org.telegram.messenger.gd.a0("NotificationsStoryMutedHint", null, 2131747669, trim)), null, null).j();
                                            break;
                                        default:
                                            cx cxVar3 = tvVar2.P0;
                                            i2922 = ((org.telegram.ui.ActionBar.h2) cxVar3).currentAccount;
                                            org.telegram.messenger.mp.u1(i2922).g7.edit().putBoolean("stories_" + str, true).apply();
                                            cxVar3.getNotificationsController().c0(j10, 0L, true);
                                            trim = user != null ? user.first_name.trim() : "";
                                            int indexOf2 = trim.indexOf(" ");
                                            if (indexOf2 > 0) {
                                                trim = trim.substring(0, indexOf2);
                                            }
                                            org.telegram.ui.Components.lc.b0(cxVar3).V(Arrays.asList(user), org.telegram.messenger.g0.W2(org.telegram.messenger.gd.a0("NotificationsStoryUnmutedHint", null, 2131747666, trim)), null, null).j();
                                            break;
                                    }
                                }
                            }, h02 && j10 > j3);
                            y60Var222.F();
                            final int i2922 = 0;
                            y60Var222.l(R.drawable.msg_stories_stealth2, gd.M0(2131743325, null), new Runnable() { // from class: org.telegram.ui.rv
                                @Override // java.lang.Runnable
                                public final void run() {
                                    org.telegram.ui.ActionBar.i6 i6Var;
                                    int i3022;
                                    org.telegram.ui.ActionBar.i6 i6Var2;
                                    switch (i2922) {
                                        case 0:
                                            tv tvVar2 = tvVar;
                                            cx cxVar2 = tvVar2.P0;
                                            TL_stories.TL_storiesStealthMode tL_storiesStealthMode = org.telegram.messenger.mp.u1(org.telegram.messenger.j10.t0).R1().B;
                                            View view2 = view;
                                            if (tL_storiesStealthMode != null) {
                                                i3022 = ((org.telegram.ui.ActionBar.h2) cxVar2).currentAccount;
                                                if (ConnectionsManager.getInstance(i3022).getCurrentTime() < tL_storiesStealthMode.active_until_date) {
                                                    if (view2 instanceof fi.p) {
                                                        cxVar2.F0.i((fi.p) view2, false);
                                                        break;
                                                    }
                                                }
                                            }
                                            Context context = tvVar2.getContext();
                                            i6Var = ((org.telegram.ui.ActionBar.h2) cxVar2).resourceProvider;
                                            fi.m5 m5Var = new fi.m5(context, 0.0f, 1, i6Var);
                                            m5Var.p1 = new sv(tvVar2, view2, 1);
                                            cxVar2.showDialog(m5Var);
                                            break;
                                        default:
                                            tv tvVar3 = tvVar;
                                            Context context2 = tvVar3.getContext();
                                            cx cxVar3 = tvVar3.P0;
                                            i6Var2 = ((org.telegram.ui.ActionBar.h2) cxVar3).resourceProvider;
                                            fi.m5 m5Var2 = new fi.m5(context2, 0.0f, 1, i6Var2);
                                            m5Var2.p1 = new sv(tvVar3, view, 0);
                                            cxVar3.showDialog(m5Var2);
                                            break;
                                    }
                                }
                            }, K3 && j10 > j3 && q10 && L && !H);
                            y60Var222.F();
                            if (K3) {
                            }
                            String M022 = gd.M0(2131743325, null);
                            final int i3022 = 1;
                            Runnable runnable22 = new Runnable() { // from class: org.telegram.ui.rv
                                @Override // java.lang.Runnable
                                public final void run() {
                                    org.telegram.ui.ActionBar.i6 i6Var;
                                    int i30222;
                                    org.telegram.ui.ActionBar.i6 i6Var2;
                                    switch (i3022) {
                                        case 0:
                                            tv tvVar2 = tvVar;
                                            cx cxVar2 = tvVar2.P0;
                                            TL_stories.TL_storiesStealthMode tL_storiesStealthMode = org.telegram.messenger.mp.u1(org.telegram.messenger.j10.t0).R1().B;
                                            View view2 = view;
                                            if (tL_storiesStealthMode != null) {
                                                i30222 = ((org.telegram.ui.ActionBar.h2) cxVar2).currentAccount;
                                                if (ConnectionsManager.getInstance(i30222).getCurrentTime() < tL_storiesStealthMode.active_until_date) {
                                                    if (view2 instanceof fi.p) {
                                                        cxVar2.F0.i((fi.p) view2, false);
                                                        break;
                                                    }
                                                }
                                            }
                                            Context context = tvVar2.getContext();
                                            i6Var = ((org.telegram.ui.ActionBar.h2) cxVar2).resourceProvider;
                                            fi.m5 m5Var = new fi.m5(context, 0.0f, 1, i6Var);
                                            m5Var.p1 = new sv(tvVar2, view2, 1);
                                            cxVar2.showDialog(m5Var);
                                            break;
                                        default:
                                            tv tvVar3 = tvVar;
                                            Context context2 = tvVar3.getContext();
                                            cx cxVar3 = tvVar3.P0;
                                            i6Var2 = ((org.telegram.ui.ActionBar.h2) cxVar3).resourceProvider;
                                            fi.m5 m5Var2 = new fi.m5(context2, 0.0f, 1, i6Var2);
                                            m5Var2.p1 = new sv(tvVar3, view, 0);
                                            cxVar3.showDialog(m5Var2);
                                            break;
                                    }
                                }
                            };
                            if (z11) {
                            }
                            y60Var.F();
                            final int i3122 = 1;
                            y60Var.l(R.drawable.msg_archive, gd.M0(2131754151, null), new Runnable() { // from class: org.telegram.ui.pv
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
                                            i24222 = ((org.telegram.ui.ActionBar.h2) cxVar2).currentAccount;
                                            org.telegram.messenger.ri d02 = org.telegram.messenger.ri.d0(i24222);
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
                            y60Var.F();
                            final int i3222 = 2;
                            y60Var.l(R.drawable.msg_unarchive, gd.M0(2131743677, null), new Runnable() { // from class: org.telegram.ui.pv
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
                                            i24222 = ((org.telegram.ui.ActionBar.h2) cxVar2).currentAccount;
                                            org.telegram.messenger.ri d02 = org.telegram.messenger.ri.d0(i24222);
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
                            y60Var.F();
                            i17 = 3;
                            y60Var.l(R.drawable.msg_delete, gd.M0(2131744513, null), new Runnable() { // from class: org.telegram.ui.pv
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
                                            i24222 = ((org.telegram.ui.ActionBar.h2) cxVar2).currentAccount;
                                            org.telegram.messenger.ri d02 = org.telegram.messenger.ri.d0(i24222);
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
                            y60 y60Var3 = cxVar.M0;
                            String M03 = gd.M0(2131754382, null);
                            int i33 = org.telegram.ui.ActionBar.n6.F8;
                            int i34 = org.telegram.ui.ActionBar.n6.E8;
                            y60Var3.b(R.drawable.msg_stories_add, null, M03, i33, i34, new Runnable() { // from class: org.telegram.ui.ov
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
                                            i35 = ((org.telegram.ui.ActionBar.h2) cxVar2).currentAccount;
                                            bundle.putLong("dialog_id", org.telegram.messenger.j10.i(i35).e());
                                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                            bundle.putInt("start_from", 9);
                                            cxVar2.presentFragment(new org.telegram.ui.Components.i90(bundle, null));
                                            break;
                                        default:
                                            Bundle bundle2 = new Bundle();
                                            cx cxVar3 = tvVar.P0;
                                            i36 = ((org.telegram.ui.ActionBar.h2) cxVar3).currentAccount;
                                            bundle2.putLong("dialog_id", org.telegram.messenger.j10.i(i36).e());
                                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                            cxVar3.presentFragment(new org.telegram.ui.Components.i90(bundle2, null));
                                            break;
                                    }
                                }
                            });
                            cxVar.M0.b(R.drawable.msg_stories_archive, null, gd.M0(2131754121, null), i33, i34, new Runnable() { // from class: org.telegram.ui.ov
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
                                            i35 = ((org.telegram.ui.ActionBar.h2) cxVar2).currentAccount;
                                            bundle.putLong("dialog_id", org.telegram.messenger.j10.i(i35).e());
                                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                            bundle.putInt("start_from", 9);
                                            cxVar2.presentFragment(new org.telegram.ui.Components.i90(bundle, null));
                                            break;
                                        default:
                                            Bundle bundle2 = new Bundle();
                                            cx cxVar3 = tvVar.P0;
                                            i36 = ((org.telegram.ui.ActionBar.h2) cxVar3).currentAccount;
                                            bundle2.putLong("dialog_id", org.telegram.messenger.j10.i(i36).e());
                                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                            cxVar3.presentFragment(new org.telegram.ui.Components.i90(bundle2, null));
                                            break;
                                    }
                                }
                            });
                            cxVar.M0.b(R.drawable.msg_stories_saved, null, gd.M0(2131745690, null), i33, i34, new Runnable() { // from class: org.telegram.ui.ov
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
                                            i35 = ((org.telegram.ui.ActionBar.h2) cxVar2).currentAccount;
                                            bundle.putLong("dialog_id", org.telegram.messenger.j10.i(i35).e());
                                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                            bundle.putInt("start_from", 9);
                                            cxVar2.presentFragment(new org.telegram.ui.Components.i90(bundle, null));
                                            break;
                                        default:
                                            Bundle bundle2 = new Bundle();
                                            cx cxVar3 = tvVar.P0;
                                            i36 = ((org.telegram.ui.ActionBar.h2) cxVar3).currentAccount;
                                            bundle2.putLong("dialog_id", org.telegram.messenger.j10.i(i36).e());
                                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                            cxVar3.presentFragment(new org.telegram.ui.Components.i90(bundle2, null));
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
                        y60 y60Var4 = cxVar.M0;
                        y60Var4.i = i17;
                        y60Var4.b0(org.telegram.messenger.g0.L(-8.0f), org.telegram.messenger.g0.L(-10.0f));
                        y60Var4.a0();
                        return false;
                    }
                    q2Var.a();
                }
                return false;
            case 14:
                dq0 dq0Var = ((gi.m) obj).a0;
                if (dq0Var.H.F1 || !(view instanceof org.telegram.ui.Cells.p7)) {
                    return false;
                }
                fj messageObject = ((org.telegram.ui.Cells.p7) view).getMessageObject();
                if (dq0Var.c(messageObject)) {
                    dq0Var.g(messageObject);
                } else {
                    dq0Var.e(messageObject);
                }
                return true;
            default:
                hi.e3 e3Var = (hi.e3) obj;
                ArrayList arrayList = e3Var.c0;
                ArrayList arrayList2 = e3Var.i0;
                if (i7 < 2 || e3Var.a0 == null || !(view instanceof hi.a3)) {
                    return false;
                }
                int i35 = i7 - 2;
                if (e3Var.d0) {
                    if (i35 == 0) {
                        return false;
                    }
                    i35 = i7 - 3;
                } else if (e3Var.e0) {
                    if (i35 >= 0 && i35 < arrayList.size()) {
                        return false;
                    }
                    i35 -= arrayList.size();
                }
                if (i35 < 0 || i35 >= e3Var.g0.size()) {
                    return false;
                }
                ef efVar = (ef) e3Var.g0.get(i35);
                if (!arrayList2.isEmpty() || e3Var.R) {
                    return false;
                }
                if (arrayList2.contains(efVar)) {
                    arrayList2.remove(efVar);
                } else {
                    if (arrayList2.size() + 1 > e3Var.S) {
                        int i36 = -e3Var.O;
                        e3Var.O = i36;
                        org.telegram.messenger.g0.E3(i36, view, null);
                        q2Var.a();
                        return true;
                    }
                    arrayList2.add(efVar);
                }
                org.telegram.messenger.g0.Z3(e3Var.d);
                e3Var.j();
                return true;
        }
    }

    @Override // org.telegram.ui.ll0
    public void d(int i7) {
        bi.b8 b8Var = (bi.b8) this.b;
        if (i7 == 1) {
            b8Var.a(Boolean.TRUE, null);
        } else if (i7 != 3) {
            b8Var.a(Boolean.FALSE, null);
        }
    }

    @Override // org.telegram.ui.Components.pj0
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

    @Override // org.telegram.messenger.r10
    public Object g(Number number, Object obj) {
        int i7 = this.a;
        Object obj2 = this.b;
        switch (i7) {
            case 5:
                return fi.t0.a((fi.t0) obj2, (Long) obj);
            default:
                dq0 dq0Var = (dq0) obj2;
                if (((Integer) number).intValue() != -1) {
                    return Boolean.FALSE;
                }
                new gi.p(dq0Var.a, gd.M0(2131746498, null), new ai.g0(dq0Var, 20)).show();
                return Boolean.TRUE;
        }
    }

    @Override // org.telegram.ui.ActionBar.r1
    public void h(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        int i10;
        switch (this.a) {
            case 16:
                hi.ta taVar = ((hi.ja) ((hi.s) this.b)).S1;
                hi.ha haVar = taVar.Y0;
                if (haVar != null) {
                    haVar.s(null, null, true);
                }
                hi.v9 v9Var = taVar.w1;
                if (v9Var != null) {
                    v9Var.n0();
                }
                hi.ja jaVar = taVar.d1;
                if (jaVar != null) {
                    jaVar.setHasRoundVideo(false);
                }
                hi.d7 d7Var = taVar.L1;
                if (d7Var != null) {
                    File file = d7Var.o0;
                    if (file != null) {
                        try {
                            file.delete();
                        } catch (Exception unused) {
                        }
                        taVar.L1.o0 = null;
                    }
                    if (taVar.L1.p0 != null) {
                        try {
                            new File(taVar.L1.p0).delete();
                        } catch (Exception unused2) {
                        }
                        taVar.L1.p0 = null;
                        break;
                    }
                }
                break;
            case 21:
                ((hi.e5) this.b).a.Z1.r();
                break;
            case 23:
                ((TwoStepVerificationActivity) this.b).presentFragment(new bb1(6, null));
                break;
            default:
                kg.t1 t1Var = (kg.t1) ((bi.r1) this.b).b;
                i10 = ((org.telegram.ui.ActionBar.h2) t1Var).currentAccount;
                kg.w1 f10 = kg.w1.f(i10);
                ArrayList arrayList = t1Var.b;
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
                        kg.v1 c10 = f10.c(((Integer) arrayList.get(i13)).intValue());
                        f10.b.remove(c10);
                        f10.a(c10.b);
                        TLRPC.TL_messages_deleteQuickReplyShortcut tL_messages_deleteQuickReplyShortcut = new TLRPC.TL_messages_deleteQuickReplyShortcut();
                        tL_messages_deleteQuickReplyShortcut.shortcut_id = c10.a;
                        ConnectionsManager.getInstance(i11).sendRequest(tL_messages_deleteQuickReplyShortcut, new fi.k5(6));
                        if ("hello".equals(c10.b)) {
                            ConnectionsManager.getInstance(i11).sendRequest(new TL_account.updateBusinessGreetingMessage(), null);
                            TLRPC.UserFull d2 = mp.u1(i11).d2(j10.i(i11).e());
                            if (d2 != null) {
                                d2.flags2 &= -5;
                                d2.business_greeting_message = null;
                                tr.a0(i11).j2(d2, true);
                            }
                        } else if ("away".equals(c10.b)) {
                            ConnectionsManager.getInstance(i11).sendRequest(new TL_account.updateBusinessAwayMessage(), null);
                            TLRPC.UserFull d22 = mp.u1(i11).d2(j10.i(i11).e());
                            if (d22 != null) {
                                d22.flags2 &= -9;
                                d22.business_away_message = null;
                                tr.a0(i11).j2(d22, true);
                            }
                        }
                    }
                    f10.l();
                    tr a02 = tr.a0(i11);
                    a02.a.c(new hi.z0(a02, arrayList, 2));
                    ks.f(i11).k(ks.F1, new Object[0]);
                }
                kg.t1.c0(t1Var);
                break;
        }
    }

    @Override // org.telegram.ui.Components.ej0
    public void i() {
        ((hi.o1) this.b).invalidate();
    }

    @Override // org.telegram.ui.Components.ot0
    public /* synthetic */ float j(RecyclerView recyclerView) {
        return org.telegram.ui.Cells.c0.c(recyclerView);
    }

    @Override // f3.g
    public long k(long j3) {
        return h2.l0.j((j3 * r0.e) / 1000000, 0L, ((f3.u) this.b).j - 1);
    }

    @Override // org.telegram.messenger.v10
    public void l(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        org.telegram.ui.ActionBar.h2 T;
        int i7;
        int i10 = 3;
        int i11 = 2;
        final int i12 = 1;
        final int i13 = 0;
        switch (this.a) {
            case 1:
                mb mbVar = (mb) this.b;
                l41 l41Var = (l41) obj;
                Object obj3 = l41Var.H;
                if (obj3 instanceof TL_stars.StarsTransaction) {
                    pb.l1(mbVar.getContext(), false, 0L, mbVar.c, (TL_stars.StarsTransaction) l41Var.H, mbVar.b);
                    break;
                } else if ((obj3 instanceof TL_wallet.walletTransaction) && (T = LaunchActivity.T()) != null) {
                    T.presentFragment(new org.telegram.ui.Wallet.n6());
                    break;
                }
                break;
            case 19:
                hi.m9 m9Var = (hi.m9) this.b;
                l41 l41Var2 = (l41) obj;
                int i14 = l41Var2.d;
                hi.d7 d7Var = (hi.d7) l41Var2.H;
                m9Var.c(false, true);
                hi.ta taVar = m9Var.P;
                if (d7Var != taVar.L1 && !taVar.Y1) {
                    taVar.e1.setSelected(i14);
                    taVar.Y1 = true;
                    ai.w0 w0Var = new ai.w0(taVar, i14, 12);
                    hi.v9 v9Var = taVar.w1;
                    hi.d7 d7Var2 = taVar.L1;
                    if (v9Var != null && d7Var2 != null) {
                        if (v9Var.r0()) {
                            d7Var2.f();
                            Utilities.g.c(new hi.v8(taVar, v9Var, d7Var2.i0, d7Var2.j0, d7Var2, v9Var.y0.getPainting().E, v9Var.r0(), w0Var, 0));
                            break;
                        } else {
                            w0Var.run();
                            break;
                        }
                    } else {
                        w0Var.run();
                        break;
                    }
                }
                break;
            case 26:
                kg.f1 f1Var = (kg.f1) this.b;
                l41 l41Var3 = (l41) obj;
                View view = (View) obj2;
                float floatValue = ((Float) serializable).floatValue();
                int i15 = l41Var3.d;
                if (i15 == -1) {
                    boolean z10 = !f1Var.d;
                    f1Var.d = z10;
                    ((org.telegram.ui.Cells.s8) view).setChecked(z10);
                    f1Var.a.g3.O(true);
                    f1Var.d0(true);
                    break;
                } else if (i15 == -2) {
                    kg.y1 y1Var = new kg.y1(null);
                    y1Var.n = f1Var.n;
                    y1Var.c = new ai.v1(25, f1Var, view);
                    f1Var.presentFragment(y1Var);
                    break;
                } else if (l41Var3.a == 5 && i15 >= 0 && i15 < f1Var.f.length) {
                    if (!gd.a0 ? floatValue < view.getMeasuredWidth() - org.telegram.messenger.g0.L(76.0f) : floatValue > org.telegram.messenger.g0.L(76.0f)) {
                        int i16 = (l41Var3.d + 6) % 7;
                        int i17 = 0;
                        for (int i18 = 0; i18 < f1Var.f[i16].size(); i18++) {
                            if (((kg.e1) f1Var.f[i16].get(i18)).b > i17) {
                                i17 = ((kg.e1) f1Var.f[i16].get(i18)).b;
                            }
                        }
                        int max = Math.max(0, i17 - 1439);
                        int i19 = (l41Var3.d + 1) % 7;
                        int i20 = 1440;
                        for (int i21 = 0; i21 < f1Var.f[i19].size(); i21++) {
                            if (((kg.e1) f1Var.f[i19].get(i21)).a < i20) {
                                i20 = ((kg.e1) f1Var.f[i19].get(i21)).a;
                            }
                        }
                        int i22 = i20 + 1439;
                        CharSequence charSequence = l41Var3.m;
                        ArrayList arrayList = f1Var.f[l41Var3.d];
                        int i23 = 0;
                        while (i13 < 7) {
                            ArrayList arrayList2 = f1Var.f[i13];
                            if (arrayList2 != null) {
                                i23 = Math.max(1, arrayList2.size()) + i23;
                            }
                            i13++;
                        }
                        kg.h1 h1Var = new kg.h1(charSequence, arrayList, max, i22, 28 - i23);
                        h1Var.f = new kg.j0(f1Var, i10);
                        h1Var.h = new kg.h0(i11, f1Var, l41Var3);
                        f1Var.presentFragment(h1Var);
                        break;
                    } else {
                        if (f1Var.f[l41Var3.d].isEmpty()) {
                            ((org.telegram.ui.Cells.j5) view).setChecked(true);
                            f1Var.f[l41Var3.d].add(new kg.e1(0, 1439));
                            f1Var.c0(l41Var3.d);
                        } else {
                            f1Var.f[l41Var3.d].clear();
                            ((org.telegram.ui.Cells.j5) view).setChecked(false);
                        }
                        ((org.telegram.ui.Cells.j5) view).setValue(kg.f1.f0(f1Var.f[l41Var3.d]));
                        f1Var.d0(true);
                        break;
                    }
                }
                break;
            case 27:
                final kg.h1 h1Var2 = (kg.h1) this.b;
                l41 l41Var4 = (l41) obj;
                final View view2 = (View) obj2;
                int i24 = h1Var2.c;
                int i25 = h1Var2.d;
                ArrayList arrayList3 = h1Var2.b;
                int i26 = l41Var4.d;
                if (i26 == -1) {
                    h1Var2.r = !h1Var2.r;
                    arrayList3.clear();
                    if (h1Var2.r) {
                        arrayList3.add(new kg.e1(0, 1439));
                    }
                    org.telegram.ui.Cells.s8 s8Var = (org.telegram.ui.Cells.s8) view2;
                    boolean z11 = h1Var2.r;
                    l41Var4.e = z11;
                    s8Var.setChecked(z11);
                    boolean z12 = h1Var2.r;
                    s8Var.b(org.telegram.ui.ActionBar.n6.x0(null, z12 ? org.telegram.ui.ActionBar.n6.f6 : org.telegram.ui.ActionBar.n6.e6, false), z12);
                    h1Var2.n.g3.O(true);
                    kg.j0 j0Var = h1Var2.f;
                    if (j0Var != null) {
                        j0Var.run();
                        break;
                    }
                } else if (i26 == -2) {
                    if (arrayList3.isEmpty() || h1Var2.Z()) {
                        if (h1Var2.Z()) {
                            arrayList3.clear();
                        }
                        int j3 = Utilities.j(480, i25 - 1, i24);
                        arrayList3.add(new kg.e1(j3, Utilities.j(1200, i25, j3 + 1)));
                    } else {
                        int i27 = ((kg.e1) i5.c.h(1, arrayList3)).b;
                        int j10 = Utilities.j(i27 + 30, i25 - 1, i24);
                        arrayList3.add(new kg.e1(j10, Utilities.j((i27 + 1560) / 2, i25, j10 + 1)));
                    }
                    kg.j0 j0Var2 = h1Var2.f;
                    if (j0Var2 != null) {
                        j0Var2.run();
                    }
                    h1Var2.n.g3.O(true);
                    break;
                } else if (l41Var4.a == 3 && (i7 = i26 / 3) >= 0 && i7 < arrayList3.size()) {
                    int i28 = i7 - 1;
                    kg.e1 e1Var = i28 >= 0 ? (kg.e1) arrayList3.get(i28) : null;
                    final kg.e1 e1Var2 = (kg.e1) arrayList3.get(i7);
                    int i29 = i7 + 1;
                    kg.e1 e1Var3 = i29 < arrayList3.size() ? (kg.e1) arrayList3.get(i29) : null;
                    int i30 = l41Var4.d % 3;
                    if (i30 == 0) {
                        Activity parentActivity = h1Var2.getParentActivity();
                        String M0 = gd.M0(2131752739, null);
                        int i31 = e1Var2.a;
                        if (e1Var != null) {
                            i24 = e1Var.b + 1;
                        }
                        org.telegram.ui.Components.b5.U(parentActivity, M0, i31, i24, e1Var2.b - 1, new x10() { // from class: kg.g1
                            @Override // org.telegram.messenger.x10
                            public final void a(Object obj4) {
                                Integer num = (Integer) obj4;
                                switch (i13) {
                                    case 0:
                                        h1 h1Var3 = h1Var2;
                                        boolean a02 = h1Var3.a0();
                                        n8 n8Var = (n8) view2;
                                        int intValue = num.intValue();
                                        e1Var2.a = intValue;
                                        n8Var.w(e1.a(intValue), true);
                                        if (a02 != h1Var3.a0()) {
                                            h1Var3.n.g3.O(true);
                                        }
                                        j0 j0Var3 = h1Var3.f;
                                        if (j0Var3 != null) {
                                            j0Var3.run();
                                            break;
                                        }
                                        break;
                                    default:
                                        h1 h1Var4 = h1Var2;
                                        boolean a03 = h1Var4.a0();
                                        n8 n8Var2 = (n8) view2;
                                        int intValue2 = num.intValue();
                                        e1Var2.b = intValue2;
                                        n8Var2.w(e1.a(intValue2), true);
                                        if (a03 != h1Var4.a0()) {
                                            h1Var4.n.g3.O(true);
                                        }
                                        j0 j0Var4 = h1Var4.f;
                                        if (j0Var4 != null) {
                                            j0Var4.run();
                                            break;
                                        }
                                        break;
                                }
                            }
                        });
                        break;
                    } else if (i30 == 1) {
                        Activity parentActivity2 = h1Var2.getParentActivity();
                        String M02 = gd.M0(2131752745, null);
                        int i32 = e1Var2.b;
                        int i33 = e1Var2.a + 1;
                        if (e1Var3 != null) {
                            i25 = e1Var3.a - 1;
                        }
                        org.telegram.ui.Components.b5.U(parentActivity2, M02, i32, i33, i25, new x10() { // from class: kg.g1
                            @Override // org.telegram.messenger.x10
                            public final void a(Object obj4) {
                                Integer num = (Integer) obj4;
                                switch (i12) {
                                    case 0:
                                        h1 h1Var3 = h1Var2;
                                        boolean a02 = h1Var3.a0();
                                        n8 n8Var = (n8) view2;
                                        int intValue = num.intValue();
                                        e1Var2.a = intValue;
                                        n8Var.w(e1.a(intValue), true);
                                        if (a02 != h1Var3.a0()) {
                                            h1Var3.n.g3.O(true);
                                        }
                                        j0 j0Var3 = h1Var3.f;
                                        if (j0Var3 != null) {
                                            j0Var3.run();
                                            break;
                                        }
                                        break;
                                    default:
                                        h1 h1Var4 = h1Var2;
                                        boolean a03 = h1Var4.a0();
                                        n8 n8Var2 = (n8) view2;
                                        int intValue2 = num.intValue();
                                        e1Var2.b = intValue2;
                                        n8Var2.w(e1.a(intValue2), true);
                                        if (a03 != h1Var4.a0()) {
                                            h1Var4.n.g3.O(true);
                                        }
                                        j0 j0Var4 = h1Var4.f;
                                        if (j0Var4 != null) {
                                            j0Var4.run();
                                            break;
                                        }
                                        break;
                                }
                            }
                        });
                        break;
                    } else if (i30 == 2) {
                        arrayList3.remove(i7);
                        if (arrayList3.isEmpty()) {
                            arrayList3.add(new kg.e1(0, 1439));
                        }
                        h1Var2.n.g3.O(true);
                        kg.j0 j0Var3 = h1Var2.f;
                        if (j0Var3 != null) {
                            j0Var3.run();
                            break;
                        }
                    }
                }
                break;
            default:
                kg.y1.Z((kg.y1) this.b, (l41) obj, (View) obj2);
                break;
        }
    }

    @Override // h9.h1
    public Object m(Object obj, Object obj2) {
        return h9.o.y((List) ((Collection) obj2), new q4.q(((h9.m1) this.b).f, obj, false, 24));
    }

    @Override // org.telegram.ui.Components.ot0
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
        hi.q9 q9Var = (hi.q9) this.b;
        hi.ta taVar = q9Var.a;
        hi.e6 e6Var = taVar.P0;
        int i7 = taVar.c;
        if (e6Var != null) {
            e6Var.g(true);
        }
        if (taVar.p0()) {
            taVar.s.d();
        }
        if (taVar.H1 == null || taVar.C0 == null) {
            return;
        }
        taVar.R1 = false;
        taVar.S1 = false;
        hi.a6 a6Var = taVar.D0;
        if (a6Var != null) {
            a6Var.c(false);
        }
        if (j3 <= 800) {
            taVar.g(false, true);
            taVar.c0(false);
            taVar.K0.b(false, true);
            hi.e6 e6Var2 = taVar.P0;
            if (e6Var2 != null) {
                e6Var2.g(true);
            }
            try {
                taVar.H1.delete();
                taVar.H1 = null;
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
        taVar.h0(false, true);
        hi.d7 o4 = hi.d7.o(taVar.H1, str, j3);
        o4.J0 = taVar.w0;
        o4.K0 = taVar.x0;
        o4.B();
        taVar.g(false, true);
        taVar.c0(false);
        taVar.K0.b(false, true);
        hi.e6 e6Var3 = taVar.P0;
        if (e6Var3 != null) {
            e6Var3.g(true);
        }
        if (!taVar.B0.j()) {
            taVar.L1 = o4;
            hi.r8.a(i7, o4);
            taVar.M1 = false;
            int videoWidth = taVar.C0.getVideoWidth();
            int videoHeight = taVar.C0.getVideoHeight();
            if (videoWidth > 0 && videoHeight > 0) {
                hi.d7 d7Var = taVar.L1;
                d7Var.k0 = videoWidth;
                d7Var.l0 = videoHeight;
                d7Var.A();
            }
            taVar.K(new hi.o9(q9Var, 3), 0L);
            return;
        }
        taVar.H1 = null;
        o4.P = 1.0f;
        if (taVar.B0.l(o4)) {
            hi.d7 a10 = hi.d7.a(taVar.B0.getLayout(), taVar.B0.getContent());
            taVar.L1 = a10;
            hi.r8.a(i7, a10);
            taVar.M1 = false;
            int videoWidth2 = taVar.C0.getVideoWidth();
            int videoHeight2 = taVar.C0.getVideoHeight();
            if (videoWidth2 > 0 && videoHeight2 > 0) {
                hi.d7 d7Var2 = taVar.L1;
                d7Var2.k0 = videoWidth2;
                d7Var2.l0 = videoHeight2;
                d7Var2.A();
            }
        }
        taVar.l0(true);
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        switch (this.a) {
            case 2:
                ((e1.b) this.b).invoke(obj);
                break;
            case 3:
                ((e1.b) this.b).invoke(obj);
                break;
            default:
                ((ae.d) this.b).invoke(obj);
                break;
        }
    }

    @Override // org.telegram.ui.Components.ot0
    public /* synthetic */ void r(RecyclerView recyclerView) {
        org.telegram.ui.Cells.c0.b(recyclerView);
    }

    @Override // sg.j1
    public void u() {
        hi.v9 v9Var = (hi.v9) this.b;
        TextView textView = v9Var.Y0;
        boolean a10 = v9Var.n0.a();
        ImageView imageView = v9Var.X0;
        imageView.animate().cancel();
        imageView.animate().alpha(a10 ? 1.0f : 0.6f).translationY(0.0f).setDuration(150L).start();
        imageView.setClickable(a10);
        textView.animate().cancel();
        textView.animate().alpha(a10 ? 1.0f : 0.6f).translationY(0.0f).setDuration(150L).start();
        textView.setClickable(a10);
    }

    @Override // org.telegram.ui.Components.pj0
    public /* synthetic */ void s0(View view, float f10, float f11) {
    }
}
