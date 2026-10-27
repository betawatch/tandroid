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

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class cc0 implements q0.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ rc0 b;

    public /* synthetic */ cc0(rc0 rc0Var, int i10) {
        this.a = i10;
        this.b = rc0Var;
    }

    @Override // q0.a
    public final void accept(Object obj) {
        ImageView imageView;
        LocationController.SharingLocationInfo sharingLocationInfo;
        int i10;
        switch (this.a) {
            case 0:
                rc0 rc0Var = this.b;
                rc0Var.I = (IMapsProvider.IMap) obj;
                int i11 = AndroidUtilities.computePerceivedBrightness(rc0Var.getThemedColor(org.telegram.ui.ActionBar.y6.d6)) < 0.721f ? R.raw.mapstyle_night : 0;
                if (i11 != 0) {
                    rc0Var.a0 = true;
                    rc0Var.I.setMapStyle(ApplicationLoader.getMapsProvider().loadRawResourceStyle(ApplicationLoader.applicationContext, i11));
                }
                rc0Var.I.setPadding(AndroidUtilities.dp(70.0f), 0, AndroidUtilities.dp(70.0f), AndroidUtilities.dp(10.0f));
                if (rc0Var.I != null) {
                    rc0Var.K.getView().animate().alpha(1.0f).setStartDelay(200L).setDuration(100L).start();
                    float minZoomLevel = rc0Var.M0 ? rc0Var.I.getMinZoomLevel() + 4.0f : rc0Var.I.getMaxZoomLevel() - 4.0f;
                    TLRPC.TL_channelLocation tL_channelLocation = rc0Var.y0;
                    if (tL_channelLocation != null) {
                        TLRPC.GeoPoint geoPoint = tL_channelLocation.geo_point;
                        IMapsProvider.LatLng latLng = new IMapsProvider.LatLng(geoPoint.lat, geoPoint._long);
                        lc0 lc0Var = new lc0();
                        if (DialogObject.isUserDialog(rc0Var.e0)) {
                            lc0Var.c = rc0Var.getMessagesController().getUser(Long.valueOf(rc0Var.e0));
                        } else {
                            lc0Var.d = rc0Var.getMessagesController().getChat(Long.valueOf(-rc0Var.e0));
                        }
                        lc0Var.a = rc0Var.e0;
                        rc0Var.w0(lc0Var);
                        try {
                            IMapsProvider.IMarkerOptions position = ApplicationLoader.getMapsProvider().onCreateMarkerOptions().position(latLng);
                            Bitmap h02 = rc0Var.h0(lc0Var);
                            if (h02 != null) {
                                position.icon(h02);
                                position.anchor(0.5f, 0.907f);
                                lc0Var.e = rc0Var.I.addMarker(position);
                                if (!UserObject.isUserSelf(lc0Var.c)) {
                                    IMapsProvider.IMarkerOptions flat = ApplicationLoader.getMapsProvider().onCreateMarkerOptions().position(latLng).flat(true);
                                    flat.icon(R.drawable.map_pin_circle);
                                    flat.anchor(0.5f, 0.5f);
                                    lc0Var.f = rc0Var.I.addMarker(flat);
                                }
                                rc0Var.g0.add(lc0Var);
                                rc0Var.h0.k(lc0Var, lc0Var.a);
                            }
                        } catch (Exception e) {
                            FileLog.e(e);
                        }
                        rc0Var.I.moveCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(lc0Var.e.getPosition(), minZoomLevel));
                    } else {
                        MessageObject messageObject = rc0Var.A0;
                        if (messageObject == null) {
                            Location location = new Location("network");
                            rc0Var.w0 = location;
                            TLRPC.TL_channelLocation tL_channelLocation2 = rc0Var.z0;
                            if (tL_channelLocation2 != null) {
                                TLRPC.GeoPoint geoPoint2 = tL_channelLocation2.geo_point;
                                rc0Var.I.moveCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(new IMapsProvider.LatLng(geoPoint2.lat, geoPoint2._long), minZoomLevel));
                                rc0Var.w0.setLatitude(rc0Var.z0.geo_point.lat);
                                rc0Var.w0.setLongitude(rc0Var.z0.geo_point._long);
                                rc0Var.w0.setAccuracy(rc0Var.z0.geo_point.accuracy_radius);
                                rc0Var.T.L(rc0Var.w0);
                            } else {
                                location.setLatitude(20.659322d);
                                rc0Var.w0.setLongitude(-11.40625d);
                            }
                        } else if (messageObject.isLiveLocation()) {
                            lc0 c02 = rc0Var.c0(rc0Var.A0.messageOwner);
                            if (!rc0Var.m0()) {
                                rc0Var.I.moveCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(c02.e.getPosition(), minZoomLevel));
                            }
                        } else {
                            IMapsProvider.LatLng latLng2 = new IMapsProvider.LatLng(rc0Var.w0.getLatitude(), rc0Var.w0.getLongitude());
                            try {
                                rc0Var.I.addMarker(ApplicationLoader.getMapsProvider().onCreateMarkerOptions().position(latLng2).icon(R.drawable.map_pin2));
                            } catch (Exception e10) {
                                FileLog.e(e10);
                            }
                            rc0Var.I.moveCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(latLng2, minZoomLevel));
                            rc0Var.f0 = false;
                            rc0Var.m0();
                        }
                    }
                    try {
                        rc0Var.I.setMyLocationEnabled(true);
                    } catch (Exception e11) {
                        FileLog.e((Throwable) e11, false);
                    }
                    rc0Var.I.getUiSettings().setMyLocationButtonEnabled(false);
                    rc0Var.I.getUiSettings().setZoomControlsEnabled(false);
                    rc0Var.I.getUiSettings().setCompassEnabled(false);
                    rc0Var.I.setOnCameraMoveStartedListener(new yb0(rc0Var, 4));
                    rc0Var.I.setOnMyLocationChangeListener(new cc0(rc0Var, 1));
                    rc0Var.I.setOnMarkerClickListener(new m4.l0(rc0Var, minZoomLevel));
                    rc0Var.I.setOnCameraMoveListener(new zb0(rc0Var, 3));
                    LocationManager locationManager = (LocationManager) ApplicationLoader.applicationContext.getSystemService("location");
                    List<String> providers = locationManager.getProviders(true);
                    Location location2 = null;
                    for (int size = providers.size() - 1; size >= 0; size--) {
                        location2 = locationManager.getLastKnownLocation(providers.get(size));
                        if (location2 != null) {
                            rc0Var.v0 = location2;
                            rc0Var.u0(location2);
                            if (rc0Var.b0 && rc0Var.getParentActivity() != null) {
                                rc0Var.b0 = false;
                                rc0Var.e0();
                            }
                            imageView = rc0Var.c;
                            if (imageView == null && imageView.getVisibility() == 0 && (sharingLocationInfo = rc0Var.getLocationController().getSharingLocationInfo(rc0Var.e0)) != null && (i10 = sharingLocationInfo.proximityMeters) > 0) {
                                rc0Var.f0(i10);
                                break;
                            }
                        }
                    }
                    rc0Var.v0 = location2;
                    rc0Var.u0(location2);
                    if (rc0Var.b0) {
                        rc0Var.b0 = false;
                        rc0Var.e0();
                    }
                    imageView = rc0Var.c;
                    if (imageView == null) {
                    }
                }
                break;
            default:
                rc0 rc0Var2 = this.b;
                Location location3 = (Location) obj;
                rc0Var2.u0(location3);
                rc0Var2.getLocationController().setMapLocation(location3, rc0Var2.d0);
                rc0Var2.d0 = false;
                break;
        }
    }
}
