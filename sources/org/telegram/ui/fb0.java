package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Intent;
import android.graphics.PorterDuff;
import android.location.Location;
import android.net.Uri;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import com.google.android.gms.maps.model.LatLng;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class fb0 implements zf.b, org.telegram.ui.ActionBar.u1, org.telegram.messenger.db, org.telegram.messenger.bb {
    public final /* synthetic */ int a;
    public final /* synthetic */ yb0 b;

    public /* synthetic */ fb0(yb0 yb0Var, int i10) {
        this.a = i10;
        this.b = yb0Var;
    }

    @Override // zf.b
    public void b(ArrayList arrayList) {
        switch (this.a) {
            case 0:
                yb0 yb0Var = this.b;
                ArrayList arrayList2 = yb0Var.t0;
                if (arrayList != null) {
                    int size = arrayList2.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        ((xb0) arrayList2.get(i10)).b.c();
                    }
                    arrayList2.clear();
                    int size2 = arrayList.size();
                    for (int i11 = 0; i11 < size2; i11++) {
                        TLRPC.TL_messageMediaVenue tL_messageMediaVenue = (TLRPC.TL_messageMediaVenue) arrayList.get(i11);
                        try {
                            org.telegram.messenger.ab onCreateMarkerOptions = ((t7.u) org.telegram.messenger.w0.k()).onCreateMarkerOptions();
                            TLRPC.GeoPoint geoPoint = tL_messageMediaVenue.geo;
                            l2.f fVar = (l2.f) onCreateMarkerOptions;
                            ((j8.f) fVar.b).a = new LatLng(geoPoint.lat, geoPoint._long);
                            ((j8.f) fVar.b).d = v7.n8.a(yb0Var.m0(i11));
                            fVar.e(0.5f);
                            String str = tL_messageMediaVenue.title;
                            j8.f fVar2 = (j8.f) fVar.b;
                            fVar2.b = str;
                            fVar2.c = tL_messageMediaVenue.address;
                            xb0 xb0Var = new xb0();
                            xb0Var.a = i11;
                            org.telegram.messenger.fa a2 = yb0Var.G.a(fVar);
                            xb0Var.b = a2;
                            xb0Var.c = tL_messageMediaVenue;
                            a2.f(xb0Var);
                            arrayList2.add(xb0Var);
                        } catch (Exception e) {
                            org.telegram.messenger.f8.g(e, true);
                        }
                    }
                    break;
                }
                break;
            default:
                yb0 yb0Var2 = this.b;
                yb0Var2.B0 = false;
                yb0Var2.P0();
                break;
        }
    }

    @Override // org.telegram.messenger.bb
    public boolean c(MotionEvent motionEvent, org.telegram.messenger.ja jaVar) {
        MotionEvent motionEvent2;
        Location location;
        int i10 = this.a;
        yb0 yb0Var = this.b;
        switch (i10) {
            case 5:
                yb0Var.E0();
                if (yb0Var.L != 0.0f) {
                    motionEvent = MotionEvent.obtain(motionEvent);
                    motionEvent.offsetLocation(0.0f, (-yb0Var.L) / 2.0f);
                    motionEvent2 = motionEvent;
                } else {
                    motionEvent2 = null;
                }
                boolean booleanValue = jaVar.a(motionEvent).booleanValue();
                if (motionEvent2 != null) {
                    motionEvent2.recycle();
                }
                return booleanValue;
            default:
                if (yb0Var.J0 == null && yb0Var.H0 == null) {
                    if (motionEvent.getAction() == 0) {
                        AnimatorSet animatorSet = yb0Var.u0;
                        if (animatorSet != null) {
                            animatorSet.cancel();
                        }
                        AnimatorSet animatorSet2 = new AnimatorSet();
                        yb0Var.u0 = animatorSet2;
                        animatorSet2.setDuration(200L);
                        yb0Var.u0.playTogether(ObjectAnimator.ofFloat(yb0Var.V, (Property<View, Float>) View.TRANSLATION_Y, yb0Var.G0 - org.telegram.messenger.i0.L(10.0f)));
                        yb0Var.u0.start();
                    } else if (motionEvent.getAction() == 1) {
                        AnimatorSet animatorSet3 = yb0Var.u0;
                        if (animatorSet3 != null) {
                            animatorSet3.cancel();
                        }
                        yb0Var.L = 0.0f;
                        AnimatorSet animatorSet4 = new AnimatorSet();
                        yb0Var.u0 = animatorSet4;
                        animatorSet4.setDuration(200L);
                        yb0Var.u0.playTogether(ObjectAnimator.ofFloat(yb0Var.V, (Property<View, Float>) View.TRANSLATION_Y, yb0Var.G0));
                        yb0Var.u0.start();
                        yb0Var.R.I();
                    }
                    if (motionEvent.getAction() == 2) {
                        if (!yb0Var.K0) {
                            ImageView imageView = yb0Var.a;
                            int i11 = org.telegram.ui.ActionBar.t6.ij;
                            org.telegram.ui.ActionBar.a7.t(imageView, i11, yb0Var.getResourceProvider(), PorterDuff.Mode.MULTIPLY);
                            yb0Var.a.setTag(Integer.valueOf(i11));
                            yb0Var.K0 = true;
                        }
                        org.telegram.messenger.ga gaVar = yb0Var.G;
                        if (gaVar != null && (location = yb0Var.F0) != null) {
                            location.setLatitude(((org.telegram.messenger.cb) gaVar.d().b).a);
                            yb0Var.F0.setLongitude(((org.telegram.messenger.cb) yb0Var.G.d().b).b);
                        }
                        yb0Var.R.M(yb0Var.F0);
                    }
                }
                return jaVar.a(motionEvent).booleanValue();
        }
    }

    @Override // org.telegram.messenger.db
    public void d(int i10) {
        View childAt;
        yb0 yb0Var = this.b;
        int i11 = yb0Var.O0;
        if (i10 == 1) {
            yb0Var.M0(true);
            if (yb0Var.v0 != null) {
                yb0Var.V.setVisibility(0);
                ub0 ub0Var = yb0Var.w;
                org.telegram.messenger.fa faVar = yb0Var.v0;
                HashMap hashMap = ub0Var.a;
                View view = (View) hashMap.get(faVar);
                if (view != null) {
                    ub0Var.removeView(view);
                    hashMap.remove(faVar);
                }
                yb0Var.v0 = null;
                yb0Var.w0 = null;
                yb0Var.x0 = null;
            }
            yb0Var.r0 = -1L;
            if (yb0Var.s0) {
                yb0Var.s0 = false;
                yb0Var.R0();
            }
            if (yb0Var.O) {
                return;
            }
            if ((i11 == 0 || i11 == 1) && yb0Var.S.getChildCount() > 0 && (childAt = yb0Var.S.getChildAt(0)) != null) {
                nb0 nb0Var = yb0Var.S;
                View F = nb0Var.F(childAt);
                s4.c1 T = F == null ? null : nb0Var.T(F);
                if (T == null || T.b() != 0) {
                    return;
                }
                int L = i11 == 0 ? 0 : org.telegram.messenger.i0.L(66.0f);
                int top = childAt.getTop();
                if (top < (-L)) {
                    jg.c0 d = yb0Var.G.d();
                    yb0Var.J = ((t7.u) org.telegram.messenger.w0.k()).newCameraUpdateLatLngZoom((org.telegram.messenger.cb) d.b, d.c);
                    yb0Var.S.w0(0, top + L, null);
                }
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.u1
    public void h(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        switch (this.a) {
            case 1:
                yb0 yb0Var = this.b;
                if (yb0Var.getParentActivity() != null) {
                    try {
                        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                        intent.setData(Uri.parse("package:" + org.telegram.messenger.w0.b.getPackageName()));
                        yb0Var.getParentActivity().startActivity(intent);
                        break;
                    } catch (Exception e) {
                        org.telegram.messenger.f8.g(e, true);
                        return;
                    }
                }
                break;
            default:
                yb0 yb0Var2 = this.b;
                if (yb0Var2.getParentActivity() != null) {
                    try {
                        yb0Var2.getParentActivity().startActivity(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
                        break;
                    } catch (Exception unused) {
                        return;
                    }
                }
                break;
        }
    }
}
