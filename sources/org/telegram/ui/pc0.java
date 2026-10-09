package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Intent;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.location.Location;
import android.net.Uri;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.IMapsProvider;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final /* synthetic */ class pc0 implements org.telegram.ui.ActionBar.r0, org.telegram.ui.ActionBar.a2, IMapsProvider.OnCameraMoveStartedListener, gg.b, IMapsProvider.ITouchInterceptor {
    public final /* synthetic */ int a;
    public final /* synthetic */ hd0 b;

    public /* synthetic */ pc0(hd0 hd0Var, int i10) {
        this.a = i10;
        this.b = hd0Var;
    }

    @Override // gg.b
    public void a(ArrayList arrayList) {
        switch (this.a) {
            case 5:
                hd0 hd0Var = this.b;
                ArrayList arrayList2 = hd0Var.k0;
                if (arrayList != null) {
                    int size = arrayList2.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        ((gd0) arrayList2.get(i10)).b.remove();
                    }
                    arrayList2.clear();
                    int size2 = arrayList.size();
                    for (int i11 = 0; i11 < size2; i11++) {
                        TLRPC.TL_messageMediaVenue tL_messageMediaVenue = (TLRPC.TL_messageMediaVenue) arrayList.get(i11);
                        try {
                            IMapsProvider.IMarkerOptions onCreateMarkerOptions = ApplicationLoader.getMapsProvider().onCreateMarkerOptions();
                            TLRPC.GeoPoint geoPoint = tL_messageMediaVenue.geo;
                            IMapsProvider.IMarkerOptions position = onCreateMarkerOptions.position(new IMapsProvider.LatLng(geoPoint.lat, geoPoint._long));
                            position.icon(hd0Var.e0(i11));
                            position.anchor(0.5f, 0.5f);
                            position.title(tL_messageMediaVenue.title);
                            position.snippet(tL_messageMediaVenue.address);
                            gd0 gd0Var = new gd0();
                            gd0Var.a = i11;
                            IMapsProvider.IMarker addMarker = hd0Var.I.addMarker(position);
                            gd0Var.b = addMarker;
                            gd0Var.c = tL_messageMediaVenue;
                            addMarker.setTag(gd0Var);
                            arrayList2.add(gd0Var);
                        } catch (Exception e7) {
                            FileLog.e(e7);
                        }
                    }
                    break;
                }
                break;
            default:
                hd0 hd0Var2 = this.b;
                hd0Var2.t0 = false;
                hd0Var2.A0();
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.a) {
            case 1:
                hd0 hd0Var = this.b;
                if (hd0Var.getParentActivity() != null) {
                    try {
                        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                        intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                        hd0Var.getParentActivity().startActivity(intent);
                        break;
                    } catch (Exception e7) {
                        FileLog.e(e7);
                        return;
                    }
                }
                break;
            default:
                hd0 hd0Var2 = this.b;
                if (hd0Var2.getParentActivity() != null) {
                    try {
                        hd0Var2.getParentActivity().startActivity(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
                        break;
                    } catch (Exception unused) {
                        return;
                    }
                }
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.r0
    public void m(int i10) {
        IMapsProvider.IMap iMap = this.b.I;
        if (iMap == null) {
            return;
        }
        if (i10 == 2) {
            iMap.setMapType(0);
        } else if (i10 == 3) {
            iMap.setMapType(1);
        } else if (i10 == 4) {
            iMap.setMapType(2);
        }
    }

    @Override // org.telegram.messenger.IMapsProvider.OnCameraMoveStartedListener
    public void onCameraMoveStarted(int i10) {
        View childAt;
        hd0 hd0Var = this.b;
        int i11 = hd0Var.G0;
        if (i10 == 1) {
            hd0Var.x0(true);
            if (hd0Var.m0 != null) {
                hd0Var.X.setVisibility(0);
                ed0 ed0Var = hd0Var.x;
                IMapsProvider.IMarker iMarker = hd0Var.m0;
                HashMap hashMap = ed0Var.a;
                View view = (View) hashMap.get(iMarker);
                if (view != null) {
                    ed0Var.removeView(view);
                    hashMap.remove(iMarker);
                }
                hd0Var.m0 = null;
                hd0Var.n0 = null;
                hd0Var.o0 = null;
            }
            hd0Var.i0 = -1L;
            if (hd0Var.j0) {
                hd0Var.j0 = false;
                hd0Var.B0();
            }
            if (hd0Var.Q) {
                return;
            }
            if ((i11 == 0 || i11 == 1) && hd0Var.U.getChildCount() > 0 && (childAt = hd0Var.U.getChildAt(0)) != null) {
                org.telegram.ui.Components.qm0 qm0Var = hd0Var.U;
                View F = qm0Var.F(childAt);
                s4.d1 T = F == null ? null : qm0Var.T(F);
                if (T == null || T.b() != 0) {
                    return;
                }
                int dp = i11 == 0 ? 0 : AndroidUtilities.dp(66.0f);
                int top = childAt.getTop();
                if (top < (-dp)) {
                    IMapsProvider.CameraPosition cameraPosition = hd0Var.I.getCameraPosition();
                    hd0Var.L = ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(cameraPosition.target, cameraPosition.zoom);
                    hd0Var.U.v0(0, top + dp, null);
                }
            }
        }
    }

    @Override // org.telegram.messenger.IMapsProvider.ITouchInterceptor
    public boolean onInterceptTouchEvent(MotionEvent motionEvent, IMapsProvider.ICallableMethod iCallableMethod) {
        MotionEvent motionEvent2;
        Location location;
        int i10 = this.a;
        hd0 hd0Var = this.b;
        switch (i10) {
            case 6:
                if (hd0Var.N != 0.0f) {
                    motionEvent = MotionEvent.obtain(motionEvent);
                    motionEvent.offsetLocation(0.0f, (-hd0Var.N) / 2.0f);
                    motionEvent2 = motionEvent;
                } else {
                    motionEvent2 = null;
                }
                boolean booleanValue = ((Boolean) iCallableMethod.call(motionEvent)).booleanValue();
                if (motionEvent2 != null) {
                    motionEvent2.recycle();
                }
                return booleanValue;
            default:
                if (hd0Var.B0 == null && hd0Var.z0 == null) {
                    if (motionEvent.getAction() == 0) {
                        AnimatorSet animatorSet = hd0Var.l0;
                        if (animatorSet != null) {
                            animatorSet.cancel();
                        }
                        AnimatorSet animatorSet2 = new AnimatorSet();
                        hd0Var.l0 = animatorSet2;
                        animatorSet2.setDuration(200L);
                        hd0Var.l0.playTogether(ObjectAnimator.ofFloat(hd0Var.X, (Property<View, Float>) View.TRANSLATION_Y, hd0Var.y0 - AndroidUtilities.dp(10.0f)));
                        hd0Var.l0.start();
                    } else if (motionEvent.getAction() == 1) {
                        AnimatorSet animatorSet3 = hd0Var.l0;
                        if (animatorSet3 != null) {
                            animatorSet3.cancel();
                        }
                        hd0Var.N = 0.0f;
                        AnimatorSet animatorSet4 = new AnimatorSet();
                        hd0Var.l0 = animatorSet4;
                        animatorSet4.setDuration(200L);
                        hd0Var.l0.playTogether(ObjectAnimator.ofFloat(hd0Var.X, (Property<View, Float>) View.TRANSLATION_Y, hd0Var.y0));
                        hd0Var.l0.start();
                        hd0Var.T.I();
                    }
                    if (motionEvent.getAction() == 2) {
                        if (!hd0Var.C0) {
                            ImageView imageView = hd0Var.a;
                            int i11 = org.telegram.ui.ActionBar.i6.ui;
                            imageView.setColorFilter(new PorterDuffColorFilter(hd0Var.getThemedColor(i11), PorterDuff.Mode.MULTIPLY));
                            hd0Var.a.setTag(Integer.valueOf(i11));
                            hd0Var.C0 = true;
                        }
                        IMapsProvider.IMap iMap = hd0Var.I;
                        if (iMap != null && (location = hd0Var.x0) != null) {
                            location.setLatitude(iMap.getCameraPosition().target.latitude);
                            hd0Var.x0.setLongitude(hd0Var.I.getCameraPosition().target.longitude);
                        }
                        hd0Var.T.L(hd0Var.x0);
                    }
                }
                return ((Boolean) iCallableMethod.call(motionEvent)).booleanValue();
        }
    }
}
