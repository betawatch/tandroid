package org.telegram.ui;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.view.TextureView;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.Bitmaps;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class ps0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ PhotoViewer b;

    public /* synthetic */ ps0(PhotoViewer photoViewer, int i10) {
        this.a = i10;
        this.b = photoViewer;
    }

    @Override // java.lang.Runnable
    public final void run() {
        float f7;
        xt0 xt0Var;
        switch (this.a) {
            case 0:
                PhotoViewer photoViewer = this.b;
                if (photoViewer.l3 && photoViewer.P3 && !ApplicationLoader.mainInterfacePaused) {
                    org.telegram.ui.ActionBar.w0 w0Var = this.b.o0;
                    if (w0Var == null || !w0Var.x()) {
                        org.telegram.ui.ActionBar.w0 w0Var2 = this.b.p0;
                        if (w0Var2 == null || !w0Var2.x()) {
                            qt0 qt0Var = this.b.T1;
                            if (qt0Var == null || qt0Var.getScrollY() == 0) {
                                ld ldVar = this.b.X0;
                                if (ldVar == null || ldVar.getVisibility() != 0) {
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
                if (photoViewer4.F2 != null || ((xt0Var = photoViewer4.f0) != null && xt0Var.x)) {
                    if (!photoViewer4.r1) {
                        float q12 = photoViewer4.q1() / this.b.C1();
                        if (this.b.h5) {
                            f7 = 1.0f;
                        } else {
                            long elapsedRealtime = SystemClock.elapsedRealtime();
                            if (Math.abs(elapsedRealtime - this.b.S3) >= 500) {
                                PhotoViewer photoViewer5 = this.b;
                                xt0 xt0Var2 = photoViewer5.f0;
                                if (xt0Var2 != null && xt0Var2.x) {
                                    f7 = xt0Var2.getBufferedPosition();
                                } else if (photoViewer5.Q3) {
                                    FileLoader fileLoader = FileLoader.getInstance(photoViewer5.T);
                                    PhotoViewer photoViewer6 = this.b;
                                    float f10 = photoViewer6.a3;
                                    if (f10 == 0.0f) {
                                        f10 = q12;
                                    }
                                    f7 = fileLoader.getBufferedProgressFromPosition(f10, photoViewer6.c5[0]);
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
                                org.telegram.ui.Cells.f1 f1Var = photoViewer8.a4;
                                if (f1Var.rewindCount == 0 || (!f1Var.rewindByBackSeek && !photoViewer8.c4.rewindByBackSeek)) {
                                    photoViewer8.q3.h(q12, false);
                                }
                            }
                            if (f7 != -1.0f) {
                                this.b.q3.f(f7);
                                org.telegram.ui.Components.dh0 dh0Var = org.telegram.ui.Components.dh0.p0;
                                if (f7 > dh0Var.a0) {
                                    dh0Var.a0 = f7;
                                    di.h3 h3Var = dh0Var.b0;
                                    if (h3Var != null) {
                                        h3Var.invalidate();
                                    }
                                }
                            }
                        } else if (q12 >= this.b.S7.getRightProgress()) {
                            PhotoViewer photoViewer9 = this.b;
                            photoViewer9.H2 = false;
                            photoViewer9.k2();
                            this.b.q3.h(0.0f, false);
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
                            this.b.q3.h(q12, false);
                        }
                        this.b.r3.invalidate();
                        if (this.b.b3 != null && q12 >= 0.0f) {
                            long elapsedRealtime2 = SystemClock.elapsedRealtime();
                            PhotoViewer photoViewer10 = this.b;
                            if (elapsedRealtime2 - photoViewer10.d3 >= 1000) {
                                String str = photoViewer10.b3;
                                photoViewer10.d3 = SystemClock.elapsedRealtime();
                                MessageObject messageObject = this.b.T4;
                                if (messageObject != null) {
                                    messageObject.cachedSavedTimestamp = Float.valueOf(q12);
                                }
                                Utilities.globalQueue.postRunnable(new b0(str, q12, 4));
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
                            ns0 ns0Var = this.b.S7;
                            ns0Var.setProgress(ns0Var.getLeftProgress());
                            this.b.F2.K((int) (r0.S7.getLeftProgress() * this.b.C1()));
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
                ju0 ju0Var = this.b.E2;
                if (ju0Var != null) {
                    ju0.a(ju0Var);
                }
                PhotoViewer photoViewer15 = this.b;
                if (photoViewer15.P3) {
                    AndroidUtilities.runOnUIThread(photoViewer15.h4, 17L);
                    break;
                }
                break;
            default:
                PhotoViewer photoViewer16 = this.b;
                if (!org.telegram.ui.Components.dh0.p0.P) {
                    photoViewer16.L3 = false;
                    Bitmap bitmap = photoViewer16.C3;
                    if (bitmap != null) {
                        bitmap.recycle();
                        photoViewer16.C3 = null;
                    }
                    photoViewer16.F3 = true;
                    Activity activity = photoViewer16.y;
                    bh.p pVar = new bh.p(activity, 24);
                    ImageReceiver imageReceiver = new ImageReceiver(pVar);
                    pVar.b = imageReceiver;
                    TextureView textureView = new TextureView(activity);
                    pVar.c = textureView;
                    pVar.addView(textureView);
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
                                    imageReceiver.setImageBitmap(photoViewer16.C3);
                                }
                            } else {
                                Bitmap createBitmap = Bitmaps.createBitmap(photoViewer16.C2.getWidth(), photoViewer16.C2.getHeight(), Bitmap.Config.ARGB_8888);
                                photoViewer16.C3 = createBitmap;
                                AndroidUtilities.getBitmapFromSurface(photoViewer16.C2, createBitmap, new am0(16, this, pVar));
                            }
                        } else {
                            Bitmap createBitmap2 = Bitmaps.createBitmap(photoViewer16.B2.getWidth(), photoViewer16.B2.getHeight(), Bitmap.Config.ARGB_8888);
                            photoViewer16.C3 = createBitmap2;
                            photoViewer16.B2.getBitmap(createBitmap2);
                            if (photoViewer16.C3 != null) {
                                ImageView imageView2 = photoViewer16.x3;
                                if (imageView2 != null) {
                                    imageView2.setVisibility(0);
                                    photoViewer16.x3.setImageBitmap(photoViewer16.C3);
                                }
                                imageReceiver.setImageBitmap(photoViewer16.C3);
                            }
                        }
                    } catch (Throwable th2) {
                        Bitmap bitmap3 = photoViewer16.C3;
                        if (bitmap3 != null) {
                            bitmap3.recycle();
                            photoViewer16.C3 = null;
                        }
                        FileLog.e(th2);
                    }
                    photoViewer16.J3 = true;
                    photoViewer16.w3 = (TextureView) pVar.c;
                    if (org.telegram.ui.Components.dh0.x(false, photoViewer16.y, null, pVar, photoViewer16.U, photoViewer16.V, photoViewer16.K3)) {
                        org.telegram.ui.Components.dh0.w(photoViewer16);
                    }
                    photoViewer16.K3 = true;
                    if (!photoViewer16.D2) {
                        photoViewer16.w3.setVisibility(4);
                        ht0 ht0Var = photoViewer16.y2;
                        if (ht0Var != null) {
                            ht0Var.removeView(photoViewer16.B2);
                            photoViewer16.y2.removeView(photoViewer16.C2);
                            break;
                        }
                    } else {
                        ht0 ht0Var2 = photoViewer16.y2;
                        if (ht0Var2 != null) {
                            ht0Var2.removeView(photoViewer16.B2);
                            photoViewer16.y2.removeView(photoViewer16.C2);
                        }
                        photoViewer16.F2.U(null);
                        photoViewer16.F2.V(null);
                        photoViewer16.F2.C();
                        photoViewer16.F2.V(photoViewer16.w3);
                        photoViewer16.y0(true);
                        photoViewer16.w3.setVisibility(0);
                        break;
                    }
                } else {
                    org.telegram.ui.Components.dh0.j(false);
                    AndroidUtilities.runOnUIThread(this, 250L);
                    break;
                }
                break;
        }
    }
}
