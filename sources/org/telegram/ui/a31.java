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

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final /* synthetic */ class a31 implements org.telegram.ui.Components.zk0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ a31(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.ui.Components.zk0
    public final void d(int i10, View view) {
        org.telegram.ui.Components.jq0 jq0Var;
        s4.c1 K;
        int i11 = this.a;
        int i12 = 0;
        int i13 = 1;
        Object obj = this.b;
        switch (i11) {
            case 0:
                e31 e31Var = (e31) obj;
                org.telegram.ui.Components.ll0 ll0Var = e31Var.y;
                org.telegram.ui.Components.kp kpVar = e31Var.b;
                if (kpVar.d.get(i10) != e31Var.K && e31Var.O == null) {
                    e31Var.Q = false;
                    e31Var.K = (org.telegram.ui.Components.lp) kpVar.d.get(i10);
                    kpVar.E(i10);
                    e31Var.h.postDelayed(new org.telegram.ui.Components.id(e31Var, i10, 26), 100L);
                    while (i12 < ll0Var.getChildCount()) {
                        org.telegram.ui.Components.u11 u11Var = (org.telegram.ui.Components.u11) ll0Var.getChildAt(i12);
                        if (u11Var != view && (jq0Var = u11Var.J) != null) {
                            AndroidUtilities.cancelRunOnUIThread(jq0Var);
                            u11Var.J.run();
                        }
                        i12++;
                    }
                    if (!((org.telegram.ui.Components.lp) kpVar.d.get(i10)).a.a) {
                        ((org.telegram.ui.Components.u11) view).d();
                    }
                    q21 q21Var = e31Var.J;
                    if (q21Var != null) {
                        q21Var.a.d0(i10, e31Var.K.a, true);
                        break;
                    }
                }
                break;
            case 1:
                m31.U((m31) obj, view);
                break;
            case 2:
                f41.U((f41) obj, view, i10);
                break;
            case 3:
                r71 r71Var = (r71) obj;
                org.telegram.ui.Components.i51 G = r71Var.i0.G(i10 - 1);
                if (G != null) {
                    Object obj2 = G.G;
                    if ((obj2 instanceof TLRPC.User) || (obj2 instanceof TLRPC.Chat)) {
                        ((org.telegram.ui.Cells.i6) view).s(true, true);
                        r71Var.a0 = (TLObject) G.G;
                        r71Var.U(true);
                        r71Var.i0.N(true);
                        break;
                    }
                }
                break;
            case 4:
                ((u71) obj).Q(i10, view);
                break;
            case 5:
                SessionsActivity.U((SessionsActivity) obj, i10);
                break;
            case 6:
                za1 za1Var = (za1) obj;
                ArrayList arrayList = za1Var.N;
                ArrayList arrayList2 = za1Var.O;
                ea1 ea1Var = za1Var.X;
                int i14 = ea1Var.I;
                if (i10 >= i14 && i10 <= ea1Var.J) {
                    wa1 wa1Var = (wa1) za1Var.v0.get(i10 - i14);
                    jj0 jj0Var = new jj0(wa1Var.b, true, za1Var.b);
                    jj0Var.e0 = wa1Var;
                    za1Var.presentFragment(jj0Var);
                    break;
                } else {
                    int i15 = ea1Var.U;
                    if (i10 >= i15 && i10 <= ea1Var.V) {
                        ((sa1) za1Var.Q.get(i10 - i15)).b(za1Var);
                        break;
                    } else {
                        int i16 = ea1Var.R;
                        if (i10 >= i16 && i10 <= ea1Var.S) {
                            ((sa1) arrayList2.get(i10 - i16)).b(za1Var);
                            break;
                        } else {
                            int i17 = ea1Var.X;
                            if (i10 >= i17 && i10 <= ea1Var.Y) {
                                ((sa1) za1Var.P.get(i10 - i17)).b(za1Var);
                                break;
                            } else if (i10 == ea1Var.Z) {
                                int size = arrayList.size() - arrayList2.size();
                                int i18 = za1Var.X.Z;
                                arrayList2.clear();
                                arrayList2.addAll(arrayList);
                                ea1 ea1Var2 = za1Var.X;
                                if (ea1Var2 != null) {
                                    ea1Var2.E();
                                    za1Var.S.setItemAnimator(za1Var.Y);
                                    za1Var.X.s(i18 + 1, size);
                                    za1Var.X.u(i18);
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
                wd1Var.P0.f1();
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
                    if (hashSet.isEmpty() && te1Var.v != -1 && te1Var.n.getVisibility() == 0) {
                        te1Var.v = -1;
                        te1Var.n.animate().setListener(null).cancel();
                        te1Var.n.animate().translationY(i21).setDuration(200L).setListener(new pe1(te1Var, i12)).start();
                        org.telegram.ui.Components.ll0 ll0Var2 = te1Var.s.getVisibility() == 0 ? te1Var.b : te1Var.a;
                        ll0Var2.d1(false);
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
                if (!(view instanceof org.telegram.ui.Cells.ta)) {
                    if (view instanceof bg1) {
                        bg1 bg1Var = (bg1) view;
                        ng.d.m(eg1Var, eg1Var.a, bg1Var.N, bg1Var.getMessageId());
                        break;
                    }
                } else {
                    ng.d.m(eg1Var, eg1Var.a, ((org.telegram.ui.Cells.ta) view).getTopic(), 0);
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
                StringBuilder h = w.c.h(string, " ");
                String[] strArr = WallpapersListActivity.n0;
                h.append(LocaleController.getString(strArr[i10], WallpapersListActivity.o0[i10]));
                SpannableString spannableString = new SpannableString(h.toString());
                spannableString.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.B8, false)), string.length(), spannableString.length(), 33);
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
