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

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
public final /* synthetic */ class f11 implements org.telegram.ui.Components.xl0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ f11(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.ui.Components.xl0
    public final void a(int i10, View view) {
        float f7;
        s4.b1 K;
        int i11 = 0;
        int i12 = 1;
        switch (this.a) {
            case 0:
                ProxyListActivity.U((ProxyListActivity) this.b, view, i10);
                return;
            case 1:
                z11.U((z11) this.b, view);
                return;
            case 2:
                r21.U((r21) this.b, view, i10);
                return;
            case 3:
                a31 a31Var = (a31) this.b;
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
                    a31Var.b.l();
                    return;
                }
                aVar.a();
                if (!aVar.d) {
                    return;
                }
                if (i10 == 2) {
                    a31Var.V(R.string.RoundVideoOutputResolution, new CharSequence[]{"480p", "360p"}, new fk0(9));
                    return;
                }
                if (i10 == 3) {
                    a31Var.V(R.string.RoundVideoCameraResolution, new CharSequence[]{LocaleController.getString(R.string.RoundVideoCameraResolutionHigh), LocaleController.getString(R.string.RoundVideoCameraResolutionMedium), LocaleController.getString(R.string.RoundVideoCameraResolutionLow)}, new fk0(10));
                    return;
                }
                if (i10 == 4) {
                    a31Var.V(R.string.RoundVideoFrameRate, new CharSequence[]{"30 FPS", "60 FPS"}, new fk0(11));
                    return;
                }
                if (i10 != 5) {
                    if (i10 == 8) {
                        ti.a aVar2 = ti.e.i;
                        aVar2.a();
                        aVar2.b(!aVar2.d);
                        a31Var.b.m(i10);
                        return;
                    }
                    return;
                }
                CharSequence[] charSequenceArr = new CharSequence[4];
                while (true) {
                    int[] iArr = a31.c;
                    if (i11 >= 3) {
                        a31Var.V(R.string.RoundVideoBitrate, charSequenceArr, new fk0(12));
                        return;
                    } else {
                        charSequenceArr[i11] = a31.U(iArr[i11]);
                        i11++;
                    }
                }
            case 4:
                h61 h61Var = (h61) this.b;
                org.telegram.ui.Components.h61 G = h61Var.i0.G(i10 - 1);
                if (G == null) {
                    return;
                }
                Object obj = G.G;
                if ((obj instanceof TLRPC.User) || (obj instanceof TLRPC.Chat)) {
                    ((org.telegram.ui.Cells.h6) view).t(true, true);
                    h61Var.a0 = (TLObject) G.G;
                    h61Var.V(true);
                    h61Var.i0.N(true);
                    return;
                }
                return;
            case 5:
                ((k61) this.b).R(i10, view);
                return;
            case 6:
                SessionsActivity.U((SessionsActivity) this.b, i10);
                return;
            case 7:
                p91 p91Var = (p91) this.b;
                ArrayList arrayList = p91Var.N;
                ArrayList arrayList2 = p91Var.O;
                u81 u81Var = p91Var.X;
                int i13 = u81Var.I;
                if (i10 >= i13 && i10 <= u81Var.J) {
                    m91 m91Var = (m91) p91Var.v0.get(i10 - i13);
                    ui0 ui0Var = new ui0(m91Var.b, true, p91Var.b);
                    ui0Var.e0 = m91Var;
                    p91Var.presentFragment(ui0Var);
                    return;
                }
                int i14 = u81Var.U;
                if (i10 >= i14 && i10 <= u81Var.V) {
                    ((i91) p91Var.Q.get(i10 - i14)).b(p91Var);
                    return;
                }
                int i15 = u81Var.R;
                if (i10 >= i15 && i10 <= u81Var.S) {
                    ((i91) arrayList2.get(i10 - i15)).b(p91Var);
                    return;
                }
                int i16 = u81Var.X;
                if (i10 >= i16 && i10 <= u81Var.Y) {
                    ((i91) p91Var.P.get(i10 - i16)).b(p91Var);
                    return;
                }
                if (i10 == u81Var.Z) {
                    int size = arrayList.size() - arrayList2.size();
                    int i17 = p91Var.X.Z;
                    arrayList2.clear();
                    arrayList2.addAll(arrayList);
                    u81 u81Var2 = p91Var.X;
                    if (u81Var2 != null) {
                        u81Var2.E();
                        p91Var.S.setItemAnimator(p91Var.Y);
                        p91Var.X.s(i17 + 1, size);
                        p91Var.X.u(i17);
                        return;
                    }
                    return;
                }
                return;
            case 8:
                kc1 kc1Var = (kc1) this.b;
                boolean z11 = kc1Var.W0 != null;
                kc1Var.Z0(i10);
                if (z11 == (kc1Var.W0 == null)) {
                    kc1Var.M0();
                    kc1Var.l1();
                }
                kc1Var.n1();
                kc1Var.J0[1].a(kc1Var.W0 != null, true);
                kc1Var.P0.f1();
                int left = view.getLeft();
                int right = view.getRight();
                int dp = AndroidUtilities.dp(52.0f);
                int i18 = left - dp;
                if (i18 < 0) {
                    kc1Var.P0.v0(i18, 0, null);
                    return;
                }
                int i19 = right + dp;
                if (i19 > kc1Var.P0.getMeasuredWidth()) {
                    sa1 sa1Var = kc1Var.P0;
                    sa1Var.v0(i19 - sa1Var.getMeasuredWidth(), 0, null);
                    return;
                }
                return;
            case 9:
                gd1 gd1Var = (gd1) this.b;
                int i20 = gd1Var.H;
                HashSet hashSet = gd1Var.w;
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
                    if (hashSet.isEmpty() && gd1Var.v != -1 && gd1Var.n.getVisibility() == 0) {
                        gd1Var.v = -1;
                        gd1Var.n.animate().setListener(null).cancel();
                        gd1Var.n.animate().translationY(i20).setDuration(200L).setListener(new cd1(gd1Var, i11)).start();
                        org.telegram.ui.Components.jm0 jm0Var = gd1Var.s.getVisibility() == 0 ? gd1Var.b : gd1Var.a;
                        jm0Var.d1(false);
                        int N0 = ((s4.b0) jm0Var.getLayoutManager()).N0();
                        f7 = 12.0f;
                        if ((N0 == jm0Var.getAdapter().h() - 1 || (N0 == jm0Var.getAdapter().h() - 2 && jm0Var == gd1Var.a)) && (K = jm0Var.K(N0)) != null) {
                            int bottom = K.a.getBottom();
                            if (N0 == gd1Var.d.c - 2) {
                                bottom += AndroidUtilities.dp(12.0f);
                            }
                            if (jm0Var.getMeasuredHeight() - bottom <= i20) {
                                jm0Var.setTranslationY(-(jm0Var.getMeasuredHeight() - bottom));
                                jm0Var.animate().translationY(0.0f).setDuration(200L).start();
                            }
                        }
                        gd1Var.a.setPadding(0, 0, 0, 0);
                        gd1Var.b.setPadding(0, 0, 0, 0);
                    } else {
                        f7 = 12.0f;
                    }
                    if (!hashSet.isEmpty() && gd1Var.n.getVisibility() == 8 && gd1Var.v != 1) {
                        gd1Var.v = 1;
                        gd1Var.n.setVisibility(0);
                        gd1Var.n.setTranslationY(i20);
                        gd1Var.n.animate().setListener(null).cancel();
                        gd1Var.n.animate().translationY(0.0f).setDuration(200L).setListener(new cd1(gd1Var, i12)).start();
                        gd1Var.a.setPadding(0, 0, 0, i20 - AndroidUtilities.dp(f7));
                        gd1Var.b.setPadding(0, 0, 0, i20);
                    }
                    if (!hashSet.isEmpty()) {
                        gd1Var.c.setText(LocaleController.formatString("LeaveChats", R.string.LeaveChats, LocaleController.formatPluralString("Chats", hashSet.size(), new Object[0])));
                    }
                    if (hashSet.isEmpty()) {
                        return;
                    }
                    org.telegram.ui.Components.jm0 jm0Var2 = gd1Var.s.getVisibility() == 0 ? gd1Var.b : gd1Var.a;
                    int height = jm0Var2.getHeight() - view.getBottom();
                    if (height < i20) {
                        jm0Var2.v0(0, i20 - height, null);
                        return;
                    }
                    return;
                }
                return;
            case 10:
                re1.V((re1) this.b, view);
                return;
            case 11:
                re1 re1Var = ((ne1) this.b).t0;
                if (view instanceof org.telegram.ui.Cells.pa) {
                    og.d.m(re1Var, re1Var.a, ((org.telegram.ui.Cells.pa) view).getTopic(), 0);
                    return;
                } else {
                    if (view instanceof oe1) {
                        oe1 oe1Var = (oe1) view;
                        og.d.m(re1Var, re1Var.a, oe1Var.N, oe1Var.getMessageId());
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
                vh1 vh1Var = (vh1) this.b;
                vh1Var.getClass();
                String string = LocaleController.getString(R.string.BackgroundSearchColor);
                StringBuilder i21 = r4.c.i(string, " ");
                String[] strArr = WallpapersListActivity.n0;
                i21.append(LocaleController.getString(strArr[i10], WallpapersListActivity.o0[i10]));
                SpannableString spannableString = new SpannableString(i21.toString());
                spannableString.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.B8, false)), string.length(), spannableString.length(), 33);
                WallpapersListActivity wallpapersListActivity = vh1Var.E;
                wallpapersListActivity.L.setSearchFieldCaption(spannableString);
                wallpapersListActivity.L.setSearchFieldHint(null);
                wallpapersListActivity.L.H("", true);
                vh1Var.n = strArr[i10];
                vh1Var.E("", true);
                return;
        }
    }
}
