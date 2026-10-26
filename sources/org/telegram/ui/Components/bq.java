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

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class bq implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ bq(Object obj, int i10) {
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
                ((cq) obj).b.a();
                break;
            case 1:
                ((oq) obj).dismiss();
                break;
            case 2:
                ((cr) obj).a();
                break;
            case 3:
                ((org.telegram.ui.ActionBar.k3) obj).dismiss();
                org.telegram.ui.ActionBar.r2 U = LaunchActivity.U();
                if (U != null) {
                    U.presentFragment(new PremiumPreviewFragment(0, "create_bot"));
                    break;
                }
                break;
            case 4:
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
            case 5:
                ((fi.d) obj).setLoading(true);
                break;
            case 6:
                us usVar = (us) obj;
                usVar.a.a(!r0.f, true);
                AndroidUtilities.runOnUIThread(usVar.f, 3000L);
                break;
            case 7:
                ((yo0) obj).W(false);
                break;
            case 8:
                ((xt) obj).a();
                break;
            case 9:
                ((ViewTreeObserver.OnPreDrawListener) obj).onPreDraw();
                break;
            case 10:
                ((su) obj).getClass();
                break;
            case 11:
                qf.d.r(((yu) obj).a.getContext(), "https://play.google.com/store/apps/details?id=com.google.android.webview");
                break;
            case 12:
                dv dvVar = ((cv) obj).a;
                dvVar.n.setVisibility(4);
                dvVar.h.setVisibility(4);
                ImageView imageView = dvVar.x;
                imageView.setEnabled(true);
                imageView.setAlpha(1.0f);
                break;
            case 13:
                ((vv) obj).a(true, true);
                break;
            case 14:
                ox oxVar = (ox) obj;
                if (oxVar.Y.getEmojiView() != null) {
                    sz emojiView = oxVar.Y.getEmojiView();
                    if (!emojiView.f0) {
                        try {
                            int i11 = emojiView.R.s.get(EmojiData.dataColored.length);
                            if (i11 > 0) {
                                emojiView.P.C0();
                                emojiView.U(i11);
                                emojiView.G(i11, AndroidUtilities.dp(-9.0f));
                                emojiView.n(0, null);
                                break;
                            }
                        } catch (Exception unused) {
                            return;
                        }
                    }
                }
                break;
            case 15:
                iy iyVar = (iy) obj;
                iyVar.w.f = true;
                iyVar.a(true);
                break;
            case 16:
                AndroidUtilities.updateViewShow(((fz) obj).h, true);
                break;
            case 17:
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
            case 18:
                ((wz) obj).b();
                break;
            case 19:
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
                                org.telegram.ui.rx rxVar = (org.telegram.ui.rx) n00Var;
                                int i22 = 0;
                                while (true) {
                                    org.telegram.ui.ay[] ayVarArr = rxVar.b.e0;
                                    if (i22 < ayVarArr.length) {
                                        org.telegram.ui.ay ayVar = ayVarArr[i22];
                                        int i23 = ayVar.h;
                                        if (i23 == i21) {
                                            ayVar.h = i15;
                                        } else if (i23 == i15) {
                                            ayVar.h = i21;
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
                            org.telegram.ui.qx qxVar = (org.telegram.ui.qx) s00Var;
                            org.telegram.ui.cy cyVar = qxVar.B0;
                            if (!cyVar.getMessagesController().premiumFeaturesBlocked()) {
                                try {
                                    qxVar.performHapticFeedback(3, 1);
                                } catch (Exception unused2) {
                                }
                                qc I = wc.b0(cyVar).I(R.raw.filter_reorder, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.LimitReachedReorderFolder, LocaleController.getString(R.string.FilterAllChats))), LocaleController.getString(R.string.PremiumMore), 5000, false, new org.telegram.ui.ui(qxVar, 24));
                                I.k(true);
                                cyVar.o3 = I;
                                break;
                            }
                        } else {
                            i13++;
                        }
                    }
                    break;
                }
                break;
            case 20:
                z00 z00Var = (z00) obj;
                if (!z00Var.c) {
                    z00Var.setLayerType(0, null);
                    break;
                }
                break;
            case 21:
                ((k30) obj).g(true);
                break;
            case 22:
                org.telegram.ui.jx jxVar = ((uo0) ((p40) obj)).e0;
                if (!jxVar.w0.canScrollVertically(-1)) {
                    jxVar.v0.h1(0, 0);
                    break;
                }
                break;
            case 23:
                ((r40) obj).b.b(true);
                break;
            case 24:
                ((r40) obj).b.b(true);
                break;
            case 25:
                i50 i50Var = (i50) obj;
                ak0 ak0Var = i50Var.f;
                if (i50Var.n) {
                    ak0Var.getAnimatedDrawable().K(0);
                    ak0Var.setAnimation(i50Var.r);
                    ak0Var.d();
                    break;
                }
                break;
            case 26:
                o60 o60Var = (o60) ((f6.r) obj).b;
                try {
                    s81 s81Var = o60Var.T;
                    if (s81Var != null && (videoEditedInfo = o60Var.S) != null && videoEditedInfo.endTime > 0) {
                        long n10 = s81Var.n();
                        VideoEditedInfo videoEditedInfo2 = o60Var.S;
                        if (n10 >= videoEditedInfo2.endTime) {
                            s81 s81Var2 = o60Var.T;
                            long j10 = videoEditedInfo2.startTime;
                            s81Var2.K(j10 > 0 ? j10 : 0L);
                            break;
                        }
                    }
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
                break;
            case 27:
                n60 n60Var = (n60) obj;
                vi.r0 r0Var = n60Var.R;
                if (r0Var != null && r0Var.a == 3) {
                    long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
                    long j11 = n60Var.F0;
                    if (j11 == 0 || elapsedRealtimeNanos - j11 >= 70000000) {
                        n60Var.A();
                        break;
                    }
                }
                break;
            case 28:
                oa0 oa0Var = (oa0) obj;
                if (oa0Var.d) {
                    oa0Var.e = true;
                    oa0Var.r = false;
                    oa0Var.f = 0.0f;
                    oa0Var.h = SystemClock.uptimeMillis();
                    oa0Var.invalidate();
                    break;
                }
                break;
            default:
                ta0 ta0Var = (ta0) obj;
                Activity parentActivity = ta0Var.getParentActivity();
                Activity parentActivity2 = ta0Var.getParentActivity();
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

    public /* synthetic */ bq(su suVar, aa0 aa0Var, ClickableSpan clickableSpan) {
        this.a = 10;
        this.b = suVar;
    }
}
