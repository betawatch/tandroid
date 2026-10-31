package org.telegram.ui;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.view.TextureView;
import android.widget.ImageView;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class iq0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ PhotoViewer b;

    public /* synthetic */ iq0(PhotoViewer photoViewer, int i10) {
        this.a = i10;
        this.b = photoViewer;
    }

    @Override // java.lang.Runnable
    public final void run() {
        float f7;
        mr0 mr0Var;
        switch (this.a) {
            case 0:
                PhotoViewer photoViewer = this.b;
                if (photoViewer.l3 && photoViewer.P3 && !org.telegram.messenger.w0.x) {
                    org.telegram.ui.ActionBar.t0 t0Var = this.b.o0;
                    if (t0Var == null || !t0Var.x()) {
                        org.telegram.ui.ActionBar.t0 t0Var2 = this.b.p0;
                        if (t0Var2 == null || !t0Var2.x()) {
                            fr0 fr0Var = this.b.T1;
                            if (fr0Var == null || fr0Var.getScrollY() == 0) {
                                id idVar = this.b.X0;
                                if (idVar == null || idVar.getVisibility() != 0) {
                                    PhotoViewer photoViewer2 = PhotoViewer.b9;
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
                if (photoViewer4.F2 != null || ((mr0Var = photoViewer4.f0) != null && mr0Var.y)) {
                    if (!photoViewer4.r1) {
                        float q12 = photoViewer4.q1() / this.b.C1();
                        if (this.b.h5) {
                            f7 = 1.0f;
                        } else {
                            long elapsedRealtime = SystemClock.elapsedRealtime();
                            if (Math.abs(elapsedRealtime - this.b.S3) >= 500) {
                                PhotoViewer photoViewer5 = this.b;
                                mr0 mr0Var2 = photoViewer5.f0;
                                if (mr0Var2 != null && mr0Var2.y) {
                                    f7 = mr0Var2.getBufferedPosition();
                                } else if (photoViewer5.Q3) {
                                    org.telegram.messenger.b8 G = org.telegram.messenger.b8.G(photoViewer5.T);
                                    PhotoViewer photoViewer6 = this.b;
                                    float f10 = photoViewer6.a3;
                                    if (f10 == 0.0f) {
                                        f10 = q12;
                                    }
                                    f7 = G.t(photoViewer6.c5[0], f10);
                                } else {
                                    f7 = 1.0f;
                                }
                                this.b.S3 = elapsedRealtime;
                            } else {
                                f7 = -1.0f;
                            }
                        }
                        PhotoViewer photoViewer7 = this.b;
                        if (photoViewer7.B8 || photoViewer7.R7.getVisibility() != 0) {
                            PhotoViewer photoViewer8 = this.b;
                            if (photoViewer8.a3 == 0.0f) {
                                org.telegram.ui.Cells.j1 j1Var = photoViewer8.a4;
                                if (j1Var.rewindCount == 0 || (!j1Var.rewindByBackSeek && !photoViewer8.c4.rewindByBackSeek)) {
                                    photoViewer8.q3.h(false, q12);
                                }
                            }
                            if (f7 != -1.0f) {
                                this.b.q3.f(f7);
                                org.telegram.ui.Components.jf0 jf0Var = org.telegram.ui.Components.jf0.p0;
                                if (f7 > jf0Var.a0) {
                                    jf0Var.a0 = f7;
                                    ih.c cVar = jf0Var.b0;
                                    if (cVar != null) {
                                        cVar.invalidate();
                                    }
                                }
                            }
                        } else if (q12 >= this.b.S7.getRightProgress()) {
                            PhotoViewer photoViewer9 = this.b;
                            photoViewer9.H2 = false;
                            photoViewer9.k2();
                            this.b.q3.h(false, 0.0f);
                            this.b.w2((int) (r1.S7.getLeftProgress() * this.b.C1()));
                            this.b.e0.invalidate();
                        } else {
                            float leftProgress = q12 - this.b.S7.getLeftProgress();
                            if (leftProgress < 0.0f) {
                                leftProgress = 0.0f;
                            }
                            q12 = leftProgress / (this.b.S7.getRightProgress() - this.b.S7.getLeftProgress());
                            if (q12 > 1.0f) {
                                q12 = 1.0f;
                            }
                            this.b.q3.h(false, q12);
                        }
                        this.b.r3.invalidate();
                        if (this.b.b3 != null && q12 >= 0.0f) {
                            long elapsedRealtime2 = SystemClock.elapsedRealtime();
                            PhotoViewer photoViewer10 = this.b;
                            if (elapsedRealtime2 - photoViewer10.d3 >= 1000) {
                                String str = photoViewer10.b3;
                                photoViewer10.d3 = SystemClock.elapsedRealtime();
                                org.telegram.messenger.jj jjVar = this.b.T4;
                                if (jjVar != null) {
                                    jjVar.g3 = Float.valueOf(q12);
                                }
                                Utilities.e.c(new org.telegram.messenger.ue(str, 1, q12));
                            }
                        }
                        this.b.F3();
                    } else if (!photoViewer4.S7.r) {
                        float q13 = photoViewer4.q1() / this.b.C1();
                        PhotoViewer photoViewer11 = this.b;
                        if (photoViewer11.B8 || (photoViewer11.u4 == 0 && photoViewer11.R7.getVisibility() != 0)) {
                            PhotoViewer photoViewer12 = this.b;
                            if (photoViewer12.c2 != 1) {
                                photoViewer12.S7.setProgress(q13);
                            }
                        } else if (q13 >= this.b.S7.getRightProgress()) {
                            gq0 gq0Var = this.b.S7;
                            gq0Var.setProgress(gq0Var.getLeftProgress());
                            this.b.F2.p0((int) (r0.S7.getLeftProgress() * this.b.C1()));
                            PhotoViewer photoViewer13 = this.b;
                            photoViewer13.H2 = false;
                            photoViewer13.v0();
                            PhotoViewer photoViewer14 = this.b;
                            if (photoViewer14.r || photoViewer14.c2 == 1 || photoViewer14.u4 != 0 || photoViewer14.o6 > 0) {
                                photoViewer14.m2();
                            } else {
                                photoViewer14.k2();
                            }
                            this.b.e0.invalidate();
                        } else {
                            this.b.S7.setProgress(q13);
                        }
                        this.b.F3();
                    }
                }
                zr0 zr0Var = this.b.E2;
                if (zr0Var != null) {
                    zr0.a(zr0Var);
                }
                PhotoViewer photoViewer15 = this.b;
                if (photoViewer15.P3) {
                    org.telegram.messenger.i0.h3(photoViewer15.h4, 17L);
                    break;
                }
                break;
            default:
                PhotoViewer photoViewer16 = this.b;
                if (!org.telegram.ui.Components.jf0.p0.P) {
                    photoViewer16.L3 = false;
                    Bitmap bitmap = photoViewer16.C3;
                    if (bitmap != null) {
                        bitmap.recycle();
                        photoViewer16.C3 = null;
                    }
                    photoViewer16.F3 = true;
                    Activity activity = photoViewer16.D;
                    fg.i iVar = new fg.i(activity, 26);
                    ImageReceiver imageReceiver = new ImageReceiver(iVar);
                    iVar.b = imageReceiver;
                    TextureView textureView = new TextureView(activity);
                    iVar.c = textureView;
                    iVar.addView(textureView);
                    try {
                        if (photoViewer16.D2) {
                            Drawable drawable = photoViewer16.x3.getDrawable();
                            if (drawable instanceof BitmapDrawable) {
                                Bitmap bitmap2 = ((BitmapDrawable) drawable).getBitmap();
                                photoViewer16.C3 = bitmap2;
                                if (bitmap2 != null) {
                                    ImageView imageView = photoViewer16.x3;
                                    if (imageView != null) {
                                        imageView.setVisibility(0);
                                        photoViewer16.x3.setImageBitmap(photoViewer16.C3);
                                    }
                                    imageReceiver.v0(photoViewer16.C3);
                                }
                            } else {
                                int width = photoViewer16.C2.getWidth();
                                int height = photoViewer16.C2.getHeight();
                                Bitmap.Config config = Bitmap.Config.ARGB_8888;
                                Bitmap b10 = org.telegram.messenger.js.b(width, height);
                                photoViewer16.C3 = b10;
                                org.telegram.messenger.i0.A0(photoViewer16.C2, b10, new uf0(27, this, iVar));
                            }
                        } else {
                            int width2 = photoViewer16.B2.getWidth();
                            int height2 = photoViewer16.B2.getHeight();
                            Bitmap.Config config2 = Bitmap.Config.ARGB_8888;
                            Bitmap b11 = org.telegram.messenger.js.b(width2, height2);
                            photoViewer16.C3 = b11;
                            photoViewer16.B2.getBitmap(b11);
                            if (photoViewer16.C3 != null) {
                                ImageView imageView2 = photoViewer16.x3;
                                if (imageView2 != null) {
                                    imageView2.setVisibility(0);
                                    photoViewer16.x3.setImageBitmap(photoViewer16.C3);
                                }
                                imageReceiver.v0(photoViewer16.C3);
                            }
                        }
                    } catch (Throwable th2) {
                        Bitmap bitmap3 = photoViewer16.C3;
                        if (bitmap3 != null) {
                            bitmap3.recycle();
                            photoViewer16.C3 = null;
                        }
                        org.telegram.messenger.f8.g(th2, true);
                    }
                    photoViewer16.J3 = true;
                    photoViewer16.w3 = (TextureView) iVar.c;
                    if (org.telegram.ui.Components.jf0.x(false, photoViewer16.D, null, iVar, photoViewer16.U, photoViewer16.V, photoViewer16.K3)) {
                        org.telegram.ui.Components.jf0.w(photoViewer16);
                    }
                    photoViewer16.K3 = true;
                    if (!photoViewer16.D2) {
                        photoViewer16.w3.setVisibility(4);
                        org.telegram.ui.Components.af0 af0Var = photoViewer16.y2;
                        if (af0Var != null) {
                            af0Var.removeView(photoViewer16.B2);
                            photoViewer16.y2.removeView(photoViewer16.C2);
                            break;
                        }
                    } else {
                        org.telegram.ui.Components.af0 af0Var2 = photoViewer16.y2;
                        if (af0Var2 != null) {
                            af0Var2.removeView(photoViewer16.B2);
                            photoViewer16.y2.removeView(photoViewer16.C2);
                        }
                        photoViewer16.F2.z0(null);
                        photoViewer16.F2.A0(null);
                        photoViewer16.F2.h0();
                        photoViewer16.F2.A0(photoViewer16.w3);
                        photoViewer16.y0(true);
                        photoViewer16.w3.setVisibility(0);
                        break;
                    }
                } else {
                    org.telegram.ui.Components.jf0.b(false);
                    org.telegram.messenger.i0.h3(this, 250L);
                    break;
                }
                break;
        }
    }
}
