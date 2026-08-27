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

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class lp implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ lp(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        VideoEditedInfo videoEditedInfo;
        float f10;
        int i10;
        final aa0 aa0Var;
        o1.j jVar;
        int i11 = this.a;
        Integer num = null;
        Object obj = this.b;
        switch (i11) {
            case 0:
                ((qp) obj).dismiss();
                break;
            case 1:
                ((fq) obj).a();
                break;
            case 2:
                ((org.telegram.ui.ActionBar.e3) obj).dismiss();
                org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                if (U != null) {
                    U.presentFragment(new PremiumPreviewFragment(0, "create_bot"));
                    break;
                }
                break;
            case 3:
                uq uqVar = ((sq) obj).c;
                TLRPC.Peer peer = uqVar.Z;
                org.telegram.ui.ActionBar.n2 n2Var = uqVar.b0;
                ar arVar = new ar(n2Var, peer, uqVar.c0, uqVar.U.size() > 1, uqVar.T);
                if (n2Var.getParentActivity() != null) {
                    n2Var.showDialog(arVar);
                    break;
                } else {
                    arVar.show();
                    break;
                }
            case 4:
                ((lh.d) obj).setLoading(true);
                break;
            case 5:
                xr xrVar = (xr) obj;
                xrVar.a.a(!r0.f, true);
                AndroidUtilities.runOnUIThread(xrVar.f, 3000L);
                break;
            case 6:
                ((en0) obj).V(false);
                break;
            case 7:
                ((ys) obj).a();
                break;
            case 8:
                ((ViewTreeObserver.OnPreDrawListener) obj).onPreDraw();
                break;
            case 9:
                ((ut) obj).getClass();
                break;
            case 10:
                we.e.s(((au) obj).a.getContext(), "https://play.google.com/store/apps/details?id=com.google.android.webview");
                break;
            case 11:
                fu fuVar = ((eu) obj).a;
                fuVar.n.setVisibility(4);
                fuVar.h.setVisibility(4);
                ImageView imageView = fuVar.x;
                imageView.setEnabled(true);
                imageView.setAlpha(1.0f);
                break;
            case 12:
                ((xu) obj).a(true, true);
                break;
            case 13:
                uw uwVar = (uw) obj;
                if (uwVar.U.getEmojiView() != null) {
                    yy emojiView = uwVar.U.getEmojiView();
                    if (!emojiView.b0) {
                        try {
                            int i12 = emojiView.N.s.get(EmojiData.dataColored.length);
                            if (i12 > 0) {
                                emojiView.L.B0();
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
                ox oxVar = (ox) obj;
                oxVar.s.f = true;
                oxVar.a(true);
                break;
            case 15:
                AndroidUtilities.updateViewShow(((ky) obj).h, true);
                break;
            case 16:
                ry ryVar = (ry) obj;
                ArrayList arrayList = ryVar.r;
                ArrayList arrayList2 = ryVar.h;
                ty tyVar = ryVar.w;
                int i13 = tyVar.I;
                yy yyVar = tyVar.M;
                ew ewVar = yyVar.z0;
                if (i13 == ryVar.b) {
                    arrayList2.remove(arrayList);
                    tyVar.A = ryVar.c;
                    tyVar.B = ryVar.d;
                    tyVar.C = ryVar.e;
                    tyVar.D = ryVar.f;
                    tyVar.E = arrayList2;
                    tyVar.F = ryVar.n;
                    tyVar.G = new ArrayList(arrayList);
                    yyVar.C0.e(false);
                    f2.q0 adapter = ewVar.getAdapter();
                    ty tyVar2 = yyVar.v0;
                    if (adapter != tyVar2) {
                        ewVar.setAdapter(tyVar2);
                    }
                    tyVar.l();
                    break;
                }
                break;
            case 17:
                yz yzVar = ((xz) obj).e;
                ArrayList arrayList3 = yzVar.h;
                if (!UserConfig.getInstance(UserConfig.selectedAccount).isPremium()) {
                    int i14 = 0;
                    while (i14 < arrayList3.size()) {
                        if (((vz) arrayList3.get(i14)).e && i14 != 0) {
                            uz uzVar = yzVar.E;
                            yz yzVar2 = uzVar.d;
                            ArrayList arrayList4 = yzVar2.h;
                            SparseIntArray sparseIntArray = yzVar2.g0;
                            int size = arrayList4.size();
                            if (i14 >= 0 && i14 < size) {
                                ArrayList<MessagesController.DialogFilter> dialogFilters = MessagesController.getInstance(UserConfig.selectedAccount).getDialogFilters();
                                int i15 = sparseIntArray.get(i14);
                                int i16 = ((vz) arrayList4.get(i14)).a;
                                for (int i17 = i14 - 1; i17 >= 0; i17--) {
                                    sparseIntArray.put(i17 + 1, sparseIntArray.get(i17));
                                }
                                MessagesController.DialogFilter remove = dialogFilters.remove(i14);
                                remove.order = 0;
                                dialogFilters.add(0, remove);
                                sparseIntArray.put(0, i15);
                                arrayList4.add(0, (vz) arrayList4.remove(i14));
                                ((vz) arrayList4.get(0)).a = i16;
                                for (int i18 = 0; i18 <= i14; i18++) {
                                    ((vz) arrayList4.get(i18)).a = i18;
                                    dialogFilters.get(i18).order = i18;
                                }
                                int i19 = 0;
                                while (i19 <= i14) {
                                    if (yzVar2.G == i19) {
                                        int i20 = i19 == i14 ? 0 : i19 + 1;
                                        yzVar2.H = i20;
                                        yzVar2.G = i20;
                                    }
                                    if (yzVar2.m0 == i19) {
                                        int i21 = i19 == i14 ? 0 : i19 + 1;
                                        yzVar2.n0 = i21;
                                        yzVar2.m0 = i21;
                                    }
                                    i19++;
                                }
                                uzVar.p(i14, 0);
                                tz tzVar = yzVar2.F;
                                int i22 = ((vz) arrayList4.get(i14)).a;
                                org.telegram.ui.gw gwVar = (org.telegram.ui.gw) tzVar;
                                int i23 = 0;
                                while (true) {
                                    org.telegram.ui.fy[] fyVarArr = gwVar.b.a0;
                                    if (i23 < fyVarArr.length) {
                                        org.telegram.ui.fy fyVar = fyVarArr[i23];
                                        int i24 = fyVar.h;
                                        if (i24 == i22) {
                                            fyVar.h = i16;
                                        } else if (i24 == i16) {
                                            fyVar.h = i22;
                                        }
                                        i23++;
                                    } else {
                                        yzVar2.j();
                                        yzVar2.y = true;
                                        yzVar2.B.setItemAnimator(yzVar2.o0);
                                    }
                                }
                            }
                            yzVar.B.u0(0);
                            org.telegram.ui.fw fwVar = (org.telegram.ui.fw) yzVar;
                            org.telegram.ui.gy gyVar = fwVar.x0;
                            if (!gyVar.getMessagesController().premiumFeaturesBlocked()) {
                                try {
                                    fwVar.performHapticFeedback(3, 1);
                                } catch (Exception unused2) {
                                }
                                ec I = mc.a0(gyVar).I(R.raw.filter_reorder, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.LimitReachedReorderFolder, LocaleController.getString(R.string.FilterAllChats))), LocaleController.getString(R.string.PremiumMore), 5000, false, new org.telegram.ui.ti(fwVar, 22));
                                I.k(true);
                                gyVar.j3 = I;
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
                f00 f00Var = (f00) obj;
                if (!f00Var.c) {
                    f00Var.setLayerType(0, null);
                    break;
                }
                break;
            case 19:
                ((n20) obj).g(true);
                break;
            case 20:
                org.telegram.ui.px pxVar = ((an0) ((t30) obj)).Y;
                if (!pxVar.q0.canScrollVertically(-1)) {
                    pxVar.p0.h1(0, 0);
                    break;
                }
                break;
            case 21:
                ((v30) obj).b.b(true);
                break;
            case 22:
                ((v30) obj).b.b(true);
                break;
            case 23:
                l40 l40Var = (l40) obj;
                ri0 ri0Var = l40Var.f;
                if (l40Var.n) {
                    ri0Var.getAnimatedDrawable().I(0);
                    ri0Var.setAnimation(l40Var.r);
                    ri0Var.d();
                    break;
                }
                break;
            case 24:
                k50 k50Var = (k50) ((lh.h2) obj).b;
                try {
                    m61 m61Var = k50Var.K;
                    if (m61Var != null && (videoEditedInfo = k50Var.J) != null) {
                        if (videoEditedInfo.endTime > 0) {
                            long o10 = m61Var.o();
                            VideoEditedInfo videoEditedInfo2 = k50Var.J;
                            if (o10 >= videoEditedInfo2.endTime) {
                                m61 m61Var2 = k50Var.K;
                                long j10 = videoEditedInfo2.startTime;
                                m61Var2.L(j10 > 0 ? j10 : 0L);
                                break;
                            }
                        }
                    }
                } catch (Exception e9) {
                    FileLog.e(e9);
                    return;
                }
                break;
            case 25:
                e90 e90Var = (e90) obj;
                if (e90Var.d) {
                    e90Var.e = true;
                    e90Var.r = false;
                    e90Var.f = 0.0f;
                    e90Var.h = SystemClock.uptimeMillis();
                    e90Var.invalidate();
                    break;
                }
                break;
            case 26:
                o90 o90Var = (o90) obj;
                Activity parentActivity = o90Var.getParentActivity();
                Activity parentActivity2 = o90Var.getParentActivity();
                DispatchQueue dispatchQueue = yf.j1.m;
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
                aa0 aa0Var2 = (aa0) obj;
                boolean z11 = aa0Var2.E;
                boolean z12 = !z11;
                pf.z0 z0Var = aa0Var2.e;
                z90 z90Var = aa0Var2.b;
                if (z90Var == null || z0Var == null) {
                    aa0Var2.K = 0;
                    break;
                } else if (aa0Var2.H && (jVar = aa0Var2.G) != null && jVar.f && !z11) {
                    aa0Var2.K = 0;
                    break;
                } else {
                    boolean g10 = aa0Var2.g();
                    if (z11) {
                        int computeVerticalScrollRange = z90Var.computeVerticalScrollRange();
                        float f11 = (computeVerticalScrollRange - z0Var.h) + aa0Var2.s;
                        if (computeVerticalScrollRange <= 0 && aa0Var2.f.K() > 0 && (i10 = aa0Var2.K) < 3) {
                            aa0Var2.K = i10 + 1;
                            aa0Var2.o(true);
                            break;
                        } else {
                            f10 = f11;
                        }
                    } else {
                        f10 = (-aa0Var2.s) - AndroidUtilities.dp(6.0f);
                    }
                    aa0Var2.K = 0;
                    float f12 = aa0Var2.v;
                    float max = g10 ? -Math.max(0.0f, f12 - f10) : Math.max(0.0f, f12 - f10) + (-f12);
                    if (!z11 && !g10) {
                        max += z90Var.computeVerticalScrollOffset();
                    }
                    final float f13 = max;
                    o1.j jVar2 = aa0Var2.G;
                    if (jVar2 != null) {
                        jVar2.c();
                    }
                    aa0Var2.H = z12;
                    final float translationY = z90Var.getTranslationY();
                    final float f14 = aa0Var2.I;
                    float f15 = z11 ? 0.0f : 1.0f;
                    if (translationY == f13) {
                        aa0Var2.G = null;
                        num = Integer.valueOf(!z11 ? 8 : 0);
                        if (aa0Var2.J && !z11) {
                            aa0Var2.J = false;
                            z90Var.setLayoutManager(aa0Var2.getNeededLayoutManager());
                            aa0Var2.E = true;
                            aa0Var2.o(true);
                        }
                        aa0Var = aa0Var2;
                    } else {
                        o1.j jVar3 = new o1.j(new hb.a(translationY));
                        o1.k kVar = new o1.k(f13);
                        kVar.a(1.0f);
                        kVar.b(550.0f);
                        jVar3.u = kVar;
                        aa0Var2.G = jVar3;
                        aa0Var = aa0Var2;
                        final float f16 = f15;
                        jVar3.b(new o1.g() { // from class: org.telegram.ui.Components.r90
                            @Override // o1.g
                            public final void a(o1.h hVar, float f17, float f18) {
                                aa0 aa0Var3 = aa0.this;
                                aa0Var3.b.setTranslationY(f17);
                                aa0Var3.i();
                                float f19 = translationY;
                                aa0Var3.I = AndroidUtilities.lerp(f14, f16, (f17 - f19) / (f13 - f19));
                            }
                        });
                        if (!z11) {
                            aa0Var.G.a(new lh.p4(aa0Var, z12, 2));
                        }
                        aa0Var.G.a(new s90());
                        aa0Var.G.f();
                    }
                    if (num != null && aa0Var.getVisibility() != num.intValue()) {
                        aa0Var.setVisibility(num.intValue());
                        break;
                    }
                }
                break;
            case 28:
                ((oa0) obj).S.n.l();
                break;
            default:
                ((kb0) obj).a();
                break;
        }
    }

    public /* synthetic */ lp(ut utVar, q80 q80Var, ClickableSpan clickableSpan) {
        this.a = 9;
        this.b = utVar;
    }
}
