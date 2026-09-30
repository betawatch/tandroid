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

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes3.dex */
public final /* synthetic */ class tk implements org.telegram.ui.ActionBar.q0, gg.b, IMapsProvider.ITouchInterceptor, IMapsProvider.OnCameraMoveStartedListener, IMapsProvider.OnMarkerClickListener, org.telegram.ui.ActionBar.z1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ il b;

    public /* synthetic */ tk(il ilVar, int i10) {
        this.a = i10;
        this.b = ilVar;
    }

    @Override // gg.b
    public void a(ArrayList arrayList) {
        switch (this.a) {
            case 1:
                il ilVar = this.b;
                ArrayList arrayList2 = ilVar.e0;
                if (arrayList != null) {
                    int size = arrayList2.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        ((hl) arrayList2.get(i10)).b.remove();
                    }
                    arrayList2.clear();
                    int size2 = arrayList.size();
                    for (int i11 = 0; i11 < size2; i11++) {
                        TLRPC.TL_messageMediaVenue tL_messageMediaVenue = (TLRPC.TL_messageMediaVenue) arrayList.get(i11);
                        try {
                            IMapsProvider.IMarkerOptions onCreateMarkerOptions = ApplicationLoader.getMapsProvider().onCreateMarkerOptions();
                            TLRPC.GeoPoint geoPoint = tL_messageMediaVenue.geo;
                            IMapsProvider.IMarkerOptions position = onCreateMarkerOptions.position(new IMapsProvider.LatLng(geoPoint.lat, geoPoint._long));
                            position.icon(ilVar.V(i11));
                            position.anchor(0.5f, 0.5f);
                            position.title(tL_messageMediaVenue.title);
                            position.snippet(tL_messageMediaVenue.address);
                            hl hlVar = new hl();
                            hlVar.a = i11;
                            IMapsProvider.IMarker addMarker = ilVar.H.addMarker(position);
                            hlVar.b = addMarker;
                            hlVar.c = tL_messageMediaVenue;
                            addMarker.setTag(hlVar);
                            arrayList2.add(hlVar);
                        } catch (Exception e) {
                            FileLog.e(e);
                        }
                    }
                    break;
                }
                break;
            default:
                il ilVar2 = this.b;
                ilVar2.n0 = false;
                ilVar2.f0();
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.z1
    public void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        il.T(this.b);
    }

    @Override // org.telegram.ui.ActionBar.q0
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
        il ilVar = this.b;
        ai.w0 w0Var = ilVar.P;
        if (i10 == 1) {
            ilVar.d0(true);
            if (ilVar.g0 != null) {
                ilVar.S.setVisibility(0);
                fl flVar = ilVar.F;
                IMapsProvider.IMarker iMarker = ilVar.g0;
                HashMap hashMap = flVar.a;
                View view = (View) hashMap.get(iMarker);
                if (view != null) {
                    flVar.removeView(view);
                    hashMap.remove(iMarker);
                }
                ilVar.g0 = null;
                ilVar.h0 = null;
                ilVar.i0 = null;
            }
            if (ilVar.L || w0Var.getChildCount() <= 0 || (childAt = w0Var.getChildAt(0)) == null) {
                return;
            }
            View F = w0Var.F(childAt);
            s4.c1 T = F == null ? null : w0Var.T(F);
            if (T == null || T.b() != 0) {
                return;
            }
            int dp = ilVar.y0 == 0 ? 0 : AndroidUtilities.dp(66.0f);
            int top = childAt.getTop();
            if (top < (-dp)) {
                IMapsProvider.CameraPosition cameraPosition = ilVar.H.getCameraPosition();
                ilVar.J = ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(cameraPosition.target, cameraPosition.zoom);
                w0Var.v0(0, top + dp, null);
            }
        }
    }

    @Override // org.telegram.messenger.IMapsProvider.OnMarkerClickListener
    public boolean onClick(IMapsProvider.IMarker iMarker) {
        il ilVar = this.b;
        ImageView imageView = ilVar.n;
        if (iMarker.getTag() instanceof hl) {
            ilVar.S.setVisibility(4);
            if (!ilVar.u0) {
                int i10 = org.telegram.ui.ActionBar.h6.ui;
                imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.v0(i10, ilVar.a), PorterDuff.Mode.MULTIPLY));
                imageView.setTag(Integer.valueOf(i10));
                ilVar.u0 = true;
            }
            fl flVar = ilVar.F;
            flVar.getClass();
            HashMap hashMap = flVar.a;
            hl hlVar = (hl) iMarker.getTag();
            il ilVar2 = flVar.b;
            hl hlVar2 = ilVar2.h0;
            org.telegram.ui.ActionBar.d6 d6Var = ilVar2.a;
            if (hlVar2 != hlVar) {
                ilVar2.d0(false);
                IMapsProvider.IMarker iMarker2 = ilVar2.g0;
                if (iMarker2 != null) {
                    View view = (View) hashMap.get(iMarker2);
                    if (view != null) {
                        flVar.removeView(view);
                        hashMap.remove(iMarker2);
                    }
                    ilVar2.g0 = null;
                }
                ilVar2.h0 = hlVar;
                ilVar2.g0 = iMarker;
                Context context = flVar.getContext();
                FrameLayout frameLayout = new FrameLayout(context);
                flVar.addView(frameLayout, w7.y5.c(114.0f, -2));
                FrameLayout frameLayout2 = new FrameLayout(context);
                ilVar2.i0 = frameLayout2;
                frameLayout2.setBackgroundResource(R.drawable.venue_tooltip);
                ilVar2.i0.getBackground().setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.h5, d6Var), PorterDuff.Mode.MULTIPLY));
                frameLayout.addView(ilVar2.i0, w7.y5.c(71.0f, -2));
                ilVar2.i0.setAlpha(0.0f);
                ilVar2.i0.setOnClickListener(new org.telegram.ui.pf(22, flVar, hlVar));
                TextView textView = new TextView(context);
                textView.setTextSize(1, 16.0f);
                textView.setMaxLines(1);
                TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                textView.setEllipsize(truncateAt);
                textView.setSingleLine(true);
                textView.setTextColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.G6, d6Var));
                textView.setTypeface(AndroidUtilities.bold());
                textView.setGravity(LocaleController.isRTL ? 5 : 3);
                TextView h = org.telegram.ui.Cells.c1.h(ilVar2.i0, textView, w7.y5.d(-2, -2.0f, (LocaleController.isRTL ? 5 : 3) | 48, 18.0f, 10.0f, 18.0f, 0.0f), context);
                h.setTextSize(1, 14.0f);
                h.setMaxLines(1);
                h.setEllipsize(truncateAt);
                h.setSingleLine(true);
                h.setTextColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.A6, d6Var));
                h.setGravity(LocaleController.isRTL ? 5 : 3);
                ilVar2.i0.addView(h, w7.y5.d(-2, -2.0f, (LocaleController.isRTL ? 5 : 3) | 48, 18.0f, 32.0f, 18.0f, 0.0f));
                textView.setText(hlVar.c.title);
                h.setText(LocaleController.getString(R.string.TapToSendLocation));
                FrameLayout frameLayout3 = new FrameLayout(context);
                frameLayout3.setBackground(org.telegram.ui.ActionBar.h6.K(AndroidUtilities.dp(36.0f), org.telegram.ui.Cells.u4.a(hlVar.a)));
                frameLayout.addView(frameLayout3, w7.y5.d(36, 36.0f, 81, 0.0f, 0.0f, 0.0f, 4.0f));
                w9 w9Var = new w9(context);
                w9Var.f(a4.a.t(new StringBuilder("https://ss3.4sqi.net/img/categories_v2/"), hlVar.c.venue_type, "_64.png"), null, null);
                frameLayout3.addView(w9Var, w7.y5.e(30, 30, 17));
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new el(flVar, frameLayout3));
                ofFloat.setDuration(360L);
                ofFloat.start();
                hashMap.put(iMarker, frameLayout);
                ilVar2.H.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLng(iMarker.getPosition()), 300, null);
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
        il ilVar = this.b;
        switch (i10) {
            case 2:
                if (ilVar.K != 0.0f) {
                    motionEvent = MotionEvent.obtain(motionEvent);
                    motionEvent.offsetLocation(0.0f, (-ilVar.K) / 2.0f);
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
                ImageView imageView = ilVar.n;
                Property property = View.TRANSLATION_Y;
                ImageView imageView2 = ilVar.S;
                if (motionEvent.getAction() == 0) {
                    AnimatorSet animatorSet = ilVar.f0;
                    if (animatorSet != null) {
                        animatorSet.cancel();
                    }
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    ilVar.f0 = animatorSet2;
                    animatorSet2.setDuration(200L);
                    ilVar.f0.playTogether(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property, ilVar.s0 - AndroidUtilities.dp(10.0f)));
                    ilVar.f0.start();
                } else if (motionEvent.getAction() == 1) {
                    AnimatorSet animatorSet3 = ilVar.f0;
                    if (animatorSet3 != null) {
                        animatorSet3.cancel();
                    }
                    ilVar.K = 0.0f;
                    AnimatorSet animatorSet4 = new AnimatorSet();
                    ilVar.f0 = animatorSet4;
                    animatorSet4.setDuration(200L);
                    ilVar.f0.playTogether(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property, ilVar.s0));
                    ilVar.f0.start();
                }
                if (motionEvent.getAction() == 2) {
                    if (!ilVar.u0) {
                        int i11 = org.telegram.ui.ActionBar.h6.ui;
                        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.v0(i11, ilVar.a), PorterDuff.Mode.MULTIPLY));
                        imageView.setTag(Integer.valueOf(i11));
                        ilVar.u0 = true;
                    }
                    IMapsProvider.IMap iMap = ilVar.H;
                    if (iMap != null && (location = ilVar.r0) != null) {
                        location.setLatitude(iMap.getCameraPosition().target.latitude);
                        ilVar.r0.setLongitude(ilVar.H.getCameraPosition().target.longitude);
                    }
                    ilVar.O.L(ilVar.r0);
                }
                return ((Boolean) iCallableMethod.call(motionEvent)).booleanValue();
        }
    }
}
