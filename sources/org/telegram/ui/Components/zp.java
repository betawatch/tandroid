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

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final /* synthetic */ class zp implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ zp(Object obj, int i10) {
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
                ((aq) obj).b.a();
                break;
            case 1:
                ((mq) obj).dismiss();
                break;
            case 2:
                ((ar) obj).a();
                break;
            case 3:
                ((org.telegram.ui.ActionBar.h3) obj).dismiss();
                org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                if (U != null) {
                    U.presentFragment(new PremiumPreviewFragment(0, "create_bot"));
                    break;
                }
                break;
            case 4:
                rr rrVar = ((pr) obj).c;
                TLRPC.Peer peer = rrVar.d0;
                org.telegram.ui.ActionBar.o2 o2Var = rrVar.f0;
                xr xrVar = new xr(o2Var, peer, rrVar.g0, rrVar.Y.size() > 1, rrVar.X);
                if (o2Var.getParentActivity() != null) {
                    o2Var.showDialog(xrVar);
                    break;
                } else {
                    xrVar.show();
                    break;
                }
            case 5:
                ((ei.d) obj).setLoading(true);
                break;
            case 6:
                ss ssVar = (ss) obj;
                ssVar.a.a(!r0.f, true);
                AndroidUtilities.runOnUIThread(ssVar.f, 3000L);
                break;
            case 7:
                ((uo0) obj).V(false);
                break;
            case 8:
                ((vt) obj).a();
                break;
            case 9:
                ((ViewTreeObserver.OnPreDrawListener) obj).onPreDraw();
                break;
            case 10:
                ((ru) obj).getClass();
                break;
            case 11:
                pf.d.r(((xu) obj).a.getContext(), "https://play.google.com/store/apps/details?id=com.google.android.webview");
                break;
            case 12:
                cv cvVar = ((bv) obj).a;
                cvVar.n.setVisibility(4);
                cvVar.h.setVisibility(4);
                ImageView imageView = cvVar.x;
                imageView.setEnabled(true);
                imageView.setAlpha(1.0f);
                break;
            case 13:
                ((vv) obj).a(true, true);
                break;
            case 14:
                px pxVar = (px) obj;
                if (pxVar.Y.getEmojiView() != null) {
                    tz emojiView = pxVar.Y.getEmojiView();
                    if (!emojiView.f0) {
                        try {
                            int i12 = emojiView.R.s.get(EmojiData.dataColored.length);
                            if (i12 > 0) {
                                emojiView.P.B0();
                                emojiView.U(i12);
                                emojiView.F(i12, AndroidUtilities.dp(-9.0f));
                                emojiView.n(0, null);
                                break;
                            }
                        } catch (Exception unused) {
                            return;
                        }
                    }
                }
                break;
            case 15:
                jy jyVar = (jy) obj;
                jyVar.w.f = true;
                jyVar.a(true);
                break;
            case 16:
                AndroidUtilities.updateViewShow(((gz) obj).h, true);
                break;
            case 17:
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
            case 18:
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
                                qc I = xc.a0(eyVar).I(R.raw.filter_reorder, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.LimitReachedReorderFolder, LocaleController.getString(R.string.FilterAllChats))), LocaleController.getString(R.string.PremiumMore), 5000, false, new org.telegram.ui.ti(cwVar, 23));
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
            case 19:
                z00 z00Var = (z00) obj;
                if (!z00Var.c) {
                    z00Var.setLayerType(0, null);
                    break;
                }
                break;
            case 20:
                ((i30) obj).g(true);
                break;
            case 21:
                org.telegram.ui.nx nxVar = ((qo0) ((n40) obj)).e0;
                if (!nxVar.u0.canScrollVertically(-1)) {
                    nxVar.t0.h1(0, 0);
                    break;
                }
                break;
            case 22:
                ((p40) obj).b.b(true);
                break;
            case 23:
                ((p40) obj).b.b(true);
                break;
            case 24:
                g50 g50Var = (g50) obj;
                bk0 bk0Var = g50Var.f;
                if (g50Var.n) {
                    bk0Var.getAnimatedDrawable().K(0);
                    bk0Var.setAnimation(g50Var.r);
                    bk0Var.d();
                    break;
                }
                break;
            case 25:
                n60 n60Var = (n60) ((e6.r) obj).b;
                try {
                    j81 j81Var = n60Var.T;
                    if (j81Var != null && (videoEditedInfo = n60Var.S) != null && videoEditedInfo.endTime > 0) {
                        long n10 = j81Var.n();
                        VideoEditedInfo videoEditedInfo2 = n60Var.S;
                        if (n10 >= videoEditedInfo2.endTime) {
                            j81 j81Var2 = n60Var.T;
                            long j10 = videoEditedInfo2.startTime;
                            j81Var2.K(j10 > 0 ? j10 : 0L);
                            break;
                        }
                    }
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
                break;
            case 26:
                m60 m60Var = (m60) obj;
                si.t0 t0Var = m60Var.R;
                if (t0Var != null && t0Var.a == 3) {
                    long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
                    long j11 = m60Var.F0;
                    if (j11 == 0 || elapsedRealtimeNanos - j11 >= 70000000) {
                        m60Var.A();
                        break;
                    }
                }
                break;
            case 27:
                na0 na0Var = (na0) obj;
                if (na0Var.d) {
                    na0Var.e = true;
                    na0Var.r = false;
                    na0Var.f = 0.0f;
                    na0Var.h = SystemClock.uptimeMillis();
                    na0Var.invalidate();
                    break;
                }
                break;
            case 28:
                xa0 xa0Var = (xa0) obj;
                Activity parentActivity = xa0Var.getParentActivity();
                Activity parentActivity2 = xa0Var.getParentActivity();
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
            default:
                final jb0 jb0Var = (jb0) obj;
                boolean z11 = jb0Var.I;
                boolean z12 = !z11;
                hg.p1 p1Var = jb0Var.e;
                ib0 ib0Var = jb0Var.b;
                if (ib0Var == null || p1Var == null) {
                    jb0Var.O = 0;
                    break;
                } else if (jb0Var.L && (kVar = jb0Var.K) != null && kVar.f && !z11) {
                    jb0Var.O = 0;
                    break;
                } else {
                    boolean g10 = jb0Var.g();
                    if (z11) {
                        int computeVerticalScrollRange = ib0Var.computeVerticalScrollRange();
                        f7 = (computeVerticalScrollRange - p1Var.h) + jb0Var.s;
                        if (computeVerticalScrollRange <= 0 && jb0Var.f.K() > 0 && (i10 = jb0Var.O) < 3) {
                            jb0Var.O = i10 + 1;
                            jb0Var.o(true);
                            break;
                        }
                    } else {
                        f7 = (-jb0Var.s) - AndroidUtilities.dp(6.0f);
                    }
                    jb0Var.O = 0;
                    float f10 = jb0Var.v;
                    float max = g10 ? -Math.max(0.0f, f10 - f7) : Math.max(0.0f, f10 - f7) + (-f10);
                    if (!z11 && !g10) {
                        max += ib0Var.computeVerticalScrollOffset();
                    }
                    o1.k kVar2 = jb0Var.K;
                    if (kVar2 != null) {
                        kVar2.c();
                    }
                    jb0Var.L = z12;
                    final float translationY = ib0Var.getTranslationY();
                    final float f11 = jb0Var.M;
                    final float f12 = !z11 ? 1.0f : 0.0f;
                    if (translationY == max) {
                        jb0Var.K = null;
                        num = Integer.valueOf(!z11 ? 8 : 0);
                        if (jb0Var.N && !z11) {
                            jb0Var.N = false;
                            ib0Var.setLayoutManager(jb0Var.getNeededLayoutManager());
                            jb0Var.I = true;
                            jb0Var.o(true);
                        }
                    } else {
                        o1.k kVar3 = new o1.k(new o1.j(translationY));
                        o1.l lVar = new o1.l(max);
                        lVar.a(1.0f);
                        lVar.b(550.0f);
                        kVar3.u = lVar;
                        jb0Var.K = kVar3;
                        final float f13 = max;
                        kVar3.b(new o1.g() { // from class: org.telegram.ui.Components.ab0
                            @Override // o1.g
                            public final void a(o1.h hVar, float f14, float f15) {
                                jb0 jb0Var2 = jb0.this;
                                jb0Var2.b.setTranslationY(f14);
                                jb0Var2.i();
                                float f16 = translationY;
                                jb0Var2.M = AndroidUtilities.lerp(f11, f12, (f14 - f16) / (f13 - f16));
                            }
                        });
                        if (!z11) {
                            jb0Var.K.a(new ei.q4(jb0Var, z12, 2));
                        }
                        jb0Var.K.a(new bb0());
                        jb0Var.K.h();
                    }
                    if (num != null && jb0Var.getVisibility() != num.intValue()) {
                        jb0Var.setVisibility(num.intValue());
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ zp(ru ruVar, z90 z90Var, ClickableSpan clickableSpan) {
        this.a = 10;
        this.b = ruVar;
    }
}
