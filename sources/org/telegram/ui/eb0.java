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

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class eb0 implements zf.b, org.telegram.ui.ActionBar.u1, org.telegram.messenger.eb, org.telegram.messenger.cb {
    public final /* synthetic */ int a;
    public final /* synthetic */ xb0 b;

    public /* synthetic */ eb0(xb0 xb0Var, int i10) {
        this.a = i10;
        this.b = xb0Var;
    }

    @Override // zf.b
    public void b(ArrayList arrayList) {
        switch (this.a) {
            case 0:
                xb0 xb0Var = this.b;
                ArrayList arrayList2 = xb0Var.t0;
                if (arrayList != null) {
                    int size = arrayList2.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        ((wb0) arrayList2.get(i10)).b.c();
                    }
                    arrayList2.clear();
                    int size2 = arrayList.size();
                    for (int i11 = 0; i11 < size2; i11++) {
                        TLRPC.TL_messageMediaVenue tL_messageMediaVenue = (TLRPC.TL_messageMediaVenue) arrayList.get(i11);
                        try {
                            org.telegram.messenger.bb onCreateMarkerOptions = ((t7.u) org.telegram.messenger.w0.k()).onCreateMarkerOptions();
                            TLRPC.GeoPoint geoPoint = tL_messageMediaVenue.geo;
                            l2.f fVar = (l2.f) onCreateMarkerOptions;
                            ((j8.f) fVar.b).a = new LatLng(geoPoint.lat, geoPoint._long);
                            ((j8.f) fVar.b).d = v7.n8.a(xb0Var.n0(i11));
                            fVar.e(0.5f);
                            String str = tL_messageMediaVenue.title;
                            j8.f fVar2 = (j8.f) fVar.b;
                            fVar2.b = str;
                            fVar2.c = tL_messageMediaVenue.address;
                            wb0 wb0Var = new wb0();
                            wb0Var.a = i11;
                            org.telegram.messenger.ga a2 = xb0Var.G.a(fVar);
                            wb0Var.b = a2;
                            wb0Var.c = tL_messageMediaVenue;
                            a2.f(wb0Var);
                            arrayList2.add(wb0Var);
                        } catch (Exception e) {
                            org.telegram.messenger.f8.g(e, true);
                        }
                    }
                    break;
                }
                break;
            default:
                xb0 xb0Var2 = this.b;
                xb0Var2.B0 = false;
                xb0Var2.Q0();
                break;
        }
    }

    @Override // org.telegram.messenger.cb
    public boolean c(MotionEvent motionEvent, org.telegram.messenger.ka kaVar) {
        MotionEvent motionEvent2;
        Location location;
        int i10 = this.a;
        xb0 xb0Var = this.b;
        switch (i10) {
            case 5:
                xb0Var.F0();
                if (xb0Var.L != 0.0f) {
                    motionEvent = MotionEvent.obtain(motionEvent);
                    motionEvent.offsetLocation(0.0f, (-xb0Var.L) / 2.0f);
                    motionEvent2 = motionEvent;
                } else {
                    motionEvent2 = null;
                }
                boolean booleanValue = kaVar.a(motionEvent).booleanValue();
                if (motionEvent2 != null) {
                    motionEvent2.recycle();
                }
                return booleanValue;
            default:
                if (xb0Var.J0 == null && xb0Var.H0 == null) {
                    if (motionEvent.getAction() == 0) {
                        AnimatorSet animatorSet = xb0Var.u0;
                        if (animatorSet != null) {
                            animatorSet.cancel();
                        }
                        AnimatorSet animatorSet2 = new AnimatorSet();
                        xb0Var.u0 = animatorSet2;
                        animatorSet2.setDuration(200L);
                        xb0Var.u0.playTogether(ObjectAnimator.ofFloat(xb0Var.V, (Property<View, Float>) View.TRANSLATION_Y, xb0Var.G0 - org.telegram.messenger.i0.L(10.0f)));
                        xb0Var.u0.start();
                    } else if (motionEvent.getAction() == 1) {
                        AnimatorSet animatorSet3 = xb0Var.u0;
                        if (animatorSet3 != null) {
                            animatorSet3.cancel();
                        }
                        xb0Var.L = 0.0f;
                        AnimatorSet animatorSet4 = new AnimatorSet();
                        xb0Var.u0 = animatorSet4;
                        animatorSet4.setDuration(200L);
                        xb0Var.u0.playTogether(ObjectAnimator.ofFloat(xb0Var.V, (Property<View, Float>) View.TRANSLATION_Y, xb0Var.G0));
                        xb0Var.u0.start();
                        xb0Var.R.I();
                    }
                    if (motionEvent.getAction() == 2) {
                        if (!xb0Var.K0) {
                            ImageView imageView = xb0Var.a;
                            int i11 = org.telegram.ui.ActionBar.t6.ij;
                            org.telegram.ui.ActionBar.a7.t(imageView, i11, xb0Var.getResourceProvider(), PorterDuff.Mode.MULTIPLY);
                            xb0Var.a.setTag(Integer.valueOf(i11));
                            xb0Var.K0 = true;
                        }
                        org.telegram.messenger.ha haVar = xb0Var.G;
                        if (haVar != null && (location = xb0Var.F0) != null) {
                            location.setLatitude(((org.telegram.messenger.db) haVar.d().b).a);
                            xb0Var.F0.setLongitude(((org.telegram.messenger.db) xb0Var.G.d().b).b);
                        }
                        xb0Var.R.M(xb0Var.F0);
                    }
                }
                return kaVar.a(motionEvent).booleanValue();
        }
    }

    @Override // org.telegram.messenger.eb
    public void d(int i10) {
        View childAt;
        xb0 xb0Var = this.b;
        int i11 = xb0Var.O0;
        if (i10 == 1) {
            xb0Var.N0(true);
            if (xb0Var.v0 != null) {
                xb0Var.V.setVisibility(0);
                tb0 tb0Var = xb0Var.w;
                org.telegram.messenger.ga gaVar = xb0Var.v0;
                HashMap hashMap = tb0Var.a;
                View view = (View) hashMap.get(gaVar);
                if (view != null) {
                    tb0Var.removeView(view);
                    hashMap.remove(gaVar);
                }
                xb0Var.v0 = null;
                xb0Var.w0 = null;
                xb0Var.x0 = null;
            }
            xb0Var.r0 = -1L;
            if (xb0Var.s0) {
                xb0Var.s0 = false;
                xb0Var.S0();
            }
            if (xb0Var.O) {
                return;
            }
            if ((i11 == 0 || i11 == 1) && xb0Var.S.getChildCount() > 0 && (childAt = xb0Var.S.getChildAt(0)) != null) {
                mb0 mb0Var = xb0Var.S;
                View F = mb0Var.F(childAt);
                s4.c1 T = F == null ? null : mb0Var.T(F);
                if (T == null || T.b() != 0) {
                    return;
                }
                int L = i11 == 0 ? 0 : org.telegram.messenger.i0.L(66.0f);
                int top = childAt.getTop();
                if (top < (-L)) {
                    jg.c0 d = xb0Var.G.d();
                    xb0Var.J = ((t7.u) org.telegram.messenger.w0.k()).newCameraUpdateLatLngZoom((org.telegram.messenger.db) d.b, d.c);
                    xb0Var.S.w0(0, top + L, null);
                }
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.u1
    public void h(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        switch (this.a) {
            case 1:
                xb0 xb0Var = this.b;
                if (xb0Var.getParentActivity() != null) {
                    try {
                        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                        intent.setData(Uri.parse("package:" + org.telegram.messenger.w0.b.getPackageName()));
                        xb0Var.getParentActivity().startActivity(intent);
                        break;
                    } catch (Exception e) {
                        org.telegram.messenger.f8.g(e, true);
                        return;
                    }
                }
                break;
            default:
                xb0 xb0Var2 = this.b;
                if (xb0Var2.getParentActivity() != null) {
                    try {
                        xb0Var2.getParentActivity().startActivity(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
                        break;
                    } catch (Exception unused) {
                        return;
                    }
                }
                break;
        }
    }
}
