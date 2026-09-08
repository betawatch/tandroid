package bi;

import android.app.Activity;
import android.content.Context;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.text.TextUtils;
import di.hd;
import di.id;
import di.jd;
import di.kd;
import di.ld;
import di.od;
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
import org.telegram.ui.Components.xc;
import org.telegram.ui.Components.yc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.dm0;
import org.telegram.ui.i01;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes4.dex */
public final /* synthetic */ class v2 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ v2(int i10, Object obj, boolean z10) {
        this.a = i10;
        this.c = obj;
        this.b = z10;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x010a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // org.telegram.messenger.Utilities.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run(Object obj) {
        int[] iArr;
        di.b7 b7Var = null;
        int i10 = 0;
        switch (this.a) {
            case 0:
                o5 o5Var = (o5) this.c;
                boolean z10 = this.b;
                l4 l4Var = o5Var.c1;
                org.telegram.ui.ActionBar.f6 f6Var = o5Var.B0;
                new yc(l4Var, f6Var).o(z10 ? xc.h : xc.e, f6Var).j();
                break;
            case 1:
                Utilities.Callback callback = (Utilities.Callback) this.c;
                boolean z11 = this.b;
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
                        org.telegram.ui.ActionBar.b2 b2Var = z11 ? new org.telegram.ui.ActionBar.b2(activity, 3, new b()) : null;
                        if (z11) {
                            b2Var.q(200L);
                        }
                        double latitude = location.getLatitude();
                        double longitude = location.getLongitude();
                        hd hdVar = new hd(z11, b2Var, callback, i10);
                        Date date = new Date();
                        Calendar calendar = Calendar.getInstance(DesugarTimeZone.getTimeZone("UTC"));
                        calendar.setTime(date);
                        String str = Math.round(latitude * 1000.0d) + ":" + Math.round(longitude * 1000.0d) + "at" + (((calendar.getTimeInMillis() / 1000) / 60) / 60);
                        if (od.b == null || !TextUtils.equals(od.a, str)) {
                            int[] iArr2 = new int[1];
                            MessagesController messagesController = MessagesController.getInstance(UserConfig.selectedAccount);
                            ConnectionsManager connectionsManager = ConnectionsManager.getInstance(UserConfig.selectedAccount);
                            String str2 = messagesController.weatherSearchUsername;
                            TLRPC.User[] userArr = {messagesController.getUser(str2)};
                            jd jdVar = new jd(messagesController, userArr, latitude, longitude, iArr2, connectionsManager, hdVar, str);
                            if (userArr[0] == null) {
                                TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername = new TLRPC.TL_contacts_resolveUsername();
                                tL_contacts_resolveUsername.username = str2;
                                iArr = iArr2;
                                iArr[0] = connectionsManager.sendRequest(tL_contacts_resolveUsername, new kd(iArr2, messagesController, userArr, jdVar, hdVar, 0));
                            } else {
                                iArr = iArr2;
                                jdVar.run();
                            }
                            b7Var = new di.b7(13, iArr, connectionsManager);
                        } else {
                            hdVar.run(od.b);
                        }
                        if (z11 && b7Var != null) {
                            b2Var.setOnCancelListener(new id(b7Var, i10));
                            break;
                        }
                    }
                }
                break;
            case 2:
                v2 v2Var = (v2) this.c;
                boolean z12 = this.b;
                if (!((Boolean) obj).booleanValue()) {
                    v2Var.run(null);
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
                                    Context context = LaunchActivity.G1;
                                    if (context == null) {
                                        context = ApplicationLoader.applicationContext;
                                    }
                                    if (context != null) {
                                        try {
                                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
                                            alertDialog$Builder.m(R.raw.permission_request_location, 72, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.L5, false), null);
                                            alertDialog$Builder.a.T = LocaleController.getString(R.string.GpsDisabledAlertText);
                                            alertDialog$Builder.k(LocaleController.getString(R.string.Enable), new ld(context, i10));
                                            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                                            alertDialog$Builder.o();
                                        } catch (Exception e7) {
                                            FileLog.e(e7);
                                        }
                                    }
                                } else {
                                    try {
                                        final Utilities.Callback[] callbackArr = {v2Var};
                                        final LocationListener[] locationListenerArr = {null};
                                        LocationListener locationListener = new LocationListener() { // from class: di.md
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
                                        v2Var.run(null);
                                        return;
                                    }
                                }
                            }
                            v2Var.run(location2);
                            break;
                        }
                    }
                    if (location2 == null) {
                        if (locationManager.isProviderEnabled("gps")) {
                        }
                    }
                    v2Var.run(location2);
                }
            case 3:
                i01 i01Var = (i01) this.c;
                boolean z13 = this.b;
                ProfileActivity profileActivity = i01Var.b;
                if (profileActivity.getParentActivity() != null) {
                    yc.a0(profileActivity).o(z13 ? xc.h : xc.e, null).j();
                    break;
                }
                break;
            case 4:
                AndroidUtilities.runOnUIThread(new dm0((org.telegram.ui.web.l) this.c, (String) obj, this.b, 10));
                break;
            case 5:
                org.telegram.ui.web.a2 a2Var = (org.telegram.ui.web.a2) this.c;
                a2Var.getMessagesController().addWebBrowserException((String) obj, this.b);
                a2Var.a.Y2.N(true);
                break;
            default:
                zh.s5 s5Var = (zh.s5) this.c;
                HashSet hashSet = (HashSet) obj;
                if (this.b) {
                    SendMessagesHelper.getInstance(s5Var.a).cancelSendingMessage(new ArrayList<>(hashSet));
                    break;
                } else {
                    s5Var.getClass();
                    break;
                }
        }
    }
}
