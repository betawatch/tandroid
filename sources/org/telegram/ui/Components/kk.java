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

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class kk implements org.telegram.ui.ActionBar.s0, tf.b, IMapsProvider.ITouchInterceptor, IMapsProvider.OnCameraMoveStartedListener, IMapsProvider.OnMarkerClickListener, org.telegram.ui.ActionBar.c2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ al b;

    public /* synthetic */ kk(al alVar, int i10) {
        this.a = i10;
        this.b = alVar;
    }

    @Override // tf.b
    public void a(ArrayList arrayList) {
        switch (this.a) {
            case 1:
                al alVar = this.b;
                ArrayList arrayList2 = alVar.b0;
                if (arrayList != null) {
                    int size = arrayList2.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        ((zk) arrayList2.get(i10)).b.remove();
                    }
                    arrayList2.clear();
                    int size2 = arrayList.size();
                    for (int i11 = 0; i11 < size2; i11++) {
                        TLRPC.TL_messageMediaVenue tL_messageMediaVenue = (TLRPC.TL_messageMediaVenue) arrayList.get(i11);
                        try {
                            IMapsProvider.IMarkerOptions onCreateMarkerOptions = ApplicationLoader.getMapsProvider().onCreateMarkerOptions();
                            TLRPC.GeoPoint geoPoint = tL_messageMediaVenue.geo;
                            IMapsProvider.IMarkerOptions position = onCreateMarkerOptions.position(new IMapsProvider.LatLng(geoPoint.lat, geoPoint._long));
                            position.icon(alVar.V(i11));
                            position.anchor(0.5f, 0.5f);
                            position.title(tL_messageMediaVenue.title);
                            position.snippet(tL_messageMediaVenue.address);
                            zk zkVar = new zk();
                            zkVar.a = i11;
                            IMapsProvider.IMarker addMarker = alVar.E.addMarker(position);
                            zkVar.b = addMarker;
                            zkVar.c = tL_messageMediaVenue;
                            addMarker.setTag(zkVar);
                            arrayList2.add(zkVar);
                        } catch (Exception e) {
                            FileLog.e(e);
                        }
                    }
                    break;
                }
                break;
            default:
                al alVar2 = this.b;
                alVar2.k0 = false;
                alVar2.f0();
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.c2
    public void l(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        al.T(this.b);
    }

    @Override // org.telegram.ui.ActionBar.s0
    public void m(int i10) {
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

    @Override // org.telegram.messenger.IMapsProvider.OnCameraMoveStartedListener
    public void onCameraMoveStarted(int i10) {
        View childAt;
        al alVar = this.b;
        lh.e1 e1Var = alVar.M;
        if (i10 == 1) {
            alVar.d0(true);
            if (alVar.d0 != null) {
                alVar.P.setVisibility(0);
                xk xkVar = alVar.C;
                IMapsProvider.IMarker iMarker = alVar.d0;
                HashMap hashMap = xkVar.a;
                View view = (View) hashMap.get(iMarker);
                if (view != null) {
                    xkVar.removeView(view);
                    hashMap.remove(iMarker);
                }
                alVar.d0 = null;
                alVar.e0 = null;
                alVar.f0 = null;
            }
            if (alVar.I || e1Var.getChildCount() <= 0 || (childAt = e1Var.getChildAt(0)) == null) {
                return;
            }
            View F = e1Var.F(childAt);
            f2.l1 T = F == null ? null : e1Var.T(F);
            if (T == null || T.b() != 0) {
                return;
            }
            int dp = alVar.v0 == 0 ? 0 : AndroidUtilities.dp(66.0f);
            int top = childAt.getTop();
            if (top < (-dp)) {
                IMapsProvider.CameraPosition cameraPosition = alVar.E.getCameraPosition();
                alVar.G = ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(cameraPosition.target, cameraPosition.zoom);
                e1Var.v0(0, top + dp, null);
            }
        }
    }

    @Override // org.telegram.messenger.IMapsProvider.OnMarkerClickListener
    public boolean onClick(IMapsProvider.IMarker iMarker) {
        al alVar = this.b;
        ImageView imageView = alVar.n;
        if (iMarker.getTag() instanceof zk) {
            alVar.P.setVisibility(4);
            if (!alVar.r0) {
                int i10 = org.telegram.ui.ActionBar.j6.ui;
                imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(i10, alVar.a), PorterDuff.Mode.MULTIPLY));
                imageView.setTag(Integer.valueOf(i10));
                alVar.r0 = true;
            }
            xk xkVar = alVar.C;
            xkVar.getClass();
            HashMap hashMap = xkVar.a;
            zk zkVar = (zk) iMarker.getTag();
            al alVar2 = xkVar.b;
            zk zkVar2 = alVar2.e0;
            org.telegram.ui.ActionBar.f6 f6Var = alVar2.a;
            if (zkVar2 != zkVar) {
                alVar2.d0(false);
                IMapsProvider.IMarker iMarker2 = alVar2.d0;
                if (iMarker2 != null) {
                    View view = (View) hashMap.get(iMarker2);
                    if (view != null) {
                        xkVar.removeView(view);
                        hashMap.remove(iMarker2);
                    }
                    alVar2.d0 = null;
                }
                alVar2.e0 = zkVar;
                alVar2.d0 = iMarker;
                Context context = xkVar.getContext();
                FrameLayout frameLayout = new FrameLayout(context);
                xkVar.addView(frameLayout, k7.b6.c(114.0f, -2));
                FrameLayout frameLayout2 = new FrameLayout(context);
                alVar2.f0 = frameLayout2;
                frameLayout2.setBackgroundResource(R.drawable.venue_tooltip);
                alVar2.f0.getBackground().setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.h5, f6Var), PorterDuff.Mode.MULTIPLY));
                frameLayout.addView(alVar2.f0, k7.b6.c(71.0f, -2));
                alVar2.f0.setAlpha(0.0f);
                alVar2.f0.setOnClickListener(new w2(7, xkVar, zkVar));
                TextView textView = new TextView(context);
                textView.setTextSize(1, 16.0f);
                textView.setMaxLines(1);
                TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                textView.setEllipsize(truncateAt);
                textView.setSingleLine(true);
                textView.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.G6, f6Var));
                textView.setTypeface(AndroidUtilities.bold());
                textView.setGravity(LocaleController.isRTL ? 5 : 3);
                TextView h = org.telegram.ui.ai.h(alVar2.f0, textView, k7.b6.d(-2, -2.0f, (LocaleController.isRTL ? 5 : 3) | 48, 18.0f, 10.0f, 18.0f, 0.0f), context);
                h.setTextSize(1, 14.0f);
                h.setMaxLines(1);
                h.setEllipsize(truncateAt);
                h.setSingleLine(true);
                h.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.A6, f6Var));
                h.setGravity(LocaleController.isRTL ? 5 : 3);
                alVar2.f0.addView(h, k7.b6.d(-2, -2.0f, (LocaleController.isRTL ? 5 : 3) | 48, 18.0f, 32.0f, 18.0f, 0.0f));
                textView.setText(zkVar.c.title);
                h.setText(LocaleController.getString(R.string.TapToSendLocation));
                FrameLayout frameLayout3 = new FrameLayout(context);
                frameLayout3.setBackground(org.telegram.ui.ActionBar.j6.K(AndroidUtilities.dp(36.0f), org.telegram.ui.Cells.t4.a(zkVar.a)));
                frameLayout.addView(frameLayout3, k7.b6.d(36, 36.0f, 81, 0.0f, 0.0f, 0.0f, 4.0f));
                p9 p9Var = new p9(context);
                p9Var.f(android.support.v4.media.a.r(new StringBuilder("https://ss3.4sqi.net/img/categories_v2/"), zkVar.c.venue_type, "_64.png"), null, null);
                frameLayout3.addView(p9Var, k7.b6.e(30, 30, 17));
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new wk(xkVar, frameLayout3));
                ofFloat.setDuration(360L);
                ofFloat.start();
                hashMap.put(iMarker, frameLayout);
                alVar2.E.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLng(iMarker.getPosition()), 300, null);
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
        al alVar = this.b;
        switch (i10) {
            case 2:
                if (alVar.H != 0.0f) {
                    motionEvent = MotionEvent.obtain(motionEvent);
                    motionEvent.offsetLocation(0.0f, (-alVar.H) / 2.0f);
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
                ImageView imageView = alVar.n;
                Property property = View.TRANSLATION_Y;
                ImageView imageView2 = alVar.P;
                if (motionEvent.getAction() == 0) {
                    AnimatorSet animatorSet = alVar.c0;
                    if (animatorSet != null) {
                        animatorSet.cancel();
                    }
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    alVar.c0 = animatorSet2;
                    animatorSet2.setDuration(200L);
                    alVar.c0.playTogether(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property, alVar.p0 - AndroidUtilities.dp(10.0f)));
                    alVar.c0.start();
                } else if (motionEvent.getAction() == 1) {
                    AnimatorSet animatorSet3 = alVar.c0;
                    if (animatorSet3 != null) {
                        animatorSet3.cancel();
                    }
                    alVar.H = 0.0f;
                    AnimatorSet animatorSet4 = new AnimatorSet();
                    alVar.c0 = animatorSet4;
                    animatorSet4.setDuration(200L);
                    alVar.c0.playTogether(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property, alVar.p0));
                    alVar.c0.start();
                }
                if (motionEvent.getAction() == 2) {
                    if (!alVar.r0) {
                        int i11 = org.telegram.ui.ActionBar.j6.ui;
                        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(i11, alVar.a), PorterDuff.Mode.MULTIPLY));
                        imageView.setTag(Integer.valueOf(i11));
                        alVar.r0 = true;
                    }
                    IMapsProvider.IMap iMap = alVar.E;
                    if (iMap != null && (location = alVar.o0) != null) {
                        location.setLatitude(iMap.getCameraPosition().target.latitude);
                        alVar.o0.setLongitude(alVar.E.getCameraPosition().target.longitude);
                    }
                    alVar.L.L(alVar.o0);
                }
                return ((Boolean) iCallableMethod.call(motionEvent)).booleanValue();
        }
    }
}
