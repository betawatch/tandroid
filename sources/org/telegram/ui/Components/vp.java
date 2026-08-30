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

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class vp implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ vp(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        VideoEditedInfo videoEditedInfo;
        float f10;
        int i10;
        final pa0 pa0Var;
        o1.j jVar;
        int i11 = this.a;
        Integer num = null;
        Object obj = this.b;
        switch (i11) {
            case 0:
                ((aq) obj).dismiss();
                break;
            case 1:
                ((pq) obj).a();
                break;
            case 2:
                ((org.telegram.ui.ActionBar.g3) obj).dismiss();
                org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
                if (U != null) {
                    U.presentFragment(new PremiumPreviewFragment(0, "create_bot"));
                    break;
                }
                break;
            case 3:
                er erVar = ((cr) obj).c;
                TLRPC.Peer peer = erVar.a0;
                org.telegram.ui.ActionBar.p2 p2Var = erVar.c0;
                jr jrVar = new jr(p2Var, peer, erVar.d0, erVar.V.size() > 1, erVar.U);
                if (p2Var.getParentActivity() != null) {
                    p2Var.showDialog(jrVar);
                    break;
                } else {
                    jrVar.show();
                    break;
                }
            case 4:
                ((ph.d) obj).setLoading(true);
                break;
            case 5:
                hs hsVar = (hs) obj;
                hsVar.a.a(!r0.f, true);
                AndroidUtilities.runOnUIThread(hsVar.f, 3000L);
                break;
            case 6:
                ((yn0) obj).V(false);
                break;
            case 7:
                ((jt) obj).a();
                break;
            case 8:
                ((ViewTreeObserver.OnPreDrawListener) obj).onPreDraw();
                break;
            case 9:
                ((eu) obj).getClass();
                break;
            case 10:
                af.g.s(((ku) obj).a.getContext(), "https://play.google.com/store/apps/details?id=com.google.android.webview");
                break;
            case 11:
                pu puVar = ((ou) obj).a;
                puVar.n.setVisibility(4);
                puVar.h.setVisibility(4);
                ImageView imageView = puVar.x;
                imageView.setEnabled(true);
                imageView.setAlpha(1.0f);
                break;
            case 12:
                ((hv) obj).a(true, true);
                break;
            case 13:
                gx gxVar = (gx) obj;
                if (gxVar.V.getEmojiView() != null) {
                    kz emojiView = gxVar.V.getEmojiView();
                    if (!emojiView.c0) {
                        try {
                            int i12 = emojiView.O.s.get(EmojiData.dataColored.length);
                            if (i12 > 0) {
                                emojiView.M.B0();
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
                zx zxVar = (zx) obj;
                zxVar.s.f = true;
                zxVar.a(true);
                break;
            case 15:
                AndroidUtilities.updateViewShow(((wy) obj).h, true);
                break;
            case 16:
                dz dzVar = (dz) obj;
                ArrayList arrayList = dzVar.r;
                ArrayList arrayList2 = dzVar.h;
                fz fzVar = dzVar.w;
                int i13 = fzVar.J;
                kz kzVar = fzVar.N;
                pw pwVar = kzVar.A0;
                if (i13 == dzVar.b) {
                    arrayList2.remove(arrayList);
                    fzVar.B = dzVar.c;
                    fzVar.C = dzVar.d;
                    fzVar.D = dzVar.e;
                    fzVar.E = dzVar.f;
                    fzVar.F = arrayList2;
                    fzVar.G = dzVar.n;
                    fzVar.H = new ArrayList(arrayList);
                    kzVar.D0.e(false);
                    f2.o0 adapter = pwVar.getAdapter();
                    fz fzVar2 = kzVar.w0;
                    if (adapter != fzVar2) {
                        pwVar.setAdapter(fzVar2);
                    }
                    fzVar.l();
                    break;
                }
                break;
            case 17:
                j00 j00Var = ((i00) obj).e;
                ArrayList arrayList3 = j00Var.h;
                if (!UserConfig.getInstance(UserConfig.selectedAccount).isPremium()) {
                    int i14 = 0;
                    while (i14 < arrayList3.size()) {
                        if (((g00) arrayList3.get(i14)).e && i14 != 0) {
                            f00 f00Var = j00Var.F;
                            j00 j00Var2 = f00Var.d;
                            ArrayList arrayList4 = j00Var2.h;
                            SparseIntArray sparseIntArray = j00Var2.h0;
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
                                    if (j00Var2.H == i19) {
                                        int i20 = i19 == i14 ? 0 : i19 + 1;
                                        j00Var2.I = i20;
                                        j00Var2.H = i20;
                                    }
                                    if (j00Var2.n0 == i19) {
                                        int i21 = i19 == i14 ? 0 : i19 + 1;
                                        j00Var2.o0 = i21;
                                        j00Var2.n0 = i21;
                                    }
                                    i19++;
                                }
                                f00Var.p(i14, 0);
                                e00 e00Var = j00Var2.G;
                                int i22 = ((g00) arrayList4.get(i14)).a;
                                org.telegram.ui.ow owVar = (org.telegram.ui.ow) e00Var;
                                int i23 = 0;
                                while (true) {
                                    org.telegram.ui.ny[] nyVarArr = owVar.b.b0;
                                    if (i23 < nyVarArr.length) {
                                        org.telegram.ui.ny nyVar = nyVarArr[i23];
                                        int i24 = nyVar.h;
                                        if (i24 == i22) {
                                            nyVar.h = i16;
                                        } else if (i24 == i16) {
                                            nyVar.h = i22;
                                        }
                                        i23++;
                                    } else {
                                        j00Var2.j();
                                        j00Var2.y = true;
                                        j00Var2.C.setItemAnimator(j00Var2.p0);
                                    }
                                }
                            }
                            j00Var.C.u0(0);
                            org.telegram.ui.nw nwVar = (org.telegram.ui.nw) j00Var;
                            org.telegram.ui.oy oyVar = nwVar.y0;
                            if (!oyVar.getMessagesController().premiumFeaturesBlocked()) {
                                try {
                                    nwVar.performHapticFeedback(3, 1);
                                } catch (Exception unused2) {
                                }
                                ic I = qc.a0(oyVar).I(R.raw.filter_reorder, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.LimitReachedReorderFolder, LocaleController.getString(R.string.FilterAllChats))), LocaleController.getString(R.string.PremiumMore), 5000, false, new org.telegram.ui.zi(nwVar, 22));
                                I.k(true);
                                oyVar.k3 = I;
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
                ((a30) obj).g(true);
                break;
            case 20:
                org.telegram.ui.xx xxVar = ((un0) ((g40) obj)).Z;
                if (!xxVar.r0.canScrollVertically(-1)) {
                    xxVar.q0.h1(0, 0);
                    break;
                }
                break;
            case 21:
                ((i40) obj).b.b(true);
                break;
            case 22:
                ((i40) obj).b.b(true);
                break;
            case 23:
                y40 y40Var = (y40) obj;
                jj0 jj0Var = y40Var.f;
                if (y40Var.n) {
                    jj0Var.getAnimatedDrawable().I(0);
                    jj0Var.setAnimation(y40Var.r);
                    jj0Var.d();
                    break;
                }
                break;
            case 24:
                x50 x50Var = (x50) ((g50) obj).b;
                try {
                    i71 i71Var = x50Var.L;
                    if (i71Var != null && (videoEditedInfo = x50Var.K) != null) {
                        if (videoEditedInfo.endTime > 0) {
                            long n10 = i71Var.n();
                            VideoEditedInfo videoEditedInfo2 = x50Var.K;
                            if (n10 >= videoEditedInfo2.endTime) {
                                i71 i71Var2 = x50Var.L;
                                long j10 = videoEditedInfo2.startTime;
                                i71Var2.K(j10 > 0 ? j10 : 0L);
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
                t90 t90Var = (t90) obj;
                if (t90Var.d) {
                    t90Var.e = true;
                    t90Var.r = false;
                    t90Var.f = 0.0f;
                    t90Var.h = SystemClock.uptimeMillis();
                    t90Var.invalidate();
                    break;
                }
                break;
            case 26:
                da0 da0Var = (da0) obj;
                Activity parentActivity = da0Var.getParentActivity();
                Activity parentActivity2 = da0Var.getParentActivity();
                DispatchQueue dispatchQueue = cg.z1.m;
                boolean z4 = parentActivity2.getSharedPreferences("shapedetector_conf", 0).getBoolean("learning", false);
                SharedPreferences.Editor edit = parentActivity.getSharedPreferences("shapedetector_conf", 0).edit();
                if (z4) {
                    edit.clear();
                } else {
                    edit.putBoolean("learning", true);
                }
                edit.apply();
                break;
            case 27:
                pa0 pa0Var2 = (pa0) obj;
                boolean z10 = pa0Var2.F;
                boolean z11 = !z10;
                tf.z0 z0Var = pa0Var2.e;
                oa0 oa0Var = pa0Var2.b;
                if (oa0Var == null || z0Var == null) {
                    pa0Var2.L = 0;
                    break;
                } else if (pa0Var2.I && (jVar = pa0Var2.H) != null && jVar.f && !z10) {
                    pa0Var2.L = 0;
                    break;
                } else {
                    boolean g10 = pa0Var2.g();
                    if (z10) {
                        int computeVerticalScrollRange = oa0Var.computeVerticalScrollRange();
                        float f11 = (computeVerticalScrollRange - z0Var.h) + pa0Var2.s;
                        if (computeVerticalScrollRange <= 0 && pa0Var2.f.K() > 0 && (i10 = pa0Var2.L) < 3) {
                            pa0Var2.L = i10 + 1;
                            pa0Var2.o(true);
                            break;
                        } else {
                            f10 = f11;
                        }
                    } else {
                        f10 = (-pa0Var2.s) - AndroidUtilities.dp(6.0f);
                    }
                    pa0Var2.L = 0;
                    float f12 = pa0Var2.v;
                    float max = g10 ? -Math.max(0.0f, f12 - f10) : Math.max(0.0f, f12 - f10) + (-f12);
                    if (!z10 && !g10) {
                        max += oa0Var.computeVerticalScrollOffset();
                    }
                    final float f13 = max;
                    o1.j jVar2 = pa0Var2.H;
                    if (jVar2 != null) {
                        jVar2.c();
                    }
                    pa0Var2.I = z11;
                    final float translationY = oa0Var.getTranslationY();
                    final float f14 = pa0Var2.J;
                    float f15 = z10 ? 0.0f : 1.0f;
                    if (translationY == f13) {
                        pa0Var2.H = null;
                        num = Integer.valueOf(!z10 ? 8 : 0);
                        if (pa0Var2.K && !z10) {
                            pa0Var2.K = false;
                            oa0Var.setLayoutManager(pa0Var2.getNeededLayoutManager());
                            pa0Var2.F = true;
                            pa0Var2.o(true);
                        }
                        pa0Var = pa0Var2;
                    } else {
                        o1.j jVar3 = new o1.j(new kb.a(translationY));
                        o1.k kVar = new o1.k(f13);
                        kVar.a(1.0f);
                        kVar.b(550.0f);
                        jVar3.u = kVar;
                        pa0Var2.H = jVar3;
                        pa0Var = pa0Var2;
                        final float f16 = f15;
                        jVar3.b(new o1.g() { // from class: org.telegram.ui.Components.ga0
                            @Override // o1.g
                            public final void a(o1.h hVar, float f17, float f18) {
                                pa0 pa0Var3 = pa0.this;
                                pa0Var3.b.setTranslationY(f17);
                                pa0Var3.i();
                                float f19 = translationY;
                                pa0Var3.J = AndroidUtilities.lerp(f14, f16, (f17 - f19) / (f13 - f19));
                            }
                        });
                        if (!z10) {
                            pa0Var.H.a(new dg.z(pa0Var, z11, 2));
                        }
                        pa0Var.H.a(new ha0());
                        pa0Var.H.f();
                    }
                    if (num != null && pa0Var.getVisibility() != num.intValue()) {
                        pa0Var.setVisibility(num.intValue());
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

    public /* synthetic */ vp(eu euVar, f90 f90Var, ClickableSpan clickableSpan) {
        this.a = 9;
        this.b = euVar;
    }
}
