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

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class dv extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ dv(Object obj, int i7) {
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
        kw kwVar;
        cx cxVar;
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
                cx cxVar2 = (cx) obj2;
                ArrayList arrayList = cxVar2.K2;
                if ((i7 == 201 || i7 == 200 || i7 == 202 || i7 == 203) && (kwVar = cxVar2.D0) != null) {
                    HashMap hashMap = kwVar.C0;
                    cx cxVar3 = kwVar.M0;
                    if (i7 != 202) {
                        if (i7 != 203) {
                            if (i7 != 200) {
                                if (i7 == 201) {
                                    cx cxVar4 = new cx(org.telegram.ui.Cells.c0.l(3, "onlySelect", "dialogsType", true));
                                    cxVar4.E2 = new org.telegram.ui.Components.iy(kwVar, 17);
                                    cxVar3.presentFragment(cxVar4);
                                    break;
                                }
                            } else if (hashMap.size() == 1) {
                                kwVar.t0((org.telegram.messenger.fj) hashMap.values().iterator().next());
                                break;
                            }
                        } else if (kwVar.K()) {
                            cxVar3.showDialog(new ug.z0((org.telegram.ui.ActionBar.h2) cxVar3, 2, true));
                            break;
                        }
                    } else if (cxVar3 != null && cxVar3.getParentActivity() != null) {
                        ArrayList arrayList2 = new ArrayList(hashMap.values());
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(cxVar3.getParentActivity());
                        String G = org.telegram.messenger.gd.G(hashMap.size(), "RemoveDocumentsTitle", new Object[0]);
                        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
                        u1Var.S = G;
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                        spannableStringBuilder.append((CharSequence) org.telegram.messenger.g0.W2(org.telegram.messenger.gd.G(hashMap.size(), "RemoveDocumentsMessage", new Object[0]))).append((CharSequence) "\n\n").append((CharSequence) org.telegram.messenger.gd.M0(2131746124, null));
                        u1Var.U = spannableStringBuilder;
                        alertDialog$Builder.h(org.telegram.messenger.gd.M0(2131752578, null), new org.telegram.ui.Components.wb0(6));
                        alertDialog$Builder.k(org.telegram.messenger.gd.M0(2131751587, null), new org.telegram.ui.Components.g2(19, kwVar, arrayList2));
                        TextView textView = (TextView) alertDialog$Builder.p().d(-1);
                        if (textView != null) {
                            org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.q7, null);
                            break;
                        }
                    }
                } else if (i7 == -1) {
                    xv xvVar = cxVar2.H3;
                    if (xvVar == null || !xvVar.c()) {
                        rw rwVar = cxVar2.A0;
                        if (rwVar == null || !rwVar.n) {
                            kVar = ((org.telegram.ui.ActionBar.h2) cxVar2).actionBar;
                            if (kVar.y()) {
                                kw kwVar2 = cxVar2.D0;
                                if (kwVar2 != null && kwVar2.getVisibility() == 0) {
                                    kw kwVar3 = cxVar2.D0;
                                    if (kwVar3.B0) {
                                        kwVar3.N(false);
                                        break;
                                    }
                                }
                                cxVar2.p4(true);
                                break;
                            } else if (cxVar2.n2 || cxVar2.Y2 != 0 || cxVar2.a3 != 0) {
                                cxVar2.finishFragment();
                                break;
                            }
                        } else {
                            rwVar.setIsEditing(false);
                            cxVar2.c5(false);
                            break;
                        }
                    } else {
                        kVar2 = ((org.telegram.ui.ActionBar.h2) cxVar2).actionBar;
                        if (kVar2.y()) {
                            kw kwVar4 = cxVar2.D0;
                            if (kwVar4 != null && kwVar4.getVisibility() == 0) {
                                kw kwVar5 = cxVar2.D0;
                                if (kwVar5.B0) {
                                    kwVar5.N(false);
                                    break;
                                }
                            }
                            cxVar2.p4(true);
                            break;
                        } else {
                            cxVar2.H3.a();
                            kw kwVar6 = cxVar2.D0;
                            if (kwVar6 != null) {
                                kwVar6.O();
                                break;
                            }
                        }
                    }
                } else if (i7 != 1) {
                    if (i7 == 3) {
                        cxVar2.i5(true, true, true, false);
                        cxVar2.Z.b(true);
                        break;
                    } else if (i7 == 11) {
                        cxVar2.G4(cxVar2.F1);
                        break;
                    } else if (i7 == 109) {
                        org.telegram.ui.Components.qz qzVar = new org.telegram.ui.Components.qz(cxVar2, arrayList);
                        qzVar.u1 = new zr(this, 7);
                        cxVar2.showDialog(qzVar);
                        break;
                    } else if (i7 == 110) {
                        org.telegram.messenger.ro roVar = (org.telegram.messenger.ro) cxVar2.getMessagesController().V0().get(cxVar2.f0[0].h);
                        ArrayList K0 = org.telegram.ui.Components.qz.K0(cxVar2, roVar, arrayList, false, false);
                        if (K0.size() + (roVar != null ? roVar.i.size() : 0) > 100) {
                            cxVar2.showDialog(org.telegram.ui.Components.b5.K(cxVar2.getParentActivity(), org.telegram.messenger.gd.M0(2131750799, null), org.telegram.messenger.gd.M0(2131750800, null)).a);
                            break;
                        } else {
                            if (K0.isEmpty()) {
                                cxVar = cxVar2;
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
                                kz.z0(roVar, roVar.g, roVar.b, roVar.c, roVar.n, roVar.m, roVar.h, roVar.i, roVar.j, false, false, true, false, false, cxVar2, null);
                                cxVar = cxVar2;
                            }
                            long longValue = K0.size() == 1 ? ((Long) K0.get(0)).longValue() : 0L;
                            UndoView l42 = cxVar.l4();
                            if (l42 != null) {
                                l42.k(longValue, 21, Integer.valueOf(K0.size()), roVar, null, null);
                            }
                            cxVar.p4(false);
                            break;
                        }
                    } else if (i7 == 100 || i7 == 101 || i7 == 102 || i7 == 103 || i7 == 104 || i7 == 105 || i7 == 106 || i7 == 107 || i7 == 108) {
                        cxVar2.K4(cxVar2.K2, i7, true, false, null);
                        break;
                    }
                } else if (cxVar2.getParentActivity() != null) {
                    org.telegram.messenger.bz.x = true;
                    org.telegram.messenger.bz.y();
                    int[] iArr = new int[2];
                    cxVar2.g0.getLocationInWindow(iArr);
                    ((LaunchActivity) cxVar2.getParentActivity()).K0(false, true, (cxVar2.g0.getMeasuredWidth() / 2) + iArr[0], (cxVar2.g0.getMeasuredHeight() / 2) + iArr[1], new bh(this, 22));
                    cxVar2.getNotificationsController().Y();
                    cxVar2.K3();
                    break;
                }
                break;
            case 1:
                long j10 = 0;
                kx kxVar = (kx) obj2;
                int i15 = kxVar.x;
                ArrayList arrayList3 = kxVar.e;
                int i16 = kxVar.y;
                if (i7 == -1) {
                    if (kxVar.E == null) {
                        kxVar.d0();
                        break;
                    } else {
                        kxVar.finishFragment();
                        break;
                    }
                } else if (i7 == 1 && kxVar.getParentActivity() != null) {
                    ArrayList arrayList4 = new ArrayList();
                    int i17 = 0;
                    while (i17 < arrayList3.size()) {
                        arrayList4.add(org.telegram.messenger.sr.a(((Long) arrayList3.get(i17)).longValue(), j10));
                        i17++;
                        j10 = 0;
                    }
                    org.telegram.messenger.tr messagesStorage = kxVar.getMessagesStorage();
                    messagesStorage.a.c(new org.telegram.messenger.tp(messagesStorage, i16, arrayList4, i13));
                    SharedPreferences.Editor edit = kxVar.getParentActivity().getSharedPreferences("shortcut_widget", 0).edit();
                    i10 = ((org.telegram.ui.ActionBar.h2) kxVar).currentAccount;
                    edit.putInt("account" + i16, i10);
                    edit.putInt(TeXSymbolParser.TYPE_ATTR + i16, i15);
                    edit.commit();
                    AppWidgetManager appWidgetManager = AppWidgetManager.getInstance(kxVar.getParentActivity());
                    if (i15 == 0) {
                        ChatsWidgetProvider.a(kxVar.getParentActivity(), appWidgetManager, i16);
                    } else {
                        ContactsWidgetProvider.a(kxVar.getParentActivity(), appWidgetManager, i16);
                    }
                    gx gxVar = kxVar.E;
                    if (gxVar != null) {
                        gxVar.b();
                        break;
                    } else {
                        kxVar.d0();
                        break;
                    }
                }
                break;
            case 2:
                if (i7 == -1) {
                    ((rx) obj2).finishFragment();
                    break;
                }
                break;
            case 3:
                ky kyVar = (ky) obj2;
                if (i7 == -1) {
                    if (kyVar.b0(true)) {
                        kyVar.finishFragment();
                        break;
                    }
                } else if (i7 == 1) {
                    kyVar.h0();
                    break;
                }
                break;
            case 4:
                kz kzVar = (kz) obj2;
                if (i7 == -1) {
                    if (kzVar.n0(true)) {
                        kzVar.finishFragment();
                        break;
                    }
                } else if (i7 == 1) {
                    kzVar.w0();
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
                    ((s00) obj2).finishFragment();
                    break;
                }
                break;
            case 7:
                z40 z40Var = (z40) obj2;
                if (i7 == -1) {
                    if (z40Var.k0(true)) {
                        z40Var.finishFragment();
                        break;
                    }
                } else if (i7 == 1) {
                    z40Var.t0();
                    break;
                }
                break;
            case 8:
                if (i7 == -1) {
                    ((f50) obj2).finishFragment();
                    break;
                }
                break;
            case 9:
                if (i7 == -1) {
                    ((h50) obj2).finishFragment();
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
                                    org.telegram.ui.ActionBar.u1 u1Var2 = j90Var.U;
                                    if (u1Var2 != null) {
                                        u1Var2.dismiss();
                                    }
                                    j90Var.V = true;
                                    org.telegram.ui.ActionBar.u1 u1Var3 = new org.telegram.ui.ActionBar.u1(3, j90Var.getParentActivity(), null);
                                    j90Var.U = u1Var3;
                                    u1Var3.r(500L);
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
                                                                    org.telegram.ui.ActionBar.u1 u1Var4 = j90Var3.U;
                                                                    if (u1Var4 != null) {
                                                                        u1Var4.dismiss();
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
                                                                    org.telegram.ui.ActionBar.u1 u1Var5 = j90Var4.U;
                                                                    if (u1Var5 != null) {
                                                                        u1Var5.dismiss();
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
                                                                    org.telegram.ui.ActionBar.u1 u1Var4 = j90Var32.U;
                                                                    if (u1Var4 != null) {
                                                                        u1Var4.dismiss();
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
                                                                    org.telegram.ui.ActionBar.u1 u1Var5 = j90Var4.U;
                                                                    if (u1Var5 != null) {
                                                                        u1Var5.dismiss();
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
                                    org.telegram.ui.ActionBar.u1 u1Var4 = j90Var.U;
                                    if (u1Var4 != null) {
                                        u1Var4.dismiss();
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
                                            org.telegram.ui.ActionBar.u1 u1Var5 = new org.telegram.ui.ActionBar.u1(3, j90Var.getParentActivity(), null);
                                            j90Var.U = u1Var5;
                                            u1Var5.r(500L);
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
                                                                            org.telegram.ui.ActionBar.u1 u1Var42 = j90Var32.U;
                                                                            if (u1Var42 != null) {
                                                                                u1Var42.dismiss();
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
                                                                            org.telegram.ui.ActionBar.u1 u1Var52 = j90Var4.U;
                                                                            if (u1Var52 != null) {
                                                                                u1Var52.dismiss();
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
                                                                            org.telegram.ui.ActionBar.u1 u1Var42 = j90Var32.U;
                                                                            if (u1Var42 != null) {
                                                                                u1Var42.dismiss();
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
                                                                            org.telegram.ui.ActionBar.u1 u1Var52 = j90Var4.U;
                                                                            if (u1Var52 != null) {
                                                                                u1Var52.dismiss();
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
                    ((ff0) obj2).finishFragment();
                    break;
                }
                break;
            case 19:
                if (i7 == -1) {
                    ((bi.z8) obj2).finishFragment();
                    break;
                }
                break;
            case 20:
                ng0 ng0Var = (ng0) obj2;
                if (i7 == -1) {
                    ng0Var.finishFragment();
                    break;
                } else if (i7 == 1) {
                    Bundle bundle = new Bundle();
                    bundle.putLong("chat_id", ng0Var.b);
                    ng0Var.presentFragment(new c51(bundle));
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
                qm0 qm0Var = (qm0) obj2;
                if (i7 == -1) {
                    qm0Var.finishFragment();
                    break;
                } else if (i7 == 1) {
                    if (qm0Var.W != null) {
                        qm0Var.finishFragment(false);
                        qm0Var.W.p();
                        break;
                    }
                } else if (i7 == 2) {
                    qm0.Z(qm0Var, null);
                    break;
                }
                break;
            case 26:
                tm0 tm0Var = (tm0) obj2;
                if (i7 == -1) {
                    tm0Var.finishFragment();
                    break;
                } else if (i7 == 1) {
                    if (tm0Var.c != null && !tm0Var.f) {
                        rm0 rm0Var = tm0Var.d;
                        float f10 = rm0Var.f - rm0Var.y;
                        float f11 = rm0Var.w;
                        float f12 = f10 / f11;
                        float f13 = (rm0Var.h - rm0Var.E) / rm0Var.x;
                        float f14 = rm0Var.d / f11;
                        float f15 = rm0Var.e / f11;
                        tm0 tm0Var2 = rm0Var.I;
                        int width = (int) (f12 * tm0Var2.a.getWidth());
                        int height = (int) (f13 * tm0Var2.a.getHeight());
                        int width2 = (int) (f14 * tm0Var2.a.getWidth());
                        int width3 = (int) (f15 * tm0Var2.a.getWidth());
                        int i19 = width < 0 ? 0 : width;
                        int i20 = height < 0 ? 0 : height;
                        if (i19 + width2 > tm0Var2.a.getWidth()) {
                            width2 = tm0Var2.a.getWidth() - i19;
                        }
                        int i21 = width2;
                        if (i20 + width3 > tm0Var2.a.getHeight()) {
                            width3 = tm0Var2.a.getHeight() - i20;
                        }
                        int i22 = width3;
                        try {
                            bitmap = Bitmap.createBitmap(tm0Var2.a, i19, i20, i21, i22, (Matrix) null, false);
                        } catch (Throwable th2) {
                            org.telegram.messenger.a8.g(th2, true);
                            System.gc();
                            try {
                                bitmap = Bitmap.createBitmap(tm0Var2.a, i19, i20, i21, i22, (Matrix) null, false);
                            } catch (Throwable th3) {
                                org.telegram.messenger.a8.g(th3, true);
                                bitmap = null;
                            }
                        }
                        if (bitmap == tm0Var.a) {
                            tm0Var.e = true;
                        }
                        ((org.telegram.ui.Components.u30) tm0Var.c).r(false, bitmap, null);
                        tm0Var.f = true;
                    }
                    tm0Var.finishFragment();
                    break;
                }
                break;
            case 27:
                cn0 cn0Var = (cn0) obj2;
                if (i7 == -1) {
                    cn0Var.finishFragment();
                    break;
                } else if (i7 == 1) {
                    boolean z18 = cn0Var.Z;
                    cn0Var.Z = !z18;
                    if (z18) {
                        cn0Var.L.setPadding(org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(50.0f));
                    } else {
                        cn0Var.L.setPadding(0, 0, 0, org.telegram.messenger.g0.L(48.0f));
                    }
                    cn0Var.L.C0();
                    cn0Var.N.h1(0, 0);
                    cn0Var.M.f();
                    break;
                } else if (i7 == 2) {
                    bn0 bn0Var = cn0Var.t0;
                    if (bn0Var != null) {
                        bn0Var.b0();
                    }
                    cn0Var.finishFragment();
                    break;
                }
                break;
            case 28:
                if (i7 == -1) {
                    ((fn0) obj2).finishFragment();
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
