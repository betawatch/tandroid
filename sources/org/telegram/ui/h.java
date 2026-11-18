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

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class h implements org.telegram.ui.Components.oj0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ h(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    private final void a(int i7, View view) {
        st0 st0Var = (st0) this.b;
        int i10 = st0Var.E;
        if (i7 == st0Var.x) {
            org.telegram.ui.ActionBar.u1 u1Var = org.telegram.ui.Components.b5.L(st0Var.getParentActivity(), org.telegram.messenger.gd.M0(2131747720, null), org.telegram.messenger.gd.M0(2131747721, null), org.telegram.messenger.gd.M0(2131751587, null), new qt0(st0Var), null).a;
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
            bundle.putLong("user_id", st0Var.getMessagesController().H0.keyAt(i7 - st0Var.r));
            st0Var.presentFragment(new ProfileActivity(bundle, null));
            return;
        }
        if (i10 != 1) {
            Bundle k10 = a8.p0.k("isNeverShare", true);
            if (i10 == 2) {
                k10.putInt("chatAddType", 2);
            }
            z40 z40Var = new z40(k10);
            z40Var.x = new pt0(st0Var);
            st0Var.presentFragment(z40Var);
            return;
        }
        eu euVar = new eu(null);
        euVar.d = new Paint();
        euVar.f = new du[2];
        euVar.x = true;
        Bundle bundle2 = new Bundle();
        bundle2.putBoolean("onlySelect", true);
        bundle2.putBoolean("checkCanWrite", false);
        bundle2.putBoolean("resetDelegate", false);
        bundle2.putInt("dialogsType", 9);
        cx cxVar = new cx(bundle2);
        euVar.a = cxVar;
        cxVar.E2 = new bu(euVar);
        cxVar.onFragmentCreate();
        Bundle bundle3 = new Bundle();
        bundle3.putBoolean("onlyUsers", true);
        bundle3.putBoolean("destroyAfterSelect", true);
        bundle3.putBoolean("returnAsResult", true);
        bundle3.putBoolean("disableSections", true);
        bundle3.putBoolean("needFinishFragment", false);
        bundle3.putBoolean("resetDelegate", false);
        bundle3.putBoolean("allowSelf", false);
        ContactsActivity contactsActivity = new ContactsActivity(bundle3);
        euVar.b = contactsActivity;
        contactsActivity.V = new bu(euVar);
        contactsActivity.onFragmentCreate();
        st0Var.presentFragment(euVar);
    }

    @Override // org.telegram.ui.Components.oj0
    public final void c(int i7, View view) {
        TLRPC.InputStickerSet tL_inputStickerSetShortName;
        TLRPC.Chat chat;
        String M0;
        String a02;
        ss ssVar;
        cz czVar;
        org.telegram.ui.Components.lc b02;
        int i10;
        int i11;
        boolean z10;
        boolean z11;
        xs0 xs0Var;
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
                        ((org.telegram.ui.Cells.s8) view).setChecked(z13);
                        kVar.c = true;
                        break;
                    } else if (i15 == 4) {
                        TLRPC.GlobalPrivacySettings globalPrivacySettings2 = kVar.d;
                        boolean z14 = !globalPrivacySettings2.keep_archived_folders;
                        globalPrivacySettings2.keep_archived_folders = z14;
                        ((org.telegram.ui.Cells.s8) view).setChecked(z14);
                        kVar.c = true;
                        break;
                    } else if (i15 == 7) {
                        if (!kVar.getUserConfig().q() && !kVar.getMessagesController().b4 && !kVar.d.archive_and_mute_new_noncontact_peers) {
                            org.telegram.ui.Components.yb ybVar = new org.telegram.ui.Components.yb(kVar.getParentActivity(), kVar.getResourceProvider());
                            org.telegram.ui.Components.k80 k80Var = ybVar.b;
                            k80Var.setText(org.telegram.messenger.g0.R2(org.telegram.messenger.gd.M0(2131743629, null), org.telegram.ui.ActionBar.n6.xj, 0, new hq0(kVar, i12), null));
                            k80Var.setSingleLine(false);
                            k80Var.setPadding(0, org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f));
                            ybVar.a.setImageResource(R.drawable.msg_settings_premium);
                            org.telegram.ui.Components.gc.g(kVar, ybVar, 3500).j();
                            int i16 = -kVar.e;
                            kVar.e = i16;
                            org.telegram.messenger.g0.E3(i16, view, null);
                            org.telegram.messenger.q2.E.a();
                            break;
                        } else {
                            TLRPC.GlobalPrivacySettings globalPrivacySettings3 = kVar.d;
                            boolean z15 = !globalPrivacySettings3.archive_and_mute_new_noncontact_peers;
                            globalPrivacySettings3.archive_and_mute_new_noncontact_peers = z15;
                            ((org.telegram.ui.Cells.s8) view).setChecked(z15);
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
                    org.telegram.ui.Components.iw0 iw0Var = new org.telegram.ui.Components.iw0(oVar.getParentActivity(), oVar, inputStickerSet, null, null, null);
                    iw0Var.X1 = new m(oVar, view, stickerSetCovered);
                    oVar.showDialog(iw0Var);
                    break;
                }
                break;
            case 2:
                zy0.Z((zy0) this.b, i7);
                break;
            case 3:
                oc ocVar = (oc) this.b;
                ArrayList arrayList2 = ocVar.c;
                f61 f61Var = ocVar.d;
                if (i7 >= 0 && i7 < arrayList2.size()) {
                    org.telegram.ui.Components.kp kpVar = (org.telegram.ui.Components.kp) arrayList2.get(i7);
                    ocVar.a(kpVar.a(), true);
                    if (view.getLeft() < org.telegram.messenger.g0.L(24.0f) + f61Var.getPaddingLeft()) {
                        f61Var.w0(-((org.telegram.messenger.g0.L(48.0f) + f61Var.getPaddingLeft()) - view.getLeft()), 0, null);
                    } else if (view.getWidth() + view.getLeft() > (f61Var.getMeasuredWidth() - f61Var.getPaddingRight()) - org.telegram.messenger.g0.L(24.0f)) {
                        f61Var.w0(org.telegram.messenger.f3.B(48.0f, f61Var.getMeasuredWidth() - f61Var.getPaddingRight(), view.getWidth() + view.getLeft()), 0, null);
                    }
                    org.telegram.messenger.x10 x10Var = ocVar.r;
                    if (x10Var != null) {
                        x10Var.a(kpVar.a());
                        break;
                    }
                }
                break;
            case 4:
                vo voVar = (vo) this.b;
                boolean z16 = voVar.s;
                if (voVar.getParentActivity() != null) {
                    v4.i0 adapter = voVar.b.getAdapter();
                    uo uoVar = voVar.e;
                    if (adapter == uoVar) {
                        chat = (TLRPC.Chat) uoVar.d.get(i7);
                    } else {
                        int i17 = voVar.H;
                        chat = (i7 < i17 || i7 >= voVar.I) ? null : (TLRPC.Chat) voVar.w.get(i7 - i17);
                    }
                    if (chat != null) {
                        if (!z16 || voVar.h.linked_chat_id != 0) {
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", chat.id);
                            voVar.presentFragment(new bn(bundle));
                            break;
                        } else {
                            voVar.f0(chat, true);
                            break;
                        }
                    } else if (i7 == voVar.G) {
                        if (z16 && voVar.h.linked_chat_id == 0) {
                            Bundle bundle2 = new Bundle();
                            bundle2.putLongArray("result", new long[]{voVar.getUserConfig().e()});
                            bundle2.putInt("chatType", 4);
                            TLRPC.Chat chat2 = voVar.f;
                            if (chat2 != null) {
                                bundle2.putString("title", org.telegram.messenger.gd.a0("GroupCreateDiscussionDefaultName", null, 2131749262, chat2.title));
                            }
                            f50 f50Var = new f50(bundle2);
                            f50Var.Z = new no(voVar);
                            voVar.presentFragment(f50Var);
                            break;
                        } else if (!voVar.w.isEmpty()) {
                            TLRPC.Chat chat3 = (TLRPC.Chat) voVar.w.get(0);
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(voVar.getParentActivity());
                            if (z16) {
                                M0 = org.telegram.messenger.gd.M0(2131751360, null);
                                a02 = org.telegram.messenger.gd.a0("DiscussionUnlinkChannelAlert", null, 2131751361, chat3.title);
                            } else {
                                M0 = org.telegram.messenger.gd.M0(2131751362, null);
                                a02 = org.telegram.messenger.gd.a0("DiscussionUnlinkGroupAlert", null, 2131751359, chat3.title);
                            }
                            alertDialog$Builder.a.S = M0;
                            alertDialog$Builder.a.U = org.telegram.messenger.g0.W2(a02);
                            alertDialog$Builder.k(org.telegram.messenger.gd.M0(2131751363, null), new w0(voVar, 25));
                            alertDialog$Builder.h(org.telegram.messenger.gd.M0(2131752578, null), null);
                            org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
                            voVar.showDialog(u1Var);
                            TextView textView = (TextView) u1Var.d(-1);
                            if (textView != null) {
                                org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.q7, null);
                                break;
                            }
                        }
                    }
                }
                break;
            case 5:
                cp cpVar = (cp) this.b;
                ArrayList arrayList3 = cpVar.n;
                if (i7 > 2) {
                    org.telegram.ui.Cells.x xVar = (org.telegram.ui.Cells.x) view;
                    TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) arrayList3.get(i7 - 3);
                    boolean contains = cpVar.d.contains(tL_availableReaction.reaction);
                    boolean z17 = !contains;
                    if (contains) {
                        cpVar.d.remove(tL_availableReaction.reaction);
                        if (cpVar.d.isEmpty()) {
                            bp bpVar = cpVar.h;
                            if (bpVar != null) {
                                bpVar.p(2, arrayList3.size() + 1);
                            }
                            cpVar.a0(2, true);
                        }
                    } else {
                        cpVar.d.add(tL_availableReaction.reaction);
                    }
                    Switch r22 = xVar.c;
                    if (r22 != null) {
                        r22.c(z17, true);
                    }
                    org.telegram.ui.Components.mp mpVar = xVar.d;
                    if (mpVar != null) {
                        mpVar.a(z17, true);
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
                    org.telegram.ui.Components.nw0.c(null, nsVar.c0, nsVar.z.getContext(), new a5(jsVar, 9));
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
                    org.telegram.ui.Components.ck ckVar = tsVar.d;
                    ArrayList arrayList4 = ckVar.e;
                    if (arrayList4 != null && i7 >= 0 && i7 < arrayList4.size()) {
                        psVar = (ps) ckVar.e.get(i7);
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
                mt mtVar = (mt) this.b;
                ArrayList arrayList5 = mtVar.k3;
                pt ptVar = mtVar.w3;
                if (!(view instanceof ft) || i7 < 0 || i7 >= arrayList5.size()) {
                    if (view instanceof org.telegram.ui.Cells.n8) {
                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(ptVar.getParentActivity());
                        alertDialog$Builder2.a.S = org.telegram.messenger.gd.M0(2131745894, null);
                        alertDialog$Builder2.a.U = org.telegram.messenger.gd.M0(2131745895, null);
                        alertDialog$Builder2.k(org.telegram.messenger.gd.M0(2131745923, null), new jt(mtVar));
                        alertDialog$Builder2.h(org.telegram.messenger.gd.M0(2131752578, null), null);
                        org.telegram.ui.ActionBar.u1 u1Var2 = alertDialog$Builder2.a;
                        ptVar.showDialog(u1Var2);
                        TextView textView2 = (TextView) u1Var2.d(-1);
                        if (textView2 != null) {
                            org.telegram.ui.ActionBar.u6.U(textView2, org.telegram.ui.ActionBar.n6.q7, null);
                            break;
                        }
                    }
                } else {
                    ht htVar = (ht) arrayList5.get(i7);
                    if (htVar != null) {
                        int i18 = htVar.h;
                        if (i18 >= 0) {
                            mtVar.q3[i18] = !r3[i18];
                            mtVar.D1(true);
                            break;
                        } else if (i18 == -2) {
                            ptVar.presentFragment(new DataAutoDownloadActivity(mtVar.g3 - 1));
                            break;
                        }
                    }
                }
                break;
            case 9:
                ky.a0((ky) this.b, view, i7);
                break;
            case 10:
                kz kzVar = (kz) this.b;
                if (kzVar.getParentActivity() != null && (czVar = (cz) kzVar.Q.get(i7)) != null) {
                    View.OnClickListener onClickListener = czVar.c;
                    if (onClickListener != null) {
                        onClickListener.onClick(view);
                        break;
                    } else {
                        int i19 = czVar.a;
                        if (i19 == 1) {
                            org.telegram.ui.Cells.ra raVar = (org.telegram.ui.Cells.ra) view;
                            kzVar.B0(czVar, raVar.getName(), raVar.getCurrentObject(), czVar.g);
                            break;
                        } else if (i19 == 7) {
                            vs vsVar = new vs(12, kzVar, czVar);
                            if (kzVar.c.x.f) {
                                kzVar.y0(vsVar, false);
                                break;
                            } else {
                                vsVar.run();
                                break;
                            }
                        } else if (i19 == 8 || (i19 == 4 && czVar.k == R.drawable.msg2_link2)) {
                            org.telegram.messenger.ro roVar = kzVar.r;
                            org.telegram.messenger.q2 q2Var = org.telegram.messenger.q2.E;
                            if (!kzVar.s || !kzVar.c.x.f) {
                                if (!TextUtils.isEmpty(kzVar.x) || !TextUtils.isEmpty(roVar.b)) {
                                    int i20 = kzVar.E;
                                    int i21 = org.telegram.messenger.mp.I8;
                                    if ((i20 & (-1537)) == 0 && kzVar.H.isEmpty() && !kzVar.G.isEmpty()) {
                                        kzVar.y0(new py(kzVar, 1), false);
                                        break;
                                    }
                                }
                                float f10 = -kzVar.R;
                                kzVar.R = f10;
                                org.telegram.messenger.g0.E3(f10, view, null);
                                q2Var.a();
                                if (TextUtils.isEmpty(kzVar.x) && TextUtils.isEmpty(roVar.b)) {
                                    b02 = org.telegram.ui.Components.lc.b0(kzVar);
                                    i10 = 2131750751;
                                } else {
                                    int i22 = kzVar.E;
                                    int i23 = org.telegram.messenger.mp.I8;
                                    if ((i22 & (-1537)) != 0) {
                                        if (kzVar.H.isEmpty()) {
                                            b02 = org.telegram.ui.Components.lc.b0(kzVar);
                                            i10 = 2131750749;
                                        } else {
                                            b02 = org.telegram.ui.Components.lc.b0(kzVar);
                                            i10 = 2131750748;
                                        }
                                    } else if (kzVar.G.isEmpty()) {
                                        b02 = org.telegram.ui.Components.lc.b0(kzVar);
                                        i10 = 2131750752;
                                    } else {
                                        b02 = org.telegram.ui.Components.lc.b0(kzVar);
                                        i10 = 2131750750;
                                    }
                                }
                                org.telegram.messenger.f3.o(null, i10, b02, null);
                                break;
                            } else {
                                float f11 = -kzVar.R;
                                kzVar.R = f11;
                                org.telegram.messenger.g0.E3(f11, view, null);
                                q2Var.a();
                                kzVar.w = true;
                                hi.m3 m3Var = kzVar.S;
                                if ((m3Var == null || !m3Var.W) && (kzVar.fragmentView instanceof FrameLayout)) {
                                    hi.m3 m3Var2 = new hi.m3(kzVar.getParentActivity(), 1);
                                    m3Var2.r(true);
                                    m3Var2.d = 2300L;
                                    m3Var2.U = true;
                                    m3Var2.e = true;
                                    m3Var2.n(11.0f, 6.0f, 11.0f, 7.0f);
                                    m3Var2.v0 = -org.telegram.messenger.g0.L(10.0f);
                                    kzVar.S = m3Var2;
                                    m3Var2.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
                                    m3Var2.l(kzVar.getBaseSimpleGlass().c);
                                    m3Var2.v(org.telegram.messenger.gd.M0(2131750764, null));
                                    m3Var2.r0 = new sy(m3Var2, z12 ? 1 : 0);
                                    ((FrameLayout) kzVar.fragmentView).addView(m3Var2, c8.ma.e(-1, org.telegram.messenger.ks.g2, 55));
                                    m3Var2.z(kzVar.c, true);
                                    break;
                                }
                            }
                        }
                    }
                }
                break;
            case 11:
                zy zyVar = (zy) this.b;
                ArrayList arrayList6 = zyVar.a2;
                int i24 = i7 - 1;
                if (i24 >= 0 && i24 < arrayList6.size()) {
                    cz czVar2 = (cz) arrayList6.get(i24);
                    int i25 = czVar2.a;
                    if (i25 == 7) {
                        zyVar.dismiss();
                        zyVar.s1.presentFragment(new ky(zyVar.U1, czVar2.m));
                        break;
                    } else if (i25 == 8) {
                        zyVar.e1();
                        break;
                    }
                }
                break;
            case 12:
                c00 c00Var = (c00) this.b;
                if (view instanceof org.telegram.ui.Cells.i7) {
                    c00Var.f(i7, view, ((org.telegram.ui.Cells.i7) view).getMessage(), 0);
                    break;
                } else if (view instanceof org.telegram.ui.Cells.l7) {
                    c00Var.f(i7, view, ((org.telegram.ui.Cells.l7) view).getMessage(), 0);
                    break;
                } else if (view instanceof org.telegram.ui.Cells.h7) {
                    c00Var.f(i7, view, ((org.telegram.ui.Cells.h7) view).getMessage(), 0);
                    break;
                } else if (view instanceof org.telegram.ui.Cells.i2) {
                    c00Var.f(i7, view, ((org.telegram.ui.Cells.i2) view).getMessageObject(), 0);
                    break;
                } else if (view instanceof org.telegram.ui.Cells.u2) {
                    c00Var.f(i7, view, ((org.telegram.ui.Cells.u2) view).getMessage(), 0);
                    break;
                }
                break;
            case 13:
                h50 h50Var = (h50) this.b;
                if (h50Var.getParentActivity() != null) {
                    if (i7 == h50Var.n || i7 == 0) {
                        if (h50Var.f != null) {
                            try {
                                ((ClipboardManager) org.telegram.messenger.t0.b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", h50Var.f.link));
                                org.telegram.ui.Components.lc.j(h50Var).j();
                                break;
                            } catch (Exception e10) {
                                org.telegram.messenger.a8.g(e10, true);
                                return;
                            }
                        }
                    } else if (i7 != h50Var.s) {
                        if (i7 == h50Var.r) {
                            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(h50Var.getParentActivity());
                            alertDialog$Builder3.a.U = org.telegram.messenger.gd.M0(2131745831, null);
                            alertDialog$Builder3.a.S = org.telegram.messenger.gd.M0(2131745828, null);
                            alertDialog$Builder3.k(org.telegram.messenger.gd.M0(2131745829, null), new zr(h50Var, 14));
                            alertDialog$Builder3.h(org.telegram.messenger.gd.M0(2131752578, null), null);
                            h50Var.showDialog(alertDialog$Builder3.a);
                            break;
                        }
                    } else if (h50Var.f != null) {
                        try {
                            Intent intent = new Intent("android.intent.action.SEND");
                            intent.setType("text/plain");
                            intent.putExtra("android.intent.extra.TEXT", h50Var.f.link);
                            h50Var.getParentActivity().startActivityForResult(Intent.createChooser(intent, org.telegram.messenger.gd.M0(2131748918, null)), 500);
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
                ((fg0) this.b).onBackPressed();
                break;
            case 18:
                og0 og0Var = (og0) this.b;
                int i26 = og0Var.J;
                if (i7 >= i26 && i7 < og0Var.K) {
                    org.telegram.messenger.fj fjVar = (org.telegram.messenger.fj) og0Var.y.get(i7 - i26);
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
                        if (og0Var.getMessagesController().E(bundle3, og0Var, null, null)) {
                            og0Var.presentFragment(new bn(bundle3));
                            break;
                        }
                    } else if (!og0Var.g0(fjVar)) {
                        og0Var.getOrCreateStoryViewer().L(og0Var.getParentActivity(), fjVar.l, fi.y6.a(og0Var.f));
                        break;
                    }
                }
                break;
            case 19:
                PasscodeActivity.a0((PasscodeActivity) this.b, view, i7);
                break;
            case 20:
                km0 km0Var = (km0) this.b;
                km0Var.a(i7, true);
                xl0 xl0Var = km0Var.h;
                if (xl0Var != null) {
                    xl0Var.a(Integer.valueOf(i7));
                    break;
                }
                break;
            case 21:
                cn0 cn0Var = (cn0) this.b;
                ArrayList arrayList7 = cn0Var.f;
                ArrayList arrayList8 = cn0Var.n;
                org.telegram.messenger.ue ueVar = cn0Var.K;
                if (ueVar != null || !arrayList7.isEmpty()) {
                    if (ueVar != null) {
                        arrayList7 = ueVar.e;
                    }
                    if (i7 >= 0 && i7 < arrayList7.size()) {
                        org.telegram.ui.ActionBar.r0 r0Var = cn0Var.Q;
                        if (r0Var != null) {
                            org.telegram.messenger.g0.v1(r0Var.getSearchField());
                        }
                        if (cn0Var.Z) {
                            cn0Var.f0(view, arrayList7.get(i7));
                            break;
                        } else {
                            int i27 = cn0Var.U;
                            if (i27 != 1 && i27 != 3) {
                                if (i27 != 2) {
                                    i12 = 10;
                                    if (i27 != 10) {
                                        i14 = cn0Var.V == null ? 4 : 0;
                                    }
                                }
                                i14 = i12;
                            }
                            PhotoViewer.p1().I2(null, cn0Var, null);
                            PhotoViewer p12 = PhotoViewer.p1();
                            int i28 = cn0Var.I;
                            boolean z18 = cn0Var.J;
                            p12.h = i28;
                            p12.n = z18;
                            PhotoViewer.p1().f2(arrayList7, i7, i14, cn0Var.m0, cn0Var.y0, cn0Var.V);
                            break;
                        }
                    }
                } else if (i7 < arrayList8.size()) {
                    String str = (String) arrayList8.get(i7);
                    dn0 dn0Var = cn0Var.u0;
                    if (dn0Var != null) {
                        switch (dn0Var.a) {
                            case 1:
                                fn0.m0(dn0Var.b, str);
                                break;
                            default:
                                fn0.m0(dn0Var.b, str);
                                break;
                        }
                    } else {
                        cn0Var.Q.getSearchField().setText(str);
                        cn0Var.Q.getSearchField().setSelection(str.length());
                        cn0Var.g0(cn0Var.Q.getSearchField());
                        break;
                    }
                } else if (i7 == arrayList8.size() + 1) {
                    AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(cn0Var.getParentActivity());
                    alertDialog$Builder4.a.S = org.telegram.messenger.gd.M0(2131752045, null);
                    alertDialog$Builder4.a.U = org.telegram.messenger.gd.M0(2131752050, null);
                    alertDialog$Builder4.k(org.telegram.messenger.gd.M0(2131752088, null), new um0(cn0Var, i13));
                    alertDialog$Builder4.h(org.telegram.messenger.gd.M0(2131752578, null), null);
                    org.telegram.ui.ActionBar.u1 u1Var3 = alertDialog$Builder4.a;
                    cn0Var.showDialog(u1Var3);
                    TextView textView3 = (TextView) u1Var3.d(-1);
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
                    photoViewer.z2(indexOf);
                }
                photoViewer.k5 = false;
                break;
            case 23:
                pr0 pr0Var = (pr0) this.b;
                boolean[] zArr = pr0Var.x;
                if (i7 == pr0Var.p0) {
                    pr0Var.k0();
                    break;
                } else if (view instanceof org.telegram.ui.Cells.s8) {
                    org.telegram.ui.Cells.s8 s8Var = (org.telegram.ui.Cells.s8) view;
                    boolean z19 = pr0Var.M;
                    org.telegram.ui.Components.yw0 yw0Var = pr0Var.R;
                    if (yw0Var != null) {
                        yw0Var.f();
                    }
                    if (pr0Var.J) {
                        int i29 = -pr0Var.P;
                        pr0Var.P = i29;
                        org.telegram.messenger.g0.E3(i29, s8Var, null);
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
                                            ((org.telegram.ui.Cells.s8) K.a).setChecked(false);
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
                                            ((org.telegram.ui.Cells.s8) K2.a).setChecked(false);
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
                                if (view2 instanceof org.telegram.ui.Cells.b6) {
                                    org.telegram.ui.Cells.b6 b6Var = (org.telegram.ui.Cells.b6) view2;
                                    b6Var.n(pr0Var.M, true);
                                    b6Var.r.a(zArr[i35 - pr0Var.o0], z19);
                                    if (b6Var.getTop() > org.telegram.messenger.g0.L(40.0f) && i7 == pr0Var.u0 && !pr0Var.N) {
                                        pr0Var.h.c(b6Var.getCheckBox());
                                        pr0Var.N = true;
                                    }
                                }
                            }
                        }
                        s8Var.setChecked(z10);
                        pr0Var.n0();
                        break;
                    }
                }
                break;
            case 24:
                PremiumPreviewFragment.Z((PremiumPreviewFragment) this.b, view, i7);
                break;
            case 25:
                vs0 vs0Var = (vs0) this.b;
                PremiumPreviewFragment premiumPreviewFragment = vs0Var.n;
                ArrayList arrayList10 = premiumPreviewFragment.d;
                br0 br0Var = vs0Var.e;
                if (view.isEnabled() && (view instanceof ug.o1)) {
                    ug.o1 o1Var = (ug.o1) view;
                    premiumPreviewFragment.e = arrayList10.indexOf(o1Var.getTier());
                    premiumPreviewFragment.y0(true);
                    o1Var.c(true, true);
                    for (int i36 = 0; i36 < br0Var.getChildCount(); i36++) {
                        View childAt = br0Var.getChildAt(i36);
                        if (childAt instanceof ug.o1) {
                            ug.o1 o1Var2 = (ug.o1) childAt;
                            if (o1Var2.getTier() != o1Var.getTier()) {
                                o1Var2.c(false, true);
                            }
                        }
                    }
                    for (int i37 = 0; i37 < br0Var.getHiddenChildCount(); i37++) {
                        View V = br0Var.V(i37);
                        if (V instanceof ug.o1) {
                            ug.o1 o1Var3 = (ug.o1) V;
                            if (o1Var3.getTier() != o1Var.getTier()) {
                                o1Var3.c(false, true);
                            }
                        }
                    }
                    for (int i38 = 0; i38 < br0Var.getCachedChildCount(); i38++) {
                        View P = br0Var.P(i38);
                        if (P instanceof ug.o1) {
                            ug.o1 o1Var4 = (ug.o1) P;
                            if (o1Var4.getTier() != o1Var.getTier()) {
                                o1Var4.c(false, true);
                            }
                        }
                    }
                    for (int i39 = 0; i39 < br0Var.getAttachedScrapChildCount(); i39++) {
                        View O = br0Var.O(i39);
                        if (O instanceof ug.o1) {
                            ug.o1 o1Var5 = (ug.o1) O;
                            if (o1Var5.getTier() != o1Var.getTier()) {
                                o1Var5.c(false, true);
                            }
                        }
                    }
                    FrameLayout frameLayout = premiumPreviewFragment.K;
                    if (!premiumPreviewFragment.getUserConfig().q() || ((xs0Var = premiumPreviewFragment.f) != null && xs0Var.a.months < ((xs0) arrayList10.get(premiumPreviewFragment.e)).a.months && !premiumPreviewFragment.q0)) {
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
