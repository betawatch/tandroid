package org.telegram.ui;

import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final /* synthetic */ class j11 implements org.telegram.ui.Components.am0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ j11(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.ui.Components.am0
    public final void d(int i10, View view) {
        float f7;
        s4.b1 K;
        int i11 = 0;
        int i12 = 1;
        switch (this.a) {
            case 0:
                ProxyListActivity.U((ProxyListActivity) this.b, view, i10);
                return;
            case 1:
                d21.U((d21) this.b, view);
                return;
            case 2:
                v21.U((v21) this.b, view, i10);
                return;
            case 3:
                e31 e31Var = (e31) this.b;
                ti.a aVar = ti.e.d;
                if (i10 == 1) {
                    aVar.a();
                    boolean z10 = !aVar.d;
                    synchronized (aVar) {
                        aVar.d = z10;
                        aVar.c = true;
                        aVar.b = true;
                        ti.d.a.edit().putBoolean("round_video_camera2_enabled", z10).apply();
                    }
                    e31Var.b.l();
                    return;
                }
                aVar.a();
                if (!aVar.d) {
                    return;
                }
                if (i10 == 2) {
                    e31Var.V(R.string.RoundVideoOutputResolution, new CharSequence[]{"480p", "360p"}, new wv(19));
                    return;
                }
                if (i10 == 3) {
                    e31Var.V(R.string.RoundVideoCameraResolution, new CharSequence[]{LocaleController.getString(R.string.RoundVideoCameraResolutionHigh), LocaleController.getString(R.string.RoundVideoCameraResolutionMedium), LocaleController.getString(R.string.RoundVideoCameraResolutionLow)}, new wv(20));
                    return;
                }
                if (i10 == 4) {
                    e31Var.V(R.string.RoundVideoFrameRate, new CharSequence[]{"30 FPS", "60 FPS"}, new wv(21));
                    return;
                }
                if (i10 != 5) {
                    if (i10 == 8) {
                        ti.a aVar2 = ti.e.i;
                        aVar2.a();
                        aVar2.b(!aVar2.d);
                        e31Var.b.m(i10);
                        return;
                    }
                    return;
                }
                CharSequence[] charSequenceArr = new CharSequence[4];
                while (true) {
                    int[] iArr = e31.c;
                    if (i11 >= 3) {
                        e31Var.V(R.string.RoundVideoBitrate, charSequenceArr, new wv(22));
                        return;
                    } else {
                        charSequenceArr[i11] = e31.U(iArr[i11]);
                        i11++;
                    }
                }
            case 4:
                l61 l61Var = (l61) this.b;
                org.telegram.ui.Components.m61 G = l61Var.i0.G(i10 - 1);
                if (G == null) {
                    return;
                }
                Object obj = G.G;
                if ((obj instanceof TLRPC.User) || (obj instanceof TLRPC.Chat)) {
                    ((org.telegram.ui.Cells.i6) view).s(true, true);
                    l61Var.a0 = (TLObject) G.G;
                    l61Var.U(true);
                    l61Var.i0.N(true);
                    return;
                }
                return;
            case 5:
                ((o61) this.b).Q(i10, view);
                return;
            case 6:
                SessionsActivity.U((SessionsActivity) this.b, i10);
                return;
            case 7:
                u91 u91Var = (u91) this.b;
                ArrayList arrayList = u91Var.N;
                ArrayList arrayList2 = u91Var.O;
                z81 z81Var = u91Var.X;
                int i13 = z81Var.I;
                if (i10 >= i13 && i10 <= z81Var.J) {
                    r91 r91Var = (r91) u91Var.v0.get(i10 - i13);
                    yi0 yi0Var = new yi0(r91Var.b, true, u91Var.b);
                    yi0Var.e0 = r91Var;
                    u91Var.presentFragment(yi0Var);
                    return;
                }
                int i14 = z81Var.U;
                if (i10 >= i14 && i10 <= z81Var.V) {
                    ((n91) u91Var.Q.get(i10 - i14)).b(u91Var);
                    return;
                }
                int i15 = z81Var.R;
                if (i10 >= i15 && i10 <= z81Var.S) {
                    ((n91) arrayList2.get(i10 - i15)).b(u91Var);
                    return;
                }
                int i16 = z81Var.X;
                if (i10 >= i16 && i10 <= z81Var.Y) {
                    ((n91) u91Var.P.get(i10 - i16)).b(u91Var);
                    return;
                }
                if (i10 == z81Var.Z) {
                    int size = arrayList.size() - arrayList2.size();
                    int i17 = u91Var.X.Z;
                    arrayList2.clear();
                    arrayList2.addAll(arrayList);
                    z81 z81Var2 = u91Var.X;
                    if (z81Var2 != null) {
                        z81Var2.E();
                        u91Var.S.setItemAnimator(u91Var.Y);
                        u91Var.X.s(i17 + 1, size);
                        u91Var.X.u(i17);
                        return;
                    }
                    return;
                }
                return;
            case 8:
                qc1 qc1Var = (qc1) this.b;
                boolean z11 = qc1Var.X0 != null;
                qc1Var.Z0(i10);
                if (z11 == (qc1Var.X0 == null)) {
                    qc1Var.L0();
                    qc1Var.l1();
                }
                qc1Var.n1();
                qc1Var.K0[1].a(qc1Var.X0 != null, true);
                qc1Var.Q0.g1();
                int left = view.getLeft();
                int right = view.getRight();
                int dp = AndroidUtilities.dp(52.0f);
                int i18 = left - dp;
                if (i18 < 0) {
                    qc1Var.Q0.v0(i18, 0, null);
                    return;
                }
                int i19 = right + dp;
                if (i19 > qc1Var.Q0.getMeasuredWidth()) {
                    xa1 xa1Var = qc1Var.Q0;
                    xa1Var.v0(i19 - xa1Var.getMeasuredWidth(), 0, null);
                    return;
                }
                return;
            case 9:
                md1 md1Var = (md1) this.b;
                int i20 = md1Var.H;
                HashSet hashSet = md1Var.w;
                if (view instanceof org.telegram.ui.Cells.f4) {
                    org.telegram.ui.Cells.f4 f4Var = (org.telegram.ui.Cells.f4) view;
                    TLRPC.Chat chat = (TLRPC.Chat) f4Var.getObject();
                    if (hashSet.contains(Long.valueOf(chat.id))) {
                        hashSet.remove(Long.valueOf(chat.id));
                        f4Var.c(false, true);
                    } else {
                        hashSet.add(Long.valueOf(chat.id));
                        f4Var.c(true, true);
                    }
                    if (hashSet.isEmpty() && md1Var.v != -1 && md1Var.n.getVisibility() == 0) {
                        md1Var.v = -1;
                        md1Var.n.animate().setListener(null).cancel();
                        md1Var.n.animate().translationY(i20).setDuration(200L).setListener(new id1(md1Var, i11)).start();
                        org.telegram.ui.Components.mm0 mm0Var = md1Var.s.getVisibility() == 0 ? md1Var.b : md1Var.a;
                        mm0Var.e1(false);
                        int N0 = ((s4.b0) mm0Var.getLayoutManager()).N0();
                        f7 = 12.0f;
                        if ((N0 == mm0Var.getAdapter().h() - 1 || (N0 == mm0Var.getAdapter().h() - 2 && mm0Var == md1Var.a)) && (K = mm0Var.K(N0)) != null) {
                            int bottom = K.a.getBottom();
                            if (N0 == md1Var.d.c - 2) {
                                bottom += AndroidUtilities.dp(12.0f);
                            }
                            if (mm0Var.getMeasuredHeight() - bottom <= i20) {
                                mm0Var.setTranslationY(-(mm0Var.getMeasuredHeight() - bottom));
                                mm0Var.animate().translationY(0.0f).setDuration(200L).start();
                            }
                        }
                        md1Var.a.setPadding(0, 0, 0, 0);
                        md1Var.b.setPadding(0, 0, 0, 0);
                    } else {
                        f7 = 12.0f;
                    }
                    if (!hashSet.isEmpty() && md1Var.n.getVisibility() == 8 && md1Var.v != 1) {
                        md1Var.v = 1;
                        md1Var.n.setVisibility(0);
                        md1Var.n.setTranslationY(i20);
                        md1Var.n.animate().setListener(null).cancel();
                        md1Var.n.animate().translationY(0.0f).setDuration(200L).setListener(new id1(md1Var, i12)).start();
                        md1Var.a.setPadding(0, 0, 0, i20 - AndroidUtilities.dp(f7));
                        md1Var.b.setPadding(0, 0, 0, i20);
                    }
                    if (!hashSet.isEmpty()) {
                        md1Var.c.setText(LocaleController.formatString("LeaveChats", R.string.LeaveChats, LocaleController.formatPluralString("Chats", hashSet.size(), new Object[0])));
                    }
                    if (hashSet.isEmpty()) {
                        return;
                    }
                    org.telegram.ui.Components.mm0 mm0Var2 = md1Var.s.getVisibility() == 0 ? md1Var.b : md1Var.a;
                    int height = mm0Var2.getHeight() - view.getBottom();
                    if (height < i20) {
                        mm0Var2.v0(0, i20 - height, null);
                        return;
                    }
                    return;
                }
                return;
            case 10:
                ye1.V((ye1) this.b, view);
                return;
            case 11:
                ye1 ye1Var = ((te1) this.b).t0;
                if (view instanceof org.telegram.ui.Cells.qa) {
                    og.d.m(ye1Var, ye1Var.a, ((org.telegram.ui.Cells.qa) view).getTopic(), 0);
                    return;
                } else {
                    if (view instanceof ue1) {
                        ue1 ue1Var = (ue1) view;
                        og.d.m(ye1Var, ye1Var.a, ue1Var.N, ue1Var.getMessageId());
                        return;
                    }
                    return;
                }
            case 12:
                TwoStepVerificationActivity.c0((TwoStepVerificationActivity) this.b, i10);
                return;
            case 13:
                WallpapersListActivity.V((WallpapersListActivity) this.b, i10);
                return;
            default:
                ci1 ci1Var = (ci1) this.b;
                ci1Var.getClass();
                String string = LocaleController.getString(R.string.BackgroundSearchColor);
                StringBuilder i21 = si.o0.i(string, " ");
                String[] strArr = WallpapersListActivity.n0;
                i21.append(LocaleController.getString(strArr[i10], WallpapersListActivity.o0[i10]));
                SpannableString spannableString = new SpannableString(i21.toString());
                spannableString.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.B8, false)), string.length(), spannableString.length(), 33);
                WallpapersListActivity wallpapersListActivity = ci1Var.E;
                wallpapersListActivity.L.setSearchFieldCaption(spannableString);
                wallpapersListActivity.L.setSearchFieldHint(null);
                wallpapersListActivity.L.H("", true);
                ci1Var.n = strArr[i10];
                ci1Var.E("", true);
                return;
        }
    }
}
