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

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class o11 implements org.telegram.ui.Components.am0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ o11(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.ui.Components.am0
    public final void c(int i10, View view) {
        s4.e1 K;
        int i11 = this.a;
        int i12 = 0;
        int i13 = 1;
        Object obj = this.b;
        switch (i11) {
            case 0:
                ProxyListActivity.V((ProxyListActivity) obj, view, i10);
                break;
            case 1:
                i21.V((i21) obj, view);
                break;
            case 2:
                a31.V((a31) obj, view, i10);
                break;
            case 3:
                i31.V((i31) obj, i10);
                break;
            case 4:
                p61 p61Var = (p61) obj;
                org.telegram.ui.Components.u61 G = p61Var.i0.G(i10 - 1);
                if (G != null) {
                    Object obj2 = G.G;
                    if ((obj2 instanceof TLRPC.User) || (obj2 instanceof TLRPC.Chat)) {
                        ((org.telegram.ui.Cells.m6) view).r(true, true);
                        p61Var.a0 = (TLObject) G.G;
                        p61Var.U(true);
                        p61Var.i0.O(true);
                        break;
                    }
                }
                break;
            case 5:
                ((s61) obj).Q(i10, view);
                break;
            case 6:
                SessionsActivity.V((SessionsActivity) obj, i10);
                break;
            case 7:
                y91 y91Var = (y91) obj;
                ArrayList arrayList = y91Var.N;
                ArrayList arrayList2 = y91Var.O;
                d91 d91Var = y91Var.W;
                int i14 = d91Var.I;
                if (i10 >= i14 && i10 <= d91Var.J) {
                    v91 v91Var = (v91) y91Var.y0.get(i10 - i14);
                    xi0 xi0Var = new xi0(v91Var.b, true, y91Var.b);
                    xi0Var.e0 = v91Var;
                    y91Var.presentFragment(xi0Var);
                    break;
                } else {
                    int i15 = d91Var.U;
                    if (i10 >= i15 && i10 <= d91Var.V) {
                        ((r91) y91Var.Q.get(i10 - i15)).b(y91Var);
                        break;
                    } else {
                        int i16 = d91Var.R;
                        if (i10 >= i16 && i10 <= d91Var.S) {
                            ((r91) arrayList2.get(i10 - i16)).b(y91Var);
                            break;
                        } else {
                            int i17 = d91Var.X;
                            if (i10 >= i17 && i10 <= d91Var.Y) {
                                ((r91) y91Var.P.get(i10 - i17)).b(y91Var);
                                break;
                            } else if (i10 == d91Var.Z) {
                                int size = arrayList.size() - arrayList2.size();
                                int i18 = y91Var.W.Z;
                                arrayList2.clear();
                                arrayList2.addAll(arrayList);
                                d91 d91Var2 = y91Var.W;
                                if (d91Var2 != null) {
                                    d91Var2.E();
                                    y91Var.S.setItemAnimator(y91Var.X);
                                    y91Var.W.s(i18 + 1, size);
                                    y91Var.W.u(i18);
                                    break;
                                }
                            }
                        }
                    }
                }
                break;
            case 8:
                vc1 vc1Var = (vc1) obj;
                boolean z10 = vc1Var.X0 != null;
                vc1Var.a1(i10);
                if (z10 == (vc1Var.X0 == null)) {
                    vc1Var.M0();
                    vc1Var.m1();
                }
                vc1Var.o1();
                vc1Var.K0[1].a(vc1Var.X0 != null, true);
                vc1Var.Q0.g1();
                int left = view.getLeft();
                int right = view.getRight();
                int dp = AndroidUtilities.dp(52.0f);
                int i19 = left - dp;
                if (i19 >= 0) {
                    int i20 = right + dp;
                    if (i20 > vc1Var.Q0.getMeasuredWidth()) {
                        bb1 bb1Var = vc1Var.Q0;
                        bb1Var.w0(i20 - bb1Var.getMeasuredWidth(), 0, null);
                        break;
                    }
                } else {
                    vc1Var.Q0.w0(i19, 0, null);
                    break;
                }
                break;
            case 9:
                rd1 rd1Var = (rd1) obj;
                int i21 = rd1Var.H;
                HashSet hashSet = rd1Var.w;
                if (view instanceof org.telegram.ui.Cells.k4) {
                    org.telegram.ui.Cells.k4 k4Var = (org.telegram.ui.Cells.k4) view;
                    TLRPC.Chat chat = (TLRPC.Chat) k4Var.getObject();
                    if (hashSet.contains(Long.valueOf(chat.id))) {
                        hashSet.remove(Long.valueOf(chat.id));
                        k4Var.c(false, true);
                    } else {
                        hashSet.add(Long.valueOf(chat.id));
                        k4Var.c(true, true);
                    }
                    if (hashSet.isEmpty() && rd1Var.v != -1 && rd1Var.n.getVisibility() == 0) {
                        rd1Var.v = -1;
                        rd1Var.n.animate().setListener(null).cancel();
                        rd1Var.n.animate().translationY(i21).setDuration(200L).setListener(new nd1(rd1Var, i12)).start();
                        org.telegram.ui.Components.nm0 nm0Var = rd1Var.s.getVisibility() == 0 ? rd1Var.b : rd1Var.a;
                        nm0Var.d1(false);
                        int N0 = ((s4.c0) nm0Var.getLayoutManager()).N0();
                        if ((N0 == nm0Var.getAdapter().h() - 1 || (N0 == nm0Var.getAdapter().h() - 2 && nm0Var == rd1Var.a)) && (K = nm0Var.K(N0)) != null) {
                            int bottom = K.a.getBottom();
                            if (N0 == rd1Var.d.c - 2) {
                                bottom += AndroidUtilities.dp(12.0f);
                            }
                            if (nm0Var.getMeasuredHeight() - bottom <= i21) {
                                nm0Var.setTranslationY(-(nm0Var.getMeasuredHeight() - bottom));
                                nm0Var.animate().translationY(0.0f).setDuration(200L).start();
                            }
                        }
                        rd1Var.a.setPadding(0, 0, 0, 0);
                        rd1Var.b.setPadding(0, 0, 0, 0);
                    }
                    if (!hashSet.isEmpty() && rd1Var.n.getVisibility() == 8 && rd1Var.v != 1) {
                        rd1Var.v = 1;
                        rd1Var.n.setVisibility(0);
                        rd1Var.n.setTranslationY(i21);
                        rd1Var.n.animate().setListener(null).cancel();
                        rd1Var.n.animate().translationY(0.0f).setDuration(200L).setListener(new nd1(rd1Var, i13)).start();
                        rd1Var.a.setPadding(0, 0, 0, i21 - AndroidUtilities.dp(12.0f));
                        rd1Var.b.setPadding(0, 0, 0, i21);
                    }
                    if (!hashSet.isEmpty()) {
                        rd1Var.c.setText(LocaleController.formatString("LeaveChats", R.string.LeaveChats, LocaleController.formatPluralString("Chats", hashSet.size(), new Object[0])));
                    }
                    if (!hashSet.isEmpty()) {
                        org.telegram.ui.Components.nm0 nm0Var2 = rd1Var.s.getVisibility() == 0 ? rd1Var.b : rd1Var.a;
                        int height = nm0Var2.getHeight() - view.getBottom();
                        if (height < i21) {
                            nm0Var2.w0(0, i21 - height, null);
                            break;
                        }
                    }
                }
                break;
            case 10:
                cf1.W((cf1) obj, view);
                break;
            case 11:
                cf1 cf1Var = ((ye1) obj).v0;
                if (!(view instanceof org.telegram.ui.Cells.ua)) {
                    if (view instanceof ze1) {
                        ze1 ze1Var = (ze1) view;
                        pg.d.m(cf1Var, cf1Var.a, ze1Var.N, ze1Var.getMessageId());
                        break;
                    }
                } else {
                    pg.d.m(cf1Var, cf1Var.a, ((org.telegram.ui.Cells.ua) view).getTopic(), 0);
                    break;
                }
                break;
            case 12:
                TwoStepVerificationActivity.d0((TwoStepVerificationActivity) obj, i10);
                break;
            case 13:
                WallpapersListActivity.V((WallpapersListActivity) obj, i10);
                break;
            default:
                gi1 gi1Var = (gi1) obj;
                String string = LocaleController.getString(R.string.BackgroundSearchColor);
                StringBuilder l4 = org.telegram.ui.Components.b10.l(string, " ");
                String[] strArr = WallpapersListActivity.j0;
                l4.append(LocaleController.getString(strArr[i10], WallpapersListActivity.k0[i10]));
                SpannableString spannableString = new SpannableString(l4.toString());
                spannableString.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.B8, false)), string.length(), spannableString.length(), 33);
                WallpapersListActivity wallpapersListActivity = gi1Var.E;
                wallpapersListActivity.J.setSearchFieldCaption(spannableString);
                wallpapersListActivity.J.setSearchFieldHint(null);
                wallpapersListActivity.J.P("", true);
                gi1Var.n = strArr[i10];
                gi1Var.E("", true);
                break;
        }
    }
}
