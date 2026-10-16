package org.telegram.ui;

import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final /* synthetic */ class i21 implements org.telegram.ui.Components.am0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ i21(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.ui.Components.am0
    public final void a(int i10, View view) {
        org.telegram.ui.Components.kr0 kr0Var;
        float f7;
        s4.b1 K;
        int i11 = 0;
        int i12 = 1;
        switch (this.a) {
            case 0:
                ProxyListActivity.U((ProxyListActivity) this.b, view, i10);
                return;
            case 1:
                k31 k31Var = (k31) this.b;
                org.telegram.ui.Components.mm0 mm0Var = k31Var.y;
                org.telegram.ui.Components.xp xpVar = k31Var.b;
                if (xpVar.d.get(i10) == k31Var.K || k31Var.O != null) {
                    return;
                }
                k31Var.Q = false;
                k31Var.K = (org.telegram.ui.Components.yp) xpVar.d.get(i10);
                xpVar.E(i10);
                k31Var.h.postDelayed(new org.telegram.ui.Components.o8(k31Var, i10, 27), 100L);
                while (i11 < mm0Var.getChildCount()) {
                    org.telegram.ui.Components.w21 w21Var = (org.telegram.ui.Components.w21) mm0Var.getChildAt(i11);
                    if (w21Var != view && (kr0Var = w21Var.J) != null) {
                        AndroidUtilities.cancelRunOnUIThread(kr0Var);
                        w21Var.J.run();
                    }
                    i11++;
                }
                if (!((org.telegram.ui.Components.yp) xpVar.d.get(i10)).a.a) {
                    ((org.telegram.ui.Components.w21) view).d();
                }
                w21 w21Var2 = k31Var.J;
                if (w21Var2 != null) {
                    w21Var2.a.c0(i10, k31Var.K.a, true);
                    return;
                }
                return;
            case 2:
                s31.U((s31) this.b, view);
                return;
            case 3:
                l41.U((l41) this.b, view, i10);
                return;
            case 4:
                t41 t41Var = (t41) this.b;
                si.a aVar = si.e.d;
                if (i10 == 1) {
                    aVar.a();
                    boolean z10 = !aVar.d;
                    synchronized (aVar) {
                        aVar.d = z10;
                        aVar.c = true;
                        aVar.b = true;
                        si.d.a.edit().putBoolean("round_video_camera2_enabled", z10).apply();
                    }
                    t41Var.b.l();
                    return;
                }
                aVar.a();
                if (!aVar.d) {
                    return;
                }
                if (i10 == 2) {
                    t41Var.V(R.string.RoundVideoOutputResolution, new CharSequence[]{"480p", "360p"}, new ps0(6));
                    return;
                }
                if (i10 == 3) {
                    t41Var.V(R.string.RoundVideoCameraResolution, new CharSequence[]{LocaleController.getString(R.string.RoundVideoCameraResolutionHigh), LocaleController.getString(R.string.RoundVideoCameraResolutionMedium), LocaleController.getString(R.string.RoundVideoCameraResolutionLow)}, new ps0(7));
                    return;
                }
                if (i10 == 4) {
                    t41Var.V(R.string.RoundVideoFrameRate, new CharSequence[]{"30 FPS", "60 FPS"}, new ps0(8));
                    return;
                }
                if (i10 != 5) {
                    if (i10 == 8) {
                        si.a aVar2 = si.e.i;
                        aVar2.a();
                        aVar2.b(!aVar2.d);
                        t41Var.b.m(i10);
                        return;
                    }
                    return;
                }
                CharSequence[] charSequenceArr = new CharSequence[4];
                while (true) {
                    int[] iArr = t41.c;
                    if (i11 >= 3) {
                        t41Var.V(R.string.RoundVideoBitrate, charSequenceArr, new ps0(9));
                        return;
                    } else {
                        charSequenceArr[i11] = t41.U(iArr[i11]);
                        i11++;
                    }
                }
            case 5:
                b81 b81Var = (b81) this.b;
                org.telegram.ui.Components.m61 G = b81Var.i0.G(i10 - 1);
                if (G == null) {
                    return;
                }
                Object obj = G.G;
                if ((obj instanceof TLRPC.User) || (obj instanceof TLRPC.Chat)) {
                    ((org.telegram.ui.Cells.i6) view).t(true, true);
                    b81Var.a0 = (TLObject) G.G;
                    b81Var.V(true);
                    b81Var.i0.N(true);
                    return;
                }
                return;
            case 6:
                ((e81) this.b).R(i10, view);
                return;
            case 7:
                SessionsActivity.U((SessionsActivity) this.b, i10);
                return;
            case 8:
                hb1 hb1Var = (hb1) this.b;
                ArrayList arrayList = hb1Var.N;
                ArrayList arrayList2 = hb1Var.O;
                ma1 ma1Var = hb1Var.X;
                int i13 = ma1Var.I;
                if (i10 >= i13 && i10 <= ma1Var.J) {
                    eb1 eb1Var = (eb1) hb1Var.v0.get(i10 - i13);
                    pj0 pj0Var = new pj0(eb1Var.b, true, hb1Var.b);
                    pj0Var.e0 = eb1Var;
                    hb1Var.presentFragment(pj0Var);
                    return;
                }
                int i14 = ma1Var.U;
                if (i10 >= i14 && i10 <= ma1Var.V) {
                    ((ab1) hb1Var.Q.get(i10 - i14)).b(hb1Var);
                    return;
                }
                int i15 = ma1Var.R;
                if (i10 >= i15 && i10 <= ma1Var.S) {
                    ((ab1) arrayList2.get(i10 - i15)).b(hb1Var);
                    return;
                }
                int i16 = ma1Var.X;
                if (i10 >= i16 && i10 <= ma1Var.Y) {
                    ((ab1) hb1Var.P.get(i10 - i16)).b(hb1Var);
                    return;
                }
                if (i10 == ma1Var.Z) {
                    int size = arrayList.size() - arrayList2.size();
                    int i17 = hb1Var.X.Z;
                    arrayList2.clear();
                    arrayList2.addAll(arrayList);
                    ma1 ma1Var2 = hb1Var.X;
                    if (ma1Var2 != null) {
                        ma1Var2.E();
                        hb1Var.S.setItemAnimator(hb1Var.Y);
                        hb1Var.X.s(i17 + 1, size);
                        hb1Var.X.u(i17);
                        return;
                    }
                    return;
                }
                return;
            case 9:
                ce1 ce1Var = (ce1) this.b;
                boolean z11 = ce1Var.W0 != null;
                ce1Var.Z0(i10);
                if (z11 == (ce1Var.W0 == null)) {
                    ce1Var.M0();
                    ce1Var.l1();
                }
                ce1Var.n1();
                ce1Var.J0[1].a(ce1Var.W0 != null, true);
                ce1Var.P0.f1();
                int left = view.getLeft();
                int right = view.getRight();
                int dp = AndroidUtilities.dp(52.0f);
                int i18 = left - dp;
                if (i18 < 0) {
                    ce1Var.P0.v0(i18, 0, null);
                    return;
                }
                int i19 = right + dp;
                if (i19 > ce1Var.P0.getMeasuredWidth()) {
                    kc1 kc1Var = ce1Var.P0;
                    kc1Var.v0(i19 - kc1Var.getMeasuredWidth(), 0, null);
                    return;
                }
                return;
            case 10:
                ze1 ze1Var = (ze1) this.b;
                int i20 = ze1Var.H;
                HashSet hashSet = ze1Var.w;
                if (view instanceof org.telegram.ui.Cells.g4) {
                    org.telegram.ui.Cells.g4 g4Var = (org.telegram.ui.Cells.g4) view;
                    TLRPC.Chat chat = (TLRPC.Chat) g4Var.getObject();
                    if (hashSet.contains(Long.valueOf(chat.id))) {
                        hashSet.remove(Long.valueOf(chat.id));
                        g4Var.c(false, true);
                    } else {
                        hashSet.add(Long.valueOf(chat.id));
                        g4Var.c(true, true);
                    }
                    if (hashSet.isEmpty() && ze1Var.v != -1 && ze1Var.n.getVisibility() == 0) {
                        ze1Var.v = -1;
                        ze1Var.n.animate().setListener(null).cancel();
                        ze1Var.n.animate().translationY(i20).setDuration(200L).setListener(new ve1(ze1Var, i11)).start();
                        org.telegram.ui.Components.mm0 mm0Var2 = ze1Var.s.getVisibility() == 0 ? ze1Var.b : ze1Var.a;
                        mm0Var2.d1(false);
                        int N0 = ((s4.b0) mm0Var2.getLayoutManager()).N0();
                        f7 = 12.0f;
                        if ((N0 == mm0Var2.getAdapter().h() - 1 || (N0 == mm0Var2.getAdapter().h() - 2 && mm0Var2 == ze1Var.a)) && (K = mm0Var2.K(N0)) != null) {
                            int bottom = K.a.getBottom();
                            if (N0 == ze1Var.d.c - 2) {
                                bottom += AndroidUtilities.dp(12.0f);
                            }
                            if (mm0Var2.getMeasuredHeight() - bottom <= i20) {
                                mm0Var2.setTranslationY(-(mm0Var2.getMeasuredHeight() - bottom));
                                mm0Var2.animate().translationY(0.0f).setDuration(200L).start();
                            }
                        }
                        ze1Var.a.setPadding(0, 0, 0, 0);
                        ze1Var.b.setPadding(0, 0, 0, 0);
                    } else {
                        f7 = 12.0f;
                    }
                    if (!hashSet.isEmpty() && ze1Var.n.getVisibility() == 8 && ze1Var.v != 1) {
                        ze1Var.v = 1;
                        ze1Var.n.setVisibility(0);
                        ze1Var.n.setTranslationY(i20);
                        ze1Var.n.animate().setListener(null).cancel();
                        ze1Var.n.animate().translationY(0.0f).setDuration(200L).setListener(new ve1(ze1Var, i12)).start();
                        ze1Var.a.setPadding(0, 0, 0, i20 - AndroidUtilities.dp(f7));
                        ze1Var.b.setPadding(0, 0, 0, i20);
                    }
                    if (!hashSet.isEmpty()) {
                        ze1Var.c.setText(LocaleController.formatString("LeaveChats", R.string.LeaveChats, LocaleController.formatPluralString("Chats", hashSet.size(), new Object[0])));
                    }
                    if (hashSet.isEmpty()) {
                        return;
                    }
                    org.telegram.ui.Components.mm0 mm0Var3 = ze1Var.s.getVisibility() == 0 ? ze1Var.b : ze1Var.a;
                    int height = mm0Var3.getHeight() - view.getBottom();
                    if (height < i20) {
                        mm0Var3.v0(0, i20 - height, null);
                        return;
                    }
                    return;
                }
                return;
            case 11:
                kg1.V((kg1) this.b, view);
                return;
            case 12:
                kg1 kg1Var = ((gg1) this.b).t0;
                if (view instanceof org.telegram.ui.Cells.qa) {
                    og.d.m(kg1Var, kg1Var.a, ((org.telegram.ui.Cells.qa) view).getTopic(), 0);
                    return;
                } else {
                    if (view instanceof hg1) {
                        hg1 hg1Var = (hg1) view;
                        og.d.m(kg1Var, kg1Var.a, hg1Var.N, hg1Var.getMessageId());
                        return;
                    }
                    return;
                }
            case 13:
                TwoStepVerificationActivity.c0((TwoStepVerificationActivity) this.b, i10);
                return;
            case 14:
                WallpapersListActivity.V((WallpapersListActivity) this.b, i10);
                return;
            default:
                rj1 rj1Var = (rj1) this.b;
                rj1Var.getClass();
                String string = LocaleController.getString(R.string.BackgroundSearchColor);
                StringBuilder i21 = t8.b.i(string, " ");
                String[] strArr = WallpapersListActivity.n0;
                i21.append(LocaleController.getString(strArr[i10], WallpapersListActivity.o0[i10]));
                SpannableString spannableString = new SpannableString(i21.toString());
                spannableString.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.B8, false)), string.length(), spannableString.length(), 33);
                WallpapersListActivity wallpapersListActivity = rj1Var.E;
                wallpapersListActivity.L.setSearchFieldCaption(spannableString);
                wallpapersListActivity.L.setSearchFieldHint(null);
                wallpapersListActivity.L.H("", true);
                rj1Var.n = strArr[i10];
                rj1Var.E("", true);
                return;
        }
    }
}
