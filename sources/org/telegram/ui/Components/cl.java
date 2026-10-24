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

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final /* synthetic */ class cl implements org.telegram.ui.ActionBar.q0, hg.b, IMapsProvider.ITouchInterceptor, IMapsProvider.OnCameraMoveStartedListener, IMapsProvider.OnMarkerClickListener, org.telegram.ui.ActionBar.z1 {
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
                ArrayList arrayList2 = rlVar.c0;
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
                            position.icon(rlVar.Z(i11));
                            position.anchor(0.5f, 0.5f);
                            position.title(tL_messageMediaVenue.title);
                            position.snippet(tL_messageMediaVenue.address);
                            ql qlVar = new ql();
                            qlVar.a = i11;
                            IMapsProvider.IMarker addMarker = rlVar.F.addMarker(position);
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
                rlVar2.l0 = false;
                rlVar2.j0();
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.z1
    public void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        rl.W(this.b);
    }

    @Override // org.telegram.ui.ActionBar.q0
    public void h(int i10) {
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

    @Override // org.telegram.messenger.IMapsProvider.OnCameraMoveStartedListener
    public void onCameraMoveStarted(int i10) {
        View childAt;
        rl rlVar = this.b;
        ai.u1 u1Var = rlVar.N;
        if (i10 == 1) {
            rlVar.h0(true);
            if (rlVar.e0 != null) {
                rlVar.Q.setVisibility(0);
                ol olVar = rlVar.y;
                IMapsProvider.IMarker iMarker = rlVar.e0;
                HashMap hashMap = olVar.a;
                View view = (View) hashMap.get(iMarker);
                if (view != null) {
                    olVar.removeView(view);
                    hashMap.remove(iMarker);
                }
                rlVar.e0 = null;
                rlVar.f0 = null;
                rlVar.g0 = null;
            }
            if (rlVar.J || u1Var.getChildCount() <= 0 || (childAt = u1Var.getChildAt(0)) == null) {
                return;
            }
            View F = u1Var.F(childAt);
            s4.b1 T = F == null ? null : u1Var.T(F);
            if (T == null || T.b() != 0) {
                return;
            }
            int dp = rlVar.w0 == 0 ? 0 : AndroidUtilities.dp(66.0f);
            int top = childAt.getTop();
            if (top < (-dp)) {
                IMapsProvider.CameraPosition cameraPosition = rlVar.F.getCameraPosition();
                rlVar.H = ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(cameraPosition.target, cameraPosition.zoom);
                u1Var.v0(0, top + dp, null);
            }
        }
    }

    @Override // org.telegram.messenger.IMapsProvider.OnMarkerClickListener
    public boolean onClick(IMapsProvider.IMarker iMarker) {
        rl rlVar = this.b;
        ImageView imageView = rlVar.n;
        if (iMarker.getTag() instanceof ql) {
            rlVar.Q.setVisibility(4);
            if (!rlVar.s0) {
                int i10 = org.telegram.ui.ActionBar.k6.ui;
                org.telegram.ui.ActionBar.r6.t(imageView, i10, rlVar.a, PorterDuff.Mode.MULTIPLY);
                imageView.setTag(Integer.valueOf(i10));
                rlVar.s0 = true;
            }
            ol olVar = rlVar.y;
            olVar.getClass();
            HashMap hashMap = olVar.a;
            ql qlVar = (ql) iMarker.getTag();
            rl rlVar2 = olVar.b;
            ql qlVar2 = rlVar2.f0;
            org.telegram.ui.ActionBar.g6 g6Var = rlVar2.a;
            if (qlVar2 != qlVar) {
                rlVar2.h0(false);
                IMapsProvider.IMarker iMarker2 = rlVar2.e0;
                if (iMarker2 != null) {
                    View view = (View) hashMap.get(iMarker2);
                    if (view != null) {
                        olVar.removeView(view);
                        hashMap.remove(iMarker2);
                    }
                    rlVar2.e0 = null;
                }
                rlVar2.f0 = qlVar;
                rlVar2.e0 = iMarker;
                Context context = olVar.getContext();
                FrameLayout frameLayout = new FrameLayout(context);
                olVar.addView(frameLayout, w7.z5.c(114.0f, -2));
                FrameLayout frameLayout2 = new FrameLayout(context);
                rlVar2.g0 = frameLayout2;
                frameLayout2.setBackgroundResource(R.drawable.venue_tooltip);
                FrameLayout frameLayout3 = rlVar2.g0;
                org.telegram.ui.ActionBar.r6.z(frameLayout3, frameLayout3.getBackground(), org.telegram.ui.ActionBar.k6.h5, g6Var, PorterDuff.Mode.MULTIPLY);
                frameLayout.addView(rlVar2.g0, w7.z5.c(71.0f, -2));
                rlVar2.g0.setAlpha(0.0f);
                rlVar2.g0.setOnClickListener(new ca(3, olVar, qlVar));
                TextView textView = new TextView(context);
                textView.setTextSize(1, 16.0f);
                textView.setMaxLines(1);
                TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                textView.setEllipsize(truncateAt);
                textView.setSingleLine(true);
                org.telegram.ui.ActionBar.r6.W(textView, org.telegram.ui.ActionBar.k6.G6, g6Var);
                textView.setTypeface(AndroidUtilities.bold());
                textView.setGravity(LocaleController.isRTL ? 5 : 3);
                TextView j10 = org.telegram.ui.Cells.b1.j(rlVar2.g0, textView, w7.z5.d(-2, -2.0f, (LocaleController.isRTL ? 5 : 3) | 48, 18.0f, 10.0f, 18.0f, 0.0f), context);
                j10.setTextSize(1, 14.0f);
                j10.setMaxLines(1);
                j10.setEllipsize(truncateAt);
                j10.setSingleLine(true);
                org.telegram.ui.ActionBar.r6.W(j10, org.telegram.ui.ActionBar.k6.A6, g6Var);
                j10.setGravity(LocaleController.isRTL ? 5 : 3);
                rlVar2.g0.addView(j10, w7.z5.d(-2, -2.0f, (LocaleController.isRTL ? 5 : 3) | 48, 18.0f, 32.0f, 18.0f, 0.0f));
                textView.setText(qlVar.c.title);
                j10.setText(LocaleController.getString(R.string.TapToSendLocation));
                FrameLayout frameLayout4 = new FrameLayout(context);
                frameLayout4.setBackground(org.telegram.ui.ActionBar.k6.K(AndroidUtilities.dp(36.0f), org.telegram.ui.Cells.t4.a(qlVar.a)));
                frameLayout.addView(frameLayout4, w7.z5.d(36, 36.0f, 81, 0.0f, 0.0f, 0.0f, 4.0f));
                w9 w9Var = new w9(context);
                w9Var.g(a1.g.s(new StringBuilder("https://ss3.4sqi.net/img/categories_v2/"), qlVar.c.venue_type, "_64.png"), null, null);
                frameLayout4.addView(w9Var, w7.z5.e(30, 30, 17));
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new nl(olVar, frameLayout4));
                ofFloat.setDuration(360L);
                ofFloat.start();
                hashMap.put(iMarker, frameLayout);
                rlVar2.F.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLng(iMarker.getPosition()), 300, null);
                return true;
            }
        }
        return true;
    }

    @Override // org.telegram.messenger.IMapsProvider.ITouchInterceptor
    public boolean onInterceptTouchEvent(MotionEvent motionEvent, IMapsProvider.ICallableMethod iCallableMethod) {
        MotionEvent motionEvent2;
        rl rlVar = this.b;
        if (rlVar.I != 0.0f) {
            motionEvent = MotionEvent.obtain(motionEvent);
            motionEvent.offsetLocation(0.0f, (-rlVar.I) / 2.0f);
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
