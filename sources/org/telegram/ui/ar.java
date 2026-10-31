package org.telegram.ui;

import android.appwidget.AppWidgetManager;
import android.content.Intent;
import android.content.SharedPreferences;
import android.text.SpannableStringBuilder;
import android.view.ViewPropertyAnimator;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashMap;
import org.scilab.forge.jlatexmath.TeXSymbolParser;
import org.telegram.messenger.ChatsWidgetProvider;
import org.telegram.messenger.ContactsWidgetProvider;
import org.telegram.messenger.beta.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class ar extends org.telegram.ui.ActionBar.k {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ar(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.ui.ActionBar.k
    public final void b(int i10) {
        Runnable runnable;
        org.telegram.ui.ActionBar.i5 i5Var;
        kx kxVar;
        org.telegram.ui.ActionBar.l lVar;
        org.telegram.ui.ActionBar.l lVar2;
        int i11;
        int i12 = this.a;
        int i13 = 0;
        int i14 = 1;
        Object obj = this.b;
        switch (i12) {
            case 0:
                pr prVar = (pr) obj;
                if (i10 == -1) {
                    if (prVar.k0(true)) {
                        prVar.finishFragment();
                        break;
                    }
                } else if (i10 == 1) {
                    prVar.y0();
                    break;
                }
                break;
            case 1:
                org.telegram.ui.Components.w7 w7Var = (org.telegram.ui.Components.w7) obj;
                if (i10 == -1) {
                    w7Var.dismiss();
                    break;
                } else {
                    w7Var.P0(i10);
                    break;
                }
            case 2:
                if (i10 == -1) {
                    ((org.telegram.ui.Components.ha) obj).dismiss();
                    break;
                }
                break;
            case 3:
                org.telegram.ui.Components.bi biVar = (org.telegram.ui.Components.bi) obj;
                if (i10 != -1) {
                    biVar.s2.w(i10);
                    break;
                } else if (!biVar.s2.j()) {
                    biVar.dismiss();
                    break;
                }
                break;
            case 4:
                if (i10 == -1) {
                    ((org.telegram.ui.Components.j30) obj).finishFragment();
                    break;
                }
                break;
            case 5:
                org.telegram.ui.Components.n90 n90Var = (org.telegram.ui.Components.n90) obj;
                if (i10 != -1) {
                    if (i10 == 10) {
                        org.telegram.ui.Components.m90 m90Var = n90Var.R;
                        m90Var.m1(m90Var.getClosestTab(), false);
                        break;
                    }
                } else if (!n90Var.R.T(true)) {
                    n90Var.finishFragment();
                    break;
                }
                break;
            case 6:
                if (i10 == -1 && (runnable = ((org.telegram.ui.Components.pe0) obj).r) != null) {
                    org.telegram.messenger.i0.g3(runnable);
                    break;
                }
                break;
            case 7:
                if (i10 == -1) {
                    ((org.telegram.ui.Components.tf0) obj).dismiss();
                    break;
                }
                break;
            case 8:
                ((org.telegram.ui.Components.op0) obj).onBackPressed();
                break;
            case 9:
                if (i10 == -1) {
                    ((org.telegram.ui.Components.r51) obj).finishFragment();
                    break;
                }
                break;
            case 10:
                if (i10 == -1) {
                    ((org.telegram.ui.Components.voip.e0) obj).b(false, false);
                    break;
                }
                break;
            case 11:
                if (i10 == -1) {
                    ((ud1) obj).a(false, false);
                    break;
                }
                break;
            case 12:
                ContactsActivity contactsActivity = (ContactsActivity) obj;
                if (i10 == -1) {
                    i5Var = ((org.telegram.ui.ActionBar.k2) contactsActivity).simpleActionBar;
                    if (i5Var.s()) {
                        contactsActivity.l0();
                        break;
                    } else {
                        contactsActivity.finishFragment();
                        break;
                    }
                } else if (i10 == 100) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, contactsActivity.getParentActivity(), contactsActivity.getResourceProvider());
                    a0.h hVar = contactsActivity.Z;
                    int m10 = hVar.m();
                    org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
                    if (m10 == 1) {
                        x1Var.R = org.telegram.messenger.cd.L0(2131751551, null);
                        x1Var.T = org.telegram.messenger.cd.L0(2131751552, null);
                    } else {
                        x1Var.R = org.telegram.messenger.cd.G(hVar.m(), "DeleteContactsTitle", new Object[0]);
                        x1Var.T = org.telegram.messenger.cd.L0(2131751550, null);
                    }
                    alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131751599, null), new qs(contactsActivity));
                    alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131752589, null), new org.telegram.ui.Components.z11(6));
                    x1Var.show();
                    x1Var.i();
                    break;
                } else if (i10 == 1) {
                    org.telegram.messenger.tz.L0 = !org.telegram.messenger.tz.L0;
                    SharedPreferences.Editor edit = org.telegram.messenger.vp.d1().edit();
                    edit.putBoolean("sortContactsByName", org.telegram.messenger.tz.L0);
                    edit.apply();
                    contactsActivity.r = org.telegram.messenger.tz.L0;
                    org.telegram.ui.ActionBar.p5 p5Var = contactsActivity.n;
                    if (p5Var != null) {
                        org.telegram.messenger.i0.Q3(p5Var.getIconView(), contactsActivity.r ? R.drawable.msg_contacts_time : R.drawable.msg_contacts_name);
                    }
                    ViewPropertyAnimator viewPropertyAnimator = contactsActivity.e0;
                    if (viewPropertyAnimator != null) {
                        viewPropertyAnimator.cancel();
                    }
                    contactsActivity.a.b();
                    ViewPropertyAnimator withEndAction = contactsActivity.d.animate().alpha(0.0f).setDuration(120L).setInterpolator(org.telegram.ui.Components.gr.g).withEndAction(new ps(contactsActivity, i13));
                    contactsActivity.e0 = withEndAction;
                    withEndAction.start();
                    break;
                }
                break;
            case 13:
                if (i10 == -1) {
                    ((rt) obj).finishFragment();
                    break;
                }
                break;
            case 14:
                if (i10 == -1) {
                    ((DataAutoDownloadActivity) obj).finishFragment();
                    break;
                }
                break;
            case 15:
                if (i10 == -1) {
                    ((DataSettingsActivity) obj).finishFragment();
                    break;
                }
                break;
            case 16:
                if (i10 == -1) {
                    ((mu) obj).finishFragment();
                    break;
                }
                break;
            case 17:
                if (i10 == -1) {
                    ((dv) obj).finishFragment();
                    break;
                }
                break;
            case 18:
                ay ayVar = (ay) obj;
                ArrayList arrayList = ayVar.I2;
                if ((i10 == 201 || i10 == 200 || i10 == 202 || i10 == 203) && (kxVar = ayVar.C0) != null) {
                    HashMap hashMap = kxVar.B0;
                    ay ayVar2 = kxVar.L0;
                    int i15 = 18;
                    if (i10 != 202) {
                        if (i10 != 203) {
                            if (i10 != 200) {
                                if (i10 == 201) {
                                    ay ayVar3 = new ay(org.telegram.ui.Cells.f1.j(3, "onlySelect", "dialogsType", true));
                                    ayVar3.C2 = new org.telegram.ui.Components.px(kxVar, i15);
                                    ayVar2.presentFragment(ayVar3);
                                    break;
                                }
                            } else if (hashMap.size() == 1) {
                                kxVar.c((org.telegram.messenger.jj) hashMap.values().iterator().next());
                                break;
                            }
                        } else if (kxVar.O()) {
                            ayVar2.showDialog(new kg.i1((org.telegram.ui.ActionBar.k2) ayVar2, 2, true));
                            break;
                        }
                    } else if (ayVar2 != null && ayVar2.getParentActivity() != null) {
                        ArrayList arrayList2 = new ArrayList(hashMap.values());
                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(ayVar2.getParentActivity());
                        String G = org.telegram.messenger.cd.G(hashMap.size(), "RemoveDocumentsTitle", new Object[0]);
                        org.telegram.ui.ActionBar.x1 x1Var2 = alertDialog$Builder2.a;
                        x1Var2.R = G;
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                        spannableStringBuilder.append((CharSequence) org.telegram.messenger.i0.W2(org.telegram.messenger.cd.G(hashMap.size(), "RemoveDocumentsMessage", new Object[0]))).append((CharSequence) "\n\n").append((CharSequence) org.telegram.messenger.cd.L0(2131746334, null));
                        x1Var2.T = spannableStringBuilder;
                        alertDialog$Builder2.h(org.telegram.messenger.cd.L0(2131752589, null), new org.telegram.ui.Components.au(i15));
                        alertDialog$Builder2.k(org.telegram.messenger.cd.L0(2131751599, null), new org.telegram.ui.Components.f2(17, kxVar, arrayList2));
                        TextView textView = (TextView) alertDialog$Builder2.p().d(-1);
                        if (textView != null) {
                            org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.q7, null);
                            break;
                        }
                    }
                } else if (i10 == -1) {
                    xw xwVar = ayVar.F3;
                    if (xwVar == null || !xwVar.c()) {
                        qx qxVar = ayVar.z0;
                        if (qxVar == null || !qxVar.n) {
                            lVar = ((org.telegram.ui.ActionBar.k2) ayVar).actionBar;
                            if (lVar.u()) {
                                kx kxVar2 = ayVar.C0;
                                if (kxVar2 != null && kxVar2.getVisibility() == 0) {
                                    kx kxVar3 = ayVar.C0;
                                    if (kxVar3.A0) {
                                        kxVar3.R(false);
                                        break;
                                    }
                                }
                                ayVar.m4(true);
                                break;
                            } else if (ayVar.l2 || ayVar.W2 != 0 || ayVar.Y2 != 0) {
                                ayVar.finishFragment();
                                break;
                            }
                        } else {
                            qxVar.setIsEditing(false);
                            ayVar.T4(false);
                            break;
                        }
                    } else {
                        lVar2 = ((org.telegram.ui.ActionBar.k2) ayVar).actionBar;
                        if (lVar2.u()) {
                            kx kxVar4 = ayVar.C0;
                            if (kxVar4 != null && kxVar4.getVisibility() == 0) {
                                kx kxVar5 = ayVar.C0;
                                if (kxVar5.A0) {
                                    kxVar5.R(false);
                                    break;
                                }
                            }
                            ayVar.m4(true);
                            break;
                        } else {
                            ayVar.F3.a();
                            kx kxVar6 = ayVar.C0;
                            if (kxVar6 != null) {
                                kxVar6.S();
                                break;
                            }
                        }
                    }
                } else if (i10 != 1) {
                    if (i10 == 3) {
                        ayVar.Z4(true, true, true, false);
                        ayVar.Y.b(true);
                        break;
                    } else if (i10 == 11) {
                        ayVar.A4(ayVar.D1);
                        break;
                    } else if (i10 == 109) {
                        org.telegram.ui.Components.uz uzVar = new org.telegram.ui.Components.uz(ayVar, arrayList);
                        uzVar.q1 = new tt(this, 6);
                        ayVar.showDialog(uzVar);
                        break;
                    } else if (i10 == 110) {
                        org.telegram.messenger.ap apVar = (org.telegram.messenger.ap) ayVar.getMessagesController().S0().get(ayVar.e0[0].h);
                        ArrayList J0 = org.telegram.ui.Components.uz.J0(ayVar, apVar, arrayList, false, false);
                        if (J0.size() + (apVar != null ? apVar.i.size() : 0) > 100) {
                            ayVar.showDialog(org.telegram.ui.Components.s4.M(ayVar.getParentActivity(), org.telegram.messenger.cd.L0(2131750811, null), org.telegram.messenger.cd.L0(2131750812, null)).a);
                            break;
                        } else {
                            if (!J0.isEmpty()) {
                                apVar.i.addAll(J0);
                                for (int i16 = 0; i16 < J0.size(); i16++) {
                                    Long l4 = (Long) J0.get(i16);
                                    apVar.h.remove(l4);
                                    apVar.j.delete(l4.longValue());
                                }
                                if (apVar.d()) {
                                    apVar.i.clear();
                                }
                                i00.y0(apVar, apVar.g, apVar.b, apVar.c, apVar.n, apVar.m, apVar.h, apVar.i, apVar.j, false, false, true, false, false, ayVar, null);
                            }
                            long longValue = J0.size() == 1 ? ((Long) J0.get(0)).longValue() : 0L;
                            UndoView j42 = ayVar.j4();
                            if (j42 != null) {
                                j42.k(longValue, 21, Integer.valueOf(J0.size()), apVar, null, null);
                            }
                            ayVar.m4(false);
                            break;
                        }
                    } else if (i10 == 100 || i10 == 101 || i10 == 102 || i10 == 103 || i10 == 104 || i10 == 105 || i10 == 106 || i10 == 107 || i10 == 108) {
                        ayVar.C4(ayVar.I2, i10, true, false, null);
                        break;
                    }
                } else if (ayVar.getParentActivity() != null) {
                    org.telegram.messenger.tz.x = true;
                    org.telegram.messenger.tz.y();
                    int[] iArr = new int[2];
                    ayVar.f0.getLocationInWindow(iArr);
                    ((LaunchActivity) ayVar.getParentActivity()).K0(false, true, (ayVar.f0.getMeasuredWidth() / 2) + iArr[0], (ayVar.f0.getMeasuredHeight() / 2) + iArr[1], new rh(this, 23));
                    ayVar.getNotificationsController().Y();
                    ayVar.J3();
                    break;
                }
                break;
            case 19:
                iy iyVar = (iy) obj;
                int i17 = iyVar.x;
                ArrayList arrayList3 = iyVar.e;
                int i18 = iyVar.y;
                if (i10 == -1) {
                    if (iyVar.D == null) {
                        iyVar.c0();
                        break;
                    } else {
                        iyVar.finishFragment();
                        break;
                    }
                } else if (i10 == 1 && iyVar.getParentActivity() != null) {
                    ArrayList arrayList4 = new ArrayList();
                    for (int i19 = 0; i19 < arrayList3.size(); i19++) {
                        arrayList4.add(org.telegram.messenger.gs.a(((Long) arrayList3.get(i19)).longValue(), 0L));
                    }
                    org.telegram.messenger.hs messagesStorage = iyVar.getMessagesStorage();
                    messagesStorage.a.c(new org.telegram.messenger.zp(messagesStorage, i18, arrayList4, i14));
                    SharedPreferences.Editor edit2 = iyVar.getParentActivity().getSharedPreferences("shortcut_widget", 0).edit();
                    i11 = ((org.telegram.ui.ActionBar.k2) iyVar).currentAccount;
                    edit2.putInt("account" + i18, i11);
                    edit2.putInt(TeXSymbolParser.TYPE_ATTR + i18, i17);
                    edit2.commit();
                    AppWidgetManager appWidgetManager = AppWidgetManager.getInstance(iyVar.getParentActivity());
                    if (i17 == 0) {
                        ChatsWidgetProvider.a(iyVar.getParentActivity(), appWidgetManager, i18);
                    } else {
                        ContactsWidgetProvider.a(iyVar.getParentActivity(), appWidgetManager, i18);
                    }
                    y0 y0Var = iyVar.D;
                    if (y0Var != null) {
                        int i20 = y0Var.a;
                        Object obj2 = y0Var.b;
                        switch (i20) {
                            case 27:
                                ChatsWidgetConfigActivity chatsWidgetConfigActivity = (ChatsWidgetConfigActivity) obj2;
                                int i21 = ChatsWidgetConfigActivity.F;
                                Intent intent = new Intent();
                                intent.putExtra("appWidgetId", chatsWidgetConfigActivity.E);
                                chatsWidgetConfigActivity.setResult(-1, intent);
                                chatsWidgetConfigActivity.finish();
                                break;
                            default:
                                ContactsWidgetConfigActivity contactsWidgetConfigActivity = (ContactsWidgetConfigActivity) obj2;
                                int i22 = ContactsWidgetConfigActivity.F;
                                Intent intent2 = new Intent();
                                intent2.putExtra("appWidgetId", contactsWidgetConfigActivity.E);
                                contactsWidgetConfigActivity.setResult(-1, intent2);
                                contactsWidgetConfigActivity.finish();
                                break;
                        }
                    } else {
                        iyVar.c0();
                        break;
                    }
                }
                break;
            case 20:
                if (i10 == -1) {
                    ((qy) obj).finishFragment();
                    break;
                }
                break;
            case 21:
                iz izVar = (iz) obj;
                if (i10 == -1) {
                    if (izVar.a0(true)) {
                        izVar.finishFragment();
                        break;
                    }
                } else if (i10 == 1) {
                    izVar.g0();
                    break;
                }
                break;
            case 22:
                i00 i00Var = (i00) obj;
                if (i10 == -1) {
                    if (i00Var.m0(true)) {
                        i00Var.finishFragment();
                        break;
                    }
                } else if (i10 == 1) {
                    i00Var.v0();
                    break;
                }
                break;
            case 23:
                if (i10 == -1) {
                    ((FiltersSetupActivity) obj).finishFragment();
                    break;
                }
                break;
            case 24:
                if (i10 == -1) {
                    ((p10) obj).finishFragment();
                    break;
                }
                break;
            case 25:
                v50 v50Var = (v50) obj;
                if (i10 == -1) {
                    if (v50Var.j0(true)) {
                        v50Var.finishFragment();
                        break;
                    }
                } else if (i10 == 1) {
                    v50Var.s0();
                    break;
                }
                break;
            case 26:
                if (i10 == -1) {
                    ((c60) obj).finishFragment();
                    break;
                }
                break;
            case 27:
                if (i10 == -1) {
                    ((e60) obj).finishFragment();
                    break;
                }
                break;
            case 28:
                if (i10 == -1) {
                    ((k60) obj).finishFragment();
                    break;
                }
                break;
            default:
                if (i10 == -1) {
                    ((n60) obj).finishFragment();
                    break;
                }
                break;
        }
    }
}
