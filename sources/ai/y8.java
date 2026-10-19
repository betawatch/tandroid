package ai;

import android.app.Activity;
import android.content.Context;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.text.TextUtils;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
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
import org.telegram.ui.Components.a91;
import org.telegram.ui.Components.b91;
import org.telegram.ui.Components.c91;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.jz0;
import org.telegram.ui.qn;
import org.telegram.ui.x70;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes4.dex */
public final /* synthetic */ class y8 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ y8(int i10, Object obj, boolean z10) {
        this.a = i10;
        this.c = obj;
        this.b = z10;
    }

    /* JADX WARN: Removed duplicated region for block: B:75:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0190 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // org.telegram.messenger.Utilities.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run(Object obj) {
        int[] iArr;
        b91 b91Var;
        ei.p6 p6Var = null;
        r4 = false;
        boolean z10 = false;
        switch (this.a) {
            case 0:
                ga gaVar = (ga) this.c;
                HashSet hashSet = (HashSet) obj;
                if (this.b) {
                    SendMessagesHelper.getInstance(gaVar.a).cancelSendingMessage(new ArrayList<>(hashSet));
                    break;
                } else {
                    gaVar.getClass();
                    break;
                }
            case 1:
                ci.q4 q4Var = (ci.q4) this.c;
                boolean z11 = this.b;
                ci.r3 r3Var = q4Var.c1;
                org.telegram.ui.ActionBar.d6 d6Var = q4Var.B0;
                new org.telegram.ui.Components.xc(r3Var, d6Var).o(z11 ? org.telegram.ui.Components.wc.h : org.telegram.ui.Components.wc.e, d6Var).j();
                break;
            case 2:
                Utilities.Callback callback = (Utilities.Callback) this.c;
                boolean z12 = this.b;
                Location location = (Location) obj;
                if (location == null) {
                    callback.run(null);
                    break;
                } else {
                    Activity activity = LaunchActivity.H1;
                    if (activity == null) {
                        activity = AndroidUtilities.findActivity(ApplicationLoader.applicationContext);
                    }
                    if (activity == null || activity.isFinishing()) {
                        callback.run(null);
                        break;
                    } else {
                        org.telegram.ui.ActionBar.b2 b2Var = z12 ? new org.telegram.ui.ActionBar.b2(activity, 3, new ci.b()) : null;
                        if (z12) {
                            b2Var.r(200L);
                        }
                        double latitude = location.getLatitude();
                        double longitude = location.getLongitude();
                        ei.oc ocVar = new ei.oc(z12, b2Var, callback, r4 ? 1 : 0);
                        Date date = new Date();
                        Calendar calendar = Calendar.getInstance(DesugarTimeZone.getTimeZone("UTC"));
                        calendar.setTime(date);
                        String str = Math.round(latitude * 1000.0d) + ":" + Math.round(longitude * 1000.0d) + "at" + (((calendar.getTimeInMillis() / 1000) / 60) / 60);
                        if (ei.uc.b == null || !TextUtils.equals(ei.uc.a, str)) {
                            int[] iArr2 = new int[1];
                            MessagesController messagesController = MessagesController.getInstance(UserConfig.selectedAccount);
                            ConnectionsManager connectionsManager = ConnectionsManager.getInstance(UserConfig.selectedAccount);
                            String str2 = messagesController.weatherSearchUsername;
                            TLRPC.User[] userArr = {messagesController.getUser(str2)};
                            ei.qc qcVar = new ei.qc(messagesController, userArr, latitude, longitude, iArr2, connectionsManager, ocVar, str);
                            if (userArr[0] == null) {
                                TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername = new TLRPC.TL_contacts_resolveUsername();
                                tL_contacts_resolveUsername.username = str2;
                                iArr = iArr2;
                                iArr[0] = connectionsManager.sendRequest(tL_contacts_resolveUsername, new s9(iArr2, messagesController, userArr, qcVar, ocVar, 1));
                            } else {
                                iArr = iArr2;
                                qcVar.run();
                            }
                            p6Var = new ei.p6(13, iArr, connectionsManager);
                        } else {
                            ocVar.run(ei.uc.b);
                        }
                        if (z12 && p6Var != null) {
                            b2Var.setOnCancelListener(new ei.pc(p6Var, r4 ? 1 : 0));
                            break;
                        }
                    }
                }
                break;
            case 3:
                y8 y8Var = (y8) this.c;
                boolean z13 = this.b;
                if (!((Boolean) obj).booleanValue()) {
                    y8Var.run(null);
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
                                    Context context = LaunchActivity.H1;
                                    if (context == null) {
                                        context = ApplicationLoader.applicationContext;
                                    }
                                    if (context != null) {
                                        try {
                                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
                                            alertDialog$Builder.m(R.raw.permission_request_location, 72, org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.L5, false), null);
                                            alertDialog$Builder.a.T = LocaleController.getString(R.string.GpsDisabledAlertText);
                                            alertDialog$Builder.k(LocaleController.getString(R.string.Enable), new ei.rc(context, r4 ? 1 : 0));
                                            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                                            alertDialog$Builder.o();
                                        } catch (Exception e) {
                                            FileLog.e(e);
                                        }
                                    }
                                } else {
                                    try {
                                        final Utilities.Callback[] callbackArr = {y8Var};
                                        final LocationListener[] locationListenerArr = {null};
                                        LocationListener locationListener = new LocationListener() { // from class: ei.sc
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
                                        y8Var.run(null);
                                        return;
                                    }
                                }
                            }
                            y8Var.run(location2);
                            break;
                        }
                    }
                    if (location2 == null) {
                        if (locationManager.isProviderEnabled("gps")) {
                        }
                    }
                    y8Var.run(location2);
                }
            case 4:
                org.telegram.ui.rc rcVar = (org.telegram.ui.rc) this.c;
                boolean z14 = this.b;
                View view = (View) obj;
                org.telegram.ui.qc qcVar2 = (org.telegram.ui.qc) view;
                rcVar.b.getClass();
                r4 = RecyclerView.R(view) == rcVar.e;
                qcVar2.s = r4;
                if (!z14) {
                    qcVar2.v.f(r4, true);
                }
                qcVar2.invalidate();
                break;
            case 5:
                qn qnVar = (qn) this.c;
                boolean z15 = this.b;
                View view2 = (View) obj;
                if (view2 instanceof org.telegram.ui.Cells.u1) {
                    org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) view2;
                    if (u1Var.E8 && u1Var.G8) {
                        z10 = true;
                    }
                    if (z10 != z15 && qnVar.G9()) {
                        u1Var.E8 = z15;
                        u1Var.G8 = qnVar.G9();
                        u1Var.n8 = true;
                        u1Var.forceLayout();
                        break;
                    }
                } else if (view2 instanceof org.telegram.ui.Cells.w0) {
                    ((org.telegram.ui.Cells.w0) view2).e0 = z15;
                    break;
                }
                break;
            case 6:
                c91 c91Var = (c91) this.c;
                boolean z16 = this.b;
                View view3 = (View) obj;
                c91Var.v.getClass();
                int R = RecyclerView.R(view3);
                if (view3 instanceof a91) {
                    ((a91) view3).setReordering(z16 && (b91Var = c91Var.y) != null && ((l2.f) b91Var).z(R));
                    break;
                }
                break;
            case 7:
                View view4 = (View) this.c;
                boolean z17 = this.b;
                if (((Boolean) obj).booleanValue()) {
                    ((org.telegram.ui.Cells.v8) view4).setChecked(!z17);
                    break;
                }
                break;
            case 8:
                jz0 jz0Var = (jz0) this.c;
                boolean z18 = this.b;
                ProfileActivity profileActivity = jz0Var.b;
                if (profileActivity.getParentActivity() != null) {
                    org.telegram.ui.Components.xc.a0(profileActivity).o(z18 ? org.telegram.ui.Components.wc.h : org.telegram.ui.Components.wc.e, null).j();
                    break;
                }
                break;
            case 9:
                AndroidUtilities.runOnUIThread(new x70((org.telegram.ui.web.k) this.c, (String) obj, this.b, 15));
                break;
            default:
                org.telegram.ui.web.x1 x1Var = (org.telegram.ui.web.x1) this.c;
                x1Var.getMessagesController().addWebBrowserException((String) obj, this.b);
                x1Var.a.W2.N(true);
                break;
        }
    }
}
