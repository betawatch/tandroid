package org.telegram.ui;

import android.appwidget.AppWidgetManager;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.os.Bundle;
import android.os.Vibrator;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashMap;
import org.scilab.forge.jlatexmath.TeXSymbolParser;
import org.telegram.messenger.ChatsWidgetProvider;
import org.telegram.messenger.ContactsWidgetProvider;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class cv extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ cv(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:166:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x03cd  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x03fd  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0408  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0425  */
    @Override // org.telegram.ui.ActionBar.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(int i7) {
        jw jwVar;
        bx bxVar;
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        int i10;
        long j3;
        int i11;
        boolean z10;
        boolean z11;
        boolean z12;
        g90 g90Var;
        String obj;
        boolean z13;
        Bitmap bitmap;
        int i12 = this.a;
        final int i13 = 0;
        boolean z14 = true;
        Object obj2 = this.b;
        switch (i12) {
            case 0:
                bx bxVar2 = (bx) obj2;
                ArrayList arrayList = bxVar2.K2;
                if ((i7 == 201 || i7 == 200 || i7 == 202 || i7 == 203) && (jwVar = bxVar2.D0) != null) {
                    HashMap hashMap = jwVar.C0;
                    bx bxVar3 = jwVar.M0;
                    if (i7 != 202) {
                        if (i7 != 203) {
                            if (i7 != 200) {
                                if (i7 == 201) {
                                    bx bxVar4 = new bx(org.telegram.ui.Cells.c0.l(3, "onlySelect", "dialogsType", true));
                                    bxVar4.E2 = new org.telegram.ui.Components.hy(jwVar, 17);
                                    bxVar3.presentFragment(bxVar4);
                                    break;
                                }
                            } else if (hashMap.size() == 1) {
                                jwVar.B((org.telegram.messenger.fj) hashMap.values().iterator().next());
                                break;
                            }
                        } else if (jwVar.M()) {
                            bxVar3.showDialog(new ug.y0((org.telegram.ui.ActionBar.g2) bxVar3, 2, true));
                            break;
                        }
                    } else if (bxVar3 != null && bxVar3.getParentActivity() != null) {
                        ArrayList arrayList2 = new ArrayList(hashMap.values());
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(bxVar3.getParentActivity());
                        String G = org.telegram.messenger.gd.G(hashMap.size(), "RemoveDocumentsTitle", new Object[0]);
                        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
                        t1Var.S = G;
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                        spannableStringBuilder.append((CharSequence) org.telegram.messenger.g0.W2(org.telegram.messenger.gd.G(hashMap.size(), "RemoveDocumentsMessage", new Object[0]))).append((CharSequence) "\n\n").append((CharSequence) org.telegram.messenger.gd.N0(2131746123, null));
                        t1Var.U = spannableStringBuilder;
                        alertDialog$Builder.h(org.telegram.messenger.gd.N0(2131752577, null), new org.telegram.ui.Components.ub0(6));
                        alertDialog$Builder.k(org.telegram.messenger.gd.N0(2131751586, null), new org.telegram.ui.Components.g2(19, jwVar, arrayList2));
                        TextView textView = (TextView) alertDialog$Builder.p().d(-1);
                        if (textView != null) {
                            org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.q7, null);
                            break;
                        }
                    }
                } else if (i7 == -1) {
                    wv wvVar = bxVar2.H3;
                    if (wvVar == null || !wvVar.c()) {
                        qw qwVar = bxVar2.A0;
                        if (qwVar == null || !qwVar.n) {
                            kVar = ((org.telegram.ui.ActionBar.g2) bxVar2).actionBar;
                            if (kVar.x()) {
                                jw jwVar2 = bxVar2.D0;
                                if (jwVar2 != null && jwVar2.getVisibility() == 0) {
                                    jw jwVar3 = bxVar2.D0;
                                    if (jwVar3.B0) {
                                        jwVar3.P(false);
                                        break;
                                    }
                                }
                                bxVar2.p4(true);
                                break;
                            } else if (bxVar2.n2 || bxVar2.Y2 != 0 || bxVar2.a3 != 0) {
                                bxVar2.finishFragment();
                                break;
                            }
                        } else {
                            qwVar.setIsEditing(false);
                            bxVar2.c5(false);
                            break;
                        }
                    } else {
                        kVar2 = ((org.telegram.ui.ActionBar.g2) bxVar2).actionBar;
                        if (kVar2.x()) {
                            jw jwVar4 = bxVar2.D0;
                            if (jwVar4 != null && jwVar4.getVisibility() == 0) {
                                jw jwVar5 = bxVar2.D0;
                                if (jwVar5.B0) {
                                    jwVar5.P(false);
                                    break;
                                }
                            }
                            bxVar2.p4(true);
                            break;
                        } else {
                            bxVar2.H3.a();
                            jw jwVar6 = bxVar2.D0;
                            if (jwVar6 != null) {
                                jwVar6.Q();
                                break;
                            }
                        }
                    }
                } else if (i7 != 1) {
                    if (i7 == 3) {
                        bxVar2.i5(true, true, true, false);
                        bxVar2.Z.b(true);
                        break;
                    } else if (i7 == 11) {
                        bxVar2.G4(bxVar2.F1);
                        break;
                    } else if (i7 == 109) {
                        org.telegram.ui.Components.pz pzVar = new org.telegram.ui.Components.pz(bxVar2, arrayList);
                        pzVar.u1 = new zr(this, 7);
                        bxVar2.showDialog(pzVar);
                        break;
                    } else if (i7 == 110) {
                        org.telegram.messenger.ro roVar = (org.telegram.messenger.ro) bxVar2.getMessagesController().V0().get(bxVar2.f0[0].h);
                        ArrayList K0 = org.telegram.ui.Components.pz.K0(bxVar2, roVar, arrayList, false, false);
                        if (K0.size() + (roVar != null ? roVar.i.size() : 0) > 100) {
                            bxVar2.showDialog(org.telegram.ui.Components.b5.K(bxVar2.getParentActivity(), org.telegram.messenger.gd.N0(2131750798, null), org.telegram.messenger.gd.N0(2131750799, null)).a);
                            break;
                        } else {
                            if (K0.isEmpty()) {
                                bxVar = bxVar2;
                            } else {
                                roVar.i.addAll(K0);
                                for (int i14 = 0; i14 < K0.size(); i14++) {
                                    Long l10 = (Long) K0.get(i14);
                                    roVar.h.remove(l10);
                                    roVar.j.delete(l10.longValue());
                                }
                                if (roVar.c()) {
                                    roVar.i.clear();
                                }
                                jz.z0(roVar, roVar.g, roVar.b, roVar.c, roVar.n, roVar.m, roVar.h, roVar.i, roVar.j, false, false, true, false, false, bxVar2, null);
                                bxVar = bxVar2;
                            }
                            long longValue = K0.size() == 1 ? ((Long) K0.get(0)).longValue() : 0L;
                            UndoView l42 = bxVar.l4();
                            if (l42 != null) {
                                l42.k(longValue, 21, Integer.valueOf(K0.size()), roVar, null, null);
                            }
                            bxVar.p4(false);
                            break;
                        }
                    } else if (i7 == 100 || i7 == 101 || i7 == 102 || i7 == 103 || i7 == 104 || i7 == 105 || i7 == 106 || i7 == 107 || i7 == 108) {
                        bxVar2.K4(bxVar2.K2, i7, true, false, null);
                        break;
                    }
                } else if (bxVar2.getParentActivity() != null) {
                    org.telegram.messenger.bz.x = true;
                    org.telegram.messenger.bz.y();
                    int[] iArr = new int[2];
                    bxVar2.g0.getLocationInWindow(iArr);
                    ((LaunchActivity) bxVar2.getParentActivity()).K0(false, true, (bxVar2.g0.getMeasuredWidth() / 2) + iArr[0], (bxVar2.g0.getMeasuredHeight() / 2) + iArr[1], new ch(this, 22));
                    bxVar2.getNotificationsController().Y();
                    bxVar2.K3();
                    break;
                }
                break;
            case 1:
                long j10 = 0;
                jx jxVar = (jx) obj2;
                int i15 = jxVar.x;
                ArrayList arrayList3 = jxVar.e;
                int i16 = jxVar.y;
                if (i7 == -1) {
                    if (jxVar.E == null) {
                        jxVar.d0();
                        break;
                    } else {
                        jxVar.finishFragment();
                        break;
                    }
                } else if (i7 == 1 && jxVar.getParentActivity() != null) {
                    ArrayList arrayList4 = new ArrayList();
                    int i17 = 0;
                    while (i17 < arrayList3.size()) {
                        arrayList4.add(org.telegram.messenger.sr.a(((Long) arrayList3.get(i17)).longValue(), j10));
                        i17++;
                        j10 = 0;
                    }
                    org.telegram.messenger.tr messagesStorage = jxVar.getMessagesStorage();
                    messagesStorage.a.c(new org.telegram.messenger.tp(messagesStorage, i16, arrayList4, i13));
                    SharedPreferences.Editor edit = jxVar.getParentActivity().getSharedPreferences("shortcut_widget", 0).edit();
                    i10 = ((org.telegram.ui.ActionBar.g2) jxVar).currentAccount;
                    edit.putInt("account" + i16, i10);
                    edit.putInt(TeXSymbolParser.TYPE_ATTR + i16, i15);
                    edit.commit();
                    AppWidgetManager appWidgetManager = AppWidgetManager.getInstance(jxVar.getParentActivity());
                    if (i15 == 0) {
                        ChatsWidgetProvider.a(jxVar.getParentActivity(), appWidgetManager, i16);
                    } else {
                        ContactsWidgetProvider.a(jxVar.getParentActivity(), appWidgetManager, i16);
                    }
                    fx fxVar = jxVar.E;
                    if (fxVar != null) {
                        fxVar.c();
                        break;
                    } else {
                        jxVar.d0();
                        break;
                    }
                }
                break;
            case 2:
                if (i7 == -1) {
                    ((qx) obj2).finishFragment();
                    break;
                }
                break;
            case 3:
                jy jyVar = (jy) obj2;
                if (i7 == -1) {
                    if (jyVar.b0(true)) {
                        jyVar.finishFragment();
                        break;
                    }
                } else if (i7 == 1) {
                    jyVar.h0();
                    break;
                }
                break;
            case 4:
                jz jzVar = (jz) obj2;
                if (i7 == -1) {
                    if (jzVar.n0(true)) {
                        jzVar.finishFragment();
                        break;
                    }
                } else if (i7 == 1) {
                    jzVar.w0();
                    break;
                }
                break;
            case 5:
                if (i7 == -1) {
                    ((FiltersSetupActivity) obj2).finishFragment();
                    break;
                }
                break;
            case 6:
                if (i7 == -1) {
                    ((r00) obj2).finishFragment();
                    break;
                }
                break;
            case 7:
                y40 y40Var = (y40) obj2;
                if (i7 == -1) {
                    if (y40Var.k0(true)) {
                        y40Var.finishFragment();
                        break;
                    }
                } else if (i7 == 1) {
                    y40Var.t0();
                    break;
                }
                break;
            case 8:
                if (i7 == -1) {
                    ((e50) obj2).finishFragment();
                    break;
                }
                break;
            case 9:
                if (i7 == -1) {
                    ((g50) obj2).finishFragment();
                    break;
                }
                break;
            case 10:
                if (i7 == -1) {
                    ((n50) obj2).finishFragment();
                    break;
                }
                break;
            case 11:
                if (i7 == -1) {
                    ((q50) obj2).finishFragment();
                    break;
                }
                break;
            case 12:
                if (i7 == -1) {
                    ((a60) obj2).finishFragment();
                    break;
                }
                break;
            case 13:
                if (i7 == -1) {
                    ((LanguageSelectActivity) obj2).finishFragment();
                    break;
                }
                break;
            case 14:
                final j90 j90Var = (j90) obj2;
                if (i7 == -1) {
                    j90Var.finishFragment();
                    org.telegram.messenger.g0.v1(j90Var.G);
                    break;
                } else if (i7 == 1) {
                    long j11 = j90Var.b;
                    ArrayList arrayList5 = j90Var.R;
                    ArrayList arrayList6 = j90Var.P;
                    if (!j90Var.V) {
                        int selectedIndex = j90Var.d.getSelectedIndex();
                        if (selectedIndex < arrayList6.size() && ((Integer) arrayList6.get(selectedIndex)).intValue() < 0) {
                            org.telegram.messenger.g0.D3(j90Var.x);
                            Vibrator vibrator = (Vibrator) j90Var.x.getContext().getSystemService("vibrator");
                            if (vibrator != null) {
                                vibrator.vibrate(200L);
                                break;
                            }
                        } else {
                            org.telegram.ui.Cells.r8 r8Var = j90Var.n;
                            if (r8Var != null && r8Var.e.h) {
                                try {
                                    j3 = Long.parseLong(j90Var.r.d.getText().toString());
                                } catch (Exception e10) {
                                    org.telegram.messenger.a8.g(e10, true);
                                }
                                i11 = j90Var.a;
                                if (i11 != 0) {
                                    org.telegram.ui.ActionBar.t1 t1Var2 = j90Var.U;
                                    if (t1Var2 != null) {
                                        t1Var2.dismiss();
                                    }
                                    j90Var.V = true;
                                    org.telegram.ui.ActionBar.t1 t1Var3 = new org.telegram.ui.ActionBar.t1(3, j90Var.getParentActivity(), null);
                                    j90Var.U = t1Var3;
                                    t1Var3.r(500L);
                                    TLRPC.TL_messages_exportChatInvite tL_messages_exportChatInvite = new TLRPC.TL_messages_exportChatInvite();
                                    tL_messages_exportChatInvite.peer = j90Var.getMessagesController().l1(-j11);
                                    tL_messages_exportChatInvite.legacy_revoke_permanent = false;
                                    int selectedIndex2 = j90Var.d.getSelectedIndex();
                                    tL_messages_exportChatInvite.flags |= 1;
                                    if (selectedIndex2 < arrayList6.size()) {
                                        tL_messages_exportChatInvite.expire_date = j90Var.getConnectionsManager().getCurrentTime() + ((Integer) arrayList6.get(selectedIndex2)).intValue();
                                    } else {
                                        tL_messages_exportChatInvite.expire_date = 0;
                                    }
                                    int selectedIndex3 = j90Var.c.getSelectedIndex();
                                    tL_messages_exportChatInvite.flags |= 2;
                                    if (selectedIndex3 < arrayList5.size()) {
                                        tL_messages_exportChatInvite.usage_limit = ((Integer) arrayList5.get(selectedIndex3)).intValue();
                                    } else {
                                        tL_messages_exportChatInvite.usage_limit = 0;
                                    }
                                    g90 g90Var2 = j90Var.f;
                                    boolean z15 = g90Var2 != null && g90Var2.e.h;
                                    tL_messages_exportChatInvite.request_needed = z15;
                                    if (z15) {
                                        tL_messages_exportChatInvite.usage_limit = 0;
                                    }
                                    String obj3 = j90Var.L.getText().toString();
                                    tL_messages_exportChatInvite.title = obj3;
                                    if (!TextUtils.isEmpty(obj3)) {
                                        tL_messages_exportChatInvite.flags |= 16;
                                    }
                                    if (j3 > 0) {
                                        tL_messages_exportChatInvite.flags |= 32;
                                        TL_stars.TL_starsSubscriptionPricing tL_starsSubscriptionPricing = new TL_stars.TL_starsSubscriptionPricing();
                                        tL_messages_exportChatInvite.subscription_pricing = tL_starsSubscriptionPricing;
                                        tL_starsSubscriptionPricing.period = j90Var.getConnectionsManager().isTestBackend() ? org.telegram.messenger.ks.X4 : 2592000;
                                        tL_messages_exportChatInvite.subscription_pricing.amount = j3;
                                    }
                                    j90Var.getConnectionsManager().sendRequest(tL_messages_exportChatInvite, new RequestDelegate() { // from class: org.telegram.ui.a90
                                        @Override // org.telegram.tgnet.RequestDelegate
                                        public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                                            switch (i13) {
                                                case 0:
                                                    final int i18 = 0;
                                                    final j90 j90Var2 = j90Var;
                                                    org.telegram.messenger.g0.g3(new Runnable() { // from class: org.telegram.ui.b90
                                                        @Override // java.lang.Runnable
                                                        public final void run() {
                                                            switch (i18) {
                                                                case 0:
                                                                    j90 j90Var3 = j90Var2;
                                                                    j90Var3.V = false;
                                                                    org.telegram.ui.ActionBar.t1 t1Var4 = j90Var3.U;
                                                                    if (t1Var4 != null) {
                                                                        t1Var4.dismiss();
                                                                    }
                                                                    TLRPC.TL_error tL_error2 = tL_error;
                                                                    if (tL_error2 != null) {
                                                                        org.telegram.ui.Components.b5.r0(j90Var3, null, tL_error2.text, null);
                                                                        break;
                                                                    } else {
                                                                        i90 i90Var = j90Var3.T;
                                                                        if (i90Var != null) {
                                                                            i90Var.c(tLObject);
                                                                        }
                                                                        j90Var3.finishFragment();
                                                                        break;
                                                                    }
                                                                default:
                                                                    j90 j90Var4 = j90Var2;
                                                                    j90Var4.V = false;
                                                                    org.telegram.ui.ActionBar.t1 t1Var5 = j90Var4.U;
                                                                    if (t1Var5 != null) {
                                                                        t1Var5.dismiss();
                                                                    }
                                                                    TLRPC.TL_error tL_error3 = tL_error;
                                                                    if (tL_error3 != null) {
                                                                        org.telegram.ui.Components.b5.r0(j90Var4, null, tL_error3.text, null);
                                                                        break;
                                                                    } else {
                                                                        TLObject tLObject2 = tLObject;
                                                                        if (tLObject2 instanceof TLRPC.TL_messages_exportedChatInvite) {
                                                                            j90Var4.e = (TLRPC.TL_chatInviteExported) ((TLRPC.TL_messages_exportedChatInvite) tLObject2).invite;
                                                                        }
                                                                        i90 i90Var2 = j90Var4.T;
                                                                        if (i90Var2 != null) {
                                                                            i90Var2.b(j90Var4.e, tLObject2);
                                                                        }
                                                                        j90Var4.finishFragment();
                                                                        break;
                                                                    }
                                                            }
                                                        }
                                                    });
                                                    break;
                                                default:
                                                    final int i19 = 1;
                                                    final j90 j90Var3 = j90Var;
                                                    org.telegram.messenger.g0.g3(new Runnable() { // from class: org.telegram.ui.b90
                                                        @Override // java.lang.Runnable
                                                        public final void run() {
                                                            switch (i19) {
                                                                case 0:
                                                                    j90 j90Var32 = j90Var3;
                                                                    j90Var32.V = false;
                                                                    org.telegram.ui.ActionBar.t1 t1Var4 = j90Var32.U;
                                                                    if (t1Var4 != null) {
                                                                        t1Var4.dismiss();
                                                                    }
                                                                    TLRPC.TL_error tL_error2 = tL_error;
                                                                    if (tL_error2 != null) {
                                                                        org.telegram.ui.Components.b5.r0(j90Var32, null, tL_error2.text, null);
                                                                        break;
                                                                    } else {
                                                                        i90 i90Var = j90Var32.T;
                                                                        if (i90Var != null) {
                                                                            i90Var.c(tLObject);
                                                                        }
                                                                        j90Var32.finishFragment();
                                                                        break;
                                                                    }
                                                                default:
                                                                    j90 j90Var4 = j90Var3;
                                                                    j90Var4.V = false;
                                                                    org.telegram.ui.ActionBar.t1 t1Var5 = j90Var4.U;
                                                                    if (t1Var5 != null) {
                                                                        t1Var5.dismiss();
                                                                    }
                                                                    TLRPC.TL_error tL_error3 = tL_error;
                                                                    if (tL_error3 != null) {
                                                                        org.telegram.ui.Components.b5.r0(j90Var4, null, tL_error3.text, null);
                                                                        break;
                                                                    } else {
                                                                        TLObject tLObject2 = tLObject;
                                                                        if (tLObject2 instanceof TLRPC.TL_messages_exportedChatInvite) {
                                                                            j90Var4.e = (TLRPC.TL_chatInviteExported) ((TLRPC.TL_messages_exportedChatInvite) tLObject2).invite;
                                                                        }
                                                                        i90 i90Var2 = j90Var4.T;
                                                                        if (i90Var2 != null) {
                                                                            i90Var2.b(j90Var4.e, tLObject2);
                                                                        }
                                                                        j90Var4.finishFragment();
                                                                        break;
                                                                    }
                                                            }
                                                        }
                                                    });
                                                    break;
                                            }
                                        }
                                    });
                                    break;
                                } else if (i11 == 1) {
                                    org.telegram.ui.ActionBar.t1 t1Var4 = j90Var.U;
                                    if (t1Var4 != null) {
                                        t1Var4.dismiss();
                                    }
                                    TLRPC.TL_messages_editExportedChatInvite tL_messages_editExportedChatInvite = new TLRPC.TL_messages_editExportedChatInvite();
                                    tL_messages_editExportedChatInvite.link = j90Var.e.link;
                                    tL_messages_editExportedChatInvite.revoked = false;
                                    tL_messages_editExportedChatInvite.peer = j90Var.getMessagesController().l1(-j11);
                                    int selectedIndex4 = j90Var.d.getSelectedIndex();
                                    if (selectedIndex4 < arrayList6.size()) {
                                        if (j90Var.W != ((Integer) arrayList6.get(selectedIndex4)).intValue()) {
                                            tL_messages_editExportedChatInvite.flags |= 1;
                                            tL_messages_editExportedChatInvite.expire_date = j90Var.getConnectionsManager().getCurrentTime() + ((Integer) arrayList6.get(selectedIndex4)).intValue();
                                            z10 = true;
                                        }
                                        z10 = false;
                                    } else {
                                        if (j90Var.W != 0) {
                                            tL_messages_editExportedChatInvite.flags |= 1;
                                            tL_messages_editExportedChatInvite.expire_date = 0;
                                            z10 = true;
                                        }
                                        z10 = false;
                                    }
                                    int selectedIndex5 = j90Var.c.getSelectedIndex();
                                    if (selectedIndex5 < arrayList5.size()) {
                                        int intValue = ((Integer) arrayList5.get(selectedIndex5)).intValue();
                                        z11 = z10;
                                        if (j90Var.e.usage_limit != intValue) {
                                            tL_messages_editExportedChatInvite.flags |= 2;
                                            tL_messages_editExportedChatInvite.usage_limit = intValue;
                                            z11 = true;
                                        }
                                        z12 = j90Var.e.request_needed;
                                        g90Var = j90Var.f;
                                        if (z12 != (g90Var == null && g90Var.e.h)) {
                                            int i18 = tL_messages_editExportedChatInvite.flags;
                                            tL_messages_editExportedChatInvite.flags = i18 | 8;
                                            boolean z16 = g90Var != null && g90Var.e.h;
                                            tL_messages_editExportedChatInvite.request_needed = z16;
                                            if (z16) {
                                                tL_messages_editExportedChatInvite.flags = i18 | 10;
                                                tL_messages_editExportedChatInvite.usage_limit = 0;
                                            }
                                            z11 = true;
                                        }
                                        obj = j90Var.L.getText().toString();
                                        z13 = z11;
                                        if (!TextUtils.equals(j90Var.e.title, obj)) {
                                            tL_messages_editExportedChatInvite.title = obj;
                                            tL_messages_editExportedChatInvite.flags |= 16;
                                            z13 = true;
                                        }
                                        if (z13) {
                                            j90Var.finishFragment();
                                            break;
                                        } else {
                                            j90Var.V = true;
                                            org.telegram.ui.ActionBar.t1 t1Var5 = new org.telegram.ui.ActionBar.t1(3, j90Var.getParentActivity(), null);
                                            j90Var.U = t1Var5;
                                            t1Var5.r(500L);
                                            ConnectionsManager connectionsManager = j90Var.getConnectionsManager();
                                            final boolean z17 = z14 ? 1 : 0;
                                            connectionsManager.sendRequest(tL_messages_editExportedChatInvite, new RequestDelegate() { // from class: org.telegram.ui.a90
                                                @Override // org.telegram.tgnet.RequestDelegate
                                                public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                                                    switch (z17) {
                                                        case 0:
                                                            final int i182 = 0;
                                                            final j90 j90Var2 = j90Var;
                                                            org.telegram.messenger.g0.g3(new Runnable() { // from class: org.telegram.ui.b90
                                                                @Override // java.lang.Runnable
                                                                public final void run() {
                                                                    switch (i182) {
                                                                        case 0:
                                                                            j90 j90Var32 = j90Var2;
                                                                            j90Var32.V = false;
                                                                            org.telegram.ui.ActionBar.t1 t1Var42 = j90Var32.U;
                                                                            if (t1Var42 != null) {
                                                                                t1Var42.dismiss();
                                                                            }
                                                                            TLRPC.TL_error tL_error2 = tL_error;
                                                                            if (tL_error2 != null) {
                                                                                org.telegram.ui.Components.b5.r0(j90Var32, null, tL_error2.text, null);
                                                                                break;
                                                                            } else {
                                                                                i90 i90Var = j90Var32.T;
                                                                                if (i90Var != null) {
                                                                                    i90Var.c(tLObject);
                                                                                }
                                                                                j90Var32.finishFragment();
                                                                                break;
                                                                            }
                                                                        default:
                                                                            j90 j90Var4 = j90Var2;
                                                                            j90Var4.V = false;
                                                                            org.telegram.ui.ActionBar.t1 t1Var52 = j90Var4.U;
                                                                            if (t1Var52 != null) {
                                                                                t1Var52.dismiss();
                                                                            }
                                                                            TLRPC.TL_error tL_error3 = tL_error;
                                                                            if (tL_error3 != null) {
                                                                                org.telegram.ui.Components.b5.r0(j90Var4, null, tL_error3.text, null);
                                                                                break;
                                                                            } else {
                                                                                TLObject tLObject2 = tLObject;
                                                                                if (tLObject2 instanceof TLRPC.TL_messages_exportedChatInvite) {
                                                                                    j90Var4.e = (TLRPC.TL_chatInviteExported) ((TLRPC.TL_messages_exportedChatInvite) tLObject2).invite;
                                                                                }
                                                                                i90 i90Var2 = j90Var4.T;
                                                                                if (i90Var2 != null) {
                                                                                    i90Var2.b(j90Var4.e, tLObject2);
                                                                                }
                                                                                j90Var4.finishFragment();
                                                                                break;
                                                                            }
                                                                    }
                                                                }
                                                            });
                                                            break;
                                                        default:
                                                            final int i19 = 1;
                                                            final j90 j90Var3 = j90Var;
                                                            org.telegram.messenger.g0.g3(new Runnable() { // from class: org.telegram.ui.b90
                                                                @Override // java.lang.Runnable
                                                                public final void run() {
                                                                    switch (i19) {
                                                                        case 0:
                                                                            j90 j90Var32 = j90Var3;
                                                                            j90Var32.V = false;
                                                                            org.telegram.ui.ActionBar.t1 t1Var42 = j90Var32.U;
                                                                            if (t1Var42 != null) {
                                                                                t1Var42.dismiss();
                                                                            }
                                                                            TLRPC.TL_error tL_error2 = tL_error;
                                                                            if (tL_error2 != null) {
                                                                                org.telegram.ui.Components.b5.r0(j90Var32, null, tL_error2.text, null);
                                                                                break;
                                                                            } else {
                                                                                i90 i90Var = j90Var32.T;
                                                                                if (i90Var != null) {
                                                                                    i90Var.c(tLObject);
                                                                                }
                                                                                j90Var32.finishFragment();
                                                                                break;
                                                                            }
                                                                        default:
                                                                            j90 j90Var4 = j90Var3;
                                                                            j90Var4.V = false;
                                                                            org.telegram.ui.ActionBar.t1 t1Var52 = j90Var4.U;
                                                                            if (t1Var52 != null) {
                                                                                t1Var52.dismiss();
                                                                            }
                                                                            TLRPC.TL_error tL_error3 = tL_error;
                                                                            if (tL_error3 != null) {
                                                                                org.telegram.ui.Components.b5.r0(j90Var4, null, tL_error3.text, null);
                                                                                break;
                                                                            } else {
                                                                                TLObject tLObject2 = tLObject;
                                                                                if (tLObject2 instanceof TLRPC.TL_messages_exportedChatInvite) {
                                                                                    j90Var4.e = (TLRPC.TL_chatInviteExported) ((TLRPC.TL_messages_exportedChatInvite) tLObject2).invite;
                                                                                }
                                                                                i90 i90Var2 = j90Var4.T;
                                                                                if (i90Var2 != null) {
                                                                                    i90Var2.b(j90Var4.e, tLObject2);
                                                                                }
                                                                                j90Var4.finishFragment();
                                                                                break;
                                                                            }
                                                                    }
                                                                }
                                                            });
                                                            break;
                                                    }
                                                }
                                            });
                                            break;
                                        }
                                    } else {
                                        z11 = z10;
                                        if (j90Var.e.usage_limit != 0) {
                                            tL_messages_editExportedChatInvite.flags |= 2;
                                            tL_messages_editExportedChatInvite.usage_limit = 0;
                                            z11 = true;
                                        }
                                        z12 = j90Var.e.request_needed;
                                        g90Var = j90Var.f;
                                        if (z12 != (g90Var == null && g90Var.e.h)) {
                                        }
                                        obj = j90Var.L.getText().toString();
                                        z13 = z11;
                                        if (!TextUtils.equals(j90Var.e.title, obj)) {
                                        }
                                        if (z13) {
                                        }
                                    }
                                }
                            }
                            j3 = 0;
                            i11 = j90Var.a;
                            if (i11 != 0) {
                            }
                        }
                    }
                }
                break;
            case 15:
                if (i7 == -1) {
                    ((y90) obj2).finishFragment();
                    break;
                }
                break;
            case 16:
                de0 de0Var = (de0) obj2;
                if (i7 == 1) {
                    de0Var.H1();
                    break;
                } else if (i7 == -1 && de0Var.onBackPressed(true)) {
                    de0Var.finishFragment();
                    break;
                }
                break;
            case 17:
                if (i7 == -1) {
                    ((fe0) obj2).finishFragment();
                    break;
                }
                break;
            case 18:
                if (i7 == -1) {
                    ((ef0) obj2).finishFragment();
                    break;
                }
                break;
            case 19:
                if (i7 == -1) {
                    ((bi.e9) obj2).finishFragment();
                    break;
                }
                break;
            case 20:
                mg0 mg0Var = (mg0) obj2;
                if (i7 == -1) {
                    mg0Var.finishFragment();
                    break;
                } else if (i7 == 1) {
                    Bundle bundle = new Bundle();
                    bundle.putLong("chat_id", mg0Var.b);
                    mg0Var.presentFragment(new b51(bundle));
                    break;
                }
                break;
            case 21:
                if (i7 == -1) {
                    ((NotificationsCustomSettingsActivity) obj2).finishFragment();
                    break;
                }
                break;
            case 22:
                if (i7 == -1) {
                    ((NotificationsSettingsActivity) obj2).finishFragment();
                    break;
                }
                break;
            case 23:
                if (i7 == -1) {
                    ((PasscodeActivity) obj2).finishFragment();
                    break;
                }
                break;
            case 24:
                if (i7 == -1) {
                    ((PasskeysActivity) obj2).finishFragment();
                    break;
                }
                break;
            case 25:
                om0 om0Var = (om0) obj2;
                if (i7 == -1) {
                    om0Var.finishFragment();
                    break;
                } else if (i7 == 1) {
                    if (om0Var.W != null) {
                        om0Var.finishFragment(false);
                        om0Var.W.t();
                        break;
                    }
                } else if (i7 == 2) {
                    om0.Z(om0Var, null);
                    break;
                }
                break;
            case 26:
                rm0 rm0Var = (rm0) obj2;
                if (i7 == -1) {
                    rm0Var.finishFragment();
                    break;
                } else if (i7 == 1) {
                    if (rm0Var.c != null && !rm0Var.f) {
                        pm0 pm0Var = rm0Var.d;
                        float f10 = pm0Var.f - pm0Var.y;
                        float f11 = pm0Var.w;
                        float f12 = f10 / f11;
                        float f13 = (pm0Var.h - pm0Var.E) / pm0Var.x;
                        float f14 = pm0Var.d / f11;
                        float f15 = pm0Var.e / f11;
                        rm0 rm0Var2 = pm0Var.I;
                        int width = (int) (f12 * rm0Var2.a.getWidth());
                        int height = (int) (f13 * rm0Var2.a.getHeight());
                        int width2 = (int) (f14 * rm0Var2.a.getWidth());
                        int width3 = (int) (f15 * rm0Var2.a.getWidth());
                        int i19 = width < 0 ? 0 : width;
                        int i20 = height < 0 ? 0 : height;
                        if (i19 + width2 > rm0Var2.a.getWidth()) {
                            width2 = rm0Var2.a.getWidth() - i19;
                        }
                        int i21 = width2;
                        if (i20 + width3 > rm0Var2.a.getHeight()) {
                            width3 = rm0Var2.a.getHeight() - i20;
                        }
                        int i22 = width3;
                        try {
                            bitmap = Bitmap.createBitmap(rm0Var2.a, i19, i20, i21, i22, (Matrix) null, false);
                        } catch (Throwable th2) {
                            org.telegram.messenger.a8.g(th2, true);
                            System.gc();
                            try {
                                bitmap = Bitmap.createBitmap(rm0Var2.a, i19, i20, i21, i22, (Matrix) null, false);
                            } catch (Throwable th3) {
                                org.telegram.messenger.a8.g(th3, true);
                                bitmap = null;
                            }
                        }
                        if (bitmap == rm0Var.a) {
                            rm0Var.e = true;
                        }
                        ((org.telegram.ui.Components.u30) rm0Var.c).r(false, bitmap, null);
                        rm0Var.f = true;
                    }
                    rm0Var.finishFragment();
                    break;
                }
                break;
            case 27:
                an0 an0Var = (an0) obj2;
                if (i7 == -1) {
                    an0Var.finishFragment();
                    break;
                } else if (i7 == 1) {
                    boolean z18 = an0Var.Z;
                    an0Var.Z = !z18;
                    if (z18) {
                        an0Var.L.setPadding(org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(50.0f));
                    } else {
                        an0Var.L.setPadding(0, 0, 0, org.telegram.messenger.g0.L(48.0f));
                    }
                    an0Var.L.C0();
                    an0Var.N.h1(0, 0);
                    an0Var.M.f();
                    break;
                } else if (i7 == 2) {
                    zm0 zm0Var = an0Var.t0;
                    if (zm0Var != null) {
                        zm0Var.S();
                    }
                    an0Var.finishFragment();
                    break;
                }
                break;
            case 28:
                if (i7 == -1) {
                    ((dn0) obj2).finishFragment();
                    break;
                }
                break;
            default:
                PopupNotificationActivity popupNotificationActivity = (PopupNotificationActivity) obj2;
                if (i7 == -1) {
                    popupNotificationActivity.i();
                    popupNotificationActivity.finish();
                    break;
                } else if (i7 == 1) {
                    int i23 = PopupNotificationActivity.c0;
                    popupNotificationActivity.k();
                    break;
                } else if (i7 == 2) {
                    int i24 = PopupNotificationActivity.c0;
                    popupNotificationActivity.p();
                    break;
                }
                break;
        }
    }
}
