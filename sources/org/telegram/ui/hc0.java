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

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class hc0 implements org.telegram.ui.ActionBar.s0, org.telegram.ui.ActionBar.c2, IMapsProvider.OnCameraMoveStartedListener, tf.b, IMapsProvider.ITouchInterceptor {
    public final /* synthetic */ int a;
    public final /* synthetic */ ad0 b;

    public /* synthetic */ hc0(ad0 ad0Var, int i10) {
        this.a = i10;
        this.b = ad0Var;
    }

    @Override // tf.b
    public void a(ArrayList arrayList) {
        switch (this.a) {
            case 5:
                ad0 ad0Var = this.b;
                ArrayList arrayList2 = ad0Var.h0;
                if (arrayList != null) {
                    int size = arrayList2.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        ((zc0) arrayList2.get(i10)).b.remove();
                    }
                    arrayList2.clear();
                    int size2 = arrayList.size();
                    for (int i11 = 0; i11 < size2; i11++) {
                        TLRPC.TL_messageMediaVenue tL_messageMediaVenue = (TLRPC.TL_messageMediaVenue) arrayList.get(i11);
                        try {
                            IMapsProvider.IMarkerOptions onCreateMarkerOptions = ApplicationLoader.getMapsProvider().onCreateMarkerOptions();
                            TLRPC.GeoPoint geoPoint = tL_messageMediaVenue.geo;
                            IMapsProvider.IMarkerOptions position = onCreateMarkerOptions.position(new IMapsProvider.LatLng(geoPoint.lat, geoPoint._long));
                            position.icon(ad0Var.f0(i11));
                            position.anchor(0.5f, 0.5f);
                            position.title(tL_messageMediaVenue.title);
                            position.snippet(tL_messageMediaVenue.address);
                            zc0 zc0Var = new zc0();
                            zc0Var.a = i11;
                            IMapsProvider.IMarker addMarker = ad0Var.F.addMarker(position);
                            zc0Var.b = addMarker;
                            zc0Var.c = tL_messageMediaVenue;
                            addMarker.setTag(zc0Var);
                            arrayList2.add(zc0Var);
                        } catch (Exception e) {
                            FileLog.e(e);
                        }
                    }
                    break;
                }
                break;
            default:
                ad0 ad0Var2 = this.b;
                ad0Var2.q0 = false;
                ad0Var2.B0();
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.c2
    public void i(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        switch (this.a) {
            case 1:
                ad0 ad0Var = this.b;
                if (ad0Var.getParentActivity() != null) {
                    try {
                        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                        intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                        ad0Var.getParentActivity().startActivity(intent);
                        break;
                    } catch (Exception e) {
                        FileLog.e(e);
                        return;
                    }
                }
                break;
            default:
                ad0 ad0Var2 = this.b;
                if (ad0Var2.getParentActivity() != null) {
                    try {
                        ad0Var2.getParentActivity().startActivity(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
                        break;
                    } catch (Exception unused) {
                        return;
                    }
                }
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.s0
    public void l(int i10) {
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

    @Override // org.telegram.messenger.IMapsProvider.OnCameraMoveStartedListener
    public void onCameraMoveStarted(int i10) {
        View childAt;
        ad0 ad0Var = this.b;
        int i11 = ad0Var.D0;
        if (i10 == 1) {
            ad0Var.y0(true);
            if (ad0Var.j0 != null) {
                ad0Var.U.setVisibility(0);
                xc0 xc0Var = ad0Var.x;
                IMapsProvider.IMarker iMarker = ad0Var.j0;
                HashMap hashMap = xc0Var.a;
                View view = (View) hashMap.get(iMarker);
                if (view != null) {
                    xc0Var.removeView(view);
                    hashMap.remove(iMarker);
                }
                ad0Var.j0 = null;
                ad0Var.k0 = null;
                ad0Var.l0 = null;
            }
            ad0Var.f0 = -1L;
            if (ad0Var.g0) {
                ad0Var.g0 = false;
                ad0Var.C0();
            }
            if (ad0Var.N) {
                return;
            }
            if ((i11 == 0 || i11 == 1) && ad0Var.R.getChildCount() > 0 && (childAt = ad0Var.R.getChildAt(0)) != null) {
                org.telegram.ui.Components.sl0 sl0Var = ad0Var.R;
                View F = sl0Var.F(childAt);
                f2.l1 T = F == null ? null : sl0Var.T(F);
                if (T == null || T.b() != 0) {
                    return;
                }
                int dp = i11 == 0 ? 0 : AndroidUtilities.dp(66.0f);
                int top = childAt.getTop();
                if (top < (-dp)) {
                    IMapsProvider.CameraPosition cameraPosition = ad0Var.F.getCameraPosition();
                    ad0Var.I = ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(cameraPosition.target, cameraPosition.zoom);
                    ad0Var.R.v0(0, top + dp, null);
                }
            }
        }
    }

    @Override // org.telegram.messenger.IMapsProvider.ITouchInterceptor
    public boolean onInterceptTouchEvent(MotionEvent motionEvent, IMapsProvider.ICallableMethod iCallableMethod) {
        MotionEvent motionEvent2;
        Location location;
        int i10 = this.a;
        ad0 ad0Var = this.b;
        switch (i10) {
            case 6:
                if (ad0Var.K != 0.0f) {
                    motionEvent = MotionEvent.obtain(motionEvent);
                    motionEvent.offsetLocation(0.0f, (-ad0Var.K) / 2.0f);
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
                if (ad0Var.y0 == null && ad0Var.w0 == null) {
                    if (motionEvent.getAction() == 0) {
                        AnimatorSet animatorSet = ad0Var.i0;
                        if (animatorSet != null) {
                            animatorSet.cancel();
                        }
                        AnimatorSet animatorSet2 = new AnimatorSet();
                        ad0Var.i0 = animatorSet2;
                        animatorSet2.setDuration(200L);
                        ad0Var.i0.playTogether(ObjectAnimator.ofFloat(ad0Var.U, (Property<View, Float>) View.TRANSLATION_Y, ad0Var.v0 - AndroidUtilities.dp(10.0f)));
                        ad0Var.i0.start();
                    } else if (motionEvent.getAction() == 1) {
                        AnimatorSet animatorSet3 = ad0Var.i0;
                        if (animatorSet3 != null) {
                            animatorSet3.cancel();
                        }
                        ad0Var.K = 0.0f;
                        AnimatorSet animatorSet4 = new AnimatorSet();
                        ad0Var.i0 = animatorSet4;
                        animatorSet4.setDuration(200L);
                        ad0Var.i0.playTogether(ObjectAnimator.ofFloat(ad0Var.U, (Property<View, Float>) View.TRANSLATION_Y, ad0Var.v0));
                        ad0Var.i0.start();
                        ad0Var.Q.I();
                    }
                    if (motionEvent.getAction() == 2) {
                        if (!ad0Var.z0) {
                            ImageView imageView = ad0Var.a;
                            int i11 = org.telegram.ui.ActionBar.j6.ui;
                            imageView.setColorFilter(new PorterDuffColorFilter(ad0Var.getThemedColor(i11), PorterDuff.Mode.MULTIPLY));
                            ad0Var.a.setTag(Integer.valueOf(i11));
                            ad0Var.z0 = true;
                        }
                        IMapsProvider.IMap iMap = ad0Var.F;
                        if (iMap != null && (location = ad0Var.u0) != null) {
                            location.setLatitude(iMap.getCameraPosition().target.latitude);
                            ad0Var.u0.setLongitude(ad0Var.F.getCameraPosition().target.longitude);
                        }
                        ad0Var.Q.L(ad0Var.u0);
                    }
                }
                return ((Boolean) iCallableMethod.call(motionEvent)).booleanValue();
        }
    }
}
