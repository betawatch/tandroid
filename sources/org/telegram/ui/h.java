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

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class h implements org.telegram.ui.Components.cj0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ h(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    private final void a(int i7, View view) {
        ut0 ut0Var = (ut0) this.b;
        int i10 = ut0Var.D;
        if (i7 == ut0Var.x) {
            org.telegram.ui.ActionBar.u1 u1Var = org.telegram.ui.Components.v4.L(ut0Var.getParentActivity(), org.telegram.messenger.id.M0(2131747913, null), org.telegram.messenger.id.M0(2131747914, null), org.telegram.messenger.id.M0(2131751598, null), new st0(ut0Var), null).a;
            u1Var.show();
            u1Var.i();
            return;
        }
        if (i7 != ut0Var.f) {
            if (i7 < ut0Var.r || i7 >= ut0Var.s) {
                return;
            }
            if (i10 != 1) {
                new Bundle();
                throw null;
            }
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", ut0Var.getMessagesController().G0.keyAt(i7 - ut0Var.r));
            ut0Var.presentFragment(new ProfileActivity(bundle, null));
            return;
        }
        if (i10 != 1) {
            Bundle k10 = a8.p0.k("isNeverShare", true);
            if (i10 == 2) {
                k10.putInt("chatAddType", 2);
            }
            y40 y40Var = new y40(k10);
            y40Var.x = new rt0(ut0Var);
            ut0Var.presentFragment(y40Var);
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
        ywVar.D2 = new zt(cuVar);
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
        contactsActivity.U = new zt(cuVar);
        contactsActivity.onFragmentCreate();
        ut0Var.presentFragment(cuVar);
    }

    @Override // org.telegram.ui.Components.cj0
    public final void c(int i7, View view) {
        TLRPC.InputStickerSet tL_inputStickerSetShortName;
        TLRPC.Chat chat;
        String M0;
        String a02;
        rs rsVar;
        az azVar;
        org.telegram.ui.Components.hc a03;
        int i10;
        int i11;
        boolean z9;
        boolean z10;
        ys0 ys0Var;
        int i12 = 3;
        int i13 = 4;
        os osVar = null;
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
                            org.telegram.ui.Components.x70 x70Var = ubVar.b;
                            x70Var.setText(org.telegram.messenger.g0.S2(org.telegram.messenger.id.M0(2131743866, null), org.telegram.ui.ActionBar.l6.uj, 0, new iq0(kVar, i12), null));
                            x70Var.setSingleLine(false);
                            x70Var.setPadding(0, org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f));
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
                    org.telegram.ui.Components.zv0 zv0Var = new org.telegram.ui.Components.zv0(oVar.getParentActivity(), oVar, inputStickerSet, null, null, null);
                    zv0Var.T1 = new m(oVar, view, stickerSetCovered);
                    oVar.showDialog(zv0Var);
                    break;
                }
                break;
            case 2:
                az0.Z((az0) this.b, i7);
                break;
            case 3:
                pc pcVar = (pc) this.b;
                ArrayList arrayList2 = pcVar.c;
                f61 f61Var = pcVar.d;
                if (i7 >= 0 && i7 < arrayList2.size()) {
                    org.telegram.ui.Components.uo uoVar = (org.telegram.ui.Components.uo) arrayList2.get(i7);
                    pcVar.a(uoVar.a(), true);
                    if (view.getLeft() < org.telegram.messenger.g0.L(24.0f) + f61Var.getPaddingLeft()) {
                        f61Var.w0(-((org.telegram.messenger.g0.L(48.0f) + f61Var.getPaddingLeft()) - view.getLeft()), 0, null);
                    } else if (view.getWidth() + view.getLeft() > (f61Var.getMeasuredWidth() - f61Var.getPaddingRight()) - org.telegram.messenger.g0.L(24.0f)) {
                        f61Var.w0(org.telegram.messenger.k5.B(48.0f, f61Var.getMeasuredWidth() - f61Var.getPaddingRight(), view.getWidth() + view.getLeft()), 0, null);
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
                            f50 f50Var = new f50(bundle2);
                            f50Var.Y = new mo(uoVar2);
                            uoVar2.presentFragment(f50Var);
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
                                org.telegram.ui.ActionBar.s6.U(textView, org.telegram.ui.ActionBar.l6.q7, null);
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
                is isVar = (is) this.b;
                TLRPC.StickerSetCovered stickerSetCovered2 = ((ls) view).d;
                ms msVar = isVar.a;
                ch.b0 reactionsWindow = msVar.P.getReactionsWindow();
                if (reactionsWindow != null && !reactionsWindow.q) {
                    reactionsWindow.d();
                }
                if (stickerSetCovered2 instanceof TLRPC.TL_stickerSetNoCovered) {
                    org.telegram.ui.Components.ew0.c(null, msVar.c0, msVar.z.getContext(), new a5(isVar, 9));
                    break;
                } else {
                    ks ksVar = msVar.l;
                    if (ksVar != null) {
                        ksVar.w(stickerSetCovered2.set, TextUtils.join("", msVar.o));
                    }
                    msVar.o();
                    break;
                }
                break;
            case 7:
                ss ssVar = (ss) this.b;
                if (ssVar.f && ssVar.e) {
                    org.telegram.ui.Components.oj ojVar = ssVar.d;
                    ArrayList arrayList4 = ojVar.e;
                    if (arrayList4 != null && i7 >= 0 && i7 < arrayList4.size()) {
                        osVar = (os) ojVar.e.get(i7);
                    }
                } else {
                    int S = ssVar.c.S(i7);
                    int Q = ssVar.c.Q(i7);
                    if (Q >= 0 && S >= 0) {
                        osVar = ssVar.c.O(S, Q);
                    }
                }
                if (i7 >= 0) {
                    ssVar.finishFragment();
                    if (osVar != null && (rsVar = ssVar.r) != null) {
                        rsVar.b(osVar);
                        break;
                    }
                }
                break;
            case 8:
                jt jtVar = (jt) this.b;
                ArrayList arrayList5 = jtVar.j3;
                mt mtVar = jtVar.v3;
                if (!(view instanceof ct) || i7 < 0 || i7 >= arrayList5.size()) {
                    if (view instanceof org.telegram.ui.Cells.m8) {
                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(mtVar.getParentActivity());
                        alertDialog$Builder2.a.R = org.telegram.messenger.id.M0(2131746089, null);
                        alertDialog$Builder2.a.T = org.telegram.messenger.id.M0(2131746090, null);
                        alertDialog$Builder2.k(org.telegram.messenger.id.M0(2131746118, null), new ft(jtVar));
                        alertDialog$Builder2.h(org.telegram.messenger.id.M0(2131752589, null), null);
                        org.telegram.ui.ActionBar.u1 u1Var2 = alertDialog$Builder2.a;
                        mtVar.showDialog(u1Var2);
                        TextView textView2 = (TextView) u1Var2.d(-1);
                        if (textView2 != null) {
                            org.telegram.ui.ActionBar.s6.U(textView2, org.telegram.ui.ActionBar.l6.q7, null);
                            break;
                        }
                    }
                } else {
                    et etVar = (et) arrayList5.get(i7);
                    if (etVar != null) {
                        int i18 = etVar.h;
                        if (i18 >= 0) {
                            jtVar.p3[i18] = !r3[i18];
                            jtVar.D1(true);
                            break;
                        } else if (i18 == -2) {
                            mtVar.presentFragment(new DataAutoDownloadActivity(jtVar.f3 - 1));
                            break;
                        }
                    }
                }
                break;
            case 9:
                iy.a0((iy) this.b, view, i7);
                break;
            case 10:
                iz izVar = (iz) this.b;
                if (izVar.getParentActivity() != null && (azVar = (az) izVar.P.get(i7)) != null) {
                    View.OnClickListener onClickListener = azVar.c;
                    if (onClickListener != null) {
                        onClickListener.onClick(view);
                        break;
                    } else {
                        int i19 = azVar.a;
                        if (i19 == 1) {
                            org.telegram.ui.Cells.pa paVar = (org.telegram.ui.Cells.pa) view;
                            izVar.B0(azVar, paVar.getName(), paVar.getCurrentObject(), azVar.g);
                            break;
                        } else if (i19 == 7) {
                            org.telegram.ui.Components.m51 m51Var = new org.telegram.ui.Components.m51(21, izVar, azVar);
                            if (izVar.c.x.f) {
                                izVar.y0(m51Var, false);
                                break;
                            } else {
                                m51Var.run();
                                break;
                            }
                        } else if (i19 == 8 || (i19 == 4 && azVar.k == R.drawable.msg2_link2)) {
                            org.telegram.messenger.vo voVar = izVar.r;
                            org.telegram.messenger.p2 p2Var = org.telegram.messenger.p2.D;
                            if (!izVar.s || !izVar.c.x.f) {
                                if (!TextUtils.isEmpty(izVar.x) || !TextUtils.isEmpty(voVar.b)) {
                                    int i20 = izVar.D;
                                    int i21 = org.telegram.messenger.qp.C8;
                                    if ((i20 & (-1537)) == 0 && izVar.G.isEmpty() && !izVar.F.isEmpty()) {
                                        izVar.y0(new ny(izVar, 1), false);
                                        break;
                                    }
                                }
                                float f10 = -izVar.Q;
                                izVar.Q = f10;
                                org.telegram.messenger.g0.G3(f10, view, null);
                                p2Var.a();
                                if (TextUtils.isEmpty(izVar.x) && TextUtils.isEmpty(voVar.b)) {
                                    a03 = org.telegram.ui.Components.hc.a0(izVar);
                                    i10 = 2131750762;
                                } else {
                                    int i22 = izVar.D;
                                    int i23 = org.telegram.messenger.qp.C8;
                                    if ((i22 & (-1537)) != 0) {
                                        if (izVar.G.isEmpty()) {
                                            a03 = org.telegram.ui.Components.hc.a0(izVar);
                                            i10 = 2131750760;
                                        } else {
                                            a03 = org.telegram.ui.Components.hc.a0(izVar);
                                            i10 = 2131750759;
                                        }
                                    } else if (izVar.F.isEmpty()) {
                                        a03 = org.telegram.ui.Components.hc.a0(izVar);
                                        i10 = 2131750763;
                                    } else {
                                        a03 = org.telegram.ui.Components.hc.a0(izVar);
                                        i10 = 2131750761;
                                    }
                                }
                                org.telegram.messenger.k5.p(null, i10, a03, null);
                                break;
                            } else {
                                float f11 = -izVar.Q;
                                izVar.Q = f11;
                                org.telegram.messenger.g0.G3(f11, view, null);
                                p2Var.a();
                                izVar.w = true;
                                fi.m3 m3Var = izVar.R;
                                if ((m3Var == null || !m3Var.V) && (izVar.fragmentView instanceof FrameLayout)) {
                                    fi.m3 m3Var2 = new fi.m3(izVar.getParentActivity(), 1);
                                    m3Var2.r(true);
                                    m3Var2.d = 2300L;
                                    m3Var2.T = true;
                                    m3Var2.e = true;
                                    m3Var2.n(11.0f, 6.0f, 11.0f, 7.0f);
                                    m3Var2.u0 = -org.telegram.messenger.g0.L(10.0f);
                                    izVar.R = m3Var2;
                                    m3Var2.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
                                    m3Var2.l(izVar.getBaseSimpleGlass().c);
                                    m3Var2.u(org.telegram.messenger.id.M0(2131750775, null));
                                    m3Var2.q0 = new qy(m3Var2, z11 ? 1 : 0);
                                    ((FrameLayout) izVar.fragmentView).addView(m3Var2, c8.ha.e(-1, org.telegram.messenger.qs.g2, 55));
                                    m3Var2.y(izVar.c, true);
                                    break;
                                }
                            }
                        }
                    }
                }
                break;
            case 11:
                xy xyVar = (xy) this.b;
                ArrayList arrayList6 = xyVar.W1;
                int i24 = i7 - 1;
                if (i24 >= 0 && i24 < arrayList6.size()) {
                    az azVar2 = (az) arrayList6.get(i24);
                    int i25 = azVar2.a;
                    if (i25 == 7) {
                        xyVar.dismiss();
                        xyVar.o1.presentFragment(new iy(xyVar.Q1, azVar2.m));
                        break;
                    } else if (i25 == 8) {
                        xyVar.d1();
                        break;
                    }
                }
                break;
            case 12:
                a00 a00Var = (a00) this.b;
                if (view instanceof org.telegram.ui.Cells.h7) {
                    a00Var.f(i7, view, ((org.telegram.ui.Cells.h7) view).getMessage(), 0);
                    break;
                } else if (view instanceof org.telegram.ui.Cells.k7) {
                    a00Var.f(i7, view, ((org.telegram.ui.Cells.k7) view).getMessage(), 0);
                    break;
                } else if (view instanceof org.telegram.ui.Cells.g7) {
                    a00Var.f(i7, view, ((org.telegram.ui.Cells.g7) view).getMessage(), 0);
                    break;
                } else if (view instanceof org.telegram.ui.Cells.h2) {
                    a00Var.f(i7, view, ((org.telegram.ui.Cells.h2) view).getMessageObject(), 0);
                    break;
                } else if (view instanceof org.telegram.ui.Cells.t2) {
                    a00Var.f(i7, view, ((org.telegram.ui.Cells.t2) view).getMessage(), 0);
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
                                org.telegram.ui.Components.hc.j(h50Var).j();
                                break;
                            } catch (Exception e10) {
                                org.telegram.messenger.a8.g(e10, true);
                                return;
                            }
                        }
                    } else if (i7 != h50Var.s) {
                        if (i7 == h50Var.r) {
                            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(h50Var.getParentActivity());
                            alertDialog$Builder3.a.T = org.telegram.messenger.id.M0(2131746026, null);
                            alertDialog$Builder3.a.R = org.telegram.messenger.id.M0(2131746023, null);
                            alertDialog$Builder3.k(org.telegram.messenger.id.M0(2131746024, null), new yr(h50Var, 14));
                            alertDialog$Builder3.h(org.telegram.messenger.id.M0(2131752589, null), null);
                            h50Var.showDialog(alertDialog$Builder3.a);
                            break;
                        }
                    } else if (h50Var.f != null) {
                        try {
                            Intent intent = new Intent("android.intent.action.SEND");
                            intent.setType("text/plain");
                            intent.putExtra("android.intent.extra.TEXT", h50Var.f.link);
                            h50Var.getParentActivity().startActivityForResult(Intent.createChooser(intent, org.telegram.messenger.id.M0(2131749110, null)), 500);
                            break;
                        } catch (Exception e11) {
                            org.telegram.messenger.a8.g(e11, true);
                            return;
                        }
                    }
                }
                break;
            case 14:
                o50.Z((o50) this.b, view, i7);
                break;
            case 15:
                b60.Z((b60) this.b, view, i7);
                break;
            case 16:
                LanguageSelectActivity.Z((LanguageSelectActivity) this.b, view, i7);
                break;
            case 17:
                ((dg0) this.b).onBackPressed();
                break;
            case 18:
                lg0 lg0Var = (lg0) this.b;
                int i26 = lg0Var.I;
                if (i7 >= i26 && i7 < lg0Var.J) {
                    org.telegram.messenger.ij ijVar = (org.telegram.messenger.ij) lg0Var.y.get(i7 - i26);
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
                        if (lg0Var.getMessagesController().E(bundle3, lg0Var, null, null)) {
                            lg0Var.presentFragment(new cn(bundle3));
                            break;
                        }
                    } else if (!lg0Var.g0(ijVar)) {
                        lg0Var.getOrCreateStoryViewer().L(lg0Var.getParentActivity(), ijVar.l, di.i7.a(lg0Var.f));
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
                zm0 zm0Var = (zm0) this.b;
                ArrayList arrayList7 = zm0Var.f;
                ArrayList arrayList8 = zm0Var.n;
                org.telegram.messenger.we weVar = zm0Var.J;
                if (weVar != null || !arrayList7.isEmpty()) {
                    if (weVar != null) {
                        arrayList7 = weVar.e;
                    }
                    if (i7 >= 0 && i7 < arrayList7.size()) {
                        org.telegram.ui.ActionBar.r0 r0Var = zm0Var.P;
                        if (r0Var != null) {
                            org.telegram.messenger.g0.v1(r0Var.getSearchField());
                        }
                        if (zm0Var.Y) {
                            zm0Var.f0(view, arrayList7.get(i7));
                            break;
                        } else {
                            int i27 = zm0Var.T;
                            if (i27 != 1 && i27 != 3) {
                                if (i27 != 2) {
                                    i12 = 10;
                                    if (i27 != 10) {
                                        i14 = zm0Var.U == null ? 4 : 0;
                                    }
                                }
                                i14 = i12;
                            }
                            PhotoViewer.p1().H2(null, zm0Var, null);
                            PhotoViewer p12 = PhotoViewer.p1();
                            int i28 = zm0Var.H;
                            boolean z17 = zm0Var.I;
                            p12.h = i28;
                            p12.n = z17;
                            PhotoViewer.p1().e2(arrayList7, i7, i14, zm0Var.l0, zm0Var.x0, zm0Var.U);
                            break;
                        }
                    }
                } else if (i7 < arrayList8.size()) {
                    String str = (String) arrayList8.get(i7);
                    an0 an0Var = zm0Var.t0;
                    if (an0Var != null) {
                        switch (an0Var.a) {
                            case 1:
                                cn0.m0(an0Var.b, str);
                                break;
                            default:
                                cn0.m0(an0Var.b, str);
                                break;
                        }
                    } else {
                        zm0Var.P.getSearchField().setText(str);
                        zm0Var.P.getSearchField().setSelection(str.length());
                        zm0Var.g0(zm0Var.P.getSearchField());
                        break;
                    }
                } else if (i7 == arrayList8.size() + 1) {
                    AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(zm0Var.getParentActivity());
                    alertDialog$Builder4.a.R = org.telegram.messenger.id.M0(2131752056, null);
                    alertDialog$Builder4.a.T = org.telegram.messenger.id.M0(2131752061, null);
                    alertDialog$Builder4.k(org.telegram.messenger.id.M0(2131752099, null), new sm0(zm0Var, i13));
                    alertDialog$Builder4.h(org.telegram.messenger.id.M0(2131752589, null), null);
                    org.telegram.ui.ActionBar.u1 u1Var3 = alertDialog$Builder4.a;
                    zm0Var.showDialog(u1Var3);
                    TextView textView3 = (TextView) u1Var3.d(-1);
                    if (textView3 != null) {
                        org.telegram.ui.ActionBar.s6.U(textView3, org.telegram.ui.ActionBar.l6.q7, null);
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
                rr0 rr0Var = (rr0) this.b;
                boolean[] zArr = rr0Var.x;
                if (i7 == rr0Var.o0) {
                    rr0Var.k0();
                    break;
                } else if (view instanceof org.telegram.ui.Cells.r8) {
                    org.telegram.ui.Cells.r8 r8Var = (org.telegram.ui.Cells.r8) view;
                    boolean z18 = rr0Var.L;
                    org.telegram.ui.Components.pw0 pw0Var = rr0Var.Q;
                    if (pw0Var != null) {
                        pw0Var.f();
                    }
                    if (rr0Var.I) {
                        int i29 = -rr0Var.O;
                        rr0Var.O = i29;
                        org.telegram.messenger.g0.G3(i29, r8Var, null);
                        org.telegram.messenger.p2.D.a();
                        break;
                    } else {
                        if (i7 == rr0Var.r0) {
                            z9 = !rr0Var.G;
                            rr0Var.G = z9;
                        } else {
                            int i30 = rr0Var.u0;
                            if (i7 == i30) {
                                z9 = !rr0Var.H;
                                rr0Var.H = z9;
                            } else {
                                if (i7 == rr0Var.v0) {
                                    z10 = !rr0Var.J;
                                    rr0Var.J = z10;
                                    rr0Var.w0();
                                    int i31 = rr0Var.u0;
                                    if (i31 >= 0 && i30 < 0) {
                                        rr0Var.b.i(i31);
                                    } else if (i30 >= 0 && i31 < 0) {
                                        rr0Var.b.s(i30);
                                    }
                                } else if (i7 == rr0Var.s0) {
                                    boolean z19 = rr0Var.K;
                                    z10 = !z19;
                                    rr0Var.K = z10;
                                    if (!z19 && rr0Var.L) {
                                        int i32 = rr0Var.j0;
                                        rr0Var.L = false;
                                        rr0Var.w0();
                                        v4.d1 K = rr0Var.c.K(rr0Var.t0);
                                        if (K != null) {
                                            ((org.telegram.ui.Cells.r8) K.a).setChecked(false);
                                        } else {
                                            rr0Var.b.g(rr0Var.t0);
                                        }
                                        rr0Var.b.p(i32, 2);
                                    }
                                } else if (rr0Var.N == 0) {
                                    z9 = !rr0Var.L;
                                    rr0Var.L = z9;
                                    int i33 = rr0Var.j0;
                                    rr0Var.w0();
                                    if (rr0Var.L) {
                                        rr0Var.b.o(rr0Var.j0, 2);
                                    } else {
                                        rr0Var.b.p(i33, 2);
                                    }
                                    if (rr0Var.L && rr0Var.K) {
                                        rr0Var.K = false;
                                        v4.d1 K2 = rr0Var.c.K(rr0Var.s0);
                                        if (K2 != null) {
                                            ((org.telegram.ui.Cells.r8) K2.a).setChecked(false);
                                        } else {
                                            rr0Var.b.g(rr0Var.s0);
                                        }
                                    }
                                    if (rr0Var.L) {
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
                        if (rr0Var.M && !rr0Var.L) {
                            rr0Var.c.getChildCount();
                            rr0Var.h.a();
                        }
                        for (int i35 = rr0Var.n0; i35 < rr0Var.n0 + rr0Var.D; i35++) {
                            v4.d1 K3 = rr0Var.c.K(i35);
                            if (K3 != null) {
                                View view2 = K3.a;
                                if (view2 instanceof org.telegram.ui.Cells.a6) {
                                    org.telegram.ui.Cells.a6 a6Var = (org.telegram.ui.Cells.a6) view2;
                                    a6Var.m(rr0Var.L, true);
                                    a6Var.r.a(zArr[i35 - rr0Var.n0], z18);
                                    if (a6Var.getTop() > org.telegram.messenger.g0.L(40.0f) && i7 == rr0Var.t0 && !rr0Var.M) {
                                        rr0Var.h.c(a6Var.getCheckBox());
                                        rr0Var.M = true;
                                    }
                                }
                            }
                        }
                        r8Var.setChecked(z9);
                        rr0Var.n0();
                        break;
                    }
                }
                break;
            case 24:
                PremiumPreviewFragment.Z((PremiumPreviewFragment) this.b, view, i7);
                break;
            case 25:
                ws0 ws0Var = (ws0) this.b;
                PremiumPreviewFragment premiumPreviewFragment = ws0Var.n;
                ArrayList arrayList10 = premiumPreviewFragment.d;
                dr0 dr0Var = ws0Var.e;
                if (view.isEnabled() && (view instanceof ug.k1)) {
                    ug.k1 k1Var = (ug.k1) view;
                    premiumPreviewFragment.e = arrayList10.indexOf(k1Var.getTier());
                    premiumPreviewFragment.y0(true);
                    k1Var.c(true, true);
                    for (int i36 = 0; i36 < dr0Var.getChildCount(); i36++) {
                        View childAt = dr0Var.getChildAt(i36);
                        if (childAt instanceof ug.k1) {
                            ug.k1 k1Var2 = (ug.k1) childAt;
                            if (k1Var2.getTier() != k1Var.getTier()) {
                                k1Var2.c(false, true);
                            }
                        }
                    }
                    for (int i37 = 0; i37 < dr0Var.getHiddenChildCount(); i37++) {
                        View V = dr0Var.V(i37);
                        if (V instanceof ug.k1) {
                            ug.k1 k1Var3 = (ug.k1) V;
                            if (k1Var3.getTier() != k1Var.getTier()) {
                                k1Var3.c(false, true);
                            }
                        }
                    }
                    for (int i38 = 0; i38 < dr0Var.getCachedChildCount(); i38++) {
                        View P = dr0Var.P(i38);
                        if (P instanceof ug.k1) {
                            ug.k1 k1Var4 = (ug.k1) P;
                            if (k1Var4.getTier() != k1Var.getTier()) {
                                k1Var4.c(false, true);
                            }
                        }
                    }
                    for (int i39 = 0; i39 < dr0Var.getAttachedScrapChildCount(); i39++) {
                        View O = dr0Var.O(i39);
                        if (O instanceof ug.k1) {
                            ug.k1 k1Var5 = (ug.k1) O;
                            if (k1Var5.getTier() != k1Var.getTier()) {
                                k1Var5.c(false, true);
                            }
                        }
                    }
                    FrameLayout frameLayout = premiumPreviewFragment.J;
                    if (!premiumPreviewFragment.getUserConfig().q() || ((ys0Var = premiumPreviewFragment.f) != null && ys0Var.a.months < ((ys0) arrayList10.get(premiumPreviewFragment.e)).a.months && !premiumPreviewFragment.p0)) {
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
