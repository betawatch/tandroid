package lh;

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
import org.telegram.ui.Components.kl;
import org.telegram.ui.Components.pc;
import org.telegram.ui.Components.qc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.cr0;
import org.telegram.ui.vz0;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public final /* synthetic */ class m6 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ m6(int i10, Object obj, boolean z4) {
        this.a = i10;
        this.c = obj;
        this.b = z4;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0098 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // org.telegram.messenger.Utilities.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run(Object obj) {
        int[] iArr;
        int i10 = 4;
        ph.e6 e6Var = null;
        int i11 = 0;
        switch (this.a) {
            case 0:
                t7 t7Var = (t7) this.c;
                HashSet hashSet = (HashSet) obj;
                if (this.b) {
                    SendMessagesHelper.getInstance(t7Var.a).cancelSendingMessage(new ArrayList<>(hashSet));
                    break;
                } else {
                    t7Var.getClass();
                    break;
                }
            case 1:
                nh.d4 d4Var = (nh.d4) this.c;
                boolean z4 = this.b;
                nh.i3 i3Var = d4Var.Z0;
                org.telegram.ui.ActionBar.f6 f6Var = d4Var.y0;
                new qc(i3Var, f6Var).o(z4 ? pc.h : pc.e, f6Var).j();
                break;
            case 2:
                vz0 vz0Var = (vz0) this.c;
                boolean z10 = this.b;
                ProfileActivity profileActivity = vz0Var.b;
                if (profileActivity.getParentActivity() != null) {
                    qc.a0(profileActivity).o(z10 ? pc.h : pc.e, null).j();
                    break;
                }
                break;
            case 3:
                AndroidUtilities.runOnUIThread(new cr0((org.telegram.ui.web.k) this.c, (String) obj, this.b, 6));
                break;
            case 4:
                org.telegram.ui.web.y1 y1Var = (org.telegram.ui.web.y1) this.c;
                y1Var.getMessagesController().addWebBrowserException((String) obj, this.b);
                y1Var.a.V2.N(true);
                break;
            case 5:
                Utilities.Callback callback = (Utilities.Callback) this.c;
                boolean z11 = this.b;
                Location location = (Location) obj;
                if (location == null) {
                    callback.run(null);
                    break;
                } else {
                    Activity activity = LaunchActivity.D1;
                    if (activity == null) {
                        activity = AndroidUtilities.findActivity(ApplicationLoader.applicationContext);
                    }
                    if (activity == null || activity.isFinishing()) {
                        callback.run(null);
                        break;
                    } else {
                        org.telegram.ui.ActionBar.d2 d2Var = z11 ? new org.telegram.ui.ActionBar.d2(activity, 3, new nh.b()) : null;
                        if (z11) {
                            d2Var.q(200L);
                        }
                        double latitude = location.getLatitude();
                        double longitude = location.getLongitude();
                        kl klVar = new kl(z11, d2Var, callback, i10);
                        Date date = new Date();
                        Calendar calendar = Calendar.getInstance(DesugarTimeZone.getTimeZone("UTC"));
                        calendar.setTime(date);
                        String str = Math.round(latitude * 1000.0d) + ":" + Math.round(longitude * 1000.0d) + "at" + (((calendar.getTimeInMillis() / 1000) / 60) / 60);
                        if (ph.ab.b == null || !TextUtils.equals(ph.ab.a, str)) {
                            int[] iArr2 = new int[1];
                            MessagesController messagesController = MessagesController.getInstance(UserConfig.selectedAccount);
                            ConnectionsManager connectionsManager = ConnectionsManager.getInstance(UserConfig.selectedAccount);
                            String str2 = messagesController.weatherSearchUsername;
                            TLRPC.User[] userArr = {messagesController.getUser(str2)};
                            ph.xa xaVar = new ph.xa(messagesController, userArr, latitude, longitude, iArr2, connectionsManager, klVar, str);
                            if (userArr[0] == null) {
                                TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername = new TLRPC.TL_contacts_resolveUsername();
                                tL_contacts_resolveUsername.username = str2;
                                iArr = iArr2;
                                iArr[0] = connectionsManager.sendRequest(tL_contacts_resolveUsername, new gg.e0(iArr2, messagesController, userArr, xaVar, klVar, 14));
                            } else {
                                iArr = iArr2;
                                xaVar.run();
                            }
                            e6Var = new ph.e6(8, iArr, connectionsManager);
                        } else {
                            klVar.run(ph.ab.b);
                        }
                        if (z11 && e6Var != null) {
                            d2Var.setOnCancelListener(new ph.wa(e6Var, i11));
                            break;
                        }
                    }
                }
                break;
            default:
                m6 m6Var = (m6) this.c;
                boolean z12 = this.b;
                if (!((Boolean) obj).booleanValue()) {
                    m6Var.run(null);
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
                                    Context context = LaunchActivity.D1;
                                    if (context == null) {
                                        context = ApplicationLoader.applicationContext;
                                    }
                                    if (context != null) {
                                        try {
                                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
                                            alertDialog$Builder.m(R.raw.permission_request_location, 72, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.L5, false), null);
                                            alertDialog$Builder.a.Q = LocaleController.getString(R.string.GpsDisabledAlertText);
                                            alertDialog$Builder.k(LocaleController.getString(R.string.Enable), new j3.o(context, i10));
                                            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                                            alertDialog$Builder.o();
                                        } catch (Exception e) {
                                            FileLog.e(e);
                                        }
                                    }
                                } else {
                                    try {
                                        final Utilities.Callback[] callbackArr = {m6Var};
                                        final LocationListener[] locationListenerArr = {null};
                                        LocationListener locationListener = new LocationListener() { // from class: ph.ya
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
                                    } catch (Exception e6) {
                                        FileLog.e(e6);
                                        m6Var.run(null);
                                        return;
                                    }
                                }
                            }
                            m6Var.run(location2);
                            break;
                        }
                    }
                    if (location2 == null) {
                        if (locationManager.isProviderEnabled("gps")) {
                        }
                    }
                    m6Var.run(location2);
                }
        }
    }
}
