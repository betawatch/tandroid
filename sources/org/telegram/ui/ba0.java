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

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class ba0 implements org.telegram.messenger.ab, org.telegram.ui.ActionBar.q1, org.telegram.messenger.cb, jg.b {
    public final /* synthetic */ int a;
    public final /* synthetic */ pa0 b;

    public /* synthetic */ ba0(pa0 pa0Var, int i7) {
        this.a = i7;
        this.b = pa0Var;
    }

    @Override // jg.b
    public void a() {
        pa0 pa0Var = this.b;
        pa0Var.w0 = false;
        pa0Var.L0();
    }

    @Override // org.telegram.messenger.cb
    public void b(int i7) {
        View childAt;
        pa0 pa0Var = this.b;
        int i10 = pa0Var.I0;
        if (i7 == 1) {
            pa0Var.q0 = -1L;
            if (pa0Var.r0) {
                pa0Var.r0 = false;
                pa0Var.N0();
            }
            if (pa0Var.N) {
                return;
            }
            if ((i10 == 0 || i10 == 1) && pa0Var.R.getChildCount() > 0 && (childAt = pa0Var.R.getChildAt(0)) != null) {
                ct ctVar = pa0Var.R;
                View F = ctVar.F(childAt);
                v4.e1 T = F == null ? null : ctVar.T(F);
                if (T == null || T.b() != 0) {
                    return;
                }
                int L = i10 == 0 ? 0 : org.telegram.messenger.g0.L(66.0f);
                int top = childAt.getTop();
                if (top < (-L)) {
                    hi.w4 d = pa0Var.F.d();
                    pa0Var.I = ((pb.b) org.telegram.messenger.t0.k()).newCameraUpdateLatLngZoom((org.telegram.messenger.bb) d.b, d.c);
                    pa0Var.R.w0(0, top + L, null);
                }
            }
        }
    }

    @Override // org.telegram.messenger.ab
    public boolean c(MotionEvent motionEvent, org.telegram.messenger.ha haVar) {
        MotionEvent motionEvent2;
        Location location;
        int i7 = this.a;
        pa0 pa0Var = this.b;
        switch (i7) {
            case 0:
                pa0Var.D0();
                if (pa0Var.K != 0.0f) {
                    motionEvent = MotionEvent.obtain(motionEvent);
                    motionEvent.offsetLocation(0.0f, (-pa0Var.K) / 2.0f);
                    motionEvent2 = motionEvent;
                } else {
                    motionEvent2 = null;
                }
                boolean booleanValue = haVar.a(motionEvent).booleanValue();
                if (motionEvent2 != null) {
                    motionEvent2.recycle();
                }
                return booleanValue;
            default:
                if (pa0Var.E0 == null && pa0Var.C0 == null) {
                    if (motionEvent.getAction() == 0) {
                        AnimatorSet animatorSet = pa0Var.s0;
                        if (animatorSet != null) {
                            animatorSet.cancel();
                        }
                        AnimatorSet animatorSet2 = new AnimatorSet();
                        pa0Var.s0 = animatorSet2;
                        animatorSet2.setDuration(200L);
                        pa0Var.s0.playTogether(ObjectAnimator.ofFloat(pa0Var.U, (Property<View, Float>) View.TRANSLATION_Y, pa0Var.B0 - org.telegram.messenger.g0.L(10.0f)));
                        pa0Var.s0.start();
                    } else if (motionEvent.getAction() == 1) {
                        AnimatorSet animatorSet3 = pa0Var.s0;
                        if (animatorSet3 != null) {
                            animatorSet3.cancel();
                        }
                        pa0Var.K = 0.0f;
                        AnimatorSet animatorSet4 = new AnimatorSet();
                        pa0Var.s0 = animatorSet4;
                        animatorSet4.setDuration(200L);
                        pa0Var.s0.playTogether(ObjectAnimator.ofFloat(pa0Var.U, (Property<View, Float>) View.TRANSLATION_Y, pa0Var.B0));
                        pa0Var.s0.start();
                        pa0Var.Q.H();
                    }
                    if (motionEvent.getAction() == 2) {
                        if (!pa0Var.F0) {
                            ImageView imageView = pa0Var.a;
                            int i10 = org.telegram.ui.ActionBar.j6.lj;
                            org.telegram.ui.ActionBar.q6.s(imageView, i10, pa0Var.getResourceProvider(), PorterDuff.Mode.MULTIPLY);
                            pa0Var.a.setTag(Integer.valueOf(i10));
                            pa0Var.F0 = true;
                        }
                        org.telegram.messenger.ea eaVar = pa0Var.F;
                        if (eaVar != null && (location = pa0Var.A0) != null) {
                            location.setLatitude(((org.telegram.messenger.bb) eaVar.d().b).a);
                            pa0Var.A0.setLongitude(((org.telegram.messenger.bb) pa0Var.F.d().b).b);
                        }
                        pa0Var.Q.L(pa0Var.A0);
                    }
                }
                return haVar.a(motionEvent).booleanValue();
        }
    }

    @Override // org.telegram.ui.ActionBar.q1
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
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
