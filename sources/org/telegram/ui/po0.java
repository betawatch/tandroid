package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.view.TextureView;
import android.widget.ImageView;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class po0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ PhotoViewer b;

    public /* synthetic */ po0(PhotoViewer photoViewer, int i3) {
        this.a = i3;
        this.b = photoViewer;
    }

    @Override // java.lang.Runnable
    public final void run() {
        float f10;
        tp0 tp0Var;
        switch (this.a) {
            case 0:
                PhotoViewer photoViewer = this.b;
                if (photoViewer.m3 && photoViewer.Q3 && !org.telegram.messenger.t0.x) {
                    org.telegram.ui.ActionBar.q0 q0Var = this.b.p0;
                    if (q0Var == null || !q0Var.x()) {
                        org.telegram.ui.ActionBar.q0 q0Var2 = this.b.q0;
                        if (q0Var2 == null || !q0Var2.x()) {
                            mp0 mp0Var = this.b.U1;
                            if (mp0Var == null || mp0Var.getScrollY() == 0) {
                                yc ycVar = this.b.Y0;
                                if (ycVar == null || ycVar.getVisibility() != 0) {
                                    PhotoViewer photoViewer2 = PhotoViewer.c9;
                                    PhotoViewer photoViewer3 = this.b;
                                    if (photoViewer2 != photoViewer3) {
                                        photoViewer3.m3(false, true);
                                        break;
                                    }
                                }
                            }
                        }
                    }
                }
                break;
            case 1:
                PhotoViewer photoViewer4 = this.b;
                if (photoViewer4.G2 != null || ((tp0Var = photoViewer4.g0) != null && tp0Var.y)) {
                    if (!photoViewer4.s1) {
                        float q12 = photoViewer4.q1() / this.b.C1();
                        if (this.b.i5) {
                            f10 = 1.0f;
                        } else {
                            long elapsedRealtime = SystemClock.elapsedRealtime();
                            if (Math.abs(elapsedRealtime - this.b.T3) >= 500) {
                                PhotoViewer photoViewer5 = this.b;
                                tp0 tp0Var2 = photoViewer5.g0;
                                if (tp0Var2 != null && tp0Var2.y) {
                                    f10 = tp0Var2.getBufferedPosition();
                                } else if (photoViewer5.R3) {
                                    org.telegram.messenger.w7 G = org.telegram.messenger.w7.G(photoViewer5.U);
                                    PhotoViewer photoViewer6 = this.b;
                                    float f11 = photoViewer6.b3;
                                    if (f11 == 0.0f) {
                                        f11 = q12;
                                    }
                                    f10 = G.t(photoViewer6.d5[0], f11);
                                } else {
                                    f10 = 1.0f;
                                }
                                this.b.T3 = elapsedRealtime;
                            } else {
                                f10 = -1.0f;
                            }
                        }
                        PhotoViewer photoViewer7 = this.b;
                        if (photoViewer7.C8 || photoViewer7.S7.getVisibility() != 0) {
                            PhotoViewer photoViewer8 = this.b;
                            if (photoViewer8.b3 == 0.0f) {
                                org.telegram.ui.Cells.j1 j1Var = photoViewer8.b4;
                                if (j1Var.rewindCount == 0 || (!j1Var.rewindByBackSeek && !photoViewer8.d4.rewindByBackSeek)) {
                                    photoViewer8.r3.h(false, q12);
                                }
                            }
                            if (f10 != -1.0f) {
                                this.b.r3.f(f10);
                                org.telegram.ui.Components.ie0 ie0Var = org.telegram.ui.Components.ie0.q0;
                                if (f10 > ie0Var.b0) {
                                    ie0Var.b0 = f10;
                                    ei.e3 e3Var = ie0Var.c0;
                                    if (e3Var != null) {
                                        e3Var.invalidate();
                                    }
                                }
                            }
                        } else if (q12 >= this.b.T7.getRightProgress()) {
                            PhotoViewer photoViewer9 = this.b;
                            photoViewer9.I2 = false;
                            photoViewer9.k2();
                            this.b.r3.h(false, 0.0f);
                            this.b.w2((int) (r1.T7.getLeftProgress() * this.b.C1()));
                            this.b.f0.invalidate();
                        } else {
                            float leftProgress = q12 - this.b.T7.getLeftProgress();
                            if (leftProgress < 0.0f) {
                                leftProgress = 0.0f;
                            }
                            q12 = leftProgress / (this.b.T7.getRightProgress() - this.b.T7.getLeftProgress());
                            if (q12 > 1.0f) {
                                q12 = 1.0f;
                            }
                            this.b.r3.h(false, q12);
                        }
                        this.b.s3.invalidate();
                        if (this.b.c3 != null && q12 >= 0.0f) {
                            long elapsedRealtime2 = SystemClock.elapsedRealtime();
                            PhotoViewer photoViewer10 = this.b;
                            if (elapsedRealtime2 - photoViewer10.e3 >= 1000) {
                                String str = photoViewer10.c3;
                                photoViewer10.e3 = SystemClock.elapsedRealtime();
                                org.telegram.messenger.zi ziVar = this.b.U4;
                                if (ziVar != null) {
                                    ziVar.j3 = Float.valueOf(q12);
                                }
                                Utilities.e.c(new org.telegram.messenger.oe(str, 1, q12));
                            }
                        }
                        this.b.F3();
                    } else if (!photoViewer4.T7.r) {
                        float q13 = photoViewer4.q1() / this.b.C1();
                        PhotoViewer photoViewer11 = this.b;
                        if (photoViewer11.C8 || (photoViewer11.v4 == 0 && photoViewer11.S7.getVisibility() != 0)) {
                            PhotoViewer photoViewer12 = this.b;
                            if (photoViewer12.d2 != 1) {
                                photoViewer12.T7.setProgress(q13);
                            }
                        } else if (q13 >= this.b.T7.getRightProgress()) {
                            no0 no0Var = this.b.T7;
                            no0Var.setProgress(no0Var.getLeftProgress());
                            this.b.G2.p0((int) (r0.T7.getLeftProgress() * this.b.C1()));
                            PhotoViewer photoViewer13 = this.b;
                            photoViewer13.I2 = false;
                            photoViewer13.v0();
                            PhotoViewer photoViewer14 = this.b;
                            if (photoViewer14.r || photoViewer14.d2 == 1 || photoViewer14.v4 != 0 || photoViewer14.p6 > 0) {
                                photoViewer14.m2();
                            } else {
                                photoViewer14.k2();
                            }
                            this.b.f0.invalidate();
                        } else {
                            this.b.T7.setProgress(q13);
                        }
                        this.b.F3();
                    }
                }
                fq0 fq0Var = this.b.F2;
                if (fq0Var != null) {
                    fq0.a(fq0Var);
                }
                PhotoViewer photoViewer15 = this.b;
                if (photoViewer15.Q3) {
                    org.telegram.messenger.g0.i3(photoViewer15.i4, 17L);
                    break;
                }
                break;
            default:
                PhotoViewer photoViewer16 = this.b;
                if (!org.telegram.ui.Components.ie0.q0.Q) {
                    photoViewer16.M3 = false;
                    Bitmap bitmap = photoViewer16.D3;
                    if (bitmap != null) {
                        bitmap.recycle();
                        photoViewer16.D3 = null;
                    }
                    photoViewer16.G3 = true;
                    Activity activity = photoViewer16.E;
                    ai.c0 c0Var = new ai.c0(29, (Context) activity, false);
                    ImageReceiver imageReceiver = new ImageReceiver(c0Var);
                    c0Var.b = imageReceiver;
                    TextureView textureView = new TextureView(activity);
                    c0Var.c = textureView;
                    c0Var.addView(textureView);
                    try {
                        if (photoViewer16.E2) {
                            Drawable drawable = photoViewer16.y3.getDrawable();
                            if (drawable instanceof BitmapDrawable) {
                                Bitmap bitmap2 = ((BitmapDrawable) drawable).getBitmap();
                                photoViewer16.D3 = bitmap2;
                                if (bitmap2 != null) {
                                    ImageView imageView = photoViewer16.y3;
                                    if (imageView != null) {
                                        imageView.setVisibility(0);
                                        photoViewer16.y3.setImageBitmap(photoViewer16.D3);
                                    }
                                    imageReceiver.v0(photoViewer16.D3);
                                }
                            } else {
                                int width = photoViewer16.D2.getWidth();
                                int height = photoViewer16.D2.getHeight();
                                Bitmap.Config config = Bitmap.Config.ARGB_8888;
                                Bitmap c2 = org.telegram.messenger.sr.c(width, height);
                                photoViewer16.D3 = c2;
                                org.telegram.messenger.g0.A0(photoViewer16.D2, c2, new hk0(9, this, c0Var));
                            }
                        } else {
                            int width2 = photoViewer16.C2.getWidth();
                            int height2 = photoViewer16.C2.getHeight();
                            Bitmap.Config config2 = Bitmap.Config.ARGB_8888;
                            Bitmap c10 = org.telegram.messenger.sr.c(width2, height2);
                            photoViewer16.D3 = c10;
                            photoViewer16.C2.getBitmap(c10);
                            if (photoViewer16.D3 != null) {
                                ImageView imageView2 = photoViewer16.y3;
                                if (imageView2 != null) {
                                    imageView2.setVisibility(0);
                                    photoViewer16.y3.setImageBitmap(photoViewer16.D3);
                                }
                                imageReceiver.v0(photoViewer16.D3);
                            }
                        }
                    } catch (Throwable th2) {
                        Bitmap bitmap3 = photoViewer16.D3;
                        if (bitmap3 != null) {
                            bitmap3.recycle();
                            photoViewer16.D3 = null;
                        }
                        org.telegram.messenger.a8.g(th2, true);
                    }
                    photoViewer16.K3 = true;
                    photoViewer16.x3 = (TextureView) c0Var.c;
                    if (org.telegram.ui.Components.ie0.x(false, photoViewer16.E, null, c0Var, photoViewer16.V, photoViewer16.W, photoViewer16.L3)) {
                        org.telegram.ui.Components.ie0.w(photoViewer16);
                    }
                    photoViewer16.L3 = true;
                    if (!photoViewer16.E2) {
                        photoViewer16.x3.setVisibility(4);
                        org.telegram.ui.Components.zd0 zd0Var = photoViewer16.z2;
                        if (zd0Var != null) {
                            zd0Var.removeView(photoViewer16.C2);
                            photoViewer16.z2.removeView(photoViewer16.D2);
                            break;
                        }
                    } else {
                        org.telegram.ui.Components.zd0 zd0Var2 = photoViewer16.z2;
                        if (zd0Var2 != null) {
                            zd0Var2.removeView(photoViewer16.C2);
                            photoViewer16.z2.removeView(photoViewer16.D2);
                        }
                        photoViewer16.G2.z0(null);
                        photoViewer16.G2.A0(null);
                        photoViewer16.G2.h0();
                        photoViewer16.G2.A0(photoViewer16.x3);
                        photoViewer16.y0(true);
                        photoViewer16.x3.setVisibility(0);
                        break;
                    }
                } else {
                    org.telegram.ui.Components.ie0.b(false);
                    org.telegram.messenger.g0.i3(this, 250L);
                    break;
                }
                break;
        }
    }
}
