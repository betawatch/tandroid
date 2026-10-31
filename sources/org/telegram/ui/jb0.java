package org.telegram.ui;

import android.graphics.Bitmap;
import android.location.Location;
import android.location.LocationManager;
import android.widget.ImageView;
import com.google.android.gms.maps.model.LatLng;
import java.util.List;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class jb0 implements q0.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ yb0 b;

    public /* synthetic */ jb0(yb0 yb0Var, int i10) {
        this.a = i10;
        this.b = yb0Var;
    }

    @Override // q0.a
    public final void accept(Object obj) {
        ImageView imageView;
        org.telegram.messenger.md h;
        int i10;
        switch (this.a) {
            case 0:
                yb0 yb0Var = this.b;
                yb0Var.G = (org.telegram.messenger.ga) obj;
                int i11 = org.telegram.messenger.i0.B(yb0Var.getThemedColor(org.telegram.ui.ActionBar.t6.d6)) < 0.721f ? R.raw.mapstyle_night : 0;
                int i12 = 1;
                if (i11 != 0) {
                    yb0Var.j0 = true;
                    yb0Var.G.j(((t7.u) org.telegram.messenger.w0.k()).loadRawResourceStyle(org.telegram.messenger.w0.b, i11));
                }
                yb0Var.G.q(org.telegram.messenger.i0.L(70.0f), 0, org.telegram.messenger.i0.L(70.0f), yb0Var.u0());
                if (yb0Var.G != null) {
                    ((fg.i) ((bh.d) yb0Var.I).a).animate().alpha(1.0f).setStartDelay(200L).setDuration(100L).setUpdateListener(new a3(yb0Var, 15)).start();
                    float f7 = yb0Var.V0 ? yb0Var.G.f() + 4.0f : yb0Var.G.e() - 4.0f;
                    TLRPC.TL_channelLocation tL_channelLocation = yb0Var.H0;
                    if (tL_channelLocation != null) {
                        TLRPC.GeoPoint geoPoint = tL_channelLocation.geo_point;
                        double d = geoPoint.lat;
                        double d10 = geoPoint._long;
                        sb0 sb0Var = new sb0();
                        if (org.telegram.messenger.o5.E(yb0Var.n0)) {
                            sb0Var.c = yb0Var.getMessagesController().Z1(Long.valueOf(yb0Var.n0));
                        } else {
                            sb0Var.d = yb0Var.getMessagesController().L0(Long.valueOf(-yb0Var.n0));
                        }
                        sb0Var.a = yb0Var.n0;
                        yb0Var.J0(sb0Var);
                        try {
                            l2.f fVar = (l2.f) ((t7.u) org.telegram.messenger.w0.k()).onCreateMarkerOptions();
                            ((j8.f) fVar.b).a = new LatLng(d, d10);
                            Bitmap n02 = yb0Var.n0(sb0Var);
                            if (n02 != null) {
                                ((j8.f) fVar.b).d = v7.n8.a(n02);
                                fVar.e(0.907f);
                                sb0Var.e = yb0Var.G.a(fVar);
                                if (!org.telegram.messenger.h20.B(sb0Var.c)) {
                                    l2.f fVar2 = (l2.f) ((t7.u) org.telegram.messenger.w0.k()).onCreateMarkerOptions();
                                    ((j8.f) fVar2.b).a = new LatLng(d, d10);
                                    j8.f fVar3 = (j8.f) fVar2.b;
                                    fVar3.r = true;
                                    fVar3.d = v7.n8.b(R.drawable.map_pin_circle);
                                    fVar2.e(0.5f);
                                    sb0Var.f = yb0Var.G.a(fVar2);
                                }
                                yb0Var.p0.add(sb0Var);
                                yb0Var.q0.k(sb0Var, sb0Var.a);
                            }
                        } catch (Exception e) {
                            org.telegram.messenger.f8.g(e, true);
                        }
                        yb0Var.G.i(((t7.u) org.telegram.messenger.w0.k()).newCameraUpdateLatLngZoom(sb0Var.e.a(), f7));
                    } else {
                        org.telegram.messenger.jj jjVar = yb0Var.J0;
                        if (jjVar == null) {
                            Location location = new Location("network");
                            yb0Var.F0 = location;
                            TLRPC.TL_channelLocation tL_channelLocation2 = yb0Var.I0;
                            if (tL_channelLocation2 != null) {
                                TLRPC.GeoPoint geoPoint2 = tL_channelLocation2.geo_point;
                                yb0Var.G.i(((t7.u) org.telegram.messenger.w0.k()).newCameraUpdateLatLngZoom(new org.telegram.messenger.cb(geoPoint2.lat, geoPoint2._long), f7));
                                yb0Var.F0.setLatitude(yb0Var.I0.geo_point.lat);
                                yb0Var.F0.setLongitude(yb0Var.I0.geo_point._long);
                                yb0Var.F0.setAccuracy(yb0Var.I0.geo_point.accuracy_radius);
                                yb0Var.R.M(yb0Var.F0);
                            } else {
                                location.setLatitude(20.659322d);
                                yb0Var.F0.setLongitude(-11.40625d);
                            }
                        } else if (jjVar.C3()) {
                            sb0 h02 = yb0Var.h0(yb0Var.J0.k);
                            if (!yb0Var.w0()) {
                                yb0Var.G.i(((t7.u) org.telegram.messenger.w0.k()).newCameraUpdateLatLngZoom(h02.e.a(), f7));
                            }
                        } else {
                            double latitude = yb0Var.F0.getLatitude();
                            double longitude = yb0Var.F0.getLongitude();
                            org.telegram.messenger.cb cbVar = new org.telegram.messenger.cb(latitude, longitude);
                            try {
                                org.telegram.messenger.ga gaVar = yb0Var.G;
                                l2.f fVar4 = (l2.f) ((t7.u) org.telegram.messenger.w0.k()).onCreateMarkerOptions();
                                ((j8.f) fVar4.b).a = new LatLng(latitude, longitude);
                                ((j8.f) fVar4.b).d = v7.n8.b(R.drawable.map_pin2);
                                gaVar.a(fVar4);
                            } catch (Exception e7) {
                                org.telegram.messenger.f8.g(e7, true);
                            }
                            yb0Var.G.i(((t7.u) org.telegram.messenger.w0.k()).newCameraUpdateLatLngZoom(cbVar, f7));
                            yb0Var.o0 = false;
                            yb0Var.w0();
                        }
                    }
                    try {
                        yb0Var.G.l(true);
                    } catch (Exception e10) {
                        org.telegram.messenger.f8.g(e10, false);
                    }
                    yb0Var.G.h().u0();
                    yb0Var.G.h().v0();
                    yb0Var.G.h().t0();
                    yb0Var.G.n(new fb0(yb0Var, 4));
                    yb0Var.G.p(new jb0(yb0Var, i12));
                    yb0Var.G.o(new m4.l0(yb0Var, f7));
                    yb0Var.G.m(new cb0(yb0Var, 6));
                    LocationManager locationManager = (LocationManager) org.telegram.messenger.w0.b.getSystemService("location");
                    List<String> providers = locationManager.getProviders(true);
                    Location location2 = null;
                    for (int size = providers.size() - 1; size >= 0; size--) {
                        location2 = locationManager.getLastKnownLocation(providers.get(size));
                        if (location2 != null) {
                            yb0Var.E0 = location2;
                            yb0Var.F0(location2);
                            if (yb0Var.k0 && yb0Var.getParentActivity() != null) {
                                yb0Var.k0 = false;
                                yb0Var.k0();
                            }
                            imageView = yb0Var.c;
                            if (imageView != null && imageView.getVisibility() == 0 && (h = yb0Var.getLocationController().h(yb0Var.n0)) != null && (i10 = h.f) > 0) {
                                yb0Var.l0(i10);
                            }
                        }
                    }
                    yb0Var.E0 = location2;
                    yb0Var.F0(location2);
                    if (yb0Var.k0) {
                        yb0Var.k0 = false;
                        yb0Var.k0();
                    }
                    imageView = yb0Var.c;
                    if (imageView != null) {
                        yb0Var.l0(i10);
                    }
                }
                org.telegram.messenger.i0.g3(new cb0(yb0Var, 5));
                break;
            default:
                yb0 yb0Var2 = this.b;
                Location location3 = (Location) obj;
                yb0Var2.F0(location3);
                yb0Var2.getLocationController().n(location3, yb0Var2.m0);
                yb0Var2.m0 = false;
                break;
        }
    }
}
