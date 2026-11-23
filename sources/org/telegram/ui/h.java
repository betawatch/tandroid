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

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final /* synthetic */ class h implements org.telegram.ui.Components.qj0 {
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
            org.telegram.ui.ActionBar.t1 t1Var = org.telegram.ui.Components.c5.L(st0Var.getParentActivity(), org.telegram.messenger.hd.N0(2131747719, null), org.telegram.messenger.hd.N0(2131747720, null), org.telegram.messenger.hd.N0(2131751586, null), new qt0(st0Var), null).a;
            t1Var.show();
            t1Var.i();
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

    @Override // org.telegram.ui.Components.qj0
    public final void c(int i7, View view) {
        TLRPC.InputStickerSet tL_inputStickerSetShortName;
        TLRPC.Chat chat;
        String N0;
        String a02;
        ts tsVar;
        cz czVar;
        org.telegram.ui.Components.lc b02;
        int i10;
        int i11;
        boolean z10;
        xs0 xs0Var;
        int i12 = 14;
        int i13 = 3;
        int i14 = 4;
        ps psVar = null;
        int i15 = 0;
        r5 = false;
        r5 = false;
        boolean z11 = false;
        switch (this.a) {
            case 0:
                k kVar = (k) this.b;
                ArrayList arrayList = kVar.h;
                if (i7 >= 0 && i7 < arrayList.size()) {
                    int i16 = ((i) arrayList.get(i7)).d;
                    if (i16 == 1) {
                        TLRPC.GlobalPrivacySettings globalPrivacySettings = kVar.d;
                        boolean z12 = !globalPrivacySettings.keep_archived_unmuted;
                        globalPrivacySettings.keep_archived_unmuted = z12;
                        ((org.telegram.ui.Cells.s8) view).setChecked(z12);
                        kVar.c = true;
                        break;
                    } else if (i16 == 4) {
                        TLRPC.GlobalPrivacySettings globalPrivacySettings2 = kVar.d;
                        boolean z13 = !globalPrivacySettings2.keep_archived_folders;
                        globalPrivacySettings2.keep_archived_folders = z13;
                        ((org.telegram.ui.Cells.s8) view).setChecked(z13);
                        kVar.c = true;
                        break;
                    } else if (i16 == 7) {
                        if (!kVar.getUserConfig().q() && !kVar.getMessagesController().b4 && !kVar.d.archive_and_mute_new_noncontact_peers) {
                            org.telegram.ui.Components.yb ybVar = new org.telegram.ui.Components.yb(kVar.getParentActivity(), kVar.getResourceProvider());
                            org.telegram.ui.Components.m80 m80Var = ybVar.b;
                            m80Var.setText(org.telegram.messenger.g0.R2(org.telegram.messenger.hd.N0(2131743621, null), org.telegram.ui.ActionBar.m6.xj, 0, new hq0(kVar, i13), null));
                            m80Var.setSingleLine(false);
                            m80Var.setPadding(0, org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f));
                            ybVar.a.setImageResource(R.drawable.msg_settings_premium);
                            org.telegram.ui.Components.gc.g(kVar, ybVar, 3500).j();
                            int i17 = -kVar.e;
                            kVar.e = i17;
                            org.telegram.messenger.g0.E3(i17, view, null);
                            org.telegram.messenger.q2.E.a();
                            break;
                        } else {
                            TLRPC.GlobalPrivacySettings globalPrivacySettings3 = kVar.d;
                            boolean z14 = !globalPrivacySettings3.archive_and_mute_new_noncontact_peers;
                            globalPrivacySettings3.archive_and_mute_new_noncontact_peers = z14;
                            ((org.telegram.ui.Cells.s8) view).setChecked(z14);
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
                    org.telegram.ui.Components.kw0 kw0Var = new org.telegram.ui.Components.kw0(oVar.getParentActivity(), oVar, inputStickerSet, null, null, null);
                    kw0Var.X1 = new m(oVar, view, stickerSetCovered);
                    oVar.showDialog(kw0Var);
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
                    org.telegram.ui.Components.mp mpVar = (org.telegram.ui.Components.mp) arrayList2.get(i7);
                    ocVar.a(mpVar.a(), true);
                    if (view.getLeft() < org.telegram.messenger.g0.L(24.0f) + f61Var.getPaddingLeft()) {
                        f61Var.w0(-((org.telegram.messenger.g0.L(48.0f) + f61Var.getPaddingLeft()) - view.getLeft()), 0, null);
                    } else if (view.getWidth() + view.getLeft() > (f61Var.getMeasuredWidth() - f61Var.getPaddingRight()) - org.telegram.messenger.g0.L(24.0f)) {
                        f61Var.w0(org.telegram.messenger.f3.B(48.0f, f61Var.getMeasuredWidth() - f61Var.getPaddingRight(), view.getWidth() + view.getLeft()), 0, null);
                    }
                    org.telegram.messenger.y10 y10Var = ocVar.r;
                    if (y10Var != null) {
                        y10Var.a(mpVar.a());
                        break;
                    }
                }
                break;
            case 4:
                vo voVar = (vo) this.b;
                boolean z15 = voVar.s;
                if (voVar.getParentActivity() != null) {
                    v4.i0 adapter = voVar.b.getAdapter();
                    uo uoVar = voVar.e;
                    if (adapter == uoVar) {
                        chat = (TLRPC.Chat) uoVar.d.get(i7);
                    } else {
                        int i18 = voVar.H;
                        chat = (i7 < i18 || i7 >= voVar.I) ? null : (TLRPC.Chat) voVar.w.get(i7 - i18);
                    }
                    if (chat != null) {
                        if (!z15 || voVar.h.linked_chat_id != 0) {
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", chat.id);
                            voVar.presentFragment(new bn(bundle));
                            break;
                        } else {
                            voVar.f0(chat, true);
                            break;
                        }
                    } else if (i7 == voVar.G) {
                        if (z15 && voVar.h.linked_chat_id == 0) {
                            Bundle bundle2 = new Bundle();
                            bundle2.putLongArray("result", new long[]{voVar.getUserConfig().e()});
                            bundle2.putInt("chatType", 4);
                            TLRPC.Chat chat2 = voVar.f;
                            if (chat2 != null) {
                                bundle2.putString("title", org.telegram.messenger.hd.a0("GroupCreateDiscussionDefaultName", null, 2131749261, chat2.title));
                            }
                            f50 f50Var = new f50(bundle2);
                            f50Var.Z = new no(voVar);
                            voVar.presentFragment(f50Var);
                            break;
                        } else if (!voVar.w.isEmpty()) {
                            TLRPC.Chat chat3 = (TLRPC.Chat) voVar.w.get(0);
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(voVar.getParentActivity());
                            if (z15) {
                                N0 = org.telegram.messenger.hd.N0(2131751359, null);
                                a02 = org.telegram.messenger.hd.a0("DiscussionUnlinkChannelAlert", null, 2131751360, chat3.title);
                            } else {
                                N0 = org.telegram.messenger.hd.N0(2131751361, null);
                                a02 = org.telegram.messenger.hd.a0("DiscussionUnlinkGroupAlert", null, 2131751358, chat3.title);
                            }
                            alertDialog$Builder.a.S = N0;
                            alertDialog$Builder.a.U = org.telegram.messenger.g0.W2(a02);
                            alertDialog$Builder.k(org.telegram.messenger.hd.N0(2131751362, null), new w0(voVar, 25));
                            alertDialog$Builder.h(org.telegram.messenger.hd.N0(2131752577, null), null);
                            org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
                            voVar.showDialog(t1Var);
                            TextView textView = (TextView) t1Var.d(-1);
                            if (textView != null) {
                                org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.q7, null);
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
                    boolean z16 = !contains;
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
                        r22.c(z16, true);
                    }
                    org.telegram.ui.Components.op opVar = xVar.d;
                    if (opVar != null) {
                        opVar.a(z16, true);
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
                    org.telegram.ui.Components.pw0.c(null, nsVar.c0, nsVar.z.getContext(), new a5(jsVar, 9));
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
                us usVar = (us) this.b;
                if (usVar.f && usVar.e) {
                    org.telegram.ui.Components.ek ekVar = usVar.d;
                    ArrayList arrayList4 = ekVar.e;
                    if (arrayList4 != null && i7 >= 0 && i7 < arrayList4.size()) {
                        psVar = (ps) ekVar.e.get(i7);
                    }
                } else {
                    int S = usVar.c.S(i7);
                    int Q = usVar.c.Q(i7);
                    if (Q >= 0 && S >= 0) {
                        psVar = usVar.c.O(S, Q);
                    }
                }
                if (i7 >= 0) {
                    usVar.finishFragment();
                    if (psVar != null && (tsVar = usVar.r) != null) {
                        tsVar.b(psVar);
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
                        alertDialog$Builder2.a.S = org.telegram.messenger.hd.N0(2131745893, null);
                        alertDialog$Builder2.a.U = org.telegram.messenger.hd.N0(2131745894, null);
                        alertDialog$Builder2.k(org.telegram.messenger.hd.N0(2131745922, null), new jt(mtVar));
                        alertDialog$Builder2.h(org.telegram.messenger.hd.N0(2131752577, null), null);
                        org.telegram.ui.ActionBar.t1 t1Var2 = alertDialog$Builder2.a;
                        ptVar.showDialog(t1Var2);
                        TextView textView2 = (TextView) t1Var2.d(-1);
                        if (textView2 != null) {
                            org.telegram.ui.ActionBar.t6.U(textView2, org.telegram.ui.ActionBar.m6.q7, null);
                            break;
                        }
                    }
                } else {
                    ht htVar = (ht) arrayList5.get(i7);
                    if (htVar != null) {
                        int i19 = htVar.h;
                        if (i19 >= 0) {
                            mtVar.q3[i19] = !r3[i19];
                            mtVar.D1(true);
                            break;
                        } else if (i19 == -2) {
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
                        int i20 = czVar.a;
                        if (i20 == 1) {
                            org.telegram.ui.Cells.ra raVar = (org.telegram.ui.Cells.ra) view;
                            kzVar.B0(czVar, raVar.getName(), raVar.getCurrentObject(), czVar.g);
                            break;
                        } else if (i20 == 7) {
                            ss ssVar = new ss(i12, kzVar, czVar);
                            if (kzVar.c.x.f) {
                                kzVar.y0(ssVar, false);
                                break;
                            } else {
                                ssVar.run();
                                break;
                            }
                        } else if (i20 == 8 || (i20 == 4 && czVar.k == R.drawable.msg2_link2)) {
                            org.telegram.messenger.so soVar = kzVar.r;
                            org.telegram.messenger.q2 q2Var = org.telegram.messenger.q2.E;
                            if (!kzVar.s || !kzVar.c.x.f) {
                                if (!TextUtils.isEmpty(kzVar.x) || !TextUtils.isEmpty(soVar.b)) {
                                    int i21 = kzVar.E;
                                    int i22 = org.telegram.messenger.np.I8;
                                    if ((i21 & (-1537)) == 0 && kzVar.H.isEmpty() && !kzVar.G.isEmpty()) {
                                        kzVar.y0(new py(kzVar, 1), false);
                                        break;
                                    }
                                }
                                float f10 = -kzVar.R;
                                kzVar.R = f10;
                                org.telegram.messenger.g0.E3(f10, view, null);
                                q2Var.a();
                                if (TextUtils.isEmpty(kzVar.x) && TextUtils.isEmpty(soVar.b)) {
                                    b02 = org.telegram.ui.Components.lc.b0(kzVar);
                                    i10 = 2131750750;
                                } else {
                                    int i23 = kzVar.E;
                                    int i24 = org.telegram.messenger.np.I8;
                                    if ((i23 & (-1537)) != 0) {
                                        if (kzVar.H.isEmpty()) {
                                            b02 = org.telegram.ui.Components.lc.b0(kzVar);
                                            i10 = 2131750748;
                                        } else {
                                            b02 = org.telegram.ui.Components.lc.b0(kzVar);
                                            i10 = 2131750747;
                                        }
                                    } else if (kzVar.G.isEmpty()) {
                                        b02 = org.telegram.ui.Components.lc.b0(kzVar);
                                        i10 = 2131750751;
                                    } else {
                                        b02 = org.telegram.ui.Components.lc.b0(kzVar);
                                        i10 = 2131750749;
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
                                hi.l3 l3Var = kzVar.S;
                                if ((l3Var == null || !l3Var.W) && (kzVar.fragmentView instanceof FrameLayout)) {
                                    hi.l3 l3Var2 = new hi.l3(kzVar.getParentActivity(), 1);
                                    l3Var2.r(true);
                                    l3Var2.d = 2300L;
                                    l3Var2.U = true;
                                    l3Var2.e = true;
                                    l3Var2.n(11.0f, 6.0f, 11.0f, 7.0f);
                                    l3Var2.v0 = -org.telegram.messenger.g0.L(10.0f);
                                    kzVar.S = l3Var2;
                                    l3Var2.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
                                    l3Var2.l(kzVar.getBaseSimpleGlass().c);
                                    l3Var2.v(org.telegram.messenger.hd.N0(2131750763, null));
                                    l3Var2.r0 = new sy(l3Var2, i15);
                                    ((FrameLayout) kzVar.fragmentView).addView(l3Var2, c8.ma.e(-1, org.telegram.messenger.ls.g2, 55));
                                    l3Var2.z(kzVar.c, true);
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
                int i25 = i7 - 1;
                if (i25 >= 0 && i25 < arrayList6.size()) {
                    cz czVar2 = (cz) arrayList6.get(i25);
                    int i26 = czVar2.a;
                    if (i26 == 7) {
                        zyVar.dismiss();
                        zyVar.s1.presentFragment(new ky(zyVar.U1, czVar2.m));
                        break;
                    } else if (i26 == 8) {
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
                            alertDialog$Builder3.a.U = org.telegram.messenger.hd.N0(2131745830, null);
                            alertDialog$Builder3.a.S = org.telegram.messenger.hd.N0(2131745827, null);
                            alertDialog$Builder3.k(org.telegram.messenger.hd.N0(2131745828, null), new zr(h50Var, i12));
                            alertDialog$Builder3.h(org.telegram.messenger.hd.N0(2131752577, null), null);
                            h50Var.showDialog(alertDialog$Builder3.a);
                            break;
                        }
                    } else if (h50Var.f != null) {
                        try {
                            Intent intent = new Intent("android.intent.action.SEND");
                            intent.setType("text/plain");
                            intent.putExtra("android.intent.extra.TEXT", h50Var.f.link);
                            h50Var.getParentActivity().startActivityForResult(Intent.createChooser(intent, org.telegram.messenger.hd.N0(2131748917, null)), 500);
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
                ((eg0) this.b).onBackPressed();
                break;
            case 18:
                og0 og0Var = (og0) this.b;
                int i27 = og0Var.J;
                if (i7 >= i27 && i7 < og0Var.K) {
                    org.telegram.messenger.gj gjVar = (org.telegram.messenger.gj) og0Var.y.get(i7 - i27);
                    if (!gjVar.x4()) {
                        long B0 = org.telegram.messenger.gj.B0(gjVar.k);
                        Bundle bundle3 = new Bundle();
                        if (org.telegram.messenger.n5.E(B0)) {
                            bundle3.putLong("user_id", B0);
                        } else {
                            bundle3.putLong("chat_id", -B0);
                        }
                        bundle3.putInt("message_id", gjVar.e1());
                        bundle3.putBoolean("need_remove_previous_same_chat_activity", false);
                        if (og0Var.getMessagesController().E(bundle3, og0Var, null, null)) {
                            og0Var.presentFragment(new bn(bundle3));
                            break;
                        }
                    } else if (!og0Var.g0(gjVar)) {
                        og0Var.getOrCreateStoryViewer().L(og0Var.getParentActivity(), gjVar.l, fi.y6.a(og0Var.f));
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
                org.telegram.messenger.ve veVar = cn0Var.K;
                if (veVar != null || !arrayList7.isEmpty()) {
                    if (veVar != null) {
                        arrayList7 = veVar.e;
                    }
                    if (i7 >= 0 && i7 < arrayList7.size()) {
                        org.telegram.ui.ActionBar.q0 q0Var = cn0Var.Q;
                        if (q0Var != null) {
                            org.telegram.messenger.g0.v1(q0Var.getSearchField());
                        }
                        if (cn0Var.Z) {
                            cn0Var.f0(view, arrayList7.get(i7));
                            break;
                        } else {
                            int i28 = cn0Var.U;
                            if (i28 == 1 || i28 == 3) {
                                i15 = 1;
                            } else {
                                if (i28 != 2) {
                                    i13 = 10;
                                    if (i28 != 10) {
                                        if (cn0Var.V == null) {
                                            i15 = 4;
                                        }
                                    }
                                }
                                i15 = i13;
                            }
                            PhotoViewer.p1().I2(null, cn0Var, null);
                            PhotoViewer p12 = PhotoViewer.p1();
                            int i29 = cn0Var.I;
                            boolean z17 = cn0Var.J;
                            p12.h = i29;
                            p12.n = z17;
                            PhotoViewer.p1().f2(arrayList7, i7, i15, cn0Var.m0, cn0Var.y0, cn0Var.V);
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
                    alertDialog$Builder4.a.S = org.telegram.messenger.hd.N0(2131752044, null);
                    alertDialog$Builder4.a.U = org.telegram.messenger.hd.N0(2131752049, null);
                    alertDialog$Builder4.k(org.telegram.messenger.hd.N0(2131752087, null), new um0(cn0Var, i14));
                    alertDialog$Builder4.h(org.telegram.messenger.hd.N0(2131752577, null), null);
                    org.telegram.ui.ActionBar.t1 t1Var3 = alertDialog$Builder4.a;
                    cn0Var.showDialog(t1Var3);
                    TextView textView3 = (TextView) t1Var3.d(-1);
                    if (textView3 != null) {
                        org.telegram.ui.ActionBar.t6.U(textView3, org.telegram.ui.ActionBar.m6.q7, null);
                        break;
                    }
                }
                break;
            case 22:
                PhotoViewer photoViewer = (PhotoViewer) this.b;
                ArrayList arrayList9 = photoViewer.g7;
                if (!arrayList9.isEmpty() && (i11 = photoViewer.P4) >= 0 && i11 < arrayList9.size()) {
                    Object obj = arrayList9.get(photoViewer.P4);
                    if (obj instanceof org.telegram.messenger.ye) {
                        ((org.telegram.messenger.ye) obj).s = photoViewer.j1();
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
                    boolean z18 = pr0Var.M;
                    org.telegram.ui.Components.ax0 ax0Var = pr0Var.R;
                    if (ax0Var != null) {
                        ax0Var.f();
                    }
                    if (pr0Var.J) {
                        int i30 = -pr0Var.P;
                        pr0Var.P = i30;
                        org.telegram.messenger.g0.E3(i30, s8Var, null);
                        org.telegram.messenger.q2.E.a();
                        break;
                    } else {
                        if (i7 == pr0Var.s0) {
                            z10 = !pr0Var.H;
                            pr0Var.H = z10;
                        } else {
                            int i31 = pr0Var.v0;
                            if (i7 == i31) {
                                z10 = !pr0Var.I;
                                pr0Var.I = z10;
                            } else if (i7 == pr0Var.w0) {
                                z10 = !pr0Var.K;
                                pr0Var.K = z10;
                                pr0Var.w0();
                                int i32 = pr0Var.v0;
                                if (i32 >= 0 && i31 < 0) {
                                    pr0Var.b.i(i32);
                                } else if (i31 >= 0 && i32 < 0) {
                                    pr0Var.b.s(i31);
                                }
                            } else if (i7 == pr0Var.t0) {
                                boolean z19 = pr0Var.L;
                                boolean z20 = !z19;
                                pr0Var.L = z20;
                                if (!z19 && pr0Var.M) {
                                    int i33 = pr0Var.k0;
                                    pr0Var.M = false;
                                    pr0Var.w0();
                                    v4.f1 K = pr0Var.c.K(pr0Var.u0);
                                    if (K != null) {
                                        ((org.telegram.ui.Cells.s8) K.a).setChecked(false);
                                    } else {
                                        pr0Var.b.g(pr0Var.u0);
                                    }
                                    pr0Var.b.p(i33, 2);
                                }
                                z10 = z20;
                            } else if (pr0Var.O == 0) {
                                boolean z21 = !pr0Var.M;
                                pr0Var.M = z21;
                                int i34 = pr0Var.k0;
                                pr0Var.w0();
                                if (pr0Var.M) {
                                    pr0Var.b.o(pr0Var.k0, 2);
                                } else {
                                    pr0Var.b.p(i34, 2);
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
                                    int i35 = 0;
                                    boolean z22 = false;
                                    while (i35 < zArr.length) {
                                        if (z22) {
                                            zArr[i35] = false;
                                        } else if (zArr[i35]) {
                                            z22 = true;
                                        }
                                        i35++;
                                        z22 = z22;
                                    }
                                }
                                z10 = z21;
                            }
                        }
                        if (pr0Var.N && !pr0Var.M) {
                            pr0Var.c.getChildCount();
                            pr0Var.h.a();
                        }
                        for (int i36 = pr0Var.o0; i36 < pr0Var.o0 + pr0Var.E; i36++) {
                            v4.f1 K3 = pr0Var.c.K(i36);
                            if (K3 != null) {
                                View view2 = K3.a;
                                if (view2 instanceof org.telegram.ui.Cells.b6) {
                                    org.telegram.ui.Cells.b6 b6Var = (org.telegram.ui.Cells.b6) view2;
                                    b6Var.n(pr0Var.M, true);
                                    b6Var.r.a(zArr[i36 - pr0Var.o0], z18);
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
                if (view.isEnabled() && (view instanceof ug.n1)) {
                    ug.n1 n1Var = (ug.n1) view;
                    premiumPreviewFragment.e = arrayList10.indexOf(n1Var.getTier());
                    premiumPreviewFragment.y0(true);
                    n1Var.c(true, true);
                    for (int i37 = 0; i37 < br0Var.getChildCount(); i37++) {
                        View childAt = br0Var.getChildAt(i37);
                        if (childAt instanceof ug.n1) {
                            ug.n1 n1Var2 = (ug.n1) childAt;
                            if (n1Var2.getTier() != n1Var.getTier()) {
                                n1Var2.c(false, true);
                            }
                        }
                    }
                    for (int i38 = 0; i38 < br0Var.getHiddenChildCount(); i38++) {
                        View V = br0Var.V(i38);
                        if (V instanceof ug.n1) {
                            ug.n1 n1Var3 = (ug.n1) V;
                            if (n1Var3.getTier() != n1Var.getTier()) {
                                n1Var3.c(false, true);
                            }
                        }
                    }
                    for (int i39 = 0; i39 < br0Var.getCachedChildCount(); i39++) {
                        View P = br0Var.P(i39);
                        if (P instanceof ug.n1) {
                            ug.n1 n1Var4 = (ug.n1) P;
                            if (n1Var4.getTier() != n1Var.getTier()) {
                                n1Var4.c(false, true);
                            }
                        }
                    }
                    for (int i40 = 0; i40 < br0Var.getAttachedScrapChildCount(); i40++) {
                        View O = br0Var.O(i40);
                        if (O instanceof ug.n1) {
                            ug.n1 n1Var5 = (ug.n1) O;
                            if (n1Var5.getTier() != n1Var.getTier()) {
                                n1Var5.c(false, true);
                            }
                        }
                    }
                    FrameLayout frameLayout = premiumPreviewFragment.K;
                    if (!premiumPreviewFragment.getUserConfig().q() || ((xs0Var = premiumPreviewFragment.f) != null && xs0Var.a.months < ((xs0) arrayList10.get(premiumPreviewFragment.e)).a.months && !premiumPreviewFragment.q0)) {
                        z11 = true;
                    }
                    org.telegram.messenger.g0.V3(frameLayout, z11);
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
