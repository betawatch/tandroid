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

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final /* synthetic */ class lc0 implements org.telegram.ui.ActionBar.r0, org.telegram.ui.ActionBar.a2, IMapsProvider.OnCameraMoveStartedListener, gg.b, IMapsProvider.ITouchInterceptor {
    public final /* synthetic */ int a;
    public final /* synthetic */ dd0 b;

    public /* synthetic */ lc0(dd0 dd0Var, int i10) {
        this.a = i10;
        this.b = dd0Var;
    }

    @Override // gg.b
    public void a(ArrayList arrayList) {
        switch (this.a) {
            case 5:
                dd0 dd0Var = this.b;
                ArrayList arrayList2 = dd0Var.k0;
                if (arrayList != null) {
                    int size = arrayList2.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        ((cd0) arrayList2.get(i10)).b.remove();
                    }
                    arrayList2.clear();
                    int size2 = arrayList.size();
                    for (int i11 = 0; i11 < size2; i11++) {
                        TLRPC.TL_messageMediaVenue tL_messageMediaVenue = (TLRPC.TL_messageMediaVenue) arrayList.get(i11);
                        try {
                            IMapsProvider.IMarkerOptions onCreateMarkerOptions = ApplicationLoader.getMapsProvider().onCreateMarkerOptions();
                            TLRPC.GeoPoint geoPoint = tL_messageMediaVenue.geo;
                            IMapsProvider.IMarkerOptions position = onCreateMarkerOptions.position(new IMapsProvider.LatLng(geoPoint.lat, geoPoint._long));
                            position.icon(dd0Var.f0(i11));
                            position.anchor(0.5f, 0.5f);
                            position.title(tL_messageMediaVenue.title);
                            position.snippet(tL_messageMediaVenue.address);
                            cd0 cd0Var = new cd0();
                            cd0Var.a = i11;
                            IMapsProvider.IMarker addMarker = dd0Var.I.addMarker(position);
                            cd0Var.b = addMarker;
                            cd0Var.c = tL_messageMediaVenue;
                            addMarker.setTag(cd0Var);
                            arrayList2.add(cd0Var);
                        } catch (Exception e) {
                            FileLog.e(e);
                        }
                    }
                    break;
                }
                break;
            default:
                dd0 dd0Var2 = this.b;
                dd0Var2.t0 = false;
                dd0Var2.B0();
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.a) {
            case 1:
                dd0 dd0Var = this.b;
                if (dd0Var.getParentActivity() != null) {
                    try {
                        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                        intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                        dd0Var.getParentActivity().startActivity(intent);
                        break;
                    } catch (Exception e) {
                        FileLog.e(e);
                        return;
                    }
                }
                break;
            default:
                dd0 dd0Var2 = this.b;
                if (dd0Var2.getParentActivity() != null) {
                    try {
                        dd0Var2.getParentActivity().startActivity(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
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
        dd0 dd0Var = this.b;
        int i11 = dd0Var.G0;
        if (i10 == 1) {
            dd0Var.y0(true);
            if (dd0Var.m0 != null) {
                dd0Var.X.setVisibility(0);
                ad0 ad0Var = dd0Var.x;
                IMapsProvider.IMarker iMarker = dd0Var.m0;
                HashMap hashMap = ad0Var.a;
                View view = (View) hashMap.get(iMarker);
                if (view != null) {
                    ad0Var.removeView(view);
                    hashMap.remove(iMarker);
                }
                dd0Var.m0 = null;
                dd0Var.n0 = null;
                dd0Var.o0 = null;
            }
            dd0Var.i0 = -1L;
            if (dd0Var.j0) {
                dd0Var.j0 = false;
                dd0Var.C0();
            }
            if (dd0Var.Q) {
                return;
            }
            if ((i11 == 0 || i11 == 1) && dd0Var.U.getChildCount() > 0 && (childAt = dd0Var.U.getChildAt(0)) != null) {
                org.telegram.ui.Components.ml0 ml0Var = dd0Var.U;
                View F = ml0Var.F(childAt);
                s4.c1 T = F == null ? null : ml0Var.T(F);
                if (T == null || T.b() != 0) {
                    return;
                }
                int dp = i11 == 0 ? 0 : AndroidUtilities.dp(66.0f);
                int top = childAt.getTop();
                if (top < (-dp)) {
                    IMapsProvider.CameraPosition cameraPosition = dd0Var.I.getCameraPosition();
                    dd0Var.L = ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(cameraPosition.target, cameraPosition.zoom);
                    dd0Var.U.v0(0, top + dp, null);
                }
            }
        }
    }

    @Override // org.telegram.messenger.IMapsProvider.ITouchInterceptor
    public boolean onInterceptTouchEvent(MotionEvent motionEvent, IMapsProvider.ICallableMethod iCallableMethod) {
        MotionEvent motionEvent2;
        Location location;
        int i10 = this.a;
        dd0 dd0Var = this.b;
        switch (i10) {
            case 6:
                if (dd0Var.N != 0.0f) {
                    motionEvent = MotionEvent.obtain(motionEvent);
                    motionEvent.offsetLocation(0.0f, (-dd0Var.N) / 2.0f);
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
                if (dd0Var.B0 == null && dd0Var.z0 == null) {
                    if (motionEvent.getAction() == 0) {
                        AnimatorSet animatorSet = dd0Var.l0;
                        if (animatorSet != null) {
                            animatorSet.cancel();
                        }
                        AnimatorSet animatorSet2 = new AnimatorSet();
                        dd0Var.l0 = animatorSet2;
                        animatorSet2.setDuration(200L);
                        dd0Var.l0.playTogether(ObjectAnimator.ofFloat(dd0Var.X, (Property<View, Float>) View.TRANSLATION_Y, dd0Var.y0 - AndroidUtilities.dp(10.0f)));
                        dd0Var.l0.start();
                    } else if (motionEvent.getAction() == 1) {
                        AnimatorSet animatorSet3 = dd0Var.l0;
                        if (animatorSet3 != null) {
                            animatorSet3.cancel();
                        }
                        dd0Var.N = 0.0f;
                        AnimatorSet animatorSet4 = new AnimatorSet();
                        dd0Var.l0 = animatorSet4;
                        animatorSet4.setDuration(200L);
                        dd0Var.l0.playTogether(ObjectAnimator.ofFloat(dd0Var.X, (Property<View, Float>) View.TRANSLATION_Y, dd0Var.y0));
                        dd0Var.l0.start();
                        dd0Var.T.I();
                    }
                    if (motionEvent.getAction() == 2) {
                        if (!dd0Var.C0) {
                            ImageView imageView = dd0Var.a;
                            int i11 = org.telegram.ui.ActionBar.h6.ui;
                            imageView.setColorFilter(new PorterDuffColorFilter(dd0Var.getThemedColor(i11), PorterDuff.Mode.MULTIPLY));
                            dd0Var.a.setTag(Integer.valueOf(i11));
                            dd0Var.C0 = true;
                        }
                        IMapsProvider.IMap iMap = dd0Var.I;
                        if (iMap != null && (location = dd0Var.x0) != null) {
                            location.setLatitude(iMap.getCameraPosition().target.latitude);
                            dd0Var.x0.setLongitude(dd0Var.I.getCameraPosition().target.longitude);
                        }
                        dd0Var.T.L(dd0Var.x0);
                    }
                }
                return ((Boolean) iCallableMethod.call(motionEvent)).booleanValue();
        }
    }
}
