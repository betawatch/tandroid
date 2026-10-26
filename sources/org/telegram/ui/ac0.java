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

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ac0 implements q0.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ pc0 b;

    public /* synthetic */ ac0(pc0 pc0Var, int i10) {
        this.a = i10;
        this.b = pc0Var;
    }

    @Override // q0.a
    public final void accept(Object obj) {
        ImageView imageView;
        LocationController.SharingLocationInfo sharingLocationInfo;
        int i10;
        switch (this.a) {
            case 0:
                pc0 pc0Var = this.b;
                pc0Var.I = (IMapsProvider.IMap) obj;
                int i11 = AndroidUtilities.computePerceivedBrightness(pc0Var.getThemedColor(org.telegram.ui.ActionBar.y6.d6)) < 0.721f ? R.raw.mapstyle_night : 0;
                if (i11 != 0) {
                    pc0Var.a0 = true;
                    pc0Var.I.setMapStyle(ApplicationLoader.getMapsProvider().loadRawResourceStyle(ApplicationLoader.applicationContext, i11));
                }
                pc0Var.I.setPadding(AndroidUtilities.dp(70.0f), 0, AndroidUtilities.dp(70.0f), AndroidUtilities.dp(10.0f));
                if (pc0Var.I != null) {
                    pc0Var.K.getView().animate().alpha(1.0f).setStartDelay(200L).setDuration(100L).start();
                    float minZoomLevel = pc0Var.M0 ? pc0Var.I.getMinZoomLevel() + 4.0f : pc0Var.I.getMaxZoomLevel() - 4.0f;
                    TLRPC.TL_channelLocation tL_channelLocation = pc0Var.y0;
                    if (tL_channelLocation != null) {
                        TLRPC.GeoPoint geoPoint = tL_channelLocation.geo_point;
                        IMapsProvider.LatLng latLng = new IMapsProvider.LatLng(geoPoint.lat, geoPoint._long);
                        jc0 jc0Var = new jc0();
                        if (DialogObject.isUserDialog(pc0Var.e0)) {
                            jc0Var.c = pc0Var.getMessagesController().getUser(Long.valueOf(pc0Var.e0));
                        } else {
                            jc0Var.d = pc0Var.getMessagesController().getChat(Long.valueOf(-pc0Var.e0));
                        }
                        jc0Var.a = pc0Var.e0;
                        pc0Var.w0(jc0Var);
                        try {
                            IMapsProvider.IMarkerOptions position = ApplicationLoader.getMapsProvider().onCreateMarkerOptions().position(latLng);
                            Bitmap h02 = pc0Var.h0(jc0Var);
                            if (h02 != null) {
                                position.icon(h02);
                                position.anchor(0.5f, 0.907f);
                                jc0Var.e = pc0Var.I.addMarker(position);
                                if (!UserObject.isUserSelf(jc0Var.c)) {
                                    IMapsProvider.IMarkerOptions flat = ApplicationLoader.getMapsProvider().onCreateMarkerOptions().position(latLng).flat(true);
                                    flat.icon(R.drawable.map_pin_circle);
                                    flat.anchor(0.5f, 0.5f);
                                    jc0Var.f = pc0Var.I.addMarker(flat);
                                }
                                pc0Var.g0.add(jc0Var);
                                pc0Var.h0.k(jc0Var, jc0Var.a);
                            }
                        } catch (Exception e) {
                            FileLog.e(e);
                        }
                        pc0Var.I.moveCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(jc0Var.e.getPosition(), minZoomLevel));
                    } else {
                        MessageObject messageObject = pc0Var.A0;
                        if (messageObject == null) {
                            Location location = new Location("network");
                            pc0Var.w0 = location;
                            TLRPC.TL_channelLocation tL_channelLocation2 = pc0Var.z0;
                            if (tL_channelLocation2 != null) {
                                TLRPC.GeoPoint geoPoint2 = tL_channelLocation2.geo_point;
                                pc0Var.I.moveCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(new IMapsProvider.LatLng(geoPoint2.lat, geoPoint2._long), minZoomLevel));
                                pc0Var.w0.setLatitude(pc0Var.z0.geo_point.lat);
                                pc0Var.w0.setLongitude(pc0Var.z0.geo_point._long);
                                pc0Var.w0.setAccuracy(pc0Var.z0.geo_point.accuracy_radius);
                                pc0Var.T.L(pc0Var.w0);
                            } else {
                                location.setLatitude(20.659322d);
                                pc0Var.w0.setLongitude(-11.40625d);
                            }
                        } else if (messageObject.isLiveLocation()) {
                            jc0 c02 = pc0Var.c0(pc0Var.A0.messageOwner);
                            if (!pc0Var.m0()) {
                                pc0Var.I.moveCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(c02.e.getPosition(), minZoomLevel));
                            }
                        } else {
                            IMapsProvider.LatLng latLng2 = new IMapsProvider.LatLng(pc0Var.w0.getLatitude(), pc0Var.w0.getLongitude());
                            try {
                                pc0Var.I.addMarker(ApplicationLoader.getMapsProvider().onCreateMarkerOptions().position(latLng2).icon(R.drawable.map_pin2));
                            } catch (Exception e10) {
                                FileLog.e(e10);
                            }
                            pc0Var.I.moveCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(latLng2, minZoomLevel));
                            pc0Var.f0 = false;
                            pc0Var.m0();
                        }
                    }
                    try {
                        pc0Var.I.setMyLocationEnabled(true);
                    } catch (Exception e11) {
                        FileLog.e((Throwable) e11, false);
                    }
                    pc0Var.I.getUiSettings().setMyLocationButtonEnabled(false);
                    pc0Var.I.getUiSettings().setZoomControlsEnabled(false);
                    pc0Var.I.getUiSettings().setCompassEnabled(false);
                    pc0Var.I.setOnCameraMoveStartedListener(new vb0(pc0Var, 4));
                    pc0Var.I.setOnMyLocationChangeListener(new ac0(pc0Var, 1));
                    pc0Var.I.setOnMarkerClickListener(new m4.l0(pc0Var, minZoomLevel));
                    pc0Var.I.setOnCameraMoveListener(new xb0(pc0Var, 3));
                    LocationManager locationManager = (LocationManager) ApplicationLoader.applicationContext.getSystemService("location");
                    List<String> providers = locationManager.getProviders(true);
                    Location location2 = null;
                    for (int size = providers.size() - 1; size >= 0; size--) {
                        location2 = locationManager.getLastKnownLocation(providers.get(size));
                        if (location2 != null) {
                            pc0Var.v0 = location2;
                            pc0Var.u0(location2);
                            if (pc0Var.b0 && pc0Var.getParentActivity() != null) {
                                pc0Var.b0 = false;
                                pc0Var.e0();
                            }
                            imageView = pc0Var.c;
                            if (imageView == null && imageView.getVisibility() == 0 && (sharingLocationInfo = pc0Var.getLocationController().getSharingLocationInfo(pc0Var.e0)) != null && (i10 = sharingLocationInfo.proximityMeters) > 0) {
                                pc0Var.f0(i10);
                                break;
                            }
                        }
                    }
                    pc0Var.v0 = location2;
                    pc0Var.u0(location2);
                    if (pc0Var.b0) {
                        pc0Var.b0 = false;
                        pc0Var.e0();
                    }
                    imageView = pc0Var.c;
                    if (imageView == null) {
                    }
                }
                break;
            default:
                pc0 pc0Var2 = this.b;
                Location location3 = (Location) obj;
                pc0Var2.u0(location3);
                pc0Var2.getLocationController().setMapLocation(location3, pc0Var2.d0);
                pc0Var2.d0 = false;
                break;
        }
    }
}
