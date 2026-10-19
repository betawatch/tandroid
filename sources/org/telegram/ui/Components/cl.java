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

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final /* synthetic */ class cl implements org.telegram.ui.ActionBar.q0, hg.b, IMapsProvider.ITouchInterceptor, IMapsProvider.OnCameraMoveStartedListener, IMapsProvider.OnMarkerClickListener, org.telegram.ui.ActionBar.a2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ rl b;

    public /* synthetic */ cl(rl rlVar, int i10) {
        this.a = i10;
        this.b = rlVar;
    }

    @Override // hg.b
    public void a(ArrayList arrayList) {
        switch (this.a) {
            case 1:
                rl rlVar = this.b;
                ArrayList arrayList2 = rlVar.e0;
                if (arrayList != null) {
                    int size = arrayList2.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        ((ql) arrayList2.get(i10)).b.remove();
                    }
                    arrayList2.clear();
                    int size2 = arrayList.size();
                    for (int i11 = 0; i11 < size2; i11++) {
                        TLRPC.TL_messageMediaVenue tL_messageMediaVenue = (TLRPC.TL_messageMediaVenue) arrayList.get(i11);
                        try {
                            IMapsProvider.IMarkerOptions onCreateMarkerOptions = ApplicationLoader.getMapsProvider().onCreateMarkerOptions();
                            TLRPC.GeoPoint geoPoint = tL_messageMediaVenue.geo;
                            IMapsProvider.IMarkerOptions position = onCreateMarkerOptions.position(new IMapsProvider.LatLng(geoPoint.lat, geoPoint._long));
                            position.icon(rlVar.Y(i11));
                            position.anchor(0.5f, 0.5f);
                            position.title(tL_messageMediaVenue.title);
                            position.snippet(tL_messageMediaVenue.address);
                            ql qlVar = new ql();
                            qlVar.a = i11;
                            IMapsProvider.IMarker addMarker = rlVar.H.addMarker(position);
                            qlVar.b = addMarker;
                            qlVar.c = tL_messageMediaVenue;
                            addMarker.setTag(qlVar);
                            arrayList2.add(qlVar);
                        } catch (Exception e) {
                            FileLog.e(e);
                        }
                    }
                    break;
                }
                break;
            default:
                rl rlVar2 = this.b;
                rlVar2.n0 = false;
                rlVar2.i0();
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        rl.W(this.b);
    }

    @Override // org.telegram.ui.ActionBar.q0
    public void j(int i10) {
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
        rl rlVar = this.b;
        ai.u1 u1Var = rlVar.P;
        if (i10 == 1) {
            rlVar.g0(true);
            if (rlVar.g0 != null) {
                rlVar.S.setVisibility(0);
                ol olVar = rlVar.F;
                IMapsProvider.IMarker iMarker = rlVar.g0;
                HashMap hashMap = olVar.a;
                View view = (View) hashMap.get(iMarker);
                if (view != null) {
                    olVar.removeView(view);
                    hashMap.remove(iMarker);
                }
                rlVar.g0 = null;
                rlVar.h0 = null;
                rlVar.i0 = null;
            }
            if (rlVar.L || u1Var.getChildCount() <= 0 || (childAt = u1Var.getChildAt(0)) == null) {
                return;
            }
            View F = u1Var.F(childAt);
            s4.b1 T = F == null ? null : u1Var.T(F);
            if (T == null || T.b() != 0) {
                return;
            }
            int dp = rlVar.y0 == 0 ? 0 : AndroidUtilities.dp(66.0f);
            int top = childAt.getTop();
            if (top < (-dp)) {
                IMapsProvider.CameraPosition cameraPosition = rlVar.H.getCameraPosition();
                rlVar.J = ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(cameraPosition.target, cameraPosition.zoom);
                u1Var.v0(0, top + dp, null);
            }
        }
    }

    @Override // org.telegram.messenger.IMapsProvider.OnMarkerClickListener
    public boolean onClick(IMapsProvider.IMarker iMarker) {
        rl rlVar = this.b;
        ImageView imageView = rlVar.n;
        if (iMarker.getTag() instanceof ql) {
            rlVar.S.setVisibility(4);
            if (!rlVar.u0) {
                int i10 = org.telegram.ui.ActionBar.h6.ui;
                imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.w0(i10, rlVar.a), PorterDuff.Mode.MULTIPLY));
                imageView.setTag(Integer.valueOf(i10));
                rlVar.u0 = true;
            }
            ol olVar = rlVar.F;
            olVar.getClass();
            HashMap hashMap = olVar.a;
            ql qlVar = (ql) iMarker.getTag();
            rl rlVar2 = olVar.b;
            ql qlVar2 = rlVar2.h0;
            org.telegram.ui.ActionBar.d6 d6Var = rlVar2.a;
            if (qlVar2 != qlVar) {
                rlVar2.g0(false);
                IMapsProvider.IMarker iMarker2 = rlVar2.g0;
                if (iMarker2 != null) {
                    View view = (View) hashMap.get(iMarker2);
                    if (view != null) {
                        olVar.removeView(view);
                        hashMap.remove(iMarker2);
                    }
                    rlVar2.g0 = null;
                }
                rlVar2.h0 = qlVar;
                rlVar2.g0 = iMarker;
                Context context = olVar.getContext();
                FrameLayout frameLayout = new FrameLayout(context);
                olVar.addView(frameLayout, w7.z5.c(114.0f, -2));
                FrameLayout frameLayout2 = new FrameLayout(context);
                rlVar2.i0 = frameLayout2;
                frameLayout2.setBackgroundResource(R.drawable.venue_tooltip);
                rlVar2.i0.getBackground().setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.h5, d6Var), PorterDuff.Mode.MULTIPLY));
                frameLayout.addView(rlVar2.i0, w7.z5.c(71.0f, -2));
                rlVar2.i0.setAlpha(0.0f);
                rlVar2.i0.setOnClickListener(new ca(2, olVar, qlVar));
                TextView textView = new TextView(context);
                textView.setTextSize(1, 16.0f);
                textView.setMaxLines(1);
                TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                textView.setEllipsize(truncateAt);
                textView.setSingleLine(true);
                textView.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.G6, d6Var));
                textView.setTypeface(AndroidUtilities.bold());
                textView.setGravity(LocaleController.isRTL ? 5 : 3);
                TextView j10 = org.telegram.ui.Cells.c1.j(rlVar2.i0, textView, w7.z5.d(-2, -2.0f, (LocaleController.isRTL ? 5 : 3) | 48, 18.0f, 10.0f, 18.0f, 0.0f), context);
                j10.setTextSize(1, 14.0f);
                j10.setMaxLines(1);
                j10.setEllipsize(truncateAt);
                j10.setSingleLine(true);
                j10.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.A6, d6Var));
                j10.setGravity(LocaleController.isRTL ? 5 : 3);
                rlVar2.i0.addView(j10, w7.z5.d(-2, -2.0f, (LocaleController.isRTL ? 5 : 3) | 48, 18.0f, 32.0f, 18.0f, 0.0f));
                textView.setText(qlVar.c.title);
                j10.setText(LocaleController.getString(R.string.TapToSendLocation));
                FrameLayout frameLayout3 = new FrameLayout(context);
                frameLayout3.setBackground(org.telegram.ui.ActionBar.h6.K(AndroidUtilities.dp(36.0f), org.telegram.ui.Cells.t4.a(qlVar.a)));
                frameLayout.addView(frameLayout3, w7.z5.d(36, 36.0f, 81, 0.0f, 0.0f, 0.0f, 4.0f));
                w9 w9Var = new w9(context);
                w9Var.f(a1.g.s(new StringBuilder("https://ss3.4sqi.net/img/categories_v2/"), qlVar.c.venue_type, "_64.png"), null, null);
                frameLayout3.addView(w9Var, w7.z5.e(30, 30, 17));
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new nl(olVar, frameLayout3));
                ofFloat.setDuration(360L);
                ofFloat.start();
                hashMap.put(iMarker, frameLayout);
                rlVar2.H.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLng(iMarker.getPosition()), 300, null);
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
        rl rlVar = this.b;
        switch (i10) {
            case 2:
                if (rlVar.K != 0.0f) {
                    motionEvent = MotionEvent.obtain(motionEvent);
                    motionEvent.offsetLocation(0.0f, (-rlVar.K) / 2.0f);
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
                ImageView imageView = rlVar.n;
                Property property = View.TRANSLATION_Y;
                ImageView imageView2 = rlVar.S;
                if (motionEvent.getAction() == 0) {
                    AnimatorSet animatorSet = rlVar.f0;
                    if (animatorSet != null) {
                        animatorSet.cancel();
                    }
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    rlVar.f0 = animatorSet2;
                    animatorSet2.setDuration(200L);
                    rlVar.f0.playTogether(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property, rlVar.s0 - AndroidUtilities.dp(10.0f)));
                    rlVar.f0.start();
                } else if (motionEvent.getAction() == 1) {
                    AnimatorSet animatorSet3 = rlVar.f0;
                    if (animatorSet3 != null) {
                        animatorSet3.cancel();
                    }
                    rlVar.K = 0.0f;
                    AnimatorSet animatorSet4 = new AnimatorSet();
                    rlVar.f0 = animatorSet4;
                    animatorSet4.setDuration(200L);
                    rlVar.f0.playTogether(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property, rlVar.s0));
                    rlVar.f0.start();
                }
                if (motionEvent.getAction() == 2) {
                    if (!rlVar.u0) {
                        int i11 = org.telegram.ui.ActionBar.h6.ui;
                        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.w0(i11, rlVar.a), PorterDuff.Mode.MULTIPLY));
                        imageView.setTag(Integer.valueOf(i11));
                        rlVar.u0 = true;
                    }
                    IMapsProvider.IMap iMap = rlVar.H;
                    if (iMap != null && (location = rlVar.r0) != null) {
                        location.setLatitude(iMap.getCameraPosition().target.latitude);
                        rlVar.r0.setLongitude(rlVar.H.getCameraPosition().target.longitude);
                    }
                    rlVar.O.L(rlVar.r0);
                }
                return ((Boolean) iCallableMethod.call(motionEvent)).booleanValue();
        }
    }
}
