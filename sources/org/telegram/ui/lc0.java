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

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class lc0 implements q0.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ ad0 b;

    public /* synthetic */ lc0(ad0 ad0Var, int i10) {
        this.a = i10;
        this.b = ad0Var;
    }

    @Override // q0.a
    public final void accept(Object obj) {
        ImageView imageView;
        LocationController.SharingLocationInfo sharingLocationInfo;
        int i10;
        switch (this.a) {
            case 0:
                final ad0 ad0Var = this.b;
                ad0Var.F = (IMapsProvider.IMap) obj;
                int i11 = AndroidUtilities.computePerceivedBrightness(ad0Var.getThemedColor(org.telegram.ui.ActionBar.j6.d6)) < 0.721f ? R.raw.mapstyle_night : 0;
                if (i11 != 0) {
                    ad0Var.X = true;
                    ad0Var.F.setMapStyle(ApplicationLoader.getMapsProvider().loadRawResourceStyle(ApplicationLoader.applicationContext, i11));
                }
                ad0Var.F.setPadding(AndroidUtilities.dp(70.0f), 0, AndroidUtilities.dp(70.0f), AndroidUtilities.dp(10.0f));
                if (ad0Var.F != null) {
                    ad0Var.H.getView().animate().alpha(1.0f).setStartDelay(200L).setDuration(100L).start();
                    final float minZoomLevel = ad0Var.K0 ? ad0Var.F.getMinZoomLevel() + 4.0f : ad0Var.F.getMaxZoomLevel() - 4.0f;
                    TLRPC.TL_channelLocation tL_channelLocation = ad0Var.w0;
                    if (tL_channelLocation != null) {
                        TLRPC.GeoPoint geoPoint = tL_channelLocation.geo_point;
                        IMapsProvider.LatLng latLng = new IMapsProvider.LatLng(geoPoint.lat, geoPoint._long);
                        uc0 uc0Var = new uc0();
                        if (DialogObject.isUserDialog(ad0Var.b0)) {
                            uc0Var.c = ad0Var.getMessagesController().getUser(Long.valueOf(ad0Var.b0));
                        } else {
                            uc0Var.d = ad0Var.getMessagesController().getChat(Long.valueOf(-ad0Var.b0));
                        }
                        uc0Var.a = ad0Var.b0;
                        ad0Var.v0(uc0Var);
                        try {
                            IMapsProvider.IMarkerOptions position = ApplicationLoader.getMapsProvider().onCreateMarkerOptions().position(latLng);
                            Bitmap g02 = ad0Var.g0(uc0Var);
                            if (g02 != null) {
                                position.icon(g02);
                                position.anchor(0.5f, 0.907f);
                                uc0Var.e = ad0Var.F.addMarker(position);
                                if (!UserObject.isUserSelf(uc0Var.c)) {
                                    IMapsProvider.IMarkerOptions flat = ApplicationLoader.getMapsProvider().onCreateMarkerOptions().position(latLng).flat(true);
                                    flat.icon(R.drawable.map_pin_circle);
                                    flat.anchor(0.5f, 0.5f);
                                    uc0Var.f = ad0Var.F.addMarker(flat);
                                }
                                ad0Var.d0.add(uc0Var);
                                ad0Var.e0.k(uc0Var, uc0Var.a);
                            }
                        } catch (Exception e) {
                            FileLog.e(e);
                        }
                        ad0Var.F.moveCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(uc0Var.e.getPosition(), minZoomLevel));
                    } else {
                        MessageObject messageObject = ad0Var.y0;
                        if (messageObject == null) {
                            Location location = new Location("network");
                            ad0Var.u0 = location;
                            TLRPC.TL_channelLocation tL_channelLocation2 = ad0Var.x0;
                            if (tL_channelLocation2 != null) {
                                TLRPC.GeoPoint geoPoint2 = tL_channelLocation2.geo_point;
                                ad0Var.F.moveCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(new IMapsProvider.LatLng(geoPoint2.lat, geoPoint2._long), minZoomLevel));
                                ad0Var.u0.setLatitude(ad0Var.x0.geo_point.lat);
                                ad0Var.u0.setLongitude(ad0Var.x0.geo_point._long);
                                ad0Var.u0.setAccuracy(ad0Var.x0.geo_point.accuracy_radius);
                                ad0Var.Q.L(ad0Var.u0);
                            } else {
                                location.setLatitude(20.659322d);
                                ad0Var.u0.setLongitude(-11.40625d);
                            }
                        } else if (messageObject.isLiveLocation()) {
                            uc0 c02 = ad0Var.c0(ad0Var.y0.messageOwner);
                            if (!ad0Var.l0()) {
                                ad0Var.F.moveCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(c02.e.getPosition(), minZoomLevel));
                            }
                        } else {
                            IMapsProvider.LatLng latLng2 = new IMapsProvider.LatLng(ad0Var.u0.getLatitude(), ad0Var.u0.getLongitude());
                            try {
                                ad0Var.F.addMarker(ApplicationLoader.getMapsProvider().onCreateMarkerOptions().position(latLng2).icon(R.drawable.map_pin2));
                            } catch (Exception e6) {
                                FileLog.e(e6);
                            }
                            ad0Var.F.moveCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(latLng2, minZoomLevel));
                            ad0Var.c0 = false;
                            ad0Var.l0();
                        }
                    }
                    try {
                        ad0Var.F.setMyLocationEnabled(true);
                    } catch (Exception e10) {
                        FileLog.e((Throwable) e10, false);
                    }
                    ad0Var.F.getUiSettings().setMyLocationButtonEnabled(false);
                    ad0Var.F.getUiSettings().setZoomControlsEnabled(false);
                    ad0Var.F.getUiSettings().setCompassEnabled(false);
                    ad0Var.F.setOnCameraMoveStartedListener(new hc0(ad0Var, 4));
                    ad0Var.F.setOnMyLocationChangeListener(new lc0(ad0Var, 1));
                    ad0Var.F.setOnMarkerClickListener(new IMapsProvider.OnMarkerClickListener() { // from class: org.telegram.ui.mc0
                        @Override // org.telegram.messenger.IMapsProvider.OnMarkerClickListener
                        public final boolean onClick(IMapsProvider.IMarker iMarker) {
                            ad0 ad0Var2 = ad0.this;
                            ArrayList arrayList = ad0Var2.d0;
                            if (iMarker.getTag() instanceof zc0) {
                                ad0Var2.U.setVisibility(4);
                                if (!ad0Var2.z0) {
                                    ImageView imageView2 = ad0Var2.a;
                                    int i12 = org.telegram.ui.ActionBar.j6.ui;
                                    imageView2.setColorFilter(new PorterDuffColorFilter(ad0Var2.getThemedColor(i12), PorterDuff.Mode.MULTIPLY));
                                    ad0Var2.a.setTag(Integer.valueOf(i12));
                                    ad0Var2.z0 = true;
                                }
                                int i13 = 0;
                                while (true) {
                                    if (i13 >= arrayList.size()) {
                                        break;
                                    }
                                    uc0 uc0Var2 = (uc0) arrayList.get(i13);
                                    if (uc0Var2 == null || uc0Var2.e != iMarker) {
                                        i13++;
                                    } else {
                                        ad0Var2.f0 = uc0Var2.a;
                                        if (ad0Var2.g0) {
                                            ad0Var2.g0 = false;
                                            ad0Var2.C0();
                                        }
                                        ad0Var2.F.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(uc0Var2.e.getPosition(), minZoomLevel));
                                    }
                                }
                                xc0 xc0Var = ad0Var2.x;
                                ad0 ad0Var3 = xc0Var.b;
                                HashMap hashMap = xc0Var.a;
                                zc0 zc0Var = (zc0) iMarker.getTag();
                                if (zc0Var != null && ad0Var3.k0 != zc0Var) {
                                    ad0Var3.y0(false);
                                    IMapsProvider.IMarker iMarker2 = ad0Var3.j0;
                                    if (iMarker2 != null) {
                                        View view = (View) hashMap.get(iMarker2);
                                        if (view != null) {
                                            xc0Var.removeView(view);
                                            hashMap.remove(iMarker2);
                                        }
                                        ad0Var3.j0 = null;
                                    }
                                    ad0Var3.k0 = zc0Var;
                                    ad0Var3.j0 = iMarker;
                                    Context context = xc0Var.getContext();
                                    FrameLayout frameLayout = new FrameLayout(context);
                                    xc0Var.addView(frameLayout, k7.b6.c(114.0f, -2));
                                    FrameLayout frameLayout2 = new FrameLayout(context);
                                    ad0Var3.l0 = frameLayout2;
                                    frameLayout2.setBackgroundResource(R.drawable.venue_tooltip);
                                    ad0Var3.l0.getBackground().setColorFilter(new PorterDuffColorFilter(ad0Var3.getThemedColor(org.telegram.ui.ActionBar.j6.h5), PorterDuff.Mode.MULTIPLY));
                                    frameLayout.addView(ad0Var3.l0, k7.b6.c(71.0f, -2));
                                    ad0Var3.l0.setAlpha(0.0f);
                                    ad0Var3.l0.setOnClickListener(new gb0(2, xc0Var, zc0Var));
                                    TextView textView = new TextView(context);
                                    textView.setTextSize(1, 16.0f);
                                    textView.setMaxLines(1);
                                    TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                                    textView.setEllipsize(truncateAt);
                                    textView.setSingleLine(true);
                                    textView.setTextColor(ad0Var3.getThemedColor(org.telegram.ui.ActionBar.j6.G6));
                                    textView.setTypeface(AndroidUtilities.bold());
                                    textView.setGravity(LocaleController.isRTL ? 5 : 3);
                                    TextView i14 = yh.i(ad0Var3.l0, textView, k7.b6.d(-2, -2.0f, (LocaleController.isRTL ? 5 : 3) | 48, 18.0f, 10.0f, 18.0f, 0.0f), context);
                                    i14.setTextSize(1, 14.0f);
                                    i14.setMaxLines(1);
                                    i14.setEllipsize(truncateAt);
                                    i14.setSingleLine(true);
                                    i14.setTextColor(ad0Var3.getThemedColor(org.telegram.ui.ActionBar.j6.A6));
                                    i14.setGravity(LocaleController.isRTL ? 5 : 3);
                                    ad0Var3.l0.addView(i14, k7.b6.d(-2, -2.0f, (LocaleController.isRTL ? 5 : 3) | 48, 18.0f, 32.0f, 18.0f, 0.0f));
                                    textView.setText(zc0Var.c.title);
                                    i14.setText(LocaleController.getString(R.string.TapToSendLocation));
                                    FrameLayout frameLayout3 = new FrameLayout(context);
                                    frameLayout3.setBackground(org.telegram.ui.ActionBar.j6.K(AndroidUtilities.dp(36.0f), org.telegram.ui.Cells.u4.a(zc0Var.a)));
                                    frameLayout.addView(frameLayout3, k7.b6.d(36, 36.0f, 81, 0.0f, 0.0f, 0.0f, 4.0f));
                                    org.telegram.ui.Components.p9 p9Var = new org.telegram.ui.Components.p9(context);
                                    p9Var.f(android.support.v4.media.a.r(new StringBuilder("https://ss3.4sqi.net/img/categories_v2/"), zc0Var.c.venue_type, "_64.png"), null, null);
                                    frameLayout3.addView(p9Var, k7.b6.e(30, 30, 17));
                                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                                    ofFloat.addUpdateListener(new wc0(xc0Var, frameLayout3));
                                    ofFloat.setDuration(360L);
                                    ofFloat.start();
                                    hashMap.put(iMarker, frameLayout);
                                    ad0Var3.F.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLng(iMarker.getPosition()), 300, null);
                                }
                            }
                            return true;
                        }
                    });
                    ad0Var.F.setOnCameraMoveListener(new jc0(ad0Var, 3));
                    LocationManager locationManager = (LocationManager) ApplicationLoader.applicationContext.getSystemService("location");
                    List<String> providers = locationManager.getProviders(true);
                    Location location2 = null;
                    for (int size = providers.size() - 1; size >= 0; size--) {
                        location2 = locationManager.getLastKnownLocation(providers.get(size));
                        if (location2 != null) {
                            ad0Var.t0 = location2;
                            ad0Var.t0(location2);
                            if (ad0Var.Y && ad0Var.getParentActivity() != null) {
                                ad0Var.Y = false;
                                ad0Var.d0();
                            }
                            imageView = ad0Var.c;
                            if (imageView == null && imageView.getVisibility() == 0 && (sharingLocationInfo = ad0Var.getLocationController().getSharingLocationInfo(ad0Var.b0)) != null && (i10 = sharingLocationInfo.proximityMeters) > 0) {
                                ad0Var.e0(i10);
                                break;
                            }
                        }
                    }
                    ad0Var.t0 = location2;
                    ad0Var.t0(location2);
                    if (ad0Var.Y) {
                        ad0Var.Y = false;
                        ad0Var.d0();
                    }
                    imageView = ad0Var.c;
                    if (imageView == null) {
                    }
                }
                break;
            default:
                ad0 ad0Var2 = this.b;
                Location location3 = (Location) obj;
                ad0Var2.t0(location3);
                ad0Var2.getLocationController().setMapLocation(location3, ad0Var2.a0);
                ad0Var2.a0 = false;
                break;
        }
    }
}
