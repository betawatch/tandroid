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

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final /* synthetic */ class aa0 implements org.telegram.messenger.bb, org.telegram.ui.ActionBar.r1, org.telegram.messenger.db, jg.b {
    public final /* synthetic */ int a;
    public final /* synthetic */ pa0 b;

    public /* synthetic */ aa0(pa0 pa0Var, int i7) {
        this.a = i7;
        this.b = pa0Var;
    }

    @Override // jg.b
    public void a() {
        pa0 pa0Var = this.b;
        pa0Var.v0 = false;
        pa0Var.L0();
    }

    @Override // org.telegram.messenger.bb
    public boolean b(MotionEvent motionEvent, org.telegram.messenger.ia iaVar) {
        MotionEvent motionEvent2;
        Location location;
        int i7 = this.a;
        pa0 pa0Var = this.b;
        switch (i7) {
            case 0:
                pa0Var.D0();
                if (pa0Var.J != 0.0f) {
                    motionEvent = MotionEvent.obtain(motionEvent);
                    motionEvent.offsetLocation(0.0f, (-pa0Var.J) / 2.0f);
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
                if (pa0Var.D0 == null && pa0Var.B0 == null) {
                    if (motionEvent.getAction() == 0) {
                        AnimatorSet animatorSet = pa0Var.r0;
                        if (animatorSet != null) {
                            animatorSet.cancel();
                        }
                        AnimatorSet animatorSet2 = new AnimatorSet();
                        pa0Var.r0 = animatorSet2;
                        animatorSet2.setDuration(200L);
                        pa0Var.r0.playTogether(ObjectAnimator.ofFloat(pa0Var.T, (Property<View, Float>) View.TRANSLATION_Y, pa0Var.A0 - org.telegram.messenger.g0.L(10.0f)));
                        pa0Var.r0.start();
                    } else if (motionEvent.getAction() == 1) {
                        AnimatorSet animatorSet3 = pa0Var.r0;
                        if (animatorSet3 != null) {
                            animatorSet3.cancel();
                        }
                        pa0Var.J = 0.0f;
                        AnimatorSet animatorSet4 = new AnimatorSet();
                        pa0Var.r0 = animatorSet4;
                        animatorSet4.setDuration(200L);
                        pa0Var.r0.playTogether(ObjectAnimator.ofFloat(pa0Var.T, (Property<View, Float>) View.TRANSLATION_Y, pa0Var.A0));
                        pa0Var.r0.start();
                        pa0Var.P.H();
                    }
                    if (motionEvent.getAction() == 2) {
                        if (!pa0Var.E0) {
                            ImageView imageView = pa0Var.a;
                            int i10 = org.telegram.ui.ActionBar.k6.ij;
                            org.telegram.ui.ActionBar.r6.t(imageView, i10, pa0Var.getResourceProvider(), PorterDuff.Mode.MULTIPLY);
                            pa0Var.a.setTag(Integer.valueOf(i10));
                            pa0Var.E0 = true;
                        }
                        org.telegram.messenger.fa faVar = pa0Var.E;
                        if (faVar != null && (location = pa0Var.z0) != null) {
                            location.setLatitude(((org.telegram.messenger.cb) faVar.d().b).a);
                            pa0Var.z0.setLongitude(((org.telegram.messenger.cb) pa0Var.E.d().b).b);
                        }
                        pa0Var.P.L(pa0Var.z0);
                    }
                }
                return iaVar.a(motionEvent).booleanValue();
        }
    }

    @Override // org.telegram.messenger.db
    public void c(int i7) {
        View childAt;
        pa0 pa0Var = this.b;
        int i10 = pa0Var.H0;
        if (i7 == 1) {
            pa0Var.p0 = -1L;
            if (pa0Var.q0) {
                pa0Var.q0 = false;
                pa0Var.N0();
            }
            if (pa0Var.M) {
                return;
            }
            if ((i10 == 0 || i10 == 1) && pa0Var.Q.getChildCount() > 0 && (childAt = pa0Var.Q.getChildAt(0)) != null) {
                zs zsVar = pa0Var.Q;
                View F = zsVar.F(childAt);
                v4.d1 T = F == null ? null : zsVar.T(F);
                if (T == null || T.b() != 0) {
                    return;
                }
                int L = i10 == 0 ? 0 : org.telegram.messenger.g0.L(66.0f);
                int top = childAt.getTop();
                if (top < (-L)) {
                    fi.y4 d = pa0Var.E.d();
                    pa0Var.H = ((nb.a) org.telegram.messenger.t0.k()).newCameraUpdateLatLngZoom((org.telegram.messenger.cb) d.b, d.c);
                    pa0Var.Q.w0(0, top + L, null);
                }
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.r1
    public void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        switch (this.a) {
            case 2:
                pa0 pa0Var = this.b;
                if (pa0Var.getParentActivity() != null) {
                    try {
                        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                        intent.setData(Uri.parse("package:" + org.telegram.messenger.t0.b.getPackageName()));
                        pa0Var.getParentActivity().startActivity(intent);
                        break;
                    } catch (Exception e10) {
                        org.telegram.messenger.a8.g(e10, true);
                        return;
                    }
                }
                break;
            default:
                pa0 pa0Var2 = this.b;
                if (pa0Var2.getParentActivity() != null) {
                    try {
                        pa0Var2.getParentActivity().startActivity(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
                        break;
                    } catch (Exception unused) {
                        return;
                    }
                }
                break;
        }
    }
}
