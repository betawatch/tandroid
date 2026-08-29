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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class mk implements org.telegram.ui.ActionBar.s0, rf.b, IMapsProvider.ITouchInterceptor, IMapsProvider.OnCameraMoveStartedListener, IMapsProvider.OnMarkerClickListener, org.telegram.ui.ActionBar.b2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ bl b;

    public /* synthetic */ mk(bl blVar, int i10) {
        this.a = i10;
        this.b = blVar;
    }

    @Override // rf.b
    public void a(ArrayList arrayList) {
        switch (this.a) {
            case 1:
                bl blVar = this.b;
                ArrayList arrayList2 = blVar.a0;
                if (arrayList != null) {
                    int size = arrayList2.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        ((al) arrayList2.get(i10)).b.remove();
                    }
                    arrayList2.clear();
                    int size2 = arrayList.size();
                    for (int i11 = 0; i11 < size2; i11++) {
                        TLRPC.TL_messageMediaVenue tL_messageMediaVenue = (TLRPC.TL_messageMediaVenue) arrayList.get(i11);
                        try {
                            IMapsProvider.IMarkerOptions onCreateMarkerOptions = ApplicationLoader.getMapsProvider().onCreateMarkerOptions();
                            TLRPC.GeoPoint geoPoint = tL_messageMediaVenue.geo;
                            IMapsProvider.IMarkerOptions position = onCreateMarkerOptions.position(new IMapsProvider.LatLng(geoPoint.lat, geoPoint._long));
                            position.icon(blVar.V(i11));
                            position.anchor(0.5f, 0.5f);
                            position.title(tL_messageMediaVenue.title);
                            position.snippet(tL_messageMediaVenue.address);
                            al alVar = new al();
                            alVar.a = i11;
                            IMapsProvider.IMarker addMarker = blVar.D.addMarker(position);
                            alVar.b = addMarker;
                            alVar.c = tL_messageMediaVenue;
                            addMarker.setTag(alVar);
                            arrayList2.add(alVar);
                        } catch (Exception e10) {
                            FileLog.e(e10);
                        }
                    }
                    break;
                }
                break;
            default:
                bl blVar2 = this.b;
                blVar2.j0 = false;
                blVar2.f0();
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.b2
    public void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        bl.T(this.b);
    }

    @Override // org.telegram.ui.ActionBar.s0
    public void i(int i10) {
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
        bl blVar = this.b;
        jh.e1 e1Var = blVar.L;
        if (i10 == 1) {
            blVar.d0(true);
            if (blVar.c0 != null) {
                blVar.O.setVisibility(0);
                yk ykVar = blVar.B;
                IMapsProvider.IMarker iMarker = blVar.c0;
                HashMap hashMap = ykVar.a;
                View view = (View) hashMap.get(iMarker);
                if (view != null) {
                    ykVar.removeView(view);
                    hashMap.remove(iMarker);
                }
                blVar.c0 = null;
                blVar.d0 = null;
                blVar.e0 = null;
            }
            if (blVar.H || e1Var.getChildCount() <= 0 || (childAt = e1Var.getChildAt(0)) == null) {
                return;
            }
            View F = e1Var.F(childAt);
            f2.n1 T = F == null ? null : e1Var.T(F);
            if (T == null || T.b() != 0) {
                return;
            }
            int dp = blVar.u0 == 0 ? 0 : AndroidUtilities.dp(66.0f);
            int top = childAt.getTop();
            if (top < (-dp)) {
                IMapsProvider.CameraPosition cameraPosition = blVar.D.getCameraPosition();
                blVar.F = ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(cameraPosition.target, cameraPosition.zoom);
                e1Var.v0(0, top + dp, null);
            }
        }
    }

    @Override // org.telegram.messenger.IMapsProvider.OnMarkerClickListener
    public boolean onClick(IMapsProvider.IMarker iMarker) {
        bl blVar = this.b;
        ImageView imageView = blVar.n;
        if (iMarker.getTag() instanceof al) {
            blVar.O.setVisibility(4);
            if (!blVar.q0) {
                int i10 = org.telegram.ui.ActionBar.g6.ui;
                imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(i10, blVar.a), PorterDuff.Mode.MULTIPLY));
                imageView.setTag(Integer.valueOf(i10));
                blVar.q0 = true;
            }
            yk ykVar = blVar.B;
            ykVar.getClass();
            HashMap hashMap = ykVar.a;
            al alVar = (al) iMarker.getTag();
            bl blVar2 = ykVar.b;
            al alVar2 = blVar2.d0;
            org.telegram.ui.ActionBar.c6 c6Var = blVar2.a;
            if (alVar2 != alVar) {
                blVar2.d0(false);
                IMapsProvider.IMarker iMarker2 = blVar2.c0;
                if (iMarker2 != null) {
                    View view = (View) hashMap.get(iMarker2);
                    if (view != null) {
                        ykVar.removeView(view);
                        hashMap.remove(iMarker2);
                    }
                    blVar2.c0 = null;
                }
                blVar2.d0 = alVar;
                blVar2.c0 = iMarker;
                Context context = ykVar.getContext();
                FrameLayout frameLayout = new FrameLayout(context);
                ykVar.addView(frameLayout, i7.f6.c(114.0f, -2));
                FrameLayout frameLayout2 = new FrameLayout(context);
                blVar2.e0 = frameLayout2;
                frameLayout2.setBackgroundResource(R.drawable.venue_tooltip);
                blVar2.e0.getBackground().setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.h5, c6Var), PorterDuff.Mode.MULTIPLY));
                frameLayout.addView(blVar2.e0, i7.f6.c(71.0f, -2));
                blVar2.e0.setAlpha(0.0f);
                blVar2.e0.setOnClickListener(new t2(10, ykVar, alVar));
                TextView textView = new TextView(context);
                textView.setTextSize(1, 16.0f);
                textView.setMaxLines(1);
                TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                textView.setEllipsize(truncateAt);
                textView.setSingleLine(true);
                textView.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.G6, c6Var));
                textView.setTypeface(AndroidUtilities.bold());
                textView.setGravity(LocaleController.isRTL ? 5 : 3);
                TextView h = org.telegram.ui.th.h(blVar2.e0, textView, i7.f6.d(-2, -2.0f, (LocaleController.isRTL ? 5 : 3) | 48, 18.0f, 10.0f, 18.0f, 0.0f), context);
                h.setTextSize(1, 14.0f);
                h.setMaxLines(1);
                h.setEllipsize(truncateAt);
                h.setSingleLine(true);
                h.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.A6, c6Var));
                h.setGravity(LocaleController.isRTL ? 5 : 3);
                blVar2.e0.addView(h, i7.f6.d(-2, -2.0f, (LocaleController.isRTL ? 5 : 3) | 48, 18.0f, 32.0f, 18.0f, 0.0f));
                textView.setText(alVar.c.title);
                h.setText(LocaleController.getString(R.string.TapToSendLocation));
                FrameLayout frameLayout3 = new FrameLayout(context);
                frameLayout3.setBackground(org.telegram.ui.ActionBar.g6.K(AndroidUtilities.dp(36.0f), org.telegram.ui.Cells.s4.a(alVar.a)));
                frameLayout.addView(frameLayout3, i7.f6.d(36, 36.0f, 81, 0.0f, 0.0f, 0.0f, 4.0f));
                t9 t9Var = new t9(context);
                t9Var.f(a4.w.q(new StringBuilder("https://ss3.4sqi.net/img/categories_v2/"), alVar.c.venue_type, "_64.png"), null, null);
                frameLayout3.addView(t9Var, i7.f6.e(30, 30, 17));
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new xk(ykVar, frameLayout3));
                ofFloat.setDuration(360L);
                ofFloat.start();
                hashMap.put(iMarker, frameLayout);
                blVar2.D.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLng(iMarker.getPosition()), 300, null);
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
        bl blVar = this.b;
        switch (i10) {
            case 2:
                if (blVar.G != 0.0f) {
                    motionEvent = MotionEvent.obtain(motionEvent);
                    motionEvent.offsetLocation(0.0f, (-blVar.G) / 2.0f);
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
                ImageView imageView = blVar.n;
                Property property = View.TRANSLATION_Y;
                ImageView imageView2 = blVar.O;
                if (motionEvent.getAction() == 0) {
                    AnimatorSet animatorSet = blVar.b0;
                    if (animatorSet != null) {
                        animatorSet.cancel();
                    }
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    blVar.b0 = animatorSet2;
                    animatorSet2.setDuration(200L);
                    blVar.b0.playTogether(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property, blVar.o0 - AndroidUtilities.dp(10.0f)));
                    blVar.b0.start();
                } else if (motionEvent.getAction() == 1) {
                    AnimatorSet animatorSet3 = blVar.b0;
                    if (animatorSet3 != null) {
                        animatorSet3.cancel();
                    }
                    blVar.G = 0.0f;
                    AnimatorSet animatorSet4 = new AnimatorSet();
                    blVar.b0 = animatorSet4;
                    animatorSet4.setDuration(200L);
                    blVar.b0.playTogether(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property, blVar.o0));
                    blVar.b0.start();
                }
                if (motionEvent.getAction() == 2) {
                    if (!blVar.q0) {
                        int i11 = org.telegram.ui.ActionBar.g6.ui;
                        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(i11, blVar.a), PorterDuff.Mode.MULTIPLY));
                        imageView.setTag(Integer.valueOf(i11));
                        blVar.q0 = true;
                    }
                    IMapsProvider.IMap iMap = blVar.D;
                    if (iMap != null && (location = blVar.n0) != null) {
                        location.setLatitude(iMap.getCameraPosition().target.latitude);
                        blVar.n0.setLongitude(blVar.D.getCameraPosition().target.longitude);
                    }
                    blVar.K.L(blVar.n0);
                }
                return ((Boolean) iCallableMethod.call(motionEvent)).booleanValue();
        }
    }
}
