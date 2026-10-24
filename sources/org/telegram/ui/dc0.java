package org.telegram.ui;

import android.graphics.Bitmap;
import android.location.Location;
import android.location.LocationManager;
import android.widget.ImageView;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.IMapsProvider;
import org.telegram.messenger.LocationController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final /* synthetic */ class dc0 implements q0.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ sc0 b;

    public /* synthetic */ dc0(sc0 sc0Var, int i10) {
        this.a = i10;
        this.b = sc0Var;
    }

    @Override // q0.a
    public final void accept(Object obj) {
        ImageView imageView;
        LocationController.SharingLocationInfo sharingLocationInfo;
        int i10;
        switch (this.a) {
            case 0:
                sc0 sc0Var = this.b;
                sc0Var.I = (IMapsProvider.IMap) obj;
                int i11 = AndroidUtilities.computePerceivedBrightness(sc0Var.getThemedColor(org.telegram.ui.ActionBar.k6.d6)) < 0.721f ? R.raw.mapstyle_night : 0;
                if (i11 != 0) {
                    sc0Var.a0 = true;
                    sc0Var.I.setMapStyle(ApplicationLoader.getMapsProvider().loadRawResourceStyle(ApplicationLoader.applicationContext, i11));
                }
                sc0Var.I.setPadding(AndroidUtilities.dp(70.0f), 0, AndroidUtilities.dp(70.0f), AndroidUtilities.dp(10.0f));
                if (sc0Var.I != null) {
                    sc0Var.K.getView().animate().alpha(1.0f).setStartDelay(200L).setDuration(100L).start();
                    float minZoomLevel = sc0Var.N0 ? sc0Var.I.getMinZoomLevel() + 4.0f : sc0Var.I.getMaxZoomLevel() - 4.0f;
                    TLRPC.TL_channelLocation tL_channelLocation = sc0Var.z0;
                    if (tL_channelLocation != null) {
                        TLRPC.GeoPoint geoPoint = tL_channelLocation.geo_point;
                        IMapsProvider.LatLng latLng = new IMapsProvider.LatLng(geoPoint.lat, geoPoint._long);
                        mc0 mc0Var = new mc0();
                        if (DialogObject.isUserDialog(sc0Var.e0)) {
                            mc0Var.c = sc0Var.getMessagesController().getUser(Long.valueOf(sc0Var.e0));
                        } else {
                            mc0Var.d = sc0Var.getMessagesController().getChat(Long.valueOf(-sc0Var.e0));
                        }
                        mc0Var.a = sc0Var.e0;
                        sc0Var.v0(mc0Var);
                        try {
                            IMapsProvider.IMarkerOptions position = ApplicationLoader.getMapsProvider().onCreateMarkerOptions().position(latLng);
                            Bitmap g02 = sc0Var.g0(mc0Var);
                            if (g02 != null) {
                                position.icon(g02);
                                position.anchor(0.5f, 0.907f);
                                mc0Var.e = sc0Var.I.addMarker(position);
                                if (!UserObject.isUserSelf(mc0Var.c)) {
                                    IMapsProvider.IMarkerOptions flat = ApplicationLoader.getMapsProvider().onCreateMarkerOptions().position(latLng).flat(true);
                                    flat.icon(R.drawable.map_pin_circle);
                                    flat.anchor(0.5f, 0.5f);
                                    mc0Var.f = sc0Var.I.addMarker(flat);
                                }
                                sc0Var.g0.add(mc0Var);
                                sc0Var.h0.k(mc0Var, mc0Var.a);
                            }
                        } catch (Exception e) {
                            FileLog.e(e);
                        }
                        sc0Var.I.moveCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(mc0Var.e.getPosition(), minZoomLevel));
                    } else {
                        MessageObject messageObject = sc0Var.B0;
                        if (messageObject == null) {
                            Location location = new Location("network");
                            sc0Var.x0 = location;
                            TLRPC.TL_channelLocation tL_channelLocation2 = sc0Var.A0;
                            if (tL_channelLocation2 != null) {
                                TLRPC.GeoPoint geoPoint2 = tL_channelLocation2.geo_point;
                                sc0Var.I.moveCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(new IMapsProvider.LatLng(geoPoint2.lat, geoPoint2._long), minZoomLevel));
                                sc0Var.x0.setLatitude(sc0Var.A0.geo_point.lat);
                                sc0Var.x0.setLongitude(sc0Var.A0.geo_point._long);
                                sc0Var.x0.setAccuracy(sc0Var.A0.geo_point.accuracy_radius);
                                sc0Var.T.L(sc0Var.x0);
                            } else {
                                location.setLatitude(20.659322d);
                                sc0Var.x0.setLongitude(-11.40625d);
                            }
                        } else if (messageObject.isLiveLocation()) {
                            mc0 b02 = sc0Var.b0(sc0Var.B0.messageOwner);
                            if (!sc0Var.l0()) {
                                sc0Var.I.moveCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(b02.e.getPosition(), minZoomLevel));
                            }
                        } else {
                            IMapsProvider.LatLng latLng2 = new IMapsProvider.LatLng(sc0Var.x0.getLatitude(), sc0Var.x0.getLongitude());
                            try {
                                sc0Var.I.addMarker(ApplicationLoader.getMapsProvider().onCreateMarkerOptions().position(latLng2).icon(R.drawable.map_pin2));
                            } catch (Exception e7) {
                                FileLog.e(e7);
                            }
                            sc0Var.I.moveCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(latLng2, minZoomLevel));
                            sc0Var.f0 = false;
                            sc0Var.l0();
                        }
                    }
                    try {
                        sc0Var.I.setMyLocationEnabled(true);
                    } catch (Exception e10) {
                        FileLog.e((Throwable) e10, false);
                    }
                    sc0Var.I.getUiSettings().setMyLocationButtonEnabled(false);
                    sc0Var.I.getUiSettings().setZoomControlsEnabled(false);
                    sc0Var.I.getUiSettings().setCompassEnabled(false);
                    sc0Var.I.setOnCameraMoveStartedListener(new zb0(sc0Var, 4));
                    sc0Var.I.setOnMyLocationChangeListener(new dc0(sc0Var, 1));
                    sc0Var.I.setOnMarkerClickListener(new m4.l0(sc0Var, minZoomLevel));
                    sc0Var.I.setOnCameraMoveListener(new bc0(sc0Var, 3));
                    LocationManager locationManager = (LocationManager) ApplicationLoader.applicationContext.getSystemService("location");
                    List<String> providers = locationManager.getProviders(true);
                    Location location2 = null;
                    for (int size = providers.size() - 1; size >= 0; size--) {
                        location2 = locationManager.getLastKnownLocation(providers.get(size));
                        if (location2 != null) {
                            sc0Var.w0 = location2;
                            sc0Var.t0(location2);
                            if (sc0Var.b0 && sc0Var.getParentActivity() != null) {
                                sc0Var.b0 = false;
                                sc0Var.d0();
                            }
                            imageView = sc0Var.c;
                            if (imageView == null && imageView.getVisibility() == 0 && (sharingLocationInfo = sc0Var.getLocationController().getSharingLocationInfo(sc0Var.e0)) != null && (i10 = sharingLocationInfo.proximityMeters) > 0) {
                                sc0Var.e0(i10);
                                break;
                            }
                        }
                    }
                    sc0Var.w0 = location2;
                    sc0Var.t0(location2);
                    if (sc0Var.b0) {
                        sc0Var.b0 = false;
                        sc0Var.d0();
                    }
                    imageView = sc0Var.c;
                    if (imageView == null) {
                    }
                }
                break;
            default:
                sc0 sc0Var2 = this.b;
                Location location3 = (Location) obj;
                sc0Var2.t0(location3);
                sc0Var2.getLocationController().setMapLocation(location3, sc0Var2.d0);
                sc0Var2.d0 = false;
                break;
        }
    }
}
