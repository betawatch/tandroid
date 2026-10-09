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

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final /* synthetic */ class nq implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ nq(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        VideoEditedInfo videoEditedInfo;
        float f7;
        int i10;
        final pb0 pb0Var;
        o1.k kVar;
        int i11 = this.a;
        Integer num = null;
        Object obj = this.b;
        switch (i11) {
            case 0:
                ((sq) obj).dismiss();
                break;
            case 1:
                ((hr) obj).a();
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
                wr wrVar = ((ur) obj).c;
                TLRPC.Peer peer = wrVar.d0;
                org.telegram.ui.ActionBar.n2 n2Var = wrVar.f0;
                ds dsVar = new ds(n2Var, peer, wrVar.g0, wrVar.Y.size() > 1, wrVar.X);
                if (n2Var.getParentActivity() != null) {
                    n2Var.showDialog(dsVar);
                    break;
                } else {
                    dsVar.show();
                    break;
                }
            case 4:
                ((ci.d) obj).setLoading(true);
                break;
            case 5:
                ys ysVar = (ys) obj;
                ysVar.a.a(!r0.f, true);
                AndroidUtilities.runOnUIThread(ysVar.f, 3000L);
                break;
            case 6:
                ((yo0) obj).V(false);
                break;
            case 7:
                ((du) obj).a();
                break;
            case 8:
                ((ViewTreeObserver.OnPreDrawListener) obj).onPreDraw();
                break;
            case 9:
                ((av) obj).getClass();
                break;
            case 10:
                of.f.s(((gv) obj).a.getContext(), "https://play.google.com/store/apps/details?id=com.google.android.webview");
                break;
            case 11:
                lv lvVar = ((kv) obj).a;
                lvVar.n.setVisibility(4);
                lvVar.h.setVisibility(4);
                ImageView imageView = lvVar.x;
                imageView.setEnabled(true);
                imageView.setAlpha(1.0f);
                break;
            case 12:
                ((dw) obj).a(true, true);
                break;
            case 13:
                xx xxVar = (xx) obj;
                if (xxVar.Y.getEmojiView() != null) {
                    a00 emojiView = xxVar.Y.getEmojiView();
                    if (!emojiView.f0) {
                        try {
                            int i12 = emojiView.R.s.get(EmojiData.dataColored.length);
                            if (i12 > 0) {
                                emojiView.P.B0();
                                emojiView.U(i12);
                                emojiView.G(i12, AndroidUtilities.dp(-9.0f));
                                emojiView.o(0, null);
                                break;
                            }
                        } catch (Exception unused) {
                            return;
                        }
                    }
                }
                break;
            case 14:
                ry ryVar = (ry) obj;
                ryVar.s.f = true;
                ryVar.a(true);
                break;
            case 15:
                AndroidUtilities.updateViewShow(((mz) obj).h, true);
                break;
            case 16:
                tz tzVar = (tz) obj;
                ArrayList arrayList = tzVar.r;
                ArrayList arrayList2 = tzVar.h;
                vz vzVar = tzVar.w;
                int i13 = vzVar.M;
                a00 a00Var = vzVar.Q;
                ix ixVar = a00Var.D0;
                if (i13 == tzVar.b) {
                    arrayList2.remove(arrayList);
                    vzVar.E = tzVar.c;
                    vzVar.F = tzVar.d;
                    vzVar.G = tzVar.e;
                    vzVar.H = tzVar.f;
                    vzVar.I = arrayList2;
                    vzVar.J = tzVar.n;
                    vzVar.K = new ArrayList(arrayList);
                    a00Var.G0.e(false);
                    s4.i0 adapter = ixVar.getAdapter();
                    vz vzVar2 = a00Var.z0;
                    if (adapter != vzVar2) {
                        ixVar.setAdapter(vzVar2);
                    }
                    vzVar.l();
                    break;
                }
                break;
            case 17:
                a10 a10Var = ((z00) obj).e;
                ArrayList arrayList3 = a10Var.h;
                if (!UserConfig.getInstance(UserConfig.selectedAccount).isPremium()) {
                    int i14 = 0;
                    while (i14 < arrayList3.size()) {
                        if (((w00) arrayList3.get(i14)).e && i14 != 0) {
                            v00 v00Var = a10Var.I;
                            a10 a10Var2 = v00Var.d;
                            ArrayList arrayList4 = a10Var2.h;
                            SparseIntArray sparseIntArray = a10Var2.k0;
                            int size = arrayList4.size();
                            if (i14 >= 0 && i14 < size) {
                                ArrayList<MessagesController.DialogFilter> dialogFilters = MessagesController.getInstance(UserConfig.selectedAccount).getDialogFilters();
                                int i15 = sparseIntArray.get(i14);
                                int i16 = ((w00) arrayList4.get(i14)).a;
                                for (int i17 = i14 - 1; i17 >= 0; i17--) {
                                    sparseIntArray.put(i17 + 1, sparseIntArray.get(i17));
                                }
                                MessagesController.DialogFilter remove = dialogFilters.remove(i14);
                                remove.order = 0;
                                dialogFilters.add(0, remove);
                                sparseIntArray.put(0, i15);
                                arrayList4.add(0, (w00) arrayList4.remove(i14));
                                ((w00) arrayList4.get(0)).a = i16;
                                for (int i18 = 0; i18 <= i14; i18++) {
                                    ((w00) arrayList4.get(i18)).a = i18;
                                    dialogFilters.get(i18).order = i18;
                                }
                                int i19 = 0;
                                while (i19 <= i14) {
                                    if (a10Var2.K == i19) {
                                        int i20 = i19 == i14 ? 0 : i19 + 1;
                                        a10Var2.L = i20;
                                        a10Var2.K = i20;
                                    }
                                    if (a10Var2.q0 == i19) {
                                        int i21 = i19 == i14 ? 0 : i19 + 1;
                                        a10Var2.r0 = i21;
                                        a10Var2.q0 = i21;
                                    }
                                    i19++;
                                }
                                v00Var.p(i14, 0);
                                u00 u00Var = a10Var2.J;
                                int i22 = ((w00) arrayList4.get(i14)).a;
                                org.telegram.ui.sw swVar = (org.telegram.ui.sw) u00Var;
                                int i23 = 0;
                                while (true) {
                                    org.telegram.ui.sy[] syVarArr = swVar.b.e0;
                                    if (i23 < syVarArr.length) {
                                        org.telegram.ui.sy syVar = syVarArr[i23];
                                        int i24 = syVar.h;
                                        if (i24 == i22) {
                                            syVar.h = i16;
                                        } else if (i24 == i16) {
                                            syVar.h = i22;
                                        }
                                        i23++;
                                    } else {
                                        a10Var2.j();
                                        a10Var2.y = true;
                                        a10Var2.F.setItemAnimator(a10Var2.s0);
                                    }
                                }
                            }
                            a10Var.F.u0(0);
                            org.telegram.ui.qw qwVar = (org.telegram.ui.qw) a10Var;
                            org.telegram.ui.ty tyVar = qwVar.B0;
                            if (!tyVar.getMessagesController().premiumFeaturesBlocked()) {
                                try {
                                    qwVar.performHapticFeedback(3, 1);
                                } catch (Exception unused2) {
                                }
                                tc I = ad.a0(tyVar).I(R.raw.filter_reorder, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.LimitReachedReorderFolder, LocaleController.getString(R.string.FilterAllChats))), LocaleController.getString(R.string.PremiumMore), 5000, false, new org.telegram.ui.cj(qwVar, 23));
                                I.k(true);
                                tyVar.n3 = I;
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
                h10 h10Var = (h10) obj;
                if (!h10Var.c) {
                    h10Var.setLayerType(0, null);
                    break;
                }
                break;
            case 19:
                ((q30) obj).g(true);
                break;
            case 20:
                org.telegram.ui.dy dyVar = ((uo0) ((v40) obj)).c0;
                if (!dyVar.u0.canScrollVertically(-1)) {
                    dyVar.t0.h1(0, 0);
                    break;
                }
                break;
            case 21:
                ((x40) obj).b.b(true);
                break;
            case 22:
                ((x40) obj).b.b(true);
                break;
            case 23:
                o50 o50Var = (o50) obj;
                fk0 fk0Var = o50Var.f;
                if (o50Var.n) {
                    fk0Var.getAnimatedDrawable().K(0);
                    fk0Var.setAnimation(o50Var.r);
                    fk0Var.d();
                    break;
                }
                break;
            case 24:
                t60 t60Var = (t60) ((ci.n2) obj).b;
                try {
                    k81 k81Var = t60Var.T;
                    if (k81Var != null && (videoEditedInfo = t60Var.S) != null) {
                        if (videoEditedInfo.endTime > 0) {
                            long n10 = k81Var.n();
                            VideoEditedInfo videoEditedInfo2 = t60Var.S;
                            if (n10 >= videoEditedInfo2.endTime) {
                                k81 k81Var2 = t60Var.T;
                                long j3 = videoEditedInfo2.startTime;
                                k81Var2.K(j3 > 0 ? j3 : 0L);
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
                ta0 ta0Var = (ta0) obj;
                if (ta0Var.d) {
                    ta0Var.e = true;
                    ta0Var.r = false;
                    ta0Var.f = 0.0f;
                    ta0Var.h = SystemClock.uptimeMillis();
                    ta0Var.invalidate();
                    break;
                }
                break;
            case 26:
                db0 db0Var = (db0) obj;
                Activity parentActivity = db0Var.getParentActivity();
                Activity parentActivity2 = db0Var.getParentActivity();
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
                pb0 pb0Var2 = (pb0) obj;
                boolean z11 = pb0Var2.I;
                boolean z12 = !z11;
                gg.p1 p1Var = pb0Var2.e;
                ob0 ob0Var = pb0Var2.b;
                if (ob0Var == null || p1Var == null) {
                    pb0Var2.O = 0;
                    break;
                } else if (pb0Var2.L && (kVar = pb0Var2.K) != null && kVar.f && !z11) {
                    pb0Var2.O = 0;
                    break;
                } else {
                    boolean g10 = pb0Var2.g();
                    if (z11) {
                        int computeVerticalScrollRange = ob0Var.computeVerticalScrollRange();
                        float f10 = (computeVerticalScrollRange - p1Var.h) + pb0Var2.s;
                        if (computeVerticalScrollRange <= 0 && pb0Var2.f.K() > 0 && (i10 = pb0Var2.O) < 3) {
                            pb0Var2.O = i10 + 1;
                            pb0Var2.o(true);
                            break;
                        } else {
                            f7 = f10;
                        }
                    } else {
                        f7 = (-pb0Var2.s) - AndroidUtilities.dp(6.0f);
                    }
                    pb0Var2.O = 0;
                    float f11 = pb0Var2.v;
                    float max = g10 ? -Math.max(0.0f, f11 - f7) : Math.max(0.0f, f11 - f7) + (-f11);
                    if (!z11 && !g10) {
                        max += ob0Var.computeVerticalScrollOffset();
                    }
                    final float f12 = max;
                    o1.k kVar2 = pb0Var2.K;
                    if (kVar2 != null) {
                        kVar2.c();
                    }
                    pb0Var2.L = z12;
                    final float translationY = ob0Var.getTranslationY();
                    final float f13 = pb0Var2.M;
                    float f14 = z11 ? 0.0f : 1.0f;
                    if (translationY == f12) {
                        pb0Var2.K = null;
                        num = Integer.valueOf(!z11 ? 8 : 0);
                        if (pb0Var2.N && !z11) {
                            pb0Var2.N = false;
                            ob0Var.setLayoutManager(pb0Var2.getNeededLayoutManager());
                            pb0Var2.I = true;
                            pb0Var2.o(true);
                        }
                        pb0Var = pb0Var2;
                    } else {
                        o1.k kVar3 = new o1.k(new o1.j(translationY));
                        o1.l lVar = new o1.l(f12);
                        lVar.a(1.0f);
                        lVar.b(550.0f);
                        kVar3.u = lVar;
                        pb0Var2.K = kVar3;
                        pb0Var = pb0Var2;
                        final float f15 = f14;
                        kVar3.b(new o1.g() { // from class: org.telegram.ui.Components.gb0
                            @Override // o1.g
                            public final void a(o1.h hVar, float f16, float f17) {
                                pb0 pb0Var3 = pb0.this;
                                pb0Var3.b.setTranslationY(f16);
                                pb0Var3.i();
                                float f18 = translationY;
                                pb0Var3.M = AndroidUtilities.lerp(f13, f15, (f16 - f18) / (f12 - f18));
                            }
                        });
                        if (!z11) {
                            pb0Var.K.a(new ci.x4(pb0Var, z12, 2));
                        }
                        pb0Var.K.a(new hb0());
                        pb0Var.K.h();
                    }
                    if (num != null && pb0Var.getVisibility() != num.intValue()) {
                        pb0Var.setVisibility(num.intValue());
                        break;
                    }
                }
                break;
            case 28:
                ((dc0) obj).S.n.l();
                break;
            default:
                ((zc0) obj).a();
                break;
        }
    }

    public /* synthetic */ nq(av avVar, fa0 fa0Var, ClickableSpan clickableSpan) {
        this.a = 9;
        this.b = avVar;
    }
}
