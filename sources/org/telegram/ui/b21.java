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

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class b21 implements org.telegram.ui.Components.pk0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ b21(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.ui.Components.pk0
    public final void a(int i10, View view) {
        f2.o1 K;
        int i11 = this.a;
        int i12 = 0;
        int i13 = 1;
        Object obj = this.b;
        switch (i11) {
            case 0:
                g21.U((g21) obj, view);
                break;
            case 1:
                a31.U((a31) obj, view, i10);
                break;
            case 2:
                k61 k61Var = (k61) obj;
                org.telegram.ui.Components.n41 G = k61Var.e0.G(i10 - 1);
                if (G != null) {
                    Object obj2 = G.G;
                    if ((obj2 instanceof TLRPC.User) || (obj2 instanceof TLRPC.Chat)) {
                        ((org.telegram.ui.Cells.e6) view).t(true, true);
                        k61Var.W = (TLObject) G.G;
                        k61Var.U(true);
                        k61Var.e0.N(true);
                        break;
                    }
                }
                break;
            case 3:
                ((n61) obj).Q(i10, view);
                break;
            case 4:
                SessionsActivity.U((SessionsActivity) obj, i10);
                break;
            case 5:
                q91 q91Var = (q91) obj;
                ArrayList arrayList = q91Var.J;
                ArrayList arrayList2 = q91Var.K;
                v81 v81Var = q91Var.T;
                int i14 = v81Var.E;
                if (i10 >= i14 && i10 <= v81Var.F) {
                    n91 n91Var = (n91) q91Var.r0.get(i10 - i14);
                    vi0 vi0Var = new vi0(n91Var.b, true, q91Var.b);
                    vi0Var.a0 = n91Var;
                    q91Var.presentFragment(vi0Var);
                    break;
                } else {
                    int i15 = v81Var.Q;
                    if (i10 >= i15 && i10 <= v81Var.R) {
                        ((j91) q91Var.M.get(i10 - i15)).b(q91Var);
                        break;
                    } else {
                        int i16 = v81Var.N;
                        if (i10 >= i16 && i10 <= v81Var.O) {
                            ((j91) arrayList2.get(i10 - i16)).b(q91Var);
                            break;
                        } else {
                            int i17 = v81Var.T;
                            if (i10 >= i17 && i10 <= v81Var.U) {
                                ((j91) q91Var.L.get(i10 - i17)).b(q91Var);
                                break;
                            } else if (i10 == v81Var.V) {
                                int size = arrayList.size() - arrayList2.size();
                                int i18 = q91Var.T.V;
                                arrayList2.clear();
                                arrayList2.addAll(arrayList);
                                v81 v81Var2 = q91Var.T;
                                if (v81Var2 != null) {
                                    v81Var2.E();
                                    q91Var.O.setItemAnimator(q91Var.U);
                                    q91Var.T.s(i18 + 1, size);
                                    q91Var.T.u(i18);
                                    break;
                                }
                            }
                        }
                    }
                }
                break;
            case 6:
                nc1 nc1Var = (nc1) obj;
                boolean z10 = nc1Var.S0 != null;
                nc1Var.Z0(i10);
                if (z10 == (nc1Var.S0 == null)) {
                    nc1Var.M0();
                    nc1Var.l1();
                }
                nc1Var.n1();
                nc1Var.F0[1].a(nc1Var.S0 != null, true);
                nc1Var.L0.f1();
                int left = view.getLeft();
                int right = view.getRight();
                int dp = AndroidUtilities.dp(52.0f);
                int i19 = left - dp;
                if (i19 >= 0) {
                    int i20 = right + dp;
                    if (i20 > nc1Var.L0.getMeasuredWidth()) {
                        ta1 ta1Var = nc1Var.L0;
                        ta1Var.v0(i20 - ta1Var.getMeasuredWidth(), 0, null);
                        break;
                    }
                } else {
                    nc1Var.L0.v0(i19, 0, null);
                    break;
                }
                break;
            case 7:
                ld1 ld1Var = (ld1) obj;
                int i21 = ld1Var.D;
                HashSet hashSet = ld1Var.w;
                if (view instanceof org.telegram.ui.Cells.d4) {
                    org.telegram.ui.Cells.d4 d4Var = (org.telegram.ui.Cells.d4) view;
                    TLRPC.Chat chat = (TLRPC.Chat) d4Var.getObject();
                    if (hashSet.contains(Long.valueOf(chat.id))) {
                        hashSet.remove(Long.valueOf(chat.id));
                        d4Var.c(false, true);
                    } else {
                        hashSet.add(Long.valueOf(chat.id));
                        d4Var.c(true, true);
                    }
                    if (hashSet.isEmpty() && ld1Var.v != -1 && ld1Var.n.getVisibility() == 0) {
                        ld1Var.v = -1;
                        ld1Var.n.animate().setListener(null).cancel();
                        ld1Var.n.animate().translationY(i21).setDuration(200L).setListener(new hd1(ld1Var, i12)).start();
                        org.telegram.ui.Components.zk0 zk0Var = ld1Var.s.getVisibility() == 0 ? ld1Var.b : ld1Var.a;
                        zk0Var.d1(false);
                        int N0 = ((f2.k0) zk0Var.getLayoutManager()).N0();
                        if ((N0 == zk0Var.getAdapter().h() - 1 || (N0 == zk0Var.getAdapter().h() - 2 && zk0Var == ld1Var.a)) && (K = zk0Var.K(N0)) != null) {
                            int bottom = K.a.getBottom();
                            if (N0 == ld1Var.d.c - 2) {
                                bottom += AndroidUtilities.dp(12.0f);
                            }
                            if (zk0Var.getMeasuredHeight() - bottom <= i21) {
                                zk0Var.setTranslationY(-(zk0Var.getMeasuredHeight() - bottom));
                                zk0Var.animate().translationY(0.0f).setDuration(200L).start();
                            }
                        }
                        ld1Var.a.setPadding(0, 0, 0, 0);
                        ld1Var.b.setPadding(0, 0, 0, 0);
                    }
                    if (!hashSet.isEmpty() && ld1Var.n.getVisibility() == 8 && ld1Var.v != 1) {
                        ld1Var.v = 1;
                        ld1Var.n.setVisibility(0);
                        ld1Var.n.setTranslationY(i21);
                        ld1Var.n.animate().setListener(null).cancel();
                        ld1Var.n.animate().translationY(0.0f).setDuration(200L).setListener(new hd1(ld1Var, i13)).start();
                        ld1Var.a.setPadding(0, 0, 0, i21 - AndroidUtilities.dp(12.0f));
                        ld1Var.b.setPadding(0, 0, 0, i21);
                    }
                    if (!hashSet.isEmpty()) {
                        ld1Var.c.setText(LocaleController.formatString("LeaveChats", R.string.LeaveChats, LocaleController.formatPluralString("Chats", hashSet.size(), new Object[0])));
                    }
                    if (!hashSet.isEmpty()) {
                        org.telegram.ui.Components.zk0 zk0Var2 = ld1Var.s.getVisibility() == 0 ? ld1Var.b : ld1Var.a;
                        int height = zk0Var2.getHeight() - view.getBottom();
                        if (height < i21) {
                            zk0Var2.v0(0, i21 - height, null);
                            break;
                        }
                    }
                }
                break;
            case 8:
                we1.V((we1) obj, view);
                break;
            case 9:
                we1 we1Var = ((se1) obj).p0;
                if (!(view instanceof org.telegram.ui.Cells.la)) {
                    if (view instanceof te1) {
                        te1 te1Var = (te1) view;
                        wf.c.m(we1Var, we1Var.a, te1Var.J, te1Var.getMessageId());
                        break;
                    }
                } else {
                    wf.c.m(we1Var, we1Var.a, ((org.telegram.ui.Cells.la) view).getTopic(), 0);
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
                ai1 ai1Var = (ai1) obj;
                ai1Var.getClass();
                String string = LocaleController.getString(R.string.BackgroundSearchColor);
                StringBuilder f10 = s3.c.f(string, " ");
                String[] strArr = WallpapersListActivity.j0;
                f10.append(LocaleController.getString(strArr[i10], WallpapersListActivity.k0[i10]));
                SpannableString spannableString = new SpannableString(f10.toString());
                spannableString.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.B8, false)), string.length(), spannableString.length(), 33);
                WallpapersListActivity wallpapersListActivity = ai1Var.A;
                wallpapersListActivity.H.setSearchFieldCaption(spannableString);
                wallpapersListActivity.H.setSearchFieldHint(null);
                wallpapersListActivity.H.H("", true);
                ai1Var.n = strArr[i10];
                ai1Var.E("", true);
                break;
        }
    }
}
