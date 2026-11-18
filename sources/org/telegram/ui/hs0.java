package org.telegram.ui;

import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class hs0 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ hs0(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i7) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        int i10;
        org.telegram.messenger.fj fjVar;
        org.telegram.ui.ActionBar.k kVar3;
        org.telegram.ui.ActionBar.k kVar4;
        org.telegram.ui.ActionBar.k kVar5;
        org.telegram.ui.ActionBar.k kVar6;
        int i11 = this.a;
        org.telegram.ui.ActionBar.j jVar = null;
        boolean z10 = true;
        char c10 = 1;
        Object obj = this.b;
        switch (i11) {
            case 0:
                is0 is0Var = (is0) obj;
                if (i7 != -1) {
                    if (i7 == 1) {
                        is0Var.d0();
                        break;
                    }
                } else if (is0Var.onBackPressed(true)) {
                    is0Var.finishFragment();
                    break;
                }
                break;
            case 1:
                if (i7 == -1) {
                    ((PremiumPreviewFragment) obj).finishFragment();
                    break;
                }
                break;
            case 2:
                PrivacyControlActivity privacyControlActivity = (PrivacyControlActivity) obj;
                if (i7 != -1) {
                    if (i7 == 1) {
                        privacyControlActivity.K0();
                        break;
                    }
                } else if (privacyControlActivity.G0(true)) {
                    privacyControlActivity.finishFragment();
                    break;
                }
                break;
            case 3:
                if (i7 == -1) {
                    ((PrivacySettingsActivity) obj).finishFragment();
                    break;
                }
                break;
            case 4:
                if (i7 == -1) {
                    ((st0) obj).finishFragment();
                    break;
                }
                break;
            case 5:
                ProfileActivity profileActivity = (ProfileActivity) obj;
                if (i7 == -1) {
                    vv0 vv0Var = profileActivity.O;
                    if (vv0Var == null || !vv0Var.V(true)) {
                        if (!profileActivity.J0) {
                            profileActivity.finishFragment();
                            break;
                        } else {
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", profileActivity.f1);
                            bundle.putLong("user_id", profileActivity.e1);
                            profileActivity.presentFragment(new ci.j0(bundle));
                            break;
                        }
                    }
                } else {
                    kVar = ((org.telegram.ui.ActionBar.h2) profileActivity).actionBar;
                    if (kVar != null) {
                        kVar2 = ((org.telegram.ui.ActionBar.h2) profileActivity).actionBar;
                        jVar = kVar2.getActionBarMenuOnItemClick();
                    }
                    if (jVar != null) {
                        jVar.b(i7);
                        break;
                    }
                }
                break;
            case 6:
                if (i7 == -1) {
                    ((ProxyListActivity) obj).finishFragment();
                    break;
                }
                break;
            case 7:
                yx0 yx0Var = (yx0) obj;
                boolean z11 = yx0Var.J;
                org.telegram.messenger.az azVar = yx0Var.K;
                if (i7 != -1) {
                    if (i7 == 1 && yx0Var.getParentActivity() != null) {
                        n2.o0 a10 = xi.a.a();
                        a10.p(yx0Var.w);
                        String obj2 = yx0Var.a[0].getText().toString();
                        if (obj2 == null) {
                            obj2 = "";
                        }
                        a10.c = obj2;
                        a10.b = yx0Var.w == 3 ? 0 : Utilities.z(yx0Var.a[1].getText().toString()).intValue();
                        String obj3 = yx0Var.w == 1 ? yx0Var.a[2].getText().toString() : "";
                        if (obj3 == null) {
                            obj3 = "";
                        }
                        a10.d = obj3;
                        String obj4 = yx0Var.w == 1 ? yx0Var.a[3].getText().toString() : "";
                        if (obj4 == null) {
                            obj4 = "";
                        }
                        a10.e = obj4;
                        String obj5 = yx0Var.w != 1 ? yx0Var.a[4].getText().toString() : "";
                        a10.f = obj5 != null ? obj5 : "";
                        azVar.a = a10.d();
                        SharedPreferences g12 = org.telegram.messenger.mp.g1();
                        SharedPreferences.Editor edit = g12.edit();
                        if (z11) {
                            org.telegram.messenger.bz.a(azVar);
                            org.telegram.messenger.bz.B1 = azVar;
                            edit.putBoolean("proxy_enabled", true);
                        } else {
                            z10 = g12.getBoolean("proxy_enabled", false);
                            org.telegram.messenger.bz.z();
                        }
                        if (z11 || org.telegram.messenger.bz.B1 == azVar) {
                            azVar.a.i(edit);
                            ConnectionsManager.setProxySettings(z10, azVar.a);
                        }
                        edit.commit();
                        org.telegram.messenger.ks.e().k(org.telegram.messenger.ks.C4, new Object[0]);
                        yx0Var.finishFragment();
                        break;
                    }
                } else {
                    yx0Var.finishFragment();
                    break;
                }
                break;
            case 8:
                if (i7 == -1) {
                    ((ey0) obj).finishFragment();
                    break;
                }
                break;
            case 9:
                if (i7 == -1) {
                    ((sy0) obj).finishFragment();
                    break;
                }
                break;
            case 10:
                if (i7 == -1) {
                    ((zy0) obj).finishFragment();
                    break;
                }
                break;
            case 11:
                if (i7 == -1) {
                    ((SaveToGallerySettingsActivity) obj).finishFragment();
                    break;
                }
                break;
            case 12:
                if (i7 == -1) {
                    ((SecretMediaViewer) obj).e(true, false);
                    break;
                }
                break;
            case 13:
                if (i7 == -1) {
                    ((SessionsActivity) obj).finishFragment();
                    break;
                }
                break;
            case 14:
                o31 o31Var = (o31) obj;
                if (i7 != -1) {
                    if (i7 == 2) {
                        o31Var.k0(new fe0(null));
                        break;
                    }
                } else if (!o31Var.O) {
                    o31Var.finishFragment();
                    break;
                } else {
                    Bundle bundle2 = new Bundle();
                    bundle2.putLong("user_id", o31Var.getUserConfig().e());
                    bundle2.putBoolean("immediate", true);
                    o31Var.presentFragment(new ci.j0(bundle2));
                    break;
                }
                break;
            case 15:
                if (i7 == -1) {
                    ((c51) obj).finishFragment();
                    break;
                }
                break;
            case 16:
                StickersActivity stickersActivity = (StickersActivity) obj;
                if (i7 != -1) {
                    StickersActivity.i0(stickersActivity, i7);
                    break;
                } else if (stickersActivity.onBackPressed(true)) {
                    stickersActivity.finishFragment();
                    break;
                }
                break;
            case 17:
                a81 a81Var = (a81) obj;
                if (i7 != -1) {
                    if (i7 == 1) {
                        a81.d0(a81Var);
                        break;
                    }
                } else {
                    a81Var.finishFragment();
                    break;
                }
                break;
            case 18:
                if (i7 == -1) {
                    ((p81) obj).finishFragment();
                    break;
                }
                break;
            case 19:
                if (i7 == -1) {
                    ((ea1) obj).finishFragment();
                    break;
                }
                break;
            case 20:
                if (i7 == -1) {
                    TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) obj;
                    if (twoStepVerificationActivity.Y < 0) {
                        twoStepVerificationActivity.finishFragment();
                        break;
                    } else {
                        twoStepVerificationActivity.C0();
                        break;
                    }
                }
                break;
            case 21:
                UserInfoActivity userInfoActivity = (UserInfoActivity) obj;
                if (i7 != -1) {
                    if (i7 == 1) {
                        userInfoActivity.h0(true);
                        break;
                    }
                } else if (userInfoActivity.onBackPressed(true)) {
                    userInfoActivity.finishFragment();
                    break;
                }
                break;
            case 22:
                UsersSelectActivity usersSelectActivity = (UsersSelectActivity) obj;
                if (i7 != -1) {
                    if (i7 == 1) {
                        usersSelectActivity.c0();
                        break;
                    }
                } else {
                    usersSelectActivity.finishFragment();
                    break;
                }
                break;
            case 23:
                org.telegram.ui.Wallet.da daVar = (org.telegram.ui.Wallet.da) obj;
                if (i7 != -1) {
                    if (i7 != 2) {
                        if (i7 == 3) {
                            daVar.u0();
                            break;
                        }
                    } else {
                        Activity parentActivity = daVar.getParentActivity();
                        i10 = ((org.telegram.ui.ActionBar.h2) daVar).currentAccount;
                        org.telegram.ui.Wallet.n6.N0(i10, parentActivity, daVar.getResourceProvider());
                        break;
                    }
                } else {
                    daVar.finishFragment();
                    break;
                }
                break;
            case 24:
                org.telegram.ui.web.m mVar = (org.telegram.ui.web.m) obj;
                HashSet hashSet = mVar.y;
                if (i7 != -1) {
                    if (i7 != R.id.menu_delete) {
                        if (i7 == R.id.menu_link) {
                            mVar.i0();
                            break;
                        }
                    } else {
                        HashSet hashSet2 = new HashSet();
                        ArrayList arrayList = new ArrayList();
                        HashSet hashSet3 = new HashSet();
                        Iterator it = hashSet.iterator();
                        while (it.hasNext()) {
                            int intValue = ((Integer) it.next()).intValue();
                            ArrayList arrayList2 = mVar.e.a;
                            int size = arrayList2.size();
                            int i12 = 0;
                            while (true) {
                                if (i12 < size) {
                                    Object obj6 = arrayList2.get(i12);
                                    i12++;
                                    fjVar = (org.telegram.messenger.fj) obj6;
                                    if (fjVar == null || fjVar.e1() != intValue) {
                                    }
                                } else {
                                    fjVar = null;
                                }
                            }
                            org.telegram.ui.web.i iVar = mVar.f;
                            if (iVar != null && fjVar == null) {
                                ArrayList arrayList3 = iVar.a;
                                int size2 = arrayList3.size();
                                int i13 = 0;
                                while (true) {
                                    if (i13 < size2) {
                                        Object obj7 = arrayList3.get(i13);
                                        i13++;
                                        org.telegram.messenger.fj fjVar2 = (org.telegram.messenger.fj) obj7;
                                        if (fjVar2 != null && fjVar2.e1() == intValue) {
                                            fjVar = fjVar2;
                                        }
                                    }
                                }
                            }
                            if (fjVar != null) {
                                arrayList.add(fjVar);
                                hashSet3.add(Integer.valueOf(fjVar.e1()));
                                hashSet2.add(org.telegram.ui.web.k.a(fjVar));
                            }
                        }
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, mVar.getParentActivity(), mVar.getResourceProvider());
                        String G = org.telegram.messenger.gd.G(hashSet3.size(), "DeleteOptionsTitle", new Object[0]);
                        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
                        u1Var.S = G;
                        u1Var.U = org.telegram.messenger.gd.N0(hashSet3.size() == 1 ? "AreYouSureUnsaveSingleMessage" : "AreYouSureUnsaveFewMessages");
                        alertDialog$Builder.k(org.telegram.messenger.gd.M0(2131751587, null), new wc1(c10 == true ? 1 : 0, mVar, hashSet3));
                        alertDialog$Builder.h(org.telegram.messenger.gd.M0(2131752578, null), null);
                        alertDialog$Builder.d(-1);
                        alertDialog$Builder.p();
                        break;
                    }
                } else {
                    kVar3 = ((org.telegram.ui.ActionBar.h2) mVar).actionBar;
                    if (!kVar3.y()) {
                        mVar.finishFragment();
                        break;
                    } else {
                        kVar4 = ((org.telegram.ui.ActionBar.h2) mVar).actionBar;
                        kVar4.x();
                        hashSet.clear();
                        org.telegram.messenger.g0.d0(mVar.a, new fi.e(28));
                        break;
                    }
                }
                break;
            case 25:
                org.telegram.ui.web.x0 x0Var = (org.telegram.ui.web.x0) obj;
                if (i7 == -1) {
                    kVar5 = ((org.telegram.ui.ActionBar.h2) x0Var).actionBar;
                    if (!kVar5.y()) {
                        x0Var.finishFragment();
                        break;
                    } else {
                        kVar6 = ((org.telegram.ui.ActionBar.h2) x0Var).actionBar;
                        kVar6.x();
                        x0Var.w.clear();
                        org.telegram.messenger.g0.d0(x0Var.a, new fi.e(29));
                        break;
                    }
                }
                break;
            default:
                if (i7 == -1) {
                    ((ug.z0) obj).dismiss();
                    break;
                }
                break;
        }
    }
}
