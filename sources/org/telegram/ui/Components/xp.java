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

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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
        float f10;
        int i10;
        final ra0 ra0Var;
        o1.j jVar;
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
                ((org.telegram.ui.ActionBar.h3) obj).dismiss();
                org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
                if (U != null) {
                    U.presentFragment(new PremiumPreviewFragment(0, "create_bot"));
                    break;
                }
                break;
            case 3:
                gr grVar = ((er) obj).c;
                TLRPC.Peer peer = grVar.a0;
                org.telegram.ui.ActionBar.p2 p2Var = grVar.c0;
                lr lrVar = new lr(p2Var, peer, grVar.d0, grVar.V.size() > 1, grVar.U);
                if (p2Var.getParentActivity() != null) {
                    p2Var.showDialog(lrVar);
                    break;
                } else {
                    lrVar.show();
                    break;
                }
            case 4:
                ((qh.d) obj).setLoading(true);
                break;
            case 5:
                js jsVar = (js) obj;
                jsVar.a.a(!r0.f, true);
                AndroidUtilities.runOnUIThread(jsVar.f, 3000L);
                break;
            case 6:
                ((yn0) obj).V(false);
                break;
            case 7:
                ((lt) obj).a();
                break;
            case 8:
                ((ViewTreeObserver.OnPreDrawListener) obj).onPreDraw();
                break;
            case 9:
                ((gu) obj).getClass();
                break;
            case 10:
                af.g.s(((mu) obj).a.getContext(), "https://play.google.com/store/apps/details?id=com.google.android.webview");
                break;
            case 11:
                ru ruVar = ((qu) obj).a;
                ruVar.n.setVisibility(4);
                ruVar.h.setVisibility(4);
                ImageView imageView = ruVar.x;
                imageView.setEnabled(true);
                imageView.setAlpha(1.0f);
                break;
            case 12:
                ((jv) obj).a(true, true);
                break;
            case 13:
                ix ixVar = (ix) obj;
                if (ixVar.V.getEmojiView() != null) {
                    mz emojiView = ixVar.V.getEmojiView();
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
                cy cyVar = (cy) obj;
                cyVar.s.f = true;
                cyVar.a(true);
                break;
            case 15:
                AndroidUtilities.updateViewShow(((yy) obj).h, true);
                break;
            case 16:
                fz fzVar = (fz) obj;
                ArrayList arrayList = fzVar.r;
                ArrayList arrayList2 = fzVar.h;
                hz hzVar = fzVar.w;
                int i13 = hzVar.J;
                mz mzVar = hzVar.N;
                rw rwVar = mzVar.A0;
                if (i13 == fzVar.b) {
                    arrayList2.remove(arrayList);
                    hzVar.B = fzVar.c;
                    hzVar.C = fzVar.d;
                    hzVar.D = fzVar.e;
                    hzVar.E = fzVar.f;
                    hzVar.F = arrayList2;
                    hzVar.G = fzVar.n;
                    hzVar.H = new ArrayList(arrayList);
                    mzVar.D0.e(false);
                    f2.p0 adapter = rwVar.getAdapter();
                    hz hzVar2 = mzVar.w0;
                    if (adapter != hzVar2) {
                        rwVar.setAdapter(hzVar2);
                    }
                    hzVar.l();
                    break;
                }
                break;
            case 17:
                l00 l00Var = ((k00) obj).e;
                ArrayList arrayList3 = l00Var.h;
                if (!UserConfig.getInstance(UserConfig.selectedAccount).isPremium()) {
                    int i14 = 0;
                    while (i14 < arrayList3.size()) {
                        if (((i00) arrayList3.get(i14)).e && i14 != 0) {
                            h00 h00Var = l00Var.F;
                            l00 l00Var2 = h00Var.d;
                            ArrayList arrayList4 = l00Var2.h;
                            SparseIntArray sparseIntArray = l00Var2.h0;
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
                                    if (l00Var2.H == i19) {
                                        int i20 = i19 == i14 ? 0 : i19 + 1;
                                        l00Var2.I = i20;
                                        l00Var2.H = i20;
                                    }
                                    if (l00Var2.n0 == i19) {
                                        int i21 = i19 == i14 ? 0 : i19 + 1;
                                        l00Var2.o0 = i21;
                                        l00Var2.n0 = i21;
                                    }
                                    i19++;
                                }
                                h00Var.p(i14, 0);
                                g00 g00Var = l00Var2.G;
                                int i22 = ((i00) arrayList4.get(i14)).a;
                                org.telegram.ui.pw pwVar = (org.telegram.ui.pw) g00Var;
                                int i23 = 0;
                                while (true) {
                                    org.telegram.ui.oy[] oyVarArr = pwVar.b.b0;
                                    if (i23 < oyVarArr.length) {
                                        org.telegram.ui.oy oyVar = oyVarArr[i23];
                                        int i24 = oyVar.h;
                                        if (i24 == i22) {
                                            oyVar.h = i16;
                                        } else if (i24 == i16) {
                                            oyVar.h = i22;
                                        }
                                        i23++;
                                    } else {
                                        l00Var2.j();
                                        l00Var2.y = true;
                                        l00Var2.C.setItemAnimator(l00Var2.p0);
                                    }
                                }
                            }
                            l00Var.C.u0(0);
                            org.telegram.ui.ow owVar = (org.telegram.ui.ow) l00Var;
                            org.telegram.ui.py pyVar = owVar.y0;
                            if (!pyVar.getMessagesController().premiumFeaturesBlocked()) {
                                try {
                                    owVar.performHapticFeedback(3, 1);
                                } catch (Exception unused2) {
                                }
                                ic I = qc.a0(pyVar).I(R.raw.filter_reorder, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.LimitReachedReorderFolder, LocaleController.getString(R.string.FilterAllChats))), LocaleController.getString(R.string.PremiumMore), 5000, false, new org.telegram.ui.zi(owVar, 22));
                                I.k(true);
                                pyVar.k3 = I;
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
                ((c30) obj).g(true);
                break;
            case 20:
                org.telegram.ui.yx yxVar = ((un0) ((i40) obj)).Z;
                if (!yxVar.r0.canScrollVertically(-1)) {
                    yxVar.q0.h1(0, 0);
                    break;
                }
                break;
            case 21:
                ((k40) obj).b.b(true);
                break;
            case 22:
                ((k40) obj).b.b(true);
                break;
            case 23:
                a50 a50Var = (a50) obj;
                kj0 kj0Var = a50Var.f;
                if (a50Var.n) {
                    kj0Var.getAnimatedDrawable().I(0);
                    kj0Var.setAnimation(a50Var.r);
                    kj0Var.d();
                    break;
                }
                break;
            case 24:
                z50 z50Var = (z50) ((i50) obj).b;
                try {
                    j71 j71Var = z50Var.L;
                    if (j71Var != null && (videoEditedInfo = z50Var.K) != null) {
                        if (videoEditedInfo.endTime > 0) {
                            long n10 = j71Var.n();
                            VideoEditedInfo videoEditedInfo2 = z50Var.K;
                            if (n10 >= videoEditedInfo2.endTime) {
                                j71 j71Var2 = z50Var.L;
                                long j10 = videoEditedInfo2.startTime;
                                j71Var2.K(j10 > 0 ? j10 : 0L);
                                break;
                            }
                        }
                    }
                } catch (Exception e6) {
                    FileLog.e(e6);
                    return;
                }
                break;
            case 25:
                v90 v90Var = (v90) obj;
                if (v90Var.d) {
                    v90Var.e = true;
                    v90Var.r = false;
                    v90Var.f = 0.0f;
                    v90Var.h = SystemClock.uptimeMillis();
                    v90Var.invalidate();
                    break;
                }
                break;
            case 26:
                fa0 fa0Var = (fa0) obj;
                Activity parentActivity = fa0Var.getParentActivity();
                Activity parentActivity2 = fa0Var.getParentActivity();
                DispatchQueue dispatchQueue = dg.y1.m;
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
                ra0 ra0Var2 = (ra0) obj;
                boolean z10 = ra0Var2.F;
                boolean z11 = !z10;
                uf.z0 z0Var = ra0Var2.e;
                qa0 qa0Var = ra0Var2.b;
                if (qa0Var == null || z0Var == null) {
                    ra0Var2.L = 0;
                    break;
                } else if (ra0Var2.I && (jVar = ra0Var2.H) != null && jVar.f && !z10) {
                    ra0Var2.L = 0;
                    break;
                } else {
                    boolean g10 = ra0Var2.g();
                    if (z10) {
                        int computeVerticalScrollRange = qa0Var.computeVerticalScrollRange();
                        float f11 = (computeVerticalScrollRange - z0Var.h) + ra0Var2.s;
                        if (computeVerticalScrollRange <= 0 && ra0Var2.f.K() > 0 && (i10 = ra0Var2.L) < 3) {
                            ra0Var2.L = i10 + 1;
                            ra0Var2.o(true);
                            break;
                        } else {
                            f10 = f11;
                        }
                    } else {
                        f10 = (-ra0Var2.s) - AndroidUtilities.dp(6.0f);
                    }
                    ra0Var2.L = 0;
                    float f12 = ra0Var2.v;
                    float max = g10 ? -Math.max(0.0f, f12 - f10) : Math.max(0.0f, f12 - f10) + (-f12);
                    if (!z10 && !g10) {
                        max += qa0Var.computeVerticalScrollOffset();
                    }
                    final float f13 = max;
                    o1.j jVar2 = ra0Var2.H;
                    if (jVar2 != null) {
                        jVar2.c();
                    }
                    ra0Var2.I = z11;
                    final float translationY = qa0Var.getTranslationY();
                    final float f14 = ra0Var2.J;
                    float f15 = z10 ? 0.0f : 1.0f;
                    if (translationY == f13) {
                        ra0Var2.H = null;
                        num = Integer.valueOf(!z10 ? 8 : 0);
                        if (ra0Var2.K && !z10) {
                            ra0Var2.K = false;
                            qa0Var.setLayoutManager(ra0Var2.getNeededLayoutManager());
                            ra0Var2.F = true;
                            ra0Var2.o(true);
                        }
                        ra0Var = ra0Var2;
                    } else {
                        o1.j jVar3 = new o1.j(new kb.a(translationY));
                        o1.k kVar = new o1.k(f13);
                        kVar.a(1.0f);
                        kVar.b(550.0f);
                        jVar3.u = kVar;
                        ra0Var2.H = jVar3;
                        ra0Var = ra0Var2;
                        final float f16 = f15;
                        jVar3.b(new o1.g() { // from class: org.telegram.ui.Components.ia0
                            @Override // o1.g
                            public final void a(o1.h hVar, float f17, float f18) {
                                ra0 ra0Var3 = ra0.this;
                                ra0Var3.b.setTranslationY(f17);
                                ra0Var3.i();
                                float f19 = translationY;
                                ra0Var3.J = AndroidUtilities.lerp(f14, f16, (f17 - f19) / (f13 - f19));
                            }
                        });
                        if (!z10) {
                            ra0Var.H.a(new eg.x(ra0Var, z11, 2));
                        }
                        ra0Var.H.a(new ja0());
                        ra0Var.H.f();
                    }
                    if (num != null && ra0Var.getVisibility() != num.intValue()) {
                        ra0Var.setVisibility(num.intValue());
                        break;
                    }
                }
                break;
            case 28:
                ((fb0) obj).S.n.l();
                break;
            default:
                ((cc0) obj).a();
                break;
        }
    }

    public /* synthetic */ xp(gu guVar, h90 h90Var, ClickableSpan clickableSpan) {
        this.a = 9;
        this.b = guVar;
    }
}
