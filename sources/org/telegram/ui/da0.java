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

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final /* synthetic */ class da0 implements q0.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ pa0 b;

    public /* synthetic */ da0(pa0 pa0Var, int i7) {
        this.a = i7;
        this.b = pa0Var;
    }

    @Override // q0.a
    public final void accept(Object obj) {
        ImageView imageView;
        org.telegram.messenger.rd h;
        int i7;
        switch (this.a) {
            case 0:
                pa0 pa0Var = this.b;
                pa0Var.E = (org.telegram.messenger.fa) obj;
                int i10 = org.telegram.messenger.g0.B(pa0Var.getThemedColor(org.telegram.ui.ActionBar.k6.d6)) < 0.721f ? R.raw.mapstyle_night : 0;
                int i11 = 1;
                if (i10 != 0) {
                    pa0Var.h0 = true;
                    pa0Var.E.i(((nb.a) org.telegram.messenger.t0.k()).loadRawResourceStyle(org.telegram.messenger.t0.b, i10));
                }
                pa0Var.E.o(org.telegram.messenger.g0.L(70.0f), 0, org.telegram.messenger.g0.L(70.0f), pa0Var.t0());
                int i12 = 5;
                if (pa0Var.E != null) {
                    ((bi.x5) ((a8.r7) pa0Var.G).b).animate().alpha(1.0f).setStartDelay(200L).setDuration(100L).setUpdateListener(new a3(pa0Var, 15)).start();
                    float f10 = pa0Var.O0 ? pa0Var.E.f() + 4.0f : pa0Var.E.e() - 4.0f;
                    TLRPC.TL_channelLocation tL_channelLocation = pa0Var.B0;
                    if (tL_channelLocation != null) {
                        TLRPC.GeoPoint geoPoint = tL_channelLocation.geo_point;
                        double d = geoPoint.lat;
                        double d2 = geoPoint._long;
                        la0 la0Var = new la0();
                        if (org.telegram.messenger.m5.E(pa0Var.l0)) {
                            la0Var.c = pa0Var.getMessagesController().a2(Long.valueOf(pa0Var.l0));
                        } else {
                            la0Var.d = pa0Var.getMessagesController().M0(Long.valueOf(-pa0Var.l0));
                        }
                        la0Var.a = pa0Var.l0;
                        pa0Var.H0(la0Var);
                        try {
                            gf.g gVar = (gf.g) ((nb.a) org.telegram.messenger.t0.k()).onCreateMarkerOptions();
                            ((m8.g) gVar.b).a = new LatLng(d, d2);
                            Bitmap n02 = pa0Var.n0(la0Var);
                            if (n02 != null) {
                                ((m8.g) gVar.b).d = c8.q9.a(n02);
                                m8.g gVar2 = (m8.g) gVar.b;
                                gVar2.e = 0.5f;
                                gVar2.f = 0.907f;
                                la0Var.e = pa0Var.E.a(gVar);
                                if (!org.telegram.messenger.t10.B(la0Var.c)) {
                                    gf.g gVar3 = (gf.g) ((nb.a) org.telegram.messenger.t0.k()).onCreateMarkerOptions();
                                    ((m8.g) gVar3.b).a = new LatLng(d, d2);
                                    m8.g gVar4 = (m8.g) gVar3.b;
                                    gVar4.r = true;
                                    gVar4.d = c8.q9.b(R.drawable.map_pin_circle);
                                    m8.g gVar5 = (m8.g) gVar3.b;
                                    gVar5.e = 0.5f;
                                    gVar5.f = 0.5f;
                                    la0Var.f = pa0Var.E.a(gVar3);
                                }
                                pa0Var.n0.add(la0Var);
                                pa0Var.o0.k(la0Var, la0Var.a);
                            }
                        } catch (Exception e10) {
                            org.telegram.messenger.a8.g(e10, true);
                        }
                        pa0Var.E.h(((nb.a) org.telegram.messenger.t0.k()).newCameraUpdateLatLngZoom(la0Var.e.a(), f10));
                    } else {
                        org.telegram.messenger.ij ijVar = pa0Var.D0;
                        if (ijVar == null) {
                            Location location = new Location("network");
                            pa0Var.z0 = location;
                            TLRPC.TL_channelLocation tL_channelLocation2 = pa0Var.C0;
                            if (tL_channelLocation2 != null) {
                                TLRPC.GeoPoint geoPoint2 = tL_channelLocation2.geo_point;
                                pa0Var.E.h(((nb.a) org.telegram.messenger.t0.k()).newCameraUpdateLatLngZoom(new org.telegram.messenger.cb(geoPoint2.lat, geoPoint2._long), f10));
                                pa0Var.z0.setLatitude(pa0Var.C0.geo_point.lat);
                                pa0Var.z0.setLongitude(pa0Var.C0.geo_point._long);
                                pa0Var.z0.setAccuracy(pa0Var.C0.geo_point.accuracy_radius);
                                pa0Var.P.L(pa0Var.z0);
                            } else {
                                location.setLatitude(20.659322d);
                                pa0Var.z0.setLongitude(-11.40625d);
                            }
                        } else if (ijVar.D3()) {
                            la0 i02 = pa0Var.i0(pa0Var.D0.k);
                            if (!pa0Var.v0()) {
                                pa0Var.E.h(((nb.a) org.telegram.messenger.t0.k()).newCameraUpdateLatLngZoom(i02.e.a(), f10));
                            }
                        } else {
                            double latitude = pa0Var.z0.getLatitude();
                            double longitude = pa0Var.z0.getLongitude();
                            org.telegram.messenger.cb cbVar = new org.telegram.messenger.cb(latitude, longitude);
                            try {
                                org.telegram.messenger.fa faVar = pa0Var.E;
                                gf.g gVar6 = (gf.g) ((nb.a) org.telegram.messenger.t0.k()).onCreateMarkerOptions();
                                ((m8.g) gVar6.b).a = new LatLng(latitude, longitude);
                                ((m8.g) gVar6.b).d = c8.q9.b(R.drawable.map_pin2);
                                faVar.a(gVar6);
                            } catch (Exception e11) {
                                org.telegram.messenger.a8.g(e11, true);
                            }
                            pa0Var.E.h(((nb.a) org.telegram.messenger.t0.k()).newCameraUpdateLatLngZoom(cbVar, f10));
                            pa0Var.m0 = false;
                            pa0Var.v0();
                        }
                    }
                    try {
                        pa0Var.E.k(true);
                    } catch (Exception e12) {
                        org.telegram.messenger.a8.g(e12, false);
                    }
                    pa0Var.E.g().Z1();
                    pa0Var.E.g().d2();
                    pa0Var.E.g().X1();
                    pa0Var.E.l(new aa0(pa0Var, i12));
                    pa0Var.E.n(new da0(pa0Var, i11));
                    pa0Var.E.m(new org.telegram.ui.Components.il0(26));
                    org.telegram.messenger.fa faVar2 = pa0Var.E;
                    x90 x90Var = new x90(pa0Var, 6);
                    wf.b bVar = faVar2.a;
                    org.telegram.messenger.p1 p1Var = new org.telegram.messenger.p1(x90Var, 6);
                    l8.e eVar = (l8.e) bVar.b;
                    try {
                        k8.c cVar = new k8.c(p1Var, (char) 0);
                        Parcel P0 = eVar.P0();
                        v7.b.c(P0, cVar);
                        eVar.T0(P0, 97);
                        LocationManager locationManager = (LocationManager) org.telegram.messenger.t0.b.getSystemService("location");
                        List<String> providers = locationManager.getProviders(true);
                        Location location2 = null;
                        for (int size = providers.size() - 1; size >= 0; size--) {
                            location2 = locationManager.getLastKnownLocation(providers.get(size));
                            if (location2 != null) {
                                pa0Var.y0 = location2;
                                pa0Var.E0(location2);
                                if (pa0Var.i0 && pa0Var.getParentActivity() != null) {
                                    pa0Var.i0 = false;
                                    pa0Var.l0();
                                }
                                imageView = pa0Var.c;
                                if (imageView != null && imageView.getVisibility() == 0 && (h = pa0Var.getLocationController().h(pa0Var.l0)) != null && (i7 = h.f) > 0) {
                                    pa0Var.m0(i7);
                                }
                            }
                        }
                        pa0Var.y0 = location2;
                        pa0Var.E0(location2);
                        if (pa0Var.i0) {
                            pa0Var.i0 = false;
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
                org.telegram.messenger.g0.h3(new x90(pa0Var, 5));
                return;
            default:
                pa0 pa0Var2 = this.b;
                Location location3 = (Location) obj;
                pa0Var2.E0(location3);
                pa0Var2.getLocationController().n(location3, pa0Var2.k0);
                pa0Var2.k0 = false;
                return;
        }
    }
}
