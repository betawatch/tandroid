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

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class es0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ PhotoViewer b;

    public /* synthetic */ es0(PhotoViewer photoViewer, int i10) {
        this.a = i10;
        this.b = photoViewer;
    }

    @Override // java.lang.Runnable
    public final void run() {
        float f10;
        nt0 nt0Var;
        switch (this.a) {
            case 0:
                PhotoViewer photoViewer = this.b;
                if (photoViewer.i3 && photoViewer.M3 && !ApplicationLoader.mainInterfacePaused) {
                    org.telegram.ui.ActionBar.w0 w0Var = this.b.l0;
                    if (w0Var == null || !w0Var.t()) {
                        org.telegram.ui.ActionBar.w0 w0Var2 = this.b.m0;
                        if (w0Var2 == null || !w0Var2.t()) {
                            gt0 gt0Var = this.b.Q1;
                            if (gt0Var == null || gt0Var.getScrollY() == 0) {
                                ld ldVar = this.b.U0;
                                if (ldVar == null || ldVar.getVisibility() != 0) {
                                    PhotoViewer photoViewer2 = PhotoViewer.X8;
                                    PhotoViewer photoViewer3 = this.b;
                                    if (photoViewer2 != photoViewer3) {
                                        photoViewer3.j3(false, true);
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
                if (photoViewer4.C2 != null || ((nt0Var = photoViewer4.c0) != null && nt0Var.x)) {
                    if (!photoViewer4.o1) {
                        float o12 = photoViewer4.o1() / this.b.A1();
                        if (this.b.e5) {
                            f10 = 1.0f;
                        } else {
                            long elapsedRealtime = SystemClock.elapsedRealtime();
                            if (Math.abs(elapsedRealtime - this.b.P3) >= 500) {
                                PhotoViewer photoViewer5 = this.b;
                                nt0 nt0Var2 = photoViewer5.c0;
                                if (nt0Var2 != null && nt0Var2.x) {
                                    f10 = nt0Var2.getBufferedPosition();
                                } else if (photoViewer5.N3) {
                                    FileLoader fileLoader = FileLoader.getInstance(photoViewer5.Q);
                                    PhotoViewer photoViewer6 = this.b;
                                    float f11 = photoViewer6.X2;
                                    if (f11 == 0.0f) {
                                        f11 = o12;
                                    }
                                    f10 = fileLoader.getBufferedProgressFromPosition(f11, photoViewer6.Z4[0]);
                                } else {
                                    f10 = 1.0f;
                                }
                                this.b.P3 = elapsedRealtime;
                            } else {
                                f10 = -1.0f;
                            }
                        }
                        PhotoViewer photoViewer7 = this.b;
                        if (photoViewer7.x8 || photoViewer7.N7.getVisibility() != 0) {
                            PhotoViewer photoViewer8 = this.b;
                            if (photoViewer8.X2 == 0.0f) {
                                org.telegram.ui.Cells.g1 g1Var = photoViewer8.X3;
                                if (g1Var.rewindCount == 0 || (!g1Var.rewindByBackSeek && !photoViewer8.Z3.rewindByBackSeek)) {
                                    photoViewer8.n3.h(o12, false);
                                }
                            }
                            if (f10 != -1.0f) {
                                this.b.n3.f(f10);
                                org.telegram.ui.Components.lg0 lg0Var = org.telegram.ui.Components.lg0.m0;
                                if (f10 > lg0Var.X) {
                                    lg0Var.X = f10;
                                    nh.a3 a3Var = lg0Var.Y;
                                    if (a3Var != null) {
                                        a3Var.invalidate();
                                    }
                                }
                            }
                        } else if (o12 >= this.b.O7.getRightProgress()) {
                            PhotoViewer photoViewer9 = this.b;
                            photoViewer9.E2 = false;
                            photoViewer9.g2();
                            this.b.n3.h(0.0f, false);
                            this.b.t2((int) (r1.O7.getLeftProgress() * this.b.A1()));
                            this.b.b0.invalidate();
                        } else {
                            float leftProgress = o12 - this.b.O7.getLeftProgress();
                            if (leftProgress < 0.0f) {
                                leftProgress = 0.0f;
                            }
                            o12 = leftProgress / (this.b.O7.getRightProgress() - this.b.O7.getLeftProgress());
                            if (o12 > 1.0f) {
                                o12 = 1.0f;
                            }
                            this.b.n3.h(o12, false);
                        }
                        this.b.o3.invalidate();
                        if (this.b.Y2 != null && o12 >= 0.0f) {
                            long elapsedRealtime2 = SystemClock.elapsedRealtime();
                            PhotoViewer photoViewer10 = this.b;
                            if (elapsedRealtime2 - photoViewer10.a3 >= 1000) {
                                String str = photoViewer10.Y2;
                                photoViewer10.a3 = SystemClock.elapsedRealtime();
                                MessageObject messageObject = this.b.Q4;
                                if (messageObject != null) {
                                    messageObject.cachedSavedTimestamp = Float.valueOf(o12);
                                }
                                Utilities.globalQueue.postRunnable(new d0(str, o12, 4));
                            }
                        }
                        this.b.C3();
                    } else if (!photoViewer4.O7.r) {
                        float o13 = photoViewer4.o1() / this.b.A1();
                        PhotoViewer photoViewer11 = this.b;
                        if (photoViewer11.x8 || (photoViewer11.r4 == 0 && photoViewer11.N7.getVisibility() != 0)) {
                            PhotoViewer photoViewer12 = this.b;
                            if (photoViewer12.Z1 != 1) {
                                photoViewer12.O7.setProgress(o13);
                            }
                        } else if (o13 >= this.b.O7.getRightProgress()) {
                            cs0 cs0Var = this.b.O7;
                            cs0Var.setProgress(cs0Var.getLeftProgress());
                            this.b.C2.K((int) (r0.O7.getLeftProgress() * this.b.A1()));
                            PhotoViewer photoViewer13 = this.b;
                            photoViewer13.E2 = false;
                            photoViewer13.u0();
                            PhotoViewer photoViewer14 = this.b;
                            if (photoViewer14.r || photoViewer14.Z1 == 1 || photoViewer14.r4 != 0 || photoViewer14.l6 > 0) {
                                photoViewer14.i2();
                            } else {
                                photoViewer14.g2();
                            }
                            this.b.b0.invalidate();
                        } else {
                            this.b.O7.setProgress(o13);
                        }
                        this.b.C3();
                    }
                }
                au0 au0Var = this.b.B2;
                if (au0Var != null) {
                    au0.a(au0Var);
                }
                PhotoViewer photoViewer15 = this.b;
                if (photoViewer15.M3) {
                    AndroidUtilities.runOnUIThread(photoViewer15.e4, 17L);
                    break;
                }
                break;
            default:
                PhotoViewer photoViewer16 = this.b;
                if (!org.telegram.ui.Components.lg0.m0.M) {
                    photoViewer16.I3 = false;
                    Bitmap bitmap = photoViewer16.z3;
                    if (bitmap != null) {
                        bitmap.recycle();
                        photoViewer16.z3 = null;
                    }
                    photoViewer16.C3 = true;
                    Activity activity = photoViewer16.y;
                    ah.d dVar = new ah.d(activity, 27);
                    ImageReceiver imageReceiver = new ImageReceiver(dVar);
                    dVar.b = imageReceiver;
                    TextureView textureView = new TextureView(activity);
                    dVar.c = textureView;
                    dVar.addView(textureView);
                    try {
                        if (photoViewer16.A2) {
                            Drawable drawable = photoViewer16.u3.getDrawable();
                            if (drawable instanceof BitmapDrawable) {
                                Bitmap bitmap2 = ((BitmapDrawable) drawable).getBitmap();
                                photoViewer16.z3 = bitmap2;
                                if (bitmap2 != null) {
                                    ImageView imageView = photoViewer16.u3;
                                    if (imageView != null) {
                                        imageView.setVisibility(0);
                                        photoViewer16.u3.setImageBitmap(photoViewer16.z3);
                                    }
                                    imageReceiver.setImageBitmap(photoViewer16.z3);
                                }
                            } else {
                                Bitmap createBitmap = Bitmaps.createBitmap(photoViewer16.z2.getWidth(), photoViewer16.z2.getHeight(), Bitmap.Config.ARGB_8888);
                                photoViewer16.z3 = createBitmap;
                                AndroidUtilities.getBitmapFromSurface(photoViewer16.z2, createBitmap, new zq0(6, this, dVar));
                            }
                        } else {
                            Bitmap createBitmap2 = Bitmaps.createBitmap(photoViewer16.y2.getWidth(), photoViewer16.y2.getHeight(), Bitmap.Config.ARGB_8888);
                            photoViewer16.z3 = createBitmap2;
                            photoViewer16.y2.getBitmap(createBitmap2);
                            if (photoViewer16.z3 != null) {
                                ImageView imageView2 = photoViewer16.u3;
                                if (imageView2 != null) {
                                    imageView2.setVisibility(0);
                                    photoViewer16.u3.setImageBitmap(photoViewer16.z3);
                                }
                                imageReceiver.setImageBitmap(photoViewer16.z3);
                            }
                        }
                    } catch (Throwable th2) {
                        Bitmap bitmap3 = photoViewer16.z3;
                        if (bitmap3 != null) {
                            bitmap3.recycle();
                            photoViewer16.z3 = null;
                        }
                        FileLog.e(th2);
                    }
                    photoViewer16.G3 = true;
                    photoViewer16.t3 = (TextureView) dVar.c;
                    if (org.telegram.ui.Components.lg0.x(false, photoViewer16.y, null, dVar, photoViewer16.R, photoViewer16.S, photoViewer16.H3)) {
                        org.telegram.ui.Components.lg0.w(photoViewer16);
                    }
                    photoViewer16.H3 = true;
                    if (!photoViewer16.A2) {
                        photoViewer16.t3.setVisibility(4);
                        xs0 xs0Var = photoViewer16.v2;
                        if (xs0Var != null) {
                            xs0Var.removeView(photoViewer16.y2);
                            photoViewer16.v2.removeView(photoViewer16.z2);
                            break;
                        }
                    } else {
                        xs0 xs0Var2 = photoViewer16.v2;
                        if (xs0Var2 != null) {
                            xs0Var2.removeView(photoViewer16.y2);
                            photoViewer16.v2.removeView(photoViewer16.z2);
                        }
                        photoViewer16.C2.U(null);
                        photoViewer16.C2.V(null);
                        photoViewer16.C2.C();
                        photoViewer16.C2.V(photoViewer16.t3);
                        photoViewer16.x0(true);
                        photoViewer16.t3.setVisibility(0);
                        break;
                    }
                } else {
                    org.telegram.ui.Components.lg0.j(false);
                    AndroidUtilities.runOnUIThread(this, 250L);
                    break;
                }
                break;
        }
    }
}
