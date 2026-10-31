package org.telegram.ui;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Intent;
import android.graphics.Paint;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.Switch;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class g implements org.telegram.ui.Components.gk0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ g(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    private final void a(int i10, View view) {
        av0 av0Var = (av0) this.b;
        int i11 = av0Var.D;
        if (i10 == av0Var.x) {
            org.telegram.ui.ActionBar.x1 x1Var = org.telegram.ui.Components.s4.N(av0Var.getParentActivity(), org.telegram.messenger.cd.L0(2131747929, null), org.telegram.messenger.cd.L0(2131747930, null), org.telegram.messenger.cd.L0(2131751599, null), new yu0(av0Var), null).a;
            x1Var.show();
            x1Var.i();
            return;
        }
        if (i10 != av0Var.f) {
            if (i10 < av0Var.r || i10 >= av0Var.s) {
                return;
            }
            if (i11 != 1) {
                new Bundle();
                throw null;
            }
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", av0Var.getMessagesController().G0.keyAt(i10 - av0Var.r));
            av0Var.presentFragment(new ProfileActivity(bundle, null));
            return;
        }
        if (i11 != 1) {
            Bundle g10 = a1.g.g("isNeverShare", true);
            if (i11 == 2) {
                g10.putInt("chatAddType", 2);
            }
            v50 v50Var = new v50(g10);
            v50Var.x = new xu0(av0Var);
            av0Var.presentFragment(v50Var);
            return;
        }
        dv dvVar = new dv(null);
        dvVar.d = new Paint();
        dvVar.f = new cv[2];
        dvVar.x = true;
        Bundle bundle2 = new Bundle();
        bundle2.putBoolean("onlySelect", true);
        bundle2.putBoolean("checkCanWrite", false);
        bundle2.putBoolean("resetDelegate", false);
        bundle2.putInt("dialogsType", 9);
        ay ayVar = new ay(bundle2);
        dvVar.a = ayVar;
        ayVar.C2 = new av(dvVar);
        ayVar.onFragmentCreate();
        Bundle bundle3 = new Bundle();
        bundle3.putBoolean("onlyUsers", true);
        bundle3.putBoolean("destroyAfterSelect", true);
        bundle3.putBoolean("returnAsResult", true);
        bundle3.putBoolean("disableSections", true);
        bundle3.putBoolean("needFinishFragment", false);
        bundle3.putBoolean("resetDelegate", false);
        bundle3.putBoolean("allowSelf", false);
        ContactsActivity contactsActivity = new ContactsActivity(bundle3);
        dvVar.b = contactsActivity;
        contactsActivity.U = new av(dvVar);
        contactsActivity.onFragmentCreate();
        av0Var.presentFragment(dvVar);
    }

    @Override // org.telegram.ui.Components.gk0
    public final void f(int i10, View view) {
        TLRPC.InputStickerSet tL_inputStickerSetShortName;
        TLRPC.Chat chat;
        String L0;
        String a02;
        qt qtVar;
        a00 a00Var;
        org.telegram.ui.Components.cc a03;
        int i11;
        int i12;
        boolean z10;
        fu0 fu0Var;
        int i13 = 3;
        int i14 = 4;
        nt ntVar = null;
        int i15 = 0;
        r5 = false;
        r5 = false;
        boolean z11 = false;
        switch (this.a) {
            case 0:
                j jVar = (j) this.b;
                ArrayList arrayList = jVar.h;
                if (i10 >= 0 && i10 < arrayList.size()) {
                    int i16 = ((h) arrayList.get(i10)).d;
                    if (i16 == 1) {
                        TLRPC.GlobalPrivacySettings globalPrivacySettings = jVar.d;
                        boolean z12 = !globalPrivacySettings.keep_archived_unmuted;
                        globalPrivacySettings.keep_archived_unmuted = z12;
                        ((org.telegram.ui.Cells.t8) view).setChecked(z12);
                        jVar.c = true;
                        break;
                    } else if (i16 == 4) {
                        TLRPC.GlobalPrivacySettings globalPrivacySettings2 = jVar.d;
                        boolean z13 = !globalPrivacySettings2.keep_archived_folders;
                        globalPrivacySettings2.keep_archived_folders = z13;
                        ((org.telegram.ui.Cells.t8) view).setChecked(z13);
                        jVar.c = true;
                        break;
                    } else if (i16 == 7) {
                        if (!jVar.getUserConfig().q() && !jVar.getMessagesController().a4 && !jVar.d.archive_and_mute_new_noncontact_peers) {
                            org.telegram.ui.Components.ob obVar = new org.telegram.ui.Components.ob(jVar.getParentActivity(), jVar.getResourceProvider());
                            org.telegram.ui.Components.p80 p80Var = obVar.b;
                            p80Var.setText(org.telegram.messenger.i0.R2(org.telegram.messenger.cd.L0(2131743891, null), org.telegram.ui.ActionBar.t6.uj, 0, new rr0(jVar, i13), null));
                            p80Var.setSingleLine(false);
                            p80Var.setPadding(0, org.telegram.messenger.i0.L(4.0f), 0, org.telegram.messenger.i0.L(4.0f));
                            obVar.a.setImageResource(R.drawable.msg_settings_premium);
                            org.telegram.ui.Components.wb.g(jVar, obVar, 3500).j();
                            int i17 = -jVar.e;
                            jVar.e = i17;
                            org.telegram.messenger.i0.F3(i17, view, null);
                            org.telegram.messenger.t2.D.a();
                            break;
                        } else {
                            TLRPC.GlobalPrivacySettings globalPrivacySettings3 = jVar.d;
                            boolean z14 = !globalPrivacySettings3.archive_and_mute_new_noncontact_peers;
                            globalPrivacySettings3.archive_and_mute_new_noncontact_peers = z14;
                            ((org.telegram.ui.Cells.t8) view).setChecked(z14);
                            jVar.c = true;
                            break;
                        }
                    }
                }
                break;
            case 1:
                n nVar = (n) this.b;
                if (i10 >= nVar.y && i10 < nVar.D && nVar.getParentActivity() != null) {
                    TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) nVar.h.get(i10 - nVar.y);
                    if (stickerSetCovered.set.id != 0) {
                        tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetID();
                        tL_inputStickerSetShortName.id = stickerSetCovered.set.id;
                    } else {
                        tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
                        tL_inputStickerSetShortName.short_name = stickerSetCovered.set.short_name;
                    }
                    TLRPC.InputStickerSet inputStickerSet = tL_inputStickerSetShortName;
                    inputStickerSet.access_hash = stickerSetCovered.set.access_hash;
                    org.telegram.ui.Components.cx0 cx0Var = new org.telegram.ui.Components.cx0(nVar.getParentActivity(), nVar, inputStickerSet, null, null, null);
                    cx0Var.T1 = new l(nVar, view, stickerSetCovered);
                    nVar.showDialog(cx0Var);
                    break;
                }
                break;
            case 2:
                l01.Y((l01) this.b, i10);
                break;
            case 3:
                xc xcVar = (xc) this.b;
                ArrayList arrayList2 = xcVar.c;
                w71 w71Var = xcVar.d;
                if (i10 >= 0 && i10 < arrayList2.size()) {
                    org.telegram.ui.Components.cp cpVar = (org.telegram.ui.Components.cp) arrayList2.get(i10);
                    xcVar.a(cpVar.a(), true);
                    if (view.getLeft() < org.telegram.messenger.i0.L(24.0f) + w71Var.getPaddingLeft()) {
                        w71Var.w0(-((org.telegram.messenger.i0.L(48.0f) + w71Var.getPaddingLeft()) - view.getLeft()), 0, null);
                    } else if (view.getWidth() + view.getLeft() > (w71Var.getMeasuredWidth() - w71Var.getPaddingRight()) - org.telegram.messenger.i0.L(24.0f)) {
                        w71Var.w0(org.telegram.messenger.m5.B(48.0f, w71Var.getMeasuredWidth() - w71Var.getPaddingRight(), view.getWidth() + view.getLeft()), 0, null);
                    }
                    org.telegram.messenger.q20 q20Var = xcVar.r;
                    if (q20Var != null) {
                        q20Var.a(cpVar.a());
                        break;
                    }
                }
                break;
            case 4:
                qp qpVar = (qp) this.b;
                boolean z15 = qpVar.s;
                if (qpVar.getParentActivity() != null) {
                    s4.g0 adapter = qpVar.b.getAdapter();
                    pp ppVar = qpVar.e;
                    if (adapter == ppVar) {
                        chat = (TLRPC.Chat) ppVar.d.get(i10);
                    } else {
                        int i18 = qpVar.G;
                        chat = (i10 < i18 || i10 >= qpVar.H) ? null : (TLRPC.Chat) qpVar.w.get(i10 - i18);
                    }
                    if (chat != null) {
                        if (!z15 || qpVar.h.linked_chat_id != 0) {
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", chat.id);
                            qpVar.presentFragment(new un(bundle));
                            break;
                        } else {
                            qpVar.e0(chat, true);
                            break;
                        }
                    } else if (i10 == qpVar.F) {
                        if (z15 && qpVar.h.linked_chat_id == 0) {
                            Bundle bundle2 = new Bundle();
                            bundle2.putLongArray("result", new long[]{qpVar.getUserConfig().e()});
                            bundle2.putInt("chatType", 4);
                            TLRPC.Chat chat2 = qpVar.f;
                            if (chat2 != null) {
                                bundle2.putString("title", org.telegram.messenger.cd.a0("GroupCreateDiscussionDefaultName", null, 2131749463, chat2.title));
                            }
                            c60 c60Var = new c60(bundle2);
                            c60Var.Y = new hp(qpVar);
                            qpVar.presentFragment(c60Var);
                            break;
                        } else if (!qpVar.w.isEmpty()) {
                            TLRPC.Chat chat3 = (TLRPC.Chat) qpVar.w.get(0);
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(qpVar.getParentActivity());
                            if (z15) {
                                L0 = org.telegram.messenger.cd.L0(2131751372, null);
                                a02 = org.telegram.messenger.cd.a0("DiscussionUnlinkChannelAlert", null, 2131751373, chat3.title);
                            } else {
                                L0 = org.telegram.messenger.cd.L0(2131751374, null);
                                a02 = org.telegram.messenger.cd.a0("DiscussionUnlinkGroupAlert", null, 2131751371, chat3.title);
                            }
                            alertDialog$Builder.a.R = L0;
                            alertDialog$Builder.a.T = org.telegram.messenger.i0.W2(a02);
                            alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131751375, null), new y0(qpVar, 24));
                            alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131752589, null), null);
                            org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
                            qpVar.showDialog(x1Var);
                            TextView textView = (TextView) x1Var.d(-1);
                            if (textView != null) {
                                org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.q7, null);
                                break;
                            }
                        }
                    }
                }
                break;
            case 5:
                xp xpVar = (xp) this.b;
                ArrayList arrayList3 = xpVar.n;
                if (i10 > 2) {
                    org.telegram.ui.Cells.x xVar = (org.telegram.ui.Cells.x) view;
                    TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) arrayList3.get(i10 - 3);
                    boolean contains = xpVar.d.contains(tL_availableReaction.reaction);
                    boolean z16 = !contains;
                    if (contains) {
                        xpVar.d.remove(tL_availableReaction.reaction);
                        if (xpVar.d.isEmpty()) {
                            wp wpVar = xpVar.h;
                            if (wpVar != null) {
                                wpVar.p(2, arrayList3.size() + 1);
                            }
                            xpVar.Z(2, true);
                        }
                    } else {
                        xpVar.d.add(tL_availableReaction.reaction);
                    }
                    Switch r22 = xVar.c;
                    if (r22 != null) {
                        r22.c(z16, true);
                    }
                    org.telegram.ui.Components.ep epVar = xVar.d;
                    if (epVar != null) {
                        epVar.a(z16, true);
                        break;
                    }
                }
                break;
            case 6:
                gt gtVar = (gt) this.b;
                TLRPC.StickerSetCovered stickerSetCovered2 = ((kt) view).d;
                lt ltVar = gtVar.a;
                sg.b0 reactionsWindow = ltVar.P.getReactionsWindow();
                if (reactionsWindow != null && !reactionsWindow.q) {
                    reactionsWindow.d();
                }
                if (stickerSetCovered2 instanceof TLRPC.TL_stickerSetNoCovered) {
                    org.telegram.ui.Components.hx0.c(null, ltVar.c0, ltVar.z.getContext(), new z4(gtVar, 9));
                    break;
                } else {
                    jt jtVar = ltVar.l;
                    if (jtVar != null) {
                        jtVar.u(stickerSetCovered2.set, TextUtils.join("", ltVar.o));
                    }
                    ltVar.o();
                    break;
                }
                break;
            case 7:
                rt rtVar = (rt) this.b;
                if (rtVar.f && rtVar.e) {
                    org.telegram.ui.Components.pj pjVar = rtVar.d;
                    ArrayList arrayList4 = pjVar.e;
                    if (arrayList4 != null && i10 >= 0 && i10 < arrayList4.size()) {
                        ntVar = (nt) pjVar.e.get(i10);
                    }
                } else {
                    int S = rtVar.c.S(i10);
                    int Q = rtVar.c.Q(i10);
                    if (Q >= 0 && S >= 0) {
                        ntVar = rtVar.c.O(S, Q);
                    }
                }
                if (i10 >= 0) {
                    rtVar.finishFragment();
                    if (ntVar != null && (qtVar = rtVar.r) != null) {
                        qtVar.c(ntVar);
                        break;
                    }
                }
                break;
            case 8:
                ju juVar = (ju) this.b;
                ArrayList arrayList5 = juVar.j3;
                mu muVar = juVar.v3;
                if (!(view instanceof du) || i10 < 0 || i10 >= arrayList5.size()) {
                    if (view instanceof org.telegram.ui.Cells.p8) {
                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(muVar.getParentActivity());
                        alertDialog$Builder2.a.R = org.telegram.messenger.cd.L0(2131746106, null);
                        alertDialog$Builder2.a.T = org.telegram.messenger.cd.L0(2131746107, null);
                        alertDialog$Builder2.k(org.telegram.messenger.cd.L0(2131746135, null), new gu(juVar));
                        alertDialog$Builder2.h(org.telegram.messenger.cd.L0(2131752589, null), null);
                        org.telegram.ui.ActionBar.x1 x1Var2 = alertDialog$Builder2.a;
                        muVar.showDialog(x1Var2);
                        TextView textView2 = (TextView) x1Var2.d(-1);
                        if (textView2 != null) {
                            org.telegram.ui.ActionBar.a7.V(textView2, org.telegram.ui.ActionBar.t6.q7, null);
                            break;
                        }
                    }
                } else {
                    fu fuVar = (fu) arrayList5.get(i10);
                    if (fuVar != null) {
                        int i19 = fuVar.h;
                        if (i19 >= 0) {
                            juVar.p3[i19] = !r3[i19];
                            juVar.D1(true);
                            break;
                        } else if (i19 == -2) {
                            muVar.presentFragment(new DataAutoDownloadActivity(juVar.f3 - 1));
                            break;
                        }
                    }
                }
                break;
            case 9:
                iz.Z((iz) this.b, view, i10);
                break;
            case 10:
                i00 i00Var = (i00) this.b;
                if (i00Var.getParentActivity() != null && (a00Var = (a00) i00Var.P.get(i10)) != null) {
                    View.OnClickListener onClickListener = a00Var.c;
                    if (onClickListener != null) {
                        onClickListener.onClick(view);
                        break;
                    } else {
                        int i20 = a00Var.a;
                        boolean z17 = true;
                        if (i20 == 1) {
                            org.telegram.ui.Cells.pa paVar = (org.telegram.ui.Cells.pa) view;
                            i00Var.A0(a00Var, paVar.getName(), paVar.getCurrentObject(), a00Var.g);
                            break;
                        } else if (i20 == 7) {
                            xs xsVar = new xs(14, i00Var, a00Var);
                            if (i00Var.c.x.f) {
                                i00Var.x0(xsVar, false);
                                break;
                            } else {
                                xsVar.run();
                                break;
                            }
                        } else if (i20 == 8 || (i20 == 4 && a00Var.k == R.drawable.msg2_link2)) {
                            org.telegram.messenger.ap apVar = i00Var.r;
                            org.telegram.messenger.t2 t2Var = org.telegram.messenger.t2.D;
                            org.telegram.ui.ActionBar.p6 p6Var = null;
                            if (!i00Var.s || !i00Var.c.x.f) {
                                if (!TextUtils.isEmpty(i00Var.x) || !TextUtils.isEmpty(apVar.b)) {
                                    int i21 = i00Var.D;
                                    int i22 = org.telegram.messenger.vp.D8;
                                    if ((i21 & (-1537)) == 0 && i00Var.G.isEmpty() && !i00Var.F.isEmpty()) {
                                        i00Var.x0(new mz(i00Var, 1), false);
                                        break;
                                    }
                                }
                                float f7 = -i00Var.Q;
                                i00Var.Q = f7;
                                org.telegram.messenger.i0.F3(f7, view, null);
                                t2Var.a();
                                if (TextUtils.isEmpty(i00Var.x) && TextUtils.isEmpty(apVar.b)) {
                                    a03 = org.telegram.ui.Components.cc.a0(i00Var);
                                    i11 = 2131750763;
                                } else {
                                    int i23 = i00Var.D;
                                    int i24 = org.telegram.messenger.vp.D8;
                                    if ((i23 & (-1537)) != 0) {
                                        if (i00Var.G.isEmpty()) {
                                            a03 = org.telegram.ui.Components.cc.a0(i00Var);
                                            i11 = 2131750761;
                                        } else {
                                            a03 = org.telegram.ui.Components.cc.a0(i00Var);
                                            i11 = 2131750760;
                                        }
                                    } else if (i00Var.F.isEmpty()) {
                                        a03 = org.telegram.ui.Components.cc.a0(i00Var);
                                        i11 = 2131750764;
                                    } else {
                                        a03 = org.telegram.ui.Components.cc.a0(i00Var);
                                        i11 = 2131750762;
                                    }
                                }
                                org.telegram.messenger.m5.o(null, i11, a03, null);
                                break;
                            } else {
                                float f10 = -i00Var.Q;
                                i00Var.Q = f10;
                                org.telegram.messenger.i0.F3(f10, view, null);
                                t2Var.a();
                                i00Var.w = true;
                                ij ijVar = i00Var.R;
                                if (ijVar == null || ijVar.getVisibility() != 0) {
                                    ij ijVar2 = new ij(6, 2, i00Var.getParentActivity(), p6Var, z17);
                                    i00Var.R = ijVar2;
                                    ijVar2.a.setMaxWidth(org.telegram.messenger.i0.q.x);
                                    i00Var.R.setExtraTranslationY(org.telegram.messenger.i0.L(-16.0f));
                                    i00Var.R.setText(org.telegram.messenger.cd.L0(2131750776, null));
                                    ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
                                    marginLayoutParams.rightMargin = org.telegram.messenger.i0.L(3.0f);
                                    i00Var.getParentLayout().getOverlayContainerView().addView(i00Var.R, marginLayoutParams);
                                    i00Var.R.f(i00Var.c, true);
                                    break;
                                }
                            }
                        }
                    }
                }
                break;
            case 11:
                wz wzVar = (wz) this.b;
                ArrayList arrayList6 = wzVar.W1;
                int i25 = i10 - 1;
                if (i25 >= 0 && i25 < arrayList6.size()) {
                    a00 a00Var2 = (a00) arrayList6.get(i25);
                    int i26 = a00Var2.a;
                    if (i26 == 7) {
                        wzVar.dismiss();
                        wzVar.o1.presentFragment(new iz(wzVar.Q1, a00Var2.m));
                        break;
                    } else if (i26 == 8) {
                        wzVar.d1();
                        break;
                    }
                }
                break;
            case 12:
                z00 z00Var = (z00) this.b;
                if (view instanceof org.telegram.ui.Cells.l7) {
                    z00Var.f(i10, view, ((org.telegram.ui.Cells.l7) view).getMessage(), 0);
                    break;
                } else if (view instanceof org.telegram.ui.Cells.o7) {
                    z00Var.f(i10, view, ((org.telegram.ui.Cells.o7) view).getMessage(), 0);
                    break;
                } else if (view instanceof org.telegram.ui.Cells.k7) {
                    z00Var.f(i10, view, ((org.telegram.ui.Cells.k7) view).getMessage(), 0);
                    break;
                } else if (view instanceof org.telegram.ui.Cells.h2) {
                    z00Var.f(i10, view, ((org.telegram.ui.Cells.h2) view).getMessageObject(), 0);
                    break;
                } else if (view instanceof org.telegram.ui.Cells.v2) {
                    z00Var.f(i10, view, ((org.telegram.ui.Cells.v2) view).getMessage(), 0);
                    break;
                }
                break;
            case 13:
                e60 e60Var = (e60) this.b;
                if (e60Var.getParentActivity() != null) {
                    if (i10 == e60Var.n || i10 == 0) {
                        if (e60Var.f != null) {
                            try {
                                ((ClipboardManager) org.telegram.messenger.w0.b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", e60Var.f.link));
                                org.telegram.ui.Components.cc.j(e60Var).j();
                                break;
                            } catch (Exception e) {
                                org.telegram.messenger.f8.g(e, true);
                                return;
                            }
                        }
                    } else if (i10 != e60Var.s) {
                        if (i10 == e60Var.r) {
                            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(e60Var.getParentActivity());
                            alertDialog$Builder3.a.T = org.telegram.messenger.cd.L0(2131746043, null);
                            alertDialog$Builder3.a.R = org.telegram.messenger.cd.L0(2131746040, null);
                            alertDialog$Builder3.k(org.telegram.messenger.cd.L0(2131746041, null), new tt(e60Var, 13));
                            alertDialog$Builder3.h(org.telegram.messenger.cd.L0(2131752589, null), null);
                            e60Var.showDialog(alertDialog$Builder3.a);
                            break;
                        }
                    } else if (e60Var.f != null) {
                        try {
                            Intent intent = new Intent("android.intent.action.SEND");
                            intent.setType("text/plain");
                            intent.putExtra("android.intent.extra.TEXT", e60Var.f.link);
                            e60Var.getParentActivity().startActivityForResult(Intent.createChooser(intent, org.telegram.messenger.cd.L0(2131749120, null)), 500);
                            break;
                        } catch (Exception e7) {
                            org.telegram.messenger.f8.g(e7, true);
                            return;
                        }
                    }
                }
                break;
            case 14:
                k60.Y((k60) this.b, view, i10);
                break;
            case 15:
                y60.Y((y60) this.b, view, i10);
                break;
            case 16:
                LanguageSelectActivity.Y((LanguageSelectActivity) this.b, view, i10);
                break;
            case 17:
                ((kh0) this.b).onBackPressed();
                break;
            case 18:
                sh0 sh0Var = (sh0) this.b;
                int i27 = sh0Var.I;
                if (i10 >= i27 && i10 < sh0Var.J) {
                    org.telegram.messenger.jj jjVar = (org.telegram.messenger.jj) sh0Var.y.get(i10 - i27);
                    if (!jjVar.x4()) {
                        long B0 = org.telegram.messenger.jj.B0(jjVar.k);
                        Bundle bundle3 = new Bundle();
                        if (org.telegram.messenger.o5.E(B0)) {
                            bundle3.putLong("user_id", B0);
                        } else {
                            bundle3.putLong("chat_id", -B0);
                        }
                        bundle3.putInt("message_id", jjVar.f1());
                        bundle3.putBoolean("need_remove_previous_same_chat_activity", false);
                        if (sh0Var.getMessagesController().E(bundle3, sh0Var, null, null)) {
                            sh0Var.presentFragment(new un(bundle3));
                            break;
                        }
                    } else if (!sh0Var.f0(jjVar)) {
                        sh0Var.getOrCreateStoryViewer().U(sh0Var.getParentActivity(), jjVar.l, th.n5.a(sh0Var.f));
                        break;
                    }
                }
                break;
            case 19:
                PasscodeActivity.Z((PasscodeActivity) this.b, view, i10);
                break;
            case 20:
                sn0 sn0Var = (sn0) this.b;
                sn0Var.a(i10, true);
                fn0 fn0Var = sn0Var.h;
                if (fn0Var != null) {
                    fn0Var.a(Integer.valueOf(i10));
                    break;
                }
                break;
            case 21:
                lo0 lo0Var = (lo0) this.b;
                ArrayList arrayList7 = lo0Var.f;
                ArrayList arrayList8 = lo0Var.n;
                org.telegram.messenger.we weVar = lo0Var.J;
                if (weVar != null || !arrayList7.isEmpty()) {
                    if (weVar != null) {
                        arrayList7 = weVar.e;
                    }
                    if (i10 >= 0 && i10 < arrayList7.size()) {
                        org.telegram.ui.ActionBar.t0 t0Var = lo0Var.P;
                        if (t0Var != null) {
                            org.telegram.messenger.i0.v1(t0Var.getSearchField());
                        }
                        if (lo0Var.Y) {
                            lo0Var.e0(view, arrayList7.get(i10));
                            break;
                        } else {
                            int i28 = lo0Var.T;
                            if (i28 == 1 || i28 == 3) {
                                i15 = 1;
                            } else {
                                if (i28 != 2) {
                                    i13 = 10;
                                    if (i28 != 10) {
                                        if (lo0Var.U == null) {
                                            i15 = 4;
                                        }
                                    }
                                }
                                i15 = i13;
                            }
                            PhotoViewer.v1().N2(null, lo0Var, null);
                            PhotoViewer v12 = PhotoViewer.v1();
                            int i29 = lo0Var.H;
                            boolean z18 = lo0Var.I;
                            v12.h = i29;
                            v12.n = z18;
                            PhotoViewer.v1().j2(arrayList7, i10, i15, lo0Var.l0, lo0Var.x0, lo0Var.U);
                            break;
                        }
                    }
                } else if (i10 < arrayList8.size()) {
                    String str = (String) arrayList8.get(i10);
                    mo0 mo0Var = lo0Var.t0;
                    if (mo0Var != null) {
                        switch (mo0Var.a) {
                            case 1:
                                oo0.l0(mo0Var.b, str);
                                break;
                            default:
                                oo0.l0(mo0Var.b, str);
                                break;
                        }
                    } else {
                        lo0Var.P.getSearchField().setText(str);
                        lo0Var.P.getSearchField().setSelection(str.length());
                        lo0Var.f0(lo0Var.P.getSearchField());
                        break;
                    }
                } else if (i10 == arrayList8.size() + 1) {
                    AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(lo0Var.getParentActivity());
                    alertDialog$Builder4.a.R = org.telegram.messenger.cd.L0(2131752056, null);
                    alertDialog$Builder4.a.T = org.telegram.messenger.cd.L0(2131752061, null);
                    alertDialog$Builder4.k(org.telegram.messenger.cd.L0(2131752099, null), new co0(lo0Var, i14));
                    alertDialog$Builder4.h(org.telegram.messenger.cd.L0(2131752589, null), null);
                    org.telegram.ui.ActionBar.x1 x1Var3 = alertDialog$Builder4.a;
                    lo0Var.showDialog(x1Var3);
                    TextView textView3 = (TextView) x1Var3.d(-1);
                    if (textView3 != null) {
                        org.telegram.ui.ActionBar.a7.V(textView3, org.telegram.ui.ActionBar.t6.q7, null);
                        break;
                    }
                }
                break;
            case 22:
                PhotoViewer photoViewer = (PhotoViewer) this.b;
                ArrayList arrayList9 = photoViewer.g7;
                if (!arrayList9.isEmpty() && (i12 = photoViewer.P4) >= 0 && i12 < arrayList9.size()) {
                    Object obj = arrayList9.get(photoViewer.P4);
                    if (obj instanceof org.telegram.messenger.ze) {
                        ((org.telegram.messenger.ze) obj).s = photoViewer.p1();
                    }
                }
                photoViewer.k5 = true;
                int indexOf = arrayList9.indexOf(view.getTag());
                if (indexOf >= 0) {
                    photoViewer.P4 = -1;
                    photoViewer.E2(indexOf);
                }
                photoViewer.k5 = false;
                break;
            case 23:
                at0 at0Var = (at0) this.b;
                boolean[] zArr = at0Var.x;
                if (i10 == at0Var.o0) {
                    at0Var.j0();
                    break;
                } else if (view instanceof org.telegram.ui.Cells.t8) {
                    org.telegram.ui.Cells.t8 t8Var = (org.telegram.ui.Cells.t8) view;
                    boolean z19 = at0Var.L;
                    org.telegram.ui.Components.sx0 sx0Var = at0Var.Q;
                    if (sx0Var != null) {
                        sx0Var.f();
                    }
                    if (at0Var.I) {
                        int i30 = -at0Var.O;
                        at0Var.O = i30;
                        org.telegram.messenger.i0.F3(i30, t8Var, null);
                        org.telegram.messenger.t2.D.a();
                        break;
                    } else {
                        if (i10 == at0Var.r0) {
                            z10 = !at0Var.G;
                            at0Var.G = z10;
                        } else {
                            int i31 = at0Var.u0;
                            if (i10 == i31) {
                                z10 = !at0Var.H;
                                at0Var.H = z10;
                            } else if (i10 == at0Var.v0) {
                                z10 = !at0Var.J;
                                at0Var.J = z10;
                                at0Var.v0();
                                int i32 = at0Var.u0;
                                if (i32 >= 0 && i31 < 0) {
                                    at0Var.b.i(i32);
                                } else if (i31 >= 0 && i32 < 0) {
                                    at0Var.b.s(i31);
                                }
                            } else if (i10 == at0Var.s0) {
                                boolean z20 = at0Var.K;
                                boolean z21 = !z20;
                                at0Var.K = z21;
                                if (!z20 && at0Var.L) {
                                    int i33 = at0Var.j0;
                                    at0Var.L = false;
                                    at0Var.v0();
                                    s4.c1 K = at0Var.c.K(at0Var.t0);
                                    if (K != null) {
                                        ((org.telegram.ui.Cells.t8) K.a).setChecked(false);
                                    } else {
                                        at0Var.b.g(at0Var.t0);
                                    }
                                    at0Var.b.p(i33, 2);
                                }
                                z10 = z21;
                            } else if (at0Var.N == 0) {
                                boolean z22 = !at0Var.L;
                                at0Var.L = z22;
                                int i34 = at0Var.j0;
                                at0Var.v0();
                                if (at0Var.L) {
                                    at0Var.b.o(at0Var.j0, 2);
                                } else {
                                    at0Var.b.p(i34, 2);
                                }
                                if (at0Var.L && at0Var.K) {
                                    at0Var.K = false;
                                    s4.c1 K2 = at0Var.c.K(at0Var.s0);
                                    if (K2 != null) {
                                        ((org.telegram.ui.Cells.t8) K2.a).setChecked(false);
                                    } else {
                                        at0Var.b.g(at0Var.s0);
                                    }
                                }
                                if (at0Var.L) {
                                    int i35 = 0;
                                    boolean z23 = false;
                                    while (i35 < zArr.length) {
                                        if (z23) {
                                            zArr[i35] = false;
                                        } else if (zArr[i35]) {
                                            z23 = true;
                                        }
                                        i35++;
                                        z23 = z23;
                                    }
                                }
                                z10 = z22;
                            }
                        }
                        if (at0Var.M && !at0Var.L) {
                            at0Var.c.getChildCount();
                            at0Var.h.b(true);
                        }
                        for (int i36 = at0Var.n0; i36 < at0Var.n0 + at0Var.D; i36++) {
                            s4.c1 K3 = at0Var.c.K(i36);
                            if (K3 != null) {
                                View view2 = K3.a;
                                if (view2 instanceof org.telegram.ui.Cells.e6) {
                                    org.telegram.ui.Cells.e6 e6Var = (org.telegram.ui.Cells.e6) view2;
                                    e6Var.m(at0Var.L, true);
                                    e6Var.r.a(zArr[i36 - at0Var.n0], z19);
                                    if (e6Var.getTop() > org.telegram.messenger.i0.L(40.0f) && i10 == at0Var.t0 && !at0Var.M) {
                                        at0Var.h.f(e6Var.getCheckBox(), true);
                                        at0Var.M = true;
                                    }
                                }
                            }
                        }
                        t8Var.setChecked(z10);
                        at0Var.m0();
                        break;
                    }
                }
                break;
            case 24:
                PremiumPreviewFragment.Y((PremiumPreviewFragment) this.b, view, i10);
                break;
            case 25:
                du0 du0Var = (du0) this.b;
                PremiumPreviewFragment premiumPreviewFragment = du0Var.n;
                ArrayList arrayList10 = premiumPreviewFragment.d;
                ls0 ls0Var = du0Var.e;
                if (view.isEnabled() && (view instanceof kg.a2)) {
                    kg.a2 a2Var = (kg.a2) view;
                    premiumPreviewFragment.e = arrayList10.indexOf(a2Var.getTier());
                    premiumPreviewFragment.x0(true);
                    a2Var.c(true, true);
                    for (int i37 = 0; i37 < ls0Var.getChildCount(); i37++) {
                        View childAt = ls0Var.getChildAt(i37);
                        if (childAt instanceof kg.a2) {
                            kg.a2 a2Var2 = (kg.a2) childAt;
                            if (a2Var2.getTier() != a2Var.getTier()) {
                                a2Var2.c(false, true);
                            }
                        }
                    }
                    for (int i38 = 0; i38 < ls0Var.getHiddenChildCount(); i38++) {
                        View V = ls0Var.V(i38);
                        if (V instanceof kg.a2) {
                            kg.a2 a2Var3 = (kg.a2) V;
                            if (a2Var3.getTier() != a2Var.getTier()) {
                                a2Var3.c(false, true);
                            }
                        }
                    }
                    for (int i39 = 0; i39 < ls0Var.getCachedChildCount(); i39++) {
                        View P = ls0Var.P(i39);
                        if (P instanceof kg.a2) {
                            kg.a2 a2Var4 = (kg.a2) P;
                            if (a2Var4.getTier() != a2Var.getTier()) {
                                a2Var4.c(false, true);
                            }
                        }
                    }
                    for (int i40 = 0; i40 < ls0Var.getAttachedScrapChildCount(); i40++) {
                        View O = ls0Var.O(i40);
                        if (O instanceof kg.a2) {
                            kg.a2 a2Var5 = (kg.a2) O;
                            if (a2Var5.getTier() != a2Var.getTier()) {
                                a2Var5.c(false, true);
                            }
                        }
                    }
                    FrameLayout frameLayout = premiumPreviewFragment.J;
                    if (!premiumPreviewFragment.getUserConfig().q() || ((fu0Var = premiumPreviewFragment.f) != null && fu0Var.a.months < ((fu0) arrayList10.get(premiumPreviewFragment.e)).a.months && !premiumPreviewFragment.p0)) {
                        z11 = true;
                    }
                    org.telegram.messenger.i0.W3(frameLayout, z11);
                    break;
                }
                break;
            case 26:
                PrivacyControlActivity.b0((PrivacyControlActivity) this.b, view, i10);
                break;
            case 27:
                a(i10, view);
                break;
            case 28:
                ProfileActivity.b0((ProfileActivity) this.b, i10);
                break;
            default:
                ProxyListActivity.Y((ProxyListActivity) this.b, view, i10);
                break;
        }
    }
}
