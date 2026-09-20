package org.telegram.ui;

import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final /* synthetic */ class a31 implements org.telegram.ui.Components.jl0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ a31(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.ui.Components.jl0
    public final void d(int i10, View view) {
        org.telegram.ui.Components.wq0 wq0Var;
        float f7;
        s4.c1 L;
        int i11 = this.a;
        int i12 = 0;
        int i13 = 1;
        Object obj = this.b;
        switch (i11) {
            case 0:
                e31 e31Var = (e31) obj;
                org.telegram.ui.Components.vl0 vl0Var = e31Var.y;
                org.telegram.ui.Components.kp kpVar = e31Var.b;
                if (kpVar.d.get(i10) != e31Var.K && e31Var.O == null) {
                    e31Var.Q = false;
                    e31Var.K = (org.telegram.ui.Components.lp) kpVar.d.get(i10);
                    kpVar.E(i10);
                    e31Var.h.postDelayed(new org.telegram.ui.Components.kd(e31Var, i10, 26), 100L);
                    while (i12 < vl0Var.getChildCount()) {
                        org.telegram.ui.Components.i21 i21Var = (org.telegram.ui.Components.i21) vl0Var.getChildAt(i12);
                        if (i21Var != view && (wq0Var = i21Var.J) != null) {
                            AndroidUtilities.cancelRunOnUIThread(wq0Var);
                            i21Var.J.run();
                        }
                        i12++;
                    }
                    if (!((org.telegram.ui.Components.lp) kpVar.d.get(i10)).a.a) {
                        ((org.telegram.ui.Components.i21) view).d();
                    }
                    p21 p21Var = e31Var.J;
                    if (p21Var != null) {
                        p21Var.a.d0(i10, e31Var.K.a, true);
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
                o41 o41Var = (o41) obj;
                if (i10 != 1) {
                    if (MessagesController.getGlobalMainSettings().getBoolean("round_video_camera2_enabled", true)) {
                        if (i10 != 2) {
                            if (i10 != 3) {
                                if (i10 != 4) {
                                    if (i10 != 5) {
                                        if (i10 == 8) {
                                            MessagesController.getGlobalMainSettings().edit().putBoolean("round_video_composition", !w7.a6.a()).remove("round_video_outside_effect").remove("round_video_watermark").apply();
                                            o41Var.b.m(i10);
                                            break;
                                        }
                                    } else {
                                        CharSequence[] charSequenceArr = new CharSequence[4];
                                        while (i12 < 4) {
                                            charSequenceArr[i12] = o41.U(o41.c[i12]);
                                            i12++;
                                        }
                                        o41Var.V(R.string.RoundVideoBitrate, charSequenceArr, new ja0(14));
                                        break;
                                    }
                                } else {
                                    o41Var.V(R.string.RoundVideoFrameRate, new CharSequence[]{"30 FPS", "60 FPS"}, new ja0(13));
                                    break;
                                }
                            } else {
                                o41Var.V(R.string.RoundVideoCameraResolution, new CharSequence[]{LocaleController.getString(R.string.RoundVideoCameraResolutionHigh), LocaleController.getString(R.string.RoundVideoCameraResolutionMedium), LocaleController.getString(R.string.RoundVideoCameraResolutionLow)}, new ja0(12));
                                break;
                            }
                        } else {
                            o41Var.V(R.string.RoundVideoOutputResolution, new CharSequence[]{"480p", "360p"}, new ja0(11));
                            break;
                        }
                    }
                } else {
                    MessagesController.getGlobalMainSettings().edit().putBoolean("round_video_camera2_enabled", !MessagesController.getGlobalMainSettings().getBoolean("round_video_camera2_enabled", true)).apply();
                    o41Var.b.l();
                    break;
                }
                break;
            case 4:
                t71 t71Var = (t71) obj;
                org.telegram.ui.Components.w51 G = t71Var.i0.G(i10 - 1);
                if (G != null) {
                    Object obj2 = G.G;
                    if ((obj2 instanceof TLRPC.User) || (obj2 instanceof TLRPC.Chat)) {
                        ((org.telegram.ui.Cells.j6) view).s(true, true);
                        t71Var.a0 = (TLObject) G.G;
                        t71Var.U(true);
                        t71Var.i0.N(true);
                        break;
                    }
                }
                break;
            case 5:
                ((w71) obj).Q(i10, view);
                break;
            case 6:
                SessionsActivity.U((SessionsActivity) obj, i10);
                break;
            case 7:
                bb1 bb1Var = (bb1) obj;
                ArrayList arrayList = bb1Var.N;
                ArrayList arrayList2 = bb1Var.O;
                ga1 ga1Var = bb1Var.X;
                int i14 = ga1Var.I;
                if (i10 >= i14 && i10 <= ga1Var.J) {
                    ya1 ya1Var = (ya1) bb1Var.v0.get(i10 - i14);
                    mj0 mj0Var = new mj0(ya1Var.b, true, bb1Var.b);
                    mj0Var.e0 = ya1Var;
                    bb1Var.presentFragment(mj0Var);
                    break;
                } else {
                    int i15 = ga1Var.U;
                    if (i10 >= i15 && i10 <= ga1Var.V) {
                        ((ua1) bb1Var.Q.get(i10 - i15)).b(bb1Var);
                        break;
                    } else {
                        int i16 = ga1Var.R;
                        if (i10 >= i16 && i10 <= ga1Var.S) {
                            ((ua1) arrayList2.get(i10 - i16)).b(bb1Var);
                            break;
                        } else {
                            int i17 = ga1Var.X;
                            if (i10 >= i17 && i10 <= ga1Var.Y) {
                                ((ua1) bb1Var.P.get(i10 - i17)).b(bb1Var);
                                break;
                            } else if (i10 == ga1Var.Z) {
                                int size = arrayList.size() - arrayList2.size();
                                int i18 = bb1Var.X.Z;
                                arrayList2.clear();
                                arrayList2.addAll(arrayList);
                                ga1 ga1Var2 = bb1Var.X;
                                if (ga1Var2 != null) {
                                    ga1Var2.E();
                                    bb1Var.S.setItemAnimator(bb1Var.Y);
                                    bb1Var.X.s(i18 + 1, size);
                                    bb1Var.X.u(i18);
                                    break;
                                }
                            }
                        }
                    }
                }
                break;
            case 8:
                xd1 xd1Var = (xd1) obj;
                boolean z10 = xd1Var.W0 != null;
                xd1Var.Z0(i10);
                if (z10 == (xd1Var.W0 == null)) {
                    xd1Var.M0();
                    xd1Var.l1();
                }
                xd1Var.n1();
                xd1Var.J0[1].a(xd1Var.W0 != null, true);
                xd1Var.P0.g1();
                int left = view.getLeft();
                int right = view.getRight();
                int dp = AndroidUtilities.dp(52.0f);
                int i19 = left - dp;
                if (i19 >= 0) {
                    int i20 = right + dp;
                    if (i20 > xd1Var.P0.getMeasuredWidth()) {
                        fc1 fc1Var = xd1Var.P0;
                        fc1Var.w0(i20 - fc1Var.getMeasuredWidth(), 0, null);
                        break;
                    }
                } else {
                    xd1Var.P0.w0(i19, 0, null);
                    break;
                }
                break;
            case 9:
                ue1 ue1Var = (ue1) obj;
                int i21 = ue1Var.H;
                HashSet hashSet = ue1Var.w;
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
                    if (hashSet.isEmpty() && ue1Var.v != -1 && ue1Var.n.getVisibility() == 0) {
                        ue1Var.v = -1;
                        ue1Var.n.animate().setListener(null).cancel();
                        ue1Var.n.animate().translationY(i21).setDuration(200L).setListener(new qe1(ue1Var, i12)).start();
                        org.telegram.ui.Components.vl0 vl0Var2 = ue1Var.s.getVisibility() == 0 ? ue1Var.b : ue1Var.a;
                        vl0Var2.e1(false);
                        int N0 = ((s4.c0) vl0Var2.getLayoutManager()).N0();
                        f7 = 12.0f;
                        if ((N0 == vl0Var2.getAdapter().h() - 1 || (N0 == vl0Var2.getAdapter().h() - 2 && vl0Var2 == ue1Var.a)) && (L = vl0Var2.L(N0)) != null) {
                            int bottom = L.a.getBottom();
                            if (N0 == ue1Var.d.c - 2) {
                                bottom += AndroidUtilities.dp(12.0f);
                            }
                            if (vl0Var2.getMeasuredHeight() - bottom <= i21) {
                                vl0Var2.setTranslationY(-(vl0Var2.getMeasuredHeight() - bottom));
                                vl0Var2.animate().translationY(0.0f).setDuration(200L).start();
                            }
                        }
                        ue1Var.a.setPadding(0, 0, 0, 0);
                        ue1Var.b.setPadding(0, 0, 0, 0);
                    } else {
                        f7 = 12.0f;
                    }
                    if (!hashSet.isEmpty() && ue1Var.n.getVisibility() == 8 && ue1Var.v != 1) {
                        ue1Var.v = 1;
                        ue1Var.n.setVisibility(0);
                        ue1Var.n.setTranslationY(i21);
                        ue1Var.n.animate().setListener(null).cancel();
                        ue1Var.n.animate().translationY(0.0f).setDuration(200L).setListener(new qe1(ue1Var, i13)).start();
                        ue1Var.a.setPadding(0, 0, 0, i21 - AndroidUtilities.dp(f7));
                        ue1Var.b.setPadding(0, 0, 0, i21);
                    }
                    if (!hashSet.isEmpty()) {
                        ue1Var.c.setText(LocaleController.formatString("LeaveChats", R.string.LeaveChats, LocaleController.formatPluralString("Chats", hashSet.size(), new Object[0])));
                    }
                    if (!hashSet.isEmpty()) {
                        org.telegram.ui.Components.vl0 vl0Var3 = ue1Var.s.getVisibility() == 0 ? ue1Var.b : ue1Var.a;
                        int height = vl0Var3.getHeight() - view.getBottom();
                        if (height < i21) {
                            vl0Var3.w0(0, i21 - height, null);
                            break;
                        }
                    }
                }
                break;
            case 10:
                fg1.V((fg1) obj, view);
                break;
            case 11:
                fg1 fg1Var = ((bg1) obj).u0;
                if (!(view instanceof org.telegram.ui.Cells.ta)) {
                    if (view instanceof cg1) {
                        cg1 cg1Var = (cg1) view;
                        ng.d.m(fg1Var, fg1Var.a, cg1Var.N, cg1Var.getMessageId());
                        break;
                    }
                } else {
                    ng.d.m(fg1Var, fg1Var.a, ((org.telegram.ui.Cells.ta) view).getTopic(), 0);
                    break;
                }
                break;
            case 12:
                TwoStepVerificationActivity.c0((TwoStepVerificationActivity) obj, i10);
                break;
            case 13:
                WallpapersListActivity.V((WallpapersListActivity) obj, i10);
                break;
            default:
                ij1 ij1Var = (ij1) obj;
                ij1Var.getClass();
                String string = LocaleController.getString(R.string.BackgroundSearchColor);
                StringBuilder h = v7.j0.h(string, " ");
                String[] strArr = WallpapersListActivity.l0;
                h.append(LocaleController.getString(strArr[i10], WallpapersListActivity.m0[i10]));
                SpannableString spannableString = new SpannableString(h.toString());
                spannableString.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.B8, false)), string.length(), spannableString.length(), 33);
                WallpapersListActivity wallpapersListActivity = ij1Var.E;
                wallpapersListActivity.J.setSearchFieldCaption(spannableString);
                wallpapersListActivity.J.setSearchFieldHint(null);
                wallpapersListActivity.J.H("", true);
                ij1Var.n = strArr[i10];
                ij1Var.E("", true);
                break;
        }
    }
}
