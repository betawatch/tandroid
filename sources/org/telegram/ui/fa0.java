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

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class fa0 implements q0.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ ra0 b;

    public /* synthetic */ fa0(ra0 ra0Var, int i7) {
        this.a = i7;
        this.b = ra0Var;
    }

    @Override // q0.a
    public final void accept(Object obj) {
        ImageView imageView;
        org.telegram.messenger.rd h;
        int i7;
        switch (this.a) {
            case 0:
                ra0 ra0Var = this.b;
                ra0Var.E = (org.telegram.messenger.fa) obj;
                int i10 = org.telegram.messenger.g0.B(ra0Var.getThemedColor(org.telegram.ui.ActionBar.l6.d6)) < 0.721f ? R.raw.mapstyle_night : 0;
                int i11 = 1;
                if (i10 != 0) {
                    ra0Var.h0 = true;
                    ra0Var.E.i(((nb.a) org.telegram.messenger.t0.k()).loadRawResourceStyle(org.telegram.messenger.t0.b, i10));
                }
                ra0Var.E.o(org.telegram.messenger.g0.L(70.0f), 0, org.telegram.messenger.g0.L(70.0f), ra0Var.t0());
                int i12 = 5;
                if (ra0Var.E != null) {
                    ((bi.x5) ((a8.r7) ra0Var.G).b).animate().alpha(1.0f).setStartDelay(200L).setDuration(100L).setUpdateListener(new a3(ra0Var, 15)).start();
                    float f10 = ra0Var.O0 ? ra0Var.E.f() + 4.0f : ra0Var.E.e() - 4.0f;
                    TLRPC.TL_channelLocation tL_channelLocation = ra0Var.B0;
                    if (tL_channelLocation != null) {
                        TLRPC.GeoPoint geoPoint = tL_channelLocation.geo_point;
                        double d = geoPoint.lat;
                        double d2 = geoPoint._long;
                        na0 na0Var = new na0();
                        if (org.telegram.messenger.m5.E(ra0Var.l0)) {
                            na0Var.c = ra0Var.getMessagesController().a2(Long.valueOf(ra0Var.l0));
                        } else {
                            na0Var.d = ra0Var.getMessagesController().M0(Long.valueOf(-ra0Var.l0));
                        }
                        na0Var.a = ra0Var.l0;
                        ra0Var.H0(na0Var);
                        try {
                            gf.g gVar = (gf.g) ((nb.a) org.telegram.messenger.t0.k()).onCreateMarkerOptions();
                            ((m8.g) gVar.b).a = new LatLng(d, d2);
                            Bitmap n02 = ra0Var.n0(na0Var);
                            if (n02 != null) {
                                ((m8.g) gVar.b).d = c8.q9.a(n02);
                                m8.g gVar2 = (m8.g) gVar.b;
                                gVar2.e = 0.5f;
                                gVar2.f = 0.907f;
                                na0Var.e = ra0Var.E.a(gVar);
                                if (!org.telegram.messenger.t10.B(na0Var.c)) {
                                    gf.g gVar3 = (gf.g) ((nb.a) org.telegram.messenger.t0.k()).onCreateMarkerOptions();
                                    ((m8.g) gVar3.b).a = new LatLng(d, d2);
                                    m8.g gVar4 = (m8.g) gVar3.b;
                                    gVar4.r = true;
                                    gVar4.d = c8.q9.b(R.drawable.map_pin_circle);
                                    m8.g gVar5 = (m8.g) gVar3.b;
                                    gVar5.e = 0.5f;
                                    gVar5.f = 0.5f;
                                    na0Var.f = ra0Var.E.a(gVar3);
                                }
                                ra0Var.n0.add(na0Var);
                                ra0Var.o0.k(na0Var, na0Var.a);
                            }
                        } catch (Exception e10) {
                            org.telegram.messenger.a8.g(e10, true);
                        }
                        ra0Var.E.h(((nb.a) org.telegram.messenger.t0.k()).newCameraUpdateLatLngZoom(na0Var.e.a(), f10));
                    } else {
                        org.telegram.messenger.ij ijVar = ra0Var.D0;
                        if (ijVar == null) {
                            Location location = new Location("network");
                            ra0Var.z0 = location;
                            TLRPC.TL_channelLocation tL_channelLocation2 = ra0Var.C0;
                            if (tL_channelLocation2 != null) {
                                TLRPC.GeoPoint geoPoint2 = tL_channelLocation2.geo_point;
                                ra0Var.E.h(((nb.a) org.telegram.messenger.t0.k()).newCameraUpdateLatLngZoom(new org.telegram.messenger.cb(geoPoint2.lat, geoPoint2._long), f10));
                                ra0Var.z0.setLatitude(ra0Var.C0.geo_point.lat);
                                ra0Var.z0.setLongitude(ra0Var.C0.geo_point._long);
                                ra0Var.z0.setAccuracy(ra0Var.C0.geo_point.accuracy_radius);
                                ra0Var.P.L(ra0Var.z0);
                            } else {
                                location.setLatitude(20.659322d);
                                ra0Var.z0.setLongitude(-11.40625d);
                            }
                        } else if (ijVar.C3()) {
                            na0 i02 = ra0Var.i0(ra0Var.D0.k);
                            if (!ra0Var.v0()) {
                                ra0Var.E.h(((nb.a) org.telegram.messenger.t0.k()).newCameraUpdateLatLngZoom(i02.e.a(), f10));
                            }
                        } else {
                            double latitude = ra0Var.z0.getLatitude();
                            double longitude = ra0Var.z0.getLongitude();
                            org.telegram.messenger.cb cbVar = new org.telegram.messenger.cb(latitude, longitude);
                            try {
                                org.telegram.messenger.fa faVar = ra0Var.E;
                                gf.g gVar6 = (gf.g) ((nb.a) org.telegram.messenger.t0.k()).onCreateMarkerOptions();
                                ((m8.g) gVar6.b).a = new LatLng(latitude, longitude);
                                ((m8.g) gVar6.b).d = c8.q9.b(R.drawable.map_pin2);
                                faVar.a(gVar6);
                            } catch (Exception e11) {
                                org.telegram.messenger.a8.g(e11, true);
                            }
                            ra0Var.E.h(((nb.a) org.telegram.messenger.t0.k()).newCameraUpdateLatLngZoom(cbVar, f10));
                            ra0Var.m0 = false;
                            ra0Var.v0();
                        }
                    }
                    try {
                        ra0Var.E.k(true);
                    } catch (Exception e12) {
                        org.telegram.messenger.a8.g(e12, false);
                    }
                    ra0Var.E.g().Z1();
                    ra0Var.E.g().d2();
                    ra0Var.E.g().X1();
                    ra0Var.E.l(new ca0(ra0Var, i12));
                    ra0Var.E.n(new fa0(ra0Var, i11));
                    ra0Var.E.m(new org.telegram.ui.Components.jl0(26));
                    org.telegram.messenger.fa faVar2 = ra0Var.E;
                    z90 z90Var = new z90(ra0Var, 6);
                    wf.b bVar = faVar2.a;
                    org.telegram.messenger.j1 j1Var = new org.telegram.messenger.j1(z90Var, 6);
                    l8.e eVar = (l8.e) bVar.b;
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
                                ra0Var.y0 = location2;
                                ra0Var.E0(location2);
                                if (ra0Var.i0 && ra0Var.getParentActivity() != null) {
                                    ra0Var.i0 = false;
                                    ra0Var.l0();
                                }
                                imageView = ra0Var.c;
                                if (imageView != null && imageView.getVisibility() == 0 && (h = ra0Var.getLocationController().h(ra0Var.l0)) != null && (i7 = h.f) > 0) {
                                    ra0Var.m0(i7);
                                }
                            }
                        }
                        ra0Var.y0 = location2;
                        ra0Var.E0(location2);
                        if (ra0Var.i0) {
                            ra0Var.i0 = false;
                            ra0Var.l0();
                        }
                        imageView = ra0Var.c;
                        if (imageView != null) {
                            ra0Var.m0(i7);
                        }
                    } catch (RemoteException e13) {
                        throw new androidx.car.app.j(e13);
                    }
                }
                org.telegram.messenger.g0.h3(new z90(ra0Var, 5));
                return;
            default:
                ra0 ra0Var2 = this.b;
                Location location3 = (Location) obj;
                ra0Var2.E0(location3);
                ra0Var2.getLocationController().n(location3, ra0Var2.k0);
                ra0Var2.k0 = false;
                return;
        }
    }
}
