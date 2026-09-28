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

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
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
                ((eq) obj).dismiss();
                break;
            case 1:
                ((tq) obj).a();
                break;
            case 2:
                ((org.telegram.ui.ActionBar.e3) obj).dismiss();
                org.telegram.ui.ActionBar.m2 U = LaunchActivity.U();
                if (U != null) {
                    U.presentFragment(new PremiumPreviewFragment(0, "create_bot"));
                    break;
                }
                break;
            case 3:
                ir irVar = ((gr) obj).c;
                TLRPC.Peer peer = irVar.d0;
                org.telegram.ui.ActionBar.m2 m2Var = irVar.f0;
                or orVar = new or(m2Var, peer, irVar.g0, irVar.Y.size() > 1, irVar.X);
                if (m2Var.getParentActivity() != null) {
                    m2Var.showDialog(orVar);
                    break;
                } else {
                    orVar.show();
                    break;
                }
            case 4:
                ((ci.d) obj).setLoading(true);
                break;
            case 5:
                ks ksVar = (ks) obj;
                ksVar.a.a(!r0.f, true);
                AndroidUtilities.runOnUIThread(ksVar.f, 3000L);
                break;
            case 6:
                ((io0) obj).V(false);
                break;
            case 7:
                ((pt) obj).a();
                break;
            case 8:
                ((ViewTreeObserver.OnPreDrawListener) obj).onPreDraw();
                break;
            case 9:
                ((mu) obj).getClass();
                break;
            case 10:
                nf.f.s(((su) obj).a.getContext(), "https://play.google.com/store/apps/details?id=com.google.android.webview");
                break;
            case 11:
                xu xuVar = ((wu) obj).a;
                xuVar.n.setVisibility(4);
                xuVar.h.setVisibility(4);
                ImageView imageView = xuVar.x;
                imageView.setEnabled(true);
                imageView.setAlpha(1.0f);
                break;
            case 12:
                ((pv) obj).a(true, true);
                break;
            case 13:
                kx kxVar = (kx) obj;
                if (kxVar.Y.getEmojiView() != null) {
                    mz emojiView = kxVar.Y.getEmojiView();
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
                ey eyVar = (ey) obj;
                eyVar.s.f = true;
                eyVar.a(true);
                break;
            case 15:
                AndroidUtilities.updateViewShow(((zy) obj).h, true);
                break;
            case 16:
                fz fzVar = (fz) obj;
                ArrayList arrayList = fzVar.r;
                ArrayList arrayList2 = fzVar.h;
                hz hzVar = fzVar.w;
                int i13 = hzVar.M;
                mz mzVar = hzVar.Q;
                uw uwVar = mzVar.D0;
                if (i13 == fzVar.b) {
                    arrayList2.remove(arrayList);
                    hzVar.E = fzVar.c;
                    hzVar.F = fzVar.d;
                    hzVar.G = fzVar.e;
                    hzVar.H = fzVar.f;
                    hzVar.I = arrayList2;
                    hzVar.J = fzVar.n;
                    hzVar.K = new ArrayList(arrayList);
                    mzVar.G0.e(false);
                    s4.h0 adapter = uwVar.getAdapter();
                    hz hzVar2 = mzVar.z0;
                    if (adapter != hzVar2) {
                        uwVar.setAdapter(hzVar2);
                    }
                    hzVar.l();
                    break;
                }
                break;
            case 17:
                m00 m00Var = ((l00) obj).e;
                ArrayList arrayList3 = m00Var.h;
                if (!UserConfig.getInstance(UserConfig.selectedAccount).isPremium()) {
                    int i14 = 0;
                    while (i14 < arrayList3.size()) {
                        if (((i00) arrayList3.get(i14)).e && i14 != 0) {
                            h00 h00Var = m00Var.I;
                            m00 m00Var2 = h00Var.d;
                            ArrayList arrayList4 = m00Var2.h;
                            SparseIntArray sparseIntArray = m00Var2.k0;
                            int size = arrayList4.size();
                            if (i14 >= 0 && i14 < size) {
                                ArrayList<MessagesController.DialogFilter> dialogFilters = MessagesController.getInstance(UserConfig.selectedAccount).getDialogFilters();
                                int i15 = sparseIntArray.get(i14);
                                int i16 = ((i00) arrayList4.get(i14)).a;
                                for (int i17 = i14 - 1; i17 >= 0; i17--) {
                                    sparseIntArray.put(i17 + 1, sparseIntArray.get(i17));
                                }
                                MessagesController.DialogFilter remove = dialogFilters.remove(i14);
                                remove.order = 0;
                                dialogFilters.add(0, remove);
                                sparseIntArray.put(0, i15);
                                arrayList4.add(0, (i00) arrayList4.remove(i14));
                                ((i00) arrayList4.get(0)).a = i16;
                                for (int i18 = 0; i18 <= i14; i18++) {
                                    ((i00) arrayList4.get(i18)).a = i18;
                                    dialogFilters.get(i18).order = i18;
                                }
                                int i19 = 0;
                                while (i19 <= i14) {
                                    if (m00Var2.K == i19) {
                                        int i20 = i19 == i14 ? 0 : i19 + 1;
                                        m00Var2.L = i20;
                                        m00Var2.K = i20;
                                    }
                                    if (m00Var2.q0 == i19) {
                                        int i21 = i19 == i14 ? 0 : i19 + 1;
                                        m00Var2.r0 = i21;
                                        m00Var2.q0 = i21;
                                    }
                                    i19++;
                                }
                                h00Var.p(i14, 0);
                                g00 g00Var = m00Var2.J;
                                int i22 = ((i00) arrayList4.get(i14)).a;
                                org.telegram.ui.pw pwVar = (org.telegram.ui.pw) g00Var;
                                int i23 = 0;
                                while (true) {
                                    org.telegram.ui.py[] pyVarArr = pwVar.b.e0;
                                    if (i23 < pyVarArr.length) {
                                        org.telegram.ui.py pyVar = pyVarArr[i23];
                                        int i24 = pyVar.h;
                                        if (i24 == i22) {
                                            pyVar.h = i16;
                                        } else if (i24 == i16) {
                                            pyVar.h = i22;
                                        }
                                        i23++;
                                    } else {
                                        m00Var2.j();
                                        m00Var2.y = true;
                                        m00Var2.F.setItemAnimator(m00Var2.s0);
                                    }
                                }
                            }
                            m00Var.F.u0(0);
                            org.telegram.ui.nw nwVar = (org.telegram.ui.nw) m00Var;
                            org.telegram.ui.qy qyVar = nwVar.B0;
                            if (!qyVar.getMessagesController().premiumFeaturesBlocked()) {
                                try {
                                    nwVar.performHapticFeedback(3, 1);
                                } catch (Exception unused2) {
                                }
                                qc I = xc.a0(qyVar).I(R.raw.filter_reorder, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.LimitReachedReorderFolder, LocaleController.getString(R.string.FilterAllChats))), LocaleController.getString(R.string.PremiumMore), 5000, false, new org.telegram.ui.aj(nwVar, 22));
                                I.k(true);
                                qyVar.n3 = I;
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
                t00 t00Var = (t00) obj;
                if (!t00Var.c) {
                    t00Var.setLayerType(0, null);
                    break;
                }
                break;
            case 19:
                ((c30) obj).g(true);
                break;
            case 20:
                org.telegram.ui.zx zxVar = ((eo0) ((h40) obj)).c0;
                if (!zxVar.u0.canScrollVertically(-1)) {
                    zxVar.t0.h1(0, 0);
                    break;
                }
                break;
            case 21:
                ((j40) obj).b.b(true);
                break;
            case 22:
                ((j40) obj).b.b(true);
                break;
            case 23:
                z40 z40Var = (z40) obj;
                nj0 nj0Var = z40Var.f;
                if (z40Var.n) {
                    nj0Var.getAnimatedDrawable().K(0);
                    nj0Var.setAnimation(z40Var.r);
                    nj0Var.d();
                    break;
                }
                break;
            case 24:
                e60 e60Var = (e60) ((ci.o2) obj).b;
                try {
                    u71 u71Var = e60Var.T;
                    if (u71Var != null && (videoEditedInfo = e60Var.S) != null && videoEditedInfo.endTime > 0) {
                        long n10 = u71Var.n();
                        VideoEditedInfo videoEditedInfo2 = e60Var.S;
                        if (n10 >= videoEditedInfo2.endTime) {
                            u71 u71Var2 = e60Var.T;
                            long j3 = videoEditedInfo2.startTime;
                            u71Var2.K(j3 > 0 ? j3 : 0L);
                            break;
                        }
                    }
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
                break;
            case 25:
                d60 d60Var = (d60) obj;
                ki.r0 r0Var = d60Var.R;
                if (r0Var != null && r0Var.a == 3) {
                    long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
                    long j10 = d60Var.y0;
                    if (j10 == 0 || elapsedRealtimeNanos - j10 >= 70000000) {
                        d60Var.w();
                        break;
                    }
                }
                break;
            case 26:
                ea0 ea0Var = (ea0) obj;
                if (ea0Var.d) {
                    ea0Var.e = true;
                    ea0Var.r = false;
                    ea0Var.f = 0.0f;
                    ea0Var.h = SystemClock.uptimeMillis();
                    ea0Var.invalidate();
                    break;
                }
                break;
            case 27:
                pa0 pa0Var = (pa0) obj;
                Activity parentActivity = pa0Var.getParentActivity();
                Activity parentActivity2 = pa0Var.getParentActivity();
                DispatchQueue dispatchQueue = pg.n1.m;
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
                final bb0 bb0Var = (bb0) obj;
                boolean z11 = bb0Var.I;
                boolean z12 = !z11;
                gg.q1 q1Var = bb0Var.e;
                ab0 ab0Var = bb0Var.b;
                if (ab0Var == null || q1Var == null) {
                    bb0Var.O = 0;
                    break;
                } else if (bb0Var.L && (kVar = bb0Var.K) != null && kVar.f && !z11) {
                    bb0Var.O = 0;
                    break;
                } else {
                    boolean g10 = bb0Var.g();
                    if (z11) {
                        int computeVerticalScrollRange = ab0Var.computeVerticalScrollRange();
                        f7 = (computeVerticalScrollRange - q1Var.h) + bb0Var.s;
                        if (computeVerticalScrollRange <= 0 && bb0Var.f.K() > 0 && (i10 = bb0Var.O) < 3) {
                            bb0Var.O = i10 + 1;
                            bb0Var.o(true);
                            break;
                        }
                    } else {
                        f7 = (-bb0Var.s) - AndroidUtilities.dp(6.0f);
                    }
                    bb0Var.O = 0;
                    float f10 = bb0Var.v;
                    float max = g10 ? -Math.max(0.0f, f10 - f7) : Math.max(0.0f, f10 - f7) + (-f10);
                    if (!z11 && !g10) {
                        max += ab0Var.computeVerticalScrollOffset();
                    }
                    final float f11 = max;
                    o1.k kVar2 = bb0Var.K;
                    if (kVar2 != null) {
                        kVar2.c();
                    }
                    bb0Var.L = z12;
                    final float translationY = ab0Var.getTranslationY();
                    final float f12 = bb0Var.M;
                    float f13 = z11 ? 0.0f : 1.0f;
                    if (translationY == f11) {
                        bb0Var.K = null;
                        num = Integer.valueOf(!z11 ? 8 : 0);
                        if (bb0Var.N && !z11) {
                            bb0Var.N = false;
                            ab0Var.setLayoutManager(bb0Var.getNeededLayoutManager());
                            bb0Var.I = true;
                            bb0Var.o(true);
                        }
                    } else {
                        o1.k kVar3 = new o1.k(new o1.j(translationY));
                        o1.l lVar = new o1.l(f11);
                        lVar.a(1.0f);
                        lVar.b(550.0f);
                        kVar3.u = lVar;
                        bb0Var.K = kVar3;
                        final float f14 = f13;
                        kVar3.b(new o1.g() { // from class: org.telegram.ui.Components.sa0
                            @Override // o1.g
                            public final void a(o1.h hVar, float f15, float f16) {
                                bb0 bb0Var2 = bb0.this;
                                bb0Var2.b.setTranslationY(f15);
                                bb0Var2.i();
                                float f17 = translationY;
                                bb0Var2.M = AndroidUtilities.lerp(f12, f14, (f15 - f17) / (f11 - f17));
                            }
                        });
                        if (!z11) {
                            bb0Var.K.a(new ci.y4(bb0Var, z12, 2));
                        }
                        bb0Var.K.a(new ta0());
                        bb0Var.K.f();
                    }
                    if (num != null && bb0Var.getVisibility() != num.intValue()) {
                        bb0Var.setVisibility(num.intValue());
                        break;
                    }
                }
                break;
            default:
                ((pb0) obj).S.n.l();
                break;
        }
    }

    public /* synthetic */ zp(mu muVar, q90 q90Var, ClickableSpan clickableSpan) {
        this.a = 9;
        this.b = muVar;
    }
}
