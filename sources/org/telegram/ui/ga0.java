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

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ga0 implements q0.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ sa0 b;

    public /* synthetic */ ga0(sa0 sa0Var, int i7) {
        this.a = i7;
        this.b = sa0Var;
    }

    @Override // q0.a
    public final void accept(Object obj) {
        ImageView imageView;
        org.telegram.messenger.rd h;
        int i7;
        switch (this.a) {
            case 0:
                sa0 sa0Var = this.b;
                sa0Var.E = (org.telegram.messenger.fa) obj;
                int i10 = org.telegram.messenger.g0.B(sa0Var.getThemedColor(org.telegram.ui.ActionBar.m6.d6)) < 0.721f ? R.raw.mapstyle_night : 0;
                int i11 = 1;
                if (i10 != 0) {
                    sa0Var.h0 = true;
                    sa0Var.E.i(((nb.a) org.telegram.messenger.t0.k()).loadRawResourceStyle(org.telegram.messenger.t0.b, i10));
                }
                sa0Var.E.o(org.telegram.messenger.g0.L(70.0f), 0, org.telegram.messenger.g0.L(70.0f), sa0Var.t0());
                int i12 = 5;
                if (sa0Var.E != null) {
                    ((bi.x5) ((a8.r7) sa0Var.G).b).animate().alpha(1.0f).setStartDelay(200L).setDuration(100L).setUpdateListener(new a3(sa0Var, 15)).start();
                    float f10 = sa0Var.O0 ? sa0Var.E.f() + 4.0f : sa0Var.E.e() - 4.0f;
                    TLRPC.TL_channelLocation tL_channelLocation = sa0Var.B0;
                    if (tL_channelLocation != null) {
                        TLRPC.GeoPoint geoPoint = tL_channelLocation.geo_point;
                        double d = geoPoint.lat;
                        double d2 = geoPoint._long;
                        oa0 oa0Var = new oa0();
                        if (org.telegram.messenger.m5.E(sa0Var.l0)) {
                            oa0Var.c = sa0Var.getMessagesController().a2(Long.valueOf(sa0Var.l0));
                        } else {
                            oa0Var.d = sa0Var.getMessagesController().M0(Long.valueOf(-sa0Var.l0));
                        }
                        oa0Var.a = sa0Var.l0;
                        sa0Var.H0(oa0Var);
                        try {
                            gf.g gVar = (gf.g) ((nb.a) org.telegram.messenger.t0.k()).onCreateMarkerOptions();
                            ((m8.g) gVar.b).a = new LatLng(d, d2);
                            Bitmap n02 = sa0Var.n0(oa0Var);
                            if (n02 != null) {
                                ((m8.g) gVar.b).d = c8.q9.a(n02);
                                m8.g gVar2 = (m8.g) gVar.b;
                                gVar2.e = 0.5f;
                                gVar2.f = 0.907f;
                                oa0Var.e = sa0Var.E.a(gVar);
                                if (!org.telegram.messenger.t10.B(oa0Var.c)) {
                                    gf.g gVar3 = (gf.g) ((nb.a) org.telegram.messenger.t0.k()).onCreateMarkerOptions();
                                    ((m8.g) gVar3.b).a = new LatLng(d, d2);
                                    m8.g gVar4 = (m8.g) gVar3.b;
                                    gVar4.r = true;
                                    gVar4.d = c8.q9.b(R.drawable.map_pin_circle);
                                    m8.g gVar5 = (m8.g) gVar3.b;
                                    gVar5.e = 0.5f;
                                    gVar5.f = 0.5f;
                                    oa0Var.f = sa0Var.E.a(gVar3);
                                }
                                sa0Var.n0.add(oa0Var);
                                sa0Var.o0.k(oa0Var, oa0Var.a);
                            }
                        } catch (Exception e10) {
                            org.telegram.messenger.a8.g(e10, true);
                        }
                        sa0Var.E.h(((nb.a) org.telegram.messenger.t0.k()).newCameraUpdateLatLngZoom(oa0Var.e.a(), f10));
                    } else {
                        org.telegram.messenger.ij ijVar = sa0Var.D0;
                        if (ijVar == null) {
                            Location location = new Location("network");
                            sa0Var.z0 = location;
                            TLRPC.TL_channelLocation tL_channelLocation2 = sa0Var.C0;
                            if (tL_channelLocation2 != null) {
                                TLRPC.GeoPoint geoPoint2 = tL_channelLocation2.geo_point;
                                sa0Var.E.h(((nb.a) org.telegram.messenger.t0.k()).newCameraUpdateLatLngZoom(new org.telegram.messenger.cb(geoPoint2.lat, geoPoint2._long), f10));
                                sa0Var.z0.setLatitude(sa0Var.C0.geo_point.lat);
                                sa0Var.z0.setLongitude(sa0Var.C0.geo_point._long);
                                sa0Var.z0.setAccuracy(sa0Var.C0.geo_point.accuracy_radius);
                                sa0Var.P.L(sa0Var.z0);
                            } else {
                                location.setLatitude(20.659322d);
                                sa0Var.z0.setLongitude(-11.40625d);
                            }
                        } else if (ijVar.C3()) {
                            oa0 i02 = sa0Var.i0(sa0Var.D0.k);
                            if (!sa0Var.v0()) {
                                sa0Var.E.h(((nb.a) org.telegram.messenger.t0.k()).newCameraUpdateLatLngZoom(i02.e.a(), f10));
                            }
                        } else {
                            double latitude = sa0Var.z0.getLatitude();
                            double longitude = sa0Var.z0.getLongitude();
                            org.telegram.messenger.cb cbVar = new org.telegram.messenger.cb(latitude, longitude);
                            try {
                                org.telegram.messenger.fa faVar = sa0Var.E;
                                gf.g gVar6 = (gf.g) ((nb.a) org.telegram.messenger.t0.k()).onCreateMarkerOptions();
                                ((m8.g) gVar6.b).a = new LatLng(latitude, longitude);
                                ((m8.g) gVar6.b).d = c8.q9.b(R.drawable.map_pin2);
                                faVar.a(gVar6);
                            } catch (Exception e11) {
                                org.telegram.messenger.a8.g(e11, true);
                            }
                            sa0Var.E.h(((nb.a) org.telegram.messenger.t0.k()).newCameraUpdateLatLngZoom(cbVar, f10));
                            sa0Var.m0 = false;
                            sa0Var.v0();
                        }
                    }
                    try {
                        sa0Var.E.k(true);
                    } catch (Exception e12) {
                        org.telegram.messenger.a8.g(e12, false);
                    }
                    sa0Var.E.g().Z1();
                    sa0Var.E.g().d2();
                    sa0Var.E.g().X1();
                    sa0Var.E.l(new da0(sa0Var, i12));
                    sa0Var.E.n(new ga0(sa0Var, i11));
                    sa0Var.E.m(new org.telegram.ui.Components.il0(26));
                    org.telegram.messenger.fa faVar2 = sa0Var.E;
                    aa0 aa0Var = new aa0(sa0Var, 6);
                    wf.b bVar = faVar2.a;
                    org.telegram.messenger.j1 j1Var = new org.telegram.messenger.j1(aa0Var, 6);
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
                                sa0Var.y0 = location2;
                                sa0Var.E0(location2);
                                if (sa0Var.i0 && sa0Var.getParentActivity() != null) {
                                    sa0Var.i0 = false;
                                    sa0Var.l0();
                                }
                                imageView = sa0Var.c;
                                if (imageView != null && imageView.getVisibility() == 0 && (h = sa0Var.getLocationController().h(sa0Var.l0)) != null && (i7 = h.f) > 0) {
                                    sa0Var.m0(i7);
                                }
                            }
                        }
                        sa0Var.y0 = location2;
                        sa0Var.E0(location2);
                        if (sa0Var.i0) {
                            sa0Var.i0 = false;
                            sa0Var.l0();
                        }
                        imageView = sa0Var.c;
                        if (imageView != null) {
                            sa0Var.m0(i7);
                        }
                    } catch (RemoteException e13) {
                        throw new androidx.car.app.j(e13);
                    }
                }
                org.telegram.messenger.g0.h3(new aa0(sa0Var, 5));
                return;
            default:
                sa0 sa0Var2 = this.b;
                Location location3 = (Location) obj;
                sa0Var2.E0(location3);
                sa0Var2.getLocationController().n(location3, sa0Var2.k0);
                sa0Var2.k0 = false;
                return;
        }
    }
}
