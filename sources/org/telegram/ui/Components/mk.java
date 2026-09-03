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

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class mk implements org.telegram.ui.ActionBar.s0, uf.b, IMapsProvider.ITouchInterceptor, IMapsProvider.OnCameraMoveStartedListener, IMapsProvider.OnMarkerClickListener, org.telegram.ui.ActionBar.c2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ cl b;

    public /* synthetic */ mk(cl clVar, int i10) {
        this.a = i10;
        this.b = clVar;
    }

    @Override // uf.b
    public void a(ArrayList arrayList) {
        switch (this.a) {
            case 1:
                cl clVar = this.b;
                ArrayList arrayList2 = clVar.b0;
                if (arrayList != null) {
                    int size = arrayList2.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        ((bl) arrayList2.get(i10)).b.remove();
                    }
                    arrayList2.clear();
                    int size2 = arrayList.size();
                    for (int i11 = 0; i11 < size2; i11++) {
                        TLRPC.TL_messageMediaVenue tL_messageMediaVenue = (TLRPC.TL_messageMediaVenue) arrayList.get(i11);
                        try {
                            IMapsProvider.IMarkerOptions onCreateMarkerOptions = ApplicationLoader.getMapsProvider().onCreateMarkerOptions();
                            TLRPC.GeoPoint geoPoint = tL_messageMediaVenue.geo;
                            IMapsProvider.IMarkerOptions position = onCreateMarkerOptions.position(new IMapsProvider.LatLng(geoPoint.lat, geoPoint._long));
                            position.icon(clVar.V(i11));
                            position.anchor(0.5f, 0.5f);
                            position.title(tL_messageMediaVenue.title);
                            position.snippet(tL_messageMediaVenue.address);
                            bl blVar = new bl();
                            blVar.a = i11;
                            IMapsProvider.IMarker addMarker = clVar.E.addMarker(position);
                            blVar.b = addMarker;
                            blVar.c = tL_messageMediaVenue;
                            addMarker.setTag(blVar);
                            arrayList2.add(blVar);
                        } catch (Exception e6) {
                            FileLog.e(e6);
                        }
                    }
                    break;
                }
                break;
            default:
                cl clVar2 = this.b;
                clVar2.k0 = false;
                clVar2.f0();
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.s0
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

    @Override // org.telegram.ui.ActionBar.c2
    public void j(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        cl.T(this.b);
    }

    @Override // org.telegram.messenger.IMapsProvider.OnCameraMoveStartedListener
    public void onCameraMoveStarted(int i10) {
        View childAt;
        cl clVar = this.b;
        mh.d1 d1Var = clVar.M;
        if (i10 == 1) {
            clVar.d0(true);
            if (clVar.d0 != null) {
                clVar.P.setVisibility(0);
                zk zkVar = clVar.C;
                IMapsProvider.IMarker iMarker = clVar.d0;
                HashMap hashMap = zkVar.a;
                View view = (View) hashMap.get(iMarker);
                if (view != null) {
                    zkVar.removeView(view);
                    hashMap.remove(iMarker);
                }
                clVar.d0 = null;
                clVar.e0 = null;
                clVar.f0 = null;
            }
            if (clVar.I || d1Var.getChildCount() <= 0 || (childAt = d1Var.getChildAt(0)) == null) {
                return;
            }
            View F = d1Var.F(childAt);
            f2.m1 T = F == null ? null : d1Var.T(F);
            if (T == null || T.b() != 0) {
                return;
            }
            int dp = clVar.v0 == 0 ? 0 : AndroidUtilities.dp(66.0f);
            int top = childAt.getTop();
            if (top < (-dp)) {
                IMapsProvider.CameraPosition cameraPosition = clVar.E.getCameraPosition();
                clVar.G = ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(cameraPosition.target, cameraPosition.zoom);
                d1Var.v0(0, top + dp, null);
            }
        }
    }

    @Override // org.telegram.messenger.IMapsProvider.OnMarkerClickListener
    public boolean onClick(IMapsProvider.IMarker iMarker) {
        cl clVar = this.b;
        ImageView imageView = clVar.n;
        if (iMarker.getTag() instanceof bl) {
            clVar.P.setVisibility(4);
            if (!clVar.r0) {
                int i10 = org.telegram.ui.ActionBar.k6.ui;
                imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.v0(i10, clVar.a), PorterDuff.Mode.MULTIPLY));
                imageView.setTag(Integer.valueOf(i10));
                clVar.r0 = true;
            }
            zk zkVar = clVar.C;
            zkVar.getClass();
            HashMap hashMap = zkVar.a;
            bl blVar = (bl) iMarker.getTag();
            cl clVar2 = zkVar.b;
            bl blVar2 = clVar2.e0;
            org.telegram.ui.ActionBar.g6 g6Var = clVar2.a;
            if (blVar2 != blVar) {
                clVar2.d0(false);
                IMapsProvider.IMarker iMarker2 = clVar2.d0;
                if (iMarker2 != null) {
                    View view = (View) hashMap.get(iMarker2);
                    if (view != null) {
                        zkVar.removeView(view);
                        hashMap.remove(iMarker2);
                    }
                    clVar2.d0 = null;
                }
                clVar2.e0 = blVar;
                clVar2.d0 = iMarker;
                Context context = zkVar.getContext();
                FrameLayout frameLayout = new FrameLayout(context);
                zkVar.addView(frameLayout, k7.c6.c(114.0f, -2));
                FrameLayout frameLayout2 = new FrameLayout(context);
                clVar2.f0 = frameLayout2;
                frameLayout2.setBackgroundResource(R.drawable.venue_tooltip);
                clVar2.f0.getBackground().setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.h5, g6Var), PorterDuff.Mode.MULTIPLY));
                frameLayout.addView(clVar2.f0, k7.c6.c(71.0f, -2));
                clVar2.f0.setAlpha(0.0f);
                clVar2.f0.setOnClickListener(new w2(7, zkVar, blVar));
                TextView textView = new TextView(context);
                textView.setTextSize(1, 16.0f);
                textView.setMaxLines(1);
                TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                textView.setEllipsize(truncateAt);
                textView.setSingleLine(true);
                textView.setTextColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.G6, g6Var));
                textView.setTypeface(AndroidUtilities.bold());
                textView.setGravity(LocaleController.isRTL ? 5 : 3);
                TextView h = org.telegram.ui.yh.h(clVar2.f0, textView, k7.c6.d(-2, -2.0f, (LocaleController.isRTL ? 5 : 3) | 48, 18.0f, 10.0f, 18.0f, 0.0f), context);
                h.setTextSize(1, 14.0f);
                h.setMaxLines(1);
                h.setEllipsize(truncateAt);
                h.setSingleLine(true);
                h.setTextColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.A6, g6Var));
                h.setGravity(LocaleController.isRTL ? 5 : 3);
                clVar2.f0.addView(h, k7.c6.d(-2, -2.0f, (LocaleController.isRTL ? 5 : 3) | 48, 18.0f, 32.0f, 18.0f, 0.0f));
                textView.setText(blVar.c.title);
                h.setText(LocaleController.getString(R.string.TapToSendLocation));
                FrameLayout frameLayout3 = new FrameLayout(context);
                frameLayout3.setBackground(org.telegram.ui.ActionBar.k6.K(AndroidUtilities.dp(36.0f), org.telegram.ui.Cells.u4.a(blVar.a)));
                frameLayout.addView(frameLayout3, k7.c6.d(36, 36.0f, 81, 0.0f, 0.0f, 0.0f, 4.0f));
                p9 p9Var = new p9(context);
                p9Var.f(android.support.v4.media.a.r(new StringBuilder("https://ss3.4sqi.net/img/categories_v2/"), blVar.c.venue_type, "_64.png"), null, null);
                frameLayout3.addView(p9Var, k7.c6.e(30, 30, 17));
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new yk(zkVar, frameLayout3));
                ofFloat.setDuration(360L);
                ofFloat.start();
                hashMap.put(iMarker, frameLayout);
                clVar2.E.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLng(iMarker.getPosition()), 300, null);
                return true;
            }
        }
        return true;
    }

    @Override // org.telegram.messenger.IMapsProvider.ITouchInterceptor
    public boolean onInterceptTouchEvent(MotionEvent motionEvent, IMapsProvider.ICallableMethod iCallableMethod) {
        MotionEvent motionEvent2;
        Location location;
        int i10 = this.a;
        cl clVar = this.b;
        switch (i10) {
            case 2:
                if (clVar.H != 0.0f) {
                    motionEvent = MotionEvent.obtain(motionEvent);
                    motionEvent.offsetLocation(0.0f, (-clVar.H) / 2.0f);
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
                ImageView imageView = clVar.n;
                Property property = View.TRANSLATION_Y;
                ImageView imageView2 = clVar.P;
                if (motionEvent.getAction() == 0) {
                    AnimatorSet animatorSet = clVar.c0;
                    if (animatorSet != null) {
                        animatorSet.cancel();
                    }
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    clVar.c0 = animatorSet2;
                    animatorSet2.setDuration(200L);
                    clVar.c0.playTogether(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property, clVar.p0 - AndroidUtilities.dp(10.0f)));
                    clVar.c0.start();
                } else if (motionEvent.getAction() == 1) {
                    AnimatorSet animatorSet3 = clVar.c0;
                    if (animatorSet3 != null) {
                        animatorSet3.cancel();
                    }
                    clVar.H = 0.0f;
                    AnimatorSet animatorSet4 = new AnimatorSet();
                    clVar.c0 = animatorSet4;
                    animatorSet4.setDuration(200L);
                    clVar.c0.playTogether(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property, clVar.p0));
                    clVar.c0.start();
                }
                if (motionEvent.getAction() == 2) {
                    if (!clVar.r0) {
                        int i11 = org.telegram.ui.ActionBar.k6.ui;
                        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.v0(i11, clVar.a), PorterDuff.Mode.MULTIPLY));
                        imageView.setTag(Integer.valueOf(i11));
                        clVar.r0 = true;
                    }
                    IMapsProvider.IMap iMap = clVar.E;
                    if (iMap != null && (location = clVar.o0) != null) {
                        location.setLatitude(iMap.getCameraPosition().target.latitude);
                        clVar.o0.setLongitude(clVar.E.getCameraPosition().target.longitude);
                    }
                    clVar.L.L(clVar.o0);
                }
                return ((Boolean) iCallableMethod.call(motionEvent)).booleanValue();
        }
    }
}
