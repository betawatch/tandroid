package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.location.Location;
import android.text.TextUtils;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.IMapsProvider;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ik implements org.telegram.ui.ActionBar.s0, of.b, IMapsProvider.ITouchInterceptor, IMapsProvider.OnCameraMoveStartedListener, IMapsProvider.OnMarkerClickListener, org.telegram.ui.ActionBar.b2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ xk b;

    public /* synthetic */ ik(xk xkVar, int i9) {
        this.a = i9;
        this.b = xkVar;
    }

    @Override // of.b
    public void a(ArrayList arrayList) {
        switch (this.a) {
            case 1:
                xk xkVar = this.b;
                ArrayList arrayList2 = xkVar.a0;
                if (arrayList != null) {
                    int size = arrayList2.size();
                    for (int i9 = 0; i9 < size; i9++) {
                        ((wk) arrayList2.get(i9)).b.remove();
                    }
                    arrayList2.clear();
                    int size2 = arrayList.size();
                    for (int i10 = 0; i10 < size2; i10++) {
                        TLRPC.TL_messageMediaVenue tL_messageMediaVenue = (TLRPC.TL_messageMediaVenue) arrayList.get(i10);
                        try {
                            IMapsProvider.IMarkerOptions onCreateMarkerOptions = ApplicationLoader.getMapsProvider().onCreateMarkerOptions();
                            TLRPC.GeoPoint geoPoint = tL_messageMediaVenue.geo;
                            IMapsProvider.IMarkerOptions position = onCreateMarkerOptions.position(new IMapsProvider.LatLng(geoPoint.lat, geoPoint._long));
                            position.icon(xkVar.U(i10));
                            position.anchor(0.5f, 0.5f);
                            position.title(tL_messageMediaVenue.title);
                            position.snippet(tL_messageMediaVenue.address);
                            wk wkVar = new wk();
                            wkVar.a = i10;
                            IMapsProvider.IMarker addMarker = xkVar.D.addMarker(position);
                            wkVar.b = addMarker;
                            wkVar.c = tL_messageMediaVenue;
                            addMarker.setTag(wkVar);
                            arrayList2.add(wkVar);
                        } catch (Exception e10) {
                            FileLog.e(e10);
                        }
                    }
                    break;
                }
                break;
            default:
                xk xkVar2 = this.b;
                xkVar2.j0 = false;
                xkVar2.e0();
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.b2
    public void f(org.telegram.ui.ActionBar.c2 c2Var, int i9) {
        xk.S(this.b);
    }

    @Override // org.telegram.ui.ActionBar.s0
    public void i(int i9) {
        IMapsProvider.IMap iMap = this.b.D;
        if (iMap == null) {
            return;
        }
        if (i9 == 2) {
            iMap.setMapType(0);
        } else if (i9 == 3) {
            iMap.setMapType(1);
        } else if (i9 == 4) {
            iMap.setMapType(2);
        }
    }

    @Override // org.telegram.messenger.IMapsProvider.OnCameraMoveStartedListener
    public void onCameraMoveStarted(int i9) {
        View childAt;
        xk xkVar = this.b;
        gh.f1 f1Var = xkVar.L;
        if (i9 == 1) {
            xkVar.c0(true);
            if (xkVar.c0 != null) {
                xkVar.O.setVisibility(0);
                uk ukVar = xkVar.B;
                IMapsProvider.IMarker iMarker = xkVar.c0;
                HashMap hashMap = ukVar.a;
                View view = (View) hashMap.get(iMarker);
                if (view != null) {
                    ukVar.removeView(view);
                    hashMap.remove(iMarker);
                }
                xkVar.c0 = null;
                xkVar.d0 = null;
                xkVar.e0 = null;
            }
            if (xkVar.H || f1Var.getChildCount() <= 0 || (childAt = f1Var.getChildAt(0)) == null) {
                return;
            }
            View F = f1Var.F(childAt);
            f2.q1 T = F == null ? null : f1Var.T(F);
            if (T == null || T.b() != 0) {
                return;
            }
            int dp = xkVar.u0 == 0 ? 0 : AndroidUtilities.dp(66.0f);
            int top = childAt.getTop();
            if (top < (-dp)) {
                IMapsProvider.CameraPosition cameraPosition = xkVar.D.getCameraPosition();
                xkVar.F = ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(cameraPosition.target, cameraPosition.zoom);
                f1Var.v0(0, top + dp, null);
            }
        }
    }

    @Override // org.telegram.messenger.IMapsProvider.OnMarkerClickListener
    public boolean onClick(IMapsProvider.IMarker iMarker) {
        xk xkVar = this.b;
        ImageView imageView = xkVar.n;
        if (iMarker.getTag() instanceof wk) {
            xkVar.O.setVisibility(4);
            if (!xkVar.q0) {
                int i9 = org.telegram.ui.ActionBar.f6.ui;
                imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.v0(i9, xkVar.a), PorterDuff.Mode.MULTIPLY));
                imageView.setTag(Integer.valueOf(i9));
                xkVar.q0 = true;
            }
            uk ukVar = xkVar.B;
            ukVar.getClass();
            HashMap hashMap = ukVar.a;
            wk wkVar = (wk) iMarker.getTag();
            xk xkVar2 = ukVar.b;
            wk wkVar2 = xkVar2.d0;
            org.telegram.ui.ActionBar.b6 b6Var = xkVar2.a;
            if (wkVar2 != wkVar) {
                xkVar2.c0(false);
                IMapsProvider.IMarker iMarker2 = xkVar2.c0;
                if (iMarker2 != null) {
                    View view = (View) hashMap.get(iMarker2);
                    if (view != null) {
                        ukVar.removeView(view);
                        hashMap.remove(iMarker2);
                    }
                    xkVar2.c0 = null;
                }
                xkVar2.d0 = wkVar;
                xkVar2.c0 = iMarker;
                Context context = ukVar.getContext();
                FrameLayout frameLayout = new FrameLayout(context);
                ukVar.addView(frameLayout, g7.e6.c(114.0f, -2));
                FrameLayout frameLayout2 = new FrameLayout(context);
                xkVar2.e0 = frameLayout2;
                frameLayout2.setBackgroundResource(R.drawable.venue_tooltip);
                xkVar2.e0.getBackground().setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.h5, b6Var), PorterDuff.Mode.MULTIPLY));
                frameLayout.addView(xkVar2.e0, g7.e6.c(71.0f, -2));
                xkVar2.e0.setAlpha(0.0f);
                xkVar2.e0.setOnClickListener(new s2(9, ukVar, wkVar));
                TextView textView = new TextView(context);
                textView.setTextSize(1, 16.0f);
                textView.setMaxLines(1);
                TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                textView.setEllipsize(truncateAt);
                textView.setSingleLine(true);
                textView.setTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.G6, b6Var));
                textView.setTypeface(AndroidUtilities.bold());
                textView.setGravity(LocaleController.isRTL ? 5 : 3);
                TextView g10 = org.telegram.ui.Cells.j2.g(xkVar2.e0, textView, g7.e6.d(-2, -2.0f, (LocaleController.isRTL ? 5 : 3) | 48, 18.0f, 10.0f, 18.0f, 0.0f), context);
                g10.setTextSize(1, 14.0f);
                g10.setMaxLines(1);
                g10.setEllipsize(truncateAt);
                g10.setSingleLine(true);
                g10.setTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.A6, b6Var));
                g10.setGravity(LocaleController.isRTL ? 5 : 3);
                xkVar2.e0.addView(g10, g7.e6.d(-2, -2.0f, (LocaleController.isRTL ? 5 : 3) | 48, 18.0f, 32.0f, 18.0f, 0.0f));
                textView.setText(wkVar.c.title);
                g10.setText(LocaleController.getString(R.string.TapToSendLocation));
                FrameLayout frameLayout3 = new FrameLayout(context);
                frameLayout3.setBackground(org.telegram.ui.ActionBar.f6.K(AndroidUtilities.dp(36.0f), org.telegram.ui.Cells.u4.a(wkVar.a)));
                frameLayout.addView(frameLayout3, g7.e6.d(36, 36.0f, 81, 0.0f, 0.0f, 0.0f, 4.0f));
                o9 o9Var = new o9(context);
                o9Var.f(aa.d.r(new StringBuilder("https://ss3.4sqi.net/img/categories_v2/"), wkVar.c.venue_type, "_64.png"), null, null);
                frameLayout3.addView(o9Var, g7.e6.e(30, 30, 17));
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new tk(ukVar, frameLayout3));
                ofFloat.setDuration(360L);
                ofFloat.start();
                hashMap.put(iMarker, frameLayout);
                xkVar2.D.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLng(iMarker.getPosition()), 300, null);
                return true;
            }
        }
        return true;
    }

    @Override // org.telegram.messenger.IMapsProvider.ITouchInterceptor
    public boolean onInterceptTouchEvent(MotionEvent motionEvent, IMapsProvider.ICallableMethod iCallableMethod) {
        MotionEvent motionEvent2;
        Location location;
        int i9 = this.a;
        xk xkVar = this.b;
        switch (i9) {
            case 2:
                if (xkVar.G != 0.0f) {
                    motionEvent = MotionEvent.obtain(motionEvent);
                    motionEvent.offsetLocation(0.0f, (-xkVar.G) / 2.0f);
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
                ImageView imageView = xkVar.n;
                Property property = View.TRANSLATION_Y;
                ImageView imageView2 = xkVar.O;
                if (motionEvent.getAction() == 0) {
                    AnimatorSet animatorSet = xkVar.b0;
                    if (animatorSet != null) {
                        animatorSet.cancel();
                    }
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    xkVar.b0 = animatorSet2;
                    animatorSet2.setDuration(200L);
                    xkVar.b0.playTogether(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property, xkVar.o0 - AndroidUtilities.dp(10.0f)));
                    xkVar.b0.start();
                } else if (motionEvent.getAction() == 1) {
                    AnimatorSet animatorSet3 = xkVar.b0;
                    if (animatorSet3 != null) {
                        animatorSet3.cancel();
                    }
                    xkVar.G = 0.0f;
                    AnimatorSet animatorSet4 = new AnimatorSet();
                    xkVar.b0 = animatorSet4;
                    animatorSet4.setDuration(200L);
                    xkVar.b0.playTogether(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property, xkVar.o0));
                    xkVar.b0.start();
                }
                if (motionEvent.getAction() == 2) {
                    if (!xkVar.q0) {
                        int i10 = org.telegram.ui.ActionBar.f6.ui;
                        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.v0(i10, xkVar.a), PorterDuff.Mode.MULTIPLY));
                        imageView.setTag(Integer.valueOf(i10));
                        xkVar.q0 = true;
                    }
                    IMapsProvider.IMap iMap = xkVar.D;
                    if (iMap != null && (location = xkVar.n0) != null) {
                        location.setLatitude(iMap.getCameraPosition().target.latitude);
                        xkVar.n0.setLongitude(xkVar.D.getCameraPosition().target.longitude);
                    }
                    xkVar.K.L(xkVar.n0);
                }
                return ((Boolean) iCallableMethod.call(motionEvent)).booleanValue();
        }
    }
}
