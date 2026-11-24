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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class m88 implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ PhotoViewer b;

    public /* synthetic */ m88(PhotoViewer photoViewer, byte b) {
        this.a = b;
        this.b = photoViewer;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i;
        ndc ndcVar;
        int i2;
        Bitmap bitmap;
        Bitmap bitmap2;
        e51 e51Var;
        k47 k47Var;
        v67 b;
        pb8 pb8Var;
        byte b2 = 4;
        byte b3 = 3;
        char c = 1;
        final byte b4 = 0;
        switch (this.a) {
            case 0:
                PhotoViewer photoViewer = this.b;
                Drawable[] drawableArr = PhotoViewer.d9;
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
                    photoViewer.t2(false, false);
                    break;
                }
                break;
            case 1:
                PhotoViewer photoViewer2 = this.b;
                Drawable[] drawableArr2 = PhotoViewer.d9;
                photoViewer2.e();
                photoViewer2.o2(0);
                break;
            case 2:
                PhotoViewer photoViewer3 = this.b;
                Drawable[] drawableArr3 = PhotoViewer.d9;
                if (!photoViewer3.J1.b()) {
                    photoViewer3.o2(0);
                    break;
                } else {
                    Activity activity3 = photoViewer3.E;
                    if (activity3 != null) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, photoViewer3.w2, activity3);
                        alertDialog$Builder.a.U = jb6.M0(2131751342, "DiscardChanges");
                        alertDialog$Builder.a.S = jb6.M0(R.string.AppName, "AppName");
                        alertDialog$Builder.j(jb6.M0(2131747564, "OK"), new u88(photoViewer3));
                        alertDialog$Builder.g(jb6.M0(2131752542, "Cancel"), null);
                        photoViewer3.b2(alertDialog$Builder);
                        break;
                    }
                }
                break;
            case 3:
                PhotoViewer photoViewer4 = this.b;
                Drawable[] drawableArr4 = PhotoViewer.d9;
                photoViewer4.d8 = photoViewer4.f8;
                photoViewer4.N();
                photoViewer4.h2(false);
                photoViewer4.x1(2);
                break;
            case 4:
                PhotoViewer photoViewer5 = this.b;
                Drawable[] drawableArr5 = PhotoViewer.d9;
                Object obj = photoViewer5.f7.get(photoViewer5.O4);
                if (obj instanceof co6) {
                    ((co6) obj).s = photoViewer5.l0();
                }
                photoViewer5.h2(false);
                photoViewer5.x1(2);
                break;
            case 5:
                PhotoViewer photoViewer6 = this.b;
                Drawable[] drawableArr6 = PhotoViewer.d9;
                photoViewer6.u5.m(false, true);
                photoViewer6.v5.m(false, true);
                photoViewer6.o2(0);
                break;
            case 6:
                PhotoViewer photoViewer7 = this.b;
                Drawable[] drawableArr7 = PhotoViewer.d9;
                photoViewer7.u5.m(false, true);
                photoViewer7.v5.m(false, true);
                photoViewer7.e();
                photoViewer7.o2(0);
                break;
            case 7:
                PhotoViewer photoViewer8 = this.b;
                Drawable[] drawableArr8 = PhotoViewer.d9;
                photoViewer8.F1(false, 0, 0, false, false, false);
                break;
            case 8:
                PhotoViewer photoViewer9 = this.b;
                Drawable[] drawableArr9 = PhotoViewer.d9;
                photoViewer9.o2(5);
                break;
            case 9:
                PhotoViewer photoViewer10 = this.b;
                Drawable[] drawableArr10 = PhotoViewer.d9;
                photoViewer10.z();
                break;
            case 10:
                PhotoViewer photoViewer11 = this.b;
                Drawable[] drawableArr11 = PhotoViewer.d9;
                if (!photoViewer11.p5.b.R && (i = photoViewer11.O4) >= 0 && i < photoViewer11.f7.size() && (photoViewer11.f7.get(photoViewer11.O4) instanceof jo6)) {
                    jo6 jo6Var = (jo6) photoViewer11.f7.get(photoViewer11.O4);
                    long time = photoViewer11.p5.getTime();
                    String x0 = PhotoViewer.x0();
                    photoViewer11.p5.b.setLoading(true);
                    Utilities.e.c(new p97((Object) photoViewer11, (Object) x0, (Object) jo6Var, time, (byte) 28));
                    break;
                }
                break;
            case 11:
                final PhotoViewer photoViewer12 = this.b;
                Drawable[] drawableArr12 = PhotoViewer.d9;
                if (!photoViewer12.K0()) {
                    photoViewer12.r = !photoViewer12.r;
                    ArrayList arrayList = photoViewer12.i1;
                    if (arrayList != null) {
                        int size = arrayList.size();
                        int i3 = 0;
                        while (i3 < size) {
                            Object obj2 = arrayList.get(i3);
                            i3++;
                            ((hg5) obj2).f(true);
                        }
                    }
                    if (photoViewer12.r) {
                        final hg5 hg5Var = new hg5(photoViewer12.E, 3);
                        hg5Var.p(true);
                        hg5Var.t(jb6.M0(2131751146, null));
                        hg5Var.h = hg5.a(hg5Var.getText(), hg5Var.getTextPaint());
                        hg5Var.setPadding(gm.L(6.0f), 0, gm.L(6.0f), 0);
                        hg5Var.n(0.0f, 22.0f);
                        hg5Var.r0 = new Runnable() { // from class: l88
                            @Override // java.lang.Runnable
                            public final void run() {
                                byte b5 = b4;
                                hg5 hg5Var2 = hg5Var;
                                PhotoViewer photoViewer13 = photoViewer12;
                                switch (b5) {
                                    case 0:
                                        Drawable[] drawableArr13 = PhotoViewer.d9;
                                        ArrayList arrayList2 = photoViewer13.i1;
                                        if (arrayList2 != null) {
                                            arrayList2.remove(hg5Var2);
                                            break;
                                        }
                                        break;
                                    default:
                                        Drawable[] drawableArr14 = PhotoViewer.d9;
                                        ArrayList arrayList3 = photoViewer13.i1;
                                        if (arrayList3 != null) {
                                            arrayList3.remove(hg5Var2);
                                        }
                                        ArrayList arrayList4 = photoViewer13.j1;
                                        if (arrayList4 != null) {
                                            arrayList4.remove(hg5Var2);
                                            break;
                                        }
                                        break;
                                }
                            }
                        };
                        if (photoViewer12.i1 == null) {
                            photoViewer12.i1 = new ArrayList();
                        }
                        photoViewer12.f0.addView(hg5Var, qoe.e(-1, nm7.d3, 83));
                        photoViewer12.i1.add(hg5Var);
                        hg5Var.v();
                    }
                    photoViewer12.J2();
                    photoViewer12.P2();
                    if (photoViewer12.r) {
                        CheckBox checkBox = photoViewer12.O0;
                        if (!checkBox.y) {
                            checkBox.callOnClick();
                            break;
                        }
                    }
                    Object obj3 = photoViewer12.f7.get(photoViewer12.O4);
                    if (obj3 instanceof co6) {
                        ((co6) obj3).s = photoViewer12.l0();
                        break;
                    }
                }
                break;
            case 12:
                final PhotoViewer photoViewer13 = this.b;
                Drawable[] drawableArr13 = PhotoViewer.d9;
                boolean U0 = photoViewer13.U0();
                boolean z = !U0;
                int i4 = photoViewer13.O4;
                if (i4 >= 0 && i4 < photoViewer13.f7.size()) {
                    Object obj4 = photoViewer13.f7.get(photoViewer13.O4);
                    if (obj4 instanceof jo6) {
                        ((jo6) obj4).O = Boolean.valueOf(z);
                        SharedPreferences.Editor edit = a.b.getSharedPreferences("mainconfig", 0).edit();
                        gda.e1 = U0;
                        edit.putBoolean("photoLiveDefault", U0).apply();
                        pb8 pb8Var2 = photoViewer13.d;
                        if (pb8Var2 != null) {
                            pb8Var2.m();
                        }
                    }
                }
                photoViewer13.g1.a(!photoViewer13.U0(), true);
                photoViewer13.X7.animate().alpha(photoViewer13.U0() ? 0.45f : 1.0f).start();
                if (photoViewer13.U0() && (ndcVar = photoViewer13.G2) != null) {
                    ndcVar.f0();
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
                    ((hg5) obj5).f(true);
                }
                final hg5 hg5Var2 = new hg5(photoViewer13.E, 3);
                hg5Var2.t(gm.S2(jb6.M0(photoViewer13.U0() ? 2131748593 : 2131748592, null)));
                hg5Var2.setPadding(gm.L(6.0f), 0, gm.L(6.0f), gm.L(6.0f));
                hg5Var2.n(0.0f, 28.0f);
                final char c2 = c == true ? 1 : 0;
                hg5Var2.r0 = new Runnable() { // from class: l88
                    @Override // java.lang.Runnable
                    public final void run() {
                        byte b5 = c2;
                        hg5 hg5Var22 = hg5Var2;
                        PhotoViewer photoViewer132 = photoViewer13;
                        switch (b5) {
                            case 0:
                                Drawable[] drawableArr132 = PhotoViewer.d9;
                                ArrayList arrayList22 = photoViewer132.i1;
                                if (arrayList22 != null) {
                                    arrayList22.remove(hg5Var22);
                                    break;
                                }
                                break;
                            default:
                                Drawable[] drawableArr14 = PhotoViewer.d9;
                                ArrayList arrayList3 = photoViewer132.i1;
                                if (arrayList3 != null) {
                                    arrayList3.remove(hg5Var22);
                                }
                                ArrayList arrayList4 = photoViewer132.j1;
                                if (arrayList4 != null) {
                                    arrayList4.remove(hg5Var22);
                                    break;
                                }
                                break;
                        }
                    }
                };
                photoViewer13.f0.addView(hg5Var2, qoe.e(-1, nm7.d3, 83));
                photoViewer13.i1.add(hg5Var2);
                photoViewer13.j1.add(hg5Var2);
                hg5Var2.v();
                break;
            case 13:
                PhotoViewer photoViewer14 = this.b;
                Drawable[] drawableArr14 = PhotoViewer.d9;
                if (photoViewer14.d != null && !photoViewer14.K0()) {
                    photoViewer14.d.n();
                    photoViewer14.A(true, false);
                    break;
                }
                break;
            case 14:
                PhotoViewer photoViewer15 = this.b;
                Drawable[] drawableArr15 = PhotoViewer.d9;
                if (photoViewer15.d != null && !photoViewer15.K0()) {
                    photoViewer15.d.n();
                    photoViewer15.A(true, false);
                    break;
                }
                break;
            case 15:
                PhotoViewer photoViewer16 = this.b;
                Drawable[] drawableArr16 = PhotoViewer.d9;
                ArrayList arrayList3 = photoViewer16.f7;
                if (!photoViewer16.A7) {
                    db8 db8Var = photoViewer16.s5;
                    if (!db8Var.R && db8Var.o0 != 1 && (i2 = photoViewer16.O4) >= 0 && i2 < arrayList3.size() && !photoViewer16.o5.W) {
                        co6 co6Var = (co6) arrayList3.get(photoViewer16.O4);
                        boolean isEmpty = TextUtils.isEmpty(co6Var.i);
                        boolean z2 = !isEmpty;
                        db8 db8Var2 = photoViewer16.s5;
                        byte b5 = db8Var2.o0;
                        if (b5 != 0) {
                            if (b5 != 2) {
                                photoViewer16.o5.k();
                                photoViewer16.o5.getThanosEffect();
                                n1b n1bVar = photoViewer16.o5;
                                n1bVar.M = false;
                                n1bVar.F = null;
                                ImageReceiver imageReceiver = photoViewer16.B4;
                                if (isEmpty || (bitmap = n1bVar.L) == null) {
                                    bitmap = n1bVar.J;
                                }
                                imageReceiver.f0(bitmap);
                                photoViewer16.s5.setCutOutState(true);
                                photoViewer16.g2(false, true);
                                photoViewer16.e();
                                break;
                            } else {
                                db8Var2.setCutOutState(true);
                                photoViewer16.g2(false, true);
                                photoViewer16.o5.f();
                                photoViewer16.f0.invalidate();
                                break;
                            }
                        } else {
                            db8Var2.setCancelState(true);
                            n1b n1bVar2 = photoViewer16.o5;
                            z52 z52Var = new z52(photoViewer16, z2, co6Var, b3);
                            n1bVar2.getClass();
                            n1bVar2.setOnClickListener(new r39(n1bVar2, z52Var, (byte) 21));
                            TextView textView = n1bVar2.N;
                            textView.setText(jb6.M0(2131745409, null));
                            textView.animate().cancel();
                            textView.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(240L).setInterpolator(d53.h).start();
                            ValueAnimator valueAnimator = n1bVar2.O;
                            if (valueAnimator != null) {
                                valueAnimator.cancel();
                            }
                            n1bVar2.R = n1bVar2.S;
                            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                            n1bVar2.O = ofFloat;
                            ofFloat.addUpdateListener(new rha(n1bVar2, (byte) 13));
                            n1bVar2.O.setRepeatCount(-1);
                            n1bVar2.O.setRepeatMode(1);
                            n1bVar2.O.setDuration(2400L);
                            n1bVar2.O.setInterpolator(new LinearInterpolator());
                            n1bVar2.O.start();
                            photoViewer16.f0.invalidate();
                            break;
                        }
                    }
                }
                break;
            case 16:
                PhotoViewer photoViewer17 = this.b;
                Drawable[] drawableArr17 = PhotoViewer.d9;
                photoViewer17.u5.m(true, true);
                photoViewer17.v5.m(false, true);
                n1b n1bVar3 = photoViewer17.o5;
                if (n1bVar3 != null) {
                    n1bVar3.setOutlineVisible(false);
                }
                photoViewer17.N1 = true;
                ra8 ra8Var = photoViewer17.O1;
                if (ra8Var != null) {
                    ra8Var.setEraser(true);
                }
                photoViewer17.o2(4);
                break;
            case 17:
                PhotoViewer photoViewer18 = this.b;
                Drawable[] drawableArr18 = PhotoViewer.d9;
                photoViewer18.u5.m(false, true);
                photoViewer18.v5.m(true, true);
                n1b n1bVar4 = photoViewer18.o5;
                if (n1bVar4 != null) {
                    n1bVar4.setOutlineVisible(false);
                }
                photoViewer18.N1 = false;
                ra8 ra8Var2 = photoViewer18.O1;
                if (ra8Var2 != null) {
                    ra8Var2.setEraser(false);
                }
                photoViewer18.o2(4);
                break;
            case 18:
                PhotoViewer photoViewer19 = this.b;
                Drawable[] drawableArr19 = PhotoViewer.d9;
                ra8 ra8Var3 = photoViewer19.O1;
                if (ra8Var3 != null) {
                    b7c b7cVar = ra8Var3.b;
                    if (b7cVar.a()) {
                        b7cVar.c();
                        break;
                    }
                }
                photoViewer19.o2(0);
                photoViewer19.o5.k();
                boolean isEmpty2 = TextUtils.isEmpty(((co6) photoViewer19.f7.get(photoViewer19.O4)).i);
                n1b n1bVar5 = photoViewer19.o5;
                if (n1bVar5 != null && !n1bVar5.H) {
                    n1bVar5.M = false;
                    n1bVar5.F = null;
                }
                ImageReceiver imageReceiver2 = photoViewer19.B4;
                if (isEmpty2 || (bitmap2 = n1bVar5.L) == null) {
                    bitmap2 = n1bVar5.J;
                }
                imageReceiver2.f0(bitmap2);
                n1b n1bVar6 = photoViewer19.o5;
                if (n1bVar6 == null || !n1bVar6.H) {
                    photoViewer19.s5.setCutOutState(true);
                }
                photoViewer19.k2(true, true);
                break;
            case 19:
                PhotoViewer photoViewer20 = this.b;
                Drawable[] drawableArr20 = PhotoViewer.d9;
                if (photoViewer20.o5 != null) {
                    photoViewer20.x5.m(!r14.u0, true);
                    photoViewer20.o5.setOutlineVisible((!photoViewer20.x5.u0 || photoViewer20.u5.u0 || photoViewer20.v5.u0) ? false : true);
                    break;
                }
                break;
            case 20:
                PhotoViewer photoViewer21 = this.b;
                Drawable[] drawableArr21 = PhotoViewer.d9;
                yv1 yv1Var = photoViewer21.k4;
                if (yv1Var != null && (k47Var = yv1Var.H5) != null && k47Var.o5() && !sd2.z(photoViewer21.U, 24, k47.B0(photoViewer21.k4.H5.k))) {
                    if (photoViewer21.l4 == null || (b = photoViewer21.k4.y5) == null) {
                        b = v67.b(photoViewer21.k4.H5.k.suggested_post);
                    }
                    if (!jva.Q(photoViewer21.U, b.a)) {
                        yv1 yv1Var2 = photoViewer21.k4;
                        if (yv1Var2 != null) {
                            yv1Var2.wc(b);
                            break;
                        }
                    }
                }
                if (!photoViewer21.V1.o()) {
                    yv1 yv1Var3 = photoViewer21.k4;
                    if (yv1Var3 == null || !yv1Var3.X7() || ((e51Var = photoViewer21.k4.Y1) != null && e51Var.E3 != null)) {
                        photoViewer21.F1(true, 0, 0, false, false, false);
                        break;
                    } else {
                        photoViewer21.i2();
                        break;
                    }
                } else {
                    io ioVar = photoViewer21.V1.w;
                    float f = -photoViewer21.X1;
                    photoViewer21.X1 = f;
                    gm.A3(f, ioVar, null);
                    xx0.E.a();
                    if (!oc7.r1(photoViewer21.U).H3() && oc7.r1(photoViewer21.U).l4.h1.f() > photoViewer21.V1.getCodePointCount()) {
                        photoViewer21.c2(photoViewer21.f0);
                        break;
                    }
                }
                break;
            case 21:
                PhotoViewer photoViewer22 = this.b;
                Drawable[] drawableArr22 = PhotoViewer.d9;
                photoViewer22.a.a(false, true);
                break;
            case 22:
                PhotoViewer photoViewer23 = this.b;
                Drawable[] drawableArr23 = PhotoViewer.d9;
                if (photoViewer23.E != null && (pb8Var = photoViewer23.d) != null) {
                    pb8Var.X();
                    photoViewer23.A(true, false);
                    break;
                }
                break;
            case 23:
                PhotoViewer photoViewer24 = this.b;
                Drawable[] drawableArr24 = PhotoViewer.d9;
                photoViewer24.l();
                if (!photoViewer24.K0()) {
                    if (photoViewer24.s1) {
                        if (photoViewer24.p8) {
                            TextureView textureView = photoViewer24.C2;
                            if (textureView instanceof ncc) {
                                ncc nccVar = (ncc) textureView;
                                if (nccVar.getVideoWidth() <= 0 || nccVar.getVideoHeight() <= 0) {
                                }
                            }
                        }
                    }
                    photoViewer24.o2(1);
                    break;
                }
                break;
            case 24:
                PhotoViewer photoViewer25 = this.b;
                Drawable[] drawableArr25 = PhotoViewer.d9;
                photoViewer25.K(-90.0f, false, null);
                break;
            case 25:
                PhotoViewer photoViewer26 = this.b;
                Drawable[] drawableArr26 = PhotoViewer.d9;
                photoViewer26.J();
                break;
            case 26:
                PhotoViewer photoViewer27 = this.b;
                Drawable[] drawableArr27 = PhotoViewer.d9;
                photoViewer27.l();
                if (!photoViewer27.K0()) {
                    if (photoViewer27.s1) {
                        if (photoViewer27.p8) {
                            TextureView textureView2 = photoViewer27.C2;
                            if (textureView2 instanceof ncc) {
                                ncc nccVar2 = (ncc) textureView2;
                                if (nccVar2.getVideoWidth() <= 0 || nccVar2.getVideoHeight() <= 0) {
                                }
                            }
                        }
                    }
                    photoViewer27.o2(3);
                    break;
                }
                break;
            case 27:
                PhotoViewer photoViewer28 = this.b;
                Drawable[] drawableArr28 = PhotoViewer.d9;
                if (view.getAlpha() >= 0.9f) {
                    photoViewer28.l();
                    if (!photoViewer28.K0()) {
                        if (photoViewer28.s1) {
                            if (photoViewer28.p8) {
                                TextureView textureView3 = photoViewer28.C2;
                                if (textureView3 instanceof ncc) {
                                    ncc nccVar3 = (ncc) textureView3;
                                    if (nccVar3.getVideoWidth() <= 0 || nccVar3.getVideoHeight() <= 0) {
                                    }
                                }
                            }
                        }
                        photoViewer28.o2(2);
                        break;
                    }
                }
                break;
            case 28:
                PhotoViewer photoViewer29 = this.b;
                Drawable[] drawableArr29 = PhotoViewer.d9;
                if (photoViewer29.o6 == null) {
                    n88 n88Var = new n88(photoViewer29, b2);
                    if (!photoViewer29.J2) {
                        float stateOrientation = photoViewer29.R2 - photoViewer29.D1.b.getStateOrientation();
                        if (Math.abs(stateOrientation) > 180.0f) {
                            stateOrientation = stateOrientation < 0.0f ? stateOrientation + 360.0f : -(360.0f - stateOrientation);
                        }
                        photoViewer29.K(stateOrientation, photoViewer29.D1.b.getStateMirror(), n88Var);
                        break;
                    } else {
                        n88Var.run();
                        break;
                    }
                }
                break;
            default:
                PhotoViewer photoViewer30 = this.b;
                Drawable[] drawableArr30 = PhotoViewer.d9;
                if (photoViewer30.t4 == 1) {
                    u43 u43Var = photoViewer30.D1.b;
                    g43 g43Var = u43Var.H;
                    if (g43Var.a.isInProgress() || g43Var.h || u43Var.a.f0) {
                    }
                }
                photoViewer30.e();
                photoViewer30.o2(0);
                break;
        }
    }
}
