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

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final /* synthetic */ class yp implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ yp(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        VideoEditedInfo videoEditedInfo;
        float f7;
        int i10;
        final oa0 oa0Var;
        o1.k kVar;
        int i11 = this.a;
        Integer num = null;
        Object obj = this.b;
        switch (i11) {
            case 0:
                ((dq) obj).dismiss();
                break;
            case 1:
                ((sq) obj).a();
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
                hr hrVar = ((fr) obj).c;
                TLRPC.Peer peer = hrVar.d0;
                org.telegram.ui.ActionBar.n2 n2Var = hrVar.f0;
                nr nrVar = new nr(n2Var, peer, hrVar.g0, hrVar.Y.size() > 1, hrVar.X);
                if (n2Var.getParentActivity() != null) {
                    n2Var.showDialog(nrVar);
                    break;
                } else {
                    nrVar.show();
                    break;
                }
            case 4:
                ((ci.d) obj).setLoading(true);
                break;
            case 5:
                js jsVar = (js) obj;
                jsVar.a.a(!r0.f, true);
                AndroidUtilities.runOnUIThread(jsVar.f, 3000L);
                break;
            case 6:
                ((tn0) obj).V(false);
                break;
            case 7:
                ((ot) obj).a();
                break;
            case 8:
                ((ViewTreeObserver.OnPreDrawListener) obj).onPreDraw();
                break;
            case 9:
                ((lu) obj).getClass();
                break;
            case 10:
                nf.f.s(((ru) obj).a.getContext(), "https://play.google.com/store/apps/details?id=com.google.android.webview");
                break;
            case 11:
                wu wuVar = ((vu) obj).a;
                wuVar.n.setVisibility(4);
                wuVar.h.setVisibility(4);
                ImageView imageView = wuVar.x;
                imageView.setEnabled(true);
                imageView.setAlpha(1.0f);
                break;
            case 12:
                ((ov) obj).a(true, true);
                break;
            case 13:
                ix ixVar = (ix) obj;
                if (ixVar.Y.getEmojiView() != null) {
                    lz emojiView = ixVar.Y.getEmojiView();
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
                cy cyVar = (cy) obj;
                cyVar.s.f = true;
                cyVar.a(true);
                break;
            case 15:
                AndroidUtilities.updateViewShow(((yy) obj).h, true);
                break;
            case 16:
                ez ezVar = (ez) obj;
                ArrayList arrayList = ezVar.r;
                ArrayList arrayList2 = ezVar.h;
                gz gzVar = ezVar.w;
                int i13 = gzVar.M;
                lz lzVar = gzVar.Q;
                tw twVar = lzVar.D0;
                if (i13 == ezVar.b) {
                    arrayList2.remove(arrayList);
                    gzVar.E = ezVar.c;
                    gzVar.F = ezVar.d;
                    gzVar.G = ezVar.e;
                    gzVar.H = ezVar.f;
                    gzVar.I = arrayList2;
                    gzVar.J = ezVar.n;
                    gzVar.K = new ArrayList(arrayList);
                    lzVar.G0.e(false);
                    s4.h0 adapter = twVar.getAdapter();
                    gz gzVar2 = lzVar.z0;
                    if (adapter != gzVar2) {
                        twVar.setAdapter(gzVar2);
                    }
                    gzVar.l();
                    break;
                }
                break;
            case 17:
                l00 l00Var = ((k00) obj).e;
                ArrayList arrayList3 = l00Var.h;
                if (!UserConfig.getInstance(UserConfig.selectedAccount).isPremium()) {
                    int i14 = 0;
                    while (i14 < arrayList3.size()) {
                        if (((h00) arrayList3.get(i14)).e && i14 != 0) {
                            g00 g00Var = l00Var.I;
                            l00 l00Var2 = g00Var.d;
                            ArrayList arrayList4 = l00Var2.h;
                            SparseIntArray sparseIntArray = l00Var2.k0;
                            int size = arrayList4.size();
                            if (i14 >= 0 && i14 < size) {
                                ArrayList<MessagesController.DialogFilter> dialogFilters = MessagesController.getInstance(UserConfig.selectedAccount).getDialogFilters();
                                int i15 = sparseIntArray.get(i14);
                                int i16 = ((h00) arrayList4.get(i14)).a;
                                for (int i17 = i14 - 1; i17 >= 0; i17--) {
                                    sparseIntArray.put(i17 + 1, sparseIntArray.get(i17));
                                }
                                MessagesController.DialogFilter remove = dialogFilters.remove(i14);
                                remove.order = 0;
                                dialogFilters.add(0, remove);
                                sparseIntArray.put(0, i15);
                                arrayList4.add(0, (h00) arrayList4.remove(i14));
                                ((h00) arrayList4.get(0)).a = i16;
                                for (int i18 = 0; i18 <= i14; i18++) {
                                    ((h00) arrayList4.get(i18)).a = i18;
                                    dialogFilters.get(i18).order = i18;
                                }
                                int i19 = 0;
                                while (i19 <= i14) {
                                    if (l00Var2.K == i19) {
                                        int i20 = i19 == i14 ? 0 : i19 + 1;
                                        l00Var2.L = i20;
                                        l00Var2.K = i20;
                                    }
                                    if (l00Var2.q0 == i19) {
                                        int i21 = i19 == i14 ? 0 : i19 + 1;
                                        l00Var2.r0 = i21;
                                        l00Var2.q0 = i21;
                                    }
                                    i19++;
                                }
                                g00Var.p(i14, 0);
                                f00 f00Var = l00Var2.J;
                                int i22 = ((h00) arrayList4.get(i14)).a;
                                org.telegram.ui.qw qwVar = (org.telegram.ui.qw) f00Var;
                                int i23 = 0;
                                while (true) {
                                    org.telegram.ui.qy[] qyVarArr = qwVar.b.e0;
                                    if (i23 < qyVarArr.length) {
                                        org.telegram.ui.qy qyVar = qyVarArr[i23];
                                        int i24 = qyVar.h;
                                        if (i24 == i22) {
                                            qyVar.h = i16;
                                        } else if (i24 == i16) {
                                            qyVar.h = i22;
                                        }
                                        i23++;
                                    } else {
                                        l00Var2.j();
                                        l00Var2.y = true;
                                        l00Var2.F.setItemAnimator(l00Var2.s0);
                                    }
                                }
                            }
                            l00Var.F.u0(0);
                            org.telegram.ui.pw pwVar = (org.telegram.ui.pw) l00Var;
                            org.telegram.ui.ry ryVar = pwVar.B0;
                            if (!ryVar.getMessagesController().premiumFeaturesBlocked()) {
                                try {
                                    pwVar.performHapticFeedback(3, 1);
                                } catch (Exception unused2) {
                                }
                                qc I = xc.a0(ryVar).I(R.raw.filter_reorder, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.LimitReachedReorderFolder, LocaleController.getString(R.string.FilterAllChats))), LocaleController.getString(R.string.PremiumMore), 5000, false, new org.telegram.ui.aj(pwVar, 22));
                                I.k(true);
                                ryVar.n3 = I;
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
                s00 s00Var = (s00) obj;
                if (!s00Var.c) {
                    s00Var.setLayerType(0, null);
                    break;
                }
                break;
            case 19:
                ((a30) obj).g(true);
                break;
            case 20:
                org.telegram.ui.ay ayVar = ((pn0) ((f40) obj)).c0;
                if (!ayVar.u0.canScrollVertically(-1)) {
                    ayVar.t0.h1(0, 0);
                    break;
                }
                break;
            case 21:
                ((h40) obj).b.b(true);
                break;
            case 22:
                ((h40) obj).b.b(true);
                break;
            case 23:
                x40 x40Var = (x40) obj;
                bj0 bj0Var = x40Var.f;
                if (x40Var.n) {
                    bj0Var.getAnimatedDrawable().K(0);
                    bj0Var.setAnimation(x40Var.r);
                    bj0Var.d();
                    break;
                }
                break;
            case 24:
                x50 x50Var = (x50) ((ci.o2) obj).b;
                try {
                    f71 f71Var = x50Var.O;
                    if (f71Var != null && (videoEditedInfo = x50Var.N) != null) {
                        if (videoEditedInfo.endTime > 0) {
                            long n10 = f71Var.n();
                            VideoEditedInfo videoEditedInfo2 = x50Var.N;
                            if (n10 >= videoEditedInfo2.endTime) {
                                f71 f71Var2 = x50Var.O;
                                long j3 = videoEditedInfo2.startTime;
                                f71Var2.K(j3 > 0 ? j3 : 0L);
                                break;
                            }
                        }
                    }
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
                break;
            case 25:
                s90 s90Var = (s90) obj;
                if (s90Var.d) {
                    s90Var.e = true;
                    s90Var.r = false;
                    s90Var.f = 0.0f;
                    s90Var.h = SystemClock.uptimeMillis();
                    s90Var.invalidate();
                    break;
                }
                break;
            case 26:
                ca0 ca0Var = (ca0) obj;
                Activity parentActivity = ca0Var.getParentActivity();
                Activity parentActivity2 = ca0Var.getParentActivity();
                DispatchQueue dispatchQueue = pg.l1.m;
                boolean z10 = parentActivity2.getSharedPreferences("shapedetector_conf", 0).getBoolean("learning", false);
                SharedPreferences.Editor edit = parentActivity.getSharedPreferences("shapedetector_conf", 0).edit();
                if (z10) {
                    edit.clear();
                } else {
                    edit.putBoolean("learning", true);
                }
                edit.apply();
                break;
            case 27:
                oa0 oa0Var2 = (oa0) obj;
                boolean z11 = oa0Var2.I;
                boolean z12 = !z11;
                gg.q1 q1Var = oa0Var2.e;
                na0 na0Var = oa0Var2.b;
                if (na0Var == null || q1Var == null) {
                    oa0Var2.O = 0;
                    break;
                } else if (oa0Var2.L && (kVar = oa0Var2.K) != null && kVar.f && !z11) {
                    oa0Var2.O = 0;
                    break;
                } else {
                    boolean g10 = oa0Var2.g();
                    if (z11) {
                        int computeVerticalScrollRange = na0Var.computeVerticalScrollRange();
                        float f10 = (computeVerticalScrollRange - q1Var.h) + oa0Var2.s;
                        if (computeVerticalScrollRange <= 0 && oa0Var2.f.K() > 0 && (i10 = oa0Var2.O) < 3) {
                            oa0Var2.O = i10 + 1;
                            oa0Var2.o(true);
                            break;
                        } else {
                            f7 = f10;
                        }
                    } else {
                        f7 = (-oa0Var2.s) - AndroidUtilities.dp(6.0f);
                    }
                    oa0Var2.O = 0;
                    float f11 = oa0Var2.v;
                    float max = g10 ? -Math.max(0.0f, f11 - f7) : Math.max(0.0f, f11 - f7) + (-f11);
                    if (!z11 && !g10) {
                        max += na0Var.computeVerticalScrollOffset();
                    }
                    final float f12 = max;
                    o1.k kVar2 = oa0Var2.K;
                    if (kVar2 != null) {
                        kVar2.c();
                    }
                    oa0Var2.L = z12;
                    final float translationY = na0Var.getTranslationY();
                    final float f13 = oa0Var2.M;
                    float f14 = z11 ? 0.0f : 1.0f;
                    if (translationY == f12) {
                        oa0Var2.K = null;
                        num = Integer.valueOf(!z11 ? 8 : 0);
                        if (oa0Var2.N && !z11) {
                            oa0Var2.N = false;
                            na0Var.setLayoutManager(oa0Var2.getNeededLayoutManager());
                            oa0Var2.I = true;
                            oa0Var2.o(true);
                        }
                        oa0Var = oa0Var2;
                    } else {
                        o1.k kVar3 = new o1.k(new o1.j(translationY));
                        o1.l lVar = new o1.l(f12);
                        lVar.a(1.0f);
                        lVar.b(550.0f);
                        kVar3.u = lVar;
                        oa0Var2.K = kVar3;
                        oa0Var = oa0Var2;
                        final float f15 = f14;
                        kVar3.b(new o1.g() { // from class: org.telegram.ui.Components.fa0
                            @Override // o1.g
                            public final void a(o1.h hVar, float f16, float f17) {
                                oa0 oa0Var3 = oa0.this;
                                oa0Var3.b.setTranslationY(f16);
                                oa0Var3.i();
                                float f18 = translationY;
                                oa0Var3.M = AndroidUtilities.lerp(f13, f15, (f16 - f18) / (f12 - f18));
                            }
                        });
                        if (!z11) {
                            oa0Var.K.a(new ci.y4(oa0Var, z12, 2));
                        }
                        oa0Var.K.a(new ga0());
                        oa0Var.K.f();
                    }
                    if (num != null && oa0Var.getVisibility() != num.intValue()) {
                        oa0Var.setVisibility(num.intValue());
                        break;
                    }
                }
                break;
            case 28:
                ((cb0) obj).S.n.l();
                break;
            default:
                ((yb0) obj).a();
                break;
        }
    }

    public /* synthetic */ yp(lu luVar, e90 e90Var, ClickableSpan clickableSpan) {
        this.a = 9;
        this.b = luVar;
    }
}
