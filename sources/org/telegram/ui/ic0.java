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

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ic0 implements org.telegram.ui.ActionBar.s0, org.telegram.ui.ActionBar.c2, IMapsProvider.OnCameraMoveStartedListener, uf.b, IMapsProvider.ITouchInterceptor {
    public final /* synthetic */ int a;
    public final /* synthetic */ bd0 b;

    public /* synthetic */ ic0(bd0 bd0Var, int i10) {
        this.a = i10;
        this.b = bd0Var;
    }

    @Override // uf.b
    public void a(ArrayList arrayList) {
        switch (this.a) {
            case 5:
                bd0 bd0Var = this.b;
                ArrayList arrayList2 = bd0Var.h0;
                if (arrayList != null) {
                    int size = arrayList2.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        ((ad0) arrayList2.get(i10)).b.remove();
                    }
                    arrayList2.clear();
                    int size2 = arrayList.size();
                    for (int i11 = 0; i11 < size2; i11++) {
                        TLRPC.TL_messageMediaVenue tL_messageMediaVenue = (TLRPC.TL_messageMediaVenue) arrayList.get(i11);
                        try {
                            IMapsProvider.IMarkerOptions onCreateMarkerOptions = ApplicationLoader.getMapsProvider().onCreateMarkerOptions();
                            TLRPC.GeoPoint geoPoint = tL_messageMediaVenue.geo;
                            IMapsProvider.IMarkerOptions position = onCreateMarkerOptions.position(new IMapsProvider.LatLng(geoPoint.lat, geoPoint._long));
                            position.icon(bd0Var.f0(i11));
                            position.anchor(0.5f, 0.5f);
                            position.title(tL_messageMediaVenue.title);
                            position.snippet(tL_messageMediaVenue.address);
                            ad0 ad0Var = new ad0();
                            ad0Var.a = i11;
                            IMapsProvider.IMarker addMarker = bd0Var.F.addMarker(position);
                            ad0Var.b = addMarker;
                            ad0Var.c = tL_messageMediaVenue;
                            addMarker.setTag(ad0Var);
                            arrayList2.add(ad0Var);
                        } catch (Exception e6) {
                            FileLog.e(e6);
                        }
                    }
                    break;
                }
                break;
            default:
                bd0 bd0Var2 = this.b;
                bd0Var2.q0 = false;
                bd0Var2.B0();
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.s0
    public void h(int i10) {
        IMapsProvider.IMap iMap = this.b.F;
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

    @Override // org.telegram.ui.ActionBar.c2
    public void j(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        switch (this.a) {
            case 1:
                bd0 bd0Var = this.b;
                if (bd0Var.getParentActivity() != null) {
                    try {
                        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                        intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                        bd0Var.getParentActivity().startActivity(intent);
                        break;
                    } catch (Exception e6) {
                        FileLog.e(e6);
                        return;
                    }
                }
                break;
            default:
                bd0 bd0Var2 = this.b;
                if (bd0Var2.getParentActivity() != null) {
                    try {
                        bd0Var2.getParentActivity().startActivity(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
                        break;
                    } catch (Exception unused) {
                        return;
                    }
                }
                break;
        }
    }

    @Override // org.telegram.messenger.IMapsProvider.OnCameraMoveStartedListener
    public void onCameraMoveStarted(int i10) {
        View childAt;
        bd0 bd0Var = this.b;
        int i11 = bd0Var.D0;
        if (i10 == 1) {
            bd0Var.y0(true);
            if (bd0Var.j0 != null) {
                bd0Var.U.setVisibility(0);
                yc0 yc0Var = bd0Var.x;
                IMapsProvider.IMarker iMarker = bd0Var.j0;
                HashMap hashMap = yc0Var.a;
                View view = (View) hashMap.get(iMarker);
                if (view != null) {
                    yc0Var.removeView(view);
                    hashMap.remove(iMarker);
                }
                bd0Var.j0 = null;
                bd0Var.k0 = null;
                bd0Var.l0 = null;
            }
            bd0Var.f0 = -1L;
            if (bd0Var.g0) {
                bd0Var.g0 = false;
                bd0Var.C0();
            }
            if (bd0Var.N) {
                return;
            }
            if ((i11 == 0 || i11 == 1) && bd0Var.R.getChildCount() > 0 && (childAt = bd0Var.R.getChildAt(0)) != null) {
                org.telegram.ui.Components.sl0 sl0Var = bd0Var.R;
                View F = sl0Var.F(childAt);
                f2.m1 T = F == null ? null : sl0Var.T(F);
                if (T == null || T.b() != 0) {
                    return;
                }
                int dp = i11 == 0 ? 0 : AndroidUtilities.dp(66.0f);
                int top = childAt.getTop();
                if (top < (-dp)) {
                    IMapsProvider.CameraPosition cameraPosition = bd0Var.F.getCameraPosition();
                    bd0Var.I = ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(cameraPosition.target, cameraPosition.zoom);
                    bd0Var.R.v0(0, top + dp, null);
                }
            }
        }
    }

    @Override // org.telegram.messenger.IMapsProvider.ITouchInterceptor
    public boolean onInterceptTouchEvent(MotionEvent motionEvent, IMapsProvider.ICallableMethod iCallableMethod) {
        MotionEvent motionEvent2;
        Location location;
        int i10 = this.a;
        bd0 bd0Var = this.b;
        switch (i10) {
            case 6:
                if (bd0Var.K != 0.0f) {
                    motionEvent = MotionEvent.obtain(motionEvent);
                    motionEvent.offsetLocation(0.0f, (-bd0Var.K) / 2.0f);
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
                if (bd0Var.y0 == null && bd0Var.w0 == null) {
                    if (motionEvent.getAction() == 0) {
                        AnimatorSet animatorSet = bd0Var.i0;
                        if (animatorSet != null) {
                            animatorSet.cancel();
                        }
                        AnimatorSet animatorSet2 = new AnimatorSet();
                        bd0Var.i0 = animatorSet2;
                        animatorSet2.setDuration(200L);
                        bd0Var.i0.playTogether(ObjectAnimator.ofFloat(bd0Var.U, (Property<View, Float>) View.TRANSLATION_Y, bd0Var.v0 - AndroidUtilities.dp(10.0f)));
                        bd0Var.i0.start();
                    } else if (motionEvent.getAction() == 1) {
                        AnimatorSet animatorSet3 = bd0Var.i0;
                        if (animatorSet3 != null) {
                            animatorSet3.cancel();
                        }
                        bd0Var.K = 0.0f;
                        AnimatorSet animatorSet4 = new AnimatorSet();
                        bd0Var.i0 = animatorSet4;
                        animatorSet4.setDuration(200L);
                        bd0Var.i0.playTogether(ObjectAnimator.ofFloat(bd0Var.U, (Property<View, Float>) View.TRANSLATION_Y, bd0Var.v0));
                        bd0Var.i0.start();
                        bd0Var.Q.I();
                    }
                    if (motionEvent.getAction() == 2) {
                        if (!bd0Var.z0) {
                            ImageView imageView = bd0Var.a;
                            int i11 = org.telegram.ui.ActionBar.k6.ui;
                            imageView.setColorFilter(new PorterDuffColorFilter(bd0Var.getThemedColor(i11), PorterDuff.Mode.MULTIPLY));
                            bd0Var.a.setTag(Integer.valueOf(i11));
                            bd0Var.z0 = true;
                        }
                        IMapsProvider.IMap iMap = bd0Var.F;
                        if (iMap != null && (location = bd0Var.u0) != null) {
                            location.setLatitude(iMap.getCameraPosition().target.latitude);
                            bd0Var.u0.setLongitude(bd0Var.F.getCameraPosition().target.longitude);
                        }
                        bd0Var.Q.L(bd0Var.u0);
                    }
                }
                return ((Boolean) iCallableMethod.call(motionEvent)).booleanValue();
        }
    }
}
