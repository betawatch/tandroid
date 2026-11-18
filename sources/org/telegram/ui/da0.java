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

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class da0 implements org.telegram.messenger.za, org.telegram.messenger.pa, org.telegram.ui.ActionBar.r1, org.telegram.messenger.bb, jg.b {
    public final /* synthetic */ int a;
    public final /* synthetic */ qa0 b;

    public /* synthetic */ da0(qa0 qa0Var, int i7) {
        this.a = i7;
        this.b = qa0Var;
    }

    @Override // jg.b
    public void a() {
        qa0 qa0Var = this.b;
        qa0Var.w0 = false;
        qa0Var.O0();
    }

    @Override // org.telegram.messenger.za
    public boolean b(MotionEvent motionEvent, org.telegram.messenger.ga gaVar) {
        MotionEvent motionEvent2;
        Location location;
        int i7 = this.a;
        qa0 qa0Var = this.b;
        switch (i7) {
            case 0:
                qa0Var.D0();
                if (qa0Var.K != 0.0f) {
                    motionEvent = MotionEvent.obtain(motionEvent);
                    motionEvent.offsetLocation(0.0f, (-qa0Var.K) / 2.0f);
                    motionEvent2 = motionEvent;
                } else {
                    motionEvent2 = null;
                }
                boolean booleanValue = gaVar.a(motionEvent).booleanValue();
                if (motionEvent2 != null) {
                    motionEvent2.recycle();
                }
                return booleanValue;
            default:
                if (qa0Var.J0 == null && qa0Var.H0 == null) {
                    if (motionEvent.getAction() == 0) {
                        AnimatorSet animatorSet = qa0Var.s0;
                        if (animatorSet != null) {
                            animatorSet.cancel();
                        }
                        AnimatorSet animatorSet2 = new AnimatorSet();
                        qa0Var.s0 = animatorSet2;
                        animatorSet2.setDuration(200L);
                        qa0Var.s0.playTogether(ObjectAnimator.ofFloat(qa0Var.U, (Property<View, Float>) View.TRANSLATION_Y, qa0Var.B0 - org.telegram.messenger.g0.L(10.0f)));
                        qa0Var.s0.start();
                    } else if (motionEvent.getAction() == 1) {
                        AnimatorSet animatorSet3 = qa0Var.s0;
                        if (animatorSet3 != null) {
                            animatorSet3.cancel();
                        }
                        qa0Var.K = 0.0f;
                        AnimatorSet animatorSet4 = new AnimatorSet();
                        qa0Var.s0 = animatorSet4;
                        animatorSet4.setDuration(200L);
                        qa0Var.s0.playTogether(ObjectAnimator.ofFloat(qa0Var.U, (Property<View, Float>) View.TRANSLATION_Y, qa0Var.B0));
                        qa0Var.s0.start();
                        qa0Var.Q.H();
                    }
                    if (motionEvent.getAction() == 2) {
                        if (!qa0Var.K0) {
                            ImageView imageView = qa0Var.a;
                            int i10 = org.telegram.ui.ActionBar.n6.lj;
                            org.telegram.ui.ActionBar.u6.s(imageView, i10, qa0Var.getResourceProvider(), PorterDuff.Mode.MULTIPLY);
                            qa0Var.a.setTag(Integer.valueOf(i10));
                            qa0Var.K0 = true;
                        }
                        org.telegram.messenger.da daVar = qa0Var.F;
                        if (daVar != null && (location = qa0Var.A0) != null) {
                            location.setLatitude(((org.telegram.messenger.ab) daVar.d().b).a);
                            qa0Var.A0.setLongitude(((org.telegram.messenger.ab) qa0Var.F.d().b).b);
                        }
                        qa0Var.Q.L(qa0Var.A0);
                    }
                }
                return gaVar.a(motionEvent).booleanValue();
        }
    }

    @Override // org.telegram.messenger.bb
    public void c(int i7) {
        View childAt;
        qa0 qa0Var = this.b;
        int i10 = qa0Var.N0;
        if (i7 == 1) {
            qa0Var.q0 = -1L;
            if (qa0Var.r0) {
                qa0Var.r0 = false;
                qa0Var.R0();
            }
            if (qa0Var.N) {
                return;
            }
            if ((i10 == 0 || i10 == 1) && qa0Var.R.getChildCount() > 0 && (childAt = qa0Var.R.getChildAt(0)) != null) {
                et etVar = qa0Var.R;
                View F = etVar.F(childAt);
                v4.f1 T = F == null ? null : etVar.T(F);
                if (T == null || T.b() != 0) {
                    return;
                }
                int L = i10 == 0 ? 0 : org.telegram.messenger.g0.L(66.0f);
                int top = childAt.getTop();
                if (top < (-L)) {
                    hi.u4 d = qa0Var.F.d();
                    qa0Var.I = ((pb.b) org.telegram.messenger.t0.k()).newCameraUpdateLatLngZoom((org.telegram.messenger.ab) d.b, d.c);
                    qa0Var.R.w0(0, top + L, null);
                }
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.r1
    public void h(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        switch (this.a) {
            case 4:
                qa0 qa0Var = this.b;
                if (qa0Var.getParentActivity() != null) {
                    try {
                        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                        intent.setData(Uri.parse("package:" + org.telegram.messenger.t0.b.getPackageName()));
                        qa0Var.getParentActivity().startActivity(intent);
                        break;
                    } catch (Exception e10) {
                        org.telegram.messenger.a8.g(e10, true);
                        return;
                    }
                }
                break;
            default:
                qa0 qa0Var2 = this.b;
                if (qa0Var2.getParentActivity() != null) {
                    try {
                        qa0Var2.getParentActivity().startActivity(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
                        break;
                    } catch (Exception unused) {
                        return;
                    }
                }
                break;
        }
    }

    @Override // org.telegram.messenger.pa
    public void onLocationChanged(Location location) {
        if (location == null) {
            return;
        }
        qa0 qa0Var = this.b;
        qa0Var.E0(location);
        qa0Var.getLocationController().n(location, qa0Var.l0);
        qa0Var.l0 = false;
    }
}
