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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class c21 implements org.telegram.ui.Components.mk0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ c21(Object obj, int i9) {
        this.a = i9;
        this.b = obj;
    }

    @Override // org.telegram.ui.Components.mk0
    public final void a(int i9, View view) {
        f2.q1 K;
        int i10 = this.a;
        int i11 = 0;
        int i12 = 1;
        Object obj = this.b;
        switch (i10) {
            case 0:
                h21.T((h21) obj, view);
                break;
            case 1:
                b31.T((b31) obj, view, i9);
                break;
            case 2:
                l61 l61Var = (l61) obj;
                org.telegram.ui.Components.l41 G = l61Var.e0.G(i9 - 1);
                if (G != null) {
                    Object obj2 = G.G;
                    if ((obj2 instanceof TLRPC.User) || (obj2 instanceof TLRPC.Chat)) {
                        ((org.telegram.ui.Cells.h6) view).s(true, true);
                        l61Var.W = (TLObject) G.G;
                        l61Var.T(true);
                        l61Var.e0.N(true);
                        break;
                    }
                }
                break;
            case 3:
                ((o61) obj).P(i9, view);
                break;
            case 4:
                SessionsActivity.T((SessionsActivity) obj, i9);
                break;
            case 5:
                s91 s91Var = (s91) obj;
                ArrayList arrayList = s91Var.J;
                ArrayList arrayList2 = s91Var.K;
                x81 x81Var = s91Var.T;
                int i13 = x81Var.E;
                if (i9 >= i13 && i9 <= x81Var.F) {
                    p91 p91Var = (p91) s91Var.r0.get(i9 - i13);
                    ti0 ti0Var = new ti0(p91Var.b, true, s91Var.b);
                    ti0Var.a0 = p91Var;
                    s91Var.presentFragment(ti0Var);
                    break;
                } else {
                    int i14 = x81Var.Q;
                    if (i9 >= i14 && i9 <= x81Var.R) {
                        ((l91) s91Var.M.get(i9 - i14)).b(s91Var);
                        break;
                    } else {
                        int i15 = x81Var.N;
                        if (i9 >= i15 && i9 <= x81Var.O) {
                            ((l91) arrayList2.get(i9 - i15)).b(s91Var);
                            break;
                        } else {
                            int i16 = x81Var.T;
                            if (i9 >= i16 && i9 <= x81Var.U) {
                                ((l91) s91Var.L.get(i9 - i16)).b(s91Var);
                                break;
                            } else if (i9 == x81Var.V) {
                                int size = arrayList.size() - arrayList2.size();
                                int i17 = s91Var.T.V;
                                arrayList2.clear();
                                arrayList2.addAll(arrayList);
                                x81 x81Var2 = s91Var.T;
                                if (x81Var2 != null) {
                                    x81Var2.E();
                                    s91Var.O.setItemAnimator(s91Var.U);
                                    s91Var.T.s(i17 + 1, size);
                                    s91Var.T.u(i17);
                                    break;
                                }
                            }
                        }
                    }
                }
                break;
            case 6:
                oc1 oc1Var = (oc1) obj;
                boolean z10 = oc1Var.S0 != null;
                oc1Var.Z0(i9);
                if (z10 == (oc1Var.S0 == null)) {
                    oc1Var.M0();
                    oc1Var.l1();
                }
                oc1Var.n1();
                oc1Var.F0[1].a(oc1Var.S0 != null, true);
                oc1Var.L0.f1();
                int left = view.getLeft();
                int right = view.getRight();
                int dp = AndroidUtilities.dp(52.0f);
                int i18 = left - dp;
                if (i18 >= 0) {
                    int i19 = right + dp;
                    if (i19 > oc1Var.L0.getMeasuredWidth()) {
                        va1 va1Var = oc1Var.L0;
                        va1Var.v0(i19 - va1Var.getMeasuredWidth(), 0, null);
                        break;
                    }
                } else {
                    oc1Var.L0.v0(i18, 0, null);
                    break;
                }
                break;
            case 7:
                kd1 kd1Var = (kd1) obj;
                int i20 = kd1Var.D;
                HashSet hashSet = kd1Var.w;
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
                    if (hashSet.isEmpty() && kd1Var.v != -1 && kd1Var.n.getVisibility() == 0) {
                        kd1Var.v = -1;
                        kd1Var.n.animate().setListener(null).cancel();
                        kd1Var.n.animate().translationY(i20).setDuration(200L).setListener(new gd1(kd1Var, i11)).start();
                        org.telegram.ui.Components.wk0 wk0Var = kd1Var.s.getVisibility() == 0 ? kd1Var.b : kd1Var.a;
                        wk0Var.d1(false);
                        int N0 = ((f2.m0) wk0Var.getLayoutManager()).N0();
                        if ((N0 == wk0Var.getAdapter().h() - 1 || (N0 == wk0Var.getAdapter().h() - 2 && wk0Var == kd1Var.a)) && (K = wk0Var.K(N0)) != null) {
                            int bottom = K.a.getBottom();
                            if (N0 == kd1Var.d.c - 2) {
                                bottom += AndroidUtilities.dp(12.0f);
                            }
                            if (wk0Var.getMeasuredHeight() - bottom <= i20) {
                                wk0Var.setTranslationY(-(wk0Var.getMeasuredHeight() - bottom));
                                wk0Var.animate().translationY(0.0f).setDuration(200L).start();
                            }
                        }
                        kd1Var.a.setPadding(0, 0, 0, 0);
                        kd1Var.b.setPadding(0, 0, 0, 0);
                    }
                    if (!hashSet.isEmpty() && kd1Var.n.getVisibility() == 8 && kd1Var.v != 1) {
                        kd1Var.v = 1;
                        kd1Var.n.setVisibility(0);
                        kd1Var.n.setTranslationY(i20);
                        kd1Var.n.animate().setListener(null).cancel();
                        kd1Var.n.animate().translationY(0.0f).setDuration(200L).setListener(new gd1(kd1Var, i12)).start();
                        kd1Var.a.setPadding(0, 0, 0, i20 - AndroidUtilities.dp(12.0f));
                        kd1Var.b.setPadding(0, 0, 0, i20);
                    }
                    if (!hashSet.isEmpty()) {
                        kd1Var.c.setText(LocaleController.formatString("LeaveChats", R.string.LeaveChats, LocaleController.formatPluralString("Chats", hashSet.size(), new Object[0])));
                    }
                    if (!hashSet.isEmpty()) {
                        org.telegram.ui.Components.wk0 wk0Var2 = kd1Var.s.getVisibility() == 0 ? kd1Var.b : kd1Var.a;
                        int height = wk0Var2.getHeight() - view.getBottom();
                        if (height < i20) {
                            wk0Var2.v0(0, i20 - height, null);
                            break;
                        }
                    }
                }
                break;
            case 8:
                we1.U((we1) obj, view);
                break;
            case 9:
                we1 we1Var = ((re1) obj).p0;
                if (!(view instanceof org.telegram.ui.Cells.pa)) {
                    if (view instanceof se1) {
                        se1 se1Var = (se1) view;
                        vf.c.m(we1Var, we1Var.a, se1Var.J, se1Var.getMessageId());
                        break;
                    }
                } else {
                    vf.c.m(we1Var, we1Var.a, ((org.telegram.ui.Cells.pa) view).getTopic(), 0);
                    break;
                }
                break;
            case 10:
                TwoStepVerificationActivity.b0((TwoStepVerificationActivity) obj, i9);
                break;
            case 11:
                WallpapersListActivity.U((WallpapersListActivity) obj, i9);
                break;
            default:
                bi1 bi1Var = (bi1) obj;
                bi1Var.getClass();
                String string = LocaleController.getString(R.string.BackgroundSearchColor);
                StringBuilder e10 = ta.b.e(string, " ");
                String[] strArr = WallpapersListActivity.j0;
                e10.append(LocaleController.getString(strArr[i9], WallpapersListActivity.k0[i9]));
                SpannableString spannableString = new SpannableString(e10.toString());
                spannableString.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.B8, false)), string.length(), spannableString.length(), 33);
                WallpapersListActivity wallpapersListActivity = bi1Var.A;
                wallpapersListActivity.H.setSearchFieldCaption(spannableString);
                wallpapersListActivity.H.setSearchFieldHint(null);
                wallpapersListActivity.H.H("", true);
                bi1Var.n = strArr[i9];
                bi1Var.E("", true);
                break;
        }
    }
}
