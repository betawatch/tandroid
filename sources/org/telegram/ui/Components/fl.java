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

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final /* synthetic */ class fl implements org.telegram.ui.ActionBar.q0, hg.b, IMapsProvider.ITouchInterceptor, IMapsProvider.OnCameraMoveStartedListener, IMapsProvider.OnMarkerClickListener, org.telegram.ui.ActionBar.z1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ul b;

    public /* synthetic */ fl(ul ulVar, int i10) {
        this.a = i10;
        this.b = ulVar;
    }

    @Override // hg.b
    public void a(ArrayList arrayList) {
        switch (this.a) {
            case 1:
                ul ulVar = this.b;
                ArrayList arrayList2 = ulVar.e0;
                if (arrayList != null) {
                    int size = arrayList2.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        ((tl) arrayList2.get(i10)).b.remove();
                    }
                    arrayList2.clear();
                    int size2 = arrayList.size();
                    for (int i11 = 0; i11 < size2; i11++) {
                        TLRPC.TL_messageMediaVenue tL_messageMediaVenue = (TLRPC.TL_messageMediaVenue) arrayList.get(i11);
                        try {
                            IMapsProvider.IMarkerOptions onCreateMarkerOptions = ApplicationLoader.getMapsProvider().onCreateMarkerOptions();
                            TLRPC.GeoPoint geoPoint = tL_messageMediaVenue.geo;
                            IMapsProvider.IMarkerOptions position = onCreateMarkerOptions.position(new IMapsProvider.LatLng(geoPoint.lat, geoPoint._long));
                            position.icon(ulVar.Y(i11));
                            position.anchor(0.5f, 0.5f);
                            position.title(tL_messageMediaVenue.title);
                            position.snippet(tL_messageMediaVenue.address);
                            tl tlVar = new tl();
                            tlVar.a = i11;
                            IMapsProvider.IMarker addMarker = ulVar.H.addMarker(position);
                            tlVar.b = addMarker;
                            tlVar.c = tL_messageMediaVenue;
                            addMarker.setTag(tlVar);
                            arrayList2.add(tlVar);
                        } catch (Exception e) {
                            FileLog.e(e);
                        }
                    }
                    break;
                }
                break;
            default:
                ul ulVar2 = this.b;
                ulVar2.n0 = false;
                ulVar2.i0();
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.z1
    public void g(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        ul.W(this.b);
    }

    @Override // org.telegram.ui.ActionBar.q0
    public void l(int i10) {
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
        ul ulVar = this.b;
        bi.o0 o0Var = ulVar.P;
        if (i10 == 1) {
            ulVar.g0(true);
            if (ulVar.g0 != null) {
                ulVar.S.setVisibility(0);
                rl rlVar = ulVar.F;
                IMapsProvider.IMarker iMarker = ulVar.g0;
                HashMap hashMap = rlVar.a;
                View view = (View) hashMap.get(iMarker);
                if (view != null) {
                    rlVar.removeView(view);
                    hashMap.remove(iMarker);
                }
                ulVar.g0 = null;
                ulVar.h0 = null;
                ulVar.i0 = null;
            }
            if (ulVar.L || o0Var.getChildCount() <= 0 || (childAt = o0Var.getChildAt(0)) == null) {
                return;
            }
            View F = o0Var.F(childAt);
            s4.b1 T = F == null ? null : o0Var.T(F);
            if (T == null || T.b() != 0) {
                return;
            }
            int dp = ulVar.y0 == 0 ? 0 : AndroidUtilities.dp(66.0f);
            int top = childAt.getTop();
            if (top < (-dp)) {
                IMapsProvider.CameraPosition cameraPosition = ulVar.H.getCameraPosition();
                ulVar.J = ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(cameraPosition.target, cameraPosition.zoom);
                o0Var.v0(0, top + dp, null);
            }
        }
    }

    @Override // org.telegram.messenger.IMapsProvider.OnMarkerClickListener
    public boolean onClick(IMapsProvider.IMarker iMarker) {
        ul ulVar = this.b;
        ImageView imageView = ulVar.n;
        if (iMarker.getTag() instanceof tl) {
            ulVar.S.setVisibility(4);
            if (!ulVar.u0) {
                int i10 = org.telegram.ui.ActionBar.g6.ui;
                imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(i10, ulVar.a), PorterDuff.Mode.MULTIPLY));
                imageView.setTag(Integer.valueOf(i10));
                ulVar.u0 = true;
            }
            rl rlVar = ulVar.F;
            rlVar.getClass();
            HashMap hashMap = rlVar.a;
            tl tlVar = (tl) iMarker.getTag();
            ul ulVar2 = rlVar.b;
            tl tlVar2 = ulVar2.h0;
            org.telegram.ui.ActionBar.c6 c6Var = ulVar2.a;
            if (tlVar2 != tlVar) {
                ulVar2.g0(false);
                IMapsProvider.IMarker iMarker2 = ulVar2.g0;
                if (iMarker2 != null) {
                    View view = (View) hashMap.get(iMarker2);
                    if (view != null) {
                        rlVar.removeView(view);
                        hashMap.remove(iMarker2);
                    }
                    ulVar2.g0 = null;
                }
                ulVar2.h0 = tlVar;
                ulVar2.g0 = iMarker;
                Context context = rlVar.getContext();
                FrameLayout frameLayout = new FrameLayout(context);
                rlVar.addView(frameLayout, w7.a6.d(114.0f, -2));
                FrameLayout frameLayout2 = new FrameLayout(context);
                ulVar2.i0 = frameLayout2;
                frameLayout2.setBackgroundResource(R.drawable.venue_tooltip);
                ulVar2.i0.getBackground().setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.h5, c6Var), PorterDuff.Mode.MULTIPLY));
                frameLayout.addView(ulVar2.i0, w7.a6.d(71.0f, -2));
                ulVar2.i0.setAlpha(0.0f);
                ulVar2.i0.setOnClickListener(new org.telegram.ui.xf(22, rlVar, tlVar));
                TextView textView = new TextView(context);
                textView.setTextSize(1, 16.0f);
                textView.setMaxLines(1);
                TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                textView.setEllipsize(truncateAt);
                textView.setSingleLine(true);
                textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.G6, c6Var));
                textView.setTypeface(AndroidUtilities.bold());
                textView.setGravity(LocaleController.isRTL ? 5 : 3);
                TextView h = org.telegram.ui.Cells.d0.h(ulVar2.i0, textView, w7.a6.a(-2.0f, 18.0f, 10.0f, 18.0f, 0.0f, -2, (LocaleController.isRTL ? 5 : 3) | 48), context);
                h.setTextSize(1, 14.0f);
                h.setMaxLines(1);
                h.setEllipsize(truncateAt);
                h.setSingleLine(true);
                h.setTextColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.A6, c6Var));
                h.setGravity(LocaleController.isRTL ? 5 : 3);
                ulVar2.i0.addView(h, w7.a6.a(-2.0f, 18.0f, 32.0f, 18.0f, 0.0f, -2, (LocaleController.isRTL ? 5 : 3) | 48));
                textView.setText(tlVar.c.title);
                h.setText(LocaleController.getString(R.string.TapToSendLocation));
                FrameLayout frameLayout3 = new FrameLayout(context);
                frameLayout3.setBackground(org.telegram.ui.ActionBar.g6.K(AndroidUtilities.dp(36.0f), org.telegram.ui.Cells.u4.a(tlVar.a)));
                frameLayout.addView(frameLayout3, w7.a6.a(36.0f, 0.0f, 0.0f, 0.0f, 4.0f, 36, 81));
                z9 z9Var = new z9(context);
                z9Var.f(a1.g.s(new StringBuilder("https://ss3.4sqi.net/img/categories_v2/"), tlVar.c.venue_type, "_64.png"), null, null);
                frameLayout3.addView(z9Var, w7.a6.e(30, 30, 17));
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new ql(rlVar, frameLayout3));
                ofFloat.setDuration(360L);
                ofFloat.start();
                hashMap.put(iMarker, frameLayout);
                ulVar2.H.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLng(iMarker.getPosition()), 300, null);
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
        ul ulVar = this.b;
        switch (i10) {
            case 2:
                if (ulVar.K != 0.0f) {
                    motionEvent = MotionEvent.obtain(motionEvent);
                    motionEvent.offsetLocation(0.0f, (-ulVar.K) / 2.0f);
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
                ImageView imageView = ulVar.n;
                Property property = View.TRANSLATION_Y;
                ImageView imageView2 = ulVar.S;
                if (motionEvent.getAction() == 0) {
                    AnimatorSet animatorSet = ulVar.f0;
                    if (animatorSet != null) {
                        animatorSet.cancel();
                    }
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    ulVar.f0 = animatorSet2;
                    animatorSet2.setDuration(200L);
                    ulVar.f0.playTogether(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property, ulVar.s0 - AndroidUtilities.dp(10.0f)));
                    ulVar.f0.start();
                } else if (motionEvent.getAction() == 1) {
                    AnimatorSet animatorSet3 = ulVar.f0;
                    if (animatorSet3 != null) {
                        animatorSet3.cancel();
                    }
                    ulVar.K = 0.0f;
                    AnimatorSet animatorSet4 = new AnimatorSet();
                    ulVar.f0 = animatorSet4;
                    animatorSet4.setDuration(200L);
                    ulVar.f0.playTogether(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property, ulVar.s0));
                    ulVar.f0.start();
                }
                if (motionEvent.getAction() == 2) {
                    if (!ulVar.u0) {
                        int i11 = org.telegram.ui.ActionBar.g6.ui;
                        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(i11, ulVar.a), PorterDuff.Mode.MULTIPLY));
                        imageView.setTag(Integer.valueOf(i11));
                        ulVar.u0 = true;
                    }
                    IMapsProvider.IMap iMap = ulVar.H;
                    if (iMap != null && (location = ulVar.r0) != null) {
                        location.setLatitude(iMap.getCameraPosition().target.latitude);
                        ulVar.r0.setLongitude(ulVar.H.getCameraPosition().target.longitude);
                    }
                    ulVar.O.L(ulVar.r0);
                }
                return ((Boolean) iCallableMethod.call(motionEvent)).booleanValue();
        }
    }
}
