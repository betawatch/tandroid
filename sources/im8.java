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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class im8 extends c6 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ im8(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // c6
    public final void b(int i) {
        a aVar;
        a aVar2;
        int i2;
        int i3;
        ylb ylbVar;
        int i4;
        byte b = this.a;
        byte b2 = 4;
        c6 c6Var = null;
        boolean z = true;
        Object obj = this.b;
        switch (b) {
            case 0:
                if (i == -1) {
                    ((km8) obj).finishFragment();
                    break;
                }
                break;
            case 1:
                if (i == -1) {
                    ((om8) obj).a(false, false);
                    break;
                }
                break;
            case 2:
                if (i == -1) {
                    ((cic) obj).a(false, false);
                    break;
                }
                break;
            case 3:
                ProfileActivity profileActivity = (ProfileActivity) obj;
                if (i == -1) {
                    wp8 wp8Var = profileActivity.O;
                    if (wp8Var == null || !wp8Var.E(true)) {
                        if (!profileActivity.J0) {
                            profileActivity.finishFragment();
                            break;
                        } else {
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", profileActivity.f1);
                            bundle.putLong("user_id", profileActivity.e1);
                            profileActivity.presentFragment(new iy8(bundle));
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
            case 4:
                if (i == -1) {
                    ((ProxyListActivity) obj).finishFragment();
                    break;
                }
                break;
            case 5:
                gw8 gw8Var = (gw8) obj;
                boolean z2 = gw8Var.J;
                fda fdaVar = gw8Var.K;
                if (i != -1) {
                    if (i == 1 && gw8Var.getParentActivity() != null) {
                        i66 a = bw8.a();
                        a.o(gw8Var.w);
                        String obj2 = gw8Var.a[0].getText().toString();
                        if (obj2 == null) {
                            obj2 = "";
                        }
                        a.c = obj2;
                        a.b = gw8Var.w == 3 ? 0 : Utilities.z(gw8Var.a[1].getText().toString()).intValue();
                        String obj3 = gw8Var.w == 1 ? gw8Var.a[2].getText().toString() : "";
                        if (obj3 == null) {
                            obj3 = "";
                        }
                        a.d = obj3;
                        String obj4 = gw8Var.w == 1 ? gw8Var.a[3].getText().toString() : "";
                        if (obj4 == null) {
                            obj4 = "";
                        }
                        a.e = obj4;
                        String obj5 = gw8Var.w != 1 ? gw8Var.a[4].getText().toString() : "";
                        a.f = obj5 != null ? obj5 : "";
                        fdaVar.a = a.c();
                        SharedPreferences d1 = oc7.d1();
                        SharedPreferences.Editor edit = d1.edit();
                        if (z2) {
                            gda.a(fdaVar);
                            gda.x1 = fdaVar;
                            edit.putBoolean("proxy_enabled", true);
                        } else {
                            z = d1.getBoolean("proxy_enabled", false);
                            gda.y();
                        }
                        if (z2 || gda.x1 == fdaVar) {
                            fdaVar.a.i(edit);
                            ConnectionsManager.setProxySettings(z, fdaVar.a);
                        }
                        edit.commit();
                        nm7.e().k(nm7.E4, new Object[0]);
                        gw8Var.finishFragment();
                        break;
                    }
                } else {
                    gw8Var.finishFragment();
                    break;
                }
                break;
            case 6:
                lz8 lz8Var = (lz8) obj;
                ArrayList arrayList = lz8Var.b;
                if (i != -1) {
                    if (i != 1) {
                        if (i == 2) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, lz8Var.getResourceProvider(), lz8Var.getParentActivity());
                            String G = jb6.G(arrayList.size(), "BusinessRepliesDeleteTitle", new Object[0]);
                            he heVar = alertDialog$Builder.a;
                            heVar.S = G;
                            heVar.U = jb6.G(arrayList.size(), "BusinessRepliesDeleteMessage", new Object[0]);
                            alertDialog$Builder.j(jb6.M0(2131746054, null), new h68((Object) this, (byte) 20));
                            alertDialog$Builder.g(jb6.M0(2131752542, null), null);
                            lz8Var.showDialog(heVar);
                            break;
                        }
                    } else if (arrayList.size() == 1) {
                        int intValue = ((Integer) arrayList.get(0)).intValue();
                        i2 = ((d) lz8Var).currentAccount;
                        oz8 c = pz8.f(i2).c(intValue);
                        if (c != null) {
                            Activity parentActivity = lz8Var.getParentActivity();
                            i3 = ((d) lz8Var).currentAccount;
                            ylbVar = ((d) lz8Var).resourceProvider;
                            lz8.h0(parentActivity, i3, null, c, ylbVar, new jr0(this, intValue, b2));
                            break;
                        }
                    }
                } else if (!arrayList.isEmpty()) {
                    lz8Var.e0();
                    break;
                } else {
                    lz8Var.finishFragment();
                    break;
                }
                break;
            case 7:
                if (i == -1) {
                    ((a39) obj).finishFragment();
                    break;
                }
                break;
            case 8:
                if (i == -1) {
                    ((zb9) obj).finishFragment();
                    break;
                }
                break;
            case 9:
                if (i == -1) {
                    ((qc9) obj).finishFragment();
                    break;
                }
                break;
            case 10:
                if (i == -1) {
                    ((vn9) obj).finishFragment();
                    break;
                }
                break;
            case 11:
                if (i == -1) {
                    ((SaveToGallerySettingsActivity) obj).finishFragment();
                    break;
                }
                break;
            case 12:
                if (i == -1) {
                    ((SecretMediaViewer) obj).c(true, false);
                    break;
                }
                break;
            case 13:
                if (i == -1) {
                    ((SessionsActivity) obj).finishFragment();
                    break;
                }
                break;
            case 14:
                daa daaVar = (daa) obj;
                if (i != -1) {
                    if (i == 2) {
                        daaVar.k0(new ph6(null));
                        break;
                    }
                } else if (!daaVar.O) {
                    daaVar.finishFragment();
                    break;
                } else {
                    Bundle bundle2 = new Bundle();
                    bundle2.putLong("user_id", daaVar.getUserConfig().e());
                    bundle2.putBoolean("immediate", true);
                    daaVar.presentFragment(new iy8(bundle2));
                    break;
                }
                break;
            case 15:
                ((tca) obj).onBackPressed();
                break;
            case 16:
                if (i == -1) {
                    ((xza) obj).finishFragment();
                    break;
                }
                break;
            case 17:
                StickersActivity stickersActivity = (StickersActivity) obj;
                if (i != -1) {
                    stickersActivity.o0(i);
                    break;
                } else if (stickersActivity.onBackPressed(true)) {
                    stickersActivity.finishFragment();
                    break;
                }
                break;
            case 18:
                if (i == -1) {
                    ((hdb) obj).finishFragment();
                    break;
                }
                break;
            case 19:
                zob zobVar = (zob) obj;
                if (i != -1) {
                    if (i == 1) {
                        zobVar.e0();
                        break;
                    }
                } else {
                    zobVar.finishFragment();
                    break;
                }
                break;
            case 20:
                if (i == -1) {
                    ((wqb) obj).finishFragment();
                    break;
                }
                break;
            case 21:
                if (i == -1) {
                    ((avb) obj).finishFragment();
                    break;
                }
                break;
            case 22:
                if (i == -1) {
                    ((zxb) obj).finishFragment();
                    break;
                }
                break;
            case 23:
                if (i == -1) {
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
            case 24:
                if (i == -1) {
                    ((n7c) obj).finishFragment();
                    break;
                }
                break;
            case 25:
                UserInfoActivity userInfoActivity = (UserInfoActivity) obj;
                if (i != -1) {
                    if (i == 1) {
                        userInfoActivity.h0(true);
                        break;
                    }
                } else if (userInfoActivity.onBackPressed(true)) {
                    userInfoActivity.finishFragment();
                    break;
                }
                break;
            case 26:
                UsersSelectActivity usersSelectActivity = (UsersSelectActivity) obj;
                if (i != -1) {
                    if (i == 1) {
                        usersSelectActivity.c0();
                        break;
                    }
                } else {
                    usersSelectActivity.finishFragment();
                    break;
                }
                break;
            default:
                rrc rrcVar = (rrc) obj;
                if (i != -1) {
                    if (i != 2) {
                        if (i == 3) {
                            rrcVar.t0();
                            break;
                        }
                    } else {
                        Activity parentActivity2 = rrcVar.getParentActivity();
                        i4 = ((d) rrcVar).currentAccount;
                        goc.M0(i4, rrcVar.getResourceProvider(), parentActivity2);
                        break;
                    }
                } else {
                    rrcVar.finishFragment();
                    break;
                }
                break;
        }
    }
}
