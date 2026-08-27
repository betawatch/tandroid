package hh;

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
import lh.kc;
import lh.nc;
import lh.qc;
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
import org.telegram.ui.Components.lc;
import org.telegram.ui.Components.mc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.dz0;
import org.telegram.ui.op0;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final /* synthetic */ class o6 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ o6(int i10, Object obj, boolean z10) {
        this.a = i10;
        this.c = obj;
        this.b = z10;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00eb A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // org.telegram.messenger.Utilities.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run(Object obj) {
        int[] iArr;
        int i10 = 8;
        lh.k7 k7Var = null;
        int i11 = 0;
        switch (this.a) {
            case 0:
                u7 u7Var = (u7) this.c;
                HashSet hashSet = (HashSet) obj;
                if (this.b) {
                    SendMessagesHelper.getInstance(u7Var.a).cancelSendingMessage(new ArrayList<>(hashSet));
                    break;
                } else {
                    u7Var.getClass();
                    break;
                }
            case 1:
                jh.e4 e4Var = (jh.e4) this.c;
                boolean z10 = this.b;
                jh.j3 j3Var = e4Var.Y0;
                org.telegram.ui.ActionBar.c6 c6Var = e4Var.x0;
                new mc(j3Var, c6Var).o(z10 ? lc.h : lc.e, c6Var).j();
                break;
            case 2:
                Utilities.Callback callback = (Utilities.Callback) this.c;
                boolean z11 = this.b;
                Location location = (Location) obj;
                if (location == null) {
                    callback.run(null);
                    break;
                } else {
                    Activity activity = LaunchActivity.C1;
                    if (activity == null) {
                        activity = AndroidUtilities.findActivity(ApplicationLoader.applicationContext);
                    }
                    if (activity == null || activity.isFinishing()) {
                        callback.run(null);
                        break;
                    } else {
                        org.telegram.ui.ActionBar.b2 b2Var = z11 ? new org.telegram.ui.ActionBar.b2(activity, 3, new jh.b()) : null;
                        if (z11) {
                            b2Var.q(200L);
                        }
                        double latitude = location.getLatitude();
                        double longitude = location.getLongitude();
                        kc kcVar = new kc(z11, b2Var, callback, i11);
                        Date date = new Date();
                        Calendar calendar = Calendar.getInstance(DesugarTimeZone.getTimeZone("UTC"));
                        calendar.setTime(date);
                        String str = Math.round(latitude * 1000.0d) + ":" + Math.round(longitude * 1000.0d) + "at" + (((calendar.getTimeInMillis() / 1000) / 60) / 60);
                        if (qc.b == null || !TextUtils.equals(qc.a, str)) {
                            int[] iArr2 = new int[1];
                            MessagesController messagesController = MessagesController.getInstance(UserConfig.selectedAccount);
                            ConnectionsManager connectionsManager = ConnectionsManager.getInstance(UserConfig.selectedAccount);
                            String str2 = messagesController.weatherSearchUsername;
                            TLRPC.User[] userArr = {messagesController.getUser(str2)};
                            lh.mc mcVar = new lh.mc(messagesController, userArr, latitude, longitude, iArr2, connectionsManager, kcVar, str);
                            if (userArr[0] == null) {
                                TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername = new TLRPC.TL_contacts_resolveUsername();
                                tL_contacts_resolveUsername.username = str2;
                                iArr = iArr2;
                                iArr[0] = connectionsManager.sendRequest(tL_contacts_resolveUsername, new cg.e0(iArr2, messagesController, userArr, mcVar, kcVar, 3));
                            } else {
                                iArr = iArr2;
                                mcVar.run();
                            }
                            k7Var = new lh.k7(i10, iArr, connectionsManager);
                        } else {
                            kcVar.run(qc.b);
                        }
                        if (z11 && k7Var != null) {
                            b2Var.setOnCancelListener(new lh.lc(k7Var, i11));
                            break;
                        }
                    }
                }
                break;
            case 3:
                o6 o6Var = (o6) this.c;
                boolean z12 = this.b;
                if (!((Boolean) obj).booleanValue()) {
                    o6Var.run(null);
                    break;
                } else {
                    final LocationManager locationManager = (LocationManager) ApplicationLoader.applicationContext.getSystemService("location");
                    List<String> providers = locationManager.getProviders(true);
                    Location location2 = null;
                    for (int size = providers.size() - 1; size >= 0; size--) {
                        location2 = locationManager.getLastKnownLocation(providers.get(size));
                        if (location2 != null) {
                            if (location2 == null && z12) {
                                if (locationManager.isProviderEnabled("gps")) {
                                    Context context = LaunchActivity.C1;
                                    if (context == null) {
                                        context = ApplicationLoader.applicationContext;
                                    }
                                    if (context != null) {
                                        try {
                                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
                                            alertDialog$Builder.m(R.raw.permission_request_location, 72, org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.L5, false), null);
                                            alertDialog$Builder.a.P = LocaleController.getString(R.string.GpsDisabledAlertText);
                                            alertDialog$Builder.k(LocaleController.getString(R.string.Enable), new nc(context, i11));
                                            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                                            alertDialog$Builder.o();
                                        } catch (Exception e9) {
                                            FileLog.e(e9);
                                        }
                                    }
                                } else {
                                    try {
                                        final Utilities.Callback[] callbackArr = {o6Var};
                                        final LocationListener[] locationListenerArr = {null};
                                        LocationListener locationListener = new LocationListener() { // from class: lh.oc
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
                                    } catch (Exception e10) {
                                        FileLog.e(e10);
                                        o6Var.run(null);
                                        return;
                                    }
                                }
                            }
                            o6Var.run(location2);
                            break;
                        }
                    }
                    if (location2 == null) {
                        if (locationManager.isProviderEnabled("gps")) {
                        }
                    }
                    o6Var.run(location2);
                }
            case 4:
                dz0 dz0Var = (dz0) this.c;
                boolean z13 = this.b;
                ProfileActivity profileActivity = dz0Var.b;
                if (profileActivity.getParentActivity() != null) {
                    mc.a0(profileActivity).o(z13 ? lc.h : lc.e, null).j();
                    break;
                }
                break;
            case 5:
                AndroidUtilities.runOnUIThread(new op0((org.telegram.ui.web.l) this.c, (String) obj, this.b, i10));
                break;
            default:
                org.telegram.ui.web.v1 v1Var = (org.telegram.ui.web.v1) this.c;
                v1Var.getMessagesController().addWebBrowserException((String) obj, this.b);
                v1Var.a.U2.N(true);
                break;
        }
    }
}
