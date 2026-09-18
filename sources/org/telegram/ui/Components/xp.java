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

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final /* synthetic */ class xp implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ xp(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        VideoEditedInfo videoEditedInfo;
        float f7;
        int i10;
        final wa0 wa0Var;
        o1.k kVar;
        int i11 = this.a;
        Integer num = null;
        Object obj = this.b;
        switch (i11) {
            case 0:
                ((cq) obj).dismiss();
                break;
            case 1:
                ((rq) obj).a();
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
                gr grVar = ((er) obj).c;
                TLRPC.Peer peer = grVar.d0;
                org.telegram.ui.ActionBar.n2 n2Var = grVar.f0;
                mr mrVar = new mr(n2Var, peer, grVar.g0, grVar.Y.size() > 1, grVar.X);
                if (n2Var.getParentActivity() != null) {
                    n2Var.showDialog(mrVar);
                    break;
                } else {
                    mrVar.show();
                    break;
                }
            case 4:
                ((ci.d) obj).setLoading(true);
                break;
            case 5:
                is isVar = (is) obj;
                isVar.a.a(!r0.f, true);
                AndroidUtilities.runOnUIThread(isVar.f, 3000L);
                break;
            case 6:
                ((go0) obj).V(false);
                break;
            case 7:
                ((nt) obj).a();
                break;
            case 8:
                ((ViewTreeObserver.OnPreDrawListener) obj).onPreDraw();
                break;
            case 9:
                ((ku) obj).getClass();
                break;
            case 10:
                nf.f.s(((qu) obj).a.getContext(), "https://play.google.com/store/apps/details?id=com.google.android.webview");
                break;
            case 11:
                vu vuVar = ((uu) obj).a;
                vuVar.n.setVisibility(4);
                vuVar.h.setVisibility(4);
                ImageView imageView = vuVar.x;
                imageView.setEnabled(true);
                imageView.setAlpha(1.0f);
                break;
            case 12:
                ((nv) obj).a(true, true);
                break;
            case 13:
                ix ixVar = (ix) obj;
                if (ixVar.Y.getEmojiView() != null) {
                    kz emojiView = ixVar.Y.getEmojiView();
                    if (!emojiView.f0) {
                        try {
                            int i12 = emojiView.R.s.get(EmojiData.dataColored.length);
                            if (i12 > 0) {
                                emojiView.P.C0();
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
                AndroidUtilities.updateViewShow(((xy) obj).h, true);
                break;
            case 16:
                dz dzVar = (dz) obj;
                ArrayList arrayList = dzVar.r;
                ArrayList arrayList2 = dzVar.h;
                fz fzVar = dzVar.w;
                int i13 = fzVar.M;
                kz kzVar = fzVar.Q;
                sw swVar = kzVar.D0;
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
                    s4.h0 adapter = swVar.getAdapter();
                    fz fzVar2 = kzVar.z0;
                    if (adapter != fzVar2) {
                        swVar.setAdapter(fzVar2);
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
                                org.telegram.ui.tw twVar = (org.telegram.ui.tw) e00Var;
                                int i23 = 0;
                                while (true) {
                                    org.telegram.ui.ty[] tyVarArr = twVar.b.e0;
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
                            k00Var.F.v0(0);
                            org.telegram.ui.sw swVar2 = (org.telegram.ui.sw) k00Var;
                            org.telegram.ui.uy uyVar = swVar2.B0;
                            if (!uyVar.getMessagesController().premiumFeaturesBlocked()) {
                                try {
                                    swVar2.performHapticFeedback(3, 1);
                                } catch (Exception unused2) {
                                }
                                qc I = xc.a0(uyVar).I(R.raw.filter_reorder, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.LimitReachedReorderFolder, LocaleController.getString(R.string.FilterAllChats))), LocaleController.getString(R.string.PremiumMore), 5000, false, new org.telegram.ui.cj(swVar2, 22));
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
                org.telegram.ui.ey eyVar = ((co0) ((e40) obj)).c0;
                if (!eyVar.v0.canScrollVertically(-1)) {
                    eyVar.u0.h1(0, 0);
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
                lj0 lj0Var = w40Var.f;
                if (w40Var.n) {
                    lj0Var.getAnimatedDrawable().K(0);
                    lj0Var.setAnimation(w40Var.r);
                    lj0Var.d();
                    break;
                }
                break;
            case 24:
                b60 b60Var = (b60) ((ci.p2) obj).b;
                try {
                    u71 u71Var = b60Var.R;
                    if (u71Var != null && (videoEditedInfo = b60Var.Q) != null) {
                        if (videoEditedInfo.endTime > 0) {
                            long n10 = u71Var.n();
                            VideoEditedInfo videoEditedInfo2 = b60Var.Q;
                            if (n10 >= videoEditedInfo2.endTime) {
                                u71 u71Var2 = b60Var.R;
                                long j3 = videoEditedInfo2.startTime;
                                u71Var2.K(j3 > 0 ? j3 : 0L);
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
                aa0 aa0Var = (aa0) obj;
                if (aa0Var.d) {
                    aa0Var.e = true;
                    aa0Var.r = false;
                    aa0Var.f = 0.0f;
                    aa0Var.h = SystemClock.uptimeMillis();
                    aa0Var.invalidate();
                    break;
                }
                break;
            case 26:
                ka0 ka0Var = (ka0) obj;
                Activity parentActivity = ka0Var.getParentActivity();
                Activity parentActivity2 = ka0Var.getParentActivity();
                DispatchQueue dispatchQueue = pg.m1.m;
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
                wa0 wa0Var2 = (wa0) obj;
                boolean z11 = wa0Var2.I;
                boolean z12 = !z11;
                gg.q1 q1Var = wa0Var2.e;
                va0 va0Var = wa0Var2.b;
                if (va0Var == null || q1Var == null) {
                    wa0Var2.O = 0;
                    break;
                } else if (wa0Var2.L && (kVar = wa0Var2.K) != null && kVar.f && !z11) {
                    wa0Var2.O = 0;
                    break;
                } else {
                    boolean g10 = wa0Var2.g();
                    if (z11) {
                        int computeVerticalScrollRange = va0Var.computeVerticalScrollRange();
                        float f10 = (computeVerticalScrollRange - q1Var.h) + wa0Var2.s;
                        if (computeVerticalScrollRange <= 0 && wa0Var2.f.K() > 0 && (i10 = wa0Var2.O) < 3) {
                            wa0Var2.O = i10 + 1;
                            wa0Var2.o(true);
                            break;
                        } else {
                            f7 = f10;
                        }
                    } else {
                        f7 = (-wa0Var2.s) - AndroidUtilities.dp(6.0f);
                    }
                    wa0Var2.O = 0;
                    float f11 = wa0Var2.v;
                    float max = g10 ? -Math.max(0.0f, f11 - f7) : Math.max(0.0f, f11 - f7) + (-f11);
                    if (!z11 && !g10) {
                        max += va0Var.computeVerticalScrollOffset();
                    }
                    final float f12 = max;
                    o1.k kVar2 = wa0Var2.K;
                    if (kVar2 != null) {
                        kVar2.c();
                    }
                    wa0Var2.L = z12;
                    final float translationY = va0Var.getTranslationY();
                    final float f13 = wa0Var2.M;
                    float f14 = z11 ? 0.0f : 1.0f;
                    if (translationY == f12) {
                        wa0Var2.K = null;
                        num = Integer.valueOf(!z11 ? 8 : 0);
                        if (wa0Var2.N && !z11) {
                            wa0Var2.N = false;
                            va0Var.setLayoutManager(wa0Var2.getNeededLayoutManager());
                            wa0Var2.I = true;
                            wa0Var2.o(true);
                        }
                        wa0Var = wa0Var2;
                    } else {
                        o1.k kVar3 = new o1.k(new o1.j(translationY));
                        o1.l lVar = new o1.l(f12);
                        lVar.a(1.0f);
                        lVar.b(550.0f);
                        kVar3.u = lVar;
                        wa0Var2.K = kVar3;
                        wa0Var = wa0Var2;
                        final float f15 = f14;
                        kVar3.b(new o1.g() { // from class: org.telegram.ui.Components.na0
                            @Override // o1.g
                            public final void a(o1.h hVar, float f16, float f17) {
                                wa0 wa0Var3 = wa0.this;
                                wa0Var3.b.setTranslationY(f16);
                                wa0Var3.i();
                                float f18 = translationY;
                                wa0Var3.M = AndroidUtilities.lerp(f13, f15, (f16 - f18) / (f12 - f18));
                            }
                        });
                        if (!z11) {
                            wa0Var.K.a(new ci.z4(wa0Var, z12, 2));
                        }
                        wa0Var.K.a(new oa0());
                        wa0Var.K.f();
                    }
                    if (num != null && wa0Var.getVisibility() != num.intValue()) {
                        wa0Var.setVisibility(num.intValue());
                        break;
                    }
                }
                break;
            case 28:
                ((lb0) obj).S.n.l();
                break;
            default:
                ((ic0) obj).a();
                break;
        }
    }

    public /* synthetic */ xp(ku kuVar, m90 m90Var, ClickableSpan clickableSpan) {
        this.a = 9;
        this.b = kuVar;
    }
}
