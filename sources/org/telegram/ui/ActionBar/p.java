package org.telegram.ui.ActionBar;

import android.animation.AnimatorSet;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.View;
import bi.u7;
import c8.ha;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.hd;
import org.telegram.messenger.p10;
import org.telegram.messenger.t10;
import org.telegram.messenger.w7;
import org.telegram.messenger.zr;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.dz0;
import org.telegram.ui.Components.hc;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.lg0;
import org.telegram.ui.Components.lz;
import org.telegram.ui.Components.q41;
import org.telegram.ui.Components.uo;
import org.telegram.ui.Components.xq;
import org.telegram.ui.an;
import org.telegram.ui.bd;
import org.telegram.ui.c51;
import org.telegram.ui.e60;
import org.telegram.ui.e61;
import org.telegram.ui.f9;
import org.telegram.ui.j9;
import org.telegram.ui.la;
import org.telegram.ui.mb;
import org.telegram.ui.nc;
import org.telegram.ui.oc;
import org.telegram.ui.pc;
import org.telegram.ui.r9;
import org.telegram.ui.rc;
import org.telegram.ui.s9;
import org.telegram.ui.tb;
import org.telegram.ui.uc;
import org.telegram.ui.va;
import org.telegram.ui.w8;
import org.telegram.ui.y6;
import org.telegram.ui.zd;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final /* synthetic */ class p implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ p(int i7, Object obj, Object obj2) {
        this.a = i7;
        this.c = obj;
        this.b = obj2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:260:0x05d5, code lost:
    
        r12 = new java.util.ArrayList();
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00d9, code lost:
    
        if (r15.text.equals("CHANNELS_ADMIN_PUBLIC_TOO_MUCH") == false) goto L50;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x030b  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i7;
        l41 l41Var;
        dz0 dz0Var;
        int i10 = this.a;
        int i11 = 2;
        int i12 = -1;
        ArrayList arrayList = null;
        Bitmap bitmap = null;
        boolean z9 = false;
        boolean z10 = false;
        boolean z11 = false;
        int i13 = 1;
        Object obj = this.b;
        Object obj2 = this.c;
        switch (i10) {
            case 0:
                ActionBarLayout actionBarLayout = (ActionBarLayout) obj2;
                Drawable drawable = ActionBarLayout.v1;
                actionBarLayout.e0((f2) obj, false);
                actionBarLayout.setVisibility(8);
                View view = actionBarLayout.H0;
                if (view != null) {
                    view.setVisibility(8);
                    break;
                }
                break;
            case 1:
                f2 f2Var = (f2) obj;
                f2 f2Var2 = (f2) obj2;
                Drawable drawable2 = ActionBarLayout.v1;
                if (f2Var != null) {
                    f2Var.onTransitionAnimationEnd(false, false);
                }
                f2Var2.onTransitionAnimationEnd(true, false);
                f2Var2.onBecomeFullyVisible();
                break;
            case 2:
                e6 e6Var = (e6) obj2;
                ArrayList arrayList2 = (ArrayList) obj;
                int size = arrayList2.size();
                int i14 = 0;
                while (i14 < size) {
                    h6 h6Var = (h6) arrayList2.get(i14);
                    File e10 = h6Var.e();
                    if (e10 != null && e10.length() > 0) {
                        arrayList2.remove(i14);
                        i14--;
                        size--;
                        i14++;
                    }
                    if (!arrayList.contains(h6Var.o)) {
                        arrayList.add(h6Var.o);
                    }
                    i14++;
                }
                if (arrayList != null) {
                    TL_account.getMultiWallPapers getmultiwallpapers = new TL_account.getMultiWallPapers();
                    int size2 = arrayList.size();
                    for (int i15 = 0; i15 < size2; i15++) {
                        TLRPC.TL_inputWallPaperSlug tL_inputWallPaperSlug = new TLRPC.TL_inputWallPaperSlug();
                        tL_inputWallPaperSlug.slug = (String) arrayList.get(i15);
                        getmultiwallpapers.wallpapers.add(tL_inputWallPaperSlug);
                    }
                    ConnectionsManager.getInstance(e6Var.a).sendRequest(getmultiwallpapers, new bi.j(26, e6Var, arrayList2));
                    break;
                }
                break;
            case 3:
                e6 e6Var2 = (e6) obj2;
                d6 d6Var = (d6) obj;
                TLRPC.TL_wallPaper tL_wallPaper = d6Var.a;
                w7.G(p10.s0);
                File J = w7.J(tL_wallPaper.document, null, true, true);
                ArrayList arrayList3 = d6Var.b;
                int size3 = arrayList3.size();
                ArrayList arrayList4 = null;
                for (int i16 = 0; i16 < size3; i16++) {
                    h6 h6Var2 = (h6) arrayList3.get(i16);
                    if (h6Var2.o.equals(tL_wallPaper.slug)) {
                        Bitmap b10 = e6.b(bitmap, "application/x-tgwallpattern".equals(tL_wallPaper.document.mime_type), J, h6Var2);
                        if (arrayList4 == null) {
                            arrayList4 = new ArrayList();
                            arrayList4.add(h6Var2);
                        }
                        bitmap = b10;
                    }
                }
                if (bitmap != null) {
                    bitmap.recycle();
                }
                org.telegram.messenger.g0.h3(new u7((Object) e6Var2, (Object) arrayList4, false, 13));
                break;
            case 4:
                j6 j6Var = (j6) obj2;
                j6Var.d((File) obj, j6Var.h0);
                org.telegram.messenger.g0.h3(new i6(j6Var, 0));
                break;
            case 5:
                ((org.telegram.ui.o) obj2).c0((TLRPC.TL_messages_archivedStickers) obj);
                break;
            case 6:
                org.telegram.ui.g4 g4Var = (org.telegram.ui.g4) obj2;
                vf.b bVar = (vf.b) obj;
                org.telegram.ui.t3 t3Var = g4Var.K;
                if (t3Var != null) {
                    t3Var.a(true);
                }
                if (g4Var.N0 == bVar) {
                    g4Var.N0 = null;
                    break;
                }
                break;
            case 7:
                ((org.telegram.ui.g4) obj2).S0.d();
                ((AnimatorSet) obj).start();
                break;
            case 8:
                org.telegram.ui.e2.a((org.telegram.ui.e2) obj2, (SpannableString) obj);
                break;
            case 9:
                ArrayList arrayList5 = (ArrayList) obj;
                org.telegram.ui.p4 p4Var = (org.telegram.ui.p4) ((org.telegram.ui.m4) obj2).b;
                if (!arrayList5.isEmpty()) {
                    for (int i17 = 0; i17 < arrayList5.size(); i17++) {
                        p4Var.getMessagesController().I4(p4Var.Z() * 60, ((Long) arrayList5.get(i17)).longValue());
                    }
                    if (p4Var.Z() > 0) {
                        org.telegram.messenger.camera.q.s(hd.a0("AutodeleteTimerEnabledForChats", null, 2131753778, hd.c0(p4Var.Z() * 60), hd.G(arrayList5.size(), "Chats", Integer.valueOf(arrayList5.size()))), hc.a0(p4Var), R.raw.fire_on, 36);
                        break;
                    } else {
                        hc.a0(p4Var).Q(R.raw.fire_off, 36, hd.a0("AutodeleteTimerDisabledForChats", null, 2131753779, hd.G(arrayList5.size(), "Chats", Integer.valueOf(arrayList5.size())))).j();
                        break;
                    }
                }
                break;
            case 10:
                org.telegram.ui.t5 t5Var = (org.telegram.ui.t5) obj2;
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                t5Var.T = tL_premium_boostsStatus;
                if (tL_premium_boostsStatus != null) {
                    t5Var.getMessagesController().G0().b(t5Var.R, t5Var.T, new org.telegram.ui.l5(t5Var, z10 ? 1 : 0));
                }
                t5Var.h0.animate().cancel();
                t5Var.h0.animate().alpha(0.0f).setDuration(100L).setStartDelay(0L).setListener(new m.a(t5Var, 17));
                t5Var.I0(true);
                t5Var.J0(true);
                t5Var.H0(null);
                break;
            case 11:
                org.telegram.ui.x5 x5Var = (org.telegram.ui.x5) obj2;
                org.telegram.messenger.s2 s2Var = (org.telegram.messenger.s2) obj;
                ArrayList arrayList6 = x5Var.c;
                int i18 = 0;
                while (true) {
                    if (i18 >= arrayList6.size()) {
                        i7 = 0;
                    } else if (((org.telegram.ui.w5) arrayList6.get(i18)).c == null || ((org.telegram.ui.w5) arrayList6.get(i18)).c.a != s2Var.a) {
                        i18++;
                    } else {
                        i7 = i18;
                    }
                }
                v4.d1 K = x5Var.b.K(i7);
                if (K != null) {
                    View view2 = K.a;
                    e60 e60Var = new e60(x5Var.getParentActivity(), x5Var);
                    e60Var.h(true);
                    e60Var.setParentWindow(org.telegram.ui.Components.v4.N(x5Var, e60Var, view2, view2.getMeasuredWidth() / 2.0f, view2.getMeasuredHeight() / 2.0f));
                    e60Var.setCallback(new org.telegram.ui.u5(x5Var, s2Var, i13));
                    break;
                }
                break;
            case 12:
                y6.c0((y6) obj2, (u1) obj);
                break;
            case 13:
                lg0 lg0Var = new lg0((Context) obj2, hd.M0(2131749169, null), ((String[]) obj)[0], hd.M0(2131746508, null), false);
                lg0Var.I0();
                lg0Var.show();
                break;
            case 14:
                ((w8) obj2).b.i0(((TLRPC.Message) jg.g.i(1, ((f9) obj).c)).id, 100);
                break;
            case 15:
                s9 s9Var = (s9) obj2;
                String str = (String) obj;
                r9 r9Var = s9Var.M;
                if (r9Var != null) {
                    r9Var.M(str);
                }
                if (s9Var.W != 3) {
                    s9Var.finishFragment();
                    break;
                }
                break;
            case 16:
                s9 s9Var2 = (s9) obj2;
                zr zrVar = (zr) obj;
                s9Var2.h.setText(zrVar.p);
                s9Var2.h.animate().setDuration(200L).alpha(1.0f).setInterpolator(xq.f).start();
                r9 r9Var2 = s9Var2.M;
                if (r9Var2 != null) {
                    r9Var2.V0(zrVar);
                }
                org.telegram.messenger.g0.i3(new j9(s9Var2, 3), 1200L);
                break;
            case 17:
                s9 s9Var3 = (s9) obj2;
                h6.m mVar = (h6.m) obj;
                RectF rectF = (RectF) mVar.c;
                PointF[] pointFArr = (PointF[]) mVar.d;
                RectF rectF2 = s9Var3.J;
                PointF[] pointFArr2 = s9Var3.F;
                RectF rectF3 = s9Var3.K;
                PointF[] pointFArr3 = s9Var3.G;
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long j3 = s9Var3.L;
                if (j3 == 0) {
                    s9Var3.L = elapsedRealtime - 75;
                    rectF3.set(rectF);
                    rectF2.set(rectF);
                    if (pointFArr == null) {
                        s9.i0(rectF, pointFArr2);
                        s9.i0(rectF, pointFArr3);
                    } else {
                        for (int i19 = 0; i19 < 4; i19++) {
                            PointF pointF = pointFArr2[i19];
                            PointF pointF2 = pointFArr[i19];
                            pointF.set(pointF2.x, pointF2.y);
                            PointF pointF3 = pointFArr3[i19];
                            PointF pointF4 = pointFArr[i19];
                            pointF3.set(pointF4.x, pointF4.y);
                        }
                    }
                } else {
                    if (rectF2 != null) {
                        long j10 = elapsedRealtime - j3;
                        if (j10 < 75) {
                            float min = Math.min(1.0f, Math.max(0.0f, j10 / 75.0f));
                            org.telegram.messenger.g0.Z1(rectF2, rectF3, min, rectF2);
                            for (int i20 = 0; i20 < 4; i20++) {
                                PointF pointF5 = pointFArr2[i20];
                                pointF5.set(org.telegram.messenger.g0.T1(pointF5.x, pointFArr3[i20].x, min), org.telegram.messenger.g0.T1(pointFArr2[i20].y, pointFArr3[i20].y, min));
                            }
                            rectF3.set(rectF);
                            if (pointFArr != null) {
                                s9.i0(rectF3, pointFArr3);
                            } else {
                                for (int i21 = 0; i21 < 4; i21++) {
                                    PointF pointF6 = pointFArr3[i21];
                                    PointF pointF7 = pointFArr[i21];
                                    pointF6.set(pointF7.x, pointF7.y);
                                }
                            }
                            s9Var3.L = elapsedRealtime;
                        }
                    }
                    rectF2.set(rectF3);
                    for (int i22 = 0; i22 < 4; i22++) {
                        PointF pointF8 = pointFArr2[i22];
                        PointF pointF9 = pointFArr3[i22];
                        pointF8.set(pointF9.x, pointF9.y);
                    }
                    rectF3.set(rectF);
                    if (pointFArr != null) {
                    }
                    s9Var3.L = elapsedRealtime;
                }
                s9Var3.fragmentView.invalidate();
                break;
            case 18:
                la.b0((la) obj2, (String) obj);
                break;
            case 19:
                mb mbVar = (mb) obj2;
                hc.a0(mbVar).Q(R.raw.ic_ban, 36, org.telegram.messenger.g0.X2(hd.a0(null, null, 2131746058, t10.j((TLRPC.User) obj, true)))).k(false);
                mbVar.a1();
                break;
            case 20:
                mb mbVar2 = (mb) obj2;
                TLObject tLObject = (TLObject) obj;
                if (tLObject instanceof TLRPC.TL_boolTrue) {
                    org.telegram.messenger.k5.o(null, 2131752466, hc.a0(mbVar2), R.raw.msg_antispam, 36);
                    break;
                } else {
                    org.telegram.messenger.k5.o(null, 2131743880, tLObject instanceof TLRPC.TL_boolFalse ? hc.a0(mbVar2) : hc.a0(mbVar2), R.raw.error, 36);
                    break;
                }
            case 21:
                tb tbVar = (tb) obj2;
                tbVar.d = (TL_stories.TL_premium_boostsStatus) obj;
                tbVar.H.animate().cancel();
                tbVar.H.animate().alpha(0.0f).setDuration(100L).setStartDelay(0L).setListener(new va(tbVar, i11));
                tbVar.d(true);
                tbVar.c(null);
                break;
            case 22:
                rc rcVar = (rc) obj2;
                rcVar.getClass();
                rcVar.presentFragment(c51.g0((TLRPC.Chat) obj, true));
                break;
            case 23:
                List list = (List) obj;
                pc pcVar = ((oc) obj2).b;
                int i23 = pcVar.a;
                e61 e61Var = pcVar.d;
                ArrayList arrayList7 = pcVar.c;
                if (list != null && !list.isEmpty()) {
                    pcVar.n = true;
                    arrayList7.clear();
                    arrayList7.add(0, new uo((r3) list.get(0)));
                    if (pcVar.w != null && pcVar.f) {
                        arrayList7.add(0, new uo(r3.a(i23)));
                    }
                    f6 f6Var = pcVar.b;
                    int a10 = f6Var != null ? f6Var.a() : k6.I.q();
                    for (int i24 = 1; i24 < list.size(); i24++) {
                        r3 r3Var = (r3) list.get(i24);
                        uo uoVar = new uo(r3Var);
                        r3Var.m(i23);
                        uoVar.c = a10;
                        arrayList7.add(uoVar);
                    }
                    for (int i25 = 0; i25 < arrayList7.size(); i25++) {
                        uo uoVar2 = (uo) arrayList7.get(i25);
                        boolean z12 = TextUtils.equals(pcVar.s, uoVar2.a()) || (TextUtils.isEmpty(pcVar.s) && uoVar2.a.a);
                        uoVar2.d = z12;
                        if (z12) {
                            i12 = i25;
                        }
                    }
                    nc ncVar = pcVar.h;
                    if (ncVar != null) {
                        ncVar.f();
                    }
                    e61Var.animate().alpha(1.0f).setDuration(150L).start();
                    lz lzVar = pcVar.e;
                    if (pcVar.n) {
                        org.telegram.messenger.g0.Z3(lzVar, false, 1.0f, true, true);
                    } else {
                        org.telegram.messenger.g0.Z3(lzVar, true, 1.0f, true, true);
                    }
                    if (i12 >= 0 && (e61Var.getLayoutManager() instanceof v4.b0)) {
                        ((v4.b0) e61Var.getLayoutManager()).h1(i12, (org.telegram.messenger.g0.q.x - org.telegram.messenger.g0.L(83.0f)) / 2);
                        break;
                    }
                }
                break;
            case 24:
                bd bdVar = (bd) obj2;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                if (tL_error != null) {
                    bdVar.getClass();
                    break;
                }
                z9 = true;
                bdVar.k0 = z9;
                break;
            case 25:
                bd.b0((bd) obj2, (String) obj);
                break;
            case 26:
                bd bdVar2 = (bd) obj2;
                TLObject tLObject2 = (TLObject) obj;
                ArrayList arrayList8 = bdVar2.g0;
                bdVar2.e0 = false;
                if (tLObject2 != null && bdVar2.getParentActivity() != null) {
                    for (int i26 = 0; i26 < arrayList8.size(); i26++) {
                        bdVar2.L.removeView((View) arrayList8.get(i26));
                    }
                    arrayList8.clear();
                    TLRPC.TL_messages_chats tL_messages_chats = (TLRPC.TL_messages_chats) tLObject2;
                    int i27 = 0;
                    while (i27 < tL_messages_chats.chats.size()) {
                        org.telegram.ui.Cells.n nVar = new org.telegram.ui.Cells.n(bdVar2.getParentActivity(), new uc(bdVar2, z11 ? 1 : 0), false, 0);
                        nVar.a(tL_messages_chats.chats.get(i27), i27 == tL_messages_chats.chats.size() - 1);
                        arrayList8.add(nVar);
                        bdVar2.M.addView(nVar, ha.o(-1, 72));
                        i27++;
                    }
                    bdVar2.n0();
                    break;
                }
                break;
            case 27:
                zd zdVar = (zd) obj2;
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus2 = (TL_stories.TL_premium_boostsStatus) obj;
                zdVar.q0 = tL_premium_boostsStatus2;
                if (tL_premium_boostsStatus2 != null) {
                    zdVar.r0 = tL_premium_boostsStatus2.level;
                }
                q41 q41Var = zdVar.X0;
                if (q41Var != null && (l41Var = q41Var.f3) != null) {
                    l41Var.O(true);
                    break;
                }
                break;
            case 28:
                ((zd) obj2).D((TLRPC.TL_payments_starsRevenueStats) obj);
                break;
            default:
                an anVar = (an) obj2;
                dz0[] dz0VarArr = (dz0[]) obj;
                if (!anVar.Kb && (dz0Var = dz0VarArr[0]) != null) {
                    dz0VarArr[0] = null;
                    if (anVar.x0 == dz0Var) {
                        anVar.x0 = null;
                    }
                    org.telegram.messenger.g0.E2(dz0Var);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ p(f2 f2Var, f2 f2Var2) {
        this.a = 1;
        this.b = f2Var;
        this.c = f2Var2;
    }
}
