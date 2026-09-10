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

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class wk implements org.telegram.ui.ActionBar.s0, fg.b, IMapsProvider.ITouchInterceptor, IMapsProvider.OnCameraMoveStartedListener, IMapsProvider.OnMarkerClickListener, org.telegram.ui.ActionBar.c2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ll b;

    public /* synthetic */ wk(ll llVar, int i10) {
        this.a = i10;
        this.b = llVar;
    }

    @Override // fg.b
    public void a(ArrayList arrayList) {
        switch (this.a) {
            case 1:
                ll llVar = this.b;
                ArrayList arrayList2 = llVar.e0;
                if (arrayList != null) {
                    int size = arrayList2.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        ((kl) arrayList2.get(i10)).b.remove();
                    }
                    arrayList2.clear();
                    int size2 = arrayList.size();
                    for (int i11 = 0; i11 < size2; i11++) {
                        TLRPC.TL_messageMediaVenue tL_messageMediaVenue = (TLRPC.TL_messageMediaVenue) arrayList.get(i11);
                        try {
                            IMapsProvider.IMarkerOptions onCreateMarkerOptions = ApplicationLoader.getMapsProvider().onCreateMarkerOptions();
                            TLRPC.GeoPoint geoPoint = tL_messageMediaVenue.geo;
                            IMapsProvider.IMarkerOptions position = onCreateMarkerOptions.position(new IMapsProvider.LatLng(geoPoint.lat, geoPoint._long));
                            position.icon(llVar.V(i11));
                            position.anchor(0.5f, 0.5f);
                            position.title(tL_messageMediaVenue.title);
                            position.snippet(tL_messageMediaVenue.address);
                            kl klVar = new kl();
                            klVar.a = i11;
                            IMapsProvider.IMarker addMarker = llVar.H.addMarker(position);
                            klVar.b = addMarker;
                            klVar.c = tL_messageMediaVenue;
                            addMarker.setTag(klVar);
                            arrayList2.add(klVar);
                        } catch (Exception e) {
                            FileLog.e(e);
                        }
                    }
                    break;
                }
                break;
            default:
                ll llVar2 = this.b;
                llVar2.n0 = false;
                llVar2.f0();
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.c2
    public void f(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        ll.T(this.b);
    }

    @Override // org.telegram.ui.ActionBar.s0
    public void m(int i10) {
        IMapsProvider.IMap iMap = this.b.H;
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
        ll llVar = this.b;
        bi.y1 y1Var = llVar.P;
        if (i10 == 1) {
            llVar.d0(true);
            if (llVar.g0 != null) {
                llVar.S.setVisibility(0);
                il ilVar = llVar.F;
                IMapsProvider.IMarker iMarker = llVar.g0;
                HashMap hashMap = ilVar.a;
                View view = (View) hashMap.get(iMarker);
                if (view != null) {
                    ilVar.removeView(view);
                    hashMap.remove(iMarker);
                }
                llVar.g0 = null;
                llVar.h0 = null;
                llVar.i0 = null;
            }
            if (llVar.L || y1Var.getChildCount() <= 0 || (childAt = y1Var.getChildAt(0)) == null) {
                return;
            }
            View F = y1Var.F(childAt);
            s4.c1 T = F == null ? null : y1Var.T(F);
            if (T == null || T.b() != 0) {
                return;
            }
            int dp = llVar.y0 == 0 ? 0 : AndroidUtilities.dp(66.0f);
            int top = childAt.getTop();
            if (top < (-dp)) {
                IMapsProvider.CameraPosition cameraPosition = llVar.H.getCameraPosition();
                llVar.J = ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(cameraPosition.target, cameraPosition.zoom);
                y1Var.v0(0, top + dp, null);
            }
        }
    }

    @Override // org.telegram.messenger.IMapsProvider.OnMarkerClickListener
    public boolean onClick(IMapsProvider.IMarker iMarker) {
        ll llVar = this.b;
        ImageView imageView = llVar.n;
        if (iMarker.getTag() instanceof kl) {
            llVar.S.setVisibility(4);
            if (!llVar.u0) {
                int i10 = org.telegram.ui.ActionBar.j6.ui;
                imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(i10, llVar.a), PorterDuff.Mode.MULTIPLY));
                imageView.setTag(Integer.valueOf(i10));
                llVar.u0 = true;
            }
            il ilVar = llVar.F;
            ilVar.getClass();
            HashMap hashMap = ilVar.a;
            kl klVar = (kl) iMarker.getTag();
            ll llVar2 = ilVar.b;
            kl klVar2 = llVar2.h0;
            org.telegram.ui.ActionBar.f6 f6Var = llVar2.a;
            if (klVar2 != klVar) {
                llVar2.d0(false);
                IMapsProvider.IMarker iMarker2 = llVar2.g0;
                if (iMarker2 != null) {
                    View view = (View) hashMap.get(iMarker2);
                    if (view != null) {
                        ilVar.removeView(view);
                        hashMap.remove(iMarker2);
                    }
                    llVar2.g0 = null;
                }
                llVar2.h0 = klVar;
                llVar2.g0 = iMarker;
                Context context = ilVar.getContext();
                FrameLayout frameLayout = new FrameLayout(context);
                ilVar.addView(frameLayout, w7.a6.c(114.0f, -2));
                FrameLayout frameLayout2 = new FrameLayout(context);
                llVar2.i0 = frameLayout2;
                frameLayout2.setBackgroundResource(R.drawable.venue_tooltip);
                llVar2.i0.getBackground().setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.h5, f6Var), PorterDuff.Mode.MULTIPLY));
                frameLayout.addView(llVar2.i0, w7.a6.c(71.0f, -2));
                llVar2.i0.setAlpha(0.0f);
                llVar2.i0.setOnClickListener(new org.telegram.ui.sh(19, ilVar, klVar));
                TextView textView = new TextView(context);
                textView.setTextSize(1, 16.0f);
                textView.setMaxLines(1);
                TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                textView.setEllipsize(truncateAt);
                textView.setSingleLine(true);
                textView.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.G6, f6Var));
                textView.setTypeface(AndroidUtilities.bold());
                textView.setGravity(LocaleController.isRTL ? 5 : 3);
                TextView f7 = org.telegram.ui.Cells.r6.f(llVar2.i0, textView, w7.a6.d(-2, -2.0f, (LocaleController.isRTL ? 5 : 3) | 48, 18.0f, 10.0f, 18.0f, 0.0f), context);
                f7.setTextSize(1, 14.0f);
                f7.setMaxLines(1);
                f7.setEllipsize(truncateAt);
                f7.setSingleLine(true);
                f7.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.A6, f6Var));
                f7.setGravity(LocaleController.isRTL ? 5 : 3);
                llVar2.i0.addView(f7, w7.a6.d(-2, -2.0f, (LocaleController.isRTL ? 5 : 3) | 48, 18.0f, 32.0f, 18.0f, 0.0f));
                textView.setText(klVar.c.title);
                f7.setText(LocaleController.getString(R.string.TapToSendLocation));
                FrameLayout frameLayout3 = new FrameLayout(context);
                frameLayout3.setBackground(org.telegram.ui.ActionBar.j6.K(AndroidUtilities.dp(36.0f), org.telegram.ui.Cells.u4.a(klVar.a)));
                frameLayout.addView(frameLayout3, w7.a6.d(36, 36.0f, 81, 0.0f, 0.0f, 0.0f, 4.0f));
                w9 w9Var = new w9(context);
                w9Var.f(a4.a.s(new StringBuilder("https://ss3.4sqi.net/img/categories_v2/"), klVar.c.venue_type, "_64.png"), null, null);
                frameLayout3.addView(w9Var, w7.a6.e(30, 30, 17));
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new hl(ilVar, frameLayout3));
                ofFloat.setDuration(360L);
                ofFloat.start();
                hashMap.put(iMarker, frameLayout);
                llVar2.H.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLng(iMarker.getPosition()), 300, null);
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
        ll llVar = this.b;
        switch (i10) {
            case 2:
                if (llVar.K != 0.0f) {
                    motionEvent = MotionEvent.obtain(motionEvent);
                    motionEvent.offsetLocation(0.0f, (-llVar.K) / 2.0f);
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
                ImageView imageView = llVar.n;
                Property property = View.TRANSLATION_Y;
                ImageView imageView2 = llVar.S;
                if (motionEvent.getAction() == 0) {
                    AnimatorSet animatorSet = llVar.f0;
                    if (animatorSet != null) {
                        animatorSet.cancel();
                    }
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    llVar.f0 = animatorSet2;
                    animatorSet2.setDuration(200L);
                    llVar.f0.playTogether(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property, llVar.s0 - AndroidUtilities.dp(10.0f)));
                    llVar.f0.start();
                } else if (motionEvent.getAction() == 1) {
                    AnimatorSet animatorSet3 = llVar.f0;
                    if (animatorSet3 != null) {
                        animatorSet3.cancel();
                    }
                    llVar.K = 0.0f;
                    AnimatorSet animatorSet4 = new AnimatorSet();
                    llVar.f0 = animatorSet4;
                    animatorSet4.setDuration(200L);
                    llVar.f0.playTogether(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property, llVar.s0));
                    llVar.f0.start();
                }
                if (motionEvent.getAction() == 2) {
                    if (!llVar.u0) {
                        int i11 = org.telegram.ui.ActionBar.j6.ui;
                        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(i11, llVar.a), PorterDuff.Mode.MULTIPLY));
                        imageView.setTag(Integer.valueOf(i11));
                        llVar.u0 = true;
                    }
                    IMapsProvider.IMap iMap = llVar.H;
                    if (iMap != null && (location = llVar.r0) != null) {
                        location.setLatitude(iMap.getCameraPosition().target.latitude);
                        llVar.r0.setLongitude(llVar.H.getCameraPosition().target.longitude);
                    }
                    llVar.O.L(llVar.r0);
                }
                return ((Boolean) iCallableMethod.call(motionEvent)).booleanValue();
        }
    }
}
