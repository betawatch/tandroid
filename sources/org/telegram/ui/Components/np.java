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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class np implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ np(Object obj, int i9) {
        this.a = i9;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        VideoEditedInfo videoEditedInfo;
        float f10;
        int i9;
        final w90 w90Var;
        o1.j jVar;
        int i10 = this.a;
        Integer num = null;
        Object obj = this.b;
        switch (i10) {
            case 0:
                ((sp) obj).dismiss();
                break;
            case 1:
                ((hq) obj).a();
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
                wq wqVar = ((uq) obj).c;
                TLRPC.Peer peer = wqVar.Z;
                org.telegram.ui.ActionBar.o2 o2Var = wqVar.b0;
                cr crVar = new cr(o2Var, peer, wqVar.c0, wqVar.U.size() > 1, wqVar.T);
                if (o2Var.getParentActivity() != null) {
                    o2Var.showDialog(crVar);
                    break;
                } else {
                    crVar.show();
                    break;
                }
            case 4:
                ((kh.d) obj).setLoading(true);
                break;
            case 5:
                zr zrVar = (zr) obj;
                zrVar.a.a(!r0.f, true);
                AndroidUtilities.runOnUIThread(zrVar.f, 3000L);
                break;
            case 6:
                ((cn0) obj).V(false);
                break;
            case 7:
                ((zs) obj).a();
                break;
            case 8:
                ((ViewTreeObserver.OnPreDrawListener) obj).onPreDraw();
                break;
            case 9:
                ((vt) obj).getClass();
                break;
            case 10:
                ve.e.s(((bu) obj).a.getContext(), "https://play.google.com/store/apps/details?id=com.google.android.webview");
                break;
            case 11:
                gu guVar = ((fu) obj).a;
                guVar.n.setVisibility(4);
                guVar.h.setVisibility(4);
                ImageView imageView = guVar.x;
                imageView.setEnabled(true);
                imageView.setAlpha(1.0f);
                break;
            case 12:
                ((yu) obj).a(true, true);
                break;
            case 13:
                uw uwVar = (uw) obj;
                if (uwVar.U.getEmojiView() != null) {
                    wy emojiView = uwVar.U.getEmojiView();
                    if (!emojiView.b0) {
                        try {
                            int i11 = emojiView.N.s.get(EmojiData.dataColored.length);
                            if (i11 > 0) {
                                emojiView.L.B0();
                                emojiView.V(i11);
                                emojiView.H(i11, AndroidUtilities.dp(-9.0f));
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
                nx nxVar = (nx) obj;
                nxVar.s.f = true;
                nxVar.a(true);
                break;
            case 15:
                AndroidUtilities.updateViewShow(((jy) obj).h, true);
                break;
            case 16:
                py pyVar = (py) obj;
                ArrayList arrayList = pyVar.r;
                ArrayList arrayList2 = pyVar.h;
                ry ryVar = pyVar.w;
                int i12 = ryVar.I;
                wy wyVar = ryVar.M;
                fw fwVar = wyVar.z0;
                if (i12 == pyVar.b) {
                    arrayList2.remove(arrayList);
                    ryVar.A = pyVar.c;
                    ryVar.B = pyVar.d;
                    ryVar.C = pyVar.e;
                    ryVar.D = pyVar.f;
                    ryVar.E = arrayList2;
                    ryVar.F = pyVar.n;
                    ryVar.G = new ArrayList(arrayList);
                    wyVar.C0.e(false);
                    f2.r0 adapter = fwVar.getAdapter();
                    ry ryVar2 = wyVar.v0;
                    if (adapter != ryVar2) {
                        fwVar.setAdapter(ryVar2);
                    }
                    ryVar.l();
                    break;
                }
                break;
            case 17:
                vz vzVar = ((uz) obj).e;
                ArrayList arrayList3 = vzVar.h;
                if (!UserConfig.getInstance(UserConfig.selectedAccount).isPremium()) {
                    int i13 = 0;
                    while (i13 < arrayList3.size()) {
                        if (((sz) arrayList3.get(i13)).e && i13 != 0) {
                            rz rzVar = vzVar.E;
                            vz vzVar2 = rzVar.d;
                            ArrayList arrayList4 = vzVar2.h;
                            SparseIntArray sparseIntArray = vzVar2.g0;
                            int size = arrayList4.size();
                            if (i13 >= 0 && i13 < size) {
                                ArrayList<MessagesController.DialogFilter> dialogFilters = MessagesController.getInstance(UserConfig.selectedAccount).getDialogFilters();
                                int i14 = sparseIntArray.get(i13);
                                int i15 = ((sz) arrayList4.get(i13)).a;
                                for (int i16 = i13 - 1; i16 >= 0; i16--) {
                                    sparseIntArray.put(i16 + 1, sparseIntArray.get(i16));
                                }
                                MessagesController.DialogFilter remove = dialogFilters.remove(i13);
                                remove.order = 0;
                                dialogFilters.add(0, remove);
                                sparseIntArray.put(0, i14);
                                arrayList4.add(0, (sz) arrayList4.remove(i13));
                                ((sz) arrayList4.get(0)).a = i15;
                                for (int i17 = 0; i17 <= i13; i17++) {
                                    ((sz) arrayList4.get(i17)).a = i17;
                                    dialogFilters.get(i17).order = i17;
                                }
                                int i18 = 0;
                                while (i18 <= i13) {
                                    if (vzVar2.G == i18) {
                                        int i19 = i18 == i13 ? 0 : i18 + 1;
                                        vzVar2.H = i19;
                                        vzVar2.G = i19;
                                    }
                                    if (vzVar2.m0 == i18) {
                                        int i20 = i18 == i13 ? 0 : i18 + 1;
                                        vzVar2.n0 = i20;
                                        vzVar2.m0 = i20;
                                    }
                                    i18++;
                                }
                                rzVar.p(i13, 0);
                                qz qzVar = vzVar2.F;
                                int i21 = ((sz) arrayList4.get(i13)).a;
                                org.telegram.ui.dw dwVar = (org.telegram.ui.dw) qzVar;
                                int i22 = 0;
                                while (true) {
                                    org.telegram.ui.cy[] cyVarArr = dwVar.b.a0;
                                    if (i22 < cyVarArr.length) {
                                        org.telegram.ui.cy cyVar = cyVarArr[i22];
                                        int i23 = cyVar.h;
                                        if (i23 == i21) {
                                            cyVar.h = i15;
                                        } else if (i23 == i15) {
                                            cyVar.h = i21;
                                        }
                                        i22++;
                                    } else {
                                        vzVar2.j();
                                        vzVar2.y = true;
                                        vzVar2.B.setItemAnimator(vzVar2.o0);
                                    }
                                }
                            }
                            vzVar.B.u0(0);
                            org.telegram.ui.cw cwVar = (org.telegram.ui.cw) vzVar;
                            org.telegram.ui.dy dyVar = cwVar.x0;
                            if (!dyVar.getMessagesController().premiumFeaturesBlocked()) {
                                try {
                                    cwVar.performHapticFeedback(3, 1);
                                } catch (Exception unused2) {
                                }
                                gc I = oc.a0(dyVar).I(R.raw.filter_reorder, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.LimitReachedReorderFolder, LocaleController.getString(R.string.FilterAllChats))), LocaleController.getString(R.string.PremiumMore), 5000, false, new org.telegram.ui.ri(cwVar, 22));
                                I.k(true);
                                dyVar.j3 = I;
                                break;
                            }
                        } else {
                            i13++;
                        }
                    }
                    break;
                }
                break;
            case 18:
                c00 c00Var = (c00) obj;
                if (!c00Var.c) {
                    c00Var.setLayerType(0, null);
                    break;
                }
                break;
            case 19:
                ((j20) obj).g(true);
                break;
            case 20:
                org.telegram.ui.mx mxVar = ((ym0) ((o30) obj)).Y;
                if (!mxVar.q0.canScrollVertically(-1)) {
                    mxVar.p0.h1(0, 0);
                    break;
                }
                break;
            case 21:
                ((q30) obj).b.b(true);
                break;
            case 22:
                ((q30) obj).b.b(true);
                break;
            case 23:
                g40 g40Var = (g40) obj;
                pi0 pi0Var = g40Var.f;
                if (g40Var.n) {
                    pi0Var.getAnimatedDrawable().I(0);
                    pi0Var.setAnimation(g40Var.r);
                    pi0Var.d();
                    break;
                }
                break;
            case 24:
                f50 f50Var = (f50) ((kh.j2) obj).b;
                try {
                    k61 k61Var = f50Var.K;
                    if (k61Var != null && (videoEditedInfo = f50Var.J) != null) {
                        if (videoEditedInfo.endTime > 0) {
                            long o6 = k61Var.o();
                            VideoEditedInfo videoEditedInfo2 = f50Var.J;
                            if (o6 >= videoEditedInfo2.endTime) {
                                k61 k61Var2 = f50Var.K;
                                long j10 = videoEditedInfo2.startTime;
                                k61Var2.L(j10 > 0 ? j10 : 0L);
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
                a90 a90Var = (a90) obj;
                if (a90Var.d) {
                    a90Var.e = true;
                    a90Var.r = false;
                    a90Var.f = 0.0f;
                    a90Var.h = SystemClock.uptimeMillis();
                    a90Var.invalidate();
                    break;
                }
                break;
            case 26:
                k90 k90Var = (k90) obj;
                Activity parentActivity = k90Var.getParentActivity();
                Activity parentActivity2 = k90Var.getParentActivity();
                DispatchQueue dispatchQueue = xf.k1.m;
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
                w90 w90Var2 = (w90) obj;
                boolean z11 = w90Var2.E;
                boolean z12 = !z11;
                of.k1 k1Var = w90Var2.e;
                v90 v90Var = w90Var2.b;
                if (v90Var == null || k1Var == null) {
                    w90Var2.K = 0;
                    break;
                } else if (w90Var2.H && (jVar = w90Var2.G) != null && jVar.f && !z11) {
                    w90Var2.K = 0;
                    break;
                } else {
                    boolean g10 = w90Var2.g();
                    if (z11) {
                        int computeVerticalScrollRange = v90Var.computeVerticalScrollRange();
                        float f11 = (computeVerticalScrollRange - k1Var.h) + w90Var2.s;
                        if (computeVerticalScrollRange <= 0 && w90Var2.f.K() > 0 && (i9 = w90Var2.K) < 3) {
                            w90Var2.K = i9 + 1;
                            w90Var2.o(true);
                            break;
                        } else {
                            f10 = f11;
                        }
                    } else {
                        f10 = (-w90Var2.s) - AndroidUtilities.dp(6.0f);
                    }
                    w90Var2.K = 0;
                    float f12 = w90Var2.v;
                    float max = g10 ? -Math.max(0.0f, f12 - f10) : Math.max(0.0f, f12 - f10) + (-f12);
                    if (!z11 && !g10) {
                        max += v90Var.computeVerticalScrollOffset();
                    }
                    final float f13 = max;
                    o1.j jVar2 = w90Var2.G;
                    if (jVar2 != null) {
                        jVar2.c();
                    }
                    w90Var2.H = z12;
                    final float translationY = v90Var.getTranslationY();
                    final float f14 = w90Var2.I;
                    float f15 = z11 ? 0.0f : 1.0f;
                    if (translationY == f13) {
                        w90Var2.G = null;
                        num = Integer.valueOf(!z11 ? 8 : 0);
                        if (w90Var2.J && !z11) {
                            w90Var2.J = false;
                            v90Var.setLayoutManager(w90Var2.getNeededLayoutManager());
                            w90Var2.E = true;
                            w90Var2.o(true);
                        }
                        w90Var = w90Var2;
                    } else {
                        o1.j jVar3 = new o1.j(new gb.a(translationY));
                        o1.k kVar = new o1.k(f13);
                        kVar.a(1.0f);
                        kVar.b(550.0f);
                        jVar3.u = kVar;
                        w90Var2.G = jVar3;
                        w90Var = w90Var2;
                        final float f16 = f15;
                        jVar3.b(new o1.g() { // from class: org.telegram.ui.Components.n90
                            @Override // o1.g
                            public final void a(o1.h hVar, float f17, float f18) {
                                w90 w90Var3 = w90.this;
                                w90Var3.b.setTranslationY(f17);
                                w90Var3.i();
                                float f19 = translationY;
                                w90Var3.I = AndroidUtilities.lerp(f14, f16, (f17 - f19) / (f13 - f19));
                            }
                        });
                        if (!z11) {
                            w90Var.G.a(new kh.r4(w90Var, z12, 2));
                        }
                        w90Var.G.a(new o90());
                        w90Var.G.f();
                    }
                    if (num != null && w90Var.getVisibility() != num.intValue()) {
                        w90Var.setVisibility(num.intValue());
                        break;
                    }
                }
                break;
            case 28:
                ((ka0) obj).S.n.l();
                break;
            default:
                ((gb0) obj).a();
                break;
        }
    }

    public /* synthetic */ np(vt vtVar, m80 m80Var, ClickableSpan clickableSpan) {
        this.a = 9;
        this.b = vtVar;
    }
}
