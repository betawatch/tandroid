// default package

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.TextureView;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.LinearInterpolator;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a;
import org.telegram.messenger.beta.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.CheckBox;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class j68 implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ PhotoViewer b;

    public /* synthetic */ j68(PhotoViewer photoViewer, byte b) {
        this.a = b;
        this.b = photoViewer;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i;
        lbc lbcVar;
        int i2;
        Bitmap bitmap;
        Bitmap bitmap2;
        x31 x31Var;
        k27 k27Var;
        u47 b;
        o98 o98Var;
        byte b2 = 4;
        byte b3 = 3;
        char c = 1;
        final byte b4 = 0;
        switch (this.a) {
            case 0:
                PhotoViewer photoViewer = this.b;
                Drawable[] drawableArr = PhotoViewer.f9;
                Activity activity = photoViewer.E;
                if (activity != null) {
                    photoViewer.Z3 = false;
                    photoViewer.Y3 = (byte) 1;
                    if (photoViewer.X3 == -10) {
                        photoViewer.X3 = activity.getRequestedOrientation();
                    }
                    int rotation = ((WindowManager) photoViewer.E.getSystemService("window")).getDefaultDisplay().getRotation();
                    Activity activity2 = photoViewer.E;
                    if (rotation == 3) {
                        activity2.setRequestedOrientation(8);
                    } else {
                        activity2.setRequestedOrientation(0);
                    }
                    photoViewer.s2(false, false);
                    break;
                }
                break;
            case 1:
                PhotoViewer photoViewer2 = this.b;
                Drawable[] drawableArr2 = PhotoViewer.f9;
                photoViewer2.e();
                photoViewer2.n2(0);
                break;
            case 2:
                PhotoViewer photoViewer3 = this.b;
                Drawable[] drawableArr3 = PhotoViewer.f9;
                if (!photoViewer3.J1.a()) {
                    photoViewer3.n2(0);
                    break;
                } else {
                    Activity activity3 = photoViewer3.E;
                    if (activity3 != null) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, photoViewer3.w2, activity3);
                        alertDialog$Builder.a.U = k96.M0(2131751393, "DiscardChanges");
                        alertDialog$Builder.a.S = k96.M0(R.string.AppName, "AppName");
                        alertDialog$Builder.j(k96.M0(2131747638, "OK"), new r68(photoViewer3));
                        alertDialog$Builder.g(k96.M0(2131752577, "Cancel"), null);
                        photoViewer3.a2(alertDialog$Builder);
                        break;
                    }
                }
                break;
            case 3:
                PhotoViewer photoViewer4 = this.b;
                Drawable[] drawableArr4 = PhotoViewer.f9;
                photoViewer4.e8 = photoViewer4.g8;
                photoViewer4.O();
                photoViewer4.g2(false);
                photoViewer4.w1(2);
                break;
            case 4:
                PhotoViewer photoViewer5 = this.b;
                Drawable[] drawableArr5 = PhotoViewer.f9;
                Object obj = photoViewer5.g7.get(photoViewer5.P4);
                if (obj instanceof bm6) {
                    ((bm6) obj).s = photoViewer5.l0();
                }
                photoViewer5.g2(false);
                photoViewer5.w1(2);
                break;
            case 5:
                PhotoViewer photoViewer6 = this.b;
                Drawable[] drawableArr6 = PhotoViewer.f9;
                photoViewer6.v5.m(false, true);
                photoViewer6.w5.m(false, true);
                photoViewer6.n2(0);
                break;
            case 6:
                PhotoViewer photoViewer7 = this.b;
                Drawable[] drawableArr7 = PhotoViewer.f9;
                photoViewer7.v5.m(false, true);
                photoViewer7.w5.m(false, true);
                photoViewer7.e();
                photoViewer7.n2(0);
                break;
            case 7:
                PhotoViewer photoViewer8 = this.b;
                Drawable[] drawableArr8 = PhotoViewer.f9;
                photoViewer8.E1(false, 0, 0, false, false, false);
                break;
            case 8:
                PhotoViewer photoViewer9 = this.b;
                Drawable[] drawableArr9 = PhotoViewer.f9;
                photoViewer9.n2(5);
                break;
            case 9:
                PhotoViewer photoViewer10 = this.b;
                Drawable[] drawableArr10 = PhotoViewer.f9;
                photoViewer10.A();
                break;
            case 10:
                PhotoViewer photoViewer11 = this.b;
                Drawable[] drawableArr11 = PhotoViewer.f9;
                if (!photoViewer11.q5.b.R && (i = photoViewer11.P4) >= 0 && i < photoViewer11.g7.size() && (photoViewer11.g7.get(photoViewer11.P4) instanceof jm6)) {
                    jm6 jm6Var = (jm6) photoViewer11.g7.get(photoViewer11.P4);
                    long time = photoViewer11.q5.getTime();
                    String x0 = PhotoViewer.x0();
                    photoViewer11.q5.b.setLoading(true);
                    Utilities.e.c(new m77((Object) photoViewer11, (Object) x0, (Object) jm6Var, time, (byte) 28));
                    break;
                }
                break;
            case 11:
                final PhotoViewer photoViewer12 = this.b;
                Drawable[] drawableArr12 = PhotoViewer.f9;
                if (!photoViewer12.J0()) {
                    photoViewer12.r = !photoViewer12.r;
                    ArrayList arrayList = photoViewer12.i1;
                    if (arrayList != null) {
                        int size = arrayList.size();
                        int i3 = 0;
                        while (i3 < size) {
                            Object obj2 = arrayList.get(i3);
                            i3++;
                            ((je5) obj2).f(true);
                        }
                    }
                    if (photoViewer12.r) {
                        final je5 je5Var = new je5(photoViewer12.E, 3);
                        je5Var.p(true);
                        je5Var.t(k96.M0(2131751197, null));
                        je5Var.h = je5.a(je5Var.getText(), je5Var.getTextPaint());
                        je5Var.setPadding(gl.L(6.0f), 0, gl.L(6.0f), 0);
                        je5Var.n(0.0f, 22.0f);
                        je5Var.r0 = new Runnable() { // from class: k68
                            @Override // java.lang.Runnable
                            public final void run() {
                                byte b5 = b4;
                                je5 je5Var2 = je5Var;
                                PhotoViewer photoViewer13 = photoViewer12;
                                switch (b5) {
                                    case 0:
                                        Drawable[] drawableArr13 = PhotoViewer.f9;
                                        ArrayList arrayList2 = photoViewer13.i1;
                                        if (arrayList2 != null) {
                                            arrayList2.remove(je5Var2);
                                            break;
                                        }
                                        break;
                                    default:
                                        Drawable[] drawableArr14 = PhotoViewer.f9;
                                        ArrayList arrayList3 = photoViewer13.i1;
                                        if (arrayList3 != null) {
                                            arrayList3.remove(je5Var2);
                                        }
                                        ArrayList arrayList4 = photoViewer13.j1;
                                        if (arrayList4 != null) {
                                            arrayList4.remove(je5Var2);
                                            break;
                                        }
                                        break;
                                }
                            }
                        };
                        if (photoViewer12.i1 == null) {
                            photoViewer12.i1 = new ArrayList();
                        }
                        photoViewer12.f0.addView(je5Var, nme.e(-1, kk7.d3, 83));
                        photoViewer12.i1.add(je5Var);
                        je5Var.v();
                    }
                    photoViewer12.I2();
                    photoViewer12.O2();
                    if (photoViewer12.r) {
                        CheckBox checkBox = photoViewer12.O0;
                        if (!checkBox.y) {
                            checkBox.callOnClick();
                            break;
                        }
                    }
                    Object obj3 = photoViewer12.g7.get(photoViewer12.P4);
                    if (obj3 instanceof bm6) {
                        ((bm6) obj3).s = photoViewer12.l0();
                        break;
                    }
                }
                break;
            case 12:
                final PhotoViewer photoViewer13 = this.b;
                Drawable[] drawableArr13 = PhotoViewer.f9;
                boolean T0 = photoViewer13.T0();
                boolean z = !T0;
                int i4 = photoViewer13.P4;
                if (i4 >= 0 && i4 < photoViewer13.g7.size()) {
                    Object obj4 = photoViewer13.g7.get(photoViewer13.P4);
                    if (obj4 instanceof jm6) {
                        ((jm6) obj4).O = Boolean.valueOf(z);
                        SharedPreferences.Editor edit = a.b.getSharedPreferences("mainconfig", 0).edit();
                        gba.f1 = T0;
                        edit.putBoolean("photoLiveDefault", T0).apply();
                        o98 o98Var2 = photoViewer13.d;
                        if (o98Var2 != null) {
                            o98Var2.m();
                        }
                    }
                }
                photoViewer13.g1.a(!photoViewer13.T0(), true);
                photoViewer13.Y7.animate().alpha(photoViewer13.T0() ? 0.45f : 1.0f).start();
                if (photoViewer13.T0() && (lbcVar = photoViewer13.G2) != null) {
                    lbcVar.f0();
                }
                photoViewer13.f0.invalidate();
                if (photoViewer13.i1 == null) {
                    photoViewer13.i1 = new ArrayList();
                }
                if (photoViewer13.j1 == null) {
                    photoViewer13.j1 = new ArrayList();
                }
                ArrayList arrayList2 = photoViewer13.i1;
                int size2 = arrayList2.size();
                int i5 = 0;
                while (i5 < size2) {
                    Object obj5 = arrayList2.get(i5);
                    i5++;
                    ((je5) obj5).f(true);
                }
                final je5 je5Var2 = new je5(photoViewer13.E, 3);
                je5Var2.t(gl.T2(k96.M0(photoViewer13.T0() ? 2131748644 : 2131748643, null)));
                je5Var2.setPadding(gl.L(6.0f), 0, gl.L(6.0f), gl.L(6.0f));
                je5Var2.n(0.0f, 28.0f);
                final char c2 = c == true ? 1 : 0;
                je5Var2.r0 = new Runnable() { // from class: k68
                    @Override // java.lang.Runnable
                    public final void run() {
                        byte b5 = c2;
                        je5 je5Var22 = je5Var2;
                        PhotoViewer photoViewer132 = photoViewer13;
                        switch (b5) {
                            case 0:
                                Drawable[] drawableArr132 = PhotoViewer.f9;
                                ArrayList arrayList22 = photoViewer132.i1;
                                if (arrayList22 != null) {
                                    arrayList22.remove(je5Var22);
                                    break;
                                }
                                break;
                            default:
                                Drawable[] drawableArr14 = PhotoViewer.f9;
                                ArrayList arrayList3 = photoViewer132.i1;
                                if (arrayList3 != null) {
                                    arrayList3.remove(je5Var22);
                                }
                                ArrayList arrayList4 = photoViewer132.j1;
                                if (arrayList4 != null) {
                                    arrayList4.remove(je5Var22);
                                    break;
                                }
                                break;
                        }
                    }
                };
                photoViewer13.f0.addView(je5Var2, nme.e(-1, kk7.d3, 83));
                photoViewer13.i1.add(je5Var2);
                photoViewer13.j1.add(je5Var2);
                je5Var2.v();
                break;
            case 13:
                PhotoViewer photoViewer14 = this.b;
                Drawable[] drawableArr14 = PhotoViewer.f9;
                if (photoViewer14.d != null && !photoViewer14.J0()) {
                    photoViewer14.d.n();
                    photoViewer14.B(true, false);
                    break;
                }
                break;
            case 14:
                PhotoViewer photoViewer15 = this.b;
                Drawable[] drawableArr15 = PhotoViewer.f9;
                if (photoViewer15.d != null && !photoViewer15.J0()) {
                    photoViewer15.d.n();
                    photoViewer15.B(true, false);
                    break;
                }
                break;
            case 15:
                PhotoViewer photoViewer16 = this.b;
                Drawable[] drawableArr16 = PhotoViewer.f9;
                ArrayList arrayList3 = photoViewer16.g7;
                if (!photoViewer16.B7) {
                    c98 c98Var = photoViewer16.t5;
                    if (!c98Var.R && c98Var.o0 != 1 && (i2 = photoViewer16.P4) >= 0 && i2 < arrayList3.size() && !photoViewer16.p5.W) {
                        bm6 bm6Var = (bm6) arrayList3.get(photoViewer16.P4);
                        boolean isEmpty = TextUtils.isEmpty(bm6Var.i);
                        boolean z2 = !isEmpty;
                        c98 c98Var2 = photoViewer16.t5;
                        byte b5 = c98Var2.o0;
                        if (b5 != 0) {
                            if (b5 != 2) {
                                photoViewer16.p5.k();
                                photoViewer16.p5.getThanosEffect();
                                mza mzaVar = photoViewer16.p5;
                                mzaVar.M = false;
                                mzaVar.F = null;
                                ImageReceiver imageReceiver = photoViewer16.C4;
                                if (isEmpty || (bitmap = mzaVar.L) == null) {
                                    bitmap = mzaVar.J;
                                }
                                imageReceiver.f0(bitmap);
                                photoViewer16.t5.setCutOutState(true);
                                photoViewer16.f2(false, true);
                                photoViewer16.e();
                                break;
                            } else {
                                c98Var2.setCutOutState(true);
                                photoViewer16.f2(false, true);
                                photoViewer16.p5.f();
                                photoViewer16.f0.invalidate();
                                break;
                            }
                        } else {
                            c98Var2.setCancelState(true);
                            mza mzaVar2 = photoViewer16.p5;
                            o42 o42Var = new o42(photoViewer16, z2, bm6Var, b3);
                            mzaVar2.getClass();
                            mzaVar2.setOnClickListener(new b99(mzaVar2, o42Var, (byte) 20));
                            TextView textView = mzaVar2.N;
                            textView.setText(k96.M0(2131745483, null));
                            textView.animate().cancel();
                            textView.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(240L).setInterpolator(s33.h).start();
                            ValueAnimator valueAnimator = mzaVar2.O;
                            if (valueAnimator != null) {
                                valueAnimator.cancel();
                            }
                            mzaVar2.R = mzaVar2.S;
                            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                            mzaVar2.O = ofFloat;
                            ofFloat.addUpdateListener(new gja(mzaVar2, (byte) 11));
                            mzaVar2.O.setRepeatCount(-1);
                            mzaVar2.O.setRepeatMode(1);
                            mzaVar2.O.setDuration(2400L);
                            mzaVar2.O.setInterpolator(new LinearInterpolator());
                            mzaVar2.O.start();
                            photoViewer16.f0.invalidate();
                            break;
                        }
                    }
                }
                break;
            case 16:
                PhotoViewer photoViewer17 = this.b;
                Drawable[] drawableArr17 = PhotoViewer.f9;
                photoViewer17.v5.m(true, true);
                photoViewer17.w5.m(false, true);
                mza mzaVar3 = photoViewer17.p5;
                if (mzaVar3 != null) {
                    mzaVar3.setOutlineVisible(false);
                }
                photoViewer17.N1 = true;
                p88 p88Var = photoViewer17.O1;
                if (p88Var != null) {
                    p88Var.setEraser(true);
                }
                photoViewer17.n2(4);
                break;
            case 17:
                PhotoViewer photoViewer18 = this.b;
                Drawable[] drawableArr18 = PhotoViewer.f9;
                photoViewer18.v5.m(false, true);
                photoViewer18.w5.m(true, true);
                mza mzaVar4 = photoViewer18.p5;
                if (mzaVar4 != null) {
                    mzaVar4.setOutlineVisible(false);
                }
                photoViewer18.N1 = false;
                p88 p88Var2 = photoViewer18.O1;
                if (p88Var2 != null) {
                    p88Var2.setEraser(false);
                }
                photoViewer18.n2(4);
                break;
            case 18:
                PhotoViewer photoViewer19 = this.b;
                Drawable[] drawableArr19 = PhotoViewer.f9;
                p88 p88Var3 = photoViewer19.O1;
                if (p88Var3 != null) {
                    b5c b5cVar = p88Var3.b;
                    if (b5cVar.a()) {
                        b5cVar.c();
                        break;
                    }
                }
                photoViewer19.n2(0);
                photoViewer19.p5.k();
                boolean isEmpty2 = TextUtils.isEmpty(((bm6) photoViewer19.g7.get(photoViewer19.P4)).i);
                mza mzaVar5 = photoViewer19.p5;
                if (mzaVar5 != null && !mzaVar5.H) {
                    mzaVar5.M = false;
                    mzaVar5.F = null;
                }
                ImageReceiver imageReceiver2 = photoViewer19.C4;
                if (isEmpty2 || (bitmap2 = mzaVar5.L) == null) {
                    bitmap2 = mzaVar5.J;
                }
                imageReceiver2.f0(bitmap2);
                mza mzaVar6 = photoViewer19.p5;
                if (mzaVar6 == null || !mzaVar6.H) {
                    photoViewer19.t5.setCutOutState(true);
                }
                photoViewer19.j2(true, true);
                break;
            case 19:
                PhotoViewer photoViewer20 = this.b;
                Drawable[] drawableArr20 = PhotoViewer.f9;
                if (photoViewer20.p5 != null) {
                    photoViewer20.y5.m(!r14.u0, true);
                    photoViewer20.p5.setOutlineVisible((!photoViewer20.y5.u0 || photoViewer20.v5.u0 || photoViewer20.w5.u0) ? false : true);
                    break;
                }
                break;
            case 20:
                PhotoViewer photoViewer21 = this.b;
                Drawable[] drawableArr21 = PhotoViewer.f9;
                mu1 mu1Var = photoViewer21.l4;
                if (mu1Var != null && (k27Var = mu1Var.H5) != null && k27Var.o5() && !hc2.z(photoViewer21.U, 24, k27.B0(photoViewer21.l4.H5.k))) {
                    if (photoViewer21.m4 == null || (b = photoViewer21.l4.y5) == null) {
                        b = u47.b(photoViewer21.l4.H5.k.suggested_post);
                    }
                    if (!gta.Q(photoViewer21.U, b.a)) {
                        mu1 mu1Var2 = photoViewer21.l4;
                        if (mu1Var2 != null) {
                            mu1Var2.ic(b);
                            break;
                        }
                    }
                }
                if (!photoViewer21.V1.o()) {
                    mu1 mu1Var3 = photoViewer21.l4;
                    if (mu1Var3 == null || !mu1Var3.N7() || ((x31Var = photoViewer21.l4.Y1) != null && x31Var.E3 != null)) {
                        photoViewer21.E1(true, 0, 0, false, false, false);
                        break;
                    } else {
                        photoViewer21.h2();
                        break;
                    }
                } else {
                    hn hnVar = photoViewer21.V1.w;
                    float f = -photoViewer21.X1;
                    photoViewer21.X1 = f;
                    gl.B3(f, hnVar, null);
                    pw0.E.a();
                    if (!na7.q1(photoViewer21.U).E3() && na7.q1(photoViewer21.U).k4.h1.f() > photoViewer21.V1.getCodePointCount()) {
                        photoViewer21.b2(photoViewer21.f0);
                        break;
                    }
                }
                break;
            case 21:
                PhotoViewer photoViewer22 = this.b;
                Drawable[] drawableArr22 = PhotoViewer.f9;
                photoViewer22.a.a(false, true);
                break;
            case 22:
                PhotoViewer photoViewer23 = this.b;
                Drawable[] drawableArr23 = PhotoViewer.f9;
                if (photoViewer23.E != null && (o98Var = photoViewer23.d) != null) {
                    o98Var.W();
                    photoViewer23.B(true, false);
                    break;
                }
                break;
            case 23:
                PhotoViewer photoViewer24 = this.b;
                Drawable[] drawableArr24 = PhotoViewer.f9;
                photoViewer24.m();
                if (!photoViewer24.J0()) {
                    if (photoViewer24.s1) {
                        if (photoViewer24.q8) {
                            TextureView textureView = photoViewer24.C2;
                            if (textureView instanceof kac) {
                                kac kacVar = (kac) textureView;
                                if (kacVar.getVideoWidth() <= 0 || kacVar.getVideoHeight() <= 0) {
                                }
                            }
                        }
                    }
                    photoViewer24.n2(1);
                    break;
                }
                break;
            case 24:
                PhotoViewer photoViewer25 = this.b;
                Drawable[] drawableArr25 = PhotoViewer.f9;
                photoViewer25.L(-90.0f, false, null);
                break;
            case 25:
                PhotoViewer photoViewer26 = this.b;
                Drawable[] drawableArr26 = PhotoViewer.f9;
                photoViewer26.K();
                break;
            case 26:
                PhotoViewer photoViewer27 = this.b;
                Drawable[] drawableArr27 = PhotoViewer.f9;
                photoViewer27.m();
                if (!photoViewer27.J0()) {
                    if (photoViewer27.s1) {
                        if (photoViewer27.q8) {
                            TextureView textureView2 = photoViewer27.C2;
                            if (textureView2 instanceof kac) {
                                kac kacVar2 = (kac) textureView2;
                                if (kacVar2.getVideoWidth() <= 0 || kacVar2.getVideoHeight() <= 0) {
                                }
                            }
                        }
                    }
                    photoViewer27.n2(3);
                    break;
                }
                break;
            case 27:
                PhotoViewer photoViewer28 = this.b;
                Drawable[] drawableArr28 = PhotoViewer.f9;
                if (view.getAlpha() >= 0.9f) {
                    photoViewer28.m();
                    if (!photoViewer28.J0()) {
                        if (photoViewer28.s1) {
                            if (photoViewer28.q8) {
                                TextureView textureView3 = photoViewer28.C2;
                                if (textureView3 instanceof kac) {
                                    kac kacVar3 = (kac) textureView3;
                                    if (kacVar3.getVideoWidth() <= 0 || kacVar3.getVideoHeight() <= 0) {
                                    }
                                }
                            }
                        }
                        photoViewer28.n2(2);
                        break;
                    }
                }
                break;
            case 28:
                PhotoViewer photoViewer29 = this.b;
                Drawable[] drawableArr29 = PhotoViewer.f9;
                if (photoViewer29.p6 == null) {
                    l68 l68Var = new l68(photoViewer29, b2);
                    if (!photoViewer29.J2) {
                        float stateOrientation = photoViewer29.R2 - photoViewer29.D1.b.getStateOrientation();
                        if (Math.abs(stateOrientation) > 180.0f) {
                            stateOrientation = stateOrientation < 0.0f ? stateOrientation + 360.0f : -(360.0f - stateOrientation);
                        }
                        photoViewer29.L(stateOrientation, photoViewer29.D1.b.getStateMirror(), l68Var);
                        break;
                    } else {
                        l68Var.run();
                        break;
                    }
                }
                break;
            default:
                PhotoViewer photoViewer30 = this.b;
                Drawable[] drawableArr30 = PhotoViewer.f9;
                if (photoViewer30.u4 == 1) {
                    j33 j33Var = photoViewer30.D1.b;
                    v23 v23Var = j33Var.H;
                    if (v23Var.a.isInProgress() || v23Var.h || j33Var.a.f0) {
                    }
                }
                photoViewer30.e();
                photoViewer30.n2(0);
                break;
        }
    }
}
