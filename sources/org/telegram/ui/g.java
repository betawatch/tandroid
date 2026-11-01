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

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class g implements org.telegram.ui.Components.hk0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ g(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    private final void a(int i10, View view) {
        zu0 zu0Var = (zu0) this.b;
        int i11 = zu0Var.D;
        if (i10 == zu0Var.x) {
            org.telegram.ui.ActionBar.x1 x1Var = org.telegram.ui.Components.s4.N(zu0Var.getParentActivity(), org.telegram.messenger.dd.L0(2131747929, null), org.telegram.messenger.dd.L0(2131747930, null), org.telegram.messenger.dd.L0(2131751599, null), new xu0(zu0Var), null).a;
            x1Var.show();
            x1Var.i();
            return;
        }
        if (i10 != zu0Var.f) {
            if (i10 < zu0Var.r || i10 >= zu0Var.s) {
                return;
            }
            if (i11 != 1) {
                new Bundle();
                throw null;
            }
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", zu0Var.getMessagesController().G0.keyAt(i10 - zu0Var.r));
            zu0Var.presentFragment(new ProfileActivity(bundle, null));
            return;
        }
        if (i11 != 1) {
            Bundle g10 = a1.g.g("isNeverShare", true);
            if (i11 == 2) {
                g10.putInt("chatAddType", 2);
            }
            u50 u50Var = new u50(g10);
            u50Var.x = new wu0(zu0Var);
            zu0Var.presentFragment(u50Var);
            return;
        }
        cv cvVar = new cv(null);
        cvVar.d = new Paint();
        cvVar.f = new bv[2];
        cvVar.x = true;
        Bundle bundle2 = new Bundle();
        bundle2.putBoolean("onlySelect", true);
        bundle2.putBoolean("checkCanWrite", false);
        bundle2.putBoolean("resetDelegate", false);
        bundle2.putInt("dialogsType", 9);
        zx zxVar = new zx(bundle2);
        cvVar.a = zxVar;
        zxVar.C2 = new zu(cvVar);
        zxVar.onFragmentCreate();
        Bundle bundle3 = new Bundle();
        bundle3.putBoolean("onlyUsers", true);
        bundle3.putBoolean("destroyAfterSelect", true);
        bundle3.putBoolean("returnAsResult", true);
        bundle3.putBoolean("disableSections", true);
        bundle3.putBoolean("needFinishFragment", false);
        bundle3.putBoolean("resetDelegate", false);
        bundle3.putBoolean("allowSelf", false);
        ContactsActivity contactsActivity = new ContactsActivity(bundle3);
        cvVar.b = contactsActivity;
        contactsActivity.U = new zu(cvVar);
        contactsActivity.onFragmentCreate();
        zu0Var.presentFragment(cvVar);
    }

    @Override // org.telegram.ui.Components.hk0
    public final void f(int i10, View view) {
        TLRPC.InputStickerSet tL_inputStickerSetShortName;
        TLRPC.Chat chat;
        String L0;
        String a02;
        pt ptVar;
        zz zzVar;
        org.telegram.ui.Components.cc a03;
        int i11;
        int i12;
        boolean z10;
        eu0 eu0Var;
        int i13 = 3;
        int i14 = 4;
        mt mtVar = null;
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
                            p80Var.setText(org.telegram.messenger.i0.R2(org.telegram.messenger.dd.L0(2131743891, null), org.telegram.ui.ActionBar.t6.uj, 0, new qr0(jVar, i13), null));
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
                    org.telegram.ui.Components.dx0 dx0Var = new org.telegram.ui.Components.dx0(nVar.getParentActivity(), nVar, inputStickerSet, null, null, null);
                    dx0Var.T1 = new l(nVar, view, stickerSetCovered);
                    nVar.showDialog(dx0Var);
                    break;
                }
                break;
            case 2:
                l01.Z((l01) this.b, i10);
                break;
            case 3:
                xc xcVar = (xc) this.b;
                ArrayList arrayList2 = xcVar.c;
                u71 u71Var = xcVar.d;
                if (i10 >= 0 && i10 < arrayList2.size()) {
                    org.telegram.ui.Components.cp cpVar = (org.telegram.ui.Components.cp) arrayList2.get(i10);
                    xcVar.a(cpVar.a(), true);
                    if (view.getLeft() < org.telegram.messenger.i0.L(24.0f) + u71Var.getPaddingLeft()) {
                        u71Var.w0(-((org.telegram.messenger.i0.L(48.0f) + u71Var.getPaddingLeft()) - view.getLeft()), 0, null);
                    } else if (view.getWidth() + view.getLeft() > (u71Var.getMeasuredWidth() - u71Var.getPaddingRight()) - org.telegram.messenger.i0.L(24.0f)) {
                        u71Var.w0(org.telegram.messenger.m5.B(48.0f, u71Var.getMeasuredWidth() - u71Var.getPaddingRight(), view.getWidth() + view.getLeft()), 0, null);
                    }
                    org.telegram.messenger.r20 r20Var = xcVar.r;
                    if (r20Var != null) {
                        r20Var.a(cpVar.a());
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
                            qpVar.f0(chat, true);
                            break;
                        }
                    } else if (i10 == qpVar.F) {
                        if (z15 && qpVar.h.linked_chat_id == 0) {
                            Bundle bundle2 = new Bundle();
                            bundle2.putLongArray("result", new long[]{qpVar.getUserConfig().e()});
                            bundle2.putInt("chatType", 4);
                            TLRPC.Chat chat2 = qpVar.f;
                            if (chat2 != null) {
                                bundle2.putString("title", org.telegram.messenger.dd.a0("GroupCreateDiscussionDefaultName", null, 2131749463, chat2.title));
                            }
                            b60 b60Var = new b60(bundle2);
                            b60Var.Y = new hp(qpVar);
                            qpVar.presentFragment(b60Var);
                            break;
                        } else if (!qpVar.w.isEmpty()) {
                            TLRPC.Chat chat3 = (TLRPC.Chat) qpVar.w.get(0);
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(qpVar.getParentActivity());
                            if (z15) {
                                L0 = org.telegram.messenger.dd.L0(2131751372, null);
                                a02 = org.telegram.messenger.dd.a0("DiscussionUnlinkChannelAlert", null, 2131751373, chat3.title);
                            } else {
                                L0 = org.telegram.messenger.dd.L0(2131751374, null);
                                a02 = org.telegram.messenger.dd.a0("DiscussionUnlinkGroupAlert", null, 2131751371, chat3.title);
                            }
                            alertDialog$Builder.a.R = L0;
                            alertDialog$Builder.a.T = org.telegram.messenger.i0.W2(a02);
                            alertDialog$Builder.k(org.telegram.messenger.dd.L0(2131751375, null), new y0(qpVar, 24));
                            alertDialog$Builder.h(org.telegram.messenger.dd.L0(2131752589, null), null);
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
                            xpVar.a0(2, true);
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
                ft ftVar = (ft) this.b;
                TLRPC.StickerSetCovered stickerSetCovered2 = ((jt) view).d;
                kt ktVar = ftVar.a;
                sg.b0 reactionsWindow = ktVar.P.getReactionsWindow();
                if (reactionsWindow != null && !reactionsWindow.q) {
                    reactionsWindow.d();
                }
                if (stickerSetCovered2 instanceof TLRPC.TL_stickerSetNoCovered) {
                    org.telegram.ui.Components.ix0.c(null, ktVar.c0, ktVar.z.getContext(), new z4(ftVar, 9));
                    break;
                } else {
                    ht htVar = ktVar.l;
                    if (htVar != null) {
                        htVar.u(stickerSetCovered2.set, TextUtils.join("", ktVar.o));
                    }
                    ktVar.o();
                    break;
                }
                break;
            case 7:
                qt qtVar = (qt) this.b;
                if (qtVar.f && qtVar.e) {
                    org.telegram.ui.Components.pj pjVar = qtVar.d;
                    ArrayList arrayList4 = pjVar.e;
                    if (arrayList4 != null && i10 >= 0 && i10 < arrayList4.size()) {
                        mtVar = (mt) pjVar.e.get(i10);
                    }
                } else {
                    int S = qtVar.c.S(i10);
                    int Q = qtVar.c.Q(i10);
                    if (Q >= 0 && S >= 0) {
                        mtVar = qtVar.c.O(S, Q);
                    }
                }
                if (i10 >= 0) {
                    qtVar.finishFragment();
                    if (mtVar != null && (ptVar = qtVar.r) != null) {
                        ptVar.c(mtVar);
                        break;
                    }
                }
                break;
            case 8:
                iu iuVar = (iu) this.b;
                ArrayList arrayList5 = iuVar.j3;
                lu luVar = iuVar.v3;
                if (!(view instanceof cu) || i10 < 0 || i10 >= arrayList5.size()) {
                    if (view instanceof org.telegram.ui.Cells.p8) {
                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(luVar.getParentActivity());
                        alertDialog$Builder2.a.R = org.telegram.messenger.dd.L0(2131746106, null);
                        alertDialog$Builder2.a.T = org.telegram.messenger.dd.L0(2131746107, null);
                        alertDialog$Builder2.k(org.telegram.messenger.dd.L0(2131746135, null), new fu(iuVar));
                        alertDialog$Builder2.h(org.telegram.messenger.dd.L0(2131752589, null), null);
                        org.telegram.ui.ActionBar.x1 x1Var2 = alertDialog$Builder2.a;
                        luVar.showDialog(x1Var2);
                        TextView textView2 = (TextView) x1Var2.d(-1);
                        if (textView2 != null) {
                            org.telegram.ui.ActionBar.a7.V(textView2, org.telegram.ui.ActionBar.t6.q7, null);
                            break;
                        }
                    }
                } else {
                    eu euVar = (eu) arrayList5.get(i10);
                    if (euVar != null) {
                        int i19 = euVar.h;
                        if (i19 >= 0) {
                            iuVar.p3[i19] = !r3[i19];
                            iuVar.D1(true);
                            break;
                        } else if (i19 == -2) {
                            luVar.presentFragment(new DataAutoDownloadActivity(iuVar.f3 - 1));
                            break;
                        }
                    }
                }
                break;
            case 9:
                hz.a0((hz) this.b, view, i10);
                break;
            case 10:
                h00 h00Var = (h00) this.b;
                if (h00Var.getParentActivity() != null && (zzVar = (zz) h00Var.P.get(i10)) != null) {
                    View.OnClickListener onClickListener = zzVar.c;
                    if (onClickListener != null) {
                        onClickListener.onClick(view);
                        break;
                    } else {
                        int i20 = zzVar.a;
                        boolean z17 = true;
                        if (i20 == 1) {
                            org.telegram.ui.Cells.pa paVar = (org.telegram.ui.Cells.pa) view;
                            h00Var.B0(zzVar, paVar.getName(), paVar.getCurrentObject(), zzVar.g);
                            break;
                        } else if (i20 == 7) {
                            org.telegram.ui.Components.voip.u uVar = new org.telegram.ui.Components.voip.u(15, h00Var, zzVar);
                            if (h00Var.c.x.f) {
                                h00Var.y0(uVar, false);
                                break;
                            } else {
                                uVar.run();
                                break;
                            }
                        } else if (i20 == 8 || (i20 == 4 && zzVar.k == R.drawable.msg2_link2)) {
                            org.telegram.messenger.bp bpVar = h00Var.r;
                            org.telegram.messenger.t2 t2Var = org.telegram.messenger.t2.D;
                            org.telegram.ui.ActionBar.p6 p6Var = null;
                            if (!h00Var.s || !h00Var.c.x.f) {
                                if (!TextUtils.isEmpty(h00Var.x) || !TextUtils.isEmpty(bpVar.b)) {
                                    int i21 = h00Var.D;
                                    int i22 = org.telegram.messenger.wp.D8;
                                    if ((i21 & (-1537)) == 0 && h00Var.G.isEmpty() && !h00Var.F.isEmpty()) {
                                        h00Var.y0(new lz(h00Var, 1), false);
                                        break;
                                    }
                                }
                                float f7 = -h00Var.Q;
                                h00Var.Q = f7;
                                org.telegram.messenger.i0.F3(f7, view, null);
                                t2Var.a();
                                if (TextUtils.isEmpty(h00Var.x) && TextUtils.isEmpty(bpVar.b)) {
                                    a03 = org.telegram.ui.Components.cc.a0(h00Var);
                                    i11 = 2131750763;
                                } else {
                                    int i23 = h00Var.D;
                                    int i24 = org.telegram.messenger.wp.D8;
                                    if ((i23 & (-1537)) != 0) {
                                        if (h00Var.G.isEmpty()) {
                                            a03 = org.telegram.ui.Components.cc.a0(h00Var);
                                            i11 = 2131750761;
                                        } else {
                                            a03 = org.telegram.ui.Components.cc.a0(h00Var);
                                            i11 = 2131750760;
                                        }
                                    } else if (h00Var.F.isEmpty()) {
                                        a03 = org.telegram.ui.Components.cc.a0(h00Var);
                                        i11 = 2131750764;
                                    } else {
                                        a03 = org.telegram.ui.Components.cc.a0(h00Var);
                                        i11 = 2131750762;
                                    }
                                }
                                org.telegram.messenger.m5.o(null, i11, a03, null);
                                break;
                            } else {
                                float f10 = -h00Var.Q;
                                h00Var.Q = f10;
                                org.telegram.messenger.i0.F3(f10, view, null);
                                t2Var.a();
                                h00Var.w = true;
                                ij ijVar = h00Var.R;
                                if (ijVar == null || ijVar.getVisibility() != 0) {
                                    ij ijVar2 = new ij(6, 2, h00Var.getParentActivity(), p6Var, z17);
                                    h00Var.R = ijVar2;
                                    ijVar2.a.setMaxWidth(org.telegram.messenger.i0.q.x);
                                    h00Var.R.setExtraTranslationY(org.telegram.messenger.i0.L(-16.0f));
                                    h00Var.R.setText(org.telegram.messenger.dd.L0(2131750776, null));
                                    ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
                                    marginLayoutParams.rightMargin = org.telegram.messenger.i0.L(3.0f);
                                    h00Var.getParentLayout().getOverlayContainerView().addView(h00Var.R, marginLayoutParams);
                                    h00Var.R.f(h00Var.c, true);
                                    break;
                                }
                            }
                        }
                    }
                }
                break;
            case 11:
                vz vzVar = (vz) this.b;
                ArrayList arrayList6 = vzVar.W1;
                int i25 = i10 - 1;
                if (i25 >= 0 && i25 < arrayList6.size()) {
                    zz zzVar2 = (zz) arrayList6.get(i25);
                    int i26 = zzVar2.a;
                    if (i26 == 7) {
                        vzVar.dismiss();
                        vzVar.o1.presentFragment(new hz(vzVar.Q1, zzVar2.m));
                        break;
                    } else if (i26 == 8) {
                        vzVar.d1();
                        break;
                    }
                }
                break;
            case 12:
                y00 y00Var = (y00) this.b;
                if (view instanceof org.telegram.ui.Cells.l7) {
                    y00Var.f(i10, view, ((org.telegram.ui.Cells.l7) view).getMessage(), 0);
                    break;
                } else if (view instanceof org.telegram.ui.Cells.o7) {
                    y00Var.f(i10, view, ((org.telegram.ui.Cells.o7) view).getMessage(), 0);
                    break;
                } else if (view instanceof org.telegram.ui.Cells.k7) {
                    y00Var.f(i10, view, ((org.telegram.ui.Cells.k7) view).getMessage(), 0);
                    break;
                } else if (view instanceof org.telegram.ui.Cells.h2) {
                    y00Var.f(i10, view, ((org.telegram.ui.Cells.h2) view).getMessageObject(), 0);
                    break;
                } else if (view instanceof org.telegram.ui.Cells.v2) {
                    y00Var.f(i10, view, ((org.telegram.ui.Cells.v2) view).getMessage(), 0);
                    break;
                }
                break;
            case 13:
                d60 d60Var = (d60) this.b;
                if (d60Var.getParentActivity() != null) {
                    if (i10 == d60Var.n || i10 == 0) {
                        if (d60Var.f != null) {
                            try {
                                ((ClipboardManager) org.telegram.messenger.w0.b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", d60Var.f.link));
                                org.telegram.ui.Components.cc.j(d60Var).j();
                                break;
                            } catch (Exception e) {
                                org.telegram.messenger.f8.g(e, true);
                                return;
                            }
                        }
                    } else if (i10 != d60Var.s) {
                        if (i10 == d60Var.r) {
                            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(d60Var.getParentActivity());
                            alertDialog$Builder3.a.T = org.telegram.messenger.dd.L0(2131746043, null);
                            alertDialog$Builder3.a.R = org.telegram.messenger.dd.L0(2131746040, null);
                            alertDialog$Builder3.k(org.telegram.messenger.dd.L0(2131746041, null), new st(d60Var, 13));
                            alertDialog$Builder3.h(org.telegram.messenger.dd.L0(2131752589, null), null);
                            d60Var.showDialog(alertDialog$Builder3.a);
                            break;
                        }
                    } else if (d60Var.f != null) {
                        try {
                            Intent intent = new Intent("android.intent.action.SEND");
                            intent.setType("text/plain");
                            intent.putExtra("android.intent.extra.TEXT", d60Var.f.link);
                            d60Var.getParentActivity().startActivityForResult(Intent.createChooser(intent, org.telegram.messenger.dd.L0(2131749120, null)), 500);
                            break;
                        } catch (Exception e7) {
                            org.telegram.messenger.f8.g(e7, true);
                            return;
                        }
                    }
                }
                break;
            case 14:
                j60.Z((j60) this.b, view, i10);
                break;
            case 15:
                x60.Z((x60) this.b, view, i10);
                break;
            case 16:
                LanguageSelectActivity.Z((LanguageSelectActivity) this.b, view, i10);
                break;
            case 17:
                ((ih0) this.b).onBackPressed();
                break;
            case 18:
                qh0 qh0Var = (qh0) this.b;
                int i27 = qh0Var.I;
                if (i10 >= i27 && i10 < qh0Var.J) {
                    org.telegram.messenger.kj kjVar = (org.telegram.messenger.kj) qh0Var.y.get(i10 - i27);
                    if (!kjVar.x4()) {
                        long B0 = org.telegram.messenger.kj.B0(kjVar.k);
                        Bundle bundle3 = new Bundle();
                        if (org.telegram.messenger.o5.E(B0)) {
                            bundle3.putLong("user_id", B0);
                        } else {
                            bundle3.putLong("chat_id", -B0);
                        }
                        bundle3.putInt("message_id", kjVar.f1());
                        bundle3.putBoolean("need_remove_previous_same_chat_activity", false);
                        if (qh0Var.getMessagesController().E(bundle3, qh0Var, null, null)) {
                            qh0Var.presentFragment(new un(bundle3));
                            break;
                        }
                    } else if (!qh0Var.g0(kjVar)) {
                        qh0Var.getOrCreateStoryViewer().U(qh0Var.getParentActivity(), kjVar.l, th.n5.a(qh0Var.f));
                        break;
                    }
                }
                break;
            case 19:
                PasscodeActivity.a0((PasscodeActivity) this.b, view, i10);
                break;
            case 20:
                qn0 qn0Var = (qn0) this.b;
                qn0Var.a(i10, true);
                dn0 dn0Var = qn0Var.h;
                if (dn0Var != null) {
                    dn0Var.a(Integer.valueOf(i10));
                    break;
                }
                break;
            case 21:
                jo0 jo0Var = (jo0) this.b;
                ArrayList arrayList7 = jo0Var.f;
                ArrayList arrayList8 = jo0Var.n;
                org.telegram.messenger.xe xeVar = jo0Var.J;
                if (xeVar != null || !arrayList7.isEmpty()) {
                    if (xeVar != null) {
                        arrayList7 = xeVar.e;
                    }
                    if (i10 >= 0 && i10 < arrayList7.size()) {
                        org.telegram.ui.ActionBar.t0 t0Var = jo0Var.P;
                        if (t0Var != null) {
                            org.telegram.messenger.i0.v1(t0Var.getSearchField());
                        }
                        if (jo0Var.Y) {
                            jo0Var.f0(view, arrayList7.get(i10));
                            break;
                        } else {
                            int i28 = jo0Var.T;
                            if (i28 == 1 || i28 == 3) {
                                i15 = 1;
                            } else {
                                if (i28 != 2) {
                                    i13 = 10;
                                    if (i28 != 10) {
                                        if (jo0Var.U == null) {
                                            i15 = 4;
                                        }
                                    }
                                }
                                i15 = i13;
                            }
                            PhotoViewer.v1().N2(null, jo0Var, null);
                            PhotoViewer v12 = PhotoViewer.v1();
                            int i29 = jo0Var.H;
                            boolean z18 = jo0Var.I;
                            v12.h = i29;
                            v12.n = z18;
                            PhotoViewer.v1().j2(arrayList7, i10, i15, jo0Var.l0, jo0Var.x0, jo0Var.U);
                            break;
                        }
                    }
                } else if (i10 < arrayList8.size()) {
                    String str = (String) arrayList8.get(i10);
                    ko0 ko0Var = jo0Var.t0;
                    if (ko0Var != null) {
                        switch (ko0Var.a) {
                            case 1:
                                mo0.m0(ko0Var.b, str);
                                break;
                            default:
                                mo0.m0(ko0Var.b, str);
                                break;
                        }
                    } else {
                        jo0Var.P.getSearchField().setText(str);
                        jo0Var.P.getSearchField().setSelection(str.length());
                        jo0Var.g0(jo0Var.P.getSearchField());
                        break;
                    }
                } else if (i10 == arrayList8.size() + 1) {
                    AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(jo0Var.getParentActivity());
                    alertDialog$Builder4.a.R = org.telegram.messenger.dd.L0(2131752056, null);
                    alertDialog$Builder4.a.T = org.telegram.messenger.dd.L0(2131752061, null);
                    alertDialog$Builder4.k(org.telegram.messenger.dd.L0(2131752099, null), new ao0(jo0Var, i14));
                    alertDialog$Builder4.h(org.telegram.messenger.dd.L0(2131752589, null), null);
                    org.telegram.ui.ActionBar.x1 x1Var3 = alertDialog$Builder4.a;
                    jo0Var.showDialog(x1Var3);
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
                    if (obj instanceof org.telegram.messenger.af) {
                        ((org.telegram.messenger.af) obj).s = photoViewer.p1();
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
                zs0 zs0Var = (zs0) this.b;
                boolean[] zArr = zs0Var.x;
                if (i10 == zs0Var.o0) {
                    zs0Var.k0();
                    break;
                } else if (view instanceof org.telegram.ui.Cells.t8) {
                    org.telegram.ui.Cells.t8 t8Var = (org.telegram.ui.Cells.t8) view;
                    boolean z19 = zs0Var.L;
                    org.telegram.ui.Components.tx0 tx0Var = zs0Var.Q;
                    if (tx0Var != null) {
                        tx0Var.f();
                    }
                    if (zs0Var.I) {
                        int i30 = -zs0Var.O;
                        zs0Var.O = i30;
                        org.telegram.messenger.i0.F3(i30, t8Var, null);
                        org.telegram.messenger.t2.D.a();
                        break;
                    } else {
                        if (i10 == zs0Var.r0) {
                            z10 = !zs0Var.G;
                            zs0Var.G = z10;
                        } else {
                            int i31 = zs0Var.u0;
                            if (i10 == i31) {
                                z10 = !zs0Var.H;
                                zs0Var.H = z10;
                            } else if (i10 == zs0Var.v0) {
                                z10 = !zs0Var.J;
                                zs0Var.J = z10;
                                zs0Var.w0();
                                int i32 = zs0Var.u0;
                                if (i32 >= 0 && i31 < 0) {
                                    zs0Var.b.i(i32);
                                } else if (i31 >= 0 && i32 < 0) {
                                    zs0Var.b.s(i31);
                                }
                            } else if (i10 == zs0Var.s0) {
                                boolean z20 = zs0Var.K;
                                boolean z21 = !z20;
                                zs0Var.K = z21;
                                if (!z20 && zs0Var.L) {
                                    int i33 = zs0Var.j0;
                                    zs0Var.L = false;
                                    zs0Var.w0();
                                    s4.c1 K = zs0Var.c.K(zs0Var.t0);
                                    if (K != null) {
                                        ((org.telegram.ui.Cells.t8) K.a).setChecked(false);
                                    } else {
                                        zs0Var.b.g(zs0Var.t0);
                                    }
                                    zs0Var.b.p(i33, 2);
                                }
                                z10 = z21;
                            } else if (zs0Var.N == 0) {
                                boolean z22 = !zs0Var.L;
                                zs0Var.L = z22;
                                int i34 = zs0Var.j0;
                                zs0Var.w0();
                                if (zs0Var.L) {
                                    zs0Var.b.o(zs0Var.j0, 2);
                                } else {
                                    zs0Var.b.p(i34, 2);
                                }
                                if (zs0Var.L && zs0Var.K) {
                                    zs0Var.K = false;
                                    s4.c1 K2 = zs0Var.c.K(zs0Var.s0);
                                    if (K2 != null) {
                                        ((org.telegram.ui.Cells.t8) K2.a).setChecked(false);
                                    } else {
                                        zs0Var.b.g(zs0Var.s0);
                                    }
                                }
                                if (zs0Var.L) {
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
                        if (zs0Var.M && !zs0Var.L) {
                            zs0Var.c.getChildCount();
                            zs0Var.h.b(true);
                        }
                        for (int i36 = zs0Var.n0; i36 < zs0Var.n0 + zs0Var.D; i36++) {
                            s4.c1 K3 = zs0Var.c.K(i36);
                            if (K3 != null) {
                                View view2 = K3.a;
                                if (view2 instanceof org.telegram.ui.Cells.e6) {
                                    org.telegram.ui.Cells.e6 e6Var = (org.telegram.ui.Cells.e6) view2;
                                    e6Var.m(zs0Var.L, true);
                                    e6Var.r.a(zArr[i36 - zs0Var.n0], z19);
                                    if (e6Var.getTop() > org.telegram.messenger.i0.L(40.0f) && i10 == zs0Var.t0 && !zs0Var.M) {
                                        zs0Var.h.f(e6Var.getCheckBox(), true);
                                        zs0Var.M = true;
                                    }
                                }
                            }
                        }
                        t8Var.setChecked(z10);
                        zs0Var.n0();
                        break;
                    }
                }
                break;
            case 24:
                PremiumPreviewFragment.Z((PremiumPreviewFragment) this.b, view, i10);
                break;
            case 25:
                cu0 cu0Var = (cu0) this.b;
                PremiumPreviewFragment premiumPreviewFragment = cu0Var.n;
                ArrayList arrayList10 = premiumPreviewFragment.d;
                ks0 ks0Var = cu0Var.e;
                if (view.isEnabled() && (view instanceof kg.a2)) {
                    kg.a2 a2Var = (kg.a2) view;
                    premiumPreviewFragment.e = arrayList10.indexOf(a2Var.getTier());
                    premiumPreviewFragment.y0(true);
                    a2Var.c(true, true);
                    for (int i37 = 0; i37 < ks0Var.getChildCount(); i37++) {
                        View childAt = ks0Var.getChildAt(i37);
                        if (childAt instanceof kg.a2) {
                            kg.a2 a2Var2 = (kg.a2) childAt;
                            if (a2Var2.getTier() != a2Var.getTier()) {
                                a2Var2.c(false, true);
                            }
                        }
                    }
                    for (int i38 = 0; i38 < ks0Var.getHiddenChildCount(); i38++) {
                        View V = ks0Var.V(i38);
                        if (V instanceof kg.a2) {
                            kg.a2 a2Var3 = (kg.a2) V;
                            if (a2Var3.getTier() != a2Var.getTier()) {
                                a2Var3.c(false, true);
                            }
                        }
                    }
                    for (int i39 = 0; i39 < ks0Var.getCachedChildCount(); i39++) {
                        View P = ks0Var.P(i39);
                        if (P instanceof kg.a2) {
                            kg.a2 a2Var4 = (kg.a2) P;
                            if (a2Var4.getTier() != a2Var.getTier()) {
                                a2Var4.c(false, true);
                            }
                        }
                    }
                    for (int i40 = 0; i40 < ks0Var.getAttachedScrapChildCount(); i40++) {
                        View O = ks0Var.O(i40);
                        if (O instanceof kg.a2) {
                            kg.a2 a2Var5 = (kg.a2) O;
                            if (a2Var5.getTier() != a2Var.getTier()) {
                                a2Var5.c(false, true);
                            }
                        }
                    }
                    FrameLayout frameLayout = premiumPreviewFragment.J;
                    if (!premiumPreviewFragment.getUserConfig().q() || ((eu0Var = premiumPreviewFragment.f) != null && eu0Var.a.months < ((eu0) arrayList10.get(premiumPreviewFragment.e)).a.months && !premiumPreviewFragment.p0)) {
                        z11 = true;
                    }
                    org.telegram.messenger.i0.W3(frameLayout, z11);
                    break;
                }
                break;
            case 26:
                PrivacyControlActivity.c0((PrivacyControlActivity) this.b, view, i10);
                break;
            case 27:
                a(i10, view);
                break;
            case 28:
                ProfileActivity.c0((ProfileActivity) this.b, i10);
                break;
            default:
                ProxyListActivity.Z((ProxyListActivity) this.b, view, i10);
                break;
        }
    }
}
