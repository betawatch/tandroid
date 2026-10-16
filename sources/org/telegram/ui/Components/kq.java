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

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final /* synthetic */ class kq implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ kq(Object obj, int i10) {
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
                ((pq) obj).dismiss();
                break;
            case 1:
                ((er) obj).a();
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
                ur urVar = ((sr) obj).c;
                TLRPC.Peer peer = urVar.d0;
                org.telegram.ui.ActionBar.m2 m2Var = urVar.f0;
                as asVar = new as(m2Var, peer, urVar.g0, urVar.Y.size() > 1, urVar.X);
                if (m2Var.getParentActivity() != null) {
                    m2Var.showDialog(asVar);
                    break;
                } else {
                    asVar.show();
                    break;
                }
            case 4:
                ((di.d) obj).setLoading(true);
                break;
            case 5:
                vs vsVar = (vs) obj;
                vsVar.a.a(!r0.f, true);
                AndroidUtilities.runOnUIThread(vsVar.f, 3000L);
                break;
            case 6:
                ((uo0) obj).V(false);
                break;
            case 7:
                ((au) obj).a();
                break;
            case 8:
                ((ViewTreeObserver.OnPreDrawListener) obj).onPreDraw();
                break;
            case 9:
                ((wu) obj).getClass();
                break;
            case 10:
                pf.d.r(((cv) obj).a.getContext(), "https://play.google.com/store/apps/details?id=com.google.android.webview");
                break;
            case 11:
                hv hvVar = ((gv) obj).a;
                hvVar.n.setVisibility(4);
                hvVar.h.setVisibility(4);
                ImageView imageView = hvVar.x;
                imageView.setEnabled(true);
                imageView.setAlpha(1.0f);
                break;
            case 12:
                ((zv) obj).a(true, true);
                break;
            case 13:
                tx txVar = (tx) obj;
                if (txVar.Y.getEmojiView() != null) {
                    wz emojiView = txVar.Y.getEmojiView();
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
                ny nyVar = (ny) obj;
                nyVar.s.f = true;
                nyVar.a(true);
                break;
            case 15:
                AndroidUtilities.updateViewShow(((iz) obj).h, true);
                break;
            case 16:
                pz pzVar = (pz) obj;
                ArrayList arrayList = pzVar.r;
                ArrayList arrayList2 = pzVar.h;
                rz rzVar = pzVar.w;
                int i13 = rzVar.M;
                wz wzVar = rzVar.Q;
                ex exVar = wzVar.D0;
                if (i13 == pzVar.b) {
                    arrayList2.remove(arrayList);
                    rzVar.E = pzVar.c;
                    rzVar.F = pzVar.d;
                    rzVar.G = pzVar.e;
                    rzVar.H = pzVar.f;
                    rzVar.I = arrayList2;
                    rzVar.J = pzVar.n;
                    rzVar.K = new ArrayList(arrayList);
                    wzVar.G0.e(false);
                    s4.g0 adapter = exVar.getAdapter();
                    rz rzVar2 = wzVar.z0;
                    if (adapter != rzVar2) {
                        exVar.setAdapter(rzVar2);
                    }
                    rzVar.l();
                    break;
                }
                break;
            case 17:
                w00 w00Var = ((v00) obj).e;
                ArrayList arrayList3 = w00Var.h;
                if (!UserConfig.getInstance(UserConfig.selectedAccount).isPremium()) {
                    int i14 = 0;
                    while (i14 < arrayList3.size()) {
                        if (((s00) arrayList3.get(i14)).e && i14 != 0) {
                            r00 r00Var = w00Var.I;
                            w00 w00Var2 = r00Var.d;
                            ArrayList arrayList4 = w00Var2.h;
                            SparseIntArray sparseIntArray = w00Var2.k0;
                            int size = arrayList4.size();
                            if (i14 >= 0 && i14 < size) {
                                ArrayList<MessagesController.DialogFilter> dialogFilters = MessagesController.getInstance(UserConfig.selectedAccount).getDialogFilters();
                                int i15 = sparseIntArray.get(i14);
                                int i16 = ((s00) arrayList4.get(i14)).a;
                                for (int i17 = i14 - 1; i17 >= 0; i17--) {
                                    sparseIntArray.put(i17 + 1, sparseIntArray.get(i17));
                                }
                                MessagesController.DialogFilter remove = dialogFilters.remove(i14);
                                remove.order = 0;
                                dialogFilters.add(0, remove);
                                sparseIntArray.put(0, i15);
                                arrayList4.add(0, (s00) arrayList4.remove(i14));
                                ((s00) arrayList4.get(0)).a = i16;
                                for (int i18 = 0; i18 <= i14; i18++) {
                                    ((s00) arrayList4.get(i18)).a = i18;
                                    dialogFilters.get(i18).order = i18;
                                }
                                int i19 = 0;
                                while (i19 <= i14) {
                                    if (w00Var2.K == i19) {
                                        int i20 = i19 == i14 ? 0 : i19 + 1;
                                        w00Var2.L = i20;
                                        w00Var2.K = i20;
                                    }
                                    if (w00Var2.q0 == i19) {
                                        int i21 = i19 == i14 ? 0 : i19 + 1;
                                        w00Var2.r0 = i21;
                                        w00Var2.q0 = i21;
                                    }
                                    i19++;
                                }
                                r00Var.p(i14, 0);
                                q00 q00Var = w00Var2.J;
                                int i22 = ((s00) arrayList4.get(i14)).a;
                                org.telegram.ui.xw xwVar = (org.telegram.ui.xw) q00Var;
                                int i23 = 0;
                                while (true) {
                                    org.telegram.ui.xy[] xyVarArr = xwVar.b.e0;
                                    if (i23 < xyVarArr.length) {
                                        org.telegram.ui.xy xyVar = xyVarArr[i23];
                                        int i24 = xyVar.h;
                                        if (i24 == i22) {
                                            xyVar.h = i16;
                                        } else if (i24 == i16) {
                                            xyVar.h = i22;
                                        }
                                        i23++;
                                    } else {
                                        w00Var2.j();
                                        w00Var2.y = true;
                                        w00Var2.F.setItemAnimator(w00Var2.s0);
                                    }
                                }
                            }
                            w00Var.F.u0(0);
                            org.telegram.ui.ww wwVar = (org.telegram.ui.ww) w00Var;
                            org.telegram.ui.yy yyVar = wwVar.B0;
                            if (!yyVar.getMessagesController().premiumFeaturesBlocked()) {
                                try {
                                    wwVar.performHapticFeedback(3, 1);
                                } catch (Exception unused2) {
                                }
                                sc I = zc.a0(yyVar).I(R.raw.filter_reorder, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.LimitReachedReorderFolder, LocaleController.getString(R.string.FilterAllChats))), LocaleController.getString(R.string.PremiumMore), 5000, false, new org.telegram.ui.gj(wwVar, 23));
                                I.k(true);
                                yyVar.o3 = I;
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
                d10 d10Var = (d10) obj;
                if (!d10Var.c) {
                    d10Var.setLayerType(0, null);
                    break;
                }
                break;
            case 19:
                ((m30) obj).g(true);
                break;
            case 20:
                org.telegram.ui.iy iyVar = ((qo0) ((r40) obj)).c0;
                if (!iyVar.u0.canScrollVertically(-1)) {
                    iyVar.t0.h1(0, 0);
                    break;
                }
                break;
            case 21:
                ((t40) obj).b.b(true);
                break;
            case 22:
                ((t40) obj).b.b(true);
                break;
            case 23:
                k50 k50Var = (k50) obj;
                bk0 bk0Var = k50Var.f;
                if (k50Var.n) {
                    bk0Var.getAnimatedDrawable().K(0);
                    bk0Var.setAnimation(k50Var.r);
                    bk0Var.d();
                    break;
                }
                break;
            case 24:
                p60 p60Var = (p60) ((di.n2) obj).b;
                try {
                    i81 i81Var = p60Var.T;
                    if (i81Var != null && (videoEditedInfo = p60Var.S) != null && videoEditedInfo.endTime > 0) {
                        long n10 = i81Var.n();
                        VideoEditedInfo videoEditedInfo2 = p60Var.S;
                        if (n10 >= videoEditedInfo2.endTime) {
                            i81 i81Var2 = p60Var.T;
                            long j10 = videoEditedInfo2.startTime;
                            i81Var2.K(j10 > 0 ? j10 : 0L);
                            break;
                        }
                    }
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
                break;
            case 25:
                o60 o60Var = (o60) obj;
                ri.q0 q0Var = o60Var.R;
                if (q0Var != null && q0Var.a == 3) {
                    long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
                    long j11 = o60Var.F0;
                    if (j11 == 0 || elapsedRealtimeNanos - j11 >= 70000000) {
                        o60Var.A();
                        break;
                    }
                }
                break;
            case 26:
                sa0 sa0Var = (sa0) obj;
                if (sa0Var.d) {
                    sa0Var.e = true;
                    sa0Var.r = false;
                    sa0Var.f = 0.0f;
                    sa0Var.h = SystemClock.uptimeMillis();
                    sa0Var.invalidate();
                    break;
                }
                break;
            case 27:
                cb0 cb0Var = (cb0) obj;
                Activity parentActivity = cb0Var.getParentActivity();
                Activity parentActivity2 = cb0Var.getParentActivity();
                DispatchQueue dispatchQueue = qg.k1.m;
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
                final ob0 ob0Var = (ob0) obj;
                boolean z11 = ob0Var.I;
                boolean z12 = !z11;
                hg.p1 p1Var = ob0Var.e;
                nb0 nb0Var = ob0Var.b;
                if (nb0Var == null || p1Var == null) {
                    ob0Var.O = 0;
                    break;
                } else if (ob0Var.L && (kVar = ob0Var.K) != null && kVar.f && !z11) {
                    ob0Var.O = 0;
                    break;
                } else {
                    boolean g10 = ob0Var.g();
                    if (z11) {
                        int computeVerticalScrollRange = nb0Var.computeVerticalScrollRange();
                        f7 = (computeVerticalScrollRange - p1Var.h) + ob0Var.s;
                        if (computeVerticalScrollRange <= 0 && ob0Var.f.K() > 0 && (i10 = ob0Var.O) < 3) {
                            ob0Var.O = i10 + 1;
                            ob0Var.o(true);
                            break;
                        }
                    } else {
                        f7 = (-ob0Var.s) - AndroidUtilities.dp(6.0f);
                    }
                    ob0Var.O = 0;
                    float f10 = ob0Var.v;
                    float max = g10 ? -Math.max(0.0f, f10 - f7) : Math.max(0.0f, f10 - f7) + (-f10);
                    if (!z11 && !g10) {
                        max += nb0Var.computeVerticalScrollOffset();
                    }
                    final float f11 = max;
                    o1.k kVar2 = ob0Var.K;
                    if (kVar2 != null) {
                        kVar2.c();
                    }
                    ob0Var.L = z12;
                    final float translationY = nb0Var.getTranslationY();
                    final float f12 = ob0Var.M;
                    float f13 = z11 ? 0.0f : 1.0f;
                    if (translationY == f11) {
                        ob0Var.K = null;
                        num = Integer.valueOf(!z11 ? 8 : 0);
                        if (ob0Var.N && !z11) {
                            ob0Var.N = false;
                            nb0Var.setLayoutManager(ob0Var.getNeededLayoutManager());
                            ob0Var.I = true;
                            ob0Var.o(true);
                        }
                    } else {
                        o1.k kVar3 = new o1.k(new o1.j(translationY));
                        o1.l lVar = new o1.l(f11);
                        lVar.a(1.0f);
                        lVar.b(550.0f);
                        kVar3.u = lVar;
                        ob0Var.K = kVar3;
                        final float f14 = f13;
                        kVar3.b(new o1.g() { // from class: org.telegram.ui.Components.fb0
                            @Override // o1.g
                            public final void a(o1.h hVar, float f15, float f16) {
                                ob0 ob0Var2 = ob0.this;
                                ob0Var2.b.setTranslationY(f15);
                                ob0Var2.i();
                                float f17 = translationY;
                                ob0Var2.M = AndroidUtilities.lerp(f12, f14, (f15 - f17) / (f11 - f17));
                            }
                        });
                        if (!z11) {
                            ob0Var.K.a(new di.x4(ob0Var, z12, 2));
                        }
                        ob0Var.K.a(new gb0());
                        ob0Var.K.h();
                    }
                    if (num != null && ob0Var.getVisibility() != num.intValue()) {
                        ob0Var.setVisibility(num.intValue());
                        break;
                    }
                }
                break;
            default:
                ((cc0) obj).S.n.l();
                break;
        }
    }

    public /* synthetic */ kq(wu wuVar, ea0 ea0Var, ClickableSpan clickableSpan) {
        this.a = 9;
        this.b = wuVar;
    }
}
