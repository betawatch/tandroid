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
import org.telegram.messenger.at;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.ff;
import org.telegram.messenger.gj;
import org.telegram.messenger.hd;
import org.telegram.messenger.m10;
import org.telegram.messenger.np;
import org.telegram.messenger.ns;
import org.telegram.messenger.q10;
import org.telegram.messenger.si;
import org.telegram.messenger.t10;
import org.telegram.messenger.vr;
import org.telegram.messenger.x10;
import org.telegram.messenger.z10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Cells.l8;
import org.telegram.ui.Components.b41;
import org.telegram.ui.Components.fq;
import org.telegram.ui.Components.gt0;
import org.telegram.ui.Components.hj0;
import org.telegram.ui.Components.ij0;
import org.telegram.ui.Components.m60;
import org.telegram.ui.Components.vi0;
import org.telegram.ui.Components.vp0;
import org.telegram.ui.NotificationsCustomSettingsActivity;
import org.telegram.ui.jl0;
import org.telegram.ui.qv;
import org.telegram.ui.yw;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class z6 implements jl0, x10, OnSuccessListener, ij0, t10, hj0, fi.a7, fi.c9, xh.j, r0.m, h9.g1, org.telegram.ui.ActionBar.q1, vi0, sg.j1, CameraController.VideoTakeCallback, gt0, f3.g {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ z6(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // sg.j1
    public void C() {
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

    @Override // r0.m
    public r0.k1 M0(View view, r0.k1 k1Var) {
        fi.i9 i9Var = (fi.i9) this.b;
        i0.c I0 = org.telegram.messenger.g0.I0(k1Var, false);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) i9Var.w.getLayoutParams();
        marginLayoutParams.topMargin = i9Var.c ? 0 : k1Var.d();
        marginLayoutParams.bottomMargin = i9Var.c ? k1Var.a.f(2).d : k1Var.a();
        marginLayoutParams.leftMargin = I0.a;
        marginLayoutParams.rightMargin = I0.c;
        fi.w8 w8Var = i9Var.s;
        if (w8Var != null) {
            w8Var.requestLayout();
        }
        fi.x8 x8Var = i9Var.w;
        if (x8Var != null) {
            x8Var.requestLayout();
        }
        return r0.k1.b;
    }

    @Override // h9.g1
    public Object a(Object obj, Object obj2) {
        return h9.o.y((List) ((Collection) obj2), new q4.q(((h9.l1) this.b).f, obj, false, 24));
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
    @Override // org.telegram.ui.Components.ij0
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
        fq fqVar;
        boolean z10;
        boolean z11;
        m60 m60Var;
        final int i17;
        int i18;
        int i19 = this.a;
        org.telegram.messenger.p2 p2Var = org.telegram.messenger.p2.E;
        final int i20 = 2;
        Object obj = this.b;
        final int i21 = 0;
        final int i22 = 1;
        switch (i19) {
            case 4:
                final qv qvVar = (qv) obj;
                if (qvVar.O == 0.0f && qvVar.o0 == 0.0f) {
                    final long j10 = ((fi.p) view).F;
                    yw ywVar = qvVar.P0;
                    i10 = ((org.telegram.ui.ActionBar.e2) ywVar).currentAccount;
                    si.b0(i10).M0(true);
                    m60 H = m60.H(ywVar, view);
                    H.z.set(0, org.telegram.messenger.g0.L(8.0f), 0, 0);
                    H.W(org.telegram.ui.ActionBar.j6.e0(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f), ywVar.getThemedColor(org.telegram.ui.ActionBar.j6.d6)));
                    H.a0(0.0f, org.telegram.messenger.g0.L(8.0f));
                    ywVar.M0 = H;
                    if (!q10.A(j10)) {
                        try {
                            view.performHapticFeedback(0);
                        } catch (Exception unused) {
                        }
                        i11 = ((org.telegram.ui.ActionBar.e2) ywVar).currentAccount;
                        if (j10 != m10.i(i11).e()) {
                            final TLRPC.User a22 = ywVar.getMessagesController().a2(Long.valueOf(j10));
                            TLRPC.Chat M0 = ywVar.getMessagesController().M0(Long.valueOf(-j10));
                            final String v = at.v(j10, 0L, false);
                            i12 = ((org.telegram.ui.ActionBar.e2) ywVar).currentAccount;
                            boolean h02 = NotificationsCustomSettingsActivity.h0(i12, j10);
                            i13 = ((org.telegram.ui.ActionBar.e2) ywVar).currentAccount;
                            boolean D3 = np.s1(i13).D3();
                            i14 = ((org.telegram.ui.ActionBar.e2) ywVar).currentAccount;
                            boolean q10 = m10.i(i14).q();
                            i15 = ((org.telegram.ui.ActionBar.e2) ywVar).currentAccount;
                            boolean L = np.s1(i15).P1().L(j10);
                            i16 = ((org.telegram.ui.ActionBar.e2) ywVar).currentAccount;
                            boolean H2 = np.s1(i16).P1().H(j10);
                            if (D3 || j10 <= 0 || q10) {
                                j3 = 0;
                            } else {
                                j3 = 0;
                                Drawable drawable = qvVar.getContext().getDrawable(R.drawable.msg_gallery_locked2);
                                if (drawable != null) {
                                    Drawable drawable2 = qvVar.getContext().getDrawable(R.drawable.msg_stealth_locked);
                                    if (drawable2 != null) {
                                        org.telegram.ui.ActionBar.q6.x(qvVar, drawable2, org.telegram.ui.ActionBar.j6.F8, ywVar.getResourceProvider(), PorterDuff.Mode.MULTIPLY);
                                    }
                                    drawable.setColorFilter(new PorterDuffColorFilter(i0.a.f(0.5f, -1, -16777216), PorterDuff.Mode.MULTIPLY));
                                    fqVar = new fq(drawable2, drawable);
                                    if (j10 < j3 && ywVar.j4().j(j10)) {
                                        final int i23 = 4;
                                        ywVar.M0.b(R.drawable.msg_stories_add, null, hd.M0(2131754384, null), org.telegram.ui.ActionBar.j6.F8, org.telegram.ui.ActionBar.j6.E8, new Runnable() { // from class: org.telegram.ui.mv
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                int i24;
                                                switch (i23) {
                                                    case 0:
                                                        qvVar.P0.presentFragment(an.ua(j10));
                                                        break;
                                                    case 1:
                                                        org.telegram.messenger.g0.i3(new tu(qvVar.P0, j10, !r2.q4(), 0), 200L);
                                                        break;
                                                    case 2:
                                                        org.telegram.messenger.g0.i3(new tu(qvVar.P0, j10, !r2.q4(), 0), 200L);
                                                        break;
                                                    case 3:
                                                        yw ywVar2 = qvVar.P0;
                                                        i24 = ((org.telegram.ui.ActionBar.e2) ywVar2).currentAccount;
                                                        org.telegram.messenger.si b02 = org.telegram.messenger.si.b0(i24);
                                                        long j11 = j10;
                                                        b02.N1(j11);
                                                        ywVar2.getMessagesController().P1().l0(j11, true, false);
                                                        break;
                                                    case 4:
                                                        qvVar.P0.F0.j(j10);
                                                        break;
                                                    case 5:
                                                        qvVar.P0.presentFragment(an.ua(j10));
                                                        break;
                                                    default:
                                                        qvVar.P0.presentFragment(ProfileActivity.C4(j10));
                                                        break;
                                                }
                                            }
                                        });
                                    }
                                    if (a22 != null && !a22.contact) {
                                        i18 = ((org.telegram.ui.ActionBar.e2) ywVar).currentAccount;
                                        if (si.b0(i18).G(j10)) {
                                            z10 = true;
                                            m60 m60Var2 = ywVar.M0;
                                            final int i24 = 5;
                                            m60Var2.l(R.drawable.msg_discussion, hd.M0(2131745601, null), new Runnable() { // from class: org.telegram.ui.mv
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    int i242;
                                                    switch (i24) {
                                                        case 0:
                                                            qvVar.P0.presentFragment(an.ua(j10));
                                                            break;
                                                        case 1:
                                                            org.telegram.messenger.g0.i3(new tu(qvVar.P0, j10, !r2.q4(), 0), 200L);
                                                            break;
                                                        case 2:
                                                            org.telegram.messenger.g0.i3(new tu(qvVar.P0, j10, !r2.q4(), 0), 200L);
                                                            break;
                                                        case 3:
                                                            yw ywVar2 = qvVar.P0;
                                                            i242 = ((org.telegram.ui.ActionBar.e2) ywVar2).currentAccount;
                                                            org.telegram.messenger.si b02 = org.telegram.messenger.si.b0(i242);
                                                            long j11 = j10;
                                                            b02.N1(j11);
                                                            ywVar2.getMessagesController().P1().l0(j11, true, false);
                                                            break;
                                                        case 4:
                                                            qvVar.P0.F0.j(j10);
                                                            break;
                                                        case 5:
                                                            qvVar.P0.presentFragment(an.ua(j10));
                                                            break;
                                                        default:
                                                            qvVar.P0.presentFragment(ProfileActivity.C4(j10));
                                                            break;
                                                    }
                                                }
                                            }, j10 > j3);
                                            final int i25 = 6;
                                            m60Var2.l(R.drawable.msg_openprofile, hd.M0(2131747786, null), new Runnable() { // from class: org.telegram.ui.mv
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    int i242;
                                                    switch (i25) {
                                                        case 0:
                                                            qvVar.P0.presentFragment(an.ua(j10));
                                                            break;
                                                        case 1:
                                                            org.telegram.messenger.g0.i3(new tu(qvVar.P0, j10, !r2.q4(), 0), 200L);
                                                            break;
                                                        case 2:
                                                            org.telegram.messenger.g0.i3(new tu(qvVar.P0, j10, !r2.q4(), 0), 200L);
                                                            break;
                                                        case 3:
                                                            yw ywVar2 = qvVar.P0;
                                                            i242 = ((org.telegram.ui.ActionBar.e2) ywVar2).currentAccount;
                                                            org.telegram.messenger.si b02 = org.telegram.messenger.si.b0(i242);
                                                            long j11 = j10;
                                                            b02.N1(j11);
                                                            ywVar2.getMessagesController().P1().l0(j11, true, false);
                                                            break;
                                                        case 4:
                                                            qvVar.P0.F0.j(j10);
                                                            break;
                                                        case 5:
                                                            qvVar.P0.presentFragment(an.ua(j10));
                                                            break;
                                                        default:
                                                            qvVar.P0.presentFragment(ProfileActivity.C4(j10));
                                                            break;
                                                    }
                                                }
                                            }, j10 > j3);
                                            final int i26 = 0;
                                            m60Var2.l(R.drawable.msg_channel, hd.M0(org.telegram.messenger.t3.V(M0) ? 2131747811 : 2131747799, null), new Runnable() { // from class: org.telegram.ui.mv
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    int i242;
                                                    switch (i26) {
                                                        case 0:
                                                            qvVar.P0.presentFragment(an.ua(j10));
                                                            break;
                                                        case 1:
                                                            org.telegram.messenger.g0.i3(new tu(qvVar.P0, j10, !r2.q4(), 0), 200L);
                                                            break;
                                                        case 2:
                                                            org.telegram.messenger.g0.i3(new tu(qvVar.P0, j10, !r2.q4(), 0), 200L);
                                                            break;
                                                        case 3:
                                                            yw ywVar2 = qvVar.P0;
                                                            i242 = ((org.telegram.ui.ActionBar.e2) ywVar2).currentAccount;
                                                            org.telegram.messenger.si b02 = org.telegram.messenger.si.b0(i242);
                                                            long j11 = j10;
                                                            b02.N1(j11);
                                                            ywVar2.getMessagesController().P1().l0(j11, true, false);
                                                            break;
                                                        case 4:
                                                            qvVar.P0.F0.j(j10);
                                                            break;
                                                        case 5:
                                                            qvVar.P0.presentFragment(an.ua(j10));
                                                            break;
                                                        default:
                                                            qvVar.P0.presentFragment(ProfileActivity.C4(j10));
                                                            break;
                                                    }
                                                }
                                            }, j10 < j3);
                                            final int i27 = 0;
                                            m60Var2.l(R.drawable.msg_mute, hd.M0(2131747863, null), new Runnable() { // from class: org.telegram.ui.nv
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    int i28;
                                                    String trim;
                                                    int i29;
                                                    int i30 = i27;
                                                    TLRPC.User user = a22;
                                                    String str = v;
                                                    qv qvVar2 = qvVar;
                                                    switch (i30) {
                                                        case 0:
                                                            yw ywVar2 = qvVar2.P0;
                                                            i28 = ((org.telegram.ui.ActionBar.e2) ywVar2).currentAccount;
                                                            org.telegram.messenger.np.s1(i28).e7.edit().putBoolean("stories_" + str, false).apply();
                                                            ywVar2.getNotificationsController().c0(j10, 0L, true);
                                                            trim = user != null ? user.first_name.trim() : "";
                                                            int indexOf = trim.indexOf(" ");
                                                            if (indexOf > 0) {
                                                                trim = trim.substring(0, indexOf);
                                                            }
                                                            org.telegram.ui.Components.cc.a0(ywVar2).V(Arrays.asList(user), org.telegram.messenger.g0.X2(org.telegram.messenger.hd.a0("NotificationsStoryMutedHint", null, 2131747862, trim)), null, null).j();
                                                            break;
                                                        default:
                                                            yw ywVar3 = qvVar2.P0;
                                                            i29 = ((org.telegram.ui.ActionBar.e2) ywVar3).currentAccount;
                                                            org.telegram.messenger.np.s1(i29).e7.edit().putBoolean("stories_" + str, true).apply();
                                                            ywVar3.getNotificationsController().c0(j10, 0L, true);
                                                            trim = user != null ? user.first_name.trim() : "";
                                                            int indexOf2 = trim.indexOf(" ");
                                                            if (indexOf2 > 0) {
                                                                trim = trim.substring(0, indexOf2);
                                                            }
                                                            org.telegram.ui.Components.cc.a0(ywVar3).V(Arrays.asList(user), org.telegram.messenger.g0.X2(org.telegram.messenger.hd.a0("NotificationsStoryUnmutedHint", null, 2131747859, trim)), null, null).j();
                                                            break;
                                                    }
                                                }
                                            }, !h02 && j10 > j3);
                                            m60Var2.E();
                                            final int i28 = 1;
                                            m60Var2.l(R.drawable.msg_unmute, hd.M0(2131747860, null), new Runnable() { // from class: org.telegram.ui.nv
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    int i282;
                                                    String trim;
                                                    int i29;
                                                    int i30 = i28;
                                                    TLRPC.User user = a22;
                                                    String str = v;
                                                    qv qvVar2 = qvVar;
                                                    switch (i30) {
                                                        case 0:
                                                            yw ywVar2 = qvVar2.P0;
                                                            i282 = ((org.telegram.ui.ActionBar.e2) ywVar2).currentAccount;
                                                            org.telegram.messenger.np.s1(i282).e7.edit().putBoolean("stories_" + str, false).apply();
                                                            ywVar2.getNotificationsController().c0(j10, 0L, true);
                                                            trim = user != null ? user.first_name.trim() : "";
                                                            int indexOf = trim.indexOf(" ");
                                                            if (indexOf > 0) {
                                                                trim = trim.substring(0, indexOf);
                                                            }
                                                            org.telegram.ui.Components.cc.a0(ywVar2).V(Arrays.asList(user), org.telegram.messenger.g0.X2(org.telegram.messenger.hd.a0("NotificationsStoryMutedHint", null, 2131747862, trim)), null, null).j();
                                                            break;
                                                        default:
                                                            yw ywVar3 = qvVar2.P0;
                                                            i29 = ((org.telegram.ui.ActionBar.e2) ywVar3).currentAccount;
                                                            org.telegram.messenger.np.s1(i29).e7.edit().putBoolean("stories_" + str, true).apply();
                                                            ywVar3.getNotificationsController().c0(j10, 0L, true);
                                                            trim = user != null ? user.first_name.trim() : "";
                                                            int indexOf2 = trim.indexOf(" ");
                                                            if (indexOf2 > 0) {
                                                                trim = trim.substring(0, indexOf2);
                                                            }
                                                            org.telegram.ui.Components.cc.a0(ywVar3).V(Arrays.asList(user), org.telegram.messenger.g0.X2(org.telegram.messenger.hd.a0("NotificationsStoryUnmutedHint", null, 2131747859, trim)), null, null).j();
                                                            break;
                                                    }
                                                }
                                            }, h02 && j10 > j3);
                                            m60Var2.E();
                                            final int i29 = 0;
                                            m60Var2.l(R.drawable.msg_stories_stealth2, hd.M0(2131743562, null), new Runnable() { // from class: org.telegram.ui.ov
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    org.telegram.ui.ActionBar.e6 e6Var;
                                                    int i30;
                                                    org.telegram.ui.ActionBar.e6 e6Var2;
                                                    switch (i29) {
                                                        case 0:
                                                            qv qvVar2 = qvVar;
                                                            yw ywVar2 = qvVar2.P0;
                                                            TL_stories.TL_storiesStealthMode tL_storiesStealthMode = org.telegram.messenger.np.s1(org.telegram.messenger.m10.t0).P1().B;
                                                            View view2 = view;
                                                            if (tL_storiesStealthMode != null) {
                                                                i30 = ((org.telegram.ui.ActionBar.e2) ywVar2).currentAccount;
                                                                if (ConnectionsManager.getInstance(i30).getCurrentTime() < tL_storiesStealthMode.active_until_date) {
                                                                    if (view2 instanceof fi.p) {
                                                                        ywVar2.F0.i((fi.p) view2, false);
                                                                        break;
                                                                    }
                                                                }
                                                            }
                                                            Context context = qvVar2.getContext();
                                                            e6Var = ((org.telegram.ui.ActionBar.e2) ywVar2).resourceProvider;
                                                            fi.o5 o5Var = new fi.o5(context, 0.0f, 1, e6Var);
                                                            o5Var.p1 = new pv(qvVar2, view2, 1);
                                                            ywVar2.showDialog(o5Var);
                                                            break;
                                                        default:
                                                            qv qvVar3 = qvVar;
                                                            Context context2 = qvVar3.getContext();
                                                            yw ywVar3 = qvVar3.P0;
                                                            e6Var2 = ((org.telegram.ui.ActionBar.e2) ywVar3).resourceProvider;
                                                            fi.o5 o5Var2 = new fi.o5(context2, 0.0f, 1, e6Var2);
                                                            o5Var2.p1 = new pv(qvVar3, view, 0);
                                                            ywVar3.showDialog(o5Var2);
                                                            break;
                                                    }
                                                }
                                            }, D3 && j10 > j3 && q10 && L && !H2);
                                            m60Var2.E();
                                            z11 = D3 && j10 > j3 && !q10 && L && !H2;
                                            String M02 = hd.M0(2131743562, null);
                                            final int i30 = 1;
                                            Runnable runnable = new Runnable() { // from class: org.telegram.ui.ov
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    org.telegram.ui.ActionBar.e6 e6Var;
                                                    int i302;
                                                    org.telegram.ui.ActionBar.e6 e6Var2;
                                                    switch (i30) {
                                                        case 0:
                                                            qv qvVar2 = qvVar;
                                                            yw ywVar2 = qvVar2.P0;
                                                            TL_stories.TL_storiesStealthMode tL_storiesStealthMode = org.telegram.messenger.np.s1(org.telegram.messenger.m10.t0).P1().B;
                                                            View view2 = view;
                                                            if (tL_storiesStealthMode != null) {
                                                                i302 = ((org.telegram.ui.ActionBar.e2) ywVar2).currentAccount;
                                                                if (ConnectionsManager.getInstance(i302).getCurrentTime() < tL_storiesStealthMode.active_until_date) {
                                                                    if (view2 instanceof fi.p) {
                                                                        ywVar2.F0.i((fi.p) view2, false);
                                                                        break;
                                                                    }
                                                                }
                                                            }
                                                            Context context = qvVar2.getContext();
                                                            e6Var = ((org.telegram.ui.ActionBar.e2) ywVar2).resourceProvider;
                                                            fi.o5 o5Var = new fi.o5(context, 0.0f, 1, e6Var);
                                                            o5Var.p1 = new pv(qvVar2, view2, 1);
                                                            ywVar2.showDialog(o5Var);
                                                            break;
                                                        default:
                                                            qv qvVar3 = qvVar;
                                                            Context context2 = qvVar3.getContext();
                                                            yw ywVar3 = qvVar3.P0;
                                                            e6Var2 = ((org.telegram.ui.ActionBar.e2) ywVar3).resourceProvider;
                                                            fi.o5 o5Var2 = new fi.o5(context2, 0.0f, 1, e6Var2);
                                                            o5Var2.p1 = new pv(qvVar3, view, 0);
                                                            ywVar3.showDialog(o5Var2);
                                                            break;
                                                    }
                                                }
                                            };
                                            if (z11) {
                                                m60Var2.b(R.drawable.msg_stories_stealth2, fqVar, M02, org.telegram.ui.ActionBar.j6.F8, org.telegram.ui.ActionBar.j6.E8, runnable);
                                                m60Var = m60Var2;
                                            } else {
                                                m60Var = m60Var2;
                                            }
                                            m60Var.E();
                                            final int i31 = 1;
                                            m60Var.l(R.drawable.msg_archive, hd.M0(2131754153, null), new Runnable() { // from class: org.telegram.ui.mv
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    int i242;
                                                    switch (i31) {
                                                        case 0:
                                                            qvVar.P0.presentFragment(an.ua(j10));
                                                            break;
                                                        case 1:
                                                            org.telegram.messenger.g0.i3(new tu(qvVar.P0, j10, !r2.q4(), 0), 200L);
                                                            break;
                                                        case 2:
                                                            org.telegram.messenger.g0.i3(new tu(qvVar.P0, j10, !r2.q4(), 0), 200L);
                                                            break;
                                                        case 3:
                                                            yw ywVar2 = qvVar.P0;
                                                            i242 = ((org.telegram.ui.ActionBar.e2) ywVar2).currentAccount;
                                                            org.telegram.messenger.si b02 = org.telegram.messenger.si.b0(i242);
                                                            long j11 = j10;
                                                            b02.N1(j11);
                                                            ywVar2.getMessagesController().P1().l0(j11, true, false);
                                                            break;
                                                        case 4:
                                                            qvVar.P0.F0.j(j10);
                                                            break;
                                                        case 5:
                                                            qvVar.P0.presentFragment(an.ua(j10));
                                                            break;
                                                        default:
                                                            qvVar.P0.presentFragment(ProfileActivity.C4(j10));
                                                            break;
                                                    }
                                                }
                                            }, z10 && !ywVar.q4());
                                            m60Var.E();
                                            final int i32 = 2;
                                            m60Var.l(R.drawable.msg_unarchive, hd.M0(2131743914, null), new Runnable() { // from class: org.telegram.ui.mv
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    int i242;
                                                    switch (i32) {
                                                        case 0:
                                                            qvVar.P0.presentFragment(an.ua(j10));
                                                            break;
                                                        case 1:
                                                            org.telegram.messenger.g0.i3(new tu(qvVar.P0, j10, !r2.q4(), 0), 200L);
                                                            break;
                                                        case 2:
                                                            org.telegram.messenger.g0.i3(new tu(qvVar.P0, j10, !r2.q4(), 0), 200L);
                                                            break;
                                                        case 3:
                                                            yw ywVar2 = qvVar.P0;
                                                            i242 = ((org.telegram.ui.ActionBar.e2) ywVar2).currentAccount;
                                                            org.telegram.messenger.si b02 = org.telegram.messenger.si.b0(i242);
                                                            long j11 = j10;
                                                            b02.N1(j11);
                                                            ywVar2.getMessagesController().P1().l0(j11, true, false);
                                                            break;
                                                        case 4:
                                                            qvVar.P0.F0.j(j10);
                                                            break;
                                                        case 5:
                                                            qvVar.P0.presentFragment(an.ua(j10));
                                                            break;
                                                        default:
                                                            qvVar.P0.presentFragment(ProfileActivity.C4(j10));
                                                            break;
                                                    }
                                                }
                                            }, z10 && ywVar.q4());
                                            m60Var.E();
                                            i17 = 3;
                                            m60Var.l(R.drawable.msg_delete, hd.M0(2131744748, null), new Runnable() { // from class: org.telegram.ui.mv
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    int i242;
                                                    switch (i17) {
                                                        case 0:
                                                            qvVar.P0.presentFragment(an.ua(j10));
                                                            break;
                                                        case 1:
                                                            org.telegram.messenger.g0.i3(new tu(qvVar.P0, j10, !r2.q4(), 0), 200L);
                                                            break;
                                                        case 2:
                                                            org.telegram.messenger.g0.i3(new tu(qvVar.P0, j10, !r2.q4(), 0), 200L);
                                                            break;
                                                        case 3:
                                                            yw ywVar2 = qvVar.P0;
                                                            i242 = ((org.telegram.ui.ActionBar.e2) ywVar2).currentAccount;
                                                            org.telegram.messenger.si b02 = org.telegram.messenger.si.b0(i242);
                                                            long j11 = j10;
                                                            b02.N1(j11);
                                                            ywVar2.getMessagesController().P1().l0(j11, true, false);
                                                            break;
                                                        case 4:
                                                            qvVar.P0.F0.j(j10);
                                                            break;
                                                        case 5:
                                                            qvVar.P0.presentFragment(an.ua(j10));
                                                            break;
                                                        default:
                                                            qvVar.P0.presentFragment(ProfileActivity.C4(j10));
                                                            break;
                                                    }
                                                }
                                            }, z10);
                                        }
                                    }
                                    z10 = false;
                                    m60 m60Var22 = ywVar.M0;
                                    final int i242 = 5;
                                    m60Var22.l(R.drawable.msg_discussion, hd.M0(2131745601, null), new Runnable() { // from class: org.telegram.ui.mv
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            int i2422;
                                            switch (i242) {
                                                case 0:
                                                    qvVar.P0.presentFragment(an.ua(j10));
                                                    break;
                                                case 1:
                                                    org.telegram.messenger.g0.i3(new tu(qvVar.P0, j10, !r2.q4(), 0), 200L);
                                                    break;
                                                case 2:
                                                    org.telegram.messenger.g0.i3(new tu(qvVar.P0, j10, !r2.q4(), 0), 200L);
                                                    break;
                                                case 3:
                                                    yw ywVar2 = qvVar.P0;
                                                    i2422 = ((org.telegram.ui.ActionBar.e2) ywVar2).currentAccount;
                                                    org.telegram.messenger.si b02 = org.telegram.messenger.si.b0(i2422);
                                                    long j11 = j10;
                                                    b02.N1(j11);
                                                    ywVar2.getMessagesController().P1().l0(j11, true, false);
                                                    break;
                                                case 4:
                                                    qvVar.P0.F0.j(j10);
                                                    break;
                                                case 5:
                                                    qvVar.P0.presentFragment(an.ua(j10));
                                                    break;
                                                default:
                                                    qvVar.P0.presentFragment(ProfileActivity.C4(j10));
                                                    break;
                                            }
                                        }
                                    }, j10 > j3);
                                    final int i252 = 6;
                                    m60Var22.l(R.drawable.msg_openprofile, hd.M0(2131747786, null), new Runnable() { // from class: org.telegram.ui.mv
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            int i2422;
                                            switch (i252) {
                                                case 0:
                                                    qvVar.P0.presentFragment(an.ua(j10));
                                                    break;
                                                case 1:
                                                    org.telegram.messenger.g0.i3(new tu(qvVar.P0, j10, !r2.q4(), 0), 200L);
                                                    break;
                                                case 2:
                                                    org.telegram.messenger.g0.i3(new tu(qvVar.P0, j10, !r2.q4(), 0), 200L);
                                                    break;
                                                case 3:
                                                    yw ywVar2 = qvVar.P0;
                                                    i2422 = ((org.telegram.ui.ActionBar.e2) ywVar2).currentAccount;
                                                    org.telegram.messenger.si b02 = org.telegram.messenger.si.b0(i2422);
                                                    long j11 = j10;
                                                    b02.N1(j11);
                                                    ywVar2.getMessagesController().P1().l0(j11, true, false);
                                                    break;
                                                case 4:
                                                    qvVar.P0.F0.j(j10);
                                                    break;
                                                case 5:
                                                    qvVar.P0.presentFragment(an.ua(j10));
                                                    break;
                                                default:
                                                    qvVar.P0.presentFragment(ProfileActivity.C4(j10));
                                                    break;
                                            }
                                        }
                                    }, j10 > j3);
                                    final int i262 = 0;
                                    m60Var22.l(R.drawable.msg_channel, hd.M0(org.telegram.messenger.t3.V(M0) ? 2131747811 : 2131747799, null), new Runnable() { // from class: org.telegram.ui.mv
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            int i2422;
                                            switch (i262) {
                                                case 0:
                                                    qvVar.P0.presentFragment(an.ua(j10));
                                                    break;
                                                case 1:
                                                    org.telegram.messenger.g0.i3(new tu(qvVar.P0, j10, !r2.q4(), 0), 200L);
                                                    break;
                                                case 2:
                                                    org.telegram.messenger.g0.i3(new tu(qvVar.P0, j10, !r2.q4(), 0), 200L);
                                                    break;
                                                case 3:
                                                    yw ywVar2 = qvVar.P0;
                                                    i2422 = ((org.telegram.ui.ActionBar.e2) ywVar2).currentAccount;
                                                    org.telegram.messenger.si b02 = org.telegram.messenger.si.b0(i2422);
                                                    long j11 = j10;
                                                    b02.N1(j11);
                                                    ywVar2.getMessagesController().P1().l0(j11, true, false);
                                                    break;
                                                case 4:
                                                    qvVar.P0.F0.j(j10);
                                                    break;
                                                case 5:
                                                    qvVar.P0.presentFragment(an.ua(j10));
                                                    break;
                                                default:
                                                    qvVar.P0.presentFragment(ProfileActivity.C4(j10));
                                                    break;
                                            }
                                        }
                                    }, j10 < j3);
                                    final int i272 = 0;
                                    m60Var22.l(R.drawable.msg_mute, hd.M0(2131747863, null), new Runnable() { // from class: org.telegram.ui.nv
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            int i282;
                                            String trim;
                                            int i292;
                                            int i302 = i272;
                                            TLRPC.User user = a22;
                                            String str = v;
                                            qv qvVar2 = qvVar;
                                            switch (i302) {
                                                case 0:
                                                    yw ywVar2 = qvVar2.P0;
                                                    i282 = ((org.telegram.ui.ActionBar.e2) ywVar2).currentAccount;
                                                    org.telegram.messenger.np.s1(i282).e7.edit().putBoolean("stories_" + str, false).apply();
                                                    ywVar2.getNotificationsController().c0(j10, 0L, true);
                                                    trim = user != null ? user.first_name.trim() : "";
                                                    int indexOf = trim.indexOf(" ");
                                                    if (indexOf > 0) {
                                                        trim = trim.substring(0, indexOf);
                                                    }
                                                    org.telegram.ui.Components.cc.a0(ywVar2).V(Arrays.asList(user), org.telegram.messenger.g0.X2(org.telegram.messenger.hd.a0("NotificationsStoryMutedHint", null, 2131747862, trim)), null, null).j();
                                                    break;
                                                default:
                                                    yw ywVar3 = qvVar2.P0;
                                                    i292 = ((org.telegram.ui.ActionBar.e2) ywVar3).currentAccount;
                                                    org.telegram.messenger.np.s1(i292).e7.edit().putBoolean("stories_" + str, true).apply();
                                                    ywVar3.getNotificationsController().c0(j10, 0L, true);
                                                    trim = user != null ? user.first_name.trim() : "";
                                                    int indexOf2 = trim.indexOf(" ");
                                                    if (indexOf2 > 0) {
                                                        trim = trim.substring(0, indexOf2);
                                                    }
                                                    org.telegram.ui.Components.cc.a0(ywVar3).V(Arrays.asList(user), org.telegram.messenger.g0.X2(org.telegram.messenger.hd.a0("NotificationsStoryUnmutedHint", null, 2131747859, trim)), null, null).j();
                                                    break;
                                            }
                                        }
                                    }, !h02 && j10 > j3);
                                    m60Var22.E();
                                    final int i282 = 1;
                                    m60Var22.l(R.drawable.msg_unmute, hd.M0(2131747860, null), new Runnable() { // from class: org.telegram.ui.nv
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            int i2822;
                                            String trim;
                                            int i292;
                                            int i302 = i282;
                                            TLRPC.User user = a22;
                                            String str = v;
                                            qv qvVar2 = qvVar;
                                            switch (i302) {
                                                case 0:
                                                    yw ywVar2 = qvVar2.P0;
                                                    i2822 = ((org.telegram.ui.ActionBar.e2) ywVar2).currentAccount;
                                                    org.telegram.messenger.np.s1(i2822).e7.edit().putBoolean("stories_" + str, false).apply();
                                                    ywVar2.getNotificationsController().c0(j10, 0L, true);
                                                    trim = user != null ? user.first_name.trim() : "";
                                                    int indexOf = trim.indexOf(" ");
                                                    if (indexOf > 0) {
                                                        trim = trim.substring(0, indexOf);
                                                    }
                                                    org.telegram.ui.Components.cc.a0(ywVar2).V(Arrays.asList(user), org.telegram.messenger.g0.X2(org.telegram.messenger.hd.a0("NotificationsStoryMutedHint", null, 2131747862, trim)), null, null).j();
                                                    break;
                                                default:
                                                    yw ywVar3 = qvVar2.P0;
                                                    i292 = ((org.telegram.ui.ActionBar.e2) ywVar3).currentAccount;
                                                    org.telegram.messenger.np.s1(i292).e7.edit().putBoolean("stories_" + str, true).apply();
                                                    ywVar3.getNotificationsController().c0(j10, 0L, true);
                                                    trim = user != null ? user.first_name.trim() : "";
                                                    int indexOf2 = trim.indexOf(" ");
                                                    if (indexOf2 > 0) {
                                                        trim = trim.substring(0, indexOf2);
                                                    }
                                                    org.telegram.ui.Components.cc.a0(ywVar3).V(Arrays.asList(user), org.telegram.messenger.g0.X2(org.telegram.messenger.hd.a0("NotificationsStoryUnmutedHint", null, 2131747859, trim)), null, null).j();
                                                    break;
                                            }
                                        }
                                    }, h02 && j10 > j3);
                                    m60Var22.E();
                                    final int i292 = 0;
                                    m60Var22.l(R.drawable.msg_stories_stealth2, hd.M0(2131743562, null), new Runnable() { // from class: org.telegram.ui.ov
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            org.telegram.ui.ActionBar.e6 e6Var;
                                            int i302;
                                            org.telegram.ui.ActionBar.e6 e6Var2;
                                            switch (i292) {
                                                case 0:
                                                    qv qvVar2 = qvVar;
                                                    yw ywVar2 = qvVar2.P0;
                                                    TL_stories.TL_storiesStealthMode tL_storiesStealthMode = org.telegram.messenger.np.s1(org.telegram.messenger.m10.t0).P1().B;
                                                    View view2 = view;
                                                    if (tL_storiesStealthMode != null) {
                                                        i302 = ((org.telegram.ui.ActionBar.e2) ywVar2).currentAccount;
                                                        if (ConnectionsManager.getInstance(i302).getCurrentTime() < tL_storiesStealthMode.active_until_date) {
                                                            if (view2 instanceof fi.p) {
                                                                ywVar2.F0.i((fi.p) view2, false);
                                                                break;
                                                            }
                                                        }
                                                    }
                                                    Context context = qvVar2.getContext();
                                                    e6Var = ((org.telegram.ui.ActionBar.e2) ywVar2).resourceProvider;
                                                    fi.o5 o5Var = new fi.o5(context, 0.0f, 1, e6Var);
                                                    o5Var.p1 = new pv(qvVar2, view2, 1);
                                                    ywVar2.showDialog(o5Var);
                                                    break;
                                                default:
                                                    qv qvVar3 = qvVar;
                                                    Context context2 = qvVar3.getContext();
                                                    yw ywVar3 = qvVar3.P0;
                                                    e6Var2 = ((org.telegram.ui.ActionBar.e2) ywVar3).resourceProvider;
                                                    fi.o5 o5Var2 = new fi.o5(context2, 0.0f, 1, e6Var2);
                                                    o5Var2.p1 = new pv(qvVar3, view, 0);
                                                    ywVar3.showDialog(o5Var2);
                                                    break;
                                            }
                                        }
                                    }, D3 && j10 > j3 && q10 && L && !H2);
                                    m60Var22.E();
                                    if (D3) {
                                    }
                                    String M022 = hd.M0(2131743562, null);
                                    final int i302 = 1;
                                    Runnable runnable2 = new Runnable() { // from class: org.telegram.ui.ov
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            org.telegram.ui.ActionBar.e6 e6Var;
                                            int i3022;
                                            org.telegram.ui.ActionBar.e6 e6Var2;
                                            switch (i302) {
                                                case 0:
                                                    qv qvVar2 = qvVar;
                                                    yw ywVar2 = qvVar2.P0;
                                                    TL_stories.TL_storiesStealthMode tL_storiesStealthMode = org.telegram.messenger.np.s1(org.telegram.messenger.m10.t0).P1().B;
                                                    View view2 = view;
                                                    if (tL_storiesStealthMode != null) {
                                                        i3022 = ((org.telegram.ui.ActionBar.e2) ywVar2).currentAccount;
                                                        if (ConnectionsManager.getInstance(i3022).getCurrentTime() < tL_storiesStealthMode.active_until_date) {
                                                            if (view2 instanceof fi.p) {
                                                                ywVar2.F0.i((fi.p) view2, false);
                                                                break;
                                                            }
                                                        }
                                                    }
                                                    Context context = qvVar2.getContext();
                                                    e6Var = ((org.telegram.ui.ActionBar.e2) ywVar2).resourceProvider;
                                                    fi.o5 o5Var = new fi.o5(context, 0.0f, 1, e6Var);
                                                    o5Var.p1 = new pv(qvVar2, view2, 1);
                                                    ywVar2.showDialog(o5Var);
                                                    break;
                                                default:
                                                    qv qvVar3 = qvVar;
                                                    Context context2 = qvVar3.getContext();
                                                    yw ywVar3 = qvVar3.P0;
                                                    e6Var2 = ((org.telegram.ui.ActionBar.e2) ywVar3).resourceProvider;
                                                    fi.o5 o5Var2 = new fi.o5(context2, 0.0f, 1, e6Var2);
                                                    o5Var2.p1 = new pv(qvVar3, view, 0);
                                                    ywVar3.showDialog(o5Var2);
                                                    break;
                                            }
                                        }
                                    };
                                    if (z11) {
                                    }
                                    m60Var.E();
                                    final int i312 = 1;
                                    m60Var.l(R.drawable.msg_archive, hd.M0(2131754153, null), new Runnable() { // from class: org.telegram.ui.mv
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            int i2422;
                                            switch (i312) {
                                                case 0:
                                                    qvVar.P0.presentFragment(an.ua(j10));
                                                    break;
                                                case 1:
                                                    org.telegram.messenger.g0.i3(new tu(qvVar.P0, j10, !r2.q4(), 0), 200L);
                                                    break;
                                                case 2:
                                                    org.telegram.messenger.g0.i3(new tu(qvVar.P0, j10, !r2.q4(), 0), 200L);
                                                    break;
                                                case 3:
                                                    yw ywVar2 = qvVar.P0;
                                                    i2422 = ((org.telegram.ui.ActionBar.e2) ywVar2).currentAccount;
                                                    org.telegram.messenger.si b02 = org.telegram.messenger.si.b0(i2422);
                                                    long j11 = j10;
                                                    b02.N1(j11);
                                                    ywVar2.getMessagesController().P1().l0(j11, true, false);
                                                    break;
                                                case 4:
                                                    qvVar.P0.F0.j(j10);
                                                    break;
                                                case 5:
                                                    qvVar.P0.presentFragment(an.ua(j10));
                                                    break;
                                                default:
                                                    qvVar.P0.presentFragment(ProfileActivity.C4(j10));
                                                    break;
                                            }
                                        }
                                    }, z10 && !ywVar.q4());
                                    m60Var.E();
                                    final int i322 = 2;
                                    m60Var.l(R.drawable.msg_unarchive, hd.M0(2131743914, null), new Runnable() { // from class: org.telegram.ui.mv
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            int i2422;
                                            switch (i322) {
                                                case 0:
                                                    qvVar.P0.presentFragment(an.ua(j10));
                                                    break;
                                                case 1:
                                                    org.telegram.messenger.g0.i3(new tu(qvVar.P0, j10, !r2.q4(), 0), 200L);
                                                    break;
                                                case 2:
                                                    org.telegram.messenger.g0.i3(new tu(qvVar.P0, j10, !r2.q4(), 0), 200L);
                                                    break;
                                                case 3:
                                                    yw ywVar2 = qvVar.P0;
                                                    i2422 = ((org.telegram.ui.ActionBar.e2) ywVar2).currentAccount;
                                                    org.telegram.messenger.si b02 = org.telegram.messenger.si.b0(i2422);
                                                    long j11 = j10;
                                                    b02.N1(j11);
                                                    ywVar2.getMessagesController().P1().l0(j11, true, false);
                                                    break;
                                                case 4:
                                                    qvVar.P0.F0.j(j10);
                                                    break;
                                                case 5:
                                                    qvVar.P0.presentFragment(an.ua(j10));
                                                    break;
                                                default:
                                                    qvVar.P0.presentFragment(ProfileActivity.C4(j10));
                                                    break;
                                            }
                                        }
                                    }, z10 && ywVar.q4());
                                    m60Var.E();
                                    i17 = 3;
                                    m60Var.l(R.drawable.msg_delete, hd.M0(2131744748, null), new Runnable() { // from class: org.telegram.ui.mv
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            int i2422;
                                            switch (i17) {
                                                case 0:
                                                    qvVar.P0.presentFragment(an.ua(j10));
                                                    break;
                                                case 1:
                                                    org.telegram.messenger.g0.i3(new tu(qvVar.P0, j10, !r2.q4(), 0), 200L);
                                                    break;
                                                case 2:
                                                    org.telegram.messenger.g0.i3(new tu(qvVar.P0, j10, !r2.q4(), 0), 200L);
                                                    break;
                                                case 3:
                                                    yw ywVar2 = qvVar.P0;
                                                    i2422 = ((org.telegram.ui.ActionBar.e2) ywVar2).currentAccount;
                                                    org.telegram.messenger.si b02 = org.telegram.messenger.si.b0(i2422);
                                                    long j11 = j10;
                                                    b02.N1(j11);
                                                    ywVar2.getMessagesController().P1().l0(j11, true, false);
                                                    break;
                                                case 4:
                                                    qvVar.P0.F0.j(j10);
                                                    break;
                                                case 5:
                                                    qvVar.P0.presentFragment(an.ua(j10));
                                                    break;
                                                default:
                                                    qvVar.P0.presentFragment(ProfileActivity.C4(j10));
                                                    break;
                                            }
                                        }
                                    }, z10);
                                }
                            }
                            fqVar = null;
                            if (j10 < j3) {
                                final int i232 = 4;
                                ywVar.M0.b(R.drawable.msg_stories_add, null, hd.M0(2131754384, null), org.telegram.ui.ActionBar.j6.F8, org.telegram.ui.ActionBar.j6.E8, new Runnable() { // from class: org.telegram.ui.mv
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        int i2422;
                                        switch (i232) {
                                            case 0:
                                                qvVar.P0.presentFragment(an.ua(j10));
                                                break;
                                            case 1:
                                                org.telegram.messenger.g0.i3(new tu(qvVar.P0, j10, !r2.q4(), 0), 200L);
                                                break;
                                            case 2:
                                                org.telegram.messenger.g0.i3(new tu(qvVar.P0, j10, !r2.q4(), 0), 200L);
                                                break;
                                            case 3:
                                                yw ywVar2 = qvVar.P0;
                                                i2422 = ((org.telegram.ui.ActionBar.e2) ywVar2).currentAccount;
                                                org.telegram.messenger.si b02 = org.telegram.messenger.si.b0(i2422);
                                                long j11 = j10;
                                                b02.N1(j11);
                                                ywVar2.getMessagesController().P1().l0(j11, true, false);
                                                break;
                                            case 4:
                                                qvVar.P0.F0.j(j10);
                                                break;
                                            case 5:
                                                qvVar.P0.presentFragment(an.ua(j10));
                                                break;
                                            default:
                                                qvVar.P0.presentFragment(ProfileActivity.C4(j10));
                                                break;
                                        }
                                    }
                                });
                            }
                            if (a22 != null) {
                                i18 = ((org.telegram.ui.ActionBar.e2) ywVar).currentAccount;
                                if (si.b0(i18).G(j10)) {
                                }
                            }
                            z10 = false;
                            m60 m60Var222 = ywVar.M0;
                            final int i2422 = 5;
                            m60Var222.l(R.drawable.msg_discussion, hd.M0(2131745601, null), new Runnable() { // from class: org.telegram.ui.mv
                                @Override // java.lang.Runnable
                                public final void run() {
                                    int i24222;
                                    switch (i2422) {
                                        case 0:
                                            qvVar.P0.presentFragment(an.ua(j10));
                                            break;
                                        case 1:
                                            org.telegram.messenger.g0.i3(new tu(qvVar.P0, j10, !r2.q4(), 0), 200L);
                                            break;
                                        case 2:
                                            org.telegram.messenger.g0.i3(new tu(qvVar.P0, j10, !r2.q4(), 0), 200L);
                                            break;
                                        case 3:
                                            yw ywVar2 = qvVar.P0;
                                            i24222 = ((org.telegram.ui.ActionBar.e2) ywVar2).currentAccount;
                                            org.telegram.messenger.si b02 = org.telegram.messenger.si.b0(i24222);
                                            long j11 = j10;
                                            b02.N1(j11);
                                            ywVar2.getMessagesController().P1().l0(j11, true, false);
                                            break;
                                        case 4:
                                            qvVar.P0.F0.j(j10);
                                            break;
                                        case 5:
                                            qvVar.P0.presentFragment(an.ua(j10));
                                            break;
                                        default:
                                            qvVar.P0.presentFragment(ProfileActivity.C4(j10));
                                            break;
                                    }
                                }
                            }, j10 > j3);
                            final int i2522 = 6;
                            m60Var222.l(R.drawable.msg_openprofile, hd.M0(2131747786, null), new Runnable() { // from class: org.telegram.ui.mv
                                @Override // java.lang.Runnable
                                public final void run() {
                                    int i24222;
                                    switch (i2522) {
                                        case 0:
                                            qvVar.P0.presentFragment(an.ua(j10));
                                            break;
                                        case 1:
                                            org.telegram.messenger.g0.i3(new tu(qvVar.P0, j10, !r2.q4(), 0), 200L);
                                            break;
                                        case 2:
                                            org.telegram.messenger.g0.i3(new tu(qvVar.P0, j10, !r2.q4(), 0), 200L);
                                            break;
                                        case 3:
                                            yw ywVar2 = qvVar.P0;
                                            i24222 = ((org.telegram.ui.ActionBar.e2) ywVar2).currentAccount;
                                            org.telegram.messenger.si b02 = org.telegram.messenger.si.b0(i24222);
                                            long j11 = j10;
                                            b02.N1(j11);
                                            ywVar2.getMessagesController().P1().l0(j11, true, false);
                                            break;
                                        case 4:
                                            qvVar.P0.F0.j(j10);
                                            break;
                                        case 5:
                                            qvVar.P0.presentFragment(an.ua(j10));
                                            break;
                                        default:
                                            qvVar.P0.presentFragment(ProfileActivity.C4(j10));
                                            break;
                                    }
                                }
                            }, j10 > j3);
                            final int i2622 = 0;
                            m60Var222.l(R.drawable.msg_channel, hd.M0(org.telegram.messenger.t3.V(M0) ? 2131747811 : 2131747799, null), new Runnable() { // from class: org.telegram.ui.mv
                                @Override // java.lang.Runnable
                                public final void run() {
                                    int i24222;
                                    switch (i2622) {
                                        case 0:
                                            qvVar.P0.presentFragment(an.ua(j10));
                                            break;
                                        case 1:
                                            org.telegram.messenger.g0.i3(new tu(qvVar.P0, j10, !r2.q4(), 0), 200L);
                                            break;
                                        case 2:
                                            org.telegram.messenger.g0.i3(new tu(qvVar.P0, j10, !r2.q4(), 0), 200L);
                                            break;
                                        case 3:
                                            yw ywVar2 = qvVar.P0;
                                            i24222 = ((org.telegram.ui.ActionBar.e2) ywVar2).currentAccount;
                                            org.telegram.messenger.si b02 = org.telegram.messenger.si.b0(i24222);
                                            long j11 = j10;
                                            b02.N1(j11);
                                            ywVar2.getMessagesController().P1().l0(j11, true, false);
                                            break;
                                        case 4:
                                            qvVar.P0.F0.j(j10);
                                            break;
                                        case 5:
                                            qvVar.P0.presentFragment(an.ua(j10));
                                            break;
                                        default:
                                            qvVar.P0.presentFragment(ProfileActivity.C4(j10));
                                            break;
                                    }
                                }
                            }, j10 < j3);
                            final int i2722 = 0;
                            m60Var222.l(R.drawable.msg_mute, hd.M0(2131747863, null), new Runnable() { // from class: org.telegram.ui.nv
                                @Override // java.lang.Runnable
                                public final void run() {
                                    int i2822;
                                    String trim;
                                    int i2922;
                                    int i3022 = i2722;
                                    TLRPC.User user = a22;
                                    String str = v;
                                    qv qvVar2 = qvVar;
                                    switch (i3022) {
                                        case 0:
                                            yw ywVar2 = qvVar2.P0;
                                            i2822 = ((org.telegram.ui.ActionBar.e2) ywVar2).currentAccount;
                                            org.telegram.messenger.np.s1(i2822).e7.edit().putBoolean("stories_" + str, false).apply();
                                            ywVar2.getNotificationsController().c0(j10, 0L, true);
                                            trim = user != null ? user.first_name.trim() : "";
                                            int indexOf = trim.indexOf(" ");
                                            if (indexOf > 0) {
                                                trim = trim.substring(0, indexOf);
                                            }
                                            org.telegram.ui.Components.cc.a0(ywVar2).V(Arrays.asList(user), org.telegram.messenger.g0.X2(org.telegram.messenger.hd.a0("NotificationsStoryMutedHint", null, 2131747862, trim)), null, null).j();
                                            break;
                                        default:
                                            yw ywVar3 = qvVar2.P0;
                                            i2922 = ((org.telegram.ui.ActionBar.e2) ywVar3).currentAccount;
                                            org.telegram.messenger.np.s1(i2922).e7.edit().putBoolean("stories_" + str, true).apply();
                                            ywVar3.getNotificationsController().c0(j10, 0L, true);
                                            trim = user != null ? user.first_name.trim() : "";
                                            int indexOf2 = trim.indexOf(" ");
                                            if (indexOf2 > 0) {
                                                trim = trim.substring(0, indexOf2);
                                            }
                                            org.telegram.ui.Components.cc.a0(ywVar3).V(Arrays.asList(user), org.telegram.messenger.g0.X2(org.telegram.messenger.hd.a0("NotificationsStoryUnmutedHint", null, 2131747859, trim)), null, null).j();
                                            break;
                                    }
                                }
                            }, !h02 && j10 > j3);
                            m60Var222.E();
                            final int i2822 = 1;
                            m60Var222.l(R.drawable.msg_unmute, hd.M0(2131747860, null), new Runnable() { // from class: org.telegram.ui.nv
                                @Override // java.lang.Runnable
                                public final void run() {
                                    int i28222;
                                    String trim;
                                    int i2922;
                                    int i3022 = i2822;
                                    TLRPC.User user = a22;
                                    String str = v;
                                    qv qvVar2 = qvVar;
                                    switch (i3022) {
                                        case 0:
                                            yw ywVar2 = qvVar2.P0;
                                            i28222 = ((org.telegram.ui.ActionBar.e2) ywVar2).currentAccount;
                                            org.telegram.messenger.np.s1(i28222).e7.edit().putBoolean("stories_" + str, false).apply();
                                            ywVar2.getNotificationsController().c0(j10, 0L, true);
                                            trim = user != null ? user.first_name.trim() : "";
                                            int indexOf = trim.indexOf(" ");
                                            if (indexOf > 0) {
                                                trim = trim.substring(0, indexOf);
                                            }
                                            org.telegram.ui.Components.cc.a0(ywVar2).V(Arrays.asList(user), org.telegram.messenger.g0.X2(org.telegram.messenger.hd.a0("NotificationsStoryMutedHint", null, 2131747862, trim)), null, null).j();
                                            break;
                                        default:
                                            yw ywVar3 = qvVar2.P0;
                                            i2922 = ((org.telegram.ui.ActionBar.e2) ywVar3).currentAccount;
                                            org.telegram.messenger.np.s1(i2922).e7.edit().putBoolean("stories_" + str, true).apply();
                                            ywVar3.getNotificationsController().c0(j10, 0L, true);
                                            trim = user != null ? user.first_name.trim() : "";
                                            int indexOf2 = trim.indexOf(" ");
                                            if (indexOf2 > 0) {
                                                trim = trim.substring(0, indexOf2);
                                            }
                                            org.telegram.ui.Components.cc.a0(ywVar3).V(Arrays.asList(user), org.telegram.messenger.g0.X2(org.telegram.messenger.hd.a0("NotificationsStoryUnmutedHint", null, 2131747859, trim)), null, null).j();
                                            break;
                                    }
                                }
                            }, h02 && j10 > j3);
                            m60Var222.E();
                            final int i2922 = 0;
                            m60Var222.l(R.drawable.msg_stories_stealth2, hd.M0(2131743562, null), new Runnable() { // from class: org.telegram.ui.ov
                                @Override // java.lang.Runnable
                                public final void run() {
                                    org.telegram.ui.ActionBar.e6 e6Var;
                                    int i3022;
                                    org.telegram.ui.ActionBar.e6 e6Var2;
                                    switch (i2922) {
                                        case 0:
                                            qv qvVar2 = qvVar;
                                            yw ywVar2 = qvVar2.P0;
                                            TL_stories.TL_storiesStealthMode tL_storiesStealthMode = org.telegram.messenger.np.s1(org.telegram.messenger.m10.t0).P1().B;
                                            View view2 = view;
                                            if (tL_storiesStealthMode != null) {
                                                i3022 = ((org.telegram.ui.ActionBar.e2) ywVar2).currentAccount;
                                                if (ConnectionsManager.getInstance(i3022).getCurrentTime() < tL_storiesStealthMode.active_until_date) {
                                                    if (view2 instanceof fi.p) {
                                                        ywVar2.F0.i((fi.p) view2, false);
                                                        break;
                                                    }
                                                }
                                            }
                                            Context context = qvVar2.getContext();
                                            e6Var = ((org.telegram.ui.ActionBar.e2) ywVar2).resourceProvider;
                                            fi.o5 o5Var = new fi.o5(context, 0.0f, 1, e6Var);
                                            o5Var.p1 = new pv(qvVar2, view2, 1);
                                            ywVar2.showDialog(o5Var);
                                            break;
                                        default:
                                            qv qvVar3 = qvVar;
                                            Context context2 = qvVar3.getContext();
                                            yw ywVar3 = qvVar3.P0;
                                            e6Var2 = ((org.telegram.ui.ActionBar.e2) ywVar3).resourceProvider;
                                            fi.o5 o5Var2 = new fi.o5(context2, 0.0f, 1, e6Var2);
                                            o5Var2.p1 = new pv(qvVar3, view, 0);
                                            ywVar3.showDialog(o5Var2);
                                            break;
                                    }
                                }
                            }, D3 && j10 > j3 && q10 && L && !H2);
                            m60Var222.E();
                            if (D3) {
                            }
                            String M0222 = hd.M0(2131743562, null);
                            final int i3022 = 1;
                            Runnable runnable22 = new Runnable() { // from class: org.telegram.ui.ov
                                @Override // java.lang.Runnable
                                public final void run() {
                                    org.telegram.ui.ActionBar.e6 e6Var;
                                    int i30222;
                                    org.telegram.ui.ActionBar.e6 e6Var2;
                                    switch (i3022) {
                                        case 0:
                                            qv qvVar2 = qvVar;
                                            yw ywVar2 = qvVar2.P0;
                                            TL_stories.TL_storiesStealthMode tL_storiesStealthMode = org.telegram.messenger.np.s1(org.telegram.messenger.m10.t0).P1().B;
                                            View view2 = view;
                                            if (tL_storiesStealthMode != null) {
                                                i30222 = ((org.telegram.ui.ActionBar.e2) ywVar2).currentAccount;
                                                if (ConnectionsManager.getInstance(i30222).getCurrentTime() < tL_storiesStealthMode.active_until_date) {
                                                    if (view2 instanceof fi.p) {
                                                        ywVar2.F0.i((fi.p) view2, false);
                                                        break;
                                                    }
                                                }
                                            }
                                            Context context = qvVar2.getContext();
                                            e6Var = ((org.telegram.ui.ActionBar.e2) ywVar2).resourceProvider;
                                            fi.o5 o5Var = new fi.o5(context, 0.0f, 1, e6Var);
                                            o5Var.p1 = new pv(qvVar2, view2, 1);
                                            ywVar2.showDialog(o5Var);
                                            break;
                                        default:
                                            qv qvVar3 = qvVar;
                                            Context context2 = qvVar3.getContext();
                                            yw ywVar3 = qvVar3.P0;
                                            e6Var2 = ((org.telegram.ui.ActionBar.e2) ywVar3).resourceProvider;
                                            fi.o5 o5Var2 = new fi.o5(context2, 0.0f, 1, e6Var2);
                                            o5Var2.p1 = new pv(qvVar3, view, 0);
                                            ywVar3.showDialog(o5Var2);
                                            break;
                                    }
                                }
                            };
                            if (z11) {
                            }
                            m60Var.E();
                            final int i3122 = 1;
                            m60Var.l(R.drawable.msg_archive, hd.M0(2131754153, null), new Runnable() { // from class: org.telegram.ui.mv
                                @Override // java.lang.Runnable
                                public final void run() {
                                    int i24222;
                                    switch (i3122) {
                                        case 0:
                                            qvVar.P0.presentFragment(an.ua(j10));
                                            break;
                                        case 1:
                                            org.telegram.messenger.g0.i3(new tu(qvVar.P0, j10, !r2.q4(), 0), 200L);
                                            break;
                                        case 2:
                                            org.telegram.messenger.g0.i3(new tu(qvVar.P0, j10, !r2.q4(), 0), 200L);
                                            break;
                                        case 3:
                                            yw ywVar2 = qvVar.P0;
                                            i24222 = ((org.telegram.ui.ActionBar.e2) ywVar2).currentAccount;
                                            org.telegram.messenger.si b02 = org.telegram.messenger.si.b0(i24222);
                                            long j11 = j10;
                                            b02.N1(j11);
                                            ywVar2.getMessagesController().P1().l0(j11, true, false);
                                            break;
                                        case 4:
                                            qvVar.P0.F0.j(j10);
                                            break;
                                        case 5:
                                            qvVar.P0.presentFragment(an.ua(j10));
                                            break;
                                        default:
                                            qvVar.P0.presentFragment(ProfileActivity.C4(j10));
                                            break;
                                    }
                                }
                            }, z10 && !ywVar.q4());
                            m60Var.E();
                            final int i3222 = 2;
                            m60Var.l(R.drawable.msg_unarchive, hd.M0(2131743914, null), new Runnable() { // from class: org.telegram.ui.mv
                                @Override // java.lang.Runnable
                                public final void run() {
                                    int i24222;
                                    switch (i3222) {
                                        case 0:
                                            qvVar.P0.presentFragment(an.ua(j10));
                                            break;
                                        case 1:
                                            org.telegram.messenger.g0.i3(new tu(qvVar.P0, j10, !r2.q4(), 0), 200L);
                                            break;
                                        case 2:
                                            org.telegram.messenger.g0.i3(new tu(qvVar.P0, j10, !r2.q4(), 0), 200L);
                                            break;
                                        case 3:
                                            yw ywVar2 = qvVar.P0;
                                            i24222 = ((org.telegram.ui.ActionBar.e2) ywVar2).currentAccount;
                                            org.telegram.messenger.si b02 = org.telegram.messenger.si.b0(i24222);
                                            long j11 = j10;
                                            b02.N1(j11);
                                            ywVar2.getMessagesController().P1().l0(j11, true, false);
                                            break;
                                        case 4:
                                            qvVar.P0.F0.j(j10);
                                            break;
                                        case 5:
                                            qvVar.P0.presentFragment(an.ua(j10));
                                            break;
                                        default:
                                            qvVar.P0.presentFragment(ProfileActivity.C4(j10));
                                            break;
                                    }
                                }
                            }, z10 && ywVar.q4());
                            m60Var.E();
                            i17 = 3;
                            m60Var.l(R.drawable.msg_delete, hd.M0(2131744748, null), new Runnable() { // from class: org.telegram.ui.mv
                                @Override // java.lang.Runnable
                                public final void run() {
                                    int i24222;
                                    switch (i17) {
                                        case 0:
                                            qvVar.P0.presentFragment(an.ua(j10));
                                            break;
                                        case 1:
                                            org.telegram.messenger.g0.i3(new tu(qvVar.P0, j10, !r2.q4(), 0), 200L);
                                            break;
                                        case 2:
                                            org.telegram.messenger.g0.i3(new tu(qvVar.P0, j10, !r2.q4(), 0), 200L);
                                            break;
                                        case 3:
                                            yw ywVar2 = qvVar.P0;
                                            i24222 = ((org.telegram.ui.ActionBar.e2) ywVar2).currentAccount;
                                            org.telegram.messenger.si b02 = org.telegram.messenger.si.b0(i24222);
                                            long j11 = j10;
                                            b02.N1(j11);
                                            ywVar2.getMessagesController().P1().l0(j11, true, false);
                                            break;
                                        case 4:
                                            qvVar.P0.F0.j(j10);
                                            break;
                                        case 5:
                                            qvVar.P0.presentFragment(an.ua(j10));
                                            break;
                                        default:
                                            qvVar.P0.presentFragment(ProfileActivity.C4(j10));
                                            break;
                                    }
                                }
                            }, z10);
                        } else if (ywVar.P3) {
                            m60 m60Var3 = ywVar.M0;
                            String M03 = hd.M0(2131754384, null);
                            int i33 = org.telegram.ui.ActionBar.j6.F8;
                            int i34 = org.telegram.ui.ActionBar.j6.E8;
                            m60Var3.b(R.drawable.msg_stories_add, null, M03, i33, i34, new Runnable() { // from class: org.telegram.ui.lv
                                @Override // java.lang.Runnable
                                public final void run() {
                                    int i35;
                                    int i36;
                                    switch (i21) {
                                        case 0:
                                            qvVar.P0.F0.j(0L);
                                            break;
                                        case 1:
                                            Bundle bundle = new Bundle();
                                            yw ywVar2 = qvVar.P0;
                                            i35 = ((org.telegram.ui.ActionBar.e2) ywVar2).currentAccount;
                                            bundle.putLong("dialog_id", org.telegram.messenger.m10.i(i35).e());
                                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                            bundle.putInt("start_from", 9);
                                            ywVar2.presentFragment(new org.telegram.ui.Components.y80(bundle, null));
                                            break;
                                        default:
                                            Bundle bundle2 = new Bundle();
                                            yw ywVar3 = qvVar.P0;
                                            i36 = ((org.telegram.ui.ActionBar.e2) ywVar3).currentAccount;
                                            bundle2.putLong("dialog_id", org.telegram.messenger.m10.i(i36).e());
                                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                            ywVar3.presentFragment(new org.telegram.ui.Components.y80(bundle2, null));
                                            break;
                                    }
                                }
                            });
                            ywVar.M0.b(R.drawable.msg_stories_archive, null, hd.M0(2131754123, null), i33, i34, new Runnable() { // from class: org.telegram.ui.lv
                                @Override // java.lang.Runnable
                                public final void run() {
                                    int i35;
                                    int i36;
                                    switch (i22) {
                                        case 0:
                                            qvVar.P0.F0.j(0L);
                                            break;
                                        case 1:
                                            Bundle bundle = new Bundle();
                                            yw ywVar2 = qvVar.P0;
                                            i35 = ((org.telegram.ui.ActionBar.e2) ywVar2).currentAccount;
                                            bundle.putLong("dialog_id", org.telegram.messenger.m10.i(i35).e());
                                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                            bundle.putInt("start_from", 9);
                                            ywVar2.presentFragment(new org.telegram.ui.Components.y80(bundle, null));
                                            break;
                                        default:
                                            Bundle bundle2 = new Bundle();
                                            yw ywVar3 = qvVar.P0;
                                            i36 = ((org.telegram.ui.ActionBar.e2) ywVar3).currentAccount;
                                            bundle2.putLong("dialog_id", org.telegram.messenger.m10.i(i36).e());
                                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                            ywVar3.presentFragment(new org.telegram.ui.Components.y80(bundle2, null));
                                            break;
                                    }
                                }
                            });
                            ywVar.M0.b(R.drawable.msg_stories_saved, null, hd.M0(2131745885, null), i33, i34, new Runnable() { // from class: org.telegram.ui.lv
                                @Override // java.lang.Runnable
                                public final void run() {
                                    int i35;
                                    int i36;
                                    switch (i20) {
                                        case 0:
                                            qvVar.P0.F0.j(0L);
                                            break;
                                        case 1:
                                            Bundle bundle = new Bundle();
                                            yw ywVar2 = qvVar.P0;
                                            i35 = ((org.telegram.ui.ActionBar.e2) ywVar2).currentAccount;
                                            bundle.putLong("dialog_id", org.telegram.messenger.m10.i(i35).e());
                                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                            bundle.putInt("start_from", 9);
                                            ywVar2.presentFragment(new org.telegram.ui.Components.y80(bundle, null));
                                            break;
                                        default:
                                            Bundle bundle2 = new Bundle();
                                            yw ywVar3 = qvVar.P0;
                                            i36 = ((org.telegram.ui.ActionBar.e2) ywVar3).currentAccount;
                                            bundle2.putLong("dialog_id", org.telegram.messenger.m10.i(i36).e());
                                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                            ywVar3.presentFragment(new org.telegram.ui.Components.y80(bundle2, null));
                                            break;
                                    }
                                }
                            });
                            i17 = 3;
                        } else {
                            qv qvVar2 = ywVar.F0;
                            if (qvVar2 != null) {
                                qvVar2.n();
                            }
                        }
                        m60 m60Var4 = ywVar.M0;
                        m60Var4.i = i17;
                        m60Var4.a0(org.telegram.messenger.g0.L(-8.0f), org.telegram.messenger.g0.L(-10.0f));
                        m60Var4.Z();
                        return false;
                    }
                    p2Var.a();
                }
                return false;
            case 14:
                vp0 vp0Var = ((gi.m) obj).a0;
                if (vp0Var.H.F1 || !(view instanceof org.telegram.ui.Cells.n7)) {
                    return false;
                }
                gj messageObject = ((org.telegram.ui.Cells.n7) view).getMessageObject();
                if (vp0Var.c(messageObject)) {
                    vp0Var.g(messageObject);
                } else {
                    vp0Var.e(messageObject);
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
                        org.telegram.messenger.g0.F3(i36, view, null);
                        p2Var.a();
                        return true;
                    }
                    arrayList2.add(ffVar);
                }
                org.telegram.messenger.g0.a4(d3Var.d);
                d3Var.j();
                return true;
        }
    }

    @Override // fi.a7
    public void c(boolean z10) {
        fi.b5 b5Var = (fi.b5) this.b;
        if (b5Var != null) {
            b5Var.c();
        }
    }

    @Override // org.telegram.ui.Components.hj0
    public /* synthetic */ boolean c1(View view) {
        return false;
    }

    @Override // org.telegram.messenger.t10
    public Object d(Number number, Object obj) {
        int i7 = this.a;
        Object obj2 = this.b;
        switch (i7) {
            case 5:
                return fi.u0.a((fi.u0) obj2, (Long) obj);
            default:
                vp0 vp0Var = (vp0) obj2;
                if (((Integer) number).intValue() != -1) {
                    return Boolean.FALSE;
                }
                new gi.p(vp0Var.a, hd.M0(2131746693, null), new ai.g0(vp0Var, 19)).show();
                return Boolean.TRUE;
        }
    }

    @Override // org.telegram.ui.jl0
    public void e(int i7) {
        bi.v5 v5Var = (bi.v5) this.b;
        if (i7 == 1) {
            v5Var.a(Boolean.TRUE, null);
        } else if (i7 != 3) {
            v5Var.a(Boolean.FALSE, null);
        }
    }

    @Override // org.telegram.ui.Components.hj0
    public void f(float f10, float f11, int i7, View view) {
        long j3;
        int i10;
        int i11;
        int i12;
        fi.c2 c2Var = (fi.c2) this.b;
        c1 c1Var = c2Var.c;
        ArrayList arrayList = c2Var.r;
        fi.t0 t0Var = ((fi.r0) view).f;
        int i13 = c2Var.O;
        int currentTime = ConnectionsManager.getInstance(i13).getCurrentTime();
        HashSet hashSet = new HashSet();
        int i14 = 0;
        int i15 = 0;
        while (true) {
            if (i15 >= t0Var.f.size()) {
                break;
            }
            fi.s0 s0Var = (fi.s0) t0Var.f.get(i15);
            long j10 = s0Var.g;
            if (j10 > 0 && currentTime - s0Var.d <= fi.t.b(i13, (int) j10, 0)) {
                hashSet.add(Integer.valueOf(s0Var.a));
            }
            i15++;
        }
        fi.e1 e1Var = c2Var.Q;
        long j11 = e1Var != null ? e1Var.j() : 0L;
        int i16 = 0;
        int i17 = 0;
        while (i16 < arrayList.size()) {
            fi.s0 s0Var2 = (fi.s0) arrayList.get(i16);
            if (s0Var2.b || !s0Var2.e || s0Var2.g >= j11) {
                if (hashSet.contains(Integer.valueOf(s0Var2.a))) {
                    j3 = j11;
                    if (c2Var.x != t0Var.b || (i12 = c2Var.y) == 0 || s0Var2.a < i12) {
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
                fi.s0 s0Var3 = (fi.s0) arrayList.get(i14);
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
        c2Var.x = t0Var.b;
        c2Var.y = i11;
        c2Var.E = true;
        v4.m0 itemAnimator = c1Var.getItemAnimator();
        c1Var.setItemAnimator(null);
        c2Var.d.i1(i17, c1Var.getHeight() / 2, true);
        c2Var.e.g(i17);
        c1Var.setItemAnimator(itemAnimator);
    }

    @Override // fi.c9
    public void g(float f10, Canvas canvas, RectF rectF, boolean z10) {
        Path path = (Path) this.b;
        if (z10) {
            return;
        }
        path.rewind();
        float pow = (float) Math.pow(f10, 2.0d);
        path.addCircle((rectF.right + org.telegram.messenger.g0.L(7.0f)) - (org.telegram.messenger.g0.L(14.0f) * pow), (rectF.bottom + org.telegram.messenger.g0.L(7.0f)) - (org.telegram.messenger.g0.L(14.0f) * pow), org.telegram.messenger.g0.L(11.0f), Path.Direction.CW);
        canvas.clipPath(path, Region.Op.DIFFERENCE);
    }

    @Override // org.telegram.ui.ActionBar.q1
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        int i10;
        switch (this.a) {
            case 16:
                hi.sa saVar = ((hi.ia) ((hi.r) this.b)).S1;
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
                hi.d7 d7Var = saVar.L1;
                if (d7Var != null) {
                    File file = d7Var.o0;
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
            case 21:
                ((hi.f5) this.b).a.Z1.r();
                break;
            case 27:
                kg.r1 r1Var = (kg.r1) ((bi.x4) this.b).b;
                i10 = ((org.telegram.ui.ActionBar.e2) r1Var).currentAccount;
                kg.v1 f10 = kg.v1.f(i10);
                ArrayList arrayList = r1Var.b;
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
                        ConnectionsManager.getInstance(i11).sendRequest(tL_messages_deleteQuickReplyShortcut, new fi.m5(6));
                        if ("hello".equals(c10.b)) {
                            ConnectionsManager.getInstance(i11).sendRequest(new TL_account.updateBusinessGreetingMessage(), null);
                            TLRPC.UserFull b22 = np.s1(i11).b2(m10.i(i11).e());
                            if (b22 != null) {
                                b22.flags2 &= -5;
                                b22.business_greeting_message = null;
                                vr.a0(i11).j2(b22, true);
                            }
                        } else if ("away".equals(c10.b)) {
                            ConnectionsManager.getInstance(i11).sendRequest(new TL_account.updateBusinessAwayMessage(), null);
                            TLRPC.UserFull b23 = np.s1(i11).b2(m10.i(i11).e());
                            if (b23 != null) {
                                b23.flags2 &= -9;
                                b23.business_away_message = null;
                                vr.a0(i11).j2(b23, true);
                            }
                        }
                    }
                    f10.l();
                    vr a02 = vr.a0(i11);
                    a02.a.c(new hi.y0(a02, arrayList, 2));
                    ns.f(i11).k(ns.F1, new Object[0]);
                }
                kg.r1.c0(r1Var);
                break;
            default:
                ((ki.d) this.b).run();
                break;
        }
    }

    @Override // org.telegram.ui.Components.vi0
    public void i() {
        ((hi.o1) this.b).invalidate();
    }

    @Override // xh.j
    public void j(xh.f fVar, float f10, float f11) {
        fi.y7 y7Var = (fi.y7) this.b;
        if (y7Var.v.y) {
            return;
        }
        fVar.q = new fi.x7(y7Var, 2);
        float sqrt = (float) Math.sqrt(Math.pow(r1.getHeight(), 2.0d) + Math.pow(r1.getWidth(), 2.0d));
        ArrayList arrayList = y7Var.i;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            ((xh.f) obj).j(f10, f11, sqrt, false);
        }
    }

    @Override // org.telegram.ui.Components.gt0
    public /* synthetic */ float k(RecyclerView recyclerView) {
        return org.telegram.ui.Cells.y0.c(recyclerView);
    }

    @Override // f3.g
    public long l(long j3) {
        return h2.l0.j((j3 * r0.e) / 1000000, 0L, ((f3.u) this.b).j - 1);
    }

    @Override // org.telegram.messenger.x10
    public void m(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        int i7;
        final int i10 = 1;
        final int i11 = 0;
        switch (this.a) {
            case 1:
                ib ibVar = (ib) this.b;
                b41 b41Var = (b41) obj;
                if (b41Var.G instanceof TL_stars.StarsTransaction) {
                    lb.k1(ibVar.getContext(), false, 0L, ibVar.c, (TL_stars.StarsTransaction) b41Var.G, ibVar.b);
                    break;
                }
                break;
            case 19:
                hi.l9 l9Var = (hi.l9) this.b;
                b41 b41Var2 = (b41) obj;
                int i12 = b41Var2.d;
                hi.d7 d7Var = (hi.d7) b41Var2.G;
                l9Var.c(false, true);
                hi.sa saVar = l9Var.P;
                if (d7Var != saVar.L1 && !saVar.Y1) {
                    saVar.e1.setSelected(i12);
                    saVar.Y1 = true;
                    ai.w0 w0Var = new ai.w0(saVar, i12, 9);
                    hi.u9 u9Var = saVar.w1;
                    hi.d7 d7Var2 = saVar.L1;
                    if (u9Var != null && d7Var2 != null) {
                        if (u9Var.r0()) {
                            d7Var2.f();
                            Utilities.g.c(new hi.v8(saVar, u9Var, d7Var2.i0, d7Var2.j0, d7Var2, u9Var.y0.getPainting().E, u9Var.r0(), w0Var, 0));
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
            case 25:
                kg.c1 c1Var = (kg.c1) this.b;
                b41 b41Var3 = (b41) obj;
                View view = (View) obj2;
                float floatValue = ((Float) serializable).floatValue();
                int i13 = b41Var3.d;
                if (i13 == -1) {
                    boolean z10 = !c1Var.d;
                    c1Var.d = z10;
                    ((org.telegram.ui.Cells.q8) view).setChecked(z10);
                    c1Var.a.g3.O(true);
                    c1Var.d0(true);
                    break;
                } else if (i13 == -2) {
                    kg.y1 y1Var = new kg.y1(null);
                    y1Var.n = c1Var.n;
                    y1Var.c = new ai.v1(23, c1Var, view);
                    c1Var.presentFragment(y1Var);
                    break;
                } else if (b41Var3.a == 5 && i13 >= 0 && i13 < c1Var.f.length) {
                    if (!hd.a0 ? floatValue < view.getMeasuredWidth() - org.telegram.messenger.g0.L(76.0f) : floatValue > org.telegram.messenger.g0.L(76.0f)) {
                        int i14 = (b41Var3.d + 6) % 7;
                        int i15 = 0;
                        for (int i16 = 0; i16 < c1Var.f[i14].size(); i16++) {
                            if (((kg.b1) c1Var.f[i14].get(i16)).b > i15) {
                                i15 = ((kg.b1) c1Var.f[i14].get(i16)).b;
                            }
                        }
                        int max = Math.max(0, i15 - 1439);
                        int i17 = (b41Var3.d + 1) % 7;
                        int i18 = 1440;
                        for (int i19 = 0; i19 < c1Var.f[i17].size(); i19++) {
                            if (((kg.b1) c1Var.f[i17].get(i19)).a < i18) {
                                i18 = ((kg.b1) c1Var.f[i17].get(i19)).a;
                            }
                        }
                        int i20 = i18 + 1439;
                        CharSequence charSequence = b41Var3.l;
                        ArrayList arrayList = c1Var.f[b41Var3.d];
                        int i21 = 0;
                        while (i11 < 7) {
                            ArrayList arrayList2 = c1Var.f[i11];
                            if (arrayList2 != null) {
                                i21 = Math.max(1, arrayList2.size()) + i21;
                            }
                            i11++;
                        }
                        kg.e1 e1Var = new kg.e1(charSequence, arrayList, max, i20, 28 - i21);
                        int i22 = 29;
                        e1Var.f = new hi.e1(c1Var, i22);
                        e1Var.h = new hi.h4(i22, c1Var, b41Var3);
                        c1Var.presentFragment(e1Var);
                        break;
                    } else {
                        if (c1Var.f[b41Var3.d].isEmpty()) {
                            ((org.telegram.ui.Cells.h5) view).setChecked(true);
                            c1Var.f[b41Var3.d].add(new kg.b1(0, 1439));
                            c1Var.c0(b41Var3.d);
                        } else {
                            c1Var.f[b41Var3.d].clear();
                            ((org.telegram.ui.Cells.h5) view).setChecked(false);
                        }
                        ((org.telegram.ui.Cells.h5) view).setValue(kg.c1.f0(c1Var.f[b41Var3.d]));
                        c1Var.d0(true);
                        break;
                    }
                }
                break;
            case 26:
                final kg.e1 e1Var2 = (kg.e1) this.b;
                b41 b41Var4 = (b41) obj;
                final View view2 = (View) obj2;
                int i23 = e1Var2.c;
                int i24 = e1Var2.d;
                ArrayList arrayList3 = e1Var2.b;
                int i25 = b41Var4.d;
                if (i25 == -1) {
                    e1Var2.r = !e1Var2.r;
                    arrayList3.clear();
                    if (e1Var2.r) {
                        arrayList3.add(new kg.b1(0, 1439));
                    }
                    org.telegram.ui.Cells.q8 q8Var = (org.telegram.ui.Cells.q8) view2;
                    boolean z11 = e1Var2.r;
                    b41Var4.e = z11;
                    q8Var.setChecked(z11);
                    boolean z12 = e1Var2.r;
                    q8Var.b(org.telegram.ui.ActionBar.j6.x0(null, z12 ? org.telegram.ui.ActionBar.j6.f6 : org.telegram.ui.ActionBar.j6.e6, false), z12);
                    e1Var2.n.g3.O(true);
                    hi.e1 e1Var3 = e1Var2.f;
                    if (e1Var3 != null) {
                        e1Var3.run();
                        break;
                    }
                } else if (i25 == -2) {
                    if (arrayList3.isEmpty() || e1Var2.Z()) {
                        if (e1Var2.Z()) {
                            arrayList3.clear();
                        }
                        int j3 = Utilities.j(480, i24 - 1, i23);
                        arrayList3.add(new kg.b1(j3, Utilities.j(1200, i24, j3 + 1)));
                    } else {
                        int i26 = ((kg.b1) i5.c.h(1, arrayList3)).b;
                        int j10 = Utilities.j(i26 + 30, i24 - 1, i23);
                        arrayList3.add(new kg.b1(j10, Utilities.j((i26 + 1560) / 2, i24, j10 + 1)));
                    }
                    hi.e1 e1Var4 = e1Var2.f;
                    if (e1Var4 != null) {
                        e1Var4.run();
                    }
                    e1Var2.n.g3.O(true);
                    break;
                } else if (b41Var4.a == 3 && (i7 = i25 / 3) >= 0 && i7 < arrayList3.size()) {
                    int i27 = i7 - 1;
                    kg.b1 b1Var = i27 >= 0 ? (kg.b1) arrayList3.get(i27) : null;
                    final kg.b1 b1Var2 = (kg.b1) arrayList3.get(i7);
                    int i28 = i7 + 1;
                    kg.b1 b1Var3 = i28 < arrayList3.size() ? (kg.b1) arrayList3.get(i28) : null;
                    int i29 = b41Var4.d % 3;
                    if (i29 == 0) {
                        Activity parentActivity = e1Var2.getParentActivity();
                        String M0 = hd.M0(2131752750, null);
                        int i30 = b1Var2.a;
                        if (b1Var != null) {
                            i23 = b1Var.b + 1;
                        }
                        org.telegram.ui.Components.t4.U(parentActivity, M0, i30, i23, b1Var2.b - 1, new z10() { // from class: kg.d1
                            @Override // org.telegram.messenger.z10
                            public final void a(Object obj3) {
                                Integer num = (Integer) obj3;
                                switch (i11) {
                                    case 0:
                                        e1 e1Var5 = e1Var2;
                                        boolean a02 = e1Var5.a0();
                                        l8 l8Var = (l8) view2;
                                        int intValue = num.intValue();
                                        b1Var2.a = intValue;
                                        l8Var.w(b1.a(intValue), true);
                                        if (a02 != e1Var5.a0()) {
                                            e1Var5.n.g3.O(true);
                                        }
                                        hi.e1 e1Var6 = e1Var5.f;
                                        if (e1Var6 != null) {
                                            e1Var6.run();
                                            break;
                                        }
                                        break;
                                    default:
                                        e1 e1Var7 = e1Var2;
                                        boolean a03 = e1Var7.a0();
                                        l8 l8Var2 = (l8) view2;
                                        int intValue2 = num.intValue();
                                        b1Var2.b = intValue2;
                                        l8Var2.w(b1.a(intValue2), true);
                                        if (a03 != e1Var7.a0()) {
                                            e1Var7.n.g3.O(true);
                                        }
                                        hi.e1 e1Var8 = e1Var7.f;
                                        if (e1Var8 != null) {
                                            e1Var8.run();
                                            break;
                                        }
                                        break;
                                }
                            }
                        });
                        break;
                    } else if (i29 == 1) {
                        Activity parentActivity2 = e1Var2.getParentActivity();
                        String M02 = hd.M0(2131752756, null);
                        int i31 = b1Var2.b;
                        int i32 = b1Var2.a + 1;
                        if (b1Var3 != null) {
                            i24 = b1Var3.a - 1;
                        }
                        org.telegram.ui.Components.t4.U(parentActivity2, M02, i31, i32, i24, new z10() { // from class: kg.d1
                            @Override // org.telegram.messenger.z10
                            public final void a(Object obj3) {
                                Integer num = (Integer) obj3;
                                switch (i10) {
                                    case 0:
                                        e1 e1Var5 = e1Var2;
                                        boolean a02 = e1Var5.a0();
                                        l8 l8Var = (l8) view2;
                                        int intValue = num.intValue();
                                        b1Var2.a = intValue;
                                        l8Var.w(b1.a(intValue), true);
                                        if (a02 != e1Var5.a0()) {
                                            e1Var5.n.g3.O(true);
                                        }
                                        hi.e1 e1Var6 = e1Var5.f;
                                        if (e1Var6 != null) {
                                            e1Var6.run();
                                            break;
                                        }
                                        break;
                                    default:
                                        e1 e1Var7 = e1Var2;
                                        boolean a03 = e1Var7.a0();
                                        l8 l8Var2 = (l8) view2;
                                        int intValue2 = num.intValue();
                                        b1Var2.b = intValue2;
                                        l8Var2.w(b1.a(intValue2), true);
                                        if (a03 != e1Var7.a0()) {
                                            e1Var7.n.g3.O(true);
                                        }
                                        hi.e1 e1Var8 = e1Var7.f;
                                        if (e1Var8 != null) {
                                            e1Var8.run();
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
                            arrayList3.add(new kg.b1(0, 1439));
                        }
                        e1Var2.n.g3.O(true);
                        hi.e1 e1Var5 = e1Var2.f;
                        if (e1Var5 != null) {
                            e1Var5.run();
                            break;
                        }
                    }
                }
                break;
            default:
                kg.y1.Z((kg.y1) this.b, (b41) obj, (View) obj2);
                break;
        }
    }

    @Override // org.telegram.ui.Components.gt0
    public RecyclerView n(View view) {
        ((kb) this.b).getClass();
        return ((ib) view).a;
    }

    @Override // org.telegram.messenger.camera.CameraController.VideoTakeCallback
    public void onFinishVideoRecording(String str, long j3) {
        hi.p9 p9Var = (hi.p9) this.b;
        hi.sa saVar = p9Var.a;
        hi.f6 f6Var = saVar.P0;
        int i7 = saVar.c;
        if (f6Var != null) {
            f6Var.g(true);
        }
        if (saVar.p0()) {
            saVar.s.d();
        }
        if (saVar.H1 == null || saVar.C0 == null) {
            return;
        }
        saVar.R1 = false;
        saVar.S1 = false;
        hi.b6 b6Var = saVar.D0;
        if (b6Var != null) {
            b6Var.c(false);
        }
        if (j3 <= 800) {
            saVar.g(false, true);
            saVar.c0(false);
            saVar.K0.b(false, true);
            hi.f6 f6Var2 = saVar.P0;
            if (f6Var2 != null) {
                f6Var2.g(true);
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
        hi.d7 o4 = hi.d7.o(saVar.H1, str, j3);
        o4.J0 = saVar.w0;
        o4.K0 = saVar.x0;
        o4.B();
        saVar.g(false, true);
        saVar.c0(false);
        saVar.K0.b(false, true);
        hi.f6 f6Var3 = saVar.P0;
        if (f6Var3 != null) {
            f6Var3.g(true);
        }
        if (!saVar.B0.j()) {
            saVar.L1 = o4;
            hi.r8.a(i7, o4);
            saVar.M1 = false;
            int videoWidth = saVar.C0.getVideoWidth();
            int videoHeight = saVar.C0.getVideoHeight();
            if (videoWidth > 0 && videoHeight > 0) {
                hi.d7 d7Var = saVar.L1;
                d7Var.k0 = videoWidth;
                d7Var.l0 = videoHeight;
                d7Var.A();
            }
            saVar.K(new hi.n9(p9Var, 3), 0L);
            return;
        }
        saVar.H1 = null;
        o4.P = 1.0f;
        if (saVar.B0.l(o4)) {
            hi.d7 a10 = hi.d7.a(saVar.B0.getLayout(), saVar.B0.getContent());
            saVar.L1 = a10;
            hi.r8.a(i7, a10);
            saVar.M1 = false;
            int videoWidth2 = saVar.C0.getVideoWidth();
            int videoHeight2 = saVar.C0.getVideoHeight();
            if (videoWidth2 > 0 && videoHeight2 > 0) {
                hi.d7 d7Var2 = saVar.L1;
                d7Var2.k0 = videoWidth2;
                d7Var2.l0 = videoHeight2;
                d7Var2.A();
            }
        }
        saVar.l0(true);
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

    @Override // org.telegram.ui.Components.gt0
    public /* synthetic */ void s(RecyclerView recyclerView) {
        org.telegram.ui.Cells.y0.b(recyclerView);
    }

    @Override // org.telegram.ui.Components.hj0
    public /* synthetic */ void r0(View view, float f10, float f11) {
    }
}
