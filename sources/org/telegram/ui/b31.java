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

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final /* synthetic */ class b31 implements org.telegram.ui.Components.zk0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ b31(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.ui.Components.zk0
    public final void a(int i10, View view) {
        org.telegram.ui.Components.jq0 jq0Var;
        s4.c1 K;
        int i11 = this.a;
        int i12 = 0;
        int i13 = 1;
        Object obj = this.b;
        switch (i11) {
            case 0:
                f31 f31Var = (f31) obj;
                org.telegram.ui.Components.ll0 ll0Var = f31Var.y;
                org.telegram.ui.Components.jp jpVar = f31Var.b;
                if (jpVar.d.get(i10) != f31Var.K && f31Var.O == null) {
                    f31Var.Q = false;
                    f31Var.K = (org.telegram.ui.Components.kp) jpVar.d.get(i10);
                    jpVar.E(i10);
                    f31Var.h.postDelayed(new org.telegram.ui.Components.m8(f31Var, i10, 27), 100L);
                    while (i12 < ll0Var.getChildCount()) {
                        org.telegram.ui.Components.t11 t11Var = (org.telegram.ui.Components.t11) ll0Var.getChildAt(i12);
                        if (t11Var != view && (jq0Var = t11Var.J) != null) {
                            AndroidUtilities.cancelRunOnUIThread(jq0Var);
                            t11Var.J.run();
                        }
                        i12++;
                    }
                    if (!((org.telegram.ui.Components.kp) jpVar.d.get(i10)).a.a) {
                        ((org.telegram.ui.Components.t11) view).d();
                    }
                    r21 r21Var = f31Var.J;
                    if (r21Var != null) {
                        r21Var.a.d0(i10, f31Var.K.a, true);
                        break;
                    }
                }
                break;
            case 1:
                n31.U((n31) obj, view);
                break;
            case 2:
                h41.U((h41) obj, view, i10);
                break;
            case 3:
                t71 t71Var = (t71) obj;
                org.telegram.ui.Components.h51 G = t71Var.i0.G(i10 - 1);
                if (G != null) {
                    Object obj2 = G.G;
                    if ((obj2 instanceof TLRPC.User) || (obj2 instanceof TLRPC.Chat)) {
                        ((org.telegram.ui.Cells.h6) view).s(true, true);
                        t71Var.a0 = (TLObject) G.G;
                        t71Var.U(true);
                        t71Var.i0.N(true);
                        break;
                    }
                }
                break;
            case 4:
                ((w71) obj).Q(i10, view);
                break;
            case 5:
                SessionsActivity.U((SessionsActivity) obj, i10);
                break;
            case 6:
                bb1 bb1Var = (bb1) obj;
                ArrayList arrayList = bb1Var.N;
                ArrayList arrayList2 = bb1Var.O;
                ga1 ga1Var = bb1Var.X;
                int i14 = ga1Var.I;
                if (i10 >= i14 && i10 <= ga1Var.J) {
                    ya1 ya1Var = (ya1) bb1Var.v0.get(i10 - i14);
                    lj0 lj0Var = new lj0(ya1Var.b, true, bb1Var.b);
                    lj0Var.e0 = ya1Var;
                    bb1Var.presentFragment(lj0Var);
                    break;
                } else {
                    int i15 = ga1Var.U;
                    if (i10 >= i15 && i10 <= ga1Var.V) {
                        ((ua1) bb1Var.Q.get(i10 - i15)).b(bb1Var);
                        break;
                    } else {
                        int i16 = ga1Var.R;
                        if (i10 >= i16 && i10 <= ga1Var.S) {
                            ((ua1) arrayList2.get(i10 - i16)).b(bb1Var);
                            break;
                        } else {
                            int i17 = ga1Var.X;
                            if (i10 >= i17 && i10 <= ga1Var.Y) {
                                ((ua1) bb1Var.P.get(i10 - i17)).b(bb1Var);
                                break;
                            } else if (i10 == ga1Var.Z) {
                                int size = arrayList.size() - arrayList2.size();
                                int i18 = bb1Var.X.Z;
                                arrayList2.clear();
                                arrayList2.addAll(arrayList);
                                ga1 ga1Var2 = bb1Var.X;
                                if (ga1Var2 != null) {
                                    ga1Var2.E();
                                    bb1Var.S.setItemAnimator(bb1Var.Y);
                                    bb1Var.X.s(i18 + 1, size);
                                    bb1Var.X.u(i18);
                                    break;
                                }
                            }
                        }
                    }
                }
                break;
            case 7:
                wd1 wd1Var = (wd1) obj;
                boolean z10 = wd1Var.W0 != null;
                wd1Var.Z0(i10);
                if (z10 == (wd1Var.W0 == null)) {
                    wd1Var.M0();
                    wd1Var.l1();
                }
                wd1Var.n1();
                wd1Var.J0[1].a(wd1Var.W0 != null, true);
                wd1Var.P0.e1();
                int left = view.getLeft();
                int right = view.getRight();
                int dp = AndroidUtilities.dp(52.0f);
                int i19 = left - dp;
                if (i19 >= 0) {
                    int i20 = right + dp;
                    if (i20 > wd1Var.P0.getMeasuredWidth()) {
                        ec1 ec1Var = wd1Var.P0;
                        ec1Var.v0(i20 - ec1Var.getMeasuredWidth(), 0, null);
                        break;
                    }
                } else {
                    wd1Var.P0.v0(i19, 0, null);
                    break;
                }
                break;
            case 8:
                te1 te1Var = (te1) obj;
                int i21 = te1Var.H;
                HashSet hashSet = te1Var.w;
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
                    if (hashSet.isEmpty() && te1Var.v != -1 && te1Var.n.getVisibility() == 0) {
                        te1Var.v = -1;
                        te1Var.n.animate().setListener(null).cancel();
                        te1Var.n.animate().translationY(i21).setDuration(200L).setListener(new pe1(te1Var, i12)).start();
                        org.telegram.ui.Components.ll0 ll0Var2 = te1Var.s.getVisibility() == 0 ? te1Var.b : te1Var.a;
                        ll0Var2.c1(false);
                        int N0 = ((s4.c0) ll0Var2.getLayoutManager()).N0();
                        if ((N0 == ll0Var2.getAdapter().h() - 1 || (N0 == ll0Var2.getAdapter().h() - 2 && ll0Var2 == te1Var.a)) && (K = ll0Var2.K(N0)) != null) {
                            int bottom = K.a.getBottom();
                            if (N0 == te1Var.d.c - 2) {
                                bottom += AndroidUtilities.dp(12.0f);
                            }
                            if (ll0Var2.getMeasuredHeight() - bottom <= i21) {
                                ll0Var2.setTranslationY(-(ll0Var2.getMeasuredHeight() - bottom));
                                ll0Var2.animate().translationY(0.0f).setDuration(200L).start();
                            }
                        }
                        te1Var.a.setPadding(0, 0, 0, 0);
                        te1Var.b.setPadding(0, 0, 0, 0);
                    }
                    if (!hashSet.isEmpty() && te1Var.n.getVisibility() == 8 && te1Var.v != 1) {
                        te1Var.v = 1;
                        te1Var.n.setVisibility(0);
                        te1Var.n.setTranslationY(i21);
                        te1Var.n.animate().setListener(null).cancel();
                        te1Var.n.animate().translationY(0.0f).setDuration(200L).setListener(new pe1(te1Var, i13)).start();
                        te1Var.a.setPadding(0, 0, 0, i21 - AndroidUtilities.dp(12.0f));
                        te1Var.b.setPadding(0, 0, 0, i21);
                    }
                    if (!hashSet.isEmpty()) {
                        te1Var.c.setText(LocaleController.formatString("LeaveChats", R.string.LeaveChats, LocaleController.formatPluralString("Chats", hashSet.size(), new Object[0])));
                    }
                    if (!hashSet.isEmpty()) {
                        org.telegram.ui.Components.ll0 ll0Var3 = te1Var.s.getVisibility() == 0 ? te1Var.b : te1Var.a;
                        int height = ll0Var3.getHeight() - view.getBottom();
                        if (height < i21) {
                            ll0Var3.v0(0, i21 - height, null);
                            break;
                        }
                    }
                }
                break;
            case 9:
                eg1.V((eg1) obj, view);
                break;
            case 10:
                eg1 eg1Var = ((ag1) obj).t0;
                if (!(view instanceof org.telegram.ui.Cells.sa)) {
                    if (view instanceof bg1) {
                        bg1 bg1Var = (bg1) view;
                        og.d.m(eg1Var, eg1Var.a, bg1Var.N, bg1Var.getMessageId());
                        break;
                    }
                } else {
                    og.d.m(eg1Var, eg1Var.a, ((org.telegram.ui.Cells.sa) view).getTopic(), 0);
                    break;
                }
                break;
            case 11:
                TwoStepVerificationActivity.c0((TwoStepVerificationActivity) obj, i10);
                break;
            case 12:
                WallpapersListActivity.V((WallpapersListActivity) obj, i10);
                break;
            default:
                jj1 jj1Var = (jj1) obj;
                jj1Var.getClass();
                String string = LocaleController.getString(R.string.BackgroundSearchColor);
                StringBuilder g10 = w.f.g(string, " ");
                String[] strArr = WallpapersListActivity.n0;
                g10.append(LocaleController.getString(strArr[i10], WallpapersListActivity.o0[i10]));
                SpannableString spannableString = new SpannableString(g10.toString());
                spannableString.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.B8, false)), string.length(), spannableString.length(), 33);
                WallpapersListActivity wallpapersListActivity = jj1Var.E;
                wallpapersListActivity.L.setSearchFieldCaption(spannableString);
                wallpapersListActivity.L.setSearchFieldHint(null);
                wallpapersListActivity.L.H("", true);
                jj1Var.n = strArr[i10];
                jj1Var.E("", true);
                break;
        }
    }
}
