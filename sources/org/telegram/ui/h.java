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

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class h implements org.telegram.ui.Components.gj0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ h(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    private final void a(int i7, View view) {
        pt0 pt0Var = (pt0) this.b;
        int i10 = pt0Var.E;
        if (i7 == pt0Var.x) {
            org.telegram.ui.ActionBar.t1 t1Var = org.telegram.ui.Components.t4.L(pt0Var.getParentActivity(), org.telegram.messenger.hd.M0(2131747913, null), org.telegram.messenger.hd.M0(2131747914, null), org.telegram.messenger.hd.M0(2131751598, null), new nt0(pt0Var), null).a;
            t1Var.show();
            t1Var.i();
            return;
        }
        if (i7 != pt0Var.f) {
            if (i7 < pt0Var.r || i7 >= pt0Var.s) {
                return;
            }
            if (i10 != 1) {
                new Bundle();
                throw null;
            }
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", pt0Var.getMessagesController().H0.keyAt(i7 - pt0Var.r));
            pt0Var.presentFragment(new ProfileActivity(bundle, null));
            return;
        }
        if (i10 != 1) {
            Bundle k10 = a8.p0.k("isNeverShare", true);
            if (i10 == 2) {
                k10.putInt("chatAddType", 2);
            }
            w40 w40Var = new w40(k10);
            w40Var.x = new mt0(pt0Var);
            pt0Var.presentFragment(w40Var);
            return;
        }
        cu cuVar = new cu(null);
        cuVar.d = new Paint();
        cuVar.f = new bu[2];
        cuVar.x = true;
        Bundle bundle2 = new Bundle();
        bundle2.putBoolean("onlySelect", true);
        bundle2.putBoolean("checkCanWrite", false);
        bundle2.putBoolean("resetDelegate", false);
        bundle2.putInt("dialogsType", 9);
        yw ywVar = new yw(bundle2);
        cuVar.a = ywVar;
        ywVar.E2 = new zt(cuVar);
        ywVar.onFragmentCreate();
        Bundle bundle3 = new Bundle();
        bundle3.putBoolean("onlyUsers", true);
        bundle3.putBoolean("destroyAfterSelect", true);
        bundle3.putBoolean("returnAsResult", true);
        bundle3.putBoolean("disableSections", true);
        bundle3.putBoolean("needFinishFragment", false);
        bundle3.putBoolean("resetDelegate", false);
        bundle3.putBoolean("allowSelf", false);
        ContactsActivity contactsActivity = new ContactsActivity(bundle3);
        cuVar.b = contactsActivity;
        contactsActivity.V = new zt(cuVar);
        contactsActivity.onFragmentCreate();
        pt0Var.presentFragment(cuVar);
    }

    @Override // org.telegram.ui.Components.gj0
    public final void b(int i7, View view) {
        TLRPC.InputStickerSet tL_inputStickerSetShortName;
        TLRPC.Chat chat;
        String M0;
        String a02;
        ss ssVar;
        zy zyVar;
        org.telegram.ui.Components.cc a03;
        int i10;
        int i11;
        boolean z10;
        boolean z11;
        ts0 ts0Var;
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
                            org.telegram.ui.Components.pb pbVar = new org.telegram.ui.Components.pb(kVar.getParentActivity(), kVar.getResourceProvider());
                            org.telegram.ui.Components.z70 z70Var = pbVar.b;
                            z70Var.setText(org.telegram.messenger.g0.S2(org.telegram.messenger.hd.M0(2131743866, null), org.telegram.ui.ActionBar.j6.xj, 0, new fq0(kVar, i12), null));
                            z70Var.setSingleLine(false);
                            z70Var.setPadding(0, org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f));
                            pbVar.a.setImageResource(R.drawable.msg_settings_premium);
                            org.telegram.ui.Components.xb.g(kVar, pbVar, 3500).j();
                            int i16 = -kVar.e;
                            kVar.e = i16;
                            org.telegram.messenger.g0.F3(i16, view, null);
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
                    org.telegram.ui.Components.bw0 bw0Var = new org.telegram.ui.Components.bw0(oVar.getParentActivity(), oVar, inputStickerSet, null, null, null);
                    bw0Var.X1 = new m(oVar, view, stickerSetCovered);
                    oVar.showDialog(bw0Var);
                    break;
                }
                break;
            case 2:
                vy0.Z((vy0) this.b, i7);
                break;
            case 3:
                oc ocVar = (oc) this.b;
                ArrayList arrayList2 = ocVar.c;
                b61 b61Var = ocVar.d;
                if (i7 >= 0 && i7 < arrayList2.size()) {
                    org.telegram.ui.Components.dp dpVar = (org.telegram.ui.Components.dp) arrayList2.get(i7);
                    ocVar.a(dpVar.a(), true);
                    if (view.getLeft() < org.telegram.messenger.g0.L(24.0f) + b61Var.getPaddingLeft()) {
                        b61Var.w0(-((org.telegram.messenger.g0.L(48.0f) + b61Var.getPaddingLeft()) - view.getLeft()), 0, null);
                    } else if (view.getWidth() + view.getLeft() > (b61Var.getMeasuredWidth() - b61Var.getPaddingRight()) - org.telegram.messenger.g0.L(24.0f)) {
                        b61Var.w0(org.telegram.messenger.k5.B(48.0f, b61Var.getMeasuredWidth() - b61Var.getPaddingRight(), view.getWidth() + view.getLeft()), 0, null);
                    }
                    org.telegram.messenger.z10 z10Var = ocVar.r;
                    if (z10Var != null) {
                        z10Var.a(dpVar.a());
                        break;
                    }
                }
                break;
            case 4:
                to toVar = (to) this.b;
                boolean z16 = toVar.s;
                if (toVar.getParentActivity() != null) {
                    v4.h0 adapter = toVar.b.getAdapter();
                    so soVar = toVar.e;
                    if (adapter == soVar) {
                        chat = (TLRPC.Chat) soVar.d.get(i7);
                    } else {
                        int i17 = toVar.H;
                        chat = (i7 < i17 || i7 >= toVar.I) ? null : (TLRPC.Chat) toVar.w.get(i7 - i17);
                    }
                    if (chat != null) {
                        if (!z16 || toVar.h.linked_chat_id != 0) {
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", chat.id);
                            toVar.presentFragment(new an(bundle));
                            break;
                        } else {
                            toVar.f0(chat, true);
                            break;
                        }
                    } else if (i7 == toVar.G) {
                        if (z16 && toVar.h.linked_chat_id == 0) {
                            Bundle bundle2 = new Bundle();
                            bundle2.putLongArray("result", new long[]{toVar.getUserConfig().e()});
                            bundle2.putInt("chatType", 4);
                            TLRPC.Chat chat2 = toVar.f;
                            if (chat2 != null) {
                                bundle2.putString("title", org.telegram.messenger.hd.a0("GroupCreateDiscussionDefaultName", null, 2131749454, chat2.title));
                            }
                            c50 c50Var = new c50(bundle2);
                            c50Var.Z = new lo(toVar);
                            toVar.presentFragment(c50Var);
                            break;
                        } else if (!toVar.w.isEmpty()) {
                            TLRPC.Chat chat3 = (TLRPC.Chat) toVar.w.get(0);
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(toVar.getParentActivity());
                            if (z16) {
                                M0 = org.telegram.messenger.hd.M0(2131751371, null);
                                a02 = org.telegram.messenger.hd.a0("DiscussionUnlinkChannelAlert", null, 2131751372, chat3.title);
                            } else {
                                M0 = org.telegram.messenger.hd.M0(2131751373, null);
                                a02 = org.telegram.messenger.hd.a0("DiscussionUnlinkGroupAlert", null, 2131751370, chat3.title);
                            }
                            alertDialog$Builder.a.S = M0;
                            alertDialog$Builder.a.U = org.telegram.messenger.g0.X2(a02);
                            alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131751374, null), new w0(toVar, 25));
                            alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
                            org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
                            toVar.showDialog(t1Var);
                            TextView textView = (TextView) t1Var.d(-1);
                            if (textView != null) {
                                org.telegram.ui.ActionBar.q6.U(textView, org.telegram.ui.ActionBar.j6.q7, null);
                                break;
                            }
                        }
                    }
                }
                break;
            case 5:
                ap apVar = (ap) this.b;
                ArrayList arrayList3 = apVar.n;
                if (i7 > 2) {
                    org.telegram.ui.Cells.x xVar = (org.telegram.ui.Cells.x) view;
                    TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) arrayList3.get(i7 - 3);
                    boolean contains = apVar.d.contains(tL_availableReaction.reaction);
                    boolean z17 = !contains;
                    if (contains) {
                        apVar.d.remove(tL_availableReaction.reaction);
                        if (apVar.d.isEmpty()) {
                            zo zoVar = apVar.h;
                            if (zoVar != null) {
                                zoVar.p(2, arrayList3.size() + 1);
                            }
                            apVar.a0(2, true);
                        }
                    } else {
                        apVar.d.add(tL_availableReaction.reaction);
                    }
                    Switch r22 = xVar.c;
                    if (r22 != null) {
                        r22.c(z17, true);
                    }
                    org.telegram.ui.Components.fp fpVar = xVar.d;
                    if (fpVar != null) {
                        fpVar.a(z17, true);
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
                    org.telegram.ui.Components.gw0.c(null, nsVar.c0, nsVar.z.getContext(), new a5(jsVar, 9));
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
                    org.telegram.ui.Components.vj vjVar = tsVar.d;
                    ArrayList arrayList4 = vjVar.e;
                    if (arrayList4 != null && i7 >= 0 && i7 < arrayList4.size()) {
                        psVar = (ps) vjVar.e.get(i7);
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
                        ssVar.e(psVar);
                        break;
                    }
                }
                break;
            case 8:
                kt ktVar = (kt) this.b;
                ArrayList arrayList5 = ktVar.k3;
                nt ntVar = ktVar.w3;
                if (!(view instanceof dt) || i7 < 0 || i7 >= arrayList5.size()) {
                    if (view instanceof org.telegram.ui.Cells.l8) {
                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(ntVar.getParentActivity());
                        alertDialog$Builder2.a.S = org.telegram.messenger.hd.M0(2131746089, null);
                        alertDialog$Builder2.a.U = org.telegram.messenger.hd.M0(2131746090, null);
                        alertDialog$Builder2.k(org.telegram.messenger.hd.M0(2131746118, null), new gt(ktVar));
                        alertDialog$Builder2.h(org.telegram.messenger.hd.M0(2131752589, null), null);
                        org.telegram.ui.ActionBar.t1 t1Var2 = alertDialog$Builder2.a;
                        ntVar.showDialog(t1Var2);
                        TextView textView2 = (TextView) t1Var2.d(-1);
                        if (textView2 != null) {
                            org.telegram.ui.ActionBar.q6.U(textView2, org.telegram.ui.ActionBar.j6.q7, null);
                            break;
                        }
                    }
                } else {
                    ft ftVar = (ft) arrayList5.get(i7);
                    if (ftVar != null) {
                        int i18 = ftVar.h;
                        if (i18 >= 0) {
                            ktVar.q3[i18] = !r3[i18];
                            ktVar.D1(true);
                            break;
                        } else if (i18 == -2) {
                            ntVar.presentFragment(new DataAutoDownloadActivity(ktVar.g3 - 1));
                            break;
                        }
                    }
                }
                break;
            case 9:
                hy.a0((hy) this.b, view, i7);
                break;
            case 10:
                hz hzVar = (hz) this.b;
                if (hzVar.getParentActivity() != null && (zyVar = (zy) hzVar.Q.get(i7)) != null) {
                    View.OnClickListener onClickListener = zyVar.c;
                    if (onClickListener != null) {
                        onClickListener.onClick(view);
                        break;
                    } else {
                        int i19 = zyVar.a;
                        if (i19 == 1) {
                            org.telegram.ui.Cells.pa paVar = (org.telegram.ui.Cells.pa) view;
                            hzVar.B0(zyVar, paVar.getName(), paVar.getCurrentObject(), zyVar.g);
                            break;
                        } else if (i19 == 7) {
                            org.telegram.ui.Components.voip.u uVar = new org.telegram.ui.Components.voip.u(17, hzVar, zyVar);
                            if (hzVar.c.x.f) {
                                hzVar.y0(uVar, false);
                                break;
                            } else {
                                uVar.run();
                                break;
                            }
                        } else if (i19 == 8 || (i19 == 4 && zyVar.k == R.drawable.msg2_link2)) {
                            org.telegram.messenger.so soVar2 = hzVar.r;
                            org.telegram.messenger.p2 p2Var = org.telegram.messenger.p2.E;
                            if (!hzVar.s || !hzVar.c.x.f) {
                                if (!TextUtils.isEmpty(hzVar.x) || !TextUtils.isEmpty(soVar2.b)) {
                                    int i20 = hzVar.E;
                                    int i21 = org.telegram.messenger.np.D8;
                                    if ((i20 & (-1537)) == 0 && hzVar.H.isEmpty() && !hzVar.G.isEmpty()) {
                                        hzVar.y0(new my(hzVar, 1), false);
                                        break;
                                    }
                                }
                                float f10 = -hzVar.R;
                                hzVar.R = f10;
                                org.telegram.messenger.g0.F3(f10, view, null);
                                p2Var.a();
                                if (TextUtils.isEmpty(hzVar.x) && TextUtils.isEmpty(soVar2.b)) {
                                    a03 = org.telegram.ui.Components.cc.a0(hzVar);
                                    i10 = 2131750762;
                                } else {
                                    int i22 = hzVar.E;
                                    int i23 = org.telegram.messenger.np.D8;
                                    if ((i22 & (-1537)) != 0) {
                                        if (hzVar.H.isEmpty()) {
                                            a03 = org.telegram.ui.Components.cc.a0(hzVar);
                                            i10 = 2131750760;
                                        } else {
                                            a03 = org.telegram.ui.Components.cc.a0(hzVar);
                                            i10 = 2131750759;
                                        }
                                    } else if (hzVar.G.isEmpty()) {
                                        a03 = org.telegram.ui.Components.cc.a0(hzVar);
                                        i10 = 2131750763;
                                    } else {
                                        a03 = org.telegram.ui.Components.cc.a0(hzVar);
                                        i10 = 2131750761;
                                    }
                                }
                                org.telegram.messenger.k5.o(null, i10, a03, null);
                                break;
                            } else {
                                float f11 = -hzVar.R;
                                hzVar.R = f11;
                                org.telegram.messenger.g0.F3(f11, view, null);
                                p2Var.a();
                                hzVar.w = true;
                                hi.l3 l3Var = hzVar.S;
                                if ((l3Var == null || !l3Var.W) && (hzVar.fragmentView instanceof FrameLayout)) {
                                    hi.l3 l3Var2 = new hi.l3(hzVar.getParentActivity(), 1);
                                    l3Var2.r(true);
                                    l3Var2.d = 2300L;
                                    l3Var2.U = true;
                                    l3Var2.e = true;
                                    l3Var2.n(11.0f, 6.0f, 11.0f, 7.0f);
                                    l3Var2.v0 = -org.telegram.messenger.g0.L(10.0f);
                                    hzVar.S = l3Var2;
                                    l3Var2.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
                                    l3Var2.l(hzVar.getBaseSimpleGlass().c);
                                    l3Var2.u(org.telegram.messenger.hd.M0(2131750775, null));
                                    l3Var2.r0 = new py(l3Var2, z12 ? 1 : 0);
                                    ((FrameLayout) hzVar.fragmentView).addView(l3Var2, c8.ja.e(-1, org.telegram.messenger.ns.g2, 55));
                                    l3Var2.y(hzVar.c, true);
                                    break;
                                }
                            }
                        }
                    }
                }
                break;
            case 11:
                wy wyVar = (wy) this.b;
                ArrayList arrayList6 = wyVar.a2;
                int i24 = i7 - 1;
                if (i24 >= 0 && i24 < arrayList6.size()) {
                    zy zyVar2 = (zy) arrayList6.get(i24);
                    int i25 = zyVar2.a;
                    if (i25 == 7) {
                        wyVar.dismiss();
                        wyVar.s1.presentFragment(new hy(wyVar.U1, zyVar2.m));
                        break;
                    } else if (i25 == 8) {
                        wyVar.d1();
                        break;
                    }
                }
                break;
            case 12:
                zz zzVar = (zz) this.b;
                if (view instanceof org.telegram.ui.Cells.g7) {
                    zzVar.f(i7, view, ((org.telegram.ui.Cells.g7) view).getMessage(), 0);
                    break;
                } else if (view instanceof org.telegram.ui.Cells.j7) {
                    zzVar.f(i7, view, ((org.telegram.ui.Cells.j7) view).getMessage(), 0);
                    break;
                } else if (view instanceof org.telegram.ui.Cells.f7) {
                    zzVar.f(i7, view, ((org.telegram.ui.Cells.f7) view).getMessage(), 0);
                    break;
                } else if (view instanceof org.telegram.ui.Cells.h2) {
                    zzVar.f(i7, view, ((org.telegram.ui.Cells.h2) view).getMessageObject(), 0);
                    break;
                } else if (view instanceof org.telegram.ui.Cells.t2) {
                    zzVar.f(i7, view, ((org.telegram.ui.Cells.t2) view).getMessage(), 0);
                    break;
                }
                break;
            case 13:
                e50 e50Var = (e50) this.b;
                if (e50Var.getParentActivity() != null) {
                    if (i7 == e50Var.n || i7 == 0) {
                        if (e50Var.f != null) {
                            try {
                                ((ClipboardManager) org.telegram.messenger.t0.b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", e50Var.f.link));
                                org.telegram.ui.Components.cc.j(e50Var).j();
                                break;
                            } catch (Exception e10) {
                                org.telegram.messenger.a8.g(e10, true);
                                return;
                            }
                        }
                    } else if (i7 != e50Var.s) {
                        if (i7 == e50Var.r) {
                            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(e50Var.getParentActivity());
                            alertDialog$Builder3.a.U = org.telegram.messenger.hd.M0(2131746026, null);
                            alertDialog$Builder3.a.S = org.telegram.messenger.hd.M0(2131746023, null);
                            alertDialog$Builder3.k(org.telegram.messenger.hd.M0(2131746024, null), new zr(e50Var, 14));
                            alertDialog$Builder3.h(org.telegram.messenger.hd.M0(2131752589, null), null);
                            e50Var.showDialog(alertDialog$Builder3.a);
                            break;
                        }
                    } else if (e50Var.f != null) {
                        try {
                            Intent intent = new Intent("android.intent.action.SEND");
                            intent.setType("text/plain");
                            intent.putExtra("android.intent.extra.TEXT", e50Var.f.link);
                            e50Var.getParentActivity().startActivityForResult(Intent.createChooser(intent, org.telegram.messenger.hd.M0(2131749110, null)), 500);
                            break;
                        } catch (Exception e11) {
                            org.telegram.messenger.a8.g(e11, true);
                            return;
                        }
                    }
                }
                break;
            case 14:
                l50.Z((l50) this.b, view, i7);
                break;
            case 15:
                y50.Z((y50) this.b, view, i7);
                break;
            case 16:
                LanguageSelectActivity.Z((LanguageSelectActivity) this.b, view, i7);
                break;
            case 17:
                ((bg0) this.b).onBackPressed();
                break;
            case 18:
                jg0 jg0Var = (jg0) this.b;
                int i26 = jg0Var.J;
                if (i7 >= i26 && i7 < jg0Var.K) {
                    org.telegram.messenger.gj gjVar = (org.telegram.messenger.gj) jg0Var.y.get(i7 - i26);
                    if (!gjVar.x4()) {
                        long B0 = org.telegram.messenger.gj.B0(gjVar.k);
                        Bundle bundle3 = new Bundle();
                        if (org.telegram.messenger.m5.E(B0)) {
                            bundle3.putLong("user_id", B0);
                        } else {
                            bundle3.putLong("chat_id", -B0);
                        }
                        bundle3.putInt("message_id", gjVar.e1());
                        bundle3.putBoolean("need_remove_previous_same_chat_activity", false);
                        if (jg0Var.getMessagesController().E(bundle3, jg0Var, null, null)) {
                            jg0Var.presentFragment(new an(bundle3));
                            break;
                        }
                    } else if (!jg0Var.g0(gjVar)) {
                        jg0Var.getOrCreateStoryViewer().L(jg0Var.getParentActivity(), gjVar.l, fi.b7.a(jg0Var.f));
                        break;
                    }
                }
                break;
            case 19:
                PasscodeActivity.a0((PasscodeActivity) this.b, view, i7);
                break;
            case 20:
                hm0 hm0Var = (hm0) this.b;
                hm0Var.a(i7, true);
                ul0 ul0Var = hm0Var.h;
                if (ul0Var != null) {
                    ul0Var.a(Integer.valueOf(i7));
                    break;
                }
                break;
            case 21:
                ym0 ym0Var = (ym0) this.b;
                ArrayList arrayList7 = ym0Var.f;
                ArrayList arrayList8 = ym0Var.n;
                org.telegram.messenger.ve veVar = ym0Var.K;
                if (veVar != null || !arrayList7.isEmpty()) {
                    if (veVar != null) {
                        arrayList7 = veVar.e;
                    }
                    if (i7 >= 0 && i7 < arrayList7.size()) {
                        org.telegram.ui.ActionBar.q0 q0Var = ym0Var.Q;
                        if (q0Var != null) {
                            org.telegram.messenger.g0.v1(q0Var.getSearchField());
                        }
                        if (ym0Var.Z) {
                            ym0Var.f0(view, arrayList7.get(i7));
                            break;
                        } else {
                            int i27 = ym0Var.U;
                            if (i27 != 1 && i27 != 3) {
                                if (i27 != 2) {
                                    i12 = 10;
                                    if (i27 != 10) {
                                        i14 = ym0Var.V == null ? 4 : 0;
                                    }
                                }
                                i14 = i12;
                            }
                            PhotoViewer.p1().I2(null, ym0Var, null);
                            PhotoViewer p12 = PhotoViewer.p1();
                            int i28 = ym0Var.I;
                            boolean z18 = ym0Var.J;
                            p12.h = i28;
                            p12.n = z18;
                            PhotoViewer.p1().f2(arrayList7, i7, i14, ym0Var.m0, ym0Var.y0, ym0Var.V);
                            break;
                        }
                    }
                } else if (i7 < arrayList8.size()) {
                    String str = (String) arrayList8.get(i7);
                    zm0 zm0Var = ym0Var.u0;
                    if (zm0Var != null) {
                        switch (zm0Var.a) {
                            case 1:
                                bn0.m0(zm0Var.b, str);
                                break;
                            default:
                                bn0.m0(zm0Var.b, str);
                                break;
                        }
                    } else {
                        ym0Var.Q.getSearchField().setText(str);
                        ym0Var.Q.getSearchField().setSelection(str.length());
                        ym0Var.g0(ym0Var.Q.getSearchField());
                        break;
                    }
                } else if (i7 == arrayList8.size() + 1) {
                    AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(ym0Var.getParentActivity());
                    alertDialog$Builder4.a.S = org.telegram.messenger.hd.M0(2131752056, null);
                    alertDialog$Builder4.a.U = org.telegram.messenger.hd.M0(2131752061, null);
                    alertDialog$Builder4.k(org.telegram.messenger.hd.M0(2131752099, null), new rm0(ym0Var, i13));
                    alertDialog$Builder4.h(org.telegram.messenger.hd.M0(2131752589, null), null);
                    org.telegram.ui.ActionBar.t1 t1Var3 = alertDialog$Builder4.a;
                    ym0Var.showDialog(t1Var3);
                    TextView textView3 = (TextView) t1Var3.d(-1);
                    if (textView3 != null) {
                        org.telegram.ui.ActionBar.q6.U(textView3, org.telegram.ui.ActionBar.j6.q7, null);
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
                nr0 nr0Var = (nr0) this.b;
                boolean[] zArr = nr0Var.x;
                if (i7 == nr0Var.p0) {
                    nr0Var.k0();
                    break;
                } else if (view instanceof org.telegram.ui.Cells.q8) {
                    org.telegram.ui.Cells.q8 q8Var = (org.telegram.ui.Cells.q8) view;
                    boolean z19 = nr0Var.M;
                    org.telegram.ui.Components.rw0 rw0Var = nr0Var.R;
                    if (rw0Var != null) {
                        rw0Var.f();
                    }
                    if (nr0Var.J) {
                        int i29 = -nr0Var.P;
                        nr0Var.P = i29;
                        org.telegram.messenger.g0.F3(i29, q8Var, null);
                        org.telegram.messenger.p2.E.a();
                        break;
                    } else {
                        if (i7 == nr0Var.s0) {
                            z10 = !nr0Var.H;
                            nr0Var.H = z10;
                        } else {
                            int i30 = nr0Var.v0;
                            if (i7 == i30) {
                                z10 = !nr0Var.I;
                                nr0Var.I = z10;
                            } else {
                                if (i7 == nr0Var.w0) {
                                    z11 = !nr0Var.K;
                                    nr0Var.K = z11;
                                    nr0Var.w0();
                                    int i31 = nr0Var.v0;
                                    if (i31 >= 0 && i30 < 0) {
                                        nr0Var.b.i(i31);
                                    } else if (i30 >= 0 && i31 < 0) {
                                        nr0Var.b.s(i30);
                                    }
                                } else if (i7 == nr0Var.t0) {
                                    boolean z20 = nr0Var.L;
                                    z11 = !z20;
                                    nr0Var.L = z11;
                                    if (!z20 && nr0Var.M) {
                                        int i32 = nr0Var.k0;
                                        nr0Var.M = false;
                                        nr0Var.w0();
                                        v4.e1 K = nr0Var.c.K(nr0Var.u0);
                                        if (K != null) {
                                            ((org.telegram.ui.Cells.q8) K.a).setChecked(false);
                                        } else {
                                            nr0Var.b.g(nr0Var.u0);
                                        }
                                        nr0Var.b.p(i32, 2);
                                    }
                                } else if (nr0Var.O == 0) {
                                    z10 = !nr0Var.M;
                                    nr0Var.M = z10;
                                    int i33 = nr0Var.k0;
                                    nr0Var.w0();
                                    if (nr0Var.M) {
                                        nr0Var.b.o(nr0Var.k0, 2);
                                    } else {
                                        nr0Var.b.p(i33, 2);
                                    }
                                    if (nr0Var.M && nr0Var.L) {
                                        nr0Var.L = false;
                                        v4.e1 K2 = nr0Var.c.K(nr0Var.t0);
                                        if (K2 != null) {
                                            ((org.telegram.ui.Cells.q8) K2.a).setChecked(false);
                                        } else {
                                            nr0Var.b.g(nr0Var.t0);
                                        }
                                    }
                                    if (nr0Var.M) {
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
                        if (nr0Var.N && !nr0Var.M) {
                            nr0Var.c.getChildCount();
                            nr0Var.h.a();
                        }
                        for (int i35 = nr0Var.o0; i35 < nr0Var.o0 + nr0Var.E; i35++) {
                            v4.e1 K3 = nr0Var.c.K(i35);
                            if (K3 != null) {
                                View view2 = K3.a;
                                if (view2 instanceof org.telegram.ui.Cells.z5) {
                                    org.telegram.ui.Cells.z5 z5Var = (org.telegram.ui.Cells.z5) view2;
                                    z5Var.n(nr0Var.M, true);
                                    z5Var.r.a(zArr[i35 - nr0Var.o0], z19);
                                    if (z5Var.getTop() > org.telegram.messenger.g0.L(40.0f) && i7 == nr0Var.u0 && !nr0Var.N) {
                                        nr0Var.h.c(z5Var.getCheckBox());
                                        nr0Var.N = true;
                                    }
                                }
                            }
                        }
                        q8Var.setChecked(z10);
                        nr0Var.n0();
                        break;
                    }
                }
                break;
            case 24:
                PremiumPreviewFragment.Z((PremiumPreviewFragment) this.b, view, i7);
                break;
            case 25:
                rs0 rs0Var = (rs0) this.b;
                PremiumPreviewFragment premiumPreviewFragment = rs0Var.n;
                ArrayList arrayList10 = premiumPreviewFragment.d;
                zq0 zq0Var = rs0Var.e;
                if (view.isEnabled() && (view instanceof ug.l1)) {
                    ug.l1 l1Var = (ug.l1) view;
                    premiumPreviewFragment.e = arrayList10.indexOf(l1Var.getTier());
                    premiumPreviewFragment.y0(true);
                    l1Var.c(true, true);
                    for (int i36 = 0; i36 < zq0Var.getChildCount(); i36++) {
                        View childAt = zq0Var.getChildAt(i36);
                        if (childAt instanceof ug.l1) {
                            ug.l1 l1Var2 = (ug.l1) childAt;
                            if (l1Var2.getTier() != l1Var.getTier()) {
                                l1Var2.c(false, true);
                            }
                        }
                    }
                    for (int i37 = 0; i37 < zq0Var.getHiddenChildCount(); i37++) {
                        View V = zq0Var.V(i37);
                        if (V instanceof ug.l1) {
                            ug.l1 l1Var3 = (ug.l1) V;
                            if (l1Var3.getTier() != l1Var.getTier()) {
                                l1Var3.c(false, true);
                            }
                        }
                    }
                    for (int i38 = 0; i38 < zq0Var.getCachedChildCount(); i38++) {
                        View P = zq0Var.P(i38);
                        if (P instanceof ug.l1) {
                            ug.l1 l1Var4 = (ug.l1) P;
                            if (l1Var4.getTier() != l1Var.getTier()) {
                                l1Var4.c(false, true);
                            }
                        }
                    }
                    for (int i39 = 0; i39 < zq0Var.getAttachedScrapChildCount(); i39++) {
                        View O = zq0Var.O(i39);
                        if (O instanceof ug.l1) {
                            ug.l1 l1Var5 = (ug.l1) O;
                            if (l1Var5.getTier() != l1Var.getTier()) {
                                l1Var5.c(false, true);
                            }
                        }
                    }
                    FrameLayout frameLayout = premiumPreviewFragment.K;
                    if (!premiumPreviewFragment.getUserConfig().q() || ((ts0Var = premiumPreviewFragment.f) != null && ts0Var.a.months < ((ts0) arrayList10.get(premiumPreviewFragment.e)).a.months && !premiumPreviewFragment.q0)) {
                        z12 = true;
                    }
                    org.telegram.messenger.g0.W3(frameLayout, z12);
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
