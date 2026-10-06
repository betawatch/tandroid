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

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes3.dex */
public final /* synthetic */ class aq implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ aq(Object obj, int i10) {
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
                ((fq) obj).dismiss();
                break;
            case 1:
                ((uq) obj).a();
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
                jr jrVar = ((hr) obj).c;
                TLRPC.Peer peer = jrVar.d0;
                org.telegram.ui.ActionBar.n2 n2Var = jrVar.f0;
                pr prVar = new pr(n2Var, peer, jrVar.g0, jrVar.Y.size() > 1, jrVar.X);
                if (n2Var.getParentActivity() != null) {
                    n2Var.showDialog(prVar);
                    break;
                } else {
                    prVar.show();
                    break;
                }
            case 4:
                ((ci.d) obj).setLoading(true);
                break;
            case 5:
                ls lsVar = (ls) obj;
                lsVar.a.a(!r0.f, true);
                AndroidUtilities.runOnUIThread(lsVar.f, 3000L);
                break;
            case 6:
                ((lo0) obj).V(false);
                break;
            case 7:
                ((qt) obj).a();
                break;
            case 8:
                ((ViewTreeObserver.OnPreDrawListener) obj).onPreDraw();
                break;
            case 9:
                ((nu) obj).getClass();
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
                lx lxVar = (lx) obj;
                if (lxVar.W.getEmojiView() != null) {
                    nz emojiView = lxVar.W.getEmojiView();
                    if (!emojiView.f0) {
                        try {
                            int i12 = emojiView.R.s.get(EmojiData.dataColored.length);
                            if (i12 > 0) {
                                emojiView.P.C0();
                                emojiView.S(i12);
                                emojiView.E(i12, AndroidUtilities.dp(-9.0f));
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
                fy fyVar = (fy) obj;
                fyVar.s.f = true;
                fyVar.a(true);
                break;
            case 15:
                AndroidUtilities.updateViewShow(((az) obj).h, true);
                break;
            case 16:
                gz gzVar = (gz) obj;
                ArrayList arrayList = gzVar.r;
                ArrayList arrayList2 = gzVar.h;
                iz izVar = gzVar.w;
                int i13 = izVar.M;
                nz nzVar = izVar.Q;
                vw vwVar = nzVar.D0;
                if (i13 == gzVar.b) {
                    arrayList2.remove(arrayList);
                    izVar.E = gzVar.c;
                    izVar.F = gzVar.d;
                    izVar.G = gzVar.e;
                    izVar.H = gzVar.f;
                    izVar.I = arrayList2;
                    izVar.J = gzVar.n;
                    izVar.K = new ArrayList(arrayList);
                    nzVar.G0.e(false);
                    s4.h0 adapter = vwVar.getAdapter();
                    iz izVar2 = nzVar.z0;
                    if (adapter != izVar2) {
                        vwVar.setAdapter(izVar2);
                    }
                    izVar.l();
                    break;
                }
                break;
            case 17:
                n00 n00Var = ((m00) obj).e;
                ArrayList arrayList3 = n00Var.h;
                if (!UserConfig.getInstance(UserConfig.selectedAccount).isPremium()) {
                    int i14 = 0;
                    while (i14 < arrayList3.size()) {
                        if (((j00) arrayList3.get(i14)).e && i14 != 0) {
                            i00 i00Var = n00Var.I;
                            n00 n00Var2 = i00Var.d;
                            ArrayList arrayList4 = n00Var2.h;
                            SparseIntArray sparseIntArray = n00Var2.k0;
                            int size = arrayList4.size();
                            if (i14 >= 0 && i14 < size) {
                                ArrayList<MessagesController.DialogFilter> dialogFilters = MessagesController.getInstance(UserConfig.selectedAccount).getDialogFilters();
                                int i15 = sparseIntArray.get(i14);
                                int i16 = ((j00) arrayList4.get(i14)).a;
                                for (int i17 = i14 - 1; i17 >= 0; i17--) {
                                    sparseIntArray.put(i17 + 1, sparseIntArray.get(i17));
                                }
                                MessagesController.DialogFilter remove = dialogFilters.remove(i14);
                                remove.order = 0;
                                dialogFilters.add(0, remove);
                                sparseIntArray.put(0, i15);
                                arrayList4.add(0, (j00) arrayList4.remove(i14));
                                ((j00) arrayList4.get(0)).a = i16;
                                for (int i18 = 0; i18 <= i14; i18++) {
                                    ((j00) arrayList4.get(i18)).a = i18;
                                    dialogFilters.get(i18).order = i18;
                                }
                                int i19 = 0;
                                while (i19 <= i14) {
                                    if (n00Var2.K == i19) {
                                        int i20 = i19 == i14 ? 0 : i19 + 1;
                                        n00Var2.L = i20;
                                        n00Var2.K = i20;
                                    }
                                    if (n00Var2.q0 == i19) {
                                        int i21 = i19 == i14 ? 0 : i19 + 1;
                                        n00Var2.r0 = i21;
                                        n00Var2.q0 = i21;
                                    }
                                    i19++;
                                }
                                i00Var.p(i14, 0);
                                h00 h00Var = n00Var2.J;
                                int i22 = ((j00) arrayList4.get(i14)).a;
                                org.telegram.ui.ly lyVar = (org.telegram.ui.ly) h00Var;
                                int i23 = 0;
                                while (true) {
                                    org.telegram.ui.ty[] tyVarArr = lyVar.b.e0;
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
                                        n00Var2.j();
                                        n00Var2.y = true;
                                        n00Var2.F.setItemAnimator(n00Var2.s0);
                                    }
                                }
                            }
                            n00Var.F.v0(0);
                            org.telegram.ui.ky kyVar = (org.telegram.ui.ky) n00Var;
                            org.telegram.ui.uy uyVar = kyVar.B0;
                            if (!uyVar.getMessagesController().premiumFeaturesBlocked()) {
                                try {
                                    kyVar.performHapticFeedback(3, 1);
                                } catch (Exception unused2) {
                                }
                                rc I = yc.a0(uyVar).I(R.raw.filter_reorder, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.LimitReachedReorderFolder, LocaleController.getString(R.string.FilterAllChats))), LocaleController.getString(R.string.PremiumMore), 5000, false, new org.telegram.ui.bj(kyVar, 24));
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
                u00 u00Var = (u00) obj;
                if (!u00Var.c) {
                    u00Var.setLayerType(0, null);
                    break;
                }
                break;
            case 19:
                ((d30) obj).g(true);
                break;
            case 20:
                org.telegram.ui.dy dyVar = ((ho0) ((i40) obj)).c0;
                if (!dyVar.w0.canScrollVertically(-1)) {
                    dyVar.v0.h1(0, 0);
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
                nj0 nj0Var = a50Var.f;
                if (a50Var.n) {
                    nj0Var.getAnimatedDrawable().K(0);
                    nj0Var.setAnimation(a50Var.r);
                    nj0Var.d();
                    break;
                }
                break;
            case 24:
                f60 f60Var = (f60) ((ci.o2) obj).b;
                try {
                    e81 e81Var = f60Var.T;
                    if (e81Var != null && (videoEditedInfo = f60Var.S) != null && videoEditedInfo.endTime > 0) {
                        long n10 = e81Var.n();
                        VideoEditedInfo videoEditedInfo2 = f60Var.S;
                        if (n10 >= videoEditedInfo2.endTime) {
                            e81 e81Var2 = f60Var.T;
                            long j3 = videoEditedInfo2.startTime;
                            e81Var2.K(j3 > 0 ? j3 : 0L);
                            break;
                        }
                    }
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
                break;
            case 25:
                e60 e60Var = (e60) obj;
                ki.r0 r0Var = e60Var.R;
                if (r0Var != null && r0Var.a == 3) {
                    long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
                    long j10 = e60Var.y0;
                    if (j10 == 0 || elapsedRealtimeNanos - j10 >= 70000000) {
                        e60Var.w();
                        break;
                    }
                }
                break;
            case 26:
                fa0 fa0Var = (fa0) obj;
                if (fa0Var.d) {
                    fa0Var.e = true;
                    fa0Var.r = false;
                    fa0Var.f = 0.0f;
                    fa0Var.h = SystemClock.uptimeMillis();
                    fa0Var.invalidate();
                    break;
                }
                break;
            case 27:
                pa0 pa0Var = (pa0) obj;
                Activity parentActivity = pa0Var.getParentActivity();
                Activity parentActivity2 = pa0Var.getParentActivity();
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
                final bb0 bb0Var = (bb0) obj;
                boolean z11 = bb0Var.I;
                boolean z12 = !z11;
                gg.q1 q1Var = bb0Var.e;
                ab0 ab0Var = bb0Var.b;
                if (ab0Var == null || q1Var == null) {
                    bb0Var.O = 0;
                    break;
                } else if (bb0Var.L && (kVar = bb0Var.K) != null && kVar.f && !z11) {
                    bb0Var.O = 0;
                    break;
                } else {
                    boolean g10 = bb0Var.g();
                    if (z11) {
                        int computeVerticalScrollRange = ab0Var.computeVerticalScrollRange();
                        f7 = (computeVerticalScrollRange - q1Var.h) + bb0Var.s;
                        if (computeVerticalScrollRange <= 0 && bb0Var.f.K() > 0 && (i10 = bb0Var.O) < 3) {
                            bb0Var.O = i10 + 1;
                            bb0Var.o(true);
                            break;
                        }
                    } else {
                        f7 = (-bb0Var.s) - AndroidUtilities.dp(6.0f);
                    }
                    bb0Var.O = 0;
                    float f10 = bb0Var.v;
                    float max = g10 ? -Math.max(0.0f, f10 - f7) : Math.max(0.0f, f10 - f7) + (-f10);
                    if (!z11 && !g10) {
                        max += ab0Var.computeVerticalScrollOffset();
                    }
                    final float f11 = max;
                    o1.k kVar2 = bb0Var.K;
                    if (kVar2 != null) {
                        kVar2.c();
                    }
                    bb0Var.L = z12;
                    final float translationY = ab0Var.getTranslationY();
                    final float f12 = bb0Var.M;
                    float f13 = z11 ? 0.0f : 1.0f;
                    if (translationY == f11) {
                        bb0Var.K = null;
                        num = Integer.valueOf(!z11 ? 8 : 0);
                        if (bb0Var.N && !z11) {
                            bb0Var.N = false;
                            ab0Var.setLayoutManager(bb0Var.getNeededLayoutManager());
                            bb0Var.I = true;
                            bb0Var.o(true);
                        }
                    } else {
                        o1.k kVar3 = new o1.k(new o1.j(translationY));
                        o1.l lVar = new o1.l(f11);
                        lVar.a(1.0f);
                        lVar.b(550.0f);
                        kVar3.u = lVar;
                        bb0Var.K = kVar3;
                        final float f14 = f13;
                        kVar3.b(new o1.g() { // from class: org.telegram.ui.Components.sa0
                            @Override // o1.g
                            public final void a(o1.h hVar, float f15, float f16) {
                                bb0 bb0Var2 = bb0.this;
                                bb0Var2.b.setTranslationY(f15);
                                bb0Var2.i();
                                float f17 = translationY;
                                bb0Var2.M = AndroidUtilities.lerp(f12, f14, (f15 - f17) / (f11 - f17));
                            }
                        });
                        if (!z11) {
                            bb0Var.K.a(new ci.y4(bb0Var, z12, 2));
                        }
                        bb0Var.K.a(new ta0());
                        bb0Var.K.f();
                    }
                    if (num != null && bb0Var.getVisibility() != num.intValue()) {
                        bb0Var.setVisibility(num.intValue());
                        break;
                    }
                }
                break;
            default:
                ((pb0) obj).S.n.l();
                break;
        }
    }

    public /* synthetic */ aq(nu nuVar, r90 r90Var, ClickableSpan clickableSpan) {
        this.a = 9;
        this.b = nuVar;
    }
}
