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

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class yp implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ yp(Object obj, int i10) {
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
                ((dq) obj).dismiss();
                break;
            case 1:
                ((sq) obj).a();
                break;
            case 2:
                ((org.telegram.ui.ActionBar.e3) obj).dismiss();
                org.telegram.ui.ActionBar.m2 U = LaunchActivity.U();
                if (U != null) {
                    U.presentFragment(new PremiumPreviewFragment(0, "create_bot"));
                    break;
                }
                break;
            case 3:
                hr hrVar = ((fr) obj).c;
                TLRPC.Peer peer = hrVar.d0;
                org.telegram.ui.ActionBar.m2 m2Var = hrVar.f0;
                nr nrVar = new nr(m2Var, peer, hrVar.g0, hrVar.Y.size() > 1, hrVar.X);
                if (m2Var.getParentActivity() != null) {
                    m2Var.showDialog(nrVar);
                    break;
                } else {
                    nrVar.show();
                    break;
                }
            case 4:
                ((ci.d) obj).setLoading(true);
                break;
            case 5:
                js jsVar = (js) obj;
                jsVar.a.a(!r0.f, true);
                AndroidUtilities.runOnUIThread(jsVar.f, 3000L);
                break;
            case 6:
                ((go0) obj).V(false);
                break;
            case 7:
                ((ot) obj).a();
                break;
            case 8:
                ((ViewTreeObserver.OnPreDrawListener) obj).onPreDraw();
                break;
            case 9:
                ((lu) obj).getClass();
                break;
            case 10:
                nf.f.s(((ru) obj).a.getContext(), "https://play.google.com/store/apps/details?id=com.google.android.webview");
                break;
            case 11:
                wu wuVar = ((vu) obj).a;
                wuVar.n.setVisibility(4);
                wuVar.h.setVisibility(4);
                ImageView imageView = wuVar.x;
                imageView.setEnabled(true);
                imageView.setAlpha(1.0f);
                break;
            case 12:
                ((pv) obj).a(true, true);
                break;
            case 13:
                jx jxVar = (jx) obj;
                if (jxVar.Y.getEmojiView() != null) {
                    lz emojiView = jxVar.Y.getEmojiView();
                    if (!emojiView.f0) {
                        try {
                            int i12 = emojiView.R.s.get(EmojiData.dataColored.length);
                            if (i12 > 0) {
                                emojiView.P.B0();
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
                dy dyVar = (dy) obj;
                dyVar.s.f = true;
                dyVar.a(true);
                break;
            case 15:
                AndroidUtilities.updateViewShow(((yy) obj).h, true);
                break;
            case 16:
                ez ezVar = (ez) obj;
                ArrayList arrayList = ezVar.r;
                ArrayList arrayList2 = ezVar.h;
                gz gzVar = ezVar.w;
                int i13 = gzVar.M;
                lz lzVar = gzVar.Q;
                uw uwVar = lzVar.D0;
                if (i13 == ezVar.b) {
                    arrayList2.remove(arrayList);
                    gzVar.E = ezVar.c;
                    gzVar.F = ezVar.d;
                    gzVar.G = ezVar.e;
                    gzVar.H = ezVar.f;
                    gzVar.I = arrayList2;
                    gzVar.J = ezVar.n;
                    gzVar.K = new ArrayList(arrayList);
                    lzVar.G0.e(false);
                    s4.h0 adapter = uwVar.getAdapter();
                    gz gzVar2 = lzVar.z0;
                    if (adapter != gzVar2) {
                        uwVar.setAdapter(gzVar2);
                    }
                    gzVar.l();
                    break;
                }
                break;
            case 17:
                l00 l00Var = ((k00) obj).e;
                ArrayList arrayList3 = l00Var.h;
                if (!UserConfig.getInstance(UserConfig.selectedAccount).isPremium()) {
                    int i14 = 0;
                    while (i14 < arrayList3.size()) {
                        if (((h00) arrayList3.get(i14)).e && i14 != 0) {
                            g00 g00Var = l00Var.I;
                            l00 l00Var2 = g00Var.d;
                            ArrayList arrayList4 = l00Var2.h;
                            SparseIntArray sparseIntArray = l00Var2.k0;
                            int size = arrayList4.size();
                            if (i14 >= 0 && i14 < size) {
                                ArrayList<MessagesController.DialogFilter> dialogFilters = MessagesController.getInstance(UserConfig.selectedAccount).getDialogFilters();
                                int i15 = sparseIntArray.get(i14);
                                int i16 = ((h00) arrayList4.get(i14)).a;
                                for (int i17 = i14 - 1; i17 >= 0; i17--) {
                                    sparseIntArray.put(i17 + 1, sparseIntArray.get(i17));
                                }
                                MessagesController.DialogFilter remove = dialogFilters.remove(i14);
                                remove.order = 0;
                                dialogFilters.add(0, remove);
                                sparseIntArray.put(0, i15);
                                arrayList4.add(0, (h00) arrayList4.remove(i14));
                                ((h00) arrayList4.get(0)).a = i16;
                                for (int i18 = 0; i18 <= i14; i18++) {
                                    ((h00) arrayList4.get(i18)).a = i18;
                                    dialogFilters.get(i18).order = i18;
                                }
                                int i19 = 0;
                                while (i19 <= i14) {
                                    if (l00Var2.K == i19) {
                                        int i20 = i19 == i14 ? 0 : i19 + 1;
                                        l00Var2.L = i20;
                                        l00Var2.K = i20;
                                    }
                                    if (l00Var2.q0 == i19) {
                                        int i21 = i19 == i14 ? 0 : i19 + 1;
                                        l00Var2.r0 = i21;
                                        l00Var2.q0 = i21;
                                    }
                                    i19++;
                                }
                                g00Var.p(i14, 0);
                                f00 f00Var = l00Var2.J;
                                int i22 = ((h00) arrayList4.get(i14)).a;
                                org.telegram.ui.pw pwVar = (org.telegram.ui.pw) f00Var;
                                int i23 = 0;
                                while (true) {
                                    org.telegram.ui.py[] pyVarArr = pwVar.b.e0;
                                    if (i23 < pyVarArr.length) {
                                        org.telegram.ui.py pyVar = pyVarArr[i23];
                                        int i24 = pyVar.h;
                                        if (i24 == i22) {
                                            pyVar.h = i16;
                                        } else if (i24 == i16) {
                                            pyVar.h = i22;
                                        }
                                        i23++;
                                    } else {
                                        l00Var2.j();
                                        l00Var2.y = true;
                                        l00Var2.F.setItemAnimator(l00Var2.s0);
                                    }
                                }
                            }
                            l00Var.F.u0(0);
                            org.telegram.ui.nw nwVar = (org.telegram.ui.nw) l00Var;
                            org.telegram.ui.qy qyVar = nwVar.B0;
                            if (!qyVar.getMessagesController().premiumFeaturesBlocked()) {
                                try {
                                    nwVar.performHapticFeedback(3, 1);
                                } catch (Exception unused2) {
                                }
                                qc I = yc.a0(qyVar).I(R.raw.filter_reorder, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.LimitReachedReorderFolder, LocaleController.getString(R.string.FilterAllChats))), LocaleController.getString(R.string.PremiumMore), 5000, false, new org.telegram.ui.aj(nwVar, 22));
                                I.k(true);
                                qyVar.n3 = I;
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
                ((a30) obj).g(true);
                break;
            case 20:
                org.telegram.ui.zx zxVar = ((co0) ((f40) obj)).c0;
                if (!zxVar.u0.canScrollVertically(-1)) {
                    zxVar.t0.h1(0, 0);
                    break;
                }
                break;
            case 21:
                ((h40) obj).b.b(true);
                break;
            case 22:
                ((h40) obj).b.b(true);
                break;
            case 23:
                x40 x40Var = (x40) obj;
                lj0 lj0Var = x40Var.f;
                if (x40Var.n) {
                    lj0Var.getAnimatedDrawable().K(0);
                    lj0Var.setAnimation(x40Var.r);
                    lj0Var.d();
                    break;
                }
                break;
            case 24:
                c60 c60Var = (c60) ((ci.o2) obj).b;
                try {
                    s71 s71Var = c60Var.T;
                    if (s71Var != null && (videoEditedInfo = c60Var.S) != null && videoEditedInfo.endTime > 0) {
                        long n10 = s71Var.n();
                        VideoEditedInfo videoEditedInfo2 = c60Var.S;
                        if (n10 >= videoEditedInfo2.endTime) {
                            s71 s71Var2 = c60Var.T;
                            long j3 = videoEditedInfo2.startTime;
                            s71Var2.K(j3 > 0 ? j3 : 0L);
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
                ki.q0 q0Var = b60Var.O;
                if (q0Var != null && q0Var.a == 3) {
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
                na0 na0Var = (na0) obj;
                Activity parentActivity = na0Var.getParentActivity();
                Activity parentActivity2 = na0Var.getParentActivity();
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
                final za0 za0Var = (za0) obj;
                boolean z11 = za0Var.I;
                boolean z12 = !z11;
                gg.q1 q1Var = za0Var.e;
                ya0 ya0Var = za0Var.b;
                if (ya0Var == null || q1Var == null) {
                    za0Var.O = 0;
                    break;
                } else if (za0Var.L && (kVar = za0Var.K) != null && kVar.f && !z11) {
                    za0Var.O = 0;
                    break;
                } else {
                    boolean g10 = za0Var.g();
                    if (z11) {
                        int computeVerticalScrollRange = ya0Var.computeVerticalScrollRange();
                        f7 = (computeVerticalScrollRange - q1Var.h) + za0Var.s;
                        if (computeVerticalScrollRange <= 0 && za0Var.f.K() > 0 && (i10 = za0Var.O) < 3) {
                            za0Var.O = i10 + 1;
                            za0Var.o(true);
                            break;
                        }
                    } else {
                        f7 = (-za0Var.s) - AndroidUtilities.dp(6.0f);
                    }
                    za0Var.O = 0;
                    float f10 = za0Var.v;
                    float max = g10 ? -Math.max(0.0f, f10 - f7) : Math.max(0.0f, f10 - f7) + (-f10);
                    if (!z11 && !g10) {
                        max += ya0Var.computeVerticalScrollOffset();
                    }
                    final float f11 = max;
                    o1.k kVar2 = za0Var.K;
                    if (kVar2 != null) {
                        kVar2.c();
                    }
                    za0Var.L = z12;
                    final float translationY = ya0Var.getTranslationY();
                    final float f12 = za0Var.M;
                    float f13 = z11 ? 0.0f : 1.0f;
                    if (translationY == f11) {
                        za0Var.K = null;
                        num = Integer.valueOf(!z11 ? 8 : 0);
                        if (za0Var.N && !z11) {
                            za0Var.N = false;
                            ya0Var.setLayoutManager(za0Var.getNeededLayoutManager());
                            za0Var.I = true;
                            za0Var.o(true);
                        }
                    } else {
                        o1.k kVar3 = new o1.k(new o1.j(translationY));
                        o1.l lVar = new o1.l(f11);
                        lVar.a(1.0f);
                        lVar.b(550.0f);
                        kVar3.u = lVar;
                        za0Var.K = kVar3;
                        final float f14 = f13;
                        kVar3.b(new o1.g() { // from class: org.telegram.ui.Components.qa0
                            @Override // o1.g
                            public final void a(o1.h hVar, float f15, float f16) {
                                za0 za0Var2 = za0.this;
                                za0Var2.b.setTranslationY(f15);
                                za0Var2.i();
                                float f17 = translationY;
                                za0Var2.M = AndroidUtilities.lerp(f12, f14, (f15 - f17) / (f11 - f17));
                            }
                        });
                        if (!z11) {
                            za0Var.K.a(new ci.y4(za0Var, z12, 2));
                        }
                        za0Var.K.a(new ra0());
                        za0Var.K.f();
                    }
                    if (num != null && za0Var.getVisibility() != num.intValue()) {
                        za0Var.setVisibility(num.intValue());
                        break;
                    }
                }
                break;
            default:
                ((nb0) obj).S.n.l();
                break;
        }
    }

    public /* synthetic */ yp(lu luVar, o90 o90Var, ClickableSpan clickableSpan) {
        this.a = 9;
        this.b = luVar;
    }
}
