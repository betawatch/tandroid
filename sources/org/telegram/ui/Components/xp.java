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

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
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
                ((io0) obj).V(false);
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
                ((ov) obj).a(true, true);
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
                            k00Var.F.v0(0);
                            org.telegram.ui.sw swVar = (org.telegram.ui.sw) k00Var;
                            org.telegram.ui.uy uyVar = swVar.B0;
                            if (!uyVar.getMessagesController().premiumFeaturesBlocked()) {
                                try {
                                    swVar.performHapticFeedback(3, 1);
                                } catch (Exception unused2) {
                                }
                                pc I = xc.a0(uyVar).I(R.raw.filter_reorder, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.LimitReachedReorderFolder, LocaleController.getString(R.string.FilterAllChats))), LocaleController.getString(R.string.PremiumMore), 5000, false, new org.telegram.ui.dj(swVar, 22));
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
                org.telegram.ui.ey eyVar = ((eo0) ((e40) obj)).c0;
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
                nj0 nj0Var = w40Var.f;
                if (w40Var.n) {
                    nj0Var.getAnimatedDrawable().K(0);
                    nj0Var.setAnimation(w40Var.r);
                    nj0Var.d();
                    break;
                }
                break;
            case 24:
                c60 c60Var = (c60) ((ci.p2) obj).b;
                try {
                    v71 v71Var = c60Var.T;
                    if (v71Var != null && (videoEditedInfo = c60Var.S) != null && videoEditedInfo.endTime > 0) {
                        long n10 = v71Var.n();
                        VideoEditedInfo videoEditedInfo2 = c60Var.S;
                        if (n10 >= videoEditedInfo2.endTime) {
                            v71 v71Var2 = c60Var.T;
                            long j3 = videoEditedInfo2.startTime;
                            v71Var2.K(j3 > 0 ? j3 : 0L);
                            break;
                        }
                    }
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
                break;
            case 25:
                b60 b60Var = (b60) obj;
                ki.p0 p0Var = b60Var.O;
                if (p0Var != null && p0Var.a == 3) {
                    long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
                    long j10 = b60Var.v0;
                    if (j10 == 0 || elapsedRealtimeNanos - j10 >= 70000000) {
                        b60Var.v();
                        break;
                    }
                }
                break;
            case 26:
                ca0 ca0Var = (ca0) obj;
                if (ca0Var.d) {
                    ca0Var.e = true;
                    ca0Var.r = false;
                    ca0Var.f = 0.0f;
                    ca0Var.h = SystemClock.uptimeMillis();
                    ca0Var.invalidate();
                    break;
                }
                break;
            case 27:
                ma0 ma0Var = (ma0) obj;
                Activity parentActivity = ma0Var.getParentActivity();
                Activity parentActivity2 = ma0Var.getParentActivity();
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
                final ya0 ya0Var = (ya0) obj;
                boolean z11 = ya0Var.I;
                boolean z12 = !z11;
                gg.q1 q1Var = ya0Var.e;
                xa0 xa0Var = ya0Var.b;
                if (xa0Var == null || q1Var == null) {
                    ya0Var.O = 0;
                    break;
                } else if (ya0Var.L && (kVar = ya0Var.K) != null && kVar.f && !z11) {
                    ya0Var.O = 0;
                    break;
                } else {
                    boolean g10 = ya0Var.g();
                    if (z11) {
                        int computeVerticalScrollRange = xa0Var.computeVerticalScrollRange();
                        f7 = (computeVerticalScrollRange - q1Var.h) + ya0Var.s;
                        if (computeVerticalScrollRange <= 0 && ya0Var.f.K() > 0 && (i10 = ya0Var.O) < 3) {
                            ya0Var.O = i10 + 1;
                            ya0Var.o(true);
                            break;
                        }
                    } else {
                        f7 = (-ya0Var.s) - AndroidUtilities.dp(6.0f);
                    }
                    ya0Var.O = 0;
                    float f10 = ya0Var.v;
                    float max = g10 ? -Math.max(0.0f, f10 - f7) : Math.max(0.0f, f10 - f7) + (-f10);
                    if (!z11 && !g10) {
                        max += xa0Var.computeVerticalScrollOffset();
                    }
                    final float f11 = max;
                    o1.k kVar2 = ya0Var.K;
                    if (kVar2 != null) {
                        kVar2.c();
                    }
                    ya0Var.L = z12;
                    final float translationY = xa0Var.getTranslationY();
                    final float f12 = ya0Var.M;
                    float f13 = z11 ? 0.0f : 1.0f;
                    if (translationY == f11) {
                        ya0Var.K = null;
                        num = Integer.valueOf(!z11 ? 8 : 0);
                        if (ya0Var.N && !z11) {
                            ya0Var.N = false;
                            xa0Var.setLayoutManager(ya0Var.getNeededLayoutManager());
                            ya0Var.I = true;
                            ya0Var.o(true);
                        }
                    } else {
                        o1.k kVar3 = new o1.k(new o1.j(translationY));
                        o1.l lVar = new o1.l(f11);
                        lVar.a(1.0f);
                        lVar.b(550.0f);
                        kVar3.u = lVar;
                        ya0Var.K = kVar3;
                        final float f14 = f13;
                        kVar3.b(new o1.g() { // from class: org.telegram.ui.Components.pa0
                            @Override // o1.g
                            public final void a(o1.h hVar, float f15, float f16) {
                                ya0 ya0Var2 = ya0.this;
                                ya0Var2.b.setTranslationY(f15);
                                ya0Var2.i();
                                float f17 = translationY;
                                ya0Var2.M = AndroidUtilities.lerp(f12, f14, (f15 - f17) / (f11 - f17));
                            }
                        });
                        if (!z11) {
                            ya0Var.K.a(new ci.z4(ya0Var, z12, 2));
                        }
                        ya0Var.K.a(new qa0());
                        ya0Var.K.f();
                    }
                    if (num != null && ya0Var.getVisibility() != num.intValue()) {
                        ya0Var.setVisibility(num.intValue());
                        break;
                    }
                }
                break;
            default:
                ((nb0) obj).S.n.l();
                break;
        }
    }

    public /* synthetic */ xp(ku kuVar, o90 o90Var, ClickableSpan clickableSpan) {
        this.a = 9;
        this.b = kuVar;
    }
}
