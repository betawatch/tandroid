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

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class up implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ up(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        VideoEditedInfo videoEditedInfo;
        float f10;
        int i10;
        final qa0 qa0Var;
        o1.j jVar;
        int i11 = this.a;
        Integer num = null;
        Object obj = this.b;
        switch (i11) {
            case 0:
                ((zp) obj).dismiss();
                break;
            case 1:
                ((oq) obj).a();
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
                dr drVar = ((br) obj).c;
                TLRPC.Peer peer = drVar.a0;
                org.telegram.ui.ActionBar.p2 p2Var = drVar.c0;
                ir irVar = new ir(p2Var, peer, drVar.d0, drVar.V.size() > 1, drVar.U);
                if (p2Var.getParentActivity() != null) {
                    p2Var.showDialog(irVar);
                    break;
                } else {
                    irVar.show();
                    break;
                }
            case 4:
                ((ph.d) obj).setLoading(true);
                break;
            case 5:
                gs gsVar = (gs) obj;
                gsVar.a.a(!r0.f, true);
                AndroidUtilities.runOnUIThread(gsVar.f, 3000L);
                break;
            case 6:
                ((xn0) obj).V(false);
                break;
            case 7:
                ((ht) obj).a();
                break;
            case 8:
                ((ViewTreeObserver.OnPreDrawListener) obj).onPreDraw();
                break;
            case 9:
                ((du) obj).getClass();
                break;
            case 10:
                ze.d.s(((ju) obj).a.getContext(), "https://play.google.com/store/apps/details?id=com.google.android.webview");
                break;
            case 11:
                ou ouVar = ((nu) obj).a;
                ouVar.n.setVisibility(4);
                ouVar.h.setVisibility(4);
                ImageView imageView = ouVar.x;
                imageView.setEnabled(true);
                imageView.setAlpha(1.0f);
                break;
            case 12:
                ((gv) obj).a(true, true);
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
                k00 k00Var = ((j00) obj).e;
                ArrayList arrayList3 = k00Var.h;
                if (!UserConfig.getInstance(UserConfig.selectedAccount).isPremium()) {
                    int i14 = 0;
                    while (i14 < arrayList3.size()) {
                        if (((h00) arrayList3.get(i14)).e && i14 != 0) {
                            g00 g00Var = k00Var.F;
                            k00 k00Var2 = g00Var.d;
                            ArrayList arrayList4 = k00Var2.h;
                            SparseIntArray sparseIntArray = k00Var2.h0;
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
                                    if (k00Var2.H == i19) {
                                        int i20 = i19 == i14 ? 0 : i19 + 1;
                                        k00Var2.I = i20;
                                        k00Var2.H = i20;
                                    }
                                    if (k00Var2.n0 == i19) {
                                        int i21 = i19 == i14 ? 0 : i19 + 1;
                                        k00Var2.o0 = i21;
                                        k00Var2.n0 = i21;
                                    }
                                    i19++;
                                }
                                g00Var.p(i14, 0);
                                f00 f00Var = k00Var2.G;
                                int i22 = ((h00) arrayList4.get(i14)).a;
                                org.telegram.ui.qw qwVar = (org.telegram.ui.qw) f00Var;
                                int i23 = 0;
                                while (true) {
                                    org.telegram.ui.py[] pyVarArr = qwVar.b.b0;
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
                                        k00Var2.j();
                                        k00Var2.y = true;
                                        k00Var2.C.setItemAnimator(k00Var2.p0);
                                    }
                                }
                            }
                            k00Var.C.u0(0);
                            org.telegram.ui.pw pwVar2 = (org.telegram.ui.pw) k00Var;
                            org.telegram.ui.qy qyVar = pwVar2.y0;
                            if (!qyVar.getMessagesController().premiumFeaturesBlocked()) {
                                try {
                                    pwVar2.performHapticFeedback(3, 1);
                                } catch (Exception unused2) {
                                }
                                ic I = qc.a0(qyVar).I(R.raw.filter_reorder, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.LimitReachedReorderFolder, LocaleController.getString(R.string.FilterAllChats))), LocaleController.getString(R.string.PremiumMore), 5000, false, new org.telegram.ui.bj(pwVar2, 22));
                                I.k(true);
                                qyVar.k3 = I;
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
                ((b30) obj).g(true);
                break;
            case 20:
                org.telegram.ui.zx zxVar2 = ((tn0) ((h40) obj)).Z;
                if (!zxVar2.r0.canScrollVertically(-1)) {
                    zxVar2.q0.h1(0, 0);
                    break;
                }
                break;
            case 21:
                ((j40) obj).b.b(true);
                break;
            case 22:
                ((j40) obj).b.b(true);
                break;
            case 23:
                z40 z40Var = (z40) obj;
                jj0 jj0Var = z40Var.f;
                if (z40Var.n) {
                    jj0Var.getAnimatedDrawable().I(0);
                    jj0Var.setAnimation(z40Var.r);
                    jj0Var.d();
                    break;
                }
                break;
            case 24:
                y50 y50Var = (y50) ((h50) obj).b;
                try {
                    i71 i71Var = y50Var.L;
                    if (i71Var != null && (videoEditedInfo = y50Var.K) != null) {
                        if (videoEditedInfo.endTime > 0) {
                            long n10 = i71Var.n();
                            VideoEditedInfo videoEditedInfo2 = y50Var.K;
                            if (n10 >= videoEditedInfo2.endTime) {
                                i71 i71Var2 = y50Var.L;
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
                u90 u90Var = (u90) obj;
                if (u90Var.d) {
                    u90Var.e = true;
                    u90Var.r = false;
                    u90Var.f = 0.0f;
                    u90Var.h = SystemClock.uptimeMillis();
                    u90Var.invalidate();
                    break;
                }
                break;
            case 26:
                ea0 ea0Var = (ea0) obj;
                Activity parentActivity = ea0Var.getParentActivity();
                Activity parentActivity2 = ea0Var.getParentActivity();
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
                qa0 qa0Var2 = (qa0) obj;
                boolean z10 = qa0Var2.F;
                boolean z11 = !z10;
                tf.z0 z0Var = qa0Var2.e;
                pa0 pa0Var = qa0Var2.b;
                if (pa0Var == null || z0Var == null) {
                    qa0Var2.L = 0;
                    break;
                } else if (qa0Var2.I && (jVar = qa0Var2.H) != null && jVar.f && !z10) {
                    qa0Var2.L = 0;
                    break;
                } else {
                    boolean g10 = qa0Var2.g();
                    if (z10) {
                        int computeVerticalScrollRange = pa0Var.computeVerticalScrollRange();
                        float f11 = (computeVerticalScrollRange - z0Var.h) + qa0Var2.s;
                        if (computeVerticalScrollRange <= 0 && qa0Var2.f.K() > 0 && (i10 = qa0Var2.L) < 3) {
                            qa0Var2.L = i10 + 1;
                            qa0Var2.o(true);
                            break;
                        } else {
                            f10 = f11;
                        }
                    } else {
                        f10 = (-qa0Var2.s) - AndroidUtilities.dp(6.0f);
                    }
                    qa0Var2.L = 0;
                    float f12 = qa0Var2.v;
                    float max = g10 ? -Math.max(0.0f, f12 - f10) : Math.max(0.0f, f12 - f10) + (-f12);
                    if (!z10 && !g10) {
                        max += pa0Var.computeVerticalScrollOffset();
                    }
                    final float f13 = max;
                    o1.j jVar2 = qa0Var2.H;
                    if (jVar2 != null) {
                        jVar2.c();
                    }
                    qa0Var2.I = z11;
                    final float translationY = pa0Var.getTranslationY();
                    final float f14 = qa0Var2.J;
                    float f15 = z10 ? 0.0f : 1.0f;
                    if (translationY == f13) {
                        qa0Var2.H = null;
                        num = Integer.valueOf(!z10 ? 8 : 0);
                        if (qa0Var2.K && !z10) {
                            qa0Var2.K = false;
                            pa0Var.setLayoutManager(qa0Var2.getNeededLayoutManager());
                            qa0Var2.F = true;
                            qa0Var2.o(true);
                        }
                        qa0Var = qa0Var2;
                    } else {
                        o1.j jVar3 = new o1.j(new kb.a(translationY));
                        o1.k kVar = new o1.k(f13);
                        kVar.a(1.0f);
                        kVar.b(550.0f);
                        jVar3.u = kVar;
                        qa0Var2.H = jVar3;
                        qa0Var = qa0Var2;
                        final float f16 = f15;
                        jVar3.b(new o1.g() { // from class: org.telegram.ui.Components.ha0
                            @Override // o1.g
                            public final void a(o1.h hVar, float f17, float f18) {
                                qa0 qa0Var3 = qa0.this;
                                qa0Var3.b.setTranslationY(f17);
                                qa0Var3.i();
                                float f19 = translationY;
                                qa0Var3.J = AndroidUtilities.lerp(f14, f16, (f17 - f19) / (f13 - f19));
                            }
                        });
                        if (!z10) {
                            qa0Var.H.a(new dg.z(qa0Var, z11, 2));
                        }
                        qa0Var.H.a(new ia0());
                        qa0Var.H.f();
                    }
                    if (num != null && qa0Var.getVisibility() != num.intValue()) {
                        qa0Var.setVisibility(num.intValue());
                        break;
                    }
                }
                break;
            case 28:
                ((eb0) obj).S.n.l();
                break;
            default:
                ((bc0) obj).a();
                break;
        }
    }

    public /* synthetic */ up(du duVar, g90 g90Var, ClickableSpan clickableSpan) {
        this.a = 9;
        this.b = duVar;
    }
}
