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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class aa0 implements q0.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ la0 b;

    public /* synthetic */ aa0(la0 la0Var, int i3) {
        this.a = i3;
        this.b = la0Var;
    }

    @Override // q0.a
    public final void accept(Object obj) {
        ImageView imageView;
        org.telegram.messenger.kd h;
        int i3;
        switch (this.a) {
            case 0:
                la0 la0Var = this.b;
                la0Var.F = (org.telegram.messenger.z9) obj;
                int i10 = org.telegram.messenger.g0.B(la0Var.getThemedColor(org.telegram.ui.ActionBar.k6.d6)) < 0.721f ? R.raw.mapstyle_night : 0;
                int i11 = 1;
                if (i10 != 0) {
                    la0Var.i0 = true;
                    la0Var.F.i(((mb.b) org.telegram.messenger.t0.k()).loadRawResourceStyle(org.telegram.messenger.t0.b, i10));
                }
                la0Var.F.o(org.telegram.messenger.g0.L(70.0f), 0, org.telegram.messenger.g0.L(70.0f), la0Var.t0());
                int i12 = 5;
                if (la0Var.F != null) {
                    ((ai.c0) ((b8.ke) la0Var.H).b).animate().alpha(1.0f).setStartDelay(200L).setDuration(100L).setUpdateListener(new b3(la0Var, 15)).start();
                    float f10 = la0Var.P0 ? la0Var.F.f() + 4.0f : la0Var.F.e() - 4.0f;
                    TLRPC.TL_channelLocation tL_channelLocation = la0Var.C0;
                    if (tL_channelLocation != null) {
                        TLRPC.GeoPoint geoPoint = tL_channelLocation.geo_point;
                        double d = geoPoint.lat;
                        double d10 = geoPoint._long;
                        ha0 ha0Var = new ha0();
                        if (org.telegram.messenger.m5.E(la0Var.m0)) {
                            ha0Var.c = la0Var.getMessagesController().a2(Long.valueOf(la0Var.m0));
                        } else {
                            ha0Var.d = la0Var.getMessagesController().M0(Long.valueOf(-la0Var.m0));
                        }
                        ha0Var.a = la0Var.m0;
                        la0Var.H0(ha0Var);
                        try {
                            gi.v5 v5Var = (gi.v5) ((mb.b) org.telegram.messenger.t0.k()).onCreateMarkerOptions();
                            ((l8.g) v5Var.b).a = new LatLng(d, d10);
                            Bitmap n02 = la0Var.n0(ha0Var);
                            if (n02 != null) {
                                ((l8.g) v5Var.b).d = b8.wd.a(n02);
                                l8.g gVar = (l8.g) v5Var.b;
                                gVar.e = 0.5f;
                                gVar.f = 0.907f;
                                ha0Var.e = la0Var.F.a(v5Var);
                                if (!org.telegram.messenger.l10.B(ha0Var.c)) {
                                    gi.v5 v5Var2 = (gi.v5) ((mb.b) org.telegram.messenger.t0.k()).onCreateMarkerOptions();
                                    ((l8.g) v5Var2.b).a = new LatLng(d, d10);
                                    l8.g gVar2 = (l8.g) v5Var2.b;
                                    gVar2.r = true;
                                    gVar2.d = b8.wd.b(R.drawable.map_pin_circle);
                                    l8.g gVar3 = (l8.g) v5Var2.b;
                                    gVar3.e = 0.5f;
                                    gVar3.f = 0.5f;
                                    ha0Var.f = la0Var.F.a(v5Var2);
                                }
                                la0Var.o0.add(ha0Var);
                                la0Var.p0.k(ha0Var, ha0Var.a);
                            }
                        } catch (Exception e10) {
                            org.telegram.messenger.a8.g(e10, true);
                        }
                        la0Var.F.h(((mb.b) org.telegram.messenger.t0.k()).newCameraUpdateLatLngZoom(ha0Var.e.a(), f10));
                    } else {
                        org.telegram.messenger.zi ziVar = la0Var.E0;
                        if (ziVar == null) {
                            Location location = new Location("network");
                            la0Var.A0 = location;
                            TLRPC.TL_channelLocation tL_channelLocation2 = la0Var.D0;
                            if (tL_channelLocation2 != null) {
                                TLRPC.GeoPoint geoPoint2 = tL_channelLocation2.geo_point;
                                la0Var.F.h(((mb.b) org.telegram.messenger.t0.k()).newCameraUpdateLatLngZoom(new org.telegram.messenger.va(geoPoint2.lat, geoPoint2._long), f10));
                                la0Var.A0.setLatitude(la0Var.D0.geo_point.lat);
                                la0Var.A0.setLongitude(la0Var.D0.geo_point._long);
                                la0Var.A0.setAccuracy(la0Var.D0.geo_point.accuracy_radius);
                                la0Var.Q.L(la0Var.A0);
                            } else {
                                location.setLatitude(20.659322d);
                                la0Var.A0.setLongitude(-11.40625d);
                            }
                        } else if (ziVar.D3()) {
                            ha0 i02 = la0Var.i0(la0Var.E0.k);
                            if (!la0Var.v0()) {
                                la0Var.F.h(((mb.b) org.telegram.messenger.t0.k()).newCameraUpdateLatLngZoom(i02.e.a(), f10));
                            }
                        } else {
                            double latitude = la0Var.A0.getLatitude();
                            double longitude = la0Var.A0.getLongitude();
                            org.telegram.messenger.va vaVar = new org.telegram.messenger.va(latitude, longitude);
                            try {
                                org.telegram.messenger.z9 z9Var = la0Var.F;
                                gi.v5 v5Var3 = (gi.v5) ((mb.b) org.telegram.messenger.t0.k()).onCreateMarkerOptions();
                                ((l8.g) v5Var3.b).a = new LatLng(latitude, longitude);
                                ((l8.g) v5Var3.b).d = b8.wd.b(R.drawable.map_pin2);
                                z9Var.a(v5Var3);
                            } catch (Exception e11) {
                                org.telegram.messenger.a8.g(e11, true);
                            }
                            la0Var.F.h(((mb.b) org.telegram.messenger.t0.k()).newCameraUpdateLatLngZoom(vaVar, f10));
                            la0Var.n0 = false;
                            la0Var.v0();
                        }
                    }
                    try {
                        la0Var.F.k(true);
                    } catch (Exception e12) {
                        org.telegram.messenger.a8.g(e12, false);
                    }
                    la0Var.F.g().n2();
                    la0Var.F.g().s2();
                    la0Var.F.g().k2();
                    la0Var.F.l(new x90(la0Var, i12));
                    la0Var.F.n(new aa0(la0Var, i11));
                    la0Var.F.m(new u70(1));
                    org.telegram.messenger.z9 z9Var2 = la0Var.F;
                    u90 u90Var = new u90(la0Var, 6);
                    p4.q qVar = z9Var2.a;
                    org.telegram.messenger.p1 p1Var = new org.telegram.messenger.p1(u90Var, 5);
                    k8.e eVar = (k8.e) qVar.a;
                    try {
                        j8.b bVar = new j8.b(p1Var, (char) 0);
                        Parcel P0 = eVar.P0();
                        u7.b.c(P0, bVar);
                        eVar.T0(P0, 97);
                        LocationManager locationManager = (LocationManager) org.telegram.messenger.t0.b.getSystemService("location");
                        List<String> providers = locationManager.getProviders(true);
                        Location location2 = null;
                        for (int size = providers.size() - 1; size >= 0; size--) {
                            location2 = locationManager.getLastKnownLocation(providers.get(size));
                            if (location2 != null) {
                                la0Var.z0 = location2;
                                la0Var.E0(location2);
                                if (la0Var.j0 && la0Var.getParentActivity() != null) {
                                    la0Var.j0 = false;
                                    la0Var.l0();
                                }
                                imageView = la0Var.c;
                                if (imageView != null && imageView.getVisibility() == 0 && (h = la0Var.getLocationController().h(la0Var.m0)) != null && (i3 = h.f) > 0) {
                                    la0Var.m0(i3);
                                }
                            }
                        }
                        la0Var.z0 = location2;
                        la0Var.E0(location2);
                        if (la0Var.j0) {
                            la0Var.j0 = false;
                            la0Var.l0();
                        }
                        imageView = la0Var.c;
                        if (imageView != null) {
                            la0Var.m0(i3);
                        }
                    } catch (RemoteException e13) {
                        throw new androidx.car.app.j(e13);
                    }
                }
                org.telegram.messenger.g0.h3(new u90(la0Var, 5));
                return;
            default:
                la0 la0Var2 = this.b;
                Location location3 = (Location) obj;
                la0Var2.E0(location3);
                la0Var2.getLocationController().n(location3, la0Var2.l0);
                la0Var2.l0 = false;
                return;
        }
    }
}
