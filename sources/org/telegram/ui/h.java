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

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class h implements org.telegram.ui.Components.bj0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ h(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    private final void a(int i7, View view) {
        vt0 vt0Var = (vt0) this.b;
        int i10 = vt0Var.D;
        if (i7 == vt0Var.x) {
            org.telegram.ui.ActionBar.u1 u1Var = org.telegram.ui.Components.u4.L(vt0Var.getParentActivity(), org.telegram.messenger.id.M0(2131747913, null), org.telegram.messenger.id.M0(2131747914, null), org.telegram.messenger.id.M0(2131751598, null), new tt0(vt0Var), null).a;
            u1Var.show();
            u1Var.i();
            return;
        }
        if (i7 != vt0Var.f) {
            if (i7 < vt0Var.r || i7 >= vt0Var.s) {
                return;
            }
            if (i10 != 1) {
                new Bundle();
                throw null;
            }
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", vt0Var.getMessagesController().G0.keyAt(i7 - vt0Var.r));
            vt0Var.presentFragment(new ProfileActivity(bundle, null));
            return;
        }
        if (i10 != 1) {
            Bundle k10 = a8.p0.k("isNeverShare", true);
            if (i10 == 2) {
                k10.putInt("chatAddType", 2);
            }
            z40 z40Var = new z40(k10);
            z40Var.x = new st0(vt0Var);
            vt0Var.presentFragment(z40Var);
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
        zw zwVar = new zw(bundle2);
        duVar.a = zwVar;
        zwVar.D2 = new au(duVar);
        zwVar.onFragmentCreate();
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
        contactsActivity.U = new au(duVar);
        contactsActivity.onFragmentCreate();
        vt0Var.presentFragment(duVar);
    }

    @Override // org.telegram.ui.Components.bj0
    public final void c(int i7, View view) {
        TLRPC.InputStickerSet tL_inputStickerSetShortName;
        TLRPC.Chat chat;
        String M0;
        String a02;
        ss ssVar;
        bz bzVar;
        org.telegram.ui.Components.gc a03;
        int i10;
        int i11;
        boolean z9;
        boolean z10;
        zs0 zs0Var;
        int i12 = 3;
        int i13 = 4;
        ps psVar = null;
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
                            org.telegram.ui.Components.tb tbVar = new org.telegram.ui.Components.tb(kVar.getParentActivity(), kVar.getResourceProvider());
                            org.telegram.ui.Components.w70 w70Var = tbVar.b;
                            w70Var.setText(org.telegram.messenger.g0.S2(org.telegram.messenger.id.M0(2131743866, null), org.telegram.ui.ActionBar.m6.uj, 0, new jq0(kVar, i12), null));
                            w70Var.setSingleLine(false);
                            w70Var.setPadding(0, org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f));
                            tbVar.a.setImageResource(R.drawable.msg_settings_premium);
                            org.telegram.ui.Components.bc.g(kVar, tbVar, 3500).j();
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
                    yv0Var.W1 = new m(oVar, view, stickerSetCovered);
                    oVar.showDialog(yv0Var);
                    break;
                }
                break;
            case 2:
                bz0.Z((bz0) this.b, i7);
                break;
            case 3:
                pc pcVar = (pc) this.b;
                ArrayList arrayList2 = pcVar.c;
                g61 g61Var = pcVar.d;
                if (i7 >= 0 && i7 < arrayList2.size()) {
                    org.telegram.ui.Components.uo uoVar = (org.telegram.ui.Components.uo) arrayList2.get(i7);
                    pcVar.a(uoVar.a(), true);
                    if (view.getLeft() < org.telegram.messenger.g0.L(24.0f) + g61Var.getPaddingLeft()) {
                        g61Var.w0(-((org.telegram.messenger.g0.L(48.0f) + g61Var.getPaddingLeft()) - view.getLeft()), 0, null);
                    } else if (view.getWidth() + view.getLeft() > (g61Var.getMeasuredWidth() - g61Var.getPaddingRight()) - org.telegram.messenger.g0.L(24.0f)) {
                        g61Var.w0(org.telegram.messenger.k5.B(48.0f, g61Var.getMeasuredWidth() - g61Var.getPaddingRight(), view.getWidth() + view.getLeft()), 0, null);
                    }
                    org.telegram.messenger.c20 c20Var = pcVar.r;
                    if (c20Var != null) {
                        c20Var.a(uoVar.a());
                        break;
                    }
                }
                break;
            case 4:
                uo uoVar2 = (uo) this.b;
                boolean z15 = uoVar2.s;
                if (uoVar2.getParentActivity() != null) {
                    v4.g0 adapter = uoVar2.b.getAdapter();
                    to toVar = uoVar2.e;
                    if (adapter == toVar) {
                        chat = (TLRPC.Chat) toVar.d.get(i7);
                    } else {
                        int i17 = uoVar2.G;
                        chat = (i7 < i17 || i7 >= uoVar2.H) ? null : (TLRPC.Chat) uoVar2.w.get(i7 - i17);
                    }
                    if (chat != null) {
                        if (!z15 || uoVar2.h.linked_chat_id != 0) {
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", chat.id);
                            uoVar2.presentFragment(new cn(bundle));
                            break;
                        } else {
                            uoVar2.f0(chat, true);
                            break;
                        }
                    } else if (i7 == uoVar2.F) {
                        if (z15 && uoVar2.h.linked_chat_id == 0) {
                            Bundle bundle2 = new Bundle();
                            bundle2.putLongArray("result", new long[]{uoVar2.getUserConfig().e()});
                            bundle2.putInt("chatType", 4);
                            TLRPC.Chat chat2 = uoVar2.f;
                            if (chat2 != null) {
                                bundle2.putString("title", org.telegram.messenger.id.a0("GroupCreateDiscussionDefaultName", null, 2131749454, chat2.title));
                            }
                            g50 g50Var = new g50(bundle2);
                            g50Var.Y = new mo(uoVar2);
                            uoVar2.presentFragment(g50Var);
                            break;
                        } else if (!uoVar2.w.isEmpty()) {
                            TLRPC.Chat chat3 = (TLRPC.Chat) uoVar2.w.get(0);
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(uoVar2.getParentActivity());
                            if (z15) {
                                M0 = org.telegram.messenger.id.M0(2131751371, null);
                                a02 = org.telegram.messenger.id.a0("DiscussionUnlinkChannelAlert", null, 2131751372, chat3.title);
                            } else {
                                M0 = org.telegram.messenger.id.M0(2131751373, null);
                                a02 = org.telegram.messenger.id.a0("DiscussionUnlinkGroupAlert", null, 2131751370, chat3.title);
                            }
                            alertDialog$Builder.a.R = M0;
                            alertDialog$Builder.a.T = org.telegram.messenger.g0.X2(a02);
                            alertDialog$Builder.k(org.telegram.messenger.id.M0(2131751374, null), new w0(uoVar2, 25));
                            alertDialog$Builder.h(org.telegram.messenger.id.M0(2131752589, null), null);
                            org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
                            uoVar2.showDialog(u1Var);
                            TextView textView = (TextView) u1Var.d(-1);
                            if (textView != null) {
                                org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.q7, null);
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
                    boolean z16 = !contains;
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
                js jsVar = (js) this.b;
                TLRPC.StickerSetCovered stickerSetCovered2 = ((ms) view).d;
                ns nsVar = jsVar.a;
                ch.b0 reactionsWindow = nsVar.P.getReactionsWindow();
                if (reactionsWindow != null && !reactionsWindow.q) {
                    reactionsWindow.d();
                }
                if (stickerSetCovered2 instanceof TLRPC.TL_stickerSetNoCovered) {
                    org.telegram.ui.Components.dw0.c(null, nsVar.c0, nsVar.z.getContext(), new a5(jsVar, 9));
                    break;
                } else {
                    ls lsVar = nsVar.l;
                    if (lsVar != null) {
                        lsVar.w(stickerSetCovered2.set, TextUtils.join("", nsVar.o));
                    }
                    nsVar.o();
                    break;
                }
                break;
            case 7:
                ts tsVar = (ts) this.b;
                if (tsVar.f && tsVar.e) {
                    org.telegram.ui.Components.nj njVar = tsVar.d;
                    ArrayList arrayList4 = njVar.e;
                    if (arrayList4 != null && i7 >= 0 && i7 < arrayList4.size()) {
                        psVar = (ps) njVar.e.get(i7);
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
                        ssVar.b(psVar);
                        break;
                    }
                }
                break;
            case 8:
                kt ktVar = (kt) this.b;
                ArrayList arrayList5 = ktVar.j3;
                nt ntVar = ktVar.v3;
                if (!(view instanceof dt) || i7 < 0 || i7 >= arrayList5.size()) {
                    if (view instanceof org.telegram.ui.Cells.m8) {
                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(ntVar.getParentActivity());
                        alertDialog$Builder2.a.R = org.telegram.messenger.id.M0(2131746089, null);
                        alertDialog$Builder2.a.T = org.telegram.messenger.id.M0(2131746090, null);
                        alertDialog$Builder2.k(org.telegram.messenger.id.M0(2131746118, null), new gt(ktVar));
                        alertDialog$Builder2.h(org.telegram.messenger.id.M0(2131752589, null), null);
                        org.telegram.ui.ActionBar.u1 u1Var2 = alertDialog$Builder2.a;
                        ntVar.showDialog(u1Var2);
                        TextView textView2 = (TextView) u1Var2.d(-1);
                        if (textView2 != null) {
                            org.telegram.ui.ActionBar.t6.U(textView2, org.telegram.ui.ActionBar.m6.q7, null);
                            break;
                        }
                    }
                } else {
                    ft ftVar = (ft) arrayList5.get(i7);
                    if (ftVar != null) {
                        int i18 = ftVar.h;
                        if (i18 >= 0) {
                            ktVar.p3[i18] = !r3[i18];
                            ktVar.D1(true);
                            break;
                        } else if (i18 == -2) {
                            ntVar.presentFragment(new DataAutoDownloadActivity(ktVar.f3 - 1));
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
                if (jzVar.getParentActivity() != null && (bzVar = (bz) jzVar.P.get(i7)) != null) {
                    View.OnClickListener onClickListener = bzVar.c;
                    if (onClickListener != null) {
                        onClickListener.onClick(view);
                        break;
                    } else {
                        int i19 = bzVar.a;
                        if (i19 == 1) {
                            org.telegram.ui.Cells.pa paVar = (org.telegram.ui.Cells.pa) view;
                            jzVar.B0(bzVar, paVar.getName(), paVar.getCurrentObject(), bzVar.g);
                            break;
                        } else if (i19 == 7) {
                            org.telegram.ui.Components.h41 h41Var = new org.telegram.ui.Components.h41(22, jzVar, bzVar);
                            if (jzVar.c.x.f) {
                                jzVar.y0(h41Var, false);
                                break;
                            } else {
                                h41Var.run();
                                break;
                            }
                        } else if (i19 == 8 || (i19 == 4 && bzVar.k == R.drawable.msg2_link2)) {
                            org.telegram.messenger.vo voVar = jzVar.r;
                            org.telegram.messenger.p2 p2Var = org.telegram.messenger.p2.D;
                            if (!jzVar.s || !jzVar.c.x.f) {
                                if (!TextUtils.isEmpty(jzVar.x) || !TextUtils.isEmpty(voVar.b)) {
                                    int i20 = jzVar.D;
                                    int i21 = org.telegram.messenger.qp.C8;
                                    if ((i20 & (-1537)) == 0 && jzVar.G.isEmpty() && !jzVar.F.isEmpty()) {
                                        jzVar.y0(new oy(jzVar, 1), false);
                                        break;
                                    }
                                }
                                float f10 = -jzVar.Q;
                                jzVar.Q = f10;
                                org.telegram.messenger.g0.G3(f10, view, null);
                                p2Var.a();
                                if (TextUtils.isEmpty(jzVar.x) && TextUtils.isEmpty(voVar.b)) {
                                    a03 = org.telegram.ui.Components.gc.a0(jzVar);
                                    i10 = 2131750762;
                                } else {
                                    int i22 = jzVar.D;
                                    int i23 = org.telegram.messenger.qp.C8;
                                    if ((i22 & (-1537)) != 0) {
                                        if (jzVar.G.isEmpty()) {
                                            a03 = org.telegram.ui.Components.gc.a0(jzVar);
                                            i10 = 2131750760;
                                        } else {
                                            a03 = org.telegram.ui.Components.gc.a0(jzVar);
                                            i10 = 2131750759;
                                        }
                                    } else if (jzVar.F.isEmpty()) {
                                        a03 = org.telegram.ui.Components.gc.a0(jzVar);
                                        i10 = 2131750763;
                                    } else {
                                        a03 = org.telegram.ui.Components.gc.a0(jzVar);
                                        i10 = 2131750761;
                                    }
                                }
                                org.telegram.messenger.k5.p(null, i10, a03, null);
                                break;
                            } else {
                                float f11 = -jzVar.Q;
                                jzVar.Q = f11;
                                org.telegram.messenger.g0.G3(f11, view, null);
                                p2Var.a();
                                jzVar.w = true;
                                fi.m3 m3Var = jzVar.R;
                                if ((m3Var == null || !m3Var.V) && (jzVar.fragmentView instanceof FrameLayout)) {
                                    fi.m3 m3Var2 = new fi.m3(jzVar.getParentActivity(), 1);
                                    m3Var2.r(true);
                                    m3Var2.d = 2300L;
                                    m3Var2.T = true;
                                    m3Var2.e = true;
                                    m3Var2.n(11.0f, 6.0f, 11.0f, 7.0f);
                                    m3Var2.u0 = -org.telegram.messenger.g0.L(10.0f);
                                    jzVar.R = m3Var2;
                                    m3Var2.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
                                    m3Var2.l(jzVar.getBaseSimpleGlass().c);
                                    m3Var2.u(org.telegram.messenger.id.M0(2131750775, null));
                                    m3Var2.q0 = new ry(m3Var2, z11 ? 1 : 0);
                                    ((FrameLayout) jzVar.fragmentView).addView(m3Var2, c8.ha.e(-1, org.telegram.messenger.qs.g2, 55));
                                    m3Var2.y(jzVar.c, true);
                                    break;
                                }
                            }
                        }
                    }
                }
                break;
            case 11:
                yy yyVar = (yy) this.b;
                ArrayList arrayList6 = yyVar.Z1;
                int i24 = i7 - 1;
                if (i24 >= 0 && i24 < arrayList6.size()) {
                    bz bzVar2 = (bz) arrayList6.get(i24);
                    int i25 = bzVar2.a;
                    if (i25 == 7) {
                        yyVar.dismiss();
                        yyVar.r1.presentFragment(new jy(yyVar.T1, bzVar2.m));
                        break;
                    } else if (i25 == 8) {
                        yyVar.d1();
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
                } else if (view instanceof org.telegram.ui.Cells.h2) {
                    b00Var.f(i7, view, ((org.telegram.ui.Cells.h2) view).getMessageObject(), 0);
                    break;
                } else if (view instanceof org.telegram.ui.Cells.t2) {
                    b00Var.f(i7, view, ((org.telegram.ui.Cells.t2) view).getMessage(), 0);
                    break;
                }
                break;
            case 13:
                i50 i50Var = (i50) this.b;
                if (i50Var.getParentActivity() != null) {
                    if (i7 == i50Var.n || i7 == 0) {
                        if (i50Var.f != null) {
                            try {
                                ((ClipboardManager) org.telegram.messenger.t0.b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", i50Var.f.link));
                                org.telegram.ui.Components.gc.j(i50Var).j();
                                break;
                            } catch (Exception e10) {
                                org.telegram.messenger.a8.g(e10, true);
                                return;
                            }
                        }
                    } else if (i7 != i50Var.s) {
                        if (i7 == i50Var.r) {
                            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(i50Var.getParentActivity());
                            alertDialog$Builder3.a.T = org.telegram.messenger.id.M0(2131746026, null);
                            alertDialog$Builder3.a.R = org.telegram.messenger.id.M0(2131746023, null);
                            alertDialog$Builder3.k(org.telegram.messenger.id.M0(2131746024, null), new zr(i50Var, 14));
                            alertDialog$Builder3.h(org.telegram.messenger.id.M0(2131752589, null), null);
                            i50Var.showDialog(alertDialog$Builder3.a);
                            break;
                        }
                    } else if (i50Var.f != null) {
                        try {
                            Intent intent = new Intent("android.intent.action.SEND");
                            intent.setType("text/plain");
                            intent.putExtra("android.intent.extra.TEXT", i50Var.f.link);
                            i50Var.getParentActivity().startActivityForResult(Intent.createChooser(intent, org.telegram.messenger.id.M0(2131749110, null)), 500);
                            break;
                        } catch (Exception e11) {
                            org.telegram.messenger.a8.g(e11, true);
                            return;
                        }
                    }
                }
                break;
            case 14:
                p50.Z((p50) this.b, view, i7);
                break;
            case 15:
                c60.Z((c60) this.b, view, i7);
                break;
            case 16:
                LanguageSelectActivity.Z((LanguageSelectActivity) this.b, view, i7);
                break;
            case 17:
                ((eg0) this.b).onBackPressed();
                break;
            case 18:
                mg0 mg0Var = (mg0) this.b;
                int i26 = mg0Var.I;
                if (i7 >= i26 && i7 < mg0Var.J) {
                    org.telegram.messenger.ij ijVar = (org.telegram.messenger.ij) mg0Var.y.get(i7 - i26);
                    if (!ijVar.x4()) {
                        long B0 = org.telegram.messenger.ij.B0(ijVar.k);
                        Bundle bundle3 = new Bundle();
                        if (org.telegram.messenger.m5.E(B0)) {
                            bundle3.putLong("user_id", B0);
                        } else {
                            bundle3.putLong("chat_id", -B0);
                        }
                        bundle3.putInt("message_id", ijVar.e1());
                        bundle3.putBoolean("need_remove_previous_same_chat_activity", false);
                        if (mg0Var.getMessagesController().E(bundle3, mg0Var, null, null)) {
                            mg0Var.presentFragment(new cn(bundle3));
                            break;
                        }
                    } else if (!mg0Var.g0(ijVar)) {
                        mg0Var.getOrCreateStoryViewer().L(mg0Var.getParentActivity(), ijVar.l, di.i7.a(mg0Var.f));
                        break;
                    }
                }
                break;
            case 19:
                PasscodeActivity.a0((PasscodeActivity) this.b, view, i7);
                break;
            case 20:
                jm0 jm0Var = (jm0) this.b;
                jm0Var.a(i7, true);
                wl0 wl0Var = jm0Var.h;
                if (wl0Var != null) {
                    wl0Var.a(Integer.valueOf(i7));
                    break;
                }
                break;
            case 21:
                an0 an0Var = (an0) this.b;
                ArrayList arrayList7 = an0Var.f;
                ArrayList arrayList8 = an0Var.n;
                org.telegram.messenger.we weVar = an0Var.J;
                if (weVar != null || !arrayList7.isEmpty()) {
                    if (weVar != null) {
                        arrayList7 = weVar.e;
                    }
                    if (i7 >= 0 && i7 < arrayList7.size()) {
                        org.telegram.ui.ActionBar.r0 r0Var = an0Var.P;
                        if (r0Var != null) {
                            org.telegram.messenger.g0.v1(r0Var.getSearchField());
                        }
                        if (an0Var.Y) {
                            an0Var.f0(view, arrayList7.get(i7));
                            break;
                        } else {
                            int i27 = an0Var.T;
                            if (i27 != 1 && i27 != 3) {
                                if (i27 != 2) {
                                    i12 = 10;
                                    if (i27 != 10) {
                                        i14 = an0Var.U == null ? 4 : 0;
                                    }
                                }
                                i14 = i12;
                            }
                            PhotoViewer.p1().H2(null, an0Var, null);
                            PhotoViewer p12 = PhotoViewer.p1();
                            int i28 = an0Var.H;
                            boolean z17 = an0Var.I;
                            p12.h = i28;
                            p12.n = z17;
                            PhotoViewer.p1().e2(arrayList7, i7, i14, an0Var.l0, an0Var.x0, an0Var.U);
                            break;
                        }
                    }
                } else if (i7 < arrayList8.size()) {
                    String str = (String) arrayList8.get(i7);
                    bn0 bn0Var = an0Var.t0;
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
                        an0Var.P.getSearchField().setText(str);
                        an0Var.P.getSearchField().setSelection(str.length());
                        an0Var.g0(an0Var.P.getSearchField());
                        break;
                    }
                } else if (i7 == arrayList8.size() + 1) {
                    AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(an0Var.getParentActivity());
                    alertDialog$Builder4.a.R = org.telegram.messenger.id.M0(2131752056, null);
                    alertDialog$Builder4.a.T = org.telegram.messenger.id.M0(2131752061, null);
                    alertDialog$Builder4.k(org.telegram.messenger.id.M0(2131752099, null), new tm0(an0Var, i13));
                    alertDialog$Builder4.h(org.telegram.messenger.id.M0(2131752589, null), null);
                    org.telegram.ui.ActionBar.u1 u1Var3 = alertDialog$Builder4.a;
                    an0Var.showDialog(u1Var3);
                    TextView textView3 = (TextView) u1Var3.d(-1);
                    if (textView3 != null) {
                        org.telegram.ui.ActionBar.t6.U(textView3, org.telegram.ui.ActionBar.m6.q7, null);
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
                sr0 sr0Var = (sr0) this.b;
                boolean[] zArr = sr0Var.x;
                if (i7 == sr0Var.o0) {
                    sr0Var.k0();
                    break;
                } else if (view instanceof org.telegram.ui.Cells.r8) {
                    org.telegram.ui.Cells.r8 r8Var = (org.telegram.ui.Cells.r8) view;
                    boolean z18 = sr0Var.L;
                    org.telegram.ui.Components.ow0 ow0Var = sr0Var.Q;
                    if (ow0Var != null) {
                        ow0Var.f();
                    }
                    if (sr0Var.I) {
                        int i29 = -sr0Var.O;
                        sr0Var.O = i29;
                        org.telegram.messenger.g0.G3(i29, r8Var, null);
                        org.telegram.messenger.p2.D.a();
                        break;
                    } else {
                        if (i7 == sr0Var.r0) {
                            z9 = !sr0Var.G;
                            sr0Var.G = z9;
                        } else {
                            int i30 = sr0Var.u0;
                            if (i7 == i30) {
                                z9 = !sr0Var.H;
                                sr0Var.H = z9;
                            } else {
                                if (i7 == sr0Var.v0) {
                                    z10 = !sr0Var.J;
                                    sr0Var.J = z10;
                                    sr0Var.w0();
                                    int i31 = sr0Var.u0;
                                    if (i31 >= 0 && i30 < 0) {
                                        sr0Var.b.i(i31);
                                    } else if (i30 >= 0 && i31 < 0) {
                                        sr0Var.b.s(i30);
                                    }
                                } else if (i7 == sr0Var.s0) {
                                    boolean z19 = sr0Var.K;
                                    z10 = !z19;
                                    sr0Var.K = z10;
                                    if (!z19 && sr0Var.L) {
                                        int i32 = sr0Var.j0;
                                        sr0Var.L = false;
                                        sr0Var.w0();
                                        v4.d1 K = sr0Var.c.K(sr0Var.t0);
                                        if (K != null) {
                                            ((org.telegram.ui.Cells.r8) K.a).setChecked(false);
                                        } else {
                                            sr0Var.b.g(sr0Var.t0);
                                        }
                                        sr0Var.b.p(i32, 2);
                                    }
                                } else if (sr0Var.N == 0) {
                                    z9 = !sr0Var.L;
                                    sr0Var.L = z9;
                                    int i33 = sr0Var.j0;
                                    sr0Var.w0();
                                    if (sr0Var.L) {
                                        sr0Var.b.o(sr0Var.j0, 2);
                                    } else {
                                        sr0Var.b.p(i33, 2);
                                    }
                                    if (sr0Var.L && sr0Var.K) {
                                        sr0Var.K = false;
                                        v4.d1 K2 = sr0Var.c.K(sr0Var.s0);
                                        if (K2 != null) {
                                            ((org.telegram.ui.Cells.r8) K2.a).setChecked(false);
                                        } else {
                                            sr0Var.b.g(sr0Var.s0);
                                        }
                                    }
                                    if (sr0Var.L) {
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
                        if (sr0Var.M && !sr0Var.L) {
                            sr0Var.c.getChildCount();
                            sr0Var.h.a();
                        }
                        for (int i35 = sr0Var.n0; i35 < sr0Var.n0 + sr0Var.D; i35++) {
                            v4.d1 K3 = sr0Var.c.K(i35);
                            if (K3 != null) {
                                View view2 = K3.a;
                                if (view2 instanceof org.telegram.ui.Cells.a6) {
                                    org.telegram.ui.Cells.a6 a6Var = (org.telegram.ui.Cells.a6) view2;
                                    a6Var.m(sr0Var.L, true);
                                    a6Var.r.a(zArr[i35 - sr0Var.n0], z18);
                                    if (a6Var.getTop() > org.telegram.messenger.g0.L(40.0f) && i7 == sr0Var.t0 && !sr0Var.M) {
                                        sr0Var.h.c(a6Var.getCheckBox());
                                        sr0Var.M = true;
                                    }
                                }
                            }
                        }
                        r8Var.setChecked(z9);
                        sr0Var.n0();
                        break;
                    }
                }
                break;
            case 24:
                PremiumPreviewFragment.Z((PremiumPreviewFragment) this.b, view, i7);
                break;
            case 25:
                xs0 xs0Var = (xs0) this.b;
                PremiumPreviewFragment premiumPreviewFragment = xs0Var.n;
                ArrayList arrayList10 = premiumPreviewFragment.d;
                er0 er0Var = xs0Var.e;
                if (view.isEnabled() && (view instanceof ug.k1)) {
                    ug.k1 k1Var = (ug.k1) view;
                    premiumPreviewFragment.e = arrayList10.indexOf(k1Var.getTier());
                    premiumPreviewFragment.y0(true);
                    k1Var.c(true, true);
                    for (int i36 = 0; i36 < er0Var.getChildCount(); i36++) {
                        View childAt = er0Var.getChildAt(i36);
                        if (childAt instanceof ug.k1) {
                            ug.k1 k1Var2 = (ug.k1) childAt;
                            if (k1Var2.getTier() != k1Var.getTier()) {
                                k1Var2.c(false, true);
                            }
                        }
                    }
                    for (int i37 = 0; i37 < er0Var.getHiddenChildCount(); i37++) {
                        View V = er0Var.V(i37);
                        if (V instanceof ug.k1) {
                            ug.k1 k1Var3 = (ug.k1) V;
                            if (k1Var3.getTier() != k1Var.getTier()) {
                                k1Var3.c(false, true);
                            }
                        }
                    }
                    for (int i38 = 0; i38 < er0Var.getCachedChildCount(); i38++) {
                        View P = er0Var.P(i38);
                        if (P instanceof ug.k1) {
                            ug.k1 k1Var4 = (ug.k1) P;
                            if (k1Var4.getTier() != k1Var.getTier()) {
                                k1Var4.c(false, true);
                            }
                        }
                    }
                    for (int i39 = 0; i39 < er0Var.getAttachedScrapChildCount(); i39++) {
                        View O = er0Var.O(i39);
                        if (O instanceof ug.k1) {
                            ug.k1 k1Var5 = (ug.k1) O;
                            if (k1Var5.getTier() != k1Var.getTier()) {
                                k1Var5.c(false, true);
                            }
                        }
                    }
                    FrameLayout frameLayout = premiumPreviewFragment.J;
                    if (!premiumPreviewFragment.getUserConfig().q() || ((zs0Var = premiumPreviewFragment.f) != null && zs0Var.a.months < ((zs0) arrayList10.get(premiumPreviewFragment.e)).a.months && !premiumPreviewFragment.p0)) {
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
