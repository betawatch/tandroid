// default package

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.location.Location;
import android.location.LocationManager;
import android.os.Parcel;
import android.os.RemoteException;
import android.view.View;
import android.widget.ImageView;
import com.google.android.gms.maps.model.LatLng;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.telegram.messenger.a;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.ProxyListActivity;
import org.telegram.ui.m;
import org.telegram.ui.o;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class hw implements pt2 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ hw(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:142:0x046f, code lost:
    
        if (r4 == 0) goto L130;
     */
    @Override // pt2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void accept(Object obj) {
        zh6 zh6Var;
        ImageView imageView;
        hd6 h;
        int i;
        byte b = this.a;
        byte b2 = 2;
        Location location = null;
        byte b3 = 0;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                m mVar = (m) obj2;
                Float f = (Float) obj;
                o oVar = mVar.M;
                if (mVar == oVar.v0[0]) {
                    if (oVar.i0.e0.getCurrentProgress() > f.floatValue()) {
                        oVar.i0.e0.a(false, 0.0f);
                    }
                    oVar.i0.e0.a(true, f.floatValue());
                    break;
                }
                break;
            case 1:
                xw0 xw0Var = (xw0) obj2;
                Float f2 = (Float) obj;
                xw0Var.F.setLoadProgressAnimated(f2.floatValue());
                if (f2.floatValue() == 1.0f) {
                    ValueAnimator duration = ValueAnimator.ofFloat(1.0f, 0.0f).setDuration(200L);
                    duration.setInterpolator(k43.f);
                    duration.addUpdateListener(new vv0(xw0Var, (byte) 1));
                    duration.addListener(new h0(xw0Var, (byte) 25));
                    duration.start();
                    break;
                }
                break;
            case 2:
                v21 v21Var = (v21) obj2;
                Float f3 = (Float) obj;
                r11 r11Var = v21Var.q;
                if (r11Var != null) {
                    if (!v21Var.e.top) {
                        r11Var.b(r13.getHeight() - f3.floatValue());
                        break;
                    }
                }
                break;
            case 3:
                ((o39) obj2).d((List) obj);
                break;
            case 4:
                l12 l12Var = ((n12) obj2).W3;
                if (l12Var != null) {
                    l12Var.e0(obj);
                    break;
                }
                break;
            case 5:
                j22 j22Var = (j22) obj2;
                Float f4 = (Float) obj;
                j22Var.J.setLoadProgressAnimated(f4.floatValue());
                if (f4.floatValue() == 1.0f) {
                    ValueAnimator duration2 = ValueAnimator.ofFloat(1.0f, 0.0f).setDuration(200L);
                    duration2.setInterpolator(k43.f);
                    duration2.addUpdateListener(new z12(j22Var, b3));
                    duration2.addListener(new jb1((Object) j22Var, (byte) 14));
                    duration2.start();
                    j22Var.P();
                    break;
                }
                break;
            case 6:
                TLRPC.User user = (TLRPC.User) obj;
                bg2 bg2Var = ((sf2) obj2).b;
                vf2 A0 = bg2Var.A0();
                ArrayList arrayList = bg2Var.F;
                zh6 zh6Var2 = bg2Var.M;
                ArrayList arrayList2 = (zh6Var2 == null || zh6Var2.m() == 0) ? arrayList : bg2Var.H;
                if (zh6Var2 != null) {
                    int m = zh6Var2.m();
                    zh6Var = zh6Var2;
                    break;
                }
                zh6Var = bg2Var.K;
                if (zh6Var.f(user.id) == null) {
                    if (xc2.T(bg2Var.n)) {
                        TLRPC.TL_channelParticipant tL_channelParticipant = new TLRPC.TL_channelParticipant();
                        tL_channelParticipant.inviter_id = bg2Var.getUserConfig().e();
                        TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                        tL_channelParticipant.peer = tL_peerUser;
                        tL_peerUser.user_id = user.id;
                        tL_channelParticipant.date = bg2Var.getConnectionsManager().getCurrentTime();
                        arrayList2.add(0, tL_channelParticipant);
                        zh6Var.k(user.id, tL_channelParticipant);
                    } else {
                        TLRPC.TL_chatParticipant tL_chatParticipant = new TLRPC.TL_chatParticipant();
                        tL_chatParticipant.user_id = user.id;
                        tL_chatParticipant.inviter_id = bg2Var.getUserConfig().e();
                        arrayList2.add(0, tL_chatParticipant);
                        zh6Var.k(user.id, tL_chatParticipant);
                    }
                }
                if (arrayList2 == arrayList) {
                    Collections.sort(arrayList, new ta((byte) 26));
                }
                bg2Var.D0(A0);
                break;
            case 7:
                rx rxVar = (rx) obj2;
                int intValue = ((Integer) obj).intValue();
                switch (rxVar.a) {
                    case 6:
                        hc8 hc8Var = (hc8) rxVar.d;
                        hc8Var.y0(false);
                        a78 a78Var = hc8Var.F1;
                        a78Var.h(intValue, true);
                        a78Var.g();
                        hc8Var.setNewColor(intValue);
                        sy5 sy5Var = hc8Var.q1;
                        sy5Var.setSelectedColorIndex(a78Var.d());
                        sy5Var.getAdapter().f();
                        break;
                    default:
                        vab vabVar = (vab) rxVar.d;
                        vabVar.H0(false);
                        a78 a78Var2 = (a78) rxVar.c;
                        a78Var2.h(intValue, true);
                        a78Var2.g();
                        vabVar.setNewColor(intValue);
                        pw7 pw7Var = vabVar.g1;
                        pw7Var.setSelectedColorIndex(a78Var2.d());
                        pw7Var.getAdapter().f();
                        break;
                }
            case 8:
                ((gk3) obj2).S.T4(((Float) obj).floatValue());
                break;
            case 9:
                uc6 uc6Var = (uc6) obj2;
                uc6Var.F = (x05) obj;
                int i2 = hl.B(uc6Var.getThemedColor(aob.d6)) < 0.721f ? R.raw.mapstyle_night : 0;
                if (i2 != 0) {
                    uc6Var.i0 = true;
                    uc6Var.F.i(((z3f) a.j()).loadRawResourceStyle(a.b, i2));
                }
                uc6Var.F.n(hl.L(70.0f), 0, hl.L(70.0f), uc6Var.n0());
                if (uc6Var.F != null) {
                    ((tt) ((am2) uc6Var.H).b).animate().alpha(1.0f).setStartDelay(200L).setDuration(100L).setUpdateListener(new ch4(uc6Var, (byte) 24)).start();
                    boolean z = uc6Var.U0;
                    x05 x05Var = uc6Var.F;
                    float f5 = z ? x05Var.f() + 4.0f : x05Var.e() - 4.0f;
                    TLRPC.TL_channelLocation tL_channelLocation = uc6Var.H0;
                    if (tL_channelLocation != null) {
                        TLRPC.GeoPoint geoPoint = tL_channelLocation.geo_point;
                        double d = geoPoint.lat;
                        double d2 = geoPoint._long;
                        pc6 pc6Var = new pc6();
                        if (wf3.D(uc6Var.m0)) {
                            pc6Var.c = uc6Var.getMessagesController().X1(Long.valueOf(uc6Var.m0));
                        } else {
                            pc6Var.d = uc6Var.getMessagesController().M0(Long.valueOf(-uc6Var.m0));
                        }
                        pc6Var.a = uc6Var.m0;
                        uc6Var.H0(pc6Var);
                        try {
                            xh4 xh4Var = (xh4) ((z3f) a.j()).onCreateMarkerOptions();
                            ((el6) xh4Var.b).a = new LatLng(d, d2);
                            Bitmap h0 = uc6Var.h0(pc6Var);
                            if (h0 != null) {
                                ((el6) xh4Var.b).d = usd.a(h0);
                                el6 el6Var = (el6) xh4Var.b;
                                el6Var.e = 0.5f;
                                el6Var.f = 0.8010882f;
                                pc6Var.e = uc6Var.F.a(xh4Var);
                                if (!lbc.D(pc6Var.c)) {
                                    xh4 xh4Var2 = (xh4) ((z3f) a.j()).onCreateMarkerOptions();
                                    ((el6) xh4Var2.b).a = new LatLng(d, d2);
                                    el6 el6Var2 = (el6) xh4Var2.b;
                                    el6Var2.r = true;
                                    el6Var2.d = usd.b(R.drawable.map_pin_circle);
                                    el6 el6Var3 = (el6) xh4Var2.b;
                                    el6Var3.e = 0.5f;
                                    el6Var3.f = 0.5f;
                                    pc6Var.f = uc6Var.F.a(xh4Var2);
                                }
                                uc6Var.o0.add(pc6Var);
                                uc6Var.p0.k(pc6Var.a, pc6Var);
                            }
                        } catch (Exception e) {
                            cc4.g(e, true);
                        }
                        uc6Var.F.h(((z3f) a.j()).newCameraUpdateLatLngZoom(pc6Var.e.a(), f5));
                    } else {
                        r47 r47Var = uc6Var.J0;
                        if (r47Var == null) {
                            Location location2 = new Location("network");
                            uc6Var.A0 = location2;
                            TLRPC.TL_channelLocation tL_channelLocation2 = uc6Var.I0;
                            if (tL_channelLocation2 != null) {
                                TLRPC.GeoPoint geoPoint2 = tL_channelLocation2.geo_point;
                                uc6Var.F.h(((z3f) a.j()).newCameraUpdateLatLngZoom(new ak5(geoPoint2.lat, geoPoint2._long), f5));
                                uc6Var.A0.setLatitude(uc6Var.I0.geo_point.lat);
                                uc6Var.A0.setLongitude(uc6Var.I0.geo_point._long);
                                uc6Var.A0.setAccuracy(uc6Var.I0.geo_point.accuracy_radius);
                                uc6Var.Q.L(uc6Var.A0);
                            } else {
                                location2.setLatitude(20.659322d);
                                uc6Var.A0.setLongitude(-11.40625d);
                            }
                        } else if (r47Var.C3()) {
                            pc6 b0 = uc6Var.b0(uc6Var.J0.k);
                            if (!uc6Var.p0()) {
                                uc6Var.F.h(((z3f) a.j()).newCameraUpdateLatLngZoom(b0.e.a(), f5));
                            }
                        } else {
                            double latitude = uc6Var.A0.getLatitude();
                            double longitude = uc6Var.A0.getLongitude();
                            ak5 ak5Var = new ak5(latitude, longitude);
                            try {
                                x05 x05Var2 = uc6Var.F;
                                xh4 xh4Var3 = (xh4) ((z3f) a.j()).onCreateMarkerOptions();
                                ((el6) xh4Var3.b).a = new LatLng(latitude, longitude);
                                ((el6) xh4Var3.b).d = usd.b(R.drawable.map_pin2);
                                x05Var2.a(xh4Var3);
                            } catch (Exception e2) {
                                cc4.g(e2, true);
                            }
                            uc6Var.F.h(((z3f) a.j()).newCameraUpdateLatLngZoom(ak5Var, f5));
                            uc6Var.n0 = false;
                            uc6Var.p0();
                        }
                    }
                    uc6Var.F.g().g0();
                    uc6Var.F.g().h0();
                    uc6Var.F.g().f0();
                    uc6Var.F.l(new cc6(uc6Var, (byte) 7));
                    uc6Var.F.m(new c22((byte) 6));
                    x05 x05Var3 = uc6Var.F;
                    dc6 dc6Var = new dc6(uc6Var, (byte) 6);
                    um4 um4Var = x05Var3.a;
                    e05 e05Var = new e05(dc6Var, b2);
                    um4Var.getClass();
                    try {
                        qae qaeVar = (qae) um4Var.b;
                        k9d k9dVar = new k9d(e05Var, (short) 0);
                        Parcel R = qaeVar.R();
                        jld.c(R, k9dVar);
                        qaeVar.V(R, 97);
                        LocationManager locationManager = (LocationManager) a.b.getSystemService("location");
                        List<String> providers = locationManager.getProviders(true);
                        for (int size = providers.size() - 1; size >= 0; size--) {
                            location = locationManager.getLastKnownLocation(providers.get(size));
                            if (location != null) {
                                uc6Var.z0 = location;
                                uc6Var.E0(location);
                                uc6Var.K0();
                                uc6Var.L0();
                                if (uc6Var.j0 && uc6Var.getParentActivity() != null) {
                                    uc6Var.j0 = false;
                                    uc6Var.f0();
                                }
                                imageView = uc6Var.c;
                                if (imageView != null && imageView.getVisibility() == 0 && (h = uc6Var.getLocationController().h(uc6Var.m0)) != null && (i = h.f) > 0) {
                                    uc6Var.g0(i);
                                }
                            }
                        }
                        uc6Var.z0 = location;
                        uc6Var.E0(location);
                        uc6Var.K0();
                        uc6Var.L0();
                        if (uc6Var.j0) {
                            uc6Var.j0 = false;
                            uc6Var.f0();
                        }
                        imageView = uc6Var.c;
                        if (imageView != null) {
                            uc6Var.g0(i);
                        }
                    } catch (RemoteException e3) {
                        p3d.i(e3);
                        return;
                    }
                }
                hl.c3(new dc6(uc6Var, (byte) 5));
                break;
            case 10:
                zj3 zj3Var = (zj3) obj2;
                int i3 = ((gi0) obj).a;
                hl.c3(new z56(zj3Var, i3 != 0 ? di0.i(i3) : null, (byte) 22));
                break;
            case 11:
                ((vab) obj2).w0((Integer) obj);
                break;
            case 12:
                yv1 yv1Var = (yv1) obj2;
                if (((gi0) obj).a == 0) {
                    hl.c3(yv1Var);
                    break;
                }
                break;
            case 13:
                RectF rectF = ProfileActivity.Z6;
                ((ArrayList) obj2).add((TLRPC.User) obj);
                break;
            case 14:
                ProfileActivity profileActivity = (ProfileActivity) obj2;
                TLRPC.User user2 = (TLRPC.User) obj;
                RectF rectF2 = ProfileActivity.Z6;
                for (int i4 = 0; i4 < profileActivity.v2.participants.participants.size(); i4++) {
                    if (profileActivity.v2.participants.participants.get(i4).user_id == user2.id) {
                        profileActivity.v2.participants.participants.remove(i4);
                        profileActivity.Z3(true, false);
                        break;
                    }
                }
                break;
            case 15:
                View view = ((ProxyListActivity) obj2).b.U((View) obj).a;
                if (view instanceof hx8) {
                    hx8 hx8Var = (hx8) view;
                    hx8Var.setChecked(hx8Var.d == xea.x1);
                    hx8Var.b();
                    break;
                }
                break;
            case 16:
                a5a a5aVar = (a5a) obj2;
                if (((gi0) obj).a == 0) {
                    hl.c3(new r4a(a5aVar, r6 ? (byte) 1 : (byte) 0));
                    break;
                }
                break;
            default:
                icc iccVar = (icc) obj2;
                int i5 = ((gi0) obj).a;
                boolean z2 = i5 == 0;
                String i6 = z2 ? null : di0.i(i5);
                cc4.b("StarsController.buy onResult " + z2 + " " + i6);
                hl.c3(new yn6((Object) iccVar, z2, (Object) i6, (byte) 23));
                break;
        }
    }
}
