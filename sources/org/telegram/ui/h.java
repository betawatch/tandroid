package org.telegram.ui;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Intent;
import android.graphics.Paint;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.Switch;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class h implements org.telegram.ui.Components.bj0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ h(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    private final void a(int i7, View view) {
        st0 st0Var = (st0) this.b;
        int i10 = st0Var.D;
        if (i7 == st0Var.x) {
            org.telegram.ui.ActionBar.u1 u1Var = org.telegram.ui.Components.v4.L(st0Var.getParentActivity(), org.telegram.messenger.id.M0(2131747914, null), org.telegram.messenger.id.M0(2131747915, null), org.telegram.messenger.id.M0(2131751599, null), new qt0(st0Var), null).a;
            u1Var.show();
            u1Var.i();
            return;
        }
        if (i7 != st0Var.f) {
            if (i7 < st0Var.r || i7 >= st0Var.s) {
                return;
            }
            if (i10 != 1) {
                new Bundle();
                throw null;
            }
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", st0Var.getMessagesController().G0.keyAt(i7 - st0Var.r));
            st0Var.presentFragment(new ProfileActivity(bundle, null));
            return;
        }
        if (i10 != 1) {
            Bundle k10 = a8.p0.k("isNeverShare", true);
            if (i10 == 2) {
                k10.putInt("chatAddType", 2);
            }
            w40 w40Var = new w40(k10);
            w40Var.x = new pt0(st0Var);
            st0Var.presentFragment(w40Var);
            return;
        }
        au auVar = new au(null);
        auVar.d = new Paint();
        auVar.f = new zt[2];
        auVar.x = true;
        Bundle bundle2 = new Bundle();
        bundle2.putBoolean("onlySelect", true);
        bundle2.putBoolean("checkCanWrite", false);
        bundle2.putBoolean("resetDelegate", false);
        bundle2.putInt("dialogsType", 9);
        ww wwVar = new ww(bundle2);
        auVar.a = wwVar;
        wwVar.C2 = new xt(auVar);
        wwVar.onFragmentCreate();
        Bundle bundle3 = new Bundle();
        bundle3.putBoolean("onlyUsers", true);
        bundle3.putBoolean("destroyAfterSelect", true);
        bundle3.putBoolean("returnAsResult", true);
        bundle3.putBoolean("disableSections", true);
        bundle3.putBoolean("needFinishFragment", false);
        bundle3.putBoolean("resetDelegate", false);
        bundle3.putBoolean("allowSelf", false);
        ContactsActivity contactsActivity = new ContactsActivity(bundle3);
        auVar.b = contactsActivity;
        contactsActivity.U = new xt(auVar);
        contactsActivity.onFragmentCreate();
        st0Var.presentFragment(auVar);
    }

    @Override // org.telegram.ui.Components.bj0
    public final void c(int i7, View view) {
        TLRPC.InputStickerSet tL_inputStickerSetShortName;
        TLRPC.Chat chat;
        String M0;
        String a02;
        ps psVar;
        yy yyVar;
        org.telegram.ui.Components.hc a03;
        int i10;
        int i11;
        boolean z9;
        boolean z10;
        ws0 ws0Var;
        int i12 = 3;
        int i13 = 4;
        ms msVar = null;
        boolean z11 = false;
        z11 = false;
        z11 = false;
        int i14 = 1;
        switch (this.a) {
            case 0:
                k kVar = (k) this.b;
                ArrayList arrayList = kVar.h;
                if (i7 >= 0 && i7 < arrayList.size()) {
                    int i15 = ((i) arrayList.get(i7)).d;
                    if (i15 == 1) {
                        TLRPC.GlobalPrivacySettings globalPrivacySettings = kVar.d;
                        boolean z12 = !globalPrivacySettings.keep_archived_unmuted;
                        globalPrivacySettings.keep_archived_unmuted = z12;
                        ((org.telegram.ui.Cells.r8) view).setChecked(z12);
                        kVar.c = true;
                        break;
                    } else if (i15 == 4) {
                        TLRPC.GlobalPrivacySettings globalPrivacySettings2 = kVar.d;
                        boolean z13 = !globalPrivacySettings2.keep_archived_folders;
                        globalPrivacySettings2.keep_archived_folders = z13;
                        ((org.telegram.ui.Cells.r8) view).setChecked(z13);
                        kVar.c = true;
                        break;
                    } else if (i15 == 7) {
                        if (!kVar.getUserConfig().q() && !kVar.getMessagesController().Y3 && !kVar.d.archive_and_mute_new_noncontact_peers) {
                            org.telegram.ui.Components.ub ubVar = new org.telegram.ui.Components.ub(kVar.getParentActivity(), kVar.getResourceProvider());
                            org.telegram.ui.Components.w70 w70Var = ubVar.b;
                            w70Var.setText(org.telegram.messenger.g0.S2(org.telegram.messenger.id.M0(2131743869, null), org.telegram.ui.ActionBar.k6.uj, 0, new gq0(kVar, i12), null));
                            w70Var.setSingleLine(false);
                            w70Var.setPadding(0, org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f));
                            ubVar.a.setImageResource(R.drawable.msg_settings_premium);
                            org.telegram.ui.Components.cc.g(kVar, ubVar, 3500).j();
                            int i16 = -kVar.e;
                            kVar.e = i16;
                            org.telegram.messenger.g0.G3(i16, view, null);
                            org.telegram.messenger.p2.D.a();
                            break;
                        } else {
                            TLRPC.GlobalPrivacySettings globalPrivacySettings3 = kVar.d;
                            boolean z14 = !globalPrivacySettings3.archive_and_mute_new_noncontact_peers;
                            globalPrivacySettings3.archive_and_mute_new_noncontact_peers = z14;
                            ((org.telegram.ui.Cells.r8) view).setChecked(z14);
                            kVar.c = true;
                            break;
                        }
                    }
                }
                break;
            case 1:
                o oVar = (o) this.b;
                if (i7 >= oVar.y && i7 < oVar.D && oVar.getParentActivity() != null) {
                    TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) oVar.h.get(i7 - oVar.y);
                    if (stickerSetCovered.set.id != 0) {
                        tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetID();
                        tL_inputStickerSetShortName.id = stickerSetCovered.set.id;
                    } else {
                        tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
                        tL_inputStickerSetShortName.short_name = stickerSetCovered.set.short_name;
                    }
                    TLRPC.InputStickerSet inputStickerSet = tL_inputStickerSetShortName;
                    inputStickerSet.access_hash = stickerSetCovered.set.access_hash;
                    org.telegram.ui.Components.yv0 yv0Var = new org.telegram.ui.Components.yv0(oVar.getParentActivity(), oVar, inputStickerSet, null, null, null);
                    yv0Var.T1 = new m(oVar, view, stickerSetCovered);
                    oVar.showDialog(yv0Var);
                    break;
                }
                break;
            case 2:
                xy0.Z((xy0) this.b, i7);
                break;
            case 3:
                pc pcVar = (pc) this.b;
                ArrayList arrayList2 = pcVar.c;
                e61 e61Var = pcVar.d;
                if (i7 >= 0 && i7 < arrayList2.size()) {
                    org.telegram.ui.Components.uo uoVar = (org.telegram.ui.Components.uo) arrayList2.get(i7);
                    pcVar.a(uoVar.a(), true);
                    if (view.getLeft() < org.telegram.messenger.g0.L(24.0f) + e61Var.getPaddingLeft()) {
                        e61Var.w0(-((org.telegram.messenger.g0.L(48.0f) + e61Var.getPaddingLeft()) - view.getLeft()), 0, null);
                    } else if (view.getWidth() + view.getLeft() > (e61Var.getMeasuredWidth() - e61Var.getPaddingRight()) - org.telegram.messenger.g0.L(24.0f)) {
                        e61Var.w0(org.telegram.messenger.k5.B(48.0f, e61Var.getMeasuredWidth() - e61Var.getPaddingRight(), view.getWidth() + view.getLeft()), 0, null);
                    }
                    org.telegram.messenger.c20 c20Var = pcVar.r;
                    if (c20Var != null) {
                        c20Var.a(uoVar.a());
                        break;
                    }
                }
                break;
            case 4:
                so soVar = (so) this.b;
                boolean z15 = soVar.s;
                if (soVar.getParentActivity() != null) {
                    v4.g0 adapter = soVar.b.getAdapter();
                    ro roVar = soVar.e;
                    if (adapter == roVar) {
                        chat = (TLRPC.Chat) roVar.d.get(i7);
                    } else {
                        int i17 = soVar.G;
                        chat = (i7 < i17 || i7 >= soVar.H) ? null : (TLRPC.Chat) soVar.w.get(i7 - i17);
                    }
                    if (chat != null) {
                        if (!z15 || soVar.h.linked_chat_id != 0) {
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", chat.id);
                            soVar.presentFragment(new an(bundle));
                            break;
                        } else {
                            soVar.f0(chat, true);
                            break;
                        }
                    } else if (i7 == soVar.F) {
                        if (z15 && soVar.h.linked_chat_id == 0) {
                            Bundle bundle2 = new Bundle();
                            bundle2.putLongArray("result", new long[]{soVar.getUserConfig().e()});
                            bundle2.putInt("chatType", 4);
                            TLRPC.Chat chat2 = soVar.f;
                            if (chat2 != null) {
                                bundle2.putString("title", org.telegram.messenger.id.a0("GroupCreateDiscussionDefaultName", null, 2131749455, chat2.title));
                            }
                            d50 d50Var = new d50(bundle2);
                            d50Var.Y = new ko(soVar);
                            soVar.presentFragment(d50Var);
                            break;
                        } else if (!soVar.w.isEmpty()) {
                            TLRPC.Chat chat3 = (TLRPC.Chat) soVar.w.get(0);
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(soVar.getParentActivity());
                            if (z15) {
                                M0 = org.telegram.messenger.id.M0(2131751372, null);
                                a02 = org.telegram.messenger.id.a0("DiscussionUnlinkChannelAlert", null, 2131751373, chat3.title);
                            } else {
                                M0 = org.telegram.messenger.id.M0(2131751374, null);
                                a02 = org.telegram.messenger.id.a0("DiscussionUnlinkGroupAlert", null, 2131751371, chat3.title);
                            }
                            alertDialog$Builder.a.R = M0;
                            alertDialog$Builder.a.T = org.telegram.messenger.g0.X2(a02);
                            alertDialog$Builder.k(org.telegram.messenger.id.M0(2131751375, null), new w0(soVar, 25));
                            alertDialog$Builder.h(org.telegram.messenger.id.M0(2131752589, null), null);
                            org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
                            soVar.showDialog(u1Var);
                            TextView textView = (TextView) u1Var.d(-1);
                            if (textView != null) {
                                org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.q7, null);
                                break;
                            }
                        }
                    }
                }
                break;
            case 5:
                zo zoVar = (zo) this.b;
                ArrayList arrayList3 = zoVar.n;
                if (i7 > 2) {
                    org.telegram.ui.Cells.x xVar = (org.telegram.ui.Cells.x) view;
                    TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) arrayList3.get(i7 - 3);
                    boolean contains = zoVar.d.contains(tL_availableReaction.reaction);
                    boolean z16 = !contains;
                    if (contains) {
                        zoVar.d.remove(tL_availableReaction.reaction);
                        if (zoVar.d.isEmpty()) {
                            yo yoVar = zoVar.h;
                            if (yoVar != null) {
                                yoVar.p(2, arrayList3.size() + 1);
                            }
                            zoVar.a0(2, true);
                        }
                    } else {
                        zoVar.d.add(tL_availableReaction.reaction);
                    }
                    Switch r22 = xVar.c;
                    if (r22 != null) {
                        r22.c(z16, true);
                    }
                    org.telegram.ui.Components.wo woVar = xVar.d;
                    if (woVar != null) {
                        woVar.a(z16, true);
                        break;
                    }
                }
                break;
            case 6:
                gs gsVar = (gs) this.b;
                TLRPC.StickerSetCovered stickerSetCovered2 = ((js) view).d;
                ks ksVar = gsVar.a;
                ch.b0 reactionsWindow = ksVar.P.getReactionsWindow();
                if (reactionsWindow != null && !reactionsWindow.q) {
                    reactionsWindow.d();
                }
                if (stickerSetCovered2 instanceof TLRPC.TL_stickerSetNoCovered) {
                    org.telegram.ui.Components.dw0.c(null, ksVar.c0, ksVar.z.getContext(), new a5(gsVar, 9));
                    break;
                } else {
                    is isVar = ksVar.l;
                    if (isVar != null) {
                        isVar.w(stickerSetCovered2.set, TextUtils.join("", ksVar.o));
                    }
                    ksVar.o();
                    break;
                }
                break;
            case 7:
                qs qsVar = (qs) this.b;
                if (qsVar.f && qsVar.e) {
                    org.telegram.ui.Components.oj ojVar = qsVar.d;
                    ArrayList arrayList4 = ojVar.e;
                    if (arrayList4 != null && i7 >= 0 && i7 < arrayList4.size()) {
                        msVar = (ms) ojVar.e.get(i7);
                    }
                } else {
                    int S = qsVar.c.S(i7);
                    int Q = qsVar.c.Q(i7);
                    if (Q >= 0 && S >= 0) {
                        msVar = qsVar.c.O(S, Q);
                    }
                }
                if (i7 >= 0) {
                    qsVar.finishFragment();
                    if (msVar != null && (psVar = qsVar.r) != null) {
                        psVar.b(msVar);
                        break;
                    }
                }
                break;
            case 8:
                gt gtVar = (gt) this.b;
                ArrayList arrayList5 = gtVar.j3;
                kt ktVar = gtVar.v3;
                if (!(view instanceof at) || i7 < 0 || i7 >= arrayList5.size()) {
                    if (view instanceof org.telegram.ui.Cells.m8) {
                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(ktVar.getParentActivity());
                        alertDialog$Builder2.a.R = org.telegram.messenger.id.M0(2131746092, null);
                        alertDialog$Builder2.a.T = org.telegram.messenger.id.M0(2131746093, null);
                        alertDialog$Builder2.k(org.telegram.messenger.id.M0(2131746121, null), new dt(gtVar));
                        alertDialog$Builder2.h(org.telegram.messenger.id.M0(2131752589, null), null);
                        org.telegram.ui.ActionBar.u1 u1Var2 = alertDialog$Builder2.a;
                        ktVar.showDialog(u1Var2);
                        TextView textView2 = (TextView) u1Var2.d(-1);
                        if (textView2 != null) {
                            org.telegram.ui.ActionBar.r6.V(textView2, org.telegram.ui.ActionBar.k6.q7, null);
                            break;
                        }
                    }
                } else {
                    ct ctVar = (ct) arrayList5.get(i7);
                    if (ctVar != null) {
                        int i18 = ctVar.h;
                        if (i18 >= 0) {
                            gtVar.p3[i18] = !r3[i18];
                            gtVar.D1(true);
                            break;
                        } else if (i18 == -2) {
                            ktVar.presentFragment(new DataAutoDownloadActivity(gtVar.f3 - 1));
                            break;
                        }
                    }
                }
                break;
            case 9:
                gy.a0((gy) this.b, view, i7);
                break;
            case 10:
                gz gzVar = (gz) this.b;
                if (gzVar.getParentActivity() != null && (yyVar = (yy) gzVar.P.get(i7)) != null) {
                    View.OnClickListener onClickListener = yyVar.c;
                    if (onClickListener != null) {
                        onClickListener.onClick(view);
                        break;
                    } else {
                        int i19 = yyVar.a;
                        if (i19 == 1) {
                            org.telegram.ui.Cells.pa paVar = (org.telegram.ui.Cells.pa) view;
                            gzVar.B0(yyVar, paVar.getName(), paVar.getCurrentObject(), yyVar.g);
                            break;
                        } else if (i19 == 7) {
                            org.telegram.ui.Components.l51 l51Var = new org.telegram.ui.Components.l51(21, gzVar, yyVar);
                            if (gzVar.c.x.f) {
                                gzVar.y0(l51Var, false);
                                break;
                            } else {
                                l51Var.run();
                                break;
                            }
                        } else if (i19 == 8 || (i19 == 4 && yyVar.k == R.drawable.msg2_link2)) {
                            org.telegram.messenger.vo voVar = gzVar.r;
                            org.telegram.messenger.p2 p2Var = org.telegram.messenger.p2.D;
                            if (!gzVar.s || !gzVar.c.x.f) {
                                if (!TextUtils.isEmpty(gzVar.x) || !TextUtils.isEmpty(voVar.b)) {
                                    int i20 = gzVar.D;
                                    int i21 = org.telegram.messenger.qp.C8;
                                    if ((i20 & (-1537)) == 0 && gzVar.G.isEmpty() && !gzVar.F.isEmpty()) {
                                        gzVar.y0(new ly(gzVar, 1), false);
                                        break;
                                    }
                                }
                                float f10 = -gzVar.Q;
                                gzVar.Q = f10;
                                org.telegram.messenger.g0.G3(f10, view, null);
                                p2Var.a();
                                if (TextUtils.isEmpty(gzVar.x) && TextUtils.isEmpty(voVar.b)) {
                                    a03 = org.telegram.ui.Components.hc.a0(gzVar);
                                    i10 = 2131750763;
                                } else {
                                    int i22 = gzVar.D;
                                    int i23 = org.telegram.messenger.qp.C8;
                                    if ((i22 & (-1537)) != 0) {
                                        if (gzVar.G.isEmpty()) {
                                            a03 = org.telegram.ui.Components.hc.a0(gzVar);
                                            i10 = 2131750761;
                                        } else {
                                            a03 = org.telegram.ui.Components.hc.a0(gzVar);
                                            i10 = 2131750760;
                                        }
                                    } else if (gzVar.F.isEmpty()) {
                                        a03 = org.telegram.ui.Components.hc.a0(gzVar);
                                        i10 = 2131750764;
                                    } else {
                                        a03 = org.telegram.ui.Components.hc.a0(gzVar);
                                        i10 = 2131750762;
                                    }
                                }
                                org.telegram.messenger.k5.p(null, i10, a03, null);
                                break;
                            } else {
                                float f11 = -gzVar.Q;
                                gzVar.Q = f11;
                                org.telegram.messenger.g0.G3(f11, view, null);
                                p2Var.a();
                                gzVar.w = true;
                                fi.m3 m3Var = gzVar.R;
                                if ((m3Var == null || !m3Var.V) && (gzVar.fragmentView instanceof FrameLayout)) {
                                    fi.m3 m3Var2 = new fi.m3(gzVar.getParentActivity(), 1);
                                    m3Var2.r(true);
                                    m3Var2.d = 2300L;
                                    m3Var2.T = true;
                                    m3Var2.e = true;
                                    m3Var2.n(11.0f, 6.0f, 11.0f, 7.0f);
                                    m3Var2.u0 = -org.telegram.messenger.g0.L(10.0f);
                                    gzVar.R = m3Var2;
                                    m3Var2.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
                                    m3Var2.l(gzVar.getBaseSimpleGlass().c);
                                    m3Var2.u(org.telegram.messenger.id.M0(2131750776, null));
                                    m3Var2.q0 = new oy(m3Var2, z11 ? 1 : 0);
                                    ((FrameLayout) gzVar.fragmentView).addView(m3Var2, c8.ha.e(-1, org.telegram.messenger.qs.g2, 55));
                                    m3Var2.y(gzVar.c, true);
                                    break;
                                }
                            }
                        }
                    }
                }
                break;
            case 11:
                vy vyVar = (vy) this.b;
                ArrayList arrayList6 = vyVar.W1;
                int i24 = i7 - 1;
                if (i24 >= 0 && i24 < arrayList6.size()) {
                    yy yyVar2 = (yy) arrayList6.get(i24);
                    int i25 = yyVar2.a;
                    if (i25 == 7) {
                        vyVar.dismiss();
                        vyVar.o1.presentFragment(new gy(vyVar.Q1, yyVar2.m));
                        break;
                    } else if (i25 == 8) {
                        vyVar.d1();
                        break;
                    }
                }
                break;
            case 12:
                yz yzVar = (yz) this.b;
                if (view instanceof org.telegram.ui.Cells.h7) {
                    yzVar.f(i7, view, ((org.telegram.ui.Cells.h7) view).getMessage(), 0);
                    break;
                } else if (view instanceof org.telegram.ui.Cells.k7) {
                    yzVar.f(i7, view, ((org.telegram.ui.Cells.k7) view).getMessage(), 0);
                    break;
                } else if (view instanceof org.telegram.ui.Cells.g7) {
                    yzVar.f(i7, view, ((org.telegram.ui.Cells.g7) view).getMessage(), 0);
                    break;
                } else if (view instanceof org.telegram.ui.Cells.h2) {
                    yzVar.f(i7, view, ((org.telegram.ui.Cells.h2) view).getMessageObject(), 0);
                    break;
                } else if (view instanceof org.telegram.ui.Cells.t2) {
                    yzVar.f(i7, view, ((org.telegram.ui.Cells.t2) view).getMessage(), 0);
                    break;
                }
                break;
            case 13:
                f50 f50Var = (f50) this.b;
                if (f50Var.getParentActivity() != null) {
                    if (i7 == f50Var.n || i7 == 0) {
                        if (f50Var.f != null) {
                            try {
                                ((ClipboardManager) org.telegram.messenger.t0.b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", f50Var.f.link));
                                org.telegram.ui.Components.hc.j(f50Var).j();
                                break;
                            } catch (Exception e10) {
                                org.telegram.messenger.a8.g(e10, true);
                                return;
                            }
                        }
                    } else if (i7 != f50Var.s) {
                        if (i7 == f50Var.r) {
                            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(f50Var.getParentActivity());
                            alertDialog$Builder3.a.T = org.telegram.messenger.id.M0(2131746029, null);
                            alertDialog$Builder3.a.R = org.telegram.messenger.id.M0(2131746026, null);
                            alertDialog$Builder3.k(org.telegram.messenger.id.M0(2131746027, null), new wr(f50Var, 14));
                            alertDialog$Builder3.h(org.telegram.messenger.id.M0(2131752589, null), null);
                            f50Var.showDialog(alertDialog$Builder3.a);
                            break;
                        }
                    } else if (f50Var.f != null) {
                        try {
                            Intent intent = new Intent("android.intent.action.SEND");
                            intent.setType("text/plain");
                            intent.putExtra("android.intent.extra.TEXT", f50Var.f.link);
                            f50Var.getParentActivity().startActivityForResult(Intent.createChooser(intent, org.telegram.messenger.id.M0(2131749111, null)), 500);
                            break;
                        } catch (Exception e11) {
                            org.telegram.messenger.a8.g(e11, true);
                            return;
                        }
                    }
                }
                break;
            case 14:
                m50.Z((m50) this.b, view, i7);
                break;
            case 15:
                z50.Z((z50) this.b, view, i7);
                break;
            case 16:
                LanguageSelectActivity.Z((LanguageSelectActivity) this.b, view, i7);
                break;
            case 17:
                ((bg0) this.b).onBackPressed();
                break;
            case 18:
                jg0 jg0Var = (jg0) this.b;
                int i26 = jg0Var.I;
                if (i7 >= i26 && i7 < jg0Var.J) {
                    org.telegram.messenger.ij ijVar = (org.telegram.messenger.ij) jg0Var.y.get(i7 - i26);
                    if (!ijVar.y4()) {
                        long B0 = org.telegram.messenger.ij.B0(ijVar.k);
                        Bundle bundle3 = new Bundle();
                        if (org.telegram.messenger.m5.E(B0)) {
                            bundle3.putLong("user_id", B0);
                        } else {
                            bundle3.putLong("chat_id", -B0);
                        }
                        bundle3.putInt("message_id", ijVar.f1());
                        bundle3.putBoolean("need_remove_previous_same_chat_activity", false);
                        if (jg0Var.getMessagesController().E(bundle3, jg0Var, null, null)) {
                            jg0Var.presentFragment(new an(bundle3));
                            break;
                        }
                    } else if (!jg0Var.g0(ijVar)) {
                        jg0Var.getOrCreateStoryViewer().L(jg0Var.getParentActivity(), ijVar.l, di.h7.a(jg0Var.f));
                        break;
                    }
                }
                break;
            case 19:
                PasscodeActivity.a0((PasscodeActivity) this.b, view, i7);
                break;
            case 20:
                gm0 gm0Var = (gm0) this.b;
                gm0Var.a(i7, true);
                tl0 tl0Var = gm0Var.h;
                if (tl0Var != null) {
                    tl0Var.a(Integer.valueOf(i7));
                    break;
                }
                break;
            case 21:
                xm0 xm0Var = (xm0) this.b;
                ArrayList arrayList7 = xm0Var.f;
                ArrayList arrayList8 = xm0Var.n;
                org.telegram.messenger.we weVar = xm0Var.J;
                if (weVar != null || !arrayList7.isEmpty()) {
                    if (weVar != null) {
                        arrayList7 = weVar.e;
                    }
                    if (i7 >= 0 && i7 < arrayList7.size()) {
                        org.telegram.ui.ActionBar.r0 r0Var = xm0Var.P;
                        if (r0Var != null) {
                            org.telegram.messenger.g0.v1(r0Var.getSearchField());
                        }
                        if (xm0Var.Y) {
                            xm0Var.f0(view, arrayList7.get(i7));
                            break;
                        } else {
                            int i27 = xm0Var.T;
                            if (i27 != 1 && i27 != 3) {
                                if (i27 != 2) {
                                    i12 = 10;
                                    if (i27 != 10) {
                                        i14 = xm0Var.U == null ? 4 : 0;
                                    }
                                }
                                i14 = i12;
                            }
                            PhotoViewer.p1().H2(null, xm0Var, null);
                            PhotoViewer p12 = PhotoViewer.p1();
                            int i28 = xm0Var.H;
                            boolean z17 = xm0Var.I;
                            p12.h = i28;
                            p12.n = z17;
                            PhotoViewer.p1().e2(arrayList7, i7, i14, xm0Var.l0, xm0Var.x0, xm0Var.U);
                            break;
                        }
                    }
                } else if (i7 < arrayList8.size()) {
                    String str = (String) arrayList8.get(i7);
                    ym0 ym0Var = xm0Var.t0;
                    if (ym0Var != null) {
                        switch (ym0Var.a) {
                            case 1:
                                an0.m0(ym0Var.b, str);
                                break;
                            default:
                                an0.m0(ym0Var.b, str);
                                break;
                        }
                    } else {
                        xm0Var.P.getSearchField().setText(str);
                        xm0Var.P.getSearchField().setSelection(str.length());
                        xm0Var.g0(xm0Var.P.getSearchField());
                        break;
                    }
                } else if (i7 == arrayList8.size() + 1) {
                    AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(xm0Var.getParentActivity());
                    alertDialog$Builder4.a.R = org.telegram.messenger.id.M0(2131752056, null);
                    alertDialog$Builder4.a.T = org.telegram.messenger.id.M0(2131752061, null);
                    alertDialog$Builder4.k(org.telegram.messenger.id.M0(2131752099, null), new qm0(xm0Var, i13));
                    alertDialog$Builder4.h(org.telegram.messenger.id.M0(2131752589, null), null);
                    org.telegram.ui.ActionBar.u1 u1Var3 = alertDialog$Builder4.a;
                    xm0Var.showDialog(u1Var3);
                    TextView textView3 = (TextView) u1Var3.d(-1);
                    if (textView3 != null) {
                        org.telegram.ui.ActionBar.r6.V(textView3, org.telegram.ui.ActionBar.k6.q7, null);
                        break;
                    }
                }
                break;
            case 22:
                PhotoViewer photoViewer = (PhotoViewer) this.b;
                ArrayList arrayList9 = photoViewer.f7;
                if (!arrayList9.isEmpty() && (i11 = photoViewer.O4) >= 0 && i11 < arrayList9.size()) {
                    Object obj = arrayList9.get(photoViewer.O4);
                    if (obj instanceof org.telegram.messenger.ze) {
                        ((org.telegram.messenger.ze) obj).s = photoViewer.j1();
                    }
                }
                photoViewer.j5 = true;
                int indexOf = arrayList9.indexOf(view.getTag());
                if (indexOf >= 0) {
                    photoViewer.O4 = -1;
                    photoViewer.y2(indexOf);
                }
                photoViewer.j5 = false;
                break;
            case 23:
                pr0 pr0Var = (pr0) this.b;
                boolean[] zArr = pr0Var.x;
                if (i7 == pr0Var.o0) {
                    pr0Var.k0();
                    break;
                } else if (view instanceof org.telegram.ui.Cells.r8) {
                    org.telegram.ui.Cells.r8 r8Var = (org.telegram.ui.Cells.r8) view;
                    boolean z18 = pr0Var.L;
                    org.telegram.ui.Components.ow0 ow0Var = pr0Var.Q;
                    if (ow0Var != null) {
                        ow0Var.f();
                    }
                    if (pr0Var.I) {
                        int i29 = -pr0Var.O;
                        pr0Var.O = i29;
                        org.telegram.messenger.g0.G3(i29, r8Var, null);
                        org.telegram.messenger.p2.D.a();
                        break;
                    } else {
                        if (i7 == pr0Var.r0) {
                            z9 = !pr0Var.G;
                            pr0Var.G = z9;
                        } else {
                            int i30 = pr0Var.u0;
                            if (i7 == i30) {
                                z9 = !pr0Var.H;
                                pr0Var.H = z9;
                            } else {
                                if (i7 == pr0Var.v0) {
                                    z10 = !pr0Var.J;
                                    pr0Var.J = z10;
                                    pr0Var.w0();
                                    int i31 = pr0Var.u0;
                                    if (i31 >= 0 && i30 < 0) {
                                        pr0Var.b.i(i31);
                                    } else if (i30 >= 0 && i31 < 0) {
                                        pr0Var.b.s(i30);
                                    }
                                } else if (i7 == pr0Var.s0) {
                                    boolean z19 = pr0Var.K;
                                    z10 = !z19;
                                    pr0Var.K = z10;
                                    if (!z19 && pr0Var.L) {
                                        int i32 = pr0Var.j0;
                                        pr0Var.L = false;
                                        pr0Var.w0();
                                        v4.d1 K = pr0Var.c.K(pr0Var.t0);
                                        if (K != null) {
                                            ((org.telegram.ui.Cells.r8) K.a).setChecked(false);
                                        } else {
                                            pr0Var.b.g(pr0Var.t0);
                                        }
                                        pr0Var.b.p(i32, 2);
                                    }
                                } else if (pr0Var.N == 0) {
                                    z9 = !pr0Var.L;
                                    pr0Var.L = z9;
                                    int i33 = pr0Var.j0;
                                    pr0Var.w0();
                                    if (pr0Var.L) {
                                        pr0Var.b.o(pr0Var.j0, 2);
                                    } else {
                                        pr0Var.b.p(i33, 2);
                                    }
                                    if (pr0Var.L && pr0Var.K) {
                                        pr0Var.K = false;
                                        v4.d1 K2 = pr0Var.c.K(pr0Var.s0);
                                        if (K2 != null) {
                                            ((org.telegram.ui.Cells.r8) K2.a).setChecked(false);
                                        } else {
                                            pr0Var.b.g(pr0Var.s0);
                                        }
                                    }
                                    if (pr0Var.L) {
                                        int i34 = 0;
                                        boolean z20 = false;
                                        while (i34 < zArr.length) {
                                            if (z20) {
                                                zArr[i34] = false;
                                            } else if (zArr[i34]) {
                                                z20 = true;
                                            }
                                            i34++;
                                            z20 = z20;
                                        }
                                    }
                                }
                                z9 = z10;
                            }
                        }
                        if (pr0Var.M && !pr0Var.L) {
                            pr0Var.c.getChildCount();
                            pr0Var.h.a();
                        }
                        for (int i35 = pr0Var.n0; i35 < pr0Var.n0 + pr0Var.D; i35++) {
                            v4.d1 K3 = pr0Var.c.K(i35);
                            if (K3 != null) {
                                View view2 = K3.a;
                                if (view2 instanceof org.telegram.ui.Cells.a6) {
                                    org.telegram.ui.Cells.a6 a6Var = (org.telegram.ui.Cells.a6) view2;
                                    a6Var.m(pr0Var.L, true);
                                    a6Var.r.a(zArr[i35 - pr0Var.n0], z18);
                                    if (a6Var.getTop() > org.telegram.messenger.g0.L(40.0f) && i7 == pr0Var.t0 && !pr0Var.M) {
                                        pr0Var.h.c(a6Var.getCheckBox());
                                        pr0Var.M = true;
                                    }
                                }
                            }
                        }
                        r8Var.setChecked(z9);
                        pr0Var.n0();
                        break;
                    }
                }
                break;
            case 24:
                PremiumPreviewFragment.Z((PremiumPreviewFragment) this.b, view, i7);
                break;
            case 25:
                us0 us0Var = (us0) this.b;
                PremiumPreviewFragment premiumPreviewFragment = us0Var.n;
                ArrayList arrayList10 = premiumPreviewFragment.d;
                br0 br0Var = us0Var.e;
                if (view.isEnabled() && (view instanceof ug.k1)) {
                    ug.k1 k1Var = (ug.k1) view;
                    premiumPreviewFragment.e = arrayList10.indexOf(k1Var.getTier());
                    premiumPreviewFragment.y0(true);
                    k1Var.c(true, true);
                    for (int i36 = 0; i36 < br0Var.getChildCount(); i36++) {
                        View childAt = br0Var.getChildAt(i36);
                        if (childAt instanceof ug.k1) {
                            ug.k1 k1Var2 = (ug.k1) childAt;
                            if (k1Var2.getTier() != k1Var.getTier()) {
                                k1Var2.c(false, true);
                            }
                        }
                    }
                    for (int i37 = 0; i37 < br0Var.getHiddenChildCount(); i37++) {
                        View V = br0Var.V(i37);
                        if (V instanceof ug.k1) {
                            ug.k1 k1Var3 = (ug.k1) V;
                            if (k1Var3.getTier() != k1Var.getTier()) {
                                k1Var3.c(false, true);
                            }
                        }
                    }
                    for (int i38 = 0; i38 < br0Var.getCachedChildCount(); i38++) {
                        View P = br0Var.P(i38);
                        if (P instanceof ug.k1) {
                            ug.k1 k1Var4 = (ug.k1) P;
                            if (k1Var4.getTier() != k1Var.getTier()) {
                                k1Var4.c(false, true);
                            }
                        }
                    }
                    for (int i39 = 0; i39 < br0Var.getAttachedScrapChildCount(); i39++) {
                        View O = br0Var.O(i39);
                        if (O instanceof ug.k1) {
                            ug.k1 k1Var5 = (ug.k1) O;
                            if (k1Var5.getTier() != k1Var.getTier()) {
                                k1Var5.c(false, true);
                            }
                        }
                    }
                    FrameLayout frameLayout = premiumPreviewFragment.J;
                    if (!premiumPreviewFragment.getUserConfig().q() || ((ws0Var = premiumPreviewFragment.f) != null && ws0Var.a.months < ((ws0) arrayList10.get(premiumPreviewFragment.e)).a.months && !premiumPreviewFragment.p0)) {
                        z11 = true;
                    }
                    org.telegram.messenger.g0.X3(frameLayout, z11);
                    break;
                }
                break;
            case 26:
                PrivacyControlActivity.c0((PrivacyControlActivity) this.b, view, i7);
                break;
            case 27:
                a(i7, view);
                break;
            case 28:
                ProfileActivity.c0((ProfileActivity) this.b, i7);
                break;
            default:
                ProxyListActivity.Z((ProxyListActivity) this.b, view, i7);
                break;
        }
    }
}
