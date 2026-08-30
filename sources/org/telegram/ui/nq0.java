package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.TextureView;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessageSuggestionParams;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.CheckBox;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class nq0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ PhotoViewer b;

    public /* synthetic */ nq0(PhotoViewer photoViewer, int i10) {
        this.a = i10;
        this.b = photoViewer;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i10;
        org.telegram.ui.Components.i71 i71Var;
        int i11;
        Bitmap bitmap;
        Bitmap bitmap2;
        nh.t2 t2Var;
        MessageObject messageObject;
        MessageSuggestionParams of2;
        hu0 hu0Var;
        int i12 = 2;
        char c3 = 1;
        final int i13 = 0;
        switch (this.a) {
            case 0:
                PhotoViewer photoViewer = this.b;
                Drawable[] drawableArr = PhotoViewer.Q8;
                photoViewer.m0();
                photoViewer.e3(0);
                break;
            case 1:
                PhotoViewer photoViewer2 = this.b;
                if (!photoViewer2.F1.d()) {
                    photoViewer2.e3(0);
                    break;
                } else {
                    Activity activity = photoViewer2.y;
                    if (activity != null) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity, 0, photoViewer2.s2);
                        alertDialog$Builder.a.Q = LocaleController.getString("DiscardChanges", R.string.DiscardChanges);
                        alertDialog$Builder.a.O = LocaleController.getString("AppName", R.string.AppName);
                        alertDialog$Builder.k(LocaleController.getString("OK", R.string.OK), new uq0(photoViewer2));
                        alertDialog$Builder.h(LocaleController.getString("Cancel", R.string.Cancel), null);
                        photoViewer2.S2(alertDialog$Builder);
                        break;
                    }
                }
                break;
            case 2:
                PhotoViewer photoViewer3 = this.b;
                photoViewer3.U7 = photoViewer3.W7;
                photoViewer3.R0();
                photoViewer3.Y2(false);
                photoViewer3.p2(2);
                break;
            case 3:
                PhotoViewer photoViewer4 = this.b;
                Object obj = photoViewer4.d7.get(photoViewer4.M4);
                if (obj instanceof MediaController.MediaEditState) {
                    ((MediaController.MediaEditState) obj).editedInfo = photoViewer4.n1();
                }
                photoViewer4.Y2(false);
                photoViewer4.p2(2);
                break;
            case 4:
                PhotoViewer photoViewer5 = this.b;
                Drawable[] drawableArr2 = PhotoViewer.Q8;
                photoViewer5.w2(false, 0, 0, false, false, false);
                break;
            case 5:
                PhotoViewer photoViewer6 = this.b;
                photoViewer6.s5.m(false, true);
                photoViewer6.t5.m(false, true);
                photoViewer6.e3(0);
                break;
            case 6:
                PhotoViewer photoViewer7 = this.b;
                photoViewer7.s5.m(false, true);
                photoViewer7.t5.m(false, true);
                photoViewer7.m0();
                photoViewer7.e3(0);
                break;
            case 7:
                PhotoViewer photoViewer8 = this.b;
                Drawable[] drawableArr3 = PhotoViewer.Q8;
                photoViewer8.e3(5);
                break;
            case 8:
                PhotoViewer photoViewer9 = this.b;
                Drawable[] drawableArr4 = PhotoViewer.Q8;
                photoViewer9.F0();
                break;
            case 9:
                PhotoViewer photoViewer10 = this.b;
                if (!photoViewer10.n5.b.K && (i10 = photoViewer10.M4) >= 0 && i10 < photoViewer10.d7.size() && (photoViewer10.d7.get(photoViewer10.M4) instanceof MediaController.PhotoEntry)) {
                    MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) photoViewer10.d7.get(photoViewer10.M4);
                    long time = photoViewer10.n5.getTime();
                    String y12 = PhotoViewer.y1();
                    photoViewer10.n5.b.setLoading(true);
                    Utilities.globalQueue.postRunnable(new org.telegram.messenger.ci(photoViewer10, y12, photoEntry, time, 10));
                    break;
                }
                break;
            case 10:
                final PhotoViewer photoViewer11 = this.b;
                Drawable[] drawableArr5 = PhotoViewer.Q8;
                if (!photoViewer11.H1()) {
                    photoViewer11.r = !photoViewer11.r;
                    ArrayList arrayList = photoViewer11.e1;
                    if (arrayList != null) {
                        int size = arrayList.size();
                        int i14 = 0;
                        while (i14 < size) {
                            Object obj2 = arrayList.get(i14);
                            i14++;
                            ((ph.f3) obj2).e(true);
                        }
                    }
                    if (photoViewer11.r) {
                        final ph.f3 f3Var = new ph.f3(photoViewer11.y, 3);
                        f3Var.q(true);
                        f3Var.t(LocaleController.getString(R.string.EditorMuteHint));
                        f3Var.h = ph.f3.a(f3Var.getText(), f3Var.getTextPaint());
                        f3Var.setPadding(AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(6.0f), 0);
                        f3Var.m(0.0f, 22.0f);
                        f3Var.i0 = new Runnable() { // from class: org.telegram.ui.rq0
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i13) {
                                    case 0:
                                        ArrayList arrayList2 = photoViewer11.e1;
                                        if (arrayList2 != null) {
                                            arrayList2.remove(f3Var);
                                            break;
                                        }
                                        break;
                                    default:
                                        PhotoViewer photoViewer12 = photoViewer11;
                                        ArrayList arrayList3 = photoViewer12.e1;
                                        ph.f3 f3Var2 = f3Var;
                                        if (arrayList3 != null) {
                                            arrayList3.remove(f3Var2);
                                        }
                                        ArrayList arrayList4 = photoViewer12.f1;
                                        if (arrayList4 != null) {
                                            arrayList4.remove(f3Var2);
                                            break;
                                        }
                                        break;
                                }
                            }
                        };
                        if (photoViewer11.e1 == null) {
                            photoViewer11.e1 = new ArrayList();
                        }
                        photoViewer11.b0.addView(f3Var, k7.b6.e(-1, 200, 83));
                        photoViewer11.e1.add(f3Var);
                        f3Var.v();
                    }
                    photoViewer11.x3();
                    photoViewer11.B3();
                    if (photoViewer11.r) {
                        CheckBox checkBox = photoViewer11.K0;
                        if (!checkBox.x) {
                            checkBox.callOnClick();
                            break;
                        }
                    }
                    Object obj3 = photoViewer11.d7.get(photoViewer11.M4);
                    if (obj3 instanceof MediaController.MediaEditState) {
                        ((MediaController.MediaEditState) obj3).editedInfo = photoViewer11.n1();
                        break;
                    }
                }
                break;
            case 11:
                final PhotoViewer photoViewer12 = this.b;
                Drawable[] drawableArr6 = PhotoViewer.Q8;
                boolean P1 = photoViewer12.P1();
                boolean z4 = !P1;
                int i15 = photoViewer12.M4;
                if (i15 >= 0 && i15 < photoViewer12.d7.size()) {
                    Object obj4 = photoViewer12.d7.get(photoViewer12.M4);
                    if (obj4 instanceof MediaController.PhotoEntry) {
                        ((MediaController.PhotoEntry) obj4).discardLivePhoto = Boolean.valueOf(z4);
                        SharedPreferences.Editor edit = ApplicationLoader.applicationContext.getSharedPreferences("mainconfig", 0).edit();
                        SharedConfig.photoLiveDefault = P1;
                        edit.putBoolean("photoLiveDefault", P1).apply();
                        hu0 hu0Var2 = photoViewer12.d;
                        if (hu0Var2 != null) {
                            hu0Var2.m();
                        }
                    }
                }
                photoViewer12.c1.a(!photoViewer12.P1(), true);
                photoViewer12.O7.animate().alpha(photoViewer12.P1() ? 0.45f : 1.0f).start();
                if (photoViewer12.P1() && (i71Var = photoViewer12.C2) != null) {
                    i71Var.B();
                }
                photoViewer12.b0.invalidate();
                if (photoViewer12.e1 == null) {
                    photoViewer12.e1 = new ArrayList();
                }
                if (photoViewer12.f1 == null) {
                    photoViewer12.f1 = new ArrayList();
                }
                ArrayList arrayList2 = photoViewer12.e1;
                int size2 = arrayList2.size();
                int i16 = 0;
                while (i16 < size2) {
                    Object obj5 = arrayList2.get(i16);
                    i16++;
                    ((ph.f3) obj5).e(true);
                }
                final ph.f3 f3Var2 = new ph.f3(photoViewer12.y, 3);
                f3Var2.t(AndroidUtilities.replaceTags(LocaleController.getString(photoViewer12.P1() ? R.string.LivePhotoOff : R.string.LivePhotoOn)));
                f3Var2.setPadding(AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f));
                f3Var2.m(0.0f, 28.0f);
                final char c10 = c3 == true ? 1 : 0;
                f3Var2.i0 = new Runnable() { // from class: org.telegram.ui.rq0
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (c10) {
                            case 0:
                                ArrayList arrayList22 = photoViewer12.e1;
                                if (arrayList22 != null) {
                                    arrayList22.remove(f3Var2);
                                    break;
                                }
                                break;
                            default:
                                PhotoViewer photoViewer122 = photoViewer12;
                                ArrayList arrayList3 = photoViewer122.e1;
                                ph.f3 f3Var22 = f3Var2;
                                if (arrayList3 != null) {
                                    arrayList3.remove(f3Var22);
                                }
                                ArrayList arrayList4 = photoViewer122.f1;
                                if (arrayList4 != null) {
                                    arrayList4.remove(f3Var22);
                                    break;
                                }
                                break;
                        }
                    }
                };
                photoViewer12.b0.addView(f3Var2, k7.b6.e(-1, 200, 83));
                photoViewer12.e1.add(f3Var2);
                photoViewer12.f1.add(f3Var2);
                f3Var2.v();
                break;
            case 12:
                PhotoViewer photoViewer13 = this.b;
                if (photoViewer13.d != null && !photoViewer13.H1()) {
                    photoViewer13.d.n();
                    photoViewer13.G0(true, false);
                    break;
                }
                break;
            case 13:
                PhotoViewer photoViewer14 = this.b;
                if (photoViewer14.d != null && !photoViewer14.H1()) {
                    photoViewer14.d.n();
                    photoViewer14.G0(true, false);
                    break;
                }
                break;
            case 14:
                PhotoViewer photoViewer15 = this.b;
                ArrayList arrayList3 = photoViewer15.d7;
                if (!photoViewer15.s7) {
                    st0 st0Var = photoViewer15.q5;
                    if (!st0Var.K && st0Var.g0 != 1 && (i11 = photoViewer15.M4) >= 0 && i11 < arrayList3.size() && !photoViewer15.m5.S) {
                        MediaController.MediaEditState mediaEditState = (MediaController.MediaEditState) arrayList3.get(photoViewer15.M4);
                        boolean isEmpty = TextUtils.isEmpty(mediaEditState.filterPath);
                        boolean z10 = !isEmpty;
                        st0 st0Var2 = photoViewer15.q5;
                        int i17 = st0Var2.g0;
                        if (i17 != 0) {
                            if (i17 != 2) {
                                photoViewer15.m5.l();
                                photoViewer15.m5.getThanosEffect();
                                dg.q3 q3Var = photoViewer15.m5;
                                q3Var.I = false;
                                q3Var.B = null;
                                ImageReceiver imageReceiver = photoViewer15.z4;
                                if (isEmpty || (bitmap = q3Var.H) == null) {
                                    bitmap = q3Var.F;
                                }
                                imageReceiver.setImageBitmap(bitmap);
                                photoViewer15.q5.setCutOutState(true);
                                photoViewer15.X2(false, true);
                                photoViewer15.m0();
                                break;
                            } else {
                                st0Var2.setCutOutState(true);
                                photoViewer15.X2(false, true);
                                photoViewer15.m5.f();
                                photoViewer15.b0.invalidate();
                                break;
                            }
                        } else {
                            st0Var2.setCancelState(true);
                            dg.q3 q3Var2 = photoViewer15.m5;
                            org.telegram.ui.Components.ll llVar = new org.telegram.ui.Components.ll(photoViewer15, z10, mediaEditState, i12);
                            q3Var2.getClass();
                            q3Var2.setOnClickListener(new cg.n(1, q3Var2, llVar));
                            TextView textView = q3Var2.J;
                            textView.setText(LocaleController.getString(R.string.SegmentationTabToCrop));
                            textView.animate().cancel();
                            textView.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(240L).setInterpolator(org.telegram.ui.Components.nr.h).start();
                            ValueAnimator valueAnimator = q3Var2.K;
                            if (valueAnimator != null) {
                                valueAnimator.cancel();
                            }
                            q3Var2.N = q3Var2.O;
                            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                            q3Var2.K = ofFloat;
                            ofFloat.addUpdateListener(new dg.o1(q3Var2, 4));
                            q3Var2.K.setRepeatCount(-1);
                            q3Var2.K.setRepeatMode(1);
                            q3Var2.K.setDuration(2400L);
                            q3Var2.K.setInterpolator(new LinearInterpolator());
                            q3Var2.K.start();
                            photoViewer15.b0.invalidate();
                            break;
                        }
                    }
                }
                break;
            case 15:
                PhotoViewer photoViewer16 = this.b;
                photoViewer16.s5.m(true, true);
                photoViewer16.t5.m(false, true);
                dg.q3 q3Var3 = photoViewer16.m5;
                if (q3Var3 != null) {
                    q3Var3.setOutlineVisible(false);
                }
                photoViewer16.J1 = true;
                et0 et0Var = photoViewer16.K1;
                if (et0Var != null) {
                    et0Var.setEraser(true);
                }
                photoViewer16.e3(4);
                break;
            case 16:
                PhotoViewer photoViewer17 = this.b;
                photoViewer17.s5.m(false, true);
                photoViewer17.t5.m(true, true);
                dg.q3 q3Var4 = photoViewer17.m5;
                if (q3Var4 != null) {
                    q3Var4.setOutlineVisible(false);
                }
                photoViewer17.J1 = false;
                et0 et0Var2 = photoViewer17.K1;
                if (et0Var2 != null) {
                    et0Var2.setEraser(false);
                }
                photoViewer17.e3(4);
                break;
            case 17:
                PhotoViewer photoViewer18 = this.b;
                et0 et0Var3 = photoViewer18.K1;
                if (et0Var3 != null) {
                    cg.i2 i2Var = et0Var3.b;
                    if (i2Var.a()) {
                        i2Var.c();
                        break;
                    }
                }
                photoViewer18.e3(0);
                photoViewer18.m5.l();
                boolean isEmpty2 = TextUtils.isEmpty(((MediaController.MediaEditState) photoViewer18.d7.get(photoViewer18.M4)).filterPath);
                dg.q3 q3Var5 = photoViewer18.m5;
                if (q3Var5 != null && !q3Var5.D) {
                    q3Var5.I = false;
                    q3Var5.B = null;
                }
                ImageReceiver imageReceiver2 = photoViewer18.z4;
                if (isEmpty2 || (bitmap2 = q3Var5.H) == null) {
                    bitmap2 = q3Var5.F;
                }
                imageReceiver2.setImageBitmap(bitmap2);
                dg.q3 q3Var6 = photoViewer18.m5;
                if (q3Var6 == null || !q3Var6.D) {
                    photoViewer18.q5.setCutOutState(true);
                }
                photoViewer18.a3(true, true);
                break;
            case 18:
                PhotoViewer photoViewer19 = this.b;
                if (photoViewer19.m5 != null) {
                    photoViewer19.v5.m(!r2.m0, true);
                    photoViewer19.m5.setOutlineVisible((!photoViewer19.v5.m0 || photoViewer19.s5.m0 || photoViewer19.t5.m0) ? false : true);
                    break;
                }
                break;
            case 19:
                PhotoViewer photoViewer20 = this.b;
                xn xnVar = photoViewer20.i4;
                if (xnVar != null && (messageObject = xnVar.m5) != null && messageObject.needResendWhenEdit() && !ChatObject.canManageMonoForum(photoViewer20.Q, photoViewer20.i4.m5.getDialogId())) {
                    if (photoViewer20.j4 == null || (of2 = photoViewer20.i4.d5) == null) {
                        of2 = MessageSuggestionParams.of(photoViewer20.i4.m5.messageOwner.suggested_post);
                    }
                    if (!lh.t7.U(photoViewer20.Q, of2.amount)) {
                        xn xnVar2 = photoViewer20.i4;
                        if (xnVar2 != null) {
                            xnVar2.Tb(of2);
                            break;
                        }
                    }
                }
                if (!photoViewer20.R1.o()) {
                    xn xnVar3 = photoViewer20.i4;
                    if (xnVar3 == null || !xnVar3.c() || ((t2Var = photoViewer20.i4.G1) != null && t2Var.E1 != null)) {
                        photoViewer20.w2(true, 0, 0, false, false, false);
                        break;
                    } else {
                        photoViewer20.Z2();
                        break;
                    }
                } else {
                    org.telegram.ui.Components.k6 k6Var = photoViewer20.R1.v;
                    float f10 = -photoViewer20.T1;
                    photoViewer20.T1 = f10;
                    AndroidUtilities.shakeViewSpring(k6Var, f10);
                    BotWebViewVibrationEffect.APP_ERROR.vibrate();
                    if (!MessagesController.getInstance(photoViewer20.Q).premiumFeaturesBlocked() && MessagesController.getInstance(photoViewer20.Q).captionLengthLimitPremium > photoViewer20.R1.getCodePointCount()) {
                        photoViewer20.T2(photoViewer20.b0);
                        break;
                    }
                }
                break;
            case 20:
                this.b.a.a(false, true);
                break;
            case 21:
                PhotoViewer photoViewer21 = this.b;
                if (photoViewer21.y != null && (hu0Var = photoViewer21.d) != null) {
                    hu0Var.V();
                    photoViewer21.G0(true, false);
                    break;
                }
                break;
            case 22:
                PhotoViewer photoViewer22 = this.b;
                Drawable[] drawableArr7 = PhotoViewer.Q8;
                photoViewer22.t0();
                if (!photoViewer22.H1()) {
                    if (photoViewer22.o1) {
                        if (photoViewer22.g8) {
                            TextureView textureView = photoViewer22.y2;
                            if (textureView instanceof org.telegram.ui.Components.w61) {
                                org.telegram.ui.Components.w61 w61Var = (org.telegram.ui.Components.w61) textureView;
                                if (w61Var.getVideoWidth() <= 0 || w61Var.getVideoHeight() <= 0) {
                                }
                            }
                        }
                    }
                    photoViewer22.e3(1);
                    break;
                }
                break;
            case 23:
                PhotoViewer photoViewer23 = this.b;
                Drawable[] drawableArr8 = PhotoViewer.Q8;
                photoViewer23.O0(-90.0f, false, null);
                break;
            case 24:
                PhotoViewer photoViewer24 = this.b;
                Drawable[] drawableArr9 = PhotoViewer.Q8;
                photoViewer24.N0();
                break;
            case 25:
                PhotoViewer photoViewer25 = this.b;
                Drawable[] drawableArr10 = PhotoViewer.Q8;
                photoViewer25.t0();
                if (!photoViewer25.H1()) {
                    if (photoViewer25.o1) {
                        if (photoViewer25.g8) {
                            TextureView textureView2 = photoViewer25.y2;
                            if (textureView2 instanceof org.telegram.ui.Components.w61) {
                                org.telegram.ui.Components.w61 w61Var2 = (org.telegram.ui.Components.w61) textureView2;
                                if (w61Var2.getVideoWidth() <= 0 || w61Var2.getVideoHeight() <= 0) {
                                }
                            }
                        }
                    }
                    photoViewer25.e3(3);
                    break;
                }
                break;
            case 26:
                PhotoViewer photoViewer26 = this.b;
                Drawable[] drawableArr11 = PhotoViewer.Q8;
                if (view.getAlpha() >= 0.9f) {
                    photoViewer26.t0();
                    if (!photoViewer26.H1()) {
                        if (photoViewer26.o1) {
                            if (photoViewer26.g8) {
                                TextureView textureView3 = photoViewer26.y2;
                                if (textureView3 instanceof org.telegram.ui.Components.w61) {
                                    org.telegram.ui.Components.w61 w61Var3 = (org.telegram.ui.Components.w61) textureView3;
                                    if (w61Var3.getVideoWidth() <= 0 || w61Var3.getVideoHeight() <= 0) {
                                    }
                                }
                            }
                        }
                        photoViewer26.e3(2);
                        break;
                    }
                }
                break;
            case 27:
                PhotoViewer photoViewer27 = this.b;
                if (photoViewer27.m6 == null) {
                    mq0 mq0Var = new mq0(photoViewer27, 29);
                    if (!photoViewer27.G2) {
                        float stateOrientation = photoViewer27.O2 - photoViewer27.z1.b.getStateOrientation();
                        if (Math.abs(stateOrientation) > 180.0f) {
                            stateOrientation = stateOrientation < 0.0f ? stateOrientation + 360.0f : -(360.0f - stateOrientation);
                        }
                        photoViewer27.O0(stateOrientation, photoViewer27.z1.b.getStateMirror(), mq0Var);
                        break;
                    } else {
                        mq0Var.run();
                        break;
                    }
                }
                break;
            case 28:
                PhotoViewer photoViewer28 = this.b;
                if (photoViewer28.r4 == 1) {
                    yf.n nVar = photoViewer28.z1.b;
                    yf.b bVar = nVar.D;
                    if (bVar.a.isInProgress() || bVar.h || nVar.a.b0) {
                    }
                }
                photoViewer28.m0();
                photoViewer28.e3(0);
                break;
            default:
                PhotoViewer photoViewer29 = this.b;
                float f11 = -photoViewer29.z1.b.getStateOrientation();
                if (Math.abs(f11) > 180.0f) {
                    f11 = f11 < 0.0f ? f11 + 360.0f : -(360.0f - f11);
                }
                photoViewer29.O0(f11, photoViewer29.z1.b.getStateMirror(), new mq0(photoViewer29, 8));
                break;
        }
    }
}
