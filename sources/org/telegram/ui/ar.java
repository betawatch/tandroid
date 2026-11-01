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

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
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
        jx jxVar;
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
                    if (prVar.l0(true)) {
                        prVar.finishFragment();
                        break;
                    }
                } else if (i10 == 1) {
                    prVar.z0();
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
                        m90Var.n1(m90Var.getClosestTab(), false);
                        break;
                    }
                } else if (!n90Var.R.U(true)) {
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
                ((org.telegram.ui.Components.pp0) obj).onBackPressed();
                break;
            case 9:
                if (i10 == -1) {
                    ((org.telegram.ui.Components.s51) obj).finishFragment();
                    break;
                }
                break;
            case 10:
                if (i10 == -1) {
                    ((org.telegram.ui.Components.voip.f0) obj).b(false, false);
                    break;
                }
                break;
            case 11:
                if (i10 == -1) {
                    ((sd1) obj).a(false, false);
                    break;
                }
                break;
            case 12:
                ContactsActivity contactsActivity = (ContactsActivity) obj;
                if (i10 == -1) {
                    i5Var = ((org.telegram.ui.ActionBar.k2) contactsActivity).simpleActionBar;
                    if (i5Var.s()) {
                        contactsActivity.m0();
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
                        x1Var.R = org.telegram.messenger.dd.L0(2131751551, null);
                        x1Var.T = org.telegram.messenger.dd.L0(2131751552, null);
                    } else {
                        x1Var.R = org.telegram.messenger.dd.G(hVar.m(), "DeleteContactsTitle", new Object[0]);
                        x1Var.T = org.telegram.messenger.dd.L0(2131751550, null);
                    }
                    alertDialog$Builder.k(org.telegram.messenger.dd.L0(2131751599, null), new qs(contactsActivity));
                    alertDialog$Builder.h(org.telegram.messenger.dd.L0(2131752589, null), new org.telegram.ui.Components.a21(6));
                    x1Var.show();
                    x1Var.i();
                    break;
                } else if (i10 == 1) {
                    org.telegram.messenger.uz.L0 = !org.telegram.messenger.uz.L0;
                    SharedPreferences.Editor edit = org.telegram.messenger.wp.d1().edit();
                    edit.putBoolean("sortContactsByName", org.telegram.messenger.uz.L0);
                    edit.apply();
                    contactsActivity.r = org.telegram.messenger.uz.L0;
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
                    ((qt) obj).finishFragment();
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
                    ((lu) obj).finishFragment();
                    break;
                }
                break;
            case 17:
                if (i10 == -1) {
                    ((cv) obj).finishFragment();
                    break;
                }
                break;
            case 18:
                zx zxVar = (zx) obj;
                ArrayList arrayList = zxVar.I2;
                if ((i10 == 201 || i10 == 200 || i10 == 202 || i10 == 203) && (jxVar = zxVar.C0) != null) {
                    HashMap hashMap = jxVar.B0;
                    zx zxVar2 = jxVar.L0;
                    int i15 = 18;
                    if (i10 != 202) {
                        if (i10 != 203) {
                            if (i10 != 200) {
                                if (i10 == 201) {
                                    zx zxVar3 = new zx(org.telegram.ui.Cells.f1.j(3, "onlySelect", "dialogsType", true));
                                    zxVar3.C2 = new org.telegram.ui.Components.px(jxVar, i15);
                                    zxVar2.presentFragment(zxVar3);
                                    break;
                                }
                            } else if (hashMap.size() == 1) {
                                jxVar.c((org.telegram.messenger.kj) hashMap.values().iterator().next());
                                break;
                            }
                        } else if (jxVar.O()) {
                            zxVar2.showDialog(new kg.i1((org.telegram.ui.ActionBar.k2) zxVar2, 2, true));
                            break;
                        }
                    } else if (zxVar2 != null && zxVar2.getParentActivity() != null) {
                        ArrayList arrayList2 = new ArrayList(hashMap.values());
                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(zxVar2.getParentActivity());
                        String G = org.telegram.messenger.dd.G(hashMap.size(), "RemoveDocumentsTitle", new Object[0]);
                        org.telegram.ui.ActionBar.x1 x1Var2 = alertDialog$Builder2.a;
                        x1Var2.R = G;
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                        spannableStringBuilder.append((CharSequence) org.telegram.messenger.i0.W2(org.telegram.messenger.dd.G(hashMap.size(), "RemoveDocumentsMessage", new Object[0]))).append((CharSequence) "\n\n").append((CharSequence) org.telegram.messenger.dd.L0(2131746334, null));
                        x1Var2.T = spannableStringBuilder;
                        alertDialog$Builder2.h(org.telegram.messenger.dd.L0(2131752589, null), new org.telegram.ui.Components.au(18));
                        alertDialog$Builder2.k(org.telegram.messenger.dd.L0(2131751599, null), new org.telegram.ui.Components.f2(17, jxVar, arrayList2));
                        TextView textView = (TextView) alertDialog$Builder2.p().d(-1);
                        if (textView != null) {
                            org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.q7, null);
                            break;
                        }
                    }
                } else if (i10 == -1) {
                    ww wwVar = zxVar.F3;
                    if (wwVar == null || !wwVar.c()) {
                        px pxVar = zxVar.z0;
                        if (pxVar == null || !pxVar.n) {
                            lVar = ((org.telegram.ui.ActionBar.k2) zxVar).actionBar;
                            if (lVar.u()) {
                                jx jxVar2 = zxVar.C0;
                                if (jxVar2 != null && jxVar2.getVisibility() == 0) {
                                    jx jxVar3 = zxVar.C0;
                                    if (jxVar3.A0) {
                                        jxVar3.R(false);
                                        break;
                                    }
                                }
                                zxVar.n4(true);
                                break;
                            } else if (zxVar.l2 || zxVar.W2 != 0 || zxVar.Y2 != 0) {
                                zxVar.finishFragment();
                                break;
                            }
                        } else {
                            pxVar.setIsEditing(false);
                            zxVar.U4(false);
                            break;
                        }
                    } else {
                        lVar2 = ((org.telegram.ui.ActionBar.k2) zxVar).actionBar;
                        if (lVar2.u()) {
                            jx jxVar4 = zxVar.C0;
                            if (jxVar4 != null && jxVar4.getVisibility() == 0) {
                                jx jxVar5 = zxVar.C0;
                                if (jxVar5.A0) {
                                    jxVar5.R(false);
                                    break;
                                }
                            }
                            zxVar.n4(true);
                            break;
                        } else {
                            zxVar.F3.a();
                            jx jxVar6 = zxVar.C0;
                            if (jxVar6 != null) {
                                jxVar6.S();
                                break;
                            }
                        }
                    }
                } else if (i10 != 1) {
                    if (i10 == 3) {
                        zxVar.a5(true, true, true, false);
                        zxVar.Y.b(true);
                        break;
                    } else if (i10 == 11) {
                        zxVar.B4(zxVar.D1);
                        break;
                    } else if (i10 == 109) {
                        org.telegram.ui.Components.uz uzVar = new org.telegram.ui.Components.uz(zxVar, arrayList);
                        uzVar.q1 = new st(this, 6);
                        zxVar.showDialog(uzVar);
                        break;
                    } else if (i10 == 110) {
                        org.telegram.messenger.bp bpVar = (org.telegram.messenger.bp) zxVar.getMessagesController().S0().get(zxVar.e0[0].h);
                        ArrayList J0 = org.telegram.ui.Components.uz.J0(zxVar, bpVar, arrayList, false, false);
                        if (J0.size() + (bpVar != null ? bpVar.i.size() : 0) > 100) {
                            zxVar.showDialog(org.telegram.ui.Components.s4.M(zxVar.getParentActivity(), org.telegram.messenger.dd.L0(2131750811, null), org.telegram.messenger.dd.L0(2131750812, null)).a);
                            break;
                        } else {
                            if (!J0.isEmpty()) {
                                bpVar.i.addAll(J0);
                                for (int i16 = 0; i16 < J0.size(); i16++) {
                                    Long l4 = (Long) J0.get(i16);
                                    bpVar.h.remove(l4);
                                    bpVar.j.delete(l4.longValue());
                                }
                                if (bpVar.d()) {
                                    bpVar.i.clear();
                                }
                                h00.z0(bpVar, bpVar.g, bpVar.b, bpVar.c, bpVar.n, bpVar.m, bpVar.h, bpVar.i, bpVar.j, false, false, true, false, false, zxVar, null);
                            }
                            long longValue = J0.size() == 1 ? ((Long) J0.get(0)).longValue() : 0L;
                            UndoView k42 = zxVar.k4();
                            if (k42 != null) {
                                k42.k(longValue, 21, Integer.valueOf(J0.size()), bpVar, null, null);
                            }
                            zxVar.n4(false);
                            break;
                        }
                    } else if (i10 == 100 || i10 == 101 || i10 == 102 || i10 == 103 || i10 == 104 || i10 == 105 || i10 == 106 || i10 == 107 || i10 == 108) {
                        zxVar.D4(zxVar.I2, i10, true, false, null);
                        break;
                    }
                } else if (zxVar.getParentActivity() != null) {
                    org.telegram.messenger.uz.x = true;
                    org.telegram.messenger.uz.y();
                    int[] iArr = new int[2];
                    zxVar.f0.getLocationInWindow(iArr);
                    ((LaunchActivity) zxVar.getParentActivity()).K0(false, true, (zxVar.f0.getMeasuredWidth() / 2) + iArr[0], (zxVar.f0.getMeasuredHeight() / 2) + iArr[1], new rh(this, 23));
                    zxVar.getNotificationsController().Y();
                    zxVar.K3();
                    break;
                }
                break;
            case 19:
                hy hyVar = (hy) obj;
                int i17 = hyVar.x;
                ArrayList arrayList3 = hyVar.e;
                int i18 = hyVar.y;
                if (i10 == -1) {
                    if (hyVar.D == null) {
                        hyVar.d0();
                        break;
                    } else {
                        hyVar.finishFragment();
                        break;
                    }
                } else if (i10 == 1 && hyVar.getParentActivity() != null) {
                    ArrayList arrayList4 = new ArrayList();
                    for (int i19 = 0; i19 < arrayList3.size(); i19++) {
                        arrayList4.add(org.telegram.messenger.hs.a(((Long) arrayList3.get(i19)).longValue(), 0L));
                    }
                    org.telegram.messenger.is messagesStorage = hyVar.getMessagesStorage();
                    messagesStorage.a.c(new org.telegram.messenger.aq(messagesStorage, i18, arrayList4, i14));
                    SharedPreferences.Editor edit2 = hyVar.getParentActivity().getSharedPreferences("shortcut_widget", 0).edit();
                    i11 = ((org.telegram.ui.ActionBar.k2) hyVar).currentAccount;
                    edit2.putInt("account" + i18, i11);
                    edit2.putInt(TeXSymbolParser.TYPE_ATTR + i18, i17);
                    edit2.commit();
                    AppWidgetManager appWidgetManager = AppWidgetManager.getInstance(hyVar.getParentActivity());
                    if (i17 == 0) {
                        ChatsWidgetProvider.a(hyVar.getParentActivity(), appWidgetManager, i18);
                    } else {
                        ContactsWidgetProvider.a(hyVar.getParentActivity(), appWidgetManager, i18);
                    }
                    y0 y0Var = hyVar.D;
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
                        hyVar.d0();
                        break;
                    }
                }
                break;
            case 20:
                if (i10 == -1) {
                    ((py) obj).finishFragment();
                    break;
                }
                break;
            case 21:
                hz hzVar = (hz) obj;
                if (i10 == -1) {
                    if (hzVar.b0(true)) {
                        hzVar.finishFragment();
                        break;
                    }
                } else if (i10 == 1) {
                    hzVar.h0();
                    break;
                }
                break;
            case 22:
                h00 h00Var = (h00) obj;
                if (i10 == -1) {
                    if (h00Var.n0(true)) {
                        h00Var.finishFragment();
                        break;
                    }
                } else if (i10 == 1) {
                    h00Var.w0();
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
                    ((o10) obj).finishFragment();
                    break;
                }
                break;
            case 25:
                u50 u50Var = (u50) obj;
                if (i10 == -1) {
                    if (u50Var.k0(true)) {
                        u50Var.finishFragment();
                        break;
                    }
                } else if (i10 == 1) {
                    u50Var.t0();
                    break;
                }
                break;
            case 26:
                if (i10 == -1) {
                    ((b60) obj).finishFragment();
                    break;
                }
                break;
            case 27:
                if (i10 == -1) {
                    ((d60) obj).finishFragment();
                    break;
                }
                break;
            case 28:
                if (i10 == -1) {
                    ((j60) obj).finishFragment();
                    break;
                }
                break;
            default:
                if (i10 == -1) {
                    ((m60) obj).finishFragment();
                    break;
                }
                break;
        }
    }
}
