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

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
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
        f2.l1 K;
        int i11 = this.a;
        int i12 = 0;
        int i13 = 1;
        Object obj = this.b;
        switch (i11) {
            case 0:
                u21.U((u21) obj, view);
                break;
            case 1:
                n31.U((n31) obj, view, i10);
                break;
            case 2:
                b71 b71Var = (b71) obj;
                org.telegram.ui.Components.i51 G = b71Var.f0.G(i10 - 1);
                if (G != null) {
                    Object obj2 = G.G;
                    if ((obj2 instanceof TLRPC.User) || (obj2 instanceof TLRPC.Chat)) {
                        ((org.telegram.ui.Cells.h6) view).s(true, true);
                        b71Var.X = (TLObject) G.G;
                        b71Var.U(true);
                        b71Var.f0.N(true);
                        break;
                    }
                }
                break;
            case 3:
                ((e71) obj).Q(i10, view);
                break;
            case 4:
                SessionsActivity.U((SessionsActivity) obj, i10);
                break;
            case 5:
                ga1 ga1Var = (ga1) obj;
                ArrayList arrayList = ga1Var.K;
                ArrayList arrayList2 = ga1Var.L;
                l91 l91Var = ga1Var.U;
                int i14 = l91Var.F;
                if (i10 >= i14 && i10 <= l91Var.G) {
                    da1 da1Var = (da1) ga1Var.s0.get(i10 - i14);
                    aj0 aj0Var = new aj0(da1Var.b, true, ga1Var.b);
                    aj0Var.b0 = da1Var;
                    ga1Var.presentFragment(aj0Var);
                    break;
                } else {
                    int i15 = l91Var.R;
                    if (i10 >= i15 && i10 <= l91Var.S) {
                        ((z91) ga1Var.N.get(i10 - i15)).b(ga1Var);
                        break;
                    } else {
                        int i16 = l91Var.O;
                        if (i10 >= i16 && i10 <= l91Var.P) {
                            ((z91) arrayList2.get(i10 - i16)).b(ga1Var);
                            break;
                        } else {
                            int i17 = l91Var.U;
                            if (i10 >= i17 && i10 <= l91Var.V) {
                                ((z91) ga1Var.M.get(i10 - i17)).b(ga1Var);
                                break;
                            } else if (i10 == l91Var.W) {
                                int size = arrayList.size() - arrayList2.size();
                                int i18 = ga1Var.U.W;
                                arrayList2.clear();
                                arrayList2.addAll(arrayList);
                                l91 l91Var2 = ga1Var.U;
                                if (l91Var2 != null) {
                                    l91Var2.E();
                                    ga1Var.P.setItemAnimator(ga1Var.V);
                                    ga1Var.U.s(i18 + 1, size);
                                    ga1Var.U.u(i18);
                                    break;
                                }
                            }
                        }
                    }
                }
                break;
            case 6:
                cd1 cd1Var = (cd1) obj;
                boolean z4 = cd1Var.T0 != null;
                cd1Var.Z0(i10);
                if (z4 == (cd1Var.T0 == null)) {
                    cd1Var.M0();
                    cd1Var.l1();
                }
                cd1Var.n1();
                cd1Var.G0[1].a(cd1Var.T0 != null, true);
                cd1Var.M0.f1();
                int left = view.getLeft();
                int right = view.getRight();
                int dp = AndroidUtilities.dp(52.0f);
                int i19 = left - dp;
                if (i19 >= 0) {
                    int i20 = right + dp;
                    if (i20 > cd1Var.M0.getMeasuredWidth()) {
                        jb1 jb1Var = cd1Var.M0;
                        jb1Var.v0(i20 - jb1Var.getMeasuredWidth(), 0, null);
                        break;
                    }
                } else {
                    cd1Var.M0.v0(i19, 0, null);
                    break;
                }
                break;
            case 7:
                yd1 yd1Var = (yd1) obj;
                int i21 = yd1Var.E;
                HashSet hashSet = yd1Var.w;
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
                    if (hashSet.isEmpty() && yd1Var.v != -1 && yd1Var.n.getVisibility() == 0) {
                        yd1Var.v = -1;
                        yd1Var.n.animate().setListener(null).cancel();
                        yd1Var.n.animate().translationY(i21).setDuration(200L).setListener(new ud1(yd1Var, i12)).start();
                        org.telegram.ui.Components.sl0 sl0Var = yd1Var.s.getVisibility() == 0 ? yd1Var.b : yd1Var.a;
                        sl0Var.d1(false);
                        int N0 = ((f2.i0) sl0Var.getLayoutManager()).N0();
                        if ((N0 == sl0Var.getAdapter().h() - 1 || (N0 == sl0Var.getAdapter().h() - 2 && sl0Var == yd1Var.a)) && (K = sl0Var.K(N0)) != null) {
                            int bottom = K.a.getBottom();
                            if (N0 == yd1Var.d.c - 2) {
                                bottom += AndroidUtilities.dp(12.0f);
                            }
                            if (sl0Var.getMeasuredHeight() - bottom <= i21) {
                                sl0Var.setTranslationY(-(sl0Var.getMeasuredHeight() - bottom));
                                sl0Var.animate().translationY(0.0f).setDuration(200L).start();
                            }
                        }
                        yd1Var.a.setPadding(0, 0, 0, 0);
                        yd1Var.b.setPadding(0, 0, 0, 0);
                    }
                    if (!hashSet.isEmpty() && yd1Var.n.getVisibility() == 8 && yd1Var.v != 1) {
                        yd1Var.v = 1;
                        yd1Var.n.setVisibility(0);
                        yd1Var.n.setTranslationY(i21);
                        yd1Var.n.animate().setListener(null).cancel();
                        yd1Var.n.animate().translationY(0.0f).setDuration(200L).setListener(new ud1(yd1Var, i13)).start();
                        yd1Var.a.setPadding(0, 0, 0, i21 - AndroidUtilities.dp(12.0f));
                        yd1Var.b.setPadding(0, 0, 0, i21);
                    }
                    if (!hashSet.isEmpty()) {
                        yd1Var.c.setText(LocaleController.formatString("LeaveChats", R.string.LeaveChats, LocaleController.formatPluralString("Chats", hashSet.size(), new Object[0])));
                    }
                    if (!hashSet.isEmpty()) {
                        org.telegram.ui.Components.sl0 sl0Var2 = yd1Var.s.getVisibility() == 0 ? yd1Var.b : yd1Var.a;
                        int height = sl0Var2.getHeight() - view.getBottom();
                        if (height < i21) {
                            sl0Var2.v0(0, i21 - height, null);
                            break;
                        }
                    }
                }
                break;
            case 8:
                kf1.V((kf1) obj, view);
                break;
            case 9:
                kf1 kf1Var = ((gf1) obj).q0;
                if (!(view instanceof org.telegram.ui.Cells.oa)) {
                    if (view instanceof hf1) {
                        hf1 hf1Var = (hf1) view;
                        ag.f.m(kf1Var, kf1Var.a, hf1Var.K, hf1Var.getMessageId());
                        break;
                    }
                } else {
                    ag.f.m(kf1Var, kf1Var.a, ((org.telegram.ui.Cells.oa) view).getTopic(), 0);
                    break;
                }
                break;
            case 10:
                TwoStepVerificationActivity.c0((TwoStepVerificationActivity) obj, i10);
                break;
            case 11:
                WallpapersListActivity.V((WallpapersListActivity) obj, i10);
                break;
            default:
                pi1 pi1Var = (pi1) obj;
                pi1Var.getClass();
                String string = LocaleController.getString(R.string.BackgroundSearchColor);
                StringBuilder f10 = vh.v2.f(string, " ");
                String[] strArr = WallpapersListActivity.k0;
                f10.append(LocaleController.getString(strArr[i10], WallpapersListActivity.l0[i10]));
                SpannableString spannableString = new SpannableString(f10.toString());
                spannableString.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.B8, false)), string.length(), spannableString.length(), 33);
                WallpapersListActivity wallpapersListActivity = pi1Var.B;
                wallpapersListActivity.I.setSearchFieldCaption(spannableString);
                wallpapersListActivity.I.setSearchFieldHint(null);
                wallpapersListActivity.I.H("", true);
                pi1Var.n = strArr[i10];
                pi1Var.E("", true);
                break;
        }
    }
}
