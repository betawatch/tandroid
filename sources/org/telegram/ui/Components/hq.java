package org.telegram.ui.Components;

import android.app.Activity;
import android.content.SharedPreferences;
import android.os.SystemClock;
import android.text.style.ClickableSpan;
import android.util.SparseIntArray;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.EmojiData;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final /* synthetic */ class hq implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ hq(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        VideoEditedInfo videoEditedInfo;
        float f7;
        int i10;
        o1.k kVar;
        int i11 = this.a;
        Integer num = null;
        Object obj = this.b;
        switch (i11) {
            case 0:
                ((mq) obj).dismiss();
                break;
            case 1:
                ((br) obj).a();
                break;
            case 2:
                ((org.telegram.ui.ActionBar.f3) obj).dismiss();
                org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                if (U != null) {
                    U.presentFragment(new PremiumPreviewFragment(0, "create_bot"));
                    break;
                }
                break;
            case 3:
                rr rrVar = ((pr) obj).c;
                TLRPC.Peer peer = rrVar.d0;
                org.telegram.ui.ActionBar.n2 n2Var = rrVar.f0;
                xr xrVar = new xr(n2Var, peer, rrVar.g0, rrVar.Y.size() > 1, rrVar.X);
                if (n2Var.getParentActivity() != null) {
                    n2Var.showDialog(xrVar);
                    break;
                } else {
                    xrVar.show();
                    break;
                }
            case 4:
                ((ei.d) obj).setLoading(true);
                break;
            case 5:
                ss ssVar = (ss) obj;
                ssVar.a.a(!r0.f, true);
                AndroidUtilities.runOnUIThread(ssVar.f, 3000L);
                break;
            case 6:
                ((qo0) obj).V(false);
                break;
            case 7:
                ((vt) obj).a();
                break;
            case 8:
                ((ViewTreeObserver.OnPreDrawListener) obj).onPreDraw();
                break;
            case 9:
                ((ru) obj).getClass();
                break;
            case 10:
                pf.d.r(((xu) obj).a.getContext(), "https://play.google.com/store/apps/details?id=com.google.android.webview");
                break;
            case 11:
                cv cvVar = ((bv) obj).a;
                cvVar.n.setVisibility(4);
                cvVar.h.setVisibility(4);
                ImageView imageView = cvVar.x;
                imageView.setEnabled(true);
                imageView.setAlpha(1.0f);
                break;
            case 12:
                ((vv) obj).a(true, true);
                break;
            case 13:
                px pxVar = (px) obj;
                if (pxVar.Y.getEmojiView() != null) {
                    tz emojiView = pxVar.Y.getEmojiView();
                    if (!emojiView.f0) {
                        try {
                            int i12 = emojiView.R.s.get(EmojiData.dataColored.length);
                            if (i12 > 0) {
                                emojiView.P.B0();
                                emojiView.U(i12);
                                emojiView.G(i12, AndroidUtilities.dp(-9.0f));
                                emojiView.n(0, null);
                                break;
                            }
                        } catch (Exception unused) {
                            return;
                        }
                    }
                }
                break;
            case 14:
                jy jyVar = (jy) obj;
                jyVar.s.f = true;
                jyVar.a(true);
                break;
            case 15:
                AndroidUtilities.updateViewShow(((gz) obj).h, true);
                break;
            case 16:
                mz mzVar = (mz) obj;
                ArrayList arrayList = mzVar.r;
                ArrayList arrayList2 = mzVar.h;
                oz ozVar = mzVar.w;
                int i13 = ozVar.M;
                tz tzVar = ozVar.Q;
                ax axVar = tzVar.D0;
                if (i13 == mzVar.b) {
                    arrayList2.remove(arrayList);
                    ozVar.E = mzVar.c;
                    ozVar.F = mzVar.d;
                    ozVar.G = mzVar.e;
                    ozVar.H = mzVar.f;
                    ozVar.I = arrayList2;
                    ozVar.J = mzVar.n;
                    ozVar.K = new ArrayList(arrayList);
                    tzVar.G0.e(false);
                    s4.g0 adapter = axVar.getAdapter();
                    oz ozVar2 = tzVar.z0;
                    if (adapter != ozVar2) {
                        axVar.setAdapter(ozVar2);
                    }
                    ozVar.l();
                    break;
                }
                break;
            case 17:
                s00 s00Var = ((r00) obj).e;
                ArrayList arrayList3 = s00Var.h;
                if (!UserConfig.getInstance(UserConfig.selectedAccount).isPremium()) {
                    int i14 = 0;
                    while (i14 < arrayList3.size()) {
                        if (((p00) arrayList3.get(i14)).e && i14 != 0) {
                            o00 o00Var = s00Var.I;
                            s00 s00Var2 = o00Var.d;
                            ArrayList arrayList4 = s00Var2.h;
                            SparseIntArray sparseIntArray = s00Var2.k0;
                            int size = arrayList4.size();
                            if (i14 >= 0 && i14 < size) {
                                ArrayList<MessagesController.DialogFilter> dialogFilters = MessagesController.getInstance(UserConfig.selectedAccount).getDialogFilters();
                                int i15 = sparseIntArray.get(i14);
                                int i16 = ((p00) arrayList4.get(i14)).a;
                                for (int i17 = i14 - 1; i17 >= 0; i17--) {
                                    sparseIntArray.put(i17 + 1, sparseIntArray.get(i17));
                                }
                                MessagesController.DialogFilter remove = dialogFilters.remove(i14);
                                remove.order = 0;
                                dialogFilters.add(0, remove);
                                sparseIntArray.put(0, i15);
                                arrayList4.add(0, (p00) arrayList4.remove(i14));
                                ((p00) arrayList4.get(0)).a = i16;
                                for (int i18 = 0; i18 <= i14; i18++) {
                                    ((p00) arrayList4.get(i18)).a = i18;
                                    dialogFilters.get(i18).order = i18;
                                }
                                int i19 = 0;
                                while (i19 <= i14) {
                                    if (s00Var2.K == i19) {
                                        int i20 = i19 == i14 ? 0 : i19 + 1;
                                        s00Var2.L = i20;
                                        s00Var2.K = i20;
                                    }
                                    if (s00Var2.q0 == i19) {
                                        int i21 = i19 == i14 ? 0 : i19 + 1;
                                        s00Var2.r0 = i21;
                                        s00Var2.q0 = i21;
                                    }
                                    i19++;
                                }
                                o00Var.p(i14, 0);
                                n00 n00Var = s00Var2.J;
                                int i22 = ((p00) arrayList4.get(i14)).a;
                                org.telegram.ui.dw dwVar = (org.telegram.ui.dw) n00Var;
                                int i23 = 0;
                                while (true) {
                                    org.telegram.ui.dy[] dyVarArr = dwVar.b.e0;
                                    if (i23 < dyVarArr.length) {
                                        org.telegram.ui.dy dyVar = dyVarArr[i23];
                                        int i24 = dyVar.h;
                                        if (i24 == i22) {
                                            dyVar.h = i16;
                                        } else if (i24 == i16) {
                                            dyVar.h = i22;
                                        }
                                        i23++;
                                    } else {
                                        s00Var2.j();
                                        s00Var2.y = true;
                                        s00Var2.F.setItemAnimator(s00Var2.s0);
                                    }
                                }
                            }
                            s00Var.F.u0(0);
                            org.telegram.ui.cw cwVar = (org.telegram.ui.cw) s00Var;
                            org.telegram.ui.ey eyVar = cwVar.B0;
                            if (!eyVar.getMessagesController().premiumFeaturesBlocked()) {
                                try {
                                    cwVar.performHapticFeedback(3, 1);
                                } catch (Exception unused2) {
                                }
                                qc I = xc.a0(eyVar).I(R.raw.filter_reorder, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.LimitReachedReorderFolder, LocaleController.getString(R.string.FilterAllChats))), LocaleController.getString(R.string.PremiumMore), 5000, false, new org.telegram.ui.vi(cwVar, 23));
                                I.k(true);
                                eyVar.o3 = I;
                                break;
                            }
                        } else {
                            i14++;
                        }
                    }
                    break;
                }
                break;
            case 18:
                z00 z00Var = (z00) obj;
                if (!z00Var.c) {
                    z00Var.setLayerType(0, null);
                    break;
                }
                break;
            case 19:
                ((i30) obj).g(true);
                break;
            case 20:
                org.telegram.ui.nx nxVar = ((mo0) ((n40) obj)).c0;
                if (!nxVar.u0.canScrollVertically(-1)) {
                    nxVar.t0.h1(0, 0);
                    break;
                }
                break;
            case 21:
                ((p40) obj).b.b(true);
                break;
            case 22:
                ((p40) obj).b.b(true);
                break;
            case 23:
                g50 g50Var = (g50) obj;
                xj0 xj0Var = g50Var.f;
                if (g50Var.n) {
                    xj0Var.getAnimatedDrawable().K(0);
                    xj0Var.setAnimation(g50Var.r);
                    xj0Var.d();
                    break;
                }
                break;
            case 24:
                m60 m60Var = (m60) ((e6.r) obj).b;
                try {
                    a81 a81Var = m60Var.T;
                    if (a81Var != null && (videoEditedInfo = m60Var.S) != null && videoEditedInfo.endTime > 0) {
                        long n10 = a81Var.n();
                        VideoEditedInfo videoEditedInfo2 = m60Var.S;
                        if (n10 >= videoEditedInfo2.endTime) {
                            a81 a81Var2 = m60Var.T;
                            long j10 = videoEditedInfo2.startTime;
                            a81Var2.K(j10 > 0 ? j10 : 0L);
                            break;
                        }
                    }
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
                break;
            case 25:
                l60 l60Var = (l60) obj;
                si.s0 s0Var = l60Var.R;
                if (s0Var != null && s0Var.a == 3) {
                    long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
                    long j11 = l60Var.F0;
                    if (j11 == 0 || elapsedRealtimeNanos - j11 >= 70000000) {
                        l60Var.A();
                        break;
                    }
                }
                break;
            case 26:
                ma0 ma0Var = (ma0) obj;
                if (ma0Var.d) {
                    ma0Var.e = true;
                    ma0Var.r = false;
                    ma0Var.f = 0.0f;
                    ma0Var.h = SystemClock.uptimeMillis();
                    ma0Var.invalidate();
                    break;
                }
                break;
            case 27:
                wa0 wa0Var = (wa0) obj;
                Activity parentActivity = wa0Var.getParentActivity();
                Activity parentActivity2 = wa0Var.getParentActivity();
                DispatchQueue dispatchQueue = qg.m1.m;
                boolean z10 = parentActivity2.getSharedPreferences("shapedetector_conf", 0).getBoolean("learning", false);
                SharedPreferences.Editor edit = parentActivity.getSharedPreferences("shapedetector_conf", 0).edit();
                if (z10) {
                    edit.clear();
                } else {
                    edit.putBoolean("learning", true);
                }
                edit.apply();
                break;
            case 28:
                final ib0 ib0Var = (ib0) obj;
                boolean z11 = ib0Var.I;
                boolean z12 = !z11;
                hg.p1 p1Var = ib0Var.e;
                hb0 hb0Var = ib0Var.b;
                if (hb0Var == null || p1Var == null) {
                    ib0Var.O = 0;
                    break;
                } else if (ib0Var.L && (kVar = ib0Var.K) != null && kVar.f && !z11) {
                    ib0Var.O = 0;
                    break;
                } else {
                    boolean g10 = ib0Var.g();
                    if (z11) {
                        int computeVerticalScrollRange = hb0Var.computeVerticalScrollRange();
                        f7 = (computeVerticalScrollRange - p1Var.h) + ib0Var.s;
                        if (computeVerticalScrollRange <= 0 && ib0Var.f.K() > 0 && (i10 = ib0Var.O) < 3) {
                            ib0Var.O = i10 + 1;
                            ib0Var.o(true);
                            break;
                        }
                    } else {
                        f7 = (-ib0Var.s) - AndroidUtilities.dp(6.0f);
                    }
                    ib0Var.O = 0;
                    float f10 = ib0Var.v;
                    float max = g10 ? -Math.max(0.0f, f10 - f7) : Math.max(0.0f, f10 - f7) + (-f10);
                    if (!z11 && !g10) {
                        max += hb0Var.computeVerticalScrollOffset();
                    }
                    final float f11 = max;
                    o1.k kVar2 = ib0Var.K;
                    if (kVar2 != null) {
                        kVar2.c();
                    }
                    ib0Var.L = z12;
                    final float translationY = hb0Var.getTranslationY();
                    final float f12 = ib0Var.M;
                    float f13 = z11 ? 0.0f : 1.0f;
                    if (translationY == f11) {
                        ib0Var.K = null;
                        num = Integer.valueOf(!z11 ? 8 : 0);
                        if (ib0Var.N && !z11) {
                            ib0Var.N = false;
                            hb0Var.setLayoutManager(ib0Var.getNeededLayoutManager());
                            ib0Var.I = true;
                            ib0Var.o(true);
                        }
                    } else {
                        o1.k kVar3 = new o1.k(new o1.j(translationY));
                        o1.l lVar = new o1.l(f11);
                        lVar.a(1.0f);
                        lVar.b(550.0f);
                        kVar3.u = lVar;
                        ib0Var.K = kVar3;
                        final float f14 = f13;
                        kVar3.b(new o1.g() { // from class: org.telegram.ui.Components.za0
                            @Override // o1.g
                            public final void a(o1.h hVar, float f15, float f16) {
                                ib0 ib0Var2 = ib0.this;
                                ib0Var2.b.setTranslationY(f15);
                                ib0Var2.i();
                                float f17 = translationY;
                                ib0Var2.M = AndroidUtilities.lerp(f12, f14, (f15 - f17) / (f11 - f17));
                            }
                        });
                        if (!z11) {
                            ib0Var.K.a(new ei.q4(ib0Var, z12, 2));
                        }
                        ib0Var.K.a(new ab0());
                        ib0Var.K.h();
                    }
                    if (num != null && ib0Var.getVisibility() != num.intValue()) {
                        ib0Var.setVisibility(num.intValue());
                        break;
                    }
                }
                break;
            default:
                ((wb0) obj).S.n.l();
                break;
        }
    }

    public /* synthetic */ hq(ru ruVar, y90 y90Var, ClickableSpan clickableSpan) {
        this.a = 9;
        this.b = ruVar;
    }
}
