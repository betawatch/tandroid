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

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class f31 implements org.telegram.ui.Components.jl0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ f31(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.ui.Components.jl0
    public final void d(int i10, View view) {
        org.telegram.ui.Components.uq0 uq0Var;
        s4.c1 K;
        int i11 = this.a;
        int i12 = 0;
        int i13 = 1;
        Object obj = this.b;
        switch (i11) {
            case 0:
                j31 j31Var = (j31) obj;
                org.telegram.ui.Components.vl0 vl0Var = j31Var.y;
                org.telegram.ui.Components.qp qpVar = j31Var.b;
                if (qpVar.d.get(i10) != j31Var.K && j31Var.O == null) {
                    j31Var.Q = false;
                    j31Var.K = (org.telegram.ui.Components.rp) qpVar.d.get(i10);
                    qpVar.E(i10);
                    j31Var.h.postDelayed(new org.telegram.ui.Components.zd(j31Var, i10, 25), 100L);
                    while (i12 < vl0Var.getChildCount()) {
                        org.telegram.ui.Components.i21 i21Var = (org.telegram.ui.Components.i21) vl0Var.getChildAt(i12);
                        if (i21Var != view && (uq0Var = i21Var.J) != null) {
                            AndroidUtilities.cancelRunOnUIThread(uq0Var);
                            i21Var.J.run();
                        }
                        i12++;
                    }
                    if (!((org.telegram.ui.Components.rp) qpVar.d.get(i10)).a.a) {
                        ((org.telegram.ui.Components.i21) view).d();
                    }
                    v21 v21Var = j31Var.J;
                    if (v21Var != null) {
                        v21Var.a.d0(i10, j31Var.K.a, true);
                        break;
                    }
                }
                break;
            case 1:
                r31.U((r31) obj, view);
                break;
            case 2:
                k41.U((k41) obj, view, i10);
                break;
            case 3:
                v71 v71Var = (v71) obj;
                org.telegram.ui.Components.v51 G = v71Var.i0.G(i10 - 1);
                if (G != null) {
                    Object obj2 = G.G;
                    if ((obj2 instanceof TLRPC.User) || (obj2 instanceof TLRPC.Chat)) {
                        ((org.telegram.ui.Cells.j6) view).s(true, true);
                        v71Var.a0 = (TLObject) G.G;
                        v71Var.U(true);
                        v71Var.i0.N(true);
                        break;
                    }
                }
                break;
            case 4:
                ((z71) obj).Q(i10, view);
                break;
            case 5:
                SessionsActivity.U((SessionsActivity) obj, i10);
                break;
            case 6:
                fb1 fb1Var = (fb1) obj;
                ArrayList arrayList = fb1Var.N;
                ArrayList arrayList2 = fb1Var.O;
                ka1 ka1Var = fb1Var.X;
                int i14 = ka1Var.I;
                if (i10 >= i14 && i10 <= ka1Var.J) {
                    cb1 cb1Var = (cb1) fb1Var.v0.get(i10 - i14);
                    kj0 kj0Var = new kj0(cb1Var.b, true, fb1Var.b);
                    kj0Var.e0 = cb1Var;
                    fb1Var.presentFragment(kj0Var);
                    break;
                } else {
                    int i15 = ka1Var.U;
                    if (i10 >= i15 && i10 <= ka1Var.V) {
                        ((ya1) fb1Var.Q.get(i10 - i15)).b(fb1Var);
                        break;
                    } else {
                        int i16 = ka1Var.R;
                        if (i10 >= i16 && i10 <= ka1Var.S) {
                            ((ya1) arrayList2.get(i10 - i16)).b(fb1Var);
                            break;
                        } else {
                            int i17 = ka1Var.X;
                            if (i10 >= i17 && i10 <= ka1Var.Y) {
                                ((ya1) fb1Var.P.get(i10 - i17)).b(fb1Var);
                                break;
                            } else if (i10 == ka1Var.Z) {
                                int size = arrayList.size() - arrayList2.size();
                                int i18 = fb1Var.X.Z;
                                arrayList2.clear();
                                arrayList2.addAll(arrayList);
                                ka1 ka1Var2 = fb1Var.X;
                                if (ka1Var2 != null) {
                                    ka1Var2.E();
                                    fb1Var.S.setItemAnimator(fb1Var.Y);
                                    fb1Var.X.s(i18 + 1, size);
                                    fb1Var.X.u(i18);
                                    break;
                                }
                            }
                        }
                    }
                }
                break;
            case 7:
                ae1 ae1Var = (ae1) obj;
                boolean z10 = ae1Var.W0 != null;
                ae1Var.Z0(i10);
                if (z10 == (ae1Var.W0 == null)) {
                    ae1Var.M0();
                    ae1Var.l1();
                }
                ae1Var.n1();
                ae1Var.J0[1].a(ae1Var.W0 != null, true);
                ae1Var.P0.e1();
                int left = view.getLeft();
                int right = view.getRight();
                int dp = AndroidUtilities.dp(52.0f);
                int i19 = left - dp;
                if (i19 >= 0) {
                    int i20 = right + dp;
                    if (i20 > ae1Var.P0.getMeasuredWidth()) {
                        ic1 ic1Var = ae1Var.P0;
                        ic1Var.v0(i20 - ic1Var.getMeasuredWidth(), 0, null);
                        break;
                    }
                } else {
                    ae1Var.P0.v0(i19, 0, null);
                    break;
                }
                break;
            case 8:
                xe1 xe1Var = (xe1) obj;
                int i21 = xe1Var.H;
                HashSet hashSet = xe1Var.w;
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
                    if (hashSet.isEmpty() && xe1Var.v != -1 && xe1Var.n.getVisibility() == 0) {
                        xe1Var.v = -1;
                        xe1Var.n.animate().setListener(null).cancel();
                        xe1Var.n.animate().translationY(i21).setDuration(200L).setListener(new te1(xe1Var, i12)).start();
                        org.telegram.ui.Components.vl0 vl0Var2 = xe1Var.s.getVisibility() == 0 ? xe1Var.b : xe1Var.a;
                        vl0Var2.c1(false);
                        int N0 = ((s4.c0) vl0Var2.getLayoutManager()).N0();
                        if ((N0 == vl0Var2.getAdapter().h() - 1 || (N0 == vl0Var2.getAdapter().h() - 2 && vl0Var2 == xe1Var.a)) && (K = vl0Var2.K(N0)) != null) {
                            int bottom = K.a.getBottom();
                            if (N0 == xe1Var.d.c - 2) {
                                bottom += AndroidUtilities.dp(12.0f);
                            }
                            if (vl0Var2.getMeasuredHeight() - bottom <= i21) {
                                vl0Var2.setTranslationY(-(vl0Var2.getMeasuredHeight() - bottom));
                                vl0Var2.animate().translationY(0.0f).setDuration(200L).start();
                            }
                        }
                        xe1Var.a.setPadding(0, 0, 0, 0);
                        xe1Var.b.setPadding(0, 0, 0, 0);
                    }
                    if (!hashSet.isEmpty() && xe1Var.n.getVisibility() == 8 && xe1Var.v != 1) {
                        xe1Var.v = 1;
                        xe1Var.n.setVisibility(0);
                        xe1Var.n.setTranslationY(i21);
                        xe1Var.n.animate().setListener(null).cancel();
                        xe1Var.n.animate().translationY(0.0f).setDuration(200L).setListener(new te1(xe1Var, i13)).start();
                        xe1Var.a.setPadding(0, 0, 0, i21 - AndroidUtilities.dp(12.0f));
                        xe1Var.b.setPadding(0, 0, 0, i21);
                    }
                    if (!hashSet.isEmpty()) {
                        xe1Var.c.setText(LocaleController.formatString("LeaveChats", R.string.LeaveChats, LocaleController.formatPluralString("Chats", hashSet.size(), new Object[0])));
                    }
                    if (!hashSet.isEmpty()) {
                        org.telegram.ui.Components.vl0 vl0Var3 = xe1Var.s.getVisibility() == 0 ? xe1Var.b : xe1Var.a;
                        int height = vl0Var3.getHeight() - view.getBottom();
                        if (height < i21) {
                            vl0Var3.v0(0, i21 - height, null);
                            break;
                        }
                    }
                }
                break;
            case 9:
                ig1.V((ig1) obj, view);
                break;
            case 10:
                ig1 ig1Var = ((eg1) obj).t0;
                if (!(view instanceof org.telegram.ui.Cells.ua)) {
                    if (view instanceof fg1) {
                        fg1 fg1Var = (fg1) view;
                        mg.d.m(ig1Var, ig1Var.a, fg1Var.N, fg1Var.getMessageId());
                        break;
                    }
                } else {
                    mg.d.m(ig1Var, ig1Var.a, ((org.telegram.ui.Cells.ua) view).getTopic(), 0);
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
                nj1 nj1Var = (nj1) obj;
                nj1Var.getClass();
                String string = LocaleController.getString(R.string.BackgroundSearchColor);
                StringBuilder g10 = w.f.g(string, " ");
                String[] strArr = WallpapersListActivity.n0;
                g10.append(LocaleController.getString(strArr[i10], WallpapersListActivity.o0[i10]));
                SpannableString spannableString = new SpannableString(g10.toString());
                spannableString.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.B8, false)), string.length(), spannableString.length(), 33);
                WallpapersListActivity wallpapersListActivity = nj1Var.E;
                wallpapersListActivity.L.setSearchFieldCaption(spannableString);
                wallpapersListActivity.L.setSearchFieldHint(null);
                wallpapersListActivity.L.H("", true);
                nj1Var.n = strArr[i10];
                nj1Var.E("", true);
                break;
        }
    }
}
