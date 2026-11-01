package org.telegram.ui;

import android.graphics.Bitmap;
import android.location.Location;
import android.location.LocationManager;
import android.widget.ImageView;
import com.google.android.gms.maps.model.LatLng;
import java.util.List;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ib0 implements q0.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ xb0 b;

    public /* synthetic */ ib0(xb0 xb0Var, int i10) {
        this.a = i10;
        this.b = xb0Var;
    }

    @Override // q0.a
    public final void accept(Object obj) {
        ImageView imageView;
        org.telegram.messenger.nd h;
        int i10;
        switch (this.a) {
            case 0:
                xb0 xb0Var = this.b;
                xb0Var.G = (org.telegram.messenger.ha) obj;
                int i11 = org.telegram.messenger.i0.B(xb0Var.getThemedColor(org.telegram.ui.ActionBar.t6.d6)) < 0.721f ? R.raw.mapstyle_night : 0;
                int i12 = 1;
                if (i11 != 0) {
                    xb0Var.j0 = true;
                    xb0Var.G.j(((t7.u) org.telegram.messenger.w0.k()).loadRawResourceStyle(org.telegram.messenger.w0.b, i11));
                }
                xb0Var.G.q(org.telegram.messenger.i0.L(70.0f), 0, org.telegram.messenger.i0.L(70.0f), xb0Var.v0());
                if (xb0Var.G != null) {
                    ((fg.i) ((bh.d) xb0Var.I).a).animate().alpha(1.0f).setStartDelay(200L).setDuration(100L).setUpdateListener(new a3(xb0Var, 15)).start();
                    float f7 = xb0Var.V0 ? xb0Var.G.f() + 4.0f : xb0Var.G.e() - 4.0f;
                    TLRPC.TL_channelLocation tL_channelLocation = xb0Var.H0;
                    if (tL_channelLocation != null) {
                        TLRPC.GeoPoint geoPoint = tL_channelLocation.geo_point;
                        double d = geoPoint.lat;
                        double d10 = geoPoint._long;
                        rb0 rb0Var = new rb0();
                        if (org.telegram.messenger.o5.E(xb0Var.n0)) {
                            rb0Var.c = xb0Var.getMessagesController().Z1(Long.valueOf(xb0Var.n0));
                        } else {
                            rb0Var.d = xb0Var.getMessagesController().L0(Long.valueOf(-xb0Var.n0));
                        }
                        rb0Var.a = xb0Var.n0;
                        xb0Var.K0(rb0Var);
                        try {
                            l2.f fVar = (l2.f) ((t7.u) org.telegram.messenger.w0.k()).onCreateMarkerOptions();
                            ((j8.f) fVar.b).a = new LatLng(d, d10);
                            Bitmap o02 = xb0Var.o0(rb0Var);
                            if (o02 != null) {
                                ((j8.f) fVar.b).d = v7.n8.a(o02);
                                fVar.e(0.907f);
                                rb0Var.e = xb0Var.G.a(fVar);
                                if (!org.telegram.messenger.i20.B(rb0Var.c)) {
                                    l2.f fVar2 = (l2.f) ((t7.u) org.telegram.messenger.w0.k()).onCreateMarkerOptions();
                                    ((j8.f) fVar2.b).a = new LatLng(d, d10);
                                    j8.f fVar3 = (j8.f) fVar2.b;
                                    fVar3.r = true;
                                    fVar3.d = v7.n8.b(R.drawable.map_pin_circle);
                                    fVar2.e(0.5f);
                                    rb0Var.f = xb0Var.G.a(fVar2);
                                }
                                xb0Var.p0.add(rb0Var);
                                xb0Var.q0.k(rb0Var, rb0Var.a);
                            }
                        } catch (Exception e) {
                            org.telegram.messenger.f8.g(e, true);
                        }
                        xb0Var.G.i(((t7.u) org.telegram.messenger.w0.k()).newCameraUpdateLatLngZoom(rb0Var.e.a(), f7));
                    } else {
                        org.telegram.messenger.kj kjVar = xb0Var.J0;
                        if (kjVar == null) {
                            Location location = new Location("network");
                            xb0Var.F0 = location;
                            TLRPC.TL_channelLocation tL_channelLocation2 = xb0Var.I0;
                            if (tL_channelLocation2 != null) {
                                TLRPC.GeoPoint geoPoint2 = tL_channelLocation2.geo_point;
                                xb0Var.G.i(((t7.u) org.telegram.messenger.w0.k()).newCameraUpdateLatLngZoom(new org.telegram.messenger.db(geoPoint2.lat, geoPoint2._long), f7));
                                xb0Var.F0.setLatitude(xb0Var.I0.geo_point.lat);
                                xb0Var.F0.setLongitude(xb0Var.I0.geo_point._long);
                                xb0Var.F0.setAccuracy(xb0Var.I0.geo_point.accuracy_radius);
                                xb0Var.R.M(xb0Var.F0);
                            } else {
                                location.setLatitude(20.659322d);
                                xb0Var.F0.setLongitude(-11.40625d);
                            }
                        } else if (kjVar.C3()) {
                            rb0 i02 = xb0Var.i0(xb0Var.J0.k);
                            if (!xb0Var.x0()) {
                                xb0Var.G.i(((t7.u) org.telegram.messenger.w0.k()).newCameraUpdateLatLngZoom(i02.e.a(), f7));
                            }
                        } else {
                            double latitude = xb0Var.F0.getLatitude();
                            double longitude = xb0Var.F0.getLongitude();
                            org.telegram.messenger.db dbVar = new org.telegram.messenger.db(latitude, longitude);
                            try {
                                org.telegram.messenger.ha haVar = xb0Var.G;
                                l2.f fVar4 = (l2.f) ((t7.u) org.telegram.messenger.w0.k()).onCreateMarkerOptions();
                                ((j8.f) fVar4.b).a = new LatLng(latitude, longitude);
                                ((j8.f) fVar4.b).d = v7.n8.b(R.drawable.map_pin2);
                                haVar.a(fVar4);
                            } catch (Exception e7) {
                                org.telegram.messenger.f8.g(e7, true);
                            }
                            xb0Var.G.i(((t7.u) org.telegram.messenger.w0.k()).newCameraUpdateLatLngZoom(dbVar, f7));
                            xb0Var.o0 = false;
                            xb0Var.x0();
                        }
                    }
                    try {
                        xb0Var.G.l(true);
                    } catch (Exception e10) {
                        org.telegram.messenger.f8.g(e10, false);
                    }
                    xb0Var.G.h().u0();
                    xb0Var.G.h().v0();
                    xb0Var.G.h().t0();
                    xb0Var.G.n(new eb0(xb0Var, 4));
                    xb0Var.G.p(new ib0(xb0Var, i12));
                    xb0Var.G.o(new m4.l0(xb0Var, f7));
                    xb0Var.G.m(new bb0(xb0Var, 6));
                    LocationManager locationManager = (LocationManager) org.telegram.messenger.w0.b.getSystemService("location");
                    List<String> providers = locationManager.getProviders(true);
                    Location location2 = null;
                    for (int size = providers.size() - 1; size >= 0; size--) {
                        location2 = locationManager.getLastKnownLocation(providers.get(size));
                        if (location2 != null) {
                            xb0Var.E0 = location2;
                            xb0Var.G0(location2);
                            if (xb0Var.k0 && xb0Var.getParentActivity() != null) {
                                xb0Var.k0 = false;
                                xb0Var.l0();
                            }
                            imageView = xb0Var.c;
                            if (imageView != null && imageView.getVisibility() == 0 && (h = xb0Var.getLocationController().h(xb0Var.n0)) != null && (i10 = h.f) > 0) {
                                xb0Var.m0(i10);
                            }
                        }
                    }
                    xb0Var.E0 = location2;
                    xb0Var.G0(location2);
                    if (xb0Var.k0) {
                        xb0Var.k0 = false;
                        xb0Var.l0();
                    }
                    imageView = xb0Var.c;
                    if (imageView != null) {
                        xb0Var.m0(i10);
                    }
                }
                org.telegram.messenger.i0.g3(new bb0(xb0Var, 5));
                break;
            default:
                xb0 xb0Var2 = this.b;
                Location location3 = (Location) obj;
                xb0Var2.G0(location3);
                xb0Var2.getLocationController().n(location3, xb0Var2.m0);
                xb0Var2.m0 = false;
                break;
        }
    }
}
