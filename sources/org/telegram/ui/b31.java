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

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class b31 implements org.telegram.ui.Components.al0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ b31(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.ui.Components.al0
    public final void d(int i10, View view) {
        org.telegram.ui.Components.kq0 kq0Var;
        s4.c1 L;
        int i11 = this.a;
        int i12 = 0;
        int i13 = 1;
        Object obj = this.b;
        switch (i11) {
            case 0:
                f31 f31Var = (f31) obj;
                org.telegram.ui.Components.ml0 ml0Var = f31Var.y;
                org.telegram.ui.Components.kp kpVar = f31Var.b;
                if (kpVar.d.get(i10) != f31Var.K && f31Var.O == null) {
                    f31Var.Q = false;
                    f31Var.K = (org.telegram.ui.Components.lp) kpVar.d.get(i10);
                    kpVar.E(i10);
                    f31Var.h.postDelayed(new org.telegram.ui.Components.id(f31Var, i10, 26), 100L);
                    while (i12 < ml0Var.getChildCount()) {
                        org.telegram.ui.Components.v11 v11Var = (org.telegram.ui.Components.v11) ml0Var.getChildAt(i12);
                        if (v11Var != view && (kq0Var = v11Var.J) != null) {
                            AndroidUtilities.cancelRunOnUIThread(kq0Var);
                            v11Var.J.run();
                        }
                        i12++;
                    }
                    if (!((org.telegram.ui.Components.lp) kpVar.d.get(i10)).a.a) {
                        ((org.telegram.ui.Components.v11) view).d();
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
                g41.U((g41) obj, view, i10);
                break;
            case 3:
                s71 s71Var = (s71) obj;
                org.telegram.ui.Components.j51 G = s71Var.i0.G(i10 - 1);
                if (G != null) {
                    Object obj2 = G.G;
                    if ((obj2 instanceof TLRPC.User) || (obj2 instanceof TLRPC.Chat)) {
                        ((org.telegram.ui.Cells.h6) view).s(true, true);
                        s71Var.a0 = (TLObject) G.G;
                        s71Var.U(true);
                        s71Var.i0.N(true);
                        break;
                    }
                }
                break;
            case 4:
                ((v71) obj).Q(i10, view);
                break;
            case 5:
                SessionsActivity.U((SessionsActivity) obj, i10);
                break;
            case 6:
                ab1 ab1Var = (ab1) obj;
                ArrayList arrayList = ab1Var.N;
                ArrayList arrayList2 = ab1Var.O;
                fa1 fa1Var = ab1Var.X;
                int i14 = fa1Var.I;
                if (i10 >= i14 && i10 <= fa1Var.J) {
                    xa1 xa1Var = (xa1) ab1Var.v0.get(i10 - i14);
                    lj0 lj0Var = new lj0(xa1Var.b, true, ab1Var.b);
                    lj0Var.e0 = xa1Var;
                    ab1Var.presentFragment(lj0Var);
                    break;
                } else {
                    int i15 = fa1Var.U;
                    if (i10 >= i15 && i10 <= fa1Var.V) {
                        ((ta1) ab1Var.Q.get(i10 - i15)).b(ab1Var);
                        break;
                    } else {
                        int i16 = fa1Var.R;
                        if (i10 >= i16 && i10 <= fa1Var.S) {
                            ((ta1) arrayList2.get(i10 - i16)).b(ab1Var);
                            break;
                        } else {
                            int i17 = fa1Var.X;
                            if (i10 >= i17 && i10 <= fa1Var.Y) {
                                ((ta1) ab1Var.P.get(i10 - i17)).b(ab1Var);
                                break;
                            } else if (i10 == fa1Var.Z) {
                                int size = arrayList.size() - arrayList2.size();
                                int i18 = ab1Var.X.Z;
                                arrayList2.clear();
                                arrayList2.addAll(arrayList);
                                fa1 fa1Var2 = ab1Var.X;
                                if (fa1Var2 != null) {
                                    fa1Var2.E();
                                    ab1Var.S.setItemAnimator(ab1Var.Y);
                                    ab1Var.X.s(i18 + 1, size);
                                    ab1Var.X.u(i18);
                                    break;
                                }
                            }
                        }
                    }
                }
                break;
            case 7:
                xd1 xd1Var = (xd1) obj;
                boolean z10 = xd1Var.W0 != null;
                xd1Var.Z0(i10);
                if (z10 == (xd1Var.W0 == null)) {
                    xd1Var.M0();
                    xd1Var.l1();
                }
                xd1Var.n1();
                xd1Var.J0[1].a(xd1Var.W0 != null, true);
                xd1Var.P0.g1();
                int left = view.getLeft();
                int right = view.getRight();
                int dp = AndroidUtilities.dp(52.0f);
                int i19 = left - dp;
                if (i19 >= 0) {
                    int i20 = right + dp;
                    if (i20 > xd1Var.P0.getMeasuredWidth()) {
                        fc1 fc1Var = xd1Var.P0;
                        fc1Var.w0(i20 - fc1Var.getMeasuredWidth(), 0, null);
                        break;
                    }
                } else {
                    xd1Var.P0.w0(i19, 0, null);
                    break;
                }
                break;
            case 8:
                ue1 ue1Var = (ue1) obj;
                int i21 = ue1Var.H;
                HashSet hashSet = ue1Var.w;
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
                    if (hashSet.isEmpty() && ue1Var.v != -1 && ue1Var.n.getVisibility() == 0) {
                        ue1Var.v = -1;
                        ue1Var.n.animate().setListener(null).cancel();
                        ue1Var.n.animate().translationY(i21).setDuration(200L).setListener(new qe1(ue1Var, i12)).start();
                        org.telegram.ui.Components.ml0 ml0Var2 = ue1Var.s.getVisibility() == 0 ? ue1Var.b : ue1Var.a;
                        ml0Var2.e1(false);
                        int N0 = ((s4.c0) ml0Var2.getLayoutManager()).N0();
                        if ((N0 == ml0Var2.getAdapter().h() - 1 || (N0 == ml0Var2.getAdapter().h() - 2 && ml0Var2 == ue1Var.a)) && (L = ml0Var2.L(N0)) != null) {
                            int bottom = L.a.getBottom();
                            if (N0 == ue1Var.d.c - 2) {
                                bottom += AndroidUtilities.dp(12.0f);
                            }
                            if (ml0Var2.getMeasuredHeight() - bottom <= i21) {
                                ml0Var2.setTranslationY(-(ml0Var2.getMeasuredHeight() - bottom));
                                ml0Var2.animate().translationY(0.0f).setDuration(200L).start();
                            }
                        }
                        ue1Var.a.setPadding(0, 0, 0, 0);
                        ue1Var.b.setPadding(0, 0, 0, 0);
                    }
                    if (!hashSet.isEmpty() && ue1Var.n.getVisibility() == 8 && ue1Var.v != 1) {
                        ue1Var.v = 1;
                        ue1Var.n.setVisibility(0);
                        ue1Var.n.setTranslationY(i21);
                        ue1Var.n.animate().setListener(null).cancel();
                        ue1Var.n.animate().translationY(0.0f).setDuration(200L).setListener(new qe1(ue1Var, i13)).start();
                        ue1Var.a.setPadding(0, 0, 0, i21 - AndroidUtilities.dp(12.0f));
                        ue1Var.b.setPadding(0, 0, 0, i21);
                    }
                    if (!hashSet.isEmpty()) {
                        ue1Var.c.setText(LocaleController.formatString("LeaveChats", R.string.LeaveChats, LocaleController.formatPluralString("Chats", hashSet.size(), new Object[0])));
                    }
                    if (!hashSet.isEmpty()) {
                        org.telegram.ui.Components.ml0 ml0Var3 = ue1Var.s.getVisibility() == 0 ? ue1Var.b : ue1Var.a;
                        int height = ml0Var3.getHeight() - view.getBottom();
                        if (height < i21) {
                            ml0Var3.w0(0, i21 - height, null);
                            break;
                        }
                    }
                }
                break;
            case 9:
                fg1.V((fg1) obj, view);
                break;
            case 10:
                fg1 fg1Var = ((bg1) obj).u0;
                if (!(view instanceof org.telegram.ui.Cells.ta)) {
                    if (view instanceof cg1) {
                        cg1 cg1Var = (cg1) view;
                        ng.d.m(fg1Var, fg1Var.a, cg1Var.N, cg1Var.getMessageId());
                        break;
                    }
                } else {
                    ng.d.m(fg1Var, fg1Var.a, ((org.telegram.ui.Cells.ta) view).getTopic(), 0);
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
                ij1 ij1Var = (ij1) obj;
                ij1Var.getClass();
                String string = LocaleController.getString(R.string.BackgroundSearchColor);
                StringBuilder g10 = w.f.g(string, " ");
                String[] strArr = WallpapersListActivity.l0;
                g10.append(LocaleController.getString(strArr[i10], WallpapersListActivity.m0[i10]));
                SpannableString spannableString = new SpannableString(g10.toString());
                spannableString.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.B8, false)), string.length(), spannableString.length(), 33);
                WallpapersListActivity wallpapersListActivity = ij1Var.E;
                wallpapersListActivity.J.setSearchFieldCaption(spannableString);
                wallpapersListActivity.J.setSearchFieldHint(null);
                wallpapersListActivity.J.H("", true);
                ij1Var.n = strArr[i10];
                ij1Var.E("", true);
                break;
        }
    }
}
