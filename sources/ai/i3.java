package ai;

import android.app.Activity;
import android.content.Context;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.text.TextUtils;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import ci.dd;
import ci.ed;
import ci.fd;
import ci.gd;
import ci.hd;
import ci.kd;
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
import org.telegram.ui.Components.d91;
import org.telegram.ui.Components.e91;
import org.telegram.ui.Components.f91;
import org.telegram.ui.Components.xc;
import org.telegram.ui.Components.yc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.a01;
import org.telegram.ui.ha0;
import org.telegram.ui.tc;
import org.telegram.ui.yn;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
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
        e91 e91Var;
        ci.x8 x8Var = null;
        r4 = false;
        boolean z10 = false;
        switch (this.a) {
            case 0:
                e6 e6Var = (e6) this.c;
                boolean z11 = this.b;
                a5 a5Var = e6Var.c1;
                org.telegram.ui.ActionBar.d6 d6Var = e6Var.B0;
                new yc(a5Var, d6Var).o(z11 ? xc.h : xc.e, d6Var).j();
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
                        org.telegram.ui.ActionBar.b2 b2Var = z12 ? new org.telegram.ui.ActionBar.b2(activity, 3, new d()) : null;
                        if (z12) {
                            b2Var.q(200L);
                        }
                        double latitude = location.getLatitude();
                        double longitude = location.getLongitude();
                        dd ddVar = new dd(z12, b2Var, callback, r4 ? 1 : 0);
                        Date date = new Date();
                        Calendar calendar = Calendar.getInstance(DesugarTimeZone.getTimeZone("UTC"));
                        calendar.setTime(date);
                        String str = Math.round(latitude * 1000.0d) + ":" + Math.round(longitude * 1000.0d) + "at" + (((calendar.getTimeInMillis() / 1000) / 60) / 60);
                        if (kd.b == null || !TextUtils.equals(kd.a, str)) {
                            int[] iArr2 = new int[1];
                            MessagesController messagesController = MessagesController.getInstance(UserConfig.selectedAccount);
                            ConnectionsManager connectionsManager = ConnectionsManager.getInstance(UserConfig.selectedAccount);
                            String str2 = messagesController.weatherSearchUsername;
                            TLRPC.User[] userArr = {messagesController.getUser(str2)};
                            fd fdVar = new fd(messagesController, userArr, latitude, longitude, iArr2, connectionsManager, ddVar, str);
                            if (userArr[0] == null) {
                                TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername = new TLRPC.TL_contacts_resolveUsername();
                                tL_contacts_resolveUsername.username = str2;
                                iArr = iArr2;
                                iArr[0] = connectionsManager.sendRequest(tL_contacts_resolveUsername, new gd(iArr2, messagesController, userArr, fdVar, ddVar, 0));
                            } else {
                                iArr = iArr2;
                                fdVar.run();
                            }
                            x8Var = new ci.x8(4, iArr, connectionsManager);
                        } else {
                            ddVar.run(kd.b);
                        }
                        if (z12 && x8Var != null) {
                            b2Var.setOnCancelListener(new ed(x8Var, r4 ? 1 : 0));
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
                                            alertDialog$Builder.m(R.raw.permission_request_location, 72, org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.L5, false), null);
                                            alertDialog$Builder.a.T = LocaleController.getString(R.string.GpsDisabledAlertText);
                                            alertDialog$Builder.k(LocaleController.getString(R.string.Enable), new hd(context, r4 ? 1 : 0));
                                            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                                            alertDialog$Builder.o();
                                        } catch (Exception e7) {
                                            FileLog.e(e7);
                                        }
                                    }
                                } else {
                                    try {
                                        final Utilities.Callback[] callbackArr = {i3Var};
                                        final LocationListener[] locationListenerArr = {null};
                                        LocationListener locationListener = new LocationListener() { // from class: ci.id
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
                tc tcVar = (tc) this.c;
                boolean z14 = this.b;
                View view = (View) obj;
                org.telegram.ui.sc scVar = (org.telegram.ui.sc) view;
                tcVar.b.getClass();
                r4 = RecyclerView.R(view) == tcVar.e;
                scVar.s = r4;
                if (!z14) {
                    scVar.v.f(r4, true);
                }
                scVar.invalidate();
                break;
            case 4:
                yn ynVar = (yn) this.c;
                boolean z15 = this.b;
                View view2 = (View) obj;
                if (view2 instanceof org.telegram.ui.Cells.u1) {
                    org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) view2;
                    if (u1Var.E8 && u1Var.G8) {
                        z10 = true;
                    }
                    if (z10 != z15 && ynVar.A9()) {
                        u1Var.E8 = z15;
                        u1Var.G8 = ynVar.A9();
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
                f91 f91Var = (f91) this.c;
                boolean z16 = this.b;
                View view3 = (View) obj;
                f91Var.v.getClass();
                int R = RecyclerView.R(view3);
                if (view3 instanceof d91) {
                    ((d91) view3).setReordering(z16 && (e91Var = f91Var.y) != null && ((n2.c) e91Var).b(R));
                    break;
                }
                break;
            case 6:
                a01 a01Var = (a01) this.c;
                boolean z17 = this.b;
                ProfileActivity profileActivity = a01Var.b;
                if (profileActivity.getParentActivity() != null) {
                    yc.a0(profileActivity).o(z17 ? xc.h : xc.e, null).j();
                    break;
                }
                break;
            case 7:
                AndroidUtilities.runOnUIThread(new ha0((org.telegram.ui.web.k) this.c, (String) obj, this.b, 11));
                break;
            case 8:
                org.telegram.ui.web.a2 a2Var = (org.telegram.ui.web.a2) this.c;
                a2Var.getMessagesController().addWebBrowserException((String) obj, this.b);
                a2Var.a.f3.N(true);
                break;
            default:
                yh.t5 t5Var = (yh.t5) this.c;
                HashSet hashSet = (HashSet) obj;
                if (this.b) {
                    SendMessagesHelper.getInstance(t5Var.a).cancelSendingMessage(new ArrayList<>(hashSet));
                    break;
                } else {
                    t5Var.getClass();
                    break;
                }
        }
    }
}
