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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class rp implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ rp(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        VideoEditedInfo videoEditedInfo;
        float f9;
        int i10;
        final ka0 ka0Var;
        o1.k kVar;
        int i11 = this.a;
        Integer num = null;
        Object obj = this.b;
        switch (i11) {
            case 0:
                ((wp) obj).dismiss();
                break;
            case 1:
                ((lq) obj).a();
                break;
            case 2:
                ((org.telegram.ui.ActionBar.f3) obj).dismiss();
                org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                if (U != null) {
                    U.presentFragment(new PremiumPreviewFragment(0, "create_bot"));
                    break;
                }
                break;
            case 3:
                ar arVar = ((yq) obj).c;
                TLRPC.Peer peer = arVar.Z;
                org.telegram.ui.ActionBar.o2 o2Var = arVar.b0;
                fr frVar = new fr(o2Var, peer, arVar.c0, arVar.U.size() > 1, arVar.T);
                if (o2Var.getParentActivity() != null) {
                    o2Var.showDialog(frVar);
                    break;
                } else {
                    frVar.show();
                    break;
                }
            case 4:
                ((nh.d) obj).setLoading(true);
                break;
            case 5:
                ds dsVar = (ds) obj;
                dsVar.a.a(!r0.f, true);
                AndroidUtilities.runOnUIThread(dsVar.f, 3000L);
                break;
            case 6:
                ((on0) obj).V(false);
                break;
            case 7:
                ((et) obj).a();
                break;
            case 8:
                ((ViewTreeObserver.OnPreDrawListener) obj).onPreDraw();
                break;
            case 9:
                ((bu) obj).getClass();
                break;
            case 10:
                ye.d.s(((hu) obj).a.getContext(), "https://play.google.com/store/apps/details?id=com.google.android.webview");
                break;
            case 11:
                mu muVar = ((lu) obj).a;
                muVar.n.setVisibility(4);
                muVar.h.setVisibility(4);
                ImageView imageView = muVar.x;
                imageView.setEnabled(true);
                imageView.setAlpha(1.0f);
                break;
            case 12:
                ((ev) obj).a(true, true);
                break;
            case 13:
                bx bxVar = (bx) obj;
                if (bxVar.U.getEmojiView() != null) {
                    fz emojiView = bxVar.U.getEmojiView();
                    if (!emojiView.b0) {
                        try {
                            int i12 = emojiView.N.s.get(EmojiData.dataColored.length);
                            if (i12 > 0) {
                                emojiView.L.B0();
                                emojiView.W(i12);
                                emojiView.H(i12, AndroidUtilities.dp(-9.0f));
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
                vx vxVar = (vx) obj;
                vxVar.s.f = true;
                vxVar.a(true);
                break;
            case 15:
                AndroidUtilities.updateViewShow(((ry) obj).h, true);
                break;
            case 16:
                yy yyVar = (yy) obj;
                ArrayList arrayList = yyVar.r;
                ArrayList arrayList2 = yyVar.h;
                az azVar = yyVar.w;
                int i13 = azVar.I;
                fz fzVar = azVar.M;
                lw lwVar = fzVar.z0;
                if (i13 == yyVar.b) {
                    arrayList2.remove(arrayList);
                    azVar.A = yyVar.c;
                    azVar.B = yyVar.d;
                    azVar.C = yyVar.e;
                    azVar.D = yyVar.f;
                    azVar.E = arrayList2;
                    azVar.F = yyVar.n;
                    azVar.G = new ArrayList(arrayList);
                    fzVar.C0.e(false);
                    f2.p0 adapter = lwVar.getAdapter();
                    az azVar2 = fzVar.v0;
                    if (adapter != azVar2) {
                        lwVar.setAdapter(azVar2);
                    }
                    azVar.l();
                    break;
                }
                break;
            case 17:
                f00 f00Var = ((e00) obj).e;
                ArrayList arrayList3 = f00Var.h;
                if (!UserConfig.getInstance(UserConfig.selectedAccount).isPremium()) {
                    int i14 = 0;
                    while (i14 < arrayList3.size()) {
                        if (((c00) arrayList3.get(i14)).e && i14 != 0) {
                            b00 b00Var = f00Var.E;
                            f00 f00Var2 = b00Var.d;
                            ArrayList arrayList4 = f00Var2.h;
                            SparseIntArray sparseIntArray = f00Var2.g0;
                            int size = arrayList4.size();
                            if (i14 >= 0 && i14 < size) {
                                ArrayList<MessagesController.DialogFilter> dialogFilters = MessagesController.getInstance(UserConfig.selectedAccount).getDialogFilters();
                                int i15 = sparseIntArray.get(i14);
                                int i16 = ((c00) arrayList4.get(i14)).a;
                                for (int i17 = i14 - 1; i17 >= 0; i17--) {
                                    sparseIntArray.put(i17 + 1, sparseIntArray.get(i17));
                                }
                                MessagesController.DialogFilter remove = dialogFilters.remove(i14);
                                remove.order = 0;
                                dialogFilters.add(0, remove);
                                sparseIntArray.put(0, i15);
                                arrayList4.add(0, (c00) arrayList4.remove(i14));
                                ((c00) arrayList4.get(0)).a = i16;
                                for (int i18 = 0; i18 <= i14; i18++) {
                                    ((c00) arrayList4.get(i18)).a = i18;
                                    dialogFilters.get(i18).order = i18;
                                }
                                int i19 = 0;
                                while (i19 <= i14) {
                                    if (f00Var2.G == i19) {
                                        int i20 = i19 == i14 ? 0 : i19 + 1;
                                        f00Var2.H = i20;
                                        f00Var2.G = i20;
                                    }
                                    if (f00Var2.m0 == i19) {
                                        int i21 = i19 == i14 ? 0 : i19 + 1;
                                        f00Var2.n0 = i21;
                                        f00Var2.m0 = i21;
                                    }
                                    i19++;
                                }
                                b00Var.p(i14, 0);
                                a00 a00Var = f00Var2.F;
                                int i22 = ((c00) arrayList4.get(i14)).a;
                                org.telegram.ui.fw fwVar = (org.telegram.ui.fw) a00Var;
                                int i23 = 0;
                                while (true) {
                                    org.telegram.ui.ey[] eyVarArr = fwVar.b.a0;
                                    if (i23 < eyVarArr.length) {
                                        org.telegram.ui.ey eyVar = eyVarArr[i23];
                                        int i24 = eyVar.h;
                                        if (i24 == i22) {
                                            eyVar.h = i16;
                                        } else if (i24 == i16) {
                                            eyVar.h = i22;
                                        }
                                        i23++;
                                    } else {
                                        f00Var2.j();
                                        f00Var2.y = true;
                                        f00Var2.B.setItemAnimator(f00Var2.o0);
                                    }
                                }
                            }
                            f00Var.B.u0(0);
                            org.telegram.ui.ew ewVar = (org.telegram.ui.ew) f00Var;
                            org.telegram.ui.fy fyVar = ewVar.x0;
                            if (!fyVar.getMessagesController().premiumFeaturesBlocked()) {
                                try {
                                    ewVar.performHapticFeedback(3, 1);
                                } catch (Exception unused2) {
                                }
                                mc I = tc.a0(fyVar).I(R.raw.filter_reorder, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.LimitReachedReorderFolder, LocaleController.getString(R.string.FilterAllChats))), LocaleController.getString(R.string.PremiumMore), 5000, false, new org.telegram.ui.ui(ewVar, 22));
                                I.k(true);
                                fyVar.j3 = I;
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
                n00 n00Var = (n00) obj;
                if (!n00Var.c) {
                    n00Var.setLayerType(0, null);
                    break;
                }
                break;
            case 19:
                ((w20) obj).g(true);
                break;
            case 20:
                org.telegram.ui.ox oxVar = ((kn0) ((c40) obj)).Y;
                if (!oxVar.q0.canScrollVertically(-1)) {
                    oxVar.p0.h1(0, 0);
                    break;
                }
                break;
            case 21:
                ((e40) obj).b.b(true);
                break;
            case 22:
                ((e40) obj).b.b(true);
                break;
            case 23:
                u40 u40Var = (u40) obj;
                aj0 aj0Var = u40Var.f;
                if (u40Var.n) {
                    aj0Var.getAnimatedDrawable().I(0);
                    aj0Var.setAnimation(u40Var.r);
                    aj0Var.d();
                    break;
                }
                break;
            case 24:
                s50 s50Var = (s50) ((nh.g2) obj).b;
                try {
                    x61 x61Var = s50Var.K;
                    if (x61Var != null && (videoEditedInfo = s50Var.J) != null) {
                        if (videoEditedInfo.endTime > 0) {
                            long o10 = x61Var.o();
                            VideoEditedInfo videoEditedInfo2 = s50Var.J;
                            if (o10 >= videoEditedInfo2.endTime) {
                                x61 x61Var2 = s50Var.K;
                                long j10 = videoEditedInfo2.startTime;
                                x61Var2.L(j10 > 0 ? j10 : 0L);
                                break;
                            }
                        }
                    }
                } catch (Exception e10) {
                    FileLog.e(e10);
                    return;
                }
                break;
            case 25:
                n90 n90Var = (n90) obj;
                if (n90Var.d) {
                    n90Var.e = true;
                    n90Var.r = false;
                    n90Var.f = 0.0f;
                    n90Var.h = SystemClock.uptimeMillis();
                    n90Var.invalidate();
                    break;
                }
                break;
            case 26:
                y90 y90Var = (y90) obj;
                Activity parentActivity = y90Var.getParentActivity();
                Activity parentActivity2 = y90Var.getParentActivity();
                DispatchQueue dispatchQueue = ag.d2.m;
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
                ka0 ka0Var2 = (ka0) obj;
                boolean z11 = ka0Var2.E;
                boolean z12 = !z11;
                rf.a1 a1Var = ka0Var2.e;
                ja0 ja0Var = ka0Var2.b;
                if (ja0Var == null || a1Var == null) {
                    ka0Var2.K = 0;
                    break;
                } else if (ka0Var2.H && (kVar = ka0Var2.G) != null && kVar.f && !z11) {
                    ka0Var2.K = 0;
                    break;
                } else {
                    boolean g10 = ka0Var2.g();
                    if (z11) {
                        int computeVerticalScrollRange = ja0Var.computeVerticalScrollRange();
                        float f10 = (computeVerticalScrollRange - a1Var.h) + ka0Var2.s;
                        if (computeVerticalScrollRange <= 0 && ka0Var2.f.K() > 0 && (i10 = ka0Var2.K) < 3) {
                            ka0Var2.K = i10 + 1;
                            ka0Var2.o(true);
                            break;
                        } else {
                            f9 = f10;
                        }
                    } else {
                        f9 = (-ka0Var2.s) - AndroidUtilities.dp(6.0f);
                    }
                    ka0Var2.K = 0;
                    float f11 = ka0Var2.v;
                    float max = g10 ? -Math.max(0.0f, f11 - f9) : Math.max(0.0f, f11 - f9) + (-f11);
                    if (!z11 && !g10) {
                        max += ja0Var.computeVerticalScrollOffset();
                    }
                    final float f12 = max;
                    o1.k kVar2 = ka0Var2.G;
                    if (kVar2 != null) {
                        kVar2.c();
                    }
                    ka0Var2.H = z12;
                    final float translationY = ja0Var.getTranslationY();
                    final float f13 = ka0Var2.I;
                    float f14 = z11 ? 0.0f : 1.0f;
                    if (translationY == f12) {
                        ka0Var2.G = null;
                        num = Integer.valueOf(!z11 ? 8 : 0);
                        if (ka0Var2.J && !z11) {
                            ka0Var2.J = false;
                            ja0Var.setLayoutManager(ka0Var2.getNeededLayoutManager());
                            ka0Var2.E = true;
                            ka0Var2.o(true);
                        }
                        ka0Var = ka0Var2;
                    } else {
                        o1.k kVar3 = new o1.k(new ib.a(translationY));
                        o1.l lVar = new o1.l(f12);
                        lVar.a(1.0f);
                        lVar.b(550.0f);
                        kVar3.u = lVar;
                        ka0Var2.G = kVar3;
                        ka0Var = ka0Var2;
                        final float f15 = f14;
                        kVar3.b(new o1.h() { // from class: org.telegram.ui.Components.ba0
                            @Override // o1.h
                            public final void a(o1.i iVar, float f16, float f17) {
                                ka0 ka0Var3 = ka0.this;
                                ka0Var3.b.setTranslationY(f16);
                                ka0Var3.i();
                                float f18 = translationY;
                                ka0Var3.I = AndroidUtilities.lerp(f13, f15, (f16 - f18) / (f12 - f18));
                            }
                        });
                        if (!z11) {
                            ka0Var.G.a(new bg.a0(ka0Var, z12, 2));
                        }
                        ka0Var.G.a(new ca0());
                        ka0Var.G.f();
                    }
                    if (num != null && ka0Var.getVisibility() != num.intValue()) {
                        ka0Var.setVisibility(num.intValue());
                        break;
                    }
                }
                break;
            case 28:
                ((za0) obj).S.n.l();
                break;
            default:
                ((vb0) obj).a();
                break;
        }
    }

    public /* synthetic */ rp(bu buVar, z80 z80Var, ClickableSpan clickableSpan) {
        this.a = 9;
        this.b = buVar;
    }
}
