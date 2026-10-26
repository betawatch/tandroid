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

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class m11 implements org.telegram.ui.Components.zl0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ m11(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.ui.Components.zl0
    public final void c(int i10, View view) {
        float f7;
        s4.e1 K;
        int i11 = 0;
        int i12 = 1;
        switch (this.a) {
            case 0:
                ProxyListActivity.V((ProxyListActivity) this.b, view, i10);
                return;
            case 1:
                g21.V((g21) this.b, view);
                return;
            case 2:
                y21.V((y21) this.b, view, i10);
                return;
            case 3:
                g31 g31Var = (g31) this.b;
                wi.a aVar = wi.e.d;
                if (i10 == 1) {
                    aVar.a();
                    boolean z10 = !aVar.d;
                    synchronized (aVar) {
                        aVar.d = z10;
                        aVar.c = true;
                        aVar.b = true;
                        wi.d.a.edit().putBoolean("round_video_camera2_enabled", z10).apply();
                    }
                    g31Var.b.l();
                    return;
                }
                aVar.a();
                if (!aVar.d) {
                    return;
                }
                if (i10 == 2) {
                    g31Var.W(R.string.RoundVideoOutputResolution, new CharSequence[]{"480p", "360p"}, new org.telegram.ui.Components.voip.c1(22));
                    return;
                }
                if (i10 == 3) {
                    g31Var.W(R.string.RoundVideoCameraResolution, new CharSequence[]{LocaleController.getString(R.string.RoundVideoCameraResolutionHigh), LocaleController.getString(R.string.RoundVideoCameraResolutionMedium), LocaleController.getString(R.string.RoundVideoCameraResolutionLow)}, new org.telegram.ui.Components.voip.c1(23));
                    return;
                }
                if (i10 == 4) {
                    g31Var.W(R.string.RoundVideoFrameRate, new CharSequence[]{"30 FPS", "60 FPS"}, new org.telegram.ui.Components.voip.c1(24));
                    return;
                }
                if (i10 != 5) {
                    if (i10 == 8) {
                        wi.a aVar2 = wi.e.i;
                        aVar2.a();
                        aVar2.b(!aVar2.d);
                        g31Var.b.m(i10);
                        return;
                    }
                    return;
                }
                CharSequence[] charSequenceArr = new CharSequence[4];
                while (true) {
                    int[] iArr = g31.c;
                    if (i11 >= 3) {
                        g31Var.W(R.string.RoundVideoBitrate, charSequenceArr, new org.telegram.ui.Components.voip.c1(25));
                        return;
                    } else {
                        charSequenceArr[i11] = g31.V(iArr[i11]);
                        i11++;
                    }
                }
            case 4:
                m61 m61Var = (m61) this.b;
                org.telegram.ui.Components.t61 G = m61Var.i0.G(i10 - 1);
                if (G == null) {
                    return;
                }
                Object obj = G.G;
                if ((obj instanceof TLRPC.User) || (obj instanceof TLRPC.Chat)) {
                    ((org.telegram.ui.Cells.m6) view).r(true, true);
                    m61Var.a0 = (TLObject) G.G;
                    m61Var.U(true);
                    m61Var.i0.O(true);
                    return;
                }
                return;
            case 5:
                ((p61) this.b).Q(i10, view);
                return;
            case 6:
                SessionsActivity.V((SessionsActivity) this.b, i10);
                return;
            case 7:
                w91 w91Var = (w91) this.b;
                ArrayList arrayList = w91Var.N;
                ArrayList arrayList2 = w91Var.O;
                b91 b91Var = w91Var.W;
                int i13 = b91Var.I;
                if (i10 >= i13 && i10 <= b91Var.J) {
                    t91 t91Var = (t91) w91Var.y0.get(i10 - i13);
                    vi0 vi0Var = new vi0(t91Var.b, true, w91Var.b);
                    vi0Var.e0 = t91Var;
                    w91Var.presentFragment(vi0Var);
                    return;
                }
                int i14 = b91Var.U;
                if (i10 >= i14 && i10 <= b91Var.V) {
                    ((p91) w91Var.Q.get(i10 - i14)).b(w91Var);
                    return;
                }
                int i15 = b91Var.R;
                if (i10 >= i15 && i10 <= b91Var.S) {
                    ((p91) arrayList2.get(i10 - i15)).b(w91Var);
                    return;
                }
                int i16 = b91Var.X;
                if (i10 >= i16 && i10 <= b91Var.Y) {
                    ((p91) w91Var.P.get(i10 - i16)).b(w91Var);
                    return;
                }
                if (i10 == b91Var.Z) {
                    int size = arrayList.size() - arrayList2.size();
                    int i17 = w91Var.W.Z;
                    arrayList2.clear();
                    arrayList2.addAll(arrayList);
                    b91 b91Var2 = w91Var.W;
                    if (b91Var2 != null) {
                        b91Var2.E();
                        w91Var.S.setItemAnimator(w91Var.X);
                        w91Var.W.s(i17 + 1, size);
                        w91Var.W.u(i17);
                        return;
                    }
                    return;
                }
                return;
            case 8:
                tc1 tc1Var = (tc1) this.b;
                boolean z11 = tc1Var.X0 != null;
                tc1Var.a1(i10);
                if (z11 == (tc1Var.X0 == null)) {
                    tc1Var.M0();
                    tc1Var.m1();
                }
                tc1Var.o1();
                tc1Var.K0[1].a(tc1Var.X0 != null, true);
                tc1Var.Q0.g1();
                int left = view.getLeft();
                int right = view.getRight();
                int dp = AndroidUtilities.dp(52.0f);
                int i18 = left - dp;
                if (i18 < 0) {
                    tc1Var.Q0.w0(i18, 0, null);
                    return;
                }
                int i19 = right + dp;
                if (i19 > tc1Var.Q0.getMeasuredWidth()) {
                    za1 za1Var = tc1Var.Q0;
                    za1Var.w0(i19 - za1Var.getMeasuredWidth(), 0, null);
                    return;
                }
                return;
            case 9:
                pd1 pd1Var = (pd1) this.b;
                int i20 = pd1Var.H;
                HashSet hashSet = pd1Var.w;
                if (view instanceof org.telegram.ui.Cells.k4) {
                    org.telegram.ui.Cells.k4 k4Var = (org.telegram.ui.Cells.k4) view;
                    TLRPC.Chat chat = (TLRPC.Chat) k4Var.getObject();
                    if (hashSet.contains(Long.valueOf(chat.id))) {
                        hashSet.remove(Long.valueOf(chat.id));
                        k4Var.c(false, true);
                    } else {
                        hashSet.add(Long.valueOf(chat.id));
                        k4Var.c(true, true);
                    }
                    if (hashSet.isEmpty() && pd1Var.v != -1 && pd1Var.n.getVisibility() == 0) {
                        pd1Var.v = -1;
                        pd1Var.n.animate().setListener(null).cancel();
                        pd1Var.n.animate().translationY(i20).setDuration(200L).setListener(new ld1(pd1Var, i11)).start();
                        org.telegram.ui.Components.mm0 mm0Var = pd1Var.s.getVisibility() == 0 ? pd1Var.b : pd1Var.a;
                        mm0Var.d1(false);
                        int N0 = ((s4.c0) mm0Var.getLayoutManager()).N0();
                        f7 = 12.0f;
                        if ((N0 == mm0Var.getAdapter().h() - 1 || (N0 == mm0Var.getAdapter().h() - 2 && mm0Var == pd1Var.a)) && (K = mm0Var.K(N0)) != null) {
                            int bottom = K.a.getBottom();
                            if (N0 == pd1Var.d.c - 2) {
                                bottom += AndroidUtilities.dp(12.0f);
                            }
                            if (mm0Var.getMeasuredHeight() - bottom <= i20) {
                                mm0Var.setTranslationY(-(mm0Var.getMeasuredHeight() - bottom));
                                mm0Var.animate().translationY(0.0f).setDuration(200L).start();
                            }
                        }
                        pd1Var.a.setPadding(0, 0, 0, 0);
                        pd1Var.b.setPadding(0, 0, 0, 0);
                    } else {
                        f7 = 12.0f;
                    }
                    if (!hashSet.isEmpty() && pd1Var.n.getVisibility() == 8 && pd1Var.v != 1) {
                        pd1Var.v = 1;
                        pd1Var.n.setVisibility(0);
                        pd1Var.n.setTranslationY(i20);
                        pd1Var.n.animate().setListener(null).cancel();
                        pd1Var.n.animate().translationY(0.0f).setDuration(200L).setListener(new ld1(pd1Var, i12)).start();
                        pd1Var.a.setPadding(0, 0, 0, i20 - AndroidUtilities.dp(f7));
                        pd1Var.b.setPadding(0, 0, 0, i20);
                    }
                    if (!hashSet.isEmpty()) {
                        pd1Var.c.setText(LocaleController.formatString("LeaveChats", R.string.LeaveChats, LocaleController.formatPluralString("Chats", hashSet.size(), new Object[0])));
                    }
                    if (hashSet.isEmpty()) {
                        return;
                    }
                    org.telegram.ui.Components.mm0 mm0Var2 = pd1Var.s.getVisibility() == 0 ? pd1Var.b : pd1Var.a;
                    int height = mm0Var2.getHeight() - view.getBottom();
                    if (height < i20) {
                        mm0Var2.w0(0, i20 - height, null);
                        return;
                    }
                    return;
                }
                return;
            case 10:
                af1.W((af1) this.b, view);
                return;
            case 11:
                af1 af1Var = ((we1) this.b).v0;
                if (view instanceof org.telegram.ui.Cells.ua) {
                    pg.d.m(af1Var, af1Var.a, ((org.telegram.ui.Cells.ua) view).getTopic(), 0);
                    return;
                } else {
                    if (view instanceof xe1) {
                        xe1 xe1Var = (xe1) view;
                        pg.d.m(af1Var, af1Var.a, xe1Var.N, xe1Var.getMessageId());
                        return;
                    }
                    return;
                }
            case 12:
                TwoStepVerificationActivity.d0((TwoStepVerificationActivity) this.b, i10);
                return;
            case 13:
                WallpapersListActivity.V((WallpapersListActivity) this.b, i10);
                return;
            default:
                ei1 ei1Var = (ei1) this.b;
                String string = LocaleController.getString(R.string.BackgroundSearchColor);
                StringBuilder l4 = org.telegram.ui.Components.b10.l(string, " ");
                String[] strArr = WallpapersListActivity.j0;
                l4.append(LocaleController.getString(strArr[i10], WallpapersListActivity.k0[i10]));
                SpannableString spannableString = new SpannableString(l4.toString());
                spannableString.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.B8, false)), string.length(), spannableString.length(), 33);
                WallpapersListActivity wallpapersListActivity = ei1Var.E;
                wallpapersListActivity.J.setSearchFieldCaption(spannableString);
                wallpapersListActivity.J.setSearchFieldHint(null);
                wallpapersListActivity.J.P("", true);
                ei1Var.n = strArr[i10];
                ei1Var.E("", true);
                return;
        }
    }
}
