package bi;

import android.app.Activity;
import android.content.Context;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.text.TextUtils;
import j$.util.DesugarTimeZone;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.cm0;
import org.telegram.ui.n01;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final /* synthetic */ class ve implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ve(int i10, Object obj, boolean z10) {
        this.a = i10;
        this.c = obj;
        this.b = z10;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x012c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // org.telegram.messenger.Utilities.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run(Object obj) {
        int[] iArr;
        af afVar = null;
        int i10 = 0;
        switch (this.a) {
            case 0:
                Utilities.Callback callback = (Utilities.Callback) this.c;
                boolean z10 = this.b;
                Location location = (Location) obj;
                if (location == null) {
                    callback.run(null);
                    break;
                } else {
                    Activity activity = LaunchActivity.G1;
                    if (activity == null) {
                        activity = AndroidUtilities.findActivity(ApplicationLoader.applicationContext);
                    }
                    if (activity == null || activity.isFinishing()) {
                        callback.run(null);
                        break;
                    } else {
                        org.telegram.ui.ActionBar.d2 d2Var = z10 ? new org.telegram.ui.ActionBar.d2(activity, 3, new zh.b()) : null;
                        if (z10) {
                            d2Var.q(200L);
                        }
                        double latitude = location.getLatitude();
                        double longitude = location.getLongitude();
                        we weVar = new we(z10, d2Var, callback, i10);
                        Date date = new Date();
                        Calendar calendar = Calendar.getInstance(DesugarTimeZone.getTimeZone("UTC"));
                        calendar.setTime(date);
                        String str = Math.round(latitude * 1000.0d) + ":" + Math.round(longitude * 1000.0d) + "at" + (((calendar.getTimeInMillis() / 1000) / 60) / 60);
                        if (ef.b == null || !TextUtils.equals(ef.a, str)) {
                            int[] iArr2 = new int[1];
                            MessagesController messagesController = MessagesController.getInstance(UserConfig.selectedAccount);
                            ConnectionsManager connectionsManager = ConnectionsManager.getInstance(UserConfig.selectedAccount);
                            String str2 = messagesController.weatherSearchUsername;
                            TLRPC.User[] userArr = {messagesController.getUser(str2)};
                            ye yeVar = new ye(messagesController, userArr, latitude, longitude, iArr2, connectionsManager, weVar, str);
                            if (userArr[0] == null) {
                                TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername = new TLRPC.TL_contacts_resolveUsername();
                                tL_contacts_resolveUsername.username = str2;
                                iArr = iArr2;
                                iArr[0] = connectionsManager.sendRequest(tL_contacts_resolveUsername, new ze(iArr2, messagesController, userArr, yeVar, weVar, 0));
                            } else {
                                iArr = iArr2;
                                yeVar.run();
                            }
                            afVar = new af(i10, iArr, connectionsManager);
                        } else {
                            weVar.run(ef.b);
                        }
                        if (z10 && afVar != null) {
                            d2Var.setOnCancelListener(new xe(afVar, i10));
                            break;
                        }
                    }
                }
                break;
            case 1:
                ve veVar = (ve) this.c;
                boolean z11 = this.b;
                if (!((Boolean) obj).booleanValue()) {
                    veVar.run(null);
                    break;
                } else {
                    final LocationManager locationManager = (LocationManager) ApplicationLoader.applicationContext.getSystemService("location");
                    List<String> providers = locationManager.getProviders(true);
                    Location location2 = null;
                    for (int size = providers.size() - 1; size >= 0; size--) {
                        location2 = locationManager.getLastKnownLocation(providers.get(size));
                        if (location2 != null) {
                            if (location2 == null && z11) {
                                if (locationManager.isProviderEnabled("gps")) {
                                    Context context = LaunchActivity.G1;
                                    if (context == null) {
                                        context = ApplicationLoader.applicationContext;
                                    }
                                    if (context != null) {
                                        try {
                                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
                                            alertDialog$Builder.m(R.raw.permission_request_location, 72, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.L5, false), null);
                                            alertDialog$Builder.a.T = LocaleController.getString(R.string.GpsDisabledAlertText);
                                            alertDialog$Builder.k(LocaleController.getString(R.string.Enable), new bf(context, i10));
                                            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                                            alertDialog$Builder.o();
                                        } catch (Exception e) {
                                            FileLog.e(e);
                                        }
                                    }
                                } else {
                                    try {
                                        final Utilities.Callback[] callbackArr = {veVar};
                                        final LocationListener[] locationListenerArr = {null};
                                        LocationListener locationListener = new LocationListener() { // from class: bi.cf
                                            @Override // android.location.LocationListener
                                            public final void onLocationChanged(Location location3) {
                                                LocationListener[] locationListenerArr2 = locationListenerArr;
                                                LocationListener locationListener2 = locationListenerArr2[0];
                                                if (locationListener2 != null) {
                                                    locationManager.removeUpdates(locationListener2);
                                                    locationListenerArr2[0] = null;
                                                }
                                                Utilities.Callback[] callbackArr2 = callbackArr;
                                                Utilities.Callback callback2 = callbackArr2[0];
                                                if (callback2 != null) {
                                                    callback2.run(location3);
                                                    callbackArr2[0] = null;
                                                }
                                            }
                                        };
                                        locationListenerArr[0] = locationListener;
                                        locationManager.requestLocationUpdates("gps", 1L, 0.0f, locationListener);
                                        break;
                                    } catch (Exception e7) {
                                        FileLog.e(e7);
                                        veVar.run(null);
                                        return;
                                    }
                                }
                            }
                            veVar.run(location2);
                            break;
                        }
                    }
                    if (location2 == null) {
                        if (locationManager.isProviderEnabled("gps")) {
                        }
                    }
                    veVar.run(location2);
                }
            case 2:
                n01 n01Var = (n01) this.c;
                boolean z12 = this.b;
                ProfileActivity profileActivity = n01Var.b;
                if (profileActivity.getParentActivity() != null) {
                    org.telegram.ui.Components.wc.a0(profileActivity).o(z12 ? org.telegram.ui.Components.vc.h : org.telegram.ui.Components.vc.e, null).j();
                    break;
                }
                break;
            case 3:
                AndroidUtilities.runOnUIThread(new cm0((org.telegram.ui.web.l) this.c, (String) obj, this.b, 10));
                break;
            case 4:
                org.telegram.ui.web.b2 b2Var = (org.telegram.ui.web.b2) this.c;
                b2Var.getMessagesController().addWebBrowserException((String) obj, this.b);
                b2Var.a.Y2.N(true);
                break;
            case 5:
                xh.v5 v5Var = (xh.v5) this.c;
                HashSet hashSet = (HashSet) obj;
                if (this.b) {
                    SendMessagesHelper.getInstance(v5Var.a).cancelSendingMessage(new ArrayList<>(hashSet));
                    break;
                } else {
                    v5Var.getClass();
                    break;
                }
            default:
                zh.a3 a3Var = (zh.a3) this.c;
                boolean z13 = this.b;
                zh.h2 h2Var = a3Var.c1;
                org.telegram.ui.ActionBar.f6 f6Var = a3Var.B0;
                new org.telegram.ui.Components.wc(h2Var, f6Var).o(z13 ? org.telegram.ui.Components.vc.h : org.telegram.ui.Components.vc.e, f6Var).j();
                break;
        }
    }
}
