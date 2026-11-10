package org.telegram.ui;

import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ay0 implements org.telegram.ui.Components.bj0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ay0(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // org.telegram.ui.Components.bj0
    public final void c(int i7, View view) {
        v4.d1 K;
        int i10 = this.a;
        int i11 = 0;
        int i12 = 1;
        Object obj = this.b;
        switch (i10) {
            case 0:
                fy0.Z((fy0) obj, view);
                break;
            case 1:
                uy0.Z((uy0) obj, view, i7);
                break;
            case 2:
                bz0.a0((bz0) obj, i7);
                break;
            case 3:
                d21 d21Var = (d21) obj;
                org.telegram.ui.Components.x31 G = d21Var.d2.G(i7 - 1);
                if (G != null) {
                    Object obj2 = G.G;
                    if ((obj2 instanceof TLRPC.User) || (obj2 instanceof TLRPC.Chat)) {
                        ((org.telegram.ui.Cells.g6) view).w(true, true);
                        d21Var.V1 = (TLObject) G.G;
                        d21Var.f1(true);
                        d21Var.d2.O(true);
                        break;
                    }
                }
                break;
            case 4:
                ((f21) obj).e1(i7, view);
                break;
            case 5:
                SessionsActivity.Z((SessionsActivity) obj, i7);
                break;
            case 6:
                e51 e51Var = (e51) obj;
                ArrayList arrayList = e51Var.N;
                ArrayList arrayList2 = e51Var.O;
                i41 i41Var = e51Var.W;
                int i13 = i41Var.I;
                if (i7 >= i13 && i7 <= i41Var.J) {
                    b51 b51Var = (b51) e51Var.y0.get(i7 - i13);
                    mg0 mg0Var = new mg0(e51Var.b, b51Var.b, true);
                    mg0Var.e0 = b51Var;
                    e51Var.presentFragment(mg0Var);
                    break;
                } else {
                    int i14 = i41Var.U;
                    if (i7 >= i14 && i7 <= i41Var.V) {
                        ((x41) e51Var.Q.get(i7 - i14)).b(e51Var);
                        break;
                    } else {
                        int i15 = i41Var.R;
                        if (i7 >= i15 && i7 <= i41Var.S) {
                            ((x41) arrayList2.get(i7 - i15)).b(e51Var);
                            break;
                        } else {
                            int i16 = i41Var.X;
                            if (i7 >= i16 && i7 <= i41Var.Y) {
                                ((x41) e51Var.P.get(i7 - i16)).b(e51Var);
                                break;
                            } else if (i7 == i41Var.Z) {
                                int size = arrayList.size() - arrayList2.size();
                                int i17 = e51Var.W.Z;
                                arrayList2.clear();
                                arrayList2.addAll(arrayList);
                                i41 i41Var2 = e51Var.W;
                                if (i41Var2 != null) {
                                    i41Var2.E();
                                    e51Var.S.setItemAnimator(e51Var.X);
                                    e51Var.W.o(i17 + 1, size);
                                    e51Var.W.s(i17);
                                    break;
                                }
                            }
                        }
                    }
                }
                break;
            case 7:
                x71 x71Var = (x71) obj;
                boolean z9 = x71Var.X0 != null;
                x71Var.e1(i7);
                if (z9 == (x71Var.X0 == null)) {
                    x71Var.Q0();
                    x71Var.q1();
                }
                x71Var.s1();
                x71Var.K0[1].a(x71Var.X0 != null, true);
                x71Var.Q0.g1();
                int left = view.getLeft();
                int right = view.getRight();
                int L = org.telegram.messenger.g0.L(52.0f);
                int i18 = left - L;
                if (i18 >= 0) {
                    int i19 = right + L;
                    if (i19 > x71Var.Q0.getMeasuredWidth()) {
                        g61 g61Var = x71Var.Q0;
                        g61Var.w0(i19 - g61Var.getMeasuredWidth(), 0, null);
                        break;
                    }
                } else {
                    x71Var.Q0.w0(i18, 0, null);
                    break;
                }
                break;
            case 8:
                p81 p81Var = (p81) obj;
                int i20 = p81Var.H;
                HashSet hashSet = p81Var.x;
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
                    if (hashSet.isEmpty() && p81Var.w != -1 && p81Var.n.getVisibility() == 0) {
                        p81Var.w = -1;
                        p81Var.n.animate().setListener(null).cancel();
                        p81Var.n.animate().translationY(i20).setDuration(200L).setListener(new l81(p81Var, i11)).start();
                        org.telegram.ui.Components.pj0 pj0Var = p81Var.s.getVisibility() == 0 ? p81Var.b : p81Var.a;
                        pj0Var.d1(false);
                        int N0 = ((v4.b0) pj0Var.getLayoutManager()).N0();
                        if ((N0 == pj0Var.getAdapter().b() - 1 || (N0 == pj0Var.getAdapter().b() - 2 && pj0Var == p81Var.a)) && (K = pj0Var.K(N0)) != null) {
                            int bottom = K.a.getBottom();
                            if (N0 == p81Var.d.c - 2) {
                                bottom += org.telegram.messenger.g0.L(12.0f);
                            }
                            if (pj0Var.getMeasuredHeight() - bottom <= i20) {
                                pj0Var.setTranslationY(-(pj0Var.getMeasuredHeight() - bottom));
                                pj0Var.animate().translationY(0.0f).setDuration(200L).start();
                            }
                        }
                        p81Var.a.setPadding(0, 0, 0, 0);
                        p81Var.b.setPadding(0, 0, 0, 0);
                    }
                    if (!hashSet.isEmpty() && p81Var.n.getVisibility() == 8 && p81Var.w != 1) {
                        p81Var.w = 1;
                        p81Var.n.setVisibility(0);
                        p81Var.n.setTranslationY(i20);
                        p81Var.n.animate().setListener(null).cancel();
                        p81Var.n.animate().translationY(0.0f).setDuration(200L).setListener(new l81(p81Var, i12)).start();
                        p81Var.a.setPadding(0, 0, 0, i20 - org.telegram.messenger.g0.L(12.0f));
                        p81Var.b.setPadding(0, 0, 0, i20);
                    }
                    if (!hashSet.isEmpty()) {
                        p81Var.c.setText(org.telegram.messenger.id.a0("LeaveChats", null, 2131748999, org.telegram.messenger.id.G(hashSet.size(), "Chats", new Object[0])));
                    }
                    if (!hashSet.isEmpty()) {
                        org.telegram.ui.Components.pj0 pj0Var2 = p81Var.s.getVisibility() == 0 ? p81Var.b : p81Var.a;
                        int height = pj0Var2.getHeight() - view.getBottom();
                        if (height < i20) {
                            pj0Var2.w0(0, i20 - height, null);
                            break;
                        }
                    }
                }
                break;
            case 9:
                z91.a0((z91) obj, view);
                break;
            case 10:
                z91 z91Var = ((v91) obj).v0;
                if (!(view instanceof org.telegram.ui.Cells.ja)) {
                    if (view instanceof w91) {
                        w91 w91Var = (w91) view;
                        qg.d.m(z91Var, z91Var.a, w91Var.N, w91Var.getMessageId());
                        break;
                    }
                } else {
                    qg.d.m(z91Var, z91Var.a, ((org.telegram.ui.Cells.ja) view).getTopic(), 0);
                    break;
                }
                break;
            case 11:
                TwoStepVerificationActivity.h0((TwoStepVerificationActivity) obj, i7);
                break;
            case 12:
                WallpapersListActivity.Z((WallpapersListActivity) obj, i7);
                break;
            default:
                wc1 wc1Var = (wc1) obj;
                String M0 = org.telegram.messenger.id.M0(2131753738, null);
                StringBuilder j3 = rf.b.j(M0, " ");
                String[] strArr = WallpapersListActivity.j0;
                SpannableString spannableString = new SpannableString(jg.g.l(WallpapersListActivity.k0[i7], strArr[i7], j3));
                spannableString.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.B8, false)), M0.length(), spannableString.length(), 33);
                WallpapersListActivity wallpapersListActivity = wc1Var.E;
                wallpapersListActivity.J.setSearchFieldCaption(spannableString);
                wallpapersListActivity.J.setSearchFieldHint(null);
                wallpapersListActivity.J.P("", true);
                wc1Var.n = strArr[i7];
                wc1Var.E("", true);
                break;
        }
    }
}
