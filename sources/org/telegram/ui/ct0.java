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

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class ct0 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ct0(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i7) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        int i10;
        org.telegram.messenger.gj gjVar;
        org.telegram.ui.ActionBar.k kVar3;
        org.telegram.ui.ActionBar.k kVar4;
        org.telegram.ui.ActionBar.k kVar5;
        org.telegram.ui.ActionBar.k kVar6;
        int i11 = this.a;
        org.telegram.ui.ActionBar.j jVar = null;
        boolean z10 = true;
        Object obj = this.b;
        switch (i11) {
            case 0:
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
            case 1:
                if (i7 == -1) {
                    ((PrivacySettingsActivity) obj).finishFragment();
                    break;
                }
                break;
            case 2:
                if (i7 == -1) {
                    ((pt0) obj).finishFragment();
                    break;
                }
                break;
            case 3:
                ProfileActivity profileActivity = (ProfileActivity) obj;
                if (i7 == -1) {
                    uv0 uv0Var = profileActivity.O;
                    if (uv0Var == null || !uv0Var.V(true)) {
                        if (!profileActivity.J0) {
                            profileActivity.finishFragment();
                            break;
                        } else {
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", profileActivity.f1);
                            bundle.putLong("user_id", profileActivity.e1);
                            profileActivity.presentFragment(new ci.i0(bundle));
                            break;
                        }
                    }
                } else {
                    kVar = ((org.telegram.ui.ActionBar.e2) profileActivity).actionBar;
                    if (kVar != null) {
                        kVar2 = ((org.telegram.ui.ActionBar.e2) profileActivity).actionBar;
                        jVar = kVar2.getActionBarMenuOnItemClick();
                    }
                    if (jVar != null) {
                        jVar.b(i7);
                        break;
                    }
                }
                break;
            case 4:
                if (i7 == -1) {
                    ((ProxyListActivity) obj).finishFragment();
                    break;
                }
                break;
            case 5:
                tx0 tx0Var = (tx0) obj;
                boolean z11 = tx0Var.J;
                org.telegram.messenger.fz fzVar = tx0Var.K;
                if (i7 != -1) {
                    if (i7 == 1 && tx0Var.getParentActivity() != null) {
                        n2.o0 a10 = xi.a.a();
                        a10.q(tx0Var.w);
                        String obj2 = tx0Var.a[0].getText().toString();
                        if (obj2 == null) {
                            obj2 = "";
                        }
                        a10.c = obj2;
                        a10.b = tx0Var.w == 3 ? 0 : Utilities.z(tx0Var.a[1].getText().toString()).intValue();
                        String obj3 = tx0Var.w == 1 ? tx0Var.a[2].getText().toString() : "";
                        if (obj3 == null) {
                            obj3 = "";
                        }
                        a10.d = obj3;
                        String obj4 = tx0Var.w == 1 ? tx0Var.a[3].getText().toString() : "";
                        if (obj4 == null) {
                            obj4 = "";
                        }
                        a10.e = obj4;
                        String obj5 = tx0Var.w != 1 ? tx0Var.a[4].getText().toString() : "";
                        a10.f = obj5 != null ? obj5 : "";
                        fzVar.a = a10.d();
                        SharedPreferences e12 = org.telegram.messenger.np.e1();
                        SharedPreferences.Editor edit = e12.edit();
                        if (z11) {
                            org.telegram.messenger.gz.a(fzVar);
                            org.telegram.messenger.gz.B1 = fzVar;
                            edit.putBoolean("proxy_enabled", true);
                        } else {
                            z10 = e12.getBoolean("proxy_enabled", false);
                            org.telegram.messenger.gz.z();
                        }
                        if (z11 || org.telegram.messenger.gz.B1 == fzVar) {
                            fzVar.a.i(edit);
                            ConnectionsManager.setProxySettings(z10, fzVar.a);
                        }
                        edit.commit();
                        org.telegram.messenger.ns.e().k(org.telegram.messenger.ns.A4, new Object[0]);
                        tx0Var.finishFragment();
                        break;
                    }
                } else {
                    tx0Var.finishFragment();
                    break;
                }
                break;
            case 6:
                if (i7 == -1) {
                    ((zx0) obj).finishFragment();
                    break;
                }
                break;
            case 7:
                if (i7 == -1) {
                    ((oy0) obj).finishFragment();
                    break;
                }
                break;
            case 8:
                if (i7 == -1) {
                    ((vy0) obj).finishFragment();
                    break;
                }
                break;
            case 9:
                if (i7 == -1) {
                    ((SaveToGallerySettingsActivity) obj).finishFragment();
                    break;
                }
                break;
            case 10:
                if (i7 == -1) {
                    ((SecretMediaViewer) obj).e(true, false);
                    break;
                }
                break;
            case 11:
                if (i7 == -1) {
                    ((SessionsActivity) obj).finishFragment();
                    break;
                }
                break;
            case 12:
                k31 k31Var = (k31) obj;
                if (i7 != -1) {
                    if (i7 == 2) {
                        k31Var.k0(new ee0(null));
                        break;
                    }
                } else if (!k31Var.O) {
                    k31Var.finishFragment();
                    break;
                } else {
                    Bundle bundle2 = new Bundle();
                    bundle2.putLong("user_id", k31Var.getUserConfig().e());
                    bundle2.putBoolean("immediate", true);
                    k31Var.presentFragment(new ci.i0(bundle2));
                    break;
                }
                break;
            case 13:
                if (i7 == -1) {
                    ((z41) obj).finishFragment();
                    break;
                }
                break;
            case 14:
                StickersActivity stickersActivity = (StickersActivity) obj;
                if (i7 != -1) {
                    StickersActivity.i0(stickersActivity, i7);
                    break;
                } else if (stickersActivity.onBackPressed(true)) {
                    stickersActivity.finishFragment();
                    break;
                }
                break;
            case 15:
                w71 w71Var = (w71) obj;
                if (i7 != -1) {
                    if (i7 == 1) {
                        w71.d0(w71Var);
                        break;
                    }
                } else {
                    w71Var.finishFragment();
                    break;
                }
                break;
            case 16:
                if (i7 == -1) {
                    ((l81) obj).finishFragment();
                    break;
                }
                break;
            case 17:
                if (i7 == -1) {
                    ((aa1) obj).finishFragment();
                    break;
                }
                break;
            case 18:
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
            case 19:
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
            case 20:
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
            case 21:
                org.telegram.ui.Wallet.p9 p9Var = (org.telegram.ui.Wallet.p9) obj;
                if (i7 != -1) {
                    if (i7 != 2) {
                        if (i7 == 3) {
                            p9Var.u0();
                            break;
                        }
                    } else {
                        Activity parentActivity = p9Var.getParentActivity();
                        i10 = ((org.telegram.ui.ActionBar.e2) p9Var).currentAccount;
                        org.telegram.ui.Wallet.y5.J0(i10, parentActivity, p9Var.getResourceProvider());
                        break;
                    }
                } else {
                    p9Var.finishFragment();
                    break;
                }
                break;
            case 22:
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
                                    gjVar = (org.telegram.messenger.gj) obj6;
                                    if (gjVar == null || gjVar.e1() != intValue) {
                                    }
                                } else {
                                    gjVar = null;
                                }
                            }
                            org.telegram.ui.web.i iVar = mVar.f;
                            if (iVar != null && gjVar == null) {
                                ArrayList arrayList3 = iVar.a;
                                int size2 = arrayList3.size();
                                int i13 = 0;
                                while (true) {
                                    if (i13 < size2) {
                                        Object obj7 = arrayList3.get(i13);
                                        i13++;
                                        org.telegram.messenger.gj gjVar2 = (org.telegram.messenger.gj) obj7;
                                        if (gjVar2 != null && gjVar2.e1() == intValue) {
                                            gjVar = gjVar2;
                                        }
                                    }
                                }
                            }
                            if (gjVar != null) {
                                arrayList.add(gjVar);
                                hashSet3.add(Integer.valueOf(gjVar.e1()));
                                hashSet2.add(org.telegram.ui.web.k.a(gjVar));
                            }
                        }
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, mVar.getParentActivity(), mVar.getResourceProvider());
                        String G = org.telegram.messenger.hd.G(hashSet3.size(), "DeleteOptionsTitle", new Object[0]);
                        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
                        t1Var.S = G;
                        t1Var.U = org.telegram.messenger.hd.N0(hashSet3.size() == 1 ? "AreYouSureUnsaveSingleMessage" : "AreYouSureUnsaveFewMessages");
                        alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131751598, null), new org.telegram.ui.Wallet.k8(3, mVar, hashSet3));
                        alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
                        alertDialog$Builder.d(-1);
                        alertDialog$Builder.p();
                        break;
                    }
                } else {
                    kVar3 = ((org.telegram.ui.ActionBar.e2) mVar).actionBar;
                    if (!kVar3.x()) {
                        mVar.finishFragment();
                        break;
                    } else {
                        kVar4 = ((org.telegram.ui.ActionBar.e2) mVar).actionBar;
                        kVar4.w();
                        hashSet.clear();
                        org.telegram.messenger.g0.d0(mVar.a, new fi.e(28));
                        break;
                    }
                }
                break;
            case 23:
                org.telegram.ui.web.x0 x0Var = (org.telegram.ui.web.x0) obj;
                if (i7 == -1) {
                    kVar5 = ((org.telegram.ui.ActionBar.e2) x0Var).actionBar;
                    if (!kVar5.x()) {
                        x0Var.finishFragment();
                        break;
                    } else {
                        kVar6 = ((org.telegram.ui.ActionBar.e2) x0Var).actionBar;
                        kVar6.w();
                        x0Var.w.clear();
                        org.telegram.messenger.g0.d0(x0Var.a, new fi.e(29));
                        break;
                    }
                }
                break;
            default:
                if (i7 == -1) {
                    ((ug.x0) obj).dismiss();
                    break;
                }
                break;
        }
    }
}
