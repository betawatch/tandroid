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

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class nc0 implements q0.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ cd0 b;

    public /* synthetic */ nc0(cd0 cd0Var, int i10) {
        this.a = i10;
        this.b = cd0Var;
    }

    @Override // q0.a
    public final void accept(Object obj) {
        ImageView imageView;
        LocationController.SharingLocationInfo sharingLocationInfo;
        int i10;
        switch (this.a) {
            case 0:
                final cd0 cd0Var = this.b;
                cd0Var.F = (IMapsProvider.IMap) obj;
                int i11 = AndroidUtilities.computePerceivedBrightness(cd0Var.getThemedColor(org.telegram.ui.ActionBar.j6.d6)) < 0.721f ? R.raw.mapstyle_night : 0;
                if (i11 != 0) {
                    cd0Var.X = true;
                    cd0Var.F.setMapStyle(ApplicationLoader.getMapsProvider().loadRawResourceStyle(ApplicationLoader.applicationContext, i11));
                }
                cd0Var.F.setPadding(AndroidUtilities.dp(70.0f), 0, AndroidUtilities.dp(70.0f), AndroidUtilities.dp(10.0f));
                if (cd0Var.F != null) {
                    cd0Var.H.getView().animate().alpha(1.0f).setStartDelay(200L).setDuration(100L).start();
                    final float minZoomLevel = cd0Var.K0 ? cd0Var.F.getMinZoomLevel() + 4.0f : cd0Var.F.getMaxZoomLevel() - 4.0f;
                    TLRPC.TL_channelLocation tL_channelLocation = cd0Var.w0;
                    if (tL_channelLocation != null) {
                        TLRPC.GeoPoint geoPoint = tL_channelLocation.geo_point;
                        IMapsProvider.LatLng latLng = new IMapsProvider.LatLng(geoPoint.lat, geoPoint._long);
                        wc0 wc0Var = new wc0();
                        if (DialogObject.isUserDialog(cd0Var.b0)) {
                            wc0Var.c = cd0Var.getMessagesController().getUser(Long.valueOf(cd0Var.b0));
                        } else {
                            wc0Var.d = cd0Var.getMessagesController().getChat(Long.valueOf(-cd0Var.b0));
                        }
                        wc0Var.a = cd0Var.b0;
                        cd0Var.v0(wc0Var);
                        try {
                            IMapsProvider.IMarkerOptions position = ApplicationLoader.getMapsProvider().onCreateMarkerOptions().position(latLng);
                            Bitmap g02 = cd0Var.g0(wc0Var);
                            if (g02 != null) {
                                position.icon(g02);
                                position.anchor(0.5f, 0.907f);
                                wc0Var.e = cd0Var.F.addMarker(position);
                                if (!UserObject.isUserSelf(wc0Var.c)) {
                                    IMapsProvider.IMarkerOptions flat = ApplicationLoader.getMapsProvider().onCreateMarkerOptions().position(latLng).flat(true);
                                    flat.icon(R.drawable.map_pin_circle);
                                    flat.anchor(0.5f, 0.5f);
                                    wc0Var.f = cd0Var.F.addMarker(flat);
                                }
                                cd0Var.d0.add(wc0Var);
                                cd0Var.e0.k(wc0Var, wc0Var.a);
                            }
                        } catch (Exception e) {
                            FileLog.e(e);
                        }
                        cd0Var.F.moveCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(wc0Var.e.getPosition(), minZoomLevel));
                    } else {
                        MessageObject messageObject = cd0Var.y0;
                        if (messageObject == null) {
                            Location location = new Location("network");
                            cd0Var.u0 = location;
                            TLRPC.TL_channelLocation tL_channelLocation2 = cd0Var.x0;
                            if (tL_channelLocation2 != null) {
                                TLRPC.GeoPoint geoPoint2 = tL_channelLocation2.geo_point;
                                cd0Var.F.moveCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(new IMapsProvider.LatLng(geoPoint2.lat, geoPoint2._long), minZoomLevel));
                                cd0Var.u0.setLatitude(cd0Var.x0.geo_point.lat);
                                cd0Var.u0.setLongitude(cd0Var.x0.geo_point._long);
                                cd0Var.u0.setAccuracy(cd0Var.x0.geo_point.accuracy_radius);
                                cd0Var.Q.L(cd0Var.u0);
                            } else {
                                location.setLatitude(20.659322d);
                                cd0Var.u0.setLongitude(-11.40625d);
                            }
                        } else if (messageObject.isLiveLocation()) {
                            wc0 c02 = cd0Var.c0(cd0Var.y0.messageOwner);
                            if (!cd0Var.l0()) {
                                cd0Var.F.moveCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(c02.e.getPosition(), minZoomLevel));
                            }
                        } else {
                            IMapsProvider.LatLng latLng2 = new IMapsProvider.LatLng(cd0Var.u0.getLatitude(), cd0Var.u0.getLongitude());
                            try {
                                cd0Var.F.addMarker(ApplicationLoader.getMapsProvider().onCreateMarkerOptions().position(latLng2).icon(R.drawable.map_pin2));
                            } catch (Exception e6) {
                                FileLog.e(e6);
                            }
                            cd0Var.F.moveCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(latLng2, minZoomLevel));
                            cd0Var.c0 = false;
                            cd0Var.l0();
                        }
                    }
                    try {
                        cd0Var.F.setMyLocationEnabled(true);
                    } catch (Exception e10) {
                        FileLog.e((Throwable) e10, false);
                    }
                    cd0Var.F.getUiSettings().setMyLocationButtonEnabled(false);
                    cd0Var.F.getUiSettings().setZoomControlsEnabled(false);
                    cd0Var.F.getUiSettings().setCompassEnabled(false);
                    cd0Var.F.setOnCameraMoveStartedListener(new jc0(cd0Var, 4));
                    cd0Var.F.setOnMyLocationChangeListener(new nc0(cd0Var, 1));
                    cd0Var.F.setOnMarkerClickListener(new IMapsProvider.OnMarkerClickListener() { // from class: org.telegram.ui.oc0
                        @Override // org.telegram.messenger.IMapsProvider.OnMarkerClickListener
                        public final boolean onClick(IMapsProvider.IMarker iMarker) {
                            cd0 cd0Var2 = cd0.this;
                            ArrayList arrayList = cd0Var2.d0;
                            if (iMarker.getTag() instanceof bd0) {
                                cd0Var2.U.setVisibility(4);
                                if (!cd0Var2.z0) {
                                    ImageView imageView2 = cd0Var2.a;
                                    int i12 = org.telegram.ui.ActionBar.j6.ui;
                                    imageView2.setColorFilter(new PorterDuffColorFilter(cd0Var2.getThemedColor(i12), PorterDuff.Mode.MULTIPLY));
                                    cd0Var2.a.setTag(Integer.valueOf(i12));
                                    cd0Var2.z0 = true;
                                }
                                int i13 = 0;
                                while (true) {
                                    if (i13 >= arrayList.size()) {
                                        break;
                                    }
                                    wc0 wc0Var2 = (wc0) arrayList.get(i13);
                                    if (wc0Var2 == null || wc0Var2.e != iMarker) {
                                        i13++;
                                    } else {
                                        cd0Var2.f0 = wc0Var2.a;
                                        if (cd0Var2.g0) {
                                            cd0Var2.g0 = false;
                                            cd0Var2.C0();
                                        }
                                        cd0Var2.F.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(wc0Var2.e.getPosition(), minZoomLevel));
                                    }
                                }
                                zc0 zc0Var = cd0Var2.x;
                                cd0 cd0Var3 = zc0Var.b;
                                HashMap hashMap = zc0Var.a;
                                bd0 bd0Var = (bd0) iMarker.getTag();
                                if (bd0Var != null && cd0Var3.k0 != bd0Var) {
                                    cd0Var3.y0(false);
                                    IMapsProvider.IMarker iMarker2 = cd0Var3.j0;
                                    if (iMarker2 != null) {
                                        View view = (View) hashMap.get(iMarker2);
                                        if (view != null) {
                                            zc0Var.removeView(view);
                                            hashMap.remove(iMarker2);
                                        }
                                        cd0Var3.j0 = null;
                                    }
                                    cd0Var3.k0 = bd0Var;
                                    cd0Var3.j0 = iMarker;
                                    Context context = zc0Var.getContext();
                                    FrameLayout frameLayout = new FrameLayout(context);
                                    zc0Var.addView(frameLayout, k7.b6.c(114.0f, -2));
                                    FrameLayout frameLayout2 = new FrameLayout(context);
                                    cd0Var3.l0 = frameLayout2;
                                    frameLayout2.setBackgroundResource(R.drawable.venue_tooltip);
                                    cd0Var3.l0.getBackground().setColorFilter(new PorterDuffColorFilter(cd0Var3.getThemedColor(org.telegram.ui.ActionBar.j6.h5), PorterDuff.Mode.MULTIPLY));
                                    frameLayout.addView(cd0Var3.l0, k7.b6.c(71.0f, -2));
                                    cd0Var3.l0.setAlpha(0.0f);
                                    cd0Var3.l0.setOnClickListener(new ib0(2, zc0Var, bd0Var));
                                    TextView textView = new TextView(context);
                                    textView.setTextSize(1, 16.0f);
                                    textView.setMaxLines(1);
                                    TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                                    textView.setEllipsize(truncateAt);
                                    textView.setSingleLine(true);
                                    textView.setTextColor(cd0Var3.getThemedColor(org.telegram.ui.ActionBar.j6.G6));
                                    textView.setTypeface(AndroidUtilities.bold());
                                    textView.setGravity(LocaleController.isRTL ? 5 : 3);
                                    TextView h = ai.h(cd0Var3.l0, textView, k7.b6.d(-2, -2.0f, (LocaleController.isRTL ? 5 : 3) | 48, 18.0f, 10.0f, 18.0f, 0.0f), context);
                                    h.setTextSize(1, 14.0f);
                                    h.setMaxLines(1);
                                    h.setEllipsize(truncateAt);
                                    h.setSingleLine(true);
                                    h.setTextColor(cd0Var3.getThemedColor(org.telegram.ui.ActionBar.j6.A6));
                                    h.setGravity(LocaleController.isRTL ? 5 : 3);
                                    cd0Var3.l0.addView(h, k7.b6.d(-2, -2.0f, (LocaleController.isRTL ? 5 : 3) | 48, 18.0f, 32.0f, 18.0f, 0.0f));
                                    textView.setText(bd0Var.c.title);
                                    h.setText(LocaleController.getString(R.string.TapToSendLocation));
                                    FrameLayout frameLayout3 = new FrameLayout(context);
                                    frameLayout3.setBackground(org.telegram.ui.ActionBar.j6.K(AndroidUtilities.dp(36.0f), org.telegram.ui.Cells.t4.a(bd0Var.a)));
                                    frameLayout.addView(frameLayout3, k7.b6.d(36, 36.0f, 81, 0.0f, 0.0f, 0.0f, 4.0f));
                                    org.telegram.ui.Components.p9 p9Var = new org.telegram.ui.Components.p9(context);
                                    p9Var.f(android.support.v4.media.a.r(new StringBuilder("https://ss3.4sqi.net/img/categories_v2/"), bd0Var.c.venue_type, "_64.png"), null, null);
                                    frameLayout3.addView(p9Var, k7.b6.e(30, 30, 17));
                                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                                    ofFloat.addUpdateListener(new yc0(zc0Var, frameLayout3));
                                    ofFloat.setDuration(360L);
                                    ofFloat.start();
                                    hashMap.put(iMarker, frameLayout);
                                    cd0Var3.F.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLng(iMarker.getPosition()), 300, null);
                                }
                            }
                            return true;
                        }
                    });
                    cd0Var.F.setOnCameraMoveListener(new lc0(cd0Var, 3));
                    LocationManager locationManager = (LocationManager) ApplicationLoader.applicationContext.getSystemService("location");
                    List<String> providers = locationManager.getProviders(true);
                    Location location2 = null;
                    for (int size = providers.size() - 1; size >= 0; size--) {
                        location2 = locationManager.getLastKnownLocation(providers.get(size));
                        if (location2 != null) {
                            cd0Var.t0 = location2;
                            cd0Var.t0(location2);
                            if (cd0Var.Y && cd0Var.getParentActivity() != null) {
                                cd0Var.Y = false;
                                cd0Var.d0();
                            }
                            imageView = cd0Var.c;
                            if (imageView == null && imageView.getVisibility() == 0 && (sharingLocationInfo = cd0Var.getLocationController().getSharingLocationInfo(cd0Var.b0)) != null && (i10 = sharingLocationInfo.proximityMeters) > 0) {
                                cd0Var.e0(i10);
                                break;
                            }
                        }
                    }
                    cd0Var.t0 = location2;
                    cd0Var.t0(location2);
                    if (cd0Var.Y) {
                        cd0Var.Y = false;
                        cd0Var.d0();
                    }
                    imageView = cd0Var.c;
                    if (imageView == null) {
                    }
                }
                break;
            default:
                cd0 cd0Var2 = this.b;
                Location location3 = (Location) obj;
                cd0Var2.t0(location3);
                cd0Var2.getLocationController().setMapLocation(location3, cd0Var2.a0);
                cd0Var2.a0 = false;
                break;
        }
    }
}
