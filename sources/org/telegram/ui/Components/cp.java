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

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class cp implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ cp(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        VideoEditedInfo videoEditedInfo;
        int i10 = this.a;
        Object obj = this.b;
        switch (i10) {
            case 0:
                ((dp) obj).setVisibility(8);
                break;
            case 1:
                ((cq) obj).b.a();
                break;
            case 2:
                ((oq) obj).dismiss();
                break;
            case 3:
                ((cr) obj).a();
                break;
            case 4:
                ((org.telegram.ui.ActionBar.k3) obj).dismiss();
                org.telegram.ui.ActionBar.r2 U = LaunchActivity.U();
                if (U != null) {
                    U.presentFragment(new PremiumPreviewFragment(0, "create_bot"));
                    break;
                }
                break;
            case 5:
                tr trVar = ((rr) obj).c;
                TLRPC.Peer peer = trVar.d0;
                org.telegram.ui.ActionBar.r2 r2Var = trVar.f0;
                zr zrVar = new zr(r2Var, peer, trVar.g0, trVar.Y.size() > 1, trVar.X);
                if (r2Var.getParentActivity() != null) {
                    r2Var.showDialog(zrVar);
                    break;
                } else {
                    zrVar.show();
                    break;
                }
            case 6:
                ((fi.d) obj).setLoading(true);
                break;
            case 7:
                us usVar = (us) obj;
                usVar.a.a(!r0.f, true);
                AndroidUtilities.runOnUIThread(usVar.f, 3000L);
                break;
            case 8:
                ((zo0) obj).W(false);
                break;
            case 9:
                ((xt) obj).a();
                break;
            case 10:
                ((ViewTreeObserver.OnPreDrawListener) obj).onPreDraw();
                break;
            case 11:
                ((su) obj).getClass();
                break;
            case 12:
                qf.d.r(((yu) obj).a.getContext(), "https://play.google.com/store/apps/details?id=com.google.android.webview");
                break;
            case 13:
                dv dvVar = ((cv) obj).a;
                dvVar.n.setVisibility(4);
                dvVar.h.setVisibility(4);
                ImageView imageView = dvVar.x;
                imageView.setEnabled(true);
                imageView.setAlpha(1.0f);
                break;
            case 14:
                ((vv) obj).a(true, true);
                break;
            case 15:
                ox oxVar = (ox) obj;
                if (oxVar.Y.getEmojiView() != null) {
                    sz emojiView = oxVar.Y.getEmojiView();
                    if (!emojiView.f0) {
                        try {
                            int i11 = emojiView.R.s.get(EmojiData.dataColored.length);
                            if (i11 > 0) {
                                emojiView.P.C0();
                                emojiView.V(i11);
                                emojiView.H(i11, AndroidUtilities.dp(-9.0f));
                                emojiView.n(0, null);
                                break;
                            }
                        } catch (Exception unused) {
                            return;
                        }
                    }
                }
                break;
            case 16:
                iy iyVar = (iy) obj;
                iyVar.w.f = true;
                iyVar.a(true);
                break;
            case 17:
                AndroidUtilities.updateViewShow(((fz) obj).h, true);
                break;
            case 18:
                lz lzVar = (lz) obj;
                ArrayList arrayList = lzVar.r;
                ArrayList arrayList2 = lzVar.h;
                nz nzVar = lzVar.w;
                int i12 = nzVar.M;
                sz szVar = nzVar.Q;
                zw zwVar = szVar.D0;
                if (i12 == lzVar.b) {
                    arrayList2.remove(arrayList);
                    nzVar.E = lzVar.c;
                    nzVar.F = lzVar.d;
                    nzVar.G = lzVar.e;
                    nzVar.H = lzVar.f;
                    nzVar.I = arrayList2;
                    nzVar.J = lzVar.n;
                    nzVar.K = new ArrayList(arrayList);
                    szVar.G0.e(false);
                    s4.h0 adapter = zwVar.getAdapter();
                    nz nzVar2 = szVar.z0;
                    if (adapter != nzVar2) {
                        zwVar.setAdapter(nzVar2);
                    }
                    nzVar.l();
                    break;
                }
                break;
            case 19:
                ((wz) obj).b();
                break;
            case 20:
                s00 s00Var = ((r00) obj).e;
                ArrayList arrayList3 = s00Var.h;
                if (!UserConfig.getInstance(UserConfig.selectedAccount).isPremium()) {
                    int i13 = 0;
                    while (i13 < arrayList3.size()) {
                        if (((p00) arrayList3.get(i13)).e && i13 != 0) {
                            o00 o00Var = s00Var.I;
                            s00 s00Var2 = o00Var.d;
                            ArrayList arrayList4 = s00Var2.h;
                            SparseIntArray sparseIntArray = s00Var2.k0;
                            int size = arrayList4.size();
                            if (i13 >= 0 && i13 < size) {
                                ArrayList<MessagesController.DialogFilter> dialogFilters = MessagesController.getInstance(UserConfig.selectedAccount).getDialogFilters();
                                int i14 = sparseIntArray.get(i13);
                                int i15 = ((p00) arrayList4.get(i13)).a;
                                for (int i16 = i13 - 1; i16 >= 0; i16--) {
                                    sparseIntArray.put(i16 + 1, sparseIntArray.get(i16));
                                }
                                MessagesController.DialogFilter remove = dialogFilters.remove(i13);
                                remove.order = 0;
                                dialogFilters.add(0, remove);
                                sparseIntArray.put(0, i14);
                                arrayList4.add(0, (p00) arrayList4.remove(i13));
                                ((p00) arrayList4.get(0)).a = i15;
                                for (int i17 = 0; i17 <= i13; i17++) {
                                    ((p00) arrayList4.get(i17)).a = i17;
                                    dialogFilters.get(i17).order = i17;
                                }
                                int i18 = 0;
                                while (i18 <= i13) {
                                    if (s00Var2.K == i18) {
                                        int i19 = i18 == i13 ? 0 : i18 + 1;
                                        s00Var2.L = i19;
                                        s00Var2.K = i19;
                                    }
                                    if (s00Var2.q0 == i18) {
                                        int i20 = i18 == i13 ? 0 : i18 + 1;
                                        s00Var2.r0 = i20;
                                        s00Var2.q0 = i20;
                                    }
                                    i18++;
                                }
                                o00Var.p(i13, 0);
                                n00 n00Var = s00Var2.J;
                                int i21 = ((p00) arrayList4.get(i13)).a;
                                org.telegram.ui.ux uxVar = (org.telegram.ui.ux) n00Var;
                                int i22 = 0;
                                while (true) {
                                    org.telegram.ui.dy[] dyVarArr = uxVar.b.e0;
                                    if (i22 < dyVarArr.length) {
                                        org.telegram.ui.dy dyVar = dyVarArr[i22];
                                        int i23 = dyVar.h;
                                        if (i23 == i21) {
                                            dyVar.h = i15;
                                        } else if (i23 == i15) {
                                            dyVar.h = i21;
                                        }
                                        i22++;
                                    } else {
                                        s00Var2.j();
                                        s00Var2.y = true;
                                        s00Var2.F.setItemAnimator(s00Var2.s0);
                                    }
                                }
                            }
                            s00Var.F.v0(0);
                            org.telegram.ui.tx txVar = (org.telegram.ui.tx) s00Var;
                            org.telegram.ui.ey eyVar = txVar.B0;
                            if (!eyVar.getMessagesController().premiumFeaturesBlocked()) {
                                try {
                                    txVar.performHapticFeedback(3, 1);
                                } catch (Exception unused2) {
                                }
                                qc I = wc.b0(eyVar).I(R.raw.filter_reorder, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.LimitReachedReorderFolder, LocaleController.getString(R.string.FilterAllChats))), LocaleController.getString(R.string.PremiumMore), 5000, false, new org.telegram.ui.xi(txVar, 24));
                                I.k(true);
                                eyVar.o3 = I;
                                break;
                            }
                        } else {
                            i13++;
                        }
                    }
                    break;
                }
                break;
            case 21:
                z00 z00Var = (z00) obj;
                if (!z00Var.c) {
                    z00Var.setLayerType(0, null);
                    break;
                }
                break;
            case 22:
                ((k30) obj).g(true);
                break;
            case 23:
                org.telegram.ui.mx mxVar = ((vo0) ((p40) obj)).e0;
                if (!mxVar.w0.canScrollVertically(-1)) {
                    mxVar.v0.h1(0, 0);
                    break;
                }
                break;
            case 24:
                ((r40) obj).b.b(true);
                break;
            case 25:
                ((r40) obj).b.b(true);
                break;
            case 26:
                i50 i50Var = (i50) obj;
                bk0 bk0Var = i50Var.f;
                if (i50Var.n) {
                    bk0Var.getAnimatedDrawable().K(0);
                    bk0Var.setAnimation(i50Var.r);
                    bk0Var.d();
                    break;
                }
                break;
            case 27:
                p60 p60Var = (p60) ((f6.r) obj).b;
                try {
                    t81 t81Var = p60Var.S;
                    if (t81Var != null && (videoEditedInfo = p60Var.R) != null) {
                        if (videoEditedInfo.endTime > 0) {
                            long n10 = t81Var.n();
                            VideoEditedInfo videoEditedInfo2 = p60Var.R;
                            if (n10 >= videoEditedInfo2.endTime) {
                                t81 t81Var2 = p60Var.S;
                                long j10 = videoEditedInfo2.startTime;
                                t81Var2.K(j10 > 0 ? j10 : 0L);
                                break;
                            }
                        }
                    }
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
                break;
            case 28:
                pa0 pa0Var = (pa0) obj;
                if (pa0Var.d) {
                    pa0Var.e = true;
                    pa0Var.r = false;
                    pa0Var.f = 0.0f;
                    pa0Var.h = SystemClock.uptimeMillis();
                    pa0Var.invalidate();
                    break;
                }
                break;
            default:
                ua0 ua0Var = (ua0) obj;
                Activity parentActivity = ua0Var.getParentActivity();
                Activity parentActivity2 = ua0Var.getParentActivity();
                DispatchQueue dispatchQueue = rg.k1.m;
                boolean z10 = parentActivity2.getSharedPreferences("shapedetector_conf", 0).getBoolean("learning", false);
                SharedPreferences.Editor edit = parentActivity.getSharedPreferences("shapedetector_conf", 0).edit();
                if (z10) {
                    edit.clear();
                } else {
                    edit.putBoolean("learning", true);
                }
                edit.apply();
                break;
        }
    }

    public /* synthetic */ cp(su suVar, ba0 ba0Var, ClickableSpan clickableSpan) {
        this.a = 11;
        this.b = suVar;
    }
}
