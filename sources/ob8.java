// default package

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.widget.ImageView;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class ob8 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ PhotoViewer b;

    public /* synthetic */ ob8(PhotoViewer photoViewer, byte b) {
        this.a = b;
        this.b = photoViewer;
    }

    @Override // java.lang.Runnable
    public final void run() {
        float f;
        nc8 nc8Var;
        Bitmap bitmap;
        switch (this.a) {
            case 0:
                PhotoViewer photoViewer = this.b;
                if (photoViewer.l3 && photoViewer.P3 && !a.x) {
                    s7 s7Var = this.b.p0;
                    if (s7Var == null || !s7Var.y()) {
                        s7 s7Var2 = this.b.q0;
                        if (s7Var2 == null || !s7Var2.y()) {
                            ic8 ic8Var = this.b.U1;
                            if (ic8Var == null || ic8Var.getScrollY() == 0) {
                                ei1 ei1Var = this.b.Y0;
                                if (ei1Var == null || ei1Var.getVisibility() != 0) {
                                    PhotoViewer photoViewer2 = PhotoViewer.k9;
                                    PhotoViewer photoViewer3 = this.b;
                                    if (photoViewer2 != photoViewer3) {
                                        photoViewer3.t2(false, true);
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
                if (photoViewer4.G2 != null || ((nc8Var = photoViewer4.g0) != null && nc8Var.y)) {
                    if (!photoViewer4.s1) {
                        float l0 = photoViewer4.l0() / this.b.z0();
                        if (this.b.g5) {
                            f = 1.0f;
                        } else {
                            long elapsedRealtime = SystemClock.elapsedRealtime();
                            if (Math.abs(elapsedRealtime - this.b.S3) >= 500) {
                                PhotoViewer photoViewer5 = this.b;
                                nc8 nc8Var2 = photoViewer5.g0;
                                if (nc8Var2 != null && nc8Var2.y) {
                                    f = nc8Var2.getBufferedPosition();
                                } else if (photoViewer5.Q3) {
                                    xb4 G = xb4.G(photoViewer5.U);
                                    PhotoViewer photoViewer6 = this.b;
                                    float f2 = photoViewer6.a3;
                                    if (f2 == 0.0f) {
                                        f2 = l0;
                                    }
                                    f = G.t(photoViewer6.b5[0], f2);
                                } else {
                                    f = 1.0f;
                                }
                                this.b.S3 = elapsedRealtime;
                            } else {
                                f = -1.0f;
                            }
                        }
                        PhotoViewer photoViewer7 = this.b;
                        if (photoViewer7.G8 || photoViewer7.W7.getVisibility() != 0) {
                            PhotoViewer photoViewer8 = this.b;
                            if (photoViewer8.a3 == 0.0f) {
                                ob2 ob2Var = photoViewer8.a4;
                                if (ob2Var.rewindCount == 0 || (!ob2Var.rewindByBackSeek && !photoViewer8.c4.rewindByBackSeek)) {
                                    photoViewer8.q3.h(false, l0);
                                }
                            }
                            if (f != -1.0f) {
                                this.b.q3.f(f);
                                this.b.V8 = f;
                            }
                        } else {
                            float rightProgress = this.b.X7.getRightProgress();
                            PhotoViewer photoViewer9 = this.b;
                            if (l0 >= rightProgress) {
                                photoViewer9.H2 = false;
                                photoViewer9.p1();
                                this.b.q3.h(false, 0.0f);
                                this.b.C1((int) (r1.X7.getLeftProgress() * this.b.z0()));
                                this.b.f0.invalidate();
                            } else {
                                float leftProgress = l0 - photoViewer9.X7.getLeftProgress();
                                if (leftProgress < 0.0f) {
                                    leftProgress = 0.0f;
                                }
                                l0 = leftProgress / (this.b.X7.getRightProgress() - this.b.X7.getLeftProgress());
                                if (l0 > 1.0f) {
                                    l0 = 1.0f;
                                }
                                this.b.q3.h(false, l0);
                            }
                        }
                        this.b.r3.invalidate();
                        if (this.b.b3 != null && l0 >= 0.0f) {
                            long elapsedRealtime2 = SystemClock.elapsedRealtime();
                            PhotoViewer photoViewer10 = this.b;
                            if (elapsedRealtime2 - photoViewer10.d3 >= 1000) {
                                String str = photoViewer10.b3;
                                photoViewer10.d3 = SystemClock.elapsedRealtime();
                                r47 r47Var = this.b.S4;
                                if (r47Var != null) {
                                    r47Var.l3 = Float.valueOf(l0);
                                }
                                Utilities.e.c(new bo6(str, l0, (byte) 1));
                            }
                        }
                        this.b.Q2();
                    } else if (!photoViewer4.X7.r) {
                        float l02 = photoViewer4.l0() / this.b.z0();
                        PhotoViewer photoViewer11 = this.b;
                        if (photoViewer11.G8 || (photoViewer11.t4 == 0 && photoViewer11.W7.getVisibility() != 0)) {
                            PhotoViewer photoViewer12 = this.b;
                            if (photoViewer12.d2 != 1) {
                                photoViewer12.X7.setProgress(l02);
                            }
                        } else {
                            float rightProgress2 = this.b.X7.getRightProgress();
                            mb8 mb8Var = this.b.X7;
                            if (l02 >= rightProgress2) {
                                mb8Var.setProgress(mb8Var.getLeftProgress());
                                this.b.G2.o0((int) (r0.X7.getLeftProgress() * this.b.z0()));
                                PhotoViewer photoViewer13 = this.b;
                                photoViewer13.H2 = false;
                                photoViewer13.m();
                                PhotoViewer photoViewer14 = this.b;
                                if (photoViewer14.r || photoViewer14.d2 == 1 || photoViewer14.t4 != 0 || photoViewer14.n6 > 0) {
                                    photoViewer14.r1();
                                } else {
                                    photoViewer14.p1();
                                }
                                this.b.f0.invalidate();
                            } else {
                                mb8Var.setProgress(l02);
                            }
                        }
                        this.b.Q2();
                    }
                }
                zc8 zc8Var = this.b.F2;
                if (zc8Var != null) {
                    int i = zc8.r;
                    zc8Var.a();
                }
                PhotoViewer photoViewer15 = this.b;
                if (photoViewer15.P3) {
                    hl.d3(photoViewer15.h4, 17L);
                    break;
                }
                break;
            default:
                PhotoViewer photoViewer16 = this.b;
                me8 a = fc3.b().a();
                if (a != null && a != photoViewer16.U8) {
                    a.b();
                    hl.d3(this, 250L);
                    break;
                } else {
                    photoViewer16.L3 = false;
                    Bitmap bitmap2 = photoViewer16.C3;
                    if (bitmap2 != null) {
                        bitmap2.recycle();
                        photoViewer16.C3 = null;
                    }
                    photoViewer16.F3 = true;
                    try {
                    } catch (Throwable th) {
                        Bitmap bitmap3 = photoViewer16.C3;
                        if (bitmap3 != null) {
                            bitmap3.recycle();
                            photoViewer16.C3 = null;
                        }
                        cc4.g(th, true);
                    }
                    if (photoViewer16.E2) {
                        Drawable drawable = photoViewer16.x3.getDrawable();
                        if (drawable instanceof BitmapDrawable) {
                            Bitmap bitmap4 = ((BitmapDrawable) drawable).getBitmap();
                            photoViewer16.C3 = bitmap4;
                            if (bitmap4 != null) {
                                ImageView imageView = photoViewer16.x3;
                                if (imageView != null) {
                                    imageView.setVisibility(0);
                                    photoViewer16.x3.setImageBitmap(photoViewer16.C3);
                                }
                                bitmap = photoViewer16.C3;
                            }
                        }
                        bitmap = null;
                    } else {
                        int width = photoViewer16.C2.getWidth();
                        int height = photoViewer16.C2.getHeight();
                        Bitmap.Config config = Bitmap.Config.ARGB_8888;
                        Bitmap a2 = lc1.a(width, height);
                        photoViewer16.C3 = a2;
                        photoViewer16.C2.getBitmap(a2);
                        if (photoViewer16.C3 != null) {
                            ImageView imageView2 = photoViewer16.x3;
                            if (imageView2 != null) {
                                imageView2.setVisibility(0);
                                photoViewer16.x3.setImageBitmap(photoViewer16.C3);
                            }
                            bitmap = photoViewer16.C3;
                        }
                        bitmap = null;
                    }
                    photoViewer16.J3 = true;
                    photoViewer16.V();
                    photoViewer16.w3 = photoViewer16.U8.i(photoViewer16.E, bitmap, !photoViewer16.K3);
                    photoViewer16.K3 = true;
                    if (!photoViewer16.E2) {
                        photoViewer16.C3 = null;
                        photoViewer16.G2.z0(null);
                        dc8 dc8Var = photoViewer16.z2;
                        if (dc8Var != null) {
                            dc8Var.removeView(photoViewer16.C2);
                            photoViewer16.z2.removeView(photoViewer16.D2);
                        }
                        photoViewer16.G2.z0(photoViewer16.w3);
                        photoViewer16.F3 = false;
                        photoViewer16.q(true);
                        break;
                    } else {
                        dc8 dc8Var2 = photoViewer16.z2;
                        if (dc8Var2 != null) {
                            dc8Var2.removeView(photoViewer16.C2);
                            photoViewer16.z2.removeView(photoViewer16.D2);
                        }
                        photoViewer16.G2.y0(null);
                        photoViewer16.G2.z0(null);
                        photoViewer16.G2.g0();
                        photoViewer16.G2.z0(photoViewer16.w3);
                        photoViewer16.q(true);
                        photoViewer16.w3.setVisibility(0);
                        break;
                    }
                }
                break;
        }
    }
}
