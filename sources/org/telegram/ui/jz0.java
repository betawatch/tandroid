package org.telegram.ui;

import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class jz0 implements org.telegram.ui.Components.hk0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ jz0(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.ui.Components.hk0
    public final void f(int i10, View view) {
        s4.c1 K;
        int i11 = this.a;
        int i12 = 0;
        int i13 = 1;
        Object obj = this.b;
        switch (i11) {
            case 0:
                oz0.Z((oz0) obj, view);
                break;
            case 1:
                e01.Z((e01) obj, view, i10);
                break;
            case 2:
                l01.a0((l01) obj, i10);
                break;
            case 3:
                q31 q31Var = (q31) obj;
                org.telegram.ui.Components.b51 G = q31Var.a2.G(i10 - 1);
                if (G != null) {
                    Object obj2 = G.G;
                    if ((obj2 instanceof TLRPC.User) || (obj2 instanceof TLRPC.Chat)) {
                        ((org.telegram.ui.Cells.k6) view).y(true, true);
                        q31Var.S1 = (TLObject) G.G;
                        q31Var.f1(true);
                        q31Var.a2.O(true);
                        break;
                    }
                }
                break;
            case 4:
                ((r31) obj).e1(i10, view);
                break;
            case 5:
                SessionsActivity.Z((SessionsActivity) obj, i10);
                break;
            case 6:
                s61 s61Var = (s61) obj;
                ArrayList arrayList = s61Var.N;
                ArrayList arrayList2 = s61Var.O;
                x51 x51Var = s61Var.W;
                int i14 = x51Var.I;
                if (i10 >= i14 && i10 <= x51Var.J) {
                    p61 p61Var = (p61) s61Var.y0.get(i10 - i14);
                    qh0 qh0Var = new qh0(s61Var.b, p61Var.b, true);
                    qh0Var.e0 = p61Var;
                    s61Var.presentFragment(qh0Var);
                    break;
                } else {
                    int i15 = x51Var.U;
                    if (i10 >= i15 && i10 <= x51Var.V) {
                        ((l61) s61Var.Q.get(i10 - i15)).b(s61Var);
                        break;
                    } else {
                        int i16 = x51Var.R;
                        if (i10 >= i16 && i10 <= x51Var.S) {
                            ((l61) arrayList2.get(i10 - i16)).b(s61Var);
                            break;
                        } else {
                            int i17 = x51Var.X;
                            if (i10 >= i17 && i10 <= x51Var.Y) {
                                ((l61) s61Var.P.get(i10 - i17)).b(s61Var);
                                break;
                            } else if (i10 == x51Var.Z) {
                                int size = arrayList.size() - arrayList2.size();
                                int i18 = s61Var.W.Z;
                                arrayList2.clear();
                                arrayList2.addAll(arrayList);
                                x51 x51Var2 = s61Var.W;
                                if (x51Var2 != null) {
                                    x51Var2.E();
                                    s61Var.S.setItemAnimator(s61Var.X);
                                    s61Var.W.o(i18 + 1, size);
                                    s61Var.W.s(i18);
                                    break;
                                }
                            }
                        }
                    }
                }
                break;
            case 7:
                k91 k91Var = (k91) obj;
                boolean z10 = k91Var.X0 != null;
                k91Var.e1(i10);
                if (z10 == (k91Var.X0 == null)) {
                    k91Var.Q0();
                    k91Var.q1();
                }
                k91Var.s1();
                k91Var.K0[1].a(k91Var.X0 != null, true);
                k91Var.Q0.g1();
                int left = view.getLeft();
                int right = view.getRight();
                int L = org.telegram.messenger.i0.L(52.0f);
                int i19 = left - L;
                if (i19 >= 0) {
                    int i20 = right + L;
                    if (i20 > k91Var.Q0.getMeasuredWidth()) {
                        u71 u71Var = k91Var.Q0;
                        u71Var.w0(i20 - u71Var.getMeasuredWidth(), 0, null);
                        break;
                    }
                } else {
                    k91Var.Q0.w0(i19, 0, null);
                    break;
                }
                break;
            case 8:
                ca1 ca1Var = (ca1) obj;
                int i21 = ca1Var.H;
                HashSet hashSet = ca1Var.x;
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
                    if (hashSet.isEmpty() && ca1Var.w != -1 && ca1Var.n.getVisibility() == 0) {
                        ca1Var.w = -1;
                        ca1Var.n.animate().setListener(null).cancel();
                        ca1Var.n.animate().translationY(i21).setDuration(200L).setListener(new y91(ca1Var, i12)).start();
                        org.telegram.ui.Components.uk0 uk0Var = ca1Var.s.getVisibility() == 0 ? ca1Var.b : ca1Var.a;
                        uk0Var.d1(false);
                        int N0 = ((s4.a0) uk0Var.getLayoutManager()).N0();
                        if ((N0 == uk0Var.getAdapter().b() - 1 || (N0 == uk0Var.getAdapter().b() - 2 && uk0Var == ca1Var.a)) && (K = uk0Var.K(N0)) != null) {
                            int bottom = K.a.getBottom();
                            if (N0 == ca1Var.d.c - 2) {
                                bottom += org.telegram.messenger.i0.L(12.0f);
                            }
                            if (uk0Var.getMeasuredHeight() - bottom <= i21) {
                                uk0Var.setTranslationY(-(uk0Var.getMeasuredHeight() - bottom));
                                uk0Var.animate().translationY(0.0f).setDuration(200L).start();
                            }
                        }
                        ca1Var.a.setPadding(0, 0, 0, 0);
                        ca1Var.b.setPadding(0, 0, 0, 0);
                    }
                    if (!hashSet.isEmpty() && ca1Var.n.getVisibility() == 8 && ca1Var.w != 1) {
                        ca1Var.w = 1;
                        ca1Var.n.setVisibility(0);
                        ca1Var.n.setTranslationY(i21);
                        ca1Var.n.animate().setListener(null).cancel();
                        ca1Var.n.animate().translationY(0.0f).setDuration(200L).setListener(new y91(ca1Var, i13)).start();
                        ca1Var.a.setPadding(0, 0, 0, i21 - org.telegram.messenger.i0.L(12.0f));
                        ca1Var.b.setPadding(0, 0, 0, i21);
                    }
                    if (!hashSet.isEmpty()) {
                        ca1Var.c.setText(org.telegram.messenger.dd.a0("LeaveChats", null, 2131749009, org.telegram.messenger.dd.G(hashSet.size(), "Chats", new Object[0])));
                    }
                    if (!hashSet.isEmpty()) {
                        org.telegram.ui.Components.uk0 uk0Var2 = ca1Var.s.getVisibility() == 0 ? ca1Var.b : ca1Var.a;
                        int height = uk0Var2.getHeight() - view.getBottom();
                        if (height < i21) {
                            uk0Var2.w0(0, i21 - height, null);
                            break;
                        }
                    }
                }
                break;
            case 9:
                nb1.a0((nb1) obj, view);
                break;
            case 10:
                nb1 nb1Var = ((jb1) obj).v0;
                if (!(view instanceof org.telegram.ui.Cells.ja)) {
                    if (view instanceof kb1) {
                        kb1 kb1Var = (kb1) view;
                        gg.e.m(nb1Var, nb1Var.a, kb1Var.N, kb1Var.getMessageId());
                        break;
                    }
                } else {
                    gg.e.m(nb1Var, nb1Var.a, ((org.telegram.ui.Cells.ja) view).getTopic(), 0);
                    break;
                }
                break;
            case 11:
                TwoStepVerificationActivity.h0((TwoStepVerificationActivity) obj, i10);
                break;
            case 12:
                WallpapersListActivity.Z((WallpapersListActivity) obj, i10);
                break;
            default:
                ne1 ne1Var = (ne1) obj;
                String L0 = org.telegram.messenger.dd.L0(2131753738, null);
                StringBuilder i22 = sc.e.i(L0, " ");
                String[] strArr = WallpapersListActivity.j0;
                SpannableString spannableString = new SpannableString(a1.g.m(strArr[i10], WallpapersListActivity.k0[i10], i22));
                spannableString.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.B8, false)), L0.length(), spannableString.length(), 33);
                WallpapersListActivity wallpapersListActivity = ne1Var.E;
                wallpapersListActivity.J.setSearchFieldCaption(spannableString);
                wallpapersListActivity.J.setSearchFieldHint(null);
                wallpapersListActivity.J.P("", true);
                ne1Var.n = strArr[i10];
                ne1Var.E("", true);
                break;
        }
    }
}
