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

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class ca0 implements org.telegram.messenger.bb, org.telegram.ui.ActionBar.r1, org.telegram.messenger.db, jg.b {
    public final /* synthetic */ int a;
    public final /* synthetic */ ra0 b;

    public /* synthetic */ ca0(ra0 ra0Var, int i7) {
        this.a = i7;
        this.b = ra0Var;
    }

    @Override // jg.b
    public void a() {
        ra0 ra0Var = this.b;
        ra0Var.v0 = false;
        ra0Var.L0();
    }

    @Override // org.telegram.messenger.bb
    public boolean b(MotionEvent motionEvent, org.telegram.messenger.ia iaVar) {
        MotionEvent motionEvent2;
        Location location;
        int i7 = this.a;
        ra0 ra0Var = this.b;
        switch (i7) {
            case 0:
                ra0Var.D0();
                if (ra0Var.J != 0.0f) {
                    motionEvent = MotionEvent.obtain(motionEvent);
                    motionEvent.offsetLocation(0.0f, (-ra0Var.J) / 2.0f);
                    motionEvent2 = motionEvent;
                } else {
                    motionEvent2 = null;
                }
                boolean booleanValue = iaVar.a(motionEvent).booleanValue();
                if (motionEvent2 != null) {
                    motionEvent2.recycle();
                }
                return booleanValue;
            default:
                if (ra0Var.D0 == null && ra0Var.B0 == null) {
                    if (motionEvent.getAction() == 0) {
                        AnimatorSet animatorSet = ra0Var.r0;
                        if (animatorSet != null) {
                            animatorSet.cancel();
                        }
                        AnimatorSet animatorSet2 = new AnimatorSet();
                        ra0Var.r0 = animatorSet2;
                        animatorSet2.setDuration(200L);
                        ra0Var.r0.playTogether(ObjectAnimator.ofFloat(ra0Var.T, (Property<View, Float>) View.TRANSLATION_Y, ra0Var.A0 - org.telegram.messenger.g0.L(10.0f)));
                        ra0Var.r0.start();
                    } else if (motionEvent.getAction() == 1) {
                        AnimatorSet animatorSet3 = ra0Var.r0;
                        if (animatorSet3 != null) {
                            animatorSet3.cancel();
                        }
                        ra0Var.J = 0.0f;
                        AnimatorSet animatorSet4 = new AnimatorSet();
                        ra0Var.r0 = animatorSet4;
                        animatorSet4.setDuration(200L);
                        ra0Var.r0.playTogether(ObjectAnimator.ofFloat(ra0Var.T, (Property<View, Float>) View.TRANSLATION_Y, ra0Var.A0));
                        ra0Var.r0.start();
                        ra0Var.P.H();
                    }
                    if (motionEvent.getAction() == 2) {
                        if (!ra0Var.E0) {
                            ImageView imageView = ra0Var.a;
                            int i10 = org.telegram.ui.ActionBar.l6.ij;
                            org.telegram.ui.ActionBar.s6.s(imageView, i10, ra0Var.getResourceProvider(), PorterDuff.Mode.MULTIPLY);
                            ra0Var.a.setTag(Integer.valueOf(i10));
                            ra0Var.E0 = true;
                        }
                        org.telegram.messenger.fa faVar = ra0Var.E;
                        if (faVar != null && (location = ra0Var.z0) != null) {
                            location.setLatitude(((org.telegram.messenger.cb) faVar.d().b).a);
                            ra0Var.z0.setLongitude(((org.telegram.messenger.cb) ra0Var.E.d().b).b);
                        }
                        ra0Var.P.L(ra0Var.z0);
                    }
                }
                return iaVar.a(motionEvent).booleanValue();
        }
    }

    @Override // org.telegram.messenger.db
    public void c(int i7) {
        View childAt;
        ra0 ra0Var = this.b;
        int i10 = ra0Var.H0;
        if (i7 == 1) {
            ra0Var.p0 = -1L;
            if (ra0Var.q0) {
                ra0Var.q0 = false;
                ra0Var.N0();
            }
            if (ra0Var.M) {
                return;
            }
            if ((i10 == 0 || i10 == 1) && ra0Var.Q.getChildCount() > 0 && (childAt = ra0Var.Q.getChildAt(0)) != null) {
                bt btVar = ra0Var.Q;
                View F = btVar.F(childAt);
                v4.d1 T = F == null ? null : btVar.T(F);
                if (T == null || T.b() != 0) {
                    return;
                }
                int L = i10 == 0 ? 0 : org.telegram.messenger.g0.L(66.0f);
                int top = childAt.getTop();
                if (top < (-L)) {
                    fi.y4 d = ra0Var.E.d();
                    ra0Var.H = ((nb.a) org.telegram.messenger.t0.k()).newCameraUpdateLatLngZoom((org.telegram.messenger.cb) d.b, d.c);
                    ra0Var.Q.w0(0, top + L, null);
                }
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.r1
    public void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        switch (this.a) {
            case 2:
                ra0 ra0Var = this.b;
                if (ra0Var.getParentActivity() != null) {
                    try {
                        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                        intent.setData(Uri.parse("package:" + org.telegram.messenger.t0.b.getPackageName()));
                        ra0Var.getParentActivity().startActivity(intent);
                        break;
                    } catch (Exception e10) {
                        org.telegram.messenger.a8.g(e10, true);
                        return;
                    }
                }
                break;
            default:
                ra0 ra0Var2 = this.b;
                if (ra0Var2.getParentActivity() != null) {
                    try {
                        ra0Var2.getParentActivity().startActivity(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
                        break;
                    } catch (Exception unused) {
                        return;
                    }
                }
                break;
        }
    }
}
