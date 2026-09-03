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

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class p21 implements org.telegram.ui.Components.il0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ p21(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.ui.Components.il0
    public final void f(int i10, View view) {
        org.telegram.ui.Components.nq0 nq0Var;
        f2.m1 K;
        int i11 = this.a;
        int i12 = 0;
        int i13 = 1;
        Object obj = this.b;
        switch (i11) {
            case 0:
                t21 t21Var = (t21) obj;
                org.telegram.ui.Components.sl0 sl0Var = t21Var.y;
                org.telegram.ui.Components.kp kpVar = t21Var.b;
                if (kpVar.d.get(i10) != t21Var.H && t21Var.L == null) {
                    t21Var.N = false;
                    t21Var.H = (org.telegram.ui.Components.lp) kpVar.d.get(i10);
                    kpVar.E(i10);
                    t21Var.h.postDelayed(new org.telegram.ui.Components.im(t21Var, i10, 24), 100L);
                    while (i12 < sl0Var.getChildCount()) {
                        org.telegram.ui.Components.w11 w11Var = (org.telegram.ui.Components.w11) sl0Var.getChildAt(i12);
                        if (w11Var != view && (nq0Var = w11Var.G) != null) {
                            AndroidUtilities.cancelRunOnUIThread(nq0Var);
                            w11Var.G.run();
                        }
                        i12++;
                    }
                    if (!((org.telegram.ui.Components.lp) kpVar.d.get(i10)).a.a) {
                        ((org.telegram.ui.Components.w11) view).d();
                    }
                    e21 e21Var = t21Var.G;
                    if (e21Var != null) {
                        e21Var.a.d0(i10, t21Var.H.a, true);
                        break;
                    }
                }
                break;
            case 1:
                b31.U((b31) obj, view);
                break;
            case 2:
                t31.U((t31) obj, view, i10);
                break;
            case 3:
                h71 h71Var = (h71) obj;
                org.telegram.ui.Components.h51 G = h71Var.f0.G(i10 - 1);
                if (G != null) {
                    Object obj2 = G.G;
                    if ((obj2 instanceof TLRPC.User) || (obj2 instanceof TLRPC.Chat)) {
                        ((org.telegram.ui.Cells.h6) view).s(true, true);
                        h71Var.X = (TLObject) G.G;
                        h71Var.U(true);
                        h71Var.f0.N(true);
                        break;
                    }
                }
                break;
            case 4:
                ((k71) obj).Q(i10, view);
                break;
            case 5:
                SessionsActivity.U((SessionsActivity) obj, i10);
                break;
            case 6:
                na1 na1Var = (na1) obj;
                ArrayList arrayList = na1Var.K;
                ArrayList arrayList2 = na1Var.L;
                s91 s91Var = na1Var.U;
                int i14 = s91Var.F;
                if (i10 >= i14 && i10 <= s91Var.G) {
                    ka1 ka1Var = (ka1) na1Var.s0.get(i10 - i14);
                    bj0 bj0Var = new bj0(ka1Var.b, true, na1Var.b);
                    bj0Var.b0 = ka1Var;
                    na1Var.presentFragment(bj0Var);
                    break;
                } else {
                    int i15 = s91Var.R;
                    if (i10 >= i15 && i10 <= s91Var.S) {
                        ((ga1) na1Var.N.get(i10 - i15)).b(na1Var);
                        break;
                    } else {
                        int i16 = s91Var.O;
                        if (i10 >= i16 && i10 <= s91Var.P) {
                            ((ga1) arrayList2.get(i10 - i16)).b(na1Var);
                            break;
                        } else {
                            int i17 = s91Var.U;
                            if (i10 >= i17 && i10 <= s91Var.V) {
                                ((ga1) na1Var.M.get(i10 - i17)).b(na1Var);
                                break;
                            } else if (i10 == s91Var.W) {
                                int size = arrayList.size() - arrayList2.size();
                                int i18 = na1Var.U.W;
                                arrayList2.clear();
                                arrayList2.addAll(arrayList);
                                s91 s91Var2 = na1Var.U;
                                if (s91Var2 != null) {
                                    s91Var2.E();
                                    na1Var.P.setItemAnimator(na1Var.V);
                                    na1Var.U.s(i18 + 1, size);
                                    na1Var.U.u(i18);
                                    break;
                                }
                            }
                        }
                    }
                }
                break;
            case 7:
                jd1 jd1Var = (jd1) obj;
                boolean z4 = jd1Var.T0 != null;
                jd1Var.Z0(i10);
                if (z4 == (jd1Var.T0 == null)) {
                    jd1Var.M0();
                    jd1Var.l1();
                }
                jd1Var.n1();
                jd1Var.G0[1].a(jd1Var.T0 != null, true);
                jd1Var.M0.e1();
                int left = view.getLeft();
                int right = view.getRight();
                int dp = AndroidUtilities.dp(52.0f);
                int i19 = left - dp;
                if (i19 >= 0) {
                    int i20 = right + dp;
                    if (i20 > jd1Var.M0.getMeasuredWidth()) {
                        qb1 qb1Var = jd1Var.M0;
                        qb1Var.v0(i20 - qb1Var.getMeasuredWidth(), 0, null);
                        break;
                    }
                } else {
                    jd1Var.M0.v0(i19, 0, null);
                    break;
                }
                break;
            case 8:
                he1 he1Var = (he1) obj;
                int i21 = he1Var.E;
                HashSet hashSet = he1Var.w;
                if (view instanceof org.telegram.ui.Cells.g4) {
                    org.telegram.ui.Cells.g4 g4Var = (org.telegram.ui.Cells.g4) view;
                    TLRPC.Chat chat = (TLRPC.Chat) g4Var.getObject();
                    if (hashSet.contains(Long.valueOf(chat.id))) {
                        hashSet.remove(Long.valueOf(chat.id));
                        g4Var.c(false, true);
                    } else {
                        hashSet.add(Long.valueOf(chat.id));
                        g4Var.c(true, true);
                    }
                    if (hashSet.isEmpty() && he1Var.v != -1 && he1Var.n.getVisibility() == 0) {
                        he1Var.v = -1;
                        he1Var.n.animate().setListener(null).cancel();
                        he1Var.n.animate().translationY(i21).setDuration(200L).setListener(new de1(he1Var, i12)).start();
                        org.telegram.ui.Components.sl0 sl0Var2 = he1Var.s.getVisibility() == 0 ? he1Var.b : he1Var.a;
                        sl0Var2.c1(false);
                        int N0 = ((f2.j0) sl0Var2.getLayoutManager()).N0();
                        if ((N0 == sl0Var2.getAdapter().h() - 1 || (N0 == sl0Var2.getAdapter().h() - 2 && sl0Var2 == he1Var.a)) && (K = sl0Var2.K(N0)) != null) {
                            int bottom = K.a.getBottom();
                            if (N0 == he1Var.d.c - 2) {
                                bottom += AndroidUtilities.dp(12.0f);
                            }
                            if (sl0Var2.getMeasuredHeight() - bottom <= i21) {
                                sl0Var2.setTranslationY(-(sl0Var2.getMeasuredHeight() - bottom));
                                sl0Var2.animate().translationY(0.0f).setDuration(200L).start();
                            }
                        }
                        he1Var.a.setPadding(0, 0, 0, 0);
                        he1Var.b.setPadding(0, 0, 0, 0);
                    }
                    if (!hashSet.isEmpty() && he1Var.n.getVisibility() == 8 && he1Var.v != 1) {
                        he1Var.v = 1;
                        he1Var.n.setVisibility(0);
                        he1Var.n.setTranslationY(i21);
                        he1Var.n.animate().setListener(null).cancel();
                        he1Var.n.animate().translationY(0.0f).setDuration(200L).setListener(new de1(he1Var, i13)).start();
                        he1Var.a.setPadding(0, 0, 0, i21 - AndroidUtilities.dp(12.0f));
                        he1Var.b.setPadding(0, 0, 0, i21);
                    }
                    if (!hashSet.isEmpty()) {
                        he1Var.c.setText(LocaleController.formatString("LeaveChats", R.string.LeaveChats, LocaleController.formatPluralString("Chats", hashSet.size(), new Object[0])));
                    }
                    if (!hashSet.isEmpty()) {
                        org.telegram.ui.Components.sl0 sl0Var3 = he1Var.s.getVisibility() == 0 ? he1Var.b : he1Var.a;
                        int height = sl0Var3.getHeight() - view.getBottom();
                        if (height < i21) {
                            sl0Var3.v0(0, i21 - height, null);
                            break;
                        }
                    }
                }
                break;
            case 9:
                sf1.V((sf1) obj, view);
                break;
            case 10:
                sf1 sf1Var = ((of1) obj).q0;
                if (!(view instanceof org.telegram.ui.Cells.oa)) {
                    if (view instanceof pf1) {
                        pf1 pf1Var = (pf1) view;
                        bg.e.m(sf1Var, sf1Var.a, pf1Var.K, pf1Var.getMessageId());
                        break;
                    }
                } else {
                    bg.e.m(sf1Var, sf1Var.a, ((org.telegram.ui.Cells.oa) view).getTopic(), 0);
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
                yi1 yi1Var = (yi1) obj;
                yi1Var.getClass();
                String string = LocaleController.getString(R.string.BackgroundSearchColor);
                StringBuilder f10 = w.c.f(string, " ");
                String[] strArr = WallpapersListActivity.k0;
                f10.append(LocaleController.getString(strArr[i10], WallpapersListActivity.l0[i10]));
                SpannableString spannableString = new SpannableString(f10.toString());
                spannableString.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.B8, false)), string.length(), spannableString.length(), 33);
                WallpapersListActivity wallpapersListActivity = yi1Var.B;
                wallpapersListActivity.I.setSearchFieldCaption(spannableString);
                wallpapersListActivity.I.setSearchFieldHint(null);
                wallpapersListActivity.I.H("", true);
                yi1Var.n = strArr[i10];
                yi1Var.E("", true);
                break;
        }
    }
}
