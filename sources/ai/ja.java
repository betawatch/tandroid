package ai;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.view.View;
import android.widget.TextView;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.bd;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.f30;
import org.telegram.ui.Components.hs;
import org.telegram.ui.Components.l11;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public abstract class ja {
    public static f30 b;
    public static f30 c;
    public static f30 d;
    public static Paint e;
    public static RectF f;
    public static Paint g;
    public static Paint h;
    public static l11 i;
    public static int j;
    public static BitmapDrawable m;
    public static final f30[] a = new f30[2];
    public static final Paint[] k = new Paint[2];
    public static final int[] l = new int[2];
    public static final RectF n = new RectF();
    public static final aa o = new aa(0);
    public static final RectF p = new RectF();
    public static final Path q = new Path();
    public static final Matrix r = new Matrix();
    public static final PathMeasure s = new PathMeasure();
    public static final Path t = new Path();

    public static void a(org.telegram.ui.ActionBar.j5 j5Var) {
        String string = LocaleController.getString(R.string.UploadingStory);
        if (string.indexOf("…") <= 0) {
            j5Var.l(string, false);
            return;
        }
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(string);
        qc qcVar = new qc();
        valueOf.setSpan(qcVar, valueOf.length() - 1, valueOf.length(), 0);
        qcVar.a = j5Var;
        qcVar.n = true;
        j5Var.l(valueOf, false);
    }

    public static void b(TL_stories.StoryItem storyItem, TLRPC.User user) {
        if (user == null || storyItem.dialogId != UserConfig.getInstance(UserConfig.selectedAccount).clientUserId || v(storyItem)) {
            return;
        }
        if (storyItem.views == null) {
            storyItem.views = new TL_stories.TL_storyViews();
        }
        TL_stories.StoryViews storyViews = storyItem.views;
        if (storyViews.views_count == 0) {
            storyViews.views_count = 1;
            storyViews.recent_viewers.add(Long.valueOf(user.id));
        }
    }

    public static void c(org.telegram.ui.ActionBar.e6 e6Var) {
        if (e == null) {
            Paint paint = new Paint(1);
            e = paint;
            paint.setStyle(Paint.Style.STROKE);
            e.setStrokeWidth(AndroidUtilities.dpf2(1.3f));
            e.setStrokeCap(Paint.Cap.ROUND);
        }
        int w02 = org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.d6, e6Var);
        if (j != w02) {
            j = w02;
            float computePerceivedBrightness = AndroidUtilities.computePerceivedBrightness(w02);
            if (computePerceivedBrightness >= 0.721f) {
                e.setColor(i0.a.d(0.2f, w02, -16777216));
            } else if (computePerceivedBrightness < 0.25f) {
                e.setColor(i0.a.d(0.2f, w02, -1));
            } else {
                e.setColor(i0.a.d(0.44f, w02, -1));
            }
        }
    }

    public static void d(org.telegram.ui.ActionBar.e6 e6Var, boolean z10) {
        Paint[] paintArr = k;
        if (paintArr[z10 ? 1 : 0] == null) {
            Paint paint = new Paint(1);
            paintArr[z10 ? 1 : 0] = paint;
            paint.setStyle(Paint.Style.STROKE);
            paintArr[z10 ? 1 : 0].setStrokeWidth(AndroidUtilities.dpf2(1.3f));
            paintArr[z10 ? 1 : 0].setStrokeCap(Paint.Cap.ROUND);
        }
        int w02 = org.telegram.ui.ActionBar.i6.w0(!z10 ? org.telegram.ui.ActionBar.i6.s8 : org.telegram.ui.ActionBar.i6.M8, e6Var);
        int[] iArr = l;
        if (iArr[z10 ? 1 : 0] != w02) {
            iArr[z10 ? 1 : 0] = w02;
            float computePerceivedBrightness = AndroidUtilities.computePerceivedBrightness(w02);
            if (computePerceivedBrightness >= 0.721f) {
                paintArr[z10 ? 1 : 0].setColor(i0.a.d(0.2f, w02, -16777216));
            } else if (computePerceivedBrightness < 0.25f) {
                paintArr[z10 ? 1 : 0].setColor(i0.a.d(0.2f, w02, -1));
            } else {
                paintArr[z10 ? 1 : 0].setColor(i0.a.d(0.44f, w02, -1));
            }
        }
    }

    public static SpannableStringBuilder e(int i10, boolean z10, Object... objArr) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) "d ").append((CharSequence) LocaleController.formatString(i10, objArr));
        er erVar = new er(R.drawable.msg_mini_bomb, 0);
        if (z10) {
            erVar.setScale(0.8f, 0.8f);
        } else {
            erVar.setTopOffset(-1);
        }
        spannableStringBuilder.setSpan(erVar, 0, 1, 0);
        return spannableStringBuilder;
    }

    public static SpannableStringBuilder f() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) "d ").append((CharSequence) LocaleController.getString(R.string.Story));
        spannableStringBuilder.setSpan(new er(R.drawable.msg_mini_replystory2, 0), 0, 1, 0);
        return spannableStringBuilder;
    }

    public static void g(Canvas canvas, RectF rectF, Paint paint, float f7, float f10, float f11, float f12) {
        float f13;
        boolean z10;
        float f14 = f10 - f7;
        if (f7 >= f11 || f10 >= f11 + f14) {
            f13 = f7;
            z10 = false;
        } else {
            f13 = f7;
            canvas.drawArc(rectF, f13, Math.min(f10, f11) - f7, false, paint);
            z10 = true;
        }
        float max = Math.max(f13, f12);
        float min = Math.min(f10, f11 + 360.0f);
        if (min >= max) {
            canvas.drawArc(rectF, max, min - max, false, paint);
        } else {
            if (z10) {
                return;
            }
            if (f13 <= f11 || f10 >= f12) {
                canvas.drawArc(rectF, f13, f14, false, paint);
            }
        }
    }

    public static void h(long j3, Canvas canvas, ImageReceiver imageReceiver, da daVar) {
        i(j3, canvas, imageReceiver, UserConfig.getInstance(UserConfig.selectedAccount).getClientUserId() != j3 && MessagesController.getInstance(UserConfig.selectedAccount).getStoriesController().I(j3), daVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:198:0x0463, code lost:
    
        if (r1 == 1) goto L237;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x026b, code lost:
    
        if (r35.B == 1.0f) goto L143;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:153:0x04f6  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x04fd  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0519  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0539  */
    /* JADX WARN: Removed duplicated region for block: B:168:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:169:0x04f8  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0472  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x04a8  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x04cf A[LOOP:0: B:185:0x04cb->B:187:0x04cf, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:190:0x04b6  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0486  */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4, types: [int] */
    /* JADX WARN: Type inference failed for: r9v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void i(long j3, Canvas canvas, ImageReceiver imageReceiver, boolean z10, da daVar) {
        int r10;
        int i10;
        float lerp;
        float f7;
        Canvas canvas2;
        int i11;
        m9 m9Var;
        float f10;
        float f11;
        float f12;
        int i12;
        RectF rectF;
        int i13;
        float f13;
        ImageReceiver imageReceiver2;
        da daVar2;
        boolean z11;
        float f14;
        m9 m9Var2;
        ImageReceiver imageReceiver3;
        da daVar3;
        boolean z12;
        boolean z13;
        RectF rectF2;
        float f15;
        Paint paint;
        Paint paint2;
        Paint paint3;
        Paint paint4;
        float dpf2;
        float f16;
        float f17;
        float y3;
        ?? r92;
        Paint paint5;
        Paint paint6;
        Paint paint7;
        Paint paint8;
        float dpf22;
        float f18;
        float y10;
        f30 f30Var;
        float y11;
        m9 storiesController = MessagesController.getInstance(UserConfig.selectedAccount).getStoriesController();
        boolean z14 = daVar.b;
        RectF rectF3 = daVar.F;
        boolean z15 = daVar.E;
        if (daVar.x != j3) {
            daVar.x = j3;
            daVar.g();
            z14 = false;
        }
        boolean z16 = storiesController.j.get(j3, 0) == 1;
        boolean z17 = ChatObject.isForum(UserConfig.selectedAccount, j3) && !daVar.D;
        boolean z18 = daVar.r ? !storiesController.h.isEmpty() : z10;
        if (daVar.d != null) {
            storiesController.D(daVar.c, j3);
            z16 = false;
        }
        if (z16) {
            if (storiesController.I(j3)) {
                r10 = 3;
                z14 = false;
                i10 = 2;
            } else {
                i10 = r(storiesController, j3);
                r10 = 3;
                z14 = false;
            }
        } else if (!z18) {
            r10 = r(storiesController, j3);
            i10 = r10;
        } else if (daVar.a) {
            r10 = 2;
            i10 = 2;
        } else {
            int D = storiesController.D(daVar.c, j3);
            i10 = D;
            r10 = D == 0 ? 2 : 1;
        }
        int i14 = daVar.z;
        if (i14 != 0) {
            r10 = i14;
            i10 = r10;
        }
        int i15 = daVar.y;
        if (i15 != r10) {
            if (i15 == 3) {
                z14 = true;
            }
            if (r10 == 3) {
                daVar.q = i10;
                daVar.t = 0.0f;
            }
            if (z14) {
                daVar.A = i15;
                daVar.y = r10;
                daVar.B = 0.0f;
            } else {
                daVar.y = r10;
                daVar.B = 1.0f;
            }
        }
        bd bdVar = daVar.H;
        float a2 = bdVar != null ? bdVar.a(0.08f) : 1.0f;
        if (daVar.C != z16 && z16) {
            daVar.K = 1.0f;
            daVar.L = false;
        }
        daVar.C = z16;
        if (daVar.y == 0 && daVar.B == 1.0f) {
            imageReceiver.setImageCoords(rectF3);
            canvas.save();
            canvas.scale(a2, a2, rectF3.centerX(), rectF3.centerY());
            imageReceiver.draw(canvas);
            canvas.restore();
            return;
        }
        int save = canvas.save();
        if (a2 != 1.0f) {
            canvas.scale(a2, a2, rectF3.centerX(), rectF3.centerY());
        }
        float f19 = storiesController.F(daVar.x) ? daVar.e : 0.0f;
        float f20 = daVar.B;
        if (f20 != 1.0f) {
            f20 = hs.f.getInterpolation(f20);
        }
        float f21 = f20;
        if (!z15 || daVar.v) {
            int i16 = daVar.A;
            int i17 = daVar.q;
            if (i16 == 3) {
                i16 = i17;
            }
            int dp = i16 == 2 ? AndroidUtilities.dp(3.0f) : i16 == 1 ? AndroidUtilities.dp(4.0f) : 0;
            int i18 = daVar.y;
            int i19 = daVar.q;
            if (i18 == 3) {
                i18 = i19;
            }
            lerp = AndroidUtilities.lerp(dp, i18 == 2 ? AndroidUtilities.dp(3.0f) : i18 == 1 ? AndroidUtilities.dp(4.0f) : 0, daVar.B);
        } else {
            lerp = 0.0f;
        }
        RectF rectF4 = n;
        if (lerp == 0.0f) {
            imageReceiver.setImageCoords(rectF3);
        } else {
            rectF4.set(rectF3);
            rectF4.inset(lerp, lerp);
            imageReceiver.setImageCoords(rectF4);
        }
        if (f19 > 0.0f) {
            f11 = 1.0f;
            f7 = lerp;
            i12 = i10;
            m9Var = storiesController;
            rectF = rectF4;
            i11 = save;
            f10 = f19;
            i13 = 3;
            f12 = 0.08f;
            canvas2 = canvas;
            canvas2.saveLayerAlpha(rectF4.left - AndroidUtilities.dp(15.0f), rectF4.top - AndroidUtilities.dp(15.0f), rectF4.right + AndroidUtilities.dp(15.0f), rectF4.bottom + AndroidUtilities.dp(15.0f), 255, 31);
        } else {
            f7 = lerp;
            canvas2 = canvas;
            i11 = save;
            m9Var = storiesController;
            f10 = f19;
            f11 = 1.0f;
            f12 = 0.08f;
            i12 = i10;
            rectF = rectF4;
            i13 = 3;
        }
        int i20 = daVar.A;
        f30[] f30VarArr = a;
        if ((i20 == 1 && daVar.B != f11) || daVar.y == 1) {
            if (i12 == 2) {
                o(imageReceiver);
                f30Var = b;
            } else if (i12 == i13) {
                q(imageReceiver);
                f30Var = c;
            } else {
                t(imageReceiver, z15);
                f30Var = f30VarArr[z15 ? 1 : 0];
            }
            boolean z19 = daVar.A == 1 && daVar.B != f11;
            float f22 = (!z15 || daVar.v) ? 0.0f : -AndroidUtilities.dp(4.0f);
            if (z19) {
                y11 = (AndroidUtilities.dp(5.0f) * f21) + f22;
                f30Var.c.setAlpha((int) ((f11 - f21) * daVar.u * 255.0f));
            } else {
                f30Var.c.setAlpha((int) (daVar.u * 255.0f * f21));
                y11 = com.google.android.gms.internal.vision.e2.y(f11, f21, AndroidUtilities.dp(5.0f), f22);
            }
            float f23 = y11 + daVar.G;
            rectF.set(rectF3);
            rectF.inset(f23, f23);
            imageReceiver.getParentView();
            j(canvas2, daVar, f30Var.c, z17);
        }
        int i21 = daVar.A;
        Paint[] paintArr = k;
        if (i21 == 2) {
            f13 = 1.0f;
        } else {
            f13 = 1.0f;
        }
        if (daVar.y != 2) {
            imageReceiver2 = imageReceiver;
            daVar2 = daVar;
            z11 = z17;
            f14 = 2.7f;
            m9Var2 = m9Var;
            if ((daVar2.A == i13 || daVar2.B == 1.0f) && daVar2.y != i13) {
                imageReceiver3 = imageReceiver2;
                daVar3 = daVar2;
            } else {
                if (daVar2.q == 1) {
                    t(imageReceiver2, z15);
                    paint = f30VarArr[z15 ? 1 : 0].c;
                } else if (z15) {
                    d(daVar2.J, daVar2.o);
                    paint = paintArr[daVar2.o ? 1 : 0];
                } else {
                    c(daVar2.J);
                    paint = e;
                }
                paint.setAlpha((int) (f21 * 255.0f));
                if (daVar2.a) {
                    paint2 = t(imageReceiver2, z15);
                    paint2.setAlpha((int) (daVar2.u * 255.0f));
                    Paint o9 = o(imageReceiver2);
                    o9.setAlpha((int) (daVar2.u * 255.0f));
                    Paint q6 = q(imageReceiver2);
                    q6.setAlpha((int) (daVar2.u * 255.0f));
                    c(daVar2.J);
                    paint4 = o9;
                    paint3 = q6;
                } else {
                    paint2 = null;
                    paint3 = null;
                    paint4 = null;
                }
                if (daVar2.a) {
                    if (z15 && !daVar2.v) {
                        dpf2 = AndroidUtilities.dpf2(3.5f);
                        f16 = -dpf2;
                    }
                    f16 = 0.0f;
                } else {
                    if (z15 && !daVar2.v) {
                        dpf2 = AndroidUtilities.dpf2(f14);
                        f16 = -dpf2;
                    }
                    f16 = 0.0f;
                }
                if (daVar2.A != i13 || daVar2.B == 1.0f) {
                    paint.setAlpha((int) (daVar2.u * 255.0f * f21));
                    f17 = 1.0f;
                    y3 = com.google.android.gms.internal.vision.e2.y(1.0f, f21, AndroidUtilities.dp(5.0f), f16);
                } else {
                    y3 = (AndroidUtilities.dp(7.0f) * f21) + f16;
                    paint.setAlpha((int) ((1.0f - f21) * daVar2.u * 255.0f));
                    f17 = 1.0f;
                }
                float f24 = y3 + daVar2.G;
                rectF.set(rectF3);
                rectF.inset(f24, f24);
                boolean z20 = daVar2.a;
                if (z20 && daVar2.y == i13) {
                    float f25 = daVar2.t;
                    if (f25 != f17) {
                        float f26 = f25 + f12;
                        daVar2.t = f26;
                        if (f26 > f17) {
                            daVar2.t = f17;
                        }
                        float f27 = daVar2.e;
                        daVar2.e = f17 - daVar2.t;
                        m(canvas2, m9Var2, imageReceiver2, daVar2, paint, paint2, paint3, paint4, z11);
                        imageReceiver3 = imageReceiver2;
                        daVar3 = daVar2;
                        daVar3.e = f27;
                        if (imageReceiver3.getParentView() != null) {
                            imageReceiver3.invalidate();
                            imageReceiver3.getParentView().invalidate();
                        }
                        canvas2 = canvas;
                    }
                }
                daVar3 = daVar2;
                Paint paint9 = paint4;
                imageReceiver3 = imageReceiver2;
                if (z20) {
                    int D2 = m9Var2.D(0, daVar3.x);
                    if (D2 == 2) {
                        paint2 = paint9;
                    } else if (D2 == i13) {
                        paint2 = paint3;
                    }
                    View parentView = imageReceiver3.getParentView();
                    if (daVar3.L) {
                        z13 = false;
                        float f28 = daVar3.K - 0.016f;
                        daVar3.K = f28;
                        if (f28 < 0.0f) {
                            daVar3.K = 0.0f;
                            z12 = true;
                            daVar3.L = true;
                            daVar3.M += 1.152f;
                            parentView.invalidate();
                            if (daVar3.L) {
                                rectF2 = rectF;
                                canvas.drawArc(rectF2, daVar3.M, daVar3.K * 360.0f, false, paint2);
                            } else {
                                rectF2 = rectF;
                                canvas.drawArc(rectF2, daVar3.M + 360.0f, daVar3.K * (-360.0f), false, paint2);
                            }
                            for (r92 = z13; r92 < 16; r92++) {
                                float f29 = (((float) r92) * 22.5f) + 10.0f;
                                canvas.drawArc(rectF2, daVar3.M + f29, ((22.5f + f29) - 10.0f) - f29, false, paint2);
                            }
                            canvas2 = canvas;
                            imageReceiver3.draw(canvas2);
                            daVar3.w = f10 > 0.5f ? z12 : z13;
                            if (f19 > 0.0f) {
                                float f30 = f7 + daVar3.G;
                                rectF2.set(rectF3);
                                rectF2.inset(f30, f30);
                                k(canvas2, rectF2, f10, imageReceiver3.getVisible(), 0.0f);
                            }
                            f15 = daVar3.B;
                            if (f15 != 1.0f) {
                                float f31 = (AndroidUtilities.screenRefreshTime / 250.0f) + f15;
                                daVar3.B = f31;
                                if (f31 > 1.0f) {
                                    daVar3.B = 1.0f;
                                }
                                if (imageReceiver3.getParentView() != null) {
                                    imageReceiver3.invalidate();
                                    imageReceiver3.getParentView().invalidate();
                                }
                            }
                            if (i11 != 0) {
                                canvas2.restoreToCount(i11);
                                return;
                            }
                            return;
                        }
                    } else {
                        float f32 = daVar3.K + 0.016f;
                        daVar3.K = f32;
                        if (f32 >= 1.0f) {
                            daVar3.K = 1.0f;
                            z13 = false;
                            daVar3.L = false;
                        } else {
                            z13 = false;
                        }
                    }
                    z12 = true;
                    daVar3.M += 1.152f;
                    parentView.invalidate();
                    if (daVar3.L) {
                    }
                    while (r92 < 16) {
                    }
                    canvas2 = canvas;
                    imageReceiver3.draw(canvas2);
                    daVar3.w = f10 > 0.5f ? z12 : z13;
                    if (f19 > 0.0f) {
                    }
                    f15 = daVar3.B;
                    if (f15 != 1.0f) {
                    }
                    if (i11 != 0) {
                    }
                }
                paint2 = paint;
                View parentView2 = imageReceiver3.getParentView();
                if (daVar3.L) {
                }
                z12 = true;
                daVar3.M += 1.152f;
                parentView2.invalidate();
                if (daVar3.L) {
                }
                while (r92 < 16) {
                }
                canvas2 = canvas;
                imageReceiver3.draw(canvas2);
                daVar3.w = f10 > 0.5f ? z12 : z13;
                if (f19 > 0.0f) {
                }
                f15 = daVar3.B;
                if (f15 != 1.0f) {
                }
                if (i11 != 0) {
                }
            }
            rectF2 = rectF;
            z13 = false;
            z12 = true;
            imageReceiver3.draw(canvas2);
            daVar3.w = f10 > 0.5f ? z12 : z13;
            if (f19 > 0.0f) {
            }
            f15 = daVar3.B;
            if (f15 != 1.0f) {
            }
            if (i11 != 0) {
            }
        }
        boolean z21 = i21 == 2 && daVar.B != f13;
        if (z15) {
            d(daVar.J, daVar.o);
            paint5 = paintArr[daVar.o ? 1 : 0];
        } else {
            c(daVar.J);
            paint5 = e;
        }
        Paint paint10 = paint5;
        if (daVar.a) {
            Paint t10 = t(imageReceiver, z15);
            t10.setAlpha((int) (daVar.u * 255.0f));
            paint6 = o(imageReceiver);
            paint6.setAlpha((int) (daVar.u * 255.0f));
            Paint q10 = q(imageReceiver);
            q10.setAlpha((int) (daVar.u * 255.0f));
            c(daVar.J);
            paint8 = q10;
            paint7 = t10;
        } else {
            paint6 = null;
            paint7 = null;
            paint8 = null;
        }
        if (daVar.a) {
            if (z15 && !daVar.v) {
                dpf22 = AndroidUtilities.dpf2(3.5f);
                f18 = -dpf22;
            }
            f18 = 0.0f;
        } else {
            if (z15 && !daVar.v) {
                dpf22 = AndroidUtilities.dpf2(2.7f);
                f18 = -dpf22;
            }
            f18 = 0.0f;
        }
        if (z21) {
            y10 = (AndroidUtilities.dp(5.0f) * f21) + f18;
            paint10.setAlpha((int) (daVar.u * 255.0f * (1.0f - f21)));
            f14 = 2.7f;
        } else {
            paint10.setAlpha((int) (daVar.u * 255.0f * f21));
            f14 = 2.7f;
            y10 = com.google.android.gms.internal.vision.e2.y(1.0f, f21, AndroidUtilities.dp(5.0f), f18);
        }
        float f33 = y10 + daVar.G;
        rectF.set(rectF3);
        rectF.inset(f33, f33);
        if (daVar.a) {
            imageReceiver2 = imageReceiver;
            m9Var2 = m9Var;
            Paint paint11 = paint6;
            daVar2 = daVar;
            z11 = z17;
            m(canvas2, m9Var2, imageReceiver2, daVar2, paint10, paint7, paint8, paint11, z11);
        } else {
            imageReceiver2 = imageReceiver;
            daVar2 = daVar;
            z11 = z17;
            m9Var2 = m9Var;
            imageReceiver2.getParentView();
            j(canvas2, daVar2, paint10, z11);
        }
        if (daVar2.A == i13) {
        }
        imageReceiver3 = imageReceiver2;
        daVar3 = daVar2;
        rectF2 = rectF;
        z13 = false;
        z12 = true;
        imageReceiver3.draw(canvas2);
        daVar3.w = f10 > 0.5f ? z12 : z13;
        if (f19 > 0.0f) {
        }
        f15 = daVar3.B;
        if (f15 != 1.0f) {
        }
        if (i11 != 0) {
        }
    }

    public static void j(Canvas canvas, da daVar, Paint paint, boolean z10) {
        RectF rectF = n;
        if (z10) {
            RectF rectF2 = p;
            rectF2.set(rectF);
            rectF2.inset(AndroidUtilities.dp(0.5f), AndroidUtilities.dp(0.5f));
            canvas.drawRoundRect(rectF2, AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f), paint);
            return;
        }
        float f7 = daVar.f;
        if (f7 == 0.0f) {
            canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, paint);
        } else {
            canvas.drawArc(rectF, (f7 / 2.0f) + 360.0f, 360.0f - f7, false, paint);
        }
    }

    public static void k(Canvas canvas, RectF rectF, float f7, boolean z10, float f10) {
        Canvas canvas2;
        if (i == null) {
            i = new l11(LocaleController.getString(R.string.LiveStoryBadge), 9.66f, AndroidUtilities.bold());
        }
        if (g == null) {
            Paint paint = new Paint(1);
            g = paint;
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        }
        if (h == null) {
            h = new Paint(1);
        }
        if (f == null) {
            f = new RectF();
        }
        h.setColor(org.telegram.ui.ActionBar.i6.m1(f7, org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.ok, false)));
        float lerp = AndroidUtilities.lerp(AndroidUtilities.dp(4.66f), AndroidUtilities.dp(7.0f), f10);
        float l4 = i.l() + lerp + lerp;
        float lerp2 = AndroidUtilities.lerp(AndroidUtilities.dp(15.0f), AndroidUtilities.dp(18.0f), f10);
        float dp = AndroidUtilities.dp(2.0f);
        canvas.save();
        float f11 = l4 / 2.0f;
        float f12 = 0.8f * lerp2;
        float f13 = lerp2 * 0.2f;
        f.set((rectF.centerX() - f11) - dp, (rectF.bottom - f12) - dp, rectF.centerX() + f11 + dp, rectF.bottom + f13 + dp);
        float lerp3 = AndroidUtilities.lerp(0.7f, 1.0f, f7);
        canvas.scale(lerp3, lerp3, f.centerX(), f.centerY());
        AndroidUtilities.scaleRect(f, f7);
        RectF rectF2 = f;
        canvas.drawRoundRect(rectF2, rectF2.height() / 2.0f, f.height() / 2.0f, g);
        if (z10) {
            f.set(rectF.centerX() - f11, rectF.bottom - f12, rectF.centerX() + f11, rectF.bottom + f13);
            RectF rectF3 = f;
            canvas.drawRoundRect(rectF3, rectF3.height() / 2.0f, f.height() / 2.0f, h);
            l11 l11Var = i;
            RectF rectF4 = f;
            canvas2 = canvas;
            l11Var.c(rectF4.left + lerp, rectF4.centerY(), f7, -1, canvas2);
        } else {
            canvas2 = canvas;
        }
        canvas2.restore();
    }

    public static void l(Canvas canvas, RectF rectF, Paint paint, float f7, float f10, da daVar, boolean z10) {
        if (z10) {
            float height = rectF.height() * 0.32f;
            float f11 = ((((int) f7) / 90) * 90) + 90;
            float f12 = (-199.0f) + f11;
            Path path = q;
            path.rewind();
            path.addRoundRect(rectF, height, height, Path.Direction.CW);
            Matrix matrix = r;
            matrix.reset();
            matrix.postRotate(f11, rectF.centerX(), rectF.centerY());
            path.transform(matrix);
            PathMeasure pathMeasure = s;
            pathMeasure.setPath(path, false);
            float length = pathMeasure.getLength();
            Path path2 = t;
            path2.reset();
            pathMeasure.getSegment(((f7 - f12) / 360.0f) * length, length * ((f10 - f12) / 360.0f), path2, true);
            path2.rLineTo(0.0f, 0.0f);
            canvas.drawPath(path2, paint);
            return;
        }
        if (!daVar.k) {
            if (daVar.l) {
                float f13 = daVar.f;
                g(canvas, rectF, paint, f7, f10, ((-f13) / 2.0f) + 180.0f, (f13 / 2.0f) + 180.0f);
                return;
            } else if (f7 < 90.0f) {
                g(canvas, rectF, paint, f7, f10, daVar.g, daVar.h);
                return;
            } else {
                g(canvas, rectF, paint, f7, f10, -daVar.i, daVar.j);
                return;
            }
        }
        boolean z11 = daVar.m;
        if (!z11 && !daVar.l) {
            if (f7 < 90.0f) {
                float f14 = daVar.f;
                g(canvas, rectF, paint, f7, f10, (-f14) / 2.0f, f14 / 2.0f);
                return;
            } else {
                float f15 = daVar.f;
                g(canvas, rectF, paint, f7, f10, ((-f15) / 2.0f) + 180.0f, (f15 / 2.0f) + 180.0f);
                return;
            }
        }
        if (daVar.l) {
            float f16 = daVar.f;
            g(canvas, rectF, paint, f7, f10, ((-f16) / 2.0f) + 180.0f, (f16 / 2.0f) + 180.0f);
        } else if (!z11) {
            canvas.drawArc(rectF, f7, f10 - f7, false, paint);
        } else {
            float f17 = daVar.f;
            g(canvas, rectF, paint, f7, f10, (-f17) / 2.0f, f17 / 2.0f);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:90:0x01a4, code lost:
    
        if (r4 == 1) goto L112;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m(Canvas canvas, m9 m9Var, ImageReceiver imageReceiver, da daVar, Paint paint, Paint paint2, Paint paint3, Paint paint4, boolean z10) {
        Paint paint5;
        RectF rectF;
        int max;
        char c10;
        Paint paint6;
        da daVar2 = daVar;
        org.telegram.ui.ActionBar.e6 e6Var = daVar2.J;
        boolean z11 = daVar2.E;
        c(e6Var);
        d(daVar2.J, daVar2.o);
        long j3 = daVar2.s;
        int i10 = 0;
        int D = j3 != 0 ? m9Var.D(0, j3) : m9Var.D(0, daVar2.x);
        int i11 = 2;
        daVar2.n = D == 0 ? 2 : 1;
        TL_stories.PeerStories y3 = m9Var.y(daVar2.x);
        ArrayList arrayList = m9Var.h;
        if (y3 == null) {
            y3 = m9Var.z(daVar2.x);
        }
        TL_stories.PeerStories peerStories = y3;
        int size = daVar2.r ? arrayList.size() : (peerStories == null || peerStories.stories.size() == 1) ? 1 : peerStories.stories.size();
        Paint[] paintArr = k;
        if (D == 2) {
            o(imageReceiver);
            paint5 = b.c;
        } else if (D == 3) {
            q(imageReceiver);
            paint5 = c.c;
        } else if (D == 1) {
            t(imageReceiver, z11);
            paint5 = a[z11 ? 1 : 0].c;
        } else {
            paint5 = z11 ? paintArr[daVar2.o ? 1 : 0] : e;
        }
        Paint paint7 = paint5;
        RectF rectF2 = n;
        if (size <= 1) {
            long j10 = daVar2.x;
            TL_stories.PeerStories peerStories2 = (TL_stories.PeerStories) m9Var.i.f(j10);
            if (peerStories2 == null) {
                peerStories2 = m9Var.z(j10);
            }
            if (peerStories2 != null) {
                if (j10 != UserConfig.getInstance(m9Var.a).getClientUserId() || Utilities.isNullOrEmpty((Collection) m9Var.b.f(j10))) {
                    int i12 = 0;
                    while (true) {
                        if (i12 >= peerStories2.stories.size()) {
                            break;
                        }
                        TL_stories.StoryItem storyItem = peerStories2.stories.get(i12);
                        if (storyItem != null) {
                            if (storyItem.media instanceof TLRPC.TL_messageMediaVideoStream) {
                                i10 = 2;
                                break;
                            } else if (storyItem.id > peerStories2.max_read_id) {
                                break;
                            }
                        }
                        i12++;
                    }
                }
                i10 = 1;
            }
            Paint paint8 = i10 == 2 ? paint3 : paint7 == b.c ? paint4 : i10 == 1 ? paint2 : paint;
            l(canvas, rectF2, paint8, -90.0f, 90.0f, daVar2, z10);
            l(canvas, rectF2, paint8, 90.0f, 270.0f, daVar, z10);
            float f7 = daVar.e;
            if (f7 == 1.0f || paint8 == paint7) {
                return;
            }
            paint7.setAlpha((int) ((1.0f - f7) * 255.0f));
            l(canvas, rectF2, paint7, -90.0f, 90.0f, daVar, z10);
            l(canvas, rectF2, paint7, 90.0f, 270.0f, daVar, z10);
            paint7.setAlpha(255);
            return;
        }
        Paint paint9 = paint7;
        float f10 = 360.0f / size;
        float f11 = (size > 20 ? 3 : 5) * daVar2.e;
        if (f11 > f10) {
            f11 = 0.0f;
        }
        float f12 = f11;
        if (daVar2.r) {
            rectF = rectF2;
            max = 0;
        } else {
            rectF = rectF2;
            max = Math.max(peerStories.max_read_id, m9Var.f.get(daVar2.x, 0));
        }
        int i13 = 0;
        while (i13 < size) {
            Paint paint10 = z11 ? paintArr[daVar2.o ? 1 : 0] : e;
            if (daVar2.r) {
                int D2 = m9Var.D(i10, DialogObject.getPeerDialogId(((TL_stories.PeerStories) arrayList.get((size - 1) - i13)).peer));
                if (D2 == i11) {
                    paint10 = paint4;
                    c10 = 3;
                } else {
                    c10 = 3;
                    if (D2 != 3) {
                    }
                    paint10 = paint3;
                }
            } else {
                c10 = 3;
                if (i13 < peerStories.stories.size()) {
                    if (peerStories.stories.get(i13).justUploaded || peerStories.stories.get(i13).id > max) {
                        if (!(peerStories.stories.get(i13).media instanceof TLRPC.TL_messageMediaVideoStream)) {
                            if (peerStories.stories.get(i13).close_friends) {
                                paint10 = paint4;
                            }
                        }
                        paint10 = paint3;
                    }
                }
                paint10 = paint2;
            }
            float f13 = (i13 * f10) - 90.0f;
            float f14 = f13 + f10;
            float f15 = f13 + f12;
            float f16 = f14 - f12;
            Paint paint11 = paint9;
            int i14 = max;
            int i15 = i13;
            Paint paint12 = paint10;
            RectF rectF3 = rectF;
            l(canvas, rectF3, paint12, f15, f16, daVar, z10);
            RectF rectF4 = rectF3;
            if (daVar.e == 1.0f || paint12 == paint11) {
                paint6 = paint11;
            } else {
                paint11.getStrokeWidth();
                paint11.setAlpha((int) ((1.0f - daVar.e) * 255.0f));
                l(canvas, rectF4, paint11, f15, f16, daVar, z10);
                rectF4 = rectF4;
                paint6 = paint11;
                paint6.setAlpha(255);
            }
            i13 = i15 + 1;
            daVar2 = daVar;
            rectF = rectF4;
            paint9 = paint6;
            max = i14;
            i10 = 0;
            i11 = 2;
        }
    }

    public static ea n(TL_stories.PeerStories peerStories, Runnable runnable) {
        TL_stories.StoryItem storyItem;
        ArrayList<TLRPC.PhotoSize> arrayList;
        ArrayList<TLRPC.PhotoSize> arrayList2;
        TLRPC.Document document;
        if (peerStories == null || peerStories.stories.isEmpty() || DialogObject.getPeerDialogId(peerStories.peer) == UserConfig.getInstance(UserConfig.selectedAccount).clientUserId) {
            runnable.run();
            return null;
        }
        m9 m9Var = MessagesController.getInstance(UserConfig.selectedAccount).storiesController;
        int i10 = m9Var.f.get(DialogObject.getPeerDialogId(peerStories.peer));
        int i11 = 0;
        while (true) {
            if (i11 >= peerStories.stories.size()) {
                storyItem = null;
                break;
            }
            if (peerStories.stories.get(i11).id > i10) {
                storyItem = peerStories.stories.get(i11);
                break;
            }
            i11++;
        }
        if (storyItem == null) {
            storyItem = peerStories.stories.get(0);
        }
        TL_stories.StoryItem storyItem2 = storyItem;
        TLRPC.MessageMedia messageMedia = storyItem2.media;
        if (messageMedia == null || messageMedia.document == null) {
            TLRPC.Photo photo = messageMedia != null ? messageMedia.photo : null;
            if (photo == null || (arrayList = photo.sizes) == null) {
                runnable.run();
                return null;
            }
            File pathToAttach = FileLoader.getInstance(UserConfig.selectedAccount).getPathToAttach(FileLoader.getClosestPhotoSizeWithSize(arrayList, ConnectionsManager.DEFAULT_DATACENTER_ID), "", false);
            if (pathToAttach != null && pathToAttach.exists()) {
                runnable.run();
                return null;
            }
        } else {
            File pathToAttach2 = FileLoader.getInstance(UserConfig.selectedAccount).getPathToAttach(storyItem2.media.document, "", false);
            if (pathToAttach2 != null && pathToAttach2.exists()) {
                runnable.run();
                return null;
            }
            File pathToAttach3 = FileLoader.getInstance(UserConfig.selectedAccount).getPathToAttach(storyItem2.media.document, "", true);
            if (pathToAttach3 != null) {
                try {
                    int lastIndexOf = pathToAttach3.getName().lastIndexOf(".");
                    if (lastIndexOf > 0) {
                        File file = new File(pathToAttach3.getParentFile(), pathToAttach3.getName().substring(0, lastIndexOf) + ".temp");
                        if (file.exists() && file.length() > 0) {
                            runnable.run();
                            return null;
                        }
                    }
                } catch (Exception unused) {
                }
            }
        }
        long peerDialogId = DialogObject.getPeerDialogId(peerStories.peer);
        ea eaVar = new ea();
        eaVar.b = false;
        eaVar.a = peerDialogId;
        eaVar.c = m9Var;
        eaVar.d = new a1.f(28, eaVar, runnable);
        Runnable[] runnableArr = {r2};
        a1.f fVar = new a1.f(29, runnableArr, eaVar);
        AndroidUtilities.runOnUIThread(fVar, 3000L);
        ba baVar = new ba(runnableArr, eaVar);
        eaVar.e = baVar;
        baVar.setAllowLoadingOnAttachedOnly(true);
        ((ba) eaVar.e).onAttachedToWindow();
        String s10 = s();
        TLRPC.MessageMedia messageMedia2 = storyItem2.media;
        if (messageMedia2 == null || (document = messageMedia2.document) == null) {
            TLRPC.Photo photo2 = messageMedia2 != null ? messageMedia2.photo : null;
            if (photo2 == null || (arrayList2 = photo2.sizes) == null) {
                ((a1.f) eaVar.d).run();
                return null;
            }
            ((ba) eaVar.e).setImage(null, null, ImageLocation.getForPhoto(FileLoader.getClosestPhotoSizeWithSize(arrayList2, ConnectionsManager.DEFAULT_DATACENTER_ID), photo2), s10, null, null, null, 0L, null, storyItem2, 0);
        } else {
            ((ba) eaVar.e).setImage(ImageLocation.getForDocument(document), sc.v.v(s10, "_pframe"), null, null, null, 0L, null, storyItem2, 0);
        }
        return eaVar;
    }

    public static Paint o(ImageReceiver imageReceiver) {
        if (b == null) {
            f30 f30Var = new f30();
            b = f30Var;
            f30Var.a = true;
            f30Var.b = true;
            f30Var.d(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.lk, false), org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.mk, false), 0, 0);
            b.c.setStrokeWidth(AndroidUtilities.dpf2(2.0f));
            b.c.setStyle(Paint.Style.STROKE);
            b.c.setStrokeCap(Paint.Cap.ROUND);
        }
        b.b(imageReceiver.getImageX(), imageReceiver.getImageY(), imageReceiver.getImageX2(), imageReceiver.getImageY2());
        return b.c;
    }

    public static Drawable p() {
        if (m == null) {
            Bitmap createBitmap = Bitmap.createBitmap(360, 180, Bitmap.Config.ARGB_8888);
            createBitmap.eraseColor(-7829368);
            Canvas canvas = new Canvas(createBitmap);
            TextPaint textPaint = new TextPaint(1);
            textPaint.setTextSize(15.0f);
            textPaint.setTextAlign(Paint.Align.CENTER);
            textPaint.setColor(i0.a.k(-16777216, 100));
            canvas.drawText("expired", 180.0f, 86.0f, textPaint);
            canvas.drawText("story", 180.0f, 106.0f, textPaint);
            m = new BitmapDrawable(createBitmap);
        }
        return m;
    }

    public static Paint q(ImageReceiver imageReceiver) {
        if (c == null) {
            f30 f30Var = new f30();
            c = f30Var;
            f30Var.a = true;
            f30Var.b = true;
            f30Var.d(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.nk, false), org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.ok, false), 0, 0);
            c.c.setStrokeWidth(AndroidUtilities.dpf2(2.0f));
            c.c.setStyle(Paint.Style.STROKE);
            c.c.setStrokeCap(Paint.Cap.ROUND);
        }
        c.b(imageReceiver.getImageX(), imageReceiver.getImageY(), imageReceiver.getImageX2(), imageReceiver.getImageY2());
        return c.c;
    }

    public static int r(m9 m9Var, long j3) {
        TLRPC.TL_recentStory tL_recentStory;
        TLRPC.TL_recentStory tL_recentStory2;
        if (j3 == 0) {
            return 0;
        }
        if (j3 <= 0) {
            TLRPC.Chat chat = MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(-j3));
            if (chat == null || (tL_recentStory = chat.stories_max_id) == null || tL_recentStory.max_id <= 0 || chat.stories_unavailable) {
                return 0;
            }
            int i10 = m9Var.f.get(j3, 0);
            TLRPC.TL_recentStory tL_recentStory3 = chat.stories_max_id;
            if (tL_recentStory3.live) {
                return 3;
            }
            return tL_recentStory3.max_id > i10 ? 1 : 2;
        }
        TLRPC.User user = MessagesController.getInstance(UserConfig.selectedAccount).getUser(Long.valueOf(j3));
        if (j3 == UserConfig.getInstance(UserConfig.selectedAccount).clientUserId || user == null || (tL_recentStory2 = user.stories_max_id) == null || tL_recentStory2.max_id <= 0 || user.stories_unavailable) {
            return 0;
        }
        int i11 = m9Var.f.get(j3, 0);
        TLRPC.TL_recentStory tL_recentStory4 = user.stories_max_id;
        if (tL_recentStory4.live) {
            return 3;
        }
        return tL_recentStory4.max_id > i11 ? 1 : 2;
    }

    public static String s() {
        int max = (int) (Math.max(AndroidUtilities.getRealScreenSize().x, AndroidUtilities.getRealScreenSize().y) / AndroidUtilities.density);
        return a1.g.l(max, max, "_");
    }

    public static Paint t(ImageReceiver imageReceiver, boolean z10) {
        f30[] f30VarArr = a;
        if (f30VarArr[z10 ? 1 : 0] == null) {
            f30 f30Var = new f30();
            f30VarArr[z10 ? 1 : 0] = f30Var;
            f30Var.a = true;
            f30Var.b = true;
            if (z10) {
                f30Var.d(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.jk, false), org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.kk, false), 0, 0);
            } else {
                f30Var.d(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.hk, false), org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.ik, false), 0, 0);
            }
            f30VarArr[z10 ? 1 : 0].c.setStrokeWidth(AndroidUtilities.dpf2(2.0f));
            f30VarArr[z10 ? 1 : 0].c.setStyle(Paint.Style.STROKE);
            f30VarArr[z10 ? 1 : 0].c.setStrokeCap(Paint.Cap.ROUND);
        }
        f30VarArr[z10 ? 1 : 0].b(imageReceiver.getImageX(), imageReceiver.getImageY(), imageReceiver.getImageX2(), imageReceiver.getImageY2());
        return f30VarArr[z10 ? 1 : 0].c;
    }

    public static CharSequence u(TextView textView, boolean z10) {
        String string = z10 ? LocaleController.getString(R.string.StoryEditing) : LocaleController.getString(R.string.UploadingStory);
        if (string.indexOf("…") <= 0) {
            return string;
        }
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(string);
        qc qcVar = new qc();
        valueOf.setSpan(qcVar, valueOf.length() - 1, valueOf.length(), 0);
        qcVar.a = textView;
        qcVar.n = false;
        return valueOf;
    }

    public static boolean v(TL_stories.StoryItem storyItem) {
        return storyItem != null && ConnectionsManager.getInstance(UserConfig.selectedAccount).getCurrentTime() > storyItem.expire_date + 86400;
    }

    public static boolean w(int i10, TL_stories.StoryItem storyItem) {
        return ConnectionsManager.getInstance(i10).getCurrentTime() > storyItem.expire_date;
    }

    public static void x(ImageReceiver imageReceiver, TL_stories.StoryItem storyItem) {
        ArrayList<TLRPC.PhotoSize> arrayList;
        TLRPC.Document document;
        if (storyItem == null) {
            return;
        }
        TLRPC.MessageMedia messageMedia = storyItem.media;
        if (messageMedia != null && (document = messageMedia.document) != null) {
            imageReceiver.setImage(ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(document.thumbs, ConnectionsManager.DEFAULT_DATACENTER_ID), storyItem.media.document), "320_320", null, null, ImageLoader.createStripedBitmap(storyItem.media.document.thumbs), 0L, null, storyItem, 0);
            imageReceiver.addDecorator(new pc(storyItem));
            return;
        }
        TLRPC.Photo photo = messageMedia != null ? messageMedia.photo : null;
        if (messageMedia instanceof TLRPC.TL_messageMediaUnsupported) {
            Bitmap createBitmap = Bitmap.createBitmap(10, 10, Bitmap.Config.ARGB_8888);
            createBitmap.eraseColor(i0.a.d(0.2f, -16777216, -1));
            imageReceiver.setImageBitmap(createBitmap);
            imageReceiver.addDecorator(new pc(storyItem));
            return;
        }
        if (photo == null || (arrayList = photo.sizes) == null) {
            imageReceiver.clearImage();
        } else {
            imageReceiver.setImage(null, null, ImageLocation.getForPhoto(FileLoader.getClosestPhotoSizeWithSize(arrayList, ConnectionsManager.DEFAULT_DATACENTER_ID), photo), "320_320", null, null, ImageLoader.createStripedBitmap(photo.sizes), 0L, null, storyItem, 0);
            imageReceiver.addDecorator(new pc(storyItem));
        }
    }

    public static void y(ImageReceiver imageReceiver, TL_stories.StoryItem storyItem) {
        ArrayList<TLRPC.PhotoSize> arrayList;
        if (storyItem == null) {
            return;
        }
        TLRPC.MessageMedia messageMedia = storyItem.media;
        TLRPC.Document document = messageMedia.document;
        if (document != null) {
            imageReceiver.setImage(ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(document.thumbs, MediaDataController.MAX_STYLE_RUNS_COUNT), storyItem.media.document), "100_100", null, null, ImageLoader.createStripedBitmap(storyItem.media.document.thumbs), 0L, null, storyItem, 0);
            return;
        }
        TLRPC.Photo photo = messageMedia.photo;
        if (photo == null || (arrayList = photo.sizes) == null) {
            imageReceiver.clearImage();
        } else {
            imageReceiver.setImage(null, null, ImageLocation.getForPhoto(FileLoader.getClosestPhotoSizeWithSize(arrayList, MediaDataController.MAX_STYLE_RUNS_COUNT), photo), "100_100", null, null, ImageLoader.createStripedBitmap(photo.sizes), 0L, null, storyItem, 0);
        }
    }
}
