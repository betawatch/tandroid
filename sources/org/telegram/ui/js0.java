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

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class js0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ PhotoViewer b;

    public /* synthetic */ js0(PhotoViewer photoViewer, int i10) {
        this.a = i10;
        this.b = photoViewer;
    }

    @Override // java.lang.Runnable
    public final void run() {
        float f7;
        rt0 rt0Var;
        switch (this.a) {
            case 0:
                PhotoViewer photoViewer = this.b;
                if (photoViewer.l3 && photoViewer.P3 && !ApplicationLoader.mainInterfacePaused) {
                    org.telegram.ui.ActionBar.u0 u0Var = this.b.o0;
                    if (u0Var == null || !u0Var.t()) {
                        org.telegram.ui.ActionBar.u0 u0Var2 = this.b.p0;
                        if (u0Var2 == null || !u0Var2.t()) {
                            kt0 kt0Var = this.b.T1;
                            if (kt0Var == null || kt0Var.getScrollY() == 0) {
                                kd kdVar = this.b.X0;
                                if (kdVar == null || kdVar.getVisibility() != 0) {
                                    PhotoViewer photoViewer2 = PhotoViewer.b9;
                                    PhotoViewer photoViewer3 = this.b;
                                    if (photoViewer2 != photoViewer3) {
                                        photoViewer3.l3(false, true);
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
                if (photoViewer4.F2 != null || ((rt0Var = photoViewer4.f0) != null && rt0Var.x)) {
                    if (!photoViewer4.r1) {
                        float p12 = photoViewer4.p1() / this.b.B1();
                        if (this.b.h5) {
                            f7 = 1.0f;
                        } else {
                            long elapsedRealtime = SystemClock.elapsedRealtime();
                            if (Math.abs(elapsedRealtime - this.b.S3) >= 500) {
                                PhotoViewer photoViewer5 = this.b;
                                rt0 rt0Var2 = photoViewer5.f0;
                                if (rt0Var2 != null && rt0Var2.x) {
                                    f7 = rt0Var2.getBufferedPosition();
                                } else if (photoViewer5.Q3) {
                                    FileLoader fileLoader = FileLoader.getInstance(photoViewer5.T);
                                    PhotoViewer photoViewer6 = this.b;
                                    float f10 = photoViewer6.a3;
                                    if (f10 == 0.0f) {
                                        f10 = p12;
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
                                org.telegram.ui.Cells.g1 g1Var = photoViewer8.a4;
                                if (g1Var.rewindCount == 0 || (!g1Var.rewindByBackSeek && !photoViewer8.c4.rewindByBackSeek)) {
                                    photoViewer8.q3.h(p12, false);
                                }
                            }
                            if (f7 != -1.0f) {
                                this.b.q3.f(f7);
                                org.telegram.ui.Components.dh0 dh0Var = org.telegram.ui.Components.dh0.p0;
                                if (f7 > dh0Var.a0) {
                                    dh0Var.a0 = f7;
                                    ci.h3 h3Var = dh0Var.b0;
                                    if (h3Var != null) {
                                        h3Var.invalidate();
                                    }
                                }
                            }
                        } else if (p12 >= this.b.S7.getRightProgress()) {
                            PhotoViewer photoViewer9 = this.b;
                            photoViewer9.H2 = false;
                            photoViewer9.j2();
                            this.b.q3.h(0.0f, false);
                            this.b.v2((int) (r1.S7.getLeftProgress() * this.b.B1()));
                            this.b.e0.invalidate();
                        } else {
                            float leftProgress = p12 - this.b.S7.getLeftProgress();
                            if (leftProgress < 0.0f) {
                                leftProgress = 0.0f;
                            }
                            p12 = leftProgress / (this.b.S7.getRightProgress() - this.b.S7.getLeftProgress());
                            if (p12 > 1.0f) {
                                p12 = 1.0f;
                            }
                            this.b.q3.h(p12, false);
                        }
                        this.b.r3.invalidate();
                        if (this.b.b3 != null && p12 >= 0.0f) {
                            long elapsedRealtime2 = SystemClock.elapsedRealtime();
                            PhotoViewer photoViewer10 = this.b;
                            if (elapsedRealtime2 - photoViewer10.d3 >= 1000) {
                                String str = photoViewer10.b3;
                                photoViewer10.d3 = SystemClock.elapsedRealtime();
                                MessageObject messageObject = this.b.T4;
                                if (messageObject != null) {
                                    messageObject.cachedSavedTimestamp = Float.valueOf(p12);
                                }
                                Utilities.globalQueue.postRunnable(new b0(str, p12, 4));
                            }
                        }
                        this.b.E3();
                    } else if (!photoViewer4.S7.r) {
                        float p13 = photoViewer4.p1() / this.b.B1();
                        PhotoViewer photoViewer11 = this.b;
                        if (photoViewer11.B8 || (photoViewer11.u4 == 0 && photoViewer11.R7.getVisibility() != 0)) {
                            PhotoViewer photoViewer12 = this.b;
                            if (photoViewer12.c2 != 1) {
                                photoViewer12.S7.setProgress(p13);
                            }
                        } else if (p13 >= this.b.S7.getRightProgress()) {
                            hs0 hs0Var = this.b.S7;
                            hs0Var.setProgress(hs0Var.getLeftProgress());
                            this.b.F2.K((int) (r0.S7.getLeftProgress() * this.b.B1()));
                            PhotoViewer photoViewer13 = this.b;
                            photoViewer13.H2 = false;
                            photoViewer13.v0();
                            PhotoViewer photoViewer14 = this.b;
                            if (photoViewer14.r || photoViewer14.c2 == 1 || photoViewer14.u4 != 0 || photoViewer14.o6 > 0) {
                                photoViewer14.l2();
                            } else {
                                photoViewer14.j2();
                            }
                            this.b.e0.invalidate();
                        } else {
                            this.b.S7.setProgress(p13);
                        }
                        this.b.E3();
                    }
                }
                du0 du0Var = this.b.E2;
                if (du0Var != null) {
                    du0.a(du0Var);
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
                    ah.v vVar = new ah.v(activity, 25);
                    ImageReceiver imageReceiver = new ImageReceiver(vVar);
                    vVar.b = imageReceiver;
                    TextureView textureView = new TextureView(activity);
                    vVar.c = textureView;
                    vVar.addView(textureView);
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
                                AndroidUtilities.getBitmapFromSurface(photoViewer16.C2, createBitmap, new bh0(26, this, vVar));
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
                    photoViewer16.w3 = (TextureView) vVar.c;
                    if (org.telegram.ui.Components.dh0.x(false, photoViewer16.y, null, vVar, photoViewer16.U, photoViewer16.V, photoViewer16.K3)) {
                        org.telegram.ui.Components.dh0.w(photoViewer16);
                    }
                    photoViewer16.K3 = true;
                    if (!photoViewer16.D2) {
                        photoViewer16.w3.setVisibility(4);
                        bt0 bt0Var = photoViewer16.y2;
                        if (bt0Var != null) {
                            bt0Var.removeView(photoViewer16.B2);
                            photoViewer16.y2.removeView(photoViewer16.C2);
                            break;
                        }
                    } else {
                        bt0 bt0Var2 = photoViewer16.y2;
                        if (bt0Var2 != null) {
                            bt0Var2.removeView(photoViewer16.B2);
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
