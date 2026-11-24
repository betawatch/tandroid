// default package

import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Bundle;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.ProxyListActivity;
import org.telegram.ui.SaveToGallerySettingsActivity;
import org.telegram.ui.SecretMediaViewer;
import org.telegram.ui.SessionsActivity;
import org.telegram.ui.StickersActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.UserInfoActivity;
import org.telegram.ui.UsersSelectActivity;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class kk8 extends c6 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ kk8(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // c6
    public final void b(int i) {
        a aVar;
        a aVar2;
        int i2;
        int i3;
        wjb wjbVar;
        int i4;
        byte b = this.a;
        byte b2 = 4;
        c6 c6Var = null;
        boolean z = true;
        Object obj = this.b;
        switch (b) {
            case 0:
                if (i == -1) {
                    ((mk8) obj).a(false, false);
                    break;
                }
                break;
            case 1:
                if (i == -1) {
                    ((bgc) obj).a(false, false);
                    break;
                }
                break;
            case 2:
                ProfileActivity profileActivity = (ProfileActivity) obj;
                if (i == -1) {
                    vn8 vn8Var = profileActivity.O;
                    if (vn8Var == null || !vn8Var.E(true)) {
                        if (!profileActivity.J0) {
                            profileActivity.finishFragment();
                            break;
                        } else {
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", profileActivity.f1);
                            bundle.putLong("user_id", profileActivity.e1);
                            profileActivity.presentFragment(new gw8(bundle));
                            break;
                        }
                    }
                } else {
                    aVar = ((d) profileActivity).actionBar;
                    if (aVar != null) {
                        aVar2 = ((d) profileActivity).actionBar;
                        c6Var = aVar2.getActionBarMenuOnItemClick();
                    }
                    if (c6Var != null) {
                        c6Var.b(i);
                        break;
                    }
                }
                break;
            case 3:
                if (i == -1) {
                    ((ProxyListActivity) obj).finishFragment();
                    break;
                }
                break;
            case 4:
                fu8 fu8Var = (fu8) obj;
                boolean z2 = fu8Var.J;
                fba fbaVar = fu8Var.K;
                if (i != -1) {
                    if (i == 1 && fu8Var.getParentActivity() != null) {
                        i46 a = au8.a();
                        a.o(fu8Var.w);
                        String obj2 = fu8Var.a[0].getText().toString();
                        if (obj2 == null) {
                            obj2 = "";
                        }
                        a.c = obj2;
                        a.b = fu8Var.w == 3 ? 0 : Utilities.z(fu8Var.a[1].getText().toString()).intValue();
                        String obj3 = fu8Var.w == 1 ? fu8Var.a[2].getText().toString() : "";
                        if (obj3 == null) {
                            obj3 = "";
                        }
                        a.d = obj3;
                        String obj4 = fu8Var.w == 1 ? fu8Var.a[3].getText().toString() : "";
                        if (obj4 == null) {
                            obj4 = "";
                        }
                        a.e = obj4;
                        String obj5 = fu8Var.w != 1 ? fu8Var.a[4].getText().toString() : "";
                        a.f = obj5 != null ? obj5 : "";
                        fbaVar.a = a.c();
                        SharedPreferences c1 = na7.c1();
                        SharedPreferences.Editor edit = c1.edit();
                        if (z2) {
                            gba.a(fbaVar);
                            gba.x1 = fbaVar;
                            edit.putBoolean("proxy_enabled", true);
                        } else {
                            z = c1.getBoolean("proxy_enabled", false);
                            gba.y();
                        }
                        if (z2 || gba.x1 == fbaVar) {
                            fbaVar.a.i(edit);
                            ConnectionsManager.setProxySettings(z, fbaVar.a);
                        }
                        edit.commit();
                        kk7.e().k(kk7.C4, new Object[0]);
                        fu8Var.finishFragment();
                        break;
                    }
                } else {
                    fu8Var.finishFragment();
                    break;
                }
                break;
            case 5:
                kx8 kx8Var = (kx8) obj;
                ArrayList arrayList = kx8Var.b;
                if (i != -1) {
                    if (i != 1) {
                        if (i == 2) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, kx8Var.getResourceProvider(), kx8Var.getParentActivity());
                            String G = k96.G(arrayList.size(), "BusinessRepliesDeleteTitle", new Object[0]);
                            hd hdVar = alertDialog$Builder.a;
                            hdVar.S = G;
                            hdVar.U = k96.G(arrayList.size(), "BusinessRepliesDeleteMessage", new Object[0]);
                            alertDialog$Builder.j(k96.M0(2131746128, null), new k88((Object) this, (byte) 16));
                            alertDialog$Builder.g(k96.M0(2131752577, null), null);
                            kx8Var.showDialog(hdVar);
                            break;
                        }
                    } else if (arrayList.size() == 1) {
                        int intValue = ((Integer) arrayList.get(0)).intValue();
                        i2 = ((d) kx8Var).currentAccount;
                        nx8 c = ox8.f(i2).c(intValue);
                        if (c != null) {
                            Activity parentActivity = kx8Var.getParentActivity();
                            i3 = ((d) kx8Var).currentAccount;
                            wjbVar = ((d) kx8Var).resourceProvider;
                            kx8.g0(parentActivity, i3, null, c, wjbVar, new jq0(this, intValue, b2));
                            break;
                        }
                    }
                } else if (!arrayList.isEmpty()) {
                    kx8Var.d0();
                    break;
                } else {
                    kx8Var.finishFragment();
                    break;
                }
                break;
            case 6:
                if (i == -1) {
                    ((y09) obj).finishFragment();
                    break;
                }
                break;
            case 7:
                if (i == -1) {
                    ((z99) obj).finishFragment();
                    break;
                }
                break;
            case 8:
                if (i == -1) {
                    ((qa9) obj).finishFragment();
                    break;
                }
                break;
            case 9:
                if (i == -1) {
                    ((vl9) obj).finishFragment();
                    break;
                }
                break;
            case 10:
                if (i == -1) {
                    ((SaveToGallerySettingsActivity) obj).finishFragment();
                    break;
                }
                break;
            case 11:
                if (i == -1) {
                    ((SecretMediaViewer) obj).c(true, false);
                    break;
                }
                break;
            case 12:
                if (i == -1) {
                    ((SessionsActivity) obj).finishFragment();
                    break;
                }
                break;
            case 13:
                d8a d8aVar = (d8a) obj;
                if (i != -1) {
                    if (i == 2) {
                        d8aVar.j0(new pf6(null));
                        break;
                    }
                } else if (!d8aVar.O) {
                    d8aVar.finishFragment();
                    break;
                } else {
                    Bundle bundle2 = new Bundle();
                    bundle2.putLong("user_id", d8aVar.getUserConfig().e());
                    bundle2.putBoolean("immediate", true);
                    d8aVar.presentFragment(new gw8(bundle2));
                    break;
                }
                break;
            case 14:
                ((taa) obj).onBackPressed();
                break;
            case 15:
                if (i == -1) {
                    ((uxa) obj).finishFragment();
                    break;
                }
                break;
            case 16:
                StickersActivity stickersActivity = (StickersActivity) obj;
                if (i != -1) {
                    stickersActivity.n0(i);
                    break;
                } else if (stickersActivity.onBackPressed(true)) {
                    stickersActivity.finishFragment();
                    break;
                }
                break;
            case 17:
                if (i == -1) {
                    ((fbb) obj).finishFragment();
                    break;
                }
                break;
            case 18:
                ymb ymbVar = (ymb) obj;
                if (i != -1) {
                    if (i == 1) {
                        ymbVar.d0();
                        break;
                    }
                } else {
                    ymbVar.finishFragment();
                    break;
                }
                break;
            case 19:
                if (i == -1) {
                    ((vob) obj).finishFragment();
                    break;
                }
                break;
            case 20:
                if (i == -1) {
                    ((zsb) obj).finishFragment();
                    break;
                }
                break;
            case 21:
                if (i == -1) {
                    ((wvb) obj).finishFragment();
                    break;
                }
                break;
            case 22:
                if (i == -1) {
                    TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) obj;
                    if (twoStepVerificationActivity.Y < 0) {
                        twoStepVerificationActivity.finishFragment();
                        break;
                    } else {
                        twoStepVerificationActivity.B0();
                        break;
                    }
                }
                break;
            case 23:
                if (i == -1) {
                    ((n5c) obj).finishFragment();
                    break;
                }
                break;
            case 24:
                UserInfoActivity userInfoActivity = (UserInfoActivity) obj;
                if (i != -1) {
                    if (i == 1) {
                        userInfoActivity.g0(true);
                        break;
                    }
                } else if (userInfoActivity.onBackPressed(true)) {
                    userInfoActivity.finishFragment();
                    break;
                }
                break;
            case 25:
                UsersSelectActivity usersSelectActivity = (UsersSelectActivity) obj;
                if (i != -1) {
                    if (i == 1) {
                        usersSelectActivity.b0();
                        break;
                    }
                } else {
                    usersSelectActivity.finishFragment();
                    break;
                }
                break;
            default:
                qpc qpcVar = (qpc) obj;
                if (i != -1) {
                    if (i != 2) {
                        if (i == 3) {
                            qpcVar.s0();
                            break;
                        }
                    } else {
                        Activity parentActivity2 = qpcVar.getParentActivity();
                        i4 = ((d) qpcVar).currentAccount;
                        hmc.L0(i4, qpcVar.getResourceProvider(), parentActivity2);
                        break;
                    }
                } else {
                    qpcVar.finishFragment();
                    break;
                }
                break;
        }
    }
}
