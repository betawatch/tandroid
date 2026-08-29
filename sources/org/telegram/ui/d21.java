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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class d21 implements org.telegram.ui.Components.zk0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ d21(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.ui.Components.zk0
    public final void c(int i10, View view) {
        f2.n1 K;
        int i11 = this.a;
        int i12 = 0;
        int i13 = 1;
        Object obj = this.b;
        switch (i11) {
            case 0:
                i21.U((i21) obj, view);
                break;
            case 1:
                b31.U((b31) obj, view, i10);
                break;
            case 2:
                n61 n61Var = (n61) obj;
                org.telegram.ui.Components.w41 G = n61Var.e0.G(i10 - 1);
                if (G != null) {
                    Object obj2 = G.G;
                    if ((obj2 instanceof TLRPC.User) || (obj2 instanceof TLRPC.Chat)) {
                        ((org.telegram.ui.Cells.f6) view).s(true, true);
                        n61Var.W = (TLObject) G.G;
                        n61Var.U(true);
                        n61Var.e0.N(true);
                        break;
                    }
                }
                break;
            case 3:
                ((q61) obj).Q(i10, view);
                break;
            case 4:
                SessionsActivity.U((SessionsActivity) obj, i10);
                break;
            case 5:
                t91 t91Var = (t91) obj;
                ArrayList arrayList = t91Var.J;
                ArrayList arrayList2 = t91Var.K;
                y81 y81Var = t91Var.T;
                int i14 = y81Var.E;
                if (i10 >= i14 && i10 <= y81Var.F) {
                    q91 q91Var = (q91) t91Var.r0.get(i10 - i14);
                    si0 si0Var = new si0(q91Var.b, true, t91Var.b);
                    si0Var.a0 = q91Var;
                    t91Var.presentFragment(si0Var);
                    break;
                } else {
                    int i15 = y81Var.Q;
                    if (i10 >= i15 && i10 <= y81Var.R) {
                        ((m91) t91Var.M.get(i10 - i15)).b(t91Var);
                        break;
                    } else {
                        int i16 = y81Var.N;
                        if (i10 >= i16 && i10 <= y81Var.O) {
                            ((m91) arrayList2.get(i10 - i16)).b(t91Var);
                            break;
                        } else {
                            int i17 = y81Var.T;
                            if (i10 >= i17 && i10 <= y81Var.U) {
                                ((m91) t91Var.L.get(i10 - i17)).b(t91Var);
                                break;
                            } else if (i10 == y81Var.V) {
                                int size = arrayList.size() - arrayList2.size();
                                int i18 = t91Var.T.V;
                                arrayList2.clear();
                                arrayList2.addAll(arrayList);
                                y81 y81Var2 = t91Var.T;
                                if (y81Var2 != null) {
                                    y81Var2.E();
                                    t91Var.O.setItemAnimator(t91Var.U);
                                    t91Var.T.s(i18 + 1, size);
                                    t91Var.T.u(i18);
                                    break;
                                }
                            }
                        }
                    }
                }
                break;
            case 6:
                qc1 qc1Var = (qc1) obj;
                boolean z10 = qc1Var.S0 != null;
                qc1Var.Z0(i10);
                if (z10 == (qc1Var.S0 == null)) {
                    qc1Var.M0();
                    qc1Var.l1();
                }
                qc1Var.n1();
                qc1Var.F0[1].a(qc1Var.S0 != null, true);
                qc1Var.L0.f1();
                int left = view.getLeft();
                int right = view.getRight();
                int dp = AndroidUtilities.dp(52.0f);
                int i19 = left - dp;
                if (i19 >= 0) {
                    int i20 = right + dp;
                    if (i20 > qc1Var.L0.getMeasuredWidth()) {
                        wa1 wa1Var = qc1Var.L0;
                        wa1Var.v0(i20 - wa1Var.getMeasuredWidth(), 0, null);
                        break;
                    }
                } else {
                    qc1Var.L0.v0(i19, 0, null);
                    break;
                }
                break;
            case 7:
                md1 md1Var = (md1) obj;
                int i21 = md1Var.D;
                HashSet hashSet = md1Var.w;
                if (view instanceof org.telegram.ui.Cells.e4) {
                    org.telegram.ui.Cells.e4 e4Var = (org.telegram.ui.Cells.e4) view;
                    TLRPC.Chat chat = (TLRPC.Chat) e4Var.getObject();
                    if (hashSet.contains(Long.valueOf(chat.id))) {
                        hashSet.remove(Long.valueOf(chat.id));
                        e4Var.c(false, true);
                    } else {
                        hashSet.add(Long.valueOf(chat.id));
                        e4Var.c(true, true);
                    }
                    if (hashSet.isEmpty() && md1Var.v != -1 && md1Var.n.getVisibility() == 0) {
                        md1Var.v = -1;
                        md1Var.n.animate().setListener(null).cancel();
                        md1Var.n.animate().translationY(i21).setDuration(200L).setListener(new id1(md1Var, i12)).start();
                        org.telegram.ui.Components.jl0 jl0Var = md1Var.s.getVisibility() == 0 ? md1Var.b : md1Var.a;
                        jl0Var.d1(false);
                        int N0 = ((f2.j0) jl0Var.getLayoutManager()).N0();
                        if ((N0 == jl0Var.getAdapter().h() - 1 || (N0 == jl0Var.getAdapter().h() - 2 && jl0Var == md1Var.a)) && (K = jl0Var.K(N0)) != null) {
                            int bottom = K.a.getBottom();
                            if (N0 == md1Var.d.c - 2) {
                                bottom += AndroidUtilities.dp(12.0f);
                            }
                            if (jl0Var.getMeasuredHeight() - bottom <= i21) {
                                jl0Var.setTranslationY(-(jl0Var.getMeasuredHeight() - bottom));
                                jl0Var.animate().translationY(0.0f).setDuration(200L).start();
                            }
                        }
                        md1Var.a.setPadding(0, 0, 0, 0);
                        md1Var.b.setPadding(0, 0, 0, 0);
                    }
                    if (!hashSet.isEmpty() && md1Var.n.getVisibility() == 8 && md1Var.v != 1) {
                        md1Var.v = 1;
                        md1Var.n.setVisibility(0);
                        md1Var.n.setTranslationY(i21);
                        md1Var.n.animate().setListener(null).cancel();
                        md1Var.n.animate().translationY(0.0f).setDuration(200L).setListener(new id1(md1Var, i13)).start();
                        md1Var.a.setPadding(0, 0, 0, i21 - AndroidUtilities.dp(12.0f));
                        md1Var.b.setPadding(0, 0, 0, i21);
                    }
                    if (!hashSet.isEmpty()) {
                        md1Var.c.setText(LocaleController.formatString("LeaveChats", R.string.LeaveChats, LocaleController.formatPluralString("Chats", hashSet.size(), new Object[0])));
                    }
                    if (!hashSet.isEmpty()) {
                        org.telegram.ui.Components.jl0 jl0Var2 = md1Var.s.getVisibility() == 0 ? md1Var.b : md1Var.a;
                        int height = jl0Var2.getHeight() - view.getBottom();
                        if (height < i21) {
                            jl0Var2.v0(0, i21 - height, null);
                            break;
                        }
                    }
                }
                break;
            case 8:
                ze1.V((ze1) obj, view);
                break;
            case 9:
                ze1 ze1Var = ((ve1) obj).p0;
                if (!(view instanceof org.telegram.ui.Cells.ma)) {
                    if (view instanceof we1) {
                        we1 we1Var = (we1) view;
                        yf.d.m(ze1Var, ze1Var.a, we1Var.J, we1Var.getMessageId());
                        break;
                    }
                } else {
                    yf.d.m(ze1Var, ze1Var.a, ((org.telegram.ui.Cells.ma) view).getTopic(), 0);
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
                ci1 ci1Var = (ci1) obj;
                ci1Var.getClass();
                String string = LocaleController.getString(R.string.BackgroundSearchColor);
                StringBuilder f9 = u3.c.f(string, " ");
                String[] strArr = WallpapersListActivity.j0;
                f9.append(LocaleController.getString(strArr[i10], WallpapersListActivity.k0[i10]));
                SpannableString spannableString = new SpannableString(f9.toString());
                spannableString.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.B8, false)), string.length(), spannableString.length(), 33);
                WallpapersListActivity wallpapersListActivity = ci1Var.A;
                wallpapersListActivity.H.setSearchFieldCaption(spannableString);
                wallpapersListActivity.H.setSearchFieldHint(null);
                wallpapersListActivity.H.H("", true);
                ci1Var.n = strArr[i10];
                ci1Var.E("", true);
                break;
        }
    }
}
