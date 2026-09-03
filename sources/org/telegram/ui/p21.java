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

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class p21 implements org.telegram.ui.Components.hl0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ p21(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.ui.Components.hl0
    public final void d(int i10, View view) {
        org.telegram.ui.Components.nq0 nq0Var;
        f2.l1 K;
        int i11 = this.a;
        int i12 = 0;
        int i13 = 1;
        Object obj = this.b;
        switch (i11) {
            case 0:
                t21 t21Var = (t21) obj;
                org.telegram.ui.Components.rl0 rl0Var = t21Var.y;
                org.telegram.ui.Components.hp hpVar = t21Var.b;
                if (hpVar.d.get(i10) != t21Var.H && t21Var.L == null) {
                    t21Var.N = false;
                    t21Var.H = (org.telegram.ui.Components.ip) hpVar.d.get(i10);
                    hpVar.E(i10);
                    t21Var.h.postDelayed(new org.telegram.ui.Components.dw(t21Var, i10, 23), 100L);
                    while (i12 < rl0Var.getChildCount()) {
                        org.telegram.ui.Components.w11 w11Var = (org.telegram.ui.Components.w11) rl0Var.getChildAt(i12);
                        if (w11Var != view && (nq0Var = w11Var.G) != null) {
                            AndroidUtilities.cancelRunOnUIThread(nq0Var);
                            w11Var.G.run();
                        }
                        i12++;
                    }
                    if (!((org.telegram.ui.Components.ip) hpVar.d.get(i10)).a.a) {
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
                i71 i71Var = (i71) obj;
                org.telegram.ui.Components.i51 G = i71Var.f0.G(i10 - 1);
                if (G != null) {
                    Object obj2 = G.G;
                    if ((obj2 instanceof TLRPC.User) || (obj2 instanceof TLRPC.Chat)) {
                        ((org.telegram.ui.Cells.g6) view).s(true, true);
                        i71Var.X = (TLObject) G.G;
                        i71Var.U(true);
                        i71Var.f0.N(true);
                        break;
                    }
                }
                break;
            case 4:
                ((l71) obj).Q(i10, view);
                break;
            case 5:
                SessionsActivity.U((SessionsActivity) obj, i10);
                break;
            case 6:
                oa1 oa1Var = (oa1) obj;
                ArrayList arrayList = oa1Var.K;
                ArrayList arrayList2 = oa1Var.L;
                t91 t91Var = oa1Var.U;
                int i14 = t91Var.F;
                if (i10 >= i14 && i10 <= t91Var.G) {
                    la1 la1Var = (la1) oa1Var.s0.get(i10 - i14);
                    cj0 cj0Var = new cj0(la1Var.b, true, oa1Var.b);
                    cj0Var.b0 = la1Var;
                    oa1Var.presentFragment(cj0Var);
                    break;
                } else {
                    int i15 = t91Var.R;
                    if (i10 >= i15 && i10 <= t91Var.S) {
                        ((ha1) oa1Var.N.get(i10 - i15)).b(oa1Var);
                        break;
                    } else {
                        int i16 = t91Var.O;
                        if (i10 >= i16 && i10 <= t91Var.P) {
                            ((ha1) arrayList2.get(i10 - i16)).b(oa1Var);
                            break;
                        } else {
                            int i17 = t91Var.U;
                            if (i10 >= i17 && i10 <= t91Var.V) {
                                ((ha1) oa1Var.M.get(i10 - i17)).b(oa1Var);
                                break;
                            } else if (i10 == t91Var.W) {
                                int size = arrayList.size() - arrayList2.size();
                                int i18 = oa1Var.U.W;
                                arrayList2.clear();
                                arrayList2.addAll(arrayList);
                                t91 t91Var2 = oa1Var.U;
                                if (t91Var2 != null) {
                                    t91Var2.E();
                                    oa1Var.P.setItemAnimator(oa1Var.V);
                                    oa1Var.U.s(i18 + 1, size);
                                    oa1Var.U.u(i18);
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
                        rb1 rb1Var = jd1Var.M0;
                        rb1Var.v0(i20 - rb1Var.getMeasuredWidth(), 0, null);
                        break;
                    }
                } else {
                    jd1Var.M0.v0(i19, 0, null);
                    break;
                }
                break;
            case 8:
                ge1 ge1Var = (ge1) obj;
                int i21 = ge1Var.E;
                HashSet hashSet = ge1Var.w;
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
                    if (hashSet.isEmpty() && ge1Var.v != -1 && ge1Var.n.getVisibility() == 0) {
                        ge1Var.v = -1;
                        ge1Var.n.animate().setListener(null).cancel();
                        ge1Var.n.animate().translationY(i21).setDuration(200L).setListener(new ce1(ge1Var, i12)).start();
                        org.telegram.ui.Components.rl0 rl0Var2 = ge1Var.s.getVisibility() == 0 ? ge1Var.b : ge1Var.a;
                        rl0Var2.c1(false);
                        int N0 = ((f2.i0) rl0Var2.getLayoutManager()).N0();
                        if ((N0 == rl0Var2.getAdapter().h() - 1 || (N0 == rl0Var2.getAdapter().h() - 2 && rl0Var2 == ge1Var.a)) && (K = rl0Var2.K(N0)) != null) {
                            int bottom = K.a.getBottom();
                            if (N0 == ge1Var.d.c - 2) {
                                bottom += AndroidUtilities.dp(12.0f);
                            }
                            if (rl0Var2.getMeasuredHeight() - bottom <= i21) {
                                rl0Var2.setTranslationY(-(rl0Var2.getMeasuredHeight() - bottom));
                                rl0Var2.animate().translationY(0.0f).setDuration(200L).start();
                            }
                        }
                        ge1Var.a.setPadding(0, 0, 0, 0);
                        ge1Var.b.setPadding(0, 0, 0, 0);
                    }
                    if (!hashSet.isEmpty() && ge1Var.n.getVisibility() == 8 && ge1Var.v != 1) {
                        ge1Var.v = 1;
                        ge1Var.n.setVisibility(0);
                        ge1Var.n.setTranslationY(i21);
                        ge1Var.n.animate().setListener(null).cancel();
                        ge1Var.n.animate().translationY(0.0f).setDuration(200L).setListener(new ce1(ge1Var, i13)).start();
                        ge1Var.a.setPadding(0, 0, 0, i21 - AndroidUtilities.dp(12.0f));
                        ge1Var.b.setPadding(0, 0, 0, i21);
                    }
                    if (!hashSet.isEmpty()) {
                        ge1Var.c.setText(LocaleController.formatString("LeaveChats", R.string.LeaveChats, LocaleController.formatPluralString("Chats", hashSet.size(), new Object[0])));
                    }
                    if (!hashSet.isEmpty()) {
                        org.telegram.ui.Components.rl0 rl0Var3 = ge1Var.s.getVisibility() == 0 ? ge1Var.b : ge1Var.a;
                        int height = rl0Var3.getHeight() - view.getBottom();
                        if (height < i21) {
                            rl0Var3.v0(0, i21 - height, null);
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
                if (!(view instanceof org.telegram.ui.Cells.na)) {
                    if (view instanceof pf1) {
                        pf1 pf1Var = (pf1) view;
                        ag.f.m(sf1Var, sf1Var.a, pf1Var.K, pf1Var.getMessageId());
                        break;
                    }
                } else {
                    ag.f.m(sf1Var, sf1Var.a, ((org.telegram.ui.Cells.na) view).getTopic(), 0);
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
                xi1 xi1Var = (xi1) obj;
                xi1Var.getClass();
                String string = LocaleController.getString(R.string.BackgroundSearchColor);
                StringBuilder f10 = vh.w2.f(string, " ");
                String[] strArr = WallpapersListActivity.k0;
                f10.append(LocaleController.getString(strArr[i10], WallpapersListActivity.l0[i10]));
                SpannableString spannableString = new SpannableString(f10.toString());
                spannableString.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.B8, false)), string.length(), spannableString.length(), 33);
                WallpapersListActivity wallpapersListActivity = xi1Var.B;
                wallpapersListActivity.I.setSearchFieldCaption(spannableString);
                wallpapersListActivity.I.setSearchFieldHint(null);
                wallpapersListActivity.I.H("", true);
                xi1Var.n = strArr[i10];
                xi1Var.E("", true);
                break;
        }
    }
}
