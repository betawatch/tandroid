package org.telegram.ui;

import android.graphics.Bitmap;
import android.location.Location;
import android.location.LocationManager;
import android.os.Parcel;
import android.os.RemoteException;
import android.widget.ImageView;
import com.google.android.gms.maps.model.LatLng;
import java.util.List;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class ea0 implements q0.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ pa0 b;

    public /* synthetic */ ea0(pa0 pa0Var, int i7) {
        this.a = i7;
        this.b = pa0Var;
    }

    @Override // q0.a
    public final void accept(Object obj) {
        ImageView imageView;
        org.telegram.messenger.qd h;
        int i7;
        switch (this.a) {
            case 0:
                pa0 pa0Var = this.b;
                pa0Var.F = (org.telegram.messenger.ea) obj;
                int i10 = org.telegram.messenger.g0.B(pa0Var.getThemedColor(org.telegram.ui.ActionBar.j6.d6)) < 0.721f ? R.raw.mapstyle_night : 0;
                int i11 = 1;
                if (i10 != 0) {
                    pa0Var.i0 = true;
                    pa0Var.F.i(((pb.b) org.telegram.messenger.t0.k()).loadRawResourceStyle(org.telegram.messenger.t0.b, i10));
                }
                pa0Var.F.o(org.telegram.messenger.g0.L(70.0f), 0, org.telegram.messenger.g0.L(70.0f), pa0Var.t0());
                int i12 = 5;
                if (pa0Var.F != null) {
                    ((ai.k0) ((a8.r7) pa0Var.H).b).animate().alpha(1.0f).setStartDelay(200L).setDuration(100L).setUpdateListener(new a3(pa0Var, 15)).start();
                    float f10 = pa0Var.P0 ? pa0Var.F.f() + 4.0f : pa0Var.F.e() - 4.0f;
                    TLRPC.TL_channelLocation tL_channelLocation = pa0Var.C0;
                    if (tL_channelLocation != null) {
                        TLRPC.GeoPoint geoPoint = tL_channelLocation.geo_point;
                        double d = geoPoint.lat;
                        double d2 = geoPoint._long;
                        la0 la0Var = new la0();
                        if (org.telegram.messenger.m5.E(pa0Var.m0)) {
                            la0Var.c = pa0Var.getMessagesController().a2(Long.valueOf(pa0Var.m0));
                        } else {
                            la0Var.d = pa0Var.getMessagesController().M0(Long.valueOf(-pa0Var.m0));
                        }
                        la0Var.a = pa0Var.m0;
                        pa0Var.H0(la0Var);
                        try {
                            hi.l0 l0Var = (hi.l0) ((pb.b) org.telegram.messenger.t0.k()).onCreateMarkerOptions();
                            ((m8.g) l0Var.b).a = new LatLng(d, d2);
                            Bitmap n02 = pa0Var.n0(la0Var);
                            if (n02 != null) {
                                ((m8.g) l0Var.b).d = c8.p9.a(n02);
                                m8.g gVar = (m8.g) l0Var.b;
                                gVar.e = 0.5f;
                                gVar.f = 0.907f;
                                la0Var.e = pa0Var.F.a(l0Var);
                                if (!org.telegram.messenger.q10.B(la0Var.c)) {
                                    hi.l0 l0Var2 = (hi.l0) ((pb.b) org.telegram.messenger.t0.k()).onCreateMarkerOptions();
                                    ((m8.g) l0Var2.b).a = new LatLng(d, d2);
                                    m8.g gVar2 = (m8.g) l0Var2.b;
                                    gVar2.r = true;
                                    gVar2.d = c8.p9.b(R.drawable.map_pin_circle);
                                    m8.g gVar3 = (m8.g) l0Var2.b;
                                    gVar3.e = 0.5f;
                                    gVar3.f = 0.5f;
                                    la0Var.f = pa0Var.F.a(l0Var2);
                                }
                                pa0Var.o0.add(la0Var);
                                pa0Var.p0.k(la0Var, la0Var.a);
                            }
                        } catch (Exception e10) {
                            org.telegram.messenger.a8.g(e10, true);
                        }
                        pa0Var.F.h(((pb.b) org.telegram.messenger.t0.k()).newCameraUpdateLatLngZoom(la0Var.e.a(), f10));
                    } else {
                        org.telegram.messenger.gj gjVar = pa0Var.E0;
                        if (gjVar == null) {
                            Location location = new Location("network");
                            pa0Var.A0 = location;
                            TLRPC.TL_channelLocation tL_channelLocation2 = pa0Var.D0;
                            if (tL_channelLocation2 != null) {
                                TLRPC.GeoPoint geoPoint2 = tL_channelLocation2.geo_point;
                                pa0Var.F.h(((pb.b) org.telegram.messenger.t0.k()).newCameraUpdateLatLngZoom(new org.telegram.messenger.bb(geoPoint2.lat, geoPoint2._long), f10));
                                pa0Var.A0.setLatitude(pa0Var.D0.geo_point.lat);
                                pa0Var.A0.setLongitude(pa0Var.D0.geo_point._long);
                                pa0Var.A0.setAccuracy(pa0Var.D0.geo_point.accuracy_radius);
                                pa0Var.Q.L(pa0Var.A0);
                            } else {
                                location.setLatitude(20.659322d);
                                pa0Var.A0.setLongitude(-11.40625d);
                            }
                        } else if (gjVar.C3()) {
                            la0 i02 = pa0Var.i0(pa0Var.E0.k);
                            if (!pa0Var.v0()) {
                                pa0Var.F.h(((pb.b) org.telegram.messenger.t0.k()).newCameraUpdateLatLngZoom(i02.e.a(), f10));
                            }
                        } else {
                            double latitude = pa0Var.A0.getLatitude();
                            double longitude = pa0Var.A0.getLongitude();
                            org.telegram.messenger.bb bbVar = new org.telegram.messenger.bb(latitude, longitude);
                            try {
                                org.telegram.messenger.ea eaVar = pa0Var.F;
                                hi.l0 l0Var3 = (hi.l0) ((pb.b) org.telegram.messenger.t0.k()).onCreateMarkerOptions();
                                ((m8.g) l0Var3.b).a = new LatLng(latitude, longitude);
                                ((m8.g) l0Var3.b).d = c8.p9.b(R.drawable.map_pin2);
                                eaVar.a(l0Var3);
                            } catch (Exception e11) {
                                org.telegram.messenger.a8.g(e11, true);
                            }
                            pa0Var.F.h(((pb.b) org.telegram.messenger.t0.k()).newCameraUpdateLatLngZoom(bbVar, f10));
                            pa0Var.n0 = false;
                            pa0Var.v0();
                        }
                    }
                    try {
                        pa0Var.F.k(true);
                    } catch (Exception e12) {
                        org.telegram.messenger.a8.g(e12, false);
                    }
                    pa0Var.F.g().C0();
                    pa0Var.F.g().D0();
                    pa0Var.F.g().B0();
                    pa0Var.F.l(new ba0(pa0Var, i12));
                    pa0Var.F.n(new ea0(pa0Var, i11));
                    pa0Var.F.m(new t70(2));
                    org.telegram.messenger.ea eaVar2 = pa0Var.F;
                    y90 y90Var = new y90(pa0Var, 6);
                    k8.a aVar = eaVar2.a;
                    org.telegram.messenger.j1 j1Var = new org.telegram.messenger.j1(y90Var, 6);
                    l8.e eVar = (l8.e) aVar.b;
                    try {
                        k8.c cVar = new k8.c(j1Var, (char) 0);
                        Parcel p12 = eVar.p1();
                        v7.b.c(p12, cVar);
                        eVar.t1(p12, 97);
                        LocationManager locationManager = (LocationManager) org.telegram.messenger.t0.b.getSystemService("location");
                        List<String> providers = locationManager.getProviders(true);
                        Location location2 = null;
                        for (int size = providers.size() - 1; size >= 0; size--) {
                            location2 = locationManager.getLastKnownLocation(providers.get(size));
                            if (location2 != null) {
                                pa0Var.z0 = location2;
                                pa0Var.E0(location2);
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
                        pa0Var.z0 = location2;
                        pa0Var.E0(location2);
                        if (pa0Var.j0) {
                            pa0Var.j0 = false;
                            pa0Var.l0();
                        }
                        imageView = pa0Var.c;
                        if (imageView != null) {
                            pa0Var.m0(i7);
                        }
                    } catch (RemoteException e13) {
                        throw new androidx.car.app.j(e13);
                    }
                }
                org.telegram.messenger.g0.h3(new y90(pa0Var, 5));
                return;
            default:
                pa0 pa0Var2 = this.b;
                Location location3 = (Location) obj;
                pa0Var2.E0(location3);
                pa0Var2.getLocationController().n(location3, pa0Var2.l0);
                pa0Var2.l0 = false;
                return;
        }
    }
}
