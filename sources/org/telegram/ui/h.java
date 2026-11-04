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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class h implements org.telegram.ui.Components.fj0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ h(Object obj, int i3) {
        this.a = i3;
        this.b = obj;
    }

    private final void a(int i3, View view) {
        it0 it0Var = (it0) this.b;
        int i10 = it0Var.E;
        if (i3 == it0Var.x) {
            org.telegram.ui.ActionBar.s1 s1Var = org.telegram.ui.Components.t4.N(it0Var.getParentActivity(), org.telegram.messenger.bd.M0(2131747921, null), org.telegram.messenger.bd.M0(2131747922, null), org.telegram.messenger.bd.M0(2131751599, null), new gt0(it0Var), null).a;
            s1Var.show();
            s1Var.i();
            return;
        }
        if (i3 != it0Var.f) {
            if (i3 < it0Var.r || i3 >= it0Var.s) {
                return;
            }
            if (i10 != 1) {
                new Bundle();
                throw null;
            }
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", it0Var.getMessagesController().H0.keyAt(i3 - it0Var.r));
            it0Var.presentFragment(new ProfileActivity(bundle, null));
            return;
        }
        if (i10 != 1) {
            Bundle k10 = a1.g.k("isNeverShare", true);
            if (i10 == 2) {
                k10.putInt("chatAddType", 2);
            }
            r40 r40Var = new r40(k10);
            r40Var.x = new ft0(it0Var);
            it0Var.presentFragment(r40Var);
            return;
        }
        yt ytVar = new yt(null);
        ytVar.d = new Paint();
        ytVar.f = new xt[2];
        ytVar.x = true;
        Bundle bundle2 = new Bundle();
        bundle2.putBoolean("onlySelect", true);
        bundle2.putBoolean("checkCanWrite", false);
        bundle2.putBoolean("resetDelegate", false);
        bundle2.putInt("dialogsType", 9);
        uw uwVar = new uw(bundle2);
        ytVar.a = uwVar;
        uwVar.D2 = new vt(ytVar);
        uwVar.onFragmentCreate();
        Bundle bundle3 = new Bundle();
        bundle3.putBoolean("onlyUsers", true);
        bundle3.putBoolean("destroyAfterSelect", true);
        bundle3.putBoolean("returnAsResult", true);
        bundle3.putBoolean("disableSections", true);
        bundle3.putBoolean("needFinishFragment", false);
        bundle3.putBoolean("resetDelegate", false);
        bundle3.putBoolean("allowSelf", false);
        ContactsActivity contactsActivity = new ContactsActivity(bundle3);
        ytVar.b = contactsActivity;
        contactsActivity.V = new vt(ytVar);
        contactsActivity.onFragmentCreate();
        it0Var.presentFragment(ytVar);
    }

    @Override // org.telegram.ui.Components.fj0
    public final void f(int i3, View view) {
        TLRPC.InputStickerSet tL_inputStickerSetShortName;
        TLRPC.Chat chat;
        String M0;
        String a02;
        ns nsVar;
        vy vyVar;
        org.telegram.ui.Components.fc a03;
        int i10;
        int i11;
        boolean z10;
        boolean z11;
        ms0 ms0Var;
        int i12 = 3;
        int i13 = 4;
        ks ksVar = null;
        boolean z12 = false;
        z12 = false;
        z12 = false;
        int i14 = 1;
        switch (this.a) {
            case 0:
                k kVar = (k) this.b;
                ArrayList arrayList = kVar.h;
                if (i3 >= 0 && i3 < arrayList.size()) {
                    int i15 = ((i) arrayList.get(i3)).d;
                    if (i15 == 1) {
                        TLRPC.GlobalPrivacySettings globalPrivacySettings = kVar.d;
                        boolean z13 = !globalPrivacySettings.keep_archived_unmuted;
                        globalPrivacySettings.keep_archived_unmuted = z13;
                        ((org.telegram.ui.Cells.q8) view).setChecked(z13);
                        kVar.c = true;
                        break;
                    } else if (i15 == 4) {
                        TLRPC.GlobalPrivacySettings globalPrivacySettings2 = kVar.d;
                        boolean z14 = !globalPrivacySettings2.keep_archived_folders;
                        globalPrivacySettings2.keep_archived_folders = z14;
                        ((org.telegram.ui.Cells.q8) view).setChecked(z14);
                        kVar.c = true;
                        break;
                    } else if (i15 == 7) {
                        if (!kVar.getUserConfig().q() && !kVar.getMessagesController().Z3 && !kVar.d.archive_and_mute_new_noncontact_peers) {
                            org.telegram.ui.Components.sb sbVar = new org.telegram.ui.Components.sb(kVar.getParentActivity(), kVar.getResourceProvider());
                            org.telegram.ui.Components.s70 s70Var = sbVar.b;
                            s70Var.setText(org.telegram.messenger.g0.S2(org.telegram.messenger.bd.M0(2131743876, null), org.telegram.ui.ActionBar.k6.uj, 0, new xp0(kVar, i12), null));
                            s70Var.setSingleLine(false);
                            s70Var.setPadding(0, org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f));
                            sbVar.a.setImageResource(R.drawable.msg_settings_premium);
                            org.telegram.ui.Components.ac.g(kVar, sbVar, 3500).j();
                            int i16 = -kVar.e;
                            kVar.e = i16;
                            org.telegram.messenger.g0.G3(i16, view, null);
                            org.telegram.messenger.p2.E.a();
                            break;
                        } else {
                            TLRPC.GlobalPrivacySettings globalPrivacySettings3 = kVar.d;
                            boolean z15 = !globalPrivacySettings3.archive_and_mute_new_noncontact_peers;
                            globalPrivacySettings3.archive_and_mute_new_noncontact_peers = z15;
                            ((org.telegram.ui.Cells.q8) view).setChecked(z15);
                            kVar.c = true;
                            break;
                        }
                    }
                }
                break;
            case 1:
                o oVar = (o) this.b;
                if (i3 >= oVar.y && i3 < oVar.E && oVar.getParentActivity() != null) {
                    TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) oVar.h.get(i3 - oVar.y);
                    if (stickerSetCovered.set.id != 0) {
                        tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetID();
                        tL_inputStickerSetShortName.id = stickerSetCovered.set.id;
                    } else {
                        tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
                        tL_inputStickerSetShortName.short_name = stickerSetCovered.set.short_name;
                    }
                    TLRPC.InputStickerSet inputStickerSet = tL_inputStickerSetShortName;
                    inputStickerSet.access_hash = stickerSetCovered.set.access_hash;
                    org.telegram.ui.Components.xv0 xv0Var = new org.telegram.ui.Components.xv0(oVar.getParentActivity(), oVar, inputStickerSet, null, null, null);
                    xv0Var.U1 = new m(oVar, view, stickerSetCovered);
                    oVar.showDialog(xv0Var);
                    break;
                }
                break;
            case 2:
                ny0.Z((ny0) this.b, i3);
                break;
            case 3:
                nc ncVar = (nc) this.b;
                ArrayList arrayList2 = ncVar.c;
                u51 u51Var = ncVar.d;
                if (i3 >= 0 && i3 < arrayList2.size()) {
                    org.telegram.ui.Components.uo uoVar = (org.telegram.ui.Components.uo) arrayList2.get(i3);
                    ncVar.a(uoVar.a(), true);
                    if (view.getLeft() < org.telegram.messenger.g0.L(24.0f) + u51Var.getPaddingLeft()) {
                        u51Var.w0(-((org.telegram.messenger.g0.L(48.0f) + u51Var.getPaddingLeft()) - view.getLeft()), 0, null);
                    } else if (view.getWidth() + view.getLeft() > (u51Var.getMeasuredWidth() - u51Var.getPaddingRight()) - org.telegram.messenger.g0.L(24.0f)) {
                        u51Var.w0(org.telegram.messenger.k5.B(48.0f, u51Var.getMeasuredWidth() - u51Var.getPaddingRight(), view.getWidth() + view.getLeft()), 0, null);
                    }
                    org.telegram.messenger.u10 u10Var = ncVar.r;
                    if (u10Var != null) {
                        u10Var.a(uoVar.a());
                        break;
                    }
                }
                break;
            case 4:
                qo qoVar = (qo) this.b;
                boolean z16 = qoVar.s;
                if (qoVar.getParentActivity() != null) {
                    u4.h0 adapter = qoVar.b.getAdapter();
                    po poVar = qoVar.e;
                    if (adapter == poVar) {
                        chat = (TLRPC.Chat) poVar.d.get(i3);
                    } else {
                        int i17 = qoVar.H;
                        chat = (i3 < i17 || i3 >= qoVar.I) ? null : (TLRPC.Chat) qoVar.w.get(i3 - i17);
                    }
                    if (chat != null) {
                        if (!z16 || qoVar.h.linked_chat_id != 0) {
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", chat.id);
                            qoVar.presentFragment(new wm(bundle));
                            break;
                        } else {
                            qoVar.f0(chat, true);
                            break;
                        }
                    } else if (i3 == qoVar.G) {
                        if (z16 && qoVar.h.linked_chat_id == 0) {
                            Bundle bundle2 = new Bundle();
                            bundle2.putLongArray("result", new long[]{qoVar.getUserConfig().e()});
                            bundle2.putInt("chatType", 4);
                            TLRPC.Chat chat2 = qoVar.f;
                            if (chat2 != null) {
                                bundle2.putString("title", org.telegram.messenger.bd.a0("GroupCreateDiscussionDefaultName", null, 2131749462, chat2.title));
                            }
                            y40 y40Var = new y40(bundle2);
                            y40Var.Z = new go(qoVar);
                            qoVar.presentFragment(y40Var);
                            break;
                        } else if (!qoVar.w.isEmpty()) {
                            TLRPC.Chat chat3 = (TLRPC.Chat) qoVar.w.get(0);
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(qoVar.getParentActivity());
                            if (z16) {
                                M0 = org.telegram.messenger.bd.M0(2131751372, null);
                                a02 = org.telegram.messenger.bd.a0("DiscussionUnlinkChannelAlert", null, 2131751373, chat3.title);
                            } else {
                                M0 = org.telegram.messenger.bd.M0(2131751374, null);
                                a02 = org.telegram.messenger.bd.a0("DiscussionUnlinkGroupAlert", null, 2131751371, chat3.title);
                            }
                            alertDialog$Builder.a.S = M0;
                            alertDialog$Builder.a.U = org.telegram.messenger.g0.X2(a02);
                            alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131751375, null), new x0(qoVar, 25));
                            alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131752589, null), null);
                            org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.a;
                            qoVar.showDialog(s1Var);
                            TextView textView = (TextView) s1Var.d(-1);
                            if (textView != null) {
                                org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.q7, null);
                                break;
                            }
                        }
                    }
                }
                break;
            case 5:
                xo xoVar = (xo) this.b;
                ArrayList arrayList3 = xoVar.n;
                if (i3 > 2) {
                    org.telegram.ui.Cells.x xVar = (org.telegram.ui.Cells.x) view;
                    TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) arrayList3.get(i3 - 3);
                    boolean contains = xoVar.d.contains(tL_availableReaction.reaction);
                    boolean z17 = !contains;
                    if (contains) {
                        xoVar.d.remove(tL_availableReaction.reaction);
                        if (xoVar.d.isEmpty()) {
                            wo woVar = xoVar.h;
                            if (woVar != null) {
                                woVar.p(2, arrayList3.size() + 1);
                            }
                            xoVar.a0(2, true);
                        }
                    } else {
                        xoVar.d.add(tL_availableReaction.reaction);
                    }
                    Switch r22 = xVar.c;
                    if (r22 != null) {
                        r22.c(z17, true);
                    }
                    org.telegram.ui.Components.wo woVar2 = xVar.d;
                    if (woVar2 != null) {
                        woVar2.a(z17, true);
                        break;
                    }
                }
                break;
            case 6:
                es esVar = (es) this.b;
                TLRPC.StickerSetCovered stickerSetCovered2 = ((hs) view).d;
                is isVar = esVar.a;
                dh.a0 reactionsWindow = isVar.P.getReactionsWindow();
                if (reactionsWindow != null && !reactionsWindow.q) {
                    reactionsWindow.d();
                }
                if (stickerSetCovered2 instanceof TLRPC.TL_stickerSetNoCovered) {
                    org.telegram.ui.Components.cw0.c(null, isVar.c0, isVar.z.getContext(), new c5(esVar, 9));
                    break;
                } else {
                    gs gsVar = isVar.l;
                    if (gsVar != null) {
                        gsVar.v(stickerSetCovered2.set, TextUtils.join("", isVar.o));
                    }
                    isVar.o();
                    break;
                }
                break;
            case 7:
                os osVar = (os) this.b;
                if (osVar.f && osVar.e) {
                    org.telegram.ui.Components.nj njVar = osVar.d;
                    ArrayList arrayList4 = njVar.e;
                    if (arrayList4 != null && i3 >= 0 && i3 < arrayList4.size()) {
                        ksVar = (ks) njVar.e.get(i3);
                    }
                } else {
                    int S = osVar.c.S(i3);
                    int Q = osVar.c.Q(i3);
                    if (Q >= 0 && S >= 0) {
                        ksVar = osVar.c.O(S, Q);
                    }
                }
                if (i3 >= 0) {
                    osVar.finishFragment();
                    if (ksVar != null && (nsVar = osVar.r) != null) {
                        nsVar.c(ksVar);
                        break;
                    }
                }
                break;
            case 8:
                et etVar = (et) this.b;
                ArrayList arrayList5 = etVar.k3;
                ht htVar = etVar.w3;
                if (!(view instanceof ys) || i3 < 0 || i3 >= arrayList5.size()) {
                    if (view instanceof org.telegram.ui.Cells.l8) {
                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(htVar.getParentActivity());
                        alertDialog$Builder2.a.S = org.telegram.messenger.bd.M0(2131746099, null);
                        alertDialog$Builder2.a.U = org.telegram.messenger.bd.M0(2131746100, null);
                        alertDialog$Builder2.k(org.telegram.messenger.bd.M0(2131746128, null), new bt(etVar));
                        alertDialog$Builder2.h(org.telegram.messenger.bd.M0(2131752589, null), null);
                        org.telegram.ui.ActionBar.s1 s1Var2 = alertDialog$Builder2.a;
                        htVar.showDialog(s1Var2);
                        TextView textView2 = (TextView) s1Var2.d(-1);
                        if (textView2 != null) {
                            org.telegram.ui.ActionBar.r6.V(textView2, org.telegram.ui.ActionBar.k6.q7, null);
                            break;
                        }
                    }
                } else {
                    at atVar = (at) arrayList5.get(i3);
                    if (atVar != null) {
                        int i18 = atVar.h;
                        if (i18 >= 0) {
                            etVar.q3[i18] = !r3[i18];
                            etVar.D1(true);
                            break;
                        } else if (i18 == -2) {
                            htVar.presentFragment(new DataAutoDownloadActivity(etVar.g3 - 1));
                            break;
                        }
                    }
                }
                break;
            case 9:
                cy.a0((cy) this.b, view, i3);
                break;
            case 10:
                ez ezVar = (ez) this.b;
                if (ezVar.getParentActivity() != null && (vyVar = (vy) ezVar.Q.get(i3)) != null) {
                    View.OnClickListener onClickListener = vyVar.c;
                    if (onClickListener != null) {
                        onClickListener.onClick(view);
                        break;
                    } else {
                        int i19 = vyVar.a;
                        if (i19 == 1) {
                            org.telegram.ui.Cells.pa paVar = (org.telegram.ui.Cells.pa) view;
                            ezVar.B0(vyVar, paVar.getName(), paVar.getCurrentObject(), vyVar.g);
                            break;
                        } else if (i19 == 7) {
                            org.telegram.ui.Components.p11 p11Var = new org.telegram.ui.Components.p11(26, ezVar, vyVar);
                            if (ezVar.c.x.f) {
                                ezVar.y0(p11Var, false);
                                break;
                            } else {
                                p11Var.run();
                                break;
                            }
                        } else if (i19 == 8 || (i19 == 4 && vyVar.k == R.drawable.msg2_link2)) {
                            org.telegram.messenger.mo moVar = ezVar.r;
                            org.telegram.messenger.p2 p2Var = org.telegram.messenger.p2.E;
                            if (!ezVar.s || !ezVar.c.x.f) {
                                if (!TextUtils.isEmpty(ezVar.x) || !TextUtils.isEmpty(moVar.b)) {
                                    int i20 = ezVar.E;
                                    int i21 = org.telegram.messenger.hp.C8;
                                    if ((i20 & (-1537)) == 0 && ezVar.H.isEmpty() && !ezVar.G.isEmpty()) {
                                        ezVar.y0(new hy(ezVar, 1), false);
                                        break;
                                    }
                                }
                                float f10 = -ezVar.R;
                                ezVar.R = f10;
                                org.telegram.messenger.g0.G3(f10, view, null);
                                p2Var.a();
                                if (TextUtils.isEmpty(ezVar.x) && TextUtils.isEmpty(moVar.b)) {
                                    a03 = org.telegram.ui.Components.fc.a0(ezVar);
                                    i10 = 2131750763;
                                } else {
                                    int i22 = ezVar.E;
                                    int i23 = org.telegram.messenger.hp.C8;
                                    if ((i22 & (-1537)) != 0) {
                                        if (ezVar.H.isEmpty()) {
                                            a03 = org.telegram.ui.Components.fc.a0(ezVar);
                                            i10 = 2131750761;
                                        } else {
                                            a03 = org.telegram.ui.Components.fc.a0(ezVar);
                                            i10 = 2131750760;
                                        }
                                    } else if (ezVar.G.isEmpty()) {
                                        a03 = org.telegram.ui.Components.fc.a0(ezVar);
                                        i10 = 2131750764;
                                    } else {
                                        a03 = org.telegram.ui.Components.fc.a0(ezVar);
                                        i10 = 2131750762;
                                    }
                                }
                                org.telegram.messenger.k5.p(null, i10, a03, null);
                                break;
                            } else {
                                float f11 = -ezVar.R;
                                ezVar.R = f11;
                                org.telegram.messenger.g0.G3(f11, view, null);
                                p2Var.a();
                                ezVar.w = true;
                                gi.l3 l3Var = ezVar.S;
                                if ((l3Var == null || !l3Var.W) && (ezVar.fragmentView instanceof FrameLayout)) {
                                    gi.l3 l3Var2 = new gi.l3(ezVar.getParentActivity(), 1);
                                    l3Var2.r(true);
                                    l3Var2.d = 2300L;
                                    l3Var2.U = true;
                                    l3Var2.e = true;
                                    l3Var2.n(11.0f, 6.0f, 11.0f, 7.0f);
                                    l3Var2.v0 = -org.telegram.messenger.g0.L(10.0f);
                                    ezVar.S = l3Var2;
                                    l3Var2.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
                                    l3Var2.l(ezVar.getBaseSimpleGlass().c);
                                    l3Var2.u(org.telegram.messenger.bd.M0(2131750776, null));
                                    l3Var2.r0 = new ky(l3Var2, z12 ? 1 : 0);
                                    ((FrameLayout) ezVar.fragmentView).addView(l3Var2, b8.mf.e(-1, org.telegram.messenger.hs.g2, 55));
                                    l3Var2.y(ezVar.c, true);
                                    break;
                                }
                            }
                        }
                    }
                }
                break;
            case 11:
                sy syVar = (sy) this.b;
                ArrayList arrayList6 = syVar.X1;
                int i24 = i3 - 1;
                if (i24 >= 0 && i24 < arrayList6.size()) {
                    vy vyVar2 = (vy) arrayList6.get(i24);
                    int i25 = vyVar2.a;
                    if (i25 == 7) {
                        syVar.dismiss();
                        syVar.p1.presentFragment(new cy(syVar.R1, vyVar2.m));
                        break;
                    } else if (i25 == 8) {
                        syVar.d1();
                        break;
                    }
                }
                break;
            case 12:
                wz wzVar = (wz) this.b;
                if (view instanceof org.telegram.ui.Cells.g7) {
                    wzVar.f(i3, view, ((org.telegram.ui.Cells.g7) view).getMessage(), 0);
                    break;
                } else if (view instanceof org.telegram.ui.Cells.j7) {
                    wzVar.f(i3, view, ((org.telegram.ui.Cells.j7) view).getMessage(), 0);
                    break;
                } else if (view instanceof org.telegram.ui.Cells.f7) {
                    wzVar.f(i3, view, ((org.telegram.ui.Cells.f7) view).getMessage(), 0);
                    break;
                } else if (view instanceof org.telegram.ui.Cells.h2) {
                    wzVar.f(i3, view, ((org.telegram.ui.Cells.h2) view).getMessageObject(), 0);
                    break;
                } else if (view instanceof org.telegram.ui.Cells.t2) {
                    wzVar.f(i3, view, ((org.telegram.ui.Cells.t2) view).getMessage(), 0);
                    break;
                }
                break;
            case 13:
                a50 a50Var = (a50) this.b;
                if (a50Var.getParentActivity() != null) {
                    if (i3 == a50Var.n || i3 == 0) {
                        if (a50Var.f != null) {
                            try {
                                ((ClipboardManager) org.telegram.messenger.t0.b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", a50Var.f.link));
                                org.telegram.ui.Components.fc.j(a50Var).j();
                                break;
                            } catch (Exception e10) {
                                org.telegram.messenger.a8.g(e10, true);
                                return;
                            }
                        }
                    } else if (i3 != a50Var.s) {
                        if (i3 == a50Var.r) {
                            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(a50Var.getParentActivity());
                            alertDialog$Builder3.a.U = org.telegram.messenger.bd.M0(2131746036, null);
                            alertDialog$Builder3.a.S = org.telegram.messenger.bd.M0(2131746033, null);
                            alertDialog$Builder3.k(org.telegram.messenger.bd.M0(2131746034, null), new ur(a50Var, 14));
                            alertDialog$Builder3.h(org.telegram.messenger.bd.M0(2131752589, null), null);
                            a50Var.showDialog(alertDialog$Builder3.a);
                            break;
                        }
                    } else if (a50Var.f != null) {
                        try {
                            Intent intent = new Intent("android.intent.action.SEND");
                            intent.setType("text/plain");
                            intent.putExtra("android.intent.extra.TEXT", a50Var.f.link);
                            a50Var.getParentActivity().startActivityForResult(Intent.createChooser(intent, org.telegram.messenger.bd.M0(2131749118, null)), 500);
                            break;
                        } catch (Exception e11) {
                            org.telegram.messenger.a8.g(e11, true);
                            return;
                        }
                    }
                }
                break;
            case 14:
                g50.Z((g50) this.b, view, i3);
                break;
            case 15:
                t50.Z((t50) this.b, view, i3);
                break;
            case 16:
                LanguageSelectActivity.Z((LanguageSelectActivity) this.b, view, i3);
                break;
            case 17:
                ((vf0) this.b).onBackPressed();
                break;
            case 18:
                dg0 dg0Var = (dg0) this.b;
                int i26 = dg0Var.J;
                if (i3 >= i26 && i3 < dg0Var.K) {
                    org.telegram.messenger.zi ziVar = (org.telegram.messenger.zi) dg0Var.y.get(i3 - i26);
                    if (!ziVar.y4()) {
                        long B0 = org.telegram.messenger.zi.B0(ziVar.k);
                        Bundle bundle3 = new Bundle();
                        if (org.telegram.messenger.m5.E(B0)) {
                            bundle3.putLong("user_id", B0);
                        } else {
                            bundle3.putLong("chat_id", -B0);
                        }
                        bundle3.putInt("message_id", ziVar.f1());
                        bundle3.putBoolean("need_remove_previous_same_chat_activity", false);
                        if (dg0Var.getMessagesController().E(bundle3, dg0Var, null, null)) {
                            dg0Var.presentFragment(new wm(bundle3));
                            break;
                        }
                    } else if (!dg0Var.g0(ziVar)) {
                        dg0Var.getOrCreateStoryViewer().T(dg0Var.getParentActivity(), ziVar.l, ei.i7.a(dg0Var.f));
                        break;
                    }
                }
                break;
            case 19:
                PasscodeActivity.a0((PasscodeActivity) this.b, view, i3);
                break;
            case 20:
                bm0 bm0Var = (bm0) this.b;
                bm0Var.a(i3, true);
                ol0 ol0Var = bm0Var.h;
                if (ol0Var != null) {
                    ol0Var.a(Integer.valueOf(i3));
                    break;
                }
                break;
            case 21:
                sm0 sm0Var = (sm0) this.b;
                ArrayList arrayList7 = sm0Var.f;
                ArrayList arrayList8 = sm0Var.n;
                org.telegram.messenger.pe peVar = sm0Var.K;
                if (peVar != null || !arrayList7.isEmpty()) {
                    if (peVar != null) {
                        arrayList7 = peVar.e;
                    }
                    if (i3 >= 0 && i3 < arrayList7.size()) {
                        org.telegram.ui.ActionBar.q0 q0Var = sm0Var.Q;
                        if (q0Var != null) {
                            org.telegram.messenger.g0.v1(q0Var.getSearchField());
                        }
                        if (sm0Var.Z) {
                            sm0Var.f0(view, arrayList7.get(i3));
                            break;
                        } else {
                            int i27 = sm0Var.U;
                            if (i27 != 1 && i27 != 3) {
                                if (i27 != 2) {
                                    i12 = 10;
                                    if (i27 != 10) {
                                        i14 = sm0Var.V == null ? 4 : 0;
                                    }
                                }
                                i14 = i12;
                            }
                            PhotoViewer.v1().N2(null, sm0Var, null);
                            PhotoViewer v12 = PhotoViewer.v1();
                            int i28 = sm0Var.I;
                            boolean z18 = sm0Var.J;
                            v12.h = i28;
                            v12.n = z18;
                            PhotoViewer.v1().j2(arrayList7, i3, i14, sm0Var.m0, sm0Var.y0, sm0Var.V);
                            break;
                        }
                    }
                } else if (i3 < arrayList8.size()) {
                    String str = (String) arrayList8.get(i3);
                    tm0 tm0Var = sm0Var.u0;
                    if (tm0Var != null) {
                        switch (tm0Var.a) {
                            case 1:
                                vm0.m0(tm0Var.b, str);
                                break;
                            default:
                                vm0.m0(tm0Var.b, str);
                                break;
                        }
                    } else {
                        sm0Var.Q.getSearchField().setText(str);
                        sm0Var.Q.getSearchField().setSelection(str.length());
                        sm0Var.g0(sm0Var.Q.getSearchField());
                        break;
                    }
                } else if (i3 == arrayList8.size() + 1) {
                    AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(sm0Var.getParentActivity());
                    alertDialog$Builder4.a.S = org.telegram.messenger.bd.M0(2131752056, null);
                    alertDialog$Builder4.a.U = org.telegram.messenger.bd.M0(2131752061, null);
                    alertDialog$Builder4.k(org.telegram.messenger.bd.M0(2131752099, null), new lm0(sm0Var, i13));
                    alertDialog$Builder4.h(org.telegram.messenger.bd.M0(2131752589, null), null);
                    org.telegram.ui.ActionBar.s1 s1Var3 = alertDialog$Builder4.a;
                    sm0Var.showDialog(s1Var3);
                    TextView textView3 = (TextView) s1Var3.d(-1);
                    if (textView3 != null) {
                        org.telegram.ui.ActionBar.r6.V(textView3, org.telegram.ui.ActionBar.k6.q7, null);
                        break;
                    }
                }
                break;
            case 22:
                PhotoViewer photoViewer = (PhotoViewer) this.b;
                ArrayList arrayList9 = photoViewer.h7;
                if (!arrayList9.isEmpty() && (i11 = photoViewer.Q4) >= 0 && i11 < arrayList9.size()) {
                    Object obj = arrayList9.get(photoViewer.Q4);
                    if (obj instanceof org.telegram.messenger.se) {
                        ((org.telegram.messenger.se) obj).s = photoViewer.p1();
                    }
                }
                photoViewer.l5 = true;
                int indexOf = arrayList9.indexOf(view.getTag());
                if (indexOf >= 0) {
                    photoViewer.Q4 = -1;
                    photoViewer.E2(indexOf);
                }
                photoViewer.l5 = false;
                break;
            case 23:
                fr0 fr0Var = (fr0) this.b;
                boolean[] zArr = fr0Var.x;
                if (i3 == fr0Var.p0) {
                    fr0Var.k0();
                    break;
                } else if (view instanceof org.telegram.ui.Cells.q8) {
                    org.telegram.ui.Cells.q8 q8Var = (org.telegram.ui.Cells.q8) view;
                    boolean z19 = fr0Var.M;
                    org.telegram.ui.Components.ow0 ow0Var = fr0Var.R;
                    if (ow0Var != null) {
                        ow0Var.f();
                    }
                    if (fr0Var.J) {
                        int i29 = -fr0Var.P;
                        fr0Var.P = i29;
                        org.telegram.messenger.g0.G3(i29, q8Var, null);
                        org.telegram.messenger.p2.E.a();
                        break;
                    } else {
                        if (i3 == fr0Var.s0) {
                            z10 = !fr0Var.H;
                            fr0Var.H = z10;
                        } else {
                            int i30 = fr0Var.v0;
                            if (i3 == i30) {
                                z10 = !fr0Var.I;
                                fr0Var.I = z10;
                            } else {
                                if (i3 == fr0Var.w0) {
                                    z11 = !fr0Var.K;
                                    fr0Var.K = z11;
                                    fr0Var.w0();
                                    int i31 = fr0Var.v0;
                                    if (i31 >= 0 && i30 < 0) {
                                        fr0Var.b.i(i31);
                                    } else if (i30 >= 0 && i31 < 0) {
                                        fr0Var.b.s(i30);
                                    }
                                } else if (i3 == fr0Var.t0) {
                                    boolean z20 = fr0Var.L;
                                    z11 = !z20;
                                    fr0Var.L = z11;
                                    if (!z20 && fr0Var.M) {
                                        int i32 = fr0Var.k0;
                                        fr0Var.M = false;
                                        fr0Var.w0();
                                        u4.d1 K = fr0Var.c.K(fr0Var.u0);
                                        if (K != null) {
                                            ((org.telegram.ui.Cells.q8) K.a).setChecked(false);
                                        } else {
                                            fr0Var.b.g(fr0Var.u0);
                                        }
                                        fr0Var.b.p(i32, 2);
                                    }
                                } else if (fr0Var.O == 0) {
                                    z10 = !fr0Var.M;
                                    fr0Var.M = z10;
                                    int i33 = fr0Var.k0;
                                    fr0Var.w0();
                                    if (fr0Var.M) {
                                        fr0Var.b.o(fr0Var.k0, 2);
                                    } else {
                                        fr0Var.b.p(i33, 2);
                                    }
                                    if (fr0Var.M && fr0Var.L) {
                                        fr0Var.L = false;
                                        u4.d1 K2 = fr0Var.c.K(fr0Var.t0);
                                        if (K2 != null) {
                                            ((org.telegram.ui.Cells.q8) K2.a).setChecked(false);
                                        } else {
                                            fr0Var.b.g(fr0Var.t0);
                                        }
                                    }
                                    if (fr0Var.M) {
                                        int i34 = 0;
                                        boolean z21 = false;
                                        while (i34 < zArr.length) {
                                            if (z21) {
                                                zArr[i34] = false;
                                            } else if (zArr[i34]) {
                                                z21 = true;
                                            }
                                            i34++;
                                            z21 = z21;
                                        }
                                    }
                                }
                                z10 = z11;
                            }
                        }
                        if (fr0Var.N && !fr0Var.M) {
                            fr0Var.c.getChildCount();
                            fr0Var.h.a();
                        }
                        for (int i35 = fr0Var.o0; i35 < fr0Var.o0 + fr0Var.E; i35++) {
                            u4.d1 K3 = fr0Var.c.K(i35);
                            if (K3 != null) {
                                View view2 = K3.a;
                                if (view2 instanceof org.telegram.ui.Cells.z5) {
                                    org.telegram.ui.Cells.z5 z5Var = (org.telegram.ui.Cells.z5) view2;
                                    z5Var.m(fr0Var.M, true);
                                    z5Var.r.a(zArr[i35 - fr0Var.o0], z19);
                                    if (z5Var.getTop() > org.telegram.messenger.g0.L(40.0f) && i3 == fr0Var.u0 && !fr0Var.N) {
                                        fr0Var.h.c(z5Var.getCheckBox());
                                        fr0Var.N = true;
                                    }
                                }
                            }
                        }
                        q8Var.setChecked(z10);
                        fr0Var.n0();
                        break;
                    }
                }
                break;
            case 24:
                PremiumPreviewFragment.Z((PremiumPreviewFragment) this.b, view, i3);
                break;
            case 25:
                ks0 ks0Var = (ks0) this.b;
                PremiumPreviewFragment premiumPreviewFragment = ks0Var.n;
                ArrayList arrayList10 = premiumPreviewFragment.d;
                rq0 rq0Var = ks0Var.e;
                if (view.isEnabled() && (view instanceof vg.n1)) {
                    vg.n1 n1Var = (vg.n1) view;
                    premiumPreviewFragment.e = arrayList10.indexOf(n1Var.getTier());
                    premiumPreviewFragment.y0(true);
                    n1Var.c(true, true);
                    for (int i36 = 0; i36 < rq0Var.getChildCount(); i36++) {
                        View childAt = rq0Var.getChildAt(i36);
                        if (childAt instanceof vg.n1) {
                            vg.n1 n1Var2 = (vg.n1) childAt;
                            if (n1Var2.getTier() != n1Var.getTier()) {
                                n1Var2.c(false, true);
                            }
                        }
                    }
                    for (int i37 = 0; i37 < rq0Var.getHiddenChildCount(); i37++) {
                        View V = rq0Var.V(i37);
                        if (V instanceof vg.n1) {
                            vg.n1 n1Var3 = (vg.n1) V;
                            if (n1Var3.getTier() != n1Var.getTier()) {
                                n1Var3.c(false, true);
                            }
                        }
                    }
                    for (int i38 = 0; i38 < rq0Var.getCachedChildCount(); i38++) {
                        View P = rq0Var.P(i38);
                        if (P instanceof vg.n1) {
                            vg.n1 n1Var4 = (vg.n1) P;
                            if (n1Var4.getTier() != n1Var.getTier()) {
                                n1Var4.c(false, true);
                            }
                        }
                    }
                    for (int i39 = 0; i39 < rq0Var.getAttachedScrapChildCount(); i39++) {
                        View O = rq0Var.O(i39);
                        if (O instanceof vg.n1) {
                            vg.n1 n1Var5 = (vg.n1) O;
                            if (n1Var5.getTier() != n1Var.getTier()) {
                                n1Var5.c(false, true);
                            }
                        }
                    }
                    FrameLayout frameLayout = premiumPreviewFragment.K;
                    if (!premiumPreviewFragment.getUserConfig().q() || ((ms0Var = premiumPreviewFragment.f) != null && ms0Var.a.months < ((ms0) arrayList10.get(premiumPreviewFragment.e)).a.months && !premiumPreviewFragment.q0)) {
                        z12 = true;
                    }
                    org.telegram.messenger.g0.X3(frameLayout, z12);
                    break;
                }
                break;
            case 26:
                PrivacyControlActivity.c0((PrivacyControlActivity) this.b, view, i3);
                break;
            case 27:
                a(i3, view);
                break;
            case 28:
                ProfileActivity.c0((ProfileActivity) this.b, i3);
                break;
            default:
                ProxyListActivity.Z((ProxyListActivity) this.b, view, i3);
                break;
        }
    }
}
