package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.location.Location;
import android.location.LocationManager;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.IMapsProvider;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.LocationController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class mc0 implements q0.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ bd0 b;

    public /* synthetic */ mc0(bd0 bd0Var, int i10) {
        this.a = i10;
        this.b = bd0Var;
    }

    @Override // q0.a
    public final void accept(Object obj) {
        ImageView imageView;
        LocationController.SharingLocationInfo sharingLocationInfo;
        int i10;
        switch (this.a) {
            case 0:
                final bd0 bd0Var = this.b;
                bd0Var.F = (IMapsProvider.IMap) obj;
                int i11 = AndroidUtilities.computePerceivedBrightness(bd0Var.getThemedColor(org.telegram.ui.ActionBar.k6.d6)) < 0.721f ? R.raw.mapstyle_night : 0;
                if (i11 != 0) {
                    bd0Var.X = true;
                    bd0Var.F.setMapStyle(ApplicationLoader.getMapsProvider().loadRawResourceStyle(ApplicationLoader.applicationContext, i11));
                }
                bd0Var.F.setPadding(AndroidUtilities.dp(70.0f), 0, AndroidUtilities.dp(70.0f), AndroidUtilities.dp(10.0f));
                if (bd0Var.F != null) {
                    bd0Var.H.getView().animate().alpha(1.0f).setStartDelay(200L).setDuration(100L).start();
                    final float minZoomLevel = bd0Var.K0 ? bd0Var.F.getMinZoomLevel() + 4.0f : bd0Var.F.getMaxZoomLevel() - 4.0f;
                    TLRPC.TL_channelLocation tL_channelLocation = bd0Var.w0;
                    if (tL_channelLocation != null) {
                        TLRPC.GeoPoint geoPoint = tL_channelLocation.geo_point;
                        IMapsProvider.LatLng latLng = new IMapsProvider.LatLng(geoPoint.lat, geoPoint._long);
                        vc0 vc0Var = new vc0();
                        if (DialogObject.isUserDialog(bd0Var.b0)) {
                            vc0Var.c = bd0Var.getMessagesController().getUser(Long.valueOf(bd0Var.b0));
                        } else {
                            vc0Var.d = bd0Var.getMessagesController().getChat(Long.valueOf(-bd0Var.b0));
                        }
                        vc0Var.a = bd0Var.b0;
                        bd0Var.v0(vc0Var);
                        try {
                            IMapsProvider.IMarkerOptions position = ApplicationLoader.getMapsProvider().onCreateMarkerOptions().position(latLng);
                            Bitmap g02 = bd0Var.g0(vc0Var);
                            if (g02 != null) {
                                position.icon(g02);
                                position.anchor(0.5f, 0.907f);
                                vc0Var.e = bd0Var.F.addMarker(position);
                                if (!UserObject.isUserSelf(vc0Var.c)) {
                                    IMapsProvider.IMarkerOptions flat = ApplicationLoader.getMapsProvider().onCreateMarkerOptions().position(latLng).flat(true);
                                    flat.icon(R.drawable.map_pin_circle);
                                    flat.anchor(0.5f, 0.5f);
                                    vc0Var.f = bd0Var.F.addMarker(flat);
                                }
                                bd0Var.d0.add(vc0Var);
                                bd0Var.e0.k(vc0Var, vc0Var.a);
                            }
                        } catch (Exception e6) {
                            FileLog.e(e6);
                        }
                        bd0Var.F.moveCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(vc0Var.e.getPosition(), minZoomLevel));
                    } else {
                        MessageObject messageObject = bd0Var.y0;
                        if (messageObject == null) {
                            Location location = new Location("network");
                            bd0Var.u0 = location;
                            TLRPC.TL_channelLocation tL_channelLocation2 = bd0Var.x0;
                            if (tL_channelLocation2 != null) {
                                TLRPC.GeoPoint geoPoint2 = tL_channelLocation2.geo_point;
                                bd0Var.F.moveCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(new IMapsProvider.LatLng(geoPoint2.lat, geoPoint2._long), minZoomLevel));
                                bd0Var.u0.setLatitude(bd0Var.x0.geo_point.lat);
                                bd0Var.u0.setLongitude(bd0Var.x0.geo_point._long);
                                bd0Var.u0.setAccuracy(bd0Var.x0.geo_point.accuracy_radius);
                                bd0Var.Q.L(bd0Var.u0);
                            } else {
                                location.setLatitude(20.659322d);
                                bd0Var.u0.setLongitude(-11.40625d);
                            }
                        } else if (messageObject.isLiveLocation()) {
                            vc0 c02 = bd0Var.c0(bd0Var.y0.messageOwner);
                            if (!bd0Var.l0()) {
                                bd0Var.F.moveCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(c02.e.getPosition(), minZoomLevel));
                            }
                        } else {
                            IMapsProvider.LatLng latLng2 = new IMapsProvider.LatLng(bd0Var.u0.getLatitude(), bd0Var.u0.getLongitude());
                            try {
                                bd0Var.F.addMarker(ApplicationLoader.getMapsProvider().onCreateMarkerOptions().position(latLng2).icon(R.drawable.map_pin2));
                            } catch (Exception e10) {
                                FileLog.e(e10);
                            }
                            bd0Var.F.moveCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(latLng2, minZoomLevel));
                            bd0Var.c0 = false;
                            bd0Var.l0();
                        }
                    }
                    try {
                        bd0Var.F.setMyLocationEnabled(true);
                    } catch (Exception e11) {
                        FileLog.e((Throwable) e11, false);
                    }
                    bd0Var.F.getUiSettings().setMyLocationButtonEnabled(false);
                    bd0Var.F.getUiSettings().setZoomControlsEnabled(false);
                    bd0Var.F.getUiSettings().setCompassEnabled(false);
                    bd0Var.F.setOnCameraMoveStartedListener(new ic0(bd0Var, 4));
                    bd0Var.F.setOnMyLocationChangeListener(new mc0(bd0Var, 1));
                    bd0Var.F.setOnMarkerClickListener(new IMapsProvider.OnMarkerClickListener() { // from class: org.telegram.ui.nc0
                        @Override // org.telegram.messenger.IMapsProvider.OnMarkerClickListener
                        public final boolean onClick(IMapsProvider.IMarker iMarker) {
                            bd0 bd0Var2 = bd0.this;
                            ArrayList arrayList = bd0Var2.d0;
                            if (iMarker.getTag() instanceof ad0) {
                                bd0Var2.U.setVisibility(4);
                                if (!bd0Var2.z0) {
                                    ImageView imageView2 = bd0Var2.a;
                                    int i12 = org.telegram.ui.ActionBar.k6.ui;
                                    imageView2.setColorFilter(new PorterDuffColorFilter(bd0Var2.getThemedColor(i12), PorterDuff.Mode.MULTIPLY));
                                    bd0Var2.a.setTag(Integer.valueOf(i12));
                                    bd0Var2.z0 = true;
                                }
                                int i13 = 0;
                                while (true) {
                                    if (i13 >= arrayList.size()) {
                                        break;
                                    }
                                    vc0 vc0Var2 = (vc0) arrayList.get(i13);
                                    if (vc0Var2 == null || vc0Var2.e != iMarker) {
                                        i13++;
                                    } else {
                                        bd0Var2.f0 = vc0Var2.a;
                                        if (bd0Var2.g0) {
                                            bd0Var2.g0 = false;
                                            bd0Var2.C0();
                                        }
                                        bd0Var2.F.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(vc0Var2.e.getPosition(), minZoomLevel));
                                    }
                                }
                                yc0 yc0Var = bd0Var2.x;
                                bd0 bd0Var3 = yc0Var.b;
                                HashMap hashMap = yc0Var.a;
                                ad0 ad0Var = (ad0) iMarker.getTag();
                                if (ad0Var != null && bd0Var3.k0 != ad0Var) {
                                    bd0Var3.y0(false);
                                    IMapsProvider.IMarker iMarker2 = bd0Var3.j0;
                                    if (iMarker2 != null) {
                                        View view = (View) hashMap.get(iMarker2);
                                        if (view != null) {
                                            yc0Var.removeView(view);
                                            hashMap.remove(iMarker2);
                                        }
                                        bd0Var3.j0 = null;
                                    }
                                    bd0Var3.k0 = ad0Var;
                                    bd0Var3.j0 = iMarker;
                                    Context context = yc0Var.getContext();
                                    FrameLayout frameLayout = new FrameLayout(context);
                                    yc0Var.addView(frameLayout, k7.c6.c(114.0f, -2));
                                    FrameLayout frameLayout2 = new FrameLayout(context);
                                    bd0Var3.l0 = frameLayout2;
                                    frameLayout2.setBackgroundResource(R.drawable.venue_tooltip);
                                    bd0Var3.l0.getBackground().setColorFilter(new PorterDuffColorFilter(bd0Var3.getThemedColor(org.telegram.ui.ActionBar.k6.h5), PorterDuff.Mode.MULTIPLY));
                                    frameLayout.addView(bd0Var3.l0, k7.c6.c(71.0f, -2));
                                    bd0Var3.l0.setAlpha(0.0f);
                                    bd0Var3.l0.setOnClickListener(new hb0(2, yc0Var, ad0Var));
                                    TextView textView = new TextView(context);
                                    textView.setTextSize(1, 16.0f);
                                    textView.setMaxLines(1);
                                    TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                                    textView.setEllipsize(truncateAt);
                                    textView.setSingleLine(true);
                                    textView.setTextColor(bd0Var3.getThemedColor(org.telegram.ui.ActionBar.k6.G6));
                                    textView.setTypeface(AndroidUtilities.bold());
                                    textView.setGravity(LocaleController.isRTL ? 5 : 3);
                                    TextView h = yh.h(bd0Var3.l0, textView, k7.c6.d(-2, -2.0f, (LocaleController.isRTL ? 5 : 3) | 48, 18.0f, 10.0f, 18.0f, 0.0f), context);
                                    h.setTextSize(1, 14.0f);
                                    h.setMaxLines(1);
                                    h.setEllipsize(truncateAt);
                                    h.setSingleLine(true);
                                    h.setTextColor(bd0Var3.getThemedColor(org.telegram.ui.ActionBar.k6.A6));
                                    h.setGravity(LocaleController.isRTL ? 5 : 3);
                                    bd0Var3.l0.addView(h, k7.c6.d(-2, -2.0f, (LocaleController.isRTL ? 5 : 3) | 48, 18.0f, 32.0f, 18.0f, 0.0f));
                                    textView.setText(ad0Var.c.title);
                                    h.setText(LocaleController.getString(R.string.TapToSendLocation));
                                    FrameLayout frameLayout3 = new FrameLayout(context);
                                    frameLayout3.setBackground(org.telegram.ui.ActionBar.k6.K(AndroidUtilities.dp(36.0f), org.telegram.ui.Cells.u4.a(ad0Var.a)));
                                    frameLayout.addView(frameLayout3, k7.c6.d(36, 36.0f, 81, 0.0f, 0.0f, 0.0f, 4.0f));
                                    org.telegram.ui.Components.p9 p9Var = new org.telegram.ui.Components.p9(context);
                                    p9Var.f(android.support.v4.media.a.r(new StringBuilder("https://ss3.4sqi.net/img/categories_v2/"), ad0Var.c.venue_type, "_64.png"), null, null);
                                    frameLayout3.addView(p9Var, k7.c6.e(30, 30, 17));
                                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                                    ofFloat.addUpdateListener(new xc0(yc0Var, frameLayout3));
                                    ofFloat.setDuration(360L);
                                    ofFloat.start();
                                    hashMap.put(iMarker, frameLayout);
                                    bd0Var3.F.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLng(iMarker.getPosition()), 300, null);
                                }
                            }
                            return true;
                        }
                    });
                    bd0Var.F.setOnCameraMoveListener(new kc0(bd0Var, 3));
                    LocationManager locationManager = (LocationManager) ApplicationLoader.applicationContext.getSystemService("location");
                    List<String> providers = locationManager.getProviders(true);
                    Location location2 = null;
                    for (int size = providers.size() - 1; size >= 0; size--) {
                        location2 = locationManager.getLastKnownLocation(providers.get(size));
                        if (location2 != null) {
                            bd0Var.t0 = location2;
                            bd0Var.t0(location2);
                            if (bd0Var.Y && bd0Var.getParentActivity() != null) {
                                bd0Var.Y = false;
                                bd0Var.d0();
                            }
                            imageView = bd0Var.c;
                            if (imageView == null && imageView.getVisibility() == 0 && (sharingLocationInfo = bd0Var.getLocationController().getSharingLocationInfo(bd0Var.b0)) != null && (i10 = sharingLocationInfo.proximityMeters) > 0) {
                                bd0Var.e0(i10);
                                break;
                            }
                        }
                    }
                    bd0Var.t0 = location2;
                    bd0Var.t0(location2);
                    if (bd0Var.Y) {
                        bd0Var.Y = false;
                        bd0Var.d0();
                    }
                    imageView = bd0Var.c;
                    if (imageView == null) {
                    }
                }
                break;
            default:
                bd0 bd0Var2 = this.b;
                Location location3 = (Location) obj;
                bd0Var2.t0(location3);
                bd0Var2.getLocationController().setMapLocation(location3, bd0Var2.a0);
                bd0Var2.a0 = false;
                break;
        }
    }
}
