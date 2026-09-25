package ai;

import android.app.Activity;
import android.content.Context;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.text.TextUtils;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import ci.ed;
import ci.fd;
import ci.gd;
import ci.hd;
import ci.id;
import ci.ld;
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
import org.telegram.ui.Components.t81;
import org.telegram.ui.Components.u81;
import org.telegram.ui.Components.v81;
import org.telegram.ui.Components.wc;
import org.telegram.ui.Components.xc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.da0;
import org.telegram.ui.wn;
import org.telegram.ui.yz0;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes4.dex */
public final /* synthetic */ class i3 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ i3(int i10, Object obj, boolean z10) {
        this.a = i10;
        this.c = obj;
        this.b = z10;
    }

    /* JADX WARN: Removed duplicated region for block: B:76:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0197 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // org.telegram.messenger.Utilities.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run(Object obj) {
        int[] iArr;
        u81 u81Var;
        ci.y8 y8Var = null;
        r4 = false;
        boolean z10 = false;
        switch (this.a) {
            case 0:
                e6 e6Var = (e6) this.c;
                boolean z11 = this.b;
                a5 a5Var = e6Var.c1;
                org.telegram.ui.ActionBar.d6 d6Var = e6Var.B0;
                new xc(a5Var, d6Var).o(z11 ? wc.h : wc.e, d6Var).j();
                break;
            case 1:
                Utilities.Callback callback = (Utilities.Callback) this.c;
                boolean z12 = this.b;
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
                        org.telegram.ui.ActionBar.a2 a2Var = z12 ? new org.telegram.ui.ActionBar.a2(activity, 3, new d()) : null;
                        if (z12) {
                            a2Var.q(200L);
                        }
                        double latitude = location.getLatitude();
                        double longitude = location.getLongitude();
                        ed edVar = new ed(z12, a2Var, callback, r4 ? 1 : 0);
                        Date date = new Date();
                        Calendar calendar = Calendar.getInstance(DesugarTimeZone.getTimeZone("UTC"));
                        calendar.setTime(date);
                        String str = Math.round(latitude * 1000.0d) + ":" + Math.round(longitude * 1000.0d) + "at" + (((calendar.getTimeInMillis() / 1000) / 60) / 60);
                        if (ld.b == null || !TextUtils.equals(ld.a, str)) {
                            int[] iArr2 = new int[1];
                            MessagesController messagesController = MessagesController.getInstance(UserConfig.selectedAccount);
                            ConnectionsManager connectionsManager = ConnectionsManager.getInstance(UserConfig.selectedAccount);
                            String str2 = messagesController.weatherSearchUsername;
                            TLRPC.User[] userArr = {messagesController.getUser(str2)};
                            gd gdVar = new gd(messagesController, userArr, latitude, longitude, iArr2, connectionsManager, edVar, str);
                            if (userArr[0] == null) {
                                TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername = new TLRPC.TL_contacts_resolveUsername();
                                tL_contacts_resolveUsername.username = str2;
                                iArr = iArr2;
                                iArr[0] = connectionsManager.sendRequest(tL_contacts_resolveUsername, new hd(iArr2, messagesController, userArr, gdVar, edVar, 0));
                            } else {
                                iArr = iArr2;
                                gdVar.run();
                            }
                            y8Var = new ci.y8(4, iArr, connectionsManager);
                        } else {
                            edVar.run(ld.b);
                        }
                        if (z12 && y8Var != null) {
                            a2Var.setOnCancelListener(new fd(y8Var, r4 ? 1 : 0));
                            break;
                        }
                    }
                }
                break;
            case 2:
                i3 i3Var = (i3) this.c;
                boolean z13 = this.b;
                if (!((Boolean) obj).booleanValue()) {
                    i3Var.run(null);
                    break;
                } else {
                    final LocationManager locationManager = (LocationManager) ApplicationLoader.applicationContext.getSystemService("location");
                    List<String> providers = locationManager.getProviders(true);
                    Location location2 = null;
                    for (int size = providers.size() - 1; size >= 0; size--) {
                        location2 = locationManager.getLastKnownLocation(providers.get(size));
                        if (location2 != null) {
                            if (location2 == null && z13) {
                                if (locationManager.isProviderEnabled("gps")) {
                                    Context context = LaunchActivity.G1;
                                    if (context == null) {
                                        context = ApplicationLoader.applicationContext;
                                    }
                                    if (context != null) {
                                        try {
                                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
                                            alertDialog$Builder.m(R.raw.permission_request_location, 72, org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.L5, false), null);
                                            alertDialog$Builder.a.T = LocaleController.getString(R.string.GpsDisabledAlertText);
                                            alertDialog$Builder.k(LocaleController.getString(R.string.Enable), new id(context, r4 ? 1 : 0));
                                            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                                            alertDialog$Builder.o();
                                        } catch (Exception e) {
                                            FileLog.e(e);
                                        }
                                    }
                                } else {
                                    try {
                                        final Utilities.Callback[] callbackArr = {i3Var};
                                        final LocationListener[] locationListenerArr = {null};
                                        LocationListener locationListener = new LocationListener() { // from class: ci.jd
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
                                        i3Var.run(null);
                                        return;
                                    }
                                }
                            }
                            i3Var.run(location2);
                            break;
                        }
                    }
                    if (location2 == null) {
                        if (locationManager.isProviderEnabled("gps")) {
                        }
                    }
                    i3Var.run(location2);
                }
            case 3:
                org.telegram.ui.rc rcVar = (org.telegram.ui.rc) this.c;
                boolean z14 = this.b;
                View view = (View) obj;
                org.telegram.ui.qc qcVar = (org.telegram.ui.qc) view;
                rcVar.b.getClass();
                r4 = RecyclerView.R(view) == rcVar.e;
                qcVar.s = r4;
                if (!z14) {
                    qcVar.v.f(r4, true);
                }
                qcVar.invalidate();
                break;
            case 4:
                wn wnVar = (wn) this.c;
                boolean z15 = this.b;
                View view2 = (View) obj;
                if (view2 instanceof org.telegram.ui.Cells.u1) {
                    org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) view2;
                    if (u1Var.E8 && u1Var.G8) {
                        z10 = true;
                    }
                    if (z10 != z15 && wnVar.B9()) {
                        u1Var.E8 = z15;
                        u1Var.G8 = wnVar.B9();
                        u1Var.n8 = true;
                        u1Var.forceLayout();
                        break;
                    }
                } else if (view2 instanceof org.telegram.ui.Cells.w0) {
                    ((org.telegram.ui.Cells.w0) view2).e0 = z15;
                    break;
                }
                break;
            case 5:
                v81 v81Var = (v81) this.c;
                boolean z16 = this.b;
                View view3 = (View) obj;
                v81Var.v.getClass();
                int R = RecyclerView.R(view3);
                if (view3 instanceof t81) {
                    ((t81) view3).setReordering(z16 && (u81Var = v81Var.y) != null && ((l.d) u81Var).G(R));
                    break;
                }
                break;
            case 6:
                yz0 yz0Var = (yz0) this.c;
                boolean z17 = this.b;
                ProfileActivity profileActivity = yz0Var.b;
                if (profileActivity.getParentActivity() != null) {
                    xc.a0(profileActivity).o(z17 ? wc.h : wc.e, null).j();
                    break;
                }
                break;
            case 7:
                AndroidUtilities.runOnUIThread(new da0((org.telegram.ui.web.k) this.c, (String) obj, this.b, 11));
                break;
            case 8:
                org.telegram.ui.web.z1 z1Var = (org.telegram.ui.web.z1) this.c;
                z1Var.getMessagesController().addWebBrowserException((String) obj, this.b);
                z1Var.a.Y2.N(true);
                break;
            default:
                yh.s5 s5Var = (yh.s5) this.c;
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
