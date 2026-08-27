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

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ek implements org.telegram.ui.ActionBar.r0, pf.b, IMapsProvider.ITouchInterceptor, IMapsProvider.OnCameraMoveStartedListener, IMapsProvider.OnMarkerClickListener, org.telegram.ui.ActionBar.a2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ tk b;

    public /* synthetic */ ek(tk tkVar, int i10) {
        this.a = i10;
        this.b = tkVar;
    }

    @Override // pf.b
    public void a(ArrayList arrayList) {
        switch (this.a) {
            case 1:
                tk tkVar = this.b;
                ArrayList arrayList2 = tkVar.a0;
                if (arrayList != null) {
                    int size = arrayList2.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        ((sk) arrayList2.get(i10)).b.remove();
                    }
                    arrayList2.clear();
                    int size2 = arrayList.size();
                    for (int i11 = 0; i11 < size2; i11++) {
                        TLRPC.TL_messageMediaVenue tL_messageMediaVenue = (TLRPC.TL_messageMediaVenue) arrayList.get(i11);
                        try {
                            IMapsProvider.IMarkerOptions onCreateMarkerOptions = ApplicationLoader.getMapsProvider().onCreateMarkerOptions();
                            TLRPC.GeoPoint geoPoint = tL_messageMediaVenue.geo;
                            IMapsProvider.IMarkerOptions position = onCreateMarkerOptions.position(new IMapsProvider.LatLng(geoPoint.lat, geoPoint._long));
                            position.icon(tkVar.V(i11));
                            position.anchor(0.5f, 0.5f);
                            position.title(tL_messageMediaVenue.title);
                            position.snippet(tL_messageMediaVenue.address);
                            sk skVar = new sk();
                            skVar.a = i11;
                            IMapsProvider.IMarker addMarker = tkVar.D.addMarker(position);
                            skVar.b = addMarker;
                            skVar.c = tL_messageMediaVenue;
                            addMarker.setTag(skVar);
                            arrayList2.add(skVar);
                        } catch (Exception e9) {
                            FileLog.e(e9);
                        }
                    }
                    break;
                }
                break;
            default:
                tk tkVar2 = this.b;
                tkVar2.j0 = false;
                tkVar2.f0();
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        tk.T(this.b);
    }

    @Override // org.telegram.ui.ActionBar.r0
    public void h(int i10) {
        IMapsProvider.IMap iMap = this.b.D;
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
        tk tkVar = this.b;
        hh.f1 f1Var = tkVar.L;
        if (i10 == 1) {
            tkVar.d0(true);
            if (tkVar.c0 != null) {
                tkVar.O.setVisibility(0);
                qk qkVar = tkVar.B;
                IMapsProvider.IMarker iMarker = tkVar.c0;
                HashMap hashMap = qkVar.a;
                View view = (View) hashMap.get(iMarker);
                if (view != null) {
                    qkVar.removeView(view);
                    hashMap.remove(iMarker);
                }
                tkVar.c0 = null;
                tkVar.d0 = null;
                tkVar.e0 = null;
            }
            if (tkVar.H || f1Var.getChildCount() <= 0 || (childAt = f1Var.getChildAt(0)) == null) {
                return;
            }
            View F = f1Var.F(childAt);
            f2.o1 T = F == null ? null : f1Var.T(F);
            if (T == null || T.b() != 0) {
                return;
            }
            int dp = tkVar.u0 == 0 ? 0 : AndroidUtilities.dp(66.0f);
            int top = childAt.getTop();
            if (top < (-dp)) {
                IMapsProvider.CameraPosition cameraPosition = tkVar.D.getCameraPosition();
                tkVar.F = ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(cameraPosition.target, cameraPosition.zoom);
                f1Var.v0(0, top + dp, null);
            }
        }
    }

    @Override // org.telegram.messenger.IMapsProvider.OnMarkerClickListener
    public boolean onClick(IMapsProvider.IMarker iMarker) {
        tk tkVar = this.b;
        ImageView imageView = tkVar.n;
        if (iMarker.getTag() instanceof sk) {
            tkVar.O.setVisibility(4);
            if (!tkVar.q0) {
                int i10 = org.telegram.ui.ActionBar.g6.ui;
                imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(i10, tkVar.a), PorterDuff.Mode.MULTIPLY));
                imageView.setTag(Integer.valueOf(i10));
                tkVar.q0 = true;
            }
            qk qkVar = tkVar.B;
            qkVar.getClass();
            HashMap hashMap = qkVar.a;
            sk skVar = (sk) iMarker.getTag();
            tk tkVar2 = qkVar.b;
            sk skVar2 = tkVar2.d0;
            org.telegram.ui.ActionBar.c6 c6Var = tkVar2.a;
            if (skVar2 != skVar) {
                tkVar2.d0(false);
                IMapsProvider.IMarker iMarker2 = tkVar2.c0;
                if (iMarker2 != null) {
                    View view = (View) hashMap.get(iMarker2);
                    if (view != null) {
                        qkVar.removeView(view);
                        hashMap.remove(iMarker2);
                    }
                    tkVar2.c0 = null;
                }
                tkVar2.d0 = skVar;
                tkVar2.c0 = iMarker;
                Context context = qkVar.getContext();
                FrameLayout frameLayout = new FrameLayout(context);
                qkVar.addView(frameLayout, h7.z5.c(114.0f, -2));
                FrameLayout frameLayout2 = new FrameLayout(context);
                tkVar2.e0 = frameLayout2;
                frameLayout2.setBackgroundResource(R.drawable.venue_tooltip);
                tkVar2.e0.getBackground().setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.h5, c6Var), PorterDuff.Mode.MULTIPLY));
                frameLayout.addView(tkVar2.e0, h7.z5.c(71.0f, -2));
                tkVar2.e0.setAlpha(0.0f);
                tkVar2.e0.setOnClickListener(new q2(10, qkVar, skVar));
                TextView textView = new TextView(context);
                textView.setTextSize(1, 16.0f);
                textView.setMaxLines(1);
                TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                textView.setEllipsize(truncateAt);
                textView.setSingleLine(true);
                textView.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.G6, c6Var));
                textView.setTypeface(AndroidUtilities.bold());
                textView.setGravity(LocaleController.isRTL ? 5 : 3);
                TextView h = org.telegram.ui.Cells.pa.h(tkVar2.e0, textView, h7.z5.d(-2, -2.0f, (LocaleController.isRTL ? 5 : 3) | 48, 18.0f, 10.0f, 18.0f, 0.0f), context);
                h.setTextSize(1, 14.0f);
                h.setMaxLines(1);
                h.setEllipsize(truncateAt);
                h.setSingleLine(true);
                h.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.A6, c6Var));
                h.setGravity(LocaleController.isRTL ? 5 : 3);
                tkVar2.e0.addView(h, h7.z5.d(-2, -2.0f, (LocaleController.isRTL ? 5 : 3) | 48, 18.0f, 32.0f, 18.0f, 0.0f));
                textView.setText(skVar.c.title);
                h.setText(LocaleController.getString(R.string.TapToSendLocation));
                FrameLayout frameLayout3 = new FrameLayout(context);
                frameLayout3.setBackground(org.telegram.ui.ActionBar.g6.K(AndroidUtilities.dp(36.0f), org.telegram.ui.Cells.r4.a(skVar.a)));
                frameLayout.addView(frameLayout3, h7.z5.d(36, 36.0f, 81, 0.0f, 0.0f, 0.0f, 4.0f));
                n9 n9Var = new n9(context);
                n9Var.f(a9.p.p(new StringBuilder("https://ss3.4sqi.net/img/categories_v2/"), skVar.c.venue_type, "_64.png"), null, null);
                frameLayout3.addView(n9Var, h7.z5.e(30, 30, 17));
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new pk(qkVar, frameLayout3));
                ofFloat.setDuration(360L);
                ofFloat.start();
                hashMap.put(iMarker, frameLayout);
                tkVar2.D.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLng(iMarker.getPosition()), 300, null);
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
        tk tkVar = this.b;
        switch (i10) {
            case 2:
                if (tkVar.G != 0.0f) {
                    motionEvent = MotionEvent.obtain(motionEvent);
                    motionEvent.offsetLocation(0.0f, (-tkVar.G) / 2.0f);
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
                ImageView imageView = tkVar.n;
                Property property = View.TRANSLATION_Y;
                ImageView imageView2 = tkVar.O;
                if (motionEvent.getAction() == 0) {
                    AnimatorSet animatorSet = tkVar.b0;
                    if (animatorSet != null) {
                        animatorSet.cancel();
                    }
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    tkVar.b0 = animatorSet2;
                    animatorSet2.setDuration(200L);
                    tkVar.b0.playTogether(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property, tkVar.o0 - AndroidUtilities.dp(10.0f)));
                    tkVar.b0.start();
                } else if (motionEvent.getAction() == 1) {
                    AnimatorSet animatorSet3 = tkVar.b0;
                    if (animatorSet3 != null) {
                        animatorSet3.cancel();
                    }
                    tkVar.G = 0.0f;
                    AnimatorSet animatorSet4 = new AnimatorSet();
                    tkVar.b0 = animatorSet4;
                    animatorSet4.setDuration(200L);
                    tkVar.b0.playTogether(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property, tkVar.o0));
                    tkVar.b0.start();
                }
                if (motionEvent.getAction() == 2) {
                    if (!tkVar.q0) {
                        int i11 = org.telegram.ui.ActionBar.g6.ui;
                        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(i11, tkVar.a), PorterDuff.Mode.MULTIPLY));
                        imageView.setTag(Integer.valueOf(i11));
                        tkVar.q0 = true;
                    }
                    IMapsProvider.IMap iMap = tkVar.D;
                    if (iMap != null && (location = tkVar.n0) != null) {
                        location.setLatitude(iMap.getCameraPosition().target.latitude);
                        tkVar.n0.setLongitude(tkVar.D.getCameraPosition().target.longitude);
                    }
                    tkVar.K.L(tkVar.n0);
                }
                return ((Boolean) iCallableMethod.call(motionEvent)).booleanValue();
        }
    }
}
