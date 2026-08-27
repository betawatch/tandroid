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

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ec0 implements q0.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ tc0 b;

    public /* synthetic */ ec0(tc0 tc0Var, int i10) {
        this.a = i10;
        this.b = tc0Var;
    }

    @Override // q0.a
    public final void accept(Object obj) {
        ImageView imageView;
        LocationController.SharingLocationInfo sharingLocationInfo;
        int i10;
        switch (this.a) {
            case 0:
                final tc0 tc0Var = this.b;
                tc0Var.E = (IMapsProvider.IMap) obj;
                int i11 = AndroidUtilities.computePerceivedBrightness(tc0Var.getThemedColor(org.telegram.ui.ActionBar.g6.d6)) < 0.721f ? R.raw.mapstyle_night : 0;
                if (i11 != 0) {
                    tc0Var.W = true;
                    tc0Var.E.setMapStyle(ApplicationLoader.getMapsProvider().loadRawResourceStyle(ApplicationLoader.applicationContext, i11));
                }
                tc0Var.E.setPadding(AndroidUtilities.dp(70.0f), 0, AndroidUtilities.dp(70.0f), AndroidUtilities.dp(10.0f));
                if (tc0Var.E != null) {
                    tc0Var.G.getView().animate().alpha(1.0f).setStartDelay(200L).setDuration(100L).start();
                    final float minZoomLevel = tc0Var.J0 ? tc0Var.E.getMinZoomLevel() + 4.0f : tc0Var.E.getMaxZoomLevel() - 4.0f;
                    TLRPC.TL_channelLocation tL_channelLocation = tc0Var.v0;
                    if (tL_channelLocation != null) {
                        TLRPC.GeoPoint geoPoint = tL_channelLocation.geo_point;
                        IMapsProvider.LatLng latLng = new IMapsProvider.LatLng(geoPoint.lat, geoPoint._long);
                        nc0 nc0Var = new nc0();
                        if (DialogObject.isUserDialog(tc0Var.a0)) {
                            nc0Var.c = tc0Var.getMessagesController().getUser(Long.valueOf(tc0Var.a0));
                        } else {
                            nc0Var.d = tc0Var.getMessagesController().getChat(Long.valueOf(-tc0Var.a0));
                        }
                        nc0Var.a = tc0Var.a0;
                        tc0Var.v0(nc0Var);
                        try {
                            IMapsProvider.IMarkerOptions position = ApplicationLoader.getMapsProvider().onCreateMarkerOptions().position(latLng);
                            Bitmap g02 = tc0Var.g0(nc0Var);
                            if (g02 != null) {
                                position.icon(g02);
                                position.anchor(0.5f, 0.907f);
                                nc0Var.e = tc0Var.E.addMarker(position);
                                if (!UserObject.isUserSelf(nc0Var.c)) {
                                    IMapsProvider.IMarkerOptions flat = ApplicationLoader.getMapsProvider().onCreateMarkerOptions().position(latLng).flat(true);
                                    flat.icon(R.drawable.map_pin_circle);
                                    flat.anchor(0.5f, 0.5f);
                                    nc0Var.f = tc0Var.E.addMarker(flat);
                                }
                                tc0Var.c0.add(nc0Var);
                                tc0Var.d0.k(nc0Var, nc0Var.a);
                            }
                        } catch (Exception e9) {
                            FileLog.e(e9);
                        }
                        tc0Var.E.moveCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(nc0Var.e.getPosition(), minZoomLevel));
                    } else {
                        MessageObject messageObject = tc0Var.x0;
                        if (messageObject == null) {
                            Location location = new Location("network");
                            tc0Var.t0 = location;
                            TLRPC.TL_channelLocation tL_channelLocation2 = tc0Var.w0;
                            if (tL_channelLocation2 != null) {
                                TLRPC.GeoPoint geoPoint2 = tL_channelLocation2.geo_point;
                                tc0Var.E.moveCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(new IMapsProvider.LatLng(geoPoint2.lat, geoPoint2._long), minZoomLevel));
                                tc0Var.t0.setLatitude(tc0Var.w0.geo_point.lat);
                                tc0Var.t0.setLongitude(tc0Var.w0.geo_point._long);
                                tc0Var.t0.setAccuracy(tc0Var.w0.geo_point.accuracy_radius);
                                tc0Var.P.L(tc0Var.t0);
                            } else {
                                location.setLatitude(20.659322d);
                                tc0Var.t0.setLongitude(-11.40625d);
                            }
                        } else if (messageObject.isLiveLocation()) {
                            nc0 c02 = tc0Var.c0(tc0Var.x0.messageOwner);
                            if (!tc0Var.l0()) {
                                tc0Var.E.moveCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(c02.e.getPosition(), minZoomLevel));
                            }
                        } else {
                            IMapsProvider.LatLng latLng2 = new IMapsProvider.LatLng(tc0Var.t0.getLatitude(), tc0Var.t0.getLongitude());
                            try {
                                tc0Var.E.addMarker(ApplicationLoader.getMapsProvider().onCreateMarkerOptions().position(latLng2).icon(R.drawable.map_pin2));
                            } catch (Exception e10) {
                                FileLog.e(e10);
                            }
                            tc0Var.E.moveCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(latLng2, minZoomLevel));
                            tc0Var.b0 = false;
                            tc0Var.l0();
                        }
                    }
                    try {
                        tc0Var.E.setMyLocationEnabled(true);
                    } catch (Exception e11) {
                        FileLog.e((Throwable) e11, false);
                    }
                    tc0Var.E.getUiSettings().setMyLocationButtonEnabled(false);
                    tc0Var.E.getUiSettings().setZoomControlsEnabled(false);
                    tc0Var.E.getUiSettings().setCompassEnabled(false);
                    tc0Var.E.setOnCameraMoveStartedListener(new ac0(tc0Var, 4));
                    tc0Var.E.setOnMyLocationChangeListener(new ec0(tc0Var, 1));
                    tc0Var.E.setOnMarkerClickListener(new IMapsProvider.OnMarkerClickListener() { // from class: org.telegram.ui.fc0
                        @Override // org.telegram.messenger.IMapsProvider.OnMarkerClickListener
                        public final boolean onClick(IMapsProvider.IMarker iMarker) {
                            tc0 tc0Var2 = tc0.this;
                            ArrayList arrayList = tc0Var2.c0;
                            if (iMarker.getTag() instanceof sc0) {
                                tc0Var2.T.setVisibility(4);
                                if (!tc0Var2.y0) {
                                    ImageView imageView2 = tc0Var2.a;
                                    int i12 = org.telegram.ui.ActionBar.g6.ui;
                                    imageView2.setColorFilter(new PorterDuffColorFilter(tc0Var2.getThemedColor(i12), PorterDuff.Mode.MULTIPLY));
                                    tc0Var2.a.setTag(Integer.valueOf(i12));
                                    tc0Var2.y0 = true;
                                }
                                int i13 = 0;
                                while (true) {
                                    if (i13 >= arrayList.size()) {
                                        break;
                                    }
                                    nc0 nc0Var2 = (nc0) arrayList.get(i13);
                                    if (nc0Var2 == null || nc0Var2.e != iMarker) {
                                        i13++;
                                    } else {
                                        tc0Var2.e0 = nc0Var2.a;
                                        if (tc0Var2.f0) {
                                            tc0Var2.f0 = false;
                                            tc0Var2.C0();
                                        }
                                        tc0Var2.E.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(nc0Var2.e.getPosition(), minZoomLevel));
                                    }
                                }
                                qc0 qc0Var = tc0Var2.x;
                                tc0 tc0Var3 = qc0Var.b;
                                HashMap hashMap = qc0Var.a;
                                sc0 sc0Var = (sc0) iMarker.getTag();
                                if (sc0Var != null && tc0Var3.j0 != sc0Var) {
                                    tc0Var3.y0(false);
                                    IMapsProvider.IMarker iMarker2 = tc0Var3.i0;
                                    if (iMarker2 != null) {
                                        View view = (View) hashMap.get(iMarker2);
                                        if (view != null) {
                                            qc0Var.removeView(view);
                                            hashMap.remove(iMarker2);
                                        }
                                        tc0Var3.i0 = null;
                                    }
                                    tc0Var3.j0 = sc0Var;
                                    tc0Var3.i0 = iMarker;
                                    Context context = qc0Var.getContext();
                                    FrameLayout frameLayout = new FrameLayout(context);
                                    qc0Var.addView(frameLayout, h7.z5.c(114.0f, -2));
                                    FrameLayout frameLayout2 = new FrameLayout(context);
                                    tc0Var3.k0 = frameLayout2;
                                    frameLayout2.setBackgroundResource(R.drawable.venue_tooltip);
                                    tc0Var3.k0.getBackground().setColorFilter(new PorterDuffColorFilter(tc0Var3.getThemedColor(org.telegram.ui.ActionBar.g6.h5), PorterDuff.Mode.MULTIPLY));
                                    frameLayout.addView(tc0Var3.k0, h7.z5.c(71.0f, -2));
                                    tc0Var3.k0.setAlpha(0.0f);
                                    tc0Var3.k0.setOnClickListener(new u70(5, qc0Var, sc0Var));
                                    TextView textView = new TextView(context);
                                    textView.setTextSize(1, 16.0f);
                                    textView.setMaxLines(1);
                                    TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                                    textView.setEllipsize(truncateAt);
                                    textView.setSingleLine(true);
                                    textView.setTextColor(tc0Var3.getThemedColor(org.telegram.ui.ActionBar.g6.G6));
                                    textView.setTypeface(AndroidUtilities.bold());
                                    textView.setGravity(LocaleController.isRTL ? 5 : 3);
                                    TextView h = org.telegram.ui.Cells.pa.h(tc0Var3.k0, textView, h7.z5.d(-2, -2.0f, (LocaleController.isRTL ? 5 : 3) | 48, 18.0f, 10.0f, 18.0f, 0.0f), context);
                                    h.setTextSize(1, 14.0f);
                                    h.setMaxLines(1);
                                    h.setEllipsize(truncateAt);
                                    h.setSingleLine(true);
                                    h.setTextColor(tc0Var3.getThemedColor(org.telegram.ui.ActionBar.g6.A6));
                                    h.setGravity(LocaleController.isRTL ? 5 : 3);
                                    tc0Var3.k0.addView(h, h7.z5.d(-2, -2.0f, (LocaleController.isRTL ? 5 : 3) | 48, 18.0f, 32.0f, 18.0f, 0.0f));
                                    textView.setText(sc0Var.c.title);
                                    h.setText(LocaleController.getString(R.string.TapToSendLocation));
                                    FrameLayout frameLayout3 = new FrameLayout(context);
                                    frameLayout3.setBackground(org.telegram.ui.ActionBar.g6.K(AndroidUtilities.dp(36.0f), org.telegram.ui.Cells.r4.a(sc0Var.a)));
                                    frameLayout.addView(frameLayout3, h7.z5.d(36, 36.0f, 81, 0.0f, 0.0f, 0.0f, 4.0f));
                                    org.telegram.ui.Components.n9 n9Var = new org.telegram.ui.Components.n9(context);
                                    n9Var.f(a9.p.p(new StringBuilder("https://ss3.4sqi.net/img/categories_v2/"), sc0Var.c.venue_type, "_64.png"), null, null);
                                    frameLayout3.addView(n9Var, h7.z5.e(30, 30, 17));
                                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                                    ofFloat.addUpdateListener(new pc0(qc0Var, frameLayout3));
                                    ofFloat.setDuration(360L);
                                    ofFloat.start();
                                    hashMap.put(iMarker, frameLayout);
                                    tc0Var3.E.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLng(iMarker.getPosition()), 300, null);
                                }
                            }
                            return true;
                        }
                    });
                    tc0Var.E.setOnCameraMoveListener(new cc0(tc0Var, 3));
                    LocationManager locationManager = (LocationManager) ApplicationLoader.applicationContext.getSystemService("location");
                    List<String> providers = locationManager.getProviders(true);
                    Location location2 = null;
                    for (int size = providers.size() - 1; size >= 0; size--) {
                        location2 = locationManager.getLastKnownLocation(providers.get(size));
                        if (location2 != null) {
                            tc0Var.s0 = location2;
                            tc0Var.t0(location2);
                            if (tc0Var.X && tc0Var.getParentActivity() != null) {
                                tc0Var.X = false;
                                tc0Var.d0();
                            }
                            imageView = tc0Var.c;
                            if (imageView == null && imageView.getVisibility() == 0 && (sharingLocationInfo = tc0Var.getLocationController().getSharingLocationInfo(tc0Var.a0)) != null && (i10 = sharingLocationInfo.proximityMeters) > 0) {
                                tc0Var.e0(i10);
                                break;
                            }
                        }
                    }
                    tc0Var.s0 = location2;
                    tc0Var.t0(location2);
                    if (tc0Var.X) {
                        tc0Var.X = false;
                        tc0Var.d0();
                    }
                    imageView = tc0Var.c;
                    if (imageView == null) {
                    }
                }
                break;
            default:
                tc0 tc0Var2 = this.b;
                Location location3 = (Location) obj;
                tc0Var2.t0(location3);
                tc0Var2.getLocationController().setMapLocation(location3, tc0Var2.Z);
                tc0Var2.Z = false;
                break;
        }
    }
}
