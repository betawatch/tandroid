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

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class h implements org.telegram.ui.Components.qj0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ h(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    private final void a(int i7, View view) {
        rt0 rt0Var = (rt0) this.b;
        int i10 = rt0Var.E;
        if (i7 == rt0Var.x) {
            org.telegram.ui.ActionBar.t1 t1Var = org.telegram.ui.Components.b5.L(rt0Var.getParentActivity(), org.telegram.messenger.gd.N0(2131747719, null), org.telegram.messenger.gd.N0(2131747720, null), org.telegram.messenger.gd.N0(2131751586, null), new pt0(rt0Var), null).a;
            t1Var.show();
            t1Var.i();
            return;
        }
        if (i7 != rt0Var.f) {
            if (i7 < rt0Var.r || i7 >= rt0Var.s) {
                return;
            }
            if (i10 != 1) {
                new Bundle();
                throw null;
            }
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", rt0Var.getMessagesController().H0.keyAt(i7 - rt0Var.r));
            rt0Var.presentFragment(new ProfileActivity(bundle, null));
            return;
        }
        if (i10 != 1) {
            Bundle k10 = a8.p0.k("isNeverShare", true);
            if (i10 == 2) {
                k10.putInt("chatAddType", 2);
            }
            y40 y40Var = new y40(k10);
            y40Var.x = new ot0(rt0Var);
            rt0Var.presentFragment(y40Var);
            return;
        }
        du duVar = new du(null);
        duVar.d = new Paint();
        duVar.f = new cu[2];
        duVar.x = true;
        Bundle bundle2 = new Bundle();
        bundle2.putBoolean("onlySelect", true);
        bundle2.putBoolean("checkCanWrite", false);
        bundle2.putBoolean("resetDelegate", false);
        bundle2.putInt("dialogsType", 9);
        bx bxVar = new bx(bundle2);
        duVar.a = bxVar;
        bxVar.E2 = new au(duVar);
        bxVar.onFragmentCreate();
        Bundle bundle3 = new Bundle();
        bundle3.putBoolean("onlyUsers", true);
        bundle3.putBoolean("destroyAfterSelect", true);
        bundle3.putBoolean("returnAsResult", true);
        bundle3.putBoolean("disableSections", true);
        bundle3.putBoolean("needFinishFragment", false);
        bundle3.putBoolean("resetDelegate", false);
        bundle3.putBoolean("allowSelf", false);
        ContactsActivity contactsActivity = new ContactsActivity(bundle3);
        duVar.b = contactsActivity;
        contactsActivity.V = new au(duVar);
        contactsActivity.onFragmentCreate();
        rt0Var.presentFragment(duVar);
    }

    @Override // org.telegram.ui.Components.qj0
    public final void b(int i7, View view) {
        TLRPC.InputStickerSet tL_inputStickerSetShortName;
        TLRPC.Chat chat;
        String N0;
        String a02;
        ss ssVar;
        bz bzVar;
        org.telegram.ui.Components.kc b02;
        int i10;
        int i11;
        boolean z10;
        boolean z11;
        ws0 ws0Var;
        int i12 = 3;
        int i13 = 4;
        ps psVar = null;
        boolean z12 = false;
        z12 = false;
        z12 = false;
        int i14 = 1;
        switch (this.a) {
            case 0:
                k kVar = (k) this.b;
                ArrayList arrayList = kVar.h;
                if (i7 >= 0 && i7 < arrayList.size()) {
                    int i15 = ((i) arrayList.get(i7)).d;
                    if (i15 == 1) {
                        TLRPC.GlobalPrivacySettings globalPrivacySettings = kVar.d;
                        boolean z13 = !globalPrivacySettings.keep_archived_unmuted;
                        globalPrivacySettings.keep_archived_unmuted = z13;
                        ((org.telegram.ui.Cells.r8) view).setChecked(z13);
                        kVar.c = true;
                        break;
                    } else if (i15 == 4) {
                        TLRPC.GlobalPrivacySettings globalPrivacySettings2 = kVar.d;
                        boolean z14 = !globalPrivacySettings2.keep_archived_folders;
                        globalPrivacySettings2.keep_archived_folders = z14;
                        ((org.telegram.ui.Cells.r8) view).setChecked(z14);
                        kVar.c = true;
                        break;
                    } else if (i15 == 7) {
                        if (!kVar.getUserConfig().q() && !kVar.getMessagesController().b4 && !kVar.d.archive_and_mute_new_noncontact_peers) {
                            org.telegram.ui.Components.xb xbVar = new org.telegram.ui.Components.xb(kVar.getParentActivity(), kVar.getResourceProvider());
                            org.telegram.ui.Components.j80 j80Var = xbVar.b;
                            j80Var.setText(org.telegram.messenger.g0.R2(org.telegram.messenger.gd.N0(2131743619, null), org.telegram.ui.ActionBar.n6.xj, 0, new hq0(kVar, i12), null));
                            j80Var.setSingleLine(false);
                            j80Var.setPadding(0, org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f));
                            xbVar.a.setImageResource(R.drawable.msg_settings_premium);
                            org.telegram.ui.Components.fc.g(kVar, xbVar, 3500).j();
                            int i16 = -kVar.e;
                            kVar.e = i16;
                            org.telegram.messenger.g0.E3(i16, view, null);
                            org.telegram.messenger.q2.E.a();
                            break;
                        } else {
                            TLRPC.GlobalPrivacySettings globalPrivacySettings3 = kVar.d;
                            boolean z15 = !globalPrivacySettings3.archive_and_mute_new_noncontact_peers;
                            globalPrivacySettings3.archive_and_mute_new_noncontact_peers = z15;
                            ((org.telegram.ui.Cells.r8) view).setChecked(z15);
                            kVar.c = true;
                            break;
                        }
                    }
                }
                break;
            case 1:
                o oVar = (o) this.b;
                if (i7 >= oVar.y && i7 < oVar.E && oVar.getParentActivity() != null) {
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
                    org.telegram.ui.Components.jw0 jw0Var = new org.telegram.ui.Components.jw0(oVar.getParentActivity(), oVar, inputStickerSet, null, null, null);
                    jw0Var.X1 = new m(oVar, view, stickerSetCovered);
                    oVar.showDialog(jw0Var);
                    break;
                }
                break;
            case 2:
                yy0.Z((yy0) this.b, i7);
                break;
            case 3:
                oc ocVar = (oc) this.b;
                ArrayList arrayList2 = ocVar.c;
                d61 d61Var = ocVar.d;
                if (i7 >= 0 && i7 < arrayList2.size()) {
                    org.telegram.ui.Components.jp jpVar = (org.telegram.ui.Components.jp) arrayList2.get(i7);
                    ocVar.a(jpVar.a(), true);
                    if (view.getLeft() < org.telegram.messenger.g0.L(24.0f) + d61Var.getPaddingLeft()) {
                        d61Var.w0(-((org.telegram.messenger.g0.L(48.0f) + d61Var.getPaddingLeft()) - view.getLeft()), 0, null);
                    } else if (view.getWidth() + view.getLeft() > (d61Var.getMeasuredWidth() - d61Var.getPaddingRight()) - org.telegram.messenger.g0.L(24.0f)) {
                        d61Var.w0(org.telegram.messenger.f3.B(48.0f, d61Var.getMeasuredWidth() - d61Var.getPaddingRight(), view.getWidth() + view.getLeft()), 0, null);
                    }
                    org.telegram.messenger.w10 w10Var = ocVar.r;
                    if (w10Var != null) {
                        w10Var.a(jpVar.a());
                        break;
                    }
                }
                break;
            case 4:
                uo uoVar = (uo) this.b;
                boolean z16 = uoVar.s;
                if (uoVar.getParentActivity() != null) {
                    v4.i0 adapter = uoVar.b.getAdapter();
                    to toVar = uoVar.e;
                    if (adapter == toVar) {
                        chat = (TLRPC.Chat) toVar.d.get(i7);
                    } else {
                        int i17 = uoVar.H;
                        chat = (i7 < i17 || i7 >= uoVar.I) ? null : (TLRPC.Chat) uoVar.w.get(i7 - i17);
                    }
                    if (chat != null) {
                        if (!z16 || uoVar.h.linked_chat_id != 0) {
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", chat.id);
                            uoVar.presentFragment(new bn(bundle));
                            break;
                        } else {
                            uoVar.f0(chat, true);
                            break;
                        }
                    } else if (i7 == uoVar.G) {
                        if (z16 && uoVar.h.linked_chat_id == 0) {
                            Bundle bundle2 = new Bundle();
                            bundle2.putLongArray("result", new long[]{uoVar.getUserConfig().e()});
                            bundle2.putInt("chatType", 4);
                            TLRPC.Chat chat2 = uoVar.f;
                            if (chat2 != null) {
                                bundle2.putString("title", org.telegram.messenger.gd.a0("GroupCreateDiscussionDefaultName", null, 2131749261, chat2.title));
                            }
                            e50 e50Var = new e50(bundle2);
                            e50Var.Z = new mo(uoVar);
                            uoVar.presentFragment(e50Var);
                            break;
                        } else if (!uoVar.w.isEmpty()) {
                            TLRPC.Chat chat3 = (TLRPC.Chat) uoVar.w.get(0);
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(uoVar.getParentActivity());
                            if (z16) {
                                N0 = org.telegram.messenger.gd.N0(2131751359, null);
                                a02 = org.telegram.messenger.gd.a0("DiscussionUnlinkChannelAlert", null, 2131751360, chat3.title);
                            } else {
                                N0 = org.telegram.messenger.gd.N0(2131751361, null);
                                a02 = org.telegram.messenger.gd.a0("DiscussionUnlinkGroupAlert", null, 2131751358, chat3.title);
                            }
                            alertDialog$Builder.a.S = N0;
                            alertDialog$Builder.a.U = org.telegram.messenger.g0.W2(a02);
                            alertDialog$Builder.k(org.telegram.messenger.gd.N0(2131751362, null), new w0(uoVar, 25));
                            alertDialog$Builder.h(org.telegram.messenger.gd.N0(2131752577, null), null);
                            org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
                            uoVar.showDialog(t1Var);
                            TextView textView = (TextView) t1Var.d(-1);
                            if (textView != null) {
                                org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.q7, null);
                                break;
                            }
                        }
                    }
                }
                break;
            case 5:
                bp bpVar = (bp) this.b;
                ArrayList arrayList3 = bpVar.n;
                if (i7 > 2) {
                    org.telegram.ui.Cells.x xVar = (org.telegram.ui.Cells.x) view;
                    TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) arrayList3.get(i7 - 3);
                    boolean contains = bpVar.d.contains(tL_availableReaction.reaction);
                    boolean z17 = !contains;
                    if (contains) {
                        bpVar.d.remove(tL_availableReaction.reaction);
                        if (bpVar.d.isEmpty()) {
                            ap apVar = bpVar.h;
                            if (apVar != null) {
                                apVar.p(2, arrayList3.size() + 1);
                            }
                            bpVar.a0(2, true);
                        }
                    } else {
                        bpVar.d.add(tL_availableReaction.reaction);
                    }
                    Switch r22 = xVar.c;
                    if (r22 != null) {
                        r22.c(z17, true);
                    }
                    org.telegram.ui.Components.lp lpVar = xVar.d;
                    if (lpVar != null) {
                        lpVar.a(z17, true);
                        break;
                    }
                }
                break;
            case 6:
                js jsVar = (js) this.b;
                TLRPC.StickerSetCovered stickerSetCovered2 = ((ms) view).d;
                ns nsVar = jsVar.a;
                ch.b0 reactionsWindow = nsVar.P.getReactionsWindow();
                if (reactionsWindow != null && !reactionsWindow.q) {
                    reactionsWindow.d();
                }
                if (stickerSetCovered2 instanceof TLRPC.TL_stickerSetNoCovered) {
                    org.telegram.ui.Components.ow0.c(null, nsVar.c0, nsVar.z.getContext(), new a5(jsVar, 9));
                    break;
                } else {
                    ls lsVar = nsVar.l;
                    if (lsVar != null) {
                        lsVar.u(stickerSetCovered2.set, TextUtils.join("", nsVar.o));
                    }
                    nsVar.o();
                    break;
                }
                break;
            case 7:
                ts tsVar = (ts) this.b;
                if (tsVar.f && tsVar.e) {
                    org.telegram.ui.Components.dk dkVar = tsVar.d;
                    ArrayList arrayList4 = dkVar.e;
                    if (arrayList4 != null && i7 >= 0 && i7 < arrayList4.size()) {
                        psVar = (ps) dkVar.e.get(i7);
                    }
                } else {
                    int S = tsVar.c.S(i7);
                    int Q = tsVar.c.Q(i7);
                    if (Q >= 0 && S >= 0) {
                        psVar = tsVar.c.O(S, Q);
                    }
                }
                if (i7 >= 0) {
                    tsVar.finishFragment();
                    if (psVar != null && (ssVar = tsVar.r) != null) {
                        ssVar.d(psVar);
                        break;
                    }
                }
                break;
            case 8:
                lt ltVar = (lt) this.b;
                ArrayList arrayList5 = ltVar.k3;
                ot otVar = ltVar.w3;
                if (!(view instanceof et) || i7 < 0 || i7 >= arrayList5.size()) {
                    if (view instanceof org.telegram.ui.Cells.m8) {
                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(otVar.getParentActivity());
                        alertDialog$Builder2.a.S = org.telegram.messenger.gd.N0(2131745893, null);
                        alertDialog$Builder2.a.U = org.telegram.messenger.gd.N0(2131745894, null);
                        alertDialog$Builder2.k(org.telegram.messenger.gd.N0(2131745922, null), new ht(ltVar));
                        alertDialog$Builder2.h(org.telegram.messenger.gd.N0(2131752577, null), null);
                        org.telegram.ui.ActionBar.t1 t1Var2 = alertDialog$Builder2.a;
                        otVar.showDialog(t1Var2);
                        TextView textView2 = (TextView) t1Var2.d(-1);
                        if (textView2 != null) {
                            org.telegram.ui.ActionBar.u6.U(textView2, org.telegram.ui.ActionBar.n6.q7, null);
                            break;
                        }
                    }
                } else {
                    gt gtVar = (gt) arrayList5.get(i7);
                    if (gtVar != null) {
                        int i18 = gtVar.h;
                        if (i18 >= 0) {
                            ltVar.q3[i18] = !r3[i18];
                            ltVar.D1(true);
                            break;
                        } else if (i18 == -2) {
                            otVar.presentFragment(new DataAutoDownloadActivity(ltVar.g3 - 1));
                            break;
                        }
                    }
                }
                break;
            case 9:
                jy.a0((jy) this.b, view, i7);
                break;
            case 10:
                jz jzVar = (jz) this.b;
                if (jzVar.getParentActivity() != null && (bzVar = (bz) jzVar.Q.get(i7)) != null) {
                    View.OnClickListener onClickListener = bzVar.c;
                    if (onClickListener != null) {
                        onClickListener.onClick(view);
                        break;
                    } else {
                        int i19 = bzVar.a;
                        if (i19 == 1) {
                            org.telegram.ui.Cells.sa saVar = (org.telegram.ui.Cells.sa) view;
                            jzVar.B0(bzVar, saVar.getName(), saVar.getCurrentObject(), bzVar.g);
                            break;
                        } else if (i19 == 7) {
                            org.telegram.ui.Components.voip.o oVar2 = new org.telegram.ui.Components.voip.o(18, jzVar, bzVar);
                            if (jzVar.c.x.f) {
                                jzVar.y0(oVar2, false);
                                break;
                            } else {
                                oVar2.run();
                                break;
                            }
                        } else if (i19 == 8 || (i19 == 4 && bzVar.k == R.drawable.msg2_link2)) {
                            org.telegram.messenger.ro roVar = jzVar.r;
                            org.telegram.messenger.q2 q2Var = org.telegram.messenger.q2.E;
                            if (!jzVar.s || !jzVar.c.x.f) {
                                if (!TextUtils.isEmpty(jzVar.x) || !TextUtils.isEmpty(roVar.b)) {
                                    int i20 = jzVar.E;
                                    int i21 = org.telegram.messenger.mp.I8;
                                    if ((i20 & (-1537)) == 0 && jzVar.H.isEmpty() && !jzVar.G.isEmpty()) {
                                        jzVar.y0(new oy(jzVar, 1), false);
                                        break;
                                    }
                                }
                                float f10 = -jzVar.R;
                                jzVar.R = f10;
                                org.telegram.messenger.g0.E3(f10, view, null);
                                q2Var.a();
                                if (TextUtils.isEmpty(jzVar.x) && TextUtils.isEmpty(roVar.b)) {
                                    b02 = org.telegram.ui.Components.kc.b0(jzVar);
                                    i10 = 2131750750;
                                } else {
                                    int i22 = jzVar.E;
                                    int i23 = org.telegram.messenger.mp.I8;
                                    if ((i22 & (-1537)) != 0) {
                                        if (jzVar.H.isEmpty()) {
                                            b02 = org.telegram.ui.Components.kc.b0(jzVar);
                                            i10 = 2131750748;
                                        } else {
                                            b02 = org.telegram.ui.Components.kc.b0(jzVar);
                                            i10 = 2131750747;
                                        }
                                    } else if (jzVar.G.isEmpty()) {
                                        b02 = org.telegram.ui.Components.kc.b0(jzVar);
                                        i10 = 2131750751;
                                    } else {
                                        b02 = org.telegram.ui.Components.kc.b0(jzVar);
                                        i10 = 2131750749;
                                    }
                                }
                                org.telegram.messenger.f3.o(null, i10, b02, null);
                                break;
                            } else {
                                float f11 = -jzVar.R;
                                jzVar.R = f11;
                                org.telegram.messenger.g0.E3(f11, view, null);
                                q2Var.a();
                                jzVar.w = true;
                                hi.u3 u3Var = jzVar.S;
                                if ((u3Var == null || !u3Var.W) && (jzVar.fragmentView instanceof FrameLayout)) {
                                    hi.u3 u3Var2 = new hi.u3(jzVar.getParentActivity(), 1);
                                    u3Var2.r(true);
                                    u3Var2.d = 2300L;
                                    u3Var2.U = true;
                                    u3Var2.e = true;
                                    u3Var2.n(11.0f, 6.0f, 11.0f, 7.0f);
                                    u3Var2.v0 = -org.telegram.messenger.g0.L(10.0f);
                                    jzVar.S = u3Var2;
                                    u3Var2.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
                                    u3Var2.l(jzVar.getBaseSimpleGlass().c);
                                    u3Var2.v(org.telegram.messenger.gd.N0(2131750763, null));
                                    u3Var2.r0 = new ry(u3Var2, z12 ? 1 : 0);
                                    ((FrameLayout) jzVar.fragmentView).addView(u3Var2, c8.na.e(-1, org.telegram.messenger.ks.g2, 55));
                                    u3Var2.z(jzVar.c, true);
                                    break;
                                }
                            }
                        }
                    }
                }
                break;
            case 11:
                yy yyVar = (yy) this.b;
                ArrayList arrayList6 = yyVar.a2;
                int i24 = i7 - 1;
                if (i24 >= 0 && i24 < arrayList6.size()) {
                    bz bzVar2 = (bz) arrayList6.get(i24);
                    int i25 = bzVar2.a;
                    if (i25 == 7) {
                        yyVar.dismiss();
                        yyVar.s1.presentFragment(new jy(yyVar.U1, bzVar2.m));
                        break;
                    } else if (i25 == 8) {
                        yyVar.e1();
                        break;
                    }
                }
                break;
            case 12:
                b00 b00Var = (b00) this.b;
                if (view instanceof org.telegram.ui.Cells.h7) {
                    b00Var.f(i7, view, ((org.telegram.ui.Cells.h7) view).getMessage(), 0);
                    break;
                } else if (view instanceof org.telegram.ui.Cells.k7) {
                    b00Var.f(i7, view, ((org.telegram.ui.Cells.k7) view).getMessage(), 0);
                    break;
                } else if (view instanceof org.telegram.ui.Cells.g7) {
                    b00Var.f(i7, view, ((org.telegram.ui.Cells.g7) view).getMessage(), 0);
                    break;
                } else if (view instanceof org.telegram.ui.Cells.i2) {
                    b00Var.f(i7, view, ((org.telegram.ui.Cells.i2) view).getMessageObject(), 0);
                    break;
                } else if (view instanceof org.telegram.ui.Cells.u2) {
                    b00Var.f(i7, view, ((org.telegram.ui.Cells.u2) view).getMessage(), 0);
                    break;
                }
                break;
            case 13:
                g50 g50Var = (g50) this.b;
                if (g50Var.getParentActivity() != null) {
                    if (i7 == g50Var.n || i7 == 0) {
                        if (g50Var.f != null) {
                            try {
                                ((ClipboardManager) org.telegram.messenger.t0.b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", g50Var.f.link));
                                org.telegram.ui.Components.kc.j(g50Var).j();
                                break;
                            } catch (Exception e10) {
                                org.telegram.messenger.a8.g(e10, true);
                                return;
                            }
                        }
                    } else if (i7 != g50Var.s) {
                        if (i7 == g50Var.r) {
                            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(g50Var.getParentActivity());
                            alertDialog$Builder3.a.U = org.telegram.messenger.gd.N0(2131745830, null);
                            alertDialog$Builder3.a.S = org.telegram.messenger.gd.N0(2131745827, null);
                            alertDialog$Builder3.k(org.telegram.messenger.gd.N0(2131745828, null), new zr(g50Var, 14));
                            alertDialog$Builder3.h(org.telegram.messenger.gd.N0(2131752577, null), null);
                            g50Var.showDialog(alertDialog$Builder3.a);
                            break;
                        }
                    } else if (g50Var.f != null) {
                        try {
                            Intent intent = new Intent("android.intent.action.SEND");
                            intent.setType("text/plain");
                            intent.putExtra("android.intent.extra.TEXT", g50Var.f.link);
                            g50Var.getParentActivity().startActivityForResult(Intent.createChooser(intent, org.telegram.messenger.gd.N0(2131748917, null)), 500);
                            break;
                        } catch (Exception e11) {
                            org.telegram.messenger.a8.g(e11, true);
                            return;
                        }
                    }
                }
                break;
            case 14:
                n50.Z((n50) this.b, view, i7);
                break;
            case 15:
                a60.Z((a60) this.b, view, i7);
                break;
            case 16:
                LanguageSelectActivity.Z((LanguageSelectActivity) this.b, view, i7);
                break;
            case 17:
                ((dg0) this.b).onBackPressed();
                break;
            case 18:
                mg0 mg0Var = (mg0) this.b;
                int i26 = mg0Var.J;
                if (i7 >= i26 && i7 < mg0Var.K) {
                    org.telegram.messenger.fj fjVar = (org.telegram.messenger.fj) mg0Var.y.get(i7 - i26);
                    if (!fjVar.x4()) {
                        long B0 = org.telegram.messenger.fj.B0(fjVar.k);
                        Bundle bundle3 = new Bundle();
                        if (org.telegram.messenger.n5.E(B0)) {
                            bundle3.putLong("user_id", B0);
                        } else {
                            bundle3.putLong("chat_id", -B0);
                        }
                        bundle3.putInt("message_id", fjVar.e1());
                        bundle3.putBoolean("need_remove_previous_same_chat_activity", false);
                        if (mg0Var.getMessagesController().E(bundle3, mg0Var, null, null)) {
                            mg0Var.presentFragment(new bn(bundle3));
                            break;
                        }
                    } else if (!mg0Var.g0(fjVar)) {
                        mg0Var.getOrCreateStoryViewer().L(mg0Var.getParentActivity(), fjVar.l, fi.y6.a(mg0Var.f));
                        break;
                    }
                }
                break;
            case 19:
                PasscodeActivity.a0((PasscodeActivity) this.b, view, i7);
                break;
            case 20:
                im0 im0Var = (im0) this.b;
                im0Var.a(i7, true);
                vl0 vl0Var = im0Var.h;
                if (vl0Var != null) {
                    vl0Var.a(Integer.valueOf(i7));
                    break;
                }
                break;
            case 21:
                an0 an0Var = (an0) this.b;
                ArrayList arrayList7 = an0Var.f;
                ArrayList arrayList8 = an0Var.n;
                org.telegram.messenger.ue ueVar = an0Var.K;
                if (ueVar != null || !arrayList7.isEmpty()) {
                    if (ueVar != null) {
                        arrayList7 = ueVar.e;
                    }
                    if (i7 >= 0 && i7 < arrayList7.size()) {
                        org.telegram.ui.ActionBar.q0 q0Var = an0Var.Q;
                        if (q0Var != null) {
                            org.telegram.messenger.g0.v1(q0Var.getSearchField());
                        }
                        if (an0Var.Z) {
                            an0Var.f0(view, arrayList7.get(i7));
                            break;
                        } else {
                            int i27 = an0Var.U;
                            if (i27 != 1 && i27 != 3) {
                                if (i27 != 2) {
                                    i12 = 10;
                                    if (i27 != 10) {
                                        i14 = an0Var.V == null ? 4 : 0;
                                    }
                                }
                                i14 = i12;
                            }
                            PhotoViewer.p1().J2(null, an0Var, null);
                            PhotoViewer p12 = PhotoViewer.p1();
                            int i28 = an0Var.I;
                            boolean z18 = an0Var.J;
                            p12.h = i28;
                            p12.n = z18;
                            PhotoViewer.p1().g2(arrayList7, i7, i14, an0Var.m0, an0Var.y0, an0Var.V);
                            break;
                        }
                    }
                } else if (i7 < arrayList8.size()) {
                    String str = (String) arrayList8.get(i7);
                    bn0 bn0Var = an0Var.u0;
                    if (bn0Var != null) {
                        switch (bn0Var.a) {
                            case 1:
                                dn0.m0(bn0Var.b, str);
                                break;
                            default:
                                dn0.m0(bn0Var.b, str);
                                break;
                        }
                    } else {
                        an0Var.Q.getSearchField().setText(str);
                        an0Var.Q.getSearchField().setSelection(str.length());
                        an0Var.g0(an0Var.Q.getSearchField());
                        break;
                    }
                } else if (i7 == arrayList8.size() + 1) {
                    AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(an0Var.getParentActivity());
                    alertDialog$Builder4.a.S = org.telegram.messenger.gd.N0(2131752044, null);
                    alertDialog$Builder4.a.U = org.telegram.messenger.gd.N0(2131752049, null);
                    alertDialog$Builder4.k(org.telegram.messenger.gd.N0(2131752087, null), new sm0(an0Var, i13));
                    alertDialog$Builder4.h(org.telegram.messenger.gd.N0(2131752577, null), null);
                    org.telegram.ui.ActionBar.t1 t1Var3 = alertDialog$Builder4.a;
                    an0Var.showDialog(t1Var3);
                    TextView textView3 = (TextView) t1Var3.d(-1);
                    if (textView3 != null) {
                        org.telegram.ui.ActionBar.u6.U(textView3, org.telegram.ui.ActionBar.n6.q7, null);
                        break;
                    }
                }
                break;
            case 22:
                PhotoViewer photoViewer = (PhotoViewer) this.b;
                ArrayList arrayList9 = photoViewer.g7;
                if (!arrayList9.isEmpty() && (i11 = photoViewer.P4) >= 0 && i11 < arrayList9.size()) {
                    Object obj = arrayList9.get(photoViewer.P4);
                    if (obj instanceof org.telegram.messenger.xe) {
                        ((org.telegram.messenger.xe) obj).s = photoViewer.j1();
                    }
                }
                photoViewer.k5 = true;
                int indexOf = arrayList9.indexOf(view.getTag());
                if (indexOf >= 0) {
                    photoViewer.P4 = -1;
                    photoViewer.A2(indexOf);
                }
                photoViewer.k5 = false;
                break;
            case 23:
                pr0 pr0Var = (pr0) this.b;
                boolean[] zArr = pr0Var.x;
                if (i7 == pr0Var.p0) {
                    pr0Var.k0();
                    break;
                } else if (view instanceof org.telegram.ui.Cells.r8) {
                    org.telegram.ui.Cells.r8 r8Var = (org.telegram.ui.Cells.r8) view;
                    boolean z19 = pr0Var.M;
                    org.telegram.ui.Components.zw0 zw0Var = pr0Var.R;
                    if (zw0Var != null) {
                        zw0Var.f();
                    }
                    if (pr0Var.J) {
                        int i29 = -pr0Var.P;
                        pr0Var.P = i29;
                        org.telegram.messenger.g0.E3(i29, r8Var, null);
                        org.telegram.messenger.q2.E.a();
                        break;
                    } else {
                        if (i7 == pr0Var.s0) {
                            z10 = !pr0Var.H;
                            pr0Var.H = z10;
                        } else {
                            int i30 = pr0Var.v0;
                            if (i7 == i30) {
                                z10 = !pr0Var.I;
                                pr0Var.I = z10;
                            } else {
                                if (i7 == pr0Var.w0) {
                                    z11 = !pr0Var.K;
                                    pr0Var.K = z11;
                                    pr0Var.w0();
                                    int i31 = pr0Var.v0;
                                    if (i31 >= 0 && i30 < 0) {
                                        pr0Var.b.i(i31);
                                    } else if (i30 >= 0 && i31 < 0) {
                                        pr0Var.b.s(i30);
                                    }
                                } else if (i7 == pr0Var.t0) {
                                    boolean z20 = pr0Var.L;
                                    z11 = !z20;
                                    pr0Var.L = z11;
                                    if (!z20 && pr0Var.M) {
                                        int i32 = pr0Var.k0;
                                        pr0Var.M = false;
                                        pr0Var.w0();
                                        v4.f1 K = pr0Var.c.K(pr0Var.u0);
                                        if (K != null) {
                                            ((org.telegram.ui.Cells.r8) K.a).setChecked(false);
                                        } else {
                                            pr0Var.b.g(pr0Var.u0);
                                        }
                                        pr0Var.b.p(i32, 2);
                                    }
                                } else if (pr0Var.O == 0) {
                                    z10 = !pr0Var.M;
                                    pr0Var.M = z10;
                                    int i33 = pr0Var.k0;
                                    pr0Var.w0();
                                    if (pr0Var.M) {
                                        pr0Var.b.o(pr0Var.k0, 2);
                                    } else {
                                        pr0Var.b.p(i33, 2);
                                    }
                                    if (pr0Var.M && pr0Var.L) {
                                        pr0Var.L = false;
                                        v4.f1 K2 = pr0Var.c.K(pr0Var.t0);
                                        if (K2 != null) {
                                            ((org.telegram.ui.Cells.r8) K2.a).setChecked(false);
                                        } else {
                                            pr0Var.b.g(pr0Var.t0);
                                        }
                                    }
                                    if (pr0Var.M) {
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
                        if (pr0Var.N && !pr0Var.M) {
                            pr0Var.c.getChildCount();
                            pr0Var.h.a();
                        }
                        for (int i35 = pr0Var.o0; i35 < pr0Var.o0 + pr0Var.E; i35++) {
                            v4.f1 K3 = pr0Var.c.K(i35);
                            if (K3 != null) {
                                View view2 = K3.a;
                                if (view2 instanceof org.telegram.ui.Cells.a6) {
                                    org.telegram.ui.Cells.a6 a6Var = (org.telegram.ui.Cells.a6) view2;
                                    a6Var.n(pr0Var.M, true);
                                    a6Var.r.a(zArr[i35 - pr0Var.o0], z19);
                                    if (a6Var.getTop() > org.telegram.messenger.g0.L(40.0f) && i7 == pr0Var.u0 && !pr0Var.N) {
                                        pr0Var.h.c(a6Var.getCheckBox());
                                        pr0Var.N = true;
                                    }
                                }
                            }
                        }
                        r8Var.setChecked(z10);
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
                if (view.isEnabled() && (view instanceof ug.n1)) {
                    ug.n1 n1Var = (ug.n1) view;
                    premiumPreviewFragment.e = arrayList10.indexOf(n1Var.getTier());
                    premiumPreviewFragment.y0(true);
                    n1Var.c(true, true);
                    for (int i36 = 0; i36 < br0Var.getChildCount(); i36++) {
                        View childAt = br0Var.getChildAt(i36);
                        if (childAt instanceof ug.n1) {
                            ug.n1 n1Var2 = (ug.n1) childAt;
                            if (n1Var2.getTier() != n1Var.getTier()) {
                                n1Var2.c(false, true);
                            }
                        }
                    }
                    for (int i37 = 0; i37 < br0Var.getHiddenChildCount(); i37++) {
                        View V = br0Var.V(i37);
                        if (V instanceof ug.n1) {
                            ug.n1 n1Var3 = (ug.n1) V;
                            if (n1Var3.getTier() != n1Var.getTier()) {
                                n1Var3.c(false, true);
                            }
                        }
                    }
                    for (int i38 = 0; i38 < br0Var.getCachedChildCount(); i38++) {
                        View P = br0Var.P(i38);
                        if (P instanceof ug.n1) {
                            ug.n1 n1Var4 = (ug.n1) P;
                            if (n1Var4.getTier() != n1Var.getTier()) {
                                n1Var4.c(false, true);
                            }
                        }
                    }
                    for (int i39 = 0; i39 < br0Var.getAttachedScrapChildCount(); i39++) {
                        View O = br0Var.O(i39);
                        if (O instanceof ug.n1) {
                            ug.n1 n1Var5 = (ug.n1) O;
                            if (n1Var5.getTier() != n1Var.getTier()) {
                                n1Var5.c(false, true);
                            }
                        }
                    }
                    FrameLayout frameLayout = premiumPreviewFragment.K;
                    if (!premiumPreviewFragment.getUserConfig().q() || ((ws0Var = premiumPreviewFragment.f) != null && ws0Var.a.months < ((ws0) arrayList10.get(premiumPreviewFragment.e)).a.months && !premiumPreviewFragment.q0)) {
                        z12 = true;
                    }
                    org.telegram.messenger.g0.V3(frameLayout, z12);
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
