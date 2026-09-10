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

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class dq implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ dq(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        VideoEditedInfo videoEditedInfo;
        float f7;
        int i10;
        final xa0 xa0Var;
        o1.k kVar;
        int i11 = this.a;
        Integer num = null;
        Object obj = this.b;
        switch (i11) {
            case 0:
                ((iq) obj).dismiss();
                break;
            case 1:
                ((xq) obj).a();
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
                mr mrVar = ((kr) obj).c;
                TLRPC.Peer peer = mrVar.d0;
                org.telegram.ui.ActionBar.p2 p2Var = mrVar.f0;
                sr srVar = new sr(p2Var, peer, mrVar.g0, mrVar.Y.size() > 1, mrVar.X);
                if (p2Var.getParentActivity() != null) {
                    p2Var.showDialog(srVar);
                    break;
                } else {
                    srVar.show();
                    break;
                }
            case 4:
                ((bi.d) obj).setLoading(true);
                break;
            case 5:
                os osVar = (os) obj;
                osVar.a.a(!r0.f, true);
                AndroidUtilities.runOnUIThread(osVar.f, 3000L);
                break;
            case 6:
                ((co0) obj).V(false);
                break;
            case 7:
                ((rt) obj).a();
                break;
            case 8:
                ((ViewTreeObserver.OnPreDrawListener) obj).onPreDraw();
                break;
            case 9:
                ((ou) obj).getClass();
                break;
            case 10:
                nf.f.s(((uu) obj).a.getContext(), "https://play.google.com/store/apps/details?id=com.google.android.webview");
                break;
            case 11:
                zu zuVar = ((yu) obj).a;
                zuVar.n.setVisibility(4);
                zuVar.h.setVisibility(4);
                ImageView imageView = zuVar.x;
                imageView.setEnabled(true);
                imageView.setAlpha(1.0f);
                break;
            case 12:
                ((rv) obj).a(true, true);
                break;
            case 13:
                nx nxVar = (nx) obj;
                if (nxVar.Y.getEmojiView() != null) {
                    rz emojiView = nxVar.Y.getEmojiView();
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
                iy iyVar = (iy) obj;
                iyVar.s.f = true;
                iyVar.a(true);
                break;
            case 15:
                AndroidUtilities.updateViewShow(((ez) obj).h, true);
                break;
            case 16:
                kz kzVar = (kz) obj;
                ArrayList arrayList = kzVar.r;
                ArrayList arrayList2 = kzVar.h;
                mz mzVar = kzVar.w;
                int i13 = mzVar.M;
                rz rzVar = mzVar.Q;
                yw ywVar = rzVar.D0;
                if (i13 == kzVar.b) {
                    arrayList2.remove(arrayList);
                    mzVar.E = kzVar.c;
                    mzVar.F = kzVar.d;
                    mzVar.G = kzVar.e;
                    mzVar.H = kzVar.f;
                    mzVar.I = arrayList2;
                    mzVar.J = kzVar.n;
                    mzVar.K = new ArrayList(arrayList);
                    rzVar.G0.e(false);
                    s4.h0 adapter = ywVar.getAdapter();
                    mz mzVar2 = rzVar.z0;
                    if (adapter != mzVar2) {
                        ywVar.setAdapter(mzVar2);
                    }
                    mzVar.l();
                    break;
                }
                break;
            case 17:
                r00 r00Var = ((q00) obj).e;
                ArrayList arrayList3 = r00Var.h;
                if (!UserConfig.getInstance(UserConfig.selectedAccount).isPremium()) {
                    int i14 = 0;
                    while (i14 < arrayList3.size()) {
                        if (((n00) arrayList3.get(i14)).e && i14 != 0) {
                            m00 m00Var = r00Var.I;
                            r00 r00Var2 = m00Var.d;
                            ArrayList arrayList4 = r00Var2.h;
                            SparseIntArray sparseIntArray = r00Var2.k0;
                            int size = arrayList4.size();
                            if (i14 >= 0 && i14 < size) {
                                ArrayList<MessagesController.DialogFilter> dialogFilters = MessagesController.getInstance(UserConfig.selectedAccount).getDialogFilters();
                                int i15 = sparseIntArray.get(i14);
                                int i16 = ((n00) arrayList4.get(i14)).a;
                                for (int i17 = i14 - 1; i17 >= 0; i17--) {
                                    sparseIntArray.put(i17 + 1, sparseIntArray.get(i17));
                                }
                                MessagesController.DialogFilter remove = dialogFilters.remove(i14);
                                remove.order = 0;
                                dialogFilters.add(0, remove);
                                sparseIntArray.put(0, i15);
                                arrayList4.add(0, (n00) arrayList4.remove(i14));
                                ((n00) arrayList4.get(0)).a = i16;
                                for (int i18 = 0; i18 <= i14; i18++) {
                                    ((n00) arrayList4.get(i18)).a = i18;
                                    dialogFilters.get(i18).order = i18;
                                }
                                int i19 = 0;
                                while (i19 <= i14) {
                                    if (r00Var2.K == i19) {
                                        int i20 = i19 == i14 ? 0 : i19 + 1;
                                        r00Var2.L = i20;
                                        r00Var2.K = i20;
                                    }
                                    if (r00Var2.q0 == i19) {
                                        int i21 = i19 == i14 ? 0 : i19 + 1;
                                        r00Var2.r0 = i21;
                                        r00Var2.q0 = i21;
                                    }
                                    i19++;
                                }
                                m00Var.p(i14, 0);
                                l00 l00Var = r00Var2.J;
                                int i22 = ((n00) arrayList4.get(i14)).a;
                                org.telegram.ui.vw vwVar = (org.telegram.ui.vw) l00Var;
                                int i23 = 0;
                                while (true) {
                                    org.telegram.ui.vy[] vyVarArr = vwVar.b.e0;
                                    if (i23 < vyVarArr.length) {
                                        org.telegram.ui.vy vyVar = vyVarArr[i23];
                                        int i24 = vyVar.h;
                                        if (i24 == i22) {
                                            vyVar.h = i16;
                                        } else if (i24 == i16) {
                                            vyVar.h = i22;
                                        }
                                        i23++;
                                    } else {
                                        r00Var2.j();
                                        r00Var2.y = true;
                                        r00Var2.F.setItemAnimator(r00Var2.s0);
                                    }
                                }
                            }
                            r00Var.F.u0(0);
                            org.telegram.ui.uw uwVar = (org.telegram.ui.uw) r00Var;
                            org.telegram.ui.wy wyVar = uwVar.B0;
                            if (!wyVar.getMessagesController().premiumFeaturesBlocked()) {
                                try {
                                    uwVar.performHapticFeedback(3, 1);
                                } catch (Exception unused2) {
                                }
                                pc I = wc.a0(wyVar).I(R.raw.filter_reorder, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.LimitReachedReorderFolder, LocaleController.getString(R.string.FilterAllChats))), LocaleController.getString(R.string.PremiumMore), 5000, false, new org.telegram.ui.fj(uwVar, 22));
                                I.k(true);
                                wyVar.n3 = I;
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
                y00 y00Var = (y00) obj;
                if (!y00Var.c) {
                    y00Var.setLayerType(0, null);
                    break;
                }
                break;
            case 19:
                ((j30) obj).g(true);
                break;
            case 20:
                org.telegram.ui.gy gyVar = ((xn0) ((o40) obj)).c0;
                if (!gyVar.u0.canScrollVertically(-1)) {
                    gyVar.t0.h1(0, 0);
                    break;
                }
                break;
            case 21:
                ((q40) obj).b.b(true);
                break;
            case 22:
                ((q40) obj).b.b(true);
                break;
            case 23:
                g50 g50Var = (g50) obj;
                kj0 kj0Var = g50Var.f;
                if (g50Var.n) {
                    kj0Var.getAnimatedDrawable().K(0);
                    kj0Var.setAnimation(g50Var.r);
                    kj0Var.d();
                    break;
                }
                break;
            case 24:
                f60 f60Var = (f60) ((bi.b3) obj).b;
                try {
                    t71 t71Var = f60Var.O;
                    if (t71Var != null && (videoEditedInfo = f60Var.N) != null) {
                        if (videoEditedInfo.endTime > 0) {
                            long n10 = t71Var.n();
                            VideoEditedInfo videoEditedInfo2 = f60Var.N;
                            if (n10 >= videoEditedInfo2.endTime) {
                                t71 t71Var2 = f60Var.O;
                                long j3 = videoEditedInfo2.startTime;
                                t71Var2.K(j3 > 0 ? j3 : 0L);
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
                ba0 ba0Var = (ba0) obj;
                if (ba0Var.d) {
                    ba0Var.e = true;
                    ba0Var.r = false;
                    ba0Var.f = 0.0f;
                    ba0Var.h = SystemClock.uptimeMillis();
                    ba0Var.invalidate();
                    break;
                }
                break;
            case 26:
                la0 la0Var = (la0) obj;
                Activity parentActivity = la0Var.getParentActivity();
                Activity parentActivity2 = la0Var.getParentActivity();
                DispatchQueue dispatchQueue = og.p1.m;
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
                xa0 xa0Var2 = (xa0) obj;
                boolean z11 = xa0Var2.I;
                boolean z12 = !z11;
                fg.r1 r1Var = xa0Var2.e;
                wa0 wa0Var = xa0Var2.b;
                if (wa0Var == null || r1Var == null) {
                    xa0Var2.O = 0;
                    break;
                } else if (xa0Var2.L && (kVar = xa0Var2.K) != null && kVar.f && !z11) {
                    xa0Var2.O = 0;
                    break;
                } else {
                    boolean g10 = xa0Var2.g();
                    if (z11) {
                        int computeVerticalScrollRange = wa0Var.computeVerticalScrollRange();
                        float f10 = (computeVerticalScrollRange - r1Var.h) + xa0Var2.s;
                        if (computeVerticalScrollRange <= 0 && xa0Var2.f.K() > 0 && (i10 = xa0Var2.O) < 3) {
                            xa0Var2.O = i10 + 1;
                            xa0Var2.o(true);
                            break;
                        } else {
                            f7 = f10;
                        }
                    } else {
                        f7 = (-xa0Var2.s) - AndroidUtilities.dp(6.0f);
                    }
                    xa0Var2.O = 0;
                    float f11 = xa0Var2.v;
                    float max = g10 ? -Math.max(0.0f, f11 - f7) : Math.max(0.0f, f11 - f7) + (-f11);
                    if (!z11 && !g10) {
                        max += wa0Var.computeVerticalScrollOffset();
                    }
                    final float f12 = max;
                    o1.k kVar2 = xa0Var2.K;
                    if (kVar2 != null) {
                        kVar2.c();
                    }
                    xa0Var2.L = z12;
                    final float translationY = wa0Var.getTranslationY();
                    final float f13 = xa0Var2.M;
                    float f14 = z11 ? 0.0f : 1.0f;
                    if (translationY == f12) {
                        xa0Var2.K = null;
                        num = Integer.valueOf(!z11 ? 8 : 0);
                        if (xa0Var2.N && !z11) {
                            xa0Var2.N = false;
                            wa0Var.setLayoutManager(xa0Var2.getNeededLayoutManager());
                            xa0Var2.I = true;
                            xa0Var2.o(true);
                        }
                        xa0Var = xa0Var2;
                    } else {
                        o1.k kVar3 = new o1.k(new o1.j(translationY));
                        o1.l lVar = new o1.l(f12);
                        lVar.a(1.0f);
                        lVar.b(550.0f);
                        kVar3.u = lVar;
                        xa0Var2.K = kVar3;
                        xa0Var = xa0Var2;
                        final float f15 = f14;
                        kVar3.b(new o1.g() { // from class: org.telegram.ui.Components.oa0
                            @Override // o1.g
                            public final void a(o1.h hVar, float f16, float f17) {
                                xa0 xa0Var3 = xa0.this;
                                xa0Var3.b.setTranslationY(f16);
                                xa0Var3.i();
                                float f18 = translationY;
                                xa0Var3.M = AndroidUtilities.lerp(f13, f15, (f16 - f18) / (f12 - f18));
                            }
                        });
                        if (!z11) {
                            xa0Var.K.a(new bi.u5(xa0Var, z12, 2));
                        }
                        xa0Var.K.a(new pa0());
                        xa0Var.K.f();
                    }
                    if (num != null && xa0Var.getVisibility() != num.intValue()) {
                        xa0Var.setVisibility(num.intValue());
                        break;
                    }
                }
                break;
            case 28:
                ((mb0) obj).S.n.l();
                break;
            default:
                ((ic0) obj).a();
                break;
        }
    }

    public /* synthetic */ dq(ou ouVar, n90 n90Var, ClickableSpan clickableSpan) {
        this.a = 9;
        this.b = ouVar;
    }
}
