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

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final /* synthetic */ class il implements org.telegram.ui.ActionBar.r0, gg.b, IMapsProvider.ITouchInterceptor, IMapsProvider.OnCameraMoveStartedListener, IMapsProvider.OnMarkerClickListener, org.telegram.ui.ActionBar.a2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ xl b;

    public /* synthetic */ il(xl xlVar, int i10) {
        this.a = i10;
        this.b = xlVar;
    }

    @Override // gg.b
    public void a(ArrayList arrayList) {
        switch (this.a) {
            case 1:
                xl xlVar = this.b;
                ArrayList arrayList2 = xlVar.e0;
                if (arrayList != null) {
                    int size = arrayList2.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        ((wl) arrayList2.get(i10)).b.remove();
                    }
                    arrayList2.clear();
                    int size2 = arrayList.size();
                    for (int i11 = 0; i11 < size2; i11++) {
                        TLRPC.TL_messageMediaVenue tL_messageMediaVenue = (TLRPC.TL_messageMediaVenue) arrayList.get(i11);
                        try {
                            IMapsProvider.IMarkerOptions onCreateMarkerOptions = ApplicationLoader.getMapsProvider().onCreateMarkerOptions();
                            TLRPC.GeoPoint geoPoint = tL_messageMediaVenue.geo;
                            IMapsProvider.IMarkerOptions position = onCreateMarkerOptions.position(new IMapsProvider.LatLng(geoPoint.lat, geoPoint._long));
                            position.icon(xlVar.Y(i11));
                            position.anchor(0.5f, 0.5f);
                            position.title(tL_messageMediaVenue.title);
                            position.snippet(tL_messageMediaVenue.address);
                            wl wlVar = new wl();
                            wlVar.a = i11;
                            IMapsProvider.IMarker addMarker = xlVar.H.addMarker(position);
                            wlVar.b = addMarker;
                            wlVar.c = tL_messageMediaVenue;
                            addMarker.setTag(wlVar);
                            arrayList2.add(wlVar);
                        } catch (Exception e7) {
                            FileLog.e(e7);
                        }
                    }
                    break;
                }
                break;
            default:
                xl xlVar2 = this.b;
                xlVar2.n0 = false;
                xlVar2.i0();
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        xl.W(this.b);
    }

    @Override // org.telegram.ui.ActionBar.r0
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
        xl xlVar = this.b;
        ai.w0 w0Var = xlVar.P;
        if (i10 == 1) {
            xlVar.g0(true);
            if (xlVar.g0 != null) {
                xlVar.S.setVisibility(0);
                ul ulVar = xlVar.F;
                IMapsProvider.IMarker iMarker = xlVar.g0;
                HashMap hashMap = ulVar.a;
                View view = (View) hashMap.get(iMarker);
                if (view != null) {
                    ulVar.removeView(view);
                    hashMap.remove(iMarker);
                }
                xlVar.g0 = null;
                xlVar.h0 = null;
                xlVar.i0 = null;
            }
            if (xlVar.L || w0Var.getChildCount() <= 0 || (childAt = w0Var.getChildAt(0)) == null) {
                return;
            }
            View F = w0Var.F(childAt);
            s4.d1 T = F == null ? null : w0Var.T(F);
            if (T == null || T.b() != 0) {
                return;
            }
            int dp = xlVar.y0 == 0 ? 0 : AndroidUtilities.dp(66.0f);
            int top = childAt.getTop();
            if (top < (-dp)) {
                IMapsProvider.CameraPosition cameraPosition = xlVar.H.getCameraPosition();
                xlVar.J = ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(cameraPosition.target, cameraPosition.zoom);
                w0Var.v0(0, top + dp, null);
            }
        }
    }

    @Override // org.telegram.messenger.IMapsProvider.OnMarkerClickListener
    public boolean onClick(IMapsProvider.IMarker iMarker) {
        xl xlVar = this.b;
        ImageView imageView = xlVar.n;
        if (iMarker.getTag() instanceof wl) {
            xlVar.S.setVisibility(4);
            if (!xlVar.u0) {
                int i10 = org.telegram.ui.ActionBar.i6.ui;
                imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.w0(i10, xlVar.a), PorterDuff.Mode.MULTIPLY));
                imageView.setTag(Integer.valueOf(i10));
                xlVar.u0 = true;
            }
            ul ulVar = xlVar.F;
            ulVar.getClass();
            HashMap hashMap = ulVar.a;
            wl wlVar = (wl) iMarker.getTag();
            xl xlVar2 = ulVar.b;
            wl wlVar2 = xlVar2.h0;
            org.telegram.ui.ActionBar.e6 e6Var = xlVar2.a;
            if (wlVar2 != wlVar) {
                xlVar2.g0(false);
                IMapsProvider.IMarker iMarker2 = xlVar2.g0;
                if (iMarker2 != null) {
                    View view = (View) hashMap.get(iMarker2);
                    if (view != null) {
                        ulVar.removeView(view);
                        hashMap.remove(iMarker2);
                    }
                    xlVar2.g0 = null;
                }
                xlVar2.h0 = wlVar;
                xlVar2.g0 = iMarker;
                Context context = ulVar.getContext();
                FrameLayout frameLayout = new FrameLayout(context);
                ulVar.addView(frameLayout, w7.x5.d(114.0f, -2));
                FrameLayout frameLayout2 = new FrameLayout(context);
                xlVar2.i0 = frameLayout2;
                frameLayout2.setBackgroundResource(R.drawable.venue_tooltip);
                xlVar2.i0.getBackground().setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.h5, e6Var), PorterDuff.Mode.MULTIPLY));
                frameLayout.addView(xlVar2.i0, w7.x5.d(71.0f, -2));
                xlVar2.i0.setAlpha(0.0f);
                xlVar2.i0.setOnClickListener(new org.telegram.ui.sf(22, ulVar, wlVar));
                TextView textView = new TextView(context);
                textView.setTextSize(1, 16.0f);
                textView.setMaxLines(1);
                TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                textView.setEllipsize(truncateAt);
                textView.setSingleLine(true);
                textView.setTextColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.G6, e6Var));
                textView.setTypeface(AndroidUtilities.bold());
                textView.setGravity(LocaleController.isRTL ? 5 : 3);
                TextView g10 = org.telegram.ui.Cells.c1.g(xlVar2.i0, textView, w7.x5.a(-2.0f, 18.0f, 10.0f, 18.0f, 0.0f, -2, (LocaleController.isRTL ? 5 : 3) | 48), context);
                g10.setTextSize(1, 14.0f);
                g10.setMaxLines(1);
                g10.setEllipsize(truncateAt);
                g10.setSingleLine(true);
                g10.setTextColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.A6, e6Var));
                g10.setGravity(LocaleController.isRTL ? 5 : 3);
                xlVar2.i0.addView(g10, w7.x5.a(-2.0f, 18.0f, 32.0f, 18.0f, 0.0f, -2, (LocaleController.isRTL ? 5 : 3) | 48));
                textView.setText(wlVar.c.title);
                g10.setText(LocaleController.getString(R.string.TapToSendLocation));
                FrameLayout frameLayout3 = new FrameLayout(context);
                frameLayout3.setBackground(org.telegram.ui.ActionBar.i6.K(AndroidUtilities.dp(36.0f), org.telegram.ui.Cells.u4.a(wlVar.a)));
                frameLayout.addView(frameLayout3, w7.x5.a(36.0f, 0.0f, 0.0f, 0.0f, 4.0f, 36, 81));
                y9 y9Var = new y9(context);
                y9Var.f(a1.g.t(new StringBuilder("https://ss3.4sqi.net/img/categories_v2/"), wlVar.c.venue_type, "_64.png"), null, null);
                frameLayout3.addView(y9Var, w7.x5.e(30, 30, 17));
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new tl(ulVar, frameLayout3));
                ofFloat.setDuration(360L);
                ofFloat.start();
                hashMap.put(iMarker, frameLayout);
                xlVar2.H.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLng(iMarker.getPosition()), 300, null);
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
        xl xlVar = this.b;
        switch (i10) {
            case 2:
                if (xlVar.K != 0.0f) {
                    motionEvent = MotionEvent.obtain(motionEvent);
                    motionEvent.offsetLocation(0.0f, (-xlVar.K) / 2.0f);
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
                ImageView imageView = xlVar.n;
                Property property = View.TRANSLATION_Y;
                ImageView imageView2 = xlVar.S;
                if (motionEvent.getAction() == 0) {
                    AnimatorSet animatorSet = xlVar.f0;
                    if (animatorSet != null) {
                        animatorSet.cancel();
                    }
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    xlVar.f0 = animatorSet2;
                    animatorSet2.setDuration(200L);
                    xlVar.f0.playTogether(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property, xlVar.s0 - AndroidUtilities.dp(10.0f)));
                    xlVar.f0.start();
                } else if (motionEvent.getAction() == 1) {
                    AnimatorSet animatorSet3 = xlVar.f0;
                    if (animatorSet3 != null) {
                        animatorSet3.cancel();
                    }
                    xlVar.K = 0.0f;
                    AnimatorSet animatorSet4 = new AnimatorSet();
                    xlVar.f0 = animatorSet4;
                    animatorSet4.setDuration(200L);
                    xlVar.f0.playTogether(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property, xlVar.s0));
                    xlVar.f0.start();
                }
                if (motionEvent.getAction() == 2) {
                    if (!xlVar.u0) {
                        int i11 = org.telegram.ui.ActionBar.i6.ui;
                        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.w0(i11, xlVar.a), PorterDuff.Mode.MULTIPLY));
                        imageView.setTag(Integer.valueOf(i11));
                        xlVar.u0 = true;
                    }
                    IMapsProvider.IMap iMap = xlVar.H;
                    if (iMap != null && (location = xlVar.r0) != null) {
                        location.setLatitude(iMap.getCameraPosition().target.latitude);
                        xlVar.r0.setLongitude(xlVar.H.getCameraPosition().target.longitude);
                    }
                    xlVar.O.L(xlVar.r0);
                }
                return ((Boolean) iCallableMethod.call(motionEvent)).booleanValue();
        }
    }
}
