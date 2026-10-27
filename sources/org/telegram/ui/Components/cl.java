package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.text.TextUtils;
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

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class cl implements org.telegram.ui.ActionBar.r0, ig.b, IMapsProvider.ITouchInterceptor, IMapsProvider.OnCameraMoveStartedListener, IMapsProvider.OnMarkerClickListener, org.telegram.ui.ActionBar.b2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ sl b;

    public /* synthetic */ cl(sl slVar, int i10) {
        this.a = i10;
        this.b = slVar;
    }

    @Override // ig.b
    public void a(ArrayList arrayList) {
        switch (this.a) {
            case 1:
                sl slVar = this.b;
                ArrayList arrayList2 = slVar.c0;
                if (arrayList != null) {
                    int size = arrayList2.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        ((rl) arrayList2.get(i10)).b.remove();
                    }
                    arrayList2.clear();
                    int size2 = arrayList.size();
                    for (int i11 = 0; i11 < size2; i11++) {
                        TLRPC.TL_messageMediaVenue tL_messageMediaVenue = (TLRPC.TL_messageMediaVenue) arrayList.get(i11);
                        try {
                            IMapsProvider.IMarkerOptions onCreateMarkerOptions = ApplicationLoader.getMapsProvider().onCreateMarkerOptions();
                            TLRPC.GeoPoint geoPoint = tL_messageMediaVenue.geo;
                            IMapsProvider.IMarkerOptions position = onCreateMarkerOptions.position(new IMapsProvider.LatLng(geoPoint.lat, geoPoint._long));
                            position.icon(slVar.Z(i11));
                            position.anchor(0.5f, 0.5f);
                            position.title(tL_messageMediaVenue.title);
                            position.snippet(tL_messageMediaVenue.address);
                            rl rlVar = new rl();
                            rlVar.a = i11;
                            IMapsProvider.IMarker addMarker = slVar.F.addMarker(position);
                            rlVar.b = addMarker;
                            rlVar.c = tL_messageMediaVenue;
                            addMarker.setTag(rlVar);
                            arrayList2.add(rlVar);
                        } catch (Exception e) {
                            FileLog.e(e);
                        }
                    }
                    break;
                }
                break;
            default:
                sl slVar2 = this.b;
                slVar2.k0 = false;
                slVar2.i0();
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.r0
    public void g(int i10) {
        IMapsProvider.IMap iMap = this.b.F;
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

    @Override // org.telegram.ui.ActionBar.b2
    public void h(org.telegram.ui.ActionBar.e2 e2Var, int i10) {
        sl.W(this.b);
    }

    @Override // org.telegram.messenger.IMapsProvider.OnCameraMoveStartedListener
    public void onCameraMoveStarted(int i10) {
        View childAt;
        sl slVar = this.b;
        bi.r1 r1Var = slVar.N;
        if (i10 == 1) {
            slVar.g0(true);
            if (slVar.e0 != null) {
                slVar.Q.setVisibility(0);
                pl plVar = slVar.y;
                IMapsProvider.IMarker iMarker = slVar.e0;
                HashMap hashMap = plVar.a;
                View view = (View) hashMap.get(iMarker);
                if (view != null) {
                    plVar.removeView(view);
                    hashMap.remove(iMarker);
                }
                slVar.e0 = null;
                slVar.f0 = null;
                slVar.g0 = null;
            }
            if (slVar.J || r1Var.getChildCount() <= 0 || (childAt = r1Var.getChildAt(0)) == null) {
                return;
            }
            View F = r1Var.F(childAt);
            s4.e1 T = F == null ? null : r1Var.T(F);
            if (T == null || T.b() != 0) {
                return;
            }
            int dp = slVar.v0 == 0 ? 0 : AndroidUtilities.dp(66.0f);
            int top = childAt.getTop();
            if (top < (-dp)) {
                IMapsProvider.CameraPosition cameraPosition = slVar.F.getCameraPosition();
                slVar.H = ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(cameraPosition.target, cameraPosition.zoom);
                r1Var.w0(0, top + dp, null);
            }
        }
    }

    @Override // org.telegram.messenger.IMapsProvider.OnMarkerClickListener
    public boolean onClick(IMapsProvider.IMarker iMarker) {
        sl slVar = this.b;
        ImageView imageView = slVar.n;
        if (iMarker.getTag() instanceof rl) {
            int i10 = 4;
            slVar.Q.setVisibility(4);
            if (!slVar.r0) {
                int i11 = org.telegram.ui.ActionBar.y6.ui;
                org.telegram.ui.ActionBar.f7.t(imageView, i11, slVar.a, PorterDuff.Mode.MULTIPLY);
                imageView.setTag(Integer.valueOf(i11));
                slVar.r0 = true;
            }
            pl plVar = slVar.y;
            plVar.getClass();
            HashMap hashMap = plVar.a;
            rl rlVar = (rl) iMarker.getTag();
            sl slVar2 = plVar.b;
            rl rlVar2 = slVar2.f0;
            org.telegram.ui.ActionBar.u6 u6Var = slVar2.a;
            if (rlVar2 != rlVar) {
                slVar2.g0(false);
                IMapsProvider.IMarker iMarker2 = slVar2.e0;
                if (iMarker2 != null) {
                    View view = (View) hashMap.get(iMarker2);
                    if (view != null) {
                        plVar.removeView(view);
                        hashMap.remove(iMarker2);
                    }
                    slVar2.e0 = null;
                }
                slVar2.f0 = rlVar;
                slVar2.e0 = iMarker;
                Context context = plVar.getContext();
                FrameLayout frameLayout = new FrameLayout(context);
                plVar.addView(frameLayout, kb1.g(114.0f, -2));
                FrameLayout frameLayout2 = new FrameLayout(context);
                slVar2.g0 = frameLayout2;
                frameLayout2.setBackgroundResource(R.drawable.venue_tooltip);
                FrameLayout frameLayout3 = slVar2.g0;
                org.telegram.ui.ActionBar.f7.y(frameLayout3, frameLayout3.getBackground(), org.telegram.ui.ActionBar.y6.h5, u6Var, PorterDuff.Mode.MULTIPLY);
                frameLayout.addView(slVar2.g0, kb1.g(71.0f, -2));
                slVar2.g0.setAlpha(0.0f);
                slVar2.g0.setOnClickListener(new ga(i10, plVar, rlVar));
                TextView textView = new TextView(context);
                textView.setTextSize(1, 16.0f);
                textView.setMaxLines(1);
                TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                textView.setEllipsize(truncateAt);
                textView.setSingleLine(true);
                org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.G6, u6Var);
                textView.setTypeface(AndroidUtilities.bold());
                textView.setGravity(LocaleController.isRTL ? 5 : 3);
                TextView k10 = org.telegram.ui.d3.k(slVar2.g0, textView, kb1.h(-2, -2.0f, (LocaleController.isRTL ? 5 : 3) | 48, 18.0f, 10.0f, 18.0f, 0.0f), context);
                k10.setTextSize(1, 14.0f);
                k10.setMaxLines(1);
                k10.setEllipsize(truncateAt);
                k10.setSingleLine(true);
                org.telegram.ui.ActionBar.f7.V(k10, org.telegram.ui.ActionBar.y6.A6, u6Var);
                k10.setGravity(LocaleController.isRTL ? 5 : 3);
                slVar2.g0.addView(k10, kb1.h(-2, -2.0f, (LocaleController.isRTL ? 5 : 3) | 48, 18.0f, 32.0f, 18.0f, 0.0f));
                textView.setText(rlVar.c.title);
                k10.setText(LocaleController.getString(R.string.TapToSendLocation));
                FrameLayout frameLayout4 = new FrameLayout(context);
                frameLayout4.setBackground(org.telegram.ui.ActionBar.y6.K(AndroidUtilities.dp(36.0f), org.telegram.ui.Cells.y4.a(rlVar.a)));
                frameLayout.addView(frameLayout4, kb1.h(36, 36.0f, 81, 0.0f, 0.0f, 0.0f, 4.0f));
                y9 y9Var = new y9(context);
                y9Var.g(a1.g.s(new StringBuilder("https://ss3.4sqi.net/img/categories_v2/"), rlVar.c.venue_type, "_64.png"), null, null);
                frameLayout4.addView(y9Var, kb1.i(30, 30, 17));
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new ol(plVar, frameLayout4));
                ofFloat.setDuration(360L);
                ofFloat.start();
                hashMap.put(iMarker, frameLayout);
                slVar2.F.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLng(iMarker.getPosition()), 300, null);
                return true;
            }
        }
        return true;
    }

    @Override // org.telegram.messenger.IMapsProvider.ITouchInterceptor
    public boolean onInterceptTouchEvent(MotionEvent motionEvent, IMapsProvider.ICallableMethod iCallableMethod) {
        MotionEvent motionEvent2;
        sl slVar = this.b;
        if (slVar.I != 0.0f) {
            motionEvent = MotionEvent.obtain(motionEvent);
            motionEvent.offsetLocation(0.0f, (-slVar.I) / 2.0f);
            motionEvent2 = motionEvent;
        } else {
            motionEvent2 = null;
        }
        boolean booleanValue = ((Boolean) iCallableMethod.call(motionEvent)).booleanValue();
        if (motionEvent2 != null) {
            motionEvent2.recycle();
        }
        return booleanValue;
    }
}
