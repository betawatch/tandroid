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

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final /* synthetic */ class wp implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ wp(Object obj, int i10) {
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
                ((bq) obj).dismiss();
                break;
            case 1:
                ((qq) obj).a();
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
                fr frVar = ((dr) obj).c;
                TLRPC.Peer peer = frVar.d0;
                org.telegram.ui.ActionBar.n2 n2Var = frVar.f0;
                lr lrVar = new lr(n2Var, peer, frVar.g0, frVar.Y.size() > 1, frVar.X);
                if (n2Var.getParentActivity() != null) {
                    n2Var.showDialog(lrVar);
                    break;
                } else {
                    lrVar.show();
                    break;
                }
            case 4:
                ((di.d) obj).setLoading(true);
                break;
            case 5:
                hs hsVar = (hs) obj;
                hsVar.a.a(!r0.f, true);
                AndroidUtilities.runOnUIThread(hsVar.f, 3000L);
                break;
            case 6:
                ((tn0) obj).V(false);
                break;
            case 7:
                ((lt) obj).a();
                break;
            case 8:
                ((ViewTreeObserver.OnPreDrawListener) obj).onPreDraw();
                break;
            case 9:
                ((iu) obj).getClass();
                break;
            case 10:
                of.f.s(((ou) obj).a.getContext(), "https://play.google.com/store/apps/details?id=com.google.android.webview");
                break;
            case 11:
                tu tuVar = ((su) obj).a;
                tuVar.n.setVisibility(4);
                tuVar.h.setVisibility(4);
                ImageView imageView = tuVar.x;
                imageView.setEnabled(true);
                imageView.setAlpha(1.0f);
                break;
            case 12:
                ((mv) obj).a(true, true);
                break;
            case 13:
                ix ixVar = (ix) obj;
                if (ixVar.Y.getEmojiView() != null) {
                    kz emojiView = ixVar.Y.getEmojiView();
                    if (!emojiView.f0) {
                        try {
                            int i12 = emojiView.R.s.get(EmojiData.dataColored.length);
                            if (i12 > 0) {
                                emojiView.P.B0();
                                emojiView.W(i12);
                                emojiView.I(i12, AndroidUtilities.dp(-9.0f));
                                emojiView.n(null, 0);
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
                AndroidUtilities.updateViewShow(((xy) obj).h, true);
                break;
            case 16:
                dz dzVar = (dz) obj;
                ArrayList arrayList = dzVar.r;
                ArrayList arrayList2 = dzVar.h;
                fz fzVar = dzVar.w;
                int i13 = fzVar.M;
                kz kzVar = fzVar.Q;
                tw twVar = kzVar.D0;
                if (i13 == dzVar.b) {
                    arrayList2.remove(arrayList);
                    fzVar.E = dzVar.c;
                    fzVar.F = dzVar.d;
                    fzVar.G = dzVar.e;
                    fzVar.H = dzVar.f;
                    fzVar.I = arrayList2;
                    fzVar.J = dzVar.n;
                    fzVar.K = new ArrayList(arrayList);
                    kzVar.G0.e(false);
                    s4.h0 adapter = twVar.getAdapter();
                    fz fzVar2 = kzVar.z0;
                    if (adapter != fzVar2) {
                        twVar.setAdapter(fzVar2);
                    }
                    fzVar.l();
                    break;
                }
                break;
            case 17:
                k00 k00Var = ((j00) obj).e;
                ArrayList arrayList3 = k00Var.h;
                if (!UserConfig.getInstance(UserConfig.selectedAccount).isPremium()) {
                    int i14 = 0;
                    while (i14 < arrayList3.size()) {
                        if (((g00) arrayList3.get(i14)).e && i14 != 0) {
                            f00 f00Var = k00Var.I;
                            k00 k00Var2 = f00Var.d;
                            ArrayList arrayList4 = k00Var2.h;
                            SparseIntArray sparseIntArray = k00Var2.k0;
                            int size = arrayList4.size();
                            if (i14 >= 0 && i14 < size) {
                                ArrayList<MessagesController.DialogFilter> dialogFilters = MessagesController.getInstance(UserConfig.selectedAccount).getDialogFilters();
                                int i15 = sparseIntArray.get(i14);
                                int i16 = ((g00) arrayList4.get(i14)).a;
                                for (int i17 = i14 - 1; i17 >= 0; i17--) {
                                    sparseIntArray.put(i17 + 1, sparseIntArray.get(i17));
                                }
                                MessagesController.DialogFilter remove = dialogFilters.remove(i14);
                                remove.order = 0;
                                dialogFilters.add(0, remove);
                                sparseIntArray.put(0, i15);
                                arrayList4.add(0, (g00) arrayList4.remove(i14));
                                ((g00) arrayList4.get(0)).a = i16;
                                for (int i18 = 0; i18 <= i14; i18++) {
                                    ((g00) arrayList4.get(i18)).a = i18;
                                    dialogFilters.get(i18).order = i18;
                                }
                                int i19 = 0;
                                while (i19 <= i14) {
                                    if (k00Var2.K == i19) {
                                        int i20 = i19 == i14 ? 0 : i19 + 1;
                                        k00Var2.L = i20;
                                        k00Var2.K = i20;
                                    }
                                    if (k00Var2.q0 == i19) {
                                        int i21 = i19 == i14 ? 0 : i19 + 1;
                                        k00Var2.r0 = i21;
                                        k00Var2.q0 = i21;
                                    }
                                    i19++;
                                }
                                f00Var.p(i14, 0);
                                e00 e00Var = k00Var2.J;
                                int i22 = ((g00) arrayList4.get(i14)).a;
                                org.telegram.ui.tw twVar2 = (org.telegram.ui.tw) e00Var;
                                int i23 = 0;
                                while (true) {
                                    org.telegram.ui.ty[] tyVarArr = twVar2.b.e0;
                                    if (i23 < tyVarArr.length) {
                                        org.telegram.ui.ty tyVar = tyVarArr[i23];
                                        int i24 = tyVar.h;
                                        if (i24 == i22) {
                                            tyVar.h = i16;
                                        } else if (i24 == i16) {
                                            tyVar.h = i22;
                                        }
                                        i23++;
                                    } else {
                                        k00Var2.j();
                                        k00Var2.y = true;
                                        k00Var2.F.setItemAnimator(k00Var2.s0);
                                    }
                                }
                            }
                            k00Var.F.u0(0);
                            org.telegram.ui.sw swVar = (org.telegram.ui.sw) k00Var;
                            org.telegram.ui.uy uyVar = swVar.B0;
                            if (!uyVar.getMessagesController().premiumFeaturesBlocked()) {
                                try {
                                    swVar.performHapticFeedback(3, 1);
                                } catch (Exception unused2) {
                                }
                                qc I = yc.a0(uyVar).I(R.raw.filter_reorder, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.LimitReachedReorderFolder, LocaleController.getString(R.string.FilterAllChats))), LocaleController.getString(R.string.PremiumMore), 5000, false, new org.telegram.ui.dj(swVar, 22));
                                I.k(true);
                                uyVar.n3 = I;
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
                r00 r00Var = (r00) obj;
                if (!r00Var.c) {
                    r00Var.setLayerType(0, null);
                    break;
                }
                break;
            case 19:
                ((z20) obj).g(true);
                break;
            case 20:
                org.telegram.ui.ey eyVar = ((pn0) ((e40) obj)).c0;
                if (!eyVar.u0.canScrollVertically(-1)) {
                    eyVar.t0.h1(0, 0);
                    break;
                }
                break;
            case 21:
                ((g40) obj).b.b(true);
                break;
            case 22:
                ((g40) obj).b.b(true);
                break;
            case 23:
                w40 w40Var = (w40) obj;
                aj0 aj0Var = w40Var.f;
                if (w40Var.n) {
                    aj0Var.getAnimatedDrawable().I(0);
                    aj0Var.setAnimation(w40Var.r);
                    aj0Var.d();
                    break;
                }
                break;
            case 24:
                w50 w50Var = (w50) ((di.p2) obj).b;
                try {
                    g71 g71Var = w50Var.O;
                    if (g71Var != null && (videoEditedInfo = w50Var.N) != null) {
                        if (videoEditedInfo.endTime > 0) {
                            long n10 = g71Var.n();
                            VideoEditedInfo videoEditedInfo2 = w50Var.N;
                            if (n10 >= videoEditedInfo2.endTime) {
                                g71 g71Var2 = w50Var.O;
                                long j3 = videoEditedInfo2.startTime;
                                g71Var2.K(j3 > 0 ? j3 : 0L);
                                break;
                            }
                        }
                    }
                } catch (Exception e7) {
                    FileLog.e(e7);
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
                DispatchQueue dispatchQueue = qg.k1.m;
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
                hg.q1 q1Var = oa0Var2.e;
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
                            oa0Var.K.a(new di.z4(oa0Var, z12, 2));
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
                ((db0) obj).S.n.l();
                break;
            default:
                ((ac0) obj).a();
                break;
        }
    }

    public /* synthetic */ wp(iu iuVar, e90 e90Var, ClickableSpan clickableSpan) {
        this.a = 9;
        this.b = iuVar;
    }
}
