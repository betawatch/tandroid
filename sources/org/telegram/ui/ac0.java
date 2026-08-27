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

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ac0 implements org.telegram.ui.ActionBar.r0, org.telegram.ui.ActionBar.a2, IMapsProvider.OnCameraMoveStartedListener, pf.b, IMapsProvider.ITouchInterceptor {
    public final /* synthetic */ int a;
    public final /* synthetic */ tc0 b;

    public /* synthetic */ ac0(tc0 tc0Var, int i10) {
        this.a = i10;
        this.b = tc0Var;
    }

    @Override // pf.b
    public void a(ArrayList arrayList) {
        switch (this.a) {
            case 5:
                tc0 tc0Var = this.b;
                ArrayList arrayList2 = tc0Var.g0;
                if (arrayList != null) {
                    int size = arrayList2.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        ((sc0) arrayList2.get(i10)).b.remove();
                    }
                    arrayList2.clear();
                    int size2 = arrayList.size();
                    for (int i11 = 0; i11 < size2; i11++) {
                        TLRPC.TL_messageMediaVenue tL_messageMediaVenue = (TLRPC.TL_messageMediaVenue) arrayList.get(i11);
                        try {
                            IMapsProvider.IMarkerOptions onCreateMarkerOptions = ApplicationLoader.getMapsProvider().onCreateMarkerOptions();
                            TLRPC.GeoPoint geoPoint = tL_messageMediaVenue.geo;
                            IMapsProvider.IMarkerOptions position = onCreateMarkerOptions.position(new IMapsProvider.LatLng(geoPoint.lat, geoPoint._long));
                            position.icon(tc0Var.f0(i11));
                            position.anchor(0.5f, 0.5f);
                            position.title(tL_messageMediaVenue.title);
                            position.snippet(tL_messageMediaVenue.address);
                            sc0 sc0Var = new sc0();
                            sc0Var.a = i11;
                            IMapsProvider.IMarker addMarker = tc0Var.E.addMarker(position);
                            sc0Var.b = addMarker;
                            sc0Var.c = tL_messageMediaVenue;
                            addMarker.setTag(sc0Var);
                            arrayList2.add(sc0Var);
                        } catch (Exception e9) {
                            FileLog.e(e9);
                        }
                    }
                    break;
                }
                break;
            default:
                tc0 tc0Var2 = this.b;
                tc0Var2.p0 = false;
                tc0Var2.B0();
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.a) {
            case 1:
                tc0 tc0Var = this.b;
                if (tc0Var.getParentActivity() != null) {
                    try {
                        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                        intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                        tc0Var.getParentActivity().startActivity(intent);
                        break;
                    } catch (Exception e9) {
                        FileLog.e(e9);
                        return;
                    }
                }
                break;
            default:
                tc0 tc0Var2 = this.b;
                if (tc0Var2.getParentActivity() != null) {
                    try {
                        tc0Var2.getParentActivity().startActivity(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
                        break;
                    } catch (Exception unused) {
                        return;
                    }
                }
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.r0
    public void h(int i10) {
        IMapsProvider.IMap iMap = this.b.E;
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
        tc0 tc0Var = this.b;
        int i11 = tc0Var.C0;
        if (i10 == 1) {
            tc0Var.y0(true);
            if (tc0Var.i0 != null) {
                tc0Var.T.setVisibility(0);
                qc0 qc0Var = tc0Var.x;
                IMapsProvider.IMarker iMarker = tc0Var.i0;
                HashMap hashMap = qc0Var.a;
                View view = (View) hashMap.get(iMarker);
                if (view != null) {
                    qc0Var.removeView(view);
                    hashMap.remove(iMarker);
                }
                tc0Var.i0 = null;
                tc0Var.j0 = null;
                tc0Var.k0 = null;
            }
            tc0Var.e0 = -1L;
            if (tc0Var.f0) {
                tc0Var.f0 = false;
                tc0Var.C0();
            }
            if (tc0Var.M) {
                return;
            }
            if ((i11 == 0 || i11 == 1) && tc0Var.Q.getChildCount() > 0 && (childAt = tc0Var.Q.getChildAt(0)) != null) {
                org.telegram.ui.Components.zk0 zk0Var = tc0Var.Q;
                View F = zk0Var.F(childAt);
                f2.o1 T = F == null ? null : zk0Var.T(F);
                if (T == null || T.b() != 0) {
                    return;
                }
                int dp = i11 == 0 ? 0 : AndroidUtilities.dp(66.0f);
                int top = childAt.getTop();
                if (top < (-dp)) {
                    IMapsProvider.CameraPosition cameraPosition = tc0Var.E.getCameraPosition();
                    tc0Var.H = ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(cameraPosition.target, cameraPosition.zoom);
                    tc0Var.Q.v0(0, top + dp, null);
                }
            }
        }
    }

    @Override // org.telegram.messenger.IMapsProvider.ITouchInterceptor
    public boolean onInterceptTouchEvent(MotionEvent motionEvent, IMapsProvider.ICallableMethod iCallableMethod) {
        MotionEvent motionEvent2;
        Location location;
        int i10 = this.a;
        tc0 tc0Var = this.b;
        switch (i10) {
            case 6:
                if (tc0Var.J != 0.0f) {
                    motionEvent = MotionEvent.obtain(motionEvent);
                    motionEvent.offsetLocation(0.0f, (-tc0Var.J) / 2.0f);
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
                if (tc0Var.x0 == null && tc0Var.v0 == null) {
                    if (motionEvent.getAction() == 0) {
                        AnimatorSet animatorSet = tc0Var.h0;
                        if (animatorSet != null) {
                            animatorSet.cancel();
                        }
                        AnimatorSet animatorSet2 = new AnimatorSet();
                        tc0Var.h0 = animatorSet2;
                        animatorSet2.setDuration(200L);
                        tc0Var.h0.playTogether(ObjectAnimator.ofFloat(tc0Var.T, (Property<View, Float>) View.TRANSLATION_Y, tc0Var.u0 - AndroidUtilities.dp(10.0f)));
                        tc0Var.h0.start();
                    } else if (motionEvent.getAction() == 1) {
                        AnimatorSet animatorSet3 = tc0Var.h0;
                        if (animatorSet3 != null) {
                            animatorSet3.cancel();
                        }
                        tc0Var.J = 0.0f;
                        AnimatorSet animatorSet4 = new AnimatorSet();
                        tc0Var.h0 = animatorSet4;
                        animatorSet4.setDuration(200L);
                        tc0Var.h0.playTogether(ObjectAnimator.ofFloat(tc0Var.T, (Property<View, Float>) View.TRANSLATION_Y, tc0Var.u0));
                        tc0Var.h0.start();
                        tc0Var.P.I();
                    }
                    if (motionEvent.getAction() == 2) {
                        if (!tc0Var.y0) {
                            ImageView imageView = tc0Var.a;
                            int i11 = org.telegram.ui.ActionBar.g6.ui;
                            imageView.setColorFilter(new PorterDuffColorFilter(tc0Var.getThemedColor(i11), PorterDuff.Mode.MULTIPLY));
                            tc0Var.a.setTag(Integer.valueOf(i11));
                            tc0Var.y0 = true;
                        }
                        IMapsProvider.IMap iMap = tc0Var.E;
                        if (iMap != null && (location = tc0Var.t0) != null) {
                            location.setLatitude(iMap.getCameraPosition().target.latitude);
                            tc0Var.t0.setLongitude(tc0Var.E.getCameraPosition().target.longitude);
                        }
                        tc0Var.P.L(tc0Var.t0);
                    }
                }
                return ((Boolean) iCallableMethod.call(motionEvent)).booleanValue();
        }
    }
}
