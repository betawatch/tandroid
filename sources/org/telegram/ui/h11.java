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

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final /* synthetic */ class h11 implements org.telegram.ui.Components.wl0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ h11(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.ui.Components.wl0
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
                b21.U((b21) this.b, view);
                return;
            case 2:
                t21.U((t21) this.b, view, i10);
                return;
            case 3:
                c31 c31Var = (c31) this.b;
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
                    c31Var.b.l();
                    return;
                }
                aVar.a();
                if (!aVar.d) {
                    return;
                }
                if (i10 == 2) {
                    c31Var.V(R.string.RoundVideoOutputResolution, new CharSequence[]{"480p", "360p"}, new hk0(9));
                    return;
                }
                if (i10 == 3) {
                    c31Var.V(R.string.RoundVideoCameraResolution, new CharSequence[]{LocaleController.getString(R.string.RoundVideoCameraResolutionHigh), LocaleController.getString(R.string.RoundVideoCameraResolutionMedium), LocaleController.getString(R.string.RoundVideoCameraResolutionLow)}, new hk0(10));
                    return;
                }
                if (i10 == 4) {
                    c31Var.V(R.string.RoundVideoFrameRate, new CharSequence[]{"30 FPS", "60 FPS"}, new hk0(11));
                    return;
                }
                if (i10 != 5) {
                    if (i10 == 8) {
                        ti.a aVar2 = ti.e.i;
                        aVar2.a();
                        aVar2.b(!aVar2.d);
                        c31Var.b.m(i10);
                        return;
                    }
                    return;
                }
                CharSequence[] charSequenceArr = new CharSequence[4];
                while (true) {
                    int[] iArr = c31.c;
                    if (i11 >= 3) {
                        c31Var.V(R.string.RoundVideoBitrate, charSequenceArr, new hk0(12));
                        return;
                    } else {
                        charSequenceArr[i11] = c31.U(iArr[i11]);
                        i11++;
                    }
                }
            case 4:
                j61 j61Var = (j61) this.b;
                org.telegram.ui.Components.f61 G = j61Var.i0.G(i10 - 1);
                if (G == null) {
                    return;
                }
                Object obj = G.G;
                if ((obj instanceof TLRPC.User) || (obj instanceof TLRPC.Chat)) {
                    ((org.telegram.ui.Cells.h6) view).s(true, true);
                    j61Var.a0 = (TLObject) G.G;
                    j61Var.V(true);
                    j61Var.i0.N(true);
                    return;
                }
                return;
            case 5:
                ((m61) this.b).R(i10, view);
                return;
            case 6:
                SessionsActivity.U((SessionsActivity) this.b, i10);
                return;
            case 7:
                r91 r91Var = (r91) this.b;
                ArrayList arrayList = r91Var.N;
                ArrayList arrayList2 = r91Var.O;
                w81 w81Var = r91Var.X;
                int i13 = w81Var.I;
                if (i10 >= i13 && i10 <= w81Var.J) {
                    o91 o91Var = (o91) r91Var.v0.get(i10 - i13);
                    wi0 wi0Var = new wi0(o91Var.b, true, r91Var.b);
                    wi0Var.e0 = o91Var;
                    r91Var.presentFragment(wi0Var);
                    return;
                }
                int i14 = w81Var.U;
                if (i10 >= i14 && i10 <= w81Var.V) {
                    ((k91) r91Var.Q.get(i10 - i14)).b(r91Var);
                    return;
                }
                int i15 = w81Var.R;
                if (i10 >= i15 && i10 <= w81Var.S) {
                    ((k91) arrayList2.get(i10 - i15)).b(r91Var);
                    return;
                }
                int i16 = w81Var.X;
                if (i10 >= i16 && i10 <= w81Var.Y) {
                    ((k91) r91Var.P.get(i10 - i16)).b(r91Var);
                    return;
                }
                if (i10 == w81Var.Z) {
                    int size = arrayList.size() - arrayList2.size();
                    int i17 = r91Var.X.Z;
                    arrayList2.clear();
                    arrayList2.addAll(arrayList);
                    w81 w81Var2 = r91Var.X;
                    if (w81Var2 != null) {
                        w81Var2.E();
                        r91Var.S.setItemAnimator(r91Var.Y);
                        r91Var.X.s(i17 + 1, size);
                        r91Var.X.u(i17);
                        return;
                    }
                    return;
                }
                return;
            case 8:
                mc1 mc1Var = (mc1) this.b;
                boolean z11 = mc1Var.W0 != null;
                mc1Var.Z0(i10);
                if (z11 == (mc1Var.W0 == null)) {
                    mc1Var.M0();
                    mc1Var.l1();
                }
                mc1Var.n1();
                mc1Var.J0[1].a(mc1Var.W0 != null, true);
                mc1Var.P0.f1();
                int left = view.getLeft();
                int right = view.getRight();
                int dp = AndroidUtilities.dp(52.0f);
                int i18 = left - dp;
                if (i18 < 0) {
                    mc1Var.P0.v0(i18, 0, null);
                    return;
                }
                int i19 = right + dp;
                if (i19 > mc1Var.P0.getMeasuredWidth()) {
                    ua1 ua1Var = mc1Var.P0;
                    ua1Var.v0(i19 - ua1Var.getMeasuredWidth(), 0, null);
                    return;
                }
                return;
            case 9:
                id1 id1Var = (id1) this.b;
                int i20 = id1Var.H;
                HashSet hashSet = id1Var.w;
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
                    if (hashSet.isEmpty() && id1Var.v != -1 && id1Var.n.getVisibility() == 0) {
                        id1Var.v = -1;
                        id1Var.n.animate().setListener(null).cancel();
                        id1Var.n.animate().translationY(i20).setDuration(200L).setListener(new ed1(id1Var, i11)).start();
                        org.telegram.ui.Components.im0 im0Var = id1Var.s.getVisibility() == 0 ? id1Var.b : id1Var.a;
                        im0Var.d1(false);
                        int N0 = ((s4.b0) im0Var.getLayoutManager()).N0();
                        f7 = 12.0f;
                        if ((N0 == im0Var.getAdapter().h() - 1 || (N0 == im0Var.getAdapter().h() - 2 && im0Var == id1Var.a)) && (K = im0Var.K(N0)) != null) {
                            int bottom = K.a.getBottom();
                            if (N0 == id1Var.d.c - 2) {
                                bottom += AndroidUtilities.dp(12.0f);
                            }
                            if (im0Var.getMeasuredHeight() - bottom <= i20) {
                                im0Var.setTranslationY(-(im0Var.getMeasuredHeight() - bottom));
                                im0Var.animate().translationY(0.0f).setDuration(200L).start();
                            }
                        }
                        id1Var.a.setPadding(0, 0, 0, 0);
                        id1Var.b.setPadding(0, 0, 0, 0);
                    } else {
                        f7 = 12.0f;
                    }
                    if (!hashSet.isEmpty() && id1Var.n.getVisibility() == 8 && id1Var.v != 1) {
                        id1Var.v = 1;
                        id1Var.n.setVisibility(0);
                        id1Var.n.setTranslationY(i20);
                        id1Var.n.animate().setListener(null).cancel();
                        id1Var.n.animate().translationY(0.0f).setDuration(200L).setListener(new ed1(id1Var, i12)).start();
                        id1Var.a.setPadding(0, 0, 0, i20 - AndroidUtilities.dp(f7));
                        id1Var.b.setPadding(0, 0, 0, i20);
                    }
                    if (!hashSet.isEmpty()) {
                        id1Var.c.setText(LocaleController.formatString("LeaveChats", R.string.LeaveChats, LocaleController.formatPluralString("Chats", hashSet.size(), new Object[0])));
                    }
                    if (hashSet.isEmpty()) {
                        return;
                    }
                    org.telegram.ui.Components.im0 im0Var2 = id1Var.s.getVisibility() == 0 ? id1Var.b : id1Var.a;
                    int height = im0Var2.getHeight() - view.getBottom();
                    if (height < i20) {
                        im0Var2.v0(0, i20 - height, null);
                        return;
                    }
                    return;
                }
                return;
            case 10:
                te1.V((te1) this.b, view);
                return;
            case 11:
                te1 te1Var = ((pe1) this.b).t0;
                if (view instanceof org.telegram.ui.Cells.pa) {
                    og.d.m(te1Var, te1Var.a, ((org.telegram.ui.Cells.pa) view).getTopic(), 0);
                    return;
                } else {
                    if (view instanceof qe1) {
                        qe1 qe1Var = (qe1) view;
                        og.d.m(te1Var, te1Var.a, qe1Var.N, qe1Var.getMessageId());
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
                xh1 xh1Var = (xh1) this.b;
                xh1Var.getClass();
                String string = LocaleController.getString(R.string.BackgroundSearchColor);
                StringBuilder i21 = r.c.i(string, " ");
                String[] strArr = WallpapersListActivity.n0;
                i21.append(LocaleController.getString(strArr[i10], WallpapersListActivity.o0[i10]));
                SpannableString spannableString = new SpannableString(i21.toString());
                spannableString.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.B8, false)), string.length(), spannableString.length(), 33);
                WallpapersListActivity wallpapersListActivity = xh1Var.E;
                wallpapersListActivity.L.setSearchFieldCaption(spannableString);
                wallpapersListActivity.L.setSearchFieldHint(null);
                wallpapersListActivity.L.H("", true);
                xh1Var.n = strArr[i10];
                xh1Var.E("", true);
                return;
        }
    }
}
