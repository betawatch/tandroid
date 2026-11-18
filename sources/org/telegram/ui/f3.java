package org.telegram.ui;

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
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class f3 implements q0.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ f3(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:121:0x03d2, code lost:
    
        if (r7 != 0) goto L118;
     */
    @Override // q0.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void accept(Object obj) {
        a0.h hVar;
        ImageView imageView;
        org.telegram.messenger.pd h;
        int i7;
        int i10 = 3;
        Location location = null;
        switch (this.a) {
            case 0:
                k3 k3Var = (k3) this.b;
                Float f10 = (Float) obj;
                g4 g4Var = k3Var.M;
                if (k3Var == g4Var.v0[0]) {
                    if (g4Var.i0.e0.getCurrentProgress() > f10.floatValue()) {
                        g4Var.i0.e0.a(false, 0.0f);
                    }
                    g4Var.i0.e0.a(true, f10.floatValue());
                    return;
                }
                return;
            case 1:
                ((org.telegram.ui.Components.ei0) this.b).h((List) obj);
                return;
            case 2:
                TLRPC.User user = (TLRPC.User) obj;
                rq rqVar = ((iq) this.b).b;
                lq B0 = rqVar.B0();
                ArrayList arrayList = rqVar.F;
                a0.h hVar2 = rqVar.M;
                ArrayList arrayList2 = (hVar2 == null || hVar2.m() == 0) ? arrayList : rqVar.H;
                if (hVar2 != null) {
                    int m10 = hVar2.m();
                    hVar = hVar2;
                    break;
                }
                hVar = rqVar.K;
                if (hVar.f(user.id) == null) {
                    if (org.telegram.messenger.v3.T(rqVar.n)) {
                        TLRPC.TL_channelParticipant tL_channelParticipant = new TLRPC.TL_channelParticipant();
                        tL_channelParticipant.inviter_id = rqVar.getUserConfig().e();
                        TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                        tL_channelParticipant.peer = tL_peerUser;
                        tL_peerUser.user_id = user.id;
                        tL_channelParticipant.date = rqVar.getConnectionsManager().getCurrentTime();
                        arrayList2.add(0, tL_channelParticipant);
                        hVar.k(tL_channelParticipant, user.id);
                    } else {
                        TLRPC.TL_chatParticipant tL_chatParticipant = new TLRPC.TL_chatParticipant();
                        tL_chatParticipant.user_id = user.id;
                        tL_chatParticipant.inviter_id = rqVar.getUserConfig().e();
                        arrayList2.add(0, tL_chatParticipant);
                        hVar.k(tL_chatParticipant, user.id);
                    }
                }
                if (arrayList2 == arrayList) {
                    Collections.sort(arrayList, new pe(i10));
                }
                rqVar.F0(B0);
                return;
            case 3:
                pa0 pa0Var = (pa0) this.b;
                pa0Var.F = (org.telegram.messenger.da) obj;
                int i11 = org.telegram.messenger.g0.B(pa0Var.getThemedColor(org.telegram.ui.ActionBar.n6.d6)) < 0.721f ? R.raw.mapstyle_night : 0;
                if (i11 != 0) {
                    pa0Var.i0 = true;
                    pa0Var.F.i(((pb.b) org.telegram.messenger.t0.k()).loadRawResourceStyle(org.telegram.messenger.t0.b, i11));
                }
                pa0Var.F.n(org.telegram.messenger.g0.L(70.0f), 0, org.telegram.messenger.g0.L(70.0f), pa0Var.t0());
                if (pa0Var.F != null) {
                    ((ai.k0) ((a8.r7) pa0Var.H).b).animate().alpha(1.0f).setStartDelay(200L).setDuration(100L).setUpdateListener(new a3(pa0Var, 15)).start();
                    float f11 = pa0Var.U0 ? pa0Var.F.f() + 4.0f : pa0Var.F.e() - 4.0f;
                    TLRPC.TL_channelLocation tL_channelLocation = pa0Var.H0;
                    if (tL_channelLocation != null) {
                        TLRPC.GeoPoint geoPoint = tL_channelLocation.geo_point;
                        double d = geoPoint.lat;
                        double d2 = geoPoint._long;
                        la0 la0Var = new la0();
                        if (org.telegram.messenger.n5.E(pa0Var.m0)) {
                            la0Var.c = pa0Var.getMessagesController().c2(Long.valueOf(pa0Var.m0));
                        } else {
                            la0Var.d = pa0Var.getMessagesController().O0(Long.valueOf(-pa0Var.m0));
                        }
                        la0Var.a = pa0Var.m0;
                        pa0Var.H0(la0Var);
                        try {
                            h9.g1 g1Var = (h9.g1) ((pb.b) org.telegram.messenger.t0.k()).onCreateMarkerOptions();
                            ((m8.g) g1Var.b).a = new LatLng(d, d2);
                            Bitmap n02 = pa0Var.n0(la0Var);
                            if (n02 != null) {
                                ((m8.g) g1Var.b).d = c8.r9.a(n02);
                                m8.g gVar = (m8.g) g1Var.b;
                                gVar.e = 0.5f;
                                gVar.f = 0.8010882f;
                                la0Var.e = pa0Var.F.a(g1Var);
                                if (!org.telegram.messenger.o10.C(la0Var.c)) {
                                    h9.g1 g1Var2 = (h9.g1) ((pb.b) org.telegram.messenger.t0.k()).onCreateMarkerOptions();
                                    ((m8.g) g1Var2.b).a = new LatLng(d, d2);
                                    m8.g gVar2 = (m8.g) g1Var2.b;
                                    gVar2.r = true;
                                    gVar2.d = c8.r9.b(R.drawable.map_pin_circle);
                                    m8.g gVar3 = (m8.g) g1Var2.b;
                                    gVar3.e = 0.5f;
                                    gVar3.f = 0.5f;
                                    la0Var.f = pa0Var.F.a(g1Var2);
                                }
                                pa0Var.o0.add(la0Var);
                                pa0Var.p0.k(la0Var, la0Var.a);
                            }
                        } catch (Exception e10) {
                            org.telegram.messenger.a8.g(e10, true);
                        }
                        pa0Var.F.h(((pb.b) org.telegram.messenger.t0.k()).newCameraUpdateLatLngZoom(la0Var.e.a(), f11));
                    } else {
                        org.telegram.messenger.fj fjVar = pa0Var.J0;
                        if (fjVar == null) {
                            Location location2 = new Location("network");
                            pa0Var.A0 = location2;
                            TLRPC.TL_channelLocation tL_channelLocation2 = pa0Var.I0;
                            if (tL_channelLocation2 != null) {
                                TLRPC.GeoPoint geoPoint2 = tL_channelLocation2.geo_point;
                                pa0Var.F.h(((pb.b) org.telegram.messenger.t0.k()).newCameraUpdateLatLngZoom(new org.telegram.messenger.ab(geoPoint2.lat, geoPoint2._long), f11));
                                pa0Var.A0.setLatitude(pa0Var.I0.geo_point.lat);
                                pa0Var.A0.setLongitude(pa0Var.I0.geo_point._long);
                                pa0Var.A0.setAccuracy(pa0Var.I0.geo_point.accuracy_radius);
                                pa0Var.Q.L(pa0Var.A0);
                            } else {
                                location2.setLatitude(20.659322d);
                                pa0Var.A0.setLongitude(-11.40625d);
                            }
                        } else if (fjVar.C3()) {
                            la0 i02 = pa0Var.i0(pa0Var.J0.k);
                            if (!pa0Var.v0()) {
                                pa0Var.F.h(((pb.b) org.telegram.messenger.t0.k()).newCameraUpdateLatLngZoom(i02.e.a(), f11));
                            }
                        } else {
                            double latitude = pa0Var.A0.getLatitude();
                            double longitude = pa0Var.A0.getLongitude();
                            org.telegram.messenger.ab abVar = new org.telegram.messenger.ab(latitude, longitude);
                            try {
                                org.telegram.messenger.da daVar = pa0Var.F;
                                h9.g1 g1Var3 = (h9.g1) ((pb.b) org.telegram.messenger.t0.k()).onCreateMarkerOptions();
                                ((m8.g) g1Var3.b).a = new LatLng(latitude, longitude);
                                ((m8.g) g1Var3.b).d = c8.r9.b(R.drawable.map_pin2);
                                daVar.a(g1Var3);
                            } catch (Exception e11) {
                                org.telegram.messenger.a8.g(e11, true);
                            }
                            pa0Var.F.h(((pb.b) org.telegram.messenger.t0.k()).newCameraUpdateLatLngZoom(abVar, f11));
                            pa0Var.n0 = false;
                            pa0Var.v0();
                        }
                    }
                    pa0Var.F.g().w2();
                    pa0Var.F.g().B2();
                    pa0Var.F.g().r2();
                    pa0Var.F.l(new ca0(pa0Var, 7));
                    pa0Var.F.m(new l60(i10));
                    org.telegram.messenger.da daVar2 = pa0Var.F;
                    z90 z90Var = new z90(pa0Var, 6);
                    k8.a aVar = daVar2.a;
                    org.telegram.messenger.j1 j1Var = new org.telegram.messenger.j1(z90Var, 7);
                    l8.e eVar = (l8.e) aVar.b;
                    try {
                        k8.c cVar = new k8.c(j1Var, 0);
                        Parcel p12 = eVar.p1();
                        v7.b.c(p12, cVar);
                        eVar.t1(p12, 97);
                        LocationManager locationManager = (LocationManager) org.telegram.messenger.t0.b.getSystemService("location");
                        List<String> providers = locationManager.getProviders(true);
                        for (int size = providers.size() - 1; size >= 0; size--) {
                            location = locationManager.getLastKnownLocation(providers.get(size));
                            if (location != null) {
                                pa0Var.z0 = location;
                                pa0Var.E0(location);
                                pa0Var.K0();
                                pa0Var.L0();
                                if (pa0Var.j0 && pa0Var.getParentActivity() != null) {
                                    pa0Var.j0 = false;
                                    pa0Var.l0();
                                }
                                imageView = pa0Var.c;
                                if (imageView != null && imageView.getVisibility() == 0 && (h = pa0Var.getLocationController().h(pa0Var.m0)) != null && (i7 = h.f) > 0) {
                                    pa0Var.m0(i7);
                                }
                            }
                        }
                        pa0Var.z0 = location;
                        pa0Var.E0(location);
                        pa0Var.K0();
                        pa0Var.L0();
                        if (pa0Var.j0) {
                            pa0Var.j0 = false;
                            pa0Var.l0();
                        }
                        imageView = pa0Var.c;
                        if (imageView != null) {
                            pa0Var.m0(i7);
                        }
                    } catch (RemoteException e12) {
                        throw new androidx.car.app.j(e12);
                    }
                }
                org.telegram.messenger.g0.g3(new z90(pa0Var, 5));
                return;
            case 4:
                r3 r3Var = (r3) this.b;
                int i12 = ((f5.f) obj).a;
                org.telegram.messenger.g0.g3(new n60(25, r3Var, i12 != 0 ? org.telegram.messenger.r1.j(i12) : null));
                return;
            case 5:
                wf0 wf0Var = (wf0) this.b;
                if (((f5.f) obj).a == 0) {
                    org.telegram.messenger.g0.g3(wf0Var);
                    return;
                }
                return;
            case 6:
                RectF rectF = ProfileActivity.Z6;
                ((ArrayList) this.b).add((TLRPC.User) obj);
                return;
            case 7:
                ProfileActivity profileActivity = (ProfileActivity) this.b;
                TLRPC.User user2 = (TLRPC.User) obj;
                for (int i13 = 0; i13 < profileActivity.v2.participants.participants.size(); i13++) {
                    if (profileActivity.v2.participants.participants.get(i13).user_id == user2.id) {
                        profileActivity.v2.participants.participants.remove(i13);
                        profileActivity.H5(true, false);
                        return;
                    }
                }
                return;
            default:
                View view = ((ProxyListActivity) this.b).b.T((View) obj).a;
                if (view instanceof rx0) {
                    rx0 rx0Var = (rx0) view;
                    rx0Var.setChecked(rx0Var.d == org.telegram.messenger.bz.B1);
                    rx0Var.b();
                    return;
                }
                return;
        }
    }
}
