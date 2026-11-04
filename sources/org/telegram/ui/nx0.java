package org.telegram.ui;

import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class nx0 implements org.telegram.ui.Components.fj0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ nx0(Object obj, int i3) {
        this.a = i3;
        this.b = obj;
    }

    @Override // org.telegram.ui.Components.fj0
    public final void f(int i3, View view) {
        u4.d1 K;
        int i10 = this.a;
        int i11 = 0;
        int i12 = 1;
        Object obj = this.b;
        switch (i10) {
            case 0:
                sx0.Z((sx0) obj, view);
                break;
            case 1:
                gy0.Z((gy0) obj, view, i3);
                break;
            case 2:
                ny0.a0((ny0) obj, i3);
                break;
            case 3:
                q11 q11Var = (q11) obj;
                org.telegram.ui.Components.r31 G = q11Var.b2.G(i3 - 1);
                if (G != null) {
                    Object obj2 = G.G;
                    if ((obj2 instanceof TLRPC.User) || (obj2 instanceof TLRPC.Chat)) {
                        ((org.telegram.ui.Cells.f6) view).w(true, true);
                        q11Var.T1 = (TLObject) G.G;
                        q11Var.f1(true);
                        q11Var.b2.O(true);
                        break;
                    }
                }
                break;
            case 4:
                ((s11) obj).e1(i3, view);
                break;
            case 5:
                SessionsActivity.Z((SessionsActivity) obj, i3);
                break;
            case 6:
                r41 r41Var = (r41) obj;
                ArrayList arrayList = r41Var.O;
                ArrayList arrayList2 = r41Var.P;
                w31 w31Var = r41Var.X;
                int i13 = w31Var.J;
                if (i3 >= i13 && i3 <= w31Var.K) {
                    o41 o41Var = (o41) r41Var.z0.get(i3 - i13);
                    dg0 dg0Var = new dg0(r41Var.b, o41Var.b, true);
                    dg0Var.f0 = o41Var;
                    r41Var.presentFragment(dg0Var);
                    break;
                } else {
                    int i14 = w31Var.V;
                    if (i3 >= i14 && i3 <= w31Var.W) {
                        ((k41) r41Var.R.get(i3 - i14)).b(r41Var);
                        break;
                    } else {
                        int i15 = w31Var.S;
                        if (i3 >= i15 && i3 <= w31Var.T) {
                            ((k41) arrayList2.get(i3 - i15)).b(r41Var);
                            break;
                        } else {
                            int i16 = w31Var.Y;
                            if (i3 >= i16 && i3 <= w31Var.Z) {
                                ((k41) r41Var.Q.get(i3 - i16)).b(r41Var);
                                break;
                            } else if (i3 == w31Var.a0) {
                                int size = arrayList.size() - arrayList2.size();
                                int i17 = r41Var.X.a0;
                                arrayList2.clear();
                                arrayList2.addAll(arrayList);
                                w31 w31Var2 = r41Var.X;
                                if (w31Var2 != null) {
                                    w31Var2.E();
                                    r41Var.T.setItemAnimator(r41Var.Y);
                                    r41Var.X.o(i17 + 1, size);
                                    r41Var.X.s(i17);
                                    break;
                                }
                            }
                        }
                    }
                }
                break;
            case 7:
                l71 l71Var = (l71) obj;
                boolean z10 = l71Var.Y0 != null;
                l71Var.e1(i3);
                if (z10 == (l71Var.Y0 == null)) {
                    l71Var.Q0();
                    l71Var.q1();
                }
                l71Var.s1();
                l71Var.L0[1].a(l71Var.Y0 != null, true);
                l71Var.R0.g1();
                int left = view.getLeft();
                int right = view.getRight();
                int L = org.telegram.messenger.g0.L(52.0f);
                int i18 = left - L;
                if (i18 >= 0) {
                    int i19 = right + L;
                    if (i19 > l71Var.R0.getMeasuredWidth()) {
                        u51 u51Var = l71Var.R0;
                        u51Var.w0(i19 - u51Var.getMeasuredWidth(), 0, null);
                        break;
                    }
                } else {
                    l71Var.R0.w0(i18, 0, null);
                    break;
                }
                break;
            case 8:
                d81 d81Var = (d81) obj;
                int i20 = d81Var.I;
                HashSet hashSet = d81Var.x;
                if (view instanceof org.telegram.ui.Cells.h4) {
                    org.telegram.ui.Cells.h4 h4Var = (org.telegram.ui.Cells.h4) view;
                    TLRPC.Chat chat = (TLRPC.Chat) h4Var.getObject();
                    if (hashSet.contains(Long.valueOf(chat.id))) {
                        hashSet.remove(Long.valueOf(chat.id));
                        h4Var.c(false, true);
                    } else {
                        hashSet.add(Long.valueOf(chat.id));
                        h4Var.c(true, true);
                    }
                    if (hashSet.isEmpty() && d81Var.w != -1 && d81Var.n.getVisibility() == 0) {
                        d81Var.w = -1;
                        d81Var.n.animate().setListener(null).cancel();
                        d81Var.n.animate().translationY(i20).setDuration(200L).setListener(new z71(d81Var, i11)).start();
                        org.telegram.ui.Components.tj0 tj0Var = d81Var.s.getVisibility() == 0 ? d81Var.b : d81Var.a;
                        tj0Var.d1(false);
                        int N0 = ((u4.b0) tj0Var.getLayoutManager()).N0();
                        if ((N0 == tj0Var.getAdapter().b() - 1 || (N0 == tj0Var.getAdapter().b() - 2 && tj0Var == d81Var.a)) && (K = tj0Var.K(N0)) != null) {
                            int bottom = K.a.getBottom();
                            if (N0 == d81Var.d.c - 2) {
                                bottom += org.telegram.messenger.g0.L(12.0f);
                            }
                            if (tj0Var.getMeasuredHeight() - bottom <= i20) {
                                tj0Var.setTranslationY(-(tj0Var.getMeasuredHeight() - bottom));
                                tj0Var.animate().translationY(0.0f).setDuration(200L).start();
                            }
                        }
                        d81Var.a.setPadding(0, 0, 0, 0);
                        d81Var.b.setPadding(0, 0, 0, 0);
                    }
                    if (!hashSet.isEmpty() && d81Var.n.getVisibility() == 8 && d81Var.w != 1) {
                        d81Var.w = 1;
                        d81Var.n.setVisibility(0);
                        d81Var.n.setTranslationY(i20);
                        d81Var.n.animate().setListener(null).cancel();
                        d81Var.n.animate().translationY(0.0f).setDuration(200L).setListener(new z71(d81Var, i12)).start();
                        d81Var.a.setPadding(0, 0, 0, i20 - org.telegram.messenger.g0.L(12.0f));
                        d81Var.b.setPadding(0, 0, 0, i20);
                    }
                    if (!hashSet.isEmpty()) {
                        d81Var.c.setText(org.telegram.messenger.bd.a0("LeaveChats", null, 2131749007, org.telegram.messenger.bd.G(hashSet.size(), "Chats", new Object[0])));
                    }
                    if (!hashSet.isEmpty()) {
                        org.telegram.ui.Components.tj0 tj0Var2 = d81Var.s.getVisibility() == 0 ? d81Var.b : d81Var.a;
                        int height = tj0Var2.getHeight() - view.getBottom();
                        if (height < i20) {
                            tj0Var2.w0(0, i20 - height, null);
                            break;
                        }
                    }
                }
                break;
            case 9:
                m91.a0((m91) obj, view);
                break;
            case 10:
                m91 m91Var = ((i91) obj).w0;
                if (!(view instanceof org.telegram.ui.Cells.ja)) {
                    if (view instanceof j91) {
                        j91 j91Var = (j91) view;
                        rg.c.m(m91Var, m91Var.a, j91Var.O, j91Var.getMessageId());
                        break;
                    }
                } else {
                    rg.c.m(m91Var, m91Var.a, ((org.telegram.ui.Cells.ja) view).getTopic(), 0);
                    break;
                }
                break;
            case 11:
                TwoStepVerificationActivity.h0((TwoStepVerificationActivity) obj, i3);
                break;
            case 12:
                WallpapersListActivity.Z((WallpapersListActivity) obj, i3);
                break;
            default:
                nc1 nc1Var = (nc1) obj;
                String M0 = org.telegram.messenger.bd.M0(2131753738, null);
                StringBuilder h = t4.c.h(M0, " ");
                String[] strArr = WallpapersListActivity.k0;
                SpannableString spannableString = new SpannableString(k2.p1.k(WallpapersListActivity.l0[i3], strArr[i3], h));
                spannableString.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.B8, false)), M0.length(), spannableString.length(), 33);
                WallpapersListActivity wallpapersListActivity = nc1Var.F;
                wallpapersListActivity.K.setSearchFieldCaption(spannableString);
                wallpapersListActivity.K.setSearchFieldHint(null);
                wallpapersListActivity.K.P("", true);
                nc1Var.n = strArr[i3];
                nc1Var.E("", true);
                break;
        }
    }
}
