package org.telegram.ui;

import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class kz0 implements org.telegram.ui.Components.gk0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ kz0(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.ui.Components.gk0
    public final void f(int i10, View view) {
        s4.c1 K;
        int i11 = this.a;
        int i12 = 0;
        int i13 = 1;
        Object obj = this.b;
        switch (i11) {
            case 0:
                pz0.Y((pz0) obj, view);
                break;
            case 1:
                e01.Y((e01) obj, view, i10);
                break;
            case 2:
                l01.Z((l01) obj, i10);
                break;
            case 3:
                s31 s31Var = (s31) obj;
                org.telegram.ui.Components.a51 G = s31Var.a2.G(i10 - 1);
                if (G != null) {
                    Object obj2 = G.G;
                    if ((obj2 instanceof TLRPC.User) || (obj2 instanceof TLRPC.Chat)) {
                        ((org.telegram.ui.Cells.k6) view).y(true, true);
                        s31Var.S1 = (TLObject) G.G;
                        s31Var.f1(true);
                        s31Var.a2.O(true);
                        break;
                    }
                }
                break;
            case 4:
                ((t31) obj).e1(i10, view);
                break;
            case 5:
                SessionsActivity.Y((SessionsActivity) obj, i10);
                break;
            case 6:
                u61 u61Var = (u61) obj;
                ArrayList arrayList = u61Var.N;
                ArrayList arrayList2 = u61Var.O;
                z51 z51Var = u61Var.W;
                int i14 = z51Var.I;
                if (i10 >= i14 && i10 <= z51Var.J) {
                    r61 r61Var = (r61) u61Var.y0.get(i10 - i14);
                    sh0 sh0Var = new sh0(u61Var.b, r61Var.b, true);
                    sh0Var.e0 = r61Var;
                    u61Var.presentFragment(sh0Var);
                    break;
                } else {
                    int i15 = z51Var.U;
                    if (i10 >= i15 && i10 <= z51Var.V) {
                        ((n61) u61Var.Q.get(i10 - i15)).b(u61Var);
                        break;
                    } else {
                        int i16 = z51Var.R;
                        if (i10 >= i16 && i10 <= z51Var.S) {
                            ((n61) arrayList2.get(i10 - i16)).b(u61Var);
                            break;
                        } else {
                            int i17 = z51Var.X;
                            if (i10 >= i17 && i10 <= z51Var.Y) {
                                ((n61) u61Var.P.get(i10 - i17)).b(u61Var);
                                break;
                            } else if (i10 == z51Var.Z) {
                                int size = arrayList.size() - arrayList2.size();
                                int i18 = u61Var.W.Z;
                                arrayList2.clear();
                                arrayList2.addAll(arrayList);
                                z51 z51Var2 = u61Var.W;
                                if (z51Var2 != null) {
                                    z51Var2.E();
                                    u61Var.S.setItemAnimator(u61Var.X);
                                    u61Var.W.o(i18 + 1, size);
                                    u61Var.W.s(i18);
                                    break;
                                }
                            }
                        }
                    }
                }
                break;
            case 7:
                m91 m91Var = (m91) obj;
                boolean z10 = m91Var.X0 != null;
                m91Var.d1(i10);
                if (z10 == (m91Var.X0 == null)) {
                    m91Var.P0();
                    m91Var.p1();
                }
                m91Var.r1();
                m91Var.K0[1].a(m91Var.X0 != null, true);
                m91Var.Q0.g1();
                int left = view.getLeft();
                int right = view.getRight();
                int L = org.telegram.messenger.i0.L(52.0f);
                int i19 = left - L;
                if (i19 >= 0) {
                    int i20 = right + L;
                    if (i20 > m91Var.Q0.getMeasuredWidth()) {
                        w71 w71Var = m91Var.Q0;
                        w71Var.w0(i20 - w71Var.getMeasuredWidth(), 0, null);
                        break;
                    }
                } else {
                    m91Var.Q0.w0(i19, 0, null);
                    break;
                }
                break;
            case 8:
                ea1 ea1Var = (ea1) obj;
                int i21 = ea1Var.H;
                HashSet hashSet = ea1Var.x;
                if (view instanceof org.telegram.ui.Cells.j4) {
                    org.telegram.ui.Cells.j4 j4Var = (org.telegram.ui.Cells.j4) view;
                    TLRPC.Chat chat = (TLRPC.Chat) j4Var.getObject();
                    if (hashSet.contains(Long.valueOf(chat.id))) {
                        hashSet.remove(Long.valueOf(chat.id));
                        j4Var.c(false, true);
                    } else {
                        hashSet.add(Long.valueOf(chat.id));
                        j4Var.c(true, true);
                    }
                    if (hashSet.isEmpty() && ea1Var.w != -1 && ea1Var.n.getVisibility() == 0) {
                        ea1Var.w = -1;
                        ea1Var.n.animate().setListener(null).cancel();
                        ea1Var.n.animate().translationY(i21).setDuration(200L).setListener(new aa1(ea1Var, i12)).start();
                        org.telegram.ui.Components.tk0 tk0Var = ea1Var.s.getVisibility() == 0 ? ea1Var.b : ea1Var.a;
                        tk0Var.d1(false);
                        int N0 = ((s4.a0) tk0Var.getLayoutManager()).N0();
                        if ((N0 == tk0Var.getAdapter().b() - 1 || (N0 == tk0Var.getAdapter().b() - 2 && tk0Var == ea1Var.a)) && (K = tk0Var.K(N0)) != null) {
                            int bottom = K.a.getBottom();
                            if (N0 == ea1Var.d.c - 2) {
                                bottom += org.telegram.messenger.i0.L(12.0f);
                            }
                            if (tk0Var.getMeasuredHeight() - bottom <= i21) {
                                tk0Var.setTranslationY(-(tk0Var.getMeasuredHeight() - bottom));
                                tk0Var.animate().translationY(0.0f).setDuration(200L).start();
                            }
                        }
                        ea1Var.a.setPadding(0, 0, 0, 0);
                        ea1Var.b.setPadding(0, 0, 0, 0);
                    }
                    if (!hashSet.isEmpty() && ea1Var.n.getVisibility() == 8 && ea1Var.w != 1) {
                        ea1Var.w = 1;
                        ea1Var.n.setVisibility(0);
                        ea1Var.n.setTranslationY(i21);
                        ea1Var.n.animate().setListener(null).cancel();
                        ea1Var.n.animate().translationY(0.0f).setDuration(200L).setListener(new aa1(ea1Var, i13)).start();
                        ea1Var.a.setPadding(0, 0, 0, i21 - org.telegram.messenger.i0.L(12.0f));
                        ea1Var.b.setPadding(0, 0, 0, i21);
                    }
                    if (!hashSet.isEmpty()) {
                        ea1Var.c.setText(org.telegram.messenger.cd.a0("LeaveChats", null, 2131749009, org.telegram.messenger.cd.G(hashSet.size(), "Chats", new Object[0])));
                    }
                    if (!hashSet.isEmpty()) {
                        org.telegram.ui.Components.tk0 tk0Var2 = ea1Var.s.getVisibility() == 0 ? ea1Var.b : ea1Var.a;
                        int height = tk0Var2.getHeight() - view.getBottom();
                        if (height < i21) {
                            tk0Var2.w0(0, i21 - height, null);
                            break;
                        }
                    }
                }
                break;
            case 9:
                pb1.Z((pb1) obj, view);
                break;
            case 10:
                pb1 pb1Var = ((lb1) obj).v0;
                if (!(view instanceof org.telegram.ui.Cells.ja)) {
                    if (view instanceof mb1) {
                        mb1 mb1Var = (mb1) view;
                        gg.e.m(pb1Var, pb1Var.a, mb1Var.N, mb1Var.getMessageId());
                        break;
                    }
                } else {
                    gg.e.m(pb1Var, pb1Var.a, ((org.telegram.ui.Cells.ja) view).getTopic(), 0);
                    break;
                }
                break;
            case 11:
                TwoStepVerificationActivity.g0((TwoStepVerificationActivity) obj, i10);
                break;
            case 12:
                WallpapersListActivity.Y((WallpapersListActivity) obj, i10);
                break;
            default:
                pe1 pe1Var = (pe1) obj;
                String L0 = org.telegram.messenger.cd.L0(2131753738, null);
                StringBuilder i22 = sc.e.i(L0, " ");
                String[] strArr = WallpapersListActivity.j0;
                SpannableString spannableString = new SpannableString(a1.g.m(strArr[i10], WallpapersListActivity.k0[i10], i22));
                spannableString.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.B8, false)), L0.length(), spannableString.length(), 33);
                WallpapersListActivity wallpapersListActivity = pe1Var.E;
                wallpapersListActivity.J.setSearchFieldCaption(spannableString);
                wallpapersListActivity.J.setSearchFieldHint(null);
                wallpapersListActivity.J.P("", true);
                pe1Var.n = strArr[i10];
                pe1Var.E("", true);
                break;
        }
    }
}
