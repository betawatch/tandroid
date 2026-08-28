package gh;

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
import kh.pc;
import kh.qc;
import kh.rc;
import kh.uc;
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
import org.telegram.ui.Components.nc;
import org.telegram.ui.Components.oc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.dz0;
import org.telegram.ui.np0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class p6 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ p6(int i9, Object obj, boolean z10) {
        this.a = i9;
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
        kh.o8 o8Var = null;
        int i9 = 0;
        switch (this.a) {
            case 0:
                v7 v7Var = (v7) this.c;
                HashSet hashSet = (HashSet) obj;
                if (this.b) {
                    SendMessagesHelper.getInstance(v7Var.a).cancelSendingMessage(new ArrayList<>(hashSet));
                    break;
                } else {
                    v7Var.getClass();
                    break;
                }
            case 1:
                ih.i4 i4Var = (ih.i4) this.c;
                boolean z10 = this.b;
                ih.l3 l3Var = i4Var.Y0;
                org.telegram.ui.ActionBar.b6 b6Var = i4Var.x0;
                new oc(l3Var, b6Var).o(z10 ? nc.h : nc.e, b6Var).j();
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
                        org.telegram.ui.ActionBar.c2 c2Var = z11 ? new org.telegram.ui.ActionBar.c2(activity, 3, new ih.b()) : null;
                        if (z11) {
                            c2Var.q(200L);
                        }
                        double latitude = location.getLatitude();
                        double longitude = location.getLongitude();
                        kh.oc ocVar = new kh.oc(z11, c2Var, callback, i9);
                        Date date = new Date();
                        Calendar calendar = Calendar.getInstance(DesugarTimeZone.getTimeZone("UTC"));
                        calendar.setTime(date);
                        String str = Math.round(latitude * 1000.0d) + ":" + Math.round(longitude * 1000.0d) + "at" + (((calendar.getTimeInMillis() / 1000) / 60) / 60);
                        if (uc.b == null || !TextUtils.equals(uc.a, str)) {
                            int[] iArr2 = new int[1];
                            MessagesController messagesController = MessagesController.getInstance(UserConfig.selectedAccount);
                            ConnectionsManager connectionsManager = ConnectionsManager.getInstance(UserConfig.selectedAccount);
                            String str2 = messagesController.weatherSearchUsername;
                            TLRPC.User[] userArr = {messagesController.getUser(str2)};
                            qc qcVar = new qc(messagesController, userArr, latitude, longitude, iArr2, connectionsManager, ocVar, str);
                            if (userArr[0] == null) {
                                TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername = new TLRPC.TL_contacts_resolveUsername();
                                tL_contacts_resolveUsername.username = str2;
                                iArr = iArr2;
                                iArr[0] = connectionsManager.sendRequest(tL_contacts_resolveUsername, new bg.h0(iArr2, messagesController, userArr, qcVar, ocVar, 3));
                            } else {
                                iArr = iArr2;
                                qcVar.run();
                            }
                            o8Var = new kh.o8(2, iArr, connectionsManager);
                        } else {
                            ocVar.run(uc.b);
                        }
                        if (z11 && o8Var != null) {
                            c2Var.setOnCancelListener(new pc(o8Var, i9));
                            break;
                        }
                    }
                }
                break;
            case 3:
                p6 p6Var = (p6) this.c;
                boolean z12 = this.b;
                if (!((Boolean) obj).booleanValue()) {
                    p6Var.run(null);
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
                                            alertDialog$Builder.m(R.raw.permission_request_location, 72, org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.L5, false), null);
                                            alertDialog$Builder.a.P = LocaleController.getString(R.string.GpsDisabledAlertText);
                                            alertDialog$Builder.k(LocaleController.getString(R.string.Enable), new rc(context, i9));
                                            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                                            alertDialog$Builder.o();
                                        } catch (Exception e10) {
                                            FileLog.e(e10);
                                        }
                                    }
                                } else {
                                    try {
                                        final Utilities.Callback[] callbackArr = {p6Var};
                                        final LocationListener[] locationListenerArr = {null};
                                        LocationListener locationListener = new LocationListener() { // from class: kh.sc
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
                                    } catch (Exception e11) {
                                        FileLog.e(e11);
                                        p6Var.run(null);
                                        return;
                                    }
                                }
                            }
                            p6Var.run(location2);
                            break;
                        }
                    }
                    if (location2 == null) {
                        if (locationManager.isProviderEnabled("gps")) {
                        }
                    }
                    p6Var.run(location2);
                }
            case 4:
                dz0 dz0Var = (dz0) this.c;
                boolean z13 = this.b;
                ProfileActivity profileActivity = dz0Var.b;
                if (profileActivity.getParentActivity() != null) {
                    oc.a0(profileActivity).o(z13 ? nc.h : nc.e, null).j();
                    break;
                }
                break;
            case 5:
                AndroidUtilities.runOnUIThread(new np0((org.telegram.ui.web.k) this.c, (String) obj, this.b, 8));
                break;
            default:
                org.telegram.ui.web.u1 u1Var = (org.telegram.ui.web.u1) this.c;
                u1Var.getMessagesController().addWebBrowserException((String) obj, this.b);
                u1Var.a.U2.N(true);
                break;
        }
    }
}
